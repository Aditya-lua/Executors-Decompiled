package p092e3;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p207j3.C7029d;

/* JADX INFO: renamed from: e3.i */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 \u001f2\u00020\u0001:\u0001 B]\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011BG\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, m31665d2 = {"Le3/i;", "Le3/b;", "", "requestJson", "", "clientDataHash", "", "isAutoSelectAllowed", "preferImmediatelyAvailableCredentials", "Le3/b$b;", "displayInfo", "origin", "Landroid/os/Bundle;", "credentialData", "candidateQueryData", "isConditional", "<init>", "(Ljava/lang/String;[BZZLe3/b$b;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Z)V", "(Ljava/lang/String;[BZLjava/lang/String;ZZ)V", "j", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "k", "[B", "getClientDataHash", "()[B", "l", "Z", "h", "()Z", "m", "a", "credentials_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C4765i extends AbstractC4751b {

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final String requestJson;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public final byte[] clientDataHash;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public final boolean isConditional;

    /* JADX INFO: renamed from: e3.i$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0001¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0001¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011¨\u0006\u0015"}, m31665d2 = {"Le3/i$a;", "", "<init>", "()V", "", "requestJson", "defaultProvider", "Le3/b$b;", "a", "(Ljava/lang/String;Ljava/lang/String;)Le3/b$b;", "", "clientDataHash", "Landroid/os/Bundle;", "d", "(Ljava/lang/String;[B)Landroid/os/Bundle;", "c", "BUNDLE_KEY_CLIENT_DATA_HASH", "Ljava/lang/String;", "BUNDLE_KEY_REQUEST_JSON", "BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST", "BUNDLE_KEY_CONDITIONAL_CREATE", "credentials_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: e3.i.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ AbstractC4751b.b m23179b(Companion companion, String str, String str2, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            return companion.m23180a(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final AbstractC4751b.b m23180a(@NotNull String requestJson, @Nullable String defaultProvider) {
            Intrinsics.checkNotNullParameter(requestJson, "requestJson");
            try {
                JSONObject jSONObject = new JSONObject(requestJson).getJSONObject("user");
                String string = jSONObject.getString("name");
                String string2 = jSONObject.isNull("displayName") ? null : jSONObject.getString("displayName");
                Intrinsics.checkNotNull(string);
                return new AbstractC4751b.b(string, string2, null, defaultProvider);
            } catch (Exception unused) {
                throw new IllegalArgumentException("user.name must be defined in requestJson");
            }
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final Bundle m23181c(@NotNull String requestJson, @Nullable byte[] clientDataHash) {
            Intrinsics.checkNotNullParameter(requestJson, "requestJson");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST");
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", requestJson);
            bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", clientDataHash);
            return bundle;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final Bundle m23182d(@NotNull String requestJson, @Nullable byte[] clientDataHash) {
            Intrinsics.checkNotNullParameter(requestJson, "requestJson");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST");
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
    public C4765i(@NotNull String requestJson) {
        this(requestJson, null, false, null, false, false, 62, null);
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getRequestJson() {
        return this.requestJson;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsConditional() {
        return this.isConditional;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003c: CONSTRUCTOR 
      (r11v0 java.lang.String A[IMMUTABLE_TYPE, METHOD_ARGUMENT])
      (r12v0 byte[] A[IMMUTABLE_TYPE, METHOD_ARGUMENT])
      (r13v0 boolean A[IMMUTABLE_TYPE, METHOD_ARGUMENT])
      (r14v0 boolean A[IMMUTABLE_TYPE, METHOD_ARGUMENT])
      (r15v0 e3.b$b A[IMMUTABLE_TYPE, METHOD_ARGUMENT])
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0002: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
      (wrap android.os.Bundle:?: TERNARY null = ((wrap int:0x000b: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0015: INVOKE (wrap e3.i$a:0x000f: SGET  A[WRAPPED] (LINE:2) e3.i.m e3.i$a), (r11v0 java.lang.String), (r12v0 byte[]) VIRTUAL call: e3.i.a.d(java.lang.String, byte[]):android.os.Bundle A[MD:(java.lang.String, byte[]):android.os.Bundle (m), WRAPPED] (LINE:2)) : (r17v0 android.os.Bundle))
      (wrap android.os.Bundle:?: TERNARY null = ((wrap int:0x0019: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0023: INVOKE (wrap e3.i$a:0x001d: SGET  A[WRAPPED] (LINE:3) e3.i.m e3.i$a), (r11v0 java.lang.String), (r12v0 byte[]) VIRTUAL call: e3.i.a.c(java.lang.String, byte[]):android.os.Bundle A[MD:(java.lang.String, byte[]):android.os.Bundle (m), WRAPPED] (LINE:3)) : (r18v0 android.os.Bundle))
      (wrap boolean:?: TERNARY null = ((wrap int:0x0027: ARITH (r20v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r19v0 boolean))
     A[MD:(java.lang.String, byte[], boolean, boolean, e3.b$b, java.lang.String, android.os.Bundle, android.os.Bundle, boolean):void (m)] (LINE:4) call: e3.i.<init>(java.lang.String, byte[], boolean, boolean, e3.b$b, java.lang.String, android.os.Bundle, android.os.Bundle, boolean):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C4765i(String str, byte[] bArr, boolean z10, boolean z11, AbstractC4751b.b bVar, String str2, Bundle bundle, Bundle bundle2, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bArr, z10, z11, bVar, (i10 & 32) != 0 ? null : str2, (i10 & 64) != 0 ? INSTANCE.m23182d(str, bArr) : bundle, (i10 & 128) != 0 ? INSTANCE.m23181c(str, bArr) : bundle2, (i10 & 256) != 0 ? false : z12);
    }

    public C4765i(String str, byte[] bArr, boolean z10, boolean z11, AbstractC4751b.b bVar, String str2, Bundle bundle, Bundle bundle2, boolean z12) {
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle, bundle2, false, z10, bVar, str2, z11);
        this.requestJson = str;
        this.clientDataHash = bArr;
        this.isConditional = z12;
        if (!C7029d.INSTANCE.m29710a(str)) {
            throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
        }
        if (z12) {
            bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_CONDITIONAL_REQUEST", true);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0024: CONSTRUCTOR 
      (r3v0 java.lang.String)
      (wrap byte[]:?: TERNARY null = ((wrap int:0x0000: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null byte[]) : (r4v0 byte[]))
      (wrap boolean:?: TERNARY null = ((wrap int:0x0006: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x000c: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
      (wrap boolean:?: TERNARY null = ((wrap int:0x0011: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r7v0 boolean))
      (wrap boolean:?: TERNARY null = ((wrap int:0x0016: ARITH (r9v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
     A[MD:(java.lang.String, byte[], boolean, java.lang.String, boolean, boolean):void (m)] (LINE:13) call: e3.i.<init>(java.lang.String, byte[], boolean, java.lang.String, boolean, boolean):void type: THIS */
    public /* synthetic */ C4765i(String str, byte[] bArr, boolean z10, String str2, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : bArr, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? false : z11, (i10 & 32) != 0 ? false : z12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4765i(@NotNull String requestJson, @Nullable byte[] bArr, boolean z10, @Nullable String str, boolean z11, boolean z12) {
        this(requestJson, bArr, z11, z10, Companion.m23179b(INSTANCE, requestJson, null, 2, null), str, null, null, z12, 192, null);
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
    }
}
