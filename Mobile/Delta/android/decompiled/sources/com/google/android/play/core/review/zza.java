package com.google.android.play.core.review;

import android.app.PendingIntent;

/* JADX INFO: loaded from: classes2.dex */
final class zza extends ReviewInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PendingIntent f8453a;
    public final boolean b;

    public zza(PendingIntent pendingIntent, boolean z10) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.f8453a = pendingIntent;
        this.b = z10;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    public final PendingIntent a() {
        return this.f8453a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            ReviewInfo reviewInfo = (ReviewInfo) obj;
            if (this.f8453a.equals(reviewInfo.a()) && this.b == reviewInfo.zzb()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f8453a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "ReviewInfo{pendingIntent=" + this.f8453a.toString() + ", isNoOp=" + this.b + "}";
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    public final boolean zzb() {
        return this.b;
    }
}
