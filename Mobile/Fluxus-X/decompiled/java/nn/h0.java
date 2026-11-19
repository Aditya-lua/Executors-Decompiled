package nn;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import av.p0;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import com.squareup.workflow1.ui.WorkflowViewStub;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lnn/h0;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", BuildConfig.FLAVOR, "newRendering", "Lnn/z;", "environment", BuildConfig.FLAVOR, "c", "(Ljava/lang/Object;Lnn/z;)V", "Landroidx/lifecycle/l;", "lifecycle", "Ldv/h;", "renderings", "Landroidx/lifecycle/l$b;", "repeatOnLifecycle", "a", "(Landroidx/lifecycle/l;Ldv/h;Landroidx/lifecycle/l$b;Lnn/z;)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "Lcom/squareup/workflow1/ui/WorkflowViewStub;", "Lcom/squareup/workflow1/ui/WorkflowViewStub;", "showing", "Landroid/util/SparseArray;", "b", "Landroid/util/SparseArray;", "restoredChildState", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class h0 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final WorkflowViewStub showing;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public SparseArray<Parcelable> restoredChildState;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {1, 6, 0})
    @gu.f(c = "com.squareup.workflow1.ui.WorkflowLayout$start$1", f = "WorkflowLayout.kt", l = {87}, m = "invokeSuspend")
    public static final class b extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f25849t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ androidx.p000lifecycle.l f25850u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.l.b f25851v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ dv.h<Object> f25852w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ h0 f25853x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ ViewEnvironment f25854y;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {1, 6, 0})
        @gu.f(c = "com.squareup.workflow1.ui.WorkflowLayout$start$1$1", f = "WorkflowLayout.kt", l = {212}, m = "invokeSuspend")
        public static final class a extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f25855t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ dv.h<Object> f25856u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ h0 f25857v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ ViewEnvironment f25858w;

            /* JADX INFO: renamed from: nn.h0$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"nn/h0$b$a$a", "Ldv/i;", "value", BuildConfig.FLAVOR, "emit", "(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
            public static final class C0506a implements dv.i<Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ h0 f25859a;
                public final /* synthetic */ ViewEnvironment b;

                public C0506a(h0 h0Var, ViewEnvironment viewEnvironment) {
                    this.f25859a = h0Var;
                    this.b = viewEnvironment;
                }

                @Override // dv.i
                @Nullable
                public Object emit(Object obj, @NotNull eu.b<? super Unit> bVar) {
                    this.f25859a.c(obj, this.b);
                    return Unit.f21506a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(dv.h<? extends Object> hVar, h0 h0Var, ViewEnvironment viewEnvironment, eu.b<? super a> bVar) {
                super(2, bVar);
                this.f25856u = hVar;
                this.f25857v = h0Var;
                this.f25858w = viewEnvironment;
            }

            @Override // gu.a
            @NotNull
            public final eu.b<Unit> create(@Nullable Object obj, @NotNull eu.b<?> bVar) {
                return new a(this.f25856u, this.f25857v, this.f25858w, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull p0 p0Var, @Nullable eu.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f25855t;
                if (i10 == 0) {
                    zt.o.b(obj);
                    dv.h<Object> hVar = this.f25856u;
                    C0506a c0506a = new C0506a(this.f25857v, this.f25858w);
                    this.f25855t = 1;
                    if (hVar.collect(c0506a, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                }
                return Unit.f21506a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.p000lifecycle.l lVar, androidx.lifecycle.l.b bVar, dv.h<? extends Object> hVar, h0 h0Var, ViewEnvironment viewEnvironment, eu.b<? super b> bVar2) {
            super(2, bVar2);
            this.f25850u = lVar;
            this.f25851v = bVar;
            this.f25852w = hVar;
            this.f25853x = h0Var;
            this.f25854y = viewEnvironment;
        }

        @Override // gu.a
        @NotNull
        public final eu.b<Unit> create(@Nullable Object obj, @NotNull eu.b<?> bVar) {
            return new b(this.f25850u, this.f25851v, this.f25852w, this.f25853x, this.f25854y, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull p0 p0Var, @Nullable eu.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f25849t;
            if (i10 == 0) {
                zt.o.b(obj);
                androidx.p000lifecycle.l lVar = this.f25850u;
                androidx.lifecycle.l.b bVar = this.f25851v;
                a aVar = new a(this.f25852w, this.f25853x, this.f25854y, null);
                this.f25849t = 1;
                if (androidx.p000lifecycle.j0.a(lVar, bVar, aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            return Unit.f21506a;
        }
    }

    public /* synthetic */ h0(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    public static /* synthetic */ void b(h0 h0Var, androidx.p000lifecycle.l lVar, dv.h hVar, androidx.lifecycle.l.b bVar, ViewEnvironment viewEnvironment, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            bVar = androidx.lifecycle.l.b.STARTED;
        }
        if ((i10 & 8) != 0) {
            viewEnvironment = new ViewEnvironment(null, 1, null);
        }
        h0Var.a(lVar, hVar, bVar, viewEnvironment);
    }

    public final void a(@NotNull androidx.p000lifecycle.l lifecycle, @NotNull dv.h<? extends Object> renderings, @NotNull androidx.lifecycle.l.b repeatOnLifecycle, @NotNull ViewEnvironment environment) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(renderings, "renderings");
        Intrinsics.checkNotNullParameter(repeatOnLifecycle, "repeatOnLifecycle");
        Intrinsics.checkNotNullParameter(environment, "environment");
        av.k.d(androidx.p000lifecycle.q.a(lifecycle), null, null, new b(lifecycle, repeatOnLifecycle, renderings, this, environment, null), 3, null);
    }

    public final void c(@NotNull Object newRendering, @NotNull ViewEnvironment environment) {
        Intrinsics.checkNotNullParameter(newRendering, "newRendering");
        Intrinsics.checkNotNullParameter(environment, "environment");
        this.showing.c(newRendering, environment);
        SparseArray<Parcelable> sparseArray = this.restoredChildState;
        if (sparseArray == null) {
            return;
        }
        this.restoredChildState = null;
        this.showing.getActual().restoreHierarchyState(sparseArray);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable state) {
        Unit unit = null;
        a aVar = state instanceof a ? (a) state : null;
        if (aVar != null) {
            this.restoredChildState = aVar.a();
            super.onRestoreInstanceState(((a) state).getSuperState());
            unit = Unit.f21506a;
        }
        if (unit == null) {
            super.onRestoreInstanceState(super.onSaveInstanceState());
        }
    }

    @Override // android.view.View
    @NotNull
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.checkNotNull(parcelableOnSaveInstanceState);
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.showing.getActual().saveHierarchyState(sparseArray);
        return new a(parcelableOnSaveInstanceState, sparseArray);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0011B!\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"Lnn/h0$a;", "Landroid/view/View$BaseSavedState;", "Landroid/os/Parcelable;", "superState", "Landroid/util/SparseArray;", "childState", "<init>", "(Landroid/os/Parcelable;Landroid/util/SparseArray;)V", "Landroid/os/Parcel;", Payload.SOURCE, "(Landroid/os/Parcel;)V", "out", BuildConfig.FLAVOR, "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Landroid/util/SparseArray;", "()Landroid/util/SparseArray;", "CREATOR", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class a extends View.BaseSavedState {

        /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final SparseArray<Parcelable> childState;

        /* JADX INFO: renamed from: nn.h0$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lnn/h0$a$a;", "Landroid/os/Parcelable$Creator;", "Lnn/h0$a;", "<init>", "()V", "Landroid/os/Parcel;", Payload.SOURCE, "a", "(Landroid/os/Parcel;)Lnn/h0$a;", BuildConfig.FLAVOR, "size", BuildConfig.FLAVOR, "b", "(I)[Lnn/h0$a;", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion implements Parcelable.Creator<a> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(@NotNull Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new a(source);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int size) {
                return new a[size];
            }

            public Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@Nullable Parcelable parcelable, @NotNull SparseArray<Parcelable> childState) {
            super(parcelable);
            Intrinsics.checkNotNullParameter(childState, "childState");
            this.childState = childState;
        }

        @NotNull
        public final SparseArray<Parcelable> a() {
            return this.childState;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NotNull Parcel out, int flags) {
            Intrinsics.checkNotNullParameter(out, "out");
            super.writeToParcel(out, flags);
            out.writeSparseArray(this.childState);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Parcel source) {
            super(source);
            Intrinsics.checkNotNullParameter(source, "source");
            SparseArray<Parcelable> sparseArray = source.readSparseArray(a.class.getClassLoader());
            Intrinsics.checkNotNull(sparseArray);
            Intrinsics.checkNotNullExpressionValue(sparseArray, "source.readSparseArray(S…class.java.classLoader)!!");
            this.childState = sparseArray;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        if (getId() == -1) {
            setId(p.f25885d);
        }
        WorkflowViewStub workflowViewStub = new WorkflowViewStub(context, null, 0, 0, 14, null);
        workflowViewStub.setUpdatesVisibility(false);
        addView(workflowViewStub, new ViewGroup.LayoutParams(-1, -1));
        this.showing = workflowViewStub;
    }
}
