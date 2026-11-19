package q;

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
    public final View f29509a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z0 f29511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z0 f29512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public z0 f29513f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29510c = -1;
    public final k b = k.b();

    public e(@NonNull View view) {
        this.f29509a = view;
    }

    public final boolean a(@NonNull Drawable drawable) {
        if (this.f29513f == null) {
            this.f29513f = new z0();
        }
        z0 z0Var = this.f29513f;
        z0Var.a();
        ColorStateList colorStateListR = androidx.core.view.o0.r(this.f29509a);
        if (colorStateListR != null) {
            z0Var.f29714d = true;
            z0Var.f29712a = colorStateListR;
        }
        PorterDuff.Mode modeS = androidx.core.view.o0.s(this.f29509a);
        if (modeS != null) {
            z0Var.f29713c = true;
            z0Var.b = modeS;
        }
        if (!z0Var.f29714d && !z0Var.f29713c) {
            return false;
        }
        k.i(drawable, z0Var, this.f29509a.getDrawableState());
        return true;
    }

    public void b() {
        Drawable background = this.f29509a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            z0 z0Var = this.f29512e;
            if (z0Var != null) {
                k.i(background, z0Var, this.f29509a.getDrawableState());
                return;
            }
            z0 z0Var2 = this.f29511d;
            if (z0Var2 != null) {
                k.i(background, z0Var2, this.f29509a.getDrawableState());
            }
        }
    }

    public ColorStateList c() {
        z0 z0Var = this.f29512e;
        if (z0Var != null) {
            return z0Var.f29712a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        z0 z0Var = this.f29512e;
        if (z0Var != null) {
            return z0Var.b;
        }
        return null;
    }

    public void e(AttributeSet attributeSet, int i10) {
        b1 b1VarV = b1.v(this.f29509a.getContext(), attributeSet, i.j.M3, i10, 0);
        View view = this.f29509a;
        androidx.core.view.o0.k0(view, view.getContext(), i.j.M3, attributeSet, b1VarV.r(), i10, 0);
        try {
            if (b1VarV.s(i.j.N3)) {
                this.f29510c = b1VarV.n(i.j.N3, -1);
                ColorStateList colorStateListF = this.b.f(this.f29509a.getContext(), this.f29510c);
                if (colorStateListF != null) {
                    h(colorStateListF);
                }
            }
            if (b1VarV.s(i.j.O3)) {
                androidx.core.view.o0.r0(this.f29509a, b1VarV.c(i.j.O3));
            }
            if (b1VarV.s(i.j.P3)) {
                androidx.core.view.o0.s0(this.f29509a, l0.e(b1VarV.k(i.j.P3, -1), null));
            }
        } finally {
            b1VarV.x();
        }
    }

    public void f(Drawable drawable) {
        this.f29510c = -1;
        h(null);
        b();
    }

    public void g(int i10) {
        this.f29510c = i10;
        k kVar = this.b;
        h(kVar != null ? kVar.f(this.f29509a.getContext(), i10) : null);
        b();
    }

    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f29511d == null) {
                this.f29511d = new z0();
            }
            z0 z0Var = this.f29511d;
            z0Var.f29712a = colorStateList;
            z0Var.f29714d = true;
        } else {
            this.f29511d = null;
        }
        b();
    }

    public void i(ColorStateList colorStateList) {
        if (this.f29512e == null) {
            this.f29512e = new z0();
        }
        z0 z0Var = this.f29512e;
        z0Var.f29712a = colorStateList;
        z0Var.f29714d = true;
        b();
    }

    public void j(PorterDuff.Mode mode) {
        if (this.f29512e == null) {
            this.f29512e = new z0();
        }
        z0 z0Var = this.f29512e;
        z0Var.b = mode;
        z0Var.f29713c = true;
        b();
    }

    public final boolean k() {
        return this.f29511d != null;
    }
}
