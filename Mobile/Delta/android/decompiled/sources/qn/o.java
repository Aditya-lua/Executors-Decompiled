package qn;

/* JADX INFO: loaded from: classes3.dex */
public class o extends s {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f29485g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f29486h;

    public o() {
    }

    @Override // qn.s
    public void a(d0 d0Var) {
        d0Var.s(this);
    }

    @Override // qn.s
    public String m() {
        return "destination=" + this.f29485g + ", title=" + this.f29486h;
    }

    public String o() {
        return this.f29485g;
    }

    public o(String str, String str2) {
        this.f29485g = str;
        this.f29486h = str2;
    }
}
