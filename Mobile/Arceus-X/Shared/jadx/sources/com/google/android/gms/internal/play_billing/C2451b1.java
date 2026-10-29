package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.b1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2451b1 extends AbstractC2615q0 {

    /* JADX INFO: renamed from: g */
    public static final AbstractC2615q0 f8922g = new C2451b1(null, new Object[0], 0);

    /* JADX INFO: renamed from: d */
    public final transient Object f8923d;

    /* JADX INFO: renamed from: e */
    public final transient Object[] f8924e;

    /* JADX INFO: renamed from: f */
    public final transient int f8925f;

    public C2451b1(Object obj, Object[] objArr, int i10) {
        this.f8923d = obj;
        this.f8924e = objArr;
        this.f8925f = i10;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:51:0x012c */
    /* JADX WARN: Code duplicated, block: B:74:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ce  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /* JADX INFO: renamed from: g */
    public static C2451b1 m11272g(int i10, Object[] objArr, C2604p0 c2604p0) {
        boolean z10;
        int i11;
        char c10;
        ?? r8;
        char c11;
        short[] sArr;
        boolean z11;
        int i12;
        ?? r16;
        boolean z12;
        ?? r10;
        Object[] objArr2;
        C2593o0 c2593o0;
        boolean z13;
        int i13 = i10;
        Object[] objArrCopyOf = objArr;
        if (i13 == 0) {
            return (C2451b1) f8922g;
        }
        C2593o0 c2593o1 = null;
        ?? r11 = 0;
        C2593o0 c2593o2 = null;
        C2593o0 c2593o3 = null;
        boolean z14 = false;
        int i14 = 1;
        if (i13 == 1) {
            Object obj = objArrCopyOf[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArrCopyOf[1];
            Objects.requireNonNull(obj2);
            C2494f0.m11400a(obj, obj2);
            return new C2451b1(null, objArrCopyOf, 1);
        }
        C2691x.m11816b(i13, objArrCopyOf.length >> 1, "index");
        int iM11705g = AbstractC2637s0.m11705g(i13);
        char c12 = 2;
        if (i13 != 1) {
            int i15 = iM11705g - 1;
            if (iM11705g <= 128) {
                byte[] bArr = new byte[iM11705g];
                Arrays.fill(bArr, (byte) -1);
                int i16 = 0;
                int i17 = 0;
                while (i16 < i13) {
                    int i18 = i17 + i17;
                    int i19 = i16 + i16;
                    Object obj3 = objArrCopyOf[i19];
                    Objects.requireNonNull(obj3);
                    Object obj4 = objArrCopyOf[i19 ^ i14];
                    Objects.requireNonNull(obj4);
                    C2494f0.m11400a(obj3, obj4);
                    int iM11418a = C2505g0.m11418a(obj3.hashCode());
                    while (true) {
                        int i20 = iM11418a & i15;
                        z11 = z14;
                        i12 = i14;
                        int i21 = bArr[i20] & 255;
                        if (i21 == 255) {
                            bArr[i20] = (byte) i18;
                            if (i17 < i16) {
                                objArrCopyOf[i18] = obj3;
                                objArrCopyOf[i18 ^ 1] = obj4;
                            }
                            i17++;
                            break;
                        }
                        if (obj3.equals(objArrCopyOf[i21 == true ? 1 : 0])) {
                            int i22 = ~i21;
                            Object obj5 = objArrCopyOf[i22 == true ? 1 : 0];
                            Objects.requireNonNull(obj5);
                            C2593o0 c2593o4 = new C2593o0(obj3, obj4, obj5);
                            objArrCopyOf[i22 == true ? 1 : 0] = obj4;
                            c2593o2 = c2593o4;
                            break;
                        }
                        iM11418a = i20 + 1;
                        z14 = z11;
                        i14 = i12;
                    }
                    i16++;
                    z14 = z11;
                    i14 = i12;
                }
                z10 = z14;
                i11 = i14;
                if (i17 == i13) {
                    r11 = bArr;
                    z13 = z10;
                } else {
                    sArr = new Object[3];
                    sArr[z10 ? 1 : 0] = bArr;
                    sArr[i11] = Integer.valueOf(i17);
                    sArr[2] = c2593o2;
                    r11 = sArr;
                    z13 = z10;
                }
            } else {
                z10 = false;
                i11 = 1;
                if (iM11705g <= 32768) {
                    sArr = new short[iM11705g];
                    Arrays.fill(sArr, (short) -1);
                    int i23 = 0;
                    for (int i24 = 0; i24 < i13; i24++) {
                        int i25 = i23 + i23;
                        int i26 = i24 + i24;
                        Object obj6 = objArrCopyOf[i26];
                        Objects.requireNonNull(obj6);
                        Object obj7 = objArrCopyOf[i26 ^ 1];
                        Objects.requireNonNull(obj7);
                        C2494f0.m11400a(obj6, obj7);
                        int iM11418a2 = C2505g0.m11418a(obj6.hashCode());
                        while (true) {
                            int i27 = iM11418a2 & i15;
                            char c13 = (char) sArr[i27];
                            if (c13 == 65535) {
                                sArr[i27] = (short) i25;
                                if (i23 < i24) {
                                    objArrCopyOf[i25] = obj6;
                                    objArrCopyOf[i25 ^ 1] = obj7;
                                }
                                i23++;
                                break;
                            }
                            if (obj6.equals(objArrCopyOf[c13])) {
                                int i28 = c13 ^ 1;
                                Object obj8 = objArrCopyOf[i28 == true ? 1 : 0];
                                Objects.requireNonNull(obj8);
                                C2593o0 c2593o5 = new C2593o0(obj6, obj7, obj8);
                                objArrCopyOf[i28 == true ? 1 : 0] = obj7;
                                c2593o3 = c2593o5;
                                break;
                            }
                            iM11418a2 = i27 + 1;
                        }
                    }
                    if (i23 == i13) {
                        r11 = sArr;
                        z13 = z10;
                    } else {
                        r11 = new Object[]{sArr, Integer.valueOf(i23), c2593o3};
                        z13 = z10;
                    }
                } else {
                    int[] iArr = new int[iM11705g];
                    Arrays.fill(iArr, -1);
                    int i29 = 0;
                    int i30 = 0;
                    while (i29 < i13) {
                        int i31 = i30 + i30;
                        int i32 = i29 + i29;
                        Object obj9 = objArrCopyOf[i32];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArrCopyOf[i32 ^ 1];
                        Objects.requireNonNull(obj10);
                        C2494f0.m11400a(obj9, obj10);
                        int iM11418a3 = C2505g0.m11418a(obj9.hashCode());
                        while (true) {
                            int i33 = iM11418a3 & i15;
                            int i34 = iArr[i33];
                            if (i34 == -1) {
                                iArr[i33] = i31;
                                if (i30 < i29) {
                                    objArrCopyOf[i31] = obj9;
                                    objArrCopyOf[i31 ^ 1] = obj10;
                                }
                                i30++;
                                c11 = c12;
                                break;
                            }
                            c11 = c12;
                            if (obj9.equals(objArrCopyOf[i34])) {
                                int i35 = i34 ^ 1;
                                Object obj11 = objArrCopyOf[i35];
                                Objects.requireNonNull(obj11);
                                C2593o0 c2593o6 = new C2593o0(obj9, obj10, obj11);
                                objArrCopyOf[i35] = obj10;
                                c2593o1 = c2593o6;
                                break;
                            }
                            iM11418a3 = i33 + 1;
                            c12 = c11;
                        }
                        i29++;
                        c12 = c11;
                    }
                    c10 = c12;
                    if (i30 == i13) {
                        r8 = iArr;
                        r16 = z10;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i30);
                        objArr3[c10] = c2593o1;
                        r8 = objArr3;
                        r16 = z10;
                    }
                }
            }
            z12 = r8 instanceof Object[];
            r10 = r8;
            if (z12) {
                objArr2 = (Object[]) r8;
                c2593o0 = (C2593o0) objArr2[c10];
                if (c2604p0 != null) {
                    throw c2593o0.m11631a();
                }
                c2604p0.f9184c = c2593o0;
                Object obj12 = objArr2[r16];
                int iIntValue = ((Integer) objArr2[i11]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                r10 = obj12;
                i13 = iIntValue;
            }
            return new C2451b1(r10, objArrCopyOf, i13);
        }
        Object obj13 = objArrCopyOf[0];
        Objects.requireNonNull(obj13);
        Object obj14 = objArrCopyOf[1];
        Objects.requireNonNull(obj14);
        C2494f0.m11400a(obj13, obj14);
        z13 = false;
        i13 = 1;
        i11 = 1;
        c10 = 2;
        r8 = r11;
        r16 = z13;
        z12 = r8 instanceof Object[];
        r10 = r8;
        if (z12) {
            objArr2 = (Object[]) r8;
            c2593o0 = (C2593o0) objArr2[c10];
            if (c2604p0 != null) {
                throw c2593o0.m11631a();
            }
            c2604p0.f9184c = c2593o0;
            Object obj15 = objArr2[r16];
            int iIntValue2 = ((Integer) objArr2[i11]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 + iIntValue2);
            r10 = obj15;
            i13 = iIntValue2;
        }
        return new C2451b1(r10, objArrCopyOf, i13);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2615q0
    /* JADX INFO: renamed from: a */
    public final AbstractC2538j0 mo11273a() {
        return new C2440a1(this.f8924e, 1, this.f8925f);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2615q0
    /* JADX INFO: renamed from: d */
    public final AbstractC2637s0 mo11274d() {
        return new C2703y0(this, this.f8924e, 0, this.f8925f);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2615q0
    /* JADX INFO: renamed from: e */
    public final AbstractC2637s0 mo11275e() {
        return new C2714z0(this, new C2440a1(this.f8924e, 0, this.f8925f));
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.play_billing.AbstractC2615q0, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i10 = this.f8925f;
            Object[] objArr = this.f8924e;
            if (i10 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.f8923d;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iM11418a = C2505g0.m11418a(obj.hashCode());
                    while (true) {
                        int i11 = iM11418a & length;
                        int i12 = bArr[i11] & 255;
                        if (i12 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i12])) {
                            obj2 = objArr[i12 ^ 1];
                        } else {
                            iM11418a = i11 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iM11418a2 = C2505g0.m11418a(obj.hashCode());
                    while (true) {
                        int i13 = iM11418a2 & length2;
                        char c10 = (char) sArr[i13];
                        if (c10 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c10])) {
                            obj2 = objArr[c10 ^ 1];
                        } else {
                            iM11418a2 = i13 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iM11418a3 = C2505g0.m11418a(obj.hashCode());
                    while (true) {
                        int i14 = iM11418a3 & length3;
                        int i15 = iArr[i14];
                        if (i15 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i15])) {
                            obj2 = objArr[i15 ^ 1];
                        } else {
                            iM11418a3 = i14 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f8925f;
    }
}
