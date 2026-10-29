package com.google.android.gms.internal.play_billing;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.a6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2445a6<T> implements InterfaceC2522h6<T> {

    /* JADX INFO: renamed from: l */
    public static final int[] f8902l = new int[0];

    /* JADX INFO: renamed from: m */
    public static final Unsafe f8903m = C2446a7.m11247k();

    /* JADX INFO: renamed from: a */
    public final int[] f8904a;

    /* JADX INFO: renamed from: b */
    public final Object[] f8905b;

    /* JADX INFO: renamed from: c */
    public final int f8906c;

    /* JADX INFO: renamed from: d */
    public final int f8907d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2697x5 f8908e;

    /* JADX INFO: renamed from: f */
    public final boolean f8909f;

    /* JADX INFO: renamed from: g */
    public final int[] f8910g;

    /* JADX INFO: renamed from: h */
    public final int f8911h;

    /* JADX INFO: renamed from: i */
    public final int f8912i;

    /* JADX INFO: renamed from: j */
    public final AbstractC2654t6 f8913j;

    /* JADX INFO: renamed from: k */
    public final AbstractC2509g4 f8914k;

    public C2445a6(int[] iArr, Object[] objArr, int i10, int i11, InterfaceC2697x5 interfaceC2697x5, boolean z10, int[] iArr2, int i12, int i13, C2467c6 c2467c6, C2532i5 c2532i5, AbstractC2654t6 abstractC2654t6, AbstractC2509g4 abstractC2509g4, C2642s5 c2642s5) {
        this.f8904a = iArr;
        this.f8905b = objArr;
        this.f8906c = i10;
        this.f8907d = i11;
        boolean z11 = false;
        if (abstractC2509g4 != null && (interfaceC2697x5 instanceof AbstractC2619q4)) {
            z11 = true;
        }
        this.f8909f = z11;
        this.f8910g = iArr2;
        this.f8911h = i12;
        this.f8912i = i13;
        this.f8913j = abstractC2654t6;
        this.f8914k = abstractC2509g4;
        this.f8908e = interfaceC2697x5;
    }

    /* JADX INFO: renamed from: B */
    public static int m11195B(int i10) {
        return (i10 >>> 20) & 255;
    }

    /* JADX INFO: renamed from: D */
    public static long m11196D(Object obj, long j10) {
        return ((Long) C2446a7.m11246j(obj, j10)).longValue();
    }

    /* JADX INFO: renamed from: K */
    public static Field m11197K(Class cls, String str) {
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

    /* JADX INFO: renamed from: L */
    public static void m11198L(Object obj) {
        if (!m11200q(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    /* JADX INFO: renamed from: p */
    public static boolean m11199p(Object obj, int i10, InterfaceC2522h6 interfaceC2522h6) {
        return interfaceC2522h6.mo11213a(C2446a7.m11246j(obj, i10 & 1048575));
    }

    /* JADX INFO: renamed from: q */
    public static boolean m11200q(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC2652t4) {
            return ((AbstractC2652t4) obj).m11753l();
        }
        return true;
    }

    /* JADX INFO: renamed from: u */
    public static final void m11201u(int i10, Object obj, InterfaceC2534i7 interfaceC2534i7) {
        if (obj instanceof String) {
            interfaceC2534i7.mo11302n(i10, (String) obj);
        } else {
            interfaceC2534i7.mo11281E(i10, (AbstractC2640s3) obj);
        }
    }

    /* JADX INFO: renamed from: w */
    public static C2665u6 m11202w(Object obj) {
        AbstractC2652t4 abstractC2652t4 = (AbstractC2652t4) obj;
        C2665u6 c2665u6 = abstractC2652t4.zzc;
        if (c2665u6 != C2665u6.m11776c()) {
            return c2665u6;
        }
        C2665u6 c2665u6M11778f = C2665u6.m11778f();
        abstractC2652t4.zzc = c2665u6M11778f;
        return c2665u6M11778f;
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
    /* JADX INFO: renamed from: x */
    public static C2445a6 m11203x(Class cls, InterfaceC2664u5 interfaceC2664u5, C2467c6 c2467c6, C2532i5 c2532i5, AbstractC2654t6 abstractC2654t6, AbstractC2509g4 abstractC2509g4, C2642s5 c2642s5) {
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
        Field fieldM11197K;
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
        Field fieldM11197K2;
        int i44;
        Object obj2;
        Field fieldM11197K3;
        int i45;
        char cCharAt9;
        int i46;
        char cCharAt10;
        int i47;
        char cCharAt11;
        int i48;
        char cCharAt12;
        if (!(interfaceC2664u5 instanceof C2511g6)) {
            throw null;
        }
        C2511g6 c2511g6 = (C2511g6) interfaceC2664u5;
        String strM11438a = c2511g6.m11438a();
        int length = strM11438a.length();
        char c11 = 55296;
        if (strM11438a.charAt(0) >= 55296) {
            int i49 = 1;
            while (true) {
                i10 = i49 + 1;
                if (strM11438a.charAt(i49) < 55296) {
                    break;
                }
                i49 = i10;
            }
        } else {
            i10 = 1;
        }
        int i50 = i10 + 1;
        int iCharAt2 = strM11438a.charAt(i10);
        if (iCharAt2 >= 55296) {
            int i51 = iCharAt2 & 8191;
            int i52 = 13;
            while (true) {
                i48 = i50 + 1;
                cCharAt12 = strM11438a.charAt(i50);
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
            iArr = f8902l;
            i11 = 0;
        } else {
            int i53 = i50 + 1;
            int iCharAt3 = strM11438a.charAt(i50);
            if (iCharAt3 >= 55296) {
                int i54 = iCharAt3 & 8191;
                int i55 = 13;
                while (true) {
                    i24 = i53 + 1;
                    cCharAt7 = strM11438a.charAt(i53);
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
            int iCharAt4 = strM11438a.charAt(i53);
            if (iCharAt4 >= 55296) {
                int i57 = iCharAt4 & 8191;
                int i58 = 13;
                while (true) {
                    i23 = i56 + 1;
                    cCharAt6 = strM11438a.charAt(i56);
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
            int iCharAt5 = strM11438a.charAt(i56);
            if (iCharAt5 >= 55296) {
                int i60 = iCharAt5 & 8191;
                int i61 = 13;
                while (true) {
                    i22 = i59 + 1;
                    cCharAt5 = strM11438a.charAt(i59);
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
            int iCharAt6 = strM11438a.charAt(i59);
            if (iCharAt6 >= 55296) {
                int i63 = iCharAt6 & 8191;
                int i64 = 13;
                while (true) {
                    i21 = i62 + 1;
                    cCharAt4 = strM11438a.charAt(i62);
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
            iCharAt = strM11438a.charAt(i62);
            if (iCharAt >= 55296) {
                int i66 = iCharAt & 8191;
                int i67 = 13;
                while (true) {
                    i20 = i65 + 1;
                    cCharAt3 = strM11438a.charAt(i65);
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
            int iCharAt7 = strM11438a.charAt(i65);
            if (iCharAt7 >= 55296) {
                int i69 = iCharAt7 & 8191;
                int i70 = 13;
                while (true) {
                    i19 = i68 + 1;
                    cCharAt2 = strM11438a.charAt(i68);
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
            if (strM11438a.charAt(i68) >= 55296) {
                while (true) {
                    i18 = i71 + 1;
                    if (strM11438a.charAt(i71) < 55296) {
                        break;
                    }
                    i71 = i18;
                }
                i71 = i18;
            }
            int i72 = i71 + 1;
            int iCharAt8 = strM11438a.charAt(i71);
            if (iCharAt8 >= 55296) {
                int i73 = iCharAt8 & 8191;
                int i74 = 13;
                while (true) {
                    i17 = i72 + 1;
                    cCharAt = strM11438a.charAt(i72);
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
        Unsafe unsafe = f8903m;
        Object[] objArrM11439b = c2511g6.m11439b();
        Class<?> cls2 = c2511g6.zza().getClass();
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
            int iCharAt9 = strM11438a.charAt(i50);
            if (iCharAt9 >= c11) {
                int i84 = iCharAt9 & 8191;
                int i85 = i83;
                int i86 = 13;
                while (true) {
                    i47 = i85 + 1;
                    cCharAt11 = strM11438a.charAt(i85);
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
            int iCharAt10 = strM11438a.charAt(i25);
            if (iCharAt10 >= c11) {
                int i88 = iCharAt10 & 8191;
                int i89 = i87;
                int i90 = 13;
                while (true) {
                    i46 = i89 + 1;
                    cCharAt10 = strM11438a.charAt(i89);
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
            if ((iCharAt10 & 1024) != 0) {
                iArr[i81] = i82;
                i81++;
            }
            int i91 = iCharAt10 & 255;
            C2511g6 c2511g7 = c2511g6;
            int i92 = iCharAt10 & 2048;
            if (i91 >= 51) {
                int i93 = i26 + 1;
                int iCharAt11 = strM11438a.charAt(i26);
                char c12 = 55296;
                if (iCharAt11 >= 55296) {
                    int i94 = iCharAt11 & 8191;
                    int i95 = i93;
                    int i96 = 13;
                    while (true) {
                        i45 = i95 + 1;
                        cCharAt9 = strM11438a.charAt(i95);
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
                    objArr[i98 + i98 + 1] = objArrM11439b[i13];
                } else {
                    if (i97 != 12) {
                        i42 = i92;
                    } else if (c2511g7.zzc() == 1 || i92 != 0) {
                        i41 = i13 + 1;
                        int i99 = i82 / 3;
                        objArr[i99 + i99 + 1] = objArrM11439b[i13];
                    } else {
                        i42 = 0;
                    }
                    i43 = iCharAt11 + iCharAt11;
                    obj = objArrM11439b[i43];
                    i92 = i42;
                    if (obj instanceof Field) {
                        fieldM11197K2 = (Field) obj;
                    } else {
                        fieldM11197K2 = m11197K(cls2, (String) obj);
                        objArrM11439b[i43] = fieldM11197K2;
                        iArr[i80] = i82;
                        i80++;
                    }
                    int i100 = i11;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM11197K2);
                    i44 = i43 + 1;
                    obj2 = objArrM11439b[i44];
                    i28 = i100;
                    if (obj2 instanceof Field) {
                        fieldM11197K3 = (Field) obj2;
                    } else {
                        fieldM11197K3 = m11197K(cls2, (String) obj2);
                        objArrM11439b[i44] = fieldM11197K3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM11197K3);
                    strM11438a = strM11438a;
                    i32 = iObjectFieldOffset3;
                    i33 = 0;
                    c10 = 55296;
                }
                i13 = i41;
                i42 = i92;
                i43 = iCharAt11 + iCharAt11;
                obj = objArrM11439b[i43];
                i92 = i42;
                if (obj instanceof Field) {
                    fieldM11197K2 = (Field) obj;
                } else {
                    fieldM11197K2 = m11197K(cls2, (String) obj);
                    objArrM11439b[i43] = fieldM11197K2;
                    iArr[i80] = i82;
                    i80++;
                }
                int i101 = i11;
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldM11197K2);
                i44 = i43 + 1;
                obj2 = objArrM11439b[i44];
                i28 = i101;
                if (obj2 instanceof Field) {
                    fieldM11197K3 = (Field) obj2;
                } else {
                    fieldM11197K3 = m11197K(cls2, (String) obj2);
                    objArrM11439b[i44] = fieldM11197K3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM11197K3);
                strM11438a = strM11438a;
                i32 = iObjectFieldOffset4;
                i33 = 0;
                c10 = 55296;
            } else {
                i27 = length;
                i28 = i11;
                int i102 = i13 + 1;
                Field fieldM11197K4 = m11197K(cls2, (String) objArrM11439b[i13]);
                if (i91 == 9 || i91 == 17) {
                    int i103 = i82 / 3;
                    objArr[i103 + i103 + 1] = fieldM11197K4.getType();
                } else {
                    if (i91 != 27) {
                        if (i91 == 49) {
                            i13 += 2;
                            i35 = 1;
                        } else if (i91 == 12 || i91 == 30 || i91 == 44) {
                            if (c2511g7.zzc() == 1 || i92 != 0) {
                                i13 += 2;
                                int i104 = i82 / 3;
                                objArr[i104 + i104 + 1] = objArrM11439b[i102];
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
                            objArr[i108] = objArrM11439b[i102];
                            if (i92 != 0) {
                                objArr[i108 + 1] = objArrM11439b[i105];
                                i13 += 3;
                                i79 = i106;
                            } else {
                                i13 = i105;
                                i79 = i106;
                                i92 = 0;
                            }
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM11197K4);
                        i29 = 1048575;
                        if ((iCharAt10 & 4096) != 0 || i91 > 17) {
                            c10 = 55296;
                            i30 = i26;
                            i31 = i92;
                            i32 = iObjectFieldOffset;
                            i33 = 0;
                        } else {
                            int i109 = i26 + 1;
                            int iCharAt12 = strM11438a.charAt(i26);
                            if (iCharAt12 >= 55296) {
                                int i110 = iCharAt12 & 8191;
                                int i111 = 13;
                                while (true) {
                                    i34 = i109 + 1;
                                    cCharAt8 = strM11438a.charAt(i109);
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
                            Object obj3 = objArrM11439b[i112];
                            int i113 = i109;
                            if (obj3 instanceof Field) {
                                fieldM11197K = (Field) obj3;
                            } else {
                                fieldM11197K = m11197K(cls2, (String) obj3);
                                objArrM11439b[i112] = fieldM11197K;
                            }
                            int i114 = iCharAt12;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM11197K);
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
                        if ((iCharAt10 & 512) != 0) {
                            i37 = 536870912;
                        } else {
                            i37 = 0;
                        }
                        if ((iCharAt10 & 256) != 0) {
                            i38 = 268435456;
                        } else {
                            i38 = 0;
                        }
                        if (i36 != 0) {
                            i39 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                        } else {
                            i39 = 0;
                        }
                        iArr3[i116] = i37 | i38 | i39 | (i91 << 20) | i32;
                        i82 += 3;
                        iArr3[i117] = (i33 << 20) | i29;
                        strM11438a = strM11438a;
                        c11 = c10;
                        c2511g6 = c2511g7;
                        i50 = i30;
                        length = i27;
                        i11 = i28;
                    } else {
                        i35 = 1;
                        i13 += 2;
                    }
                    int i118 = i82 / 3;
                    objArr[i118 + i118 + i35] = objArrM11439b[i102];
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM11197K4);
                    i29 = 1048575;
                    if ((iCharAt10 & 4096) != 0) {
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
                    if ((iCharAt10 & 512) != 0) {
                        i37 = 536870912;
                    } else {
                        i37 = 0;
                    }
                    if ((iCharAt10 & 256) != 0) {
                        i38 = 268435456;
                    } else {
                        i38 = 0;
                    }
                    if (i36 != 0) {
                        i39 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    } else {
                        i39 = 0;
                    }
                    iArr3[i119] = i37 | i38 | i39 | (i91 << 20) | i32;
                    i82 += 3;
                    iArr3[i1110] = (i33 << 20) | i29;
                    strM11438a = strM11438a;
                    c11 = c10;
                    c2511g6 = c2511g7;
                    i50 = i30;
                    length = i27;
                    i11 = i28;
                }
                i13 = i102;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM11197K4);
                i29 = 1048575;
                if ((iCharAt10 & 4096) != 0) {
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
                if ((iCharAt10 & 512) != 0) {
                    i37 = 536870912;
                } else {
                    i37 = 0;
                }
                if ((iCharAt10 & 256) != 0) {
                    i38 = 268435456;
                } else {
                    i38 = 0;
                }
                if (i36 != 0) {
                    i39 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                } else {
                    i39 = 0;
                }
                iArr3[i1111] = i37 | i38 | i39 | (i91 << 20) | i32;
                i82 += 3;
                iArr3[i1112] = (i33 << 20) | i29;
                strM11438a = strM11438a;
                c11 = c10;
                c2511g6 = c2511g7;
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
            if ((iCharAt10 & 512) != 0) {
                i37 = 536870912;
            } else {
                i37 = 0;
            }
            if ((iCharAt10 & 256) != 0) {
                i38 = 268435456;
            } else {
                i38 = 0;
            }
            if (i36 != 0) {
                i39 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                i39 = 0;
            }
            iArr3[i1113] = i37 | i38 | i39 | (i91 << 20) | i32;
            i82 += 3;
            iArr3[i1114] = (i33 << 20) | i29;
            strM11438a = strM11438a;
            c11 = c10;
            c2511g6 = c2511g7;
            i50 = i30;
            length = i27;
            i11 = i28;
        }
        return new C2445a6(iArr3, objArr, i14, i12, c2511g6.zza(), false, iArr, i16, i77, c2467c6, c2532i5, abstractC2654t6, abstractC2509g4, c2642s5);
    }

    /* JADX INFO: renamed from: y */
    public static int m11204y(Object obj, long j10) {
        return ((Integer) C2446a7.m11246j(obj, j10)).intValue();
    }

    /* JADX INFO: renamed from: A */
    public final int m11205A(int i10, int i11) {
        int[] iArr = this.f8904a;
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

    /* JADX INFO: renamed from: C */
    public final int m11206C(int i10) {
        return this.f8904a[i10 + 1];
    }

    /* JADX INFO: renamed from: E */
    public final InterfaceC2685w4 m11207E(int i10) {
        int i11 = i10 / 3;
        return (InterfaceC2685w4) this.f8905b[i11 + i11 + 1];
    }

    /* JADX INFO: renamed from: F */
    public final InterfaceC2522h6 m11208F(int i10) {
        Object[] objArr = this.f8905b;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        InterfaceC2522h6 interfaceC2522h6 = (InterfaceC2522h6) objArr[i12];
        if (interfaceC2522h6 != null) {
            return interfaceC2522h6;
        }
        InterfaceC2522h6 interfaceC2522h6M11378b = C2489e6.m11377a().m11378b((Class) objArr[i12 + 1]);
        objArr[i12] = interfaceC2522h6M11378b;
        return interfaceC2522h6M11378b;
    }

    /* JADX INFO: renamed from: G */
    public final Object m11209G(Object obj, int i10, Object obj2, AbstractC2654t6 abstractC2654t6, Object obj3) {
        InterfaceC2685w4 interfaceC2685w4M11207E;
        int i11 = this.f8904a[i10];
        Object objM11246j = C2446a7.m11246j(obj, m11206C(i10) & 1048575);
        if (objM11246j == null || (interfaceC2685w4M11207E = m11207E(i10)) == null) {
            return obj2;
        }
        ((C2620q5) m11210H(i10)).m11687c();
        Iterator it = ((C2631r5) objM11246j).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!interfaceC2685w4M11207E.mo11321a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = abstractC2654t6.mo11760a(obj3);
                }
                int iM11684b = C2620q5.m11684b(null, entry.getKey(), entry.getValue());
                AbstractC2640s3 abstractC2640s3 = AbstractC2640s3.f9227b;
                byte[] bArr = new byte[iM11684b];
                boolean z10 = AbstractC2443a4.f8899b;
                C2695x3 c2695x3 = new C2695x3(bArr, 0, iM11684b);
                try {
                    C2620q5.m11685d(c2695x3, null, entry.getKey(), entry.getValue());
                    ((C2665u6) obj2).m11785j((i11 << 3) | 2, C2596o3.m11632a(c2695x3, bArr));
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return obj2;
    }

    /* JADX INFO: renamed from: H */
    public final Object m11210H(int i10) {
        int i11 = i10 / 3;
        return this.f8905b[i11 + i11];
    }

    /* JADX INFO: renamed from: I */
    public final Object m11211I(Object obj, int i10) {
        InterfaceC2522h6 interfaceC2522h6M11208F = m11208F(i10);
        int iM11206C = m11206C(i10) & 1048575;
        if (!m11226n(obj, i10)) {
            return interfaceC2522h6M11208F.zze();
        }
        Object object = f8903m.getObject(obj, iM11206C);
        if (m11200q(object)) {
            return object;
        }
        Object objZze = interfaceC2522h6M11208F.zze();
        if (object != null) {
            interfaceC2522h6M11208F.mo11215c(objZze, object);
        }
        return objZze;
    }

    /* JADX INFO: renamed from: J */
    public final Object m11212J(Object obj, int i10, int i11) {
        InterfaceC2522h6 interfaceC2522h6M11208F = m11208F(i11);
        if (!m11229s(obj, i10, i11)) {
            return interfaceC2522h6M11208F.zze();
        }
        Object object = f8903m.getObject(obj, m11206C(i11) & 1048575);
        if (m11200q(object)) {
            return object;
        }
        Object objZze = interfaceC2522h6M11208F.zze();
        if (object != null) {
            interfaceC2522h6M11208F.mo11215c(objZze, object);
        }
        return objZze;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x008d  */
    /* JADX WARN: Code duplicated, block: B:43:0x009c  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b2 A[LOOP:1: B:44:0x00a1->B:49:0x00b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00c6 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC2522h6
    /* JADX INFO: renamed from: a */
    public final boolean mo11213a(Object obj) {
        int i10;
        int i11;
        List list;
        InterfaceC2522h6 interfaceC2522h6M11208F;
        int i12;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (i13 < this.f8911h) {
            int i16 = this.f8910g[i13];
            int iM11206C = m11206C(i16);
            int[] iArr = this.f8904a;
            int i17 = iArr[i16 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i15) {
                if (i18 != 1048575) {
                    i14 = f8903m.getInt(obj, i18);
                }
                i11 = i14;
                i10 = i18;
            } else {
                i10 = i15;
                i11 = i14;
            }
            Object obj2 = obj;
            if ((268435456 & iM11206C) != 0 && !m11227o(obj2, i16, i10, i11, i19)) {
                return false;
            }
            int iM11195B = m11195B(iM11206C);
            if (iM11195B == 9 || iM11195B == 17) {
                if (m11227o(obj2, i16, i10, i11, i19) && !m11199p(obj2, iM11206C, m11208F(i16))) {
                    return false;
                }
            } else if (iM11195B == 27) {
                list = (List) C2446a7.m11246j(obj2, iM11206C & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    interfaceC2522h6M11208F = m11208F(i16);
                    for (i12 = 0; i12 < list.size(); i12++) {
                        if (!interfaceC2522h6M11208F.mo11213a(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (iM11195B == 60 || iM11195B == 68) {
                if (m11229s(obj2, iArr[i16], i16) && !m11199p(obj2, iM11206C, m11208F(i16))) {
                    return false;
                }
            } else if (iM11195B == 49) {
                list = (List) C2446a7.m11246j(obj2, iM11206C & 1048575);
                if (list.isEmpty()) {
                    interfaceC2522h6M11208F = m11208F(i16);
                    while (i12 < list.size()) {
                        if (!interfaceC2522h6M11208F.mo11213a(list.get(i12))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iM11195B == 50 && !((C2631r5) C2446a7.m11246j(obj2, iM11206C & 1048575)).isEmpty()) {
                ((C2620q5) m11210H(i16)).m11687c();
                throw null;
            }
            i13++;
            obj = obj2;
            i15 = i10;
            i14 = i11;
        }
        return !this.f8909f || ((AbstractC2619q4) obj).zzb.m11529i();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC2522h6
    /* JADX INFO: renamed from: b */
    public final void mo11214b(Object obj) {
        if (m11200q(obj)) {
            if (obj instanceof AbstractC2652t4) {
                AbstractC2652t4 abstractC2652t4 = (AbstractC2652t4) obj;
                abstractC2652t4.m11752j(Integer.MAX_VALUE);
                abstractC2652t4.zza = 0;
                abstractC2652t4.m11751h();
            }
            int[] iArr = this.f8904a;
            for (int i10 = 0; i10 < iArr.length; i10 += 3) {
                int iM11206C = m11206C(i10);
                int i11 = 1048575 & iM11206C;
                int iM11195B = m11195B(iM11206C);
                long j10 = i11;
                if (iM11195B != 9) {
                    if (iM11195B != 60 && iM11195B != 68) {
                        switch (iM11195B) {
                            case 17:
                                if (m11226n(obj, i10)) {
                                    m11208F(i10).mo11214b(f8903m.getObject(obj, j10));
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
                                ((InterfaceC2707y4) C2446a7.m11246j(obj, j10)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = f8903m;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((C2631r5) object).m11700c();
                                    unsafe.putObject(obj, j10, object);
                                }
                                break;
                        }
                    } else if (m11229s(obj, iArr[i10], i10)) {
                        m11208F(i10).mo11214b(f8903m.getObject(obj, j10));
                    }
                } else if (m11226n(obj, i10)) {
                    m11208F(i10).mo11214b(f8903m.getObject(obj, j10));
                }
            }
            this.f8913j.mo11761b(obj);
            if (this.f8909f) {
                this.f8914k.mo11436a(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2522h6
    /* JADX INFO: renamed from: c */
    public final void mo11215c(Object obj, Object obj2) {
        m11198L(obj);
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f8904a;
            if (i10 >= iArr.length) {
                C2533i6.m11496u(this.f8913j, obj, obj2);
                if (this.f8909f) {
                    C2533i6.m11495t(this.f8914k, obj, obj2);
                    return;
                }
                return;
            }
            int iM11206C = m11206C(i10);
            int i11 = 1048575 & iM11206C;
            int iM11195B = m11195B(iM11206C);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (iM11195B) {
                case 0:
                    if (m11226n(obj2, i10)) {
                        C2446a7.m11255s(obj, j10, C2446a7.m11241e(obj2, j10));
                        m11221i(obj, i10);
                    }
                    break;
                case 1:
                    if (m11226n(obj2, i10)) {
                        C2446a7.m11256t(obj, j10, C2446a7.m11242f(obj2, j10));
                        m11221i(obj, i10);
                    }
                    break;
                case 2:
                    if (m11226n(obj2, i10)) {
                        C2446a7.m11258v(obj, j10, C2446a7.m11244h(obj2, j10));
                        m11221i(obj, i10);
                    }
                    break;
                case 3:
                    if (m11226n(obj2, i10)) {
                        C2446a7.m11258v(obj, j10, C2446a7.m11244h(obj2, j10));
                        m11221i(obj, i10);
                    }
                    break;
                case 4:
                    if (m11226n(obj2, i10)) {
                        C2446a7.m11257u(obj, j10, C2446a7.m11243g(obj2, j10));
                        m11221i(obj, i10);
                    }
                    break;
                case 5:
                    if (m11226n(obj2, i10)) {
                        C2446a7.m11258v(obj, j10, C2446a7.m11244h(obj2, j10));
                        m11221i(obj, i10);
                    }
                    break;
                case 6:
                    if (m11226n(obj2, i10)) {
                        C2446a7.m11257u(obj, j10, C2446a7.m11243g(obj2, j10));
                        m11221i(obj, i10);
                    }
                    break;
                case 7:
                    if (m11226n(obj2, i10)) {
                        C2446a7.m11253q(obj, j10, C2446a7.m11233A(obj2, j10));
                        m11221i(obj, i10);
                    }
                    break;
                case 8:
                    if (m11226n(obj2, i10)) {
                        C2446a7.m11259w(obj, j10, C2446a7.m11246j(obj2, j10));
                        m11221i(obj, i10);
                    }
                    break;
                case 9:
                    m11219g(obj, obj2, i10);
                    break;
                case 10:
                    if (m11226n(obj2, i10)) {
                        C2446a7.m11259w(obj, j10, C2446a7.m11246j(obj2, j10));
                        m11221i(obj, i10);
                    }
                    break;
                case 11:
                    if (m11226n(obj2, i10)) {
                        C2446a7.m11257u(obj, j10, C2446a7.m11243g(obj2, j10));
                        m11221i(obj, i10);
                    }
                    break;
                case 12:
                    if (m11226n(obj2, i10)) {
                        C2446a7.m11257u(obj, j10, C2446a7.m11243g(obj2, j10));
                        m11221i(obj, i10);
                    }
                    break;
                case 13:
                    if (m11226n(obj2, i10)) {
                        C2446a7.m11257u(obj, j10, C2446a7.m11243g(obj2, j10));
                        m11221i(obj, i10);
                    }
                    break;
                case 14:
                    if (m11226n(obj2, i10)) {
                        C2446a7.m11258v(obj, j10, C2446a7.m11244h(obj2, j10));
                        m11221i(obj, i10);
                    }
                    break;
                case 15:
                    if (m11226n(obj2, i10)) {
                        C2446a7.m11257u(obj, j10, C2446a7.m11243g(obj2, j10));
                        m11221i(obj, i10);
                    }
                    break;
                case 16:
                    if (m11226n(obj2, i10)) {
                        C2446a7.m11258v(obj, j10, C2446a7.m11244h(obj2, j10));
                        m11221i(obj, i10);
                    }
                    break;
                case 17:
                    m11219g(obj, obj2, i10);
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
                    InterfaceC2707y4 interfaceC2707y4Mo11340r = (InterfaceC2707y4) C2446a7.m11246j(obj, j10);
                    InterfaceC2707y4 interfaceC2707y4 = (InterfaceC2707y4) C2446a7.m11246j(obj2, j10);
                    int size = interfaceC2707y4Mo11340r.size();
                    int size2 = interfaceC2707y4.size();
                    if (size > 0 && size2 > 0) {
                        if (!interfaceC2707y4Mo11340r.zzc()) {
                            interfaceC2707y4Mo11340r = interfaceC2707y4Mo11340r.mo11340r(size2 + size);
                        }
                        interfaceC2707y4Mo11340r.addAll(interfaceC2707y4);
                    }
                    if (size > 0) {
                        interfaceC2707y4 = interfaceC2707y4Mo11340r;
                    }
                    C2446a7.m11259w(obj, j10, interfaceC2707y4);
                    break;
                case 50:
                    AbstractC2654t6 abstractC2654t6 = C2533i6.f9048a;
                    C2446a7.m11259w(obj, j10, C2642s5.m11722a(C2446a7.m11246j(obj, j10), C2446a7.m11246j(obj2, j10)));
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
                    if (m11229s(obj2, i12, i10)) {
                        C2446a7.m11259w(obj, j10, C2446a7.m11246j(obj2, j10));
                        m11222j(obj, i12, i10);
                    }
                    break;
                case 60:
                    m11220h(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m11229s(obj2, i12, i10)) {
                        C2446a7.m11259w(obj, j10, C2446a7.m11246j(obj2, j10));
                        m11222j(obj, i12, i10);
                    }
                    break;
                case 68:
                    m11220h(obj, obj2, i10);
                    break;
            }
            i10 += 3;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2522h6
    /* JADX INFO: renamed from: d */
    public final boolean mo11216d(Object obj, Object obj2) {
        boolean zM11480e;
        for (int i10 = 0; i10 < this.f8904a.length; i10 += 3) {
            int iM11206C = m11206C(i10);
            int iM11195B = m11195B(iM11206C);
            if (iM11195B <= 50 || iM11195B >= 69) {
                long j10 = iM11206C & 1048575;
                switch (iM11195B) {
                    case 0:
                        if (!m11225m(obj, obj2, i10) || Double.doubleToLongBits(C2446a7.m11241e(obj, j10)) != Double.doubleToLongBits(C2446a7.m11241e(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    case 1:
                        if (!m11225m(obj, obj2, i10) || Float.floatToIntBits(C2446a7.m11242f(obj, j10)) != Float.floatToIntBits(C2446a7.m11242f(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    case 2:
                        if (!m11225m(obj, obj2, i10) || C2446a7.m11244h(obj, j10) != C2446a7.m11244h(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 3:
                        if (!m11225m(obj, obj2, i10) || C2446a7.m11244h(obj, j10) != C2446a7.m11244h(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 4:
                        if (!m11225m(obj, obj2, i10) || C2446a7.m11243g(obj, j10) != C2446a7.m11243g(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 5:
                        if (!m11225m(obj, obj2, i10) || C2446a7.m11244h(obj, j10) != C2446a7.m11244h(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 6:
                        if (!m11225m(obj, obj2, i10) || C2446a7.m11243g(obj, j10) != C2446a7.m11243g(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 7:
                        if (!m11225m(obj, obj2, i10) || C2446a7.m11233A(obj, j10) != C2446a7.m11233A(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 8:
                        if (!m11225m(obj, obj2, i10) || !C2533i6.m11480e(C2446a7.m11246j(obj, j10), C2446a7.m11246j(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    case 9:
                        if (!m11225m(obj, obj2, i10) || !C2533i6.m11480e(C2446a7.m11246j(obj, j10), C2446a7.m11246j(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    case 10:
                        if (!m11225m(obj, obj2, i10) || !C2533i6.m11480e(C2446a7.m11246j(obj, j10), C2446a7.m11246j(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    case 11:
                        if (!m11225m(obj, obj2, i10) || C2446a7.m11243g(obj, j10) != C2446a7.m11243g(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 12:
                        if (!m11225m(obj, obj2, i10) || C2446a7.m11243g(obj, j10) != C2446a7.m11243g(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 13:
                        if (!m11225m(obj, obj2, i10) || C2446a7.m11243g(obj, j10) != C2446a7.m11243g(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 14:
                        if (!m11225m(obj, obj2, i10) || C2446a7.m11244h(obj, j10) != C2446a7.m11244h(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 15:
                        if (!m11225m(obj, obj2, i10) || C2446a7.m11243g(obj, j10) != C2446a7.m11243g(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 16:
                        if (!m11225m(obj, obj2, i10) || C2446a7.m11244h(obj, j10) != C2446a7.m11244h(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 17:
                        if (!m11225m(obj, obj2, i10) || !C2533i6.m11480e(C2446a7.m11246j(obj, j10), C2446a7.m11246j(obj2, j10))) {
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
                        zM11480e = C2533i6.m11480e(C2446a7.m11246j(obj, j10), C2446a7.m11246j(obj2, j10));
                        break;
                    case 50:
                        zM11480e = C2533i6.m11480e(C2446a7.m11246j(obj, j10), C2446a7.m11246j(obj2, j10));
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
                        if (!m11228r(obj, obj2, i10) || !C2533i6.m11480e(C2446a7.m11246j(obj, j10), C2446a7.m11246j(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    default:
                        continue;
                }
                if (!zM11480e) {
                    return false;
                }
            }
        }
        int i11 = this.f8912i;
        while (true) {
            int[] iArr = this.f8910g;
            if (i11 >= iArr.length) {
                if (!((AbstractC2652t4) obj).zzc.equals(((AbstractC2652t4) obj2).zzc)) {
                    return false;
                }
                if (this.f8909f) {
                    return ((AbstractC2619q4) obj).zzb.equals(((AbstractC2619q4) obj2).zzb);
                }
                return true;
            }
            int i12 = iArr[i11];
            if (!m11228r(obj, obj2, i12)) {
                return false;
            }
            if (!m11229s(obj, 0, i12)) {
                long jM11206C = m11206C(i12) & 1048575;
                if (!C2533i6.m11480e(C2446a7.m11246j(obj, jM11206C), C2446a7.m11246j(obj2, jM11206C))) {
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
    @Override // com.google.android.gms.internal.play_billing.InterfaceC2522h6
    /* JADX INFO: renamed from: e */
    public final void mo11217e(Object obj, InterfaceC2534i7 interfaceC2534i7) {
        Map.Entry entry;
        boolean z10;
        int i10;
        C2609p5 c2609p5;
        C2445a6<T> c2445a6 = this;
        C2609p5 c2609p6 = null;
        if (c2445a6.f8909f) {
            C2553k4 c2553k4 = ((AbstractC2619q4) obj).zzb;
            if (c2553k4.f9063a.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) c2553k4.m11526f().next();
            }
        } else {
            entry = null;
        }
        int[] iArr = c2445a6.f8904a;
        Unsafe unsafe = f8903m;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < iArr.length) {
            int iM11206C = c2445a6.m11206C(i13);
            int iM11195B = m11195B(iM11206C);
            int i15 = iArr[i13];
            if (iM11195B <= 17) {
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
                ?? r17 = c2609p6;
                throw r17;
            }
            long j10 = iM11206C & i11;
            switch (iM11195B) {
                case 0:
                    c2609p5 = c2609p6;
                    if (c2445a6.m11227o(obj, i13, i12, i14, i10)) {
                        interfaceC2534i7.mo11289a(i15, C2446a7.m11241e(obj, j10));
                    }
                    break;
                case 1:
                    c2609p5 = c2609p6;
                    if (c2445a6.m11227o(obj, i13, i12, i14, i10)) {
                        interfaceC2534i7.mo11282F(i15, C2446a7.m11242f(obj, j10));
                    }
                    break;
                case 2:
                    c2609p5 = c2609p6;
                    if (c2445a6.m11227o(obj, i13, i12, i14, i10)) {
                        interfaceC2534i7.mo11299k(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 3:
                    c2609p5 = c2609p6;
                    if (c2445a6.m11227o(obj, i13, i12, i14, i10)) {
                        interfaceC2534i7.mo11279C(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 4:
                    c2609p5 = c2609p6;
                    if (c2445a6.m11227o(obj, i13, i12, i14, i10)) {
                        interfaceC2534i7.mo11303o(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 5:
                    c2609p5 = c2609p6;
                    if (c2445a6.m11227o(obj, i13, i12, i14, i10)) {
                        interfaceC2534i7.mo11288L(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 6:
                    c2609p5 = c2609p6;
                    if (c2445a6.m11227o(obj, i13, i12, i14, i10)) {
                        interfaceC2534i7.mo11292d(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 7:
                    c2609p5 = c2609p6;
                    if (c2445a6.m11227o(obj, i13, i12, i14, i10)) {
                        interfaceC2534i7.mo11297i(i15, C2446a7.m11233A(obj, j10));
                    }
                    break;
                case 8:
                    c2609p5 = c2609p6;
                    if (c2445a6.m11227o(obj, i13, i12, i14, i10)) {
                        m11201u(i15, unsafe.getObject(obj, j10), interfaceC2534i7);
                    }
                    break;
                case 9:
                    c2609p5 = c2609p6;
                    if (c2445a6.m11227o(obj, i13, i12, i14, i10)) {
                        interfaceC2534i7.mo11284H(i15, unsafe.getObject(obj, j10), c2445a6.m11208F(i13));
                    }
                    break;
                case 10:
                    c2609p5 = c2609p6;
                    if (c2445a6.m11227o(obj, i13, i12, i14, i10)) {
                        interfaceC2534i7.mo11281E(i15, (AbstractC2640s3) unsafe.getObject(obj, j10));
                    }
                    break;
                case 11:
                    c2609p5 = c2609p6;
                    if (c2445a6.m11227o(obj, i13, i12, i14, i10)) {
                        interfaceC2534i7.mo11287K(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 12:
                    c2609p5 = c2609p6;
                    if (c2445a6.m11227o(obj, i13, i12, i14, i10)) {
                        interfaceC2534i7.mo11293e(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 13:
                    c2609p5 = c2609p6;
                    if (c2445a6.m11227o(obj, i13, i12, i14, i10)) {
                        interfaceC2534i7.mo11314z(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 14:
                    c2609p5 = c2609p6;
                    if (c2445a6.m11227o(obj, i13, i12, i14, i10)) {
                        interfaceC2534i7.mo11298j(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 15:
                    c2609p5 = c2609p6;
                    if (c2445a6.m11227o(obj, i13, i12, i14, i10)) {
                        interfaceC2534i7.mo11312x(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 16:
                    c2609p5 = c2609p6;
                    if (c2445a6.m11227o(obj, i13, i12, i14, i10)) {
                        interfaceC2534i7.mo11306r(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 17:
                    c2609p5 = c2609p6;
                    if (c2445a6.m11227o(obj, i13, i12, i14, i10)) {
                        interfaceC2534i7.mo11307s(i15, unsafe.getObject(obj, j10), c2445a6.m11208F(i13));
                    }
                    break;
                case 18:
                    c2609p5 = c2609p6;
                    C2533i6.m11498w(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2534i7, false);
                    break;
                case 19:
                    c2609p5 = c2609p6;
                    C2533i6.m11471A(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2534i7, false);
                    break;
                case 20:
                    c2609p5 = c2609p6;
                    C2533i6.m11473C(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2534i7, false);
                    break;
                case 21:
                    c2609p5 = c2609p6;
                    C2533i6.m11479d(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2534i7, false);
                    break;
                case 22:
                    c2609p5 = c2609p6;
                    C2533i6.m11472B(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2534i7, false);
                    break;
                case 23:
                    c2609p5 = c2609p6;
                    C2533i6.m11501z(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2534i7, false);
                    break;
                case 24:
                    c2609p5 = c2609p6;
                    C2533i6.m11500y(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2534i7, false);
                    break;
                case 25:
                    c2609p5 = c2609p6;
                    C2533i6.m11497v(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2534i7, false);
                    break;
                case 26:
                    c2609p5 = c2609p6;
                    int i18 = iArr[i13];
                    List list = (List) unsafe.getObject(obj, j10);
                    AbstractC2654t6 abstractC2654t6 = C2533i6.f9048a;
                    if (list != null && !list.isEmpty()) {
                        interfaceC2534i7.mo11285I(i18, list);
                    }
                    break;
                case 27:
                    c2609p5 = c2609p6;
                    int i19 = iArr[i13];
                    List list2 = (List) unsafe.getObject(obj, j10);
                    InterfaceC2522h6 interfaceC2522h6M11208F = c2445a6.m11208F(i13);
                    AbstractC2654t6 abstractC2654t7 = C2533i6.f9048a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i20 = 0; i20 < list2.size(); i20++) {
                            ((C2454b4) interfaceC2534i7).mo11284H(i19, list2.get(i20), interfaceC2522h6M11208F);
                        }
                    }
                    break;
                case 28:
                    c2609p5 = c2609p6;
                    int i21 = iArr[i13];
                    List list3 = (List) unsafe.getObject(obj, j10);
                    AbstractC2654t6 abstractC2654t8 = C2533i6.f9048a;
                    if (list3 != null && !list3.isEmpty()) {
                        interfaceC2534i7.mo11296h(i21, list3);
                    }
                    break;
                case 29:
                    c2609p5 = c2609p6;
                    C2533i6.m11478c(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2534i7, false);
                    break;
                case 30:
                    c2609p5 = c2609p6;
                    C2533i6.m11499x(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2534i7, false);
                    break;
                case 31:
                    c2609p5 = c2609p6;
                    C2533i6.m11474D(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2534i7, false);
                    break;
                case 32:
                    c2609p5 = c2609p6;
                    C2533i6.m11475E(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2534i7, false);
                    break;
                case 33:
                    c2609p5 = c2609p6;
                    C2533i6.m11476a(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2534i7, false);
                    break;
                case 34:
                    c2609p5 = c2609p6;
                    C2533i6.m11477b(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2534i7, false);
                    break;
                case 35:
                    c2609p5 = c2609p6;
                    C2533i6.m11498w(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2534i7, z10);
                    break;
                case 36:
                    c2609p5 = c2609p6;
                    C2533i6.m11471A(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2534i7, z10);
                    break;
                case 37:
                    c2609p5 = c2609p6;
                    C2533i6.m11473C(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2534i7, z10);
                    break;
                case 38:
                    c2609p5 = c2609p6;
                    C2533i6.m11479d(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2534i7, z10);
                    break;
                case 39:
                    c2609p5 = c2609p6;
                    C2533i6.m11472B(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2534i7, z10);
                    break;
                case 40:
                    c2609p5 = c2609p6;
                    C2533i6.m11501z(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2534i7, z10);
                    break;
                case 41:
                    c2609p5 = c2609p6;
                    C2533i6.m11500y(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2534i7, z10);
                    break;
                case 42:
                    c2609p5 = c2609p6;
                    C2533i6.m11497v(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2534i7, z10);
                    break;
                case 43:
                    c2609p5 = c2609p6;
                    C2533i6.m11478c(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2534i7, z10);
                    break;
                case 44:
                    c2609p5 = c2609p6;
                    C2533i6.m11499x(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2534i7, z10);
                    break;
                case 45:
                    c2609p5 = c2609p6;
                    C2533i6.m11474D(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2534i7, z10);
                    break;
                case 46:
                    c2609p5 = c2609p6;
                    C2533i6.m11475E(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2534i7, z10);
                    break;
                case 47:
                    c2609p5 = c2609p6;
                    C2533i6.m11476a(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2534i7, z10);
                    break;
                case 48:
                    c2609p5 = c2609p6;
                    C2533i6.m11477b(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2534i7, z10);
                    break;
                case 49:
                    int i22 = iArr[i13];
                    List list4 = (List) unsafe.getObject(obj, j10);
                    InterfaceC2522h6 interfaceC2522h6M11208F2 = c2445a6.m11208F(i13);
                    AbstractC2654t6 abstractC2654t9 = C2533i6.f9048a;
                    if (list4 != null && !list4.isEmpty()) {
                        int i23 = 0;
                        while (i23 < list4.size()) {
                            ((C2454b4) interfaceC2534i7).mo11307s(i22, list4.get(i23), interfaceC2522h6M11208F2);
                            i23++;
                            c2609p6 = c2609p6;
                        }
                    }
                    c2609p5 = c2609p6;
                    break;
                case 50:
                    Object object = unsafe.getObject(obj, j10);
                    if (object != null) {
                        ((C2620q5) c2445a6.m11210H(i13)).m11687c();
                        interfaceC2534i7.mo11309u(i15, c2609p6, (C2631r5) object);
                    }
                    c2609p5 = c2609p6;
                    break;
                case 51:
                    if (c2445a6.m11229s(obj, i15, i13)) {
                        interfaceC2534i7.mo11289a(i15, ((Double) C2446a7.m11246j(obj, j10)).doubleValue());
                    }
                    c2609p5 = c2609p6;
                    break;
                case 52:
                    if (c2445a6.m11229s(obj, i15, i13)) {
                        interfaceC2534i7.mo11282F(i15, ((Float) C2446a7.m11246j(obj, j10)).floatValue());
                    }
                    c2609p5 = c2609p6;
                    break;
                case 53:
                    if (c2445a6.m11229s(obj, i15, i13)) {
                        interfaceC2534i7.mo11299k(i15, m11196D(obj, j10));
                    }
                    c2609p5 = c2609p6;
                    break;
                case 54:
                    if (c2445a6.m11229s(obj, i15, i13)) {
                        interfaceC2534i7.mo11279C(i15, m11196D(obj, j10));
                    }
                    c2609p5 = c2609p6;
                    break;
                case 55:
                    if (c2445a6.m11229s(obj, i15, i13)) {
                        interfaceC2534i7.mo11303o(i15, m11204y(obj, j10));
                    }
                    c2609p5 = c2609p6;
                    break;
                case 56:
                    if (c2445a6.m11229s(obj, i15, i13)) {
                        interfaceC2534i7.mo11288L(i15, m11196D(obj, j10));
                    }
                    c2609p5 = c2609p6;
                    break;
                case 57:
                    if (c2445a6.m11229s(obj, i15, i13)) {
                        interfaceC2534i7.mo11292d(i15, m11204y(obj, j10));
                    }
                    c2609p5 = c2609p6;
                    break;
                case 58:
                    if (c2445a6.m11229s(obj, i15, i13)) {
                        interfaceC2534i7.mo11297i(i15, ((Boolean) C2446a7.m11246j(obj, j10)).booleanValue());
                    }
                    c2609p5 = c2609p6;
                    break;
                case 59:
                    if (c2445a6.m11229s(obj, i15, i13)) {
                        m11201u(i15, unsafe.getObject(obj, j10), interfaceC2534i7);
                    }
                    c2609p5 = c2609p6;
                    break;
                case 60:
                    if (c2445a6.m11229s(obj, i15, i13)) {
                        interfaceC2534i7.mo11284H(i15, unsafe.getObject(obj, j10), c2445a6.m11208F(i13));
                    }
                    c2609p5 = c2609p6;
                    break;
                case 61:
                    if (c2445a6.m11229s(obj, i15, i13)) {
                        interfaceC2534i7.mo11281E(i15, (AbstractC2640s3) unsafe.getObject(obj, j10));
                    }
                    c2609p5 = c2609p6;
                    break;
                case 62:
                    if (c2445a6.m11229s(obj, i15, i13)) {
                        interfaceC2534i7.mo11287K(i15, m11204y(obj, j10));
                    }
                    c2609p5 = c2609p6;
                    break;
                case 63:
                    if (c2445a6.m11229s(obj, i15, i13)) {
                        interfaceC2534i7.mo11293e(i15, m11204y(obj, j10));
                    }
                    c2609p5 = c2609p6;
                    break;
                case 64:
                    if (c2445a6.m11229s(obj, i15, i13)) {
                        interfaceC2534i7.mo11314z(i15, m11204y(obj, j10));
                    }
                    c2609p5 = c2609p6;
                    break;
                case 65:
                    if (c2445a6.m11229s(obj, i15, i13)) {
                        interfaceC2534i7.mo11298j(i15, m11196D(obj, j10));
                    }
                    c2609p5 = c2609p6;
                    break;
                case 66:
                    if (c2445a6.m11229s(obj, i15, i13)) {
                        interfaceC2534i7.mo11312x(i15, m11204y(obj, j10));
                    }
                    c2609p5 = c2609p6;
                    break;
                case 67:
                    if (c2445a6.m11229s(obj, i15, i13)) {
                        interfaceC2534i7.mo11306r(i15, m11196D(obj, j10));
                    }
                    c2609p5 = c2609p6;
                    break;
                case 68:
                    if (c2445a6.m11229s(obj, i15, i13)) {
                        interfaceC2534i7.mo11307s(i15, unsafe.getObject(obj, j10), c2445a6.m11208F(i13));
                    }
                    c2609p5 = c2609p6;
                    break;
                default:
                    c2609p5 = c2609p6;
                    break;
            }
            i13 += 3;
            c2445a6 = this;
            c2609p6 = c2609p5;
            i11 = 1048575;
        }
        ?? r18 = c2609p6;
        if (entry != null) {
            throw r18;
        }
        ((AbstractC2652t4) obj).zzc.m11787l(interfaceC2534i7);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2522h6
    /* JADX INFO: renamed from: f */
    public final void mo11218f(Object obj, byte[] bArr, int i10, int i11, C2497f3 c2497f3) {
        m11231v(obj, bArr, i10, i11, 0, c2497f3);
    }

    /* JADX INFO: renamed from: g */
    public final void m11219g(Object obj, Object obj2, int i10) {
        if (m11226n(obj2, i10)) {
            int iM11206C = m11206C(i10) & 1048575;
            Unsafe unsafe = f8903m;
            long j10 = iM11206C;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f8904a[i10] + " is present but null: " + obj2.toString());
            }
            InterfaceC2522h6 interfaceC2522h6M11208F = m11208F(i10);
            if (!m11226n(obj, i10)) {
                if (m11200q(object)) {
                    Object objZze = interfaceC2522h6M11208F.zze();
                    interfaceC2522h6M11208F.mo11215c(objZze, object);
                    unsafe.putObject(obj, j10, objZze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                m11221i(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!m11200q(object2)) {
                Object objZze2 = interfaceC2522h6M11208F.zze();
                interfaceC2522h6M11208F.mo11215c(objZze2, object2);
                unsafe.putObject(obj, j10, objZze2);
                object2 = objZze2;
            }
            interfaceC2522h6M11208F.mo11215c(object2, object);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m11220h(Object obj, Object obj2, int i10) {
        int[] iArr = this.f8904a;
        int i11 = iArr[i10];
        if (m11229s(obj2, i11, i10)) {
            int iM11206C = m11206C(i10) & 1048575;
            Unsafe unsafe = f8903m;
            long j10 = iM11206C;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2.toString());
            }
            InterfaceC2522h6 interfaceC2522h6M11208F = m11208F(i10);
            if (!m11229s(obj, i11, i10)) {
                if (m11200q(object)) {
                    Object objZze = interfaceC2522h6M11208F.zze();
                    interfaceC2522h6M11208F.mo11215c(objZze, object);
                    unsafe.putObject(obj, j10, objZze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                m11222j(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!m11200q(object2)) {
                Object objZze2 = interfaceC2522h6M11208F.zze();
                interfaceC2522h6M11208F.mo11215c(objZze2, object2);
                unsafe.putObject(obj, j10, objZze2);
                object2 = objZze2;
            }
            interfaceC2522h6M11208F.mo11215c(object2, object);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m11221i(Object obj, int i10) {
        int iM11232z = m11232z(i10);
        long j10 = 1048575 & iM11232z;
        if (j10 == 1048575) {
            return;
        }
        C2446a7.m11257u(obj, j10, (1 << (iM11232z >>> 20)) | C2446a7.m11243g(obj, j10));
    }

    /* JADX INFO: renamed from: j */
    public final void m11222j(Object obj, int i10, int i11) {
        C2446a7.m11257u(obj, m11232z(i11) & 1048575, i10);
    }

    /* JADX INFO: renamed from: k */
    public final void m11223k(Object obj, int i10, Object obj2) {
        f8903m.putObject(obj, m11206C(i10) & 1048575, obj2);
        m11221i(obj, i10);
    }

    /* JADX INFO: renamed from: l */
    public final void m11224l(Object obj, int i10, int i11, Object obj2) {
        f8903m.putObject(obj, m11206C(i11) & 1048575, obj2);
        m11222j(obj, i10, i11);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m11225m(Object obj, Object obj2, int i10) {
        return m11226n(obj, i10) == m11226n(obj2, i10);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m11226n(Object obj, int i10) {
        int iM11232z = m11232z(i10);
        long j10 = iM11232z & 1048575;
        if (j10 != 1048575) {
            return (C2446a7.m11243g(obj, j10) & (1 << (iM11232z >>> 20))) != 0;
        }
        int iM11206C = m11206C(i10);
        long j11 = iM11206C & 1048575;
        switch (m11195B(iM11206C)) {
            case 0:
                return Double.doubleToRawLongBits(C2446a7.m11241e(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(C2446a7.m11242f(obj, j11)) != 0;
            case 2:
                return C2446a7.m11244h(obj, j11) != 0;
            case 3:
                return C2446a7.m11244h(obj, j11) != 0;
            case 4:
                return C2446a7.m11243g(obj, j11) != 0;
            case 5:
                return C2446a7.m11244h(obj, j11) != 0;
            case 6:
                return C2446a7.m11243g(obj, j11) != 0;
            case 7:
                return C2446a7.m11233A(obj, j11);
            case 8:
                Object objM11246j = C2446a7.m11246j(obj, j11);
                if (objM11246j instanceof String) {
                    return !((String) objM11246j).isEmpty();
                }
                if (objM11246j instanceof AbstractC2640s3) {
                    return !AbstractC2640s3.f9227b.equals(objM11246j);
                }
                return m11230t();
            case 9:
                return C2446a7.m11246j(obj, j11) != null;
            case 10:
                return !AbstractC2640s3.f9227b.equals(C2446a7.m11246j(obj, j11));
            case 11:
                return C2446a7.m11243g(obj, j11) != 0;
            case 12:
                return C2446a7.m11243g(obj, j11) != 0;
            case 13:
                return C2446a7.m11243g(obj, j11) != 0;
            case 14:
                return C2446a7.m11244h(obj, j11) != 0;
            case 15:
                return C2446a7.m11243g(obj, j11) != 0;
            case 16:
                return C2446a7.m11244h(obj, j11) != 0;
            case 17:
                return C2446a7.m11246j(obj, j11) != null;
            default:
                return m11230t();
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m11227o(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return m11226n(obj, i10);
        }
        return (i12 & i13) != 0;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m11228r(Object obj, Object obj2, int i10) {
        long jM11232z = m11232z(i10) & 1048575;
        return C2446a7.m11243g(obj, jM11232z) == C2446a7.m11243g(obj2, jM11232z);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m11229s(Object obj, int i10, int i11) {
        return C2446a7.m11243g(obj, (long) (m11232z(i11) & 1048575)) == i10;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m11230t() {
        throw new IllegalArgumentException();
    }

    /* JADX DEBUG: Duplicate block (B:238:0x06af) to fix multi-entry loop: BACK_EDGE: B:238:0x06af -> B:239:0x06b0 */
    /* JADX DEBUG: Duplicate block (B:271:0x0760) to fix multi-entry loop: BACK_EDGE: B:271:0x0760 -> B:272:0x0761 */
    /* JADX DEBUG: Duplicate block (B:293:0x07c1) to fix multi-entry loop: BACK_EDGE: B:293:0x07c1 -> B:294:0x07c3 */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 38661. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: v */
    public final int m11231v(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.gms.internal.play_billing.C2497f3 r39) {
        /*
            r33 = this;
            r0 = r33
            r2 = r34
            r3 = r35
            r4 = r37
            r6 = r39
            m11198L(r2)
            sun.misc.Unsafe r1 = com.google.android.gms.internal.play_billing.C2445a6.f8903m
            r11 = 0
            r12 = -1
            r5 = r36
            r8 = r11
            r14 = r8
            r15 = r14
            r7 = r12
            r9 = 1048575(0xfffff, float:1.469367E-39)
        L1a:
            r16 = 0
            if (r5 >= r4) goto Le37
            int r15 = r5 + 1
            r5 = r3[r5]
            if (r5 >= 0) goto L2a
            int r15 = com.google.android.gms.internal.play_billing.C2508g3.m11429j(r5, r3, r15, r6)
            int r5 = r6.f8963a
        L2a:
            r6 = r15
            r15 = r5
            int r5 = r15 >>> 3
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r13 = 3
            if (r5 <= r7) goto L42
            int r8 = r8 / r13
            int r7 = r0.f8906c
            if (r5 < r7) goto L4f
            int r7 = r0.f8907d
            if (r5 > r7) goto L4f
            int r7 = r0.m11205A(r5, r8)
            goto L50
        L42:
            int r7 = r0.f8906c
            if (r5 < r7) goto L4f
            int r7 = r0.f8907d
            if (r5 > r7) goto L4f
            int r7 = r0.m11205A(r5, r11)
            goto L50
        L4f:
            r7 = r12
        L50:
            if (r7 != r12) goto L61
            r12 = r38
            r7 = r39
            r13 = r2
            r20 = r9
            r8 = r11
            r10 = r15
            r11 = r0
            r9 = r1
            r0 = r5
            r5 = r6
            goto Lddc
        L61:
            r8 = r15 & 7
            int[] r11 = r0.f8904a
            int r18 = r7 + 1
            r12 = r11[r18]
            int r13 = m11195B(r12)
            r3 = r12 & r17
            long r3 = (long) r3
            r19 = r3
            r18 = 536870912(0x20000000, float:1.0842022E-19)
            r21 = 0
            java.lang.String r4 = ""
            java.lang.String r3 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            r24 = r5
            r25 = 1
            r5 = 17
            if (r13 > r5) goto L3b1
            int r5 = r7 + 2
            r5 = r11[r5]
            int r11 = r5 >>> 20
            int r11 = r25 << r11
            r5 = r5 & r17
            r23 = r6
            if (r5 == r9) goto La8
            r6 = r17
            r26 = r7
            if (r9 == r6) goto L9d
            long r6 = (long) r9
            r1.putInt(r2, r6, r14)
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L9d:
            if (r5 != r6) goto La1
            r6 = 0
            goto La6
        La1:
            long r6 = (long) r5
            int r6 = r1.getInt(r2, r6)
        La6:
            r14 = r5
            goto Lac
        La8:
            r26 = r7
            r6 = r14
            r14 = r9
        Lac:
            switch(r13) {
                case 0: goto L37c;
                case 1: goto L354;
                case 2: goto L328;
                case 3: goto L328;
                case 4: goto L302;
                case 5: goto L2cc;
                case 6: goto L29f;
                case 7: goto L27b;
                case 8: goto L223;
                case 9: goto L1db;
                case 10: goto L1ba;
                case 11: goto L302;
                case 12: goto L161;
                case 13: goto L29f;
                case 14: goto L2cc;
                case 15: goto L12b;
                case 16: goto Lec;
                default: goto Laf;
            }
        Laf:
            r5 = 3
            if (r8 != r5) goto Le0
            r11 = r11 | r6
            r12 = r26
            java.lang.Object r3 = r0.m11211I(r2, r12)
            int r4 = r24 << 3
            r8 = r4 | 4
            com.google.android.gms.internal.play_billing.h6 r4 = r0.m11208F(r12)
            r5 = r35
            r7 = r37
            r9 = r39
            r13 = r12
            r6 = r23
            int r4 = com.google.android.gms.internal.play_billing.C2508g3.m11432m(r3, r4, r5, r6, r7, r8, r9)
            r7 = r5
            r0.m11223k(r2, r13, r3)
            r5 = r4
            r3 = r7
            r6 = r9
            r8 = r13
            r9 = r14
            r7 = r24
            r12 = -1
            r4 = r37
            r14 = r11
        Ldd:
            r11 = 0
            goto L1a
        Le0:
            r7 = r35
            r11 = r39
            r5 = r1
            r1 = r2
            r36 = r6
            r2 = r23
            goto L39e
        Lec:
            r7 = r35
            r9 = r39
            r4 = r23
            r13 = r26
            if (r8 != 0) goto L11d
            r8 = r6 | r11
            int r11 = com.google.android.gms.internal.play_billing.C2508g3.m11431l(r7, r4, r9)
            long r3 = r9.f8964b
            long r5 = com.google.android.gms.internal.play_billing.C2684w3.m11814b(r3)
            r3 = r19
            r1.putLong(r2, r3, r5)
            r30 = r2
            r2 = r1
            r1 = r30
            r3 = r2
            r2 = r1
            r1 = r3
            r4 = r37
            r3 = r7
            r6 = r9
            r5 = r11
        L114:
            r9 = r14
            r7 = r24
            r11 = 0
            r12 = -1
            r14 = r8
            r8 = r13
            goto L1a
        L11d:
            r30 = r2
            r2 = r1
            r1 = r30
            r5 = r2
            r2 = r4
            r36 = r6
        L126:
            r11 = r9
        L127:
            r26 = r13
            goto L39e
        L12b:
            r36 = r2
            r2 = r1
            r1 = r36
            r7 = r35
            r9 = r39
            r36 = r6
            r5 = r19
            r4 = r23
            r13 = r26
            if (r8 != 0) goto L15e
            r3 = r36 | r11
            int r4 = com.google.android.gms.internal.play_billing.C2508g3.m11428i(r7, r4, r9)
            int r8 = r9.f8963a
            int r8 = com.google.android.gms.internal.play_billing.C2684w3.m11813a(r8)
            r2.putInt(r1, r5, r8)
        L14d:
            r5 = r2
            r2 = r1
            r1 = r5
            r5 = r4
            r6 = r9
            r8 = r13
            r9 = r14
            r11 = 0
            r12 = -1
            r4 = r37
            r14 = r3
            r3 = r7
            r7 = r24
            goto L1a
        L15e:
            r5 = r2
            r2 = r4
            goto L126
        L161:
            r36 = r2
            r2 = r1
            r1 = r36
            r7 = r35
            r9 = r39
            r36 = r6
            r5 = r19
            r4 = r23
            r13 = r26
            if (r8 != 0) goto L15e
            int r3 = com.google.android.gms.internal.play_billing.C2508g3.m11428i(r7, r4, r9)
            int r4 = r9.f8963a
            com.google.android.gms.internal.play_billing.w4 r8 = r0.m11207E(r13)
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = r12 & r16
            if (r12 == 0) goto L1ab
            if (r8 == 0) goto L1ab
            boolean r8 = r8.mo11321a(r4)
            if (r8 == 0) goto L18d
            goto L1ab
        L18d:
            com.google.android.gms.internal.play_billing.u6 r5 = m11202w(r1)
            long r11 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r11)
            r5.m11785j(r15, r4)
            r4 = r2
            r2 = r1
            r1 = r4
            r4 = r37
            r5 = r3
            r3 = r7
            r6 = r9
            r8 = r13
            r9 = r14
            r7 = r24
            r11 = 0
            r12 = -1
            r14 = r36
            goto L1a
        L1ab:
            r8 = r36 | r11
            r2.putInt(r1, r5, r4)
            r4 = r2
            r2 = r1
            r1 = r4
            r4 = r37
            r5 = r3
            r3 = r7
            r6 = r9
            goto L114
        L1ba:
            r36 = r2
            r2 = r1
            r1 = r36
            r7 = r35
            r9 = r39
            r36 = r6
            r5 = r19
            r4 = r23
            r13 = r26
            r3 = 2
            if (r8 != r3) goto L15e
            r3 = r36 | r11
            int r4 = com.google.android.gms.internal.play_billing.C2508g3.m11420a(r7, r4, r9)
            java.lang.Object r8 = r9.f8965c
            r2.putObject(r1, r5, r8)
            goto L14d
        L1db:
            r36 = r2
            r2 = r1
            r1 = r36
            r7 = r35
            r9 = r39
            r36 = r6
            r4 = r23
            r13 = r26
            r3 = 2
            if (r8 != r3) goto L216
            r8 = r36 | r11
            r3 = r1
            java.lang.Object r1 = r0.m11211I(r3, r13)
            r5 = r2
            com.google.android.gms.internal.play_billing.h6 r2 = r0.m11208F(r13)
            r6 = r7
            r7 = r3
            r3 = r6
            r6 = r9
            r9 = r5
            r5 = r37
            int r2 = com.google.android.gms.internal.play_billing.C2508g3.m11433n(r1, r2, r3, r4, r5, r6)
            r30 = r3
            r3 = r1
            r1 = r30
            r0.m11223k(r7, r13, r3)
            r4 = r37
            r6 = r39
            r3 = r1
            r5 = r2
            r2 = r7
            r1 = r9
            goto L114
        L216:
            r9 = r7
            r7 = r1
            r1 = r9
            r9 = r2
            r2 = r4
            r5 = r7
            r7 = r1
            r1 = r5
            r11 = r39
            r5 = r9
            goto L127
        L223:
            r9 = r1
            r7 = r2
            r36 = r6
            r5 = r19
            r2 = r23
            r13 = 2
            r1 = r35
            r19 = r11
            r11 = r39
            if (r8 != r13) goto L275
            r8 = r12 & r18
            if (r8 == 0) goto L23f
            r3 = r36 | r19
            int r2 = com.google.android.gms.internal.play_billing.C2508g3.m11426g(r1, r2, r11)
            goto L258
        L23f:
            int r2 = com.google.android.gms.internal.play_billing.C2508g3.m11428i(r1, r2, r11)
            int r8 = r11.f8963a
            if (r8 < 0) goto L26f
            r3 = r36 | r19
            if (r8 != 0) goto L24e
            r11.f8965c = r4
            goto L258
        L24e:
            java.lang.String r4 = new java.lang.String
            java.nio.charset.Charset r12 = java.nio.charset.StandardCharsets.UTF_8
            r4.<init>(r1, r2, r8, r12)
            r11.f8965c = r4
            int r2 = r2 + r8
        L258:
            java.lang.Object r4 = r11.f8965c
            r9.putObject(r7, r5, r4)
        L25d:
            r4 = r3
            r3 = r1
            r1 = r9
            r9 = r14
            r14 = r4
            r4 = r37
            r5 = r2
            r2 = r7
        L266:
            r6 = r11
        L267:
            r7 = r24
            r8 = r26
            r11 = 0
        L26c:
            r12 = -1
            goto L1a
        L26f:
            com.google.android.gms.internal.play_billing.f5 r1 = new com.google.android.gms.internal.play_billing.f5
            r1.<init>(r3)
            throw r1
        L275:
            r5 = r7
            r7 = r1
            r1 = r5
        L278:
            r5 = r9
            goto L39e
        L27b:
            r9 = r1
            r7 = r2
            r36 = r6
            r5 = r19
            r2 = r23
            r1 = r35
            r19 = r11
            r11 = r39
            if (r8 != 0) goto L275
            r3 = r36 | r19
            int r2 = com.google.android.gms.internal.play_billing.C2508g3.m11431l(r1, r2, r11)
            long r12 = r11.f8964b
            int r4 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r4 == 0) goto L29a
            r4 = r25
            goto L29b
        L29a:
            r4 = 0
        L29b:
            com.google.android.gms.internal.play_billing.C2446a7.m11253q(r7, r5, r4)
            goto L25d
        L29f:
            r9 = r1
            r7 = r2
            r36 = r6
            r5 = r19
            r2 = r23
            r3 = 5
            r1 = r35
            r19 = r11
            r11 = r39
            if (r8 != r3) goto L275
            int r3 = r2 + 4
            r4 = r36 | r19
            int r2 = com.google.android.gms.internal.play_billing.C2508g3.m11421b(r1, r2)
            r9.putInt(r7, r5, r2)
            r5 = r3
            r2 = r7
            r6 = r11
            r7 = r24
            r8 = r26
            r11 = 0
            r12 = -1
            r3 = r1
            r1 = r9
            r9 = r14
            r14 = r4
            r4 = r37
            goto L1a
        L2cc:
            r9 = r1
            r7 = r2
            r36 = r6
            r5 = r19
            r2 = r23
            r3 = r25
            r1 = r35
            r19 = r11
            r11 = r39
            if (r8 != r3) goto L2fb
            int r8 = r2 + 8
            r12 = r36 | r19
            r3 = r5
            long r5 = com.google.android.gms.internal.play_billing.C2508g3.m11434o(r1, r2)
            r2 = r7
            r7 = r1
            r1 = r9
            r1.putLong(r2, r3, r5)
            r4 = r37
            r3 = r7
            r5 = r8
            r6 = r11
            r9 = r14
            r7 = r24
            r8 = r26
            r11 = 0
            r14 = r12
            goto L26c
        L2fb:
            r30 = r7
            r7 = r1
            r1 = r30
            goto L278
        L302:
            r7 = r35
            r9 = r1
            r1 = r2
            r36 = r6
            r3 = r19
            r2 = r23
            r19 = r11
            r11 = r39
            if (r8 != 0) goto L278
            r5 = r36 | r19
            int r2 = com.google.android.gms.internal.play_billing.C2508g3.m11428i(r7, r2, r11)
            int r6 = r11.f8963a
            r9.putInt(r1, r3, r6)
            r3 = r2
            r2 = r1
            r1 = r9
            r9 = r14
            r14 = r5
            r5 = r3
            r4 = r37
            r3 = r7
            goto L266
        L328:
            r7 = r35
            r9 = r1
            r1 = r2
            r36 = r6
            r3 = r19
            r2 = r23
            r19 = r11
            r11 = r39
            if (r8 != 0) goto L278
            r8 = r36 | r19
            int r12 = com.google.android.gms.internal.play_billing.C2508g3.m11431l(r7, r2, r11)
            long r5 = r11.f8964b
            r2 = r1
            r1 = r9
            r1.putLong(r2, r3, r5)
            r4 = r37
            r3 = r7
            r6 = r11
            r5 = r12
        L34a:
            r9 = r14
            r7 = r24
            r11 = 0
            r12 = -1
            r14 = r8
            r8 = r26
            goto L1a
        L354:
            r7 = r35
            r5 = r1
            r1 = r2
            r36 = r6
            r3 = r19
            r2 = r23
            r6 = 5
            r19 = r11
            r11 = r39
            if (r8 != r6) goto L39e
            int r6 = r2 + 4
            r8 = r36 | r19
            int r2 = com.google.android.gms.internal.play_billing.C2508g3.m11421b(r7, r2)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            com.google.android.gms.internal.play_billing.C2446a7.m11256t(r1, r3, r2)
        L374:
            r4 = r37
            r2 = r1
            r1 = r5
            r5 = r6
            r3 = r7
            r6 = r11
            goto L34a
        L37c:
            r7 = r35
            r5 = r1
            r1 = r2
            r36 = r6
            r3 = r19
            r2 = r23
            r6 = r25
            r19 = r11
            r11 = r39
            if (r8 != r6) goto L39e
            int r6 = r2 + 8
            r8 = r36 | r19
            long r12 = com.google.android.gms.internal.play_billing.C2508g3.m11434o(r7, r2)
            double r12 = java.lang.Double.longBitsToDouble(r12)
            com.google.android.gms.internal.play_billing.C2446a7.m11255s(r1, r3, r12)
            goto L374
        L39e:
            r12 = r38
            r13 = r1
            r9 = r5
            r3 = r7
            r7 = r11
            r20 = r14
            r10 = r15
            r8 = r26
            r14 = r36
            r11 = r0
            r5 = r2
            r0 = r24
            goto Lddc
        L3b1:
            r5 = r1
            r1 = r2
            r26 = r6
            r6 = r7
            r23 = r14
            r7 = r35
            r30 = r11
            r11 = r39
            r31 = r19
            r19 = r30
            r20 = r15
            r14 = r31
            r2 = 27
            if (r13 != r2) goto L421
            r2 = 2
            if (r8 != r2) goto L40f
            java.lang.Object r2 = r5.getObject(r1, r14)
            com.google.android.gms.internal.play_billing.y4 r2 = (com.google.android.gms.internal.play_billing.InterfaceC2707y4) r2
            boolean r3 = r2.zzc()
            if (r3 != 0) goto L3ea
            int r3 = r2.size()
            if (r3 != 0) goto L3e2
            r3 = 10
            goto L3e3
        L3e2:
            int r3 = r3 + r3
        L3e3:
            com.google.android.gms.internal.play_billing.y4 r2 = r2.mo11340r(r3)
            r5.putObject(r1, r14, r2)
        L3ea:
            com.google.android.gms.internal.play_billing.h6 r1 = r0.m11208F(r6)
            r8 = r5
            r3 = r7
            r7 = r11
            r4 = r26
            r11 = r34
            r5 = r37
            r26 = r6
            r6 = r2
            r2 = r20
            int r1 = com.google.android.gms.internal.play_billing.C2508g3.m11424e(r1, r2, r3, r4, r5, r6, r7)
            r7 = r2
            r3 = r35
            r4 = r37
            r6 = r39
            r5 = r1
            r15 = r7
            r1 = r8
            r2 = r11
            r14 = r23
            goto L267
        L40f:
            r2 = r26
            r7 = r35
            r11 = r0
            r13 = r1
            r1 = r2
            r3 = r6
            r10 = r20
            r0 = r24
            r6 = r39
            r20 = r9
            goto Lba7
        L421:
            r11 = r1
            r1 = r5
            r5 = r6
            r7 = r20
            r2 = r26
            r6 = 49
            java.lang.String r2 = "Protocol message had invalid UTF-8."
            r20 = r9
            java.lang.String r9 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            if (r13 > r6) goto Lb4d
            r6 = r13
            long r12 = (long) r12
            java.lang.Object r18 = r1.getObject(r11, r14)
            r27 = r6
            r6 = r18
            com.google.android.gms.internal.play_billing.y4 r6 = (com.google.android.gms.internal.play_billing.InterfaceC2707y4) r6
            boolean r18 = r6.zzc()
            if (r18 != 0) goto L455
            int r18 = r6.size()
            r28 = r12
            int r12 = r18 + r18
            com.google.android.gms.internal.play_billing.y4 r6 = r6.mo11340r(r12)
            r1.putObject(r11, r14, r6)
        L453:
            r12 = r6
            goto L458
        L455:
            r28 = r12
            goto L453
        L458:
            switch(r27) {
                case 18: goto Laa7;
                case 19: goto La25;
                case 20: goto L9bb;
                case 21: goto L9bb;
                case 22: goto L994;
                case 23: goto L90b;
                case 24: goto L896;
                case 25: goto L819;
                case 26: goto L72c;
                case 27: goto L6fd;
                case 28: goto L681;
                case 29: goto L994;
                case 30: goto L5c2;
                case 31: goto L896;
                case 32: goto L90b;
                case 33: goto L551;
                case 34: goto L4b4;
                case 35: goto Laa7;
                case 36: goto La25;
                case 37: goto L9bb;
                case 38: goto L9bb;
                case 39: goto L994;
                case 40: goto L90b;
                case 41: goto L896;
                case 42: goto L819;
                case 43: goto L994;
                case 44: goto L5c2;
                case 45: goto L896;
                case 46: goto L90b;
                case 47: goto L551;
                case 48: goto L4b4;
                default: goto L45b;
            }
        L45b:
            r6 = 3
            if (r8 != r6) goto L4a1
            r2 = r7 & (-8)
            r2 = r2 | 4
            r9 = r1
            com.google.android.gms.internal.play_billing.h6 r1 = r0.m11208F(r5)
            r4 = r37
            r6 = r39
            r15 = r5
            r13 = r9
            r14 = r24
            r3 = r26
            r5 = r2
            r2 = r35
            int r8 = com.google.android.gms.internal.play_billing.C2508g3.m11422c(r1, r2, r3, r4, r5, r6)
            java.lang.Object r3 = r6.f8965c
            r12.add(r3)
        L47d:
            if (r8 >= r4) goto L491
            int r3 = com.google.android.gms.internal.play_billing.C2508g3.m11428i(r2, r8, r6)
            int r9 = r6.f8963a
            if (r7 != r9) goto L491
            int r8 = com.google.android.gms.internal.play_billing.C2508g3.m11422c(r1, r2, r3, r4, r5, r6)
            java.lang.Object r3 = r6.f8965c
            r12.add(r3)
            goto L47d
        L491:
            r5 = r4
            r10 = r7
            r24 = r13
            r18 = r14
            r1 = r26
            r7 = r2
            r13 = r11
            r26 = r15
            r11 = r0
            r0 = r8
            goto Lb29
        L4a1:
            r6 = r39
            r10 = r7
            r13 = r11
            r18 = r24
            r7 = r35
            r11 = r0
            r24 = r1
            r1 = r26
            r26 = r5
            r5 = r37
            goto Lb28
        L4b4:
            r2 = r35
            r4 = r37
            r6 = r39
            r13 = r1
            r15 = r5
            r14 = r24
            r1 = r26
            r5 = 2
            if (r8 != r5) goto L509
            int r5 = com.google.android.gms.internal.play_billing.C2508g3.f8983a
            com.google.android.gms.internal.play_billing.l5 r12 = (com.google.android.gms.internal.play_billing.C2565l5) r12
            int r5 = com.google.android.gms.internal.play_billing.C2508g3.m11428i(r2, r1, r6)
            int r8 = r6.f8963a
            if (r8 < 0) goto L503
            int r3 = r2.length
            int r3 = r3 - r5
            if (r8 > r3) goto L4fd
            int r8 = r8 + r5
        L4d4:
            if (r5 >= r8) goto L4e6
            int r5 = com.google.android.gms.internal.play_billing.C2508g3.m11431l(r2, r5, r6)
            long r10 = r6.f8964b
            long r10 = com.google.android.gms.internal.play_billing.C2684w3.m11814b(r10)
            r12.m11539d(r10)
            r11 = r34
            goto L4d4
        L4e6:
            if (r5 != r8) goto L4f7
        L4e8:
            r11 = r0
            r0 = r5
            r10 = r7
            r24 = r13
            r18 = r14
            r26 = r15
            r13 = r34
            r7 = r2
        L4f4:
            r5 = r4
            goto Lb29
        L4f7:
            com.google.android.gms.internal.play_billing.f5 r1 = new com.google.android.gms.internal.play_billing.f5
            r1.<init>(r9)
            throw r1
        L4fd:
            com.google.android.gms.internal.play_billing.f5 r1 = new com.google.android.gms.internal.play_billing.f5
            r1.<init>(r9)
            throw r1
        L503:
            com.google.android.gms.internal.play_billing.f5 r1 = new com.google.android.gms.internal.play_billing.f5
            r1.<init>(r3)
            throw r1
        L509:
            if (r8 != 0) goto L543
            int r3 = com.google.android.gms.internal.play_billing.C2508g3.f8983a
            com.google.android.gms.internal.play_billing.l5 r12 = (com.google.android.gms.internal.play_billing.C2565l5) r12
            int r3 = com.google.android.gms.internal.play_billing.C2508g3.m11431l(r2, r1, r6)
            long r8 = r6.f8964b
            long r8 = com.google.android.gms.internal.play_billing.C2684w3.m11814b(r8)
            r12.m11539d(r8)
        L51c:
            if (r3 >= r4) goto L534
            int r5 = com.google.android.gms.internal.play_billing.C2508g3.m11428i(r2, r3, r6)
            int r8 = r6.f8963a
            if (r7 != r8) goto L534
            int r3 = com.google.android.gms.internal.play_billing.C2508g3.m11431l(r2, r5, r6)
            long r8 = r6.f8964b
            long r8 = com.google.android.gms.internal.play_billing.C2684w3.m11814b(r8)
            r12.m11539d(r8)
            goto L51c
        L534:
            r11 = r0
            r0 = r3
            r5 = r4
            r10 = r7
            r24 = r13
            r18 = r14
            r26 = r15
            r13 = r34
            r7 = r2
            goto Lb29
        L543:
            r11 = r0
            r5 = r4
            r10 = r7
            r24 = r13
            r18 = r14
            r26 = r15
            r13 = r34
        L54e:
            r7 = r2
            goto Lb28
        L551:
            r2 = r35
            r4 = r37
            r6 = r39
            r13 = r1
            r15 = r5
            r14 = r24
            r1 = r26
            r5 = 2
            if (r8 != r5) goto L597
            int r5 = com.google.android.gms.internal.play_billing.C2508g3.f8983a
            com.google.android.gms.internal.play_billing.u4 r12 = (com.google.android.gms.internal.play_billing.C2663u4) r12
            int r5 = com.google.android.gms.internal.play_billing.C2508g3.m11428i(r2, r1, r6)
            int r8 = r6.f8963a
            if (r8 < 0) goto L591
            int r3 = r2.length
            int r3 = r3 - r5
            if (r8 > r3) goto L58b
            int r8 = r8 + r5
        L571:
            if (r5 >= r8) goto L581
            int r5 = com.google.android.gms.internal.play_billing.C2508g3.m11428i(r2, r5, r6)
            int r3 = r6.f8963a
            int r3 = com.google.android.gms.internal.play_billing.C2684w3.m11813a(r3)
            r12.mo11775w(r3)
            goto L571
        L581:
            if (r5 != r8) goto L585
            goto L4e8
        L585:
            com.google.android.gms.internal.play_billing.f5 r1 = new com.google.android.gms.internal.play_billing.f5
            r1.<init>(r9)
            throw r1
        L58b:
            com.google.android.gms.internal.play_billing.f5 r1 = new com.google.android.gms.internal.play_billing.f5
            r1.<init>(r9)
            throw r1
        L591:
            com.google.android.gms.internal.play_billing.f5 r1 = new com.google.android.gms.internal.play_billing.f5
            r1.<init>(r3)
            throw r1
        L597:
            if (r8 != 0) goto L543
            int r3 = com.google.android.gms.internal.play_billing.C2508g3.f8983a
            com.google.android.gms.internal.play_billing.u4 r12 = (com.google.android.gms.internal.play_billing.C2663u4) r12
            int r3 = com.google.android.gms.internal.play_billing.C2508g3.m11428i(r2, r1, r6)
            int r5 = r6.f8963a
            int r5 = com.google.android.gms.internal.play_billing.C2684w3.m11813a(r5)
            r12.mo11775w(r5)
        L5aa:
            if (r3 >= r4) goto L534
            int r5 = com.google.android.gms.internal.play_billing.C2508g3.m11428i(r2, r3, r6)
            int r8 = r6.f8963a
            if (r7 != r8) goto L534
            int r3 = com.google.android.gms.internal.play_billing.C2508g3.m11428i(r2, r5, r6)
            int r5 = r6.f8963a
            int r5 = com.google.android.gms.internal.play_billing.C2684w3.m11813a(r5)
            r12.mo11775w(r5)
            goto L5aa
        L5c2:
            r2 = r35
            r4 = r37
            r6 = r39
            r13 = r1
            r15 = r5
            r14 = r24
            r1 = r26
            r5 = 2
            if (r8 != r5) goto L5d9
            int r3 = com.google.android.gms.internal.play_billing.C2508g3.m11425f(r2, r1, r12, r6)
            r5 = r1
            r1 = r7
            r10 = r12
            goto L5e5
        L5d9:
            if (r8 != 0) goto L673
            r3 = r1
            r1 = r7
            r5 = r12
            int r7 = com.google.android.gms.internal.play_billing.C2508g3.m11430k(r1, r2, r3, r4, r5, r6)
            r10 = r5
            r5 = r3
            r3 = r7
        L5e5:
            com.google.android.gms.internal.play_billing.w4 r7 = r0.m11207E(r15)
            com.google.android.gms.internal.play_billing.t6 r8 = r0.f8913j
            com.google.android.gms.internal.play_billing.t6 r9 = com.google.android.gms.internal.play_billing.C2533i6.f9048a
            if (r7 == 0) goto L660
            if (r10 == 0) goto L636
            int r9 = r10.size()
            r36 = r3
            r3 = r16
            r11 = 0
            r12 = 0
        L5fb:
            if (r11 >= r9) goto L628
            java.lang.Object r18 = r10.get(r11)
            r24 = r13
            r13 = r18
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r0 = r13.intValue()
            boolean r18 = r7.mo11321a(r0)
            if (r18 == 0) goto L61b
            if (r11 == r12) goto L616
            r10.set(r12, r13)
        L616:
            int r12 = r12 + 1
            r13 = r34
            goto L621
        L61b:
            r13 = r34
            java.lang.Object r3 = com.google.android.gms.internal.play_billing.C2533i6.m11494s(r13, r14, r0, r3, r8)
        L621:
            int r11 = r11 + 1
            r0 = r33
            r13 = r24
            goto L5fb
        L628:
            r24 = r13
            r13 = r34
            if (r12 == r9) goto L666
            java.util.List r0 = r10.subList(r12, r9)
            r0.clear()
            goto L666
        L636:
            r36 = r3
            r24 = r13
            r13 = r34
            java.util.Iterator r0 = r10.iterator()
            r3 = r16
        L642:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L666
            java.lang.Object r9 = r0.next()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            boolean r10 = r7.mo11321a(r9)
            if (r10 != 0) goto L642
            java.lang.Object r3 = com.google.android.gms.internal.play_billing.C2533i6.m11494s(r13, r14, r9, r3, r8)
            r0.remove()
            goto L642
        L660:
            r36 = r3
            r24 = r13
            r13 = r34
        L666:
            r11 = r33
            r0 = r36
        L66a:
            r10 = r1
            r7 = r2
            r1 = r5
            r18 = r14
            r26 = r15
            goto L4f4
        L673:
            r24 = r13
            r13 = r34
            r11 = r33
            r5 = r4
            r10 = r7
            r18 = r14
            r26 = r15
            goto L54e
        L681:
            r2 = r35
            r4 = r37
            r6 = r39
            r15 = r5
            r13 = r11
            r10 = r12
            r14 = r24
            r5 = r26
            r0 = 2
            r24 = r1
            r1 = r7
            if (r8 != r0) goto L6f1
            int r0 = com.google.android.gms.internal.play_billing.C2508g3.m11428i(r2, r5, r6)
            int r7 = r6.f8963a
            if (r7 < 0) goto L6eb
            int r8 = r2.length
            int r8 = r8 - r0
            if (r7 > r8) goto L6e5
            if (r7 != 0) goto L6a8
            com.google.android.gms.internal.play_billing.s3 r7 = com.google.android.gms.internal.play_billing.AbstractC2640s3.f9227b
            r10.add(r7)
            goto L6b0
        L6a8:
            com.google.android.gms.internal.play_billing.s3 r8 = com.google.android.gms.internal.play_billing.AbstractC2640s3.m11719k(r2, r0, r7)
            r10.add(r8)
        L6af:
            int r0 = r0 + r7
        L6b0:
            if (r0 >= r4) goto L6e2
            int r7 = com.google.android.gms.internal.play_billing.C2508g3.m11428i(r2, r0, r6)
            int r8 = r6.f8963a
            if (r1 != r8) goto L6e2
            int r0 = com.google.android.gms.internal.play_billing.C2508g3.m11428i(r2, r7, r6)
            int r7 = r6.f8963a
            if (r7 < 0) goto L6dc
            int r8 = r2.length
            int r8 = r8 - r0
            if (r7 > r8) goto L6d6
            if (r7 != 0) goto L6ce
            com.google.android.gms.internal.play_billing.s3 r7 = com.google.android.gms.internal.play_billing.AbstractC2640s3.f9227b
            r10.add(r7)
            goto L6b0
        L6ce:
            com.google.android.gms.internal.play_billing.s3 r8 = com.google.android.gms.internal.play_billing.AbstractC2640s3.m11719k(r2, r0, r7)
            r10.add(r8)
            goto L6af
        L6d6:
            com.google.android.gms.internal.play_billing.f5 r0 = new com.google.android.gms.internal.play_billing.f5
            r0.<init>(r9)
            throw r0
        L6dc:
            com.google.android.gms.internal.play_billing.f5 r0 = new com.google.android.gms.internal.play_billing.f5
            r0.<init>(r3)
            throw r0
        L6e2:
            r11 = r33
            goto L66a
        L6e5:
            com.google.android.gms.internal.play_billing.f5 r0 = new com.google.android.gms.internal.play_billing.f5
            r0.<init>(r9)
            throw r0
        L6eb:
            com.google.android.gms.internal.play_billing.f5 r0 = new com.google.android.gms.internal.play_billing.f5
            r0.<init>(r3)
            throw r0
        L6f1:
            r11 = r33
            r10 = r1
            r7 = r2
            r1 = r5
            r18 = r14
            r26 = r15
            r5 = r4
            goto Lb28
        L6fd:
            r2 = r35
            r4 = r37
            r6 = r39
            r15 = r5
            r13 = r11
            r10 = r12
            r14 = r24
            r5 = r26
            r0 = 2
            r24 = r1
            r1 = r7
            if (r8 != r0) goto L6f1
            r11 = r33
            r7 = r1
            com.google.android.gms.internal.play_billing.h6 r1 = r11.m11208F(r15)
            r3 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r7
            r7 = r6
            r6 = r10
            int r0 = com.google.android.gms.internal.play_billing.C2508g3.m11424e(r1, r2, r3, r4, r5, r6, r7)
            r10 = r2
            r1 = r4
            r6 = r7
            r18 = r14
            r26 = r15
            r7 = r3
            goto Lb29
        L72c:
            r6 = r39
            r15 = r5
            r13 = r11
            r14 = r24
            r10 = r26
            r5 = r37
            r11 = r0
            r24 = r1
            r1 = r7
            r0 = 2
            r7 = r35
            if (r8 != r0) goto L80e
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r28 & r8
            int r0 = (r8 > r21 ? 1 : (r8 == r21 ? 0 : -1))
            if (r0 != 0) goto L79b
            int r0 = com.google.android.gms.internal.play_billing.C2508g3.m11428i(r7, r10, r6)
            int r2 = r6.f8963a
            if (r2 < 0) goto L795
            if (r2 != 0) goto L756
            r12.add(r4)
            goto L761
        L756:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = java.nio.charset.StandardCharsets.UTF_8
            r8.<init>(r7, r0, r2, r9)
            r12.add(r8)
        L760:
            int r0 = r0 + r2
        L761:
            if (r0 >= r5) goto L78a
            int r2 = com.google.android.gms.internal.play_billing.C2508g3.m11428i(r7, r0, r6)
            int r8 = r6.f8963a
            if (r1 != r8) goto L78a
            int r0 = com.google.android.gms.internal.play_billing.C2508g3.m11428i(r7, r2, r6)
            int r2 = r6.f8963a
            if (r2 < 0) goto L784
            if (r2 != 0) goto L779
            r12.add(r4)
            goto L761
        L779:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = java.nio.charset.StandardCharsets.UTF_8
            r8.<init>(r7, r0, r2, r9)
            r12.add(r8)
            goto L760
        L784:
            com.google.android.gms.internal.play_billing.f5 r0 = new com.google.android.gms.internal.play_billing.f5
            r0.<init>(r3)
            throw r0
        L78a:
            r18 = r10
            r10 = r1
            r1 = r18
            r18 = r14
        L791:
            r26 = r15
            goto Lb29
        L795:
            com.google.android.gms.internal.play_billing.f5 r0 = new com.google.android.gms.internal.play_billing.f5
            r0.<init>(r3)
            throw r0
        L79b:
            int r0 = com.google.android.gms.internal.play_billing.C2508g3.m11428i(r7, r10, r6)
            int r8 = r6.f8963a
            if (r8 < 0) goto L808
            if (r8 != 0) goto L7ab
            r12.add(r4)
            r18 = r14
            goto L7c3
        L7ab:
            int r9 = r0 + r8
            boolean r18 = com.google.android.gms.internal.play_billing.C2490e7.m11381b(r7, r0, r9)
            if (r18 == 0) goto L802
            r36 = r9
            java.lang.String r9 = new java.lang.String
            r18 = r14
            java.nio.charset.Charset r14 = java.nio.charset.StandardCharsets.UTF_8
            r9.<init>(r7, r0, r8, r14)
            r12.add(r9)
        L7c1:
            r0 = r36
        L7c3:
            if (r0 >= r5) goto L7fc
            int r8 = com.google.android.gms.internal.play_billing.C2508g3.m11428i(r7, r0, r6)
            int r9 = r6.f8963a
            if (r1 != r9) goto L7fc
            int r0 = com.google.android.gms.internal.play_billing.C2508g3.m11428i(r7, r8, r6)
            int r8 = r6.f8963a
            if (r8 < 0) goto L7f6
            if (r8 != 0) goto L7db
            r12.add(r4)
            goto L7c3
        L7db:
            int r9 = r0 + r8
            boolean r14 = com.google.android.gms.internal.play_billing.C2490e7.m11381b(r7, r0, r9)
            if (r14 == 0) goto L7f0
            java.lang.String r14 = new java.lang.String
            r36 = r9
            java.nio.charset.Charset r9 = java.nio.charset.StandardCharsets.UTF_8
            r14.<init>(r7, r0, r8, r9)
            r12.add(r14)
            goto L7c1
        L7f0:
            com.google.android.gms.internal.play_billing.f5 r0 = new com.google.android.gms.internal.play_billing.f5
            r0.<init>(r2)
            throw r0
        L7f6:
            com.google.android.gms.internal.play_billing.f5 r0 = new com.google.android.gms.internal.play_billing.f5
            r0.<init>(r3)
            throw r0
        L7fc:
            r26 = r10
            r10 = r1
            r1 = r26
            goto L791
        L802:
            com.google.android.gms.internal.play_billing.f5 r0 = new com.google.android.gms.internal.play_billing.f5
            r0.<init>(r2)
            throw r0
        L808:
            com.google.android.gms.internal.play_billing.f5 r0 = new com.google.android.gms.internal.play_billing.f5
            r0.<init>(r3)
            throw r0
        L80e:
            r18 = r14
        L810:
            r26 = r10
            r10 = r1
            r1 = r26
            r26 = r15
            goto Lb28
        L819:
            r6 = r39
            r15 = r5
            r13 = r11
            r18 = r24
            r10 = r26
            r5 = r37
            r11 = r0
            r24 = r1
            r1 = r7
            r0 = 2
            r7 = r35
            if (r8 != r0) goto L865
            int r0 = com.google.android.gms.internal.play_billing.C2508g3.f8983a
            com.google.android.gms.internal.play_billing.h3 r12 = (com.google.android.gms.internal.play_billing.C2519h3) r12
            int r0 = com.google.android.gms.internal.play_billing.C2508g3.m11428i(r7, r10, r6)
            int r2 = r6.f8963a
            if (r2 < 0) goto L85f
            int r3 = r7.length
            int r3 = r3 - r0
            if (r2 > r3) goto L859
            int r2 = r2 + r0
        L83d:
            if (r0 >= r2) goto L850
            int r0 = com.google.android.gms.internal.play_billing.C2508g3.m11431l(r7, r0, r6)
            long r3 = r6.f8964b
            int r3 = (r3 > r21 ? 1 : (r3 == r21 ? 0 : -1))
            if (r3 == 0) goto L84b
            r3 = 1
            goto L84c
        L84b:
            r3 = 0
        L84c:
            r12.m11446c(r3)
            goto L83d
        L850:
            if (r0 != r2) goto L853
            goto L7fc
        L853:
            com.google.android.gms.internal.play_billing.f5 r0 = new com.google.android.gms.internal.play_billing.f5
            r0.<init>(r9)
            throw r0
        L859:
            com.google.android.gms.internal.play_billing.f5 r0 = new com.google.android.gms.internal.play_billing.f5
            r0.<init>(r9)
            throw r0
        L85f:
            com.google.android.gms.internal.play_billing.f5 r0 = new com.google.android.gms.internal.play_billing.f5
            r0.<init>(r3)
            throw r0
        L865:
            if (r8 != 0) goto L810
            int r0 = com.google.android.gms.internal.play_billing.C2508g3.f8983a
            com.google.android.gms.internal.play_billing.h3 r12 = (com.google.android.gms.internal.play_billing.C2519h3) r12
            int r0 = com.google.android.gms.internal.play_billing.C2508g3.m11431l(r7, r10, r6)
            long r2 = r6.f8964b
            int r2 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r2 == 0) goto L877
            r2 = 1
            goto L878
        L877:
            r2 = 0
        L878:
            r12.m11446c(r2)
        L87b:
            if (r0 >= r5) goto L7fc
            int r2 = com.google.android.gms.internal.play_billing.C2508g3.m11428i(r7, r0, r6)
            int r3 = r6.f8963a
            if (r1 != r3) goto L7fc
            int r0 = com.google.android.gms.internal.play_billing.C2508g3.m11431l(r7, r2, r6)
            long r2 = r6.f8964b
            int r2 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r2 == 0) goto L891
            r2 = 1
            goto L892
        L891:
            r2 = 0
        L892:
            r12.m11446c(r2)
            goto L87b
        L896:
            r6 = r39
            r15 = r5
            r13 = r11
            r18 = r24
            r10 = r26
            r5 = r37
            r11 = r0
            r24 = r1
            r1 = r7
            r0 = 2
            r7 = r35
            if (r8 != r0) goto L8e7
            int r0 = com.google.android.gms.internal.play_billing.C2508g3.f8983a
            com.google.android.gms.internal.play_billing.u4 r12 = (com.google.android.gms.internal.play_billing.C2663u4) r12
            int r0 = com.google.android.gms.internal.play_billing.C2508g3.m11428i(r7, r10, r6)
            int r2 = r6.f8963a
            if (r2 < 0) goto L8e1
            int r3 = r7.length
            int r3 = r3 - r0
            if (r2 > r3) goto L8db
            int r3 = r0 + r2
            int r4 = r12.size()
            int r2 = r2 >> 2
            int r4 = r4 + r2
            r12.m11771e(r4)
        L8c5:
            if (r0 >= r3) goto L8d1
            int r2 = com.google.android.gms.internal.play_billing.C2508g3.m11421b(r7, r0)
            r12.mo11775w(r2)
            int r0 = r0 + 4
            goto L8c5
        L8d1:
            if (r0 != r3) goto L8d5
            goto L7fc
        L8d5:
            com.google.android.gms.internal.play_billing.f5 r0 = new com.google.android.gms.internal.play_billing.f5
            r0.<init>(r9)
            throw r0
        L8db:
            com.google.android.gms.internal.play_billing.f5 r0 = new com.google.android.gms.internal.play_billing.f5
            r0.<init>(r9)
            throw r0
        L8e1:
            com.google.android.gms.internal.play_billing.f5 r0 = new com.google.android.gms.internal.play_billing.f5
            r0.<init>(r3)
            throw r0
        L8e7:
            r3 = 5
            if (r8 != r3) goto L810
            int r0 = r10 + 4
            int r2 = com.google.android.gms.internal.play_billing.C2508g3.f8983a
            com.google.android.gms.internal.play_billing.u4 r12 = (com.google.android.gms.internal.play_billing.C2663u4) r12
            int r2 = com.google.android.gms.internal.play_billing.C2508g3.m11421b(r7, r10)
            r12.mo11775w(r2)
        L8f7:
            if (r0 >= r5) goto L7fc
            int r2 = com.google.android.gms.internal.play_billing.C2508g3.m11428i(r7, r0, r6)
            int r3 = r6.f8963a
            if (r1 != r3) goto L7fc
            int r0 = com.google.android.gms.internal.play_billing.C2508g3.m11421b(r7, r2)
            r12.mo11775w(r0)
            int r0 = r2 + 4
            goto L8f7
        L90b:
            r6 = r39
            r15 = r5
            r13 = r11
            r18 = r24
            r10 = r26
            r5 = r37
            r11 = r0
            r24 = r1
            r1 = r7
            r0 = 2
            r7 = r35
            if (r8 != r0) goto L967
            int r0 = com.google.android.gms.internal.play_billing.C2508g3.f8983a
            com.google.android.gms.internal.play_billing.l5 r12 = (com.google.android.gms.internal.play_billing.C2565l5) r12
            int r0 = com.google.android.gms.internal.play_billing.C2508g3.m11428i(r7, r10, r6)
            int r2 = r6.f8963a
            if (r2 < 0) goto L961
            int r3 = r7.length
            int r3 = r3 - r0
            if (r2 > r3) goto L95b
            int r3 = r0 + r2
            int r4 = r12.size()
            int r2 = r2 >> 3
            int r4 = r4 + r2
            r12.m11540e(r4)
        L93a:
            if (r0 >= r3) goto L94a
            r26 = r15
            long r14 = com.google.android.gms.internal.play_billing.C2508g3.m11434o(r7, r0)
            r12.m11539d(r14)
            int r0 = r0 + 8
            r15 = r26
            goto L93a
        L94a:
            r26 = r15
            if (r0 != r3) goto L955
        L94e:
            r30 = r10
            r10 = r1
            r1 = r30
            goto Lb29
        L955:
            com.google.android.gms.internal.play_billing.f5 r0 = new com.google.android.gms.internal.play_billing.f5
            r0.<init>(r9)
            throw r0
        L95b:
            com.google.android.gms.internal.play_billing.f5 r0 = new com.google.android.gms.internal.play_billing.f5
            r0.<init>(r9)
            throw r0
        L961:
            com.google.android.gms.internal.play_billing.f5 r0 = new com.google.android.gms.internal.play_billing.f5
            r0.<init>(r3)
            throw r0
        L967:
            r26 = r15
            r3 = 1
            if (r8 != r3) goto L98d
            int r0 = r10 + 8
            int r2 = com.google.android.gms.internal.play_billing.C2508g3.f8983a
            com.google.android.gms.internal.play_billing.l5 r12 = (com.google.android.gms.internal.play_billing.C2565l5) r12
            long r2 = com.google.android.gms.internal.play_billing.C2508g3.m11434o(r7, r10)
            r12.m11539d(r2)
        L979:
            if (r0 >= r5) goto L94e
            int r2 = com.google.android.gms.internal.play_billing.C2508g3.m11428i(r7, r0, r6)
            int r3 = r6.f8963a
            if (r1 != r3) goto L94e
            long r3 = com.google.android.gms.internal.play_billing.C2508g3.m11434o(r7, r2)
            r12.m11539d(r3)
            int r0 = r2 + 8
            goto L979
        L98d:
            r30 = r10
            r10 = r1
            r1 = r30
            goto Lb28
        L994:
            r6 = r39
            r13 = r11
            r18 = r24
            r10 = r26
            r11 = r0
            r24 = r1
            r26 = r5
            r1 = r7
            r0 = 2
            r7 = r35
            r5 = r37
            if (r8 != r0) goto L9ad
            int r0 = com.google.android.gms.internal.play_billing.C2508g3.m11425f(r7, r10, r12, r6)
            goto L94e
        L9ad:
            if (r8 != 0) goto L98d
            r4 = r5
            r2 = r7
            r3 = r10
            r5 = r12
            int r0 = com.google.android.gms.internal.play_billing.C2508g3.m11430k(r1, r2, r3, r4, r5, r6)
            r10 = r1
            r1 = r3
            goto L4f4
        L9bb:
            r6 = r39
            r10 = r7
            r13 = r11
            r18 = r24
            r7 = r35
            r11 = r0
            r24 = r1
            r1 = r26
            r0 = 2
            r26 = r5
            r5 = r37
            if (r8 != r0) goto La02
            int r0 = com.google.android.gms.internal.play_billing.C2508g3.f8983a
            com.google.android.gms.internal.play_billing.l5 r12 = (com.google.android.gms.internal.play_billing.C2565l5) r12
            int r0 = com.google.android.gms.internal.play_billing.C2508g3.m11428i(r7, r1, r6)
            int r2 = r6.f8963a
            if (r2 < 0) goto L9fc
            int r3 = r7.length
            int r3 = r3 - r0
            if (r2 > r3) goto L9f6
            int r2 = r2 + r0
        L9e0:
            if (r0 >= r2) goto L9ec
            int r0 = com.google.android.gms.internal.play_billing.C2508g3.m11431l(r7, r0, r6)
            long r3 = r6.f8964b
            r12.m11539d(r3)
            goto L9e0
        L9ec:
            if (r0 != r2) goto L9f0
            goto Lb29
        L9f0:
            com.google.android.gms.internal.play_billing.f5 r0 = new com.google.android.gms.internal.play_billing.f5
            r0.<init>(r9)
            throw r0
        L9f6:
            com.google.android.gms.internal.play_billing.f5 r0 = new com.google.android.gms.internal.play_billing.f5
            r0.<init>(r9)
            throw r0
        L9fc:
            com.google.android.gms.internal.play_billing.f5 r0 = new com.google.android.gms.internal.play_billing.f5
            r0.<init>(r3)
            throw r0
        La02:
            if (r8 != 0) goto Lb28
            int r0 = com.google.android.gms.internal.play_billing.C2508g3.f8983a
            com.google.android.gms.internal.play_billing.l5 r12 = (com.google.android.gms.internal.play_billing.C2565l5) r12
            int r0 = com.google.android.gms.internal.play_billing.C2508g3.m11431l(r7, r1, r6)
            long r2 = r6.f8964b
            r12.m11539d(r2)
        La11:
            if (r0 >= r5) goto Lb29
            int r2 = com.google.android.gms.internal.play_billing.C2508g3.m11428i(r7, r0, r6)
            int r3 = r6.f8963a
            if (r10 != r3) goto Lb29
            int r0 = com.google.android.gms.internal.play_billing.C2508g3.m11431l(r7, r2, r6)
            long r2 = r6.f8964b
            r12.m11539d(r2)
            goto La11
        La25:
            r6 = r39
            r10 = r7
            r13 = r11
            r18 = r24
            r7 = r35
            r11 = r0
            r24 = r1
            r1 = r26
            r0 = 2
            r26 = r5
            r5 = r37
            if (r8 != r0) goto La7b
            int r0 = com.google.android.gms.internal.play_billing.C2508g3.f8983a
            com.google.android.gms.internal.play_billing.n4 r12 = (com.google.android.gms.internal.play_billing.C2586n4) r12
            int r0 = com.google.android.gms.internal.play_billing.C2508g3.m11428i(r7, r1, r6)
            int r2 = r6.f8963a
            if (r2 < 0) goto La75
            int r3 = r7.length
            int r3 = r3 - r0
            if (r2 > r3) goto La6f
            int r3 = r0 + r2
            int r4 = r12.size()
            int r2 = r2 >> 2
            int r4 = r4 + r2
            r12.m11619e(r4)
        La55:
            if (r0 >= r3) goto La65
            int r2 = com.google.android.gms.internal.play_billing.C2508g3.m11421b(r7, r0)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            r12.m11618d(r2)
            int r0 = r0 + 4
            goto La55
        La65:
            if (r0 != r3) goto La69
            goto Lb29
        La69:
            com.google.android.gms.internal.play_billing.f5 r0 = new com.google.android.gms.internal.play_billing.f5
            r0.<init>(r9)
            throw r0
        La6f:
            com.google.android.gms.internal.play_billing.f5 r0 = new com.google.android.gms.internal.play_billing.f5
            r0.<init>(r9)
            throw r0
        La75:
            com.google.android.gms.internal.play_billing.f5 r0 = new com.google.android.gms.internal.play_billing.f5
            r0.<init>(r3)
            throw r0
        La7b:
            r3 = 5
            if (r8 != r3) goto Lb28
            int r0 = r1 + 4
            int r2 = com.google.android.gms.internal.play_billing.C2508g3.f8983a
            com.google.android.gms.internal.play_billing.n4 r12 = (com.google.android.gms.internal.play_billing.C2586n4) r12
            int r2 = com.google.android.gms.internal.play_billing.C2508g3.m11421b(r7, r1)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            r12.m11618d(r2)
        La8f:
            if (r0 >= r5) goto Lb29
            int r2 = com.google.android.gms.internal.play_billing.C2508g3.m11428i(r7, r0, r6)
            int r3 = r6.f8963a
            if (r10 != r3) goto Lb29
            int r0 = com.google.android.gms.internal.play_billing.C2508g3.m11421b(r7, r2)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r12.m11618d(r0)
            int r0 = r2 + 4
            goto La8f
        Laa7:
            r6 = r39
            r10 = r7
            r13 = r11
            r18 = r24
            r7 = r35
            r11 = r0
            r24 = r1
            r1 = r26
            r0 = 2
            r26 = r5
            r5 = r37
            if (r8 != r0) goto Lafc
            int r0 = com.google.android.gms.internal.play_billing.C2508g3.f8983a
            com.google.android.gms.internal.play_billing.c4 r12 = (com.google.android.gms.internal.play_billing.C2465c4) r12
            int r0 = com.google.android.gms.internal.play_billing.C2508g3.m11428i(r7, r1, r6)
            int r2 = r6.f8963a
            if (r2 < 0) goto Laf6
            int r3 = r7.length
            int r3 = r3 - r0
            if (r2 > r3) goto Laf0
            int r3 = r0 + r2
            int r4 = r12.size()
            int r2 = r2 >> 3
            int r4 = r4 + r2
            r12.m11337e(r4)
        Lad7:
            if (r0 >= r3) goto Lae7
            long r14 = com.google.android.gms.internal.play_billing.C2508g3.m11434o(r7, r0)
            double r14 = java.lang.Double.longBitsToDouble(r14)
            r12.m11336d(r14)
            int r0 = r0 + 8
            goto Lad7
        Lae7:
            if (r0 != r3) goto Laea
            goto Lb29
        Laea:
            com.google.android.gms.internal.play_billing.f5 r0 = new com.google.android.gms.internal.play_billing.f5
            r0.<init>(r9)
            throw r0
        Laf0:
            com.google.android.gms.internal.play_billing.f5 r0 = new com.google.android.gms.internal.play_billing.f5
            r0.<init>(r9)
            throw r0
        Laf6:
            com.google.android.gms.internal.play_billing.f5 r0 = new com.google.android.gms.internal.play_billing.f5
            r0.<init>(r3)
            throw r0
        Lafc:
            r3 = 1
            if (r8 != r3) goto Lb28
            int r0 = r1 + 8
            int r2 = com.google.android.gms.internal.play_billing.C2508g3.f8983a
            com.google.android.gms.internal.play_billing.c4 r12 = (com.google.android.gms.internal.play_billing.C2465c4) r12
            long r2 = com.google.android.gms.internal.play_billing.C2508g3.m11434o(r7, r1)
            double r2 = java.lang.Double.longBitsToDouble(r2)
            r12.m11336d(r2)
        Lb10:
            if (r0 >= r5) goto Lb29
            int r2 = com.google.android.gms.internal.play_billing.C2508g3.m11428i(r7, r0, r6)
            int r3 = r6.f8963a
            if (r10 != r3) goto Lb29
            long r3 = com.google.android.gms.internal.play_billing.C2508g3.m11434o(r7, r2)
            double r3 = java.lang.Double.longBitsToDouble(r3)
            r12.m11336d(r3)
            int r0 = r2 + 8
            goto Lb10
        Lb28:
            r0 = r1
        Lb29:
            if (r0 == r1) goto Lb3e
            r4 = r5
            r3 = r7
            r15 = r10
            r2 = r13
            r7 = r18
            r9 = r20
            r14 = r23
            r1 = r24
            r8 = r26
            r12 = -1
            r5 = r0
        Lb3b:
            r0 = r11
            goto Ldd
        Lb3e:
            r12 = r38
            r5 = r0
            r3 = r7
            r0 = r18
            r14 = r23
            r9 = r24
            r8 = r26
        Lb4a:
            r7 = r6
            goto Lddc
        Lb4d:
            r6 = r39
            r3 = r5
            r10 = r7
            r27 = r13
            r7 = r35
            r13 = r11
            r11 = r0
            r0 = r24
            r24 = r1
            r1 = r26
            r5 = 50
            r26 = r12
            r12 = r27
            if (r12 != r5) goto Lbb0
            r5 = 2
            if (r8 != r5) goto Lba5
            java.lang.Object r0 = r11.m11210H(r3)
            r5 = r24
            java.lang.Object r2 = r5.getObject(r13, r14)
            r3 = r2
            com.google.android.gms.internal.play_billing.r5 r3 = (com.google.android.gms.internal.play_billing.C2631r5) r3
            boolean r3 = r3.m11702f()
            if (r3 != 0) goto Lb8a
            com.google.android.gms.internal.play_billing.r5 r3 = com.google.android.gms.internal.play_billing.C2631r5.m11697a()
            com.google.android.gms.internal.play_billing.r5 r3 = r3.m11699b()
            com.google.android.gms.internal.play_billing.C2642s5.m11722a(r3, r2)
            r5.putObject(r13, r14, r3)
            r2 = r3
        Lb8a:
            com.google.android.gms.internal.play_billing.q5 r0 = (com.google.android.gms.internal.play_billing.C2620q5) r0
            r0.m11687c()
            com.google.android.gms.internal.play_billing.r5 r2 = (com.google.android.gms.internal.play_billing.C2631r5) r2
            int r0 = com.google.android.gms.internal.play_billing.C2508g3.m11428i(r7, r1, r6)
            int r1 = r6.f8963a
            if (r1 < 0) goto Lb9f
            int r0 = r37 - r0
            if (r1 <= r0) goto Lb9e
            goto Lb9f
        Lb9e:
            throw r16
        Lb9f:
            com.google.android.gms.internal.play_billing.f5 r0 = new com.google.android.gms.internal.play_billing.f5
            r0.<init>(r9)
            throw r0
        Lba5:
            r5 = r24
        Lba7:
            r12 = r38
            r8 = r3
            r9 = r5
            r3 = r7
            r14 = r23
            r5 = r1
            goto Lb4a
        Lbb0:
            r5 = r24
            int r9 = r3 + 2
            r9 = r19[r9]
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r9 & r17
            long r5 = (long) r9
            switch(r12) {
                case 51: goto Lda2;
                case 52: goto Ld81;
                case 53: goto Ld64;
                case 54: goto Ld64;
                case 55: goto Ld49;
                case 56: goto Ld2d;
                case 57: goto Ld11;
                case 58: goto Lce8;
                case 59: goto Lca8;
                case 60: goto Lc8a;
                case 61: goto Lc73;
                case 62: goto Ld49;
                case 63: goto Lc3f;
                case 64: goto Ld11;
                case 65: goto Ld2d;
                case 66: goto Lc20;
                case 67: goto Lbf9;
                case 68: goto Lbc9;
                default: goto Lbbf;
            }
        Lbbf:
            r12 = r1
            r19 = r3
            r3 = r7
            r9 = r24
            r7 = r39
            goto Ldc3
        Lbc9:
            r5 = 3
            if (r8 != r5) goto Lbee
            r2 = r10 & (-8)
            r6 = r2 | 4
            r4 = r1
            java.lang.Object r1 = r11.m11212J(r13, r0, r3)
            com.google.android.gms.internal.play_billing.h6 r2 = r11.m11208F(r3)
            r5 = r37
            r12 = r3
            r3 = r7
            r9 = r24
            r7 = r39
            int r2 = com.google.android.gms.internal.play_billing.C2508g3.m11432m(r1, r2, r3, r4, r5, r6, r7)
            r11.m11224l(r13, r0, r12, r1)
        Lbe8:
            r5 = r2
        Lbe9:
            r19 = r12
            r12 = r4
            goto Ldc4
        Lbee:
            r12 = r3
            r3 = r7
            r9 = r24
            r7 = r39
            r19 = r12
            r12 = r1
            goto Ldc3
        Lbf9:
            r4 = r1
            r12 = r3
            r3 = r7
            r9 = r24
            r7 = r39
            if (r8 != 0) goto Lc1b
            int r1 = com.google.android.gms.internal.play_billing.C2508g3.m11431l(r3, r4, r7)
            r36 = r1
            long r1 = r7.f8964b
            long r1 = com.google.android.gms.internal.play_billing.C2684w3.m11814b(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r9.putObject(r13, r14, r1)
            r9.putInt(r13, r5, r0)
            r5 = r36
            goto Lbe9
        Lc1b:
            r19 = r12
            r12 = r4
            goto Ldc3
        Lc20:
            r4 = r1
            r12 = r3
            r3 = r7
            r9 = r24
            r7 = r39
            if (r8 != 0) goto Lc1b
            int r1 = com.google.android.gms.internal.play_billing.C2508g3.m11428i(r3, r4, r7)
            int r2 = r7.f8963a
            int r2 = com.google.android.gms.internal.play_billing.C2684w3.m11813a(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r9.putObject(r13, r14, r2)
            r9.putInt(r13, r5, r0)
        Lc3d:
            r5 = r1
            goto Lbe9
        Lc3f:
            r4 = r1
            r12 = r3
            r3 = r7
            r9 = r24
            r7 = r39
            if (r8 != 0) goto Lc1b
            int r1 = com.google.android.gms.internal.play_billing.C2508g3.m11428i(r3, r4, r7)
            int r2 = r7.f8963a
            com.google.android.gms.internal.play_billing.w4 r8 = r11.m11207E(r12)
            if (r8 == 0) goto Lc68
            boolean r8 = r8.mo11321a(r2)
            if (r8 == 0) goto Lc5b
            goto Lc68
        Lc5b:
            com.google.android.gms.internal.play_billing.u6 r5 = m11202w(r13)
            long r14 = (long) r2
            java.lang.Long r2 = java.lang.Long.valueOf(r14)
            r5.m11785j(r10, r2)
            goto Lc3d
        Lc68:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r9.putObject(r13, r14, r2)
            r9.putInt(r13, r5, r0)
            goto Lc3d
        Lc73:
            r4 = r1
            r12 = r3
            r3 = r7
            r9 = r24
            r1 = 2
            r7 = r39
            if (r8 != r1) goto Lc1b
            int r1 = com.google.android.gms.internal.play_billing.C2508g3.m11420a(r3, r4, r7)
            java.lang.Object r2 = r7.f8965c
            r9.putObject(r13, r14, r2)
            r9.putInt(r13, r5, r0)
            goto Lc3d
        Lc8a:
            r4 = r1
            r12 = r3
            r3 = r7
            r9 = r24
            r1 = 2
            r7 = r39
            if (r8 != r1) goto Lc1b
            java.lang.Object r1 = r11.m11212J(r13, r0, r12)
            com.google.android.gms.internal.play_billing.h6 r2 = r11.m11208F(r12)
            r5 = r37
            r6 = r7
            int r2 = com.google.android.gms.internal.play_billing.C2508g3.m11433n(r1, r2, r3, r4, r5, r6)
            r11.m11224l(r13, r0, r12, r1)
            goto Lbe8
        Lca8:
            r12 = r1
            r19 = r3
            r3 = r7
            r9 = r24
            r1 = 2
            r7 = r39
            if (r8 != r1) goto Ldc3
            int r1 = com.google.android.gms.internal.play_billing.C2508g3.m11428i(r3, r12, r7)
            int r8 = r7.f8963a
            if (r8 != 0) goto Lcbf
            r9.putObject(r13, r14, r4)
            goto Lce2
        Lcbf:
            r4 = r26 & r18
            r36 = r4
            int r4 = r1 + r8
            if (r36 == 0) goto Lcd4
            boolean r18 = com.google.android.gms.internal.play_billing.C2490e7.m11381b(r3, r1, r4)
            if (r18 == 0) goto Lcce
            goto Lcd4
        Lcce:
            com.google.android.gms.internal.play_billing.f5 r0 = new com.google.android.gms.internal.play_billing.f5
            r0.<init>(r2)
            throw r0
        Lcd4:
            java.lang.String r2 = new java.lang.String
            r36 = r4
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8
            r2.<init>(r3, r1, r8, r4)
            r9.putObject(r13, r14, r2)
            r1 = r36
        Lce2:
            r9.putInt(r13, r5, r0)
        Lce5:
            r5 = r1
            goto Ldc4
        Lce8:
            r12 = r1
            r19 = r3
            r3 = r7
            r9 = r24
            r7 = r39
            if (r8 != 0) goto Ldc3
            int r1 = com.google.android.gms.internal.play_billing.C2508g3.m11431l(r3, r12, r7)
            r36 = r1
            long r1 = r7.f8964b
            int r1 = (r1 > r21 ? 1 : (r1 == r21 ? 0 : -1))
            if (r1 == 0) goto Ld01
            r25 = 1
            goto Ld03
        Ld01:
            r25 = 0
        Ld03:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r25)
            r9.putObject(r13, r14, r1)
            r9.putInt(r13, r5, r0)
        Ld0d:
            r5 = r36
            goto Ldc4
        Ld11:
            r12 = r1
            r19 = r3
            r3 = r7
            r9 = r24
            r1 = 5
            r7 = r39
            if (r8 != r1) goto Ldc3
            int r1 = r12 + 4
            int r2 = com.google.android.gms.internal.play_billing.C2508g3.m11421b(r3, r12)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r9.putObject(r13, r14, r2)
            r9.putInt(r13, r5, r0)
            goto Lce5
        Ld2d:
            r12 = r1
            r19 = r3
            r3 = r7
            r9 = r24
            r1 = 1
            r7 = r39
            if (r8 != r1) goto Ldc3
            int r1 = r12 + 8
            long r21 = com.google.android.gms.internal.play_billing.C2508g3.m11434o(r3, r12)
            java.lang.Long r2 = java.lang.Long.valueOf(r21)
            r9.putObject(r13, r14, r2)
            r9.putInt(r13, r5, r0)
            goto Lce5
        Ld49:
            r12 = r1
            r19 = r3
            r3 = r7
            r9 = r24
            r7 = r39
            if (r8 != 0) goto Ldc3
            int r1 = com.google.android.gms.internal.play_billing.C2508g3.m11428i(r3, r12, r7)
            int r2 = r7.f8963a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r9.putObject(r13, r14, r2)
            r9.putInt(r13, r5, r0)
            goto Lce5
        Ld64:
            r12 = r1
            r19 = r3
            r3 = r7
            r9 = r24
            r7 = r39
            if (r8 != 0) goto Ldc3
            int r1 = com.google.android.gms.internal.play_billing.C2508g3.m11431l(r3, r12, r7)
            r36 = r1
            long r1 = r7.f8964b
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r9.putObject(r13, r14, r1)
            r9.putInt(r13, r5, r0)
            goto Ld0d
        Ld81:
            r12 = r1
            r19 = r3
            r3 = r7
            r9 = r24
            r1 = 5
            r7 = r39
            if (r8 != r1) goto Ldc3
            int r1 = r12 + 4
            int r2 = com.google.android.gms.internal.play_billing.C2508g3.m11421b(r3, r12)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r9.putObject(r13, r14, r2)
            r9.putInt(r13, r5, r0)
            goto Lce5
        Lda2:
            r12 = r1
            r19 = r3
            r3 = r7
            r9 = r24
            r1 = 1
            r7 = r39
            if (r8 != r1) goto Ldc3
            int r1 = r12 + 8
            long r21 = com.google.android.gms.internal.play_billing.C2508g3.m11434o(r3, r12)
            double r21 = java.lang.Double.longBitsToDouble(r21)
            java.lang.Double r2 = java.lang.Double.valueOf(r21)
            r9.putObject(r13, r14, r2)
            r9.putInt(r13, r5, r0)
            goto Lce5
        Ldc3:
            r5 = r12
        Ldc4:
            if (r5 == r12) goto Ldd6
            r4 = r37
            r6 = r7
            r1 = r9
            r15 = r10
            r2 = r13
            r8 = r19
            r9 = r20
            r14 = r23
        Ldd2:
            r12 = -1
            r7 = r0
            goto Lb3b
        Ldd6:
            r12 = r38
            r8 = r19
            r14 = r23
        Lddc:
            if (r10 != r12) goto Ldeb
            if (r12 == 0) goto Ldeb
            r7 = r37
            r15 = r10
        Lde3:
            r6 = r5
            r0 = r20
            r1 = 1048575(0xfffff, float:1.469367E-39)
            goto Le42
        Ldeb:
            boolean r1 = r11.f8909f
            if (r1 == 0) goto Le1a
            com.google.android.gms.internal.play_billing.f4 r1 = r7.f8966d
            com.google.android.gms.internal.play_billing.f4 r2 = com.google.android.gms.internal.play_billing.C2498f4.f8968b
            int r2 = com.google.android.gms.internal.play_billing.C2486e3.f8956a
            com.google.android.gms.internal.play_billing.f4 r2 = com.google.android.gms.internal.play_billing.C2498f4.f8968b
            if (r1 == r2) goto Le1a
            com.google.android.gms.internal.play_billing.x5 r2 = r11.f8908e
            int r4 = com.google.android.gms.internal.play_billing.C2508g3.f8983a
            com.google.android.gms.internal.play_billing.s4 r1 = r1.m11402a(r2, r0)
            if (r1 != 0) goto Le16
            r3 = r5
            com.google.android.gms.internal.play_billing.u6 r5 = m11202w(r13)
            r2 = r35
            r4 = r37
            r6 = r7
            r1 = r10
            int r3 = com.google.android.gms.internal.play_billing.C2508g3.m11427h(r1, r2, r3, r4, r5, r6)
            r7 = r37
        Le14:
            r5 = r3
            goto Le2c
        Le16:
            r0 = r13
            com.google.android.gms.internal.play_billing.q4 r0 = (com.google.android.gms.internal.play_billing.AbstractC2619q4) r0
            throw r16
        Le1a:
            r3 = r5
            r1 = r10
            com.google.android.gms.internal.play_billing.u6 r5 = m11202w(r13)
            r2 = r35
            r4 = r37
            r6 = r39
            int r3 = com.google.android.gms.internal.play_billing.C2508g3.m11427h(r1, r2, r3, r4, r5, r6)
            r7 = r4
            goto Le14
        Le2c:
            r3 = r35
            r6 = r39
            r15 = r1
            r4 = r7
            r1 = r9
            r2 = r13
            r9 = r20
            goto Ldd2
        Le37:
            r12 = r38
            r11 = r0
            r13 = r2
            r7 = r4
            r20 = r9
            r23 = r14
            r9 = r1
            goto Lde3
        Le42:
            if (r0 == r1) goto Le48
            long r0 = (long) r0
            r9.putInt(r13, r0, r14)
        Le48:
            int r0 = r11.f8911h
            r8 = r0
            r3 = r16
        Le4d:
            int r0 = r11.f8912i
            if (r8 >= r0) goto Le69
            int[] r0 = r11.f8910g
            com.google.android.gms.internal.play_billing.t6 r4 = r11.f8913j
            r2 = r0[r8]
            r5 = r34
            r0 = r11
            r1 = r13
            java.lang.Object r2 = r0.m11209G(r1, r2, r3, r4, r5)
            r3 = r2
            com.google.android.gms.internal.play_billing.u6 r3 = (com.google.android.gms.internal.play_billing.C2665u6) r3
            int r8 = r8 + 1
            r11 = r33
            r13 = r34
            goto Le4d
        Le69:
            if (r3 == 0) goto Le71
            r0 = r34
            com.google.android.gms.internal.play_billing.t4 r0 = (com.google.android.gms.internal.play_billing.AbstractC2652t4) r0
            r0.zzc = r3
        Le71:
            java.lang.String r0 = "Failed to parse the message."
            if (r12 != 0) goto Le7e
            if (r6 != r7) goto Le78
            goto Le82
        Le78:
            com.google.android.gms.internal.play_billing.f5 r1 = new com.google.android.gms.internal.play_billing.f5
            r1.<init>(r0)
            throw r1
        Le7e:
            if (r6 > r7) goto Le83
            if (r15 != r12) goto Le83
        Le82:
            return r6
        Le83:
            com.google.android.gms.internal.play_billing.f5 r1 = new com.google.android.gms.internal.play_billing.f5
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.C2445a6.m11231v(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.f3):int");
    }

    /* JADX INFO: renamed from: z */
    public final int m11232z(int i10) {
        return this.f8904a[i10 + 2];
    }

    /* JADX WARN: Code duplicated, block: B:143:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f1  */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC2522h6
    public final int zza(Object obj) {
        int i10;
        int iM11173v;
        int iM11173v2;
        int iM11174w;
        int iM11173v3;
        int iM11173v4;
        int iM11173v5;
        int iM11342b;
        int iM11173v6;
        int iM11173v7;
        int iMo11332c;
        int iM11173v8;
        int iM11481f;
        int iM11488m;
        int size;
        int iM11492q;
        int iM11173v9;
        int iM11342b2;
        int iM11173v10;
        int iM11342b3;
        int iM11173v11;
        int iM11173v12;
        int iM11173v13;
        int iM11174w2;
        int iM11486k;
        int iM11173v14;
        int iM11173v15;
        int iM11481f2;
        int iM11173v16;
        int iM11173v17;
        C2445a6<T> c2445a6 = this;
        Unsafe unsafe = f8903m;
        int i11 = 0;
        int i12 = 0;
        int iM11173v18 = 0;
        int i13 = 1048575;
        while (true) {
            int[] iArr = c2445a6.f8904a;
            if (i11 >= iArr.length) {
                int iM11779a = iM11173v18 + ((AbstractC2652t4) obj).zzc.m11779a();
                if (!c2445a6.f8909f) {
                    return iM11779a;
                }
                C2610p6 c2610p6 = ((AbstractC2619q4) obj).zzb.f9063a;
                int iM11654c = c2610p6.m11654c();
                int iM11519c = 0;
                for (int i14 = 0; i14 < iM11654c; i14++) {
                    Map.Entry entryM11657g = c2610p6.m11657g(i14);
                    iM11519c += C2553k4.m11519c((InterfaceC2542j4) ((C2555k6) entryM11657g).m11531a(), entryM11657g.getValue());
                }
                for (Map.Entry entry : c2610p6.m11655d()) {
                    iM11519c += C2553k4.m11519c((InterfaceC2542j4) entry.getKey(), entry.getValue());
                }
                return iM11779a + iM11519c;
            }
            int iM11206C = c2445a6.m11206C(i11);
            int iM11195B = m11195B(iM11206C);
            int i15 = iArr[i11];
            int i16 = iArr[i11 + 2];
            int i17 = i16 & 1048575;
            if (iM11195B <= 17) {
                if (i17 != i13) {
                    i12 = i17 == 1048575 ? 0 : unsafe.getInt(obj, i17);
                    i13 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            } else {
                i10 = 0;
            }
            int i18 = iM11206C & 1048575;
            if (iM11195B >= EnumC2564l4.f9105K.zza()) {
                EnumC2564l4.f9118X.zza();
            }
            long j10 = i18;
            switch (iM11195B) {
                case 0:
                    if (c2445a6.m11227o(obj, i11, i13, i12, i10)) {
                        iM11173v18 += AbstractC2443a4.m11173v(i15 << 3) + 8;
                    }
                    break;
                case 1:
                    if (c2445a6.m11227o(obj, i11, i13, i12, i10)) {
                        iM11173v = AbstractC2443a4.m11173v(i15 << 3);
                        iM11173v4 = iM11173v + 4;
                        iM11173v18 += iM11173v4;
                    }
                    c2445a6 = this;
                    break;
                case 2:
                    if (c2445a6.m11227o(obj, i11, i13, i12, i10)) {
                        long j11 = unsafe.getLong(obj, j10);
                        iM11173v2 = AbstractC2443a4.m11173v(i15 << 3);
                        iM11174w = AbstractC2443a4.m11174w(j11);
                        iM11173v4 = iM11173v2 + iM11174w;
                        iM11173v18 += iM11173v4;
                    }
                    c2445a6 = this;
                    break;
                case 3:
                    if (c2445a6.m11227o(obj, i11, i13, i12, i10)) {
                        long j12 = unsafe.getLong(obj, j10);
                        iM11173v2 = AbstractC2443a4.m11173v(i15 << 3);
                        iM11174w = AbstractC2443a4.m11174w(j12);
                        iM11173v4 = iM11173v2 + iM11174w;
                        iM11173v18 += iM11173v4;
                    }
                    c2445a6 = this;
                    break;
                case 4:
                    if (c2445a6.m11227o(obj, i11, i13, i12, i10)) {
                        long j13 = unsafe.getInt(obj, j10);
                        iM11173v2 = AbstractC2443a4.m11173v(i15 << 3);
                        iM11174w = AbstractC2443a4.m11174w(j13);
                        iM11173v4 = iM11173v2 + iM11174w;
                        iM11173v18 += iM11173v4;
                    }
                    c2445a6 = this;
                    break;
                case 5:
                    if (c2445a6.m11227o(obj, i11, i13, i12, i10)) {
                        iM11173v3 = AbstractC2443a4.m11173v(i15 << 3);
                        iM11173v4 = iM11173v3 + 8;
                        iM11173v18 += iM11173v4;
                    }
                    c2445a6 = this;
                    break;
                case 6:
                    if (c2445a6.m11227o(obj, i11, i13, i12, i10)) {
                        iM11173v = AbstractC2443a4.m11173v(i15 << 3);
                        iM11173v4 = iM11173v + 4;
                        iM11173v18 += iM11173v4;
                    }
                    c2445a6 = this;
                    break;
                case 7:
                    if (c2445a6.m11227o(obj, i11, i13, i12, i10)) {
                        iM11173v4 = AbstractC2443a4.m11173v(i15 << 3) + 1;
                        iM11173v18 += iM11173v4;
                    }
                    c2445a6 = this;
                    break;
                case 8:
                    if (c2445a6.m11227o(obj, i11, i13, i12, i10)) {
                        int i19 = i15 << 3;
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof AbstractC2640s3) {
                            iM11173v5 = AbstractC2443a4.m11173v(i19);
                            iM11342b = ((AbstractC2640s3) object).mo11587d();
                            iM11173v6 = AbstractC2443a4.m11173v(iM11342b);
                        } else {
                            iM11173v5 = AbstractC2443a4.m11173v(i19);
                            int i20 = C2490e7.f8962a;
                            iM11342b = C2468c7.m11342b((String) object);
                            iM11173v6 = AbstractC2443a4.m11173v(iM11342b);
                        }
                        iM11173v4 = iM11173v5 + iM11173v6 + iM11342b;
                        iM11173v18 += iM11173v4;
                    }
                    c2445a6 = this;
                    break;
                case 9:
                    if (c2445a6.m11227o(obj, i11, i13, i12, i10)) {
                        int i21 = i15 << 3;
                        Object object2 = unsafe.getObject(obj, j10);
                        InterfaceC2522h6 interfaceC2522h6M11208F = c2445a6.m11208F(i11);
                        AbstractC2654t6 abstractC2654t6 = C2533i6.f9048a;
                        iM11173v7 = AbstractC2443a4.m11173v(i21);
                        iMo11332c = ((AbstractC2464c3) object2).mo11332c(interfaceC2522h6M11208F);
                        iM11173v8 = AbstractC2443a4.m11173v(iMo11332c);
                        iM11481f = iM11173v7 + iM11173v8 + iMo11332c;
                        iM11173v18 += iM11481f;
                    }
                    break;
                case 10:
                    if (c2445a6.m11227o(obj, i11, i13, i12, i10)) {
                        AbstractC2640s3 abstractC2640s3 = (AbstractC2640s3) unsafe.getObject(obj, j10);
                        iM11173v5 = AbstractC2443a4.m11173v(i15 << 3);
                        iM11342b = abstractC2640s3.mo11587d();
                        iM11173v6 = AbstractC2443a4.m11173v(iM11342b);
                        iM11173v4 = iM11173v5 + iM11173v6 + iM11342b;
                        iM11173v18 += iM11173v4;
                    }
                    c2445a6 = this;
                    break;
                case 11:
                    if (c2445a6.m11227o(obj, i11, i13, i12, i10)) {
                        int i22 = unsafe.getInt(obj, j10);
                        iM11173v2 = AbstractC2443a4.m11173v(i15 << 3);
                        iM11174w = AbstractC2443a4.m11173v(i22);
                        iM11173v4 = iM11173v2 + iM11174w;
                        iM11173v18 += iM11173v4;
                    }
                    c2445a6 = this;
                    break;
                case 12:
                    if (c2445a6.m11227o(obj, i11, i13, i12, i10)) {
                        long j14 = unsafe.getInt(obj, j10);
                        iM11173v2 = AbstractC2443a4.m11173v(i15 << 3);
                        iM11174w = AbstractC2443a4.m11174w(j14);
                        iM11173v4 = iM11173v2 + iM11174w;
                        iM11173v18 += iM11173v4;
                    }
                    c2445a6 = this;
                    break;
                case 13:
                    if (c2445a6.m11227o(obj, i11, i13, i12, i10)) {
                        iM11173v = AbstractC2443a4.m11173v(i15 << 3);
                        iM11173v4 = iM11173v + 4;
                        iM11173v18 += iM11173v4;
                    }
                    c2445a6 = this;
                    break;
                case 14:
                    if (c2445a6.m11227o(obj, i11, i13, i12, i10)) {
                        iM11173v3 = AbstractC2443a4.m11173v(i15 << 3);
                        iM11173v4 = iM11173v3 + 8;
                        iM11173v18 += iM11173v4;
                    }
                    c2445a6 = this;
                    break;
                case 15:
                    if (c2445a6.m11227o(obj, i11, i13, i12, i10)) {
                        int i23 = unsafe.getInt(obj, j10);
                        iM11173v2 = AbstractC2443a4.m11173v(i15 << 3);
                        iM11174w = AbstractC2443a4.m11173v((i23 >> 31) ^ (i23 + i23));
                        iM11173v4 = iM11173v2 + iM11174w;
                        iM11173v18 += iM11173v4;
                    }
                    c2445a6 = this;
                    break;
                case 16:
                    if (c2445a6.m11227o(obj, i11, i13, i12, i10)) {
                        long j15 = unsafe.getLong(obj, j10);
                        iM11173v2 = AbstractC2443a4.m11173v(i15 << 3);
                        iM11174w = AbstractC2443a4.m11174w((j15 >> 63) ^ (j15 + j15));
                        iM11173v4 = iM11173v2 + iM11174w;
                        iM11173v18 += iM11173v4;
                    }
                    c2445a6 = this;
                    break;
                case 17:
                    if (c2445a6.m11227o(obj, i11, i13, i12, i10)) {
                        iM11481f = C2533i6.m11481f(i15, (InterfaceC2697x5) unsafe.getObject(obj, j10), c2445a6.m11208F(i11));
                        iM11173v18 += iM11481f;
                    }
                    break;
                case 18:
                    iM11481f = C2533i6.m11485j(i15, (List) unsafe.getObject(obj, j10), false);
                    iM11173v18 += iM11481f;
                    break;
                case 19:
                    iM11481f = C2533i6.m11483h(i15, (List) unsafe.getObject(obj, j10), false);
                    iM11173v18 += iM11481f;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j10);
                    AbstractC2654t6 abstractC2654t7 = C2533i6.f9048a;
                    if (list.size() == 0) {
                        iM11488m = 0;
                    } else {
                        iM11488m = C2533i6.m11488m(list) + (list.size() * AbstractC2443a4.m11173v(i15 << 3));
                    }
                    iM11173v18 += iM11488m;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j10);
                    AbstractC2654t6 abstractC2654t8 = C2533i6.f9048a;
                    size = list2.size();
                    if (size == 0) {
                        iM11481f = 0;
                    } else {
                        iM11492q = C2533i6.m11492q(list2);
                        iM11173v9 = AbstractC2443a4.m11173v(i15 << 3);
                        iM11174w2 = size * iM11173v9;
                        iM11481f = iM11492q + iM11174w2;
                    }
                    iM11173v18 += iM11481f;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j10);
                    AbstractC2654t6 abstractC2654t9 = C2533i6.f9048a;
                    size = list3.size();
                    if (size == 0) {
                        iM11481f = 0;
                    } else {
                        iM11492q = C2533i6.m11487l(list3);
                        iM11173v9 = AbstractC2443a4.m11173v(i15 << 3);
                        iM11174w2 = size * iM11173v9;
                        iM11481f = iM11492q + iM11174w2;
                    }
                    iM11173v18 += iM11481f;
                    break;
                case 23:
                    iM11481f = C2533i6.m11485j(i15, (List) unsafe.getObject(obj, j10), false);
                    iM11173v18 += iM11481f;
                    break;
                case 24:
                    iM11481f = C2533i6.m11483h(i15, (List) unsafe.getObject(obj, j10), false);
                    iM11173v18 += iM11481f;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j10);
                    AbstractC2654t6 abstractC2654t10 = C2533i6.f9048a;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iM11481f = 0;
                    } else {
                        iM11481f = size2 * (AbstractC2443a4.m11173v(i15 << 3) + 1);
                    }
                    iM11173v18 += iM11481f;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j10);
                    AbstractC2654t6 abstractC2654t11 = C2533i6.f9048a;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iM11488m = 0;
                    } else {
                        iM11488m = AbstractC2443a4.m11173v(i15 << 3) * size3;
                        if (list5 instanceof InterfaceC2521h5) {
                            InterfaceC2521h5 interfaceC2521h5 = (InterfaceC2521h5) list5;
                            for (int i24 = 0; i24 < size3; i24++) {
                                Object objZza = interfaceC2521h5.zza();
                                if (objZza instanceof AbstractC2640s3) {
                                    iM11342b3 = ((AbstractC2640s3) objZza).mo11587d();
                                    iM11173v11 = AbstractC2443a4.m11173v(iM11342b3);
                                } else {
                                    int i25 = C2490e7.f8962a;
                                    iM11342b3 = C2468c7.m11342b((String) objZza);
                                    iM11173v11 = AbstractC2443a4.m11173v(iM11342b3);
                                }
                                iM11488m += iM11173v11 + iM11342b3;
                            }
                        } else {
                            for (int i26 = 0; i26 < size3; i26++) {
                                Object obj2 = list5.get(i26);
                                if (obj2 instanceof AbstractC2640s3) {
                                    iM11342b2 = ((AbstractC2640s3) obj2).mo11587d();
                                    iM11173v10 = AbstractC2443a4.m11173v(iM11342b2);
                                } else {
                                    int i27 = C2490e7.f8962a;
                                    iM11342b2 = C2468c7.m11342b((String) obj2);
                                    iM11173v10 = AbstractC2443a4.m11173v(iM11342b2);
                                }
                                iM11488m += iM11173v10 + iM11342b2;
                            }
                        }
                    }
                    iM11173v18 += iM11488m;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j10);
                    InterfaceC2522h6 interfaceC2522h6M11208F2 = c2445a6.m11208F(i11);
                    AbstractC2654t6 abstractC2654t12 = C2533i6.f9048a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iM11173v12 = 0;
                    } else {
                        iM11173v12 = AbstractC2443a4.m11173v(i15 << 3) * size4;
                        for (int i28 = 0; i28 < size4; i28++) {
                            int iMo11332c2 = ((AbstractC2464c3) list6.get(i28)).mo11332c(interfaceC2522h6M11208F2);
                            iM11173v12 += AbstractC2443a4.m11173v(iMo11332c2) + iMo11332c2;
                        }
                    }
                    iM11173v18 += iM11173v12;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j10);
                    AbstractC2654t6 abstractC2654t13 = C2533i6.f9048a;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iM11173v13 = 0;
                    } else {
                        iM11173v13 = size5 * AbstractC2443a4.m11173v(i15 << 3);
                        for (int i29 = 0; i29 < list7.size(); i29++) {
                            int iMo11587d = ((AbstractC2640s3) list7.get(i29)).mo11587d();
                            iM11173v13 += AbstractC2443a4.m11173v(iMo11587d) + iMo11587d;
                        }
                    }
                    iM11173v18 += iM11173v13;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j10);
                    AbstractC2654t6 abstractC2654t14 = C2533i6.f9048a;
                    size = list8.size();
                    if (size == 0) {
                        iM11481f = 0;
                    } else {
                        iM11492q = C2533i6.m11491p(list8);
                        iM11173v9 = AbstractC2443a4.m11173v(i15 << 3);
                        iM11174w2 = size * iM11173v9;
                        iM11481f = iM11492q + iM11174w2;
                    }
                    iM11173v18 += iM11481f;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j10);
                    AbstractC2654t6 abstractC2654t15 = C2533i6.f9048a;
                    size = list9.size();
                    if (size == 0) {
                        iM11481f = 0;
                    } else {
                        iM11492q = C2533i6.m11482g(list9);
                        iM11173v9 = AbstractC2443a4.m11173v(i15 << 3);
                        iM11174w2 = size * iM11173v9;
                        iM11481f = iM11492q + iM11174w2;
                    }
                    iM11173v18 += iM11481f;
                    break;
                case 31:
                    iM11481f = C2533i6.m11483h(i15, (List) unsafe.getObject(obj, j10), false);
                    iM11173v18 += iM11481f;
                    break;
                case 32:
                    iM11481f = C2533i6.m11485j(i15, (List) unsafe.getObject(obj, j10), false);
                    iM11173v18 += iM11481f;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j10);
                    AbstractC2654t6 abstractC2654t16 = C2533i6.f9048a;
                    size = list10.size();
                    if (size == 0) {
                        iM11481f = 0;
                    } else {
                        iM11492q = C2533i6.m11489n(list10);
                        iM11173v9 = AbstractC2443a4.m11173v(i15 << 3);
                        iM11174w2 = size * iM11173v9;
                        iM11481f = iM11492q + iM11174w2;
                    }
                    iM11173v18 += iM11481f;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j10);
                    AbstractC2654t6 abstractC2654t17 = C2533i6.f9048a;
                    size = list11.size();
                    if (size == 0) {
                        iM11481f = 0;
                    } else {
                        iM11492q = C2533i6.m11490o(list11);
                        iM11173v9 = AbstractC2443a4.m11173v(i15 << 3);
                        iM11174w2 = size * iM11173v9;
                        iM11481f = iM11492q + iM11174w2;
                    }
                    iM11173v18 += iM11481f;
                    break;
                case 35:
                    iM11486k = C2533i6.m11486k((List) unsafe.getObject(obj, j10));
                    if (iM11486k > 0) {
                        iM11173v14 = AbstractC2443a4.m11173v(i15 << 3);
                        iM11173v15 = AbstractC2443a4.m11173v(iM11486k);
                        iM11173v13 = iM11173v14 + iM11173v15 + iM11486k;
                        iM11173v18 += iM11173v13;
                    }
                    break;
                case 36:
                    iM11486k = C2533i6.m11484i((List) unsafe.getObject(obj, j10));
                    if (iM11486k > 0) {
                        iM11173v14 = AbstractC2443a4.m11173v(i15 << 3);
                        iM11173v15 = AbstractC2443a4.m11173v(iM11486k);
                        iM11173v13 = iM11173v14 + iM11173v15 + iM11486k;
                        iM11173v18 += iM11173v13;
                    }
                    break;
                case 37:
                    iM11486k = C2533i6.m11488m((List) unsafe.getObject(obj, j10));
                    if (iM11486k > 0) {
                        iM11173v14 = AbstractC2443a4.m11173v(i15 << 3);
                        iM11173v15 = AbstractC2443a4.m11173v(iM11486k);
                        iM11173v13 = iM11173v14 + iM11173v15 + iM11486k;
                        iM11173v18 += iM11173v13;
                    }
                    break;
                case 38:
                    iM11486k = C2533i6.m11492q((List) unsafe.getObject(obj, j10));
                    if (iM11486k > 0) {
                        iM11173v14 = AbstractC2443a4.m11173v(i15 << 3);
                        iM11173v15 = AbstractC2443a4.m11173v(iM11486k);
                        iM11173v13 = iM11173v14 + iM11173v15 + iM11486k;
                        iM11173v18 += iM11173v13;
                    }
                    break;
                case 39:
                    iM11486k = C2533i6.m11487l((List) unsafe.getObject(obj, j10));
                    if (iM11486k > 0) {
                        iM11173v14 = AbstractC2443a4.m11173v(i15 << 3);
                        iM11173v15 = AbstractC2443a4.m11173v(iM11486k);
                        iM11173v13 = iM11173v14 + iM11173v15 + iM11486k;
                        iM11173v18 += iM11173v13;
                    }
                    break;
                case 40:
                    iM11486k = C2533i6.m11486k((List) unsafe.getObject(obj, j10));
                    if (iM11486k > 0) {
                        iM11173v14 = AbstractC2443a4.m11173v(i15 << 3);
                        iM11173v15 = AbstractC2443a4.m11173v(iM11486k);
                        iM11173v13 = iM11173v14 + iM11173v15 + iM11486k;
                        iM11173v18 += iM11173v13;
                    }
                    break;
                case 41:
                    iM11486k = C2533i6.m11484i((List) unsafe.getObject(obj, j10));
                    if (iM11486k > 0) {
                        iM11173v14 = AbstractC2443a4.m11173v(i15 << 3);
                        iM11173v15 = AbstractC2443a4.m11173v(iM11486k);
                        iM11173v13 = iM11173v14 + iM11173v15 + iM11486k;
                        iM11173v18 += iM11173v13;
                    }
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(obj, j10);
                    AbstractC2654t6 abstractC2654t18 = C2533i6.f9048a;
                    iM11486k = list12.size();
                    if (iM11486k > 0) {
                        iM11173v14 = AbstractC2443a4.m11173v(i15 << 3);
                        iM11173v15 = AbstractC2443a4.m11173v(iM11486k);
                        iM11173v13 = iM11173v14 + iM11173v15 + iM11486k;
                        iM11173v18 += iM11173v13;
                    }
                    break;
                case 43:
                    iM11486k = C2533i6.m11491p((List) unsafe.getObject(obj, j10));
                    if (iM11486k > 0) {
                        iM11173v14 = AbstractC2443a4.m11173v(i15 << 3);
                        iM11173v15 = AbstractC2443a4.m11173v(iM11486k);
                        iM11173v13 = iM11173v14 + iM11173v15 + iM11486k;
                        iM11173v18 += iM11173v13;
                    }
                    break;
                case 44:
                    iM11486k = C2533i6.m11482g((List) unsafe.getObject(obj, j10));
                    if (iM11486k > 0) {
                        iM11173v14 = AbstractC2443a4.m11173v(i15 << 3);
                        iM11173v15 = AbstractC2443a4.m11173v(iM11486k);
                        iM11173v13 = iM11173v14 + iM11173v15 + iM11486k;
                        iM11173v18 += iM11173v13;
                    }
                    break;
                case 45:
                    iM11486k = C2533i6.m11484i((List) unsafe.getObject(obj, j10));
                    if (iM11486k > 0) {
                        iM11173v14 = AbstractC2443a4.m11173v(i15 << 3);
                        iM11173v15 = AbstractC2443a4.m11173v(iM11486k);
                        iM11173v13 = iM11173v14 + iM11173v15 + iM11486k;
                        iM11173v18 += iM11173v13;
                    }
                    break;
                case 46:
                    iM11486k = C2533i6.m11486k((List) unsafe.getObject(obj, j10));
                    if (iM11486k > 0) {
                        iM11173v14 = AbstractC2443a4.m11173v(i15 << 3);
                        iM11173v15 = AbstractC2443a4.m11173v(iM11486k);
                        iM11173v13 = iM11173v14 + iM11173v15 + iM11486k;
                        iM11173v18 += iM11173v13;
                    }
                    break;
                case 47:
                    iM11486k = C2533i6.m11489n((List) unsafe.getObject(obj, j10));
                    if (iM11486k > 0) {
                        iM11173v14 = AbstractC2443a4.m11173v(i15 << 3);
                        iM11173v15 = AbstractC2443a4.m11173v(iM11486k);
                        iM11173v13 = iM11173v14 + iM11173v15 + iM11486k;
                        iM11173v18 += iM11173v13;
                    }
                    break;
                case 48:
                    iM11486k = C2533i6.m11490o((List) unsafe.getObject(obj, j10));
                    if (iM11486k > 0) {
                        iM11173v14 = AbstractC2443a4.m11173v(i15 << 3);
                        iM11173v15 = AbstractC2443a4.m11173v(iM11486k);
                        iM11173v13 = iM11173v14 + iM11173v15 + iM11486k;
                        iM11173v18 += iM11173v13;
                    }
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j10);
                    InterfaceC2522h6 interfaceC2522h6M11208F3 = c2445a6.m11208F(i11);
                    AbstractC2654t6 abstractC2654t19 = C2533i6.f9048a;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iM11481f2 = 0;
                    } else {
                        iM11481f2 = 0;
                        for (int i30 = 0; i30 < size6; i30++) {
                            iM11481f2 += C2533i6.m11481f(i15, (InterfaceC2697x5) list13.get(i30), interfaceC2522h6M11208F3);
                        }
                    }
                    iM11173v18 += iM11481f2;
                    break;
                case 50:
                    C2631r5 c2631r5 = (C2631r5) unsafe.getObject(obj, j10);
                    C2620q5 c2620q5 = (C2620q5) c2445a6.m11210H(i11);
                    if (c2631r5.isEmpty()) {
                        iM11488m = 0;
                    } else {
                        iM11488m = 0;
                        for (Map.Entry entry2 : c2631r5.entrySet()) {
                            iM11488m += c2620q5.m11686a(i15, entry2.getKey(), entry2.getValue());
                        }
                    }
                    iM11173v18 += iM11488m;
                    break;
                case 51:
                    if (c2445a6.m11229s(obj, i15, i11)) {
                        iM11173v16 = AbstractC2443a4.m11173v(i15 << 3);
                        iM11481f = iM11173v16 + 8;
                        iM11173v18 += iM11481f;
                    }
                    break;
                case 52:
                    if (c2445a6.m11229s(obj, i15, i11)) {
                        iM11173v17 = AbstractC2443a4.m11173v(i15 << 3);
                        iM11481f = iM11173v17 + 4;
                        iM11173v18 += iM11481f;
                    }
                    break;
                case 53:
                    if (c2445a6.m11229s(obj, i15, i11)) {
                        long jM11196D = m11196D(obj, j10);
                        iM11492q = AbstractC2443a4.m11173v(i15 << 3);
                        iM11174w2 = AbstractC2443a4.m11174w(jM11196D);
                        iM11481f = iM11492q + iM11174w2;
                        iM11173v18 += iM11481f;
                    }
                    break;
                case 54:
                    if (c2445a6.m11229s(obj, i15, i11)) {
                        long jM11196D2 = m11196D(obj, j10);
                        iM11492q = AbstractC2443a4.m11173v(i15 << 3);
                        iM11174w2 = AbstractC2443a4.m11174w(jM11196D2);
                        iM11481f = iM11492q + iM11174w2;
                        iM11173v18 += iM11481f;
                    }
                    break;
                case 55:
                    if (c2445a6.m11229s(obj, i15, i11)) {
                        long jM11204y = m11204y(obj, j10);
                        iM11492q = AbstractC2443a4.m11173v(i15 << 3);
                        iM11174w2 = AbstractC2443a4.m11174w(jM11204y);
                        iM11481f = iM11492q + iM11174w2;
                        iM11173v18 += iM11481f;
                    }
                    break;
                case 56:
                    if (c2445a6.m11229s(obj, i15, i11)) {
                        iM11173v16 = AbstractC2443a4.m11173v(i15 << 3);
                        iM11481f = iM11173v16 + 8;
                        iM11173v18 += iM11481f;
                    }
                    break;
                case 57:
                    if (c2445a6.m11229s(obj, i15, i11)) {
                        iM11173v17 = AbstractC2443a4.m11173v(i15 << 3);
                        iM11481f = iM11173v17 + 4;
                        iM11173v18 += iM11481f;
                    }
                    break;
                case 58:
                    if (c2445a6.m11229s(obj, i15, i11)) {
                        iM11481f = AbstractC2443a4.m11173v(i15 << 3) + 1;
                        iM11173v18 += iM11481f;
                    }
                    break;
                case 59:
                    if (c2445a6.m11229s(obj, i15, i11)) {
                        int i31 = i15 << 3;
                        Object object3 = unsafe.getObject(obj, j10);
                        if (object3 instanceof AbstractC2640s3) {
                            iM11173v7 = AbstractC2443a4.m11173v(i31);
                            iMo11332c = ((AbstractC2640s3) object3).mo11587d();
                            iM11173v8 = AbstractC2443a4.m11173v(iMo11332c);
                        } else {
                            iM11173v7 = AbstractC2443a4.m11173v(i31);
                            int i32 = C2490e7.f8962a;
                            iMo11332c = C2468c7.m11342b((String) object3);
                            iM11173v8 = AbstractC2443a4.m11173v(iMo11332c);
                        }
                        iM11481f = iM11173v7 + iM11173v8 + iMo11332c;
                        iM11173v18 += iM11481f;
                    }
                    break;
                case 60:
                    if (c2445a6.m11229s(obj, i15, i11)) {
                        int i33 = i15 << 3;
                        Object object4 = unsafe.getObject(obj, j10);
                        InterfaceC2522h6 interfaceC2522h6M11208F4 = c2445a6.m11208F(i11);
                        AbstractC2654t6 abstractC2654t20 = C2533i6.f9048a;
                        iM11173v7 = AbstractC2443a4.m11173v(i33);
                        iMo11332c = ((AbstractC2464c3) object4).mo11332c(interfaceC2522h6M11208F4);
                        iM11173v8 = AbstractC2443a4.m11173v(iMo11332c);
                        iM11481f = iM11173v7 + iM11173v8 + iMo11332c;
                        iM11173v18 += iM11481f;
                    }
                    break;
                case 61:
                    if (c2445a6.m11229s(obj, i15, i11)) {
                        AbstractC2640s3 abstractC2640s4 = (AbstractC2640s3) unsafe.getObject(obj, j10);
                        iM11173v7 = AbstractC2443a4.m11173v(i15 << 3);
                        iMo11332c = abstractC2640s4.mo11587d();
                        iM11173v8 = AbstractC2443a4.m11173v(iMo11332c);
                        iM11481f = iM11173v7 + iM11173v8 + iMo11332c;
                        iM11173v18 += iM11481f;
                    }
                    break;
                case 62:
                    if (c2445a6.m11229s(obj, i15, i11)) {
                        int iM11204y = m11204y(obj, j10);
                        iM11492q = AbstractC2443a4.m11173v(i15 << 3);
                        iM11174w2 = AbstractC2443a4.m11173v(iM11204y);
                        iM11481f = iM11492q + iM11174w2;
                        iM11173v18 += iM11481f;
                    }
                    break;
                case 63:
                    if (c2445a6.m11229s(obj, i15, i11)) {
                        long jM11204y2 = m11204y(obj, j10);
                        iM11492q = AbstractC2443a4.m11173v(i15 << 3);
                        iM11174w2 = AbstractC2443a4.m11174w(jM11204y2);
                        iM11481f = iM11492q + iM11174w2;
                        iM11173v18 += iM11481f;
                    }
                    break;
                case 64:
                    if (c2445a6.m11229s(obj, i15, i11)) {
                        iM11173v17 = AbstractC2443a4.m11173v(i15 << 3);
                        iM11481f = iM11173v17 + 4;
                        iM11173v18 += iM11481f;
                    }
                    break;
                case 65:
                    if (c2445a6.m11229s(obj, i15, i11)) {
                        iM11173v16 = AbstractC2443a4.m11173v(i15 << 3);
                        iM11481f = iM11173v16 + 8;
                        iM11173v18 += iM11481f;
                    }
                    break;
                case 66:
                    if (c2445a6.m11229s(obj, i15, i11)) {
                        int iM11204y2 = m11204y(obj, j10);
                        iM11492q = AbstractC2443a4.m11173v(i15 << 3);
                        iM11174w2 = AbstractC2443a4.m11173v((iM11204y2 >> 31) ^ (iM11204y2 + iM11204y2));
                        iM11481f = iM11492q + iM11174w2;
                        iM11173v18 += iM11481f;
                    }
                    break;
                case 67:
                    if (c2445a6.m11229s(obj, i15, i11)) {
                        long jM11196D3 = m11196D(obj, j10);
                        iM11492q = AbstractC2443a4.m11173v(i15 << 3);
                        iM11174w2 = AbstractC2443a4.m11174w((jM11196D3 >> 63) ^ (jM11196D3 + jM11196D3));
                        iM11481f = iM11492q + iM11174w2;
                        iM11173v18 += iM11481f;
                    }
                    break;
                case 68:
                    if (c2445a6.m11229s(obj, i15, i11)) {
                        iM11481f = C2533i6.m11481f(i15, (InterfaceC2697x5) unsafe.getObject(obj, j10), c2445a6.m11208F(i11));
                        iM11173v18 += iM11481f;
                    }
                    break;
            }
            i11 += 3;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2522h6
    public final int zzb(Object obj) {
        int i10;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i11;
        int iHashCode = 0;
        for (int i12 = 0; i12 < this.f8904a.length; i12 += 3) {
            int iM11206C = m11206C(i12);
            int iM11195B = m11195B(iM11206C);
            if (iM11195B <= 50 || iM11195B >= 69) {
                long j10 = iM11206C & 1048575;
                int iHashCode2 = 37;
                switch (iM11195B) {
                    case 0:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(C2446a7.m11241e(obj, j10));
                        byte[] bArr = C2718z4.f9432a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 1:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = Float.floatToIntBits(C2446a7.m11242f(obj, j10));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 2:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = C2446a7.m11244h(obj, j10);
                        byte[] bArr2 = C2718z4.f9432a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 3:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = C2446a7.m11244h(obj, j10);
                        byte[] bArr3 = C2718z4.f9432a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 4:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = C2446a7.m11243g(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 5:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = C2446a7.m11244h(obj, j10);
                        byte[] bArr4 = C2718z4.f9432a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 6:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = C2446a7.m11243g(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 7:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = C2718z4.m11857a(C2446a7.m11233A(obj, j10));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 8:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = ((String) C2446a7.m11246j(obj, j10)).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 9:
                        i11 = iHashCode * 53;
                        Object objM11246j = C2446a7.m11246j(obj, j10);
                        if (objM11246j != null) {
                            iHashCode2 = objM11246j.hashCode();
                        }
                        iHashCode = i11 + iHashCode2;
                        break;
                    case 10:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = C2446a7.m11246j(obj, j10).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 11:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = C2446a7.m11243g(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 12:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = C2446a7.m11243g(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 13:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = C2446a7.m11243g(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 14:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = C2446a7.m11244h(obj, j10);
                        byte[] bArr5 = C2718z4.f9432a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 15:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = C2446a7.m11243g(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 16:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = C2446a7.m11244h(obj, j10);
                        byte[] bArr6 = C2718z4.f9432a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 17:
                        i11 = iHashCode * 53;
                        Object objM11246j2 = C2446a7.m11246j(obj, j10);
                        if (objM11246j2 != null) {
                            iHashCode2 = objM11246j2.hashCode();
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
                        iFloatToIntBits = C2446a7.m11246j(obj, j10).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 50:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = C2446a7.m11246j(obj, j10).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                }
            }
        }
        int i13 = this.f8912i;
        while (true) {
            int[] iArr = this.f8910g;
            if (i13 >= iArr.length) {
                int iHashCode3 = (iHashCode * 53) + ((AbstractC2652t4) obj).zzc.hashCode();
                return this.f8909f ? (iHashCode3 * 53) + ((AbstractC2619q4) obj).zzb.f9063a.hashCode() : iHashCode3;
            }
            int i14 = iArr[i13];
            if (!m11229s(obj, 0, i14)) {
                iHashCode = (iHashCode * 53) + C2446a7.m11246j(obj, m11206C(i14) & 1048575).hashCode();
            }
            i13++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2522h6
    public final Object zze() {
        return ((AbstractC2652t4) this.f8908e).m11758u();
    }
}
