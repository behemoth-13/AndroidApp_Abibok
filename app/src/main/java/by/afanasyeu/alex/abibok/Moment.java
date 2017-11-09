package by.afanasyeu.alex.abibok;

import java.util.UUID;

/**
 * Created by AlexPC on 09.11.2017.
 */

public class Moment {

    private UUID mId;
    private String mTitle;

    public Moment() {
        //Генерирование уникального идентификатора
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
