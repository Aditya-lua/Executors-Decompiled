package z5;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public class f0 extends y5.n0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f39003j = y5.w.i("WorkContinuationImpl");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1 f39004a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y5.j f39005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<? extends y5.q0> f39006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<String> f39007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<String> f39008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<f0> f39009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f39010h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public y5.a0 f39011i;

    public f0(f1 f1Var, List<? extends y5.q0> list) {
        this(f1Var, null, y5.j.KEEP, list, null);
    }

    public static /* synthetic */ Unit a(f0 f0Var) {
        f0Var.getClass();
        h6.j.b(f0Var);
        return Unit.f21506a;
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

    public y5.a0 b() {
        if (this.f39010h) {
            y5.w.e().k(f39003j, "Already enqueued work ids (" + TextUtils.join(", ", this.f39007e) + ")");
        } else {
            this.f39011i = y5.e0.c(this.f39004a.n().getTracer(), "EnqueueRunnable_" + c().name(), this.f39004a.v().c(), new Function0() { // from class: z5.e0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f0.a(this.f39000a);
                }
            });
        }
        return this.f39011i;
    }

    public y5.j c() {
        return this.f39005c;
    }

    public List<String> d() {
        return this.f39007e;
    }

    public String e() {
        return this.b;
    }

    public List<f0> f() {
        return this.f39009g;
    }

    public List<? extends y5.q0> g() {
        return this.f39006d;
    }

    public f1 h() {
        return this.f39004a;
    }

    public boolean i() {
        return j(this, new HashSet());
    }

    public boolean k() {
        return this.f39010h;
    }

    public void l() {
        this.f39010h = true;
    }

    public f0(f1 f1Var, String str, y5.j jVar, List<? extends y5.q0> list) {
        this(f1Var, str, jVar, list, null);
    }

    public f0(f1 f1Var, String str, y5.j jVar, List<? extends y5.q0> list, List<f0> list2) {
        this.f39004a = f1Var;
        this.b = str;
        this.f39005c = jVar;
        this.f39006d = list;
        this.f39009g = list2;
        this.f39007e = new ArrayList(list.size());
        this.f39008f = new ArrayList();
        if (list2 != null) {
            Iterator<f0> it = list2.iterator();
            while (it.hasNext()) {
                this.f39008f.addAll(it.next().f39008f);
            }
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (jVar == y5.j.REPLACE && list.get(i10).getWorkSpec().getNextScheduleTimeOverride() != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String strB = list.get(i10).b();
            this.f39007e.add(strB);
            this.f39008f.add(strB);
        }
    }
}
