/*
 * Copyright 2015 Adrian Lapierre <adrian@soft-project.pl>.
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
package pl.altkom.jpr;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
public class SortExample {
    
    public static void main(String[] args) {
        
        List<Person> list = new java.util.ArrayList<>();
        
        list.add(new Person("Jan", "Kowalski"));
        list.add(new Person("Piotr", "Nowak"));
        list.add(new Person("Adam", "Zieliński"));
        list.add(new Person("Krzysztof", "Adamski"));
        
        Collections.sort(list);
        
        for(Person person : list) {
            System.out.println(person);
        }
        
    }
    
}
