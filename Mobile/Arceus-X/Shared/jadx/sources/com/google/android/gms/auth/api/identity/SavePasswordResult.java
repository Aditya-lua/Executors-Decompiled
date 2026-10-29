package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p305n9.C8947k;
import p305n9.C8953m;
import p325o9.C9718b;
import p598z8.C13746j;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class SavePasswordResult extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SavePasswordResult> CREATOR = new C13746j();

    /* JADX INFO: renamed from: f */
    public final PendingIntent f7276f;

    public SavePasswordResult(@NonNull PendingIntent pendingIntent) {
        this.f7276f = (PendingIntent) C8953m.m36047l(pendingIntent);
    }

    public boolean equals(Object obj) {
        if (obj instanceof SavePasswordResult) {
            return C8947k.m36026b(this.f7276f, ((SavePasswordResult) obj).f7276f);
        }
        return false;
    }

    public int hashCode() {
        return C8947k.m36027c(this.f7276f);
    }

    @NonNull
    /* JADX INFO: renamed from: v3 */
    public PendingIntent m9051v3() {
        return this.f7276f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38476t(parcel, 1, m9051v3(), i10, false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
