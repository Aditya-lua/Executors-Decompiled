package ak;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: ak.f0, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u0013\u0010\f¨\u0006\u001c"}, d2 = {"Lak/f0;", "", "Lorg/json/JSONObject;", "responseJson", "", "success", "retryable", "", "errorMessage", "<init>", "(Lorg/json/JSONObject;ZZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lorg/json/JSONObject;", "b", "()Lorg/json/JSONObject;", "Z", "d", "()Z", "c", "Ljava/lang/String;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FetchFlagResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final JSONObject responseJson;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final boolean success;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean retryable;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String errorMessage;

    public FetchFlagResult(@Nullable JSONObject jSONObject, boolean z10, boolean z11, @Nullable String str) {
        this.responseJson = jSONObject;
        this.success = z10;
        this.retryable = z11;
        this.errorMessage = str;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final JSONObject getResponseJson() {
        return this.responseJson;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getRetryable() {
        return this.retryable;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FetchFlagResult)) {
            return false;
        }
        FetchFlagResult fetchFlagResult = (FetchFlagResult) other;
        return Intrinsics.c(this.responseJson, fetchFlagResult.responseJson) && this.success == fetchFlagResult.success && this.retryable == fetchFlagResult.retryable && Intrinsics.c(this.errorMessage, fetchFlagResult.errorMessage);
    }

    public int hashCode() {
        JSONObject jSONObject = this.responseJson;
        int iHashCode = (((((jSONObject == null ? 0 : jSONObject.hashCode()) * 31) + Boolean.hashCode(this.success)) * 31) + Boolean.hashCode(this.retryable)) * 31;
        String str = this.errorMessage;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FetchFlagResult(responseJson=" + this.responseJson + ", success=" + this.success + ", retryable=" + this.retryable + ", errorMessage=" + this.errorMessage + ")";
    }
}
