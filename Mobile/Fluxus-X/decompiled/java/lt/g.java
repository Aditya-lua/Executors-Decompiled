package lt;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mt.c f22514a;
    public final pt.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rt.a f22515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f22516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qt.a f22517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final pt.d f22518f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f22519g;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public mt.c f22520a;
        public pt.a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public rt.a f22521c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c f22522d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public qt.a f22523e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public pt.d f22524f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public k f22525g;

        @NonNull
        public g h(@NonNull mt.c cVar, @NonNull k kVar) {
            this.f22520a = cVar;
            this.f22525g = kVar;
            if (this.b == null) {
                this.b = pt.a.a();
            }
            if (this.f22521c == null) {
                this.f22521c = new rt.b();
            }
            if (this.f22522d == null) {
                this.f22522d = new d();
            }
            if (this.f22523e == null) {
                this.f22523e = qt.a.a();
            }
            if (this.f22524f == null) {
                this.f22524f = new pt.e();
            }
            return new g(this);
        }
    }

    @NonNull
    public qt.a a() {
        return this.f22517e;
    }

    @NonNull
    public c b() {
        return this.f22516d;
    }

    @NonNull
    public k c() {
        return this.f22519g;
    }

    @NonNull
    public rt.a d() {
        return this.f22515c;
    }

    @NonNull
    public mt.c e() {
        return this.f22514a;
    }

    public g(@NonNull a aVar) {
        this.f22514a = aVar.f22520a;
        this.b = aVar.b;
        this.f22515c = aVar.f22521c;
        this.f22516d = aVar.f22522d;
        this.f22517e = aVar.f22523e;
        this.f22518f = aVar.f22524f;
        this.f22519g = aVar.f22525g;
    }
}
