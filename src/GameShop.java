/*
 * GameShop.java
 * Main driver program testing the inventory system and access controls.
 *
 * Name: Buse DEMİRBAŞ
 * Student ID: 240444050
 * Date: 06.10.2026
 */

import game.inventory.Item;
import game.inventory.Inventory;


public class GameShop {

    public static void main(String[] args) {

        Inventory shop = new Inventory();

        Item item1 = new Item("Galaxy Racer", "Racing", 12, "GR-4421");
        Item item2 = new Item("Shadow Realm", "RPG", 5, "SR-8873");
        Item item3 = new Item("Pixel Legends", "Strategy", 3, "PL-0091");

        shop.addItem(item1);
        shop.addItem(item2);
        shop.addItem(item3);

        // Display initial inventory
        shop.displayAll();
        System.out.println();

        // Perform sales
        item1.sell(4);
        item2.sell(6); // Triggers stock warning
        System.out.println();

        // Display updated inventory
        shop.displayAll();
        System.out.println();

        // Audit serial codes from within the inventory package
        shop.auditSerialCodes();

    }
}