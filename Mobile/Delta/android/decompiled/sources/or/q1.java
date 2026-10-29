package or;

import an.ViewEnvironment;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ar.UiStepBottomSheet;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.withpersona.sdk2.inquiry.steps.ui.components.SheetComponent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R$\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lor/q1;", "", "Landroid/view/ViewGroup;", "contentView", "<init>", "(Landroid/view/ViewGroup;)V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;", "sheetComponent", "Lan/y;", "viewEnvironment", "", "g", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;Lan/y;)V", "f", "()V", "a", "Landroid/view/ViewGroup;", "Lar/p;", "b", "Lar/p;", "currentBottomSheet", "c", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;", "d", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;", "setCurrentSheetComponent", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;)V", "currentSheetComponent", "Lar/g;", "e", "()Lar/g;", "uiScreenGenerationResult", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ViewGroup contentView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public UiStepBottomSheet currentBottomSheet;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public SheetComponent currentSheetComponent;

    public q1(@NotNull ViewGroup contentView) {
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        this.contentView = contentView;
    }

    public static final Unit h() {
        return Unit.f22483a;
    }

    public static final Unit i(kotlin.jvm.internal.c0 c0Var) {
        ((Function0) c0Var.f22552a).invoke();
        return Unit.f22483a;
    }

    public static final Unit j(SheetComponent sheetComponent, q1 q1Var, View view) {
        sheetComponent.f1(true);
        sheetComponent.p2(false);
        q1Var.contentView.removeView(view);
        q1Var.currentSheetComponent = null;
        q1Var.currentBottomSheet = null;
        return Unit.f22483a;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final SheetComponent getCurrentSheetComponent() {
        return this.currentSheetComponent;
    }

    @Nullable
    public final ar.g e() {
        UiStepBottomSheet uiStepBottomSheet = this.currentBottomSheet;
        if (uiStepBottomSheet != null) {
            return uiStepBottomSheet.getUiScreenGenerationResult();
        }
        return null;
    }

    public final void f() {
        BottomSheetBehavior<?> bottomSheetBehaviorH;
        UiStepBottomSheet uiStepBottomSheet = this.currentBottomSheet;
        if (uiStepBottomSheet != null && (bottomSheetBehaviorH = uiStepBottomSheet.h()) != null) {
            bottomSheetBehaviorH.X0(5);
        }
        this.currentSheetComponent = null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, or.n1] */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, or.p1] */
    public final void g(@NotNull final SheetComponent sheetComponent, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(sheetComponent, "sheetComponent");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        this.currentSheetComponent = sheetComponent;
        final kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        c0Var.f22552a = new Function0() { // from class: or.n1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q1.h();
            }
        };
        UiStepBottomSheet uiStepBottomSheet = new UiStepBottomSheet(sheetComponent.getScreen(), kotlin.collections.p.k(), new Function0() { // from class: or.o1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q1.i(c0Var);
            }
        }, null, sheetComponent.getHideWhenTappedOutside());
        this.currentBottomSheet = uiStepBottomSheet;
        an.a0<UiStepBottomSheet> a0VarA = uiStepBottomSheet.a();
        Context context = this.contentView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final View viewA = a0VarA.a(uiStepBottomSheet, viewEnvironment, context, this.contentView);
        this.contentView.addView(viewA);
        an.e0.h(viewA);
        c0Var.f22552a = new Function0() { // from class: or.p1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q1.j(sheetComponent, this, viewA);
            }
        };
    }
}
