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
import f6.WorkGenerationalId;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import x5.w;
import y5.b1;
import y5.d1;
import y5.e;
import y5.f1;
import y5.s;
import y5.y;
import y5.z;

/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f3362e = w.i("SystemJobService");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f1 f3363a;
    public final Map<WorkGenerationalId, JobParameters> b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f3364c = z.b(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b1 f3365d;

    public static class a {
        public static String[] a(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        public static Uri[] b(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    public static class b {
        public static Network a(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    public static class c {
        public static int a(JobParameters jobParameters) {
            return SystemJobService.b(jobParameters.getStopReason());
        }
    }

    public static void a(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public static int b(int i10) {
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

    public static WorkGenerationalId c(JobParameters jobParameters) {
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

    @Override // y5.e
    public void d(WorkGenerationalId workGenerationalId, boolean z10) {
        a("onExecuted");
        w.e().a(f3362e, workGenerationalId.getWorkSpecId() + " executed on JobScheduler");
        JobParameters jobParametersRemove = this.b.remove(workGenerationalId);
        this.f3364c.c(workGenerationalId);
        if (jobParametersRemove != null) {
            jobFinished(jobParametersRemove, z10);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            f1 f1VarP = f1.p(getApplicationContext());
            this.f3363a = f1VarP;
            s sVarR = f1VarP.r();
            this.f3365d = new d1(sVarR, this.f3363a.v());
            sVarR.e(this);
        } catch (IllegalStateException e10) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
            }
            w.e().k(f3362e, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        f1 f1Var = this.f3363a;
        if (f1Var != null) {
            f1Var.r().m(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        a("onStartJob");
        if (this.f3363a == null) {
            w.e().a(f3362e, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        WorkGenerationalId workGenerationalIdC = c(jobParameters);
        if (workGenerationalIdC == null) {
            w.e().c(f3362e, "WorkSpec id not found!");
            return false;
        }
        if (this.b.containsKey(workGenerationalIdC)) {
            w.e().a(f3362e, "Job is already being executed by SystemJobService: " + workGenerationalIdC);
            return false;
        }
        w.e().a(f3362e, "onStartJob for " + workGenerationalIdC);
        this.b.put(workGenerationalIdC, jobParameters);
        int i10 = Build.VERSION.SDK_INT;
        WorkerParameters.a aVar = new WorkerParameters.a();
        if (a.b(jobParameters) != null) {
            aVar.b = Arrays.asList(a.b(jobParameters));
        }
        if (a.a(jobParameters) != null) {
            aVar.f3303a = Arrays.asList(a.a(jobParameters));
        }
        if (i10 >= 28) {
            aVar.f3304c = b.a(jobParameters);
        }
        this.f3365d.e(this.f3364c.f(workGenerationalIdC), aVar);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        a("onStopJob");
        if (this.f3363a == null) {
            w.e().a(f3362e, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        WorkGenerationalId workGenerationalIdC = c(jobParameters);
        if (workGenerationalIdC == null) {
            w.e().c(f3362e, "WorkSpec id not found!");
            return false;
        }
        w.e().a(f3362e, "onStopJob for " + workGenerationalIdC);
        this.b.remove(workGenerationalIdC);
        y yVarC = this.f3364c.c(workGenerationalIdC);
        if (yVarC != null) {
            this.f3365d.c(yVarC, Build.VERSION.SDK_INT >= 31 ? c.a(jobParameters) : -512);
        }
        return !this.f3363a.r().j(workGenerationalIdC.getWorkSpecId());
    }
}
