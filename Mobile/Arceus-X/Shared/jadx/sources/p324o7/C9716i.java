package p324o7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p121f7.C5451h0;
import p121f7.C5452i;
import p121f7.InterfaceC5465o0;
import p162h7.C6297d;
import p189i7.AbstractC6643a;
import p189i7.C6646d;
import p189i7.C6657o;
import p189i7.C6659q;
import p266l7.C8003b;
import p266l7.C8004c;
import p266l7.C8005d;
import p288m7.C8453a;
import p288m7.C8454b;
import p288m7.C8456d;
import p288m7.C8463k;
import p288m7.C8464l;
import p288m7.C8465m;
import p303n7.C8911q;
import p303n7.EnumC8915u;
import p431s7.C11186b;
import p431s7.C11197m;
import p444t7.C11552c;
import p504w1.C12283g;

/* JADX INFO: renamed from: o7.i */
/* JADX INFO: loaded from: classes3.dex */
public class C9716i extends AbstractC9709b {

    /* JADX INFO: renamed from: E */
    public final StringBuilder f35348E;

    /* JADX INFO: renamed from: F */
    public final RectF f35349F;

    /* JADX INFO: renamed from: G */
    public final Matrix f35350G;

    /* JADX INFO: renamed from: H */
    public final Paint f35351H;

    /* JADX INFO: renamed from: I */
    public final Paint f35352I;

    /* JADX INFO: renamed from: J */
    public final Map<C8005d, List<C6297d>> f35353J;

    /* JADX INFO: renamed from: K */
    public final C12283g<String> f35354K;

    /* JADX INFO: renamed from: L */
    public final List<d> f35355L;

    /* JADX INFO: renamed from: M */
    public final C6657o f35356M;

    /* JADX INFO: renamed from: N */
    public final C5451h0 f35357N;

    /* JADX INFO: renamed from: O */
    public final C5452i f35358O;

    /* JADX INFO: renamed from: P */
    public EnumC8915u f35359P;

    /* JADX INFO: renamed from: Q */
    public AbstractC6643a<Integer, Integer> f35360Q;

    /* JADX INFO: renamed from: R */
    public AbstractC6643a<Integer, Integer> f35361R;

    /* JADX INFO: renamed from: S */
    public AbstractC6643a<Integer, Integer> f35362S;

    /* JADX INFO: renamed from: T */
    public AbstractC6643a<Integer, Integer> f35363T;

    /* JADX INFO: renamed from: U */
    public AbstractC6643a<Float, Float> f35364U;

    /* JADX INFO: renamed from: V */
    public AbstractC6643a<Float, Float> f35365V;

    /* JADX INFO: renamed from: W */
    public AbstractC6643a<Float, Float> f35366W;

    /* JADX INFO: renamed from: X */
    public AbstractC6643a<Float, Float> f35367X;

    /* JADX INFO: renamed from: Y */
    public AbstractC6643a<Integer, Integer> f35368Y;

    /* JADX INFO: renamed from: Z */
    public AbstractC6643a<Float, Float> f35369Z;

    /* JADX INFO: renamed from: a0 */
    public AbstractC6643a<Typeface, Typeface> f35370a0;

    /* JADX INFO: renamed from: b0 */
    public AbstractC6643a<Integer, Integer> f35371b0;

    /* JADX INFO: renamed from: c0 */
    public AbstractC6643a<Integer, Integer> f35372c0;

    /* JADX INFO: renamed from: d0 */
    public AbstractC6643a<Integer, Integer> f35373d0;

    /* JADX INFO: renamed from: o7.i$a */
    public class a extends Paint {
        public a(int i10) {
            super(i10);
            setStyle(Paint.Style.FILL);
        }
    }

