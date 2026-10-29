package fj;

import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fj.m0, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, m31665d2 = {"Lfj/m0;", "", "", "", "grantedAssetIds", "grantedBundleIds", "<init>", "([Ljava/lang/String;[Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "[Ljava/lang/String;", "getGrantedAssetIds", "()[Ljava/lang/String;", "b", "getGrantedBundleIds", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class RobloxPurchaseInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("granted_asset_ids")
    @Nullable
    private final String[] grantedAssetIds;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("granted_bundle_ids")
    @Nullable
    private final String[] grantedBundleIds;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public RobloxPurchaseInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RobloxPurchaseInfo)) {
            return false;
        }
        RobloxPurchaseInfo robloxPurchaseInfo = (RobloxPurchaseInfo) other;
        return Intrinsics.m31980c(this.grantedAssetIds, robloxPurchaseInfo.grantedAssetIds) && Intrinsics.m31980c(this.grantedBundleIds, robloxPurchaseInfo.grantedBundleIds);
    }

    public int hashCode() {
        String[] strArr = this.grantedAssetIds;
        int iHashCode = (strArr == null ? 0 : Arrays.hashCode(strArr)) * 31;
        String[] strArr2 = this.grantedBundleIds;
        return iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0);
    }

    @NotNull
    public String toString() {
        return "RobloxPurchaseInfo(grantedAssetIds=" + Arrays.toString(this.grantedAssetIds) + ", grantedBundleIds=" + Arrays.toString(this.grantedBundleIds) + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public RobloxPurchaseInfo(@Nullable String[] strArr, @Nullable String[] strArr2) {
        this.grantedAssetIds = strArr;
        this.grantedBundleIds = strArr2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
      (wrap java.lang.String[]:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String[]) : (r2v0 java.lang.String[]))
      (wrap java.lang.String[]:?: TERNARY null = ((wrap int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String[]) : (r3v0 java.lang.String[]))
     A[MD:(java.lang.String[], java.lang.String[]):void (m)] (LINE:5) call: fj.m0.<init>(java.lang.String[], java.lang.String[]):void type: THIS */
    public /* synthetic */ RobloxPurchaseInfo(String[] strArr, String[] strArr2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : strArr, (i10 & 2) != 0 ? null : strArr2);
    }
}
