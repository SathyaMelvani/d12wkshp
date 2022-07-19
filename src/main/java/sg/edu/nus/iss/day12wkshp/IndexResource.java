package sg.edu.nus.iss.day12wkshp;


@Controller 

@RequestMapping(path= {"/indexresource", "/indexresource.html"})

public class IndexResource {

    @GetMapping(produces = {"text/html"})
    public String index(Model model) {
        return "indexresource";
        


    }
    
}
