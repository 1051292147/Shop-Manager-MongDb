package com.fzw.service;

import com.fzw.dao.LogDao;
import com.fzw.entity.LoggerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogServiceImpl implements LogService{

    @Autowired
    private LogDao logDao;

    @Override
    public void addLog(LoggerEntity loggerEntity) {
        logDao.addLog(loggerEntity);
    }

    @Override
    public List<LoggerEntity> findAll() {
        return logDao.findAll();
    }
}
