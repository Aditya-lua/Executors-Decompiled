package da;

/* JADX INFO: loaded from: classes.dex */
public enum x implements a {
    RS256(-257),
    RS384(-258),
    RS512(-259),
    LEGACY_RS1(-262),
    PS256(-37),
    PS384(-38),
    PS512(-39),
    RS1(-65535);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12156a;

    x(int i10) {
        this.f12156a = i10;
    }

    @Override // da.a
    public int a() {
        return this.f12156a;
    }
}
