package com.google.crypto.tink.shaded.protobuf;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class v0<T> implements g1<T> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f8629r = new int[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Unsafe f8630s = q1.D();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f8631a;
    public final Object[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s0 f8634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f8635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f8636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b1 f8637h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f8638i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f8639j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f8640k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f8641l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x0 f8642m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g0 f8643n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final n1<?, ?> f8644o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q<?> f8645p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n0 f8646q;

    public v0(int[] iArr, Object[] objArr, int i10, int i11, s0 s0Var, b1 b1Var, boolean z10, int[] iArr2, int i12, int i13, x0 x0Var, g0 g0Var, n1<?, ?> n1Var, q<?> qVar, n0 n0Var) {
        this.f8631a = iArr;
        this.b = objArr;
        this.f8632c = i10;
        this.f8633d = i11;
        this.f8636g = s0Var instanceof y;
        this.f8637h = b1Var;
        this.f8635f = qVar != null && qVar.e(s0Var);
        this.f8638i = z10;
        this.f8639j = iArr2;
        this.f8640k = i12;
        this.f8641l = i13;
        this.f8642m = x0Var;
        this.f8643n = g0Var;
        this.f8644o = n1Var;
        this.f8645p = qVar;
        this.f8634e = s0Var;
        this.f8646q = n0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean C(Object obj, int i10, g1 g1Var) {
        return g1Var.c(q1.C(obj, W(i10)));
    }

    public static boolean D(int i10) {
        return (i10 & Integer.MIN_VALUE) != 0;
    }

    public static boolean G(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof y) {
            return ((y) obj).J();
        }
        return true;
    }

    public static boolean J(int i10) {
        return (i10 & 268435456) != 0;
    }

    public static <T> long K(T t8, long j10) {
        return q1.A(t8, j10);
    }

    public static <T> v0<T> S(Class<T> cls, q0 q0Var, x0 x0Var, g0 g0Var, n1<?, ?> n1Var, q<?> qVar, n0 n0Var) {
        return q0Var instanceof e1 ? U((e1) q0Var, x0Var, g0Var, n1Var, qVar, n0Var) : T((k1) q0Var, x0Var, g0Var, n1Var, qVar, n0Var);
    }

    public static <T> v0<T> T(k1 k1Var, x0 x0Var, g0 g0Var, n1<?, ?> n1Var, q<?> qVar, n0 n0Var) {
        t[] tVarArrE = k1Var.e();
        if (tVarArrE.length != 0) {
            t tVar = tVarArrE[0];
            throw null;
        }
        int length = tVarArrE.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        if (tVarArrE.length > 0) {
            t tVar2 = tVarArrE[0];
            throw null;
        }
        int[] iArrD = k1Var.d();
        if (iArrD == null) {
            iArrD = f8629r;
        }
        if (tVarArrE.length > 0) {
            t tVar3 = tVarArrE[0];
            throw null;
        }
        int[] iArr2 = f8629r;
        int[] iArr3 = f8629r;
        int[] iArr4 = new int[iArrD.length + iArr2.length + iArr3.length];
        System.arraycopy(iArrD, 0, iArr4, 0, iArrD.length);
        System.arraycopy(iArr2, 0, iArr4, iArrD.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, iArrD.length + iArr2.length, iArr3.length);
        return new v0<>(iArr, objArr, 0, 0, k1Var.b(), k1Var.c(), true, iArr4, iArrD.length, iArrD.length + iArr2.length, x0Var, g0Var, n1Var, qVar, n0Var);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0251  */
    /* JADX WARN: Code duplicated, block: B:122:0x0254  */
    /* JADX WARN: Code duplicated, block: B:125:0x026b  */
    /* JADX WARN: Code duplicated, block: B:126:0x026e  */
    /* JADX WARN: Code duplicated, block: B:163:0x0326  */
    /* JADX WARN: Code duplicated, block: B:180:0x0375  */
    /* JADX WARN: Code duplicated, block: B:183:0x0383  */
    public static <T> v0<T> U(e1 e1Var, x0 x0Var, g0 g0Var, n1<?, ?> n1Var, q<?> qVar, n0 n0Var) {
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
        Field fieldN0;
        char cCharAt9;
        int i32;
        int i33;
        int i34;
        Object obj;
        Field fieldN1;
        int i35;
        Object obj2;
        Field fieldN2;
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
            iArr = f8629r;
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
        Unsafe unsafe = f8630s;
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
                        fieldN1 = (Field) obj;
                    } else {
                        fieldN1 = n0(cls, (String) obj);
                        objArrD[i34] = fieldN1;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldN1);
                    i35 = i34 + 1;
                    obj2 = objArrD[i35];
                    if (obj2 instanceof Field) {
                        fieldN2 = (Field) obj2;
                    } else {
                        fieldN2 = n0(cls, (String) obj2);
                        objArrD[i35] = fieldN2;
                    }
                    strE = strE;
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldN2);
                    i31 = iObjectFieldOffset4;
                    i30 = 0;
                    i27 = iCharAt10;
                    i41 = i88;
                }
                i11 = i33;
                i34 = iCharAt12 * 2;
                obj = objArrD[i34];
                if (obj instanceof Field) {
                    fieldN1 = (Field) obj;
                } else {
                    fieldN1 = n0(cls, (String) obj);
                    objArrD[i34] = fieldN1;
                }
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldN1);
                i35 = i34 + 1;
                obj2 = objArrD[i35];
                if (obj2 instanceof Field) {
                    fieldN2 = (Field) obj2;
                } else {
                    fieldN2 = n0(cls, (String) obj2);
                    objArrD[i35] = fieldN2;
                }
                strE = strE;
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldN2);
                i31 = iObjectFieldOffset5;
                i30 = 0;
                i27 = iCharAt10;
                i41 = i88;
            } else {
                int i89 = i11 + 1;
                Field fieldN3 = n0(cls, (String) objArrD[i11]);
                if (i82 == 9 || i82 == 17) {
                    i27 = iCharAt10;
                    objArr[((i73 / 3) * 2) + 1] = fieldN3.getType();
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
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldN3);
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
                                fieldN0 = (Field) obj3;
                            } else {
                                fieldN0 = n0(cls, (String) obj3);
                                objArrD[i93] = fieldN0;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldN0);
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
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldN3);
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
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldN3);
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
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldN3);
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
        return new v0<>(iArr3, objArr, i12, i16, e1Var.b(), e1Var.c(), false, iArr, i15, i69, x0Var, g0Var, n1Var, qVar, n0Var);
    }

    public static long W(int i10) {
        return i10 & 1048575;
    }

    public static <T> boolean X(T t8, long j10) {
        return ((Boolean) q1.C(t8, j10)).booleanValue();
    }

    public static <T> double Y(T t8, long j10) {
        return ((Double) q1.C(t8, j10)).doubleValue();
    }

    public static <T> float Z(T t8, long j10) {
        return ((Float) q1.C(t8, j10)).floatValue();
    }

    public static <T> int a0(T t8, long j10) {
        return ((Integer) q1.C(t8, j10)).intValue();
    }

    public static <T> long b0(T t8, long j10) {
        return ((Long) q1.C(t8, j10)).longValue();
    }

    public static <T> boolean l(T t8, long j10) {
        return q1.r(t8, j10);
    }

    public static void m(Object obj) {
        if (G(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    public static Field n0(Class<?> cls, String str) {
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

    public static <T> double o(T t8, long j10) {
        return q1.x(t8, j10);
    }

    public static <T> float s(T t8, long j10) {
        return q1.y(t8, j10);
    }

    public static int t0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    public static o1 w(Object obj) {
        y yVar = (y) obj;
        o1 o1Var = yVar.unknownFields;
        if (o1Var != o1.c()) {
            return o1Var;
        }
        o1 o1VarK = o1.k();
        yVar.unknownFields = o1VarK;
        return o1VarK;
    }

    public static <T> int y(T t8, long j10) {
        return q1.z(t8, j10);
    }

    public static boolean z(int i10) {
        return (i10 & 536870912) != 0;
    }

    public final boolean A(T t8, int i10) {
        boolean zEquals;
        int iI0 = i0(i10);
        long j10 = 1048575 & iI0;
        if (j10 != 1048575) {
            return (q1.z(t8, j10) & (1 << (iI0 >>> 20))) != 0;
        }
        int iU0 = u0(i10);
        long jW = W(iU0);
        switch (t0(iU0)) {
            case 0:
                return Double.doubleToRawLongBits(q1.x(t8, jW)) != 0;
            case 1:
                return Float.floatToRawIntBits(q1.y(t8, jW)) != 0;
            case 2:
                return q1.A(t8, jW) != 0;
            case 3:
                return q1.A(t8, jW) != 0;
            case 4:
                return q1.z(t8, jW) != 0;
            case 5:
                return q1.A(t8, jW) != 0;
            case 6:
                return q1.z(t8, jW) != 0;
            case 7:
                return q1.r(t8, jW);
            case 8:
                Object objC = q1.C(t8, jW);
                if (objC instanceof String) {
                    zEquals = ((String) objC).isEmpty();
                } else {
                    if (!(objC instanceof h)) {
                        throw new IllegalArgumentException();
                    }
                    zEquals = h.b.equals(objC);
                }
                break;
            case 9:
                return q1.C(t8, jW) != null;
            case 10:
                zEquals = h.b.equals(q1.C(t8, jW));
                break;
            case 11:
                return q1.z(t8, jW) != 0;
            case 12:
                return q1.z(t8, jW) != 0;
            case 13:
                return q1.z(t8, jW) != 0;
            case 14:
                return q1.A(t8, jW) != 0;
            case 15:
                return q1.z(t8, jW) != 0;
            case 16:
                return q1.A(t8, jW) != 0;
            case 17:
                return q1.C(t8, jW) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !zEquals;
    }

    public final boolean B(T t8, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return A(t8, i10);
        }
        return (i12 & i13) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <N> boolean E(Object obj, int i10, int i11) {
        List list = (List) q1.C(obj, W(i10));
        if (list.isEmpty()) {
            return true;
        }
        g1 g1VarV = v(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!g1VarV.c(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    public final boolean F(T t8, int i10, int i11) {
        if (this.f8646q.e(q1.C(t8, W(i10))).isEmpty()) {
            return true;
        }
        this.f8646q.b(u(i11));
        throw null;
    }

    public final boolean H(T t8, T t10, int i10) {
        long jI0 = i0(i10) & 1048575;
        return q1.z(t8, jI0) == q1.z(t10, jI0);
    }

    public final boolean I(T t8, int i10, int i11) {
        return q1.z(t8, (long) (i0(i11) & 1048575)) == i10;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 20401. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final <UT, UB, ET extends com.google.crypto.tink.shaded.protobuf.u.b<ET>> void L(com.google.crypto.tink.shaded.protobuf.n1<UT, UB> r18, com.google.crypto.tink.shaded.protobuf.q<ET> r19, T r20, com.google.crypto.tink.shaded.protobuf.f1 r21, com.google.crypto.tink.shaded.protobuf.p r22) {
        /*
            Method dump skipped, instruction units count: 2040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.v0.L(com.google.crypto.tink.shaded.protobuf.n1, com.google.crypto.tink.shaded.protobuf.q, java.lang.Object, com.google.crypto.tink.shaded.protobuf.f1, com.google.crypto.tink.shaded.protobuf.p):void");
    }

    public final <K, V> void M(Object obj, int i10, Object obj2, p pVar, f1 f1Var) {
        long jW = W(u0(i10));
        Object objC = q1.C(obj, jW);
        if (objC == null) {
            objC = this.f8646q.d(obj2);
            q1.R(obj, jW, objC);
        } else if (this.f8646q.h(objC)) {
            Object objD = this.f8646q.d(obj2);
            this.f8646q.a(objD, objC);
            q1.R(obj, jW, objD);
            objC = objD;
        }
        Map<?, ?> mapC = this.f8646q.c(objC);
        this.f8646q.b(obj2);
        f1Var.L(mapC, null, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N(T t8, T t10, int i10) {
        if (A(t10, i10)) {
            long jW = W(u0(i10));
            Unsafe unsafe = f8630s;
            Object object = unsafe.getObject(t10, jW);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + V(i10) + " is present but null: " + t10);
            }
            g1 g1VarV = v(i10);
            if (!A(t8, i10)) {
                if (G(object)) {
                    Object objE = g1VarV.e();
                    g1VarV.a(objE, object);
                    unsafe.putObject(t8, jW, objE);
                } else {
                    unsafe.putObject(t8, jW, object);
                }
                o0(t8, i10);
                return;
            }
            Object object2 = unsafe.getObject(t8, jW);
            if (!G(object2)) {
                Object objE2 = g1VarV.e();
                g1VarV.a(objE2, object2);
                unsafe.putObject(t8, jW, objE2);
                object2 = objE2;
            }
            g1VarV.a(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O(T t8, T t10, int i10) {
        int iV = V(i10);
        if (I(t10, iV, i10)) {
            long jW = W(u0(i10));
            Unsafe unsafe = f8630s;
            Object object = unsafe.getObject(t10, jW);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + V(i10) + " is present but null: " + t10);
            }
            g1 g1VarV = v(i10);
            if (!I(t8, iV, i10)) {
                if (G(object)) {
                    Object objE = g1VarV.e();
                    g1VarV.a(objE, object);
                    unsafe.putObject(t8, jW, objE);
                } else {
                    unsafe.putObject(t8, jW, object);
                }
                p0(t8, iV, i10);
                return;
            }
            Object object2 = unsafe.getObject(t8, jW);
            if (!G(object2)) {
                Object objE2 = g1VarV.e();
                g1VarV.a(objE2, object2);
                unsafe.putObject(t8, jW, objE2);
                object2 = objE2;
            }
            g1VarV.a(object2, object);
        }
    }

    public final void P(T t8, T t10, int i10) {
        int iU0 = u0(i10);
        long jW = W(iU0);
        int iV = V(i10);
        switch (t0(iU0)) {
            case 0:
                if (A(t10, i10)) {
                    q1.N(t8, jW, q1.x(t10, jW));
                    o0(t8, i10);
                }
                break;
            case 1:
                if (A(t10, i10)) {
                    q1.O(t8, jW, q1.y(t10, jW));
                    o0(t8, i10);
                }
                break;
            case 2:
                if (A(t10, i10)) {
                    q1.Q(t8, jW, q1.A(t10, jW));
                    o0(t8, i10);
                }
                break;
            case 3:
                if (A(t10, i10)) {
                    q1.Q(t8, jW, q1.A(t10, jW));
                    o0(t8, i10);
                }
                break;
            case 4:
                if (A(t10, i10)) {
                    q1.P(t8, jW, q1.z(t10, jW));
                    o0(t8, i10);
                }
                break;
            case 5:
                if (A(t10, i10)) {
                    q1.Q(t8, jW, q1.A(t10, jW));
                    o0(t8, i10);
                }
                break;
            case 6:
                if (A(t10, i10)) {
                    q1.P(t8, jW, q1.z(t10, jW));
                    o0(t8, i10);
                }
                break;
            case 7:
                if (A(t10, i10)) {
                    q1.H(t8, jW, q1.r(t10, jW));
                    o0(t8, i10);
                }
                break;
            case 8:
                if (A(t10, i10)) {
                    q1.R(t8, jW, q1.C(t10, jW));
                    o0(t8, i10);
                }
                break;
            case 9:
                N(t8, t10, i10);
                break;
            case 10:
                if (A(t10, i10)) {
                    q1.R(t8, jW, q1.C(t10, jW));
                    o0(t8, i10);
                }
                break;
            case 11:
                if (A(t10, i10)) {
                    q1.P(t8, jW, q1.z(t10, jW));
                    o0(t8, i10);
                }
                break;
            case 12:
                if (A(t10, i10)) {
                    q1.P(t8, jW, q1.z(t10, jW));
                    o0(t8, i10);
                }
                break;
            case 13:
                if (A(t10, i10)) {
                    q1.P(t8, jW, q1.z(t10, jW));
                    o0(t8, i10);
                }
                break;
            case 14:
                if (A(t10, i10)) {
                    q1.Q(t8, jW, q1.A(t10, jW));
                    o0(t8, i10);
                }
                break;
            case 15:
                if (A(t10, i10)) {
                    q1.P(t8, jW, q1.z(t10, jW));
                    o0(t8, i10);
                }
                break;
            case 16:
                if (A(t10, i10)) {
                    q1.Q(t8, jW, q1.A(t10, jW));
                    o0(t8, i10);
                }
                break;
            case 17:
                N(t8, t10, i10);
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
                this.f8643n.b(t8, t10, jW);
                break;
            case 50:
                i1.F(this.f8646q, t8, t10, jW);
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
                if (I(t10, iV, i10)) {
                    q1.R(t8, jW, q1.C(t10, jW));
                    p0(t8, iV, i10);
                }
                break;
            case 60:
                O(t8, t10, i10);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (I(t10, iV, i10)) {
                    q1.R(t8, jW, q1.C(t10, jW));
                    p0(t8, iV, i10);
                }
                break;
            case 68:
                O(t8, t10, i10);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object Q(T t8, int i10) {
        g1 g1VarV = v(i10);
        long jW = W(u0(i10));
        if (!A(t8, i10)) {
            return g1VarV.e();
        }
        Object object = f8630s.getObject(t8, jW);
        if (G(object)) {
            return object;
        }
        Object objE = g1VarV.e();
        if (object != null) {
            g1VarV.a(objE, object);
        }
        return objE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object R(T t8, int i10, int i11) {
        g1 g1VarV = v(i11);
        if (!I(t8, i10, i11)) {
            return g1VarV.e();
        }
        Object object = f8630s.getObject(t8, W(u0(i11)));
        if (G(object)) {
            return object;
        }
        Object objE = g1VarV.e();
        if (object != null) {
            g1VarV.a(objE, object);
        }
        return objE;
    }

    public final int V(int i10) {
        return this.f8631a[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void a(T t8, T t10) {
        m(t8);
        t10.getClass();
        for (int i10 = 0; i10 < this.f8631a.length; i10 += 3) {
            P(t8, t10, i10);
        }
        i1.G(this.f8644o, t8, t10);
        if (this.f8635f) {
            i1.E(this.f8645p, t8, t10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x007d A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void b(T t8) {
        if (G(t8)) {
            if (t8 instanceof y) {
                y yVar = (y) t8;
                yVar.s();
                yVar.r();
                yVar.L();
            }
            int length = this.f8631a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int iU0 = u0(i10);
                long jW = W(iU0);
                int iT0 = t0(iU0);
                if (iT0 != 9) {
                    if (iT0 != 60 && iT0 != 68) {
                        switch (iT0) {
                            case 17:
                                if (A(t8, i10)) {
                                    v(i10).b(f8630s.getObject(t8, jW));
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
                                this.f8643n.a(t8, jW);
                                break;
                            case 50:
                                Unsafe unsafe = f8630s;
                                Object object = unsafe.getObject(t8, jW);
                                if (object != null) {
                                    unsafe.putObject(t8, jW, this.f8646q.f(object));
                                }
                                break;
                        }
                    } else if (I(t8, V(i10), i10)) {
                        v(i10).b(f8630s.getObject(t8, jW));
                    }
                } else if (A(t8, i10)) {
                    v(i10).b(f8630s.getObject(t8, jW));
                }
            }
            this.f8644o.j(t8);
            if (this.f8635f) {
                this.f8645p.f(t8);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0094 A[SYNTHETIC] */
    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public final boolean c(T t8) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.f8640k) {
            int i15 = this.f8639j[i13];
            int iV = V(i15);
            int iU0 = u0(i15);
            int i16 = this.f8631a[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i12) {
                if (i17 != 1048575) {
                    i14 = f8630s.getInt(t8, i17);
                }
                i11 = i14;
                i10 = i17;
            } else {
                i10 = i12;
                i11 = i14;
            }
            T t10 = t8;
            if (J(iU0) && !B(t10, i15, i10, i11, i18)) {
                return false;
            }
            int iT0 = t0(iU0);
            if (iT0 == 9 || iT0 == 17) {
                if (B(t10, i15, i10, i11, i18) && !C(t10, iU0, v(i15))) {
                    return false;
                }
            } else if (iT0 == 27) {
                if (!E(t10, iU0, i15)) {
                    return false;
                }
            } else if (iT0 == 60 || iT0 == 68) {
                if (I(t10, iV, i15) && !C(t10, iU0, v(i15))) {
                    return false;
                }
            } else if (iT0 != 49) {
                if (iT0 == 50 && !F(t10, iU0, i15)) {
                    return false;
                }
            } else if (!E(t10, iU0, i15)) {
                return false;
            }
            i13++;
            t8 = t10;
            i12 = i10;
            i14 = i11;
        }
        return !this.f8635f || this.f8645p.c(t8).o();
    }

    public final <K, V> int c0(T t8, byte[] bArr, int i10, int i11, int i12, long j10, e.b bVar) {
        Unsafe unsafe = f8630s;
        Object objU = u(i12);
        Object object = unsafe.getObject(t8, j10);
        if (this.f8646q.h(object)) {
            Object objD = this.f8646q.d(objU);
            this.f8646q.a(objD, object);
            unsafe.putObject(t8, j10, objD);
            object = objD;
        }
        this.f8646q.b(objU);
        return n(bArr, i10, i11, null, this.f8646q.c(object), bVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:247:0x0552 A[PHI: r0 r1
      0x0552: PHI (r0v2 com.google.crypto.tink.shaded.protobuf.v0<T>) = 
      (r0v1 com.google.crypto.tink.shaded.protobuf.v0<T>)
      (r0v1 com.google.crypto.tink.shaded.protobuf.v0<T>)
      (r0v1 com.google.crypto.tink.shaded.protobuf.v0<T>)
      (r0v24 com.google.crypto.tink.shaded.protobuf.v0<T>)
      (r0v30 com.google.crypto.tink.shaded.protobuf.v0<T>)
      (r0v1 com.google.crypto.tink.shaded.protobuf.v0<T>)
      (r0v1 com.google.crypto.tink.shaded.protobuf.v0<T>)
      (r0v1 com.google.crypto.tink.shaded.protobuf.v0<T>)
      (r0v1 com.google.crypto.tink.shaded.protobuf.v0<T>)
      (r0v1 com.google.crypto.tink.shaded.protobuf.v0<T>)
      (r0v1 com.google.crypto.tink.shaded.protobuf.v0<T>)
      (r0v1 com.google.crypto.tink.shaded.protobuf.v0<T>)
      (r0v1 com.google.crypto.tink.shaded.protobuf.v0<T>)
      (r0v1 com.google.crypto.tink.shaded.protobuf.v0<T>)
      (r0v1 com.google.crypto.tink.shaded.protobuf.v0<T>)
      (r0v1 com.google.crypto.tink.shaded.protobuf.v0<T>)
      (r0v1 com.google.crypto.tink.shaded.protobuf.v0<T>)
      (r0v1 com.google.crypto.tink.shaded.protobuf.v0<T>)
      (r0v1 com.google.crypto.tink.shaded.protobuf.v0<T>)
      (r0v1 com.google.crypto.tink.shaded.protobuf.v0<T>)
      (r0v1 com.google.crypto.tink.shaded.protobuf.v0<T>)
      (r0v1 com.google.crypto.tink.shaded.protobuf.v0<T>)
      (r0v1 com.google.crypto.tink.shaded.protobuf.v0<T>)
      (r0v1 com.google.crypto.tink.shaded.protobuf.v0<T>)
      (r0v1 com.google.crypto.tink.shaded.protobuf.v0<T>)
      (r0v1 com.google.crypto.tink.shaded.protobuf.v0<T>)
      (r0v1 com.google.crypto.tink.shaded.protobuf.v0<T>)
      (r0v1 com.google.crypto.tink.shaded.protobuf.v0<T>)
      (r0v1 com.google.crypto.tink.shaded.protobuf.v0<T>)
      (r0v1 com.google.crypto.tink.shaded.protobuf.v0<T>)
      (r0v1 com.google.crypto.tink.shaded.protobuf.v0<T>)
      (r0v1 com.google.crypto.tink.shaded.protobuf.v0<T>)
      (r0v1 com.google.crypto.tink.shaded.protobuf.v0<T>)
      (r0v1 com.google.crypto.tink.shaded.protobuf.v0<T>)
      (r0v1 com.google.crypto.tink.shaded.protobuf.v0<T>)
      (r0v1 com.google.crypto.tink.shaded.protobuf.v0<T>)
      (r0v1 com.google.crypto.tink.shaded.protobuf.v0<T>)
      (r0v1 com.google.crypto.tink.shaded.protobuf.v0<T>)
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
    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public int d(T t8) {
        int i10;
        int i11;
        int iQ;
        int iX;
        int i12;
        int iU;
        int iW;
        v0<T> v0Var = this;
        T t10 = t8;
        Unsafe unsafe = f8630s;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1048575;
        while (i14 < v0Var.f8631a.length) {
            int iU0 = v0Var.u0(i14);
            int iT0 = t0(iU0);
            int iV = v0Var.V(i14);
            int i18 = v0Var.f8631a[i14 + 2];
            int i19 = i18 & i13;
            if (iT0 <= 17) {
                if (i19 != i17) {
                    i15 = i19 == i13 ? 0 : unsafe.getInt(t10, i19);
                    i17 = i19;
                }
                i10 = 1 << (i18 >>> 20);
            } else {
                i10 = 0;
            }
            int i20 = i16;
            long jW = W(iU0);
            if (iT0 < v.O.a() || iT0 > v.f8592b0.a()) {
                i19 = 0;
            }
            switch (iT0) {
                case 0:
                    if (!v0Var.B(t10, i14, i17, i15, i10)) {
                        i16 = i20;
                    } else {
                        i11 = k.i(iV, 0.0d);
                        i16 = i20 + i11;
                    }
                    break;
                case 1:
                    if (v0Var.B(t10, i14, i17, i15, i10)) {
                        iQ = k.q(iV, 0.0f);
                        i16 = i20 + iQ;
                        v0Var = this;
                        t10 = t8;
                    }
                    v0Var = this;
                    t10 = t8;
                    i16 = i20;
                    break;
                case 2:
                    if (v0Var.B(t10, i14, i17, i15, i10)) {
                        iX = k.x(iV, unsafe.getLong(t10, jW));
                        i16 = i20 + iX;
                        v0Var = this;
                    }
                    v0Var = this;
                    i16 = i20;
                    break;
                case 3:
                    if (v0Var.B(t10, i14, i17, i15, i10)) {
                        iX = k.X(iV, unsafe.getLong(t10, jW));
                        i16 = i20 + iX;
                        v0Var = this;
                    }
                    v0Var = this;
                    i16 = i20;
                    break;
                case 4:
                    if (v0Var.B(t10, i14, i17, i15, i10)) {
                        iX = k.v(iV, unsafe.getInt(t10, jW));
                        i16 = i20 + iX;
                        v0Var = this;
                    }
                    v0Var = this;
                    i16 = i20;
                    break;
                case 5:
                    if (v0Var.B(t10, i14, i17, i15, i10)) {
                        iQ = k.o(iV, 0L);
                        i16 = i20 + iQ;
                        v0Var = this;
                        t10 = t8;
                    }
                    v0Var = this;
                    t10 = t8;
                    i16 = i20;
                    break;
                case 6:
                    if (v0Var.B(t10, i14, i17, i15, i10)) {
                        iQ = k.m(iV, 0);
                        i16 = i20 + iQ;
                        v0Var = this;
                        t10 = t8;
                    }
                    v0Var = this;
                    t10 = t8;
                    i16 = i20;
                    break;
                case 7:
                    if (v0Var.B(t10, i14, i17, i15, i10)) {
                        iQ = k.d(iV, true);
                        i16 = i20 + iQ;
                        v0Var = this;
                        t10 = t8;
                    }
                    v0Var = this;
                    t10 = t8;
                    i16 = i20;
                    break;
                case 8:
                    if (v0Var.B(t10, i14, i17, i15, i10)) {
                        Object object = unsafe.getObject(t10, jW);
                        iX = object instanceof h ? k.g(iV, (h) object) : k.S(iV, (String) object);
                        i16 = i20 + iX;
                        v0Var = this;
                    }
                    v0Var = this;
                    i16 = i20;
                    break;
                case 9:
                    if (!v0Var.B(t10, i14, i17, i15, i10)) {
                        i16 = i20;
                    } else {
                        i11 = i1.o(iV, unsafe.getObject(t10, jW), v0Var.v(i14));
                        i16 = i20 + i11;
                    }
                    break;
                case 10:
                    if (v0Var.B(t10, i14, i17, i15, i10)) {
                        iX = k.g(iV, (h) unsafe.getObject(t10, jW));
                        i16 = i20 + iX;
                        v0Var = this;
                    }
                    v0Var = this;
                    i16 = i20;
                    break;
                case 11:
                    if (v0Var.B(t10, i14, i17, i15, i10)) {
                        iX = k.V(iV, unsafe.getInt(t10, jW));
                        i16 = i20 + iX;
                        v0Var = this;
                    }
                    v0Var = this;
                    i16 = i20;
                    break;
                case 12:
                    if (v0Var.B(t10, i14, i17, i15, i10)) {
                        iX = k.k(iV, unsafe.getInt(t10, jW));
                        i16 = i20 + iX;
                        v0Var = this;
                    }
                    v0Var = this;
                    i16 = i20;
                    break;
                case 13:
                    if (v0Var.B(t10, i14, i17, i15, i10)) {
                        iQ = k.K(iV, 0);
                        i16 = i20 + iQ;
                        v0Var = this;
                        t10 = t8;
                    }
                    v0Var = this;
                    t10 = t8;
                    i16 = i20;
                    break;
                case 14:
                    if (v0Var.B(t10, i14, i17, i15, i10)) {
                        iQ = k.M(iV, 0L);
                        i16 = i20 + iQ;
                        v0Var = this;
                        t10 = t8;
                    }
                    v0Var = this;
                    t10 = t8;
                    i16 = i20;
                    break;
                case 15:
                    if (v0Var.B(t10, i14, i17, i15, i10)) {
                        iX = k.O(iV, unsafe.getInt(t10, jW));
                        i16 = i20 + iX;
                        v0Var = this;
                    }
                    v0Var = this;
                    i16 = i20;
                    break;
                case 16:
                    if (v0Var.B(t10, i14, i17, i15, i10)) {
                        iX = k.Q(iV, unsafe.getLong(t10, jW));
                        i16 = i20 + iX;
                        v0Var = this;
                    }
                    v0Var = this;
                    i16 = i20;
                    break;
                case 17:
                    if (!v0Var.B(t10, i14, i17, i15, i10)) {
                        i16 = i20;
                    } else {
                        i11 = k.s(iV, (s0) unsafe.getObject(t10, jW), v0Var.v(i14));
                        i16 = i20 + i11;
                    }
                    break;
                case 18:
                    i11 = i1.h(iV, (List) unsafe.getObject(t10, jW), false);
                    i16 = i20 + i11;
                    break;
                case 19:
                    i11 = i1.f(iV, (List) unsafe.getObject(t10, jW), false);
                    i16 = i20 + i11;
                    break;
                case 20:
                    i11 = i1.m(iV, (List) unsafe.getObject(t10, jW), false);
                    i16 = i20 + i11;
                    break;
                case 21:
                    i11 = i1.x(iV, (List) unsafe.getObject(t10, jW), false);
                    i16 = i20 + i11;
                    break;
                case 22:
                    i11 = i1.k(iV, (List) unsafe.getObject(t10, jW), false);
                    i16 = i20 + i11;
                    break;
                case 23:
                    i11 = i1.h(iV, (List) unsafe.getObject(t10, jW), false);
                    i16 = i20 + i11;
                    break;
                case 24:
                    i11 = i1.f(iV, (List) unsafe.getObject(t10, jW), false);
                    i16 = i20 + i11;
                    break;
                case 25:
                    i11 = i1.a(iV, (List) unsafe.getObject(t10, jW), false);
                    i16 = i20 + i11;
                    break;
                case 26:
                    i11 = i1.u(iV, (List) unsafe.getObject(t10, jW));
                    i16 = i20 + i11;
                    break;
                case 27:
                    i11 = i1.p(iV, (List) unsafe.getObject(t10, jW), v0Var.v(i14));
                    i16 = i20 + i11;
                    break;
                case 28:
                    i11 = i1.c(iV, (List) unsafe.getObject(t10, jW));
                    i16 = i20 + i11;
                    break;
                case 29:
                    i11 = i1.v(iV, (List) unsafe.getObject(t10, jW), false);
                    i16 = i20 + i11;
                    break;
                case 30:
                    i11 = i1.d(iV, (List) unsafe.getObject(t10, jW), false);
                    i16 = i20 + i11;
                    break;
                case 31:
                    i11 = i1.f(iV, (List) unsafe.getObject(t10, jW), false);
                    i16 = i20 + i11;
                    break;
                case 32:
                    i11 = i1.h(iV, (List) unsafe.getObject(t10, jW), false);
                    i16 = i20 + i11;
                    break;
                case 33:
                    i11 = i1.q(iV, (List) unsafe.getObject(t10, jW), false);
                    i16 = i20 + i11;
                    break;
                case 34:
                    i11 = i1.s(iV, (List) unsafe.getObject(t10, jW), false);
                    i16 = i20 + i11;
                    break;
                case 35:
                    i12 = i1.i((List) unsafe.getObject(t10, jW));
                    if (i12 <= 0) {
                        i16 = i20;
                    } else {
                        if (v0Var.f8638i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        iU = k.U(iV);
                        iW = k.W(i12);
                        i16 = i20 + iU + iW + i12;
                    }
                    break;
                case 36:
                    i12 = i1.g((List) unsafe.getObject(t10, jW));
                    if (i12 <= 0) {
                        i16 = i20;
                    } else {
                        if (v0Var.f8638i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        iU = k.U(iV);
                        iW = k.W(i12);
                        i16 = i20 + iU + iW + i12;
                    }
                    break;
                case 37:
                    i12 = i1.n((List) unsafe.getObject(t10, jW));
                    if (i12 <= 0) {
                        i16 = i20;
                    } else {
                        if (v0Var.f8638i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        iU = k.U(iV);
                        iW = k.W(i12);
                        i16 = i20 + iU + iW + i12;
                    }
                    break;
                case 38:
                    i12 = i1.y((List) unsafe.getObject(t10, jW));
                    if (i12 <= 0) {
                        i16 = i20;
                    } else {
                        if (v0Var.f8638i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        iU = k.U(iV);
                        iW = k.W(i12);
                        i16 = i20 + iU + iW + i12;
                    }
                    break;
                case 39:
                    i12 = i1.l((List) unsafe.getObject(t10, jW));
                    if (i12 <= 0) {
                        i16 = i20;
                    } else {
                        if (v0Var.f8638i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        iU = k.U(iV);
                        iW = k.W(i12);
                        i16 = i20 + iU + iW + i12;
                    }
                    break;
                case 40:
                    i12 = i1.i((List) unsafe.getObject(t10, jW));
                    if (i12 <= 0) {
                        i16 = i20;
                    } else {
                        if (v0Var.f8638i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        iU = k.U(iV);
                        iW = k.W(i12);
                        i16 = i20 + iU + iW + i12;
                    }
                    break;
                case 41:
                    i12 = i1.g((List) unsafe.getObject(t10, jW));
                    if (i12 <= 0) {
                        i16 = i20;
                    } else {
                        if (v0Var.f8638i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        iU = k.U(iV);
                        iW = k.W(i12);
                        i16 = i20 + iU + iW + i12;
                    }
                    break;
                case 42:
                    i12 = i1.b((List) unsafe.getObject(t10, jW));
                    if (i12 <= 0) {
                        i16 = i20;
                    } else {
                        if (v0Var.f8638i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        iU = k.U(iV);
                        iW = k.W(i12);
                        i16 = i20 + iU + iW + i12;
                    }
                    break;
                case 43:
                    i12 = i1.w((List) unsafe.getObject(t10, jW));
                    if (i12 <= 0) {
                        i16 = i20;
                    } else {
                        if (v0Var.f8638i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        iU = k.U(iV);
                        iW = k.W(i12);
                        i16 = i20 + iU + iW + i12;
                    }
                    break;
                case 44:
                    i12 = i1.e((List) unsafe.getObject(t10, jW));
                    if (i12 <= 0) {
                        i16 = i20;
                    } else {
                        if (v0Var.f8638i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        iU = k.U(iV);
                        iW = k.W(i12);
                        i16 = i20 + iU + iW + i12;
                    }
                    break;
                case 45:
                    i12 = i1.g((List) unsafe.getObject(t10, jW));
                    if (i12 <= 0) {
                        i16 = i20;
                    } else {
                        if (v0Var.f8638i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        iU = k.U(iV);
                        iW = k.W(i12);
                        i16 = i20 + iU + iW + i12;
                    }
                    break;
                case 46:
                    i12 = i1.i((List) unsafe.getObject(t10, jW));
                    if (i12 <= 0) {
                        i16 = i20;
                    } else {
                        if (v0Var.f8638i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        iU = k.U(iV);
                        iW = k.W(i12);
                        i16 = i20 + iU + iW + i12;
                    }
                    break;
                case 47:
                    i12 = i1.r((List) unsafe.getObject(t10, jW));
                    if (i12 <= 0) {
                        i16 = i20;
                    } else {
                        if (v0Var.f8638i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        iU = k.U(iV);
                        iW = k.W(i12);
                        i16 = i20 + iU + iW + i12;
                    }
                    break;
                case 48:
                    i12 = i1.t((List) unsafe.getObject(t10, jW));
                    if (i12 <= 0) {
                        i16 = i20;
                    } else {
                        if (v0Var.f8638i) {
                            unsafe.putInt(t10, i19, i12);
                        }
                        iU = k.U(iV);
                        iW = k.W(i12);
                        i16 = i20 + iU + iW + i12;
                    }
                    break;
                case 49:
                    i11 = i1.j(iV, (List) unsafe.getObject(t10, jW), v0Var.v(i14));
                    i16 = i20 + i11;
                    break;
                case 50:
                    i11 = v0Var.f8646q.g(iV, unsafe.getObject(t10, jW), v0Var.u(i14));
                    i16 = i20 + i11;
                    break;
                case 51:
                    if (!v0Var.I(t10, iV, i14)) {
                        i16 = i20;
                    } else {
                        i11 = k.i(iV, 0.0d);
                        i16 = i20 + i11;
                    }
                    break;
                case 52:
                    if (!v0Var.I(t10, iV, i14)) {
                        i16 = i20;
                    } else {
                        i11 = k.q(iV, 0.0f);
                        i16 = i20 + i11;
                    }
                    break;
                case 53:
                    if (!v0Var.I(t10, iV, i14)) {
                        i16 = i20;
                    } else {
                        i11 = k.x(iV, b0(t10, jW));
                        i16 = i20 + i11;
                    }
                    break;
                case 54:
                    if (!v0Var.I(t10, iV, i14)) {
                        i16 = i20;
                    } else {
                        i11 = k.X(iV, b0(t10, jW));
                        i16 = i20 + i11;
                    }
                    break;
                case 55:
                    if (!v0Var.I(t10, iV, i14)) {
                        i16 = i20;
                    } else {
                        i11 = k.v(iV, a0(t10, jW));
                        i16 = i20 + i11;
                    }
                    break;
                case 56:
                    if (!v0Var.I(t10, iV, i14)) {
                        i16 = i20;
                    } else {
                        i11 = k.o(iV, 0L);
                        i16 = i20 + i11;
                    }
                    break;
                case 57:
                    if (!v0Var.I(t10, iV, i14)) {
                        i16 = i20;
                    } else {
                        i11 = k.m(iV, 0);
                        i16 = i20 + i11;
                    }
                    break;
                case 58:
                    if (!v0Var.I(t10, iV, i14)) {
                        i16 = i20;
                    } else {
                        i11 = k.d(iV, true);
                        i16 = i20 + i11;
                    }
                    break;
                case 59:
                    if (!v0Var.I(t10, iV, i14)) {
                        i16 = i20;
                    } else {
                        Object object2 = unsafe.getObject(t10, jW);
                        i11 = object2 instanceof h ? k.g(iV, (h) object2) : k.S(iV, (String) object2);
                        i16 = i20 + i11;
                    }
                    break;
                case 60:
                    if (!v0Var.I(t10, iV, i14)) {
                        i16 = i20;
                    } else {
                        i11 = i1.o(iV, unsafe.getObject(t10, jW), v0Var.v(i14));
                        i16 = i20 + i11;
                    }
                    break;
                case 61:
                    if (!v0Var.I(t10, iV, i14)) {
                        i16 = i20;
                    } else {
                        i11 = k.g(iV, (h) unsafe.getObject(t10, jW));
                        i16 = i20 + i11;
                    }
                    break;
                case 62:
                    if (!v0Var.I(t10, iV, i14)) {
                        i16 = i20;
                    } else {
                        i11 = k.V(iV, a0(t10, jW));
                        i16 = i20 + i11;
                    }
                    break;
                case 63:
                    if (!v0Var.I(t10, iV, i14)) {
                        i16 = i20;
                    } else {
                        i11 = k.k(iV, a0(t10, jW));
                        i16 = i20 + i11;
                    }
                    break;
                case 64:
                    if (!v0Var.I(t10, iV, i14)) {
                        i16 = i20;
                    } else {
                        i11 = k.K(iV, 0);
                        i16 = i20 + i11;
                    }
                    break;
                case 65:
                    if (!v0Var.I(t10, iV, i14)) {
                        i16 = i20;
                    } else {
                        i11 = k.M(iV, 0L);
                        i16 = i20 + i11;
                    }
                    break;
                case 66:
                    if (!v0Var.I(t10, iV, i14)) {
                        i16 = i20;
                    } else {
                        i11 = k.O(iV, a0(t10, jW));
                        i16 = i20 + i11;
                    }
                    break;
                case 67:
                    if (!v0Var.I(t10, iV, i14)) {
                        i16 = i20;
                    } else {
                        i11 = k.Q(iV, b0(t10, jW));
                        i16 = i20 + i11;
                    }
                    break;
                case 68:
                    if (!v0Var.I(t10, iV, i14)) {
                        i16 = i20;
                    } else {
                        i11 = k.s(iV, (s0) unsafe.getObject(t10, jW), v0Var.v(i14));
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
        int iX2 = i16 + v0Var.x(v0Var.f8644o, t10);
        return v0Var.f8635f ? iX2 + v0Var.f8645p.c(t10).l() : iX2;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12321. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public int d0(T r27, byte[] r28, int r29, int r30, int r31, com.google.crypto.tink.shaded.protobuf.e.b r32) {
        /*
            Method dump skipped, instruction units count: 1232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.v0.d0(java.lang.Object, byte[], int, int, int, com.google.crypto.tink.shaded.protobuf.e$b):int");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public T e() {
        return (T) this.f8642m.a(this.f8634e);
    }

    public final int e0(T t8, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, e.b bVar) throws b0 {
        Unsafe unsafe = f8630s;
        long j11 = this.f8631a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(t8, j10, Double.valueOf(e.e(bArr, i10)));
                int i18 = i10 + 8;
                unsafe.putInt(t8, j11, i13);
                return i18;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(t8, j10, Float.valueOf(e.m(bArr, i10)));
                int i19 = i10 + 4;
                unsafe.putInt(t8, j11, i13);
                return i19;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                int iM = e.M(bArr, i10, bVar);
                unsafe.putObject(t8, j10, Long.valueOf(bVar.b));
                unsafe.putInt(t8, j11, i13);
                return iM;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int iJ = e.J(bArr, i10, bVar);
                unsafe.putObject(t8, j10, Integer.valueOf(bVar.f8424a));
                unsafe.putInt(t8, j11, i13);
                return iJ;
            case 56:
            case 65:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(t8, j10, Long.valueOf(e.k(bArr, i10)));
                int i20 = i10 + 8;
                unsafe.putInt(t8, j11, i13);
                return i20;
            case 57:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(t8, j10, Integer.valueOf(e.i(bArr, i10)));
                int i21 = i10 + 4;
                unsafe.putInt(t8, j11, i13);
                return i21;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                int iM2 = e.M(bArr, i10, bVar);
                unsafe.putObject(t8, j10, Boolean.valueOf(bVar.b != 0));
                unsafe.putInt(t8, j11, i13);
                return iM2;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int iJ2 = e.J(bArr, i10, bVar);
                int i22 = bVar.f8424a;
                if (i22 == 0) {
                    unsafe.putObject(t8, j10, "");
                } else {
                    if ((i15 & 536870912) != 0 && !r1.m(bArr, iJ2, iJ2 + i22)) {
                        throw b0.d();
                    }
                    unsafe.putObject(t8, j10, new String(bArr, iJ2, i22, a0.b));
                    iJ2 += i22;
                }
                unsafe.putInt(t8, j11, i13);
                return iJ2;
            case 60:
                if (i14 != 2) {
                    return i10;
                }
                Object objR = R(t8, i13, i17);
                int iP = e.P(objR, v(i17), bArr, i10, i11, bVar);
                s0(t8, i13, i17, objR);
                return iP;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                int iC = e.c(bArr, i10, bVar);
                unsafe.putObject(t8, j10, bVar.f8425c);
                unsafe.putInt(t8, j11, i13);
                return iC;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int iJ3 = e.J(bArr, i10, bVar);
                int i23 = bVar.f8424a;
                a0.e eVarT = t(i17);
                if (eVarT != null && !eVarT.a(i23)) {
                    w(t8).n(i12, Long.valueOf(i23));
                    return iJ3;
                }
                unsafe.putObject(t8, j10, Integer.valueOf(i23));
                unsafe.putInt(t8, j11, i13);
                return iJ3;
            case 66:
                if (i14 != 0) {
                    return i10;
                }
                int iJ4 = e.J(bArr, i10, bVar);
                unsafe.putObject(t8, j10, Integer.valueOf(i.c(bVar.f8424a)));
                unsafe.putInt(t8, j11, i13);
                return iJ4;
            case 67:
                if (i14 != 0) {
                    return i10;
                }
                int iM3 = e.M(bArr, i10, bVar);
                unsafe.putObject(t8, j10, Long.valueOf(i.d(bVar.b)));
                unsafe.putInt(t8, j11, i13);
                return iM3;
            case 68:
                if (i14 == 3) {
                    Object objR2 = R(t8, i13, i17);
                    int iO = e.O(objR2, v(i17), bArr, i10, i11, (i12 & (-8)) | 4, bVar);
                    s0(t8, i13, i17, objR2);
                    return iO;
                }
                break;
        }
        return i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public int f(T t8) {
        int i10;
        int iF;
        int length = this.f8631a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iU0 = u0(i12);
            int iV = V(i12);
            long jW = W(iU0);
            int iHashCode = 37;
            switch (t0(iU0)) {
                case 0:
                    i10 = i11 * 53;
                    iF = a0.f(Double.doubleToLongBits(q1.x(t8, jW)));
                    i11 = i10 + iF;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iF = Float.floatToIntBits(q1.y(t8, jW));
                    i11 = i10 + iF;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iF = a0.f(q1.A(t8, jW));
                    i11 = i10 + iF;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iF = a0.f(q1.A(t8, jW));
                    i11 = i10 + iF;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iF = q1.z(t8, jW);
                    i11 = i10 + iF;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iF = a0.f(q1.A(t8, jW));
                    i11 = i10 + iF;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iF = q1.z(t8, jW);
                    i11 = i10 + iF;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iF = a0.c(q1.r(t8, jW));
                    i11 = i10 + iF;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iF = ((String) q1.C(t8, jW)).hashCode();
                    i11 = i10 + iF;
                    break;
                case 9:
                    Object objC = q1.C(t8, jW);
                    if (objC != null) {
                        iHashCode = objC.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iF = q1.C(t8, jW).hashCode();
                    i11 = i10 + iF;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iF = q1.z(t8, jW);
                    i11 = i10 + iF;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iF = q1.z(t8, jW);
                    i11 = i10 + iF;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iF = q1.z(t8, jW);
                    i11 = i10 + iF;
                    break;
                case 14:
                    i10 = i11 * 53;
                    iF = a0.f(q1.A(t8, jW));
                    i11 = i10 + iF;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iF = q1.z(t8, jW);
                    i11 = i10 + iF;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iF = a0.f(q1.A(t8, jW));
                    i11 = i10 + iF;
                    break;
                case 17:
                    Object objC2 = q1.C(t8, jW);
                    if (objC2 != null) {
                        iHashCode = objC2.hashCode();
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
                    iF = q1.C(t8, jW).hashCode();
                    i11 = i10 + iF;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iF = q1.C(t8, jW).hashCode();
                    i11 = i10 + iF;
                    break;
                case 51:
                    if (I(t8, iV, i12)) {
                        i10 = i11 * 53;
                        iF = a0.f(Double.doubleToLongBits(Y(t8, jW)));
                        i11 = i10 + iF;
                    }
                    break;
                case 52:
                    if (I(t8, iV, i12)) {
                        i10 = i11 * 53;
                        iF = Float.floatToIntBits(Z(t8, jW));
                        i11 = i10 + iF;
                    }
                    break;
                case 53:
                    if (I(t8, iV, i12)) {
                        i10 = i11 * 53;
                        iF = a0.f(b0(t8, jW));
                        i11 = i10 + iF;
                    }
                    break;
                case 54:
                    if (I(t8, iV, i12)) {
                        i10 = i11 * 53;
                        iF = a0.f(b0(t8, jW));
                        i11 = i10 + iF;
                    }
                    break;
                case 55:
                    if (I(t8, iV, i12)) {
                        i10 = i11 * 53;
                        iF = a0(t8, jW);
                        i11 = i10 + iF;
                    }
                    break;
                case 56:
                    if (I(t8, iV, i12)) {
                        i10 = i11 * 53;
                        iF = a0.f(b0(t8, jW));
                        i11 = i10 + iF;
                    }
                    break;
                case 57:
                    if (I(t8, iV, i12)) {
                        i10 = i11 * 53;
                        iF = a0(t8, jW);
                        i11 = i10 + iF;
                    }
                    break;
                case 58:
                    if (I(t8, iV, i12)) {
                        i10 = i11 * 53;
                        iF = a0.c(X(t8, jW));
                        i11 = i10 + iF;
                    }
                    break;
                case 59:
                    if (I(t8, iV, i12)) {
                        i10 = i11 * 53;
                        iF = ((String) q1.C(t8, jW)).hashCode();
                        i11 = i10 + iF;
                    }
                    break;
                case 60:
                    if (I(t8, iV, i12)) {
                        i10 = i11 * 53;
                        iF = q1.C(t8, jW).hashCode();
                        i11 = i10 + iF;
                    }
                    break;
                case 61:
                    if (I(t8, iV, i12)) {
                        i10 = i11 * 53;
                        iF = q1.C(t8, jW).hashCode();
                        i11 = i10 + iF;
                    }
                    break;
                case 62:
                    if (I(t8, iV, i12)) {
                        i10 = i11 * 53;
                        iF = a0(t8, jW);
                        i11 = i10 + iF;
                    }
                    break;
                case 63:
                    if (I(t8, iV, i12)) {
                        i10 = i11 * 53;
                        iF = a0(t8, jW);
                        i11 = i10 + iF;
                    }
                    break;
                case 64:
                    if (I(t8, iV, i12)) {
                        i10 = i11 * 53;
                        iF = a0(t8, jW);
                        i11 = i10 + iF;
                    }
                    break;
                case 65:
                    if (I(t8, iV, i12)) {
                        i10 = i11 * 53;
                        iF = a0.f(b0(t8, jW));
                        i11 = i10 + iF;
                    }
                    break;
                case 66:
                    if (I(t8, iV, i12)) {
                        i10 = i11 * 53;
                        iF = a0(t8, jW);
                        i11 = i10 + iF;
                    }
                    break;
                case 67:
                    if (I(t8, iV, i12)) {
                        i10 = i11 * 53;
                        iF = a0.f(b0(t8, jW));
                        i11 = i10 + iF;
                    }
                    break;
                case 68:
                    if (I(t8, iV, i12)) {
                        i10 = i11 * 53;
                        iF = q1.C(t8, jW).hashCode();
                        i11 = i10 + iF;
                    }
                    break;
            }
        }
        int iHashCode2 = (i11 * 53) + this.f8644o.g(t8).hashCode();
        return this.f8635f ? (iHashCode2 * 53) + this.f8645p.c(t8).hashCode() : iHashCode2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int f0(T t8, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, e.b bVar) throws b0 {
        int iK;
        Unsafe unsafe = f8630s;
        a0.i iVarO = (a0.i) unsafe.getObject(t8, j11);
        if (!iVarO.n()) {
            int size = iVarO.size();
            iVarO = iVarO.o(size == 0 ? 10 : size * 2);
            unsafe.putObject(t8, j11, iVarO);
        }
        a0.i iVar = iVarO;
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    return e.t(bArr, i10, iVar, bVar);
                }
                if (i14 == 1) {
                    return e.f(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 19:
            case 36:
                if (i14 == 2) {
                    return e.w(bArr, i10, iVar, bVar);
                }
                if (i14 == 5) {
                    return e.n(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    return e.A(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return e.N(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i14 == 2) {
                    return e.z(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return e.K(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i14 == 2) {
                    return e.v(bArr, i10, iVar, bVar);
                }
                if (i14 == 1) {
                    return e.l(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    return e.u(bArr, i10, iVar, bVar);
                }
                if (i14 == 5) {
                    return e.j(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 25:
            case 42:
                if (i14 == 2) {
                    return e.s(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return e.b(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 26:
                if (i14 == 2) {
                    return (j10 & 536870912) == 0 ? e.E(i12, bArr, i10, i11, iVar, bVar) : e.F(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 27:
                if (i14 == 2) {
                    return e.r(v(i15), i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 28:
                if (i14 == 2) {
                    return e.d(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 30:
            case 44:
                if (i14 != 2) {
                    if (i14 == 0) {
                        iK = e.K(i12, bArr, i10, i11, iVar, bVar);
                    }
                    return i10;
                }
                iK = e.z(bArr, i10, iVar, bVar);
                i1.A(t8, i13, iVar, t(i15), null, this.f8644o);
                return iK;
            case 33:
            case 47:
                if (i14 == 2) {
                    return e.x(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return e.B(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 34:
            case 48:
                if (i14 == 2) {
                    return e.y(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return e.C(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 49:
                if (i14 == 3) {
                    return e.p(v(i15), i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            default:
                return i10;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public boolean g(T t8, T t10) {
        int length = this.f8631a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!p(t8, t10, i10)) {
                return false;
            }
        }
        if (!this.f8644o.g(t8).equals(this.f8644o.g(t10))) {
            return false;
        }
        if (this.f8635f) {
            return this.f8645p.c(t8).equals(this.f8645p.c(t10));
        }
        return true;
    }

    public final int g0(int i10) {
        if (i10 < this.f8632c || i10 > this.f8633d) {
            return -1;
        }
        return q0(i10, 0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void h(T t8, byte[] bArr, int i10, int i11, e.b bVar) {
        d0(t8, bArr, i10, i11, 0, bVar);
    }

    public final int h0(int i10, int i11) {
        if (i10 < this.f8632c || i10 > this.f8633d) {
            return -1;
        }
        return q0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void i(T t8, f1 f1Var, p pVar) {
        pVar.getClass();
        m(t8);
        L(this.f8644o, this.f8645p, t8, f1Var, pVar);
    }

    public final int i0(int i10) {
        return this.f8631a[i10 + 2];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void j(T t8, t1 t1Var) {
        if (t1Var.t() == t1.a.DESCENDING) {
            w0(t8, t1Var);
        } else {
            v0(t8, t1Var);
        }
    }

    public final <E> void j0(Object obj, long j10, f1 f1Var, g1<E> g1Var, p pVar) {
        f1Var.P(this.f8643n.c(obj, j10), g1Var, pVar);
    }

    public final boolean k(T t8, T t10, int i10) {
        return A(t8, i10) == A(t10, i10);
    }

    public final <E> void k0(Object obj, int i10, f1 f1Var, g1<E> g1Var, p pVar) {
        f1Var.N(this.f8643n.c(obj, W(i10)), g1Var, pVar);
    }

    public final void l0(Object obj, int i10, f1 f1Var) {
        if (z(i10)) {
            q1.R(obj, W(i10), f1Var.I());
        } else if (this.f8636g) {
            q1.R(obj, W(i10), f1Var.z());
        } else {
            q1.R(obj, W(i10), f1Var.o());
        }
    }

    public final void m0(Object obj, int i10, f1 f1Var) {
        if (z(i10)) {
            f1Var.n(this.f8643n.c(obj, W(i10)));
        } else {
            f1Var.B(this.f8643n.c(obj, W(i10)));
        }
    }

    public final <K, V> int n(byte[] bArr, int i10, int i11, l0.a<K, V> aVar, Map<K, V> map, e.b bVar) throws b0 {
        int iJ = e.J(bArr, i10, bVar);
        int i12 = bVar.f8424a;
        if (i12 < 0 || i12 > i11 - iJ) {
            throw b0.m();
        }
        throw null;
    }

    public final void o0(T t8, int i10) {
        int iI0 = i0(i10);
        long j10 = 1048575 & iI0;
        if (j10 == 1048575) {
            return;
        }
        q1.P(t8, j10, (1 << (iI0 >>> 20)) | q1.z(t8, j10));
    }

    public final boolean p(T t8, T t10, int i10) {
        int iU0 = u0(i10);
        long jW = W(iU0);
        switch (t0(iU0)) {
            case 0:
                return k(t8, t10, i10) && Double.doubleToLongBits(q1.x(t8, jW)) == Double.doubleToLongBits(q1.x(t10, jW));
            case 1:
                return k(t8, t10, i10) && Float.floatToIntBits(q1.y(t8, jW)) == Float.floatToIntBits(q1.y(t10, jW));
            case 2:
                return k(t8, t10, i10) && q1.A(t8, jW) == q1.A(t10, jW);
            case 3:
                return k(t8, t10, i10) && q1.A(t8, jW) == q1.A(t10, jW);
            case 4:
                return k(t8, t10, i10) && q1.z(t8, jW) == q1.z(t10, jW);
            case 5:
                return k(t8, t10, i10) && q1.A(t8, jW) == q1.A(t10, jW);
            case 6:
                return k(t8, t10, i10) && q1.z(t8, jW) == q1.z(t10, jW);
            case 7:
                return k(t8, t10, i10) && q1.r(t8, jW) == q1.r(t10, jW);
            case 8:
                return k(t8, t10, i10) && i1.I(q1.C(t8, jW), q1.C(t10, jW));
            case 9:
                return k(t8, t10, i10) && i1.I(q1.C(t8, jW), q1.C(t10, jW));
            case 10:
                return k(t8, t10, i10) && i1.I(q1.C(t8, jW), q1.C(t10, jW));
            case 11:
                return k(t8, t10, i10) && q1.z(t8, jW) == q1.z(t10, jW);
            case 12:
                return k(t8, t10, i10) && q1.z(t8, jW) == q1.z(t10, jW);
            case 13:
                return k(t8, t10, i10) && q1.z(t8, jW) == q1.z(t10, jW);
            case 14:
                return k(t8, t10, i10) && q1.A(t8, jW) == q1.A(t10, jW);
            case 15:
                return k(t8, t10, i10) && q1.z(t8, jW) == q1.z(t10, jW);
            case 16:
                return k(t8, t10, i10) && q1.A(t8, jW) == q1.A(t10, jW);
            case 17:
                return k(t8, t10, i10) && i1.I(q1.C(t8, jW), q1.C(t10, jW));
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
                return i1.I(q1.C(t8, jW), q1.C(t10, jW));
            case 50:
                return i1.I(q1.C(t8, jW), q1.C(t10, jW));
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
                return H(t8, t10, i10) && i1.I(q1.C(t8, jW), q1.C(t10, jW));
            default:
                return true;
        }
    }

    public final void p0(T t8, int i10, int i11) {
        q1.P(t8, i0(i11) & 1048575, i10);
    }

    public final <UT, UB> UB q(Object obj, int i10, UB ub, n1<UT, UB> n1Var, Object obj2) {
        a0.e eVarT;
        int iV = V(i10);
        Object objC = q1.C(obj, W(u0(i10)));
        return (objC == null || (eVarT = t(i10)) == null) ? ub : (UB) r(i10, iV, this.f8646q.c(objC), eVarT, ub, n1Var, obj2);
    }

    public final int q0(int i10, int i11) {
        int length = (this.f8631a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int iV = V(i13);
            if (i10 == iV) {
                return i13;
            }
            if (i10 < iV) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    public final <K, V, UT, UB> UB r(int i10, int i11, Map<K, V> map, a0.e eVar, UB ub, n1<UT, UB> n1Var, Object obj) {
        this.f8646q.b(u(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = n1Var.f(obj);
                }
                h.C0127h c0127hL = h.l(l0.b(null, next.getKey(), next.getValue()));
                try {
                    l0.d(c0127hL.b(), null, next.getKey(), next.getValue());
                    n1Var.d(ub, i11, c0127hL.a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub;
    }

    public final void r0(T t8, int i10, Object obj) {
        f8630s.putObject(t8, W(u0(i10)), obj);
        o0(t8, i10);
    }

    public final void s0(T t8, int i10, int i11, Object obj) {
        f8630s.putObject(t8, W(u0(i11)), obj);
        p0(t8, i10, i11);
    }

    public final a0.e t(int i10) {
        return (a0.e) this.b[((i10 / 3) * 2) + 1];
    }

    public final Object u(int i10) {
        return this.b[(i10 / 3) * 2];
    }

    public final int u0(int i10) {
        return this.f8631a[i10 + 1];
    }

    public final g1 v(int i10) {
        int i11 = (i10 / 3) * 2;
        g1 g1Var = (g1) this.b[i11];
        if (g1Var != null) {
            return g1Var;
        }
        g1<T> g1VarC = c1.a().c((Class) this.b[i11 + 1]);
        this.b[i11] = g1VarC;
        return g1VarC;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    public final void v0(T t8, t1 t1Var) {
        Map.Entry<?, ?> entry;
        Iterator it;
        boolean z10;
        int i10;
        int i11;
        int i12;
        boolean z11;
        v0<T> v0Var = this;
        if (v0Var.f8635f) {
            u<T> uVarC = v0Var.f8645p.c(t8);
            if (uVarC.m()) {
                entry = null;
                it = null;
            } else {
                Iterator itS = uVarC.s();
                entry = (Map.Entry) itS.next();
                it = itS;
            }
        } else {
            entry = null;
            it = null;
        }
        int length = v0Var.f8631a.length;
        Unsafe unsafe = f8630s;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length) {
            int iU0 = v0Var.u0(i14);
            int iV = v0Var.V(i14);
            int iT0 = t0(iU0);
            if (iT0 <= 17) {
                int i16 = v0Var.f8631a[i14 + 2];
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
            while (entry != null && v0Var.f8645p.a(entry) <= iV) {
                v0Var.f8645p.j(t1Var, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long jW = W(iU0);
            switch (iT0) {
                case 0:
                    if (v0Var.B(t8, i14, i10, i11, i12)) {
                        t1Var.p(iV, o(t8, jW));
                    }
                    break;
                case 1:
                    if (v0Var.B(t8, i14, i10, i11, i12)) {
                        t1Var.B(iV, s(t8, jW));
                    }
                    v0Var = this;
                    break;
                case 2:
                    if (v0Var.B(t8, i14, i10, i11, i12)) {
                        t1Var.u(iV, unsafe.getLong(t8, jW));
                    }
                    v0Var = this;
                    break;
                case 3:
                    if (v0Var.B(t8, i14, i10, i11, i12)) {
                        t1Var.f(iV, unsafe.getLong(t8, jW));
                    }
                    v0Var = this;
                    break;
                case 4:
                    if (v0Var.B(t8, i14, i10, i11, i12)) {
                        t1Var.h(iV, unsafe.getInt(t8, jW));
                    }
                    v0Var = this;
                    break;
                case 5:
                    if (v0Var.B(t8, i14, i10, i11, i12)) {
                        t1Var.s(iV, unsafe.getLong(t8, jW));
                    }
                    v0Var = this;
                    break;
                case 6:
                    if (v0Var.B(t8, i14, i10, i11, i12)) {
                        t1Var.c(iV, unsafe.getInt(t8, jW));
                    }
                    v0Var = this;
                    break;
                case 7:
                    if (v0Var.B(t8, i14, i10, i11, i12)) {
                        t1Var.v(iV, l(t8, jW));
                    }
                    v0Var = this;
                    break;
                case 8:
                    if (v0Var.B(t8, i14, i10, i11, i12)) {
                        v0Var.y0(iV, unsafe.getObject(t8, jW), t1Var);
                    }
                    break;
                case 9:
                    if (v0Var.B(t8, i14, i10, i11, i12)) {
                        t1Var.N(iV, unsafe.getObject(t8, jW), v0Var.v(i14));
                    }
                    break;
                case 10:
                    if (v0Var.B(t8, i14, i10, i11, i12)) {
                        t1Var.M(iV, (h) unsafe.getObject(t8, jW));
                    }
                    v0Var = this;
                    break;
                case 11:
                    if (v0Var.B(t8, i14, i10, i11, i12)) {
                        t1Var.o(iV, unsafe.getInt(t8, jW));
                    }
                    v0Var = this;
                    break;
                case 12:
                    if (v0Var.B(t8, i14, i10, i11, i12)) {
                        t1Var.E(iV, unsafe.getInt(t8, jW));
                    }
                    v0Var = this;
                    break;
                case 13:
                    if (v0Var.B(t8, i14, i10, i11, i12)) {
                        t1Var.w(iV, unsafe.getInt(t8, jW));
                    }
                    v0Var = this;
                    break;
                case 14:
                    if (v0Var.B(t8, i14, i10, i11, i12)) {
                        t1Var.i(iV, unsafe.getLong(t8, jW));
                    }
                    v0Var = this;
                    break;
                case 15:
                    if (v0Var.B(t8, i14, i10, i11, i12)) {
                        t1Var.H(iV, unsafe.getInt(t8, jW));
                    }
                    v0Var = this;
                    break;
                case 16:
                    if (v0Var.B(t8, i14, i10, i11, i12)) {
                        t1Var.m(iV, unsafe.getLong(t8, jW));
                    }
                    v0Var = this;
                    break;
                case 17:
                    if (v0Var.B(t8, i14, i10, i11, i12)) {
                        t1Var.K(iV, unsafe.getObject(t8, jW), v0Var.v(i14));
                    }
                    break;
                case 18:
                    i1.O(v0Var.V(i14), (List) unsafe.getObject(t8, jW), t1Var, false);
                    break;
                case 19:
                    i1.S(v0Var.V(i14), (List) unsafe.getObject(t8, jW), t1Var, false);
                    break;
                case 20:
                    i1.V(v0Var.V(i14), (List) unsafe.getObject(t8, jW), t1Var, false);
                    break;
                case 21:
                    i1.d0(v0Var.V(i14), (List) unsafe.getObject(t8, jW), t1Var, false);
                    break;
                case 22:
                    i1.U(v0Var.V(i14), (List) unsafe.getObject(t8, jW), t1Var, false);
                    break;
                case 23:
                    i1.R(v0Var.V(i14), (List) unsafe.getObject(t8, jW), t1Var, false);
                    break;
                case 24:
                    i1.Q(v0Var.V(i14), (List) unsafe.getObject(t8, jW), t1Var, false);
                    break;
                case 25:
                    i1.M(v0Var.V(i14), (List) unsafe.getObject(t8, jW), t1Var, false);
                    break;
                case 26:
                    i1.b0(v0Var.V(i14), (List) unsafe.getObject(t8, jW), t1Var);
                    break;
                case 27:
                    i1.W(v0Var.V(i14), (List) unsafe.getObject(t8, jW), t1Var, v0Var.v(i14));
                    break;
                case 28:
                    i1.N(v0Var.V(i14), (List) unsafe.getObject(t8, jW), t1Var);
                    break;
                case 29:
                    z11 = false;
                    i1.c0(v0Var.V(i14), (List) unsafe.getObject(t8, jW), t1Var, false);
                    break;
                case 30:
                    z11 = false;
                    i1.P(v0Var.V(i14), (List) unsafe.getObject(t8, jW), t1Var, false);
                    break;
                case 31:
                    z11 = false;
                    i1.X(v0Var.V(i14), (List) unsafe.getObject(t8, jW), t1Var, false);
                    break;
                case 32:
                    z11 = false;
                    i1.Y(v0Var.V(i14), (List) unsafe.getObject(t8, jW), t1Var, false);
                    break;
                case 33:
                    z11 = false;
                    i1.Z(v0Var.V(i14), (List) unsafe.getObject(t8, jW), t1Var, false);
                    break;
                case 34:
                    z11 = false;
                    i1.a0(v0Var.V(i14), (List) unsafe.getObject(t8, jW), t1Var, false);
                    break;
                case 35:
                    i1.O(v0Var.V(i14), (List) unsafe.getObject(t8, jW), t1Var, z10);
                    break;
                case 36:
                    i1.S(v0Var.V(i14), (List) unsafe.getObject(t8, jW), t1Var, z10);
                    break;
                case 37:
                    i1.V(v0Var.V(i14), (List) unsafe.getObject(t8, jW), t1Var, z10);
                    break;
                case 38:
                    i1.d0(v0Var.V(i14), (List) unsafe.getObject(t8, jW), t1Var, z10);
                    break;
                case 39:
                    i1.U(v0Var.V(i14), (List) unsafe.getObject(t8, jW), t1Var, z10);
                    break;
                case 40:
                    i1.R(v0Var.V(i14), (List) unsafe.getObject(t8, jW), t1Var, z10);
                    break;
                case 41:
                    i1.Q(v0Var.V(i14), (List) unsafe.getObject(t8, jW), t1Var, z10);
                    break;
                case 42:
                    i1.M(v0Var.V(i14), (List) unsafe.getObject(t8, jW), t1Var, z10);
                    break;
                case 43:
                    i1.c0(v0Var.V(i14), (List) unsafe.getObject(t8, jW), t1Var, z10);
                    break;
                case 44:
                    i1.P(v0Var.V(i14), (List) unsafe.getObject(t8, jW), t1Var, z10);
                    break;
                case 45:
                    i1.X(v0Var.V(i14), (List) unsafe.getObject(t8, jW), t1Var, z10);
                    break;
                case 46:
                    i1.Y(v0Var.V(i14), (List) unsafe.getObject(t8, jW), t1Var, z10);
                    break;
                case 47:
                    i1.Z(v0Var.V(i14), (List) unsafe.getObject(t8, jW), t1Var, z10);
                    break;
                case 48:
                    i1.a0(v0Var.V(i14), (List) unsafe.getObject(t8, jW), t1Var, z10);
                    break;
                case 49:
                    i1.T(v0Var.V(i14), (List) unsafe.getObject(t8, jW), t1Var, v0Var.v(i14));
                    break;
                case 50:
                    v0Var.x0(t1Var, iV, unsafe.getObject(t8, jW), i14);
                    break;
                case 51:
                    if (v0Var.I(t8, iV, i14)) {
                        t1Var.p(iV, Y(t8, jW));
                    }
                    break;
                case 52:
                    if (v0Var.I(t8, iV, i14)) {
                        t1Var.B(iV, Z(t8, jW));
                    }
                    break;
                case 53:
                    if (v0Var.I(t8, iV, i14)) {
                        t1Var.u(iV, b0(t8, jW));
                    }
                    break;
                case 54:
                    if (v0Var.I(t8, iV, i14)) {
                        t1Var.f(iV, b0(t8, jW));
                    }
                    break;
                case 55:
                    if (v0Var.I(t8, iV, i14)) {
                        t1Var.h(iV, a0(t8, jW));
                    }
                    break;
                case 56:
                    if (v0Var.I(t8, iV, i14)) {
                        t1Var.s(iV, b0(t8, jW));
                    }
                    break;
                case 57:
                    if (v0Var.I(t8, iV, i14)) {
                        t1Var.c(iV, a0(t8, jW));
                    }
                    break;
                case 58:
                    if (v0Var.I(t8, iV, i14)) {
                        t1Var.v(iV, X(t8, jW));
                    }
                    break;
                case 59:
                    if (v0Var.I(t8, iV, i14)) {
                        v0Var.y0(iV, unsafe.getObject(t8, jW), t1Var);
                    }
                    break;
                case 60:
                    if (v0Var.I(t8, iV, i14)) {
                        t1Var.N(iV, unsafe.getObject(t8, jW), v0Var.v(i14));
                    }
                    break;
                case 61:
                    if (v0Var.I(t8, iV, i14)) {
                        t1Var.M(iV, (h) unsafe.getObject(t8, jW));
                    }
                    break;
                case 62:
                    if (v0Var.I(t8, iV, i14)) {
                        t1Var.o(iV, a0(t8, jW));
                    }
                    break;
                case 63:
                    if (v0Var.I(t8, iV, i14)) {
                        t1Var.E(iV, a0(t8, jW));
                    }
                    break;
                case 64:
                    if (v0Var.I(t8, iV, i14)) {
                        t1Var.w(iV, a0(t8, jW));
                    }
                    break;
                case 65:
                    if (v0Var.I(t8, iV, i14)) {
                        t1Var.i(iV, b0(t8, jW));
                    }
                    break;
                case 66:
                    if (v0Var.I(t8, iV, i14)) {
                        t1Var.H(iV, a0(t8, jW));
                    }
                    break;
                case 67:
                    if (v0Var.I(t8, iV, i14)) {
                        t1Var.m(iV, b0(t8, jW));
                    }
                    break;
                case 68:
                    if (v0Var.I(t8, iV, i14)) {
                        t1Var.K(iV, unsafe.getObject(t8, jW), v0Var.v(i14));
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
            v0Var.f8645p.j(t1Var, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        v0Var.z0(v0Var.f8644o, t8, t1Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public final void w0(T t8, t1 t1Var) {
        Iterator itG;
        Map.Entry<?, ?> entry;
        z0(this.f8644o, t8, t1Var);
        if (this.f8635f) {
            u<T> uVarC = this.f8645p.c(t8);
            if (uVarC.m()) {
                itG = null;
                entry = null;
            } else {
                itG = uVarC.g();
                entry = (Map.Entry) itG.next();
            }
        } else {
            itG = null;
            entry = null;
        }
        for (int length = this.f8631a.length - 3; length >= 0; length -= 3) {
            int iU0 = u0(length);
            int iV = V(length);
            while (entry != null && this.f8645p.a(entry) > iV) {
                this.f8645p.j(t1Var, entry);
                entry = itG.hasNext() ? (Map.Entry) itG.next() : null;
            }
            switch (t0(iU0)) {
                case 0:
                    if (A(t8, length)) {
                        t1Var.p(iV, o(t8, W(iU0)));
                    }
                    break;
                case 1:
                    if (A(t8, length)) {
                        t1Var.B(iV, s(t8, W(iU0)));
                    }
                    break;
                case 2:
                    if (A(t8, length)) {
                        t1Var.u(iV, K(t8, W(iU0)));
                    }
                    break;
                case 3:
                    if (A(t8, length)) {
                        t1Var.f(iV, K(t8, W(iU0)));
                    }
                    break;
                case 4:
                    if (A(t8, length)) {
                        t1Var.h(iV, y(t8, W(iU0)));
                    }
                    break;
                case 5:
                    if (A(t8, length)) {
                        t1Var.s(iV, K(t8, W(iU0)));
                    }
                    break;
                case 6:
                    if (A(t8, length)) {
                        t1Var.c(iV, y(t8, W(iU0)));
                    }
                    break;
                case 7:
                    if (A(t8, length)) {
                        t1Var.v(iV, l(t8, W(iU0)));
                    }
                    break;
                case 8:
                    if (A(t8, length)) {
                        y0(iV, q1.C(t8, W(iU0)), t1Var);
                    }
                    break;
                case 9:
                    if (A(t8, length)) {
                        t1Var.N(iV, q1.C(t8, W(iU0)), v(length));
                    }
                    break;
                case 10:
                    if (A(t8, length)) {
                        t1Var.M(iV, (h) q1.C(t8, W(iU0)));
                    }
                    break;
                case 11:
                    if (A(t8, length)) {
                        t1Var.o(iV, y(t8, W(iU0)));
                    }
                    break;
                case 12:
                    if (A(t8, length)) {
                        t1Var.E(iV, y(t8, W(iU0)));
                    }
                    break;
                case 13:
                    if (A(t8, length)) {
                        t1Var.w(iV, y(t8, W(iU0)));
                    }
                    break;
                case 14:
                    if (A(t8, length)) {
                        t1Var.i(iV, K(t8, W(iU0)));
                    }
                    break;
                case 15:
                    if (A(t8, length)) {
                        t1Var.H(iV, y(t8, W(iU0)));
                    }
                    break;
                case 16:
                    if (A(t8, length)) {
                        t1Var.m(iV, K(t8, W(iU0)));
                    }
                    break;
                case 17:
                    if (A(t8, length)) {
                        t1Var.K(iV, q1.C(t8, W(iU0)), v(length));
                    }
                    break;
                case 18:
                    i1.O(V(length), (List) q1.C(t8, W(iU0)), t1Var, false);
                    break;
                case 19:
                    i1.S(V(length), (List) q1.C(t8, W(iU0)), t1Var, false);
                    break;
                case 20:
                    i1.V(V(length), (List) q1.C(t8, W(iU0)), t1Var, false);
                    break;
                case 21:
                    i1.d0(V(length), (List) q1.C(t8, W(iU0)), t1Var, false);
                    break;
                case 22:
                    i1.U(V(length), (List) q1.C(t8, W(iU0)), t1Var, false);
                    break;
                case 23:
                    i1.R(V(length), (List) q1.C(t8, W(iU0)), t1Var, false);
                    break;
                case 24:
                    i1.Q(V(length), (List) q1.C(t8, W(iU0)), t1Var, false);
                    break;
                case 25:
                    i1.M(V(length), (List) q1.C(t8, W(iU0)), t1Var, false);
                    break;
                case 26:
                    i1.b0(V(length), (List) q1.C(t8, W(iU0)), t1Var);
                    break;
                case 27:
                    i1.W(V(length), (List) q1.C(t8, W(iU0)), t1Var, v(length));
                    break;
                case 28:
                    i1.N(V(length), (List) q1.C(t8, W(iU0)), t1Var);
                    break;
                case 29:
                    i1.c0(V(length), (List) q1.C(t8, W(iU0)), t1Var, false);
                    break;
                case 30:
                    i1.P(V(length), (List) q1.C(t8, W(iU0)), t1Var, false);
                    break;
                case 31:
                    i1.X(V(length), (List) q1.C(t8, W(iU0)), t1Var, false);
                    break;
                case 32:
                    i1.Y(V(length), (List) q1.C(t8, W(iU0)), t1Var, false);
                    break;
                case 33:
                    i1.Z(V(length), (List) q1.C(t8, W(iU0)), t1Var, false);
                    break;
                case 34:
                    i1.a0(V(length), (List) q1.C(t8, W(iU0)), t1Var, false);
                    break;
                case 35:
                    i1.O(V(length), (List) q1.C(t8, W(iU0)), t1Var, true);
                    break;
                case 36:
                    i1.S(V(length), (List) q1.C(t8, W(iU0)), t1Var, true);
                    break;
                case 37:
                    i1.V(V(length), (List) q1.C(t8, W(iU0)), t1Var, true);
                    break;
                case 38:
                    i1.d0(V(length), (List) q1.C(t8, W(iU0)), t1Var, true);
                    break;
                case 39:
                    i1.U(V(length), (List) q1.C(t8, W(iU0)), t1Var, true);
                    break;
                case 40:
                    i1.R(V(length), (List) q1.C(t8, W(iU0)), t1Var, true);
                    break;
                case 41:
                    i1.Q(V(length), (List) q1.C(t8, W(iU0)), t1Var, true);
                    break;
                case 42:
                    i1.M(V(length), (List) q1.C(t8, W(iU0)), t1Var, true);
                    break;
                case 43:
                    i1.c0(V(length), (List) q1.C(t8, W(iU0)), t1Var, true);
                    break;
                case 44:
                    i1.P(V(length), (List) q1.C(t8, W(iU0)), t1Var, true);
                    break;
                case 45:
                    i1.X(V(length), (List) q1.C(t8, W(iU0)), t1Var, true);
                    break;
                case 46:
                    i1.Y(V(length), (List) q1.C(t8, W(iU0)), t1Var, true);
                    break;
                case 47:
                    i1.Z(V(length), (List) q1.C(t8, W(iU0)), t1Var, true);
                    break;
                case 48:
                    i1.a0(V(length), (List) q1.C(t8, W(iU0)), t1Var, true);
                    break;
                case 49:
                    i1.T(V(length), (List) q1.C(t8, W(iU0)), t1Var, v(length));
                    break;
                case 50:
                    x0(t1Var, iV, q1.C(t8, W(iU0)), length);
                    break;
                case 51:
                    if (I(t8, iV, length)) {
                        t1Var.p(iV, Y(t8, W(iU0)));
                    }
                    break;
                case 52:
                    if (I(t8, iV, length)) {
                        t1Var.B(iV, Z(t8, W(iU0)));
                    }
                    break;
                case 53:
                    if (I(t8, iV, length)) {
                        t1Var.u(iV, b0(t8, W(iU0)));
                    }
                    break;
                case 54:
                    if (I(t8, iV, length)) {
                        t1Var.f(iV, b0(t8, W(iU0)));
                    }
                    break;
                case 55:
                    if (I(t8, iV, length)) {
                        t1Var.h(iV, a0(t8, W(iU0)));
                    }
                    break;
                case 56:
                    if (I(t8, iV, length)) {
                        t1Var.s(iV, b0(t8, W(iU0)));
                    }
                    break;
                case 57:
                    if (I(t8, iV, length)) {
                        t1Var.c(iV, a0(t8, W(iU0)));
                    }
                    break;
                case 58:
                    if (I(t8, iV, length)) {
                        t1Var.v(iV, X(t8, W(iU0)));
                    }
                    break;
                case 59:
                    if (I(t8, iV, length)) {
                        y0(iV, q1.C(t8, W(iU0)), t1Var);
                    }
                    break;
                case 60:
                    if (I(t8, iV, length)) {
                        t1Var.N(iV, q1.C(t8, W(iU0)), v(length));
                    }
                    break;
                case 61:
                    if (I(t8, iV, length)) {
                        t1Var.M(iV, (h) q1.C(t8, W(iU0)));
                    }
                    break;
                case 62:
                    if (I(t8, iV, length)) {
                        t1Var.o(iV, a0(t8, W(iU0)));
                    }
                    break;
                case 63:
                    if (I(t8, iV, length)) {
                        t1Var.E(iV, a0(t8, W(iU0)));
                    }
                    break;
                case 64:
                    if (I(t8, iV, length)) {
                        t1Var.w(iV, a0(t8, W(iU0)));
                    }
                    break;
                case 65:
                    if (I(t8, iV, length)) {
                        t1Var.i(iV, b0(t8, W(iU0)));
                    }
                    break;
                case 66:
                    if (I(t8, iV, length)) {
                        t1Var.H(iV, a0(t8, W(iU0)));
                    }
                    break;
                case 67:
                    if (I(t8, iV, length)) {
                        t1Var.m(iV, b0(t8, W(iU0)));
                    }
                    break;
                case 68:
                    if (I(t8, iV, length)) {
                        t1Var.K(iV, q1.C(t8, W(iU0)), v(length));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.f8645p.j(t1Var, entry);
            entry = itG.hasNext() ? (Map.Entry) itG.next() : null;
        }
    }

    public final <UT, UB> int x(n1<UT, UB> n1Var, T t8) {
        return n1Var.h(n1Var.g(t8));
    }

    public final <K, V> void x0(t1 t1Var, int i10, Object obj, int i11) {
        if (obj != null) {
            this.f8646q.b(u(i11));
            t1Var.J(i10, null, this.f8646q.e(obj));
        }
    }

    public final void y0(int i10, Object obj, t1 t1Var) {
        if (obj instanceof String) {
            t1Var.e(i10, (String) obj);
        } else {
            t1Var.M(i10, (h) obj);
        }
    }

    public final <UT, UB> void z0(n1<UT, UB> n1Var, T t8, t1 t1Var) {
        n1Var.t(n1Var.g(t8), t1Var);
    }
}
