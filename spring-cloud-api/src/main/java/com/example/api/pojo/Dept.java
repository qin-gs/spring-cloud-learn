package com.example.api.pojo;

import java.io.Serializable;

public class Dept implements Serializable {
    private Long deptno;
    private String dname;
    private String db_source;

    public Long getDeptno() {
        return deptno;
    }

    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDb_source() {
        return db_source;
    }

    public void setDb_source(String db_source) {
        this.db_source = db_source;
    }

    @Override
    public String toString() {
        return "Dept{" + "deptno=" + deptno + ", dname='" + dname + '\'' + ", db_source='" + db_source + '\'' + '}';
    }


    public static final class Builder {
        private Long deptno;
        private String dname;
        private String db_source;

        private Builder() {
        }

        public static Builder aDept() {
            return new Builder();
        }

        public Builder deptno(Long deptno) {
            this.deptno = deptno;
            return this;
        }

        public Builder dname(String dname) {
            this.dname = dname;
            return this;
        }

        public Builder db_source(String db_source) {
            this.db_source = db_source;
            return this;
        }

        public Dept build() {
            Dept dept = new Dept();
            dept.setDeptno(deptno);
            dept.setDname(dname);
            dept.setDb_source(db_source);
            return dept;
        }
    }
}
