package ob;

/* JADX INFO: loaded from: classes.dex */
public enum s8 {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27795a;

    s8(String str) {
        this.f27795a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f27795a;
    }
}
