package p125fb;

/* JADX INFO: renamed from: fb.l1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5540l1 extends AbstractC5510d1 {

    /* JADX INFO: renamed from: c */
    public final AbstractC5546n1 f21323c;

    public C5540l1(AbstractC5546n1 abstractC5546n1, int i10) {
        super(abstractC5546n1.size(), i10);
        this.f21323c = abstractC5546n1;
    }

    @Override // p125fb.AbstractC5510d1
    /* JADX INFO: renamed from: a */
    public final Object mo25171a(int i10) {
        return this.f21323c.get(i10);
    }
}
