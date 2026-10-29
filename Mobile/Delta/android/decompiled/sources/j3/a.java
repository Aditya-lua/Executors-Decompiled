package j3;

import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import e3.g;
import e3.i;
import e3.u0;
import f3.e;
import f3.f;
import f3.h;
import f3.j;
import f3.k;
import f3.l;
import f3.m;
import f3.n;
import f3.o;
import f3.p;
import f3.q;
import f3.r;
import f3.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Le3/b;", "request", "Landroid/content/Context;", "context", "Landroid/os/Bundle;", "a", "(Le3/b;Landroid/content/Context;)Landroid/os/Bundle;", "", "errorType", "", "errorMsg", "Lf3/n;", "c", "(Ljava/lang/String;Ljava/lang/CharSequence;)Lf3/n;", "Lf3/f;", "b", "(Ljava/lang/String;Ljava/lang/CharSequence;)Lf3/f;", "credentials_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {
    @NotNull
    public static final Bundle a(@NotNull e3.b request, @NotNull Context context) {
        int i10;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(context, "context");
        Bundle credentialData = request.getCredentialData();
        Bundle bundleA = request.getDisplayInfo().a();
        if (request instanceof g) {
            i10 = u0.f15069c;
        } else {
            i10 = request instanceof i ? u0.b : u0.f15068a;
        }
        bundleA.putParcelable("androidx.credentials.BUNDLE_KEY_CREDENTIAL_TYPE_ICON", Icon.createWithResource(context, i10));
        credentialData.putBundle("androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO", bundleA);
        return credentialData;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public static final f b(@NotNull String errorType, @Nullable CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        switch (errorType.hashCode()) {
            case -2055374133:
                if (errorType.equals("android.credentials.CreateCredentialException.TYPE_USER_CANCELED")) {
                    return new f3.d(charSequence);
                }
                break;
            case -1166690414:
                if (errorType.equals("androidx.credentials.TYPE_CREATE_CREDENTIAL_UNSUPPORTED_EXCEPTION")) {
                    return new k(charSequence);
                }
                break;
            case -580283253:
                if (errorType.equals("androidx.credentials.TYPE_CREATE_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION")) {
                    return new f3.i(charSequence);
                }
                break;
            case 1316905704:
                if (errorType.equals("android.credentials.CreateCredentialException.TYPE_UNKNOWN")) {
                    return new j(charSequence);
                }
                break;
            case 2092588512:
                if (errorType.equals("android.credentials.CreateCredentialException.TYPE_INTERRUPTED")) {
                    return new f3.g(charSequence);
                }
                break;
            case 2131915191:
                if (errorType.equals("android.credentials.CreateCredentialException.TYPE_NO_CREATE_OPTIONS")) {
                    return new h(charSequence);
                }
                break;
        }
        if (x.T(errorType, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false, 2, null)) {
            return h3.b.INSTANCE.a(errorType, charSequence != null ? charSequence.toString() : null);
        }
        return new e(errorType, charSequence);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public static final n c(@NotNull String errorType, @Nullable CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        switch (errorType.hashCode()) {
            case -781118336:
                if (errorType.equals("android.credentials.GetCredentialException.TYPE_UNKNOWN")) {
                    return new q(charSequence);
                }
                break;
            case -408155724:
                if (errorType.equals("androidx.credentials.TYPE_GET_CREDENTIAL_UNSUPPORTED_EXCEPTION")) {
                    return new r(charSequence);
                }
                break;
            case -45448328:
                if (errorType.equals("android.credentials.GetCredentialException.TYPE_INTERRUPTED")) {
                    return new o(charSequence);
                }
                break;
            case 580557411:
                if (errorType.equals("android.credentials.GetCredentialException.TYPE_USER_CANCELED")) {
                    return new l(charSequence);
                }
                break;
            case 627896683:
                if (errorType.equals("android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL")) {
                    return new s(charSequence);
                }
                break;
            case 1594095913:
                if (errorType.equals("androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION")) {
                    return new p(charSequence);
                }
                break;
        }
        if (x.T(errorType, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false, 2, null)) {
            return h3.e.INSTANCE.a(errorType, charSequence != null ? charSequence.toString() : null);
        }
        return new m(errorType, charSequence);
    }
}
