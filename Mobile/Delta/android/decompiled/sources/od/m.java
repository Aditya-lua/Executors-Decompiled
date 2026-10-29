package od;

import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f27331a;
    public Integer b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f27332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Date f27333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f27334e;

    @Override // od.e.a
    public final e a() {
        return new o(this.f27331a, this.b, this.f27332c, this.f27333d, this.f27334e, null);
    }

    @Override // od.e.a
    public final e.a b(Integer num) {
        this.b = num;
        return this;
    }

    @Override // od.e.a
    public final e.a c(Integer num) {
        this.f27332c = num;
        return this;
    }

    @Override // od.e.a
    public final e.a d(String str) {
        this.f27334e = str;
        return this;
    }

    @Override // od.e.a
    public final e.a e(Date date) {
        this.f27333d = date;
        return this;
    }

    @Override // od.e.a
    public final e.a f(Integer num) {
        this.f27331a = num;
        return this;
    }
}
