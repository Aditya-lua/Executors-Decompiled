package fn;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroid/content/Context;", "Lj/b;", "a", "(Landroid/content/Context;)Lj/b;", "b", "camera_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class u {
    @Nullable
    public static final j.b a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (context instanceof j.b) {
            return (j.b) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext, "getBaseContext(...)");
        return a(baseContext);
    }

    @NotNull
    public static final j.b b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        j.b bVarA = a(context);
        if (bVarA != null) {
            return bVarA;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
