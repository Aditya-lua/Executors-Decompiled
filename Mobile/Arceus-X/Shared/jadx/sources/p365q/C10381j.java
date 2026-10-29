package p365q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.core.view.C0625o0;
import p066d3.C4426d;
import p181i.C6598j;
import p232k.C7399a;
import p368q2.C10425a;

/* JADX INFO: renamed from: q.j */
/* JADX INFO: loaded from: classes.dex */
public class C10381j {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final CompoundButton f37326a;

    /* JADX INFO: renamed from: b */
    public ColorStateList f37327b = null;

    /* JADX INFO: renamed from: c */
    public PorterDuff.Mode f37328c = null;

    /* JADX INFO: renamed from: d */
    public boolean f37329d = false;

    /* JADX INFO: renamed from: e */
    public boolean f37330e = false;

    /* JADX INFO: renamed from: f */
    public boolean f37331f;

    public C10381j(@NonNull CompoundButton compoundButton) {
        this.f37326a = compoundButton;
    }

    /* JADX INFO: renamed from: a */
    public void m39853a() {
        Drawable drawableM22263a = C4426d.m22263a(this.f37326a);
        if (drawableM22263a != null) {
            if (this.f37329d || this.f37330e) {
                Drawable drawableMutate = C10425a.m40121r(drawableM22263a).mutate();
                if (this.f37329d) {
                    C10425a.m40118o(drawableMutate, this.f37327b);
                }
                if (this.f37330e) {
                    C10425a.m40119p(drawableMutate, this.f37328c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f37326a.getDrawableState());
                }
                this.f37326a.setButtonDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public ColorStateList m39854b() {
        return this.f37327b;
    }

    /* JADX INFO: renamed from: c */
    public PorterDuff.Mode m39855c() {
        return this.f37328c;
    }

    /* JADX INFO: renamed from: d */
    public void m39856d(AttributeSet attributeSet, int i10) {
        int i11;
        int iM39742n;
        int iM39742n2;
        Context context = this.f37326a.getContext();
        int[] iArr = C6598j.f25311W0;
        C10357a1 c10357a1M39728v = C10357a1.m39728v(context, attributeSet, iArr, i10, 0);
        CompoundButton compoundButton = this.f37326a;
        C0625o0.m3036k0(compoundButton, compoundButton.getContext(), iArr, attributeSet, c10357a1M39728v.m39746r(), i10, 0);
        try {
            int i12 = C6598j.f25319Y0;
            if (!c10357a1M39728v.m39747s(i12) || (iM39742n2 = c10357a1M39728v.m39742n(i12, 0)) == 0) {
                i11 = C6598j.f25315X0;
                if (c10357a1M39728v.m39747s(i11) && (iM39742n = c10357a1M39728v.m39742n(i11, 0)) != 0) {
                    CompoundButton compoundButton2 = this.f37326a;
                    compoundButton2.setButtonDrawable(C7399a.m30679b(compoundButton2.getContext(), iM39742n));
                }
            } else {
                try {
                    CompoundButton compoundButton3 = this.f37326a;
                    compoundButton3.setButtonDrawable(C7399a.m30679b(compoundButton3.getContext(), iM39742n2));
                } catch (Resources.NotFoundException unused) {
                    i11 = C6598j.f25315X0;
                    if (c10357a1M39728v.m39747s(i11)) {
                        CompoundButton compoundButton4 = this.f37326a;
                        compoundButton4.setButtonDrawable(C7399a.m30679b(compoundButton4.getContext(), iM39742n));
                    }
                }
            }
            int i13 = C6598j.f25323Z0;
            if (c10357a1M39728v.m39747s(i13)) {
                C4426d.m22266d(this.f37326a, c10357a1M39728v.m39731c(i13));
            }
            int i14 = C6598j.f25328a1;
            if (c10357a1M39728v.m39747s(i14)) {
                C4426d.m22267e(this.f37326a, C10384k0.m39887e(c10357a1M39728v.m39739k(i14, -1), null));
            }
        } finally {
            c10357a1M39728v.m39749x();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m39857e() {
        if (this.f37331f) {
            this.f37331f = false;
        } else {
            this.f37331f = true;
            m39853a();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m39858f(ColorStateList colorStateList) {
        this.f37327b = colorStateList;
        this.f37329d = true;
        m39853a();
    }

    /* JADX INFO: renamed from: g */
    public void m39859g(PorterDuff.Mode mode) {
        this.f37328c = mode;
        this.f37330e = true;
        m39853a();
    }
}
