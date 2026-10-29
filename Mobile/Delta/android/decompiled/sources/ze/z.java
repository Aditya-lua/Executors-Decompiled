package ze;

/* JADX INFO: loaded from: classes2.dex */
public enum z implements com.google.crypto.tink.shaded.protobuf.a0.c {
    UNKNOWN_CURVE(0),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    CURVE25519(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.google.crypto.tink.shaded.protobuf.a0.d<z> f37615h = new com.google.crypto.tink.shaded.protobuf.a0.d<z>() { // from class: ze.z.a
        @Override // com.google.crypto.tink.shaded.protobuf.a0.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public z a(int i10) {
            return z.a(i10);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37617a;

    z(int i10) {
        this.f37617a = i10;
    }

    public static z a(int i10) {
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

    @Override // com.google.crypto.tink.shaded.protobuf.a0.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f37617a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
