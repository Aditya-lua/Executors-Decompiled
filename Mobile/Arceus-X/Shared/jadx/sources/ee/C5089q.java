package ee;

/* JADX INFO: renamed from: ee.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C5089q extends AbstractC5085o {

    /* JADX INFO: renamed from: c */
    public final AbstractC5093s f19904c;

    public C5089q(AbstractC5093s abstractC5093s, int i10) {
        super(abstractC5093s.size(), i10);
        this.f19904c = abstractC5093s;
    }

    @Override // ee.AbstractC5085o
    /* JADX INFO: renamed from: a */
    public final Object mo23824a(int i10) {
        return this.f19904c.get(i10);
    }
}
