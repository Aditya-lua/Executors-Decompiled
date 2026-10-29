package nb;

/* JADX INFO: loaded from: classes.dex */
public enum n8 {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25794a;

    n8(String str) {
        this.f25794a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f25794a;
    }
}
