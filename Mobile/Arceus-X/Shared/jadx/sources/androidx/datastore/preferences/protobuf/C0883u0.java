package androidx.datastore.preferences.protobuf;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0883u0<T> implements InterfaceC0842g1<T> {

    /* JADX INFO: renamed from: r */
    public static final int[] f3111r = new int[0];

    /* JADX INFO: renamed from: s */
    public static final Unsafe f3112s = C0872q1.m3960A();

    /* JADX INFO: renamed from: a */
    public final int[] f3113a;

    /* JADX INFO: renamed from: b */
    public final Object[] f3114b;

    /* JADX INFO: renamed from: c */
    public final int f3115c;

    /* JADX INFO: renamed from: d */
    public final int f3116d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0874r0 f3117e;

    /* JADX INFO: renamed from: f */
    public final boolean f3118f;

    /* JADX INFO: renamed from: g */
    public final boolean f3119g;

    /* JADX INFO: renamed from: h */
    public final EnumC0827b1 f3120h;

    /* JADX INFO: renamed from: i */
    public final boolean f3121i;

    /* JADX INFO: renamed from: j */
    public final int[] f3122j;

    /* JADX INFO: renamed from: k */
    public final int f3123k;

    /* JADX INFO: renamed from: l */
    public final int f3124l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC0887w0 f3125m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC0838f0 f3126n;

    /* JADX INFO: renamed from: o */
    public final AbstractC0863n1<?, ?> f3127o;

    /* JADX INFO: renamed from: p */
    public final AbstractC0867p<?> f3128p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC0859m0 f3129q;

    public C0883u0(int[] iArr, Object[] objArr, int i10, int i11, InterfaceC0874r0 interfaceC0874r0, EnumC0827b1 enumC0827b1, boolean z10, int[] iArr2, int i12, int i13, InterfaceC0887w0 interfaceC0887w0, InterfaceC0838f0 interfaceC0838f0, AbstractC0863n1<?, ?> abstractC0863n1, AbstractC0867p<?> abstractC0867p, InterfaceC0859m0 interfaceC0859m0) {
        this.f3113a = iArr;
        this.f3114b = objArr;
        this.f3115c = i10;
        this.f3116d = i11;
        this.f3119g = interfaceC0874r0 instanceof AbstractC0888x;
        this.f3120h = enumC0827b1;
        this.f3118f = abstractC0867p != null && abstractC0867p.mo3938e(interfaceC0874r0);
        this.f3121i = z10;
        this.f3122j = iArr2;
        this.f3123k = i12;
        this.f3124l = i13;
        this.f3125m = interfaceC0887w0;
        this.f3126n = interfaceC0838f0;
        this.f3127o = abstractC0863n1;
        this.f3128p = abstractC0867p;
        this.f3117e = interfaceC0874r0;
        this.f3129q = interfaceC0859m0;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m4103C(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0888x) {
            return ((AbstractC0888x) obj).m4186I();
        }
        return true;
    }

    /* JADX INFO: renamed from: F */
    public static boolean m4104F(int i10) {
        return (i10 & 268435456) != 0;
    }

    /* JADX INFO: renamed from: G */
    public static <T> long m4105G(T t8, long j10) {
        return C0872q1.m4000x(t8, j10);
    }

    /* JADX INFO: renamed from: O */
    public static <T> C0883u0<T> m4106O(Class<T> cls, InterfaceC0868p0 interfaceC0868p0, InterfaceC0887w0 interfaceC0887w0, InterfaceC0838f0 interfaceC0838f0, AbstractC0863n1<?, ?> abstractC0863n1, AbstractC0867p<?> abstractC0867p, InterfaceC0859m0 interfaceC0859m0) {
        return interfaceC0868p0 instanceof C0836e1 ? m4108Q((C0836e1) interfaceC0868p0, interfaceC0887w0, interfaceC0838f0, abstractC0863n1, abstractC0867p, interfaceC0859m0) : m4107P((C0854k1) interfaceC0868p0, interfaceC0887w0, interfaceC0838f0, abstractC0863n1, abstractC0867p, interfaceC0859m0);
    }

    /* JADX INFO: renamed from: P */
    public static <T> C0883u0<T> m4107P(C0854k1 c0854k1, InterfaceC0887w0 interfaceC0887w0, InterfaceC0838f0 interfaceC0838f0, AbstractC0863n1<?, ?> abstractC0863n1, AbstractC0867p<?> abstractC0867p, InterfaceC0859m0 interfaceC0859m0) {
        C0876s[] c0876sArrM3859e = c0854k1.m3859e();
        if (c0876sArrM3859e.length != 0) {
            C0876s c0876s = c0876sArrM3859e[0];
            throw null;
        }
        int length = c0876sArrM3859e.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        if (c0876sArrM3859e.length > 0) {
            C0876s c0876s2 = c0876sArrM3859e[0];
            throw null;
        }
        int[] iArrM3858d = c0854k1.m3858d();
        if (iArrM3858d == null) {
            iArrM3858d = f3111r;
        }
        if (c0876sArrM3859e.length > 0) {
            C0876s c0876s3 = c0876sArrM3859e[0];
            throw null;
        }
        int[] iArr2 = f3111r;
        int[] iArr3 = f3111r;
        int[] iArr4 = new int[iArrM3858d.length + iArr2.length + iArr3.length];
        System.arraycopy(iArrM3858d, 0, iArr4, 0, iArrM3858d.length);
        System.arraycopy(iArr2, 0, iArr4, iArrM3858d.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, iArrM3858d.length + iArr2.length, iArr3.length);
        return new C0883u0<>(iArr, objArr, 0, 0, c0854k1.mo3388b(), c0854k1.mo3389c(), true, iArr4, iArrM3858d.length, iArrM3858d.length + iArr2.length, interfaceC0887w0, interfaceC0838f0, abstractC0863n1, abstractC0867p, interfaceC0859m0);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0251  */
    /* JADX WARN: Code duplicated, block: B:122:0x0254  */
    /* JADX WARN: Code duplicated, block: B:125:0x026b  */
    /* JADX WARN: Code duplicated, block: B:126:0x026e  */
    /* JADX WARN: Code duplicated, block: B:163:0x0326  */
    /* JADX WARN: Code duplicated, block: B:180:0x0375  */
    /* JADX WARN: Code duplicated, block: B:183:0x0383  */
    /* JADX INFO: renamed from: Q */
    public static <T> C0883u0<T> m4108Q(C0836e1 c0836e1, InterfaceC0887w0 interfaceC0887w0, InterfaceC0838f0 interfaceC0838f0, AbstractC0863n1<?, ?> abstractC0863n1, AbstractC0867p<?> abstractC0867p, InterfaceC0859m0 interfaceC0859m0) {
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
        Field fieldM4115e0;
        char cCharAt9;
        int i32;
        int i33;
        int i34;
        Object obj;
        Field fieldM4115e1;
        int i35;
        Object obj2;
        Field fieldM4115e2;
        int i36;
        char cCharAt10;
        int i37;
        char cCharAt11;
        int i38;
        char cCharAt12;
        int i39;
        char cCharAt13;
        String strM3391e = c0836e1.m3391e();
        int length = strM3391e.length();
        char c10 = 55296;
        if (strM3391e.charAt(0) >= 55296) {
            int i40 = 1;
            while (true) {
                i10 = i40 + 1;
                if (strM3391e.charAt(i40) < 55296) {
                    break;
                }
                i40 = i10;
            }
        } else {
            i10 = 1;
        }
        int i41 = i10 + 1;
        int iCharAt2 = strM3391e.charAt(i10);
        if (iCharAt2 >= 55296) {
            int i42 = iCharAt2 & 8191;
            int i43 = 13;
            while (true) {
                i39 = i41 + 1;
                cCharAt13 = strM3391e.charAt(i41);
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
            iArr = f3111r;
            i14 = 0;
        } else {
            int i44 = i41 + 1;
            int iCharAt3 = strM3391e.charAt(i41);
            if (iCharAt3 >= 55296) {
                int i45 = iCharAt3 & 8191;
                int i46 = 13;
                while (true) {
                    i24 = i44 + 1;
                    cCharAt8 = strM3391e.charAt(i44);
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
            int iCharAt4 = strM3391e.charAt(i44);
            if (iCharAt4 >= 55296) {
                int i48 = iCharAt4 & 8191;
                int i49 = 13;
                while (true) {
                    i23 = i47 + 1;
                    cCharAt7 = strM3391e.charAt(i47);
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
            int iCharAt5 = strM3391e.charAt(i47);
            if (iCharAt5 >= 55296) {
                int i51 = iCharAt5 & 8191;
                int i52 = 13;
                while (true) {
                    i22 = i50 + 1;
                    cCharAt6 = strM3391e.charAt(i50);
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
            int iCharAt6 = strM3391e.charAt(i50);
            if (iCharAt6 >= 55296) {
                int i54 = iCharAt6 & 8191;
                int i55 = 13;
                while (true) {
                    i21 = i53 + 1;
                    cCharAt5 = strM3391e.charAt(i53);
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
            iCharAt = strM3391e.charAt(i53);
            if (iCharAt >= 55296) {
                int i57 = iCharAt & 8191;
                int i58 = 13;
                while (true) {
                    i20 = i56 + 1;
                    cCharAt4 = strM3391e.charAt(i56);
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
            int iCharAt7 = strM3391e.charAt(i56);
            if (iCharAt7 >= 55296) {
                int i60 = iCharAt7 & 8191;
                int i61 = 13;
                while (true) {
                    i19 = i59 + 1;
                    cCharAt3 = strM3391e.charAt(i59);
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
            int iCharAt8 = strM3391e.charAt(i59);
            if (iCharAt8 >= 55296) {
                int i63 = iCharAt8 & 8191;
                int i64 = 13;
                while (true) {
                    i18 = i62 + 1;
                    cCharAt2 = strM3391e.charAt(i62);
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
            int iCharAt9 = strM3391e.charAt(i62);
            if (iCharAt9 >= 55296) {
                int i66 = iCharAt9 & 8191;
                int i67 = 13;
                while (true) {
                    i17 = i65 + 1;
                    cCharAt = strM3391e.charAt(i65);
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
        Unsafe unsafe = f3112s;
        Object[] objArrM3390d = c0836e1.m3390d();
        Class<?> cls = c0836e1.mo3388b().getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt * 2];
        int i69 = i15 + i13;
        int i70 = i69;
        int i71 = i15;
        int i72 = 0;
        int i73 = 0;
        while (i41 < length) {
            int i74 = i41 + 1;
            int iCharAt10 = strM3391e.charAt(i41);
            if (iCharAt10 >= c10) {
                int i75 = iCharAt10 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i38 = i76 + 1;
                    cCharAt12 = strM3391e.charAt(i76);
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
            int iCharAt11 = strM3391e.charAt(i25);
            if (iCharAt11 >= c10) {
                int i79 = iCharAt11 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i37 = i80 + 1;
                    cCharAt11 = strM3391e.charAt(i80);
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
                int iCharAt12 = strM3391e.charAt(i26);
                char c11 = 55296;
                if (iCharAt12 >= 55296) {
                    int i85 = iCharAt12 & 8191;
                    int i86 = 13;
                    while (true) {
                        i36 = i84 + 1;
                        cCharAt10 = strM3391e.charAt(i84);
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
                    objArr[((i73 / 3) * 2) + 1] = objArrM3390d[i11];
                } else {
                    if (i87 == 12 && (c0836e1.mo3389c().equals(EnumC0827b1.PROTO2) || (iCharAt11 & 2048) != 0)) {
                        i33 = i11 + 1;
                        objArr[((i73 / 3) * 2) + 1] = objArrM3390d[i11];
                    }
                    i34 = iCharAt12 * 2;
                    obj = objArrM3390d[i34];
                    if (obj instanceof Field) {
                        fieldM4115e1 = (Field) obj;
                    } else {
                        fieldM4115e1 = m4115e0(cls, (String) obj);
                        objArrM3390d[i34] = fieldM4115e1;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldM4115e1);
                    i35 = i34 + 1;
                    obj2 = objArrM3390d[i35];
                    if (obj2 instanceof Field) {
                        fieldM4115e2 = (Field) obj2;
                    } else {
                        fieldM4115e2 = m4115e0(cls, (String) obj2);
                        objArrM3390d[i35] = fieldM4115e2;
                    }
                    strM3391e = strM3391e;
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM4115e2);
                    i31 = iObjectFieldOffset4;
                    i30 = 0;
                    i27 = iCharAt10;
                    i41 = i88;
                }
                i11 = i33;
                i34 = iCharAt12 * 2;
                obj = objArrM3390d[i34];
                if (obj instanceof Field) {
                    fieldM4115e1 = (Field) obj;
                } else {
                    fieldM4115e1 = m4115e0(cls, (String) obj);
                    objArrM3390d[i34] = fieldM4115e1;
                }
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldM4115e1);
                i35 = i34 + 1;
                obj2 = objArrM3390d[i35];
                if (obj2 instanceof Field) {
                    fieldM4115e2 = (Field) obj2;
                } else {
                    fieldM4115e2 = m4115e0(cls, (String) obj2);
                    objArrM3390d[i35] = fieldM4115e2;
                }
                strM3391e = strM3391e;
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM4115e2);
                i31 = iObjectFieldOffset5;
                i30 = 0;
                i27 = iCharAt10;
                i41 = i88;
            } else {
                int i89 = i11 + 1;
                Field fieldM4115e3 = m4115e0(cls, (String) objArrM3390d[i11]);
                if (i82 == 9 || i82 == 17) {
                    i27 = iCharAt10;
                    objArr[((i73 / 3) * 2) + 1] = fieldM4115e3.getType();
                } else {
                    if (i82 == 27 || i82 == 49) {
                        i27 = iCharAt10;
                        i32 = i11 + 2;
                        objArr[((i73 / 3) * 2) + 1] = objArrM3390d[i89];
                    } else if (i82 == 12 || i82 == 30 || i82 == 44) {
                        i27 = iCharAt10;
                        if (c0836e1.mo3389c() == EnumC0827b1.PROTO2 || (iCharAt11 & 2048) != 0) {
                            i32 = i11 + 2;
                            objArr[((i73 / 3) * 2) + 1] = objArrM3390d[i89];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM4115e3);
                        if ((iCharAt11 & 4096) != 0 || i82 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i29 = i26;
                            i30 = 0;
                        } else {
                            int i90 = i26 + 1;
                            int iCharAt13 = strM3391e.charAt(i26);
                            if (iCharAt13 >= 55296) {
                                int i91 = iCharAt13 & 8191;
                                int i92 = 13;
                                while (true) {
                                    i29 = i90 + 1;
                                    cCharAt9 = strM3391e.charAt(i90);
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
                            Object obj3 = objArrM3390d[i93];
                            if (obj3 instanceof Field) {
                                fieldM4115e0 = (Field) obj3;
                            } else {
                                fieldM4115e0 = m4115e0(cls, (String) obj3);
                                objArrM3390d[i93] = fieldM4115e0;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM4115e0);
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
                            objArr[i96] = objArrM3390d[i89];
                            if ((iCharAt11 & 2048) != 0) {
                                i28 = i11 + 3;
                                objArr[i96 + 1] = objArrM3390d[i97];
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
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM4115e3);
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
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM4115e3);
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
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM4115e3);
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
            strM3391e = strM3391e;
            c10 = 55296;
        }
        return new C0883u0<>(iArr3, objArr, i12, i16, c0836e1.mo3388b(), c0836e1.mo3389c(), false, iArr, i15, i69, interfaceC0887w0, interfaceC0838f0, abstractC0863n1, abstractC0867p, interfaceC0859m0);
    }

    /* JADX INFO: renamed from: S */
    public static long m4109S(int i10) {
        return i10 & 1048575;
    }

    /* JADX INFO: renamed from: T */
    public static <T> boolean m4110T(T t8, long j10) {
        return ((Boolean) C0872q1.m4002z(t8, j10)).booleanValue();
    }

    /* JADX INFO: renamed from: U */
    public static <T> double m4111U(T t8, long j10) {
        return ((Double) C0872q1.m4002z(t8, j10)).doubleValue();
    }

    /* JADX INFO: renamed from: V */
    public static <T> float m4112V(T t8, long j10) {
        return ((Float) C0872q1.m4002z(t8, j10)).floatValue();
    }

    /* JADX INFO: renamed from: W */
    public static <T> int m4113W(T t8, long j10) {
        return ((Integer) C0872q1.m4002z(t8, j10)).intValue();
    }

    /* JADX INFO: renamed from: X */
    public static <T> long m4114X(T t8, long j10) {
        return ((Long) C0872q1.m4002z(t8, j10)).longValue();
    }

    /* JADX INFO: renamed from: e0 */
    public static Field m4115e0(Class<?> cls, String str) {
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

    /* JADX INFO: renamed from: k */
    public static <T> boolean m4116k(T t8, long j10) {
        return C0872q1.m3992p(t8, j10);
    }

    /* JADX INFO: renamed from: k0 */
    public static int m4117k0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    /* JADX INFO: renamed from: l */
    public static void m4118l(Object obj) {
        if (m4103C(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    /* JADX INFO: renamed from: m */
    public static <T> double m4119m(T t8, long j10) {
        return C0872q1.m3997u(t8, j10);
    }

    /* JADX INFO: renamed from: q */
    public static <T> float m4120q(T t8, long j10) {
        return C0872q1.m3998v(t8, j10);
    }

    /* JADX INFO: renamed from: v */
    public static <T> int m4121v(T t8, long j10) {
        return C0872q1.m3999w(t8, j10);
    }

    /* JADX INFO: renamed from: w */
    public static boolean m4122w(int i10) {
        return (i10 & 536870912) != 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: androidx.datastore.preferences.protobuf.g1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public static boolean m4123z(Object obj, int i10, InterfaceC0842g1 interfaceC0842g1) {
        return interfaceC0842g1.mo3470c(C0872q1.m4002z(obj, m4109S(i10)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: androidx.datastore.preferences.protobuf.g1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public final <N> boolean m4124A(Object obj, int i10, int i11) {
        List list = (List) C0872q1.m4002z(obj, m4109S(i10));
        if (list.isEmpty()) {
            return true;
        }
        InterfaceC0842g1 interfaceC0842g1M4159t = m4159t(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!interfaceC0842g1M4159t.mo3470c(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:21:? */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [androidx.datastore.preferences.protobuf.g1] */
    /* JADX INFO: renamed from: B */
    public final boolean m4125B(T t8, int i10, int i11) {
        Map<?, ?> mapMo3881e = this.f3129q.mo3881e(C0872q1.m4002z(t8, m4109S(i10)));
        if (mapMo3881e.isEmpty()) {
            return true;
        }
        if (this.f3129q.mo3878b(m4158s(i11)).f2944c.m4061a() != C0878s1.c.MESSAGE) {
            return true;
        }
        ?? M3366c = 0;
        for (Object obj : mapMo3881e.values()) {
            if (M3366c == 0) {
                M3366c = M3366c;
                M3366c = C0830c1.m3364a().m3366c(obj.getClass());
            }
            M3366c = M3366c;
            if (!M3366c.mo3470c(obj)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m4126D(T t8, T t10, int i10) {
        long jM4137Z = m4137Z(i10) & 1048575;
        return C0872q1.m3999w(t8, jM4137Z) == C0872q1.m3999w(t10, jM4137Z);
    }

    /* JADX INFO: renamed from: E */
    public final boolean m4127E(T t8, int i10, int i11) {
        return C0872q1.m3999w(t8, (long) (m4137Z(i11) & 1048575)) == i10;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 20401. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: H */
    public final <UT, UB, ET extends androidx.datastore.preferences.protobuf.C0879t.b<ET>> void m4128H(androidx.datastore.preferences.protobuf.AbstractC0863n1<UT, UB> r18, androidx.datastore.preferences.protobuf.AbstractC0867p<ET> r19, T r20, androidx.datastore.preferences.protobuf.InterfaceC0839f1 r21, androidx.datastore.preferences.protobuf.C0864o r22) {
        /*
            r17 = this;
            r1 = r17
            r4 = r22
            r0 = 0
            r5 = 0
        L6:
            int r2 = r21.mo3396A()     // Catch: java.lang.Throwable -> L744
            int r3 = r1.m4136Y(r2)     // Catch: java.lang.Throwable -> L744
            r9 = 0
            if (r3 >= 0) goto Ld4
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r3) goto L3f
            int r0 = r1.f3123k
            r4 = r5
        L19:
            int r2 = r1.f3124l
            if (r0 >= r2) goto L32
            int[] r2 = r1.f3122j
            r3 = r2[r0]
            r6 = r20
            r5 = r18
            r2 = r20
            java.lang.Object r4 = r1.m4152o(r2, r3, r4, r5, r6)
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
            r6.mo3905o(r1, r4)
        L3c:
            r1 = r10
            goto L740
        L3f:
            r6 = r18
            r10 = r1
            r1 = r20
            boolean r3 = r10.f3118f     // Catch: java.lang.Throwable -> Lcc
            if (r3 != 0) goto L4c
            r7 = r19
            r3 = 0
            goto L55
        L4c:
            androidx.datastore.preferences.protobuf.r0 r3 = r10.f3117e     // Catch: java.lang.Throwable -> Lcc
            r7 = r19
            java.lang.Object r2 = r7.mo3935b(r4, r3, r2)     // Catch: java.lang.Throwable -> Lcc
            r3 = r2
        L55:
            if (r3 == 0) goto L81
            if (r0 != 0) goto L5d
            androidx.datastore.preferences.protobuf.t r0 = r19.mo3937d(r20)     // Catch: java.lang.Throwable -> L65
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
            java.lang.Object r3 = r0.mo3940g(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L78
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
            boolean r1 = r5.mo3907q(r4)     // Catch: java.lang.Throwable -> Lc7
            if (r1 == 0) goto L9a
            boolean r1 = r4.mo3399D()     // Catch: java.lang.Throwable -> L98
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
            java.lang.Object r1 = r5.mo3896f(r2)     // Catch: java.lang.Throwable -> L98
            r11 = r1
        La1:
            boolean r1 = r5.m3903m(r11, r4, r9)     // Catch: java.lang.Throwable -> Lc7
            if (r1 == 0) goto La8
            goto L93
        La8:
            int r0 = r10.f3123k
            r4 = r11
        Lab:
            int r1 = r10.f3124l
            if (r0 >= r1) goto Lbe
            int[] r1 = r10.f3122j
            r3 = r1[r0]
            r6 = r20
            r1 = r10
            java.lang.Object r4 = r1.m4152o(r2, r3, r4, r5, r6)
            r7 = r2
            int r0 = r0 + 1
            goto Lab
        Lbe:
            r7 = r2
            r1 = r10
            if (r4 == 0) goto L740
            r5.mo3905o(r7, r4)
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
            int r10 = r1.m4148l0(r3)     // Catch: java.lang.Throwable -> Lef
            int r12 = m4117k0(r10)     // Catch: java.lang.Throwable -> Lef androidx.datastore.preferences.protobuf.C0823a0.a -> Lf1
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
            }     // Catch: java.lang.Throwable -> Lef androidx.datastore.preferences.protobuf.C0823a0.a -> Lf1
        Le7:
            if (r11 != 0) goto Lf6
            java.lang.Object r2 = r5.mo3896f(r7)     // Catch: java.lang.Throwable -> Lef androidx.datastore.preferences.protobuf.C0823a0.a -> Lf1
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
            boolean r2 = r5.m3903m(r11, r4, r9)     // Catch: java.lang.Throwable -> Lef androidx.datastore.preferences.protobuf.C0823a0.a -> Lf1
            if (r2 != 0) goto L11a
            int r0 = r1.f3123k
            r4 = r11
        Lff:
            int r2 = r1.f3124l
            if (r0 >= r2) goto L112
            int[] r2 = r1.f3122j
            r3 = r2[r0]
            r6 = r20
            r2 = r7
            java.lang.Object r4 = r1.m4152o(r2, r3, r4, r5, r6)
            r12 = r5
            int r0 = r0 + 1
            goto Lff
        L112:
            r12 = r5
            if (r4 == 0) goto L740
            r12.mo3905o(r7, r4)
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
            java.lang.Object r5 = r1.m4134N(r7, r2, r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            androidx.datastore.preferences.protobuf.r0 r5 = (androidx.datastore.preferences.protobuf.InterfaceC0874r0) r5     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            androidx.datastore.preferences.protobuf.g1 r10 = r1.m4159t(r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            r4.mo3410O(r5, r10, r6)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            r1.m4147j0(r7, r2, r3, r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L131:
            r0 = move-exception
            goto Ld2
        L133:
            r12 = r5
            long r13 = m4109S(r10)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            long r15 = r4.mo3436y()     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            java.lang.Long r5 = java.lang.Long.valueOf(r15)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            androidx.datastore.preferences.protobuf.C0872q1.m3974O(r7, r13, r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            r1.m4143g0(r7, r2, r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L147:
            r12 = r5
            long r13 = m4109S(r10)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            int r5 = r4.mo3423l()     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            androidx.datastore.preferences.protobuf.C0872q1.m3974O(r7, r13, r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            r1.m4143g0(r7, r2, r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L15b:
            r12 = r5
            long r13 = m4109S(r10)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            long r15 = r4.mo3417f()     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            java.lang.Long r5 = java.lang.Long.valueOf(r15)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            androidx.datastore.preferences.protobuf.C0872q1.m3974O(r7, r13, r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            r1.m4143g0(r7, r2, r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L16f:
            r12 = r5
            long r13 = m4109S(r10)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            int r5 = r4.mo3400E()     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            androidx.datastore.preferences.protobuf.C0872q1.m3974O(r7, r13, r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            r1.m4143g0(r7, r2, r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L183:
            r12 = r5
            int r5 = r4.mo3422k()     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            androidx.datastore.preferences.protobuf.z$c r13 = r1.m4157r(r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            if (r13 == 0) goto L19c
            boolean r13 = r13.m4245a(r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            if (r13 == 0) goto L195
            goto L19c
        L195:
            java.lang.Object r5 = androidx.datastore.preferences.protobuf.C0848i1.m3579J(r7, r2, r5, r11, r12)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            r2 = r7
            goto L741
        L19c:
            long r13 = m4109S(r10)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            androidx.datastore.preferences.protobuf.C0872q1.m3974O(r7, r13, r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            r1.m4143g0(r7, r2, r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L1ac:
            r12 = r5
            long r13 = m4109S(r10)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            int r5 = r4.mo3419h()     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            androidx.datastore.preferences.protobuf.C0872q1.m3974O(r7, r13, r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            r1.m4143g0(r7, r2, r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L1c1:
            r12 = r5
            long r13 = m4109S(r10)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            androidx.datastore.preferences.protobuf.g r5 = r4.mo3426o()     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            androidx.datastore.preferences.protobuf.C0872q1.m3974O(r7, r13, r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            r1.m4143g0(r7, r2, r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L1d2:
            r12 = r5
            java.lang.Object r5 = r1.m4134N(r7, r2, r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            androidx.datastore.preferences.protobuf.r0 r5 = (androidx.datastore.preferences.protobuf.InterfaceC0874r0) r5     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            androidx.datastore.preferences.protobuf.g1 r10 = r1.m4159t(r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            r4.mo3405J(r5, r10, r6)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            r1.m4147j0(r7, r2, r3, r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L1e5:
            r12 = r5
            r1.m4140c0(r7, r10, r4)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            r1.m4143g0(r7, r2, r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L1ee:
            r12 = r5
            long r13 = m4109S(r10)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            boolean r5 = r4.mo3416e()     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            androidx.datastore.preferences.protobuf.C0872q1.m3974O(r7, r13, r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            r1.m4143g0(r7, r2, r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L203:
            r12 = r5
            long r13 = m4109S(r10)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            int r5 = r4.mo3432u()     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            androidx.datastore.preferences.protobuf.C0872q1.m3974O(r7, r13, r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            r1.m4143g0(r7, r2, r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L218:
            r12 = r5
            long r13 = m4109S(r10)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            long r15 = r4.mo3413b()     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            java.lang.Long r5 = java.lang.Long.valueOf(r15)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            androidx.datastore.preferences.protobuf.C0872q1.m3974O(r7, r13, r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            r1.m4143g0(r7, r2, r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L22d:
            r12 = r5
            long r13 = m4109S(r10)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            int r5 = r4.mo3427p()     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            androidx.datastore.preferences.protobuf.C0872q1.m3974O(r7, r13, r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            r1.m4143g0(r7, r2, r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L242:
            r12 = r5
            long r13 = m4109S(r10)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            long r15 = r4.mo3430s()     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            java.lang.Long r5 = java.lang.Long.valueOf(r15)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            androidx.datastore.preferences.protobuf.C0872q1.m3974O(r7, r13, r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            r1.m4143g0(r7, r2, r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L257:
            r12 = r5
            long r13 = m4109S(r10)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            long r15 = r4.mo3403H()     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            java.lang.Long r5 = java.lang.Long.valueOf(r15)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            androidx.datastore.preferences.protobuf.C0872q1.m3974O(r7, r13, r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            r1.m4143g0(r7, r2, r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L26c:
            r12 = r5
            long r13 = m4109S(r10)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            float r5 = r4.readFloat()     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            androidx.datastore.preferences.protobuf.C0872q1.m3974O(r7, r13, r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            r1.m4143g0(r7, r2, r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L281:
            r12 = r5
            long r13 = m4109S(r10)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            double r15 = r4.readDouble()     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            java.lang.Double r5 = java.lang.Double.valueOf(r15)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            androidx.datastore.preferences.protobuf.C0872q1.m3974O(r7, r13, r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            r1.m4143g0(r7, r2, r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf2 java.lang.Throwable -> L131
            goto L11b
        L296:
            r12 = r5
            java.lang.Object r4 = r1.m4158s(r3)     // Catch: java.lang.Throwable -> L2aa androidx.datastore.preferences.protobuf.C0823a0.a -> L2af
            r5 = r6
            r2 = r7
            r6 = r21
            r1.m4129I(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2aa androidx.datastore.preferences.protobuf.C0823a0.a -> L2af
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
            long r4 = m4109S(r10)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> L2af java.lang.Throwable -> L2df
            androidx.datastore.preferences.protobuf.g1 r6 = r1.m4159t(r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> L2af java.lang.Throwable -> L2df
            r2 = r20
            r7 = r22
            r3 = r4
            r5 = r21
            r1.m4138a0(r2, r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L2d4 androidx.datastore.preferences.protobuf.C0823a0.a -> L2da
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
            androidx.datastore.preferences.protobuf.f0 r2 = r7.f3126n     // Catch: java.lang.Throwable -> L2f8 androidx.datastore.preferences.protobuf.C0823a0.a -> L2fa
            long r3 = m4109S(r10)     // Catch: java.lang.Throwable -> L2f8 androidx.datastore.preferences.protobuf.C0823a0.a -> L2fa
            java.util.List r2 = r2.mo3395c(r1, r3)     // Catch: java.lang.Throwable -> L2f8 androidx.datastore.preferences.protobuf.C0823a0.a -> L2fa
            r13.mo3415d(r2)     // Catch: java.lang.Throwable -> L2f8 androidx.datastore.preferences.protobuf.C0823a0.a -> L2fa
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
            androidx.datastore.preferences.protobuf.f0 r2 = r7.f3126n     // Catch: java.lang.Throwable -> L2f8 androidx.datastore.preferences.protobuf.C0823a0.a -> L2fa
            long r3 = m4109S(r10)     // Catch: java.lang.Throwable -> L2f8 androidx.datastore.preferences.protobuf.C0823a0.a -> L2fa
            java.util.List r2 = r2.mo3395c(r1, r3)     // Catch: java.lang.Throwable -> L2f8 androidx.datastore.preferences.protobuf.C0823a0.a -> L2fa
            r13.mo3429r(r2)     // Catch: java.lang.Throwable -> L2f8 androidx.datastore.preferences.protobuf.C0823a0.a -> L2fa
            goto L2cd
        L315:
            r12 = r7
            r7 = r1
            r1 = r12
            r13 = r4
            r12 = r5
            androidx.datastore.preferences.protobuf.f0 r2 = r7.f3126n     // Catch: java.lang.Throwable -> L2f8 androidx.datastore.preferences.protobuf.C0823a0.a -> L2fa
            long r3 = m4109S(r10)     // Catch: java.lang.Throwable -> L2f8 androidx.datastore.preferences.protobuf.C0823a0.a -> L2fa
            java.util.List r2 = r2.mo3395c(r1, r3)     // Catch: java.lang.Throwable -> L2f8 androidx.datastore.preferences.protobuf.C0823a0.a -> L2fa
            r13.mo3433v(r2)     // Catch: java.lang.Throwable -> L2f8 androidx.datastore.preferences.protobuf.C0823a0.a -> L2fa
            goto L2cd
        L328:
            r12 = r7
            r7 = r1
            r1 = r12
            r13 = r4
            r12 = r5
            androidx.datastore.preferences.protobuf.f0 r2 = r7.f3126n     // Catch: java.lang.Throwable -> L2f8 androidx.datastore.preferences.protobuf.C0823a0.a -> L2fa
            long r3 = m4109S(r10)     // Catch: java.lang.Throwable -> L2f8 androidx.datastore.preferences.protobuf.C0823a0.a -> L2fa
            java.util.List r2 = r2.mo3395c(r1, r3)     // Catch: java.lang.Throwable -> L2f8 androidx.datastore.preferences.protobuf.C0823a0.a -> L2fa
            r13.mo3414c(r2)     // Catch: java.lang.Throwable -> L2f8 androidx.datastore.preferences.protobuf.C0823a0.a -> L2fa
            goto L2cd
        L33b:
            r12 = r7
            r7 = r1
            r1 = r12
            r13 = r4
            r12 = r5
            androidx.datastore.preferences.protobuf.f0 r4 = r7.f3126n     // Catch: java.lang.Throwable -> L370 androidx.datastore.preferences.protobuf.C0823a0.a -> L374
            long r5 = m4109S(r10)     // Catch: java.lang.Throwable -> L370 androidx.datastore.preferences.protobuf.C0823a0.a -> L374
            java.util.List r4 = r4.mo3395c(r1, r5)     // Catch: java.lang.Throwable -> L370 androidx.datastore.preferences.protobuf.C0823a0.a -> L374
            r13.mo3421j(r4)     // Catch: java.lang.Throwable -> L370 androidx.datastore.preferences.protobuf.C0823a0.a -> L374
            r5 = r4
            androidx.datastore.preferences.protobuf.z$c r4 = r7.m4157r(r3)     // Catch: java.lang.Throwable -> L370 androidx.datastore.preferences.protobuf.C0823a0.a -> L374
            r3 = r5
            r5 = r11
            r6 = r12
            java.lang.Object r5 = androidx.datastore.preferences.protobuf.C0848i1.m3570A(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L362 androidx.datastore.preferences.protobuf.C0823a0.a -> L369
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
            androidx.datastore.preferences.protobuf.f0 r1 = r7.f3126n     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            long r3 = m4109S(r10)     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            java.util.List r1 = r1.mo3395c(r2, r3)     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            r13.mo3431t(r1)     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
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
            androidx.datastore.preferences.protobuf.f0 r1 = r7.f3126n     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            long r3 = m4109S(r10)     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            java.util.List r1 = r1.mo3395c(r2, r3)     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            r13.mo3424m(r1)     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            goto L387
        L3a7:
            r13 = r4
            r2 = r7
            r5 = r11
            r7 = r1
            androidx.datastore.preferences.protobuf.f0 r1 = r7.f3126n     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            long r3 = m4109S(r10)     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            java.util.List r1 = r1.mo3395c(r2, r3)     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            r13.mo3435x(r1)     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            goto L387
        L3b9:
            r13 = r4
            r2 = r7
            r5 = r11
            r7 = r1
            androidx.datastore.preferences.protobuf.f0 r1 = r7.f3126n     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            long r3 = m4109S(r10)     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            java.util.List r1 = r1.mo3395c(r2, r3)     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            r13.mo3428q(r1)     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            goto L387
        L3cb:
            r13 = r4
            r2 = r7
            r5 = r11
            r7 = r1
            androidx.datastore.preferences.protobuf.f0 r1 = r7.f3126n     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            long r3 = m4109S(r10)     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            java.util.List r1 = r1.mo3395c(r2, r3)     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            r13.mo3434w(r1)     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            goto L387
        L3dd:
            r13 = r4
            r2 = r7
            r5 = r11
            r7 = r1
            androidx.datastore.preferences.protobuf.f0 r1 = r7.f3126n     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            long r3 = m4109S(r10)     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            java.util.List r1 = r1.mo3395c(r2, r3)     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            r13.mo3418g(r1)     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            goto L387
        L3ef:
            r13 = r4
            r2 = r7
            r5 = r11
            r7 = r1
            androidx.datastore.preferences.protobuf.f0 r1 = r7.f3126n     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            long r3 = m4109S(r10)     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            java.util.List r1 = r1.mo3395c(r2, r3)     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            r13.mo3420i(r1)     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            goto L387
        L401:
            r13 = r4
            r2 = r7
            r5 = r11
            r7 = r1
            androidx.datastore.preferences.protobuf.f0 r1 = r7.f3126n     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            long r3 = m4109S(r10)     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            java.util.List r1 = r1.mo3395c(r2, r3)     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            r13.mo3398C(r1)     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            goto L387
        L414:
            r13 = r4
            r2 = r7
            r5 = r11
            r7 = r1
            androidx.datastore.preferences.protobuf.f0 r1 = r7.f3126n     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            long r3 = m4109S(r10)     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            java.util.List r1 = r1.mo3395c(r2, r3)     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            r13.mo3402G(r1)     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            goto L387
        L427:
            r13 = r4
            r2 = r7
            r5 = r11
            r7 = r1
            androidx.datastore.preferences.protobuf.f0 r1 = r7.f3126n     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            long r3 = m4109S(r10)     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            java.util.List r1 = r1.mo3395c(r2, r3)     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            r13.mo3415d(r1)     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            goto L387
        L43a:
            r13 = r4
            r2 = r7
            r5 = r11
            r7 = r1
            androidx.datastore.preferences.protobuf.f0 r1 = r7.f3126n     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            long r3 = m4109S(r10)     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            java.util.List r1 = r1.mo3395c(r2, r3)     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            r13.mo3429r(r1)     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            goto L387
        L44d:
            r13 = r4
            r2 = r7
            r5 = r11
            r7 = r1
            androidx.datastore.preferences.protobuf.f0 r1 = r7.f3126n     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            long r3 = m4109S(r10)     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            java.util.List r1 = r1.mo3395c(r2, r3)     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            r13.mo3433v(r1)     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            goto L387
        L460:
            r13 = r4
            r2 = r7
            r5 = r11
            r7 = r1
            androidx.datastore.preferences.protobuf.f0 r1 = r7.f3126n     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            long r3 = m4109S(r10)     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            java.util.List r1 = r1.mo3395c(r2, r3)     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            r13.mo3414c(r1)     // Catch: java.lang.Throwable -> L38e androidx.datastore.preferences.protobuf.C0823a0.a -> L390
            goto L387
        L473:
            r5 = r7
            r7 = r1
            r1 = r2
            r2 = r5
            r13 = r4
            r5 = r11
            androidx.datastore.preferences.protobuf.f0 r4 = r7.f3126n     // Catch: java.lang.Throwable -> L4a3 androidx.datastore.preferences.protobuf.C0823a0.a -> L4a9
            long r10 = m4109S(r10)     // Catch: java.lang.Throwable -> L4a3 androidx.datastore.preferences.protobuf.C0823a0.a -> L4a9
            java.util.List r4 = r4.mo3395c(r2, r10)     // Catch: java.lang.Throwable -> L4a3 androidx.datastore.preferences.protobuf.C0823a0.a -> L4a9
            r13.mo3421j(r4)     // Catch: java.lang.Throwable -> L4a3 androidx.datastore.preferences.protobuf.C0823a0.a -> L4a9
            r6 = r4
            androidx.datastore.preferences.protobuf.z$c r4 = r7.m4157r(r3)     // Catch: java.lang.Throwable -> L4a3 androidx.datastore.preferences.protobuf.C0823a0.a -> L4a9
            r3 = r2
            r2 = r1
            r1 = r3
            r3 = r6
            r6 = r18
            java.lang.Object r5 = androidx.datastore.preferences.protobuf.C0848i1.m3570A(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L499 androidx.datastore.preferences.protobuf.C0823a0.a -> L49f
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
            androidx.datastore.preferences.protobuf.f0 r1 = r7.f3126n     // Catch: java.lang.Throwable -> L4c3 androidx.datastore.preferences.protobuf.C0823a0.a -> L4c6
            long r3 = m4109S(r10)     // Catch: java.lang.Throwable -> L4c3 androidx.datastore.preferences.protobuf.C0823a0.a -> L4c6
            java.util.List r1 = r1.mo3395c(r2, r3)     // Catch: java.lang.Throwable -> L4c3 androidx.datastore.preferences.protobuf.C0823a0.a -> L4c6
            r13.mo3431t(r1)     // Catch: java.lang.Throwable -> L4c3 androidx.datastore.preferences.protobuf.C0823a0.a -> L4c6
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
            androidx.datastore.preferences.protobuf.f0 r1 = r7.f3126n     // Catch: java.lang.Throwable -> L4c3 androidx.datastore.preferences.protobuf.C0823a0.a -> L4c6
            long r3 = m4109S(r10)     // Catch: java.lang.Throwable -> L4c3 androidx.datastore.preferences.protobuf.C0823a0.a -> L4c6
            java.util.List r1 = r1.mo3395c(r2, r3)     // Catch: java.lang.Throwable -> L4c3 androidx.datastore.preferences.protobuf.C0823a0.a -> L4c6
            r13.mo3401F(r1)     // Catch: java.lang.Throwable -> L4c3 androidx.datastore.preferences.protobuf.C0823a0.a -> L4c6
            goto L4bf
        L4dc:
            r13 = r4
            r12 = r5
            r2 = r7
            r7 = r1
            androidx.datastore.preferences.protobuf.g1 r5 = r7.m4159t(r3)     // Catch: java.lang.Throwable -> L4c3 androidx.datastore.preferences.protobuf.C0823a0.a -> L4ef
            r6 = r22
            r3 = r10
            r1.m4139b0(r2, r3, r4, r5, r6)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
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
            r1.m4141d0(r2, r5, r4)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L4fd:
            r12 = r5
            r2 = r7
            r5 = r10
            androidx.datastore.preferences.protobuf.f0 r3 = r1.f3126n     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            long r13 = m4109S(r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            java.util.List r3 = r3.mo3395c(r2, r13)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            r4.mo3424m(r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L50f:
            r12 = r5
            r2 = r7
            r5 = r10
            androidx.datastore.preferences.protobuf.f0 r3 = r1.f3126n     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            long r13 = m4109S(r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            java.util.List r3 = r3.mo3395c(r2, r13)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            r4.mo3435x(r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L521:
            r12 = r5
            r2 = r7
            r5 = r10
            androidx.datastore.preferences.protobuf.f0 r3 = r1.f3126n     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            long r13 = m4109S(r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            java.util.List r3 = r3.mo3395c(r2, r13)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            r4.mo3428q(r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L533:
            r12 = r5
            r2 = r7
            r5 = r10
            androidx.datastore.preferences.protobuf.f0 r3 = r1.f3126n     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            long r13 = m4109S(r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            java.util.List r3 = r3.mo3395c(r2, r13)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            r4.mo3434w(r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L545:
            r12 = r5
            r2 = r7
            r5 = r10
            androidx.datastore.preferences.protobuf.f0 r3 = r1.f3126n     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            long r13 = m4109S(r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            java.util.List r3 = r3.mo3395c(r2, r13)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            r4.mo3418g(r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L557:
            r12 = r5
            r2 = r7
            r5 = r10
            androidx.datastore.preferences.protobuf.f0 r3 = r1.f3126n     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            long r13 = m4109S(r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            java.util.List r3 = r3.mo3395c(r2, r13)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            r4.mo3420i(r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L569:
            r12 = r5
            r2 = r7
            r5 = r10
            androidx.datastore.preferences.protobuf.f0 r3 = r1.f3126n     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            long r13 = m4109S(r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            java.util.List r3 = r3.mo3395c(r2, r13)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            r4.mo3398C(r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L57b:
            r12 = r5
            r2 = r7
            r5 = r10
            androidx.datastore.preferences.protobuf.f0 r3 = r1.f3126n     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            long r13 = m4109S(r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            java.util.List r3 = r3.mo3395c(r2, r13)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            r4.mo3402G(r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L58d:
            r12 = r5
            r2 = r7
            java.lang.Object r5 = r1.m4133M(r2, r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            androidx.datastore.preferences.protobuf.r0 r5 = (androidx.datastore.preferences.protobuf.InterfaceC0874r0) r5     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            androidx.datastore.preferences.protobuf.g1 r7 = r1.m4159t(r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            r4.mo3410O(r5, r7, r6)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            r1.m4145i0(r2, r3, r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L5a1:
            r12 = r5
            r2 = r7
            r5 = r10
            long r13 = m4109S(r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            long r8 = r4.mo3436y()     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            androidx.datastore.preferences.protobuf.C0872q1.m3973N(r2, r13, r8)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            r1.m4142f0(r2, r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L5b4:
            r12 = r5
            r2 = r7
            r5 = r10
            long r8 = m4109S(r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            int r5 = r4.mo3423l()     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            androidx.datastore.preferences.protobuf.C0872q1.m3972M(r2, r8, r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            r1.m4142f0(r2, r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L5c7:
            r12 = r5
            r2 = r7
            r5 = r10
            long r8 = m4109S(r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            long r13 = r4.mo3417f()     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            androidx.datastore.preferences.protobuf.C0872q1.m3973N(r2, r8, r13)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            r1.m4142f0(r2, r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L5da:
            r12 = r5
            r2 = r7
            r5 = r10
            long r8 = m4109S(r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            int r5 = r4.mo3400E()     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            androidx.datastore.preferences.protobuf.C0872q1.m3972M(r2, r8, r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            r1.m4142f0(r2, r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L5ed:
            r8 = r2
            r12 = r5
            r2 = r7
            r5 = r10
            int r9 = r4.mo3422k()     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            androidx.datastore.preferences.protobuf.z$c r13 = r1.m4157r(r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            if (r13 == 0) goto L608
            boolean r13 = r13.m4245a(r9)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            if (r13 == 0) goto L602
            goto L608
        L602:
            java.lang.Object r5 = androidx.datastore.preferences.protobuf.C0848i1.m3579J(r2, r8, r9, r11, r12)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L741
        L608:
            long r13 = m4109S(r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            androidx.datastore.preferences.protobuf.C0872q1.m3972M(r2, r13, r9)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            r1.m4142f0(r2, r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L614:
            r12 = r5
            r2 = r7
            r5 = r10
            long r8 = m4109S(r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            int r5 = r4.mo3419h()     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            androidx.datastore.preferences.protobuf.C0872q1.m3972M(r2, r8, r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            r1.m4142f0(r2, r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L627:
            r12 = r5
            r2 = r7
            r5 = r10
            long r8 = m4109S(r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            androidx.datastore.preferences.protobuf.g r5 = r4.mo3426o()     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            androidx.datastore.preferences.protobuf.C0872q1.m3974O(r2, r8, r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            r1.m4142f0(r2, r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L63a:
            r12 = r5
            r2 = r7
            java.lang.Object r5 = r1.m4133M(r2, r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            androidx.datastore.preferences.protobuf.r0 r5 = (androidx.datastore.preferences.protobuf.InterfaceC0874r0) r5     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            androidx.datastore.preferences.protobuf.g1 r8 = r1.m4159t(r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            r4.mo3405J(r5, r8, r6)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            r1.m4145i0(r2, r3, r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L64e:
            r12 = r5
            r2 = r7
            r5 = r10
            r1.m4140c0(r2, r5, r4)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            r1.m4142f0(r2, r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L659:
            r12 = r5
            r2 = r7
            r5 = r10
            long r8 = m4109S(r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            boolean r5 = r4.mo3416e()     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            androidx.datastore.preferences.protobuf.C0872q1.m3964E(r2, r8, r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            r1.m4142f0(r2, r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L66c:
            r12 = r5
            r2 = r7
            r5 = r10
            long r8 = m4109S(r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            int r5 = r4.mo3432u()     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            androidx.datastore.preferences.protobuf.C0872q1.m3972M(r2, r8, r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            r1.m4142f0(r2, r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L67f:
            r12 = r5
            r2 = r7
            r5 = r10
            long r8 = m4109S(r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            long r13 = r4.mo3413b()     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            androidx.datastore.preferences.protobuf.C0872q1.m3973N(r2, r8, r13)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            r1.m4142f0(r2, r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L692:
            r12 = r5
            r2 = r7
            r5 = r10
            long r8 = m4109S(r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            int r5 = r4.mo3427p()     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            androidx.datastore.preferences.protobuf.C0872q1.m3972M(r2, r8, r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            r1.m4142f0(r2, r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L6a5:
            r12 = r5
            r2 = r7
            r5 = r10
            long r8 = m4109S(r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            long r13 = r4.mo3430s()     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            androidx.datastore.preferences.protobuf.C0872q1.m3973N(r2, r8, r13)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            r1.m4142f0(r2, r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L6b8:
            r12 = r5
            r2 = r7
            r5 = r10
            long r8 = m4109S(r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            long r13 = r4.mo3403H()     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            androidx.datastore.preferences.protobuf.C0872q1.m3973N(r2, r8, r13)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            r1.m4142f0(r2, r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L6cb:
            r12 = r5
            r2 = r7
            r5 = r10
            long r8 = m4109S(r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            float r5 = r4.readFloat()     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            androidx.datastore.preferences.protobuf.C0872q1.m3971L(r2, r8, r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            r1.m4142f0(r2, r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L6de:
            r12 = r5
            r2 = r7
            r5 = r10
            long r8 = m4109S(r5)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            double r13 = r4.readDouble()     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            androidx.datastore.preferences.protobuf.C0872q1.m3970K(r2, r8, r13)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            r1.m4142f0(r2, r3)     // Catch: androidx.datastore.preferences.protobuf.C0823a0.a -> Lf3 java.lang.Throwable -> L4ec
            goto L11c
        L6f1:
            boolean r3 = r12.mo3907q(r4)     // Catch: java.lang.Throwable -> L718
            if (r3 == 0) goto L71a
            boolean r3 = r4.mo3399D()     // Catch: java.lang.Throwable -> L718
            if (r3 != 0) goto L741
            int r0 = r1.f3123k
            r4 = r5
        L700:
            int r3 = r1.f3124l
            if (r0 >= r3) goto L712
            int[] r3 = r1.f3122j
            r3 = r3[r0]
            r6 = r20
            r5 = r12
            java.lang.Object r4 = r1.m4152o(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L700
        L712:
            if (r4 == 0) goto L740
        L714:
            r12.mo3905o(r2, r4)
            goto L740
        L718:
            r0 = move-exception
            goto L74a
        L71a:
            if (r5 != 0) goto L721
            java.lang.Object r3 = r12.mo3896f(r2)     // Catch: java.lang.Throwable -> L718
            r5 = r3
        L721:
            r7 = 0
            boolean r3 = r12.m3903m(r5, r4, r7)     // Catch: java.lang.Throwable -> L718
            if (r3 != 0) goto L741
            int r0 = r1.f3123k
            r4 = r5
        L72b:
            int r3 = r1.f3124l
            if (r0 >= r3) goto L73d
            int[] r3 = r1.f3122j
            r3 = r3[r0]
            r6 = r20
            r5 = r12
            java.lang.Object r4 = r1.m4152o(r2, r3, r4, r5, r6)
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
            int r3 = r1.f3123k
            r7 = r3
            r4 = r5
        L74e:
            int r3 = r1.f3124l
            if (r7 >= r3) goto L762
            int[] r3 = r1.f3122j
            r3 = r3[r7]
            r6 = r20
            r5 = r12
            java.lang.Object r4 = r1.m4152o(r2, r3, r4, r5, r6)
            int r7 = r7 + 1
            r1 = r17
            goto L74e
        L762:
            r5 = r12
            if (r4 == 0) goto L768
            r5.mo3905o(r2, r4)
        L768:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0883u0.m4128H(androidx.datastore.preferences.protobuf.n1, androidx.datastore.preferences.protobuf.p, java.lang.Object, androidx.datastore.preferences.protobuf.f1, androidx.datastore.preferences.protobuf.o):void");
    }

    /* JADX INFO: renamed from: I */
    public final <K, V> void m4129I(Object obj, int i10, Object obj2, C0864o c0864o, InterfaceC0839f1 interfaceC0839f1) {
        long jM4109S = m4109S(m4148l0(i10));
        Object objM4002z = C0872q1.m4002z(obj, jM4109S);
        if (objM4002z == null) {
            objM4002z = this.f3129q.mo3880d(obj2);
            C0872q1.m3974O(obj, jM4109S, objM4002z);
        } else if (this.f3129q.mo3884h(objM4002z)) {
            Object objMo3880d = this.f3129q.mo3880d(obj2);
            this.f3129q.mo3877a(objMo3880d, objM4002z);
            C0872q1.m3974O(obj, jM4109S, objMo3880d);
            objM4002z = objMo3880d;
        }
        interfaceC0839f1.mo3409N(this.f3129q.mo3879c(objM4002z), this.f3129q.mo3878b(obj2), c0864o);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: androidx.datastore.preferences.protobuf.g1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J */
    public final void m4130J(T t8, T t10, int i10) {
        if (m4161x(t10, i10)) {
            long jM4109S = m4109S(m4148l0(i10));
            Unsafe unsafe = f3112s;
            Object object = unsafe.getObject(t10, jM4109S);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + m4135R(i10) + " is present but null: " + t10);
            }
            InterfaceC0842g1 interfaceC0842g1M4159t = m4159t(i10);
            if (!m4161x(t8, i10)) {
                if (m4103C(object)) {
                    Object objMo3472e = interfaceC0842g1M4159t.mo3472e();
                    interfaceC0842g1M4159t.mo3468a(objMo3472e, object);
                    unsafe.putObject(t8, jM4109S, objMo3472e);
                } else {
                    unsafe.putObject(t8, jM4109S, object);
                }
                m4142f0(t8, i10);
                return;
            }
            Object object2 = unsafe.getObject(t8, jM4109S);
            if (!m4103C(object2)) {
                Object objMo3472e2 = interfaceC0842g1M4159t.mo3472e();
                interfaceC0842g1M4159t.mo3468a(objMo3472e2, object2);
                unsafe.putObject(t8, jM4109S, objMo3472e2);
                object2 = objMo3472e2;
            }
            interfaceC0842g1M4159t.mo3468a(object2, object);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v2, resolved type: androidx.datastore.preferences.protobuf.g1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K */
    public final void m4131K(T t8, T t10, int i10) {
        int iM4135R = m4135R(i10);
        if (m4127E(t10, iM4135R, i10)) {
            long jM4109S = m4109S(m4148l0(i10));
            Unsafe unsafe = f3112s;
            Object object = unsafe.getObject(t10, jM4109S);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + m4135R(i10) + " is present but null: " + t10);
            }
            InterfaceC0842g1 interfaceC0842g1M4159t = m4159t(i10);
            if (!m4127E(t8, iM4135R, i10)) {
                if (m4103C(object)) {
                    Object objMo3472e = interfaceC0842g1M4159t.mo3472e();
                    interfaceC0842g1M4159t.mo3468a(objMo3472e, object);
                    unsafe.putObject(t8, jM4109S, objMo3472e);
                } else {
                    unsafe.putObject(t8, jM4109S, object);
                }
                m4143g0(t8, iM4135R, i10);
                return;
            }
            Object object2 = unsafe.getObject(t8, jM4109S);
            if (!m4103C(object2)) {
                Object objMo3472e2 = interfaceC0842g1M4159t.mo3472e();
                interfaceC0842g1M4159t.mo3468a(objMo3472e2, object2);
                unsafe.putObject(t8, jM4109S, objMo3472e2);
                object2 = objMo3472e2;
            }
            interfaceC0842g1M4159t.mo3468a(object2, object);
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m4132L(T t8, T t10, int i10) {
        int iM4148l0 = m4148l0(i10);
        long jM4109S = m4109S(iM4148l0);
        int iM4135R = m4135R(i10);
        switch (m4117k0(iM4148l0)) {
            case 0:
                if (m4161x(t10, i10)) {
                    C0872q1.m3970K(t8, jM4109S, C0872q1.m3997u(t10, jM4109S));
                    m4142f0(t8, i10);
                }
                break;
            case 1:
                if (m4161x(t10, i10)) {
                    C0872q1.m3971L(t8, jM4109S, C0872q1.m3998v(t10, jM4109S));
                    m4142f0(t8, i10);
                }
                break;
            case 2:
                if (m4161x(t10, i10)) {
                    C0872q1.m3973N(t8, jM4109S, C0872q1.m4000x(t10, jM4109S));
                    m4142f0(t8, i10);
                }
                break;
            case 3:
                if (m4161x(t10, i10)) {
                    C0872q1.m3973N(t8, jM4109S, C0872q1.m4000x(t10, jM4109S));
                    m4142f0(t8, i10);
                }
                break;
            case 4:
                if (m4161x(t10, i10)) {
                    C0872q1.m3972M(t8, jM4109S, C0872q1.m3999w(t10, jM4109S));
                    m4142f0(t8, i10);
                }
                break;
            case 5:
                if (m4161x(t10, i10)) {
                    C0872q1.m3973N(t8, jM4109S, C0872q1.m4000x(t10, jM4109S));
                    m4142f0(t8, i10);
                }
                break;
            case 6:
                if (m4161x(t10, i10)) {
                    C0872q1.m3972M(t8, jM4109S, C0872q1.m3999w(t10, jM4109S));
                    m4142f0(t8, i10);
                }
                break;
            case 7:
                if (m4161x(t10, i10)) {
                    C0872q1.m3964E(t8, jM4109S, C0872q1.m3992p(t10, jM4109S));
                    m4142f0(t8, i10);
                }
                break;
            case 8:
                if (m4161x(t10, i10)) {
                    C0872q1.m3974O(t8, jM4109S, C0872q1.m4002z(t10, jM4109S));
                    m4142f0(t8, i10);
                }
                break;
            case 9:
                m4130J(t8, t10, i10);
                break;
            case 10:
                if (m4161x(t10, i10)) {
                    C0872q1.m3974O(t8, jM4109S, C0872q1.m4002z(t10, jM4109S));
                    m4142f0(t8, i10);
                }
                break;
            case 11:
                if (m4161x(t10, i10)) {
                    C0872q1.m3972M(t8, jM4109S, C0872q1.m3999w(t10, jM4109S));
                    m4142f0(t8, i10);
                }
                break;
            case 12:
                if (m4161x(t10, i10)) {
                    C0872q1.m3972M(t8, jM4109S, C0872q1.m3999w(t10, jM4109S));
                    m4142f0(t8, i10);
                }
                break;
            case 13:
                if (m4161x(t10, i10)) {
                    C0872q1.m3972M(t8, jM4109S, C0872q1.m3999w(t10, jM4109S));
                    m4142f0(t8, i10);
                }
                break;
            case 14:
                if (m4161x(t10, i10)) {
                    C0872q1.m3973N(t8, jM4109S, C0872q1.m4000x(t10, jM4109S));
                    m4142f0(t8, i10);
                }
                break;
            case 15:
                if (m4161x(t10, i10)) {
                    C0872q1.m3972M(t8, jM4109S, C0872q1.m3999w(t10, jM4109S));
                    m4142f0(t8, i10);
                }
                break;
            case 16:
                if (m4161x(t10, i10)) {
                    C0872q1.m3973N(t8, jM4109S, C0872q1.m4000x(t10, jM4109S));
                    m4142f0(t8, i10);
                }
                break;
            case 17:
                m4130J(t8, t10, i10);
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
                this.f3126n.mo3394b(t8, t10, jM4109S);
                break;
            case 50:
                C0848i1.m3575F(this.f3129q, t8, t10, jM4109S);
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
                if (m4127E(t10, iM4135R, i10)) {
                    C0872q1.m3974O(t8, jM4109S, C0872q1.m4002z(t10, jM4109S));
                    m4143g0(t8, iM4135R, i10);
                }
                break;
            case 60:
                m4131K(t8, t10, i10);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (m4127E(t10, iM4135R, i10)) {
                    C0872q1.m3974O(t8, jM4109S, C0872q1.m4002z(t10, jM4109S));
                    m4143g0(t8, iM4135R, i10);
                }
                break;
            case 68:
                m4131K(t8, t10, i10);
                break;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: androidx.datastore.preferences.protobuf.g1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M */
    public final Object m4133M(T t8, int i10) {
        InterfaceC0842g1 interfaceC0842g1M4159t = m4159t(i10);
        long jM4109S = m4109S(m4148l0(i10));
        if (!m4161x(t8, i10)) {
            return interfaceC0842g1M4159t.mo3472e();
        }
        Object object = f3112s.getObject(t8, jM4109S);
        if (m4103C(object)) {
            return object;
        }
        Object objMo3472e = interfaceC0842g1M4159t.mo3472e();
        if (object != null) {
            interfaceC0842g1M4159t.mo3468a(objMo3472e, object);
        }
        return objMo3472e;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: androidx.datastore.preferences.protobuf.g1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N */
    public final Object m4134N(T t8, int i10, int i11) {
        InterfaceC0842g1 interfaceC0842g1M4159t = m4159t(i11);
        if (!m4127E(t8, i10, i11)) {
            return interfaceC0842g1M4159t.mo3472e();
        }
        Object object = f3112s.getObject(t8, m4109S(m4148l0(i11)));
        if (m4103C(object)) {
            return object;
        }
        Object objMo3472e = interfaceC0842g1M4159t.mo3472e();
        if (object != null) {
            interfaceC0842g1M4159t.mo3468a(objMo3472e, object);
        }
        return objMo3472e;
    }

    /* JADX INFO: renamed from: R */
    public final int m4135R(int i10) {
        return this.f3113a[i10];
    }

    /* JADX INFO: renamed from: Y */
    public final int m4136Y(int i10) {
        if (i10 < this.f3115c || i10 > this.f3116d) {
            return -1;
        }
        return m4144h0(i10, 0);
    }

    /* JADX INFO: renamed from: Z */
    public final int m4137Z(int i10) {
        return this.f3113a[i10 + 2];
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0842g1
    /* JADX INFO: renamed from: a */
    public void mo3468a(T t8, T t10) {
        m4118l(t8);
        t10.getClass();
        for (int i10 = 0; i10 < this.f3113a.length; i10 += 3) {
            m4132L(t8, t10, i10);
        }
        C0848i1.m3576G(this.f3127o, t8, t10);
        if (this.f3118f) {
            C0848i1.m3574E(this.f3128p, t8, t10);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final <E> void m4138a0(Object obj, long j10, InterfaceC0839f1 interfaceC0839f1, InterfaceC0842g1<E> interfaceC0842g1, C0864o c0864o) {
        interfaceC0839f1.mo3411P(this.f3126n.mo3395c(obj, j10), interfaceC0842g1, c0864o);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: androidx.datastore.preferences.protobuf.g1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: androidx.datastore.preferences.protobuf.g1 */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: T */
    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x007d A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0842g1
    /* JADX INFO: renamed from: b */
    public void mo3469b(T t8) {
        if (m4103C(t8)) {
            if (t8 instanceof AbstractC0888x) {
                AbstractC0888x abstractC0888x = (AbstractC0888x) t8;
                abstractC0888x.m4195t();
                abstractC0888x.m4194s();
                abstractC0888x.m4188K();
            }
            int length = this.f3113a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int iM4148l0 = m4148l0(i10);
                long jM4109S = m4109S(iM4148l0);
                int iM4117k0 = m4117k0(iM4148l0);
                if (iM4117k0 != 9) {
                    if (iM4117k0 != 60 && iM4117k0 != 68) {
                        switch (iM4117k0) {
                            case 17:
                                if (m4161x(t8, i10)) {
                                    m4159t(i10).mo3469b(f3112s.getObject(t8, jM4109S));
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
                                this.f3126n.mo3393a(t8, jM4109S);
                                break;
                            case 50:
                                Unsafe unsafe = f3112s;
                                Object object = unsafe.getObject(t8, jM4109S);
                                if (object != null) {
                                    unsafe.putObject(t8, jM4109S, this.f3129q.mo3882f(object));
                                }
                                break;
                        }
                    } else if (m4127E(t8, m4135R(i10), i10)) {
                        m4159t(i10).mo3469b(f3112s.getObject(t8, jM4109S));
                    }
                } else if (m4161x(t8, i10)) {
                    m4159t(i10).mo3469b(f3112s.getObject(t8, jM4109S));
                }
            }
            this.f3127o.mo3900j(t8);
            if (this.f3118f) {
                this.f3128p.mo3939f(t8);
            }
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final <E> void m4139b0(Object obj, int i10, InterfaceC0839f1 interfaceC0839f1, InterfaceC0842g1<E> interfaceC0842g1, C0864o c0864o) {
        interfaceC0839f1.mo3406K(this.f3126n.mo3395c(obj, m4109S(i10)), interfaceC0842g1, c0864o);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0094 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0842g1
    /* JADX INFO: renamed from: c */
    public final boolean mo3470c(T t8) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.f3123k) {
            int i15 = this.f3122j[i13];
            int iM4135R = m4135R(i15);
            int iM4148l0 = m4148l0(i15);
            int i16 = this.f3113a[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i12) {
                if (i17 != 1048575) {
                    i14 = f3112s.getInt(t8, i17);
                }
                i11 = i14;
                i10 = i17;
            } else {
                i10 = i12;
                i11 = i14;
            }
            T t10 = t8;
            if (m4104F(iM4148l0) && !m4162y(t10, i15, i10, i11, i18)) {
                return false;
            }
            int iM4117k0 = m4117k0(iM4148l0);
            if (iM4117k0 == 9 || iM4117k0 == 17) {
                if (m4162y(t10, i15, i10, i11, i18) && !m4123z(t10, iM4148l0, m4159t(i15))) {
                    return false;
                }
            } else if (iM4117k0 == 27) {
                if (!m4124A(t10, iM4148l0, i15)) {
                    return false;
                }
            } else if (iM4117k0 == 60 || iM4117k0 == 68) {
                if (m4127E(t10, iM4135R, i15) && !m4123z(t10, iM4148l0, m4159t(i15))) {
                    return false;
                }
            } else if (iM4117k0 != 49) {
                if (iM4117k0 == 50 && !m4125B(t10, iM4148l0, i15)) {
                    return false;
                }
            } else if (!m4124A(t10, iM4148l0, i15)) {
                return false;
            }
            i13++;
            t8 = t10;
            i12 = i10;
            i14 = i11;
        }
        return !this.f3118f || this.f3128p.mo3936c(t8).m4084p();
    }

    /* JADX INFO: renamed from: c0 */
    public final void m4140c0(Object obj, int i10, InterfaceC0839f1 interfaceC0839f1) {
        if (m4122w(i10)) {
            C0872q1.m3974O(obj, m4109S(i10), interfaceC0839f1.mo3404I());
        } else if (this.f3119g) {
            C0872q1.m3974O(obj, m4109S(i10), interfaceC0839f1.mo3437z());
        } else {
            C0872q1.m3974O(obj, m4109S(i10), interfaceC0839f1.mo3426o());
        }
    }

    /* JADX DEBUG: Type inference failed for r2v2. Raw type applied. Possible types: androidx.datastore.preferences.protobuf.n1<?, ?>, androidx.datastore.preferences.protobuf.n1<UT, UB> */
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
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0842g1
    /* JADX INFO: renamed from: d */
    public int mo3471d(T t8) {
        int i10;
        int iM3662i;
        int iM3670q;
        int iM3677x;
        int iM3608i;
        int iM3646U;
        int iM3648W;
        C0883u0<T> c0883u0 = this;
        T t10 = t8;
        Unsafe unsafe = f3112s;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (i12 < c0883u0.f3113a.length) {
            int iM4148l0 = c0883u0.m4148l0(i12);
            int iM4117k0 = m4117k0(iM4148l0);
            int iM4135R = c0883u0.m4135R(i12);
            int i16 = c0883u0.f3113a[i12 + 2];
            int i17 = i16 & i11;
            if (iM4117k0 <= 17) {
                if (i17 != i15) {
                    i13 = i17 == i11 ? 0 : unsafe.getInt(t10, i17);
                    i15 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            } else {
                i10 = 0;
            }
            int i18 = i14;
            long jM4109S = m4109S(iM4148l0);
            if (iM4117k0 < EnumC0882u.f3058O.m4102a() || iM4117k0 > EnumC0882u.f3071b0.m4102a()) {
                i17 = 0;
            }
            switch (iM4117k0) {
                case 0:
                    if (!c0883u0.m4162y(t10, i12, i15, i13, i10)) {
                        i14 = i18;
                    } else {
                        iM3662i = AbstractC0849j.m3662i(iM4135R, 0.0d);
                        i14 = i18 + iM3662i;
                    }
                    break;
                case 1:
                    if (c0883u0.m4162y(t10, i12, i15, i13, i10)) {
                        iM3670q = AbstractC0849j.m3670q(iM4135R, 0.0f);
                        i14 = i18 + iM3670q;
                        c0883u0 = this;
                        t10 = t8;
                    }
                    c0883u0 = this;
                    t10 = t8;
                    i14 = i18;
                    break;
                case 2:
                    if (c0883u0.m4162y(t10, i12, i15, i13, i10)) {
                        iM3677x = AbstractC0849j.m3677x(iM4135R, unsafe.getLong(t10, jM4109S));
                        i14 = i18 + iM3677x;
                        c0883u0 = this;
                    }
                    c0883u0 = this;
                    i14 = i18;
                    break;
                case 3:
                    if (c0883u0.m4162y(t10, i12, i15, i13, i10)) {
                        iM3677x = AbstractC0849j.m3649X(iM4135R, unsafe.getLong(t10, jM4109S));
                        i14 = i18 + iM3677x;
                        c0883u0 = this;
                    }
                    c0883u0 = this;
                    i14 = i18;
                    break;
                case 4:
                    if (c0883u0.m4162y(t10, i12, i15, i13, i10)) {
                        iM3677x = AbstractC0849j.m3675v(iM4135R, unsafe.getInt(t10, jM4109S));
                        i14 = i18 + iM3677x;
                        c0883u0 = this;
                    }
                    c0883u0 = this;
                    i14 = i18;
                    break;
                case 5:
                    if (c0883u0.m4162y(t10, i12, i15, i13, i10)) {
                        iM3670q = AbstractC0849j.m3668o(iM4135R, 0L);
                        i14 = i18 + iM3670q;
                        c0883u0 = this;
                        t10 = t8;
                    }
                    c0883u0 = this;
                    t10 = t8;
                    i14 = i18;
                    break;
                case 6:
                    if (c0883u0.m4162y(t10, i12, i15, i13, i10)) {
                        iM3670q = AbstractC0849j.m3666m(iM4135R, 0);
                        i14 = i18 + iM3670q;
                        c0883u0 = this;
                        t10 = t8;
                    }
                    c0883u0 = this;
                    t10 = t8;
                    i14 = i18;
                    break;
                case 7:
                    if (c0883u0.m4162y(t10, i12, i15, i13, i10)) {
                        iM3670q = AbstractC0849j.m3654d(iM4135R, true);
                        i14 = i18 + iM3670q;
                        c0883u0 = this;
                        t10 = t8;
                    }
                    c0883u0 = this;
                    t10 = t8;
                    i14 = i18;
                    break;
                case 8:
                    if (c0883u0.m4162y(t10, i12, i15, i13, i10)) {
                        Object object = unsafe.getObject(t10, jM4109S);
                        iM3677x = object instanceof AbstractC0840g ? AbstractC0849j.m3659g(iM4135R, (AbstractC0840g) object) : AbstractC0849j.m3644S(iM4135R, (String) object);
                        i14 = i18 + iM3677x;
                        c0883u0 = this;
                    }
                    c0883u0 = this;
                    i14 = i18;
                    break;
                case 9:
                    if (!c0883u0.m4162y(t10, i12, i15, i13, i10)) {
                        i14 = i18;
                    } else {
                        iM3662i = C0848i1.m3614o(iM4135R, unsafe.getObject(t10, jM4109S), c0883u0.m4159t(i12));
                        i14 = i18 + iM3662i;
                    }
                    break;
                case 10:
                    if (c0883u0.m4162y(t10, i12, i15, i13, i10)) {
                        iM3677x = AbstractC0849j.m3659g(iM4135R, (AbstractC0840g) unsafe.getObject(t10, jM4109S));
                        i14 = i18 + iM3677x;
                        c0883u0 = this;
                    }
                    c0883u0 = this;
                    i14 = i18;
                    break;
                case 11:
                    if (c0883u0.m4162y(t10, i12, i15, i13, i10)) {
                        iM3677x = AbstractC0849j.m3647V(iM4135R, unsafe.getInt(t10, jM4109S));
                        i14 = i18 + iM3677x;
                        c0883u0 = this;
                    }
                    c0883u0 = this;
                    i14 = i18;
                    break;
                case 12:
                    if (c0883u0.m4162y(t10, i12, i15, i13, i10)) {
                        iM3677x = AbstractC0849j.m3664k(iM4135R, unsafe.getInt(t10, jM4109S));
                        i14 = i18 + iM3677x;
                        c0883u0 = this;
                    }
                    c0883u0 = this;
                    i14 = i18;
                    break;
                case 13:
                    if (c0883u0.m4162y(t10, i12, i15, i13, i10)) {
                        iM3670q = AbstractC0849j.m3636K(iM4135R, 0);
                        i14 = i18 + iM3670q;
                        c0883u0 = this;
                        t10 = t8;
                    }
                    c0883u0 = this;
                    t10 = t8;
                    i14 = i18;
                    break;
                case 14:
                    if (c0883u0.m4162y(t10, i12, i15, i13, i10)) {
                        iM3670q = AbstractC0849j.m3638M(iM4135R, 0L);
                        i14 = i18 + iM3670q;
                        c0883u0 = this;
                        t10 = t8;
                    }
                    c0883u0 = this;
                    t10 = t8;
                    i14 = i18;
                    break;
                case 15:
                    if (c0883u0.m4162y(t10, i12, i15, i13, i10)) {
                        iM3677x = AbstractC0849j.m3640O(iM4135R, unsafe.getInt(t10, jM4109S));
                        i14 = i18 + iM3677x;
                        c0883u0 = this;
                    }
                    c0883u0 = this;
                    i14 = i18;
                    break;
                case 16:
                    if (c0883u0.m4162y(t10, i12, i15, i13, i10)) {
                        iM3677x = AbstractC0849j.m3642Q(iM4135R, unsafe.getLong(t10, jM4109S));
                        i14 = i18 + iM3677x;
                        c0883u0 = this;
                    }
                    c0883u0 = this;
                    i14 = i18;
                    break;
                case 17:
                    if (!c0883u0.m4162y(t10, i12, i15, i13, i10)) {
                        i14 = i18;
                    } else {
                        iM3662i = AbstractC0849j.m3672s(iM4135R, (InterfaceC0874r0) unsafe.getObject(t10, jM4109S), c0883u0.m4159t(i12));
                        i14 = i18 + iM3662i;
                    }
                    break;
                case 18:
                    iM3662i = C0848i1.m3607h(iM4135R, (List) unsafe.getObject(t10, jM4109S), false);
                    i14 = i18 + iM3662i;
                    break;
                case 19:
                    iM3662i = C0848i1.m3605f(iM4135R, (List) unsafe.getObject(t10, jM4109S), false);
                    i14 = i18 + iM3662i;
                    break;
                case 20:
                    iM3662i = C0848i1.m3612m(iM4135R, (List) unsafe.getObject(t10, jM4109S), false);
                    i14 = i18 + iM3662i;
                    break;
                case 21:
                    iM3662i = C0848i1.m3623x(iM4135R, (List) unsafe.getObject(t10, jM4109S), false);
                    i14 = i18 + iM3662i;
                    break;
                case 22:
                    iM3662i = C0848i1.m3610k(iM4135R, (List) unsafe.getObject(t10, jM4109S), false);
                    i14 = i18 + iM3662i;
                    break;
                case 23:
                    iM3662i = C0848i1.m3607h(iM4135R, (List) unsafe.getObject(t10, jM4109S), false);
                    i14 = i18 + iM3662i;
                    break;
                case 24:
                    iM3662i = C0848i1.m3605f(iM4135R, (List) unsafe.getObject(t10, jM4109S), false);
                    i14 = i18 + iM3662i;
                    break;
                case 25:
                    iM3662i = C0848i1.m3596a(iM4135R, (List) unsafe.getObject(t10, jM4109S), false);
                    i14 = i18 + iM3662i;
                    break;
                case 26:
                    iM3662i = C0848i1.m3620u(iM4135R, (List) unsafe.getObject(t10, jM4109S));
                    i14 = i18 + iM3662i;
                    break;
                case 27:
                    iM3662i = C0848i1.m3615p(iM4135R, (List) unsafe.getObject(t10, jM4109S), c0883u0.m4159t(i12));
                    i14 = i18 + iM3662i;
                    break;
                case 28:
                    iM3662i = C0848i1.m3600c(iM4135R, (List) unsafe.getObject(t10, jM4109S));
                    i14 = i18 + iM3662i;
                    break;
                case 29:
                    iM3662i = C0848i1.m3621v(iM4135R, (List) unsafe.getObject(t10, jM4109S), false);
                    i14 = i18 + iM3662i;
                    break;
                case 30:
                    iM3662i = C0848i1.m3602d(iM4135R, (List) unsafe.getObject(t10, jM4109S), false);
                    i14 = i18 + iM3662i;
                    break;
                case 31:
                    iM3662i = C0848i1.m3605f(iM4135R, (List) unsafe.getObject(t10, jM4109S), false);
                    i14 = i18 + iM3662i;
                    break;
                case 32:
                    iM3662i = C0848i1.m3607h(iM4135R, (List) unsafe.getObject(t10, jM4109S), false);
                    i14 = i18 + iM3662i;
                    break;
                case 33:
                    iM3662i = C0848i1.m3616q(iM4135R, (List) unsafe.getObject(t10, jM4109S), false);
                    i14 = i18 + iM3662i;
                    break;
                case 34:
                    iM3662i = C0848i1.m3618s(iM4135R, (List) unsafe.getObject(t10, jM4109S), false);
                    i14 = i18 + iM3662i;
                    break;
                case 35:
                    iM3608i = C0848i1.m3608i((List) unsafe.getObject(t10, jM4109S));
                    if (iM3608i <= 0) {
                        i14 = i18;
                    } else {
                        if (c0883u0.f3121i) {
                            unsafe.putInt(t10, i17, iM3608i);
                        }
                        iM3646U = AbstractC0849j.m3646U(iM4135R);
                        iM3648W = AbstractC0849j.m3648W(iM3608i);
                        i14 = i18 + iM3646U + iM3648W + iM3608i;
                    }
                    break;
                case 36:
                    iM3608i = C0848i1.m3606g((List) unsafe.getObject(t10, jM4109S));
                    if (iM3608i <= 0) {
                        i14 = i18;
                    } else {
                        if (c0883u0.f3121i) {
                            unsafe.putInt(t10, i17, iM3608i);
                        }
                        iM3646U = AbstractC0849j.m3646U(iM4135R);
                        iM3648W = AbstractC0849j.m3648W(iM3608i);
                        i14 = i18 + iM3646U + iM3648W + iM3608i;
                    }
                    break;
                case 37:
                    iM3608i = C0848i1.m3613n((List) unsafe.getObject(t10, jM4109S));
                    if (iM3608i <= 0) {
                        i14 = i18;
                    } else {
                        if (c0883u0.f3121i) {
                            unsafe.putInt(t10, i17, iM3608i);
                        }
                        iM3646U = AbstractC0849j.m3646U(iM4135R);
                        iM3648W = AbstractC0849j.m3648W(iM3608i);
                        i14 = i18 + iM3646U + iM3648W + iM3608i;
                    }
                    break;
                case 38:
                    iM3608i = C0848i1.m3624y((List) unsafe.getObject(t10, jM4109S));
                    if (iM3608i <= 0) {
                        i14 = i18;
                    } else {
                        if (c0883u0.f3121i) {
                            unsafe.putInt(t10, i17, iM3608i);
                        }
                        iM3646U = AbstractC0849j.m3646U(iM4135R);
                        iM3648W = AbstractC0849j.m3648W(iM3608i);
                        i14 = i18 + iM3646U + iM3648W + iM3608i;
                    }
                    break;
                case 39:
                    iM3608i = C0848i1.m3611l((List) unsafe.getObject(t10, jM4109S));
                    if (iM3608i <= 0) {
                        i14 = i18;
                    } else {
                        if (c0883u0.f3121i) {
                            unsafe.putInt(t10, i17, iM3608i);
                        }
                        iM3646U = AbstractC0849j.m3646U(iM4135R);
                        iM3648W = AbstractC0849j.m3648W(iM3608i);
                        i14 = i18 + iM3646U + iM3648W + iM3608i;
                    }
                    break;
                case 40:
                    iM3608i = C0848i1.m3608i((List) unsafe.getObject(t10, jM4109S));
                    if (iM3608i <= 0) {
                        i14 = i18;
                    } else {
                        if (c0883u0.f3121i) {
                            unsafe.putInt(t10, i17, iM3608i);
                        }
                        iM3646U = AbstractC0849j.m3646U(iM4135R);
                        iM3648W = AbstractC0849j.m3648W(iM3608i);
                        i14 = i18 + iM3646U + iM3648W + iM3608i;
                    }
                    break;
                case 41:
                    iM3608i = C0848i1.m3606g((List) unsafe.getObject(t10, jM4109S));
                    if (iM3608i <= 0) {
                        i14 = i18;
                    } else {
                        if (c0883u0.f3121i) {
                            unsafe.putInt(t10, i17, iM3608i);
                        }
                        iM3646U = AbstractC0849j.m3646U(iM4135R);
                        iM3648W = AbstractC0849j.m3648W(iM3608i);
                        i14 = i18 + iM3646U + iM3648W + iM3608i;
                    }
                    break;
                case 42:
                    iM3608i = C0848i1.m3598b((List) unsafe.getObject(t10, jM4109S));
                    if (iM3608i <= 0) {
                        i14 = i18;
                    } else {
                        if (c0883u0.f3121i) {
                            unsafe.putInt(t10, i17, iM3608i);
                        }
                        iM3646U = AbstractC0849j.m3646U(iM4135R);
                        iM3648W = AbstractC0849j.m3648W(iM3608i);
                        i14 = i18 + iM3646U + iM3648W + iM3608i;
                    }
                    break;
                case 43:
                    iM3608i = C0848i1.m3622w((List) unsafe.getObject(t10, jM4109S));
                    if (iM3608i <= 0) {
                        i14 = i18;
                    } else {
                        if (c0883u0.f3121i) {
                            unsafe.putInt(t10, i17, iM3608i);
                        }
                        iM3646U = AbstractC0849j.m3646U(iM4135R);
                        iM3648W = AbstractC0849j.m3648W(iM3608i);
                        i14 = i18 + iM3646U + iM3648W + iM3608i;
                    }
                    break;
                case 44:
                    iM3608i = C0848i1.m3604e((List) unsafe.getObject(t10, jM4109S));
                    if (iM3608i <= 0) {
                        i14 = i18;
                    } else {
                        if (c0883u0.f3121i) {
                            unsafe.putInt(t10, i17, iM3608i);
                        }
                        iM3646U = AbstractC0849j.m3646U(iM4135R);
                        iM3648W = AbstractC0849j.m3648W(iM3608i);
                        i14 = i18 + iM3646U + iM3648W + iM3608i;
                    }
                    break;
                case 45:
                    iM3608i = C0848i1.m3606g((List) unsafe.getObject(t10, jM4109S));
                    if (iM3608i <= 0) {
                        i14 = i18;
                    } else {
                        if (c0883u0.f3121i) {
                            unsafe.putInt(t10, i17, iM3608i);
                        }
                        iM3646U = AbstractC0849j.m3646U(iM4135R);
                        iM3648W = AbstractC0849j.m3648W(iM3608i);
                        i14 = i18 + iM3646U + iM3648W + iM3608i;
                    }
                    break;
                case 46:
                    iM3608i = C0848i1.m3608i((List) unsafe.getObject(t10, jM4109S));
                    if (iM3608i <= 0) {
                        i14 = i18;
                    } else {
                        if (c0883u0.f3121i) {
                            unsafe.putInt(t10, i17, iM3608i);
                        }
                        iM3646U = AbstractC0849j.m3646U(iM4135R);
                        iM3648W = AbstractC0849j.m3648W(iM3608i);
                        i14 = i18 + iM3646U + iM3648W + iM3608i;
                    }
                    break;
                case 47:
                    iM3608i = C0848i1.m3617r((List) unsafe.getObject(t10, jM4109S));
                    if (iM3608i <= 0) {
                        i14 = i18;
                    } else {
                        if (c0883u0.f3121i) {
                            unsafe.putInt(t10, i17, iM3608i);
                        }
                        iM3646U = AbstractC0849j.m3646U(iM4135R);
                        iM3648W = AbstractC0849j.m3648W(iM3608i);
                        i14 = i18 + iM3646U + iM3648W + iM3608i;
                    }
                    break;
                case 48:
                    iM3608i = C0848i1.m3619t((List) unsafe.getObject(t10, jM4109S));
                    if (iM3608i <= 0) {
                        i14 = i18;
                    } else {
                        if (c0883u0.f3121i) {
                            unsafe.putInt(t10, i17, iM3608i);
                        }
                        iM3646U = AbstractC0849j.m3646U(iM4135R);
                        iM3648W = AbstractC0849j.m3648W(iM3608i);
                        i14 = i18 + iM3646U + iM3648W + iM3608i;
                    }
                    break;
                case 49:
                    iM3662i = C0848i1.m3609j(iM4135R, (List) unsafe.getObject(t10, jM4109S), c0883u0.m4159t(i12));
                    i14 = i18 + iM3662i;
                    break;
                case 50:
                    iM3662i = c0883u0.f3129q.mo3883g(iM4135R, unsafe.getObject(t10, jM4109S), c0883u0.m4158s(i12));
                    i14 = i18 + iM3662i;
                    break;
                case 51:
                    if (!c0883u0.m4127E(t10, iM4135R, i12)) {
                        i14 = i18;
                    } else {
                        iM3662i = AbstractC0849j.m3662i(iM4135R, 0.0d);
                        i14 = i18 + iM3662i;
                    }
                    break;
                case 52:
                    if (!c0883u0.m4127E(t10, iM4135R, i12)) {
                        i14 = i18;
                    } else {
                        iM3662i = AbstractC0849j.m3670q(iM4135R, 0.0f);
                        i14 = i18 + iM3662i;
                    }
                    break;
                case 53:
                    if (!c0883u0.m4127E(t10, iM4135R, i12)) {
                        i14 = i18;
                    } else {
                        iM3662i = AbstractC0849j.m3677x(iM4135R, m4114X(t10, jM4109S));
                        i14 = i18 + iM3662i;
                    }
                    break;
                case 54:
                    if (!c0883u0.m4127E(t10, iM4135R, i12)) {
                        i14 = i18;
                    } else {
                        iM3662i = AbstractC0849j.m3649X(iM4135R, m4114X(t10, jM4109S));
                        i14 = i18 + iM3662i;
                    }
                    break;
                case 55:
                    if (!c0883u0.m4127E(t10, iM4135R, i12)) {
                        i14 = i18;
                    } else {
                        iM3662i = AbstractC0849j.m3675v(iM4135R, m4113W(t10, jM4109S));
                        i14 = i18 + iM3662i;
                    }
                    break;
                case 56:
                    if (!c0883u0.m4127E(t10, iM4135R, i12)) {
                        i14 = i18;
                    } else {
                        iM3662i = AbstractC0849j.m3668o(iM4135R, 0L);
                        i14 = i18 + iM3662i;
                    }
                    break;
                case 57:
                    if (!c0883u0.m4127E(t10, iM4135R, i12)) {
                        i14 = i18;
                    } else {
                        iM3662i = AbstractC0849j.m3666m(iM4135R, 0);
                        i14 = i18 + iM3662i;
                    }
                    break;
                case 58:
                    if (!c0883u0.m4127E(t10, iM4135R, i12)) {
                        i14 = i18;
                    } else {
                        iM3662i = AbstractC0849j.m3654d(iM4135R, true);
                        i14 = i18 + iM3662i;
                    }
                    break;
                case 59:
                    if (!c0883u0.m4127E(t10, iM4135R, i12)) {
                        i14 = i18;
                    } else {
                        Object object2 = unsafe.getObject(t10, jM4109S);
                        iM3662i = object2 instanceof AbstractC0840g ? AbstractC0849j.m3659g(iM4135R, (AbstractC0840g) object2) : AbstractC0849j.m3644S(iM4135R, (String) object2);
                        i14 = i18 + iM3662i;
                    }
                    break;
                case 60:
                    if (!c0883u0.m4127E(t10, iM4135R, i12)) {
                        i14 = i18;
                    } else {
                        iM3662i = C0848i1.m3614o(iM4135R, unsafe.getObject(t10, jM4109S), c0883u0.m4159t(i12));
                        i14 = i18 + iM3662i;
                    }
                    break;
                case 61:
                    if (!c0883u0.m4127E(t10, iM4135R, i12)) {
                        i14 = i18;
                    } else {
                        iM3662i = AbstractC0849j.m3659g(iM4135R, (AbstractC0840g) unsafe.getObject(t10, jM4109S));
                        i14 = i18 + iM3662i;
                    }
                    break;
                case 62:
                    if (!c0883u0.m4127E(t10, iM4135R, i12)) {
                        i14 = i18;
                    } else {
                        iM3662i = AbstractC0849j.m3647V(iM4135R, m4113W(t10, jM4109S));
                        i14 = i18 + iM3662i;
                    }
                    break;
                case 63:
                    if (!c0883u0.m4127E(t10, iM4135R, i12)) {
                        i14 = i18;
                    } else {
                        iM3662i = AbstractC0849j.m3664k(iM4135R, m4113W(t10, jM4109S));
                        i14 = i18 + iM3662i;
                    }
                    break;
                case 64:
                    if (!c0883u0.m4127E(t10, iM4135R, i12)) {
                        i14 = i18;
                    } else {
                        iM3662i = AbstractC0849j.m3636K(iM4135R, 0);
                        i14 = i18 + iM3662i;
                    }
                    break;
                case 65:
                    if (!c0883u0.m4127E(t10, iM4135R, i12)) {
                        i14 = i18;
                    } else {
                        iM3662i = AbstractC0849j.m3638M(iM4135R, 0L);
                        i14 = i18 + iM3662i;
                    }
                    break;
                case 66:
                    if (!c0883u0.m4127E(t10, iM4135R, i12)) {
                        i14 = i18;
                    } else {
                        iM3662i = AbstractC0849j.m3640O(iM4135R, m4113W(t10, jM4109S));
                        i14 = i18 + iM3662i;
                    }
                    break;
                case 67:
                    if (!c0883u0.m4127E(t10, iM4135R, i12)) {
                        i14 = i18;
                    } else {
                        iM3662i = AbstractC0849j.m3642Q(iM4135R, m4114X(t10, jM4109S));
                        i14 = i18 + iM3662i;
                    }
                    break;
                case 68:
                    if (!c0883u0.m4127E(t10, iM4135R, i12)) {
                        i14 = i18;
                    } else {
                        iM3662i = AbstractC0849j.m3672s(iM4135R, (InterfaceC0874r0) unsafe.getObject(t10, jM4109S), c0883u0.m4159t(i12));
                        i14 = i18 + iM3662i;
                    }
                    break;
                default:
                    i14 = i18;
                    break;
            }
            i12 += 3;
            i11 = 1048575;
        }
        int iM4160u = i14 + c0883u0.m4160u(c0883u0.f3127o, t10);
        return c0883u0.f3118f ? iM4160u + c0883u0.f3128p.mo3936c(t10).m4081l() : iM4160u;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m4141d0(Object obj, int i10, InterfaceC0839f1 interfaceC0839f1) {
        if (m4122w(i10)) {
            interfaceC0839f1.mo3425n(this.f3126n.mo3395c(obj, m4109S(i10)));
        } else {
            interfaceC0839f1.mo3397B(this.f3126n.mo3395c(obj, m4109S(i10)));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0842g1
    /* JADX INFO: renamed from: e */
    public T mo3472e() {
        return (T) this.f3125m.mo4171a(this.f3117e);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0842g1
    /* JADX INFO: renamed from: f */
    public int mo3473f(T t8) {
        int i10;
        int iM4241f;
        int length = this.f3113a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iM4148l0 = m4148l0(i12);
            int iM4135R = m4135R(i12);
            long jM4109S = m4109S(iM4148l0);
            int iHashCode = 37;
            switch (m4117k0(iM4148l0)) {
                case 0:
                    i10 = i11 * 53;
                    iM4241f = C0892z.m4241f(Double.doubleToLongBits(C0872q1.m3997u(t8, jM4109S)));
                    i11 = i10 + iM4241f;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iM4241f = Float.floatToIntBits(C0872q1.m3998v(t8, jM4109S));
                    i11 = i10 + iM4241f;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iM4241f = C0892z.m4241f(C0872q1.m4000x(t8, jM4109S));
                    i11 = i10 + iM4241f;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iM4241f = C0892z.m4241f(C0872q1.m4000x(t8, jM4109S));
                    i11 = i10 + iM4241f;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iM4241f = C0872q1.m3999w(t8, jM4109S);
                    i11 = i10 + iM4241f;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iM4241f = C0892z.m4241f(C0872q1.m4000x(t8, jM4109S));
                    i11 = i10 + iM4241f;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iM4241f = C0872q1.m3999w(t8, jM4109S);
                    i11 = i10 + iM4241f;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iM4241f = C0892z.m4238c(C0872q1.m3992p(t8, jM4109S));
                    i11 = i10 + iM4241f;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iM4241f = ((String) C0872q1.m4002z(t8, jM4109S)).hashCode();
                    i11 = i10 + iM4241f;
                    break;
                case 9:
                    Object objM4002z = C0872q1.m4002z(t8, jM4109S);
                    if (objM4002z != null) {
                        iHashCode = objM4002z.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iM4241f = C0872q1.m4002z(t8, jM4109S).hashCode();
                    i11 = i10 + iM4241f;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iM4241f = C0872q1.m3999w(t8, jM4109S);
                    i11 = i10 + iM4241f;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iM4241f = C0872q1.m3999w(t8, jM4109S);
                    i11 = i10 + iM4241f;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iM4241f = C0872q1.m3999w(t8, jM4109S);
                    i11 = i10 + iM4241f;
                    break;
                case 14:
                    i10 = i11 * 53;
                    iM4241f = C0892z.m4241f(C0872q1.m4000x(t8, jM4109S));
                    i11 = i10 + iM4241f;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iM4241f = C0872q1.m3999w(t8, jM4109S);
                    i11 = i10 + iM4241f;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iM4241f = C0892z.m4241f(C0872q1.m4000x(t8, jM4109S));
                    i11 = i10 + iM4241f;
                    break;
                case 17:
                    Object objM4002z2 = C0872q1.m4002z(t8, jM4109S);
                    if (objM4002z2 != null) {
                        iHashCode = objM4002z2.hashCode();
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
                    iM4241f = C0872q1.m4002z(t8, jM4109S).hashCode();
                    i11 = i10 + iM4241f;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iM4241f = C0872q1.m4002z(t8, jM4109S).hashCode();
                    i11 = i10 + iM4241f;
                    break;
                case 51:
                    if (m4127E(t8, iM4135R, i12)) {
                        i10 = i11 * 53;
                        iM4241f = C0892z.m4241f(Double.doubleToLongBits(m4111U(t8, jM4109S)));
                        i11 = i10 + iM4241f;
                    }
                    break;
                case 52:
                    if (m4127E(t8, iM4135R, i12)) {
                        i10 = i11 * 53;
                        iM4241f = Float.floatToIntBits(m4112V(t8, jM4109S));
                        i11 = i10 + iM4241f;
                    }
                    break;
                case 53:
                    if (m4127E(t8, iM4135R, i12)) {
                        i10 = i11 * 53;
                        iM4241f = C0892z.m4241f(m4114X(t8, jM4109S));
                        i11 = i10 + iM4241f;
                    }
                    break;
                case 54:
                    if (m4127E(t8, iM4135R, i12)) {
                        i10 = i11 * 53;
                        iM4241f = C0892z.m4241f(m4114X(t8, jM4109S));
                        i11 = i10 + iM4241f;
                    }
                    break;
                case 55:
                    if (m4127E(t8, iM4135R, i12)) {
                        i10 = i11 * 53;
                        iM4241f = m4113W(t8, jM4109S);
                        i11 = i10 + iM4241f;
                    }
                    break;
                case 56:
                    if (m4127E(t8, iM4135R, i12)) {
                        i10 = i11 * 53;
                        iM4241f = C0892z.m4241f(m4114X(t8, jM4109S));
                        i11 = i10 + iM4241f;
                    }
                    break;
                case 57:
                    if (m4127E(t8, iM4135R, i12)) {
                        i10 = i11 * 53;
                        iM4241f = m4113W(t8, jM4109S);
                        i11 = i10 + iM4241f;
                    }
                    break;
                case 58:
                    if (m4127E(t8, iM4135R, i12)) {
                        i10 = i11 * 53;
                        iM4241f = C0892z.m4238c(m4110T(t8, jM4109S));
                        i11 = i10 + iM4241f;
                    }
                    break;
                case 59:
                    if (m4127E(t8, iM4135R, i12)) {
                        i10 = i11 * 53;
                        iM4241f = ((String) C0872q1.m4002z(t8, jM4109S)).hashCode();
                        i11 = i10 + iM4241f;
                    }
                    break;
                case 60:
                    if (m4127E(t8, iM4135R, i12)) {
                        i10 = i11 * 53;
                        iM4241f = C0872q1.m4002z(t8, jM4109S).hashCode();
                        i11 = i10 + iM4241f;
                    }
                    break;
                case 61:
                    if (m4127E(t8, iM4135R, i12)) {
                        i10 = i11 * 53;
                        iM4241f = C0872q1.m4002z(t8, jM4109S).hashCode();
                        i11 = i10 + iM4241f;
                    }
                    break;
                case 62:
                    if (m4127E(t8, iM4135R, i12)) {
                        i10 = i11 * 53;
                        iM4241f = m4113W(t8, jM4109S);
                        i11 = i10 + iM4241f;
                    }
                    break;
                case 63:
                    if (m4127E(t8, iM4135R, i12)) {
                        i10 = i11 * 53;
                        iM4241f = m4113W(t8, jM4109S);
                        i11 = i10 + iM4241f;
                    }
                    break;
                case 64:
                    if (m4127E(t8, iM4135R, i12)) {
                        i10 = i11 * 53;
                        iM4241f = m4113W(t8, jM4109S);
                        i11 = i10 + iM4241f;
                    }
                    break;
                case 65:
                    if (m4127E(t8, iM4135R, i12)) {
                        i10 = i11 * 53;
                        iM4241f = C0892z.m4241f(m4114X(t8, jM4109S));
                        i11 = i10 + iM4241f;
                    }
                    break;
                case 66:
                    if (m4127E(t8, iM4135R, i12)) {
                        i10 = i11 * 53;
                        iM4241f = m4113W(t8, jM4109S);
                        i11 = i10 + iM4241f;
                    }
                    break;
                case 67:
                    if (m4127E(t8, iM4135R, i12)) {
                        i10 = i11 * 53;
                        iM4241f = C0892z.m4241f(m4114X(t8, jM4109S));
                        i11 = i10 + iM4241f;
                    }
                    break;
                case 68:
                    if (m4127E(t8, iM4135R, i12)) {
                        i10 = i11 * 53;
                        iM4241f = C0872q1.m4002z(t8, jM4109S).hashCode();
                        i11 = i10 + iM4241f;
                    }
                    break;
            }
        }
        int iHashCode2 = (i11 * 53) + this.f3127o.mo3897g(t8).hashCode();
        return this.f3118f ? (iHashCode2 * 53) + this.f3128p.mo3936c(t8).hashCode() : iHashCode2;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m4142f0(T t8, int i10) {
        int iM4137Z = m4137Z(i10);
        long j10 = 1048575 & iM4137Z;
        if (j10 == 1048575) {
            return;
        }
        C0872q1.m3972M(t8, j10, (1 << (iM4137Z >>> 20)) | C0872q1.m3999w(t8, j10));
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0842g1
    /* JADX INFO: renamed from: g */
    public boolean mo3474g(T t8, T t10) {
        int length = this.f3113a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!m4150n(t8, t10, i10)) {
                return false;
            }
        }
        if (!this.f3127o.mo3897g(t8).equals(this.f3127o.mo3897g(t10))) {
            return false;
        }
        if (this.f3118f) {
            return this.f3128p.mo3936c(t8).equals(this.f3128p.mo3936c(t10));
        }
        return true;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m4143g0(T t8, int i10, int i11) {
        C0872q1.m3972M(t8, m4137Z(i11) & 1048575, i10);
    }

    /* JADX DEBUG: Type inference failed for r1v0. Raw type applied. Possible types: androidx.datastore.preferences.protobuf.n1<?, ?>, androidx.datastore.preferences.protobuf.n1<UT, UB> */
    /* JADX DEBUG: Type inference failed for r2v0. Raw type applied. Possible types: androidx.datastore.preferences.protobuf.p<?>, androidx.datastore.preferences.protobuf.p<ET extends androidx.datastore.preferences.protobuf.t$b<ET>> */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0842g1
    /* JADX INFO: renamed from: h */
    public void mo3475h(T t8, InterfaceC0839f1 interfaceC0839f1, C0864o c0864o) {
        c0864o.getClass();
        m4118l(t8);
        m4128H(this.f3127o, this.f3128p, t8, interfaceC0839f1, c0864o);
    }

    /* JADX INFO: renamed from: h0 */
    public final int m4144h0(int i10, int i11) {
        int length = (this.f3113a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int iM4135R = m4135R(i13);
            if (i10 == iM4135R) {
                return i13;
            }
            if (i10 < iM4135R) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0842g1
    /* JADX INFO: renamed from: i */
    public void mo3476i(T t8, InterfaceC0881t1 interfaceC0881t1) {
        if (interfaceC0881t1.mo3841t() == InterfaceC0881t1.a.DESCENDING) {
            m4151n0(t8, interfaceC0881t1);
        } else {
            m4149m0(t8, interfaceC0881t1);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m4145i0(T t8, int i10, Object obj) {
        f3112s.putObject(t8, m4109S(m4148l0(i10)), obj);
        m4142f0(t8, i10);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m4146j(T t8, T t10, int i10) {
        return m4161x(t8, i10) == m4161x(t10, i10);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m4147j0(T t8, int i10, int i11, Object obj) {
        f3112s.putObject(t8, m4109S(m4148l0(i11)), obj);
        m4143g0(t8, i10, i11);
    }

    /* JADX INFO: renamed from: l0 */
    public final int m4148l0(int i10) {
        return this.f3113a[i10 + 1];
    }

    /* JADX DEBUG: Type inference failed for r2v4. Raw type applied. Possible types: androidx.datastore.preferences.protobuf.n1<?, ?>, androidx.datastore.preferences.protobuf.n1<UT, UB> */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    /* JADX INFO: renamed from: m0 */
    public final void m4149m0(T t8, InterfaceC0881t1 interfaceC0881t1) {
        Map.Entry<?, ?> entry;
        Iterator it;
        boolean z10;
        int i10;
        int i11;
        int i12;
        boolean z11;
        C0883u0<T> c0883u0 = this;
        if (c0883u0.f3118f) {
            C0879t<T> c0879tMo3936c = c0883u0.f3128p.mo3936c(t8);
            if (c0879tMo3936c.m4082n()) {
                entry = null;
                it = null;
            } else {
                Iterator itM4085t = c0879tMo3936c.m4085t();
                entry = (Map.Entry) itM4085t.next();
                it = itM4085t;
            }
        } else {
            entry = null;
            it = null;
        }
        int length = c0883u0.f3113a.length;
        Unsafe unsafe = f3112s;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length) {
            int iM4148l0 = c0883u0.m4148l0(i14);
            int iM4135R = c0883u0.m4135R(i14);
            int iM4117k0 = m4117k0(iM4148l0);
            if (iM4117k0 <= 17) {
                int i16 = c0883u0.f3113a[i14 + 2];
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
            while (entry != null && c0883u0.f3128p.mo3934a(entry) <= iM4135R) {
                c0883u0.f3128p.mo3943j(interfaceC0881t1, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long jM4109S = m4109S(iM4148l0);
            switch (iM4117k0) {
                case 0:
                    if (c0883u0.m4162y(t8, i14, i10, i11, i12)) {
                        interfaceC0881t1.mo3833p(iM4135R, m4119m(t8, jM4109S));
                    }
                    break;
                case 1:
                    if (c0883u0.m4162y(t8, i14, i10, i11, i12)) {
                        interfaceC0881t1.mo3779B(iM4135R, m4120q(t8, jM4109S));
                    }
                    c0883u0 = this;
                    break;
                case 2:
                    if (c0883u0.m4162y(t8, i14, i10, i11, i12)) {
                        interfaceC0881t1.mo3843u(iM4135R, unsafe.getLong(t8, jM4109S));
                    }
                    c0883u0 = this;
                    break;
                case 3:
                    if (c0883u0.m4162y(t8, i14, i10, i11, i12)) {
                        interfaceC0881t1.mo3813f(iM4135R, unsafe.getLong(t8, jM4109S));
                    }
                    c0883u0 = this;
                    break;
                case 4:
                    if (c0883u0.m4162y(t8, i14, i10, i11, i12)) {
                        interfaceC0881t1.mo3817h(iM4135R, unsafe.getInt(t8, jM4109S));
                    }
                    c0883u0 = this;
                    break;
                case 5:
                    if (c0883u0.m4162y(t8, i14, i10, i11, i12)) {
                        interfaceC0881t1.mo3839s(iM4135R, unsafe.getLong(t8, jM4109S));
                    }
                    c0883u0 = this;
                    break;
                case 6:
                    if (c0883u0.m4162y(t8, i14, i10, i11, i12)) {
                        interfaceC0881t1.mo3807c(iM4135R, unsafe.getInt(t8, jM4109S));
                    }
                    c0883u0 = this;
                    break;
                case 7:
                    if (c0883u0.m4162y(t8, i14, i10, i11, i12)) {
                        interfaceC0881t1.mo3845v(iM4135R, m4116k(t8, jM4109S));
                    }
                    c0883u0 = this;
                    break;
                case 8:
                    if (c0883u0.m4162y(t8, i14, i10, i11, i12)) {
                        c0883u0.m4155p0(iM4135R, unsafe.getObject(t8, jM4109S), interfaceC0881t1);
                    }
                    break;
                case 9:
                    if (c0883u0.m4162y(t8, i14, i10, i11, i12)) {
                        interfaceC0881t1.mo3789L(iM4135R, unsafe.getObject(t8, jM4109S), c0883u0.m4159t(i14));
                    }
                    break;
                case 10:
                    if (c0883u0.m4162y(t8, i14, i10, i11, i12)) {
                        interfaceC0881t1.mo3788K(iM4135R, (AbstractC0840g) unsafe.getObject(t8, jM4109S));
                    }
                    c0883u0 = this;
                    break;
                case 11:
                    if (c0883u0.m4162y(t8, i14, i10, i11, i12)) {
                        interfaceC0881t1.mo3831o(iM4135R, unsafe.getInt(t8, jM4109S));
                    }
                    c0883u0 = this;
                    break;
                case 12:
                    if (c0883u0.m4162y(t8, i14, i10, i11, i12)) {
                        interfaceC0881t1.mo3782E(iM4135R, unsafe.getInt(t8, jM4109S));
                    }
                    c0883u0 = this;
                    break;
                case 13:
                    if (c0883u0.m4162y(t8, i14, i10, i11, i12)) {
                        interfaceC0881t1.mo3847w(iM4135R, unsafe.getInt(t8, jM4109S));
                    }
                    c0883u0 = this;
                    break;
                case 14:
                    if (c0883u0.m4162y(t8, i14, i10, i11, i12)) {
                        interfaceC0881t1.mo3819i(iM4135R, unsafe.getLong(t8, jM4109S));
                    }
                    c0883u0 = this;
                    break;
                case 15:
                    if (c0883u0.m4162y(t8, i14, i10, i11, i12)) {
                        interfaceC0881t1.mo3785H(iM4135R, unsafe.getInt(t8, jM4109S));
                    }
                    c0883u0 = this;
                    break;
                case 16:
                    if (c0883u0.m4162y(t8, i14, i10, i11, i12)) {
                        interfaceC0881t1.mo3827m(iM4135R, unsafe.getLong(t8, jM4109S));
                    }
                    c0883u0 = this;
                    break;
                case 17:
                    if (c0883u0.m4162y(t8, i14, i10, i11, i12)) {
                        interfaceC0881t1.mo3791N(iM4135R, unsafe.getObject(t8, jM4109S), c0883u0.m4159t(i14));
                    }
                    break;
                case 18:
                    C0848i1.m3584O(c0883u0.m4135R(i14), (List) unsafe.getObject(t8, jM4109S), interfaceC0881t1, false);
                    break;
                case 19:
                    C0848i1.m3588S(c0883u0.m4135R(i14), (List) unsafe.getObject(t8, jM4109S), interfaceC0881t1, false);
                    break;
                case 20:
                    C0848i1.m3591V(c0883u0.m4135R(i14), (List) unsafe.getObject(t8, jM4109S), interfaceC0881t1, false);
                    break;
                case 21:
                    C0848i1.m3603d0(c0883u0.m4135R(i14), (List) unsafe.getObject(t8, jM4109S), interfaceC0881t1, false);
                    break;
                case 22:
                    C0848i1.m3590U(c0883u0.m4135R(i14), (List) unsafe.getObject(t8, jM4109S), interfaceC0881t1, false);
                    break;
                case 23:
                    C0848i1.m3587R(c0883u0.m4135R(i14), (List) unsafe.getObject(t8, jM4109S), interfaceC0881t1, false);
                    break;
                case 24:
                    C0848i1.m3586Q(c0883u0.m4135R(i14), (List) unsafe.getObject(t8, jM4109S), interfaceC0881t1, false);
                    break;
                case 25:
                    C0848i1.m3582M(c0883u0.m4135R(i14), (List) unsafe.getObject(t8, jM4109S), interfaceC0881t1, false);
                    break;
                case 26:
                    C0848i1.m3599b0(c0883u0.m4135R(i14), (List) unsafe.getObject(t8, jM4109S), interfaceC0881t1);
                    break;
                case 27:
                    C0848i1.m3592W(c0883u0.m4135R(i14), (List) unsafe.getObject(t8, jM4109S), interfaceC0881t1, c0883u0.m4159t(i14));
                    break;
                case 28:
                    C0848i1.m3583N(c0883u0.m4135R(i14), (List) unsafe.getObject(t8, jM4109S), interfaceC0881t1);
                    break;
                case 29:
                    z11 = false;
                    C0848i1.m3601c0(c0883u0.m4135R(i14), (List) unsafe.getObject(t8, jM4109S), interfaceC0881t1, false);
                    break;
                case 30:
                    z11 = false;
                    C0848i1.m3585P(c0883u0.m4135R(i14), (List) unsafe.getObject(t8, jM4109S), interfaceC0881t1, false);
                    break;
                case 31:
                    z11 = false;
                    C0848i1.m3593X(c0883u0.m4135R(i14), (List) unsafe.getObject(t8, jM4109S), interfaceC0881t1, false);
                    break;
                case 32:
                    z11 = false;
                    C0848i1.m3594Y(c0883u0.m4135R(i14), (List) unsafe.getObject(t8, jM4109S), interfaceC0881t1, false);
                    break;
                case 33:
                    z11 = false;
                    C0848i1.m3595Z(c0883u0.m4135R(i14), (List) unsafe.getObject(t8, jM4109S), interfaceC0881t1, false);
                    break;
                case 34:
                    z11 = false;
                    C0848i1.m3597a0(c0883u0.m4135R(i14), (List) unsafe.getObject(t8, jM4109S), interfaceC0881t1, false);
                    break;
                case 35:
                    C0848i1.m3584O(c0883u0.m4135R(i14), (List) unsafe.getObject(t8, jM4109S), interfaceC0881t1, z10);
                    break;
                case 36:
                    C0848i1.m3588S(c0883u0.m4135R(i14), (List) unsafe.getObject(t8, jM4109S), interfaceC0881t1, z10);
                    break;
                case 37:
                    C0848i1.m3591V(c0883u0.m4135R(i14), (List) unsafe.getObject(t8, jM4109S), interfaceC0881t1, z10);
                    break;
                case 38:
                    C0848i1.m3603d0(c0883u0.m4135R(i14), (List) unsafe.getObject(t8, jM4109S), interfaceC0881t1, z10);
                    break;
                case 39:
                    C0848i1.m3590U(c0883u0.m4135R(i14), (List) unsafe.getObject(t8, jM4109S), interfaceC0881t1, z10);
                    break;
                case 40:
                    C0848i1.m3587R(c0883u0.m4135R(i14), (List) unsafe.getObject(t8, jM4109S), interfaceC0881t1, z10);
                    break;
                case 41:
                    C0848i1.m3586Q(c0883u0.m4135R(i14), (List) unsafe.getObject(t8, jM4109S), interfaceC0881t1, z10);
                    break;
                case 42:
                    C0848i1.m3582M(c0883u0.m4135R(i14), (List) unsafe.getObject(t8, jM4109S), interfaceC0881t1, z10);
                    break;
                case 43:
                    C0848i1.m3601c0(c0883u0.m4135R(i14), (List) unsafe.getObject(t8, jM4109S), interfaceC0881t1, z10);
                    break;
                case 44:
                    C0848i1.m3585P(c0883u0.m4135R(i14), (List) unsafe.getObject(t8, jM4109S), interfaceC0881t1, z10);
                    break;
                case 45:
                    C0848i1.m3593X(c0883u0.m4135R(i14), (List) unsafe.getObject(t8, jM4109S), interfaceC0881t1, z10);
                    break;
                case 46:
                    C0848i1.m3594Y(c0883u0.m4135R(i14), (List) unsafe.getObject(t8, jM4109S), interfaceC0881t1, z10);
                    break;
                case 47:
                    C0848i1.m3595Z(c0883u0.m4135R(i14), (List) unsafe.getObject(t8, jM4109S), interfaceC0881t1, z10);
                    break;
                case 48:
                    C0848i1.m3597a0(c0883u0.m4135R(i14), (List) unsafe.getObject(t8, jM4109S), interfaceC0881t1, z10);
                    break;
                case 49:
                    C0848i1.m3589T(c0883u0.m4135R(i14), (List) unsafe.getObject(t8, jM4109S), interfaceC0881t1, c0883u0.m4159t(i14));
                    break;
                case 50:
                    c0883u0.m4153o0(interfaceC0881t1, iM4135R, unsafe.getObject(t8, jM4109S), i14);
                    break;
                case 51:
                    if (c0883u0.m4127E(t8, iM4135R, i14)) {
                        interfaceC0881t1.mo3833p(iM4135R, m4111U(t8, jM4109S));
                    }
                    break;
                case 52:
                    if (c0883u0.m4127E(t8, iM4135R, i14)) {
                        interfaceC0881t1.mo3779B(iM4135R, m4112V(t8, jM4109S));
                    }
                    break;
                case 53:
                    if (c0883u0.m4127E(t8, iM4135R, i14)) {
                        interfaceC0881t1.mo3843u(iM4135R, m4114X(t8, jM4109S));
                    }
                    break;
                case 54:
                    if (c0883u0.m4127E(t8, iM4135R, i14)) {
                        interfaceC0881t1.mo3813f(iM4135R, m4114X(t8, jM4109S));
                    }
                    break;
                case 55:
                    if (c0883u0.m4127E(t8, iM4135R, i14)) {
                        interfaceC0881t1.mo3817h(iM4135R, m4113W(t8, jM4109S));
                    }
                    break;
                case 56:
                    if (c0883u0.m4127E(t8, iM4135R, i14)) {
                        interfaceC0881t1.mo3839s(iM4135R, m4114X(t8, jM4109S));
                    }
                    break;
                case 57:
                    if (c0883u0.m4127E(t8, iM4135R, i14)) {
                        interfaceC0881t1.mo3807c(iM4135R, m4113W(t8, jM4109S));
                    }
                    break;
                case 58:
                    if (c0883u0.m4127E(t8, iM4135R, i14)) {
                        interfaceC0881t1.mo3845v(iM4135R, m4110T(t8, jM4109S));
                    }
                    break;
                case 59:
                    if (c0883u0.m4127E(t8, iM4135R, i14)) {
                        c0883u0.m4155p0(iM4135R, unsafe.getObject(t8, jM4109S), interfaceC0881t1);
                    }
                    break;
                case 60:
                    if (c0883u0.m4127E(t8, iM4135R, i14)) {
                        interfaceC0881t1.mo3789L(iM4135R, unsafe.getObject(t8, jM4109S), c0883u0.m4159t(i14));
                    }
                    break;
                case 61:
                    if (c0883u0.m4127E(t8, iM4135R, i14)) {
                        interfaceC0881t1.mo3788K(iM4135R, (AbstractC0840g) unsafe.getObject(t8, jM4109S));
                    }
                    break;
                case 62:
                    if (c0883u0.m4127E(t8, iM4135R, i14)) {
                        interfaceC0881t1.mo3831o(iM4135R, m4113W(t8, jM4109S));
                    }
                    break;
                case 63:
                    if (c0883u0.m4127E(t8, iM4135R, i14)) {
                        interfaceC0881t1.mo3782E(iM4135R, m4113W(t8, jM4109S));
                    }
                    break;
                case 64:
                    if (c0883u0.m4127E(t8, iM4135R, i14)) {
                        interfaceC0881t1.mo3847w(iM4135R, m4113W(t8, jM4109S));
                    }
                    break;
                case 65:
                    if (c0883u0.m4127E(t8, iM4135R, i14)) {
                        interfaceC0881t1.mo3819i(iM4135R, m4114X(t8, jM4109S));
                    }
                    break;
                case 66:
                    if (c0883u0.m4127E(t8, iM4135R, i14)) {
                        interfaceC0881t1.mo3785H(iM4135R, m4113W(t8, jM4109S));
                    }
                    break;
                case 67:
                    if (c0883u0.m4127E(t8, iM4135R, i14)) {
                        interfaceC0881t1.mo3827m(iM4135R, m4114X(t8, jM4109S));
                    }
                    break;
                case 68:
                    if (c0883u0.m4127E(t8, iM4135R, i14)) {
                        interfaceC0881t1.mo3791N(iM4135R, unsafe.getObject(t8, jM4109S), c0883u0.m4159t(i14));
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
            c0883u0.f3128p.mo3943j(interfaceC0881t1, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        c0883u0.m4156q0(c0883u0.f3127o, t8, interfaceC0881t1);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m4150n(T t8, T t10, int i10) {
        int iM4148l0 = m4148l0(i10);
        long jM4109S = m4109S(iM4148l0);
        switch (m4117k0(iM4148l0)) {
            case 0:
                return m4146j(t8, t10, i10) && Double.doubleToLongBits(C0872q1.m3997u(t8, jM4109S)) == Double.doubleToLongBits(C0872q1.m3997u(t10, jM4109S));
            case 1:
                return m4146j(t8, t10, i10) && Float.floatToIntBits(C0872q1.m3998v(t8, jM4109S)) == Float.floatToIntBits(C0872q1.m3998v(t10, jM4109S));
            case 2:
                return m4146j(t8, t10, i10) && C0872q1.m4000x(t8, jM4109S) == C0872q1.m4000x(t10, jM4109S);
            case 3:
                return m4146j(t8, t10, i10) && C0872q1.m4000x(t8, jM4109S) == C0872q1.m4000x(t10, jM4109S);
            case 4:
                return m4146j(t8, t10, i10) && C0872q1.m3999w(t8, jM4109S) == C0872q1.m3999w(t10, jM4109S);
            case 5:
                return m4146j(t8, t10, i10) && C0872q1.m4000x(t8, jM4109S) == C0872q1.m4000x(t10, jM4109S);
            case 6:
                return m4146j(t8, t10, i10) && C0872q1.m3999w(t8, jM4109S) == C0872q1.m3999w(t10, jM4109S);
            case 7:
                return m4146j(t8, t10, i10) && C0872q1.m3992p(t8, jM4109S) == C0872q1.m3992p(t10, jM4109S);
            case 8:
                return m4146j(t8, t10, i10) && C0848i1.m3578I(C0872q1.m4002z(t8, jM4109S), C0872q1.m4002z(t10, jM4109S));
            case 9:
                return m4146j(t8, t10, i10) && C0848i1.m3578I(C0872q1.m4002z(t8, jM4109S), C0872q1.m4002z(t10, jM4109S));
            case 10:
                return m4146j(t8, t10, i10) && C0848i1.m3578I(C0872q1.m4002z(t8, jM4109S), C0872q1.m4002z(t10, jM4109S));
            case 11:
                return m4146j(t8, t10, i10) && C0872q1.m3999w(t8, jM4109S) == C0872q1.m3999w(t10, jM4109S);
            case 12:
                return m4146j(t8, t10, i10) && C0872q1.m3999w(t8, jM4109S) == C0872q1.m3999w(t10, jM4109S);
            case 13:
                return m4146j(t8, t10, i10) && C0872q1.m3999w(t8, jM4109S) == C0872q1.m3999w(t10, jM4109S);
            case 14:
                return m4146j(t8, t10, i10) && C0872q1.m4000x(t8, jM4109S) == C0872q1.m4000x(t10, jM4109S);
            case 15:
                return m4146j(t8, t10, i10) && C0872q1.m3999w(t8, jM4109S) == C0872q1.m3999w(t10, jM4109S);
            case 16:
                return m4146j(t8, t10, i10) && C0872q1.m4000x(t8, jM4109S) == C0872q1.m4000x(t10, jM4109S);
            case 17:
                return m4146j(t8, t10, i10) && C0848i1.m3578I(C0872q1.m4002z(t8, jM4109S), C0872q1.m4002z(t10, jM4109S));
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
                return C0848i1.m3578I(C0872q1.m4002z(t8, jM4109S), C0872q1.m4002z(t10, jM4109S));
            case 50:
                return C0848i1.m3578I(C0872q1.m4002z(t8, jM4109S), C0872q1.m4002z(t10, jM4109S));
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
                return m4126D(t8, t10, i10) && C0848i1.m3578I(C0872q1.m4002z(t8, jM4109S), C0872q1.m4002z(t10, jM4109S));
            default:
                return true;
        }
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: androidx.datastore.preferences.protobuf.n1<?, ?>, androidx.datastore.preferences.protobuf.n1<UT, UB> */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX INFO: renamed from: n0 */
    public final void m4151n0(T t8, InterfaceC0881t1 interfaceC0881t1) {
        Iterator itM4077g;
        Map.Entry<?, ?> entry;
        m4156q0(this.f3127o, t8, interfaceC0881t1);
        if (this.f3118f) {
            C0879t<T> c0879tMo3936c = this.f3128p.mo3936c(t8);
            if (c0879tMo3936c.m4082n()) {
                itM4077g = null;
                entry = null;
            } else {
                itM4077g = c0879tMo3936c.m4077g();
                entry = (Map.Entry) itM4077g.next();
            }
        } else {
            itM4077g = null;
            entry = null;
        }
        for (int length = this.f3113a.length - 3; length >= 0; length -= 3) {
            int iM4148l0 = m4148l0(length);
            int iM4135R = m4135R(length);
            while (entry != null && this.f3128p.mo3934a(entry) > iM4135R) {
                this.f3128p.mo3943j(interfaceC0881t1, entry);
                entry = itM4077g.hasNext() ? (Map.Entry) itM4077g.next() : null;
            }
            switch (m4117k0(iM4148l0)) {
                case 0:
                    if (m4161x(t8, length)) {
                        interfaceC0881t1.mo3833p(iM4135R, m4119m(t8, m4109S(iM4148l0)));
                    }
                    break;
                case 1:
                    if (m4161x(t8, length)) {
                        interfaceC0881t1.mo3779B(iM4135R, m4120q(t8, m4109S(iM4148l0)));
                    }
                    break;
                case 2:
                    if (m4161x(t8, length)) {
                        interfaceC0881t1.mo3843u(iM4135R, m4105G(t8, m4109S(iM4148l0)));
                    }
                    break;
                case 3:
                    if (m4161x(t8, length)) {
                        interfaceC0881t1.mo3813f(iM4135R, m4105G(t8, m4109S(iM4148l0)));
                    }
                    break;
                case 4:
                    if (m4161x(t8, length)) {
                        interfaceC0881t1.mo3817h(iM4135R, m4121v(t8, m4109S(iM4148l0)));
                    }
                    break;
                case 5:
                    if (m4161x(t8, length)) {
                        interfaceC0881t1.mo3839s(iM4135R, m4105G(t8, m4109S(iM4148l0)));
                    }
                    break;
                case 6:
                    if (m4161x(t8, length)) {
                        interfaceC0881t1.mo3807c(iM4135R, m4121v(t8, m4109S(iM4148l0)));
                    }
                    break;
                case 7:
                    if (m4161x(t8, length)) {
                        interfaceC0881t1.mo3845v(iM4135R, m4116k(t8, m4109S(iM4148l0)));
                    }
                    break;
                case 8:
                    if (m4161x(t8, length)) {
                        m4155p0(iM4135R, C0872q1.m4002z(t8, m4109S(iM4148l0)), interfaceC0881t1);
                    }
                    break;
                case 9:
                    if (m4161x(t8, length)) {
                        interfaceC0881t1.mo3789L(iM4135R, C0872q1.m4002z(t8, m4109S(iM4148l0)), m4159t(length));
                    }
                    break;
                case 10:
                    if (m4161x(t8, length)) {
                        interfaceC0881t1.mo3788K(iM4135R, (AbstractC0840g) C0872q1.m4002z(t8, m4109S(iM4148l0)));
                    }
                    break;
                case 11:
                    if (m4161x(t8, length)) {
                        interfaceC0881t1.mo3831o(iM4135R, m4121v(t8, m4109S(iM4148l0)));
                    }
                    break;
                case 12:
                    if (m4161x(t8, length)) {
                        interfaceC0881t1.mo3782E(iM4135R, m4121v(t8, m4109S(iM4148l0)));
                    }
                    break;
                case 13:
                    if (m4161x(t8, length)) {
                        interfaceC0881t1.mo3847w(iM4135R, m4121v(t8, m4109S(iM4148l0)));
                    }
                    break;
                case 14:
                    if (m4161x(t8, length)) {
                        interfaceC0881t1.mo3819i(iM4135R, m4105G(t8, m4109S(iM4148l0)));
                    }
                    break;
                case 15:
                    if (m4161x(t8, length)) {
                        interfaceC0881t1.mo3785H(iM4135R, m4121v(t8, m4109S(iM4148l0)));
                    }
                    break;
                case 16:
                    if (m4161x(t8, length)) {
                        interfaceC0881t1.mo3827m(iM4135R, m4105G(t8, m4109S(iM4148l0)));
                    }
                    break;
                case 17:
                    if (m4161x(t8, length)) {
                        interfaceC0881t1.mo3791N(iM4135R, C0872q1.m4002z(t8, m4109S(iM4148l0)), m4159t(length));
                    }
                    break;
                case 18:
                    C0848i1.m3584O(m4135R(length), (List) C0872q1.m4002z(t8, m4109S(iM4148l0)), interfaceC0881t1, false);
                    break;
                case 19:
                    C0848i1.m3588S(m4135R(length), (List) C0872q1.m4002z(t8, m4109S(iM4148l0)), interfaceC0881t1, false);
                    break;
                case 20:
                    C0848i1.m3591V(m4135R(length), (List) C0872q1.m4002z(t8, m4109S(iM4148l0)), interfaceC0881t1, false);
                    break;
                case 21:
                    C0848i1.m3603d0(m4135R(length), (List) C0872q1.m4002z(t8, m4109S(iM4148l0)), interfaceC0881t1, false);
                    break;
                case 22:
                    C0848i1.m3590U(m4135R(length), (List) C0872q1.m4002z(t8, m4109S(iM4148l0)), interfaceC0881t1, false);
                    break;
                case 23:
                    C0848i1.m3587R(m4135R(length), (List) C0872q1.m4002z(t8, m4109S(iM4148l0)), interfaceC0881t1, false);
                    break;
                case 24:
                    C0848i1.m3586Q(m4135R(length), (List) C0872q1.m4002z(t8, m4109S(iM4148l0)), interfaceC0881t1, false);
                    break;
                case 25:
                    C0848i1.m3582M(m4135R(length), (List) C0872q1.m4002z(t8, m4109S(iM4148l0)), interfaceC0881t1, false);
                    break;
                case 26:
                    C0848i1.m3599b0(m4135R(length), (List) C0872q1.m4002z(t8, m4109S(iM4148l0)), interfaceC0881t1);
                    break;
                case 27:
                    C0848i1.m3592W(m4135R(length), (List) C0872q1.m4002z(t8, m4109S(iM4148l0)), interfaceC0881t1, m4159t(length));
                    break;
                case 28:
                    C0848i1.m3583N(m4135R(length), (List) C0872q1.m4002z(t8, m4109S(iM4148l0)), interfaceC0881t1);
                    break;
                case 29:
                    C0848i1.m3601c0(m4135R(length), (List) C0872q1.m4002z(t8, m4109S(iM4148l0)), interfaceC0881t1, false);
                    break;
                case 30:
                    C0848i1.m3585P(m4135R(length), (List) C0872q1.m4002z(t8, m4109S(iM4148l0)), interfaceC0881t1, false);
                    break;
                case 31:
                    C0848i1.m3593X(m4135R(length), (List) C0872q1.m4002z(t8, m4109S(iM4148l0)), interfaceC0881t1, false);
                    break;
                case 32:
                    C0848i1.m3594Y(m4135R(length), (List) C0872q1.m4002z(t8, m4109S(iM4148l0)), interfaceC0881t1, false);
                    break;
                case 33:
                    C0848i1.m3595Z(m4135R(length), (List) C0872q1.m4002z(t8, m4109S(iM4148l0)), interfaceC0881t1, false);
                    break;
                case 34:
                    C0848i1.m3597a0(m4135R(length), (List) C0872q1.m4002z(t8, m4109S(iM4148l0)), interfaceC0881t1, false);
                    break;
                case 35:
                    C0848i1.m3584O(m4135R(length), (List) C0872q1.m4002z(t8, m4109S(iM4148l0)), interfaceC0881t1, true);
                    break;
                case 36:
                    C0848i1.m3588S(m4135R(length), (List) C0872q1.m4002z(t8, m4109S(iM4148l0)), interfaceC0881t1, true);
                    break;
                case 37:
                    C0848i1.m3591V(m4135R(length), (List) C0872q1.m4002z(t8, m4109S(iM4148l0)), interfaceC0881t1, true);
                    break;
                case 38:
                    C0848i1.m3603d0(m4135R(length), (List) C0872q1.m4002z(t8, m4109S(iM4148l0)), interfaceC0881t1, true);
                    break;
                case 39:
                    C0848i1.m3590U(m4135R(length), (List) C0872q1.m4002z(t8, m4109S(iM4148l0)), interfaceC0881t1, true);
                    break;
                case 40:
                    C0848i1.m3587R(m4135R(length), (List) C0872q1.m4002z(t8, m4109S(iM4148l0)), interfaceC0881t1, true);
                    break;
                case 41:
                    C0848i1.m3586Q(m4135R(length), (List) C0872q1.m4002z(t8, m4109S(iM4148l0)), interfaceC0881t1, true);
                    break;
                case 42:
                    C0848i1.m3582M(m4135R(length), (List) C0872q1.m4002z(t8, m4109S(iM4148l0)), interfaceC0881t1, true);
                    break;
                case 43:
                    C0848i1.m3601c0(m4135R(length), (List) C0872q1.m4002z(t8, m4109S(iM4148l0)), interfaceC0881t1, true);
                    break;
                case 44:
                    C0848i1.m3585P(m4135R(length), (List) C0872q1.m4002z(t8, m4109S(iM4148l0)), interfaceC0881t1, true);
                    break;
                case 45:
                    C0848i1.m3593X(m4135R(length), (List) C0872q1.m4002z(t8, m4109S(iM4148l0)), interfaceC0881t1, true);
                    break;
                case 46:
                    C0848i1.m3594Y(m4135R(length), (List) C0872q1.m4002z(t8, m4109S(iM4148l0)), interfaceC0881t1, true);
                    break;
                case 47:
                    C0848i1.m3595Z(m4135R(length), (List) C0872q1.m4002z(t8, m4109S(iM4148l0)), interfaceC0881t1, true);
                    break;
                case 48:
                    C0848i1.m3597a0(m4135R(length), (List) C0872q1.m4002z(t8, m4109S(iM4148l0)), interfaceC0881t1, true);
                    break;
                case 49:
                    C0848i1.m3589T(m4135R(length), (List) C0872q1.m4002z(t8, m4109S(iM4148l0)), interfaceC0881t1, m4159t(length));
                    break;
                case 50:
                    m4153o0(interfaceC0881t1, iM4135R, C0872q1.m4002z(t8, m4109S(iM4148l0)), length);
                    break;
                case 51:
                    if (m4127E(t8, iM4135R, length)) {
                        interfaceC0881t1.mo3833p(iM4135R, m4111U(t8, m4109S(iM4148l0)));
                    }
                    break;
                case 52:
                    if (m4127E(t8, iM4135R, length)) {
                        interfaceC0881t1.mo3779B(iM4135R, m4112V(t8, m4109S(iM4148l0)));
                    }
                    break;
                case 53:
                    if (m4127E(t8, iM4135R, length)) {
                        interfaceC0881t1.mo3843u(iM4135R, m4114X(t8, m4109S(iM4148l0)));
                    }
                    break;
                case 54:
                    if (m4127E(t8, iM4135R, length)) {
                        interfaceC0881t1.mo3813f(iM4135R, m4114X(t8, m4109S(iM4148l0)));
                    }
                    break;
                case 55:
                    if (m4127E(t8, iM4135R, length)) {
                        interfaceC0881t1.mo3817h(iM4135R, m4113W(t8, m4109S(iM4148l0)));
                    }
                    break;
                case 56:
                    if (m4127E(t8, iM4135R, length)) {
                        interfaceC0881t1.mo3839s(iM4135R, m4114X(t8, m4109S(iM4148l0)));
                    }
                    break;
                case 57:
                    if (m4127E(t8, iM4135R, length)) {
                        interfaceC0881t1.mo3807c(iM4135R, m4113W(t8, m4109S(iM4148l0)));
                    }
                    break;
                case 58:
                    if (m4127E(t8, iM4135R, length)) {
                        interfaceC0881t1.mo3845v(iM4135R, m4110T(t8, m4109S(iM4148l0)));
                    }
                    break;
                case 59:
                    if (m4127E(t8, iM4135R, length)) {
                        m4155p0(iM4135R, C0872q1.m4002z(t8, m4109S(iM4148l0)), interfaceC0881t1);
                    }
                    break;
                case 60:
                    if (m4127E(t8, iM4135R, length)) {
                        interfaceC0881t1.mo3789L(iM4135R, C0872q1.m4002z(t8, m4109S(iM4148l0)), m4159t(length));
                    }
                    break;
                case 61:
                    if (m4127E(t8, iM4135R, length)) {
                        interfaceC0881t1.mo3788K(iM4135R, (AbstractC0840g) C0872q1.m4002z(t8, m4109S(iM4148l0)));
                    }
                    break;
                case 62:
                    if (m4127E(t8, iM4135R, length)) {
                        interfaceC0881t1.mo3831o(iM4135R, m4113W(t8, m4109S(iM4148l0)));
                    }
                    break;
                case 63:
                    if (m4127E(t8, iM4135R, length)) {
                        interfaceC0881t1.mo3782E(iM4135R, m4113W(t8, m4109S(iM4148l0)));
                    }
                    break;
                case 64:
                    if (m4127E(t8, iM4135R, length)) {
                        interfaceC0881t1.mo3847w(iM4135R, m4113W(t8, m4109S(iM4148l0)));
                    }
                    break;
                case 65:
                    if (m4127E(t8, iM4135R, length)) {
                        interfaceC0881t1.mo3819i(iM4135R, m4114X(t8, m4109S(iM4148l0)));
                    }
                    break;
                case 66:
                    if (m4127E(t8, iM4135R, length)) {
                        interfaceC0881t1.mo3785H(iM4135R, m4113W(t8, m4109S(iM4148l0)));
                    }
                    break;
                case 67:
                    if (m4127E(t8, iM4135R, length)) {
                        interfaceC0881t1.mo3827m(iM4135R, m4114X(t8, m4109S(iM4148l0)));
                    }
                    break;
                case 68:
                    if (m4127E(t8, iM4135R, length)) {
                        interfaceC0881t1.mo3791N(iM4135R, C0872q1.m4002z(t8, m4109S(iM4148l0)), m4159t(length));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.f3128p.mo3943j(interfaceC0881t1, entry);
            entry = itM4077g.hasNext() ? (Map.Entry) itM4077g.next() : null;
        }
    }

    /* JADX DEBUG: Type inference failed for r3v0. Raw type applied. Possible types: java.util.Map<?, ?>, java.util.Map<K, V> */
    /* JADX INFO: renamed from: o */
    public final <UT, UB> UB m4152o(Object obj, int i10, UB ub, AbstractC0863n1<UT, UB> abstractC0863n1, Object obj2) {
        C0892z.c cVarM4157r;
        int iM4135R = m4135R(i10);
        Object objM4002z = C0872q1.m4002z(obj, m4109S(m4148l0(i10)));
        return (objM4002z == null || (cVarM4157r = m4157r(i10)) == null) ? ub : (UB) m4154p(i10, iM4135R, this.f3129q.mo3879c(objM4002z), cVarM4157r, ub, abstractC0863n1, obj2);
    }

    /* JADX INFO: renamed from: o0 */
    public final <K, V> void m4153o0(InterfaceC0881t1 interfaceC0881t1, int i10, Object obj, int i11) {
        if (obj != null) {
            interfaceC0881t1.mo3790M(i10, this.f3129q.mo3878b(m4158s(i11)), this.f3129q.mo3881e(obj));
        }
    }

    /* JADX INFO: renamed from: p */
    public final <K, V, UT, UB> UB m4154p(int i10, int i11, Map<K, V> map, C0892z.c cVar, UB ub, AbstractC0863n1<UT, UB> abstractC0863n1, Object obj) {
        C0853k0.a<?, ?> aVarMo3878b = this.f3129q.mo3878b(m4158s(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!cVar.m4245a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = abstractC0863n1.mo3896f(obj);
                }
                AbstractC0840g.h hVarM3446l = AbstractC0840g.m3446l(C0853k0.m3853b(aVarMo3878b, next.getKey(), next.getValue()));
                try {
                    C0853k0.m3855e(hVarM3446l.m3465b(), aVarMo3878b, next.getKey(), next.getValue());
                    abstractC0863n1.mo3894d(ub, i11, hVarM3446l.m3464a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m4155p0(int i10, Object obj, InterfaceC0881t1 interfaceC0881t1) {
        if (obj instanceof String) {
            interfaceC0881t1.mo3811e(i10, (String) obj);
        } else {
            interfaceC0881t1.mo3788K(i10, (AbstractC0840g) obj);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final <UT, UB> void m4156q0(AbstractC0863n1<UT, UB> abstractC0863n1, T t8, InterfaceC0881t1 interfaceC0881t1) {
        abstractC0863n1.mo3910t(abstractC0863n1.mo3897g(t8), interfaceC0881t1);
    }

    /* JADX INFO: renamed from: r */
    public final C0892z.c m4157r(int i10) {
        return (C0892z.c) this.f3114b[((i10 / 3) * 2) + 1];
    }

    /* JADX INFO: renamed from: s */
    public final Object m4158s(int i10) {
        return this.f3114b[(i10 / 3) * 2];
    }

    /* JADX INFO: renamed from: t */
    public final InterfaceC0842g1 m4159t(int i10) {
        int i11 = (i10 / 3) * 2;
        InterfaceC0842g1 interfaceC0842g1 = (InterfaceC0842g1) this.f3114b[i11];
        if (interfaceC0842g1 != null) {
            return interfaceC0842g1;
        }
        InterfaceC0842g1<T> interfaceC0842g1M3366c = C0830c1.m3364a().m3366c((Class) this.f3114b[i11 + 1]);
        this.f3114b[i11] = interfaceC0842g1M3366c;
        return interfaceC0842g1M3366c;
    }

    /* JADX INFO: renamed from: u */
    public final <UT, UB> int m4160u(AbstractC0863n1<UT, UB> abstractC0863n1, T t8) {
        return abstractC0863n1.mo3898h(abstractC0863n1.mo3897g(t8));
    }

    /* JADX INFO: renamed from: x */
    public final boolean m4161x(T t8, int i10) {
        boolean zEquals;
        int iM4137Z = m4137Z(i10);
        long j10 = 1048575 & iM4137Z;
        if (j10 != 1048575) {
            return (C0872q1.m3999w(t8, j10) & (1 << (iM4137Z >>> 20))) != 0;
        }
        int iM4148l0 = m4148l0(i10);
        long jM4109S = m4109S(iM4148l0);
        switch (m4117k0(iM4148l0)) {
            case 0:
                return Double.doubleToRawLongBits(C0872q1.m3997u(t8, jM4109S)) != 0;
            case 1:
                return Float.floatToRawIntBits(C0872q1.m3998v(t8, jM4109S)) != 0;
            case 2:
                return C0872q1.m4000x(t8, jM4109S) != 0;
            case 3:
                return C0872q1.m4000x(t8, jM4109S) != 0;
            case 4:
                return C0872q1.m3999w(t8, jM4109S) != 0;
            case 5:
                return C0872q1.m4000x(t8, jM4109S) != 0;
            case 6:
                return C0872q1.m3999w(t8, jM4109S) != 0;
            case 7:
                return C0872q1.m3992p(t8, jM4109S);
            case 8:
                Object objM4002z = C0872q1.m4002z(t8, jM4109S);
                if (objM4002z instanceof String) {
                    zEquals = ((String) objM4002z).isEmpty();
                } else {
                    if (!(objM4002z instanceof AbstractC0840g)) {
                        throw new IllegalArgumentException();
                    }
                    zEquals = AbstractC0840g.f2854b.equals(objM4002z);
                }
                break;
            case 9:
                return C0872q1.m4002z(t8, jM4109S) != null;
            case 10:
                zEquals = AbstractC0840g.f2854b.equals(C0872q1.m4002z(t8, jM4109S));
                break;
            case 11:
                return C0872q1.m3999w(t8, jM4109S) != 0;
            case 12:
                return C0872q1.m3999w(t8, jM4109S) != 0;
            case 13:
                return C0872q1.m3999w(t8, jM4109S) != 0;
            case 14:
                return C0872q1.m4000x(t8, jM4109S) != 0;
            case 15:
                return C0872q1.m3999w(t8, jM4109S) != 0;
            case 16:
                return C0872q1.m4000x(t8, jM4109S) != 0;
            case 17:
                return C0872q1.m4002z(t8, jM4109S) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !zEquals;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m4162y(T t8, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return m4161x(t8, i10);
        }
        return (i12 & i13) != 0;
    }
}
