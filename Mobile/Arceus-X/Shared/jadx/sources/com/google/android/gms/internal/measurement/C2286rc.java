package com.google.android.gms.internal.measurement;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.rc */
/* JADX INFO: loaded from: classes.dex */
public final class C2286rc<T> implements InterfaceC2430zc<T> {

    /* JADX INFO: renamed from: l */
    public static final int[] f8613l = new int[0];

    /* JADX INFO: renamed from: m */
    public static final Unsafe f8614m = C2305sd.m10747v();

    /* JADX INFO: renamed from: a */
    public final int[] f8615a;

    /* JADX INFO: renamed from: b */
    public final Object[] f8616b;

    /* JADX INFO: renamed from: c */
    public final int f8617c;

    /* JADX INFO: renamed from: d */
    public final int f8618d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2232oc f8619e;

    /* JADX INFO: renamed from: f */
    public final boolean f8620f;

    /* JADX INFO: renamed from: g */
    public final int[] f8621g;

    /* JADX INFO: renamed from: h */
    public final int f8622h;

    /* JADX INFO: renamed from: i */
    public final int f8623i;

    /* JADX INFO: renamed from: j */
    public final AbstractC2179ld f8624j;

    /* JADX INFO: renamed from: k */
    public final AbstractC2302sa f8625k;

    public C2286rc(int[] iArr, Object[] objArr, int i10, int i11, InterfaceC2232oc interfaceC2232oc, boolean z10, int[] iArr2, int i12, int i13, C2322tc c2322tc, C2429zb c2429zb, AbstractC2179ld abstractC2179ld, AbstractC2302sa abstractC2302sa, C2142jc c2142jc) {
        this.f8615a = iArr;
        this.f8616b = objArr;
        this.f8617c = i10;
        this.f8618d = i11;
        boolean z11 = false;
        if (abstractC2302sa != null && (interfaceC2232oc instanceof AbstractC2029db)) {
            z11 = true;
        }
        this.f8620f = z11;
        this.f8621g = iArr2;
        this.f8622h = i12;
        this.f8623i = i13;
        this.f8624j = abstractC2179ld;
        this.f8625k = abstractC2302sa;
        this.f8619e = interfaceC2232oc;
    }

    /* JADX INFO: renamed from: J */
    public static boolean m10631J(Object obj, int i10, InterfaceC2430zc interfaceC2430zc) {
        return interfaceC2430zc.mo10656a(C2305sd.m10744s(obj, i10 & 1048575));
    }

