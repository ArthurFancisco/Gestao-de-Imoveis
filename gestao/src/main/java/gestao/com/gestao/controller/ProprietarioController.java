package gestao.com.gestao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import gestao.com.gestao.entity.Imovel;
import gestao.com.gestao.entity.Proprietario;
import gestao.com.gestao.service.ImovelService;
import gestao.com.gestao.service.ProprietarioService;


@Controller
@RequestMapping("/proprietarios")
public class ProprietarioController {

    private final ProprietarioService proprietarioService;

    public ProprietarioController(ProprietarioService proprietarioService) {
        this.proprietarioService = proprietarioService;
    }

    @GetMapping("/cadastrar")
    public String novo(Model model) {
        model.addAttribute("proprietario", new Proprietario());
        return "Proprietario/formProprietario";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Proprietario proprietario) {
        proprietarioService.salvar(proprietario);
        return "redirect:/";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("proprietario", proprietarioService.buscarPorId(id));
        return "Proprietario/formProprietario";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Long id) {
        proprietarioService.excluir(id);
        return "redirect:/";
    }

    @GetMapping("/listar")
    public String listar(Model model) {
    model.addAttribute("proprietarios", proprietarioService.listarTodos());
    return "Proprietario/ListaProprietario";
}
}
