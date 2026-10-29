package e3;

import android.content.ComponentName;
import android.os.Bundle;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001BM\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010BC\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Le3/m0;", "Le3/r;", "Landroid/os/Bundle;", "requestData", "", Payload.TYPE, "candidateQueryData", "", "isSystemProviderRequired", "isAutoSelectAllowed", "", "Landroid/content/ComponentName;", "allowedProviders", "", "typePriorityHint", "<init>", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Bundle;ZZLjava/util/Set;I)V", "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZZLjava/util/Set;)V", "credentials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class m0 extends r {
    public /* synthetic */ m0(Bundle bundle, String str, Bundle bundle2, boolean z10, boolean z11, Set set, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bundle, str, bundle2, z10, (i11 & 16) != 0 ? false : z11, (i11 & 32) != 0 ? kotlin.collections.q0.d() : set, (i11 & 64) != 0 ? 2000 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(@NotNull Bundle requestData, @NotNull String type, @NotNull Bundle candidateQueryData, boolean z10, boolean z11, @NotNull Set<ComponentName> allowedProviders, int i10) {
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

    public /* synthetic */ m0(String str, Bundle bundle, Bundle bundle2, boolean z10, boolean z11, Set set, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bundle, bundle2, z10, (i10 & 16) != 0 ? false : z11, (i10 & 32) != 0 ? kotlin.collections.q0.d() : set);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m0(@NotNull String type, @NotNull Bundle requestData, @NotNull Bundle candidateQueryData, boolean z10, boolean z11, @NotNull Set<ComponentName> allowedProviders) {
        this(requestData, type, candidateQueryData, z10, z11, allowedProviders, 0, 64, null);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
        Intrinsics.checkNotNullParameter(allowedProviders, "allowedProviders");
    }
}
