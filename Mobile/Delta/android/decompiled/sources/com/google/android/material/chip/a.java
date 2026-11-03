package com.google.android.material.chip;

import ad.m;
import ad.o;
import ad.r;
import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.core.graphics.c;
import ed.d;
import fd.b;
import hd.g;
import ic.k;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import jc.h;

/* JADX INFO: loaded from: classes2.dex */
public class a extends g implements Drawable.Callback, m.b {
    public static final int[] J0 = {R.attr.state_enabled};
    public static final ShapeDrawable K0 = new ShapeDrawable(new OvalShape());
    public ColorStateList A;
    public PorterDuff.Mode A0;
    public float B;
    public int[] B0;
    public float C;
    public boolean C0;
    public ColorStateList D;
    public ColorStateList D0;
    public float E;

    @NonNull
    public WeakReference<InterfaceC0123a> E0;
    public ColorStateList F;
    public TextUtils.TruncateAt F0;
    public CharSequence G;
    public boolean G0;
    public boolean H;
    public int H0;
    public Drawable I;
    public boolean I0;
    public ColorStateList J;
    public float K;
    public boolean L;
    public boolean M;
    public Drawable N;
    public Drawable O;
    public ColorStateList P;
    public float Q;
    public CharSequence R;
    public boolean S;
    public boolean T;
    public Drawable U;
    public ColorStateList V;
    public h W;
    public h X;
    public float Y;
    public float Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public float f7863a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float f7864b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public float f7865c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public float f7866d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public float f7867e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public float f7868f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    @NonNull
    public final Context f7869g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Paint f7870h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final Paint f7871i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final Paint.FontMetrics f7872j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final RectF f7873k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final PointF f7874l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final Path f7875m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    @NonNull
    public final m f7876n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f7877o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f7878p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f7879q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f7880r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f7881s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f7882t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f7883u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f7884v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f7885w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public ColorFilter f7886x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public PorterDuffColorFilter f7887y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ColorStateList f7888z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public ColorStateList f7889z0;

