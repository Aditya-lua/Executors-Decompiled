package com.google.crypto.tink.shaded.protobuf;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.v0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2962v0<T> implements InterfaceC2919g1<T> {

    /* JADX INFO: renamed from: r */
    public static final int[] f11105r = new int[0];

    /* JADX INFO: renamed from: s */
    public static final Unsafe f11106s = C2949q1.m14069D();

    /* JADX INFO: renamed from: a */
    public final int[] f11107a;

    /* JADX INFO: renamed from: b */
    public final Object[] f11108b;

    /* JADX INFO: renamed from: c */
    public final int f11109c;

    /* JADX INFO: renamed from: d */
    public final int f11110d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2954s0 f11111e;

    /* JADX INFO: renamed from: f */
    public final boolean f11112f;

    /* JADX INFO: renamed from: g */
    public final boolean f11113g;

    /* JADX INFO: renamed from: h */
    public final EnumC2904b1 f11114h;

    /* JADX INFO: renamed from: i */
    public final boolean f11115i;

    /* JADX INFO: renamed from: j */
    public final int[] f11116j;

    /* JADX INFO: renamed from: k */
    public final int f11117k;

    /* JADX INFO: renamed from: l */
    public final int f11118l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC2966x0 f11119m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC2918g0 f11120n;

    /* JADX INFO: renamed from: o */
    public final AbstractC2940n1<?, ?> f11121o;

    /* JADX INFO: renamed from: p */
    public final AbstractC2947q<?> f11122p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC2939n0 f11123q;

    public C2962v0(int[] iArr, Object[] objArr, int i10, int i11, InterfaceC2954s0 interfaceC2954s0, EnumC2904b1 enumC2904b1, boolean z10, int[] iArr2, int i12, int i13, InterfaceC2966x0 interfaceC2966x0, InterfaceC2918g0 interfaceC2918g0, AbstractC2940n1<?, ?> abstractC2940n1, AbstractC2947q<?> abstractC2947q, InterfaceC2939n0 interfaceC2939n0) {
        this.f11107a = iArr;
        this.f11108b = objArr;
        this.f11109c = i10;
        this.f11110d = i11;
        this.f11113g = interfaceC2954s0 instanceof AbstractC2967y;
        this.f11114h = enumC2904b1;
        this.f11112f = abstractC2947q != null && abstractC2947q.mo14060e(interfaceC2954s0);
        this.f11115i = z10;
        this.f11116j = iArr2;
        this.f11117k = i12;
        this.f11118l = i13;
        this.f11119m = interfaceC2966x0;
        this.f11120n = interfaceC2918g0;
        this.f11121o = abstractC2940n1;
        this.f11122p = abstractC2947q;
        this.f11111e = interfaceC2954s0;
        this.f11123q = interfaceC2939n0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.google.crypto.tink.shaded.protobuf.g1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C */
    public static boolean m14220C(Object obj, int i10, InterfaceC2919g1 interfaceC2919g1) {
        return interfaceC2919g1.mo13542c(C2949q1.m14068C(obj, m14228W(i10)));
    }

    /* JADX INFO: renamed from: D */
    public static boolean m14221D(int i10) {
        return (i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0;
    }

    /* JADX INFO: renamed from: G */
    public static boolean m14222G(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC2967y) {
            return ((AbstractC2967y) obj).m14324J();
        }
        return true;
    }

    /* JADX INFO: renamed from: J */
    public static boolean m14223J(int i10) {
        return (i10 & 268435456) != 0;
    }

    /* JADX INFO: renamed from: K */
    public static <T> long m14224K(T t8, long j10) {
        return C2949q1.m14066A(t8, j10);
    }

    /* JADX INFO: renamed from: S */
    public static <T> C2962v0<T> m14225S(Class<T> cls, InterfaceC2948q0 interfaceC2948q0, InterfaceC2966x0 interfaceC2966x0, InterfaceC2918g0 interfaceC2918g0, AbstractC2940n1<?, ?> abstractC2940n1, AbstractC2947q<?> abstractC2947q, InterfaceC2939n0 interfaceC2939n0) {
        return interfaceC2948q0 instanceof C2913e1 ? m14227U((C2913e1) interfaceC2948q0, interfaceC2966x0, interfaceC2918g0, abstractC2940n1, abstractC2947q, interfaceC2939n0) : m14226T((C2931k1) interfaceC2948q0, interfaceC2966x0, interfaceC2918g0, abstractC2940n1, abstractC2947q, interfaceC2939n0);
    }

    /* JADX INFO: renamed from: T */
    public static <T> C2962v0<T> m14226T(C2931k1 c2931k1, InterfaceC2966x0 interfaceC2966x0, InterfaceC2918g0 interfaceC2918g0, AbstractC2940n1<?, ?> abstractC2940n1, AbstractC2947q<?> abstractC2947q, InterfaceC2939n0 interfaceC2939n0) {
        C2956t[] c2956tArrM13879e = c2931k1.m13879e();
        if (c2956tArrM13879e.length != 0) {
            C2956t c2956t = c2956tArrM13879e[0];
            throw null;
        }
        int length = c2956tArrM13879e.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        if (c2956tArrM13879e.length > 0) {
            C2956t c2956t2 = c2956tArrM13879e[0];
            throw null;
        }
        int[] iArrM13878d = c2931k1.m13878d();
        if (iArrM13878d == null) {
            iArrM13878d = f11105r;
        }
        if (c2956tArrM13879e.length > 0) {
            C2956t c2956t3 = c2956tArrM13879e[0];
            throw null;
        }
        int[] iArr2 = f11105r;
        int[] iArr3 = f11105r;
        int[] iArr4 = new int[iArrM13878d.length + iArr2.length + iArr3.length];
        System.arraycopy(iArrM13878d, 0, iArr4, 0, iArrM13878d.length);
        System.arraycopy(iArr2, 0, iArr4, iArrM13878d.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, iArrM13878d.length + iArr2.length, iArr3.length);
        return new C2962v0<>(iArr, objArr, 0, 0, c2931k1.mo13476b(), c2931k1.mo13477c(), true, iArr4, iArrM13878d.length, iArrM13878d.length + iArr2.length, interfaceC2966x0, interfaceC2918g0, abstractC2940n1, abstractC2947q, interfaceC2939n0);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0251  */
    /* JADX WARN: Code duplicated, block: B:122:0x0254  */
    /* JADX WARN: Code duplicated, block: B:125:0x026b  */
    /* JADX WARN: Code duplicated, block: B:126:0x026e  */
    /* JADX WARN: Code duplicated, block: B:163:0x0326  */
    /* JADX WARN: Code duplicated, block: B:180:0x0375  */
    /* JADX WARN: Code duplicated, block: B:183:0x0383  */
    /* JADX INFO: renamed from: U */
    public static <T> C2962v0<T> m14227U(C2913e1 c2913e1, InterfaceC2966x0 interfaceC2966x0, InterfaceC2918g0 interfaceC2918g0, AbstractC2940n1<?, ?> abstractC2940n1, AbstractC2947q<?> abstractC2947q, InterfaceC2939n0 interfaceC2939n0) {
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
        Field fieldM14236n0;
        char cCharAt9;
        int i32;
        int i33;
        int i34;
        Object obj;
        Field fieldM14236n1;
        int i35;
        Object obj2;
        Field fieldM14236n2;
        int i36;
        char cCharAt10;
        int i37;
        char cCharAt11;
        int i38;
        char cCharAt12;
        int i39;
        char cCharAt13;
        String strM13479e = c2913e1.m13479e();
        int length = strM13479e.length();
        char c10 = 55296;
        if (strM13479e.charAt(0) >= 55296) {
            int i40 = 1;
            while (true) {
                i10 = i40 + 1;
                if (strM13479e.charAt(i40) < 55296) {
                    break;
                }
                i40 = i10;
            }
        } else {
            i10 = 1;
        }
        int i41 = i10 + 1;
        int iCharAt2 = strM13479e.charAt(i10);
        if (iCharAt2 >= 55296) {
            int i42 = iCharAt2 & 8191;
            int i43 = 13;
            while (true) {
                i39 = i41 + 1;
                cCharAt13 = strM13479e.charAt(i41);
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
            iArr = f11105r;
            i14 = 0;
        } else {
            int i44 = i41 + 1;
            int iCharAt3 = strM13479e.charAt(i41);
            if (iCharAt3 >= 55296) {
                int i45 = iCharAt3 & 8191;
                int i46 = 13;
                while (true) {
                    i24 = i44 + 1;
                    cCharAt8 = strM13479e.charAt(i44);
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
            int iCharAt4 = strM13479e.charAt(i44);
            if (iCharAt4 >= 55296) {
                int i48 = iCharAt4 & 8191;
                int i49 = 13;
                while (true) {
                    i23 = i47 + 1;
                    cCharAt7 = strM13479e.charAt(i47);
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
            int iCharAt5 = strM13479e.charAt(i47);
            if (iCharAt5 >= 55296) {
                int i51 = iCharAt5 & 8191;
                int i52 = 13;
                while (true) {
                    i22 = i50 + 1;
                    cCharAt6 = strM13479e.charAt(i50);
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
            int iCharAt6 = strM13479e.charAt(i50);
            if (iCharAt6 >= 55296) {
                int i54 = iCharAt6 & 8191;
                int i55 = 13;
                while (true) {
                    i21 = i53 + 1;
                    cCharAt5 = strM13479e.charAt(i53);
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
            iCharAt = strM13479e.charAt(i53);
            if (iCharAt >= 55296) {
                int i57 = iCharAt & 8191;
                int i58 = 13;
                while (true) {
                    i20 = i56 + 1;
                    cCharAt4 = strM13479e.charAt(i56);
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
            int iCharAt7 = strM13479e.charAt(i56);
            if (iCharAt7 >= 55296) {
                int i60 = iCharAt7 & 8191;
                int i61 = 13;
                while (true) {
                    i19 = i59 + 1;
                    cCharAt3 = strM13479e.charAt(i59);
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
            int iCharAt8 = strM13479e.charAt(i59);
            if (iCharAt8 >= 55296) {
                int i63 = iCharAt8 & 8191;
                int i64 = 13;
                while (true) {
                    i18 = i62 + 1;
                    cCharAt2 = strM13479e.charAt(i62);
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
            int iCharAt9 = strM13479e.charAt(i62);
            if (iCharAt9 >= 55296) {
                int i66 = iCharAt9 & 8191;
                int i67 = 13;
                while (true) {
                    i17 = i65 + 1;
                    cCharAt = strM13479e.charAt(i65);
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
        Unsafe unsafe = f11106s;
        Object[] objArrM13478d = c2913e1.m13478d();
        Class<?> cls = c2913e1.mo13476b().getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt * 2];
        int i69 = i15 + i13;
        int i70 = i69;
        int i71 = i15;
        int i72 = 0;
        int i73 = 0;
        while (i41 < length) {
            int i74 = i41 + 1;
            int iCharAt10 = strM13479e.charAt(i41);
            if (iCharAt10 >= c10) {
                int i75 = iCharAt10 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i38 = i76 + 1;
                    cCharAt12 = strM13479e.charAt(i76);
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
            int iCharAt11 = strM13479e.charAt(i25);
            if (iCharAt11 >= c10) {
                int i79 = iCharAt11 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i37 = i80 + 1;
                    cCharAt11 = strM13479e.charAt(i80);
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
            if ((iCharAt11 & 1024) != 0) {
                iArr[i72] = i73;
                i72++;
            }
            int[] iArr4 = iArr3;
            if (i82 >= 51) {
                int i84 = i26 + 1;
                int iCharAt12 = strM13479e.charAt(i26);
                char c11 = 55296;
                if (iCharAt12 >= 55296) {
                    int i85 = iCharAt12 & 8191;
                    int i86 = 13;
                    while (true) {
                        i36 = i84 + 1;
                        cCharAt10 = strM13479e.charAt(i84);
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
                    objArr[((i73 / 3) * 2) + 1] = objArrM13478d[i11];
                } else {
                    if (i87 == 12 && (c2913e1.mo13477c().equals(EnumC2904b1.PROTO2) || (iCharAt11 & 2048) != 0)) {
                        i33 = i11 + 1;
                        objArr[((i73 / 3) * 2) + 1] = objArrM13478d[i11];
                    }
                    i34 = iCharAt12 * 2;
                    obj = objArrM13478d[i34];
                    if (obj instanceof Field) {
                        fieldM14236n1 = (Field) obj;
                    } else {
                        fieldM14236n1 = m14236n0(cls, (String) obj);
                        objArrM13478d[i34] = fieldM14236n1;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldM14236n1);
                    i35 = i34 + 1;
                    obj2 = objArrM13478d[i35];
                    if (obj2 instanceof Field) {
                        fieldM14236n2 = (Field) obj2;
                    } else {
                        fieldM14236n2 = m14236n0(cls, (String) obj2);
                        objArrM13478d[i35] = fieldM14236n2;
                    }
                    strM13479e = strM13479e;
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM14236n2);
                    i31 = iObjectFieldOffset4;
                    i30 = 0;
                    i27 = iCharAt10;
                    i41 = i88;
                }
                i11 = i33;
                i34 = iCharAt12 * 2;
                obj = objArrM13478d[i34];
                if (obj instanceof Field) {
                    fieldM14236n1 = (Field) obj;
                } else {
                    fieldM14236n1 = m14236n0(cls, (String) obj);
                    objArrM13478d[i34] = fieldM14236n1;
                }
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldM14236n1);
                i35 = i34 + 1;
                obj2 = objArrM13478d[i35];
                if (obj2 instanceof Field) {
                    fieldM14236n2 = (Field) obj2;
                } else {
                    fieldM14236n2 = m14236n0(cls, (String) obj2);
                    objArrM13478d[i35] = fieldM14236n2;
                }
                strM13479e = strM13479e;
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM14236n2);
                i31 = iObjectFieldOffset5;
                i30 = 0;
                i27 = iCharAt10;
                i41 = i88;
            } else {
                int i89 = i11 + 1;
                Field fieldM14236n3 = m14236n0(cls, (String) objArrM13478d[i11]);
                if (i82 == 9 || i82 == 17) {
                    i27 = iCharAt10;
                    objArr[((i73 / 3) * 2) + 1] = fieldM14236n3.getType();
                } else {
                    if (i82 == 27 || i82 == 49) {
                        i27 = iCharAt10;
                        i32 = i11 + 2;
                        objArr[((i73 / 3) * 2) + 1] = objArrM13478d[i89];
                    } else if (i82 == 12 || i82 == 30 || i82 == 44) {
                        i27 = iCharAt10;
                        if (c2913e1.mo13477c() == EnumC2904b1.PROTO2 || (iCharAt11 & 2048) != 0) {
                            i32 = i11 + 2;
                            objArr[((i73 / 3) * 2) + 1] = objArrM13478d[i89];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM14236n3);
                        if ((iCharAt11 & 4096) != 0 || i82 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i29 = i26;
                            i30 = 0;
                        } else {
                            int i90 = i26 + 1;
                            int iCharAt13 = strM13479e.charAt(i26);
                            if (iCharAt13 >= 55296) {
                                int i91 = iCharAt13 & 8191;
                                int i92 = 13;
                                while (true) {
                                    i29 = i90 + 1;
                                    cCharAt9 = strM13479e.charAt(i90);
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
                            Object obj3 = objArrM13478d[i93];
                            if (obj3 instanceof Field) {
                                fieldM14236n0 = (Field) obj3;
                            } else {
                                fieldM14236n0 = m14236n0(cls, (String) obj3);
                                objArrM13478d[i93] = fieldM14236n0;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM14236n0);
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
                            objArr[i96] = objArrM13478d[i89];
                            if ((iCharAt11 & 2048) != 0) {
                                i28 = i11 + 3;
                                objArr[i96 + 1] = objArrM13478d[i97];
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
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM14236n3);
                        if ((iCharAt11 & 4096) != 0) {
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
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM14236n3);
                    if ((iCharAt11 & 4096) != 0) {
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
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM14236n3);
                if ((iCharAt11 & 4096) != 0) {
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
            iArr4[i100] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? EditorInfoCompat.IME_FLAG_FORCE_ASCII : 0) | (i82 << 20) | i31;
            i73 += 3;
            iArr4[i101] = (i30 << 20) | i102;
            length = i83;
            iArr3 = iArr4;
            strM13479e = strM13479e;
            c10 = 55296;
        }
        return new C2962v0<>(iArr3, objArr, i12, i16, c2913e1.mo13476b(), c2913e1.mo13477c(), false, iArr, i15, i69, interfaceC2966x0, interfaceC2918g0, abstractC2940n1, abstractC2947q, interfaceC2939n0);
    }

    /* JADX INFO: renamed from: W */
    public static long m14228W(int i10) {
        return i10 & 1048575;
    }

    /* JADX INFO: renamed from: X */
    public static <T> boolean m14229X(T t8, long j10) {
        return ((Boolean) C2949q1.m14068C(t8, j10)).booleanValue();
    }

    /* JADX INFO: renamed from: Y */
    public static <T> double m14230Y(T t8, long j10) {
        return ((Double) C2949q1.m14068C(t8, j10)).doubleValue();
    }

    /* JADX INFO: renamed from: Z */
    public static <T> float m14231Z(T t8, long j10) {
        return ((Float) C2949q1.m14068C(t8, j10)).floatValue();
    }

    /* JADX INFO: renamed from: a0 */
    public static <T> int m14232a0(T t8, long j10) {
        return ((Integer) C2949q1.m14068C(t8, j10)).intValue();
    }

    /* JADX INFO: renamed from: b0 */
    public static <T> long m14233b0(T t8, long j10) {
        return ((Long) C2949q1.m14068C(t8, j10)).longValue();
    }

    /* JADX INFO: renamed from: l */
    public static <T> boolean m14234l(T t8, long j10) {
        return C2949q1.m14103r(t8, j10);
    }

    /* JADX INFO: renamed from: m */
    public static void m14235m(Object obj) {
        if (m14222G(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    /* JADX INFO: renamed from: n0 */
    public static Field m14236n0(Class<?> cls, String str) {
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

    /* JADX INFO: renamed from: o */
    public static <T> double m14237o(T t8, long j10) {
        return C2949q1.m14109x(t8, j10);
    }

    /* JADX INFO: renamed from: s */
    public static <T> float m14238s(T t8, long j10) {
        return C2949q1.m14110y(t8, j10);
    }

    /* JADX INFO: renamed from: t0 */
    public static int m14239t0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    /* JADX INFO: renamed from: w */
    public static C2943o1 m14240w(Object obj) {
        AbstractC2967y abstractC2967y = (AbstractC2967y) obj;
        C2943o1 c2943o1 = abstractC2967y.unknownFields;
        if (c2943o1 != C2943o1.m14017c()) {
            return c2943o1;
        }
        C2943o1 c2943o1M14021k = C2943o1.m14021k();
        abstractC2967y.unknownFields = c2943o1M14021k;
        return c2943o1M14021k;
    }

    /* JADX INFO: renamed from: y */
    public static <T> int m14241y(T t8, long j10) {
        return C2949q1.m14111z(t8, j10);
    }

    /* JADX INFO: renamed from: z */
    public static boolean m14242z(int i10) {
        return (i10 & 536870912) != 0;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m14243A(T t8, int i10) {
        boolean zEquals;
        int iM14263i0 = m14263i0(i10);
        long j10 = 1048575 & iM14263i0;
        if (j10 != 1048575) {
            return (C2949q1.m14111z(t8, j10) & (1 << (iM14263i0 >>> 20))) != 0;
        }
        int iM14280u0 = m14280u0(i10);
        long jM14228W = m14228W(iM14280u0);
        switch (m14239t0(iM14280u0)) {
            case 0:
                return Double.doubleToRawLongBits(C2949q1.m14109x(t8, jM14228W)) != 0;
            case 1:
                return Float.floatToRawIntBits(C2949q1.m14110y(t8, jM14228W)) != 0;
            case 2:
                return C2949q1.m14066A(t8, jM14228W) != 0;
            case 3:
                return C2949q1.m14066A(t8, jM14228W) != 0;
            case 4:
                return C2949q1.m14111z(t8, jM14228W) != 0;
            case 5:
                return C2949q1.m14066A(t8, jM14228W) != 0;
            case 6:
                return C2949q1.m14111z(t8, jM14228W) != 0;
            case 7:
                return C2949q1.m14103r(t8, jM14228W);
            case 8:
                Object objM14068C = C2949q1.m14068C(t8, jM14228W);
                if (objM14068C instanceof String) {
                    zEquals = ((String) objM14068C).isEmpty();
                } else {
                    if (!(objM14068C instanceof AbstractC2920h)) {
                        throw new IllegalArgumentException();
                    }
                    zEquals = AbstractC2920h.f10853b.equals(objM14068C);
                }
                break;
            case 9:
                return C2949q1.m14068C(t8, jM14228W) != null;
            case 10:
                zEquals = AbstractC2920h.f10853b.equals(C2949q1.m14068C(t8, jM14228W));
                break;
            case 11:
                return C2949q1.m14111z(t8, jM14228W) != 0;
            case 12:
                return C2949q1.m14111z(t8, jM14228W) != 0;
            case 13:
                return C2949q1.m14111z(t8, jM14228W) != 0;
            case 14:
                return C2949q1.m14066A(t8, jM14228W) != 0;
            case 15:
                return C2949q1.m14111z(t8, jM14228W) != 0;
            case 16:
                return C2949q1.m14066A(t8, jM14228W) != 0;
            case 17:
                return C2949q1.m14068C(t8, jM14228W) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !zEquals;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m14244B(T t8, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return m14243A(t8, i10);
        }
        return (i12 & i13) != 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: com.google.crypto.tink.shaded.protobuf.g1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public final <N> boolean m14245E(Object obj, int i10, int i11) {
        List list = (List) C2949q1.m14068C(obj, m14228W(i10));
        if (list.isEmpty()) {
            return true;
        }
        InterfaceC2919g1 interfaceC2919g1M14281v = m14281v(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!interfaceC2919g1M14281v.mo13542c(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m14246F(T t8, int i10, int i11) {
        if (this.f11123q.mo13988e(C2949q1.m14068C(t8, m14228W(i10))).isEmpty()) {
            return true;
        }
        this.f11123q.mo13985b(m14279u(i11));
        throw null;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m14247H(T t8, T t10, int i10) {
        long jM14263i0 = m14263i0(i10) & 1048575;
        return C2949q1.m14111z(t8, jM14263i0) == C2949q1.m14111z(t10, jM14263i0);
    }

    /* JADX INFO: renamed from: I */
    public final boolean m14248I(T t8, int i10, int i11) {
        return C2949q1.m14111z(t8, (long) (m14263i0(i11) & 1048575)) == i10;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 20401. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: L */
    public final <UT, UB, ET extends com.google.crypto.tink.shaded.protobuf.C2959u.b<ET>> void m14249L(com.google.crypto.tink.shaded.protobuf.AbstractC2940n1<UT, UB> r18, com.google.crypto.tink.shaded.protobuf.AbstractC2947q<ET> r19, T r20, com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1 r21, com.google.crypto.tink.shaded.protobuf.C2944p r22) {
        /*
            r17 = this;
            r1 = r17
            r4 = r22
            r0 = 0
            r5 = 0
        L6:
            int r2 = r21.mo13494A()     // Catch: java.lang.Throwable -> L744
            int r3 = r1.m14261g0(r2)     // Catch: java.lang.Throwable -> L744
            r9 = 0
            if (r3 >= 0) goto Ld4
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r3) goto L3f
            int r0 = r1.f11117k
            r4 = r5
        L19:
            int r2 = r1.f11118l
            if (r0 >= r2) goto L32
            int[] r2 = r1.f11116j
            r3 = r2[r0]
            r6 = r20
            r5 = r18
            r2 = r20
            java.lang.Object r4 = r1.m14273q(r2, r3, r4, r5, r6)
            r10 = r1
            r1 = r2
            r6 = r5
            int r0 = r0 + 1
            r1 = r10
            goto L19
        L32:
            r6 = r18
            r10 = r1
            r1 = r20
            if (r4 == 0) goto L3c
            r6.mo14006o(r1, r4)
        L3c:
            r1 = r10
            goto L740
        L3f:
            r6 = r18
            r10 = r1
            r1 = r20
            boolean r3 = r10.f11112f     // Catch: java.lang.Throwable -> Lcc
            if (r3 != 0) goto L4c
            r7 = r19
            r3 = 0
            goto L55
        L4c:
            com.google.crypto.tink.shaded.protobuf.s0 r3 = r10.f11111e     // Catch: java.lang.Throwable -> Lcc
            r7 = r19
            java.lang.Object r2 = r7.mo14057b(r4, r3, r2)     // Catch: java.lang.Throwable -> Lcc
            r3 = r2
        L55:
            if (r3 == 0) goto L81
            if (r0 != 0) goto L5d
            com.google.crypto.tink.shaded.protobuf.u r0 = r19.mo14059d(r20)     // Catch: java.lang.Throwable -> L65
        L5d:
            r2 = r5
            r5 = r0
            r0 = r7
            r7 = r6
            r6 = r2
            r2 = r21
            goto L6b
        L65:
            r0 = move-exception
            r2 = r1
            r12 = r6
            r1 = r10
            goto L74a
        L6b:
            java.lang.Object r3 = r0.mo14062g(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L78
            r6 = r4
            r0 = r5
            r5 = r7
            r4 = r2
            r2 = r1
            r5 = r3
            r4 = r6
            r1 = r10
            goto L6
        L78:
            r0 = move-exception
            r2 = r1
            r11 = r6
            r5 = r7
        L7c:
            r12 = r5
            r1 = r10
        L7e:
            r5 = r11
            goto L74a
        L81:
            r2 = r1
            r11 = r5
            r5 = r6
            r6 = r4
            r4 = r21
            boolean r1 = r5.mo14008q(r4)     // Catch: java.lang.Throwable -> Lc7
            if (r1 == 0) goto L9a
            boolean r1 = r4.mo13497D()     // Catch: java.lang.Throwable -> L98
            if (r1 == 0) goto La8
        L93:
            r4 = r6
            r1 = r10
            r5 = r11
            goto L6
        L98:
            r0 = move-exception
            goto L7c
        L9a:
            if (r11 != 0) goto La1
            java.lang.Object r1 = r5.mo13997f(r2)     // Catch: java.lang.Throwable -> L98
            r11 = r1
        La1:
            boolean r1 = r5.m14004m(r11, r4, r9)     // Catch: java.lang.Throwable -> Lc7
            if (r1 == 0) goto La8
            goto L93
        La8:
            int r0 = r10.f11117k
            r4 = r11
        Lab:
            int r1 = r10.f11118l
            if (r0 >= r1) goto Lbe
            int[] r1 = r10.f11116j
            r3 = r1[r0]
            r6 = r20
            r1 = r10
            java.lang.Object r4 = r1.m14273q(r2, r3, r4, r5, r6)
            r7 = r2
            int r0 = r0 + 1
            goto Lab
        Lbe:
            r7 = r2
            r1 = r10
            if (r4 == 0) goto L740
            r5.mo14006o(r7, r4)
            goto L740
        Lc7:
            r0 = move-exception
            r7 = r2
            r1 = r10
            r12 = r5
            goto L7e
        Lcc:
            r0 = move-exception
            r7 = r1
            r11 = r5
            r5 = r6
            r1 = r10
        Ld1:
            r12 = r5
        Ld2:
            r2 = r7
            goto L7e
        Ld4:
            r7 = r20
            r6 = r4
            r11 = r5
            r5 = r18
            r4 = r21
            int r10 = r1.m14280u0(r3)     // Catch: java.lang.Throwable -> Lef
            int r12 = m14239t0(r10)     // Catch: java.lang.Throwable -> Lef com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf1
            switch(r12) {
                case 0: goto L6de;
                case 1: goto L6cb;
                case 2: goto L6b8;
                case 3: goto L6a5;
                case 4: goto L692;
                case 5: goto L67f;
                case 6: goto L66c;
                case 7: goto L659;
                case 8: goto L64e;
                case 9: goto L63a;
                case 10: goto L627;
                case 11: goto L614;
                case 12: goto L5ed;
                case 13: goto L5da;
                case 14: goto L5c7;
                case 15: goto L5b4;
                case 16: goto L5a1;
                case 17: goto L58d;
                case 18: goto L57b;
                case 19: goto L569;
                case 20: goto L557;
                case 21: goto L545;
                case 22: goto L533;
                case 23: goto L521;
                case 24: goto L50f;
                case 25: goto L4fd;
                case 26: goto L4f5;
                case 27: goto L4dc;
                case 28: goto L4ca;
                case 29: goto L4ae;
                case 30: goto L473;
                case 31: goto L460;
                case 32: goto L44d;
                case 33: goto L43a;
                case 34: goto L427;
                case 35: goto L414;
                case 36: goto L401;
                case 37: goto L3ef;
                case 38: goto L3dd;
                case 39: goto L3cb;
                case 40: goto L3b9;
                case 41: goto L3a7;
                case 42: goto L395;
                case 43: goto L376;
                case 44: goto L33b;
                case 45: goto L328;
                case 46: goto L315;
                case 47: goto L302;
                case 48: goto L2e5;
                case 49: goto L2b7;
                case 50: goto L296;
                case 51: goto L281;
                case 52: goto L26c;
                case 53: goto L257;
                case 54: goto L242;
                case 55: goto L22d;
                case 56: goto L218;
                case 57: goto L203;
                case 58: goto L1ee;
                case 59: goto L1e5;
                case 60: goto L1d2;
                case 61: goto L1c1;
                case 62: goto L1ac;
                case 63: goto L183;
                case 64: goto L16f;
                case 65: goto L15b;
                case 66: goto L147;
                case 67: goto L133;
                case 68: goto L11f;
                default: goto Le7;
            }     // Catch: java.lang.Throwable -> Lef com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf1
        Le7:
            if (r11 != 0) goto Lf6
            java.lang.Object r2 = r5.mo13997f(r7)     // Catch: java.lang.Throwable -> Lef com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf1
            r11 = r2
            goto Lf6
        Lef:
            r0 = move-exception
            goto Ld1
        Lf1:
            r12 = r5
        Lf2:
            r2 = r7
        Lf3:
            r5 = r11
            goto L6f1
        Lf6:
            boolean r2 = r5.m14004m(r11, r4, r9)     // Catch: java.lang.Throwable -> Lef com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf1
            if (r2 != 0) goto L11a
            int r0 = r1.f11117k
            r4 = r11
        Lff:
            int r2 = r1.f11118l
            if (r0 >= r2) goto L112
            int[] r2 = r1.f11116j
            r3 = r2[r0]
            r6 = r20
            r2 = r7
            java.lang.Object r4 = r1.m14273q(r2, r3, r4, r5, r6)
            r12 = r5
            int r0 = r0 + 1
            goto Lff
        L112:
            r12 = r5
            if (r4 == 0) goto L740
            r12.mo14006o(r7, r4)
            goto L740
        L11a:
            r12 = r5
        L11b:
            r2 = r7
        L11c:
            r5 = r11
            goto L741
        L11f:
            r12 = r5
            java.lang.Object r5 = r1.m14255R(r7, r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            com.google.crypto.tink.shaded.protobuf.s0 r5 = (com.google.crypto.tink.shaded.protobuf.InterfaceC2954s0) r5     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            com.google.crypto.tink.shaded.protobuf.g1 r10 = r1.m14281v(r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            r4.mo13503J(r5, r10, r6)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            r1.m14277s0(r7, r2, r3, r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L131:
            r0 = move-exception
            goto Ld2
        L133:
            r12 = r5
            long r13 = m14228W(r10)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            long r15 = r4.mo13534y()     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            java.lang.Long r5 = java.lang.Long.valueOf(r15)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            com.google.crypto.tink.shaded.protobuf.C2949q1.m14083R(r7, r13, r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            r1.m14272p0(r7, r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L147:
            r12 = r5
            long r13 = m14228W(r10)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            int r5 = r4.mo13521l()     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            com.google.crypto.tink.shaded.protobuf.C2949q1.m14083R(r7, r13, r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            r1.m14272p0(r7, r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L15b:
            r12 = r5
            long r13 = m14228W(r10)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            long r15 = r4.mo13515f()     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            java.lang.Long r5 = java.lang.Long.valueOf(r15)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            com.google.crypto.tink.shaded.protobuf.C2949q1.m14083R(r7, r13, r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            r1.m14272p0(r7, r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L16f:
            r12 = r5
            long r13 = m14228W(r10)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            int r5 = r4.mo13498E()     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            com.google.crypto.tink.shaded.protobuf.C2949q1.m14083R(r7, r13, r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            r1.m14272p0(r7, r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L183:
            r12 = r5
            int r5 = r4.mo13520k()     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            com.google.crypto.tink.shaded.protobuf.a0$e r13 = r1.m14278t(r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            if (r13 == 0) goto L19c
            boolean r13 = r13.m13387a(r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            if (r13 == 0) goto L195
            goto L19c
        L195:
            java.lang.Object r5 = com.google.crypto.tink.shaded.protobuf.C2925i1.m13659J(r7, r2, r5, r11, r12)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            r2 = r7
            goto L741
        L19c:
            long r13 = m14228W(r10)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            com.google.crypto.tink.shaded.protobuf.C2949q1.m14083R(r7, r13, r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            r1.m14272p0(r7, r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L1ac:
            r12 = r5
            long r13 = m14228W(r10)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            int r5 = r4.mo13517h()     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            com.google.crypto.tink.shaded.protobuf.C2949q1.m14083R(r7, r13, r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            r1.m14272p0(r7, r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L1c1:
            r12 = r5
            long r13 = m14228W(r10)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            com.google.crypto.tink.shaded.protobuf.h r5 = r4.mo13524o()     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            com.google.crypto.tink.shaded.protobuf.C2949q1.m14083R(r7, r13, r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            r1.m14272p0(r7, r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L1d2:
            r12 = r5
            java.lang.Object r5 = r1.m14255R(r7, r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            com.google.crypto.tink.shaded.protobuf.s0 r5 = (com.google.crypto.tink.shaded.protobuf.InterfaceC2954s0) r5     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            com.google.crypto.tink.shaded.protobuf.g1 r10 = r1.m14281v(r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            r4.mo13506M(r5, r10, r6)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            r1.m14277s0(r7, r2, r3, r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L1e5:
            r12 = r5
            r1.m14267l0(r7, r10, r4)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            r1.m14272p0(r7, r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L1ee:
            r12 = r5
            long r13 = m14228W(r10)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            boolean r5 = r4.mo13514e()     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            com.google.crypto.tink.shaded.protobuf.C2949q1.m14083R(r7, r13, r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            r1.m14272p0(r7, r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L203:
            r12 = r5
            long r13 = m14228W(r10)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            int r5 = r4.mo13530u()     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            com.google.crypto.tink.shaded.protobuf.C2949q1.m14083R(r7, r13, r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            r1.m14272p0(r7, r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L218:
            r12 = r5
            long r13 = m14228W(r10)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            long r15 = r4.mo13511b()     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            java.lang.Long r5 = java.lang.Long.valueOf(r15)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            com.google.crypto.tink.shaded.protobuf.C2949q1.m14083R(r7, r13, r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            r1.m14272p0(r7, r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L22d:
            r12 = r5
            long r13 = m14228W(r10)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            int r5 = r4.mo13525p()     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            com.google.crypto.tink.shaded.protobuf.C2949q1.m14083R(r7, r13, r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            r1.m14272p0(r7, r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L242:
            r12 = r5
            long r13 = m14228W(r10)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            long r15 = r4.mo13528s()     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            java.lang.Long r5 = java.lang.Long.valueOf(r15)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            com.google.crypto.tink.shaded.protobuf.C2949q1.m14083R(r7, r13, r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            r1.m14272p0(r7, r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L257:
            r12 = r5
            long r13 = m14228W(r10)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            long r15 = r4.mo13501H()     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            java.lang.Long r5 = java.lang.Long.valueOf(r15)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            com.google.crypto.tink.shaded.protobuf.C2949q1.m14083R(r7, r13, r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            r1.m14272p0(r7, r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L26c:
            r12 = r5
            long r13 = m14228W(r10)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            float r5 = r4.readFloat()     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            com.google.crypto.tink.shaded.protobuf.C2949q1.m14083R(r7, r13, r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            r1.m14272p0(r7, r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L281:
            r12 = r5
            long r13 = m14228W(r10)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            double r15 = r4.readDouble()     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            java.lang.Double r5 = java.lang.Double.valueOf(r15)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            com.google.crypto.tink.shaded.protobuf.C2949q1.m14083R(r7, r13, r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            r1.m14272p0(r7, r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L296:
            r12 = r5
            java.lang.Object r4 = r1.m14279u(r3)     // Catch: java.lang.Throwable -> L2aa com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L2af
            r5 = r6
            r2 = r7
            r6 = r21
            r1.m14250M(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2aa com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L2af
            r2 = r20
            r4 = r21
            r6 = r22
            goto L11c
        L2aa:
            r0 = move-exception
            r2 = r20
            goto L7e
        L2af:
            r2 = r20
            r4 = r21
            r6 = r22
            goto Lf3
        L2b7:
            r12 = r5
            long r4 = m14228W(r10)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L2af java.lang.Throwable -> L2df
            com.google.crypto.tink.shaded.protobuf.g1 r6 = r1.m14281v(r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L2af java.lang.Throwable -> L2df
            r2 = r20
            r7 = r22
            r3 = r4
            r5 = r21
            r1.m14264j0(r2, r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L2d4 com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L2da
            r7 = r1
            r1 = r2
            r13 = r5
        L2cd:
            r6 = r22
            r2 = r1
        L2d0:
            r1 = r7
            r4 = r13
            goto L11c
        L2d4:
            r0 = move-exception
            r7 = r1
            r1 = r2
        L2d7:
            r1 = r7
            goto L7e
        L2da:
            r6 = r22
            r4 = r5
            goto Lf3
        L2df:
            r0 = move-exception
            r7 = r1
            r1 = r20
        L2e3:
            r2 = r1
            goto L2d7
        L2e5:
            r12 = r7
            r7 = r1
            r1 = r12
            r13 = r4
            r12 = r5
            com.google.crypto.tink.shaded.protobuf.g0 r2 = r7.f11120n     // Catch: java.lang.Throwable -> L2f8 com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L2fa
            long r3 = m14228W(r10)     // Catch: java.lang.Throwable -> L2f8 com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L2fa
            java.util.List r2 = r2.mo13539c(r1, r3)     // Catch: java.lang.Throwable -> L2f8 com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L2fa
            r13.mo13513d(r2)     // Catch: java.lang.Throwable -> L2f8 com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L2fa
            goto L2cd
        L2f8:
            r0 = move-exception
            goto L2e3
        L2fa:
            r6 = r22
            r2 = r1
        L2fd:
            r1 = r7
            r5 = r11
        L2ff:
            r4 = r13
            goto L6f1
        L302:
            r12 = r7
            r7 = r1
            r1 = r12
            r13 = r4
            r12 = r5
            com.google.crypto.tink.shaded.protobuf.g0 r2 = r7.f11120n     // Catch: java.lang.Throwable -> L2f8 com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L2fa
            long r3 = m14228W(r10)     // Catch: java.lang.Throwable -> L2f8 com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L2fa
            java.util.List r2 = r2.mo13539c(r1, r3)     // Catch: java.lang.Throwable -> L2f8 com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L2fa
            r13.mo13527r(r2)     // Catch: java.lang.Throwable -> L2f8 com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L2fa
            goto L2cd
        L315:
            r12 = r7
            r7 = r1
            r1 = r12
            r13 = r4
            r12 = r5
            com.google.crypto.tink.shaded.protobuf.g0 r2 = r7.f11120n     // Catch: java.lang.Throwable -> L2f8 com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L2fa
            long r3 = m14228W(r10)     // Catch: java.lang.Throwable -> L2f8 com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L2fa
            java.util.List r2 = r2.mo13539c(r1, r3)     // Catch: java.lang.Throwable -> L2f8 com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L2fa
            r13.mo13531v(r2)     // Catch: java.lang.Throwable -> L2f8 com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L2fa
            goto L2cd
        L328:
            r12 = r7
            r7 = r1
            r1 = r12
            r13 = r4
            r12 = r5
            com.google.crypto.tink.shaded.protobuf.g0 r2 = r7.f11120n     // Catch: java.lang.Throwable -> L2f8 com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L2fa
            long r3 = m14228W(r10)     // Catch: java.lang.Throwable -> L2f8 com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L2fa
            java.util.List r2 = r2.mo13539c(r1, r3)     // Catch: java.lang.Throwable -> L2f8 com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L2fa
            r13.mo13512c(r2)     // Catch: java.lang.Throwable -> L2f8 com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L2fa
            goto L2cd
        L33b:
            r12 = r7
            r7 = r1
            r1 = r12
            r13 = r4
            r12 = r5
            com.google.crypto.tink.shaded.protobuf.g0 r4 = r7.f11120n     // Catch: java.lang.Throwable -> L370 com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L374
            long r5 = m14228W(r10)     // Catch: java.lang.Throwable -> L370 com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L374
            java.util.List r4 = r4.mo13539c(r1, r5)     // Catch: java.lang.Throwable -> L370 com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L374
            r13.mo13519j(r4)     // Catch: java.lang.Throwable -> L370 com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L374
            r5 = r4
            com.google.crypto.tink.shaded.protobuf.a0$e r4 = r7.m14278t(r3)     // Catch: java.lang.Throwable -> L370 com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L374
            r3 = r5
            r5 = r11
            r6 = r12
            java.lang.Object r5 = com.google.crypto.tink.shaded.protobuf.C2925i1.m13650A(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L362 com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L369
            r2 = r1
            r12 = r18
        L35c:
            r6 = r22
            r1 = r7
            r4 = r13
            goto L741
        L362:
            r0 = move-exception
            r2 = r1
        L364:
            r12 = r18
        L366:
            r1 = r7
            goto L74a
        L369:
            r12 = r18
        L36b:
            r6 = r22
            r2 = r1
        L36e:
            r1 = r7
            goto L2ff
        L370:
            r0 = move-exception
            r2 = r1
            r5 = r11
            goto L364
        L374:
            r5 = r11
            goto L369
        L376:
            r13 = r4
            r2 = r7
            r5 = r11
            r7 = r1
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r7.f11120n     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            long r3 = m14228W(r10)     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            java.util.List r1 = r1.mo13539c(r2, r3)     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            r13.mo13529t(r1)     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
        L387:
            r12 = r18
            r6 = r22
            r11 = r5
            goto L2d0
        L38e:
            r0 = move-exception
            goto L364
        L390:
            r12 = r18
        L392:
            r6 = r22
            goto L36e
        L395:
            r13 = r4
            r2 = r7
            r5 = r11
            r7 = r1
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r7.f11120n     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            long r3 = m14228W(r10)     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            java.util.List r1 = r1.mo13539c(r2, r3)     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            r13.mo13522m(r1)     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            goto L387
        L3a7:
            r13 = r4
            r2 = r7
            r5 = r11
            r7 = r1
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r7.f11120n     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            long r3 = m14228W(r10)     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            java.util.List r1 = r1.mo13539c(r2, r3)     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            r13.mo13533x(r1)     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            goto L387
        L3b9:
            r13 = r4
            r2 = r7
            r5 = r11
            r7 = r1
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r7.f11120n     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            long r3 = m14228W(r10)     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            java.util.List r1 = r1.mo13539c(r2, r3)     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            r13.mo13526q(r1)     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            goto L387
        L3cb:
            r13 = r4
            r2 = r7
            r5 = r11
            r7 = r1
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r7.f11120n     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            long r3 = m14228W(r10)     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            java.util.List r1 = r1.mo13539c(r2, r3)     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            r13.mo13532w(r1)     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            goto L387
        L3dd:
            r13 = r4
            r2 = r7
            r5 = r11
            r7 = r1
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r7.f11120n     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            long r3 = m14228W(r10)     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            java.util.List r1 = r1.mo13539c(r2, r3)     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            r13.mo13516g(r1)     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            goto L387
        L3ef:
            r13 = r4
            r2 = r7
            r5 = r11
            r7 = r1
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r7.f11120n     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            long r3 = m14228W(r10)     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            java.util.List r1 = r1.mo13539c(r2, r3)     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            r13.mo13518i(r1)     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            goto L387
        L401:
            r13 = r4
            r2 = r7
            r5 = r11
            r7 = r1
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r7.f11120n     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            long r3 = m14228W(r10)     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            java.util.List r1 = r1.mo13539c(r2, r3)     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            r13.mo13496C(r1)     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            goto L387
        L414:
            r13 = r4
            r2 = r7
            r5 = r11
            r7 = r1
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r7.f11120n     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            long r3 = m14228W(r10)     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            java.util.List r1 = r1.mo13539c(r2, r3)     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            r13.mo13500G(r1)     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            goto L387
        L427:
            r13 = r4
            r2 = r7
            r5 = r11
            r7 = r1
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r7.f11120n     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            long r3 = m14228W(r10)     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            java.util.List r1 = r1.mo13539c(r2, r3)     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            r13.mo13513d(r1)     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            goto L387
        L43a:
            r13 = r4
            r2 = r7
            r5 = r11
            r7 = r1
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r7.f11120n     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            long r3 = m14228W(r10)     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            java.util.List r1 = r1.mo13539c(r2, r3)     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            r13.mo13527r(r1)     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            goto L387
        L44d:
            r13 = r4
            r2 = r7
            r5 = r11
            r7 = r1
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r7.f11120n     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            long r3 = m14228W(r10)     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            java.util.List r1 = r1.mo13539c(r2, r3)     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            r13.mo13531v(r1)     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            goto L387
        L460:
            r13 = r4
            r2 = r7
            r5 = r11
            r7 = r1
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r7.f11120n     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            long r3 = m14228W(r10)     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            java.util.List r1 = r1.mo13539c(r2, r3)     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            r13.mo13512c(r1)     // Catch: java.lang.Throwable -> L38e com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L390
            goto L387
        L473:
            r5 = r7
            r7 = r1
            r1 = r2
            r2 = r5
            r13 = r4
            r5 = r11
            com.google.crypto.tink.shaded.protobuf.g0 r4 = r7.f11120n     // Catch: java.lang.Throwable -> L4a3 com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L4a9
            long r10 = m14228W(r10)     // Catch: java.lang.Throwable -> L4a3 com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L4a9
            java.util.List r4 = r4.mo13539c(r2, r10)     // Catch: java.lang.Throwable -> L4a3 com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L4a9
            r13.mo13519j(r4)     // Catch: java.lang.Throwable -> L4a3 com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L4a9
            r6 = r4
            com.google.crypto.tink.shaded.protobuf.a0$e r4 = r7.m14278t(r3)     // Catch: java.lang.Throwable -> L4a3 com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L4a9
            r3 = r2
            r2 = r1
            r1 = r3
            r3 = r6
            r6 = r18
            java.lang.Object r5 = com.google.crypto.tink.shaded.protobuf.C2925i1.m13650A(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L499 com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L49f
            r2 = r1
            r12 = r6
            goto L35c
        L499:
            r0 = move-exception
            r2 = r1
            r11 = r5
            r12 = r6
            goto L366
        L49f:
            r11 = r5
            r12 = r6
            goto L36b
        L4a3:
            r0 = move-exception
            r12 = r18
            r11 = r5
            goto L366
        L4a9:
            r12 = r18
            r11 = r5
            goto L392
        L4ae:
            r13 = r4
            r12 = r5
            r2 = r7
            r7 = r1
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r7.f11120n     // Catch: java.lang.Throwable -> L4c3 com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L4c6
            long r3 = m14228W(r10)     // Catch: java.lang.Throwable -> L4c3 com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L4c6
            java.util.List r1 = r1.mo13539c(r2, r3)     // Catch: java.lang.Throwable -> L4c3 com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L4c6
            r13.mo13529t(r1)     // Catch: java.lang.Throwable -> L4c3 com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L4c6
        L4bf:
            r6 = r22
            goto L2d0
        L4c3:
            r0 = move-exception
            goto L2d7
        L4c6:
            r6 = r22
            goto L2fd
        L4ca:
            r13 = r4
            r12 = r5
            r2 = r7
            r7 = r1
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r7.f11120n     // Catch: java.lang.Throwable -> L4c3 com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L4c6
            long r3 = m14228W(r10)     // Catch: java.lang.Throwable -> L4c3 com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L4c6
            java.util.List r1 = r1.mo13539c(r2, r3)     // Catch: java.lang.Throwable -> L4c3 com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L4c6
            r13.mo13499F(r1)     // Catch: java.lang.Throwable -> L4c3 com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L4c6
            goto L4bf
        L4dc:
            r13 = r4
            r12 = r5
            r2 = r7
            r7 = r1
            com.google.crypto.tink.shaded.protobuf.g1 r5 = r7.m14281v(r3)     // Catch: java.lang.Throwable -> L4c3 com.google.crypto.tink.shaded.protobuf.C2903b0.a -> L4ef
            r6 = r22
            r3 = r10
            r1.m14266k0(r2, r3, r4, r5, r6)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L4ec:
            r0 = move-exception
            goto L7e
        L4ef:
            r6 = r22
            r1 = r7
            r4 = r13
            goto Lf3
        L4f5:
            r12 = r5
            r2 = r7
            r5 = r10
            r1.m14268m0(r2, r5, r4)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L4fd:
            r12 = r5
            r2 = r7
            r5 = r10
            com.google.crypto.tink.shaded.protobuf.g0 r3 = r1.f11120n     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            long r13 = m14228W(r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            java.util.List r3 = r3.mo13539c(r2, r13)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            r4.mo13522m(r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L50f:
            r12 = r5
            r2 = r7
            r5 = r10
            com.google.crypto.tink.shaded.protobuf.g0 r3 = r1.f11120n     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            long r13 = m14228W(r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            java.util.List r3 = r3.mo13539c(r2, r13)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            r4.mo13533x(r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L521:
            r12 = r5
            r2 = r7
            r5 = r10
            com.google.crypto.tink.shaded.protobuf.g0 r3 = r1.f11120n     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            long r13 = m14228W(r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            java.util.List r3 = r3.mo13539c(r2, r13)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            r4.mo13526q(r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L533:
            r12 = r5
            r2 = r7
            r5 = r10
            com.google.crypto.tink.shaded.protobuf.g0 r3 = r1.f11120n     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            long r13 = m14228W(r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            java.util.List r3 = r3.mo13539c(r2, r13)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            r4.mo13532w(r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L545:
            r12 = r5
            r2 = r7
            r5 = r10
            com.google.crypto.tink.shaded.protobuf.g0 r3 = r1.f11120n     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            long r13 = m14228W(r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            java.util.List r3 = r3.mo13539c(r2, r13)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            r4.mo13516g(r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L557:
            r12 = r5
            r2 = r7
            r5 = r10
            com.google.crypto.tink.shaded.protobuf.g0 r3 = r1.f11120n     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            long r13 = m14228W(r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            java.util.List r3 = r3.mo13539c(r2, r13)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            r4.mo13518i(r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L569:
            r12 = r5
            r2 = r7
            r5 = r10
            com.google.crypto.tink.shaded.protobuf.g0 r3 = r1.f11120n     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            long r13 = m14228W(r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            java.util.List r3 = r3.mo13539c(r2, r13)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            r4.mo13496C(r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L57b:
            r12 = r5
            r2 = r7
            r5 = r10
            com.google.crypto.tink.shaded.protobuf.g0 r3 = r1.f11120n     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            long r13 = m14228W(r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            java.util.List r3 = r3.mo13539c(r2, r13)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            r4.mo13500G(r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L58d:
            r12 = r5
            r2 = r7
            java.lang.Object r5 = r1.m14254Q(r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            com.google.crypto.tink.shaded.protobuf.s0 r5 = (com.google.crypto.tink.shaded.protobuf.InterfaceC2954s0) r5     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            com.google.crypto.tink.shaded.protobuf.g1 r7 = r1.m14281v(r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            r4.mo13503J(r5, r7, r6)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            r1.m14276r0(r2, r3, r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L5a1:
            r12 = r5
            r2 = r7
            r5 = r10
            long r13 = m14228W(r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            long r8 = r4.mo13534y()     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            com.google.crypto.tink.shaded.protobuf.C2949q1.m14082Q(r2, r13, r8)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            r1.m14270o0(r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L5b4:
            r12 = r5
            r2 = r7
            r5 = r10
            long r8 = m14228W(r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            int r5 = r4.mo13521l()     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            com.google.crypto.tink.shaded.protobuf.C2949q1.m14081P(r2, r8, r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            r1.m14270o0(r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L5c7:
            r12 = r5
            r2 = r7
            r5 = r10
            long r8 = m14228W(r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            long r13 = r4.mo13515f()     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            com.google.crypto.tink.shaded.protobuf.C2949q1.m14082Q(r2, r8, r13)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            r1.m14270o0(r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L5da:
            r12 = r5
            r2 = r7
            r5 = r10
            long r8 = m14228W(r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            int r5 = r4.mo13498E()     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            com.google.crypto.tink.shaded.protobuf.C2949q1.m14081P(r2, r8, r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            r1.m14270o0(r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L5ed:
            r8 = r2
            r12 = r5
            r2 = r7
            r5 = r10
            int r9 = r4.mo13520k()     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            com.google.crypto.tink.shaded.protobuf.a0$e r13 = r1.m14278t(r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            if (r13 == 0) goto L608
            boolean r13 = r13.m13387a(r9)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            if (r13 == 0) goto L602
            goto L608
        L602:
            java.lang.Object r5 = com.google.crypto.tink.shaded.protobuf.C2925i1.m13659J(r2, r8, r9, r11, r12)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L741
        L608:
            long r13 = m14228W(r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            com.google.crypto.tink.shaded.protobuf.C2949q1.m14081P(r2, r13, r9)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            r1.m14270o0(r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L614:
            r12 = r5
            r2 = r7
            r5 = r10
            long r8 = m14228W(r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            int r5 = r4.mo13517h()     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            com.google.crypto.tink.shaded.protobuf.C2949q1.m14081P(r2, r8, r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            r1.m14270o0(r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L627:
            r12 = r5
            r2 = r7
            r5 = r10
            long r8 = m14228W(r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            com.google.crypto.tink.shaded.protobuf.h r5 = r4.mo13524o()     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            com.google.crypto.tink.shaded.protobuf.C2949q1.m14083R(r2, r8, r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            r1.m14270o0(r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L63a:
            r12 = r5
            r2 = r7
            java.lang.Object r5 = r1.m14254Q(r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            com.google.crypto.tink.shaded.protobuf.s0 r5 = (com.google.crypto.tink.shaded.protobuf.InterfaceC2954s0) r5     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            com.google.crypto.tink.shaded.protobuf.g1 r8 = r1.m14281v(r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            r4.mo13506M(r5, r8, r6)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            r1.m14276r0(r2, r3, r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L64e:
            r12 = r5
            r2 = r7
            r5 = r10
            r1.m14267l0(r2, r5, r4)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            r1.m14270o0(r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L659:
            r12 = r5
            r2 = r7
            r5 = r10
            long r8 = m14228W(r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            boolean r5 = r4.mo13514e()     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            com.google.crypto.tink.shaded.protobuf.C2949q1.m14073H(r2, r8, r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            r1.m14270o0(r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L66c:
            r12 = r5
            r2 = r7
            r5 = r10
            long r8 = m14228W(r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            int r5 = r4.mo13530u()     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            com.google.crypto.tink.shaded.protobuf.C2949q1.m14081P(r2, r8, r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            r1.m14270o0(r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L67f:
            r12 = r5
            r2 = r7
            r5 = r10
            long r8 = m14228W(r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            long r13 = r4.mo13511b()     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            com.google.crypto.tink.shaded.protobuf.C2949q1.m14082Q(r2, r8, r13)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            r1.m14270o0(r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L692:
            r12 = r5
            r2 = r7
            r5 = r10
            long r8 = m14228W(r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            int r5 = r4.mo13525p()     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            com.google.crypto.tink.shaded.protobuf.C2949q1.m14081P(r2, r8, r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            r1.m14270o0(r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L6a5:
            r12 = r5
            r2 = r7
            r5 = r10
            long r8 = m14228W(r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            long r13 = r4.mo13528s()     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            com.google.crypto.tink.shaded.protobuf.C2949q1.m14082Q(r2, r8, r13)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            r1.m14270o0(r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L6b8:
            r12 = r5
            r2 = r7
            r5 = r10
            long r8 = m14228W(r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            long r13 = r4.mo13501H()     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            com.google.crypto.tink.shaded.protobuf.C2949q1.m14082Q(r2, r8, r13)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            r1.m14270o0(r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L6cb:
            r12 = r5
            r2 = r7
            r5 = r10
            long r8 = m14228W(r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            float r5 = r4.readFloat()     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            com.google.crypto.tink.shaded.protobuf.C2949q1.m14080O(r2, r8, r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            r1.m14270o0(r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L6de:
            r12 = r5
            r2 = r7
            r5 = r10
            long r8 = m14228W(r5)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            double r13 = r4.readDouble()     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            com.google.crypto.tink.shaded.protobuf.C2949q1.m14079N(r2, r8, r13)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            r1.m14270o0(r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.C2903b0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L6f1:
            boolean r3 = r12.mo14008q(r4)     // Catch: java.lang.Throwable -> L718
            if (r3 == 0) goto L71a
            boolean r3 = r4.mo13497D()     // Catch: java.lang.Throwable -> L718
            if (r3 != 0) goto L741
            int r0 = r1.f11117k
            r4 = r5
        L700:
            int r3 = r1.f11118l
            if (r0 >= r3) goto L712
            int[] r3 = r1.f11116j
            r3 = r3[r0]
            r6 = r20
            r5 = r12
            java.lang.Object r4 = r1.m14273q(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L700
        L712:
            if (r4 == 0) goto L740
        L714:
            r12.mo14006o(r2, r4)
            goto L740
        L718:
            r0 = move-exception
            goto L74a
        L71a:
            if (r5 != 0) goto L721
            java.lang.Object r3 = r12.mo13997f(r2)     // Catch: java.lang.Throwable -> L718
            r5 = r3
        L721:
            r7 = 0
            boolean r3 = r12.m14004m(r5, r4, r7)     // Catch: java.lang.Throwable -> L718
            if (r3 != 0) goto L741
            int r0 = r1.f11117k
            r4 = r5
        L72b:
            int r3 = r1.f11118l
            if (r0 >= r3) goto L73d
            int[] r3 = r1.f11116j
            r3 = r3[r0]
            r6 = r20
            r5 = r12
            java.lang.Object r4 = r1.m14273q(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L72b
        L73d:
            if (r4 == 0) goto L740
            goto L714
        L740:
            return
        L741:
            r4 = r6
            goto L6
        L744:
            r0 = move-exception
            r12 = r18
            r2 = r20
            r11 = r5
        L74a:
            int r3 = r1.f11117k
            r7 = r3
            r4 = r5
        L74e:
            int r3 = r1.f11118l
            if (r7 >= r3) goto L762
            int[] r3 = r1.f11116j
            r3 = r3[r7]
            r6 = r20
            r5 = r12
            java.lang.Object r4 = r1.m14273q(r2, r3, r4, r5, r6)
            int r7 = r7 + 1
            r1 = r17
            goto L74e
        L762:
            r5 = r12
            if (r4 == 0) goto L768
            r5.mo14006o(r2, r4)
        L768:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C2962v0.m14249L(com.google.crypto.tink.shaded.protobuf.n1, com.google.crypto.tink.shaded.protobuf.q, java.lang.Object, com.google.crypto.tink.shaded.protobuf.f1, com.google.crypto.tink.shaded.protobuf.p):void");
    }

    /* JADX INFO: renamed from: M */
    public final <K, V> void m14250M(Object obj, int i10, Object obj2, C2944p c2944p, InterfaceC2916f1 interfaceC2916f1) {
        long jM14228W = m14228W(m14280u0(i10));
        Object objM14068C = C2949q1.m14068C(obj, jM14228W);
        if (objM14068C == null) {
            objM14068C = this.f11123q.mo13987d(obj2);
            C2949q1.m14083R(obj, jM14228W, objM14068C);
        } else if (this.f11123q.mo13991h(objM14068C)) {
            Object objMo13987d = this.f11123q.mo13987d(obj2);
            this.f11123q.mo13984a(objMo13987d, objM14068C);
            C2949q1.m14083R(obj, jM14228W, objMo13987d);
            objM14068C = objMo13987d;
        }
        Map<?, ?> mapMo13986c = this.f11123q.mo13986c(objM14068C);
        this.f11123q.mo13985b(obj2);
        interfaceC2916f1.mo13505L(mapMo13986c, null, c2944p);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: com.google.crypto.tink.shaded.protobuf.g1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N */
    public final void m14251N(T t8, T t10, int i10) {
        if (m14243A(t10, i10)) {
            long jM14228W = m14228W(m14280u0(i10));
            Unsafe unsafe = f11106s;
            Object object = unsafe.getObject(t10, jM14228W);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + m14256V(i10) + " is present but null: " + t10);
            }
            InterfaceC2919g1 interfaceC2919g1M14281v = m14281v(i10);
            if (!m14243A(t8, i10)) {
                if (m14222G(object)) {
                    Object objMo13544e = interfaceC2919g1M14281v.mo13544e();
                    interfaceC2919g1M14281v.mo13540a(objMo13544e, object);
                    unsafe.putObject(t8, jM14228W, objMo13544e);
                } else {
                    unsafe.putObject(t8, jM14228W, object);
                }
                m14270o0(t8, i10);
                return;
            }
            Object object2 = unsafe.getObject(t8, jM14228W);
            if (!m14222G(object2)) {
                Object objMo13544e2 = interfaceC2919g1M14281v.mo13544e();
                interfaceC2919g1M14281v.mo13540a(objMo13544e2, object2);
                unsafe.putObject(t8, jM14228W, objMo13544e2);
                object2 = objMo13544e2;
            }
            interfaceC2919g1M14281v.mo13540a(object2, object);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v2, resolved type: com.google.crypto.tink.shaded.protobuf.g1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O */
    public final void m14252O(T t8, T t10, int i10) {
        int iM14256V = m14256V(i10);
        if (m14248I(t10, iM14256V, i10)) {
            long jM14228W = m14228W(m14280u0(i10));
            Unsafe unsafe = f11106s;
            Object object = unsafe.getObject(t10, jM14228W);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + m14256V(i10) + " is present but null: " + t10);
            }
            InterfaceC2919g1 interfaceC2919g1M14281v = m14281v(i10);
            if (!m14248I(t8, iM14256V, i10)) {
                if (m14222G(object)) {
                    Object objMo13544e = interfaceC2919g1M14281v.mo13544e();
                    interfaceC2919g1M14281v.mo13540a(objMo13544e, object);
                    unsafe.putObject(t8, jM14228W, objMo13544e);
                } else {
                    unsafe.putObject(t8, jM14228W, object);
                }
                m14272p0(t8, iM14256V, i10);
                return;
            }
            Object object2 = unsafe.getObject(t8, jM14228W);
            if (!m14222G(object2)) {
                Object objMo13544e2 = interfaceC2919g1M14281v.mo13544e();
                interfaceC2919g1M14281v.mo13540a(objMo13544e2, object2);
                unsafe.putObject(t8, jM14228W, objMo13544e2);
                object2 = objMo13544e2;
            }
            interfaceC2919g1M14281v.mo13540a(object2, object);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m14253P(T t8, T t10, int i10) {
        int iM14280u0 = m14280u0(i10);
        long jM14228W = m14228W(iM14280u0);
        int iM14256V = m14256V(i10);
        switch (m14239t0(iM14280u0)) {
            case 0:
                if (m14243A(t10, i10)) {
                    C2949q1.m14079N(t8, jM14228W, C2949q1.m14109x(t10, jM14228W));
                    m14270o0(t8, i10);
                }
                break;
            case 1:
                if (m14243A(t10, i10)) {
                    C2949q1.m14080O(t8, jM14228W, C2949q1.m14110y(t10, jM14228W));
                    m14270o0(t8, i10);
                }
                break;
            case 2:
                if (m14243A(t10, i10)) {
                    C2949q1.m14082Q(t8, jM14228W, C2949q1.m14066A(t10, jM14228W));
                    m14270o0(t8, i10);
                }
                break;
            case 3:
                if (m14243A(t10, i10)) {
                    C2949q1.m14082Q(t8, jM14228W, C2949q1.m14066A(t10, jM14228W));
                    m14270o0(t8, i10);
                }
                break;
            case 4:
                if (m14243A(t10, i10)) {
                    C2949q1.m14081P(t8, jM14228W, C2949q1.m14111z(t10, jM14228W));
                    m14270o0(t8, i10);
                }
                break;
            case 5:
                if (m14243A(t10, i10)) {
                    C2949q1.m14082Q(t8, jM14228W, C2949q1.m14066A(t10, jM14228W));
                    m14270o0(t8, i10);
                }
                break;
            case 6:
                if (m14243A(t10, i10)) {
                    C2949q1.m14081P(t8, jM14228W, C2949q1.m14111z(t10, jM14228W));
                    m14270o0(t8, i10);
                }
                break;
            case 7:
                if (m14243A(t10, i10)) {
                    C2949q1.m14073H(t8, jM14228W, C2949q1.m14103r(t10, jM14228W));
                    m14270o0(t8, i10);
                }
                break;
            case 8:
                if (m14243A(t10, i10)) {
                    C2949q1.m14083R(t8, jM14228W, C2949q1.m14068C(t10, jM14228W));
                    m14270o0(t8, i10);
                }
                break;
            case 9:
                m14251N(t8, t10, i10);
                break;
            case 10:
                if (m14243A(t10, i10)) {
                    C2949q1.m14083R(t8, jM14228W, C2949q1.m14068C(t10, jM14228W));
                    m14270o0(t8, i10);
                }
                break;
            case 11:
                if (m14243A(t10, i10)) {
                    C2949q1.m14081P(t8, jM14228W, C2949q1.m14111z(t10, jM14228W));
                    m14270o0(t8, i10);
                }
                break;
            case 12:
                if (m14243A(t10, i10)) {
                    C2949q1.m14081P(t8, jM14228W, C2949q1.m14111z(t10, jM14228W));
                    m14270o0(t8, i10);
                }
                break;
            case 13:
                if (m14243A(t10, i10)) {
                    C2949q1.m14081P(t8, jM14228W, C2949q1.m14111z(t10, jM14228W));
                    m14270o0(t8, i10);
                }
                break;
            case 14:
                if (m14243A(t10, i10)) {
                    C2949q1.m14082Q(t8, jM14228W, C2949q1.m14066A(t10, jM14228W));
                    m14270o0(t8, i10);
                }
                break;
            case 15:
                if (m14243A(t10, i10)) {
                    C2949q1.m14081P(t8, jM14228W, C2949q1.m14111z(t10, jM14228W));
                    m14270o0(t8, i10);
                }
                break;
            case 16:
                if (m14243A(t10, i10)) {
                    C2949q1.m14082Q(t8, jM14228W, C2949q1.m14066A(t10, jM14228W));
                    m14270o0(t8, i10);
                }
                break;
            case 17:
                m14251N(t8, t10, i10);
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
                this.f11120n.mo13538b(t8, t10, jM14228W);
                break;
            case 50:
                C2925i1.m13655F(this.f11123q, t8, t10, jM14228W);
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
                if (m14248I(t10, iM14256V, i10)) {
                    C2949q1.m14083R(t8, jM14228W, C2949q1.m14068C(t10, jM14228W));
                    m14272p0(t8, iM14256V, i10);
                }
                break;
            case 60:
                m14252O(t8, t10, i10);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (m14248I(t10, iM14256V, i10)) {
                    C2949q1.m14083R(t8, jM14228W, C2949q1.m14068C(t10, jM14228W));
                    m14272p0(t8, iM14256V, i10);
                }
                break;
            case 68:
                m14252O(t8, t10, i10);
                break;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.crypto.tink.shaded.protobuf.g1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public final Object m14254Q(T t8, int i10) {
        InterfaceC2919g1 interfaceC2919g1M14281v = m14281v(i10);
        long jM14228W = m14228W(m14280u0(i10));
        if (!m14243A(t8, i10)) {
            return interfaceC2919g1M14281v.mo13544e();
        }
        Object object = f11106s.getObject(t8, jM14228W);
        if (m14222G(object)) {
            return object;
        }
        Object objMo13544e = interfaceC2919g1M14281v.mo13544e();
        if (object != null) {
            interfaceC2919g1M14281v.mo13540a(objMo13544e, object);
        }
        return objMo13544e;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.crypto.tink.shaded.protobuf.g1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R */
    public final Object m14255R(T t8, int i10, int i11) {
        InterfaceC2919g1 interfaceC2919g1M14281v = m14281v(i11);
        if (!m14248I(t8, i10, i11)) {
            return interfaceC2919g1M14281v.mo13544e();
        }
        Object object = f11106s.getObject(t8, m14228W(m14280u0(i11)));
        if (m14222G(object)) {
            return object;
        }
        Object objMo13544e = interfaceC2919g1M14281v.mo13544e();
        if (object != null) {
            interfaceC2919g1M14281v.mo13540a(objMo13544e, object);
        }
        return objMo13544e;
    }

    /* JADX INFO: renamed from: V */
    public final int m14256V(int i10) {
        return this.f11107a[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2919g1
    /* JADX INFO: renamed from: a */
    public void mo13540a(T t8, T t10) {
        m14235m(t8);
        t10.getClass();
        for (int i10 = 0; i10 < this.f11107a.length; i10 += 3) {
            m14253P(t8, t10, i10);
        }
        C2925i1.m13656G(this.f11121o, t8, t10);
        if (this.f11112f) {
            C2925i1.m13654E(this.f11122p, t8, t10);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: com.google.crypto.tink.shaded.protobuf.g1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: com.google.crypto.tink.shaded.protobuf.g1 */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: T */
    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x007d A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2919g1
    /* JADX INFO: renamed from: b */
    public void mo13541b(T t8) {
        if (m14222G(t8)) {
            if (t8 instanceof AbstractC2967y) {
                AbstractC2967y abstractC2967y = (AbstractC2967y) t8;
                abstractC2967y.m14333s();
                abstractC2967y.m14332r();
                abstractC2967y.m14326L();
            }
            int length = this.f11107a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int iM14280u0 = m14280u0(i10);
                long jM14228W = m14228W(iM14280u0);
                int iM14239t0 = m14239t0(iM14280u0);
                if (iM14239t0 != 9) {
                    if (iM14239t0 != 60 && iM14239t0 != 68) {
                        switch (iM14239t0) {
                            case 17:
                                if (m14243A(t8, i10)) {
                                    m14281v(i10).mo13541b(f11106s.getObject(t8, jM14228W));
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
                                this.f11120n.mo13537a(t8, jM14228W);
                                break;
                            case 50:
                                Unsafe unsafe = f11106s;
                                Object object = unsafe.getObject(t8, jM14228W);
                                if (object != null) {
                                    unsafe.putObject(t8, jM14228W, this.f11123q.mo13989f(object));
                                }
                                break;
                        }
                    } else if (m14248I(t8, m14256V(i10), i10)) {
                        m14281v(i10).mo13541b(f11106s.getObject(t8, jM14228W));
                    }
                } else if (m14243A(t8, i10)) {
                    m14281v(i10).mo13541b(f11106s.getObject(t8, jM14228W));
                }
            }
            this.f11121o.mo14001j(t8);
            if (this.f11112f) {
                this.f11122p.mo14061f(t8);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0094 A[SYNTHETIC] */
    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2919g1
    /* JADX INFO: renamed from: c */
    public final boolean mo13542c(T t8) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.f11117k) {
            int i15 = this.f11116j[i13];
            int iM14256V = m14256V(i15);
            int iM14280u0 = m14280u0(i15);
            int i16 = this.f11107a[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i12) {
                if (i17 != 1048575) {
                    i14 = f11106s.getInt(t8, i17);
                }
                i11 = i14;
                i10 = i17;
            } else {
                i10 = i12;
                i11 = i14;
            }
            T t10 = t8;
            if (m14223J(iM14280u0) && !m14244B(t10, i15, i10, i11, i18)) {
                return false;
            }
            int iM14239t0 = m14239t0(iM14280u0);
            if (iM14239t0 == 9 || iM14239t0 == 17) {
                if (m14244B(t10, i15, i10, i11, i18) && !m14220C(t10, iM14280u0, m14281v(i15))) {
                    return false;
                }
            } else if (iM14239t0 == 27) {
                if (!m14245E(t10, iM14280u0, i15)) {
                    return false;
                }
            } else if (iM14239t0 == 60 || iM14239t0 == 68) {
                if (m14248I(t10, iM14256V, i15) && !m14220C(t10, iM14280u0, m14281v(i15))) {
                    return false;
                }
            } else if (iM14239t0 != 49) {
                if (iM14239t0 == 50 && !m14246F(t10, iM14280u0, i15)) {
                    return false;
                }
            } else if (!m14245E(t10, iM14280u0, i15)) {
                return false;
            }
            i13++;
            t8 = t10;
            i12 = i10;
            i14 = i11;
        }
        return !this.f11112f || this.f11122p.mo14058c(t8).m14201o();
    }

    /* JADX INFO: renamed from: c0 */
    public final <K, V> int m14257c0(T t8, byte[] bArr, int i10, int i11, int i12, long j10, C2911e.b bVar) {
        Unsafe unsafe = f11106s;
        Object objM14279u = m14279u(i12);
        Object object = unsafe.getObject(t8, j10);
        if (this.f11123q.mo13991h(object)) {
            Object objMo13987d = this.f11123q.mo13987d(objM14279u);
            this.f11123q.mo13984a(objMo13987d, object);
            unsafe.putObject(t8, j10, objMo13987d);
            object = objMo13987d;
        }
        this.f11123q.mo13985b(objM14279u);
        return m14269n(bArr, i10, i11, null, this.f11123q.mo13986c(object), bVar);
    }

    /* JADX DEBUG: Type inference failed for r2v2. Raw type applied. Possible types: com.google.crypto.tink.shaded.protobuf.n1<?, ?>, com.google.crypto.tink.shaded.protobuf.n1<UT, UB> */
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
    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2919g1
    /* JADX INFO: renamed from: d */
    public int mo13543d(T t8) {
        int i10;
        int iM13791i;
        int iM13799q;
        int iM13806x;
        int iM13688i;
        int iM13775U;
        int iM13777W;
        C2962v0<T> c2962v0 = this;
        T t10 = t8;
        Unsafe unsafe = f11106s;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (i12 < c2962v0.f11107a.length) {
            int iM14280u0 = c2962v0.m14280u0(i12);
            int iM14239t0 = m14239t0(iM14280u0);
            int iM14256V = c2962v0.m14256V(i12);
            int i16 = c2962v0.f11107a[i12 + 2];
            int i17 = i16 & i11;
            if (iM14239t0 <= 17) {
                if (i17 != i15) {
                    i13 = i17 == i11 ? 0 : unsafe.getInt(t10, i17);
                    i15 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            } else {
                i10 = 0;
            }
            int i18 = i14;
            long jM14228W = m14228W(iM14280u0);
            if (iM14239t0 < EnumC2961v.f11052O.m14219a() || iM14239t0 > EnumC2961v.f11065b0.m14219a()) {
                i17 = 0;
            }
            switch (iM14239t0) {
                case 0:
                    if (!c2962v0.m14244B(t10, i12, i15, i13, i10)) {
                        i14 = i18;
                    } else {
                        iM13791i = AbstractC2929k.m13791i(iM14256V, 0.0d);
                        i14 = i18 + iM13791i;
                    }
                    break;
                case 1:
                    if (c2962v0.m14244B(t10, i12, i15, i13, i10)) {
                        iM13799q = AbstractC2929k.m13799q(iM14256V, 0.0f);
                        i14 = i18 + iM13799q;
                        c2962v0 = this;
                        t10 = t8;
                    }
                    c2962v0 = this;
                    t10 = t8;
                    i14 = i18;
                    break;
                case 2:
                    if (c2962v0.m14244B(t10, i12, i15, i13, i10)) {
                        iM13806x = AbstractC2929k.m13806x(iM14256V, unsafe.getLong(t10, jM14228W));
                        i14 = i18 + iM13806x;
                        c2962v0 = this;
                    }
                    c2962v0 = this;
                    i14 = i18;
                    break;
                case 3:
                    if (c2962v0.m14244B(t10, i12, i15, i13, i10)) {
                        iM13806x = AbstractC2929k.m13778X(iM14256V, unsafe.getLong(t10, jM14228W));
                        i14 = i18 + iM13806x;
                        c2962v0 = this;
                    }
                    c2962v0 = this;
                    i14 = i18;
                    break;
                case 4:
                    if (c2962v0.m14244B(t10, i12, i15, i13, i10)) {
                        iM13806x = AbstractC2929k.m13804v(iM14256V, unsafe.getInt(t10, jM14228W));
                        i14 = i18 + iM13806x;
                        c2962v0 = this;
                    }
                    c2962v0 = this;
                    i14 = i18;
                    break;
                case 5:
                    if (c2962v0.m14244B(t10, i12, i15, i13, i10)) {
                        iM13799q = AbstractC2929k.m13797o(iM14256V, 0L);
                        i14 = i18 + iM13799q;
                        c2962v0 = this;
                        t10 = t8;
                    }
                    c2962v0 = this;
                    t10 = t8;
                    i14 = i18;
                    break;
                case 6:
                    if (c2962v0.m14244B(t10, i12, i15, i13, i10)) {
                        iM13799q = AbstractC2929k.m13795m(iM14256V, 0);
                        i14 = i18 + iM13799q;
                        c2962v0 = this;
                        t10 = t8;
                    }
                    c2962v0 = this;
                    t10 = t8;
                    i14 = i18;
                    break;
                case 7:
                    if (c2962v0.m14244B(t10, i12, i15, i13, i10)) {
                        iM13799q = AbstractC2929k.m13783d(iM14256V, true);
                        i14 = i18 + iM13799q;
                        c2962v0 = this;
                        t10 = t8;
                    }
                    c2962v0 = this;
                    t10 = t8;
                    i14 = i18;
                    break;
                case 8:
                    if (c2962v0.m14244B(t10, i12, i15, i13, i10)) {
                        Object object = unsafe.getObject(t10, jM14228W);
                        iM13806x = object instanceof AbstractC2920h ? AbstractC2929k.m13788g(iM14256V, (AbstractC2920h) object) : AbstractC2929k.m13773S(iM14256V, (String) object);
                        i14 = i18 + iM13806x;
                        c2962v0 = this;
                    }
                    c2962v0 = this;
                    i14 = i18;
                    break;
                case 9:
                    if (!c2962v0.m14244B(t10, i12, i15, i13, i10)) {
                        i14 = i18;
                    } else {
                        iM13791i = C2925i1.m13694o(iM14256V, unsafe.getObject(t10, jM14228W), c2962v0.m14281v(i12));
                        i14 = i18 + iM13791i;
                    }
                    break;
                case 10:
                    if (c2962v0.m14244B(t10, i12, i15, i13, i10)) {
                        iM13806x = AbstractC2929k.m13788g(iM14256V, (AbstractC2920h) unsafe.getObject(t10, jM14228W));
                        i14 = i18 + iM13806x;
                        c2962v0 = this;
                    }
                    c2962v0 = this;
                    i14 = i18;
                    break;
                case 11:
                    if (c2962v0.m14244B(t10, i12, i15, i13, i10)) {
                        iM13806x = AbstractC2929k.m13776V(iM14256V, unsafe.getInt(t10, jM14228W));
                        i14 = i18 + iM13806x;
                        c2962v0 = this;
                    }
                    c2962v0 = this;
                    i14 = i18;
                    break;
                case 12:
                    if (c2962v0.m14244B(t10, i12, i15, i13, i10)) {
                        iM13806x = AbstractC2929k.m13793k(iM14256V, unsafe.getInt(t10, jM14228W));
                        i14 = i18 + iM13806x;
                        c2962v0 = this;
                    }
                    c2962v0 = this;
                    i14 = i18;
                    break;
                case 13:
                    if (c2962v0.m14244B(t10, i12, i15, i13, i10)) {
                        iM13799q = AbstractC2929k.m13765K(iM14256V, 0);
                        i14 = i18 + iM13799q;
                        c2962v0 = this;
                        t10 = t8;
                    }
                    c2962v0 = this;
                    t10 = t8;
                    i14 = i18;
                    break;
                case 14:
                    if (c2962v0.m14244B(t10, i12, i15, i13, i10)) {
                        iM13799q = AbstractC2929k.m13767M(iM14256V, 0L);
                        i14 = i18 + iM13799q;
                        c2962v0 = this;
                        t10 = t8;
                    }
                    c2962v0 = this;
                    t10 = t8;
                    i14 = i18;
                    break;
                case 15:
                    if (c2962v0.m14244B(t10, i12, i15, i13, i10)) {
                        iM13806x = AbstractC2929k.m13769O(iM14256V, unsafe.getInt(t10, jM14228W));
                        i14 = i18 + iM13806x;
                        c2962v0 = this;
                    }
                    c2962v0 = this;
                    i14 = i18;
                    break;
                case 16:
                    if (c2962v0.m14244B(t10, i12, i15, i13, i10)) {
                        iM13806x = AbstractC2929k.m13771Q(iM14256V, unsafe.getLong(t10, jM14228W));
                        i14 = i18 + iM13806x;
                        c2962v0 = this;
                    }
                    c2962v0 = this;
                    i14 = i18;
                    break;
                case 17:
                    if (!c2962v0.m14244B(t10, i12, i15, i13, i10)) {
                        i14 = i18;
                    } else {
                        iM13791i = AbstractC2929k.m13801s(iM14256V, (InterfaceC2954s0) unsafe.getObject(t10, jM14228W), c2962v0.m14281v(i12));
                        i14 = i18 + iM13791i;
                    }
                    break;
                case 18:
                    iM13791i = C2925i1.m13687h(iM14256V, (List) unsafe.getObject(t10, jM14228W), false);
                    i14 = i18 + iM13791i;
                    break;
                case 19:
                    iM13791i = C2925i1.m13685f(iM14256V, (List) unsafe.getObject(t10, jM14228W), false);
                    i14 = i18 + iM13791i;
                    break;
                case 20:
                    iM13791i = C2925i1.m13692m(iM14256V, (List) unsafe.getObject(t10, jM14228W), false);
                    i14 = i18 + iM13791i;
                    break;
                case 21:
                    iM13791i = C2925i1.m13703x(iM14256V, (List) unsafe.getObject(t10, jM14228W), false);
                    i14 = i18 + iM13791i;
                    break;
                case 22:
                    iM13791i = C2925i1.m13690k(iM14256V, (List) unsafe.getObject(t10, jM14228W), false);
                    i14 = i18 + iM13791i;
                    break;
                case 23:
                    iM13791i = C2925i1.m13687h(iM14256V, (List) unsafe.getObject(t10, jM14228W), false);
                    i14 = i18 + iM13791i;
                    break;
                case 24:
                    iM13791i = C2925i1.m13685f(iM14256V, (List) unsafe.getObject(t10, jM14228W), false);
                    i14 = i18 + iM13791i;
                    break;
                case 25:
                    iM13791i = C2925i1.m13676a(iM14256V, (List) unsafe.getObject(t10, jM14228W), false);
                    i14 = i18 + iM13791i;
                    break;
                case 26:
                    iM13791i = C2925i1.m13700u(iM14256V, (List) unsafe.getObject(t10, jM14228W));
                    i14 = i18 + iM13791i;
                    break;
                case 27:
                    iM13791i = C2925i1.m13695p(iM14256V, (List) unsafe.getObject(t10, jM14228W), c2962v0.m14281v(i12));
                    i14 = i18 + iM13791i;
                    break;
                case 28:
                    iM13791i = C2925i1.m13680c(iM14256V, (List) unsafe.getObject(t10, jM14228W));
                    i14 = i18 + iM13791i;
                    break;
                case 29:
                    iM13791i = C2925i1.m13701v(iM14256V, (List) unsafe.getObject(t10, jM14228W), false);
                    i14 = i18 + iM13791i;
                    break;
                case 30:
                    iM13791i = C2925i1.m13682d(iM14256V, (List) unsafe.getObject(t10, jM14228W), false);
                    i14 = i18 + iM13791i;
                    break;
                case 31:
                    iM13791i = C2925i1.m13685f(iM14256V, (List) unsafe.getObject(t10, jM14228W), false);
                    i14 = i18 + iM13791i;
                    break;
                case 32:
                    iM13791i = C2925i1.m13687h(iM14256V, (List) unsafe.getObject(t10, jM14228W), false);
                    i14 = i18 + iM13791i;
                    break;
                case 33:
                    iM13791i = C2925i1.m13696q(iM14256V, (List) unsafe.getObject(t10, jM14228W), false);
                    i14 = i18 + iM13791i;
                    break;
                case 34:
                    iM13791i = C2925i1.m13698s(iM14256V, (List) unsafe.getObject(t10, jM14228W), false);
                    i14 = i18 + iM13791i;
                    break;
                case 35:
                    iM13688i = C2925i1.m13688i((List) unsafe.getObject(t10, jM14228W));
                    if (iM13688i <= 0) {
                        i14 = i18;
                    } else {
                        if (c2962v0.f11115i) {
                            unsafe.putInt(t10, i17, iM13688i);
                        }
                        iM13775U = AbstractC2929k.m13775U(iM14256V);
                        iM13777W = AbstractC2929k.m13777W(iM13688i);
                        i14 = i18 + iM13775U + iM13777W + iM13688i;
                    }
                    break;
                case 36:
                    iM13688i = C2925i1.m13686g((List) unsafe.getObject(t10, jM14228W));
                    if (iM13688i <= 0) {
                        i14 = i18;
                    } else {
                        if (c2962v0.f11115i) {
                            unsafe.putInt(t10, i17, iM13688i);
                        }
                        iM13775U = AbstractC2929k.m13775U(iM14256V);
                        iM13777W = AbstractC2929k.m13777W(iM13688i);
                        i14 = i18 + iM13775U + iM13777W + iM13688i;
                    }
                    break;
                case 37:
                    iM13688i = C2925i1.m13693n((List) unsafe.getObject(t10, jM14228W));
                    if (iM13688i <= 0) {
                        i14 = i18;
                    } else {
                        if (c2962v0.f11115i) {
                            unsafe.putInt(t10, i17, iM13688i);
                        }
                        iM13775U = AbstractC2929k.m13775U(iM14256V);
                        iM13777W = AbstractC2929k.m13777W(iM13688i);
                        i14 = i18 + iM13775U + iM13777W + iM13688i;
                    }
                    break;
                case 38:
                    iM13688i = C2925i1.m13704y((List) unsafe.getObject(t10, jM14228W));
                    if (iM13688i <= 0) {
                        i14 = i18;
                    } else {
                        if (c2962v0.f11115i) {
                            unsafe.putInt(t10, i17, iM13688i);
                        }
                        iM13775U = AbstractC2929k.m13775U(iM14256V);
                        iM13777W = AbstractC2929k.m13777W(iM13688i);
                        i14 = i18 + iM13775U + iM13777W + iM13688i;
                    }
                    break;
                case 39:
                    iM13688i = C2925i1.m13691l((List) unsafe.getObject(t10, jM14228W));
                    if (iM13688i <= 0) {
                        i14 = i18;
                    } else {
                        if (c2962v0.f11115i) {
                            unsafe.putInt(t10, i17, iM13688i);
                        }
                        iM13775U = AbstractC2929k.m13775U(iM14256V);
                        iM13777W = AbstractC2929k.m13777W(iM13688i);
                        i14 = i18 + iM13775U + iM13777W + iM13688i;
                    }
                    break;
                case 40:
                    iM13688i = C2925i1.m13688i((List) unsafe.getObject(t10, jM14228W));
                    if (iM13688i <= 0) {
                        i14 = i18;
                    } else {
                        if (c2962v0.f11115i) {
                            unsafe.putInt(t10, i17, iM13688i);
                        }
                        iM13775U = AbstractC2929k.m13775U(iM14256V);
                        iM13777W = AbstractC2929k.m13777W(iM13688i);
                        i14 = i18 + iM13775U + iM13777W + iM13688i;
                    }
                    break;
                case 41:
                    iM13688i = C2925i1.m13686g((List) unsafe.getObject(t10, jM14228W));
                    if (iM13688i <= 0) {
                        i14 = i18;
                    } else {
                        if (c2962v0.f11115i) {
                            unsafe.putInt(t10, i17, iM13688i);
                        }
                        iM13775U = AbstractC2929k.m13775U(iM14256V);
                        iM13777W = AbstractC2929k.m13777W(iM13688i);
                        i14 = i18 + iM13775U + iM13777W + iM13688i;
                    }
                    break;
                case 42:
                    iM13688i = C2925i1.m13678b((List) unsafe.getObject(t10, jM14228W));
                    if (iM13688i <= 0) {
                        i14 = i18;
                    } else {
                        if (c2962v0.f11115i) {
                            unsafe.putInt(t10, i17, iM13688i);
                        }
                        iM13775U = AbstractC2929k.m13775U(iM14256V);
                        iM13777W = AbstractC2929k.m13777W(iM13688i);
                        i14 = i18 + iM13775U + iM13777W + iM13688i;
                    }
                    break;
                case 43:
                    iM13688i = C2925i1.m13702w((List) unsafe.getObject(t10, jM14228W));
                    if (iM13688i <= 0) {
                        i14 = i18;
                    } else {
                        if (c2962v0.f11115i) {
                            unsafe.putInt(t10, i17, iM13688i);
                        }
                        iM13775U = AbstractC2929k.m13775U(iM14256V);
                        iM13777W = AbstractC2929k.m13777W(iM13688i);
                        i14 = i18 + iM13775U + iM13777W + iM13688i;
                    }
                    break;
                case 44:
                    iM13688i = C2925i1.m13684e((List) unsafe.getObject(t10, jM14228W));
                    if (iM13688i <= 0) {
                        i14 = i18;
                    } else {
                        if (c2962v0.f11115i) {
                            unsafe.putInt(t10, i17, iM13688i);
                        }
                        iM13775U = AbstractC2929k.m13775U(iM14256V);
                        iM13777W = AbstractC2929k.m13777W(iM13688i);
                        i14 = i18 + iM13775U + iM13777W + iM13688i;
                    }
                    break;
                case 45:
                    iM13688i = C2925i1.m13686g((List) unsafe.getObject(t10, jM14228W));
                    if (iM13688i <= 0) {
                        i14 = i18;
                    } else {
                        if (c2962v0.f11115i) {
                            unsafe.putInt(t10, i17, iM13688i);
                        }
                        iM13775U = AbstractC2929k.m13775U(iM14256V);
                        iM13777W = AbstractC2929k.m13777W(iM13688i);
                        i14 = i18 + iM13775U + iM13777W + iM13688i;
                    }
                    break;
                case 46:
                    iM13688i = C2925i1.m13688i((List) unsafe.getObject(t10, jM14228W));
                    if (iM13688i <= 0) {
                        i14 = i18;
                    } else {
                        if (c2962v0.f11115i) {
                            unsafe.putInt(t10, i17, iM13688i);
                        }
                        iM13775U = AbstractC2929k.m13775U(iM14256V);
                        iM13777W = AbstractC2929k.m13777W(iM13688i);
                        i14 = i18 + iM13775U + iM13777W + iM13688i;
                    }
                    break;
                case 47:
                    iM13688i = C2925i1.m13697r((List) unsafe.getObject(t10, jM14228W));
                    if (iM13688i <= 0) {
                        i14 = i18;
                    } else {
                        if (c2962v0.f11115i) {
                            unsafe.putInt(t10, i17, iM13688i);
                        }
                        iM13775U = AbstractC2929k.m13775U(iM14256V);
                        iM13777W = AbstractC2929k.m13777W(iM13688i);
                        i14 = i18 + iM13775U + iM13777W + iM13688i;
                    }
                    break;
                case 48:
                    iM13688i = C2925i1.m13699t((List) unsafe.getObject(t10, jM14228W));
                    if (iM13688i <= 0) {
                        i14 = i18;
                    } else {
                        if (c2962v0.f11115i) {
                            unsafe.putInt(t10, i17, iM13688i);
                        }
                        iM13775U = AbstractC2929k.m13775U(iM14256V);
                        iM13777W = AbstractC2929k.m13777W(iM13688i);
                        i14 = i18 + iM13775U + iM13777W + iM13688i;
                    }
                    break;
                case 49:
                    iM13791i = C2925i1.m13689j(iM14256V, (List) unsafe.getObject(t10, jM14228W), c2962v0.m14281v(i12));
                    i14 = i18 + iM13791i;
                    break;
                case 50:
                    iM13791i = c2962v0.f11123q.mo13990g(iM14256V, unsafe.getObject(t10, jM14228W), c2962v0.m14279u(i12));
                    i14 = i18 + iM13791i;
                    break;
                case 51:
                    if (!c2962v0.m14248I(t10, iM14256V, i12)) {
                        i14 = i18;
                    } else {
                        iM13791i = AbstractC2929k.m13791i(iM14256V, 0.0d);
                        i14 = i18 + iM13791i;
                    }
                    break;
                case 52:
                    if (!c2962v0.m14248I(t10, iM14256V, i12)) {
                        i14 = i18;
                    } else {
                        iM13791i = AbstractC2929k.m13799q(iM14256V, 0.0f);
                        i14 = i18 + iM13791i;
                    }
                    break;
                case 53:
                    if (!c2962v0.m14248I(t10, iM14256V, i12)) {
                        i14 = i18;
                    } else {
                        iM13791i = AbstractC2929k.m13806x(iM14256V, m14233b0(t10, jM14228W));
                        i14 = i18 + iM13791i;
                    }
                    break;
                case 54:
                    if (!c2962v0.m14248I(t10, iM14256V, i12)) {
                        i14 = i18;
                    } else {
                        iM13791i = AbstractC2929k.m13778X(iM14256V, m14233b0(t10, jM14228W));
                        i14 = i18 + iM13791i;
                    }
                    break;
                case 55:
                    if (!c2962v0.m14248I(t10, iM14256V, i12)) {
                        i14 = i18;
                    } else {
                        iM13791i = AbstractC2929k.m13804v(iM14256V, m14232a0(t10, jM14228W));
                        i14 = i18 + iM13791i;
                    }
                    break;
                case 56:
                    if (!c2962v0.m14248I(t10, iM14256V, i12)) {
                        i14 = i18;
                    } else {
                        iM13791i = AbstractC2929k.m13797o(iM14256V, 0L);
                        i14 = i18 + iM13791i;
                    }
                    break;
                case 57:
                    if (!c2962v0.m14248I(t10, iM14256V, i12)) {
                        i14 = i18;
                    } else {
                        iM13791i = AbstractC2929k.m13795m(iM14256V, 0);
                        i14 = i18 + iM13791i;
                    }
                    break;
                case 58:
                    if (!c2962v0.m14248I(t10, iM14256V, i12)) {
                        i14 = i18;
                    } else {
                        iM13791i = AbstractC2929k.m13783d(iM14256V, true);
                        i14 = i18 + iM13791i;
                    }
                    break;
                case 59:
                    if (!c2962v0.m14248I(t10, iM14256V, i12)) {
                        i14 = i18;
                    } else {
                        Object object2 = unsafe.getObject(t10, jM14228W);
                        iM13791i = object2 instanceof AbstractC2920h ? AbstractC2929k.m13788g(iM14256V, (AbstractC2920h) object2) : AbstractC2929k.m13773S(iM14256V, (String) object2);
                        i14 = i18 + iM13791i;
                    }
                    break;
                case 60:
                    if (!c2962v0.m14248I(t10, iM14256V, i12)) {
                        i14 = i18;
                    } else {
                        iM13791i = C2925i1.m13694o(iM14256V, unsafe.getObject(t10, jM14228W), c2962v0.m14281v(i12));
                        i14 = i18 + iM13791i;
                    }
                    break;
                case 61:
                    if (!c2962v0.m14248I(t10, iM14256V, i12)) {
                        i14 = i18;
                    } else {
                        iM13791i = AbstractC2929k.m13788g(iM14256V, (AbstractC2920h) unsafe.getObject(t10, jM14228W));
                        i14 = i18 + iM13791i;
                    }
                    break;
                case 62:
                    if (!c2962v0.m14248I(t10, iM14256V, i12)) {
                        i14 = i18;
                    } else {
                        iM13791i = AbstractC2929k.m13776V(iM14256V, m14232a0(t10, jM14228W));
                        i14 = i18 + iM13791i;
                    }
                    break;
                case 63:
                    if (!c2962v0.m14248I(t10, iM14256V, i12)) {
                        i14 = i18;
                    } else {
                        iM13791i = AbstractC2929k.m13793k(iM14256V, m14232a0(t10, jM14228W));
                        i14 = i18 + iM13791i;
                    }
                    break;
                case 64:
                    if (!c2962v0.m14248I(t10, iM14256V, i12)) {
                        i14 = i18;
                    } else {
                        iM13791i = AbstractC2929k.m13765K(iM14256V, 0);
                        i14 = i18 + iM13791i;
                    }
                    break;
                case 65:
                    if (!c2962v0.m14248I(t10, iM14256V, i12)) {
                        i14 = i18;
                    } else {
                        iM13791i = AbstractC2929k.m13767M(iM14256V, 0L);
                        i14 = i18 + iM13791i;
                    }
                    break;
                case 66:
                    if (!c2962v0.m14248I(t10, iM14256V, i12)) {
                        i14 = i18;
                    } else {
                        iM13791i = AbstractC2929k.m13769O(iM14256V, m14232a0(t10, jM14228W));
                        i14 = i18 + iM13791i;
                    }
                    break;
                case 67:
                    if (!c2962v0.m14248I(t10, iM14256V, i12)) {
                        i14 = i18;
                    } else {
                        iM13791i = AbstractC2929k.m13771Q(iM14256V, m14233b0(t10, jM14228W));
                        i14 = i18 + iM13791i;
                    }
                    break;
                case 68:
                    if (!c2962v0.m14248I(t10, iM14256V, i12)) {
                        i14 = i18;
                    } else {
                        iM13791i = AbstractC2929k.m13801s(iM14256V, (InterfaceC2954s0) unsafe.getObject(t10, jM14228W), c2962v0.m14281v(i12));
                        i14 = i18 + iM13791i;
                    }
                    break;
                default:
                    i14 = i18;
                    break;
            }
            i12 += 3;
            i11 = 1048575;
        }
        int iM14284x = i14 + c2962v0.m14284x(c2962v0.f11121o, t10);
        return c2962v0.f11112f ? iM14284x + c2962v0.f11122p.mo14058c(t10).m14198l() : iM14284x;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12321. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: d0 */
    public int m14258d0(T r27, byte[] r28, int r29, int r30, int r31, com.google.crypto.tink.shaded.protobuf.C2911e.b r32) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            r4 = r30
            r15 = r31
            r7 = r32
            m14235m(r1)
            sun.misc.Unsafe r9 = com.google.crypto.tink.shaded.protobuf.C2962v0.f11106s
            r16 = 0
            r11 = -1
            r3 = r29
            r5 = r11
            r6 = r16
            r12 = r6
            r13 = r12
            r8 = 1048575(0xfffff, float:1.469367E-39)
        L1e:
            if (r3 >= r4) goto L45b
            int r13 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L2c
            int r13 = com.google.crypto.tink.shaded.protobuf.C2911e.m13435I(r3, r2, r13, r7)
            int r3 = r7.f10837a
        L2c:
            r25 = r13
            r13 = r3
            r3 = r25
            int r14 = r13 >>> 3
            r7 = r13 & 7
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r10 = 3
            if (r14 <= r5) goto L41
            int r6 = r6 / r10
            int r5 = r0.m14262h0(r14, r6)
            goto L45
        L41:
            int r5 = r0.m14261g0(r14)
        L45:
            if (r5 != r11) goto L58
            r2 = r3
            r17 = r8
            r24 = r9
            r19 = r11
            r21 = r14
            r8 = r16
            r9 = r0
            r0 = r13
        L54:
            r13 = r32
            goto L40e
        L58:
            int[] r6 = r0.f11107a
            int r18 = r5 + 1
            r6 = r6[r18]
            r18 = r11
            int r11 = m14239t0(r6)
            r19 = r3
            long r3 = m14228W(r6)
            r10 = 17
            if (r11 > r10) goto L2f5
            int[] r10 = r0.f11107a
            int r20 = r5 + 2
            r10 = r10[r20]
            int r20 = r10 >>> 20
            r2 = 1
            int r20 = r2 << r20
            r10 = r10 & r17
            if (r10 == r8) goto L95
            r21 = r14
            r14 = r17
            r22 = r3
            if (r8 == r14) goto L89
            long r2 = (long) r8
            r9.putInt(r1, r2, r12)
        L89:
            if (r10 != r14) goto L8e
            r2 = r16
            goto L93
        L8e:
            long r2 = (long) r10
            int r2 = r9.getInt(r1, r2)
        L93:
            r12 = r2
            goto L9c
        L95:
            r22 = r3
            r21 = r14
            r14 = r17
            r10 = r8
        L9c:
            r2 = 5
            switch(r11) {
                case 0: goto L2d1;
                case 1: goto L2b5;
                case 2: goto L28a;
                case 3: goto L28a;
                case 4: goto L26c;
                case 5: goto L238;
                case 6: goto L219;
                case 7: goto L1f4;
                case 8: goto L1d2;
                case 9: goto L189;
                case 10: goto L172;
                case 11: goto L26c;
                case 12: goto L13c;
                case 13: goto L219;
                case 14: goto L238;
                case 15: goto L11e;
                case 16: goto Le1;
                case 17: goto Laa;
                default: goto La0;
            }
        La0:
            r8 = r32
            r11 = r5
        La3:
            r3 = r9
            r14 = r19
            r9 = r28
            goto L2e8
        Laa:
            r2 = 3
            if (r7 != r2) goto Ldd
            java.lang.Object r2 = r0.m14254Q(r1, r5)
            int r3 = r21 << 3
            r7 = r3 | 4
            com.google.crypto.tink.shaded.protobuf.g1 r3 = r0.m14281v(r5)
            r4 = r28
            r6 = r30
            r8 = r32
            r11 = r5
            r5 = r19
            int r3 = com.google.crypto.tink.shaded.protobuf.C2911e.m13441O(r2, r3, r4, r5, r6, r7, r8)
            r25 = r4
            r4 = r2
            r2 = r8
            r8 = r25
            r0.m14276r0(r1, r11, r4)
            r12 = r12 | r20
            r4 = r30
            r7 = r2
            r2 = r8
        Ld5:
            r8 = r10
            r6 = r11
            r11 = r18
            r5 = r21
            goto L1e
        Ldd:
            r11 = r5
            r8 = r32
            goto La3
        Le1:
            r8 = r28
            r2 = r32
            r11 = r5
            r3 = r19
            if (r7 != 0) goto L112
            int r7 = com.google.crypto.tink.shaded.protobuf.C2911e.m13439M(r8, r3, r2)
            long r3 = r2.f10838b
            long r5 = com.google.crypto.tink.shaded.protobuf.AbstractC2923i.m13582d(r3)
            r3 = r2
            r2 = r1
            r1 = r9
            r9 = r3
            r3 = r22
            r1.putLong(r2, r3, r5)
            r25 = r2
            r2 = r1
            r1 = r25
            r12 = r12 | r20
            r4 = r30
            r3 = r7
        L107:
            r7 = r9
            r6 = r11
            r11 = r18
            r5 = r21
            r9 = r2
            r2 = r8
        L10f:
            r8 = r10
            goto L1e
        L112:
            r25 = r9
            r9 = r2
            r2 = r25
        L117:
            r14 = r9
            r9 = r8
            r8 = r14
            r14 = r3
        L11b:
            r3 = r2
            goto L2e8
        L11e:
            r8 = r28
            r11 = r5
            r2 = r9
            r3 = r19
            r4 = r22
            r9 = r32
            if (r7 != 0) goto L117
            int r3 = com.google.crypto.tink.shaded.protobuf.C2911e.m13436J(r8, r3, r9)
            int r6 = r9.f10837a
            int r6 = com.google.crypto.tink.shaded.protobuf.AbstractC2923i.m13581c(r6)
            r2.putInt(r1, r4, r6)
        L137:
            r12 = r12 | r20
        L139:
            r4 = r30
            goto L107
        L13c:
            r8 = r28
            r11 = r5
            r2 = r9
            r3 = r19
            r4 = r22
            r9 = r32
            if (r7 != 0) goto L117
            int r3 = com.google.crypto.tink.shaded.protobuf.C2911e.m13436J(r8, r3, r9)
            int r7 = r9.f10837a
            com.google.crypto.tink.shaded.protobuf.a0$e r14 = r0.m14278t(r11)
            boolean r6 = m14221D(r6)
            if (r6 == 0) goto L16e
            if (r14 == 0) goto L16e
            boolean r6 = r14.m13387a(r7)
            if (r6 == 0) goto L161
            goto L16e
        L161:
            com.google.crypto.tink.shaded.protobuf.o1 r4 = m14240w(r1)
            long r5 = (long) r7
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r4.m14032n(r13, r5)
            goto L139
        L16e:
            r2.putInt(r1, r4, r7)
            goto L137
        L172:
            r8 = r28
            r11 = r5
            r2 = r9
            r3 = r19
            r4 = r22
            r14 = 2
            r9 = r32
            if (r7 != r14) goto L117
            int r3 = com.google.crypto.tink.shaded.protobuf.C2911e.m13446c(r8, r3, r9)
            java.lang.Object r6 = r9.f10839c
            r2.putObject(r1, r4, r6)
            goto L137
        L189:
            r8 = r28
            r11 = r5
            r2 = r9
            r3 = r19
            r14 = 2
            r9 = r32
            if (r7 != r14) goto L1bf
            r4 = r1
            java.lang.Object r1 = r0.m14254Q(r4, r11)
            r5 = r2
            com.google.crypto.tink.shaded.protobuf.g1 r2 = r0.m14281v(r11)
            r6 = r4
            r4 = r3
            r3 = r8
            r8 = r6
            r6 = r9
            r9 = r5
            r5 = r30
            int r2 = com.google.crypto.tink.shaded.protobuf.C2911e.m13442P(r1, r2, r3, r4, r5, r6)
            r4 = r1
            r1 = r3
            r3 = r6
            r0.m14276r0(r8, r11, r4)
        L1b0:
            r12 = r12 | r20
            r4 = r30
            r7 = r3
            r6 = r11
            r11 = r18
            r5 = r21
            r3 = r2
            r2 = r1
            r1 = r8
            goto L10f
        L1bf:
            r25 = r8
            r8 = r1
            r1 = r25
            r25 = r9
            r9 = r2
            r2 = r3
            r3 = r25
        L1ca:
            r14 = r9
            r9 = r1
            r1 = r8
            r8 = r3
            r3 = r14
            r14 = r2
            goto L2e8
        L1d2:
            r3 = r32
            r8 = r1
            r11 = r5
            r2 = r19
            r4 = r22
            r14 = 2
            r1 = r28
            if (r7 != r14) goto L1ca
            boolean r6 = m14242z(r6)
            if (r6 == 0) goto L1ea
            int r2 = com.google.crypto.tink.shaded.protobuf.C2911e.m13433G(r1, r2, r3)
            goto L1ee
        L1ea:
            int r2 = com.google.crypto.tink.shaded.protobuf.C2911e.m13430D(r1, r2, r3)
        L1ee:
            java.lang.Object r6 = r3.f10839c
            r9.putObject(r8, r4, r6)
            goto L1b0
        L1f4:
            r3 = r32
            r8 = r1
            r11 = r5
            r2 = r19
            r5 = r22
            r1 = r28
            if (r7 != 0) goto L1ca
            int r2 = com.google.crypto.tink.shaded.protobuf.C2911e.m13439M(r1, r2, r3)
            r22 = r5
            long r4 = r3.f10838b
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L212
            r4 = 1
        L20f:
            r5 = r22
            goto L215
        L212:
            r4 = r16
            goto L20f
        L215:
            com.google.crypto.tink.shaded.protobuf.C2949q1.m14073H(r8, r5, r4)
            goto L1b0
        L219:
            r3 = r32
            r8 = r1
            r11 = r5
            r14 = r19
            r5 = r22
            r1 = r28
            if (r7 != r2) goto L22f
            int r2 = com.google.crypto.tink.shaded.protobuf.C2911e.m13452i(r1, r14)
            r9.putInt(r8, r5, r2)
            int r2 = r14 + 4
            goto L1b0
        L22f:
            r25 = r9
            r9 = r1
            r1 = r8
            r8 = r3
            r3 = r25
            goto L2e8
        L238:
            r3 = r32
            r8 = r1
            r11 = r5
            r14 = r19
            r5 = r22
            r4 = 1
            r1 = r28
            if (r7 != r4) goto L266
            r22 = r5
            long r5 = com.google.crypto.tink.shaded.protobuf.C2911e.m13454k(r1, r14)
            r2 = r9
            r9 = r1
            r1 = r2
            r2 = r8
            r8 = r3
            r3 = r22
            r1.putLong(r2, r3, r5)
            r25 = r2
            r2 = r1
            r1 = r25
            int r3 = r14 + 8
            r12 = r12 | r20
            r4 = r9
            r9 = r2
            r2 = r4
        L261:
            r4 = r30
        L263:
            r7 = r8
            goto Ld5
        L266:
            r2 = r9
            r9 = r1
            r1 = r8
            r8 = r3
            goto L11b
        L26c:
            r8 = r32
            r11 = r5
            r2 = r9
            r14 = r19
            r3 = r22
            r9 = r28
            if (r7 != 0) goto L11b
            int r5 = com.google.crypto.tink.shaded.protobuf.C2911e.m13436J(r9, r14, r8)
            int r6 = r8.f10837a
            r2.putInt(r1, r3, r6)
            r12 = r12 | r20
            r3 = r9
            r9 = r2
            r2 = r3
            r4 = r30
            r3 = r5
            goto L263
        L28a:
            r8 = r32
            r11 = r5
            r2 = r9
            r14 = r19
            r3 = r22
            r9 = r28
            if (r7 != 0) goto L11b
            int r7 = com.google.crypto.tink.shaded.protobuf.C2911e.m13439M(r9, r14, r8)
            long r5 = r8.f10838b
            r25 = r2
            r2 = r1
            r1 = r25
            r1.putLong(r2, r3, r5)
            r3 = r1
            r1 = r2
            r12 = r12 | r20
            r4 = r30
            r2 = r9
            r6 = r11
            r11 = r18
            r5 = r21
            r9 = r3
            r3 = r7
            r7 = r8
            goto L10f
        L2b5:
            r8 = r32
            r11 = r5
            r3 = r9
            r14 = r19
            r4 = r22
            r9 = r28
            if (r7 != r2) goto L2e8
            float r2 = com.google.crypto.tink.shaded.protobuf.C2911e.m13456m(r9, r14)
            com.google.crypto.tink.shaded.protobuf.C2949q1.m14080O(r1, r4, r2)
            int r2 = r14 + 4
        L2ca:
            r12 = r12 | r20
            r4 = r3
            r3 = r2
            r2 = r9
            r9 = r4
            goto L261
        L2d1:
            r8 = r32
            r11 = r5
            r3 = r9
            r14 = r19
            r4 = r22
            r2 = 1
            r9 = r28
            if (r7 != r2) goto L2e8
            double r6 = com.google.crypto.tink.shaded.protobuf.C2911e.m13448e(r9, r14)
            com.google.crypto.tink.shaded.protobuf.C2949q1.m14079N(r1, r4, r6)
            int r2 = r14 + 8
            goto L2ca
        L2e8:
            r9 = r0
            r24 = r3
            r17 = r10
            r0 = r13
            r2 = r14
            r19 = r18
            r13 = r8
            r8 = r11
            goto L40e
        L2f5:
            r10 = r8
            r21 = r14
            r14 = r19
            r8 = r5
            r4 = r3
            r3 = r9
            r9 = r28
            r2 = 27
            if (r11 != r2) goto L351
            r2 = 2
            if (r7 != r2) goto L345
            java.lang.Object r2 = r3.getObject(r1, r4)
            com.google.crypto.tink.shaded.protobuf.a0$i r2 = (com.google.crypto.tink.shaded.protobuf.C2900a0.i) r2
            boolean r6 = r2.mo13389n()
            if (r6 != 0) goto L324
            int r6 = r2.size()
            if (r6 != 0) goto L31b
            r6 = 10
            goto L31d
        L31b:
            int r6 = r6 * 2
        L31d:
            com.google.crypto.tink.shaded.protobuf.a0$i r2 = r2.mo13390o(r6)
            r3.putObject(r1, r4, r2)
        L324:
            r6 = r2
            com.google.crypto.tink.shaded.protobuf.g1 r1 = r0.m14281v(r8)
            r2 = r9
            r9 = r3
            r3 = r2
            r5 = r30
            r7 = r32
            r2 = r13
            r4 = r14
            int r1 = com.google.crypto.tink.shaded.protobuf.C2911e.m13461r(r1, r2, r3, r4, r5, r6, r7)
            r4 = r30
            r3 = r1
            r6 = r8
            r8 = r10
            r11 = r18
            r5 = r21
            r1 = r27
            r2 = r28
            goto L1e
        L345:
            r9 = r3
            r24 = r9
            r17 = r10
            r3 = r14
            r19 = r18
            r18 = r12
            goto L3d9
        L351:
            r9 = r3
            r2 = r13
            r3 = r14
            r1 = 49
            if (r11 > r1) goto L396
            r1 = r9
            r13 = r10
            long r9 = (long) r6
            r14 = r32
            r24 = r1
            r17 = r13
            r19 = r18
            r6 = r21
            r1 = r27
            r18 = r12
            r12 = r4
            r4 = r30
            r5 = r2
            r2 = r28
            int r7 = r0.m14260f0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            r13 = r5
            if (r7 == r3) goto L38e
            r0 = r26
            r1 = r27
            r2 = r28
            r4 = r30
            r3 = r7
            r6 = r8
            r8 = r17
            r12 = r18
        L384:
            r11 = r19
            r5 = r21
            r9 = r24
            r7 = r32
            goto L1e
        L38e:
            r9 = r26
            r2 = r7
        L391:
            r0 = r13
            r12 = r18
            goto L54
        L396:
            r13 = r2
            r22 = r4
            r24 = r9
            r17 = r10
            r9 = r11
            r19 = r18
            r18 = r12
            r0 = 50
            if (r9 != r0) goto L3dd
            r14 = 2
            if (r7 != r14) goto L3d9
            r0 = r26
            r1 = r27
            r2 = r28
            r4 = r30
            r5 = r8
            r6 = r22
            r8 = r32
            int r6 = r0.m14257c0(r1, r2, r3, r4, r5, r6, r8)
            r8 = r5
            if (r6 == r3) goto L3d5
            r0 = r26
            r1 = r27
            r2 = r28
            r4 = r30
            r7 = r32
            r3 = r6
            r6 = r8
            r8 = r17
            r12 = r18
            r11 = r19
            r5 = r21
        L3d1:
            r9 = r24
            goto L1e
        L3d5:
            r9 = r26
            r2 = r6
            goto L391
        L3d9:
            r9 = r26
            r2 = r3
            goto L391
        L3dd:
            r0 = r26
            r1 = r27
            r2 = r28
            r4 = r30
            r12 = r8
            r5 = r13
            r10 = r22
            r13 = r32
            r8 = r6
            r6 = r21
            int r7 = r0.m14259e0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            r9 = r0
            r0 = r5
            r8 = r12
            if (r7 == r3) goto L40b
            r1 = r27
            r2 = r28
            r4 = r30
            r3 = r7
            r6 = r8
            r7 = r13
            r8 = r17
            r12 = r18
            r11 = r19
            r5 = r21
            r13 = r0
            r0 = r9
            goto L3d1
        L40b:
            r2 = r7
            r12 = r18
        L40e:
            if (r0 != r15) goto L41e
            if (r15 == 0) goto L41e
            r6 = r27
            r7 = r30
            r13 = r0
            r8 = r2
        L418:
            r0 = r17
            r14 = 1048575(0xfffff, float:1.469367E-39)
            goto L466
        L41e:
            boolean r1 = r9.f11112f
            if (r1 == 0) goto L43e
            com.google.crypto.tink.shaded.protobuf.p r1 = r13.f10840d
            com.google.crypto.tink.shaded.protobuf.p r3 = com.google.crypto.tink.shaded.protobuf.C2944p.m14035b()
            if (r1 == r3) goto L43e
            com.google.crypto.tink.shaded.protobuf.s0 r5 = r9.f11111e
            com.google.crypto.tink.shaded.protobuf.n1<?, ?> r6 = r9.f11121o
            r4 = r27
            r1 = r28
            r3 = r30
            r7 = r13
            int r2 = com.google.crypto.tink.shaded.protobuf.C2911e.m13451h(r0, r1, r2, r3, r4, r5, r6, r7)
            r6 = r4
            r7 = r30
        L43c:
            r3 = r2
            goto L450
        L43e:
            r6 = r27
            com.google.crypto.tink.shaded.protobuf.o1 r4 = m14240w(r6)
            r1 = r28
            r3 = r30
            r5 = r32
            int r2 = com.google.crypto.tink.shaded.protobuf.C2911e.m13434H(r0, r1, r2, r3, r4, r5)
            r7 = r3
            goto L43c
        L450:
            r2 = r28
            r13 = r0
            r1 = r6
            r4 = r7
            r6 = r8
            r0 = r9
            r8 = r17
            goto L384
        L45b:
            r6 = r1
            r7 = r4
            r17 = r8
            r24 = r9
            r18 = r12
            r9 = r0
            r8 = r3
            goto L418
        L466:
            if (r0 == r14) goto L46e
            long r0 = (long) r0
            r2 = r24
            r2.putInt(r6, r0, r12)
        L46e:
            int r0 = r9.f11117k
            r1 = 0
            r10 = r0
            r3 = r1
        L473:
            int r0 = r9.f11118l
            if (r10 >= r0) goto L48b
            int[] r0 = r9.f11116j
            r2 = r0[r10]
            com.google.crypto.tink.shaded.protobuf.n1<?, ?> r4 = r9.f11121o
            r5 = r27
            r1 = r6
            r0 = r9
            java.lang.Object r2 = r0.m14273q(r1, r2, r3, r4, r5)
            r3 = r2
            com.google.crypto.tink.shaded.protobuf.o1 r3 = (com.google.crypto.tink.shaded.protobuf.C2943o1) r3
            int r10 = r10 + 1
            goto L473
        L48b:
            r1 = r6
            r0 = r9
            if (r3 == 0) goto L494
            com.google.crypto.tink.shaded.protobuf.n1<?, ?> r2 = r0.f11121o
            r2.mo14006o(r1, r3)
        L494:
            if (r15 != 0) goto L49e
            if (r8 != r7) goto L499
            goto L4a2
        L499:
            com.google.crypto.tink.shaded.protobuf.b0 r1 = com.google.crypto.tink.shaded.protobuf.C2903b0.m13403h()
            throw r1
        L49e:
            if (r8 > r7) goto L4a3
            if (r13 != r15) goto L4a3
        L4a2:
            return r8
        L4a3:
            com.google.crypto.tink.shaded.protobuf.b0 r1 = com.google.crypto.tink.shaded.protobuf.C2903b0.m13403h()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C2962v0.m14258d0(java.lang.Object, byte[], int, int, int, com.google.crypto.tink.shaded.protobuf.e$b):int");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2919g1
    /* JADX INFO: renamed from: e */
    public T mo13544e() {
        return (T) this.f11119m.mo14306a(this.f11111e);
    }

    /* JADX INFO: renamed from: e0 */
    public final int m14259e0(T t8, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, C2911e.b bVar) throws C2903b0 {
        Unsafe unsafe = f11106s;
        long j11 = this.f11107a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(t8, j10, Double.valueOf(C2911e.m13448e(bArr, i10)));
                int i18 = i10 + 8;
                unsafe.putInt(t8, j11, i13);
                return i18;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(t8, j10, Float.valueOf(C2911e.m13456m(bArr, i10)));
                int i19 = i10 + 4;
                unsafe.putInt(t8, j11, i13);
                return i19;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                int iM13439M = C2911e.m13439M(bArr, i10, bVar);
                unsafe.putObject(t8, j10, Long.valueOf(bVar.f10838b));
                unsafe.putInt(t8, j11, i13);
                return iM13439M;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int iM13436J = C2911e.m13436J(bArr, i10, bVar);
                unsafe.putObject(t8, j10, Integer.valueOf(bVar.f10837a));
                unsafe.putInt(t8, j11, i13);
                return iM13436J;
            case 56:
            case 65:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(t8, j10, Long.valueOf(C2911e.m13454k(bArr, i10)));
                int i20 = i10 + 8;
                unsafe.putInt(t8, j11, i13);
                return i20;
            case 57:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(t8, j10, Integer.valueOf(C2911e.m13452i(bArr, i10)));
                int i21 = i10 + 4;
                unsafe.putInt(t8, j11, i13);
                return i21;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                int iM13439M2 = C2911e.m13439M(bArr, i10, bVar);
                unsafe.putObject(t8, j10, Boolean.valueOf(bVar.f10838b != 0));
                unsafe.putInt(t8, j11, i13);
                return iM13439M2;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int iM13436J2 = C2911e.m13436J(bArr, i10, bVar);
                int i22 = bVar.f10837a;
                if (i22 == 0) {
                    unsafe.putObject(t8, j10, "");
                } else {
                    if ((i15 & 536870912) != 0 && !C2952r1.m14144m(bArr, iM13436J2, iM13436J2 + i22)) {
                        throw C2903b0.m13399d();
                    }
                    unsafe.putObject(t8, j10, new String(bArr, iM13436J2, i22, C2900a0.f10795b));
                    iM13436J2 += i22;
                }
                unsafe.putInt(t8, j11, i13);
                return iM13436J2;
            case 60:
                if (i14 != 2) {
                    return i10;
                }
                Object objM14255R = m14255R(t8, i13, i17);
                int iM13442P = C2911e.m13442P(objM14255R, m14281v(i17), bArr, i10, i11, bVar);
                m14277s0(t8, i13, i17, objM14255R);
                return iM13442P;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                int iM13446c = C2911e.m13446c(bArr, i10, bVar);
                unsafe.putObject(t8, j10, bVar.f10839c);
                unsafe.putInt(t8, j11, i13);
                return iM13446c;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int iM13436J3 = C2911e.m13436J(bArr, i10, bVar);
                int i23 = bVar.f10837a;
                C2900a0.e eVarM14278t = m14278t(i17);
                if (eVarM14278t != null && !eVarM14278t.m13387a(i23)) {
                    m14240w(t8).m14032n(i12, Long.valueOf(i23));
                    return iM13436J3;
                }
                unsafe.putObject(t8, j10, Integer.valueOf(i23));
                unsafe.putInt(t8, j11, i13);
                return iM13436J3;
            case 66:
                if (i14 != 0) {
                    return i10;
                }
                int iM13436J4 = C2911e.m13436J(bArr, i10, bVar);
                unsafe.putObject(t8, j10, Integer.valueOf(AbstractC2923i.m13581c(bVar.f10837a)));
                unsafe.putInt(t8, j11, i13);
                return iM13436J4;
            case 67:
                if (i14 != 0) {
                    return i10;
                }
                int iM13439M3 = C2911e.m13439M(bArr, i10, bVar);
                unsafe.putObject(t8, j10, Long.valueOf(AbstractC2923i.m13582d(bVar.f10838b)));
                unsafe.putInt(t8, j11, i13);
                return iM13439M3;
            case 68:
                if (i14 == 3) {
                    Object objM14255R2 = m14255R(t8, i13, i17);
                    int iM13441O = C2911e.m13441O(objM14255R2, m14281v(i17), bArr, i10, i11, (i12 & (-8)) | 4, bVar);
                    m14277s0(t8, i13, i17, objM14255R2);
                    return iM13441O;
                }
                break;
        }
        return i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2919g1
    /* JADX INFO: renamed from: f */
    public int mo13545f(T t8) {
        int i10;
        int iM13384f;
        int length = this.f11107a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iM14280u0 = m14280u0(i12);
            int iM14256V = m14256V(i12);
            long jM14228W = m14228W(iM14280u0);
            int iHashCode = 37;
            switch (m14239t0(iM14280u0)) {
                case 0:
                    i10 = i11 * 53;
                    iM13384f = C2900a0.m13384f(Double.doubleToLongBits(C2949q1.m14109x(t8, jM14228W)));
                    i11 = i10 + iM13384f;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iM13384f = Float.floatToIntBits(C2949q1.m14110y(t8, jM14228W));
                    i11 = i10 + iM13384f;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iM13384f = C2900a0.m13384f(C2949q1.m14066A(t8, jM14228W));
                    i11 = i10 + iM13384f;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iM13384f = C2900a0.m13384f(C2949q1.m14066A(t8, jM14228W));
                    i11 = i10 + iM13384f;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iM13384f = C2949q1.m14111z(t8, jM14228W);
                    i11 = i10 + iM13384f;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iM13384f = C2900a0.m13384f(C2949q1.m14066A(t8, jM14228W));
                    i11 = i10 + iM13384f;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iM13384f = C2949q1.m14111z(t8, jM14228W);
                    i11 = i10 + iM13384f;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iM13384f = C2900a0.m13381c(C2949q1.m14103r(t8, jM14228W));
                    i11 = i10 + iM13384f;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iM13384f = ((String) C2949q1.m14068C(t8, jM14228W)).hashCode();
                    i11 = i10 + iM13384f;
                    break;
                case 9:
                    Object objM14068C = C2949q1.m14068C(t8, jM14228W);
                    if (objM14068C != null) {
                        iHashCode = objM14068C.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iM13384f = C2949q1.m14068C(t8, jM14228W).hashCode();
                    i11 = i10 + iM13384f;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iM13384f = C2949q1.m14111z(t8, jM14228W);
                    i11 = i10 + iM13384f;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iM13384f = C2949q1.m14111z(t8, jM14228W);
                    i11 = i10 + iM13384f;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iM13384f = C2949q1.m14111z(t8, jM14228W);
                    i11 = i10 + iM13384f;
                    break;
                case 14:
                    i10 = i11 * 53;
                    iM13384f = C2900a0.m13384f(C2949q1.m14066A(t8, jM14228W));
                    i11 = i10 + iM13384f;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iM13384f = C2949q1.m14111z(t8, jM14228W);
                    i11 = i10 + iM13384f;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iM13384f = C2900a0.m13384f(C2949q1.m14066A(t8, jM14228W));
                    i11 = i10 + iM13384f;
                    break;
                case 17:
                    Object objM14068C2 = C2949q1.m14068C(t8, jM14228W);
                    if (objM14068C2 != null) {
                        iHashCode = objM14068C2.hashCode();
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
                    iM13384f = C2949q1.m14068C(t8, jM14228W).hashCode();
                    i11 = i10 + iM13384f;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iM13384f = C2949q1.m14068C(t8, jM14228W).hashCode();
                    i11 = i10 + iM13384f;
                    break;
                case 51:
                    if (m14248I(t8, iM14256V, i12)) {
                        i10 = i11 * 53;
                        iM13384f = C2900a0.m13384f(Double.doubleToLongBits(m14230Y(t8, jM14228W)));
                        i11 = i10 + iM13384f;
                    }
                    break;
                case 52:
                    if (m14248I(t8, iM14256V, i12)) {
                        i10 = i11 * 53;
                        iM13384f = Float.floatToIntBits(m14231Z(t8, jM14228W));
                        i11 = i10 + iM13384f;
                    }
                    break;
                case 53:
                    if (m14248I(t8, iM14256V, i12)) {
                        i10 = i11 * 53;
                        iM13384f = C2900a0.m13384f(m14233b0(t8, jM14228W));
                        i11 = i10 + iM13384f;
                    }
                    break;
                case 54:
                    if (m14248I(t8, iM14256V, i12)) {
                        i10 = i11 * 53;
                        iM13384f = C2900a0.m13384f(m14233b0(t8, jM14228W));
                        i11 = i10 + iM13384f;
                    }
                    break;
                case 55:
                    if (m14248I(t8, iM14256V, i12)) {
                        i10 = i11 * 53;
                        iM13384f = m14232a0(t8, jM14228W);
                        i11 = i10 + iM13384f;
                    }
                    break;
                case 56:
                    if (m14248I(t8, iM14256V, i12)) {
                        i10 = i11 * 53;
                        iM13384f = C2900a0.m13384f(m14233b0(t8, jM14228W));
                        i11 = i10 + iM13384f;
                    }
                    break;
                case 57:
                    if (m14248I(t8, iM14256V, i12)) {
                        i10 = i11 * 53;
                        iM13384f = m14232a0(t8, jM14228W);
                        i11 = i10 + iM13384f;
                    }
                    break;
                case 58:
                    if (m14248I(t8, iM14256V, i12)) {
                        i10 = i11 * 53;
                        iM13384f = C2900a0.m13381c(m14229X(t8, jM14228W));
                        i11 = i10 + iM13384f;
                    }
                    break;
                case 59:
                    if (m14248I(t8, iM14256V, i12)) {
                        i10 = i11 * 53;
                        iM13384f = ((String) C2949q1.m14068C(t8, jM14228W)).hashCode();
                        i11 = i10 + iM13384f;
                    }
                    break;
                case 60:
                    if (m14248I(t8, iM14256V, i12)) {
                        i10 = i11 * 53;
                        iM13384f = C2949q1.m14068C(t8, jM14228W).hashCode();
                        i11 = i10 + iM13384f;
                    }
                    break;
                case 61:
                    if (m14248I(t8, iM14256V, i12)) {
                        i10 = i11 * 53;
                        iM13384f = C2949q1.m14068C(t8, jM14228W).hashCode();
                        i11 = i10 + iM13384f;
                    }
                    break;
                case 62:
                    if (m14248I(t8, iM14256V, i12)) {
                        i10 = i11 * 53;
                        iM13384f = m14232a0(t8, jM14228W);
                        i11 = i10 + iM13384f;
                    }
                    break;
                case 63:
                    if (m14248I(t8, iM14256V, i12)) {
                        i10 = i11 * 53;
                        iM13384f = m14232a0(t8, jM14228W);
                        i11 = i10 + iM13384f;
                    }
                    break;
                case 64:
                    if (m14248I(t8, iM14256V, i12)) {
                        i10 = i11 * 53;
                        iM13384f = m14232a0(t8, jM14228W);
                        i11 = i10 + iM13384f;
                    }
                    break;
                case 65:
                    if (m14248I(t8, iM14256V, i12)) {
                        i10 = i11 * 53;
                        iM13384f = C2900a0.m13384f(m14233b0(t8, jM14228W));
                        i11 = i10 + iM13384f;
                    }
                    break;
                case 66:
                    if (m14248I(t8, iM14256V, i12)) {
                        i10 = i11 * 53;
                        iM13384f = m14232a0(t8, jM14228W);
                        i11 = i10 + iM13384f;
                    }
                    break;
                case 67:
                    if (m14248I(t8, iM14256V, i12)) {
                        i10 = i11 * 53;
                        iM13384f = C2900a0.m13384f(m14233b0(t8, jM14228W));
                        i11 = i10 + iM13384f;
                    }
                    break;
                case 68:
                    if (m14248I(t8, iM14256V, i12)) {
                        i10 = i11 * 53;
                        iM13384f = C2949q1.m14068C(t8, jM14228W).hashCode();
                        i11 = i10 + iM13384f;
                    }
                    break;
            }
        }
        int iHashCode2 = (i11 * 53) + this.f11121o.mo13998g(t8).hashCode();
        return this.f11112f ? (iHashCode2 * 53) + this.f11122p.mo14058c(t8).hashCode() : iHashCode2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: f0 */
    public final int m14260f0(T t8, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, C2911e.b bVar) throws C2903b0 {
        int iM13437K;
        Unsafe unsafe = f11106s;
        C2900a0.i iVarMo13390o = (C2900a0.i) unsafe.getObject(t8, j11);
        if (!iVarMo13390o.mo13389n()) {
            int size = iVarMo13390o.size();
            iVarMo13390o = iVarMo13390o.mo13390o(size == 0 ? 10 : size * 2);
            unsafe.putObject(t8, j11, iVarMo13390o);
        }
        C2900a0.i iVar = iVarMo13390o;
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    return C2911e.m13463t(bArr, i10, iVar, bVar);
                }
                if (i14 == 1) {
                    return C2911e.m13449f(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 19:
            case 36:
                if (i14 == 2) {
                    return C2911e.m13466w(bArr, i10, iVar, bVar);
                }
                if (i14 == 5) {
                    return C2911e.m13457n(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    return C2911e.m13427A(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return C2911e.m13440N(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i14 == 2) {
                    return C2911e.m13469z(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return C2911e.m13437K(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i14 == 2) {
                    return C2911e.m13465v(bArr, i10, iVar, bVar);
                }
                if (i14 == 1) {
                    return C2911e.m13455l(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    return C2911e.m13464u(bArr, i10, iVar, bVar);
                }
                if (i14 == 5) {
                    return C2911e.m13453j(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 25:
            case 42:
                if (i14 == 2) {
                    return C2911e.m13462s(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return C2911e.m13445b(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 26:
                if (i14 == 2) {
                    return (j10 & 536870912) == 0 ? C2911e.m13431E(i12, bArr, i10, i11, iVar, bVar) : C2911e.m13432F(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 27:
                if (i14 == 2) {
                    return C2911e.m13461r(m14281v(i15), i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 28:
                if (i14 == 2) {
                    return C2911e.m13447d(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 30:
            case 44:
                if (i14 != 2) {
                    if (i14 == 0) {
                        iM13437K = C2911e.m13437K(i12, bArr, i10, i11, iVar, bVar);
                    }
                    return i10;
                }
                iM13437K = C2911e.m13469z(bArr, i10, iVar, bVar);
                C2925i1.m13650A(t8, i13, iVar, m14278t(i15), null, this.f11121o);
                return iM13437K;
            case 33:
            case 47:
                if (i14 == 2) {
                    return C2911e.m13467x(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return C2911e.m13428B(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 34:
            case 48:
                if (i14 == 2) {
                    return C2911e.m13468y(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return C2911e.m13429C(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 49:
                if (i14 == 3) {
                    return C2911e.m13459p(m14281v(i15), i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            default:
                return i10;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2919g1
    /* JADX INFO: renamed from: g */
    public boolean mo13546g(T t8, T t10) {
        int length = this.f11107a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!m14271p(t8, t10, i10)) {
                return false;
            }
        }
        if (!this.f11121o.mo13998g(t8).equals(this.f11121o.mo13998g(t10))) {
            return false;
        }
        if (this.f11112f) {
            return this.f11122p.mo14058c(t8).equals(this.f11122p.mo14058c(t10));
        }
        return true;
    }

    /* JADX INFO: renamed from: g0 */
    public final int m14261g0(int i10) {
        if (i10 < this.f11109c || i10 > this.f11110d) {
            return -1;
        }
        return m14274q0(i10, 0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2919g1
    /* JADX INFO: renamed from: h */
    public void mo13547h(T t8, byte[] bArr, int i10, int i11, C2911e.b bVar) {
        m14258d0(t8, bArr, i10, i11, 0, bVar);
    }

    /* JADX INFO: renamed from: h0 */
    public final int m14262h0(int i10, int i11) {
        if (i10 < this.f11109c || i10 > this.f11110d) {
            return -1;
        }
        return m14274q0(i10, i11);
    }

    /* JADX DEBUG: Type inference failed for r1v0. Raw type applied. Possible types: com.google.crypto.tink.shaded.protobuf.n1<?, ?>, com.google.crypto.tink.shaded.protobuf.n1<UT, UB> */
    /* JADX DEBUG: Type inference failed for r2v0. Raw type applied. Possible types: com.google.crypto.tink.shaded.protobuf.q<?>, com.google.crypto.tink.shaded.protobuf.q<ET extends com.google.crypto.tink.shaded.protobuf.u$b<ET>> */
    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2919g1
    /* JADX INFO: renamed from: i */
    public void mo13548i(T t8, InterfaceC2916f1 interfaceC2916f1, C2944p c2944p) {
        c2944p.getClass();
        m14235m(t8);
        m14249L(this.f11121o, this.f11122p, t8, interfaceC2916f1, c2944p);
    }

    /* JADX INFO: renamed from: i0 */
    public final int m14263i0(int i10) {
        return this.f11107a[i10 + 2];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2919g1
    /* JADX INFO: renamed from: j */
    public void mo13549j(T t8, InterfaceC2958t1 interfaceC2958t1) {
        if (interfaceC2958t1.mo13944t() == InterfaceC2958t1.a.DESCENDING) {
            m14283w0(t8, interfaceC2958t1);
        } else {
            m14282v0(t8, interfaceC2958t1);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final <E> void m14264j0(Object obj, long j10, InterfaceC2916f1 interfaceC2916f1, InterfaceC2919g1<E> interfaceC2919g1, C2944p c2944p) {
        interfaceC2916f1.mo13509P(this.f11120n.mo13539c(obj, j10), interfaceC2919g1, c2944p);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m14265k(T t8, T t10, int i10) {
        return m14243A(t8, i10) == m14243A(t10, i10);
    }

    /* JADX INFO: renamed from: k0 */
    public final <E> void m14266k0(Object obj, int i10, InterfaceC2916f1 interfaceC2916f1, InterfaceC2919g1<E> interfaceC2919g1, C2944p c2944p) {
        interfaceC2916f1.mo13507N(this.f11120n.mo13539c(obj, m14228W(i10)), interfaceC2919g1, c2944p);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m14267l0(Object obj, int i10, InterfaceC2916f1 interfaceC2916f1) {
        if (m14242z(i10)) {
            C2949q1.m14083R(obj, m14228W(i10), interfaceC2916f1.mo13502I());
        } else if (this.f11113g) {
            C2949q1.m14083R(obj, m14228W(i10), interfaceC2916f1.mo13535z());
        } else {
            C2949q1.m14083R(obj, m14228W(i10), interfaceC2916f1.mo13524o());
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m14268m0(Object obj, int i10, InterfaceC2916f1 interfaceC2916f1) {
        if (m14242z(i10)) {
            interfaceC2916f1.mo13523n(this.f11120n.mo13539c(obj, m14228W(i10)));
        } else {
            interfaceC2916f1.mo13495B(this.f11120n.mo13539c(obj, m14228W(i10)));
        }
    }

    /* JADX INFO: renamed from: n */
    public final <K, V> int m14269n(byte[] bArr, int i10, int i11, C2933l0.a<K, V> aVar, Map<K, V> map, C2911e.b bVar) throws C2903b0 {
        int iM13436J = C2911e.m13436J(bArr, i10, bVar);
        int i12 = bVar.f10837a;
        if (i12 < 0 || i12 > i11 - iM13436J) {
            throw C2903b0.m13406m();
        }
        throw null;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m14270o0(T t8, int i10) {
        int iM14263i0 = m14263i0(i10);
        long j10 = 1048575 & iM14263i0;
        if (j10 == 1048575) {
            return;
        }
        C2949q1.m14081P(t8, j10, (1 << (iM14263i0 >>> 20)) | C2949q1.m14111z(t8, j10));
    }

    /* JADX INFO: renamed from: p */
    public final boolean m14271p(T t8, T t10, int i10) {
        int iM14280u0 = m14280u0(i10);
        long jM14228W = m14228W(iM14280u0);
        switch (m14239t0(iM14280u0)) {
            case 0:
                return m14265k(t8, t10, i10) && Double.doubleToLongBits(C2949q1.m14109x(t8, jM14228W)) == Double.doubleToLongBits(C2949q1.m14109x(t10, jM14228W));
            case 1:
                return m14265k(t8, t10, i10) && Float.floatToIntBits(C2949q1.m14110y(t8, jM14228W)) == Float.floatToIntBits(C2949q1.m14110y(t10, jM14228W));
            case 2:
                return m14265k(t8, t10, i10) && C2949q1.m14066A(t8, jM14228W) == C2949q1.m14066A(t10, jM14228W);
            case 3:
                return m14265k(t8, t10, i10) && C2949q1.m14066A(t8, jM14228W) == C2949q1.m14066A(t10, jM14228W);
            case 4:
                return m14265k(t8, t10, i10) && C2949q1.m14111z(t8, jM14228W) == C2949q1.m14111z(t10, jM14228W);
            case 5:
                return m14265k(t8, t10, i10) && C2949q1.m14066A(t8, jM14228W) == C2949q1.m14066A(t10, jM14228W);
            case 6:
                return m14265k(t8, t10, i10) && C2949q1.m14111z(t8, jM14228W) == C2949q1.m14111z(t10, jM14228W);
            case 7:
                return m14265k(t8, t10, i10) && C2949q1.m14103r(t8, jM14228W) == C2949q1.m14103r(t10, jM14228W);
            case 8:
                return m14265k(t8, t10, i10) && C2925i1.m13658I(C2949q1.m14068C(t8, jM14228W), C2949q1.m14068C(t10, jM14228W));
            case 9:
                return m14265k(t8, t10, i10) && C2925i1.m13658I(C2949q1.m14068C(t8, jM14228W), C2949q1.m14068C(t10, jM14228W));
            case 10:
                return m14265k(t8, t10, i10) && C2925i1.m13658I(C2949q1.m14068C(t8, jM14228W), C2949q1.m14068C(t10, jM14228W));
            case 11:
                return m14265k(t8, t10, i10) && C2949q1.m14111z(t8, jM14228W) == C2949q1.m14111z(t10, jM14228W);
            case 12:
                return m14265k(t8, t10, i10) && C2949q1.m14111z(t8, jM14228W) == C2949q1.m14111z(t10, jM14228W);
            case 13:
                return m14265k(t8, t10, i10) && C2949q1.m14111z(t8, jM14228W) == C2949q1.m14111z(t10, jM14228W);
            case 14:
                return m14265k(t8, t10, i10) && C2949q1.m14066A(t8, jM14228W) == C2949q1.m14066A(t10, jM14228W);
            case 15:
                return m14265k(t8, t10, i10) && C2949q1.m14111z(t8, jM14228W) == C2949q1.m14111z(t10, jM14228W);
            case 16:
                return m14265k(t8, t10, i10) && C2949q1.m14066A(t8, jM14228W) == C2949q1.m14066A(t10, jM14228W);
            case 17:
                return m14265k(t8, t10, i10) && C2925i1.m13658I(C2949q1.m14068C(t8, jM14228W), C2949q1.m14068C(t10, jM14228W));
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
                return C2925i1.m13658I(C2949q1.m14068C(t8, jM14228W), C2949q1.m14068C(t10, jM14228W));
            case 50:
                return C2925i1.m13658I(C2949q1.m14068C(t8, jM14228W), C2949q1.m14068C(t10, jM14228W));
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
                return m14247H(t8, t10, i10) && C2925i1.m13658I(C2949q1.m14068C(t8, jM14228W), C2949q1.m14068C(t10, jM14228W));
            default:
                return true;
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m14272p0(T t8, int i10, int i11) {
        C2949q1.m14081P(t8, m14263i0(i11) & 1048575, i10);
    }

    /* JADX DEBUG: Type inference failed for r3v0. Raw type applied. Possible types: java.util.Map<?, ?>, java.util.Map<K, V> */
    /* JADX INFO: renamed from: q */
    public final <UT, UB> UB m14273q(Object obj, int i10, UB ub, AbstractC2940n1<UT, UB> abstractC2940n1, Object obj2) {
        C2900a0.e eVarM14278t;
        int iM14256V = m14256V(i10);
        Object objM14068C = C2949q1.m14068C(obj, m14228W(m14280u0(i10)));
        return (objM14068C == null || (eVarM14278t = m14278t(i10)) == null) ? ub : (UB) m14275r(i10, iM14256V, this.f11123q.mo13986c(objM14068C), eVarM14278t, ub, abstractC2940n1, obj2);
    }

    /* JADX INFO: renamed from: q0 */
    public final int m14274q0(int i10, int i11) {
        int length = (this.f11107a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int iM14256V = m14256V(i13);
            if (i10 == iM14256V) {
                return i13;
            }
            if (i10 < iM14256V) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: r */
    public final <K, V, UT, UB> UB m14275r(int i10, int i11, Map<K, V> map, C2900a0.e eVar, UB ub, AbstractC2940n1<UT, UB> abstractC2940n1, Object obj) {
        this.f11123q.mo13985b(m14279u(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.m13387a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = abstractC2940n1.mo13997f(obj);
                }
                AbstractC2920h.h hVarM13558l = AbstractC2920h.m13558l(C2933l0.m13952b(null, next.getKey(), next.getValue()));
                try {
                    C2933l0.m13953d(hVarM13558l.m13577b(), null, next.getKey(), next.getValue());
                    abstractC2940n1.mo13995d(ub, i11, hVarM13558l.m13576a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m14276r0(T t8, int i10, Object obj) {
        f11106s.putObject(t8, m14228W(m14280u0(i10)), obj);
        m14270o0(t8, i10);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m14277s0(T t8, int i10, int i11, Object obj) {
        f11106s.putObject(t8, m14228W(m14280u0(i11)), obj);
        m14272p0(t8, i10, i11);
    }

    /* JADX INFO: renamed from: t */
    public final C2900a0.e m14278t(int i10) {
        return (C2900a0.e) this.f11108b[((i10 / 3) * 2) + 1];
    }

    /* JADX INFO: renamed from: u */
    public final Object m14279u(int i10) {
        return this.f11108b[(i10 / 3) * 2];
    }

    /* JADX INFO: renamed from: u0 */
    public final int m14280u0(int i10) {
        return this.f11107a[i10 + 1];
    }

    /* JADX INFO: renamed from: v */
    public final InterfaceC2919g1 m14281v(int i10) {
        int i11 = (i10 / 3) * 2;
        InterfaceC2919g1 interfaceC2919g1 = (InterfaceC2919g1) this.f11108b[i11];
        if (interfaceC2919g1 != null) {
            return interfaceC2919g1;
        }
        InterfaceC2919g1<T> interfaceC2919g1M13414c = C2907c1.m13412a().m13414c((Class) this.f11108b[i11 + 1]);
        this.f11108b[i11] = interfaceC2919g1M13414c;
        return interfaceC2919g1M13414c;
    }

    /* JADX DEBUG: Type inference failed for r2v4. Raw type applied. Possible types: com.google.crypto.tink.shaded.protobuf.n1<?, ?>, com.google.crypto.tink.shaded.protobuf.n1<UT, UB> */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    /* JADX INFO: renamed from: v0 */
    public final void m14282v0(T t8, InterfaceC2958t1 interfaceC2958t1) {
        Map.Entry<?, ?> entry;
        Iterator it;
        boolean z10;
        int i10;
        int i11;
        int i12;
        boolean z11;
        C2962v0<T> c2962v0 = this;
        if (c2962v0.f11112f) {
            C2959u<T> c2959uMo14058c = c2962v0.f11122p.mo14058c(t8);
            if (c2959uMo14058c.m14199m()) {
                entry = null;
                it = null;
            } else {
                Iterator itM14202s = c2959uMo14058c.m14202s();
                entry = (Map.Entry) itM14202s.next();
                it = itM14202s;
            }
        } else {
            entry = null;
            it = null;
        }
        int length = c2962v0.f11107a.length;
        Unsafe unsafe = f11106s;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length) {
            int iM14280u0 = c2962v0.m14280u0(i14);
            int iM14256V = c2962v0.m14256V(i14);
            int iM14239t0 = m14239t0(iM14280u0);
            if (iM14239t0 <= 17) {
                int i16 = c2962v0.f11107a[i14 + 2];
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
            while (entry != null && c2962v0.f11122p.mo14056a(entry) <= iM14256V) {
                c2962v0.f11122p.mo14065j(interfaceC2958t1, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long jM14228W = m14228W(iM14280u0);
            switch (iM14239t0) {
                case 0:
                    if (c2962v0.m14244B(t8, i14, i10, i11, i12)) {
                        interfaceC2958t1.mo13936p(iM14256V, m14237o(t8, jM14228W));
                    }
                    break;
                case 1:
                    if (c2962v0.m14244B(t8, i14, i10, i11, i12)) {
                        interfaceC2958t1.mo13882B(iM14256V, m14238s(t8, jM14228W));
                    }
                    c2962v0 = this;
                    break;
                case 2:
                    if (c2962v0.m14244B(t8, i14, i10, i11, i12)) {
                        interfaceC2958t1.mo13946u(iM14256V, unsafe.getLong(t8, jM14228W));
                    }
                    c2962v0 = this;
                    break;
                case 3:
                    if (c2962v0.m14244B(t8, i14, i10, i11, i12)) {
                        interfaceC2958t1.mo13916f(iM14256V, unsafe.getLong(t8, jM14228W));
                    }
                    c2962v0 = this;
                    break;
                case 4:
                    if (c2962v0.m14244B(t8, i14, i10, i11, i12)) {
                        interfaceC2958t1.mo13920h(iM14256V, unsafe.getInt(t8, jM14228W));
                    }
                    c2962v0 = this;
                    break;
                case 5:
                    if (c2962v0.m14244B(t8, i14, i10, i11, i12)) {
                        interfaceC2958t1.mo13942s(iM14256V, unsafe.getLong(t8, jM14228W));
                    }
                    c2962v0 = this;
                    break;
                case 6:
                    if (c2962v0.m14244B(t8, i14, i10, i11, i12)) {
                        interfaceC2958t1.mo13910c(iM14256V, unsafe.getInt(t8, jM14228W));
                    }
                    c2962v0 = this;
                    break;
                case 7:
                    if (c2962v0.m14244B(t8, i14, i10, i11, i12)) {
                        interfaceC2958t1.mo13947v(iM14256V, m14234l(t8, jM14228W));
                    }
                    c2962v0 = this;
                    break;
                case 8:
                    if (c2962v0.m14244B(t8, i14, i10, i11, i12)) {
                        c2962v0.m14286y0(iM14256V, unsafe.getObject(t8, jM14228W), interfaceC2958t1);
                    }
                    break;
                case 9:
                    if (c2962v0.m14244B(t8, i14, i10, i11, i12)) {
                        interfaceC2958t1.mo13894N(iM14256V, unsafe.getObject(t8, jM14228W), c2962v0.m14281v(i14));
                    }
                    break;
                case 10:
                    if (c2962v0.m14244B(t8, i14, i10, i11, i12)) {
                        interfaceC2958t1.mo13893M(iM14256V, (AbstractC2920h) unsafe.getObject(t8, jM14228W));
                    }
                    c2962v0 = this;
                    break;
                case 11:
                    if (c2962v0.m14244B(t8, i14, i10, i11, i12)) {
                        interfaceC2958t1.mo13934o(iM14256V, unsafe.getInt(t8, jM14228W));
                    }
                    c2962v0 = this;
                    break;
                case 12:
                    if (c2962v0.m14244B(t8, i14, i10, i11, i12)) {
                        interfaceC2958t1.mo13885E(iM14256V, unsafe.getInt(t8, jM14228W));
                    }
                    c2962v0 = this;
                    break;
                case 13:
                    if (c2962v0.m14244B(t8, i14, i10, i11, i12)) {
                        interfaceC2958t1.mo13948w(iM14256V, unsafe.getInt(t8, jM14228W));
                    }
                    c2962v0 = this;
                    break;
                case 14:
                    if (c2962v0.m14244B(t8, i14, i10, i11, i12)) {
                        interfaceC2958t1.mo13922i(iM14256V, unsafe.getLong(t8, jM14228W));
                    }
                    c2962v0 = this;
                    break;
                case 15:
                    if (c2962v0.m14244B(t8, i14, i10, i11, i12)) {
                        interfaceC2958t1.mo13888H(iM14256V, unsafe.getInt(t8, jM14228W));
                    }
                    c2962v0 = this;
                    break;
                case 16:
                    if (c2962v0.m14244B(t8, i14, i10, i11, i12)) {
                        interfaceC2958t1.mo13930m(iM14256V, unsafe.getLong(t8, jM14228W));
                    }
                    c2962v0 = this;
                    break;
                case 17:
                    if (c2962v0.m14244B(t8, i14, i10, i11, i12)) {
                        interfaceC2958t1.mo13891K(iM14256V, unsafe.getObject(t8, jM14228W), c2962v0.m14281v(i14));
                    }
                    break;
                case 18:
                    C2925i1.m13664O(c2962v0.m14256V(i14), (List) unsafe.getObject(t8, jM14228W), interfaceC2958t1, false);
                    break;
                case 19:
                    C2925i1.m13668S(c2962v0.m14256V(i14), (List) unsafe.getObject(t8, jM14228W), interfaceC2958t1, false);
                    break;
                case 20:
                    C2925i1.m13671V(c2962v0.m14256V(i14), (List) unsafe.getObject(t8, jM14228W), interfaceC2958t1, false);
                    break;
                case 21:
                    C2925i1.m13683d0(c2962v0.m14256V(i14), (List) unsafe.getObject(t8, jM14228W), interfaceC2958t1, false);
                    break;
                case 22:
                    C2925i1.m13670U(c2962v0.m14256V(i14), (List) unsafe.getObject(t8, jM14228W), interfaceC2958t1, false);
                    break;
                case 23:
                    C2925i1.m13667R(c2962v0.m14256V(i14), (List) unsafe.getObject(t8, jM14228W), interfaceC2958t1, false);
                    break;
                case 24:
                    C2925i1.m13666Q(c2962v0.m14256V(i14), (List) unsafe.getObject(t8, jM14228W), interfaceC2958t1, false);
                    break;
                case 25:
                    C2925i1.m13662M(c2962v0.m14256V(i14), (List) unsafe.getObject(t8, jM14228W), interfaceC2958t1, false);
                    break;
                case 26:
                    C2925i1.m13679b0(c2962v0.m14256V(i14), (List) unsafe.getObject(t8, jM14228W), interfaceC2958t1);
                    break;
                case 27:
                    C2925i1.m13672W(c2962v0.m14256V(i14), (List) unsafe.getObject(t8, jM14228W), interfaceC2958t1, c2962v0.m14281v(i14));
                    break;
                case 28:
                    C2925i1.m13663N(c2962v0.m14256V(i14), (List) unsafe.getObject(t8, jM14228W), interfaceC2958t1);
                    break;
                case 29:
                    z11 = false;
                    C2925i1.m13681c0(c2962v0.m14256V(i14), (List) unsafe.getObject(t8, jM14228W), interfaceC2958t1, false);
                    break;
                case 30:
                    z11 = false;
                    C2925i1.m13665P(c2962v0.m14256V(i14), (List) unsafe.getObject(t8, jM14228W), interfaceC2958t1, false);
                    break;
                case 31:
                    z11 = false;
                    C2925i1.m13673X(c2962v0.m14256V(i14), (List) unsafe.getObject(t8, jM14228W), interfaceC2958t1, false);
                    break;
                case 32:
                    z11 = false;
                    C2925i1.m13674Y(c2962v0.m14256V(i14), (List) unsafe.getObject(t8, jM14228W), interfaceC2958t1, false);
                    break;
                case 33:
                    z11 = false;
                    C2925i1.m13675Z(c2962v0.m14256V(i14), (List) unsafe.getObject(t8, jM14228W), interfaceC2958t1, false);
                    break;
                case 34:
                    z11 = false;
                    C2925i1.m13677a0(c2962v0.m14256V(i14), (List) unsafe.getObject(t8, jM14228W), interfaceC2958t1, false);
                    break;
                case 35:
                    C2925i1.m13664O(c2962v0.m14256V(i14), (List) unsafe.getObject(t8, jM14228W), interfaceC2958t1, z10);
                    break;
                case 36:
                    C2925i1.m13668S(c2962v0.m14256V(i14), (List) unsafe.getObject(t8, jM14228W), interfaceC2958t1, z10);
                    break;
                case 37:
                    C2925i1.m13671V(c2962v0.m14256V(i14), (List) unsafe.getObject(t8, jM14228W), interfaceC2958t1, z10);
                    break;
                case 38:
                    C2925i1.m13683d0(c2962v0.m14256V(i14), (List) unsafe.getObject(t8, jM14228W), interfaceC2958t1, z10);
                    break;
                case 39:
                    C2925i1.m13670U(c2962v0.m14256V(i14), (List) unsafe.getObject(t8, jM14228W), interfaceC2958t1, z10);
                    break;
                case 40:
                    C2925i1.m13667R(c2962v0.m14256V(i14), (List) unsafe.getObject(t8, jM14228W), interfaceC2958t1, z10);
                    break;
                case 41:
                    C2925i1.m13666Q(c2962v0.m14256V(i14), (List) unsafe.getObject(t8, jM14228W), interfaceC2958t1, z10);
                    break;
                case 42:
                    C2925i1.m13662M(c2962v0.m14256V(i14), (List) unsafe.getObject(t8, jM14228W), interfaceC2958t1, z10);
                    break;
                case 43:
                    C2925i1.m13681c0(c2962v0.m14256V(i14), (List) unsafe.getObject(t8, jM14228W), interfaceC2958t1, z10);
                    break;
                case 44:
                    C2925i1.m13665P(c2962v0.m14256V(i14), (List) unsafe.getObject(t8, jM14228W), interfaceC2958t1, z10);
                    break;
                case 45:
                    C2925i1.m13673X(c2962v0.m14256V(i14), (List) unsafe.getObject(t8, jM14228W), interfaceC2958t1, z10);
                    break;
                case 46:
                    C2925i1.m13674Y(c2962v0.m14256V(i14), (List) unsafe.getObject(t8, jM14228W), interfaceC2958t1, z10);
                    break;
                case 47:
                    C2925i1.m13675Z(c2962v0.m14256V(i14), (List) unsafe.getObject(t8, jM14228W), interfaceC2958t1, z10);
                    break;
                case 48:
                    C2925i1.m13677a0(c2962v0.m14256V(i14), (List) unsafe.getObject(t8, jM14228W), interfaceC2958t1, z10);
                    break;
                case 49:
                    C2925i1.m13669T(c2962v0.m14256V(i14), (List) unsafe.getObject(t8, jM14228W), interfaceC2958t1, c2962v0.m14281v(i14));
                    break;
                case 50:
                    c2962v0.m14285x0(interfaceC2958t1, iM14256V, unsafe.getObject(t8, jM14228W), i14);
                    break;
                case 51:
                    if (c2962v0.m14248I(t8, iM14256V, i14)) {
                        interfaceC2958t1.mo13936p(iM14256V, m14230Y(t8, jM14228W));
                    }
                    break;
                case 52:
                    if (c2962v0.m14248I(t8, iM14256V, i14)) {
                        interfaceC2958t1.mo13882B(iM14256V, m14231Z(t8, jM14228W));
                    }
                    break;
                case 53:
                    if (c2962v0.m14248I(t8, iM14256V, i14)) {
                        interfaceC2958t1.mo13946u(iM14256V, m14233b0(t8, jM14228W));
                    }
                    break;
                case 54:
                    if (c2962v0.m14248I(t8, iM14256V, i14)) {
                        interfaceC2958t1.mo13916f(iM14256V, m14233b0(t8, jM14228W));
                    }
                    break;
                case 55:
                    if (c2962v0.m14248I(t8, iM14256V, i14)) {
                        interfaceC2958t1.mo13920h(iM14256V, m14232a0(t8, jM14228W));
                    }
                    break;
                case 56:
                    if (c2962v0.m14248I(t8, iM14256V, i14)) {
                        interfaceC2958t1.mo13942s(iM14256V, m14233b0(t8, jM14228W));
                    }
                    break;
                case 57:
                    if (c2962v0.m14248I(t8, iM14256V, i14)) {
                        interfaceC2958t1.mo13910c(iM14256V, m14232a0(t8, jM14228W));
                    }
                    break;
                case 58:
                    if (c2962v0.m14248I(t8, iM14256V, i14)) {
                        interfaceC2958t1.mo13947v(iM14256V, m14229X(t8, jM14228W));
                    }
                    break;
                case 59:
                    if (c2962v0.m14248I(t8, iM14256V, i14)) {
                        c2962v0.m14286y0(iM14256V, unsafe.getObject(t8, jM14228W), interfaceC2958t1);
                    }
                    break;
                case 60:
                    if (c2962v0.m14248I(t8, iM14256V, i14)) {
                        interfaceC2958t1.mo13894N(iM14256V, unsafe.getObject(t8, jM14228W), c2962v0.m14281v(i14));
                    }
                    break;
                case 61:
                    if (c2962v0.m14248I(t8, iM14256V, i14)) {
                        interfaceC2958t1.mo13893M(iM14256V, (AbstractC2920h) unsafe.getObject(t8, jM14228W));
                    }
                    break;
                case 62:
                    if (c2962v0.m14248I(t8, iM14256V, i14)) {
                        interfaceC2958t1.mo13934o(iM14256V, m14232a0(t8, jM14228W));
                    }
                    break;
                case 63:
                    if (c2962v0.m14248I(t8, iM14256V, i14)) {
                        interfaceC2958t1.mo13885E(iM14256V, m14232a0(t8, jM14228W));
                    }
                    break;
                case 64:
                    if (c2962v0.m14248I(t8, iM14256V, i14)) {
                        interfaceC2958t1.mo13948w(iM14256V, m14232a0(t8, jM14228W));
                    }
                    break;
                case 65:
                    if (c2962v0.m14248I(t8, iM14256V, i14)) {
                        interfaceC2958t1.mo13922i(iM14256V, m14233b0(t8, jM14228W));
                    }
                    break;
                case 66:
                    if (c2962v0.m14248I(t8, iM14256V, i14)) {
                        interfaceC2958t1.mo13888H(iM14256V, m14232a0(t8, jM14228W));
                    }
                    break;
                case 67:
                    if (c2962v0.m14248I(t8, iM14256V, i14)) {
                        interfaceC2958t1.mo13930m(iM14256V, m14233b0(t8, jM14228W));
                    }
                    break;
                case 68:
                    if (c2962v0.m14248I(t8, iM14256V, i14)) {
                        interfaceC2958t1.mo13891K(iM14256V, unsafe.getObject(t8, jM14228W), c2962v0.m14281v(i14));
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
            c2962v0.f11122p.mo14065j(interfaceC2958t1, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        c2962v0.m14287z0(c2962v0.f11121o, t8, interfaceC2958t1);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: com.google.crypto.tink.shaded.protobuf.n1<?, ?>, com.google.crypto.tink.shaded.protobuf.n1<UT, UB> */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX INFO: renamed from: w0 */
    public final void m14283w0(T t8, InterfaceC2958t1 interfaceC2958t1) {
        Iterator itM14194g;
        Map.Entry<?, ?> entry;
        m14287z0(this.f11121o, t8, interfaceC2958t1);
        if (this.f11112f) {
            C2959u<T> c2959uMo14058c = this.f11122p.mo14058c(t8);
            if (c2959uMo14058c.m14199m()) {
                itM14194g = null;
                entry = null;
            } else {
                itM14194g = c2959uMo14058c.m14194g();
                entry = (Map.Entry) itM14194g.next();
            }
        } else {
            itM14194g = null;
            entry = null;
        }
        for (int length = this.f11107a.length - 3; length >= 0; length -= 3) {
            int iM14280u0 = m14280u0(length);
            int iM14256V = m14256V(length);
            while (entry != null && this.f11122p.mo14056a(entry) > iM14256V) {
                this.f11122p.mo14065j(interfaceC2958t1, entry);
                entry = itM14194g.hasNext() ? (Map.Entry) itM14194g.next() : null;
            }
            switch (m14239t0(iM14280u0)) {
                case 0:
                    if (m14243A(t8, length)) {
                        interfaceC2958t1.mo13936p(iM14256V, m14237o(t8, m14228W(iM14280u0)));
                    }
                    break;
                case 1:
                    if (m14243A(t8, length)) {
                        interfaceC2958t1.mo13882B(iM14256V, m14238s(t8, m14228W(iM14280u0)));
                    }
                    break;
                case 2:
                    if (m14243A(t8, length)) {
                        interfaceC2958t1.mo13946u(iM14256V, m14224K(t8, m14228W(iM14280u0)));
                    }
                    break;
                case 3:
                    if (m14243A(t8, length)) {
                        interfaceC2958t1.mo13916f(iM14256V, m14224K(t8, m14228W(iM14280u0)));
                    }
                    break;
                case 4:
                    if (m14243A(t8, length)) {
                        interfaceC2958t1.mo13920h(iM14256V, m14241y(t8, m14228W(iM14280u0)));
                    }
                    break;
                case 5:
                    if (m14243A(t8, length)) {
                        interfaceC2958t1.mo13942s(iM14256V, m14224K(t8, m14228W(iM14280u0)));
                    }
                    break;
                case 6:
                    if (m14243A(t8, length)) {
                        interfaceC2958t1.mo13910c(iM14256V, m14241y(t8, m14228W(iM14280u0)));
                    }
                    break;
                case 7:
                    if (m14243A(t8, length)) {
                        interfaceC2958t1.mo13947v(iM14256V, m14234l(t8, m14228W(iM14280u0)));
                    }
                    break;
                case 8:
                    if (m14243A(t8, length)) {
                        m14286y0(iM14256V, C2949q1.m14068C(t8, m14228W(iM14280u0)), interfaceC2958t1);
                    }
                    break;
                case 9:
                    if (m14243A(t8, length)) {
                        interfaceC2958t1.mo13894N(iM14256V, C2949q1.m14068C(t8, m14228W(iM14280u0)), m14281v(length));
                    }
                    break;
                case 10:
                    if (m14243A(t8, length)) {
                        interfaceC2958t1.mo13893M(iM14256V, (AbstractC2920h) C2949q1.m14068C(t8, m14228W(iM14280u0)));
                    }
                    break;
                case 11:
                    if (m14243A(t8, length)) {
                        interfaceC2958t1.mo13934o(iM14256V, m14241y(t8, m14228W(iM14280u0)));
                    }
                    break;
                case 12:
                    if (m14243A(t8, length)) {
                        interfaceC2958t1.mo13885E(iM14256V, m14241y(t8, m14228W(iM14280u0)));
                    }
                    break;
                case 13:
                    if (m14243A(t8, length)) {
                        interfaceC2958t1.mo13948w(iM14256V, m14241y(t8, m14228W(iM14280u0)));
                    }
                    break;
                case 14:
                    if (m14243A(t8, length)) {
                        interfaceC2958t1.mo13922i(iM14256V, m14224K(t8, m14228W(iM14280u0)));
                    }
                    break;
                case 15:
                    if (m14243A(t8, length)) {
                        interfaceC2958t1.mo13888H(iM14256V, m14241y(t8, m14228W(iM14280u0)));
                    }
                    break;
                case 16:
                    if (m14243A(t8, length)) {
                        interfaceC2958t1.mo13930m(iM14256V, m14224K(t8, m14228W(iM14280u0)));
                    }
                    break;
                case 17:
                    if (m14243A(t8, length)) {
                        interfaceC2958t1.mo13891K(iM14256V, C2949q1.m14068C(t8, m14228W(iM14280u0)), m14281v(length));
                    }
                    break;
                case 18:
                    C2925i1.m13664O(m14256V(length), (List) C2949q1.m14068C(t8, m14228W(iM14280u0)), interfaceC2958t1, false);
                    break;
                case 19:
                    C2925i1.m13668S(m14256V(length), (List) C2949q1.m14068C(t8, m14228W(iM14280u0)), interfaceC2958t1, false);
                    break;
                case 20:
                    C2925i1.m13671V(m14256V(length), (List) C2949q1.m14068C(t8, m14228W(iM14280u0)), interfaceC2958t1, false);
                    break;
                case 21:
                    C2925i1.m13683d0(m14256V(length), (List) C2949q1.m14068C(t8, m14228W(iM14280u0)), interfaceC2958t1, false);
                    break;
                case 22:
                    C2925i1.m13670U(m14256V(length), (List) C2949q1.m14068C(t8, m14228W(iM14280u0)), interfaceC2958t1, false);
                    break;
                case 23:
                    C2925i1.m13667R(m14256V(length), (List) C2949q1.m14068C(t8, m14228W(iM14280u0)), interfaceC2958t1, false);
                    break;
                case 24:
                    C2925i1.m13666Q(m14256V(length), (List) C2949q1.m14068C(t8, m14228W(iM14280u0)), interfaceC2958t1, false);
                    break;
                case 25:
                    C2925i1.m13662M(m14256V(length), (List) C2949q1.m14068C(t8, m14228W(iM14280u0)), interfaceC2958t1, false);
                    break;
                case 26:
                    C2925i1.m13679b0(m14256V(length), (List) C2949q1.m14068C(t8, m14228W(iM14280u0)), interfaceC2958t1);
                    break;
                case 27:
                    C2925i1.m13672W(m14256V(length), (List) C2949q1.m14068C(t8, m14228W(iM14280u0)), interfaceC2958t1, m14281v(length));
                    break;
                case 28:
                    C2925i1.m13663N(m14256V(length), (List) C2949q1.m14068C(t8, m14228W(iM14280u0)), interfaceC2958t1);
                    break;
                case 29:
                    C2925i1.m13681c0(m14256V(length), (List) C2949q1.m14068C(t8, m14228W(iM14280u0)), interfaceC2958t1, false);
                    break;
                case 30:
                    C2925i1.m13665P(m14256V(length), (List) C2949q1.m14068C(t8, m14228W(iM14280u0)), interfaceC2958t1, false);
                    break;
                case 31:
                    C2925i1.m13673X(m14256V(length), (List) C2949q1.m14068C(t8, m14228W(iM14280u0)), interfaceC2958t1, false);
                    break;
                case 32:
                    C2925i1.m13674Y(m14256V(length), (List) C2949q1.m14068C(t8, m14228W(iM14280u0)), interfaceC2958t1, false);
                    break;
                case 33:
                    C2925i1.m13675Z(m14256V(length), (List) C2949q1.m14068C(t8, m14228W(iM14280u0)), interfaceC2958t1, false);
                    break;
                case 34:
                    C2925i1.m13677a0(m14256V(length), (List) C2949q1.m14068C(t8, m14228W(iM14280u0)), interfaceC2958t1, false);
                    break;
                case 35:
                    C2925i1.m13664O(m14256V(length), (List) C2949q1.m14068C(t8, m14228W(iM14280u0)), interfaceC2958t1, true);
                    break;
                case 36:
                    C2925i1.m13668S(m14256V(length), (List) C2949q1.m14068C(t8, m14228W(iM14280u0)), interfaceC2958t1, true);
                    break;
                case 37:
                    C2925i1.m13671V(m14256V(length), (List) C2949q1.m14068C(t8, m14228W(iM14280u0)), interfaceC2958t1, true);
                    break;
                case 38:
                    C2925i1.m13683d0(m14256V(length), (List) C2949q1.m14068C(t8, m14228W(iM14280u0)), interfaceC2958t1, true);
                    break;
                case 39:
                    C2925i1.m13670U(m14256V(length), (List) C2949q1.m14068C(t8, m14228W(iM14280u0)), interfaceC2958t1, true);
                    break;
                case 40:
                    C2925i1.m13667R(m14256V(length), (List) C2949q1.m14068C(t8, m14228W(iM14280u0)), interfaceC2958t1, true);
                    break;
                case 41:
                    C2925i1.m13666Q(m14256V(length), (List) C2949q1.m14068C(t8, m14228W(iM14280u0)), interfaceC2958t1, true);
                    break;
                case 42:
                    C2925i1.m13662M(m14256V(length), (List) C2949q1.m14068C(t8, m14228W(iM14280u0)), interfaceC2958t1, true);
                    break;
                case 43:
                    C2925i1.m13681c0(m14256V(length), (List) C2949q1.m14068C(t8, m14228W(iM14280u0)), interfaceC2958t1, true);
                    break;
                case 44:
                    C2925i1.m13665P(m14256V(length), (List) C2949q1.m14068C(t8, m14228W(iM14280u0)), interfaceC2958t1, true);
                    break;
                case 45:
                    C2925i1.m13673X(m14256V(length), (List) C2949q1.m14068C(t8, m14228W(iM14280u0)), interfaceC2958t1, true);
                    break;
                case 46:
                    C2925i1.m13674Y(m14256V(length), (List) C2949q1.m14068C(t8, m14228W(iM14280u0)), interfaceC2958t1, true);
                    break;
                case 47:
                    C2925i1.m13675Z(m14256V(length), (List) C2949q1.m14068C(t8, m14228W(iM14280u0)), interfaceC2958t1, true);
                    break;
                case 48:
                    C2925i1.m13677a0(m14256V(length), (List) C2949q1.m14068C(t8, m14228W(iM14280u0)), interfaceC2958t1, true);
                    break;
                case 49:
                    C2925i1.m13669T(m14256V(length), (List) C2949q1.m14068C(t8, m14228W(iM14280u0)), interfaceC2958t1, m14281v(length));
                    break;
                case 50:
                    m14285x0(interfaceC2958t1, iM14256V, C2949q1.m14068C(t8, m14228W(iM14280u0)), length);
                    break;
                case 51:
                    if (m14248I(t8, iM14256V, length)) {
                        interfaceC2958t1.mo13936p(iM14256V, m14230Y(t8, m14228W(iM14280u0)));
                    }
                    break;
                case 52:
                    if (m14248I(t8, iM14256V, length)) {
                        interfaceC2958t1.mo13882B(iM14256V, m14231Z(t8, m14228W(iM14280u0)));
                    }
                    break;
                case 53:
                    if (m14248I(t8, iM14256V, length)) {
                        interfaceC2958t1.mo13946u(iM14256V, m14233b0(t8, m14228W(iM14280u0)));
                    }
                    break;
                case 54:
                    if (m14248I(t8, iM14256V, length)) {
                        interfaceC2958t1.mo13916f(iM14256V, m14233b0(t8, m14228W(iM14280u0)));
                    }
                    break;
                case 55:
                    if (m14248I(t8, iM14256V, length)) {
                        interfaceC2958t1.mo13920h(iM14256V, m14232a0(t8, m14228W(iM14280u0)));
                    }
                    break;
                case 56:
                    if (m14248I(t8, iM14256V, length)) {
                        interfaceC2958t1.mo13942s(iM14256V, m14233b0(t8, m14228W(iM14280u0)));
                    }
                    break;
                case 57:
                    if (m14248I(t8, iM14256V, length)) {
                        interfaceC2958t1.mo13910c(iM14256V, m14232a0(t8, m14228W(iM14280u0)));
                    }
                    break;
                case 58:
                    if (m14248I(t8, iM14256V, length)) {
                        interfaceC2958t1.mo13947v(iM14256V, m14229X(t8, m14228W(iM14280u0)));
                    }
                    break;
                case 59:
                    if (m14248I(t8, iM14256V, length)) {
                        m14286y0(iM14256V, C2949q1.m14068C(t8, m14228W(iM14280u0)), interfaceC2958t1);
                    }
                    break;
                case 60:
                    if (m14248I(t8, iM14256V, length)) {
                        interfaceC2958t1.mo13894N(iM14256V, C2949q1.m14068C(t8, m14228W(iM14280u0)), m14281v(length));
                    }
                    break;
                case 61:
                    if (m14248I(t8, iM14256V, length)) {
                        interfaceC2958t1.mo13893M(iM14256V, (AbstractC2920h) C2949q1.m14068C(t8, m14228W(iM14280u0)));
                    }
                    break;
                case 62:
                    if (m14248I(t8, iM14256V, length)) {
                        interfaceC2958t1.mo13934o(iM14256V, m14232a0(t8, m14228W(iM14280u0)));
                    }
                    break;
                case 63:
                    if (m14248I(t8, iM14256V, length)) {
                        interfaceC2958t1.mo13885E(iM14256V, m14232a0(t8, m14228W(iM14280u0)));
                    }
                    break;
                case 64:
                    if (m14248I(t8, iM14256V, length)) {
                        interfaceC2958t1.mo13948w(iM14256V, m14232a0(t8, m14228W(iM14280u0)));
                    }
                    break;
                case 65:
                    if (m14248I(t8, iM14256V, length)) {
                        interfaceC2958t1.mo13922i(iM14256V, m14233b0(t8, m14228W(iM14280u0)));
                    }
                    break;
                case 66:
                    if (m14248I(t8, iM14256V, length)) {
                        interfaceC2958t1.mo13888H(iM14256V, m14232a0(t8, m14228W(iM14280u0)));
                    }
                    break;
                case 67:
                    if (m14248I(t8, iM14256V, length)) {
                        interfaceC2958t1.mo13930m(iM14256V, m14233b0(t8, m14228W(iM14280u0)));
                    }
                    break;
                case 68:
                    if (m14248I(t8, iM14256V, length)) {
                        interfaceC2958t1.mo13891K(iM14256V, C2949q1.m14068C(t8, m14228W(iM14280u0)), m14281v(length));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.f11122p.mo14065j(interfaceC2958t1, entry);
            entry = itM14194g.hasNext() ? (Map.Entry) itM14194g.next() : null;
        }
    }

    /* JADX INFO: renamed from: x */
    public final <UT, UB> int m14284x(AbstractC2940n1<UT, UB> abstractC2940n1, T t8) {
        return abstractC2940n1.mo13999h(abstractC2940n1.mo13998g(t8));
    }

    /* JADX INFO: renamed from: x0 */
    public final <K, V> void m14285x0(InterfaceC2958t1 interfaceC2958t1, int i10, Object obj, int i11) {
        if (obj != null) {
            this.f11123q.mo13985b(m14279u(i11));
            interfaceC2958t1.mo13890J(i10, null, this.f11123q.mo13988e(obj));
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m14286y0(int i10, Object obj, InterfaceC2958t1 interfaceC2958t1) {
        if (obj instanceof String) {
            interfaceC2958t1.mo13914e(i10, (String) obj);
        } else {
            interfaceC2958t1.mo13893M(i10, (AbstractC2920h) obj);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final <UT, UB> void m14287z0(AbstractC2940n1<UT, UB> abstractC2940n1, T t8, InterfaceC2958t1 interfaceC2958t1) {
        abstractC2940n1.mo14011t(abstractC2940n1.mo13998g(t8), interfaceC2958t1);
    }
}
