package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lb.C8121x;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class LocationSettingsRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new C8121x();

    /* JADX INFO: renamed from: f */
    public final List<LocationRequest> f9459f;

    /* JADX INFO: renamed from: g */
    public final boolean f9460g;

    /* JADX INFO: renamed from: h */
    public final boolean f9461h;

    /* JADX INFO: renamed from: i */
    public zzbj f9462i;

    /* JADX INFO: renamed from: com.google.android.gms.location.LocationSettingsRequest$a */
    public static final class C2724a {

        /* JADX INFO: renamed from: a */
        public final ArrayList<LocationRequest> f9463a = new ArrayList<>();

        /* JADX INFO: renamed from: b */
        public boolean f9464b = false;

        /* JADX INFO: renamed from: c */
        public boolean f9465c = false;

        @NonNull
        /* JADX INFO: renamed from: a */
        public C2724a m11867a(@NonNull LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.f9463a.add(locationRequest);
            }
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public LocationSettingsRequest m11868b() {
            return new LocationSettingsRequest(this.f9463a, this.f9464b, this.f9465c, null);
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public C2724a m11869c(boolean z10) {
            this.f9464b = z10;
            return this;
        }
    }

    public LocationSettingsRequest(List<LocationRequest> list, boolean z10, boolean z11, zzbj zzbjVar) {
        this.f9459f = list;
        this.f9460g = z10;
        this.f9461h = z11;
        this.f9462i = zzbjVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38482z(parcel, 1, Collections.unmodifiableList(this.f9459f), false);
        C9718b.m38459c(parcel, 2, this.f9460g);
        C9718b.m38459c(parcel, 3, this.f9461h);
        C9718b.m38476t(parcel, 5, this.f9462i, i10, false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
