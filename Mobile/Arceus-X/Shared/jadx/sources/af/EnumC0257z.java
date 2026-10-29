package af;

import com.google.crypto.tink.shaded.protobuf.C2900a0;

/* JADX INFO: renamed from: af.z */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0257z implements C2900a0.c {
    UNKNOWN_CURVE(0),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    CURVE25519(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: h */
    public static final C2900a0.d<EnumC0257z> f720h = new C2900a0.d<EnumC0257z>() { // from class: af.z.a
        /* JADX DEBUG: Method merged with bridge method: a(I)Lcom/google/crypto/tink/shaded/protobuf/a0$c; */
        @Override // com.google.crypto.tink.shaded.protobuf.C2900a0.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EnumC0257z mo612a(int i10) {
            return EnumC0257z.m1192a(i10);
        }
    };

    /* JADX INFO: renamed from: a */
    public final int f722a;

    EnumC0257z(int i10) {
        this.f722a = i10;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC0257z m1192a(int i10) {
        if (i10 == 0) {
            return UNKNOWN_CURVE;
        }
        if (i10 == 2) {
            return NIST_P256;
        }
        if (i10 == 3) {
            return NIST_P384;
        }
        if (i10 == 4) {
            return NIST_P521;
        }
        if (i10 != 5) {
            return null;
        }
        return CURVE25519;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C2900a0.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f722a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
