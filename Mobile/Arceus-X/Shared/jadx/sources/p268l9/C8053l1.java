package p268l9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import sb.C11264k;

/* JADX INFO: renamed from: l9.l1 */
/* JADX INFO: loaded from: classes.dex */
public final class C8053l1 extends AbstractC8044i1 {

    /* JADX INFO: renamed from: c */
    public final C8085w0 f30047c;

    public C8053l1(C8085w0 c8085w0, C11264k c11264k) {
        super(3, c11264k);
        this.f30047c = c8085w0;
    }

    @Override // p268l9.AbstractC8062o1
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo33232d(@NonNull C8093z c8093z, boolean z10) {
    }

    @Override // p268l9.AbstractC8070r0
    /* JADX INFO: renamed from: f */
    public final boolean mo33238f(C8046j0 c8046j0) {
        return this.f30047c.f30115a.m33252f();
    }

    @Override // p268l9.AbstractC8070r0
    /* JADX INFO: renamed from: g */
    public final Feature[] mo33239g(C8046j0 c8046j0) {
        return this.f30047c.f30115a.m33249c();
    }

    @Override // p268l9.AbstractC8044i1
    /* JADX INFO: renamed from: h */
    public final void mo33187h(C8046j0 c8046j0) {
        this.f30047c.f30115a.mo33250d(c8046j0.m33226t(), this.f30025b);
        C8048k.a aVarM33248b = this.f30047c.f30115a.m33248b();
        if (aVarM33248b != null) {
            c8046j0.m33227v().put(aVarM33248b, this.f30047c);
        }
    }
}
