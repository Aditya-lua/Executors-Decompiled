package p118f4;

import androidx.fragment.app.ComponentCallbacksC0929c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: f4.j */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b&\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\f"}, m31665d2 = {"Lf4/j;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Landroidx/fragment/app/c;", "fragment", "", "violationMessage", "<init>", "(Landroidx/fragment/app/c;Ljava/lang/String;)V", "a", "Landroidx/fragment/app/c;", "()Landroidx/fragment/app/c;", "fragment_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
public abstract class AbstractC5355j extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ComponentCallbacksC0929c fragment;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5355j(@NotNull ComponentCallbacksC0929c fragment, @Nullable String str) {
        super(str);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.fragment = fragment;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ComponentCallbacksC0929c getFragment() {
        return this.fragment;
    }
}
