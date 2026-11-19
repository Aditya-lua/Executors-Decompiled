package wp;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import e5.i;
import nn.ViewEnvironment;
import nn.b0;
import nn.e0;
import nn.f;
import nn.f0;
import nn.g;
import nn.i0;
import nn.j0;
import nn.m;
import np.g0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.p;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.jvm.internal.d0;
import p001kotlin.jvm.internal.k;
import pn.e;
import pu.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 (2\u00020\u0001:\u0002\u001c\u001fB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001a\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010#R\u0016\u0010'\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lwp/c;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", BuildConfig.FLAVOR, "defStyle", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lwp/d;", "newRendering", "Lnn/z;", "newViewEnvironment", BuildConfig.FLAVOR, "d", "(Lwp/d;Lnn/z;)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/view/View;", "b", "(Lwp/d;Lnn/z;)Landroid/view/View;", "Lpp/b;", "a", "Lpp/b;", "binding", "Lpn/e;", "Lpn/e;", "viewStateCache", "getCurrentView", "()Landroid/view/View;", "currentView", "c", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c extends FrameLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final pp.b binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final e viewStateCache;

    /* JADX INFO: renamed from: wp.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lwp/c$a;", "Lnn/b0;", "Lwp/d;", "<init>", "()V", "initialRendering", "Lnn/z;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "d", "(Lwp/d;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lxu/c;", "getType", "()Lxu/c;", Payload.TYPE, "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements b0<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f<d> f35962a;

        /* JADX INFO: renamed from: wp.c$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0743a extends k implements Function2<d, ViewEnvironment, Unit> {
            public C0743a(Object obj) {
                super(2, obj, c.class, "update", "update(Lcom/withpersona/sdk2/inquiry/internal/ui/DisableableScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
            }

            public final void d(d p8, ViewEnvironment p10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                Intrinsics.checkNotNullParameter(p10, "p1");
                ((c) this.receiver).d(p8, p10);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(d dVar, ViewEnvironment viewEnvironment) {
                d(dVar, viewEnvironment);
                return Unit.f21506a;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final View c(d initialRendering, ViewEnvironment initialEnv, Context context, ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialEnv, "initialEnv");
            Intrinsics.checkNotNullParameter(context, "context");
            c cVar = new c(context, null, 0, 0, 14, null);
            cVar.setId(g0.f26317k);
            cVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            f0.a(cVar, initialRendering, initialEnv, new C0743a(cVar));
            return cVar;
        }

        @Override // nn.b0
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public View a(@NotNull d initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f35962a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // nn.b0
        @NotNull
        public xu.c<? super d> getType() {
            return this.f35962a.getType();
        }

        public Companion() {
            this.f35962a = new f<>(d0.b(d.class), new o() { // from class: wp.b
                @Override // pu.o
                public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
                    return c.Companion.c((d) obj, (ViewEnvironment) obj2, (Context) obj3, (ViewGroup) obj4);
                }
            });
        }
    }

    public /* synthetic */ c(Context context, AttributeSet attributeSet, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    public static final void c(View view, Function0 doStart) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(doStart, "doStart");
        on.d.Companion.e(on.d.INSTANCE, view, null, 2, null);
        doStart.invoke();
    }

    private final View getCurrentView() {
        if (this.binding.f29259c.getChildCount() > 0) {
            return this.binding.f29259c.getChildAt(0);
        }
        return null;
    }

    public final View b(d newRendering, ViewEnvironment newViewEnvironment) {
        on.d dVarC;
        m mVar = new m(newRendering.getScreen(), "disableable_container");
        View currentView = getCurrentView();
        if (currentView != null) {
            View view = f0.b(currentView, mVar) ? currentView : null;
            if (view != null) {
                this.viewStateCache.d(p001kotlin.collections.o.d(mVar));
                f0.g(view, mVar, newViewEnvironment);
                return view;
            }
        }
        nn.d0 d0Var = (nn.d0) newViewEnvironment.a(nn.d0.INSTANCE);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        View viewC = e0.c(d0Var, mVar, newViewEnvironment, context, this, new nn.g0() { // from class: wp.a
            @Override // nn.g0
            public final void a(View view2, Function0 function0) {
                c.c(view2, function0);
            }
        });
        f0.h(viewC);
        this.viewStateCache.h(p.k(), currentView, viewC);
        this.binding.f29259c.removeView(currentView);
        this.binding.f29259c.addView(viewC);
        if (currentView != null && (dVarC = on.d.INSTANCE.c(currentView)) != null) {
            dVarC.K();
        }
        return viewC;
    }

    public final void d(@NotNull d newRendering, @NotNull ViewEnvironment newViewEnvironment) {
        Intrinsics.checkNotNullParameter(newRendering, "newRendering");
        Intrinsics.checkNotNullParameter(newViewEnvironment, "newViewEnvironment");
        View viewB = b(newRendering, newViewEnvironment);
        setEnabled(newRendering.getIsEnabled());
        if (isEnabled()) {
            viewB.setAlpha(1.0f);
            this.binding.b.setVisibility(8);
        } else {
            viewB.setAlpha(0.5f);
            this.binding.b.setVisibility(0);
        }
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

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0011B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"Lwp/c$b;", "Landroid/view/View$BaseSavedState;", "Landroid/os/Parcelable;", "superState", "Lpn/e$a;", "savedViewState", "<init>", "(Landroid/os/Parcelable;Lpn/e$a;)V", "Landroid/os/Parcel;", Payload.SOURCE, "(Landroid/os/Parcel;)V", "out", BuildConfig.FLAVOR, "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lpn/e$a;", "()Lpn/e$a;", "CREATOR", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends View.BaseSavedState {

        /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final e.a savedViewState;

        /* JADX INFO: renamed from: wp.c$b$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lwp/c$b$a;", "Landroid/os/Parcelable$Creator;", "Lwp/c$b;", "<init>", "()V", "Landroid/os/Parcel;", Payload.SOURCE, "a", "(Landroid/os/Parcel;)Lwp/c$b;", BuildConfig.FLAVOR, "size", BuildConfig.FLAVOR, "b", "(I)[Lwp/c$b;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
            this.savedViewState = (e.a) parcelable;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        pp.b bVarB = pp.b.b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(bVarB, "inflate(...)");
        this.binding = bVarB;
        this.viewStateCache = new e();
    }
}
