package ob;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27210a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f27211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f27212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f27213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f27214f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f27215g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f27216h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f27217i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f27218j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Boolean f27219k;

    public e0(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        o9.s.f(str);
        o9.s.f(str2);
        o9.s.a(j10 >= 0);
        o9.s.a(j11 >= 0);
        o9.s.a(j12 >= 0);
        o9.s.a(j14 >= 0);
        this.f27210a = str;
        this.b = str2;
        this.f27211c = j10;
        this.f27212d = j11;
        this.f27213e = j12;
        this.f27214f = j13;
        this.f27215g = j14;
        this.f27216h = l10;
        this.f27217i = l11;
        this.f27218j = l12;
        this.f27219k = bool;
    }

    public final e0 a(long j10) {
        return new e0(this.f27210a, this.b, this.f27211c, this.f27212d, this.f27213e, j10, this.f27215g, this.f27216h, this.f27217i, this.f27218j, this.f27219k);
    }

    public final e0 b(long j10, long j11) {
        return new e0(this.f27210a, this.b, this.f27211c, this.f27212d, this.f27213e, this.f27214f, j10, Long.valueOf(j11), this.f27217i, this.f27218j, this.f27219k);
    }

    public final e0 c(Long l10, Long l11, Boolean bool) {
        return new e0(this.f27210a, this.b, this.f27211c, this.f27212d, this.f27213e, this.f27214f, this.f27215g, this.f27216h, l10, l11, bool);
    }
}
