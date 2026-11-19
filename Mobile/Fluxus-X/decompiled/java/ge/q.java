package ge;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f17718c;

    public q(s sVar, int i10) {
        super(sVar.size(), i10);
        this.f17718c = sVar;
    }

    @Override // ge.o
    public final Object a(int i10) {
        return this.f17718c.get(i10);
    }
}
