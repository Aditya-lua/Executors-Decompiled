package eo;

/* JADX INFO: loaded from: classes3.dex */
public class m extends s {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f13855g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f13856h;

    public m() {
    }

    @Override // eo.s
    public void a(d0 d0Var) {
        d0Var.B(this);
    }

    @Override // eo.s
    public String m() {
        return "destination=" + this.f13855g + ", title=" + this.f13856h;
    }

    public String o() {
        return this.f13855g;
    }

    public m(String str, String str2) {
        this.f13855g = str;
        this.f13856h = str2;
    }
}
