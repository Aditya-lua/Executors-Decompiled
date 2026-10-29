package de;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f14595c;

    public q(s sVar, int i10) {
        super(sVar.size(), i10);
        this.f14595c = sVar;
    }

    @Override // de.o
    public final Object a(int i10) {
        return this.f14595c.get(i10);
    }
}
