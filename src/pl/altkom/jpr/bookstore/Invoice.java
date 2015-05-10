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
public class Invoice {
    private String buyer;
    private String seller;
    private int invoiceID;
    private double tax;
    private String paymentMethonName;
    private String delivieryMethodName;
    private String invoiceDate;

    /**
     * @return the buyer
     */
    public String getBuyer() {
        return buyer;
    }

    /**
     * @param buyer the buyer to set
     */
    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    /**
     * @return the seller
     */
    public String getSeller() {
        return seller;
    }

    /**
     * @param seller the seller to set
     */
    public void setSeller(String seller) {
        this.seller = seller;
    }

    /**
     * @return the invoiceID
     */
    public int getInvoiceID() {
        return invoiceID;
    }

    /**
     * @param invoiceID the invoiceID to set
     */
    public void setInvoiceID(int invoiceID) {
        this.invoiceID = invoiceID;
    }

    /**
     * @return the tax
     */
    public double getTax() {
        return tax;
    }

    /**
     * @param tax the tax to set
     */
    public void setTax(double tax) {
        this.tax = tax;
    }

    /**
     * @return the paymentMethonName
     */
    public String getPaymentMethonName() {
        return paymentMethonName;
    }

    /**
     * @param paymentMethonName the paymentMethonName to set
     */
    public void setPaymentMethonName(String paymentMethonName) {
        this.paymentMethonName = paymentMethonName;
    }

    /**
     * @return the delivieryMethodName
     */
    public String getDelivieryMethodName() {
        return delivieryMethodName;
    }

    /**
     * @param delivieryMethodName the delivieryMethodName to set
     */
    public void setDelivieryMethodName(String delivieryMethodName) {
        this.delivieryMethodName = delivieryMethodName;
    }

    /**
     * @return the invoiceDate
     */
    public String getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * @param invoiceDate the invoiceDate to set
     */
    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }
    
    
}
