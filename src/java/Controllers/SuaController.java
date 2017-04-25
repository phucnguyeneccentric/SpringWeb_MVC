/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

/**
 *
 * @author hv
 */
public class SuaController extends MultiActionController{
    public ModelAndView SuaBanChay(HttpServletRequest request,
		HttpServletResponse response){
        ModelAndView mav = new ModelAndView();
        mav.addObject("tb", "Sữa bán chạy");
        mav.setViewName("sua-ban-chay");
        return mav;
    }
    public ModelAndView SuaGiaCao(HttpServletRequest request,
		HttpServletResponse response){
        ModelAndView mav = new ModelAndView();
        mav.addObject("tb", "Sữa giá cao");
        mav.setViewName("sua-gia-cao");
        return mav;
    }

}
