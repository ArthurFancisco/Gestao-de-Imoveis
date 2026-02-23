package gestao.com.gestao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import gestao.com.gestao.entity.Imovel;
import gestao.com.gestao.repository.ImovelRepository;
import gestao.com.gestao.service.ImovelService;

import java.util.List;

@Controller
@RequestMapping("/imoveis")
public class ImovelController {

    private final ImovelService imovelService;

    public ImovelController(ImovelService imovelService) {
        this.imovelService = imovelService;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("imoveis", imovelService.listarTodos());
        return "index";
    }

    @GetMapping("/cadastrar")
    public String novo(Model model) {
        model.addAttribute("imovel", new Imovel());
        return "Imovel/formImovel";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Imovel imovel) {
        imovelService.salvar(imovel);
        return "redirect:/imoveis";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("imovel", imovelService.buscarPorId(id));
        return "Imovel/formImovel";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Long id) {
        imovelService.excluir(id);
        return "redirect:/imoveis";
    }
}
