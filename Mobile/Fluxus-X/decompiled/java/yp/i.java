package yp;

import androidx.p000lifecycle.d0;
import androidx.p000lifecycle.l0;
import androidx.p000lifecycle.x0;
import com.github.luben.zstd.BuildConfig;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B\u0013\b\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lyp/i;", "Landroidx/lifecycle/x0;", "Landroidx/lifecycle/l0;", "savedStateHandle", "<init>", "(Landroidx/lifecycle/l0;)V", BuildConfig.FLAVOR, "g", "()V", "b", "Landroidx/lifecycle/l0;", "f", "()Landroidx/lifecycle/l0;", "Landroidx/lifecycle/d0;", BuildConfig.FLAVOR, "c", "Landroidx/lifecycle/d0;", "e", "()Landroidx/lifecycle/d0;", "renderingName", "a", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i extends x0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final l0 savedStateHandle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final d0<String> renderingName;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lyp/i$a;", BuildConfig.FLAVOR, "Landroidx/lifecycle/l0;", "savedStateHandle", "Lyp/i;", "a", "(Landroidx/lifecycle/l0;)Lyp/i;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        i a(@NotNull l0 savedStateHandle);
    }

    public i(@NotNull l0 savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
        this.renderingName = savedStateHandle.c("renderingName", null);
    }

    @NotNull
    public final d0<String> e() {
        return this.renderingName;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final l0 getSavedStateHandle() {
        return this.savedStateHandle;
    }

    public final void g() {
        Iterator<T> it = this.savedStateHandle.g().iterator();
        while (it.hasNext()) {
            this.savedStateHandle.i((String) it.next(), null);
        }
    }
}
