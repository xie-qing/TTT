package org.tis.tools.abf.module.ac.service.impl;

import org.tis.tools.abf.module.ac.dao.AcOperatorMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.tis.tools.abf.module.ac.entity.AcOperator;
import org.springframework.transaction.annotation.Transactional;
import org.tis.tools.abf.module.ac.service.IAcOperatorService;

/**
 * acOperator的Service接口实现类
 * 
 * @author Auto Generate Tools
 * @date 2018/04/23
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AcOperatorServiceImpl extends ServiceImpl<AcOperatorMapper, AcOperator> implements IAcOperatorService {

}

