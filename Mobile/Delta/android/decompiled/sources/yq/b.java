package yq;

import android.content.Context;
import android.content.res.Resources;
import jq.u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroid/content/Context;", "context", "", "a", "(Landroid/content/Context;)V", "shared_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    public static final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Intrinsics.checkNotNull(context.getResources().getLayout(u.f21680c));
        } catch (Resources.NotFoundException unused) {
            yd.a.b(context);
        }
    }
}
