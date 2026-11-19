package f4;

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
import androidx.p000lifecycle.C0795e1;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import l4.CreationExtras;

/* JADX INFO: loaded from: classes.dex */
public class q implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.p000lifecycle.s, androidx.p000lifecycle.c1, androidx.p000lifecycle.j, e5.i, g.c {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final Object f15469e0 = new Object();
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
    public androidx.p000lifecycle.u V;
    public x0 W;
    public androidx.lifecycle.a1.c Y;
    public e5.h Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f15471a0;
    public Bundle b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SparseArray<Parcelable> f15473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bundle f15475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f15477e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bundle f15479g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q f15480h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f15482j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f15484l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f15485m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f15486n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f15487o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f15488p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f15489q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f15490r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f15491s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f15492t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f15493u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public k0 f15494v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public a0<?> f15495w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public q f15497y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f15498z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15470a = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public String f15478f = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f15481i = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Boolean f15483k = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NonNull
    public k0 f15496x = new l0();
    public boolean H = true;
    public boolean M = true;
    public Runnable P = new b();
    public androidx.lifecycle.l.b U = androidx.lifecycle.l.b.RESUMED;
    public androidx.p000lifecycle.d0<androidx.p000lifecycle.s> X = new androidx.p000lifecycle.d0<>();

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final AtomicInteger f15472b0 = new AtomicInteger();

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final ArrayList<l> f15474c0 = new ArrayList<>();

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final l f15476d0 = new c();

    /* JADX INFO: Add missing generic type declarations: [I] */
    public class a<I> extends g.d<I> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f15499a;
        public final /* synthetic */ h.a b;

        public a(AtomicReference atomicReference, h.a aVar) {
            this.f15499a = atomicReference;
            this.b = aVar;
        }

        @Override // g.d
        @NonNull
        public h.a<I, ?> a() {
            return this.b;
        }

        @Override // g.d
        public void c(I i10, k2.c cVar) {
            g.d dVar = (g.d) this.f15499a.get();
            if (dVar == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            dVar.c(i10, cVar);
        }

        @Override // g.d
        public void d() {
            g.d dVar = (g.d) this.f15499a.getAndSet(null);
            if (dVar != null) {
                dVar.d();
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q.this.a2();
        }
    }

    public class c extends l {
        public c() {
            super(null);
        }

        @Override // f4.q.l
        public void a() {
            q.this.Z.c();
            androidx.p000lifecycle.o0.c(q.this);
            Bundle bundle = q.this.b;
            q.this.Z.d(bundle != null ? bundle.getBundle("registryState") : null);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q.this.j(false);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c1 f15504a;

        public e(c1 c1Var) {
            this.f15504a = c1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f15504a.y()) {
                this.f15504a.n();
            }
        }
    }

    public class f extends x {
        public f() {
        }

        @Override // f4.x
        public View d(int i10) {
            View view = q.this.K;
            if (view != null) {
                return view.findViewById(i10);
            }
            throw new IllegalStateException("Fragment " + q.this + " does not have a view");
        }

        @Override // f4.x
        public boolean e() {
            return q.this.K != null;
        }
    }

    public class g implements androidx.p000lifecycle.p {
        public g() {
        }

        @Override // androidx.p000lifecycle.p
        public void g(@NonNull androidx.p000lifecycle.s sVar, @NonNull androidx.lifecycle.l.a aVar) {
            View view;
            if (aVar != androidx.lifecycle.l.a.ON_STOP || (view = q.this.K) == null) {
                return;
            }
            view.cancelPendingInputEvents();
        }
    }

    public class h implements t.a<Void, g.g> {
        public h() {
        }

        @Override // t.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g.g apply(Void r10) {
            q qVar = q.this;
            Object obj = qVar.f15495w;
            return obj instanceof g.h ? ((g.h) obj).getActivityResultRegistry() : qVar.H1().getActivityResultRegistry();
        }
    }

    public class i extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t.a f15508a;
        public final /* synthetic */ AtomicReference b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h.a f15509c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g.b f15510d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(t.a aVar, AtomicReference atomicReference, h.a aVar2, g.b bVar) {
            super(null);
            this.f15508a = aVar;
            this.b = atomicReference;
            this.f15509c = aVar2;
            this.f15510d = bVar;
        }

