package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import ha.p;
import ja.d;
import n9.e;
import o9.q;
import p9.c;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class ScreenshotEntity extends p implements e, Parcelable {

    @NonNull
    public static final Parcelable.Creator<ScreenshotEntity> CREATOR = new d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Uri f6270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6272h;

    public ScreenshotEntity(@NonNull Uri uri, int i10, int i11) {
        this.f6270f = uri;
        this.f6271g = i10;
        this.f6272h = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScreenshotEntity)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ScreenshotEntity screenshotEntity = (ScreenshotEntity) obj;
        return q.b(screenshotEntity.f6270f, this.f6270f) && q.b(Integer.valueOf(screenshotEntity.f6271g), Integer.valueOf(this.f6271g)) && q.b(Integer.valueOf(screenshotEntity.f6272h), Integer.valueOf(this.f6272h));
    }

    public final int hashCode() {
        return q.c(this.f6270f, Integer.valueOf(this.f6271g), Integer.valueOf(this.f6272h));
    }

    @NonNull
    public final String toString() {
        return q.d(this).a("Uri", this.f6270f).a("Width", Integer.valueOf(this.f6271g)).a("Height", Integer.valueOf(this.f6272h)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        Uri uri = this.f6270f;
        int iA = c.a(parcel);
        c.t(parcel, 1, uri, i10, false);
        c.n(parcel, 2, this.f6271g);
        c.n(parcel, 3, this.f6272h);
        c.b(parcel, iA);
    }
}
