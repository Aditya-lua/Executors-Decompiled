package com.squareup.workflow1.ui.backstack;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import com.squareup.workflow1.ui.backstack.BackStackContainer;
import e5.i;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import nn.ViewEnvironment;
import nn.b0;
import nn.e0;
import nn.f;
import nn.f0;
import nn.g;
import nn.g0;
import nn.h;
import nn.i0;
import nn.j0;
import nn.m;
import on.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.jvm.internal.d0;
import p001kotlin.jvm.internal.k;
import p5.n;
import p5.p;
import p5.y;
import pn.e;
import pu.o;
import qn.a;
import zt.l;
import zt.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 \u00102\u00020\u0001:\u0002#\u0017B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0010\u001a\u00020\u000f2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000fH\u0014¢\u0006\u0004\b!\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010(\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030&\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010'R\u0016\u0010+\u001a\u0004\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/squareup/workflow1/ui/backstack/BackStackContainer;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", BuildConfig.FLAVOR, "defStyle", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lpn/c;", "newRendering", "Lnn/z;", "newViewEnvironment", BuildConfig.FLAVOR, "c", "(Lpn/c;Lnn/z;)V", "Landroid/view/View;", "oldViewMaybe", "newView", BuildConfig.FLAVOR, "popped", "b", "(Landroid/view/View;Landroid/view/View;Z)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lpn/e;", "a", "Lpn/e;", "viewStateCache", "Lnn/m;", "Lpn/c;", "currentRendering", "getCurrentView", "()Landroid/view/View;", "currentView", "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class BackStackContainer extends FrameLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e viewStateCache;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public pn.c<m<?>> currentRendering;

    /* JADX INFO: renamed from: com.squareup.workflow1.ui.backstack.BackStackContainer$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J8\u0010\r\u001a\u00020\f2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\n\b\u0000\u0012\u0006\u0012\u0002\b\u00030\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/squareup/workflow1/ui/backstack/BackStackContainer$a;", "Lnn/b0;", "Lpn/c;", "<init>", "()V", "initialRendering", "Lnn/z;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lpn/c;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lxu/c;", "getType", "()Lxu/c;", Payload.TYPE, "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion implements b0<pn.c<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f<pn.c<?>> f9863a;

        /* JADX INFO: renamed from: com.squareup.workflow1.ui.backstack.BackStackContainer$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lpn/c;", "initialRendering", "Lnn/z;", "initialEnv", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "<anonymous parameter 3>", "Landroid/view/View;", "a", "(Lpn/c;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;"}, k = 3, mv = {1, 6, 0})
        public static final class C0162a extends p001kotlin.jvm.internal.m implements o<pn.c<?>, ViewEnvironment, Context, ViewGroup, View> {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public static final C0162a f9864i = new C0162a();

            /* JADX INFO: renamed from: com.squareup.workflow1.ui.backstack.BackStackContainer$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            public /* synthetic */ class C0163a extends k implements Function2<pn.c<?>, ViewEnvironment, Unit> {
                public C0163a(Object obj) {
                    super(2, obj, BackStackContainer.class, "update", "update(Lcom/squareup/workflow1/ui/backstack/BackStackScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
                }

                public final void d(@NotNull pn.c<?> p8, @NotNull ViewEnvironment p10) {
                    Intrinsics.checkNotNullParameter(p8, "p0");
                    Intrinsics.checkNotNullParameter(p10, "p1");
                    ((BackStackContainer) this.receiver).c(p8, p10);
                }

                @Override // p001kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(pn.c<?> cVar, ViewEnvironment viewEnvironment) {
                    d(cVar, viewEnvironment);
                    return Unit.f21506a;
                }
            }

            public C0162a() {
                super(4);
            }

            @Override // pu.o
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final View e(@NotNull pn.c<?> initialRendering, @NotNull ViewEnvironment initialEnv, @NotNull Context context, @Nullable ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
                Intrinsics.checkNotNullParameter(initialEnv, "initialEnv");
                Intrinsics.checkNotNullParameter(context, "context");
                BackStackContainer backStackContainer = new BackStackContainer(context, null, 0, 0, 14, null);
                backStackContainer.setId(a.f30037c);
                backStackContainer.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                f0.a(backStackContainer, initialRendering, initialEnv, new C0163a(backStackContainer));
                return backStackContainer;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // nn.b0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View a(@NotNull pn.c<?> initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f9863a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // nn.b0
        @NotNull
        public xu.c<? super pn.c<?>> getType() {
            return this.f9863a.getType();
        }

        public Companion() {
            this.f9863a = new f<>(d0.b(pn.c.class), C0162a.f9864i);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "it", "Lnn/m;", "a", "(Ljava/lang/Object;)Lnn/m;"}, k = 3, mv = {1, 6, 0})
    public static final class c extends p001kotlin.jvm.internal.m implements Function1<Object, m<?>> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final c f9866i = new c();

        public c() {
            super(1);
        }

        @Override // p001kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m<?> invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new m<>(it, "backstack");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BackStackContainer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void d(View view, Function0 doStart) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(doStart, "doStart");
        d.Companion.e(d.INSTANCE, view, null, 2, null);
        doStart.invoke();
    }

    private final View getCurrentView() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    public void b(@Nullable View oldViewMaybe, @NotNull View newView, boolean popped) {
        Pair pairA;
        Intrinsics.checkNotNullParameter(newView, "newView");
        if (oldViewMaybe == null) {
            addView(newView);
            return;
        }
        View viewFindViewById = oldViewMaybe.findViewById(a.f30036a);
        View viewFindViewById2 = newView.findViewById(a.f30036a);
        if (viewFindViewById == null || viewFindViewById2 == null) {
            viewFindViewById2 = newView;
        } else {
            oldViewMaybe = viewFindViewById;
        }
        if (!popped) {
            pairA = s.a(8388611, 8388613);
        } else {
            if (!popped) {
                throw new l();
            }
            pairA = s.a(8388613, 8388611);
        }
        p5.b0 b0VarP0 = new p5.b0().H0(new p(((Number) pairA.a()).intValue()).e(oldViewMaybe)).H0(new p(((Number) pairA.b()).intValue()).e(viewFindViewById2)).z0(new AccelerateDecelerateInterpolator());
        Intrinsics.checkNotNullExpressionValue(b0VarP0, "TransitionSet()\n        …DecelerateInterpolator())");
        y.d(this);
        y.f(new n(this, newView), b0VarP0);
    }

    public final void c(@NotNull pn.c<?> newRendering, @NotNull ViewEnvironment newViewEnvironment) {
        d dVarC;
        List<m<?>> listA;
        Intrinsics.checkNotNullParameter(newRendering, "newRendering");
        Intrinsics.checkNotNullParameter(newViewEnvironment, "newViewEnvironment");
        ViewEnvironment viewEnvironmentC = newViewEnvironment.c(s.a(pn.a.INSTANCE, newRendering.a().isEmpty() ? pn.a.First : pn.a.Other));
        pn.c cVarD = newRendering.d(c.f9866i);
        View currentView = getCurrentView();
        if (currentView != null) {
            View view = f0.b(currentView, cVarD.c()) ? currentView : null;
            if (view != null) {
                this.viewStateCache.d(cVarD.b());
                f0.g(view, cVarD.c(), viewEnvironmentC);
                return;
            }
        }
        nn.d0 d0Var = (nn.d0) viewEnvironmentC.a(nn.d0.INSTANCE);
        Object objC = cVarD.c();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "this.context");
        View viewC = e0.c(d0Var, objC, viewEnvironmentC, context, this, new g0() { // from class: pn.b
            @Override // nn.g0
            public final void a(View view2, Function0 function0) {
                BackStackContainer.d(view2, function0);
            }
        });
        f0.h(viewC);
        this.viewStateCache.h(cVarD.a(), currentView, viewC);
        pn.c<m<?>> cVar = this.currentRendering;
        boolean z10 = false;
        if (cVar != null && (listA = cVar.a()) != null) {
            List<m<?>> list = listA;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (h.a((m) it.next(), cVarD.c())) {
                        z10 = true;
                        break;
                    }
                }
            }
        }
        b(currentView, viewC, z10);
        if (currentView != null && (dVarC = d.INSTANCE.c(currentView)) != null) {
            dVarC.K();
        }
        this.currentRendering = cVarD;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        i iVarC = on.c.f28285a.c(this);
        g.Companion companion = g.INSTANCE;
        i0<?> i0VarD = j0.d(this);
        Object objC = i0VarD == null ? null : i0VarD.c();
        if (objC == null) {
            objC = null;
        }
        Intrinsics.checkNotNull(objC);
        this.viewStateCache.a(g.Companion.b(companion, objC, null, 2, null), iVarC);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.viewStateCache.b();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@NotNull Parcelable state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Unit unit = null;
        b bVar = state instanceof b ? (b) state : null;
        if (bVar != null) {
            this.viewStateCache.f(bVar.getSavedViewState());
            super.onRestoreInstanceState(((b) state).getSuperState());
            unit = Unit.f21506a;
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
        return new b(parcelableOnSaveInstanceState, this.viewStateCache.g());
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0011B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/squareup/workflow1/ui/backstack/BackStackContainer$b;", "Landroid/view/View$BaseSavedState;", "Landroid/os/Parcelable;", "superState", "Lpn/e$a;", "savedViewState", "<init>", "(Landroid/os/Parcelable;Lpn/e$a;)V", "Landroid/os/Parcel;", Payload.SOURCE, "(Landroid/os/Parcel;)V", "out", BuildConfig.FLAVOR, "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lpn/e$a;", "()Lpn/e$a;", "CREATOR", "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class b extends View.BaseSavedState {

        /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final e.a savedViewState;

        /* JADX INFO: renamed from: com.squareup.workflow1.ui.backstack.BackStackContainer$b$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/squareup/workflow1/ui/backstack/BackStackContainer$b$a;", "Landroid/os/Parcelable$Creator;", "Lcom/squareup/workflow1/ui/backstack/BackStackContainer$b;", "<init>", "()V", "Landroid/os/Parcel;", Payload.SOURCE, "a", "(Landroid/os/Parcel;)Lcom/squareup/workflow1/ui/backstack/BackStackContainer$b;", BuildConfig.FLAVOR, "size", BuildConfig.FLAVOR, "b", "(I)[Lcom/squareup/workflow1/ui/backstack/BackStackContainer$b;", "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion implements Parcelable.Creator<b> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(@NotNull Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new b(source);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int size) {
                return new b[size];
            }

            public Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull Parcelable superState, @NotNull e.a savedViewState) {
            super(superState);
            Intrinsics.checkNotNullParameter(superState, "superState");
            Intrinsics.checkNotNullParameter(savedViewState, "savedViewState");
            this.savedViewState = savedViewState;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final e.a getSavedViewState() {
            return this.savedViewState;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NotNull Parcel out, int flags) {
            Intrinsics.checkNotNullParameter(out, "out");
            super.writeToParcel(out, flags);
            out.writeParcelable(this.savedViewState, flags);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull Parcel source) {
            super(source);
            Intrinsics.checkNotNullParameter(source, "source");
            Parcelable parcelable = source.readParcelable(e.a.class.getClassLoader());
            Intrinsics.checkNotNull(parcelable);
            Intrinsics.checkNotNullExpressionValue(parcelable, "source.readParcelable(Vi…class.java.classLoader)!!");
            this.savedViewState = (e.a) parcelable;
        }
    }

    public /* synthetic */ BackStackContainer(Context context, AttributeSet attributeSet, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackStackContainer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.viewStateCache = new e();
    }
}
