package ta;

import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.ClearCreationOptionsResponse;
import com.google.android.gms.identitycredentials.ClearCredentialStateResponse;
import com.google.android.gms.identitycredentials.ClearExportResponse;
import com.google.android.gms.identitycredentials.ClearRegistryResponse;
import com.google.android.gms.identitycredentials.CreateCredentialHandle;
import com.google.android.gms.identitycredentials.CreateCredentialResponse;
import com.google.android.gms.identitycredentials.CredentialTransferCapabilities;
import com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupResponse;
import com.google.android.gms.identitycredentials.ImportCredentialsForDeviceSetupResponse;
import com.google.android.gms.identitycredentials.PendingGetCredentialHandle;
import com.google.android.gms.identitycredentials.PendingImportCredentialsHandle;
import com.google.android.gms.identitycredentials.RegisterCreationOptionsResponse;
import com.google.android.gms.identitycredentials.RegisterExportResponse;
import com.google.android.gms.identitycredentials.RegistrationResponse;
import com.google.android.gms.identitycredentials.SignalCredentialStateResponse;

/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: ta.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0566a extends gb.b implements a {
        public AbstractBinderC0566a() {
            super("com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
        }

        @Override // gb.b
        public boolean r2(int i10, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i11) {
            switch (i10) {
                case 1:
                    Status status = (Status) gb.c.a(parcel, Status.CREATOR);
                    PendingGetCredentialHandle pendingGetCredentialHandle = (PendingGetCredentialHandle) gb.c.a(parcel, PendingGetCredentialHandle.CREATOR);
                    s2(parcel);
                    G1(status, pendingGetCredentialHandle);
                    return true;
                case 2:
                    Status status2 = (Status) gb.c.a(parcel, Status.CREATOR);
                    RegistrationResponse registrationResponse = (RegistrationResponse) gb.c.a(parcel, RegistrationResponse.CREATOR);
                    s2(parcel);
                    V1(status2, registrationResponse);
                    return true;
                case 3:
                    Status status3 = (Status) gb.c.a(parcel, Status.CREATOR);
                    ClearRegistryResponse clearRegistryResponse = (ClearRegistryResponse) gb.c.a(parcel, ClearRegistryResponse.CREATOR);
                    s2(parcel);
                    m1(status3, clearRegistryResponse);
                    return true;
                case 4:
                    Status status4 = (Status) gb.c.a(parcel, Status.CREATOR);
                    PendingImportCredentialsHandle pendingImportCredentialsHandle = (PendingImportCredentialsHandle) gb.c.a(parcel, PendingImportCredentialsHandle.CREATOR);
                    s2(parcel);
                    D(status4, pendingImportCredentialsHandle);
                    return true;
                case 5:
                    Status status5 = (Status) gb.c.a(parcel, Status.CREATOR);
                    RegisterExportResponse registerExportResponse = (RegisterExportResponse) gb.c.a(parcel, RegisterExportResponse.CREATOR);
                    s2(parcel);
                    f2(status5, registerExportResponse);
                    return true;
                case 6:
                    Status status6 = (Status) gb.c.a(parcel, Status.CREATOR);
                    CreateCredentialResponse createCredentialResponse = (CreateCredentialResponse) gb.c.a(parcel, CreateCredentialResponse.CREATOR);
                    s2(parcel);
                    J0(status6, createCredentialResponse);
                    return true;
                case 7:
                    Status status7 = (Status) gb.c.a(parcel, Status.CREATOR);
                    CreateCredentialHandle createCredentialHandle = (CreateCredentialHandle) gb.c.a(parcel, CreateCredentialHandle.CREATOR);
                    s2(parcel);
                    V0(status7, createCredentialHandle);
                    return true;
                case 8:
                    Status status8 = (Status) gb.c.a(parcel, Status.CREATOR);
                    RegisterCreationOptionsResponse registerCreationOptionsResponse = (RegisterCreationOptionsResponse) gb.c.a(parcel, RegisterCreationOptionsResponse.CREATOR);
                    s2(parcel);
                    g1(status8, registerCreationOptionsResponse);
                    return true;
                case 9:
                    Status status9 = (Status) gb.c.a(parcel, Status.CREATOR);
                    ClearCredentialStateResponse clearCredentialStateResponse = (ClearCredentialStateResponse) gb.c.a(parcel, ClearCredentialStateResponse.CREATOR);
                    s2(parcel);
                    b2(status9, clearCredentialStateResponse);
                    return true;
                case 10:
                    Status status10 = (Status) gb.c.a(parcel, Status.CREATOR);
                    SignalCredentialStateResponse signalCredentialStateResponse = (SignalCredentialStateResponse) gb.c.a(parcel, SignalCredentialStateResponse.CREATOR);
                    s2(parcel);
                    e1(status10, signalCredentialStateResponse);
                    return true;
                case 11:
                    Status status11 = (Status) gb.c.a(parcel, Status.CREATOR);
                    ClearExportResponse clearExportResponse = (ClearExportResponse) gb.c.a(parcel, ClearExportResponse.CREATOR);
                    s2(parcel);
                    q1(status11, clearExportResponse);
                    return true;
                case 12:
                    Status status12 = (Status) gb.c.a(parcel, Status.CREATOR);
                    ImportCredentialsForDeviceSetupResponse importCredentialsForDeviceSetupResponse = (ImportCredentialsForDeviceSetupResponse) gb.c.a(parcel, ImportCredentialsForDeviceSetupResponse.CREATOR);
                    s2(parcel);
                    Q0(status12, importCredentialsForDeviceSetupResponse);
                    return true;
                case 13:
                    Status status13 = (Status) gb.c.a(parcel, Status.CREATOR);
                    ExportCredentialsToDeviceSetupResponse exportCredentialsToDeviceSetupResponse = (ExportCredentialsToDeviceSetupResponse) gb.c.a(parcel, ExportCredentialsToDeviceSetupResponse.CREATOR);
                    s2(parcel);
                    h2(status13, exportCredentialsToDeviceSetupResponse);
                    return true;
                case 14:
                    Status status14 = (Status) gb.c.a(parcel, Status.CREATOR);
                    CredentialTransferCapabilities credentialTransferCapabilities = (CredentialTransferCapabilities) gb.c.a(parcel, CredentialTransferCapabilities.CREATOR);
                    s2(parcel);
                    s1(status14, credentialTransferCapabilities);
                    return true;
                case 15:
                    Status status15 = (Status) gb.c.a(parcel, Status.CREATOR);
                    ClearCreationOptionsResponse clearCreationOptionsResponse = (ClearCreationOptionsResponse) gb.c.a(parcel, ClearCreationOptionsResponse.CREATOR);
                    s2(parcel);
                    l0(status15, clearCreationOptionsResponse);
                    return true;
                default:
                    return false;
            }
        }
    }

    void D(@NonNull Status status, PendingImportCredentialsHandle pendingImportCredentialsHandle);

    void G1(@NonNull Status status, PendingGetCredentialHandle pendingGetCredentialHandle);

    void J0(@NonNull Status status, CreateCredentialResponse createCredentialResponse);

    void Q0(@NonNull Status status, ImportCredentialsForDeviceSetupResponse importCredentialsForDeviceSetupResponse);

    void V0(@NonNull Status status, CreateCredentialHandle createCredentialHandle);

    void V1(@NonNull Status status, RegistrationResponse registrationResponse);

    void b2(@NonNull Status status, ClearCredentialStateResponse clearCredentialStateResponse);

    void e1(@NonNull Status status, SignalCredentialStateResponse signalCredentialStateResponse);

    void f2(@NonNull Status status, RegisterExportResponse registerExportResponse);

    void g1(@NonNull Status status, RegisterCreationOptionsResponse registerCreationOptionsResponse);

    void h2(@NonNull Status status, ExportCredentialsToDeviceSetupResponse exportCredentialsToDeviceSetupResponse);

    void l0(@NonNull Status status, ClearCreationOptionsResponse clearCreationOptionsResponse);

    void m1(@NonNull Status status, ClearRegistryResponse clearRegistryResponse);

    void q1(@NonNull Status status, ClearExportResponse clearExportResponse);

    void s1(@NonNull Status status, CredentialTransferCapabilities credentialTransferCapabilities);
}
