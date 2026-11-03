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
    public static final String f36461j = x5.w.i("WorkContinuationImpl");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1 f36462a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x5.j f36463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<? extends x5.q0> f36464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<String> f36465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<String> f36466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<f0> f36467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f36468h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public x5.a0 f36469i;

    public f0(f1 f1Var, List<? extends x5.q0> list) {
        this(f1Var, null, x5.j.KEEP, list, null);
    }

    public static /* synthetic */ Unit a(f0 f0Var) {
        f0Var.getClass();
        g6.j.b(f0Var);
        return Unit.f22938a;
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
        if (this.f36468h) {
            x5.w.e().k(f36461j, "Already enqueued work ids (" + TextUtils.join(", ", this.f36465e) + ")");
        } else {
            this.f36469i = x5.e0.c(this.f36462a.n().getTracer(), "EnqueueRunnable_" + c().name(), this.f36462a.v().c(), new Function0() { // from class: y5.e0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f0.a(this.f36458a);
                }
            });
        }
        return this.f36469i;
    }

    public x5.j c() {
        return this.f36463c;
    }

    public List<String> d() {
        return this.f36465e;
    }

    public String e() {
        return this.b;
    }

    public List<f0> f() {
        return this.f36467g;
    }

    public List<? extends x5.q0> g() {
        return this.f36464d;
    }

    public f1 h() {
        return this.f36462a;
    }

    public boolean i() {
        return j(this, new HashSet());
    }

    public boolean k() {
        return this.f36468h;
    }

    public void l() {
        this.f36468h = true;
    }

    public f0(f1 f1Var, String str, x5.j jVar, List<? extends x5.q0> list) {
        this(f1Var, str, jVar, list, null);
    }

    public f0(f1 f1Var, String str, x5.j jVar, List<? extends x5.q0> list, List<f0> list2) {
        this.f36462a = f1Var;
        this.b = str;
        this.f36463c = jVar;
        this.f36464d = list;
        this.f36467g = list2;
        this.f36465e = new ArrayList(list.size());
        this.f36466f = new ArrayList();
        if (list2 != null) {
            Iterator<f0> it = list2.iterator();
            while (it.hasNext()) {
                this.f36466f.addAll(it.next().f36466f);
            }
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (jVar == x5.j.REPLACE && list.get(i10).getWorkSpec().getNextScheduleTimeOverride() != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String strB = list.get(i10).b();
            this.f36465e.add(strB);
            this.f36466f.add(strB);
        }
    }
}
