package wh;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import sg.a1;

/* JADX INFO: loaded from: classes2.dex */
public class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f34394a;
    public Rect b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Rect f34395c;

    public class a implements androidx.p000lifecycle.e0<Rect> {
        public a() {
        }

        @Override // androidx.p000lifecycle.e0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Rect rect) {
            gk.p.b("SafeAreaInsetsObserver", String.format("New cutout insets: %s", String.valueOf(rect)));
            x0.this.b = rect;
            x0.this.h();
        }
    }

    public class b implements androidx.p000lifecycle.e0<Rect> {
        public b() {
        }

        @Override // androidx.p000lifecycle.e0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Rect rect) {
            x0.this.f34395c = rect;
            x0.this.h();
        }
    }

    public class c implements androidx.p000lifecycle.e0<Rect> {
        public c() {
        }

        @Override // androidx.p000lifecycle.e0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Rect rect) {
            gk.p.b("SafeAreaInsetsObserver", String.format("New cutout insets: %s", String.valueOf(rect)));
            if (rect == null) {
                qm.a.b().a(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            }
            Rect rectG = x0.this.g(new RectF(rect), el.a.e(x0.this.f34394a));
            qm.a.b().a(rectG.left, rectG.top, rectG.right, rectG.bottom);
        }
    }

    public x0(Context context) {
        this.f34394a = context;
    }

    public final int f(float f10, float f11) {
        return (int) (((double) (f10 / f11)) + 0.5d);
    }

    public final Rect g(RectF rectF, float f10) {
        return new Rect(f(rectF.left, f10), f(rectF.top, f10), f(rectF.right, f10), f(rectF.bottom, f10));
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0084  */
    public final void h() {
        int iF;
        boolean z10;
        float fE = el.a.e(this.f34394a);
        int iF2 = 0;
        if (this.f34395c != null) {
            Context context = this.f34394a;
            if (context instanceof Activity) {
                View decorView = ((Activity) context).getWindow().getDecorView();
                WindowInsetsCompat windowInsetsCompatF = androidx.core.view.o0.F(decorView);
                boolean z11 = true;
                if ((!th.h.a().L5() || Build.VERSION.SDK_INT < 30) && (!a1.l0() || windowInsetsCompatF == null)) {
                    int systemUiVisibility = decorView.getSystemUiVisibility();
                    boolean z12 = (systemUiVisibility & 4) != 0;
                    z11 = (systemUiVisibility & 2) != 0;
                    z10 = z12;
                } else {
                    z10 = (windowInsetsCompatF == null || windowInsetsCompatF.isVisible(WindowInsetsCompat.Type.statusBars())) ? false : true;
                    if (windowInsetsCompatF == null || windowInsetsCompatF.isVisible(WindowInsetsCompat.Type.navigationBars())) {
                        z11 = false;
                    }
                }
                iF2 = !z10 ? f(this.f34395c.top, fE) : 0;
                iF = z11 ? 0 : f(this.f34395c.bottom, fE);
            } else {
                iF = 0;
            }
        } else {
            iF = 0;
        }
        if (this.b == null) {
            qm.a.b().a(0.0f, iF2, 0.0f, iF);
        } else {
            Rect rectG = g(new RectF(this.b), fE);
            qm.a.b().a(rectG.left, Math.max(rectG.top, iF2), rectG.right, Math.max(rectG.bottom, iF));
        }
    }

    public void i(androidx.p000lifecycle.s sVar, androidx.p000lifecycle.a0<Rect> a0Var) {
        if (!th.h.a().y0()) {
            a0Var.i(sVar, new c());
            return;
        }
        a0Var.i(sVar, new a());
        if (sVar instanceof com.roblox.client.b) {
            (th.h.a().U0() ? ((com.roblox.client.b) sVar).G1().d() : ((com.roblox.client.b) sVar).G1().b()).i(sVar, new b());
        }
    }
}
