package sd;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class a1 extends c.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30618a;
    public final Set b;

    public /* synthetic */ a1(String str, Set set, z0 z0Var) {
        this.f30618a = str;
        this.b = set;
    }

    @Override // sd.c.d
    public final String b() {
        return this.f30618a;
    }

    @Override // sd.c.d
    public final Set<Integer> c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c.d) {
            c.d dVar = (c.d) obj;
            String str = this.f30618a;
            if (str != null ? str.equals(dVar.b()) : dVar.b() == null) {
                if (this.b.equals(dVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f30618a;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "StandardIntegrityTokenRequest{requestHash=" + this.f30618a + ", verdictOptOut=" + this.b.toString() + "}";
    }
}
