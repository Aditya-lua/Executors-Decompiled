package ad;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.C0614k;
import androidx.core.view.C0625o0;
import androidx.core.view.GravityCompat;
import p101ed.C5048a;
import p101ed.C5051d;
import p101ed.C5055h;
import p216jc.C7137a;
import p426s2.C11162a;
import p463uc.C11840a;
import p505w2.C12295g;
import p533x2.C12637g;

/* JADX INFO: renamed from: ad.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C0129a {

    /* JADX INFO: renamed from: t0 */
    public static final boolean f388t0 = false;

    /* JADX INFO: renamed from: u0 */
    @NonNull
    public static final Paint f389u0 = null;

    /* JADX INFO: renamed from: A */
    public Typeface f390A;

    /* JADX INFO: renamed from: B */
    public Typeface f391B;

    /* JADX INFO: renamed from: C */
    public Typeface f392C;

    /* JADX INFO: renamed from: D */
    public C5048a f393D;

    /* JADX INFO: renamed from: E */
    public C5048a f394E;

    /* JADX INFO: renamed from: G */
    public CharSequence f396G;

    /* JADX INFO: renamed from: H */
    public CharSequence f397H;

    /* JADX INFO: renamed from: I */
    public boolean f398I;

    /* JADX INFO: renamed from: K */
    public boolean f400K;

    /* JADX INFO: renamed from: L */
    public Bitmap f401L;

    /* JADX INFO: renamed from: M */
    public Paint f402M;

    /* JADX INFO: renamed from: N */
    public float f403N;

    /* JADX INFO: renamed from: O */
    public float f404O;

    /* JADX INFO: renamed from: P */
    public float f405P;

    /* JADX INFO: renamed from: Q */
    public float f406Q;

    /* JADX INFO: renamed from: R */
    public float f407R;

    /* JADX INFO: renamed from: S */
    public int f408S;

    /* JADX INFO: renamed from: T */
    public int[] f409T;

    /* JADX INFO: renamed from: U */
    public boolean f410U;

    /* JADX INFO: renamed from: V */
    @NonNull
    public final TextPaint f411V;

    /* JADX INFO: renamed from: W */
    @NonNull
    public final TextPaint f412W;

    /* JADX INFO: renamed from: X */
    public TimeInterpolator f413X;

    /* JADX INFO: renamed from: Y */
    public TimeInterpolator f414Y;

    /* JADX INFO: renamed from: Z */
    public float f415Z;

    /* JADX INFO: renamed from: a */
    public final View f416a;

    /* JADX INFO: renamed from: a0 */
    public float f417a0;

    /* JADX INFO: renamed from: b */
    public float f418b;

    /* JADX INFO: renamed from: b0 */
    public float f419b0;

    /* JADX INFO: renamed from: c */
    public boolean f420c;

    /* JADX INFO: renamed from: c0 */
    public ColorStateList f421c0;

    /* JADX INFO: renamed from: d */
    public float f422d;

    /* JADX INFO: renamed from: d0 */
    public float f423d0;

    /* JADX INFO: renamed from: e */
    public float f424e;

    /* JADX INFO: renamed from: e0 */
    public float f425e0;

    /* JADX INFO: renamed from: f */
    public int f426f;

    /* JADX INFO: renamed from: f0 */
    public float f427f0;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final Rect f428g;

    /* JADX INFO: renamed from: g0 */
    public ColorStateList f429g0;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final Rect f430h;

    /* JADX INFO: renamed from: h0 */
    public float f431h0;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final RectF f432i;

    /* JADX INFO: renamed from: i0 */
    public float f433i0;

    /* JADX INFO: renamed from: j0 */
    public float f435j0;

    /* JADX INFO: renamed from: k0 */
    public StaticLayout f437k0;

    /* JADX INFO: renamed from: l0 */
    public float f439l0;

    /* JADX INFO: renamed from: m0 */
    public float f441m0;

    /* JADX INFO: renamed from: n */
    public ColorStateList f442n;

    /* JADX INFO: renamed from: n0 */
    public float f443n0;

    /* JADX INFO: renamed from: o */
    public ColorStateList f444o;

    /* JADX INFO: renamed from: o0 */
    public CharSequence f445o0;

    /* JADX INFO: renamed from: p */
    public int f446p;

    /* JADX INFO: renamed from: q */
    public float f448q;

    /* JADX INFO: renamed from: r */
    public float f450r;

    /* JADX INFO: renamed from: s */
    public float f452s;

    /* JADX INFO: renamed from: t */
    public float f454t;

    /* JADX INFO: renamed from: u */
    public float f455u;

    /* JADX INFO: renamed from: v */
    public float f456v;

    /* JADX INFO: renamed from: w */
    public Typeface f457w;

    /* JADX INFO: renamed from: x */
    public Typeface f458x;

    /* JADX INFO: renamed from: y */
    public Typeface f459y;

    /* JADX INFO: renamed from: z */
    public Typeface f460z;

    /* JADX INFO: renamed from: j */
    public int f434j = 16;

    /* JADX INFO: renamed from: k */
    public int f436k = 16;

    /* JADX INFO: renamed from: l */
    public float f438l = 15.0f;

    /* JADX INFO: renamed from: m */
    public float f440m = 15.0f;

    /* JADX INFO: renamed from: F */
    public TextUtils.TruncateAt f395F = TextUtils.TruncateAt.END;

    /* JADX INFO: renamed from: J */
    public boolean f399J = true;

    /* JADX INFO: renamed from: p0 */
    public int f447p0 = 1;

    /* JADX INFO: renamed from: q0 */
    public float f449q0 = 0.0f;

    /* JADX INFO: renamed from: r0 */
    public float f451r0 = 1.0f;

    /* JADX INFO: renamed from: s0 */
    public int f453s0 = C0139k.f481n;

    /* JADX INFO: renamed from: ad.a$a */
    public class a implements C5048a.a {
        public a() {
        }

        @Override // p101ed.C5048a.a
        /* JADX INFO: renamed from: a */
        public void mo385a(Typeface typeface) {
            C0129a.this.m343T(typeface);
        }
    }

    public C0129a(View view) {
        this.f416a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f411V = textPaint;
        this.f412W = new TextPaint(textPaint);
        this.f430h = new Rect();
        this.f428g = new Rect();
        this.f432i = new RectF();
        this.f424e = m357e();
        m332H(view.getContext().getResources().getConfiguration());
    }

    /* JADX INFO: renamed from: C */
    public static boolean m323C(float f10, float f11) {
        return Math.abs(f10 - f11) < 1.0E-5f;
    }

    /* JADX INFO: renamed from: G */
    public static float m324G(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return C7137a.m29919a(f10, f11, f12);
    }

    /* JADX INFO: renamed from: L */
    public static boolean m325L(@NonNull Rect rect, int i10, int i11, int i12, int i13) {
        return rect.left == i10 && rect.top == i11 && rect.right == i12 && rect.bottom == i13;
    }

    /* JADX INFO: renamed from: a */
    public static int m326a(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i10) * f11) + (Color.alpha(i11) * f10)), Math.round((Color.red(i10) * f11) + (Color.red(i11) * f10)), Math.round((Color.green(i10) * f11) + (Color.green(i11) * f10)), Math.round((Color.blue(i10) * f11) + (Color.blue(i11) * f10)));
    }

    /* JADX INFO: renamed from: A */
    public final void m327A(@NonNull TextPaint textPaint) {
        textPaint.setTextSize(this.f438l);
        textPaint.setTypeface(this.f460z);
        textPaint.setLetterSpacing(this.f433i0);
    }

    /* JADX INFO: renamed from: B */
    public final void m328B(float f10) {
        if (this.f420c) {
            this.f432i.set(f10 < this.f424e ? this.f428g : this.f430h);
            return;
        }
        this.f432i.left = m324G(this.f428g.left, this.f430h.left, f10, this.f413X);
        this.f432i.top = m324G(this.f448q, this.f450r, f10, this.f413X);
        this.f432i.right = m324G(this.f428g.right, this.f430h.right, f10, this.f413X);
        this.f432i.bottom = m324G(this.f428g.bottom, this.f430h.bottom, f10, this.f413X);
    }

    /* JADX INFO: renamed from: D */
    public final boolean m329D() {
        return C0625o0.m3065z(this.f416a) == 1;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m330E() {
        ColorStateList colorStateList = this.f444o;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f442n;
        return colorStateList2 != null && colorStateList2.isStateful();
    }

    /* JADX INFO: renamed from: F */
    public final boolean m331F(@NonNull CharSequence charSequence, boolean z10) {
        return (z10 ? C12295g.f43564d : C12295g.f43563c).isRtl(charSequence, 0, charSequence.length());
    }

    /* JADX INFO: renamed from: H */
    public void m332H(@NonNull Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f459y;
            if (typeface != null) {
                this.f458x = C5055h.m23765b(configuration, typeface);
            }
            Typeface typeface2 = this.f391B;
            if (typeface2 != null) {
                this.f390A = C5055h.m23765b(configuration, typeface2);
            }
            Typeface typeface3 = this.f458x;
            if (typeface3 == null) {
                typeface3 = this.f459y;
            }
            this.f457w = typeface3;
            Typeface typeface4 = this.f390A;
            if (typeface4 == null) {
                typeface4 = this.f391B;
            }
            this.f460z = typeface4;
            m335K(true);
        }
    }

    /* JADX INFO: renamed from: I */
    public final float m333I(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* JADX INFO: renamed from: J */
    public void m334J() {
        m335K(false);
    }

    /* JADX INFO: renamed from: K */
    public void m335K(boolean z10) {
        if ((this.f416a.getHeight() <= 0 || this.f416a.getWidth() <= 0) && !z10) {
            return;
        }
        m351b(z10);
        m353c();
    }

    /* JADX INFO: renamed from: M */
    public void m336M(ColorStateList colorStateList) {
        if (this.f444o == colorStateList && this.f442n == colorStateList) {
            return;
        }
        this.f444o = colorStateList;
        this.f442n = colorStateList;
        m334J();
    }

    /* JADX INFO: renamed from: N */
    public void m337N(int i10, int i11, int i12, int i13) {
        if (m325L(this.f430h, i10, i11, i12, i13)) {
            return;
        }
        this.f430h.set(i10, i11, i12, i13);
        this.f410U = true;
    }

    /* JADX INFO: renamed from: O */
    public void m338O(@NonNull Rect rect) {
        m337N(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: renamed from: P */
    public void m339P(int i10) {
        C5051d c5051d = new C5051d(this.f416a.getContext(), i10);
        if (c5051d.m23752i() != null) {
            this.f444o = c5051d.m23752i();
        }
        if (c5051d.m23753j() != 0.0f) {
            this.f440m = c5051d.m23753j();
        }
        ColorStateList colorStateList = c5051d.f19854c;
        if (colorStateList != null) {
            this.f421c0 = colorStateList;
        }
        this.f417a0 = c5051d.f19859h;
        this.f419b0 = c5051d.f19860i;
        this.f415Z = c5051d.f19861j;
        this.f431h0 = c5051d.f19863l;
        C5048a c5048a = this.f394E;
        if (c5048a != null) {
            c5048a.m23728c();
        }
        this.f394E = new C5048a(new a(), c5051d.m23748e());
        c5051d.m23751h(this.f416a.getContext(), this.f394E);
        m334J();
    }

    /* JADX INFO: renamed from: Q */
    public final void m340Q(float f10) {
        this.f441m0 = f10;
        C0625o0.m3022d0(this.f416a);
    }

    /* JADX INFO: renamed from: R */
    public void m341R(ColorStateList colorStateList) {
        if (this.f444o != colorStateList) {
            this.f444o = colorStateList;
            m334J();
        }
    }

    /* JADX INFO: renamed from: S */
    public void m342S(int i10) {
        if (this.f436k != i10) {
            this.f436k = i10;
            m334J();
        }
    }

    /* JADX INFO: renamed from: T */
    public void m343T(Typeface typeface) {
        if (m344U(typeface)) {
            m334J();
        }
    }

    /* JADX INFO: renamed from: U */
    public final boolean m344U(Typeface typeface) {
        C5048a c5048a = this.f394E;
        if (c5048a != null) {
            c5048a.m23728c();
        }
        if (this.f459y == typeface) {
            return false;
        }
        this.f459y = typeface;
        Typeface typefaceM23765b = C5055h.m23765b(this.f416a.getContext().getResources().getConfiguration(), typeface);
        this.f458x = typefaceM23765b;
        if (typefaceM23765b == null) {
            typefaceM23765b = this.f459y;
        }
        this.f457w = typefaceM23765b;
        return true;
    }

    /* JADX INFO: renamed from: V */
    public void m345V(int i10, int i11, int i12, int i13) {
        if (m325L(this.f428g, i10, i11, i12, i13)) {
            return;
        }
        this.f428g.set(i10, i11, i12, i13);
        this.f410U = true;
    }

    /* JADX INFO: renamed from: W */
    public void m346W(@NonNull Rect rect) {
        m345V(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: renamed from: X */
    public void m347X(float f10) {
        if (this.f433i0 != f10) {
            this.f433i0 = f10;
            m334J();
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m348Y(float f10) {
        this.f443n0 = f10;
        C0625o0.m3022d0(this.f416a);
    }

    /* JADX INFO: renamed from: Z */
    public void m349Z(int i10) {
        if (this.f434j != i10) {
            this.f434j = i10;
            m334J();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m350a0(float f10) {
        if (this.f438l != f10) {
            this.f438l = f10;
            m334J();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m351b(boolean z10) {
        StaticLayout staticLayout;
        m365i(1.0f, z10);
        CharSequence charSequence = this.f397H;
        if (charSequence != null && (staticLayout = this.f437k0) != null) {
            this.f445o0 = TextUtils.ellipsize(charSequence, this.f411V, staticLayout.getWidth(), this.f395F);
        }
        CharSequence charSequence2 = this.f445o0;
        float fM333I = 0.0f;
        if (charSequence2 != null) {
            this.f439l0 = m333I(this.f411V, charSequence2);
        } else {
            this.f439l0 = 0.0f;
        }
        int iM2930b = C0614k.m2930b(this.f436k, this.f398I ? 1 : 0);
        int i10 = iM2930b & 112;
        if (i10 == 48) {
            this.f450r = this.f430h.top;
        } else if (i10 != 80) {
            this.f450r = this.f430h.centerY() - ((this.f411V.descent() - this.f411V.ascent()) / 2.0f);
        } else {
            this.f450r = this.f430h.bottom + this.f411V.ascent();
        }
        int i11 = iM2930b & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i11 == 1) {
            this.f454t = this.f430h.centerX() - (this.f439l0 / 2.0f);
        } else if (i11 != 5) {
            this.f454t = this.f430h.left;
        } else {
            this.f454t = this.f430h.right - this.f439l0;
        }
        m365i(0.0f, z10);
        StaticLayout staticLayout2 = this.f437k0;
        float height = staticLayout2 != null ? staticLayout2.getHeight() : 0.0f;
        StaticLayout staticLayout3 = this.f437k0;
        if (staticLayout3 == null || this.f447p0 <= 1) {
            CharSequence charSequence3 = this.f397H;
            if (charSequence3 != null) {
                fM333I = m333I(this.f411V, charSequence3);
            }
        } else {
            fM333I = staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.f437k0;
        this.f446p = staticLayout4 != null ? staticLayout4.getLineCount() : 0;
        int iM2930b2 = C0614k.m2930b(this.f434j, this.f398I ? 1 : 0);
        int i12 = iM2930b2 & 112;
        if (i12 == 48) {
            this.f448q = this.f428g.top;
        } else if (i12 != 80) {
            this.f448q = this.f428g.centerY() - (height / 2.0f);
        } else {
            this.f448q = (this.f428g.bottom - height) + this.f411V.descent();
        }
        int i13 = iM2930b2 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i13 == 1) {
            this.f452s = this.f428g.centerX() - (fM333I / 2.0f);
        } else if (i13 != 5) {
            this.f452s = this.f428g.left;
        } else {
            this.f452s = this.f428g.right - fM333I;
        }
        m367j();
        m356d0(this.f418b);
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m352b0(Typeface typeface) {
        C5048a c5048a = this.f393D;
        if (c5048a != null) {
            c5048a.m23728c();
        }
        if (this.f391B == typeface) {
            return false;
        }
        this.f391B = typeface;
        Typeface typefaceM23765b = C5055h.m23765b(this.f416a.getContext().getResources().getConfiguration(), typeface);
        this.f390A = typefaceM23765b;
        if (typefaceM23765b == null) {
            typefaceM23765b = this.f391B;
        }
        this.f460z = typefaceM23765b;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m353c() {
        m361g(this.f418b);
    }

    /* JADX INFO: renamed from: c0 */
    public void m354c0(float f10) {
        float fM42059b = C11162a.m42059b(f10, 0.0f, 1.0f);
        if (fM42059b != this.f418b) {
            this.f418b = fM42059b;
            m353c();
        }
    }

    /* JADX INFO: renamed from: d */
    public final float m355d(float f10) {
        float f11 = this.f424e;
        return f10 <= f11 ? C7137a.m29920b(1.0f, 0.0f, this.f422d, f11, f10) : C7137a.m29920b(0.0f, 1.0f, f11, 1.0f, f10);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m356d0(float f10) {
        m363h(f10);
        boolean z10 = f388t0 && this.f403N != 1.0f;
        this.f400K = z10;
        if (z10) {
            m372n();
        }
        C0625o0.m3022d0(this.f416a);
    }

    /* JADX INFO: renamed from: e */
    public final float m357e() {
        float f10 = this.f422d;
        return f10 + ((1.0f - f10) * 0.5f);
    }

    /* JADX INFO: renamed from: e0 */
    public void m358e0(TimeInterpolator timeInterpolator) {
        this.f413X = timeInterpolator;
        m334J();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m359f(@NonNull CharSequence charSequence) {
        boolean zM329D = m329D();
        return this.f399J ? m331F(charSequence, zM329D) : zM329D;
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m360f0(int[] iArr) {
        this.f409T = iArr;
        if (!m330E()) {
            return false;
        }
        m334J();
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m361g(float f10) {
        float f11;
        m328B(f10);
        if (!this.f420c) {
            this.f455u = m324G(this.f452s, this.f454t, f10, this.f413X);
            this.f456v = m324G(this.f448q, this.f450r, f10, this.f413X);
            m356d0(f10);
            f11 = f10;
        } else if (f10 < this.f424e) {
            this.f455u = this.f452s;
            this.f456v = this.f448q;
            m356d0(0.0f);
            f11 = 0.0f;
        } else {
            this.f455u = this.f454t;
            this.f456v = this.f450r - Math.max(0, this.f426f);
            m356d0(1.0f);
            f11 = 1.0f;
        }
        TimeInterpolator timeInterpolator = C7137a.f27785b;
        m340Q(1.0f - m324G(0.0f, 1.0f, 1.0f - f10, timeInterpolator));
        m348Y(m324G(1.0f, 0.0f, f10, timeInterpolator));
        if (this.f444o != this.f442n) {
            this.f411V.setColor(m326a(m380v(), m378t(), f11));
        } else {
            this.f411V.setColor(m378t());
        }
        int i10 = Build.VERSION.SDK_INT;
        float f12 = this.f431h0;
        float f13 = this.f433i0;
        if (f12 != f13) {
            this.f411V.setLetterSpacing(m324G(f13, f12, f10, timeInterpolator));
        } else {
            this.f411V.setLetterSpacing(f12);
        }
        this.f405P = m324G(this.f423d0, this.f415Z, f10, null);
        this.f406Q = m324G(this.f425e0, this.f417a0, f10, null);
        this.f407R = m324G(this.f427f0, this.f419b0, f10, null);
        int iM326a = m326a(m379u(this.f429g0), m379u(this.f421c0), f10);
        this.f408S = iM326a;
        this.f411V.setShadowLayer(this.f405P, this.f406Q, this.f407R, iM326a);
        if (this.f420c) {
            this.f411V.setAlpha((int) (m355d(f10) * this.f411V.getAlpha()));
            if (i10 >= 31) {
                TextPaint textPaint = this.f411V;
                textPaint.setShadowLayer(this.f405P, this.f406Q, this.f407R, C11840a.m44225a(this.f408S, textPaint.getAlpha()));
            }
        }
        C0625o0.m3022d0(this.f416a);
    }

    /* JADX INFO: renamed from: g0 */
    public void m362g0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f396G, charSequence)) {
            this.f396G = charSequence;
            this.f397H = null;
            m367j();
            m334J();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m363h(float f10) {
        m365i(f10, false);
    }

    /* JADX INFO: renamed from: h0 */
    public void m364h0(TimeInterpolator timeInterpolator) {
        this.f414Y = timeInterpolator;
        m334J();
    }

    /* JADX INFO: renamed from: i */
    public final void m365i(float f10, boolean z10) {
        float f11;
        float f12;
        Typeface typeface;
        if (this.f396G == null) {
            return;
        }
        float fWidth = this.f430h.width();
        float fWidth2 = this.f428g.width();
        if (m323C(f10, 1.0f)) {
            f11 = this.f440m;
            f12 = this.f431h0;
            this.f403N = 1.0f;
            typeface = this.f457w;
        } else {
            float f13 = this.f438l;
            float f14 = this.f433i0;
            Typeface typeface2 = this.f460z;
            if (m323C(f10, 0.0f)) {
                this.f403N = 1.0f;
            } else {
                this.f403N = m324G(this.f438l, this.f440m, f10, this.f414Y) / this.f438l;
            }
            float f15 = this.f440m / this.f438l;
            fWidth = (z10 || this.f420c || fWidth2 * f15 <= fWidth) ? fWidth2 : Math.min(fWidth / f15, fWidth2);
            f11 = f13;
            f12 = f14;
            typeface = typeface2;
        }
        boolean z11 = false;
        if (fWidth > 0.0f) {
            boolean z12 = this.f404O != f11;
            boolean z13 = this.f435j0 != f12;
            boolean z14 = this.f392C != typeface;
            StaticLayout staticLayout = this.f437k0;
            boolean z15 = z12 || z13 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z14 || this.f410U;
            this.f404O = f11;
            this.f435j0 = f12;
            this.f392C = typeface;
            this.f410U = false;
            this.f411V.setLinearText(this.f403N != 1.0f);
            z11 = z15;
        }
        if (this.f397H == null || z11) {
            this.f411V.setTextSize(this.f404O);
            this.f411V.setTypeface(this.f392C);
            this.f411V.setLetterSpacing(this.f435j0);
            this.f398I = m359f(this.f396G);
            StaticLayout staticLayoutM369k = m369k(m368j0() ? this.f447p0 : 1, fWidth, this.f398I);
            this.f437k0 = staticLayoutM369k;
            this.f397H = staticLayoutM369k.getText();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m366i0(Typeface typeface) {
        boolean zM344U = m344U(typeface);
        boolean zM352b0 = m352b0(typeface);
        if (zM344U || zM352b0) {
            m334J();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m367j() {
        Bitmap bitmap = this.f401L;
        if (bitmap != null) {
            bitmap.recycle();
            this.f401L = null;
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m368j0() {
        if (this.f447p0 > 1) {
            return (!this.f398I || this.f420c) && !this.f400K;
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final StaticLayout m369k(int i10, float f10, boolean z10) {
        return (StaticLayout) C12637g.m47075g(C0139k.m403b(this.f396G, this.f411V, (int) f10).m406d(this.f395F).m409g(z10).m405c(i10 == 1 ? Layout.Alignment.ALIGN_NORMAL : m383y()).m408f(false).m411i(i10).m410h(this.f449q0, this.f451r0).m407e(this.f453s0).m412j(null).m404a());
    }

    /* JADX INFO: renamed from: l */
    public void m370l(@NonNull Canvas canvas) {
        int iSave = canvas.save();
        if (this.f397H == null || this.f432i.width() <= 0.0f || this.f432i.height() <= 0.0f) {
            return;
        }
        this.f411V.setTextSize(this.f404O);
        float f10 = this.f455u;
        float f11 = this.f456v;
        boolean z10 = this.f400K && this.f401L != null;
        float f12 = this.f403N;
        if (f12 != 1.0f && !this.f420c) {
            canvas.scale(f12, f12, f10, f11);
        }
        if (z10) {
            canvas.drawBitmap(this.f401L, f10, f11, this.f402M);
            canvas.restoreToCount(iSave);
            return;
        }
        if (!m368j0() || (this.f420c && this.f418b <= this.f424e)) {
            canvas.translate(f10, f11);
            this.f437k0.draw(canvas);
        } else {
            m371m(canvas, this.f455u - this.f437k0.getLineStart(0), f11);
        }
        canvas.restoreToCount(iSave);
    }

    /* JADX INFO: renamed from: m */
    public final void m371m(@NonNull Canvas canvas, float f10, float f11) {
        int alpha = this.f411V.getAlpha();
        canvas.translate(f10, f11);
        if (!this.f420c) {
            this.f411V.setAlpha((int) (this.f443n0 * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.f411V;
                textPaint.setShadowLayer(this.f405P, this.f406Q, this.f407R, C11840a.m44225a(this.f408S, textPaint.getAlpha()));
            }
            this.f437k0.draw(canvas);
        }
        if (!this.f420c) {
            this.f411V.setAlpha((int) (this.f441m0 * alpha));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            TextPaint textPaint2 = this.f411V;
            textPaint2.setShadowLayer(this.f405P, this.f406Q, this.f407R, C11840a.m44225a(this.f408S, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f437k0.getLineBaseline(0);
        CharSequence charSequence = this.f445o0;
        float f12 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, this.f411V);
        if (i10 >= 31) {
            this.f411V.setShadowLayer(this.f405P, this.f406Q, this.f407R, this.f408S);
        }
        if (this.f420c) {
            return;
        }
        String strTrim = this.f445o0.toString().trim();
        if (strTrim.endsWith("…")) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        String str = strTrim;
        this.f411V.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f437k0.getLineEnd(0), str.length()), 0.0f, f12, (Paint) this.f411V);
    }

    /* JADX INFO: renamed from: n */
    public final void m372n() {
        if (this.f401L != null || this.f428g.isEmpty() || TextUtils.isEmpty(this.f397H)) {
            return;
        }
        m361g(0.0f);
        int width = this.f437k0.getWidth();
        int height = this.f437k0.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.f401L = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.f437k0.draw(new Canvas(this.f401L));
        if (this.f402M == null) {
            this.f402M = new Paint(3);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m373o(@NonNull RectF rectF, int i10, int i11) {
        this.f398I = m359f(this.f396G);
        rectF.left = Math.max(m376r(i10, i11), this.f430h.left);
        rectF.top = this.f430h.top;
        rectF.right = Math.min(m377s(rectF, i10, i11), this.f430h.right);
        rectF.bottom = this.f430h.top + m375q();
    }

    /* JADX INFO: renamed from: p */
    public ColorStateList m374p() {
        return this.f444o;
    }

    /* JADX INFO: renamed from: q */
    public float m375q() {
        m384z(this.f412W);
        return -this.f412W.ascent();
    }

    /* JADX INFO: renamed from: r */
    public final float m376r(int i10, int i11) {
        if (i11 == 17 || (i11 & 7) == 1) {
            return (i10 / 2.0f) - (this.f439l0 / 2.0f);
        }
        if ((i11 & GravityCompat.END) == 8388613 || (i11 & 5) == 5) {
            return this.f398I ? this.f430h.left : this.f430h.right - this.f439l0;
        }
        return this.f398I ? this.f430h.right - this.f439l0 : this.f430h.left;
    }

    /* JADX INFO: renamed from: s */
    public final float m377s(@NonNull RectF rectF, int i10, int i11) {
        if (i11 == 17 || (i11 & 7) == 1) {
            return (i10 / 2.0f) + (this.f439l0 / 2.0f);
        }
        if ((i11 & GravityCompat.END) == 8388613 || (i11 & 5) == 5) {
            return this.f398I ? rectF.left + this.f439l0 : this.f430h.right;
        }
        return this.f398I ? this.f430h.right : rectF.left + this.f439l0;
    }

    /* JADX INFO: renamed from: t */
    public int m378t() {
        return m379u(this.f444o);
    }

    /* JADX INFO: renamed from: u */
    public final int m379u(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f409T;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* JADX INFO: renamed from: v */
    public final int m380v() {
        return m379u(this.f442n);
    }

    /* JADX INFO: renamed from: w */
    public float m381w() {
        m327A(this.f412W);
        return -this.f412W.ascent();
    }

    /* JADX INFO: renamed from: x */
    public float m382x() {
        return this.f418b;
    }

    /* JADX INFO: renamed from: y */
    public final Layout.Alignment m383y() {
        int iM2930b = C0614k.m2930b(this.f434j, this.f398I ? 1 : 0) & 7;
        if (iM2930b == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (iM2930b != 5) {
            return this.f398I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return this.f398I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
    }

    /* JADX INFO: renamed from: z */
    public final void m384z(@NonNull TextPaint textPaint) {
        textPaint.setTextSize(this.f440m);
        textPaint.setTypeface(this.f457w);
        textPaint.setLetterSpacing(this.f431h0);
    }
}
