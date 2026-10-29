package ca;

/* JADX INFO: loaded from: classes.dex */
public enum a implements com.google.android.gms.fido.fido2.api.common.a {
    ED256(-260),
    ED512(-261),
    ED25519(-8),
    ES256(-7),
    ECDH_HKDF_256(-25),
    ES384(-35),
    ES512(-36);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4679a;

    a(int i10) {
        this.f4679a = i10;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.a
    public int a() {
        return this.f4679a;
    }
}
