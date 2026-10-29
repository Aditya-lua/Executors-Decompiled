package sa;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.identitycredentials.CredentialTransferCapabilities;
import p325o9.C9717a;
import p325o9.C9718b;

/* JADX INFO: renamed from: sa.j */
/* JADX INFO: loaded from: classes.dex */
public final class C11229j implements Parcelable.Creator<CredentialTransferCapabilities> {
    /* JADX INFO: renamed from: c */
    public static void m42267c(CredentialTransferCapabilities credentialTransferCapabilities, Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38462f(parcel, 1, credentialTransferCapabilities.getResponseBundle(), false);
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public CredentialTransferCapabilities createFromParcel(@NonNull Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        Bundle bundleM38428b = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            if (C9717a.m38440n(iM38447u) != 1) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                bundleM38428b = C9717a.m38428b(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new CredentialTransferCapabilities(bundleM38428b);
    }

    /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CredentialTransferCapabilities[] newArray(int i10) {
        return new CredentialTransferCapabilities[i10];
    }
}
