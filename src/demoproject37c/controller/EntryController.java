/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoproject37c.controller;

import demoproject37c.view.EntryView;

/**
 *
 * @author sangyakoirala
 */
public class EntryController {
    private EntryView entryView= new EntryView();
    public EntryController (EntryView entryView){
        this.entryView=entryView;
    }
    void open(){
        this.entryView.setVisible(true);
    }
    void close(){
        this.entryView.dispose();
    }
}
