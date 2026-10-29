package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.e1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2913e1 implements InterfaceC2948q0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2954s0 f10846a;

    /* JADX INFO: renamed from: b */
    public final String f10847b;

    /* JADX INFO: renamed from: c */
    public final Object[] f10848c;

    /* JADX INFO: renamed from: d */
    public final int f10849d;

    public C2913e1(InterfaceC2954s0 interfaceC2954s0, String str, Object[] objArr) {
        this.f10846a = interfaceC2954s0;
        this.f10847b = str;
        this.f10848c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f10849d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f10849d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2948q0
    /* JADX INFO: renamed from: a */
    public boolean mo13475a() {
        return (this.f10849d & 2) == 2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2948q0
    /* JADX INFO: renamed from: b */
    public InterfaceC2954s0 mo13476b() {
        return this.f10846a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2948q0
    /* JADX INFO: renamed from: c */
    public EnumC2904b1 mo13477c() {
        int i10 = this.f10849d;
        if ((i10 & 1) != 0) {
            return EnumC2904b1.PROTO2;
        }
        return (i10 & 4) == 4 ? EnumC2904b1.EDITIONS : EnumC2904b1.PROTO3;
    }

    /* JADX INFO: renamed from: d */
    public Object[] m13478d() {
        return this.f10848c;
    }

    /* JADX INFO: renamed from: e */
    public String m13479e() {
        return this.f10847b;
    }
}
