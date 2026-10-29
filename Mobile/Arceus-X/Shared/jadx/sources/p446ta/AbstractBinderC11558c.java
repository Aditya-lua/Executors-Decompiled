package p446ta;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
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
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ta.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010!\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b!\u0010\"J!\u0010$\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b$\u0010%J!\u0010'\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b'\u0010(J!\u0010*\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b*\u0010+J!\u0010-\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b-\u0010.J!\u00100\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b0\u00101J!\u00103\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b3\u00104¨\u00065"}, m31665d2 = {"Lta/c;", "Lta/a$a;", "<init>", "()V", "Lcom/google/android/gms/common/api/Status;", NotificationCompat.CATEGORY_STATUS, "Lcom/google/android/gms/identitycredentials/RegistrationResponse;", "result", "", "V1", "(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/identitycredentials/RegistrationResponse;)V", "Lcom/google/android/gms/identitycredentials/PendingGetCredentialHandle;", "G1", "(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/identitycredentials/PendingGetCredentialHandle;)V", "Lcom/google/android/gms/identitycredentials/CreateCredentialResponse;", "D0", "(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/identitycredentials/CreateCredentialResponse;)V", "Lcom/google/android/gms/identitycredentials/CreateCredentialHandle;", "S0", "(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/identitycredentials/CreateCredentialHandle;)V", "Lcom/google/android/gms/identitycredentials/ClearRegistryResponse;", "i1", "(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/identitycredentials/ClearRegistryResponse;)V", "Lcom/google/android/gms/identitycredentials/PendingImportCredentialsHandle;", "D", "(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/identitycredentials/PendingImportCredentialsHandle;)V", "Lcom/google/android/gms/identitycredentials/RegisterExportResponse;", "f2", "(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/identitycredentials/RegisterExportResponse;)V", "Lcom/google/android/gms/identitycredentials/RegisterCreationOptionsResponse;", "c1", "(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/identitycredentials/RegisterCreationOptionsResponse;)V", "Lcom/google/android/gms/identitycredentials/ClearCredentialStateResponse;", "b2", "(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/identitycredentials/ClearCredentialStateResponse;)V", "Lcom/google/android/gms/identitycredentials/SignalCredentialStateResponse;", "b1", "(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/identitycredentials/SignalCredentialStateResponse;)V", "Lcom/google/android/gms/identitycredentials/ClearExportResponse;", "n1", "(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/identitycredentials/ClearExportResponse;)V", "Lcom/google/android/gms/identitycredentials/ImportCredentialsForDeviceSetupResponse;", "N0", "(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/identitycredentials/ImportCredentialsForDeviceSetupResponse;)V", "Lcom/google/android/gms/identitycredentials/ExportCredentialsToDeviceSetupResponse;", "h2", "(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/identitycredentials/ExportCredentialsToDeviceSetupResponse;)V", "Lcom/google/android/gms/identitycredentials/CredentialTransferCapabilities;", "p1", "(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/identitycredentials/CredentialTransferCapabilities;)V", "Lcom/google/android/gms/identitycredentials/ClearCreationOptionsResponse;", "i0", "(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/identitycredentials/ClearCreationOptionsResponse;)V", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public abstract class AbstractBinderC11558c extends InterfaceC11556a.a {
    @Override // p446ta.InterfaceC11556a
    /* JADX INFO: renamed from: D */
    public void mo43209D(@NonNull Status status, @Nullable PendingImportCredentialsHandle result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // p446ta.InterfaceC11556a
    /* JADX INFO: renamed from: D0 */
    public void mo43210D0(@NonNull Status status, @Nullable CreateCredentialResponse result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // p446ta.InterfaceC11556a
    /* JADX INFO: renamed from: G1 */
    public void mo43211G1(@NonNull Status status, @Nullable PendingGetCredentialHandle result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // p446ta.InterfaceC11556a
    /* JADX INFO: renamed from: N0 */
    public void mo43212N0(@NonNull Status status, @Nullable ImportCredentialsForDeviceSetupResponse result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // p446ta.InterfaceC11556a
    /* JADX INFO: renamed from: S0 */
    public void mo43213S0(@NonNull Status status, @Nullable CreateCredentialHandle result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // p446ta.InterfaceC11556a
    /* JADX INFO: renamed from: V1 */
    public void mo43214V1(@NonNull Status status, @Nullable RegistrationResponse result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // p446ta.InterfaceC11556a
    /* JADX INFO: renamed from: b1 */
    public void mo43215b1(@NonNull Status status, @Nullable SignalCredentialStateResponse result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // p446ta.InterfaceC11556a
    /* JADX INFO: renamed from: b2 */
    public void mo43216b2(@NonNull Status status, @Nullable ClearCredentialStateResponse result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // p446ta.InterfaceC11556a
    /* JADX INFO: renamed from: c1 */
    public void mo43217c1(@NonNull Status status, @Nullable RegisterCreationOptionsResponse result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // p446ta.InterfaceC11556a
    /* JADX INFO: renamed from: f2 */
    public void mo43218f2(@NonNull Status status, @Nullable RegisterExportResponse result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // p446ta.InterfaceC11556a
    /* JADX INFO: renamed from: h2 */
    public void mo43219h2(@NonNull Status status, @Nullable ExportCredentialsToDeviceSetupResponse result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // p446ta.InterfaceC11556a
    /* JADX INFO: renamed from: i0 */
    public void mo43220i0(@NonNull Status status, @Nullable ClearCreationOptionsResponse result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // p446ta.InterfaceC11556a
    /* JADX INFO: renamed from: i1 */
    public void mo43221i1(@NonNull Status status, @Nullable ClearRegistryResponse result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // p446ta.InterfaceC11556a
    /* JADX INFO: renamed from: n1 */
    public void mo43222n1(@NonNull Status status, @Nullable ClearExportResponse result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }

    @Override // p446ta.InterfaceC11556a
    /* JADX INFO: renamed from: p1 */
    public void mo43223p1(@NonNull Status status, @Nullable CredentialTransferCapabilities result) {
        Intrinsics.checkNotNullParameter(status, "status");
        throw new UnsupportedOperationException();
    }
}
