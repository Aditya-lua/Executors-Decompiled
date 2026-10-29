package us;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vs.c f32590a;
    public final ys.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final at.a f32591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f32592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zs.a f32593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ys.d f32594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f32595g;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public vs.c f32596a;
        public ys.a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public at.a f32597c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c f32598d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public zs.a f32599e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ys.d f32600f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public k f32601g;

        @NonNull
        public g h(@NonNull vs.c cVar, @NonNull k kVar) {
            this.f32596a = cVar;
            this.f32601g = kVar;
            if (this.b == null) {
                this.b = ys.a.a();
            }
            if (this.f32597c == null) {
                this.f32597c = new at.b();
            }
            if (this.f32598d == null) {
                this.f32598d = new d();
            }
            if (this.f32599e == null) {
                this.f32599e = zs.a.a();
            }
            if (this.f32600f == null) {
                this.f32600f = new ys.e();
            }
            return new g(this);
        }
    }

    @NonNull
    public zs.a a() {
        return this.f32593e;
    }

    @NonNull
    public c b() {
        return this.f32592d;
    }

    @NonNull
    public k c() {
        return this.f32595g;
    }

    @NonNull
    public at.a d() {
        return this.f32591c;
    }

    @NonNull
    public vs.c e() {
        return this.f32590a;
    }

    public g(@NonNull a aVar) {
        this.f32590a = aVar.f32596a;
        this.b = aVar.b;
        this.f32591c = aVar.f32597c;
        this.f32592d = aVar.f32598d;
        this.f32593e = aVar.f32599e;
        this.f32594f = aVar.f32600f;
        this.f32595g = aVar.f32601g;
    }
}
