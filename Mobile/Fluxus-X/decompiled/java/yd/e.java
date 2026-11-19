package yd;

import android.app.PendingIntent;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PendingIntent f37719a;
    public final boolean b;

    public e(PendingIntent pendingIntent, boolean z10) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.f37719a = pendingIntent;
        this.b = z10;
    }

    @Override // yd.b
    public final PendingIntent a() {
        return this.f37719a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f37719a.equals(bVar.a()) && this.b == bVar.zzb()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f37719a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "ReviewInfo{pendingIntent=" + this.f37719a.toString() + ", isNoOp=" + this.b + "}";
    }

    @Override // yd.b
    public final boolean zzb() {
        return this.b;
    }
}
