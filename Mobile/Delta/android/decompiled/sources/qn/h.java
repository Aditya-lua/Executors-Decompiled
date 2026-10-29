package qn;

/* JADX INFO: loaded from: classes3.dex */
public class h extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f29473g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f29474h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Integer f29475i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f29476j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f29477k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f29478l;

    public static void p(Integer num, Integer num2) {
        if (num != null && num2 != null && num2.intValue() < num.intValue()) {
            throw new IllegalArgumentException("fence lengths required to be: closingFenceLength >= openingFenceLength");
        }
    }

    @Override // qn.s
    public void a(d0 d0Var) {
        d0Var.E(this);
    }

    public int q() {
        return this.f29476j;
    }

    public String r() {
        return this.f29477k;
    }

    public String s() {
        return this.f29478l;
    }

    public Integer t() {
        return this.f29474h;
    }

    public void u(Integer num) {
        if (num != null && num.intValue() < 3) {
            throw new IllegalArgumentException("closingFenceLength needs to be >= 3");
        }
        p(this.f29474h, num);
        this.f29475i = num;
    }

    public void v(String str) {
        this.f29473g = str;
    }

    public void w(int i10) {
        this.f29476j = i10;
    }

    public void x(String str) {
        this.f29477k = str;
    }

    public void y(String str) {
        this.f29478l = str;
    }

    public void z(Integer num) {
        if (num != null && num.intValue() < 3) {
            throw new IllegalArgumentException("openingFenceLength needs to be >= 3");
        }
        p(num, this.f29475i);
        this.f29474h = num;
    }
}
