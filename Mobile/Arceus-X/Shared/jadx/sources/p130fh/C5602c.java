package p130fh;

import android.app.Activity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p151gk.C6104a0;
import sg.C11347q0;

/* JADX INFO: renamed from: fh.c */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Landroid/app/Activity;", "Lfh/i;", "c", "(Landroid/app/Activity;)Lfh/i;", "NativeShell_googleProdRelease"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C5602c {
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final InterfaceC5608i m25330c(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        return new C5605f(activity, new Function0() { // from class: fh.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5602c.m25331d(activity);
            }
        }, null, new Function0() { // from class: fh.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5602c.m25332e(activity);
            }
        }, 4, null);
    }

    /* JADX INFO: renamed from: d */
    public static final String m25331d(Activity activity) {
        String string = activity.getString(C11347q0.f39992n, activity.getString(C11347q0.f39908E));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m25332e(Activity activity) {
        C6104a0.m27004d(activity);
        return Unit.f29331a;
    }
}
