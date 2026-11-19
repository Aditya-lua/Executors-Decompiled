package ob;

/* JADX INFO: loaded from: classes.dex */
public final class te {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ve f27827a;
    public int b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f27828c = d();

    public te(ve veVar) {
        this.f27827a = veVar;
    }

    public final void a() {
        this.b++;
        this.f27828c = d();
    }

    public final boolean b() {
        return this.f27827a.e().a() >= this.f27828c;
    }

    public final /* synthetic */ long c() {
        return this.f27828c;
    }

    public final long d() {
        ve veVar = this.f27827a;
        o9.s.l(veVar);
        long jLongValue = ((Long) e5.f27277v.b(null)).longValue();
        long jLongValue2 = ((Long) e5.f27279w.b(null)).longValue();
        for (int i10 = 1; i10 < this.b; i10++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        return veVar.e().a() + Math.min(jLongValue, jLongValue2);
    }
}
