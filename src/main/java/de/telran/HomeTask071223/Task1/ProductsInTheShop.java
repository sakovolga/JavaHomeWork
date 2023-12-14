package de.telran.HomeTask071223.Task1;

public class ProductsInTheShop {

}

//    Разработать систему управления товарами в магазине,
//    включающую функциональность для добавления, обновления, удаления и поиска товаров.
//        Система должна уметь обрабатывать различные типы товаров (например, продовольственные
//        и непродовольственные).
//
//        Абстрактные классы:
//
//        AbstractProduct:
//        Методы:
//        addToArray(Product[] products): Добавляет продукт в массив.
//        removeFromArray(Product[] products): Удаляет продукт из массива.
//
//        AbstractDatabaseOperation:
//        Методы:
//        searchInArray(Product[] products, String query): Поиск продукта в массиве.
//        updateArray(Product[] products, Product product): Обновление информации о продукте в массиве.
//
//        Интерфейсы:
//
//        IArrayProcessing:
//        Методы:
//        sortArray(Product[] products): Сортировка массива продуктов.
//        filterArray(Product[] products, String criteria): Фильтрация массива по критериям.
//
//        IProductManagement:
//        Методы:
//        addProduct(Product product): Добавление продукта.
//        removeProduct(Product product): Удаление продукта.
//
//        Классы:
//        FoodProduct (наследует AbstractProduct):
//        Методы:
//        calculateExpiration(Product[] products): Вычисление срока годности.
//        applyDiscount(Product[] products, double discount): Применение скидки.
//
//        NonFoodProduct (наследует AbstractProduct):
//        Методы:
//        checkWarranty(Product[] products): Проверка гарантии.
//        updatePrice(Product[] products, double price): Обновление цены.
//
//        ProductDatabase (наследует AbstractDatabaseOperation, реализует IArrayProcessing и IProductManagement):
//        Методы:
//        backupDatabase(Product[] products): Создание резервной копии базы данных.
//        restoreDatabase(Product[] products): Восстановление базы данных из резервной копии.
//
//        ProductAnalytics (реализует IArrayProcessing):
//        Методы:
//        calculateAveragePrice(Product[] products): Вычисление средней цены продуктов.
//        findMostPopularProduct(Product[] products): Поиск самого популярного продукта.
//
//        InventoryManagement (реализует IProductManagement):
//        Методы:
//        countProducts(Product[] products): Подсчет количества продуктов.
//        listExpiredProducts(Product[] products): Список просроченных продуктов.
//
//        SpecialOfferProduct (наследует NonFoodProduct):
//        Методы:
//        addSpecialOffer(Product[] products, SpecialOffer offer): Добавление специального предложения.
//        removeSpecialOffer(Product[] products, SpecialOffer offer): Удаление специального предложения.