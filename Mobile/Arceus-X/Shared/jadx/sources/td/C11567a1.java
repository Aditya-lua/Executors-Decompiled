package td;

import java.util.Set;

/* JADX INFO: renamed from: td.a1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C11567a1 extends InterfaceC11571c.d {

    /* JADX INFO: renamed from: a */
    public final String f40933a;

    /* JADX INFO: renamed from: b */
    public final Set f40934b;

    public /* synthetic */ C11567a1(String str, Set set, C11635z0 c11635z0) {
        this.f40933a = str;
        this.f40934b = set;
    }

    @Override // td.InterfaceC11571c.d
    /* JADX INFO: renamed from: b */
    public final String mo43239b() {
        return this.f40933a;
    }

    @Override // td.InterfaceC11571c.d
    /* JADX INFO: renamed from: c */
    public final Set<Integer> mo43240c() {
        return this.f40934b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC11571c.d) {
            InterfaceC11571c.d dVar = (InterfaceC11571c.d) obj;
            String str = this.f40933a;
            if (str != null ? str.equals(dVar.mo43239b()) : dVar.mo43239b() == null) {
                if (this.f40934b.equals(dVar.mo43240c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f40933a;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f40934b.hashCode();
    }

    public final String toString() {
        return "StandardIntegrityTokenRequest{requestHash=" + this.f40933a + ", verdictOptOut=" + this.f40934b.toString() + "}";
    }
}
