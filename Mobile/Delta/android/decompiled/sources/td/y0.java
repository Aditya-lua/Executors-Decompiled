package td;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class y0 extends c.d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f32305a;
    public Set b;

    @Override // td.c.d.a
    public final c.d a() {
        Set set = this.b;
        if (set != null) {
            return new a1(this.f32305a, set, null);
        }
        throw new IllegalStateException("Missing required properties: verdictOptOut");
    }

    @Override // td.c.d.a
    public final c.d.a b(String str) {
        this.f32305a = str;
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
