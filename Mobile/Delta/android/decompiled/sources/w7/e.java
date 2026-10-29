package w7;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f33778c = new e(null, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f33779d = new e(a.none, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f33780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f33781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f33782g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f33783h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f33784i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e f33785j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e f33786k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f33787a;
    public b b;

    public enum a {
        none,
        xMinYMin,
        xMidYMin,
        xMaxYMin,
        xMinYMid,
        xMidYMid,
        xMaxYMid,
        xMinYMax,
        xMidYMax,
        xMaxYMax
    }

    public enum b {
        meet,
        slice
    }

    static {
        a aVar = a.xMidYMid;
        b bVar = b.meet;
        f33780e = new e(aVar, bVar);
        a aVar2 = a.xMinYMin;
        f33781f = new e(aVar2, bVar);
        f33782g = new e(a.xMaxYMax, bVar);
        f33783h = new e(a.xMidYMin, bVar);
        f33784i = new e(a.xMidYMax, bVar);
        b bVar2 = b.slice;
        f33785j = new e(aVar, bVar2);
        f33786k = new e(aVar2, bVar2);
    }

    public e(a aVar, b bVar) {
        this.f33787a = aVar;
        this.b = bVar;
    }

    public a a() {
        return this.f33787a;
    }

    public b b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f33787a == eVar.f33787a && this.b == eVar.b;
    }

    public String toString() {
        return this.f33787a + " " + this.b;
    }
}
