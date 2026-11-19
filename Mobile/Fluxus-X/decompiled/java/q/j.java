package q;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final CompoundButton f29533a;
    public ColorStateList b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f29534c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f29535d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f29536e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f29537f;

    public j(@NonNull CompoundButton compoundButton) {
        this.f29533a = compoundButton;
    }

    public void a() {
        Drawable drawableA = d3.d.a(this.f29533a);
        if (drawableA != null) {
            if (this.f29535d || this.f29536e) {
                Drawable drawableMutate = q2.a.r(drawableA).mutate();
                if (this.f29535d) {
                    q2.a.o(drawableMutate, this.b);
                }
                if (this.f29536e) {
                    q2.a.p(drawableMutate, this.f29534c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f29533a.getDrawableState());
                }
                this.f29533a.setButtonDrawable(drawableMutate);
            }
        }
    }

    public ColorStateList b() {
        return this.b;
    }

    public PorterDuff.Mode c() {
        return this.f29534c;
    }

    public void d(AttributeSet attributeSet, int i10) {
        int iN;
        int iN2;
        b1 b1VarV = b1.v(this.f29533a.getContext(), attributeSet, i.j.W0, i10, 0);
        CompoundButton compoundButton = this.f29533a;
        androidx.core.view.o0.k0(compoundButton, compoundButton.getContext(), i.j.W0, attributeSet, b1VarV.r(), i10, 0);
        try {
            if (b1VarV.s(i.j.Y0) && (iN2 = b1VarV.n(i.j.Y0, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.f29533a;
                    compoundButton2.setButtonDrawable(k.a.b(compoundButton2.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                    if (b1VarV.s(i.j.X0)) {
                        CompoundButton compoundButton3 = this.f29533a;
                        compoundButton3.setButtonDrawable(k.a.b(compoundButton3.getContext(), iN));
                    }
                }
            } else if (b1VarV.s(i.j.X0) && (iN = b1VarV.n(i.j.X0, 0)) != 0) {
                CompoundButton compoundButton4 = this.f29533a;
                compoundButton4.setButtonDrawable(k.a.b(compoundButton4.getContext(), iN));
            }
            if (b1VarV.s(i.j.Z0)) {
                d3.d.d(this.f29533a, b1VarV.c(i.j.Z0));
            }
            if (b1VarV.s(i.j.f18863a1)) {
                d3.d.e(this.f29533a, l0.e(b1VarV.k(i.j.f18863a1, -1), null));
            }
        } finally {
            b1VarV.x();
        }
    }

    public void e() {
        if (this.f29537f) {
            this.f29537f = false;
        } else {
            this.f29537f = true;
            a();
        }
    }

    public void f(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.f29535d = true;
        a();
    }

    public void g(PorterDuff.Mode mode) {
        this.f29534c = mode;
        this.f29536e = true;
        a();
    }
}