        @Override // f4.q.l
        public void a() {
            String strO = q.this.o();
            this.b.set(((g.g) this.f15508a.apply(null)).n(strO, q.this, this.f15509c, this.f15510d));
        }
    }

    public static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f15512a;
        public boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f15513c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f15514d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f15515e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f15516f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f15517g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ArrayList<String> f15518h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public ArrayList<String> f15519i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f15520j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f15521k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f15522l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f15523m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Object f15524n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Object f15525o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Boolean f15526p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Boolean f15527q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public k2.u f15528r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public k2.u f15529s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public float f15530t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public View f15531u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f15532v;

        public j() {
            Object obj = q.f15469e0;
            this.f15521k = obj;
            this.f15522l = null;
            this.f15523m = obj;
            this.f15524n = null;
            this.f15525o = obj;
            this.f15528r = null;
            this.f15529s = null;
            this.f15530t = 1.0f;
            this.f15531u = null;
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

    public q() {
        m0();
    }

    public static /* synthetic */ void i(q qVar) {
        qVar.W.e(qVar.f15475d);
        qVar.f15475d = null;
    }

    @NonNull
    @Deprecated
    public static q o0(@NonNull Context context, @NonNull String str, Bundle bundle) {
        try {
            q qVarNewInstance = z.d(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle == null) {
                return qVarNewInstance;
            }
            bundle.setClassLoader(qVarNewInstance.getClass().getClassLoader());
            qVarNewInstance.O1(bundle);
            return qVarNewInstance;
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

    @Override // e5.i
    @NonNull
    public final e5.f A() {
        return this.Z.getSavedStateRegistry();
    }

    @Deprecated
    public void A0(int i10, int i11, Intent intent) {
        if (k0.N0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    public void A1(Bundle bundle) {
        b1(bundle);
    }

    public int B() {
        j jVar = this.N;
        if (jVar == null) {
            return 0;
        }
        return jVar.f15514d;
    }

    @Deprecated
    public void B0(@NonNull Activity activity) {
        this.I = true;
    }

    public void B1() {
        this.f15496x.X0();
        this.f15496x.f0(true);
        this.f15470a = 5;
        this.I = false;
        c1();
        if (!this.I) {
            throw new e1("Fragment " + this + " did not call through to super.onStart()");
        }
        androidx.p000lifecycle.u uVar = this.V;
        androidx.lifecycle.l.a aVar = androidx.lifecycle.l.a.ON_START;
        uVar.j(aVar);
        if (this.K != null) {
            this.W.b(aVar);
        }
        this.f15496x.W();
    }

    public Object C() {
        j jVar = this.N;
        if (jVar == null) {
            return null;
        }
        return jVar.f15522l;
    }

    public void C0(@NonNull Context context) {
        this.I = true;
        a0<?> a0Var = this.f15495w;
        Activity activityF = a0Var == null ? null : a0Var.getActivity();
        if (activityF != null) {
            this.I = false;
            B0(activityF);
        }
    }

    public void C1() {
        this.f15496x.Y();
        if (this.K != null) {
            this.W.b(androidx.lifecycle.l.a.ON_STOP);
        }
        this.V.j(androidx.lifecycle.l.a.ON_STOP);
        this.f15470a = 4;
        this.I = false;
        d1();
        if (this.I) {
            return;
        }
        throw new e1("Fragment " + this + " did not call through to super.onStop()");
    }

    public k2.u D() {
        j jVar = this.N;
        if (jVar == null) {
            return null;
        }
        return jVar.f15529s;
    }

    @Deprecated
    public void D0(@NonNull q qVar) {
    }

    public void D1() {
        Bundle bundle = this.b;
        e1(this.K, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.f15496x.Z();
    }

    public View E() {
        j jVar = this.N;
        if (jVar == null) {
            return null;
        }
        return jVar.f15531u;
    }

    public boolean E0(@NonNull MenuItem menuItem) {
        return false;
    }

    public void E1() {
        m().f15532v = true;
    }

    public final Object F() {
        a0<?> a0Var = this.f15495w;
        if (a0Var == null) {
            return null;
        }
        return a0Var.l();
    }

    public void F0(Bundle bundle) {
        this.I = true;
        K1();
        if (this.f15496x.T0(1)) {
            return;
        }
        this.f15496x.G();
    }

    @NonNull
    public final <I, O> g.d<I> F1(@NonNull h.a<I, O> aVar, @NonNull t.a<Void, g.g> aVar2, @NonNull g.b<O> bVar) {
        if (this.f15470a <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            G1(new i(aVar2, atomicReference, aVar, bVar));
            return new a(atomicReference, aVar);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    @NonNull
    @Deprecated
    public LayoutInflater G(Bundle bundle) {
        a0<?> a0Var = this.f15495w;
        if (a0Var == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterM = a0Var.m();
        androidx.core.view.m.a(layoutInflaterM, this.f15496x.B0());
        return layoutInflaterM;
    }

    public Animation G0(int i10, boolean z10, int i11) {
        return null;
    }

    public final void G1(@NonNull l lVar) {
        if (this.f15470a >= 0) {
            lVar.a();
        } else {
            this.f15474c0.add(lVar);
        }
    }

    public final int H() {
        androidx.lifecycle.l.b bVar = this.U;
        return (bVar == androidx.lifecycle.l.b.INITIALIZED || this.f15497y == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.f15497y.H());
    }

    public Animator H0(int i10, boolean z10, int i11) {
        return null;
    }

    @NonNull
    public final v H1() {
        v vVarP = p();
        if (vVarP != null) {
            return vVarP;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public int I() {
        j jVar = this.N;
        if (jVar == null) {
            return 0;
        }
        return jVar.f15517g;
    }

    @Deprecated
    public void I0(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
    }

    @NonNull
    public final Context I1() {
        Context contextV = v();
        if (contextV != null) {
            return contextV;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final q J() {
        return this.f15497y;
    }

    public View J0(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.f15471a0;
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

    public void K0() {
        this.I = true;
    }

    public void K1() {
        Bundle bundle;
        Bundle bundle2 = this.b;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.f15496x.n1(bundle);
        this.f15496x.G();
    }

    @NonNull
    public final k0 L() {
        k0 k0Var = this.f15494v;
        if (k0Var != null) {
            return k0Var;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    @Deprecated
    public void L0() {
    }

    public final void L1() {
        if (k0.N0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.K != null) {
            Bundle bundle = this.b;
            M1(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.b = null;
    }

    public boolean M() {
        j jVar = this.N;
        if (jVar == null) {
            return false;
        }
        return jVar.b;
    }

    public void M0() {
        this.I = true;
    }

    public final void M1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f15473c;
        if (sparseArray != null) {
            this.K.restoreHierarchyState(sparseArray);
            this.f15473c = null;
        }
        this.I = false;
        f1(bundle);
        if (this.I) {
            if (this.K != null) {
                this.W.b(androidx.lifecycle.l.a.ON_CREATE);
            }
        } else {
            throw new e1("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public int N() {
        j jVar = this.N;
        if (jVar == null) {
            return 0;
        }
        return jVar.f15515e;
    }

    public void N0() {
        this.I = true;
    }

    public void N1(int i10, int i11, int i12, int i13) {
        if (this.N == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        m().f15513c = i10;
        m().f15514d = i11;
        m().f15515e = i12;
        m().f15516f = i13;
    }

    public int O() {
        j jVar = this.N;
        if (jVar == null) {
            return 0;
        }
        return jVar.f15516f;
    }

    @NonNull
    public LayoutInflater O0(Bundle bundle) {
        return G(bundle);
    }

    public void O1(Bundle bundle) {
        if (this.f15494v != null && w0()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f15479g = bundle;
    }

    public void P0(boolean z10) {
    }

    public void P1(Object obj) {
        m().f15520j = obj;
    }

    public float Q() {
        j jVar = this.N;
        if (jVar == null) {
            return 1.0f;
        }
        return jVar.f15530t;
    }

    @Deprecated
    public void Q0(@NonNull Activity activity, @NonNull AttributeSet attributeSet, Bundle bundle) {
        this.I = true;
    }

    public void Q1(Object obj) {
        m().f15522l = obj;
    }

    public Object R() {
        j jVar = this.N;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f15523m;
        return obj == f15469e0 ? C() : obj;
    }

    public void R0(@NonNull Context context, @NonNull AttributeSet attributeSet, Bundle bundle) {
        this.I = true;
        a0<?> a0Var = this.f15495w;
        Activity activityF = a0Var == null ? null : a0Var.getActivity();
        if (activityF != null) {
            this.I = false;
            Q0(activityF, attributeSet, bundle);
        }
    }

    public void R1(View view) {
        m().f15531u = view;
    }

    @NonNull
    public final Resources S() {
        return I1().getResources();
    }

    public void S0(boolean z10) {
    }

    public void S1(int i10) {
        if (this.N == null && i10 == 0) {
            return;
        }
        m();
        this.N.f15517g = i10;
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
    public final boolean U() {
        g4.c.h(this);
        return this.E;
    }

    @Deprecated
    public void U0(@NonNull Menu menu) {
    }

    public void U1(float f10) {
        m().f15530t = f10;
    }

    public void V0() {
        this.I = true;
    }

    @Deprecated
    public void V1(boolean z10) {
        g4.c.j(this);
        this.E = z10;
        k0 k0Var = this.f15494v;
        if (k0Var == null) {
            this.F = true;
        } else if (z10) {
            k0Var.n(this);
        } else {
            k0Var.l1(this);
        }
    }

    @Override // androidx.p000lifecycle.j
    @NonNull
    public androidx.lifecycle.a1.c W() {
        Application application;
        if (this.f15494v == null) {
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
            if (application == null && k0.N0(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + I1().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.Y = new androidx.p000lifecycle.t0(application, this, t());
        }
        return this.Y;
    }

    public void W0(boolean z10) {
    }

    public void W1(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        m();
        j jVar = this.N;
        jVar.f15518h = arrayList;
        jVar.f15519i = arrayList2;
    }

    public Object X() {
        j jVar = this.N;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f15521k;
        return obj == f15469e0 ? y() : obj;
    }

    @Deprecated
    public void X0(@NonNull Menu menu) {
    }

    public void X1(@NonNull Intent intent) {
        Y1(intent, null);
    }

    @Override // androidx.p000lifecycle.j
    @NonNull
    public CreationExtras Y() {
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
        if (application == null && k0.N0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + I1().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        l4.b bVar = new l4.b();
        if (application != null) {
            bVar.c(androidx.lifecycle.a1.a.f2299h, application);
        }
        bVar.c(androidx.p000lifecycle.o0.f2381a, this);
        bVar.c(androidx.p000lifecycle.o0.b, this);
        if (t() != null) {
            bVar.c(androidx.p000lifecycle.o0.f2382c, t());
        }
        return bVar;
    }

    public void Y0(boolean z10) {
    }

    public void Y1(@NonNull Intent intent, Bundle bundle) {
        a0<?> a0Var = this.f15495w;
        if (a0Var != null) {
            a0Var.n(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public Object Z() {
        j jVar = this.N;
        if (jVar == null) {
            return null;
        }
        return jVar.f15524n;
    }

    @Deprecated
    public void Z0(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
    }

    @Deprecated
    public void Z1(@NonNull Intent intent, int i10, Bundle bundle) {
        if (this.f15495w != null) {
            L().V0(this, intent, i10, bundle);
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
        Object obj = jVar.f15525o;
        return obj == f15469e0 ? Z() : obj;
    }

    public void a1() {
        this.I = true;
    }

    public void a2() {
        if (this.N == null || !m().f15532v) {
            return;
        }
        if (this.f15495w == null) {
            m().f15532v = false;
        } else if (Looper.myLooper() != this.f15495w.getHandler().getLooper()) {
            this.f15495w.getHandler().postAtFrontOfQueue(new d());
        } else {
            j(true);
        }
    }

    @NonNull
    public ArrayList<String> b0() {
        ArrayList<String> arrayList;
        j jVar = this.N;
        return (jVar == null || (arrayList = jVar.f15518h) == null) ? new ArrayList<>() : arrayList;
    }

    public void b1(@NonNull Bundle bundle) {
    }

    @NonNull
    public ArrayList<String> c0() {
        ArrayList<String> arrayList;
        j jVar = this.N;
        return (jVar == null || (arrayList = jVar.f15519i) == null) ? new ArrayList<>() : arrayList;
    }

    public void c1() {
        this.I = true;
    }

    @NonNull
    public final String d0(int i10) {
        return S().getString(i10);
    }

    public void d1() {
        this.I = true;
    }

    public void e1(@NonNull View view, Bundle bundle) {
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    @NonNull
    public final String f0(int i10, Object... objArr) {
        return S().getString(i10, objArr);
    }

    public void f1(Bundle bundle) {
        this.I = true;
    }

    public void g1(Bundle bundle) {
        this.f15496x.X0();
        this.f15470a = 3;
        this.I = false;
        z0(bundle);
        if (this.I) {
            L1();
            this.f15496x.C();
        } else {
            throw new e1("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    @Override // g.c
    @NonNull
    public final <I, O> g.d<I> h(@NonNull h.a<I, O> aVar, @NonNull g.b<O> bVar) {
        return F1(aVar, new h(), bVar);
    }

    public final String h0() {
        return this.B;
    }

    public void h1() {
        ArrayList<l> arrayList = this.f15474c0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            l lVar = arrayList.get(i10);
            i10++;
            lVar.a();
        }
        this.f15474c0.clear();
        this.f15496x.p(this.f15495w, k(), this);
        this.f15470a = 0;
        this.I = false;
        C0(this.f15495w.getContext());
        if (this.I) {
            this.f15494v.M(this);
            this.f15496x.D();
        } else {
            throw new e1("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final q i0(boolean z10) {
        String str;
        if (z10) {
            g4.c.i(this);
        }
        q qVar = this.f15480h;
        if (qVar != null) {
            return qVar;
        }
        k0 k0Var = this.f15494v;
        if (k0Var == null || (str = this.f15481i) == null) {
            return null;
        }
        return k0Var.k0(str);
    }

    public void i1(@NonNull Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public void j(boolean z10) {
        ViewGroup viewGroup;
        k0 k0Var;
        j jVar = this.N;
        if (jVar != null) {
            jVar.f15532v = false;
        }
        if (this.K == null || (viewGroup = this.J) == null || (k0Var = this.f15494v) == null) {
            return;
        }
        c1 c1VarU = c1.u(viewGroup, k0Var);
        c1VarU.z();
        if (z10) {
            this.f15495w.getHandler().post(new e(c1VarU));
        } else {
            c1VarU.n();
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
        return this.f15496x.F(menuItem);
    }

    @NonNull
    public x k() {
        return new f();
    }

    @NonNull
    public androidx.p000lifecycle.s k0() {
        x0 x0Var = this.W;
        if (x0Var != null) {
            return x0Var;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner for " + this + " when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public void k1(Bundle bundle) {
        this.f15496x.X0();
        this.f15470a = 1;
        this.I = false;
        this.V.a(new g());
        F0(bundle);
        this.S = true;
        if (this.I) {
            this.V.j(androidx.lifecycle.l.a.ON_CREATE);
            return;
        }
        throw new e1("Fragment " + this + " did not call through to super.onCreate()");
    }

    public void l(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f15498z));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.A));
        printWriter.print(" mTag=");
        printWriter.println(this.B);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f15470a);
        printWriter.print(" mWho=");
        printWriter.print(this.f15478f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f15493u);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f15484l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f15485m);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f15488p);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f15489q);
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
        if (this.f15494v != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f15494v);
        }
        if (this.f15495w != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f15495w);
        }
        if (this.f15497y != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f15497y);
        }
        if (this.f15479g != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f15479g);
        }
        if (this.b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.b);
        }
        if (this.f15473c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f15473c);
        }
        if (this.f15475d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f15475d);
        }
        q qVarI0 = i0(false);
        if (qVarI0 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(qVarI0);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f15482j);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(M());
        if (x() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(x());
        }
        if (B() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(B());
        }
        if (N() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(N());
        }
        if (O() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(O());
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
        if (v() != null) {
            n4.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f15496x + ":");
        this.f15496x.b0(str + "  ", fileDescriptor, printWriter, strArr);
    }

    @NonNull
    public androidx.p000lifecycle.a0<androidx.p000lifecycle.s> l0() {
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
        return this.f15496x.H(menu, menuInflater) | z10;
    }

    public final j m() {
        if (this.N == null) {
            this.N = new j();
        }
        return this.N;
    }

    public final void m0() {
        this.V = new androidx.p000lifecycle.u(this);
        this.Z = e5.h.a(this);
        this.Y = null;
        if (this.f15474c0.contains(this.f15476d0)) {
            return;
        }
        G1(this.f15476d0);
    }

    public void m1(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f15496x.X0();
        this.f15492t = true;
        this.W = new x0(this, w(), new Runnable() { // from class: f4.p
            @Override // java.lang.Runnable
            public final void run() {
                q.i(this.f15468a);
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
        if (k0.N0(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.K + " for Fragment " + this);
        }
        androidx.p000lifecycle.View.b(this.K, this.W);
        C0795e1.a(this.K, this.W);
        e5.m.b(this.K, this.W);
        this.X.o(this.W);
    }

    public q n(@NonNull String str) {
        return str.equals(this.f15478f) ? this : this.f15496x.o0(str);
    }

    public void n0() {
        m0();
        this.T = this.f15478f;
        this.f15478f = UUID.randomUUID().toString();
        this.f15484l = false;
        this.f15485m = false;
        this.f15488p = false;
        this.f15489q = false;
        this.f15491s = false;
        this.f15493u = 0;
        this.f15494v = null;
        this.f15496x = new l0();
        this.f15495w = null;
        this.f15498z = 0;
        this.A = 0;
        this.B = null;
        this.C = false;
        this.D = false;
    }

    public void n1() {
        this.f15496x.I();
        this.V.j(androidx.lifecycle.l.a.ON_DESTROY);
        this.f15470a = 0;
        this.I = false;
        this.S = false;
        K0();
        if (this.I) {
            return;
        }
        throw new e1("Fragment " + this + " did not call through to super.onDestroy()");
    }

    @NonNull
    public String o() {
        return "fragment_" + this.f15478f + "_rq#" + this.f15472b0.getAndIncrement();
    }

    public void o1() {
        this.f15496x.J();
        if (this.K != null && this.W.a().getState().b(androidx.lifecycle.l.b.CREATED)) {
            this.W.b(androidx.lifecycle.l.a.ON_DESTROY);
        }
        this.f15470a = 1;
        this.I = false;
        M0();
        if (this.I) {
            n4.a.b(this).d();
            this.f15492t = false;
        } else {
            throw new e1("Fragment " + this + " did not call through to super.onDestroyView()");
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

    public final v p() {
        a0<?> a0Var = this.f15495w;
        if (a0Var == null) {
            return null;
        }
        return (v) a0Var.getActivity();
    }

    public final boolean p0() {
        return this.f15495w != null && this.f15484l;
    }

    public void p1() {
        this.f15470a = -1;
        this.I = false;
        N0();
        this.R = null;
        if (this.I) {
            if (this.f15496x.M0()) {
                return;
            }
            this.f15496x.I();
            this.f15496x = new l0();
            return;
        }
        throw new e1("Fragment " + this + " did not call through to super.onDetach()");
    }

    public boolean q() {
        Boolean bool;
        j jVar = this.N;
        if (jVar == null || (bool = jVar.f15527q) == null) {
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
        if (jVar == null || (bool = jVar.f15526p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final boolean r0() {
        if (this.C) {
            return true;
        }
        k0 k0Var = this.f15494v;
        return k0Var != null && k0Var.Q0(this.f15497y);
    }

    public void r1() {
        onLowMemory();
    }

    public View s() {
        j jVar = this.N;
        if (jVar == null) {
            return null;
        }
        return jVar.f15512a;
    }

    public final boolean s0() {
        return this.f15493u > 0;
    }

    public void s1(boolean z10) {
        S0(z10);
    }

    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i10) {
        Z1(intent, i10, null);
    }

    public final Bundle t() {
        return this.f15479g;
    }

    public final boolean t0() {
        if (!this.H) {
            return false;
        }
        k0 k0Var = this.f15494v;
        return k0Var == null || k0Var.R0(this.f15497y);
    }

    public boolean t1(@NonNull MenuItem menuItem) {
        if (this.C) {
            return false;
        }
        if (this.G && this.H && T0(menuItem)) {
            return true;
        }
        return this.f15496x.O(menuItem);
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(Barcode.FORMAT_ITF);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("}");
        sb2.append(" (");
        sb2.append(this.f15478f);
        if (this.f15498z != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f15498z));
        }
        if (this.B != null) {
            sb2.append(" tag=");
            sb2.append(this.B);
        }
        sb2.append(")");
        return sb2.toString();
    }

    @NonNull
    public final k0 u() {
        if (this.f15495w != null) {
            return this.f15496x;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public boolean u0() {
        j jVar = this.N;
        if (jVar == null) {
            return false;
        }
        return jVar.f15532v;
    }

    public void u1(@NonNull Menu menu) {
        if (this.C) {
            return;
        }
        if (this.G && this.H) {
            U0(menu);
        }
        this.f15496x.P(menu);
    }

    public Context v() {
        a0<?> a0Var = this.f15495w;
        if (a0Var == null) {
            return null;
        }
        return a0Var.getContext();
    }

    public final boolean v0() {
        return this.f15485m;
    }

    public void v1() {
        this.f15496x.R();
        if (this.K != null) {
            this.W.b(androidx.lifecycle.l.a.ON_PAUSE);
        }
        this.V.j(androidx.lifecycle.l.a.ON_PAUSE);
        this.f15470a = 6;
        this.I = false;
        V0();
        if (this.I) {
            return;
        }
        throw new e1("Fragment " + this + " did not call through to super.onPause()");
    }

    @Override // androidx.p000lifecycle.c1
    @NonNull
    public androidx.p000lifecycle.b1 w() {
        if (this.f15494v == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (H() != androidx.lifecycle.l.b.INITIALIZED.ordinal()) {
            return this.f15494v.I0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    public final boolean w0() {
        k0 k0Var = this.f15494v;
        if (k0Var == null) {
            return false;
        }
        return k0Var.U0();
    }

    public void w1(boolean z10) {
        W0(z10);
    }

    public int x() {
        j jVar = this.N;
        if (jVar == null) {
            return 0;
        }
        return jVar.f15513c;
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
        return this.f15496x.T(menu) | z10;
    }

    public Object y() {
        j jVar = this.N;
        if (jVar == null) {
            return null;
        }
        return jVar.f15520j;
    }

    public void y0() {
        this.f15496x.X0();
    }

    public void y1() {
        boolean zS0 = this.f15494v.S0(this);
        Boolean bool = this.f15483k;
        if (bool == null || bool.booleanValue() != zS0) {
            this.f15483k = Boolean.valueOf(zS0);
            Y0(zS0);
            this.f15496x.U();
        }
    }

    public k2.u z() {
        j jVar = this.N;
        if (jVar == null) {
            return null;
        }
        return jVar.f15528r;
    }

    @Deprecated
    public void z0(Bundle bundle) {
        this.I = true;
    }

    public void z1() {
        this.f15496x.X0();
        this.f15496x.f0(true);
        this.f15470a = 7;
        this.I = false;
        a1();
        if (!this.I) {
            throw new e1("Fragment " + this + " did not call through to super.onResume()");
        }
        androidx.p000lifecycle.u uVar = this.V;
        androidx.lifecycle.l.a aVar = androidx.lifecycle.l.a.ON_RESUME;
        uVar.j(aVar);
        if (this.K != null) {
            this.W.b(aVar);
        }
        this.f15496x.V();
    }
}
