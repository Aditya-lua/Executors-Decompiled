package p092e3;

import android.content.ComponentName;
import android.os.Bundle;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7702q0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p207j3.C7029d;

/* JADX INFO: renamed from: e3.p0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aBC\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB-\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m31665d2 = {"Le3/p0;", "Le3/r;", "", "requestJson", "", "clientDataHash", "", "Landroid/content/ComponentName;", "allowedProviders", "Landroid/os/Bundle;", "requestData", "candidateQueryData", "", "typePriorityCategory", "<init>", "(Ljava/lang/String;[BLjava/util/Set;Landroid/os/Bundle;Landroid/os/Bundle;I)V", "(Ljava/lang/String;[BLjava/util/Set;)V", "i", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "j", "[B", "getClientDataHash", "()[B", "k", "a", "credentials_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C4780p0 extends AbstractC4783r {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final String requestJson;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public final byte[] clientDataHash;

    /* JADX INFO: renamed from: e3.p0$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0001¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, m31665d2 = {"Le3/p0$a;", "", "<init>", "()V", "", "requestJson", "", "clientDataHash", "Landroid/os/Bundle;", "a", "(Ljava/lang/String;[B)Landroid/os/Bundle;", "BUNDLE_KEY_CLIENT_DATA_HASH", "Ljava/lang/String;", "BUNDLE_KEY_REQUEST_JSON", "BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION", "credentials_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: e3.p0.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Bundle m23216a(@NotNull String requestJson, @Nullable byte[] clientDataHash) {
            Intrinsics.checkNotNullParameter(requestJson, "requestJson");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION");
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", requestJson);
            bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", clientDataHash);
            return bundle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4780p0(@NotNull String requestJson) {
        this(requestJson, null, null, 6, null);
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getRequestJson() {
        return this.requestJson;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
      (r8v0 java.lang.String)
      (r9v0 byte[])
      (r10v0 java.util.Set)
      (r11v0 android.os.Bundle)
      (r12v0 android.os.Bundle)
      (wrap int:?: TERNARY null = ((wrap int:0x0000: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (100 int) : (r13v0 int))
     A[MD:(java.lang.String, byte[], java.util.Set<android.content.ComponentName>, android.os.Bundle, android.os.Bundle, int):void (m)] (LINE:2) call: e3.p0.<init>(java.lang.String, byte[], java.util.Set, android.os.Bundle, android.os.Bundle, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C4780p0(String str, byte[] bArr, Set set, Bundle bundle, Bundle bundle2, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bArr, set, bundle, bundle2, (i11 & 32) != 0 ? 100 : i10);
    }

    public C4780p0(String str, byte[] bArr, Set<ComponentName> set, Bundle bundle, Bundle bundle2, int i10) {
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle, bundle2, false, true, set, i10);
        this.requestJson = str;
        this.clientDataHash = bArr;
        if (!C7029d.INSTANCE.m29710a(str)) {
            throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
      (r1v0 java.lang.String)
      (wrap byte[]:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null byte[]) : (r2v0 byte[]))
      (wrap java.util.Set:?: TERNARY null = ((wrap int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap java.util.Set:0x0009: INVOKE  STATIC call: kotlin.collections.q0.d():java.util.Set A[MD:<T>:():java.util.Set<T> (m), WRAPPED] (LINE:7)) : (r3v0 java.util.Set))
     A[MD:(java.lang.String, byte[], java.util.Set<android.content.ComponentName>):void (m)] (LINE:8) call: e3.p0.<init>(java.lang.String, byte[], java.util.Set):void type: THIS */
    public /* synthetic */ C4780p0(String str, byte[] bArr, Set set, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : bArr, (i10 & 4) != 0 ? C7702q0.m31908d() : set);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C4780p0(@NotNull String requestJson, @Nullable byte[] bArr, @NotNull Set<ComponentName> allowedProviders) {
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
        Intrinsics.checkNotNullParameter(allowedProviders, "allowedProviders");
        Companion companion = INSTANCE;
        this(requestJson, bArr, allowedProviders, companion.m23216a(requestJson, bArr), companion.m23216a(requestJson, bArr), 0, 32, null);
    }
}
