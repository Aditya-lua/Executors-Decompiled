package ob;

/* JADX INFO: loaded from: classes.dex */
public enum eb {
    GOOGLE_ANALYTICS(0),
    GOOGLE_SIGNAL(1),
    SGTM(2),
    SGTM_CLIENT(3),
    GOOGLE_SIGNAL_PENDING(4),
    UNKNOWN(99);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27305a;

    eb(int i10) {
        this.f27305a = i10;
    }

    public static eb a(int i10) {
        for (eb ebVar : values()) {
            if (ebVar.f27305a == i10) {
                return ebVar;
            }
        }
        return UNKNOWN;
    }

    public final int zza() {
        return this.f27305a;
    }
}
