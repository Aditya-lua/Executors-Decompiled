package p5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.annotation.NonNull;
import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class q implements Cloneable {
    public static final Animator[] M = new Animator[0];
    public static final int[] N = {2, 1, 3, 4};
    public static final k O = new a();
    public static ThreadLocal<w1.a<Animator, d>> P = new ThreadLocal<>();
    public z F;
    public e G;
    public w1.a<String, String> H;
    public long J;
    public g K;
    public long L;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList<d0> f28911t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList<d0> f28912u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public h[] f28913v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f28893a = getClass().getName();
    public long b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f28894c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TimeInterpolator f28895d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<Integer> f28896e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<View> f28897f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList<String> f28898g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<Class<?>> f28899h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList<Integer> f28900i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList<View> f28901j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList<Class<?>> f28902k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList<String> f28903l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList<Integer> f28904m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList<View> f28905n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList<Class<?>> f28906o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public e0 f28907p = new e0();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public e0 f28908q = new e0();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b0 f28909r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int[] f28910s = N;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f28914w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList<Animator> f28915x = new ArrayList<>();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Animator[] f28916y = M;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f28917z = 0;
    public boolean A = false;
    public boolean B = false;
    public q C = null;
    public ArrayList<h> D = null;
    public ArrayList<Animator> E = new ArrayList<>();
    public k I = O;

    public class a extends k {
        @Override // p5.k
        @NonNull
        public Path a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    public class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w1.a f28918a;

        public b(w1.a aVar) {
            this.f28918a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f28918a.remove(animator);
            q.this.f28915x.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            q.this.f28915x.add(animator);
        }
    }

    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            q.this.y();
            animator.removeListener(this);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f28920a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public d0 f28921c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public WindowId f28922d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public q f28923e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Animator f28924f;

        public d(View view, String str, q qVar, WindowId windowId, d0 d0Var, Animator animator) {
            this.f28920a = view;
            this.b = str;
            this.f28921c = d0Var;
            this.f28922d = windowId;
            this.f28923e = qVar;
            this.f28924f = animator;
        }
    }

    public static abstract class e {
        public abstract Rect a(@NonNull q qVar);
    }

    public static class f {
        public static long a(Animator animator) {
            return animator.getTotalDuration();
        }

        public static void b(Animator animator, long j10) {
            ((AnimatorSet) animator).setCurrentPlayTime(j10);
        }
    }

    public class g extends x implements a0, z3.b.r {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f28927d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f28928e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public z3.e f28929f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Runnable f28932i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f28925a = -1;
        public ArrayList<x2.a<a0>> b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList<x2.a<a0>> f28926c = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public x2.a<a0>[] f28930g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final g0 f28931h = new g0();

        public g() {
        }

        public static /* synthetic */ void n(g gVar, z3.b bVar, boolean z10, float f10, float f11) {
            if (z10) {
                gVar.getClass();
                return;
            }
            if (f10 >= 1.0f) {
                q.this.m0(i.b, false);
                return;
            }
            long jE = gVar.e();
            q qVarJ0 = ((b0) q.this).J0(0);
            q qVar = qVarJ0.C;
            qVarJ0.C = null;
            q.this.w0(-1L, gVar.f28925a);
            q.this.w0(jE, -1L);
            gVar.f28925a = jE;
            Runnable runnable = gVar.f28932i;
            if (runnable != null) {
                runnable.run();
            }
            q.this.E.clear();
            if (qVar != null) {
                qVar.m0(i.b, true);
            }
        }

        @Override // p5.a0
        public boolean a() {
            return this.f28927d;
        }

        @Override // p5.a0
        public void d() {
            p();
            this.f28929f.s(e() + 1);
        }

        @Override // p5.a0
        public long e() {
            return q.this.X();
        }

        @Override // p5.a0
        public void i(long j10) {
            if (this.f28929f != null) {
                throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            if (j10 == this.f28925a || !a()) {
                return;
            }
            if (!this.f28928e) {
                if (j10 != 0 || this.f28925a <= 0) {
                    long jE = e();
                    if (j10 == jE && this.f28925a < jE) {
                        j10 = 1 + jE;
                    }
                } else {
                    j10 = -1;
                }
                long j11 = this.f28925a;
                if (j10 != j11) {
                    q.this.w0(j10, j11);
                    this.f28925a = j10;
                }
            }
            o();
            this.f28931h.a(AnimationUtils.currentAnimationTimeMillis(), j10);
        }

        @Override // p5.x, p5.q.h
        public void k(@NonNull q qVar) {
            this.f28928e = true;
        }

        @Override // p5.a0
        public void l(@NonNull Runnable runnable) {
            this.f28932i = runnable;
            p();
            this.f28929f.s(0.0f);
        }

        @Override // z3.b.r
        public void m(z3.b bVar, float f10, float f11) {
            long jMax = Math.max(-1L, Math.min(e() + 1, Math.round(f10)));
            q.this.w0(jMax, this.f28925a);
            this.f28925a = jMax;
            o();
        }

        public final void o() {
            ArrayList<x2.a<a0>> arrayList = this.f28926c;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            int size = this.f28926c.size();
            if (this.f28930g == null) {
                this.f28930g = new x2.a[size];
            }
            x2.a<a0>[] aVarArr = (x2.a[]) this.f28926c.toArray(this.f28930g);
            this.f28930g = null;
            for (int i10 = 0; i10 < size; i10++) {
                aVarArr[i10].accept(this);
                aVarArr[i10] = null;
            }
            this.f28930g = aVarArr;
        }

        public final void p() {
            if (this.f28929f != null) {
                return;
            }
            this.f28931h.a(AnimationUtils.currentAnimationTimeMillis(), this.f28925a);
            this.f28929f = new z3.e(new z3.d());
            z3.f fVar = new z3.f();
            fVar.d(1.0f);
            fVar.f(200.0f);
            this.f28929f.w(fVar);
            this.f28929f.m(this.f28925a);
            this.f28929f.c(this);
            this.f28929f.n(this.f28931h.b());
            this.f28929f.i(e() + 1);
            this.f28929f.j(-1.0f);
            this.f28929f.k(4.0f);
            this.f28929f.b(new z3.b.q() { // from class: p5.r
                @Override // z3.b.q
                public final void a(z3.b bVar, boolean z10, float f10, float f11) {
                    q.g.n(this.f28938a, bVar, z10, f10, f11);
                }
            });
        }

        public void q() {
            long j10 = e() == 0 ? 1L : 0L;
            q.this.w0(j10, this.f28925a);
            this.f28925a = j10;
        }

        public void r() {
            this.f28927d = true;
            ArrayList<x2.a<a0>> arrayList = this.b;
            if (arrayList != null) {
                this.b = null;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    arrayList.get(i10).accept(this);
                }
            }
            o();
        }
    }

    public interface h {
        void b(@NonNull q qVar);

        void c(@NonNull q qVar);

        void f(@NonNull q qVar);

        default void g(@NonNull q qVar, boolean z10) {
            b(qVar);
        }

        void h(@NonNull q qVar);

        default void j(@NonNull q qVar, boolean z10) {
            c(qVar);
        }

        void k(@NonNull q qVar);
    }

    public interface i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f28934a = new i() { // from class: p5.s
            @Override // p5.q.i
            public final void a(q.h hVar, q qVar, boolean z10) {
                hVar.j(qVar, z10);
            }
        };
        public static final i b = new i() { // from class: p5.t
            @Override // p5.q.i
            public final void a(q.h hVar, q qVar, boolean z10) {
                hVar.g(qVar, z10);
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f28935c = new i() { // from class: p5.u
            @Override // p5.q.i
            public final void a(q.h hVar, q qVar, boolean z10) {
                hVar.k(qVar);
            }
        };

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final i f28936d = new i() { // from class: p5.v
            @Override // p5.q.i
            public final void a(q.h hVar, q qVar, boolean z10) {
                hVar.f(qVar);
            }
        };

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final i f28937e = new i() { // from class: p5.w
            @Override // p5.q.i
            public final void a(q.h hVar, q qVar, boolean z10) {
                hVar.h(qVar);
            }
        };

        void a(@NonNull h hVar, @NonNull q qVar, boolean z10);
    }

    public static w1.a<Animator, d> P() {
        w1.a<Animator, d> aVar = P.get();
        if (aVar != null) {
            return aVar;
        }
        w1.a<Animator, d> aVar2 = new w1.a<>();
        P.set(aVar2);
        return aVar2;
    }

    public static boolean f0(d0 d0Var, d0 d0Var2, String str) {
        Object obj = d0Var.f28825a.get(str);
        Object obj2 = d0Var2.f28825a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public static void i(e0 e0Var, View view, d0 d0Var) {
        e0Var.f28828a.put(view, d0Var);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (e0Var.b.indexOfKey(id2) >= 0) {
                e0Var.b.put(id2, null);
            } else {
                e0Var.b.put(id2, view);
            }
        }
        String strH = androidx.core.view.o0.H(view);
        if (strH != null) {
            if (e0Var.f28830d.containsKey(strH)) {
                e0Var.f28830d.put(strH, null);
            } else {
                e0Var.f28830d.put(strH, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (e0Var.f28829c.f(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    e0Var.f28829c.k(itemIdAtPosition, view);
                    return;
                }
                View viewE = e0Var.f28829c.e(itemIdAtPosition);
                if (viewE != null) {
                    viewE.setHasTransientState(false);
                    e0Var.f28829c.k(itemIdAtPosition, null);
                }
            }
        }
    }

    public void A0(k kVar) {
        if (kVar == null) {
            this.I = O;
        } else {
            this.I = kVar;
        }
    }

    public long B() {
        return this.f28894c;
    }

    public void B0(z zVar) {
        this.F = zVar;
    }

    public Rect C() {
        e eVar = this.G;
        if (eVar == null) {
            return null;
        }
        return eVar.a(this);
    }

    @NonNull
    public q C0(long j10) {
        this.b = j10;
        return this;
    }

    public e D() {
        return this.G;
    }

    public void D0() {
        if (this.f28917z == 0) {
            m0(i.f28934a, false);
            this.B = false;
        }
        this.f28917z++;
    }

    public String E0(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(": ");
        if (this.f28894c != -1) {
            sb2.append("dur(");
            sb2.append(this.f28894c);
            sb2.append(") ");
        }
        if (this.b != -1) {
            sb2.append("dly(");
            sb2.append(this.b);
            sb2.append(") ");
        }
        if (this.f28895d != null) {
            sb2.append("interp(");
            sb2.append(this.f28895d);
            sb2.append(") ");
        }
        if (this.f28896e.size() > 0 || this.f28897f.size() > 0) {
            sb2.append("tgts(");
            if (this.f28896e.size() > 0) {
                for (int i10 = 0; i10 < this.f28896e.size(); i10++) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(this.f28896e.get(i10));
                }
            }
            if (this.f28897f.size() > 0) {
                for (int i11 = 0; i11 < this.f28897f.size(); i11++) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(this.f28897f.get(i11));
                }
            }
            sb2.append(")");
        }
        return sb2.toString();
    }

    public TimeInterpolator F() {
        return this.f28895d;
    }

    public d0 G(View view, boolean z10) {
        b0 b0Var = this.f28909r;
        if (b0Var != null) {
            return b0Var.G(view, z10);
        }
        ArrayList<d0> arrayList = z10 ? this.f28911t : this.f28912u;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            }
            d0 d0Var = arrayList.get(i10);
            if (d0Var == null) {
                return null;
            }
            if (d0Var.b == view) {
                break;
            }
            i10++;
        }
        if (i10 >= 0) {
            return (z10 ? this.f28912u : this.f28911t).get(i10);
        }
        return null;
    }

    @NonNull
    public String H() {
        return this.f28893a;
    }

    @NonNull
    public k J() {
        return this.I;
    }

    public z M() {
        return this.F;
    }

    @NonNull
    public final q O() {
        b0 b0Var = this.f28909r;
        return b0Var != null ? b0Var.O() : this;
    }

    public long R() {
        return this.b;
    }

    @NonNull
    public List<Integer> S() {
        return this.f28896e;
    }

    public List<String> U() {
        return this.f28898g;
    }

    public List<Class<?>> V() {
        return this.f28899h;
    }

    @NonNull
    public List<View> W() {
        return this.f28897f;
    }

    public final long X() {
        return this.J;
    }

    public String[] Y() {
        return null;
    }

    public d0 Z(@NonNull View view, boolean z10) {
        b0 b0Var = this.f28909r;
        if (b0Var != null) {
            return b0Var.Z(view, z10);
        }
        return (z10 ? this.f28907p : this.f28908q).f28828a.get(view);
    }

    public boolean a0() {
        return !this.f28915x.isEmpty();
    }

    @NonNull
    public q c(@NonNull h hVar) {
        if (this.D == null) {
            this.D = new ArrayList<>();
        }
        this.D.add(hVar);
        return this;
    }

    public boolean c0() {
        return false;
    }

    public void cancel() {
        int size = this.f28915x.size();
        Animator[] animatorArr = (Animator[]) this.f28915x.toArray(this.f28916y);
        this.f28916y = M;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.cancel();
        }
        this.f28916y = animatorArr;
        m0(i.f28935c, false);
    }

    public boolean d0(d0 d0Var, d0 d0Var2) {
        if (d0Var != null && d0Var2 != null) {
            String[] strArrY = Y();
            if (strArrY != null) {
                for (String str : strArrY) {
                    if (f0(d0Var, d0Var2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator<String> it = d0Var.f28825a.keySet().iterator();
                while (it.hasNext()) {
                    if (f0(d0Var, d0Var2, it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @NonNull
    public q e(@NonNull View view) {
        this.f28897f.add(view);
        return this;
    }

    public boolean e0(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id2 = view.getId();
        ArrayList<Integer> arrayList3 = this.f28900i;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f28901j;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f28902k;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f28902k.get(i10).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f28903l != null && androidx.core.view.o0.H(view) != null && this.f28903l.contains(androidx.core.view.o0.H(view))) {
            return false;
        }
        if ((this.f28896e.size() == 0 && this.f28897f.size() == 0 && (((arrayList = this.f28899h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f28898g) == null || arrayList2.isEmpty()))) || this.f28896e.contains(Integer.valueOf(id2)) || this.f28897f.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f28898g;
        if (arrayList6 != null && arrayList6.contains(androidx.core.view.o0.H(view))) {
            return true;
        }
        if (this.f28899h != null) {
            for (int i11 = 0; i11 < this.f28899h.size(); i11++) {
                if (this.f28899h.get(i11).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void f(w1.a<View, d0> aVar, w1.a<View, d0> aVar2) {
        for (int i10 = 0; i10 < aVar.getSize(); i10++) {
            d0 d0VarJ = aVar.j(i10);
            if (e0(d0VarJ.b)) {
                this.f28911t.add(d0VarJ);
                this.f28912u.add(null);
            }
        }
        for (int i11 = 0; i11 < aVar2.getSize(); i11++) {
            d0 d0VarJ2 = aVar2.j(i11);
            if (e0(d0VarJ2.b)) {
                this.f28912u.add(d0VarJ2);
                this.f28911t.add(null);
            }
        }
    }

    public final void g0(w1.a<View, d0> aVar, w1.a<View, d0> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View viewValueAt = sparseArray.valueAt(i10);
            if (viewValueAt != null && e0(viewValueAt) && (view = sparseArray2.get(sparseArray.keyAt(i10))) != null && e0(view)) {
                d0 d0Var = aVar.get(viewValueAt);
                d0 d0Var2 = aVar2.get(view);
                if (d0Var != null && d0Var2 != null) {
                    this.f28911t.add(d0Var);
                    this.f28912u.add(d0Var2);
                    aVar.remove(viewValueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    public final void h0(w1.a<View, d0> aVar, w1.a<View, d0> aVar2) {
        d0 d0VarRemove;
        for (int size = aVar.getSize() - 1; size >= 0; size--) {
            View viewF = aVar.f(size);
            if (viewF != null && e0(viewF) && (d0VarRemove = aVar2.remove(viewF)) != null && e0(d0VarRemove.b)) {
                this.f28911t.add(aVar.h(size));
                this.f28912u.add(d0VarRemove);
            }
        }
    }

    public final void i0(w1.a<View, d0> aVar, w1.a<View, d0> aVar2, w1.g<View> gVar, w1.g<View> gVar2) {
        View viewE;
        int iP = gVar.p();
        for (int i10 = 0; i10 < iP; i10++) {
            View viewQ = gVar.q(i10);
            if (viewQ != null && e0(viewQ) && (viewE = gVar2.e(gVar.i(i10))) != null && e0(viewE)) {
                d0 d0Var = aVar.get(viewQ);
                d0 d0Var2 = aVar2.get(viewE);
                if (d0Var != null && d0Var2 != null) {
                    this.f28911t.add(d0Var);
                    this.f28912u.add(d0Var2);
                    aVar.remove(viewQ);
                    aVar2.remove(viewE);
                }
            }
        }
    }

    public final void j0(w1.a<View, d0> aVar, w1.a<View, d0> aVar2, w1.a<String, View> aVar3, w1.a<String, View> aVar4) {
        View view;
        int size = aVar3.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            View viewJ = aVar3.j(i10);
            if (viewJ != null && e0(viewJ) && (view = aVar4.get(aVar3.f(i10))) != null && e0(view)) {
                d0 d0Var = aVar.get(viewJ);
                d0 d0Var2 = aVar2.get(view);
                if (d0Var != null && d0Var2 != null) {
                    this.f28911t.add(d0Var);
                    this.f28912u.add(d0Var2);
                    aVar.remove(viewJ);
                    aVar2.remove(view);
                }
            }
        }
    }

    public void k(Animator animator) {
        if (animator == null) {
            y();
            return;
        }
        if (B() >= 0) {
            animator.setDuration(B());
        }
        if (R() >= 0) {
            animator.setStartDelay(R() + animator.getStartDelay());
        }
        if (F() != null) {
            animator.setInterpolator(F());
        }
        animator.addListener(new c());
        animator.start();
    }

    public final void k0(e0 e0Var, e0 e0Var2) {
        w1.a<View, d0> aVar = new w1.a<>(e0Var.f28828a);
        w1.a<View, d0> aVar2 = new w1.a<>(e0Var2.f28828a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.f28910s;
            if (i10 >= iArr.length) {
                f(aVar, aVar2);
                return;
            }
            int i11 = iArr[i10];
            if (i11 == 1) {
                h0(aVar, aVar2);
            } else if (i11 == 2) {
                j0(aVar, aVar2, e0Var.f28830d, e0Var2.f28830d);
            } else if (i11 == 3) {
                g0(aVar, aVar2, e0Var.b, e0Var2.b);
            } else if (i11 == 4) {
                i0(aVar, aVar2, e0Var.f28829c, e0Var2.f28829c);
            }
            i10++;
        }
    }

    public abstract void l(@NonNull d0 d0Var);

    public final void l0(q qVar, i iVar, boolean z10) {
        q qVar2 = this.C;
        if (qVar2 != null) {
            qVar2.l0(qVar, iVar, z10);
        }
        ArrayList<h> arrayList = this.D;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.D.size();
        h[] hVarArr = this.f28913v;
        if (hVarArr == null) {
            hVarArr = new h[size];
        }
        this.f28913v = null;
        h[] hVarArr2 = (h[]) this.D.toArray(hVarArr);
        for (int i10 = 0; i10 < size; i10++) {
            iVar.a(hVarArr2[i10], qVar, z10);
            hVarArr2[i10] = null;
        }
        this.f28913v = hVarArr2;
    }

    public void m0(i iVar, boolean z10) {
        l0(this, iVar, z10);
    }

    public void n0(View view) {
        if (this.B) {
            return;
        }
        int size = this.f28915x.size();
        Animator[] animatorArr = (Animator[]) this.f28915x.toArray(this.f28916y);
        this.f28916y = M;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.pause();
        }
        this.f28916y = animatorArr;
        m0(i.f28936d, false);
        this.A = true;
    }

    public final void o(View view, boolean z10) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList<Integer> arrayList = this.f28900i;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
            ArrayList<View> arrayList2 = this.f28901j;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.f28902k;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f28902k.get(i10).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    d0 d0Var = new d0(view);
                    if (z10) {
                        q(d0Var);
                    } else {
                        l(d0Var);
                    }
                    d0Var.f28826c.add(this);
                    p(d0Var);
                    if (z10) {
                        i(this.f28907p, view, d0Var);
                    } else {
                        i(this.f28908q, view, d0Var);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.f28904m;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                        ArrayList<View> arrayList5 = this.f28905n;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.f28906o;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    if (this.f28906o.get(i11).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                                o(viewGroup.getChildAt(i12), z10);
                            }
                        }
                    }
                }
            }
        }
    }

    public void o0(@NonNull ViewGroup viewGroup) {
        d dVar;
        this.f28911t = new ArrayList<>();
        this.f28912u = new ArrayList<>();
        k0(this.f28907p, this.f28908q);
        w1.a<Animator, d> aVarP = P();
        int size = aVarP.getSize();
        WindowId windowId = viewGroup.getWindowId();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animatorF = aVarP.f(i10);
            if (animatorF != null && (dVar = aVarP.get(animatorF)) != null && dVar.f28920a != null && windowId.equals(dVar.f28922d)) {
                d0 d0Var = dVar.f28921c;
                View view = dVar.f28920a;
                d0 d0VarZ = Z(view, true);
                d0 d0VarG = G(view, true);
                if (d0VarZ == null && d0VarG == null) {
                    d0VarG = this.f28908q.f28828a.get(view);
                }
                if ((d0VarZ != null || d0VarG != null) && dVar.f28923e.d0(d0Var, d0VarG)) {
                    q qVar = dVar.f28923e;
                    if (qVar.O().K != null) {
                        animatorF.cancel();
                        qVar.f28915x.remove(animatorF);
                        aVarP.remove(animatorF);
                        if (qVar.f28915x.size() == 0) {
                            qVar.m0(i.f28935c, false);
                            if (!qVar.B) {
                                qVar.B = true;
                                qVar.m0(i.b, false);
                            }
                        }
                    } else if (animatorF.isRunning() || animatorF.isStarted()) {
                        animatorF.cancel();
                    } else {
                        aVarP.remove(animatorF);
                    }
                }
            }
        }
        v(viewGroup, this.f28907p, this.f28908q, this.f28911t, this.f28912u);
        if (this.K == null) {
            u0();
        } else if (Build.VERSION.SDK_INT >= 34) {
            p0();
            this.K.q();
            this.K.r();
        }
    }

    public void p(d0 d0Var) {
        String[] strArrB;
        if (this.F == null || d0Var.f28825a.isEmpty() || (strArrB = this.F.b()) == null) {
            return;
        }
        for (String str : strArrB) {
            if (!d0Var.f28825a.containsKey(str)) {
                this.F.a(d0Var);
                return;
            }
        }
    }

    public void p0() {
        w1.a<Animator, d> aVarP = P();
        this.J = 0L;
        for (int i10 = 0; i10 < this.E.size(); i10++) {
            Animator animator = this.E.get(i10);
            d dVar = aVarP.get(animator);
            if (animator != null && dVar != null) {
                if (B() >= 0) {
                    dVar.f28924f.setDuration(B());
                }
                if (R() >= 0) {
                    dVar.f28924f.setStartDelay(R() + dVar.f28924f.getStartDelay());
                }
                if (F() != null) {
                    dVar.f28924f.setInterpolator(F());
                }
                this.f28915x.add(animator);
                this.J = Math.max(this.J, f.a(animator));
            }
        }
        this.E.clear();
    }

    public abstract void q(@NonNull d0 d0Var);

    @NonNull
    public q q0(@NonNull h hVar) {
        q qVar;
        ArrayList<h> arrayList = this.D;
        if (arrayList != null) {
            if (!arrayList.remove(hVar) && (qVar = this.C) != null) {
                qVar.q0(hVar);
            }
            if (this.D.size() == 0) {
                this.D = null;
            }
        }
        return this;
    }

    public void r(@NonNull ViewGroup viewGroup, boolean z10) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        w1.a<String, String> aVar;
        s(z10);
        if ((this.f28896e.size() > 0 || this.f28897f.size() > 0) && (((arrayList = this.f28898g) == null || arrayList.isEmpty()) && ((arrayList2 = this.f28899h) == null || arrayList2.isEmpty()))) {
            for (int i10 = 0; i10 < this.f28896e.size(); i10++) {
                View viewFindViewById = viewGroup.findViewById(this.f28896e.get(i10).intValue());
                if (viewFindViewById != null) {
                    d0 d0Var = new d0(viewFindViewById);
                    if (z10) {
                        q(d0Var);
                    } else {
                        l(d0Var);
                    }
                    d0Var.f28826c.add(this);
                    p(d0Var);
                    if (z10) {
                        i(this.f28907p, viewFindViewById, d0Var);
                    } else {
                        i(this.f28908q, viewFindViewById, d0Var);
                    }
                }
            }
            for (int i11 = 0; i11 < this.f28897f.size(); i11++) {
                View view = this.f28897f.get(i11);
                d0 d0Var2 = new d0(view);
                if (z10) {
                    q(d0Var2);
                } else {
                    l(d0Var2);
                }
                d0Var2.f28826c.add(this);
                p(d0Var2);
                if (z10) {
                    i(this.f28907p, view, d0Var2);
                } else {
                    i(this.f28908q, view, d0Var2);
                }
            }
        } else {
            o(viewGroup, z10);
        }
        if (z10 || (aVar = this.H) == null) {
            return;
        }
        int size = aVar.getSize();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList3.add(this.f28907p.f28830d.remove(this.H.f(i12)));
        }
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = (View) arrayList3.get(i13);
            if (view2 != null) {
                this.f28907p.f28830d.put(this.H.j(i13), view2);
            }
        }
    }

    @NonNull
    public q r0(@NonNull View view) {
        this.f28897f.remove(view);
        return this;
    }

    public void s(boolean z10) {
        if (z10) {
            this.f28907p.f28828a.clear();
            this.f28907p.b.clear();
            this.f28907p.f28829c.a();
        } else {
            this.f28908q.f28828a.clear();
            this.f28908q.b.clear();
            this.f28908q.f28829c.a();
        }
    }

    public void s0(View view) {
        if (this.A) {
            if (!this.B) {
                int size = this.f28915x.size();
                Animator[] animatorArr = (Animator[]) this.f28915x.toArray(this.f28916y);
                this.f28916y = M;
                for (int i10 = size - 1; i10 >= 0; i10--) {
                    Animator animator = animatorArr[i10];
                    animatorArr[i10] = null;
                    animator.resume();
                }
                this.f28916y = animatorArr;
                m0(i.f28937e, false);
            }
            this.A = false;
        }
    }

    @Override // 
    @NonNull
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public q clone() {
        try {
            q qVar = (q) super.clone();
            qVar.E = new ArrayList<>();
            qVar.f28907p = new e0();
            qVar.f28908q = new e0();
            qVar.f28911t = null;
            qVar.f28912u = null;
            qVar.K = null;
            qVar.C = this;
            qVar.D = null;
            return qVar;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void t0(Animator animator, w1.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            k(animator);
        }
    }

    @NonNull
    public String toString() {
        return E0(BuildConfig.FLAVOR);
    }

    public Animator u(@NonNull ViewGroup viewGroup, d0 d0Var, d0 d0Var2) {
        return null;
    }

    public void u0() {
        D0();
        w1.a<Animator, d> aVarP = P();
        ArrayList<Animator> arrayList = this.E;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Animator animator = arrayList.get(i10);
            i10++;
            Animator animator2 = animator;
            if (aVarP.containsKey(animator2)) {
                D0();
                t0(animator2, aVarP);
            }
        }
        this.E.clear();
        y();
    }

    public void v(@NonNull ViewGroup viewGroup, @NonNull e0 e0Var, @NonNull e0 e0Var2, @NonNull ArrayList<d0> arrayList, @NonNull ArrayList<d0> arrayList2) {
        Animator animatorU;
        Animator animator;
        int i10;
        boolean z10;
        int i11;
        View view;
        d0 d0Var;
        Animator animator2;
        View view2;
        Animator animator3;
        w1.a<Animator, d> aVarP = P();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z11 = O().K != null;
        long jMin = Long.MAX_VALUE;
        int i12 = 0;
        while (i12 < size) {
            d0 d0Var2 = arrayList.get(i12);
            d0 d0Var3 = arrayList2.get(i12);
            if (d0Var2 != null && !d0Var2.f28826c.contains(this)) {
                d0Var2 = null;
            }
            if (d0Var3 != null && !d0Var3.f28826c.contains(this)) {
                d0Var3 = null;
            }
            if (!(d0Var2 == null && d0Var3 == null) && ((d0Var2 == null || d0Var3 == null || d0(d0Var2, d0Var3)) && (animatorU = u(viewGroup, d0Var2, d0Var3)) != null)) {
                if (d0Var3 != null) {
                    View view3 = d0Var3.b;
                    String[] strArrY = Y();
                    if (strArrY != null && strArrY.length > 0) {
                        d0Var = new d0(view3);
                        i10 = size;
                        z10 = z11;
                        d0 d0Var4 = e0Var2.f28828a.get(view3);
                        i11 = i12;
                        if (d0Var4 != null) {
                            int i13 = 0;
                            while (i13 < strArrY.length) {
                                Map<String, Object> map = d0Var.f28825a;
                                int i14 = i13;
                                String str = strArrY[i14];
                                map.put(str, d0Var4.f28825a.get(str));
                                i13 = i14 + 1;
                                strArrY = strArrY;
                            }
                        }
                        int size2 = aVarP.getSize();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= size2) {
                                view2 = view3;
                                animator3 = animatorU;
                                break;
                            }
                            d dVar = aVarP.get(aVarP.f(i15));
                            if (dVar.f28921c != null && dVar.f28920a == view3) {
                                view2 = view3;
                                if (dVar.b.equals(H()) && dVar.f28921c.equals(d0Var)) {
                                    animator3 = null;
                                    break;
                                }
                            } else {
                                view2 = view3;
                            }
                            i15++;
                            view3 = view2;
                        }
                    } else {
                        view2 = view3;
                        i10 = size;
                        z10 = z11;
                        i11 = i12;
                        animator3 = animatorU;
                        d0Var = null;
                    }
                    animator = animator3;
                    view = view2;
                } else {
                    animator = animatorU;
                    i10 = size;
                    z10 = z11;
                    i11 = i12;
                    view = d0Var2.b;
                    d0Var = null;
                }
                if (animator != null) {
                    z zVar = this.F;
                    if (zVar != null) {
                        long jC = zVar.c(viewGroup, this, d0Var2, d0Var3);
                        sparseIntArray.put(this.E.size(), (int) jC);
                        jMin = Math.min(jC, jMin);
                    }
                    long j10 = jMin;
                    View view4 = view;
                    d0 d0Var5 = d0Var;
                    Animator animator4 = animator;
                    d dVar2 = new d(view4, H(), this, viewGroup.getWindowId(), d0Var5, animator4);
                    if (z10) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.play(animator4);
                        animator2 = animatorSet;
                    } else {
                        animator2 = animator4;
                    }
                    aVarP.put(animator2, dVar2);
                    this.E.add(animator2);
                    jMin = j10;
                }
            } else {
                i10 = size;
                z10 = z11;
                i11 = i12;
            }
            i12 = i11 + 1;
            size = i10;
            z11 = z10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i16 = 0; i16 < sparseIntArray.size(); i16++) {
                d dVar3 = aVarP.get(this.E.get(sparseIntArray.keyAt(i16)));
                dVar3.f28924f.setStartDelay((((long) sparseIntArray.valueAt(i16)) - jMin) + dVar3.f28924f.getStartDelay());
            }
        }
    }

    public void v0(boolean z10) {
        this.f28914w = z10;
    }

    public void w0(long j10, long j11) {
        long jX = X();
        int i10 = 0;
        boolean z10 = j10 < j11;
        if ((j11 < 0 && j10 >= 0) || (j11 > jX && j10 <= jX)) {
            this.B = false;
            m0(i.f28934a, z10);
        }
        int size = this.f28915x.size();
        Animator[] animatorArr = (Animator[]) this.f28915x.toArray(this.f28916y);
        this.f28916y = M;
        while (i10 < size) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            f.b(animator, Math.min(Math.max(0L, j10), f.a(animator)));
            i10++;
            jX = jX;
        }
        long j12 = jX;
        this.f28916y = animatorArr;
        if ((j10 <= j12 || j11 > j12) && (j10 >= 0 || j11 < 0)) {
            return;
        }
        if (j10 > j12) {
            this.B = true;
        }
        m0(i.b, z10);
    }

    @NonNull
    public a0 x() {
        g gVar = new g();
        this.K = gVar;
        c(gVar);
        return this.K;
    }

    @NonNull
    public q x0(long j10) {
        this.f28894c = j10;
        return this;
    }

    public void y() {
        int i10 = this.f28917z - 1;
        this.f28917z = i10;
        if (i10 == 0) {
            m0(i.b, false);
            for (int i11 = 0; i11 < this.f28907p.f28829c.p(); i11++) {
                View viewQ = this.f28907p.f28829c.q(i11);
                if (viewQ != null) {
                    viewQ.setHasTransientState(false);
                }
            }
            for (int i12 = 0; i12 < this.f28908q.f28829c.p(); i12++) {
                View viewQ2 = this.f28908q.f28829c.q(i12);
                if (viewQ2 != null) {
                    viewQ2.setHasTransientState(false);
                }
            }
            this.B = true;
        }
    }

    public void y0(e eVar) {
        this.G = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void z(ViewGroup viewGroup) {
        w1.a<Animator, d> aVarP = P();
        int size = aVarP.getSize();
        if (viewGroup == null || size == 0) {
            return;
        }
        WindowId windowId = viewGroup.getWindowId();
        w1.a aVar = new w1.a(aVarP);
        aVarP.clear();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            d dVar = (d) aVar.j(i10);
            if (dVar.f28920a != null && windowId.equals(dVar.f28922d)) {
                ((Animator) aVar.f(i10)).end();
            }
        }
    }

    @NonNull
    public q z0(TimeInterpolator timeInterpolator) {
        this.f28895d = timeInterpolator;
        return this;
    }
}
