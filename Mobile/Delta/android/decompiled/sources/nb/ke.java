package nb;

/* JADX INFO: loaded from: classes.dex */
public final class ke {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final me f25705a;
    public int b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f25706c = d();

    public ke(me meVar) {
        this.f25705a = meVar;
    }

    public final void a() {
        this.b++;
        this.f25706c = d();
    }

    public final boolean b() {
        return this.f25705a.e().a() >= this.f25706c;
    }

    public final /* synthetic */ long c() {
        return this.f25706c;
    }

    public final long d() {
        me meVar = this.f25705a;
        n9.m.l(meVar);
        long jLongValue = ((Long) z4.f26202v.b(null)).longValue();
        long jLongValue2 = ((Long) z4.f26204w.b(null)).longValue();
        for (int i10 = 1; i10 < this.b; i10++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        return meVar.e().a() + Math.min(jLongValue, jLongValue2);
    }
}
