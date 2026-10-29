package p306nb;

/* JADX INFO: renamed from: nb.l */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC9166l {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');


    /* JADX INFO: renamed from: a */
    public final char f33170a;

    EnumC9166l(char c10) {
        this.f33170a = c10;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC9166l m36465a(char c10) {
        for (EnumC9166l enumC9166l : values()) {
            if (enumC9166l.f33170a == c10) {
                return enumC9166l;
            }
        }
        return UNSET;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ char m36466b() {
        return this.f33170a;
    }
}
