package ru.javawebinar.topjava.repository;

import java.util.List;
import java.util.Optional;

public interface CrudRepository<T> {
    boolean save(T entity);

    Optional<T> findById(int id);

    List<T> findAll();

    void deleteById(int id);
}
