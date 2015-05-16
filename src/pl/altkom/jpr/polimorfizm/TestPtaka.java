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
package pl.altkom.jpr.polimorfizm;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Administrator
 */
public class TestPtaka {
    
    public static void main(String[] args) {
        
        List<Ptak> ptaki = new ArrayList<>();
        
        ptaki.add(new Wrona("Wanda"));
        ptaki.add(new Strus("Pędziwiatr"));
        
        for(Ptak ptak : ptaki) {
            ptak.przestrasz();
        }
        
    }
    
}
