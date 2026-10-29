package com.google.android.material.chip;

import ad.C0141m;
import ad.C0143o;
import ad.C0146r;
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
import androidx.core.graphics.C0546c;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p101ed.C5050c;
import p101ed.C5051d;
import p126fd.C5584b;
import p168hd.C6363g;
import p194ic.C6747k;
import p216jc.C7144h;
import p232k.C7399a;
import p327oc.C9723a;
import p368q2.C10425a;
import p463uc.C11840a;
import p505w2.C12289a;
import p513wc.C12348c;

/* JADX INFO: renamed from: com.google.android.material.chip.a */
/* JADX INFO: loaded from: classes2.dex */
public class C2783a extends C6363g implements Drawable.Callback, C0141m.b {

    /* JADX INFO: renamed from: J0 */
    public static final int[] f9951J0 = {R.attr.state_enabled};

    /* JADX INFO: renamed from: K0 */
    public static final ShapeDrawable f9952K0 = new ShapeDrawable(new OvalShape());

    /* JADX INFO: renamed from: A */
    public ColorStateList f9953A;

    /* JADX INFO: renamed from: A0 */
    public PorterDuff.Mode f9954A0;

    /* JADX INFO: renamed from: B */
    public float f9955B;

    /* JADX INFO: renamed from: B0 */
    public int[] f9956B0;

    /* JADX INFO: renamed from: C */
    public float f9957C;

    /* JADX INFO: renamed from: C0 */
    public boolean f9958C0;

    /* JADX INFO: renamed from: D */
    public ColorStateList f9959D;

    /* JADX INFO: renamed from: D0 */
    public ColorStateList f9960D0;

    /* JADX INFO: renamed from: E */
    public float f9961E;

    /* JADX INFO: renamed from: E0 */
    @NonNull
    public WeakReference<a> f9962E0;

    /* JADX INFO: renamed from: F */
    public ColorStateList f9963F;

    /* JADX INFO: renamed from: F0 */
    public TextUtils.TruncateAt f9964F0;

    /* JADX INFO: renamed from: G */
    public CharSequence f9965G;

    /* JADX INFO: renamed from: G0 */
    public boolean f9966G0;

    /* JADX INFO: renamed from: H */
    public boolean f9967H;

    /* JADX INFO: renamed from: H0 */
    public int f9968H0;

    /* JADX INFO: renamed from: I */
    public Drawable f9969I;

    /* JADX INFO: renamed from: I0 */
    public boolean f9970I0;

    /* JADX INFO: renamed from: J */
    public ColorStateList f9971J;

    /* JADX INFO: renamed from: K */
    public float f9972K;

    /* JADX INFO: renamed from: L */
    public boolean f9973L;

    /* JADX INFO: renamed from: M */
    public boolean f9974M;

    /* JADX INFO: renamed from: N */
    public Drawable f9975N;

    /* JADX INFO: renamed from: O */
    public Drawable f9976O;

    /* JADX INFO: renamed from: P */
    public ColorStateList f9977P;

    /* JADX INFO: renamed from: Q */
    public float f9978Q;

    /* JADX INFO: renamed from: R */
    public CharSequence f9979R;

    /* JADX INFO: renamed from: S */
    public boolean f9980S;

    /* JADX INFO: renamed from: T */
    public boolean f9981T;

    /* JADX INFO: renamed from: U */
    public Drawable f9982U;

    /* JADX INFO: renamed from: V */
    public ColorStateList f9983V;

    /* JADX INFO: renamed from: W */
    public C7144h f9984W;

    /* JADX INFO: renamed from: X */
    public C7144h f9985X;

    /* JADX INFO: renamed from: Y */
    public float f9986Y;

    /* JADX INFO: renamed from: Z */
    public float f9987Z;

    /* JADX INFO: renamed from: a0 */
    public float f9988a0;

    /* JADX INFO: renamed from: b0 */
    public float f9989b0;

    /* JADX INFO: renamed from: c0 */
    public float f9990c0;

    /* JADX INFO: renamed from: d0 */
    public float f9991d0;

    /* JADX INFO: renamed from: e0 */
    public float f9992e0;

    /* JADX INFO: renamed from: f0 */
    public float f9993f0;

    /* JADX INFO: renamed from: g0 */
    @NonNull
    public final Context f9994g0;

    /* JADX INFO: renamed from: h0 */
    public final Paint f9995h0;

    /* JADX INFO: renamed from: i0 */
    public final Paint f9996i0;

    /* JADX INFO: renamed from: j0 */
    public final Paint.FontMetrics f9997j0;

    /* JADX INFO: renamed from: k0 */
    public final RectF f9998k0;

    /* JADX INFO: renamed from: l0 */
    public final PointF f9999l0;

    /* JADX INFO: renamed from: m0 */
    public final Path f10000m0;

    /* JADX INFO: renamed from: n0 */
    @NonNull
    public final C0141m f10001n0;

    /* JADX INFO: renamed from: o0 */
    public int f10002o0;

    /* JADX INFO: renamed from: p0 */
    public int f10003p0;

    /* JADX INFO: renamed from: q0 */
    public int f10004q0;

    /* JADX INFO: renamed from: r0 */
    public int f10005r0;

    /* JADX INFO: renamed from: s0 */
    public int f10006s0;

    /* JADX INFO: renamed from: t0 */
    public int f10007t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f10008u0;

    /* JADX INFO: renamed from: v0 */
    public int f10009v0;

    /* JADX INFO: renamed from: w0 */
    public int f10010w0;

    /* JADX INFO: renamed from: x0 */
    public ColorFilter f10011x0;

    /* JADX INFO: renamed from: y0 */
    public PorterDuffColorFilter f10012y0;

    /* JADX INFO: renamed from: z */
    public ColorStateList f10013z;

    /* JADX INFO: renamed from: z0 */
    public ColorStateList f10014z0;

