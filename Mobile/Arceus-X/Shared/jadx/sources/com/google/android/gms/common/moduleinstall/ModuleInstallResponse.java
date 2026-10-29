package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p325o9.C9718b;
import p405r9.C10804h;

/* JADX INFO: loaded from: classes.dex */
public class ModuleInstallResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ModuleInstallResponse> CREATOR = new C10804h();

    /* JADX INFO: renamed from: f */
    public final int f7511f;

    /* JADX INFO: renamed from: g */
    public final boolean f7512g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ModuleInstallResponse(int i10) {
        this(i10, false);
    }

    /* JADX INFO: renamed from: v3 */
    public int m9225v3() {
        return this.f7511f;
    }

    /* JADX INFO: renamed from: w3 */
    public final boolean m9226w3() {
        return this.f7512g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, m9225v3());
        C9718b.m38459c(parcel, 2, this.f7512g);
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ModuleInstallResponse(int i10, boolean z10) {
        this.f7511f = i10;
        this.f7512g = z10;
    }
}
