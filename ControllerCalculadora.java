package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.ViewCalculadora;
import models.ModelCalculadora;
import extras.DataValidation;

public class ControllerCalculadora{
    ModelCalculadora modelcalculadora;
    ViewCalculadora viewcalculadora;
    ActionListener actionlistener;
    DataValidation datavalidation = new DataValidation();
    public ControllerCalculadora() {
        this.actionlistener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == viewcalculadora.jb_suma) {
                    jb_suma_action_performed();
                }
                else if (e.getSource() == viewcalculadora.jb_resta) {
                    jb_resta_action_performed();
                }
                else if (e.getSource() == viewcalculadora.jb_multiplicacion) {
                    jb_multiplicacion_action_performed();
                }
                else if (e.getSource() == viewcalculadora.jb_division) {
                    jb_division_action_performed();
                }
                else if (e.getSource() == viewcalculadora.jb_modulo) {
                    jb_modulo_action_performed();
                }
                
            }
        };
    }
    
    
    public ControllerCalculadora(ModelCalculadora modelCalculadora, ViewCalculadora viewCalculadora) {
        this.modelcalculadora = modelCalculadora;
        this.viewcalculadora = viewCalculadora;
        this.actionlistener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == viewcalculadora.jb_suma) {
                    jb_suma_action_performed();
                }
                else if (e.getSource() == viewcalculadora.jb_resta) {
                    jb_resta_action_performed();
                }
                else if (e.getSource() == viewcalculadora.jb_multiplicacion) {
                    jb_multiplicacion_action_performed();
                }
                else if (e.getSource() == viewcalculadora.jb_division) {
                    jb_division_action_performed();
                }
                else if (e.getSource() == viewcalculadora.jb_modulo) {
                    jb_modulo_action_performed();
                }
                
                
            }
        };
    
        this.modelcalculadora = modelCalculadora;
        this.viewcalculadora.jb_suma.addActionListener(actionlistener);
        this.viewcalculadora.jb_resta.addActionListener(actionlistener);
        this.viewcalculadora.jb_multiplicacion.addActionListener(actionlistener);
        this.viewcalculadora.jb_division.addActionListener(actionlistener);
        this.viewcalculadora.jb_modulo.addActionListener(actionlistener);
        initComponents();
    }
    

    public void ObtenerValores() {
        modelcalculadora.setNumero1(datavalidation.stringFloat(viewcalculadora.jtf_numero1.getText()));
        modelcalculadora.setNumero2(datavalidation.stringFloat(viewcalculadora.jtf_numero2.getText()));
    }
    public void Asignacion() {
        modelcalculadora.setResultado2(Float.toString(modelcalculadora.resultado1));
        viewcalculadora.jl_resultado.setText("Resultado: " + modelcalculadora.getResultado2());
    }
    

    public void jb_suma_action_performed() {
        this.ObtenerValores();
        modelcalculadora.suma();
        this.Asignacion();
    }
    public void jb_resta_action_performed() {
        this.ObtenerValores();
        modelcalculadora.resta();
        this.Asignacion();
    }
    public void jb_multiplicacion_action_performed() {
        this.ObtenerValores();
        modelcalculadora.multiplicacion();
        this.Asignacion();
    }
    public void jb_division_action_performed() {
        this.ObtenerValores();
        modelcalculadora.division();
        this.Asignacion();
    }
    public void jb_modulo_action_performed() {
        this.ObtenerValores();
        modelcalculadora.modulo();
        this.Asignacion();
    }
    
    public void initComponents() {
        viewcalculadora.setVisible(true);
    }
    
}


