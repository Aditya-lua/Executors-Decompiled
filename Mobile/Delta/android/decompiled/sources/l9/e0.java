package l9;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f23394a;

    public e0(f fVar) {
        this.f23394a = fVar;
    }

    @Override // l9.c.a
    public final void a(boolean z10) {
        f fVar = this.f23394a;
        fVar.f23411s.sendMessage(fVar.f23411s.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
