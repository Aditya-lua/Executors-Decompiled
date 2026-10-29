package com.google.android.gms.common.moduleinstall;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p325o9.C9718b;
import p405r9.C10802f;

/* JADX INFO: loaded from: classes.dex */
public class ModuleInstallIntentResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ModuleInstallIntentResponse> CREATOR = new C10802f();

    /* JADX INFO: renamed from: f */
    public final PendingIntent f7510f;

    public ModuleInstallIntentResponse(PendingIntent pendingIntent) {
        this.f7510f = pendingIntent;
    }

    /* JADX INFO: renamed from: v3 */
    public PendingIntent m9224v3() {
        return this.f7510f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38476t(parcel, 1, m9224v3(), i10, false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
