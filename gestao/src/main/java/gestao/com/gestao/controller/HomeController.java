package gestao.com.gestao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import gestao.com.gestao.service.ImovelService;
import gestao.com.gestao.service.ProprietarioService;

@Controller
public class HomeController {

    private final ImovelService imovelService;
    private final ProprietarioService proprietarioService;

    public HomeController(ImovelService imovelService,
                          ProprietarioService proprietarioService) {
        this.imovelService = imovelService;
        this.proprietarioService = proprietarioService;
    }

    @GetMapping("/")
        public String listarImoveis(Model model) {

            model.addAttribute("imoveis", imovelService.listarTodos());
            model.addAttribute("proprietarios", proprietarioService.listarTodos());
            model.addAttribute("tipoLista", "imoveis");

            return "index";
        }

        @GetMapping("/proprietarios")
        public String listarProprietarios(Model model) {

            model.addAttribute("imoveis", imovelService.listarTodos());
            model.addAttribute("proprietarios", proprietarioService.listarTodos());
            model.addAttribute("tipoLista", "proprietarios");

            return "index";
        }
}