package p268l9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import p242k9.C7491a;
import p242k9.C7491a.b;
import sb.C11264k;

/* JADX INFO: renamed from: l9.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8060o<A extends C7491a.b, L> {

    /* JADX INFO: renamed from: a */
    public final C8048k f30060a;

    /* JADX INFO: renamed from: b */
    public final Feature[] f30061b;

    /* JADX INFO: renamed from: c */
    public final boolean f30062c;

    /* JADX INFO: renamed from: d */
    public final int f30063d;

    public AbstractC8060o(@NonNull C8048k<L> c8048k, Feature[] featureArr, boolean z10, int i10) {
        this.f30060a = c8048k;
        this.f30061b = featureArr;
        this.f30062c = z10;
        this.f30063d = i10;
    }

    /* JADX INFO: renamed from: a */
    public void m33247a() {
        this.f30060a.m33228a();
    }

    /* JADX INFO: renamed from: b */
    public C8048k.a<L> m33248b() {
        return this.f30060a.m33229b();
    }

    /* JADX INFO: renamed from: c */
    public Feature[] m33249c() {
        return this.f30061b;
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo33250d(@NonNull A a10, @NonNull C11264k<Void> c11264k);

    /* JADX INFO: renamed from: e */
    public final int m33251e() {
        return this.f30063d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m33252f() {
        return this.f30062c;
    }
}
