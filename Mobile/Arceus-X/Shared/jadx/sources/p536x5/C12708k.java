package p536x5;

import android.app.Notification;

/* JADX INFO: renamed from: x5.k */
/* JADX INFO: loaded from: classes.dex */
public final class C12708k {

    /* JADX INFO: renamed from: a */
    public final int f45273a;

    /* JADX INFO: renamed from: b */
    public final int f45274b;

    /* JADX INFO: renamed from: c */
    public final Notification f45275c;

    public C12708k(int i10, Notification notification, int i11) {
        this.f45273a = i10;
        this.f45275c = notification;
        this.f45274b = i11;
    }

    /* JADX INFO: renamed from: a */
    public int m47383a() {
        return this.f45274b;
    }

    /* JADX INFO: renamed from: b */
    public Notification m47384b() {
        return this.f45275c;
    }

    /* JADX INFO: renamed from: c */
    public int m47385c() {
        return this.f45273a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12708k.class != obj.getClass()) {
            return false;
        }
        C12708k c12708k = (C12708k) obj;
        if (this.f45273a == c12708k.f45273a && this.f45274b == c12708k.f45274b) {
            return this.f45275c.equals(c12708k.f45275c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f45273a * 31) + this.f45274b) * 31) + this.f45275c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f45273a + ", mForegroundServiceType=" + this.f45274b + ", mNotification=" + this.f45275c + '}';
    }
}
