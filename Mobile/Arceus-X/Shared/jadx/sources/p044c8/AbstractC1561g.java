package p044c8;

/* JADX INFO: renamed from: c8.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1561g {

    /* JADX INFO: renamed from: c8.g$a */
    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC1561g m8161a() {
        return new C1556b(a.FATAL_ERROR, -1L);
    }

    /* JADX INFO: renamed from: d */
    public static AbstractC1561g m8162d() {
        return new C1556b(a.INVALID_PAYLOAD, -1L);
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC1561g m8163e(long j10) {
        return new C1556b(a.OK, j10);
    }

    /* JADX INFO: renamed from: f */
    public static AbstractC1561g m8164f() {
        return new C1556b(a.TRANSIENT_ERROR, -1L);
    }

    /* JADX INFO: renamed from: b */
    public abstract long mo8153b();

    /* JADX INFO: renamed from: c */
    public abstract a mo8154c();
}
