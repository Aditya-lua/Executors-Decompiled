package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import ja.a;
import ja.b;
import o9.q;
import p9.c;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class GameBadgeEntity extends GamesDowngradeableSafeParcel implements a {

    @NonNull
    public static final Parcelable.Creator<GameBadgeEntity> CREATOR = new b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6266h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f6267i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f6268j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f6269k;

    public GameBadgeEntity(int i10, String str, String str2, Uri uri) {
        this.f6266h = i10;
        this.f6267i = str;
        this.f6268j = str2;
        this.f6269k = uri;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        a aVar = (a) obj;
        return q.b(Integer.valueOf(aVar.zza()), this.f6267i) && q.b(aVar.zzb(), this.f6269k);
    }

    public final int hashCode() {
        return q.c(Integer.valueOf(this.f6266h), this.f6267i, this.f6268j, this.f6269k);
    }

    @NonNull
    public final String toString() {
        return q.d(this).a("Type", Integer.valueOf(this.f6266h)).a("Title", this.f6267i).a("Description", this.f6268j).a("IconImageUri", this.f6269k).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        if (B3()) {
            parcel.writeInt(this.f6266h);
            parcel.writeString(this.f6267i);
            parcel.writeString(this.f6268j);
            Uri uri = this.f6269k;
            parcel.writeString(uri == null ? null : uri.toString());
            return;
        }
        int iA = c.a(parcel);
        c.n(parcel, 1, this.f6266h);
        c.v(parcel, 2, this.f6267i, false);
        c.v(parcel, 3, this.f6268j, false);
        c.t(parcel, 4, this.f6269k, i10, false);
        c.b(parcel, iA);
    }

    @Override // ja.a
    public final int zza() {
        return this.f6266h;
    }

    @Override // ja.a
    @NonNull
    public final String zzb() {
        return this.f6268j;
    }
}
