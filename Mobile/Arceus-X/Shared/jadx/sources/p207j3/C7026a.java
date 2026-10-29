package p207j3;

import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p092e3.AbstractC4751b;
import p092e3.C4761g;
import p092e3.C4765i;
import p092e3.C4790u0;
import p117f3.AbstractC5332f;
import p117f3.AbstractC5340n;
import p117f3.C5330d;
import p117f3.C5331e;
import p117f3.C5333g;
import p117f3.C5334h;
import p117f3.C5335i;
import p117f3.C5336j;
import p117f3.C5337k;
import p117f3.C5338l;
import p117f3.C5339m;
import p117f3.C5341o;
import p117f3.C5342p;
import p117f3.C5343q;
import p117f3.C5344r;
import p117f3.C5345s;
import p158h3.C6273b;
import p158h3.C6276e;

/* JADX INFO: renamed from: j3.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31665d2 = {"Le3/b;", "request", "Landroid/content/Context;", "context", "Landroid/os/Bundle;", "a", "(Le3/b;Landroid/content/Context;)Landroid/os/Bundle;", "", "errorType", "", "errorMsg", "Lf3/n;", "c", "(Ljava/lang/String;Ljava/lang/CharSequence;)Lf3/n;", "Lf3/f;", "b", "(Ljava/lang/String;Ljava/lang/CharSequence;)Lf3/f;", "credentials_release"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C7026a {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Bundle m29704a(@NotNull AbstractC4751b request, @NotNull Context context) {
        int i10;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(context, "context");
        Bundle credentialData = request.getCredentialData();
        Bundle bundleM23146a = request.getDisplayInfo().m23146a();
        if (request instanceof C4761g) {
            i10 = C4790u0.f19396c;
        } else {
            i10 = request instanceof C4765i ? C4790u0.f19395b : C4790u0.f19394a;
        }
        bundleM23146a.putParcelable("androidx.credentials.BUNDLE_KEY_CREDENTIAL_TYPE_ICON", Icon.createWithResource(context, i10));
        credentialData.putBundle("androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO", bundleM23146a);
        return credentialData;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final AbstractC5332f m29705b(@NotNull String errorType, @Nullable CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        switch (errorType.hashCode()) {
            case -2055374133:
                if (errorType.equals("android.credentials.CreateCredentialException.TYPE_USER_CANCELED")) {
                    return new C5330d(charSequence);
                }
                break;
            case -1166690414:
                if (errorType.equals("androidx.credentials.TYPE_CREATE_CREDENTIAL_UNSUPPORTED_EXCEPTION")) {
                    return new C5337k(charSequence);
                }
                break;
            case -580283253:
                if (errorType.equals("androidx.credentials.TYPE_CREATE_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION")) {
                    return new C5335i(charSequence);
                }
                break;
            case 1316905704:
                if (errorType.equals("android.credentials.CreateCredentialException.TYPE_UNKNOWN")) {
                    return new C5336j(charSequence);
                }
                break;
            case 2092588512:
                if (errorType.equals("android.credentials.CreateCredentialException.TYPE_INTERRUPTED")) {
                    return new C5333g(charSequence);
                }
                break;
            case 2131915191:
                if (errorType.equals("android.credentials.CreateCredentialException.TYPE_NO_CREATE_OPTIONS")) {
                    return new C5334h(charSequence);
                }
                break;
        }
        if (C7797x.m32309T(errorType, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false, 2, null)) {
            return C6273b.INSTANCE.m27530a(errorType, charSequence != null ? charSequence.toString() : null);
        }
        return new C5331e(errorType, charSequence);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final AbstractC5340n m29706c(@NotNull String errorType, @Nullable CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        switch (errorType.hashCode()) {
            case -781118336:
                if (errorType.equals("android.credentials.GetCredentialException.TYPE_UNKNOWN")) {
                    return new C5343q(charSequence);
                }
                break;
            case -408155724:
                if (errorType.equals("androidx.credentials.TYPE_GET_CREDENTIAL_UNSUPPORTED_EXCEPTION")) {
                    return new C5344r(charSequence);
                }
                break;
            case -45448328:
                if (errorType.equals("android.credentials.GetCredentialException.TYPE_INTERRUPTED")) {
                    return new C5341o(charSequence);
                }
                break;
            case 580557411:
                if (errorType.equals("android.credentials.GetCredentialException.TYPE_USER_CANCELED")) {
                    return new C5338l(charSequence);
                }
                break;
            case 627896683:
                if (errorType.equals("android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL")) {
                    return new C5345s(charSequence);
                }
                break;
            case 1594095913:
                if (errorType.equals("androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION")) {
                    return new C5342p(charSequence);
                }
                break;
        }
        if (C7797x.m32309T(errorType, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false, 2, null)) {
            return C6276e.INSTANCE.m27535a(errorType, charSequence != null ? charSequence.toString() : null);
        }
        return new C5339m(errorType, charSequence);
    }
}
