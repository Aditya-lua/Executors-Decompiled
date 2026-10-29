package com.squareup.workflow1.p052ui;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.p616lifecycle.AbstractC0966l;
import androidx.p616lifecycle.C0963j0;
import androidx.p616lifecycle.C0976q;
import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.C0386o;
import p016an.ViewEnvironment;
import p229jt.C7348o;
import p256ku.C7882k;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001$B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, m31665d2 = {"Lcom/squareup/workflow1/ui/WorkflowLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "newRendering", "Lan/y;", "environment", "", "c", "(Ljava/lang/Object;Lan/y;)V", "Landroidx/lifecycle/l;", "lifecycle", "Lnu/h;", "renderings", "Landroidx/lifecycle/l$b;", "repeatOnLifecycle", "a", "(Landroidx/lifecycle/l;Lnu/h;Landroidx/lifecycle/l$b;Lan/y;)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "Lcom/squareup/workflow1/ui/WorkflowViewStub;", "Lcom/squareup/workflow1/ui/WorkflowViewStub;", "showing", "Landroid/util/SparseArray;", "b", "Landroid/util/SparseArray;", "restoredChildState", "SavedState", "wf1-core-android"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class WorkflowLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final WorkflowViewStub showing;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public SparseArray<Parcelable> restoredChildState;

    /* JADX INFO: renamed from: com.squareup.workflow1.ui.WorkflowLayout$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {1, 6, 0})
    @InterfaceC10344f(m39663c = "com.squareup.workflow1.ui.WorkflowLayout$start$1", m39664f = "WorkflowLayout.kt", m39665l = {87}, m39666m = "invokeSuspend")
    public static final class C3376a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f12830t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ AbstractC0966l f12831u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ AbstractC0966l.b f12832v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ InterfaceC9575h<Object> f12833w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ WorkflowLayout f12834x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ ViewEnvironment f12835y;

        /* JADX INFO: renamed from: com.squareup.workflow1.ui.WorkflowLayout$a$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {1, 6, 0})
        @InterfaceC10344f(m39663c = "com.squareup.workflow1.ui.WorkflowLayout$start$1$1", m39664f = "WorkflowLayout.kt", m39665l = {212}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f12836t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ InterfaceC9575h<Object> f12837u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ WorkflowLayout f12838v;

            /* JADX INFO: renamed from: w */
            public final /* synthetic */ ViewEnvironment f12839w;

            /* JADX INFO: renamed from: com.squareup.workflow1.ui.WorkflowLayout$a$a$a, reason: collision with other inner class name */
            @Metadata(m31664d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, m31665d2 = {"com/squareup/workflow1/ui/WorkflowLayout$a$a$a", "Lnu/i;", "value", "", "emit", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
            public static final class C14109a implements InterfaceC9577i<Object> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ WorkflowLayout f12840a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ViewEnvironment f12841b;

                public C14109a(WorkflowLayout workflowLayout, ViewEnvironment viewEnvironment) {
                    this.f12840a = workflowLayout;
                    this.f12841b = viewEnvironment;
                }

                @Override // nu.InterfaceC9577i
                @Nullable
                public Object emit(Object obj, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
                    this.f12840a.m16097c(obj, this.f12841b);
                    return Unit.f29331a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC9575h<? extends Object> interfaceC9575h, WorkflowLayout workflowLayout, ViewEnvironment viewEnvironment, InterfaceC9557b<? super a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f12837u = interfaceC9575h;
                this.f12838v = workflowLayout;
                this.f12839w = viewEnvironment;
            }

            @Override // pt.AbstractC10339a
            @NotNull
            public final InterfaceC9557b<Unit> create(@Nullable Object obj, @NotNull InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f12837u, this.f12838v, this.f12839w, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f12836t;
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    InterfaceC9575h<Object> interfaceC9575h = this.f12837u;
                    C14109a c14109a = new C14109a(this.f12838v, this.f12839w);
                    this.f12836t = 1;
                    if (interfaceC9575h.collect(c14109a, this) == objM38805e) {
                        return objM38805e;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                return Unit.f29331a;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull InterfaceC7906p0 interfaceC7906p0, @Nullable InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3376a(AbstractC0966l abstractC0966l, AbstractC0966l.b bVar, InterfaceC9575h<? extends Object> interfaceC9575h, WorkflowLayout workflowLayout, ViewEnvironment viewEnvironment, InterfaceC9557b<? super C3376a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f12831u = abstractC0966l;
            this.f12832v = bVar;
            this.f12833w = interfaceC9575h;
            this.f12834x = workflowLayout;
            this.f12835y = viewEnvironment;
        }

        @Override // pt.AbstractC10339a
        @NotNull
        public final InterfaceC9557b<Unit> create(@Nullable Object obj, @NotNull InterfaceC9557b<?> interfaceC9557b) {
            return new C3376a(this.f12831u, this.f12832v, this.f12833w, this.f12834x, this.f12835y, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f12830t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                AbstractC0966l abstractC0966l = this.f12831u;
                AbstractC0966l.b bVar = this.f12832v;
                a aVar = new a(this.f12833w, this.f12834x, this.f12835y, null);
                this.f12830t = 1;
                if (C0963j0.m4920a(abstractC0966l, bVar, aVar, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC7906p0 interfaceC7906p0, @Nullable InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3376a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
      (r1v0 android.content.Context)
      (wrap android.util.AttributeSet:?: TERNARY null = ((wrap int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
     A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:1) call: com.squareup.workflow1.ui.WorkflowLayout.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ WorkflowLayout(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m16095b(WorkflowLayout workflowLayout, AbstractC0966l abstractC0966l, InterfaceC9575h interfaceC9575h, AbstractC0966l.b bVar, ViewEnvironment viewEnvironment, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            bVar = AbstractC0966l.b.STARTED;
        }
        if ((i10 & 8) != 0) {
            viewEnvironment = new ViewEnvironment(null, 1, null);
        }
        workflowLayout.m16096a(abstractC0966l, interfaceC9575h, bVar, viewEnvironment);
    }

    /* JADX INFO: renamed from: a */
    public final void m16096a(@NotNull AbstractC0966l lifecycle, @NotNull InterfaceC9575h<? extends Object> renderings, @NotNull AbstractC0966l.b repeatOnLifecycle, @NotNull ViewEnvironment environment) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(renderings, "renderings");
        Intrinsics.checkNotNullParameter(repeatOnLifecycle, "repeatOnLifecycle");
        Intrinsics.checkNotNullParameter(environment, "environment");
        C7882k.m32780d(C0976q.m4971a(lifecycle), null, null, new C3376a(lifecycle, repeatOnLifecycle, renderings, this, environment, null), 3, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m16097c(@NotNull Object newRendering, @NotNull ViewEnvironment environment) {
        Intrinsics.checkNotNullParameter(newRendering, "newRendering");
        Intrinsics.checkNotNullParameter(environment, "environment");
        this.showing.m16104c(newRendering, environment);
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
        SavedState savedState = state instanceof SavedState ? (SavedState) state : null;
        if (savedState != null) {
            this.restoredChildState = savedState.m16098a();
            super.onRestoreInstanceState(((SavedState) state).getSuperState());
            unit = Unit.f29331a;
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
        return new SavedState(parcelableOnSaveInstanceState, sparseArray);
    }

    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0011B!\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, m31665d2 = {"Lcom/squareup/workflow1/ui/WorkflowLayout$SavedState;", "Landroid/view/View$BaseSavedState;", "Landroid/os/Parcelable;", "superState", "Landroid/util/SparseArray;", "childState", "<init>", "(Landroid/os/Parcelable;Landroid/util/SparseArray;)V", "Landroid/os/Parcel;", Payload.SOURCE, "(Landroid/os/Parcel;)V", "out", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Landroid/util/SparseArray;", "()Landroid/util/SparseArray;", "CREATOR", "wf1-core-android"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
    public static final class SavedState extends View.BaseSavedState {

        /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final SparseArray<Parcelable> childState;

        /* JADX INFO: renamed from: com.squareup.workflow1.ui.WorkflowLayout$SavedState$a, reason: from kotlin metadata */
        @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m31665d2 = {"Lcom/squareup/workflow1/ui/WorkflowLayout$SavedState$a;", "Landroid/os/Parcelable$Creator;", "Lcom/squareup/workflow1/ui/WorkflowLayout$SavedState;", "<init>", "()V", "Landroid/os/Parcel;", Payload.SOURCE, "a", "(Landroid/os/Parcel;)Lcom/squareup/workflow1/ui/WorkflowLayout$SavedState;", "", "size", "", "b", "(I)[Lcom/squareup/workflow1/ui/WorkflowLayout$SavedState;", "wf1-core-android"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
        public static final class Companion implements Parcelable.Creator<SavedState> {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.squareup.workflow1.ui.WorkflowLayout.SavedState.a.<init>():void type: THIS */
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
        public SavedState(@Nullable Parcelable parcelable, @NotNull SparseArray<Parcelable> childState) {
            super(parcelable);
            Intrinsics.checkNotNullParameter(childState, "childState");
            this.childState = childState;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final SparseArray<Parcelable> m16098a() {
            return this.childState;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NotNull Parcel out, int flags) {
            Intrinsics.checkNotNullParameter(out, "out");
            super.writeToParcel(out, flags);
            out.writeSparseArray(this.childState);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(@NotNull Parcel source) {
            super(source);
            Intrinsics.checkNotNullParameter(source, "source");
            SparseArray<Parcelable> sparseArray = source.readSparseArray(SavedState.class.getClassLoader());
            Intrinsics.checkNotNull(sparseArray);
            Intrinsics.checkNotNullExpressionValue(sparseArray, "source.readSparseArray(S…class.java.classLoader)!!");
            this.childState = sparseArray;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkflowLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        if (getId() == -1) {
            setId(C0386o.f949d);
        }
        WorkflowViewStub workflowViewStub = new WorkflowViewStub(context, null, 0, 0, 14, null);
        workflowViewStub.setUpdatesVisibility(false);
        addView(workflowViewStub, new ViewGroup.LayoutParams(-1, -1));
        this.showing = workflowViewStub;
    }
}
