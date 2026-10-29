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
import androidx.core.os.EnvironmentCompat;
import androidx.core.view.C0625o0;
import androidx.p616lifecycle.AbstractC0966l;
import androidx.p616lifecycle.InterfaceC0947c1;
import p067d4.C4435b;
import p093e4.AbstractC4835t;
import p093e4.C4812g0;
import p118f4.C5348c;

/* JADX INFO: renamed from: androidx.fragment.app.g */
/* JADX INFO: loaded from: classes.dex */
public class C0933g {

    /* JADX INFO: renamed from: a */
    public final C0932f f3513a;

    /* JADX INFO: renamed from: b */
    public final C4812g0 f3514b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ComponentCallbacksC0929c f3515c;

    /* JADX INFO: renamed from: d */
    public boolean f3516d = false;

    /* JADX INFO: renamed from: e */
    public int f3517e = -1;

    /* JADX INFO: renamed from: androidx.fragment.app.g$a */
    public class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f3518a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(View view) {
            this.f3518a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f3518a.removeOnAttachStateChangeListener(this);
            C0625o0.m3034j0(this.f3518a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.g$b */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f3520a;

        static {
            int[] iArr = new int[AbstractC0966l.b.values().length];
            f3520a = iArr;
            try {
                iArr[AbstractC0966l.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3520a[AbstractC0966l.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3520a[AbstractC0966l.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3520a[AbstractC0966l.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0933g(@NonNull C0932f c0932f, @NonNull C4812g0 c4812g0, @NonNull ComponentCallbacksC0929c componentCallbacksC0929c) {
        this.f3513a = c0932f;
        this.f3514b = c4812g0;
        this.f3515c = componentCallbacksC0929c;
    }

    /* JADX INFO: renamed from: a */
    public void m4754a() {
        if (FragmentManager.m4349N0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f3515c);
        }
        Bundle bundle = this.f3515c.f3436b;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        this.f3515c.m4670g1(bundle2);
        this.f3513a.m4738a(this.f3515c, bundle2, false);
    }

    /* JADX INFO: renamed from: b */
    public void m4755b() {
        ComponentCallbacksC0929c componentCallbacksC0929cM4363q0 = FragmentManager.m4363q0(this.f3515c.f3417J);
        ComponentCallbacksC0929c componentCallbacksC0929cM4612K = this.f3515c.m4612K();
        if (componentCallbacksC0929cM4363q0 != null && !componentCallbacksC0929cM4363q0.equals(componentCallbacksC0929cM4612K)) {
            ComponentCallbacksC0929c componentCallbacksC0929c = this.f3515c;
            C5348c.m24682l(componentCallbacksC0929c, componentCallbacksC0929cM4363q0, componentCallbacksC0929c.f3408A);
        }
        int iM23271j = this.f3514b.m23271j(this.f3515c);
        ComponentCallbacksC0929c componentCallbacksC0929c2 = this.f3515c;
        componentCallbacksC0929c2.f3417J.addView(componentCallbacksC0929c2.f3418K, iM23271j);
    }

    /* JADX INFO: renamed from: c */
    public void m4756c() {
        if (FragmentManager.m4349N0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f3515c);
        }
        ComponentCallbacksC0929c componentCallbacksC0929c = this.f3515c;
        ComponentCallbacksC0929c componentCallbacksC0929c2 = componentCallbacksC0929c.f3445h;
        C0933g c0933gM23275n = null;
        if (componentCallbacksC0929c2 != null) {
            C0933g c0933gM23275n2 = this.f3514b.m23275n(componentCallbacksC0929c2.f3443f);
            if (c0933gM23275n2 == null) {
                throw new IllegalStateException("Fragment " + this.f3515c + " declared target fragment " + this.f3515c.f3445h + " that does not belong to this FragmentManager!");
            }
            ComponentCallbacksC0929c componentCallbacksC0929c3 = this.f3515c;
            componentCallbacksC0929c3.f3446i = componentCallbacksC0929c3.f3445h.f3443f;
            componentCallbacksC0929c3.f3445h = null;
            c0933gM23275n = c0933gM23275n2;
        } else {
            String str = componentCallbacksC0929c.f3446i;
            if (str != null && (c0933gM23275n = this.f3514b.m23275n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f3515c + " declared target fragment " + this.f3515c.f3446i + " that does not belong to this FragmentManager!");
            }
        }
        if (c0933gM23275n != null) {
            c0933gM23275n.m4766m();
        }
        ComponentCallbacksC0929c componentCallbacksC0929c4 = this.f3515c;
        componentCallbacksC0929c4.f3460w = componentCallbacksC0929c4.f3459v.m4365A0();
        ComponentCallbacksC0929c componentCallbacksC0929c5 = this.f3515c;
        componentCallbacksC0929c5.f3462y = componentCallbacksC0929c5.f3459v.m4372D0();
        this.f3513a.m4744g(this.f3515c, false);
        this.f3515c.m4673h1();
        this.f3513a.m4739b(this.f3515c, false);
    }

    /* JADX INFO: renamed from: d */
    public int m4757d() {
        ComponentCallbacksC0929c componentCallbacksC0929c = this.f3515c;
        if (componentCallbacksC0929c.f3459v == null) {
            return componentCallbacksC0929c.f3434a;
        }
        int iMin = this.f3517e;
        int i10 = b.f3520a[componentCallbacksC0929c.f3428U.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                iMin = Math.min(iMin, 5);
            } else if (i10 != 3) {
                iMin = i10 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0);
            } else {
                iMin = Math.min(iMin, 1);
            }
        }
        ComponentCallbacksC0929c componentCallbacksC0929c2 = this.f3515c;
        if (componentCallbacksC0929c2.f3453p) {
            if (componentCallbacksC0929c2.f3454q) {
                iMin = Math.max(this.f3517e, 2);
                View view = this.f3515c.f3418K;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f3517e < 4 ? Math.min(iMin, componentCallbacksC0929c2.f3434a) : Math.min(iMin, 1);
            }
        }
        ComponentCallbacksC0929c componentCallbacksC0929c3 = this.f3515c;
        if (componentCallbacksC0929c3.f3455r && componentCallbacksC0929c3.f3417J == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!this.f3515c.f3449l) {
            iMin = Math.min(iMin, 1);
        }
        ComponentCallbacksC0929c componentCallbacksC0929c4 = this.f3515c;
        ViewGroup viewGroup = componentCallbacksC0929c4.f3417J;
        AbstractC0935i.d.a aVarM4810s = viewGroup != null ? AbstractC0935i.m4791u(viewGroup, componentCallbacksC0929c4.m4617M()).m4810s(this) : null;
        if (aVarM4810s == AbstractC0935i.d.a.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (aVarM4810s == AbstractC0935i.d.a.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            ComponentCallbacksC0929c componentCallbacksC0929c5 = this.f3515c;
            if (componentCallbacksC0929c5.f3450m) {
                iMin = componentCallbacksC0929c5.m4702s0() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        ComponentCallbacksC0929c componentCallbacksC0929c6 = this.f3515c;
        if (componentCallbacksC0929c6.f3419L && componentCallbacksC0929c6.f3434a < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (this.f3515c.f3451n) {
            iMin = Math.max(iMin, 3);
        }
        if (FragmentManager.m4349N0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + this.f3515c);
        }
        return iMin;
    }

    /* JADX INFO: renamed from: e */
    public void m4758e() {
        if (FragmentManager.m4349N0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f3515c);
        }
        Bundle bundle = this.f3515c.f3436b;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        ComponentCallbacksC0929c componentCallbacksC0929c = this.f3515c;
        if (componentCallbacksC0929c.f3426S) {
            componentCallbacksC0929c.f3434a = 1;
            componentCallbacksC0929c.m4614K1();
        } else {
            this.f3513a.m4745h(componentCallbacksC0929c, bundle2, false);
            this.f3515c.m4681k1(bundle2);
            this.f3513a.m4740c(this.f3515c, bundle2, false);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m4759f() {
        String resourceName;
        if (this.f3515c.f3453p) {
            return;
        }
        if (FragmentManager.m4349N0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f3515c);
        }
        Bundle bundle = this.f3515c.f3436b;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterM4697q1 = this.f3515c.m4697q1(bundle2);
        ComponentCallbacksC0929c componentCallbacksC0929c = this.f3515c;
        ViewGroup viewGroup2 = componentCallbacksC0929c.f3417J;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i10 = componentCallbacksC0929c.f3408A;
            if (i10 != 0) {
                if (i10 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f3515c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) componentCallbacksC0929c.f3459v.m4468w0().mo4728d(this.f3515c.f3408A);
                if (viewGroup == null) {
                    ComponentCallbacksC0929c componentCallbacksC0929c2 = this.f3515c;
                    if (!componentCallbacksC0929c2.f3456s && !componentCallbacksC0929c2.f3455r) {
                        try {
                            resourceName = componentCallbacksC0929c2.m4637T().getResourceName(this.f3515c.f3408A);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = EnvironmentCompat.MEDIA_UNKNOWN;
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f3515c.f3408A) + " (" + resourceName + ") for fragment " + this.f3515c);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    C5348c.m24681k(this.f3515c, viewGroup);
                }
            }
        }
        ComponentCallbacksC0929c componentCallbacksC0929c3 = this.f3515c;
        componentCallbacksC0929c3.f3417J = viewGroup;
        componentCallbacksC0929c3.mo4687m1(layoutInflaterM4697q1, viewGroup, bundle2);
        if (this.f3515c.f3418K != null) {
            if (FragmentManager.m4349N0(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + this.f3515c);
            }
            this.f3515c.f3418K.setSaveFromParentEnabled(false);
            ComponentCallbacksC0929c componentCallbacksC0929c4 = this.f3515c;
            componentCallbacksC0929c4.f3418K.setTag(C4435b.f18437a, componentCallbacksC0929c4);
            if (viewGroup != null) {
                m4755b();
            }
            ComponentCallbacksC0929c componentCallbacksC0929c5 = this.f3515c;
            if (componentCallbacksC0929c5.f3410C) {
                componentCallbacksC0929c5.f3418K.setVisibility(8);
            }
            if (this.f3515c.f3418K.isAttachedToWindow()) {
                C0625o0.m3034j0(this.f3515c.f3418K);
            } else {
                View view = this.f3515c.f3418K;
                view.addOnAttachStateChangeListener(new a(view));
            }
            this.f3515c.m4594D1();
            C0932f c0932f = this.f3513a;
            ComponentCallbacksC0929c componentCallbacksC0929c6 = this.f3515c;
            c0932f.m4750m(componentCallbacksC0929c6, componentCallbacksC0929c6.f3418K, bundle2, false);
            int visibility = this.f3515c.f3418K.getVisibility();
            this.f3515c.m4641U1(this.f3515c.f3418K.getAlpha());
            ComponentCallbacksC0929c componentCallbacksC0929c7 = this.f3515c;
            if (componentCallbacksC0929c7.f3417J != null && visibility == 0) {
                View viewFindFocus = componentCallbacksC0929c7.f3418K.findFocus();
                if (viewFindFocus != null) {
                    this.f3515c.m4633R1(viewFindFocus);
                    if (FragmentManager.m4349N0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + this.f3515c);
                    }
                }
                this.f3515c.f3418K.setAlpha(0.0f);
            }
        }
        this.f3515c.f3434a = 2;
    }

    /* JADX INFO: renamed from: g */
    public void m4760g() {
        ComponentCallbacksC0929c componentCallbacksC0929cM23267f;
        if (FragmentManager.m4349N0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f3515c);
        }
        ComponentCallbacksC0929c componentCallbacksC0929c = this.f3515c;
        boolean zIsChangingConfigurations = true;
        boolean z10 = componentCallbacksC0929c.f3450m && !componentCallbacksC0929c.m4702s0();
        if (z10) {
            ComponentCallbacksC0929c componentCallbacksC0929c2 = this.f3515c;
            if (!componentCallbacksC0929c2.f3452o) {
                this.f3514b.m23261B(componentCallbacksC0929c2.f3443f, null);
            }
        }
        if (!z10 && !this.f3514b.m23277p().m23259q(this.f3515c)) {
            String str = this.f3515c.f3446i;
            if (str != null && (componentCallbacksC0929cM23267f = this.f3514b.m23267f(str)) != null && componentCallbacksC0929cM23267f.f3412E) {
                this.f3515c.f3445h = componentCallbacksC0929cM23267f;
            }
            this.f3515c.f3434a = 0;
            return;
        }
        AbstractC4835t<?> abstractC4835t = this.f3515c.f3460w;
        if (abstractC4835t instanceof InterfaceC0947c1) {
            zIsChangingConfigurations = this.f3514b.m23277p().m23256n();
        } else if (abstractC4835t.getContext() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) abstractC4835t.getContext()).isChangingConfigurations();
        }
        if ((z10 && !this.f3515c.f3452o) || zIsChangingConfigurations) {
            this.f3514b.m23277p().m23249f(this.f3515c, false);
        }
        this.f3515c.m4690n1();
        this.f3513a.m4741d(this.f3515c, false);
        for (C0933g c0933g : this.f3514b.m23272k()) {
            if (c0933g != null) {
                ComponentCallbacksC0929c componentCallbacksC0929cM4764k = c0933g.m4764k();
                if (this.f3515c.f3443f.equals(componentCallbacksC0929cM4764k.f3446i)) {
                    componentCallbacksC0929cM4764k.f3445h = this.f3515c;
                    componentCallbacksC0929cM4764k.f3446i = null;
                }
            }
        }
        ComponentCallbacksC0929c componentCallbacksC0929c3 = this.f3515c;
        String str2 = componentCallbacksC0929c3.f3446i;
        if (str2 != null) {
            componentCallbacksC0929c3.f3445h = this.f3514b.m23267f(str2);
        }
        this.f3514b.m23280s(this);
    }

    /* JADX INFO: renamed from: h */
    public void m4761h() {
        View view;
        if (FragmentManager.m4349N0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f3515c);
        }
        ComponentCallbacksC0929c componentCallbacksC0929c = this.f3515c;
        ViewGroup viewGroup = componentCallbacksC0929c.f3417J;
        if (viewGroup != null && (view = componentCallbacksC0929c.f3418K) != null) {
            viewGroup.removeView(view);
        }
        this.f3515c.m4692o1();
        this.f3513a.m4751n(this.f3515c, false);
        ComponentCallbacksC0929c componentCallbacksC0929c2 = this.f3515c;
        componentCallbacksC0929c2.f3417J = null;
        componentCallbacksC0929c2.f3418K = null;
        componentCallbacksC0929c2.f3430W = null;
        componentCallbacksC0929c2.f3431X.mo4863o(null);
        this.f3515c.f3454q = false;
    }

