package com.google.android.material.progressindicator;

import ad.C0143o;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.core.view.C0625o0;
import java.util.Arrays;
import md.C8485a;
import p075dd.AbstractC4542b;
import p075dd.AbstractC4547g;
import p075dd.AbstractC4548h;
import p075dd.C4541a;
import p075dd.C4546f;
import p075dd.C4550j;
import p194ic.C6738b;
import p194ic.C6746j;
import p194ic.C6747k;
import p352p5.AbstractC10160b;
import p463uc.C11840a;

/* JADX INFO: renamed from: com.google.android.material.progressindicator.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2820a<S extends AbstractC4542b> extends ProgressBar {

    /* JADX INFO: renamed from: o */
    public static final int f10343o = C6746j.f26105A;

    /* JADX INFO: renamed from: a */
    public S f10344a;

    /* JADX INFO: renamed from: b */
    public int f10345b;

    /* JADX INFO: renamed from: c */
    public boolean f10346c;

    /* JADX INFO: renamed from: d */
    public boolean f10347d;

    /* JADX INFO: renamed from: e */
    public final int f10348e;

    /* JADX INFO: renamed from: f */
    public final int f10349f;

    /* JADX INFO: renamed from: g */
    public long f10350g;

    /* JADX INFO: renamed from: h */
    public C4541a f10351h;

    /* JADX INFO: renamed from: i */
    public boolean f10352i;

    /* JADX INFO: renamed from: j */
    public int f10353j;

    /* JADX INFO: renamed from: k */
    public final Runnable f10354k;

    /* JADX INFO: renamed from: l */
    public final Runnable f10355l;

    /* JADX INFO: renamed from: m */
    public final AbstractC10160b f10356m;

    /* JADX INFO: renamed from: n */
    public final AbstractC10160b f10357n;

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.a$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC2820a.this.m12872k();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.a$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC2820a.this.m12871j();
            AbstractC2820a.this.f10350g = -1L;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.a$c */
    public class c extends AbstractC10160b {
        public c() {
        }

        @Override // p352p5.AbstractC10160b
        /* JADX INFO: renamed from: b */
        public void mo12376b(Drawable drawable) {
            AbstractC2820a.this.setIndeterminate(false);
            AbstractC2820a abstractC2820a = AbstractC2820a.this;
            abstractC2820a.m12876o(abstractC2820a.f10345b, AbstractC2820a.this.f10346c);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.a$d */
    public class d extends AbstractC10160b {
        public d() {
        }

        @Override // p352p5.AbstractC10160b
        /* JADX INFO: renamed from: b */
        public void mo12376b(Drawable drawable) {
            super.mo12376b(drawable);
            if (AbstractC2820a.this.f10352i) {
                return;
            }
            AbstractC2820a abstractC2820a = AbstractC2820a.this;
            abstractC2820a.setVisibility(abstractC2820a.f10353j);
        }
    }

    public AbstractC2820a(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
        super(C8485a.m34268c(context, attributeSet, i10, f10343o), attributeSet, i10);
        this.f10350g = -1L;
        this.f10352i = false;
        this.f10353j = 4;
        this.f10354k = new a();
        this.f10355l = new b();
        this.f10356m = new c();
        this.f10357n = new d();
        Context context2 = getContext();
        this.f10344a = (S) mo12860i(context2, attributeSet);
        TypedArray typedArrayM436i = C0143o.m436i(context2, attributeSet, C6747k.f26579x, i10, i11, new int[0]);
        this.f10348e = typedArrayM436i.getInt(C6747k.f26162D, -1);
        this.f10349f = Math.min(typedArrayM436i.getInt(C6747k.f26144B, -1), 1000);
        typedArrayM436i.recycle();
        this.f10351h = new C4541a();
        this.f10347d = true;
    }

    private AbstractC4548h<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().m22594v();
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().m22567w();
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f10344a.f18590f;
    }

    @NonNull
    public int[] getIndicatorColor() {
        return this.f10344a.f18587c;
    }

    public int getIndicatorTrackGapSize() {
        return this.f10344a.f18591g;
    }

    public int getShowAnimationBehavior() {
        return this.f10344a.f18589e;
    }

    public int getTrackColor() {
        return this.f10344a.f18588d;
    }

    public int getTrackCornerRadius() {
        return this.f10344a.f18586b;
    }

    public int getTrackThickness() {
        return this.f10344a.f18585a;
    }

    /* JADX INFO: renamed from: h */
    public void m12870h(boolean z10) {
        if (this.f10347d) {
            ((AbstractC4547g) getCurrentDrawable()).mo22564q(m12878q(), false, z10);
        }
    }

    /* JADX INFO: renamed from: i */
    public abstract S mo12860i(@NonNull Context context, @NonNull AttributeSet attributeSet);

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m12871j() {
        ((AbstractC4547g) getCurrentDrawable()).mo22564q(false, false, true);
        if (m12874m()) {
            setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m12872k() {
        if (this.f10349f > 0) {
            this.f10350g = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    /* JADX INFO: renamed from: l */
    public boolean m12873l() {
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

    /* JADX INFO: renamed from: m */
    public final boolean m12874m() {
        if (getProgressDrawable() == null || !getProgressDrawable().isVisible()) {
            return getIndeterminateDrawable() == null || !getIndeterminateDrawable().isVisible();
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final void m12875n() {
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().m22593u().mo22540d(this.f10356m);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().mo22563m(this.f10357n);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().mo22563m(this.f10357n);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m12876o(int i10, boolean z10) {
        if (!isIndeterminate()) {
            super.setProgress(i10);
            if (getProgressDrawable() == null || z10) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.f10345b = i10;
            this.f10346c = z10;
            this.f10352i = true;
            if (!getIndeterminateDrawable().isVisible() || this.f10351h.m22516a(getContext().getContentResolver()) == 0.0f) {
                this.f10356m.mo12376b(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().m22593u().mo22541f();
            }
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m12875n();
        if (m12878q()) {
            m12872k();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f10355l);
        removeCallbacks(this.f10354k);
        ((AbstractC4547g) getCurrentDrawable()).mo22560i();
        m12877p();
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
            AbstractC4548h<S> currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(currentDrawingDelegate.mo22527f() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i10) : currentDrawingDelegate.mo22527f() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.mo22526e() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i11) : currentDrawingDelegate.mo22526e() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i10) {
        super.onVisibilityChanged(view, i10);
        m12870h(i10 == 0);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        m12870h(false);
    }

    /* JADX INFO: renamed from: p */
    public final void m12877p() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().mo22566s(this.f10357n);
            getIndeterminateDrawable().m22593u().mo22543h();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().mo22566s(this.f10357n);
        }
    }

    /* JADX INFO: renamed from: q */
    public boolean m12878q() {
        return C0625o0.m3005Q(this) && getWindowVisibility() == 0 && m12873l();
    }

    public void setAnimatorDurationScaleProvider(@NonNull C4541a c4541a) {
        this.f10351h = c4541a;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f18624c = c4541a;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f18624c = c4541a;
        }
    }

    public void setHideAnimationBehavior(int i10) {
        this.f10344a.f18590f = i10;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z10) {
        try {
            if (z10 == isIndeterminate()) {
                return;
            }
            AbstractC4547g abstractC4547g = (AbstractC4547g) getCurrentDrawable();
            if (abstractC4547g != null) {
                abstractC4547g.mo22560i();
            }
            super.setIndeterminate(z10);
            AbstractC4547g abstractC4547g2 = (AbstractC4547g) getCurrentDrawable();
            if (abstractC4547g2 != null) {
                abstractC4547g2.mo22564q(m12878q(), false, false);
            }
            if ((abstractC4547g2 instanceof C4550j) && m12878q()) {
                ((C4550j) abstractC4547g2).m22593u().mo22542g();
            }
            this.f10352i = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof C4550j)) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((AbstractC4547g) drawable).mo22560i();
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{C11840a.m44226b(getContext(), C6738b.f25905l, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f10344a.f18587c = iArr;
        getIndeterminateDrawable().m22593u().mo22539c();
        invalidate();
    }

    public void setIndicatorTrackGapSize(int i10) {
        S s8 = this.f10344a;
        if (s8.f18591g != i10) {
            s8.f18591g = i10;
            s8.m22521e();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i10) {
        if (isIndeterminate()) {
            return;
        }
        m12876o(i10, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof C4546f)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            C4546f c4546f = (C4546f) drawable;
            c4546f.mo22560i();
            super.setProgressDrawable(c4546f);
            c4546f.m22559A(getProgress() / getMax());
        }
    }

    public void setShowAnimationBehavior(int i10) {
        this.f10344a.f18589e = i10;
        invalidate();
    }

    public void setTrackColor(int i10) {
        S s8 = this.f10344a;
        if (s8.f18588d != i10) {
            s8.f18588d = i10;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i10) {
        S s8 = this.f10344a;
        if (s8.f18586b != i10) {
            s8.f18586b = Math.min(i10, s8.f18585a / 2);
            invalidate();
        }
    }

    public void setTrackThickness(int i10) {
        S s8 = this.f10344a;
        if (s8.f18585a != i10) {
            s8.f18585a = i10;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i10) {
        if (i10 != 0 && i10 != 4 && i10 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f10353j = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: getIndeterminateDrawable()Landroid/graphics/drawable/Drawable; */
    @Override // android.widget.ProgressBar
    public C4550j<S> getIndeterminateDrawable() {
        return (C4550j) super.getIndeterminateDrawable();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: getProgressDrawable()Landroid/graphics/drawable/Drawable; */
    @Override // android.widget.ProgressBar
    public C4546f<S> getProgressDrawable() {
        return (C4546f) super.getProgressDrawable();
    }
}
