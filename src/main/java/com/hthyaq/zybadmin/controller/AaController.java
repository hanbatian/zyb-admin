package com.hthyaq.zybadmin.controller;


import com.hthyaq.zybadmin.model.entity.Aa;
import com.hthyaq.zybadmin.service.AaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hk
 * @since 2019-08-08
 */
@RestController
@RequestMapping("/aa")
public class AaController {
    @Autowired
    public AaService aaService;

    @GetMapping("/add")
    public Aa addd(Aa aa) {
        aaService.save(aa);
        return aa;
    }

    @GetMapping("/delete")
    public Aa delete(Integer id) {
        Aa aa = aaService.getById(id);
        aa.setId(id);
        aaService.removeById(aa);
        return aa;
    }

    @GetMapping("/update")
    public Aa update(Integer id) {
        Aa aa = aaService.getById(id);
        aa.setName("hello");
        aaService.updateById(aa);
        return aa;
    }

    @GetMapping("/list")
    public Aa list(Integer id) {
        Aa aa = aaService.getById(id);
        aaService.save(aa);
        return aa;
    }


}


