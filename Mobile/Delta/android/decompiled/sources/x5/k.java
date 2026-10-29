package x5;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34957a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Notification f34958c;

    public k(int i10, Notification notification, int i11) {
        this.f34957a = i10;
        this.f34958c = notification;
        this.b = i11;
    }

    public int a() {
        return this.b;
    }

    public Notification b() {
        return this.f34958c;
    }

    public int c() {
        return this.f34957a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f34957a == kVar.f34957a && this.b == kVar.b) {
            return this.f34958c.equals(kVar.f34958c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f34957a * 31) + this.b) * 31) + this.f34958c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f34957a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.f34958c + '}';
    }
}
