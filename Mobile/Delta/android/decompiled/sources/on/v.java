package on;

/* JADX INFO: loaded from: classes3.dex */
public class v extends q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f28044h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Integer f28045i;

    @Override // on.s
    public void a(d0 d0Var) {
        d0Var.C(this);
    }

    public String r() {
        return this.f28044h;
    }

    public Integer s() {
        return this.f28045i;
    }

    @Deprecated
    public int t() {
        Integer num = this.f28045i;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public void u(String str) {
        this.f28044h = str;
    }

    public void v(Integer num) {
        this.f28045i = num;
    }

    @Deprecated
    public void w(int i10) {
        this.f28045i = i10 != 0 ? Integer.valueOf(i10) : null;
    }
}
