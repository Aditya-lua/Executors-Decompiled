package com.google.android.gms.internal.measurement;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class rc<T> implements zc<T> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f6764l = new int[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Unsafe f6765m = sd.v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f6766a;
    public final Object[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final oc f6769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f6770f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f6771g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6772h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f6773i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ld f6774j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final sa f6775k;

    public rc(int[] iArr, Object[] objArr, int i10, int i11, oc ocVar, boolean z10, int[] iArr2, int i12, int i13, tc tcVar, zb zbVar, ld ldVar, sa saVar, jc jcVar) {
        this.f6766a = iArr;
        this.b = objArr;
        this.f6767c = i10;
        this.f6768d = i11;
        boolean z11 = false;
        if (saVar != null && (ocVar instanceof db)) {
            z11 = true;
        }
        this.f6770f = z11;
        this.f6771g = iArr2;
        this.f6772h = i12;
        this.f6773i = i13;
        this.f6774j = ldVar;
        this.f6775k = saVar;
        this.f6769e = ocVar;
    }

    public static boolean J(Object obj, int i10, zc zcVar) {
        return zcVar.a(sd.s(obj, i10 & 1048575));
    }

    public static int M(int i10) {
        return (i10 >>> 20) & 255;
    }

    public static boolean g(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof gb) {
            return ((gb) obj).k();
        }
        return true;
    }

    public static void h(Object obj) {
        if (!g(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    public static double i(Object obj, long j10) {
        return ((Double) sd.s(obj, j10)).doubleValue();
    }

    public static float j(Object obj, long j10) {
        return ((Float) sd.s(obj, j10)).floatValue();
    }

    public static int k(Object obj, long j10) {
        return ((Integer) sd.s(obj, j10)).intValue();
    }

    public static long l(Object obj, long j10) {
        return ((Long) sd.s(obj, j10)).longValue();
    }

    public static boolean m(Object obj, long j10) {
        return ((Boolean) sd.s(obj, j10)).booleanValue();
    }

    public static final int u(byte[] bArr, int i10, int i11, wd wdVar, Class cls, v9 v9Var) {
        wd wdVar2 = wd.f6871c;
        switch (wdVar.ordinal()) {
            case 0:
                int i12 = i10 + 8;
                v9Var.f6850c = Double.valueOf(Double.longBitsToDouble(w9.e(bArr, i10)));
                return i12;
            case 1:
                int i13 = i10 + 4;
                v9Var.f6850c = Float.valueOf(Float.intBitsToFloat(w9.d(bArr, i10)));
                return i13;
            case 2:
            case 3:
                int iC = w9.c(bArr, i10, v9Var);
                v9Var.f6850c = Long.valueOf(v9Var.b);
                return iC;
            case 4:
            case 12:
            case 13:
                int iA = w9.a(bArr, i10, v9Var);
                v9Var.f6850c = Integer.valueOf(v9Var.f6849a);
                return iA;
            case 5:
            case 15:
                int i14 = i10 + 8;
                v9Var.f6850c = Long.valueOf(w9.e(bArr, i10));
                return i14;
            case 6:
            case 14:
                int i15 = i10 + 4;
                v9Var.f6850c = Integer.valueOf(w9.d(bArr, i10));
                return i15;
            case 7:
                int iC2 = w9.c(bArr, i10, v9Var);
                v9Var.f6850c = Boolean.valueOf(v9Var.b != 0);
                return iC2;
            case 8:
                return w9.f(bArr, i10, v9Var);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return w9.h(wc.a().b(cls), bArr, i10, i11, v9Var);
            case 11:
                return w9.g(bArr, i10, v9Var);
            case 16:
                int iA2 = w9.a(bArr, i10, v9Var);
                v9Var.f6850c = Integer.valueOf(ja.a(v9Var.f6849a));
                return iA2;
            case 17:
                int iC3 = w9.c(bArr, i10, v9Var);
                v9Var.f6850c = Long.valueOf(ja.b(v9Var.b));
                return iC3;
        }
    }

    public static final void v(int i10, Object obj, yd ydVar) {
        if (obj instanceof String) {
            ydVar.p(i10, (String) obj);
        } else {
            ydVar.v(i10, (ha) obj);
        }
    }

    public static md w(Object obj) {
        gb gbVar = (gb) obj;
        md mdVar = gbVar.zzc;
        if (mdVar != md.a()) {
            return mdVar;
        }
        md mdVarB = md.b();
        gbVar.zzc = mdVarB;
        return mdVarB;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x026e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0274  */
    /* JADX WARN: Code duplicated, block: B:131:0x028c  */
    /* JADX WARN: Code duplicated, block: B:132:0x028f  */
    /* JADX WARN: Code duplicated, block: B:171:0x0350  */
    /* JADX WARN: Code duplicated, block: B:187:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:190:0x03b0  */
    public static rc y(Class cls, lc lcVar, tc tcVar, zb zbVar, ld ldVar, sa saVar, jc jcVar) {
        int i10;
        int iCharAt;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int[] iArr;
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
        int iObjectFieldOffset;
        char c10;
        int iObjectFieldOffset2;
        int i28;
        int i29;
        int i30;
        Field fieldZ;
        char cCharAt9;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        Object obj;
        Field fieldZ2;
        int i36;
        Object obj2;
        Field fieldZ3;
        int i37;
        char cCharAt10;
        int i38;
        char cCharAt11;
        int i39;
        char cCharAt12;
        int i40;
        char cCharAt13;
        if (!(lcVar instanceof yc)) {
            throw null;
        }
        yc ycVar = (yc) lcVar;
        String strA = ycVar.a();
        int length = strA.length();
        char c11 = 55296;
        if (strA.charAt(0) >= 55296) {
            int i41 = 1;
            while (true) {
                i10 = i41 + 1;
                if (strA.charAt(i41) < 55296) {
                    break;
                }
                i41 = i10;
            }
        } else {
            i10 = 1;
        }
        int i42 = i10 + 1;
        int iCharAt2 = strA.charAt(i10);
        if (iCharAt2 >= 55296) {
            int i43 = iCharAt2 & 8191;
            int i44 = 13;
            while (true) {
                i40 = i42 + 1;
                cCharAt13 = strA.charAt(i42);
                if (cCharAt13 < 55296) {
                    break;
                }
                i43 |= (cCharAt13 & 8191) << i44;
                i44 += 13;
                i42 = i40;
            }
            iCharAt2 = i43 | (cCharAt13 << i44);
            i42 = i40;
        }
        if (iCharAt2 == 0) {
            i12 = 0;
            i15 = 0;
            iCharAt = 0;
            i11 = 0;
            i13 = 0;
            i14 = 0;
            iArr = f6764l;
            i16 = 0;
        } else {
            int i45 = i42 + 1;
            int iCharAt3 = strA.charAt(i42);
            if (iCharAt3 >= 55296) {
                int i46 = iCharAt3 & 8191;
                int i47 = 13;
                while (true) {
                    i24 = i45 + 1;
                    cCharAt8 = strA.charAt(i45);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt8 & 8191) << i47;
                    i47 += 13;
                    i45 = i24;
                }
                iCharAt3 = i46 | (cCharAt8 << i47);
                i45 = i24;
            }
            int i48 = i45 + 1;
            int iCharAt4 = strA.charAt(i45);
            if (iCharAt4 >= 55296) {
                int i49 = iCharAt4 & 8191;
                int i50 = 13;
                while (true) {
                    i23 = i48 + 1;
                    cCharAt7 = strA.charAt(i48);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt7 & 8191) << i50;
                    i50 += 13;
                    i48 = i23;
                }
                iCharAt4 = i49 | (cCharAt7 << i50);
                i48 = i23;
            }
            int i51 = i48 + 1;
            int iCharAt5 = strA.charAt(i48);
            if (iCharAt5 >= 55296) {
                int i52 = iCharAt5 & 8191;
                int i53 = 13;
                while (true) {
                    i22 = i51 + 1;
                    cCharAt6 = strA.charAt(i51);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt6 & 8191) << i53;
                    i53 += 13;
                    i51 = i22;
                }
                iCharAt5 = i52 | (cCharAt6 << i53);
                i51 = i22;
            }
            int i54 = i51 + 1;
            int iCharAt6 = strA.charAt(i51);
            if (iCharAt6 >= 55296) {
                int i55 = iCharAt6 & 8191;
                int i56 = 13;
                while (true) {
                    i21 = i54 + 1;
                    cCharAt5 = strA.charAt(i54);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt5 & 8191) << i56;
                    i56 += 13;
                    i54 = i21;
                }
                iCharAt6 = i55 | (cCharAt5 << i56);
                i54 = i21;
            }
            int i57 = i54 + 1;
            iCharAt = strA.charAt(i54);
            if (iCharAt >= 55296) {
                int i58 = iCharAt & 8191;
                int i59 = 13;
                while (true) {
                    i20 = i57 + 1;
                    cCharAt4 = strA.charAt(i57);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i58 |= (cCharAt4 & 8191) << i59;
                    i59 += 13;
                    i57 = i20;
                }
                iCharAt = i58 | (cCharAt4 << i59);
                i57 = i20;
            }
            int i60 = i57 + 1;
            int iCharAt7 = strA.charAt(i57);
            if (iCharAt7 >= 55296) {
                int i61 = iCharAt7 & 8191;
                int i62 = 13;
                while (true) {
                    i19 = i60 + 1;
                    cCharAt3 = strA.charAt(i60);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i61 |= (cCharAt3 & 8191) << i62;
                    i62 += 13;
                    i60 = i19;
                }
                iCharAt7 = i61 | (cCharAt3 << i62);
                i60 = i19;
            }
            int i63 = i60 + 1;
            int iCharAt8 = strA.charAt(i60);
            if (iCharAt8 >= 55296) {
                int i64 = iCharAt8 & 8191;
                int i65 = 13;
                while (true) {
                    i18 = i63 + 1;
                    cCharAt2 = strA.charAt(i63);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i64 |= (cCharAt2 & 8191) << i65;
                    i65 += 13;
                    i63 = i18;
                }
                iCharAt8 = i64 | (cCharAt2 << i65);
                i63 = i18;
            }
            int i66 = i63 + 1;
            int iCharAt9 = strA.charAt(i63);
            if (iCharAt9 >= 55296) {
                int i67 = iCharAt9 & 8191;
                int i68 = 13;
                while (true) {
                    i17 = i66 + 1;
                    cCharAt = strA.charAt(i66);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i67 |= (cCharAt & 8191) << i68;
                    i68 += 13;
                    i66 = i17;
                }
                iCharAt9 = i67 | (cCharAt << i68);
                i66 = i17;
            }
            int i69 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i70 = iCharAt7;
            i11 = iCharAt5;
            i12 = i70;
            i13 = iCharAt6;
            i14 = iCharAt9;
            i15 = i69;
            iArr = iArr2;
            i16 = iCharAt3;
            i42 = i66;
        }
        Unsafe unsafe = f6765m;
        Object[] objArrB = ycVar.b();
        Class<?> cls2 = ycVar.zzb().getClass();
        int i71 = i14 + i12;
        int i72 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i72];
        int i73 = i14;
        int i74 = i71;
        int i75 = 0;
        int i76 = 0;
        while (i42 < length) {
            int i77 = i42 + 1;
            int iCharAt10 = strA.charAt(i42);
            if (iCharAt10 >= c11) {
                int i78 = iCharAt10 & 8191;
                int i79 = i77;
                int i80 = 13;
                while (true) {
                    i39 = i79 + 1;
                    cCharAt12 = strA.charAt(i79);
                    if (cCharAt12 < c11) {
                        break;
                    }
                    i78 |= (cCharAt12 & 8191) << i80;
                    i80 += 13;
                    i79 = i39;
                }
                iCharAt10 = i78 | (cCharAt12 << i80);
                i25 = i39;
            } else {
                i25 = i77;
            }
            int i81 = i25 + 1;
            int iCharAt11 = strA.charAt(i25);
            if (iCharAt11 >= c11) {
                int i82 = iCharAt11 & 8191;
                int i83 = i81;
                int i84 = 13;
                while (true) {
                    i38 = i83 + 1;
                    cCharAt11 = strA.charAt(i83);
                    if (cCharAt11 < c11) {
                        break;
                    }
                    i82 |= (cCharAt11 & 8191) << i84;
                    i84 += 13;
                    i83 = i38;
                }
                iCharAt11 = i82 | (cCharAt11 << i84);
                i26 = i38;
            } else {
                i26 = i81;
            }
            if ((iCharAt11 & Barcode.FORMAT_UPC_E) != 0) {
                iArr[i75] = i76;
                i75++;
            }
            int i85 = iCharAt11 & 255;
            yc ycVar2 = ycVar;
            int i86 = iCharAt11 & Barcode.FORMAT_PDF417;
            if (i85 >= 51) {
                int i87 = i26 + 1;
                int iCharAt12 = strA.charAt(i26);
                char c12 = 55296;
                if (iCharAt12 >= 55296) {
                    int i88 = iCharAt12 & 8191;
                    int i89 = i87;
                    int i90 = 13;
                    while (true) {
                        i37 = i89 + 1;
                        cCharAt10 = strA.charAt(i89);
                        if (cCharAt10 < c12) {
                            break;
                        }
                        i88 |= (cCharAt10 & 8191) << i90;
                        i90 += 13;
                        i89 = i37;
                        c12 = 55296;
                    }
                    iCharAt12 = i88 | (cCharAt10 << i90);
                    i32 = i37;
                } else {
                    i32 = i87;
                }
                int i91 = i32;
                int i92 = i85 - 51;
                if (i92 == 9 || i92 == 17) {
                    i33 = i15 + 1;
                    int i93 = i76 / 3;
                    objArr[i93 + i93 + 1] = objArrB[i15];
                } else {
                    if (i92 != 12) {
                        i34 = i86;
                    } else if (ycVar2.zzc() == 1 || i86 != 0) {
                        i33 = i15 + 1;
                        int i94 = i76 / 3;
                        objArr[i94 + i94 + 1] = objArrB[i15];
                    } else {
                        i34 = 0;
                    }
                    i35 = iCharAt12 + iCharAt12;
                    obj = objArrB[i35];
                    int i95 = i34;
                    if (obj instanceof Field) {
                        fieldZ2 = (Field) obj;
                    } else {
                        fieldZ2 = z(cls2, (String) obj);
                        objArrB[i35] = fieldZ2;
                    }
                    int i96 = i16;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZ2);
                    i36 = i35 + 1;
                    obj2 = objArrB[i36];
                    i27 = i96;
                    if (obj2 instanceof Field) {
                        fieldZ3 = (Field) obj2;
                    } else {
                        fieldZ3 = z(cls2, (String) obj2);
                        objArrB[i36] = fieldZ3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZ3);
                    strA = strA;
                    i29 = i95;
                    i26 = i91;
                    i28 = 0;
                    c10 = 55296;
                }
                i15 = i33;
                i34 = i86;
                i35 = iCharAt12 + iCharAt12;
                obj = objArrB[i35];
                int i97 = i34;
                if (obj instanceof Field) {
                    fieldZ2 = (Field) obj;
                } else {
                    fieldZ2 = z(cls2, (String) obj);
                    objArrB[i35] = fieldZ2;
                }
                int i98 = i16;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZ2);
                i36 = i35 + 1;
                obj2 = objArrB[i36];
                i27 = i98;
                if (obj2 instanceof Field) {
                    fieldZ3 = (Field) obj2;
                } else {
                    fieldZ3 = z(cls2, (String) obj2);
                    objArrB[i36] = fieldZ3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZ3);
                strA = strA;
                i29 = i97;
                i26 = i91;
                i28 = 0;
                c10 = 55296;
            } else {
                i27 = i16;
                int i99 = i15 + 1;
                Field fieldZ4 = z(cls2, (String) objArrB[i15]);
                if (i85 == 9 || i85 == 17) {
                    int i100 = i76 / 3;
                    objArr[i100 + i100 + 1] = fieldZ4.getType();
                } else {
                    if (i85 != 27) {
                        if (i85 == 49) {
                            i15 += 2;
                            i31 = 1;
                        } else if (i85 == 12 || i85 == 30 || i85 == 44) {
                            if (ycVar2.zzc() == 1 || i86 != 0) {
                                i15 += 2;
                                int i101 = i76 / 3;
                                objArr[i101 + i101 + 1] = objArrB[i99];
                            } else {
                                i15 = i99;
                                i86 = 0;
                            }
                        } else if (i85 == 50) {
                            int i102 = i15 + 2;
                            int i103 = i73 + 1;
                            iArr[i73] = i76;
                            int i104 = i76 / 3;
                            int i105 = i104 + i104;
                            objArr[i105] = objArrB[i99];
                            if (i86 != 0) {
                                objArr[i105 + 1] = objArrB[i102];
                                i15 += 3;
                                i73 = i103;
                            } else {
                                i15 = i102;
                                i73 = i103;
                                i86 = 0;
                            }
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZ4);
                        if ((iCharAt11 & Barcode.FORMAT_AZTEC) != 0 || i85 > 17) {
                            c10 = 55296;
                            iObjectFieldOffset2 = 1048575;
                            i28 = 0;
                        } else {
                            int i106 = i26 + 1;
                            int iCharAt13 = strA.charAt(i26);
                            if (iCharAt13 >= 55296) {
                                int i107 = iCharAt13 & 8191;
                                int i108 = 13;
                                while (true) {
                                    i30 = i106 + 1;
                                    cCharAt9 = strA.charAt(i106);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i107 |= (cCharAt9 & 8191) << i108;
                                    i108 += 13;
                                    i106 = i30;
                                }
                                iCharAt13 = i107 | (cCharAt9 << i108);
                            } else {
                                i30 = i106;
                            }
                            int i109 = i27 + i27 + (iCharAt13 / 32);
                            Object obj3 = objArrB[i109];
                            if (obj3 instanceof Field) {
                                fieldZ = (Field) obj3;
                            } else {
                                fieldZ = z(cls2, (String) obj3);
                                objArrB[i109] = fieldZ;
                            }
                            int i110 = iCharAt13;
                            int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZ);
                            i28 = i110 % 32;
                            i26 = i30;
                            c10 = 55296;
                            iObjectFieldOffset2 = iObjectFieldOffset3;
                        }
                        if (i85 >= 18 && i85 <= 49) {
                            iArr[i74] = iObjectFieldOffset;
                            i74++;
                        }
                        i29 = i86;
                    } else {
                        i31 = 1;
                        i15 += 2;
                    }
                    int i111 = i76 / 3;
                    objArr[i111 + i111 + i31] = objArrB[i99];
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZ4);
                    if ((iCharAt11 & Barcode.FORMAT_AZTEC) != 0) {
                        c10 = 55296;
                        iObjectFieldOffset2 = 1048575;
                        i28 = 0;
                    } else {
                        c10 = 55296;
                        iObjectFieldOffset2 = 1048575;
                        i28 = 0;
                    }
                    if (i85 >= 18) {
                        iArr[i74] = iObjectFieldOffset;
                        i74++;
                    }
                    i29 = i86;
                }
                i15 = i99;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZ4);
                if ((iCharAt11 & Barcode.FORMAT_AZTEC) != 0) {
                    c10 = 55296;
                    iObjectFieldOffset2 = 1048575;
                    i28 = 0;
                } else {
                    c10 = 55296;
                    iObjectFieldOffset2 = 1048575;
                    i28 = 0;
                }
                if (i85 >= 18) {
                    iArr[i74] = iObjectFieldOffset;
                    i74++;
                }
                i29 = i86;
            }
            int i112 = i76 + 1;
            iArr3[i76] = iCharAt10;
            int i113 = i76 + 2;
            iArr3[i112] = ((iCharAt11 & Barcode.FORMAT_UPC_A) != 0 ? 536870912 : 0) | ((iCharAt11 & Barcode.FORMAT_QR_CODE) != 0 ? 268435456 : 0) | (i29 != 0 ? Integer.MIN_VALUE : 0) | (i85 << 20) | iObjectFieldOffset;
            i76 += 3;
            iArr3[i113] = (i28 << 20) | iObjectFieldOffset2;
            i42 = i26;
            strA = strA;
            c11 = c10;
            ycVar = ycVar2;
            length = length;
            i16 = i27;
        }
        return new rc(iArr3, objArr, i11, i13, ycVar.zzb(), false, iArr, i14, i71, tcVar, zbVar, ldVar, saVar, jcVar);
    }

    public static Field z(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e10) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
            sb2.append("Field ");
            sb2.append(str);
            sb2.append(" for ");
            sb2.append(name);
            sb2.append(" not found. Known fields are ");
            sb2.append(string);
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    public final void A(Object obj, Object obj2, int i10) {
        if (p(obj2, i10)) {
            int iK = K(i10) & 1048575;
            Unsafe unsafe = f6765m;
            long j10 = iK;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                int i11 = this.f6766a[i10];
                String string = obj2.toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 38 + string.length());
                sb2.append("Source subfield ");
                sb2.append(i11);
                sb2.append(" is present but null: ");
                sb2.append(string);
                throw new IllegalStateException(sb2.toString());
            }
            zc zcVarC = C(i10);
            if (!p(obj, i10)) {
                if (g(object)) {
                    Object objZza = zcVarC.zza();
                    zcVarC.b(objZza, object);
                    unsafe.putObject(obj, j10, objZza);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                q(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!g(object2)) {
                Object objZza2 = zcVarC.zza();
                zcVarC.b(objZza2, object2);
                unsafe.putObject(obj, j10, objZza2);
                object2 = objZza2;
            }
            zcVarC.b(object2, object);
        }
    }

    public final void B(Object obj, Object obj2, int i10) {
        int[] iArr = this.f6766a;
        int i11 = iArr[i10];
        if (r(obj2, i11, i10)) {
            int iK = K(i10) & 1048575;
            Unsafe unsafe = f6765m;
            long j10 = iK;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                int i12 = iArr[i10];
                String string = obj2.toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 38 + string.length());
                sb2.append("Source subfield ");
                sb2.append(i12);
                sb2.append(" is present but null: ");
                sb2.append(string);
                throw new IllegalStateException(sb2.toString());
            }
            zc zcVarC = C(i10);
            if (!r(obj, i11, i10)) {
                if (g(object)) {
                    Object objZza = zcVarC.zza();
                    zcVarC.b(objZza, object);
                    unsafe.putObject(obj, j10, objZza);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                s(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!g(object2)) {
                Object objZza2 = zcVarC.zza();
                zcVarC.b(objZza2, object2);
                unsafe.putObject(obj, j10, objZza2);
                object2 = objZza2;
            }
            zcVarC.b(object2, object);
        }
    }

    public final zc C(int i10) {
        Object[] objArr = this.b;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zc zcVar = (zc) objArr[i12];
        if (zcVar != null) {
            return zcVar;
        }
        zc zcVarB = wc.a().b((Class) objArr[i12 + 1]);
        objArr[i12] = zcVarB;
        return zcVarB;
    }

    public final Object D(int i10) {
        int i11 = i10 / 3;
        return this.b[i11 + i11];
    }

    public final lb E(int i10) {
        int i11 = i10 / 3;
        return (lb) this.b[i11 + i11 + 1];
    }

    public final Object F(Object obj, int i10) {
        zc zcVarC = C(i10);
        int iK = K(i10) & 1048575;
        if (!p(obj, i10)) {
            return zcVarC.zza();
        }
        Object object = f6765m.getObject(obj, iK);
        if (g(object)) {
            return object;
        }
        Object objZza = zcVarC.zza();
        if (object != null) {
            zcVarC.b(objZza, object);
        }
        return objZza;
    }

    public final void G(Object obj, int i10, Object obj2) {
        f6765m.putObject(obj, K(i10) & 1048575, obj2);
        q(obj, i10);
    }

    public final Object H(Object obj, int i10, int i11) {
        zc zcVarC = C(i11);
        if (!r(obj, i10, i11)) {
            return zcVarC.zza();
        }
        Object object = f6765m.getObject(obj, K(i11) & 1048575);
        if (g(object)) {
            return object;
        }
        Object objZza = zcVarC.zza();
        if (object != null) {
            zcVarC.b(objZza, object);
        }
        return objZza;
    }

    public final void I(Object obj, int i10, int i11, Object obj2) {
        f6765m.putObject(obj, K(i11) & 1048575, obj2);
        s(obj, i10, i11);
    }

    public final int K(int i10) {
        return this.f6766a[i10 + 1];
    }

    public final int L(int i10) {
        return this.f6766a[i10 + 2];
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00db  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e6 A[LOOP:2: B:53:0x00d5->B:58:0x00e6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00fc A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zc
    public final boolean a(Object obj) {
        int i10;
        int i11;
        List list;
        zc zcVarC;
        int i12;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (i14 < this.f6772h) {
            int[] iArr = this.f6771g;
            int[] iArr2 = this.f6766a;
            int i16 = iArr[i14];
            int i17 = iArr2[i16];
            int iK = K(i16);
            int i18 = iArr2[i16 + 2];
            int i19 = i18 & 1048575;
            int i20 = 1 << (i18 >>> 20);
            if (i19 != i15) {
                if (i19 != 1048575) {
                    i13 = f6765m.getInt(obj, i19);
                }
                i11 = i13;
                i10 = i19;
            } else {
                int i21 = i13;
                i10 = i15;
                i11 = i21;
            }
            if ((268435456 & iK) != 0 && !o(obj, i16, i10, i11, i20)) {
                return false;
            }
            int iM = M(iK);
            if (iM == 9 || iM == 17) {
                if (o(obj, i16, i10, i11, i20) && !J(obj, iK, C(i16))) {
                    return false;
                }
            } else if (iM == 27) {
                list = (List) sd.s(obj, iK & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zcVarC = C(i16);
                    for (i12 = 0; i12 < list.size(); i12++) {
                        if (!zcVarC.a(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (iM == 60 || iM == 68) {
                if (r(obj, i17, i16) && !J(obj, iK, C(i16))) {
                    return false;
                }
            } else if (iM == 49) {
                list = (List) sd.s(obj, iK & 1048575);
                if (list.isEmpty()) {
                    zcVarC = C(i16);
                    while (i12 < list.size()) {
                        if (!zcVarC.a(list.get(i12))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iM != 50) {
                continue;
            } else {
                ic icVar = (ic) sd.s(obj, iK & 1048575);
                if (!icVar.isEmpty() && ((hc) D(i16)).e().f6460c.a() == xd.MESSAGE) {
                    zc zcVarB = null;
                    for (Object obj2 : icVar.values()) {
                        if (zcVarB == null) {
                            zcVarB = wc.a().b(obj2.getClass());
                        }
                        if (!zcVarB.a(obj2)) {
                            return false;
                        }
                    }
                }
            }
            i14++;
            i15 = i10;
            i13 = i11;
        }
        return !this.f6770f || ((db) obj).zzb.e();
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void b(Object obj, Object obj2) {
        h(obj);
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f6766a;
            if (i10 >= iArr.length) {
                bd.d(this.f6774j, obj, obj2);
                if (this.f6770f) {
                    bd.c(this.f6775k, obj, obj2);
                    return;
                }
                return;
            }
            int iK = K(i10);
            int i11 = 1048575 & iK;
            int iM = M(iK);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (iM) {
                case 0:
                    if (p(obj2, i10)) {
                        sd.r(obj, j10, sd.q(obj2, j10));
                        q(obj, i10);
                    }
                    break;
                case 1:
                    if (p(obj2, i10)) {
                        sd.p(obj, j10, sd.o(obj2, j10));
                        q(obj, i10);
                    }
                    break;
                case 2:
                    if (p(obj2, i10)) {
                        sd.l(obj, j10, sd.k(obj2, j10));
                        q(obj, i10);
                    }
                    break;
                case 3:
                    if (p(obj2, i10)) {
                        sd.l(obj, j10, sd.k(obj2, j10));
                        q(obj, i10);
                    }
                    break;
                case 4:
                    if (p(obj2, i10)) {
                        sd.j(obj, j10, sd.i(obj2, j10));
                        q(obj, i10);
                    }
                    break;
                case 5:
                    if (p(obj2, i10)) {
                        sd.l(obj, j10, sd.k(obj2, j10));
                        q(obj, i10);
                    }
                    break;
                case 6:
                    if (p(obj2, i10)) {
                        sd.j(obj, j10, sd.i(obj2, j10));
                        q(obj, i10);
                    }
                    break;
                case 7:
                    if (p(obj2, i10)) {
                        sd.n(obj, j10, sd.m(obj2, j10));
                        q(obj, i10);
                    }
                    break;
                case 8:
                    if (p(obj2, i10)) {
                        sd.t(obj, j10, sd.s(obj2, j10));
                        q(obj, i10);
                    }
                    break;
                case 9:
                    A(obj, obj2, i10);
                    break;
                case 10:
                    if (p(obj2, i10)) {
                        sd.t(obj, j10, sd.s(obj2, j10));
                        q(obj, i10);
                    }
                    break;
                case 11:
                    if (p(obj2, i10)) {
                        sd.j(obj, j10, sd.i(obj2, j10));
                        q(obj, i10);
                    }
                    break;
                case 12:
                    if (p(obj2, i10)) {
                        sd.j(obj, j10, sd.i(obj2, j10));
                        q(obj, i10);
                    }
                    break;
                case 13:
                    if (p(obj2, i10)) {
                        sd.j(obj, j10, sd.i(obj2, j10));
                        q(obj, i10);
                    }
                    break;
                case 14:
                    if (p(obj2, i10)) {
                        sd.l(obj, j10, sd.k(obj2, j10));
                        q(obj, i10);
                    }
                    break;
                case 15:
                    if (p(obj2, i10)) {
                        sd.j(obj, j10, sd.i(obj2, j10));
                        q(obj, i10);
                    }
                    break;
                case 16:
                    if (p(obj2, i10)) {
                        sd.l(obj, j10, sd.k(obj2, j10));
                        q(obj, i10);
                    }
                    break;
                case 17:
                    A(obj, obj2, i10);
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
                    pb pbVarV = (pb) sd.s(obj, j10);
                    pb pbVar = (pb) sd.s(obj2, j10);
                    int size = pbVarV.size();
                    int size2 = pbVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!pbVarV.zza()) {
                            pbVarV = pbVarV.v(size2 + size);
                        }
                        pbVarV.addAll(pbVar);
                    }
                    if (size > 0) {
                        pbVar = pbVarV;
                    }
                    sd.t(obj, j10, pbVar);
                    break;
                case 50:
                    ld ldVar = bd.f6390a;
                    sd.t(obj, j10, jc.a(sd.s(obj, j10), sd.s(obj2, j10)));
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
                    if (r(obj2, i12, i10)) {
                        sd.t(obj, j10, sd.s(obj2, j10));
                        s(obj, i12, i10);
                    }
                    break;
                case 60:
                    B(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (r(obj2, i12, i10)) {
                        sd.t(obj, j10, sd.s(obj2, j10));
                        s(obj, i12, i10);
                    }
                    break;
                case 68:
                    B(obj, obj2, i10);
                    break;
            }
            i10 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zc
    public final void c(Object obj) {
        if (g(obj)) {
            if (obj instanceof gb) {
                gb gbVar = (gb) obj;
                gbVar.s(Integer.MAX_VALUE);
                gbVar.zza = 0;
                gbVar.l();
            }
            int[] iArr = this.f6766a;
            for (int i10 = 0; i10 < iArr.length; i10 += 3) {
                int iK = K(i10);
                int i11 = 1048575 & iK;
                int iM = M(iK);
                long j10 = i11;
                if (iM != 9) {
                    if (iM != 60 && iM != 68) {
                        switch (iM) {
                            case 17:
                                if (p(obj, i10)) {
                                    C(i10).c(f6765m.getObject(obj, j10));
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
                                ((pb) sd.s(obj, j10)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = f6765m;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((ic) object).e();
                                    unsafe.putObject(obj, j10, object);
                                }
                                break;
                        }
                    } else if (r(obj, iArr[i10], i10)) {
                        C(i10).c(f6765m.getObject(obj, j10));
                    }
                } else if (p(obj, i10)) {
                    C(i10).c(f6765m.getObject(obj, j10));
                }
            }
            this.f6774j.b(obj);
            if (this.f6770f) {
                this.f6775k.a(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void d(Object obj, byte[] bArr, int i10, int i11, v9 v9Var) {
        x(obj, bArr, i10, i11, 0, v9Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    @Override // com.google.android.gms.internal.measurement.zc
    public final void e(Object obj, yd ydVar) {
        Map.Entry entry;
        int i10;
        rc<T> rcVar = this;
        if (rcVar.f6770f) {
            wa waVar = ((db) obj).zzb;
            if (waVar.f6867a.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) waVar.c().next();
            }
        } else {
            entry = null;
        }
        int[] iArr = rcVar.f6766a;
        Unsafe unsafe = f6765m;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < iArr.length) {
            int iK = rcVar.K(i13);
            int iM = M(iK);
            int i15 = iArr[i13];
            if (iM <= 17) {
                int i16 = iArr[i13 + 2];
                int i17 = i16 & i11;
                if (i17 != i12) {
                    i14 = i17 == i11 ? 0 : unsafe.getInt(obj, i17);
                    i12 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            } else {
                i10 = 0;
            }
            if (entry != null) {
                throw null;
            }
            long j10 = iK & i11;
            switch (iM) {
                case 0:
                    if (rcVar.o(obj, i13, i12, i14, i10)) {
                        ydVar.a(i15, sd.q(obj, j10));
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    rcVar = this;
                    break;
                case 1:
                    if (rcVar.o(obj, i13, i12, i14, i10)) {
                        ydVar.u(i15, sd.o(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    rcVar = this;
                    break;
                case 2:
                    if (rcVar.o(obj, i13, i12, i14, i10)) {
                        ydVar.k(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    rcVar = this;
                    break;
                case 3:
                    if (rcVar.o(obj, i13, i12, i14, i10)) {
                        ydVar.A(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    rcVar = this;
                    break;
                case 4:
                    if (rcVar.o(obj, i13, i12, i14, i10)) {
                        ydVar.e(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    rcVar = this;
                    break;
                case 5:
                    if (rcVar.o(obj, i13, i12, i14, i10)) {
                        ydVar.w(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    rcVar = this;
                    break;
                case 6:
                    if (rcVar.o(obj, i13, i12, i14, i10)) {
                        ydVar.d(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    rcVar = this;
                    break;
                case 7:
                    if (rcVar.o(obj, i13, i12, i14, i10)) {
                        ydVar.K(i15, sd.m(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    rcVar = this;
                    break;
                case 8:
                    if (rcVar.o(obj, i13, i12, i14, i10)) {
                        v(i15, unsafe.getObject(obj, j10), ydVar);
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    rcVar = this;
                    break;
                case 9:
                    if (rcVar.o(obj, i13, i12, i14, i10)) {
                        ydVar.j(i15, unsafe.getObject(obj, j10), rcVar.C(i13));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    rcVar = this;
                    break;
                case 10:
                    if (rcVar.o(obj, i13, i12, i14, i10)) {
                        ydVar.v(i15, (ha) unsafe.getObject(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    rcVar = this;
                    break;
                case 11:
                    if (rcVar.o(obj, i13, i12, i14, i10)) {
                        ydVar.E(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    rcVar = this;
                    break;
                case 12:
                    if (rcVar.o(obj, i13, i12, i14, i10)) {
                        ydVar.r(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    rcVar = this;
                    break;
                case 13:
                    if (rcVar.o(obj, i13, i12, i14, i10)) {
                        ydVar.h(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    rcVar = this;
                    break;
                case 14:
                    if (rcVar.o(obj, i13, i12, i14, i10)) {
                        ydVar.t(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    rcVar = this;
                    break;
                case 15:
                    if (rcVar.o(obj, i13, i12, i14, i10)) {
                        ydVar.G(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    rcVar = this;
                    break;
                case 16:
                    if (rcVar.o(obj, i13, i12, i14, i10)) {
                        ydVar.l(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    rcVar = this;
                    break;
                case 17:
                    if (rcVar.o(obj, i13, i12, i14, i10)) {
                        ydVar.s(i15, unsafe.getObject(obj, j10), rcVar.C(i13));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    rcVar = this;
                    break;
                case 18:
                    bd.f(iArr[i13], (List) unsafe.getObject(obj, j10), ydVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    rcVar = this;
                    break;
                case 19:
                    bd.g(iArr[i13], (List) unsafe.getObject(obj, j10), ydVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    rcVar = this;
                    break;
                case 20:
                    bd.h(iArr[i13], (List) unsafe.getObject(obj, j10), ydVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    rcVar = this;
                    break;
                case 21:
                    bd.i(iArr[i13], (List) unsafe.getObject(obj, j10), ydVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    rcVar = this;
                    break;
                case 22:
                    bd.m(iArr[i13], (List) unsafe.getObject(obj, j10), ydVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    rcVar = this;
                    break;
                case 23:
                    bd.k(iArr[i13], (List) unsafe.getObject(obj, j10), ydVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    rcVar = this;
                    break;
                case 24:
                    bd.p(iArr[i13], (List) unsafe.getObject(obj, j10), ydVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    rcVar = this;
                    break;
                case 25:
                    bd.s(iArr[i13], (List) unsafe.getObject(obj, j10), ydVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    rcVar = this;
                    break;
                case 26:
                    int i18 = iArr[i13];
                    List list = (List) unsafe.getObject(obj, j10);
                    ld ldVar = bd.f6390a;
                    if (list != null && !list.isEmpty()) {
                        ydVar.F(i18, list);
                    }
                    break;
                case 27:
                    int i19 = iArr[i13];
                    List list2 = (List) unsafe.getObject(obj, j10);
                    zc zcVarC = rcVar.C(i13);
                    ld ldVar2 = bd.f6390a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i20 = 0; i20 < list2.size(); i20++) {
                            ((na) ydVar).j(i19, list2.get(i20), zcVarC);
                        }
                    }
                    break;
                case 28:
                    int i21 = iArr[i13];
                    List list3 = (List) unsafe.getObject(obj, j10);
                    ld ldVar3 = bd.f6390a;
                    if (list3 != null && !list3.isEmpty()) {
                        ydVar.D(i21, list3);
                    }
                    break;
                case 29:
                    bd.n(iArr[i13], (List) unsafe.getObject(obj, j10), ydVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    rcVar = this;
                    break;
                case 30:
                    bd.r(iArr[i13], (List) unsafe.getObject(obj, j10), ydVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    rcVar = this;
                    break;
                case 31:
                    bd.q(iArr[i13], (List) unsafe.getObject(obj, j10), ydVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    rcVar = this;
                    break;
                case 32:
                    bd.l(iArr[i13], (List) unsafe.getObject(obj, j10), ydVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    rcVar = this;
                    break;
                case 33:
                    bd.o(iArr[i13], (List) unsafe.getObject(obj, j10), ydVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    rcVar = this;
                    break;
                case 34:
                    bd.j(iArr[i13], (List) unsafe.getObject(obj, j10), ydVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    rcVar = this;
                    break;
                case 35:
                    bd.f(iArr[i13], (List) unsafe.getObject(obj, j10), ydVar, true);
                    break;
                case 36:
                    bd.g(iArr[i13], (List) unsafe.getObject(obj, j10), ydVar, true);
                    break;
                case 37:
                    bd.h(iArr[i13], (List) unsafe.getObject(obj, j10), ydVar, true);
                    break;
                case 38:
                    bd.i(iArr[i13], (List) unsafe.getObject(obj, j10), ydVar, true);
                    break;
                case 39:
                    bd.m(iArr[i13], (List) unsafe.getObject(obj, j10), ydVar, true);
                    break;
                case 40:
                    bd.k(iArr[i13], (List) unsafe.getObject(obj, j10), ydVar, true);
                    break;
                case 41:
                    bd.p(iArr[i13], (List) unsafe.getObject(obj, j10), ydVar, true);
                    break;
                case 42:
                    bd.s(iArr[i13], (List) unsafe.getObject(obj, j10), ydVar, true);
                    break;
                case 43:
                    bd.n(iArr[i13], (List) unsafe.getObject(obj, j10), ydVar, true);
                    break;
                case 44:
                    bd.r(iArr[i13], (List) unsafe.getObject(obj, j10), ydVar, true);
                    break;
                case 45:
                    bd.q(iArr[i13], (List) unsafe.getObject(obj, j10), ydVar, true);
                    break;
                case 46:
                    bd.l(iArr[i13], (List) unsafe.getObject(obj, j10), ydVar, true);
                    break;
                case 47:
                    bd.o(iArr[i13], (List) unsafe.getObject(obj, j10), ydVar, true);
                    break;
                case 48:
                    bd.j(iArr[i13], (List) unsafe.getObject(obj, j10), ydVar, true);
                    break;
                case 49:
                    int i22 = iArr[i13];
                    List list4 = (List) unsafe.getObject(obj, j10);
                    zc zcVarC2 = rcVar.C(i13);
                    ld ldVar4 = bd.f6390a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i23 = 0; i23 < list4.size(); i23++) {
                            ((na) ydVar).s(i22, list4.get(i23), zcVarC2);
                        }
                    }
                    break;
                case 50:
                    Object object = unsafe.getObject(obj, j10);
                    if (object != null) {
                        ydVar.i(i15, ((hc) rcVar.D(i13)).e(), (ic) object);
                    }
                    break;
                case 51:
                    if (rcVar.r(obj, i15, i13)) {
                        ydVar.a(i15, i(obj, j10));
                    }
                    break;
                case 52:
                    if (rcVar.r(obj, i15, i13)) {
                        ydVar.u(i15, j(obj, j10));
                    }
                    break;
                case 53:
                    if (rcVar.r(obj, i15, i13)) {
                        ydVar.k(i15, l(obj, j10));
                    }
                    break;
                case 54:
                    if (rcVar.r(obj, i15, i13)) {
                        ydVar.A(i15, l(obj, j10));
                    }
                    break;
                case 55:
                    if (rcVar.r(obj, i15, i13)) {
                        ydVar.e(i15, k(obj, j10));
                    }
                    break;
                case 56:
                    if (rcVar.r(obj, i15, i13)) {
                        ydVar.w(i15, l(obj, j10));
                    }
                    break;
                case 57:
                    if (rcVar.r(obj, i15, i13)) {
                        ydVar.d(i15, k(obj, j10));
                    }
                    break;
                case 58:
                    if (rcVar.r(obj, i15, i13)) {
                        ydVar.K(i15, m(obj, j10));
                    }
                    break;
                case 59:
                    if (rcVar.r(obj, i15, i13)) {
                        v(i15, unsafe.getObject(obj, j10), ydVar);
                    }
                    break;
                case 60:
                    if (rcVar.r(obj, i15, i13)) {
                        ydVar.j(i15, unsafe.getObject(obj, j10), rcVar.C(i13));
                    }
                    break;
                case 61:
                    if (rcVar.r(obj, i15, i13)) {
                        ydVar.v(i15, (ha) unsafe.getObject(obj, j10));
                    }
                    break;
                case 62:
                    if (rcVar.r(obj, i15, i13)) {
                        ydVar.E(i15, k(obj, j10));
                    }
                    break;
                case 63:
                    if (rcVar.r(obj, i15, i13)) {
                        ydVar.r(i15, k(obj, j10));
                    }
                    break;
                case 64:
                    if (rcVar.r(obj, i15, i13)) {
                        ydVar.h(i15, k(obj, j10));
                    }
                    break;
                case 65:
                    if (rcVar.r(obj, i15, i13)) {
                        ydVar.t(i15, l(obj, j10));
                    }
                    break;
                case 66:
                    if (rcVar.r(obj, i15, i13)) {
                        ydVar.G(i15, k(obj, j10));
                    }
                    break;
                case 67:
                    if (rcVar.r(obj, i15, i13)) {
                        ydVar.l(i15, l(obj, j10));
                    }
                    break;
                case 68:
                    if (rcVar.r(obj, i15, i13)) {
                        ydVar.s(i15, unsafe.getObject(obj, j10), rcVar.C(i13));
                    }
                    break;
            }
            i13 += 3;
            i11 = 1048575;
            rcVar = this;
        }
        if (entry != null) {
            throw null;
        }
        ((gb) obj).zzc.g(ydVar);
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final boolean f(Object obj, Object obj2) {
        boolean zB;
        for (int i10 = 0; i10 < this.f6766a.length; i10 += 3) {
            int iK = K(i10);
            long j10 = iK & 1048575;
            switch (M(iK)) {
                case 0:
                    if (!n(obj, obj2, i10) || Double.doubleToLongBits(sd.q(obj, j10)) != Double.doubleToLongBits(sd.q(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!n(obj, obj2, i10) || Float.floatToIntBits(sd.o(obj, j10)) != Float.floatToIntBits(sd.o(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!n(obj, obj2, i10) || sd.k(obj, j10) != sd.k(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!n(obj, obj2, i10) || sd.k(obj, j10) != sd.k(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!n(obj, obj2, i10) || sd.i(obj, j10) != sd.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!n(obj, obj2, i10) || sd.k(obj, j10) != sd.k(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!n(obj, obj2, i10) || sd.i(obj, j10) != sd.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!n(obj, obj2, i10) || sd.m(obj, j10) != sd.m(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!n(obj, obj2, i10) || !bd.b(sd.s(obj, j10), sd.s(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!n(obj, obj2, i10) || !bd.b(sd.s(obj, j10), sd.s(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!n(obj, obj2, i10) || !bd.b(sd.s(obj, j10), sd.s(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!n(obj, obj2, i10) || sd.i(obj, j10) != sd.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!n(obj, obj2, i10) || sd.i(obj, j10) != sd.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!n(obj, obj2, i10) || sd.i(obj, j10) != sd.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!n(obj, obj2, i10) || sd.k(obj, j10) != sd.k(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!n(obj, obj2, i10) || sd.i(obj, j10) != sd.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!n(obj, obj2, i10) || sd.k(obj, j10) != sd.k(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!n(obj, obj2, i10) || !bd.b(sd.s(obj, j10), sd.s(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
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
                    zB = bd.b(sd.s(obj, j10), sd.s(obj2, j10));
                    break;
                case 50:
                    zB = bd.b(sd.s(obj, j10), sd.s(obj2, j10));
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
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jL = L(i10) & 1048575;
                    if (sd.i(obj, jL) != sd.i(obj2, jL) || !bd.b(sd.s(obj, j10), sd.s(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zB) {
                return false;
            }
        }
        if (!((gb) obj).zzc.equals(((gb) obj2).zzc)) {
            return false;
        }
        if (this.f6770f) {
            return ((db) obj).zzb.equals(((db) obj2).zzb);
        }
        return true;
    }

    public final boolean n(Object obj, Object obj2, int i10) {
        return p(obj, i10) == p(obj2, i10);
    }

    public final boolean o(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return p(obj, i10);
        }
        return (i12 & i13) != 0;
    }

    public final boolean p(Object obj, int i10) {
        int iL = L(i10);
        long j10 = iL & 1048575;
        if (j10 != 1048575) {
            return (sd.i(obj, j10) & (1 << (iL >>> 20))) != 0;
        }
        int iK = K(i10);
        long j11 = iK & 1048575;
        switch (M(iK)) {
            case 0:
                return Double.doubleToRawLongBits(sd.q(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(sd.o(obj, j11)) != 0;
            case 2:
                return sd.k(obj, j11) != 0;
            case 3:
                return sd.k(obj, j11) != 0;
            case 4:
                return sd.i(obj, j11) != 0;
            case 5:
                return sd.k(obj, j11) != 0;
            case 6:
                return sd.i(obj, j11) != 0;
            case 7:
                return sd.m(obj, j11);
            case 8:
                Object objS = sd.s(obj, j11);
                if (objS instanceof String) {
                    return !((String) objS).isEmpty();
                }
                if (objS instanceof ha) {
                    return !ha.b.equals(objS);
                }
                throw new IllegalArgumentException();
            case 9:
                return sd.s(obj, j11) != null;
            case 10:
                return !ha.b.equals(sd.s(obj, j11));
            case 11:
                return sd.i(obj, j11) != 0;
            case 12:
                return sd.i(obj, j11) != 0;
            case 13:
                return sd.i(obj, j11) != 0;
            case 14:
                return sd.k(obj, j11) != 0;
            case 15:
                return sd.i(obj, j11) != 0;
            case 16:
                return sd.k(obj, j11) != 0;
            case 17:
                return sd.s(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final void q(Object obj, int i10) {
        int iL = L(i10);
        long j10 = 1048575 & iL;
        if (j10 == 1048575) {
            return;
        }
        sd.j(obj, j10, (1 << (iL >>> 20)) | sd.i(obj, j10));
    }

    public final boolean r(Object obj, int i10, int i11) {
        return sd.i(obj, (long) (L(i11) & 1048575)) == i10;
    }

    public final void s(Object obj, int i10, int i11) {
        sd.j(obj, L(i11) & 1048575, i10);
    }

    public final int t(int i10, int i11) {
        int[] iArr = this.f6766a;
        int length = (iArr.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = iArr[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 41981. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int x(java.lang.Object r35, byte[] r36, int r37, int r38, int r39, com.google.android.gms.internal.measurement.v9 r40) {
        /*
            Method dump skipped, instruction units count: 4198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.rc.x(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.v9):int");
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final Object zza() {
        return ((gb) this.f6769e).n();
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final int zzc(Object obj) {
        int i10;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i11;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = this.f6766a;
            if (i12 >= iArr.length) {
                int iHashCode = (i13 * 53) + ((gb) obj).zzc.hashCode();
                return this.f6770f ? (iHashCode * 53) + ((db) obj).zzb.f6867a.hashCode() : iHashCode;
            }
            int iK = K(i12);
            int i14 = 1048575 & iK;
            int iM = M(iK);
            int i15 = iArr[i12];
            long j10 = i14;
            int iHashCode2 = 37;
            switch (iM) {
                case 0:
                    i10 = i13 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(sd.q(obj, j10));
                    Charset charset = qb.f6750a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 1:
                    i10 = i13 * 53;
                    iFloatToIntBits = Float.floatToIntBits(sd.o(obj, j10));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 2:
                    i10 = i13 * 53;
                    jDoubleToLongBits = sd.k(obj, j10);
                    Charset charset2 = qb.f6750a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 3:
                    i10 = i13 * 53;
                    jDoubleToLongBits = sd.k(obj, j10);
                    Charset charset3 = qb.f6750a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 4:
                    i10 = i13 * 53;
                    iFloatToIntBits = sd.i(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 5:
                    i10 = i13 * 53;
                    jDoubleToLongBits = sd.k(obj, j10);
                    Charset charset4 = qb.f6750a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 6:
                    i10 = i13 * 53;
                    iFloatToIntBits = sd.i(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 7:
                    i10 = i13 * 53;
                    iFloatToIntBits = qb.b(sd.m(obj, j10));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 8:
                    i10 = i13 * 53;
                    iFloatToIntBits = ((String) sd.s(obj, j10)).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 9:
                    i11 = i13 * 53;
                    Object objS = sd.s(obj, j10);
                    if (objS != null) {
                        iHashCode2 = objS.hashCode();
                    }
                    i13 = i11 + iHashCode2;
                    break;
                case 10:
                    i10 = i13 * 53;
                    iFloatToIntBits = sd.s(obj, j10).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 11:
                    i10 = i13 * 53;
                    iFloatToIntBits = sd.i(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 12:
                    i10 = i13 * 53;
                    iFloatToIntBits = sd.i(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 13:
                    i10 = i13 * 53;
                    iFloatToIntBits = sd.i(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 14:
                    i10 = i13 * 53;
                    jDoubleToLongBits = sd.k(obj, j10);
                    Charset charset5 = qb.f6750a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 15:
                    i10 = i13 * 53;
                    iFloatToIntBits = sd.i(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 16:
                    i10 = i13 * 53;
                    jDoubleToLongBits = sd.k(obj, j10);
                    Charset charset6 = qb.f6750a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 17:
                    i11 = i13 * 53;
                    Object objS2 = sd.s(obj, j10);
                    if (objS2 != null) {
                        iHashCode2 = objS2.hashCode();
                    }
                    i13 = i11 + iHashCode2;
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
                    i10 = i13 * 53;
                    iFloatToIntBits = sd.s(obj, j10).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 50:
                    i10 = i13 * 53;
                    iFloatToIntBits = sd.s(obj, j10).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 51:
                    if (r(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(i(obj, j10));
                        Charset charset7 = qb.f6750a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 52:
                    if (r(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = Float.floatToIntBits(j(obj, j10));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (r(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = l(obj, j10);
                        Charset charset8 = qb.f6750a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 54:
                    if (r(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = l(obj, j10);
                        Charset charset9 = qb.f6750a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 55:
                    if (r(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = k(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 56:
                    if (r(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = l(obj, j10);
                        Charset charset10 = qb.f6750a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 57:
                    if (r(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = k(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 58:
                    if (r(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = qb.b(m(obj, j10));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 59:
                    if (r(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = ((String) sd.s(obj, j10)).hashCode();
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (r(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = sd.s(obj, j10).hashCode();
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (r(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = sd.s(obj, j10).hashCode();
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 62:
                    if (r(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = k(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 63:
                    if (r(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = k(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (r(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = k(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (r(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = l(obj, j10);
                        Charset charset11 = qb.f6750a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 66:
                    if (r(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = k(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 67:
                    if (r(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = l(obj, j10);
                        Charset charset12 = qb.f6750a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 68:
                    if (r(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = sd.s(obj, j10).hashCode();
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
            }
            i12 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:143:0x038e  */
    /* JADX WARN: Code duplicated, block: B:84:0x01df  */
    @Override // com.google.android.gms.internal.measurement.zc
    public final int zze(Object obj) {
        int i10;
        int iG;
        int iG2;
        int iA;
        int iG3;
        int iG4;
        int iG5;
        int iD;
        int iG6;
        int iE;
        int iT;
        int size;
        int iU;
        int iG7;
        int iG8;
        int iG9;
        int iA2;
        int iC;
        int iG10;
        int iG11;
        int iG12;
        int iG13;
        int iG14;
        int iG15;
        int iD2;
        int iG16;
        rc<T> rcVar = this;
        Unsafe unsafe = f6765m;
        int i11 = 0;
        int i12 = 0;
        int iG17 = 0;
        int i13 = 1048575;
        while (true) {
            int[] iArr = rcVar.f6766a;
            if (i11 >= iArr.length) {
                int i14 = iG17 + ((gb) obj).zzc.i();
                if (!rcVar.f6770f) {
                    return i14;
                }
                hd hdVar = ((db) obj).zzb.f6867a;
                int iC2 = hdVar.c();
                int iJ = 0;
                for (int i15 = 0; i15 < iC2; i15++) {
                    Map.Entry entryD = hdVar.d(i15);
                    iJ += wa.j((va) ((ed) entryD).a(), entryD.getValue());
                }
                for (Map.Entry entry : hdVar.e()) {
                    iJ += wa.j((va) entry.getKey(), entry.getValue());
                }
                return i14 + iJ;
            }
            int iK = rcVar.K(i11);
            int iM = M(iK);
            int i16 = iArr[i11];
            int i17 = iArr[i11 + 2];
            int i18 = i17 & 1048575;
            if (iM <= 17) {
                if (i18 != i13) {
                    i12 = i18 == 1048575 ? 0 : unsafe.getInt(obj, i18);
                    i13 = i18;
                }
                i10 = 1 << (i17 >>> 20);
            } else {
                i10 = 0;
            }
            int i19 = iK & 1048575;
            if (iM >= xa.K.zza()) {
                xa.X.zza();
            }
            long j10 = i19;
            switch (iM) {
                case 0:
                    if (rcVar.o(obj, i11, i13, i12, i10)) {
                        iG17 += ma.G(i16 << 3) + 8;
                    }
                    break;
                case 1:
                    if (rcVar.o(obj, i11, i13, i12, i10)) {
                        iG = ma.G(i16 << 3);
                        iG4 = iG + 4;
                        iG17 += iG4;
                    }
                    rcVar = this;
                    break;
                case 2:
                    if (rcVar.o(obj, i11, i13, i12, i10)) {
                        long j11 = unsafe.getLong(obj, j10);
                        iG2 = ma.G(i16 << 3);
                        iA = ma.a(j11);
                        iG4 = iG2 + iA;
                        iG17 += iG4;
                    }
                    rcVar = this;
                    break;
                case 3:
                    if (rcVar.o(obj, i11, i13, i12, i10)) {
                        long j12 = unsafe.getLong(obj, j10);
                        iG2 = ma.G(i16 << 3);
                        iA = ma.a(j12);
                        iG4 = iG2 + iA;
                        iG17 += iG4;
                    }
                    rcVar = this;
                    break;
                case 4:
                    if (rcVar.o(obj, i11, i13, i12, i10)) {
                        long j13 = unsafe.getInt(obj, j10);
                        iG2 = ma.G(i16 << 3);
                        iA = ma.a(j13);
                        iG4 = iG2 + iA;
                        iG17 += iG4;
                    }
                    rcVar = this;
                    break;
                case 5:
                    if (rcVar.o(obj, i11, i13, i12, i10)) {
                        iG3 = ma.G(i16 << 3);
                        iG4 = iG3 + 8;
                        iG17 += iG4;
                    }
                    rcVar = this;
                    break;
                case 6:
                    if (rcVar.o(obj, i11, i13, i12, i10)) {
                        iG = ma.G(i16 << 3);
                        iG4 = iG + 4;
                        iG17 += iG4;
                    }
                    rcVar = this;
                    break;
                case 7:
                    if (rcVar.o(obj, i11, i13, i12, i10)) {
                        iG4 = ma.G(i16 << 3) + 1;
                        iG17 += iG4;
                    }
                    rcVar = this;
                    break;
                case 8:
                    if (rcVar.o(obj, i11, i13, i12, i10)) {
                        int i20 = i16 << 3;
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof ha) {
                            iG5 = ma.G(i20);
                            iD = ((ha) object).d();
                            iG6 = ma.G(iD);
                            iG4 = iG5 + iG6 + iD;
                            iG17 += iG4;
                        } else {
                            iG2 = ma.G(i20);
                            iA = ma.b((String) object);
                            iG4 = iG2 + iA;
                            iG17 += iG4;
                        }
                    }
                    rcVar = this;
                    break;
                case 9:
                    if (rcVar.o(obj, i11, i13, i12, i10)) {
                        iE = bd.E(i16, unsafe.getObject(obj, j10), rcVar.C(i11));
                        iG17 += iE;
                    }
                    break;
                case 10:
                    if (rcVar.o(obj, i11, i13, i12, i10)) {
                        ha haVar = (ha) unsafe.getObject(obj, j10);
                        iG5 = ma.G(i16 << 3);
                        iD = haVar.d();
                        iG6 = ma.G(iD);
                        iG4 = iG5 + iG6 + iD;
                        iG17 += iG4;
                    }
                    rcVar = this;
                    break;
                case 11:
                    if (rcVar.o(obj, i11, i13, i12, i10)) {
                        int i21 = unsafe.getInt(obj, j10);
                        iG2 = ma.G(i16 << 3);
                        iA = ma.G(i21);
                        iG4 = iG2 + iA;
                        iG17 += iG4;
                    }
                    rcVar = this;
                    break;
                case 12:
                    if (rcVar.o(obj, i11, i13, i12, i10)) {
                        long j14 = unsafe.getInt(obj, j10);
                        iG2 = ma.G(i16 << 3);
                        iA = ma.a(j14);
                        iG4 = iG2 + iA;
                        iG17 += iG4;
                    }
                    rcVar = this;
                    break;
                case 13:
                    if (rcVar.o(obj, i11, i13, i12, i10)) {
                        iG = ma.G(i16 << 3);
                        iG4 = iG + 4;
                        iG17 += iG4;
                    }
                    rcVar = this;
                    break;
                case 14:
                    if (rcVar.o(obj, i11, i13, i12, i10)) {
                        iG3 = ma.G(i16 << 3);
                        iG4 = iG3 + 8;
                        iG17 += iG4;
                    }
                    rcVar = this;
                    break;
                case 15:
                    if (rcVar.o(obj, i11, i13, i12, i10)) {
                        int i22 = unsafe.getInt(obj, j10);
                        iG2 = ma.G(i16 << 3);
                        iA = ma.G((i22 >> 31) ^ (i22 + i22));
                        iG4 = iG2 + iA;
                        iG17 += iG4;
                    }
                    rcVar = this;
                    break;
                case 16:
                    if (rcVar.o(obj, i11, i13, i12, i10)) {
                        long j15 = unsafe.getLong(obj, j10);
                        iG2 = ma.G(i16 << 3);
                        iA = ma.a((j15 >> 63) ^ (j15 + j15));
                        iG4 = iG2 + iA;
                        iG17 += iG4;
                    }
                    rcVar = this;
                    break;
                case 17:
                    if (rcVar.o(obj, i11, i13, i12, i10)) {
                        iE = ma.g(i16, (oc) unsafe.getObject(obj, j10), rcVar.C(i11));
                        iG17 += iE;
                    }
                    break;
                case 18:
                    iE = bd.D(i16, (List) unsafe.getObject(obj, j10), false);
                    iG17 += iE;
                    break;
                case 19:
                    iE = bd.B(i16, (List) unsafe.getObject(obj, j10), false);
                    iG17 += iE;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j10);
                    ld ldVar = bd.f6390a;
                    if (list.size() == 0) {
                        iT = 0;
                    } else {
                        iT = bd.t(list) + (list.size() * ma.G(i16 << 3));
                    }
                    iG17 += iT;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j10);
                    ld ldVar2 = bd.f6390a;
                    size = list2.size();
                    if (size == 0) {
                        iE = 0;
                    } else {
                        iU = bd.u(list2);
                        iG7 = ma.G(i16 << 3);
                        iA2 = size * iG7;
                        iE = iU + iA2;
                    }
                    iG17 += iE;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j10);
                    ld ldVar3 = bd.f6390a;
                    size = list3.size();
                    if (size == 0) {
                        iE = 0;
                    } else {
                        iU = bd.x(list3);
                        iG7 = ma.G(i16 << 3);
                        iA2 = size * iG7;
                        iE = iU + iA2;
                    }
                    iG17 += iE;
                    break;
                case 23:
                    iE = bd.D(i16, (List) unsafe.getObject(obj, j10), false);
                    iG17 += iE;
                    break;
                case 24:
                    iE = bd.B(i16, (List) unsafe.getObject(obj, j10), false);
                    iG17 += iE;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j10);
                    ld ldVar4 = bd.f6390a;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iE = 0;
                    } else {
                        iE = size2 * (ma.G(i16 << 3) + 1);
                    }
                    iG17 += iE;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j10);
                    ld ldVar5 = bd.f6390a;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iT = 0;
                    } else {
                        iT = ma.G(i16 << 3) * size3;
                        if (list5 instanceof yb) {
                            yb ybVar = (yb) list5;
                            for (int i23 = 0; i23 < size3; i23++) {
                                Object objZzc = ybVar.zzc();
                                if (objZzc instanceof ha) {
                                    int iD3 = ((ha) objZzc).d();
                                    iT += ma.G(iD3) + iD3;
                                } else {
                                    iT += ma.b((String) objZzc);
                                }
                            }
                        } else {
                            for (int i24 = 0; i24 < size3; i24++) {
                                Object obj2 = list5.get(i24);
                                if (obj2 instanceof ha) {
                                    int iD4 = ((ha) obj2).d();
                                    iT += ma.G(iD4) + iD4;
                                } else {
                                    iT += ma.b((String) obj2);
                                }
                            }
                        }
                    }
                    iG17 += iT;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j10);
                    zc zcVarC = rcVar.C(i11);
                    ld ldVar6 = bd.f6390a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iG8 = 0;
                    } else {
                        iG8 = ma.G(i16 << 3) * size4;
                        for (int i25 = 0; i25 < size4; i25++) {
                            Object obj3 = list6.get(i25);
                            if (obj3 instanceof xb) {
                                int iB = ((xb) obj3).b();
                                iG8 += ma.G(iB) + iB;
                            } else {
                                iG8 += ma.d((oc) obj3, zcVarC);
                            }
                        }
                    }
                    iG17 += iG8;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j10);
                    ld ldVar7 = bd.f6390a;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iG9 = 0;
                    } else {
                        iG9 = size5 * ma.G(i16 << 3);
                        for (int i26 = 0; i26 < list7.size(); i26++) {
                            int iD5 = ((ha) list7.get(i26)).d();
                            iG9 += ma.G(iD5) + iD5;
                        }
                    }
                    iG17 += iG9;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j10);
                    ld ldVar8 = bd.f6390a;
                    size = list8.size();
                    if (size == 0) {
                        iE = 0;
                    } else {
                        iU = bd.y(list8);
                        iG7 = ma.G(i16 << 3);
                        iA2 = size * iG7;
                        iE = iU + iA2;
                    }
                    iG17 += iE;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j10);
                    ld ldVar9 = bd.f6390a;
                    size = list9.size();
                    if (size == 0) {
                        iE = 0;
                    } else {
                        iU = bd.w(list9);
                        iG7 = ma.G(i16 << 3);
                        iA2 = size * iG7;
                        iE = iU + iA2;
                    }
                    iG17 += iE;
                    break;
                case 31:
                    iE = bd.B(i16, (List) unsafe.getObject(obj, j10), false);
                    iG17 += iE;
                    break;
                case 32:
                    iE = bd.D(i16, (List) unsafe.getObject(obj, j10), false);
                    iG17 += iE;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j10);
                    ld ldVar10 = bd.f6390a;
                    size = list10.size();
                    if (size == 0) {
                        iE = 0;
                    } else {
                        iU = bd.z(list10);
                        iG7 = ma.G(i16 << 3);
                        iA2 = size * iG7;
                        iE = iU + iA2;
                    }
                    iG17 += iE;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j10);
                    ld ldVar11 = bd.f6390a;
                    size = list11.size();
                    if (size == 0) {
                        iE = 0;
                    } else {
                        iU = bd.v(list11);
                        iG7 = ma.G(i16 << 3);
                        iA2 = size * iG7;
                        iE = iU + iA2;
                    }
                    iG17 += iE;
                    break;
                case 35:
                    iC = bd.C((List) unsafe.getObject(obj, j10));
                    if (iC > 0) {
                        iG10 = ma.G(i16 << 3);
                        iG11 = ma.G(iC);
                        iG9 = iG10 + iG11 + iC;
                        iG17 += iG9;
                    }
                    break;
                case 36:
                    iC = bd.A((List) unsafe.getObject(obj, j10));
                    if (iC > 0) {
                        iG10 = ma.G(i16 << 3);
                        iG11 = ma.G(iC);
                        iG9 = iG10 + iG11 + iC;
                        iG17 += iG9;
                    }
                    break;
                case 37:
                    iC = bd.t((List) unsafe.getObject(obj, j10));
                    if (iC > 0) {
                        iG10 = ma.G(i16 << 3);
                        iG11 = ma.G(iC);
                        iG9 = iG10 + iG11 + iC;
                        iG17 += iG9;
                    }
                    break;
                case 38:
                    iC = bd.u((List) unsafe.getObject(obj, j10));
                    if (iC > 0) {
                        iG10 = ma.G(i16 << 3);
                        iG11 = ma.G(iC);
                        iG9 = iG10 + iG11 + iC;
                        iG17 += iG9;
                    }
                    break;
                case 39:
                    iC = bd.x((List) unsafe.getObject(obj, j10));
                    if (iC > 0) {
                        iG10 = ma.G(i16 << 3);
                        iG11 = ma.G(iC);
                        iG9 = iG10 + iG11 + iC;
                        iG17 += iG9;
                    }
                    break;
                case 40:
                    iC = bd.C((List) unsafe.getObject(obj, j10));
                    if (iC > 0) {
                        iG10 = ma.G(i16 << 3);
                        iG11 = ma.G(iC);
                        iG9 = iG10 + iG11 + iC;
                        iG17 += iG9;
                    }
                    break;
                case 41:
                    iC = bd.A((List) unsafe.getObject(obj, j10));
                    if (iC > 0) {
                        iG10 = ma.G(i16 << 3);
                        iG11 = ma.G(iC);
                        iG9 = iG10 + iG11 + iC;
                        iG17 += iG9;
                    }
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(obj, j10);
                    ld ldVar12 = bd.f6390a;
                    iC = list12.size();
                    if (iC > 0) {
                        iG10 = ma.G(i16 << 3);
                        iG11 = ma.G(iC);
                        iG9 = iG10 + iG11 + iC;
                        iG17 += iG9;
                    }
                    break;
                case 43:
                    iC = bd.y((List) unsafe.getObject(obj, j10));
                    if (iC > 0) {
                        iG10 = ma.G(i16 << 3);
                        iG11 = ma.G(iC);
                        iG9 = iG10 + iG11 + iC;
                        iG17 += iG9;
                    }
                    break;
                case 44:
                    iC = bd.w((List) unsafe.getObject(obj, j10));
                    if (iC > 0) {
                        iG10 = ma.G(i16 << 3);
                        iG11 = ma.G(iC);
                        iG9 = iG10 + iG11 + iC;
                        iG17 += iG9;
                    }
                    break;
                case 45:
                    iC = bd.A((List) unsafe.getObject(obj, j10));
                    if (iC > 0) {
                        iG10 = ma.G(i16 << 3);
                        iG11 = ma.G(iC);
                        iG9 = iG10 + iG11 + iC;
                        iG17 += iG9;
                    }
                    break;
                case 46:
                    iC = bd.C((List) unsafe.getObject(obj, j10));
                    if (iC > 0) {
                        iG10 = ma.G(i16 << 3);
                        iG11 = ma.G(iC);
                        iG9 = iG10 + iG11 + iC;
                        iG17 += iG9;
                    }
                    break;
                case 47:
                    iC = bd.z((List) unsafe.getObject(obj, j10));
                    if (iC > 0) {
                        iG10 = ma.G(i16 << 3);
                        iG11 = ma.G(iC);
                        iG9 = iG10 + iG11 + iC;
                        iG17 += iG9;
                    }
                    break;
                case 48:
                    iC = bd.v((List) unsafe.getObject(obj, j10));
                    if (iC > 0) {
                        iG10 = ma.G(i16 << 3);
                        iG11 = ma.G(iC);
                        iG9 = iG10 + iG11 + iC;
                        iG17 += iG9;
                    }
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j10);
                    zc zcVarC2 = rcVar.C(i11);
                    ld ldVar13 = bd.f6390a;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iG12 = 0;
                    } else {
                        iG12 = 0;
                        for (int i27 = 0; i27 < size6; i27++) {
                            iG12 += ma.g(i16, (oc) list13.get(i27), zcVarC2);
                        }
                    }
                    iG17 += iG12;
                    break;
                case 50:
                    ic icVar = (ic) unsafe.getObject(obj, j10);
                    hc hcVar = (hc) rcVar.D(i11);
                    if (icVar.isEmpty()) {
                        iT = 0;
                    } else {
                        iT = 0;
                        for (Map.Entry entry2 : icVar.entrySet()) {
                            iT += hcVar.d(i16, entry2.getKey(), entry2.getValue());
                        }
                    }
                    iG17 += iT;
                    break;
                case 51:
                    if (rcVar.r(obj, i16, i11)) {
                        iG13 = ma.G(i16 << 3);
                        iE = iG13 + 8;
                        iG17 += iE;
                    }
                    break;
                case 52:
                    if (rcVar.r(obj, i16, i11)) {
                        iG14 = ma.G(i16 << 3);
                        iE = iG14 + 4;
                        iG17 += iE;
                    }
                    break;
                case 53:
                    if (rcVar.r(obj, i16, i11)) {
                        long jL = l(obj, j10);
                        iU = ma.G(i16 << 3);
                        iA2 = ma.a(jL);
                        iE = iU + iA2;
                        iG17 += iE;
                    }
                    break;
                case 54:
                    if (rcVar.r(obj, i16, i11)) {
                        long jL2 = l(obj, j10);
                        iU = ma.G(i16 << 3);
                        iA2 = ma.a(jL2);
                        iE = iU + iA2;
                        iG17 += iE;
                    }
                    break;
                case 55:
                    if (rcVar.r(obj, i16, i11)) {
                        long jK = k(obj, j10);
                        iU = ma.G(i16 << 3);
                        iA2 = ma.a(jK);
                        iE = iU + iA2;
                        iG17 += iE;
                    }
                    break;
                case 56:
                    if (rcVar.r(obj, i16, i11)) {
                        iG13 = ma.G(i16 << 3);
                        iE = iG13 + 8;
                        iG17 += iE;
                    }
                    break;
                case 57:
                    if (rcVar.r(obj, i16, i11)) {
                        iG14 = ma.G(i16 << 3);
                        iE = iG14 + 4;
                        iG17 += iE;
                    }
                    break;
                case 58:
                    if (rcVar.r(obj, i16, i11)) {
                        iE = ma.G(i16 << 3) + 1;
                        iG17 += iE;
                    }
                    break;
                case 59:
                    if (rcVar.r(obj, i16, i11)) {
                        int i28 = i16 << 3;
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof ha) {
                            iG15 = ma.G(i28);
                            iD2 = ((ha) object2).d();
                            iG16 = ma.G(iD2);
                            iE = iG15 + iG16 + iD2;
                            iG17 += iE;
                        } else {
                            iU = ma.G(i28);
                            iA2 = ma.b((String) object2);
                            iE = iU + iA2;
                            iG17 += iE;
                        }
                    }
                    break;
                case 60:
                    if (rcVar.r(obj, i16, i11)) {
                        iE = bd.E(i16, unsafe.getObject(obj, j10), rcVar.C(i11));
                        iG17 += iE;
                    }
                    break;
                case 61:
                    if (rcVar.r(obj, i16, i11)) {
                        ha haVar2 = (ha) unsafe.getObject(obj, j10);
                        iG15 = ma.G(i16 << 3);
                        iD2 = haVar2.d();
                        iG16 = ma.G(iD2);
                        iE = iG15 + iG16 + iD2;
                        iG17 += iE;
                    }
                    break;
                case 62:
                    if (rcVar.r(obj, i16, i11)) {
                        int iK2 = k(obj, j10);
                        iU = ma.G(i16 << 3);
                        iA2 = ma.G(iK2);
                        iE = iU + iA2;
                        iG17 += iE;
                    }
                    break;
                case 63:
                    if (rcVar.r(obj, i16, i11)) {
                        long jK2 = k(obj, j10);
                        iU = ma.G(i16 << 3);
                        iA2 = ma.a(jK2);
                        iE = iU + iA2;
                        iG17 += iE;
                    }
                    break;
                case 64:
                    if (rcVar.r(obj, i16, i11)) {
                        iG14 = ma.G(i16 << 3);
                        iE = iG14 + 4;
                        iG17 += iE;
                    }
                    break;
                case 65:
                    if (rcVar.r(obj, i16, i11)) {
                        iG13 = ma.G(i16 << 3);
                        iE = iG13 + 8;
                        iG17 += iE;
                    }
                    break;
                case 66:
                    if (rcVar.r(obj, i16, i11)) {
                        int iK3 = k(obj, j10);
                        iU = ma.G(i16 << 3);
                        iA2 = ma.G((iK3 >> 31) ^ (iK3 + iK3));
                        iE = iU + iA2;
                        iG17 += iE;
                    }
                    break;
                case 67:
                    if (rcVar.r(obj, i16, i11)) {
                        long jL3 = l(obj, j10);
                        iU = ma.G(i16 << 3);
                        iA2 = ma.a((jL3 >> 63) ^ (jL3 + jL3));
                        iE = iU + iA2;
                        iG17 += iE;
                    }
                    break;
                case 68:
                    if (rcVar.r(obj, i16, i11)) {
                        iE = ma.g(i16, (oc) unsafe.getObject(obj, j10), rcVar.C(i11));
                        iG17 += iE;
                    }
                    break;
            }
            i11 += 3;
        }
    }
}
