package ul;

import android.content.Context;
import bh.q0;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a!\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/content/Context;", "context", BuildConfig.FLAVOR, "callerName", "a", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    @NotNull
    public static final String a(@NotNull Context context, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (str != null) {
            if (str.length() == 0) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        String string = context.getString(q0.Z);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }
}
