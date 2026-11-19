package q;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final CheckedTextView f29528a;
    public ColorStateList b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f29529c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f29530d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f29531e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f29532f;

    public i(@NonNull CheckedTextView checkedTextView) {
        this.f29528a = checkedTextView;
    }

    public void a() {
        Drawable drawableA = d3.c.a(this.f29528a);
        if (drawableA != null) {
            if (this.f29530d || this.f29531e) {
                Drawable drawableMutate = q2.a.r(drawableA).mutate();
                if (this.f29530d) {
                    q2.a.o(drawableMutate, this.b);
                }
                if (this.f29531e) {
                    q2.a.p(drawableMutate, this.f29529c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f29528a.getDrawableState());
                }
                this.f29528a.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public ColorStateList b() {
        return this.b;
    }

    public PorterDuff.Mode c() {
        return this.f29529c;
    }

    public void d(AttributeSet attributeSet, int i10) {
        int iN;
        int iN2;
        b1 b1VarV = b1.v(this.f29528a.getContext(), attributeSet, i.j.R0, i10, 0);
        CheckedTextView checkedTextView = this.f29528a;
        androidx.core.view.o0.k0(checkedTextView, checkedTextView.getContext(), i.j.R0, attributeSet, b1VarV.r(), i10, 0);
        try {
            if (b1VarV.s(i.j.T0) && (iN2 = b1VarV.n(i.j.T0, 0)) != 0) {
                try {
                    CheckedTextView checkedTextView2 = this.f29528a;
                    checkedTextView2.setCheckMarkDrawable(k.a.b(checkedTextView2.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                    if (b1VarV.s(i.j.S0)) {
                        CheckedTextView checkedTextView3 = this.f29528a;
                        checkedTextView3.setCheckMarkDrawable(k.a.b(checkedTextView3.getContext(), iN));
                    }
                }
            } else if (b1VarV.s(i.j.S0) && (iN = b1VarV.n(i.j.S0, 0)) != 0) {
                CheckedTextView checkedTextView4 = this.f29528a;
                checkedTextView4.setCheckMarkDrawable(k.a.b(checkedTextView4.getContext(), iN));
            }
            if (b1VarV.s(i.j.U0)) {
                d3.c.b(this.f29528a, b1VarV.c(i.j.U0));
            }
            if (b1VarV.s(i.j.V0)) {
                d3.c.c(this.f29528a, l0.e(b1VarV.k(i.j.V0, -1), null));
            }
        } finally {
            b1VarV.x();
        }
    }

    public void e() {
        if (this.f29532f) {
            this.f29532f = false;
        } else {
            this.f29532f = true;
            a();
        }
    }

    public void f(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.f29530d = true;
        a();
    }

    public void g(PorterDuff.Mode mode) {
        this.f29529c = mode;
        this.f29531e = true;
        a();
    }
}
