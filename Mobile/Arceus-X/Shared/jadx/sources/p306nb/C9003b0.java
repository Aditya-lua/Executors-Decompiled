package p306nb;

import p305n9.C8953m;

/* JADX INFO: renamed from: nb.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C9003b0 {

    /* JADX INFO: renamed from: a */
    public final String f32700a;

    /* JADX INFO: renamed from: b */
    public final String f32701b;

    /* JADX INFO: renamed from: c */
    public final long f32702c;

    /* JADX INFO: renamed from: d */
    public final long f32703d;

    /* JADX INFO: renamed from: e */
    public final long f32704e;

    /* JADX INFO: renamed from: f */
    public final long f32705f;

    /* JADX INFO: renamed from: g */
    public final long f32706g;

    /* JADX INFO: renamed from: h */
    public final Long f32707h;

    /* JADX INFO: renamed from: i */
    public final Long f32708i;

    /* JADX INFO: renamed from: j */
    public final Long f32709j;

    /* JADX INFO: renamed from: k */
    public final Boolean f32710k;

    public C9003b0(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        C8953m.m36041f(str);
        C8953m.m36041f(str2);
        C8953m.m36036a(j10 >= 0);
        C8953m.m36036a(j11 >= 0);
        C8953m.m36036a(j12 >= 0);
        C8953m.m36036a(j14 >= 0);
        this.f32700a = str;
        this.f32701b = str2;
        this.f32702c = j10;
        this.f32703d = j11;
        this.f32704e = j12;
        this.f32705f = j13;
        this.f32706g = j14;
        this.f32707h = l10;
        this.f32708i = l11;
        this.f32709j = l12;
        this.f32710k = bool;
    }

    /* JADX INFO: renamed from: a */
    public final C9003b0 m36117a(long j10) {
        return new C9003b0(this.f32700a, this.f32701b, this.f32702c, this.f32703d, this.f32704e, j10, this.f32706g, this.f32707h, this.f32708i, this.f32709j, this.f32710k);
    }

    /* JADX INFO: renamed from: b */
    public final C9003b0 m36118b(long j10, long j11) {
        return new C9003b0(this.f32700a, this.f32701b, this.f32702c, this.f32703d, this.f32704e, this.f32705f, j10, Long.valueOf(j11), this.f32708i, this.f32709j, this.f32710k);
    }

    /* JADX INFO: renamed from: c */
    public final C9003b0 m36119c(Long l10, Long l11, Boolean bool) {
        return new C9003b0(this.f32700a, this.f32701b, this.f32702c, this.f32703d, this.f32704e, this.f32705f, this.f32706g, this.f32707h, l10, l11, bool);
    }
}