    /* JADX INFO: renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    public interface InterfaceC0123a {
        void a();
    }

    public a(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.C = -1.0f;
        this.f7870h0 = new Paint(1);
        this.f7872j0 = new Paint.FontMetrics();
        this.f7873k0 = new RectF();
        this.f7874l0 = new PointF();
        this.f7875m0 = new Path();
        this.f7885w0 = 255;
        this.A0 = PorterDuff.Mode.SRC_IN;
        this.E0 = new WeakReference<>(null);
        Q(context);
        this.f7869g0 = context;
        m mVar = new m(this);
        this.f7876n0 = mVar;
        this.G = "";
        mVar.f().density = context.getResources().getDisplayMetrics().density;
        this.f7871i0 = null;
        int[] iArr = J0;
        setState(iArr);
        o2(iArr);
        this.G0 = true;
        if (b.f17188a) {
            K0.setTint(-1);
        }
    }

    public static boolean q1(int[] iArr, int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static boolean u1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean v1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static boolean w1(d dVar) {
        return (dVar == null || dVar.i() == null || !dVar.i().isStateful()) ? false : true;
    }

    @NonNull
    public static a y0(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a(context, attributeSet, i10, i11);
        aVar.x1(attributeSet, i10, i11);
        return aVar;
    }

    public final void A0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (this.I0) {
            return;
        }
        this.f7870h0.setColor(this.f7878p0);
        this.f7870h0.setStyle(Paint.Style.FILL);
        this.f7870h0.setColorFilter(o1());
        this.f7873k0.set(rect);
        canvas.drawRoundRect(this.f7873k0, L0(), L0(), this.f7870h0);
    }

    public void A1(boolean z10) {
        if (this.S != z10) {
            this.S = z10;
            float fP0 = p0();
            if (!z10 && this.f7883u0) {
                this.f7883u0 = false;
            }
            float fP1 = p0();
            invalidateSelf();
            if (fP0 != fP1) {
                y1();
            }
        }
    }

    public void A2(int i10) {
        this.H0 = i10;
    }

    public final void B0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (R2()) {
            o0(rect, this.f7873k0);
            RectF rectF = this.f7873k0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.I.setBounds(0, 0, (int) this.f7873k0.width(), (int) this.f7873k0.height());
            this.I.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    public void B1(int i10) {
        A1(this.f7869g0.getResources().getBoolean(i10));
    }

    public void B2(ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            U2();
            onStateChange(getState());
        }
    }

    public final void C0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (this.E <= 0.0f || this.I0) {
            return;
        }
        this.f7870h0.setColor(this.f7880r0);
        this.f7870h0.setStyle(Paint.Style.STROKE);
        if (!this.I0) {
            this.f7870h0.setColorFilter(o1());
        }
        RectF rectF = this.f7873k0;
        float f10 = rect.left;
        float f11 = this.E;
        rectF.set(f10 + (f11 / 2.0f), rect.top + (f11 / 2.0f), rect.right - (f11 / 2.0f), rect.bottom - (f11 / 2.0f));
        float f12 = this.C - (this.E / 2.0f);
        canvas.drawRoundRect(this.f7873k0, f12, f12, this.f7870h0);
    }

    public void C1(Drawable drawable) {
        if (this.U != drawable) {
            float fP0 = p0();
            this.U = drawable;
            float fP1 = p0();
            T2(this.U);
            n0(this.U);
            invalidateSelf();
            if (fP0 != fP1) {
                y1();
            }
        }
    }

    public void C2(int i10) {
        B2(k.a.a(this.f7869g0, i10));
    }

    public final void D0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (this.I0) {
            return;
        }
        this.f7870h0.setColor(this.f7877o0);
        this.f7870h0.setStyle(Paint.Style.FILL);
        this.f7873k0.set(rect);
        canvas.drawRoundRect(this.f7873k0, L0(), L0(), this.f7870h0);
    }

    public void D1(int i10) {
        C1(k.a.b(this.f7869g0, i10));
    }

    public void D2(boolean z10) {
        this.G0 = z10;
    }

    public final void E0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (S2()) {
            r0(rect, this.f7873k0);
            RectF rectF = this.f7873k0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.N.setBounds(0, 0, (int) this.f7873k0.width(), (int) this.f7873k0.height());
            if (b.f17188a) {
                this.O.setBounds(this.N.getBounds());
                this.O.jumpToCurrentState();
                this.O.draw(canvas);
            } else {
                this.N.draw(canvas);
            }
            canvas.translate(-f10, -f11);
        }
    }

    public void E1(ColorStateList colorStateList) {
        if (this.V != colorStateList) {
            this.V = colorStateList;
            if (x0()) {
                q2.a.o(this.U, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void E2(h hVar) {
        this.W = hVar;
    }

    public final void F0(@NonNull Canvas canvas, @NonNull Rect rect) {
        this.f7870h0.setColor(this.f7881s0);
        this.f7870h0.setStyle(Paint.Style.FILL);
        this.f7873k0.set(rect);
        if (!this.I0) {
            canvas.drawRoundRect(this.f7873k0, L0(), L0(), this.f7870h0);
        } else {
            h(new RectF(rect), this.f7875m0);
            super.p(canvas, this.f7870h0, this.f7875m0, u());
        }
    }

    public void F1(int i10) {
        E1(k.a.a(this.f7869g0, i10));
    }

    public void F2(int i10) {
        E2(h.c(this.f7869g0, i10));
    }

    public final void G0(@NonNull Canvas canvas, @NonNull Rect rect) {
        Canvas canvas2;
        Paint paint = this.f7871i0;
        if (paint != null) {
            paint.setColor(c.l(-16777216, 127));
            canvas.drawRect(rect, this.f7871i0);
            if (R2() || Q2()) {
                o0(rect, this.f7873k0);
                canvas.drawRect(this.f7873k0, this.f7871i0);
            }
            if (this.G != null) {
                canvas2 = canvas;
                canvas2.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f7871i0);
            } else {
                canvas2 = canvas;
            }
            if (S2()) {
                r0(rect, this.f7873k0);
                canvas2.drawRect(this.f7873k0, this.f7871i0);
            }
            this.f7871i0.setColor(c.l(-65536, 127));
            q0(rect, this.f7873k0);
            canvas2.drawRect(this.f7873k0, this.f7871i0);
            this.f7871i0.setColor(c.l(-16711936, 127));
            s0(rect, this.f7873k0);
            canvas2.drawRect(this.f7873k0, this.f7871i0);
        }
    }

    public void G1(int i10) {
        H1(this.f7869g0.getResources().getBoolean(i10));
    }

    public void G2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.G, charSequence)) {
            return;
        }
        this.G = charSequence;
        this.f7876n0.k(true);
        invalidateSelf();
        y1();
    }

    public final void H0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (this.G != null) {
            Paint.Align alignW0 = w0(rect, this.f7874l0);
            u0(rect, this.f7873k0);
            if (this.f7876n0.e() != null) {
                this.f7876n0.f().drawableState = getState();
                this.f7876n0.l(this.f7869g0);
            }
            this.f7876n0.f().setTextAlign(alignW0);
            int iSave = 0;
            boolean z10 = Math.round(this.f7876n0.g(k1().toString())) > Math.round(this.f7873k0.width());
            if (z10) {
                iSave = canvas.save();
                canvas.clipRect(this.f7873k0);
            }
            CharSequence charSequenceEllipsize = this.G;
            if (z10 && this.F0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f7876n0.f(), this.f7873k0.width(), this.F0);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.f7874l0;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.f7876n0.f());
            if (z10) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    public void H1(boolean z10) {
        if (this.T != z10) {
            boolean zQ2 = Q2();
            this.T = z10;
            boolean zQ3 = Q2();
            if (zQ2 != zQ3) {
                if (zQ3) {
                    n0(this.U);
                } else {
                    T2(this.U);
                }
                invalidateSelf();
                y1();
            }
        }
    }

    public void H2(d dVar) {
        this.f7876n0.j(dVar, this.f7869g0);
    }

    public Drawable I0() {
        return this.U;
    }

    public void I1(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            onStateChange(getState());
        }
    }

    public void I2(int i10) {
        H2(new d(this.f7869g0, i10));
    }

    public ColorStateList J0() {
        return this.V;
    }

    public void J1(int i10) {
        I1(k.a.a(this.f7869g0, i10));
    }

    public void J2(float f10) {
        if (this.f7865c0 != f10) {
            this.f7865c0 = f10;
            invalidateSelf();
            y1();
        }
    }

    public ColorStateList K0() {
        return this.A;
    }

    @Deprecated
    public void K1(float f10) {
        if (this.C != f10) {
            this.C = f10;
            setShapeAppearanceModel(E().w(f10));
        }
    }

    public void K2(int i10) {
        J2(this.f7869g0.getResources().getDimension(i10));
    }

    public float L0() {
        return this.I0 ? J() : this.C;
    }

    @Deprecated
    public void L1(int i10) {
        K1(this.f7869g0.getResources().getDimension(i10));
    }

    public void L2(float f10) {
        d dVarL1 = l1();
        if (dVarL1 != null) {
            dVarL1.l(f10);
            this.f7876n0.f().setTextSize(f10);
            a();
        }
    }

    public float M0() {
        return this.f7868f0;
    }

    public void M1(float f10) {
        if (this.f7868f0 != f10) {
            this.f7868f0 = f10;
            invalidateSelf();
            y1();
        }
    }

    public void M2(float f10) {
        if (this.f7864b0 != f10) {
            this.f7864b0 = f10;
            invalidateSelf();
            y1();
        }
    }

    public Drawable N0() {
        Drawable drawable = this.I;
        if (drawable != null) {
            return q2.a.q(drawable);
        }
        return null;
    }

    public void N1(int i10) {
        M1(this.f7869g0.getResources().getDimension(i10));
    }

    public void N2(int i10) {
        M2(this.f7869g0.getResources().getDimension(i10));
    }

    public float O0() {
        return this.K;
    }

    public void O1(Drawable drawable) {
        Drawable drawableN0 = N0();
        if (drawableN0 != drawable) {
            float fP0 = p0();
            this.I = drawable != null ? q2.a.r(drawable).mutate() : null;
            float fP1 = p0();
            T2(drawableN0);
            if (R2()) {
                n0(this.I);
            }
            invalidateSelf();
            if (fP0 != fP1) {
                y1();
            }
        }
    }

    public void O2(boolean z10) {
        if (this.C0 != z10) {
            this.C0 = z10;
            U2();
            onStateChange(getState());
        }
    }

    public ColorStateList P0() {
        return this.J;
    }

    public void P1(int i10) {
        O1(k.a.b(this.f7869g0, i10));
    }

    public boolean P2() {
        return this.G0;
    }

    public float Q0() {
        return this.B;
    }

    public void Q1(float f10) {
        if (this.K != f10) {
            float fP0 = p0();
            this.K = f10;
            float fP1 = p0();
            invalidateSelf();
            if (fP0 != fP1) {
                y1();
            }
        }
    }

    public final boolean Q2() {
        return this.T && this.U != null && this.f7883u0;
    }

    public float R0() {
        return this.Y;
    }

    public void R1(int i10) {
        Q1(this.f7869g0.getResources().getDimension(i10));
    }

    public final boolean R2() {
        return this.H && this.I != null;
    }

    public ColorStateList S0() {
        return this.D;
    }

    public void S1(ColorStateList colorStateList) {
        this.L = true;
        if (this.J != colorStateList) {
            this.J = colorStateList;
            if (R2()) {
                q2.a.o(this.I, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final boolean S2() {
        return this.M && this.N != null;
    }

    public float T0() {
        return this.E;
    }

    public void T1(int i10) {
        S1(k.a.a(this.f7869g0, i10));
    }

    public final void T2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public Drawable U0() {
        Drawable drawable = this.N;
        if (drawable != null) {
            return q2.a.q(drawable);
        }
        return null;
    }

    public void U1(int i10) {
        V1(this.f7869g0.getResources().getBoolean(i10));
    }

    public final void U2() {
        this.D0 = this.C0 ? b.a(this.F) : null;
    }

    public CharSequence V0() {
        return this.R;
    }

    public void V1(boolean z10) {
        if (this.H != z10) {
            boolean zR2 = R2();
            this.H = z10;
            boolean zR3 = R2();
            if (zR2 != zR3) {
                if (zR3) {
                    n0(this.I);
                } else {
                    T2(this.I);
                }
                invalidateSelf();
                y1();
            }
        }
    }

    @TargetApi(21)
    public final void V2() {
        this.O = new RippleDrawable(b.a(i1()), this.N, K0);
    }

    public float W0() {
        return this.f7867e0;
    }

    public void W1(float f10) {
        if (this.B != f10) {
            this.B = f10;
            invalidateSelf();
            y1();
        }
    }

    public float X0() {
        return this.Q;
    }

    public void X1(int i10) {
        W1(this.f7869g0.getResources().getDimension(i10));
    }

    public float Y0() {
        return this.f7866d0;
    }

    public void Y1(float f10) {
        if (this.Y != f10) {
            this.Y = f10;
            invalidateSelf();
            y1();
        }
    }

    @NonNull
    public int[] Z0() {
        return this.B0;
    }

    public void Z1(int i10) {
        Y1(this.f7869g0.getResources().getDimension(i10));
    }

    @Override // ad.m.b
    public void a() {
        y1();
        invalidateSelf();
    }

    public ColorStateList a1() {
        return this.P;
    }

    public void a2(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            if (this.I0) {
                i0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void b1(@NonNull RectF rectF) {
        s0(getBounds(), rectF);
    }

    public void b2(int i10) {
        a2(k.a.a(this.f7869g0, i10));
    }

    public final float c1() {
        Drawable drawable = this.f7883u0 ? this.U : this.I;
        float fCeil = this.K;
        if (fCeil <= 0.0f && drawable != null) {
            fCeil = (float) Math.ceil(r.d(this.f7869g0, 24));
            if (drawable.getIntrinsicHeight() <= fCeil) {
                return drawable.getIntrinsicHeight();
            }
        }
        return fCeil;
    }

    public void c2(float f10) {
        if (this.E != f10) {
            this.E = f10;
            this.f7870h0.setStrokeWidth(f10);
            if (this.I0) {
                super.j0(f10);
            }
            invalidateSelf();
        }
    }

    public final float d1() {
        Drawable drawable = this.f7883u0 ? this.U : this.I;
        float f10 = this.K;
        return (f10 > 0.0f || drawable == null) ? f10 : drawable.getIntrinsicWidth();
    }

    public void d2(int i10) {
        c2(this.f7869g0.getResources().getDimension(i10));
    }

    @Override // hd.g, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Canvas canvas2;
        int iA;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i10 = this.f7885w0;
        if (i10 < 255) {
            canvas2 = canvas;
            iA = oc.a.a(canvas2, bounds.left, bounds.top, bounds.right, bounds.bottom, i10);
        } else {
            canvas2 = canvas;
            iA = 0;
        }
        D0(canvas2, bounds);
        A0(canvas2, bounds);
        if (this.I0) {
            super.draw(canvas2);
        }
        C0(canvas2, bounds);
        F0(canvas2, bounds);
        B0(canvas2, bounds);
        z0(canvas2, bounds);
        if (this.G0) {
            H0(canvas2, bounds);
        }
        E0(canvas2, bounds);
        G0(canvas2, bounds);
        if (this.f7885w0 < 255) {
            canvas2.restoreToCount(iA);
        }
    }

    public TextUtils.TruncateAt e1() {
        return this.F0;
    }

    public final void e2(ColorStateList colorStateList) {
        if (this.f7888z != colorStateList) {
            this.f7888z = colorStateList;
            onStateChange(getState());
        }
    }

    public h f1() {
        return this.X;
    }

    public void f2(Drawable drawable) {
        Drawable drawableU0 = U0();
        if (drawableU0 != drawable) {
            float fT0 = t0();
            this.N = drawable != null ? q2.a.r(drawable).mutate() : null;
            if (b.f17188a) {
                V2();
            }
            float fT1 = t0();
            T2(drawableU0);
            if (S2()) {
                n0(this.N);
            }
            invalidateSelf();
            if (fT0 != fT1) {
                y1();
            }
        }
    }

    public float g1() {
        return this.f7863a0;
    }

    public void g2(CharSequence charSequence) {
        if (this.R != charSequence) {
            this.R = w2.a.c().h(charSequence);
            invalidateSelf();
        }
    }

    @Override // hd.g, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f7885w0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f7886x0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.B;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.Y + p0() + this.f7864b0 + this.f7876n0.g(k1().toString()) + this.f7865c0 + t0() + this.f7868f0), this.H0);
    }

    @Override // hd.g, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // hd.g, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline) {
        Outline outline2;
        if (this.I0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.C);
        } else {
            outline.setRoundRect(bounds, this.C);
            outline2 = outline;
        }
        outline2.setAlpha(getAlpha() / 255.0f);
    }

    public float h1() {
        return this.Z;
    }

    public void h2(float f10) {
        if (this.f7867e0 != f10) {
            this.f7867e0 = f10;
            invalidateSelf();
            if (S2()) {
                y1();
            }
        }
    }

    public ColorStateList i1() {
        return this.F;
    }

    public void i2(int i10) {
        h2(this.f7869g0.getResources().getDimension(i10));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // hd.g, android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (u1(this.f7888z) || u1(this.A) || u1(this.D)) {
            return true;
        }
        return (this.C0 && u1(this.D0)) || w1(this.f7876n0.e()) || x0() || v1(this.I) || v1(this.U) || u1(this.f7889z0);
    }

    public h j1() {
        return this.W;
    }

    public void j2(int i10) {
        f2(k.a.b(this.f7869g0, i10));
    }

    public CharSequence k1() {
        return this.G;
    }

    public void k2(float f10) {
        if (this.Q != f10) {
            this.Q = f10;
            invalidateSelf();
            if (S2()) {
                y1();
            }
        }
    }

    public d l1() {
        return this.f7876n0.e();
    }

    public void l2(int i10) {
        k2(this.f7869g0.getResources().getDimension(i10));
    }

    public float m1() {
        return this.f7865c0;
    }

    public void m2(float f10) {
        if (this.f7866d0 != f10) {
            this.f7866d0 = f10;
            invalidateSelf();
            if (S2()) {
                y1();
            }
        }
    }

    public final void n0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        q2.a.m(drawable, q2.a.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.N) {
            if (drawable.isStateful()) {
                drawable.setState(Z0());
            }
            q2.a.o(drawable, this.P);
            return;
        }
        Drawable drawable2 = this.I;
        if (drawable == drawable2 && this.L) {
            q2.a.o(drawable2, this.J);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public float n1() {
        return this.f7864b0;
    }

    public void n2(int i10) {
        m2(this.f7869g0.getResources().getDimension(i10));
    }

    public final void o0(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (R2() || Q2()) {
            float f10 = this.Y + this.Z;
            float fD1 = d1();
            if (q2.a.f(this) == 0) {
                float f11 = rect.left + f10;
                rectF.left = f11;
                rectF.right = f11 + fD1;
            } else {
                float f12 = rect.right - f10;
                rectF.right = f12;
                rectF.left = f12 - fD1;
            }
            float fC1 = c1();
            float fExactCenterY = rect.exactCenterY() - (fC1 / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fC1;
        }
    }

    public final ColorFilter o1() {
        ColorFilter colorFilter = this.f7886x0;
        return colorFilter != null ? colorFilter : this.f7887y0;
    }

    public boolean o2(@NonNull int[] iArr) {
        if (Arrays.equals(this.B0, iArr)) {
            return false;
        }
        this.B0 = iArr;
        if (S2()) {
            return z1(getState(), iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (R2()) {
            zOnLayoutDirectionChanged |= q2.a.m(this.I, i10);
        }
        if (Q2()) {
            zOnLayoutDirectionChanged |= q2.a.m(this.U, i10);
        }
        if (S2()) {
            zOnLayoutDirectionChanged |= q2.a.m(this.N, i10);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        boolean zOnLevelChange = super.onLevelChange(i10);
        if (R2()) {
            zOnLevelChange |= this.I.setLevel(i10);
        }
        if (Q2()) {
            zOnLevelChange |= this.U.setLevel(i10);
        }
        if (S2()) {
            zOnLevelChange |= this.N.setLevel(i10);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // hd.g, android.graphics.drawable.Drawable, ad.m.b
    public boolean onStateChange(@NonNull int[] iArr) {
        if (this.I0) {
            super.onStateChange(iArr);
        }
        return z1(iArr, Z0());
    }

    public float p0() {
        if (R2() || Q2()) {
            return this.Z + d1() + this.f7863a0;
        }
        return 0.0f;
    }

    public boolean p1() {
        return this.C0;
    }

    public void p2(ColorStateList colorStateList) {
        if (this.P != colorStateList) {
            this.P = colorStateList;
            if (S2()) {
                q2.a.o(this.N, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void q0(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.set(rect);
        if (S2()) {
            float f10 = this.f7868f0 + this.f7867e0 + this.Q + this.f7866d0 + this.f7865c0;
            if (q2.a.f(this) == 0) {
                rectF.right = rect.right - f10;
            } else {
                rectF.left = rect.left + f10;
            }
        }
    }

    public void q2(int i10) {
        p2(k.a.a(this.f7869g0, i10));
    }

    public final void r0(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (S2()) {
            float f10 = this.f7868f0 + this.f7867e0;
            if (q2.a.f(this) == 0) {
                float f11 = rect.right - f10;
                rectF.right = f11;
                rectF.left = f11 - this.Q;
            } else {
                float f12 = rect.left + f10;
                rectF.left = f12;
                rectF.right = f12 + this.Q;
            }
            float fExactCenterY = rect.exactCenterY();
            float f13 = this.Q;
            float f14 = fExactCenterY - (f13 / 2.0f);
            rectF.top = f14;
            rectF.bottom = f14 + f13;
        }
    }

    public boolean r1() {
        return this.S;
    }

    public void r2(boolean z10) {
        if (this.M != z10) {
            boolean zS2 = S2();
            this.M = z10;
            boolean zS3 = S2();
            if (zS2 != zS3) {
                if (zS3) {
                    n0(this.N);
                } else {
                    T2(this.N);
                }
                invalidateSelf();
                y1();
            }
        }
    }

    public final void s0(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (S2()) {
            float f10 = this.f7868f0 + this.f7867e0 + this.Q + this.f7866d0 + this.f7865c0;
            if (q2.a.f(this) == 0) {
                float f11 = rect.right;
                rectF.right = f11;
                rectF.left = f11 - f10;
            } else {
                int i10 = rect.left;
                rectF.left = i10;
                rectF.right = i10 + f10;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public boolean s1() {
        return v1(this.N);
    }

    public void s2(InterfaceC0123a interfaceC0123a) {
        this.E0 = new WeakReference<>(interfaceC0123a);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // hd.g, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f7885w0 != i10) {
            this.f7885w0 = i10;
            invalidateSelf();
        }
    }

    @Override // hd.g, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f7886x0 != colorFilter) {
            this.f7886x0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // hd.g, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.f7889z0 != colorStateList) {
            this.f7889z0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // hd.g, android.graphics.drawable.Drawable
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.A0 != mode) {
            this.A0 = mode;
            this.f7887y0 = wc.c.l(this, this.f7889z0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (R2()) {
            visible |= this.I.setVisible(z10, z11);
        }
        if (Q2()) {
            visible |= this.U.setVisible(z10, z11);
        }
        if (S2()) {
            visible |= this.N.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public float t0() {
        if (S2()) {
            return this.f7866d0 + this.Q + this.f7867e0;
        }
        return 0.0f;
    }

    public boolean t1() {
        return this.M;
    }

    public void t2(TextUtils.TruncateAt truncateAt) {
        this.F0 = truncateAt;
    }

    public final void u0(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (this.G != null) {
            float fP0 = this.Y + p0() + this.f7864b0;
            float fT0 = this.f7868f0 + t0() + this.f7865c0;
            if (q2.a.f(this) == 0) {
                rectF.left = rect.left + fP0;
                rectF.right = rect.right - fT0;
            } else {
                rectF.left = rect.left + fT0;
                rectF.right = rect.right - fP0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public void u2(h hVar) {
        this.X = hVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final float v0() {
        this.f7876n0.f().getFontMetrics(this.f7872j0);
        Paint.FontMetrics fontMetrics = this.f7872j0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    public void v2(int i10) {
        u2(h.c(this.f7869g0, i10));
    }

    @NonNull
    public Paint.Align w0(@NonNull Rect rect, @NonNull PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.G != null) {
            float fP0 = this.Y + p0() + this.f7864b0;
            if (q2.a.f(this) == 0) {
                pointF.x = rect.left + fP0;
            } else {
                pointF.x = rect.right - fP0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - v0();
        }
        return align;
    }

    public void w2(float f10) {
        if (this.f7863a0 != f10) {
            float fP0 = p0();
            this.f7863a0 = f10;
            float fP1 = p0();
            invalidateSelf();
            if (fP0 != fP1) {
                y1();
            }
        }
    }

    public final boolean x0() {
        return this.T && this.U != null && this.S;
    }

    public final void x1(AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayI = o.i(this.f7869g0, attributeSet, k.f20907o0, i10, i11, new int[0]);
        this.I0 = typedArrayI.hasValue(k.Z0);
        e2(ed.c.a(this.f7869g0, typedArrayI, k.M0));
        I1(ed.c.a(this.f7869g0, typedArrayI, k.f21004z0));
        W1(typedArrayI.getDimension(k.H0, 0.0f));
        int i12 = k.A0;
        if (typedArrayI.hasValue(i12)) {
            K1(typedArrayI.getDimension(i12, 0.0f));
        }
        a2(ed.c.a(this.f7869g0, typedArrayI, k.K0));
        c2(typedArrayI.getDimension(k.L0, 0.0f));
        B2(ed.c.a(this.f7869g0, typedArrayI, k.Y0));
        G2(typedArrayI.getText(k.f20952t0));
        d dVarF = ed.c.f(this.f7869g0, typedArrayI, k.f20916p0);
        dVarF.l(typedArrayI.getDimension(k.f20925q0, dVarF.j()));
        H2(dVarF);
        int i13 = typedArrayI.getInt(k.f20934r0, 0);
        if (i13 == 1) {
            t2(TextUtils.TruncateAt.START);
        } else if (i13 == 2) {
            t2(TextUtils.TruncateAt.MIDDLE);
        } else if (i13 == 3) {
            t2(TextUtils.TruncateAt.END);
        }
        V1(typedArrayI.getBoolean(k.G0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            V1(typedArrayI.getBoolean(k.D0, false));
        }
        O1(ed.c.d(this.f7869g0, typedArrayI, k.C0));
        int i14 = k.F0;
        if (typedArrayI.hasValue(i14)) {
            S1(ed.c.a(this.f7869g0, typedArrayI, i14));
        }
        Q1(typedArrayI.getDimension(k.E0, -1.0f));
        r2(typedArrayI.getBoolean(k.T0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            r2(typedArrayI.getBoolean(k.O0, false));
        }
        f2(ed.c.d(this.f7869g0, typedArrayI, k.N0));
        p2(ed.c.a(this.f7869g0, typedArrayI, k.S0));
        k2(typedArrayI.getDimension(k.Q0, 0.0f));
        A1(typedArrayI.getBoolean(k.f20961u0, false));
        H1(typedArrayI.getBoolean(k.f20995y0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            H1(typedArrayI.getBoolean(k.f20978w0, false));
        }
        C1(ed.c.d(this.f7869g0, typedArrayI, k.f20970v0));
        int i15 = k.f20986x0;
        if (typedArrayI.hasValue(i15)) {
            E1(ed.c.a(this.f7869g0, typedArrayI, i15));
        }
        E2(h.b(this.f7869g0, typedArrayI, k.f20780a1));
        u2(h.b(this.f7869g0, typedArrayI, k.V0));
        Y1(typedArrayI.getDimension(k.J0, 0.0f));
        y2(typedArrayI.getDimension(k.X0, 0.0f));
        w2(typedArrayI.getDimension(k.W0, 0.0f));
        M2(typedArrayI.getDimension(k.f20799c1, 0.0f));
        J2(typedArrayI.getDimension(k.f20789b1, 0.0f));
        m2(typedArrayI.getDimension(k.R0, 0.0f));
        h2(typedArrayI.getDimension(k.P0, 0.0f));
        M1(typedArrayI.getDimension(k.B0, 0.0f));
        A2(typedArrayI.getDimensionPixelSize(k.f20943s0, Integer.MAX_VALUE));
        typedArrayI.recycle();
    }

    public void x2(int i10) {
        w2(this.f7869g0.getResources().getDimension(i10));
    }

    public void y1() {
        InterfaceC0123a interfaceC0123a = this.E0.get();
        if (interfaceC0123a != null) {
            interfaceC0123a.a();
        }
    }

    public void y2(float f10) {
        if (this.Z != f10) {
            float fP0 = p0();
            this.Z = f10;
            float fP1 = p0();
            invalidateSelf();
            if (fP0 != fP1) {
                y1();
            }
        }
    }

    public final void z0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (Q2()) {
            o0(rect, this.f7873k0);
            RectF rectF = this.f7873k0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.U.setBounds(0, 0, (int) this.f7873k0.width(), (int) this.f7873k0.height());
            this.U.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    public final boolean z1(@NonNull int[] iArr, @NonNull int[] iArr2) {
        boolean z10;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f7888z;
        int iL = l(colorStateList != null ? colorStateList.getColorForState(iArr, this.f7877o0) : 0);
        boolean state = true;
        if (this.f7877o0 != iL) {
            this.f7877o0 = iL;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.A;
        int iL2 = l(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f7878p0) : 0);
        if (this.f7878p0 != iL2) {
            this.f7878p0 = iL2;
            zOnStateChange = true;
        }
        int i10 = uc.a.i(iL, iL2);
        if ((this.f7879q0 != i10) | (x() == null)) {
            this.f7879q0 = i10;
            a0(ColorStateList.valueOf(i10));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.D;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f7880r0) : 0;
        if (this.f7880r0 != colorForState) {
            this.f7880r0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.D0 == null || !b.b(iArr)) ? 0 : this.D0.getColorForState(iArr, this.f7881s0);
        if (this.f7881s0 != colorForState2) {
            this.f7881s0 = colorForState2;
            if (this.C0) {
                zOnStateChange = true;
            }
        }
        int colorForState3 = (this.f7876n0.e() == null || this.f7876n0.e().i() == null) ? 0 : this.f7876n0.e().i().getColorForState(iArr, this.f7882t0);
        if (this.f7882t0 != colorForState3) {
            this.f7882t0 = colorForState3;
            zOnStateChange = true;
        }
        boolean z11 = q1(getState(), R.attr.state_checked) && this.S;
        if (this.f7883u0 == z11 || this.U == null) {
            z10 = false;
        } else {
            float fP0 = p0();
            this.f7883u0 = z11;
            if (fP0 != p0()) {
                zOnStateChange = true;
                z10 = true;
            } else {
                z10 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.f7889z0;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f7884v0) : 0;
        if (this.f7884v0 != colorForState4) {
            this.f7884v0 = colorForState4;
            this.f7887y0 = wc.c.l(this, this.f7889z0, this.A0);
        } else {
            state = zOnStateChange;
        }
        if (v1(this.I)) {
            state |= this.I.setState(iArr);
        }
        if (v1(this.U)) {
            state |= this.U.setState(iArr);
        }
        if (v1(this.N)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.N.setState(iArr3);
        }
        if (b.f17188a && v1(this.O)) {
            state |= this.O.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z10) {
            y1();
        }
        return state;
    }

    public void z2(int i10) {
        y2(this.f7869g0.getResources().getDimension(i10));
    }
}
