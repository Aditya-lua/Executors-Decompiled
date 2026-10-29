package co;

import android.graphics.Rect;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnq/b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$b;", "rendering", "", "d", "(Lnq/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$b;)V", "document_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {
    public static final void d(nq.b bVar, final DocumentWorkflow.c.b bVar2) {
        NavigationState navigationStateC = bVar2.getNavigationState();
        Function0 function0 = new Function0() { // from class: co.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.e(bVar2);
            }
        };
        Function0 function1 = new Function0() { // from class: co.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.f(bVar2);
            }
        };
        Pi2NavigationBar navigationBar = bVar.f26639e;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ConstraintLayout root = bVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        StepStyles.DocumentStepStyle documentStepStyleF = bVar2.getStyles();
        Rect rectH = documentStepStyleF != null ? er.h.h(documentStepStyleF) : null;
        String strA = bVar2.getNavBarTitle();
        StepStyles.DocumentStepStyle documentStepStyleF2 = bVar2.getStyles();
        ir.c.e(navigationStateC, function0, function1, null, navigationBar, root, rectH, strA, documentStepStyleF2 != null ? documentStepStyleF2.getNavBarTitleStyleValue() : null, 8, null);
    }

    public static final Unit e(DocumentWorkflow.c.b bVar) {
        bVar.d().invoke();
        return Unit.f22483a;
    }

    public static final Unit f(DocumentWorkflow.c.b bVar) {
        bVar.e().invoke();
        return Unit.f22483a;
    }
}
