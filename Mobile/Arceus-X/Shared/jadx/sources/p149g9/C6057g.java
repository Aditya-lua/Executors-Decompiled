package p149g9;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p012ab.C0106c;
import p268l9.InterfaceC8030e;
import p268l9.InterfaceC8057n;
import p305n9.AbstractC8929e;
import p305n9.C8926d;

/* JADX INFO: renamed from: g9.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016¢\u0006\u0004\b \u0010!¨\u0006$"}, m31665d2 = {"Lg9/g;", "Ln9/e;", "Lg9/c;", "Landroid/content/Context;", "context", "Landroid/os/Looper;", "looper", "Ln9/d;", "clientSettings", "Ll9/e;", "connectionCallbacks", "Ll9/n;", "connectionFailedListener", "<init>", "(Landroid/content/Context;Landroid/os/Looper;Ln9/d;Ll9/e;Ll9/n;)V", "", "getMinApkVersion", "()I", "Landroid/os/IBinder;", "binder", "g", "(Landroid/os/IBinder;)Lg9/c;", "", "getServiceDescriptor", "()Ljava/lang/String;", "getStartServiceAction", "", "getUseDynamicLookup", "()Z", "usesClientTelemetry", "", "Lcom/google/android/gms/common/Feature;", "getApiFeatures", "()[Lcom/google/android/gms/common/Feature;", "e", "a", "java.com.google.android.gmscore.integ.client.auth_blockstore_client_auth_blockstore"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C6057g extends AbstractC8929e<InterfaceC6053c> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6057g(@NonNull Context context, @NonNull Looper looper, @NonNull C8926d clientSettings, @NonNull InterfaceC8030e connectionCallbacks, @NonNull InterfaceC8057n connectionFailedListener) {
        super(context, looper, 381, clientSettings, connectionCallbacks, connectionFailedListener);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(looper, "looper");
        Intrinsics.checkNotNullParameter(clientSettings, "clientSettings");
        Intrinsics.checkNotNullParameter(connectionCallbacks, "connectionCallbacks");
        Intrinsics.checkNotNullParameter(connectionFailedListener, "connectionFailedListener");
    }

    /* JADX DEBUG: Method merged with bridge method: createServiceInterface(Landroid/os/IBinder;)Landroid/os/IInterface; */
    @Override // p305n9.AbstractC8923c
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public InterfaceC6053c createServiceInterface(@NonNull IBinder binder) {
        Intrinsics.checkNotNullParameter(binder, "binder");
        InterfaceC6053c interfaceC6053cM26874u2 = InterfaceC6053c.a.m26874u2(binder);
        Intrinsics.checkNotNullExpressionValue(interfaceC6053cM26874u2, "asInterface(...)");
        return interfaceC6053cM26874u2;
    }

    @Override // p305n9.AbstractC8923c
    @NotNull
    public Feature[] getApiFeatures() {
        Feature[] ALL_FEATURES = C0106c.f375l;
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
        return "com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService";
    }

    @Override // p305n9.AbstractC8923c
    @NotNull
    public String getStartServiceAction() {
        return "com.google.android.gms.auth.blockstore.restorecredential.service.START_RESTORE_CRED";
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
