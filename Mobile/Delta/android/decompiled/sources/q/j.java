package q;

import android.content.Context;
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
    public final CompoundButton f28993a;
    public ColorStateList b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f28994c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f28995d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f28996e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f28997f;

    public j(@NonNull CompoundButton compoundButton) {
        this.f28993a = compoundButton;
    }

    public void a() {
        Drawable drawableA = d3.d.a(this.f28993a);
        if (drawableA != null) {
            if (this.f28995d || this.f28996e) {
                Drawable drawableMutate = q2.a.r(drawableA).mutate();
                if (this.f28995d) {
                    q2.a.o(drawableMutate, this.b);
                }
                if (this.f28996e) {
                    q2.a.p(drawableMutate, this.f28994c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f28993a.getDrawableState());
                }
                this.f28993a.setButtonDrawable(drawableMutate);
            }
        }
    }

    public ColorStateList b() {
        return this.b;
    }

    public PorterDuff.Mode c() {
        return this.f28994c;
    }

    public void d(AttributeSet attributeSet, int i10) {
        int i11;
        int iN;
        int iN2;
        Context context = this.f28993a.getContext();
        int[] iArr = i.j.W0;
        a1 a1VarV = a1.v(context, attributeSet, iArr, i10, 0);
        CompoundButton compoundButton = this.f28993a;
        androidx.core.view.o0.k0(compoundButton, compoundButton.getContext(), iArr, attributeSet, a1VarV.r(), i10, 0);
        try {
            int i12 = i.j.Y0;
            if (!a1VarV.s(i12) || (iN2 = a1VarV.n(i12, 0)) == 0) {
                i11 = i.j.X0;
                if (a1VarV.s(i11) && (iN = a1VarV.n(i11, 0)) != 0) {
                    CompoundButton compoundButton2 = this.f28993a;
                    compoundButton2.setButtonDrawable(k.a.b(compoundButton2.getContext(), iN));
                }
            } else {
                try {
                    CompoundButton compoundButton3 = this.f28993a;
                    compoundButton3.setButtonDrawable(k.a.b(compoundButton3.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                    i11 = i.j.X0;
                    if (a1VarV.s(i11)) {
                        CompoundButton compoundButton4 = this.f28993a;
                        compoundButton4.setButtonDrawable(k.a.b(compoundButton4.getContext(), iN));
                    }
                }
            }
            int i13 = i.j.Z0;
            if (a1VarV.s(i13)) {
                d3.d.d(this.f28993a, a1VarV.c(i13));
            }
            int i14 = i.j.f20020a1;
            if (a1VarV.s(i14)) {
                d3.d.e(this.f28993a, k0.e(a1VarV.k(i14, -1), null));
            }
        } finally {
            a1VarV.x();
        }
    }

    public void e() {
        if (this.f28997f) {
            this.f28997f = false;
        } else {
            this.f28997f = true;
            a();
        }
    }

    public void f(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.f28995d = true;
        a();
    }

    public void g(PorterDuff.Mode mode) {
        this.f28994c = mode;
        this.f28996e = true;
        a();
    }
}
