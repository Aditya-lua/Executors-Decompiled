package p132fn;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p203j.ActivityC6992b;

/* JADX INFO: renamed from: fn.u */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, m31665d2 = {"Landroid/content/Context;", "Lj/b;", "a", "(Landroid/content/Context;)Lj/b;", "b", "camera_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C5711u {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final ActivityC6992b m25883a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (context instanceof ActivityC6992b) {
            return (ActivityC6992b) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext, "getBaseContext(...)");
        return m25883a(baseContext);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final ActivityC6992b m25884b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        ActivityC6992b activityC6992bM25883a = m25883a(context);
        if (activityC6992bM25883a != null) {
            return activityC6992bM25883a;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
