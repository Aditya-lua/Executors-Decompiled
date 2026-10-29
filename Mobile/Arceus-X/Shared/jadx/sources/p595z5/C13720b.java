package p595z5;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.C1115a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import p026b6.AbstractC1237b;
import p026b6.C1247l;
import p026b6.C1248m;
import p026b6.InterfaceC1244i;
import p069d6.C4463n;
import p120f6.C5390j0;
import p120f6.C5406o1;
import p120f6.WorkGenerationalId;
import p146g6.C6044x;
import p161h6.InterfaceC6292b;
import p256ku.InterfaceC7850d2;
import p536x5.AbstractC12732w;
import p536x5.C12694d;
import p536x5.C12717o0;
import p536x5.InterfaceC12707j0;
import p567y5.C13085s;
import p567y5.C13098y;
import p567y5.InterfaceC13036b1;
import p567y5.InterfaceC13043e;
import p567y5.InterfaceC13090u;
import p567y5.InterfaceC13100z;

/* JADX INFO: renamed from: z5.b */
/* JADX INFO: loaded from: classes.dex */
public class C13720b implements InterfaceC13090u, InterfaceC1244i, InterfaceC13043e {

    /* JADX INFO: renamed from: o */
    public static final String f48248o = AbstractC12732w.m47443i("GreedyScheduler");

    /* JADX INFO: renamed from: a */
    public final Context f48249a;

    /* JADX INFO: renamed from: c */
    public C13719a f48251c;

    /* JADX INFO: renamed from: d */
    public boolean f48252d;

    /* JADX INFO: renamed from: g */
    public final C13085s f48255g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC13036b1 f48256h;

    /* JADX INFO: renamed from: i */
    public final C1115a f48257i;

    /* JADX INFO: renamed from: k */
    public Boolean f48259k;

    /* JADX INFO: renamed from: l */
    public final C1247l f48260l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC6292b f48261m;

    /* JADX INFO: renamed from: n */
    public final C13722d f48262n;

    /* JADX INFO: renamed from: b */
    public final Map<WorkGenerationalId, InterfaceC7850d2> f48250b = new HashMap();

    /* JADX INFO: renamed from: e */
    public final Object f48253e = new Object();

    /* JADX INFO: renamed from: f */
    public final InterfaceC13100z f48254f = InterfaceC13100z.m48691a();

    /* JADX INFO: renamed from: j */
    public final Map<WorkGenerationalId, b> f48258j = new HashMap();

