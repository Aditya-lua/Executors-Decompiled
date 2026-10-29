package ta;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l9.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010 ¨\u0006$"}, d2 = {"Lta/d;", "Ln9/e;", "Lta/b;", "Landroid/content/Context;", "context", "Landroid/os/Looper;", "looper", "Ln9/d;", "clientSettings", "Ll9/e;", "connectionCallbacks", "Ll9/n;", "connectionFailedListener", "<init>", "(Landroid/content/Context;Landroid/os/Looper;Ln9/d;Ll9/e;Ll9/n;)V", "", "getStartServiceAction", "()Ljava/lang/String;", "getServiceDescriptor", "Landroid/os/IBinder;", "iBinder", "g", "(Landroid/os/IBinder;)Lta/b;", "", "Lcom/google/android/gms/common/Feature;", "getApiFeatures", "()[Lcom/google/android/gms/common/Feature;", "", "getMinApkVersion", "()I", "", "getUseDynamicLookup", "()Z", "usesClientTelemetry", "e", "a", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d extends n9.e<b> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NonNull Context context, @NonNull Looper looper, @NonNull n9.d clientSettings, @NonNull l9.e connectionCallbacks, @NonNull n connectionFailedListener) {
        super(context, looper, 352, clientSettings, connectionCallbacks, connectionFailedListener);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(looper, "looper");
        Intrinsics.checkNotNullParameter(clientSettings, "clientSettings");
        Intrinsics.checkNotNullParameter(connectionCallbacks, "connectionCallbacks");
        Intrinsics.checkNotNullParameter(connectionFailedListener, "connectionFailedListener");
    }

    @Override // n9.c
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public b createServiceInterface(@NonNull IBinder iBinder) {
        Intrinsics.checkNotNullParameter(iBinder, "iBinder");
        return b.a.u2(iBinder);
    }

    @Override // n9.c
    @NotNull
    public Feature[] getApiFeatures() {
        Feature[] ALL_FEATURES = gb.d.f17996o;
        Intrinsics.checkNotNullExpressionValue(ALL_FEATURES, "ALL_FEATURES");
        return ALL_FEATURES;
    }

    @Override // n9.c, k9.a.f
    public int getMinApkVersion() {
        return 17895000;
    }

    @Override // n9.c
    @NotNull
    public String getServiceDescriptor() {
        return "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService";
    }

    @Override // n9.c
    @NotNull
    public String getStartServiceAction() {
        return "com.google.android.gms.identitycredentials.service.START";
    }

    @Override // n9.c
    public boolean getUseDynamicLookup() {
        return true;
    }

    @Override // n9.c
    public boolean usesClientTelemetry() {
        return true;
    }
}
