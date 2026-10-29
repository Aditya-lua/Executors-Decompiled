package co;

import android.graphics.Rect;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
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

/* JADX INFO: renamed from: co.i */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m31665d2 = {"Lnq/b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$b;", "rendering", "", "d", "(Lnq/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$b;)V", "document_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C1704i {
    /* JADX INFO: renamed from: d */
    public static final void m8410d(C9546b c9546b, final DocumentWorkflow.InterfaceC3432c.b bVar) {
        NavigationState navigationStateM16528c = bVar.getNavigationState();
        Function0 function0 = new Function0() { // from class: co.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C1704i.m8411e(bVar);
            }
        };
        Function0 function1 = new Function0() { // from class: co.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C1704i.m8412f(bVar);
            }
        };
        Pi2NavigationBar navigationBar = c9546b.f34505e;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ConstraintLayout root = c9546b.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        StepStyles.DocumentStepStyle documentStepStyleM16531f = bVar.getStyles();
        Rect rectM24132h = documentStepStyleM16531f != null ? C5199h.m24132h(documentStepStyleM16531f) : null;
        String strM16527a = bVar.getNavBarTitle();
        StepStyles.DocumentStepStyle documentStepStyleM16531f2 = bVar.getStyles();
        C6966c.m29335e(navigationStateM16528c, function0, function1, null, navigationBar, root, rectM24132h, strM16527a, documentStepStyleM16531f2 != null ? documentStepStyleM16531f2.getNavBarTitleStyleValue() : null, 8, null);
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m8411e(DocumentWorkflow.InterfaceC3432c.b bVar) {
        bVar.m16529d().invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m8412f(DocumentWorkflow.InterfaceC3432c.b bVar) {
        bVar.m16530e().invoke();
        return Unit.f29331a;
    }
}
