package ru.javawebinar.topjava.service;

import ru.javawebinar.topjava.model.Meal;
import ru.javawebinar.topjava.model.MealTo;
import ru.javawebinar.topjava.repository.MealRepository;
import ru.javawebinar.topjava.util.Factory;
import ru.javawebinar.topjava.util.MealsUtil;

import java.util.List;

public class MealService {
    private final MealRepository mealRepository;

    public MealService() {
        this.mealRepository = Factory.mealRepositoryFactory();
    }

    public List<Meal> getMealList() {
        return mealRepository.getMeals();
    }
}
