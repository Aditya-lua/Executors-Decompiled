package eo;

/* JADX INFO: loaded from: classes3.dex */
public class o extends s {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f13858g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f13859h;

    public o() {
    }

    @Override // eo.s
    public void a(d0 d0Var) {
        d0Var.q(this);
    }

    @Override // eo.s
    public String m() {
        return "destination=" + this.f13858g + ", title=" + this.f13859h;
    }

    public String o() {
        return this.f13858g;
    }

    public o(String str, String str2) {
        this.f13858g = str;
        this.f13859h = str2;
    }
}
