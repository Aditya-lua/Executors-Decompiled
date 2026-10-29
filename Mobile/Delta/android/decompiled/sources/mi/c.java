package mi;

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
import e4.q;
import gk.p;
import sg.m0;
import sg.n0;
import th.h;
import wh.t0;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f24235g = WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewGroup f24236a;
    public View b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f24237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f24238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t0 f24239e = t0.APP;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Rect f24240f;

    public class a implements e0<Rect> {
        public a() {
        }

        @Override // androidx.p000lifecycle.e0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Rect rect) {
            if (rect != null) {
                c.this.f24240f = rect;
                c.this.d();
            }
        }
    }

    public final void d() {
        if (this.f24239e == t0.EXPERIENCE) {
            e(0, 0, 0, 0);
            return;
        }
        Rect rect = this.f24240f;
        if (rect != null) {
            e(rect.top, rect.left, rect.right, rect.bottom);
        }
    }

    public void e(int i10, int i11, int i12, int i13) {
        if (this.f24236a == null) {
            return;
        }
        p.b("AppInsetViewAdapter", "Insets: " + i10 + ", " + i11 + ", " + i12 + ", " + i13 + ", mode: " + this.f24239e);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f24236a.getLayoutParams();
        boolean z10 = layoutParams.topMargin != i10;
        boolean z11 = layoutParams.rightMargin != i12;
        boolean z12 = layoutParams.bottomMargin != i13;
        if (z10 || z11 || z12) {
            layoutParams.topMargin = i10;
            layoutParams.rightMargin = i12;
            layoutParams.bottomMargin = i13;
            this.f24236a.setLayoutParams(layoutParams);
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        if (z10) {
            layoutParams2.height = i10;
            this.b.setLayoutParams(layoutParams2);
        }
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f24237c.getLayoutParams();
        if (z11) {
            layoutParams3.width = i12;
            this.f24237c.setLayoutParams(layoutParams3);
        }
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f24238d.getLayoutParams();
        if (z12) {
            layoutParams4.height = i13;
            this.f24238d.setLayoutParams(layoutParams4);
        }
    }

    public Insets f(Insets insets) {
        return Insets.NONE;
    }

    public ViewGroup g() {
        return this.f24236a;
    }

    public final View h(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(n0.f30890p, (ViewGroup) null);
        this.f24236a = (ViewGroup) viewInflate.findViewById(m0.O);
        this.b = viewInflate.findViewById(m0.Q);
        this.f24237c = viewInflate.findViewById(m0.P);
        this.f24238d = viewInflate.findViewById(m0.N);
        return viewInflate;
    }

    public View i(LayoutInflater layoutInflater, androidx.fragment.app.c cVar) {
        p.b("AppInsetViewAdapter", "inflate: Fragment = " + cVar);
        View viewH = h(layoutInflater);
        if (cVar != null) {
            q qVarP = cVar.p();
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
        p.b("AppInsetViewAdapter", "inflate: Activity = " + bVar);
        View viewH = h(layoutInflater);
        if (bVar != null) {
            n(bVar, bVar.G1());
        }
        return viewH;
    }

    public final /* synthetic */ WindowInsetsCompat k(View view, WindowInsetsCompat windowInsetsCompat) {
        int i10 = f24235g;
        Insets insets = windowInsetsCompat.getInsets(i10);
        this.f24240f = new Rect(insets.left, insets.top, insets.right, insets.bottom);
        d();
        if (this.f24239e != t0.EXPERIENCE) {
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
        ViewGroup viewGroup = this.f24236a;
        if (viewGroup == null) {
            return;
        }
        o0.A0(viewGroup, new y() { // from class: mi.b
            @Override // androidx.core.view.y
            public final WindowInsetsCompat K(View view, WindowInsetsCompat windowInsetsCompat) {
                return this.f24234a.k(view, windowInsetsCompat);
            }
        });
        o0.j0(this.f24236a);
    }

    public final void n(s sVar, @NonNull mi.a aVar) {
        if (h.a().n5()) {
            m();
        } else {
            aVar.b().i(sVar, new a());
        }
    }

    public void o(t0 t0Var) {
        ViewGroup viewGroup;
        this.f24239e = t0Var;
        d();
        if (!h.a().n5() || (viewGroup = this.f24236a) == null) {
            return;
        }
        o0.j0(viewGroup);
    }
}
