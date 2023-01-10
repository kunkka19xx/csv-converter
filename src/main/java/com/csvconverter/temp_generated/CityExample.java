package com.csvconverter.temp_generated;

import java.util.ArrayList;
import java.util.List;

public class CityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CityExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLadDIsNull() {
            addCriterion("lad_d is null");
            return (Criteria) this;
        }

        public Criteria andLadDIsNotNull() {
            addCriterion("lad_d is not null");
            return (Criteria) this;
        }

        public Criteria andLadDEqualTo(String value) {
            addCriterion("lad_d =", value, "ladD");
            return (Criteria) this;
        }

        public Criteria andLadDNotEqualTo(String value) {
            addCriterion("lad_d <>", value, "ladD");
            return (Criteria) this;
        }

        public Criteria andLadDGreaterThan(String value) {
            addCriterion("lad_d >", value, "ladD");
            return (Criteria) this;
        }

        public Criteria andLadDGreaterThanOrEqualTo(String value) {
            addCriterion("lad_d >=", value, "ladD");
            return (Criteria) this;
        }

        public Criteria andLadDLessThan(String value) {
            addCriterion("lad_d <", value, "ladD");
            return (Criteria) this;
        }

        public Criteria andLadDLessThanOrEqualTo(String value) {
            addCriterion("lad_d <=", value, "ladD");
            return (Criteria) this;
        }

        public Criteria andLadDLike(String value) {
            addCriterion("lad_d like", value, "ladD");
            return (Criteria) this;
        }

        public Criteria andLadDNotLike(String value) {
            addCriterion("lad_d not like", value, "ladD");
            return (Criteria) this;
        }

        public Criteria andLadDIn(List<String> values) {
            addCriterion("lad_d in", values, "ladD");
            return (Criteria) this;
        }

        public Criteria andLadDNotIn(List<String> values) {
            addCriterion("lad_d not in", values, "ladD");
            return (Criteria) this;
        }

        public Criteria andLadDBetween(String value1, String value2) {
            addCriterion("lad_d between", value1, value2, "ladD");
            return (Criteria) this;
        }

        public Criteria andLadDNotBetween(String value1, String value2) {
            addCriterion("lad_d not between", value1, value2, "ladD");
            return (Criteria) this;
        }

        public Criteria andLatMIsNull() {
            addCriterion("lat_m is null");
            return (Criteria) this;
        }

        public Criteria andLatMIsNotNull() {
            addCriterion("lat_m is not null");
            return (Criteria) this;
        }

        public Criteria andLatMEqualTo(String value) {
            addCriterion("lat_m =", value, "latM");
            return (Criteria) this;
        }

        public Criteria andLatMNotEqualTo(String value) {
            addCriterion("lat_m <>", value, "latM");
            return (Criteria) this;
        }

        public Criteria andLatMGreaterThan(String value) {
            addCriterion("lat_m >", value, "latM");
            return (Criteria) this;
        }

        public Criteria andLatMGreaterThanOrEqualTo(String value) {
            addCriterion("lat_m >=", value, "latM");
            return (Criteria) this;
        }

        public Criteria andLatMLessThan(String value) {
            addCriterion("lat_m <", value, "latM");
            return (Criteria) this;
        }

        public Criteria andLatMLessThanOrEqualTo(String value) {
            addCriterion("lat_m <=", value, "latM");
            return (Criteria) this;
        }

        public Criteria andLatMLike(String value) {
            addCriterion("lat_m like", value, "latM");
            return (Criteria) this;
        }

        public Criteria andLatMNotLike(String value) {
            addCriterion("lat_m not like", value, "latM");
            return (Criteria) this;
        }

        public Criteria andLatMIn(List<String> values) {
            addCriterion("lat_m in", values, "latM");
            return (Criteria) this;
        }

        public Criteria andLatMNotIn(List<String> values) {
            addCriterion("lat_m not in", values, "latM");
            return (Criteria) this;
        }

        public Criteria andLatMBetween(String value1, String value2) {
            addCriterion("lat_m between", value1, value2, "latM");
            return (Criteria) this;
        }

        public Criteria andLatMNotBetween(String value1, String value2) {
            addCriterion("lat_m not between", value1, value2, "latM");
            return (Criteria) this;
        }

        public Criteria andNSIsNull() {
            addCriterion("n_s is null");
            return (Criteria) this;
        }

        public Criteria andNSIsNotNull() {
            addCriterion("n_s is not null");
            return (Criteria) this;
        }

        public Criteria andNSEqualTo(String value) {
            addCriterion("n_s =", value, "nS");
            return (Criteria) this;
        }

        public Criteria andNSNotEqualTo(String value) {
            addCriterion("n_s <>", value, "nS");
            return (Criteria) this;
        }

        public Criteria andNSGreaterThan(String value) {
            addCriterion("n_s >", value, "nS");
            return (Criteria) this;
        }

        public Criteria andNSGreaterThanOrEqualTo(String value) {
            addCriterion("n_s >=", value, "nS");
            return (Criteria) this;
        }

        public Criteria andNSLessThan(String value) {
            addCriterion("n_s <", value, "nS");
            return (Criteria) this;
        }

        public Criteria andNSLessThanOrEqualTo(String value) {
            addCriterion("n_s <=", value, "nS");
            return (Criteria) this;
        }

        public Criteria andNSLike(String value) {
            addCriterion("n_s like", value, "nS");
            return (Criteria) this;
        }

        public Criteria andNSNotLike(String value) {
            addCriterion("n_s not like", value, "nS");
            return (Criteria) this;
        }

        public Criteria andNSIn(List<String> values) {
            addCriterion("n_s in", values, "nS");
            return (Criteria) this;
        }

        public Criteria andNSNotIn(List<String> values) {
            addCriterion("n_s not in", values, "nS");
            return (Criteria) this;
        }

        public Criteria andNSBetween(String value1, String value2) {
            addCriterion("n_s between", value1, value2, "nS");
            return (Criteria) this;
        }

        public Criteria andNSNotBetween(String value1, String value2) {
            addCriterion("n_s not between", value1, value2, "nS");
            return (Criteria) this;
        }

        public Criteria andLonDIsNull() {
            addCriterion("lon_d is null");
            return (Criteria) this;
        }

        public Criteria andLonDIsNotNull() {
            addCriterion("lon_d is not null");
            return (Criteria) this;
        }

        public Criteria andLonDEqualTo(String value) {
            addCriterion("lon_d =", value, "lonD");
            return (Criteria) this;
        }

        public Criteria andLonDNotEqualTo(String value) {
            addCriterion("lon_d <>", value, "lonD");
            return (Criteria) this;
        }

        public Criteria andLonDGreaterThan(String value) {
            addCriterion("lon_d >", value, "lonD");
            return (Criteria) this;
        }

        public Criteria andLonDGreaterThanOrEqualTo(String value) {
            addCriterion("lon_d >=", value, "lonD");
            return (Criteria) this;
        }

        public Criteria andLonDLessThan(String value) {
            addCriterion("lon_d <", value, "lonD");
            return (Criteria) this;
        }

        public Criteria andLonDLessThanOrEqualTo(String value) {
            addCriterion("lon_d <=", value, "lonD");
            return (Criteria) this;
        }

        public Criteria andLonDLike(String value) {
            addCriterion("lon_d like", value, "lonD");
            return (Criteria) this;
        }

        public Criteria andLonDNotLike(String value) {
            addCriterion("lon_d not like", value, "lonD");
            return (Criteria) this;
        }

        public Criteria andLonDIn(List<String> values) {
            addCriterion("lon_d in", values, "lonD");
            return (Criteria) this;
        }

        public Criteria andLonDNotIn(List<String> values) {
            addCriterion("lon_d not in", values, "lonD");
            return (Criteria) this;
        }

        public Criteria andLonDBetween(String value1, String value2) {
            addCriterion("lon_d between", value1, value2, "lonD");
            return (Criteria) this;
        }

        public Criteria andLonDNotBetween(String value1, String value2) {
            addCriterion("lon_d not between", value1, value2, "lonD");
            return (Criteria) this;
        }

        public Criteria andLonMIsNull() {
            addCriterion("lon_m is null");
            return (Criteria) this;
        }

        public Criteria andLonMIsNotNull() {
            addCriterion("lon_m is not null");
            return (Criteria) this;
        }

        public Criteria andLonMEqualTo(String value) {
            addCriterion("lon_m =", value, "lonM");
            return (Criteria) this;
        }

        public Criteria andLonMNotEqualTo(String value) {
            addCriterion("lon_m <>", value, "lonM");
            return (Criteria) this;
        }

        public Criteria andLonMGreaterThan(String value) {
            addCriterion("lon_m >", value, "lonM");
            return (Criteria) this;
        }

        public Criteria andLonMGreaterThanOrEqualTo(String value) {
            addCriterion("lon_m >=", value, "lonM");
            return (Criteria) this;
        }

        public Criteria andLonMLessThan(String value) {
            addCriterion("lon_m <", value, "lonM");
            return (Criteria) this;
        }

        public Criteria andLonMLessThanOrEqualTo(String value) {
            addCriterion("lon_m <=", value, "lonM");
            return (Criteria) this;
        }

        public Criteria andLonMLike(String value) {
            addCriterion("lon_m like", value, "lonM");
            return (Criteria) this;
        }

        public Criteria andLonMNotLike(String value) {
            addCriterion("lon_m not like", value, "lonM");
            return (Criteria) this;
        }

        public Criteria andLonMIn(List<String> values) {
            addCriterion("lon_m in", values, "lonM");
            return (Criteria) this;
        }

        public Criteria andLonMNotIn(List<String> values) {
            addCriterion("lon_m not in", values, "lonM");
            return (Criteria) this;
        }

        public Criteria andLonMBetween(String value1, String value2) {
            addCriterion("lon_m between", value1, value2, "lonM");
            return (Criteria) this;
        }

        public Criteria andLonMNotBetween(String value1, String value2) {
            addCriterion("lon_m not between", value1, value2, "lonM");
            return (Criteria) this;
        }

        public Criteria andLonSIsNull() {
            addCriterion("lon_s is null");
            return (Criteria) this;
        }

        public Criteria andLonSIsNotNull() {
            addCriterion("lon_s is not null");
            return (Criteria) this;
        }

        public Criteria andLonSEqualTo(String value) {
            addCriterion("lon_s =", value, "lonS");
            return (Criteria) this;
        }

        public Criteria andLonSNotEqualTo(String value) {
            addCriterion("lon_s <>", value, "lonS");
            return (Criteria) this;
        }

        public Criteria andLonSGreaterThan(String value) {
            addCriterion("lon_s >", value, "lonS");
            return (Criteria) this;
        }

        public Criteria andLonSGreaterThanOrEqualTo(String value) {
            addCriterion("lon_s >=", value, "lonS");
            return (Criteria) this;
        }

        public Criteria andLonSLessThan(String value) {
            addCriterion("lon_s <", value, "lonS");
            return (Criteria) this;
        }

        public Criteria andLonSLessThanOrEqualTo(String value) {
            addCriterion("lon_s <=", value, "lonS");
            return (Criteria) this;
        }

        public Criteria andLonSLike(String value) {
            addCriterion("lon_s like", value, "lonS");
            return (Criteria) this;
        }

        public Criteria andLonSNotLike(String value) {
            addCriterion("lon_s not like", value, "lonS");
            return (Criteria) this;
        }

        public Criteria andLonSIn(List<String> values) {
            addCriterion("lon_s in", values, "lonS");
            return (Criteria) this;
        }

        public Criteria andLonSNotIn(List<String> values) {
            addCriterion("lon_s not in", values, "lonS");
            return (Criteria) this;
        }

        public Criteria andLonSBetween(String value1, String value2) {
            addCriterion("lon_s between", value1, value2, "lonS");
            return (Criteria) this;
        }

        public Criteria andLonSNotBetween(String value1, String value2) {
            addCriterion("lon_s not between", value1, value2, "lonS");
            return (Criteria) this;
        }

        public Criteria andEWIsNull() {
            addCriterion("e_w is null");
            return (Criteria) this;
        }

        public Criteria andEWIsNotNull() {
            addCriterion("e_w is not null");
            return (Criteria) this;
        }

        public Criteria andEWEqualTo(String value) {
            addCriterion("e_w =", value, "eW");
            return (Criteria) this;
        }

        public Criteria andEWNotEqualTo(String value) {
            addCriterion("e_w <>", value, "eW");
            return (Criteria) this;
        }

        public Criteria andEWGreaterThan(String value) {
            addCriterion("e_w >", value, "eW");
            return (Criteria) this;
        }

        public Criteria andEWGreaterThanOrEqualTo(String value) {
            addCriterion("e_w >=", value, "eW");
            return (Criteria) this;
        }

        public Criteria andEWLessThan(String value) {
            addCriterion("e_w <", value, "eW");
            return (Criteria) this;
        }

        public Criteria andEWLessThanOrEqualTo(String value) {
            addCriterion("e_w <=", value, "eW");
            return (Criteria) this;
        }

        public Criteria andEWLike(String value) {
            addCriterion("e_w like", value, "eW");
            return (Criteria) this;
        }

        public Criteria andEWNotLike(String value) {
            addCriterion("e_w not like", value, "eW");
            return (Criteria) this;
        }

        public Criteria andEWIn(List<String> values) {
            addCriterion("e_w in", values, "eW");
            return (Criteria) this;
        }

        public Criteria andEWNotIn(List<String> values) {
            addCriterion("e_w not in", values, "eW");
            return (Criteria) this;
        }

        public Criteria andEWBetween(String value1, String value2) {
            addCriterion("e_w between", value1, value2, "eW");
            return (Criteria) this;
        }

        public Criteria andEWNotBetween(String value1, String value2) {
            addCriterion("e_w not between", value1, value2, "eW");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}