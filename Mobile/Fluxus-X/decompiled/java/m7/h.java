package m7;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22965a;
    public final float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f22966c;

    public h(String str, float f10, float f11) {
        this.f22965a = str;
        this.f22966c = f11;
        this.b = f10;
    }

    public boolean a(String str) {
        if (this.f22965a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f22965a.endsWith("\r")) {
            String str2 = this.f22965a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
