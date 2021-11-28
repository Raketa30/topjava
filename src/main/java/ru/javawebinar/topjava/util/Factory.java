package ru.javawebinar.topjava.util;

import ru.javawebinar.topjava.repository.MealRepository;
import ru.javawebinar.topjava.service.MealService;

public class Factory {
    private Factory() {
    }

    public static MealService mealServiceFactory() {
        return new MealService();
    }

    public static MealRepository mealRepositoryFactory() {
        return new MealRepository();
    }
}
