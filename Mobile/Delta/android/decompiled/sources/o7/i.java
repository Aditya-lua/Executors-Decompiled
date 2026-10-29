package o7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import f7.h0;
import f7.o0;
import i7.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m7.k;
import m7.l;
import m7.m;
import n7.q;
import n7.u;

/* JADX INFO: loaded from: classes3.dex */
public class i extends o7.b {
    public final StringBuilder E;
    public final RectF F;
    public final Matrix G;
    public final Paint H;
    public final Paint I;
    public final Map<l7.d, List<h7.d>> J;
    public final w1.g<String> K;
    public final List<d> L;
    public final o M;
    public final h0 N;
    public final f7.i O;
    public u P;
    public i7.a<Integer, Integer> Q;
    public i7.a<Integer, Integer> R;
    public i7.a<Integer, Integer> S;
    public i7.a<Integer, Integer> T;
    public i7.a<Float, Float> U;
    public i7.a<Float, Float> V;
    public i7.a<Float, Float> W;
    public i7.a<Float, Float> X;
    public i7.a<Integer, Integer> Y;
    public i7.a<Float, Float> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public i7.a<Typeface, Typeface> f27288a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public i7.a<Integer, Integer> f27289b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public i7.a<Integer, Integer> f27290c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public i7.a<Integer, Integer> f27291d0;

    public class a extends Paint {
        public a(int i10) {
            super(i10);
            setStyle(Paint.Style.FILL);
        }
    }

