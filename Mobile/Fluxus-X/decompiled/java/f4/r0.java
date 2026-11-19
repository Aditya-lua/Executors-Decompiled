package f4;

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
import androidx.fragment.app.FragmentContainerView;

/* JADX INFO: loaded from: classes.dex */
public class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f15548a;
    public final s0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final q f15549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15550d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15551e = -1;

    public class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f15552a;

        public a(View view) {
            this.f15552a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f15552a.removeOnAttachStateChangeListener(this);
            androidx.core.view.o0.j0(this.f15552a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15553a;

        static {
            int[] iArr = new int[androidx.lifecycle.l.b.values().length];
            f15553a = iArr;
            try {
                iArr[androidx.lifecycle.l.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15553a[androidx.lifecycle.l.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15553a[androidx.lifecycle.l.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15553a[androidx.lifecycle.l.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public r0(@NonNull d0 d0Var, @NonNull s0 s0Var, @NonNull q qVar) {
        this.f15548a = d0Var;
        this.b = s0Var;
        this.f15549c = qVar;
    }

    public void a() {
        if (k0.N0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f15549c);
        }
        Bundle bundle = this.f15549c.b;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        this.f15549c.g1(bundle2);
        this.f15548a.a(this.f15549c, bundle2, false);
    }

    public void b() {
        q qVarQ0 = k0.q0(this.f15549c.J);
        q qVarJ = this.f15549c.J();
        if (qVarQ0 != null && !qVarQ0.equals(qVarJ)) {
            q qVar = this.f15549c;
            g4.c.l(qVar, qVarQ0, qVar.A);
        }
        int iJ = this.b.j(this.f15549c);
        q qVar2 = this.f15549c;
        qVar2.J.addView(qVar2.K, iJ);
    }

    public void c() {
        if (k0.N0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f15549c);
        }
        q qVar = this.f15549c;
        q qVar2 = qVar.f15480h;
        r0 r0VarN = null;
        if (qVar2 != null) {
            r0 r0VarN2 = this.b.n(qVar2.f15478f);
            if (r0VarN2 == null) {
                throw new IllegalStateException("Fragment " + this.f15549c + " declared target fragment " + this.f15549c.f15480h + " that does not belong to this FragmentManager!");
            }
            q qVar3 = this.f15549c;
            qVar3.f15481i = qVar3.f15480h.f15478f;
            qVar3.f15480h = null;
            r0VarN = r0VarN2;
        } else {
            String str = qVar.f15481i;
            if (str != null && (r0VarN = this.b.n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f15549c + " declared target fragment " + this.f15549c.f15481i + " that does not belong to this FragmentManager!");
            }
        }
        if (r0VarN != null) {
            r0VarN.m();
        }
        q qVar4 = this.f15549c;
        qVar4.f15495w = qVar4.f15494v.A0();
        q qVar5 = this.f15549c;
        qVar5.f15497y = qVar5.f15494v.D0();
        this.f15548a.g(this.f15549c, false);
        this.f15549c.h1();
        this.f15548a.b(this.f15549c, false);
    }

    public int d() {
        q qVar = this.f15549c;
        if (qVar.f15494v == null) {
            return qVar.f15470a;
        }
        int iMin = this.f15551e;
        int i10 = b.f15553a[qVar.U.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                iMin = Math.min(iMin, 5);
            } else if (i10 != 3) {
                iMin = i10 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0);
            } else {
                iMin = Math.min(iMin, 1);
            }
        }
        q qVar2 = this.f15549c;
        if (qVar2.f15488p) {
            if (qVar2.f15489q) {
                iMin = Math.max(this.f15551e, 2);
                View view = this.f15549c.K;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f15551e < 4 ? Math.min(iMin, qVar2.f15470a) : Math.min(iMin, 1);
            }
        }
        q qVar3 = this.f15549c;
        if (qVar3.f15490r && qVar3.J == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!this.f15549c.f15484l) {
            iMin = Math.min(iMin, 1);
        }
        q qVar4 = this.f15549c;
        ViewGroup viewGroup = qVar4.J;
        c1.d.a aVarS = viewGroup != null ? c1.u(viewGroup, qVar4.L()).s(this) : null;
        if (aVarS == c1.d.a.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (aVarS == c1.d.a.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            q qVar5 = this.f15549c;
            if (qVar5.f15485m) {
                iMin = qVar5.s0() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        q qVar6 = this.f15549c;
        if (qVar6.L && qVar6.f15470a < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (this.f15549c.f15486n) {
            iMin = Math.max(iMin, 3);
        }
        if (k0.N0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + this.f15549c);
        }
        return iMin;
    }

    public void e() {
        if (k0.N0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f15549c);
        }
        Bundle bundle = this.f15549c.b;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        q qVar = this.f15549c;
        if (qVar.S) {
            qVar.f15470a = 1;
            qVar.K1();
        } else {
            this.f15548a.h(qVar, bundle2, false);
            this.f15549c.k1(bundle2);
            this.f15548a.c(this.f15549c, bundle2, false);
        }
    }

    public void f() {
        String resourceName;
        if (this.f15549c.f15488p) {
            return;
        }
        if (k0.N0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f15549c);
        }
        Bundle bundle = this.f15549c.b;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterQ1 = this.f15549c.q1(bundle2);
        q qVar = this.f15549c;
        ViewGroup viewGroup2 = qVar.J;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i10 = qVar.A;
            if (i10 != 0) {
                if (i10 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f15549c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) qVar.f15494v.w0().d(this.f15549c.A);
                if (viewGroup == null) {
                    q qVar2 = this.f15549c;
                    if (!qVar2.f15491s && !qVar2.f15490r) {
                        try {
                            resourceName = qVar2.S().getResourceName(this.f15549c.A);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f15549c.A) + " (" + resourceName + ") for fragment " + this.f15549c);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    g4.c.k(this.f15549c, viewGroup);
                }
            }
        }
        q qVar3 = this.f15549c;
        qVar3.J = viewGroup;
        qVar3.m1(layoutInflaterQ1, viewGroup, bundle2);
        if (this.f15549c.K != null) {
            if (k0.N0(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + this.f15549c);
            }
            this.f15549c.K.setSaveFromParentEnabled(false);
            q qVar4 = this.f15549c;
            qVar4.K.setTag(e4.b.f13177a, qVar4);
            if (viewGroup != null) {
                b();
            }
            q qVar5 = this.f15549c;
            if (qVar5.C) {
                qVar5.K.setVisibility(8);
            }
            if (this.f15549c.K.isAttachedToWindow()) {
                androidx.core.view.o0.j0(this.f15549c.K);
            } else {
                View view = this.f15549c.K;
                view.addOnAttachStateChangeListener(new a(view));
            }
            this.f15549c.D1();
            d0 d0Var = this.f15548a;
            q qVar6 = this.f15549c;
            d0Var.m(qVar6, qVar6.K, bundle2, false);
            int visibility = this.f15549c.K.getVisibility();
            this.f15549c.U1(this.f15549c.K.getAlpha());
            q qVar7 = this.f15549c;
            if (qVar7.J != null && visibility == 0) {
                View viewFindFocus = qVar7.K.findFocus();
                if (viewFindFocus != null) {
                    this.f15549c.R1(viewFindFocus);
                    if (k0.N0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + this.f15549c);
                    }
                }
                this.f15549c.K.setAlpha(0.0f);
            }
        }
        this.f15549c.f15470a = 2;
    }

    public void g() {
        q qVarF;
        if (k0.N0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f15549c);
        }
        q qVar = this.f15549c;
        boolean zIsChangingConfigurations = true;
        boolean z10 = qVar.f15485m && !qVar.s0();
        if (z10) {
            q qVar2 = this.f15549c;
            if (!qVar2.f15487o) {
                this.b.B(qVar2.f15478f, null);
            }
        }
        if (!z10 && !this.b.p().q(this.f15549c)) {
            String str = this.f15549c.f15481i;
            if (str != null && (qVarF = this.b.f(str)) != null && qVarF.E) {
                this.f15549c.f15480h = qVarF;
            }
            this.f15549c.f15470a = 0;
            return;
        }
        a0<?> a0Var = this.f15549c.f15495w;
        if (a0Var instanceof androidx.p000lifecycle.c1) {
            zIsChangingConfigurations = this.b.p().n();
        } else if (a0Var.getContext() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) a0Var.getContext()).isChangingConfigurations();
        }
        if ((z10 && !this.f15549c.f15487o) || zIsChangingConfigurations) {
            this.b.p().f(this.f15549c, false);
        }
        this.f15549c.n1();
        this.f15548a.d(this.f15549c, false);
        for (r0 r0Var : this.b.k()) {
            if (r0Var != null) {
                q qVarK = r0Var.k();
                if (this.f15549c.f15478f.equals(qVarK.f15481i)) {
                    qVarK.f15480h = this.f15549c;
                    qVarK.f15481i = null;
                }
            }
        }
        q qVar3 = this.f15549c;
        String str2 = qVar3.f15481i;
        if (str2 != null) {
            qVar3.f15480h = this.b.f(str2);
        }
        this.b.s(this);
    }

    public void h() {
        View view;
        if (k0.N0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f15549c);
        }
        q qVar = this.f15549c;
        ViewGroup viewGroup = qVar.J;
        if (viewGroup != null && (view = qVar.K) != null) {
            viewGroup.removeView(view);
        }
        this.f15549c.o1();
        this.f15548a.n(this.f15549c, false);
        q qVar2 = this.f15549c;
        qVar2.J = null;
        qVar2.K = null;
        qVar2.W = null;
        qVar2.X.o(null);
        this.f15549c.f15489q = false;
    }

    public void i() {
        if (k0.N0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f15549c);
        }
        this.f15549c.p1();
        this.f15548a.e(this.f15549c, false);
        q qVar = this.f15549c;
        qVar.f15470a = -1;
        qVar.f15495w = null;
        qVar.f15497y = null;
        qVar.f15494v = null;
        if ((!qVar.f15485m || qVar.s0()) && !this.b.p().q(this.f15549c)) {
            return;
        }
        if (k0.N0(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + this.f15549c);
        }
        this.f15549c.n0();
    }

    public void j() {
        q qVar = this.f15549c;
        if (qVar.f15488p && qVar.f15489q && !qVar.f15492t) {
            if (k0.N0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f15549c);
            }
            Bundle bundle = this.f15549c.b;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            q qVar2 = this.f15549c;
            qVar2.m1(qVar2.q1(bundle2), null, bundle2);
            View view = this.f15549c.K;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                q qVar3 = this.f15549c;
                qVar3.K.setTag(e4.b.f13177a, qVar3);
                q qVar4 = this.f15549c;
                if (qVar4.C) {
                    qVar4.K.setVisibility(8);
                }
                this.f15549c.D1();
                d0 d0Var = this.f15548a;
                q qVar5 = this.f15549c;
                d0Var.m(qVar5, qVar5.K, bundle2, false);
                this.f15549c.f15470a = 2;
            }
        }
    }

    @NonNull
    public q k() {
        return this.f15549c;
    }

    public final boolean l(@NonNull View view) {
        if (view == this.f15549c.K) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f15549c.K) {
                return true;
            }
        }
        return false;
    }

    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f15550d) {
            if (k0.N0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.f15550d = true;
            boolean z10 = false;
            while (true) {
                int iD = d();
                q qVar = this.f15549c;
                int i10 = qVar.f15470a;
                if (iD == i10) {
                    if (!z10 && i10 == -1 && qVar.f15485m && !qVar.s0() && !this.f15549c.f15487o) {
                        if (k0.N0(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f15549c);
                        }
                        this.b.p().f(this.f15549c, true);
                        this.b.s(this);
                        if (k0.N0(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f15549c);
                        }
                        this.f15549c.n0();
                    }
                    q qVar2 = this.f15549c;
                    if (qVar2.Q) {
                        if (qVar2.K != null && (viewGroup = qVar2.J) != null) {
                            c1 c1VarU = c1.u(viewGroup, qVar2.L());
                            if (this.f15549c.C) {
                                c1VarU.k(this);
                            } else {
                                c1VarU.m(this);
                            }
                        }
                        q qVar3 = this.f15549c;
                        k0 k0Var = qVar3.f15494v;
                        if (k0Var != null) {
                            k0Var.L0(qVar3);
                        }
                        q qVar4 = this.f15549c;
                        qVar4.Q = false;
                        qVar4.P0(qVar4.C);
                        this.f15549c.f15496x.N();
                    }
                    return;
                }
                if (iD <= i10) {
                    switch (i10 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (qVar.f15487o && this.b.q(qVar.f15478f) == null) {
                                this.b.B(this.f15549c.f15478f, q());
                            }
                            g();
                            break;
                        case 1:
                            h();
                            this.f15549c.f15470a = 1;
                            break;
                        case 2:
                            qVar.f15489q = false;
                            qVar.f15470a = 2;
                            break;
                        case 3:
                            if (k0.N0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f15549c);
                            }
                            q qVar5 = this.f15549c;
                            if (qVar5.f15487o) {
                                this.b.B(qVar5.f15478f, q());
                            } else if (qVar5.K != null && qVar5.f15473c == null) {
                                r();
                            }
                            q qVar6 = this.f15549c;
                            if (qVar6.K != null && (viewGroup2 = qVar6.J) != null) {
                                c1.u(viewGroup2, qVar6.L()).l(this);
                            }
                            this.f15549c.f15470a = 3;
                            break;
                        case 4:
                            u();
                            break;
                        case 5:
                            qVar.f15470a = 5;
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
                            if (qVar.K != null && (viewGroup3 = qVar.J) != null) {
                                c1.u(viewGroup3, qVar.L()).j(c1.d.b.c(this.f15549c.K.getVisibility()), this);
                            }
                            this.f15549c.f15470a = 4;
                            break;
                        case 5:
                            t();
                            break;
                        case 6:
                            qVar.f15470a = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
                z10 = true;
            }
        } finally {
            this.f15550d = false;
        }
    }

    public void n() {
        if (k0.N0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f15549c);
        }
        this.f15549c.v1();
        this.f15548a.f(this.f15549c, false);
    }

    public void o(@NonNull ClassLoader classLoader) {
        Bundle bundle = this.f15549c.b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (this.f15549c.b.getBundle("savedInstanceState") == null) {
            this.f15549c.b.putBundle("savedInstanceState", new Bundle());
        }
        try {
            q qVar = this.f15549c;
            qVar.f15473c = qVar.b.getSparseParcelableArray("viewState");
            q qVar2 = this.f15549c;
            qVar2.f15475d = qVar2.b.getBundle("viewRegistryState");
            q0 q0Var = (q0) this.f15549c.b.getParcelable("state");
            if (q0Var != null) {
                q qVar3 = this.f15549c;
                qVar3.f15481i = q0Var.f15544m;
                qVar3.f15482j = q0Var.f15545n;
                Boolean bool = qVar3.f15477e;
                if (bool != null) {
                    qVar3.M = bool.booleanValue();
                    this.f15549c.f15477e = null;
                } else {
                    qVar3.M = q0Var.f15546o;
                }
            }
            q qVar4 = this.f15549c;
            if (qVar4.M) {
                return;
            }
            qVar4.L = true;
        } catch (BadParcelableException e10) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + k(), e10);
        }
    }

    public void p() {
        if (k0.N0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f15549c);
        }
        View viewE = this.f15549c.E();
        if (viewE != null && l(viewE)) {
            boolean zRequestFocus = viewE.requestFocus();
            if (k0.N0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(viewE);
                sb2.append(" ");
                sb2.append(zRequestFocus ? "succeeded" : "failed");
                sb2.append(" on Fragment ");
                sb2.append(this.f15549c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f15549c.K.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        this.f15549c.R1(null);
        this.f15549c.z1();
        this.f15548a.i(this.f15549c, false);
        this.b.B(this.f15549c.f15478f, null);
        q qVar = this.f15549c;
        qVar.b = null;
        qVar.f15473c = null;
        qVar.f15475d = null;
    }

    @NonNull
    public Bundle q() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        q qVar = this.f15549c;
        if (qVar.f15470a == -1 && (bundle = qVar.b) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new q0(this.f15549c));
        if (this.f15549c.f15470a > 0) {
            Bundle bundle3 = new Bundle();
            this.f15549c.A1(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f15548a.j(this.f15549c, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.f15549c.Z.e(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleP1 = this.f15549c.f15496x.p1();
            if (!bundleP1.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleP1);
            }
            if (this.f15549c.K != null) {
                r();
            }
            SparseArray<Parcelable> sparseArray = this.f15549c.f15473c;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = this.f15549c.f15475d;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = this.f15549c.f15479g;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public void r() {
        if (this.f15549c.K == null) {
            return;
        }
        if (k0.N0(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.f15549c + " with view " + this.f15549c.K);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f15549c.K.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f15549c.f15473c = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f15549c.W.f(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f15549c.f15475d = bundle;
    }

    public void s(int i10) {
        this.f15551e = i10;
    }

    public void t() {
        if (k0.N0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f15549c);
        }
        this.f15549c.B1();
        this.f15548a.k(this.f15549c, false);
    }

    public void u() {
        if (k0.N0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f15549c);
        }
        this.f15549c.C1();
        this.f15548a.l(this.f15549c, false);
    }

    public r0(@NonNull d0 d0Var, @NonNull s0 s0Var, @NonNull ClassLoader classLoader, @NonNull z zVar, @NonNull Bundle bundle) {
        this.f15548a = d0Var;
        this.b = s0Var;
        q qVarA = ((q0) bundle.getParcelable("state")).a(zVar, classLoader);
        this.f15549c = qVarA;
        qVarA.b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        qVarA.O1(bundle2);
        if (k0.N0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + qVarA);
        }
    }

    public r0(@NonNull d0 d0Var, @NonNull s0 s0Var, @NonNull q qVar, @NonNull Bundle bundle) {
        this.f15548a = d0Var;
        this.b = s0Var;
        this.f15549c = qVar;
        qVar.f15473c = null;
        qVar.f15475d = null;
        qVar.f15493u = 0;
        qVar.f15489q = false;
        qVar.f15484l = false;
        q qVar2 = qVar.f15480h;
        qVar.f15481i = qVar2 != null ? qVar2.f15478f : null;
        qVar.f15480h = null;
        qVar.b = bundle;
        qVar.f15479g = bundle.getBundle("arguments");
    }
}
