/*
 * This file is generated by jOOQ.
 */
package org.eclipse.openvsx.jooq.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.eclipse.openvsx.jooq.Indexes;
import org.eclipse.openvsx.jooq.Keys;
import org.eclipse.openvsx.jooq.Public;
import org.eclipse.openvsx.jooq.tables.records.FileResourceRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function6;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row6;
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
public class FileResource extends TableImpl<FileResourceRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.file_resource</code>
     */
    public static final FileResource FILE_RESOURCE = new FileResource();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FileResourceRecord> getRecordType() {
        return FileResourceRecord.class;
    }

    /**
     * The column <code>public.file_resource.id</code>.
     */
    public final TableField<FileResourceRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.file_resource.type</code>.
     */
    public final TableField<FileResourceRecord, String> TYPE = createField(DSL.name("type"), SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>public.file_resource.content</code>.
     */
    public final TableField<FileResourceRecord, byte[]> CONTENT = createField(DSL.name("content"), SQLDataType.BLOB, this, "");

    /**
     * The column <code>public.file_resource.extension_id</code>.
     */
    public final TableField<FileResourceRecord, Long> EXTENSION_ID = createField(DSL.name("extension_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.file_resource.name</code>.
     */
    public final TableField<FileResourceRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.file_resource.storage_type</code>.
     */
    public final TableField<FileResourceRecord, String> STORAGE_TYPE = createField(DSL.name("storage_type"), SQLDataType.VARCHAR(32), this, "");

    private FileResource(Name alias, Table<FileResourceRecord> aliased) {
        this(alias, aliased, null);
    }

    private FileResource(Name alias, Table<FileResourceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.file_resource</code> table reference
     */
    public FileResource(String alias) {
        this(DSL.name(alias), FILE_RESOURCE);
    }

    /**
     * Create an aliased <code>public.file_resource</code> table reference
     */
    public FileResource(Name alias) {
        this(alias, FILE_RESOURCE);
    }

    /**
     * Create a <code>public.file_resource</code> table reference
     */
    public FileResource() {
        this(DSL.name("file_resource"), null);
    }

    public <O extends Record> FileResource(Table<O> child, ForeignKey<O, FileResourceRecord> key) {
        super(child, key, FILE_RESOURCE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.FILE_RESOURCE_EXTENSION_IDX, Indexes.FILE_RESOURCE_TYPE_IDX);
    }

    @Override
    public UniqueKey<FileResourceRecord> getPrimaryKey() {
        return Keys.FILE_RESOURCE_PKEY;
    }

    @Override
    public List<ForeignKey<FileResourceRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FILE_RESOURCE__FILE_RESOURCE_EXTENSION_FKEY);
    }

    private transient ExtensionVersion _extensionVersion;

    /**
     * Get the implicit join path to the <code>public.extension_version</code>
     * table.
     */
    public ExtensionVersion extensionVersion() {
        if (_extensionVersion == null)
            _extensionVersion = new ExtensionVersion(this, Keys.FILE_RESOURCE__FILE_RESOURCE_EXTENSION_FKEY);

        return _extensionVersion;
    }

    @Override
    public FileResource as(String alias) {
        return new FileResource(DSL.name(alias), this);
    }

    @Override
    public FileResource as(Name alias) {
        return new FileResource(alias, this);
    }

    @Override
    public FileResource as(Table<?> alias) {
        return new FileResource(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public FileResource rename(String name) {
        return new FileResource(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FileResource rename(Name name) {
        return new FileResource(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public FileResource rename(Table<?> name) {
        return new FileResource(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, String, byte[], Long, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function6<? super Long, ? super String, ? super byte[], ? super Long, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function6<? super Long, ? super String, ? super byte[], ? super Long, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
