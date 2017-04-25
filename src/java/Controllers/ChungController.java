/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author hv
 */
@Controller
public class ChungController {
    @RequestMapping("/trang-chu")
    public String TrangChu(){
        return "trang-chu";
    }
 
    @RequestMapping("/dau-trang")
    public String DauTrang(){
        return "dau-trang";
    }
    @RequestMapping("/cuoi-trang")
    public String CuoiTrang(){
        return "cuoi-trang";
    }

}
