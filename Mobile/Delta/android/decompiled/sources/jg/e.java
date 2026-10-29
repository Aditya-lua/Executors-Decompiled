package jg;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f21385d = new e("", "", false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f21386e = new e("\n", "  ", true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21387a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f21388c;

    public e(String str, String str2, boolean z10) {
        Objects.requireNonNull(str, "newline == null");
        Objects.requireNonNull(str2, "indent == null");
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f21387a = str;
        this.b = str2;
        this.f21388c = z10;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.f21387a;
    }

    public boolean c() {
        return this.f21388c;
    }

    public e d(String str) {
        return new e(this.f21387a, str, this.f21388c);
    }
}
