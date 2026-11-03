package on;

/* JADX INFO: loaded from: classes3.dex */
public class h extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f28017g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f28018h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Integer f28019i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f28020j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f28021k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f28022l;

    public static void p(Integer num, Integer num2) {
        if (num != null && num2 != null && num2.intValue() < num.intValue()) {
            throw new IllegalArgumentException("fence lengths required to be: closingFenceLength >= openingFenceLength");
        }
    }

    @Override // on.s
    public void a(d0 d0Var) {
        d0Var.B(this);
    }

    public int q() {
        return this.f28020j;
    }

    public String r() {
        return this.f28021k;
    }

    public String s() {
        return this.f28022l;
    }

    public Integer t() {
        return this.f28018h;
    }

    public void u(Integer num) {
        if (num != null && num.intValue() < 3) {
            throw new IllegalArgumentException("closingFenceLength needs to be >= 3");
        }
        p(this.f28018h, num);
        this.f28019i = num;
    }

    public void v(String str) {
        this.f28017g = str;
    }

    public void w(int i10) {
        this.f28020j = i10;
    }

    public void x(String str) {
        this.f28021k = str;
    }

    public void y(String str) {
        this.f28022l = str;
    }

    public void z(Integer num) {
        if (num != null && num.intValue() < 3) {
            throw new IllegalArgumentException("openingFenceLength needs to be >= 3");
        }
        p(num, this.f28019i);
        this.f28018h = num;
    }
}
