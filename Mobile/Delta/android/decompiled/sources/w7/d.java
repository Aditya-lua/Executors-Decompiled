package w7;

/* JADX INFO: loaded from: classes.dex */
public class d {
    public static final float[] b = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f, 1.0E11f, 1.0E12f, 1.0E13f, 1.0E14f, 1.0E15f, 1.0E16f, 1.0E17f, 1.0E18f, 1.0E19f, 1.0E20f, 1.0E21f, 1.0E22f, 1.0E23f, 1.0E24f, 1.0E25f, 1.0E26f, 1.0E27f, 1.0E28f, 1.0E29f, 1.0E30f, 1.0E31f, 1.0E32f, 1.0E33f, 1.0E34f, 1.0E35f, 1.0E36f, 1.0E37f, 1.0E38f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float[] f33776c = {1.0f, 0.1f, 0.01f, 0.001f, 1.0E-4f, 1.0E-5f, 1.0E-6f, 1.0E-7f, 1.0E-8f, 1.0E-9f, 1.0E-10f, 1.0E-11f, 1.0E-12f, 1.0E-13f, 1.0E-14f, 1.0E-15f, 1.0E-16f, 1.0E-17f, 1.0E-18f, 1.0E-19f, 1.0E-20f, 1.0E-21f, 1.0E-22f, 1.0E-23f, 1.0E-24f, 1.0E-25f, 1.0E-26f, 1.0E-27f, 1.0E-28f, 1.0E-29f, 1.0E-30f, 1.0E-31f, 1.0E-32f, 1.0E-33f, 1.0E-34f, 1.0E-35f, 1.0E-36f, 1.0E-37f, 1.0E-38f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f33777a;

    public int a() {
        return this.f33777a;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x008a A[EDGE_INSN: B:107:0x008a->B:42:0x008a BREAK  A[LOOP:0: B:13:0x0034->B:41:0x0083], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0101 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:47:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0097 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x0098  */
    /* JADX WARN: Code duplicated, block: B:51:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00de  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:84:0x0105 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:85:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x0108  */
    /* JADX WARN: Code duplicated, block: B:87:0x010a  */
    public float b(String str, int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        int i14;
        boolean z11;
        int i15;
        int i16;
        int i17;
        int i18;
        float f10;
        char cCharAt;
        int i19;
        char cCharAt2;
        boolean z12;
        boolean z13;
        int i20;
        int i21;
        int i22;
        char cCharAt3;
        char cCharAt4;
        this.f33777a = i10;
        if (i10 >= i11) {
            return Float.NaN;
        }
        char cCharAt5 = str.charAt(i10);
        if (cCharAt5 != '+') {
            if (cCharAt5 != '-') {
                z10 = false;
            } else {
                z10 = true;
            }
            int i23 = this.f33777a;
            long j10 = 0;
            i12 = 0;
            i13 = 0;
            i14 = 0;
            z11 = false;
            i15 = 0;
            while (true) {
                i16 = this.f33777a;
                if (i16 >= i11) {
                    break;
                }
                cCharAt4 = str.charAt(i16);
                if (cCharAt4 != '0') {
                    if (i12 == 0) {
                        i14++;
                    } else {
                        i13++;
                    }
                } else if (cCharAt4 < '1' && cCharAt4 <= '9') {
                    int i24 = i12 + i13;
                    while (i13 > 0) {
                        if (j10 > 922337203685477580L) {
                            return Float.NaN;
                        }
                        j10 *= 10;
                        i13--;
                    }
                    if (j10 > 922337203685477580L) {
                        return Float.NaN;
                    }
                    j10 = (j10 * 10) + ((long) (cCharAt4 - '0'));
                    i12 = i24 + 1;
                    if (j10 < 0) {
                        return Float.NaN;
                    }
                } else {
                    if (cCharAt4 != '.' || z11) {
                        break;
                    }
                    i15 = this.f33777a - i23;
                    z11 = true;
                }
                this.f33777a++;
            }
            if (!z11 && this.f33777a == i15 + 1) {
                return Float.NaN;
            }
            if (i12 == 0) {
                if (i14 == 0) {
                    return Float.NaN;
                }
                i12 = 1;
            }
            if (z11) {
                i13 = (i15 - i14) - i12;
            }
            i17 = this.f33777a;
            if (i17 < i11 && ((cCharAt = str.charAt(i17)) == 'E' || cCharAt == 'e')) {
                i19 = this.f33777a + 1;
                this.f33777a = i19;
                if (i19 == i11) {
                    return Float.NaN;
                }
                cCharAt2 = str.charAt(i19);
                if (cCharAt2 != '+') {
                    if (cCharAt2 != '-') {
                        switch (cCharAt2) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                z12 = false;
                                z13 = false;
                                break;
                            default:
                                this.f33777a--;
                                z13 = true;
                                z12 = false;
                                break;
                        }
                    } else {
                        z12 = true;
                    }
                    if (!z13) {
                        i20 = this.f33777a;
                        i21 = 0;
                        while (true) {
                            i22 = this.f33777a;
                            if (i22 >= i11 && (cCharAt3 = str.charAt(i22)) >= '0' && cCharAt3 <= '9') {
                                if (i21 > 922337203685477580L) {
                                    return Float.NaN;
                                }
                                i21 = (i21 * 10) + (cCharAt3 - '0');
                                this.f33777a++;
                            }
                        }
                        if (this.f33777a == i20) {
                            return Float.NaN;
                        }
                        if (z12) {
                            i13 -= i21;
                        } else {
                            i13 += i21;
                        }
                    }
                } else {
                    z12 = false;
                }
                this.f33777a++;
                z13 = false;
                if (!z13) {
                    i20 = this.f33777a;
                    i21 = 0;
                    while (true) {
                        i22 = this.f33777a;
                        if (i22 >= i11) {
                        }
                        i21 = (i21 * 10) + (cCharAt3 - '0');
                        this.f33777a++;
                    }
                    if (this.f33777a == i20) {
                        return Float.NaN;
                    }
                    if (z12) {
                        i13 -= i21;
                    } else {
                        i13 += i21;
                    }
                }
            }
            i18 = i12 + i13;
            if (i18 <= 39 || i18 < -44) {
                return Float.NaN;
            }
            float f11 = j10;
            if (j10 != 0) {
                if (i13 > 0) {
                    f10 = b[i13];
                } else if (i13 < 0) {
                    if (i13 < -38) {
                        f11 = (float) (((double) f11) * 1.0E-20d);
                        i13 += 20;
                    }
                    f10 = f33776c[-i13];
                }
                f11 *= f10;
            }
            return z10 ? -f11 : f11;
        }
        z10 = false;
        this.f33777a++;
        int i25 = this.f33777a;
        long j11 = 0;
        i12 = 0;
        i13 = 0;
        i14 = 0;
        z11 = false;
        i15 = 0;
        while (true) {
            i16 = this.f33777a;
            if (i16 >= i11) {
                break;
                break;
            }
            cCharAt4 = str.charAt(i16);
            if (cCharAt4 != '0') {
                if (cCharAt4 < '1') {
                }
                if (cCharAt4 != '.') {
                    break;
                }
                break;
                break;
            }
            if (i12 == 0) {
                i14++;
            } else {
                i13++;
            }
            this.f33777a++;
        }
        if (!z11) {
        }
        if (i12 == 0) {
            if (i14 == 0) {
                return Float.NaN;
            }
            i12 = 1;
        }
        if (z11) {
            i13 = (i15 - i14) - i12;
        }
        i17 = this.f33777a;
        if (i17 < i11) {
            i19 = this.f33777a + 1;
            this.f33777a = i19;
            if (i19 == i11) {
                return Float.NaN;
            }
            cCharAt2 = str.charAt(i19);
            if (cCharAt2 != '+') {
                if (cCharAt2 != '-') {
                    switch (cCharAt2) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            z12 = false;
                            z13 = false;
                            break;
                        default:
                            this.f33777a--;
                            z13 = true;
                            z12 = false;
                            break;
                    }
                } else {
                    z12 = true;
                }
                if (!z13) {
                    i20 = this.f33777a;
                    i21 = 0;
                    while (true) {
                        i22 = this.f33777a;
                        if (i22 >= i11) {
                        }
                        i21 = (i21 * 10) + (cCharAt3 - '0');
                        this.f33777a++;
                    }
                    if (this.f33777a == i20) {
                        return Float.NaN;
                    }
                    if (z12) {
                        i13 -= i21;
                    } else {
                        i13 += i21;
                    }
                }
            } else {
                z12 = false;
            }
            this.f33777a++;
            z13 = false;
            if (!z13) {
                i20 = this.f33777a;
                i21 = 0;
                while (true) {
                    i22 = this.f33777a;
                    if (i22 >= i11) {
                    }
                    i21 = (i21 * 10) + (cCharAt3 - '0');
                    this.f33777a++;
                }
                if (this.f33777a == i20) {
                    return Float.NaN;
                }
                if (z12) {
                    i13 -= i21;
                } else {
                    i13 += i21;
                }
            }
        }
        i18 = i12 + i13;
        if (i18 <= 39) {
        }
        return Float.NaN;
    }
}
