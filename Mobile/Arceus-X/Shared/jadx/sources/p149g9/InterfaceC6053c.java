package p149g9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialRequest;
import p012ab.BinderC0107d;
import p012ab.C0104a;
import p012ab.C0108e;

/* JADX INFO: renamed from: g9.c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC6053c extends IInterface {

    /* JADX INFO: renamed from: g9.c$a */
    public static abstract class a extends BinderC0107d implements InterfaceC6053c {

        /* JADX INFO: renamed from: g9.c$a$a, reason: collision with other inner class name */
        public static class C14171a extends C0104a implements InterfaceC6053c {
            public C14171a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService");
            }

            @Override // p149g9.InterfaceC6053c
            /* JADX INFO: renamed from: H0 */
            public void mo26872H0(@NonNull GetRestoreCredentialRequest getRestoreCredentialRequest, @NonNull InterfaceC6052b interfaceC6052b) {
                Parcel parcelM301r2 = m301r2();
                C0108e.m311b(parcelM301r2, getRestoreCredentialRequest);
                C0108e.m312c(parcelM301r2, interfaceC6052b);
                m302s2(2, parcelM301r2);
            }

            @Override // p149g9.InterfaceC6053c
            /* JADX INFO: renamed from: y */
            public void mo26873y(@NonNull CreateRestoreCredentialRequest createRestoreCredentialRequest, @NonNull InterfaceC6051a interfaceC6051a) {
                Parcel parcelM301r2 = m301r2();
                C0108e.m311b(parcelM301r2, createRestoreCredentialRequest);
                C0108e.m312c(parcelM301r2, interfaceC6051a);
                m302s2(3, parcelM301r2);
            }
        }

        @NonNull
        /* JADX INFO: renamed from: u2 */
        public static InterfaceC6053c m26874u2(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService");
            return iInterfaceQueryLocalInterface instanceof InterfaceC6053c ? (InterfaceC6053c) iInterfaceQueryLocalInterface : new C14171a(iBinder);
        }
    }

    /* JADX INFO: renamed from: H0 */
    void mo26872H0(@NonNull GetRestoreCredentialRequest getRestoreCredentialRequest, @NonNull InterfaceC6052b interfaceC6052b);

    /* JADX INFO: renamed from: y */
    void mo26873y(@NonNull CreateRestoreCredentialRequest createRestoreCredentialRequest, @NonNull InterfaceC6051a interfaceC6051a);
}
