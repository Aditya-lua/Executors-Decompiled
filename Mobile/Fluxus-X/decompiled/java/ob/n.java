package ob;

/* JADX INFO: loaded from: classes.dex */
public enum n {
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


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f27604a;

    n(char c10) {
        this.f27604a = c10;
    }

    public static n a(char c10) {
        for (n nVar : values()) {
            if (nVar.f27604a == c10) {
                return nVar;
            }
        }
        return UNSET;
    }

    public final /* synthetic */ char b() {
        return this.f27604a;
    }
}
