package zd;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f37460a;

    public /* synthetic */ f0(x xVar) {
    }

    public final f0 a(j jVar) {
        this.f37460a = jVar;
        return this;
    }

    public final s0 b() {
        j jVar = this.f37460a;
        if (jVar != null) {
            return new h0(jVar, null);
        }
        throw new IllegalStateException(String.valueOf(j.class.getCanonicalName()).concat(" must be set"));
    }
}
