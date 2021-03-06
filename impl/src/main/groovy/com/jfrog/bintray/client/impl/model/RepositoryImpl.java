package com.jfrog.bintray.client.impl.model;

import com.jfrog.bintray.client.api.model.Repository;
import org.joda.time.DateTime;

import java.util.List;

/**
 * @author Noam Y. Tenne
 */
public class RepositoryImpl implements Repository {

    String name;
    String owner;
    String desc;
    List<String> labels;
    DateTime created;
    Integer packageCount;

    public RepositoryImpl() {
    }

    public RepositoryImpl(String name, String owner, String desc, List<String> labels, DateTime created, Integer packageCount) {
        this.name = name;
        this.owner = owner;
        this.desc = desc;
        this.labels = labels;
        this.created = created;
        this.packageCount = packageCount;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public String getDesc() {
        return desc;
    }

    public List<String> getLabels() {
        return labels;
    }

    public DateTime getCreated() {
        return created;
    }

    public int getPackageCount() {
        return packageCount;
    }
}
