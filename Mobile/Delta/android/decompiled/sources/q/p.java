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
    public final ImageView f29432a;
    public y0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y0 f29433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y0 f29434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29435e = 0;

    public p(@NonNull ImageView imageView) {
        this.f29432a = imageView;
    }

    public final boolean a(@NonNull Drawable drawable) {
        if (this.f29434d == null) {
            this.f29434d = new y0();
        }
        y0 y0Var = this.f29434d;
        y0Var.a();
        ColorStateList colorStateListA = d3.f.a(this.f29432a);
        if (colorStateListA != null) {
            y0Var.f29508d = true;
            y0Var.f29506a = colorStateListA;
        }
        PorterDuff.Mode modeB = d3.f.b(this.f29432a);
        if (modeB != null) {
            y0Var.f29507c = true;
            y0Var.b = modeB;
        }
        if (!y0Var.f29508d && !y0Var.f29507c) {
            return false;
        }
        k.i(drawable, y0Var, this.f29432a.getDrawableState());
        return true;
    }

    public void b() {
        if (this.f29432a.getDrawable() != null) {
            this.f29432a.getDrawable().setLevel(this.f29435e);
        }
    }

    public void c() {
        Drawable drawable = this.f29432a.getDrawable();
        if (drawable != null) {
            k0.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            y0 y0Var = this.f29433c;
            if (y0Var != null) {
                k.i(drawable, y0Var, this.f29432a.getDrawableState());
                return;
            }
            y0 y0Var2 = this.b;
            if (y0Var2 != null) {
                k.i(drawable, y0Var2, this.f29432a.getDrawableState());
            }
        }
    }

    public ColorStateList d() {
        y0 y0Var = this.f29433c;
        if (y0Var != null) {
            return y0Var.f29506a;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        y0 y0Var = this.f29433c;
        if (y0Var != null) {
            return y0Var.b;
        }
        return null;
    }

    public boolean f() {
        return !(this.f29432a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i10) {
        int iN;
        Context context = this.f29432a.getContext();
        int[] iArr = i.j.R;
        a1 a1VarV = a1.v(context, attributeSet, iArr, i10, 0);
        ImageView imageView = this.f29432a;
        androidx.core.view.o0.k0(imageView, imageView.getContext(), iArr, attributeSet, a1VarV.r(), i10, 0);
        try {
            Drawable drawable = this.f29432a.getDrawable();
            if (drawable == null && (iN = a1VarV.n(i.j.S, -1)) != -1 && (drawable = k.a.b(this.f29432a.getContext(), iN)) != null) {
                this.f29432a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                k0.b(drawable);
            }
            int i11 = i.j.T;
            if (a1VarV.s(i11)) {
                d3.f.c(this.f29432a, a1VarV.c(i11));
            }
            int i12 = i.j.U;
            if (a1VarV.s(i12)) {
                d3.f.d(this.f29432a, k0.e(a1VarV.k(i12, -1), null));
            }
        } finally {
            a1VarV.x();
        }
    }

    public void h(@NonNull Drawable drawable) {
        this.f29435e = drawable.getLevel();
    }

    public void i(int i10) {
        if (i10 != 0) {
            Drawable drawableB = k.a.b(this.f29432a.getContext(), i10);
            if (drawableB != null) {
                k0.b(drawableB);
            }
            this.f29432a.setImageDrawable(drawableB);
        } else {
            this.f29432a.setImageDrawable(null);
        }
        c();
    }

    public void j(ColorStateList colorStateList) {
        if (this.f29433c == null) {
            this.f29433c = new y0();
        }
        y0 y0Var = this.f29433c;
        y0Var.f29506a = colorStateList;
        y0Var.f29508d = true;
        c();
    }

    public void k(PorterDuff.Mode mode) {
        if (this.f29433c == null) {
            this.f29433c = new y0();
        }
        y0 y0Var = this.f29433c;
        y0Var.b = mode;
        y0Var.f29507c = true;
        c();
    }

    public final boolean l() {
        return this.b != null;
    }
}
