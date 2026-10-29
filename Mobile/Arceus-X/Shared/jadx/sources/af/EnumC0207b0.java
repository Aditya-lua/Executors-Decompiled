package af;

import com.google.crypto.tink.shaded.protobuf.C2900a0;

/* JADX INFO: renamed from: af.b0 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0207b0 implements C2900a0.c {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: i */
    public static final C2900a0.d<EnumC0207b0> f620i = new C2900a0.d<EnumC0207b0>() { // from class: af.b0.a
        /* JADX DEBUG: Method merged with bridge method: a(I)Lcom/google/crypto/tink/shaded/protobuf/a0$c; */
        @Override // com.google.crypto.tink.shaded.protobuf.C2900a0.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EnumC0207b0 mo612a(int i10) {
            return EnumC0207b0.m611a(i10);
        }
    };

    /* JADX INFO: renamed from: a */
    public final int f622a;

    EnumC0207b0(int i10) {
        this.f622a = i10;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC0207b0 m611a(int i10) {
        if (i10 == 0) {
            return UNKNOWN_HASH;
        }
        if (i10 == 1) {
            return SHA1;
        }
        if (i10 == 2) {
            return SHA384;
        }
        if (i10 == 3) {
            return SHA256;
        }
        if (i10 == 4) {
            return SHA512;
        }
        if (i10 != 5) {
            return null;
        }
        return SHA224;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C2900a0.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f622a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
