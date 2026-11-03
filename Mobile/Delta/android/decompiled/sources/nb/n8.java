package nb;

/* JADX INFO: loaded from: classes.dex */
public enum n8 {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26615a;

    n8(String str) {
        this.f26615a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f26615a;
    }
}
