package Idao;

import Model.Price;

import java.util.List;

public interface IPrice {

    public abstract List<Price> getPriceByUser(String userId);
}
