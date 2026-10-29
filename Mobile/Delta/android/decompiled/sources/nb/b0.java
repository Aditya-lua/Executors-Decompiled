package nb;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25346a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f25347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f25348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f25349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f25350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f25351g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f25352h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f25353i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f25354j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Boolean f25355k;

    public b0(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        n9.m.f(str);
        n9.m.f(str2);
        n9.m.a(j10 >= 0);
        n9.m.a(j11 >= 0);
        n9.m.a(j12 >= 0);
        n9.m.a(j14 >= 0);
        this.f25346a = str;
        this.b = str2;
        this.f25347c = j10;
        this.f25348d = j11;
        this.f25349e = j12;
        this.f25350f = j13;
        this.f25351g = j14;
        this.f25352h = l10;
        this.f25353i = l11;
        this.f25354j = l12;
        this.f25355k = bool;
    }

    public final b0 a(long j10) {
        return new b0(this.f25346a, this.b, this.f25347c, this.f25348d, this.f25349e, j10, this.f25351g, this.f25352h, this.f25353i, this.f25354j, this.f25355k);
    }

    public final b0 b(long j10, long j11) {
        return new b0(this.f25346a, this.b, this.f25347c, this.f25348d, this.f25349e, this.f25350f, j10, Long.valueOf(j11), this.f25353i, this.f25354j, this.f25355k);
    }

    public final b0 c(Long l10, Long l11, Boolean bool) {
        return new b0(this.f25346a, this.b, this.f25347c, this.f25348d, this.f25349e, this.f25350f, this.f25351g, this.f25352h, l10, l11, bool);
    }
}
