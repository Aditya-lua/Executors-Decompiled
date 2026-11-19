package q;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* JADX INFO: loaded from: classes.dex */
public class y extends t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SeekBar f29684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f29685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorStateList f29686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f29687g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f29688h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f29689i;

    public y(SeekBar seekBar) {
        super(seekBar);
        this.f29686f = null;
        this.f29687g = null;
        this.f29688h = false;
        this.f29689i = false;
        this.f29684d = seekBar;
    }

    @Override // q.t
    public void c(AttributeSet attributeSet, int i10) {
        super.c(attributeSet, i10);
        b1 b1VarV = b1.v(this.f29684d.getContext(), attributeSet, i.j.V, i10, 0);
        SeekBar seekBar = this.f29684d;
        androidx.core.view.o0.k0(seekBar, seekBar.getContext(), i.j.V, attributeSet, b1VarV.r(), i10, 0);
        Drawable drawableH = b1VarV.h(i.j.W);
        if (drawableH != null) {
            this.f29684d.setThumb(drawableH);
        }
        j(b1VarV.g(i.j.X));
        if (b1VarV.s(i.j.Z)) {
            this.f29687g = l0.e(b1VarV.k(i.j.Z, -1), this.f29687g);
            this.f29689i = true;
        }
        if (b1VarV.s(i.j.Y)) {
            this.f29686f = b1VarV.c(i.j.Y);
            this.f29688h = true;
        }
        b1VarV.x();
        f();
    }

    public final void f() {
        Drawable drawable = this.f29685e;
        if (drawable != null) {
            if (this.f29688h || this.f29689i) {
                Drawable drawableR = q2.a.r(drawable.mutate());
                this.f29685e = drawableR;
                if (this.f29688h) {
                    q2.a.o(drawableR, this.f29686f);
                }
                if (this.f29689i) {
                    q2.a.p(this.f29685e, this.f29687g);
                }
                if (this.f29685e.isStateful()) {
                    this.f29685e.setState(this.f29684d.getDrawableState());
                }
            }
        }
    }

    public void g(Canvas canvas) {
        if (this.f29685e != null) {
            int max = this.f29684d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f29685e.getIntrinsicWidth();
                int intrinsicHeight = this.f29685e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f29685e.setBounds(-i10, -i11, i10, i11);
                float width = ((this.f29684d.getWidth() - this.f29684d.getPaddingLeft()) - this.f29684d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f29684d.getPaddingLeft(), this.f29684d.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f29685e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    public void h() {
        Drawable drawable = this.f29685e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f29684d.getDrawableState())) {
            this.f29684d.invalidateDrawable(drawable);
        }
    }

    public void i() {
        Drawable drawable = this.f29685e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void j(Drawable drawable) {
        Drawable drawable2 = this.f29685e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f29685e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f29684d);
            q2.a.m(drawable, this.f29684d.getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(this.f29684d.getDrawableState());
            }
            f();
        }
        this.f29684d.invalidate();
    }
}
