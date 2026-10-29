package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import p192ia.C6716a;
import p305n9.C8947k;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class GameBadgeEntity extends GamesDowngradeableSafeParcel implements zza {

    @NonNull
    public static final Parcelable.Creator<GameBadgeEntity> CREATOR = new C6716a();

    /* JADX INFO: renamed from: h */
    public final int f7858h;

    /* JADX INFO: renamed from: i */
    public final String f7859i;

    /* JADX INFO: renamed from: j */
    public final String f7860j;

    /* JADX INFO: renamed from: k */
    public final Uri f7861k;

    public GameBadgeEntity(int i10, String str, String str2, Uri uri) {
        this.f7858h = i10;
        this.f7859i = str;
        this.f7860j = str2;
        this.f7861k = uri;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zza)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        zza zzaVar = (zza) obj;
        return C8947k.m36026b(Integer.valueOf(zzaVar.zza()), this.f7859i) && C8947k.m36026b(zzaVar.zzb(), this.f7861k);
    }

    public final int hashCode() {
        return C8947k.m36027c(Integer.valueOf(this.f7858h), this.f7859i, this.f7860j, this.f7861k);
    }

    @NonNull
    public final String toString() {
        return C8947k.m36028d(this).m36029a("Type", Integer.valueOf(this.f7858h)).m36029a("Title", this.f7859i).m36029a("Description", this.f7860j).m36029a("IconImageUri", this.f7861k).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        if (m9208w3()) {
            parcel.writeInt(this.f7858h);
            parcel.writeString(this.f7859i);
            parcel.writeString(this.f7860j);
            Uri uri = this.f7861k;
            parcel.writeString(uri == null ? null : uri.toString());
            return;
        }
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, this.f7858h);
        C9718b.m38478v(parcel, 2, this.f7859i, false);
        C9718b.m38478v(parcel, 3, this.f7860j, false);
        C9718b.m38476t(parcel, 4, this.f7861k, i10, false);
        C9718b.m38458b(parcel, iM38457a);
    }

    @Override // com.google.android.gms.games.internal.game.zza
    public final int zza() {
        return this.f7858h;
    }

    @Override // com.google.android.gms.games.internal.game.zza
    @NonNull
    public final String zzb() {
        return this.f7860j;
    }
}
