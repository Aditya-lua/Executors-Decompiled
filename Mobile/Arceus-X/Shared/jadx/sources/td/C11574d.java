package td;

/* JADX INFO: renamed from: td.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C11574d extends AbstractC11616r {

    /* JADX INFO: renamed from: a */
    public String f40939a;

    /* JADX INFO: renamed from: b */
    public AbstractC11618r1 f40940b;

    @Override // td.AbstractC11616r
    /* JADX INFO: renamed from: a */
    public final AbstractC11616r mo43254a(AbstractC11618r1 abstractC11618r1) {
        this.f40940b = abstractC11618r1;
        return this;
    }

    @Override // td.AbstractC11616r
    /* JADX INFO: renamed from: b */
    public final AbstractC11616r mo43255b(String str) {
        this.f40939a = str;
        return this;
    }

    @Override // td.AbstractC11616r
    /* JADX INFO: renamed from: c */
    public final C11619s mo43256c() {
        AbstractC11618r1 abstractC11618r1;
        String str = this.f40939a;
        if (str != null && (abstractC11618r1 = this.f40940b) != null) {
            return new C11619s(str, abstractC11618r1);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f40939a == null) {
            sb2.append(" token");
        }
        if (this.f40940b == null) {
            sb2.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
