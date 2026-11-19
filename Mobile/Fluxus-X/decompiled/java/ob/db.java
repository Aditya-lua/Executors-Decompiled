package ob;

/* JADX INFO: loaded from: classes.dex */
public enum db {
    UNKNOWN(0),
    SUCCESS(1),
    FAILURE(2),
    BACKOFF(3);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27197a;

    db(int i10) {
        this.f27197a = i10;
    }

    public final int zza() {
        return this.f27197a;
    }
}
