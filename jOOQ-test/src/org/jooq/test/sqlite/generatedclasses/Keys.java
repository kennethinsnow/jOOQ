/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the  schema
 */
@SuppressWarnings({"unchecked"})
public class Keys extends org.jooq.impl.AbstractKeys {

	// IDENTITY definitions

	// UNIQUE and PRIMARY KEY definitions
	public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord> pk_t_639_numbers_table_ID = createUniqueKey(org.jooq.test.sqlite.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE, org.jooq.test.sqlite.generatedclasses.tables.T_639NumbersTable.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.T_725LobTestRecord> pk_t_725_lob_test_ID = createUniqueKey(org.jooq.test.sqlite.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST, org.jooq.test.sqlite.generatedclasses.tables.T_725LobTest.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.T_986_1Record> pk_t_986_1_REF = createUniqueKey(org.jooq.test.sqlite.generatedclasses.tables.T_986_1.T_986_1, org.jooq.test.sqlite.generatedclasses.tables.T_986_1.REF);
	public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.T_986_2Record> pk_t_986_2_REF = createUniqueKey(org.jooq.test.sqlite.generatedclasses.tables.T_986_2.T_986_2, org.jooq.test.sqlite.generatedclasses.tables.T_986_2.REF);
	public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TAuthorRecord> pk_t_author_ID = createUniqueKey(org.jooq.test.sqlite.generatedclasses.tables.TAuthor.T_AUTHOR, org.jooq.test.sqlite.generatedclasses.tables.TAuthor.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord> pk_t_book_ID = createUniqueKey(org.jooq.test.sqlite.generatedclasses.tables.TBook.T_BOOK, org.jooq.test.sqlite.generatedclasses.tables.TBook.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TBookStoreRecord> pk_t_book_store_name = createUniqueKey(org.jooq.test.sqlite.generatedclasses.tables.TBookStore.T_BOOK_STORE, org.jooq.test.sqlite.generatedclasses.tables.TBookStore.NAME);
	public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TBookToBookStoreRecord> pk_t_book_to_book_store_book_store_name = createUniqueKey(org.jooq.test.sqlite.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE, org.jooq.test.sqlite.generatedclasses.tables.TBookToBookStore.BOOK_STORE_NAME);
	public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TBookToBookStoreRecord> pk_t_book_to_book_store_book_id = createUniqueKey(org.jooq.test.sqlite.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE, org.jooq.test.sqlite.generatedclasses.tables.TBookToBookStore.BOOK_ID);
	public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TBooleansRecord> pk_t_booleans_id = createUniqueKey(org.jooq.test.sqlite.generatedclasses.tables.TBooleans.T_BOOLEANS, org.jooq.test.sqlite.generatedclasses.tables.TBooleans.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TDatesRecord> pk_t_dates_id = createUniqueKey(org.jooq.test.sqlite.generatedclasses.tables.TDates.T_DATES, org.jooq.test.sqlite.generatedclasses.tables.TDates.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TTriggersRecord> pk_t_triggers_id_generated = createUniqueKey(org.jooq.test.sqlite.generatedclasses.tables.TTriggers.T_TRIGGERS, org.jooq.test.sqlite.generatedclasses.tables.TTriggers.ID_GENERATED);
	public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_64_69Record> pk_x_test_case_64_69_ID = createUniqueKey(org.jooq.test.sqlite.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69, org.jooq.test.sqlite.generatedclasses.tables.XTestCase_64_69.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_71Record> pk_x_test_case_71_ID = createUniqueKey(org.jooq.test.sqlite.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71, org.jooq.test.sqlite.generatedclasses.tables.XTestCase_71.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_85Record> pk_x_test_case_85_id = createUniqueKey(org.jooq.test.sqlite.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85, org.jooq.test.sqlite.generatedclasses.tables.XTestCase_85.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.XUnusedRecord> pk_x_unused_ID = createUniqueKey(org.jooq.test.sqlite.generatedclasses.tables.XUnused.X_UNUSED, org.jooq.test.sqlite.generatedclasses.tables.XUnused.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.XUnusedRecord> pk_x_unused_NAME = createUniqueKey(org.jooq.test.sqlite.generatedclasses.tables.XUnused.X_UNUSED, org.jooq.test.sqlite.generatedclasses.tables.XUnused.NAME);

	// FOREIGN KEY definitions

	/**
	 * No instances
	 */
	private Keys() {}
}
