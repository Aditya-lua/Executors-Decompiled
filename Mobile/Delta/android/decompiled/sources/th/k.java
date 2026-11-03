package th;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import cj.p;
import com.roblox.client.components.RobloxToolbar;
import e4.q;
import rg.j0;
import rg.m0;
import rg.n0;
import rg.q0;
import rg.t0;
import rg.y1;
import ug.c0;

/* JADX INFO: loaded from: classes2.dex */
public class k extends y1 {
    public boolean C0 = false;
    public boolean D0 = false;
    public boolean E0 = false;
    public TextView F0;
    public FrameLayout G0;
    public ImageView H0;
    public bk.d I0;
    public bk.d J0;
    public bk.d K0;
    public RobloxToolbar.c L0;

    public class a implements ti.h.d {
        public a() {
        }

        @Override // ti.h.d
        public void a(boolean z10, int i10) {
            k.this.o3();
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32367a;

        static {
            int[] iArr = new int[ml.a.values().length];
            f32367a = iArr;
            try {
                iArr[ml.a.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32367a[ml.a.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class c implements bk.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f32368a;

        public c(Context context) {
            this.f32368a = context.getResources().getColor(j0.f30386l);
        }

        @Override // bk.d
        public int a(ml.a aVar) {
            if (b.f32367a[aVar.ordinal()] != 1) {
                return this.f32368a;
            }
            return -1;
        }
    }

    public static class d implements bk.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f32369a;
        public final int b;

        public d(Context context) {
            this.f32369a = context.getResources().getColor(j0.f30385k);
            this.b = context.getResources().getColor(j0.f30383i);
        }

        @Override // bk.d
        public int a(ml.a aVar) {
            return b.f32367a[aVar.ordinal()] != 1 ? this.f32369a : this.b;
        }
    }

    public static class e implements bk.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f32370a;
        public final int b;

        public e(Context context) {
            this.f32370a = context.getResources().getColor(j0.f30387m);
            this.b = context.getResources().getColor(j0.f30380f);
        }

        @Override // bk.d
        public int a(ml.a aVar) {
            return b.f32367a[aVar.ordinal()] != 1 ? this.f32370a : this.b;
        }
    }

    private void j3() {
        p().l1().a1();
    }

    private void m3() {
        ti.h.e().m(new a(), new ci.h());
    }

    private void n3(LayoutInflater layoutInflater) {
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(n0.F, this.f30700o0);
        frameLayout.setVisibility(0);
        ImageView imageView = (ImageView) frameLayout.findViewById(m0.f30447k);
        this.H0 = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: th.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f32365a.l3(view);
            }
        });
        this.F0 = (TextView) frameLayout.findViewById(m0.f30461r);
        this.G0 = (FrameLayout) frameLayout.findViewById(m0.f30463s);
    }

    private void p3(ml.a aVar) {
        if (!rh.h.a().E0()) {
            this.G0.setBackgroundColor(this.D0 ? this.J0.a(aVar) : this.I0.a(aVar));
            this.F0.setTextColor(this.K0.a(aVar));
            this.H0.setImageResource(this.L0.a(aVar));
            return;
        }
        FrameLayout frameLayout = this.G0;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(this.D0 ? this.J0.a(aVar) : this.I0.a(aVar));
        }
        TextView textView = this.F0;
        if (textView != null) {
            textView.setTextColor(this.K0.a(aVar));
        }
        ImageView imageView = this.H0;
        if (imageView != null) {
            imageView.setImageResource(this.L0.a(aVar));
        }
    }

    @Override // rg.y1
    public String F2() {
        if (this.D0) {
            return "buildersClub";
        }
        return this.C0 ? "robux" : super.F2();
    }

    @Override // rg.y1, androidx.fragment.app.c
    public View J0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TextView textView;
        View viewJ0 = super.J0(layoutInflater, viewGroup, bundle);
        this.I0 = new e(w());
        this.J0 = new d(w());
        this.K0 = new c(w());
        this.L0 = new RobloxToolbar.c();
        if (rh.h.a().E0()) {
            Bundle bundleT = t();
            if (bundleT != null) {
                this.C0 = bundleT.getBoolean("showRobux", false);
                this.D0 = bundleT.getBoolean("showPremium", false);
                this.E0 = bundleT.getBoolean("hideNativeHeader", false);
            }
            if (!this.E0) {
                n3(layoutInflater);
            }
            if (this.C0) {
                o3();
                m3();
            } else if (this.D0 && (textView = this.F0) != null) {
                textView.setText(q0.f30592z);
            }
        } else {
            n3(layoutInflater);
            Bundle bundleT2 = t();
            if (bundleT2 != null) {
                if (bundleT2.getBoolean("showRobux", false)) {
                    this.C0 = true;
                    o3();
                    m3();
                } else if (bundleT2.getBoolean("showPremium", false)) {
                    this.D0 = true;
                    this.F0.setText(q0.f30592z);
                }
            }
        }
        p3(dk.c.c().g());
        return viewJ0;
    }

    @Override // rg.y1, androidx.fragment.app.c
    public void M0() {
        if (!ti.h.e().f() && (this.D0 || this.C0)) {
            t0.d(F2(), "close");
        }
        super.M0();
    }

    @Override // rg.y1
    public c0.b g3() {
        return c0.b.ROBUX_PREMIUM_FRAGMENT;
    }

    public final /* synthetic */ void k3(q qVar) {
        if (qVar == null || qVar.isFinishing() || qVar.isDestroyed()) {
            return;
        }
        if (this.D0) {
            j3();
        } else {
            m3();
        }
    }

    public final /* synthetic */ void l3(View view) {
        j3();
    }

    public void o3() {
        if (!rh.h.a().E0()) {
            if (this.C0 && p0()) {
                this.F0.setText(g0(q0.f30552l1, cj.q.a(dk.c.c().f())));
                return;
            }
            return;
        }
        if (this.C0 && p0() && this.F0 != null) {
            this.F0.setText(g0(q0.f30552l1, cj.q.a(dk.c.c().f())));
        }
    }

    @Override // rg.y1
    public void x2(p pVar) {
        super.x2(pVar);
        final q qVarP = p();
        if (qVarP != null) {
            qVarP.runOnUiThread(new Runnable() { // from class: th.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32364a.k3(qVarP);
                }
            });
        }
    }
}
