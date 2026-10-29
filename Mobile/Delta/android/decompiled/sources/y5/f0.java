package y5;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public class f0 extends x5.n0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f35604j = x5.w.i("WorkContinuationImpl");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1 f35605a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x5.j f35606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<? extends x5.q0> f35607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<String> f35608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<String> f35609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<f0> f35610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f35611h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public x5.a0 f35612i;

    public f0(f1 f1Var, List<? extends x5.q0> list) {
        this(f1Var, null, x5.j.KEEP, list, null);
    }

    public static /* synthetic */ Unit a(f0 f0Var) {
        f0Var.getClass();
        g6.j.b(f0Var);
        return Unit.f22483a;
    }

    public static boolean j(f0 f0Var, Set<String> set) {
        set.addAll(f0Var.d());
        Set<String> setM = m(f0Var);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (setM.contains(it.next())) {
                return true;
            }
        }
        List<f0> listF = f0Var.f();
        if (listF != null && !listF.isEmpty()) {
            Iterator<f0> it2 = listF.iterator();
            while (it2.hasNext()) {
                if (j(it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(f0Var.d());
        return false;
    }

    public static Set<String> m(f0 f0Var) {
        HashSet hashSet = new HashSet();
        List<f0> listF = f0Var.f();
        if (listF != null && !listF.isEmpty()) {
            Iterator<f0> it = listF.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().d());
            }
        }
        return hashSet;
    }

    public x5.a0 b() {
        if (this.f35611h) {
            x5.w.e().k(f35604j, "Already enqueued work ids (" + TextUtils.join(", ", this.f35608e) + ")");
        } else {
            this.f35612i = x5.e0.c(this.f35605a.n().getTracer(), "EnqueueRunnable_" + c().name(), this.f35605a.v().c(), new Function0() { // from class: y5.e0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f0.a(this.f35601a);
                }
            });
        }
        return this.f35612i;
    }

    public x5.j c() {
        return this.f35606c;
    }

    public List<String> d() {
        return this.f35608e;
    }

    public String e() {
        return this.b;
    }

    public List<f0> f() {
        return this.f35610g;
    }

    public List<? extends x5.q0> g() {
        return this.f35607d;
    }

    public f1 h() {
        return this.f35605a;
    }

    public boolean i() {
        return j(this, new HashSet());
    }

    public boolean k() {
        return this.f35611h;
    }

    public void l() {
        this.f35611h = true;
    }

    public f0(f1 f1Var, String str, x5.j jVar, List<? extends x5.q0> list) {
        this(f1Var, str, jVar, list, null);
    }

    public f0(f1 f1Var, String str, x5.j jVar, List<? extends x5.q0> list, List<f0> list2) {
        this.f35605a = f1Var;
        this.b = str;
        this.f35606c = jVar;
        this.f35607d = list;
        this.f35610g = list2;
        this.f35608e = new ArrayList(list.size());
        this.f35609f = new ArrayList();
        if (list2 != null) {
            Iterator<f0> it = list2.iterator();
            while (it.hasNext()) {
                this.f35609f.addAll(it.next().f35609f);
            }
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (jVar == x5.j.REPLACE && list.get(i10).getWorkSpec().getNextScheduleTimeOverride() != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String strB = list.get(i10).b();
            this.f35608e.add(strB);
            this.f35609f.add(strB);
        }
    }
}
