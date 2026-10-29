package backtraceio.library.services;

import android.content.Context;
import backtraceio.library.enums.database.RetryOrder;
import backtraceio.library.interfaces.DatabaseContext;
import backtraceio.library.logger.BacktraceLogger;
import backtraceio.library.models.BacktraceData;
import backtraceio.library.models.database.BacktraceDatabaseRecord;
import backtraceio.library.models.database.BacktraceDatabaseSettings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceDatabaseContext implements DatabaseContext {
    private static final transient String LOG_TAG = "BacktraceDatabaseContext";
    private final String _path;
    private final int _retryNumber;
    private final Map<Integer, Queue<BacktraceDatabaseRecord>> batchRetry;
    private final RetryOrder retryOrder;
    private final AtomicInteger totalRecords;
    private final AtomicLong totalSize;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public BacktraceDatabaseContext(Context context, BacktraceDatabaseSettings backtraceDatabaseSettings) {
        this(backtraceDatabaseSettings);
    }

    private void addToFirstBatch(BacktraceDatabaseRecord backtraceDatabaseRecord) {
        if (this.batchRetry.isEmpty()) {
            this.batchRetry.put(0, new ConcurrentLinkedQueue());
        }
        Queue<BacktraceDatabaseRecord> concurrentLinkedQueue = this.batchRetry.get(0);
        if (concurrentLinkedQueue == null) {
            concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
            this.batchRetry.put(0, concurrentLinkedQueue);
        }
        concurrentLinkedQueue.add(backtraceDatabaseRecord);
    }

    private BacktraceDatabaseRecord getFirstRecord() {
        return getRecordFromCache(false);
    }

    private BacktraceDatabaseRecord getLastRecord() {
        return getRecordFromCache(true);
    }

    private BacktraceDatabaseRecord getRecordFromCache(boolean z10) {
        for (int i10 = this._retryNumber - 1; i10 >= 0; i10--) {
            Collection<BacktraceDatabaseRecord> collection = (Queue) this.batchRetry.get(Integer.valueOf(i10));
            if (collection != null) {
                if (z10) {
                    ArrayList arrayList = new ArrayList(collection);
                    Collections.reverse(arrayList);
                    collection = arrayList;
                }
                for (BacktraceDatabaseRecord backtraceDatabaseRecord : collection) {
                    if (backtraceDatabaseRecord != null && !backtraceDatabaseRecord.locked) {
                        backtraceDatabaseRecord.locked = true;
                        return backtraceDatabaseRecord;
                    }
                }
            }
        }
        return null;
    }

    private void incrementBatches() {
        for (int i10 = this._retryNumber - 2; i10 >= 0; i10--) {
            Queue<BacktraceDatabaseRecord> queue = this.batchRetry.get(Integer.valueOf(i10));
            this.batchRetry.put(Integer.valueOf(i10), new ConcurrentLinkedQueue());
            this.batchRetry.put(Integer.valueOf(i10 + 1), queue);
        }
    }

    private void removeMaxRetries() {
        for (BacktraceDatabaseRecord backtraceDatabaseRecord : this.batchRetry.get(Integer.valueOf(this._retryNumber - 1))) {
            if (backtraceDatabaseRecord.valid()) {
                backtraceDatabaseRecord.delete();
                this.totalRecords.decrementAndGet();
                this.totalSize.addAndGet(-backtraceDatabaseRecord.getSize());
            }
        }
    }

    private void setupBatch() {
        if (this._retryNumber <= 0) {
            throw new IllegalArgumentException("Retry number must be greater than 0!");
        }
        for (int i10 = 0; i10 < this._retryNumber; i10++) {
            this.batchRetry.put(Integer.valueOf(i10), new ConcurrentLinkedQueue());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // backtraceio.library.interfaces.DatabaseContext
    public BacktraceDatabaseRecord add(BacktraceData backtraceData) {
        String str = LOG_TAG;
        BacktraceLogger.m7080d(str, "Adding new record to database context");
        if (backtraceData == null) {
            BacktraceLogger.m7081e(str, "BacktraceData is null");
            throw new NullPointerException("BacktraceData");
        }
        BacktraceDatabaseRecord backtraceDatabaseRecord = new BacktraceDatabaseRecord(backtraceData, this._path);
        backtraceDatabaseRecord.save();
        return add(backtraceDatabaseRecord);
    }

    @Override // backtraceio.library.interfaces.DatabaseContext
    public void clear() {
        BacktraceLogger.m7080d(LOG_TAG, "Deleting all records from database context");
        Iterator<Map.Entry<Integer, Queue<BacktraceDatabaseRecord>>> it = this.batchRetry.entrySet().iterator();
        while (it.hasNext()) {
            Iterator<BacktraceDatabaseRecord> it2 = it.next().getValue().iterator();
            while (it2.hasNext()) {
                it2.next().delete();
            }
        }
        this.totalRecords.set(0);
        this.totalSize.set(0L);
        Iterator<Map.Entry<Integer, Queue<BacktraceDatabaseRecord>>> it3 = this.batchRetry.entrySet().iterator();
        while (it3.hasNext()) {
            it3.next().getValue().clear();
        }
    }

    @Override // backtraceio.library.interfaces.DatabaseContext
    public boolean contains(BacktraceDatabaseRecord backtraceDatabaseRecord) {
        if (backtraceDatabaseRecord == null) {
            throw new NullPointerException("BacktraceDatabaseRecord");
        }
        Iterator<Map.Entry<Integer, Queue<BacktraceDatabaseRecord>>> it = this.batchRetry.entrySet().iterator();
        while (it.hasNext()) {
            for (BacktraceDatabaseRecord backtraceDatabaseRecord2 : it.next().getValue()) {
                if (backtraceDatabaseRecord2 != null && backtraceDatabaseRecord2.f5328id == backtraceDatabaseRecord.f5328id) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // backtraceio.library.interfaces.DatabaseContext
    public int count() {
        return this.totalRecords.get();
    }

    @Override // backtraceio.library.interfaces.DatabaseContext
    public boolean delete(BacktraceDatabaseRecord backtraceDatabaseRecord) {
        if (backtraceDatabaseRecord == null) {
            return false;
        }
        for (Integer num : this.batchRetry.keySet()) {
            num.intValue();
            Queue<BacktraceDatabaseRecord> queue = this.batchRetry.get(num);
            if (queue != null) {
                Iterator<BacktraceDatabaseRecord> it = queue.iterator();
                while (it.hasNext()) {
                    BacktraceDatabaseRecord next = it.next();
                    if (next != null && backtraceDatabaseRecord.f5328id.equals(next.f5328id)) {
                        next.delete();
                        try {
                            it.remove();
                            this.totalRecords.decrementAndGet();
                            this.totalSize.addAndGet(-next.getSize());
                            return true;
                        } catch (Exception e10) {
                            BacktraceLogger.m7080d(LOG_TAG, "Exception on removing record " + next.f5328id + " from db context: " + e10.getMessage());
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // backtraceio.library.interfaces.DatabaseContext
    public BacktraceDatabaseRecord first() {
        return this.retryOrder == RetryOrder.Queue ? getFirstRecord() : getLastRecord();
    }

    @Override // backtraceio.library.interfaces.DatabaseContext
    public Iterable<BacktraceDatabaseRecord> get() {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<Integer, Queue<BacktraceDatabaseRecord>>> it = this.batchRetry.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().getValue());
        }
        return arrayList;
    }

    @Override // backtraceio.library.interfaces.DatabaseContext
    public long getDatabaseSize() {
        return this.totalSize.get();
    }

    @Override // backtraceio.library.interfaces.DatabaseContext
    public void incrementBatchRetry() {
        removeMaxRetries();
        incrementBatches();
    }

    @Override // backtraceio.library.interfaces.DatabaseContext
    public boolean isEmpty() {
        return this.totalRecords.get() == 0;
    }

    @Override // backtraceio.library.interfaces.DatabaseContext
    public BacktraceDatabaseRecord last() {
        return this.retryOrder == RetryOrder.Queue ? getLastRecord() : getFirstRecord();
    }

    @Override // backtraceio.library.interfaces.DatabaseContext
    public boolean removeOldestRecord() {
        String str = LOG_TAG;
        BacktraceLogger.m7080d(str, "Removing oldest record from database context");
        BacktraceDatabaseRecord backtraceDatabaseRecordFirst = first();
        if (backtraceDatabaseRecordFirst != null) {
            return delete(backtraceDatabaseRecordFirst);
        }
        BacktraceLogger.m7083w(str, "Oldest record in database is null");
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public BacktraceDatabaseContext(BacktraceDatabaseSettings backtraceDatabaseSettings) {
        this(backtraceDatabaseSettings.getDatabasePath(), backtraceDatabaseSettings.getRetryLimit(), backtraceDatabaseSettings.getRetryOrder());
    }

    private BacktraceDatabaseContext(String str, int i10, RetryOrder retryOrder) {
        this.batchRetry = new ConcurrentHashMap();
        this.totalSize = new AtomicLong(0L);
        this.totalRecords = new AtomicInteger(0);
        this._path = str;
        this._retryNumber = i10;
        this.retryOrder = retryOrder;
        setupBatch();
    }

    @Override // backtraceio.library.interfaces.DatabaseContext
    public BacktraceDatabaseRecord add(BacktraceDatabaseRecord backtraceDatabaseRecord) {
        String str = LOG_TAG;
        BacktraceLogger.m7080d(str, "Adding new record to database context");
        if (backtraceDatabaseRecord != null) {
            backtraceDatabaseRecord.locked = true;
            this.totalSize.addAndGet(backtraceDatabaseRecord.getSize());
            addToFirstBatch(backtraceDatabaseRecord);
            this.totalRecords.incrementAndGet();
            return backtraceDatabaseRecord;
        }
        BacktraceLogger.m7081e(str, "Backtrace database record is null");
        throw new NullPointerException("BacktraceDatabaseRecord");
    }
}
