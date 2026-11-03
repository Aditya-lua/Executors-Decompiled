package com.google.android.material.progressindicator;

import ad.o;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.core.view.o0;
import dd.b;
import dd.f;
import dd.g;
import dd.h;
import ic.j;
import ic.k;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a<S extends dd.b> extends ProgressBar {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f8128o = j.A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public S f8129a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f8134g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public dd.a f8135h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f8136i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8137j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Runnable f8138k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Runnable f8139l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p5.b f8140m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p5.b f8141n;

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.a$a, reason: collision with other inner class name */
    public class RunnableC0126a implements Runnable {
        public RunnableC0126a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.k();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.j();
            a.this.f8134g = -1L;
        }
    }

    public class c extends p5.b {
        public c() {
        }

        @Override // p5.b
        public void b(Drawable drawable) {
            a.this.setIndeterminate(false);
            a aVar = a.this;
            aVar.o(aVar.b, a.this.f8130c);
        }
    }

    public class d extends p5.b {
        public d() {
        }

        @Override // p5.b
        public void b(Drawable drawable) {
            super.b(drawable);
            if (a.this.f8136i) {
                return;
            }
            a aVar = a.this;
            aVar.setVisibility(aVar.f8137j);
        }
    }

    public a(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
        super(md.a.c(context, attributeSet, i10, f8128o), attributeSet, i10);
        this.f8134g = -1L;
        this.f8136i = false;
        this.f8137j = 4;
        this.f8138k = new RunnableC0126a();
        this.f8139l = new b();
        this.f8140m = new c();
        this.f8141n = new d();
        Context context2 = getContext();
        this.f8129a = (S) i(context2, attributeSet);
        TypedArray typedArrayI = o.i(context2, attributeSet, k.f20985x, i10, i11, new int[0]);
        this.f8132e = typedArrayI.getInt(k.D, -1);
        this.f8133f = Math.min(typedArrayI.getInt(k.B, -1), 1000);
        typedArrayI.recycle();
        this.f8135h = new dd.a();
        this.f8131d = true;
    }

    private h<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().v();
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().w();
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f8129a.f14534f;
    }

    @NonNull
    public int[] getIndicatorColor() {
        return this.f8129a.f14531c;
    }

    public int getIndicatorTrackGapSize() {
        return this.f8129a.f14535g;
    }

    public int getShowAnimationBehavior() {
        return this.f8129a.f14533e;
    }

    public int getTrackColor() {
        return this.f8129a.f14532d;
    }

    public int getTrackCornerRadius() {
        return this.f8129a.b;
    }

    public int getTrackThickness() {
        return this.f8129a.f14530a;
    }

    public void h(boolean z10) {
        if (this.f8131d) {
            ((g) getCurrentDrawable()).q(q(), false, z10);
        }
    }

    public abstract S i(@NonNull Context context, @NonNull AttributeSet attributeSet);

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    public final void j() {
        ((g) getCurrentDrawable()).q(false, false, true);
        if (m()) {
            setVisibility(4);
        }
    }

    public final void k() {
        if (this.f8133f > 0) {
            this.f8134g = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    public boolean l() {
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    public final boolean m() {
        if (getProgressDrawable() == null || !getProgressDrawable().isVisible()) {
            return getIndeterminateDrawable() == null || !getIndeterminateDrawable().isVisible();
        }
        return false;
    }

    public final void n() {
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().u().d(this.f8140m);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().m(this.f8141n);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().m(this.f8141n);
        }
    }

    public void o(int i10, boolean z10) {
        if (!isIndeterminate()) {
            super.setProgress(i10);
            if (getProgressDrawable() == null || z10) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.b = i10;
            this.f8130c = z10;
            this.f8136i = true;
            if (!getIndeterminateDrawable().isVisible() || this.f8135h.a(getContext().getContentResolver()) == 0.0f) {
                this.f8140m.b(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().u().f();
            }
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        n();
        if (q()) {
            k();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f8139l);
        removeCallbacks(this.f8138k);
        ((g) getCurrentDrawable()).i();
        p();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(@NonNull Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i10, int i11) {
        try {
            h<S> currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(currentDrawingDelegate.f() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i10) : currentDrawingDelegate.f() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.e() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i11) : currentDrawingDelegate.e() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i10) {
        super.onVisibilityChanged(view, i10);
        h(i10 == 0);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        h(false);
    }

    public final void p() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().s(this.f8141n);
            getIndeterminateDrawable().u().h();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().s(this.f8141n);
        }
    }

    public boolean q() {
        return o0.Q(this) && getWindowVisibility() == 0 && l();
    }

    public void setAnimatorDurationScaleProvider(@NonNull dd.a aVar) {
        this.f8135h = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f14566c = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f14566c = aVar;
        }
    }

    public void setHideAnimationBehavior(int i10) {
        this.f8129a.f14534f = i10;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z10) {
        try {
            if (z10 == isIndeterminate()) {
                return;
            }
            g gVar = (g) getCurrentDrawable();
            if (gVar != null) {
                gVar.i();
            }
            super.setIndeterminate(z10);
            g gVar2 = (g) getCurrentDrawable();
            if (gVar2 != null) {
                gVar2.q(q(), false, false);
            }
            if ((gVar2 instanceof dd.j) && q()) {
                ((dd.j) gVar2).u().g();
            }
            this.f8136i = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof dd.j)) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((g) drawable).i();
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{uc.a.b(getContext(), ic.b.f20609l, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f8129a.f14531c = iArr;
        getIndeterminateDrawable().u().c();
        invalidate();
    }

    public void setIndicatorTrackGapSize(int i10) {
        S s8 = this.f8129a;
        if (s8.f14535g != i10) {
            s8.f14535g = i10;
            s8.e();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i10) {
        if (isIndeterminate()) {
            return;
        }
        o(i10, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof f)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            f fVar = (f) drawable;
            fVar.i();
            super.setProgressDrawable(fVar);
            fVar.A(getProgress() / getMax());
        }
    }

    public void setShowAnimationBehavior(int i10) {
        this.f8129a.f14533e = i10;
        invalidate();
    }

    public void setTrackColor(int i10) {
        S s8 = this.f8129a;
        if (s8.f14532d != i10) {
            s8.f14532d = i10;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i10) {
        S s8 = this.f8129a;
        if (s8.b != i10) {
            s8.b = Math.min(i10, s8.f14530a / 2);
            invalidate();
        }
    }

    public void setTrackThickness(int i10) {
        S s8 = this.f8129a;
        if (s8.f14530a != i10) {
            s8.f14530a = i10;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i10) {
        if (i10 != 0 && i10 != 4 && i10 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f8137j = i10;
    }

    @Override // android.widget.ProgressBar
    public dd.j<S> getIndeterminateDrawable() {
        return (dd.j) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public f<S> getProgressDrawable() {
        return (f) super.getProgressDrawable();
    }
}
