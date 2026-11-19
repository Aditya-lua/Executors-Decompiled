package oh;

import android.app.Activity;
import bh.q0;
import ok.a0;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroid/app/Activity;", "Loh/i;", "c", "(Landroid/app/Activity;)Loh/i;", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {
    @NotNull
    public static final i c(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        return new f(activity, new Function0() { // from class: oh.a
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c.d(activity);
            }
        }, null, new Function0() { // from class: oh.b
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c.e(activity);
            }
        }, 4, null);
    }

    public static final String d(Activity activity) {
        String string = activity.getString(q0.f4258n, activity.getString(q0.E));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public static final Unit e(Activity activity) {
        a0.d(activity);
        return Unit.f21506a;
    }
}
