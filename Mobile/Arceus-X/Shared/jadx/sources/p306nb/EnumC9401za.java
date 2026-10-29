package p306nb;

/* JADX INFO: renamed from: nb.za */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC9401za {
    GOOGLE_ANALYTICS(0),
    GOOGLE_SIGNAL(1),
    SGTM(2),
    SGTM_CLIENT(3),
    GOOGLE_SIGNAL_PENDING(4),
    UNKNOWN(99);


    /* JADX INFO: renamed from: a */
    public final int f33844a;

    EnumC9401za(int i10) {
        this.f33844a = i10;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC9401za m37094a(int i10) {
        for (EnumC9401za enumC9401za : values()) {
            if (enumC9401za.f33844a == i10) {
                return enumC9401za;
            }
        }
        return UNKNOWN;
    }

    public final int zza() {
        return this.f33844a;
    }
}
