package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.core.view.o0;
import androidx.p000lifecycle.c1;
import androidx.p000lifecycle.l;
import e4.g0;
import e4.t;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f2512a;
    public final g0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final c f2513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2514d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2515e = -1;

    public class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f2516a;

        public a(View view) {
            this.f2516a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f2516a.removeOnAttachStateChangeListener(this);
            o0.j0(this.f2516a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2517a;

        static {
            int[] iArr = new int[l.b.values().length];
            f2517a = iArr;
            try {
                iArr[l.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2517a[l.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2517a[l.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2517a[l.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public g(@NonNull f fVar, @NonNull g0 g0Var, @NonNull c cVar) {
        this.f2512a = fVar;
        this.b = g0Var;
        this.f2513c = cVar;
    }

    public void a() {
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f2513c);
        }
        Bundle bundle = this.f2513c.b;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        this.f2513c.g1(bundle2);
        this.f2512a.a(this.f2513c, bundle2, false);
    }

    public void b() {
        c cVarQ0 = FragmentManager.q0(this.f2513c.J);
        c cVarJ = this.f2513c.J();
        if (cVarQ0 != null && !cVarQ0.equals(cVarJ)) {
            c cVar = this.f2513c;
            f4.c.l(cVar, cVarQ0, cVar.A);
        }
        int iJ = this.b.j(this.f2513c);
        c cVar2 = this.f2513c;
        cVar2.J.addView(cVar2.K, iJ);
    }

    public void c() {
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f2513c);
        }
        c cVar = this.f2513c;
        c cVar2 = cVar.f2451h;
        g gVarN = null;
        if (cVar2 != null) {
            g gVarN2 = this.b.n(cVar2.f2449f);
            if (gVarN2 == null) {
                throw new IllegalStateException("Fragment " + this.f2513c + " declared target fragment " + this.f2513c.f2451h + " that does not belong to this FragmentManager!");
            }
            c cVar3 = this.f2513c;
            cVar3.f2452i = cVar3.f2451h.f2449f;
            cVar3.f2451h = null;
            gVarN = gVarN2;
        } else {
            String str = cVar.f2452i;
            if (str != null && (gVarN = this.b.n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f2513c + " declared target fragment " + this.f2513c.f2452i + " that does not belong to this FragmentManager!");
            }
        }
        if (gVarN != null) {
            gVarN.m();
        }
        c cVar4 = this.f2513c;
        cVar4.f2466w = cVar4.f2465v.A0();
        c cVar5 = this.f2513c;
        cVar5.f2468y = cVar5.f2465v.D0();
        this.f2512a.g(this.f2513c, false);
        this.f2513c.h1();
        this.f2512a.b(this.f2513c, false);
    }

    public int d() {
        c cVar = this.f2513c;
        if (cVar.f2465v == null) {
            return cVar.f2441a;
        }
        int iMin = this.f2515e;
        int i10 = b.f2517a[cVar.U.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                iMin = Math.min(iMin, 5);
            } else if (i10 != 3) {
                iMin = i10 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0);
            } else {
                iMin = Math.min(iMin, 1);
            }
        }
        c cVar2 = this.f2513c;
        if (cVar2.f2459p) {
            if (cVar2.f2460q) {
                iMin = Math.max(this.f2515e, 2);
                View view = this.f2513c.K;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f2515e < 4 ? Math.min(iMin, cVar2.f2441a) : Math.min(iMin, 1);
            }
        }
        c cVar3 = this.f2513c;
        if (cVar3.f2461r && cVar3.J == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!this.f2513c.f2455l) {
            iMin = Math.min(iMin, 1);
        }
        c cVar4 = this.f2513c;
        ViewGroup viewGroup = cVar4.J;
        i.d.a aVarS = viewGroup != null ? i.u(viewGroup, cVar4.L()).s(this) : null;
        if (aVarS == i.d.a.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (aVarS == i.d.a.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            c cVar5 = this.f2513c;
            if (cVar5.f2456m) {
                iMin = cVar5.s0() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        c cVar6 = this.f2513c;
        if (cVar6.L && cVar6.f2441a < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (this.f2513c.f2457n) {
            iMin = Math.max(iMin, 3);
        }
        if (FragmentManager.N0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + this.f2513c);
        }
        return iMin;
    }

    public void e() {
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f2513c);
        }
        Bundle bundle = this.f2513c.b;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        c cVar = this.f2513c;
        if (cVar.S) {
            cVar.f2441a = 1;
            cVar.K1();
        } else {
            this.f2512a.h(cVar, bundle2, false);
            this.f2513c.k1(bundle2);
            this.f2512a.c(this.f2513c, bundle2, false);
        }
    }

    public void f() {
        String resourceName;
        if (this.f2513c.f2459p) {
            return;
        }
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f2513c);
        }
        Bundle bundle = this.f2513c.b;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterQ1 = this.f2513c.q1(bundle2);
        c cVar = this.f2513c;
        ViewGroup viewGroup2 = cVar.J;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i10 = cVar.A;
            if (i10 != 0) {
                if (i10 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f2513c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) cVar.f2465v.w0().d(this.f2513c.A);
                if (viewGroup == null) {
                    c cVar2 = this.f2513c;
                    if (!cVar2.f2462s && !cVar2.f2461r) {
                        try {
                            resourceName = cVar2.S().getResourceName(this.f2513c.A);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f2513c.A) + " (" + resourceName + ") for fragment " + this.f2513c);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    f4.c.k(this.f2513c, viewGroup);
                }
            }
        }
        c cVar3 = this.f2513c;
        cVar3.J = viewGroup;
        cVar3.m1(layoutInflaterQ1, viewGroup, bundle2);
        if (this.f2513c.K != null) {
            if (FragmentManager.N0(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + this.f2513c);
            }
            this.f2513c.K.setSaveFromParentEnabled(false);
            c cVar4 = this.f2513c;
            cVar4.K.setTag(d4.b.f14408a, cVar4);
            if (viewGroup != null) {
                b();
            }
            c cVar5 = this.f2513c;
            if (cVar5.C) {
                cVar5.K.setVisibility(8);
            }
            if (this.f2513c.K.isAttachedToWindow()) {
                o0.j0(this.f2513c.K);
            } else {
                View view = this.f2513c.K;
                view.addOnAttachStateChangeListener(new a(view));
            }
            this.f2513c.D1();
            f fVar = this.f2512a;
            c cVar6 = this.f2513c;
            fVar.m(cVar6, cVar6.K, bundle2, false);
            int visibility = this.f2513c.K.getVisibility();
            this.f2513c.U1(this.f2513c.K.getAlpha());
            c cVar7 = this.f2513c;
            if (cVar7.J != null && visibility == 0) {
                View viewFindFocus = cVar7.K.findFocus();
                if (viewFindFocus != null) {
                    this.f2513c.R1(viewFindFocus);
                    if (FragmentManager.N0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + this.f2513c);
                    }
                }
                this.f2513c.K.setAlpha(0.0f);
            }
        }
        this.f2513c.f2441a = 2;
    }

    public void g() {
        c cVarF;
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f2513c);
        }
        c cVar = this.f2513c;
        boolean zIsChangingConfigurations = true;
        boolean z10 = cVar.f2456m && !cVar.s0();
        if (z10) {
            c cVar2 = this.f2513c;
            if (!cVar2.f2458o) {
                this.b.B(cVar2.f2449f, null);
            }
        }
        if (!z10 && !this.b.p().q(this.f2513c)) {
            String str = this.f2513c.f2452i;
            if (str != null && (cVarF = this.b.f(str)) != null && cVarF.E) {
                this.f2513c.f2451h = cVarF;
            }
            this.f2513c.f2441a = 0;
            return;
        }
        t<?> tVar = this.f2513c.f2466w;
        if (tVar instanceof c1) {
            zIsChangingConfigurations = this.b.p().n();
        } else if (tVar.getContext() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) tVar.getContext()).isChangingConfigurations();
        }
        if ((z10 && !this.f2513c.f2458o) || zIsChangingConfigurations) {
            this.b.p().f(this.f2513c, false);
        }
        this.f2513c.n1();
        this.f2512a.d(this.f2513c, false);
        for (g gVar : this.b.k()) {
            if (gVar != null) {
                c cVarK = gVar.k();
                if (this.f2513c.f2449f.equals(cVarK.f2452i)) {
                    cVarK.f2451h = this.f2513c;
                    cVarK.f2452i = null;
                }
            }
        }
        c cVar3 = this.f2513c;
        String str2 = cVar3.f2452i;
        if (str2 != null) {
            cVar3.f2451h = this.b.f(str2);
        }
        this.b.s(this);
    }

    public void h() {
        View view;
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f2513c);
        }
        c cVar = this.f2513c;
        ViewGroup viewGroup = cVar.J;
        if (viewGroup != null && (view = cVar.K) != null) {
            viewGroup.removeView(view);
        }
        this.f2513c.o1();
        this.f2512a.n(this.f2513c, false);
        c cVar2 = this.f2513c;
        cVar2.J = null;
        cVar2.K = null;
        cVar2.W = null;
        cVar2.X.o(null);
        this.f2513c.f2460q = false;
    }

    public void i() {
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f2513c);
        }
        this.f2513c.p1();
        this.f2512a.e(this.f2513c, false);
        c cVar = this.f2513c;
        cVar.f2441a = -1;
        cVar.f2466w = null;
        cVar.f2468y = null;
        cVar.f2465v = null;
        if ((!cVar.f2456m || cVar.s0()) && !this.b.p().q(this.f2513c)) {
            return;
        }
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + this.f2513c);
        }
        this.f2513c.n0();
    }

    public void j() {
        c cVar = this.f2513c;
        if (cVar.f2459p && cVar.f2460q && !cVar.f2463t) {
            if (FragmentManager.N0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f2513c);
            }
            Bundle bundle = this.f2513c.b;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            c cVar2 = this.f2513c;
            cVar2.m1(cVar2.q1(bundle2), null, bundle2);
            View view = this.f2513c.K;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                c cVar3 = this.f2513c;
                cVar3.K.setTag(d4.b.f14408a, cVar3);
                c cVar4 = this.f2513c;
                if (cVar4.C) {
                    cVar4.K.setVisibility(8);
                }
                this.f2513c.D1();
                f fVar = this.f2512a;
                c cVar5 = this.f2513c;
                fVar.m(cVar5, cVar5.K, bundle2, false);
                this.f2513c.f2441a = 2;
            }
        }
    }

    @NonNull
    public c k() {
        return this.f2513c;
    }

    public final boolean l(@NonNull View view) {
        if (view == this.f2513c.K) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f2513c.K) {
                return true;
            }
        }
        return false;
    }

    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f2514d) {
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.f2514d = true;
            boolean z10 = false;
            while (true) {
                int iD = d();
                c cVar = this.f2513c;
                int i10 = cVar.f2441a;
                if (iD == i10) {
                    if (!z10 && i10 == -1 && cVar.f2456m && !cVar.s0() && !this.f2513c.f2458o) {
                        if (FragmentManager.N0(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f2513c);
                        }
                        this.b.p().f(this.f2513c, true);
                        this.b.s(this);
                        if (FragmentManager.N0(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f2513c);
                        }
                        this.f2513c.n0();
                    }
                    c cVar2 = this.f2513c;
                    if (cVar2.Q) {
                        if (cVar2.K != null && (viewGroup = cVar2.J) != null) {
                            i iVarU = i.u(viewGroup, cVar2.L());
                            if (this.f2513c.C) {
                                iVarU.k(this);
                            } else {
                                iVarU.m(this);
                            }
                        }
                        c cVar3 = this.f2513c;
                        FragmentManager fragmentManager = cVar3.f2465v;
                        if (fragmentManager != null) {
                            fragmentManager.L0(cVar3);
                        }
                        c cVar4 = this.f2513c;
                        cVar4.Q = false;
                        cVar4.P0(cVar4.C);
                        this.f2513c.f2467x.N();
                    }
                    return;
                }
                if (iD <= i10) {
                    switch (i10 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (cVar.f2458o && this.b.q(cVar.f2449f) == null) {
                                this.b.B(this.f2513c.f2449f, q());
                            }
                            g();
                            break;
                        case 1:
                            h();
                            this.f2513c.f2441a = 1;
                            break;
                        case 2:
                            cVar.f2460q = false;
                            cVar.f2441a = 2;
                            break;
                        case 3:
                            if (FragmentManager.N0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f2513c);
                            }
                            c cVar5 = this.f2513c;
                            if (cVar5.f2458o) {
                                this.b.B(cVar5.f2449f, q());
                            } else if (cVar5.K != null && cVar5.f2444c == null) {
                                r();
                            }
                            c cVar6 = this.f2513c;
                            if (cVar6.K != null && (viewGroup2 = cVar6.J) != null) {
                                i.u(viewGroup2, cVar6.L()).l(this);
                            }
                            this.f2513c.f2441a = 3;
                            break;
                        case 4:
                            u();
                            break;
                        case 5:
                            cVar.f2441a = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i10 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (cVar.K != null && (viewGroup3 = cVar.J) != null) {
                                i.u(viewGroup3, cVar.L()).j(i.d.b.c(this.f2513c.K.getVisibility()), this);
                            }
                            this.f2513c.f2441a = 4;
                            break;
                        case 5:
                            t();
                            break;
                        case 6:
                            cVar.f2441a = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
                z10 = true;
            }
        } finally {
            this.f2514d = false;
        }
    }

    public void n() {
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f2513c);
        }
        this.f2513c.v1();
        this.f2512a.f(this.f2513c, false);
    }

    public void o(@NonNull ClassLoader classLoader) {
        Bundle bundle = this.f2513c.b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (this.f2513c.b.getBundle("savedInstanceState") == null) {
            this.f2513c.b.putBundle("savedInstanceState", new Bundle());
        }
        try {
            c cVar = this.f2513c;
            cVar.f2444c = cVar.b.getSparseParcelableArray("viewState");
            c cVar2 = this.f2513c;
            cVar2.f2446d = cVar2.b.getBundle("viewRegistryState");
            FragmentState fragmentState = (FragmentState) this.f2513c.b.getParcelable("state");
            if (fragmentState != null) {
                c cVar3 = this.f2513c;
                cVar3.f2452i = fragmentState.f2389m;
                cVar3.f2453j = fragmentState.f2390n;
                Boolean bool = cVar3.f2448e;
                if (bool != null) {
                    cVar3.M = bool.booleanValue();
                    this.f2513c.f2448e = null;
                } else {
                    cVar3.M = fragmentState.f2391o;
                }
            }
            c cVar4 = this.f2513c;
            if (cVar4.M) {
                return;
            }
            cVar4.L = true;
        } catch (BadParcelableException e10) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + k(), e10);
        }
    }

    public void p() {
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f2513c);
        }
        View viewE = this.f2513c.E();
        if (viewE != null && l(viewE)) {
            boolean zRequestFocus = viewE.requestFocus();
            if (FragmentManager.N0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(viewE);
                sb2.append(" ");
                sb2.append(zRequestFocus ? "succeeded" : "failed");
                sb2.append(" on Fragment ");
                sb2.append(this.f2513c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f2513c.K.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        this.f2513c.R1(null);
        this.f2513c.z1();
        this.f2512a.i(this.f2513c, false);
        this.b.B(this.f2513c.f2449f, null);
        c cVar = this.f2513c;
        cVar.b = null;
        cVar.f2444c = null;
        cVar.f2446d = null;
    }

    @NonNull
    public Bundle q() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        c cVar = this.f2513c;
        if (cVar.f2441a == -1 && (bundle = cVar.b) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new FragmentState(this.f2513c));
        if (this.f2513c.f2441a > 0) {
            Bundle bundle3 = new Bundle();
            this.f2513c.A1(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f2512a.j(this.f2513c, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.f2513c.Z.e(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleP1 = this.f2513c.f2467x.p1();
            if (!bundleP1.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleP1);
            }
            if (this.f2513c.K != null) {
                r();
            }
            SparseArray<Parcelable> sparseArray = this.f2513c.f2444c;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = this.f2513c.f2446d;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = this.f2513c.f2450g;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public void r() {
        if (this.f2513c.K == null) {
            return;
        }
        if (FragmentManager.N0(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.f2513c + " with view " + this.f2513c.K);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f2513c.K.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f2513c.f2444c = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f2513c.W.f(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f2513c.f2446d = bundle;
    }

    public void s(int i10) {
        this.f2515e = i10;
    }

    public void t() {
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f2513c);
        }
        this.f2513c.B1();
        this.f2512a.k(this.f2513c, false);
    }

    public void u() {
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f2513c);
        }
        this.f2513c.C1();
        this.f2512a.l(this.f2513c, false);
    }

    public g(@NonNull f fVar, @NonNull g0 g0Var, @NonNull ClassLoader classLoader, @NonNull e eVar, @NonNull Bundle bundle) {
        this.f2512a = fVar;
        this.b = g0Var;
        c cVarA = ((FragmentState) bundle.getParcelable("state")).a(eVar, classLoader);
        this.f2513c = cVarA;
        cVarA.b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        cVarA.O1(bundle2);
        if (FragmentManager.N0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + cVarA);
        }
    }

    public g(@NonNull f fVar, @NonNull g0 g0Var, @NonNull c cVar, @NonNull Bundle bundle) {
        this.f2512a = fVar;
        this.b = g0Var;
        this.f2513c = cVar;
        cVar.f2444c = null;
        cVar.f2446d = null;
        cVar.f2464u = 0;
        cVar.f2460q = false;
        cVar.f2455l = false;
        c cVar2 = cVar.f2451h;
        cVar.f2452i = cVar2 != null ? cVar2.f2449f : null;
        cVar.f2451h = null;
        cVar.b = bundle;
        cVar.f2450g = bundle.getBundle("arguments");
    }
}
