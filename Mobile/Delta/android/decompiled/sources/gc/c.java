package gc;

import android.os.Bundle;
import androidx.annotation.NonNull;
import e3.m0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0012B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u0013"}, d2 = {"Lgc/c;", "Le3/m0;", "", "serverClientId", "hostedDomainFilter", "nonce", "", "Lgc/a;", "claims", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "h", "i", "m", "b", "a", "java.com.google.android.libraries.identity.googleid.granule_granule"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends m0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final String f18001i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final String f18002j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final String f18003k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final List f18004l;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lgc/c$a;", "", "", "serverClientId", "<init>", "(Ljava/lang/String;)V", "nonce", "b", "(Ljava/lang/String;)Lgc/c$a;", "Lgc/c;", "a", "()Lgc/c;", "Ljava/lang/String;", "hostedDomainFilter", "", "Lgc/a;", "claims", "Ljava/util/List;", "java.com.google.android.libraries.identity.googleid.granule_granule"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f18005a;

        @Nullable
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public String f18006c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public List f18007d;

        public a(@NonNull String serverClientId) {
            Intrinsics.checkNotNullParameter(serverClientId, "serverClientId");
            this.f18005a = serverClientId;
        }

        @NotNull
        public final c a() {
            return new c(this.f18005a, this.b, this.f18006c, this.f18007d);
        }

        @NotNull
        public final a b(@Nullable String nonce) {
            this.f18006c = nonce;
            return this;
        }
    }

    /* JADX INFO: renamed from: gc.c$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0086\u0003\u0018\u00002\u00020\u0001JC\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0001¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00028\u0000X\u0081T¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00028\u0000X\u0081T¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u0012\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00028\u0000X\u0081T¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u0012\u0004\b\u001a\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00028\u0000X\u0081T¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u0012\u0004\b\u001c\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00028\u0000X\u0081T¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u0012\u0004\b\u001e\u0010\u0016R\u001a\u0010\u001f\u001a\u00020\u00028\u0000X\u0081T¢\u0006\f\n\u0004\b\u001f\u0010\u0014\u0012\u0004\b \u0010\u0016R\u001a\u0010!\u001a\u00020\u00028\u0000X\u0081T¢\u0006\f\n\u0004\b!\u0010\u0014\u0012\u0004\b\"\u0010\u0016¨\u0006#"}, d2 = {"Lgc/c$b;", "", "", "serverClientId", "hostedDomainFilter", "nonce", "", "autoSelectEnabled", "", "Lgc/a;", "claims", "Landroid/os/Bundle;", "toBundle$java_com_google_android_libraries_identity_googleid_granule_granule", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)Landroid/os/Bundle;", "toBundle", "claimsBundle", "parseClaims$java_com_google_android_libraries_identity_googleid_granule_granule", "(Landroid/os/Bundle;)Ljava/util/List;", "parseClaims", "BUNDLE_KEY_SERVER_CLIENT_ID", "Ljava/lang/String;", "getBUNDLE_KEY_SERVER_CLIENT_ID$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "()V", "BUNDLE_KEY_NONCE", "getBUNDLE_KEY_NONCE$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_HOSTED_DOMAIN_FILTER", "getBUNDLE_KEY_HOSTED_DOMAIN_FILTER$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_AUTO_SELECT_ENABLED", "getBUNDLE_KEY_AUTO_SELECT_ENABLED$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_CLAIMS", "getBUNDLE_KEY_CLAIMS$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_CLAIM_PREFIX", "getBUNDLE_KEY_CLAIM_PREFIX$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "BUNDLE_KEY_CLAIMS_SIZE", "getBUNDLE_KEY_CLAIMS_SIZE$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "java.com.google.android.libraries.identity.googleid.granule_granule"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(@NonNull DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public static final Bundle a(@NonNull String serverClientId, @Nullable String str, @Nullable String str2, boolean z10, @Nullable List list) {
            Intrinsics.checkNotNullParameter(serverClientId, "serverClientId");
            Bundle bundle = new Bundle();
            bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_SERVER_CLIENT_ID", serverClientId);
            bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_NONCE", str2);
            bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_HOSTED_DOMAIN_FILTER", str);
            bundle.putBoolean("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_AUTO_SELECT_ENABLED", true);
            bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GOOGLE_ID_TOKEN_SUBTYPE", "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_SIWG_CREDENTIAL");
            if (list != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_CLAIMS_SIZE", list.size());
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    bundle2.putBundle("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_CLAIM_PREFIX" + i10, gc.a.Companion.a((gc.a) list.get(i10)));
                }
                bundle.putBundle("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_CLAIMS", bundle2);
            }
            return bundle;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NonNull String serverClientId, @Nullable String str, @Nullable String str2, @Nullable List<gc.a> list) {
        super("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", Companion.a(serverClientId, str, str2, true, list), Companion.a(serverClientId, str, str2, true, list), true, true, null, 32, null);
        Intrinsics.checkNotNullParameter(serverClientId, "serverClientId");
        this.f18001i = serverClientId;
        this.f18002j = str;
        this.f18003k = str2;
        this.f18004l = list;
        if (serverClientId.length() <= 0) {
            throw new IllegalArgumentException("serverClientId should not be empty");
        }
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getF18002j() {
        return this.f18002j;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getF18003k() {
        return this.f18003k;
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getF18001i() {
        return this.f18001i;
    }
}
