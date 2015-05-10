/*
 * Copyright 2015 Szczepan <szczeixs@gmail.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package pl.altkom.jpr.bookstore;

/**
 *
 * @author Szczepan <szczeixs@gmail.com>
 */
public class InvoiceItem {

    private String itemName;
    private String itemISBN;
    private double itemPrice;
    private int itemAmount;

    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return the itemISBN
     */
    public String getItemISBN() {
        return itemISBN;
    }

    /**
     * @param itemISBN the itemISBN to set
     */
    public void setItemISBN(String itemISBN) {
        this.itemISBN = itemISBN;
    }

    /**
     * @return the itemPrice
     */
    public double getItemPrice() {
        return itemPrice;
    }

    /**
     * @param itemPrice the itemPrice to set
     */
    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    /**
     * @return the itemAmount
     */
    public int getItemAmount() {
        return itemAmount;
    }

    /**
     * @param itemAmount the itemAmount to set
     */
    public void setItemAmount(int itemAmount) {
        this.itemAmount = itemAmount;
    }
}
