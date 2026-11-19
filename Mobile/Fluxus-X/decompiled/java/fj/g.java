package fj;

/* JADX INFO: loaded from: classes2.dex */
public class g extends i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16145h;

    public g(com.roblox.client.c cVar, String str) {
        super(cVar);
        this.f16145h = g(str);
    }

    @Override // fj.i, fj.f.e
    public int d() {
        return this.f16145h;
    }

    public final int g(String str) {
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        switch (lowerCase) {
            case "groups":
            case "group":
                return 5;
            case "player":
            case "players":
                return 1;
            default:
                return super.d();
        }
    }
}
