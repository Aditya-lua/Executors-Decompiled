package sq;

import android.graphics.Rect;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import mq.q5;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lbr/b;", "Lmq/q5$d$d;", "rendering", BuildConfig.FLAVOR, "d", "(Lbr/b;Lmq/q5$d$d;)V", "selfie_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {
    public static final void d(br.b bVar, final q5.d.C0474d c0474d) {
        ir.a navigationState = c0474d.getNavigationState();
        Function0 function0 = new Function0() { // from class: sq.j
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l.e(c0474d);
            }
        };
        Function0 function1 = new Function0() { // from class: sq.k
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l.f(c0474d);
            }
        };
        Pi2NavigationBar navigationBar = bVar.f4561e;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ConstraintLayout root = bVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        StepStyles.SelfieStepStyle styles = c0474d.getStyles();
        Rect rectH = styles != null ? sr.h.h(styles) : null;
        String navBarTitle = c0474d.getNavBarTitle();
        StepStyles.SelfieStepStyle styles2 = c0474d.getStyles();
        xr.c.e(navigationState, function0, function1, null, navigationBar, root, rectH, navBarTitle, styles2 != null ? styles2.getNavBarTitleStyleValue() : null, 8, null);
    }

    public static final Unit e(q5.d.C0474d c0474d) {
        c0474d.c().invoke();
        return Unit.f21506a;
    }

    public static final Unit f(q5.d.C0474d c0474d) {
        c0474d.d().invoke();
        return Unit.f21506a;
    }
}
