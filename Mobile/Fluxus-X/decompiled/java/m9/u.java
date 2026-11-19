package m9;

import androidx.annotation.NonNull;
import l9.a.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class u<A extends l9.a.b, ResultT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k9.d[] f23073a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23074c;

    public static class a<A extends l9.a.b, ResultT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public q f23075a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public k9.d[] f23076c;
        public boolean b = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f23077d = 0;

        public /* synthetic */ a(h1 h1Var) {
        }

        @NonNull
        public u<A, ResultT> a() {
            o9.s.b(this.f23075a != null, "execute parameter required");
            return new g1(this, this.f23076c, this.b, this.f23077d);
        }

        @NonNull
        public a<A, ResultT> b(@NonNull q<A, tb.k<ResultT>> qVar) {
            this.f23075a = qVar;
            return this;
        }

        @NonNull
        public a<A, ResultT> c(boolean z10) {
            this.b = z10;
            return this;
        }

        @NonNull
        public a<A, ResultT> d(@NonNull k9.d... dVarArr) {
            this.f23076c = dVarArr;
            return this;
        }

        @NonNull
        public a<A, ResultT> e(int i10) {
            this.f23077d = i10;
            return this;
        }
    }

    public u(k9.d[] dVarArr, boolean z10, int i10) {
        this.f23073a = dVarArr;
        boolean z11 = false;
        if (dVarArr != null && z10) {
            z11 = true;
        }
        this.b = z11;
        this.f23074c = i10;
    }

    @NonNull
    public static <A extends l9.a.b, ResultT> a<A, ResultT> c() {
        return new a<>(null);
    }

    public abstract void d(@NonNull A a10, @NonNull tb.k<ResultT> kVar);

    public boolean e() {
        return this.b;
    }

    public final int f() {
        return this.f23074c;
    }

    public final k9.d[] g() {
        return this.f23073a;
    }
}
