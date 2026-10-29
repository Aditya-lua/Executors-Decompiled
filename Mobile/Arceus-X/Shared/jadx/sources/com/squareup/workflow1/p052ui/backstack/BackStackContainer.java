package com.squareup.workflow1.p052ui.backstack;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.core.view.GravityCompat;
import bn.C1471c;
import bn.InterfaceC1472d;
import cn.C1682c;
import cn.EnumC1680a;
import com.appsflyer.sdk_base.referrer.Payload;
import com.squareup.workflow1.p052ui.backstack.BackStackContainer;
import hu.InterfaceC6567c;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7746m;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.AbstractC0376g0;
import p016an.C0370d0;
import p016an.C0372e0;
import p016an.C0373f;
import p016an.C0377h;
import p016an.C0378h0;
import p016an.C0384m;
import p016an.InterfaceC0364a0;
import p016an.InterfaceC0368c0;
import p016an.InterfaceC0374f0;
import p016an.InterfaceC0375g;
import p016an.ViewEnvironment;
import p068d5.InterfaceC4445i;
import p081dn.C4646a;
import p229jt.C7345l;
import p229jt.C7352s;
import p322o5.C9654b0;
import p322o5.C9677n;
import p322o5.C9681p;
import p322o5.C9691y;
import p615zt.InterfaceC14058o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 \u00102\u00020\u0001:\u0002#,B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0010\u001a\u00020\u000f2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000fH\u0014¢\u0006\u0004\b!\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010(\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030&\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010'R\u0016\u0010+\u001a\u0004\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006-"}, m31665d2 = {"Lcom/squareup/workflow1/ui/backstack/BackStackContainer;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lcn/c;", "newRendering", "Lan/y;", "newViewEnvironment", "", "c", "(Lcn/c;Lan/y;)V", "Landroid/view/View;", "oldViewMaybe", "newView", "", "popped", "b", "(Landroid/view/View;Landroid/view/View;Z)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lcom/squareup/workflow1/ui/backstack/ViewStateCache;", "a", "Lcom/squareup/workflow1/ui/backstack/ViewStateCache;", "viewStateCache", "Lan/m;", "Lcn/c;", "currentRendering", "getCurrentView", "()Landroid/view/View;", "currentView", "SavedState", "wf1-container-android"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public class BackStackContainer extends FrameLayout {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ViewStateCache viewStateCache;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public C1682c<C0384m<?>> currentRendering;

    /* JADX INFO: renamed from: com.squareup.workflow1.ui.backstack.BackStackContainer$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J8\u0010\r\u001a\u00020\f2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\n\b\u0000\u0012\u0006\u0012\u0002\b\u00030\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m31665d2 = {"Lcom/squareup/workflow1/ui/backstack/BackStackContainer$a;", "Lan/a0;", "Lcn/c;", "<init>", "()V", "initialRendering", "Lan/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lcn/c;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lhu/c;", "getType", "()Lhu/c;", Payload.TYPE, "wf1-container-android"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
    public static final class Companion implements InterfaceC0364a0<C1682c<?>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0373f<C1682c<?>> f12851a;

        /* JADX INFO: renamed from: com.squareup.workflow1.ui.backstack.BackStackContainer$a$a */
        @Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, m31665d2 = {"Lcn/c;", "initialRendering", "Lan/y;", "initialEnv", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "<anonymous parameter 3>", "Landroid/view/View;", "a", "(Lcn/c;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;"}, m31666k = 3, m31667mv = {1, 6, 0})
        public static final class a extends AbstractC7746m implements InterfaceC14058o<C1682c<?>, ViewEnvironment, Context, ViewGroup, View> {

            /* JADX INFO: renamed from: i */
            public static final a f12852i = new a();

            /* JADX INFO: renamed from: com.squareup.workflow1.ui.backstack.BackStackContainer$a$a$a, reason: collision with other inner class name */
            @Metadata(m31666k = 3, m31667mv = {1, 6, 0}, m31669xi = 48)
            public /* synthetic */ class C14110a extends C7744k implements Function2<C1682c<?>, ViewEnvironment, Unit> {
                public C14110a(Object obj) {
                    super(2, obj, BackStackContainer.class, "update", "update(Lcom/squareup/workflow1/ui/backstack/BackStackScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
                }

                /* JADX INFO: renamed from: d */
                public final void m16115d(@NotNull C1682c<?> p8, @NotNull ViewEnvironment p10) {
                    Intrinsics.checkNotNullParameter(p8, "p0");
                    Intrinsics.checkNotNullParameter(p10, "p1");
                    ((BackStackContainer) this.receiver).m16109c(p8, p10);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(C1682c<?> c1682c, ViewEnvironment viewEnvironment) {
                    m16115d(c1682c, viewEnvironment);
                    return Unit.f29331a;
                }
            }

            public a() {
                super(4);
            }

            /* JADX DEBUG: Method merged with bridge method: e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // p615zt.InterfaceC14058o
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final View mo1397e(@NotNull C1682c<?> initialRendering, @NotNull ViewEnvironment initialEnv, @NotNull Context context, @Nullable ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
                Intrinsics.checkNotNullParameter(initialEnv, "initialEnv");
                Intrinsics.checkNotNullParameter(context, "context");
                BackStackContainer backStackContainer = new BackStackContainer(context, null, 0, 0, 14, null);
                backStackContainer.setId(C4646a.f19037c);
                backStackContainer.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                C0372e0.m1408a(backStackContainer, initialRendering, initialEnv, new C14110a(backStackContainer));
                return backStackContainer;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.squareup.workflow1.ui.backstack.BackStackContainer.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View; */
        @Override // p016an.InterfaceC0364a0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View mo1379a(@NotNull C1682c<?> initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f12851a.mo1379a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // p016an.InterfaceC0364a0
        @NotNull
        public InterfaceC6567c<? super C1682c<?>> getType() {
            return this.f12851a.getType();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
            this.f12851a = new C0373f<>(C7731d0.m32002b(C1682c.class), a.f12852i);
        }
    }

    /* JADX INFO: renamed from: com.squareup.workflow1.ui.backstack.BackStackContainer$b */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"", "it", "Lan/m;", "a", "(Ljava/lang/Object;)Lan/m;"}, m31666k = 3, m31667mv = {1, 6, 0})
    public static final class C3380b extends AbstractC7746m implements Function1<Object, C0384m<?>> {

        /* JADX INFO: renamed from: i */
        public static final C3380b f12853i = new C3380b();

        public C3380b() {
            super(1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0384m<?> invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new C0384m<>(it, "backstack");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BackStackContainer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX DEBUG: Class process forced to load method for inline: bn.d.a.e(bn.d$a, android.view.View, kotlin.jvm.functions.Function1, int, java.lang.Object):void */
    /* JADX INFO: renamed from: d */
    public static final void m16107d(View view, Function0 doStart) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(doStart, "doStart");
        InterfaceC1472d.Companion.m7550e(InterfaceC1472d.INSTANCE, view, null, 2, null);
        doStart.invoke();
    }

    private final View getCurrentView() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m16108b(@Nullable View oldViewMaybe, @NotNull View newView, boolean popped) {
        Pair pairM30477a;
        Integer numValueOf = Integer.valueOf(GravityCompat.END);
        Integer numValueOf2 = Integer.valueOf(GravityCompat.START);
        Intrinsics.checkNotNullParameter(newView, "newView");
        if (oldViewMaybe == null) {
            addView(newView);
            return;
        }
        int i10 = C4646a.f19035a;
        View viewFindViewById = oldViewMaybe.findViewById(i10);
        View viewFindViewById2 = newView.findViewById(i10);
        if (viewFindViewById == null || viewFindViewById2 == null) {
            viewFindViewById2 = newView;
        } else {
            oldViewMaybe = viewFindViewById;
        }
        if (!popped) {
            pairM30477a = C7352s.m30477a(numValueOf2, numValueOf);
        } else {
            if (!popped) {
                throw new C7345l();
            }
            pairM30477a = C7352s.m30477a(numValueOf, numValueOf2);
        }
        C9654b0 c9654b0M38124L0 = new C9654b0().m38116D0(new C9681p(((Number) pairM30477a.m31671a()).intValue()).mo38130e(oldViewMaybe)).m38116D0(new C9681p(((Number) pairM30477a.m31672b()).intValue()).mo38130e(viewFindViewById2)).mo38144v0(new AccelerateDecelerateInterpolator());
        Intrinsics.checkNotNullExpressionValue(c9654b0M38124L0, "TransitionSet()\n        …DecelerateInterpolator())");
        C9691y.m38304d(this);
        C9691y.m38306f(new C9677n(this, newView), c9654b0M38124L0);
    }

    /* JADX INFO: renamed from: c */
    public final void m16109c(@NotNull C1682c<?> newRendering, @NotNull ViewEnvironment newViewEnvironment) {
        InterfaceC1472d interfaceC1472dM7552c;
        List<C0384m<?>> listM8395a;
        Intrinsics.checkNotNullParameter(newRendering, "newRendering");
        Intrinsics.checkNotNullParameter(newViewEnvironment, "newViewEnvironment");
        ViewEnvironment viewEnvironmentM1464c = newViewEnvironment.m1464c(C7352s.m30477a(EnumC1680a.INSTANCE, newRendering.m8395a().isEmpty() ? EnumC1680a.First : EnumC1680a.Other));
        C1682c c1682cM8398d = newRendering.m8398d(C3380b.f12853i);
        View currentView = getCurrentView();
        if (currentView != null) {
            View view = C0372e0.m1409b(currentView, c1682cM8398d.m8397c()) ? currentView : null;
            if (view != null) {
                this.viewStateCache.m16120d(c1682cM8398d.m8396b());
                C0372e0.m1414g(view, c1682cM8398d.m8397c(), viewEnvironmentM1464c);
                return;
            }
        }
        InterfaceC0368c0 interfaceC0368c0 = (InterfaceC0368c0) viewEnvironmentM1464c.m1462a(InterfaceC0368c0.INSTANCE);
        Object objM8397c = c1682cM8398d.m8397c();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "this.context");
        View viewM1400c = C0370d0.m1400c(interfaceC0368c0, objM8397c, viewEnvironmentM1464c, context, this, new InterfaceC0374f0() { // from class: cn.b
            @Override // p016an.InterfaceC0374f0
            /* JADX INFO: renamed from: a */
            public final void mo1416a(View view2, Function0 function0) {
                BackStackContainer.m16107d(view2, function0);
            }
        });
        C0372e0.m1415h(viewM1400c);
        this.viewStateCache.m16124h(c1682cM8398d.m8395a(), currentView, viewM1400c);
        C1682c<C0384m<?>> c1682c = this.currentRendering;
        boolean z10 = false;
        if (c1682c != null && (listM8395a = c1682c.m8395a()) != null) {
            List<C0384m<?>> list = listM8395a;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (C0377h.m1429a((C0384m) it.next(), c1682cM8398d.m8397c())) {
                        z10 = true;
                        break;
                    }
                }
            }
        }
        m16108b(currentView, viewM1400c, z10);
        if (currentView != null && (interfaceC1472dM7552c = InterfaceC1472d.INSTANCE.m7552c(currentView)) != null) {
            interfaceC1472dM7552c.mo7543L();
        }
        this.currentRendering = c1682cM8398d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC4445i interfaceC4445iM7547c = C1471c.f5714a.m7547c(this);
        InterfaceC0375g.Companion companion = InterfaceC0375g.INSTANCE;
        AbstractC0376g0<?> abstractC0376g0M1433d = C0378h0.m1433d(this);
        Object objMo1422c = abstractC0376g0M1433d == null ? null : abstractC0376g0M1433d.mo1422c();
        if (objMo1422c == null) {
            objMo1422c = null;
        }
        Intrinsics.checkNotNull(objMo1422c);
        this.viewStateCache.m16117a(InterfaceC0375g.Companion.m1418b(companion, objMo1422c, null, 2, null), interfaceC4445iM7547c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.viewStateCache.m16118b();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@NotNull Parcelable state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Unit unit = null;
        SavedState savedState = state instanceof SavedState ? (SavedState) state : null;
        if (savedState != null) {
            this.viewStateCache.m16122f(savedState.getSavedViewState());
            super.onRestoreInstanceState(((SavedState) state).getSuperState());
            unit = Unit.f29331a;
        }
        if (unit == null) {
            super.onRestoreInstanceState(super.onSaveInstanceState());
        }
    }

    @Override // android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            return null;
        }
        return new SavedState(parcelableOnSaveInstanceState, this.viewStateCache.m16123g());
    }

    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0011B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, m31665d2 = {"Lcom/squareup/workflow1/ui/backstack/BackStackContainer$SavedState;", "Landroid/view/View$BaseSavedState;", "Landroid/os/Parcelable;", "superState", "Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;", "savedViewState", "<init>", "(Landroid/os/Parcelable;Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;)V", "Landroid/os/Parcel;", Payload.SOURCE, "(Landroid/os/Parcel;)V", "out", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;", "()Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;", "CREATOR", "wf1-container-android"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
    public static final class SavedState extends View.BaseSavedState {

        /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final ViewStateCache.Saved savedViewState;

        /* JADX INFO: renamed from: com.squareup.workflow1.ui.backstack.BackStackContainer$SavedState$a, reason: from kotlin metadata */
        @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m31665d2 = {"Lcom/squareup/workflow1/ui/backstack/BackStackContainer$SavedState$a;", "Landroid/os/Parcelable$Creator;", "Lcom/squareup/workflow1/ui/backstack/BackStackContainer$SavedState;", "<init>", "()V", "Landroid/os/Parcel;", Payload.SOURCE, "a", "(Landroid/os/Parcel;)Lcom/squareup/workflow1/ui/backstack/BackStackContainer$SavedState;", "", "size", "", "b", "(I)[Lcom/squareup/workflow1/ui/backstack/BackStackContainer$SavedState;", "wf1-container-android"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
        public static final class Companion implements Parcelable.Creator<SavedState> {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.squareup.workflow1.ui.backstack.BackStackContainer.SavedState.a.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NotNull Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new SavedState(source);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int size) {
                return new SavedState[size];
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public Companion() {
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(@NotNull Parcelable superState, @NotNull ViewStateCache.Saved savedViewState) {
            super(superState);
            Intrinsics.checkNotNullParameter(superState, "superState");
            Intrinsics.checkNotNullParameter(savedViewState, "savedViewState");
            this.savedViewState = savedViewState;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ViewStateCache.Saved getSavedViewState() {
            return this.savedViewState;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NotNull Parcel out, int flags) {
            Intrinsics.checkNotNullParameter(out, "out");
            super.writeToParcel(out, flags);
            out.writeParcelable(this.savedViewState, flags);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(@NotNull Parcel source) {
            super(source);
            Intrinsics.checkNotNullParameter(source, "source");
            Parcelable parcelable = source.readParcelable(ViewStateCache.Saved.class.getClassLoader());
            Intrinsics.checkNotNull(parcelable);
            Intrinsics.checkNotNullExpressionValue(parcelable, "source.readParcelable(Vi…class.java.classLoader)!!");
            this.savedViewState = (ViewStateCache.Saved) parcelable;
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
      (r2v0 android.content.Context)
      (wrap android.util.AttributeSet:?: TERNARY null = ((wrap int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r3v0 android.util.AttributeSet))
      (wrap int:?: TERNARY null = ((wrap int:0x0005: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
      (wrap int:?: TERNARY null = ((wrap int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 int))
     A[MD:(android.content.Context, android.util.AttributeSet, int, int):void (m)] (LINE:2) call: com.squareup.workflow1.ui.backstack.BackStackContainer.<init>(android.content.Context, android.util.AttributeSet, int, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ BackStackContainer(Context context, AttributeSet attributeSet, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackStackContainer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.viewStateCache = new ViewStateCache();
    }
}
