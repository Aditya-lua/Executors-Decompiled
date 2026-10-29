package backtraceio.library.models.database;

import backtraceio.library.enums.database.RetryBehavior;
import backtraceio.library.enums.database.RetryOrder;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceDatabaseSettings {
    private long _maxDatabaseSize;
    private boolean autoSendMode;
    private String databasePath;
    private int maxRecordCount;
    private RetryBehavior retryBehavior;
    private int retryInterval;
    private int retryLimit;
    private RetryOrder retryOrder;

    public BacktraceDatabaseSettings(String str) {
        this(str, RetryOrder.Queue);
    }

    public String getDatabasePath() {
        return this.databasePath;
    }

    public long getMaxDatabaseSize() {
        return this._maxDatabaseSize * 1000000;
    }

    public int getMaxRecordCount() {
        return this.maxRecordCount;
    }

    public RetryBehavior getRetryBehavior() {
        return this.retryBehavior;
    }

    public int getRetryInterval() {
        return this.retryInterval;
    }

    public int getRetryLimit() {
        return this.retryLimit;
    }

    public RetryOrder getRetryOrder() {
        return this.retryOrder;
    }

    public boolean isAutoSendMode() {
        return this.autoSendMode;
    }

    public void setAutoSendMode(boolean z10) {
        this.autoSendMode = z10;
    }

    public void setDatabasePath(String str) {
        this.databasePath = str;
    }

    public void setMaxDatabaseSize(long j10) {
        this._maxDatabaseSize = j10;
    }

    public void setMaxRecordCount(int i10) {
        this.maxRecordCount = i10;
    }

    public void setRetryBehavior(RetryBehavior retryBehavior) {
        this.retryBehavior = retryBehavior;
    }

    public void setRetryInterval(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Retry interval value must be grader than zero");
        }
        this.retryInterval = i10;
    }

    public void setRetryLimit(int i10) {
        if (this.retryInterval <= 0) {
            throw new IllegalArgumentException("Retry limit value must be grader than zero");
        }
        this.retryLimit = i10;
    }

    public void setRetryOrder(RetryOrder retryOrder) {
        this.retryOrder = retryOrder;
    }

    public BacktraceDatabaseSettings(String str, RetryOrder retryOrder) {
        this.maxRecordCount = 0;
        this._maxDatabaseSize = 0L;
        this.autoSendMode = false;
        this.retryBehavior = RetryBehavior.ByInterval;
        this.retryInterval = 5;
        this.retryLimit = 3;
        RetryOrder retryOrder2 = RetryOrder.Stack;
        this.databasePath = str;
        this.retryOrder = retryOrder;
    }
}