    public class b extends Paint {
        public b(int i10) {
            super(i10);
            setStyle(Paint.Style.STROKE);
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27294a;

        static {
            int[] iArr = new int[l7.b.a.values().length];
            f27294a = iArr;
            try {
                iArr[l7.b.a.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27294a[l7.b.a.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27294a[l7.b.a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public i(h0 h0Var, e eVar) {
        l lVar;
        l lVar2;
        m7.d dVar;
        l lVar3;
        m7.d dVar2;
        l lVar4;
        m7.d dVar3;
        m mVar;
        m7.d dVar4;
        m mVar2;
        m7.b bVar;
        m mVar3;
        m7.b bVar2;
        m mVar4;
        m7.a aVar;
        m mVar5;
        m7.a aVar2;
        super(h0Var, eVar);
        this.E = new StringBuilder(2);
        this.F = new RectF();
        this.G = new Matrix();
        this.H = new a(1);
        this.I = new b(1);
        this.J = new HashMap();
        this.K = new w1.g<>();
        this.L = new ArrayList();
        this.P = u.INDEX;
        this.N = h0Var;
        this.O = eVar.c();
        o oVarA = eVar.t().a();
        this.M = oVarA;
        oVarA.a(this);
        j(oVarA);
        k kVarU = eVar.u();
        if (kVarU != null && (mVar5 = kVarU.f24022a) != null && (aVar2 = mVar5.f24026a) != null) {
            i7.a<Integer, Integer> aVarA = aVar2.a();
            this.Q = aVarA;
            aVarA.a(this);
            j(this.Q);
        }
        if (kVarU != null && (mVar4 = kVarU.f24022a) != null && (aVar = mVar4.b) != null) {
            i7.a<Integer, Integer> aVarA2 = aVar.a();
            this.S = aVarA2;
            aVarA2.a(this);
            j(this.S);
        }
        if (kVarU != null && (mVar3 = kVarU.f24022a) != null && (bVar2 = mVar3.f24027c) != null) {
            i7.d dVarA = bVar2.a();
            this.U = dVarA;
            dVarA.a(this);
            j(this.U);
        }
        if (kVarU != null && (mVar2 = kVarU.f24022a) != null && (bVar = mVar2.f24028d) != null) {
            i7.d dVarA2 = bVar.a();
            this.W = dVarA2;
            dVarA2.a(this);
            j(this.W);
        }
        if (kVarU != null && (mVar = kVarU.f24022a) != null && (dVar4 = mVar.f24029e) != null) {
            i7.a<Integer, Integer> aVarA3 = dVar4.a();
            this.Y = aVarA3;
            aVarA3.a(this);
            j(this.Y);
        }
        if (kVarU != null && (lVar4 = kVarU.b) != null && (dVar3 = lVar4.f24023a) != null) {
            i7.a<Integer, Integer> aVarA4 = dVar3.a();
            this.f27289b0 = aVarA4;
            aVarA4.a(this);
            j(this.f27289b0);
        }
        if (kVarU != null && (lVar3 = kVarU.b) != null && (dVar2 = lVar3.b) != null) {
            i7.a<Integer, Integer> aVarA5 = dVar2.a();
            this.f27290c0 = aVarA5;
            aVarA5.a(this);
            j(this.f27290c0);
        }
        if (kVarU != null && (lVar2 = kVarU.b) != null && (dVar = lVar2.f24024c) != null) {
            i7.a<Integer, Integer> aVarA6 = dVar.a();
            this.f27291d0 = aVarA6;
            aVarA6.a(this);
            j(this.f27291d0);
        }
        if (kVarU == null || (lVar = kVarU.b) == null) {
            return;
        }
        this.P = lVar.f24025d;
    }

    public final String P(String str, int i10) {
        int iCodePointAt = str.codePointAt(i10);
        int iCharCount = Character.charCount(iCodePointAt) + i10;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (!e0(iCodePointAt2)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j10 = iCodePointAt;
        if (this.K.c(j10)) {
            return this.K.e(j10);
        }
        this.E.setLength(0);
        while (i10 < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i10);
            this.E.appendCodePoint(iCodePointAt3);
            i10 += Character.charCount(iCodePointAt3);
        }
        String string = this.E.toString();
        this.K.i(j10, string);
        return string;
    }

    public final void Q(l7.b bVar, int i10, int i11) {
        i7.a<Integer, Integer> aVar = this.R;
        if (aVar != null) {
            this.H.setColor(aVar.h().intValue());
        } else if (this.Q == null || !d0(i11)) {
            this.H.setColor(bVar.f22959h);
        } else {
            this.H.setColor(this.Q.h().intValue());
        }
        i7.a<Integer, Integer> aVar2 = this.T;
        if (aVar2 != null) {
            this.I.setColor(aVar2.h().intValue());
        } else if (this.S == null || !d0(i11)) {
            this.I.setColor(bVar.f22960i);
        } else {
            this.I.setColor(this.S.h().intValue());
        }
        int iIntValue = 100;
        int iIntValue2 = this.f27246x.h() == null ? 100 : this.f27246x.h().h().intValue();
        if (this.Y != null && d0(i11)) {
            iIntValue = this.Y.h().intValue();
        }
        int iRound = Math.round(((((iIntValue2 * 255.0f) / 100.0f) * (iIntValue / 100.0f)) * i10) / 255.0f);
        this.H.setAlpha(iRound);
        this.I.setAlpha(iRound);
        i7.a<Float, Float> aVar3 = this.V;
        if (aVar3 != null) {
            this.I.setStrokeWidth(aVar3.h().floatValue());
        } else if (this.U == null || !d0(i11)) {
            this.I.setStrokeWidth(bVar.f22961j * s7.m.e());
        } else {
            this.I.setStrokeWidth(this.U.h().floatValue());
        }
    }

    public final void R(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    public final void S(l7.d dVar, float f10, l7.b bVar, Canvas canvas, int i10, int i11) {
        Q(bVar, i11, i10);
        List<h7.d> listA0 = a0(dVar);
        for (int i12 = 0; i12 < listA0.size(); i12++) {
            Path path = listA0.get(i12).getPath();
            path.computeBounds(this.F, false);
            this.G.reset();
            this.G.preTranslate(0.0f, (-bVar.f22958g) * s7.m.e());
            this.G.preScale(f10, f10);
            path.transform(this.G);
            if (bVar.f22962k) {
                V(path, this.H, canvas);
                V(path, this.I, canvas);
            } else {
                V(path, this.I, canvas);
                V(path, this.H, canvas);
            }
        }
    }

    public final void T(String str, l7.b bVar, Canvas canvas, int i10, int i11) {
        Q(bVar, i11, i10);
        if (bVar.f22962k) {
            R(str, this.H, canvas);
            R(str, this.I, canvas);
        } else {
            R(str, this.I, canvas);
            R(str, this.H, canvas);
        }
    }

    public final void U(String str, l7.b bVar, Canvas canvas, float f10, int i10, int i11) {
        int length = 0;
        while (length < str.length()) {
            String strP = P(str, length);
            l7.b bVar2 = bVar;
            Canvas canvas2 = canvas;
            T(strP, bVar2, canvas2, i10 + length, i11);
            canvas2.translate(this.H.measureText(strP) + f10, 0.0f);
            length += strP.length();
            bVar = bVar2;
            canvas = canvas2;
        }
    }

    public final void V(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    public final void W(String str, l7.b bVar, l7.c cVar, Canvas canvas, float f10, float f11, float f12, int i10) {
        l7.b bVar2;
        Canvas canvas2;
        float f13;
        int i11;
        int i12 = 0;
        while (i12 < str.length()) {
            l7.d dVarE = this.O.c().e(l7.d.c(str.charAt(i12), cVar.a(), cVar.c()));
            if (dVarE == null) {
                bVar2 = bVar;
                canvas2 = canvas;
                f13 = f11;
                i11 = i10;
            } else {
                bVar2 = bVar;
                canvas2 = canvas;
                f13 = f11;
                i11 = i10;
                S(dVarE, f13, bVar2, canvas2, i12, i11);
                canvas2.translate((((float) dVarE.b()) * f13 * s7.m.e()) + f12, 0.0f);
            }
            i12++;
            f11 = f13;
            bVar = bVar2;
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
    public final void X(l7.b bVar, l7.c cVar, Canvas canvas, int i10) {
        float fFloatValue;
        float fE;
        List<String> listB0;
        int size;
        int i11;
        int i12;
        int length;
        PointF pointF;
        float f10;
        float f11;
        List<d> listG0;
        int i13;
        d dVar;
        float fMeasureText;
        float f12;
        int i14;
        i iVar = this;
        l7.b bVar2 = bVar;
        l7.c cVar2 = cVar;
        Typeface typefaceC0 = iVar.c0(cVar2);
        if (typefaceC0 == null) {
            return;
        }
        String str = bVar2.f22953a;
        iVar.N.a0();
        iVar.H.setTypeface(typefaceC0);
        i7.a<Float, Float> aVar = iVar.Z;
        float fFloatValue2 = aVar != null ? aVar.h().floatValue() : bVar2.f22954c;
        iVar.H.setTextSize(s7.m.e() * fFloatValue2);
        iVar.I.setTypeface(iVar.H.getTypeface());
        iVar.I.setTextSize(iVar.H.getTextSize());
        float f13 = bVar2.f22956e / 10.0f;
        i7.a<Float, Float> aVar2 = iVar.X;
        if (aVar2 == null) {
            i7.a<Float, Float> aVar3 = iVar.W;
            if (aVar3 != null) {
                fFloatValue = aVar3.h().floatValue();
            }
            fE = ((f13 * s7.m.e()) * fFloatValue2) / 100.0f;
            listB0 = iVar.b0(str);
            size = listB0.size();
            i11 = -1;
            i12 = 0;
            length = 0;
            while (i12 < size) {
                String str2 = listB0.get(i12);
                pointF = bVar2.f22964m;
                if (pointF == null) {
                    f10 = 0.0f;
                } else {
                    f10 = pointF.x;
                }
                f11 = fE;
                listG0 = iVar.g0(str2, f10, cVar2, 0.0f, f11, false);
                i13 = 0;
                while (i13 < listG0.size()) {
                    dVar = listG0.get(i13);
                    i11++;
                    canvas.save();
                    if (iVar.M != null && iVar.Z == null && iVar.X == null) {
                        fMeasureText = dVar.b;
                    } else {
                        fMeasureText = iVar.H.measureText(dVar.f27295a);
                    }
                    if (iVar.f0(canvas, bVar2, i11, fMeasureText)) {
                        f12 = f11;
                        i14 = length;
                        iVar.U(dVar.f27295a, bVar2, canvas, f12, i14, i10);
                    } else {
                        f12 = f11;
                        i14 = length;
                    }
                    length = i14 + dVar.f27295a.length();
                    canvas.restore();
                    i13++;
                    iVar = this;
                    bVar2 = bVar;
                    f11 = f12;
                }
                fE = f11;
                i12++;
                iVar = this;
                bVar2 = bVar;
                cVar2 = cVar;
            }
        }
        fFloatValue = aVar2.h().floatValue();
        f13 += fFloatValue;
        fE = ((f13 * s7.m.e()) * fFloatValue2) / 100.0f;
        listB0 = iVar.b0(str);
        size = listB0.size();
        i11 = -1;
        i12 = 0;
        length = 0;
        while (i12 < size) {
            String str3 = listB0.get(i12);
            pointF = bVar2.f22964m;
            if (pointF == null) {
                f10 = 0.0f;
            } else {
                f10 = pointF.x;
            }
            f11 = fE;
            listG0 = iVar.g0(str3, f10, cVar2, 0.0f, f11, false);
            i13 = 0;
            while (i13 < listG0.size()) {
                dVar = listG0.get(i13);
                i11++;
                canvas.save();
                if (iVar.M != null) {
                    fMeasureText = iVar.H.measureText(dVar.f27295a);
                } else {
                    fMeasureText = iVar.H.measureText(dVar.f27295a);
                }
                if (iVar.f0(canvas, bVar2, i11, fMeasureText)) {
                    f12 = f11;
                    i14 = length;
                    iVar.U(dVar.f27295a, bVar2, canvas, f12, i14, i10);
                } else {
                    f12 = f11;
                    i14 = length;
                }
                length = i14 + dVar.f27295a.length();
                canvas.restore();
                i13++;
                iVar = this;
                bVar2 = bVar;
                f11 = f12;
            }
            fE = f11;
            i12++;
            iVar = this;
            bVar2 = bVar;
            cVar2 = cVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0053  */
    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0086  */
    /* JADX WARN: Code duplicated, block: B:26:0x0098  */
    public final void Y(l7.b bVar, Matrix matrix, l7.c cVar, Canvas canvas, int i10) {
        float fFloatValue;
        float f10;
        int i11;
        int i12;
        PointF pointF;
        float f11;
        List<d> listG0;
        int i13;
        d dVar;
        float f12;
        float f13;
        i iVar = this;
        l7.b bVar2 = bVar;
        i7.a<Float, Float> aVar = iVar.Z;
        float fFloatValue2 = (aVar != null ? aVar.h().floatValue() : bVar2.f22954c) / 100.0f;
        float fG = s7.m.g(matrix);
        List<String> listB0 = iVar.b0(bVar2.f22953a);
        int size = listB0.size();
        float f14 = bVar2.f22956e / 10.0f;
        i7.a<Float, Float> aVar2 = iVar.X;
        if (aVar2 == null) {
            i7.a<Float, Float> aVar3 = iVar.W;
            if (aVar3 != null) {
                fFloatValue = aVar3.h().floatValue();
            }
            f10 = f14;
            i11 = -1;
            i12 = 0;
            while (i12 < size) {
                String str = listB0.get(i12);
                pointF = bVar2.f22964m;
                if (pointF == null) {
                    f11 = 0.0f;
                } else {
                    f11 = pointF.x;
                }
                listG0 = iVar.g0(str, f11, cVar, fFloatValue2, f10, true);
                i13 = 0;
                while (i13 < listG0.size()) {
                    dVar = listG0.get(i13);
                    i11++;
                    canvas.save();
                    if (iVar.f0(canvas, bVar2, i11, dVar.b)) {
                        float f15 = fFloatValue2;
                        l7.b bVar3 = bVar2;
                        f12 = f10;
                        f13 = fG;
                        iVar.W(dVar.f27295a, bVar3, cVar, canvas, f13, f15, f12, i10);
                        fFloatValue2 = f15;
                    } else {
                        f12 = f10;
                        f13 = fG;
                    }
                    canvas.restore();
                    i13++;
                    iVar = this;
                    fG = f13;
                    f10 = f12;
                    bVar2 = bVar;
                }
                i12++;
                iVar = this;
                f10 = f10;
                bVar2 = bVar;
            }
        }
        fFloatValue = aVar2.h().floatValue();
        f14 += fFloatValue;
        f10 = f14;
        i11 = -1;
        i12 = 0;
        while (i12 < size) {
            String str2 = listB0.get(i12);
            pointF = bVar2.f22964m;
            if (pointF == null) {
                f11 = 0.0f;
            } else {
                f11 = pointF.x;
            }
            listG0 = iVar.g0(str2, f11, cVar, fFloatValue2, f10, true);
            i13 = 0;
            while (i13 < listG0.size()) {
                dVar = listG0.get(i13);
                i11++;
                canvas.save();
                if (iVar.f0(canvas, bVar2, i11, dVar.b)) {
                    float f16 = fFloatValue2;
                    l7.b bVar4 = bVar2;
                    f12 = f10;
                    f13 = fG;
                    iVar.W(dVar.f27295a, bVar4, cVar, canvas, f13, f16, f12, i10);
                    fFloatValue2 = f16;
                } else {
                    f12 = f10;
                    f13 = fG;
                }
                canvas.restore();
                i13++;
                iVar = this;
                fG = f13;
                f10 = f12;
                bVar2 = bVar;
            }
            i12++;
            iVar = this;
            f10 = f10;
            bVar2 = bVar;
        }
    }

    public final d Z(int i10) {
        for (int size = this.L.size(); size < i10; size++) {
            this.L.add(new d(null));
        }
        return this.L.get(i10 - 1);
    }

    public final List<h7.d> a0(l7.d dVar) {
        if (this.J.containsKey(dVar)) {
            return this.J.get(dVar);
        }
        List<q> listA = dVar.a();
        int size = listA.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new h7.d(this.N, this, listA.get(i10), this.O));
        }
        this.J.put(dVar, arrayList);
        return arrayList;
    }

    public final List<String> b0(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    @Override // o7.b, l7.f
    public <T> void c(T t8, t7.c<T> cVar) {
        super.c(t8, cVar);
        if (t8 == o0.f16420a) {
            i7.a<Integer, Integer> aVar = this.R;
            if (aVar != null) {
                H(aVar);
            }
            if (cVar == null) {
                this.R = null;
                return;
            }
            i7.q qVar = new i7.q(cVar);
            this.R = qVar;
            qVar.a(this);
            j(this.R);
            return;
        }
        if (t8 == o0.b) {
            i7.a<Integer, Integer> aVar2 = this.T;
            if (aVar2 != null) {
                H(aVar2);
            }
            if (cVar == null) {
                this.T = null;
                return;
            }
            i7.q qVar2 = new i7.q(cVar);
            this.T = qVar2;
            qVar2.a(this);
            j(this.T);
            return;
        }
        if (t8 == o0.f16437s) {
            i7.a<Float, Float> aVar3 = this.V;
            if (aVar3 != null) {
                H(aVar3);
            }
            if (cVar == null) {
                this.V = null;
                return;
            }
            i7.q qVar3 = new i7.q(cVar);
            this.V = qVar3;
            qVar3.a(this);
            j(this.V);
            return;
        }
        if (t8 == o0.f16438t) {
            i7.a<Float, Float> aVar4 = this.X;
            if (aVar4 != null) {
                H(aVar4);
            }
            if (cVar == null) {
                this.X = null;
                return;
            }
            i7.q qVar4 = new i7.q(cVar);
            this.X = qVar4;
            qVar4.a(this);
            j(this.X);
            return;
        }
        if (t8 == o0.F) {
            i7.a<Float, Float> aVar5 = this.Z;
            if (aVar5 != null) {
                H(aVar5);
            }
            if (cVar == null) {
                this.Z = null;
                return;
            }
            i7.q qVar5 = new i7.q(cVar);
            this.Z = qVar5;
            qVar5.a(this);
            j(this.Z);
            return;
        }
        if (t8 != o0.M) {
            if (t8 == o0.O) {
                this.M.s(cVar);
                return;
            }
            return;
        }
        i7.a<Typeface, Typeface> aVar6 = this.f27288a0;
        if (aVar6 != null) {
            H(aVar6);
        }
        if (cVar == null) {
            this.f27288a0 = null;
            return;
        }
        i7.q qVar6 = new i7.q(cVar);
        this.f27288a0 = qVar6;
        qVar6.a(this);
        j(this.f27288a0);
    }

    public final Typeface c0(l7.c cVar) {
        Typeface typefaceH;
        i7.a<Typeface, Typeface> aVar = this.f27288a0;
        if (aVar != null && (typefaceH = aVar.h()) != null) {
            return typefaceH;
        }
        Typeface typefaceB0 = this.N.b0(cVar);
        return typefaceB0 != null ? typefaceB0 : cVar.d();
    }

    public final boolean d0(int i10) {
        int length = this.M.h().f22953a.length();
        i7.a<Integer, Integer> aVar = this.f27289b0;
        if (aVar == null || this.f27290c0 == null) {
            return true;
        }
        int iMin = Math.min(aVar.h().intValue(), this.f27290c0.h().intValue());
        int iMax = Math.max(this.f27289b0.h().intValue(), this.f27290c0.h().intValue());
        i7.a<Integer, Integer> aVar2 = this.f27291d0;
        if (aVar2 != null) {
            int iIntValue = aVar2.h().intValue();
            iMin += iIntValue;
            iMax += iIntValue;
        }
        if (this.P == u.INDEX) {
            return i10 >= iMin && i10 < iMax;
        }
        float f10 = (i10 / length) * 100.0f;
        return f10 >= ((float) iMin) && f10 < ((float) iMax);
    }

    @Override // o7.b, h7.e
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        super.e(rectF, matrix, z10);
        rectF.set(0.0f, 0.0f, this.O.b().width(), this.O.b().height());
    }

    public final boolean e0(int i10) {
        return Character.getType(i10) == 16 || Character.getType(i10) == 27 || Character.getType(i10) == 6 || Character.getType(i10) == 28 || Character.getType(i10) == 8 || Character.getType(i10) == 19;
    }

    public final boolean f0(Canvas canvas, l7.b bVar, int i10, float f10) {
        PointF pointF = bVar.f22963l;
        PointF pointF2 = bVar.f22964m;
        float fE = s7.m.e();
        float f11 = (i10 * bVar.f22957f * fE) + (pointF == null ? 0.0f : (bVar.f22957f * fE) + pointF.y);
        if (this.N.H() && pointF2 != null && pointF != null && f11 >= pointF.y + pointF2.y + bVar.f22954c) {
            return false;
        }
        float f12 = pointF == null ? 0.0f : pointF.x;
        float f13 = pointF2 != null ? pointF2.x : 0.0f;
        int i11 = c.f27294a[bVar.f22955d.ordinal()];
        if (i11 == 1) {
            canvas.translate(f12, f11);
        } else if (i11 == 2) {
            canvas.translate((f12 + f13) - f10, f11);
        } else if (i11 == 3) {
            canvas.translate((f12 + (f13 / 2.0f)) - (f10 / 2.0f), f11);
        }
        return true;
    }

    public final List<d> g0(String str, float f10, l7.c cVar, float f11, float f12, boolean z10) {
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
                l7.d dVarE = this.O.c().e(l7.d.c(cCharAt, cVar.a(), cVar.c()));
                if (dVarE != null) {
                    fMeasureText = ((float) dVarE.b()) * f11 * s7.m.e();
                }
            } else {
                fMeasureText = this.H.measureText(str.substring(i13, i13 + 1));
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
                d dVarZ = Z(i10);
                if (i12 == i11) {
                    String strSubstring = str.substring(i11, i13);
                    String strTrim = strSubstring.trim();
                    dVarZ.c(strTrim, (f13 - f16) - ((strTrim.length() - strSubstring.length()) * f15));
                    i11 = i13;
                    i12 = i11;
                    f13 = f16;
                    f14 = f13;
                } else {
                    String strSubstring2 = str.substring(i11, i12 - 1);
                    String strTrim2 = strSubstring2.trim();
                    dVarZ.c(strTrim2, ((f13 - f14) - ((strSubstring2.length() - strTrim2.length()) * f15)) - f15);
                    f13 = f14;
                    i11 = i12;
                }
            }
        }
        if (f13 > 0.0f) {
            i10++;
            Z(i10).c(str.substring(i11), f13);
        }
        return this.L.subList(0, i10);
    }

    @Override // o7.b
    public void u(Canvas canvas, Matrix matrix, int i10, s7.b bVar) {
        Canvas canvas2;
        l7.b bVarH = this.M.h();
        l7.c cVar = this.O.g().get(bVarH.b);
        if (cVar == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        Q(bVarH, i10, 0);
        if (this.N.X0()) {
            canvas2 = canvas;
            Y(bVarH, matrix, cVar, canvas2, i10);
        } else {
            canvas2 = canvas;
            X(bVarH, cVar, canvas2, i10);
        }
        canvas2.restore();
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f27295a;
        public float b;

        public d() {
            this.f27295a = "";
            this.b = 0.0f;
        }

        public void c(String str, float f10) {
            this.f27295a = str;
            this.b = f10;
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }
}
