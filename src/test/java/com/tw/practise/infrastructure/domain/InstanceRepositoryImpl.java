package com.tw.practise.infrastructure.domain;

import com.tw.practise.domain.Instance;
import com.tw.practise.domain.InstanceRepository;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/**
 * Created by azhu on 29/05/2017.
 */
public class InstanceRepositoryImpl implements InstanceRepository {

    private static final HashMap<String, Instance> MEM_DB = new HashMap<>();

    @Override
    public Instance save(Instance instance) {
        if (StringUtils.isEmpty(instance.getInstanceId())) {
            instance.setInstanceId(UUID.randomUUID().toString());
            MEM_DB.put(instance.getInstanceId(), instance);
        }

        return instance;
    }

    @Override
    public List<Instance> findAll() {
        return null;
    }
}
