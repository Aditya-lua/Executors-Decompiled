package f1;

/* JADX INFO: loaded from: classes.dex */
public abstract class f1 {
    public static f1 d(long j10, long j11, b bVar) {
        x2.g.b(j10 >= 0, "duration must be positive value.");
        x2.g.b(j11 >= 0, "bytes must be positive value.");
        return new l(j10, j11, bVar);
    }

    public abstract b a();

    public abstract long b();

    public abstract long c();
}
