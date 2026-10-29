package p365q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.C0625o0;
import p181i.C6598j;

/* JADX INFO: renamed from: q.e */
/* JADX INFO: loaded from: classes.dex */
public class C10367e {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f37298a;

    /* JADX INFO: renamed from: d */
    public C10412y0 f37301d;

    /* JADX INFO: renamed from: e */
    public C10412y0 f37302e;

    /* JADX INFO: renamed from: f */
    public C10412y0 f37303f;

    /* JADX INFO: renamed from: c */
    public int f37300c = -1;

    /* JADX INFO: renamed from: b */
    public final C10383k f37299b = C10383k.m39862b();

    public C10367e(@NonNull View view) {
        this.f37298a = view;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m39823a(@NonNull Drawable drawable) {
        if (this.f37303f == null) {
            this.f37303f = new C10412y0();
        }
        C10412y0 c10412y0 = this.f37303f;
        c10412y0.m40074a();
        ColorStateList colorStateListM3049r = C0625o0.m3049r(this.f37298a);
        if (colorStateListM3049r != null) {
            c10412y0.f37523d = true;
            c10412y0.f37520a = colorStateListM3049r;
        }
        PorterDuff.Mode modeM3051s = C0625o0.m3051s(this.f37298a);
        if (modeM3051s != null) {
            c10412y0.f37522c = true;
            c10412y0.f37521b = modeM3051s;
        }
        if (!c10412y0.f37523d && !c10412y0.f37522c) {
            return false;
        }
        C10383k.m39865i(drawable, c10412y0, this.f37298a.getDrawableState());
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m39824b() {
        Drawable background = this.f37298a.getBackground();
        if (background != null) {
            if (m39833k() && m39823a(background)) {
                return;
            }
            C10412y0 c10412y0 = this.f37302e;
            if (c10412y0 != null) {
                C10383k.m39865i(background, c10412y0, this.f37298a.getDrawableState());
                return;
            }
            C10412y0 c10412y1 = this.f37301d;
            if (c10412y1 != null) {
                C10383k.m39865i(background, c10412y1, this.f37298a.getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public ColorStateList m39825c() {
        C10412y0 c10412y0 = this.f37302e;
        if (c10412y0 != null) {
            return c10412y0.f37520a;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public PorterDuff.Mode m39826d() {
        C10412y0 c10412y0 = this.f37302e;
        if (c10412y0 != null) {
            return c10412y0.f37521b;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public void m39827e(AttributeSet attributeSet, int i10) {
        Context context = this.f37298a.getContext();
        int[] iArr = C6598j.f25266M3;
        C10357a1 c10357a1M39728v = C10357a1.m39728v(context, attributeSet, iArr, i10, 0);
        View view = this.f37298a;
        C0625o0.m3036k0(view, view.getContext(), iArr, attributeSet, c10357a1M39728v.m39746r(), i10, 0);
        try {
            int i11 = C6598j.f25271N3;
            if (c10357a1M39728v.m39747s(i11)) {
                this.f37300c = c10357a1M39728v.m39742n(i11, -1);
                ColorStateList colorStateListM39868f = this.f37299b.m39868f(this.f37298a.getContext(), this.f37300c);
                if (colorStateListM39868f != null) {
                    m39830h(colorStateListM39868f);
                }
            }
            int i12 = C6598j.f25276O3;
            if (c10357a1M39728v.m39747s(i12)) {
                C0625o0.m3050r0(this.f37298a, c10357a1M39728v.m39731c(i12));
            }
            int i13 = C6598j.f25281P3;
            if (c10357a1M39728v.m39747s(i13)) {
                C0625o0.m3052s0(this.f37298a, C10384k0.m39887e(c10357a1M39728v.m39739k(i13, -1), null));
            }
        } finally {
            c10357a1M39728v.m39749x();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m39828f(Drawable drawable) {
        this.f37300c = -1;
        m39830h(null);
        m39824b();
    }

    /* JADX INFO: renamed from: g */
    public void m39829g(int i10) {
        this.f37300c = i10;
        C10383k c10383k = this.f37299b;
        m39830h(c10383k != null ? c10383k.m39868f(this.f37298a.getContext(), i10) : null);
        m39824b();
    }

    /* JADX INFO: renamed from: h */
    public void m39830h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f37301d == null) {
                this.f37301d = new C10412y0();
            }
            C10412y0 c10412y0 = this.f37301d;
            c10412y0.f37520a = colorStateList;
            c10412y0.f37523d = true;
        } else {
            this.f37301d = null;
        }
        m39824b();
    }

    /* JADX INFO: renamed from: i */
    public void m39831i(ColorStateList colorStateList) {
        if (this.f37302e == null) {
            this.f37302e = new C10412y0();
        }
        C10412y0 c10412y0 = this.f37302e;
        c10412y0.f37520a = colorStateList;
        c10412y0.f37523d = true;
        m39824b();
    }

    /* JADX INFO: renamed from: j */
    public void m39832j(PorterDuff.Mode mode) {
        if (this.f37302e == null) {
            this.f37302e = new C10412y0();
        }
        C10412y0 c10412y0 = this.f37302e;
        c10412y0.f37521b = mode;
        c10412y0.f37522c = true;
        m39824b();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m39833k() {
        return this.f37301d != null;
    }
}
