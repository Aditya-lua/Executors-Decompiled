package p342or;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ar.C1152g;
import ar.UiStepBottomSheet;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.SheetComponent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7699p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7729c0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.C0372e0;
import p016an.InterfaceC0364a0;
import p016an.ViewEnvironment;

/* JADX INFO: renamed from: or.q1 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R$\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m31665d2 = {"Lor/q1;", "", "Landroid/view/ViewGroup;", "contentView", "<init>", "(Landroid/view/ViewGroup;)V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;", "sheetComponent", "Lan/y;", "viewEnvironment", "", "g", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;Lan/y;)V", "f", "()V", "a", "Landroid/view/ViewGroup;", "Lar/p;", "b", "Lar/p;", "currentBottomSheet", "c", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;", "d", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;", "setCurrentSheetComponent", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;)V", "currentSheetComponent", "Lar/g;", "e", "()Lar/g;", "uiScreenGenerationResult", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C9971q1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ViewGroup contentView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public UiStepBottomSheet currentBottomSheet;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public SheetComponent currentSheetComponent;

    public C9971q1(@NotNull ViewGroup contentView) {
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        this.contentView = contentView;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m38767h() {
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m38768i(C7729c0 c7729c0) {
        ((Function0) c7729c0.f29425a).invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m38769j(SheetComponent sheetComponent, C9971q1 c9971q1, View view) {
        sheetComponent.mo20563g1(true);
        sheetComponent.mo20566p2(false);
        c9971q1.contentView.removeView(view);
        c9971q1.currentSheetComponent = null;
        c9971q1.currentBottomSheet = null;
        return Unit.f29331a;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final SheetComponent getCurrentSheetComponent() {
        return this.currentSheetComponent;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final C1152g m38771e() {
        UiStepBottomSheet uiStepBottomSheet = this.currentBottomSheet;
        if (uiStepBottomSheet != null) {
            return uiStepBottomSheet.getUiScreenGenerationResult();
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final void m38772f() {
        BottomSheetBehavior<?> bottomSheetBehaviorM6510h;
        UiStepBottomSheet uiStepBottomSheet = this.currentBottomSheet;
        if (uiStepBottomSheet != null && (bottomSheetBehaviorM6510h = uiStepBottomSheet.m6510h()) != null) {
            bottomSheetBehaviorM6510h.m12125X0(5);
        }
        this.currentSheetComponent = null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, or.n1] */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, or.p1] */
    /* JADX INFO: renamed from: g */
    public final void m38773g(@NotNull final SheetComponent sheetComponent, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(sheetComponent, "sheetComponent");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        this.currentSheetComponent = sheetComponent;
        final C7729c0 c7729c0 = new C7729c0();
        c7729c0.f29425a = new Function0() { // from class: or.n1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C9971q1.m38767h();
            }
        };
        UiStepBottomSheet uiStepBottomSheet = new UiStepBottomSheet(sheetComponent.getScreen(), C7699p.m31892k(), new Function0() { // from class: or.o1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C9971q1.m38768i(c7729c0);
            }
        }, null, sheetComponent.getHideWhenTappedOutside());
        this.currentBottomSheet = uiStepBottomSheet;
        InterfaceC0364a0<UiStepBottomSheet> interfaceC0364a0Mo1380a = uiStepBottomSheet.mo1380a();
        Context context = this.contentView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final View viewMo1379a = interfaceC0364a0Mo1380a.mo1379a(uiStepBottomSheet, viewEnvironment, context, this.contentView);
        this.contentView.addView(viewMo1379a);
        C0372e0.m1415h(viewMo1379a);
        c7729c0.f29425a = new Function0() { // from class: or.p1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C9971q1.m38769j(sheetComponent, this, viewMo1379a);
            }
        };
    }
}
