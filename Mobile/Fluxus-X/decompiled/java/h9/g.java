package h9;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.github.luben.zstd.BuildConfig;
import m9.n;
import o9.i;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016¢\u0006\u0004\b \u0010!¨\u0006$"}, d2 = {"Lh9/g;", "Lo9/i;", "Lh9/c;", "Landroid/content/Context;", "context", "Landroid/os/Looper;", "looper", "Lo9/f;", "clientSettings", "Lm9/e;", "connectionCallbacks", "Lm9/n;", "connectionFailedListener", "<init>", "(Landroid/content/Context;Landroid/os/Looper;Lo9/f;Lm9/e;Lm9/n;)V", BuildConfig.FLAVOR, "getMinApkVersion", "()I", "Landroid/os/IBinder;", "binder", "g", "(Landroid/os/IBinder;)Lh9/c;", BuildConfig.FLAVOR, "getServiceDescriptor", "()Ljava/lang/String;", "getStartServiceAction", BuildConfig.FLAVOR, "getUseDynamicLookup", "()Z", "usesClientTelemetry", BuildConfig.FLAVOR, "Lk9/d;", "getApiFeatures", "()[Lk9/d;", "e", "a", "java.com.google.android.gmscore.integ.client.auth_blockstore_client_auth_blockstore"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g extends i<c> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@NonNull Context context, @NonNull Looper looper, @NonNull o9.f clientSettings, @NonNull m9.e connectionCallbacks, @NonNull n connectionFailedListener) {
        super(context, looper, 381, clientSettings, connectionCallbacks, connectionFailedListener);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(looper, "looper");
        Intrinsics.checkNotNullParameter(clientSettings, "clientSettings");
        Intrinsics.checkNotNullParameter(connectionCallbacks, "connectionCallbacks");
        Intrinsics.checkNotNullParameter(connectionFailedListener, "connectionFailedListener");
    }

    @Override // o9.d
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public c createServiceInterface(@NonNull IBinder binder) {
        Intrinsics.checkNotNullParameter(binder, "binder");
        c cVarU2 = c.a.u2(binder);
        Intrinsics.checkNotNullExpressionValue(cVarU2, "asInterface(...)");
        return cVarU2;
    }

    @Override // o9.d
    @NotNull
    public k9.d[] getApiFeatures() {
        k9.d[] ALL_FEATURES = bb.c.f3860l;
        Intrinsics.checkNotNullExpressionValue(ALL_FEATURES, "ALL_FEATURES");
        return ALL_FEATURES;
    }

    @Override // o9.d, l9.a.f
    public int getMinApkVersion() {
        return 17895000;
    }

    @Override // o9.d
    @NotNull
    public String getServiceDescriptor() {
        return "com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService";
    }

    @Override // o9.d
    @NotNull
    public String getStartServiceAction() {
        return "com.google.android.gms.auth.blockstore.restorecredential.service.START_RESTORE_CRED";
    }

    @Override // o9.d
    public boolean getUseDynamicLookup() {
        return true;
    }

    @Override // o9.d
    public boolean usesClientTelemetry() {
        return true;
    }
}
