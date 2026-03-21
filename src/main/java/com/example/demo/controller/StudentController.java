import java.util.List;
import java.util.ArrayList;

@GetMapping("/students")
public String showStudents(Model model) {

    List<String> test = new ArrayList<>();
    test.add("Test Student 1");
    test.add("Test Student 2");

    model.addAttribute("students", test);

    return "students";
}