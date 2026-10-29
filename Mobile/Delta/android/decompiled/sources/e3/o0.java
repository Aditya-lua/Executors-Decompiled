package e3;

import android.content.ComponentName;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016BG\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB3\b\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\u000e\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Le3/o0;", "Le3/r;", "", "", "allowedUserIds", "", "isAutoSelectAllowed", "Landroid/content/ComponentName;", "allowedProviders", "Landroid/os/Bundle;", "requestData", "candidateQueryData", "", "typePriorityHint", "<init>", "(Ljava/util/Set;ZLjava/util/Set;Landroid/os/Bundle;Landroid/os/Bundle;I)V", "(Ljava/util/Set;ZLjava/util/Set;)V", "i", "Ljava/util/Set;", "getAllowedUserIds", "()Ljava/util/Set;", "j", "a", "credentials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o0 extends r {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Set<String> allowedUserIds;

    /* JADX INFO: renamed from: e3.o0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Le3/o0$a;", "", "<init>", "()V", "", "", "allowUserIds", "Landroid/os/Bundle;", "a", "(Ljava/util/Set;)Landroid/os/Bundle;", "BUNDLE_KEY_ALLOWED_USER_IDS", "Ljava/lang/String;", "credentials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Bundle a(@NotNull Set<String> allowUserIds) {
            Intrinsics.checkNotNullParameter(allowUserIds, "allowUserIds");
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("androidx.credentials.BUNDLE_KEY_ALLOWED_USER_IDS", new ArrayList<>(allowUserIds));
            return bundle;
        }

        public Companion() {
        }
    }

    public o0() {
        this(null, false, null, 7, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o0(@NotNull Set<String> allowedUserIds) {
        this(allowedUserIds, false, null, 6, null);
        Intrinsics.checkNotNullParameter(allowedUserIds, "allowedUserIds");
    }

    public /* synthetic */ o0(Set set, boolean z10, Set set2, Bundle bundle, Bundle bundle2, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, z10, set2, bundle, bundle2, (i11 & 32) != 0 ? 1000 : i10);
    }

    public o0(Set<String> set, boolean z10, Set<ComponentName> set2, Bundle bundle, Bundle bundle2, int i10) {
        super("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle, bundle2, false, z10, set2, i10);
        this.allowedUserIds = set;
    }

    public /* synthetic */ o0(Set set, boolean z10, Set set2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? kotlin.collections.q0.d() : set, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? kotlin.collections.q0.d() : set2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o0(@NotNull Set<String> allowedUserIds, boolean z10, @NotNull Set<ComponentName> allowedProviders) {
        Intrinsics.checkNotNullParameter(allowedUserIds, "allowedUserIds");
        Intrinsics.checkNotNullParameter(allowedProviders, "allowedProviders");
        Companion companion = INSTANCE;
        this(allowedUserIds, z10, allowedProviders, companion.a(allowedUserIds), companion.a(allowedUserIds), 0, 32, null);
    }
}
