package ep;

import android.graphics.Rect;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;
import vo.y3;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lbr/b;", "Lvo/y3$g;", "rendering", BuildConfig.FLAVOR, "d", "(Lbr/b;Lvo/y3$g;)V", "government-id_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class p {
    public static final void d(br.b bVar, final y3.g gVar) {
        ir.a navigationState = gVar.getNavigationState();
        Function0 function0 = new Function0() { // from class: ep.n
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p.e(gVar);
            }
        };
        Function0 function1 = new Function0() { // from class: ep.o
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p.f(gVar);
            }
        };
        Pi2NavigationBar navigationBar = bVar.f4561e;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ConstraintLayout root = bVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        StepStyles.GovernmentIdStepStyle styles = gVar.getStyles();
        Rect rectH = styles != null ? sr.h.h(styles) : null;
        String navBarTitle = gVar.getNavBarTitle();
        StepStyles.GovernmentIdStepStyle styles2 = gVar.getStyles();
        xr.c.e(navigationState, function0, function1, null, navigationBar, root, rectH, navBarTitle, styles2 != null ? styles2.getNavBarTitleStyleValue() : null, 8, null);
    }

    public static final Unit e(y3.g gVar) {
        gVar.e().invoke();
        return Unit.f21506a;
    }

    public static final Unit f(y3.g gVar) {
        gVar.f().invoke();
        return Unit.f21506a;
    }
}
