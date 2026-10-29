package p007a6;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.C1115a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p120f6.C5390j0;
import p120f6.C5406o1;
import p120f6.C5425v;
import p120f6.InterfaceC5393k0;
import p120f6.SystemIdInfo;
import p120f6.WorkGenerationalId;
import p146g6.C6034n;
import p533x2.InterfaceC12631a;
import p536x5.AbstractC12732w;
import p536x5.C12717o0;
import p536x5.EnumC12699f0;
import p567y5.InterfaceC13090u;

/* JADX INFO: renamed from: a6.f */
/* JADX INFO: loaded from: classes.dex */
public class C0078f implements InterfaceC13090u {

    /* JADX INFO: renamed from: f */
    public static final String f156f = AbstractC12732w.m47443i("SystemJobScheduler");

    /* JADX INFO: renamed from: a */
    public final Context f157a;

    /* JADX INFO: renamed from: b */
    public final JobScheduler f158b;

    /* JADX INFO: renamed from: c */
    public final C0076d f159c;

    /* JADX INFO: renamed from: d */
    public final WorkDatabase f160d;

    /* JADX INFO: renamed from: e */
    public final C1115a f161e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0078f(Context context, WorkDatabase workDatabase, C1115a c1115a) {
        this(context, workDatabase, c1115a, C0075c.m181c(context), new C0076d(context, c1115a.getClock(), c1115a.getIsMarkingJobsAsImportantWhileForeground()));
    }

