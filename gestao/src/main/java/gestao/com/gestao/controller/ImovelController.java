package gestao.com.gestao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import gestao.com.gestao.entity.Imovel;
import gestao.com.gestao.entity.Proprietario;
import gestao.com.gestao.repository.ImovelRepository;
import gestao.com.gestao.service.ImovelService;
import gestao.com.gestao.service.ProprietarioService;

import java.util.List;

@Controller
@RequestMapping("/imoveis")
public class ImovelController {

    private final ImovelService imovelService;
    
    private final ProprietarioService proprietarioService;

    public ImovelController(ImovelService imovelService, ProprietarioService proprietarioService) {
        this.imovelService = imovelService;
        this.proprietarioService = proprietarioService;
    }


    @GetMapping("/cadastrar")
    public String novo(Model model) {

        Imovel imovel = new Imovel();
          imovel.setProprietario(new Proprietario()); // IMPORTANTE: Inicializa o campo de proprietário para evitar erros de null

        model.addAttribute("imovel", imovel);
        model.addAttribute("proprietarios", proprietarioService.listarTodos());
        return "Imovel/formImovel";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Imovel imovel) {
        imovelService.salvar(imovel);
        return "redirect:/";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("imovel", imovelService.buscarPorId(id));
        return "Imovel/formImovel";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Long id) {
        imovelService.excluir(id);
        return "redirect:/";
    }
}
