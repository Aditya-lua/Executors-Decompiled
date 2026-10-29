package androidx.core.graphics;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.core.graphics.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0552e {

    /* JADX INFO: renamed from: androidx.core.graphics.e$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f2324a;

        /* JADX INFO: renamed from: b */
        public boolean f2325b;
    }

    /* JADX INFO: renamed from: a */
    public static void m2711a(ArrayList<b> arrayList, char c10, float[] fArr) {
        arrayList.add(new b(c10, fArr));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2712b(b[] bVarArr, b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            if (bVarArr[i10].f2326a != bVarArr2[i10].f2326a || bVarArr[i10].f2327b.length != bVarArr2[i10].f2327b.length) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static float[] m2713c(float[] fArr, int i10, int i11) {
        if (i10 > i11) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i10 < 0 || i10 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i12 = i11 - i10;
        int iMin = Math.min(i12, length - i10);
        float[] fArr2 = new float[i12];
        System.arraycopy(fArr, i10, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX INFO: renamed from: d */
    public static b[] m2714d(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 1;
        while (i11 < str.length()) {
            int iM2719i = m2719i(str, i11);
            String strTrim = str.substring(i10, iM2719i).trim();
            if (!strTrim.isEmpty()) {
                m2711a(arrayList, strTrim.charAt(0), m2718h(strTrim));
            }
            i10 = iM2719i;
            i11 = iM2719i + 1;
        }
        if (i11 - i10 == 1 && i10 < str.length()) {
            m2711a(arrayList, str.charAt(i10), new float[0]);
        }
        return (b[]) arrayList.toArray(new b[0]);
    }

    /* JADX INFO: renamed from: e */
    public static Path m2715e(String str) {
        Path path = new Path();
        try {
            b.m2729h(m2714d(str), path);
            return path;
        } catch (RuntimeException e10) {
            throw new RuntimeException("Error in parsing " + str, e10);
        }
    }

    /* JADX INFO: renamed from: f */
    public static b[] m2716f(b[] bVarArr) {
        b[] bVarArr2 = new b[bVarArr.length];
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            bVarArr2[i10] = new b(bVarArr[i10]);
        }
        return bVarArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x0029  */
    /* JADX INFO: renamed from: g */
    public static void m2717g(String str, int i10, a aVar) {
        aVar.f2325b = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        for (int i11 = i10; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == ' ') {
                z10 = false;
                z12 = true;
            } else if (cCharAt != 'E' && cCharAt != 'e') {
                switch (cCharAt) {
                    case ',':
                        z10 = false;
                        z12 = true;
                        break;
                    case '-':
                        if (i11 == i10 || z10) {
                            z10 = false;
                        } else {
                            aVar.f2325b = true;
                            z10 = false;
                            z12 = true;
                        }
                        break;
                    case '.':
                        if (z11) {
                            aVar.f2325b = true;
                            z10 = false;
                            z12 = true;
                        } else {
                            z10 = false;
                            z11 = true;
                        }
                        break;
                    default:
                        z10 = false;
                        break;
                }
            } else {
                z10 = true;
            }
            if (z12) {
                aVar.f2324a = i11;
            }
        }
        aVar.f2324a = i11;
    }

    /* JADX INFO: renamed from: h */
    public static float[] m2718h(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            a aVar = new a();
            int length = str.length();
            int i10 = 1;
            int i11 = 0;
            while (i10 < length) {
                m2717g(str, i10, aVar);
                int i12 = aVar.f2324a;
                if (i10 < i12) {
                    fArr[i11] = Float.parseFloat(str.substring(i10, i12));
                    i11++;
                }
                i10 = aVar.f2325b ? i12 : i12 + 1;
            }
            return m2713c(fArr, 0, i11);
        } catch (NumberFormatException e10) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e10);
        }
    }

    /* JADX INFO: renamed from: i */
    public static int m2719i(String str, int i10) {
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                break;
            }
            i10++;
        }
        return i10;
    }

    /* JADX INFO: renamed from: j */
    public static void m2720j(b[] bVarArr, Path path) {
        float[] fArr = new float[6];
        char c10 = 'm';
        for (b bVar : bVarArr) {
            b.m2726e(path, fArr, c10, bVar.f2326a, bVar.f2327b);
            c10 = bVar.f2326a;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m2721k(b[] bVarArr, b[] bVarArr2) {
        for (int i10 = 0; i10 < bVarArr2.length; i10++) {
            bVarArr[i10].f2326a = bVarArr2[i10].f2326a;
            for (int i11 = 0; i11 < bVarArr2[i10].f2327b.length; i11++) {
                bVarArr[i10].f2327b[i11] = bVarArr2[i10].f2327b[i11];
            }
        }
    }

    /* JADX INFO: renamed from: androidx.core.graphics.e$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public char f2326a;

        /* JADX INFO: renamed from: b */
        public final float[] f2327b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public b(char c10, float[] fArr) {
            this.f2326a = c10;
            this.f2327b = fArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX INFO: renamed from: e */
        public static void m2726e(Path path, float[] fArr, char c10, char c11, float[] fArr2) {
            int i10;
            int i11;
            boolean z10;
            boolean z11;
            char c12;
            char c13;
            int i12;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            float f20;
            float f21;
            float f22;
            Path path2 = path;
            boolean z12 = false;
            float f23 = fArr[0];
            boolean z13 = true;
            float f24 = fArr[1];
            char c14 = 2;
            float f25 = fArr[2];
            char c15 = 3;
            float f26 = fArr[3];
            float f27 = fArr[4];
            float f28 = fArr[5];
            switch (c11) {
                case 'A':
                case 'a':
                    i10 = 7;
                    i11 = i10;
                    break;
                case 'C':
                case 'c':
                    i10 = 6;
                    i11 = i10;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i11 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i11 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i11 = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f27, f28);
                    f23 = f27;
                    f25 = f23;
                    f24 = f28;
                    f26 = f24;
                    i11 = 2;
                    break;
            }
            float f29 = f23;
            float f30 = f24;
            float f31 = f27;
            float f32 = f28;
            int i13 = 0;
            char c16 = c10;
            while (i13 < fArr2.length) {
                if (c11 == 'A') {
                    z10 = z12;
                    z11 = z13;
                    c12 = c14;
                    c13 = c15;
                    i12 = i13;
                    int i14 = i12 + 5;
                    int i15 = i12 + 6;
                    m2728g(path, f29, f30, fArr2[i14], fArr2[i15], fArr2[i12], fArr2[i12 + 1], fArr2[i12 + 2], fArr2[i12 + 3] != 0.0f ? z11 : z10, fArr2[i12 + 4] != 0 ? z11 : z10);
                    f25 = fArr2[i14];
                    f29 = f25;
                    f26 = fArr2[i15];
                    f30 = f26;
                } else if (c11 == 'C') {
                    z10 = z12;
                    z11 = z13;
                    c12 = c14;
                    c13 = c15;
                    i12 = i13;
                    int i16 = i12 + 2;
                    int i17 = i12 + 3;
                    int i18 = i12 + 4;
                    int i19 = i12 + 5;
                    path2.cubicTo(fArr2[i12], fArr2[i12 + 1], fArr2[i16], fArr2[i17], fArr2[i18], fArr2[i19]);
                    float f33 = fArr2[i18];
                    float f34 = fArr2[i19];
                    float f35 = fArr2[i16];
                    float f36 = fArr2[i17];
                    f29 = f33;
                    f30 = f34;
                    f26 = f36;
                    f25 = f35;
                } else if (c11 != 'H') {
                    if (c11 != 'Q') {
                        z10 = z12;
                        if (c11 == 'V') {
                            z11 = z13;
                            c12 = c14;
                            c13 = c15;
                            i12 = i13;
                            path2.lineTo(f29, fArr2[i12]);
                            f12 = fArr2[i12];
                        } else if (c11 != 'a') {
                            if (c11 != 'c') {
                                z11 = z13;
                                if (c11 != 'h') {
                                    if (c11 != 'q') {
                                        c12 = c14;
                                        if (c11 != 'v') {
                                            if (c11 != 'L') {
                                                if (c11 != 'M') {
                                                    c13 = c15;
                                                    if (c11 == 'S') {
                                                        if (c16 == 'c' || c16 == 's' || c16 == 'C' || c16 == 'S') {
                                                            f29 = (f29 * 2.0f) - f25;
                                                            f30 = (f30 * 2.0f) - f26;
                                                        }
                                                        float f37 = f29;
                                                        float f38 = f30;
                                                        int i20 = i13 + 1;
                                                        int i21 = i13 + 2;
                                                        int i22 = i13 + 3;
                                                        path2.cubicTo(f37, f38, fArr2[i13], fArr2[i20], fArr2[i21], fArr2[i22]);
                                                        f10 = fArr2[i13];
                                                        f11 = fArr2[i20];
                                                        f29 = fArr2[i21];
                                                        f30 = fArr2[i22];
                                                        i12 = i13;
                                                    } else if (c11 == 'T') {
                                                        if (c16 == 'q' || c16 == 't' || c16 == 'Q' || c16 == 'T') {
                                                            f29 = (f29 * 2.0f) - f25;
                                                            f30 = (f30 * 2.0f) - f26;
                                                        }
                                                        int i23 = i13 + 1;
                                                        path2.quadTo(f29, f30, fArr2[i13], fArr2[i23]);
                                                        float f39 = fArr2[i13];
                                                        f12 = fArr2[i23];
                                                        f25 = f29;
                                                        f26 = f30;
                                                        i12 = i13;
                                                        f29 = f39;
                                                    } else if (c11 == 'l') {
                                                        int i24 = i13 + 1;
                                                        path2.rLineTo(fArr2[i13], fArr2[i24]);
                                                        f29 += fArr2[i13];
                                                        f16 = fArr2[i24];
                                                    } else if (c11 == 'm') {
                                                        float f40 = fArr2[i13];
                                                        f29 += f40;
                                                        float f41 = fArr2[i13 + 1];
                                                        f30 += f41;
                                                        if (i13 > 0) {
                                                            path2.rLineTo(f40, f41);
                                                        } else {
                                                            path2.rMoveTo(f40, f41);
                                                            f31 = f29;
                                                        }
                                                    } else if (c11 == 's') {
                                                        if (c16 == 'c' || c16 == 's' || c16 == 'C' || c16 == 'S') {
                                                            f19 = f30 - f26;
                                                            f20 = f29 - f25;
                                                        } else {
                                                            f20 = 0.0f;
                                                            f19 = 0.0f;
                                                        }
                                                        int i25 = i13 + 1;
                                                        int i26 = i13 + 2;
                                                        int i27 = i13 + 3;
                                                        path2.rCubicTo(f20, f19, fArr2[i13], fArr2[i25], fArr2[i26], fArr2[i27]);
                                                        f13 = fArr2[i13] + f29;
                                                        f14 = fArr2[i25] + f30;
                                                        f29 += fArr2[i26];
                                                        f15 = fArr2[i27];
                                                    } else if (c11 == 't') {
                                                        if (c16 == 'q' || c16 == 't' || c16 == 'Q' || c16 == 'T') {
                                                            f21 = f29 - f25;
                                                            f22 = f30 - f26;
                                                        } else {
                                                            f22 = 0.0f;
                                                            f21 = 0.0f;
                                                        }
                                                        int i28 = i13 + 1;
                                                        path2.rQuadTo(f21, f22, fArr2[i13], fArr2[i28]);
                                                        float f42 = f21 + f29;
                                                        float f43 = f22 + f30;
                                                        f29 += fArr2[i13];
                                                        f30 += fArr2[i28];
                                                        f26 = f43;
                                                        f25 = f42;
                                                    }
                                                } else {
                                                    c13 = c15;
                                                    f17 = fArr2[i13];
                                                    f18 = fArr2[i13 + 1];
                                                    if (i13 > 0) {
                                                        path2.lineTo(f17, f18);
                                                    } else {
                                                        path2.moveTo(f17, f18);
                                                        f29 = f17;
                                                        f31 = f29;
                                                        f30 = f18;
                                                    }
                                                }
                                                f32 = f30;
                                            } else {
                                                c13 = c15;
                                                int i29 = i13 + 1;
                                                path2.lineTo(fArr2[i13], fArr2[i29]);
                                                f17 = fArr2[i13];
                                                f18 = fArr2[i29];
                                            }
                                            f29 = f17;
                                            f30 = f18;
                                        } else {
                                            c13 = c15;
                                            path2.rLineTo(0.0f, fArr2[i13]);
                                            f16 = fArr2[i13];
                                        }
                                        f30 += f16;
                                    } else {
                                        c12 = c14;
                                        c13 = c15;
                                        int i30 = i13 + 1;
                                        int i31 = i13 + 2;
                                        int i32 = i13 + 3;
                                        path2.rQuadTo(fArr2[i13], fArr2[i30], fArr2[i31], fArr2[i32]);
                                        f13 = fArr2[i13] + f29;
                                        f14 = fArr2[i30] + f30;
                                        f29 += fArr2[i31];
                                        f15 = fArr2[i32];
                                    }
                                    f30 += f15;
                                    f25 = f13;
                                    f26 = f14;
                                } else {
                                    c12 = c14;
                                    c13 = c15;
                                    path2.rLineTo(fArr2[i13], 0.0f);
                                    f29 += fArr2[i13];
                                }
                            } else {
                                z11 = z13;
                                c12 = c14;
                                c13 = c15;
                                int i33 = i13 + 2;
                                int i34 = i13 + 3;
                                int i35 = i13 + 4;
                                int i36 = i13 + 5;
                                path2.rCubicTo(fArr2[i13], fArr2[i13 + 1], fArr2[i33], fArr2[i34], fArr2[i35], fArr2[i36]);
                                float f44 = fArr2[i33] + f29;
                                float f45 = fArr2[i34] + f30;
                                f29 += fArr2[i35];
                                f30 += fArr2[i36];
                                f25 = f44;
                                f26 = f45;
                            }
                            i12 = i13;
                        } else {
                            z11 = z13;
                            c12 = c14;
                            c13 = c15;
                            int i37 = i13 + 5;
                            int i38 = i13 + 6;
                            i12 = i13;
                            float f46 = f29;
                            m2728g(path, f46, f30, fArr2[i37] + f29, fArr2[i38] + f30, fArr2[i13], fArr2[i13 + 1], fArr2[i13 + 2], fArr2[i13 + 3] != 0.0f ? z11 : z10, fArr2[i13 + 4] != 0 ? z11 : z10);
                            f29 = f46 + fArr2[i37];
                            f30 += fArr2[i38];
                            f25 = f29;
                            f26 = f30;
                        }
                        f30 = f12;
                    } else {
                        z10 = z12;
                        z11 = z13;
                        c12 = c14;
                        c13 = c15;
                        i12 = i13;
                        int i39 = i12 + 1;
                        int i40 = i12 + 2;
                        int i41 = i12 + 3;
                        path2.quadTo(fArr2[i12], fArr2[i39], fArr2[i40], fArr2[i41]);
                        f10 = fArr2[i12];
                        f11 = fArr2[i39];
                        f29 = fArr2[i40];
                        f30 = fArr2[i41];
                    }
                    f25 = f10;
                    f26 = f11;
                } else {
                    z10 = z12;
                    z11 = z13;
                    c12 = c14;
                    c13 = c15;
                    i12 = i13;
                    path2.lineTo(fArr2[i12], f30);
                    f29 = fArr2[i12];
                }
                i13 = i12 + i11;
                path2 = path;
                c16 = c11;
                z12 = z10;
                z13 = z11;
                c14 = c12;
                c15 = c13;
            }
            fArr[z12 ? 1 : 0] = f29;
            fArr[z13 ? 1 : 0] = f30;
            fArr[c14] = f25;
            fArr[c15] = f26;
            fArr[4] = f31;
            fArr[5] = f32;
        }

        /* JADX INFO: renamed from: f */
        public static void m2727f(Path path, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
            double d19 = d12;
            int iCeil = (int) Math.ceil(Math.abs((d18 * 4.0d) / 3.141592653589793d));
            double dCos = Math.cos(d16);
            double dSin = Math.sin(d16);
            double dCos2 = Math.cos(d17);
            double dSin2 = Math.sin(d17);
            double d20 = -d19;
            double d21 = d20 * dCos;
            double d22 = d13 * dSin;
            double d23 = (d21 * dSin2) - (d22 * dCos2);
            double d24 = d20 * dSin;
            double d25 = d13 * dCos;
            double d26 = (dSin2 * d24) + (dCos2 * d25);
            double d27 = d18 / ((double) iCeil);
            double d28 = d26;
            double d29 = d23;
            int i10 = 0;
            double d30 = d14;
            double d31 = d15;
            double d32 = d17;
            while (i10 < iCeil) {
                double d33 = d32 + d27;
                double dSin3 = Math.sin(d33);
                double dCos3 = Math.cos(d33);
                double d34 = (d10 + ((d19 * dCos) * dCos3)) - (d22 * dSin3);
                int i11 = i10;
                double d35 = d11 + (d12 * dSin * dCos3) + (d25 * dSin3);
                double d36 = (d21 * dSin3) - (d22 * dCos3);
                double d37 = (dSin3 * d24) + (dCos3 * d25);
                double d38 = d33 - d32;
                double dTan = Math.tan(d38 / 2.0d);
                double dSin4 = (Math.sin(d38) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
                double d39 = d30 + (d29 * dSin4);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d39, (float) (d31 + (d28 * dSin4)), (float) (d34 - (dSin4 * d36)), (float) (d35 - (dSin4 * d37)), (float) d34, (float) d35);
                dSin = dSin;
                d27 = d27;
                d30 = d34;
                d24 = d24;
                d32 = d33;
                d28 = d37;
                dCos = dCos;
                d19 = d12;
                d31 = d35;
                i10 = i11 + 1;
                iCeil = iCeil;
                d29 = d36;
            }
        }

        /* JADX INFO: renamed from: g */
        public static void m2728g(Path path, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z10, boolean z11) {
            double d10;
            double d11;
            double radians = Math.toRadians(f16);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d12 = f10;
            double d13 = f11;
            double d14 = f14;
            double d15 = ((d12 * dCos) + (d13 * dSin)) / d14;
            double d16 = f15;
            double d17 = ((((double) (-f10)) * dSin) + (d13 * dCos)) / d16;
            double d18 = f13;
            double d19 = ((((double) f12) * dCos) + (d18 * dSin)) / d14;
            double d20 = ((((double) (-f12)) * dSin) + (d18 * dCos)) / d16;
            double d21 = d15 - d19;
            double d22 = d17 - d20;
            double d23 = (d15 + d19) / 2.0d;
            double d24 = (d17 + d20) / 2.0d;
            double d25 = (d21 * d21) + (d22 * d22);
            if (d25 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d26 = (1.0d / d25) - 0.25d;
            if (d26 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d25);
                float fSqrt = (float) (Math.sqrt(d25) / 1.99999d);
                m2728g(path, f10, f11, f12, f13, f14 * fSqrt, fSqrt * f15, f16, z10, z11);
                return;
            }
            double dSqrt = Math.sqrt(d26);
            double d27 = d21 * dSqrt;
            double d28 = dSqrt * d22;
            if (z10 == z11) {
                d10 = d23 - d28;
                d11 = d24 + d27;
            } else {
                d10 = d23 + d28;
                d11 = d24 - d27;
            }
            double dAtan2 = Math.atan2(d17 - d11, d15 - d10);
            double dAtan3 = Math.atan2(d20 - d11, d19 - d10) - dAtan2;
            if (z11 != (dAtan3 >= 0.0d)) {
                dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
            }
            double d29 = d10 * d14;
            double d30 = d11 * d16;
            m2727f(path, (d29 * dCos) - (d30 * dSin), (d29 * dSin) + (d30 * dCos), d14, d16, d12, d13, radians, dAtan2, dAtan3);
        }

        @Deprecated
        /* JADX INFO: renamed from: h */
        public static void m2729h(b[] bVarArr, Path path) {
            C0552e.m2720j(bVarArr, path);
        }

        public b(b bVar) {
            this.f2326a = bVar.f2326a;
            float[] fArr = bVar.f2327b;
            this.f2327b = C0552e.m2713c(fArr, 0, fArr.length);
        }
    }
}
