package la;

import android.content.Intent;

/* JADX INFO: renamed from: la.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8096a {

    /* JADX INFO: renamed from: a */
    public final boolean f30136a;

    /* JADX INFO: renamed from: b */
    public final Intent f30137b;

    public C8096a(boolean z10, Intent intent) {
        this.f30136a = z10;
        this.f30137b = intent;
    }

    /* JADX INFO: renamed from: a */
    public static C8096a m33316a(Intent intent) {
        return new C8096a(true, intent);
    }

    /* JADX INFO: renamed from: b */
    public static C8096a m33317b(Intent intent) {
        return new C8096a(false, intent);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m33318c() {
        return this.f30136a;
    }

    /* JADX INFO: renamed from: d */
    public final Intent m33319d() {
        return this.f30137b;
    }
}
