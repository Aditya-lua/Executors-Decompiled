package p268l9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import sb.C11264k;

/* JADX INFO: renamed from: l9.n1 */
/* JADX INFO: loaded from: classes.dex */
public final class C8059n1 extends AbstractC8044i1 {

    /* JADX INFO: renamed from: c */
    public final C8048k.a f30059c;

    public C8059n1(C8048k.a aVar, C11264k c11264k) {
        super(4, c11264k);
        this.f30059c = aVar;
    }

    @Override // p268l9.AbstractC8062o1
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo33232d(@NonNull C8093z c8093z, boolean z10) {
    }

    @Override // p268l9.AbstractC8070r0
    /* JADX INFO: renamed from: f */
    public final boolean mo33238f(C8046j0 c8046j0) {
        C8085w0 c8085w0 = (C8085w0) c8046j0.m33227v().get(this.f30059c);
        return c8085w0 != null && c8085w0.f30115a.m33252f();
    }

    @Override // p268l9.AbstractC8070r0
    /* JADX INFO: renamed from: g */
    public final Feature[] mo33239g(C8046j0 c8046j0) {
        C8085w0 c8085w0 = (C8085w0) c8046j0.m33227v().get(this.f30059c);
        if (c8085w0 == null) {
            return null;
        }
        return c8085w0.f30115a.m33249c();
    }

    @Override // p268l9.AbstractC8044i1
    /* JADX INFO: renamed from: h */
    public final void mo33187h(C8046j0 c8046j0) {
        C8085w0 c8085w0 = (C8085w0) c8046j0.m33227v().remove(this.f30059c);
        if (c8085w0 == null) {
            this.f30025b.m42330e(Boolean.FALSE);
            return;
        }
        c8085w0.f30116b.mo33294b(c8046j0.m33226t(), this.f30025b);
        c8085w0.f30115a.m33247a();
    }
}
