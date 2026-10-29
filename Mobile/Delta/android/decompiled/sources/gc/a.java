package gc;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u00122\u00020\u0001:\u0001\u0010J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lgc/a;", "", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "name", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "essential", "Z", "a", "()Z", "c", "java.com.google.android.libraries.identity.googleid.granule_granule"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f17999a;
    public final boolean b;

    /* JADX INFO: renamed from: gc.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0081T¢\u0006\f\n\u0004\b\b\u0010\t\u0012\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00078\u0000X\u0081T¢\u0006\f\n\u0004\b\f\u0010\t\u0012\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lgc/a$a;", "", "Lgc/a;", "claim", "Landroid/os/Bundle;", "toBundle", "(Lgc/a;)Landroid/os/Bundle;", "", "BUNDLE_KEY_CLAIM_NAME", "Ljava/lang/String;", "getBUNDLE_KEY_CLAIM_NAME$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "()V", "BUNDLE_KEY_CLAIM_ESSENTIAL", "getBUNDLE_KEY_CLAIM_ESSENTIAL$java_com_google_android_libraries_identity_googleid_granule_granule$annotations", "java.com.google.android.libraries.identity.googleid.granule_granule"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(@NonNull DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public static final Bundle a(@NonNull a claim) {
            Intrinsics.checkNotNullParameter(claim, "claim");
            Bundle bundle = new Bundle();
            bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_CLAIM_NAME", claim.getF17999a());
            bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_CLAIM_ESSENTIAL", claim.getB());
            return bundle;
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF17999a() {
        return this.f17999a;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return this.b == aVar.b && Intrinsics.c(this.f17999a, aVar.f17999a);
    }

    public int hashCode() {
        return Objects.hash(this.f17999a, Boolean.valueOf(this.b));
    }
}
