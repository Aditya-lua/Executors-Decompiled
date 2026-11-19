package h9;

import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: h9.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0344a extends bb.d implements a {
        public AbstractBinderC0344a() {
            super("com.google.android.gms.auth.blockstore.restorecredential.internal.ICreateRestoreCredentialCallback");
        }

        @Override // bb.d
        public boolean r2(int i10, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i11) {
            if (i10 != 1) {
                return false;
            }
            Status status = (Status) bb.e.a(parcel, Status.CREATOR);
            g9.c cVar = (g9.c) bb.e.a(parcel, g9.c.CREATOR);
            s2(parcel);
            N0(status, cVar);
            return true;
        }
    }

    void N0(@NonNull Status status, @NonNull g9.c cVar);
}
