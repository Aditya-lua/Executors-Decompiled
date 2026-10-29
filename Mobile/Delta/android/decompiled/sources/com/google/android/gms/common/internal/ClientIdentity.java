package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.k;
import n9.s;

/* JADX INFO: loaded from: classes.dex */
public class ClientIdentity extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new s();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f5765g;

    public ClientIdentity(int i10, String str) {
        this.f5764f = i10;
        this.f5765g = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        return clientIdentity.f5764f == this.f5764f && k.b(clientIdentity.f5765g, this.f5765g);
    }

    public final int hashCode() {
        return this.f5764f;
    }

    @NonNull
    public final String toString() {
        return this.f5764f + ":" + this.f5765g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.f5764f;
        int iA = o9.b.a(parcel);
        o9.b.n(parcel, 1, i11);
        o9.b.v(parcel, 2, this.f5765g, false);
        o9.b.b(parcel, iA);
    }
}
