package ki;

import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.o0;
import androidx.core.view.y;
import androidx.p000lifecycle.e0;
import androidx.p000lifecycle.s;
import com.roblox.client.startup.MainGameActivity;
import ek.q;
import rg.m0;
import rg.n0;
import rh.h;
import uh.u0;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f22712g = WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewGroup f22713a;
    public View b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f22714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f22715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u0 f22716e = u0.APP;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Rect f22717f;

    public class a implements e0<Rect> {
        public a() {
        }

        @Override // androidx.p000lifecycle.e0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Rect rect) {
            if (rect != null) {
                c.this.f22717f = rect;
                c.this.d();
            }
        }
    }

    public final void d() {
        if (this.f22716e == u0.EXPERIENCE) {
            e(0, 0, 0, 0);
            return;
        }
        Rect rect = this.f22717f;
        if (rect != null) {
            e(rect.top, rect.left, rect.right, rect.bottom);
        }
    }

    public void e(int i10, int i11, int i12, int i13) {
        if (this.f22713a == null) {
            return;
        }
        q.b("AppInsetViewAdapter", "Insets: " + i10 + ", " + i11 + ", " + i12 + ", " + i13 + ", mode: " + this.f22716e);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f22713a.getLayoutParams();
        boolean z10 = layoutParams.topMargin != i10;
        boolean z11 = layoutParams.rightMargin != i12;
        boolean z12 = layoutParams.bottomMargin != i13;
        if (z10 || z11 || z12) {
            layoutParams.topMargin = i10;
            layoutParams.rightMargin = i12;
            layoutParams.bottomMargin = i13;
            this.f22713a.setLayoutParams(layoutParams);
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        if (z10) {
            layoutParams2.height = i10;
            this.b.setLayoutParams(layoutParams2);
        }
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f22714c.getLayoutParams();
        if (z11) {
            layoutParams3.width = i12;
            this.f22714c.setLayoutParams(layoutParams3);
        }
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f22715d.getLayoutParams();
        if (z12) {
            layoutParams4.height = i13;
            this.f22715d.setLayoutParams(layoutParams4);
        }
    }

    public Insets f(Insets insets) {
        return Insets.NONE;
    }

    public ViewGroup g() {
        return this.f22713a;
    }

    public final View h(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(n0.f30495p, (ViewGroup) null);
        this.f22713a = (ViewGroup) viewInflate.findViewById(m0.O);
        this.b = viewInflate.findViewById(m0.Q);
        this.f22714c = viewInflate.findViewById(m0.P);
        this.f22715d = viewInflate.findViewById(m0.N);
        return viewInflate;
    }

    public View i(LayoutInflater layoutInflater, androidx.fragment.app.c cVar) {
        q.b("AppInsetViewAdapter", "inflate: Fragment = " + cVar);
        View viewH = h(layoutInflater);
        if (cVar != null) {
            e4.q qVarP = cVar.p();
            if (qVarP instanceof com.roblox.client.b) {
                n(cVar, ((com.roblox.client.b) qVarP).G1());
                return viewH;
            }
            if (qVarP instanceof MainGameActivity) {
                n(cVar, ((MainGameActivity) qVarP).getAppInsetManager());
            }
        }
        return viewH;
    }

    public View j(LayoutInflater layoutInflater, com.roblox.client.b bVar) {
        q.b("AppInsetViewAdapter", "inflate: Activity = " + bVar);
        View viewH = h(layoutInflater);
        if (bVar != null) {
            n(bVar, bVar.G1());
        }
        return viewH;
    }

    public final /* synthetic */ WindowInsetsCompat k(View view, WindowInsetsCompat windowInsetsCompat) {
        int i10 = f22712g;
        Insets insets = windowInsetsCompat.getInsets(i10);
        this.f22717f = new Rect(insets.left, insets.top, insets.right, insets.bottom);
        d();
        if (this.f22716e != u0.EXPERIENCE) {
            insets = f(insets);
        }
        return new WindowInsetsCompat.Builder(windowInsetsCompat).setInsets(i10, insets).build();
    }

    public void l(int i10) {
        View view = this.b;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public final void m() {
        ViewGroup viewGroup = this.f22713a;
        if (viewGroup == null) {
            return;
        }
        o0.A0(viewGroup, new y() { // from class: ki.b
            @Override // androidx.core.view.y
            public final WindowInsetsCompat J(View view, WindowInsetsCompat windowInsetsCompat) {
                return this.f22711a.k(view, windowInsetsCompat);
            }
        });
        o0.j0(this.f22713a);
    }

    public final void n(s sVar, @NonNull ki.a aVar) {
        if (h.a().y5()) {
            m();
        } else {
            aVar.b().i(sVar, new a());
        }
    }

    public void o(u0 u0Var) {
        ViewGroup viewGroup;
        this.f22716e = u0Var;
        d();
        if (!h.a().y5() || (viewGroup = this.f22713a) == null) {
            return;
        }
        o0.j0(viewGroup);
    }
}
