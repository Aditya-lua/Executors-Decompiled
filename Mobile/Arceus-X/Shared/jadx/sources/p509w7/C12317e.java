package p509w7;

/* JADX INFO: renamed from: w7.e */
/* JADX INFO: loaded from: classes.dex */
public class C12317e {

    /* JADX INFO: renamed from: c */
    public static final C12317e f43715c = new C12317e(null, null);

    /* JADX INFO: renamed from: d */
    public static final C12317e f43716d = new C12317e(a.none, null);

    /* JADX INFO: renamed from: e */
    public static final C12317e f43717e;

    /* JADX INFO: renamed from: f */
    public static final C12317e f43718f;

    /* JADX INFO: renamed from: g */
    public static final C12317e f43719g;

    /* JADX INFO: renamed from: h */
    public static final C12317e f43720h;

    /* JADX INFO: renamed from: i */
    public static final C12317e f43721i;

    /* JADX INFO: renamed from: j */
    public static final C12317e f43722j;

    /* JADX INFO: renamed from: k */
    public static final C12317e f43723k;

    /* JADX INFO: renamed from: a */
    public a f43724a;

    /* JADX INFO: renamed from: b */
    public b f43725b;

    /* JADX INFO: renamed from: w7.e$a */
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

    /* JADX INFO: renamed from: w7.e$b */
    public enum b {
        meet,
        slice
    }

    static {
        a aVar = a.xMidYMid;
        b bVar = b.meet;
        f43717e = new C12317e(aVar, bVar);
        a aVar2 = a.xMinYMin;
        f43718f = new C12317e(aVar2, bVar);
        f43719g = new C12317e(a.xMaxYMax, bVar);
        f43720h = new C12317e(a.xMidYMin, bVar);
        f43721i = new C12317e(a.xMidYMax, bVar);
        b bVar2 = b.slice;
        f43722j = new C12317e(aVar, bVar2);
        f43723k = new C12317e(aVar2, bVar2);
    }

    public C12317e(a aVar, b bVar) {
        this.f43724a = aVar;
        this.f43725b = bVar;
    }

    /* JADX INFO: renamed from: a */
    public a m45830a() {
        return this.f43724a;
    }

    /* JADX INFO: renamed from: b */
    public b m45831b() {
        return this.f43725b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C12317e c12317e = (C12317e) obj;
        return this.f43724a == c12317e.f43724a && this.f43725b == c12317e.f43725b;
    }

    public String toString() {
        return this.f43724a + " " + this.f43725b;
    }
}
