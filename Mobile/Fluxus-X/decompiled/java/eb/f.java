package eb;

/* JADX INFO: loaded from: classes.dex */
public final class f extends v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f13310c;

    public f(i iVar, int i10) {
        super(iVar.size(), i10);
        this.f13310c = iVar;
    }

    @Override // eb.v
    public final Object a(int i10) {
        return this.f13310c.get(i10);
    }
}
