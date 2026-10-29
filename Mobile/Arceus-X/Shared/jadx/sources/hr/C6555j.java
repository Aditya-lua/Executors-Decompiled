package hr;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.graphics.C0546c;
import androidx.core.graphics.Insets;
import androidx.core.view.C0625o0;
import androidx.core.view.WindowInsetsCompat;
import androidx.p616lifecycle.C0982t;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.InputSelectBoxComponentStyle;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.Option;
import cr.InterfaceC4337w1;
import gr.C6213a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7697o;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7729c0;
import kotlin.jvm.internal.C7758y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p203j.ActivityC6992b;
import p226jq.C7259g;
import p227jr.C7304h0;
import p229jt.C7342i;
import p229jt.C7347n;
import p229jt.C7348o;
import p229jt.InterfaceC7341h;
import p256ku.AbstractC7900n2;
import p256ku.C7864g1;
import p256ku.C7882k;
import p256ku.C7905p;
import p256ku.C7946z0;
import p256ku.C7948z2;
import p256ku.InterfaceC7833a0;
import p256ku.InterfaceC7850d2;
import p256ku.InterfaceC7897n;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10046b;
import p344ot.C10047c;
import p526wq.C12519b;
import p526wq.C12524g;
import pt.AbstractC10351m;
import pt.C10346h;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: hr.j */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001f\u0010#\u001a\r\u0012\t\u0012\u00070\u001f¢\u0006\u0002\b 0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010*\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b+\u0010,*\u0004\b-\u0010.¨\u00060"}, m31665d2 = {"Lhr/j;", "", "Landroid/view/ViewGroup;", "contentView", "<init>", "(Landroid/view/ViewGroup;)V", "Lcr/w1;", "component", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "", "onItemsSelectedListener", "t", "(Lcr/w1;Lkotlin/jvm/functions/Function1;)V", "", "l", "()Z", "Lkotlin/Function0;", "callback", "p", "(Lkotlin/jvm/functions/Function0;)V", "visible", "hasTitle", "q", "(ZZ)V", "r", "()V", "a", "Landroid/view/ViewGroup;", "Ljt/h;", "Lgr/a;", "Lkotlin/jvm/internal/EnhancedNullability;", "b", "Ljt/h;", "lazyBinding", "c", "Z", "setup", "", "d", "Lkotlin/jvm/functions/Function1;", "bottomSheetStateChangeListener", "n", "()Lgr/a;", "getBinding$delegate", "(Lhr/j;)Ljava/lang/Object;", "binding", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6555j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ViewGroup contentView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h<C6213a> lazyBinding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean setup;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public Function1<? super Integer, Unit> bottomSheetStateChangeListener;

    /* JADX INFO: renamed from: hr.j$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1", m39664f = "InputSelectBottomSheetController.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f24893t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f24894u;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ Function0<Unit> f24896w;

        /* JADX INFO: renamed from: hr.j$a$a, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$1", m39664f = "InputSelectBottomSheetController.kt", m39665l = {296, 198}, m39666m = "invokeSuspend")
        public static final class C14179a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public Object f24897t;

            /* JADX INFO: renamed from: u */
            public int f24898u;

            /* JADX INFO: renamed from: v */
            public int f24899v;

            /* JADX INFO: renamed from: w */
            public final /* synthetic */ InterfaceC7833a0 f24900w;

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C6555j f24901x;

            /* JADX INFO: renamed from: y */
            public final /* synthetic */ Function0<Unit> f24902y;

            /* JADX INFO: renamed from: hr.j$a$a$a, reason: collision with other inner class name */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C14180a implements Function1<WindowInsetsCompat, Unit> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C7758y f24903a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC7897n<Unit> f24904b;

                /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: ku.n<? super kotlin.Unit> */
                /* JADX WARN: Multi-variable type inference failed */
                public C14180a(C7758y c7758y, InterfaceC7897n<? super Unit> interfaceC7897n) {
                    this.f24903a = c7758y;
                    this.f24904b = interfaceC7897n;
                }

                /* JADX INFO: renamed from: a */
                public final void m28410a(WindowInsetsCompat insets) {
                    Intrinsics.checkNotNullParameter(insets, "insets");
                    if (this.f24903a.f29445a) {
                        return;
                    }
                    Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.ime());
                    Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
                    if (insets2.bottom > 0) {
                        this.f24903a.f29445a = true;
                        InterfaceC7897n<Unit> interfaceC7897n = this.f24904b;
                        C7347n.Companion companion = C7347n.INSTANCE;
                        interfaceC7897n.resumeWith(C7347n.m30460b(Unit.f29331a));
                    }
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(WindowInsetsCompat windowInsetsCompat) {
                    m28410a(windowInsetsCompat);
                    return Unit.f29331a;
                }
            }

            /* JADX INFO: renamed from: hr.j$a$a$b */
            @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
            @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$1$2", m39664f = "InputSelectBottomSheetController.kt", m39665l = {}, m39666m = "invokeSuspend")
            public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t */
                public int f24905t;

                /* JADX INFO: renamed from: u */
                public final /* synthetic */ Function0<Unit> f24906u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(Function0<Unit> function0, InterfaceC9557b<? super b> interfaceC9557b) {
                    super(2, interfaceC9557b);
                    this.f24906u = function0;
                }

                @Override // pt.AbstractC10339a
                public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                    return new b(this.f24906u, interfaceC9557b);
                }

                @Override // pt.AbstractC10339a
                public final Object invokeSuspend(Object obj) {
                    C10047c.m38805e();
                    if (this.f24905t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    this.f24906u.invoke();
                    return Unit.f29331a;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                    return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14179a(InterfaceC7833a0 interfaceC7833a0, C6555j c6555j, Function0<Unit> function0, InterfaceC9557b<? super C14179a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f24900w = interfaceC7833a0;
                this.f24901x = c6555j;
                this.f24902y = function0;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new C14179a(this.f24900w, this.f24901x, this.f24902y, interfaceC9557b);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0078, code lost:
            
                if (p256ku.C7872i.m32684g(r8, r1, r7) == r0) goto L17;
             */
            @Override // pt.AbstractC10339a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f24899v;
                if (i10 != 0) {
                    if (i10 == 1) {
                        C7348o.m30470b(obj);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7348o.m30470b(obj);
                    }
                    InterfaceC7850d2.a.m32603a(this.f24900w, null, 1, null);
                    return Unit.f29331a;
                }
                C7348o.m30470b(obj);
                C6555j c6555j = this.f24901x;
                this.f24897t = c6555j;
                this.f24898u = 0;
                this.f24899v = 1;
                C7905p c7905p = new C7905p(C10046b.m38803c(this), 1);
                c7905p.m32860H();
                C7758y c7758y = new C7758y();
                FrameLayout root = c6555j.m28405n().getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                C12524g.m46876g(root, new C14180a(c7758y, c7905p));
                Object objM32857A = c7905p.m32857A();
                if (objM32857A == C10047c.m38805e()) {
                    C10346h.m39673c(this);
                }
                if (objM32857A != objM38805e) {
                }
                return objM38805e;
                AbstractC7900n2 abstractC7900n2M32645c = C7864g1.m32645c();
                b bVar = new b(this.f24902y, null);
                this.f24897t = null;
                this.f24899v = 2;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((C14179a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX INFO: renamed from: hr.j$a$b */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$2", m39664f = "InputSelectBottomSheetController.kt", m39665l = {213, 216}, m39666m = "invokeSuspend")
        public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f24907t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ C6555j f24908u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ InterfaceC7833a0 f24909v;

            /* JADX INFO: renamed from: w */
            public final /* synthetic */ Function0<Unit> f24910w;

            /* JADX INFO: renamed from: hr.j$a$b$a, reason: collision with other inner class name */
            @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
            @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$2$1", m39664f = "InputSelectBottomSheetController.kt", m39665l = {}, m39666m = "invokeSuspend")
            public static final class C14181a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t */
                public int f24911t;

                /* JADX INFO: renamed from: u */
                public final /* synthetic */ Function0<Unit> f24912u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C14181a(Function0<Unit> function0, InterfaceC9557b<? super C14181a> interfaceC9557b) {
                    super(2, interfaceC9557b);
                    this.f24912u = function0;
                }

                @Override // pt.AbstractC10339a
                public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                    return new C14181a(this.f24912u, interfaceC9557b);
                }

                @Override // pt.AbstractC10339a
                public final Object invokeSuspend(Object obj) {
                    C10047c.m38805e();
                    if (this.f24911t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    this.f24912u.invoke();
                    return Unit.f29331a;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                    return ((C14181a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C6555j c6555j, InterfaceC7833a0 interfaceC7833a0, Function0<Unit> function0, InterfaceC9557b<? super b> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f24908u = c6555j;
                this.f24909v = interfaceC7833a0;
                this.f24910w = function0;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new b(this.f24908u, this.f24909v, this.f24910w, interfaceC9557b);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
            
                if (p256ku.C7872i.m32684g(r8, r1, r7) == r0) goto L21;
             */
            @Override // pt.AbstractC10339a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f24907t;
                if (i10 == 0 || i10 == 1) {
                    C7348o.m30470b(obj);
                    do {
                        WindowInsetsCompat windowInsetsCompatM2988F = C0625o0.m2988F(this.f24908u.m28405n().getRoot());
                        if (windowInsetsCompatM2988F == null || !windowInsetsCompatM2988F.isVisible(WindowInsetsCompat.Type.ime())) {
                            this.f24907t = 1;
                        } else {
                            AbstractC7900n2 abstractC7900n2M32645c = C7864g1.m32645c();
                            C14181a c14181a = new C14181a(this.f24910w, null);
                            this.f24907t = 2;
                        }
                    } while (C7946z0.m32938b(100L, this) != objM38805e);
                    return objM38805e;
                }
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                InterfaceC7850d2.a.m32603a(this.f24909v, null, 1, null);
                return Unit.f29331a;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX INFO: renamed from: hr.j$a$c */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$3", m39664f = "InputSelectBottomSheetController.kt", m39665l = {223, 224}, m39666m = "invokeSuspend")
        public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f24913t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ InterfaceC7833a0 f24914u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ Function0<Unit> f24915v;

            /* JADX INFO: renamed from: hr.j$a$c$a, reason: collision with other inner class name */
            @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
            @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$3$1", m39664f = "InputSelectBottomSheetController.kt", m39665l = {}, m39666m = "invokeSuspend")
            public static final class C14182a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t */
                public int f24916t;

                /* JADX INFO: renamed from: u */
                public final /* synthetic */ Function0<Unit> f24917u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C14182a(Function0<Unit> function0, InterfaceC9557b<? super C14182a> interfaceC9557b) {
                    super(2, interfaceC9557b);
                    this.f24917u = function0;
                }

                @Override // pt.AbstractC10339a
                public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                    return new C14182a(this.f24917u, interfaceC9557b);
                }

                @Override // pt.AbstractC10339a
                public final Object invokeSuspend(Object obj) {
                    C10047c.m38805e();
                    if (this.f24916t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    this.f24917u.invoke();
                    return Unit.f29331a;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                    return ((C14182a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(InterfaceC7833a0 interfaceC7833a0, Function0<Unit> function0, InterfaceC9557b<? super c> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f24914u = interfaceC7833a0;
                this.f24915v = function0;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new c(this.f24914u, this.f24915v, interfaceC9557b);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
            
                if (p256ku.C7872i.m32684g(r8, r1, r7) == r0) goto L15;
             */
            @Override // pt.AbstractC10339a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f24913t;
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    this.f24913t = 1;
                    if (C7946z0.m32938b(1000L, this) != objM38805e) {
                    }
                    return objM38805e;
                }
                if (i10 == 1) {
                    C7348o.m30470b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                InterfaceC7850d2.a.m32603a(this.f24914u, null, 1, null);
                return Unit.f29331a;
                AbstractC7900n2 abstractC7900n2M32645c = C7864g1.m32645c();
                C14182a c14182a = new C14182a(this.f24915v, null);
                this.f24913t = 2;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0<Unit> function0, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f24896w = function0;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            a aVar = C6555j.this.new a(this.f24896w, interfaceC9557b);
            aVar.f24894u = obj;
            return aVar;
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            InterfaceC7906p0 interfaceC7906p0 = (InterfaceC7906p0) this.f24894u;
            C10047c.m38805e();
            if (this.f24893t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            InterfaceC7833a0 interfaceC7833a0M32943b = C7948z2.m32943b(null, 1, null);
            C7882k.m32780d(interfaceC7906p0, interfaceC7833a0M32943b, null, new C14179a(interfaceC7833a0M32943b, C6555j.this, this.f24896w, null), 2, null);
            C7882k.m32780d(interfaceC7906p0, interfaceC7833a0M32943b, null, new b(C6555j.this, interfaceC7833a0M32943b, this.f24896w, null), 2, null);
            C7882k.m32780d(interfaceC7906p0, interfaceC7833a0M32943b, null, new c(interfaceC7833a0M32943b, this.f24896w, null), 2, null);
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: hr.j$b */
    @Metadata(m31664d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m31665d2 = {"hr/j$b", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$g;", "Landroid/view/View;", "bottomSheet", "", "newState", "", "c", "(Landroid/view/View;I)V", "", "slideOffset", "b", "(Landroid/view/View;F)V", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b extends BottomSheetBehavior.AbstractC2756g {
        public b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC2756g
        /* JADX INFO: renamed from: b */
        public void mo12170b(View bottomSheet, float slideOffset) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC2756g
        /* JADX INFO: renamed from: c */
        public void mo12171c(View bottomSheet, int newState) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            Function1 function1 = C6555j.this.bottomSheetStateChangeListener;
            if (function1 != null) {
                function1.invoke(Integer.valueOf(newState));
            }
        }
    }

    /* JADX INFO: renamed from: hr.j$c */
    @Metadata(m31664d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ1\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\u000e\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m31665d2 = {"hr/j$c", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class c implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6558m f24919a;

        public c(C6558m c6558m) {
            this.f24919a = c6558m;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s8) {
            this.f24919a.m28418J(String.valueOf(s8));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s8, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s8, int start, int before, int count) {
        }
    }

    public C6555j(@NotNull ViewGroup contentView) {
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        this.contentView = contentView;
        this.lazyBinding = C7342i.m30456b(new Function0() { // from class: hr.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C6555j.m28396o(this.f24875a);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static final void m28395m(BottomSheetBehavior bottomSheetBehavior) {
        bottomSheetBehavior.m12125X0(5);
    }

    /* JADX INFO: renamed from: o */
    public static final C6213a m28396o(C6555j c6555j) {
        return C6213a.m27343c(LayoutInflater.from(c6555j.contentView.getContext()), c6555j.contentView, true);
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m28397s() {
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m28398u(InterfaceC4337w1 interfaceC4337w1, C7729c0 c7729c0, C6555j c6555j, Option selectedItem) {
        Intrinsics.checkNotNullParameter(selectedItem, "selectedItem");
        if (!interfaceC4337w1.getCanSelectMultipleValues()) {
            Function1 function1 = (Function1) c7729c0.f29425a;
            if (function1 != null) {
                function1.invoke(C7697o.m31878d(selectedItem));
            }
            c7729c0.f29425a = null;
            c6555j.m28404l();
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: v */
    public static final void m28399v(boolean z10, C6555j c6555j, final BottomSheetBehavior bottomSheetBehavior) {
        if (z10) {
            c6555j.m28406p(new Function0() { // from class: hr.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C6555j.m28400w(bottomSheetBehavior);
                }
            });
        } else {
            bottomSheetBehavior.m12125X0(3);
        }
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m28400w(BottomSheetBehavior bottomSheetBehavior) {
        bottomSheetBehavior.m12125X0(3);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m28401x(C7729c0 c7729c0, C6558m c6558m, C6555j c6555j, int i10) {
        if (i10 == 5) {
            Function1 function1 = (Function1) c7729c0.f29425a;
            if (function1 != null) {
                function1.invoke(CollectionsKt.m31687M0(c6558m.m28416F()));
            }
            c7729c0.f29425a = null;
            Context context = c6555j.contentView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            C7259g.m30270d(context);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: y */
    public static final void m28402y(BottomSheetBehavior bottomSheetBehavior, View view) {
        bottomSheetBehavior.m12125X0(5);
    }

    /* JADX INFO: renamed from: z */
    public static final void m28403z(C6555j c6555j, View view) {
        c6555j.m28404l();
    }

    /* JADX INFO: renamed from: l */
    public final boolean m28404l() {
        if (!this.lazyBinding.isInitialized()) {
            return false;
        }
        final BottomSheetBehavior bottomSheetBehaviorM12102q0 = BottomSheetBehavior.m12102q0(m28405n().f23634b);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorM12102q0, "from(...)");
        Context context = this.contentView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        C7259g.m30270d(context);
        this.contentView.postDelayed(new Runnable() { // from class: hr.b
            @Override // java.lang.Runnable
            public final void run() {
                C6555j.m28395m(bottomSheetBehaviorM12102q0);
            }
        }, 100L);
        return bottomSheetBehaviorM12102q0.m12159v0() != 5;
    }

    /* JADX INFO: renamed from: n */
    public final C6213a m28405n() {
        return this.lazyBinding.getValue();
    }

    /* JADX INFO: renamed from: p */
    public final void m28406p(Function0<Unit> callback) {
        Context context = this.contentView.getContext();
        Intrinsics.checkNotNull(context);
        ActivityC6992b activityC6992bM30267a = C7259g.m30267a(context);
        if (activityC6992bM30267a == null) {
            return;
        }
        C7882k.m32780d(C0982t.m4979a(activityC6992bM30267a), null, null, new a(callback, null), 3, null);
    }

    /* JADX INFO: renamed from: q */
    public final void m28407q(boolean visible, boolean hasTitle) {
        if (visible) {
            m28405n().f23642j.setVisibility(8);
            m28405n().f23640h.setVisibility(0);
            m28405n().f23639g.requestFocus();
            Context context = m28405n().f23639g.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            C7259g.m30276j(context);
            return;
        }
        Context context2 = m28405n().f23639g.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        C7259g.m30270d(context2);
        m28405n().f23640h.setVisibility(8);
        m28405n().f23642j.setVisibility(0);
        m28405n().f23639g.setText("");
    }

    /* JADX INFO: renamed from: r */
    public final void m28408r() {
        if (this.setup) {
            return;
        }
        this.setup = true;
        BottomSheetBehavior bottomSheetBehaviorM12102q0 = BottomSheetBehavior.m12102q0(m28405n().f23634b);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorM12102q0, "from(...)");
        bottomSheetBehaviorM12102q0.m12127Z0(true);
        Function0 function0 = new Function0() { // from class: hr.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C6555j.m28397s();
            }
        };
        FrameLayout bottomSheet = m28405n().f23634b;
        Intrinsics.checkNotNullExpressionValue(bottomSheet, "bottomSheet");
        C12519b.m46866b(bottomSheetBehaviorM12102q0, function0, bottomSheet, m28405n().f23635c, m28405n().f23641i);
        bottomSheetBehaviorM12102q0.m12131c0(new b());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r15v0, resolved type: kotlin.jvm.functions.Function1<? super java.util.List<com.withpersona.sdk2.inquiry.steps.ui.components.Option>, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public final void m28409t(@NotNull final InterfaceC4337w1 component, @NotNull Function1<? super List<Option>, Unit> onItemsSelectedListener) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(onItemsSelectedListener, "onItemsSelectedListener");
        m28408r();
        final C7729c0 c7729c0 = new C7729c0();
        c7729c0.f29425a = onItemsSelectedListener;
        String label = component.getLabel();
        final boolean z10 = label == null || StringsKt.m32182p0(label);
        final BottomSheetBehavior bottomSheetBehaviorM12102q0 = BottomSheetBehavior.m12102q0(m28405n().f23634b);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorM12102q0, "from(...)");
        Context context = m28405n().f23638f.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final C6558m c6558m = new C6558m(context, component.mo20723g(), component.getF27964a(), component.getCanSelectMultipleValues(), component.getLeadingImageTemplate(), component.mo20725m(), new Function1() { // from class: hr.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C6555j.m28398u(component, c7729c0, this, (Option) obj);
            }
        });
        this.bottomSheetStateChangeListener = new Function1() { // from class: hr.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C6555j.m28401x(c7729c0, c6558m, this, ((Integer) obj).intValue());
            }
        };
        m28407q(z10, !z10);
        m28405n().f23642j.setText(component.getLabel());
        m28405n().f23638f.setAdapter(c6558m);
        m28405n().f23641i.setOnClickListener(new View.OnClickListener() { // from class: hr.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6555j.m28402y(bottomSheetBehaviorM12102q0, view);
            }
        });
        InputSelectBoxComponentStyle styles = component.getF27964a();
        if (styles != null) {
            TextView textviewInputSelectSheetTitle = m28405n().f23642j;
            Intrinsics.checkNotNullExpressionValue(textviewInputSelectSheetTitle, "textviewInputSelectSheetTitle");
            C7304h0.m30392l(textviewInputSelectSheetTitle, styles.getTextBasedStyle(), null, 2, null);
            Integer baseBackgroundColorValue = styles.getBaseBackgroundColorValue();
            if (baseBackgroundColorValue != null) {
                int iIntValue = baseBackgroundColorValue.intValue();
                m28405n().f23635c.setBackgroundColor(iIntValue);
                m28405n().f23638f.setBackgroundColor(iIntValue);
            }
            Integer baseBorderColorValue = styles.getBaseBorderColorValue();
            if (baseBorderColorValue != null) {
                m28405n().f23636d.setBackgroundColor(baseBorderColorValue.intValue());
            }
            Integer headerCancelButtonColor = styles.getHeaderCancelButtonColor();
            if (headerCancelButtonColor != null) {
                int iIntValue2 = headerCancelButtonColor.intValue();
                m28405n().f23637e.setImageTintList(ColorStateList.valueOf(iIntValue2));
                m28405n().f23640h.setEndIconTintList(ColorStateList.valueOf(iIntValue2));
            }
            Integer baseTextColor = styles.getBaseTextColor();
            if (baseTextColor != null) {
                int iIntValue3 = baseTextColor.intValue();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(C0546c.m2678l(iIntValue3, 128));
                Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(...)");
                m28405n().f23639g.setHintTextColor(colorStateListValueOf);
                m28405n().f23639g.setTextColor(iIntValue3);
            }
        }
        m28405n().f23638f.setLayoutManager(new LinearLayoutManager(m28405n().getRoot().getContext()));
        m28405n().f23638f.setHasFixedSize(true);
        m28405n().f23639g.addTextChangedListener(new c(c6558m));
        m28405n().f23637e.setOnClickListener(new View.OnClickListener() { // from class: hr.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6555j.m28403z(this.f24884a, view);
            }
        });
        m28405n().f23639g.setText("");
        m28405n().f23634b.setTranslationY(0.0f);
        this.contentView.postDelayed(new Runnable() { // from class: hr.g
            @Override // java.lang.Runnable
            public final void run() {
                C6555j.m28399v(z10, this, bottomSheetBehaviorM12102q0);
            }
        }, 100L);
    }
}
