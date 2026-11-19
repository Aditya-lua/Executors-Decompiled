package di;

import android.content.Context;
import android.content.DialogInterface;
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
import com.roblox.client.components.RobloxToolbar;
import eh.v0;
import f4.v;
import mj.p;
import mj.q;

/* JADX INFO: loaded from: classes2.dex */
public class g extends com.roblox.client.c {

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public boolean f12441g1 = false;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public boolean f12442h1 = false;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public TextView f12443i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public FrameLayout f12444j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public ImageView f12445k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public lk.d f12446l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public lk.d f12447m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public lk.d f12448n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public RobloxToolbar.c f12449o1;

    public class a implements dj.h.d {
        public a() {
        }

        @Override // dj.h.d
        public void a(boolean z10, int i10) {
            g.this.P3();
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12451a;

        static {
            int[] iArr = new int[cm.a.values().length];
            f12451a = iArr;
            try {
                iArr[cm.a.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12451a[cm.a.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class c implements lk.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f12452a;

        public c(Context context) {
            this.f12452a = context.getResources().getColor(j0.f4088k);
        }

        @Override // lk.d
        public int a(cm.a aVar) {
            if (b.f12451a[aVar.ordinal()] != 1) {
                return this.f12452a;
            }
            return -1;
        }
    }

    public static class d implements lk.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f12453a;
        public final int b;

        public d(Context context) {
            this.f12453a = context.getResources().getColor(j0.f4087j);
            this.b = context.getResources().getColor(j0.f4085h);
        }

        @Override // lk.d
        public int a(cm.a aVar) {
            return b.f12451a[aVar.ordinal()] != 1 ? this.f12453a : this.b;
        }
    }

    public static class e implements lk.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f12454a;
        public final int b;

        public e(Context context) {
            this.f12454a = context.getResources().getColor(j0.f4089l);
            this.b = context.getResources().getColor(j0.f4083f);
        }

        @Override // lk.d
        public int a(cm.a aVar) {
            return b.f12451a[aVar.ordinal()] != 1 ? this.f12454a : this.b;
        }
    }

    @Override // com.roblox.client.c
    public v0.b I3() {
        return v0.b.ROBUX_PREMIUM_DIALOG_FRAGMENT;
    }

    @Override // com.roblox.client.c, f4.q
    public View J0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewJ0 = super.J0(layoutInflater, viewGroup, bundle);
        this.f12446l1 = new e(v());
        this.f12447m1 = new d(v());
        this.f12448n1 = new c(v());
        this.f12449o1 = new RobloxToolbar.c();
        O3(layoutInflater);
        Bundle bundleT = t();
        if (bundleT != null) {
            if (bundleT.getBoolean("showRobux", false)) {
                this.f12441g1 = true;
                P3();
                N3();
            } else if (bundleT.getBoolean("showPremium", false)) {
                this.f12442h1 = true;
                this.f12443i1.setText(q0.f4294z);
            }
        }
        Q3(nk.c.c().g());
        return viewJ0;
    }

    public final /* synthetic */ void L3(v vVar) {
        if (vVar == null || vVar.isFinishing() || vVar.isDestroyed()) {
            return;
        }
        if (this.f12442h1) {
            e2();
        } else {
            N3();
        }
    }

    public final /* synthetic */ void M3(View view) {
        e2();
    }

    public final void N3() {
        dj.h.e().m(new a(), new mi.h());
    }

    public final void O3(LayoutInflater layoutInflater) {
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(n0.F, this.Q0);
        frameLayout.setVisibility(0);
        ImageView imageView = (ImageView) frameLayout.findViewById(m0.f4148k);
        this.f12445k1 = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: di.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12439a.M3(view);
            }
        });
        this.f12443i1 = (TextView) frameLayout.findViewById(m0.f4162r);
        this.f12444j1 = (FrameLayout) frameLayout.findViewById(m0.f4164s);
    }

    public void P3() {
        if (this.f12441g1 && p0()) {
            this.f12443i1.setText(f0(q0.f4284v1, q.a(nk.c.c().f())));
        }
    }

    public final void Q3(cm.a aVar) {
        this.f12444j1.setBackgroundColor(this.f12442h1 ? this.f12447m1.a(aVar) : this.f12446l1.a(aVar));
        this.f12443i1.setTextColor(this.f12448n1.a(aVar));
        this.f12445k1.setImageResource(this.f12449o1.a(aVar));
    }

    @Override // com.roblox.client.c
    public void Y2(p pVar) {
        super.Y2(pVar);
        final v vVarP = p();
        if (vVarP != null) {
            vVarP.runOnUiThread(new Runnable() { // from class: di.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12440a.L3(vVarP);
                }
            });
        }
    }

    @Override // com.roblox.client.c
    public String c3() {
        if (this.f12442h1) {
            return "buildersClub";
        }
        return this.f12441g1 ? "robux" : super.c3();
    }

    @Override // com.roblox.client.c, bh.x0, lk.e.b
    public void g0(cm.a aVar) {
        super.g0(aVar);
        Q3(aVar);
    }

    @Override // f4.o, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (dj.h.e().f()) {
            return;
        }
        if (this.f12442h1 || this.f12441g1) {
            t0.d(c3(), "close");
        }
    }
}
