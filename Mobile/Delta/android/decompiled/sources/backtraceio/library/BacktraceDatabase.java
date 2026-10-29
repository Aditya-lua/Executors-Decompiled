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
import j6.b;
import java.io.File;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceDatabase implements Database {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static boolean f4061l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static Timer f4062m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient String f4063a;
    public Api b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f4064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public DatabaseContext f4065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DatabaseFileContext f4066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BacktraceDatabaseSettings f4067f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4068g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Breadcrumbs f4069h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CrashHandlerConfiguration f4070i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4071j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public NativeCommunication f4072k;

    public class a extends TimerTask {

        /* JADX INFO: renamed from: backtraceio.library.BacktraceDatabase$a$a, reason: collision with other inner class name */
        public class C0079a implements OnServerResponseEventListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ BacktraceDatabaseRecord f4074a;
            public final /* synthetic */ CountDownLatch b;

            public C0079a(BacktraceDatabaseRecord backtraceDatabaseRecord, CountDownLatch countDownLatch) {
                this.f4074a = backtraceDatabaseRecord;
                this.b = countDownLatch;
            }

            @Override // backtraceio.library.events.OnServerResponseEventListener
            public void onEvent(BacktraceResult backtraceResult) {
                if (backtraceResult.status == BacktraceResultStatus.Ok) {
                    BacktraceLogger.d(BacktraceDatabase.this.f4063a, "Timer - deleting record");
                    BacktraceDatabase.this.delete(this.f4074a);
                } else {
                    BacktraceLogger.d(BacktraceDatabase.this.f4063a, "Timer - closing record");
                    this.f4074a.close();
                }
                this.b.countDown();
            }
        }

        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            String string = Calendar.getInstance().getTime().toString();
            BacktraceLogger.d(BacktraceDatabase.this.f4063a, "Timer - " + string);
            if (BacktraceDatabase.this.f4065d == null) {
                BacktraceLogger.w(BacktraceDatabase.this.f4063a, "Timer - database context is null: " + string);
                return;
            }
            if (BacktraceDatabase.this.f4065d.isEmpty()) {
                BacktraceLogger.d(BacktraceDatabase.this.f4063a, "Timer - database is empty (no records): " + string);
                return;
            }
            if (BacktraceDatabase.f4061l) {
                BacktraceLogger.d(BacktraceDatabase.this.f4063a, "Timer - another timer works now: " + string);
                return;
            }
            BacktraceLogger.d(BacktraceDatabase.this.f4063a, "Timer - continue working: " + string);
            boolean unused = BacktraceDatabase.f4061l = true;
            BacktraceDatabase.f4062m.cancel();
            BacktraceDatabase.f4062m.purge();
            Timer unused2 = BacktraceDatabase.f4062m = null;
            BacktraceDatabaseRecord backtraceDatabaseRecordFirst = BacktraceDatabase.this.f4065d.first();
            while (backtraceDatabaseRecordFirst != null) {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                BacktraceData backtraceData = backtraceDatabaseRecordFirst.getBacktraceData();
                if (backtraceData != null && backtraceData.getReport() != null) {
                    BacktraceDatabase.this.b.send(backtraceData, new C0079a(backtraceDatabaseRecordFirst, countDownLatch));
                    try {
                        countDownLatch.await();
                    } catch (Exception e10) {
                        BacktraceLogger.e(BacktraceDatabase.this.f4063a, "Error during waiting for result in Timer", e10);
                    }
                    if (backtraceDatabaseRecordFirst.valid() && !backtraceDatabaseRecordFirst.locked) {
                        BacktraceLogger.d(BacktraceDatabase.this.f4063a, "Timer - record is valid and unlocked");
                        break;
                    }
                } else {
                    BacktraceLogger.d(BacktraceDatabase.this.f4063a, "Timer - backtrace data or report is null - deleting record");
                    BacktraceDatabase.this.delete(backtraceDatabaseRecordFirst);
                }
                backtraceDatabaseRecordFirst = BacktraceDatabase.this.f4065d.first();
            }
            BacktraceLogger.d(BacktraceDatabase.this.f4063a, "Setup new timer");
            boolean unused3 = BacktraceDatabase.f4061l = false;
            BacktraceDatabase.this.n();
        }
    }

    public BacktraceDatabase() {
        String simpleName = BacktraceDatabase.class.getSimpleName();
        this.f4063a = simpleName;
        this.f4068g = false;
        this.f4071j = false;
        this.f4072k = new BacktraceCrashHandlerWrapper();
        BacktraceLogger.w(simpleName, "Disabled instance of BacktraceDatabase created, native crashes won't be captured");
    }

    public static /* synthetic */ void a(BacktraceDatabase backtraceDatabase, long j10) {
        backtraceDatabase.getClass();
        backtraceDatabase.addAttribute("breadcrumbs.lastId", Long.toString(j10));
    }

    private native void disable();

    @Override // backtraceio.library.interfaces.Database
    public BacktraceDatabaseRecord add(BacktraceReport backtraceReport, Map<String, Object> map) {
        return add(backtraceReport, map, false);
    }

    public native void addAttribute(String str, String str2);

    @Override // backtraceio.library.interfaces.Database
    public Boolean addNativeAttribute(String str, Object obj) {
        if (!this.f4071j) {
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
        DatabaseContext databaseContext = this.f4065d;
        if (databaseContext != null) {
            databaseContext.clear();
        }
        DatabaseFileContext databaseFileContext = this.f4066e;
        if (databaseFileContext != null) {
            databaseFileContext.clear();
        }
    }

    @Override // backtraceio.library.interfaces.Database
    public void delete(BacktraceDatabaseRecord backtraceDatabaseRecord) {
        DatabaseContext databaseContext = this.f4065d;
        if (databaseContext == null || backtraceDatabaseRecord == null) {
            return;
        }
        databaseContext.delete(backtraceDatabaseRecord);
    }

    @Override // backtraceio.library.interfaces.Database
    public void disableNativeIntegration() {
        disable();
        this.f4071j = false;
    }

    @Override // backtraceio.library.interfaces.Database
    public void flush() {
        if (this.b == null) {
            throw new IllegalArgumentException("BacktraceApi is required if you want to use Flush method");
        }
        BacktraceDatabaseRecord backtraceDatabaseRecordFirst = this.f4065d.first();
        while (backtraceDatabaseRecordFirst != null) {
            BacktraceData backtraceData = backtraceDatabaseRecordFirst.getBacktraceData();
            delete(backtraceDatabaseRecordFirst);
            if (backtraceData != null) {
                this.b.send(backtraceData, null);
            }
            backtraceDatabaseRecordFirst = this.f4065d.first();
        }
    }

    @Override // backtraceio.library.interfaces.Database
    public Iterable<BacktraceDatabaseRecord> get() {
        DatabaseContext databaseContext = this.f4065d;
        if (databaseContext == null) {
            return null;
        }
        return databaseContext.get();
    }

    @Override // backtraceio.library.interfaces.Database
    public Breadcrumbs getBreadcrumbs() {
        return this.f4069h;
    }

    @Override // backtraceio.library.interfaces.Database
    public long getDatabaseSize() {
        return this.f4065d.getDatabaseSize();
    }

    @Override // backtraceio.library.interfaces.Database
    public BacktraceDatabaseSettings getSettings() {
        return this.f4067f;
    }

    public final String j() {
        return this.f4067f.getDatabasePath();
    }

    public final void k() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        l();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        BacktraceLogger.d(this.f4063a, "Loading " + this.f4065d.count() + " reports took " + (jCurrentTimeMillis2 - jCurrentTimeMillis) + " milliseconds");
    }

    public final void l() {
        Iterator<File> it = this.f4066e.getRecords().iterator();
        while (it.hasNext()) {
            BacktraceDatabaseRecord fromFile = BacktraceDatabaseRecord.readFromFile(it.next());
            if (fromFile != null) {
                if (fromFile.valid()) {
                    this.f4065d.add(fromFile);
                    o();
                    fromFile.close();
                } else {
                    fromFile.delete();
                }
            }
        }
    }

    public final void m() {
        this.f4066e.removeOrphaned(this.f4065d.get());
    }

    public final void n() {
        Timer timer = new Timer();
        f4062m = timer;
        timer.scheduleAtFixedRate(new a(), this.f4067f.getRetryInterval() * 1000, this.f4067f.getRetryInterval() * 1000);
    }

    public final boolean o() {
        if (this.f4065d.count() + 1 > this.f4067f.getMaxRecordCount() && this.f4067f.getMaxRecordCount() != 0 && !this.f4065d.removeOldestRecord()) {
            BacktraceLogger.e(this.f4063a, "Can't remove last record. Database size is invalid");
            return false;
        }
        if (this.f4067f.getMaxDatabaseSize() == 0 || this.f4065d.getDatabaseSize() <= this.f4067f.getMaxDatabaseSize()) {
            return true;
        }
        int i10 = 5;
        while (this.f4065d.getDatabaseSize() > this.f4067f.getMaxDatabaseSize()) {
            this.f4065d.removeOldestRecord();
            i10--;
            if (i10 == 0) {
                break;
            }
        }
        return i10 != 0;
    }

    @Override // backtraceio.library.interfaces.Database
    public void setApi(Api api) {
        this.b = api;
    }

    @Override // backtraceio.library.interfaces.Database
    public Boolean setupNativeIntegration(BacktraceBase backtraceBase, b bVar) {
        return setupNativeIntegration(backtraceBase, bVar, false);
    }

    @Override // backtraceio.library.interfaces.Database
    public void start() {
        if (this.f4067f == null) {
            return;
        }
        DatabaseContext databaseContext = this.f4065d;
        if (databaseContext != null && !databaseContext.isEmpty()) {
            this.f4068g = true;
            return;
        }
        k();
        m();
        if (this.f4067f.getRetryBehavior() == RetryBehavior.ByInterval || this.f4067f.isAutoSendMode()) {
            n();
        }
        this.f4068g = true;
    }

    @Override // backtraceio.library.interfaces.Database
    public boolean validConsistency() {
        return this.f4066e.validFileConsistency();
    }

    @Override // backtraceio.library.interfaces.Database
    public BacktraceDatabaseRecord add(BacktraceReport backtraceReport, Map<String, Object> map, boolean z10) {
        if (!this.f4068g || backtraceReport == null || !o()) {
            return null;
        }
        return this.f4065d.add(backtraceReport.toBacktraceData(this.f4064c, map, z10));
    }

    @Override // backtraceio.library.interfaces.Database
    public Boolean setupNativeIntegration(BacktraceBase backtraceBase, b bVar, boolean z10) {
        return setupNativeIntegration(backtraceBase, bVar, z10, UnwindingMode.REMOTE_DUMPWITHOUTCRASH);
    }

    @Override // backtraceio.library.interfaces.Database
    public Boolean setupNativeIntegration(BacktraceBase backtraceBase, b bVar, boolean z10, UnwindingMode unwindingMode) {
        if (this.f4068g && getSettings() != null) {
            if (!this.f4070i.isSupportedAbi().booleanValue()) {
                return Boolean.FALSE;
            }
            long currentTimeMillis = DebugHelper.getCurrentTimeMillis();
            String string = bVar.c().toString();
            if (string == null) {
                return Boolean.FALSE;
            }
            String strUseCrashpadDirectory = this.f4070i.useCrashpadDirectory(getSettings().getDatabasePath());
            BacktraceAttributes backtraceAttributes = new BacktraceAttributes(this.f4064c, backtraceBase.attributes);
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
            strArr3[size] = this.f4069h.getBreadcrumbLogPath();
            boolean zInitializeJavaCrashHandler = this.f4072k.initializeJavaCrashHandler(string, strUseCrashpadDirectory, this.f4070i.getClassPath(), strArr, strArr2, strArr3, (String[]) this.f4070i.getCrashHandlerEnvironmentVariables(this.f4064c.getApplicationInfo()).toArray(new String[0]));
            this.f4071j = zInitializeJavaCrashHandler;
            if (zInitializeJavaCrashHandler && this.f4069h.isEnabled()) {
                this.f4069h.setOnSuccessfulBreadcrumbAddEventListener(new OnSuccessfulBreadcrumbAddEventListener() { // from class: j6.c
                    @Override // backtraceio.library.events.OnSuccessfulBreadcrumbAddEventListener
                    public final void onSuccessfulAdd(long j10) {
                        BacktraceDatabase.a(this.f21102a, j10);
                    }
                });
            }
            long currentTimeMillis2 = DebugHelper.getCurrentTimeMillis();
            BacktraceLogger.d(this.f4063a, "Setup native integration took " + (currentTimeMillis2 - currentTimeMillis) + " milliseconds");
            return Boolean.valueOf(this.f4071j);
        }
        return Boolean.FALSE;
    }

    public BacktraceDatabase(Context context, BacktraceDatabaseSettings backtraceDatabaseSettings) {
        this.f4063a = BacktraceDatabase.class.getSimpleName();
        this.f4068g = false;
        this.f4071j = false;
        this.f4072k = new BacktraceCrashHandlerWrapper();
        if (backtraceDatabaseSettings != null && context != null) {
            if (backtraceDatabaseSettings.getDatabasePath() != null && !backtraceDatabaseSettings.getDatabasePath().isEmpty()) {
                if (!FileHelper.isFileExists(backtraceDatabaseSettings.getDatabasePath()) && (!new File(backtraceDatabaseSettings.getDatabasePath()).mkdirs() || !FileHelper.isFileExists(backtraceDatabaseSettings.getDatabasePath()))) {
                    throw new IllegalArgumentException("Incorrect database path or application doesn't have permission to write to this path");
                }
                this.f4064c = context;
                this.f4067f = backtraceDatabaseSettings;
                this.f4065d = new BacktraceDatabaseContext(backtraceDatabaseSettings);
                this.f4066e = new BacktraceDatabaseFileContext(j(), this.f4067f.getMaxDatabaseSize(), this.f4067f.getMaxRecordCount());
                this.f4069h = new BacktraceBreadcrumbs(j());
                this.f4070i = new CrashHandlerConfiguration();
                return;
            }
            throw new IllegalArgumentException("Database path is null or empty");
        }
        throw new IllegalArgumentException("Database settings or application context is null");
    }
}
