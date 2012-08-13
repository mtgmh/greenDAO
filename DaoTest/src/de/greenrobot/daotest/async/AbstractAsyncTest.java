package de.greenrobot.daotest.async;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import android.app.Application;
import de.greenrobot.dao.AsyncOperation;
import de.greenrobot.dao.AsyncOperationListener;
import de.greenrobot.dao.AsyncSession;
import de.greenrobot.dao.test.AbstractDaoSessionTest;
import de.greenrobot.daotest.DaoMaster;
import de.greenrobot.daotest.DaoSession;

public abstract class AbstractAsyncTest extends AbstractDaoSessionTest<Application, DaoMaster, DaoSession> implements
        AsyncOperationListener {

    protected AsyncSession asyncSession;
    protected List<AsyncOperation> completedOperations;

    public AbstractAsyncTest() {
        super(DaoMaster.class);
    }

    @Override
    protected void setUp() {
        super.setUp();
        asyncSession = daoSession.startAsyncSession();
        asyncSession.setListener(this);
        completedOperations = new CopyOnWriteArrayList<AsyncOperation>();
    }

    public void assertWaitForCompletion1Sec() {
        assertTrue(asyncSession.waitForCompletion(1000));
        assertTrue(asyncSession.isCompleted());
    }

    @Override
    public void onAsyncOperationCompleted(AsyncOperation operation) {
        completedOperations.add(operation);
    }

}