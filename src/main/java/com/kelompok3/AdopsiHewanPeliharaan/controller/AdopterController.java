package com.kelompok3.AdopsiHewanPeliharaan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import com.kelompok3.AdopsiHewanPeliharaan.dto.AdopterDto;
import com.kelompok3.AdopsiHewanPeliharaan.model.Adopter;
import com.kelompok3.AdopsiHewanPeliharaan.repository.AdopterRepo;
import com.kelompok3.AdopsiHewanPeliharaan.service.AdopterService;

@Controller
@RequestMapping("/")
public class AdopterController {
    @Autowired
    private AdopterService adopterService;

    @GetMapping
    public String getAllAdopters(Model model) {
        List<AdopterDto> adopters = adopterService.semua();
        model.addAttribute("adopters", adopters);
        return "adopters";
    }

    // @PostMapping("/adopters")
    // public String saveAdopter(@Validated @ModelAttribute Adopter adopter) {
    // adopterRepo.save(adopter);
    // return "redirect:/adopters";
    // }

}
