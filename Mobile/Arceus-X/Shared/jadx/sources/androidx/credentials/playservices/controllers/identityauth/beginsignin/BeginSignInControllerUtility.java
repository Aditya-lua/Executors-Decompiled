package androidx.credentials.playservices.controllers.identityauth.beginsignin;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p092e3.AbstractC4783r;
import p092e3.C4770k0;
import p092e3.C4778o0;
import p092e3.C4780p0;
import p167hc.C6353b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m31665d2 = {"Landroidx/credentials/playservices/controllers/identityauth/beginsignin/BeginSignInControllerUtility;", "", "<init>", "()V", "Companion", "credentials-play-services-auth_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class BeginSignInControllerUtility {
    private static final long AUTH_MIN_VERSION_JSON_PARSING = 231815000;
    private static final long AUTH_MIN_VERSION_PREFER_IMME_CRED = 241217000;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "BeginSignInUtility";

    @Metadata(m31664d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, m31665d2 = {"Landroidx/credentials/playservices/controllers/identityauth/beginsignin/BeginSignInControllerUtility$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "determineDeviceGMSVersionCode", "(Landroid/content/Context;)J", "curAuthVersion", "", "needsBackwardsCompatibleRequest", "(J)Z", "Lhc/b;", "option", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$GoogleIdTokenRequestOptions;", "convertToGoogleIdTokenOption", "(Lhc/b;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$GoogleIdTokenRequestOptions;", "Le3/k0;", "request", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;", "constructBeginSignInRequest$credentials_play_services_auth_release", "(Le3/k0;Landroid/content/Context;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;", "constructBeginSignInRequest", "", "TAG", "Ljava/lang/String;", "AUTH_MIN_VERSION_JSON_PARSING", "J", "AUTH_MIN_VERSION_PREFER_IMME_CRED", "credentials-play-services-auth_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.credentials.playservices.controllers.identityauth.beginsignin.BeginSignInControllerUtility.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final BeginSignInRequest.GoogleIdTokenRequestOptions convertToGoogleIdTokenOption(C6353b option) {
            BeginSignInRequest.GoogleIdTokenRequestOptions.C1872a c1872aM9000g = BeginSignInRequest.GoogleIdTokenRequestOptions.m8986v3().m8996c(option.m27659h()).m8997d(option.m27662k()).m8998e(option.m27663l()).m8999f(option.m27664m()).m9000g(true);
            Intrinsics.checkNotNullExpressionValue(c1872aM9000g, "setSupported(...)");
            if (option.m27661j() != null) {
                String strM27661j = option.m27661j();
                Intrinsics.checkNotNull(strM27661j);
                c1872aM9000g.m8994a(strM27661j, option.m27660i());
            }
            BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptionsM8995b = c1872aM9000g.m8995b();
            Intrinsics.checkNotNullExpressionValue(googleIdTokenRequestOptionsM8995b, "build(...)");
            return googleIdTokenRequestOptionsM8995b;
        }

        private final long determineDeviceGMSVersionCode(Context context) {
            PackageManager packageManager = context.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
            return packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
        }

        private final boolean needsBackwardsCompatibleRequest(long curAuthVersion) {
            return curAuthVersion < BeginSignInControllerUtility.AUTH_MIN_VERSION_JSON_PARSING;
        }

        @NotNull
        /* JADX INFO: renamed from: constructBeginSignInRequest$credentials_play_services_auth_release */
        public final BeginSignInRequest m3303x545fe152(@NotNull C4770k0 request, @NotNull Context context) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(context, "context");
            BeginSignInRequest.C1876a c1876a = new BeginSignInRequest.C1876a();
            long jDetermineDeviceGMSVersionCode = determineDeviceGMSVersionCode(context);
            boolean z10 = false;
            boolean z11 = false;
            for (AbstractC4783r abstractC4783r : request.m23188a()) {
                if (abstractC4783r instanceof C4778o0) {
                    c1876a.m9024f(new BeginSignInRequest.PasswordRequestOptions.C1875a().m9018b(true).m9017a());
                    z10 = z10 || abstractC4783r.getIsAutoSelectAllowed();
                } else if ((abstractC4783r instanceof C4780p0) && !z11) {
                    if (needsBackwardsCompatibleRequest(jDetermineDeviceGMSVersionCode)) {
                        c1876a.m9023e(PublicKeyCredentialControllerUtility.INSTANCE.convertToPlayAuthPasskeyRequest((C4780p0) abstractC4783r));
                    } else {
                        c1876a.m9022d(PublicKeyCredentialControllerUtility.INSTANCE.convertToPlayAuthPasskeyJsonRequest((C4780p0) abstractC4783r));
                    }
                    z11 = true;
                } else if (abstractC4783r instanceof C6353b) {
                    C6353b c6353b = (C6353b) abstractC4783r;
                    c1876a.m9021c(convertToGoogleIdTokenOption(c6353b));
                    if (z10 || c6353b.m27658g()) {
                    }
                }
            }
            if (jDetermineDeviceGMSVersionCode > BeginSignInControllerUtility.AUTH_MIN_VERSION_PREFER_IMME_CRED) {
                c1876a.m9025g(request.getPreferImmediatelyAvailableCredentials());
            }
            BeginSignInRequest beginSignInRequestM9019a = c1876a.m9020b(z10).m9019a();
            Intrinsics.checkNotNullExpressionValue(beginSignInRequestM9019a, "build(...)");
            return beginSignInRequestM9019a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }
}
