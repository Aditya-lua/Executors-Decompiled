package p548xi;

import com.roblox.client.C3161c;

/* JADX INFO: renamed from: xi.g */
/* JADX INFO: loaded from: classes2.dex */
public class C12840g extends C12842i {

    /* JADX INFO: renamed from: h */
    public int f45663h;

    public C12840g(C3161c c3161c, String str) {
        super(c3161c);
        this.f45663h = m47815g(str);
    }

    @Override // p548xi.C12842i, p548xi.C12839f.e
    /* JADX INFO: renamed from: d */
    public int mo47814d() {
        return this.f45663h;
    }

    /* JADX INFO: renamed from: g */
    public final int m47815g(String str) {
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
                return super.mo47814d();
        }
    }
}
