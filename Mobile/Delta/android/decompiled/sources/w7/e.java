package w7;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f33984c = new e(null, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f33985d = new e(a.none, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f33986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f33987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f33988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f33989h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f33990i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e f33991j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e f33992k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f33993a;
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
        f33986e = new e(aVar, bVar);
        a aVar2 = a.xMinYMin;
        f33987f = new e(aVar2, bVar);
        f33988g = new e(a.xMaxYMax, bVar);
        f33989h = new e(a.xMidYMin, bVar);
        f33990i = new e(a.xMidYMax, bVar);
        b bVar2 = b.slice;
        f33991j = new e(aVar, bVar2);
        f33992k = new e(aVar2, bVar2);
    }

    public e(a aVar, b bVar) {
        this.f33993a = aVar;
        this.b = bVar;
    }

    public a a() {
        return this.f33993a;
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
        return this.f33993a == eVar.f33993a && this.b == eVar.b;
    }

    public String toString() {
        return this.f33993a + " " + this.b;
    }
}