    /* JADX INFO: renamed from: z5.b$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final int f48263a;

        /* JADX INFO: renamed from: b */
        public final long f48264b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b(int i10, long j10) {
            this.f48263a = i10;
            this.f48264b = j10;
        }
    }

    public C13720b(Context context, C1115a c1115a, C4463n c4463n, C13085s c13085s, InterfaceC13036b1 interfaceC13036b1, InterfaceC6292b interfaceC6292b) {
        this.f48249a = context;
        InterfaceC12707j0 runnableScheduler = c1115a.getRunnableScheduler();
        this.f48251c = new C13719a(this, runnableScheduler, c1115a.getClock());
        this.f48262n = new C13722d(runnableScheduler, interfaceC13036b1);
        this.f48261m = interfaceC6292b;
        this.f48260l = new C1247l(c4463n);
        this.f48257i = c1115a;
        this.f48255g = c13085s;
        this.f48256h = interfaceC13036b1;
    }

    @Override // p567y5.InterfaceC13090u
    /* JADX INFO: renamed from: a */
    public void mo193a(C5390j0... c5390j0Arr) {
        if (this.f48259k == null) {
            m50115f();
        }
        if (!this.f48259k.booleanValue()) {
            AbstractC12732w.m47441e().mo47448f(f48248o, "Ignoring schedule request in a secondary process");
            return;
        }
        m50116g();
        HashSet<C5390j0> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C5390j0 c5390j0 : c5390j0Arr) {
            if (!this.f48254f.mo48548e(C5406o1.m24872a(c5390j0))) {
                long jMax = Math.max(c5390j0.m24751c(), m50118i(c5390j0));
                long jMo47323a = this.f48257i.getClock().mo47323a();
                if (c5390j0.state == C12717o0.c.ENQUEUED) {
                    if (jMo47323a < jMax) {
                        C13719a c13719a = this.f48251c;
                        if (c13719a != null) {
                            c13719a.m50113a(c5390j0, jMax);
                        }
                    } else if (c5390j0.m24760m()) {
                        C12694d c12694d = c5390j0.constraints;
                        if (c12694d.getRequiresDeviceIdle()) {
                            AbstractC12732w.m47441e().mo47444a(f48248o, "Ignoring " + c5390j0 + ". Requires device idle.");
                        } else if (c12694d.m47340g()) {
                            AbstractC12732w.m47441e().mo47444a(f48248o, "Ignoring " + c5390j0 + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(c5390j0);
                            hashSet2.add(c5390j0.id);
                        }
                    } else if (!this.f48254f.mo48548e(C5406o1.m24872a(c5390j0))) {
                        AbstractC12732w.m47441e().mo47444a(f48248o, "Starting work for " + c5390j0.id);
                        C13098y c13098yM48693d = this.f48254f.m48693d(c5390j0);
                        this.f48262n.m50122c(c13098yM48693d);
                        this.f48256h.m48553d(c13098yM48693d);
                    }
                }
            }
        }
        synchronized (this.f48253e) {
            try {
                if (!hashSet.isEmpty()) {
                    AbstractC12732w.m47441e().mo47444a(f48248o, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    for (C5390j0 c5390j1 : hashSet) {
                        WorkGenerationalId workGenerationalIdM24872a = C5406o1.m24872a(c5390j1);
                        if (!this.f48250b.containsKey(workGenerationalIdM24872a)) {
                            this.f48250b.put(workGenerationalIdM24872a, C1248m.m6965e(this.f48260l, c5390j1, this.f48261m.mo27571b(), this));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p567y5.InterfaceC13090u
    /* JADX INFO: renamed from: b */
    public void mo194b(String str) {
        if (this.f48259k == null) {
            m50115f();
        }
        if (!this.f48259k.booleanValue()) {
            AbstractC12732w.m47441e().mo47448f(f48248o, "Ignoring schedule request in non-main process");
            return;
        }
        m50116g();
        AbstractC12732w.m47441e().mo47444a(f48248o, "Cancelling work ID " + str);
        C13719a c13719a = this.f48251c;
        if (c13719a != null) {
            c13719a.m50114b(str);
        }
        for (C13098y c13098y : this.f48254f.remove(str)) {
            this.f48262n.m50121b(c13098y);
            this.f48256h.m48550a(c13098y);
        }
    }

    @Override // p567y5.InterfaceC13090u
    /* JADX INFO: renamed from: c */
    public boolean mo195c() {
        return false;
    }

    @Override // p567y5.InterfaceC13043e
    /* JADX INFO: renamed from: d */
    public void mo6396d(WorkGenerationalId workGenerationalId, boolean z10) {
        C13098y c13098yMo48547c = this.f48254f.mo48547c(workGenerationalId);
        if (c13098yMo48547c != null) {
            this.f48262n.m50121b(c13098yMo48547c);
        }
        m50117h(workGenerationalId);
        if (z10) {
            return;
        }
        synchronized (this.f48253e) {
            this.f48258j.remove(workGenerationalId);
        }
    }

    @Override // p026b6.InterfaceC1244i
    /* JADX INFO: renamed from: e */
    public void mo6414e(C5390j0 c5390j0, AbstractC1237b abstractC1237b) {
        WorkGenerationalId workGenerationalIdM24872a = C5406o1.m24872a(c5390j0);
        if (abstractC1237b instanceof AbstractC1237b.a) {
            if (this.f48254f.mo48548e(workGenerationalIdM24872a)) {
                return;
            }
            AbstractC12732w.m47441e().mo47444a(f48248o, "Constraints met: Scheduling work ID " + workGenerationalIdM24872a);
            C13098y c13098yMo48549f = this.f48254f.mo48549f(workGenerationalIdM24872a);
            this.f48262n.m50122c(c13098yMo48549f);
            this.f48256h.m48553d(c13098yMo48549f);
            return;
        }
        AbstractC12732w.m47441e().mo47444a(f48248o, "Constraints not met: Cancelling work ID " + workGenerationalIdM24872a);
        C13098y c13098yMo48547c = this.f48254f.mo48547c(workGenerationalIdM24872a);
        if (c13098yMo48547c != null) {
            this.f48262n.m50121b(c13098yMo48547c);
            this.f48256h.m48552c(c13098yMo48547c, ((AbstractC1237b.ConstraintsNotMet) abstractC1237b).getReason());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m50115f() {
        this.f48259k = Boolean.valueOf(C6044x.m26866b(this.f48249a, this.f48257i));
    }

    /* JADX INFO: renamed from: g */
    public final void m50116g() {
        if (this.f48252d) {
            return;
        }
        this.f48255g.m48663e(this);
        this.f48252d = true;
    }

    /* JADX INFO: renamed from: h */
    public final void m50117h(WorkGenerationalId workGenerationalId) {
        InterfaceC7850d2 interfaceC7850d2Remove;
        synchronized (this.f48253e) {
            interfaceC7850d2Remove = this.f48250b.remove(workGenerationalId);
        }
        if (interfaceC7850d2Remove != null) {
            AbstractC12732w.m47441e().mo47444a(f48248o, "Stopping tracking for " + workGenerationalId);
            interfaceC7850d2Remove.mo32597c(null);
        }
    }

    /* JADX INFO: renamed from: i */
    public final long m50118i(C5390j0 c5390j0) {
        long jMax;
        synchronized (this.f48253e) {
            try {
                WorkGenerationalId workGenerationalIdM24872a = C5406o1.m24872a(c5390j0);
                b bVar = this.f48258j.get(workGenerationalIdM24872a);
                if (bVar == null) {
                    bVar = new b(c5390j0.runAttemptCount, this.f48257i.getClock().mo47323a());
                    this.f48258j.put(workGenerationalIdM24872a, bVar);
                }
                jMax = bVar.f48264b + (((long) Math.max((c5390j0.runAttemptCount - bVar.f48263a) - 5, 0)) * 30000);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jMax;
    }
}
