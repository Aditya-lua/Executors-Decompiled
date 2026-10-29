package p020b0;

import java.util.Objects;

/* JADX INFO: renamed from: b0.n */
/* JADX INFO: loaded from: classes.dex */
public class C1188n implements C1183i.a {

    /* JADX INFO: renamed from: a */
    public final Object f4934a;

    public C1188n(Object obj) {
        this.f4934a = obj;
    }

    @Override // p020b0.C1183i.a
    /* JADX INFO: renamed from: a */
    public void mo6566a(long j10) {
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1188n) {
            return Objects.equals(this.f4934a, ((C1188n) obj).f4934a);
        }
        return false;
    }

    @Override // p020b0.C1183i.a
    /* JADX INFO: renamed from: g */
    public void mo6572g(int i10) {
    }

    public int hashCode() {
        return this.f4934a.hashCode();
    }
}
