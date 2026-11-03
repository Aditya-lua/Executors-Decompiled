package q;

import android.content.Context;
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
    public final CheckedTextView f29341a;
    public ColorStateList b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f29342c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f29343d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f29344e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f29345f;

    public i(@NonNull CheckedTextView checkedTextView) {
        this.f29341a = checkedTextView;
    }

    public void a() {
        Drawable drawableA = d3.c.a(this.f29341a);
        if (drawableA != null) {
            if (this.f29343d || this.f29344e) {
                Drawable drawableMutate = q2.a.r(drawableA).mutate();
                if (this.f29343d) {
                    q2.a.o(drawableMutate, this.b);
                }
                if (this.f29344e) {
                    q2.a.p(drawableMutate, this.f29342c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f29341a.getDrawableState());
                }
                this.f29341a.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public ColorStateList b() {
        return this.b;
    }

    public PorterDuff.Mode c() {
        return this.f29342c;
    }

    public void d(AttributeSet attributeSet, int i10) {
        int i11;
        int iN;
        int iN2;
        Context context = this.f29341a.getContext();
        int[] iArr = i.j.R0;
        a1 a1VarV = a1.v(context, attributeSet, iArr, i10, 0);
        CheckedTextView checkedTextView = this.f29341a;
        androidx.core.view.o0.k0(checkedTextView, checkedTextView.getContext(), iArr, attributeSet, a1VarV.r(), i10, 0);
        try {
            int i12 = i.j.T0;
            if (!a1VarV.s(i12) || (iN2 = a1VarV.n(i12, 0)) == 0) {
                i11 = i.j.S0;
                if (a1VarV.s(i11) && (iN = a1VarV.n(i11, 0)) != 0) {
                    CheckedTextView checkedTextView2 = this.f29341a;
                    checkedTextView2.setCheckMarkDrawable(k.a.b(checkedTextView2.getContext(), iN));
                }
            } else {
                try {
                    CheckedTextView checkedTextView3 = this.f29341a;
                    checkedTextView3.setCheckMarkDrawable(k.a.b(checkedTextView3.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                    i11 = i.j.S0;
                    if (a1VarV.s(i11)) {
                        CheckedTextView checkedTextView4 = this.f29341a;
                        checkedTextView4.setCheckMarkDrawable(k.a.b(checkedTextView4.getContext(), iN));
                    }
                }
            }
            int i13 = i.j.U0;
            if (a1VarV.s(i13)) {
                d3.c.b(this.f29341a, a1VarV.c(i13));
            }
            int i14 = i.j.V0;
            if (a1VarV.s(i14)) {
                d3.c.c(this.f29341a, k0.e(a1VarV.k(i14, -1), null));
            }
        } finally {
            a1VarV.x();
        }
    }

    public void e() {
        if (this.f29345f) {
            this.f29345f = false;
        } else {
            this.f29345f = true;
            a();
        }
    }

    public void f(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.f29343d = true;
        a();
    }

    public void g(PorterDuff.Mode mode) {
        this.f29342c = mode;
        this.f29344e = true;
        a();
    }
}
