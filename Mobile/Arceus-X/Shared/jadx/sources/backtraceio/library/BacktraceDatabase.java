package backtraceio.library;

import android.content.Context;
import backtraceio.library.BacktraceDatabase;
import backtraceio.library.base.BacktraceBase;
import backtraceio.library.breadcrumbs.BacktraceBreadcrumbs;
import backtraceio.library.common.FileHelper;
import backtraceio.library.common.TypeHelper;
import backtraceio.library.common.serialization.DebugHelper;
import backtraceio.library.enums.UnwindingMode;
import backtraceio.library.enums.database.RetryBehavior;
import backtraceio.library.events.OnServerResponseEventListener;
import backtraceio.library.events.OnSuccessfulBreadcrumbAddEventListener;
import backtraceio.library.interfaces.Api;
import backtraceio.library.interfaces.Breadcrumbs;
import backtraceio.library.interfaces.Database;
import backtraceio.library.interfaces.DatabaseContext;
import backtraceio.library.interfaces.DatabaseFileContext;
import backtraceio.library.interfaces.NativeCommunication;
import backtraceio.library.logger.BacktraceLogger;
import backtraceio.library.models.BacktraceAttributeConsts;
import backtraceio.library.models.BacktraceData;
import backtraceio.library.models.BacktraceResult;
import backtraceio.library.models.database.BacktraceDatabaseRecord;
import backtraceio.library.models.database.BacktraceDatabaseSettings;
import backtraceio.library.models.json.BacktraceAttributes;
import backtraceio.library.models.json.BacktraceReport;
import backtraceio.library.models.nativeHandler.CrashHandlerConfiguration;
import backtraceio.library.models.types.BacktraceResultStatus;
import backtraceio.library.nativeCalls.BacktraceCrashHandlerWrapper;
import backtraceio.library.services.BacktraceDatabaseContext;
import backtraceio.library.services.BacktraceDatabaseFileContext;
import java.io.File;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;
import p210j6.C7033b;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceDatabase implements Database {

    /* JADX INFO: renamed from: l */
    public static boolean f5306l;

    /* JADX INFO: renamed from: m */
    public static Timer f5307m;

    /* JADX INFO: renamed from: a */
    public final transient String f5308a;

    /* JADX INFO: renamed from: b */
    public Api f5309b;

    /* JADX INFO: renamed from: c */
    public Context f5310c;

    /* JADX INFO: renamed from: d */
    public DatabaseContext f5311d;

    /* JADX INFO: renamed from: e */
    public DatabaseFileContext f5312e;

    /* JADX INFO: renamed from: f */
    public BacktraceDatabaseSettings f5313f;

    /* JADX INFO: renamed from: g */
    public boolean f5314g;

    /* JADX INFO: renamed from: h */
    public Breadcrumbs f5315h;

    /* JADX INFO: renamed from: i */
    public CrashHandlerConfiguration f5316i;

    /* JADX INFO: renamed from: j */
    public boolean f5317j;

    /* JADX INFO: renamed from: k */
    public NativeCommunication f5318k;

    /* JADX INFO: renamed from: backtraceio.library.BacktraceDatabase$a */
    public class C1279a extends TimerTask {

        /* JADX INFO: renamed from: backtraceio.library.BacktraceDatabase$a$a */
        public class a implements OnServerResponseEventListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ BacktraceDatabaseRecord f5320a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ CountDownLatch f5321b;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public a(BacktraceDatabaseRecord backtraceDatabaseRecord, CountDownLatch countDownLatch) {
                this.f5320a = backtraceDatabaseRecord;
                this.f5321b = countDownLatch;
            }

            @Override // backtraceio.library.events.OnServerResponseEventListener
            public void onEvent(BacktraceResult backtraceResult) {
                if (backtraceResult.status == BacktraceResultStatus.Ok) {
                    BacktraceLogger.m7080d(BacktraceDatabase.this.f5308a, "Timer - deleting record");
                    BacktraceDatabase.this.delete(this.f5320a);
                } else {
                    BacktraceLogger.m7080d(BacktraceDatabase.this.f5308a, "Timer - closing record");
                    this.f5320a.close();
                }
                this.f5321b.countDown();
            }
        }

        public C1279a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            String string = Calendar.getInstance().getTime().toString();
            BacktraceLogger.m7080d(BacktraceDatabase.this.f5308a, "Timer - " + string);
            if (BacktraceDatabase.this.f5311d == null) {
                BacktraceLogger.m7083w(BacktraceDatabase.this.f5308a, "Timer - database context is null: " + string);
                return;
            }
            if (BacktraceDatabase.this.f5311d.isEmpty()) {
                BacktraceLogger.m7080d(BacktraceDatabase.this.f5308a, "Timer - database is empty (no records): " + string);
                return;
            }
            if (BacktraceDatabase.f5306l) {
                BacktraceLogger.m7080d(BacktraceDatabase.this.f5308a, "Timer - another timer works now: " + string);
                return;
            }
            BacktraceLogger.m7080d(BacktraceDatabase.this.f5308a, "Timer - continue working: " + string);
            boolean unused = BacktraceDatabase.f5306l = true;
            BacktraceDatabase.f5307m.cancel();
            BacktraceDatabase.f5307m.purge();
            Timer unused2 = BacktraceDatabase.f5307m = null;
            BacktraceDatabaseRecord backtraceDatabaseRecordFirst = BacktraceDatabase.this.f5311d.first();
            while (backtraceDatabaseRecordFirst != null) {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                BacktraceData backtraceData = backtraceDatabaseRecordFirst.getBacktraceData();
                if (backtraceData != null && backtraceData.getReport() != null) {
                    BacktraceDatabase.this.f5309b.send(backtraceData, new a(backtraceDatabaseRecordFirst, countDownLatch));
                    try {
                        countDownLatch.await();
                    } catch (Exception e10) {
                        BacktraceLogger.m7082e(BacktraceDatabase.this.f5308a, "Error during waiting for result in Timer", e10);
                    }
                    if (backtraceDatabaseRecordFirst.valid() && !backtraceDatabaseRecordFirst.locked) {
                        BacktraceLogger.m7080d(BacktraceDatabase.this.f5308a, "Timer - record is valid and unlocked");
                        break;
                    }
                } else {
                    BacktraceLogger.m7080d(BacktraceDatabase.this.f5308a, "Timer - backtrace data or report is null - deleting record");
                    BacktraceDatabase.this.delete(backtraceDatabaseRecordFirst);
                }
                backtraceDatabaseRecordFirst = BacktraceDatabase.this.f5311d.first();
            }
            BacktraceLogger.m7080d(BacktraceDatabase.this.f5308a, "Setup new timer");
            boolean unused3 = BacktraceDatabase.f5306l = false;
            BacktraceDatabase.this.m7073n();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BacktraceDatabase() {
        String simpleName = BacktraceDatabase.class.getSimpleName();
        this.f5308a = simpleName;
        this.f5314g = false;
        this.f5317j = false;
        this.f5318k = new BacktraceCrashHandlerWrapper();
        BacktraceLogger.m7083w(simpleName, "Disabled instance of BacktraceDatabase created, native crashes won't be captured");
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m7060a(BacktraceDatabase backtraceDatabase, long j10) {
        backtraceDatabase.getClass();
        backtraceDatabase.addAttribute("breadcrumbs.lastId", Long.toString(j10));
    }

    private native void disable();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // backtraceio.library.interfaces.Database
    public BacktraceDatabaseRecord add(BacktraceReport backtraceReport, Map<String, Object> map) {
        return add(backtraceReport, map, false);
    }

    public native void addAttribute(String str, String str2);

    @Override // backtraceio.library.interfaces.Database
    public Boolean addNativeAttribute(String str, Object obj) {
        if (!this.f5317j) {
            return Boolean.FALSE;
        }
        if (str == null || obj == null) {
            return Boolean.FALSE;
        }
        if (!TypeHelper.isPrimitiveOrPrimitiveWrapperOrString(obj.getClass())) {
            return Boolean.FALSE;
        }
        addAttribute(str, obj.toString());
        return Boolean.TRUE;
    }

    @Override // backtraceio.library.interfaces.Database
    public void clear() {
        DatabaseContext databaseContext = this.f5311d;
        if (databaseContext != null) {
            databaseContext.clear();
        }
        DatabaseFileContext databaseFileContext = this.f5312e;
        if (databaseFileContext != null) {
            databaseFileContext.clear();
        }
    }

    @Override // backtraceio.library.interfaces.Database
    public void delete(BacktraceDatabaseRecord backtraceDatabaseRecord) {
        DatabaseContext databaseContext = this.f5311d;
        if (databaseContext == null || backtraceDatabaseRecord == null) {
            return;
        }
        databaseContext.delete(backtraceDatabaseRecord);
    }

    @Override // backtraceio.library.interfaces.Database
    public void disableNativeIntegration() {
        disable();
        this.f5317j = false;
    }

    @Override // backtraceio.library.interfaces.Database
    public void flush() {
        if (this.f5309b == null) {
            throw new IllegalArgumentException("BacktraceApi is required if you want to use Flush method");
        }
        BacktraceDatabaseRecord backtraceDatabaseRecordFirst = this.f5311d.first();
        while (backtraceDatabaseRecordFirst != null) {
            BacktraceData backtraceData = backtraceDatabaseRecordFirst.getBacktraceData();
            delete(backtraceDatabaseRecordFirst);
            if (backtraceData != null) {
                this.f5309b.send(backtraceData, null);
            }
            backtraceDatabaseRecordFirst = this.f5311d.first();
        }
    }

    @Override // backtraceio.library.interfaces.Database
    public Iterable<BacktraceDatabaseRecord> get() {
        DatabaseContext databaseContext = this.f5311d;
        if (databaseContext == null) {
            return null;
        }
        return databaseContext.get();
    }

    @Override // backtraceio.library.interfaces.Database
    public Breadcrumbs getBreadcrumbs() {
        return this.f5315h;
    }

    @Override // backtraceio.library.interfaces.Database
    public long getDatabaseSize() {
        return this.f5311d.getDatabaseSize();
    }

    @Override // backtraceio.library.interfaces.Database
    public BacktraceDatabaseSettings getSettings() {
        return this.f5313f;
    }

    /* JADX INFO: renamed from: j */
    public final String m7069j() {
        return this.f5313f.getDatabasePath();
    }

    /* JADX INFO: renamed from: k */
    public final void m7070k() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        m7071l();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        BacktraceLogger.m7080d(this.f5308a, "Loading " + this.f5311d.count() + " reports took " + (jCurrentTimeMillis2 - jCurrentTimeMillis) + " milliseconds");
    }

    /* JADX INFO: renamed from: l */
    public final void m7071l() {
        Iterator<File> it = this.f5312e.getRecords().iterator();
        while (it.hasNext()) {
            BacktraceDatabaseRecord fromFile = BacktraceDatabaseRecord.readFromFile(it.next());
            if (fromFile != null) {
                if (fromFile.valid()) {
                    this.f5311d.add(fromFile);
                    m7074o();
                    fromFile.close();
                } else {
                    fromFile.delete();
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m7072m() {
        this.f5312e.removeOrphaned(this.f5311d.get());
    }

    /* JADX INFO: renamed from: n */
    public final void m7073n() {
        Timer timer = new Timer();
        f5307m = timer;
        timer.scheduleAtFixedRate(new C1279a(), this.f5313f.getRetryInterval() * 1000, this.f5313f.getRetryInterval() * 1000);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m7074o() {
        if (this.f5311d.count() + 1 > this.f5313f.getMaxRecordCount() && this.f5313f.getMaxRecordCount() != 0 && !this.f5311d.removeOldestRecord()) {
            BacktraceLogger.m7081e(this.f5308a, "Can't remove last record. Database size is invalid");
            return false;
        }
        if (this.f5313f.getMaxDatabaseSize() == 0 || this.f5311d.getDatabaseSize() <= this.f5313f.getMaxDatabaseSize()) {
            return true;
        }
        int i10 = 5;
        while (this.f5311d.getDatabaseSize() > this.f5313f.getMaxDatabaseSize()) {
            this.f5311d.removeOldestRecord();
            i10--;
            if (i10 == 0) {
                break;
            }
        }
        return i10 != 0;
    }

    @Override // backtraceio.library.interfaces.Database
    public void setApi(Api api) {
        this.f5309b = api;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // backtraceio.library.interfaces.Database
    public Boolean setupNativeIntegration(BacktraceBase backtraceBase, C7033b c7033b) {
        return setupNativeIntegration(backtraceBase, c7033b, false);
    }

    @Override // backtraceio.library.interfaces.Database
    public void start() {
        if (this.f5313f == null) {
            return;
        }
        DatabaseContext databaseContext = this.f5311d;
        if (databaseContext != null && !databaseContext.isEmpty()) {
            this.f5314g = true;
            return;
        }
        m7070k();
        m7072m();
        if (this.f5313f.getRetryBehavior() == RetryBehavior.ByInterval || this.f5313f.isAutoSendMode()) {
            m7073n();
        }
        this.f5314g = true;
    }

    @Override // backtraceio.library.interfaces.Database
    public boolean validConsistency() {
        return this.f5312e.validFileConsistency();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // backtraceio.library.interfaces.Database
    public BacktraceDatabaseRecord add(BacktraceReport backtraceReport, Map<String, Object> map, boolean z10) {
        if (!this.f5314g || backtraceReport == null || !m7074o()) {
            return null;
        }
        return this.f5311d.add(backtraceReport.toBacktraceData(this.f5310c, map, z10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // backtraceio.library.interfaces.Database
    public Boolean setupNativeIntegration(BacktraceBase backtraceBase, C7033b c7033b, boolean z10) {
        return setupNativeIntegration(backtraceBase, c7033b, z10, UnwindingMode.REMOTE_DUMPWITHOUTCRASH);
    }

    @Override // backtraceio.library.interfaces.Database
    public Boolean setupNativeIntegration(BacktraceBase backtraceBase, C7033b c7033b, boolean z10, UnwindingMode unwindingMode) {
        if (this.f5314g && getSettings() != null) {
            if (!this.f5316i.isSupportedAbi().booleanValue()) {
                return Boolean.FALSE;
            }
            long currentTimeMillis = DebugHelper.getCurrentTimeMillis();
            String string = c7033b.m29728c().toString();
            if (string == null) {
                return Boolean.FALSE;
            }
            String strUseCrashpadDirectory = this.f5316i.useCrashpadDirectory(getSettings().getDatabasePath());
            BacktraceAttributes backtraceAttributes = new BacktraceAttributes(this.f5310c, backtraceBase.attributes);
            backtraceAttributes.attributes.put(BacktraceAttributeConsts.ErrorType, BacktraceAttributeConsts.CrashAttributeType);
            String[] strArr = (String[]) backtraceAttributes.attributes.keySet().toArray(new String[0]);
            String[] strArr2 = (String[]) backtraceAttributes.attributes.values().toArray(new String[0]);
            int size = backtraceBase.attachments.size();
            String[] strArr3 = new String[size + 1];
            if (backtraceBase.attachments != null) {
                for (int i10 = 0; i10 < backtraceBase.attachments.size(); i10++) {
                    strArr3[i10] = backtraceBase.attachments.get(i10);
                }
            }
            strArr3[size] = this.f5315h.getBreadcrumbLogPath();
            boolean zInitializeJavaCrashHandler = this.f5318k.initializeJavaCrashHandler(string, strUseCrashpadDirectory, this.f5316i.getClassPath(), strArr, strArr2, strArr3, (String[]) this.f5316i.getCrashHandlerEnvironmentVariables(this.f5310c.getApplicationInfo()).toArray(new String[0]));
            this.f5317j = zInitializeJavaCrashHandler;
            if (zInitializeJavaCrashHandler && this.f5315h.isEnabled()) {
                this.f5315h.setOnSuccessfulBreadcrumbAddEventListener(new OnSuccessfulBreadcrumbAddEventListener() { // from class: j6.c
                    @Override // backtraceio.library.events.OnSuccessfulBreadcrumbAddEventListener
                    public final void onSuccessfulAdd(long j10) {
                        BacktraceDatabase.m7060a(this.f27598a, j10);
                    }
                });
            }
            long currentTimeMillis2 = DebugHelper.getCurrentTimeMillis();
            BacktraceLogger.m7080d(this.f5308a, "Setup native integration took " + (currentTimeMillis2 - currentTimeMillis) + " milliseconds");
            return Boolean.valueOf(this.f5317j);
        }
        return Boolean.FALSE;
    }

    public BacktraceDatabase(Context context, BacktraceDatabaseSettings backtraceDatabaseSettings) {
        this.f5308a = BacktraceDatabase.class.getSimpleName();
        this.f5314g = false;
        this.f5317j = false;
        this.f5318k = new BacktraceCrashHandlerWrapper();
        if (backtraceDatabaseSettings != null && context != null) {
            if (backtraceDatabaseSettings.getDatabasePath() != null && !backtraceDatabaseSettings.getDatabasePath().isEmpty()) {
                if (!FileHelper.isFileExists(backtraceDatabaseSettings.getDatabasePath()) && (!new File(backtraceDatabaseSettings.getDatabasePath()).mkdirs() || !FileHelper.isFileExists(backtraceDatabaseSettings.getDatabasePath()))) {
                    throw new IllegalArgumentException("Incorrect database path or application doesn't have permission to write to this path");
                }
                this.f5310c = context;
                this.f5313f = backtraceDatabaseSettings;
                this.f5311d = new BacktraceDatabaseContext(backtraceDatabaseSettings);
                this.f5312e = new BacktraceDatabaseFileContext(m7069j(), this.f5313f.getMaxDatabaseSize(), this.f5313f.getMaxRecordCount());
                this.f5315h = new BacktraceBreadcrumbs(m7069j());
                this.f5316i = new CrashHandlerConfiguration();
                return;
            }
            throw new IllegalArgumentException("Database path is null or empty");
        }
        throw new IllegalArgumentException("Database settings or application context is null");
    }
}
