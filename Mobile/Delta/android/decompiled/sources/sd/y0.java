package sd;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class y0 extends c.d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f30696a;
    public Set b;

    @Override // sd.c.d.a
    public final c.d a() {
        Set set = this.b;
        if (set != null) {
            return new a1(this.f30696a, set, null);
        }
        throw new IllegalStateException("Missing required properties: verdictOptOut");
    }

    @Override // sd.c.d.a
    public final c.d.a b(String str) {
        this.f30696a = str;
        return this;
    }

    public final c.d.a c(Set<Integer> set) {
        if (set == null) {
            throw new NullPointerException("Null verdictOptOut");
        }
        this.b = set;
        return this;
    }
}
