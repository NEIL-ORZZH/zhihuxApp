package com.xi4oz3ro.zhihuxapp.Entities;

/**
 * Created by xi4oz3ro on 13-7-11.
 */

import java.io.Serializable;

public abstract class Entity implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected long id;

    public long getId() {
        return id;
    }

    protected long entityCreateTime;

    public long getEntityCreateTime(){
        return entityCreateTime;
    }

    protected long entityUpdateVersion;

    public long getEntityUpdateVersion(){
        return entityUpdateVersion;
    }

    public void setEntityUpdateVersion(long entityUpdateVersion){
        this.entityUpdateVersion = entityUpdateVersion;
    }
}