    /* JADX INFO: renamed from: d */
    public static void m187d(Context context) {
        if (Build.VERSION.SDK_INT >= 34) {
            C0075c.m181c(context).cancelAll();
        }
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> listM190g = m190g(context, jobScheduler);
        if (listM190g == null || listM190g.isEmpty()) {
            return;
        }
        Iterator<JobInfo> it = listM190g.iterator();
        while (it.hasNext()) {
            m188e(jobScheduler, it.next().getId());
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m188e(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th2) {
            AbstractC12732w.m47441e().mo47447d(f156f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static List<Integer> m189f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> listM190g = m190g(context, jobScheduler);
        if (listM190g == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : listM190g) {
            WorkGenerationalId workGenerationalIdM191h = m191h(jobInfo);
            if (workGenerationalIdM191h != null && str.equals(workGenerationalIdM191h.getWorkSpecId())) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static List<JobInfo> m190g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> listM180b = C0075c.m180b(jobScheduler);
        if (listM180b == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listM180b.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : listM180b) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public static WorkGenerationalId m191h(JobInfo jobInfo) {
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

    /* JADX INFO: renamed from: i */
    public static boolean m192i(Context context, WorkDatabase workDatabase) {
        JobScheduler jobSchedulerM181c = C0075c.m181c(context);
        List<JobInfo> listM190g = m190g(context, jobSchedulerM181c);
        List<String> listMo24875c = workDatabase.mo6347Z().mo24875c();
        boolean z10 = false;
        HashSet hashSet = new HashSet(listM190g != null ? listM190g.size() : 0);
        if (listM190g != null && !listM190g.isEmpty()) {
            for (JobInfo jobInfo : listM190g) {
                WorkGenerationalId workGenerationalIdM191h = m191h(jobInfo);
                if (workGenerationalIdM191h != null) {
                    hashSet.add(workGenerationalIdM191h.getWorkSpecId());
                } else {
                    m188e(jobSchedulerM181c, jobInfo.getId());
                }
            }
        }
        Iterator<String> it = listMo24875c.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(it.next())) {
                AbstractC12732w.m47441e().mo47444a(f156f, "Reconciling jobs");
                z10 = true;
                break;
            }
        }
        if (!z10) {
            return z10;
        }
        workDatabase.m47272i();
        try {
            InterfaceC5393k0 interfaceC5393k0Mo6350c0 = workDatabase.mo6350c0();
            Iterator<String> it2 = listMo24875c.iterator();
            while (it2.hasNext()) {
                interfaceC5393k0Mo6350c0.mo24793q(it2.next(), -1L);
            }
            workDatabase.m47267V();
            return z10;
        } finally {
            workDatabase.m47275p();
        }
    }

    @Override // p567y5.InterfaceC13090u
    /* JADX INFO: renamed from: a */
    public void mo193a(C5390j0... c5390j0Arr) {
        C6034n c6034n = new C6034n(this.f160d);
        for (C5390j0 c5390j0 : c5390j0Arr) {
            this.f160d.m47272i();
            try {
                C5390j0 c5390j0Mo24787k = this.f160d.mo6350c0().mo24787k(c5390j0.id);
                if (c5390j0Mo24787k == null) {
                    AbstractC12732w.m47441e().mo47451k(f156f, "Skipping scheduling " + c5390j0.id + " because it's no longer in the DB");
                    this.f160d.m47267V();
                } else if (c5390j0Mo24787k.state != C12717o0.c.ENQUEUED) {
                    AbstractC12732w.m47441e().mo47451k(f156f, "Skipping scheduling " + c5390j0.id + " because it is no longer enqueued");
                    this.f160d.m47267V();
                } else {
                    WorkGenerationalId workGenerationalIdM24872a = C5406o1.m24872a(c5390j0);
                    SystemIdInfo systemIdInfoM24876d = this.f160d.mo6347Z().m24876d(workGenerationalIdM24872a);
                    int iM26837b = systemIdInfoM24876d != null ? systemIdInfoM24876d.systemId : c6034n.m26837b(this.f161e.getMinJobSchedulerId(), this.f161e.getMaxJobSchedulerId());
                    if (systemIdInfoM24876d == null) {
                        this.f160d.mo6347Z().mo24873a(C5425v.m24902a(workGenerationalIdM24872a, iM26837b));
                    }
                    m196j(c5390j0, iM26837b);
                    this.f160d.m47267V();
                }
                this.f160d.m47275p();
            } catch (Throwable th2) {
                this.f160d.m47275p();
                throw th2;
            }
        }
    }

    @Override // p567y5.InterfaceC13090u
    /* JADX INFO: renamed from: b */
    public void mo194b(String str) {
        List<Integer> listM189f = m189f(this.f157a, this.f158b, str);
        if (listM189f == null || listM189f.isEmpty()) {
            return;
        }
        Iterator<Integer> it = listM189f.iterator();
        while (it.hasNext()) {
            m188e(this.f158b, it.next().intValue());
        }
        this.f160d.mo6347Z().mo24877e(str);
    }

    @Override // p567y5.InterfaceC13090u
    /* JADX INFO: renamed from: c */
    public boolean mo195c() {
        return true;
    }

    /* JADX INFO: renamed from: j */
    public void m196j(C5390j0 c5390j0, int i10) {
        JobInfo jobInfoM185a = this.f159c.m185a(c5390j0, i10);
        AbstractC12732w abstractC12732wM47441e = AbstractC12732w.m47441e();
        String str = f156f;
        abstractC12732wM47441e.mo47444a(str, "Scheduling work ID " + c5390j0.id + "Job ID " + i10);
        try {
            if (this.f158b.schedule(jobInfoM185a) == 0) {
                AbstractC12732w.m47441e().mo47451k(str, "Unable to schedule work ID " + c5390j0.id);
                if (c5390j0.expedited && c5390j0.outOfQuotaPolicy == EnumC12699f0.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    c5390j0.expedited = false;
                    AbstractC12732w.m47441e().mo47444a(str, String.format("Scheduling a non-expedited job (work ID %s)", c5390j0.id));
                    m196j(c5390j0, i10);
                }
            }
        } catch (IllegalStateException e10) {
            String strM179a = C0075c.m179a(this.f157a, this.f160d, this.f161e);
            AbstractC12732w.m47441e().mo47446c(f156f, strM179a);
            IllegalStateException illegalStateException = new IllegalStateException(strM179a, e10);
            InterfaceC12631a<Throwable> interfaceC12631aM6279l = this.f161e.m6279l();
            if (interfaceC12631aM6279l == null) {
                throw illegalStateException;
            }
            interfaceC12631aM6279l.accept(illegalStateException);
        } catch (Throwable th2) {
            AbstractC12732w.m47441e().mo47447d(f156f, "Unable to schedule " + c5390j0, th2);
        }
    }

    public C0078f(Context context, WorkDatabase workDatabase, C1115a c1115a, JobScheduler jobScheduler, C0076d c0076d) {
        this.f157a = context;
        this.f158b = jobScheduler;
        this.f159c = c0076d;
        this.f160d = workDatabase;
        this.f161e = c1115a;
    }
}
