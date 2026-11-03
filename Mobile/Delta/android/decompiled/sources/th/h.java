package th;

import android.content.Context;
import android.content.DialogInterface;
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
import ug.c0;

/* JADX INFO: loaded from: classes2.dex */
public class h extends com.roblox.client.c {

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public boolean f32350g1 = false;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public boolean f32351h1 = false;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public TextView f32352i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public FrameLayout f32353j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public ImageView f32354k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public bk.d f32355l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public bk.d f32356m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public bk.d f32357n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public RobloxToolbar.c f32358o1;

    public class a implements ti.h.d {
        public a() {
        }

        @Override // ti.h.d
        public void a(boolean z10, int i10) {
            h.this.P3();
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32360a;

        static {
            int[] iArr = new int[ml.a.values().length];
            f32360a = iArr;
            try {
                iArr[ml.a.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32360a[ml.a.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class c implements bk.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f32361a;

        public c(Context context) {
            this.f32361a = context.getResources().getColor(j0.f30386l);
        }

        @Override // bk.d
        public int a(ml.a aVar) {
            if (b.f32360a[aVar.ordinal()] != 1) {
                return this.f32361a;
            }
            return -1;
        }
    }

    public static class d implements bk.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f32362a;
        public final int b;

        public d(Context context) {
            this.f32362a = context.getResources().getColor(j0.f30385k);
            this.b = context.getResources().getColor(j0.f30383i);
        }

        @Override // bk.d
        public int a(ml.a aVar) {
            return b.f32360a[aVar.ordinal()] != 1 ? this.f32362a : this.b;
        }
    }

    public static class e implements bk.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f32363a;
        public final int b;

        public e(Context context) {
            this.f32363a = context.getResources().getColor(j0.f30387m);
            this.b = context.getResources().getColor(j0.f30380f);
        }

        @Override // bk.d
        public int a(ml.a aVar) {
            return b.f32360a[aVar.ordinal()] != 1 ? this.f32363a : this.b;
        }
    }

    @Override // com.roblox.client.c
    public c0.b I3() {
        return c0.b.ROBUX_PREMIUM_DIALOG_FRAGMENT;
    }

    @Override // com.roblox.client.c, androidx.fragment.app.c
    public View J0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewJ0 = super.J0(layoutInflater, viewGroup, bundle);
        this.f32355l1 = new e(w());
        this.f32356m1 = new d(w());
        this.f32357n1 = new c(w());
        this.f32358o1 = new RobloxToolbar.c();
        O3(layoutInflater);
        Bundle bundleT = t();
        if (bundleT != null) {
            if (bundleT.getBoolean("showRobux", false)) {
                this.f32350g1 = true;
                P3();
                N3();
            } else if (bundleT.getBoolean("showPremium", false)) {
                this.f32351h1 = true;
                this.f32352i1.setText(q0.f30592z);
            }
        }
        Q3(dk.c.c().g());
        return viewJ0;
    }

    public final /* synthetic */ void L3(q qVar) {
        if (qVar == null || qVar.isFinishing() || qVar.isDestroyed()) {
            return;
        }
        if (this.f32351h1) {
            e2();
        } else {
            N3();
        }
    }

    public final /* synthetic */ void M3(View view) {
        e2();
    }

    public final void N3() {
        ti.h.e().m(new a(), new ci.h());
    }

    public final void O3(LayoutInflater layoutInflater) {
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(n0.F, this.Q0);
        frameLayout.setVisibility(0);
        ImageView imageView = (ImageView) frameLayout.findViewById(m0.f30447k);
        this.f32354k1 = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: th.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f32348a.M3(view);
            }
        });
        this.f32352i1 = (TextView) frameLayout.findViewById(m0.f30461r);
        this.f32353j1 = (FrameLayout) frameLayout.findViewById(m0.f30463s);
    }

    public void P3() {
        if (this.f32350g1 && p0()) {
            this.f32352i1.setText(g0(q0.f30552l1, cj.q.a(dk.c.c().f())));
        }
    }

    public final void Q3(ml.a aVar) {
        this.f32353j1.setBackgroundColor(this.f32351h1 ? this.f32356m1.a(aVar) : this.f32355l1.a(aVar));
        this.f32352i1.setTextColor(this.f32357n1.a(aVar));
        this.f32354k1.setImageResource(this.f32358o1.a(aVar));
    }

    @Override // com.roblox.client.c
    public void Y2(p pVar) {
        super.Y2(pVar);
        final q qVarP = p();
        if (qVarP != null) {
            qVarP.runOnUiThread(new Runnable() { // from class: th.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32349a.L3(qVarP);
                }
            });
        }
    }

    @Override // com.roblox.client.c, rg.x0, bk.e.b
    public void a0(ml.a aVar) {
        super.a0(aVar);
        Q3(aVar);
    }

    @Override // com.roblox.client.c
    public String c3() {
        if (this.f32351h1) {
            return "buildersClub";
        }
        return this.f32350g1 ? "robux" : super.c3();
    }

    @Override // e4.k, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (ti.h.e().f()) {
            return;
        }
        if (this.f32351h1 || this.f32350g1) {
            t0.d(c3(), "close");
        }
    }
}
