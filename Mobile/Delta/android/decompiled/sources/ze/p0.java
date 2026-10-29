package ze;

/* JADX INFO: loaded from: classes2.dex */
public enum p0 implements com.google.crypto.tink.shaded.protobuf.a0.c {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.google.crypto.tink.shaded.protobuf.a0.d<p0> f37584h = new com.google.crypto.tink.shaded.protobuf.a0.d<p0>() { // from class: ze.p0.a
        @Override // com.google.crypto.tink.shaded.protobuf.a0.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p0 a(int i10) {
            return p0.a(i10);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37586a;

    p0(int i10) {
        this.f37586a = i10;
    }

    public static p0 a(int i10) {
        if (i10 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i10 == 1) {
            return TINK;
        }
        if (i10 == 2) {
            return LEGACY;
        }
        if (i10 == 3) {
            return RAW;
        }
        if (i10 != 4) {
            return null;
        }
        return CRUNCHY;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f37586a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
