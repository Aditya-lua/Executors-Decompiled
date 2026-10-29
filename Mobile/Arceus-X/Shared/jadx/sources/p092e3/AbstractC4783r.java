package p092e3;

import android.content.ComponentName;
import android.os.Bundle;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: e3.r */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\b&\u0018\u0000 #2\u00020\u0001:\u0001\u0011BG\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u0011\u0010\u001eR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, m31665d2 = {"Le3/r;", "", "", Payload.TYPE, "Landroid/os/Bundle;", "requestData", "candidateQueryData", "", "isSystemProviderRequired", "isAutoSelectAllowed", "", "Landroid/content/ComponentName;", "allowedProviders", "", "typePriorityHint", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZZLjava/util/Set;I)V", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "Landroid/os/Bundle;", "c", "()Landroid/os/Bundle;", "Z", "f", "()Z", "e", "Ljava/util/Set;", "()Ljava/util/Set;", "g", "I", "getTypePriorityHint", "()I", "h", "credentials_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public abstract class AbstractC4783r {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Bundle requestData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Bundle candidateQueryData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean isSystemProviderRequired;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean isAutoSelectAllowed;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Set<ComponentName> allowedProviders;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final int typePriorityHint;

    public AbstractC4783r(@NotNull String type, @NotNull Bundle requestData, @NotNull Bundle candidateQueryData, boolean z10, boolean z11, @NotNull Set<ComponentName> allowedProviders, int i10) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
        Intrinsics.checkNotNullParameter(allowedProviders, "allowedProviders");
        this.type = type;
        this.requestData = requestData;
        this.candidateQueryData = candidateQueryData;
        this.isSystemProviderRequired = z10;
        this.isAutoSelectAllowed = z11;
        this.allowedProviders = allowedProviders;
        this.typePriorityHint = i10;
        requestData.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z11);
        candidateQueryData.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z11);
        requestData.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", i10);
        candidateQueryData.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", i10);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Set<ComponentName> m23217a() {
        return this.allowedProviders;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Bundle getCandidateQueryData() {
        return this.candidateQueryData;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Bundle getRequestData() {
        return this.requestData;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsAutoSelectAllowed() {
        return this.isAutoSelectAllowed;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsSystemProviderRequired() {
        return this.isSystemProviderRequired;
    }
}
