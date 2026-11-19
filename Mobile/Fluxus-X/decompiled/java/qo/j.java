package qo;

import android.graphics.Rect;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import no.u2;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lbr/b;", "Lno/u2$d$b;", "rendering", BuildConfig.FLAVOR, "d", "(Lbr/b;Lno/u2$d$b;)V", "document_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j {
    public static final void d(br.b bVar, final u2.d.b bVar2) {
        ir.a navigationState = bVar2.getNavigationState();
        Function0 function0 = new Function0() { // from class: qo.h
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.e(bVar2);
            }
        };
        Function0 function1 = new Function0() { // from class: qo.i
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.f(bVar2);
            }
        };
        Pi2NavigationBar navigationBar = bVar.f4561e;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ConstraintLayout root = bVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        StepStyles.DocumentStepStyle styles = bVar2.getStyles();
        Rect rectH = styles != null ? sr.h.h(styles) : null;
        String navBarTitle = bVar2.getNavBarTitle();
        StepStyles.DocumentStepStyle styles2 = bVar2.getStyles();
        xr.c.e(navigationState, function0, function1, null, navigationBar, root, rectH, navBarTitle, styles2 != null ? styles2.getNavBarTitleStyleValue() : null, 8, null);
    }

    public static final Unit e(u2.d.b bVar) {
        bVar.d().invoke();
        return Unit.f21506a;
    }

    public static final Unit f(u2.d.b bVar) {
        bVar.e().invoke();
        return Unit.f21506a;
    }
}
