package ss;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ts.c f31780a;
    public final ws.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ys.a f31781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f31782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xs.a f31783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ws.d f31784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f31785g;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ts.c f31786a;
        public ws.a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ys.a f31787c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c f31788d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public xs.a f31789e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ws.d f31790f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public k f31791g;

        @NonNull
        public g h(@NonNull ts.c cVar, @NonNull k kVar) {
            this.f31786a = cVar;
            this.f31791g = kVar;
            if (this.b == null) {
                this.b = ws.a.a();
            }
            if (this.f31787c == null) {
                this.f31787c = new ys.b();
            }
            if (this.f31788d == null) {
                this.f31788d = new d();
            }
            if (this.f31789e == null) {
                this.f31789e = xs.a.a();
            }
            if (this.f31790f == null) {
                this.f31790f = new ws.e();
            }
            return new g(this);
        }
    }

    @NonNull
    public xs.a a() {
        return this.f31783e;
    }

    @NonNull
    public c b() {
        return this.f31782d;
    }

    @NonNull
    public k c() {
        return this.f31785g;
    }

    @NonNull
    public ys.a d() {
        return this.f31781c;
    }

    @NonNull
    public ts.c e() {
        return this.f31780a;
    }

    public g(@NonNull a aVar) {
        this.f31780a = aVar.f31786a;
        this.b = aVar.b;
        this.f31781c = aVar.f31787c;
        this.f31782d = aVar.f31788d;
        this.f31783e = aVar.f31789e;
        this.f31784f = aVar.f31790f;
        this.f31785g = aVar.f31791g;
    }
}
