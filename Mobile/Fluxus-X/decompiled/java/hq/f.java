package hq;

import androidx.p000lifecycle.l0;
import androidx.p000lifecycle.x0;
import com.github.luben.zstd.BuildConfig;
import fq.n1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u0014B\u001b\b\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lhq/f;", "Landroidx/lifecycle/x0;", "Landroidx/lifecycle/l0;", "savedStateHandle", "Liq/l$d;", "permissionRequestStateManagerFactory", "<init>", "(Landroidx/lifecycle/l0;Liq/l$d;)V", "Lfq/n1$c;", "props", "Liq/l;", "e", "(Lfq/n1$c;)Liq/l;", "b", "Landroidx/lifecycle/l0;", "c", "Liq/l$d;", "d", "Liq/l;", "permissionRequestStateManager", "a", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f extends x0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final l0 savedStateHandle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final iq.l.d permissionRequestStateManagerFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public iq.l permissionRequestStateManager;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lhq/f$a;", BuildConfig.FLAVOR, "Landroidx/lifecycle/l0;", "savedStateHandle", "Lhq/f;", "a", "(Landroidx/lifecycle/l0;)Lhq/f;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        f a(@NotNull l0 savedStateHandle);
    }

    public f(@NotNull l0 savedStateHandle, @NotNull iq.l.d permissionRequestStateManagerFactory) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(permissionRequestStateManagerFactory, "permissionRequestStateManagerFactory");
        this.savedStateHandle = savedStateHandle;
        this.permissionRequestStateManagerFactory = permissionRequestStateManagerFactory;
    }

    @NotNull
    public final iq.l e(@NotNull n1.Props props) {
        Intrinsics.checkNotNullParameter(props, "props");
        iq.l lVar = this.permissionRequestStateManager;
        if (lVar != null) {
            return lVar;
        }
        iq.l lVarA = this.permissionRequestStateManagerFactory.a(props, this.savedStateHandle);
        this.permissionRequestStateManager = lVarA;
        return lVarA;
    }
}
