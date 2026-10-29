package ze;

/* JADX INFO: loaded from: classes2.dex */
public enum v implements com.google.crypto.tink.shaded.protobuf.a0.c {
    UNKNOWN_ENCODING(0),
    IEEE_P1363(1),
    DER(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final com.google.crypto.tink.shaded.protobuf.a0.d<v> f37600f = new com.google.crypto.tink.shaded.protobuf.a0.d<v>() { // from class: ze.v.a
        @Override // com.google.crypto.tink.shaded.protobuf.a0.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public v a(int i10) {
            return v.a(i10);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37602a;

    v(int i10) {
        this.f37602a = i10;
    }

    public static v a(int i10) {
        if (i10 == 0) {
            return UNKNOWN_ENCODING;
        }
        if (i10 == 1) {
            return IEEE_P1363;
        }
        if (i10 != 2) {
            return null;
        }
        return DER;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f37602a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
