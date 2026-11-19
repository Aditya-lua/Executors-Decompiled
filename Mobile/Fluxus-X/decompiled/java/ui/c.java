package ui;

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
import bh.m0;
import bh.n0;
import bi.h;
import com.roblox.client.startup.MainGameActivity;
import ei.u0;
import f4.v;
import ok.q;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f33330g = WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewGroup f33331a;
    public View b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f33332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f33333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u0 f33334e = u0.APP;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Rect f33335f;

    public class a implements e0<Rect> {
        public a() {
        }

        @Override // androidx.p000lifecycle.e0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Rect rect) {
            if (rect != null) {
                c.this.f33335f = rect;
                c.this.d();
            }
        }
    }

    public final void d() {
        if (this.f33334e == u0.EXPERIENCE) {
            e(0, 0, 0, 0);
            return;
        }
        Rect rect = this.f33335f;
        if (rect != null) {
            e(rect.top, rect.left, rect.right, rect.bottom);
        }
    }

    public void e(int i10, int i11, int i12, int i13) {
        if (this.f33331a == null) {
            return;
        }
        q.b("AppInsetViewAdapter", "Insets: " + i10 + ", " + i11 + ", " + i12 + ", " + i13 + ", mode: " + this.f33334e);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f33331a.getLayoutParams();
        boolean z10 = layoutParams.topMargin != i10;
        boolean z11 = layoutParams.rightMargin != i12;
        boolean z12 = layoutParams.bottomMargin != i13;
        if (z10 || z11 || z12) {
            layoutParams.topMargin = i10;
            layoutParams.rightMargin = i12;
            layoutParams.bottomMargin = i13;
            this.f33331a.setLayoutParams(layoutParams);
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        if (z10) {
            layoutParams2.height = i10;
            this.b.setLayoutParams(layoutParams2);
        }
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f33332c.getLayoutParams();
        if (z11) {
            layoutParams3.width = i12;
            this.f33332c.setLayoutParams(layoutParams3);
        }
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f33333d.getLayoutParams();
        if (z12) {
            layoutParams4.height = i13;
            this.f33333d.setLayoutParams(layoutParams4);
        }
    }

    public Insets f(Insets insets) {
        return Insets.NONE;
    }

    public ViewGroup g() {
        return this.f33331a;
    }

    public final View h(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(n0.f4197p, (ViewGroup) null);
        this.f33331a = (ViewGroup) viewInflate.findViewById(m0.P);
        this.b = viewInflate.findViewById(m0.R);
        this.f33332c = viewInflate.findViewById(m0.Q);
        this.f33333d = viewInflate.findViewById(m0.O);
        return viewInflate;
    }

    public View i(LayoutInflater layoutInflater, com.roblox.client.b bVar) {
        q.b("AppInsetViewAdapter", "inflate: Activity = " + bVar);
        View viewH = h(layoutInflater);
        if (bVar != null) {
            n(bVar, bVar.G1());
        }
        return viewH;
    }

    public View j(LayoutInflater layoutInflater, f4.q qVar) {
        q.b("AppInsetViewAdapter", "inflate: Fragment = " + qVar);
        View viewH = h(layoutInflater);
        if (qVar != null) {
            v vVarP = qVar.p();
            if (vVarP instanceof com.roblox.client.b) {
                n(qVar, ((com.roblox.client.b) vVarP).G1());
                return viewH;
            }
            if (vVarP instanceof MainGameActivity) {
                n(qVar, ((MainGameActivity) vVarP).getAppInsetManager());
            }
        }
        return viewH;
    }

    public final /* synthetic */ WindowInsetsCompat k(View view, WindowInsetsCompat windowInsetsCompat) {
        int i10 = f33330g;
        Insets insets = windowInsetsCompat.getInsets(i10);
        this.f33335f = new Rect(insets.left, insets.top, insets.right, insets.bottom);
        d();
        if (this.f33334e != u0.EXPERIENCE) {
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
        ViewGroup viewGroup = this.f33331a;
        if (viewGroup == null) {
            return;
        }
        o0.A0(viewGroup, new y() { // from class: ui.b
            @Override // androidx.core.view.y
            public final WindowInsetsCompat J(View view, WindowInsetsCompat windowInsetsCompat) {
                return this.f33329a.k(view, windowInsetsCompat);
            }
        });
        o0.j0(this.f33331a);
    }

    public final void n(s sVar, @NonNull ui.a aVar) {
        if (h.a().v5()) {
            m();
        } else {
            aVar.c().i(sVar, new a());
        }
    }

    public void o(u0 u0Var) {
        ViewGroup viewGroup;
        this.f33334e = u0Var;
        d();
        if (!h.a().v5() || (viewGroup = this.f33331a) == null) {
            return;
        }
        o0.j0(viewGroup);
    }
}
