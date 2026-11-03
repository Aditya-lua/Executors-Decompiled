package com.withpersona.sdk2.inquiry.ui.uiStep;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.p000lifecycle.a1;
import androidx.p000lifecycle.b1;
import androidx.p000lifecycle.c1;
import androidx.p000lifecycle.j;
import androidx.p000lifecycle.t;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment;
import e4.l0;
import gt.l;
import gt.o;
import gt.s;
import iu.p0;
import k4.CreationExtras;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.k;
import lu.c0;
import nt.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pr.g1;
import xt.n;
import ym.ViewEnvironment;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 C2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002DEB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R!\u0010-\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010\u0005\u001a\u0004\b*\u0010+R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001b\u00108\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010)\u001a\u0004\b6\u00107R$\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010B\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006F"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment;", "Lmq/c;", "Lnr/a;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "rendering", "r2", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c;)V", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;", "input", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b;", "handler", "q2", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lkotlin/jvm/functions/Function1;)V", "Lcom/withpersona/sdk2/inquiry/ui/uiStep/b$a;", "j0", "Lcom/withpersona/sdk2/inquiry/ui/uiStep/b$a;", "p2", "()Lcom/withpersona/sdk2/inquiry/ui/uiStep/b$a;", "setViewModelFactory", "(Lcom/withpersona/sdk2/inquiry/ui/uiStep/b$a;)V", "viewModelFactory", "Ltq/a;", "k0", "Ltq/a;", "m2", "()Ltq/a;", "setSystemUiController", "(Ltq/a;)V", "systemUiController", "Lym/y;", "l0", "Lgt/h;", "n2", "()Lym/y;", "getViewEnvironment$annotations", "viewEnvironment", "Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment$UiStepFragmentArgs;", "m0", "Liq/c;", "l2", "()Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment$UiStepFragmentArgs;", "args", "Lcom/withpersona/sdk2/inquiry/ui/uiStep/b;", "n0", "o2", "()Lcom/withpersona/sdk2/inquiry/ui/uiStep/b;", "viewModel", "o0", "Lkotlin/jvm/functions/Function1;", "currentOutputHandler", "Lcom/withpersona/sdk2/inquiry/ui/g;", "p0", "Lcom/withpersona/sdk2/inquiry/ui/g;", "runner", "q0", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c;", "pendingRendering", "r0", "b", "UiStepFragmentArgs", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UiStepFragment extends mq.c<nr.a, UiWorkflow.c> {

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j0, reason: collision with root package name and from kotlin metadata */
    public b.a viewModelFactory;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    public tq.a systemUiController;

    /* JADX INFO: renamed from: l0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gt.h viewEnvironment;

    /* JADX INFO: renamed from: m0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final iq.c args;

    /* JADX INFO: renamed from: n0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gt.h viewModel;

    /* JADX INFO: renamed from: o0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super UiWorkflow.b, Unit> currentOutputHandler;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public com.withpersona.sdk2.inquiry.ui.g runner;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public UiWorkflow.c pendingRendering;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment$UiStepFragmentArgs;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;", "props", "<init>", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;", "()Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UiStepFragmentArgs implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<UiStepFragmentArgs> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final UiWorkflow.Input props;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<UiStepFragmentArgs> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UiStepFragmentArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UiStepFragmentArgs(UiWorkflow.Input.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final UiStepFragmentArgs[] newArray(int i10) {
                return new UiStepFragmentArgs[i10];
            }
        }

        public UiStepFragmentArgs(@NotNull UiWorkflow.Input props) {
            Intrinsics.checkNotNullParameter(props, "props");
            this.props = props;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final UiWorkflow.Input getProps() {
            return this.props;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.props.writeToParcel(dest, flags);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a extends k implements n<LayoutInflater, ViewGroup, Boolean, nr.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f14095a = new a();

        public a() {
            super(3, nr.a.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/ui/databinding/Pi2InquiryUiBinding;", 0);
        }

        public final nr.a d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            return nr.a.d(p8, viewGroup, z10);
        }

        @Override // xt.n
        public /* bridge */ /* synthetic */ nr.a invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment$b;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;", "props", "Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment;", "a", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final UiStepFragment a(@NotNull UiWorkflow.Input props) {
            Intrinsics.checkNotNullParameter(props, "props");
            return (UiStepFragment) iq.b.a(new UiStepFragment(), new UiStepFragmentArgs(props));
        }

        public Companion() {
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment$onViewCreated$1", f = "UiStepFragment.kt", l = {72}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class c extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f14096t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ g1 f14097u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ UiStepFragment f14098v;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements lu.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ UiStepFragment f14099a;
            public final /* synthetic */ g1 b;

            public a(UiStepFragment uiStepFragment, g1 g1Var) {
                this.f14099a = uiStepFragment;
                this.b = g1Var;
            }

            @Override // lu.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(UiWorkflow.b bVar, lt.b<? super Unit> bVar2) {
                if (bVar == null) {
                    return Unit.f22938a;
                }
                if (this.f14099a.currentOutputHandler != null) {
                    this.b.a().setValue(null);
                    Function1 function1 = this.f14099a.currentOutputHandler;
                    if (function1 != null) {
                        function1.invoke(bVar);
                    }
                }
                return Unit.f22938a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g1 g1Var, UiStepFragment uiStepFragment, lt.b<? super c> bVar) {
            super(2, bVar);
            this.f14097u = g1Var;
            this.f14098v = uiStepFragment;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new c(this.f14097u, this.f14098v, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f14096t;
            if (i10 == 0) {
                o.b(obj);
                c0<UiWorkflow.b> c0VarA = this.f14097u.a();
                a aVar = new a(this.f14098v, this.f14097u);
                this.f14096t = 1;
                if (c0VarA.collect(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            throw new gt.d();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class d implements Function0<Bundle> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.c f14100a;

        public d(androidx.fragment.app.c cVar) {
            this.f14100a = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle bundleT = this.f14100a.t();
            if (bundleT != null) {
                return bundleT;
            }
            throw new IllegalStateException("Fragment " + this.f14100a + " has null arguments");
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class e implements Function0<a1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.c f14101a;
        public final /* synthetic */ Function1 b;

        public e(androidx.fragment.app.c cVar, Function1 function1) {
            this.f14101a = cVar;
            this.b = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a1.c invoke() {
            return new mq.d(this.f14101a, this.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/fragment/app/c;", "b", "()Landroidx/fragment/app/c;"}, k = 3, mv = {2, 2, 0})
    public static final class f extends kotlin.jvm.internal.m implements Function0<androidx.fragment.app.c> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.c f14102i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(androidx.fragment.app.c cVar) {
            super(0);
            this.f14102i = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final androidx.fragment.app.c invoke() {
            return this.f14102i;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/c1;", "b", "()Landroidx/lifecycle/c1;"}, k = 3, mv = {2, 2, 0})
    public static final class g extends kotlin.jvm.internal.m implements Function0<c1> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f14103i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function0 function0) {
            super(0);
            this.f14103i = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c1 invoke() {
            return (c1) this.f14103i.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/b1;", "b", "()Landroidx/lifecycle/b1;"}, k = 3, mv = {2, 2, 0})
    public static final class h extends kotlin.jvm.internal.m implements Function0<b1> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ gt.h f14104i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(gt.h hVar) {
            super(0);
            this.f14104i = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b1 invoke() {
            return l0.c(this.f14104i).v();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Lk4/a;", "b", "()Lk4/a;"}, k = 3, mv = {2, 2, 0})
    public static final class i extends kotlin.jvm.internal.m implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f14105i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ gt.h f14106j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Function0 function0, gt.h hVar) {
            super(0);
            this.f14105i = function0;
            this.f14106j = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f14105i;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            c1 c1VarC = l0.c(this.f14106j);
            j jVar = c1VarC instanceof j ? (j) c1VarC : null;
            return jVar != null ? jVar.Y() : CreationExtras.b.f22393c;
        }
    }

    public UiStepFragment() {
        super(a.f14095a);
        this.viewEnvironment = gt.i.b(new Function0() { // from class: qr.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UiStepFragment.s2(this.f30037a);
            }
        });
        this.args = new iq.c(d0.b(UiStepFragmentArgs.class), new d(this));
        e eVar = new e(this, new Function1() { // from class: qr.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiStepFragment.t2(this.f30038a, (androidx.p000lifecycle.l0) obj);
            }
        });
        gt.h hVarA = gt.i.a(gt.k.NONE, new g(new f(this)));
        this.viewModel = l0.b(this, d0.b(b.class), new h(hVarA), new i(null, hVarA), eVar);
    }

    private final ViewEnvironment n2() {
        return (ViewEnvironment) this.viewEnvironment.getValue();
    }

    public static final ViewEnvironment s2(UiStepFragment uiStepFragment) {
        return new ViewEnvironment(j0.g(s.a(tq.b.b, uiStepFragment.m2())));
    }

    public static final b t2(UiStepFragment uiStepFragment, androidx.p000lifecycle.l0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return uiStepFragment.p2().a(it, uiStepFragment.l2().getProps());
    }

    @Override // mq.c, androidx.fragment.app.c
    public void e1(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.e1(view, savedInstanceState);
        g1 uiStepStateManager = o2().getUiStepStateManager();
        g2(uiStepStateManager.c());
        androidx.p000lifecycle.s sVarK0 = k0();
        Intrinsics.checkNotNullExpressionValue(sVarK0, "getViewLifecycleOwner(...)");
        iu.k.d(t.a(sVarK0), null, null, new c(uiStepStateManager, this, null), 3, null);
        UiWorkflow.c cVar = this.pendingRendering;
        if (cVar != null) {
            h2(cVar);
        }
        this.pendingRendering = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final UiStepFragmentArgs l2() {
        return (UiStepFragmentArgs) this.args.getValue();
    }

    @NotNull
    public final tq.a m2() {
        tq.a aVar = this.systemUiController;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("systemUiController");
        return null;
    }

    public final b o2() {
        return (b) this.viewModel.getValue();
    }

    @NotNull
    public final b.a p2() {
        b.a aVar = this.viewModelFactory;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("viewModelFactory");
        return null;
    }

    public final void q2(@NotNull UiWorkflow.Input input, @NotNull Function1<? super UiWorkflow.b, Unit> handler) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(handler, "handler");
        o2().f(input);
        this.currentOutputHandler = handler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mq.c
    /* JADX INFO: renamed from: r2, reason: merged with bridge method [inline-methods] */
    public void h2(@NotNull UiWorkflow.c rendering) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        if (!d2()) {
            this.pendingRendering = rendering;
            return;
        }
        if (!(rendering instanceof UiWorkflow.c.a)) {
            throw new l();
        }
        com.withpersona.sdk2.inquiry.ui.g gVar = this.runner;
        if (gVar == null) {
            gVar = new com.withpersona.sdk2.inquiry.ui.g((nr.a) b2(), (UiWorkflow.c.a) rendering);
            this.runner = gVar;
        }
        gVar.b((UiWorkflow.c.a) rendering, n2());
    }
}
