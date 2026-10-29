package db;

/* JADX INFO: loaded from: classes.dex */
public final class f extends v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f14539c;

    public f(i iVar, int i10) {
        super(iVar.size(), i10);
        this.f14539c = iVar;
    }

    @Override // db.v
    public final Object a(int i10) {
        return this.f14539c.get(i10);
    }
}
