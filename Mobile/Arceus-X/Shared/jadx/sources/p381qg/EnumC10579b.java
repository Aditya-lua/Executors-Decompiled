package p381qg;

/* JADX INFO: renamed from: qg.b */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC10579b {
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


    /* JADX INFO: renamed from: a */
    public final int[] f37959a;

    /* JADX INFO: renamed from: b */
    public final int f37960b;

    EnumC10579b(int[] iArr, int i10) {
        this.f37959a = iArr;
        this.f37960b = i10;
    }

    /* JADX INFO: renamed from: a */
    public int m40550a() {
        return this.f37960b;
    }

    /* JADX INFO: renamed from: b */
    public int m40551b(C10580c c10580c) {
        char c10;
        int iM40557f = c10580c.m40557f();
        if (iM40557f <= 9) {
            c10 = 0;
        } else {
            c10 = iM40557f <= 26 ? (char) 1 : (char) 2;
        }
        return this.f37959a[c10];
    }
}
