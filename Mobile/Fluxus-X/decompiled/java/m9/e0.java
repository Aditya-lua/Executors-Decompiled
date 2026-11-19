package m9;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f22985a;

    public e0(f fVar) {
        this.f22985a = fVar;
    }

    @Override // m9.c.a
    public final void a(boolean z10) {
        f fVar = this.f22985a;
        fVar.f23002s.sendMessage(fVar.f23002s.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
