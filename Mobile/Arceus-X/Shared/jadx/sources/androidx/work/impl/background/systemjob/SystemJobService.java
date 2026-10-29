package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import androidx.work.WorkerParameters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import p120f6.WorkGenerationalId;
import p536x5.AbstractC12732w;
import p567y5.C13042d1;
import p567y5.C13048f1;
import p567y5.C13085s;
import p567y5.C13098y;
import p567y5.InterfaceC13036b1;
import p567y5.InterfaceC13043e;
import p567y5.InterfaceC13100z;

/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements InterfaceC13043e {

    /* JADX INFO: renamed from: e */
    public static final String f4598e = AbstractC12732w.m47443i("SystemJobService");

    /* JADX INFO: renamed from: a */
    public C13048f1 f4599a;

    /* JADX INFO: renamed from: b */
    public final Map<WorkGenerationalId, JobParameters> f4600b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final InterfaceC13100z f4601c = InterfaceC13100z.m48692b(false);

    /* JADX INFO: renamed from: d */
    public InterfaceC13036b1 f4602d;

    /* JADX INFO: renamed from: androidx.work.impl.background.systemjob.SystemJobService$a */
    public static class C1121a {
        /* JADX INFO: renamed from: a */
        public static String[] m6397a(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        /* JADX INFO: renamed from: b */
        public static Uri[] m6398b(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.background.systemjob.SystemJobService$b */
    public static class C1122b {
        /* JADX INFO: renamed from: a */
        public static Network m6399a(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.background.systemjob.SystemJobService$c */
    public static class C1123c {
        /* JADX INFO: renamed from: a */
        public static int m6400a(JobParameters jobParameters) {
            return SystemJobService.m6394b(jobParameters.getStopReason());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m6393a(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    /* JADX INFO: renamed from: b */
    public static int m6394b(int i10) {
        switch (i10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return i10;
            default:
                return -512;
        }
    }

    /* JADX INFO: renamed from: c */
    public static WorkGenerationalId m6395c(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new WorkGenerationalId(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // p567y5.InterfaceC13043e
    /* JADX INFO: renamed from: d */
    public void mo6396d(WorkGenerationalId workGenerationalId, boolean z10) {
        m6393a("onExecuted");
        AbstractC12732w.m47441e().mo47444a(f4598e, workGenerationalId.getWorkSpecId() + " executed on JobScheduler");
        JobParameters jobParametersRemove = this.f4600b.remove(workGenerationalId);
        this.f4601c.mo48547c(workGenerationalId);
        if (jobParametersRemove != null) {
            jobFinished(jobParametersRemove, z10);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            C13048f1 c13048f1M48580p = C13048f1.m48580p(getApplicationContext());
            this.f4599a = c13048f1M48580p;
            C13085s c13085sM48586r = c13048f1M48580p.m48586r();
            this.f4602d = new C13042d1(c13085sM48586r, this.f4599a.m48590v());
            c13085sM48586r.m48663e(this);
        } catch (IllegalStateException e10) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
            }
            AbstractC12732w.m47441e().mo47451k(f4598e, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        C13048f1 c13048f1 = this.f4599a;
        if (c13048f1 != null) {
            c13048f1.m48586r().m48670m(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        m6393a("onStartJob");
        if (this.f4599a == null) {
            AbstractC12732w.m47441e().mo47444a(f4598e, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        WorkGenerationalId workGenerationalIdM6395c = m6395c(jobParameters);
        if (workGenerationalIdM6395c == null) {
            AbstractC12732w.m47441e().mo47446c(f4598e, "WorkSpec id not found!");
            return false;
        }
        if (this.f4600b.containsKey(workGenerationalIdM6395c)) {
            AbstractC12732w.m47441e().mo47444a(f4598e, "Job is already being executed by SystemJobService: " + workGenerationalIdM6395c);
            return false;
        }
        AbstractC12732w.m47441e().mo47444a(f4598e, "onStartJob for " + workGenerationalIdM6395c);
        this.f4600b.put(workGenerationalIdM6395c, jobParameters);
        int i10 = Build.VERSION.SDK_INT;
        WorkerParameters.C1114a c1114a = new WorkerParameters.C1114a();
        if (C1121a.m6398b(jobParameters) != null) {
            c1114a.f4536b = Arrays.asList(C1121a.m6398b(jobParameters));
        }
        if (C1121a.m6397a(jobParameters) != null) {
            c1114a.f4535a = Arrays.asList(C1121a.m6397a(jobParameters));
        }
        if (i10 >= 28) {
            c1114a.f4537c = C1122b.m6399a(jobParameters);
        }
        this.f4602d.mo48554e(this.f4601c.mo48549f(workGenerationalIdM6395c), c1114a);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        m6393a("onStopJob");
        if (this.f4599a == null) {
            AbstractC12732w.m47441e().mo47444a(f4598e, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        WorkGenerationalId workGenerationalIdM6395c = m6395c(jobParameters);
        if (workGenerationalIdM6395c == null) {
            AbstractC12732w.m47441e().mo47446c(f4598e, "WorkSpec id not found!");
            return false;
        }
        AbstractC12732w.m47441e().mo47444a(f4598e, "onStopJob for " + workGenerationalIdM6395c);
        this.f4600b.remove(workGenerationalIdM6395c);
        C13098y c13098yMo48547c = this.f4601c.mo48547c(workGenerationalIdM6395c);
        if (c13098yMo48547c != null) {
            this.f4602d.m48552c(c13098yMo48547c, Build.VERSION.SDK_INT >= 31 ? C1123c.m6400a(jobParameters) : -512);
        }
        return !this.f4599a.m48586r().m48667j(workGenerationalIdM6395c.getWorkSpecId());
    }
}
