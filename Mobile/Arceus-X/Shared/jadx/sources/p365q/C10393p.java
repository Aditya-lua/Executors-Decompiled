package p365q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.core.view.C0625o0;
import p066d3.C4428f;
import p181i.C6598j;
import p232k.C7399a;

/* JADX INFO: renamed from: q.p */
/* JADX INFO: loaded from: classes.dex */
public class C10393p {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ImageView f37433a;

    /* JADX INFO: renamed from: b */
    public C10412y0 f37434b;

    /* JADX INFO: renamed from: c */
    public C10412y0 f37435c;

    /* JADX INFO: renamed from: d */
    public C10412y0 f37436d;

    /* JADX INFO: renamed from: e */
    public int f37437e = 0;

    public C10393p(@NonNull ImageView imageView) {
        this.f37433a = imageView;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m39975a(@NonNull Drawable drawable) {
        if (this.f37436d == null) {
            this.f37436d = new C10412y0();
        }
        C10412y0 c10412y0 = this.f37436d;
        c10412y0.m40074a();
        ColorStateList colorStateListM22281a = C4428f.m22281a(this.f37433a);
        if (colorStateListM22281a != null) {
            c10412y0.f37523d = true;
            c10412y0.f37520a = colorStateListM22281a;
        }
        PorterDuff.Mode modeM22282b = C4428f.m22282b(this.f37433a);
        if (modeM22282b != null) {
            c10412y0.f37522c = true;
            c10412y0.f37521b = modeM22282b;
        }
        if (!c10412y0.f37523d && !c10412y0.f37522c) {
            return false;
        }
        C10383k.m39865i(drawable, c10412y0, this.f37433a.getDrawableState());
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m39976b() {
        if (this.f37433a.getDrawable() != null) {
            this.f37433a.getDrawable().setLevel(this.f37437e);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m39977c() {
        Drawable drawable = this.f37433a.getDrawable();
        if (drawable != null) {
            C10384k0.m39884b(drawable);
        }
        if (drawable != null) {
            if (m39986l() && m39975a(drawable)) {
                return;
            }
            C10412y0 c10412y0 = this.f37435c;
            if (c10412y0 != null) {
                C10383k.m39865i(drawable, c10412y0, this.f37433a.getDrawableState());
                return;
            }
            C10412y0 c10412y1 = this.f37434b;
            if (c10412y1 != null) {
                C10383k.m39865i(drawable, c10412y1, this.f37433a.getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public ColorStateList m39978d() {
        C10412y0 c10412y0 = this.f37435c;
        if (c10412y0 != null) {
            return c10412y0.f37520a;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public PorterDuff.Mode m39979e() {
        C10412y0 c10412y0 = this.f37435c;
        if (c10412y0 != null) {
            return c10412y0.f37521b;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public boolean m39980f() {
        return !(this.f37433a.getBackground() instanceof RippleDrawable);
    }

    /* JADX INFO: renamed from: g */
    public void m39981g(AttributeSet attributeSet, int i10) {
        int iM39742n;
        Context context = this.f37433a.getContext();
        int[] iArr = C6598j.f25287R;
        C10357a1 c10357a1M39728v = C10357a1.m39728v(context, attributeSet, iArr, i10, 0);
        ImageView imageView = this.f37433a;
        C0625o0.m3036k0(imageView, imageView.getContext(), iArr, attributeSet, c10357a1M39728v.m39746r(), i10, 0);
        try {
            Drawable drawable = this.f37433a.getDrawable();
            if (drawable == null && (iM39742n = c10357a1M39728v.m39742n(C6598j.f25292S, -1)) != -1 && (drawable = C7399a.m30679b(this.f37433a.getContext(), iM39742n)) != null) {
                this.f37433a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C10384k0.m39884b(drawable);
            }
            int i11 = C6598j.f25297T;
            if (c10357a1M39728v.m39747s(i11)) {
                C4428f.m22283c(this.f37433a, c10357a1M39728v.m39731c(i11));
            }
            int i12 = C6598j.f25302U;
            if (c10357a1M39728v.m39747s(i12)) {
                C4428f.m22284d(this.f37433a, C10384k0.m39887e(c10357a1M39728v.m39739k(i12, -1), null));
            }
        } finally {
            c10357a1M39728v.m39749x();
        }
    }

    /* JADX INFO: renamed from: h */
    public void m39982h(@NonNull Drawable drawable) {
        this.f37437e = drawable.getLevel();
    }

    /* JADX INFO: renamed from: i */
    public void m39983i(int i10) {
        if (i10 != 0) {
            Drawable drawableM30679b = C7399a.m30679b(this.f37433a.getContext(), i10);
            if (drawableM30679b != null) {
                C10384k0.m39884b(drawableM30679b);
            }
            this.f37433a.setImageDrawable(drawableM30679b);
        } else {
            this.f37433a.setImageDrawable(null);
        }
        m39977c();
    }

    /* JADX INFO: renamed from: j */
    public void m39984j(ColorStateList colorStateList) {
        if (this.f37435c == null) {
            this.f37435c = new C10412y0();
        }
        C10412y0 c10412y0 = this.f37435c;
        c10412y0.f37520a = colorStateList;
        c10412y0.f37523d = true;
        m39977c();
    }

    /* JADX INFO: renamed from: k */
    public void m39985k(PorterDuff.Mode mode) {
        if (this.f37435c == null) {
            this.f37435c = new C10412y0();
        }
        C10412y0 c10412y0 = this.f37435c;
        c10412y0.f37521b = mode;
        c10412y0.f37522c = true;
        m39977c();
    }

    /* JADX INFO: renamed from: l */
    public final boolean m39986l() {
        return this.f37434b != null;
    }
}
