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

    private PaymentStatus status;
    private PaymentType type;
    private Price price;

    public Payment(PaymentStatus _status, PaymentType _type, Price _price) {
        this.status = _status;
        this.type = _type;
        this.price = _price;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus _status) {
        this.status = _status;
    }

    public PaymentType getType() {
        return type;
    }

    public void setType(PaymentType _type) {
        this.type = _type;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price _price) {
        this.price = _price;
    }

}
