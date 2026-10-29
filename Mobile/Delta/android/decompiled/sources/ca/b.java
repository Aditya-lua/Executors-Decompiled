package ca;

/* JADX INFO: loaded from: classes.dex */
public enum b implements com.google.android.gms.fido.fido2.api.common.a {
    RS256(-257),
    RS384(-258),
    RS512(-259),
    LEGACY_RS1(-262),
    PS256(-37),
    PS384(-38),
    PS512(-39),
    RS1(-65535);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4688a;

    b(int i10) {
        this.f4688a = i10;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.a
    public int a() {
        return this.f4688a;
    }
}
