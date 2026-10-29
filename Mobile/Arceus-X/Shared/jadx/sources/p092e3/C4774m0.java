package p092e3;

import android.content.ComponentName;
import android.os.Bundle;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7702q0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: e3.m0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001BM\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010BC\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, m31665d2 = {"Le3/m0;", "Le3/r;", "Landroid/os/Bundle;", "requestData", "", Payload.TYPE, "candidateQueryData", "", "isSystemProviderRequired", "isAutoSelectAllowed", "", "Landroid/content/ComponentName;", "allowedProviders", "", "typePriorityHint", "<init>", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Bundle;ZZLjava/util/Set;I)V", "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZZLjava/util/Set;)V", "credentials_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public class C4774m0 extends AbstractC4783r {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
      (r9v0 android.os.Bundle)
      (r10v0 java.lang.String)
      (r11v0 android.os.Bundle)
      (r12v0 boolean)
      (wrap boolean:0x0005: TERNARY null = ((wrap int:0x0000: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r13v0 boolean))
      (wrap java.util.Set:0x000e: TERNARY null = ((wrap int:0x0006: ARITH (r16v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap java.util.Set:0x000a: INVOKE  STATIC call: kotlin.collections.q0.d():java.util.Set A[MD:<T>:():java.util.Set<T> (m), WRAPPED] (LINE:1)) : (r14v0 java.util.Set))
      (wrap int:?: TERNARY null = ((wrap int:0x000f: ARITH (r16v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (2000 int) : (r15v0 int))
     A[MD:(android.os.Bundle, java.lang.String, android.os.Bundle, boolean, boolean, java.util.Set<android.content.ComponentName>, int):void (m)] (LINE:2) call: e3.m0.<init>(android.os.Bundle, java.lang.String, android.os.Bundle, boolean, boolean, java.util.Set, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4774m0(Bundle bundle, String str, Bundle bundle2, boolean z10, boolean z11, Set set, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bundle, str, bundle2, z10, (i11 & 16) != 0 ? false : z11, (i11 & 32) != 0 ? C7702q0.m31908d() : set, (i11 & 64) != 0 ? 2000 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4774m0(@NotNull Bundle requestData, @NotNull String type, @NotNull Bundle candidateQueryData, boolean z10, boolean z11, @NotNull Set<ComponentName> allowedProviders, int i10) {
        super(type, requestData, candidateQueryData, z10, z11, allowedProviders, i10);
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
        Intrinsics.checkNotNullParameter(allowedProviders, "allowedProviders");
        if (type.length() <= 0) {
            throw new IllegalArgumentException("type should not be empty");
        }
        if (i10 == 100) {
            throw new IllegalArgumentException("Custom types should not have passkey level priority.");
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
      (r8v0 java.lang.String)
      (r9v0 android.os.Bundle)
      (r10v0 android.os.Bundle)
      (r11v0 boolean)
      (wrap boolean:0x0005: TERNARY null = ((wrap int:0x0000: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
      (wrap java.util.Set:?: TERNARY null = ((wrap int:0x0006: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap java.util.Set:0x000a: INVOKE  STATIC call: kotlin.collections.q0.d():java.util.Set A[MD:<T>:():java.util.Set<T> (m), WRAPPED] (LINE:7)) : (r13v0 java.util.Set))
     A[MD:(java.lang.String, android.os.Bundle, android.os.Bundle, boolean, boolean, java.util.Set<android.content.ComponentName>):void (m)] (LINE:8) call: e3.m0.<init>(java.lang.String, android.os.Bundle, android.os.Bundle, boolean, boolean, java.util.Set):void type: THIS */
    public /* synthetic */ C4774m0(String str, Bundle bundle, Bundle bundle2, boolean z10, boolean z11, Set set, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bundle, bundle2, z10, (i10 & 16) != 0 ? false : z11, (i10 & 32) != 0 ? C7702q0.m31908d() : set);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4774m0(@NotNull String type, @NotNull Bundle requestData, @NotNull Bundle candidateQueryData, boolean z10, boolean z11, @NotNull Set<ComponentName> allowedProviders) {
        this(requestData, type, candidateQueryData, z10, z11, allowedProviders, 0, 64, null);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
        Intrinsics.checkNotNullParameter(allowedProviders, "allowedProviders");
    }
}
