package kr;

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
import nn.ViewEnvironment;
import nn.b0;
import nn.e0;
import nn.f0;
import nn.g0;
import nn.i0;
import nn.j0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.jvm.internal.d0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 \u00102\u00020\u0001:\u0002\u0017#B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000fH\u0014¢\u0006\u0004\b!\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010(\u001a\b\u0012\u0002\b\u0003\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010'R\u0016\u0010+\u001a\u0004\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lkr/p;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", BuildConfig.FLAVOR, "defStyle", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lkr/m;", "newRendering", "Lnn/z;", "newViewEnvironment", BuildConfig.FLAVOR, "c", "(Lkr/m;Lnn/z;)V", "Landroid/view/View;", "oldViewMaybe", "newView", "Lkr/l;", "transition", "b", "(Landroid/view/View;Landroid/view/View;Lkr/l;)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lpn/e;", "a", "Lpn/e;", "viewStateCache", "Lnn/m;", "Lnn/m;", "currentRendering", "getCurrentView", "()Landroid/view/View;", "currentView", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class p extends FrameLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final pn.e viewStateCache;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public nn.m<?> currentRendering;

    /* JADX INFO: renamed from: kr.p$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lkr/p$a;", "Lnn/b0;", "Lkr/m;", "<init>", "()V", "initialRendering", "Lnn/z;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "d", "(Lkr/m;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lxu/c;", "getType", "()Lxu/c;", Payload.TYPE, "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements b0<m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ nn.f<m> f21788a;

        /* JADX INFO: renamed from: kr.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0414a extends p001kotlin.jvm.internal.k implements Function2<m, ViewEnvironment, Unit> {
            public C0414a(Object obj) {
                super(2, obj, p.class, "update", "update(Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransition;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
            }

            public final void d(m p8, ViewEnvironment p10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                Intrinsics.checkNotNullParameter(p10, "p1");
                ((p) this.receiver).c(p8, p10);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(m mVar, ViewEnvironment viewEnvironment) {
                d(mVar, viewEnvironment);
                return Unit.f21506a;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final View c(m initialRendering, ViewEnvironment initialEnv, Context context, ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialEnv, "initialEnv");
            Intrinsics.checkNotNullParameter(context, "context");
            p pVar = new p(context, null, 0, 0, 14, null);
            pVar.setId(xq.t.f37037r);
            pVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            f0.a(pVar, initialRendering, initialEnv, new C0414a(pVar));
            return pVar;
        }

        @Override // nn.b0
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public View a(@NotNull m initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f21788a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // nn.b0
        @NotNull
        public xu.c<? super m> getType() {
            return this.f21788a.getType();
        }

        public Companion() {
            this.f21788a = new nn.f<>(d0.b(m.class), new pu.o() { // from class: kr.o
                @Override // pu.o
                public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
                    return p.Companion.c((m) obj, (ViewEnvironment) obj2, (Context) obj3, (ViewGroup) obj4);
                }
            });
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21790a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.SLIDE_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.SLIDE_OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f21790a = iArr;
        }
    }

    public /* synthetic */ p(Context context, AttributeSet attributeSet, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    public static final void d(View view, Function0 doStart) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(doStart, "doStart");
        on.d.Companion.e(on.d.INSTANCE, view, null, 2, null);
        doStart.invoke();
    }

    private final View getCurrentView() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    public void b(@Nullable View oldViewMaybe, @NotNull View newView, @NotNull l transition) {
        Pair pairA;
        Intrinsics.checkNotNullParameter(newView, "newView");
        Intrinsics.checkNotNullParameter(transition, "transition");
        if (oldViewMaybe == null) {
            addView(newView);
            return;
        }
        View viewFindViewById = oldViewMaybe.findViewById(qn.a.f30036a);
        View viewFindViewById2 = newView.findViewById(qn.a.f30036a);
        if (viewFindViewById == null || viewFindViewById2 == null) {
            viewFindViewById2 = newView;
        } else {
            oldViewMaybe = viewFindViewById;
        }
        int i10 = c.f21790a[transition.ordinal()];
        if (i10 == 1) {
            pairA = zt.s.a(8388611, 8388613);
        } else {
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new zt.l();
                }
                p5.y.f(new p5.n(this, newView), null);
                return;
            }
            pairA = zt.s.a(8388613, 8388611);
        }
        p5.b0 b0VarZ0 = new p5.b0().H0(new p5.p(((Number) pairA.a()).intValue()).e(oldViewMaybe)).H0(new p5.p(((Number) pairA.b()).intValue()).e(viewFindViewById2)).z0(new AccelerateDecelerateInterpolator());
        Intrinsics.checkNotNullExpressionValue(b0VarZ0, "setInterpolator(...)");
        p5.y.d(this);
        p5.y.f(new p5.n(this, newView), b0VarZ0);
    }

    public final void c(@NotNull m newRendering, @NotNull ViewEnvironment newViewEnvironment) {
        on.d dVarC;
        Intrinsics.checkNotNullParameter(newRendering, "newRendering");
        Intrinsics.checkNotNullParameter(newViewEnvironment, "newViewEnvironment");
        ViewEnvironment viewEnvironmentC = newViewEnvironment.c(zt.s.a(pn.a.INSTANCE, pn.a.First));
        nn.m<?> mVar = new nn.m<>(newRendering.getScreen(), "screen_with_transition");
        View currentView = getCurrentView();
        if (currentView != null) {
            View view = f0.b(currentView, mVar) ? currentView : null;
            if (view != null) {
                this.viewStateCache.d(p001kotlin.collections.o.d(mVar));
                f0.g(view, mVar, viewEnvironmentC);
                return;
            }
        }
        nn.d0 d0Var = (nn.d0) viewEnvironmentC.a(nn.d0.INSTANCE);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        View viewC = e0.c(d0Var, mVar, viewEnvironmentC, context, this, new g0() { // from class: kr.n
            @Override // nn.g0
            public final void a(View view2, Function0 function0) {
                p.d(view2, function0);
            }
        });
        f0.h(viewC);
        b(currentView, viewC, newRendering.getTransition());
        if (currentView != null && (dVarC = on.d.INSTANCE.c(currentView)) != null) {
            dVarC.K();
        }
        this.currentRendering = mVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        e5.i iVarC = on.c.f28285a.c(this);
        nn.g.Companion companion = nn.g.INSTANCE;
        i0<?> i0VarD = j0.d(this);
        Object objC = i0VarD == null ? null : i0VarD.c();
        if (objC == null) {
            objC = null;
        }
        Intrinsics.checkNotNull(objC);
        this.viewStateCache.a(nn.g.Companion.b(companion, objC, null, 2, null), iVarC);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.viewStateCache.b();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@NotNull Parcelable state) {
        Intrinsics.checkNotNullParameter(state, "state");
        b bVar = state instanceof b ? (b) state : null;
        if (bVar == null) {
            super.onRestoreInstanceState(super.onSaveInstanceState());
        } else {
            this.viewStateCache.f(bVar.getSavedViewState());
            super.onRestoreInstanceState(((b) state).getSuperState());
        }
    }

    @Override // android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState != null) {
            return new b(parcelableOnSaveInstanceState, this.viewStateCache.g());
        }
        return null;
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0011B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"Lkr/p$b;", "Landroid/view/View$BaseSavedState;", "Landroid/os/Parcelable;", "superState", "Lpn/e$a;", "savedViewState", "<init>", "(Landroid/os/Parcelable;Lpn/e$a;)V", "Landroid/os/Parcel;", Payload.SOURCE, "(Landroid/os/Parcel;)V", "out", BuildConfig.FLAVOR, "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lpn/e$a;", "()Lpn/e$a;", "CREATOR", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends View.BaseSavedState {

        /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final pn.e.a savedViewState;

        /* JADX INFO: renamed from: kr.p$b$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkr/p$b$a;", "Landroid/os/Parcelable$Creator;", "Lkr/p$b;", "<init>", "()V", "Landroid/os/Parcel;", Payload.SOURCE, "a", "(Landroid/os/Parcel;)Lkr/p$b;", BuildConfig.FLAVOR, "size", BuildConfig.FLAVOR, "b", "(I)[Lkr/p$b;", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        public b(@NotNull Parcelable superState, @NotNull pn.e.a savedViewState) {
            super(superState);
            Intrinsics.checkNotNullParameter(superState, "superState");
            Intrinsics.checkNotNullParameter(savedViewState, "savedViewState");
            this.savedViewState = savedViewState;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final pn.e.a getSavedViewState() {
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
            Parcelable parcelable = source.readParcelable(pn.e.a.class.getClassLoader());
            Intrinsics.checkNotNull(parcelable);
            this.savedViewState = (pn.e.a) parcelable;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.viewStateCache = new pn.e();
    }
}
