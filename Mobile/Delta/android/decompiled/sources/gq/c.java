package gq;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.p000lifecycle.s;
import aq.i;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import er.h;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import jq.j;
import jq.z;
import jr.h0;
import jt.l;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import ku.k;
import ku.p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.m;
import ut.n;
import yp.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ§\u0001\u0010#\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000f2\b\u0010!\u001a\u0004\u0018\u00010 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u001bH\u0016¢\u0006\u0004\b#\u0010$J)\u0010&\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010%\u001a\u00020\u0012H\u0002¢\u0006\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010,R\u0014\u00100\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lgq/c;", "Lgq/g;", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "", "a", "()V", "Lvq/a;", "systemUiController", "Lqq/c;", "sdkFilesManager", "", Title.type, "description", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "customLoadingAsset", "navBarTitle", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lkotlin/Function0;", "onBack", "onCancel", "centerSelfieFilePath", "uploadScanningHintText", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "recoverableSubmitError", "onRetrySubmit", "b", "(Lvq/a;Lqq/c;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Lkotlin/jvm/functions/Function0;)V", "textPosition", "e", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lvq/a;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;)V", "Laq/i;", "Laq/i;", "binding", "Landroid/view/View;", "Landroid/view/View;", "currentLoadingAssetView", "getRoot", "()Landroid/view/View;", "root", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final i binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public View currentLoadingAssetView;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18367a;

        static {
            int[] iArr = new int[StyleElements.PositionType.values().length];
            try {
                iArr[StyleElements.PositionType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StyleElements.PositionType.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StyleElements.PositionType.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f18367a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.submittingScreen.BasicSelfieSubmittingViewController$bind$1$3", f = "BasicSelfieSubmittingViewController.kt", l = {}, m = "invokeSuspend")
    public static final class b extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f18368t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ i f18369u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ StepStyles.SelfieStepStyle f18370v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i iVar, StepStyles.SelfieStepStyle selfieStepStyle, nt.b<? super b> bVar) {
            super(2, bVar);
            this.f18369u = iVar;
            this.f18370v = selfieStepStyle;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new b(this.f18369u, this.f18370v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f18368t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            InputStream inputStreamOpenRawResource = this.f18369u.f3651h.getContext().getResources().openRawResource(t.f36266f);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "openRawResource(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, Charsets.UTF_8), 8192);
            try {
                String strH = n.h(bufferedReader);
                ut.c.a(bufferedReader, null);
                StepStyles.SelfieStepStyle selfieStepStyle = this.f18370v;
                Integer strokeColorValue = selfieStepStyle != null ? selfieStepStyle.getStrokeColorValue() : null;
                StepStyles.SelfieStepStyle selfieStepStyle2 = this.f18370v;
                Integer fillColorValue = selfieStepStyle2 != null ? selfieStepStyle2.getFillColorValue() : null;
                StepStyles.SelfieStepStyle selfieStepStyle3 = this.f18370v;
                this.f18369u.f3651h.z(jr.g.h(strH, strokeColorValue, fillColorValue, selfieStepStyle3 != null ? selfieStepStyle3.getBackgroundColorValue() : null, new String[]{"#01099C", "#02089C"}, new String[]{"#7378FD"}, new String[]{"#D3D5FF"}, new String[]{"#FFFFFF"}), "pi2_selfie_processing");
                return Unit.f22483a;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ut.c.a(bufferedReader, th2);
                    throw th3;
                }
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public c(@NotNull Context context, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(context, "context");
        i iVarC = i.c(LayoutInflater.from(context), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(iVarC, "inflate(...)");
        this.binding = iVarC;
    }

    public static final Unit f(Function0 function0) {
        function0.invoke();
        return Unit.f22483a;
    }

    public static final Unit g(Function0 function0) {
        function0.invoke();
        return Unit.f22483a;
    }

    @Override // gq.g
    public void a() {
        ConstraintLayout root = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        wq.g.d(root, false, false, false, false, 15, null);
    }

    @Override // gq.g
    public void b(@Nullable vq.a systemUiController, @NotNull qq.c sdkFilesManager, @NotNull String title, @NotNull String description, @NotNull PendingPageTextPosition pendingPageTextVerticalPosition, @Nullable RemoteImage customLoadingAsset, @Nullable String navBarTitle, @NotNull NavigationState navigationState, @Nullable StepStyles.SelfieStepStyle styles, @NotNull final Function0<Unit> onBack, @NotNull final Function0<Unit> onCancel, @Nullable String centerSelfieFilePath, @Nullable String uploadScanningHintText, @Nullable InternalErrorInfo recoverableSubmitError, @NotNull Function0<Unit> onRetrySubmit) {
        s sVarC;
        androidx.p000lifecycle.m mVarA;
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
        Intrinsics.checkNotNullParameter(navigationState, "navigationState");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        Intrinsics.checkNotNullParameter(onRetrySubmit, "onRetrySubmit");
        i iVar = this.binding;
        Function0 function0 = new Function0() { // from class: gq.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c.f(onBack);
            }
        };
        Function0 function1 = new Function0() { // from class: gq.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c.g(onCancel);
            }
        };
        Pi2NavigationBar navigationBar = iVar.f3650g;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ConstraintLayout root = iVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ir.c.e(navigationState, function0, function1, null, navigationBar, root, styles != null ? h.h(styles) : null, navBarTitle, styles != null ? styles.getNavBarTitleStyleValue() : null, 8, null);
        Context context = iVar.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer numF = z.f(context, vp.a.f33353n, null, false, 6, null);
        if (numF != null) {
            iVar.f3651h.setAnimation(numF.intValue());
            iVar.f3651h.w();
        } else {
            Context context2 = iVar.f3651h.getContext();
            if (context2 != null && (sVarC = jq.g.c(context2)) != null && (mVarA = androidx.p000lifecycle.t.a(sVarC)) != null) {
                k.d(mVarA, null, null, new b(iVar, styles, null), 3, null);
            }
        }
        if (StringsKt.p0(title)) {
            iVar.f3653j.setVisibility(8);
        } else {
            iVar.f3653j.setVisibility(0);
            iVar.f3653j.setText(title);
            TextView title2 = iVar.f3653j;
            Intrinsics.checkNotNullExpressionValue(title2, "title");
            wq.z.f(title2);
        }
        if (description.length() == 0) {
            iVar.f3646c.setVisibility(8);
        } else {
            iVar.f3646c.setText(description);
        }
        if (customLoadingAsset != null && this.currentLoadingAssetView == null) {
            ConstraintLayout animationContainer = iVar.b;
            Intrinsics.checkNotNullExpressionValue(animationContainer, "animationContainer");
            this.currentLoadingAssetView = lr.c.e(customLoadingAsset, animationContainer, true);
            iVar.f3651h.setVisibility(8);
        }
        if (styles != null) {
            e(styles, systemUiController, pendingPageTextVerticalPosition);
        }
    }

    public final void e(StepStyles.SelfieStepStyle styles, vq.a systemUiController, PendingPageTextPosition textPosition) {
        float f10;
        StepStyles.StepPaddingStyleContainer screen;
        StyleElements.SizeSet base;
        StyleElements.Size right;
        Double dp2;
        StepStyles.StepPaddingStyleContainer screen2;
        StyleElements.SizeSet base2;
        StyleElements.Size left;
        Double dp3;
        StyleElements.PositionType pendingPageAlignmentValue = styles.getPendingPageAlignmentValue();
        if (pendingPageAlignmentValue == null) {
            pendingPageAlignmentValue = textPosition == PendingPageTextPosition.TOP ? StyleElements.PositionType.START : StyleElements.PositionType.CENTER;
        }
        int[] iArr = textPosition == PendingPageTextPosition.TOP ? new int[]{this.binding.f3653j.getId(), this.binding.f3646c.getId(), this.binding.b.getId(), this.binding.f3647d.getId()} : new int[]{this.binding.b.getId(), this.binding.f3653j.getId(), this.binding.f3646c.getId(), this.binding.f3647d.getId()};
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.f(this.binding.f3648e);
        int i10 = a.f18367a[pendingPageAlignmentValue.ordinal()];
        if (i10 == 1) {
            f10 = 0.0f;
        } else if (i10 == 2) {
            f10 = 0.5f;
        } else {
            if (i10 != 3) {
                throw new l();
            }
            f10 = 1.0f;
        }
        cVar.q(0, 3, 0, 4, iArr, null, 2);
        cVar.F(kotlin.collections.m.K(iArr), f10);
        cVar.c(this.binding.f3648e);
        Integer backgroundColorValue = styles.getBackgroundColorValue();
        if (backgroundColorValue != null) {
            int iIntValue = backgroundColorValue.intValue();
            this.binding.getRoot().setBackgroundColor(iIntValue);
            if (systemUiController != null) {
                Context context = this.binding.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                systemUiController.a(context, iIntValue);
            }
        }
        Context context2 = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Drawable drawableA = lr.d.a(styles, context2);
        if (drawableA != null) {
            this.binding.getRoot().setBackground(drawableA);
        }
        TextBasedComponentStyle processingTitleStyleValue = styles.getProcessingTitleStyleValue();
        if (processingTitleStyleValue != null) {
            TextView title = this.binding.f3653j;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            h0.l(title, processingTitleStyleValue, null, 2, null);
        }
        TextBasedComponentStyle processingTextStyleValue = styles.getProcessingTextStyleValue();
        if (processingTextStyleValue != null) {
            TextView body = this.binding.f3646c;
            Intrinsics.checkNotNullExpressionValue(body, "body");
            h0.l(body, processingTextStyleValue, null, 2, null);
        }
        StepStyles.StepPaddingStyle padding = styles.getPadding();
        if (padding != null && (screen2 = padding.getScreen()) != null && (base2 = screen2.getBase()) != null && (left = base2.getLeft()) != null && (dp3 = left.getDp()) != null) {
            this.binding.f3652i.setGuidelineBegin((int) j.a(dp3.doubleValue()));
        }
        StepStyles.StepPaddingStyle padding2 = styles.getPadding();
        if (padding2 == null || (screen = padding2.getScreen()) == null || (base = screen.getBase()) == null || (right = base.getRight()) == null || (dp2 = right.getDp()) == null) {
            return;
        }
        this.binding.f3649f.setGuidelineEnd((int) j.a(dp2.doubleValue()));
    }

    @Override // gq.g
    @NotNull
    public View getRoot() {
        ConstraintLayout root = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }
}
