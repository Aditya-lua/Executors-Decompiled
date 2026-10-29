package p517wh;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import androidx.core.view.C0625o0;
import androidx.core.view.WindowInsetsCompat;
import androidx.p616lifecycle.AbstractC0940a0;
import androidx.p616lifecycle.InterfaceC0952e0;
import androidx.p616lifecycle.InterfaceC0980s;
import com.roblox.client.AbstractActivityC3160b;
import p107el.C5160a;
import p151gk.C6124q;
import p387qm.C10600a;
import sg.C11295a1;
import th.C11659h;

/* JADX INFO: renamed from: wh.x0 */
/* JADX INFO: loaded from: classes2.dex */
public class C12470x0 {

    /* JADX INFO: renamed from: a */
    public final Context f44592a;

    /* JADX INFO: renamed from: b */
    public Rect f44593b;

    /* JADX INFO: renamed from: c */
    public Rect f44594c;

    /* JADX INFO: renamed from: wh.x0$a */
    public class a implements InterfaceC0952e0<Rect> {
        public a() {
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)V */
        @Override // androidx.p616lifecycle.InterfaceC0952e0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo4884a(Rect rect) {
            C6124q.m27057b("SafeAreaInsetsObserver", String.format("New cutout insets: %s", String.valueOf(rect)));
            C12470x0.this.f44593b = rect;
            C12470x0.this.m46718h();
        }
    }

    /* JADX INFO: renamed from: wh.x0$b */
    public class b implements InterfaceC0952e0<Rect> {
        public b() {
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)V */
        @Override // androidx.p616lifecycle.InterfaceC0952e0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo4884a(Rect rect) {
            C12470x0.this.f44594c = rect;
            C12470x0.this.m46718h();
        }
    }

    /* JADX INFO: renamed from: wh.x0$c */
    public class c implements InterfaceC0952e0<Rect> {
        public c() {
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)V */
        @Override // androidx.p616lifecycle.InterfaceC0952e0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo4884a(Rect rect) {
            C6124q.m27057b("SafeAreaInsetsObserver", String.format("New cutout insets: %s", String.valueOf(rect)));
            if (rect == null) {
                C10600a.m40631b().m40632a(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            }
            Rect rectM46717g = C12470x0.this.m46717g(new RectF(rect), C5160a.m24001e(C12470x0.this.f44592a));
            C10600a.m40631b().m40632a(rectM46717g.left, rectM46717g.top, rectM46717g.right, rectM46717g.bottom);
        }
    }

    public C12470x0(Context context) {
        this.f44592a = context;
    }

    /* JADX INFO: renamed from: f */
    public final int m46716f(float f10, float f11) {
        return (int) (((double) (f10 / f11)) + 0.5d);
    }

    /* JADX INFO: renamed from: g */
    public final Rect m46717g(RectF rectF, float f10) {
        return new Rect(m46716f(rectF.left, f10), m46716f(rectF.top, f10), m46716f(rectF.right, f10), m46716f(rectF.bottom, f10));
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0084  */
    /* JADX INFO: renamed from: h */
    public final void m46718h() {
        int iM46716f;
        boolean z10;
        float fM24001e = C5160a.m24001e(this.f44592a);
        int iM46716f2 = 0;
        if (this.f44594c != null) {
            Context context = this.f44592a;
            if (context instanceof Activity) {
                View decorView = ((Activity) context).getWindow().getDecorView();
                WindowInsetsCompat windowInsetsCompatM2988F = C0625o0.m2988F(decorView);
                boolean z11 = true;
                if ((!C11659h.m43403a().mo43527R5() || Build.VERSION.SDK_INT < 30) && (!C11295a1.m42461l0() || windowInsetsCompatM2988F == null)) {
                    int systemUiVisibility = decorView.getSystemUiVisibility();
                    boolean z12 = (systemUiVisibility & 4) != 0;
                    z11 = (systemUiVisibility & 2) != 0;
                    z10 = z12;
                } else {
                    z10 = (windowInsetsCompatM2988F == null || windowInsetsCompatM2988F.isVisible(WindowInsetsCompat.Type.statusBars())) ? false : true;
                    if (windowInsetsCompatM2988F == null || windowInsetsCompatM2988F.isVisible(WindowInsetsCompat.Type.navigationBars())) {
                        z11 = false;
                    }
                }
                iM46716f2 = !z10 ? m46716f(this.f44594c.top, fM24001e) : 0;
                iM46716f = z11 ? 0 : m46716f(this.f44594c.bottom, fM24001e);
            } else {
                iM46716f = 0;
            }
        } else {
            iM46716f = 0;
        }
        if (this.f44593b == null) {
            C10600a.m40631b().m40632a(0.0f, iM46716f2, 0.0f, iM46716f);
        } else {
            Rect rectM46717g = m46717g(new RectF(this.f44593b), fM24001e);
            C10600a.m40631b().m40632a(rectM46717g.left, Math.max(rectM46717g.top, iM46716f2), rectM46717g.right, Math.max(rectM46717g.bottom, iM46716f));
        }
    }

    /* JADX INFO: renamed from: i */
    public void m46719i(InterfaceC0980s interfaceC0980s, AbstractC0940a0<Rect> abstractC0940a0) {
        if (!C11659h.m43403a().mo43419C0()) {
            abstractC0940a0.m4857i(interfaceC0980s, new c());
            return;
        }
        abstractC0940a0.m4857i(interfaceC0980s, new a());
        if (interfaceC0980s instanceof AbstractActivityC3160b) {
            (C11659h.m43403a().mo43571Y0() ? ((AbstractActivityC3160b) interfaceC0980s).m14962G1().m34392d() : ((AbstractActivityC3160b) interfaceC0980s).m14962G1().m34390b()).m4857i(interfaceC0980s, new b());
        }
    }
}
