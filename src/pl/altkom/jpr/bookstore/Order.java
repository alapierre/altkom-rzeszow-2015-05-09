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

import java.util.Date;

/**
 *
 * @author krakiewicz.pl <arek@krakiewicz.pl>
 */
public class Order {
    
    private int id;
    private Customer customer;
    private Payment payment;
    private int shipping;    
    private Date createDate;
    private Date lastModificationDate;

    public Order(int id, Customer customer, Payment payment, int shipping, Date createDate, Date lastModificationDate) {
        this.id = id;
        this.customer = customer;
        this.payment = payment;
        this.shipping = shipping;
        this.createDate = createDate;
        this.lastModificationDate = lastModificationDate;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastModificationDate() {
        return lastModificationDate;
    }

    public void setLastModificationDate(Date lastModificationDate) {
        this.lastModificationDate = lastModificationDate;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public int getShipping() {
        return shipping;
    }

    public void setShipping(int shipping) {
        this.shipping = shipping;
    }
    
    
    
}