    /* JADX INFO: renamed from: com.google.android.material.chip.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo12391a();
    }

    public C2783a(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f9957C = -1.0f;
        this.f9995h0 = new Paint(1);
        this.f9997j0 = new Paint.FontMetrics();
        this.f9998k0 = new RectF();
        this.f9999l0 = new PointF();
        this.f10000m0 = new Path();
        this.f10010w0 = 255;
        this.f9954A0 = PorterDuff.Mode.SRC_IN;
        this.f9962E0 = new WeakReference<>(null);
        m27710Q(context);
        this.f9994g0 = context;
        C0141m c0141m = new C0141m(this);
        this.f10001n0 = c0141m;
        this.f9965G = "";
        c0141m.m418f().density = context.getResources().getDisplayMetrics().density;
        this.f9996i0 = null;
        int[] iArr = f9951J0;
        setState(iArr);
        m12525o2(iArr);
        this.f9966G0 = true;
        if (C5584b.f21377a) {
            f9952K0.setTint(-1);
        }
    }

    /* JADX INFO: renamed from: q1 */
    public static boolean m12415q1(int[] iArr, int i10) {
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

    /* JADX INFO: renamed from: u1 */
    public static boolean m12416u1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: v1 */
    public static boolean m12417v1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* JADX INFO: renamed from: w1 */
    public static boolean m12418w1(C5051d c5051d) {
        return (c5051d == null || c5051d.m23752i() == null || !c5051d.m23752i().isStateful()) ? false : true;
    }

    @NonNull
    /* JADX INFO: renamed from: y0 */
    public static C2783a m12419y0(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
        C2783a c2783a = new C2783a(context, attributeSet, i10, i11);
        c2783a.m12547x1(attributeSet, i10, i11);
        return c2783a;
    }

    /* JADX INFO: renamed from: A0 */
    public final void m12420A0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (this.f9970I0) {
            return;
        }
        this.f9995h0.setColor(this.f10003p0);
        this.f9995h0.setStyle(Paint.Style.FILL);
        this.f9995h0.setColorFilter(m12524o1());
        this.f9998k0.set(rect);
        canvas.drawRoundRect(this.f9998k0, m12453L0(), m12453L0(), this.f9995h0);
    }

    /* JADX INFO: renamed from: A1 */
    public void m12421A1(boolean z10) {
        if (this.f9980S != z10) {
            this.f9980S = z10;
            float fM12526p0 = m12526p0();
            if (!z10 && this.f10008u0) {
                this.f10008u0 = false;
            }
            float fM12526p1 = m12526p0();
            invalidateSelf();
            if (fM12526p0 != fM12526p1) {
                m12549y1();
            }
        }
    }

    /* JADX INFO: renamed from: A2 */
    public void m12422A2(int i10) {
        this.f9968H0 = i10;
    }

    /* JADX INFO: renamed from: B0 */
    public final void m12423B0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (m12473R2()) {
            m12523o0(rect, this.f9998k0);
            RectF rectF = this.f9998k0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f9969I.setBounds(0, 0, (int) this.f9998k0.width(), (int) this.f9998k0.height());
            this.f9969I.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    /* JADX INFO: renamed from: B1 */
    public void m12424B1(int i10) {
        m12421A1(this.f9994g0.getResources().getBoolean(i10));
    }

    /* JADX INFO: renamed from: B2 */
    public void m12425B2(ColorStateList colorStateList) {
        if (this.f9963F != colorStateList) {
            this.f9963F = colorStateList;
            m12482U2();
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final void m12426C0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (this.f9961E <= 0.0f || this.f9970I0) {
            return;
        }
        this.f9995h0.setColor(this.f10005r0);
        this.f9995h0.setStyle(Paint.Style.STROKE);
        if (!this.f9970I0) {
            this.f9995h0.setColorFilter(m12524o1());
        }
        RectF rectF = this.f9998k0;
        float f10 = rect.left;
        float f11 = this.f9961E;
        rectF.set(f10 + (f11 / 2.0f), rect.top + (f11 / 2.0f), rect.right - (f11 / 2.0f), rect.bottom - (f11 / 2.0f));
        float f12 = this.f9957C - (this.f9961E / 2.0f);
        canvas.drawRoundRect(this.f9998k0, f12, f12, this.f9995h0);
    }

    /* JADX INFO: renamed from: C1 */
    public void m12427C1(Drawable drawable) {
        if (this.f9982U != drawable) {
            float fM12526p0 = m12526p0();
            this.f9982U = drawable;
            float fM12526p1 = m12526p0();
            m12479T2(this.f9982U);
            m12520n0(this.f9982U);
            invalidateSelf();
            if (fM12526p0 != fM12526p1) {
                m12549y1();
            }
        }
    }

    /* JADX INFO: renamed from: C2 */
    public void m12428C2(int i10) {
        m12425B2(C7399a.m30678a(this.f9994g0, i10));
    }

    /* JADX INFO: renamed from: D0 */
    public final void m12429D0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (this.f9970I0) {
            return;
        }
        this.f9995h0.setColor(this.f10002o0);
        this.f9995h0.setStyle(Paint.Style.FILL);
        this.f9998k0.set(rect);
        canvas.drawRoundRect(this.f9998k0, m12453L0(), m12453L0(), this.f9995h0);
    }

    /* JADX INFO: renamed from: D1 */
    public void m12430D1(int i10) {
        m12427C1(C7399a.m30679b(this.f9994g0, i10));
    }

    /* JADX INFO: renamed from: D2 */
    public void m12431D2(boolean z10) {
        this.f9966G0 = z10;
    }

    /* JADX INFO: renamed from: E0 */
    public final void m12432E0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (m12476S2()) {
            m12531r0(rect, this.f9998k0);
            RectF rectF = this.f9998k0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f9975N.setBounds(0, 0, (int) this.f9998k0.width(), (int) this.f9998k0.height());
            if (C5584b.f21377a) {
                this.f9976O.setBounds(this.f9975N.getBounds());
                this.f9976O.jumpToCurrentState();
                this.f9976O.draw(canvas);
            } else {
                this.f9975N.draw(canvas);
            }
            canvas.translate(-f10, -f11);
        }
    }

