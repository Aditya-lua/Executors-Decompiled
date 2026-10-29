package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o9.b;
import r9.h;

/* JADX INFO: loaded from: classes.dex */
public class ModuleInstallResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ModuleInstallResponse> CREATOR = new h();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f5823g;

    public ModuleInstallResponse(int i10) {
        this(i10, false);
    }

    public int v3() {
        return this.f5822f;
    }

    public final boolean w3() {
        return this.f5823g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.n(parcel, 1, v3());
        b.c(parcel, 2, this.f5823g);
        b.b(parcel, iA);
    }

    public ModuleInstallResponse(int i10, boolean z10) {
        this.f5822f = i10;
        this.f5823g = z10;
    }
}
