package b6;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import g6.SystemIdInfo;
import g6.WorkGenerationalId;
import g6.j0;
import g6.k0;
import g6.o1;
import g6.v;
import h6.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import y5.f0;
import y5.o0;
import y5.w;
import z5.u;

/* JADX INFO: loaded from: classes.dex */
public class f implements u {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f3651f = w.i("SystemJobScheduler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3652a;
    public final JobScheduler b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f3653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WorkDatabase f3654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.work.a f3655e;

    public f(Context context, WorkDatabase workDatabase, androidx.work.a aVar) {
        this(context, workDatabase, aVar, c.c(context), new d(context, aVar.getClock(), aVar.getIsMarkingJobsAsImportantWhileForeground()));
    }

    public static void a(Context context) {
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
            c(jobScheduler, it.next().getId());
        }
    }

    public static void c(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th2) {
            w.e().d(f3651f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th2);
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
        List<String> listD = workDatabase.Z().d();
        boolean z10 = false;
        HashSet hashSet = new HashSet(listG != null ? listG.size() : 0);
        if (listG != null && !listG.isEmpty()) {
            for (JobInfo jobInfo : listG) {
                WorkGenerationalId workGenerationalIdH = h(jobInfo);
                if (workGenerationalIdH != null) {
                    hashSet.add(workGenerationalIdH.getWorkSpecId());
                } else {
                    c(jobSchedulerC, jobInfo.getId());
                }
            }
        }
        Iterator<String> it = listD.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(it.next())) {
                w.e().a(f3651f, "Reconciling jobs");
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
            Iterator<String> it2 = listD.iterator();
            while (it2.hasNext()) {
                k0VarC0.q(it2.next(), -1L);
            }
            workDatabase.V();
            return z10;
        } finally {
            workDatabase.p();
        }
    }

    @Override // z5.u
    public void b(String str) {
        List<Integer> listF = f(this.f3652a, this.b, str);
        if (listF == null || listF.isEmpty()) {
            return;
        }
        Iterator<Integer> it = listF.iterator();
        while (it.hasNext()) {
            c(this.b, it.next().intValue());
        }
        this.f3654d.Z().e(str);
    }

    @Override // z5.u
    public boolean d() {
        return true;
    }

    @Override // z5.u
    public void e(j0... j0VarArr) {
        n nVar = new n(this.f3654d);
        for (j0 j0Var : j0VarArr) {
            this.f3654d.i();
            try {
                j0 j0VarH = this.f3654d.c0().h(j0Var.id);
                if (j0VarH == null) {
                    w.e().k(f3651f, "Skipping scheduling " + j0Var.id + " because it's no longer in the DB");
                    this.f3654d.V();
                } else if (j0VarH.state != o0.c.ENQUEUED) {
                    w.e().k(f3651f, "Skipping scheduling " + j0Var.id + " because it is no longer enqueued");
                    this.f3654d.V();
                } else {
                    WorkGenerationalId workGenerationalIdA = o1.a(j0Var);
                    SystemIdInfo systemIdInfoA = this.f3654d.Z().a(workGenerationalIdA);
                    int iB = systemIdInfoA != null ? systemIdInfoA.systemId : nVar.b(this.f3655e.getMinJobSchedulerId(), this.f3655e.getMaxJobSchedulerId());
                    if (systemIdInfoA == null) {
                        this.f3654d.Z().b(v.a(workGenerationalIdA, iB));
                    }
                    j(j0Var, iB);
                    this.f3654d.V();
                }
                this.f3654d.p();
            } catch (Throwable th2) {
                this.f3654d.p();
                throw th2;
            }
        }
    }

    public void j(j0 j0Var, int i10) {
        JobInfo jobInfoA = this.f3653c.a(j0Var, i10);
        w wVarE = w.e();
        String str = f3651f;
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
            String strA = c.a(this.f3652a, this.f3654d, this.f3655e);
            w.e().c(f3651f, strA);
            IllegalStateException illegalStateException = new IllegalStateException(strA, e10);
            x2.a<Throwable> aVarL = this.f3655e.l();
            if (aVarL == null) {
                throw illegalStateException;
            }
            aVarL.accept(illegalStateException);
        } catch (Throwable th2) {
            w.e().d(f3651f, "Unable to schedule " + j0Var, th2);
        }
    }

    public f(Context context, WorkDatabase workDatabase, androidx.work.a aVar, JobScheduler jobScheduler, d dVar) {
        this.f3652a = context;
        this.b = jobScheduler;
        this.f3653c = dVar;
        this.f3654d = workDatabase;
        this.f3655e = aVar;
    }
}
