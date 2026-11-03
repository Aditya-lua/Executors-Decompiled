package uh;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;

/* JADX INFO: loaded from: classes2.dex */
public class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f33073a;
    public Rect b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Rect f33074c;

    public class a implements androidx.p000lifecycle.e0<Rect> {
        public a() {
        }

        @Override // androidx.p000lifecycle.e0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Rect rect) {
            ek.q.b("SafeAreaInsetsObserver", String.format("New cutout insets: %s", String.valueOf(rect)));
            y0.this.b = rect;
            y0.this.h();
        }
    }

    public class b implements androidx.p000lifecycle.e0<Rect> {
        public b() {
        }

        @Override // androidx.p000lifecycle.e0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Rect rect) {
            y0.this.f33074c = rect;
            y0.this.h();
        }
    }

    public class c implements androidx.p000lifecycle.e0<Rect> {
        public c() {
        }

        @Override // androidx.p000lifecycle.e0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Rect rect) {
            ek.q.b("SafeAreaInsetsObserver", String.format("New cutout insets: %s", String.valueOf(rect)));
            if (rect == null) {
                om.a.b().a(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            }
            Rect rectG = y0.this.g(new RectF(rect), cl.a.e(y0.this.f33073a));
            om.a.b().a(rectG.left, rectG.top, rectG.right, rectG.bottom);
        }
    }

    public y0(Context context) {
        this.f33073a = context;
    }

    public final int f(float f10, float f11) {
        return (int) (((double) (f10 / f11)) + 0.5d);
    }

    public final Rect g(RectF rectF, float f10) {
        return new Rect(f(rectF.left, f10), f(rectF.top, f10), f(rectF.right, f10), f(rectF.bottom, f10));
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a1  */
    public final void h() {
        int iF;
        boolean z10;
        float fE = cl.a.e(this.f33073a);
        int iF2 = 0;
        if (this.f33074c != null) {
            Context context = this.f33073a;
            if (context instanceof Activity) {
                View decorView = ((Activity) context).getWindow().getDecorView();
                WindowInsetsCompat windowInsetsCompatF = androidx.core.view.o0.F(decorView);
                boolean z11 = true;
                boolean z12 = (rh.h.a().V5() && Build.VERSION.SDK_INT >= 30) || (rg.a1.l0() && windowInsetsCompatF != null);
                if (z12) {
                    z10 = (windowInsetsCompatF == null || windowInsetsCompatF.isVisible(WindowInsetsCompat.Type.statusBars())) ? false : true;
                    if (windowInsetsCompatF == null || windowInsetsCompatF.isVisible(WindowInsetsCompat.Type.navigationBars())) {
                        z11 = false;
                    }
                } else {
                    int systemUiVisibility = decorView.getSystemUiVisibility();
                    boolean z13 = (systemUiVisibility & 4) != 0;
                    z11 = (systemUiVisibility & 2) != 0;
                    z10 = z13;
                }
                Rect rect = this.f33074c;
                int i10 = rect.top;
                int i11 = rect.bottom;
                if (rh.h.a().V5() && z12 && windowInsetsCompatF != null) {
                    Insets insets = windowInsetsCompatF.getInsets(WindowInsetsCompat.Type.systemBars());
                    i10 = insets.top;
                    i11 = insets.bottom;
                }
                iF2 = !z10 ? f(i10, fE) : 0;
                iF = z11 ? 0 : f(i11, fE);
            } else {
                iF = 0;
            }
        } else {
            iF = 0;
        }
        if (this.b == null) {
            om.a.b().a(0.0f, iF2, 0.0f, iF);
        } else {
            Rect rectG = g(new RectF(this.b), fE);
            om.a.b().a(rectG.left, Math.max(rectG.top, iF2), rectG.right, Math.max(rectG.bottom, iF));
        }
    }

    public void i(androidx.p000lifecycle.s sVar, androidx.p000lifecycle.a0<Rect> a0Var) {
        if (!rh.h.a().D0()) {
            a0Var.i(sVar, new c());
            return;
        }
        a0Var.i(sVar, new a());
        if (sVar instanceof com.roblox.client.b) {
            (rh.h.a().b1() ? ((com.roblox.client.b) sVar).G1().d() : ((com.roblox.client.b) sVar).G1().b()).i(sVar, new b());
        }
    }
}
