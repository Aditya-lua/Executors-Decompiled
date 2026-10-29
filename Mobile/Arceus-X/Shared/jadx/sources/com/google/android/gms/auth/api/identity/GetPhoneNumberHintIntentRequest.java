package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p305n9.C8947k;
import p325o9.C9718b;
import p598z8.C13742f;
import p598z8.C13743g;

/* JADX INFO: loaded from: classes.dex */
public class GetPhoneNumberHintIntentRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GetPhoneNumberHintIntentRequest> CREATOR = new C13743g();

    /* JADX INFO: renamed from: f */
    public final int f7257f;

    /* JADX INFO: renamed from: com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest$a */
    public static final class C1877a {
        public /* synthetic */ C1877a(C13742f c13742f) {
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public GetPhoneNumberHintIntentRequest m9030a() {
            return new GetPhoneNumberHintIntentRequest(0);
        }
    }

    public GetPhoneNumberHintIntentRequest(int i10) {
        this.f7257f = i10;
    }

    @NonNull
    /* JADX INFO: renamed from: v3 */
    public static C1877a m9029v3() {
        return new C1877a(null);
    }

    public boolean equals(Object obj) {
        if (obj instanceof GetPhoneNumberHintIntentRequest) {
            return C8947k.m36026b(Integer.valueOf(this.f7257f), Integer.valueOf(((GetPhoneNumberHintIntentRequest) obj).f7257f));
        }
        return false;
    }

    public int hashCode() {
        return C8947k.m36027c(Integer.valueOf(this.f7257f));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.f7257f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, i11);
        C9718b.m38458b(parcel, iM38457a);
    }
}
