package l7;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23374a;
    public final float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f23375c;

    public h(String str, float f10, float f11) {
        this.f23374a = str;
        this.f23375c = f11;
        this.b = f10;
    }

    public boolean a(String str) {
        if (this.f23374a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f23374a.endsWith("\r")) {
            String str2 = this.f23374a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
