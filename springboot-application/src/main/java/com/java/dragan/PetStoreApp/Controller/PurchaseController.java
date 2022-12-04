package com.java.dragan.PetStoreApp.Controller;



import com.java.dragan.PetStoreApp.Models.Pets;
import com.java.dragan.PetStoreApp.Service.PurchaseOrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("order")
public class PurchaseController {


    private PurchaseOrderService  OrderService;

    public PurchaseController(PurchaseOrderService OrderService){
        super();
        this.OrderService =  OrderService;
    }

    @GetMapping("/orders")
    public double CostOFCats(Model model){
        Pets pets = new Pets();
        model.addAttribute("cat", pets);
        return OrderService.costOfCats();
    }
    @GetMapping("/orders1")
    public double CostOFDogs(Model model) {
        Pets pets = new Pets();
        model.addAttribute("dog",pets);
        return  OrderService.costOfDogs();


    }
}
