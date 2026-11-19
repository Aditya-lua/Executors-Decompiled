package ma;

import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23098a;
    public final Intent b;

    public c(boolean z10, Intent intent) {
        this.f23098a = z10;
        this.b = intent;
    }

    public static c a(Intent intent) {
        return new c(true, intent);
    }

    public static c b(Intent intent) {
        return new c(false, intent);
    }

    public final boolean c() {
        return this.f23098a;
    }

    public final Intent d() {
        return this.b;
    }
}
