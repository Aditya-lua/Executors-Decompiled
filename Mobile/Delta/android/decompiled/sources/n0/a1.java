package n0;

/* JADX INFO: loaded from: classes.dex */
public final class a1 implements n3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g0.c2 f24589d;

    public class a implements g0.c2 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f24590d;

        public a(long j10) {
            this.f24590d = j10;
        }

        @Override // g0.c2
        public long a() {
            return this.f24590d;
        }

        @Override // g0.c2
        public g0.c2.c e(g0.c2.b bVar) {
            return bVar.m() == 1 ? g0.c2.c.f17354d : g0.c2.c.f17355e;
        }
    }

    public static final class b implements n3 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final g0.c2 f24592d;

        public b(long j10) {
            this.f24592d = new a1(j10);
        }

        @Override // g0.c2
        public long a() {
            return this.f24592d.a();
        }

        @Override // n0.n3
        public g0.c2 b(long j10) {
            return new b(j10);
        }

        @Override // g0.c2
        public g0.c2.c e(g0.c2.b bVar) {
            if (this.f24592d.e(bVar).d()) {
                return g0.c2.c.f17355e;
            }
            Throwable thN = bVar.n();
            if (thN instanceof j1.b) {
                g0.r1.c("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                if (((j1.b) thN).a() > 0) {
                    return g0.c2.c.f17357g;
                }
            }
            return g0.c2.c.f17354d;
        }
    }

    public a1(long j10) {
        this.f24589d = new b4(j10, new a(j10));
    }

    @Override // g0.c2
    public long a() {
        return this.f24589d.a();
    }

    @Override // n0.n3
    public g0.c2 b(long j10) {
        return new a1(j10);
    }

    @Override // g0.c2
    public g0.c2.c e(g0.c2.b bVar) {
        return this.f24589d.e(bVar);
    }
}
