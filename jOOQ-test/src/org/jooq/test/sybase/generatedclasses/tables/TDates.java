/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class TDates extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.sybase.generatedclasses.tables.records.TDatesRecord> {

	private static final long serialVersionUID = -791387632;

	/**
	 * The singleton instance of t_dates
	 */
	public static final org.jooq.test.sybase.generatedclasses.tables.TDates T_DATES = new org.jooq.test.sybase.generatedclasses.tables.TDates();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.sybase.generatedclasses.tables.records.TDatesRecord> __RECORD_TYPE = org.jooq.test.sybase.generatedclasses.tables.records.TDatesRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sybase.generatedclasses.tables.records.TDatesRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TDatesRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TDatesRecord, java.sql.Date> D = createField("d", org.jooq.impl.SQLDataType.DATE, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TDatesRecord, java.sql.Time> T = createField("t", org.jooq.impl.SQLDataType.TIME, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TDatesRecord, java.sql.Timestamp> TS = createField("ts", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TDatesRecord, java.lang.Integer> D_INT = createField("d_int", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TDatesRecord, java.lang.Long> TS_BIGINT = createField("ts_bigint", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * No further instances allowed
	 */
	private TDates() {
		super("t_dates", org.jooq.test.sybase.generatedclasses.Dba.DBA);
	}

	/**
	 * No further instances allowed
	 */
	private TDates(java.lang.String alias) {
		super(alias, org.jooq.test.sybase.generatedclasses.Dba.DBA, org.jooq.test.sybase.generatedclasses.tables.TDates.T_DATES);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TDatesRecord> getMainKey() {
		return org.jooq.test.sybase.generatedclasses.Keys.t_dates__pk_t_dates;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TDatesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TDatesRecord>>asList(org.jooq.test.sybase.generatedclasses.Keys.t_dates__pk_t_dates);
	}

	@Override
	public org.jooq.test.sybase.generatedclasses.tables.TDates as(java.lang.String alias) {
		return new org.jooq.test.sybase.generatedclasses.tables.TDates(alias);
	}
}
