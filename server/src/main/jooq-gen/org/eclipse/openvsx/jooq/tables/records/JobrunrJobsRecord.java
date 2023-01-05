/*
 * This file is generated by jOOQ.
 */
package org.eclipse.openvsx.jooq.tables.records;


import java.time.LocalDateTime;

import org.eclipse.openvsx.jooq.tables.JobrunrJobs;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobrunrJobsRecord extends UpdatableRecordImpl<JobrunrJobsRecord> implements Record9<String, Integer, String, String, String, LocalDateTime, LocalDateTime, LocalDateTime, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.jobrunr_jobs.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.jobrunr_jobs.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.jobrunr_jobs.version</code>.
     */
    public void setVersion(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.jobrunr_jobs.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.jobrunr_jobs.jobasjson</code>.
     */
    public void setJobasjson(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.jobrunr_jobs.jobasjson</code>.
     */
    public String getJobasjson() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.jobrunr_jobs.jobsignature</code>.
     */
    public void setJobsignature(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.jobrunr_jobs.jobsignature</code>.
     */
    public String getJobsignature() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.jobrunr_jobs.state</code>.
     */
    public void setState(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.jobrunr_jobs.state</code>.
     */
    public String getState() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.jobrunr_jobs.createdat</code>.
     */
    public void setCreatedat(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.jobrunr_jobs.createdat</code>.
     */
    public LocalDateTime getCreatedat() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>public.jobrunr_jobs.updatedat</code>.
     */
    public void setUpdatedat(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.jobrunr_jobs.updatedat</code>.
     */
    public LocalDateTime getUpdatedat() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>public.jobrunr_jobs.scheduledat</code>.
     */
    public void setScheduledat(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.jobrunr_jobs.scheduledat</code>.
     */
    public LocalDateTime getScheduledat() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>public.jobrunr_jobs.recurringjobid</code>.
     */
    public void setRecurringjobid(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.jobrunr_jobs.recurringjobid</code>.
     */
    public String getRecurringjobid() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<String, Integer, String, String, String, LocalDateTime, LocalDateTime, LocalDateTime, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<String, Integer, String, String, String, LocalDateTime, LocalDateTime, LocalDateTime, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return JobrunrJobs.JOBRUNR_JOBS.ID;
    }

    @Override
    public Field<Integer> field2() {
        return JobrunrJobs.JOBRUNR_JOBS.VERSION;
    }

    @Override
    public Field<String> field3() {
        return JobrunrJobs.JOBRUNR_JOBS.JOBASJSON;
    }

    @Override
    public Field<String> field4() {
        return JobrunrJobs.JOBRUNR_JOBS.JOBSIGNATURE;
    }

    @Override
    public Field<String> field5() {
        return JobrunrJobs.JOBRUNR_JOBS.STATE;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return JobrunrJobs.JOBRUNR_JOBS.CREATEDAT;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return JobrunrJobs.JOBRUNR_JOBS.UPDATEDAT;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return JobrunrJobs.JOBRUNR_JOBS.SCHEDULEDAT;
    }

    @Override
    public Field<String> field9() {
        return JobrunrJobs.JOBRUNR_JOBS.RECURRINGJOBID;
    }

    @Override
    public String component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getVersion();
    }

    @Override
    public String component3() {
        return getJobasjson();
    }

    @Override
    public String component4() {
        return getJobsignature();
    }

    @Override
    public String component5() {
        return getState();
    }

    @Override
    public LocalDateTime component6() {
        return getCreatedat();
    }

    @Override
    public LocalDateTime component7() {
        return getUpdatedat();
    }

    @Override
    public LocalDateTime component8() {
        return getScheduledat();
    }

    @Override
    public String component9() {
        return getRecurringjobid();
    }

    @Override
    public String value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getVersion();
    }

    @Override
    public String value3() {
        return getJobasjson();
    }

    @Override
    public String value4() {
        return getJobsignature();
    }

    @Override
    public String value5() {
        return getState();
    }

    @Override
    public LocalDateTime value6() {
        return getCreatedat();
    }

    @Override
    public LocalDateTime value7() {
        return getUpdatedat();
    }

    @Override
    public LocalDateTime value8() {
        return getScheduledat();
    }

    @Override
    public String value9() {
        return getRecurringjobid();
    }

    @Override
    public JobrunrJobsRecord value1(String value) {
        setId(value);
        return this;
    }

    @Override
    public JobrunrJobsRecord value2(Integer value) {
        setVersion(value);
        return this;
    }

    @Override
    public JobrunrJobsRecord value3(String value) {
        setJobasjson(value);
        return this;
    }

    @Override
    public JobrunrJobsRecord value4(String value) {
        setJobsignature(value);
        return this;
    }

    @Override
    public JobrunrJobsRecord value5(String value) {
        setState(value);
        return this;
    }

    @Override
    public JobrunrJobsRecord value6(LocalDateTime value) {
        setCreatedat(value);
        return this;
    }

    @Override
    public JobrunrJobsRecord value7(LocalDateTime value) {
        setUpdatedat(value);
        return this;
    }

    @Override
    public JobrunrJobsRecord value8(LocalDateTime value) {
        setScheduledat(value);
        return this;
    }

    @Override
    public JobrunrJobsRecord value9(String value) {
        setRecurringjobid(value);
        return this;
    }

    @Override
    public JobrunrJobsRecord values(String value1, Integer value2, String value3, String value4, String value5, LocalDateTime value6, LocalDateTime value7, LocalDateTime value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JobrunrJobsRecord
     */
    public JobrunrJobsRecord() {
        super(JobrunrJobs.JOBRUNR_JOBS);
    }

    /**
     * Create a detached, initialised JobrunrJobsRecord
     */
    public JobrunrJobsRecord(String id, Integer version, String jobasjson, String jobsignature, String state, LocalDateTime createdat, LocalDateTime updatedat, LocalDateTime scheduledat, String recurringjobid) {
        super(JobrunrJobs.JOBRUNR_JOBS);

        setId(id);
        setVersion(version);
        setJobasjson(jobasjson);
        setJobsignature(jobsignature);
        setState(state);
        setCreatedat(createdat);
        setUpdatedat(updatedat);
        setScheduledat(scheduledat);
        setRecurringjobid(recurringjobid);
    }
}
