package p133fp;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.p616lifecycle.InterfaceC0980s;
import com.airbnb.lottie.LottieAnimationView;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lr.C8244d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p032bp.C1485g;
import p088e.AbstractC4717m0;
import p088e.C4723p0;
import p121f7.InterfaceC5465o0;
import p177hp.C6524u0;
import p181i.C6589a;
import p194ic.C6738b;
import p226jq.C7288z;
import p266l7.C8006e;
import p341oq.AbstractC9842a;
import p444t7.C11551b;
import p444t7.InterfaceC11554e;
import p497vp.C12238a;
import p498vq.C12247a;
import p610zo.AbstractC13988y;
import p610zo.C13961g0;
import p615zt.InterfaceC14057n;

/* JADX INFO: renamed from: fp.f */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000[\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r*\u0001\u001c\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0017\u001a\u00020\u0011*\u00020\u00102\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\t2\b\b\u0001\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0016\u00104\u001a\u0004\u0018\u00010\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00067"}, m31665d2 = {"Lfp/f;", "Loq/a;", "Lbp/g;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lhp/u0;", "model", "s2", "(Lhp/u0;)V", "Landroid/content/Context;", "", "attrColor", "Landroid/util/TypedValue;", "typedValue", "", "resolveRefs", "m2", "(Landroid/content/Context;ILandroid/util/TypedValue;Z)I", "animationResId", "w2", "(I)V", "fp/f$c", "j0", "Lfp/f$c;", "onBackPressedCallback", "Lkotlin/Function0;", "k0", "Lkotlin/jvm/functions/Function0;", "onBackPressHandler", "l0", "Ljava/lang/Integer;", "currentAnimationRes", "m0", "Lhp/u0;", "currentModel", "Lvq/a;", "n0", "Lvq/a;", "p2", "()Lvq/a;", "setSystemUiController", "(Lvq/a;)V", "systemUiController", "o2", "()Ljava/lang/Integer;", "customAnimation", "o0", "b", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C5726f extends AbstractC9842a<C1485g> {

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    @NotNull
    public final c onBackPressedCallback;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    @Nullable
    public Function0<Unit> onBackPressHandler;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    @Nullable
    public Integer currentAnimationRes;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    @Nullable
    public C6524u0 currentModel;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public C12247a systemUiController;

    /* JADX INFO: renamed from: fp.f$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a extends C7744k implements InterfaceC14057n<LayoutInflater, ViewGroup, Boolean, C1485g> {

        /* JADX INFO: renamed from: a */
        public static final a f21995a = new a();

        public a() {
            super(3, C1485g.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/internal/databinding/Pi2InquiryInitializingBinding;", 0);
        }

        /* JADX INFO: renamed from: d */
        public final C1485g m25920d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            return C1485g.m7608c(p8, viewGroup, z10);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p615zt.InterfaceC14057n
        public /* bridge */ /* synthetic */ C1485g invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return m25920d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: fp.f$b, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"Lfp/f$b;", "", "<init>", "()V", "Lfp/f;", "a", "()Lfp/f;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: fp.f.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C5726f m25921a() {
            return new C5726f();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: fp.f$c */
    @Metadata(m31664d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31665d2 = {"fp/f$c", "Le/m0;", "", "handleOnBackPressed", "()V", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class c extends AbstractC4717m0 {
        public c() {
            super(false);
        }

        @Override // p088e.AbstractC4717m0
        public void handleOnBackPressed() {
            Function0 function0 = C5726f.this.onBackPressHandler;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public C5726f() {
        super(a.f21995a);
        this.onBackPressedCallback = new c();
    }

    /* JADX INFO: renamed from: n2 */
    public static /* synthetic */ int m25909n2(C5726f c5726f, Context context, int i10, TypedValue typedValue, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            typedValue = new TypedValue();
        }
        if ((i11 & 4) != 0) {
            z10 = true;
        }
        return c5726f.m25915m2(context, i10, typedValue, z10);
    }

    /* JADX INFO: renamed from: q2 */
    public static final Integer m25910q2(C5726f c5726f, View view, C11551b c11551b) {
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return Integer.valueOf(m25909n2(c5726f, context, C6738b.f25906m, null, false, 6, null));
    }

    /* JADX INFO: renamed from: r2 */
    public static final Integer m25911r2(C5726f c5726f, View view, C11551b c11551b) {
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return Integer.valueOf(m25909n2(c5726f, context, C6589a.f25047z, null, false, 6, null));
    }

    /* JADX INFO: renamed from: t2 */
    public static final Integer m25912t2(int i10, C11551b c11551b) {
        return Integer.valueOf(i10);
    }

    /* JADX INFO: renamed from: u2 */
    public static final Integer m25913u2(int i10, C11551b c11551b) {
        return Integer.valueOf(i10);
    }

    /* JADX INFO: renamed from: v2 */
    public static final Unit m25914v2(AbstractC13988y.a aVar) {
        aVar.m50568a().invoke();
        return Unit.f29331a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: e1 */
    public void mo4667e1(@NotNull final View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.mo4667e1(view, savedInstanceState);
        Integer numM25916o2 = m25916o2();
        LottieAnimationView animationviewInquiryInitializingspinner = ((C1485g) m32421b2()).f5765b;
        Intrinsics.checkNotNullExpressionValue(animationviewInquiryInitializingspinner, "animationviewInquiryInitializingspinner");
        if (numM25916o2 != null) {
            m25919w2(numM25916o2.intValue());
            animationviewInquiryInitializingspinner.m8436x();
        } else {
            animationviewInquiryInitializingspinner.m8424l(new C8006e("**"), InterfaceC5465o0.f21162b, new InterfaceC11554e() { // from class: fp.a
                @Override // p444t7.InterfaceC11554e
                /* JADX INFO: renamed from: a */
                public final Object mo25902a(C11551b c11551b) {
                    return C5726f.m25910q2(this.f21982a, view, c11551b);
                }
            });
            animationviewInquiryInitializingspinner.m8424l(new C8006e("**"), InterfaceC5465o0.f21161a, new InterfaceC11554e() { // from class: fp.b
                @Override // p444t7.InterfaceC11554e
                /* JADX INFO: renamed from: a */
                public final Object mo25902a(C11551b c11551b) {
                    return C5726f.m25911r2(this.f21984a, view, c11551b);
                }
            });
        }
        C4723p0 c4723p0Mo23043Q = m4606H1().mo23043Q();
        InterfaceC0980s interfaceC0980sM4680k0 = m4680k0();
        Intrinsics.checkNotNullExpressionValue(interfaceC0980sM4680k0, "getViewLifecycleOwner(...)");
        c4723p0Mo23043Q.m23077d(interfaceC0980sM4680k0, this.onBackPressedCallback);
        C6524u0 c6524u0 = this.currentModel;
        if (c6524u0 != null) {
            m25918s2(c6524u0);
        }
    }

    /* JADX INFO: renamed from: m2 */
    public final int m25915m2(Context context, int i10, TypedValue typedValue, boolean z10) {
        context.getTheme().resolveAttribute(i10, typedValue, z10);
        return typedValue.data;
    }

    /* JADX INFO: renamed from: o2 */
    public final Integer m25916o2() {
        Context contextMo4715x = mo4715x();
        if (contextMo4715x != null) {
            return C7288z.m30330f(contextMo4715x, C12238a.f43181n, null, false, 6, null);
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p2 */
    public final C12247a m25917p2() {
        C12247a c12247a = this.systemUiController;
        if (c12247a != null) {
            return c12247a;
        }
        Intrinsics.m31998u("systemUiController");
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v14, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v17, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s2 */
    public final void m25918s2(@NotNull C6524u0 model) {
        C5726f c5726f;
        int iM25909n2;
        Integer backgroundColorValue;
        Intrinsics.checkNotNullParameter(model, "model");
        this.currentModel = model;
        if (m32423d2()) {
            ConstraintLayout root = ((C1485g) m32421b2()).getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            final AbstractC13988y.a inquiryLoadingScreen = model.getInquiryLoadingScreen();
            Integer numM25916o2 = m25916o2();
            if (inquiryLoadingScreen.getUseBasicSpinner() && numM25916o2 == null) {
                m25919w2(C13961g0.f48774a);
                ((C1485g) m32421b2()).f5765b.setScaleX(0.5f);
                ((C1485g) m32421b2()).f5765b.setScaleY(0.5f);
            }
            if (inquiryLoadingScreen.getUseBasicSpinner()) {
                Context context = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Integer numM30330f = C7288z.m30330f(context, C12238a.f43180m, null, false, 6, null);
                if (numM30330f != null) {
                    root.setBackgroundResource(numM30330f.intValue());
                }
            }
            StepStyle styles = inquiryLoadingScreen.getStyles();
            if (styles == null || (backgroundColorValue = styles.getBackgroundColorValue()) == null) {
                Context context2 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                c5726f = this;
                iM25909n2 = m25909n2(c5726f, context2, R.attr.colorBackground, null, false, 6, null);
            } else {
                iM25909n2 = backgroundColorValue.intValue();
                c5726f = this;
            }
            C12247a c12247aM25917p2 = m25917p2();
            Context context3 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            c12247aM25917p2.m45389a(context3, iM25909n2);
            StepStyle styles2 = inquiryLoadingScreen.getStyles();
            if (styles2 != null) {
                Integer backgroundColorValue2 = styles2.getBackgroundColorValue();
                if (backgroundColorValue2 != null) {
                    root.setBackgroundColor(backgroundColorValue2.intValue());
                }
                Context context4 = root.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                Drawable drawableM33622a = C8244d.m33622a(styles2, context4);
                if (drawableM33622a != null) {
                    root.setBackground(drawableM33622a);
                }
                if (numM25916o2 == null) {
                    Integer fillColorValue = styles2.getFillColorValue();
                    if (fillColorValue != null) {
                        final int iIntValue = fillColorValue.intValue();
                        ((C1485g) m32421b2()).f5765b.m8424l(new C8006e("**"), InterfaceC5465o0.f21161a, new InterfaceC11554e() { // from class: fp.c
                            @Override // p444t7.InterfaceC11554e
                            /* JADX INFO: renamed from: a */
                            public final Object mo25902a(C11551b c11551b) {
                                return C5726f.m25913u2(iIntValue, c11551b);
                            }
                        });
                    }
                    Integer strokeColorValue = styles2.getStrokeColorValue();
                    if (strokeColorValue != null) {
                        final int iIntValue2 = strokeColorValue.intValue();
                        ((C1485g) m32421b2()).f5765b.m8424l(new C8006e("**"), InterfaceC5465o0.f21162b, new InterfaceC11554e() { // from class: fp.d
                            @Override // p444t7.InterfaceC11554e
                            /* JADX INFO: renamed from: a */
                            public final Object mo25902a(C11551b c11551b) {
                                return C5726f.m25912t2(iIntValue2, c11551b);
                            }
                        });
                    }
                }
            }
            c5726f.onBackPressedCallback.setEnabled(true);
            c5726f.onBackPressHandler = new Function0() { // from class: fp.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C5726f.m25914v2(inquiryLoadingScreen);
                }
            };
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w2 */
    public final void m25919w2(int animationResId) {
        Integer num = this.currentAnimationRes;
        if (num != null && num.intValue() == animationResId) {
            return;
        }
        this.currentAnimationRes = Integer.valueOf(animationResId);
        LottieAnimationView lottieAnimationView = ((C1485g) m32421b2()).f5765b;
        lottieAnimationView.m8425m();
        lottieAnimationView.setMinFrame(0);
        lottieAnimationView.setAnimation(animationResId);
        lottieAnimationView.m8434v();
    }
}
