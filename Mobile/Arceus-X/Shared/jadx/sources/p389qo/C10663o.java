package p389qo;

import android.graphics.Rect;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.p055ui.Pi2NavigationBar;
import er.C5199h;
import ir.C6966c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p313nq.C9546b;

/* JADX INFO: renamed from: qo.o */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m31665d2 = {"Lnq/b;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$f;", "rendering", "", "d", "(Lnq/b;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$f;)V", "government-id_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C10663o {
    /* JADX INFO: renamed from: d */
    public static final void m40756d(C9546b c9546b, final Screen.C3531f c3531f) {
        NavigationState navigationState = c3531f.getNavigationState();
        Function0 function0 = new Function0() { // from class: qo.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C10663o.m40757e(c3531f);
            }
        };
        Function0 function1 = new Function0() { // from class: qo.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C10663o.m40758f(c3531f);
            }
        };
        Pi2NavigationBar navigationBar = c9546b.f34505e;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ConstraintLayout root = c9546b.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        StepStyles.GovernmentIdStepStyle styles = c3531f.getStyles();
        Rect rectM24132h = styles != null ? C5199h.m24132h(styles) : null;
        String navBarTitle = c3531f.getNavBarTitle();
        StepStyles.GovernmentIdStepStyle styles2 = c3531f.getStyles();
        C6966c.m29335e(navigationState, function0, function1, null, navigationBar, root, rectM24132h, navBarTitle, styles2 != null ? styles2.getNavBarTitleStyleValue() : null, 8, null);
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m40757e(Screen.C3531f c3531f) {
        c3531f.m17441e().invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m40758f(Screen.C3531f c3531f) {
        c3531f.m17442f().invoke();
        return Unit.f29331a;
    }
}
