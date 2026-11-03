package l9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import k9.a.b;

/* JADX INFO: loaded from: classes.dex */
public class p<A extends k9.a.b, L> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final o<A, L> f23458a;

    @NonNull
    public final w b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Runnable f23459c;

    public static class a<A extends k9.a.b, L> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public q f23460a;
        public q b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public k f23462d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Feature[] f23463e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f23465g;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Runnable f23461c = new Runnable() { // from class: l9.x0
            @Override // java.lang.Runnable
            public final void run() {
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f23464f = true;

        public /* synthetic */ a(a1 a1Var) {
        }

        @NonNull
        public p<A, L> a() {
            n9.m.b(this.f23460a != null, "Must set register function");
            n9.m.b(this.b != null, "Must set unregister function");
            n9.m.b(this.f23462d != null, "Must set holder");
            return new p<>(new y0(this, this.f23462d, this.f23463e, this.f23464f, this.f23465g), new z0(this, (k.a) n9.m.m(this.f23462d.b(), "Key must not be null")), this.f23461c, null);
        }

        @NonNull
        public a<A, L> b(@NonNull q<A, sb.k<Void>> qVar) {
            this.f23460a = qVar;
            return this;
        }

        @NonNull
        public a<A, L> c(boolean z10) {
            this.f23464f = z10;
            return this;
        }

        @NonNull
        public a<A, L> d(@NonNull Feature... featureArr) {
            this.f23463e = featureArr;
            return this;
        }

        @NonNull
        public a<A, L> e(int i10) {
            this.f23465g = i10;
            return this;
        }

        @NonNull
        public a<A, L> f(@NonNull q<A, sb.k<Boolean>> qVar) {
            this.b = qVar;
            return this;
        }

        @NonNull
        public a<A, L> g(@NonNull k<L> kVar) {
            this.f23462d = kVar;
            return this;
        }
    }

    public /* synthetic */ p(o oVar, w wVar, Runnable runnable, b1 b1Var) {
        this.f23458a = oVar;
        this.b = wVar;
        this.f23459c = runnable;
    }

    @NonNull
    public static <A extends k9.a.b, L> a<A, L> a() {
        return new a<>(null);
    }
}
