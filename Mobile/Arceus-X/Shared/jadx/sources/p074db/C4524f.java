package p074db;

/* JADX INFO: renamed from: db.f */
/* JADX INFO: loaded from: classes.dex */
public final class C4524f extends AbstractC4540v {

    /* JADX INFO: renamed from: c */
    public final AbstractC4527i f18572c;

    public C4524f(AbstractC4527i abstractC4527i, int i10) {
        super(abstractC4527i.size(), i10);
        this.f18572c = abstractC4527i;
    }

    @Override // p074db.AbstractC4540v
    /* JADX INFO: renamed from: a */
    public final Object mo22490a(int i10) {
        return this.f18572c.get(i10);
    }
}
