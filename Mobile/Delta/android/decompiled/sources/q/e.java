package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f29325a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y0 f29327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y0 f29328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y0 f29329f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29326c = -1;
    public final k b = k.b();

    public e(@NonNull View view) {
        this.f29325a = view;
    }

    public final boolean a(@NonNull Drawable drawable) {
        if (this.f29329f == null) {
            this.f29329f = new y0();
        }
        y0 y0Var = this.f29329f;
        y0Var.a();
        ColorStateList colorStateListR = androidx.core.view.o0.r(this.f29325a);
        if (colorStateListR != null) {
            y0Var.f29508d = true;
            y0Var.f29506a = colorStateListR;
        }
        PorterDuff.Mode modeS = androidx.core.view.o0.s(this.f29325a);
        if (modeS != null) {
            y0Var.f29507c = true;
            y0Var.b = modeS;
        }
        if (!y0Var.f29508d && !y0Var.f29507c) {
            return false;
        }
        k.i(drawable, y0Var, this.f29325a.getDrawableState());
        return true;
    }

    public void b() {
        Drawable background = this.f29325a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            y0 y0Var = this.f29328e;
            if (y0Var != null) {
                k.i(background, y0Var, this.f29325a.getDrawableState());
                return;
            }
            y0 y0Var2 = this.f29327d;
            if (y0Var2 != null) {
                k.i(background, y0Var2, this.f29325a.getDrawableState());
            }
        }
    }

    public ColorStateList c() {
        y0 y0Var = this.f29328e;
        if (y0Var != null) {
            return y0Var.f29506a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        y0 y0Var = this.f29328e;
        if (y0Var != null) {
            return y0Var.b;
        }
        return null;
    }

    public void e(AttributeSet attributeSet, int i10) {
        Context context = this.f29325a.getContext();
        int[] iArr = i.j.M3;
        a1 a1VarV = a1.v(context, attributeSet, iArr, i10, 0);
        View view = this.f29325a;
        androidx.core.view.o0.k0(view, view.getContext(), iArr, attributeSet, a1VarV.r(), i10, 0);
        try {
            int i11 = i.j.N3;
            if (a1VarV.s(i11)) {
                this.f29326c = a1VarV.n(i11, -1);
                ColorStateList colorStateListF = this.b.f(this.f29325a.getContext(), this.f29326c);
                if (colorStateListF != null) {
                    h(colorStateListF);
                }
            }
            int i12 = i.j.O3;
            if (a1VarV.s(i12)) {
                androidx.core.view.o0.r0(this.f29325a, a1VarV.c(i12));
            }
            int i13 = i.j.P3;
            if (a1VarV.s(i13)) {
                androidx.core.view.o0.s0(this.f29325a, k0.e(a1VarV.k(i13, -1), null));
            }
        } finally {
            a1VarV.x();
        }
    }

    public void f(Drawable drawable) {
        this.f29326c = -1;
        h(null);
        b();
    }

    public void g(int i10) {
        this.f29326c = i10;
        k kVar = this.b;
        h(kVar != null ? kVar.f(this.f29325a.getContext(), i10) : null);
        b();
    }

    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f29327d == null) {
                this.f29327d = new y0();
            }
            y0 y0Var = this.f29327d;
            y0Var.f29506a = colorStateList;
            y0Var.f29508d = true;
        } else {
            this.f29327d = null;
        }
        b();
    }

    public void i(ColorStateList colorStateList) {
        if (this.f29328e == null) {
            this.f29328e = new y0();
        }
        y0 y0Var = this.f29328e;
        y0Var.f29506a = colorStateList;
        y0Var.f29508d = true;
        b();
    }

    public void j(PorterDuff.Mode mode) {
        if (this.f29328e == null) {
            this.f29328e = new y0();
        }
        y0 y0Var = this.f29328e;
        y0Var.b = mode;
        y0Var.f29507c = true;
        b();
    }

    public final boolean k() {
        return this.f29327d != null;
    }
}
