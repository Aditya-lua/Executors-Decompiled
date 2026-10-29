package p151gk;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: gk.k */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Landroid/content/Context;", "", "a", "(Landroid/content/Context;)Z", "utils_googleRelease"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6118k {
    /* JADX INFO: renamed from: a */
    public static final boolean m27041a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return context.getPackageManager().hasSystemFeature("android.software.leanback");
    }
}
