package p009a8;

import android.util.SparseArray;

/* JADX INFO: renamed from: a8.p */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0098p {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: h */
    public static final SparseArray<EnumC0098p> f320h;

    /* JADX INFO: renamed from: a */
    public final int f322a;

    static {
        EnumC0098p enumC0098p = DEFAULT;
        EnumC0098p enumC0098p2 = UNMETERED_ONLY;
        EnumC0098p enumC0098p3 = UNMETERED_OR_DAILY;
        EnumC0098p enumC0098p4 = FAST_IF_RADIO_AWAKE;
        EnumC0098p enumC0098p5 = NEVER;
        EnumC0098p enumC0098p6 = UNRECOGNIZED;
        SparseArray<EnumC0098p> sparseArray = new SparseArray<>();
        f320h = sparseArray;
        sparseArray.put(0, enumC0098p);
        sparseArray.put(1, enumC0098p2);
        sparseArray.put(2, enumC0098p3);
        sparseArray.put(3, enumC0098p4);
        sparseArray.put(4, enumC0098p5);
        sparseArray.put(-1, enumC0098p6);
    }

    EnumC0098p(int i10) {
        this.f322a = i10;
    }
}
