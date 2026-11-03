package ee;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f16091c;

    public q(s sVar, int i10) {
        super(sVar.size(), i10);
        this.f16091c = sVar;
    }

    @Override // ee.o
    public final Object a(int i10) {
        return this.f16091c.get(i10);
    }
}
