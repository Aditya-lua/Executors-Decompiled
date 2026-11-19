package p4;

import android.view.View;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/view/View;", "Lp4/d;", "navigationEventDispatcherOwner", BuildConfig.FLAVOR, "a", "(Landroid/view/View;Lp4/d;)V", "navigationevent"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class r {
    public static final void a(@NotNull View view, @Nullable d dVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(q.f28791a, dVar);
    }
}
