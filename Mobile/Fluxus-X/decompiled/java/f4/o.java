package f4;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.p000lifecycle.C0795e1;

/* JADX INFO: loaded from: classes.dex */
public class o extends q implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Handler f15447f0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f15456o0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Dialog f15458q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f15459r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f15460s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f15461t0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Runnable f15448g0 = new a();

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public DialogInterface.OnCancelListener f15449h0 = new b();

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public DialogInterface.OnDismissListener f15450i0 = new c();

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f15451j0 = 0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f15452k0 = 0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f15453l0 = true;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f15454m0 = true;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f15455n0 = -1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public androidx.p000lifecycle.e0<androidx.p000lifecycle.s> f15457p0 = new d();

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f15462u0 = false;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.f15450i0.onDismiss(o.this.f15458q0);
        }
    }

    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (o.this.f15458q0 != null) {
                o oVar = o.this;
                oVar.onCancel(oVar.f15458q0);
            }
        }
    }

    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (o.this.f15458q0 != null) {
                o oVar = o.this;
                oVar.onDismiss(oVar.f15458q0);
            }
        }
    }

    public class d implements androidx.p000lifecycle.e0<androidx.p000lifecycle.s> {
        public d() {
        }

        @Override // androidx.p000lifecycle.e0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(androidx.p000lifecycle.s sVar) {
            if (sVar == null || !o.this.f15454m0) {
                return;
            }
            View viewJ1 = o.this.J1();
            if (viewJ1.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (o.this.f15458q0 != null) {
                if (k0.N0(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + o.this.f15458q0);
                }
                o.this.f15458q0.setContentView(viewJ1);
            }
        }
    }

    public class e extends x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x f15467a;

        public e(x xVar) {
            this.f15467a = xVar;
        }

        @Override // f4.x
        public View d(int i10) {
            return this.f15467a.e() ? this.f15467a.d(i10) : o.this.l2(i10);
        }

        @Override // f4.x
        public boolean e() {
            return this.f15467a.e() || o.this.m2();
        }
    }

    @Override // f4.q
    public void C0(@NonNull Context context) {
        super.C0(context);
        l0().j(this.f15457p0);
        if (this.f15461t0) {
            return;
        }
        this.f15460s0 = false;
    }

    @Override // f4.q
    public void F0(Bundle bundle) {
        super.F0(bundle);
        this.f15447f0 = new Handler();
        this.f15454m0 = this.A == 0;
        if (bundle != null) {
            this.f15451j0 = bundle.getInt("android:style", 0);
            this.f15452k0 = bundle.getInt("android:theme", 0);
            this.f15453l0 = bundle.getBoolean("android:cancelable", true);
            this.f15454m0 = bundle.getBoolean("android:showsDialog", this.f15454m0);
            this.f15455n0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // f4.q
    public void M0() {
        super.M0();
        Dialog dialog = this.f15458q0;
        if (dialog != null) {
            this.f15459r0 = true;
            dialog.setOnDismissListener(null);
            this.f15458q0.dismiss();
            if (!this.f15460s0) {
                onDismiss(this.f15458q0);
            }
            this.f15458q0 = null;
            this.f15462u0 = false;
        }
    }

    @Override // f4.q
    public void N0() {
        super.N0();
        if (!this.f15461t0 && !this.f15460s0) {
            this.f15460s0 = true;
        }
        l0().n(this.f15457p0);
    }

    @Override // f4.q
    @NonNull
    public LayoutInflater O0(Bundle bundle) {
        LayoutInflater layoutInflaterO0 = super.O0(bundle);
        if (this.f15454m0 && !this.f15456o0) {
            n2(bundle);
            if (k0.N0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f15458q0;
            if (dialog != null) {
                return layoutInflaterO0.cloneInContext(dialog.getContext());
            }
        } else if (k0.N0(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f15454m0) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return layoutInflaterO0;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return layoutInflaterO0;
    }

    @Override // f4.q
    public void b1(@NonNull Bundle bundle) {
        super.b1(bundle);
        Dialog dialog = this.f15458q0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i10 = this.f15451j0;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f15452k0;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.f15453l0;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.f15454m0;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.f15455n0;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // f4.q
    public void c1() {
        super.c1();
        Dialog dialog = this.f15458q0;
        if (dialog != null) {
            this.f15459r0 = false;
            dialog.show();
            View decorView = this.f15458q0.getWindow().getDecorView();
            androidx.p000lifecycle.View.b(decorView, this);
            C0795e1.a(decorView, this);
            e5.m.b(decorView, this);
        }
    }

    @Override // f4.q
    public void d1() {
        super.d1();
        Dialog dialog = this.f15458q0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void e2() {
        g2(false, false, false);
    }

    @Override // f4.q
    public void f1(Bundle bundle) {
        Bundle bundle2;
        super.f1(bundle);
        if (this.f15458q0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f15458q0.onRestoreInstanceState(bundle2);
    }

    public void f2() {
        g2(true, false, false);
    }

    public final void g2(boolean z10, boolean z11, boolean z12) {
        if (this.f15460s0) {
            return;
        }
        this.f15460s0 = true;
        this.f15461t0 = false;
        Dialog dialog = this.f15458q0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f15458q0.dismiss();
            if (!z11) {
                if (Looper.myLooper() == this.f15447f0.getLooper()) {
                    onDismiss(this.f15458q0);
                } else {
                    this.f15447f0.post(this.f15448g0);
                }
            }
        }
        this.f15459r0 = true;
        if (this.f15455n0 >= 0) {
            if (z12) {
                L().e1(this.f15455n0, 1);
            } else {
                L().b1(this.f15455n0, 1, z10);
            }
            this.f15455n0 = -1;
            return;
        }
        t0 t0VarR = L().r();
        t0VarR.s(true);
        t0VarR.m(this);
        if (z12) {
            t0VarR.i();
        } else if (z10) {
            t0VarR.h();
        } else {
            t0VarR.g();
        }
    }

    public Dialog h2() {
        return this.f15458q0;
    }

    public boolean i2() {
        return this.f15454m0;
    }

    public int j2() {
        return this.f15452k0;
    }

    @Override // f4.q
    @NonNull
    public x k() {
        return new e(super.k());
    }

    @NonNull
    public Dialog k2(Bundle bundle) {
        if (k0.N0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new e.w(I1(), j2());
    }

    public View l2(int i10) {
        Dialog dialog = this.f15458q0;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    @Override // f4.q
    public void m1(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.m1(layoutInflater, viewGroup, bundle);
        if (this.K != null || this.f15458q0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f15458q0.onRestoreInstanceState(bundle2);
    }

    public boolean m2() {
        return this.f15462u0;
    }

    public final void n2(Bundle bundle) {
        if (this.f15454m0 && !this.f15462u0) {
            try {
                this.f15456o0 = true;
                Dialog dialogK2 = k2(bundle);
                this.f15458q0 = dialogK2;
                if (this.f15454m0) {
                    s2(dialogK2, this.f15451j0);
                    Context contextV = v();
                    if (contextV instanceof Activity) {
                        this.f15458q0.setOwnerActivity((Activity) contextV);
                    }
                    this.f15458q0.setCancelable(this.f15453l0);
                    this.f15458q0.setOnCancelListener(this.f15449h0);
                    this.f15458q0.setOnDismissListener(this.f15450i0);
                    this.f15462u0 = true;
                } else {
                    this.f15458q0 = null;
                }
            } finally {
                this.f15456o0 = false;
            }
        }
    }

    @NonNull
    public final Dialog o2() {
        Dialog dialogH2 = h2();
        if (dialogH2 != null) {
            return dialogH2;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void onCancel(@NonNull DialogInterface dialogInterface) {
    }

    public void onDismiss(@NonNull DialogInterface dialogInterface) {
        if (this.f15459r0) {
            return;
        }
        if (k0.N0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        g2(true, true, false);
    }

    public void p2(boolean z10) {
        this.f15453l0 = z10;
        Dialog dialog = this.f15458q0;
        if (dialog != null) {
            dialog.setCancelable(z10);
        }
    }

    public void q2(boolean z10) {
        this.f15454m0 = z10;
    }

    public void r2(int i10, int i11) {
        if (k0.N0(2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to " + i10 + ", " + i11);
        }
        this.f15451j0 = i10;
        if (i10 == 2 || i10 == 3) {
            this.f15452k0 = R.style.Theme.Panel;
        }
        if (i11 != 0) {
            this.f15452k0 = i11;
        }
    }

    public void s2(@NonNull Dialog dialog, int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void t2(@NonNull k0 k0Var, String str) {
        this.f15460s0 = false;
        this.f15461t0 = true;
        t0 t0VarR = k0Var.r();
        t0VarR.s(true);
        t0VarR.d(this, str);
        t0VarR.g();
    }

    @Override // f4.q
    @Deprecated
    public void z0(Bundle bundle) {
        super.z0(bundle);
    }
}
