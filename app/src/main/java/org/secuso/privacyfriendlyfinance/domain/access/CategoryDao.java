package org.secuso.privacyfriendlyfinance.domain.access;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import org.secuso.privacyfriendlyfinance.domain.model.Category;

import java.util.List;

@Dao
public abstract class CategoryDao extends AbstractDao<Category> {
    @Override
    @Query("SELECT * FROM Category WHERE id=:id")
    public abstract Category get(long id);

    @Query("SELECT * FROM Category WHERE name LIKE :name")
    public abstract Category getByName(String name);

    @Override
    @Query("SELECT * FROM Category")
    public abstract List<Category> getAll();
}
