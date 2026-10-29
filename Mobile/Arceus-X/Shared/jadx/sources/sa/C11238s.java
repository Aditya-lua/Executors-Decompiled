package sa;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.identitycredentials.PendingImportCredentialsHandle;
import p325o9.C9717a;
import p325o9.C9718b;

/* JADX INFO: renamed from: sa.s */
/* JADX INFO: loaded from: classes.dex */
public final class C11238s implements Parcelable.Creator<PendingImportCredentialsHandle> {
    /* JADX INFO: renamed from: c */
    public static void m42290c(PendingImportCredentialsHandle pendingImportCredentialsHandle, Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38476t(parcel, 1, pendingImportCredentialsHandle.getPendingIntent(), i10, false);
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public PendingImportCredentialsHandle createFromParcel(@NonNull Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            if (C9717a.m38440n(iM38447u) != 1) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                pendingIntent = (PendingIntent) C9717a.m38433g(parcel, iM38447u, PendingIntent.CREATOR);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new PendingImportCredentialsHandle(pendingIntent);
    }

    /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PendingImportCredentialsHandle[] newArray(int i10) {
        return new PendingImportCredentialsHandle[i10];
    }
}
