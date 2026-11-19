package h9;

import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public interface b extends IInterface {

    public static abstract class a extends bb.d implements b {
        public a() {
            super("com.google.android.gms.auth.blockstore.restorecredential.internal.IGetRestoreCredentialCallback");
        }

        @Override // bb.d
        public boolean r2(int i10, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i11) {
            if (i10 != 1) {
                return false;
            }
            Status status = (Status) bb.e.a(parcel, Status.CREATOR);
            g9.g gVar = (g9.g) bb.e.a(parcel, g9.g.CREATOR);
            s2(parcel);
            y0(status, gVar);
            return true;
        }
    }

    void y0(@NonNull Status status, @NonNull g9.g gVar);
}
