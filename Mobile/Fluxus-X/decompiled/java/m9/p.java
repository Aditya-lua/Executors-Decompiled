package m9;

import androidx.annotation.NonNull;
import l9.a.b;

/* JADX INFO: loaded from: classes.dex */
public class p<A extends l9.a.b, L> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final o<A, L> f23049a;

    @NonNull
    public final w b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Runnable f23050c;

    public static class a<A extends l9.a.b, L> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public q f23051a;
        public q b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public k f23053d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public k9.d[] f23054e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f23056g;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Runnable f23052c = new Runnable() { // from class: m9.x0
            @Override // java.lang.Runnable
            public final void run() {
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f23055f = true;

        public /* synthetic */ a(a1 a1Var) {
        }

        @NonNull
        public p<A, L> a() {
            o9.s.b(this.f23051a != null, "Must set register function");
            o9.s.b(this.b != null, "Must set unregister function");
            o9.s.b(this.f23053d != null, "Must set holder");
            return new p<>(new y0(this, this.f23053d, this.f23054e, this.f23055f, this.f23056g), new z0(this, (k.a) o9.s.m(this.f23053d.b(), "Key must not be null")), this.f23052c, null);
        }

        @NonNull
        public a<A, L> b(@NonNull q<A, tb.k<Void>> qVar) {
            this.f23051a = qVar;
            return this;
        }

        @NonNull
        public a<A, L> c(boolean z10) {
            this.f23055f = z10;
            return this;
        }

        @NonNull
        public a<A, L> d(@NonNull k9.d... dVarArr) {
            this.f23054e = dVarArr;
            return this;
        }

        @NonNull
        public a<A, L> e(int i10) {
            this.f23056g = i10;
            return this;
        }

        @NonNull
        public a<A, L> f(@NonNull q<A, tb.k<Boolean>> qVar) {
            this.b = qVar;
            return this;
        }

        @NonNull
        public a<A, L> g(@NonNull k<L> kVar) {
            this.f23053d = kVar;
            return this;
        }
    }

    public /* synthetic */ p(o oVar, w wVar, Runnable runnable, b1 b1Var) {
        this.f23049a = oVar;
        this.b = wVar;
        this.f23050c = runnable;
    }

    @NonNull
    public static <A extends l9.a.b, L> a<A, L> a() {
        return new a<>(null);
    }
}
