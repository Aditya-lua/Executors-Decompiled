package com.google.android.play.core.review;

import android.app.PendingIntent;

/* JADX INFO: loaded from: classes2.dex */
final class zza extends ReviewInfo {

    /* JADX INFO: renamed from: a */
    public final PendingIntent f10769a;

    /* JADX INFO: renamed from: b */
    public final boolean f10770b;

    public zza(PendingIntent pendingIntent, boolean z10) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.f10769a = pendingIntent;
        this.f10770b = z10;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    /* JADX INFO: renamed from: a */
    public final PendingIntent mo13349a() {
        return this.f10769a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            ReviewInfo reviewInfo = (ReviewInfo) obj;
            if (this.f10769a.equals(reviewInfo.mo13349a()) && this.f10770b == reviewInfo.zzb()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f10769a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f10770b ? 1237 : 1231);
    }

    public final String toString() {
        return "ReviewInfo{pendingIntent=" + this.f10769a.toString() + ", isNoOp=" + this.f10770b + "}";
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    public final boolean zzb() {
        return this.f10770b;
    }
}
