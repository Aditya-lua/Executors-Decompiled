package p121f7;

/* JADX INFO: renamed from: f7.x0 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC5483x0 {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    /* JADX INFO: renamed from: b */
    public boolean m25127b(int i10, boolean z10, int i11) {
        int iOrdinal = ordinal();
        if (iOrdinal == 1) {
            return false;
        }
        if (iOrdinal != 2) {
            return (z10 && i10 < 28) || i11 > 4 || i10 <= 25;
        }
        return true;
    }
}
