package l9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import k9.a.b;

/* JADX INFO: loaded from: classes.dex */
public class p<A extends k9.a.b, L> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final o<A, L> f23064a;

    @NonNull
    public final w b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Runnable f23065c;

    public static class a<A extends k9.a.b, L> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public q f23066a;
        public q b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public k f23068d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Feature[] f23069e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f23071g;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Runnable f23067c = new Runnable() { // from class: l9.x0
            @Override // java.lang.Runnable
            public final void run() {
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f23070f = true;

        public /* synthetic */ a(a1 a1Var) {
        }

        @NonNull
        public p<A, L> a() {
            n9.m.b(this.f23066a != null, "Must set register function");
            n9.m.b(this.b != null, "Must set unregister function");
            n9.m.b(this.f23068d != null, "Must set holder");
            return new p<>(new y0(this, this.f23068d, this.f23069e, this.f23070f, this.f23071g), new z0(this, (k.a) n9.m.m(this.f23068d.b(), "Key must not be null")), this.f23067c, null);
        }

        @NonNull
        public a<A, L> b(@NonNull q<A, sb.k<Void>> qVar) {
            this.f23066a = qVar;
            return this;
        }

        @NonNull
        public a<A, L> c(boolean z10) {
            this.f23070f = z10;
            return this;
        }

        @NonNull
        public a<A, L> d(@NonNull Feature... featureArr) {
            this.f23069e = featureArr;
            return this;
        }

        @NonNull
        public a<A, L> e(int i10) {
            this.f23071g = i10;
            return this;
        }

        @NonNull
        public a<A, L> f(@NonNull q<A, sb.k<Boolean>> qVar) {
            this.b = qVar;
            return this;
        }

        @NonNull
        public a<A, L> g(@NonNull k<L> kVar) {
            this.f23068d = kVar;
            return this;
        }
    }

    public /* synthetic */ p(o oVar, w wVar, Runnable runnable, b1 b1Var) {
        this.f23064a = oVar;
        this.b = wVar;
        this.f23065c = runnable;
    }

    @NonNull
    public static <A extends k9.a.b, L> a<A, L> a() {
        return new a<>(null);
    }
}
