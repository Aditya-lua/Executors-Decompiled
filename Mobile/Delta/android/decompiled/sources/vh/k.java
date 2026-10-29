package vh;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.roblox.client.components.RobloxToolbar;
import e4.q;
import sg.j0;
import sg.m0;
import sg.n0;
import sg.q0;
import sg.t0;
import sg.y1;
import vg.c0;

/* JADX INFO: loaded from: classes2.dex */
public class k extends y1 {
    public boolean C0 = false;
    public boolean D0 = false;
    public boolean E0 = false;
    public TextView F0;
    public FrameLayout G0;
    public ImageView H0;
    public dk.d I0;
    public dk.d J0;
    public dk.d K0;
    public RobloxToolbar.c L0;

    public class a implements vi.h.d {
        public a() {
        }

        @Override // vi.h.d
        public void a(boolean z10, int i10) {
            k.this.o3();
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33232a;

        static {
            int[] iArr = new int[ol.a.values().length];
            f33232a = iArr;
            try {
                iArr[ol.a.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33232a[ol.a.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class c implements dk.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f33233a;

        public c(Context context) {
            this.f33233a = context.getResources().getColor(j0.f30783l);
        }

        @Override // dk.d
        public int a(ol.a aVar) {
            if (b.f33232a[aVar.ordinal()] != 1) {
                return this.f33233a;
            }
            return -1;
        }
    }

    public static class d implements dk.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f33234a;
        public final int b;

        public d(Context context) {
            this.f33234a = context.getResources().getColor(j0.f30782k);
            this.b = context.getResources().getColor(j0.f30780i);
        }

        @Override // dk.d
        public int a(ol.a aVar) {
            return b.f33232a[aVar.ordinal()] != 1 ? this.f33234a : this.b;
        }
    }

    public static class e implements dk.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f33235a;
        public final int b;

        public e(Context context) {
            this.f33235a = context.getResources().getColor(j0.f30784m);
            this.b = context.getResources().getColor(j0.f30777f);
        }

        @Override // dk.d
        public int a(ol.a aVar) {
            return b.f33232a[aVar.ordinal()] != 1 ? this.f33235a : this.b;
        }
    }

    private void j3() {
        p().l1().a1();
    }

    private void m3() {
        vi.h.e().m(new a(), new ei.h());
    }

    private void n3(LayoutInflater layoutInflater) {
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(n0.F, this.f31095o0);
        frameLayout.setVisibility(0);
        ImageView imageView = (ImageView) frameLayout.findViewById(m0.f30844k);
        this.H0 = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: vh.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f33230a.l3(view);
            }
        });
        this.F0 = (TextView) frameLayout.findViewById(m0.f30858r);
        this.G0 = (FrameLayout) frameLayout.findViewById(m0.f30860s);
    }

    private void p3(ol.a aVar) {
        if (!th.h.a().A0()) {
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

    @Override // sg.y1
    public String F2() {
        if (this.D0) {
            return "buildersClub";
        }
        return this.C0 ? "robux" : super.F2();
    }

    @Override // sg.y1, androidx.fragment.app.c
    public View J0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TextView textView;
        View viewJ0 = super.J0(layoutInflater, viewGroup, bundle);
        this.I0 = new e(x());
        this.J0 = new d(x());
        this.K0 = new c(x());
        this.L0 = new RobloxToolbar.c();
        if (th.h.a().A0()) {
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
                textView.setText(q0.f30987z);
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
                    this.F0.setText(q0.f30987z);
                }
            }
        }
        p3(fk.c.c().g());
        return viewJ0;
    }

    @Override // sg.y1, androidx.fragment.app.c
    public void M0() {
        if (!vi.h.e().f() && (this.D0 || this.C0)) {
            t0.d(F2(), "close");
        }
        super.M0();
    }

    @Override // sg.y1
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
        if (!th.h.a().A0()) {
            if (this.C0 && p0()) {
                this.F0.setText(g0(q0.f30947l1, ej.l.a(fk.c.c().f())));
                return;
            }
            return;
        }
        if (this.C0 && p0() && this.F0 != null) {
            this.F0.setText(g0(q0.f30947l1, ej.l.a(fk.c.c().f())));
        }
    }

    @Override // sg.y1
    public void x2(ej.k kVar) {
        super.x2(kVar);
        final q qVarP = p();
        if (qVarP != null) {
            qVarP.runOnUiThread(new Runnable() { // from class: vh.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33229a.k3(qVarP);
                }
            });
        }
    }
}
