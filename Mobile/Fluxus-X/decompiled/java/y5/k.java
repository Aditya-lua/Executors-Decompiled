package y5;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37501a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Notification f37502c;

    public k(int i10, Notification notification, int i11) {
        this.f37501a = i10;
        this.f37502c = notification;
        this.b = i11;
    }

    public int a() {
        return this.b;
    }

    public Notification b() {
        return this.f37502c;
    }

    public int c() {
        return this.f37501a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f37501a == kVar.f37501a && this.b == kVar.b) {
            return this.f37502c.equals(kVar.f37502c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f37501a * 31) + this.b) * 31) + this.f37502c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f37501a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.f37502c + '}';
    }
}
