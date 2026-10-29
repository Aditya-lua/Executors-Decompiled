package p419rp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.p055ui.PersonaMaterialButton;
import er.C5199h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.C0371e;
import p016an.C0395x;
import p016an.InterfaceC0364a0;
import p016an.InterfaceC0365b;
import p016an.InterfaceC0382k;
import p016an.ViewEnvironment;
import p194ic.C6738b;
import p226jq.C7288z;
import p227jr.C7293c;
import p227jr.C7297e;
import p227jr.C7304h0;
import p340op.C9841g;
import p434sp.C11444c;
import p526wq.C12519b;
import p526wq.C12543z;
import p615zt.InterfaceC14057n;

/* JADX INFO: renamed from: rp.g0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001a\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001dR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#R \u0010*\u001a\b\u0012\u0004\u0012\u00020\u00000&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u001c\u0010)¨\u0006+"}, m31665d2 = {"Lrp/g0;", "Lan/b;", "", "titleText", "messageText", "positiveButtonText", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "Lkotlin/Function0;", "", "onPositiveButtonClick", "negativeButtonText", "onNegativeButtonClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "Lsp/c;", "binding", "l", "(Lsp/c;)V", "rendering", "Lan/y;", "viewEnvironment", "p", "(Lsp/c;Lrp/g0;Lan/y;)V", "", "isWrappingButtons", "k", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Lsp/c;Z)V", "a", "Ljava/lang/String;", "b", "c", "d", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "e", "Lkotlin/jvm/functions/Function0;", "f", "g", "Lan/a0;", "h", "Lan/a0;", "()Lan/a0;", "viewFactory", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11018g0 implements InterfaceC0365b<C11018g0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String titleText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String messageText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String positiveButtonText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final StepStyle styles;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Function0<Unit> onPositiveButtonClick;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final String negativeButtonText;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Function0<Unit> onNegativeButtonClick;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC0364a0<C11018g0> viewFactory;

    /* JADX INFO: renamed from: rp.g0$a */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m31665d2 = {"rp/g0$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior<FrameLayout> f38953a;

        public a(BottomSheetBehavior<FrameLayout> bottomSheetBehavior) {
            this.f38953a = bottomSheetBehavior;
        }

        /* JADX INFO: renamed from: b */
        public static final void m41698b(BottomSheetBehavior bottomSheetBehavior) {
            bottomSheetBehavior.m12125X0(3);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            final BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f38953a;
            view.postDelayed(new Runnable() { // from class: rp.f0
                @Override // java.lang.Runnable
                public final void run() {
                    C11018g0.a.m41698b(bottomSheetBehavior);
                }
            }, 100L);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
        }
    }

    /* JADX INFO: renamed from: rp.g0$b */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class b extends C7744k implements InterfaceC14057n<LayoutInflater, ViewGroup, Boolean, C11444c> {

        /* JADX INFO: renamed from: a */
        public static final b f38954a = new b();

        public b() {
            super(3, C11444c.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/permissions/databinding/Pi2RequestPermissionRationaleBinding;", 0);
        }

        /* JADX INFO: renamed from: d */
        public final C11444c m41699d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            return C11444c.m42861c(p8, viewGroup, z10);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p615zt.InterfaceC14057n
        public /* bridge */ /* synthetic */ C11444c invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return m41699d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    public C11018g0(@NotNull String titleText, @NotNull String messageText, @NotNull String positiveButtonText, @Nullable StepStyle stepStyle, @NotNull Function0<Unit> onPositiveButtonClick, @NotNull String negativeButtonText, @NotNull Function0<Unit> onNegativeButtonClick) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(messageText, "messageText");
        Intrinsics.checkNotNullParameter(positiveButtonText, "positiveButtonText");
        Intrinsics.checkNotNullParameter(onPositiveButtonClick, "onPositiveButtonClick");
        Intrinsics.checkNotNullParameter(negativeButtonText, "negativeButtonText");
        Intrinsics.checkNotNullParameter(onNegativeButtonClick, "onNegativeButtonClick");
        this.titleText = titleText;
        this.messageText = messageText;
        this.positiveButtonText = positiveButtonText;
        this.styles = stepStyle;
        this.onPositiveButtonClick = onPositiveButtonClick;
        this.negativeButtonText = negativeButtonText;
        this.onNegativeButtonClick = onNegativeButtonClick;
        InterfaceC0382k.Companion companion = InterfaceC0382k.INSTANCE;
        this.viewFactory = new C0395x(C7731d0.m32002b(C11018g0.class), b.f38954a, new Function1() { // from class: rp.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C11018g0.m41692u(this.f39060a, (C11444c) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m41685m(C11018g0 c11018g0) {
        c11018g0.onNegativeButtonClick.invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: n */
    public static final void m41686n(View view) {
    }

    /* JADX INFO: renamed from: o */
    public static final void m41687o(BottomSheetBehavior bottomSheetBehavior, View view) {
        bottomSheetBehavior.m12125X0(5);
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m41688q(C11444c c11444c, C11018g0 c11018g0) {
        boolean z10 = true;
        if (c11444c.f40454f.getLineCount() > 1 || c11444c.f40455g.getLineCount() > 1) {
            PersonaMaterialButton negativeButton = c11444c.f40454f;
            Intrinsics.checkNotNullExpressionValue(negativeButton, "negativeButton");
            ViewGroup.LayoutParams layoutParams = negativeButton.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = c11444c.f40452d.getWidth();
            negativeButton.setLayoutParams(layoutParams);
            PersonaMaterialButton positiveButton = c11444c.f40455g;
            Intrinsics.checkNotNullExpressionValue(positiveButton, "positiveButton");
            ViewGroup.LayoutParams layoutParams2 = positiveButton.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.width = c11444c.f40452d.getWidth();
            positiveButton.setLayoutParams(layoutParams2);
            c11444c.f40452d.setReferencedIds(new int[]{c11444c.f40455g.getId(), c11444c.f40454f.getId()});
        } else {
            z10 = false;
        }
        c11018g0.m41694k(c11018g0.styles, c11444c, z10);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: r */
    public static final void m41689r(C11018g0 c11018g0, View view) {
        c11018g0.onPositiveButtonClick.invoke();
    }

    /* JADX INFO: renamed from: s */
    public static final void m41690s(C11018g0 c11018g0, View view) {
        c11018g0.onNegativeButtonClick.invoke();
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m41691t(C11018g0 c11018g0) {
        c11018g0.onNegativeButtonClick.invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: u */
    public static final InterfaceC0382k m41692u(final C11018g0 c11018g0, final C11444c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c11018g0.m41695l(it);
        return new InterfaceC0382k() { // from class: rp.x
            @Override // p016an.InterfaceC0382k
            /* JADX INFO: renamed from: a */
            public final void mo1442a(Object obj, ViewEnvironment viewEnvironment) {
                C11018g0.m41693v(this.f39063b, it, (C11018g0) obj, viewEnvironment);
            }
        };
    }

    /* JADX INFO: renamed from: v */
    public static final void m41693v(C11018g0 c11018g0, C11444c c11444c, C11018g0 rendering, ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        Intrinsics.checkNotNull(c11444c);
        c11018g0.m41696p(c11444c, rendering, viewEnvironment);
    }

    @Override // p016an.InterfaceC0365b
    @NotNull
    /* JADX INFO: renamed from: a */
    public InterfaceC0364a0<C11018g0> mo1380a() {
        return this.viewFactory;
    }

    /* JADX INFO: renamed from: k */
    public final void m41694k(StepStyle styles, C11444c binding, boolean isWrappingButtons) {
        ButtonCancelComponentStyle buttonSecondaryStyleValue;
        ButtonSubmitComponentStyle buttonPrimaryStyleValue;
        TextBasedComponentStyle textStyleValue;
        TextBasedComponentStyle titleStyleValue;
        FrameLayout bottomSheet = binding.f40450b;
        Intrinsics.checkNotNullExpressionValue(bottomSheet, "bottomSheet");
        ConstraintLayout bottomSheetContent = binding.f40451c;
        Intrinsics.checkNotNullExpressionValue(bottomSheetContent, "bottomSheetContent");
        C7293c.m30334c(bottomSheet, styles, bottomSheetContent, null, false, 12, null);
        if (styles != null && (titleStyleValue = styles.getTitleStyleValue()) != null) {
            TextView title = binding.f40457i;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            C7304h0.m30392l(title, titleStyleValue, null, 2, null);
        }
        if (styles != null && (textStyleValue = styles.getTextStyleValue()) != null) {
            TextView message = binding.f40453e;
            Intrinsics.checkNotNullExpressionValue(message, "message");
            C7304h0.m30392l(message, textStyleValue, null, 2, null);
        }
        if (styles != null && (buttonPrimaryStyleValue = styles.getButtonPrimaryStyleValue()) != null) {
            PersonaMaterialButton positiveButton = binding.f40455g;
            Intrinsics.checkNotNullExpressionValue(positiveButton, "positiveButton");
            C7297e.m30364h(positiveButton, buttonPrimaryStyleValue, false, !isWrappingButtons, false, 10, null);
        }
        if (styles == null || (buttonSecondaryStyleValue = styles.getButtonSecondaryStyleValue()) == null) {
            return;
        }
        PersonaMaterialButton negativeButton = binding.f40454f;
        Intrinsics.checkNotNullExpressionValue(negativeButton, "negativeButton");
        C7297e.m30364h(negativeButton, buttonSecondaryStyleValue, false, !isWrappingButtons, false, 10, null);
    }

    /* JADX INFO: renamed from: l */
    public final void m41695l(C11444c binding) {
        int iM30328d;
        Integer backgroundColorValue;
        final BottomSheetBehavior bottomSheetBehaviorM12102q0 = BottomSheetBehavior.m12102q0(binding.f40450b);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorM12102q0, "from(...)");
        Function0 function0 = new Function0() { // from class: rp.c0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11018g0.m41685m(this.f38930a);
            }
        };
        FrameLayout bottomSheet = binding.f40450b;
        Intrinsics.checkNotNullExpressionValue(bottomSheet, "bottomSheet");
        C12519b.m46866b(bottomSheetBehaviorM12102q0, function0, bottomSheet, null, binding.f40456h);
        binding.getRoot().addOnAttachStateChangeListener(new a(bottomSheetBehaviorM12102q0));
        binding.f40450b.setOnClickListener(new View.OnClickListener() { // from class: rp.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C11018g0.m41686n(view);
            }
        });
        binding.f40456h.setOnClickListener(new View.OnClickListener() { // from class: rp.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C11018g0.m41687o(bottomSheetBehaviorM12102q0, view);
            }
        });
        StepStyle stepStyle = this.styles;
        if (stepStyle == null || (backgroundColorValue = stepStyle.getBackgroundColorValue()) == null) {
            Context context = binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iM30328d = C7288z.m30328d(context, C6738b.f25908o, null, false, 6, null);
        } else {
            iM30328d = backgroundColorValue.intValue();
        }
        binding.getRoot().setTag(C9841g.f35675a, Integer.valueOf(iM30328d));
    }

    /* JADX INFO: renamed from: p */
    public final void m41696p(final C11444c binding, final C11018g0 rendering, ViewEnvironment viewEnvironment) {
        if (this.titleText.length() > 0) {
            TextView title = binding.f40457i;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            C5199h.m24129e(title, this.titleText);
        } else {
            binding.f40457i.setVisibility(8);
        }
        TextView message = binding.f40453e;
        Intrinsics.checkNotNullExpressionValue(message, "message");
        C5199h.m24129e(message, this.messageText);
        binding.f40455g.setText(rendering.positiveButtonText);
        binding.f40455g.setOnClickListener(new View.OnClickListener() { // from class: rp.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C11018g0.m41689r(this.f39067a, view);
            }
        });
        binding.f40454f.setText(rendering.negativeButtonText);
        binding.f40454f.setOnClickListener(new View.OnClickListener() { // from class: rp.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C11018g0.m41690s(this.f39071a, view);
            }
        });
        FrameLayout bottomSheet = binding.f40450b;
        Intrinsics.checkNotNullExpressionValue(bottomSheet, "bottomSheet");
        C0371e.m1407c(bottomSheet, new Function0() { // from class: rp.a0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11018g0.m41691t(this.f38918a);
            }
        });
        PersonaMaterialButton negativeButton = binding.f40454f;
        Intrinsics.checkNotNullExpressionValue(negativeButton, "negativeButton");
        C12543z.m46890b(negativeButton, new Function0() { // from class: rp.b0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C11018g0.m41688q(binding, this);
            }
        });
    }
}
