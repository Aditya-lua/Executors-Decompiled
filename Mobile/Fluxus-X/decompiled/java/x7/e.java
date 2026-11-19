package x7;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f36268c = new e(null, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f36269d = new e(a.none, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f36270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f36271f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f36272g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f36273h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f36274i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e f36275j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e f36276k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f36277a;
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
        f36270e = new e(aVar, bVar);
        a aVar2 = a.xMinYMin;
        f36271f = new e(aVar2, bVar);
        f36272g = new e(a.xMaxYMax, bVar);
        f36273h = new e(a.xMidYMin, bVar);
        f36274i = new e(a.xMidYMax, bVar);
        b bVar2 = b.slice;
        f36275j = new e(aVar, bVar2);
        f36276k = new e(aVar2, bVar2);
    }

    public e(a aVar, b bVar) {
        this.f36277a = aVar;
        this.b = bVar;
    }

    public a a() {
        return this.f36277a;
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
        return this.f36277a == eVar.f36277a && this.b == eVar.b;
    }

    public String toString() {
        return this.f36277a + " " + this.b;
    }
}
