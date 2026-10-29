package p149g9;

import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialResponse;
import com.google.android.gms.common.api.Status;
import p012ab.BinderC0107d;
import p012ab.C0108e;

/* JADX INFO: renamed from: g9.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC6051a extends IInterface {

    /* JADX INFO: renamed from: g9.a$a */
    public static abstract class a extends BinderC0107d implements InterfaceC6051a {
        public a() {
            super("com.google.android.gms.auth.blockstore.restorecredential.internal.ICreateRestoreCredentialCallback");
        }

        @Override // p012ab.BinderC0107d
        /* JADX INFO: renamed from: r2 */
        public boolean mo307r2(int i10, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i11) {
            if (i10 != 1) {
                return false;
            }
            Status status = (Status) C0108e.m310a(parcel, Status.CREATOR);
            CreateRestoreCredentialResponse createRestoreCredentialResponse = (CreateRestoreCredentialResponse) C0108e.m310a(parcel, CreateRestoreCredentialResponse.CREATOR);
            m308s2(parcel);
            mo26870M0(status, createRestoreCredentialResponse);
            return true;
        }
    }

    /* JADX INFO: renamed from: M0 */
    void mo26870M0(@NonNull Status status, @NonNull CreateRestoreCredentialResponse createRestoreCredentialResponse);
}
