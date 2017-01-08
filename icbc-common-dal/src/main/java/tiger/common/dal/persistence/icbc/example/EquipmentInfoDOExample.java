package tiger.common.dal.persistence.icbc;

import java.util.ArrayList;
import java.util.List;

public class EquipmentInfoDOExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table equipmentinfo
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table equipmentinfo
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table equipmentinfo
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipmentinfo
     *
     * @mbggenerated
     */
    public EquipmentInfoDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipmentinfo
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipmentinfo
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipmentinfo
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipmentinfo
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipmentinfo
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipmentinfo
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipmentinfo
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipmentinfo
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipmentinfo
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipmentinfo
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table equipmentinfo
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
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

        public Criteria andEquSerialNumIsNull() {
            addCriterion("Equ_Serial_Num is null");
            return (Criteria) this;
        }

        public Criteria andEquSerialNumIsNotNull() {
            addCriterion("Equ_Serial_Num is not null");
            return (Criteria) this;
        }

        public Criteria andEquSerialNumEqualTo(String value) {
            addCriterion("Equ_Serial_Num =", value, "equSerialNum");
            return (Criteria) this;
        }

        public Criteria andEquSerialNumNotEqualTo(String value) {
            addCriterion("Equ_Serial_Num <>", value, "equSerialNum");
            return (Criteria) this;
        }

        public Criteria andEquSerialNumGreaterThan(String value) {
            addCriterion("Equ_Serial_Num >", value, "equSerialNum");
            return (Criteria) this;
        }

        public Criteria andEquSerialNumGreaterThanOrEqualTo(String value) {
            addCriterion("Equ_Serial_Num >=", value, "equSerialNum");
            return (Criteria) this;
        }

        public Criteria andEquSerialNumLessThan(String value) {
            addCriterion("Equ_Serial_Num <", value, "equSerialNum");
            return (Criteria) this;
        }

        public Criteria andEquSerialNumLessThanOrEqualTo(String value) {
            addCriterion("Equ_Serial_Num <=", value, "equSerialNum");
            return (Criteria) this;
        }

        public Criteria andEquSerialNumLike(String value) {
            addCriterion("Equ_Serial_Num like", value, "equSerialNum");
            return (Criteria) this;
        }

        public Criteria andEquSerialNumNotLike(String value) {
            addCriterion("Equ_Serial_Num not like", value, "equSerialNum");
            return (Criteria) this;
        }

        public Criteria andEquSerialNumIn(List<String> values) {
            addCriterion("Equ_Serial_Num in", values, "equSerialNum");
            return (Criteria) this;
        }

        public Criteria andEquSerialNumNotIn(List<String> values) {
            addCriterion("Equ_Serial_Num not in", values, "equSerialNum");
            return (Criteria) this;
        }

        public Criteria andEquSerialNumBetween(String value1, String value2) {
            addCriterion("Equ_Serial_Num between", value1, value2, "equSerialNum");
            return (Criteria) this;
        }

        public Criteria andEquSerialNumNotBetween(String value1, String value2) {
            addCriterion("Equ_Serial_Num not between", value1, value2, "equSerialNum");
            return (Criteria) this;
        }

        public Criteria andCpuNumIsNull() {
            addCriterion("CPU_Num is null");
            return (Criteria) this;
        }

        public Criteria andCpuNumIsNotNull() {
            addCriterion("CPU_Num is not null");
            return (Criteria) this;
        }

        public Criteria andCpuNumEqualTo(String value) {
            addCriterion("CPU_Num =", value, "cpuNum");
            return (Criteria) this;
        }

        public Criteria andCpuNumNotEqualTo(String value) {
            addCriterion("CPU_Num <>", value, "cpuNum");
            return (Criteria) this;
        }

        public Criteria andCpuNumGreaterThan(String value) {
            addCriterion("CPU_Num >", value, "cpuNum");
            return (Criteria) this;
        }

        public Criteria andCpuNumGreaterThanOrEqualTo(String value) {
            addCriterion("CPU_Num >=", value, "cpuNum");
            return (Criteria) this;
        }

        public Criteria andCpuNumLessThan(String value) {
            addCriterion("CPU_Num <", value, "cpuNum");
            return (Criteria) this;
        }

        public Criteria andCpuNumLessThanOrEqualTo(String value) {
            addCriterion("CPU_Num <=", value, "cpuNum");
            return (Criteria) this;
        }

        public Criteria andCpuNumLike(String value) {
            addCriterion("CPU_Num like", value, "cpuNum");
            return (Criteria) this;
        }

        public Criteria andCpuNumNotLike(String value) {
            addCriterion("CPU_Num not like", value, "cpuNum");
            return (Criteria) this;
        }

        public Criteria andCpuNumIn(List<String> values) {
            addCriterion("CPU_Num in", values, "cpuNum");
            return (Criteria) this;
        }

        public Criteria andCpuNumNotIn(List<String> values) {
            addCriterion("CPU_Num not in", values, "cpuNum");
            return (Criteria) this;
        }

        public Criteria andCpuNumBetween(String value1, String value2) {
            addCriterion("CPU_Num between", value1, value2, "cpuNum");
            return (Criteria) this;
        }

        public Criteria andCpuNumNotBetween(String value1, String value2) {
            addCriterion("CPU_Num not between", value1, value2, "cpuNum");
            return (Criteria) this;
        }

        public Criteria andMemorySizeIsNull() {
            addCriterion("Memory_Size is null");
            return (Criteria) this;
        }

        public Criteria andMemorySizeIsNotNull() {
            addCriterion("Memory_Size is not null");
            return (Criteria) this;
        }

        public Criteria andMemorySizeEqualTo(String value) {
            addCriterion("Memory_Size =", value, "memorySize");
            return (Criteria) this;
        }

        public Criteria andMemorySizeNotEqualTo(String value) {
            addCriterion("Memory_Size <>", value, "memorySize");
            return (Criteria) this;
        }

        public Criteria andMemorySizeGreaterThan(String value) {
            addCriterion("Memory_Size >", value, "memorySize");
            return (Criteria) this;
        }

        public Criteria andMemorySizeGreaterThanOrEqualTo(String value) {
            addCriterion("Memory_Size >=", value, "memorySize");
            return (Criteria) this;
        }

        public Criteria andMemorySizeLessThan(String value) {
            addCriterion("Memory_Size <", value, "memorySize");
            return (Criteria) this;
        }

        public Criteria andMemorySizeLessThanOrEqualTo(String value) {
            addCriterion("Memory_Size <=", value, "memorySize");
            return (Criteria) this;
        }

        public Criteria andMemorySizeLike(String value) {
            addCriterion("Memory_Size like", value, "memorySize");
            return (Criteria) this;
        }

        public Criteria andMemorySizeNotLike(String value) {
            addCriterion("Memory_Size not like", value, "memorySize");
            return (Criteria) this;
        }

        public Criteria andMemorySizeIn(List<String> values) {
            addCriterion("Memory_Size in", values, "memorySize");
            return (Criteria) this;
        }

        public Criteria andMemorySizeNotIn(List<String> values) {
            addCriterion("Memory_Size not in", values, "memorySize");
            return (Criteria) this;
        }

        public Criteria andMemorySizeBetween(String value1, String value2) {
            addCriterion("Memory_Size between", value1, value2, "memorySize");
            return (Criteria) this;
        }

        public Criteria andMemorySizeNotBetween(String value1, String value2) {
            addCriterion("Memory_Size not between", value1, value2, "memorySize");
            return (Criteria) this;
        }

        public Criteria andOsVersionsIsNull() {
            addCriterion("OS_Versions is null");
            return (Criteria) this;
        }

        public Criteria andOsVersionsIsNotNull() {
            addCriterion("OS_Versions is not null");
            return (Criteria) this;
        }

        public Criteria andOsVersionsEqualTo(String value) {
            addCriterion("OS_Versions =", value, "osVersions");
            return (Criteria) this;
        }

        public Criteria andOsVersionsNotEqualTo(String value) {
            addCriterion("OS_Versions <>", value, "osVersions");
            return (Criteria) this;
        }

        public Criteria andOsVersionsGreaterThan(String value) {
            addCriterion("OS_Versions >", value, "osVersions");
            return (Criteria) this;
        }

        public Criteria andOsVersionsGreaterThanOrEqualTo(String value) {
            addCriterion("OS_Versions >=", value, "osVersions");
            return (Criteria) this;
        }

        public Criteria andOsVersionsLessThan(String value) {
            addCriterion("OS_Versions <", value, "osVersions");
            return (Criteria) this;
        }

        public Criteria andOsVersionsLessThanOrEqualTo(String value) {
            addCriterion("OS_Versions <=", value, "osVersions");
            return (Criteria) this;
        }

        public Criteria andOsVersionsLike(String value) {
            addCriterion("OS_Versions like", value, "osVersions");
            return (Criteria) this;
        }

        public Criteria andOsVersionsNotLike(String value) {
            addCriterion("OS_Versions not like", value, "osVersions");
            return (Criteria) this;
        }

        public Criteria andOsVersionsIn(List<String> values) {
            addCriterion("OS_Versions in", values, "osVersions");
            return (Criteria) this;
        }

        public Criteria andOsVersionsNotIn(List<String> values) {
            addCriterion("OS_Versions not in", values, "osVersions");
            return (Criteria) this;
        }

        public Criteria andOsVersionsBetween(String value1, String value2) {
            addCriterion("OS_Versions between", value1, value2, "osVersions");
            return (Criteria) this;
        }

        public Criteria andOsVersionsNotBetween(String value1, String value2) {
            addCriterion("OS_Versions not between", value1, value2, "osVersions");
            return (Criteria) this;
        }

        public Criteria andBrowserVersionsIsNull() {
            addCriterion("Browser_Versions is null");
            return (Criteria) this;
        }

        public Criteria andBrowserVersionsIsNotNull() {
            addCriterion("Browser_Versions is not null");
            return (Criteria) this;
        }

        public Criteria andBrowserVersionsEqualTo(String value) {
            addCriterion("Browser_Versions =", value, "browserVersions");
            return (Criteria) this;
        }

        public Criteria andBrowserVersionsNotEqualTo(String value) {
            addCriterion("Browser_Versions <>", value, "browserVersions");
            return (Criteria) this;
        }

        public Criteria andBrowserVersionsGreaterThan(String value) {
            addCriterion("Browser_Versions >", value, "browserVersions");
            return (Criteria) this;
        }

        public Criteria andBrowserVersionsGreaterThanOrEqualTo(String value) {
            addCriterion("Browser_Versions >=", value, "browserVersions");
            return (Criteria) this;
        }

        public Criteria andBrowserVersionsLessThan(String value) {
            addCriterion("Browser_Versions <", value, "browserVersions");
            return (Criteria) this;
        }

        public Criteria andBrowserVersionsLessThanOrEqualTo(String value) {
            addCriterion("Browser_Versions <=", value, "browserVersions");
            return (Criteria) this;
        }

        public Criteria andBrowserVersionsLike(String value) {
            addCriterion("Browser_Versions like", value, "browserVersions");
            return (Criteria) this;
        }

        public Criteria andBrowserVersionsNotLike(String value) {
            addCriterion("Browser_Versions not like", value, "browserVersions");
            return (Criteria) this;
        }

        public Criteria andBrowserVersionsIn(List<String> values) {
            addCriterion("Browser_Versions in", values, "browserVersions");
            return (Criteria) this;
        }

        public Criteria andBrowserVersionsNotIn(List<String> values) {
            addCriterion("Browser_Versions not in", values, "browserVersions");
            return (Criteria) this;
        }

        public Criteria andBrowserVersionsBetween(String value1, String value2) {
            addCriterion("Browser_Versions between", value1, value2, "browserVersions");
            return (Criteria) this;
        }

        public Criteria andBrowserVersionsNotBetween(String value1, String value2) {
            addCriterion("Browser_Versions not between", value1, value2, "browserVersions");
            return (Criteria) this;
        }

        public Criteria andBrowserLanguageIsNull() {
            addCriterion("Browser_Language is null");
            return (Criteria) this;
        }

        public Criteria andBrowserLanguageIsNotNull() {
            addCriterion("Browser_Language is not null");
            return (Criteria) this;
        }

        public Criteria andBrowserLanguageEqualTo(String value) {
            addCriterion("Browser_Language =", value, "browserLanguage");
            return (Criteria) this;
        }

        public Criteria andBrowserLanguageNotEqualTo(String value) {
            addCriterion("Browser_Language <>", value, "browserLanguage");
            return (Criteria) this;
        }

        public Criteria andBrowserLanguageGreaterThan(String value) {
            addCriterion("Browser_Language >", value, "browserLanguage");
            return (Criteria) this;
        }

        public Criteria andBrowserLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("Browser_Language >=", value, "browserLanguage");
            return (Criteria) this;
        }

        public Criteria andBrowserLanguageLessThan(String value) {
            addCriterion("Browser_Language <", value, "browserLanguage");
            return (Criteria) this;
        }

        public Criteria andBrowserLanguageLessThanOrEqualTo(String value) {
            addCriterion("Browser_Language <=", value, "browserLanguage");
            return (Criteria) this;
        }

        public Criteria andBrowserLanguageLike(String value) {
            addCriterion("Browser_Language like", value, "browserLanguage");
            return (Criteria) this;
        }

        public Criteria andBrowserLanguageNotLike(String value) {
            addCriterion("Browser_Language not like", value, "browserLanguage");
            return (Criteria) this;
        }

        public Criteria andBrowserLanguageIn(List<String> values) {
            addCriterion("Browser_Language in", values, "browserLanguage");
            return (Criteria) this;
        }

        public Criteria andBrowserLanguageNotIn(List<String> values) {
            addCriterion("Browser_Language not in", values, "browserLanguage");
            return (Criteria) this;
        }

        public Criteria andBrowserLanguageBetween(String value1, String value2) {
            addCriterion("Browser_Language between", value1, value2, "browserLanguage");
            return (Criteria) this;
        }

        public Criteria andBrowserLanguageNotBetween(String value1, String value2) {
            addCriterion("Browser_Language not between", value1, value2, "browserLanguage");
            return (Criteria) this;
        }

        public Criteria andScreenResolutionIsNull() {
            addCriterion("Screen_Resolution is null");
            return (Criteria) this;
        }

        public Criteria andScreenResolutionIsNotNull() {
            addCriterion("Screen_Resolution is not null");
            return (Criteria) this;
        }

        public Criteria andScreenResolutionEqualTo(String value) {
            addCriterion("Screen_Resolution =", value, "screenResolution");
            return (Criteria) this;
        }

        public Criteria andScreenResolutionNotEqualTo(String value) {
            addCriterion("Screen_Resolution <>", value, "screenResolution");
            return (Criteria) this;
        }

        public Criteria andScreenResolutionGreaterThan(String value) {
            addCriterion("Screen_Resolution >", value, "screenResolution");
            return (Criteria) this;
        }

        public Criteria andScreenResolutionGreaterThanOrEqualTo(String value) {
            addCriterion("Screen_Resolution >=", value, "screenResolution");
            return (Criteria) this;
        }

        public Criteria andScreenResolutionLessThan(String value) {
            addCriterion("Screen_Resolution <", value, "screenResolution");
            return (Criteria) this;
        }

        public Criteria andScreenResolutionLessThanOrEqualTo(String value) {
            addCriterion("Screen_Resolution <=", value, "screenResolution");
            return (Criteria) this;
        }

        public Criteria andScreenResolutionLike(String value) {
            addCriterion("Screen_Resolution like", value, "screenResolution");
            return (Criteria) this;
        }

        public Criteria andScreenResolutionNotLike(String value) {
            addCriterion("Screen_Resolution not like", value, "screenResolution");
            return (Criteria) this;
        }

        public Criteria andScreenResolutionIn(List<String> values) {
            addCriterion("Screen_Resolution in", values, "screenResolution");
            return (Criteria) this;
        }

        public Criteria andScreenResolutionNotIn(List<String> values) {
            addCriterion("Screen_Resolution not in", values, "screenResolution");
            return (Criteria) this;
        }

        public Criteria andScreenResolutionBetween(String value1, String value2) {
            addCriterion("Screen_Resolution between", value1, value2, "screenResolution");
            return (Criteria) this;
        }

        public Criteria andScreenResolutionNotBetween(String value1, String value2) {
            addCriterion("Screen_Resolution not between", value1, value2, "screenResolution");
            return (Criteria) this;
        }

        public Criteria andAppVersionsIsNull() {
            addCriterion("APP_Versions is null");
            return (Criteria) this;
        }

        public Criteria andAppVersionsIsNotNull() {
            addCriterion("APP_Versions is not null");
            return (Criteria) this;
        }

        public Criteria andAppVersionsEqualTo(String value) {
            addCriterion("APP_Versions =", value, "appVersions");
            return (Criteria) this;
        }

        public Criteria andAppVersionsNotEqualTo(String value) {
            addCriterion("APP_Versions <>", value, "appVersions");
            return (Criteria) this;
        }

        public Criteria andAppVersionsGreaterThan(String value) {
            addCriterion("APP_Versions >", value, "appVersions");
            return (Criteria) this;
        }

        public Criteria andAppVersionsGreaterThanOrEqualTo(String value) {
            addCriterion("APP_Versions >=", value, "appVersions");
            return (Criteria) this;
        }

        public Criteria andAppVersionsLessThan(String value) {
            addCriterion("APP_Versions <", value, "appVersions");
            return (Criteria) this;
        }

        public Criteria andAppVersionsLessThanOrEqualTo(String value) {
            addCriterion("APP_Versions <=", value, "appVersions");
            return (Criteria) this;
        }

        public Criteria andAppVersionsLike(String value) {
            addCriterion("APP_Versions like", value, "appVersions");
            return (Criteria) this;
        }

        public Criteria andAppVersionsNotLike(String value) {
            addCriterion("APP_Versions not like", value, "appVersions");
            return (Criteria) this;
        }

        public Criteria andAppVersionsIn(List<String> values) {
            addCriterion("APP_Versions in", values, "appVersions");
            return (Criteria) this;
        }

        public Criteria andAppVersionsNotIn(List<String> values) {
            addCriterion("APP_Versions not in", values, "appVersions");
            return (Criteria) this;
        }

        public Criteria andAppVersionsBetween(String value1, String value2) {
            addCriterion("APP_Versions between", value1, value2, "appVersions");
            return (Criteria) this;
        }

        public Criteria andAppVersionsNotBetween(String value1, String value2) {
            addCriterion("APP_Versions not between", value1, value2, "appVersions");
            return (Criteria) this;
        }

        public Criteria andFactoryInfoIsNull() {
            addCriterion("Factory_Info is null");
            return (Criteria) this;
        }

        public Criteria andFactoryInfoIsNotNull() {
            addCriterion("Factory_Info is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryInfoEqualTo(String value) {
            addCriterion("Factory_Info =", value, "factoryInfo");
            return (Criteria) this;
        }

        public Criteria andFactoryInfoNotEqualTo(String value) {
            addCriterion("Factory_Info <>", value, "factoryInfo");
            return (Criteria) this;
        }

        public Criteria andFactoryInfoGreaterThan(String value) {
            addCriterion("Factory_Info >", value, "factoryInfo");
            return (Criteria) this;
        }

        public Criteria andFactoryInfoGreaterThanOrEqualTo(String value) {
            addCriterion("Factory_Info >=", value, "factoryInfo");
            return (Criteria) this;
        }

        public Criteria andFactoryInfoLessThan(String value) {
            addCriterion("Factory_Info <", value, "factoryInfo");
            return (Criteria) this;
        }

        public Criteria andFactoryInfoLessThanOrEqualTo(String value) {
            addCriterion("Factory_Info <=", value, "factoryInfo");
            return (Criteria) this;
        }

        public Criteria andFactoryInfoLike(String value) {
            addCriterion("Factory_Info like", value, "factoryInfo");
            return (Criteria) this;
        }

        public Criteria andFactoryInfoNotLike(String value) {
            addCriterion("Factory_Info not like", value, "factoryInfo");
            return (Criteria) this;
        }

        public Criteria andFactoryInfoIn(List<String> values) {
            addCriterion("Factory_Info in", values, "factoryInfo");
            return (Criteria) this;
        }

        public Criteria andFactoryInfoNotIn(List<String> values) {
            addCriterion("Factory_Info not in", values, "factoryInfo");
            return (Criteria) this;
        }

        public Criteria andFactoryInfoBetween(String value1, String value2) {
            addCriterion("Factory_Info between", value1, value2, "factoryInfo");
            return (Criteria) this;
        }

        public Criteria andFactoryInfoNotBetween(String value1, String value2) {
            addCriterion("Factory_Info not between", value1, value2, "factoryInfo");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table equipmentinfo
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table equipmentinfo
     *
     * @mbggenerated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

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

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value) {
            super();
            this.condition = condition;
            this.value = value;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.betweenValue = true;
        }
    }
}