package o2;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class c extends w8.a<c> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a[] f27008e;

    public c() {
        super("Shortcut");
    }

    @NonNull
    public c l(@NonNull a... aVarArr) {
        this.f27008e = aVarArr;
        return c("capability", aVarArr);
    }

    @NonNull
    public c m(@NonNull String str) {
        d(str);
        return b("shortcutDescription", str);
    }

    @NonNull
    public c n(@NonNull String str) {
        g(str);
        return b("shortcutLabel", str);
    }

    @NonNull
    public c o(@NonNull String str) {
        return b("shortcutUrl", str);
    }
}
