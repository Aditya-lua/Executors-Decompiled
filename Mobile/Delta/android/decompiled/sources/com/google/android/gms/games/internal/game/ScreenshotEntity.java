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
    public final Uri f6219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6220g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6221h;

    public ScreenshotEntity(@NonNull Uri uri, int i10, int i11) {
        this.f6219f = uri;
        this.f6220g = i10;
        this.f6221h = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScreenshotEntity)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ScreenshotEntity screenshotEntity = (ScreenshotEntity) obj;
        return k.b(screenshotEntity.f6219f, this.f6219f) && k.b(Integer.valueOf(screenshotEntity.f6220g), Integer.valueOf(this.f6220g)) && k.b(Integer.valueOf(screenshotEntity.f6221h), Integer.valueOf(this.f6221h));
    }

    public final int hashCode() {
        return k.c(this.f6219f, Integer.valueOf(this.f6220g), Integer.valueOf(this.f6221h));
    }

    @NonNull
    public final String toString() {
        return k.d(this).a("Uri", this.f6219f).a("Width", Integer.valueOf(this.f6220g)).a("Height", Integer.valueOf(this.f6221h)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        Uri uri = this.f6219f;
        int iA = b.a(parcel);
        b.t(parcel, 1, uri, i10, false);
        b.n(parcel, 2, this.f6220g);
        b.n(parcel, 3, this.f6221h);
        b.b(parcel, iA);
    }
}
