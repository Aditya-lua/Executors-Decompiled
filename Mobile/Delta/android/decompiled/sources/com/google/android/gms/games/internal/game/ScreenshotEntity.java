package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.internal.zzg;
import ia.c;
import m9.e;
import n9.k;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class ScreenshotEntity extends zzg implements e, Parcelable {

    @NonNull
    public static final Parcelable.Creator<ScreenshotEntity> CREATOR = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Uri f6146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6148h;

    public ScreenshotEntity(@NonNull Uri uri, int i10, int i11) {
        this.f6146f = uri;
        this.f6147g = i10;
        this.f6148h = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScreenshotEntity)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ScreenshotEntity screenshotEntity = (ScreenshotEntity) obj;
        return k.b(screenshotEntity.f6146f, this.f6146f) && k.b(Integer.valueOf(screenshotEntity.f6147g), Integer.valueOf(this.f6147g)) && k.b(Integer.valueOf(screenshotEntity.f6148h), Integer.valueOf(this.f6148h));
    }

    public final int hashCode() {
        return k.c(this.f6146f, Integer.valueOf(this.f6147g), Integer.valueOf(this.f6148h));
    }

    @NonNull
    public final String toString() {
        return k.d(this).a("Uri", this.f6146f).a("Width", Integer.valueOf(this.f6147g)).a("Height", Integer.valueOf(this.f6148h)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        Uri uri = this.f6146f;
        int iA = b.a(parcel);
        b.t(parcel, 1, uri, i10, false);
        b.n(parcel, 2, this.f6147g);
        b.n(parcel, 3, this.f6148h);
        b.b(parcel, iA);
    }
}
