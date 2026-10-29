package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public final class e1 implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f8431a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f8432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8433d;

    public e1(s0 s0Var, String str, Object[] objArr) {
        this.f8431a = s0Var;
        this.b = str;
        this.f8432c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f8433d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f8433d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public boolean a() {
        return (this.f8433d & 2) == 2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public s0 b() {
        return this.f8431a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public b1 c() {
        int i10 = this.f8433d;
        if ((i10 & 1) != 0) {
            return b1.PROTO2;
        }
        return (i10 & 4) == 4 ? b1.EDITIONS : b1.PROTO3;
    }

    public Object[] d() {
        return this.f8432c;
    }

    public String e() {
        return this.b;
    }
}
