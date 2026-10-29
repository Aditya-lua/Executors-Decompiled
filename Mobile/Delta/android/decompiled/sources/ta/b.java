package ta;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.identitycredentials.CreateCredentialRequest;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.identitycredentials.SignalCredentialStateRequest;

/* JADX INFO: loaded from: classes.dex */
public interface b extends IInterface {

    public static abstract class a extends gb.b implements b {

        /* JADX INFO: renamed from: ta.b$a$a, reason: collision with other inner class name */
        public static class C0567a extends gb.a implements b {
            public C0567a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
            }

            @Override // ta.b
            public void Z1(@NonNull ta.a aVar, @NonNull GetCredentialRequest getCredentialRequest, @NonNull ApiMetadata apiMetadata) {
                Parcel parcelR2 = r2();
                gb.c.c(parcelR2, aVar);
                gb.c.b(parcelR2, getCredentialRequest);
                gb.c.b(parcelR2, apiMetadata);
                s2(1, parcelR2);
            }

            @Override // ta.b
            public void m2(@NonNull ta.a aVar, @NonNull SignalCredentialStateRequest signalCredentialStateRequest, @NonNull ApiMetadata apiMetadata) {
                Parcel parcelR2 = r2();
                gb.c.c(parcelR2, aVar);
                gb.c.b(parcelR2, signalCredentialStateRequest);
                gb.c.b(parcelR2, apiMetadata);
                s2(10, parcelR2);
            }

            @Override // ta.b
            public void x(@NonNull ta.a aVar, @NonNull CreateCredentialRequest createCredentialRequest, @NonNull ApiMetadata apiMetadata) {
                Parcel parcelR2 = r2();
                gb.c.c(parcelR2, aVar);
                gb.c.b(parcelR2, createCredentialRequest);
                gb.c.b(parcelR2, apiMetadata);
                s2(6, parcelR2);
            }
        }

        @NonNull
        public static b u2(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
            return iInterfaceQueryLocalInterface instanceof b ? (b) iInterfaceQueryLocalInterface : new C0567a(iBinder);
        }
    }

    void Z1(@NonNull ta.a aVar, @NonNull GetCredentialRequest getCredentialRequest, @NonNull ApiMetadata apiMetadata);

    void m2(@NonNull ta.a aVar, @NonNull SignalCredentialStateRequest signalCredentialStateRequest, @NonNull ApiMetadata apiMetadata);

    void x(@NonNull ta.a aVar, @NonNull CreateCredentialRequest createCredentialRequest, @NonNull ApiMetadata apiMetadata);
}
