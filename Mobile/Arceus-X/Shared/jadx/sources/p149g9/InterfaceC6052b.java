package p149g9;

import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialResponse;
import com.google.android.gms.common.api.Status;
import p012ab.BinderC0107d;
import p012ab.C0108e;

/* JADX INFO: renamed from: g9.b */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC6052b extends IInterface {

    /* JADX INFO: renamed from: g9.b$a */
    public static abstract class a extends BinderC0107d implements InterfaceC6052b {
        public a() {
            super("com.google.android.gms.auth.blockstore.restorecredential.internal.IGetRestoreCredentialCallback");
        }

        @Override // p012ab.BinderC0107d
        /* JADX INFO: renamed from: r2 */
        public boolean mo307r2(int i10, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i11) {
            if (i10 != 1) {
                return false;
            }
            Status status = (Status) C0108e.m310a(parcel, Status.CREATOR);
            GetRestoreCredentialResponse getRestoreCredentialResponse = (GetRestoreCredentialResponse) C0108e.m310a(parcel, GetRestoreCredentialResponse.CREATOR);
            m308s2(parcel);
            mo26871Q(status, getRestoreCredentialResponse);
            return true;
        }
    }

    /* JADX INFO: renamed from: Q */
    void mo26871Q(@NonNull Status status, @NonNull GetRestoreCredentialResponse getRestoreCredentialResponse);
}
