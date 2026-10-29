package pg;

/* JADX INFO: loaded from: classes3.dex */
public enum b {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f28601a;
    public final int b;

    b(int[] iArr, int i10) {
        this.f28601a = iArr;
        this.b = i10;
    }

    public int a() {
        return this.b;
    }

    public int b(c cVar) {
        char c10;
        int iF = cVar.f();
        if (iF <= 9) {
            c10 = 0;
        } else {
            c10 = iF <= 26 ? (char) 1 : (char) 2;
        }
        return this.f28601a[c10];
    }
}
