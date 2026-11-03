package nb;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26167a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f26168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f26169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f26170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f26171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f26172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f26173h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f26174i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f26175j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Boolean f26176k;

    public b0(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        n9.m.f(str);
        n9.m.f(str2);
        n9.m.a(j10 >= 0);
        n9.m.a(j11 >= 0);
        n9.m.a(j12 >= 0);
        n9.m.a(j14 >= 0);
        this.f26167a = str;
        this.b = str2;
        this.f26168c = j10;
        this.f26169d = j11;
        this.f26170e = j12;
        this.f26171f = j13;
        this.f26172g = j14;
        this.f26173h = l10;
        this.f26174i = l11;
        this.f26175j = l12;
        this.f26176k = bool;
    }

    public final b0 a(long j10) {
        return new b0(this.f26167a, this.b, this.f26168c, this.f26169d, this.f26170e, j10, this.f26172g, this.f26173h, this.f26174i, this.f26175j, this.f26176k);
    }

    public final b0 b(long j10, long j11) {
        return new b0(this.f26167a, this.b, this.f26168c, this.f26169d, this.f26170e, this.f26171f, j10, Long.valueOf(j11), this.f26174i, this.f26175j, this.f26176k);
    }

    public final b0 c(Long l10, Long l11, Boolean bool) {
        return new b0(this.f26167a, this.b, this.f26168c, this.f26169d, this.f26170e, this.f26171f, this.f26172g, this.f26173h, l10, l11, bool);
    }
}
