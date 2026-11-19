package ua;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.NonNull;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import ta.k;
import ta.o0;

/* JADX INFO: loaded from: classes.dex */
public interface b extends IInterface {

    public static abstract class a extends hb.b implements b {

        /* JADX INFO: renamed from: ua.b$a$a, reason: collision with other inner class name */
        public static class C0672a extends hb.a implements b {
            public C0672a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
            }

            @Override // ua.b
            public void I(@NonNull ua.a aVar, @NonNull o0 o0Var, @NonNull l9.c cVar) {
                Parcel parcelR2 = r2();
                hb.c.c(parcelR2, aVar);
                hb.c.b(parcelR2, o0Var);
                hb.c.b(parcelR2, cVar);
                s2(10, parcelR2);
            }

            @Override // ua.b
            public void q1(@NonNull ua.a aVar, @NonNull k kVar, @NonNull l9.c cVar) {
                Parcel parcelR2 = r2();
                hb.c.c(parcelR2, aVar);
                hb.c.b(parcelR2, kVar);
                hb.c.b(parcelR2, cVar);
                s2(6, parcelR2);
            }

            @Override // ua.b
            public void v0(@NonNull ua.a aVar, @NonNull GetCredentialRequest getCredentialRequest, @NonNull l9.c cVar) {
                Parcel parcelR2 = r2();
                hb.c.c(parcelR2, aVar);
                hb.c.b(parcelR2, getCredentialRequest);
                hb.c.b(parcelR2, cVar);
                s2(1, parcelR2);
            }
        }

        @NonNull
        public static b u2(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
            return iInterfaceQueryLocalInterface instanceof b ? (b) iInterfaceQueryLocalInterface : new C0672a(iBinder);
        }
    }

    void I(@NonNull ua.a aVar, @NonNull o0 o0Var, @NonNull l9.c cVar);

    void q1(@NonNull ua.a aVar, @NonNull k kVar, @NonNull l9.c cVar);

    void v0(@NonNull ua.a aVar, @NonNull GetCredentialRequest getCredentialRequest, @NonNull l9.c cVar);
}
