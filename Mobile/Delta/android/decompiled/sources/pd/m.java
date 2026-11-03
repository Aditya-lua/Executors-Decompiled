package pd;

import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f28659a;
    public Integer b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f28660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Date f28661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f28662e;

    @Override // pd.e.a
    public final e a() {
        return new o(this.f28659a, this.b, this.f28660c, this.f28661d, this.f28662e, null);
    }

    @Override // pd.e.a
    public final e.a b(Integer num) {
        this.b = num;
        return this;
    }

    @Override // pd.e.a
    public final e.a c(Integer num) {
        this.f28660c = num;
        return this;
    }

    @Override // pd.e.a
    public final e.a d(String str) {
        this.f28662e = str;
        return this;
    }

    @Override // pd.e.a
    public final e.a e(Date date) {
        this.f28661d = date;
        return this;
    }

    @Override // pd.e.a
    public final e.a f(Integer num) {
        this.f28659a = num;
        return this;
    }
}
