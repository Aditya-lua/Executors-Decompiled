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
    public final CompoundButton f29346a;
    public ColorStateList b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f29347c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f29348d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f29349e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f29350f;

    public j(@NonNull CompoundButton compoundButton) {
        this.f29346a = compoundButton;
    }

    public void a() {
        Drawable drawableA = d3.d.a(this.f29346a);
        if (drawableA != null) {
            if (this.f29348d || this.f29349e) {
                Drawable drawableMutate = q2.a.r(drawableA).mutate();
                if (this.f29348d) {
                    q2.a.o(drawableMutate, this.b);
                }
                if (this.f29349e) {
                    q2.a.p(drawableMutate, this.f29347c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f29346a.getDrawableState());
                }
                this.f29346a.setButtonDrawable(drawableMutate);
            }
        }
    }

    public ColorStateList b() {
        return this.b;
    }

    public PorterDuff.Mode c() {
        return this.f29347c;
    }

    public void d(AttributeSet attributeSet, int i10) {
        int i11;
        int iN;
        int iN2;
        Context context = this.f29346a.getContext();
        int[] iArr = i.j.W0;
        a1 a1VarV = a1.v(context, attributeSet, iArr, i10, 0);
        CompoundButton compoundButton = this.f29346a;
        androidx.core.view.o0.k0(compoundButton, compoundButton.getContext(), iArr, attributeSet, a1VarV.r(), i10, 0);
        try {
            int i12 = i.j.Y0;
            if (!a1VarV.s(i12) || (iN2 = a1VarV.n(i12, 0)) == 0) {
                i11 = i.j.X0;
                if (a1VarV.s(i11) && (iN = a1VarV.n(i11, 0)) != 0) {
                    CompoundButton compoundButton2 = this.f29346a;
                    compoundButton2.setButtonDrawable(k.a.b(compoundButton2.getContext(), iN));
                }
            } else {
                try {
                    CompoundButton compoundButton3 = this.f29346a;
                    compoundButton3.setButtonDrawable(k.a.b(compoundButton3.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                    i11 = i.j.X0;
                    if (a1VarV.s(i11)) {
                        CompoundButton compoundButton4 = this.f29346a;
                        compoundButton4.setButtonDrawable(k.a.b(compoundButton4.getContext(), iN));
                    }
                }
            }
            int i13 = i.j.Z0;
            if (a1VarV.s(i13)) {
                d3.d.d(this.f29346a, a1VarV.c(i13));
            }
            int i14 = i.j.f20136a1;
            if (a1VarV.s(i14)) {
                d3.d.e(this.f29346a, k0.e(a1VarV.k(i14, -1), null));
            }
        } finally {
            a1VarV.x();
        }
    }

    public void e() {
        if (this.f29350f) {
            this.f29350f = false;
        } else {
            this.f29350f = true;
            a();
        }
    }

    public void f(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.f29348d = true;
        a();
    }

    public void g(PorterDuff.Mode mode) {
        this.f29347c = mode;
        this.f29349e = true;
        a();
    }
}
