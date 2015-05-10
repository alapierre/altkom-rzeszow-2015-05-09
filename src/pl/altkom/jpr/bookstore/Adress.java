/*
 * Copyright 2015 Administrator.
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
 * @author Administrator
 */
public class Adress {

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNr() {
        return streetNumber;
    }

    public void setNr(String nr) {
        this.streetNumber = nr;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getKod() {
        return zipCode;
    }

    public void setKod(String kod) {
        this.zipCode = kod;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFon() {
        return phoneNumber;
    }

    public void setFon(String fon) {
        this.phoneNumber = fon;
    }

    public Adress(String street, String city, String kod, String country, String fon) {
        this.street = street;
        this.city = city;
        this.zipCode = kod;
        this.country = country;
        this.phoneNumber = fon;
    }
    private String street;
    private String streetNumber;        
    private String city;
    private String zipCode;
    private String country;
    private String phoneNumber;
    
    public Adress(){
        
    }
    
    
    
    
}
