package qn;

/* JADX INFO: loaded from: classes3.dex */
public class v extends q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f29500h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Integer f29501i;

    @Override // qn.s
    public void a(d0 d0Var) {
        d0Var.z(this);
    }

    public String r() {
        return this.f29500h;
    }

    public Integer s() {
        return this.f29501i;
    }

    @Deprecated
    public int t() {
        Integer num = this.f29501i;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public void u(String str) {
        this.f29500h = str;
    }

    public void v(Integer num) {
        this.f29501i = num;
    }

    @Deprecated
    public void w(int i10) {
        this.f29501i = i10 != 0 ? Integer.valueOf(i10) : null;
    }
}
