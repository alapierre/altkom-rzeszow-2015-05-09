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

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
public class Person implements Comparable<Person> {

    private String name;
    private String lastName;

    public Person() {
    }

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
    
    @Override
    public int compareTo(Person o) {
        return lastName.compareTo(o.lastName);
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", lastName=" + lastName + '}';
    }
    
}
