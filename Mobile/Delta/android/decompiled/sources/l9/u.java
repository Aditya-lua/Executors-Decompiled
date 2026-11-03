package l9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import k9.a.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class u<A extends k9.a.b, ResultT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Feature[] f23482a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23483c;

    public static class a<A extends k9.a.b, ResultT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public q f23484a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Feature[] f23485c;
        public boolean b = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f23486d = 0;

        public /* synthetic */ a(h1 h1Var) {
        }

        @NonNull
        public u<A, ResultT> a() {
            n9.m.b(this.f23484a != null, "execute parameter required");
            return new g1(this, this.f23485c, this.b, this.f23486d);
        }

        @NonNull
        public a<A, ResultT> b(@NonNull q<A, sb.k<ResultT>> qVar) {
            this.f23484a = qVar;
            return this;
        }

        @NonNull
        public a<A, ResultT> c(boolean z10) {
            this.b = z10;
            return this;
        }

        @NonNull
        public a<A, ResultT> d(@NonNull Feature... featureArr) {
            this.f23485c = featureArr;
            return this;
        }

        @NonNull
        public a<A, ResultT> e(int i10) {
            this.f23486d = i10;
            return this;
        }
    }

    public u(Feature[] featureArr, boolean z10, int i10) {
        this.f23482a = featureArr;
        boolean z11 = false;
        if (featureArr != null && z10) {
            z11 = true;
        }
        this.b = z11;
        this.f23483c = i10;
    }

    @NonNull
    public static <A extends k9.a.b, ResultT> a<A, ResultT> c() {
        return new a<>(null);
    }

    public abstract void d(@NonNull A a10, @NonNull sb.k<ResultT> kVar);

    public boolean e() {
        return this.b;
    }

    public final int f() {
        return this.f23483c;
    }

    public final Feature[] g() {
        return this.f23482a;
    }
}
