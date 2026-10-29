package p319o2;

import androidx.annotation.NonNull;
import p510w8.AbstractC12324a;

/* JADX INFO: renamed from: o2.c */
/* JADX INFO: loaded from: classes.dex */
public class C9631c extends AbstractC12324a<C9631c> {

    /* JADX INFO: renamed from: e */
    public C9629a[] f34929e;

    public C9631c() {
        super("Shortcut");
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    public C9631c m37999l(@NonNull C9629a... c9629aArr) {
        this.f34929e = c9629aArr;
        return m46167c("capability", c9629aArr);
    }

    @NonNull
    /* JADX INFO: renamed from: m */
    public C9631c m38000m(@NonNull String str) {
        m46168d(str);
        return m46166b("shortcutDescription", str);
    }

    @NonNull
    /* JADX INFO: renamed from: n */
    public C9631c m38001n(@NonNull String str) {
        m46171g(str);
        return m46166b("shortcutLabel", str);
    }

    @NonNull
    /* JADX INFO: renamed from: o */
    public C9631c m38002o(@NonNull String str) {
        return m46166b("shortcutUrl", str);
    }
}
