package p268l9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import p242k9.C7491a;
import p242k9.C7491a.b;
import p305n9.C8953m;
import sb.C11264k;

/* JADX INFO: renamed from: l9.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8078u<A extends C7491a.b, ResultT> {

    /* JADX INFO: renamed from: a */
    public final Feature[] f30100a;

    /* JADX INFO: renamed from: b */
    public final boolean f30101b;

    /* JADX INFO: renamed from: c */
    public final int f30102c;

    /* JADX INFO: renamed from: l9.u$a */
    public static class a<A extends C7491a.b, ResultT> {

        /* JADX INFO: renamed from: a */
        public InterfaceC8066q f30103a;

        /* JADX INFO: renamed from: c */
        public Feature[] f30105c;

        /* JADX INFO: renamed from: b */
        public boolean f30104b = true;

        /* JADX INFO: renamed from: d */
        public int f30106d = 0;

        public /* synthetic */ a(C8041h1 c8041h1) {
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public AbstractC8078u<A, ResultT> m33285a() {
            C8953m.m36037b(this.f30103a != null, "execute parameter required");
            return new C8038g1(this, this.f30105c, this.f30104b, this.f30106d);
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public a<A, ResultT> m33286b(@NonNull InterfaceC8066q<A, C11264k<ResultT>> interfaceC8066q) {
            this.f30103a = interfaceC8066q;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public a<A, ResultT> m33287c(boolean z10) {
            this.f30104b = z10;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public a<A, ResultT> m33288d(@NonNull Feature... featureArr) {
            this.f30105c = featureArr;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: e */
        public a<A, ResultT> m33289e(int i10) {
            this.f30106d = i10;
            return this;
        }
    }

    public AbstractC8078u(Feature[] featureArr, boolean z10, int i10) {
        this.f30100a = featureArr;
        boolean z11 = false;
        if (featureArr != null && z10) {
            z11 = true;
        }
        this.f30101b = z11;
        this.f30102c = i10;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static <A extends C7491a.b, ResultT> a<A, ResultT> m33280c() {
        return new a<>(null);
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo33170d(@NonNull A a10, @NonNull C11264k<ResultT> c11264k);

    /* JADX INFO: renamed from: e */
    public boolean m33281e() {
        return this.f30101b;
    }

    /* JADX INFO: renamed from: f */
    public final int m33282f() {
        return this.f30102c;
    }

    /* JADX INFO: renamed from: g */
    public final Feature[] m33283g() {
        return this.f30100a;
    }
}
