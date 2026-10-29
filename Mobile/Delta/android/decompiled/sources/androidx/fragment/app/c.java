package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.annotation.NonNull;
import androidx.core.view.m;
import androidx.p000lifecycle.C0693e1;
import androidx.p000lifecycle.a0;
import androidx.p000lifecycle.a1;
import androidx.p000lifecycle.b1;
import androidx.p000lifecycle.c1;
import androidx.p000lifecycle.d0;
import androidx.p000lifecycle.o0;
import androidx.p000lifecycle.p;
import androidx.p000lifecycle.s;
import androidx.p000lifecycle.t0;
import androidx.p000lifecycle.u;
import e4.c0;
import e4.k0;
import e4.q;
import e4.q0;
import e4.r;
import e4.t;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import k4.CreationExtras;

/* JADX INFO: loaded from: classes.dex */
public class c implements ComponentCallbacks, View.OnCreateContextMenuListener, s, c1, androidx.p000lifecycle.j, d5.i, g.b {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final Object f2595e0 = new Object();
    public int A;
    public String B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean I;
    public ViewGroup J;
    public View K;
    public boolean L;
    public j N;
    public Handler O;
    public boolean Q;
    public LayoutInflater R;
    public boolean S;
    public String T;
    public u V;
    public k0 W;
    public a1.c Y;
    public d5.h Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f2597a0;
    public Bundle b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SparseArray<Parcelable> f2599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bundle f2601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f2603e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bundle f2605g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f2606h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2608j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2610l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2611m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f2612n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2613o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f2614p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f2615q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2616r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f2617s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f2618t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f2619u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public FragmentManager f2620v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public t<?> f2621w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public c f2623y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f2624z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2596a = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public String f2604f = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f2607i = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Boolean f2609k = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NonNull
    public FragmentManager f2622x = new c0();
    public boolean H = true;
    public boolean M = true;
    public Runnable P = new b();
    public androidx.lifecycle.l.b U = androidx.lifecycle.l.b.RESUMED;
    public d0<s> X = new d0<>();

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final AtomicInteger f2598b0 = new AtomicInteger();

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final ArrayList<l> f2600c0 = new ArrayList<>();

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final l f2602d0 = new C0041c();

    /* JADX INFO: Add missing generic type declarations: [I] */
    public class a<I> extends g.c<I> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f2625a;
        public final /* synthetic */ h.a b;

        public a(AtomicReference atomicReference, h.a aVar) {
            this.f2625a = atomicReference;
            this.b = aVar;
        }

        @Override // g.c
        @NonNull
        public h.a<I, ?> a() {
            return this.b;
        }

