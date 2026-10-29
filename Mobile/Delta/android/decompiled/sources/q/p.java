package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ImageView f29079a;
    public y0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y0 f29080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y0 f29081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29082e = 0;

    public p(@NonNull ImageView imageView) {
        this.f29079a = imageView;
    }

    public final boolean a(@NonNull Drawable drawable) {
        if (this.f29081d == null) {
            this.f29081d = new y0();
        }
        y0 y0Var = this.f29081d;
        y0Var.a();
        ColorStateList colorStateListA = d3.f.a(this.f29079a);
        if (colorStateListA != null) {
            y0Var.f29155d = true;
            y0Var.f29153a = colorStateListA;
        }
        PorterDuff.Mode modeB = d3.f.b(this.f29079a);
        if (modeB != null) {
            y0Var.f29154c = true;
            y0Var.b = modeB;
        }
        if (!y0Var.f29155d && !y0Var.f29154c) {
            return false;
        }
        k.i(drawable, y0Var, this.f29079a.getDrawableState());
        return true;
    }

    public void b() {
        if (this.f29079a.getDrawable() != null) {
            this.f29079a.getDrawable().setLevel(this.f29082e);
        }
    }

    public void c() {
        Drawable drawable = this.f29079a.getDrawable();
        if (drawable != null) {
            k0.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            y0 y0Var = this.f29080c;
            if (y0Var != null) {
                k.i(drawable, y0Var, this.f29079a.getDrawableState());
                return;
            }
            y0 y0Var2 = this.b;
            if (y0Var2 != null) {
                k.i(drawable, y0Var2, this.f29079a.getDrawableState());
            }
        }
    }

    public ColorStateList d() {
        y0 y0Var = this.f29080c;
        if (y0Var != null) {
            return y0Var.f29153a;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        y0 y0Var = this.f29080c;
        if (y0Var != null) {
            return y0Var.b;
        }
        return null;
    }

    public boolean f() {
        return !(this.f29079a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i10) {
        int iN;
        Context context = this.f29079a.getContext();
        int[] iArr = i.j.R;
        a1 a1VarV = a1.v(context, attributeSet, iArr, i10, 0);
        ImageView imageView = this.f29079a;
        androidx.core.view.o0.k0(imageView, imageView.getContext(), iArr, attributeSet, a1VarV.r(), i10, 0);
        try {
            Drawable drawable = this.f29079a.getDrawable();
            if (drawable == null && (iN = a1VarV.n(i.j.S, -1)) != -1 && (drawable = k.a.b(this.f29079a.getContext(), iN)) != null) {
                this.f29079a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                k0.b(drawable);
            }
            int i11 = i.j.T;
            if (a1VarV.s(i11)) {
                d3.f.c(this.f29079a, a1VarV.c(i11));
            }
            int i12 = i.j.U;
            if (a1VarV.s(i12)) {
                d3.f.d(this.f29079a, k0.e(a1VarV.k(i12, -1), null));
            }
        } finally {
            a1VarV.x();
        }
    }

    public void h(@NonNull Drawable drawable) {
        this.f29082e = drawable.getLevel();
    }

    public void i(int i10) {
        if (i10 != 0) {
            Drawable drawableB = k.a.b(this.f29079a.getContext(), i10);
            if (drawableB != null) {
                k0.b(drawableB);
            }
            this.f29079a.setImageDrawable(drawableB);
        } else {
            this.f29079a.setImageDrawable(null);
        }
        c();
    }

    public void j(ColorStateList colorStateList) {
        if (this.f29080c == null) {
            this.f29080c = new y0();
        }
        y0 y0Var = this.f29080c;
        y0Var.f29153a = colorStateList;
        y0Var.f29155d = true;
        c();
    }

    public void k(PorterDuff.Mode mode) {
        if (this.f29080c == null) {
            this.f29080c = new y0();
        }
        y0 y0Var = this.f29080c;
        y0Var.b = mode;
        y0Var.f29154c = true;
        c();
    }

    public final boolean l() {
        return this.b != null;
    }
}
