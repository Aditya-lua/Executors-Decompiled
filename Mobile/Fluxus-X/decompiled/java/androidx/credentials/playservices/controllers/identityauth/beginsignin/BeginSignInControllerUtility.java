package androidx.credentials.playservices.controllers.identityauth.beginsignin;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility;
import com.github.luben.zstd.BuildConfig;
import e3.k0;
import e3.o0;
import e3.p0;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/credentials/playservices/controllers/identityauth/beginsignin/BeginSignInControllerUtility;", BuildConfig.FLAVOR, "<init>", "()V", "Companion", "credentials-play-services-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BeginSignInControllerUtility {
    private static final long AUTH_MIN_VERSION_JSON_PARSING = 231815000;
    private static final long AUTH_MIN_VERSION_PREFER_IMME_CRED = 241217000;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "BeginSignInUtility";

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/credentials/playservices/controllers/identityauth/beginsignin/BeginSignInControllerUtility$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "determineDeviceGMSVersionCode", "(Landroid/content/Context;)J", "curAuthVersion", BuildConfig.FLAVOR, "needsBackwardsCompatibleRequest", "(J)Z", "Lic/b;", "option", "La9/a$b;", "convertToGoogleIdTokenOption", "(Lic/b;)La9/a$b;", "Le3/k0;", "request", "La9/a;", "constructBeginSignInRequest$credentials_play_services_auth_release", "(Le3/k0;Landroid/content/Context;)La9/a;", "constructBeginSignInRequest", BuildConfig.FLAVOR, "TAG", "Ljava/lang/String;", "AUTH_MIN_VERSION_JSON_PARSING", "J", "AUTH_MIN_VERSION_PREFER_IMME_CRED", "credentials-play-services-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final a9.a.b convertToGoogleIdTokenOption(ic.b option) {
            a9.a.b.C0009a c0009aG = a9.a.b.A3().c(option.h()).d(option.k()).e(option.l()).f(option.m()).g(true);
            Intrinsics.checkNotNullExpressionValue(c0009aG, "setSupported(...)");
            if (option.j() != null) {
                String strJ = option.j();
                Intrinsics.checkNotNull(strJ);
                c0009aG.a(strJ, option.i());
            }
            a9.a.b bVarB = c0009aG.b();
            Intrinsics.checkNotNullExpressionValue(bVarB, "build(...)");
            return bVarB;
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
        public final a9.a constructBeginSignInRequest$credentials_play_services_auth_release(@NotNull k0 request, @NotNull Context context) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(context, "context");
            a9.a.C0008a c0008a = new a9.a.C0008a();
            long jDetermineDeviceGMSVersionCode = determineDeviceGMSVersionCode(context);
            boolean z10 = false;
            boolean z11 = false;
            for (e3.r rVar : request.a()) {
                if (rVar instanceof o0) {
                    c0008a.f(new a9.a.e.C0012a().b(true).a());
                    z10 = z10 || rVar.getIsAutoSelectAllowed();
                } else if ((rVar instanceof p0) && !z11) {
                    if (needsBackwardsCompatibleRequest(jDetermineDeviceGMSVersionCode)) {
                        c0008a.e(PublicKeyCredentialControllerUtility.INSTANCE.convertToPlayAuthPasskeyRequest((p0) rVar));
                    } else {
                        c0008a.d(PublicKeyCredentialControllerUtility.INSTANCE.convertToPlayAuthPasskeyJsonRequest((p0) rVar));
                    }
                    z11 = true;
                } else if (rVar instanceof ic.b) {
                    ic.b bVar = (ic.b) rVar;
                    c0008a.c(convertToGoogleIdTokenOption(bVar));
                    if (z10 || bVar.g()) {
                    }
                }
            }
            if (jDetermineDeviceGMSVersionCode > BeginSignInControllerUtility.AUTH_MIN_VERSION_PREFER_IMME_CRED) {
                c0008a.g(request.getPreferImmediatelyAvailableCredentials());
            }
            a9.a aVarA = c0008a.b(z10).a();
            Intrinsics.checkNotNullExpressionValue(aVarA, "build(...)");
            return aVarA;
        }

        private Companion() {
        }
    }
}