    /* JADX INFO: renamed from: E1 */
    public void m12433E1(ColorStateList colorStateList) {
        if (this.f9983V != colorStateList) {
            this.f9983V = colorStateList;
            if (m12546x0()) {
                C10425a.m40118o(this.f9982U, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: E2 */
    public void m12434E2(C7144h c7144h) {
        this.f9984W = c7144h;
    }

    /* JADX INFO: renamed from: F0 */
    public final void m12435F0(@NonNull Canvas canvas, @NonNull Rect rect) {
        this.f9995h0.setColor(this.f10006s0);
        this.f9995h0.setStyle(Paint.Style.FILL);
        this.f9998k0.set(rect);
        if (!this.f9970I0) {
            canvas.drawRoundRect(this.f9998k0, m12453L0(), m12453L0(), this.f9995h0);
        } else {
            m27728h(new RectF(rect), this.f10000m0);
            super.m27741p(canvas, this.f9995h0, this.f10000m0, m27746u());
        }
    }

    /* JADX INFO: renamed from: F1 */
    public void m12436F1(int i10) {
        m12433E1(C7399a.m30678a(this.f9994g0, i10));
    }

    /* JADX INFO: renamed from: F2 */
    public void m12437F2(int i10) {
        m12434E2(C7144h.m29933c(this.f9994g0, i10));
    }

    /* JADX INFO: renamed from: G0 */
    public final void m12438G0(@NonNull Canvas canvas, @NonNull Rect rect) {
        Canvas canvas2;
        Paint paint = this.f9996i0;
        if (paint != null) {
            paint.setColor(C0546c.m2678l(ViewCompat.MEASURED_STATE_MASK, 127));
            canvas.drawRect(rect, this.f9996i0);
            if (m12473R2() || m12470Q2()) {
                m12523o0(rect, this.f9998k0);
                canvas.drawRect(this.f9998k0, this.f9996i0);
            }
            if (this.f9965G != null) {
                canvas2 = canvas;
                canvas2.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f9996i0);
            } else {
                canvas2 = canvas;
            }
            if (m12476S2()) {
                m12531r0(rect, this.f9998k0);
                canvas2.drawRect(this.f9998k0, this.f9996i0);
            }
            this.f9996i0.setColor(C0546c.m2678l(SupportMenu.CATEGORY_MASK, 127));
            m12529q0(rect, this.f9998k0);
            canvas2.drawRect(this.f9998k0, this.f9996i0);
            this.f9996i0.setColor(C0546c.m2678l(-16711936, 127));
            m12534s0(rect, this.f9998k0);
            canvas2.drawRect(this.f9998k0, this.f9996i0);
        }
    }

    /* JADX INFO: renamed from: G1 */
    public void m12439G1(int i10) {
        m12442H1(this.f9994g0.getResources().getBoolean(i10));
    }

    /* JADX INFO: renamed from: G2 */
    public void m12440G2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.f9965G, charSequence)) {
            return;
        }
        this.f9965G = charSequence;
        this.f10001n0.m423k(true);
        invalidateSelf();
        m12549y1();
    }

    /* JADX INFO: renamed from: H0 */
    public final void m12441H0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (this.f9965G != null) {
            Paint.Align alignM12544w0 = m12544w0(rect, this.f9999l0);
            m12540u0(rect, this.f9998k0);
            if (this.f10001n0.m417e() != null) {
                this.f10001n0.m418f().drawableState = getState();
                this.f10001n0.m424l(this.f9994g0);
            }
            this.f10001n0.m418f().setTextAlign(alignM12544w0);
            int iSave = 0;
            boolean z10 = Math.round(this.f10001n0.m419g(m12514k1().toString())) > Math.round(this.f9998k0.width());
            if (z10) {
                iSave = canvas.save();
                canvas.clipRect(this.f9998k0);
            }
            CharSequence charSequenceEllipsize = this.f9965G;
            if (z10 && this.f9964F0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f10001n0.m418f(), this.f9998k0.width(), this.f9964F0);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.f9999l0;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.f10001n0.m418f());
            if (z10) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    /* JADX INFO: renamed from: H1 */
    public void m12442H1(boolean z10) {
        if (this.f9981T != z10) {
            boolean zM12470Q2 = m12470Q2();
            this.f9981T = z10;
            boolean zM12470Q3 = m12470Q2();
            if (zM12470Q2 != zM12470Q3) {
                if (zM12470Q3) {
                    m12520n0(this.f9982U);
                } else {
                    m12479T2(this.f9982U);
                }
                invalidateSelf();
                m12549y1();
            }
        }
    }

    /* JADX INFO: renamed from: H2 */
    public void m12443H2(C5051d c5051d) {
        this.f10001n0.m422j(c5051d, this.f9994g0);
    }

    /* JADX INFO: renamed from: I0 */
    public Drawable m12444I0() {
        return this.f9982U;
    }

