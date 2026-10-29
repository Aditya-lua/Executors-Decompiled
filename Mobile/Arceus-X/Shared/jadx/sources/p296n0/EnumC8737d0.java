package p296n0;

/* JADX INFO: renamed from: n0.d0 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC8737d0 {
    UNKNOWN,
    NONE,
    READY,
    FIRED;

    /* JADX INFO: renamed from: b */
    public int m35035b() {
        int iOrdinal = ordinal();
        if (iOrdinal == 1) {
            return 2;
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? 0 : 1;
        }
        return 3;
    }
}
