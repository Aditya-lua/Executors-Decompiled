package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.k;
import z8.f;
import z8.g;

/* JADX INFO: loaded from: classes.dex */
public class GetPhoneNumberHintIntentRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GetPhoneNumberHintIntentRequest> CREATOR = new g();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5584f;

    public static final class a {
        public /* synthetic */ a(f fVar) {
        }

        @NonNull
        public GetPhoneNumberHintIntentRequest a() {
            return new GetPhoneNumberHintIntentRequest(0);
        }
    }

    public GetPhoneNumberHintIntentRequest(int i10) {
        this.f5584f = i10;
    }

    @NonNull
    public static a v3() {
        return new a(null);
    }

    public boolean equals(Object obj) {
        if (obj instanceof GetPhoneNumberHintIntentRequest) {
            return k.b(Integer.valueOf(this.f5584f), Integer.valueOf(((GetPhoneNumberHintIntentRequest) obj).f5584f));
        }
        return false;
    }

    public int hashCode() {
        return k.c(Integer.valueOf(this.f5584f));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.f5584f;
        int iA = o9.b.a(parcel);
        o9.b.n(parcel, 1, i11);
        o9.b.b(parcel, iA);
    }
}
