package p092e3;

import android.content.ComponentName;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7702q0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: e3.o0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016BG\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB3\b\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\u000e\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m31665d2 = {"Le3/o0;", "Le3/r;", "", "", "allowedUserIds", "", "isAutoSelectAllowed", "Landroid/content/ComponentName;", "allowedProviders", "Landroid/os/Bundle;", "requestData", "candidateQueryData", "", "typePriorityHint", "<init>", "(Ljava/util/Set;ZLjava/util/Set;Landroid/os/Bundle;Landroid/os/Bundle;I)V", "(Ljava/util/Set;ZLjava/util/Set;)V", "i", "Ljava/util/Set;", "getAllowedUserIds", "()Ljava/util/Set;", "j", "a", "credentials_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C4778o0 extends AbstractC4783r {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Set<String> allowedUserIds;

    /* JADX INFO: renamed from: e3.o0$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m31665d2 = {"Le3/o0$a;", "", "<init>", "()V", "", "", "allowUserIds", "Landroid/os/Bundle;", "a", "(Ljava/util/Set;)Landroid/os/Bundle;", "BUNDLE_KEY_ALLOWED_USER_IDS", "Ljava/lang/String;", "credentials_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: e3.o0.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Bundle m23214a(@NotNull Set<String> allowUserIds) {
            Intrinsics.checkNotNullParameter(allowUserIds, "allowUserIds");
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("androidx.credentials.BUNDLE_KEY_ALLOWED_USER_IDS", new ArrayList<>(allowUserIds));
            return bundle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4778o0() {
        this(null, false, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4778o0(@NotNull Set<String> allowedUserIds) {
        this(allowedUserIds, false, null, 6, null);
        Intrinsics.checkNotNullParameter(allowedUserIds, "allowedUserIds");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
      (r8v0 java.util.Set)
      (r9v0 boolean)
      (r10v0 java.util.Set)
      (r11v0 android.os.Bundle)
      (r12v0 android.os.Bundle)
      (wrap int:?: TERNARY null = ((wrap int:0x0000: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (1000 int) : (r13v0 int))
     A[MD:(java.util.Set<java.lang.String>, boolean, java.util.Set<android.content.ComponentName>, android.os.Bundle, android.os.Bundle, int):void (m)] (LINE:3) call: e3.o0.<init>(java.util.Set, boolean, java.util.Set, android.os.Bundle, android.os.Bundle, int):void type: THIS */
    public /* synthetic */ C4778o0(Set set, boolean z10, Set set2, Bundle bundle, Bundle bundle2, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, z10, set2, bundle, bundle2, (i11 & 32) != 0 ? 1000 : i10);
    }

    public C4778o0(Set<String> set, boolean z10, Set<ComponentName> set2, Bundle bundle, Bundle bundle2, int i10) {
        super("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle, bundle2, false, z10, set2, i10);
        this.allowedUserIds = set;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
      (wrap java.util.Set:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap java.util.Set:0x0004: INVOKE  STATIC call: kotlin.collections.q0.d():java.util.Set A[MD:<T>:():java.util.Set<T> (m), WRAPPED] (LINE:7)) : (r1v0 java.util.Set))
      (wrap boolean:?: TERNARY null = ((wrap int:0x0008: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
      (wrap java.util.Set:?: TERNARY null = ((wrap int:0x000d: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap java.util.Set:0x0011: INVOKE  STATIC call: kotlin.collections.q0.d():java.util.Set A[MD:<T>:():java.util.Set<T> (m), WRAPPED] (LINE:8)) : (r3v0 java.util.Set))
     A[MD:(java.util.Set<java.lang.String>, boolean, java.util.Set<android.content.ComponentName>):void (m)] (LINE:9) call: e3.o0.<init>(java.util.Set, boolean, java.util.Set):void type: THIS */
    public /* synthetic */ C4778o0(Set set, boolean z10, Set set2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C7702q0.m31908d() : set, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? C7702q0.m31908d() : set2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C4778o0(@NotNull Set<String> allowedUserIds, boolean z10, @NotNull Set<ComponentName> allowedProviders) {
        Intrinsics.checkNotNullParameter(allowedUserIds, "allowedUserIds");
        Intrinsics.checkNotNullParameter(allowedProviders, "allowedProviders");
        Companion companion = INSTANCE;
        this(allowedUserIds, z10, allowedProviders, companion.m23214a(allowedUserIds), companion.m23214a(allowedUserIds), 0, 32, null);
    }
}
