package eo;

/* JADX INFO: loaded from: classes3.dex */
public class h extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f13846g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f13847h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Integer f13848i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13849j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f13850k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f13851l;

    public static void p(Integer num, Integer num2) {
        if (num != null && num2 != null && num2.intValue() < num.intValue()) {
            throw new IllegalArgumentException("fence lengths required to be: closingFenceLength >= openingFenceLength");
        }
    }

    @Override // eo.s
    public void a(d0 d0Var) {
        d0Var.p(this);
    }

    public int q() {
        return this.f13849j;
    }

    public String r() {
        return this.f13850k;
    }

    public String s() {
        return this.f13851l;
    }

    public Integer t() {
        return this.f13847h;
    }

    public void u(Integer num) {
        if (num != null && num.intValue() < 3) {
            throw new IllegalArgumentException("closingFenceLength needs to be >= 3");
        }
        p(this.f13847h, num);
        this.f13848i = num;
    }

    public void v(String str) {
        this.f13846g = str;
    }

    public void w(int i10) {
        this.f13849j = i10;
    }

    public void x(String str) {
        this.f13850k = str;
    }

    public void y(String str) {
        this.f13851l = str;
    }

    public void z(Integer num) {
        if (num != null && num.intValue() < 3) {
            throw new IllegalArgumentException("openingFenceLength needs to be >= 3");
        }
        p(num, this.f13848i);
        this.f13847h = num;
    }
}
