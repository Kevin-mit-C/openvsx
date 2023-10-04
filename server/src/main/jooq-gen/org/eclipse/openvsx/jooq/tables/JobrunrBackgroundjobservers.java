/*
 * This file is generated by jOOQ.
 */
package org.eclipse.openvsx.jooq.tables;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.eclipse.openvsx.jooq.Indexes;
import org.eclipse.openvsx.jooq.Keys;
import org.eclipse.openvsx.jooq.Public;
import org.eclipse.openvsx.jooq.tables.records.JobrunrBackgroundjobserversRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function16;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row16;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobrunrBackgroundjobservers extends TableImpl<JobrunrBackgroundjobserversRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>public.jobrunr_backgroundjobservers</code>
     */
    public static final JobrunrBackgroundjobservers JOBRUNR_BACKGROUNDJOBSERVERS = new JobrunrBackgroundjobservers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JobrunrBackgroundjobserversRecord> getRecordType() {
        return JobrunrBackgroundjobserversRecord.class;
    }

    /**
     * The column <code>public.jobrunr_backgroundjobservers.id</code>.
     */
    public final TableField<JobrunrBackgroundjobserversRecord, String> ID = createField(DSL.name("id"), SQLDataType.CHAR(36).nullable(false), this, "");

    /**
     * The column
     * <code>public.jobrunr_backgroundjobservers.workerpoolsize</code>.
     */
    public final TableField<JobrunrBackgroundjobserversRecord, Integer> WORKERPOOLSIZE = createField(DSL.name("workerpoolsize"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column
     * <code>public.jobrunr_backgroundjobservers.pollintervalinseconds</code>.
     */
    public final TableField<JobrunrBackgroundjobserversRecord, Integer> POLLINTERVALINSECONDS = createField(DSL.name("pollintervalinseconds"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column
     * <code>public.jobrunr_backgroundjobservers.firstheartbeat</code>.
     */
    public final TableField<JobrunrBackgroundjobserversRecord, LocalDateTime> FIRSTHEARTBEAT = createField(DSL.name("firstheartbeat"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "");

    /**
     * The column
     * <code>public.jobrunr_backgroundjobservers.lastheartbeat</code>.
     */
    public final TableField<JobrunrBackgroundjobserversRecord, LocalDateTime> LASTHEARTBEAT = createField(DSL.name("lastheartbeat"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "");

    /**
     * The column <code>public.jobrunr_backgroundjobservers.running</code>.
     */
    public final TableField<JobrunrBackgroundjobserversRecord, Integer> RUNNING = createField(DSL.name("running"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column
     * <code>public.jobrunr_backgroundjobservers.systemtotalmemory</code>.
     */
    public final TableField<JobrunrBackgroundjobserversRecord, Long> SYSTEMTOTALMEMORY = createField(DSL.name("systemtotalmemory"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column
     * <code>public.jobrunr_backgroundjobservers.systemfreememory</code>.
     */
    public final TableField<JobrunrBackgroundjobserversRecord, Long> SYSTEMFREEMEMORY = createField(DSL.name("systemfreememory"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column
     * <code>public.jobrunr_backgroundjobservers.systemcpuload</code>.
     */
    public final TableField<JobrunrBackgroundjobserversRecord, BigDecimal> SYSTEMCPULOAD = createField(DSL.name("systemcpuload"), SQLDataType.NUMERIC(3, 2).nullable(false), this, "");

    /**
     * The column
     * <code>public.jobrunr_backgroundjobservers.processmaxmemory</code>.
     */
    public final TableField<JobrunrBackgroundjobserversRecord, Long> PROCESSMAXMEMORY = createField(DSL.name("processmaxmemory"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column
     * <code>public.jobrunr_backgroundjobservers.processfreememory</code>.
     */
    public final TableField<JobrunrBackgroundjobserversRecord, Long> PROCESSFREEMEMORY = createField(DSL.name("processfreememory"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column
     * <code>public.jobrunr_backgroundjobservers.processallocatedmemory</code>.
     */
    public final TableField<JobrunrBackgroundjobserversRecord, Long> PROCESSALLOCATEDMEMORY = createField(DSL.name("processallocatedmemory"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column
     * <code>public.jobrunr_backgroundjobservers.processcpuload</code>.
     */
    public final TableField<JobrunrBackgroundjobserversRecord, BigDecimal> PROCESSCPULOAD = createField(DSL.name("processcpuload"), SQLDataType.NUMERIC(3, 2).nullable(false), this, "");

    /**
     * The column
     * <code>public.jobrunr_backgroundjobservers.deletesucceededjobsafter</code>.
     */
    public final TableField<JobrunrBackgroundjobserversRecord, String> DELETESUCCEEDEDJOBSAFTER = createField(DSL.name("deletesucceededjobsafter"), SQLDataType.VARCHAR(32), this, "");

    /**
     * The column
     * <code>public.jobrunr_backgroundjobservers.permanentlydeletejobsafter</code>.
     */
    public final TableField<JobrunrBackgroundjobserversRecord, String> PERMANENTLYDELETEJOBSAFTER = createField(DSL.name("permanentlydeletejobsafter"), SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>public.jobrunr_backgroundjobservers.name</code>.
     */
    public final TableField<JobrunrBackgroundjobserversRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(128), this, "");

    private JobrunrBackgroundjobservers(Name alias, Table<JobrunrBackgroundjobserversRecord> aliased) {
        this(alias, aliased, null);
    }

    private JobrunrBackgroundjobservers(Name alias, Table<JobrunrBackgroundjobserversRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.jobrunr_backgroundjobservers</code> table
     * reference
     */
    public JobrunrBackgroundjobservers(String alias) {
        this(DSL.name(alias), JOBRUNR_BACKGROUNDJOBSERVERS);
    }

    /**
     * Create an aliased <code>public.jobrunr_backgroundjobservers</code> table
     * reference
     */
    public JobrunrBackgroundjobservers(Name alias) {
        this(alias, JOBRUNR_BACKGROUNDJOBSERVERS);
    }

    /**
     * Create a <code>public.jobrunr_backgroundjobservers</code> table reference
     */
    public JobrunrBackgroundjobservers() {
        this(DSL.name("jobrunr_backgroundjobservers"), null);
    }

    public <O extends Record> JobrunrBackgroundjobservers(Table<O> child, ForeignKey<O, JobrunrBackgroundjobserversRecord> key) {
        super(child, key, JOBRUNR_BACKGROUNDJOBSERVERS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.JOBRUNR_BGJOBSRVRS_FSTHB_IDX, Indexes.JOBRUNR_BGJOBSRVRS_LSTHB_IDX);
    }

    @Override
    public UniqueKey<JobrunrBackgroundjobserversRecord> getPrimaryKey() {
        return Keys.JOBRUNR_BACKGROUNDJOBSERVERS_PKEY;
    }

    @Override
    public JobrunrBackgroundjobservers as(String alias) {
        return new JobrunrBackgroundjobservers(DSL.name(alias), this);
    }

    @Override
    public JobrunrBackgroundjobservers as(Name alias) {
        return new JobrunrBackgroundjobservers(alias, this);
    }

    @Override
    public JobrunrBackgroundjobservers as(Table<?> alias) {
        return new JobrunrBackgroundjobservers(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public JobrunrBackgroundjobservers rename(String name) {
        return new JobrunrBackgroundjobservers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JobrunrBackgroundjobservers rename(Name name) {
        return new JobrunrBackgroundjobservers(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public JobrunrBackgroundjobservers rename(Table<?> name) {
        return new JobrunrBackgroundjobservers(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row16 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row16<String, Integer, Integer, LocalDateTime, LocalDateTime, Integer, Long, Long, BigDecimal, Long, Long, Long, BigDecimal, String, String, String> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function16<? super String, ? super Integer, ? super Integer, ? super LocalDateTime, ? super LocalDateTime, ? super Integer, ? super Long, ? super Long, ? super BigDecimal, ? super Long, ? super Long, ? super Long, ? super BigDecimal, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function16<? super String, ? super Integer, ? super Integer, ? super LocalDateTime, ? super LocalDateTime, ? super Integer, ? super Long, ? super Long, ? super BigDecimal, ? super Long, ? super Long, ? super Long, ? super BigDecimal, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