    /* JADX INFO: renamed from: I1 */
    public void m12445I1(ColorStateList colorStateList) {
        if (this.f9953A != colorStateList) {
            this.f9953A = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: I2 */
    public void m12446I2(int i10) {
        m12443H2(new C5051d(this.f9994g0, i10));
    }

    /* JADX INFO: renamed from: J0 */
    public ColorStateList m12447J0() {
        return this.f9983V;
    }

    /* JADX INFO: renamed from: J1 */
    public void m12448J1(int i10) {
        m12445I1(C7399a.m30678a(this.f9994g0, i10));
    }

    /* JADX INFO: renamed from: J2 */
    public void m12449J2(float f10) {
        if (this.f9990c0 != f10) {
            this.f9990c0 = f10;
            invalidateSelf();
            m12549y1();
        }
    }

    /* JADX INFO: renamed from: K0 */
    public ColorStateList m12450K0() {
        return this.f9953A;
    }

    @Deprecated
    /* JADX INFO: renamed from: K1 */
    public void m12451K1(float f10) {
        if (this.f9957C != f10) {
            this.f9957C = f10;
            setShapeAppearanceModel(m27698E().m27784w(f10));
        }
    }

    /* JADX INFO: renamed from: K2 */
    public void m12452K2(int i10) {
        m12449J2(this.f9994g0.getResources().getDimension(i10));
    }

    /* JADX INFO: renamed from: L0 */
    public float m12453L0() {
        return this.f9970I0 ? m27703J() : this.f9957C;
    }

    @Deprecated
    /* JADX INFO: renamed from: L1 */
    public void m12454L1(int i10) {
        m12451K1(this.f9994g0.getResources().getDimension(i10));
    }

    /* JADX INFO: renamed from: L2 */
    public void m12455L2(float f10) {
        C5051d c5051dM12516l1 = m12516l1();
        if (c5051dM12516l1 != null) {
            c5051dM12516l1.m23755l(f10);
            this.f10001n0.m418f().setTextSize(f10);
            mo427a();
        }
    }

    /* JADX INFO: renamed from: M0 */
    public float m12456M0() {
        return this.f9993f0;
    }

    /* JADX INFO: renamed from: M1 */
    public void m12457M1(float f10) {
        if (this.f9993f0 != f10) {
            this.f9993f0 = f10;
            invalidateSelf();
            m12549y1();
        }
    }

    /* JADX INFO: renamed from: M2 */
    public void m12458M2(float f10) {
        if (this.f9989b0 != f10) {
            this.f9989b0 = f10;
            invalidateSelf();
            m12549y1();
        }
    }

    /* JADX INFO: renamed from: N0 */
    public Drawable m12459N0() {
        Drawable drawable = this.f9969I;
        if (drawable != null) {
            return C10425a.m40120q(drawable);
        }
        return null;
    }

    /* JADX INFO: renamed from: N1 */
    public void m12460N1(int i10) {
        m12457M1(this.f9994g0.getResources().getDimension(i10));
    }

    /* JADX INFO: renamed from: N2 */
    public void m12461N2(int i10) {
        m12458M2(this.f9994g0.getResources().getDimension(i10));
    }

    /* JADX INFO: renamed from: O0 */
    public float m12462O0() {
        return this.f9972K;
    }

    /* JADX INFO: renamed from: O1 */
    public void m12463O1(Drawable drawable) {
        Drawable drawableM12459N0 = m12459N0();
        if (drawableM12459N0 != drawable) {
            float fM12526p0 = m12526p0();
            this.f9969I = drawable != null ? C10425a.m40121r(drawable).mutate() : null;
            float fM12526p1 = m12526p0();
            m12479T2(drawableM12459N0);
            if (m12473R2()) {
                m12520n0(this.f9969I);
            }
            invalidateSelf();
            if (fM12526p0 != fM12526p1) {
                m12549y1();
            }
        }
    }

    /* JADX INFO: renamed from: O2 */
    public void m12464O2(boolean z10) {
        if (this.f9958C0 != z10) {
            this.f9958C0 = z10;
            m12482U2();
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: P0 */
    public ColorStateList m12465P0() {
        return this.f9971J;
    }

    /* JADX INFO: renamed from: P1 */
    public void m12466P1(int i10) {
        m12463O1(C7399a.m30679b(this.f9994g0, i10));
    }

    /* JADX INFO: renamed from: P2 */
    public boolean m12467P2() {
        return this.f9966G0;
    }

    /* JADX INFO: renamed from: Q0 */
    public float m12468Q0() {
        return this.f9955B;
    }

    /* JADX INFO: renamed from: Q1 */
    public void m12469Q1(float f10) {
        if (this.f9972K != f10) {
            float fM12526p0 = m12526p0();
            this.f9972K = f10;
            float fM12526p1 = m12526p0();
            invalidateSelf();
            if (fM12526p0 != fM12526p1) {
                m12549y1();
            }
        }
    }

    /* JADX INFO: renamed from: Q2 */
    public final boolean m12470Q2() {
        return this.f9981T && this.f9982U != null && this.f10008u0;
    }

    /* JADX INFO: renamed from: R0 */
    public float m12471R0() {
        return this.f9986Y;
    }

    /* JADX INFO: renamed from: R1 */
    public void m12472R1(int i10) {
        m12469Q1(this.f9994g0.getResources().getDimension(i10));
    }

    /* JADX INFO: renamed from: R2 */
    public final boolean m12473R2() {
        return this.f9967H && this.f9969I != null;
    }

    /* JADX INFO: renamed from: S0 */
    public ColorStateList m12474S0() {
        return this.f9959D;
    }

    /* JADX INFO: renamed from: S1 */
    public void m12475S1(ColorStateList colorStateList) {
        this.f9973L = true;
        if (this.f9971J != colorStateList) {
            this.f9971J = colorStateList;
            if (m12473R2()) {
                C10425a.m40118o(this.f9969I, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: S2 */
    public final boolean m12476S2() {
        return this.f9974M && this.f9975N != null;
    }

    /* JADX INFO: renamed from: T0 */
    public float m12477T0() {
        return this.f9961E;
    }

    /* JADX INFO: renamed from: T1 */
    public void m12478T1(int i10) {
        m12475S1(C7399a.m30678a(this.f9994g0, i10));
    }

    /* JADX INFO: renamed from: T2 */
    public final void m12479T2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* JADX INFO: renamed from: U0 */
    public Drawable m12480U0() {
        Drawable drawable = this.f9975N;
        if (drawable != null) {
            return C10425a.m40120q(drawable);
        }
        return null;
    }

    /* JADX INFO: renamed from: U1 */
    public void m12481U1(int i10) {
        m12484V1(this.f9994g0.getResources().getBoolean(i10));
    }

    /* JADX INFO: renamed from: U2 */
    public final void m12482U2() {
        this.f9960D0 = this.f9958C0 ? C5584b.m25241a(this.f9963F) : null;
    }

    /* JADX INFO: renamed from: V0 */
    public CharSequence m12483V0() {
        return this.f9979R;
    }

    /* JADX INFO: renamed from: V1 */
    public void m12484V1(boolean z10) {
        if (this.f9967H != z10) {
            boolean zM12473R2 = m12473R2();
            this.f9967H = z10;
            boolean zM12473R3 = m12473R2();
            if (zM12473R2 != zM12473R3) {
                if (zM12473R3) {
                    m12520n0(this.f9969I);
                } else {
                    m12479T2(this.f9969I);
                }
                invalidateSelf();
                m12549y1();
            }
        }
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: V2 */
    public final void m12485V2() {
        this.f9976O = new RippleDrawable(C5584b.m25241a(m12510i1()), this.f9975N, f9952K0);
    }

    /* JADX INFO: renamed from: W0 */
    public float m12486W0() {
        return this.f9992e0;
    }

    /* JADX INFO: renamed from: W1 */
    public void m12487W1(float f10) {
        if (this.f9955B != f10) {
            this.f9955B = f10;
            invalidateSelf();
            m12549y1();
        }
    }

    /* JADX INFO: renamed from: X0 */
    public float m12488X0() {
        return this.f9978Q;
    }

    /* JADX INFO: renamed from: X1 */
    public void m12489X1(int i10) {
        m12487W1(this.f9994g0.getResources().getDimension(i10));
    }

    /* JADX INFO: renamed from: Y0 */
    public float m12490Y0() {
        return this.f9991d0;
    }

    /* JADX INFO: renamed from: Y1 */
    public void m12491Y1(float f10) {
        if (this.f9986Y != f10) {
            this.f9986Y = f10;
            invalidateSelf();
            m12549y1();
        }
    }

    @NonNull
    /* JADX INFO: renamed from: Z0 */
    public int[] m12492Z0() {
        return this.f9956B0;
    }

    /* JADX INFO: renamed from: Z1 */
    public void m12493Z1(int i10) {
        m12491Y1(this.f9994g0.getResources().getDimension(i10));
    }

    @Override // ad.C0141m.b
    /* JADX INFO: renamed from: a */
    public void mo427a() {
        m12549y1();
        invalidateSelf();
    }

    /* JADX INFO: renamed from: a1 */
    public ColorStateList m12494a1() {
        return this.f9977P;
    }

    /* JADX INFO: renamed from: a2 */
    public void m12495a2(ColorStateList colorStateList) {
        if (this.f9959D != colorStateList) {
            this.f9959D = colorStateList;
            if (this.f9970I0) {
                m27731i0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: b1 */
    public void m12496b1(@NonNull RectF rectF) {
        m12534s0(getBounds(), rectF);
    }

    /* JADX INFO: renamed from: b2 */
    public void m12497b2(int i10) {
        m12495a2(C7399a.m30678a(this.f9994g0, i10));
    }

    /* JADX INFO: renamed from: c1 */
    public final float m12498c1() {
        Drawable drawable = this.f10008u0 ? this.f9982U : this.f9969I;
        float fCeil = this.f9972K;
        if (fCeil <= 0.0f && drawable != null) {
            fCeil = (float) Math.ceil(C0146r.m449d(this.f9994g0, 24));
            if (drawable.getIntrinsicHeight() <= fCeil) {
                return drawable.getIntrinsicHeight();
            }
        }
        return fCeil;
    }

    /* JADX INFO: renamed from: c2 */
    public void m12499c2(float f10) {
        if (this.f9961E != f10) {
            this.f9961E = f10;
            this.f9995h0.setStrokeWidth(f10);
            if (this.f9970I0) {
                super.m27733j0(f10);
            }
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final float m12500d1() {
        Drawable drawable = this.f10008u0 ? this.f9982U : this.f9969I;
        float f10 = this.f9972K;
        return (f10 > 0.0f || drawable == null) ? f10 : drawable.getIntrinsicWidth();
    }

    /* JADX INFO: renamed from: d2 */
    public void m12501d2(int i10) {
        m12499c2(this.f9994g0.getResources().getDimension(i10));
    }

    @Override // p168hd.C6363g, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Canvas canvas2;
        int iM38486a;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i10 = this.f10010w0;
        if (i10 < 255) {
            canvas2 = canvas;
            iM38486a = C9723a.m38486a(canvas2, bounds.left, bounds.top, bounds.right, bounds.bottom, i10);
        } else {
            canvas2 = canvas;
            iM38486a = 0;
        }
        m12429D0(canvas2, bounds);
        m12420A0(canvas2, bounds);
        if (this.f9970I0) {
            super.draw(canvas2);
        }
        m12426C0(canvas2, bounds);
        m12435F0(canvas2, bounds);
        m12423B0(canvas2, bounds);
        m12551z0(canvas2, bounds);
        if (this.f9966G0) {
            m12441H0(canvas2, bounds);
        }
        m12432E0(canvas2, bounds);
        m12438G0(canvas2, bounds);
        if (this.f10010w0 < 255) {
            canvas2.restoreToCount(iM38486a);
        }
    }

    /* JADX INFO: renamed from: e1 */
    public TextUtils.TruncateAt m12502e1() {
        return this.f9964F0;
    }

    /* JADX INFO: renamed from: e2 */
    public final void m12503e2(ColorStateList colorStateList) {
        if (this.f10013z != colorStateList) {
            this.f10013z = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: f1 */
    public C7144h m12504f1() {
        return this.f9985X;
    }

    /* JADX INFO: renamed from: f2 */
    public void m12505f2(Drawable drawable) {
        Drawable drawableM12480U0 = m12480U0();
        if (drawableM12480U0 != drawable) {
            float fM12537t0 = m12537t0();
            this.f9975N = drawable != null ? C10425a.m40121r(drawable).mutate() : null;
            if (C5584b.f21377a) {
                m12485V2();
            }
            float fM12537t1 = m12537t0();
            m12479T2(drawableM12480U0);
            if (m12476S2()) {
                m12520n0(this.f9975N);
            }
            invalidateSelf();
            if (fM12537t0 != fM12537t1) {
                m12549y1();
            }
        }
    }

    /* JADX INFO: renamed from: g1 */
    public float m12506g1() {
        return this.f9988a0;
    }

    /* JADX INFO: renamed from: g2 */
    public void m12507g2(CharSequence charSequence) {
        if (this.f9979R != charSequence) {
            this.f9979R = C12289a.m45645c().m45650h(charSequence);
            invalidateSelf();
        }
    }

    @Override // p168hd.C6363g, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f10010w0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f10011x0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f9955B;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f9986Y + m12526p0() + this.f9989b0 + this.f10001n0.m419g(m12514k1().toString()) + this.f9990c0 + m12537t0() + this.f9993f0), this.f9968H0);
    }

    @Override // p168hd.C6363g, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // p168hd.C6363g, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline) {
        Outline outline2;
        if (this.f9970I0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f9957C);
        } else {
            outline.setRoundRect(bounds, this.f9957C);
            outline2 = outline;
        }
        outline2.setAlpha(getAlpha() / 255.0f);
    }

    /* JADX INFO: renamed from: h1 */
    public float m12508h1() {
        return this.f9987Z;
    }

    /* JADX INFO: renamed from: h2 */
    public void m12509h2(float f10) {
        if (this.f9992e0 != f10) {
            this.f9992e0 = f10;
            invalidateSelf();
            if (m12476S2()) {
                m12549y1();
            }
        }
    }

    /* JADX INFO: renamed from: i1 */
    public ColorStateList m12510i1() {
        return this.f9963F;
    }

    /* JADX INFO: renamed from: i2 */
    public void m12511i2(int i10) {
        m12509h2(this.f9994g0.getResources().getDimension(i10));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p168hd.C6363g, android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (m12416u1(this.f10013z) || m12416u1(this.f9953A) || m12416u1(this.f9959D)) {
            return true;
        }
        return (this.f9958C0 && m12416u1(this.f9960D0)) || m12418w1(this.f10001n0.m417e()) || m12546x0() || m12417v1(this.f9969I) || m12417v1(this.f9982U) || m12416u1(this.f10014z0);
    }

    /* JADX INFO: renamed from: j1 */
    public C7144h m12512j1() {
        return this.f9984W;
    }

    /* JADX INFO: renamed from: j2 */
    public void m12513j2(int i10) {
        m12505f2(C7399a.m30679b(this.f9994g0, i10));
    }

    /* JADX INFO: renamed from: k1 */
    public CharSequence m12514k1() {
        return this.f9965G;
    }

    /* JADX INFO: renamed from: k2 */
    public void m12515k2(float f10) {
        if (this.f9978Q != f10) {
            this.f9978Q = f10;
            invalidateSelf();
            if (m12476S2()) {
                m12549y1();
            }
        }
    }

    /* JADX INFO: renamed from: l1 */
    public C5051d m12516l1() {
        return this.f10001n0.m417e();
    }

    /* JADX INFO: renamed from: l2 */
    public void m12517l2(int i10) {
        m12515k2(this.f9994g0.getResources().getDimension(i10));
    }

    /* JADX INFO: renamed from: m1 */
    public float m12518m1() {
        return this.f9990c0;
    }

    /* JADX INFO: renamed from: m2 */
    public void m12519m2(float f10) {
        if (this.f9991d0 != f10) {
            this.f9991d0 = f10;
            invalidateSelf();
            if (m12476S2()) {
                m12549y1();
            }
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m12520n0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        C10425a.m40116m(drawable, C10425a.m40109f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f9975N) {
            if (drawable.isStateful()) {
                drawable.setState(m12492Z0());
            }
            C10425a.m40118o(drawable, this.f9977P);
            return;
        }
        Drawable drawable2 = this.f9969I;
        if (drawable == drawable2 && this.f9973L) {
            C10425a.m40118o(drawable2, this.f9971J);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    /* JADX INFO: renamed from: n1 */
    public float m12521n1() {
        return this.f9989b0;
    }

    /* JADX INFO: renamed from: n2 */
    public void m12522n2(int i10) {
        m12519m2(this.f9994g0.getResources().getDimension(i10));
    }

    /* JADX INFO: renamed from: o0 */
    public final void m12523o0(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (m12473R2() || m12470Q2()) {
            float f10 = this.f9986Y + this.f9987Z;
            float fM12500d1 = m12500d1();
            if (C10425a.m40109f(this) == 0) {
                float f11 = rect.left + f10;
                rectF.left = f11;
                rectF.right = f11 + fM12500d1;
            } else {
                float f12 = rect.right - f10;
                rectF.right = f12;
                rectF.left = f12 - fM12500d1;
            }
            float fM12498c1 = m12498c1();
            float fExactCenterY = rect.exactCenterY() - (fM12498c1 / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fM12498c1;
        }
    }

    /* JADX INFO: renamed from: o1 */
    public final ColorFilter m12524o1() {
        ColorFilter colorFilter = this.f10011x0;
        return colorFilter != null ? colorFilter : this.f10012y0;
    }

    /* JADX INFO: renamed from: o2 */
    public boolean m12525o2(@NonNull int[] iArr) {
        if (Arrays.equals(this.f9956B0, iArr)) {
            return false;
        }
        this.f9956B0 = iArr;
        if (m12476S2()) {
            return m12552z1(getState(), iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (m12473R2()) {
            zOnLayoutDirectionChanged |= C10425a.m40116m(this.f9969I, i10);
        }
        if (m12470Q2()) {
            zOnLayoutDirectionChanged |= C10425a.m40116m(this.f9982U, i10);
        }
        if (m12476S2()) {
            zOnLayoutDirectionChanged |= C10425a.m40116m(this.f9975N, i10);
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
        if (m12473R2()) {
            zOnLevelChange |= this.f9969I.setLevel(i10);
        }
        if (m12470Q2()) {
            zOnLevelChange |= this.f9982U.setLevel(i10);
        }
        if (m12476S2()) {
            zOnLevelChange |= this.f9975N.setLevel(i10);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // p168hd.C6363g, android.graphics.drawable.Drawable, ad.C0141m.b
    public boolean onStateChange(@NonNull int[] iArr) {
        if (this.f9970I0) {
            super.onStateChange(iArr);
        }
        return m12552z1(iArr, m12492Z0());
    }

    /* JADX INFO: renamed from: p0 */
    public float m12526p0() {
        if (m12473R2() || m12470Q2()) {
            return this.f9987Z + m12500d1() + this.f9988a0;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: p1 */
    public boolean m12527p1() {
        return this.f9958C0;
    }

    /* JADX INFO: renamed from: p2 */
    public void m12528p2(ColorStateList colorStateList) {
        if (this.f9977P != colorStateList) {
            this.f9977P = colorStateList;
            if (m12476S2()) {
                C10425a.m40118o(this.f9975N, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m12529q0(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.set(rect);
        if (m12476S2()) {
            float f10 = this.f9993f0 + this.f9992e0 + this.f9978Q + this.f9991d0 + this.f9990c0;
            if (C10425a.m40109f(this) == 0) {
                rectF.right = rect.right - f10;
            } else {
                rectF.left = rect.left + f10;
            }
        }
    }

    /* JADX INFO: renamed from: q2 */
    public void m12530q2(int i10) {
        m12528p2(C7399a.m30678a(this.f9994g0, i10));
    }

    /* JADX INFO: renamed from: r0 */
    public final void m12531r0(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (m12476S2()) {
            float f10 = this.f9993f0 + this.f9992e0;
            if (C10425a.m40109f(this) == 0) {
                float f11 = rect.right - f10;
                rectF.right = f11;
                rectF.left = f11 - this.f9978Q;
            } else {
                float f12 = rect.left + f10;
                rectF.left = f12;
                rectF.right = f12 + this.f9978Q;
            }
            float fExactCenterY = rect.exactCenterY();
            float f13 = this.f9978Q;
            float f14 = fExactCenterY - (f13 / 2.0f);
            rectF.top = f14;
            rectF.bottom = f14 + f13;
        }
    }

    /* JADX INFO: renamed from: r1 */
    public boolean m12532r1() {
        return this.f9980S;
    }

    /* JADX INFO: renamed from: r2 */
    public void m12533r2(boolean z10) {
        if (this.f9974M != z10) {
            boolean zM12476S2 = m12476S2();
            this.f9974M = z10;
            boolean zM12476S3 = m12476S2();
            if (zM12476S2 != zM12476S3) {
                if (zM12476S3) {
                    m12520n0(this.f9975N);
                } else {
                    m12479T2(this.f9975N);
                }
                invalidateSelf();
                m12549y1();
            }
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m12534s0(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (m12476S2()) {
            float f10 = this.f9993f0 + this.f9992e0 + this.f9978Q + this.f9991d0 + this.f9990c0;
            if (C10425a.m40109f(this) == 0) {
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

    /* JADX INFO: renamed from: s1 */
    public boolean m12535s1() {
        return m12417v1(this.f9975N);
    }

    /* JADX INFO: renamed from: s2 */
    public void m12536s2(a aVar) {
        this.f9962E0 = new WeakReference<>(aVar);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // p168hd.C6363g, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f10010w0 != i10) {
            this.f10010w0 = i10;
            invalidateSelf();
        }
    }

    @Override // p168hd.C6363g, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f10011x0 != colorFilter) {
            this.f10011x0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p168hd.C6363g, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.f10014z0 != colorStateList) {
            this.f10014z0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p168hd.C6363g, android.graphics.drawable.Drawable
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.f9954A0 != mode) {
            this.f9954A0 = mode;
            this.f10012y0 = C12348c.m46213l(this, this.f10014z0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (m12473R2()) {
            visible |= this.f9969I.setVisible(z10, z11);
        }
        if (m12470Q2()) {
            visible |= this.f9982U.setVisible(z10, z11);
        }
        if (m12476S2()) {
            visible |= this.f9975N.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* JADX INFO: renamed from: t0 */
    public float m12537t0() {
        if (m12476S2()) {
            return this.f9991d0 + this.f9978Q + this.f9992e0;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: t1 */
    public boolean m12538t1() {
        return this.f9974M;
    }

    /* JADX INFO: renamed from: t2 */
    public void m12539t2(TextUtils.TruncateAt truncateAt) {
        this.f9964F0 = truncateAt;
    }

    /* JADX INFO: renamed from: u0 */
    public final void m12540u0(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (this.f9965G != null) {
            float fM12526p0 = this.f9986Y + m12526p0() + this.f9989b0;
            float fM12537t0 = this.f9993f0 + m12537t0() + this.f9990c0;
            if (C10425a.m40109f(this) == 0) {
                rectF.left = rect.left + fM12526p0;
                rectF.right = rect.right - fM12537t0;
            } else {
                rectF.left = rect.left + fM12537t0;
                rectF.right = rect.right - fM12526p0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    /* JADX INFO: renamed from: u2 */
    public void m12541u2(C7144h c7144h) {
        this.f9985X = c7144h;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final float m12542v0() {
        this.f10001n0.m418f().getFontMetrics(this.f9997j0);
        Paint.FontMetrics fontMetrics = this.f9997j0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* JADX INFO: renamed from: v2 */
    public void m12543v2(int i10) {
        m12541u2(C7144h.m29933c(this.f9994g0, i10));
    }

    @NonNull
    /* JADX INFO: renamed from: w0 */
    public Paint.Align m12544w0(@NonNull Rect rect, @NonNull PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f9965G != null) {
            float fM12526p0 = this.f9986Y + m12526p0() + this.f9989b0;
            if (C10425a.m40109f(this) == 0) {
                pointF.x = rect.left + fM12526p0;
            } else {
                pointF.x = rect.right - fM12526p0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - m12542v0();
        }
        return align;
    }

    /* JADX INFO: renamed from: w2 */
    public void m12545w2(float f10) {
        if (this.f9988a0 != f10) {
            float fM12526p0 = m12526p0();
            this.f9988a0 = f10;
            float fM12526p1 = m12526p0();
            invalidateSelf();
            if (fM12526p0 != fM12526p1) {
                m12549y1();
            }
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final boolean m12546x0() {
        return this.f9981T && this.f9982U != null && this.f9980S;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m12547x1(AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayM436i = C0143o.m436i(this.f9994g0, attributeSet, C6747k.f26499o0, i10, i11, new int[0]);
        this.f9970I0 = typedArrayM436i.hasValue(C6747k.f26361Z0);
        m12503e2(C5050c.m23736a(this.f9994g0, typedArrayM436i, C6747k.f26244M0));
        m12445I1(C5050c.m23736a(this.f9994g0, typedArrayM436i, C6747k.f26598z0));
        m12487W1(typedArrayM436i.getDimension(C6747k.f26199H0, 0.0f));
        int i12 = C6747k.f26136A0;
        if (typedArrayM436i.hasValue(i12)) {
            m12451K1(typedArrayM436i.getDimension(i12, 0.0f));
        }
        m12495a2(C5050c.m23736a(this.f9994g0, typedArrayM436i, C6747k.f26226K0));
        m12499c2(typedArrayM436i.getDimension(C6747k.f26235L0, 0.0f));
        m12425B2(C5050c.m23736a(this.f9994g0, typedArrayM436i, C6747k.f26352Y0));
        m12440G2(typedArrayM436i.getText(C6747k.f26544t0));
        C5051d c5051dM23741f = C5050c.m23741f(this.f9994g0, typedArrayM436i, C6747k.f26508p0);
        c5051dM23741f.m23755l(typedArrayM436i.getDimension(C6747k.f26517q0, c5051dM23741f.m23753j()));
        m12443H2(c5051dM23741f);
        int i13 = typedArrayM436i.getInt(C6747k.f26526r0, 0);
        if (i13 == 1) {
            m12539t2(TextUtils.TruncateAt.START);
        } else if (i13 == 2) {
            m12539t2(TextUtils.TruncateAt.MIDDLE);
        } else if (i13 == 3) {
            m12539t2(TextUtils.TruncateAt.END);
        }
        m12484V1(typedArrayM436i.getBoolean(C6747k.f26190G0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            m12484V1(typedArrayM436i.getBoolean(C6747k.f26163D0, false));
        }
        m12463O1(C5050c.m23739d(this.f9994g0, typedArrayM436i, C6747k.f26154C0));
        int i14 = C6747k.f26181F0;
        if (typedArrayM436i.hasValue(i14)) {
            m12475S1(C5050c.m23736a(this.f9994g0, typedArrayM436i, i14));
        }
        m12469Q1(typedArrayM436i.getDimension(C6747k.f26172E0, -1.0f));
        m12533r2(typedArrayM436i.getBoolean(C6747k.f26307T0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            m12533r2(typedArrayM436i.getBoolean(C6747k.f26262O0, false));
        }
        m12505f2(C5050c.m23739d(this.f9994g0, typedArrayM436i, C6747k.f26253N0));
        m12528p2(C5050c.m23736a(this.f9994g0, typedArrayM436i, C6747k.f26298S0));
        m12515k2(typedArrayM436i.getDimension(C6747k.f26280Q0, 0.0f));
        m12421A1(typedArrayM436i.getBoolean(C6747k.f26553u0, false));
        m12442H1(typedArrayM436i.getBoolean(C6747k.f26589y0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            m12442H1(typedArrayM436i.getBoolean(C6747k.f26571w0, false));
        }
        m12427C1(C5050c.m23739d(this.f9994g0, typedArrayM436i, C6747k.f26562v0));
        int i15 = C6747k.f26580x0;
        if (typedArrayM436i.hasValue(i15)) {
            m12433E1(C5050c.m23736a(this.f9994g0, typedArrayM436i, i15));
        }
        m12434E2(C7144h.m29932b(this.f9994g0, typedArrayM436i, C6747k.f26371a1));
        m12541u2(C7144h.m29932b(this.f9994g0, typedArrayM436i, C6747k.f26325V0));
        m12491Y1(typedArrayM436i.getDimension(C6747k.f26217J0, 0.0f));
        m12550y2(typedArrayM436i.getDimension(C6747k.f26343X0, 0.0f));
        m12545w2(typedArrayM436i.getDimension(C6747k.f26334W0, 0.0f));
        m12458M2(typedArrayM436i.getDimension(C6747k.f26391c1, 0.0f));
        m12449J2(typedArrayM436i.getDimension(C6747k.f26381b1, 0.0f));
        m12519m2(typedArrayM436i.getDimension(C6747k.f26289R0, 0.0f));
        m12509h2(typedArrayM436i.getDimension(C6747k.f26271P0, 0.0f));
        m12457M1(typedArrayM436i.getDimension(C6747k.f26145B0, 0.0f));
        m12422A2(typedArrayM436i.getDimensionPixelSize(C6747k.f26535s0, Integer.MAX_VALUE));
        typedArrayM436i.recycle();
    }

    /* JADX INFO: renamed from: x2 */
    public void m12548x2(int i10) {
        m12545w2(this.f9994g0.getResources().getDimension(i10));
    }

    /* JADX INFO: renamed from: y1 */
    public void m12549y1() {
        a aVar = this.f9962E0.get();
        if (aVar != null) {
            aVar.mo12391a();
        }
    }

    /* JADX INFO: renamed from: y2 */
    public void m12550y2(float f10) {
        if (this.f9987Z != f10) {
            float fM12526p0 = m12526p0();
            this.f9987Z = f10;
            float fM12526p1 = m12526p0();
            invalidateSelf();
            if (fM12526p0 != fM12526p1) {
                m12549y1();
            }
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m12551z0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (m12470Q2()) {
            m12523o0(rect, this.f9998k0);
            RectF rectF = this.f9998k0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f9982U.setBounds(0, 0, (int) this.f9998k0.width(), (int) this.f9998k0.height());
            this.f9982U.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    /* JADX INFO: renamed from: z1 */
    public final boolean m12552z1(@NonNull int[] iArr, @NonNull int[] iArr2) {
        boolean z10;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f10013z;
        int iM27736l = m27736l(colorStateList != null ? colorStateList.getColorForState(iArr, this.f10002o0) : 0);
        boolean state = true;
        if (this.f10002o0 != iM27736l) {
            this.f10002o0 = iM27736l;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.f9953A;
        int iM27736l2 = m27736l(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f10003p0) : 0);
        if (this.f10003p0 != iM27736l2) {
            this.f10003p0 = iM27736l2;
            zOnStateChange = true;
        }
        int iM44233i = C11840a.m44233i(iM27736l, iM27736l2);
        if ((this.f10004q0 != iM44233i) | (m27749x() == null)) {
            this.f10004q0 = iM44233i;
            m27719a0(ColorStateList.valueOf(iM44233i));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f9959D;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f10005r0) : 0;
        if (this.f10005r0 != colorForState) {
            this.f10005r0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f9960D0 == null || !C5584b.m25242b(iArr)) ? 0 : this.f9960D0.getColorForState(iArr, this.f10006s0);
        if (this.f10006s0 != colorForState2) {
            this.f10006s0 = colorForState2;
            if (this.f9958C0) {
                zOnStateChange = true;
            }
        }
        int colorForState3 = (this.f10001n0.m417e() == null || this.f10001n0.m417e().m23752i() == null) ? 0 : this.f10001n0.m417e().m23752i().getColorForState(iArr, this.f10007t0);
        if (this.f10007t0 != colorForState3) {
            this.f10007t0 = colorForState3;
            zOnStateChange = true;
        }
        boolean z11 = m12415q1(getState(), R.attr.state_checked) && this.f9980S;
        if (this.f10008u0 == z11 || this.f9982U == null) {
            z10 = false;
        } else {
            float fM12526p0 = m12526p0();
            this.f10008u0 = z11;
            if (fM12526p0 != m12526p0()) {
                zOnStateChange = true;
                z10 = true;
            } else {
                z10 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.f10014z0;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f10009v0) : 0;
        if (this.f10009v0 != colorForState4) {
            this.f10009v0 = colorForState4;
            this.f10012y0 = C12348c.m46213l(this, this.f10014z0, this.f9954A0);
        } else {
            state = zOnStateChange;
        }
        if (m12417v1(this.f9969I)) {
            state |= this.f9969I.setState(iArr);
        }
        if (m12417v1(this.f9982U)) {
            state |= this.f9982U.setState(iArr);
        }
        if (m12417v1(this.f9975N)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f9975N.setState(iArr3);
        }
        if (C5584b.f21377a && m12417v1(this.f9976O)) {
            state |= this.f9976O.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z10) {
            m12549y1();
        }
        return state;
    }

    /* JADX INFO: renamed from: z2 */
    public void m12553z2(int i10) {
        m12550y2(this.f9994g0.getResources().getDimension(i10));
    }
}
