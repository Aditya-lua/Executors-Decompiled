package com.withpersona.sdk2.inquiry.integration.fragment;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC0929c;
import androidx.p616lifecycle.C0941a1;
import androidx.p616lifecycle.C0944b1;
import androidx.p616lifecycle.C0967l0;
import androidx.p616lifecycle.C0982t;
import androidx.p616lifecycle.InterfaceC0947c1;
import androidx.p616lifecycle.InterfaceC0962j;
import androidx.p616lifecycle.InterfaceC0980s;
import com.withpersona.sdk2.inquiry.integration.IntegrationView;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow;
import com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7688j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7746m;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nu.InterfaceC9566c0;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.C0372e0;
import p016an.InterfaceC0364a0;
import p016an.ViewEnvironment;
import p093e4.C4822l0;
import p229jt.C7334d;
import p229jt.C7342i;
import p229jt.C7348o;
import p229jt.C7352s;
import p229jt.EnumC7344k;
import p229jt.InterfaceC7341h;
import p237k4.CreationExtras;
import p253kq.C7811b;
import p253kq.C7812c;
import p256ku.C7882k;
import p256ku.InterfaceC7906p0;
import p313nq.C9546b;
import p315nt.InterfaceC9557b;
import p341oq.AbstractC9844c;
import p341oq.C9845d;
import p344ot.C10047c;
import p498vq.C12247a;
import p498vq.C12248b;
import p615zt.InterfaceC14057n;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 ?2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002@AB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R!\u0010-\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010\u0005\u001a\u0004\b*\u0010+R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010)\u001a\u0004\b0\u00101R\u001b\u00108\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R$\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010>\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006B"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/integration/fragment/IntegrationStepFragment;", "Loq/c;", "Lnq/b;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "rendering", "q2", "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;)V", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;", "input", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b;", "handler", "r2", "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;Lkotlin/jvm/functions/Function1;)V", "Lcom/withpersona/sdk2/inquiry/integration/fragment/d$a;", "j0", "Lcom/withpersona/sdk2/inquiry/integration/fragment/d$a;", "p2", "()Lcom/withpersona/sdk2/inquiry/integration/fragment/d$a;", "setViewModelFactory", "(Lcom/withpersona/sdk2/inquiry/integration/fragment/d$a;)V", "viewModelFactory", "Lvq/a;", "k0", "Lvq/a;", "m2", "()Lvq/a;", "setSystemUiController", "(Lvq/a;)V", "systemUiController", "Lan/y;", "l0", "Ljt/h;", "n2", "()Lan/y;", "getViewEnvironment$annotations", "viewEnvironment", "Lcom/withpersona/sdk2/inquiry/integration/fragment/d;", "m0", "o2", "()Lcom/withpersona/sdk2/inquiry/integration/fragment/d;", "viewModel", "Lcom/withpersona/sdk2/inquiry/integration/fragment/IntegrationStepFragment$IntegrationStepFragmentArgs;", "n0", "Lkq/c;", "l2", "()Lcom/withpersona/sdk2/inquiry/integration/fragment/IntegrationStepFragment$IntegrationStepFragmentArgs;", "args", "o0", "Lkotlin/jvm/functions/Function1;", "currentOutputHandler", "p0", "Landroid/view/View;", "currentView", "q0", "b", "IntegrationStepFragmentArgs", "integration_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class IntegrationStepFragment extends AbstractC9844c<C9546b, IntegrationView> {

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public C3628d.a viewModelFactory;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public C12247a systemUiController;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h viewEnvironment;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h viewModel;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    @NotNull
    public final C7812c args;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    @Nullable
    public Function1<? super IntegrationWorkflow.InterfaceC3611b, Unit> currentOutputHandler;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    @Nullable
    public View currentView;

    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/integration/fragment/IntegrationStepFragment$IntegrationStepFragmentArgs;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;", "props", "<init>", "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;", "()Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;", "integration_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class IntegrationStepFragmentArgs implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<IntegrationStepFragmentArgs> CREATOR = new C3615a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final IntegrationWorkflow.Input props;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepFragment$IntegrationStepFragmentArgs$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3615a implements Parcelable.Creator<IntegrationStepFragmentArgs> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IntegrationStepFragmentArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IntegrationStepFragmentArgs(IntegrationWorkflow.Input.CREATOR.createFromParcel(parcel));
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final IntegrationStepFragmentArgs[] newArray(int i10) {
                return new IntegrationStepFragmentArgs[i10];
            }
        }

        public IntegrationStepFragmentArgs(@NotNull IntegrationWorkflow.Input props) {
            Intrinsics.checkNotNullParameter(props, "props");
            this.props = props;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final IntegrationWorkflow.Input getProps() {
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

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepFragment$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class C3616a extends C7744k implements InterfaceC14057n<LayoutInflater, ViewGroup, Boolean, C9546b> {

        /* JADX INFO: renamed from: a */
        public static final C3616a f14382a = new C3616a();

        public C3616a() {
            super(3, C9546b.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2GenericUiStepScreenBinding;", 0);
        }

        /* JADX INFO: renamed from: d */
        public final C9546b m18027d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            return C9546b.m37676c(p8, viewGroup, z10);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p615zt.InterfaceC14057n
        public /* bridge */ /* synthetic */ C9546b invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return m18027d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepFragment$b, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/integration/fragment/IntegrationStepFragment$b;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;", "props", "Lcom/withpersona/sdk2/inquiry/integration/fragment/IntegrationStepFragment;", "a", "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/integration/fragment/IntegrationStepFragment;", "integration_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepFragment.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final IntegrationStepFragment m18028a(@NotNull IntegrationWorkflow.Input props) {
            Intrinsics.checkNotNullParameter(props, "props");
            return (IntegrationStepFragment) C7811b.m32425a(new IntegrationStepFragment(), new IntegrationStepFragmentArgs(props));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepFragment$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepFragment$onViewCreated$1", m39664f = "IntegrationStepFragment.kt", m39665l = {73}, m39666m = "invokeSuspend")
    public static final class C3618c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f14383t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ C3626b f14384u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ IntegrationStepFragment f14385v;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepFragment$c$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ IntegrationStepFragment f14386a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C3626b f14387b;

            public a(IntegrationStepFragment integrationStepFragment, C3626b c3626b) {
                this.f14386a = integrationStepFragment;
                this.f14387b = c3626b;
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object; */
            @Override // nu.InterfaceC9577i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(IntegrationWorkflow.InterfaceC3611b interfaceC3611b, InterfaceC9557b<? super Unit> interfaceC9557b) {
                if (interfaceC3611b == null) {
                    return Unit.f29331a;
                }
                if (this.f14386a.currentOutputHandler != null) {
                    this.f14387b.m45394a().setValue(null);
                    Function1 function1 = this.f14386a.currentOutputHandler;
                    if (function1 != null) {
                        function1.invoke(interfaceC3611b);
                    }
                }
                return Unit.f29331a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3618c(C3626b c3626b, IntegrationStepFragment integrationStepFragment, InterfaceC9557b<? super C3618c> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f14384u = c3626b;
            this.f14385v = integrationStepFragment;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3618c(this.f14384u, this.f14385v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f14383t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9566c0<IntegrationWorkflow.InterfaceC3611b> interfaceC9566c0M45394a = this.f14384u.m45394a();
                a aVar = new a(this.f14385v, this.f14384u);
                this.f14383t = 1;
                if (interfaceC9566c0M45394a.collect(aVar, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            throw new C7334d();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3618c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepFragment$d */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3619d implements Function0<Bundle> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ComponentCallbacksC0929c f14388a;

        public C3619d(ComponentCallbacksC0929c componentCallbacksC0929c) {
            this.f14388a = componentCallbacksC0929c;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle bundleM4704t = this.f14388a.m4704t();
            if (bundleM4704t != null) {
                return bundleM4704t;
            }
            throw new IllegalStateException("Fragment " + this.f14388a + " has null arguments");
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepFragment$e */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3620e implements Function0<C0941a1.c> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ComponentCallbacksC0929c f14389a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f14390b;

        public C3620e(ComponentCallbacksC0929c componentCallbacksC0929c, Function1 function1) {
            this.f14389a = componentCallbacksC0929c;
            this.f14390b = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0941a1.c invoke() {
            return new C9845d(this.f14389a, this.f14390b);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepFragment$f */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/fragment/app/c;", "b", "()Landroidx/fragment/app/c;"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class C3621f extends AbstractC7746m implements Function0<ComponentCallbacksC0929c> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ ComponentCallbacksC0929c f14391i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3621f(ComponentCallbacksC0929c componentCallbacksC0929c) {
            super(0);
            this.f14391i = componentCallbacksC0929c;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ComponentCallbacksC0929c invoke() {
            return this.f14391i;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepFragment$g */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/c1;", "b", "()Landroidx/lifecycle/c1;"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class C3622g extends AbstractC7746m implements Function0<InterfaceC0947c1> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Function0 f14392i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3622g(Function0 function0) {
            super(0);
            this.f14392i = function0;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC0947c1 invoke() {
            return (InterfaceC0947c1) this.f14392i.invoke();
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepFragment$h */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/b1;", "b", "()Landroidx/lifecycle/b1;"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class C3623h extends AbstractC7746m implements Function0<C0944b1> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC7341h f14393i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3623h(InterfaceC7341h interfaceC7341h) {
            super(0);
            this.f14393i = interfaceC7341h;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C0944b1 invoke() {
            return C4822l0.m23349c(this.f14393i).mo4712w();
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepFragment$i */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Lk4/a;", "b", "()Lk4/a;"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class C3624i extends AbstractC7746m implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Function0 f14394i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ InterfaceC7341h f14395j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3624i(Function0 function0, InterfaceC7341h interfaceC7341h) {
            super(0);
            this.f14394i = function0;
            this.f14395j = interfaceC7341h;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f14394i;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            InterfaceC0947c1 interfaceC0947c1M23349c = C4822l0.m23349c(this.f14395j);
            InterfaceC0962j interfaceC0962j = interfaceC0947c1M23349c instanceof InterfaceC0962j ? (InterfaceC0962j) interfaceC0947c1M23349c : null;
            return interfaceC0962j != null ? interfaceC0962j.mo4653Z() : CreationExtras.b.f28722c;
        }
    }

    public IntegrationStepFragment() {
        super(C3616a.f14382a);
        this.viewEnvironment = C7342i.m30456b(new Function0() { // from class: yo.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IntegrationStepFragment.m18016s2(this.f46622a);
            }
        });
        C3620e c3620e = new C3620e(this, new Function1() { // from class: yo.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntegrationStepFragment.m18017t2(this.f46623a, (C0967l0) obj);
            }
        });
        InterfaceC7341h interfaceC7341hM30455a = C7342i.m30455a(EnumC7344k.NONE, new C3622g(new C3621f(this)));
        this.viewModel = C4822l0.m23348b(this, C7731d0.m32002b(C3628d.class), new C3623h(interfaceC7341hM30455a), new C3624i(null, interfaceC7341hM30455a), c3620e);
        this.args = new C7812c(C7731d0.m32002b(IntegrationStepFragmentArgs.class), new C3619d(this));
    }

    /* JADX INFO: renamed from: n2 */
    private final ViewEnvironment m18015n2() {
        return (ViewEnvironment) this.viewEnvironment.getValue();
    }

    /* JADX INFO: renamed from: s2 */
    public static final ViewEnvironment m18016s2(IntegrationStepFragment integrationStepFragment) {
        return new ViewEnvironment(C7688j0.m31791g(C7352s.m30477a(C12248b.f43285b, integrationStepFragment.m18019m2())));
    }

    /* JADX INFO: renamed from: t2 */
    public static final C3628d m18017t2(IntegrationStepFragment integrationStepFragment, C0967l0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return integrationStepFragment.m18021p2().mo18059a(it);
    }

    @Override // p341oq.AbstractC9844c, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: e1 */
    public void mo4667e1(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.mo4667e1(view, savedInstanceState);
        C3626b c3626bM18057e = m18020o2().m18057e(m18018l2().getProps());
        m38732g2(c3626bM18057e.m45396c());
        InterfaceC0980s interfaceC0980sM4680k0 = m4680k0();
        Intrinsics.checkNotNullExpressionValue(interfaceC0980sM4680k0, "getViewLifecycleOwner(...)");
        C7882k.m32780d(C0982t.m4979a(interfaceC0980sM4680k0), null, null, new C3618c(c3626bM18057e, this, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Args */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l2 */
    public final IntegrationStepFragmentArgs m18018l2() {
        return (IntegrationStepFragmentArgs) this.args.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: m2 */
    public final C12247a m18019m2() {
        C12247a c12247a = this.systemUiController;
        if (c12247a != null) {
            return c12247a;
        }
        Intrinsics.m31998u("systemUiController");
        return null;
    }

    /* JADX INFO: renamed from: o2 */
    public final C3628d m18020o2() {
        return (C3628d) this.viewModel.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: p2 */
    public final C3628d.a m18021p2() {
        C3628d.a aVar = this.viewModelFactory;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.m31998u("viewModelFactory");
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: h2(Ljava/lang/Object;)V */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p341oq.AbstractC9844c
    /* JADX INFO: renamed from: q2, reason: merged with bridge method [inline-methods] */
    public void mo16775h2(@NotNull IntegrationView rendering) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        View view = this.currentView;
        if (view != null) {
            if (view != null) {
                C0372e0.m1414g(view, rendering, m18015n2());
                return;
            }
            return;
        }
        InterfaceC0364a0<IntegrationView> interfaceC0364a0Mo1380a = rendering.mo1380a();
        ViewEnvironment viewEnvironmentM18015n2 = m18015n2();
        Context context = ((C9546b) m32421b2()).getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.currentView = interfaceC0364a0Mo1380a.mo1379a(rendering, viewEnvironmentM18015n2, context, ((C9546b) m32421b2()).getRoot());
        ((C9546b) m32421b2()).getRoot().addView(this.currentView);
        View view2 = this.currentView;
        if (view2 != null) {
            C0372e0.m1415h(view2);
        }
    }

    /* JADX INFO: renamed from: r2 */
    public final void m18023r2(@NotNull IntegrationWorkflow.Input input, @NotNull Function1<? super IntegrationWorkflow.InterfaceC3611b, Unit> handler) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(handler, "handler");
        m18020o2().m18058f(input);
        this.currentOutputHandler = handler;
    }
}
