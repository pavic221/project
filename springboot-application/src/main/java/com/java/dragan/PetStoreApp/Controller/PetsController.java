package com.java.dragan.PetStoreApp.Controller;


import com.java.dragan.PetStoreApp.Models.Pets;
import com.java.dragan.PetStoreApp.Service.PetsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/animals")
public class PetsController {

    private PetsService petsService;

    public PetsController(PetsService petsService){
        super();
        this.petsService = petsService;

    }

    @GetMapping("/pets")
    public String listPets(Model model){
        model.addAttribute("pets" , petsService.getAllPets());

        return "pets";
    }

    @GetMapping("/pets/new")
    public String CreatePets(Model model){
        Pets pets = new Pets();
        model.addAttribute("pets", pets);

        return "create_pets";
    }
    @PostMapping("/pets")
    public String savePet(@ModelAttribute("pets") Pets pets) {
        petsService.SavePets(pets);
        return "redirect:/pets";
    }

}
