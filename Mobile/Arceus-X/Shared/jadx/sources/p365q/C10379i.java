package p365q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;
import androidx.core.view.C0625o0;
import p066d3.C4425c;
import p181i.C6598j;
import p232k.C7399a;
import p368q2.C10425a;

/* JADX INFO: renamed from: q.i */
/* JADX INFO: loaded from: classes.dex */
public class C10379i {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final CheckedTextView f37320a;

    /* JADX INFO: renamed from: b */
    public ColorStateList f37321b = null;

    /* JADX INFO: renamed from: c */
    public PorterDuff.Mode f37322c = null;

    /* JADX INFO: renamed from: d */
    public boolean f37323d = false;

    /* JADX INFO: renamed from: e */
    public boolean f37324e = false;

    /* JADX INFO: renamed from: f */
    public boolean f37325f;

    public C10379i(@NonNull CheckedTextView checkedTextView) {
        this.f37320a = checkedTextView;
    }

    /* JADX INFO: renamed from: a */
    public void m39845a() {
        Drawable drawableM22258a = C4425c.m22258a(this.f37320a);
        if (drawableM22258a != null) {
            if (this.f37323d || this.f37324e) {
                Drawable drawableMutate = C10425a.m40121r(drawableM22258a).mutate();
                if (this.f37323d) {
                    C10425a.m40118o(drawableMutate, this.f37321b);
                }
                if (this.f37324e) {
                    C10425a.m40119p(drawableMutate, this.f37322c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f37320a.getDrawableState());
                }
                this.f37320a.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public ColorStateList m39846b() {
        return this.f37321b;
    }

    /* JADX INFO: renamed from: c */
    public PorterDuff.Mode m39847c() {
        return this.f37322c;
    }

    /* JADX INFO: renamed from: d */
    public void m39848d(AttributeSet attributeSet, int i10) {
        int i11;
        int iM39742n;
        int iM39742n2;
        Context context = this.f37320a.getContext();
        int[] iArr = C6598j.f25288R0;
        C10357a1 c10357a1M39728v = C10357a1.m39728v(context, attributeSet, iArr, i10, 0);
        CheckedTextView checkedTextView = this.f37320a;
        C0625o0.m3036k0(checkedTextView, checkedTextView.getContext(), iArr, attributeSet, c10357a1M39728v.m39746r(), i10, 0);
        try {
            int i12 = C6598j.f25298T0;
            if (!c10357a1M39728v.m39747s(i12) || (iM39742n2 = c10357a1M39728v.m39742n(i12, 0)) == 0) {
                i11 = C6598j.f25293S0;
                if (c10357a1M39728v.m39747s(i11) && (iM39742n = c10357a1M39728v.m39742n(i11, 0)) != 0) {
                    CheckedTextView checkedTextView2 = this.f37320a;
                    checkedTextView2.setCheckMarkDrawable(C7399a.m30679b(checkedTextView2.getContext(), iM39742n));
                }
            } else {
                try {
                    CheckedTextView checkedTextView3 = this.f37320a;
                    checkedTextView3.setCheckMarkDrawable(C7399a.m30679b(checkedTextView3.getContext(), iM39742n2));
                } catch (Resources.NotFoundException unused) {
                    i11 = C6598j.f25293S0;
                    if (c10357a1M39728v.m39747s(i11)) {
                        CheckedTextView checkedTextView4 = this.f37320a;
                        checkedTextView4.setCheckMarkDrawable(C7399a.m30679b(checkedTextView4.getContext(), iM39742n));
                    }
                }
            }
            int i13 = C6598j.f25303U0;
            if (c10357a1M39728v.m39747s(i13)) {
                C4425c.m22259b(this.f37320a, c10357a1M39728v.m39731c(i13));
            }
            int i14 = C6598j.f25307V0;
            if (c10357a1M39728v.m39747s(i14)) {
                C4425c.m22260c(this.f37320a, C10384k0.m39887e(c10357a1M39728v.m39739k(i14, -1), null));
            }
        } finally {
            c10357a1M39728v.m39749x();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m39849e() {
        if (this.f37325f) {
            this.f37325f = false;
        } else {
            this.f37325f = true;
            m39845a();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m39850f(ColorStateList colorStateList) {
        this.f37321b = colorStateList;
        this.f37323d = true;
        m39845a();
    }

    /* JADX INFO: renamed from: g */
    public void m39851g(PorterDuff.Mode mode) {
        this.f37322c = mode;
        this.f37324e = true;
        m39845a();
    }
}
