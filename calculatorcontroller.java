package hello;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/calculator")
public class calculatorcontroller {

    private final calculator calculator = new calculator();
    private final List<String> history = new ArrayList<>();

    @GetMapping("/add")
    public Map<String, Object> add(@RequestParam double op1, @RequestParam double op2) {
        double result = calculator.add(op1, op2);
        String expression = op1 + " + " + op2;
        history.add(expression + " = " + result);
        Map<String, Object> response = new HashMap<>();
        response.put("expression", expression);
        response.put("result", result);
        return response;
    }

    @GetMapping("/subtract")
    public Map<String, Object> subtract(@RequestParam double op1, @RequestParam double op2) {
        double result = calculator.subtract(op1, op2);
        String expression = op1 + " - " + op2;
        history.add(expression + " = " + result);

        Map<String, Object> response = new HashMap<>();
        response.put("expression", expression);
        response.put("result", result);
        return response;
    }

    @GetMapping("/multiply")
    public Map<String, Object> multiply(@RequestParam double op1, @RequestParam double op2) {
        double result = calculator.multiply(op1, op2);
        String expression = op1 + " * " + op2;
        history.add(expression + " = " + result);

        Map<String, Object> response = new HashMap<>();
        response.put("expression", expression);
        response.put("result", result);
        return response;
    }

    @GetMapping("/divide")
    public Map<String, Object> divide(@RequestParam double op1, @RequestParam double op2) {
        double result = calculator.divide(op1, op2);
        String expression = op1 + " / " + op2;
        history.add(expression + " = " + result);

        Map<String, Object> response = new HashMap<>();
        response.put("expression", expression);
        response.put("result", result);
        return response;
    }

    @GetMapping("/history")
    public List<String> getHistory() {
        return history;
    }

    @GetMapping("/clearHistory")
    public Map<String, Object> clearHistory() {
    	Map<String, Object> response = new HashMap<>();
        history.clear();
		
        Object result = 0;
		response.put("History Cleared", result);
        return response;
    }
}
