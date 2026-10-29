package p266l7;

/* JADX INFO: renamed from: l7.h */
/* JADX INFO: loaded from: classes3.dex */
public class C8009h {

    /* JADX INFO: renamed from: a */
    public final String f29962a;

    /* JADX INFO: renamed from: b */
    public final float f29963b;

    /* JADX INFO: renamed from: c */
    public final float f29964c;

    public C8009h(String str, float f10, float f11) {
        this.f29962a = str;
        this.f29964c = f11;
        this.f29963b = f10;
    }

    /* JADX INFO: renamed from: a */
    public boolean m33088a(String str) {
        if (this.f29962a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f29962a.endsWith("\r")) {
            String str2 = this.f29962a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
