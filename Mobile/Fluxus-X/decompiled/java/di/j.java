package di;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import bh.j0;
import bh.m0;
import bh.n0;
import bh.q0;
import bh.t0;
import bh.y1;
import com.roblox.client.components.RobloxToolbar;
import eh.v0;
import f4.v;
import mj.p;
import mj.q;

/* JADX INFO: loaded from: classes2.dex */
public class j extends y1 {
    public boolean C0 = false;
    public boolean D0 = false;
    public boolean E0 = false;
    public TextView F0;
    public FrameLayout G0;
    public ImageView H0;
    public lk.d I0;
    public lk.d J0;
    public lk.d K0;
    public RobloxToolbar.c L0;

    public class a implements dj.h.d {
        public a() {
        }

        @Override // dj.h.d
        public void a(boolean z10, int i10) {
            j.this.o3();
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12458a;

        static {
            int[] iArr = new int[cm.a.values().length];
            f12458a = iArr;
            try {
                iArr[cm.a.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12458a[cm.a.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class c implements lk.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f12459a;

        public c(Context context) {
            this.f12459a = context.getResources().getColor(j0.f4088k);
        }

        @Override // lk.d
        public int a(cm.a aVar) {
            if (b.f12458a[aVar.ordinal()] != 1) {
                return this.f12459a;
            }
            return -1;
        }
    }

    public static class d implements lk.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f12460a;
        public final int b;

        public d(Context context) {
            this.f12460a = context.getResources().getColor(j0.f4087j);
            this.b = context.getResources().getColor(j0.f4085h);
        }

        @Override // lk.d
        public int a(cm.a aVar) {
            return b.f12458a[aVar.ordinal()] != 1 ? this.f12460a : this.b;
        }
    }

    public static class e implements lk.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f12461a;
        public final int b;

        public e(Context context) {
            this.f12461a = context.getResources().getColor(j0.f4089l);
            this.b = context.getResources().getColor(j0.f4083f);
        }

        @Override // lk.d
        public int a(cm.a aVar) {
            return b.f12458a[aVar.ordinal()] != 1 ? this.f12461a : this.b;
        }
    }

    private void j3() {
        p().l1().a1();
    }

    private void m3() {
        dj.h.e().m(new a(), new mi.h());
    }

    private void n3(LayoutInflater layoutInflater) {
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(n0.F, this.f4401o0);
        frameLayout.setVisibility(0);
        ImageView imageView = (ImageView) frameLayout.findViewById(m0.f4148k);
        this.H0 = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: di.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12456a.l3(view);
            }
        });
        this.F0 = (TextView) frameLayout.findViewById(m0.f4162r);
        this.G0 = (FrameLayout) frameLayout.findViewById(m0.f4164s);
    }

    private void p3(cm.a aVar) {
        if (!bi.h.a().I0()) {
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

    @Override // bh.y1
    public String F2() {
        if (this.D0) {
            return "buildersClub";
        }
        return this.C0 ? "robux" : super.F2();
    }

    @Override // bh.y1, f4.q
    public View J0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TextView textView;
        View viewJ0 = super.J0(layoutInflater, viewGroup, bundle);
        this.I0 = new e(v());
        this.J0 = new d(v());
        this.K0 = new c(v());
        this.L0 = new RobloxToolbar.c();
        if (bi.h.a().I0()) {
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
                textView.setText(q0.f4294z);
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
                    this.F0.setText(q0.f4294z);
                }
            }
        }
        p3(nk.c.c().g());
        return viewJ0;
    }

    @Override // bh.y1, f4.q
    public void M0() {
        if (!dj.h.e().f() && (this.D0 || this.C0)) {
            t0.d(F2(), "close");
        }
        super.M0();
    }

    @Override // bh.y1
    public v0.b g3() {
        return v0.b.ROBUX_PREMIUM_FRAGMENT;
    }

    public final /* synthetic */ void k3(v vVar) {
        if (vVar == null || vVar.isFinishing() || vVar.isDestroyed()) {
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
        if (!bi.h.a().I0()) {
            if (this.C0 && p0()) {
                this.F0.setText(f0(q0.f4284v1, q.a(nk.c.c().f())));
                return;
            }
            return;
        }
        if (this.C0 && p0() && this.F0 != null) {
            this.F0.setText(f0(q0.f4284v1, q.a(nk.c.c().f())));
        }
    }

    @Override // bh.y1
    public void x2(p pVar) {
        super.x2(pVar);
        final v vVarP = p();
        if (vVarP != null) {
            vVarP.runOnUiThread(new Runnable() { // from class: di.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12455a.k3(vVarP);
                }
            });
        }
    }
}
