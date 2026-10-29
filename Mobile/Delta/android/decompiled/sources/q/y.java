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
    public final SeekBar f29147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f29148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorStateList f29149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f29150g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f29151h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f29152i;

    public y(SeekBar seekBar) {
        super(seekBar);
        this.f29149f = null;
        this.f29150g = null;
        this.f29151h = false;
        this.f29152i = false;
        this.f29147d = seekBar;
    }

    @Override // q.t
    public void c(AttributeSet attributeSet, int i10) {
        super.c(attributeSet, i10);
        Context context = this.f29147d.getContext();
        int[] iArr = i.j.V;
        a1 a1VarV = a1.v(context, attributeSet, iArr, i10, 0);
        SeekBar seekBar = this.f29147d;
        androidx.core.view.o0.k0(seekBar, seekBar.getContext(), iArr, attributeSet, a1VarV.r(), i10, 0);
        Drawable drawableH = a1VarV.h(i.j.W);
        if (drawableH != null) {
            this.f29147d.setThumb(drawableH);
        }
        j(a1VarV.g(i.j.X));
        int i11 = i.j.Z;
        if (a1VarV.s(i11)) {
            this.f29150g = k0.e(a1VarV.k(i11, -1), this.f29150g);
            this.f29152i = true;
        }
        int i12 = i.j.Y;
        if (a1VarV.s(i12)) {
            this.f29149f = a1VarV.c(i12);
            this.f29151h = true;
        }
        a1VarV.x();
        f();
    }

    public final void f() {
        Drawable drawable = this.f29148e;
        if (drawable != null) {
            if (this.f29151h || this.f29152i) {
                Drawable drawableR = q2.a.r(drawable.mutate());
                this.f29148e = drawableR;
                if (this.f29151h) {
                    q2.a.o(drawableR, this.f29149f);
                }
                if (this.f29152i) {
                    q2.a.p(this.f29148e, this.f29150g);
                }
                if (this.f29148e.isStateful()) {
                    this.f29148e.setState(this.f29147d.getDrawableState());
                }
            }
        }
    }

    public void g(Canvas canvas) {
        if (this.f29148e != null) {
            int max = this.f29147d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f29148e.getIntrinsicWidth();
                int intrinsicHeight = this.f29148e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f29148e.setBounds(-i10, -i11, i10, i11);
                float width = ((this.f29147d.getWidth() - this.f29147d.getPaddingLeft()) - this.f29147d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f29147d.getPaddingLeft(), this.f29147d.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f29148e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    public void h() {
        Drawable drawable = this.f29148e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f29147d.getDrawableState())) {
            this.f29147d.invalidateDrawable(drawable);
        }
    }

    public void i() {
        Drawable drawable = this.f29148e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void j(Drawable drawable) {
        Drawable drawable2 = this.f29148e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f29148e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f29147d);
            q2.a.m(drawable, this.f29147d.getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(this.f29147d.getDrawableState());
            }
            f();
        }
        this.f29147d.invalidate();
    }
}
