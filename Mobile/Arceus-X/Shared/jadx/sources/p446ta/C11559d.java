package p446ta;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import gb.C6084d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p268l9.InterfaceC8030e;
import p268l9.InterfaceC8057n;
import p305n9.AbstractC8929e;
import p305n9.C8926d;

/* JADX INFO: renamed from: ta.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010 ¨\u0006$"}, m31665d2 = {"Lta/d;", "Ln9/e;", "Lta/b;", "Landroid/content/Context;", "context", "Landroid/os/Looper;", "looper", "Ln9/d;", "clientSettings", "Ll9/e;", "connectionCallbacks", "Ll9/n;", "connectionFailedListener", "<init>", "(Landroid/content/Context;Landroid/os/Looper;Ln9/d;Ll9/e;Ll9/n;)V", "", "getStartServiceAction", "()Ljava/lang/String;", "getServiceDescriptor", "Landroid/os/IBinder;", "iBinder", "g", "(Landroid/os/IBinder;)Lta/b;", "", "Lcom/google/android/gms/common/Feature;", "getApiFeatures", "()[Lcom/google/android/gms/common/Feature;", "", "getMinApkVersion", "()I", "", "getUseDynamicLookup", "()Z", "usesClientTelemetry", "e", "a", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C11559d extends AbstractC8929e<InterfaceC11557b> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11559d(@NonNull Context context, @NonNull Looper looper, @NonNull C8926d clientSettings, @NonNull InterfaceC8030e connectionCallbacks, @NonNull InterfaceC8057n connectionFailedListener) {
        super(context, looper, 352, clientSettings, connectionCallbacks, connectionFailedListener);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(looper, "looper");
        Intrinsics.checkNotNullParameter(clientSettings, "clientSettings");
        Intrinsics.checkNotNullParameter(connectionCallbacks, "connectionCallbacks");
        Intrinsics.checkNotNullParameter(connectionFailedListener, "connectionFailedListener");
    }

    /* JADX DEBUG: Method merged with bridge method: createServiceInterface(Landroid/os/IBinder;)Landroid/os/IInterface; */
    @Override // p305n9.AbstractC8923c
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public InterfaceC11557b createServiceInterface(@NonNull IBinder iBinder) {
        Intrinsics.checkNotNullParameter(iBinder, "iBinder");
        return InterfaceC11557b.a.m43227u2(iBinder);
    }

    @Override // p305n9.AbstractC8923c
    @NotNull
    public Feature[] getApiFeatures() {
        Feature[] ALL_FEATURES = C6084d.f23398o;
        Intrinsics.checkNotNullExpressionValue(ALL_FEATURES, "ALL_FEATURES");
        return ALL_FEATURES;
    }

    @Override // p305n9.AbstractC8923c, p242k9.C7491a.f
    public int getMinApkVersion() {
        return 17895000;
    }

    @Override // p305n9.AbstractC8923c
    @NotNull
    public String getServiceDescriptor() {
        return "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService";
    }

    @Override // p305n9.AbstractC8923c
    @NotNull
    public String getStartServiceAction() {
        return "com.google.android.gms.identitycredentials.service.START";
    }

    @Override // p305n9.AbstractC8923c
    public boolean getUseDynamicLookup() {
        return true;
    }

    @Override // p305n9.AbstractC8923c
    public boolean usesClientTelemetry() {
        return true;
    }
}
