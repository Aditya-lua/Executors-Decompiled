package ca;

import com.google.android.gms.fido.fido2.api.common.InterfaceC1930a;

/* JADX INFO: renamed from: ca.b */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1581b implements InterfaceC1930a {
    RS256(-257),
    RS384(-258),
    RS512(-259),
    LEGACY_RS1(-262),
    PS256(-37),
    PS384(-38),
    PS512(-39),
    RS1(-65535);


    /* JADX INFO: renamed from: a */
    public final int f6299a;

    EnumC1581b(int i10) {
        this.f6299a = i10;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.InterfaceC1930a
    /* JADX INFO: renamed from: a */
    public int mo8185a() {
        return this.f6299a;
    }
}
