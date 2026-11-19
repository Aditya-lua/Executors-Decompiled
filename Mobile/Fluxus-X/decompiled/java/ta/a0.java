package ta;

import androidx.annotation.NonNull;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.Task;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u0003\u001a\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\u0006\u0010\u0003\u001a\u00020\u0001H'¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\u0006\u0010\u0003\u001a\u00020\u0001H'¢\u0006\u0004\b\u0014\u0010\u0012J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\u0006\u0010\u0003\u001a\u00020\u0001H'¢\u0006\u0004\b\u0016\u0010\u0012J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\u0006\u0010\u0003\u001a\u00020\u0001H'¢\u0006\u0004\b\u0018\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, d2 = {"Lta/a0;", BuildConfig.FLAVOR, "Lcom/google/android/gms/identitycredentials/GetCredentialRequest;", "request", "Lcom/google/android/gms/tasks/Task;", "Lta/e0;", "k", "(Lcom/google/android/gms/identitycredentials/GetCredentialRequest;)Lcom/google/android/gms/tasks/Task;", "Lta/o0;", "Lta/q0;", "f", "(Lta/o0;)Lcom/google/android/gms/tasks/Task;", "Lta/k;", "Lta/i;", "i", "(Lta/k;)Lcom/google/android/gms/tasks/Task;", "Lta/e;", "clearExport", "(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;", "Lta/u;", "exportCredentialsToDeviceSetup", "Lta/c0;", "importCredentialsForDeviceSetup", "Lta/s;", "getCredentialTransferCapabilities", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a0 {
    @NotNull
    Task<q0> f(@NonNull o0 request);

    @NotNull
    Task<i> i(@NonNull k request);

    @NotNull
    Task<e0> k(@NonNull GetCredentialRequest request);
}
