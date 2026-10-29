package td;

import java.util.Set;

/* JADX INFO: renamed from: td.y0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C11633y0 extends InterfaceC11571c.d.a {

    /* JADX INFO: renamed from: a */
    public String f41035a;

    /* JADX INFO: renamed from: b */
    public Set f41036b;

    @Override // td.InterfaceC11571c.d.a
    /* JADX INFO: renamed from: a */
    public final InterfaceC11571c.d mo43251a() {
        Set set = this.f41036b;
        if (set != null) {
            return new C11567a1(this.f41035a, set, null);
        }
        throw new IllegalStateException("Missing required properties: verdictOptOut");
    }

    @Override // td.InterfaceC11571c.d.a
    /* JADX INFO: renamed from: b */
    public final InterfaceC11571c.d.a mo43252b(String str) {
        this.f41035a = str;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC11571c.d.a m43287c(Set<Integer> set) {
        if (set == null) {
            throw new NullPointerException("Null verdictOptOut");
        }
        this.f41036b = set;
        return this;
    }
}
