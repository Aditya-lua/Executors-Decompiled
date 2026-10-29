package androidx.datastore.preferences.protobuf;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class u0<T> implements g1<T> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f2361r = new int[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Unsafe f2362s = q1.A();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f2363a;
    public final Object[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r0 f2366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f2367f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f2368g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b1 f2369h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f2370i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f2371j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f2372k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f2373l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w0 f2374m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f0 f2375n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final n1<?, ?> f2376o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p<?> f2377p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m0 f2378q;

    public u0(int[] iArr, Object[] objArr, int i10, int i11, r0 r0Var, b1 b1Var, boolean z10, int[] iArr2, int i12, int i13, w0 w0Var, f0 f0Var, n1<?, ?> n1Var, p<?> pVar, m0 m0Var) {
        this.f2363a = iArr;
        this.b = objArr;
        this.f2364c = i10;
        this.f2365d = i11;
        this.f2368g = r0Var instanceof x;
        this.f2369h = b1Var;
        this.f2367f = pVar != null && pVar.e(r0Var);
        this.f2370i = z10;
        this.f2371j = iArr2;
        this.f2372k = i12;
        this.f2373l = i13;
        this.f2374m = w0Var;
        this.f2375n = f0Var;
        this.f2376o = n1Var;
        this.f2377p = pVar;
        this.f2366e = r0Var;
        this.f2378q = m0Var;
    }

    public static boolean C(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof x) {
            return ((x) obj).I();
        }
        return true;
    }

    public static boolean F(int i10) {
        return (i10 & 268435456) != 0;
    }

    public static <T> long G(T t8, long j10) {
        return q1.x(t8, j10);
    }

    public static <T> u0<T> O(Class<T> cls, p0 p0Var, w0 w0Var, f0 f0Var, n1<?, ?> n1Var, p<?> pVar, m0 m0Var) {
        return p0Var instanceof e1 ? Q((e1) p0Var, w0Var, f0Var, n1Var, pVar, m0Var) : P((k1) p0Var, w0Var, f0Var, n1Var, pVar, m0Var);
    }

    public static <T> u0<T> P(k1 k1Var, w0 w0Var, f0 f0Var, n1<?, ?> n1Var, p<?> pVar, m0 m0Var) {
        s[] sVarArrE = k1Var.e();
        if (sVarArrE.length != 0) {
            s sVar = sVarArrE[0];
            throw null;
        }
        int length = sVarArrE.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        if (sVarArrE.length > 0) {
            s sVar2 = sVarArrE[0];
            throw null;
        }
        int[] iArrD = k1Var.d();
        if (iArrD == null) {
            iArrD = f2361r;
        }
        if (sVarArrE.length > 0) {
            s sVar3 = sVarArrE[0];
            throw null;
        }
        int[] iArr2 = f2361r;
        int[] iArr3 = f2361r;
        int[] iArr4 = new int[iArrD.length + iArr2.length + iArr3.length];
        System.arraycopy(iArrD, 0, iArr4, 0, iArrD.length);
        System.arraycopy(iArr2, 0, iArr4, iArrD.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, iArrD.length + iArr2.length, iArr3.length);
        return new u0<>(iArr, objArr, 0, 0, k1Var.b(), k1Var.c(), true, iArr4, iArrD.length, iArrD.length + iArr2.length, w0Var, f0Var, n1Var, pVar, m0Var);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0251  */
    /* JADX WARN: Code duplicated, block: B:122:0x0254  */
    /* JADX WARN: Code duplicated, block: B:125:0x026b  */
    /* JADX WARN: Code duplicated, block: B:126:0x026e  */
    /* JADX WARN: Code duplicated, block: B:163:0x0326  */
    /* JADX WARN: Code duplicated, block: B:180:0x0375  */
    /* JADX WARN: Code duplicated, block: B:183:0x0383  */
    public static <T> u0<T> Q(e1 e1Var, w0 w0Var, f0 f0Var, n1<?, ?> n1Var, p<?> pVar, m0 m0Var) {
        int i10;
        int iCharAt;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr;
        int i15;
        int i16;
        int i17;
        char cCharAt;
        int i18;
        char cCharAt2;
        int i19;
        char cCharAt3;
        int i20;
        char cCharAt4;
        int i21;
        char cCharAt5;
        int i22;
        char cCharAt6;
        int i23;
        char cCharAt7;
        int i24;
        char cCharAt8;
        int i25;
        int i26;
        int i27;
        int i28;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i29;
        int i30;
        int iObjectFieldOffset3;
        int i31;
        Field fieldE0;
        char cCharAt9;
        int i32;
        int i33;
        int i34;
        Object obj;
        Field fieldE1;
        int i35;
        Object obj2;
        Field fieldE2;
        int i36;
        char cCharAt10;
        int i37;
        char cCharAt11;
        int i38;
        char cCharAt12;
        int i39;
        char cCharAt13;
        String strE = e1Var.e();
        int length = strE.length();
        char c10 = 55296;
        if (strE.charAt(0) >= 55296) {
            int i40 = 1;
            while (true) {
                i10 = i40 + 1;
                if (strE.charAt(i40) < 55296) {
                    break;
                }
                i40 = i10;
            }
        } else {
            i10 = 1;
        }
        int i41 = i10 + 1;
        int iCharAt2 = strE.charAt(i10);
        if (iCharAt2 >= 55296) {
            int i42 = iCharAt2 & 8191;
            int i43 = 13;
            while (true) {
                i39 = i41 + 1;
                cCharAt13 = strE.charAt(i41);
                if (cCharAt13 < 55296) {
                    break;
                }
                i42 |= (cCharAt13 & 8191) << i43;
                i43 += 13;
                i41 = i39;
            }
            iCharAt2 = i42 | (cCharAt13 << i43);
            i41 = i39;
        }
        if (iCharAt2 == 0) {
            i13 = 0;
            iCharAt = 0;
            i12 = 0;
            i16 = 0;
            i11 = 0;
            i15 = 0;
            iArr = f2361r;
            i14 = 0;
        } else {
            int i44 = i41 + 1;
            int iCharAt3 = strE.charAt(i41);
            if (iCharAt3 >= 55296) {
                int i45 = iCharAt3 & 8191;
                int i46 = 13;
                while (true) {
                    i24 = i44 + 1;
                    cCharAt8 = strE.charAt(i44);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt8 & 8191) << i46;
                    i46 += 13;
                    i44 = i24;
                }
                iCharAt3 = i45 | (cCharAt8 << i46);
                i44 = i24;
            }
            int i47 = i44 + 1;
            int iCharAt4 = strE.charAt(i44);
            if (iCharAt4 >= 55296) {
                int i48 = iCharAt4 & 8191;
                int i49 = 13;
                while (true) {
                    i23 = i47 + 1;
                    cCharAt7 = strE.charAt(i47);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt7 & 8191) << i49;
                    i49 += 13;
                    i47 = i23;
                }
                iCharAt4 = i48 | (cCharAt7 << i49);
                i47 = i23;
            }
            int i50 = i47 + 1;
            int iCharAt5 = strE.charAt(i47);
            if (iCharAt5 >= 55296) {
                int i51 = iCharAt5 & 8191;
                int i52 = 13;
                while (true) {
                    i22 = i50 + 1;
                    cCharAt6 = strE.charAt(i50);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt6 & 8191) << i52;
                    i52 += 13;
                    i50 = i22;
                }
                iCharAt5 = i51 | (cCharAt6 << i52);
                i50 = i22;
            }
            int i53 = i50 + 1;
            int iCharAt6 = strE.charAt(i50);
            if (iCharAt6 >= 55296) {
                int i54 = iCharAt6 & 8191;
                int i55 = 13;
                while (true) {
                    i21 = i53 + 1;
                    cCharAt5 = strE.charAt(i53);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt5 & 8191) << i55;
                    i55 += 13;
                    i53 = i21;
                }
                iCharAt6 = i54 | (cCharAt5 << i55);
                i53 = i21;
            }
            int i56 = i53 + 1;
            iCharAt = strE.charAt(i53);
            if (iCharAt >= 55296) {
                int i57 = iCharAt & 8191;
                int i58 = 13;
                while (true) {
                    i20 = i56 + 1;
                    cCharAt4 = strE.charAt(i56);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt4 & 8191) << i58;
                    i58 += 13;
                    i56 = i20;
                }
                iCharAt = i57 | (cCharAt4 << i58);
                i56 = i20;
            }
            int i59 = i56 + 1;
            int iCharAt7 = strE.charAt(i56);
            if (iCharAt7 >= 55296) {
                int i60 = iCharAt7 & 8191;
                int i61 = 13;
                while (true) {
                    i19 = i59 + 1;
                    cCharAt3 = strE.charAt(i59);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt3 & 8191) << i61;
                    i61 += 13;
                    i59 = i19;
                }
                iCharAt7 = i60 | (cCharAt3 << i61);
                i59 = i19;
            }
            int i62 = i59 + 1;
            int iCharAt8 = strE.charAt(i59);
            if (iCharAt8 >= 55296) {
                int i63 = iCharAt8 & 8191;
                int i64 = 13;
                while (true) {
                    i18 = i62 + 1;
                    cCharAt2 = strE.charAt(i62);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i63 |= (cCharAt2 & 8191) << i64;
                    i64 += 13;
                    i62 = i18;
                }
                iCharAt8 = i63 | (cCharAt2 << i64);
                i62 = i18;
            }
            int i65 = i62 + 1;
            int iCharAt9 = strE.charAt(i62);
            if (iCharAt9 >= 55296) {
                int i66 = iCharAt9 & 8191;
                int i67 = 13;
                while (true) {
                    i17 = i65 + 1;
                    cCharAt = strE.charAt(i65);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i66 |= (cCharAt & 8191) << i67;
                    i67 += 13;
                    i65 = i17;
                }
                iCharAt9 = i66 | (cCharAt << i67);
                i65 = i17;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            i11 = (iCharAt3 * 2) + iCharAt4;
            int i68 = iCharAt7;
            i12 = iCharAt5;
            i13 = i68;
            i14 = iCharAt3;
            iArr = iArr2;
            i15 = iCharAt9;
            i41 = i65;
            i16 = iCharAt6;
        }
        Unsafe unsafe = f2362s;
        Object[] objArrD = e1Var.d();
        Class<?> cls = e1Var.b().getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt * 2];
        int i69 = i15 + i13;
        int i70 = i69;
        int i71 = i15;
        int i72 = 0;
        int i73 = 0;
        while (i41 < length) {
            int i74 = i41 + 1;
            int iCharAt10 = strE.charAt(i41);
            if (iCharAt10 >= c10) {
                int i75 = iCharAt10 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i38 = i76 + 1;
                    cCharAt12 = strE.charAt(i76);
                    if (cCharAt12 < c10) {
                        break;
                    }
                    i75 |= (cCharAt12 & 8191) << i77;
                    i77 += 13;
                    i76 = i38;
                }
                iCharAt10 = i75 | (cCharAt12 << i77);
                i25 = i38;
            } else {
                i25 = i74;
            }
            int i78 = i25 + 1;
            int iCharAt11 = strE.charAt(i25);
            if (iCharAt11 >= c10) {
                int i79 = iCharAt11 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i37 = i80 + 1;
                    cCharAt11 = strE.charAt(i80);
                    if (cCharAt11 < c10) {
                        break;
                    }
                    i79 |= (cCharAt11 & 8191) << i81;
                    i81 += 13;
                    i80 = i37;
                }
                iCharAt11 = i79 | (cCharAt11 << i81);
                i26 = i37;
            } else {
                i26 = i78;
            }
            int i82 = iCharAt11 & 255;
            int i83 = length;
            if ((iCharAt11 & Barcode.FORMAT_UPC_E) != 0) {
                iArr[i72] = i73;
                i72++;
            }
            int[] iArr4 = iArr3;
            if (i82 >= 51) {
                int i84 = i26 + 1;
                int iCharAt12 = strE.charAt(i26);
                char c11 = 55296;
                if (iCharAt12 >= 55296) {
                    int i85 = iCharAt12 & 8191;
                    int i86 = 13;
                    while (true) {
                        i36 = i84 + 1;
                        cCharAt10 = strE.charAt(i84);
                        if (cCharAt10 < c11) {
                            break;
                        }
                        i85 |= (cCharAt10 & 8191) << i86;
                        i86 += 13;
                        i84 = i36;
                        c11 = 55296;
                    }
                    iCharAt12 = i85 | (cCharAt10 << i86);
                    i84 = i36;
                }
                int i87 = i82 - 51;
                int i88 = i84;
                if (i87 == 9 || i87 == 17) {
                    i33 = i11 + 1;
                    objArr[((i73 / 3) * 2) + 1] = objArrD[i11];
                } else {
                    if (i87 == 12 && (e1Var.c().equals(b1.PROTO2) || (iCharAt11 & Barcode.FORMAT_PDF417) != 0)) {
                        i33 = i11 + 1;
                        objArr[((i73 / 3) * 2) + 1] = objArrD[i11];
                    }
                    i34 = iCharAt12 * 2;
                    obj = objArrD[i34];
                    if (obj instanceof Field) {
                        fieldE1 = (Field) obj;
                    } else {
                        fieldE1 = e0(cls, (String) obj);
                        objArrD[i34] = fieldE1;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldE1);
                    i35 = i34 + 1;
                    obj2 = objArrD[i35];
                    if (obj2 instanceof Field) {
                        fieldE2 = (Field) obj2;
                    } else {
                        fieldE2 = e0(cls, (String) obj2);
                        objArrD[i35] = fieldE2;
                    }
                    strE = strE;
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldE2);
                    i31 = iObjectFieldOffset4;
                    i30 = 0;
                    i27 = iCharAt10;
                    i41 = i88;
                }
                i11 = i33;
                i34 = iCharAt12 * 2;
                obj = objArrD[i34];
                if (obj instanceof Field) {
                    fieldE1 = (Field) obj;
                } else {
                    fieldE1 = e0(cls, (String) obj);
                    objArrD[i34] = fieldE1;
                }
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldE1);
                i35 = i34 + 1;
                obj2 = objArrD[i35];
                if (obj2 instanceof Field) {
                    fieldE2 = (Field) obj2;
                } else {
                    fieldE2 = e0(cls, (String) obj2);
                    objArrD[i35] = fieldE2;
                }
                strE = strE;
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldE2);
                i31 = iObjectFieldOffset5;
                i30 = 0;
                i27 = iCharAt10;
                i41 = i88;
            } else {
                int i89 = i11 + 1;
                Field fieldE3 = e0(cls, (String) objArrD[i11]);
                if (i82 == 9 || i82 == 17) {
                    i27 = iCharAt10;
                    objArr[((i73 / 3) * 2) + 1] = fieldE3.getType();
                } else {
                    if (i82 == 27 || i82 == 49) {
                        i27 = iCharAt10;
                        i32 = i11 + 2;
                        objArr[((i73 / 3) * 2) + 1] = objArrD[i89];
                    } else if (i82 == 12 || i82 == 30 || i82 == 44) {
                        i27 = iCharAt10;
                        if (e1Var.c() == b1.PROTO2 || (iCharAt11 & Barcode.FORMAT_PDF417) != 0) {
                            i32 = i11 + 2;
                            objArr[((i73 / 3) * 2) + 1] = objArrD[i89];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldE3);
                        if ((iCharAt11 & Barcode.FORMAT_AZTEC) != 0 || i82 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i29 = i26;
                            i30 = 0;
                        } else {
                            int i90 = i26 + 1;
                            int iCharAt13 = strE.charAt(i26);
                            if (iCharAt13 >= 55296) {
                                int i91 = iCharAt13 & 8191;
                                int i92 = 13;
                                while (true) {
                                    i29 = i90 + 1;
                                    cCharAt9 = strE.charAt(i90);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i91 |= (cCharAt9 & 8191) << i92;
                                    i92 += 13;
                                    i90 = i29;
                                }
                                iCharAt13 = i91 | (cCharAt9 << i92);
                            } else {
                                i29 = i90;
                            }
                            int i93 = (i14 * 2) + (iCharAt13 / 32);
                            Object obj3 = objArrD[i93];
                            if (obj3 instanceof Field) {
                                fieldE0 = (Field) obj3;
                            } else {
                                fieldE0 = e0(cls, (String) obj3);
                                objArrD[i93] = fieldE0;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldE0);
                            i30 = iCharAt13 % 32;
                        }
                        int i94 = iObjectFieldOffset2;
                        if (i82 >= 18 && i82 <= 49) {
                            iArr[i70] = iObjectFieldOffset;
                            i70++;
                        }
                        iObjectFieldOffset3 = i94;
                        i31 = iObjectFieldOffset;
                        i11 = i28;
                        i41 = i29;
                    } else {
                        if (i82 == 50) {
                            int i95 = i71 + 1;
                            iArr[i71] = i73;
                            int i96 = (i73 / 3) * 2;
                            int i97 = i11 + 2;
                            objArr[i96] = objArrD[i89];
                            if ((iCharAt11 & Barcode.FORMAT_PDF417) != 0) {
                                i28 = i11 + 3;
                                objArr[i96 + 1] = objArrD[i97];
                                i27 = iCharAt10;
                                i71 = i95;
                            } else {
                                i28 = i97;
                                i71 = i95;
                                i27 = iCharAt10;
                            }
                        } else {
                            i27 = iCharAt10;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldE3);
                        if ((iCharAt11 & Barcode.FORMAT_AZTEC) != 0) {
                            iObjectFieldOffset2 = 1048575;
                            i29 = i26;
                            i30 = 0;
                        } else {
                            iObjectFieldOffset2 = 1048575;
                            i29 = i26;
                            i30 = 0;
                        }
                        int i98 = iObjectFieldOffset2;
                        if (i82 >= 18) {
                            iArr[i70] = iObjectFieldOffset;
                            i70++;
                        }
                        iObjectFieldOffset3 = i98;
                        i31 = iObjectFieldOffset;
                        i11 = i28;
                        i41 = i29;
                    }
                    i28 = i32;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldE3);
                    if ((iCharAt11 & Barcode.FORMAT_AZTEC) != 0) {
                        iObjectFieldOffset2 = 1048575;
                        i29 = i26;
                        i30 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i29 = i26;
                        i30 = 0;
                    }
                    int i99 = iObjectFieldOffset2;
                    if (i82 >= 18) {
                        iArr[i70] = iObjectFieldOffset;
                        i70++;
                    }
                    iObjectFieldOffset3 = i99;
                    i31 = iObjectFieldOffset;
                    i11 = i28;
                    i41 = i29;
                }
                i28 = i89;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldE3);
                if ((iCharAt11 & Barcode.FORMAT_AZTEC) != 0) {
                    iObjectFieldOffset2 = 1048575;
                    i29 = i26;
                    i30 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i29 = i26;
                    i30 = 0;
                }
                int i910 = iObjectFieldOffset2;
                if (i82 >= 18) {
                    iArr[i70] = iObjectFieldOffset;
                    i70++;
                }
                iObjectFieldOffset3 = i910;
                i31 = iObjectFieldOffset;
                i11 = i28;
                i41 = i29;
            }
            int i100 = i73 + 1;
            iArr4[i73] = i27;
            int i101 = i73 + 2;
            int i102 = iObjectFieldOffset3;
            iArr4[i100] = ((iCharAt11 & Barcode.FORMAT_UPC_A) != 0 ? 536870912 : 0) | ((iCharAt11 & Barcode.FORMAT_QR_CODE) != 0 ? 268435456 : 0) | ((iCharAt11 & Barcode.FORMAT_PDF417) != 0 ? Integer.MIN_VALUE : 0) | (i82 << 20) | i31;
            i73 += 3;
            iArr4[i101] = (i30 << 20) | i102;
            length = i83;
            iArr3 = iArr4;
            strE = strE;
            c10 = 55296;
        }
        return new u0<>(iArr3, objArr, i12, i16, e1Var.b(), e1Var.c(), false, iArr, i15, i69, w0Var, f0Var, n1Var, pVar, m0Var);
    }

    public static long S(int i10) {
        return i10 & 1048575;
    }

    public static <T> boolean T(T t8, long j10) {
        return ((Boolean) q1.z(t8, j10)).booleanValue();
    }

    public static <T> double U(T t8, long j10) {
        return ((Double) q1.z(t8, j10)).doubleValue();
    }

    public static <T> float V(T t8, long j10) {
        return ((Float) q1.z(t8, j10)).floatValue();
    }

    public static <T> int W(T t8, long j10) {
        return ((Integer) q1.z(t8, j10)).intValue();
    }

    public static <T> long X(T t8, long j10) {
        return ((Long) q1.z(t8, j10)).longValue();
    }

    public static Field e0(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static <T> boolean k(T t8, long j10) {
        return q1.p(t8, j10);
    }

    public static int k0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    public static void l(Object obj) {
        if (C(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    public static <T> double m(T t8, long j10) {
        return q1.u(t8, j10);
    }

    public static <T> float q(T t8, long j10) {
        return q1.v(t8, j10);
    }

    public static <T> int v(T t8, long j10) {
        return q1.w(t8, j10);
    }

    public static boolean w(int i10) {
        return (i10 & 536870912) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean z(Object obj, int i10, g1 g1Var) {
        return g1Var.c(q1.z(obj, S(i10)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <N> boolean A(Object obj, int i10, int i11) {
        List list = (List) q1.z(obj, S(i10));
        if (list.isEmpty()) {
            return true;
        }
        g1 g1VarT = t(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!g1VarT.c(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [androidx.datastore.preferences.protobuf.g1] */
    public final boolean B(T t8, int i10, int i11) {
        Map<?, ?> mapE = this.f2378q.e(q1.z(t8, S(i10)));
        if (mapE.isEmpty()) {
            return true;
        }
        if (this.f2378q.b(s(i11)).f2237c.a() != s1.c.MESSAGE) {
            return true;
        }
        ?? C = 0;
        for (Object obj : mapE.values()) {
            if (C == 0) {
                C = C;
                C = c1.a().c(obj.getClass());
            }
            C = C;
            if (!C.c(obj)) {
                return false;
            }
        }
        return true;
    }

    public final boolean D(T t8, T t10, int i10) {
        long jZ = Z(i10) & 1048575;
        return q1.w(t8, jZ) == q1.w(t10, jZ);
    }

    public final boolean E(T t8, int i10, int i11) {
        return q1.w(t8, (long) (Z(i11) & 1048575)) == i10;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 20401. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final <UT, UB, ET extends androidx.datastore.preferences.protobuf.t.b<ET>> void H(androidx.datastore.preferences.protobuf.n1<UT, UB> r18, androidx.datastore.preferences.protobuf.p<ET> r19, T r20, androidx.datastore.preferences.protobuf.f1 r21, androidx.datastore.preferences.protobuf.o r22) {
        /*
            Method dump skipped, instruction units count: 2040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.u0.H(androidx.datastore.preferences.protobuf.n1, androidx.datastore.preferences.protobuf.p, java.lang.Object, androidx.datastore.preferences.protobuf.f1, androidx.datastore.preferences.protobuf.o):void");
    }

    public final <K, V> void I(Object obj, int i10, Object obj2, o oVar, f1 f1Var) {
        long jS = S(l0(i10));
        Object objZ = q1.z(obj, jS);
        if (objZ == null) {
            objZ = this.f2378q.d(obj2);
            q1.O(obj, jS, objZ);
        } else if (this.f2378q.h(objZ)) {
            Object objD = this.f2378q.d(obj2);
            this.f2378q.a(objD, objZ);
            q1.O(obj, jS, objD);
            objZ = objD;
        }
        f1Var.N(this.f2378q.c(objZ), this.f2378q.b(obj2), oVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void J(T t8, T t10, int i10) {
        if (x(t10, i10)) {
            long jS = S(l0(i10));
            Unsafe unsafe = f2362s;
            Object object = unsafe.getObject(t10, jS);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + R(i10) + " is present but null: " + t10);
            }
            g1 g1VarT = t(i10);
            if (!x(t8, i10)) {
                if (C(object)) {
                    Object objE = g1VarT.e();
                    g1VarT.a(objE, object);
                    unsafe.putObject(t8, jS, objE);
                } else {
                    unsafe.putObject(t8, jS, object);
                }
                f0(t8, i10);
                return;
            }
            Object object2 = unsafe.getObject(t8, jS);
            if (!C(object2)) {
                Object objE2 = g1VarT.e();
                g1VarT.a(objE2, object2);
                unsafe.putObject(t8, jS, objE2);
                object2 = objE2;
            }
            g1VarT.a(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void K(T t8, T t10, int i10) {
        int iR = R(i10);
        if (E(t10, iR, i10)) {
            long jS = S(l0(i10));
            Unsafe unsafe = f2362s;
            Object object = unsafe.getObject(t10, jS);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + R(i10) + " is present but null: " + t10);
            }
            g1 g1VarT = t(i10);
            if (!E(t8, iR, i10)) {
                if (C(object)) {
                    Object objE = g1VarT.e();
                    g1VarT.a(objE, object);
                    unsafe.putObject(t8, jS, objE);
                } else {
                    unsafe.putObject(t8, jS, object);
                }
                g0(t8, iR, i10);
                return;
            }
            Object object2 = unsafe.getObject(t8, jS);
            if (!C(object2)) {
                Object objE2 = g1VarT.e();
                g1VarT.a(objE2, object2);
                unsafe.putObject(t8, jS, objE2);
                object2 = objE2;
            }
            g1VarT.a(object2, object);
        }
    }

    public final void L(T t8, T t10, int i10) {
        int iL0 = l0(i10);
        long jS = S(iL0);
        int iR = R(i10);
        switch (k0(iL0)) {
            case 0:
                if (x(t10, i10)) {
                    q1.K(t8, jS, q1.u(t10, jS));
                    f0(t8, i10);
                }
                break;
            case 1:
                if (x(t10, i10)) {
                    q1.L(t8, jS, q1.v(t10, jS));
                    f0(t8, i10);
                }
                break;
            case 2:
                if (x(t10, i10)) {
                    q1.N(t8, jS, q1.x(t10, jS));
                    f0(t8, i10);
                }
                break;
            case 3:
                if (x(t10, i10)) {
                    q1.N(t8, jS, q1.x(t10, jS));
                    f0(t8, i10);
                }
                break;
            case 4:
                if (x(t10, i10)) {
                    q1.M(t8, jS, q1.w(t10, jS));
                    f0(t8, i10);
                }
                break;
            case 5:
                if (x(t10, i10)) {
                    q1.N(t8, jS, q1.x(t10, jS));
                    f0(t8, i10);
                }
                break;
            case 6:
                if (x(t10, i10)) {
                    q1.M(t8, jS, q1.w(t10, jS));
                    f0(t8, i10);
                }
                break;
            case 7:
                if (x(t10, i10)) {
                    q1.E(t8, jS, q1.p(t10, jS));
                    f0(t8, i10);
                }
                break;
            case 8:
                if (x(t10, i10)) {
                    q1.O(t8, jS, q1.z(t10, jS));
                    f0(t8, i10);
                }
                break;
            case 9:
                J(t8, t10, i10);
                break;
            case 10:
                if (x(t10, i10)) {
                    q1.O(t8, jS, q1.z(t10, jS));
                    f0(t8, i10);
                }
                break;
            case 11:
                if (x(t10, i10)) {
                    q1.M(t8, jS, q1.w(t10, jS));
                    f0(t8, i10);
                }
                break;
            case 12:
                if (x(t10, i10)) {
                    q1.M(t8, jS, q1.w(t10, jS));
                    f0(t8, i10);
                }
                break;
            case 13:
                if (x(t10, i10)) {
                    q1.M(t8, jS, q1.w(t10, jS));
                    f0(t8, i10);
                }
                break;
            case 14:
                if (x(t10, i10)) {
                    q1.N(t8, jS, q1.x(t10, jS));
                    f0(t8, i10);
                }
                break;
            case 15:
                if (x(t10, i10)) {
                    q1.M(t8, jS, q1.w(t10, jS));
                    f0(t8, i10);
                }
                break;
            case 16:
                if (x(t10, i10)) {
                    q1.N(t8, jS, q1.x(t10, jS));
                    f0(t8, i10);
                }
                break;
            case 17:
                J(t8, t10, i10);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f2375n.b(t8, t10, jS);
                break;
            case 50:
                i1.F(this.f2378q, t8, t10, jS);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (E(t10, iR, i10)) {
                    q1.O(t8, jS, q1.z(t10, jS));
                    g0(t8, iR, i10);
                }
                break;
            case 60:
                K(t8, t10, i10);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (E(t10, iR, i10)) {
                    q1.O(t8, jS, q1.z(t10, jS));
                    g0(t8, iR, i10);
                }
                break;
            case 68:
                K(t8, t10, i10);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object M(T t8, int i10) {
        g1 g1VarT = t(i10);
        long jS = S(l0(i10));
        if (!x(t8, i10)) {
            return g1VarT.e();
        }
        Object object = f2362s.getObject(t8, jS);
        if (C(object)) {
            return object;
        }
        Object objE = g1VarT.e();
        if (object != null) {
            g1VarT.a(objE, object);
        }
        return objE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object N(T t8, int i10, int i11) {
        g1 g1VarT = t(i11);
        if (!E(t8, i10, i11)) {
            return g1VarT.e();
        }
        Object object = f2362s.getObject(t8, S(l0(i11)));
        if (C(object)) {
            return object;
        }
        Object objE = g1VarT.e();
        if (object != null) {
            g1VarT.a(objE, object);
        }
        return objE;
    }

    public final int R(int i10) {
        return this.f2363a[i10];
    }

    public final int Y(int i10) {
        if (i10 < this.f2364c || i10 > this.f2365d) {
            return -1;
        }
        return h0(i10, 0);
    }

    public final int Z(int i10) {
        return this.f2363a[i10 + 2];
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public void a(T t8, T t10) {
        l(t8);
        t10.getClass();
        for (int i10 = 0; i10 < this.f2363a.length; i10 += 3) {
            L(t8, t10, i10);
        }
        i1.G(this.f2376o, t8, t10);
        if (this.f2367f) {
            i1.E(this.f2377p, t8, t10);
        }
    }

    public final <E> void a0(Object obj, long j10, f1 f1Var, g1<E> g1Var, o oVar) {
        f1Var.P(this.f2375n.c(obj, j10), g1Var, oVar);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x007d A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.g1
    public void b(T t8) {
        if (C(t8)) {
            if (t8 instanceof x) {
                x xVar = (x) t8;
                xVar.t();
                xVar.s();
                xVar.K();
            }
            int length = this.f2363a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int iL0 = l0(i10);
                long jS = S(iL0);
                int iK0 = k0(iL0);
                if (iK0 != 9) {
                    if (iK0 != 60 && iK0 != 68) {
                        switch (iK0) {
                            case 17:
                                if (x(t8, i10)) {
                                    t(i10).b(f2362s.getObject(t8, jS));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.f2375n.a(t8, jS);
                                break;
                            case 50:
                                Unsafe unsafe = f2362s;
                                Object object = unsafe.getObject(t8, jS);
                                if (object != null) {
                                    unsafe.putObject(t8, jS, this.f2378q.f(object));
                                }
                                break;
                        }
                    } else if (E(t8, R(i10), i10)) {
                        t(i10).b(f2362s.getObject(t8, jS));
                    }
                } else if (x(t8, i10)) {
                    t(i10).b(f2362s.getObject(t8, jS));
                }
            }
            this.f2376o.j(t8);
            if (this.f2367f) {
                this.f2377p.f(t8);
            }
        }
    }

    public final <E> void b0(Object obj, int i10, f1 f1Var, g1<E> g1Var, o oVar) {
        f1Var.K(this.f2375n.c(obj, S(i10)), g1Var, oVar);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0094 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.g1
    public final boolean c(T t8) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.f2372k) {
            int i15 = this.f2371j[i13];
            int iR = R(i15);
            int iL0 = l0(i15);
            int i16 = this.f2363a[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i12) {
                if (i17 != 1048575) {
                    i14 = f2362s.getInt(t8, i17);
                }
                i11 = i14;
                i10 = i17;
            } else {
                i10 = i12;
                i11 = i14;
            }
            T t10 = t8;
            if (F(iL0) && !y(t10, i15, i10, i11, i18)) {
                return false;
            }
            int iK0 = k0(iL0);
            if (iK0 == 9 || iK0 == 17) {
                if (y(t10, i15, i10, i11, i18) && !z(t10, iL0, t(i15))) {
                    return false;
                }
            } else if (iK0 == 27) {
                if (!A(t10, iL0, i15)) {
                    return false;
                }
            } else if (iK0 == 60 || iK0 == 68) {
                if (E(t10, iR, i15) && !z(t10, iL0, t(i15))) {
                    return false;
                }
            } else if (iK0 != 49) {
                if (iK0 == 50 && !B(t10, iL0, i15)) {
                    return false;
                }
            } else if (!A(t10, iL0, i15)) {
                return false;
            }
            i13++;
            t8 = t10;
            i12 = i10;
            i14 = i11;
        }
        return !this.f2367f || this.f2377p.c(t8).p();
    }

    public final void c0(Object obj, int i10, f1 f1Var) {
        if (w(i10)) {
            q1.O(obj, S(i10), f1Var.I());
        } else if (this.f2368g) {
            q1.O(obj, S(i10), f1Var.z());
        } else {
            q1.O(obj, S(i10), f1Var.o());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:247:0x0552 A[PHI: r0 r1
      0x0552: PHI (r0v2 androidx.datastore.preferences.protobuf.u0<T>) = 
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v24 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v30 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
      (r0v1 androidx.datastore.preferences.protobuf.u0<T>)
     binds: [B:22:0x005b, B:245:0x0548, B:215:0x04ab, B:201:0x0462, B:193:0x043b, B:187:0x0414, B:164:0x032b, B:158:0x030d, B:152:0x02ef, B:146:0x02d1, B:140:0x02b3, B:134:0x0295, B:128:0x0277, B:122:0x0259, B:116:0x023b, B:110:0x021e, B:104:0x0201, B:98:0x01e4, B:92:0x01c7, B:85:0x01a5, B:80:0x0171, B:77:0x0165, B:74:0x0155, B:71:0x0145, B:68:0x0135, B:65:0x0129, B:62:0x011d, B:59:0x0110, B:53:0x00f2, B:50:0x00df, B:47:0x00ce, B:44:0x00bf, B:41:0x00b0, B:38:0x00a5, B:35:0x009a, B:32:0x008b, B:29:0x007c, B:25:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0552: PHI (r1v4 T) = 
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v5 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
     binds: [B:22:0x005b, B:245:0x0548, B:215:0x04ab, B:201:0x0462, B:193:0x043b, B:187:0x0414, B:164:0x032b, B:158:0x030d, B:152:0x02ef, B:146:0x02d1, B:140:0x02b3, B:134:0x0295, B:128:0x0277, B:122:0x0259, B:116:0x023b, B:110:0x021e, B:104:0x0201, B:98:0x01e4, B:92:0x01c7, B:85:0x01a5, B:80:0x0171, B:77:0x0165, B:74:0x0155, B:71:0x0145, B:68:0x0135, B:65:0x0129, B:62:0x011d, B:59:0x0110, B:53:0x00f2, B:50:0x00df, B:47:0x00ce, B:44:0x00bf, B:41:0x00b0, B:38:0x00a5, B:35:0x009a, B:32:0x008b, B:29:0x007c, B:25:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.g1
    public int d(T t8) {
        int i10;
        int i11;
        int iQ;
        int iX;
        int i12;
        int iU;
        int iW;
        u0<T> u0Var = this;
        T t10 = t8;
        Unsafe unsafe = f2362s;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1048575;
        while (i14 < u0Var.f2363a.length) {
            int iL0 = u0Var.l0(i14);
            int iK0 = k0(iL0);
            int iR = u0Var.R(i14);
            int i18 = u0Var.f2363a[i14 + 2];
            int i19 = i18 & i13;
            if (iK0 <= 17) {
                if (i19 != i17) {
                    i15 = i19 == i13 ? 0 : unsafe.getInt(t10, i19);
                    i17 = i19;
                }
                i10 = 1 << (i18 >>> 20);
            } else {
                i10 = 0;
            }
            int i20 = i16;
            long jS = S(iL0);
            if (iK0 < u.O.a() || iK0 > u.f2324b0.a()) {
                i19 = 0;
            }
            switch (iK0) {
                case 0:
                    if (!u0Var.y(t10, i14, i17, i15, i10)) {
                        i16 = i20;
                    } else {
                        i11 = j.i(iR, 0.0d);
                        i16 = i20 + i11;
                    }
                    break;
                case 1:
                    if (u0Var.y(t10, i14, i17, i15, i10)) {
                        iQ = j.q(iR, 0.0f);
                        i16 = i20 + iQ;
                        u0Var = this;
                        t10 = t8;
                    }
                    u0Var = this;
                    t10 = t8;
                    i16 = i20;
                    break;
                case 2:
                    if (u0Var.y(t10, i14, i17, i15, i10)) {
                        iX = j.x(iR, unsafe.getLong(t10, jS));
                        i16 = i20 + iX;
                        u0Var = this;
                    }
                    u0Var = this;
                    i16 = i20;
                    break;
                case 3:
                    if (u0Var.y(t10, i14, i17, i15, i10)) {
                        iX = j.X(iR, unsafe.getLong(t10, jS));
                        i16 = i20 + iX;
                        u0Var = this;
                    }
                    u0Var = this;
                    i16 = i20;
                    break;
                case 4:
                    if (u0Var.y(t10, i14, i17, i15, i10)) {
                        iX = j.v(iR, unsafe.getInt(t10, jS));
                        i16 = i20 + iX;
                        u0Var = this;
                    }
                    u0Var = this;
                    i16 = i20;
                    break;
                case 5:
                    if (u0Var.y(t10, i14, i17, i15, i10)) {
                        iQ = j.o(iR, 0L);
                        i16 = i20 + iQ;
                        u0Var = this;
                        t10 = t8;
                    }
                    u0Var = this;
                    t10 = t8;
                    i16 = i20;
                    break;
                case 6:
                    if (u0Var.y(t10, i14, i17, i15, i10)) {
                        iQ = j.m(iR, 0);
                        i16 = i20 + iQ;
                        u0Var = this;
                        t10 = t8;
                    }
                    u0Var = this;
                    t10 = t8;
                    i16 = i20;
                    break;
                case 7:
                    if (u0Var.y(t10, i14, i17, i15, i10)) {
                        iQ = j.d(iR, true);
                        i16 = i20 + iQ;
                        u0Var = this;
                        t10 = t8;
                    }
                    u0Var = this;
                    t10 = t8;
                    i16 = i20;
                    break;
                case 8:
                    if (u0Var.y(t10, i14, i17, i15, i10)) {
                        Object object = unsafe.getObject(t10, jS);
                        iX = object instanceof g ? j.g(iR, (g) object) : j.S(iR, (String) object);
                        i16 = i20 + iX;
                        u0Var = this;
                    }
                    u0Var = this;
                    i16 = i20;
                    break;
                case 9:
                    if (!u0Var.y(t10, i14, i17, i15, i10)) {
                        i16 = i20;
                    } else {
                        i11 = i1.o(iR, unsafe.getObject(t10, jS), u0Var.t(i14));
                        i16 = i20 + i11;
                    }
                    break;
                case 10:
                    if (u0Var.y(t10, i14, i17, i15, i10)) {
                        iX = j.g(iR, (g) unsafe.getObject(t10, jS));
                        i16 = i20 + iX;
                        u0Var = this;
                    }
                    u0Var = this;
                    i16 = i20;
                    break;
                case 11:
                    if (u0Var.y(t10, i14, i17, i15, i10)) {
                        iX = j.V(iR, unsafe.getInt(t10, jS));
                        i16 = i20 + iX;
                        u0Var = this;
                    }
                    u0Var = this;
                    i16 = i20;
                    break;
                case 12:
                    if (u0Var.y(t10, i14, i17, i15, i10)) {
                        iX = j.k(iR, unsafe.getInt(t10, jS));
                        i16 = i20 + iX;
                        u0Var = this;
                    }
                    u0Var = this;
                    i16 = i20;
                    break;
                case 13:
                    if (u0Var.y(t10, i14, i17, i15, i10)) {
                        iQ = j.K(iR, 0);
                        i16 = i20 + iQ;
                        u0Var = this;
                        t10 = t8;
                    }
                    u0Var = this;
                    t10 = t8;
                    i16 = i20;
                    break;
                case 14:
                    if (u0Var.y(t10, i14, i17, i15, i10)) {
                        iQ = j.M(iR, 0L);
                        i16 = i20 + iQ;
                        u0Var = this;
                        t10 = t8;
                    }
                    u0Var = this;
                    t10 = t8;
                    i16 = i20;
                    break;
                case 15:
                    if (u0Var.y(t10, i14, i17, i15, i10)) {
                        iX = j.O(iR, unsafe.getInt(t10, jS));
                        i16 = i20 + iX;
                        u0Var = this;
                    }
                    u0Var = this;
                    i16 = i20;
                    break;
                case 16:
                    if (u0Var.y(t10, i14, i17, i15, i10)) {
                        iX = j.Q(iR, unsafe.getLong(t10, jS));
                        i16 = i20 + iX;
                        u0Var = this;
                    }
                    u0Var = this;
                    i16 = i20;
                    break;
                case 17:
                    if (!u0Var.y(t10, i14, i17, i15, i10)) {
                        i16 = i20;
                    } else {
                        i11 = j.s(iR, (r0) unsafe.getObject(t10, jS), u0Var.t(i14));
                        i16 = i20 + i11;
                    }
                    break;
                case 18:
                    i11 = i1.h(iR, (List) unsafe.getObject(t10, jS), false);
                    i16 = i20 + i11;
                    break;
                case 19:
                    i11 = i1.f(iR, (List) unsafe.getObject(t10, jS), false);
                    i16 = i20 + i11;
                    break;
                case 20:
                    i11 = i1.m(iR, (List) unsafe.getObject(t10, jS), false);
                    i16 = i20 + i11;
                    break;
                case 21:
                    i11 = i1.x(iR, (List) unsafe.getObject(t10, jS), false);
                    i16 = i20 + i11;
                    break;
                case 22:
                    i11 = i1.k(iR, (List) unsafe.getObject(t10, jS), false);
                    i16 = i20 + i11;
                    break;
                case 23:
                    i11 = i1.h(iR, (List) unsafe.getObject(t10, jS), false);
                    i16 = i20 + i11;
                    break;
                case 24:
                    i11 = i1.f(iR, (List) unsafe.getObject(t10, jS), false);
                    i16 = i20 + i11;
                    break;
                case 25:
                    i11 = i1.a(iR, (List) unsafe.getObject(t10, jS), false);
                    i16 = i20 + i11;
                    break;
                case 26:
                    i11 = i1.u(iR, (List) unsafe.getObject(t10, jS));
                    i16 = i20 + i11;
                    break;
                case 27:
                    i11 = i1.p(iR, (List) unsafe.getObject(t10, jS), u0Var.t(i14));
                    i16 = i20 + i11;
                    break;
                case 28:
                    i11 = i1.c(iR, (List) unsafe.getObject(t10, jS));
                    i16 = i20 + i11;
                    break;
                case 29:
                    i11 = i1.v(iR, (List) unsafe.getObject(t10, jS), false);
                    i16 = i20 + i11;
                    break;
                case 30:
                    i11 = i1.d(iR, (List) unsafe.getObject(t10, jS), false);
                    i16 = i20 + i11;
                    break;
                case 31:
                    i11 = i1.f(iR, (List) unsafe.getObject(t10, jS), false);
                    i16 = i20 + i11;
                    break;
                case 32:
                    i11 = i1.h(iR, (List) unsafe.getObject(t10, jS), false);
                    i16 = i20 + i11;
                    break;
                case 33:
                    i11 = i1.q(iR, (List) unsafe.getObject(t10, jS), false);
                    i16 = i20 + i11;
                    break;
                case 34:
                    i11 = i1.s(iR, (List) unsafe.getObject(t10, jS), false);
                    i16 = i20 + i11;
                    break;
                case 35:
                    i12 = i1.i((List) unsafe.getObject(t10, jS));
                    if (i12 <= 0) {
                        i16 = i20;
                    } else {
                        if (u0Var.f2370i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        iU = j.U(iR);
                        iW = j.W(i12);
                        i16 = i20 + iU + iW + i12;
                    }
                    break;
                case 36:
                    i12 = i1.g((List) unsafe.getObject(t10, jS));
                    if (i12 <= 0) {
                        i16 = i20;
                    } else {
                        if (u0Var.f2370i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        iU = j.U(iR);
                        iW = j.W(i12);
                        i16 = i20 + iU + iW + i12;
                    }
                    break;
                case 37:
                    i12 = i1.n((List) unsafe.getObject(t10, jS));
                    if (i12 <= 0) {
                        i16 = i20;
                    } else {
                        if (u0Var.f2370i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        iU = j.U(iR);
                        iW = j.W(i12);
                        i16 = i20 + iU + iW + i12;
                    }
                    break;
                case 38:
                    i12 = i1.y((List) unsafe.getObject(t10, jS));
                    if (i12 <= 0) {
                        i16 = i20;
                    } else {
                        if (u0Var.f2370i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        iU = j.U(iR);
                        iW = j.W(i12);
                        i16 = i20 + iU + iW + i12;
                    }
                    break;
                case 39:
                    i12 = i1.l((List) unsafe.getObject(t10, jS));
                    if (i12 <= 0) {
                        i16 = i20;
                    } else {
                        if (u0Var.f2370i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        iU = j.U(iR);
                        iW = j.W(i12);
                        i16 = i20 + iU + iW + i12;
                    }
                    break;
                case 40:
                    i12 = i1.i((List) unsafe.getObject(t10, jS));
                    if (i12 <= 0) {
                        i16 = i20;
                    } else {
                        if (u0Var.f2370i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        iU = j.U(iR);
                        iW = j.W(i12);
                        i16 = i20 + iU + iW + i12;
                    }
                    break;
                case 41:
                    i12 = i1.g((List) unsafe.getObject(t10, jS));
                    if (i12 <= 0) {
                        i16 = i20;
                    } else {
                        if (u0Var.f2370i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        iU = j.U(iR);
                        iW = j.W(i12);
                        i16 = i20 + iU + iW + i12;
                    }
                    break;
                case 42:
                    i12 = i1.b((List) unsafe.getObject(t10, jS));
                    if (i12 <= 0) {
                        i16 = i20;
                    } else {
                        if (u0Var.f2370i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        iU = j.U(iR);
                        iW = j.W(i12);
                        i16 = i20 + iU + iW + i12;
                    }
                    break;
                case 43:
                    i12 = i1.w((List) unsafe.getObject(t10, jS));
                    if (i12 <= 0) {
                        i16 = i20;
                    } else {
                        if (u0Var.f2370i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        iU = j.U(iR);
                        iW = j.W(i12);
                        i16 = i20 + iU + iW + i12;
                    }
                    break;
                case 44:
                    i12 = i1.e((List) unsafe.getObject(t10, jS));
                    if (i12 <= 0) {
                        i16 = i20;
                    } else {
                        if (u0Var.f2370i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        iU = j.U(iR);
                        iW = j.W(i12);
                        i16 = i20 + iU + iW + i12;
                    }
                    break;
                case 45:
                    i12 = i1.g((List) unsafe.getObject(t10, jS));
                    if (i12 <= 0) {
                        i16 = i20;
                    } else {
                        if (u0Var.f2370i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        iU = j.U(iR);
                        iW = j.W(i12);
                        i16 = i20 + iU + iW + i12;
                    }
                    break;
                case 46:
                    i12 = i1.i((List) unsafe.getObject(t10, jS));
                    if (i12 <= 0) {
                        i16 = i20;
                    } else {
                        if (u0Var.f2370i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        iU = j.U(iR);
                        iW = j.W(i12);
                        i16 = i20 + iU + iW + i12;
                    }
                    break;
                case 47:
                    i12 = i1.r((List) unsafe.getObject(t10, jS));
                    if (i12 <= 0) {
                        i16 = i20;
                    } else {
                        if (u0Var.f2370i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        iU = j.U(iR);
                        iW = j.W(i12);
                        i16 = i20 + iU + iW + i12;
                    }
                    break;
                case 48:
                    i12 = i1.t((List) unsafe.getObject(t10, jS));
                    if (i12 <= 0) {
                        i16 = i20;
                    } else {
                        if (u0Var.f2370i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        iU = j.U(iR);
                        iW = j.W(i12);
                        i16 = i20 + iU + iW + i12;
                    }
                    break;
                case 49:
                    i11 = i1.j(iR, (List) unsafe.getObject(t10, jS), u0Var.t(i14));
                    i16 = i20 + i11;
                    break;
                case 50:
                    i11 = u0Var.f2378q.g(iR, unsafe.getObject(t10, jS), u0Var.s(i14));
                    i16 = i20 + i11;
                    break;
                case 51:
                    if (!u0Var.E(t10, iR, i14)) {
                        i16 = i20;
                    } else {
                        i11 = j.i(iR, 0.0d);
                        i16 = i20 + i11;
                    }
                    break;
                case 52:
                    if (!u0Var.E(t10, iR, i14)) {
                        i16 = i20;
                    } else {
                        i11 = j.q(iR, 0.0f);
                        i16 = i20 + i11;
                    }
                    break;
                case 53:
                    if (!u0Var.E(t10, iR, i14)) {
                        i16 = i20;
                    } else {
                        i11 = j.x(iR, X(t10, jS));
                        i16 = i20 + i11;
                    }
                    break;
                case 54:
                    if (!u0Var.E(t10, iR, i14)) {
                        i16 = i20;
                    } else {
                        i11 = j.X(iR, X(t10, jS));
                        i16 = i20 + i11;
                    }
                    break;
                case 55:
                    if (!u0Var.E(t10, iR, i14)) {
                        i16 = i20;
                    } else {
                        i11 = j.v(iR, W(t10, jS));
                        i16 = i20 + i11;
                    }
                    break;
                case 56:
                    if (!u0Var.E(t10, iR, i14)) {
                        i16 = i20;
                    } else {
                        i11 = j.o(iR, 0L);
                        i16 = i20 + i11;
                    }
                    break;
                case 57:
                    if (!u0Var.E(t10, iR, i14)) {
                        i16 = i20;
                    } else {
                        i11 = j.m(iR, 0);
                        i16 = i20 + i11;
                    }
                    break;
                case 58:
                    if (!u0Var.E(t10, iR, i14)) {
                        i16 = i20;
                    } else {
                        i11 = j.d(iR, true);
                        i16 = i20 + i11;
                    }
                    break;
                case 59:
                    if (!u0Var.E(t10, iR, i14)) {
                        i16 = i20;
                    } else {
                        Object object2 = unsafe.getObject(t10, jS);
                        i11 = object2 instanceof g ? j.g(iR, (g) object2) : j.S(iR, (String) object2);
                        i16 = i20 + i11;
                    }
                    break;
                case 60:
                    if (!u0Var.E(t10, iR, i14)) {
                        i16 = i20;
                    } else {
                        i11 = i1.o(iR, unsafe.getObject(t10, jS), u0Var.t(i14));
                        i16 = i20 + i11;
                    }
                    break;
                case 61:
                    if (!u0Var.E(t10, iR, i14)) {
                        i16 = i20;
                    } else {
                        i11 = j.g(iR, (g) unsafe.getObject(t10, jS));
                        i16 = i20 + i11;
                    }
                    break;
                case 62:
                    if (!u0Var.E(t10, iR, i14)) {
                        i16 = i20;
                    } else {
                        i11 = j.V(iR, W(t10, jS));
                        i16 = i20 + i11;
                    }
                    break;
                case 63:
                    if (!u0Var.E(t10, iR, i14)) {
                        i16 = i20;
                    } else {
                        i11 = j.k(iR, W(t10, jS));
                        i16 = i20 + i11;
                    }
                    break;
                case 64:
                    if (!u0Var.E(t10, iR, i14)) {
                        i16 = i20;
                    } else {
                        i11 = j.K(iR, 0);
                        i16 = i20 + i11;
                    }
                    break;
                case 65:
                    if (!u0Var.E(t10, iR, i14)) {
                        i16 = i20;
                    } else {
                        i11 = j.M(iR, 0L);
                        i16 = i20 + i11;
                    }
                    break;
                case 66:
                    if (!u0Var.E(t10, iR, i14)) {
                        i16 = i20;
                    } else {
                        i11 = j.O(iR, W(t10, jS));
                        i16 = i20 + i11;
                    }
                    break;
                case 67:
                    if (!u0Var.E(t10, iR, i14)) {
                        i16 = i20;
                    } else {
                        i11 = j.Q(iR, X(t10, jS));
                        i16 = i20 + i11;
                    }
                    break;
                case 68:
                    if (!u0Var.E(t10, iR, i14)) {
                        i16 = i20;
                    } else {
                        i11 = j.s(iR, (r0) unsafe.getObject(t10, jS), u0Var.t(i14));
                        i16 = i20 + i11;
                    }
                    break;
                default:
                    i16 = i20;
                    break;
            }
            i14 += 3;
            i13 = 1048575;
        }
        int iU2 = i16 + u0Var.u(u0Var.f2376o, t10);
        return u0Var.f2367f ? iU2 + u0Var.f2377p.c(t10).l() : iU2;
    }

    public final void d0(Object obj, int i10, f1 f1Var) {
        if (w(i10)) {
            f1Var.n(this.f2375n.c(obj, S(i10)));
        } else {
            f1Var.B(this.f2375n.c(obj, S(i10)));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public T e() {
        return (T) this.f2374m.a(this.f2366e);
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public int f(T t8) {
        int i10;
        int iF;
        int length = this.f2363a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iL0 = l0(i12);
            int iR = R(i12);
            long jS = S(iL0);
            int iHashCode = 37;
            switch (k0(iL0)) {
                case 0:
                    i10 = i11 * 53;
                    iF = z.f(Double.doubleToLongBits(q1.u(t8, jS)));
                    i11 = i10 + iF;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iF = Float.floatToIntBits(q1.v(t8, jS));
                    i11 = i10 + iF;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iF = z.f(q1.x(t8, jS));
                    i11 = i10 + iF;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iF = z.f(q1.x(t8, jS));
                    i11 = i10 + iF;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iF = q1.w(t8, jS);
                    i11 = i10 + iF;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iF = z.f(q1.x(t8, jS));
                    i11 = i10 + iF;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iF = q1.w(t8, jS);
                    i11 = i10 + iF;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iF = z.c(q1.p(t8, jS));
                    i11 = i10 + iF;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iF = ((String) q1.z(t8, jS)).hashCode();
                    i11 = i10 + iF;
                    break;
                case 9:
                    Object objZ = q1.z(t8, jS);
                    if (objZ != null) {
                        iHashCode = objZ.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iF = q1.z(t8, jS).hashCode();
                    i11 = i10 + iF;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iF = q1.w(t8, jS);
                    i11 = i10 + iF;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iF = q1.w(t8, jS);
                    i11 = i10 + iF;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iF = q1.w(t8, jS);
                    i11 = i10 + iF;
                    break;
                case 14:
                    i10 = i11 * 53;
                    iF = z.f(q1.x(t8, jS));
                    i11 = i10 + iF;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iF = q1.w(t8, jS);
                    i11 = i10 + iF;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iF = z.f(q1.x(t8, jS));
                    i11 = i10 + iF;
                    break;
                case 17:
                    Object objZ2 = q1.z(t8, jS);
                    if (objZ2 != null) {
                        iHashCode = objZ2.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i11 * 53;
                    iF = q1.z(t8, jS).hashCode();
                    i11 = i10 + iF;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iF = q1.z(t8, jS).hashCode();
                    i11 = i10 + iF;
                    break;
                case 51:
                    if (E(t8, iR, i12)) {
                        i10 = i11 * 53;
                        iF = z.f(Double.doubleToLongBits(U(t8, jS)));
                        i11 = i10 + iF;
                    }
                    break;
                case 52:
                    if (E(t8, iR, i12)) {
                        i10 = i11 * 53;
                        iF = Float.floatToIntBits(V(t8, jS));
                        i11 = i10 + iF;
                    }
                    break;
                case 53:
                    if (E(t8, iR, i12)) {
                        i10 = i11 * 53;
                        iF = z.f(X(t8, jS));
                        i11 = i10 + iF;
                    }
                    break;
                case 54:
                    if (E(t8, iR, i12)) {
                        i10 = i11 * 53;
                        iF = z.f(X(t8, jS));
                        i11 = i10 + iF;
                    }
                    break;
                case 55:
                    if (E(t8, iR, i12)) {
                        i10 = i11 * 53;
                        iF = W(t8, jS);
                        i11 = i10 + iF;
                    }
                    break;
                case 56:
                    if (E(t8, iR, i12)) {
                        i10 = i11 * 53;
                        iF = z.f(X(t8, jS));
                        i11 = i10 + iF;
                    }
                    break;
                case 57:
                    if (E(t8, iR, i12)) {
                        i10 = i11 * 53;
                        iF = W(t8, jS);
                        i11 = i10 + iF;
                    }
                    break;
                case 58:
                    if (E(t8, iR, i12)) {
                        i10 = i11 * 53;
                        iF = z.c(T(t8, jS));
                        i11 = i10 + iF;
                    }
                    break;
                case 59:
                    if (E(t8, iR, i12)) {
                        i10 = i11 * 53;
                        iF = ((String) q1.z(t8, jS)).hashCode();
                        i11 = i10 + iF;
                    }
                    break;
                case 60:
                    if (E(t8, iR, i12)) {
                        i10 = i11 * 53;
                        iF = q1.z(t8, jS).hashCode();
                        i11 = i10 + iF;
                    }
                    break;
                case 61:
                    if (E(t8, iR, i12)) {
                        i10 = i11 * 53;
                        iF = q1.z(t8, jS).hashCode();
                        i11 = i10 + iF;
                    }
                    break;
                case 62:
                    if (E(t8, iR, i12)) {
                        i10 = i11 * 53;
                        iF = W(t8, jS);
                        i11 = i10 + iF;
                    }
                    break;
                case 63:
                    if (E(t8, iR, i12)) {
                        i10 = i11 * 53;
                        iF = W(t8, jS);
                        i11 = i10 + iF;
                    }
                    break;
                case 64:
                    if (E(t8, iR, i12)) {
                        i10 = i11 * 53;
                        iF = W(t8, jS);
                        i11 = i10 + iF;
                    }
                    break;
                case 65:
                    if (E(t8, iR, i12)) {
                        i10 = i11 * 53;
                        iF = z.f(X(t8, jS));
                        i11 = i10 + iF;
                    }
                    break;
                case 66:
                    if (E(t8, iR, i12)) {
                        i10 = i11 * 53;
                        iF = W(t8, jS);
                        i11 = i10 + iF;
                    }
                    break;
                case 67:
                    if (E(t8, iR, i12)) {
                        i10 = i11 * 53;
                        iF = z.f(X(t8, jS));
                        i11 = i10 + iF;
                    }
                    break;
                case 68:
                    if (E(t8, iR, i12)) {
                        i10 = i11 * 53;
                        iF = q1.z(t8, jS).hashCode();
                        i11 = i10 + iF;
                    }
                    break;
            }
        }
        int iHashCode2 = (i11 * 53) + this.f2376o.g(t8).hashCode();
        return this.f2367f ? (iHashCode2 * 53) + this.f2377p.c(t8).hashCode() : iHashCode2;
    }

    public final void f0(T t8, int i10) {
        int iZ = Z(i10);
        long j10 = 1048575 & iZ;
        if (j10 == 1048575) {
            return;
        }
        q1.M(t8, j10, (1 << (iZ >>> 20)) | q1.w(t8, j10));
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public boolean g(T t8, T t10) {
        int length = this.f2363a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!n(t8, t10, i10)) {
                return false;
            }
        }
        if (!this.f2376o.g(t8).equals(this.f2376o.g(t10))) {
            return false;
        }
        if (this.f2367f) {
            return this.f2377p.c(t8).equals(this.f2377p.c(t10));
        }
        return true;
    }

    public final void g0(T t8, int i10, int i11) {
        q1.M(t8, Z(i11) & 1048575, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public void h(T t8, f1 f1Var, o oVar) {
        oVar.getClass();
        l(t8);
        H(this.f2376o, this.f2377p, t8, f1Var, oVar);
    }

    public final int h0(int i10, int i11) {
        int length = (this.f2363a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int iR = R(i13);
            if (i10 == iR) {
                return i13;
            }
            if (i10 < iR) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public void i(T t8, t1 t1Var) {
        if (t1Var.t() == t1.a.DESCENDING) {
            n0(t8, t1Var);
        } else {
            m0(t8, t1Var);
        }
    }

    public final void i0(T t8, int i10, Object obj) {
        f2362s.putObject(t8, S(l0(i10)), obj);
        f0(t8, i10);
    }

    public final boolean j(T t8, T t10, int i10) {
        return x(t8, i10) == x(t10, i10);
    }

    public final void j0(T t8, int i10, int i11, Object obj) {
        f2362s.putObject(t8, S(l0(i11)), obj);
        g0(t8, i10, i11);
    }

    public final int l0(int i10) {
        return this.f2363a[i10 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    public final void m0(T t8, t1 t1Var) {
        Map.Entry<?, ?> entry;
        Iterator it;
        boolean z10;
        int i10;
        int i11;
        int i12;
        boolean z11;
        u0<T> u0Var = this;
        if (u0Var.f2367f) {
            t<T> tVarC = u0Var.f2377p.c(t8);
            if (tVarC.n()) {
                entry = null;
                it = null;
            } else {
                Iterator itT = tVarC.t();
                entry = (Map.Entry) itT.next();
                it = itT;
            }
        } else {
            entry = null;
            it = null;
        }
        int length = u0Var.f2363a.length;
        Unsafe unsafe = f2362s;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length) {
            int iL0 = u0Var.l0(i14);
            int iR = u0Var.R(i14);
            int iK0 = k0(iL0);
            if (iK0 <= 17) {
                int i16 = u0Var.f2363a[i14 + 2];
                z10 = true;
                int i17 = i16 & 1048575;
                if (i17 != i13) {
                    i15 = i17 == 1048575 ? 0 : unsafe.getInt(t8, i17);
                    i13 = i17;
                }
                i10 = i13;
                i11 = i15;
                i12 = 1 << (i16 >>> 20);
            } else {
                z10 = true;
                i10 = i13;
                i11 = i15;
                i12 = 0;
            }
            while (entry != null && u0Var.f2377p.a(entry) <= iR) {
                u0Var.f2377p.j(t1Var, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long jS = S(iL0);
            switch (iK0) {
                case 0:
                    if (u0Var.y(t8, i14, i10, i11, i12)) {
                        t1Var.p(iR, m(t8, jS));
                    }
                    break;
                case 1:
                    if (u0Var.y(t8, i14, i10, i11, i12)) {
                        t1Var.B(iR, q(t8, jS));
                    }
                    u0Var = this;
                    break;
                case 2:
                    if (u0Var.y(t8, i14, i10, i11, i12)) {
                        t1Var.u(iR, unsafe.getLong(t8, jS));
                    }
                    u0Var = this;
                    break;
                case 3:
                    if (u0Var.y(t8, i14, i10, i11, i12)) {
                        t1Var.f(iR, unsafe.getLong(t8, jS));
                    }
                    u0Var = this;
                    break;
                case 4:
                    if (u0Var.y(t8, i14, i10, i11, i12)) {
                        t1Var.h(iR, unsafe.getInt(t8, jS));
                    }
                    u0Var = this;
                    break;
                case 5:
                    if (u0Var.y(t8, i14, i10, i11, i12)) {
                        t1Var.s(iR, unsafe.getLong(t8, jS));
                    }
                    u0Var = this;
                    break;
                case 6:
                    if (u0Var.y(t8, i14, i10, i11, i12)) {
                        t1Var.c(iR, unsafe.getInt(t8, jS));
                    }
                    u0Var = this;
                    break;
                case 7:
                    if (u0Var.y(t8, i14, i10, i11, i12)) {
                        t1Var.v(iR, k(t8, jS));
                    }
                    u0Var = this;
                    break;
                case 8:
                    if (u0Var.y(t8, i14, i10, i11, i12)) {
                        u0Var.p0(iR, unsafe.getObject(t8, jS), t1Var);
                    }
                    break;
                case 9:
                    if (u0Var.y(t8, i14, i10, i11, i12)) {
                        t1Var.L(iR, unsafe.getObject(t8, jS), u0Var.t(i14));
                    }
                    break;
                case 10:
                    if (u0Var.y(t8, i14, i10, i11, i12)) {
                        t1Var.K(iR, (g) unsafe.getObject(t8, jS));
                    }
                    u0Var = this;
                    break;
                case 11:
                    if (u0Var.y(t8, i14, i10, i11, i12)) {
                        t1Var.o(iR, unsafe.getInt(t8, jS));
                    }
                    u0Var = this;
                    break;
                case 12:
                    if (u0Var.y(t8, i14, i10, i11, i12)) {
                        t1Var.E(iR, unsafe.getInt(t8, jS));
                    }
                    u0Var = this;
                    break;
                case 13:
                    if (u0Var.y(t8, i14, i10, i11, i12)) {
                        t1Var.w(iR, unsafe.getInt(t8, jS));
                    }
                    u0Var = this;
                    break;
                case 14:
                    if (u0Var.y(t8, i14, i10, i11, i12)) {
                        t1Var.i(iR, unsafe.getLong(t8, jS));
                    }
                    u0Var = this;
                    break;
                case 15:
                    if (u0Var.y(t8, i14, i10, i11, i12)) {
                        t1Var.H(iR, unsafe.getInt(t8, jS));
                    }
                    u0Var = this;
                    break;
                case 16:
                    if (u0Var.y(t8, i14, i10, i11, i12)) {
                        t1Var.m(iR, unsafe.getLong(t8, jS));
                    }
                    u0Var = this;
                    break;
                case 17:
                    if (u0Var.y(t8, i14, i10, i11, i12)) {
                        t1Var.N(iR, unsafe.getObject(t8, jS), u0Var.t(i14));
                    }
                    break;
                case 18:
                    i1.O(u0Var.R(i14), (List) unsafe.getObject(t8, jS), t1Var, false);
                    break;
                case 19:
                    i1.S(u0Var.R(i14), (List) unsafe.getObject(t8, jS), t1Var, false);
                    break;
                case 20:
                    i1.V(u0Var.R(i14), (List) unsafe.getObject(t8, jS), t1Var, false);
                    break;
                case 21:
                    i1.d0(u0Var.R(i14), (List) unsafe.getObject(t8, jS), t1Var, false);
                    break;
                case 22:
                    i1.U(u0Var.R(i14), (List) unsafe.getObject(t8, jS), t1Var, false);
                    break;
                case 23:
                    i1.R(u0Var.R(i14), (List) unsafe.getObject(t8, jS), t1Var, false);
                    break;
                case 24:
                    i1.Q(u0Var.R(i14), (List) unsafe.getObject(t8, jS), t1Var, false);
                    break;
                case 25:
                    i1.M(u0Var.R(i14), (List) unsafe.getObject(t8, jS), t1Var, false);
                    break;
                case 26:
                    i1.b0(u0Var.R(i14), (List) unsafe.getObject(t8, jS), t1Var);
                    break;
                case 27:
                    i1.W(u0Var.R(i14), (List) unsafe.getObject(t8, jS), t1Var, u0Var.t(i14));
                    break;
                case 28:
                    i1.N(u0Var.R(i14), (List) unsafe.getObject(t8, jS), t1Var);
                    break;
                case 29:
                    z11 = false;
                    i1.c0(u0Var.R(i14), (List) unsafe.getObject(t8, jS), t1Var, false);
                    break;
                case 30:
                    z11 = false;
                    i1.P(u0Var.R(i14), (List) unsafe.getObject(t8, jS), t1Var, false);
                    break;
                case 31:
                    z11 = false;
                    i1.X(u0Var.R(i14), (List) unsafe.getObject(t8, jS), t1Var, false);
                    break;
                case 32:
                    z11 = false;
                    i1.Y(u0Var.R(i14), (List) unsafe.getObject(t8, jS), t1Var, false);
                    break;
                case 33:
                    z11 = false;
                    i1.Z(u0Var.R(i14), (List) unsafe.getObject(t8, jS), t1Var, false);
                    break;
                case 34:
                    z11 = false;
                    i1.a0(u0Var.R(i14), (List) unsafe.getObject(t8, jS), t1Var, false);
                    break;
                case 35:
                    i1.O(u0Var.R(i14), (List) unsafe.getObject(t8, jS), t1Var, z10);
                    break;
                case 36:
                    i1.S(u0Var.R(i14), (List) unsafe.getObject(t8, jS), t1Var, z10);
                    break;
                case 37:
                    i1.V(u0Var.R(i14), (List) unsafe.getObject(t8, jS), t1Var, z10);
                    break;
                case 38:
                    i1.d0(u0Var.R(i14), (List) unsafe.getObject(t8, jS), t1Var, z10);
                    break;
                case 39:
                    i1.U(u0Var.R(i14), (List) unsafe.getObject(t8, jS), t1Var, z10);
                    break;
                case 40:
                    i1.R(u0Var.R(i14), (List) unsafe.getObject(t8, jS), t1Var, z10);
                    break;
                case 41:
                    i1.Q(u0Var.R(i14), (List) unsafe.getObject(t8, jS), t1Var, z10);
                    break;
                case 42:
                    i1.M(u0Var.R(i14), (List) unsafe.getObject(t8, jS), t1Var, z10);
                    break;
                case 43:
                    i1.c0(u0Var.R(i14), (List) unsafe.getObject(t8, jS), t1Var, z10);
                    break;
                case 44:
                    i1.P(u0Var.R(i14), (List) unsafe.getObject(t8, jS), t1Var, z10);
                    break;
                case 45:
                    i1.X(u0Var.R(i14), (List) unsafe.getObject(t8, jS), t1Var, z10);
                    break;
                case 46:
                    i1.Y(u0Var.R(i14), (List) unsafe.getObject(t8, jS), t1Var, z10);
                    break;
                case 47:
                    i1.Z(u0Var.R(i14), (List) unsafe.getObject(t8, jS), t1Var, z10);
                    break;
                case 48:
                    i1.a0(u0Var.R(i14), (List) unsafe.getObject(t8, jS), t1Var, z10);
                    break;
                case 49:
                    i1.T(u0Var.R(i14), (List) unsafe.getObject(t8, jS), t1Var, u0Var.t(i14));
                    break;
                case 50:
                    u0Var.o0(t1Var, iR, unsafe.getObject(t8, jS), i14);
                    break;
                case 51:
                    if (u0Var.E(t8, iR, i14)) {
                        t1Var.p(iR, U(t8, jS));
                    }
                    break;
                case 52:
                    if (u0Var.E(t8, iR, i14)) {
                        t1Var.B(iR, V(t8, jS));
                    }
                    break;
                case 53:
                    if (u0Var.E(t8, iR, i14)) {
                        t1Var.u(iR, X(t8, jS));
                    }
                    break;
                case 54:
                    if (u0Var.E(t8, iR, i14)) {
                        t1Var.f(iR, X(t8, jS));
                    }
                    break;
                case 55:
                    if (u0Var.E(t8, iR, i14)) {
                        t1Var.h(iR, W(t8, jS));
                    }
                    break;
                case 56:
                    if (u0Var.E(t8, iR, i14)) {
                        t1Var.s(iR, X(t8, jS));
                    }
                    break;
                case 57:
                    if (u0Var.E(t8, iR, i14)) {
                        t1Var.c(iR, W(t8, jS));
                    }
                    break;
                case 58:
                    if (u0Var.E(t8, iR, i14)) {
                        t1Var.v(iR, T(t8, jS));
                    }
                    break;
                case 59:
                    if (u0Var.E(t8, iR, i14)) {
                        u0Var.p0(iR, unsafe.getObject(t8, jS), t1Var);
                    }
                    break;
                case 60:
                    if (u0Var.E(t8, iR, i14)) {
                        t1Var.L(iR, unsafe.getObject(t8, jS), u0Var.t(i14));
                    }
                    break;
                case 61:
                    if (u0Var.E(t8, iR, i14)) {
                        t1Var.K(iR, (g) unsafe.getObject(t8, jS));
                    }
                    break;
                case 62:
                    if (u0Var.E(t8, iR, i14)) {
                        t1Var.o(iR, W(t8, jS));
                    }
                    break;
                case 63:
                    if (u0Var.E(t8, iR, i14)) {
                        t1Var.E(iR, W(t8, jS));
                    }
                    break;
                case 64:
                    if (u0Var.E(t8, iR, i14)) {
                        t1Var.w(iR, W(t8, jS));
                    }
                    break;
                case 65:
                    if (u0Var.E(t8, iR, i14)) {
                        t1Var.i(iR, X(t8, jS));
                    }
                    break;
                case 66:
                    if (u0Var.E(t8, iR, i14)) {
                        t1Var.H(iR, W(t8, jS));
                    }
                    break;
                case 67:
                    if (u0Var.E(t8, iR, i14)) {
                        t1Var.m(iR, X(t8, jS));
                    }
                    break;
                case 68:
                    if (u0Var.E(t8, iR, i14)) {
                        t1Var.N(iR, unsafe.getObject(t8, jS), u0Var.t(i14));
                    }
                    break;
                default:
                    break;
            }
            i14 += 3;
            i15 = i11;
            i13 = i10;
            entry = entry;
        }
        while (entry != null) {
            u0Var.f2377p.j(t1Var, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        u0Var.q0(u0Var.f2376o, t8, t1Var);
    }

    public final boolean n(T t8, T t10, int i10) {
        int iL0 = l0(i10);
        long jS = S(iL0);
        switch (k0(iL0)) {
            case 0:
                return j(t8, t10, i10) && Double.doubleToLongBits(q1.u(t8, jS)) == Double.doubleToLongBits(q1.u(t10, jS));
            case 1:
                return j(t8, t10, i10) && Float.floatToIntBits(q1.v(t8, jS)) == Float.floatToIntBits(q1.v(t10, jS));
            case 2:
                return j(t8, t10, i10) && q1.x(t8, jS) == q1.x(t10, jS);
            case 3:
                return j(t8, t10, i10) && q1.x(t8, jS) == q1.x(t10, jS);
            case 4:
                return j(t8, t10, i10) && q1.w(t8, jS) == q1.w(t10, jS);
            case 5:
                return j(t8, t10, i10) && q1.x(t8, jS) == q1.x(t10, jS);
            case 6:
                return j(t8, t10, i10) && q1.w(t8, jS) == q1.w(t10, jS);
            case 7:
                return j(t8, t10, i10) && q1.p(t8, jS) == q1.p(t10, jS);
            case 8:
                return j(t8, t10, i10) && i1.I(q1.z(t8, jS), q1.z(t10, jS));
            case 9:
                return j(t8, t10, i10) && i1.I(q1.z(t8, jS), q1.z(t10, jS));
            case 10:
                return j(t8, t10, i10) && i1.I(q1.z(t8, jS), q1.z(t10, jS));
            case 11:
                return j(t8, t10, i10) && q1.w(t8, jS) == q1.w(t10, jS);
            case 12:
                return j(t8, t10, i10) && q1.w(t8, jS) == q1.w(t10, jS);
            case 13:
                return j(t8, t10, i10) && q1.w(t8, jS) == q1.w(t10, jS);
            case 14:
                return j(t8, t10, i10) && q1.x(t8, jS) == q1.x(t10, jS);
            case 15:
                return j(t8, t10, i10) && q1.w(t8, jS) == q1.w(t10, jS);
            case 16:
                return j(t8, t10, i10) && q1.x(t8, jS) == q1.x(t10, jS);
            case 17:
                return j(t8, t10, i10) && i1.I(q1.z(t8, jS), q1.z(t10, jS));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return i1.I(q1.z(t8, jS), q1.z(t10, jS));
            case 50:
                return i1.I(q1.z(t8, jS), q1.z(t10, jS));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return D(t8, t10, i10) && i1.I(q1.z(t8, jS), q1.z(t10, jS));
            default:
                return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public final void n0(T t8, t1 t1Var) {
        Iterator itG;
        Map.Entry<?, ?> entry;
        q0(this.f2376o, t8, t1Var);
        if (this.f2367f) {
            t<T> tVarC = this.f2377p.c(t8);
            if (tVarC.n()) {
                itG = null;
                entry = null;
            } else {
                itG = tVarC.g();
                entry = (Map.Entry) itG.next();
            }
        } else {
            itG = null;
            entry = null;
        }
        for (int length = this.f2363a.length - 3; length >= 0; length -= 3) {
            int iL0 = l0(length);
            int iR = R(length);
            while (entry != null && this.f2377p.a(entry) > iR) {
                this.f2377p.j(t1Var, entry);
                entry = itG.hasNext() ? (Map.Entry) itG.next() : null;
            }
            switch (k0(iL0)) {
                case 0:
                    if (x(t8, length)) {
                        t1Var.p(iR, m(t8, S(iL0)));
                    }
                    break;
                case 1:
                    if (x(t8, length)) {
                        t1Var.B(iR, q(t8, S(iL0)));
                    }
                    break;
                case 2:
                    if (x(t8, length)) {
                        t1Var.u(iR, G(t8, S(iL0)));
                    }
                    break;
                case 3:
                    if (x(t8, length)) {
                        t1Var.f(iR, G(t8, S(iL0)));
                    }
                    break;
                case 4:
                    if (x(t8, length)) {
                        t1Var.h(iR, v(t8, S(iL0)));
                    }
                    break;
                case 5:
                    if (x(t8, length)) {
                        t1Var.s(iR, G(t8, S(iL0)));
                    }
                    break;
                case 6:
                    if (x(t8, length)) {
                        t1Var.c(iR, v(t8, S(iL0)));
                    }
                    break;
                case 7:
                    if (x(t8, length)) {
                        t1Var.v(iR, k(t8, S(iL0)));
                    }
                    break;
                case 8:
                    if (x(t8, length)) {
                        p0(iR, q1.z(t8, S(iL0)), t1Var);
                    }
                    break;
                case 9:
                    if (x(t8, length)) {
                        t1Var.L(iR, q1.z(t8, S(iL0)), t(length));
                    }
                    break;
                case 10:
                    if (x(t8, length)) {
                        t1Var.K(iR, (g) q1.z(t8, S(iL0)));
                    }
                    break;
                case 11:
                    if (x(t8, length)) {
                        t1Var.o(iR, v(t8, S(iL0)));
                    }
                    break;
                case 12:
                    if (x(t8, length)) {
                        t1Var.E(iR, v(t8, S(iL0)));
                    }
                    break;
                case 13:
                    if (x(t8, length)) {
                        t1Var.w(iR, v(t8, S(iL0)));
                    }
                    break;
                case 14:
                    if (x(t8, length)) {
                        t1Var.i(iR, G(t8, S(iL0)));
                    }
                    break;
                case 15:
                    if (x(t8, length)) {
                        t1Var.H(iR, v(t8, S(iL0)));
                    }
                    break;
                case 16:
                    if (x(t8, length)) {
                        t1Var.m(iR, G(t8, S(iL0)));
                    }
                    break;
                case 17:
                    if (x(t8, length)) {
                        t1Var.N(iR, q1.z(t8, S(iL0)), t(length));
                    }
                    break;
                case 18:
                    i1.O(R(length), (List) q1.z(t8, S(iL0)), t1Var, false);
                    break;
                case 19:
                    i1.S(R(length), (List) q1.z(t8, S(iL0)), t1Var, false);
                    break;
                case 20:
                    i1.V(R(length), (List) q1.z(t8, S(iL0)), t1Var, false);
                    break;
                case 21:
                    i1.d0(R(length), (List) q1.z(t8, S(iL0)), t1Var, false);
                    break;
                case 22:
                    i1.U(R(length), (List) q1.z(t8, S(iL0)), t1Var, false);
                    break;
                case 23:
                    i1.R(R(length), (List) q1.z(t8, S(iL0)), t1Var, false);
                    break;
                case 24:
                    i1.Q(R(length), (List) q1.z(t8, S(iL0)), t1Var, false);
                    break;
                case 25:
                    i1.M(R(length), (List) q1.z(t8, S(iL0)), t1Var, false);
                    break;
                case 26:
                    i1.b0(R(length), (List) q1.z(t8, S(iL0)), t1Var);
                    break;
                case 27:
                    i1.W(R(length), (List) q1.z(t8, S(iL0)), t1Var, t(length));
                    break;
                case 28:
                    i1.N(R(length), (List) q1.z(t8, S(iL0)), t1Var);
                    break;
                case 29:
                    i1.c0(R(length), (List) q1.z(t8, S(iL0)), t1Var, false);
                    break;
                case 30:
                    i1.P(R(length), (List) q1.z(t8, S(iL0)), t1Var, false);
                    break;
                case 31:
                    i1.X(R(length), (List) q1.z(t8, S(iL0)), t1Var, false);
                    break;
                case 32:
                    i1.Y(R(length), (List) q1.z(t8, S(iL0)), t1Var, false);
                    break;
                case 33:
                    i1.Z(R(length), (List) q1.z(t8, S(iL0)), t1Var, false);
                    break;
                case 34:
                    i1.a0(R(length), (List) q1.z(t8, S(iL0)), t1Var, false);
                    break;
                case 35:
                    i1.O(R(length), (List) q1.z(t8, S(iL0)), t1Var, true);
                    break;
                case 36:
                    i1.S(R(length), (List) q1.z(t8, S(iL0)), t1Var, true);
                    break;
                case 37:
                    i1.V(R(length), (List) q1.z(t8, S(iL0)), t1Var, true);
                    break;
                case 38:
                    i1.d0(R(length), (List) q1.z(t8, S(iL0)), t1Var, true);
                    break;
                case 39:
                    i1.U(R(length), (List) q1.z(t8, S(iL0)), t1Var, true);
                    break;
                case 40:
                    i1.R(R(length), (List) q1.z(t8, S(iL0)), t1Var, true);
                    break;
                case 41:
                    i1.Q(R(length), (List) q1.z(t8, S(iL0)), t1Var, true);
                    break;
                case 42:
                    i1.M(R(length), (List) q1.z(t8, S(iL0)), t1Var, true);
                    break;
                case 43:
                    i1.c0(R(length), (List) q1.z(t8, S(iL0)), t1Var, true);
                    break;
                case 44:
                    i1.P(R(length), (List) q1.z(t8, S(iL0)), t1Var, true);
                    break;
                case 45:
                    i1.X(R(length), (List) q1.z(t8, S(iL0)), t1Var, true);
                    break;
                case 46:
                    i1.Y(R(length), (List) q1.z(t8, S(iL0)), t1Var, true);
                    break;
                case 47:
                    i1.Z(R(length), (List) q1.z(t8, S(iL0)), t1Var, true);
                    break;
                case 48:
                    i1.a0(R(length), (List) q1.z(t8, S(iL0)), t1Var, true);
                    break;
                case 49:
                    i1.T(R(length), (List) q1.z(t8, S(iL0)), t1Var, t(length));
                    break;
                case 50:
                    o0(t1Var, iR, q1.z(t8, S(iL0)), length);
                    break;
                case 51:
                    if (E(t8, iR, length)) {
                        t1Var.p(iR, U(t8, S(iL0)));
                    }
                    break;
                case 52:
                    if (E(t8, iR, length)) {
                        t1Var.B(iR, V(t8, S(iL0)));
                    }
                    break;
                case 53:
                    if (E(t8, iR, length)) {
                        t1Var.u(iR, X(t8, S(iL0)));
                    }
                    break;
                case 54:
                    if (E(t8, iR, length)) {
                        t1Var.f(iR, X(t8, S(iL0)));
                    }
                    break;
                case 55:
                    if (E(t8, iR, length)) {
                        t1Var.h(iR, W(t8, S(iL0)));
                    }
                    break;
                case 56:
                    if (E(t8, iR, length)) {
                        t1Var.s(iR, X(t8, S(iL0)));
                    }
                    break;
                case 57:
                    if (E(t8, iR, length)) {
                        t1Var.c(iR, W(t8, S(iL0)));
                    }
                    break;
                case 58:
                    if (E(t8, iR, length)) {
                        t1Var.v(iR, T(t8, S(iL0)));
                    }
                    break;
                case 59:
                    if (E(t8, iR, length)) {
                        p0(iR, q1.z(t8, S(iL0)), t1Var);
                    }
                    break;
                case 60:
                    if (E(t8, iR, length)) {
                        t1Var.L(iR, q1.z(t8, S(iL0)), t(length));
                    }
                    break;
                case 61:
                    if (E(t8, iR, length)) {
                        t1Var.K(iR, (g) q1.z(t8, S(iL0)));
                    }
                    break;
                case 62:
                    if (E(t8, iR, length)) {
                        t1Var.o(iR, W(t8, S(iL0)));
                    }
                    break;
                case 63:
                    if (E(t8, iR, length)) {
                        t1Var.E(iR, W(t8, S(iL0)));
                    }
                    break;
                case 64:
                    if (E(t8, iR, length)) {
                        t1Var.w(iR, W(t8, S(iL0)));
                    }
                    break;
                case 65:
                    if (E(t8, iR, length)) {
                        t1Var.i(iR, X(t8, S(iL0)));
                    }
                    break;
                case 66:
                    if (E(t8, iR, length)) {
                        t1Var.H(iR, W(t8, S(iL0)));
                    }
                    break;
                case 67:
                    if (E(t8, iR, length)) {
                        t1Var.m(iR, X(t8, S(iL0)));
                    }
                    break;
                case 68:
                    if (E(t8, iR, length)) {
                        t1Var.N(iR, q1.z(t8, S(iL0)), t(length));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.f2377p.j(t1Var, entry);
            entry = itG.hasNext() ? (Map.Entry) itG.next() : null;
        }
    }

    public final <UT, UB> UB o(Object obj, int i10, UB ub, n1<UT, UB> n1Var, Object obj2) {
        z.c cVarR;
        int iR = R(i10);
        Object objZ = q1.z(obj, S(l0(i10)));
        return (objZ == null || (cVarR = r(i10)) == null) ? ub : (UB) p(i10, iR, this.f2378q.c(objZ), cVarR, ub, n1Var, obj2);
    }

    public final <K, V> void o0(t1 t1Var, int i10, Object obj, int i11) {
        if (obj != null) {
            t1Var.M(i10, this.f2378q.b(s(i11)), this.f2378q.e(obj));
        }
    }

    public final <K, V, UT, UB> UB p(int i10, int i11, Map<K, V> map, z.c cVar, UB ub, n1<UT, UB> n1Var, Object obj) {
        k0.a<?, ?> aVarB = this.f2378q.b(s(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!cVar.a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = n1Var.f(obj);
                }
                g.h hVarL = g.l(k0.b(aVarB, next.getKey(), next.getValue()));
                try {
                    k0.e(hVarL.b(), aVarB, next.getKey(), next.getValue());
                    n1Var.d(ub, i11, hVarL.a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub;
    }

    public final void p0(int i10, Object obj, t1 t1Var) {
        if (obj instanceof String) {
            t1Var.e(i10, (String) obj);
        } else {
            t1Var.K(i10, (g) obj);
        }
    }

    public final <UT, UB> void q0(n1<UT, UB> n1Var, T t8, t1 t1Var) {
        n1Var.t(n1Var.g(t8), t1Var);
    }

    public final z.c r(int i10) {
        return (z.c) this.b[((i10 / 3) * 2) + 1];
    }

    public final Object s(int i10) {
        return this.b[(i10 / 3) * 2];
    }

    public final g1 t(int i10) {
        int i11 = (i10 / 3) * 2;
        g1 g1Var = (g1) this.b[i11];
        if (g1Var != null) {
            return g1Var;
        }
        g1<T> g1VarC = c1.a().c((Class) this.b[i11 + 1]);
        this.b[i11] = g1VarC;
        return g1VarC;
    }

    public final <UT, UB> int u(n1<UT, UB> n1Var, T t8) {
        return n1Var.h(n1Var.g(t8));
    }

    public final boolean x(T t8, int i10) {
        boolean zEquals;
        int iZ = Z(i10);
        long j10 = 1048575 & iZ;
        if (j10 != 1048575) {
            return (q1.w(t8, j10) & (1 << (iZ >>> 20))) != 0;
        }
        int iL0 = l0(i10);
        long jS = S(iL0);
        switch (k0(iL0)) {
            case 0:
                return Double.doubleToRawLongBits(q1.u(t8, jS)) != 0;
            case 1:
                return Float.floatToRawIntBits(q1.v(t8, jS)) != 0;
            case 2:
                return q1.x(t8, jS) != 0;
            case 3:
                return q1.x(t8, jS) != 0;
            case 4:
                return q1.w(t8, jS) != 0;
            case 5:
                return q1.x(t8, jS) != 0;
            case 6:
                return q1.w(t8, jS) != 0;
            case 7:
                return q1.p(t8, jS);
            case 8:
                Object objZ = q1.z(t8, jS);
                if (objZ instanceof String) {
                    zEquals = ((String) objZ).isEmpty();
                } else {
                    if (!(objZ instanceof g)) {
                        throw new IllegalArgumentException();
                    }
                    zEquals = g.b.equals(objZ);
                }
                break;
            case 9:
                return q1.z(t8, jS) != null;
            case 10:
                zEquals = g.b.equals(q1.z(t8, jS));
                break;
            case 11:
                return q1.w(t8, jS) != 0;
            case 12:
                return q1.w(t8, jS) != 0;
            case 13:
                return q1.w(t8, jS) != 0;
            case 14:
                return q1.x(t8, jS) != 0;
            case 15:
                return q1.w(t8, jS) != 0;
            case 16:
                return q1.x(t8, jS) != 0;
            case 17:
                return q1.z(t8, jS) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !zEquals;
    }

    public final boolean y(T t8, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return x(t8, i10);
        }
        return (i12 & i13) != 0;
    }
}
