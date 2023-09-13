package com.teachmesills.lesson14.part1.option1;

import com.teachmesills.lesson14.part1.option1.model.Breakfast;
import com.teachmesills.lesson14.part1.option1.model.Coffee;
import com.teachmesills.lesson14.part1.option1.model.ReadingNews;

public class Main {
    public static void main(String[] args) {
        ReadingNews readingNews = new ReadingNews();
        readingNews.setPriority(10);
        readingNews.start();

        Breakfast breakfast = new Breakfast();
        breakfast.start();

        Coffee coffee = new Coffee();
        coffee.setPriority(1);
        coffee.start();
    }
}
