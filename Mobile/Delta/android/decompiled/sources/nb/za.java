package nb;

/* JADX INFO: loaded from: classes.dex */
public enum za {
    GOOGLE_ANALYTICS(0),
    GOOGLE_SIGNAL(1),
    SGTM(2),
    SGTM_CLIENT(3),
    GOOGLE_SIGNAL_PENDING(4),
    UNKNOWN(99);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27051a;

    za(int i10) {
        this.f27051a = i10;
    }

    public static za a(int i10) {
        for (za zaVar : values()) {
            if (zaVar.f27051a == i10) {
                return zaVar;
            }
        }
        return UNKNOWN;
    }

    public final int zza() {
        return this.f27051a;
    }
}
