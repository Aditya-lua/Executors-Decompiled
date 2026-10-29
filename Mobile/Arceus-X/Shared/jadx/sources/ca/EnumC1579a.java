package ca;

import com.google.android.gms.fido.fido2.api.common.InterfaceC1930a;

/* JADX INFO: renamed from: ca.a */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1579a implements InterfaceC1930a {
    ED256(-260),
    ED512(-261),
    ED25519(-8),
    ES256(-7),
    ECDH_HKDF_256(-25),
    ES384(-35),
    ES512(-36);


    /* JADX INFO: renamed from: a */
    public final int f6289a;

    EnumC1579a(int i10) {
        this.f6289a = i10;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.InterfaceC1930a
    /* JADX INFO: renamed from: a */
    public int mo8185a() {
        return this.f6289a;
    }
}
