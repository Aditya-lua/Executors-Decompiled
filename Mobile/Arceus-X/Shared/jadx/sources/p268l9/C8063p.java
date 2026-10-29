package p268l9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import p242k9.C7491a;
import p242k9.C7491a.b;
import p305n9.C8953m;
import sb.C11264k;

/* JADX INFO: renamed from: l9.p */
/* JADX INFO: loaded from: classes.dex */
public class C8063p<A extends C7491a.b, L> {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final AbstractC8060o<A, L> f30066a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AbstractC8084w f30067b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Runnable f30068c;

    /* JADX INFO: renamed from: l9.p$a */
    public static class a<A extends C7491a.b, L> {

        /* JADX INFO: renamed from: a */
        public InterfaceC8066q f30069a;

        /* JADX INFO: renamed from: b */
        public InterfaceC8066q f30070b;

        /* JADX INFO: renamed from: d */
        public C8048k f30072d;

        /* JADX INFO: renamed from: e */
        public Feature[] f30073e;

        /* JADX INFO: renamed from: g */
        public int f30075g;

        /* JADX INFO: renamed from: c */
        public Runnable f30071c = new Runnable() { // from class: l9.x0
            @Override // java.lang.Runnable
            public final void run() {
            }
        };

        /* JADX INFO: renamed from: f */
        public boolean f30074f = true;

        public /* synthetic */ a(C8019a1 c8019a1) {
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public C8063p<A, L> m33257a() {
            C8953m.m36037b(this.f30069a != null, "Must set register function");
            C8953m.m36037b(this.f30070b != null, "Must set unregister function");
            C8953m.m36037b(this.f30072d != null, "Must set holder");
            return new C8063p<>(new C8091y0(this, this.f30072d, this.f30073e, this.f30074f, this.f30075g), new C8094z0(this, (C8048k.a) C8953m.m36048m(this.f30072d.m33229b(), "Key must not be null")), this.f30071c, null);
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public a<A, L> m33258b(@NonNull InterfaceC8066q<A, C11264k<Void>> interfaceC8066q) {
            this.f30069a = interfaceC8066q;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public a<A, L> m33259c(boolean z10) {
            this.f30074f = z10;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public a<A, L> m33260d(@NonNull Feature... featureArr) {
            this.f30073e = featureArr;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: e */
        public a<A, L> m33261e(int i10) {
            this.f30075g = i10;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: f */
        public a<A, L> m33262f(@NonNull InterfaceC8066q<A, C11264k<Boolean>> interfaceC8066q) {
            this.f30070b = interfaceC8066q;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: g */
        public a<A, L> m33263g(@NonNull C8048k<L> c8048k) {
            this.f30072d = c8048k;
            return this;
        }
    }

    public /* synthetic */ C8063p(AbstractC8060o abstractC8060o, AbstractC8084w abstractC8084w, Runnable runnable, C8023b1 c8023b1) {
        this.f30066a = abstractC8060o;
        this.f30067b = abstractC8084w;
        this.f30068c = runnable;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static <A extends C7491a.b, L> a<A, L> m33254a() {
        return new a<>(null);
    }
}
