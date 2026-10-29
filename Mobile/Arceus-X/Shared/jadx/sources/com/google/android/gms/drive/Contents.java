package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p325o9.C9718b;
import p540x9.C12773a;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class Contents extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Contents> CREATOR = new C12773a();

    /* JADX INFO: renamed from: f */
    public final ParcelFileDescriptor f7542f;

    /* JADX INFO: renamed from: g */
    public final int f7543g;

    /* JADX INFO: renamed from: h */
    public final int f7544h;

    /* JADX INFO: renamed from: i */
    public final DriveId f7545i;

    /* JADX INFO: renamed from: j */
    public final boolean f7546j;

    /* JADX INFO: renamed from: k */
    public final String f7547k;

    public Contents(@NonNull ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, @NonNull DriveId driveId, boolean z10, String str) {
        this.f7542f = parcelFileDescriptor;
        this.f7543g = i10;
        this.f7544h = i11;
        this.f7545i = driveId;
        this.f7546j = z10;
        this.f7547k = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        ParcelFileDescriptor parcelFileDescriptor = this.f7542f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38476t(parcel, 2, parcelFileDescriptor, i10, false);
        C9718b.m38470n(parcel, 3, this.f7543g);
        C9718b.m38470n(parcel, 4, this.f7544h);
        C9718b.m38476t(parcel, 5, this.f7545i, i10, false);
        C9718b.m38459c(parcel, 7, this.f7546j);
        C9718b.m38478v(parcel, 8, this.f7547k, false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
