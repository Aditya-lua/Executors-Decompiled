package es;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.github.luben.zstd.BuildConfig;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import nn.ViewEnvironment;
import or.UiStepBottomSheet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R$\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Les/v1;", BuildConfig.FLAVOR, "Landroid/view/ViewGroup;", "contentView", "<init>", "(Landroid/view/ViewGroup;)V", "Lqr/g5;", "sheetComponent", "Lnn/z;", "viewEnvironment", BuildConfig.FLAVOR, "g", "(Lqr/g5;Lnn/z;)V", "f", "()V", "a", "Landroid/view/ViewGroup;", "Lor/s;", "b", "Lor/s;", "currentBottomSheet", "c", "Lqr/g5;", "d", "()Lqr/g5;", "setCurrentSheetComponent", "(Lqr/g5;)V", "currentSheetComponent", "Lor/j;", "e", "()Lor/j;", "uiScreenGenerationResult", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ViewGroup contentView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public UiStepBottomSheet currentBottomSheet;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public qr.g5 currentSheetComponent;

    public v1(@NotNull ViewGroup contentView) {
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        this.contentView = contentView;
    }

    public static final Unit h() {
        return Unit.f21506a;
    }

    public static final Unit i(p001kotlin.jvm.internal.c0 c0Var) {
        ((Function0) c0Var.f21575a).invoke();
        return Unit.f21506a;
    }

    public static final Unit j(qr.g5 g5Var, v1 v1Var, View view) {
        g5Var.e1(true);
        g5Var.s2(false);
        v1Var.contentView.removeView(view);
        v1Var.currentSheetComponent = null;
        v1Var.currentBottomSheet = null;
        return Unit.f21506a;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final qr.g5 getCurrentSheetComponent() {
        return this.currentSheetComponent;
    }

    @Nullable
    public final or.j e() {
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

    /* JADX WARN: Type inference failed for: r1v0, types: [T, es.s1] */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, es.u1] */
    public final void g(@NotNull final qr.g5 sheetComponent, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(sheetComponent, "sheetComponent");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        this.currentSheetComponent = sheetComponent;
        final p001kotlin.jvm.internal.c0 c0Var = new p001kotlin.jvm.internal.c0();
        c0Var.f21575a = new Function0() { // from class: es.s1
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return v1.h();
            }
        };
        UiStepBottomSheet uiStepBottomSheet = new UiStepBottomSheet(sheetComponent.getScreen(), p001kotlin.collections.p.k(), new Function0() { // from class: es.t1
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return v1.i(c0Var);
            }
        }, null, sheetComponent.getHideWhenTappedOutside());
        this.currentBottomSheet = uiStepBottomSheet;
        nn.b0<UiStepBottomSheet> b0VarA = uiStepBottomSheet.a();
        Context context = this.contentView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final View viewA = b0VarA.a(uiStepBottomSheet, viewEnvironment, context, this.contentView);
        this.contentView.addView(viewA);
        nn.f0.h(viewA);
        c0Var.f21575a = new Function0() { // from class: es.u1
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return v1.j(sheetComponent, this, viewA);
            }
        };
    }
}
