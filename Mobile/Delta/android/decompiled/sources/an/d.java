package an;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000\u0003B+\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0010\u0010\u0015R$\u0010\u0019\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\f\u0010\u0018¨\u0006\u001a"}, d2 = {"Lan/d;", "", "W", "Lan/b;", "wrapped", "", "shadow", "Lkotlin/Function0;", "", "onBackPressed", "<init>", "(Ljava/lang/Object;ZLkotlin/jvm/functions/Function0;)V", "a", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "b", "Z", "c", "()Z", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "Lan/a0;", "Lan/a0;", "()Lan/a0;", "viewFactory", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class d<W> implements an.b<d<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final W wrapped;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean shadow;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Function0<Unit> onBackPressed;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a0<d<?>> viewFactory;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "W", "Lan/d;", "outer", "a", "(Lan/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    public static final class a extends kotlin.jvm.internal.m implements Function1<d<?>, Object> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f697i = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull d<?> outer) {
            Intrinsics.checkNotNullParameter(outer, "outer");
            return outer.d();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\f\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\b\u0012\u0004\u0012\u00020\u0000`\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u000b\u001a\u00020\u0005H\n¢\u0006\u0004\b\f\u0010\r"}, d2 = {"", "W", "Landroid/view/View;", "view", "Lkotlin/Function2;", "Lan/y;", "", "Lcom/squareup/workflow1/ui/ViewShowRendering;", "innerShowRendering", "Lan/d;", "outerRendering", "viewEnvironment", "a", "(Landroid/view/View;Lkotlin/jvm/functions/Function2;Lan/d;Lan/y;)V"}, k = 3, mv = {1, 6, 0})
    public static final class b extends kotlin.jvm.internal.m implements zt.o<View, Function2<? super Object, ? super ViewEnvironment, ? extends Unit>, d<?>, ViewEnvironment, Unit> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final b f698i = new b();

        public b() {
            super(4);
        }

        public final void a(@NotNull View view, @NotNull Function2<Object, ? super ViewEnvironment, Unit> innerShowRendering, @NotNull d<?> outerRendering, @NotNull ViewEnvironment viewEnvironment) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(innerShowRendering, "innerShowRendering");
            Intrinsics.checkNotNullParameter(outerRendering, "outerRendering");
            Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
            if (!outerRendering.getShadow()) {
                e.c(view, outerRendering.b());
            }
            innerShowRendering.invoke(outerRendering.d(), viewEnvironment);
            if (outerRendering.getShadow()) {
                e.c(view, outerRendering.b());
            }
        }

        @Override // zt.o
        public /* bridge */ /* synthetic */ Unit e(View view, Function2<? super Object, ? super ViewEnvironment, ? extends Unit> function2, d<?> dVar, ViewEnvironment viewEnvironment) {
            a(view, function2, dVar, viewEnvironment);
            return Unit.f22483a;
        }
    }

    public d(@NotNull W wrapped, boolean z10, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.wrapped = wrapped;
        this.shadow = z10;
        this.onBackPressed = function0;
        this.viewFactory = new i(kotlin.jvm.internal.d0.b(d.class), a.f697i, null, b.f698i, 4, null);
    }

    @Override // an.b
    @NotNull
    public a0<d<?>> a() {
        return this.viewFactory;
    }

    @Nullable
    public final Function0<Unit> b() {
        return this.onBackPressed;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getShadow() {
        return this.shadow;
    }

    @NotNull
    public final W d() {
        return this.wrapped;
    }

    public /* synthetic */ d(Object obj, boolean z10, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? null : function0);
    }
}
