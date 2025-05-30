package com.itsqmet.controlador;

import com.itsqmet.modelo.Paciente;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class registerController {
    @GetMapping ("/registrarPaciente")
    public String mostrarPaciente(Model model){
        Paciente paciente = new Paciente();
        model.addAttribute("paciente", paciente);
        return "paciente/registroPaciente";
    }
    @PostMapping("/registrarPacienteNuevo")
    public String mostrarPaciente(@Valid @ModelAttribute Paciente paciente,
                                  BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            model.addAttribute("errores", bindingResult.getAllErrors());
            return "paciente/registroPaciente";
        } else {
            return "historial/historialClinico";
        }
    }


}
