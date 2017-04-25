/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import BusinessLogics.LoaiSuaBL;
import JavaBeans.LoaiSua;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author hv
 */
public class LoaiSuaController extends AbstractController{

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        List<LoaiSua> dsls = LoaiSuaBL.DocTatCa();
        ModelAndView mav = new ModelAndView();
        mav.addObject("dsls",dsls);
        mav.setViewName("danh-sach-loai-sua");
        return mav;

    }
    
}
