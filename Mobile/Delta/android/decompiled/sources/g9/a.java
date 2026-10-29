package g9;

import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialResponse;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: g9.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0321a extends ab.d implements a {
        public AbstractBinderC0321a() {
            super("com.google.android.gms.auth.blockstore.restorecredential.internal.ICreateRestoreCredentialCallback");
        }

        @Override // ab.d
        public boolean r2(int i10, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i11) {
            if (i10 != 1) {
                return false;
            }
            Status status = (Status) ab.e.a(parcel, Status.CREATOR);
            CreateRestoreCredentialResponse createRestoreCredentialResponse = (CreateRestoreCredentialResponse) ab.e.a(parcel, CreateRestoreCredentialResponse.CREATOR);
            s2(parcel);
            P0(status, createRestoreCredentialResponse);
            return true;
        }
    }

    void P0(@NonNull Status status, @NonNull CreateRestoreCredentialResponse createRestoreCredentialResponse);
}
