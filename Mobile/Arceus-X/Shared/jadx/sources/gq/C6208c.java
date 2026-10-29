package gq;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0518c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.p616lifecycle.AbstractC0968m;
import androidx.p616lifecycle.C0982t;
import androidx.p616lifecycle.InterfaceC0980s;
import aq.C1145i;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.p055ui.Pi2NavigationBar;
import er.C5199h;
import ir.C6966c;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7693m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import lr.C8243c;
import lr.C8244d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p226jq.C7259g;
import p226jq.C7265j;
import p226jq.C7288z;
import p227jr.C7301g;
import p227jr.C7304h0;
import p229jt.C7345l;
import p229jt.C7348o;
import p256ku.C7882k;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p391qq.C10700c;
import p477ut.C11958c;
import p477ut.C11969n;
import p497vp.C12238a;
import p498vq.C12247a;
import p526wq.C12524g;
import p526wq.C12543z;
import p584yp.C13400t;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: gq.c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ§\u0001\u0010#\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000f2\b\u0010!\u001a\u0004\u0018\u00010 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u001bH\u0016¢\u0006\u0004\b#\u0010$J)\u0010&\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010%\u001a\u00020\u0012H\u0002¢\u0006\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010,R\u0014\u00100\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, m31665d2 = {"Lgq/c;", "Lgq/g;", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "", "a", "()V", "Lvq/a;", "systemUiController", "Lqq/c;", "sdkFilesManager", "", Title.type, "description", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "customLoadingAsset", "navBarTitle", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lkotlin/Function0;", "onBack", "onCancel", "centerSelfieFilePath", "uploadScanningHintText", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "recoverableSubmitError", "onRetrySubmit", "b", "(Lvq/a;Lqq/c;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Lkotlin/jvm/functions/Function0;)V", "textPosition", "e", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lvq/a;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;)V", "Laq/i;", "Laq/i;", "binding", "Landroid/view/View;", "Landroid/view/View;", "currentLoadingAssetView", "getRoot", "()Landroid/view/View;", "root", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6208c implements InterfaceC6212g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C1145i binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public View currentLoadingAssetView;

    /* JADX INFO: renamed from: gq.c$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f23625a;

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
            f23625a = iArr;
        }
    }

    /* JADX INFO: renamed from: gq.c$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.submittingScreen.BasicSelfieSubmittingViewController$bind$1$3", m39664f = "BasicSelfieSubmittingViewController.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f23626t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ C1145i f23627u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ StepStyles.SelfieStepStyle f23628v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C1145i c1145i, StepStyles.SelfieStepStyle selfieStepStyle, InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f23627u = c1145i;
            this.f23628v = selfieStepStyle;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new b(this.f23627u, this.f23628v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f23626t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            InputStream inputStreamOpenRawResource = this.f23627u.f4760h.getContext().getResources().openRawResource(C13400t.f46978f);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "openRawResource(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, Charsets.UTF_8), 8192);
            try {
                String strM44671h = C11969n.m44671h(bufferedReader);
                C11958c.m44629a(bufferedReader, null);
                StepStyles.SelfieStepStyle selfieStepStyle = this.f23628v;
                Integer strokeColorValue = selfieStepStyle != null ? selfieStepStyle.getStrokeColorValue() : null;
                StepStyles.SelfieStepStyle selfieStepStyle2 = this.f23628v;
                Integer fillColorValue = selfieStepStyle2 != null ? selfieStepStyle2.getFillColorValue() : null;
                StepStyles.SelfieStepStyle selfieStepStyle3 = this.f23628v;
                this.f23627u.f4760h.m8438z(C7301g.m30375h(strM44671h, strokeColorValue, fillColorValue, selfieStepStyle3 != null ? selfieStepStyle3.getBackgroundColorValue() : null, new String[]{"#01099C", "#02089C"}, new String[]{"#7378FD"}, new String[]{"#D3D5FF"}, new String[]{"#FFFFFF"}), "pi2_selfie_processing");
                return Unit.f29331a;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    C11958c.m44629a(bufferedReader, th2);
                    throw th3;
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C6208c(@NotNull Context context, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(context, "context");
        C1145i c1145iM6486c = C1145i.m6486c(LayoutInflater.from(context), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c1145iM6486c, "inflate(...)");
        this.binding = c1145iM6486c;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m27329f(Function0 function0) {
        function0.invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m27330g(Function0 function0) {
        function0.invoke();
        return Unit.f29331a;
    }

    @Override // gq.InterfaceC6212g
    /* JADX INFO: renamed from: a */
    public void mo27331a() {
        ConstraintLayout root = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        C12524g.m46873d(root, false, false, false, false, 15, null);
    }

    @Override // gq.InterfaceC6212g
    /* JADX INFO: renamed from: b */
    public void mo27332b(@Nullable C12247a systemUiController, @NotNull C10700c sdkFilesManager, @NotNull String title, @NotNull String description, @NotNull PendingPageTextPosition pendingPageTextVerticalPosition, @Nullable RemoteImage customLoadingAsset, @Nullable String navBarTitle, @NotNull NavigationState navigationState, @Nullable StepStyles.SelfieStepStyle styles, @NotNull final Function0<Unit> onBack, @NotNull final Function0<Unit> onCancel, @Nullable String centerSelfieFilePath, @Nullable String uploadScanningHintText, @Nullable InternalErrorInfo recoverableSubmitError, @NotNull Function0<Unit> onRetrySubmit) {
        InterfaceC0980s interfaceC0980sM30269c;
        AbstractC0968m abstractC0968mM4979a;
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
        Intrinsics.checkNotNullParameter(navigationState, "navigationState");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        Intrinsics.checkNotNullParameter(onRetrySubmit, "onRetrySubmit");
        C1145i c1145i = this.binding;
        Function0 function0 = new Function0() { // from class: gq.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C6208c.m27329f(onBack);
            }
        };
        Function0 function1 = new Function0() { // from class: gq.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C6208c.m27330g(onCancel);
            }
        };
        Pi2NavigationBar navigationBar = c1145i.f4759g;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ConstraintLayout root = c1145i.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        C6966c.m29335e(navigationState, function0, function1, null, navigationBar, root, styles != null ? C5199h.m24132h(styles) : null, navBarTitle, styles != null ? styles.getNavBarTitleStyleValue() : null, 8, null);
        Context context = c1145i.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer numM30330f = C7288z.m30330f(context, C12238a.f43181n, null, false, 6, null);
        if (numM30330f != null) {
            c1145i.f4760h.setAnimation(numM30330f.intValue());
            c1145i.f4760h.m8435w();
        } else {
            Context context2 = c1145i.f4760h.getContext();
            if (context2 != null && (interfaceC0980sM30269c = C7259g.m30269c(context2)) != null && (abstractC0968mM4979a = C0982t.m4979a(interfaceC0980sM30269c)) != null) {
                C7882k.m32780d(abstractC0968mM4979a, null, null, new b(c1145i, styles, null), 3, null);
            }
        }
        if (StringsKt.m32182p0(title)) {
            c1145i.f4762j.setVisibility(8);
        } else {
            c1145i.f4762j.setVisibility(0);
            c1145i.f4762j.setText(title);
            TextView title2 = c1145i.f4762j;
            Intrinsics.checkNotNullExpressionValue(title2, "title");
            C12543z.m46894f(title2);
        }
        if (description.length() == 0) {
            c1145i.f4755c.setVisibility(8);
        } else {
            c1145i.f4755c.setText(description);
        }
        if (customLoadingAsset != null && this.currentLoadingAssetView == null) {
            ConstraintLayout animationContainer = c1145i.f4754b;
            Intrinsics.checkNotNullExpressionValue(animationContainer, "animationContainer");
            this.currentLoadingAssetView = C8243c.m33617e(customLoadingAsset, animationContainer, true);
            c1145i.f4760h.setVisibility(8);
        }
        if (styles != null) {
            m27333e(styles, systemUiController, pendingPageTextVerticalPosition);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m27333e(StepStyles.SelfieStepStyle styles, C12247a systemUiController, PendingPageTextPosition textPosition) {
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
        int[] iArr = textPosition == PendingPageTextPosition.TOP ? new int[]{this.binding.f4762j.getId(), this.binding.f4755c.getId(), this.binding.f4754b.getId(), this.binding.f4756d.getId()} : new int[]{this.binding.f4754b.getId(), this.binding.f4762j.getId(), this.binding.f4755c.getId(), this.binding.f4756d.getId()};
        C0518c c0518c = new C0518c();
        c0518c.m2509f(this.binding.f4757e);
        int i10 = a.f23625a[pendingPageAlignmentValue.ordinal()];
        if (i10 == 1) {
            f10 = 0.0f;
        } else if (i10 == 2) {
            f10 = 0.5f;
        } else {
            if (i10 != 3) {
                throw new C7345l();
            }
            f10 = 1.0f;
        }
        c0518c.m2520q(0, 3, 0, 4, iArr, null, 2);
        c0518c.m2503F(C7693m.m31842K(iArr), f10);
        c0518c.m2506c(this.binding.f4757e);
        Integer backgroundColorValue = styles.getBackgroundColorValue();
        if (backgroundColorValue != null) {
            int iIntValue = backgroundColorValue.intValue();
            this.binding.getRoot().setBackgroundColor(iIntValue);
            if (systemUiController != null) {
                Context context = this.binding.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                systemUiController.m45389a(context, iIntValue);
            }
        }
        Context context2 = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Drawable drawableM33622a = C8244d.m33622a(styles, context2);
        if (drawableM33622a != null) {
            this.binding.getRoot().setBackground(drawableM33622a);
        }
        TextBasedComponentStyle processingTitleStyleValue = styles.getProcessingTitleStyleValue();
        if (processingTitleStyleValue != null) {
            TextView title = this.binding.f4762j;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            C7304h0.m30392l(title, processingTitleStyleValue, null, 2, null);
        }
        TextBasedComponentStyle processingTextStyleValue = styles.getProcessingTextStyleValue();
        if (processingTextStyleValue != null) {
            TextView body = this.binding.f4755c;
            Intrinsics.checkNotNullExpressionValue(body, "body");
            C7304h0.m30392l(body, processingTextStyleValue, null, 2, null);
        }
        StepStyles.StepPaddingStyle padding = styles.getPadding();
        if (padding != null && (screen2 = padding.getScreen()) != null && (base2 = screen2.getBase()) != null && (left = base2.getLeft()) != null && (dp3 = left.getDp()) != null) {
            this.binding.f4761i.setGuidelineBegin((int) C7265j.m30285a(dp3.doubleValue()));
        }
        StepStyles.StepPaddingStyle padding2 = styles.getPadding();
        if (padding2 == null || (screen = padding2.getScreen()) == null || (base = screen.getBase()) == null || (right = base.getRight()) == null || (dp2 = right.getDp()) == null) {
            return;
        }
        this.binding.f4758f.setGuidelineEnd((int) C7265j.m30285a(dp2.doubleValue()));
    }

    @Override // gq.InterfaceC6212g
    @NotNull
    public View getRoot() {
        ConstraintLayout root = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }
}
