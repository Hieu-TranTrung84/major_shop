package edu.hieutt.majorshop.global;

import edu.hieutt.majorshop.model.Product;

import java.util.ArrayList;
import java.util.List;

public class GlobalData {
    public static List<Product> cart;

    static {
        cart = new ArrayList<>();
    }
}
