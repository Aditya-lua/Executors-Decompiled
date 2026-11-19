package q;

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
    public final ImageView f29587a;
    public z0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z0 f29588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z0 f29589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29590e = 0;

    public p(@NonNull ImageView imageView) {
        this.f29587a = imageView;
    }

    public final boolean a(@NonNull Drawable drawable) {
        if (this.f29589d == null) {
            this.f29589d = new z0();
        }
        z0 z0Var = this.f29589d;
        z0Var.a();
        ColorStateList colorStateListA = d3.f.a(this.f29587a);
        if (colorStateListA != null) {
            z0Var.f29714d = true;
            z0Var.f29712a = colorStateListA;
        }
        PorterDuff.Mode modeB = d3.f.b(this.f29587a);
        if (modeB != null) {
            z0Var.f29713c = true;
            z0Var.b = modeB;
        }
        if (!z0Var.f29714d && !z0Var.f29713c) {
            return false;
        }
        k.i(drawable, z0Var, this.f29587a.getDrawableState());
        return true;
    }

    public void b() {
        if (this.f29587a.getDrawable() != null) {
            this.f29587a.getDrawable().setLevel(this.f29590e);
        }
    }

    public void c() {
        Drawable drawable = this.f29587a.getDrawable();
        if (drawable != null) {
            l0.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            z0 z0Var = this.f29588c;
            if (z0Var != null) {
                k.i(drawable, z0Var, this.f29587a.getDrawableState());
                return;
            }
            z0 z0Var2 = this.b;
            if (z0Var2 != null) {
                k.i(drawable, z0Var2, this.f29587a.getDrawableState());
            }
        }
    }

    public ColorStateList d() {
        z0 z0Var = this.f29588c;
        if (z0Var != null) {
            return z0Var.f29712a;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        z0 z0Var = this.f29588c;
        if (z0Var != null) {
            return z0Var.b;
        }
        return null;
    }

    public boolean f() {
        return !(this.f29587a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i10) {
        int iN;
        b1 b1VarV = b1.v(this.f29587a.getContext(), attributeSet, i.j.R, i10, 0);
        ImageView imageView = this.f29587a;
        androidx.core.view.o0.k0(imageView, imageView.getContext(), i.j.R, attributeSet, b1VarV.r(), i10, 0);
        try {
            Drawable drawable = this.f29587a.getDrawable();
            if (drawable == null && (iN = b1VarV.n(i.j.S, -1)) != -1 && (drawable = k.a.b(this.f29587a.getContext(), iN)) != null) {
                this.f29587a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                l0.b(drawable);
            }
            if (b1VarV.s(i.j.T)) {
                d3.f.c(this.f29587a, b1VarV.c(i.j.T));
            }
            if (b1VarV.s(i.j.U)) {
                d3.f.d(this.f29587a, l0.e(b1VarV.k(i.j.U, -1), null));
            }
        } finally {
            b1VarV.x();
        }
    }

    public void h(@NonNull Drawable drawable) {
        this.f29590e = drawable.getLevel();
    }

    public void i(int i10) {
        if (i10 != 0) {
            Drawable drawableB = k.a.b(this.f29587a.getContext(), i10);
            if (drawableB != null) {
                l0.b(drawableB);
            }
            this.f29587a.setImageDrawable(drawableB);
        } else {
            this.f29587a.setImageDrawable(null);
        }
        c();
    }

    public void j(ColorStateList colorStateList) {
        if (this.f29588c == null) {
            this.f29588c = new z0();
        }
        z0 z0Var = this.f29588c;
        z0Var.f29712a = colorStateList;
        z0Var.f29714d = true;
        c();
    }

    public void k(PorterDuff.Mode mode) {
        if (this.f29588c == null) {
            this.f29588c = new z0();
        }
        z0 z0Var = this.f29588c;
        z0Var.b = mode;
        z0Var.f29713c = true;
        c();
    }

    public final boolean l() {
        return this.b != null;
    }
}
