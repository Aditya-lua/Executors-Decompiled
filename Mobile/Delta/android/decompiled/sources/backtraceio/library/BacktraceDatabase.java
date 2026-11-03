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
    public static boolean f3959l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static Timer f3960m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient String f3961a;
    public Api b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f3962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public DatabaseContext f3963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DatabaseFileContext f3964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BacktraceDatabaseSettings f3965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3966g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Breadcrumbs f3967h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CrashHandlerConfiguration f3968i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3969j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public NativeCommunication f3970k;

    public class a extends TimerTask {

        /* JADX INFO: renamed from: backtraceio.library.BacktraceDatabase$a$a, reason: collision with other inner class name */
        public class C0078a implements OnServerResponseEventListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ BacktraceDatabaseRecord f3972a;
            public final /* synthetic */ CountDownLatch b;

            public C0078a(BacktraceDatabaseRecord backtraceDatabaseRecord, CountDownLatch countDownLatch) {
                this.f3972a = backtraceDatabaseRecord;
                this.b = countDownLatch;
            }

            @Override // backtraceio.library.events.OnServerResponseEventListener
            public void onEvent(BacktraceResult backtraceResult) {
                if (backtraceResult.status == BacktraceResultStatus.Ok) {
                    BacktraceLogger.d(BacktraceDatabase.this.f3961a, "Timer - deleting record");
                    BacktraceDatabase.this.delete(this.f3972a);
                } else {
                    BacktraceLogger.d(BacktraceDatabase.this.f3961a, "Timer - closing record");
                    this.f3972a.close();
                }
                this.b.countDown();
            }
        }

        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            String string = Calendar.getInstance().getTime().toString();
            BacktraceLogger.d(BacktraceDatabase.this.f3961a, "Timer - " + string);
            if (BacktraceDatabase.this.f3963d == null) {
                BacktraceLogger.w(BacktraceDatabase.this.f3961a, "Timer - database context is null: " + string);
                return;
            }
            if (BacktraceDatabase.this.f3963d.isEmpty()) {
                BacktraceLogger.d(BacktraceDatabase.this.f3961a, "Timer - database is empty (no records): " + string);
                return;
            }
            if (BacktraceDatabase.f3959l) {
                BacktraceLogger.d(BacktraceDatabase.this.f3961a, "Timer - another timer works now: " + string);
                return;
            }
            BacktraceLogger.d(BacktraceDatabase.this.f3961a, "Timer - continue working: " + string);
            boolean unused = BacktraceDatabase.f3959l = true;
            BacktraceDatabase.f3960m.cancel();
            BacktraceDatabase.f3960m.purge();
            Timer unused2 = BacktraceDatabase.f3960m = null;
            BacktraceDatabaseRecord backtraceDatabaseRecordFirst = BacktraceDatabase.this.f3963d.first();
            while (backtraceDatabaseRecordFirst != null) {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                BacktraceData backtraceData = backtraceDatabaseRecordFirst.getBacktraceData();
                if (backtraceData != null && backtraceData.getReport() != null) {
                    BacktraceDatabase.this.b.send(backtraceData, new C0078a(backtraceDatabaseRecordFirst, countDownLatch));
                    try {
                        countDownLatch.await();
                    } catch (Exception e10) {
                        BacktraceLogger.e(BacktraceDatabase.this.f3961a, "Error during waiting for result in Timer", e10);
                    }
                    if (backtraceDatabaseRecordFirst.valid() && !backtraceDatabaseRecordFirst.locked) {
                        BacktraceLogger.d(BacktraceDatabase.this.f3961a, "Timer - record is valid and unlocked");
                        break;
                    }
                } else {
                    BacktraceLogger.d(BacktraceDatabase.this.f3961a, "Timer - backtrace data or report is null - deleting record");
                    BacktraceDatabase.this.delete(backtraceDatabaseRecordFirst);
                }
                backtraceDatabaseRecordFirst = BacktraceDatabase.this.f3963d.first();
            }
            BacktraceLogger.d(BacktraceDatabase.this.f3961a, "Setup new timer");
            boolean unused3 = BacktraceDatabase.f3959l = false;
            BacktraceDatabase.this.n();
        }
    }

    public BacktraceDatabase() {
        String simpleName = BacktraceDatabase.class.getSimpleName();
        this.f3961a = simpleName;
        this.f3966g = false;
        this.f3969j = false;
        this.f3970k = new BacktraceCrashHandlerWrapper();
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
        if (!this.f3969j) {
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
        DatabaseContext databaseContext = this.f3963d;
        if (databaseContext != null) {
            databaseContext.clear();
        }
        DatabaseFileContext databaseFileContext = this.f3964e;
        if (databaseFileContext != null) {
            databaseFileContext.clear();
        }
    }

    @Override // backtraceio.library.interfaces.Database
    public void delete(BacktraceDatabaseRecord backtraceDatabaseRecord) {
        DatabaseContext databaseContext = this.f3963d;
        if (databaseContext == null || backtraceDatabaseRecord == null) {
            return;
        }
        databaseContext.delete(backtraceDatabaseRecord);
    }

    @Override // backtraceio.library.interfaces.Database
    public void disableNativeIntegration() {
        disable();
        this.f3969j = false;
    }

    @Override // backtraceio.library.interfaces.Database
    public void flush() {
        if (this.b == null) {
            throw new IllegalArgumentException("BacktraceApi is required if you want to use Flush method");
        }
        BacktraceDatabaseRecord backtraceDatabaseRecordFirst = this.f3963d.first();
        while (backtraceDatabaseRecordFirst != null) {
            BacktraceData backtraceData = backtraceDatabaseRecordFirst.getBacktraceData();
            delete(backtraceDatabaseRecordFirst);
            if (backtraceData != null) {
                this.b.send(backtraceData, null);
            }
            backtraceDatabaseRecordFirst = this.f3963d.first();
        }
    }

    @Override // backtraceio.library.interfaces.Database
    public Iterable<BacktraceDatabaseRecord> get() {
        DatabaseContext databaseContext = this.f3963d;
        if (databaseContext == null) {
            return null;
        }
        return databaseContext.get();
    }

    @Override // backtraceio.library.interfaces.Database
    public Breadcrumbs getBreadcrumbs() {
        return this.f3967h;
    }

    @Override // backtraceio.library.interfaces.Database
    public long getDatabaseSize() {
        return this.f3963d.getDatabaseSize();
    }

    @Override // backtraceio.library.interfaces.Database
    public BacktraceDatabaseSettings getSettings() {
        return this.f3965f;
    }

    public final String j() {
        return this.f3965f.getDatabasePath();
    }

    public final void k() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        l();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        BacktraceLogger.d(this.f3961a, "Loading " + this.f3963d.count() + " reports took " + (jCurrentTimeMillis2 - jCurrentTimeMillis) + " milliseconds");
    }

    public final void l() {
        Iterator<File> it = this.f3964e.getRecords().iterator();
        while (it.hasNext()) {
            BacktraceDatabaseRecord fromFile = BacktraceDatabaseRecord.readFromFile(it.next());
            if (fromFile != null) {
                if (fromFile.valid()) {
                    this.f3963d.add(fromFile);
                    o();
                    fromFile.close();
                } else {
                    fromFile.delete();
                }
            }
        }
    }

    public final void m() {
        this.f3964e.removeOrphaned(this.f3963d.get());
    }

    public final void n() {
        Timer timer = new Timer();
        f3960m = timer;
        timer.scheduleAtFixedRate(new a(), this.f3965f.getRetryInterval() * 1000, this.f3965f.getRetryInterval() * 1000);
    }

    public final boolean o() {
        if (this.f3963d.count() + 1 > this.f3965f.getMaxRecordCount() && this.f3965f.getMaxRecordCount() != 0 && !this.f3963d.removeOldestRecord()) {
            BacktraceLogger.e(this.f3961a, "Can't remove last record. Database size is invalid");
            return false;
        }
        if (this.f3965f.getMaxDatabaseSize() == 0 || this.f3963d.getDatabaseSize() <= this.f3965f.getMaxDatabaseSize()) {
            return true;
        }
        int i10 = 5;
        while (this.f3963d.getDatabaseSize() > this.f3965f.getMaxDatabaseSize()) {
            this.f3963d.removeOldestRecord();
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
        if (this.f3965f == null) {
            return;
        }
        DatabaseContext databaseContext = this.f3963d;
        if (databaseContext != null && !databaseContext.isEmpty()) {
            this.f3966g = true;
            return;
        }
        k();
        m();
        if (this.f3965f.getRetryBehavior() == RetryBehavior.ByInterval || this.f3965f.isAutoSendMode()) {
            n();
        }
        this.f3966g = true;
    }

    @Override // backtraceio.library.interfaces.Database
    public boolean validConsistency() {
        return this.f3964e.validFileConsistency();
    }

    @Override // backtraceio.library.interfaces.Database
    public BacktraceDatabaseRecord add(BacktraceReport backtraceReport, Map<String, Object> map, boolean z10) {
        if (!this.f3966g || backtraceReport == null || !o()) {
            return null;
        }
        return this.f3963d.add(backtraceReport.toBacktraceData(this.f3962c, map, z10));
    }

    @Override // backtraceio.library.interfaces.Database
    public Boolean setupNativeIntegration(BacktraceBase backtraceBase, b bVar, boolean z10) {
        return setupNativeIntegration(backtraceBase, bVar, z10, UnwindingMode.REMOTE_DUMPWITHOUTCRASH);
    }

    @Override // backtraceio.library.interfaces.Database
    public Boolean setupNativeIntegration(BacktraceBase backtraceBase, b bVar, boolean z10, UnwindingMode unwindingMode) {
        if (this.f3966g && getSettings() != null) {
            if (!this.f3968i.isSupportedAbi().booleanValue()) {
                return Boolean.FALSE;
            }
            long currentTimeMillis = DebugHelper.getCurrentTimeMillis();
            String string = bVar.c().toString();
            if (string == null) {
                return Boolean.FALSE;
            }
            String strUseCrashpadDirectory = this.f3968i.useCrashpadDirectory(getSettings().getDatabasePath());
            BacktraceAttributes backtraceAttributes = new BacktraceAttributes(this.f3962c, backtraceBase.attributes);
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
            strArr3[size] = this.f3967h.getBreadcrumbLogPath();
            boolean zInitializeJavaCrashHandler = this.f3970k.initializeJavaCrashHandler(string, strUseCrashpadDirectory, this.f3968i.getClassPath(), strArr, strArr2, strArr3, (String[]) this.f3968i.getCrashHandlerEnvironmentVariables(this.f3962c.getApplicationInfo()).toArray(new String[0]));
            this.f3969j = zInitializeJavaCrashHandler;
            if (zInitializeJavaCrashHandler && this.f3967h.isEnabled()) {
                this.f3967h.setOnSuccessfulBreadcrumbAddEventListener(new OnSuccessfulBreadcrumbAddEventListener() { // from class: j6.c
                    @Override // backtraceio.library.events.OnSuccessfulBreadcrumbAddEventListener
                    public final void onSuccessfulAdd(long j10) {
                        BacktraceDatabase.a(this.f21675a, j10);
                    }
                });
            }
            long currentTimeMillis2 = DebugHelper.getCurrentTimeMillis();
            BacktraceLogger.d(this.f3961a, "Setup native integration took " + (currentTimeMillis2 - currentTimeMillis) + " milliseconds");
            return Boolean.valueOf(this.f3969j);
        }
        return Boolean.FALSE;
    }

    public BacktraceDatabase(Context context, BacktraceDatabaseSettings backtraceDatabaseSettings) {
        this.f3961a = BacktraceDatabase.class.getSimpleName();
        this.f3966g = false;
        this.f3969j = false;
        this.f3970k = new BacktraceCrashHandlerWrapper();
        if (backtraceDatabaseSettings != null && context != null) {
            if (backtraceDatabaseSettings.getDatabasePath() != null && !backtraceDatabaseSettings.getDatabasePath().isEmpty()) {
                if (!FileHelper.isFileExists(backtraceDatabaseSettings.getDatabasePath()) && (!new File(backtraceDatabaseSettings.getDatabasePath()).mkdirs() || !FileHelper.isFileExists(backtraceDatabaseSettings.getDatabasePath()))) {
                    throw new IllegalArgumentException("Incorrect database path or application doesn't have permission to write to this path");
                }
                this.f3962c = context;
                this.f3965f = backtraceDatabaseSettings;
                this.f3963d = new BacktraceDatabaseContext(backtraceDatabaseSettings);
                this.f3964e = new BacktraceDatabaseFileContext(j(), this.f3965f.getMaxDatabaseSize(), this.f3965f.getMaxRecordCount());
                this.f3967h = new BacktraceBreadcrumbs(j());
                this.f3968i = new CrashHandlerConfiguration();
                return;
            }
            throw new IllegalArgumentException("Database path is null or empty");
        }
        throw new IllegalArgumentException("Database settings or application context is null");
    }
}
