/*
 * Copyright 2015 krakiewicz.pl <arek@krakiewicz.pl>.
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
 * @author krakiewicz.pl <arek@krakiewicz.pl>
 */
public class OrderItem {

    private int orderItemId;
    private int orderId;
    private int bookId;
    private double bookPrice;
    private double bookQuantity;

    public int getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(int orderItemId) {
        this.orderItemId = orderItemId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public double getBookQuantity() {
        return bookQuantity;
    }

    public void setBookQuantity(double bookQuantity) {
        this.bookQuantity = bookQuantity;
    }

}
