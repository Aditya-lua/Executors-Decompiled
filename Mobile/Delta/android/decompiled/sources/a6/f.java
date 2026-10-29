package a6;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import f6.SystemIdInfo;
import f6.WorkGenerationalId;
import f6.j0;
import f6.k0;
import f6.o1;
import f6.v;
import g6.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import x5.f0;
import x5.o0;
import x5.w;
import y5.u;

/* JADX INFO: loaded from: classes.dex */
public class f implements u {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f114f = w.i("SystemJobScheduler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f115a;
    public final JobScheduler b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WorkDatabase f117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.work.a f118e;

    public f(Context context, WorkDatabase workDatabase, androidx.work.a aVar) {
        this(context, workDatabase, aVar, c.c(context), new d(context, aVar.getClock(), aVar.getIsMarkingJobsAsImportantWhileForeground()));
    }

    public static void d(Context context) {
        if (Build.VERSION.SDK_INT >= 34) {
            c.c(context).cancelAll();
        }
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> listG = g(context, jobScheduler);
        if (listG == null || listG.isEmpty()) {
            return;
        }
        Iterator<JobInfo> it = listG.iterator();
        while (it.hasNext()) {
            e(jobScheduler, it.next().getId());
        }
    }

    public static void e(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th2) {
            w.e().d(f114f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th2);
        }
    }

    public static List<Integer> f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> listG = g(context, jobScheduler);
        if (listG == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : listG) {
            WorkGenerationalId workGenerationalIdH = h(jobInfo);
            if (workGenerationalIdH != null && str.equals(workGenerationalIdH.getWorkSpecId())) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    public static List<JobInfo> g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> listB = c.b(jobScheduler);
        if (listB == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listB.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : listB) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static WorkGenerationalId h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new WorkGenerationalId(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static boolean i(Context context, WorkDatabase workDatabase) {
        JobScheduler jobSchedulerC = c.c(context);
        List<JobInfo> listG = g(context, jobSchedulerC);
        List<String> listC = workDatabase.Z().c();
        boolean z10 = false;
        HashSet hashSet = new HashSet(listG != null ? listG.size() : 0);
        if (listG != null && !listG.isEmpty()) {
            for (JobInfo jobInfo : listG) {
                WorkGenerationalId workGenerationalIdH = h(jobInfo);
                if (workGenerationalIdH != null) {
                    hashSet.add(workGenerationalIdH.getWorkSpecId());
                } else {
                    e(jobSchedulerC, jobInfo.getId());
                }
            }
        }
        Iterator<String> it = listC.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(it.next())) {
                w.e().a(f114f, "Reconciling jobs");
                z10 = true;
                break;
            }
        }
        if (!z10) {
            return z10;
        }
        workDatabase.i();
        try {
            k0 k0VarC0 = workDatabase.c0();
            Iterator<String> it2 = listC.iterator();
            while (it2.hasNext()) {
                k0VarC0.q(it2.next(), -1L);
            }
            workDatabase.V();
            return z10;
        } finally {
            workDatabase.p();
        }
    }

    @Override // y5.u
    public void a(j0... j0VarArr) {
        n nVar = new n(this.f117d);
        for (j0 j0Var : j0VarArr) {
            this.f117d.i();
            try {
                j0 j0VarK = this.f117d.c0().k(j0Var.id);
                if (j0VarK == null) {
                    w.e().k(f114f, "Skipping scheduling " + j0Var.id + " because it's no longer in the DB");
                    this.f117d.V();
                } else if (j0VarK.state != o0.c.ENQUEUED) {
                    w.e().k(f114f, "Skipping scheduling " + j0Var.id + " because it is no longer enqueued");
                    this.f117d.V();
                } else {
                    WorkGenerationalId workGenerationalIdA = o1.a(j0Var);
                    SystemIdInfo systemIdInfoD = this.f117d.Z().d(workGenerationalIdA);
                    int iB = systemIdInfoD != null ? systemIdInfoD.systemId : nVar.b(this.f118e.getMinJobSchedulerId(), this.f118e.getMaxJobSchedulerId());
                    if (systemIdInfoD == null) {
                        this.f117d.Z().a(v.a(workGenerationalIdA, iB));
                    }
                    j(j0Var, iB);
                    this.f117d.V();
                }
                this.f117d.p();
            } catch (Throwable th2) {
                this.f117d.p();
                throw th2;
            }
        }
    }

    @Override // y5.u
    public void b(String str) {
        List<Integer> listF = f(this.f115a, this.b, str);
        if (listF == null || listF.isEmpty()) {
            return;
        }
        Iterator<Integer> it = listF.iterator();
        while (it.hasNext()) {
            e(this.b, it.next().intValue());
        }
        this.f117d.Z().e(str);
    }

    @Override // y5.u
    public boolean c() {
        return true;
    }

    public void j(j0 j0Var, int i10) {
        JobInfo jobInfoA = this.f116c.a(j0Var, i10);
        w wVarE = w.e();
        String str = f114f;
        wVarE.a(str, "Scheduling work ID " + j0Var.id + "Job ID " + i10);
        try {
            if (this.b.schedule(jobInfoA) == 0) {
                w.e().k(str, "Unable to schedule work ID " + j0Var.id);
                if (j0Var.expedited && j0Var.outOfQuotaPolicy == f0.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    j0Var.expedited = false;
                    w.e().a(str, String.format("Scheduling a non-expedited job (work ID %s)", j0Var.id));
                    j(j0Var, i10);
                }
            }
        } catch (IllegalStateException e10) {
            String strA = c.a(this.f115a, this.f117d, this.f118e);
            w.e().c(f114f, strA);
            IllegalStateException illegalStateException = new IllegalStateException(strA, e10);
            x2.a<Throwable> aVarL = this.f118e.l();
            if (aVarL == null) {
                throw illegalStateException;
            }
            aVarL.accept(illegalStateException);
        } catch (Throwable th2) {
            w.e().d(f114f, "Unable to schedule " + j0Var, th2);
        }
    }

    public f(Context context, WorkDatabase workDatabase, androidx.work.a aVar, JobScheduler jobScheduler, d dVar) {
        this.f115a = context;
        this.b = jobScheduler;
        this.f116c = dVar;
        this.f117d = workDatabase;
        this.f118e = aVar;
    }
}
