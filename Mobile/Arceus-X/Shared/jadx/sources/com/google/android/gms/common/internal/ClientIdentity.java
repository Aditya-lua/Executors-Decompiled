package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p305n9.C8947k;
import p305n9.C8967s;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public class ClientIdentity extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new C8967s();

    /* JADX INFO: renamed from: f */
    public final int f7453f;

    /* JADX INFO: renamed from: g */
    public final String f7454g;

    public ClientIdentity(int i10, String str) {
        this.f7453f = i10;
        this.f7454g = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        return clientIdentity.f7453f == this.f7453f && C8947k.m36026b(clientIdentity.f7454g, this.f7454g);
    }

    public final int hashCode() {
        return this.f7453f;
    }

    @NonNull
    public final String toString() {
        return this.f7453f + ":" + this.f7454g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.f7453f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, i11);
        C9718b.m38478v(parcel, 2, this.f7454g, false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
