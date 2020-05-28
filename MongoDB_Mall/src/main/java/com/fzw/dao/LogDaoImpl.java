package com.fzw.dao;

import com.fzw.entity.LoggerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogDaoImpl implements LogDao{

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void addLog(LoggerEntity loggerEntity) {
        mongoTemplate.insert(loggerEntity);
    }

    @Override
    public List<LoggerEntity> findAll() {
        return mongoTemplate.findAll(LoggerEntity.class);
    }
}
