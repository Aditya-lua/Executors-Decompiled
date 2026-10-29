package p038c2;

import java.util.ArrayList;
import p591z1.C13680b;
import p591z1.C13682d;
import p591z1.C13687i;

/* JADX INFO: renamed from: c2.b */
/* JADX INFO: loaded from: classes.dex */
public class C1509b {
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:280:0x0497 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:310:0x0126 */
    /* JADX WARN: Code duplicated, block: B:100:0x016d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0173  */
    /* JADX WARN: Code duplicated, block: B:104:0x0194  */
    /* JADX WARN: Code duplicated, block: B:16:0x0033 A[PHI: r15 r16
      0x0033: PHI (r15v26 boolean) = (r15v1 boolean), (r15v28 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0033: PHI (r16v5 boolean) = (r16v1 boolean), (r16v7 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[PHI: r15 r16
      0x0035: PHI (r15v3 boolean) = (r15v1 boolean), (r15v28 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r16v3 boolean) = (r16v1 boolean), (r16v7 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:218:0x038a  */
    /* JADX WARN: Code duplicated, block: B:289:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:292:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:293:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:296:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:297:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:299:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:301:0x04da  */
    /* JADX WARN: Code duplicated, block: B:304:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:317:0x038b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x016a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [z1.d] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [z1.d] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [c2.e] */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r5v17, types: [z1.i] */
    /* JADX INFO: renamed from: a */
    public static void m7676a(C1513f c1513f, C13682d c13682d, int i10, int i11, C1510c c1510c) {
        boolean z10;
        boolean z11;
        boolean z12;
        float f10;
        ?? r8;
        C13682d c13682d2;
        C1511d c1511d;
        C13687i c13687i;
        C13687i c13687i2;
        int i12;
        C1511d c1511d2;
        C13687i c13687i3;
        int i13;
        C1511d[] c1511dArr;
        int i14;
        C1511d c1511d3;
        C1511d c1511d4;
        C13687i c13687i4;
        C1511d c1511d5;
        Object obj;
        int size;
        C1511d c1511d6;
        int i15;
        int i16 = i10;
        C1512e c1512e = c1510c.f5791a;
        C1512e c1512e2 = c1510c.f5793c;
        C1512e c1512e3 = c1510c.f5792b;
        C1512e c1512e4 = c1510c.f5794d;
        C1512e c1512e5 = c1510c.f5795e;
        float f11 = c1510c.f5801k;
        boolean z13 = c1513f.f5868Z[i16] == C1512e.b.WRAP_CONTENT;
        if (i16 == 0) {
            int i17 = c1512e5.f5920z0;
            z10 = i17 == 0;
            z11 = i17 == 1;
            if (i17 == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
        } else {
            int i18 = c1512e5.f5834A0;
            z10 = i18 == 0;
            z11 = i18 == 1;
            if (i18 == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
        }
        ?? r14 = c1512e;
        boolean z14 = false;
        while (true) {
            f10 = f11;
            Object obj2 = null;
            if (z14) {
                break;
            }
            C1511d c1511d7 = r14.f5865W[i11];
            int i19 = z12 ? 1 : 4;
            int iM7686f = c1511d7.m7686f();
            C1512e.b bVar = r14.f5868Z[i16];
            boolean z15 = z13;
            C1512e.b bVar2 = C1512e.b.MATCH_CONSTRAINT;
            boolean z16 = bVar == bVar2 && r14.f5917y[i16] == 0;
            boolean z17 = z12;
            C1511d c1511d8 = c1511d7.f5818f;
            if (c1511d8 != null && r14 != c1512e) {
                iM7686f += c1511d8.m7686f();
            }
            int i20 = iM7686f;
            if (z17 && r14 != c1512e && r14 != c1512e3) {
                i19 = 8;
            }
            boolean z18 = z16;
            C1511d c1511d9 = c1511d7.f5818f;
            if (c1511d9 != null) {
                if (r14 == c1512e3) {
                    c13682d.m49962h(c1511d7.f5821i, c1511d9.f5821i, i20, 6);
                } else {
                    c13682d.m49962h(c1511d7.f5821i, c1511d9.f5821i, i20, 8);
                }
                if (z18 && !z17) {
                    i19 = 5;
                }
                c13682d.m49959e(c1511d7.f5821i, c1511d7.f5818f.f5821i, i20, (r14 == c1512e3 && z17 && r14.m7772h0(i16)) ? 5 : i19);
            } else {
                z14 = z14;
                z10 = z10;
            }
            if (z15) {
                if (r14.m7745V() == 8 || r14.f5868Z[i16] != bVar2) {
                    i15 = 0;
                } else {
                    C1511d[] c1511dArr2 = r14.f5865W;
                    i15 = 0;
                    c13682d.m49962h(c1511dArr2[i11 + 1].f5821i, c1511dArr2[i11].f5821i, 0, 5);
                }
                c13682d.m49962h(r14.f5865W[i11].f5821i, c1513f.f5865W[i11].f5821i, i15, 8);
            }
            C1511d c1511d10 = r14.f5865W[i11 + 1].f5818f;
            if (c1511d10 != null) {
                C1512e c1512e6 = c1511d10.f5816d;
                C1511d c1511d11 = c1512e6.f5865W[i11].f5818f;
                if (c1511d11 != null && c1511d11.f5816d == r14) {
                    obj2 = c1512e6;
                }
            }
            if (obj2 != null) {
                r14 = obj2;
                z14 = z14;
            } else {
                z14 = true;
            }
            f11 = f10;
            z13 = z15;
            z12 = z17;
            z10 = z10;
            r14 = r14;
        }
        boolean z19 = z13;
        boolean z20 = z12;
        boolean z21 = z10;
        if (c1512e4 != null) {
            int i21 = i11 + 1;
            if (c1512e2.f5865W[i21].f5818f != null) {
                C1511d c1511d12 = c1512e4.f5865W[i21];
                if (c1512e4.f5868Z[i16] == C1512e.b.MATCH_CONSTRAINT && c1512e4.f5917y[i16] == 0 && !z20) {
                    C1511d c1511d13 = c1511d12.f5818f;
                    if (c1511d13.f5816d == c1513f) {
                        c13682d.m49959e(c1511d12.f5821i, c1511d13.f5821i, -c1511d12.m7686f(), 5);
                    } else if (z20) {
                        c1511d6 = c1511d12.f5818f;
                        if (c1511d6.f5816d == c1513f) {
                            c13682d.m49959e(c1511d12.f5821i, c1511d6.f5821i, -c1511d12.m7686f(), 4);
                        }
                    }
                } else if (z20) {
                    c1511d6 = c1511d12.f5818f;
                    if (c1511d6.f5816d == c1513f) {
                        c13682d.m49959e(c1511d12.f5821i, c1511d6.f5821i, -c1511d12.m7686f(), 4);
                    }
                }
                c13682d.m49964j(c1511d12.f5821i, c1512e2.f5865W[i21].f5818f.f5821i, -c1511d12.m7686f(), 6);
            }
        }
        if (z19) {
            int i22 = i11 + 1;
            C13687i c13687i5 = c1513f.f5865W[i22].f5821i;
            C1511d c1511d14 = c1512e2.f5865W[i22];
            c13682d.m49962h(c13687i5, c1511d14.f5821i, c1511d14.m7686f(), 8);
        }
        ArrayList<C1512e> arrayList = c1510c.f5798h;
        if (arrayList != null && (size = arrayList.size()) > 1) {
            float f12 = (!c1510c.f5808r || c1510c.f5810t) ? f10 : c1510c.f5800j;
            float f13 = 0.0f;
            float f14 = 0.0f;
            C1512e c1512e7 = null;
            int i23 = 0;
            while (i23 < size) {
                C1512e c1512e8 = arrayList.get(i23);
                float f15 = c1512e8.f5840D0[i16];
                if (f15 < f13) {
                    if (c1510c.f5810t) {
                        C1511d[] c1511dArr3 = c1512e8.f5865W;
                        f13 = f13;
                        c13682d.m49959e(c1511dArr3[i11 + 1].f5821i, c1511dArr3[i11].f5821i, 0, 4);
                    } else {
                        f15 = 1.0f;
                    }
                    arrayList = arrayList;
                    i23++;
                    f13 = f13;
                    arrayList = arrayList;
                }
                float f16 = f15;
                if (f16 == f13) {
                    C1511d[] c1511dArr4 = c1512e8.f5865W;
                    c13682d.m49959e(c1511dArr4[i11 + 1].f5821i, c1511dArr4[i11].f5821i, 0, 8);
                    arrayList = arrayList;
                } else {
                    if (c1512e7 != null) {
                        C1511d[] c1511dArr5 = c1512e7.f5865W;
                        C13687i c13687i6 = c1511dArr5[i11].f5821i;
                        int i24 = i11 + 1;
                        C13687i c13687i7 = c1511dArr5[i24].f5821i;
                        C1511d[] c1511dArr6 = c1512e8.f5865W;
                        C13687i c13687i8 = c1511dArr6[i11].f5821i;
                        C13687i c13687i9 = c1511dArr6[i24].f5821i;
                        C13680b c13680bM49972r = c13682d.m49972r();
                        c13680bM49972r.m49933l(f14, f12, f16, c13687i6, c13687i7, c13687i8, c13687i9);
                        c13682d.m49958d(c13680bM49972r);
                    }
                    c1512e7 = c1512e8;
                    f14 = f16;
                }
                i23++;
                f13 = f13;
                arrayList = arrayList;
            }
        }
        if (c1512e3 != null && (c1512e3 == c1512e4 || z20)) {
            C1511d c1511d15 = c1512e.f5865W[i11];
            int i25 = i11 + 1;
            C1511d c1511d16 = c1512e2.f5865W[i25];
            C1511d c1511d17 = c1511d15.f5818f;
            C13687i c13687i10 = c1511d17 != null ? c1511d17.f5821i : null;
            C1511d c1511d18 = c1511d16.f5818f;
            C13687i c13687i11 = c1511d18 != null ? c1511d18.f5821i : null;
            C1511d c1511d19 = c1512e3.f5865W[i11];
            if (c1512e4 != null) {
                c1511d16 = c1512e4.f5865W[i25];
            }
            if (c13687i10 != null && c13687i11 != null) {
                c13682d.m49957c(c1511d19.f5821i, c13687i10, c1511d19.m7686f(), i16 == 0 ? c1512e5.f5898o0 : c1512e5.f5900p0, c13687i11, c1511d16.f5821i, c1511d16.m7686f(), 7);
            }
        } else {
            if (!z21 || c1512e3 == null) {
                if (z11 && c1512e3 != null) {
                    int i26 = c1510c.f5800j;
                    boolean z22 = i26 > 0 && c1510c.f5799i == i26;
                    C1512e c1512e9 = c1512e3;
                    C1512e c1512e10 = c1512e9;
                    while (c1512e9 != null) {
                        C1512e c1512e11 = c1512e9.f5844F0[i10];
                        while (c1512e11 != null && c1512e11.m7745V() == 8) {
                            c1512e11 = c1512e11.f5844F0[i10];
                        }
                        if (c1512e9 != c1512e3 && c1512e9 != c1512e4 && c1512e11 != null) {
                            if (c1512e11 == c1512e4) {
                                c1512e11 = null;
                            }
                            C1511d c1511d20 = c1512e9.f5865W[i11];
                            C13687i c13687i12 = c1511d20.f5821i;
                            C1511d c1511d21 = c1511d20.f5818f;
                            if (c1511d21 != null) {
                                C13687i c13687i13 = c1511d21.f5821i;
                            }
                            int i27 = i11 + 1;
                            C13687i c13687i14 = c1512e10.f5865W[i27].f5821i;
                            int iM7686f2 = c1511d20.m7686f();
                            int iM7686f3 = c1512e9.f5865W[i27].m7686f();
                            if (c1512e11 != null) {
                                c1511d = c1512e11.f5865W[i11];
                                c13687i = c1511d.f5821i;
                                C1511d c1511d22 = c1511d.f5818f;
                                c13687i2 = c1511d22 != null ? c1511d22.f5821i : null;
                            } else {
                                c1511d = c1512e4.f5865W[i11];
                                c13687i = c1511d != null ? c1511d.f5821i : null;
                                c13687i2 = c1512e9.f5865W[i27].f5821i;
                            }
                            if (c1511d != null) {
                                iM7686f3 += c1511d.m7686f();
                            }
                            int iM7686f4 = iM7686f2 + c1512e10.f5865W[i27].m7686f();
                            int i28 = z22 ? 8 : 4;
                            if (c13687i12 != null && c13687i14 != null && c13687i != null && c13687i2 != null) {
                                c13682d.m49957c(c13687i12, c13687i14, iM7686f4, 0.5f, c13687i, c13687i2, iM7686f3, i28);
                            }
                            c1512e11 = c1512e11;
                        }
                        if (c1512e9.m7745V() != 8) {
                            c1512e10 = c1512e9;
                        }
                        c1512e9 = c1512e11;
                    }
                    C1511d c1511d23 = c1512e3.f5865W[i11];
                    C1511d c1511d24 = c1512e.f5865W[i11].f5818f;
                    int i29 = i11 + 1;
                    C1511d c1511d25 = c1512e4.f5865W[i29];
                    C1511d c1511d26 = c1512e2.f5865W[i29].f5818f;
                    if (c1511d24 == null) {
                        r8 = c13682d;
                    } else {
                        if (c1512e3 != c1512e4) {
                            c13682d.m49959e(c1511d23.f5821i, c1511d24.f5821i, c1511d23.m7686f(), 5);
                        } else if (c1511d26 != null) {
                            c13682d2 = c13682d;
                            c13682d2.m49957c(c1511d23.f5821i, c1511d24.f5821i, c1511d23.m7686f(), 0.5f, c1511d25.f5821i, c1511d26.f5821i, c1511d25.m7686f(), 5);
                        }
                        r8 = c13682d;
                    }
                    if (c1511d26 != null && c1512e3 != c1512e4) {
                        r8.m49959e(c1511d25.f5821i, c1511d26.f5821i, -c1511d25.m7686f(), 5);
                    }
                }
                if ((z21 && !z11) || c1512e3 == null || c1512e3 == c1512e4) {
                    return;
                }
                c1511dArr = c1512e3.f5865W;
                C1511d c1511d27 = c1511dArr[i11];
                if (c1512e4 == null) {
                    c1512e4 = c1512e3;
                }
                i14 = i11 + 1;
                c1511d3 = c1512e4.f5865W[i14];
                c1511d4 = c1511d27.f5818f;
                if (c1511d4 != null) {
                    c13687i4 = c1511d4.f5821i;
                } else {
                    c13687i4 = null;
                }
                c1511d5 = c1511d3.f5818f;
                if (c1511d5 != null) {
                    obj = c1511d5.f5821i;
                } else {
                    obj = null;
                }
                if (c1512e2 != c1512e4) {
                    C1511d c1511d28 = c1512e2.f5865W[i14].f5818f;
                    obj = c1511d28 != null ? c1511d28.f5821i : null;
                }
                if (c1512e3 == c1512e4) {
                    c1511d3 = c1511dArr[i14];
                }
                if (c13687i4 != null || obj == null) {
                }
                r8.m49957c(c1511d27.f5821i, c13687i4, c1511d27.m7686f(), 0.5f, obj, c1511d3.f5821i, c1512e4.f5865W[i14].m7686f(), 5);
                return;
            }
            int i30 = c1510c.f5800j;
            boolean z23 = i30 > 0 && c1510c.f5799i == i30;
            C1512e c1512e12 = c1512e3;
            C1512e c1512e13 = c1512e12;
            while (c1512e12 != null) {
                C1512e c1512e14 = c1512e12.f5844F0[i16];
                while (true) {
                    if (c1512e14 == null) {
                        i12 = 8;
                        break;
                    }
                    i12 = 8;
                    if (c1512e14.m7745V() != 8) {
                        break;
                    } else {
                        c1512e14 = c1512e14.f5844F0[i16];
                    }
                }
                if (c1512e14 != null || c1512e12 == c1512e4) {
                    C1511d c1511d29 = c1512e12.f5865W[i11];
                    C13687i c13687i15 = c1511d29.f5821i;
                    C1511d c1511d30 = c1511d29.f5818f;
                    C13687i c13687i16 = c1511d30 != null ? c1511d30.f5821i : null;
                    if (c1512e13 != c1512e12) {
                        c13687i16 = c1512e13.f5865W[i11 + 1].f5821i;
                    } else if (c1512e12 == c1512e3) {
                        C1511d c1511d31 = c1512e.f5865W[i11].f5818f;
                        c13687i16 = c1511d31 != null ? c1511d31.f5821i : null;
                    }
                    int iM7686f5 = c1511d29.m7686f();
                    int i31 = i11 + 1;
                    int iM7686f6 = c1512e12.f5865W[i31].m7686f();
                    if (c1512e14 != null) {
                        c1511d2 = c1512e14.f5865W[i11];
                        c13687i3 = c1511d2.f5821i;
                    } else {
                        c1511d2 = c1512e2.f5865W[i31].f5818f;
                        c13687i3 = c1511d2 != null ? c1511d2.f5821i : null;
                    }
                    C13687i c13687i17 = c1512e12.f5865W[i31].f5821i;
                    if (c1511d2 != null) {
                        iM7686f6 += c1511d2.m7686f();
                    }
                    int iM7686f7 = iM7686f5 + c1512e13.f5865W[i31].m7686f();
                    if (c13687i15 == null || c13687i16 == null || c13687i3 == null || c13687i17 == null) {
                        i13 = 8;
                    } else {
                        if (c1512e12 == c1512e3) {
                            iM7686f7 = c1512e3.f5865W[i11].m7686f();
                        }
                        if (c1512e12 == c1512e4) {
                            iM7686f6 = c1512e4.f5865W[i31].m7686f();
                        }
                        c1512e14 = c1512e14;
                        i13 = 8;
                        c13682d.m49957c(c13687i15, c13687i16, iM7686f7, 0.5f, c13687i3, c13687i17, iM7686f6, z23 ? 8 : 5);
                    }
                    if (c1512e12.m7745V() != i13) {
                        c1512e13 = c1512e12;
                    }
                    i16 = i10;
                    c1512e12 = c1512e14;
                } else {
                    i13 = i12;
                }
                if (c1512e12.m7745V() != i13) {
                    c1512e13 = c1512e12;
                }
                i16 = i10;
                c1512e12 = c1512e14;
            }
        }
        r8 = c13682d;
        if (z21) {
        }
        c1511dArr = c1512e3.f5865W;
        C1511d c1511d210 = c1511dArr[i11];
        if (c1512e4 == null) {
            c1512e4 = c1512e3;
        }
        i14 = i11 + 1;
        c1511d3 = c1512e4.f5865W[i14];
        c1511d4 = c1511d210.f5818f;
        if (c1511d4 != null) {
            c13687i4 = c1511d4.f5821i;
        } else {
            c13687i4 = null;
        }
        c1511d5 = c1511d3.f5818f;
        if (c1511d5 != null) {
            obj = c1511d5.f5821i;
        } else {
            obj = null;
        }
        if (c1512e2 != c1512e4) {
            C1511d c1511d211 = c1512e2.f5865W[i14].f5818f;
            obj = c1511d211 != null ? c1511d211.f5821i : null;
        }
        if (c1512e3 == c1512e4) {
            c1511d3 = c1511dArr[i14];
        }
        if (c13687i4 != null) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m7677b(C1513f c1513f, C13682d c13682d, ArrayList<C1512e> arrayList, int i10) {
        int i11;
        C1510c[] c1510cArr;
        int i12;
        if (i10 == 0) {
            i11 = c1513f.f5937W0;
            c1510cArr = c1513f.f5940Z0;
            i12 = 0;
        } else {
            i11 = c1513f.f5938X0;
            c1510cArr = c1513f.f5939Y0;
            i12 = 2;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            C1510c c1510c = c1510cArr[i13];
            c1510c.m7679a();
            if (arrayList == null || arrayList.contains(c1510c.f5791a)) {
                m7676a(c1513f, c13682d, i10, i12, c1510c);
            }
        }
    }
}
