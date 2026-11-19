package ob;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s8 f27222a;

    public e3(s8 s8Var) {
        this.f27222a = s8Var;
    }

    public static e3 c(String str) {
        return new e3((TextUtils.isEmpty(str) || str.length() > 1) ? s8.UNINITIALIZED : v8.j(str.charAt(0)));
    }

    public final s8 a() {
        return this.f27222a;
    }

    public final String b() {
        return String.valueOf(v8.m(this.f27222a));
    }
}
