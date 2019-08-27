/*,
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.alvaroramirez.sistema;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
        
/**
 *
 * @author Ufinal
 */
public class FXMLDocumentController implements Initializable {
    public float dato1, dato2;
    public  float resultado;
    public int op;
    
    @FXML
    private TextField txtresult;
    @FXML
     private Button btnuno;
    @FXML
     private Button btndos;
    @FXML
     private Button btntres;
    @FXML
     private Button btncuatro;
    @FXML
     private Button btncinco;
    @FXML
     private Button btnseis;
    @FXML
     private Button btnsiete;
    @FXML
     private Button btnocho;
    @FXML
     private Button btnnueve;
    @FXML
     private Button btncero; 
    @FXML
     private Button btnsuma;
    @FXML
     private Button btnresta;
    @FXML
     private Button btnmultiplicacion;
    @FXML
     private Button btndivision;
    @FXML
     private Button btnpunto;
    @FXML
     private Button btnigual;
    @FXML
     private Button btnce;
    @FXML
     private Button btnc;
      
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource()==btnuno)
            txtresult.setText(txtresult.getText()+"1");
        else if  (event.getSource()== btndos)
            txtresult.setText(txtresult.getText()+"2");
        else if  (event.getSource()== btntres)
            txtresult.setText(txtresult.getText()+"3");
        else if  (event.getSource()== btncuatro)
            txtresult.setText(txtresult.getText()+"4");
        else if  (event.getSource()== btncinco)
            txtresult.setText(txtresult.getText()+"5");
        else if  (event.getSource()== btnseis)
            txtresult.setText(txtresult.getText()+"6");
        else if  (event.getSource()== btnsiete)
            txtresult.setText(txtresult.getText()+"7");
        else if  (event.getSource()== btnocho)
            txtresult.setText(txtresult.getText()+"8");
        else if  (event.getSource()== btnnueve)
            txtresult.setText(txtresult.getText()+"9");
        else if  (event.getSource()== btncero)
            txtresult.setText(txtresult.getText()+ "0");
         else if  (event.getSource()== btnpunto)
            txtresult.setText(txtresult.getText()+".");
          else if  (event.getSource()== btnce)
            txtresult.setText("");
        
        else if (event.getSource()==btnsuma){
            dato1 = Float.parseFloat(txtresult.getText());
             txtresult.setText("");
             op= 1 ;
        }else if (event.getSource()==btnigual){
            dato2 = Float.parseFloat(txtresult.getText());
           switch (op){
               case 1:
                    resultado = dato1+dato2;
                   txtresult.setText(String.valueOf(resultado));
                   break;
               case 2:
                    resultado = dato1-dato2;
                   txtresult.setText(String.valueOf(resultado));
                   break;
                 
                
           
           }
        }
        }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
