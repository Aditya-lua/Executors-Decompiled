package n0;

/* JADX INFO: loaded from: classes.dex */
public enum d0 {
    UNKNOWN,
    NONE,
    READY,
    FIRED;

    public int b() {
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
