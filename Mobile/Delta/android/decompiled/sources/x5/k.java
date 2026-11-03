package x5;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35455a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Notification f35456c;

    public k(int i10, Notification notification, int i11) {
        this.f35455a = i10;
        this.f35456c = notification;
        this.b = i11;
    }

    public int a() {
        return this.b;
    }

    public Notification b() {
        return this.f35456c;
    }

    public int c() {
        return this.f35455a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f35455a == kVar.f35455a && this.b == kVar.b) {
            return this.f35456c.equals(kVar.f35456c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f35455a * 31) + this.b) * 31) + this.f35456c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f35455a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.f35456c + '}';
    }
}
