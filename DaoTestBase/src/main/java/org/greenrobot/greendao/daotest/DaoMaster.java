package org.greenrobot.greendao.daotest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.util.Log;

import org.greenrobot.greendao.AbstractDaoMaster;
import org.greenrobot.greendao.database.StandardDatabase;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.EncryptedDatabaseOpenHelper;
import org.greenrobot.greendao.database.DatabaseOpenHelper;
import org.greenrobot.greendao.identityscope.IdentityScopeType;

import org.greenrobot.greendao.daotest.SimpleEntityDao;
import org.greenrobot.greendao.daotest.SimpleEntityNotNullDao;
import org.greenrobot.greendao.daotest.TestEntityDao;
import org.greenrobot.greendao.daotest.RelationEntityDao;
import org.greenrobot.greendao.daotest.DateEntityDao;
import org.greenrobot.greendao.daotest.SpecialNamesEntityDao;
import org.greenrobot.greendao.daotest.AbcdefEntityDao;
import org.greenrobot.greendao.daotest.ToManyTargetEntityDao;
import org.greenrobot.greendao.daotest.ToManyEntityDao;
import org.greenrobot.greendao.daotest.JoinManyToDateEntityDao;
import org.greenrobot.greendao.daotest.TreeEntityDao;
import org.greenrobot.greendao.daotest.AnActiveEntityDao;
import org.greenrobot.greendao.daotest.ExtendsImplementsEntityDao;
import org.greenrobot.greendao.daotest.StringKeyValueEntityDao;
import org.greenrobot.greendao.daotest.AutoincrementEntityDao;
import org.greenrobot.greendao.daotest.SqliteMasterDao;
import org.greenrobot.greendao.daotest.CustomTypeEntityDao;
import org.greenrobot.greendao.daotest.IndexedStringEntityDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * Master of DAO (schema version 1): knows all DAOs.
*/
public class DaoMaster extends AbstractDaoMaster {
    public static final int SCHEMA_VERSION = 1;

    /** Creates underlying database table using DAOs. */
    public static void createAllTables(Database db, boolean ifNotExists) {
        SimpleEntityDao.createTable(db, ifNotExists);
        SimpleEntityNotNullDao.createTable(db, ifNotExists);
        TestEntityDao.createTable(db, ifNotExists);
        RelationEntityDao.createTable(db, ifNotExists);
        DateEntityDao.createTable(db, ifNotExists);
        SpecialNamesEntityDao.createTable(db, ifNotExists);
        AbcdefEntityDao.createTable(db, ifNotExists);
        ToManyTargetEntityDao.createTable(db, ifNotExists);
        ToManyEntityDao.createTable(db, ifNotExists);
        JoinManyToDateEntityDao.createTable(db, ifNotExists);
        TreeEntityDao.createTable(db, ifNotExists);
        AnActiveEntityDao.createTable(db, ifNotExists);
        ExtendsImplementsEntityDao.createTable(db, ifNotExists);
        StringKeyValueEntityDao.createTable(db, ifNotExists);
        AutoincrementEntityDao.createTable(db, ifNotExists);
        CustomTypeEntityDao.createTable(db, ifNotExists);
        IndexedStringEntityDao.createTable(db, ifNotExists);
    }
    
    /** Drops underlying database table using DAOs. */
    public static void dropAllTables(Database db, boolean ifExists) {
        SimpleEntityDao.dropTable(db, ifExists);
        SimpleEntityNotNullDao.dropTable(db, ifExists);
        TestEntityDao.dropTable(db, ifExists);
        RelationEntityDao.dropTable(db, ifExists);
        DateEntityDao.dropTable(db, ifExists);
        SpecialNamesEntityDao.dropTable(db, ifExists);
        AbcdefEntityDao.dropTable(db, ifExists);
        ToManyTargetEntityDao.dropTable(db, ifExists);
        ToManyEntityDao.dropTable(db, ifExists);
        JoinManyToDateEntityDao.dropTable(db, ifExists);
        TreeEntityDao.dropTable(db, ifExists);
        AnActiveEntityDao.dropTable(db, ifExists);
        ExtendsImplementsEntityDao.dropTable(db, ifExists);
        StringKeyValueEntityDao.dropTable(db, ifExists);
        AutoincrementEntityDao.dropTable(db, ifExists);
        CustomTypeEntityDao.dropTable(db, ifExists);
        IndexedStringEntityDao.dropTable(db, ifExists);
    }
    
