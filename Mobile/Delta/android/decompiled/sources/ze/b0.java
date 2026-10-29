package ze;

/* JADX INFO: loaded from: classes2.dex */
public enum b0 implements com.google.crypto.tink.shaded.protobuf.a0.c {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final com.google.crypto.tink.shaded.protobuf.a0.d<b0> f37532i = new com.google.crypto.tink.shaded.protobuf.a0.d<b0>() { // from class: ze.b0.a
        @Override // com.google.crypto.tink.shaded.protobuf.a0.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b0 a(int i10) {
            return b0.a(i10);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37534a;

    b0(int i10) {
        this.f37534a = i10;
    }

    public static b0 a(int i10) {
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

    @Override // com.google.crypto.tink.shaded.protobuf.a0.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f37534a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
