package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* JADX INFO: loaded from: classes.dex */
public class y extends t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SeekBar f29500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f29501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorStateList f29502f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f29503g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f29504h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f29505i;

    public y(SeekBar seekBar) {
        super(seekBar);
        this.f29502f = null;
        this.f29503g = null;
        this.f29504h = false;
        this.f29505i = false;
        this.f29500d = seekBar;
    }

    @Override // q.t
    public void c(AttributeSet attributeSet, int i10) {
        super.c(attributeSet, i10);
        Context context = this.f29500d.getContext();
        int[] iArr = i.j.V;
        a1 a1VarV = a1.v(context, attributeSet, iArr, i10, 0);
        SeekBar seekBar = this.f29500d;
        androidx.core.view.o0.k0(seekBar, seekBar.getContext(), iArr, attributeSet, a1VarV.r(), i10, 0);
        Drawable drawableH = a1VarV.h(i.j.W);
        if (drawableH != null) {
            this.f29500d.setThumb(drawableH);
        }
        j(a1VarV.g(i.j.X));
        int i11 = i.j.Z;
        if (a1VarV.s(i11)) {
            this.f29503g = k0.e(a1VarV.k(i11, -1), this.f29503g);
            this.f29505i = true;
        }
        int i12 = i.j.Y;
        if (a1VarV.s(i12)) {
            this.f29502f = a1VarV.c(i12);
            this.f29504h = true;
        }
        a1VarV.x();
        f();
    }

    public final void f() {
        Drawable drawable = this.f29501e;
        if (drawable != null) {
            if (this.f29504h || this.f29505i) {
                Drawable drawableR = q2.a.r(drawable.mutate());
                this.f29501e = drawableR;
                if (this.f29504h) {
                    q2.a.o(drawableR, this.f29502f);
                }
                if (this.f29505i) {
                    q2.a.p(this.f29501e, this.f29503g);
                }
                if (this.f29501e.isStateful()) {
                    this.f29501e.setState(this.f29500d.getDrawableState());
                }
            }
        }
    }

    public void g(Canvas canvas) {
        if (this.f29501e != null) {
            int max = this.f29500d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f29501e.getIntrinsicWidth();
                int intrinsicHeight = this.f29501e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f29501e.setBounds(-i10, -i11, i10, i11);
                float width = ((this.f29500d.getWidth() - this.f29500d.getPaddingLeft()) - this.f29500d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f29500d.getPaddingLeft(), this.f29500d.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f29501e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    public void h() {
        Drawable drawable = this.f29501e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f29500d.getDrawableState())) {
            this.f29500d.invalidateDrawable(drawable);
        }
    }

    public void i() {
        Drawable drawable = this.f29501e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void j(Drawable drawable) {
        Drawable drawable2 = this.f29501e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f29501e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f29500d);
            q2.a.m(drawable, this.f29500d.getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(this.f29500d.getDrawableState());
            }
            f();
        }
        this.f29500d.invalidate();
    }
}
