package org.jsecurity.controller;

import org.jsecurity.common.exception.CSException;
import org.jsecurity.common.page.EasyUIPageResult;
import org.jsecurity.common.util.BaseResult;
import org.jsecurity.common.util.ResultUtil;
import org.jsecurity.dto.req.ReqQuerySystemPageListDTO;
import org.jsecurity.entity.SystemDO;
import org.jsecurity.service.SystemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by xiaojianyu on 16/9/2.
 */
@Controller
@RequestMapping("/system")
public class SystemController {

    private static final Logger logger = LoggerFactory.getLogger(SystemController.class);

    @Resource
    private SystemService systemService;

    @RequestMapping("/listInit")
    public void listInit() {

    }

    @RequestMapping("/listData")
    @ResponseBody
    public EasyUIPageResult<SystemDO> listData(ReqQuerySystemPageListDTO reqDTO) {
        BaseResult<EasyUIPageResult<SystemDO>> result = new BaseResult<EasyUIPageResult<SystemDO>>();
        EasyUIPageResult<SystemDO> pageResult = new EasyUIPageResult<SystemDO>();
        try {
            pageResult = systemService.querySystemPageList(reqDTO, reqDTO.getPage(), reqDTO.getRows());
            result.setData(pageResult);
        } catch (CSException e) {
            logger.error("===CSException===", e);
            ResultUtil.buildResult4CSException(result, e);
        } catch (Throwable e) {
            logger.error("===Throwable===", e);
            ResultUtil.buildResult4Throwable(result, e);
        }
        return pageResult;
    }

    @RequestMapping("/toAdd")
    public void toAdd() {
    }

    @RequestMapping("/add")
    public void add() {
    }

    @RequestMapping("/toUpdate")
    public void toUpdate() {
    }

    @RequestMapping("/update")
    public void update() {
    }

    @RequestMapping("/delete")
    public void delete() {
    }
}
