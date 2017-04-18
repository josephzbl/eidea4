package com.dsdl.eidea.core.service.test;

import com.dsdl.eidea.core.entity.po.ReportSettingsPo;
import com.dsdl.eidea.core.service.ReportSettingsService;
import com.google.gson.Gson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by 刘大磊 on 2017/4/17 15:35.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class ReportSettingsServiceTest {
    @Autowired
    private ReportSettingsService reportSettingsService;
    @Test
    public void testSelectAllSettings()
    {
        Gson gson=new Gson();
        List<ReportSettingsPo> reportSettingsPoList=reportSettingsService.getReportSettingsList(null);
        System.out.println(gson.toJson(reportSettingsPoList));
    }
}