        @Override // g.c
        public void c(I i10, k2.c cVar) {
            g.c cVar2 = (g.c) this.f2625a.get();
            if (cVar2 == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            cVar2.c(i10, cVar);
        }

        @Override // g.c
        public void d() {
            g.c cVar = (g.c) this.f2625a.getAndSet(null);
            if (cVar != null) {
                cVar.d();
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.a2();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.c$c, reason: collision with other inner class name */
    public class C0041c extends l {
        public C0041c() {
            super(null);
        }

        @Override // androidx.fragment.app.c.l
        public void a() {
            c.this.Z.c();
            o0.c(c.this);
            Bundle bundle = c.this.b;
            c.this.Z.d(bundle != null ? bundle.getBundle("registryState") : null);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.j(false);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.i f2630a;

        public e(androidx.fragment.app.i iVar) {
            this.f2630a = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2630a.y()) {
                this.f2630a.n();
            }
        }
    }

    public class f extends r {
        public f() {
        }

        @Override // e4.r
        public View d(int i10) {
            View view = c.this.K;
            if (view != null) {
                return view.findViewById(i10);
            }
            throw new IllegalStateException("Fragment " + c.this + " does not have a view");
        }

        @Override // e4.r
        public boolean e() {
            return c.this.K != null;
        }
    }

    public class g implements p {
        public g() {
        }

        @Override // androidx.p000lifecycle.p
        public void g(@NonNull s sVar, @NonNull androidx.lifecycle.l.a aVar) {
            View view;
            if (aVar != androidx.lifecycle.l.a.ON_STOP || (view = c.this.K) == null) {
                return;
            }
            view.cancelPendingInputEvents();
        }
    }

    public class h implements t.a<Void, g.f> {
        public h() {
        }

        @Override // t.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g.f apply(Void r8) {
            c cVar = c.this;
            Object obj = cVar.f2621w;
            return obj instanceof g.g ? ((g.g) obj).getActivityResultRegistry() : cVar.H1().getActivityResultRegistry();
        }
    }

    public class i extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t.a f2634a;
        public final /* synthetic */ AtomicReference b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h.a f2635c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g.a f2636d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(t.a aVar, AtomicReference atomicReference, h.a aVar2, g.a aVar3) {
            super(null);
            this.f2634a = aVar;
            this.b = atomicReference;
            this.f2635c = aVar2;
            this.f2636d = aVar3;
        }

        @Override // androidx.fragment.app.c.l
        public void a() {
            String strO = c.this.o();
            this.b.set(((g.f) this.f2634a.apply(null)).n(strO, c.this, this.f2635c, this.f2636d));
        }
    }

    public static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f2638a;
        public boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2639c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2640d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2641e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f2642f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f2643g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ArrayList<String> f2644h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public ArrayList<String> f2645i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f2646j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f2647k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f2648l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f2649m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Object f2650n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Object f2651o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Boolean f2652p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Boolean f2653q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public k2.u f2654r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public k2.u f2655s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public float f2656t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public View f2657u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f2658v;

        public j() {
            Object obj = c.f2595e0;
            this.f2647k = obj;
            this.f2648l = null;
            this.f2649m = obj;
            this.f2650n = null;
            this.f2651o = obj;
            this.f2654r = null;
            this.f2655s = null;
            this.f2656t = 1.0f;
            this.f2657u = null;
        }
    }

    public static class k extends RuntimeException {
        public k(@NonNull String str, Exception exc) {
            super(str, exc);
        }
    }

    public static abstract class l {
        public l() {
        }

        public abstract void a();

        public /* synthetic */ l(b bVar) {
            this();
        }
    }

    public c() {
        m0();
    }

    public static /* synthetic */ void i(c cVar) {
        cVar.W.e(cVar.f2601d);
        cVar.f2601d = null;
    }

