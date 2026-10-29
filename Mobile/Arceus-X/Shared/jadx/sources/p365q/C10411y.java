package p365q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.view.C0625o0;
import p181i.C6598j;
import p368q2.C10425a;

/* JADX INFO: renamed from: q.y */
/* JADX INFO: loaded from: classes.dex */
public class C10411y extends C10401t {

    /* JADX INFO: renamed from: d */
    public final SeekBar f37514d;

    /* JADX INFO: renamed from: e */
    public Drawable f37515e;

    /* JADX INFO: renamed from: f */
    public ColorStateList f37516f;

    /* JADX INFO: renamed from: g */
    public PorterDuff.Mode f37517g;

    /* JADX INFO: renamed from: h */
    public boolean f37518h;

    /* JADX INFO: renamed from: i */
    public boolean f37519i;

    public C10411y(SeekBar seekBar) {
        super(seekBar);
        this.f37516f = null;
        this.f37517g = null;
        this.f37518h = false;
        this.f37519i = false;
        this.f37514d = seekBar;
    }

    @Override // p365q.C10401t
    /* JADX INFO: renamed from: c */
    public void mo40027c(AttributeSet attributeSet, int i10) {
        super.mo40027c(attributeSet, i10);
        Context context = this.f37514d.getContext();
        int[] iArr = C6598j.f25306V;
        C10357a1 c10357a1M39728v = C10357a1.m39728v(context, attributeSet, iArr, i10, 0);
        SeekBar seekBar = this.f37514d;
        C0625o0.m3036k0(seekBar, seekBar.getContext(), iArr, attributeSet, c10357a1M39728v.m39746r(), i10, 0);
        Drawable drawableM39736h = c10357a1M39728v.m39736h(C6598j.f25310W);
        if (drawableM39736h != null) {
            this.f37514d.setThumb(drawableM39736h);
        }
        m40073j(c10357a1M39728v.m39735g(C6598j.f25314X));
        int i11 = C6598j.f25322Z;
        if (c10357a1M39728v.m39747s(i11)) {
            this.f37517g = C10384k0.m39887e(c10357a1M39728v.m39739k(i11, -1), this.f37517g);
            this.f37519i = true;
        }
        int i12 = C6598j.f25318Y;
        if (c10357a1M39728v.m39747s(i12)) {
            this.f37516f = c10357a1M39728v.m39731c(i12);
            this.f37518h = true;
        }
        c10357a1M39728v.m39749x();
        m40069f();
    }

    /* JADX INFO: renamed from: f */
    public final void m40069f() {
        Drawable drawable = this.f37515e;
        if (drawable != null) {
            if (this.f37518h || this.f37519i) {
                Drawable drawableM40121r = C10425a.m40121r(drawable.mutate());
                this.f37515e = drawableM40121r;
                if (this.f37518h) {
                    C10425a.m40118o(drawableM40121r, this.f37516f);
                }
                if (this.f37519i) {
                    C10425a.m40119p(this.f37515e, this.f37517g);
                }
                if (this.f37515e.isStateful()) {
                    this.f37515e.setState(this.f37514d.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m40070g(Canvas canvas) {
        if (this.f37515e != null) {
            int max = this.f37514d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f37515e.getIntrinsicWidth();
                int intrinsicHeight = this.f37515e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f37515e.setBounds(-i10, -i11, i10, i11);
                float width = ((this.f37514d.getWidth() - this.f37514d.getPaddingLeft()) - this.f37514d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f37514d.getPaddingLeft(), this.f37514d.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f37515e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m40071h() {
        Drawable drawable = this.f37515e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f37514d.getDrawableState())) {
            this.f37514d.invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m40072i() {
        Drawable drawable = this.f37515e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX INFO: renamed from: j */
    public void m40073j(Drawable drawable) {
        Drawable drawable2 = this.f37515e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f37515e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f37514d);
            C10425a.m40116m(drawable, this.f37514d.getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(this.f37514d.getDrawableState());
            }
            m40069f();
        }
        this.f37514d.invalidate();
    }
}
