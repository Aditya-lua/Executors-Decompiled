package p100eb;

import java.util.Arrays;

/* JADX INFO: renamed from: eb.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4949j0 {

    /* JADX INFO: renamed from: a */
    public final String f19671a;

    /* JADX INFO: renamed from: b */
    public final C4937h0 f19672b;

    /* JADX INFO: renamed from: c */
    public C4937h0 f19673c;

    public /* synthetic */ C4949j0(String str, C4943i0 c4943i0) {
        C4937h0 c4937h0 = new C4937h0();
        this.f19672b = c4937h0;
        this.f19673c = c4937h0;
        str.getClass();
        this.f19671a = str;
    }

    /* JADX INFO: renamed from: a */
    public final C4949j0 m23643a(String str, int i10) {
        String strValueOf = String.valueOf(i10);
        C4931g0 c4931g0 = new C4931g0(null);
        this.f19673c.f19657c = c4931g0;
        this.f19673c = c4931g0;
        c4931g0.f19656b = strValueOf;
        c4931g0.f19655a = "errorCode";
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final C4949j0 m23644b(String str, Object obj) {
        C4937h0 c4937h0 = new C4937h0();
        this.f19673c.f19657c = c4937h0;
        this.f19673c = c4937h0;
        c4937h0.f19656b = obj;
        c4937h0.f19655a = str;
        return this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f19671a);
        sb2.append('{');
        C4937h0 c4937h0 = this.f19672b.f19657c;
        String str = "";
        while (c4937h0 != null) {
            Object obj = c4937h0.f19656b;
            sb2.append(str);
            String str2 = c4937h0.f19655a;
            if (str2 != null) {
                sb2.append(str2);
                sb2.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            c4937h0 = c4937h0.f19657c;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }
}