    @NonNull
    @Deprecated
    public static c o0(@NonNull Context context, @NonNull String str, Bundle bundle) {
        try {
            c cVarNewInstance = androidx.fragment.app.e.d(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle == null) {
                return cVarNewInstance;
            }
            bundle.setClassLoader(cVarNewInstance.getClass().getClassLoader());
            cVarNewInstance.O1(bundle);
            return cVarNewInstance;
        } catch (IllegalAccessException e10) {
            throw new k("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e10);
        } catch (InstantiationException e11) {
            throw new k("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e11);
        } catch (NoSuchMethodException e12) {
            throw new k("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e12);
        } catch (InvocationTargetException e13) {
            throw new k("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e13);
        }
    }

    @Override // d5.i
    @NonNull
    public final d5.f A() {
        return this.Z.getSavedStateRegistry();
    }

    @Deprecated
    public void A0(int i10, int i11, Intent intent) {
        if (FragmentManager.N0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    public void A1(Bundle bundle) {
        b1(bundle);
    }

    public k2.u B() {
        j jVar = this.N;
        if (jVar == null) {
            return null;
        }
        return jVar.f2654r;
    }

    @Deprecated
    public void B0(@NonNull Activity activity) {
        this.I = true;
    }

    public void B1() {
        this.f2622x.X0();
        this.f2622x.f0(true);
        this.f2596a = 5;
        this.I = false;
        c1();
        if (!this.I) {
            throw new q0("Fragment " + this + " did not call through to super.onStart()");
        }
        u uVar = this.V;
        androidx.lifecycle.l.a aVar = androidx.lifecycle.l.a.ON_START;
        uVar.j(aVar);
        if (this.K != null) {
            this.W.b(aVar);
        }
        this.f2622x.W();
    }

    public int C() {
        j jVar = this.N;
        if (jVar == null) {
            return 0;
        }
        return jVar.f2640d;
    }

    public void C0(@NonNull Context context) {
        this.I = true;
        t<?> tVar = this.f2621w;
        Activity activityF = tVar == null ? null : tVar.getActivity();
        if (activityF != null) {
            this.I = false;
            B0(activityF);
        }
    }

    public void C1() {
        this.f2622x.Y();
        if (this.K != null) {
            this.W.b(androidx.lifecycle.l.a.ON_STOP);
        }
        this.V.j(androidx.lifecycle.l.a.ON_STOP);
        this.f2596a = 4;
        this.I = false;
        d1();
        if (this.I) {
            return;
        }
        throw new q0("Fragment " + this + " did not call through to super.onStop()");
    }

    public Object D() {
        j jVar = this.N;
        if (jVar == null) {
            return null;
        }
        return jVar.f2648l;
    }

    @Deprecated
    public void D0(@NonNull c cVar) {
    }

    public void D1() {
        Bundle bundle = this.b;
        e1(this.K, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.f2622x.Z();
    }

    public k2.u E() {
        j jVar = this.N;
        if (jVar == null) {
            return null;
        }
        return jVar.f2655s;
    }

    public boolean E0(@NonNull MenuItem menuItem) {
        return false;
    }

    public void E1() {
        m().f2658v = true;
    }

    public View F() {
        j jVar = this.N;
        if (jVar == null) {
            return null;
        }
        return jVar.f2657u;
    }

    public void F0(Bundle bundle) {
        this.I = true;
        K1();
        if (this.f2622x.T0(1)) {
            return;
        }
        this.f2622x.G();
    }

    @NonNull
    public final <I, O> g.c<I> F1(@NonNull h.a<I, O> aVar, @NonNull t.a<Void, g.f> aVar2, @NonNull g.a<O> aVar3) {
        if (this.f2596a <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            G1(new i(aVar2, atomicReference, aVar, aVar3));
            return new a(atomicReference, aVar);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    public final Object G() {
        t<?> tVar = this.f2621w;
        if (tVar == null) {
            return null;
        }
        return tVar.l();
    }

    public Animation G0(int i10, boolean z10, int i11) {
        return null;
    }

    public final void G1(@NonNull l lVar) {
        if (this.f2596a >= 0) {
            lVar.a();
        } else {
            this.f2600c0.add(lVar);
        }
    }

    @NonNull
    @Deprecated
    public LayoutInflater H(Bundle bundle) {
        t<?> tVar = this.f2621w;
        if (tVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterM = tVar.m();
        m.a(layoutInflaterM, this.f2622x.B0());
        return layoutInflaterM;
    }

    public Animator H0(int i10, boolean z10, int i11) {
        return null;
    }

    @NonNull
    public final q H1() {
        q qVarP = p();
        if (qVarP != null) {
            return qVarP;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final int I() {
        androidx.lifecycle.l.b bVar = this.U;
        return (bVar == androidx.lifecycle.l.b.INITIALIZED || this.f2623y == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.f2623y.I());
    }

    @Deprecated
    public void I0(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
    }

    @NonNull
    public final Context I1() {
        Context contextX = x();
        if (contextX != null) {
            return contextX;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public int J() {
        j jVar = this.N;
        if (jVar == null) {
            return 0;
        }
        return jVar.f2643g;
    }

    public View J0(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.f2597a0;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    @NonNull
    public final View J1() {
        View viewJ0 = j0();
        if (viewJ0 != null) {
            return viewJ0;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final c K() {
        return this.f2623y;
    }

    public void K0() {
        this.I = true;
    }

    public void K1() {
        Bundle bundle;
        Bundle bundle2 = this.b;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.f2622x.n1(bundle);
        this.f2622x.G();
    }

    @Deprecated
    public void L0() {
    }

    public final void L1() {
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.K != null) {
            Bundle bundle = this.b;
            M1(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.b = null;
    }

    @NonNull
    public final FragmentManager M() {
        FragmentManager fragmentManager = this.f2620v;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public void M0() {
        this.I = true;
    }

    public final void M1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f2599c;
        if (sparseArray != null) {
            this.K.restoreHierarchyState(sparseArray);
            this.f2599c = null;
        }
        this.I = false;
        f1(bundle);
        if (this.I) {
            if (this.K != null) {
                this.W.b(androidx.lifecycle.l.a.ON_CREATE);
            }
        } else {
            throw new q0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public boolean N() {
        j jVar = this.N;
        if (jVar == null) {
            return false;
        }
        return jVar.b;
    }

    public void N0() {
        this.I = true;
    }

    public void N1(int i10, int i11, int i12, int i13) {
        if (this.N == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        m().f2639c = i10;
        m().f2640d = i11;
        m().f2641e = i12;
        m().f2642f = i13;
    }

    public int O() {
        j jVar = this.N;
        if (jVar == null) {
            return 0;
        }
        return jVar.f2641e;
    }

    @NonNull
    public LayoutInflater O0(Bundle bundle) {
        return H(bundle);
    }

    public void O1(Bundle bundle) {
        if (this.f2620v != null && w0()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f2605g = bundle;
    }

    public int P() {
        j jVar = this.N;
        if (jVar == null) {
            return 0;
        }
        return jVar.f2642f;
    }

    public void P0(boolean z10) {
    }

    public void P1(Object obj) {
        m().f2646j = obj;
    }

    @Deprecated
    public void Q0(@NonNull Activity activity, @NonNull AttributeSet attributeSet, Bundle bundle) {
        this.I = true;
    }

    public void Q1(Object obj) {
        m().f2648l = obj;
    }

    public float R() {
        j jVar = this.N;
        if (jVar == null) {
            return 1.0f;
        }
        return jVar.f2656t;
    }

    public void R0(@NonNull Context context, @NonNull AttributeSet attributeSet, Bundle bundle) {
        this.I = true;
        t<?> tVar = this.f2621w;
        Activity activityF = tVar == null ? null : tVar.getActivity();
        if (activityF != null) {
            this.I = false;
            Q0(activityF, attributeSet, bundle);
        }
    }

    public void R1(View view) {
        m().f2657u = view;
    }

    public Object S() {
        j jVar = this.N;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f2649m;
        return obj == f2595e0 ? D() : obj;
    }

    public void S0(boolean z10) {
    }

    public void S1(int i10) {
        if (this.N == null && i10 == 0) {
            return;
        }
        m();
        this.N.f2643g = i10;
    }

    @NonNull
    public final Resources T() {
        return I1().getResources();
    }

    @Deprecated
    public boolean T0(@NonNull MenuItem menuItem) {
        return false;
    }

    public void T1(boolean z10) {
        if (this.N == null) {
            return;
        }
        m().b = z10;
    }

    @Deprecated
    public void U0(@NonNull Menu menu) {
    }

    public void U1(float f10) {
        m().f2656t = f10;
    }

    @Deprecated
    public final boolean V() {
        f4.c.h(this);
        return this.E;
    }

    public void V0() {
        this.I = true;
    }

    @Deprecated
    public void V1(boolean z10) {
        f4.c.j(this);
        this.E = z10;
        FragmentManager fragmentManager = this.f2620v;
        if (fragmentManager == null) {
            this.F = true;
        } else if (z10) {
            fragmentManager.n(this);
        } else {
            fragmentManager.l1(this);
        }
    }

    public void W0(boolean z10) {
    }

    public void W1(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        m();
        j jVar = this.N;
        jVar.f2644h = arrayList;
        jVar.f2645i = arrayList2;
    }

    @Override // androidx.p000lifecycle.j
    @NonNull
    public a1.c X() {
        Application application;
        if (this.f2620v == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.Y == null) {
            Context applicationContext = I1().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && FragmentManager.N0(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + I1().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.Y = new t0(application, this, t());
        }
        return this.Y;
    }

    @Deprecated
    public void X0(@NonNull Menu menu) {
    }

    public void X1(@NonNull Intent intent) {
        Y1(intent, null);
    }

    public Object Y() {
        j jVar = this.N;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f2647k;
        return obj == f2595e0 ? z() : obj;
    }

    public void Y0(boolean z10) {
    }

    public void Y1(@NonNull Intent intent, Bundle bundle) {
        t<?> tVar = this.f2621w;
        if (tVar != null) {
            tVar.n(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Override // androidx.p000lifecycle.j
    @NonNull
    public CreationExtras Z() {
        Application application;
        Context applicationContext = I1().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && FragmentManager.N0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + I1().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        k4.b bVar = new k4.b();
        if (application != null) {
            bVar.c(a1.a.f2752h, application);
        }
        bVar.c(o0.f2834a, this);
        bVar.c(o0.b, this);
        if (t() != null) {
            bVar.c(o0.f2835c, t());
        }
        return bVar;
    }

    @Deprecated
    public void Z0(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
    }

    @Deprecated
    public void Z1(@NonNull Intent intent, int i10, Bundle bundle) {
        if (this.f2621w != null) {
            M().V0(this, intent, i10, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Override // androidx.p000lifecycle.s
    @NonNull
    public androidx.p000lifecycle.l a() {
        return this.V;
    }

    public Object a0() {
        j jVar = this.N;
        if (jVar == null) {
            return null;
        }
        return jVar.f2650n;
    }

    public void a1() {
        this.I = true;
    }

    public void a2() {
        if (this.N == null || !m().f2658v) {
            return;
        }
        if (this.f2621w == null) {
            m().f2658v = false;
        } else if (Looper.myLooper() != this.f2621w.getHandler().getLooper()) {
            this.f2621w.getHandler().postAtFrontOfQueue(new d());
        } else {
            j(true);
        }
    }

    public Object b0() {
        j jVar = this.N;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f2651o;
        return obj == f2595e0 ? a0() : obj;
    }

    public void b1(@NonNull Bundle bundle) {
    }

    @NonNull
    public ArrayList<String> c0() {
        ArrayList<String> arrayList;
        j jVar = this.N;
        return (jVar == null || (arrayList = jVar.f2644h) == null) ? new ArrayList<>() : arrayList;
    }

    public void c1() {
        this.I = true;
    }

    @NonNull
    public ArrayList<String> d0() {
        ArrayList<String> arrayList;
        j jVar = this.N;
        return (jVar == null || (arrayList = jVar.f2645i) == null) ? new ArrayList<>() : arrayList;
    }

    public void d1() {
        this.I = true;
    }

    @NonNull
    public final String e0(int i10) {
        return T().getString(i10);
    }

    public void e1(@NonNull View view, Bundle bundle) {
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void f1(Bundle bundle) {
        this.I = true;
    }

    @NonNull
    public final String g0(int i10, Object... objArr) {
        return T().getString(i10, objArr);
    }

    public void g1(Bundle bundle) {
        this.f2622x.X0();
        this.f2596a = 3;
        this.I = false;
        z0(bundle);
        if (this.I) {
            L1();
            this.f2622x.C();
        } else {
            throw new q0("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    @Override // g.b
    @NonNull
    public final <I, O> g.c<I> h(@NonNull h.a<I, O> aVar, @NonNull g.a<O> aVar2) {
        return F1(aVar, new h(), aVar2);
    }

    public final String h0() {
        return this.B;
    }

    public void h1() {
        ArrayList<l> arrayList = this.f2600c0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            l lVar = arrayList.get(i10);
            i10++;
            lVar.a();
        }
        this.f2600c0.clear();
        this.f2622x.p(this.f2621w, k(), this);
        this.f2596a = 0;
        this.I = false;
        C0(this.f2621w.getContext());
        if (this.I) {
            this.f2620v.M(this);
            this.f2622x.D();
        } else {
            throw new q0("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final c i0(boolean z10) {
        String str;
        if (z10) {
            f4.c.i(this);
        }
        c cVar = this.f2606h;
        if (cVar != null) {
            return cVar;
        }
        FragmentManager fragmentManager = this.f2620v;
        if (fragmentManager == null || (str = this.f2607i) == null) {
            return null;
        }
        return fragmentManager.k0(str);
    }

    public void i1(@NonNull Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public void j(boolean z10) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        j jVar = this.N;
        if (jVar != null) {
            jVar.f2658v = false;
        }
        if (this.K == null || (viewGroup = this.J) == null || (fragmentManager = this.f2620v) == null) {
            return;
        }
        androidx.fragment.app.i iVarU = androidx.fragment.app.i.u(viewGroup, fragmentManager);
        iVarU.z();
        if (z10) {
            this.f2621w.getHandler().post(new e(iVarU));
        } else {
            iVarU.n();
        }
        Handler handler = this.O;
        if (handler != null) {
            handler.removeCallbacks(this.P);
            this.O = null;
        }
    }

    public View j0() {
        return this.K;
    }

    public boolean j1(@NonNull MenuItem menuItem) {
        if (this.C) {
            return false;
        }
        if (E0(menuItem)) {
            return true;
        }
        return this.f2622x.F(menuItem);
    }

    @NonNull
    public r k() {
        return new f();
    }

    @NonNull
    public s k0() {
        k0 k0Var = this.W;
        if (k0Var != null) {
            return k0Var;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner for " + this + " when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public void k1(Bundle bundle) {
        this.f2622x.X0();
        this.f2596a = 1;
        this.I = false;
        this.V.a(new g());
        F0(bundle);
        this.S = true;
        if (this.I) {
            this.V.j(androidx.lifecycle.l.a.ON_CREATE);
            return;
        }
        throw new q0("Fragment " + this + " did not call through to super.onCreate()");
    }

    public void l(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f2624z));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.A));
        printWriter.print(" mTag=");
        printWriter.println(this.B);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f2596a);
        printWriter.print(" mWho=");
        printWriter.print(this.f2604f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f2619u);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f2610l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f2611m);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f2614p);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f2615q);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.C);
        printWriter.print(" mDetached=");
        printWriter.print(this.D);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.H);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.G);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.E);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.M);
        if (this.f2620v != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f2620v);
        }
        if (this.f2621w != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f2621w);
        }
        if (this.f2623y != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f2623y);
        }
        if (this.f2605g != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f2605g);
        }
        if (this.b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.b);
        }
        if (this.f2599c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f2599c);
        }
        if (this.f2601d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f2601d);
        }
        c cVarI0 = i0(false);
        if (cVarI0 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(cVarI0);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f2608j);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(N());
        if (y() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(y());
        }
        if (C() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(C());
        }
        if (O() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(O());
        }
        if (P() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(P());
        }
        if (this.J != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.J);
        }
        if (this.K != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.K);
        }
        if (s() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(s());
        }
        if (x() != null) {
            m4.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f2622x + ":");
        this.f2622x.b0(str + "  ", fileDescriptor, printWriter, strArr);
    }

    @NonNull
    public a0<s> l0() {
        return this.X;
    }

    public boolean l1(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        boolean z10 = false;
        if (this.C) {
            return false;
        }
        if (this.G && this.H) {
            I0(menu, menuInflater);
            z10 = true;
        }
        return this.f2622x.H(menu, menuInflater) | z10;
    }

    public final j m() {
        if (this.N == null) {
            this.N = new j();
        }
        return this.N;
    }

    public final void m0() {
        this.V = new u(this);
        this.Z = d5.h.a(this);
        this.Y = null;
        if (this.f2600c0.contains(this.f2602d0)) {
            return;
        }
        G1(this.f2602d0);
    }

    public void m1(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f2622x.X0();
        this.f2618t = true;
        this.W = new k0(this, w(), new Runnable() { // from class: e4.l
            @Override // java.lang.Runnable
            public final void run() {
                androidx.fragment.app.c.i(this.f15144a);
            }
        });
        View viewJ0 = J0(layoutInflater, viewGroup, bundle);
        this.K = viewJ0;
        if (viewJ0 == null) {
            if (this.W.d()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.W = null;
            return;
        }
        this.W.c();
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.K + " for Fragment " + this);
        }
        androidx.p000lifecycle.View.b(this.K, this.W);
        C0693e1.a(this.K, this.W);
        d5.m.b(this.K, this.W);
        this.X.o(this.W);
    }

    public c n(@NonNull String str) {
        return str.equals(this.f2604f) ? this : this.f2622x.o0(str);
    }

    public void n0() {
        m0();
        this.T = this.f2604f;
        this.f2604f = UUID.randomUUID().toString();
        this.f2610l = false;
        this.f2611m = false;
        this.f2614p = false;
        this.f2615q = false;
        this.f2617s = false;
        this.f2619u = 0;
        this.f2620v = null;
        this.f2622x = new c0();
        this.f2621w = null;
        this.f2624z = 0;
        this.A = 0;
        this.B = null;
        this.C = false;
        this.D = false;
    }

    public void n1() {
        this.f2622x.I();
        this.V.j(androidx.lifecycle.l.a.ON_DESTROY);
        this.f2596a = 0;
        this.I = false;
        this.S = false;
        K0();
        if (this.I) {
            return;
        }
        throw new q0("Fragment " + this + " did not call through to super.onDestroy()");
    }

    @NonNull
    public String o() {
        return "fragment_" + this.f2604f + "_rq#" + this.f2598b0.getAndIncrement();
    }

    public void o1() {
        this.f2622x.J();
        if (this.K != null && this.W.a().getState().b(androidx.lifecycle.l.b.CREATED)) {
            this.W.b(androidx.lifecycle.l.a.ON_DESTROY);
        }
        this.f2596a = 1;
        this.I = false;
        M0();
        if (this.I) {
            m4.a.b(this).d();
            this.f2618t = false;
        } else {
            throw new q0("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        this.I = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(@NonNull ContextMenu contextMenu, @NonNull View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        H1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.I = true;
    }

    public final q p() {
        t<?> tVar = this.f2621w;
        if (tVar == null) {
            return null;
        }
        return (q) tVar.getActivity();
    }

    public final boolean p0() {
        return this.f2621w != null && this.f2610l;
    }

    public void p1() {
        this.f2596a = -1;
        this.I = false;
        N0();
        this.R = null;
        if (this.I) {
            if (this.f2622x.M0()) {
                return;
            }
            this.f2622x.I();
            this.f2622x = new c0();
            return;
        }
        throw new q0("Fragment " + this + " did not call through to super.onDetach()");
    }

    public boolean q() {
        Boolean bool;
        j jVar = this.N;
        if (jVar == null || (bool = jVar.f2653q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    @NonNull
    public LayoutInflater q1(Bundle bundle) {
        LayoutInflater layoutInflaterO0 = O0(bundle);
        this.R = layoutInflaterO0;
        return layoutInflaterO0;
    }

    public boolean r() {
        Boolean bool;
        j jVar = this.N;
        if (jVar == null || (bool = jVar.f2652p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final boolean r0() {
        if (this.C) {
            return true;
        }
        FragmentManager fragmentManager = this.f2620v;
        return fragmentManager != null && fragmentManager.Q0(this.f2623y);
    }

    public void r1() {
        onLowMemory();
    }

    public View s() {
        j jVar = this.N;
        if (jVar == null) {
            return null;
        }
        return jVar.f2638a;
    }

    public final boolean s0() {
        return this.f2619u > 0;
    }

    public void s1(boolean z10) {
        S0(z10);
    }

    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i10) {
        Z1(intent, i10, null);
    }

    public final Bundle t() {
        return this.f2605g;
    }

    public final boolean t0() {
        if (!this.H) {
            return false;
        }
        FragmentManager fragmentManager = this.f2620v;
        return fragmentManager == null || fragmentManager.R0(this.f2623y);
    }

    public boolean t1(@NonNull MenuItem menuItem) {
        if (this.C) {
            return false;
        }
        if (this.G && this.H && T0(menuItem)) {
            return true;
        }
        return this.f2622x.O(menuItem);
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("}");
        sb2.append(" (");
        sb2.append(this.f2604f);
        if (this.f2624z != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f2624z));
        }
        if (this.B != null) {
            sb2.append(" tag=");
            sb2.append(this.B);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public boolean u0() {
        j jVar = this.N;
        if (jVar == null) {
            return false;
        }
        return jVar.f2658v;
    }

    public void u1(@NonNull Menu menu) {
        if (this.C) {
            return;
        }
        if (this.G && this.H) {
            U0(menu);
        }
        this.f2622x.P(menu);
    }

    @NonNull
    public final FragmentManager v() {
        if (this.f2621w != null) {
            return this.f2622x;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final boolean v0() {
        return this.f2611m;
    }

    public void v1() {
        this.f2622x.R();
        if (this.K != null) {
            this.W.b(androidx.lifecycle.l.a.ON_PAUSE);
        }
        this.V.j(androidx.lifecycle.l.a.ON_PAUSE);
        this.f2596a = 6;
        this.I = false;
        V0();
        if (this.I) {
            return;
        }
        throw new q0("Fragment " + this + " did not call through to super.onPause()");
    }

    @Override // androidx.p000lifecycle.c1
    @NonNull
    public b1 w() {
        if (this.f2620v == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (I() != androidx.lifecycle.l.b.INITIALIZED.ordinal()) {
            return this.f2620v.I0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    public final boolean w0() {
        FragmentManager fragmentManager = this.f2620v;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.U0();
    }

    public void w1(boolean z10) {
        W0(z10);
    }

    public Context x() {
        t<?> tVar = this.f2621w;
        if (tVar == null) {
            return null;
        }
        return tVar.getContext();
    }

    public final boolean x0() {
        View view;
        return (!p0() || r0() || (view = this.K) == null || view.getWindowToken() == null || this.K.getVisibility() != 0) ? false : true;
    }

    public boolean x1(@NonNull Menu menu) {
        boolean z10 = false;
        if (this.C) {
            return false;
        }
        if (this.G && this.H) {
            X0(menu);
            z10 = true;
        }
        return this.f2622x.T(menu) | z10;
    }

    public int y() {
        j jVar = this.N;
        if (jVar == null) {
            return 0;
        }
        return jVar.f2639c;
    }

    public void y0() {
        this.f2622x.X0();
    }

    public void y1() {
        boolean zS0 = this.f2620v.S0(this);
        Boolean bool = this.f2609k;
        if (bool == null || bool.booleanValue() != zS0) {
            this.f2609k = Boolean.valueOf(zS0);
            Y0(zS0);
            this.f2622x.U();
        }
    }

    public Object z() {
        j jVar = this.N;
        if (jVar == null) {
            return null;
        }
        return jVar.f2646j;
    }

    @Deprecated
    public void z0(Bundle bundle) {
        this.I = true;
    }

    public void z1() {
        this.f2622x.X0();
        this.f2622x.f0(true);
        this.f2596a = 7;
        this.I = false;
        a1();
        if (!this.I) {
            throw new q0("Fragment " + this + " did not call through to super.onResume()");
        }
        u uVar = this.V;
        androidx.lifecycle.l.a aVar = androidx.lifecycle.l.a.ON_RESUME;
        uVar.j(aVar);
        if (this.K != null) {
            this.W.b(aVar);
        }
        this.f2622x.V();
    }
}
