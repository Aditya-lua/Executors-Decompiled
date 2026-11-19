package h9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface c extends IInterface {

    public static abstract class a extends bb.d implements c {

        /* JADX INFO: renamed from: h9.c$a$a, reason: collision with other inner class name */
        public static class C0345a extends bb.a implements c {
            public C0345a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService");
            }

            @Override // h9.c
            public void h0(@NonNull g9.a aVar, @NonNull h9.a aVar2) {
                Parcel parcelR2 = r2();
                bb.e.b(parcelR2, aVar);
                bb.e.c(parcelR2, aVar2);
                s2(3, parcelR2);
            }

            @Override // h9.c
            public void r(@NonNull g9.e eVar, @NonNull b bVar) {
                Parcel parcelR2 = r2();
                bb.e.b(parcelR2, eVar);
                bb.e.c(parcelR2, bVar);
                s2(2, parcelR2);
            }
        }

        @NonNull
        public static c u2(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService");
            return iInterfaceQueryLocalInterface instanceof c ? (c) iInterfaceQueryLocalInterface : new C0345a(iBinder);
        }
    }

    void h0(@NonNull g9.a aVar, @NonNull h9.a aVar2);

    void r(@NonNull g9.e eVar, @NonNull b bVar);
}
