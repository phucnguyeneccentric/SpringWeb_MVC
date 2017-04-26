/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author hv
 */
@Controller
public class SuaController {
    
     
    @RequestMapping("/danh-sach-sua")
    public ModelAndView DanhSachSua(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("tb", "Danh sách sữa");
        mav.setViewName("sua");
        return mav;
    }
    @RequestMapping("/sua-ban-chay")
    public ModelAndView SuaBanChay(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("tb", "Sữa bán chạy");
        mav.setViewName("sua");
        return mav;
    }
    @RequestMapping("/sua-gia-cao")
    public ModelAndView SuaGiaCao(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("tb", "Sữa giá cao");
        mav.setViewName("sua");
        return mav;
    }
    @RequestMapping("/sua-gia-thap")
    public ModelAndView SuaGiaThap(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("tb", "Sữa giá thấp");
        mav.setViewName("sua");
        return mav;
    }
}
