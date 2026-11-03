package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lb.x;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
public final class LocationSettingsRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new x();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<LocationRequest> f7456f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f7457g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f7458h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public zzbj f7459i;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList<LocationRequest> f7460a = new ArrayList<>();
        public boolean b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f7461c = false;

        @NonNull
        public a a(@NonNull LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.f7460a.add(locationRequest);
            }
            return this;
        }

        @NonNull
        public LocationSettingsRequest b() {
            return new LocationSettingsRequest(this.f7460a, this.b, this.f7461c, null);
        }

        @NonNull
        public a c(boolean z10) {
            this.b = z10;
            return this;
        }
    }

    public LocationSettingsRequest(List<LocationRequest> list, boolean z10, boolean z11, zzbj zzbjVar) {
        this.f7456f = list;
        this.f7457g = z10;
        this.f7458h = z11;
        this.f7459i = zzbjVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.z(parcel, 1, Collections.unmodifiableList(this.f7456f), false);
        b.c(parcel, 2, this.f7457g);
        b.c(parcel, 3, this.f7458h);
        b.t(parcel, 5, this.f7459i, i10, false);
        b.b(parcel, iA);
    }
}
