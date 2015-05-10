/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.jpr;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.xml.crypto.Data;

/**
 *
 * @author Administrator
 */
public class LocaleEx {

    public static void main(String[] args) {

        double val = 98787322.3359383;

        //Locale.setDefault(Locale.US);
        NumberFormat nf = NumberFormat.getInstance();

        System.out.println(nf.format(val));

        DateFormat df = DateFormat.getDateTimeInstance(
                DateFormat.SHORT, DateFormat.LONG);
        System.out.println(df.format(new Date()));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println(sdf.format(new Date()));

        NumberFormat cnf = NumberFormat.getCurrencyInstance();

        System.out.println(cnf.format(val));

    }

}
