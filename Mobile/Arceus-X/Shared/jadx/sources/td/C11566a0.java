package td;

/* JADX INFO: renamed from: td.a0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C11566a0 extends AbstractC11614q0 {

    /* JADX INFO: renamed from: a */
    public String f40931a;

    /* JADX INFO: renamed from: b */
    public AbstractC11618r1 f40932b;

    @Override // td.AbstractC11614q0
    /* JADX INFO: renamed from: a */
    public final AbstractC11614q0 mo43236a(AbstractC11618r1 abstractC11618r1) {
        this.f40932b = abstractC11618r1;
        return this;
    }

    @Override // td.AbstractC11614q0
    /* JADX INFO: renamed from: b */
    public final AbstractC11614q0 mo43237b(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f40931a = str;
        return this;
    }

    @Override // td.AbstractC11614q0
    /* JADX INFO: renamed from: c */
    public final C11617r0 mo43238c() {
        AbstractC11618r1 abstractC11618r1;
        String str = this.f40931a;
        if (str != null && (abstractC11618r1 = this.f40932b) != null) {
            return new C11617r0(str, abstractC11618r1);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f40931a == null) {
            sb2.append(" token");
        }
        if (this.f40932b == null) {
            sb2.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