    /* JADX INFO: renamed from: i */
    public void m4762i() {
        if (FragmentManager.m4349N0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f3515c);
        }
        this.f3515c.m4695p1();
        this.f3513a.m4742e(this.f3515c, false);
        ComponentCallbacksC0929c componentCallbacksC0929c = this.f3515c;
        componentCallbacksC0929c.f3434a = -1;
        componentCallbacksC0929c.f3460w = null;
        componentCallbacksC0929c.f3462y = null;
        componentCallbacksC0929c.f3459v = null;
        if ((!componentCallbacksC0929c.f3450m || componentCallbacksC0929c.m4702s0()) && !this.f3514b.m23277p().m23259q(this.f3515c)) {
            return;
        }
        if (FragmentManager.m4349N0(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + this.f3515c);
        }
        this.f3515c.m4689n0();
    }

    /* JADX INFO: renamed from: j */
    public void m4763j() {
        ComponentCallbacksC0929c componentCallbacksC0929c = this.f3515c;
        if (componentCallbacksC0929c.f3453p && componentCallbacksC0929c.f3454q && !componentCallbacksC0929c.f3457t) {
            if (FragmentManager.m4349N0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f3515c);
            }
            Bundle bundle = this.f3515c.f3436b;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            ComponentCallbacksC0929c componentCallbacksC0929c2 = this.f3515c;
            componentCallbacksC0929c2.mo4687m1(componentCallbacksC0929c2.m4697q1(bundle2), null, bundle2);
            View view = this.f3515c.f3418K;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                ComponentCallbacksC0929c componentCallbacksC0929c3 = this.f3515c;
                componentCallbacksC0929c3.f3418K.setTag(C4435b.f18437a, componentCallbacksC0929c3);
                ComponentCallbacksC0929c componentCallbacksC0929c4 = this.f3515c;
                if (componentCallbacksC0929c4.f3410C) {
                    componentCallbacksC0929c4.f3418K.setVisibility(8);
                }
                this.f3515c.m4594D1();
                C0932f c0932f = this.f3513a;
                ComponentCallbacksC0929c componentCallbacksC0929c5 = this.f3515c;
                c0932f.m4750m(componentCallbacksC0929c5, componentCallbacksC0929c5.f3418K, bundle2, false);
                this.f3515c.f3434a = 2;
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: k */
    public ComponentCallbacksC0929c m4764k() {
        return this.f3515c;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m4765l(@NonNull View view) {
        if (view == this.f3515c.f3418K) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f3515c.f3418K) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public void m4766m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f3516d) {
            if (FragmentManager.m4349N0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + m4764k());
                return;
            }
            return;
        }
        try {
            this.f3516d = true;
            boolean z10 = false;
            while (true) {
                int iM4757d = m4757d();
                ComponentCallbacksC0929c componentCallbacksC0929c = this.f3515c;
                int i10 = componentCallbacksC0929c.f3434a;
                if (iM4757d == i10) {
                    if (!z10 && i10 == -1 && componentCallbacksC0929c.f3450m && !componentCallbacksC0929c.m4702s0() && !this.f3515c.f3452o) {
                        if (FragmentManager.m4349N0(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f3515c);
                        }
                        this.f3514b.m23277p().m23249f(this.f3515c, true);
                        this.f3514b.m23280s(this);
                        if (FragmentManager.m4349N0(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f3515c);
                        }
                        this.f3515c.m4689n0();
                    }
                    ComponentCallbacksC0929c componentCallbacksC0929c2 = this.f3515c;
                    if (componentCallbacksC0929c2.f3424Q) {
                        if (componentCallbacksC0929c2.f3418K != null && (viewGroup = componentCallbacksC0929c2.f3417J) != null) {
                            AbstractC0935i abstractC0935iM4791u = AbstractC0935i.m4791u(viewGroup, componentCallbacksC0929c2.m4617M());
                            if (this.f3515c.f3410C) {
                                abstractC0935iM4791u.m4802k(this);
                            } else {
                                abstractC0935iM4791u.m4804m(this);
                            }
                        }
                        ComponentCallbacksC0929c componentCallbacksC0929c3 = this.f3515c;
                        FragmentManager fragmentManager = componentCallbacksC0929c3.f3459v;
                        if (fragmentManager != null) {
                            fragmentManager.m4387L0(componentCallbacksC0929c3);
                        }
                        ComponentCallbacksC0929c componentCallbacksC0929c4 = this.f3515c;
                        componentCallbacksC0929c4.f3424Q = false;
                        componentCallbacksC0929c4.mo4627P0(componentCallbacksC0929c4.f3410C);
                        this.f3515c.f3461x.m4390N();
                    }
                    return;
                }
                if (iM4757d <= i10) {
                    switch (i10 - 1) {
                        case -1:
                            m4762i();
                            break;
                        case 0:
                            if (componentCallbacksC0929c.f3452o && this.f3514b.m23278q(componentCallbacksC0929c.f3443f) == null) {
                                this.f3514b.m23261B(this.f3515c.f3443f, m4770q());
                            }
                            m4760g();
                            break;
                        case 1:
                            m4761h();
                            this.f3515c.f3434a = 1;
                            break;
                        case 2:
                            componentCallbacksC0929c.f3454q = false;
                            componentCallbacksC0929c.f3434a = 2;
                            break;
                        case 3:
                            if (FragmentManager.m4349N0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f3515c);
                            }
                            ComponentCallbacksC0929c componentCallbacksC0929c5 = this.f3515c;
                            if (componentCallbacksC0929c5.f3452o) {
                                this.f3514b.m23261B(componentCallbacksC0929c5.f3443f, m4770q());
                            } else if (componentCallbacksC0929c5.f3418K != null && componentCallbacksC0929c5.f3438c == null) {
                                m4771r();
                            }
                            ComponentCallbacksC0929c componentCallbacksC0929c6 = this.f3515c;
                            if (componentCallbacksC0929c6.f3418K != null && (viewGroup2 = componentCallbacksC0929c6.f3417J) != null) {
                                AbstractC0935i.m4791u(viewGroup2, componentCallbacksC0929c6.m4617M()).m4803l(this);
                            }
                            this.f3515c.f3434a = 3;
                            break;
                        case 4:
                            m4774u();
                            break;
                        case 5:
                            componentCallbacksC0929c.f3434a = 5;
                            break;
                        case 6:
                            m4767n();
                            break;
                    }
                } else {
                    switch (i10 + 1) {
                        case 0:
                            m4756c();
                            break;
                        case 1:
                            m4758e();
                            break;
                        case 2:
                            m4763j();
                            m4759f();
                            break;
                        case 3:
                            m4754a();
                            break;
                        case 4:
                            if (componentCallbacksC0929c.f3418K != null && (viewGroup3 = componentCallbacksC0929c.f3417J) != null) {
                                AbstractC0935i.m4791u(viewGroup3, componentCallbacksC0929c.m4617M()).m4801j(AbstractC0935i.d.b.m4840c(this.f3515c.f3418K.getVisibility()), this);
                            }
                            this.f3515c.f3434a = 4;
                            break;
                        case 5:
                            m4773t();
                            break;
                        case 6:
                            componentCallbacksC0929c.f3434a = 6;
                            break;
                        case 7:
                            m4769p();
                            break;
                    }
                }
                z10 = true;
            }
        } finally {
            this.f3516d = false;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m4767n() {
        if (FragmentManager.m4349N0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f3515c);
        }
        this.f3515c.m4711v1();
        this.f3513a.m4743f(this.f3515c, false);
    }

    /* JADX INFO: renamed from: o */
    public void m4768o(@NonNull ClassLoader classLoader) {
        Bundle bundle = this.f3515c.f3436b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (this.f3515c.f3436b.getBundle("savedInstanceState") == null) {
            this.f3515c.f3436b.putBundle("savedInstanceState", new Bundle());
        }
        try {
            ComponentCallbacksC0929c componentCallbacksC0929c = this.f3515c;
            componentCallbacksC0929c.f3438c = componentCallbacksC0929c.f3436b.getSparseParcelableArray("viewState");
            ComponentCallbacksC0929c componentCallbacksC0929c2 = this.f3515c;
            componentCallbacksC0929c2.f3440d = componentCallbacksC0929c2.f3436b.getBundle("viewRegistryState");
            FragmentState fragmentState = (FragmentState) this.f3515c.f3436b.getParcelable("state");
            if (fragmentState != null) {
                ComponentCallbacksC0929c componentCallbacksC0929c3 = this.f3515c;
                componentCallbacksC0929c3.f3446i = fragmentState.f3352m;
                componentCallbacksC0929c3.f3447j = fragmentState.f3353n;
                Boolean bool = componentCallbacksC0929c3.f3442e;
                if (bool != null) {
                    componentCallbacksC0929c3.f3420M = bool.booleanValue();
                    this.f3515c.f3442e = null;
                } else {
                    componentCallbacksC0929c3.f3420M = fragmentState.f3354o;
                }
            }
            ComponentCallbacksC0929c componentCallbacksC0929c4 = this.f3515c;
            if (componentCallbacksC0929c4.f3420M) {
                return;
            }
            componentCallbacksC0929c4.f3419L = true;
        } catch (BadParcelableException e10) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + m4764k(), e10);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m4769p() {
        if (FragmentManager.m4349N0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f3515c);
        }
        View viewM4598F = this.f3515c.m4598F();
        if (viewM4598F != null && m4765l(viewM4598F)) {
            boolean zRequestFocus = viewM4598F.requestFocus();
            if (FragmentManager.m4349N0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(viewM4598F);
                sb2.append(" ");
                sb2.append(zRequestFocus ? "succeeded" : "failed");
                sb2.append(" on Fragment ");
                sb2.append(this.f3515c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f3515c.f3418K.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        this.f3515c.m4633R1(null);
        this.f3515c.m4723z1();
        this.f3513a.m4746i(this.f3515c, false);
        this.f3514b.m23261B(this.f3515c.f3443f, null);
        ComponentCallbacksC0929c componentCallbacksC0929c = this.f3515c;
        componentCallbacksC0929c.f3436b = null;
        componentCallbacksC0929c.f3438c = null;
        componentCallbacksC0929c.f3440d = null;
    }

    @NonNull
    /* JADX INFO: renamed from: q */
    public Bundle m4770q() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        ComponentCallbacksC0929c componentCallbacksC0929c = this.f3515c;
        if (componentCallbacksC0929c.f3434a == -1 && (bundle = componentCallbacksC0929c.f3436b) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new FragmentState(this.f3515c));
        if (this.f3515c.f3434a > 0) {
            Bundle bundle3 = new Bundle();
            this.f3515c.m4585A1(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f3513a.m4747j(this.f3515c, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.f3515c.f3433Z.m22361e(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleM4449p1 = this.f3515c.f3461x.m4449p1();
            if (!bundleM4449p1.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleM4449p1);
            }
            if (this.f3515c.f3418K != null) {
                m4771r();
            }
            SparseArray<Parcelable> sparseArray = this.f3515c.f3438c;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = this.f3515c.f3440d;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = this.f3515c.f3444g;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: r */
    public void m4771r() {
        if (this.f3515c.f3418K == null) {
            return;
        }
        if (FragmentManager.m4349N0(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.f3515c + " with view " + this.f3515c.f3418K);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f3515c.f3418K.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f3515c.f3438c = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f3515c.f3430W.m23345f(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f3515c.f3440d = bundle;
    }

    /* JADX INFO: renamed from: s */
    public void m4772s(int i10) {
        this.f3517e = i10;
    }

    /* JADX INFO: renamed from: t */
    public void m4773t() {
        if (FragmentManager.m4349N0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f3515c);
        }
        this.f3515c.m4588B1();
        this.f3513a.m4748k(this.f3515c, false);
    }

    /* JADX INFO: renamed from: u */
    public void m4774u() {
        if (FragmentManager.m4349N0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f3515c);
        }
        this.f3515c.m4591C1();
        this.f3513a.m4749l(this.f3515c, false);
    }

    public C0933g(@NonNull C0932f c0932f, @NonNull C4812g0 c4812g0, @NonNull ClassLoader classLoader, @NonNull C0931e c0931e, @NonNull Bundle bundle) {
        this.f3513a = c0932f;
        this.f3514b = c4812g0;
        ComponentCallbacksC0929c componentCallbacksC0929cM4500a = ((FragmentState) bundle.getParcelable("state")).m4500a(c0931e, classLoader);
        this.f3515c = componentCallbacksC0929cM4500a;
        componentCallbacksC0929cM4500a.f3436b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        componentCallbacksC0929cM4500a.m4625O1(bundle2);
        if (FragmentManager.m4349N0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + componentCallbacksC0929cM4500a);
        }
    }

    public C0933g(@NonNull C0932f c0932f, @NonNull C4812g0 c4812g0, @NonNull ComponentCallbacksC0929c componentCallbacksC0929c, @NonNull Bundle bundle) {
        this.f3513a = c0932f;
        this.f3514b = c4812g0;
        this.f3515c = componentCallbacksC0929c;
        componentCallbacksC0929c.f3438c = null;
        componentCallbacksC0929c.f3440d = null;
        componentCallbacksC0929c.f3458u = 0;
        componentCallbacksC0929c.f3454q = false;
        componentCallbacksC0929c.f3449l = false;
        ComponentCallbacksC0929c componentCallbacksC0929c2 = componentCallbacksC0929c.f3445h;
        componentCallbacksC0929c.f3446i = componentCallbacksC0929c2 != null ? componentCallbacksC0929c2.f3443f : null;
        componentCallbacksC0929c.f3445h = null;
        componentCallbacksC0929c.f3436b = bundle;
        componentCallbacksC0929c.f3444g = bundle.getBundle("arguments");
    }
}