    public static abstract class OpenHelper extends DatabaseOpenHelper {
        public OpenHelper(Context context, String name) {
            super(context, name, SCHEMA_VERSION);
        }
        public OpenHelper(Context context, String name, CursorFactory factory) {
            super(context, name, factory, SCHEMA_VERSION);
        }

        @Override
        public void onCreate(Database db) {
            Log.i("greenDAO", "Creating tables for schema version " + SCHEMA_VERSION);
            createAllTables(db, false);
        }
    }
    
    /** WARNING: Drops all table on Upgrade! Use only during development. */
    public static class DevOpenHelper extends OpenHelper {
        public DevOpenHelper(Context context, String name) {
            super(context, name);
        }

        @Override
        public void onUpgrade(Database db, int oldVersion, int newVersion) {
            Log.i("greenDAO", "Upgrading schema from version " + oldVersion + " to " + newVersion + " by dropping all tables");
            dropAllTables(db, true);
            onCreate(db);
        }
    }

    public static abstract class EncryptedOpenHelper extends EncryptedDatabaseOpenHelper {
        public EncryptedOpenHelper(Context context, String name) {
            super(context, name, SCHEMA_VERSION);
        }

        public EncryptedOpenHelper(Context context, String name, Object cursorFactory, boolean loadNativeLibs) {
            super(context, name, cursorFactory, SCHEMA_VERSION, loadNativeLibs);
        }

        @Override
        public void onCreate(Database db) {
            Log.i("greenDAO", "Creating tables for schema version " + SCHEMA_VERSION);
            createAllTables(db, false);
        }
    }

    /** WARNING: Drops all table on Upgrade! Use only during development. */
    public static class EncryptedDevOpenHelper extends EncryptedOpenHelper {
        public EncryptedDevOpenHelper(Context context, String name) {
            super(context, name);
        }

        public EncryptedDevOpenHelper(Context context, String name, Object cursorFactory, boolean loadNativeLibs) {
            super(context, name, cursorFactory, loadNativeLibs);
        }

        @Override
        public void onUpgrade(Database db, int oldVersion, int newVersion) {
            Log.i("greenDAO", "Upgrading schema from version " + oldVersion + " to " + newVersion + " by dropping all tables");
            dropAllTables(db, true);
            onCreate(db);
        }
    }

    public DaoMaster(SQLiteDatabase db) {
        this(new StandardDatabase(db));
    }

    public DaoMaster(Database db) {
        super(db, SCHEMA_VERSION);
        registerDaoClass(SimpleEntityDao.class);
        registerDaoClass(SimpleEntityNotNullDao.class);
        registerDaoClass(TestEntityDao.class);
        registerDaoClass(RelationEntityDao.class);
        registerDaoClass(DateEntityDao.class);
        registerDaoClass(SpecialNamesEntityDao.class);
        registerDaoClass(AbcdefEntityDao.class);
        registerDaoClass(ToManyTargetEntityDao.class);
        registerDaoClass(ToManyEntityDao.class);
        registerDaoClass(JoinManyToDateEntityDao.class);
        registerDaoClass(TreeEntityDao.class);
        registerDaoClass(AnActiveEntityDao.class);
        registerDaoClass(ExtendsImplementsEntityDao.class);
        registerDaoClass(StringKeyValueEntityDao.class);
        registerDaoClass(AutoincrementEntityDao.class);
        registerDaoClass(SqliteMasterDao.class);
        registerDaoClass(CustomTypeEntityDao.class);
        registerDaoClass(IndexedStringEntityDao.class);
    }
    
    public DaoSession newSession() {
        return new DaoSession(db, IdentityScopeType.Session, daoConfigMap);
    }
    
    public DaoSession newSession(IdentityScopeType type) {
        return new DaoSession(db, type, daoConfigMap);
    }
    
}