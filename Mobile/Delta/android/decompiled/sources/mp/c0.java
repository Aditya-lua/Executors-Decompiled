package mp;

import androidx.activity.result.IntentSenderRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lmp/c0;", "", "Lg/c;", "Landroidx/activity/result/IntentSenderRequest;", "resolvableApiLauncher", "<init>", "(Lg/c;)V", "a", "()Lg/c;", "Lg/c;", "launchers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g.c<IntentSenderRequest> resolvableApiLauncher;

    public c0(@NotNull g.c<IntentSenderRequest> resolvableApiLauncher) {
        Intrinsics.checkNotNullParameter(resolvableApiLauncher, "resolvableApiLauncher");
        this.resolvableApiLauncher = resolvableApiLauncher;
    }

    @NotNull
    public final g.c<IntentSenderRequest> a() {
        return this.resolvableApiLauncher;
    }
}
