package p446ta;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.identitycredentials.CreateCredentialRequest;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.identitycredentials.SignalCredentialStateRequest;
import gb.BinderC6082b;
import gb.C6081a;
import gb.C6083c;

/* JADX INFO: renamed from: ta.b */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC11557b extends IInterface {

    /* JADX INFO: renamed from: ta.b$a */
    public static abstract class a extends BinderC6082b implements InterfaceC11557b {

        /* JADX INFO: renamed from: ta.b$a$a, reason: collision with other inner class name */
        public static class C14259a extends C6081a implements InterfaceC11557b {
            public C14259a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
            }

            @Override // p446ta.InterfaceC11557b
            /* JADX INFO: renamed from: Z1 */
            public void mo43224Z1(@NonNull InterfaceC11556a interfaceC11556a, @NonNull GetCredentialRequest getCredentialRequest, @NonNull ApiMetadata apiMetadata) {
                Parcel parcelM26944r2 = m26944r2();
                C6083c.m26951c(parcelM26944r2, interfaceC11556a);
                C6083c.m26950b(parcelM26944r2, getCredentialRequest);
                C6083c.m26950b(parcelM26944r2, apiMetadata);
                m26945s2(1, parcelM26944r2);
            }

            @Override // p446ta.InterfaceC11557b
            /* JADX INFO: renamed from: m2 */
            public void mo43225m2(@NonNull InterfaceC11556a interfaceC11556a, @NonNull SignalCredentialStateRequest signalCredentialStateRequest, @NonNull ApiMetadata apiMetadata) {
                Parcel parcelM26944r2 = m26944r2();
                C6083c.m26951c(parcelM26944r2, interfaceC11556a);
                C6083c.m26950b(parcelM26944r2, signalCredentialStateRequest);
                C6083c.m26950b(parcelM26944r2, apiMetadata);
                m26945s2(10, parcelM26944r2);
            }

            @Override // p446ta.InterfaceC11557b
            /* JADX INFO: renamed from: x */
            public void mo43226x(@NonNull InterfaceC11556a interfaceC11556a, @NonNull CreateCredentialRequest createCredentialRequest, @NonNull ApiMetadata apiMetadata) {
                Parcel parcelM26944r2 = m26944r2();
                C6083c.m26951c(parcelM26944r2, interfaceC11556a);
                C6083c.m26950b(parcelM26944r2, createCredentialRequest);
                C6083c.m26950b(parcelM26944r2, apiMetadata);
                m26945s2(6, parcelM26944r2);
            }
        }

        @NonNull
        /* JADX INFO: renamed from: u2 */
        public static InterfaceC11557b m43227u2(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
            return iInterfaceQueryLocalInterface instanceof InterfaceC11557b ? (InterfaceC11557b) iInterfaceQueryLocalInterface : new C14259a(iBinder);
        }
    }

    /* JADX INFO: renamed from: Z1 */
    void mo43224Z1(@NonNull InterfaceC11556a interfaceC11556a, @NonNull GetCredentialRequest getCredentialRequest, @NonNull ApiMetadata apiMetadata);

    /* JADX INFO: renamed from: m2 */
    void mo43225m2(@NonNull InterfaceC11556a interfaceC11556a, @NonNull SignalCredentialStateRequest signalCredentialStateRequest, @NonNull ApiMetadata apiMetadata);

    /* JADX INFO: renamed from: x */
    void mo43226x(@NonNull InterfaceC11556a interfaceC11556a, @NonNull CreateCredentialRequest createCredentialRequest, @NonNull ApiMetadata apiMetadata);
}
