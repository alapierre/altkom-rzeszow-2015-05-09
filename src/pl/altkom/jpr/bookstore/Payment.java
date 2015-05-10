/*
 * Copyright 2015 Waldemar Dacko <dackow@gmail.com>.
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
 * @author Waldemar Dacko <dackow@gmail.com>
 */
public class Payment {
    private STATUS status; 
    private TYPE type;
    private Price price;

    public Payment(STATUS _status, TYPE _type, Price _price) {
        this.status = _status;
        this.type = _type;
        this.price = _price;
    }

    public STATUS getStatus() {
        return status;
    }

    public void setStatus(STATUS _status) {
        this.status = _status;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE _type) {
        this.type = _type;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price _price) {
        this.price = _price;
    }
    
    enum STATUS {
        NEW, CONFIRMED, REJECTED
    }
    
    enum TYPE {
        CASH, CARD, PAYPAL
    }
}





