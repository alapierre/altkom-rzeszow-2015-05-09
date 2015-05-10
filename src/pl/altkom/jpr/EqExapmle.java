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
public class EqExapmle {
    
    public static void main(String[] args) {
        
        Person p1 = new Person("Jan", "Kowalski");
        Person p2 = new Person("Jan", "Kowalski");
        
        System.out.println(p1.equals(p2));
        System.out.println(p1 == p2);
        
    }
    
}
