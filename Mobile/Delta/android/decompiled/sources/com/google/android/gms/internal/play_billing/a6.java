package com.google.android.gms.internal.play_billing;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class a6<T> implements h6<T> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f6985l = new int[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Unsafe f6986m = a7.k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f6987a;
    public final Object[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x5 f6990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f6991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f6992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6993h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f6994i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t6 f6995j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final g4 f6996k;

    public a6(int[] iArr, Object[] objArr, int i10, int i11, x5 x5Var, boolean z10, int[] iArr2, int i12, int i13, c6 c6Var, i5 i5Var, t6 t6Var, g4 g4Var, s5 s5Var) {
        this.f6987a = iArr;
        this.b = objArr;
        this.f6988c = i10;
        this.f6989d = i11;
        boolean z11 = false;
        if (g4Var != null && (x5Var instanceof q4)) {
            z11 = true;
        }
        this.f6991f = z11;
        this.f6992g = iArr2;
        this.f6993h = i12;
        this.f6994i = i13;
        this.f6995j = t6Var;
        this.f6996k = g4Var;
        this.f6990e = x5Var;
    }

    public static int B(int i10) {
        return (i10 >>> 20) & 255;
    }

    public static long D(Object obj, long j10) {
        return ((Long) a7.j(obj, j10)).longValue();
    }

    public static Field K(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e10) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields), e10);
        }
    }

    public static void L(Object obj) {
        if (!q(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    public static boolean p(Object obj, int i10, h6 h6Var) {
        return h6Var.a(a7.j(obj, i10 & 1048575));
    }

    public static boolean q(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof t4) {
            return ((t4) obj).l();
        }
        return true;
    }

    public static final void u(int i10, Object obj, i7 i7Var) {
        if (obj instanceof String) {
            i7Var.n(i10, (String) obj);
        } else {
            i7Var.E(i10, (s3) obj);
        }
    }

    public static u6 w(Object obj) {
        t4 t4Var = (t4) obj;
        u6 u6Var = t4Var.zzc;
        if (u6Var != u6.c()) {
            return u6Var;
        }
        u6 u6VarF = u6.f();
        t4Var.zzc = u6VarF;
        return u6VarF;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0261  */
    /* JADX WARN: Code duplicated, block: B:127:0x0267  */
    /* JADX WARN: Code duplicated, block: B:130:0x0285  */
    /* JADX WARN: Code duplicated, block: B:131:0x0288  */
    /* JADX WARN: Code duplicated, block: B:171:0x0347  */
    /* JADX WARN: Code duplicated, block: B:189:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:190:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:193:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:194:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:196:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:197:0x03c3  */
    public static a6 x(Class cls, u5 u5Var, c6 c6Var, i5 i5Var, t6 t6Var, g4 g4Var, s5 s5Var) {
        int i10;
        int iCharAt;
        int i11;
        int i12;
        int i13;
        int[] iArr;
        int i14;
        int i15;
        int i16;
        int i17;
        char cCharAt;
        int i18;
        int i19;
        char cCharAt2;
        int i20;
        char cCharAt3;
        int i21;
        char cCharAt4;
        int i22;
        char cCharAt5;
        int i23;
        char cCharAt6;
        int i24;
        char cCharAt7;
        int i25;
        int i26;
        int i27;
        int i28;
        int iObjectFieldOffset;
        int i29;
        char c10;
        int i30;
        int i31;
        int i32;
        int i33;
        Field fieldK;
        int iObjectFieldOffset2;
        int i34;
        char cCharAt8;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        Object obj;
        Field fieldK2;
        int i44;
        Object obj2;
        Field fieldK3;
        int i45;
        char cCharAt9;
        int i46;
        char cCharAt10;
        int i47;
        char cCharAt11;
        int i48;
        char cCharAt12;
        if (!(u5Var instanceof g6)) {
            throw null;
        }
        g6 g6Var = (g6) u5Var;
        String strA = g6Var.a();
        int length = strA.length();
        char c11 = 55296;
        if (strA.charAt(0) >= 55296) {
            int i49 = 1;
            while (true) {
                i10 = i49 + 1;
                if (strA.charAt(i49) < 55296) {
                    break;
                }
                i49 = i10;
            }
        } else {
            i10 = 1;
        }
        int i50 = i10 + 1;
        int iCharAt2 = strA.charAt(i10);
        if (iCharAt2 >= 55296) {
            int i51 = iCharAt2 & 8191;
            int i52 = 13;
            while (true) {
                i48 = i50 + 1;
                cCharAt12 = strA.charAt(i50);
                if (cCharAt12 < 55296) {
                    break;
                }
                i51 |= (cCharAt12 & 8191) << i52;
                i52 += 13;
                i50 = i48;
            }
            iCharAt2 = i51 | (cCharAt12 << i52);
            i50 = i48;
        }
        if (iCharAt2 == 0) {
            i15 = 0;
            i13 = 0;
            iCharAt = 0;
            i14 = 0;
            i12 = 0;
            i16 = 0;
            iArr = f6985l;
            i11 = 0;
        } else {
            int i53 = i50 + 1;
            int iCharAt3 = strA.charAt(i50);
            if (iCharAt3 >= 55296) {
                int i54 = iCharAt3 & 8191;
                int i55 = 13;
                while (true) {
                    i24 = i53 + 1;
                    cCharAt7 = strA.charAt(i53);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt7 & 8191) << i55;
                    i55 += 13;
                    i53 = i24;
                }
                iCharAt3 = i54 | (cCharAt7 << i55);
                i53 = i24;
            }
            int i56 = i53 + 1;
            int iCharAt4 = strA.charAt(i53);
            if (iCharAt4 >= 55296) {
                int i57 = iCharAt4 & 8191;
                int i58 = 13;
                while (true) {
                    i23 = i56 + 1;
                    cCharAt6 = strA.charAt(i56);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt6 & 8191) << i58;
                    i58 += 13;
                    i56 = i23;
                }
                iCharAt4 = i57 | (cCharAt6 << i58);
                i56 = i23;
            }
            int i59 = i56 + 1;
            int iCharAt5 = strA.charAt(i56);
            if (iCharAt5 >= 55296) {
                int i60 = iCharAt5 & 8191;
                int i61 = 13;
                while (true) {
                    i22 = i59 + 1;
                    cCharAt5 = strA.charAt(i59);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt5 & 8191) << i61;
                    i61 += 13;
                    i59 = i22;
                }
                iCharAt5 = i60 | (cCharAt5 << i61);
                i59 = i22;
            }
            int i62 = i59 + 1;
            int iCharAt6 = strA.charAt(i59);
            if (iCharAt6 >= 55296) {
                int i63 = iCharAt6 & 8191;
                int i64 = 13;
                while (true) {
                    i21 = i62 + 1;
                    cCharAt4 = strA.charAt(i62);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i63 |= (cCharAt4 & 8191) << i64;
                    i64 += 13;
                    i62 = i21;
                }
                iCharAt6 = i63 | (cCharAt4 << i64);
                i62 = i21;
            }
            int i65 = i62 + 1;
            iCharAt = strA.charAt(i62);
            if (iCharAt >= 55296) {
                int i66 = iCharAt & 8191;
                int i67 = 13;
                while (true) {
                    i20 = i65 + 1;
                    cCharAt3 = strA.charAt(i65);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i66 |= (cCharAt3 & 8191) << i67;
                    i67 += 13;
                    i65 = i20;
                }
                iCharAt = i66 | (cCharAt3 << i67);
                i65 = i20;
            }
            int i68 = i65 + 1;
            int iCharAt7 = strA.charAt(i65);
            if (iCharAt7 >= 55296) {
                int i69 = iCharAt7 & 8191;
                int i70 = 13;
                while (true) {
                    i19 = i68 + 1;
                    cCharAt2 = strA.charAt(i68);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i69 |= (cCharAt2 & 8191) << i70;
                    i70 += 13;
                    i68 = i19;
                }
                iCharAt7 = i69 | (cCharAt2 << i70);
                i68 = i19;
            }
            int i71 = i68 + 1;
            if (strA.charAt(i68) >= 55296) {
                while (true) {
                    i18 = i71 + 1;
                    if (strA.charAt(i71) < 55296) {
                        break;
                    }
                    i71 = i18;
                }
                i71 = i18;
            }
            int i72 = i71 + 1;
            int iCharAt8 = strA.charAt(i71);
            if (iCharAt8 >= 55296) {
                int i73 = iCharAt8 & 8191;
                int i74 = 13;
                while (true) {
                    i17 = i72 + 1;
                    cCharAt = strA.charAt(i72);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i73 |= (cCharAt & 8191) << i74;
                    i74 += 13;
                    i72 = i17;
                }
                iCharAt8 = i73 | (cCharAt << i74);
                i72 = i17;
            }
            int i75 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt8 + iCharAt7 + iCharAt3];
            i11 = iCharAt3;
            i50 = i72;
            i12 = iCharAt6;
            i13 = i75;
            iArr = iArr2;
            int i76 = iCharAt7;
            i14 = iCharAt5;
            i15 = i76;
            i16 = iCharAt8;
        }
        Unsafe unsafe = f6986m;
        Object[] objArrB = g6Var.b();
        Class<?> cls2 = g6Var.zza().getClass();
        int i77 = i16 + i15;
        int i78 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i78];
        int i79 = i16;
        int i80 = i77;
        int i81 = 0;
        int i82 = 0;
        while (i50 < length) {
            int i83 = i50 + 1;
            int iCharAt9 = strA.charAt(i50);
            if (iCharAt9 >= c11) {
                int i84 = iCharAt9 & 8191;
                int i85 = i83;
                int i86 = 13;
                while (true) {
                    i47 = i85 + 1;
                    cCharAt11 = strA.charAt(i85);
                    if (cCharAt11 < c11) {
                        break;
                    }
                    i84 |= (cCharAt11 & 8191) << i86;
                    i86 += 13;
                    i85 = i47;
                }
                iCharAt9 = i84 | (cCharAt11 << i86);
                i25 = i47;
            } else {
                i25 = i83;
            }
            int i87 = i25 + 1;
            int iCharAt10 = strA.charAt(i25);
            if (iCharAt10 >= c11) {
                int i88 = iCharAt10 & 8191;
                int i89 = i87;
                int i90 = 13;
                while (true) {
                    i46 = i89 + 1;
                    cCharAt10 = strA.charAt(i89);
                    if (cCharAt10 < c11) {
                        break;
                    }
                    i88 |= (cCharAt10 & 8191) << i90;
                    i90 += 13;
                    i89 = i46;
                }
                iCharAt10 = i88 | (cCharAt10 << i90);
                i26 = i46;
            } else {
                i26 = i87;
            }
            if ((iCharAt10 & Barcode.FORMAT_UPC_E) != 0) {
                iArr[i81] = i82;
                i81++;
            }
            int i91 = iCharAt10 & 255;
            g6 g6Var2 = g6Var;
            int i92 = iCharAt10 & Barcode.FORMAT_PDF417;
            if (i91 >= 51) {
                int i93 = i26 + 1;
                int iCharAt11 = strA.charAt(i26);
                char c12 = 55296;
                if (iCharAt11 >= 55296) {
                    int i94 = iCharAt11 & 8191;
                    int i95 = i93;
                    int i96 = 13;
                    while (true) {
                        i45 = i95 + 1;
                        cCharAt9 = strA.charAt(i95);
                        if (cCharAt9 < c12) {
                            break;
                        }
                        i94 |= (cCharAt9 & 8191) << i96;
                        i96 += 13;
                        i95 = i45;
                        c12 = 55296;
                    }
                    iCharAt11 = i94 | (cCharAt9 << i96);
                    i40 = i45;
                } else {
                    i40 = i93;
                }
                i30 = i40;
                int i97 = i91 - 51;
                i27 = length;
                if (i97 == 9 || i97 == 17) {
                    i41 = i13 + 1;
                    int i98 = i82 / 3;
                    objArr[i98 + i98 + 1] = objArrB[i13];
                } else {
                    if (i97 != 12) {
                        i42 = i92;
                    } else if (g6Var2.zzc() == 1 || i92 != 0) {
                        i41 = i13 + 1;
                        int i99 = i82 / 3;
                        objArr[i99 + i99 + 1] = objArrB[i13];
                    } else {
                        i42 = 0;
                    }
                    i43 = iCharAt11 + iCharAt11;
                    obj = objArrB[i43];
                    i92 = i42;
                    if (obj instanceof Field) {
                        fieldK2 = (Field) obj;
                    } else {
                        fieldK2 = K(cls2, (String) obj);
                        objArrB[i43] = fieldK2;
                        iArr[i80] = i82;
                        i80++;
                    }
                    int i100 = i11;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldK2);
                    i44 = i43 + 1;
                    obj2 = objArrB[i44];
                    i28 = i100;
                    if (obj2 instanceof Field) {
                        fieldK3 = (Field) obj2;
                    } else {
                        fieldK3 = K(cls2, (String) obj2);
                        objArrB[i44] = fieldK3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldK3);
                    strA = strA;
                    i32 = iObjectFieldOffset3;
                    i33 = 0;
                    c10 = 55296;
                }
                i13 = i41;
                i42 = i92;
                i43 = iCharAt11 + iCharAt11;
                obj = objArrB[i43];
                i92 = i42;
                if (obj instanceof Field) {
                    fieldK2 = (Field) obj;
                } else {
                    fieldK2 = K(cls2, (String) obj);
                    objArrB[i43] = fieldK2;
                    iArr[i80] = i82;
                    i80++;
                }
                int i101 = i11;
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldK2);
                i44 = i43 + 1;
                obj2 = objArrB[i44];
                i28 = i101;
                if (obj2 instanceof Field) {
                    fieldK3 = (Field) obj2;
                } else {
                    fieldK3 = K(cls2, (String) obj2);
                    objArrB[i44] = fieldK3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldK3);
                strA = strA;
                i32 = iObjectFieldOffset4;
                i33 = 0;
                c10 = 55296;
            } else {
                i27 = length;
                i28 = i11;
                int i102 = i13 + 1;
                Field fieldK4 = K(cls2, (String) objArrB[i13]);
                if (i91 == 9 || i91 == 17) {
                    int i103 = i82 / 3;
                    objArr[i103 + i103 + 1] = fieldK4.getType();
                } else {
                    if (i91 != 27) {
                        if (i91 == 49) {
                            i13 += 2;
                            i35 = 1;
                        } else if (i91 == 12 || i91 == 30 || i91 == 44) {
                            if (g6Var2.zzc() == 1 || i92 != 0) {
                                i13 += 2;
                                int i104 = i82 / 3;
                                objArr[i104 + i104 + 1] = objArrB[i102];
                            } else {
                                i13 = i102;
                                i92 = 0;
                            }
                        } else if (i91 == 50) {
                            int i105 = i13 + 2;
                            int i106 = i79 + 1;
                            iArr[i79] = i82;
                            int i107 = i82 / 3;
                            int i108 = i107 + i107;
                            objArr[i108] = objArrB[i102];
                            if (i92 != 0) {
                                objArr[i108 + 1] = objArrB[i105];
                                i13 += 3;
                                i79 = i106;
                            } else {
                                i13 = i105;
                                i79 = i106;
                                i92 = 0;
                            }
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldK4);
                        i29 = 1048575;
                        if ((iCharAt10 & Barcode.FORMAT_AZTEC) != 0 || i91 > 17) {
                            c10 = 55296;
                            i30 = i26;
                            i31 = i92;
                            i32 = iObjectFieldOffset;
                            i33 = 0;
                        } else {
                            int i109 = i26 + 1;
                            int iCharAt12 = strA.charAt(i26);
                            if (iCharAt12 >= 55296) {
                                int i110 = iCharAt12 & 8191;
                                int i111 = 13;
                                while (true) {
                                    i34 = i109 + 1;
                                    cCharAt8 = strA.charAt(i109);
                                    if (cCharAt8 < 55296) {
                                        break;
                                    }
                                    i110 |= (cCharAt8 & 8191) << i111;
                                    i111 += 13;
                                    i109 = i34;
                                }
                                iCharAt12 = i110 | (cCharAt8 << i111);
                                i109 = i34;
                            }
                            int i112 = i28 + i28 + (iCharAt12 / 32);
                            Object obj3 = objArrB[i112];
                            int i113 = i109;
                            if (obj3 instanceof Field) {
                                fieldK = (Field) obj3;
                            } else {
                                fieldK = K(cls2, (String) obj3);
                                objArrB[i112] = fieldK;
                            }
                            int i114 = iCharAt12;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldK);
                            int i115 = i114 % 32;
                            i32 = iObjectFieldOffset;
                            i30 = i113;
                            c10 = 55296;
                            i33 = i115;
                        }
                        int i116 = i82 + 1;
                        iArr3[i82] = iCharAt9;
                        int i117 = i82 + 2;
                        i36 = i31;
                        if ((iCharAt10 & Barcode.FORMAT_UPC_A) != 0) {
                            i37 = 536870912;
                        } else {
                            i37 = 0;
                        }
                        if ((iCharAt10 & Barcode.FORMAT_QR_CODE) != 0) {
                            i38 = 268435456;
                        } else {
                            i38 = 0;
                        }
                        if (i36 != 0) {
                            i39 = Integer.MIN_VALUE;
                        } else {
                            i39 = 0;
                        }
                        iArr3[i116] = i37 | i38 | i39 | (i91 << 20) | i32;
                        i82 += 3;
                        iArr3[i117] = (i33 << 20) | i29;
                        strA = strA;
                        c11 = c10;
                        g6Var = g6Var2;
                        i50 = i30;
                        length = i27;
                        i11 = i28;
                    } else {
                        i35 = 1;
                        i13 += 2;
                    }
                    int i118 = i82 / 3;
                    objArr[i118 + i118 + i35] = objArrB[i102];
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldK4);
                    i29 = 1048575;
                    if ((iCharAt10 & Barcode.FORMAT_AZTEC) != 0) {
                    }
                    c10 = 55296;
                    i30 = i26;
                    i31 = i92;
                    i32 = iObjectFieldOffset;
                    i33 = 0;
                    int i119 = i82 + 1;
                    iArr3[i82] = iCharAt9;
                    int i1110 = i82 + 2;
                    i36 = i31;
                    if ((iCharAt10 & Barcode.FORMAT_UPC_A) != 0) {
                        i37 = 536870912;
                    } else {
                        i37 = 0;
                    }
                    if ((iCharAt10 & Barcode.FORMAT_QR_CODE) != 0) {
                        i38 = 268435456;
                    } else {
                        i38 = 0;
                    }
                    if (i36 != 0) {
                        i39 = Integer.MIN_VALUE;
                    } else {
                        i39 = 0;
                    }
                    iArr3[i119] = i37 | i38 | i39 | (i91 << 20) | i32;
                    i82 += 3;
                    iArr3[i1110] = (i33 << 20) | i29;
                    strA = strA;
                    c11 = c10;
                    g6Var = g6Var2;
                    i50 = i30;
                    length = i27;
                    i11 = i28;
                }
                i13 = i102;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldK4);
                i29 = 1048575;
                if ((iCharAt10 & Barcode.FORMAT_AZTEC) != 0) {
                }
                c10 = 55296;
                i30 = i26;
                i31 = i92;
                i32 = iObjectFieldOffset;
                i33 = 0;
                int i1111 = i82 + 1;
                iArr3[i82] = iCharAt9;
                int i1112 = i82 + 2;
                i36 = i31;
                if ((iCharAt10 & Barcode.FORMAT_UPC_A) != 0) {
                    i37 = 536870912;
                } else {
                    i37 = 0;
                }
                if ((iCharAt10 & Barcode.FORMAT_QR_CODE) != 0) {
                    i38 = 268435456;
                } else {
                    i38 = 0;
                }
                if (i36 != 0) {
                    i39 = Integer.MIN_VALUE;
                } else {
                    i39 = 0;
                }
                iArr3[i1111] = i37 | i38 | i39 | (i91 << 20) | i32;
                i82 += 3;
                iArr3[i1112] = (i33 << 20) | i29;
                strA = strA;
                c11 = c10;
                g6Var = g6Var2;
                i50 = i30;
                length = i27;
                i11 = i28;
            }
            i29 = iObjectFieldOffset2;
            i31 = i92;
            int i1113 = i82 + 1;
            iArr3[i82] = iCharAt9;
            int i1114 = i82 + 2;
            i36 = i31;
            if ((iCharAt10 & Barcode.FORMAT_UPC_A) != 0) {
                i37 = 536870912;
            } else {
                i37 = 0;
            }
            if ((iCharAt10 & Barcode.FORMAT_QR_CODE) != 0) {
                i38 = 268435456;
            } else {
                i38 = 0;
            }
            if (i36 != 0) {
                i39 = Integer.MIN_VALUE;
            } else {
                i39 = 0;
            }
            iArr3[i1113] = i37 | i38 | i39 | (i91 << 20) | i32;
            i82 += 3;
            iArr3[i1114] = (i33 << 20) | i29;
            strA = strA;
            c11 = c10;
            g6Var = g6Var2;
            i50 = i30;
            length = i27;
            i11 = i28;
        }
        return new a6(iArr3, objArr, i14, i12, g6Var.zza(), false, iArr, i16, i77, c6Var, i5Var, t6Var, g4Var, s5Var);
    }

    public static int y(Object obj, long j10) {
        return ((Integer) a7.j(obj, j10)).intValue();
    }

    public final int A(int i10, int i11) {
        int[] iArr = this.f6987a;
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

    public final int C(int i10) {
        return this.f6987a[i10 + 1];
    }

    public final w4 E(int i10) {
        int i11 = i10 / 3;
        return (w4) this.b[i11 + i11 + 1];
    }

    public final h6 F(int i10) {
        Object[] objArr = this.b;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        h6 h6Var = (h6) objArr[i12];
        if (h6Var != null) {
            return h6Var;
        }
        h6 h6VarB = e6.a().b((Class) objArr[i12 + 1]);
        objArr[i12] = h6VarB;
        return h6VarB;
    }

    public final Object G(Object obj, int i10, Object obj2, t6 t6Var, Object obj3) {
        w4 w4VarE;
        int i11 = this.f6987a[i10];
        Object objJ = a7.j(obj, C(i10) & 1048575);
        if (objJ == null || (w4VarE = E(i10)) == null) {
            return obj2;
        }
        ((q5) H(i10)).c();
        Iterator it = ((r5) objJ).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!w4VarE.a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = t6Var.a(obj3);
                }
                int iB = q5.b(null, entry.getKey(), entry.getValue());
                s3 s3Var = s3.b;
                byte[] bArr = new byte[iB];
                boolean z10 = a4.b;
                x3 x3Var = new x3(bArr, 0, iB);
                try {
                    q5.d(x3Var, null, entry.getKey(), entry.getValue());
                    ((u6) obj2).j((i11 << 3) | 2, o3.a(x3Var, bArr));
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return obj2;
    }

    public final Object H(int i10) {
        int i11 = i10 / 3;
        return this.b[i11 + i11];
    }

    public final Object I(Object obj, int i10) {
        h6 h6VarF = F(i10);
        int iC = C(i10) & 1048575;
        if (!n(obj, i10)) {
            return h6VarF.zze();
        }
        Object object = f6986m.getObject(obj, iC);
        if (q(object)) {
            return object;
        }
        Object objZze = h6VarF.zze();
        if (object != null) {
            h6VarF.c(objZze, object);
        }
        return objZze;
    }

    public final Object J(Object obj, int i10, int i11) {
        h6 h6VarF = F(i11);
        if (!s(obj, i10, i11)) {
            return h6VarF.zze();
        }
        Object object = f6986m.getObject(obj, C(i11) & 1048575);
        if (q(object)) {
            return object;
        }
        Object objZze = h6VarF.zze();
        if (object != null) {
            h6VarF.c(objZze, object);
        }
        return objZze;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x008d  */
    /* JADX WARN: Code duplicated, block: B:43:0x009c  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b2 A[LOOP:1: B:44:0x00a1->B:49:0x00b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00c6 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.play_billing.h6
    public final boolean a(Object obj) {
        int i10;
        int i11;
        List list;
        h6 h6VarF;
        int i12;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (i13 < this.f6993h) {
            int i16 = this.f6992g[i13];
            int iC = C(i16);
            int[] iArr = this.f6987a;
            int i17 = iArr[i16 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i15) {
                if (i18 != 1048575) {
                    i14 = f6986m.getInt(obj, i18);
                }
                i11 = i14;
                i10 = i18;
            } else {
                i10 = i15;
                i11 = i14;
            }
            Object obj2 = obj;
            if ((268435456 & iC) != 0 && !o(obj2, i16, i10, i11, i19)) {
                return false;
            }
            int iB = B(iC);
            if (iB == 9 || iB == 17) {
                if (o(obj2, i16, i10, i11, i19) && !p(obj2, iC, F(i16))) {
                    return false;
                }
            } else if (iB == 27) {
                list = (List) a7.j(obj2, iC & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    h6VarF = F(i16);
                    for (i12 = 0; i12 < list.size(); i12++) {
                        if (!h6VarF.a(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (iB == 60 || iB == 68) {
                if (s(obj2, iArr[i16], i16) && !p(obj2, iC, F(i16))) {
                    return false;
                }
            } else if (iB == 49) {
                list = (List) a7.j(obj2, iC & 1048575);
                if (list.isEmpty()) {
                    h6VarF = F(i16);
                    while (i12 < list.size()) {
                        if (!h6VarF.a(list.get(i12))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iB == 50 && !((r5) a7.j(obj2, iC & 1048575)).isEmpty()) {
                ((q5) H(i16)).c();
                throw null;
            }
            i13++;
            obj = obj2;
            i15 = i10;
            i14 = i11;
        }
        return !this.f6991f || ((q4) obj).zzb.i();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.play_billing.h6
    public final void b(Object obj) {
        if (q(obj)) {
            if (obj instanceof t4) {
                t4 t4Var = (t4) obj;
                t4Var.j(Integer.MAX_VALUE);
                t4Var.zza = 0;
                t4Var.h();
            }
            int[] iArr = this.f6987a;
            for (int i10 = 0; i10 < iArr.length; i10 += 3) {
                int iC = C(i10);
                int i11 = 1048575 & iC;
                int iB = B(iC);
                long j10 = i11;
                if (iB != 9) {
                    if (iB != 60 && iB != 68) {
                        switch (iB) {
                            case 17:
                                if (n(obj, i10)) {
                                    F(i10).b(f6986m.getObject(obj, j10));
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
                                ((y4) a7.j(obj, j10)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = f6986m;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((r5) object).c();
                                    unsafe.putObject(obj, j10, object);
                                }
                                break;
                        }
                    } else if (s(obj, iArr[i10], i10)) {
                        F(i10).b(f6986m.getObject(obj, j10));
                    }
                } else if (n(obj, i10)) {
                    F(i10).b(f6986m.getObject(obj, j10));
                }
            }
            this.f6995j.b(obj);
            if (this.f6991f) {
                this.f6996k.a(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.h6
    public final void c(Object obj, Object obj2) {
        L(obj);
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f6987a;
            if (i10 >= iArr.length) {
                i6.u(this.f6995j, obj, obj2);
                if (this.f6991f) {
                    i6.t(this.f6996k, obj, obj2);
                    return;
                }
                return;
            }
            int iC = C(i10);
            int i11 = 1048575 & iC;
            int iB = B(iC);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (iB) {
                case 0:
                    if (n(obj2, i10)) {
                        a7.s(obj, j10, a7.e(obj2, j10));
                        i(obj, i10);
                    }
                    break;
                case 1:
                    if (n(obj2, i10)) {
                        a7.t(obj, j10, a7.f(obj2, j10));
                        i(obj, i10);
                    }
                    break;
                case 2:
                    if (n(obj2, i10)) {
                        a7.v(obj, j10, a7.h(obj2, j10));
                        i(obj, i10);
                    }
                    break;
                case 3:
                    if (n(obj2, i10)) {
                        a7.v(obj, j10, a7.h(obj2, j10));
                        i(obj, i10);
                    }
                    break;
                case 4:
                    if (n(obj2, i10)) {
                        a7.u(obj, j10, a7.g(obj2, j10));
                        i(obj, i10);
                    }
                    break;
                case 5:
                    if (n(obj2, i10)) {
                        a7.v(obj, j10, a7.h(obj2, j10));
                        i(obj, i10);
                    }
                    break;
                case 6:
                    if (n(obj2, i10)) {
                        a7.u(obj, j10, a7.g(obj2, j10));
                        i(obj, i10);
                    }
                    break;
                case 7:
                    if (n(obj2, i10)) {
                        a7.q(obj, j10, a7.A(obj2, j10));
                        i(obj, i10);
                    }
                    break;
                case 8:
                    if (n(obj2, i10)) {
                        a7.w(obj, j10, a7.j(obj2, j10));
                        i(obj, i10);
                    }
                    break;
                case 9:
                    g(obj, obj2, i10);
                    break;
                case 10:
                    if (n(obj2, i10)) {
                        a7.w(obj, j10, a7.j(obj2, j10));
                        i(obj, i10);
                    }
                    break;
                case 11:
                    if (n(obj2, i10)) {
                        a7.u(obj, j10, a7.g(obj2, j10));
                        i(obj, i10);
                    }
                    break;
                case 12:
                    if (n(obj2, i10)) {
                        a7.u(obj, j10, a7.g(obj2, j10));
                        i(obj, i10);
                    }
                    break;
                case 13:
                    if (n(obj2, i10)) {
                        a7.u(obj, j10, a7.g(obj2, j10));
                        i(obj, i10);
                    }
                    break;
                case 14:
                    if (n(obj2, i10)) {
                        a7.v(obj, j10, a7.h(obj2, j10));
                        i(obj, i10);
                    }
                    break;
                case 15:
                    if (n(obj2, i10)) {
                        a7.u(obj, j10, a7.g(obj2, j10));
                        i(obj, i10);
                    }
                    break;
                case 16:
                    if (n(obj2, i10)) {
                        a7.v(obj, j10, a7.h(obj2, j10));
                        i(obj, i10);
                    }
                    break;
                case 17:
                    g(obj, obj2, i10);
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
                    y4 y4VarR = (y4) a7.j(obj, j10);
                    y4 y4Var = (y4) a7.j(obj2, j10);
                    int size = y4VarR.size();
                    int size2 = y4Var.size();
                    if (size > 0 && size2 > 0) {
                        if (!y4VarR.zzc()) {
                            y4VarR = y4VarR.r(size2 + size);
                        }
                        y4VarR.addAll(y4Var);
                    }
                    if (size > 0) {
                        y4Var = y4VarR;
                    }
                    a7.w(obj, j10, y4Var);
                    break;
                case 50:
                    t6 t6Var = i6.f7107a;
                    a7.w(obj, j10, s5.a(a7.j(obj, j10), a7.j(obj2, j10)));
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
                    if (s(obj2, i12, i10)) {
                        a7.w(obj, j10, a7.j(obj2, j10));
                        j(obj, i12, i10);
                    }
                    break;
                case 60:
                    h(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (s(obj2, i12, i10)) {
                        a7.w(obj, j10, a7.j(obj2, j10));
                        j(obj, i12, i10);
                    }
                    break;
                case 68:
                    h(obj, obj2, i10);
                    break;
            }
            i10 += 3;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.h6
    public final boolean d(Object obj, Object obj2) {
        boolean zE;
        for (int i10 = 0; i10 < this.f6987a.length; i10 += 3) {
            int iC = C(i10);
            int iB = B(iC);
            if (iB <= 50 || iB >= 69) {
                long j10 = iC & 1048575;
                switch (iB) {
                    case 0:
                        if (!m(obj, obj2, i10) || Double.doubleToLongBits(a7.e(obj, j10)) != Double.doubleToLongBits(a7.e(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    case 1:
                        if (!m(obj, obj2, i10) || Float.floatToIntBits(a7.f(obj, j10)) != Float.floatToIntBits(a7.f(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    case 2:
                        if (!m(obj, obj2, i10) || a7.h(obj, j10) != a7.h(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 3:
                        if (!m(obj, obj2, i10) || a7.h(obj, j10) != a7.h(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 4:
                        if (!m(obj, obj2, i10) || a7.g(obj, j10) != a7.g(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 5:
                        if (!m(obj, obj2, i10) || a7.h(obj, j10) != a7.h(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 6:
                        if (!m(obj, obj2, i10) || a7.g(obj, j10) != a7.g(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 7:
                        if (!m(obj, obj2, i10) || a7.A(obj, j10) != a7.A(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 8:
                        if (!m(obj, obj2, i10) || !i6.e(a7.j(obj, j10), a7.j(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    case 9:
                        if (!m(obj, obj2, i10) || !i6.e(a7.j(obj, j10), a7.j(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    case 10:
                        if (!m(obj, obj2, i10) || !i6.e(a7.j(obj, j10), a7.j(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    case 11:
                        if (!m(obj, obj2, i10) || a7.g(obj, j10) != a7.g(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 12:
                        if (!m(obj, obj2, i10) || a7.g(obj, j10) != a7.g(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 13:
                        if (!m(obj, obj2, i10) || a7.g(obj, j10) != a7.g(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 14:
                        if (!m(obj, obj2, i10) || a7.h(obj, j10) != a7.h(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 15:
                        if (!m(obj, obj2, i10) || a7.g(obj, j10) != a7.g(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 16:
                        if (!m(obj, obj2, i10) || a7.h(obj, j10) != a7.h(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 17:
                        if (!m(obj, obj2, i10) || !i6.e(a7.j(obj, j10), a7.j(obj2, j10))) {
                            return false;
                        }
                        continue;
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
                        zE = i6.e(a7.j(obj, j10), a7.j(obj2, j10));
                        break;
                    case 50:
                        zE = i6.e(a7.j(obj, j10), a7.j(obj2, j10));
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
                        if (!r(obj, obj2, i10) || !i6.e(a7.j(obj, j10), a7.j(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    default:
                        continue;
                }
                if (!zE) {
                    return false;
                }
            }
        }
        int i11 = this.f6994i;
        while (true) {
            int[] iArr = this.f6992g;
            if (i11 >= iArr.length) {
                if (!((t4) obj).zzc.equals(((t4) obj2).zzc)) {
                    return false;
                }
                if (this.f6991f) {
                    return ((q4) obj).zzb.equals(((q4) obj2).zzb);
                }
                return true;
            }
            int i12 = iArr[i11];
            if (!r(obj, obj2, i12)) {
                return false;
            }
            if (!s(obj, 0, i12)) {
                long jC = C(i12) & 1048575;
                if (!i6.e(a7.j(obj, jC), a7.j(obj2, jC))) {
                    return false;
                }
            }
            i11++;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.Throwable] */
    @Override // com.google.android.gms.internal.play_billing.h6
    public final void e(Object obj, i7 i7Var) {
        Map.Entry entry;
        boolean z10;
        int i10;
        p5 p5Var;
        a6<T> a6Var = this;
        p5 p5Var2 = null;
        if (a6Var.f6991f) {
            k4 k4Var = ((q4) obj).zzb;
            if (k4Var.f7119a.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) k4Var.f().next();
            }
        } else {
            entry = null;
        }
        int[] iArr = a6Var.f6987a;
        Unsafe unsafe = f6986m;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < iArr.length) {
            int iC = a6Var.C(i13);
            int iB = B(iC);
            int i15 = iArr[i13];
            if (iB <= 17) {
                int i16 = iArr[i13 + 2];
                z10 = true;
                int i17 = i16 & i11;
                if (i17 != i12) {
                    i14 = i17 == i11 ? 0 : unsafe.getInt(obj, i17);
                    i12 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            } else {
                z10 = true;
                i10 = 0;
            }
            if (entry != null) {
                ?? r17 = p5Var2;
                throw r17;
            }
            long j10 = iC & i11;
            switch (iB) {
                case 0:
                    p5Var = p5Var2;
                    if (a6Var.o(obj, i13, i12, i14, i10)) {
                        i7Var.a(i15, a7.e(obj, j10));
                    }
                    break;
                case 1:
                    p5Var = p5Var2;
                    if (a6Var.o(obj, i13, i12, i14, i10)) {
                        i7Var.F(i15, a7.f(obj, j10));
                    }
                    break;
                case 2:
                    p5Var = p5Var2;
                    if (a6Var.o(obj, i13, i12, i14, i10)) {
                        i7Var.k(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 3:
                    p5Var = p5Var2;
                    if (a6Var.o(obj, i13, i12, i14, i10)) {
                        i7Var.C(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 4:
                    p5Var = p5Var2;
                    if (a6Var.o(obj, i13, i12, i14, i10)) {
                        i7Var.o(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 5:
                    p5Var = p5Var2;
                    if (a6Var.o(obj, i13, i12, i14, i10)) {
                        i7Var.L(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 6:
                    p5Var = p5Var2;
                    if (a6Var.o(obj, i13, i12, i14, i10)) {
                        i7Var.d(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 7:
                    p5Var = p5Var2;
                    if (a6Var.o(obj, i13, i12, i14, i10)) {
                        i7Var.i(i15, a7.A(obj, j10));
                    }
                    break;
                case 8:
                    p5Var = p5Var2;
                    if (a6Var.o(obj, i13, i12, i14, i10)) {
                        u(i15, unsafe.getObject(obj, j10), i7Var);
                    }
                    break;
                case 9:
                    p5Var = p5Var2;
                    if (a6Var.o(obj, i13, i12, i14, i10)) {
                        i7Var.H(i15, unsafe.getObject(obj, j10), a6Var.F(i13));
                    }
                    break;
                case 10:
                    p5Var = p5Var2;
                    if (a6Var.o(obj, i13, i12, i14, i10)) {
                        i7Var.E(i15, (s3) unsafe.getObject(obj, j10));
                    }
                    break;
                case 11:
                    p5Var = p5Var2;
                    if (a6Var.o(obj, i13, i12, i14, i10)) {
                        i7Var.K(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 12:
                    p5Var = p5Var2;
                    if (a6Var.o(obj, i13, i12, i14, i10)) {
                        i7Var.e(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 13:
                    p5Var = p5Var2;
                    if (a6Var.o(obj, i13, i12, i14, i10)) {
                        i7Var.z(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 14:
                    p5Var = p5Var2;
                    if (a6Var.o(obj, i13, i12, i14, i10)) {
                        i7Var.j(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 15:
                    p5Var = p5Var2;
                    if (a6Var.o(obj, i13, i12, i14, i10)) {
                        i7Var.x(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 16:
                    p5Var = p5Var2;
                    if (a6Var.o(obj, i13, i12, i14, i10)) {
                        i7Var.r(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 17:
                    p5Var = p5Var2;
                    if (a6Var.o(obj, i13, i12, i14, i10)) {
                        i7Var.s(i15, unsafe.getObject(obj, j10), a6Var.F(i13));
                    }
                    break;
                case 18:
                    p5Var = p5Var2;
                    i6.w(iArr[i13], (List) unsafe.getObject(obj, j10), i7Var, false);
                    break;
                case 19:
                    p5Var = p5Var2;
                    i6.A(iArr[i13], (List) unsafe.getObject(obj, j10), i7Var, false);
                    break;
                case 20:
                    p5Var = p5Var2;
                    i6.C(iArr[i13], (List) unsafe.getObject(obj, j10), i7Var, false);
                    break;
                case 21:
                    p5Var = p5Var2;
                    i6.d(iArr[i13], (List) unsafe.getObject(obj, j10), i7Var, false);
                    break;
                case 22:
                    p5Var = p5Var2;
                    i6.B(iArr[i13], (List) unsafe.getObject(obj, j10), i7Var, false);
                    break;
                case 23:
                    p5Var = p5Var2;
                    i6.z(iArr[i13], (List) unsafe.getObject(obj, j10), i7Var, false);
                    break;
                case 24:
                    p5Var = p5Var2;
                    i6.y(iArr[i13], (List) unsafe.getObject(obj, j10), i7Var, false);
                    break;
                case 25:
                    p5Var = p5Var2;
                    i6.v(iArr[i13], (List) unsafe.getObject(obj, j10), i7Var, false);
                    break;
                case 26:
                    p5Var = p5Var2;
                    int i18 = iArr[i13];
                    List list = (List) unsafe.getObject(obj, j10);
                    t6 t6Var = i6.f7107a;
                    if (list != null && !list.isEmpty()) {
                        i7Var.I(i18, list);
                    }
                    break;
                case 27:
                    p5Var = p5Var2;
                    int i19 = iArr[i13];
                    List list2 = (List) unsafe.getObject(obj, j10);
                    h6 h6VarF = a6Var.F(i13);
                    t6 t6Var2 = i6.f7107a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i20 = 0; i20 < list2.size(); i20++) {
                            ((b4) i7Var).H(i19, list2.get(i20), h6VarF);
                        }
                    }
                    break;
                case 28:
                    p5Var = p5Var2;
                    int i21 = iArr[i13];
                    List list3 = (List) unsafe.getObject(obj, j10);
                    t6 t6Var3 = i6.f7107a;
                    if (list3 != null && !list3.isEmpty()) {
                        i7Var.h(i21, list3);
                    }
                    break;
                case 29:
                    p5Var = p5Var2;
                    i6.c(iArr[i13], (List) unsafe.getObject(obj, j10), i7Var, false);
                    break;
                case 30:
                    p5Var = p5Var2;
                    i6.x(iArr[i13], (List) unsafe.getObject(obj, j10), i7Var, false);
                    break;
                case 31:
                    p5Var = p5Var2;
                    i6.D(iArr[i13], (List) unsafe.getObject(obj, j10), i7Var, false);
                    break;
                case 32:
                    p5Var = p5Var2;
                    i6.E(iArr[i13], (List) unsafe.getObject(obj, j10), i7Var, false);
                    break;
                case 33:
                    p5Var = p5Var2;
                    i6.a(iArr[i13], (List) unsafe.getObject(obj, j10), i7Var, false);
                    break;
                case 34:
                    p5Var = p5Var2;
                    i6.b(iArr[i13], (List) unsafe.getObject(obj, j10), i7Var, false);
                    break;
                case 35:
                    p5Var = p5Var2;
                    i6.w(iArr[i13], (List) unsafe.getObject(obj, j10), i7Var, z10);
                    break;
                case 36:
                    p5Var = p5Var2;
                    i6.A(iArr[i13], (List) unsafe.getObject(obj, j10), i7Var, z10);
                    break;
                case 37:
                    p5Var = p5Var2;
                    i6.C(iArr[i13], (List) unsafe.getObject(obj, j10), i7Var, z10);
                    break;
                case 38:
                    p5Var = p5Var2;
                    i6.d(iArr[i13], (List) unsafe.getObject(obj, j10), i7Var, z10);
                    break;
                case 39:
                    p5Var = p5Var2;
                    i6.B(iArr[i13], (List) unsafe.getObject(obj, j10), i7Var, z10);
                    break;
                case 40:
                    p5Var = p5Var2;
                    i6.z(iArr[i13], (List) unsafe.getObject(obj, j10), i7Var, z10);
                    break;
                case 41:
                    p5Var = p5Var2;
                    i6.y(iArr[i13], (List) unsafe.getObject(obj, j10), i7Var, z10);
                    break;
                case 42:
                    p5Var = p5Var2;
                    i6.v(iArr[i13], (List) unsafe.getObject(obj, j10), i7Var, z10);
                    break;
                case 43:
                    p5Var = p5Var2;
                    i6.c(iArr[i13], (List) unsafe.getObject(obj, j10), i7Var, z10);
                    break;
                case 44:
                    p5Var = p5Var2;
                    i6.x(iArr[i13], (List) unsafe.getObject(obj, j10), i7Var, z10);
                    break;
                case 45:
                    p5Var = p5Var2;
                    i6.D(iArr[i13], (List) unsafe.getObject(obj, j10), i7Var, z10);
                    break;
                case 46:
                    p5Var = p5Var2;
                    i6.E(iArr[i13], (List) unsafe.getObject(obj, j10), i7Var, z10);
                    break;
                case 47:
                    p5Var = p5Var2;
                    i6.a(iArr[i13], (List) unsafe.getObject(obj, j10), i7Var, z10);
                    break;
                case 48:
                    p5Var = p5Var2;
                    i6.b(iArr[i13], (List) unsafe.getObject(obj, j10), i7Var, z10);
                    break;
                case 49:
                    int i22 = iArr[i13];
                    List list4 = (List) unsafe.getObject(obj, j10);
                    h6 h6VarF2 = a6Var.F(i13);
                    t6 t6Var4 = i6.f7107a;
                    if (list4 != null && !list4.isEmpty()) {
                        int i23 = 0;
                        while (i23 < list4.size()) {
                            ((b4) i7Var).s(i22, list4.get(i23), h6VarF2);
                            i23++;
                            p5Var2 = p5Var2;
                        }
                    }
                    p5Var = p5Var2;
                    break;
                case 50:
                    Object object = unsafe.getObject(obj, j10);
                    if (object != null) {
                        ((q5) a6Var.H(i13)).c();
                        i7Var.u(i15, p5Var2, (r5) object);
                    }
                    p5Var = p5Var2;
                    break;
                case 51:
                    if (a6Var.s(obj, i15, i13)) {
                        i7Var.a(i15, ((Double) a7.j(obj, j10)).doubleValue());
                    }
                    p5Var = p5Var2;
                    break;
                case 52:
                    if (a6Var.s(obj, i15, i13)) {
                        i7Var.F(i15, ((Float) a7.j(obj, j10)).floatValue());
                    }
                    p5Var = p5Var2;
                    break;
                case 53:
                    if (a6Var.s(obj, i15, i13)) {
                        i7Var.k(i15, D(obj, j10));
                    }
                    p5Var = p5Var2;
                    break;
                case 54:
                    if (a6Var.s(obj, i15, i13)) {
                        i7Var.C(i15, D(obj, j10));
                    }
                    p5Var = p5Var2;
                    break;
                case 55:
                    if (a6Var.s(obj, i15, i13)) {
                        i7Var.o(i15, y(obj, j10));
                    }
                    p5Var = p5Var2;
                    break;
                case 56:
                    if (a6Var.s(obj, i15, i13)) {
                        i7Var.L(i15, D(obj, j10));
                    }
                    p5Var = p5Var2;
                    break;
                case 57:
                    if (a6Var.s(obj, i15, i13)) {
                        i7Var.d(i15, y(obj, j10));
                    }
                    p5Var = p5Var2;
                    break;
                case 58:
                    if (a6Var.s(obj, i15, i13)) {
                        i7Var.i(i15, ((Boolean) a7.j(obj, j10)).booleanValue());
                    }
                    p5Var = p5Var2;
                    break;
                case 59:
                    if (a6Var.s(obj, i15, i13)) {
                        u(i15, unsafe.getObject(obj, j10), i7Var);
                    }
                    p5Var = p5Var2;
                    break;
                case 60:
                    if (a6Var.s(obj, i15, i13)) {
                        i7Var.H(i15, unsafe.getObject(obj, j10), a6Var.F(i13));
                    }
                    p5Var = p5Var2;
                    break;
                case 61:
                    if (a6Var.s(obj, i15, i13)) {
                        i7Var.E(i15, (s3) unsafe.getObject(obj, j10));
                    }
                    p5Var = p5Var2;
                    break;
                case 62:
                    if (a6Var.s(obj, i15, i13)) {
                        i7Var.K(i15, y(obj, j10));
                    }
                    p5Var = p5Var2;
                    break;
                case 63:
                    if (a6Var.s(obj, i15, i13)) {
                        i7Var.e(i15, y(obj, j10));
                    }
                    p5Var = p5Var2;
                    break;
                case 64:
                    if (a6Var.s(obj, i15, i13)) {
                        i7Var.z(i15, y(obj, j10));
                    }
                    p5Var = p5Var2;
                    break;
                case 65:
                    if (a6Var.s(obj, i15, i13)) {
                        i7Var.j(i15, D(obj, j10));
                    }
                    p5Var = p5Var2;
                    break;
                case 66:
                    if (a6Var.s(obj, i15, i13)) {
                        i7Var.x(i15, y(obj, j10));
                    }
                    p5Var = p5Var2;
                    break;
                case 67:
                    if (a6Var.s(obj, i15, i13)) {
                        i7Var.r(i15, D(obj, j10));
                    }
                    p5Var = p5Var2;
                    break;
                case 68:
                    if (a6Var.s(obj, i15, i13)) {
                        i7Var.s(i15, unsafe.getObject(obj, j10), a6Var.F(i13));
                    }
                    p5Var = p5Var2;
                    break;
                default:
                    p5Var = p5Var2;
                    break;
            }
            i13 += 3;
            a6Var = this;
            p5Var2 = p5Var;
            i11 = 1048575;
        }
        ?? r18 = p5Var2;
        if (entry != null) {
            throw r18;
        }
        ((t4) obj).zzc.l(i7Var);
    }

    @Override // com.google.android.gms.internal.play_billing.h6
    public final void f(Object obj, byte[] bArr, int i10, int i11, f3 f3Var) {
        v(obj, bArr, i10, i11, 0, f3Var);
    }

    public final void g(Object obj, Object obj2, int i10) {
        if (n(obj2, i10)) {
            int iC = C(i10) & 1048575;
            Unsafe unsafe = f6986m;
            long j10 = iC;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f6987a[i10] + " is present but null: " + obj2.toString());
            }
            h6 h6VarF = F(i10);
            if (!n(obj, i10)) {
                if (q(object)) {
                    Object objZze = h6VarF.zze();
                    h6VarF.c(objZze, object);
                    unsafe.putObject(obj, j10, objZze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                i(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!q(object2)) {
                Object objZze2 = h6VarF.zze();
                h6VarF.c(objZze2, object2);
                unsafe.putObject(obj, j10, objZze2);
                object2 = objZze2;
            }
            h6VarF.c(object2, object);
        }
    }

    public final void h(Object obj, Object obj2, int i10) {
        int[] iArr = this.f6987a;
        int i11 = iArr[i10];
        if (s(obj2, i11, i10)) {
            int iC = C(i10) & 1048575;
            Unsafe unsafe = f6986m;
            long j10 = iC;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2.toString());
            }
            h6 h6VarF = F(i10);
            if (!s(obj, i11, i10)) {
                if (q(object)) {
                    Object objZze = h6VarF.zze();
                    h6VarF.c(objZze, object);
                    unsafe.putObject(obj, j10, objZze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                j(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!q(object2)) {
                Object objZze2 = h6VarF.zze();
                h6VarF.c(objZze2, object2);
                unsafe.putObject(obj, j10, objZze2);
                object2 = objZze2;
            }
            h6VarF.c(object2, object);
        }
    }

    public final void i(Object obj, int i10) {
        int iZ = z(i10);
        long j10 = 1048575 & iZ;
        if (j10 == 1048575) {
            return;
        }
        a7.u(obj, j10, (1 << (iZ >>> 20)) | a7.g(obj, j10));
    }

    public final void j(Object obj, int i10, int i11) {
        a7.u(obj, z(i11) & 1048575, i10);
    }

    public final void k(Object obj, int i10, Object obj2) {
        f6986m.putObject(obj, C(i10) & 1048575, obj2);
        i(obj, i10);
    }

    public final void l(Object obj, int i10, int i11, Object obj2) {
        f6986m.putObject(obj, C(i11) & 1048575, obj2);
        j(obj, i10, i11);
    }

    public final boolean m(Object obj, Object obj2, int i10) {
        return n(obj, i10) == n(obj2, i10);
    }

    public final boolean n(Object obj, int i10) {
        int iZ = z(i10);
        long j10 = iZ & 1048575;
        if (j10 != 1048575) {
            return (a7.g(obj, j10) & (1 << (iZ >>> 20))) != 0;
        }
        int iC = C(i10);
        long j11 = iC & 1048575;
        switch (B(iC)) {
            case 0:
                return Double.doubleToRawLongBits(a7.e(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(a7.f(obj, j11)) != 0;
            case 2:
                return a7.h(obj, j11) != 0;
            case 3:
                return a7.h(obj, j11) != 0;
            case 4:
                return a7.g(obj, j11) != 0;
            case 5:
                return a7.h(obj, j11) != 0;
            case 6:
                return a7.g(obj, j11) != 0;
            case 7:
                return a7.A(obj, j11);
            case 8:
                Object objJ = a7.j(obj, j11);
                if (objJ instanceof String) {
                    return !((String) objJ).isEmpty();
                }
                if (objJ instanceof s3) {
                    return !s3.b.equals(objJ);
                }
                return t();
            case 9:
                return a7.j(obj, j11) != null;
            case 10:
                return !s3.b.equals(a7.j(obj, j11));
            case 11:
                return a7.g(obj, j11) != 0;
            case 12:
                return a7.g(obj, j11) != 0;
            case 13:
                return a7.g(obj, j11) != 0;
            case 14:
                return a7.h(obj, j11) != 0;
            case 15:
                return a7.g(obj, j11) != 0;
            case 16:
                return a7.h(obj, j11) != 0;
            case 17:
                return a7.j(obj, j11) != null;
            default:
                return t();
        }
    }

    public final boolean o(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return n(obj, i10);
        }
        return (i12 & i13) != 0;
    }

    public final boolean r(Object obj, Object obj2, int i10) {
        long jZ = z(i10) & 1048575;
        return a7.g(obj, jZ) == a7.g(obj2, jZ);
    }

    public final boolean s(Object obj, int i10, int i11) {
        return a7.g(obj, (long) (z(i11) & 1048575)) == i10;
    }

    public final boolean t() {
        throw new IllegalArgumentException();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 38661. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int v(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.gms.internal.play_billing.f3 r39) {
        /*
            Method dump skipped, instruction units count: 3866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.a6.v(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.f3):int");
    }

    public final int z(int i10) {
        return this.f6987a[i10 + 2];
    }

    /* JADX WARN: Code duplicated, block: B:143:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f1  */
    @Override // com.google.android.gms.internal.play_billing.h6
    public final int zza(Object obj) {
        int i10;
        int iV;
        int iV2;
        int iW;
        int iV3;
        int iV4;
        int iV5;
        int iB;
        int iV6;
        int iV7;
        int iC;
        int iV8;
        int iF;
        int iM;
        int size;
        int iQ;
        int iV9;
        int iB2;
        int iV10;
        int iB3;
        int iV11;
        int iV12;
        int iV13;
        int iW2;
        int iK;
        int iV14;
        int iV15;
        int iF2;
        int iV16;
        int iV17;
        a6<T> a6Var = this;
        Unsafe unsafe = f6986m;
        int i11 = 0;
        int i12 = 0;
        int iV18 = 0;
        int i13 = 1048575;
        while (true) {
            int[] iArr = a6Var.f6987a;
            if (i11 >= iArr.length) {
                int iA = iV18 + ((t4) obj).zzc.a();
                if (!a6Var.f6991f) {
                    return iA;
                }
                p6 p6Var = ((q4) obj).zzb.f7119a;
                int iC2 = p6Var.c();
                int iC3 = 0;
                for (int i14 = 0; i14 < iC2; i14++) {
                    Map.Entry entryG = p6Var.g(i14);
                    iC3 += k4.c((j4) ((k6) entryG).a(), entryG.getValue());
                }
                for (Map.Entry entry : p6Var.d()) {
                    iC3 += k4.c((j4) entry.getKey(), entry.getValue());
                }
                return iA + iC3;
            }
            int iC4 = a6Var.C(i11);
            int iB4 = B(iC4);
            int i15 = iArr[i11];
            int i16 = iArr[i11 + 2];
            int i17 = i16 & 1048575;
            if (iB4 <= 17) {
                if (i17 != i13) {
                    i12 = i17 == 1048575 ? 0 : unsafe.getInt(obj, i17);
                    i13 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            } else {
                i10 = 0;
            }
            int i18 = iC4 & 1048575;
            if (iB4 >= l4.K.zza()) {
                l4.X.zza();
            }
            long j10 = i18;
            switch (iB4) {
                case 0:
                    if (a6Var.o(obj, i11, i13, i12, i10)) {
                        iV18 += a4.v(i15 << 3) + 8;
                    }
                    break;
                case 1:
                    if (a6Var.o(obj, i11, i13, i12, i10)) {
                        iV = a4.v(i15 << 3);
                        iV4 = iV + 4;
                        iV18 += iV4;
                    }
                    a6Var = this;
                    break;
                case 2:
                    if (a6Var.o(obj, i11, i13, i12, i10)) {
                        long j11 = unsafe.getLong(obj, j10);
                        iV2 = a4.v(i15 << 3);
                        iW = a4.w(j11);
                        iV4 = iV2 + iW;
                        iV18 += iV4;
                    }
                    a6Var = this;
                    break;
                case 3:
                    if (a6Var.o(obj, i11, i13, i12, i10)) {
                        long j12 = unsafe.getLong(obj, j10);
                        iV2 = a4.v(i15 << 3);
                        iW = a4.w(j12);
                        iV4 = iV2 + iW;
                        iV18 += iV4;
                    }
                    a6Var = this;
                    break;
                case 4:
                    if (a6Var.o(obj, i11, i13, i12, i10)) {
                        long j13 = unsafe.getInt(obj, j10);
                        iV2 = a4.v(i15 << 3);
                        iW = a4.w(j13);
                        iV4 = iV2 + iW;
                        iV18 += iV4;
                    }
                    a6Var = this;
                    break;
                case 5:
                    if (a6Var.o(obj, i11, i13, i12, i10)) {
                        iV3 = a4.v(i15 << 3);
                        iV4 = iV3 + 8;
                        iV18 += iV4;
                    }
                    a6Var = this;
                    break;
                case 6:
                    if (a6Var.o(obj, i11, i13, i12, i10)) {
                        iV = a4.v(i15 << 3);
                        iV4 = iV + 4;
                        iV18 += iV4;
                    }
                    a6Var = this;
                    break;
                case 7:
                    if (a6Var.o(obj, i11, i13, i12, i10)) {
                        iV4 = a4.v(i15 << 3) + 1;
                        iV18 += iV4;
                    }
                    a6Var = this;
                    break;
                case 8:
                    if (a6Var.o(obj, i11, i13, i12, i10)) {
                        int i19 = i15 << 3;
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof s3) {
                            iV5 = a4.v(i19);
                            iB = ((s3) object).d();
                            iV6 = a4.v(iB);
                        } else {
                            iV5 = a4.v(i19);
                            int i20 = e7.f7036a;
                            iB = c7.b((String) object);
                            iV6 = a4.v(iB);
                        }
                        iV4 = iV5 + iV6 + iB;
                        iV18 += iV4;
                    }
                    a6Var = this;
                    break;
                case 9:
                    if (a6Var.o(obj, i11, i13, i12, i10)) {
                        int i21 = i15 << 3;
                        Object object2 = unsafe.getObject(obj, j10);
                        h6 h6VarF = a6Var.F(i11);
                        t6 t6Var = i6.f7107a;
                        iV7 = a4.v(i21);
                        iC = ((c3) object2).c(h6VarF);
                        iV8 = a4.v(iC);
                        iF = iV7 + iV8 + iC;
                        iV18 += iF;
                    }
                    break;
                case 10:
                    if (a6Var.o(obj, i11, i13, i12, i10)) {
                        s3 s3Var = (s3) unsafe.getObject(obj, j10);
                        iV5 = a4.v(i15 << 3);
                        iB = s3Var.d();
                        iV6 = a4.v(iB);
                        iV4 = iV5 + iV6 + iB;
                        iV18 += iV4;
                    }
                    a6Var = this;
                    break;
                case 11:
                    if (a6Var.o(obj, i11, i13, i12, i10)) {
                        int i22 = unsafe.getInt(obj, j10);
                        iV2 = a4.v(i15 << 3);
                        iW = a4.v(i22);
                        iV4 = iV2 + iW;
                        iV18 += iV4;
                    }
                    a6Var = this;
                    break;
                case 12:
                    if (a6Var.o(obj, i11, i13, i12, i10)) {
                        long j14 = unsafe.getInt(obj, j10);
                        iV2 = a4.v(i15 << 3);
                        iW = a4.w(j14);
                        iV4 = iV2 + iW;
                        iV18 += iV4;
                    }
                    a6Var = this;
                    break;
                case 13:
                    if (a6Var.o(obj, i11, i13, i12, i10)) {
                        iV = a4.v(i15 << 3);
                        iV4 = iV + 4;
                        iV18 += iV4;
                    }
                    a6Var = this;
                    break;
                case 14:
                    if (a6Var.o(obj, i11, i13, i12, i10)) {
                        iV3 = a4.v(i15 << 3);
                        iV4 = iV3 + 8;
                        iV18 += iV4;
                    }
                    a6Var = this;
                    break;
                case 15:
                    if (a6Var.o(obj, i11, i13, i12, i10)) {
                        int i23 = unsafe.getInt(obj, j10);
                        iV2 = a4.v(i15 << 3);
                        iW = a4.v((i23 >> 31) ^ (i23 + i23));
                        iV4 = iV2 + iW;
                        iV18 += iV4;
                    }
                    a6Var = this;
                    break;
                case 16:
                    if (a6Var.o(obj, i11, i13, i12, i10)) {
                        long j15 = unsafe.getLong(obj, j10);
                        iV2 = a4.v(i15 << 3);
                        iW = a4.w((j15 >> 63) ^ (j15 + j15));
                        iV4 = iV2 + iW;
                        iV18 += iV4;
                    }
                    a6Var = this;
                    break;
                case 17:
                    if (a6Var.o(obj, i11, i13, i12, i10)) {
                        iF = i6.f(i15, (x5) unsafe.getObject(obj, j10), a6Var.F(i11));
                        iV18 += iF;
                    }
                    break;
                case 18:
                    iF = i6.j(i15, (List) unsafe.getObject(obj, j10), false);
                    iV18 += iF;
                    break;
                case 19:
                    iF = i6.h(i15, (List) unsafe.getObject(obj, j10), false);
                    iV18 += iF;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j10);
                    t6 t6Var2 = i6.f7107a;
                    if (list.size() == 0) {
                        iM = 0;
                    } else {
                        iM = i6.m(list) + (list.size() * a4.v(i15 << 3));
                    }
                    iV18 += iM;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j10);
                    t6 t6Var3 = i6.f7107a;
                    size = list2.size();
                    if (size == 0) {
                        iF = 0;
                    } else {
                        iQ = i6.q(list2);
                        iV9 = a4.v(i15 << 3);
                        iW2 = size * iV9;
                        iF = iQ + iW2;
                    }
                    iV18 += iF;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j10);
                    t6 t6Var4 = i6.f7107a;
                    size = list3.size();
                    if (size == 0) {
                        iF = 0;
                    } else {
                        iQ = i6.l(list3);
                        iV9 = a4.v(i15 << 3);
                        iW2 = size * iV9;
                        iF = iQ + iW2;
                    }
                    iV18 += iF;
                    break;
                case 23:
                    iF = i6.j(i15, (List) unsafe.getObject(obj, j10), false);
                    iV18 += iF;
                    break;
                case 24:
                    iF = i6.h(i15, (List) unsafe.getObject(obj, j10), false);
                    iV18 += iF;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j10);
                    t6 t6Var5 = i6.f7107a;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iF = 0;
                    } else {
                        iF = size2 * (a4.v(i15 << 3) + 1);
                    }
                    iV18 += iF;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j10);
                    t6 t6Var6 = i6.f7107a;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iM = 0;
                    } else {
                        iM = a4.v(i15 << 3) * size3;
                        if (list5 instanceof h5) {
                            h5 h5Var = (h5) list5;
                            for (int i24 = 0; i24 < size3; i24++) {
                                Object objZza = h5Var.zza();
                                if (objZza instanceof s3) {
                                    iB3 = ((s3) objZza).d();
                                    iV11 = a4.v(iB3);
                                } else {
                                    int i25 = e7.f7036a;
                                    iB3 = c7.b((String) objZza);
                                    iV11 = a4.v(iB3);
                                }
                                iM += iV11 + iB3;
                            }
                        } else {
                            for (int i26 = 0; i26 < size3; i26++) {
                                Object obj2 = list5.get(i26);
                                if (obj2 instanceof s3) {
                                    iB2 = ((s3) obj2).d();
                                    iV10 = a4.v(iB2);
                                } else {
                                    int i27 = e7.f7036a;
                                    iB2 = c7.b((String) obj2);
                                    iV10 = a4.v(iB2);
                                }
                                iM += iV10 + iB2;
                            }
                        }
                    }
                    iV18 += iM;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j10);
                    h6 h6VarF2 = a6Var.F(i11);
                    t6 t6Var7 = i6.f7107a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iV12 = 0;
                    } else {
                        iV12 = a4.v(i15 << 3) * size4;
                        for (int i28 = 0; i28 < size4; i28++) {
                            int iC5 = ((c3) list6.get(i28)).c(h6VarF2);
                            iV12 += a4.v(iC5) + iC5;
                        }
                    }
                    iV18 += iV12;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j10);
                    t6 t6Var8 = i6.f7107a;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iV13 = 0;
                    } else {
                        iV13 = size5 * a4.v(i15 << 3);
                        for (int i29 = 0; i29 < list7.size(); i29++) {
                            int iD = ((s3) list7.get(i29)).d();
                            iV13 += a4.v(iD) + iD;
                        }
                    }
                    iV18 += iV13;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j10);
                    t6 t6Var9 = i6.f7107a;
                    size = list8.size();
                    if (size == 0) {
                        iF = 0;
                    } else {
                        iQ = i6.p(list8);
                        iV9 = a4.v(i15 << 3);
                        iW2 = size * iV9;
                        iF = iQ + iW2;
                    }
                    iV18 += iF;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j10);
                    t6 t6Var10 = i6.f7107a;
                    size = list9.size();
                    if (size == 0) {
                        iF = 0;
                    } else {
                        iQ = i6.g(list9);
                        iV9 = a4.v(i15 << 3);
                        iW2 = size * iV9;
                        iF = iQ + iW2;
                    }
                    iV18 += iF;
                    break;
                case 31:
                    iF = i6.h(i15, (List) unsafe.getObject(obj, j10), false);
                    iV18 += iF;
                    break;
                case 32:
                    iF = i6.j(i15, (List) unsafe.getObject(obj, j10), false);
                    iV18 += iF;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j10);
                    t6 t6Var11 = i6.f7107a;
                    size = list10.size();
                    if (size == 0) {
                        iF = 0;
                    } else {
                        iQ = i6.n(list10);
                        iV9 = a4.v(i15 << 3);
                        iW2 = size * iV9;
                        iF = iQ + iW2;
                    }
                    iV18 += iF;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j10);
                    t6 t6Var12 = i6.f7107a;
                    size = list11.size();
                    if (size == 0) {
                        iF = 0;
                    } else {
                        iQ = i6.o(list11);
                        iV9 = a4.v(i15 << 3);
                        iW2 = size * iV9;
                        iF = iQ + iW2;
                    }
                    iV18 += iF;
                    break;
                case 35:
                    iK = i6.k((List) unsafe.getObject(obj, j10));
                    if (iK > 0) {
                        iV14 = a4.v(i15 << 3);
                        iV15 = a4.v(iK);
                        iV13 = iV14 + iV15 + iK;
                        iV18 += iV13;
                    }
                    break;
                case 36:
                    iK = i6.i((List) unsafe.getObject(obj, j10));
                    if (iK > 0) {
                        iV14 = a4.v(i15 << 3);
                        iV15 = a4.v(iK);
                        iV13 = iV14 + iV15 + iK;
                        iV18 += iV13;
                    }
                    break;
                case 37:
                    iK = i6.m((List) unsafe.getObject(obj, j10));
                    if (iK > 0) {
                        iV14 = a4.v(i15 << 3);
                        iV15 = a4.v(iK);
                        iV13 = iV14 + iV15 + iK;
                        iV18 += iV13;
                    }
                    break;
                case 38:
                    iK = i6.q((List) unsafe.getObject(obj, j10));
                    if (iK > 0) {
                        iV14 = a4.v(i15 << 3);
                        iV15 = a4.v(iK);
                        iV13 = iV14 + iV15 + iK;
                        iV18 += iV13;
                    }
                    break;
                case 39:
                    iK = i6.l((List) unsafe.getObject(obj, j10));
                    if (iK > 0) {
                        iV14 = a4.v(i15 << 3);
                        iV15 = a4.v(iK);
                        iV13 = iV14 + iV15 + iK;
                        iV18 += iV13;
                    }
                    break;
                case 40:
                    iK = i6.k((List) unsafe.getObject(obj, j10));
                    if (iK > 0) {
                        iV14 = a4.v(i15 << 3);
                        iV15 = a4.v(iK);
                        iV13 = iV14 + iV15 + iK;
                        iV18 += iV13;
                    }
                    break;
                case 41:
                    iK = i6.i((List) unsafe.getObject(obj, j10));
                    if (iK > 0) {
                        iV14 = a4.v(i15 << 3);
                        iV15 = a4.v(iK);
                        iV13 = iV14 + iV15 + iK;
                        iV18 += iV13;
                    }
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(obj, j10);
                    t6 t6Var13 = i6.f7107a;
                    iK = list12.size();
                    if (iK > 0) {
                        iV14 = a4.v(i15 << 3);
                        iV15 = a4.v(iK);
                        iV13 = iV14 + iV15 + iK;
                        iV18 += iV13;
                    }
                    break;
                case 43:
                    iK = i6.p((List) unsafe.getObject(obj, j10));
                    if (iK > 0) {
                        iV14 = a4.v(i15 << 3);
                        iV15 = a4.v(iK);
                        iV13 = iV14 + iV15 + iK;
                        iV18 += iV13;
                    }
                    break;
                case 44:
                    iK = i6.g((List) unsafe.getObject(obj, j10));
                    if (iK > 0) {
                        iV14 = a4.v(i15 << 3);
                        iV15 = a4.v(iK);
                        iV13 = iV14 + iV15 + iK;
                        iV18 += iV13;
                    }
                    break;
                case 45:
                    iK = i6.i((List) unsafe.getObject(obj, j10));
                    if (iK > 0) {
                        iV14 = a4.v(i15 << 3);
                        iV15 = a4.v(iK);
                        iV13 = iV14 + iV15 + iK;
                        iV18 += iV13;
                    }
                    break;
                case 46:
                    iK = i6.k((List) unsafe.getObject(obj, j10));
                    if (iK > 0) {
                        iV14 = a4.v(i15 << 3);
                        iV15 = a4.v(iK);
                        iV13 = iV14 + iV15 + iK;
                        iV18 += iV13;
                    }
                    break;
                case 47:
                    iK = i6.n((List) unsafe.getObject(obj, j10));
                    if (iK > 0) {
                        iV14 = a4.v(i15 << 3);
                        iV15 = a4.v(iK);
                        iV13 = iV14 + iV15 + iK;
                        iV18 += iV13;
                    }
                    break;
                case 48:
                    iK = i6.o((List) unsafe.getObject(obj, j10));
                    if (iK > 0) {
                        iV14 = a4.v(i15 << 3);
                        iV15 = a4.v(iK);
                        iV13 = iV14 + iV15 + iK;
                        iV18 += iV13;
                    }
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j10);
                    h6 h6VarF3 = a6Var.F(i11);
                    t6 t6Var14 = i6.f7107a;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iF2 = 0;
                    } else {
                        iF2 = 0;
                        for (int i30 = 0; i30 < size6; i30++) {
                            iF2 += i6.f(i15, (x5) list13.get(i30), h6VarF3);
                        }
                    }
                    iV18 += iF2;
                    break;
                case 50:
                    r5 r5Var = (r5) unsafe.getObject(obj, j10);
                    q5 q5Var = (q5) a6Var.H(i11);
                    if (r5Var.isEmpty()) {
                        iM = 0;
                    } else {
                        iM = 0;
                        for (Map.Entry entry2 : r5Var.entrySet()) {
                            iM += q5Var.a(i15, entry2.getKey(), entry2.getValue());
                        }
                    }
                    iV18 += iM;
                    break;
                case 51:
                    if (a6Var.s(obj, i15, i11)) {
                        iV16 = a4.v(i15 << 3);
                        iF = iV16 + 8;
                        iV18 += iF;
                    }
                    break;
                case 52:
                    if (a6Var.s(obj, i15, i11)) {
                        iV17 = a4.v(i15 << 3);
                        iF = iV17 + 4;
                        iV18 += iF;
                    }
                    break;
                case 53:
                    if (a6Var.s(obj, i15, i11)) {
                        long jD = D(obj, j10);
                        iQ = a4.v(i15 << 3);
                        iW2 = a4.w(jD);
                        iF = iQ + iW2;
                        iV18 += iF;
                    }
                    break;
                case 54:
                    if (a6Var.s(obj, i15, i11)) {
                        long jD2 = D(obj, j10);
                        iQ = a4.v(i15 << 3);
                        iW2 = a4.w(jD2);
                        iF = iQ + iW2;
                        iV18 += iF;
                    }
                    break;
                case 55:
                    if (a6Var.s(obj, i15, i11)) {
                        long jY = y(obj, j10);
                        iQ = a4.v(i15 << 3);
                        iW2 = a4.w(jY);
                        iF = iQ + iW2;
                        iV18 += iF;
                    }
                    break;
                case 56:
                    if (a6Var.s(obj, i15, i11)) {
                        iV16 = a4.v(i15 << 3);
                        iF = iV16 + 8;
                        iV18 += iF;
                    }
                    break;
                case 57:
                    if (a6Var.s(obj, i15, i11)) {
                        iV17 = a4.v(i15 << 3);
                        iF = iV17 + 4;
                        iV18 += iF;
                    }
                    break;
                case 58:
                    if (a6Var.s(obj, i15, i11)) {
                        iF = a4.v(i15 << 3) + 1;
                        iV18 += iF;
                    }
                    break;
                case 59:
                    if (a6Var.s(obj, i15, i11)) {
                        int i31 = i15 << 3;
                        Object object3 = unsafe.getObject(obj, j10);
                        if (object3 instanceof s3) {
                            iV7 = a4.v(i31);
                            iC = ((s3) object3).d();
                            iV8 = a4.v(iC);
                        } else {
                            iV7 = a4.v(i31);
                            int i32 = e7.f7036a;
                            iC = c7.b((String) object3);
                            iV8 = a4.v(iC);
                        }
                        iF = iV7 + iV8 + iC;
                        iV18 += iF;
                    }
                    break;
                case 60:
                    if (a6Var.s(obj, i15, i11)) {
                        int i33 = i15 << 3;
                        Object object4 = unsafe.getObject(obj, j10);
                        h6 h6VarF4 = a6Var.F(i11);
                        t6 t6Var15 = i6.f7107a;
                        iV7 = a4.v(i33);
                        iC = ((c3) object4).c(h6VarF4);
                        iV8 = a4.v(iC);
                        iF = iV7 + iV8 + iC;
                        iV18 += iF;
                    }
                    break;
                case 61:
                    if (a6Var.s(obj, i15, i11)) {
                        s3 s3Var2 = (s3) unsafe.getObject(obj, j10);
                        iV7 = a4.v(i15 << 3);
                        iC = s3Var2.d();
                        iV8 = a4.v(iC);
                        iF = iV7 + iV8 + iC;
                        iV18 += iF;
                    }
                    break;
                case 62:
                    if (a6Var.s(obj, i15, i11)) {
                        int iY = y(obj, j10);
                        iQ = a4.v(i15 << 3);
                        iW2 = a4.v(iY);
                        iF = iQ + iW2;
                        iV18 += iF;
                    }
                    break;
                case 63:
                    if (a6Var.s(obj, i15, i11)) {
                        long jY2 = y(obj, j10);
                        iQ = a4.v(i15 << 3);
                        iW2 = a4.w(jY2);
                        iF = iQ + iW2;
                        iV18 += iF;
                    }
                    break;
                case 64:
                    if (a6Var.s(obj, i15, i11)) {
                        iV17 = a4.v(i15 << 3);
                        iF = iV17 + 4;
                        iV18 += iF;
                    }
                    break;
                case 65:
                    if (a6Var.s(obj, i15, i11)) {
                        iV16 = a4.v(i15 << 3);
                        iF = iV16 + 8;
                        iV18 += iF;
                    }
                    break;
                case 66:
                    if (a6Var.s(obj, i15, i11)) {
                        int iY2 = y(obj, j10);
                        iQ = a4.v(i15 << 3);
                        iW2 = a4.v((iY2 >> 31) ^ (iY2 + iY2));
                        iF = iQ + iW2;
                        iV18 += iF;
                    }
                    break;
                case 67:
                    if (a6Var.s(obj, i15, i11)) {
                        long jD3 = D(obj, j10);
                        iQ = a4.v(i15 << 3);
                        iW2 = a4.w((jD3 >> 63) ^ (jD3 + jD3));
                        iF = iQ + iW2;
                        iV18 += iF;
                    }
                    break;
                case 68:
                    if (a6Var.s(obj, i15, i11)) {
                        iF = i6.f(i15, (x5) unsafe.getObject(obj, j10), a6Var.F(i11));
                        iV18 += iF;
                    }
                    break;
            }
            i11 += 3;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.h6
    public final int zzb(Object obj) {
        int i10;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i11;
        int iHashCode = 0;
        for (int i12 = 0; i12 < this.f6987a.length; i12 += 3) {
            int iC = C(i12);
            int iB = B(iC);
            if (iB <= 50 || iB >= 69) {
                long j10 = iC & 1048575;
                int iHashCode2 = 37;
                switch (iB) {
                    case 0:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(a7.e(obj, j10));
                        byte[] bArr = z4.f7356a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 1:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = Float.floatToIntBits(a7.f(obj, j10));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 2:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = a7.h(obj, j10);
                        byte[] bArr2 = z4.f7356a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 3:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = a7.h(obj, j10);
                        byte[] bArr3 = z4.f7356a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 4:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = a7.g(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 5:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = a7.h(obj, j10);
                        byte[] bArr4 = z4.f7356a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 6:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = a7.g(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 7:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = z4.a(a7.A(obj, j10));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 8:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = ((String) a7.j(obj, j10)).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 9:
                        i11 = iHashCode * 53;
                        Object objJ = a7.j(obj, j10);
                        if (objJ != null) {
                            iHashCode2 = objJ.hashCode();
                        }
                        iHashCode = i11 + iHashCode2;
                        break;
                    case 10:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = a7.j(obj, j10).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 11:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = a7.g(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 12:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = a7.g(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 13:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = a7.g(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 14:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = a7.h(obj, j10);
                        byte[] bArr5 = z4.f7356a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 15:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = a7.g(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 16:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = a7.h(obj, j10);
                        byte[] bArr6 = z4.f7356a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 17:
                        i11 = iHashCode * 53;
                        Object objJ2 = a7.j(obj, j10);
                        if (objJ2 != null) {
                            iHashCode2 = objJ2.hashCode();
                        }
                        iHashCode = i11 + iHashCode2;
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
                        i10 = iHashCode * 53;
                        iFloatToIntBits = a7.j(obj, j10).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 50:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = a7.j(obj, j10).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                }
            }
        }
        int i13 = this.f6994i;
        while (true) {
            int[] iArr = this.f6992g;
            if (i13 >= iArr.length) {
                int iHashCode3 = (iHashCode * 53) + ((t4) obj).zzc.hashCode();
                return this.f6991f ? (iHashCode3 * 53) + ((q4) obj).zzb.f7119a.hashCode() : iHashCode3;
            }
            int i14 = iArr[i13];
            if (!s(obj, 0, i14)) {
                iHashCode = (iHashCode * 53) + a7.j(obj, C(i14) & 1048575).hashCode();
            }
            i13++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.h6
    public final Object zze() {
        return ((t4) this.f6990e).u();
    }
}