    /* JADX INFO: renamed from: o7.i$b */
    public class b extends Paint {
        public b(int i10) {
            super(i10);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* JADX INFO: renamed from: o7.i$c */
    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f35376a;

        static {
            int[] iArr = new int[C8003b.a.values().length];
            f35376a = iArr;
            try {
                iArr[C8003b.a.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35376a[C8003b.a.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35376a[C8003b.a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C9716i(C5451h0 c5451h0, C9712e c9712e) {
        C8464l c8464l;
        C8464l c8464l2;
        C8456d c8456d;
        C8464l c8464l3;
        C8456d c8456d2;
        C8464l c8464l4;
        C8456d c8456d3;
        C8465m c8465m;
        C8456d c8456d4;
        C8465m c8465m2;
        C8454b c8454b;
        C8465m c8465m3;
        C8454b c8454b2;
        C8465m c8465m4;
        C8453a c8453a;
        C8465m c8465m5;
        C8453a c8453a2;
        super(c5451h0, c9712e);
        this.f35348E = new StringBuilder(2);
        this.f35349F = new RectF();
        this.f35350G = new Matrix();
        this.f35351H = new a(1);
        this.f35352I = new b(1);
        this.f35353J = new HashMap();
        this.f35354K = new C12283g<>();
        this.f35355L = new ArrayList();
        this.f35359P = EnumC8915u.INDEX;
        this.f35357N = c5451h0;
        this.f35358O = c9712e.m38374c();
        C6657o c6657oMo34233a = c9712e.m38391t().mo34233a();
        this.f35356M = c6657oMo34233a;
        c6657oMo34233a.m28661a(this);
        m38353j(c6657oMo34233a);
        C8463k c8463kM38392u = c9712e.m38392u();
        if (c8463kM38392u != null && (c8465m5 = c8463kM38392u.f31158a) != null && (c8453a2 = c8465m5.f31164a) != null) {
            AbstractC6643a<Integer, Integer> abstractC6643aMo34233a = c8453a2.mo34233a();
            this.f35360Q = abstractC6643aMo34233a;
            abstractC6643aMo34233a.m28661a(this);
            m38353j(this.f35360Q);
        }
        if (c8463kM38392u != null && (c8465m4 = c8463kM38392u.f31158a) != null && (c8453a = c8465m4.f31165b) != null) {
            AbstractC6643a<Integer, Integer> abstractC6643aMo34233a2 = c8453a.mo34233a();
            this.f35362S = abstractC6643aMo34233a2;
            abstractC6643aMo34233a2.m28661a(this);
            m38353j(this.f35362S);
        }
        if (c8463kM38392u != null && (c8465m3 = c8463kM38392u.f31158a) != null && (c8454b2 = c8465m3.f31166c) != null) {
            C6646d c6646dMo34233a = c8454b2.mo34233a();
            this.f35364U = c6646dMo34233a;
            c6646dMo34233a.m28661a(this);
            m38353j(this.f35364U);
        }
        if (c8463kM38392u != null && (c8465m2 = c8463kM38392u.f31158a) != null && (c8454b = c8465m2.f31167d) != null) {
            C6646d c6646dMo34233a2 = c8454b.mo34233a();
            this.f35366W = c6646dMo34233a2;
            c6646dMo34233a2.m28661a(this);
            m38353j(this.f35366W);
        }
        if (c8463kM38392u != null && (c8465m = c8463kM38392u.f31158a) != null && (c8456d4 = c8465m.f31168e) != null) {
            AbstractC6643a<Integer, Integer> abstractC6643aMo34233a3 = c8456d4.mo34233a();
            this.f35368Y = abstractC6643aMo34233a3;
            abstractC6643aMo34233a3.m28661a(this);
            m38353j(this.f35368Y);
        }
        if (c8463kM38392u != null && (c8464l4 = c8463kM38392u.f31159b) != null && (c8456d3 = c8464l4.f31160a) != null) {
            AbstractC6643a<Integer, Integer> abstractC6643aMo34233a4 = c8456d3.mo34233a();
            this.f35371b0 = abstractC6643aMo34233a4;
            abstractC6643aMo34233a4.m28661a(this);
            m38353j(this.f35371b0);
        }
        if (c8463kM38392u != null && (c8464l3 = c8463kM38392u.f31159b) != null && (c8456d2 = c8464l3.f31161b) != null) {
            AbstractC6643a<Integer, Integer> abstractC6643aMo34233a5 = c8456d2.mo34233a();
            this.f35372c0 = abstractC6643aMo34233a5;
            abstractC6643aMo34233a5.m28661a(this);
            m38353j(this.f35372c0);
        }
        if (c8463kM38392u != null && (c8464l2 = c8463kM38392u.f31159b) != null && (c8456d = c8464l2.f31162c) != null) {
            AbstractC6643a<Integer, Integer> abstractC6643aMo34233a6 = c8456d.mo34233a();
            this.f35373d0 = abstractC6643aMo34233a6;
            abstractC6643aMo34233a6.m28661a(this);
            m38353j(this.f35373d0);
        }
        if (c8463kM38392u == null || (c8464l = c8463kM38392u.f31159b) == null) {
            return;
        }
        this.f35359P = c8464l.f31163d;
    }

    /* JADX INFO: renamed from: P */
    public final String m38400P(String str, int i10) {
        int iCodePointAt = str.codePointAt(i10);
        int iCharCount = Character.charCount(iCodePointAt) + i10;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (!m38415e0(iCodePointAt2)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j10 = iCodePointAt;
        if (this.f35354K.m45600c(j10)) {
            return this.f35354K.m45601e(j10);
        }
        this.f35348E.setLength(0);
        while (i10 < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i10);
            this.f35348E.appendCodePoint(iCodePointAt3);
            i10 += Character.charCount(iCodePointAt3);
        }
        String string = this.f35348E.toString();
        this.f35354K.m45604i(j10, string);
        return string;
    }

    /* JADX INFO: renamed from: Q */
    public final void m38401Q(C8003b c8003b, int i10, int i11) {
        AbstractC6643a<Integer, Integer> abstractC6643a = this.f35361R;
        if (abstractC6643a != null) {
            this.f35351H.setColor(abstractC6643a.mo28668h().intValue());
        } else if (this.f35360Q == null || !m38414d0(i11)) {
            this.f35351H.setColor(c8003b.f29936h);
        } else {
            this.f35351H.setColor(this.f35360Q.mo28668h().intValue());
        }
        AbstractC6643a<Integer, Integer> abstractC6643a2 = this.f35363T;
        if (abstractC6643a2 != null) {
            this.f35352I.setColor(abstractC6643a2.mo28668h().intValue());
        } else if (this.f35362S == null || !m38414d0(i11)) {
            this.f35352I.setColor(c8003b.f29937i);
        } else {
            this.f35352I.setColor(this.f35362S.mo28668h().intValue());
        }
        int iIntValue = 100;
        int iIntValue2 = this.f35272x.m28724h() == null ? 100 : this.f35272x.m28724h().mo28668h().intValue();
        if (this.f35368Y != null && m38414d0(i11)) {
            iIntValue = this.f35368Y.mo28668h().intValue();
        }
        int iRound = Math.round(((((iIntValue2 * 255.0f) / 100.0f) * (iIntValue / 100.0f)) * i10) / 255.0f);
        this.f35351H.setAlpha(iRound);
        this.f35352I.setAlpha(iRound);
        AbstractC6643a<Float, Float> abstractC6643a3 = this.f35365V;
        if (abstractC6643a3 != null) {
            this.f35352I.setStrokeWidth(abstractC6643a3.mo28668h().floatValue());
        } else if (this.f35364U == null || !m38414d0(i11)) {
            this.f35352I.setStrokeWidth(c8003b.f29938j * C11197m.m42216e());
        } else {
            this.f35352I.setStrokeWidth(this.f35364U.mo28668h().floatValue());
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m38402R(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    /* JADX INFO: renamed from: S */
    public final void m38403S(C8005d c8005d, float f10, C8003b c8003b, Canvas canvas, int i10, int i11) {
        m38401Q(c8003b, i11, i10);
        List<C6297d> listM38411a0 = m38411a0(c8005d);
        for (int i12 = 0; i12 < listM38411a0.size(); i12++) {
            Path path = listM38411a0.get(i12).getPath();
            path.computeBounds(this.f35349F, false);
            this.f35350G.reset();
            this.f35350G.preTranslate(0.0f, (-c8003b.f29935g) * C11197m.m42216e());
            this.f35350G.preScale(f10, f10);
            path.transform(this.f35350G);
            if (c8003b.f29939k) {
                m38406V(path, this.f35351H, canvas);
                m38406V(path, this.f35352I, canvas);
            } else {
                m38406V(path, this.f35352I, canvas);
                m38406V(path, this.f35351H, canvas);
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m38404T(String str, C8003b c8003b, Canvas canvas, int i10, int i11) {
        m38401Q(c8003b, i11, i10);
        if (c8003b.f29939k) {
            m38402R(str, this.f35351H, canvas);
            m38402R(str, this.f35352I, canvas);
        } else {
            m38402R(str, this.f35352I, canvas);
            m38402R(str, this.f35351H, canvas);
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m38405U(String str, C8003b c8003b, Canvas canvas, float f10, int i10, int i11) {
        int length = 0;
        while (length < str.length()) {
            String strM38400P = m38400P(str, length);
            C8003b c8003b2 = c8003b;
            Canvas canvas2 = canvas;
            m38404T(strM38400P, c8003b2, canvas2, i10 + length, i11);
            canvas2.translate(this.f35351H.measureText(strM38400P) + f10, 0.0f);
            length += strM38400P.length();
            c8003b = c8003b2;
            canvas = canvas2;
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m38406V(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* JADX INFO: renamed from: W */
    public final void m38407W(String str, C8003b c8003b, C8004c c8004c, Canvas canvas, float f10, float f11, float f12, int i10) {
        C8003b c8003b2;
        Canvas canvas2;
        float f13;
        int i11;
        int i12 = 0;
        while (i12 < str.length()) {
            C8005d c8005dM45633e = this.f35358O.m25037c().m45633e(C8005d.m33073c(str.charAt(i12), c8004c.m33068a(), c8004c.m33070c()));
            if (c8005dM45633e == null) {
                c8003b2 = c8003b;
                canvas2 = canvas;
                f13 = f11;
                i11 = i10;
            } else {
                c8003b2 = c8003b;
                canvas2 = canvas;
                f13 = f11;
                i11 = i10;
                m38403S(c8005dM45633e, f13, c8003b2, canvas2, i12, i11);
                canvas2.translate((((float) c8005dM45633e.m33075b()) * f13 * C11197m.m42216e()) + f12, 0.0f);
            }
            i12++;
            f11 = f13;
            c8003b = c8003b2;
            canvas = canvas2;
            i10 = i11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0088  */
    /* JADX WARN: Code duplicated, block: B:20:0x0092  */
    /* JADX WARN: Code duplicated, block: B:22:0x0095  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e3  */
    /* JADX INFO: renamed from: X */
    public final void m38408X(C8003b c8003b, C8004c c8004c, Canvas canvas, int i10) {
        float fFloatValue;
        float fM42216e;
        List<String> listM38412b0;
        int size;
        int i11;
        int i12;
        int length;
        PointF pointF;
        float f10;
        float f11;
        List<d> listM38417g0;
        int i13;
        d dVar;
        float fMeasureText;
        float f12;
        int i14;
        C9716i c9716i = this;
        C8003b c8003b2 = c8003b;
        C8004c c8004c2 = c8004c;
        Typeface typefaceM38413c0 = c9716i.m38413c0(c8004c2);
        if (typefaceM38413c0 == null) {
            return;
        }
        String str = c8003b2.f29929a;
        c9716i.f35357N.m24998a0();
        c9716i.f35351H.setTypeface(typefaceM38413c0);
        AbstractC6643a<Float, Float> abstractC6643a = c9716i.f35369Z;
        float fFloatValue2 = abstractC6643a != null ? abstractC6643a.mo28668h().floatValue() : c8003b2.f29931c;
        c9716i.f35351H.setTextSize(C11197m.m42216e() * fFloatValue2);
        c9716i.f35352I.setTypeface(c9716i.f35351H.getTypeface());
        c9716i.f35352I.setTextSize(c9716i.f35351H.getTextSize());
        float f13 = c8003b2.f29933e / 10.0f;
        AbstractC6643a<Float, Float> abstractC6643a2 = c9716i.f35367X;
        if (abstractC6643a2 == null) {
            AbstractC6643a<Float, Float> abstractC6643a3 = c9716i.f35366W;
            if (abstractC6643a3 != null) {
                fFloatValue = abstractC6643a3.mo28668h().floatValue();
            }
            fM42216e = ((f13 * C11197m.m42216e()) * fFloatValue2) / 100.0f;
            listM38412b0 = c9716i.m38412b0(str);
            size = listM38412b0.size();
            i11 = -1;
            i12 = 0;
            length = 0;
            while (i12 < size) {
                String str2 = listM38412b0.get(i12);
                pointF = c8003b2.f29941m;
                if (pointF == null) {
                    f10 = 0.0f;
                } else {
                    f10 = pointF.x;
                }
                f11 = fM42216e;
                listM38417g0 = c9716i.m38417g0(str2, f10, c8004c2, 0.0f, f11, false);
                i13 = 0;
                while (i13 < listM38417g0.size()) {
                    dVar = listM38417g0.get(i13);
                    i11++;
                    canvas.save();
                    if (c9716i.f35356M != null && c9716i.f35369Z == null && c9716i.f35367X == null) {
                        fMeasureText = dVar.f35378b;
                    } else {
                        fMeasureText = c9716i.f35351H.measureText(dVar.f35377a);
                    }
                    if (c9716i.m38416f0(canvas, c8003b2, i11, fMeasureText)) {
                        f12 = f11;
                        i14 = length;
                        c9716i.m38405U(dVar.f35377a, c8003b2, canvas, f12, i14, i10);
                    } else {
                        f12 = f11;
                        i14 = length;
                    }
                    length = i14 + dVar.f35377a.length();
                    canvas.restore();
                    i13++;
                    c9716i = this;
                    c8003b2 = c8003b;
                    f11 = f12;
                }
                fM42216e = f11;
                i12++;
                c9716i = this;
                c8003b2 = c8003b;
                c8004c2 = c8004c;
            }
        }
        fFloatValue = abstractC6643a2.mo28668h().floatValue();
        f13 += fFloatValue;
        fM42216e = ((f13 * C11197m.m42216e()) * fFloatValue2) / 100.0f;
        listM38412b0 = c9716i.m38412b0(str);
        size = listM38412b0.size();
        i11 = -1;
        i12 = 0;
        length = 0;
        while (i12 < size) {
            String str3 = listM38412b0.get(i12);
            pointF = c8003b2.f29941m;
            if (pointF == null) {
                f10 = 0.0f;
            } else {
                f10 = pointF.x;
            }
            f11 = fM42216e;
            listM38417g0 = c9716i.m38417g0(str3, f10, c8004c2, 0.0f, f11, false);
            i13 = 0;
            while (i13 < listM38417g0.size()) {
                dVar = listM38417g0.get(i13);
                i11++;
                canvas.save();
                if (c9716i.f35356M != null) {
                    fMeasureText = c9716i.f35351H.measureText(dVar.f35377a);
                } else {
                    fMeasureText = c9716i.f35351H.measureText(dVar.f35377a);
                }
                if (c9716i.m38416f0(canvas, c8003b2, i11, fMeasureText)) {
                    f12 = f11;
                    i14 = length;
                    c9716i.m38405U(dVar.f35377a, c8003b2, canvas, f12, i14, i10);
                } else {
                    f12 = f11;
                    i14 = length;
                }
                length = i14 + dVar.f35377a.length();
                canvas.restore();
                i13++;
                c9716i = this;
                c8003b2 = c8003b;
                f11 = f12;
            }
            fM42216e = f11;
            i12++;
            c9716i = this;
            c8003b2 = c8003b;
            c8004c2 = c8004c;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0053  */
    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0086  */
    /* JADX WARN: Code duplicated, block: B:26:0x0098  */
    /* JADX INFO: renamed from: Y */
    public final void m38409Y(C8003b c8003b, Matrix matrix, C8004c c8004c, Canvas canvas, int i10) {
        float fFloatValue;
        float f10;
        int i11;
        int i12;
        PointF pointF;
        float f11;
        List<d> listM38417g0;
        int i13;
        d dVar;
        float f12;
        float f13;
        C9716i c9716i = this;
        C8003b c8003b2 = c8003b;
        AbstractC6643a<Float, Float> abstractC6643a = c9716i.f35369Z;
        float fFloatValue2 = (abstractC6643a != null ? abstractC6643a.mo28668h().floatValue() : c8003b2.f29931c) / 100.0f;
        float fM42218g = C11197m.m42218g(matrix);
        List<String> listM38412b0 = c9716i.m38412b0(c8003b2.f29929a);
        int size = listM38412b0.size();
        float f14 = c8003b2.f29933e / 10.0f;
        AbstractC6643a<Float, Float> abstractC6643a2 = c9716i.f35367X;
        if (abstractC6643a2 == null) {
            AbstractC6643a<Float, Float> abstractC6643a3 = c9716i.f35366W;
            if (abstractC6643a3 != null) {
                fFloatValue = abstractC6643a3.mo28668h().floatValue();
            }
            f10 = f14;
            i11 = -1;
            i12 = 0;
            while (i12 < size) {
                String str = listM38412b0.get(i12);
                pointF = c8003b2.f29941m;
                if (pointF == null) {
                    f11 = 0.0f;
                } else {
                    f11 = pointF.x;
                }
                listM38417g0 = c9716i.m38417g0(str, f11, c8004c, fFloatValue2, f10, true);
                i13 = 0;
                while (i13 < listM38417g0.size()) {
                    dVar = listM38417g0.get(i13);
                    i11++;
                    canvas.save();
                    if (c9716i.m38416f0(canvas, c8003b2, i11, dVar.f35378b)) {
                        float f15 = fFloatValue2;
                        C8003b c8003b3 = c8003b2;
                        f12 = f10;
                        f13 = fM42218g;
                        c9716i.m38407W(dVar.f35377a, c8003b3, c8004c, canvas, f13, f15, f12, i10);
                        fFloatValue2 = f15;
                    } else {
                        f12 = f10;
                        f13 = fM42218g;
                    }
                    canvas.restore();
                    i13++;
                    c9716i = this;
                    fM42218g = f13;
                    f10 = f12;
                    c8003b2 = c8003b;
                }
                i12++;
                c9716i = this;
                f10 = f10;
                c8003b2 = c8003b;
            }
        }
        fFloatValue = abstractC6643a2.mo28668h().floatValue();
        f14 += fFloatValue;
        f10 = f14;
        i11 = -1;
        i12 = 0;
        while (i12 < size) {
            String str2 = listM38412b0.get(i12);
            pointF = c8003b2.f29941m;
            if (pointF == null) {
                f11 = 0.0f;
            } else {
                f11 = pointF.x;
            }
            listM38417g0 = c9716i.m38417g0(str2, f11, c8004c, fFloatValue2, f10, true);
            i13 = 0;
            while (i13 < listM38417g0.size()) {
                dVar = listM38417g0.get(i13);
                i11++;
                canvas.save();
                if (c9716i.m38416f0(canvas, c8003b2, i11, dVar.f35378b)) {
                    float f16 = fFloatValue2;
                    C8003b c8003b4 = c8003b2;
                    f12 = f10;
                    f13 = fM42218g;
                    c9716i.m38407W(dVar.f35377a, c8003b4, c8004c, canvas, f13, f16, f12, i10);
                    fFloatValue2 = f16;
                } else {
                    f12 = f10;
                    f13 = fM42218g;
                }
                canvas.restore();
                i13++;
                c9716i = this;
                fM42218g = f13;
                f10 = f12;
                c8003b2 = c8003b;
            }
            i12++;
            c9716i = this;
            f10 = f10;
            c8003b2 = c8003b;
        }
    }

    /* JADX INFO: renamed from: Z */
    public final d m38410Z(int i10) {
        for (int size = this.f35355L.size(); size < i10; size++) {
            this.f35355L.add(new d(null));
        }
        return this.f35355L.get(i10 - 1);
    }

    /* JADX INFO: renamed from: a0 */
    public final List<C6297d> m38411a0(C8005d c8005d) {
        if (this.f35353J.containsKey(c8005d)) {
            return this.f35353J.get(c8005d);
        }
        List<C8911q> listM33074a = c8005d.m33074a();
        int size = listM33074a.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new C6297d(this.f35357N, this, listM33074a.get(i10), this.f35358O));
        }
        this.f35353J.put(c8005d, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: b0 */
    public final List<String> m38412b0(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    @Override // p324o7.AbstractC9709b, p266l7.InterfaceC8007f
    /* JADX INFO: renamed from: c */
    public <T> void mo27577c(T t8, C11552c<T> c11552c) {
        super.mo27577c(t8, c11552c);
        if (t8 == InterfaceC5465o0.f21161a) {
            AbstractC6643a<Integer, Integer> abstractC6643a = this.f35361R;
            if (abstractC6643a != null) {
                m38345H(abstractC6643a);
            }
            if (c11552c == null) {
                this.f35361R = null;
                return;
            }
            C6659q c6659q = new C6659q(c11552c);
            this.f35361R = c6659q;
            c6659q.m28661a(this);
            m38353j(this.f35361R);
            return;
        }
        if (t8 == InterfaceC5465o0.f21162b) {
            AbstractC6643a<Integer, Integer> abstractC6643a2 = this.f35363T;
            if (abstractC6643a2 != null) {
                m38345H(abstractC6643a2);
            }
            if (c11552c == null) {
                this.f35363T = null;
                return;
            }
            C6659q c6659q2 = new C6659q(c11552c);
            this.f35363T = c6659q2;
            c6659q2.m28661a(this);
            m38353j(this.f35363T);
            return;
        }
        if (t8 == InterfaceC5465o0.f21179s) {
            AbstractC6643a<Float, Float> abstractC6643a3 = this.f35365V;
            if (abstractC6643a3 != null) {
                m38345H(abstractC6643a3);
            }
            if (c11552c == null) {
                this.f35365V = null;
                return;
            }
            C6659q c6659q3 = new C6659q(c11552c);
            this.f35365V = c6659q3;
            c6659q3.m28661a(this);
            m38353j(this.f35365V);
            return;
        }
        if (t8 == InterfaceC5465o0.f21180t) {
            AbstractC6643a<Float, Float> abstractC6643a4 = this.f35367X;
            if (abstractC6643a4 != null) {
                m38345H(abstractC6643a4);
            }
            if (c11552c == null) {
                this.f35367X = null;
                return;
            }
            C6659q c6659q4 = new C6659q(c11552c);
            this.f35367X = c6659q4;
            c6659q4.m28661a(this);
            m38353j(this.f35367X);
            return;
        }
        if (t8 == InterfaceC5465o0.f21150F) {
            AbstractC6643a<Float, Float> abstractC6643a5 = this.f35369Z;
            if (abstractC6643a5 != null) {
                m38345H(abstractC6643a5);
            }
            if (c11552c == null) {
                this.f35369Z = null;
                return;
            }
            C6659q c6659q5 = new C6659q(c11552c);
            this.f35369Z = c6659q5;
            c6659q5.m28661a(this);
            m38353j(this.f35369Z);
            return;
        }
        if (t8 != InterfaceC5465o0.f21157M) {
            if (t8 == InterfaceC5465o0.f21159O) {
                this.f35356M.m28715s(c11552c);
                return;
            }
            return;
        }
        AbstractC6643a<Typeface, Typeface> abstractC6643a6 = this.f35370a0;
        if (abstractC6643a6 != null) {
            m38345H(abstractC6643a6);
        }
        if (c11552c == null) {
            this.f35370a0 = null;
            return;
        }
        C6659q c6659q6 = new C6659q(c11552c);
        this.f35370a0 = c6659q6;
        c6659q6.m28661a(this);
        m38353j(this.f35370a0);
    }

    /* JADX INFO: renamed from: c0 */
    public final Typeface m38413c0(C8004c c8004c) {
        Typeface typefaceMo28668h;
        AbstractC6643a<Typeface, Typeface> abstractC6643a = this.f35370a0;
        if (abstractC6643a != null && (typefaceMo28668h = abstractC6643a.mo28668h()) != null) {
            return typefaceMo28668h;
        }
        Typeface typefaceM24999b0 = this.f35357N.m24999b0(c8004c);
        return typefaceM24999b0 != null ? typefaceM24999b0 : c8004c.m33071d();
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m38414d0(int i10) {
        int length = this.f35356M.mo28668h().f29929a.length();
        AbstractC6643a<Integer, Integer> abstractC6643a = this.f35371b0;
        if (abstractC6643a == null || this.f35372c0 == null) {
            return true;
        }
        int iMin = Math.min(abstractC6643a.mo28668h().intValue(), this.f35372c0.mo28668h().intValue());
        int iMax = Math.max(this.f35371b0.mo28668h().intValue(), this.f35372c0.mo28668h().intValue());
        AbstractC6643a<Integer, Integer> abstractC6643a2 = this.f35373d0;
        if (abstractC6643a2 != null) {
            int iIntValue = abstractC6643a2.mo28668h().intValue();
            iMin += iIntValue;
            iMax += iIntValue;
        }
        if (this.f35359P == EnumC8915u.INDEX) {
            return i10 >= iMin && i10 < iMax;
        }
        float f10 = (i10 / length) * 100.0f;
        return f10 >= ((float) iMin) && f10 < ((float) iMax);
    }

    @Override // p324o7.AbstractC9709b, p162h7.InterfaceC6298e
    /* JADX INFO: renamed from: e */
    public void mo27578e(RectF rectF, Matrix matrix, boolean z10) {
        super.mo27578e(rectF, matrix, z10);
        rectF.set(0.0f, 0.0f, this.f35358O.m25036b().width(), this.f35358O.m25036b().height());
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m38415e0(int i10) {
        return Character.getType(i10) == 16 || Character.getType(i10) == 27 || Character.getType(i10) == 6 || Character.getType(i10) == 28 || Character.getType(i10) == 8 || Character.getType(i10) == 19;
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m38416f0(Canvas canvas, C8003b c8003b, int i10, float f10) {
        PointF pointF = c8003b.f29940l;
        PointF pointF2 = c8003b.f29941m;
        float fM42216e = C11197m.m42216e();
        float f11 = (i10 * c8003b.f29934f * fM42216e) + (pointF == null ? 0.0f : (c8003b.f29934f * fM42216e) + pointF.y);
        if (this.f35357N.m24962H() && pointF2 != null && pointF != null && f11 >= pointF.y + pointF2.y + c8003b.f29931c) {
            return false;
        }
        float f12 = pointF == null ? 0.0f : pointF.x;
        float f13 = pointF2 != null ? pointF2.x : 0.0f;
        int i11 = c.f35376a[c8003b.f29932d.ordinal()];
        if (i11 == 1) {
            canvas.translate(f12, f11);
        } else if (i11 == 2) {
            canvas.translate((f12 + f13) - f10, f11);
        } else if (i11 == 3) {
            canvas.translate((f12 + (f13 / 2.0f)) - (f10 / 2.0f), f11);
        }
        return true;
    }

    /* JADX INFO: renamed from: g0 */
    public final List<d> m38417g0(String str, float f10, C8004c c8004c, float f11, float f12, boolean z10) {
        float fMeasureText;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i13 = 0; i13 < str.length(); i13++) {
            char cCharAt = str.charAt(i13);
            if (z10) {
                C8005d c8005dM45633e = this.f35358O.m25037c().m45633e(C8005d.m33073c(cCharAt, c8004c.m33068a(), c8004c.m33070c()));
                if (c8005dM45633e != null) {
                    fMeasureText = ((float) c8005dM45633e.m33075b()) * f11 * C11197m.m42216e();
                }
            } else {
                fMeasureText = this.f35351H.measureText(str.substring(i13, i13 + 1));
            }
            float f16 = fMeasureText + f12;
            if (cCharAt == ' ') {
                z11 = true;
                f15 = f16;
            } else if (z11) {
                z11 = false;
                i12 = i13;
                f14 = f16;
            } else {
                f14 += f16;
            }
            f13 += f16;
            if (f10 > 0.0f && f13 >= f10 && cCharAt != ' ') {
                i10++;
                d dVarM38410Z = m38410Z(i10);
                if (i12 == i11) {
                    String strSubstring = str.substring(i11, i13);
                    String strTrim = strSubstring.trim();
                    dVarM38410Z.m38420c(strTrim, (f13 - f16) - ((strTrim.length() - strSubstring.length()) * f15));
                    i11 = i13;
                    i12 = i11;
                    f13 = f16;
                    f14 = f13;
                } else {
                    String strSubstring2 = str.substring(i11, i12 - 1);
                    String strTrim2 = strSubstring2.trim();
                    dVarM38410Z.m38420c(strTrim2, ((f13 - f14) - ((strSubstring2.length() - strTrim2.length()) * f15)) - f15);
                    f13 = f14;
                    i11 = i12;
                }
            }
        }
        if (f13 > 0.0f) {
            i10++;
            m38410Z(i10).m38420c(str.substring(i11), f13);
        }
        return this.f35355L.subList(0, i10);
    }

    @Override // p324o7.AbstractC9709b
    /* JADX INFO: renamed from: u */
    public void mo38364u(Canvas canvas, Matrix matrix, int i10, C11186b c11186b) {
        Canvas canvas2;
        C8003b c8003bMo28668h = this.f35356M.mo28668h();
        C8004c c8004c = this.f35358O.m25041g().get(c8003bMo28668h.f29930b);
        if (c8004c == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        m38401Q(c8003bMo28668h, i10, 0);
        if (this.f35357N.m24995X0()) {
            canvas2 = canvas;
            m38409Y(c8003bMo28668h, matrix, c8004c, canvas2, i10);
        } else {
            canvas2 = canvas;
            m38408X(c8003bMo28668h, c8004c, canvas2, i10);
        }
        canvas2.restore();
    }

    /* JADX INFO: renamed from: o7.i$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public String f35377a;

        /* JADX INFO: renamed from: b */
        public float f35378b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public d() {
            this.f35377a = "";
            this.f35378b = 0.0f;
        }

        /* JADX INFO: renamed from: c */
        public void m38420c(String str, float f10) {
            this.f35377a = str;
            this.f35378b = f10;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:4) call: o7.i.d.<init>():void type: THIS */
        public /* synthetic */ d(a aVar) {
            this();
        }
    }
}
