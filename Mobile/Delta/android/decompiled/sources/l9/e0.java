package l9;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f23000a;

    public e0(f fVar) {
        this.f23000a = fVar;
    }

    @Override // l9.c.a
    public final void a(boolean z10) {
        f fVar = this.f23000a;
        fVar.f23017s.sendMessage(fVar.f23017s.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
