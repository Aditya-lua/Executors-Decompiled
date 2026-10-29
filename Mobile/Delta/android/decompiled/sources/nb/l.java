package nb;

/* JADX INFO: loaded from: classes.dex */
public enum l {
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
    public final char f25717a;

    l(char c10) {
        this.f25717a = c10;
    }

    public static l a(char c10) {
        for (l lVar : values()) {
            if (lVar.f25717a == c10) {
                return lVar;
            }
        }
        return UNSET;
    }

    public final /* synthetic */ char b() {
        return this.f25717a;
    }
}
