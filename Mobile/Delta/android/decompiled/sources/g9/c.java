package g9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialRequest;

/* JADX INFO: loaded from: classes.dex */
public interface c extends IInterface {

    public static abstract class a extends ab.d implements c {

        /* JADX INFO: renamed from: g9.c$a$a, reason: collision with other inner class name */
        public static class C0322a extends ab.a implements c {
            public C0322a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService");
            }

            @Override // g9.c
            public void M0(@NonNull GetRestoreCredentialRequest getRestoreCredentialRequest, @NonNull b bVar) {
                Parcel parcelR2 = r2();
                ab.e.b(parcelR2, getRestoreCredentialRequest);
                ab.e.c(parcelR2, bVar);
                s2(2, parcelR2);
            }

            @Override // g9.c
            public void y(@NonNull CreateRestoreCredentialRequest createRestoreCredentialRequest, @NonNull g9.a aVar) {
                Parcel parcelR2 = r2();
                ab.e.b(parcelR2, createRestoreCredentialRequest);
                ab.e.c(parcelR2, aVar);
                s2(3, parcelR2);
            }
        }

        @NonNull
        public static c u2(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService");
            return iInterfaceQueryLocalInterface instanceof c ? (c) iInterfaceQueryLocalInterface : new C0322a(iBinder);
        }
    }

    void M0(@NonNull GetRestoreCredentialRequest getRestoreCredentialRequest, @NonNull b bVar);

    void y(@NonNull CreateRestoreCredentialRequest createRestoreCredentialRequest, @NonNull g9.a aVar);
}
