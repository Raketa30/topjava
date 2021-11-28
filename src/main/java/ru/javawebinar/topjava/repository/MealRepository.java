package ru.javawebinar.topjava.repository;

import ru.javawebinar.topjava.model.Meal;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

public class MealRepository implements CrudRepository<Meal> {
    private final List<Meal> meals = new CopyOnWriteArrayList<>();

    public MealRepository() {
        meals.add(new Meal(1, LocalDateTime.of(2020, Month.JANUARY, 30, 10, 0), "Завтрак", 500));
        meals.add(new Meal(2, LocalDateTime.of(2020, Month.JANUARY, 30, 13, 0), "Обед", 1000));
        meals.add(new Meal(3, LocalDateTime.of(2020, Month.JANUARY, 30, 20, 0), "Ужин", 500));
        meals.add(new Meal(4, LocalDateTime.of(2020, Month.JANUARY, 31, 0, 0), "Еда на граничное значение", 100));
        meals.add(new Meal(5, LocalDateTime.of(2020, Month.JANUARY, 31, 10, 0), "Завтрак", 1000));
        meals.add(new Meal(6, LocalDateTime.of(2020, Month.JANUARY, 31, 13, 0), "Обед", 500));
        meals.add(new Meal(7, LocalDateTime.of(2020, Month.JANUARY, 31, 20, 0), "Ужин", 410));
    }

    @Override
    public boolean save(Meal entity) {
        return meals.add(entity);
    }

    @Override
    public Optional<Meal> findById(int id) {
        return getMealById(id);
    }

    @Override
    public List<Meal> findAll() {
        return new ArrayList<>(meals);
    }

    @Override
    public void deleteById(int id) {
        Optional<Meal> meal = findById(id);
        meal.ifPresent(meals::remove);
    }

    private Optional<Meal> getMealById(int id) {
        return meals.stream().filter(m -> m.getId() == id).findFirst();
    }
}
