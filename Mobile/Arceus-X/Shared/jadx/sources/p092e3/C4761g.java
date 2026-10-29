package p092e3;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: e3.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018BQ\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fB9\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0019"}, m31665d2 = {"Le3/g;", "Le3/b;", "", "id", "password", "", "isAutoSelectAllowed", "Le3/b$b;", "displayInfo", "origin", "preferImmediatelyAvailableCredentials", "Landroid/os/Bundle;", "credentialData", "candidateQueryData", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLe3/b$b;Ljava/lang/String;ZLandroid/os/Bundle;Landroid/os/Bundle;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "j", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "k", "h", "l", "a", "credentials_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C4761g extends AbstractC4751b {

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final String password;

    /* JADX INFO: renamed from: e3.g$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, m31665d2 = {"Le3/g$a;", "", "<init>", "()V", "", "id", "password", "Landroid/os/Bundle;", "b", "(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;", "a", "()Landroid/os/Bundle;", "BUNDLE_KEY_ID", "Ljava/lang/String;", "BUNDLE_KEY_PASSWORD", "credentials_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: e3.g.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Bundle m23172a() {
            return new Bundle();
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Bundle m23173b(@NotNull String id2, @NotNull String password) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(password, "password");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_ID", id2);
            bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", password);
            return bundle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4761g(@NotNull String id2, @NotNull String password) {
        this(id2, password, null, false, false, 28, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(password, "password");
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002f: CONSTRUCTOR 
      (r12v0 java.lang.String)
      (r13v0 java.lang.String)
      (r14v0 boolean)
      (r15v0 e3.b$b)
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0002: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
      (r17v0 boolean)
      (wrap android.os.Bundle:?: TERNARY null = ((wrap int:0x000b: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0015: INVOKE (wrap e3.g$a:0x000f: SGET  A[WRAPPED] (LINE:2) e3.g.l e3.g$a), (r12v0 java.lang.String), (r13v0 java.lang.String) VIRTUAL call: e3.g.a.b(java.lang.String, java.lang.String):android.os.Bundle A[MD:(java.lang.String, java.lang.String):android.os.Bundle (m), WRAPPED] (LINE:2)) : (r18v0 android.os.Bundle))
      (wrap android.os.Bundle:?: TERNARY null = ((wrap int:0x0019: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0023: INVOKE (wrap e3.g$a:0x001d: SGET  A[WRAPPED] (LINE:3) e3.g.l e3.g$a) VIRTUAL call: e3.g.a.a():android.os.Bundle A[MD:():android.os.Bundle (m), WRAPPED] (LINE:3)) : (r19v0 android.os.Bundle))
     A[MD:(java.lang.String, java.lang.String, boolean, e3.b$b, java.lang.String, boolean, android.os.Bundle, android.os.Bundle):void (m)] (LINE:4) call: e3.g.<init>(java.lang.String, java.lang.String, boolean, e3.b$b, java.lang.String, boolean, android.os.Bundle, android.os.Bundle):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C4761g(String str, String str2, boolean z10, AbstractC4751b.b bVar, String str3, boolean z11, Bundle bundle, Bundle bundle2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z10, bVar, (i10 & 16) != 0 ? null : str3, z11, (i10 & 64) != 0 ? INSTANCE.m23173b(str, str2) : bundle, (i10 & 128) != 0 ? INSTANCE.m23172a() : bundle2);
    }

    public C4761g(String str, String str2, boolean z10, AbstractC4751b.b bVar, String str3, boolean z11, Bundle bundle, Bundle bundle2) {
        super("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle, bundle2, false, z10, bVar, str3, z11);
        this.id = str;
        this.password = str2;
        if (str2.length() <= 0) {
            throw new IllegalArgumentException("password should not be empty");
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
      (r7v0 java.lang.String)
      (r8v0 java.lang.String)
      (wrap java.lang.String:0x0005: TERNARY null = ((wrap int:0x0000: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
      (wrap boolean:?: TERNARY null = ((wrap int:0x0006: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
      (wrap boolean:?: TERNARY null = ((wrap int:0x000e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
     A[MD:(java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void (m)] (LINE:10) call: e3.g.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void type: THIS */
    public /* synthetic */ C4761g(String str, String str2, String str3, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? false : z11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4761g(@NotNull String id2, @NotNull String password, @Nullable String str, boolean z10, boolean z11) {
        this(id2, password, z11, new AbstractC4751b.b(id2, null), str, z10, null, null, 192, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(password, "password");
    }
}
