package eo;

/* JADX INFO: loaded from: classes3.dex */
public class v extends q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f13873h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Integer f13874i;

    @Override // eo.s
    public void a(d0 d0Var) {
        d0Var.z(this);
    }

    public String r() {
        return this.f13873h;
    }

    public Integer s() {
        return this.f13874i;
    }

    @Deprecated
    public int t() {
        Integer num = this.f13874i;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public void u(String str) {
        this.f13873h = str;
    }

    public void v(Integer num) {
        this.f13874i = num;
    }

    @Deprecated
    public void w(int i10) {
        this.f13874i = i10 != 0 ? Integer.valueOf(i10) : null;
    }
}
