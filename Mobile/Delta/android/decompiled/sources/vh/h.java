package vh;

import android.content.Context;
import android.content.DialogInterface;
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
import vg.c0;

/* JADX INFO: loaded from: classes2.dex */
public class h extends com.roblox.client.c {

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public boolean f33215g1 = false;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public boolean f33216h1 = false;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public TextView f33217i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public FrameLayout f33218j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public ImageView f33219k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public dk.d f33220l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public dk.d f33221m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public dk.d f33222n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public RobloxToolbar.c f33223o1;

    public class a implements vi.h.d {
        public a() {
        }

        @Override // vi.h.d
        public void a(boolean z10, int i10) {
            h.this.P3();
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33225a;

        static {
            int[] iArr = new int[ol.a.values().length];
            f33225a = iArr;
            try {
                iArr[ol.a.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33225a[ol.a.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class c implements dk.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f33226a;

        public c(Context context) {
            this.f33226a = context.getResources().getColor(j0.f30783l);
        }

        @Override // dk.d
        public int a(ol.a aVar) {
            if (b.f33225a[aVar.ordinal()] != 1) {
                return this.f33226a;
            }
            return -1;
        }
    }

    public static class d implements dk.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f33227a;
        public final int b;

        public d(Context context) {
            this.f33227a = context.getResources().getColor(j0.f30782k);
            this.b = context.getResources().getColor(j0.f30780i);
        }

        @Override // dk.d
        public int a(ol.a aVar) {
            return b.f33225a[aVar.ordinal()] != 1 ? this.f33227a : this.b;
        }
    }

    public static class e implements dk.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f33228a;
        public final int b;

        public e(Context context) {
            this.f33228a = context.getResources().getColor(j0.f30784m);
            this.b = context.getResources().getColor(j0.f30777f);
        }

        @Override // dk.d
        public int a(ol.a aVar) {
            return b.f33225a[aVar.ordinal()] != 1 ? this.f33228a : this.b;
        }
    }

    @Override // com.roblox.client.c
    public c0.b I3() {
        return c0.b.ROBUX_PREMIUM_DIALOG_FRAGMENT;
    }

    @Override // com.roblox.client.c, androidx.fragment.app.c
    public View J0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewJ0 = super.J0(layoutInflater, viewGroup, bundle);
        this.f33220l1 = new e(x());
        this.f33221m1 = new d(x());
        this.f33222n1 = new c(x());
        this.f33223o1 = new RobloxToolbar.c();
        O3(layoutInflater);
        Bundle bundleT = t();
        if (bundleT != null) {
            if (bundleT.getBoolean("showRobux", false)) {
                this.f33215g1 = true;
                P3();
                N3();
            } else if (bundleT.getBoolean("showPremium", false)) {
                this.f33216h1 = true;
                this.f33217i1.setText(q0.f30987z);
            }
        }
        Q3(fk.c.c().g());
        return viewJ0;
    }

    public final /* synthetic */ void L3(q qVar) {
        if (qVar == null || qVar.isFinishing() || qVar.isDestroyed()) {
            return;
        }
        if (this.f33216h1) {
            e2();
        } else {
            N3();
        }
    }

    public final /* synthetic */ void M3(View view) {
        e2();
    }

    public final void N3() {
        vi.h.e().m(new a(), new ei.h());
    }

    public final void O3(LayoutInflater layoutInflater) {
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(n0.F, this.Q0);
        frameLayout.setVisibility(0);
        ImageView imageView = (ImageView) frameLayout.findViewById(m0.f30844k);
        this.f33219k1 = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: vh.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f33213a.M3(view);
            }
        });
        this.f33217i1 = (TextView) frameLayout.findViewById(m0.f30858r);
        this.f33218j1 = (FrameLayout) frameLayout.findViewById(m0.f30860s);
    }

    public void P3() {
        if (this.f33215g1 && p0()) {
            this.f33217i1.setText(g0(q0.f30947l1, ej.l.a(fk.c.c().f())));
        }
    }

    public final void Q3(ol.a aVar) {
        this.f33218j1.setBackgroundColor(this.f33216h1 ? this.f33221m1.a(aVar) : this.f33220l1.a(aVar));
        this.f33217i1.setTextColor(this.f33222n1.a(aVar));
        this.f33219k1.setImageResource(this.f33223o1.a(aVar));
    }

    @Override // com.roblox.client.c
    public void Y2(ej.k kVar) {
        super.Y2(kVar);
        final q qVarP = p();
        if (qVarP != null) {
            qVarP.runOnUiThread(new Runnable() { // from class: vh.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33214a.L3(qVarP);
                }
            });
        }
    }

    @Override // com.roblox.client.c
    public String c3() {
        if (this.f33216h1) {
            return "buildersClub";
        }
        return this.f33215g1 ? "robux" : super.c3();
    }

    @Override // e4.k, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (vi.h.e().f()) {
            return;
        }
        if (this.f33216h1 || this.f33215g1) {
            t0.d(c3(), "close");
        }
    }

    @Override // com.roblox.client.c, sg.x0, dk.e.b
    public void u(ol.a aVar) {
        super.u(aVar);
        Q3(aVar);
    }
}
