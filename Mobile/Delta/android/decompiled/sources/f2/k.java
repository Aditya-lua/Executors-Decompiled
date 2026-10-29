package f2;

import android.view.View;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public class k implements Comparable<k> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static String[] f16157s = {"position", "x", "y", "width", "height", "pathRotate"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a2.b f16158a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f16159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f16160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f16161e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f16162f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f16163g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f16164h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f16167k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f16168l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f16169m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public g f16170n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinkedHashMap<String, androidx.constraintlayout.widget.a> f16171o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f16172p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public double[] f16173q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public double[] f16174r;
    public int b = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f16165i = Float.NaN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f16166j = Float.NaN;

    public k() {
        int i10 = d.f16091a;
        this.f16167k = i10;
        this.f16168l = i10;
        this.f16169m = Float.NaN;
        this.f16170n = null;
        this.f16171o = new LinkedHashMap<>();
        this.f16172p = 0;
        this.f16173q = new double[18];
        this.f16174r = new double[18];
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull k kVar) {
        return Float.compare(this.f16160d, kVar.f16160d);
    }

    public void b(double d10, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f10;
        float fSin = this.f16161e;
        float fCos = this.f16162f;
        float f11 = this.f16163g;
        float f12 = this.f16164h;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f17 = (float) dArr[i10];
            float f18 = (float) dArr2[i10];
            int i11 = iArr[i10];
            if (i11 == 1) {
                fSin = f17;
                f13 = f18;
            } else if (i11 == 2) {
                fCos = f17;
                f15 = f18;
            } else if (i11 == 3) {
                f11 = f17;
                f14 = f18;
            } else if (i11 == 4) {
                f12 = f17;
                f16 = f18;
            }
        }
        float f19 = (f14 / 2.0f) + f13;
        float fCos2 = (f16 / 2.0f) + f15;
        g gVar = this.f16170n;
        if (gVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            gVar.b(d10, fArr3, fArr4);
            float f20 = fArr3[0];
            float f21 = fArr3[1];
            float f22 = fArr4[0];
            float f23 = fArr4[1];
            f10 = 2.0f;
            double d11 = fSin;
            double d12 = fCos;
            fSin = (float) ((((double) f20) + (Math.sin(d12) * d11)) - ((double) (f11 / 2.0f)));
            fCos = (float) ((((double) f21) - (Math.cos(d12) * d11)) - ((double) (f12 / 2.0f)));
            double d13 = f13;
            double dSin = ((double) f22) + (Math.sin(d12) * d13);
            double d14 = f15;
            float fCos3 = (float) (dSin + (Math.cos(d12) * d14));
            fCos2 = (float) ((((double) f23) - (d13 * Math.cos(d12))) + (Math.sin(d12) * d14));
            f19 = fCos3;
        } else {
            f10 = 2.0f;
        }
        fArr[0] = fSin + (f11 / f10) + 0.0f;
        fArr[1] = fCos + (f12 / f10) + 0.0f;
        fArr2[0] = f19;
        fArr2[1] = fCos2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c(float f10, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z10) {
        float f11;
        float fSin = this.f16161e;
        float fCos = this.f16162f;
        float f12 = this.f16163g;
        float f13 = this.f16164h;
        if (iArr.length != 0 && this.f16173q.length <= iArr[iArr.length - 1]) {
            int i10 = iArr[iArr.length - 1] + 1;
            this.f16173q = new double[i10];
            this.f16174r = new double[i10];
        }
        Arrays.fill(this.f16173q, Double.NaN);
        for (int i11 = 0; i11 < iArr.length; i11++) {
            double[] dArr4 = this.f16173q;
            int i12 = iArr[i11];
            dArr4[i12] = dArr[i11];
            this.f16174r[i12] = dArr2[i11];
        }
        float f14 = Float.NaN;
        int i13 = 0;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        while (true) {
            double[] dArr5 = this.f16173q;
            if (i13 >= dArr5.length) {
                break;
            }
            if (Double.isNaN(dArr5[i13]) && (dArr3 == null || dArr3[i13] == 0.0d)) {
                f11 = f14;
            } else {
                double d10 = dArr3 != null ? dArr3[i13] : 0.0d;
                if (!Double.isNaN(this.f16173q[i13])) {
                    d10 = this.f16173q[i13] + d10;
                }
                f11 = f14;
                float f19 = (float) d10;
                float f20 = (float) this.f16174r[i13];
                if (i13 == 1) {
                    f14 = f11;
                    f15 = f20;
                    fSin = f19;
                } else if (i13 == 2) {
                    f14 = f11;
                    f16 = f20;
                    fCos = f19;
                } else if (i13 == 3) {
                    f14 = f11;
                    f17 = f20;
                    f12 = f19;
                } else if (i13 == 4) {
                    f14 = f11;
                    f18 = f20;
                    f13 = f19;
                } else if (i13 == 5) {
                    f14 = f19;
                }
                i13++;
            }
            f14 = f11;
            i13++;
        }
        float f21 = f14;
        g gVar = this.f16170n;
        if (gVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            gVar.b(f10, fArr, fArr2);
            float f22 = fArr[0];
            float f23 = fArr[1];
            float f24 = fArr2[0];
            float f25 = fArr2[1];
            double d11 = f22;
            double d12 = fSin;
            double d13 = fCos;
            fSin = (float) ((d11 + (Math.sin(d13) * d12)) - ((double) (f12 / 2.0f)));
            fCos = (float) ((((double) f23) - (Math.cos(d13) * d12)) - ((double) (f13 / 2.0f)));
            double d14 = f24;
            double d15 = f15;
            double dSin = d14 + (Math.sin(d13) * d15);
            double dCos = Math.cos(d13) * d12;
            double d16 = f16;
            float f26 = (float) (dSin + (dCos * d16));
            float fCos2 = (float) ((((double) f25) - (d15 * Math.cos(d13))) + (Math.sin(d13) * d12 * d16));
            if (dArr2.length >= 2) {
                dArr2[0] = f26;
                dArr2[1] = fCos2;
            }
            if (!Float.isNaN(f21)) {
                view.setRotation((float) (((double) f21) + Math.toDegrees(Math.atan2(fCos2, f26))));
            }
        } else if (!Float.isNaN(f21)) {
            view.setRotation(f21 + ((float) Math.toDegrees(Math.atan2(f16 + (f18 / 2.0f), f15 + (f17 / 2.0f)))) + 0.0f);
        }
        if (view instanceof c) {
            ((c) view).a(fSin, fCos, f12 + fSin, f13 + fCos);
            return;
        }
        float f27 = fSin + 0.5f;
        int i14 = (int) f27;
        float f28 = fCos + 0.5f;
        int i15 = (int) f28;
        int i16 = (int) (f27 + f12);
        int i17 = (int) (f28 + f13);
        int i18 = i16 - i14;
        int i19 = i17 - i15;
        if (i18 != view.getMeasuredWidth() || i19 != view.getMeasuredHeight() || z10) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
        }
        view.layout(i14, i15, i16, i17);
    }
}
