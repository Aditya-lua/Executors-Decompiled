package nb;

/* JADX INFO: loaded from: classes.dex */
public final class ke {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final me f26526a;
    public int b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f26527c = d();

    public ke(me meVar) {
        this.f26526a = meVar;
    }

    public final void a() {
        this.b++;
        this.f26527c = d();
    }

    public final boolean b() {
        return this.f26526a.e().a() >= this.f26527c;
    }

    public final /* synthetic */ long c() {
        return this.f26527c;
    }

    public final long d() {
        me meVar = this.f26526a;
        n9.m.l(meVar);
        long jLongValue = ((Long) z4.f27023v.b(null)).longValue();
        long jLongValue2 = ((Long) z4.f27025w.b(null)).longValue();
        for (int i10 = 1; i10 < this.b; i10++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        return meVar.e().a() + Math.min(jLongValue, jLongValue2);
    }
}
