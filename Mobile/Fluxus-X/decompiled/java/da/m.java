package da;

/* JADX INFO: loaded from: classes.dex */
public enum m implements a {
    ED256(-260),
    ED512(-261),
    ED25519(-8),
    ES256(-7),
    ECDH_HKDF_256(-25),
    ES384(-35),
    ES512(-36);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12066a;

    m(int i10) {
        this.f12066a = i10;
    }

    @Override // da.a
    public int a() {
        return this.f12066a;
    }
}
