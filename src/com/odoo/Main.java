/*
Written by Johnathan Orsolini (Neufunk)
29/01/2019
*/
package com.odoo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Main {

    /*
    This application consist of a serie of 3 algorithms: CheckOpenSource, ExpandRandom and StringToInt.
    You can find more informations in each of the 3 classes.
    Uncomment specific lines starting with // to launch specific method.
     */

    public static void main(String[] args) {

        /* You can modify this StringList to test StringToInt algorithm */
        ObservableList<String> stringList = FXCollections.observableArrayList("HelloWorld", "2", "cause", "7", "1328", "konnichiha", "Computer");
        StringToInt stringToInt = new StringToInt();
        CheckOpenSource checkOpenSource = new CheckOpenSource();
        ExpandRandom expandRandom = new ExpandRandom();

        /* StringToInt */
        // stringToInt.stringToInt(stringList);

        /*CheckOpenSource*/
         // checkOpenSource.checkOpenSource();

        /*ExpandRandom*/
        // expandRandom.rand7();
    }
}
