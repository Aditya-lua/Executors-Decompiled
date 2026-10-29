package p093e4;

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
import androidx.fragment.app.AbstractC0934h;
import androidx.fragment.app.ComponentCallbacksC0929c;
import androidx.fragment.app.FragmentManager;
import androidx.p616lifecycle.C14302e1;
import androidx.p616lifecycle.InterfaceC0952e0;
import androidx.p616lifecycle.InterfaceC0980s;
import p068d5.C4449m;
import p088e.DialogC4736w;

/* JADX INFO: renamed from: e4.k */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC4819k extends ComponentCallbacksC0929c implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: f0 */
    public Handler f19462f0;

    /* JADX INFO: renamed from: o0 */
    public boolean f19471o0;

    /* JADX INFO: renamed from: q0 */
    public Dialog f19473q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f19474r0;

    /* JADX INFO: renamed from: s0 */
    public boolean f19475s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f19476t0;

    /* JADX INFO: renamed from: g0 */
    public Runnable f19463g0 = new a();

    /* JADX INFO: renamed from: h0 */
    public DialogInterface.OnCancelListener f19464h0 = new b();

    /* JADX INFO: renamed from: i0 */
    public DialogInterface.OnDismissListener f19465i0 = new c();

    /* JADX INFO: renamed from: j0 */
    public int f19466j0 = 0;

    /* JADX INFO: renamed from: k0 */
    public int f19467k0 = 0;

    /* JADX INFO: renamed from: l0 */
    public boolean f19468l0 = true;

    /* JADX INFO: renamed from: m0 */
    public boolean f19469m0 = true;

    /* JADX INFO: renamed from: n0 */
    public int f19470n0 = -1;

    /* JADX INFO: renamed from: p0 */
    public InterfaceC0952e0<InterfaceC0980s> f19472p0 = new d();

    /* JADX INFO: renamed from: u0 */
    public boolean f19477u0 = false;

    /* JADX INFO: renamed from: e4.k$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DialogInterfaceOnCancelListenerC4819k.this.f19465i0.onDismiss(DialogInterfaceOnCancelListenerC4819k.this.f19473q0);
        }
    }

    /* JADX INFO: renamed from: e4.k$b */
    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC4819k.this.f19473q0 != null) {
                DialogInterfaceOnCancelListenerC4819k dialogInterfaceOnCancelListenerC4819k = DialogInterfaceOnCancelListenerC4819k.this;
                dialogInterfaceOnCancelListenerC4819k.onCancel(dialogInterfaceOnCancelListenerC4819k.f19473q0);
            }
        }
    }

    /* JADX INFO: renamed from: e4.k$c */
    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC4819k.this.f19473q0 != null) {
                DialogInterfaceOnCancelListenerC4819k dialogInterfaceOnCancelListenerC4819k = DialogInterfaceOnCancelListenerC4819k.this;
                dialogInterfaceOnCancelListenerC4819k.onDismiss(dialogInterfaceOnCancelListenerC4819k.f19473q0);
            }
        }
    }

    /* JADX INFO: renamed from: e4.k$d */
    public class d implements InterfaceC0952e0<InterfaceC0980s> {
        public d() {
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)V */
        @Override // androidx.p616lifecycle.InterfaceC0952e0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo4884a(InterfaceC0980s interfaceC0980s) {
            if (interfaceC0980s == null || !DialogInterfaceOnCancelListenerC4819k.this.f19469m0) {
                return;
            }
            View viewM4611J1 = DialogInterfaceOnCancelListenerC4819k.this.m4611J1();
            if (viewM4611J1.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (DialogInterfaceOnCancelListenerC4819k.this.f19473q0 != null) {
                if (FragmentManager.m4349N0(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + DialogInterfaceOnCancelListenerC4819k.this.f19473q0);
                }
                DialogInterfaceOnCancelListenerC4819k.this.f19473q0.setContentView(viewM4611J1);
            }
        }
    }

    /* JADX INFO: renamed from: e4.k$e */
    public class e extends AbstractC4833r {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC4833r f19482a;

        public e(AbstractC4833r abstractC4833r) {
            this.f19482a = abstractC4833r;
        }

        @Override // p093e4.AbstractC4833r
        /* JADX INFO: renamed from: d */
        public View mo4728d(int i10) {
            return this.f19482a.mo4729e() ? this.f19482a.mo4728d(i10) : DialogInterfaceOnCancelListenerC4819k.this.m23331l2(i10);
        }

        @Override // p093e4.AbstractC4833r
        /* JADX INFO: renamed from: e */
        public boolean mo4729e() {
            return this.f19482a.mo4729e() || DialogInterfaceOnCancelListenerC4819k.this.m23332m2();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: C0 */
    public void mo4590C0(@NonNull Context context) {
        super.mo4590C0(context);
        m4683l0().m4858j(this.f19472p0);
        if (this.f19476t0) {
            return;
        }
        this.f19475s0 = false;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: F0 */
    public void mo4599F0(Bundle bundle) {
        super.mo4599F0(bundle);
        this.f19462f0 = new Handler();
        this.f19469m0 = this.f3408A == 0;
        if (bundle != null) {
            this.f19466j0 = bundle.getInt("android:style", 0);
            this.f19467k0 = bundle.getInt("android:theme", 0);
            this.f19468l0 = bundle.getBoolean("android:cancelable", true);
            this.f19469m0 = bundle.getBoolean("android:showsDialog", this.f19469m0);
            this.f19470n0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: M0 */
    public void mo4618M0() {
        super.mo4618M0();
        Dialog dialog = this.f19473q0;
        if (dialog != null) {
            this.f19474r0 = true;
            dialog.setOnDismissListener(null);
            this.f19473q0.dismiss();
            if (!this.f19475s0) {
                onDismiss(this.f19473q0);
            }
            this.f19473q0 = null;
            this.f19477u0 = false;
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: N0 */
    public void mo4621N0() {
        super.mo4621N0();
        if (!this.f19476t0 && !this.f19475s0) {
            this.f19475s0 = true;
        }
        m4683l0().mo4862n(this.f19472p0);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    @NonNull
    /* JADX INFO: renamed from: O0 */
    public LayoutInflater mo4624O0(Bundle bundle) {
        LayoutInflater layoutInflaterMo4624O0 = super.mo4624O0(bundle);
        if (this.f19469m0 && !this.f19471o0) {
            m23333n2(bundle);
            if (FragmentManager.m4349N0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f19473q0;
            if (dialog != null) {
                return layoutInflaterMo4624O0.cloneInContext(dialog.getContext());
            }
        } else if (FragmentManager.m4349N0(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f19469m0) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return layoutInflaterMo4624O0;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return layoutInflaterMo4624O0;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: b1 */
    public void mo4661b1(@NonNull Bundle bundle) {
        super.mo4661b1(bundle);
        Dialog dialog = this.f19473q0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i10 = this.f19466j0;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f19467k0;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.f19468l0;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.f19469m0;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.f19470n0;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: c1 */
    public void mo4663c1() {
        super.mo4663c1();
        Dialog dialog = this.f19473q0;
        if (dialog != null) {
            this.f19474r0 = false;
            dialog.show();
            View decorView = this.f19473q0.getWindow().getDecorView();
            androidx.p616lifecycle.View.m4902b(decorView, this);
            C14302e1.m4903a(decorView, this);
            C4449m.m22373b(decorView, this);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: d1 */
    public void mo4665d1() {
        super.mo4665d1();
        Dialog dialog = this.f19473q0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    /* JADX INFO: renamed from: e2 */
    public void mo12190e2() {
        m23327g2(false, false, false);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: f1 */
    public void mo4668f1(Bundle bundle) {
        Bundle bundle2;
        super.mo4668f1(bundle);
        if (this.f19473q0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f19473q0.onRestoreInstanceState(bundle2);
    }

    /* JADX INFO: renamed from: f2 */
    public void m23326f2() {
        m23327g2(true, false, false);
    }

    /* JADX INFO: renamed from: g2 */
    public final void m23327g2(boolean z10, boolean z11, boolean z12) {
        if (this.f19475s0) {
            return;
        }
        this.f19475s0 = true;
        this.f19476t0 = false;
        Dialog dialog = this.f19473q0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f19473q0.dismiss();
            if (!z11) {
                if (Looper.myLooper() == this.f19462f0.getLooper()) {
                    onDismiss(this.f19473q0);
                } else {
                    this.f19462f0.post(this.f19463g0);
                }
            }
        }
        this.f19474r0 = true;
        if (this.f19470n0 >= 0) {
            if (z12) {
                m4617M().m4424e1(this.f19470n0, 1);
            } else {
                m4617M().m4418b1(this.f19470n0, 1, z10);
            }
            this.f19470n0 = -1;
            return;
        }
        AbstractC0934h abstractC0934hM4452r = m4617M().m4452r();
        abstractC0934hM4452r.m4786s(true);
        abstractC0934hM4452r.mo4513m(this);
        if (z12) {
            abstractC0934hM4452r.mo4510i();
        } else if (z10) {
            abstractC0934hM4452r.mo4509h();
        } else {
            abstractC0934hM4452r.mo4508g();
        }
    }

    /* JADX INFO: renamed from: h2 */
    public Dialog m23328h2() {
        return this.f19473q0;
    }

    /* JADX INFO: renamed from: i2 */
    public boolean m23329i2() {
        return this.f19469m0;
    }

    /* JADX INFO: renamed from: j2 */
    public int m23330j2() {
        return this.f19467k0;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    @NonNull
    /* JADX INFO: renamed from: k */
    public AbstractC4833r mo4679k() {
        return new e(super.mo4679k());
    }

    @NonNull
    /* JADX INFO: renamed from: k2 */
    public Dialog mo6459k2(Bundle bundle) {
        if (FragmentManager.m4349N0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new DialogC4736w(m4609I1(), m23330j2());
    }

    /* JADX INFO: renamed from: l2 */
    public View m23331l2(int i10) {
        Dialog dialog = this.f19473q0;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: m1 */
    public void mo4687m1(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.mo4687m1(layoutInflater, viewGroup, bundle);
        if (this.f3418K != null || this.f19473q0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f19473q0.onRestoreInstanceState(bundle2);
    }

    /* JADX INFO: renamed from: m2 */
    public boolean m23332m2() {
        return this.f19477u0;
    }

    /* JADX INFO: renamed from: n2 */
    public final void m23333n2(Bundle bundle) {
        if (this.f19469m0 && !this.f19477u0) {
            try {
                this.f19471o0 = true;
                Dialog dialogMo6459k2 = mo6459k2(bundle);
                this.f19473q0 = dialogMo6459k2;
                if (this.f19469m0) {
                    mo23338s2(dialogMo6459k2, this.f19466j0);
                    Context contextMo4715x = mo4715x();
                    if (contextMo4715x instanceof Activity) {
                        this.f19473q0.setOwnerActivity((Activity) contextMo4715x);
                    }
                    this.f19473q0.setCancelable(this.f19468l0);
                    this.f19473q0.setOnCancelListener(this.f19464h0);
                    this.f19473q0.setOnDismissListener(this.f19465i0);
                    this.f19477u0 = true;
                } else {
                    this.f19473q0 = null;
                }
            } finally {
                this.f19471o0 = false;
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: o2 */
    public final Dialog m23334o2() {
        Dialog dialogM23328h2 = m23328h2();
        if (dialogM23328h2 != null) {
            return dialogM23328h2;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void onCancel(@NonNull DialogInterface dialogInterface) {
    }

    public void onDismiss(@NonNull DialogInterface dialogInterface) {
        if (this.f19474r0) {
            return;
        }
        if (FragmentManager.m4349N0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        m23327g2(true, true, false);
    }

    /* JADX INFO: renamed from: p2 */
    public void m23335p2(boolean z10) {
        this.f19468l0 = z10;
        Dialog dialog = this.f19473q0;
        if (dialog != null) {
            dialog.setCancelable(z10);
        }
    }

    /* JADX INFO: renamed from: q2 */
    public void m23336q2(boolean z10) {
        this.f19469m0 = z10;
    }

    /* JADX INFO: renamed from: r2 */
    public void m23337r2(int i10, int i11) {
        if (FragmentManager.m4349N0(2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to " + i10 + ", " + i11);
        }
        this.f19466j0 = i10;
        if (i10 == 2 || i10 == 3) {
            this.f19467k0 = R.style.Theme.Panel;
        }
        if (i11 != 0) {
            this.f19467k0 = i11;
        }
    }

    /* JADX INFO: renamed from: s2 */
    public void mo23338s2(@NonNull Dialog dialog, int i10) {
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

    /* JADX INFO: renamed from: t2 */
    public void mo23339t2(@NonNull FragmentManager fragmentManager, String str) {
        this.f19475s0 = false;
        this.f19476t0 = true;
        AbstractC0934h abstractC0934hM4452r = fragmentManager.m4452r();
        abstractC0934hM4452r.m4786s(true);
        abstractC0934hM4452r.m4777d(this, str);
        abstractC0934hM4452r.mo4508g();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    @Deprecated
    /* JADX INFO: renamed from: z0 */
    public void mo4722z0(Bundle bundle) {
        super.mo4722z0(bundle);
    }
}
