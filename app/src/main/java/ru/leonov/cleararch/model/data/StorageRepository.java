package ru.leonov.cleararch.model.data;

import android.content.Context;

import ru.leonov.cleararch.model.entities.Settings;
import ru.leonov.cleararch.model.repository.IStorageRepository;

public class StorageRepository implements IStorageRepository {

    private final Storage storage;
    private final Context context;

    public StorageRepository(Context context, Storage storage) {
        this.context = context;
        this.storage = storage;
    }

    @Override
    public Settings getSettings() {
        return storage.getSettings(context);
    }

    @Override
    public void setSettings(Settings settings) {
        storage.setSettings(context, settings);
    }
}
