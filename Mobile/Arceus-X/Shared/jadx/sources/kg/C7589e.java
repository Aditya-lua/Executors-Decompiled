package kg;

import java.util.Objects;

/* JADX INFO: renamed from: kg.e */
/* JADX INFO: loaded from: classes2.dex */
public class C7589e {

    /* JADX INFO: renamed from: d */
    public static final C7589e f29050d = new C7589e("", "", false);

    /* JADX INFO: renamed from: e */
    public static final C7589e f29051e = new C7589e("\n", "  ", true);

    /* JADX INFO: renamed from: a */
    public final String f29052a;

    /* JADX INFO: renamed from: b */
    public final String f29053b;

    /* JADX INFO: renamed from: c */
    public final boolean f29054c;

    public C7589e(String str, String str2, boolean z10) {
        Objects.requireNonNull(str, "newline == null");
        Objects.requireNonNull(str2, "indent == null");
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f29052a = str;
        this.f29053b = str2;
        this.f29054c = z10;
    }

    /* JADX INFO: renamed from: a */
    public String m31394a() {
        return this.f29053b;
    }

    /* JADX INFO: renamed from: b */
    public String m31395b() {
        return this.f29052a;
    }

    /* JADX INFO: renamed from: c */
    public boolean m31396c() {
        return this.f29054c;
    }

    /* JADX INFO: renamed from: d */
    public C7589e m31397d(String str) {
        return new C7589e(this.f29052a, str, this.f29054c);
    }
}
