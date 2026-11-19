package rd;

import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f30662a;
    public Integer b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f30663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Date f30664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f30665e;

    @Override // rd.e.a
    public final e a() {
        return new o(this.f30662a, this.b, this.f30663c, this.f30664d, this.f30665e, null);
    }

    @Override // rd.e.a
    public final e.a b(Integer num) {
        this.b = num;
        return this;
    }

    @Override // rd.e.a
    public final e.a c(Integer num) {
        this.f30663c = num;
        return this;
    }

    @Override // rd.e.a
    public final e.a d(String str) {
        this.f30665e = str;
        return this;
    }

    @Override // rd.e.a
    public final e.a e(Date date) {
        this.f30664d = date;
        return this;
    }

    @Override // rd.e.a
    public final e.a f(Integer num) {
        this.f30662a = num;
        return this;
    }
}
