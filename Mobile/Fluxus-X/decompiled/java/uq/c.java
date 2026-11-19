package uq;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.p000lifecycle.s;
import androidx.p000lifecycle.t;
import av.k;
import av.p0;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import gu.m;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kr.a0;
import lu.n;
import mq.z;
import oq.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.Charsets;
import p001kotlin.text.StringsKt;
import sr.h;
import xq.j;
import yr.h0;
import zt.l;
import zt.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ§\u0001\u0010#\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000f2\b\u0010!\u001a\u0004\u0018\u00010 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u001bH\u0016¢\u0006\u0004\b#\u0010$J)\u0010&\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010%\u001a\u00020\u0012H\u0002¢\u0006\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010,R\u0014\u00100\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Luq/c;", "Luq/g;", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", BuildConfig.FLAVOR, "a", "()V", "Ljr/a;", "systemUiController", "Ler/c;", "sdkFilesManager", BuildConfig.FLAVOR, Title.type, "description", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "customLoadingAsset", "navBarTitle", "Lir/a;", "navigationState", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lkotlin/Function0;", "onBack", "onCancel", "centerSelfieFilePath", "uploadScanningHintText", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "recoverableSubmitError", "onRetrySubmit", "b", "(Ljr/a;Ler/c;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Ljava/lang/String;Lir/a;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Lkotlin/jvm/functions/Function0;)V", "textPosition", "e", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Ljr/a;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;)V", "Loq/i;", "Loq/i;", "binding", "Landroid/view/View;", "Landroid/view/View;", "currentLoadingAssetView", "getRoot", "()Landroid/view/View;", "root", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        public static final /* synthetic */ int[] f33836a;

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
            f33836a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.submittingScreen.BasicSelfieSubmittingViewController$bind$1$3", f = "BasicSelfieSubmittingViewController.kt", l = {}, m = "invokeSuspend")
    public static final class b extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f33837t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ i f33838u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ StepStyles.SelfieStepStyle f33839v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i iVar, StepStyles.SelfieStepStyle selfieStepStyle, eu.b<? super b> bVar) {
            super(2, bVar);
            this.f33838u = iVar;
            this.f33839v = selfieStepStyle;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new b(this.f33838u, this.f33839v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f33837t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            InputStream inputStreamOpenRawResource = this.f33838u.f28402h.getContext().getResources().openRawResource(z.f24349f);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "openRawResource(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, Charsets.UTF_8), 8192);
            try {
                String strH = n.h(bufferedReader);
                lu.c.a(bufferedReader, null);
                StepStyles.SelfieStepStyle selfieStepStyle = this.f33839v;
                Integer strokeColorValue = selfieStepStyle != null ? selfieStepStyle.getStrokeColorValue() : null;
                StepStyles.SelfieStepStyle selfieStepStyle2 = this.f33839v;
                Integer fillColorValue = selfieStepStyle2 != null ? selfieStepStyle2.getFillColorValue() : null;
                StepStyles.SelfieStepStyle selfieStepStyle3 = this.f33839v;
                this.f33838u.f28402h.z(yr.g.h(strH, strokeColorValue, fillColorValue, selfieStepStyle3 != null ? selfieStepStyle3.getBackgroundColorValue() : null, new String[]{"#01099C", "#02089C"}, new String[]{"#7378FD"}, new String[]{"#D3D5FF"}, new String[]{"#FFFFFF"}), "pi2_selfie_processing");
                return Unit.f21506a;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    lu.c.a(bufferedReader, th2);
                    throw th3;
                }
            }
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
        return Unit.f21506a;
    }

    public static final Unit g(Function0 function0) {
        function0.invoke();
        return Unit.f21506a;
    }

    @Override // uq.g
    public void a() {
        ConstraintLayout root = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        kr.g.d(root, false, false, false, false, 15, null);
    }

    @Override // uq.g
    public void b(@Nullable jr.a systemUiController, @NotNull er.c sdkFilesManager, @NotNull String title, @NotNull String description, @NotNull PendingPageTextPosition pendingPageTextVerticalPosition, @Nullable RemoteImage customLoadingAsset, @Nullable String navBarTitle, @NotNull ir.a navigationState, @Nullable StepStyles.SelfieStepStyle styles, @NotNull final Function0<Unit> onBack, @NotNull final Function0<Unit> onCancel, @Nullable String centerSelfieFilePath, @Nullable String uploadScanningHintText, @Nullable InternalErrorInfo recoverableSubmitError, @NotNull Function0<Unit> onRetrySubmit) {
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
        Function0 function0 = new Function0() { // from class: uq.a
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c.f(onBack);
            }
        };
        Function0 function1 = new Function0() { // from class: uq.b
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c.g(onCancel);
            }
        };
        Pi2NavigationBar navigationBar = iVar.f28401g;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ConstraintLayout root = iVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        xr.c.e(navigationState, function0, function1, null, navigationBar, root, styles != null ? h.h(styles) : null, navBarTitle, styles != null ? styles.getNavBarTitleStyleValue() : null, 8, null);
        Context context = iVar.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer numF = xq.z.f(context, jq.a.f20838n, null, false, 6, null);
        if (numF != null) {
            iVar.f28402h.setAnimation(numF.intValue());
            iVar.f28402h.w();
        } else {
            Context context2 = iVar.f28402h.getContext();
            if (context2 != null && (sVarC = xq.g.c(context2)) != null && (mVarA = t.a(sVarC)) != null) {
                k.d(mVarA, null, null, new b(iVar, styles, null), 3, null);
            }
        }
        if (StringsKt.p0(title)) {
            iVar.f28404j.setVisibility(8);
        } else {
            iVar.f28404j.setVisibility(0);
            iVar.f28404j.setText(title);
            TextView title2 = iVar.f28404j;
            Intrinsics.checkNotNullExpressionValue(title2, "title");
            a0.f(title2);
        }
        if (description.length() == 0) {
            iVar.f28397c.setVisibility(8);
        } else {
            iVar.f28397c.setText(description);
        }
        if (customLoadingAsset != null && this.currentLoadingAssetView == null) {
            ConstraintLayout animationContainer = iVar.b;
            Intrinsics.checkNotNullExpressionValue(animationContainer, "animationContainer");
            this.currentLoadingAssetView = as.c.e(customLoadingAsset, animationContainer, true);
            iVar.f28402h.setVisibility(8);
        }
        if (styles != null) {
            e(styles, systemUiController, pendingPageTextVerticalPosition);
        }
    }

    public final void e(StepStyles.SelfieStepStyle styles, jr.a systemUiController, PendingPageTextPosition textPosition) {
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
        int[] iArr = textPosition == PendingPageTextPosition.TOP ? new int[]{this.binding.f28404j.getId(), this.binding.f28397c.getId(), this.binding.b.getId(), this.binding.f28398d.getId()} : new int[]{this.binding.b.getId(), this.binding.f28404j.getId(), this.binding.f28397c.getId(), this.binding.f28398d.getId()};
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.f(this.binding.f28399e);
        int i10 = a.f33836a[pendingPageAlignmentValue.ordinal()];
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
        cVar.F(p001kotlin.collections.m.K(iArr), f10);
        cVar.c(this.binding.f28399e);
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
        Drawable drawableA = as.d.a(styles, context2);
        if (drawableA != null) {
            this.binding.getRoot().setBackground(drawableA);
        }
        TextBasedComponentStyle processingTitleStyleValue = styles.getProcessingTitleStyleValue();
        if (processingTitleStyleValue != null) {
            TextView title = this.binding.f28404j;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            h0.l(title, processingTitleStyleValue, null, 2, null);
        }
        TextBasedComponentStyle processingTextStyleValue = styles.getProcessingTextStyleValue();
        if (processingTextStyleValue != null) {
            TextView body = this.binding.f28397c;
            Intrinsics.checkNotNullExpressionValue(body, "body");
            h0.l(body, processingTextStyleValue, null, 2, null);
        }
        StepStyles.StepPaddingStyle padding = styles.getPadding();
        if (padding != null && (screen2 = padding.getScreen()) != null && (base2 = screen2.getBase()) != null && (left = base2.getLeft()) != null && (dp3 = left.getDp()) != null) {
            this.binding.f28403i.setGuidelineBegin((int) j.a(dp3.doubleValue()));
        }
        StepStyles.StepPaddingStyle padding2 = styles.getPadding();
        if (padding2 == null || (screen = padding2.getScreen()) == null || (base = screen.getBase()) == null || (right = base.getRight()) == null || (dp2 = right.getDp()) == null) {
            return;
        }
        this.binding.f28400f.setGuidelineEnd((int) j.a(dp2.doubleValue()));
    }

    @Override // uq.g
    @NotNull
    public View getRoot() {
        ConstraintLayout root = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }
}
