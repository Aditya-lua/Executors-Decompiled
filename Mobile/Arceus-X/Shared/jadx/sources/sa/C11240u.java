package sa;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.identitycredentials.RegisterExportResponse;
import p325o9.C9717a;
import p325o9.C9718b;

/* JADX INFO: renamed from: sa.u */
/* JADX INFO: loaded from: classes.dex */
public final class C11240u implements Parcelable.Creator<RegisterExportResponse> {
    /* JADX INFO: renamed from: c */
    public static void m42296c(RegisterExportResponse registerExportResponse, Parcel parcel, int i10) {
        C9718b.m38458b(parcel, C9718b.m38457a(parcel));
    }

    /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public RegisterExportResponse createFromParcel(@NonNull Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            C9717a.m38440n(iM38447u);
            C9717a.m38423C(parcel, iM38447u);
        }
        C9717a.m38439m(parcel, iM38424D);
        return new RegisterExportResponse();
    }

    /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RegisterExportResponse[] newArray(int i10) {
        return new RegisterExportResponse[i10];
    }
}