    /* JADX INFO: renamed from: M */
    public static int m10632M(int i10) {
        return (i10 >>> 20) & 255;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m10633g(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC2086gb) {
            return ((AbstractC2086gb) obj).m10069k();
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static void m10634h(Object obj) {
        if (!m10633g(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    /* JADX INFO: renamed from: i */
    public static double m10635i(Object obj, long j10) {
        return ((Double) C2305sd.m10744s(obj, j10)).doubleValue();
    }

    /* JADX INFO: renamed from: j */
    public static float m10636j(Object obj, long j10) {
        return ((Float) C2305sd.m10744s(obj, j10)).floatValue();
    }

    /* JADX INFO: renamed from: k */
    public static int m10637k(Object obj, long j10) {
        return ((Integer) C2305sd.m10744s(obj, j10)).intValue();
    }

    /* JADX INFO: renamed from: l */
    public static long m10638l(Object obj, long j10) {
        return ((Long) C2305sd.m10744s(obj, j10)).longValue();
    }

    /* JADX INFO: renamed from: m */
    public static boolean m10639m(Object obj, long j10) {
        return ((Boolean) C2305sd.m10744s(obj, j10)).booleanValue();
    }

    /* JADX INFO: renamed from: u */
    public static final int m10640u(byte[] bArr, int i10, int i11, EnumC2377wd enumC2377wd, Class cls, C2355v9 c2355v9) {
        EnumC2377wd enumC2377wd2 = EnumC2377wd.f8743c;
        switch (enumC2377wd.ordinal()) {
            case 0:
                int i12 = i10 + 8;
                c2355v9.f8716c = Double.valueOf(Double.longBitsToDouble(C2373w9.m10924e(bArr, i10)));
                return i12;
            case 1:
                int i13 = i10 + 4;
                c2355v9.f8716c = Float.valueOf(Float.intBitsToFloat(C2373w9.m10923d(bArr, i10)));
                return i13;
            case 2:
            case 3:
                int iM10922c = C2373w9.m10922c(bArr, i10, c2355v9);
                c2355v9.f8716c = Long.valueOf(c2355v9.f8715b);
                return iM10922c;
            case 4:
            case 12:
            case 13:
                int iM10920a = C2373w9.m10920a(bArr, i10, c2355v9);
                c2355v9.f8716c = Integer.valueOf(c2355v9.f8714a);
                return iM10920a;
            case 5:
            case 15:
                int i14 = i10 + 8;
                c2355v9.f8716c = Long.valueOf(C2373w9.m10924e(bArr, i10));
                return i14;
            case 6:
            case 14:
                int i15 = i10 + 4;
                c2355v9.f8716c = Integer.valueOf(C2373w9.m10923d(bArr, i10));
                return i15;
            case 7:
                int iM10922c2 = C2373w9.m10922c(bArr, i10, c2355v9);
                c2355v9.f8716c = Boolean.valueOf(c2355v9.f8715b != 0);
                return iM10922c2;
            case 8:
                return C2373w9.m10925f(bArr, i10, c2355v9);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return C2373w9.m10927h(C2376wc.m10951a().m10952b(cls), bArr, i10, i11, c2355v9);
            case 11:
                return C2373w9.m10926g(bArr, i10, c2355v9);
            case 16:
                int iM10920a2 = C2373w9.m10920a(bArr, i10, c2355v9);
                c2355v9.f8716c = Integer.valueOf(C2140ja.m10301a(c2355v9.f8714a));
                return iM10920a2;
            case 17:
                int iM10922c3 = C2373w9.m10922c(bArr, i10, c2355v9);
                c2355v9.f8716c = Long.valueOf(C2140ja.m10302b(c2355v9.f8715b));
                return iM10922c3;
        }
    }

    /* JADX INFO: renamed from: v */
    public static final void m10641v(int i10, Object obj, InterfaceC2413yd interfaceC2413yd) {
        if (obj instanceof String) {
            interfaceC2413yd.mo10460p(i10, (String) obj);
        } else {
            interfaceC2413yd.mo10466v(i10, (AbstractC2104ha) obj);
        }
    }

    /* JADX INFO: renamed from: w */
    public static C2197md m10642w(Object obj) {
        AbstractC2086gb abstractC2086gb = (AbstractC2086gb) obj;
        C2197md c2197md = abstractC2086gb.zzc;
        if (c2197md != C2197md.m10389a()) {
            return c2197md;
        }
        C2197md c2197mdM10390b = C2197md.m10390b();
        abstractC2086gb.zzc = c2197mdM10390b;
        return c2197mdM10390b;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x026e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0274  */
    /* JADX WARN: Code duplicated, block: B:131:0x028c  */
    /* JADX WARN: Code duplicated, block: B:132:0x028f  */
    /* JADX WARN: Code duplicated, block: B:171:0x0350  */
    /* JADX WARN: Code duplicated, block: B:187:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:190:0x03b0  */
    /* JADX INFO: renamed from: y */
    public static C2286rc m10643y(Class cls, InterfaceC2178lc interfaceC2178lc, C2322tc c2322tc, C2429zb c2429zb, AbstractC2179ld abstractC2179ld, AbstractC2302sa abstractC2302sa, C2142jc c2142jc) {
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
        Field fieldM10644z;
        char cCharAt9;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        Object obj;
        Field fieldM10644z2;
        int i36;
        Object obj2;
        Field fieldM10644z3;
        int i37;
        char cCharAt10;
        int i38;
        char cCharAt11;
        int i39;
        char cCharAt12;
        int i40;
        char cCharAt13;
        if (!(interfaceC2178lc instanceof C2412yc)) {
            throw null;
        }
        C2412yc c2412yc = (C2412yc) interfaceC2178lc;
        String strM11025a = c2412yc.m11025a();
        int length = strM11025a.length();
        char c11 = 55296;
        if (strM11025a.charAt(0) >= 55296) {
            int i41 = 1;
            while (true) {
                i10 = i41 + 1;
                if (strM11025a.charAt(i41) < 55296) {
                    break;
                }
                i41 = i10;
            }
        } else {
            i10 = 1;
        }
        int i42 = i10 + 1;
        int iCharAt2 = strM11025a.charAt(i10);
        if (iCharAt2 >= 55296) {
            int i43 = iCharAt2 & 8191;
            int i44 = 13;
            while (true) {
                i40 = i42 + 1;
                cCharAt13 = strM11025a.charAt(i42);
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
            iArr = f8613l;
            i16 = 0;
        } else {
            int i45 = i42 + 1;
            int iCharAt3 = strM11025a.charAt(i42);
            if (iCharAt3 >= 55296) {
                int i46 = iCharAt3 & 8191;
                int i47 = 13;
                while (true) {
                    i24 = i45 + 1;
                    cCharAt8 = strM11025a.charAt(i45);
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
            int iCharAt4 = strM11025a.charAt(i45);
            if (iCharAt4 >= 55296) {
                int i49 = iCharAt4 & 8191;
                int i50 = 13;
                while (true) {
                    i23 = i48 + 1;
                    cCharAt7 = strM11025a.charAt(i48);
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
            int iCharAt5 = strM11025a.charAt(i48);
            if (iCharAt5 >= 55296) {
                int i52 = iCharAt5 & 8191;
                int i53 = 13;
                while (true) {
                    i22 = i51 + 1;
                    cCharAt6 = strM11025a.charAt(i51);
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
            int iCharAt6 = strM11025a.charAt(i51);
            if (iCharAt6 >= 55296) {
                int i55 = iCharAt6 & 8191;
                int i56 = 13;
                while (true) {
                    i21 = i54 + 1;
                    cCharAt5 = strM11025a.charAt(i54);
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
            iCharAt = strM11025a.charAt(i54);
            if (iCharAt >= 55296) {
                int i58 = iCharAt & 8191;
                int i59 = 13;
                while (true) {
                    i20 = i57 + 1;
                    cCharAt4 = strM11025a.charAt(i57);
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
            int iCharAt7 = strM11025a.charAt(i57);
            if (iCharAt7 >= 55296) {
                int i61 = iCharAt7 & 8191;
                int i62 = 13;
                while (true) {
                    i19 = i60 + 1;
                    cCharAt3 = strM11025a.charAt(i60);
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
            int iCharAt8 = strM11025a.charAt(i60);
            if (iCharAt8 >= 55296) {
                int i64 = iCharAt8 & 8191;
                int i65 = 13;
                while (true) {
                    i18 = i63 + 1;
                    cCharAt2 = strM11025a.charAt(i63);
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
            int iCharAt9 = strM11025a.charAt(i63);
            if (iCharAt9 >= 55296) {
                int i67 = iCharAt9 & 8191;
                int i68 = 13;
                while (true) {
                    i17 = i66 + 1;
                    cCharAt = strM11025a.charAt(i66);
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
        Unsafe unsafe = f8614m;
        Object[] objArrM11026b = c2412yc.m11026b();
        Class<?> cls2 = c2412yc.zzb().getClass();
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
            int iCharAt10 = strM11025a.charAt(i42);
            if (iCharAt10 >= c11) {
                int i78 = iCharAt10 & 8191;
                int i79 = i77;
                int i80 = 13;
                while (true) {
                    i39 = i79 + 1;
                    cCharAt12 = strM11025a.charAt(i79);
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
            int iCharAt11 = strM11025a.charAt(i25);
            if (iCharAt11 >= c11) {
                int i82 = iCharAt11 & 8191;
                int i83 = i81;
                int i84 = 13;
                while (true) {
                    i38 = i83 + 1;
                    cCharAt11 = strM11025a.charAt(i83);
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
            if ((iCharAt11 & 1024) != 0) {
                iArr[i75] = i76;
                i75++;
            }
            int i85 = iCharAt11 & 255;
            C2412yc c2412yc2 = c2412yc;
            int i86 = iCharAt11 & 2048;
            if (i85 >= 51) {
                int i87 = i26 + 1;
                int iCharAt12 = strM11025a.charAt(i26);
                char c12 = 55296;
                if (iCharAt12 >= 55296) {
                    int i88 = iCharAt12 & 8191;
                    int i89 = i87;
                    int i90 = 13;
                    while (true) {
                        i37 = i89 + 1;
                        cCharAt10 = strM11025a.charAt(i89);
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
                    objArr[i93 + i93 + 1] = objArrM11026b[i15];
                } else {
                    if (i92 != 12) {
                        i34 = i86;
                    } else if (c2412yc2.zzc() == 1 || i86 != 0) {
                        i33 = i15 + 1;
                        int i94 = i76 / 3;
                        objArr[i94 + i94 + 1] = objArrM11026b[i15];
                    } else {
                        i34 = 0;
                    }
                    i35 = iCharAt12 + iCharAt12;
                    obj = objArrM11026b[i35];
                    int i95 = i34;
                    if (obj instanceof Field) {
                        fieldM10644z2 = (Field) obj;
                    } else {
                        fieldM10644z2 = m10644z(cls2, (String) obj);
                        objArrM11026b[i35] = fieldM10644z2;
                    }
                    int i96 = i16;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM10644z2);
                    i36 = i35 + 1;
                    obj2 = objArrM11026b[i36];
                    i27 = i96;
                    if (obj2 instanceof Field) {
                        fieldM10644z3 = (Field) obj2;
                    } else {
                        fieldM10644z3 = m10644z(cls2, (String) obj2);
                        objArrM11026b[i36] = fieldM10644z3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM10644z3);
                    strM11025a = strM11025a;
                    i29 = i95;
                    i26 = i91;
                    i28 = 0;
                    c10 = 55296;
                }
                i15 = i33;
                i34 = i86;
                i35 = iCharAt12 + iCharAt12;
                obj = objArrM11026b[i35];
                int i97 = i34;
                if (obj instanceof Field) {
                    fieldM10644z2 = (Field) obj;
                } else {
                    fieldM10644z2 = m10644z(cls2, (String) obj);
                    objArrM11026b[i35] = fieldM10644z2;
                }
                int i98 = i16;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM10644z2);
                i36 = i35 + 1;
                obj2 = objArrM11026b[i36];
                i27 = i98;
                if (obj2 instanceof Field) {
                    fieldM10644z3 = (Field) obj2;
                } else {
                    fieldM10644z3 = m10644z(cls2, (String) obj2);
                    objArrM11026b[i36] = fieldM10644z3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM10644z3);
                strM11025a = strM11025a;
                i29 = i97;
                i26 = i91;
                i28 = 0;
                c10 = 55296;
            } else {
                i27 = i16;
                int i99 = i15 + 1;
                Field fieldM10644z4 = m10644z(cls2, (String) objArrM11026b[i15]);
                if (i85 == 9 || i85 == 17) {
                    int i100 = i76 / 3;
                    objArr[i100 + i100 + 1] = fieldM10644z4.getType();
                } else {
                    if (i85 != 27) {
                        if (i85 == 49) {
                            i15 += 2;
                            i31 = 1;
                        } else if (i85 == 12 || i85 == 30 || i85 == 44) {
                            if (c2412yc2.zzc() == 1 || i86 != 0) {
                                i15 += 2;
                                int i101 = i76 / 3;
                                objArr[i101 + i101 + 1] = objArrM11026b[i99];
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
                            objArr[i105] = objArrM11026b[i99];
                            if (i86 != 0) {
                                objArr[i105 + 1] = objArrM11026b[i102];
                                i15 += 3;
                                i73 = i103;
                            } else {
                                i15 = i102;
                                i73 = i103;
                                i86 = 0;
                            }
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM10644z4);
                        if ((iCharAt11 & 4096) != 0 || i85 > 17) {
                            c10 = 55296;
                            iObjectFieldOffset2 = 1048575;
                            i28 = 0;
                        } else {
                            int i106 = i26 + 1;
                            int iCharAt13 = strM11025a.charAt(i26);
                            if (iCharAt13 >= 55296) {
                                int i107 = iCharAt13 & 8191;
                                int i108 = 13;
                                while (true) {
                                    i30 = i106 + 1;
                                    cCharAt9 = strM11025a.charAt(i106);
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
                            Object obj3 = objArrM11026b[i109];
                            if (obj3 instanceof Field) {
                                fieldM10644z = (Field) obj3;
                            } else {
                                fieldM10644z = m10644z(cls2, (String) obj3);
                                objArrM11026b[i109] = fieldM10644z;
                            }
                            int i110 = iCharAt13;
                            int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM10644z);
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
                    objArr[i111 + i111 + i31] = objArrM11026b[i99];
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM10644z4);
                    if ((iCharAt11 & 4096) != 0) {
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
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM10644z4);
                if ((iCharAt11 & 4096) != 0) {
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
            iArr3[i112] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i29 != 0 ? EditorInfoCompat.IME_FLAG_FORCE_ASCII : 0) | (i85 << 20) | iObjectFieldOffset;
            i76 += 3;
            iArr3[i113] = (i28 << 20) | iObjectFieldOffset2;
            i42 = i26;
            strM11025a = strM11025a;
            c11 = c10;
            c2412yc = c2412yc2;
            length = length;
            i16 = i27;
        }
        return new C2286rc(iArr3, objArr, i11, i13, c2412yc.zzb(), false, iArr, i14, i71, c2322tc, c2429zb, abstractC2179ld, abstractC2302sa, c2142jc);
    }

    /* JADX INFO: renamed from: z */
    public static Field m10644z(Class cls, String str) {
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

    /* JADX INFO: renamed from: A */
    public final void m10645A(Object obj, Object obj2, int i10) {
        if (m10664p(obj2, i10)) {
            int iM10654K = m10654K(i10) & 1048575;
            Unsafe unsafe = f8614m;
            long j10 = iM10654K;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                int i11 = this.f8615a[i10];
                String string = obj2.toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 38 + string.length());
                sb2.append("Source subfield ");
                sb2.append(i11);
                sb2.append(" is present but null: ");
                sb2.append(string);
                throw new IllegalStateException(sb2.toString());
            }
            InterfaceC2430zc interfaceC2430zcM10647C = m10647C(i10);
            if (!m10664p(obj, i10)) {
                if (m10633g(object)) {
                    Object objZza = interfaceC2430zcM10647C.zza();
                    interfaceC2430zcM10647C.mo10657b(objZza, object);
                    unsafe.putObject(obj, j10, objZza);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                m10665q(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!m10633g(object2)) {
                Object objZza2 = interfaceC2430zcM10647C.zza();
                interfaceC2430zcM10647C.mo10657b(objZza2, object2);
                unsafe.putObject(obj, j10, objZza2);
                object2 = objZza2;
            }
            interfaceC2430zcM10647C.mo10657b(object2, object);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m10646B(Object obj, Object obj2, int i10) {
        int[] iArr = this.f8615a;
        int i11 = iArr[i10];
        if (m10666r(obj2, i11, i10)) {
            int iM10654K = m10654K(i10) & 1048575;
            Unsafe unsafe = f8614m;
            long j10 = iM10654K;
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
            InterfaceC2430zc interfaceC2430zcM10647C = m10647C(i10);
            if (!m10666r(obj, i11, i10)) {
                if (m10633g(object)) {
                    Object objZza = interfaceC2430zcM10647C.zza();
                    interfaceC2430zcM10647C.mo10657b(objZza, object);
                    unsafe.putObject(obj, j10, objZza);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                m10667s(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!m10633g(object2)) {
                Object objZza2 = interfaceC2430zcM10647C.zza();
                interfaceC2430zcM10647C.mo10657b(objZza2, object2);
                unsafe.putObject(obj, j10, objZza2);
                object2 = objZza2;
            }
            interfaceC2430zcM10647C.mo10657b(object2, object);
        }
    }

    /* JADX INFO: renamed from: C */
    public final InterfaceC2430zc m10647C(int i10) {
        Object[] objArr = this.f8616b;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        InterfaceC2430zc interfaceC2430zc = (InterfaceC2430zc) objArr[i12];
        if (interfaceC2430zc != null) {
            return interfaceC2430zc;
        }
        InterfaceC2430zc interfaceC2430zcM10952b = C2376wc.m10951a().m10952b((Class) objArr[i12 + 1]);
        objArr[i12] = interfaceC2430zcM10952b;
        return interfaceC2430zcM10952b;
    }

    /* JADX INFO: renamed from: D */
    public final Object m10648D(int i10) {
        int i11 = i10 / 3;
        return this.f8616b[i11 + i11];
    }

    /* JADX INFO: renamed from: E */
    public final InterfaceC2177lb m10649E(int i10) {
        int i11 = i10 / 3;
        return (InterfaceC2177lb) this.f8616b[i11 + i11 + 1];
    }

    /* JADX INFO: renamed from: F */
    public final Object m10650F(Object obj, int i10) {
        InterfaceC2430zc interfaceC2430zcM10647C = m10647C(i10);
        int iM10654K = m10654K(i10) & 1048575;
        if (!m10664p(obj, i10)) {
            return interfaceC2430zcM10647C.zza();
        }
        Object object = f8614m.getObject(obj, iM10654K);
        if (m10633g(object)) {
            return object;
        }
        Object objZza = interfaceC2430zcM10647C.zza();
        if (object != null) {
            interfaceC2430zcM10647C.mo10657b(objZza, object);
        }
        return objZza;
    }

    /* JADX INFO: renamed from: G */
    public final void m10651G(Object obj, int i10, Object obj2) {
        f8614m.putObject(obj, m10654K(i10) & 1048575, obj2);
        m10665q(obj, i10);
    }

    /* JADX INFO: renamed from: H */
    public final Object m10652H(Object obj, int i10, int i11) {
        InterfaceC2430zc interfaceC2430zcM10647C = m10647C(i11);
        if (!m10666r(obj, i10, i11)) {
            return interfaceC2430zcM10647C.zza();
        }
        Object object = f8614m.getObject(obj, m10654K(i11) & 1048575);
        if (m10633g(object)) {
            return object;
        }
        Object objZza = interfaceC2430zcM10647C.zza();
        if (object != null) {
            interfaceC2430zcM10647C.mo10657b(objZza, object);
        }
        return objZza;
    }

    /* JADX INFO: renamed from: I */
    public final void m10653I(Object obj, int i10, int i11, Object obj2) {
        f8614m.putObject(obj, m10654K(i11) & 1048575, obj2);
        m10667s(obj, i10, i11);
    }

    /* JADX INFO: renamed from: K */
    public final int m10654K(int i10) {
        return this.f8615a[i10 + 1];
    }

    /* JADX INFO: renamed from: L */
    public final int m10655L(int i10) {
        return this.f8615a[i10 + 2];
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00db  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e6 A[LOOP:2: B:53:0x00d5->B:58:0x00e6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00fc A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2430zc
    /* JADX INFO: renamed from: a */
    public final boolean mo10656a(Object obj) {
        int i10;
        int i11;
        List list;
        InterfaceC2430zc interfaceC2430zcM10647C;
        int i12;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (i14 < this.f8622h) {
            int[] iArr = this.f8621g;
            int[] iArr2 = this.f8615a;
            int i16 = iArr[i14];
            int i17 = iArr2[i16];
            int iM10654K = m10654K(i16);
            int i18 = iArr2[i16 + 2];
            int i19 = i18 & 1048575;
            int i20 = 1 << (i18 >>> 20);
            if (i19 != i15) {
                if (i19 != 1048575) {
                    i13 = f8614m.getInt(obj, i19);
                }
                i11 = i13;
                i10 = i19;
            } else {
                int i21 = i13;
                i10 = i15;
                i11 = i21;
            }
            if ((268435456 & iM10654K) != 0 && !m10663o(obj, i16, i10, i11, i20)) {
                return false;
            }
            int iM10632M = m10632M(iM10654K);
            if (iM10632M == 9 || iM10632M == 17) {
                if (m10663o(obj, i16, i10, i11, i20) && !m10631J(obj, iM10654K, m10647C(i16))) {
                    return false;
                }
            } else if (iM10632M == 27) {
                list = (List) C2305sd.m10744s(obj, iM10654K & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    interfaceC2430zcM10647C = m10647C(i16);
                    for (i12 = 0; i12 < list.size(); i12++) {
                        if (!interfaceC2430zcM10647C.mo10656a(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (iM10632M == 60 || iM10632M == 68) {
                if (m10666r(obj, i17, i16) && !m10631J(obj, iM10654K, m10647C(i16))) {
                    return false;
                }
            } else if (iM10632M == 49) {
                list = (List) C2305sd.m10744s(obj, iM10654K & 1048575);
                if (list.isEmpty()) {
                    interfaceC2430zcM10647C = m10647C(i16);
                    while (i12 < list.size()) {
                        if (!interfaceC2430zcM10647C.mo10656a(list.get(i12))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iM10632M != 50) {
                continue;
            } else {
                C2125ic c2125ic = (C2125ic) C2305sd.m10744s(obj, iM10654K & 1048575);
                if (!c2125ic.isEmpty() && ((C2106hc) m10648D(i16)).m10200e().f8205c.m10953a() == EnumC2395xd.MESSAGE) {
                    InterfaceC2430zc interfaceC2430zcM10952b = null;
                    for (Object obj2 : c2125ic.values()) {
                        if (interfaceC2430zcM10952b == null) {
                            interfaceC2430zcM10952b = C2376wc.m10951a().m10952b(obj2.getClass());
                        }
                        if (!interfaceC2430zcM10952b.mo10656a(obj2)) {
                            return false;
                        }
                    }
                }
            }
            i14++;
            i15 = i10;
            i13 = i11;
        }
        return !this.f8620f || ((AbstractC2029db) obj).zzb.m10949e();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2430zc
    /* JADX INFO: renamed from: b */
    public final void mo10657b(Object obj, Object obj2) {
        m10634h(obj);
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f8615a;
            if (i10 >= iArr.length) {
                C1993bd.m9804d(this.f8624j, obj, obj2);
                if (this.f8620f) {
                    C1993bd.m9803c(this.f8625k, obj, obj2);
                    return;
                }
                return;
            }
            int iM10654K = m10654K(i10);
            int i11 = 1048575 & iM10654K;
            int iM10632M = m10632M(iM10654K);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (iM10632M) {
                case 0:
                    if (m10664p(obj2, i10)) {
                        C2305sd.m10743r(obj, j10, C2305sd.m10742q(obj2, j10));
                        m10665q(obj, i10);
                    }
                    break;
                case 1:
                    if (m10664p(obj2, i10)) {
                        C2305sd.m10741p(obj, j10, C2305sd.m10740o(obj2, j10));
                        m10665q(obj, i10);
                    }
                    break;
                case 2:
                    if (m10664p(obj2, i10)) {
                        C2305sd.m10737l(obj, j10, C2305sd.m10736k(obj2, j10));
                        m10665q(obj, i10);
                    }
                    break;
                case 3:
                    if (m10664p(obj2, i10)) {
                        C2305sd.m10737l(obj, j10, C2305sd.m10736k(obj2, j10));
                        m10665q(obj, i10);
                    }
                    break;
                case 4:
                    if (m10664p(obj2, i10)) {
                        C2305sd.m10735j(obj, j10, C2305sd.m10734i(obj2, j10));
                        m10665q(obj, i10);
                    }
                    break;
                case 5:
                    if (m10664p(obj2, i10)) {
                        C2305sd.m10737l(obj, j10, C2305sd.m10736k(obj2, j10));
                        m10665q(obj, i10);
                    }
                    break;
                case 6:
                    if (m10664p(obj2, i10)) {
                        C2305sd.m10735j(obj, j10, C2305sd.m10734i(obj2, j10));
                        m10665q(obj, i10);
                    }
                    break;
                case 7:
                    if (m10664p(obj2, i10)) {
                        C2305sd.m10739n(obj, j10, C2305sd.m10738m(obj2, j10));
                        m10665q(obj, i10);
                    }
                    break;
                case 8:
                    if (m10664p(obj2, i10)) {
                        C2305sd.m10745t(obj, j10, C2305sd.m10744s(obj2, j10));
                        m10665q(obj, i10);
                    }
                    break;
                case 9:
                    m10645A(obj, obj2, i10);
                    break;
                case 10:
                    if (m10664p(obj2, i10)) {
                        C2305sd.m10745t(obj, j10, C2305sd.m10744s(obj2, j10));
                        m10665q(obj, i10);
                    }
                    break;
                case 11:
                    if (m10664p(obj2, i10)) {
                        C2305sd.m10735j(obj, j10, C2305sd.m10734i(obj2, j10));
                        m10665q(obj, i10);
                    }
                    break;
                case 12:
                    if (m10664p(obj2, i10)) {
                        C2305sd.m10735j(obj, j10, C2305sd.m10734i(obj2, j10));
                        m10665q(obj, i10);
                    }
                    break;
                case 13:
                    if (m10664p(obj2, i10)) {
                        C2305sd.m10735j(obj, j10, C2305sd.m10734i(obj2, j10));
                        m10665q(obj, i10);
                    }
                    break;
                case 14:
                    if (m10664p(obj2, i10)) {
                        C2305sd.m10737l(obj, j10, C2305sd.m10736k(obj2, j10));
                        m10665q(obj, i10);
                    }
                    break;
                case 15:
                    if (m10664p(obj2, i10)) {
                        C2305sd.m10735j(obj, j10, C2305sd.m10734i(obj2, j10));
                        m10665q(obj, i10);
                    }
                    break;
                case 16:
                    if (m10664p(obj2, i10)) {
                        C2305sd.m10737l(obj, j10, C2305sd.m10736k(obj2, j10));
                        m10665q(obj, i10);
                    }
                    break;
                case 17:
                    m10645A(obj, obj2, i10);
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
                    InterfaceC2249pb interfaceC2249pbMo9891v = (InterfaceC2249pb) C2305sd.m10744s(obj, j10);
                    InterfaceC2249pb interfaceC2249pb = (InterfaceC2249pb) C2305sd.m10744s(obj2, j10);
                    int size = interfaceC2249pbMo9891v.size();
                    int size2 = interfaceC2249pb.size();
                    if (size > 0 && size2 > 0) {
                        if (!interfaceC2249pbMo9891v.zza()) {
                            interfaceC2249pbMo9891v = interfaceC2249pbMo9891v.mo9891v(size2 + size);
                        }
                        interfaceC2249pbMo9891v.addAll(interfaceC2249pb);
                    }
                    if (size > 0) {
                        interfaceC2249pb = interfaceC2249pbMo9891v;
                    }
                    C2305sd.m10745t(obj, j10, interfaceC2249pb);
                    break;
                case 50:
                    AbstractC2179ld abstractC2179ld = C1993bd.f8114a;
                    C2305sd.m10745t(obj, j10, C2142jc.m10303a(C2305sd.m10744s(obj, j10), C2305sd.m10744s(obj2, j10)));
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
                    if (m10666r(obj2, i12, i10)) {
                        C2305sd.m10745t(obj, j10, C2305sd.m10744s(obj2, j10));
                        m10667s(obj, i12, i10);
                    }
                    break;
                case 60:
                    m10646B(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m10666r(obj2, i12, i10)) {
                        C2305sd.m10745t(obj, j10, C2305sd.m10744s(obj2, j10));
                        m10667s(obj, i12, i10);
                    }
                    break;
                case 68:
                    m10646B(obj, obj2, i10);
                    break;
            }
            i10 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2430zc
    /* JADX INFO: renamed from: c */
    public final void mo10658c(Object obj) {
        if (m10633g(obj)) {
            if (obj instanceof AbstractC2086gb) {
                AbstractC2086gb abstractC2086gb = (AbstractC2086gb) obj;
                abstractC2086gb.m10076r(Integer.MAX_VALUE);
                abstractC2086gb.zza = 0;
                abstractC2086gb.m10070l();
            }
            int[] iArr = this.f8615a;
            for (int i10 = 0; i10 < iArr.length; i10 += 3) {
                int iM10654K = m10654K(i10);
                int i11 = 1048575 & iM10654K;
                int iM10632M = m10632M(iM10654K);
                long j10 = i11;
                if (iM10632M != 9) {
                    if (iM10632M != 60 && iM10632M != 68) {
                        switch (iM10632M) {
                            case 17:
                                if (m10664p(obj, i10)) {
                                    m10647C(i10).mo10658c(f8614m.getObject(obj, j10));
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
                                ((InterfaceC2249pb) C2305sd.m10744s(obj, j10)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = f8614m;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((C2125ic) object).m10289e();
                                    unsafe.putObject(obj, j10, object);
                                }
                                break;
                        }
                    } else if (m10666r(obj, iArr[i10], i10)) {
                        m10647C(i10).mo10658c(f8614m.getObject(obj, j10));
                    }
                } else if (m10664p(obj, i10)) {
                    m10647C(i10).mo10658c(f8614m.getObject(obj, j10));
                }
            }
            this.f8624j.mo10365b(obj);
            if (this.f8620f) {
                this.f8625k.mo10719a(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2430zc
    /* JADX INFO: renamed from: d */
    public final void mo10659d(Object obj, byte[] bArr, int i10, int i11, C2355v9 c2355v9) {
        m10669x(obj, bArr, i10, i11, 0, c2355v9);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2430zc
    /* JADX INFO: renamed from: e */
    public final void mo10660e(Object obj, InterfaceC2413yd interfaceC2413yd) {
        Map.Entry entry;
        int i10;
        C2286rc<T> c2286rc = this;
        if (c2286rc.f8620f) {
            C2374wa c2374wa = ((AbstractC2029db) obj).zzb;
            if (c2374wa.f8737a.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) c2374wa.m10947c().next();
            }
        } else {
            entry = null;
        }
        int[] iArr = c2286rc.f8615a;
        Unsafe unsafe = f8614m;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < iArr.length) {
            int iM10654K = c2286rc.m10654K(i13);
            int iM10632M = m10632M(iM10654K);
            int i15 = iArr[i13];
            if (iM10632M <= 17) {
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
            long j10 = iM10654K & i11;
            switch (iM10632M) {
                case 0:
                    if (c2286rc.m10663o(obj, i13, i12, i14, i10)) {
                        interfaceC2413yd.mo10445a(i15, C2305sd.m10742q(obj, j10));
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    c2286rc = this;
                    break;
                case 1:
                    if (c2286rc.m10663o(obj, i13, i12, i14, i10)) {
                        interfaceC2413yd.mo10465u(i15, C2305sd.m10740o(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    c2286rc = this;
                    break;
                case 2:
                    if (c2286rc.m10663o(obj, i13, i12, i14, i10)) {
                        interfaceC2413yd.mo10455k(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    c2286rc = this;
                    break;
                case 3:
                    if (c2286rc.m10663o(obj, i13, i12, i14, i10)) {
                        interfaceC2413yd.mo10433A(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    c2286rc = this;
                    break;
                case 4:
                    if (c2286rc.m10663o(obj, i13, i12, i14, i10)) {
                        interfaceC2413yd.mo10449e(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    c2286rc = this;
                    break;
                case 5:
                    if (c2286rc.m10663o(obj, i13, i12, i14, i10)) {
                        interfaceC2413yd.mo10467w(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    c2286rc = this;
                    break;
                case 6:
                    if (c2286rc.m10663o(obj, i13, i12, i14, i10)) {
                        interfaceC2413yd.mo10448d(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    c2286rc = this;
                    break;
                case 7:
                    if (c2286rc.m10663o(obj, i13, i12, i14, i10)) {
                        interfaceC2413yd.mo10443K(i15, C2305sd.m10738m(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    c2286rc = this;
                    break;
                case 8:
                    if (c2286rc.m10663o(obj, i13, i12, i14, i10)) {
                        m10641v(i15, unsafe.getObject(obj, j10), interfaceC2413yd);
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    c2286rc = this;
                    break;
                case 9:
                    if (c2286rc.m10663o(obj, i13, i12, i14, i10)) {
                        interfaceC2413yd.mo10454j(i15, unsafe.getObject(obj, j10), c2286rc.m10647C(i13));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    c2286rc = this;
                    break;
                case 10:
                    if (c2286rc.m10663o(obj, i13, i12, i14, i10)) {
                        interfaceC2413yd.mo10466v(i15, (AbstractC2104ha) unsafe.getObject(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    c2286rc = this;
                    break;
                case 11:
                    if (c2286rc.m10663o(obj, i13, i12, i14, i10)) {
                        interfaceC2413yd.mo10437E(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    c2286rc = this;
                    break;
                case 12:
                    if (c2286rc.m10663o(obj, i13, i12, i14, i10)) {
                        interfaceC2413yd.mo10462r(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    c2286rc = this;
                    break;
                case 13:
                    if (c2286rc.m10663o(obj, i13, i12, i14, i10)) {
                        interfaceC2413yd.mo10452h(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    c2286rc = this;
                    break;
                case 14:
                    if (c2286rc.m10663o(obj, i13, i12, i14, i10)) {
                        interfaceC2413yd.mo10464t(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    c2286rc = this;
                    break;
                case 15:
                    if (c2286rc.m10663o(obj, i13, i12, i14, i10)) {
                        interfaceC2413yd.mo10439G(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    c2286rc = this;
                    break;
                case 16:
                    if (c2286rc.m10663o(obj, i13, i12, i14, i10)) {
                        interfaceC2413yd.mo10456l(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    c2286rc = this;
                    break;
                case 17:
                    if (c2286rc.m10663o(obj, i13, i12, i14, i10)) {
                        interfaceC2413yd.mo10463s(i15, unsafe.getObject(obj, j10), c2286rc.m10647C(i13));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    c2286rc = this;
                    break;
                case 18:
                    C1993bd.m9806f(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2413yd, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    c2286rc = this;
                    break;
                case 19:
                    C1993bd.m9807g(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2413yd, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    c2286rc = this;
                    break;
                case 20:
                    C1993bd.m9808h(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2413yd, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    c2286rc = this;
                    break;
                case 21:
                    C1993bd.m9809i(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2413yd, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    c2286rc = this;
                    break;
                case 22:
                    C1993bd.m9813m(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2413yd, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    c2286rc = this;
                    break;
                case 23:
                    C1993bd.m9811k(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2413yd, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    c2286rc = this;
                    break;
                case 24:
                    C1993bd.m9816p(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2413yd, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    c2286rc = this;
                    break;
                case 25:
                    C1993bd.m9819s(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2413yd, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    c2286rc = this;
                    break;
                case 26:
                    int i18 = iArr[i13];
                    List list = (List) unsafe.getObject(obj, j10);
                    AbstractC2179ld abstractC2179ld = C1993bd.f8114a;
                    if (list != null && !list.isEmpty()) {
                        interfaceC2413yd.mo10438F(i18, list);
                    }
                    break;
                case 27:
                    int i19 = iArr[i13];
                    List list2 = (List) unsafe.getObject(obj, j10);
                    InterfaceC2430zc interfaceC2430zcM10647C = c2286rc.m10647C(i13);
                    AbstractC2179ld abstractC2179ld2 = C1993bd.f8114a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i20 = 0; i20 < list2.size(); i20++) {
                            ((C2212na) interfaceC2413yd).mo10454j(i19, list2.get(i20), interfaceC2430zcM10647C);
                        }
                    }
                    break;
                case 28:
                    int i21 = iArr[i13];
                    List list3 = (List) unsafe.getObject(obj, j10);
                    AbstractC2179ld abstractC2179ld3 = C1993bd.f8114a;
                    if (list3 != null && !list3.isEmpty()) {
                        interfaceC2413yd.mo10436D(i21, list3);
                    }
                    break;
                case 29:
                    C1993bd.m9814n(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2413yd, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    c2286rc = this;
                    break;
                case 30:
                    C1993bd.m9818r(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2413yd, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    c2286rc = this;
                    break;
                case 31:
                    C1993bd.m9817q(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2413yd, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    c2286rc = this;
                    break;
                case 32:
                    C1993bd.m9812l(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2413yd, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    c2286rc = this;
                    break;
                case 33:
                    C1993bd.m9815o(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2413yd, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    c2286rc = this;
                    break;
                case 34:
                    C1993bd.m9810j(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2413yd, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    c2286rc = this;
                    break;
                case 35:
                    C1993bd.m9806f(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2413yd, true);
                    break;
                case 36:
                    C1993bd.m9807g(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2413yd, true);
                    break;
                case 37:
                    C1993bd.m9808h(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2413yd, true);
                    break;
                case 38:
                    C1993bd.m9809i(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2413yd, true);
                    break;
                case 39:
                    C1993bd.m9813m(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2413yd, true);
                    break;
                case 40:
                    C1993bd.m9811k(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2413yd, true);
                    break;
                case 41:
                    C1993bd.m9816p(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2413yd, true);
                    break;
                case 42:
                    C1993bd.m9819s(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2413yd, true);
                    break;
                case 43:
                    C1993bd.m9814n(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2413yd, true);
                    break;
                case 44:
                    C1993bd.m9818r(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2413yd, true);
                    break;
                case 45:
                    C1993bd.m9817q(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2413yd, true);
                    break;
                case 46:
                    C1993bd.m9812l(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2413yd, true);
                    break;
                case 47:
                    C1993bd.m9815o(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2413yd, true);
                    break;
                case 48:
                    C1993bd.m9810j(iArr[i13], (List) unsafe.getObject(obj, j10), interfaceC2413yd, true);
                    break;
                case 49:
                    int i22 = iArr[i13];
                    List list4 = (List) unsafe.getObject(obj, j10);
                    InterfaceC2430zc interfaceC2430zcM10647C2 = c2286rc.m10647C(i13);
                    AbstractC2179ld abstractC2179ld4 = C1993bd.f8114a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i23 = 0; i23 < list4.size(); i23++) {
                            ((C2212na) interfaceC2413yd).mo10463s(i22, list4.get(i23), interfaceC2430zcM10647C2);
                        }
                    }
                    break;
                case 50:
                    Object object = unsafe.getObject(obj, j10);
                    if (object != null) {
                        interfaceC2413yd.mo10453i(i15, ((C2106hc) c2286rc.m10648D(i13)).m10200e(), (C2125ic) object);
                    }
                    break;
                case 51:
                    if (c2286rc.m10666r(obj, i15, i13)) {
                        interfaceC2413yd.mo10445a(i15, m10635i(obj, j10));
                    }
                    break;
                case 52:
                    if (c2286rc.m10666r(obj, i15, i13)) {
                        interfaceC2413yd.mo10465u(i15, m10636j(obj, j10));
                    }
                    break;
                case 53:
                    if (c2286rc.m10666r(obj, i15, i13)) {
                        interfaceC2413yd.mo10455k(i15, m10638l(obj, j10));
                    }
                    break;
                case 54:
                    if (c2286rc.m10666r(obj, i15, i13)) {
                        interfaceC2413yd.mo10433A(i15, m10638l(obj, j10));
                    }
                    break;
                case 55:
                    if (c2286rc.m10666r(obj, i15, i13)) {
                        interfaceC2413yd.mo10449e(i15, m10637k(obj, j10));
                    }
                    break;
                case 56:
                    if (c2286rc.m10666r(obj, i15, i13)) {
                        interfaceC2413yd.mo10467w(i15, m10638l(obj, j10));
                    }
                    break;
                case 57:
                    if (c2286rc.m10666r(obj, i15, i13)) {
                        interfaceC2413yd.mo10448d(i15, m10637k(obj, j10));
                    }
                    break;
                case 58:
                    if (c2286rc.m10666r(obj, i15, i13)) {
                        interfaceC2413yd.mo10443K(i15, m10639m(obj, j10));
                    }
                    break;
                case 59:
                    if (c2286rc.m10666r(obj, i15, i13)) {
                        m10641v(i15, unsafe.getObject(obj, j10), interfaceC2413yd);
                    }
                    break;
                case 60:
                    if (c2286rc.m10666r(obj, i15, i13)) {
                        interfaceC2413yd.mo10454j(i15, unsafe.getObject(obj, j10), c2286rc.m10647C(i13));
                    }
                    break;
                case 61:
                    if (c2286rc.m10666r(obj, i15, i13)) {
                        interfaceC2413yd.mo10466v(i15, (AbstractC2104ha) unsafe.getObject(obj, j10));
                    }
                    break;
                case 62:
                    if (c2286rc.m10666r(obj, i15, i13)) {
                        interfaceC2413yd.mo10437E(i15, m10637k(obj, j10));
                    }
                    break;
                case 63:
                    if (c2286rc.m10666r(obj, i15, i13)) {
                        interfaceC2413yd.mo10462r(i15, m10637k(obj, j10));
                    }
                    break;
                case 64:
                    if (c2286rc.m10666r(obj, i15, i13)) {
                        interfaceC2413yd.mo10452h(i15, m10637k(obj, j10));
                    }
                    break;
                case 65:
                    if (c2286rc.m10666r(obj, i15, i13)) {
                        interfaceC2413yd.mo10464t(i15, m10638l(obj, j10));
                    }
                    break;
                case 66:
                    if (c2286rc.m10666r(obj, i15, i13)) {
                        interfaceC2413yd.mo10439G(i15, m10637k(obj, j10));
                    }
                    break;
                case 67:
                    if (c2286rc.m10666r(obj, i15, i13)) {
                        interfaceC2413yd.mo10456l(i15, m10638l(obj, j10));
                    }
                    break;
                case 68:
                    if (c2286rc.m10666r(obj, i15, i13)) {
                        interfaceC2413yd.mo10463s(i15, unsafe.getObject(obj, j10), c2286rc.m10647C(i13));
                    }
                    break;
            }
            i13 += 3;
            i11 = 1048575;
            c2286rc = this;
        }
        if (entry != null) {
            throw null;
        }
        ((AbstractC2086gb) obj).zzc.m10395g(interfaceC2413yd);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2430zc
    /* JADX INFO: renamed from: f */
    public final boolean mo10661f(Object obj, Object obj2) {
        boolean zM9802b;
        for (int i10 = 0; i10 < this.f8615a.length; i10 += 3) {
            int iM10654K = m10654K(i10);
            long j10 = iM10654K & 1048575;
            switch (m10632M(iM10654K)) {
                case 0:
                    if (!m10662n(obj, obj2, i10) || Double.doubleToLongBits(C2305sd.m10742q(obj, j10)) != Double.doubleToLongBits(C2305sd.m10742q(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!m10662n(obj, obj2, i10) || Float.floatToIntBits(C2305sd.m10740o(obj, j10)) != Float.floatToIntBits(C2305sd.m10740o(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!m10662n(obj, obj2, i10) || C2305sd.m10736k(obj, j10) != C2305sd.m10736k(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!m10662n(obj, obj2, i10) || C2305sd.m10736k(obj, j10) != C2305sd.m10736k(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!m10662n(obj, obj2, i10) || C2305sd.m10734i(obj, j10) != C2305sd.m10734i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!m10662n(obj, obj2, i10) || C2305sd.m10736k(obj, j10) != C2305sd.m10736k(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!m10662n(obj, obj2, i10) || C2305sd.m10734i(obj, j10) != C2305sd.m10734i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!m10662n(obj, obj2, i10) || C2305sd.m10738m(obj, j10) != C2305sd.m10738m(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!m10662n(obj, obj2, i10) || !C1993bd.m9802b(C2305sd.m10744s(obj, j10), C2305sd.m10744s(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!m10662n(obj, obj2, i10) || !C1993bd.m9802b(C2305sd.m10744s(obj, j10), C2305sd.m10744s(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!m10662n(obj, obj2, i10) || !C1993bd.m9802b(C2305sd.m10744s(obj, j10), C2305sd.m10744s(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!m10662n(obj, obj2, i10) || C2305sd.m10734i(obj, j10) != C2305sd.m10734i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!m10662n(obj, obj2, i10) || C2305sd.m10734i(obj, j10) != C2305sd.m10734i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!m10662n(obj, obj2, i10) || C2305sd.m10734i(obj, j10) != C2305sd.m10734i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!m10662n(obj, obj2, i10) || C2305sd.m10736k(obj, j10) != C2305sd.m10736k(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!m10662n(obj, obj2, i10) || C2305sd.m10734i(obj, j10) != C2305sd.m10734i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!m10662n(obj, obj2, i10) || C2305sd.m10736k(obj, j10) != C2305sd.m10736k(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!m10662n(obj, obj2, i10) || !C1993bd.m9802b(C2305sd.m10744s(obj, j10), C2305sd.m10744s(obj2, j10))) {
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
                    zM9802b = C1993bd.m9802b(C2305sd.m10744s(obj, j10), C2305sd.m10744s(obj2, j10));
                    break;
                case 50:
                    zM9802b = C1993bd.m9802b(C2305sd.m10744s(obj, j10), C2305sd.m10744s(obj2, j10));
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
                    long jM10655L = m10655L(i10) & 1048575;
                    if (C2305sd.m10734i(obj, jM10655L) != C2305sd.m10734i(obj2, jM10655L) || !C1993bd.m9802b(C2305sd.m10744s(obj, j10), C2305sd.m10744s(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zM9802b) {
                return false;
            }
        }
        if (!((AbstractC2086gb) obj).zzc.equals(((AbstractC2086gb) obj2).zzc)) {
            return false;
        }
        if (this.f8620f) {
            return ((AbstractC2029db) obj).zzb.equals(((AbstractC2029db) obj2).zzb);
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m10662n(Object obj, Object obj2, int i10) {
        return m10664p(obj, i10) == m10664p(obj2, i10);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m10663o(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return m10664p(obj, i10);
        }
        return (i12 & i13) != 0;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m10664p(Object obj, int i10) {
        int iM10655L = m10655L(i10);
        long j10 = iM10655L & 1048575;
        if (j10 != 1048575) {
            return (C2305sd.m10734i(obj, j10) & (1 << (iM10655L >>> 20))) != 0;
        }
        int iM10654K = m10654K(i10);
        long j11 = iM10654K & 1048575;
        switch (m10632M(iM10654K)) {
            case 0:
                return Double.doubleToRawLongBits(C2305sd.m10742q(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(C2305sd.m10740o(obj, j11)) != 0;
            case 2:
                return C2305sd.m10736k(obj, j11) != 0;
            case 3:
                return C2305sd.m10736k(obj, j11) != 0;
            case 4:
                return C2305sd.m10734i(obj, j11) != 0;
            case 5:
                return C2305sd.m10736k(obj, j11) != 0;
            case 6:
                return C2305sd.m10734i(obj, j11) != 0;
            case 7:
                return C2305sd.m10738m(obj, j11);
            case 8:
                Object objM10744s = C2305sd.m10744s(obj, j11);
                if (objM10744s instanceof String) {
                    return !((String) objM10744s).isEmpty();
                }
                if (objM10744s instanceof AbstractC2104ha) {
                    return !AbstractC2104ha.f8218b.equals(objM10744s);
                }
                throw new IllegalArgumentException();
            case 9:
                return C2305sd.m10744s(obj, j11) != null;
            case 10:
                return !AbstractC2104ha.f8218b.equals(C2305sd.m10744s(obj, j11));
            case 11:
                return C2305sd.m10734i(obj, j11) != 0;
            case 12:
                return C2305sd.m10734i(obj, j11) != 0;
            case 13:
                return C2305sd.m10734i(obj, j11) != 0;
            case 14:
                return C2305sd.m10736k(obj, j11) != 0;
            case 15:
                return C2305sd.m10734i(obj, j11) != 0;
            case 16:
                return C2305sd.m10736k(obj, j11) != 0;
            case 17:
                return C2305sd.m10744s(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m10665q(Object obj, int i10) {
        int iM10655L = m10655L(i10);
        long j10 = 1048575 & iM10655L;
        if (j10 == 1048575) {
            return;
        }
        C2305sd.m10735j(obj, j10, (1 << (iM10655L >>> 20)) | C2305sd.m10734i(obj, j10));
    }

    /* JADX INFO: renamed from: r */
    public final boolean m10666r(Object obj, int i10, int i11) {
        return C2305sd.m10734i(obj, (long) (m10655L(i11) & 1048575)) == i10;
    }

    /* JADX INFO: renamed from: s */
    public final void m10667s(Object obj, int i10, int i11) {
        C2305sd.m10735j(obj, m10655L(i11) & 1048575, i10);
    }

    /* JADX INFO: renamed from: t */
    public final int m10668t(int i10, int i11) {
        int[] iArr = this.f8615a;
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

    /* JADX DEBUG: Duplicate block (B:233:0x066a) to fix multi-entry loop: BACK_EDGE: B:233:0x066a -> B:234:0x066b */
    /* JADX DEBUG: Duplicate block (B:266:0x0720) to fix multi-entry loop: BACK_EDGE: B:266:0x0720 -> B:267:0x0721 */
    /* JADX DEBUG: Duplicate block (B:287:0x0780) to fix multi-entry loop: BACK_EDGE: B:287:0x0780 -> B:288:0x0782 */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 41981. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: x */
    public final int m10669x(java.lang.Object r35, byte[] r36, int r37, int r38, int r39, com.google.android.gms.internal.measurement.C2355v9 r40) {
        /*
            r34 = this;
            r1 = r34
            r3 = r35
            r4 = r36
            r5 = r38
            r7 = r40
            m10634h(r3)
            sun.misc.Unsafe r2 = com.google.android.gms.internal.measurement.C2286rc.f8614m
            r11 = 0
            r6 = r37
            r9 = r11
            r14 = r9
            r15 = r14
            r8 = -1
            r10 = 1048575(0xfffff, float:1.469367E-39)
        L19:
            r16 = 1048575(0xfffff, float:1.469367E-39)
        L1c:
            java.lang.String r13 = "Failed to parse the message."
            r17 = 0
            r37 = 3
            if (r6 >= r5) goto Lef0
            int r15 = r6 + 1
            r6 = r4[r6]
            if (r6 >= 0) goto L30
            int r15 = com.google.android.gms.internal.measurement.C2373w9.m10921b(r6, r4, r15, r7)
            int r6 = r7.f8714a
        L30:
            r7 = r15
            r15 = r6
            int r6 = r15 >>> 3
            if (r6 <= r8) goto L46
            int r9 = r9 / 3
            int r8 = r1.f8617c
            if (r6 < r8) goto L53
            int r8 = r1.f8618d
            if (r6 > r8) goto L53
            int r8 = r1.m10668t(r6, r9)
        L44:
            r9 = -1
            goto L55
        L46:
            int r8 = r1.f8617c
            if (r6 < r8) goto L53
            int r8 = r1.f8618d
            if (r6 > r8) goto L53
            int r8 = r1.m10668t(r6, r11)
            goto L44
        L53:
            r8 = -1
            goto L44
        L55:
            if (r8 != r9) goto L6b
            r1 = r39
            r0 = r2
            r18 = r9
            r19 = r10
            r9 = r11
            r26 = r13
            r22 = r14
            r10 = r40
            r14 = r3
            r3 = r4
            r11 = r6
            r4 = r7
            goto Le8e
        L6b:
            r9 = r15 & 7
            int[] r11 = r1.f8615a
            int r19 = r8 + 1
            r12 = r11[r19]
            int r4 = m10632M(r12)
            r5 = r12 & r16
            r19 = r6
            long r5 = (long) r5
            r21 = r5
            r23 = 536870912(0x20000000, float:1.0842022E-19)
            r24 = 0
            java.lang.String r6 = ""
            java.lang.String r5 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            r27 = r11
            r11 = 17
            r28 = 1
            if (r4 > r11) goto L3bb
            int r11 = r8 + 2
            r11 = r27[r11]
            int r26 = r11 >>> 20
            int r26 = r28 << r26
            r11 = r11 & r16
            r29 = r7
            if (r11 == r10) goto Lb4
            r7 = r16
            r30 = r8
            if (r10 == r7) goto La9
            long r7 = (long) r10
            r2.putInt(r3, r7, r14)
            r7 = 1048575(0xfffff, float:1.469367E-39)
        La9:
            if (r11 != r7) goto Lad
            r7 = 0
            goto Lb2
        Lad:
            long r7 = (long) r11
            int r7 = r2.getInt(r3, r7)
        Lb2:
            r14 = r7
            goto Lb7
        Lb4:
            r30 = r8
            r11 = r10
        Lb7:
            switch(r4) {
                case 0: goto L382;
                case 1: goto L35b;
                case 2: goto L333;
                case 3: goto L333;
                case 4: goto L30c;
                case 5: goto L2ce;
                case 6: goto L2ad;
                case 7: goto L279;
                case 8: goto L21b;
                case 9: goto L1d1;
                case 10: goto L1b3;
                case 11: goto L30c;
                case 12: goto L169;
                case 13: goto L2ad;
                case 14: goto L2ce;
                case 15: goto L141;
                case 16: goto L101;
                default: goto Lba;
            }
        Lba:
            r4 = r37
            if (r9 != r4) goto Lf0
            r14 = r14 | r26
            r8 = r30
            java.lang.Object r4 = r1.m10650F(r3, r8)
            int r5 = r19 << 3
            r9 = r5 | 4
            com.google.android.gms.internal.measurement.zc r5 = r1.m10647C(r8)
            r6 = r36
            r10 = r40
            r12 = r8
            r7 = r29
            r18 = -1
            r8 = r38
            int r5 = com.google.android.gms.internal.measurement.C2373w9.m10930k(r4, r5, r6, r7, r8, r9, r10)
            r8 = r6
            r1.m10651G(r3, r12, r4)
            r6 = r5
            r4 = r8
            r7 = r10
            r10 = r11
            r9 = r12
        Le6:
            r8 = r19
            r11 = 0
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r38
            goto L1c
        Lf0:
            r18 = -1
            r7 = r3
            r3 = r2
            r2 = r7
            r8 = r36
            r22 = r14
            r21 = r15
            r7 = r29
            r15 = r40
            goto L3a7
        L101:
            r8 = r36
            r10 = r40
            r5 = r29
            r12 = r30
            r18 = -1
            if (r9 != 0) goto L132
            r14 = r14 | r26
            int r9 = com.google.android.gms.internal.measurement.C2373w9.m10922c(r8, r5, r10)
            long r4 = r10.f8715b
            long r6 = com.google.android.gms.internal.measurement.C2140ja.m10302b(r4)
            r4 = r21
            r2.putLong(r3, r4, r6)
            r32 = r3
            r3 = r2
            r2 = r32
            r4 = r3
            r3 = r2
            r2 = r4
            r5 = r38
            r4 = r8
            r6 = r9
        L12a:
            r7 = r10
            r10 = r11
            r9 = r12
            r8 = r19
        L12f:
            r11 = 0
            goto L19
        L132:
            r32 = r3
            r3 = r2
            r2 = r32
        L137:
            r7 = r5
            r30 = r12
        L13a:
            r22 = r14
            r21 = r15
            r15 = r10
            goto L3a7
        L141:
            r5 = r3
            r3 = r2
            r2 = r5
            r8 = r36
            r10 = r40
            r6 = r21
            r5 = r29
            r12 = r30
            r18 = -1
            if (r9 != 0) goto L137
            r14 = r14 | r26
            int r4 = com.google.android.gms.internal.measurement.C2373w9.m10920a(r8, r5, r10)
            int r5 = r10.f8714a
            int r5 = com.google.android.gms.internal.measurement.C2140ja.m10301a(r5)
            r3.putInt(r2, r6, r5)
            r5 = r3
            r3 = r2
            r2 = r5
            r5 = r38
            r6 = r4
            r4 = r8
            goto L12a
        L169:
            r4 = r3
            r3 = r2
            r2 = r4
            r8 = r36
            r10 = r40
            r6 = r21
            r5 = r29
            r4 = r30
            r18 = -1
            if (r9 != 0) goto L1af
            int r5 = com.google.android.gms.internal.measurement.C2373w9.m10920a(r8, r5, r10)
            int r9 = r10.f8714a
            com.google.android.gms.internal.measurement.lb r13 = r1.m10649E(r4)
            r17 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = r12 & r17
            if (r12 == 0) goto L1a9
            if (r13 == 0) goto L1a9
            boolean r12 = r13.mo9761a(r9)
            if (r12 == 0) goto L193
            goto L1a9
        L193:
            com.google.android.gms.internal.measurement.md r6 = m10642w(r2)
            long r12 = (long) r9
            java.lang.Long r7 = java.lang.Long.valueOf(r12)
            r6.m10399k(r15, r7)
        L19f:
            r6 = r3
            r3 = r2
            r2 = r6
            r9 = r4
            r6 = r5
            r4 = r8
            r7 = r10
            r10 = r11
            goto Le6
        L1a9:
            r14 = r14 | r26
            r3.putInt(r2, r6, r9)
            goto L19f
        L1af:
            r30 = r4
            r7 = r5
            goto L13a
        L1b3:
            r4 = r3
            r3 = r2
            r2 = r4
            r8 = r36
            r10 = r40
            r6 = r21
            r5 = r29
            r4 = r30
            r12 = 2
            r18 = -1
            if (r9 != r12) goto L1af
            r14 = r14 | r26
            int r5 = com.google.android.gms.internal.measurement.C2373w9.m10926g(r8, r5, r10)
            java.lang.Object r9 = r10.f8716c
            r3.putObject(r2, r6, r9)
            goto L19f
        L1d1:
            r4 = r3
            r3 = r2
            r2 = r4
            r8 = r36
            r10 = r40
            r5 = r29
            r4 = r30
            r12 = 2
            r18 = -1
            if (r9 != r12) goto L20e
            r14 = r14 | r26
            r6 = r2
            java.lang.Object r2 = r1.m10650F(r6, r4)
            r7 = r3
            com.google.android.gms.internal.measurement.zc r3 = r1.m10647C(r4)
            r9 = r10
            r10 = r7
            r7 = r9
            r9 = r4
            r4 = r8
            r8 = r6
            r6 = r38
            int r3 = com.google.android.gms.internal.measurement.C2373w9.m10929j(r2, r3, r4, r5, r6, r7)
            r5 = r2
            r2 = r4
            r4 = r7
            r1.m10651G(r8, r9, r5)
            r5 = r38
            r6 = r3
            r3 = r8
            r8 = r19
        L205:
            r16 = 1048575(0xfffff, float:1.469367E-39)
        L208:
            r4 = r2
            r2 = r10
            r10 = r11
            r11 = 0
            goto L1c
        L20e:
            r7 = r8
            r8 = r2
            r2 = r7
            r7 = r5
            r21 = r8
            r8 = r2
            r2 = r21
            r30 = r4
            goto L13a
        L21b:
            r4 = r40
            r10 = r2
            r8 = r3
            r7 = r29
            r3 = 2
            r18 = -1
            r2 = r36
            r32 = r21
            r22 = r14
            r21 = r15
            r14 = r32
            if (r9 != r3) goto L272
            r3 = r12 & r23
            if (r3 == 0) goto L23d
            r3 = r22 | r26
            int r5 = com.google.android.gms.internal.measurement.C2373w9.m10925f(r2, r7, r4)
            r6 = r5
            r5 = r3
            goto L258
        L23d:
            int r3 = com.google.android.gms.internal.measurement.C2373w9.m10920a(r2, r7, r4)
            int r7 = r4.f8714a
            if (r7 < 0) goto L26c
            r5 = r22 | r26
            if (r7 != 0) goto L24d
            r4.f8716c = r6
        L24b:
            r6 = r3
            goto L258
        L24d:
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.measurement.C2267qb.f8595a
            r6.<init>(r2, r3, r7, r9)
            r4.f8716c = r6
            int r3 = r3 + r7
            goto L24b
        L258:
            java.lang.Object r3 = r4.f8716c
            r10.putObject(r8, r14, r3)
            r7 = r4
            r14 = r5
            r3 = r8
            r8 = r19
            r15 = r21
            r9 = r30
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r38
            goto L208
        L26c:
            com.google.android.gms.internal.measurement.sb r0 = new com.google.android.gms.internal.measurement.sb
            r0.<init>(r5)
            throw r0
        L272:
            r3 = r8
            r8 = r2
            r2 = r3
            r15 = r4
        L276:
            r3 = r10
            goto L3a7
        L279:
            r4 = r40
            r10 = r2
            r8 = r3
            r7 = r29
            r18 = -1
            r2 = r36
            r32 = r21
            r22 = r14
            r21 = r15
            r14 = r32
            if (r9 != 0) goto L272
            r3 = r22 | r26
            int r6 = com.google.android.gms.internal.measurement.C2373w9.m10922c(r2, r7, r4)
            long r12 = r4.f8715b
            int r5 = (r12 > r24 ? 1 : (r12 == r24 ? 0 : -1))
            if (r5 == 0) goto L29c
            r5 = r28
            goto L29d
        L29c:
            r5 = 0
        L29d:
            com.google.android.gms.internal.measurement.C2305sd.m10739n(r8, r14, r5)
        L2a0:
            r5 = r38
            r14 = r3
            r7 = r4
            r3 = r8
            r8 = r19
            r15 = r21
            r9 = r30
            goto L205
        L2ad:
            r4 = r40
            r10 = r2
            r8 = r3
            r7 = r29
            r3 = 5
            r18 = -1
            r2 = r36
            r32 = r21
            r22 = r14
            r21 = r15
            r14 = r32
            if (r9 != r3) goto L272
            int r6 = r7 + 4
            r3 = r22 | r26
            int r5 = com.google.android.gms.internal.measurement.C2373w9.m10923d(r2, r7)
            r10.putInt(r8, r14, r5)
            goto L2a0
        L2ce:
            r4 = r40
            r10 = r2
            r8 = r3
            r3 = r28
            r7 = r29
            r18 = -1
            r2 = r36
            r32 = r21
            r22 = r14
            r21 = r15
            r14 = r32
            if (r9 != r3) goto L306
            int r9 = r7 + 8
            r12 = r22 | r26
            long r6 = com.google.android.gms.internal.measurement.C2373w9.m10924e(r2, r7)
            r32 = r14
            r15 = r4
            r4 = r32
            r3 = r8
            r8 = r2
            r2 = r10
            r2.putLong(r3, r4, r6)
            r5 = r38
            r4 = r8
            r6 = r9
            r10 = r11
            r14 = r12
        L2fd:
            r7 = r15
            r8 = r19
            r15 = r21
        L302:
            r9 = r30
            goto L12f
        L306:
            r15 = r4
            r3 = r8
            r8 = r2
            r2 = r3
            goto L276
        L30c:
            r8 = r36
            r4 = r21
            r7 = r29
            r18 = -1
            r22 = r14
            r21 = r15
            r15 = r40
            if (r9 != 0) goto L32c
            r14 = r22 | r26
            int r6 = com.google.android.gms.internal.measurement.C2373w9.m10920a(r8, r7, r15)
            int r7 = r15.f8714a
            r2.putInt(r3, r4, r7)
        L327:
            r5 = r38
            r4 = r8
        L32a:
            r10 = r11
            goto L2fd
        L32c:
            r32 = r3
            r3 = r2
            r2 = r32
            goto L3a7
        L333:
            r8 = r36
            r4 = r21
            r7 = r29
            r18 = -1
            r22 = r14
            r21 = r15
            r15 = r40
            if (r9 != 0) goto L32c
            r14 = r22 | r26
            int r9 = com.google.android.gms.internal.measurement.C2373w9.m10922c(r8, r7, r15)
            long r6 = r15.f8715b
            r2.putLong(r3, r4, r6)
            r32 = r3
            r3 = r2
            r2 = r32
            r4 = r3
            r3 = r2
            r2 = r4
            r5 = r38
            r4 = r8
            r6 = r9
            goto L32a
        L35b:
            r4 = r3
            r3 = r2
            r2 = r4
            r8 = r36
            r4 = r21
            r7 = r29
            r6 = 5
            r18 = -1
            r22 = r14
            r21 = r15
            r15 = r40
            if (r9 != r6) goto L3a7
            int r6 = r7 + 4
            r14 = r22 | r26
            int r7 = com.google.android.gms.internal.measurement.C2373w9.m10923d(r8, r7)
            float r7 = java.lang.Float.intBitsToFloat(r7)
            com.google.android.gms.internal.measurement.C2305sd.m10741p(r2, r4, r7)
        L37e:
            r4 = r3
            r3 = r2
            r2 = r4
            goto L327
        L382:
            r4 = r3
            r3 = r2
            r2 = r4
            r8 = r36
            r4 = r21
            r6 = r28
            r7 = r29
            r18 = -1
            r22 = r14
            r21 = r15
            r15 = r40
            if (r9 != r6) goto L3a7
            int r6 = r7 + 8
            r14 = r22 | r26
            long r9 = com.google.android.gms.internal.measurement.C2373w9.m10924e(r8, r7)
            double r9 = java.lang.Double.longBitsToDouble(r9)
            com.google.android.gms.internal.measurement.C2305sd.m10743r(r2, r4, r9)
            goto L37e
        L3a7:
            r0 = r19
            r19 = r11
            r11 = r0
            r1 = r39
            r14 = r2
            r0 = r3
            r4 = r7
            r3 = r8
            r26 = r13
            r10 = r15
            r15 = r21
        L3b7:
            r9 = r30
            goto Le8e
        L3bb:
            r11 = r3
            r3 = r2
            r2 = r11
            r29 = r7
            r11 = r19
            r18 = -1
            r19 = r10
            r10 = r8
            r7 = r21
            r22 = r14
            r21 = r15
            r15 = r40
            r14 = 27
            if (r4 != r14) goto L42f
            r14 = 2
            if (r9 != r14) goto L41c
            java.lang.Object r4 = r3.getObject(r2, r7)
            com.google.android.gms.internal.measurement.pb r4 = (com.google.android.gms.internal.measurement.InterfaceC2249pb) r4
            boolean r5 = r4.zza()
            if (r5 != 0) goto L3f3
            int r5 = r4.size()
            if (r5 != 0) goto L3eb
            r5 = 10
            goto L3ec
        L3eb:
            int r5 = r5 + r5
        L3ec:
            com.google.android.gms.internal.measurement.pb r4 = r4.mo9891v(r5)
            r3.putObject(r2, r7, r4)
        L3f3:
            r7 = r4
            com.google.android.gms.internal.measurement.zc r2 = r1.m10647C(r10)
            r14 = r35
            r4 = r36
            r6 = r38
            r8 = r15
            r5 = r29
            r15 = r3
            r3 = r21
            int r2 = com.google.android.gms.internal.measurement.C2373w9.m10933n(r2, r3, r4, r5, r6, r7, r8)
            r5 = r38
            r7 = r40
            r6 = r2
            r9 = r10
            r8 = r11
            r2 = r15
            r10 = r19
            r11 = 0
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r15 = r3
            r3 = r14
            r14 = r22
            goto L1c
        L41c:
            r15 = r3
            r4 = r29
            r29 = r11
            r11 = r13
            r13 = r4
            r5 = r38
            r4 = r40
            r14 = r2
            r9 = r15
            r15 = r21
            r2 = r36
            goto Lbe9
        L42f:
            r14 = r2
            r15 = r3
            r3 = r21
            r2 = 49
            java.lang.String r3 = "Protocol message had invalid UTF-8."
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            if (r4 > r2) goto Lac3
            r26 = r13
            long r12 = (long) r12
            java.lang.Object r2 = r15.getObject(r14, r7)
            com.google.android.gms.internal.measurement.pb r2 = (com.google.android.gms.internal.measurement.InterfaceC2249pb) r2
            boolean r23 = r2.zza()
            if (r23 != 0) goto L45b
            int r23 = r2.size()
            r30 = r12
            int r12 = r23 + r23
            com.google.android.gms.internal.measurement.pb r2 = r2.mo9891v(r12)
            r15.putObject(r14, r7, r2)
        L459:
            r8 = r2
            goto L45e
        L45b:
            r30 = r12
            goto L459
        L45e:
            switch(r4) {
                case 18: goto La24;
                case 19: goto L9a8;
                case 20: goto L94e;
                case 21: goto L94e;
                case 22: goto L926;
                case 23: goto L8b9;
                case 24: goto L84d;
                case 25: goto L7da;
                case 26: goto L6ef;
                case 27: goto L6c3;
                case 28: goto L640;
                case 29: goto L926;
                case 30: goto L591;
                case 31: goto L84d;
                case 32: goto L8b9;
                case 33: goto L533;
                case 34: goto L4b3;
                case 35: goto La24;
                case 36: goto L9a8;
                case 37: goto L94e;
                case 38: goto L94e;
                case 39: goto L926;
                case 40: goto L8b9;
                case 41: goto L84d;
                case 42: goto L7da;
                case 43: goto L926;
                case 44: goto L591;
                case 45: goto L84d;
                case 46: goto L8b9;
                case 47: goto L533;
                case 48: goto L4b3;
                default: goto L461;
            }
        L461:
            r4 = 3
            if (r9 != r4) goto L4a0
            r0 = r21 & (-8)
            r6 = r0 | 4
            com.google.android.gms.internal.measurement.zc r2 = r1.m10647C(r10)
            r3 = r36
            r5 = r38
            r7 = r40
            r12 = r21
            r4 = r29
            int r0 = com.google.android.gms.internal.measurement.C2373w9.m10928i(r2, r3, r4, r5, r6, r7)
            r13 = r4
            java.lang.Object r4 = r7.f8716c
            r8.add(r4)
        L480:
            if (r0 >= r5) goto L494
            int r4 = com.google.android.gms.internal.measurement.C2373w9.m10920a(r3, r0, r7)
            int r9 = r7.f8714a
            if (r12 != r9) goto L494
            int r0 = com.google.android.gms.internal.measurement.C2373w9.m10928i(r2, r3, r4, r5, r6, r7)
            java.lang.Object r4 = r7.f8716c
            r8.add(r4)
            goto L480
        L494:
            r6 = r0
            r2 = r3
            r30 = r10
            r29 = r11
            r21 = r15
            r11 = r7
            r15 = r12
            goto Laa9
        L4a0:
            r2 = r21
            r21 = r15
            r15 = r2
            r2 = r36
            r5 = r38
            r30 = r10
            r13 = r29
            r29 = r11
            r11 = r40
            goto Laa8
        L4b3:
            r3 = r36
            r5 = r38
            r7 = r40
            r12 = r21
            r13 = r29
            r2 = 2
            if (r9 != r2) goto L4f7
            int r2 = com.google.android.gms.internal.measurement.C2373w9.f8735a
            com.google.android.gms.internal.measurement.cc r8 = (com.google.android.gms.internal.measurement.C2011cc) r8
            int r2 = com.google.android.gms.internal.measurement.C2373w9.m10920a(r3, r13, r7)
            int r4 = r7.f8714a
            int r4 = r4 + r2
        L4cb:
            if (r2 >= r4) goto L4e1
            int r2 = com.google.android.gms.internal.measurement.C2373w9.m10922c(r3, r2, r7)
            r21 = r15
            long r14 = r7.f8715b
            long r14 = com.google.android.gms.internal.measurement.C2140ja.m10302b(r14)
            r8.m9889c(r14)
            r14 = r35
            r15 = r21
            goto L4cb
        L4e1:
            r21 = r15
            if (r2 != r4) goto L4f1
        L4e5:
            r14 = r35
            r6 = r2
        L4e8:
            r2 = r3
            r30 = r10
            r29 = r11
            r15 = r12
        L4ee:
            r11 = r7
            goto Laa9
        L4f1:
            com.google.android.gms.internal.measurement.sb r2 = new com.google.android.gms.internal.measurement.sb
            r2.<init>(r0)
            throw r2
        L4f7:
            r21 = r15
            if (r9 != 0) goto L528
            int r0 = com.google.android.gms.internal.measurement.C2373w9.f8735a
            com.google.android.gms.internal.measurement.cc r8 = (com.google.android.gms.internal.measurement.C2011cc) r8
            int r0 = com.google.android.gms.internal.measurement.C2373w9.m10922c(r3, r13, r7)
            long r14 = r7.f8715b
            long r14 = com.google.android.gms.internal.measurement.C2140ja.m10302b(r14)
            r8.m9889c(r14)
        L50c:
            if (r0 >= r5) goto L524
            int r2 = com.google.android.gms.internal.measurement.C2373w9.m10920a(r3, r0, r7)
            int r4 = r7.f8714a
            if (r12 != r4) goto L524
            int r0 = com.google.android.gms.internal.measurement.C2373w9.m10922c(r3, r2, r7)
            long r14 = r7.f8715b
            long r14 = com.google.android.gms.internal.measurement.C2140ja.m10302b(r14)
            r8.m9889c(r14)
            goto L50c
        L524:
            r14 = r35
            r6 = r0
            goto L4e8
        L528:
            r14 = r35
            r2 = r3
            r30 = r10
            r29 = r11
            r15 = r12
        L530:
            r11 = r7
            goto Laa8
        L533:
            r3 = r36
            r5 = r38
            r7 = r40
            r12 = r21
            r13 = r29
            r14 = 2
            r21 = r15
            if (r9 != r14) goto L566
            int r2 = com.google.android.gms.internal.measurement.C2373w9.f8735a
            com.google.android.gms.internal.measurement.hb r8 = (com.google.android.gms.internal.measurement.C2105hb) r8
            int r2 = com.google.android.gms.internal.measurement.C2373w9.m10920a(r3, r13, r7)
            int r4 = r7.f8714a
            int r4 = r4 + r2
        L54d:
            if (r2 >= r4) goto L55d
            int r2 = com.google.android.gms.internal.measurement.C2373w9.m10920a(r3, r2, r7)
            int r6 = r7.f8714a
            int r6 = com.google.android.gms.internal.measurement.C2140ja.m10301a(r6)
            r8.m10195w(r6)
            goto L54d
        L55d:
            if (r2 != r4) goto L560
            goto L4e5
        L560:
            com.google.android.gms.internal.measurement.sb r2 = new com.google.android.gms.internal.measurement.sb
            r2.<init>(r0)
            throw r2
        L566:
            if (r9 != 0) goto L528
            int r0 = com.google.android.gms.internal.measurement.C2373w9.f8735a
            com.google.android.gms.internal.measurement.hb r8 = (com.google.android.gms.internal.measurement.C2105hb) r8
            int r0 = com.google.android.gms.internal.measurement.C2373w9.m10920a(r3, r13, r7)
            int r2 = r7.f8714a
            int r2 = com.google.android.gms.internal.measurement.C2140ja.m10301a(r2)
            r8.m10195w(r2)
        L579:
            if (r0 >= r5) goto L524
            int r2 = com.google.android.gms.internal.measurement.C2373w9.m10920a(r3, r0, r7)
            int r4 = r7.f8714a
            if (r12 != r4) goto L524
            int r0 = com.google.android.gms.internal.measurement.C2373w9.m10920a(r3, r2, r7)
            int r2 = r7.f8714a
            int r2 = com.google.android.gms.internal.measurement.C2140ja.m10301a(r2)
            r8.m10195w(r2)
            goto L579
        L591:
            r3 = r36
            r5 = r38
            r7 = r40
            r12 = r21
            r13 = r29
            r14 = 2
            r21 = r15
            if (r9 != r14) goto L5a8
            int r0 = com.google.android.gms.internal.measurement.C2373w9.m10932m(r3, r13, r8, r7)
            r2 = r12
            r4 = r13
        L5a6:
            r6 = r5
            goto L5b2
        L5a8:
            if (r9 != 0) goto L63c
            r6 = r8
            r2 = r12
            r4 = r13
            int r0 = com.google.android.gms.internal.measurement.C2373w9.m10931l(r2, r3, r4, r5, r6, r7)
            goto L5a6
        L5b2:
            com.google.android.gms.internal.measurement.lb r5 = r1.m10649E(r10)
            com.google.android.gms.internal.measurement.ld r9 = r1.f8624j
            com.google.android.gms.internal.measurement.ld r12 = com.google.android.gms.internal.measurement.C1993bd.f8114a
            if (r5 == 0) goto L629
            if (r8 == 0) goto L601
            int r12 = r8.size()
            r15 = r17
            r13 = 0
            r14 = 0
        L5c6:
            if (r13 >= r12) goto L5f3
            java.lang.Object r23 = r8.get(r13)
            r24 = r0
            r0 = r23
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r1 = r0.intValue()
            boolean r23 = r5.mo9761a(r1)
            if (r23 == 0) goto L5e6
            if (r13 == r14) goto L5e1
            r8.set(r14, r0)
        L5e1:
            int r14 = r14 + 1
            r0 = r35
            goto L5ec
        L5e6:
            r0 = r35
            java.lang.Object r15 = com.google.android.gms.internal.measurement.C1993bd.m9805e(r0, r11, r1, r15, r9)
        L5ec:
            int r13 = r13 + 1
            r1 = r34
            r0 = r24
            goto L5c6
        L5f3:
            r24 = r0
            r0 = r35
            if (r14 == r12) goto L62d
            java.util.List r1 = r8.subList(r14, r12)
            r1.clear()
            goto L62d
        L601:
            r24 = r0
            r0 = r35
            java.util.Iterator r1 = r8.iterator()
            r8 = r17
        L60b:
            boolean r12 = r1.hasNext()
            if (r12 == 0) goto L62d
            java.lang.Object r12 = r1.next()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            boolean r13 = r5.mo9761a(r12)
            if (r13 != 0) goto L60b
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C1993bd.m9805e(r0, r11, r12, r8, r9)
            r1.remove()
            goto L60b
        L629:
            r24 = r0
            r0 = r35
        L62d:
            r1 = r34
            r14 = r0
            r15 = r2
            r2 = r3
            r13 = r4
            r5 = r6
            r30 = r10
            r29 = r11
            r6 = r24
            goto L4ee
        L63c:
            r1 = r34
            goto L528
        L640:
            r3 = r36
            r6 = r38
            r7 = r40
            r2 = r21
            r4 = r29
            r12 = 2
            r21 = r15
            if (r9 != r12) goto L6b7
            int r1 = com.google.android.gms.internal.measurement.C2373w9.m10920a(r3, r4, r7)
            int r9 = r7.f8714a
            if (r9 < 0) goto L6b1
            int r12 = r3.length
            int r12 = r12 - r1
            if (r9 > r12) goto L6ab
            if (r9 != 0) goto L663
            com.google.android.gms.internal.measurement.ha r9 = com.google.android.gms.internal.measurement.AbstractC2104ha.f8218b
            r8.add(r9)
            goto L66b
        L663:
            com.google.android.gms.internal.measurement.ha r12 = com.google.android.gms.internal.measurement.AbstractC2104ha.m10185h(r3, r1, r9)
            r8.add(r12)
        L66a:
            int r1 = r1 + r9
        L66b:
            if (r1 >= r6) goto L69d
            int r9 = com.google.android.gms.internal.measurement.C2373w9.m10920a(r3, r1, r7)
            int r12 = r7.f8714a
            if (r2 != r12) goto L69d
            int r1 = com.google.android.gms.internal.measurement.C2373w9.m10920a(r3, r9, r7)
            int r9 = r7.f8714a
            if (r9 < 0) goto L697
            int r12 = r3.length
            int r12 = r12 - r1
            if (r9 > r12) goto L691
            if (r9 != 0) goto L689
            com.google.android.gms.internal.measurement.ha r9 = com.google.android.gms.internal.measurement.AbstractC2104ha.f8218b
            r8.add(r9)
            goto L66b
        L689:
            com.google.android.gms.internal.measurement.ha r12 = com.google.android.gms.internal.measurement.AbstractC2104ha.m10185h(r3, r1, r9)
            r8.add(r12)
            goto L66a
        L691:
            com.google.android.gms.internal.measurement.sb r1 = new com.google.android.gms.internal.measurement.sb
            r1.<init>(r0)
            throw r1
        L697:
            com.google.android.gms.internal.measurement.sb r0 = new com.google.android.gms.internal.measurement.sb
            r0.<init>(r5)
            throw r0
        L69d:
            r15 = r2
            r2 = r3
            r13 = r4
            r5 = r6
            r30 = r10
            r29 = r11
            r6 = r1
            r11 = r7
            r1 = r34
            goto Laa9
        L6ab:
            com.google.android.gms.internal.measurement.sb r1 = new com.google.android.gms.internal.measurement.sb
            r1.<init>(r0)
            throw r1
        L6b1:
            com.google.android.gms.internal.measurement.sb r0 = new com.google.android.gms.internal.measurement.sb
            r0.<init>(r5)
            throw r0
        L6b7:
            r1 = r34
            r15 = r2
            r2 = r3
            r13 = r4
            r5 = r6
            r30 = r10
            r29 = r11
            goto L530
        L6c3:
            r3 = r36
            r6 = r38
            r7 = r40
            r2 = r21
            r4 = r29
            r12 = 2
            r21 = r15
            if (r9 != r12) goto L6b7
            r1 = r34
            r3 = r2
            com.google.android.gms.internal.measurement.zc r2 = r1.m10647C(r10)
            r5 = r8
            r8 = r7
            r7 = r5
            r5 = r4
            r4 = r36
            int r0 = com.google.android.gms.internal.measurement.C2373w9.m10933n(r2, r3, r4, r5, r6, r7, r8)
            r15 = r3
            r2 = r4
            r13 = r5
            r5 = r6
            r30 = r10
            r29 = r11
            r6 = r0
            r11 = r8
            goto Laa9
        L6ef:
            r4 = r36
            r7 = r40
            r2 = r21
            r13 = r29
            r12 = 2
            r21 = r15
            r15 = r8
            r8 = r38
            if (r9 != r12) goto L7d0
            r27 = 536870912(0x20000000, double:2.652494739E-315)
            long r27 = r30 & r27
            int r0 = (r27 > r24 ? 1 : (r27 == r24 ? 0 : -1))
            if (r0 != 0) goto L75a
            int r0 = com.google.android.gms.internal.measurement.C2373w9.m10920a(r4, r13, r7)
            int r3 = r7.f8714a
            if (r3 < 0) goto L754
            if (r3 != 0) goto L716
            r15.add(r6)
            goto L721
        L716:
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r12 = com.google.android.gms.internal.measurement.C2267qb.f8595a
            r9.<init>(r4, r0, r3, r12)
            r15.add(r9)
        L720:
            int r0 = r0 + r3
        L721:
            if (r0 >= r8) goto L74a
            int r3 = com.google.android.gms.internal.measurement.C2373w9.m10920a(r4, r0, r7)
            int r9 = r7.f8714a
            if (r2 != r9) goto L74a
            int r0 = com.google.android.gms.internal.measurement.C2373w9.m10920a(r4, r3, r7)
            int r3 = r7.f8714a
            if (r3 < 0) goto L744
            if (r3 != 0) goto L739
            r15.add(r6)
            goto L721
        L739:
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r12 = com.google.android.gms.internal.measurement.C2267qb.f8595a
            r9.<init>(r4, r0, r3, r12)
            r15.add(r9)
            goto L720
        L744:
            com.google.android.gms.internal.measurement.sb r0 = new com.google.android.gms.internal.measurement.sb
            r0.<init>(r5)
            throw r0
        L74a:
            r6 = r0
            r15 = r2
            r2 = r4
            r5 = r8
            r30 = r10
            r29 = r11
            goto L4ee
        L754:
            com.google.android.gms.internal.measurement.sb r0 = new com.google.android.gms.internal.measurement.sb
            r0.<init>(r5)
            throw r0
        L75a:
            int r0 = com.google.android.gms.internal.measurement.C2373w9.m10920a(r4, r13, r7)
            int r9 = r7.f8714a
            if (r9 < 0) goto L7ca
            if (r9 != 0) goto L76a
            r15.add(r6)
            r29 = r11
            goto L782
        L76a:
            int r12 = r0 + r9
            boolean r23 = com.google.android.gms.internal.measurement.C2359vd.m10854a(r4, r0, r12)
            if (r23 == 0) goto L7c4
            r23 = r12
            java.lang.String r12 = new java.lang.String
            r29 = r11
            java.nio.charset.Charset r11 = com.google.android.gms.internal.measurement.C2267qb.f8595a
            r12.<init>(r4, r0, r9, r11)
            r15.add(r12)
        L780:
            r0 = r23
        L782:
            if (r0 >= r8) goto L7bb
            int r9 = com.google.android.gms.internal.measurement.C2373w9.m10920a(r4, r0, r7)
            int r11 = r7.f8714a
            if (r2 != r11) goto L7bb
            int r0 = com.google.android.gms.internal.measurement.C2373w9.m10920a(r4, r9, r7)
            int r9 = r7.f8714a
            if (r9 < 0) goto L7b5
            if (r9 != 0) goto L79a
            r15.add(r6)
            goto L782
        L79a:
            int r11 = r0 + r9
            boolean r12 = com.google.android.gms.internal.measurement.C2359vd.m10854a(r4, r0, r11)
            if (r12 == 0) goto L7af
            java.lang.String r12 = new java.lang.String
            r23 = r11
            java.nio.charset.Charset r11 = com.google.android.gms.internal.measurement.C2267qb.f8595a
            r12.<init>(r4, r0, r9, r11)
            r15.add(r12)
            goto L780
        L7af:
            com.google.android.gms.internal.measurement.sb r0 = new com.google.android.gms.internal.measurement.sb
            r0.<init>(r3)
            throw r0
        L7b5:
            com.google.android.gms.internal.measurement.sb r0 = new com.google.android.gms.internal.measurement.sb
            r0.<init>(r5)
            throw r0
        L7bb:
            r6 = r0
            r15 = r2
        L7bd:
            r2 = r4
        L7be:
            r11 = r7
            r5 = r8
        L7c0:
            r30 = r10
            goto Laa9
        L7c4:
            com.google.android.gms.internal.measurement.sb r0 = new com.google.android.gms.internal.measurement.sb
            r0.<init>(r3)
            throw r0
        L7ca:
            com.google.android.gms.internal.measurement.sb r0 = new com.google.android.gms.internal.measurement.sb
            r0.<init>(r5)
            throw r0
        L7d0:
            r29 = r11
        L7d2:
            r15 = r2
            r2 = r4
            r11 = r7
            r5 = r8
        L7d6:
            r30 = r10
            goto Laa8
        L7da:
            r4 = r36
            r7 = r40
            r2 = r21
            r13 = r29
            r12 = 2
            r29 = r11
            r21 = r15
            r15 = r8
            r8 = r38
            if (r9 != r12) goto L817
            int r3 = com.google.android.gms.internal.measurement.C2373w9.f8735a
            r3 = r15
            com.google.android.gms.internal.measurement.x9 r3 = (com.google.android.gms.internal.measurement.C2391x9) r3
            int r5 = com.google.android.gms.internal.measurement.C2373w9.m10920a(r4, r13, r7)
            int r6 = r7.f8714a
            int r6 = r6 + r5
        L7f8:
            if (r5 >= r6) goto L80b
            int r5 = com.google.android.gms.internal.measurement.C2373w9.m10922c(r4, r5, r7)
            long r11 = r7.f8715b
            int r9 = (r11 > r24 ? 1 : (r11 == r24 ? 0 : -1))
            if (r9 == 0) goto L806
            r9 = 1
            goto L807
        L806:
            r9 = 0
        L807:
            r3.m10977d(r9)
            goto L7f8
        L80b:
            if (r5 != r6) goto L811
        L80d:
            r15 = r2
            r2 = r4
            r6 = r5
            goto L7be
        L811:
            com.google.android.gms.internal.measurement.sb r2 = new com.google.android.gms.internal.measurement.sb
            r2.<init>(r0)
            throw r2
        L817:
            if (r9 != 0) goto L7d2
            int r0 = com.google.android.gms.internal.measurement.C2373w9.f8735a
            r0 = r15
            com.google.android.gms.internal.measurement.x9 r0 = (com.google.android.gms.internal.measurement.C2391x9) r0
            int r3 = com.google.android.gms.internal.measurement.C2373w9.m10922c(r4, r13, r7)
            long r5 = r7.f8715b
            int r5 = (r5 > r24 ? 1 : (r5 == r24 ? 0 : -1))
            if (r5 == 0) goto L82a
            r5 = 1
            goto L82b
        L82a:
            r5 = 0
        L82b:
            r0.m10977d(r5)
        L82e:
            if (r3 >= r8) goto L849
            int r5 = com.google.android.gms.internal.measurement.C2373w9.m10920a(r4, r3, r7)
            int r6 = r7.f8714a
            if (r2 != r6) goto L849
            int r3 = com.google.android.gms.internal.measurement.C2373w9.m10922c(r4, r5, r7)
            long r5 = r7.f8715b
            int r5 = (r5 > r24 ? 1 : (r5 == r24 ? 0 : -1))
            if (r5 == 0) goto L844
            r5 = 1
            goto L845
        L844:
            r5 = 0
        L845:
            r0.m10977d(r5)
            goto L82e
        L849:
            r15 = r2
            r6 = r3
            goto L7bd
        L84d:
            r4 = r36
            r7 = r40
            r2 = r21
            r13 = r29
            r12 = 2
            r29 = r11
            r21 = r15
            r15 = r8
            r8 = r38
            if (r9 != r12) goto L894
            int r3 = com.google.android.gms.internal.measurement.C2373w9.f8735a
            r3 = r15
            com.google.android.gms.internal.measurement.hb r3 = (com.google.android.gms.internal.measurement.C2105hb) r3
            int r5 = com.google.android.gms.internal.measurement.C2373w9.m10920a(r4, r13, r7)
            int r6 = r7.f8714a
            int r9 = r5 + r6
            int r11 = r4.length
            if (r9 > r11) goto L88e
            int r11 = r3.size()
            int r6 = r6 / 4
            int r11 = r11 + r6
            r3.m10192d(r11)
        L879:
            if (r5 >= r9) goto L885
            int r6 = com.google.android.gms.internal.measurement.C2373w9.m10923d(r4, r5)
            r3.m10195w(r6)
            int r5 = r5 + 4
            goto L879
        L885:
            if (r5 != r9) goto L888
            goto L80d
        L888:
            com.google.android.gms.internal.measurement.sb r2 = new com.google.android.gms.internal.measurement.sb
            r2.<init>(r0)
            throw r2
        L88e:
            com.google.android.gms.internal.measurement.sb r2 = new com.google.android.gms.internal.measurement.sb
            r2.<init>(r0)
            throw r2
        L894:
            r3 = 5
            if (r9 != r3) goto L7d2
            int r0 = r13 + 4
            int r3 = com.google.android.gms.internal.measurement.C2373w9.f8735a
            r3 = r15
            com.google.android.gms.internal.measurement.hb r3 = (com.google.android.gms.internal.measurement.C2105hb) r3
            int r5 = com.google.android.gms.internal.measurement.C2373w9.m10923d(r4, r13)
            r3.m10195w(r5)
        L8a5:
            if (r0 >= r8) goto L7bb
            int r5 = com.google.android.gms.internal.measurement.C2373w9.m10920a(r4, r0, r7)
            int r6 = r7.f8714a
            if (r2 != r6) goto L7bb
            int r0 = com.google.android.gms.internal.measurement.C2373w9.m10923d(r4, r5)
            r3.m10195w(r0)
            int r0 = r5 + 4
            goto L8a5
        L8b9:
            r4 = r36
            r7 = r40
            r2 = r21
            r13 = r29
            r12 = 2
            r29 = r11
            r21 = r15
            r15 = r8
            r8 = r38
            if (r9 != r12) goto L901
            int r3 = com.google.android.gms.internal.measurement.C2373w9.f8735a
            r3 = r15
            com.google.android.gms.internal.measurement.cc r3 = (com.google.android.gms.internal.measurement.C2011cc) r3
            int r5 = com.google.android.gms.internal.measurement.C2373w9.m10920a(r4, r13, r7)
            int r6 = r7.f8714a
            int r9 = r5 + r6
            int r11 = r4.length
            if (r9 > r11) goto L8fb
            int r11 = r3.size()
            int r6 = r6 / 8
            int r11 = r11 + r6
            r3.m9892w(r11)
        L8e5:
            if (r5 >= r9) goto L8f1
            long r11 = com.google.android.gms.internal.measurement.C2373w9.m10924e(r4, r5)
            r3.m9889c(r11)
            int r5 = r5 + 8
            goto L8e5
        L8f1:
            if (r5 != r9) goto L8f5
            goto L80d
        L8f5:
            com.google.android.gms.internal.measurement.sb r2 = new com.google.android.gms.internal.measurement.sb
            r2.<init>(r0)
            throw r2
        L8fb:
            com.google.android.gms.internal.measurement.sb r2 = new com.google.android.gms.internal.measurement.sb
            r2.<init>(r0)
            throw r2
        L901:
            r3 = 1
            if (r9 != r3) goto L7d2
            int r0 = r13 + 8
            int r3 = com.google.android.gms.internal.measurement.C2373w9.f8735a
            r3 = r15
            com.google.android.gms.internal.measurement.cc r3 = (com.google.android.gms.internal.measurement.C2011cc) r3
            long r5 = com.google.android.gms.internal.measurement.C2373w9.m10924e(r4, r13)
            r3.m9889c(r5)
        L912:
            if (r0 >= r8) goto L7bb
            int r5 = com.google.android.gms.internal.measurement.C2373w9.m10920a(r4, r0, r7)
            int r6 = r7.f8714a
            if (r2 != r6) goto L7bb
            long r11 = com.google.android.gms.internal.measurement.C2373w9.m10924e(r4, r5)
            r3.m9889c(r11)
            int r0 = r5 + 8
            goto L912
        L926:
            r4 = r36
            r7 = r40
            r2 = r21
            r13 = r29
            r12 = 2
            r29 = r11
            r21 = r15
            r15 = r8
            r8 = r38
            if (r9 != r12) goto L93e
            int r0 = com.google.android.gms.internal.measurement.C2373w9.m10932m(r4, r13, r15, r7)
            goto L7bb
        L93e:
            if (r9 != 0) goto L7d2
            r3 = r4
            r5 = r8
            r4 = r13
            r6 = r15
            int r0 = com.google.android.gms.internal.measurement.C2373w9.m10931l(r2, r3, r4, r5, r6, r7)
            r15 = r2
            r2 = r3
            r11 = r7
        L94b:
            r6 = r0
            goto L7c0
        L94e:
            r2 = r21
            r21 = r15
            r15 = r2
            r2 = r36
            r5 = r38
            r6 = r8
            r13 = r29
            r12 = 2
            r29 = r11
            r11 = r40
            if (r9 != r12) goto L984
            int r3 = com.google.android.gms.internal.measurement.C2373w9.f8735a
            r8 = r6
            com.google.android.gms.internal.measurement.cc r8 = (com.google.android.gms.internal.measurement.C2011cc) r8
            int r3 = com.google.android.gms.internal.measurement.C2373w9.m10920a(r2, r13, r11)
            int r4 = r11.f8714a
            int r4 = r4 + r3
        L96d:
            if (r3 >= r4) goto L979
            int r3 = com.google.android.gms.internal.measurement.C2373w9.m10922c(r2, r3, r11)
            long r6 = r11.f8715b
            r8.m9889c(r6)
            goto L96d
        L979:
            if (r3 != r4) goto L97e
        L97b:
            r6 = r3
            goto L7c0
        L97e:
            com.google.android.gms.internal.measurement.sb r2 = new com.google.android.gms.internal.measurement.sb
            r2.<init>(r0)
            throw r2
        L984:
            if (r9 != 0) goto L7d6
            int r0 = com.google.android.gms.internal.measurement.C2373w9.f8735a
            r8 = r6
            com.google.android.gms.internal.measurement.cc r8 = (com.google.android.gms.internal.measurement.C2011cc) r8
            int r0 = com.google.android.gms.internal.measurement.C2373w9.m10922c(r2, r13, r11)
            long r3 = r11.f8715b
            r8.m9889c(r3)
        L994:
            if (r0 >= r5) goto L94b
            int r3 = com.google.android.gms.internal.measurement.C2373w9.m10920a(r2, r0, r11)
            int r4 = r11.f8714a
            if (r15 != r4) goto L94b
            int r0 = com.google.android.gms.internal.measurement.C2373w9.m10922c(r2, r3, r11)
            long r3 = r11.f8715b
            r8.m9889c(r3)
            goto L994
        L9a8:
            r2 = r21
            r21 = r15
            r15 = r2
            r2 = r36
            r5 = r38
            r6 = r8
            r13 = r29
            r12 = 2
            r29 = r11
            r11 = r40
            if (r9 != r12) goto L9f4
            int r3 = com.google.android.gms.internal.measurement.C2373w9.f8735a
            r8 = r6
            com.google.android.gms.internal.measurement.ya r8 = (com.google.android.gms.internal.measurement.C2410ya) r8
            int r3 = com.google.android.gms.internal.measurement.C2373w9.m10920a(r2, r13, r11)
            int r4 = r11.f8714a
            int r6 = r3 + r4
            int r7 = r2.length
            if (r6 > r7) goto L9ee
            int r7 = r8.size()
            int r4 = r4 / 4
            int r7 = r7 + r4
            r8.m11024w(r7)
        L9d5:
            if (r3 >= r6) goto L9e5
            int r4 = com.google.android.gms.internal.measurement.C2373w9.m10923d(r2, r3)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r8.m11023d(r4)
            int r3 = r3 + 4
            goto L9d5
        L9e5:
            if (r3 != r6) goto L9e8
            goto L97b
        L9e8:
            com.google.android.gms.internal.measurement.sb r2 = new com.google.android.gms.internal.measurement.sb
            r2.<init>(r0)
            throw r2
        L9ee:
            com.google.android.gms.internal.measurement.sb r2 = new com.google.android.gms.internal.measurement.sb
            r2.<init>(r0)
            throw r2
        L9f4:
            r3 = 5
            if (r9 != r3) goto L7d6
            int r7 = r13 + 4
            int r0 = com.google.android.gms.internal.measurement.C2373w9.f8735a
            r8 = r6
            com.google.android.gms.internal.measurement.ya r8 = (com.google.android.gms.internal.measurement.C2410ya) r8
            int r0 = com.google.android.gms.internal.measurement.C2373w9.m10923d(r2, r13)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r8.m11023d(r0)
        La09:
            if (r7 >= r5) goto La21
            int r0 = com.google.android.gms.internal.measurement.C2373w9.m10920a(r2, r7, r11)
            int r3 = r11.f8714a
            if (r15 != r3) goto La21
            int r3 = com.google.android.gms.internal.measurement.C2373w9.m10923d(r2, r0)
            float r3 = java.lang.Float.intBitsToFloat(r3)
            r8.m11023d(r3)
            int r7 = r0 + 4
            goto La09
        La21:
            r6 = r7
            goto L7c0
        La24:
            r2 = r21
            r21 = r15
            r15 = r2
            r2 = r36
            r5 = r38
            r6 = r8
            r13 = r29
            r12 = 2
            r29 = r11
            r11 = r40
            if (r9 != r12) goto La77
            int r3 = com.google.android.gms.internal.measurement.C2373w9.f8735a
            r8 = r6
            com.google.android.gms.internal.measurement.oa r8 = (com.google.android.gms.internal.measurement.C2230oa) r8
            int r3 = com.google.android.gms.internal.measurement.C2373w9.m10920a(r2, r13, r11)
            int r4 = r11.f8714a
            int r6 = r3 + r4
            int r7 = r2.length
            if (r6 > r7) goto La71
            int r7 = r8.size()
            int r4 = r4 / 8
            int r7 = r7 + r4
            r8.m10513w(r7)
        La51:
            if (r3 >= r6) goto La65
            long r23 = com.google.android.gms.internal.measurement.C2373w9.m10924e(r2, r3)
            r30 = r10
            double r9 = java.lang.Double.longBitsToDouble(r23)
            r8.m10510d(r9)
            int r3 = r3 + 8
            r10 = r30
            goto La51
        La65:
            r30 = r10
            if (r3 != r6) goto La6b
            r6 = r3
            goto Laa9
        La6b:
            com.google.android.gms.internal.measurement.sb r2 = new com.google.android.gms.internal.measurement.sb
            r2.<init>(r0)
            throw r2
        La71:
            com.google.android.gms.internal.measurement.sb r2 = new com.google.android.gms.internal.measurement.sb
            r2.<init>(r0)
            throw r2
        La77:
            r30 = r10
            r3 = 1
            if (r9 != r3) goto Laa8
            int r7 = r13 + 8
            int r0 = com.google.android.gms.internal.measurement.C2373w9.f8735a
            r8 = r6
            com.google.android.gms.internal.measurement.oa r8 = (com.google.android.gms.internal.measurement.C2230oa) r8
            long r3 = com.google.android.gms.internal.measurement.C2373w9.m10924e(r2, r13)
            double r3 = java.lang.Double.longBitsToDouble(r3)
            r8.m10510d(r3)
        La8e:
            if (r7 >= r5) goto Laa6
            int r0 = com.google.android.gms.internal.measurement.C2373w9.m10920a(r2, r7, r11)
            int r3 = r11.f8714a
            if (r15 != r3) goto Laa6
            long r3 = com.google.android.gms.internal.measurement.C2373w9.m10924e(r2, r0)
            double r3 = java.lang.Double.longBitsToDouble(r3)
            r8.m10510d(r3)
            int r7 = r0 + 8
            goto La8e
        Laa6:
            r6 = r7
            goto Laa9
        Laa8:
            r6 = r13
        Laa9:
            if (r6 == r13) goto Lab8
            r4 = r2
            r7 = r11
            r3 = r14
            r10 = r19
            r2 = r21
            r14 = r22
            r8 = r29
            goto L302
        Lab8:
            r1 = r39
            r3 = r2
            r4 = r6
            r10 = r11
            r0 = r21
            r11 = r29
            goto L3b7
        Lac3:
            r2 = r21
            r21 = r15
            r15 = r2
            r2 = r36
            r5 = r38
            r30 = r10
            r26 = r13
            r13 = r29
            r29 = r11
            r11 = r40
            r10 = 50
            if (r4 != r10) goto Lbf6
            r10 = 2
            if (r9 != r10) goto Lbe2
            r10 = r30
            java.lang.Object r3 = r1.m10648D(r10)
            r9 = r21
            java.lang.Object r4 = r9.getObject(r14, r7)
            r6 = r4
            com.google.android.gms.internal.measurement.ic r6 = (com.google.android.gms.internal.measurement.C2125ic) r6
            boolean r6 = r6.m10290f()
            if (r6 != 0) goto Lb01
            com.google.android.gms.internal.measurement.ic r6 = com.google.android.gms.internal.measurement.C2125ic.m10285a()
            com.google.android.gms.internal.measurement.ic r6 = r6.m10288c()
            com.google.android.gms.internal.measurement.C2142jc.m10303a(r6, r4)
            r9.putObject(r14, r7, r6)
            r4 = r6
        Lb01:
            com.google.android.gms.internal.measurement.hc r3 = (com.google.android.gms.internal.measurement.C2106hc) r3
            com.google.android.gms.internal.measurement.gc r8 = r3.m10200e()
            r12 = r4
            com.google.android.gms.internal.measurement.ic r12 = (com.google.android.gms.internal.measurement.C2125ic) r12
            int r3 = com.google.android.gms.internal.measurement.C2373w9.m10920a(r2, r13, r11)
            int r4 = r11.f8714a
            if (r4 < 0) goto Lbdc
            int r6 = r5 - r3
            if (r4 > r6) goto Lbdc
            int r0 = r3 + r4
            java.lang.Object r4 = r8.f8204b
            java.lang.Object r6 = r8.f8206d
            r7 = r6
        Lb1d:
            if (r3 >= r0) goto Lbab
            r21 = r4
            int r4 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto Lb2d
            int r4 = com.google.android.gms.internal.measurement.C2373w9.m10921b(r3, r2, r4, r11)
            int r3 = r11.f8714a
        Lb2d:
            int r2 = r3 >>> 3
            r23 = r4
            r4 = r3 & 7
            r5 = 1
            if (r2 == r5) goto Lb7d
            r5 = 2
            if (r2 == r5) goto Lb47
            r2 = r36
            r5 = r38
            r4 = r11
            r11 = r21
            r21 = r6
            r6 = r7
            r7 = r23
            goto Lba2
        Lb47:
            com.google.android.gms.internal.measurement.wd r5 = r8.f8205c
            int r2 = r5.m10954b()
            if (r4 != r2) goto Lb6f
            r2 = r6
            java.lang.Class r6 = r2.getClass()
            r4 = r38
            r7 = r11
            r11 = r21
            r3 = r23
            r21 = r2
            r2 = r36
            int r3 = m10640u(r2, r3, r4, r5, r6, r7)
            r2 = r7
            java.lang.Object r7 = r2.f8716c
            r5 = r38
            r4 = r11
            r6 = r21
            r11 = r2
            r2 = r36
            goto Lb1d
        Lb6f:
            r2 = r11
            r11 = r21
            r21 = r6
        Lb74:
            r5 = r38
            r4 = r2
            r6 = r7
            r7 = r23
            r2 = r36
            goto Lba2
        Lb7d:
            r2 = r11
            r11 = r21
            r21 = r6
            com.google.android.gms.internal.measurement.wd r5 = r8.f8203a
            int r6 = r5.m10954b()
            if (r4 != r6) goto Lb74
            r6 = 0
            r4 = r38
            r11 = r7
            r3 = r23
            r7 = r2
            r2 = r36
            int r3 = m10640u(r2, r3, r4, r5, r6, r7)
            r5 = r4
            r4 = r7
            java.lang.Object r6 = r4.f8716c
            r7 = r11
            r11 = r4
            r4 = r6
        Lb9e:
            r6 = r21
            goto Lb1d
        Lba2:
            int r3 = com.google.android.gms.internal.measurement.C2373w9.m10935p(r3, r2, r7, r5, r4)
            r7 = r11
            r11 = r4
            r4 = r7
            r7 = r6
            goto Lb9e
        Lbab:
            r6 = r11
            r11 = r4
            r4 = r6
            r6 = r7
            if (r3 != r0) goto Lbd4
            r12.put(r11, r6)
            if (r0 == r13) goto Lbc8
            r6 = r0
            r7 = r4
            r3 = r14
            r14 = r22
            r8 = r29
            r11 = 0
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            r2 = r9
            r9 = r10
            r10 = r19
            goto L1c
        Lbc8:
            r1 = r4
            r4 = r0
            r0 = r9
            r9 = r10
            r10 = r1
            r1 = r39
            r3 = r2
            r11 = r29
            goto Le8e
        Lbd4:
            com.google.android.gms.internal.measurement.sb r0 = new com.google.android.gms.internal.measurement.sb
            r11 = r26
            r0.<init>(r11)
            throw r0
        Lbdc:
            com.google.android.gms.internal.measurement.sb r2 = new com.google.android.gms.internal.measurement.sb
            r2.<init>(r0)
            throw r2
        Lbe2:
            r4 = r11
            r9 = r21
            r11 = r26
            r10 = r30
        Lbe9:
            r1 = r39
            r3 = r2
            r0 = r9
            r9 = r10
            r26 = r11
            r11 = r29
            r10 = r4
            r4 = r13
            goto Le8e
        Lbf6:
            r0 = r21
            r11 = r26
            r10 = r30
            int r21 = r10 + 2
            r21 = r27[r21]
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r21 & r16
            r21 = r4
            long r4 = (long) r2
            switch(r21) {
                case 51: goto Le53;
                case 52: goto Le2f;
                case 53: goto Le10;
                case 54: goto Le10;
                case 55: goto Ldf2;
                case 56: goto Ldd3;
                case 57: goto Ldb2;
                case 58: goto Ld83;
                case 59: goto Ld3b;
                case 60: goto Lcff;
                case 61: goto Lcdf;
                case 62: goto Ldf2;
                case 63: goto Lc9b;
                case 64: goto Ldb2;
                case 65: goto Ldd3;
                case 66: goto Lc74;
                case 67: goto Lc46;
                case 68: goto Lc18;
                default: goto Lc0b;
            }
        Lc0b:
            r3 = r36
            r30 = r10
            r26 = r11
            r12 = r13
            r11 = r29
        Lc14:
            r10 = r40
            goto Le77
        Lc18:
            r4 = 3
            if (r9 != r4) goto Lc0b
            r2 = r15 & (-8)
            r7 = r2 | 4
            r12 = r29
            java.lang.Object r2 = r1.m10652H(r14, r12, r10)
            com.google.android.gms.internal.measurement.zc r3 = r1.m10647C(r10)
            r4 = r36
            r6 = r38
            r8 = r40
            r5 = r13
            int r3 = com.google.android.gms.internal.measurement.C2373w9.m10930k(r2, r3, r4, r5, r6, r7, r8)
            r6 = r4
            r4 = r2
            r2 = r6
            r6 = r8
            r1.m10653I(r14, r12, r10, r4)
            r30 = r10
            r26 = r11
            r11 = r12
            r12 = r13
            r10 = r6
        Lc42:
            r6 = r3
            r3 = r2
            goto Le78
        Lc46:
            r2 = r36
            r6 = r40
            r12 = r29
            if (r9 != 0) goto Lc6a
            int r3 = com.google.android.gms.internal.measurement.C2373w9.m10922c(r2, r13, r6)
            r30 = r10
            long r9 = r6.f8715b
            long r9 = com.google.android.gms.internal.measurement.C2140ja.m10302b(r9)
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r0.putObject(r14, r7, r9)
            r0.putInt(r14, r4, r12)
        Lc64:
            r10 = r6
            r26 = r11
            r11 = r12
            r12 = r13
            goto Lc42
        Lc6a:
            r3 = r2
            r30 = r10
            r26 = r11
            r11 = r12
            r12 = r13
            r10 = r6
            goto Le77
        Lc74:
            r2 = r36
            r6 = r40
            r30 = r10
            r12 = r29
            if (r9 != 0) goto Lc93
            int r3 = com.google.android.gms.internal.measurement.C2373w9.m10920a(r2, r13, r6)
            int r9 = r6.f8714a
            int r9 = com.google.android.gms.internal.measurement.C2140ja.m10301a(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r0.putObject(r14, r7, r9)
            r0.putInt(r14, r4, r12)
            goto Lc64
        Lc93:
            r3 = r2
            r10 = r6
            r26 = r11
            r11 = r12
            r12 = r13
            goto Le77
        Lc9b:
            r2 = r36
            r6 = r40
            r30 = r10
            r12 = r29
            if (r9 != 0) goto Lc93
            int r3 = com.google.android.gms.internal.measurement.C2373w9.m10920a(r2, r13, r6)
            int r9 = r6.f8714a
            r21 = r3
            r10 = r30
            com.google.android.gms.internal.measurement.lb r3 = r1.m10649E(r10)
            if (r3 == 0) goto Lcc9
            boolean r3 = r3.mo9761a(r9)
            if (r3 == 0) goto Lcbc
            goto Lcc9
        Lcbc:
            com.google.android.gms.internal.measurement.md r3 = m10642w(r14)
            long r4 = (long) r9
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3.m10399k(r15, r4)
            goto Lcd3
        Lcc9:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r0.putObject(r14, r7, r3)
            r0.putInt(r14, r4, r12)
        Lcd3:
            r3 = r2
            r30 = r10
            r26 = r11
            r11 = r12
            r12 = r13
            r10 = r6
            r6 = r21
            goto Le78
        Lcdf:
            r2 = r36
            r6 = r40
            r12 = r29
            r3 = 2
            if (r9 != r3) goto Lc6a
            int r9 = com.google.android.gms.internal.measurement.C2373w9.m10926g(r2, r13, r6)
            java.lang.Object r3 = r6.f8716c
            r0.putObject(r14, r7, r3)
            r0.putInt(r14, r4, r12)
            r3 = r2
            r30 = r10
            r26 = r11
            r11 = r12
            r12 = r13
            r10 = r6
        Lcfc:
            r6 = r9
            goto Le78
        Lcff:
            r2 = r36
            r6 = r40
            r12 = r29
            r3 = 2
            if (r9 != r3) goto Ld32
            java.lang.Object r2 = r1.m10652H(r14, r12, r10)
            r20 = r3
            com.google.android.gms.internal.measurement.zc r3 = r1.m10647C(r10)
            r4 = r36
            r7 = r6
            r5 = r13
            r13 = r20
            r6 = r38
            int r3 = com.google.android.gms.internal.measurement.C2373w9.m10929j(r2, r3, r4, r5, r6, r7)
            r32 = r4
            r4 = r2
            r2 = r32
            r1.m10653I(r14, r12, r10, r4)
            r6 = r3
            r30 = r10
            r26 = r11
            r11 = r12
            r10 = r40
            r3 = r2
            r12 = r5
            goto Le78
        Ld32:
            r3 = r2
            r30 = r10
            r26 = r11
            r11 = r12
            r12 = r13
            goto Lc14
        Ld3b:
            r2 = r36
            r30 = r10
            r26 = r11
            r21 = r12
            r12 = r13
            r11 = r29
            r13 = 2
            r10 = r40
            if (r9 != r13) goto Ld80
            int r9 = com.google.android.gms.internal.measurement.C2373w9.m10920a(r2, r12, r10)
            int r13 = r10.f8714a
            if (r13 != 0) goto Ld57
            r0.putObject(r14, r7, r6)
            goto Ld7a
        Ld57:
            r6 = r21 & r23
            r21 = r6
            int r6 = r9 + r13
            if (r21 == 0) goto Ld6c
            boolean r21 = com.google.android.gms.internal.measurement.C2359vd.m10854a(r2, r9, r6)
            if (r21 == 0) goto Ld66
            goto Ld6c
        Ld66:
            com.google.android.gms.internal.measurement.sb r0 = new com.google.android.gms.internal.measurement.sb
            r0.<init>(r3)
            throw r0
        Ld6c:
            java.lang.String r3 = new java.lang.String
            r21 = r6
            java.nio.charset.Charset r6 = com.google.android.gms.internal.measurement.C2267qb.f8595a
            r3.<init>(r2, r9, r13, r6)
            r0.putObject(r14, r7, r3)
            r9 = r21
        Ld7a:
            r0.putInt(r14, r4, r11)
            r3 = r2
            goto Lcfc
        Ld80:
            r3 = r2
            goto Le77
        Ld83:
            r2 = r36
            r30 = r10
            r26 = r11
            r12 = r13
            r11 = r29
            r10 = r40
            if (r9 != 0) goto Ldae
            int r3 = com.google.android.gms.internal.measurement.C2373w9.m10922c(r2, r12, r10)
            long r1 = r10.f8715b
            int r1 = (r1 > r24 ? 1 : (r1 == r24 ? 0 : -1))
            if (r1 == 0) goto Ld9d
            r28 = 1
            goto Ld9f
        Ld9d:
            r28 = 0
        Ld9f:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r28)
            r0.putObject(r14, r7, r1)
            r0.putInt(r14, r4, r11)
            r6 = r3
            r3 = r36
            goto Le78
        Ldae:
            r3 = r36
            goto Le77
        Ldb2:
            r30 = r10
            r26 = r11
            r12 = r13
            r11 = r29
            r3 = 5
            r10 = r40
            if (r9 != r3) goto Ldae
            int r1 = r12 + 4
            r3 = r36
            int r2 = com.google.android.gms.internal.measurement.C2373w9.m10923d(r3, r12)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.putObject(r14, r7, r2)
            r0.putInt(r14, r4, r11)
        Ldd0:
            r6 = r1
            goto Le78
        Ldd3:
            r3 = r36
            r30 = r10
            r26 = r11
            r12 = r13
            r11 = r29
            r6 = 1
            r10 = r40
            if (r9 != r6) goto Le77
            int r1 = r12 + 8
            long r23 = com.google.android.gms.internal.measurement.C2373w9.m10924e(r3, r12)
            java.lang.Long r2 = java.lang.Long.valueOf(r23)
            r0.putObject(r14, r7, r2)
            r0.putInt(r14, r4, r11)
            goto Ldd0
        Ldf2:
            r3 = r36
            r30 = r10
            r26 = r11
            r12 = r13
            r11 = r29
            r10 = r40
            if (r9 != 0) goto Le77
            int r1 = com.google.android.gms.internal.measurement.C2373w9.m10920a(r3, r12, r10)
            int r2 = r10.f8714a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.putObject(r14, r7, r2)
            r0.putInt(r14, r4, r11)
            goto Ldd0
        Le10:
            r3 = r36
            r30 = r10
            r26 = r11
            r12 = r13
            r11 = r29
            r10 = r40
            if (r9 != 0) goto Le77
            int r1 = com.google.android.gms.internal.measurement.C2373w9.m10922c(r3, r12, r10)
            r6 = r1
            long r1 = r10.f8715b
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.putObject(r14, r7, r1)
            r0.putInt(r14, r4, r11)
            goto Le78
        Le2f:
            r3 = r36
            r30 = r10
            r26 = r11
            r12 = r13
            r11 = r29
            r6 = 5
            r10 = r40
            if (r9 != r6) goto Le77
            int r1 = r12 + 4
            int r2 = com.google.android.gms.internal.measurement.C2373w9.m10923d(r3, r12)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r0.putObject(r14, r7, r2)
            r0.putInt(r14, r4, r11)
            goto Ldd0
        Le53:
            r3 = r36
            r30 = r10
            r26 = r11
            r12 = r13
            r11 = r29
            r6 = 1
            r10 = r40
            if (r9 != r6) goto Le77
            int r1 = r12 + 8
            long r23 = com.google.android.gms.internal.measurement.C2373w9.m10924e(r3, r12)
            double r23 = java.lang.Double.longBitsToDouble(r23)
            java.lang.Double r2 = java.lang.Double.valueOf(r23)
            r0.putObject(r14, r7, r2)
            r0.putInt(r14, r4, r11)
            goto Ldd0
        Le77:
            r6 = r12
        Le78:
            if (r6 == r12) goto Le89
            r1 = r34
            r5 = r38
            r2 = r0
            r4 = r3
            r7 = r10
            r8 = r11
            r3 = r14
            r10 = r19
            r14 = r22
            goto L302
        Le89:
            r1 = r39
            r4 = r6
            goto L3b7
        Le8e:
            if (r15 != r1) goto Lea1
            if (r1 == 0) goto Lea1
            r8 = r34
            r5 = r38
            r2 = r0
            r6 = r4
            r10 = r19
        Le9a:
            r0 = r22
            r7 = 1048575(0xfffff, float:1.469367E-39)
            goto Lefb
        Lea1:
            r8 = r34
            boolean r2 = r8.f8620f
            if (r2 == 0) goto Lecd
            com.google.android.gms.internal.measurement.ra r2 = r10.f8717d
            com.google.android.gms.internal.measurement.ra r5 = com.google.android.gms.internal.measurement.C2284ra.f8610b
            com.google.android.gms.internal.measurement.wc r5 = com.google.android.gms.internal.measurement.C2376wc.f8740c
            com.google.android.gms.internal.measurement.ra r5 = com.google.android.gms.internal.measurement.C2284ra.f8611c
            if (r2 == r5) goto Lecd
            com.google.android.gms.internal.measurement.oc r5 = r8.f8619e
            int r6 = com.google.android.gms.internal.measurement.C2373w9.f8735a
            com.google.android.gms.internal.measurement.fb r2 = r2.m10630b(r5, r11)
            if (r2 != 0) goto Lec9
            com.google.android.gms.internal.measurement.md r6 = m10642w(r14)
            r5 = r38
            r7 = r10
            r2 = r15
            int r4 = com.google.android.gms.internal.measurement.C2373w9.m10934o(r2, r3, r4, r5, r6, r7)
        Lec7:
            r6 = r4
            goto Ledd
        Lec9:
            r0 = r14
            com.google.android.gms.internal.measurement.db r0 = (com.google.android.gms.internal.measurement.AbstractC2029db) r0
            throw r17
        Lecd:
            r2 = r15
            com.google.android.gms.internal.measurement.md r6 = m10642w(r14)
            r3 = r36
            r5 = r38
            r7 = r40
            int r4 = com.google.android.gms.internal.measurement.C2373w9.m10934o(r2, r3, r4, r5, r6, r7)
            goto Lec7
        Ledd:
            r4 = r36
            r7 = r40
            r15 = r2
            r1 = r8
            r8 = r11
            r3 = r14
            r10 = r19
            r14 = r22
            r11 = 0
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r0
            goto L1c
        Lef0:
            r8 = r1
            r19 = r10
            r26 = r13
            r22 = r14
            r1 = r39
            r14 = r3
            goto Le9a
        Lefb:
            if (r10 == r7) goto Lf01
            long r3 = (long) r10
            r2.putInt(r14, r3, r0)
        Lf01:
            int r0 = r8.f8622h
            r2 = r17
        Lf05:
            int r3 = r8.f8623i
            if (r0 >= r3) goto Lfb5
            int[] r3 = r8.f8621g
            com.google.android.gms.internal.measurement.ld r4 = r8.f8624j
            int[] r7 = r8.f8615a
            r3 = r3[r0]
            r7 = r7[r3]
            int r9 = r8.m10654K(r3)
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r9 & r16
            long r9 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C2305sd.m10744s(r14, r9)
            if (r9 == 0) goto Lfa9
            com.google.android.gms.internal.measurement.lb r10 = r8.m10649E(r3)
            if (r10 == 0) goto Lfa9
            com.google.android.gms.internal.measurement.ic r9 = (com.google.android.gms.internal.measurement.C2125ic) r9
            java.lang.Object r3 = r8.m10648D(r3)
            com.google.android.gms.internal.measurement.hc r3 = (com.google.android.gms.internal.measurement.C2106hc) r3
            com.google.android.gms.internal.measurement.gc r3 = r3.m10200e()
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        Lf3d:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto Lfa9
            java.lang.Object r11 = r9.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r12 = r11.getValue()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            boolean r12 = r10.mo9761a(r12)
            if (r12 != 0) goto Lfa6
            if (r2 != 0) goto Lf5f
            java.lang.Object r2 = r4.mo10364a(r14)
        Lf5f:
            java.lang.Object r12 = r11.getKey()
            java.lang.Object r13 = r11.getValue()
            int r12 = com.google.android.gms.internal.measurement.C2106hc.m10198c(r3, r12, r13)
            com.google.android.gms.internal.measurement.ha r13 = com.google.android.gms.internal.measurement.AbstractC2104ha.f8218b
            byte[] r13 = new byte[r12]
            java.util.logging.Logger r17 = com.google.android.gms.internal.measurement.AbstractC2194ma.f8418b
            r17 = r0
            com.google.android.gms.internal.measurement.ka r0 = new com.google.android.gms.internal.measurement.ka
            r18 = r4
            r4 = 0
            r0.<init>(r13, r4, r12)
            java.lang.Object r12 = r11.getKey()     // Catch: java.io.IOException -> Lf9f
            java.lang.Object r11 = r11.getValue()     // Catch: java.io.IOException -> Lf9f
            com.google.android.gms.internal.measurement.C2106hc.m10197b(r0, r3, r12, r11)     // Catch: java.io.IOException -> Lf9f
            com.google.android.gms.internal.measurement.ha r0 = com.google.android.gms.internal.measurement.C2047ea.m9945a(r0, r13)
            r11 = 3
            int r12 = r7 << 3
            r13 = r2
            com.google.android.gms.internal.measurement.md r13 = (com.google.android.gms.internal.measurement.C2197md) r13
            r20 = 2
            r12 = r12 | 2
            r13.m10399k(r12, r0)
            r9.remove()
            r0 = r17
            r4 = r18
            goto Lf3d
        Lf9f:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        Lfa6:
            r20 = 2
            goto Lf3d
        Lfa9:
            r17 = r0
            r4 = 0
            r11 = 3
            r20 = 2
            com.google.android.gms.internal.measurement.md r2 = (com.google.android.gms.internal.measurement.C2197md) r2
            int r0 = r17 + 1
            goto Lf05
        Lfb5:
            if (r2 == 0) goto Lfbc
            r0 = r14
            com.google.android.gms.internal.measurement.gb r0 = (com.google.android.gms.internal.measurement.AbstractC2086gb) r0
            r0.zzc = r2
        Lfbc:
            if (r1 != 0) goto Lfc9
            if (r6 != r5) goto Lfc1
            goto Lfcf
        Lfc1:
            com.google.android.gms.internal.measurement.sb r0 = new com.google.android.gms.internal.measurement.sb
            r11 = r26
            r0.<init>(r11)
            throw r0
        Lfc9:
            r11 = r26
            if (r6 > r5) goto Lfd0
            if (r15 != r1) goto Lfd0
        Lfcf:
            return r6
        Lfd0:
            com.google.android.gms.internal.measurement.sb r0 = new com.google.android.gms.internal.measurement.sb
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2286rc.m10669x(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.v9):int");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2430zc
    public final Object zza() {
        return ((AbstractC2086gb) this.f8619e).m10071m();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2430zc
    public final int zzc(Object obj) {
        int i10;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i11;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = this.f8615a;
            if (i12 >= iArr.length) {
                int iHashCode = (i13 * 53) + ((AbstractC2086gb) obj).zzc.hashCode();
                return this.f8620f ? (iHashCode * 53) + ((AbstractC2029db) obj).zzb.f8737a.hashCode() : iHashCode;
            }
            int iM10654K = m10654K(i12);
            int i14 = 1048575 & iM10654K;
            int iM10632M = m10632M(iM10654K);
            int i15 = iArr[i12];
            long j10 = i14;
            int iHashCode2 = 37;
            switch (iM10632M) {
                case 0:
                    i10 = i13 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(C2305sd.m10742q(obj, j10));
                    Charset charset = C2267qb.f8595a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 1:
                    i10 = i13 * 53;
                    iFloatToIntBits = Float.floatToIntBits(C2305sd.m10740o(obj, j10));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 2:
                    i10 = i13 * 53;
                    jDoubleToLongBits = C2305sd.m10736k(obj, j10);
                    Charset charset2 = C2267qb.f8595a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 3:
                    i10 = i13 * 53;
                    jDoubleToLongBits = C2305sd.m10736k(obj, j10);
                    Charset charset3 = C2267qb.f8595a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 4:
                    i10 = i13 * 53;
                    iFloatToIntBits = C2305sd.m10734i(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 5:
                    i10 = i13 * 53;
                    jDoubleToLongBits = C2305sd.m10736k(obj, j10);
                    Charset charset4 = C2267qb.f8595a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 6:
                    i10 = i13 * 53;
                    iFloatToIntBits = C2305sd.m10734i(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 7:
                    i10 = i13 * 53;
                    iFloatToIntBits = C2267qb.m10577b(C2305sd.m10738m(obj, j10));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 8:
                    i10 = i13 * 53;
                    iFloatToIntBits = ((String) C2305sd.m10744s(obj, j10)).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 9:
                    i11 = i13 * 53;
                    Object objM10744s = C2305sd.m10744s(obj, j10);
                    if (objM10744s != null) {
                        iHashCode2 = objM10744s.hashCode();
                    }
                    i13 = i11 + iHashCode2;
                    break;
                case 10:
                    i10 = i13 * 53;
                    iFloatToIntBits = C2305sd.m10744s(obj, j10).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 11:
                    i10 = i13 * 53;
                    iFloatToIntBits = C2305sd.m10734i(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 12:
                    i10 = i13 * 53;
                    iFloatToIntBits = C2305sd.m10734i(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 13:
                    i10 = i13 * 53;
                    iFloatToIntBits = C2305sd.m10734i(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 14:
                    i10 = i13 * 53;
                    jDoubleToLongBits = C2305sd.m10736k(obj, j10);
                    Charset charset5 = C2267qb.f8595a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 15:
                    i10 = i13 * 53;
                    iFloatToIntBits = C2305sd.m10734i(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 16:
                    i10 = i13 * 53;
                    jDoubleToLongBits = C2305sd.m10736k(obj, j10);
                    Charset charset6 = C2267qb.f8595a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 17:
                    i11 = i13 * 53;
                    Object objM10744s2 = C2305sd.m10744s(obj, j10);
                    if (objM10744s2 != null) {
                        iHashCode2 = objM10744s2.hashCode();
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
                    iFloatToIntBits = C2305sd.m10744s(obj, j10).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 50:
                    i10 = i13 * 53;
                    iFloatToIntBits = C2305sd.m10744s(obj, j10).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 51:
                    if (m10666r(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(m10635i(obj, j10));
                        Charset charset7 = C2267qb.f8595a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 52:
                    if (m10666r(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = Float.floatToIntBits(m10636j(obj, j10));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (m10666r(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = m10638l(obj, j10);
                        Charset charset8 = C2267qb.f8595a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 54:
                    if (m10666r(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = m10638l(obj, j10);
                        Charset charset9 = C2267qb.f8595a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 55:
                    if (m10666r(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = m10637k(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 56:
                    if (m10666r(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = m10638l(obj, j10);
                        Charset charset10 = C2267qb.f8595a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 57:
                    if (m10666r(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = m10637k(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 58:
                    if (m10666r(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = C2267qb.m10577b(m10639m(obj, j10));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 59:
                    if (m10666r(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = ((String) C2305sd.m10744s(obj, j10)).hashCode();
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (m10666r(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = C2305sd.m10744s(obj, j10).hashCode();
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (m10666r(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = C2305sd.m10744s(obj, j10).hashCode();
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 62:
                    if (m10666r(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = m10637k(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 63:
                    if (m10666r(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = m10637k(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (m10666r(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = m10637k(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (m10666r(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = m10638l(obj, j10);
                        Charset charset11 = C2267qb.f8595a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 66:
                    if (m10666r(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = m10637k(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 67:
                    if (m10666r(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = m10638l(obj, j10);
                        Charset charset12 = C2267qb.f8595a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 68:
                    if (m10666r(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = C2305sd.m10744s(obj, j10).hashCode();
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
            }
            i12 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:143:0x038e  */
    /* JADX WARN: Code duplicated, block: B:84:0x01df  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2430zc
    public final int zze(Object obj) {
        int i10;
        int iM10380G;
        int iM10380G2;
        int iM10381a;
        int iM10380G3;
        int iM10380G4;
        int iM10380G5;
        int iMo9871d;
        int iM10380G6;
        int iM9800E;
        int iM9820t;
        int size;
        int iM9821u;
        int iM10380G7;
        int iM10380G8;
        int iM10380G9;
        int iM10381a2;
        int iM9798C;
        int iM10380G10;
        int iM10380G11;
        int iM10385g;
        int iM10380G12;
        int iM10380G13;
        int iM10380G14;
        int iMo9871d2;
        int iM10380G15;
        C2286rc<T> c2286rc = this;
        Unsafe unsafe = f8614m;
        int i11 = 0;
        int i12 = 0;
        int iM10380G16 = 0;
        int i13 = 1048575;
        while (true) {
            int[] iArr = c2286rc.f8615a;
            if (i11 >= iArr.length) {
                int iM10397i = iM10380G16 + ((AbstractC2086gb) obj).zzc.m10397i();
                if (!c2286rc.f8620f) {
                    return iM10397i;
                }
                C2107hd c2107hd = ((AbstractC2029db) obj).zzb.f8737a;
                int iM10202c = c2107hd.m10202c();
                int iM10941j = 0;
                for (int i14 = 0; i14 < iM10202c; i14++) {
                    Map.Entry entryM10203d = c2107hd.m10203d(i14);
                    iM10941j += C2374wa.m10941j((InterfaceC2356va) ((C2050ed) entryM10203d).m9947a(), entryM10203d.getValue());
                }
                for (Map.Entry entry : c2107hd.m10204e()) {
                    iM10941j += C2374wa.m10941j((InterfaceC2356va) entry.getKey(), entry.getValue());
                }
                return iM10397i + iM10941j;
            }
            int iM10654K = c2286rc.m10654K(i11);
            int iM10632M = m10632M(iM10654K);
            int i15 = iArr[i11];
            int i16 = iArr[i11 + 2];
            int i17 = i16 & 1048575;
            if (iM10632M <= 17) {
                if (i17 != i13) {
                    i12 = i17 == 1048575 ? 0 : unsafe.getInt(obj, i17);
                    i13 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            } else {
                i10 = 0;
            }
            int i18 = iM10654K & 1048575;
            if (iM10632M >= EnumC2392xa.f8786K.zza()) {
                EnumC2392xa.f8799X.zza();
            }
            long j10 = i18;
            switch (iM10632M) {
                case 0:
                    if (c2286rc.m10663o(obj, i11, i13, i12, i10)) {
                        iM10380G16 += AbstractC2194ma.m10380G(i15 << 3) + 8;
                    }
                    break;
                case 1:
                    if (c2286rc.m10663o(obj, i11, i13, i12, i10)) {
                        iM10380G = AbstractC2194ma.m10380G(i15 << 3);
                        iM10380G4 = iM10380G + 4;
                        iM10380G16 += iM10380G4;
                    }
                    c2286rc = this;
                    break;
                case 2:
                    if (c2286rc.m10663o(obj, i11, i13, i12, i10)) {
                        long j11 = unsafe.getLong(obj, j10);
                        iM10380G2 = AbstractC2194ma.m10380G(i15 << 3);
                        iM10381a = AbstractC2194ma.m10381a(j11);
                        iM10380G4 = iM10380G2 + iM10381a;
                        iM10380G16 += iM10380G4;
                    }
                    c2286rc = this;
                    break;
                case 3:
                    if (c2286rc.m10663o(obj, i11, i13, i12, i10)) {
                        long j12 = unsafe.getLong(obj, j10);
                        iM10380G2 = AbstractC2194ma.m10380G(i15 << 3);
                        iM10381a = AbstractC2194ma.m10381a(j12);
                        iM10380G4 = iM10380G2 + iM10381a;
                        iM10380G16 += iM10380G4;
                    }
                    c2286rc = this;
                    break;
                case 4:
                    if (c2286rc.m10663o(obj, i11, i13, i12, i10)) {
                        long j13 = unsafe.getInt(obj, j10);
                        iM10380G2 = AbstractC2194ma.m10380G(i15 << 3);
                        iM10381a = AbstractC2194ma.m10381a(j13);
                        iM10380G4 = iM10380G2 + iM10381a;
                        iM10380G16 += iM10380G4;
                    }
                    c2286rc = this;
                    break;
                case 5:
                    if (c2286rc.m10663o(obj, i11, i13, i12, i10)) {
                        iM10380G3 = AbstractC2194ma.m10380G(i15 << 3);
                        iM10380G4 = iM10380G3 + 8;
                        iM10380G16 += iM10380G4;
                    }
                    c2286rc = this;
                    break;
                case 6:
                    if (c2286rc.m10663o(obj, i11, i13, i12, i10)) {
                        iM10380G = AbstractC2194ma.m10380G(i15 << 3);
                        iM10380G4 = iM10380G + 4;
                        iM10380G16 += iM10380G4;
                    }
                    c2286rc = this;
                    break;
                case 7:
                    if (c2286rc.m10663o(obj, i11, i13, i12, i10)) {
                        iM10380G4 = AbstractC2194ma.m10380G(i15 << 3) + 1;
                        iM10380G16 += iM10380G4;
                    }
                    c2286rc = this;
                    break;
                case 8:
                    if (c2286rc.m10663o(obj, i11, i13, i12, i10)) {
                        int i19 = i15 << 3;
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof AbstractC2104ha) {
                            iM10380G5 = AbstractC2194ma.m10380G(i19);
                            iMo9871d = ((AbstractC2104ha) object).mo9871d();
                            iM10380G6 = AbstractC2194ma.m10380G(iMo9871d);
                            iM10380G4 = iM10380G5 + iM10380G6 + iMo9871d;
                            iM10380G16 += iM10380G4;
                        } else {
                            iM10380G2 = AbstractC2194ma.m10380G(i19);
                            iM10381a = AbstractC2194ma.m10382b((String) object);
                            iM10380G4 = iM10380G2 + iM10381a;
                            iM10380G16 += iM10380G4;
                        }
                    }
                    c2286rc = this;
                    break;
                case 9:
                    if (c2286rc.m10663o(obj, i11, i13, i12, i10)) {
                        iM9800E = C1993bd.m9800E(i15, unsafe.getObject(obj, j10), c2286rc.m10647C(i11));
                        iM10380G16 += iM9800E;
                    }
                    break;
                case 10:
                    if (c2286rc.m10663o(obj, i11, i13, i12, i10)) {
                        AbstractC2104ha abstractC2104ha = (AbstractC2104ha) unsafe.getObject(obj, j10);
                        iM10380G5 = AbstractC2194ma.m10380G(i15 << 3);
                        iMo9871d = abstractC2104ha.mo9871d();
                        iM10380G6 = AbstractC2194ma.m10380G(iMo9871d);
                        iM10380G4 = iM10380G5 + iM10380G6 + iMo9871d;
                        iM10380G16 += iM10380G4;
                    }
                    c2286rc = this;
                    break;
                case 11:
                    if (c2286rc.m10663o(obj, i11, i13, i12, i10)) {
                        int i20 = unsafe.getInt(obj, j10);
                        iM10380G2 = AbstractC2194ma.m10380G(i15 << 3);
                        iM10381a = AbstractC2194ma.m10380G(i20);
                        iM10380G4 = iM10380G2 + iM10381a;
                        iM10380G16 += iM10380G4;
                    }
                    c2286rc = this;
                    break;
                case 12:
                    if (c2286rc.m10663o(obj, i11, i13, i12, i10)) {
                        long j14 = unsafe.getInt(obj, j10);
                        iM10380G2 = AbstractC2194ma.m10380G(i15 << 3);
                        iM10381a = AbstractC2194ma.m10381a(j14);
                        iM10380G4 = iM10380G2 + iM10381a;
                        iM10380G16 += iM10380G4;
                    }
                    c2286rc = this;
                    break;
                case 13:
                    if (c2286rc.m10663o(obj, i11, i13, i12, i10)) {
                        iM10380G = AbstractC2194ma.m10380G(i15 << 3);
                        iM10380G4 = iM10380G + 4;
                        iM10380G16 += iM10380G4;
                    }
                    c2286rc = this;
                    break;
                case 14:
                    if (c2286rc.m10663o(obj, i11, i13, i12, i10)) {
                        iM10380G3 = AbstractC2194ma.m10380G(i15 << 3);
                        iM10380G4 = iM10380G3 + 8;
                        iM10380G16 += iM10380G4;
                    }
                    c2286rc = this;
                    break;
                case 15:
                    if (c2286rc.m10663o(obj, i11, i13, i12, i10)) {
                        int i21 = unsafe.getInt(obj, j10);
                        iM10380G2 = AbstractC2194ma.m10380G(i15 << 3);
                        iM10381a = AbstractC2194ma.m10380G((i21 >> 31) ^ (i21 + i21));
                        iM10380G4 = iM10380G2 + iM10381a;
                        iM10380G16 += iM10380G4;
                    }
                    c2286rc = this;
                    break;
                case 16:
                    if (c2286rc.m10663o(obj, i11, i13, i12, i10)) {
                        long j15 = unsafe.getLong(obj, j10);
                        iM10380G2 = AbstractC2194ma.m10380G(i15 << 3);
                        iM10381a = AbstractC2194ma.m10381a((j15 >> 63) ^ (j15 + j15));
                        iM10380G4 = iM10380G2 + iM10381a;
                        iM10380G16 += iM10380G4;
                    }
                    c2286rc = this;
                    break;
                case 17:
                    if (c2286rc.m10663o(obj, i11, i13, i12, i10)) {
                        iM9800E = AbstractC2194ma.m10385g(i15, (InterfaceC2232oc) unsafe.getObject(obj, j10), c2286rc.m10647C(i11));
                        iM10380G16 += iM9800E;
                    }
                    break;
                case 18:
                    iM9800E = C1993bd.m9799D(i15, (List) unsafe.getObject(obj, j10), false);
                    iM10380G16 += iM9800E;
                    break;
                case 19:
                    iM9800E = C1993bd.m9797B(i15, (List) unsafe.getObject(obj, j10), false);
                    iM10380G16 += iM9800E;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j10);
                    AbstractC2179ld abstractC2179ld = C1993bd.f8114a;
                    if (list.size() == 0) {
                        iM9820t = 0;
                    } else {
                        iM9820t = C1993bd.m9820t(list) + (list.size() * AbstractC2194ma.m10380G(i15 << 3));
                    }
                    iM10380G16 += iM9820t;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j10);
                    AbstractC2179ld abstractC2179ld2 = C1993bd.f8114a;
                    size = list2.size();
                    if (size == 0) {
                        iM9800E = 0;
                    } else {
                        iM9821u = C1993bd.m9821u(list2);
                        iM10380G7 = AbstractC2194ma.m10380G(i15 << 3);
                        iM10381a2 = size * iM10380G7;
                        iM9800E = iM9821u + iM10381a2;
                    }
                    iM10380G16 += iM9800E;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j10);
                    AbstractC2179ld abstractC2179ld3 = C1993bd.f8114a;
                    size = list3.size();
                    if (size == 0) {
                        iM9800E = 0;
                    } else {
                        iM9821u = C1993bd.m9824x(list3);
                        iM10380G7 = AbstractC2194ma.m10380G(i15 << 3);
                        iM10381a2 = size * iM10380G7;
                        iM9800E = iM9821u + iM10381a2;
                    }
                    iM10380G16 += iM9800E;
                    break;
                case 23:
                    iM9800E = C1993bd.m9799D(i15, (List) unsafe.getObject(obj, j10), false);
                    iM10380G16 += iM9800E;
                    break;
                case 24:
                    iM9800E = C1993bd.m9797B(i15, (List) unsafe.getObject(obj, j10), false);
                    iM10380G16 += iM9800E;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j10);
                    AbstractC2179ld abstractC2179ld4 = C1993bd.f8114a;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iM9800E = 0;
                    } else {
                        iM9800E = size2 * (AbstractC2194ma.m10380G(i15 << 3) + 1);
                    }
                    iM10380G16 += iM9800E;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j10);
                    AbstractC2179ld abstractC2179ld5 = C1993bd.f8114a;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iM9820t = 0;
                    } else {
                        iM9820t = AbstractC2194ma.m10380G(i15 << 3) * size3;
                        if (list5 instanceof InterfaceC2411yb) {
                            InterfaceC2411yb interfaceC2411yb = (InterfaceC2411yb) list5;
                            for (int i22 = 0; i22 < size3; i22++) {
                                Object objZzc = interfaceC2411yb.zzc();
                                if (objZzc instanceof AbstractC2104ha) {
                                    int iMo9871d3 = ((AbstractC2104ha) objZzc).mo9871d();
                                    iM9820t += AbstractC2194ma.m10380G(iMo9871d3) + iMo9871d3;
                                } else {
                                    iM9820t += AbstractC2194ma.m10382b((String) objZzc);
                                }
                            }
                        } else {
                            for (int i23 = 0; i23 < size3; i23++) {
                                Object obj2 = list5.get(i23);
                                if (obj2 instanceof AbstractC2104ha) {
                                    int iMo9871d4 = ((AbstractC2104ha) obj2).mo9871d();
                                    iM9820t += AbstractC2194ma.m10380G(iMo9871d4) + iMo9871d4;
                                } else {
                                    iM9820t += AbstractC2194ma.m10382b((String) obj2);
                                }
                            }
                        }
                    }
                    iM10380G16 += iM9820t;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j10);
                    InterfaceC2430zc interfaceC2430zcM10647C = c2286rc.m10647C(i11);
                    AbstractC2179ld abstractC2179ld6 = C1993bd.f8114a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iM10380G8 = 0;
                    } else {
                        iM10380G8 = AbstractC2194ma.m10380G(i15 << 3) * size4;
                        for (int i24 = 0; i24 < size4; i24++) {
                            Object obj3 = list6.get(i24);
                            if (obj3 instanceof C2393xb) {
                                int iM10980b = ((C2393xb) obj3).m10980b();
                                iM10380G8 += AbstractC2194ma.m10380G(iM10980b) + iM10980b;
                            } else {
                                iM10380G8 += AbstractC2194ma.m10384d((InterfaceC2232oc) obj3, interfaceC2430zcM10647C);
                            }
                        }
                    }
                    iM10380G16 += iM10380G8;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j10);
                    AbstractC2179ld abstractC2179ld7 = C1993bd.f8114a;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iM10380G9 = 0;
                    } else {
                        iM10380G9 = size5 * AbstractC2194ma.m10380G(i15 << 3);
                        for (int i25 = 0; i25 < list7.size(); i25++) {
                            int iMo9871d5 = ((AbstractC2104ha) list7.get(i25)).mo9871d();
                            iM10380G9 += AbstractC2194ma.m10380G(iMo9871d5) + iMo9871d5;
                        }
                    }
                    iM10380G16 += iM10380G9;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j10);
                    AbstractC2179ld abstractC2179ld8 = C1993bd.f8114a;
                    size = list8.size();
                    if (size == 0) {
                        iM9800E = 0;
                    } else {
                        iM9821u = C1993bd.m9825y(list8);
                        iM10380G7 = AbstractC2194ma.m10380G(i15 << 3);
                        iM10381a2 = size * iM10380G7;
                        iM9800E = iM9821u + iM10381a2;
                    }
                    iM10380G16 += iM9800E;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j10);
                    AbstractC2179ld abstractC2179ld9 = C1993bd.f8114a;
                    size = list9.size();
                    if (size == 0) {
                        iM9800E = 0;
                    } else {
                        iM9821u = C1993bd.m9823w(list9);
                        iM10380G7 = AbstractC2194ma.m10380G(i15 << 3);
                        iM10381a2 = size * iM10380G7;
                        iM9800E = iM9821u + iM10381a2;
                    }
                    iM10380G16 += iM9800E;
                    break;
                case 31:
                    iM9800E = C1993bd.m9797B(i15, (List) unsafe.getObject(obj, j10), false);
                    iM10380G16 += iM9800E;
                    break;
                case 32:
                    iM9800E = C1993bd.m9799D(i15, (List) unsafe.getObject(obj, j10), false);
                    iM10380G16 += iM9800E;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j10);
                    AbstractC2179ld abstractC2179ld10 = C1993bd.f8114a;
                    size = list10.size();
                    if (size == 0) {
                        iM9800E = 0;
                    } else {
                        iM9821u = C1993bd.m9826z(list10);
                        iM10380G7 = AbstractC2194ma.m10380G(i15 << 3);
                        iM10381a2 = size * iM10380G7;
                        iM9800E = iM9821u + iM10381a2;
                    }
                    iM10380G16 += iM9800E;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j10);
                    AbstractC2179ld abstractC2179ld11 = C1993bd.f8114a;
                    size = list11.size();
                    if (size == 0) {
                        iM9800E = 0;
                    } else {
                        iM9821u = C1993bd.m9822v(list11);
                        iM10380G7 = AbstractC2194ma.m10380G(i15 << 3);
                        iM10381a2 = size * iM10380G7;
                        iM9800E = iM9821u + iM10381a2;
                    }
                    iM10380G16 += iM9800E;
                    break;
                case 35:
                    iM9798C = C1993bd.m9798C((List) unsafe.getObject(obj, j10));
                    if (iM9798C > 0) {
                        iM10380G10 = AbstractC2194ma.m10380G(i15 << 3);
                        iM10380G11 = AbstractC2194ma.m10380G(iM9798C);
                        iM10380G9 = iM10380G10 + iM10380G11 + iM9798C;
                        iM10380G16 += iM10380G9;
                    }
                    break;
                case 36:
                    iM9798C = C1993bd.m9796A((List) unsafe.getObject(obj, j10));
                    if (iM9798C > 0) {
                        iM10380G10 = AbstractC2194ma.m10380G(i15 << 3);
                        iM10380G11 = AbstractC2194ma.m10380G(iM9798C);
                        iM10380G9 = iM10380G10 + iM10380G11 + iM9798C;
                        iM10380G16 += iM10380G9;
                    }
                    break;
                case 37:
                    iM9798C = C1993bd.m9820t((List) unsafe.getObject(obj, j10));
                    if (iM9798C > 0) {
                        iM10380G10 = AbstractC2194ma.m10380G(i15 << 3);
                        iM10380G11 = AbstractC2194ma.m10380G(iM9798C);
                        iM10380G9 = iM10380G10 + iM10380G11 + iM9798C;
                        iM10380G16 += iM10380G9;
                    }
                    break;
                case 38:
                    iM9798C = C1993bd.m9821u((List) unsafe.getObject(obj, j10));
                    if (iM9798C > 0) {
                        iM10380G10 = AbstractC2194ma.m10380G(i15 << 3);
                        iM10380G11 = AbstractC2194ma.m10380G(iM9798C);
                        iM10380G9 = iM10380G10 + iM10380G11 + iM9798C;
                        iM10380G16 += iM10380G9;
                    }
                    break;
                case 39:
                    iM9798C = C1993bd.m9824x((List) unsafe.getObject(obj, j10));
                    if (iM9798C > 0) {
                        iM10380G10 = AbstractC2194ma.m10380G(i15 << 3);
                        iM10380G11 = AbstractC2194ma.m10380G(iM9798C);
                        iM10380G9 = iM10380G10 + iM10380G11 + iM9798C;
                        iM10380G16 += iM10380G9;
                    }
                    break;
                case 40:
                    iM9798C = C1993bd.m9798C((List) unsafe.getObject(obj, j10));
                    if (iM9798C > 0) {
                        iM10380G10 = AbstractC2194ma.m10380G(i15 << 3);
                        iM10380G11 = AbstractC2194ma.m10380G(iM9798C);
                        iM10380G9 = iM10380G10 + iM10380G11 + iM9798C;
                        iM10380G16 += iM10380G9;
                    }
                    break;
                case 41:
                    iM9798C = C1993bd.m9796A((List) unsafe.getObject(obj, j10));
                    if (iM9798C > 0) {
                        iM10380G10 = AbstractC2194ma.m10380G(i15 << 3);
                        iM10380G11 = AbstractC2194ma.m10380G(iM9798C);
                        iM10380G9 = iM10380G10 + iM10380G11 + iM9798C;
                        iM10380G16 += iM10380G9;
                    }
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(obj, j10);
                    AbstractC2179ld abstractC2179ld12 = C1993bd.f8114a;
                    iM9798C = list12.size();
                    if (iM9798C > 0) {
                        iM10380G10 = AbstractC2194ma.m10380G(i15 << 3);
                        iM10380G11 = AbstractC2194ma.m10380G(iM9798C);
                        iM10380G9 = iM10380G10 + iM10380G11 + iM9798C;
                        iM10380G16 += iM10380G9;
                    }
                    break;
                case 43:
                    iM9798C = C1993bd.m9825y((List) unsafe.getObject(obj, j10));
                    if (iM9798C > 0) {
                        iM10380G10 = AbstractC2194ma.m10380G(i15 << 3);
                        iM10380G11 = AbstractC2194ma.m10380G(iM9798C);
                        iM10380G9 = iM10380G10 + iM10380G11 + iM9798C;
                        iM10380G16 += iM10380G9;
                    }
                    break;
                case 44:
                    iM9798C = C1993bd.m9823w((List) unsafe.getObject(obj, j10));
                    if (iM9798C > 0) {
                        iM10380G10 = AbstractC2194ma.m10380G(i15 << 3);
                        iM10380G11 = AbstractC2194ma.m10380G(iM9798C);
                        iM10380G9 = iM10380G10 + iM10380G11 + iM9798C;
                        iM10380G16 += iM10380G9;
                    }
                    break;
                case 45:
                    iM9798C = C1993bd.m9796A((List) unsafe.getObject(obj, j10));
                    if (iM9798C > 0) {
                        iM10380G10 = AbstractC2194ma.m10380G(i15 << 3);
                        iM10380G11 = AbstractC2194ma.m10380G(iM9798C);
                        iM10380G9 = iM10380G10 + iM10380G11 + iM9798C;
                        iM10380G16 += iM10380G9;
                    }
                    break;
                case 46:
                    iM9798C = C1993bd.m9798C((List) unsafe.getObject(obj, j10));
                    if (iM9798C > 0) {
                        iM10380G10 = AbstractC2194ma.m10380G(i15 << 3);
                        iM10380G11 = AbstractC2194ma.m10380G(iM9798C);
                        iM10380G9 = iM10380G10 + iM10380G11 + iM9798C;
                        iM10380G16 += iM10380G9;
                    }
                    break;
                case 47:
                    iM9798C = C1993bd.m9826z((List) unsafe.getObject(obj, j10));
                    if (iM9798C > 0) {
                        iM10380G10 = AbstractC2194ma.m10380G(i15 << 3);
                        iM10380G11 = AbstractC2194ma.m10380G(iM9798C);
                        iM10380G9 = iM10380G10 + iM10380G11 + iM9798C;
                        iM10380G16 += iM10380G9;
                    }
                    break;
                case 48:
                    iM9798C = C1993bd.m9822v((List) unsafe.getObject(obj, j10));
                    if (iM9798C > 0) {
                        iM10380G10 = AbstractC2194ma.m10380G(i15 << 3);
                        iM10380G11 = AbstractC2194ma.m10380G(iM9798C);
                        iM10380G9 = iM10380G10 + iM10380G11 + iM9798C;
                        iM10380G16 += iM10380G9;
                    }
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j10);
                    InterfaceC2430zc interfaceC2430zcM10647C2 = c2286rc.m10647C(i11);
                    AbstractC2179ld abstractC2179ld13 = C1993bd.f8114a;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iM10385g = 0;
                    } else {
                        iM10385g = 0;
                        for (int i26 = 0; i26 < size6; i26++) {
                            iM10385g += AbstractC2194ma.m10385g(i15, (InterfaceC2232oc) list13.get(i26), interfaceC2430zcM10647C2);
                        }
                    }
                    iM10380G16 += iM10385g;
                    break;
                case 50:
                    C2125ic c2125ic = (C2125ic) unsafe.getObject(obj, j10);
                    C2106hc c2106hc = (C2106hc) c2286rc.m10648D(i11);
                    if (c2125ic.isEmpty()) {
                        iM9820t = 0;
                    } else {
                        iM9820t = 0;
                        for (Map.Entry entry2 : c2125ic.entrySet()) {
                            iM9820t += c2106hc.m10199d(i15, entry2.getKey(), entry2.getValue());
                        }
                    }
                    iM10380G16 += iM9820t;
                    break;
                case 51:
                    if (c2286rc.m10666r(obj, i15, i11)) {
                        iM10380G12 = AbstractC2194ma.m10380G(i15 << 3);
                        iM9800E = iM10380G12 + 8;
                        iM10380G16 += iM9800E;
                    }
                    break;
                case 52:
                    if (c2286rc.m10666r(obj, i15, i11)) {
                        iM10380G13 = AbstractC2194ma.m10380G(i15 << 3);
                        iM9800E = iM10380G13 + 4;
                        iM10380G16 += iM9800E;
                    }
                    break;
                case 53:
                    if (c2286rc.m10666r(obj, i15, i11)) {
                        long jM10638l = m10638l(obj, j10);
                        iM9821u = AbstractC2194ma.m10380G(i15 << 3);
                        iM10381a2 = AbstractC2194ma.m10381a(jM10638l);
                        iM9800E = iM9821u + iM10381a2;
                        iM10380G16 += iM9800E;
                    }
                    break;
                case 54:
                    if (c2286rc.m10666r(obj, i15, i11)) {
                        long jM10638l2 = m10638l(obj, j10);
                        iM9821u = AbstractC2194ma.m10380G(i15 << 3);
                        iM10381a2 = AbstractC2194ma.m10381a(jM10638l2);
                        iM9800E = iM9821u + iM10381a2;
                        iM10380G16 += iM9800E;
                    }
                    break;
                case 55:
                    if (c2286rc.m10666r(obj, i15, i11)) {
                        long jM10637k = m10637k(obj, j10);
                        iM9821u = AbstractC2194ma.m10380G(i15 << 3);
                        iM10381a2 = AbstractC2194ma.m10381a(jM10637k);
                        iM9800E = iM9821u + iM10381a2;
                        iM10380G16 += iM9800E;
                    }
                    break;
                case 56:
                    if (c2286rc.m10666r(obj, i15, i11)) {
                        iM10380G12 = AbstractC2194ma.m10380G(i15 << 3);
                        iM9800E = iM10380G12 + 8;
                        iM10380G16 += iM9800E;
                    }
                    break;
                case 57:
                    if (c2286rc.m10666r(obj, i15, i11)) {
                        iM10380G13 = AbstractC2194ma.m10380G(i15 << 3);
                        iM9800E = iM10380G13 + 4;
                        iM10380G16 += iM9800E;
                    }
                    break;
                case 58:
                    if (c2286rc.m10666r(obj, i15, i11)) {
                        iM9800E = AbstractC2194ma.m10380G(i15 << 3) + 1;
                        iM10380G16 += iM9800E;
                    }
                    break;
                case 59:
                    if (c2286rc.m10666r(obj, i15, i11)) {
                        int i27 = i15 << 3;
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof AbstractC2104ha) {
                            iM10380G14 = AbstractC2194ma.m10380G(i27);
                            iMo9871d2 = ((AbstractC2104ha) object2).mo9871d();
                            iM10380G15 = AbstractC2194ma.m10380G(iMo9871d2);
                            iM9800E = iM10380G14 + iM10380G15 + iMo9871d2;
                            iM10380G16 += iM9800E;
                        } else {
                            iM9821u = AbstractC2194ma.m10380G(i27);
                            iM10381a2 = AbstractC2194ma.m10382b((String) object2);
                            iM9800E = iM9821u + iM10381a2;
                            iM10380G16 += iM9800E;
                        }
                    }
                    break;
                case 60:
                    if (c2286rc.m10666r(obj, i15, i11)) {
                        iM9800E = C1993bd.m9800E(i15, unsafe.getObject(obj, j10), c2286rc.m10647C(i11));
                        iM10380G16 += iM9800E;
                    }
                    break;
                case 61:
                    if (c2286rc.m10666r(obj, i15, i11)) {
                        AbstractC2104ha abstractC2104ha2 = (AbstractC2104ha) unsafe.getObject(obj, j10);
                        iM10380G14 = AbstractC2194ma.m10380G(i15 << 3);
                        iMo9871d2 = abstractC2104ha2.mo9871d();
                        iM10380G15 = AbstractC2194ma.m10380G(iMo9871d2);
                        iM9800E = iM10380G14 + iM10380G15 + iMo9871d2;
                        iM10380G16 += iM9800E;
                    }
                    break;
                case 62:
                    if (c2286rc.m10666r(obj, i15, i11)) {
                        int iM10637k = m10637k(obj, j10);
                        iM9821u = AbstractC2194ma.m10380G(i15 << 3);
                        iM10381a2 = AbstractC2194ma.m10380G(iM10637k);
                        iM9800E = iM9821u + iM10381a2;
                        iM10380G16 += iM9800E;
                    }
                    break;
                case 63:
                    if (c2286rc.m10666r(obj, i15, i11)) {
                        long jM10637k2 = m10637k(obj, j10);
                        iM9821u = AbstractC2194ma.m10380G(i15 << 3);
                        iM10381a2 = AbstractC2194ma.m10381a(jM10637k2);
                        iM9800E = iM9821u + iM10381a2;
                        iM10380G16 += iM9800E;
                    }
                    break;
                case 64:
                    if (c2286rc.m10666r(obj, i15, i11)) {
                        iM10380G13 = AbstractC2194ma.m10380G(i15 << 3);
                        iM9800E = iM10380G13 + 4;
                        iM10380G16 += iM9800E;
                    }
                    break;
                case 65:
                    if (c2286rc.m10666r(obj, i15, i11)) {
                        iM10380G12 = AbstractC2194ma.m10380G(i15 << 3);
                        iM9800E = iM10380G12 + 8;
                        iM10380G16 += iM9800E;
                    }
                    break;
                case 66:
                    if (c2286rc.m10666r(obj, i15, i11)) {
                        int iM10637k2 = m10637k(obj, j10);
                        iM9821u = AbstractC2194ma.m10380G(i15 << 3);
                        iM10381a2 = AbstractC2194ma.m10380G((iM10637k2 >> 31) ^ (iM10637k2 + iM10637k2));
                        iM9800E = iM9821u + iM10381a2;
                        iM10380G16 += iM9800E;
                    }
                    break;
                case 67:
                    if (c2286rc.m10666r(obj, i15, i11)) {
                        long jM10638l3 = m10638l(obj, j10);
                        iM9821u = AbstractC2194ma.m10380G(i15 << 3);
                        iM10381a2 = AbstractC2194ma.m10381a((jM10638l3 >> 63) ^ (jM10638l3 + jM10638l3));
                        iM9800E = iM9821u + iM10381a2;
                        iM10380G16 += iM9800E;
                    }
                    break;
                case 68:
                    if (c2286rc.m10666r(obj, i15, i11)) {
                        iM9800E = AbstractC2194ma.m10385g(i15, (InterfaceC2232oc) unsafe.getObject(obj, j10), c2286rc.m10647C(i11));
                        iM10380G16 += iM9800E;
                    }
                    break;
            }
            i11 += 3;
        }
    }
}
