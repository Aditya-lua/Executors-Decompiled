package p446ta;

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
import gb.BinderC6082b;
import gb.C6083c;

/* JADX INFO: renamed from: ta.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC11556a extends IInterface {

    /* JADX INFO: renamed from: ta.a$a */
    public static abstract class a extends BinderC6082b implements InterfaceC11556a {
        public a() {
            super("com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
        }

        @Override // gb.BinderC6082b
        /* JADX INFO: renamed from: r2 */
        public boolean mo26946r2(int i10, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i11) {
            switch (i10) {
                case 1:
                    Status status = (Status) C6083c.m26949a(parcel, Status.CREATOR);
                    PendingGetCredentialHandle pendingGetCredentialHandle = (PendingGetCredentialHandle) C6083c.m26949a(parcel, PendingGetCredentialHandle.CREATOR);
                    m26947s2(parcel);
                    mo43211G1(status, pendingGetCredentialHandle);
                    return true;
                case 2:
                    Status status2 = (Status) C6083c.m26949a(parcel, Status.CREATOR);
                    RegistrationResponse registrationResponse = (RegistrationResponse) C6083c.m26949a(parcel, RegistrationResponse.CREATOR);
                    m26947s2(parcel);
                    mo43214V1(status2, registrationResponse);
                    return true;
                case 3:
                    Status status3 = (Status) C6083c.m26949a(parcel, Status.CREATOR);
                    ClearRegistryResponse clearRegistryResponse = (ClearRegistryResponse) C6083c.m26949a(parcel, ClearRegistryResponse.CREATOR);
                    m26947s2(parcel);
                    mo43221i1(status3, clearRegistryResponse);
                    return true;
                case 4:
                    Status status4 = (Status) C6083c.m26949a(parcel, Status.CREATOR);
                    PendingImportCredentialsHandle pendingImportCredentialsHandle = (PendingImportCredentialsHandle) C6083c.m26949a(parcel, PendingImportCredentialsHandle.CREATOR);
                    m26947s2(parcel);
                    mo43209D(status4, pendingImportCredentialsHandle);
                    return true;
                case 5:
                    Status status5 = (Status) C6083c.m26949a(parcel, Status.CREATOR);
                    RegisterExportResponse registerExportResponse = (RegisterExportResponse) C6083c.m26949a(parcel, RegisterExportResponse.CREATOR);
                    m26947s2(parcel);
                    mo43218f2(status5, registerExportResponse);
                    return true;
                case 6:
                    Status status6 = (Status) C6083c.m26949a(parcel, Status.CREATOR);
                    CreateCredentialResponse createCredentialResponse = (CreateCredentialResponse) C6083c.m26949a(parcel, CreateCredentialResponse.CREATOR);
                    m26947s2(parcel);
                    mo43210D0(status6, createCredentialResponse);
                    return true;
                case 7:
                    Status status7 = (Status) C6083c.m26949a(parcel, Status.CREATOR);
                    CreateCredentialHandle createCredentialHandle = (CreateCredentialHandle) C6083c.m26949a(parcel, CreateCredentialHandle.CREATOR);
                    m26947s2(parcel);
                    mo43213S0(status7, createCredentialHandle);
                    return true;
                case 8:
                    Status status8 = (Status) C6083c.m26949a(parcel, Status.CREATOR);
                    RegisterCreationOptionsResponse registerCreationOptionsResponse = (RegisterCreationOptionsResponse) C6083c.m26949a(parcel, RegisterCreationOptionsResponse.CREATOR);
                    m26947s2(parcel);
                    mo43217c1(status8, registerCreationOptionsResponse);
                    return true;
                case 9:
                    Status status9 = (Status) C6083c.m26949a(parcel, Status.CREATOR);
                    ClearCredentialStateResponse clearCredentialStateResponse = (ClearCredentialStateResponse) C6083c.m26949a(parcel, ClearCredentialStateResponse.CREATOR);
                    m26947s2(parcel);
                    mo43216b2(status9, clearCredentialStateResponse);
                    return true;
                case 10:
                    Status status10 = (Status) C6083c.m26949a(parcel, Status.CREATOR);
                    SignalCredentialStateResponse signalCredentialStateResponse = (SignalCredentialStateResponse) C6083c.m26949a(parcel, SignalCredentialStateResponse.CREATOR);
                    m26947s2(parcel);
                    mo43215b1(status10, signalCredentialStateResponse);
                    return true;
                case 11:
                    Status status11 = (Status) C6083c.m26949a(parcel, Status.CREATOR);
                    ClearExportResponse clearExportResponse = (ClearExportResponse) C6083c.m26949a(parcel, ClearExportResponse.CREATOR);
                    m26947s2(parcel);
                    mo43222n1(status11, clearExportResponse);
                    return true;
                case 12:
                    Status status12 = (Status) C6083c.m26949a(parcel, Status.CREATOR);
                    ImportCredentialsForDeviceSetupResponse importCredentialsForDeviceSetupResponse = (ImportCredentialsForDeviceSetupResponse) C6083c.m26949a(parcel, ImportCredentialsForDeviceSetupResponse.CREATOR);
                    m26947s2(parcel);
                    mo43212N0(status12, importCredentialsForDeviceSetupResponse);
                    return true;
                case 13:
                    Status status13 = (Status) C6083c.m26949a(parcel, Status.CREATOR);
                    ExportCredentialsToDeviceSetupResponse exportCredentialsToDeviceSetupResponse = (ExportCredentialsToDeviceSetupResponse) C6083c.m26949a(parcel, ExportCredentialsToDeviceSetupResponse.CREATOR);
                    m26947s2(parcel);
                    mo43219h2(status13, exportCredentialsToDeviceSetupResponse);
                    return true;
                case 14:
                    Status status14 = (Status) C6083c.m26949a(parcel, Status.CREATOR);
                    CredentialTransferCapabilities credentialTransferCapabilities = (CredentialTransferCapabilities) C6083c.m26949a(parcel, CredentialTransferCapabilities.CREATOR);
                    m26947s2(parcel);
                    mo43223p1(status14, credentialTransferCapabilities);
                    return true;
                case 15:
                    Status status15 = (Status) C6083c.m26949a(parcel, Status.CREATOR);
                    ClearCreationOptionsResponse clearCreationOptionsResponse = (ClearCreationOptionsResponse) C6083c.m26949a(parcel, ClearCreationOptionsResponse.CREATOR);
                    m26947s2(parcel);
                    mo43220i0(status15, clearCreationOptionsResponse);
                    return true;
                default:
                    return false;
            }
        }
    }

    /* JADX INFO: renamed from: D */
    void mo43209D(@NonNull Status status, PendingImportCredentialsHandle pendingImportCredentialsHandle);

    /* JADX INFO: renamed from: D0 */
    void mo43210D0(@NonNull Status status, CreateCredentialResponse createCredentialResponse);

    /* JADX INFO: renamed from: G1 */
    void mo43211G1(@NonNull Status status, PendingGetCredentialHandle pendingGetCredentialHandle);

    /* JADX INFO: renamed from: N0 */
    void mo43212N0(@NonNull Status status, ImportCredentialsForDeviceSetupResponse importCredentialsForDeviceSetupResponse);

    /* JADX INFO: renamed from: S0 */
    void mo43213S0(@NonNull Status status, CreateCredentialHandle createCredentialHandle);

    /* JADX INFO: renamed from: V1 */
    void mo43214V1(@NonNull Status status, RegistrationResponse registrationResponse);

    /* JADX INFO: renamed from: b1 */
    void mo43215b1(@NonNull Status status, SignalCredentialStateResponse signalCredentialStateResponse);

    /* JADX INFO: renamed from: b2 */
    void mo43216b2(@NonNull Status status, ClearCredentialStateResponse clearCredentialStateResponse);

    /* JADX INFO: renamed from: c1 */
    void mo43217c1(@NonNull Status status, RegisterCreationOptionsResponse registerCreationOptionsResponse);

    /* JADX INFO: renamed from: f2 */
    void mo43218f2(@NonNull Status status, RegisterExportResponse registerExportResponse);

    /* JADX INFO: renamed from: h2 */
    void mo43219h2(@NonNull Status status, ExportCredentialsToDeviceSetupResponse exportCredentialsToDeviceSetupResponse);

    /* JADX INFO: renamed from: i0 */
    void mo43220i0(@NonNull Status status, ClearCreationOptionsResponse clearCreationOptionsResponse);

    /* JADX INFO: renamed from: i1 */
    void mo43221i1(@NonNull Status status, ClearRegistryResponse clearRegistryResponse);

    /* JADX INFO: renamed from: n1 */
    void mo43222n1(@NonNull Status status, ClearExportResponse clearExportResponse);

    /* JADX INFO: renamed from: p1 */
    void mo43223p1(@NonNull Status status, CredentialTransferCapabilities credentialTransferCapabilities);
}
