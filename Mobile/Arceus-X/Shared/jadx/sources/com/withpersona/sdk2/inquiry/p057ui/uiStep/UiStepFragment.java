package com.withpersona.sdk2.inquiry.p057ui.uiStep;

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
import com.withpersona.sdk2.inquiry.p057ui.C4154g;
import com.withpersona.sdk2.inquiry.p057ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.p057ui.uiStep.UiStepFragment;
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
import p016an.ViewEnvironment;
import p093e4.C4822l0;
import p229jt.C7334d;
import p229jt.C7342i;
import p229jt.C7345l;
import p229jt.C7348o;
import p229jt.C7352s;
import p229jt.EnumC7344k;
import p229jt.InterfaceC7341h;
import p237k4.CreationExtras;
import p253kq.C7811b;
import p253kq.C7812c;
import p256ku.C7882k;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p341oq.AbstractC9844c;
import p341oq.C9845d;
import p344ot.C10047c;
import p421rr.C11091g1;
import p498vq.C12247a;
import p498vq.C12248b;
import p615zt.InterfaceC14057n;
import pr.C10317a;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 C2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002DEB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R!\u0010-\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010\u0005\u001a\u0004\b*\u0010+R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001b\u00108\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010)\u001a\u0004\b6\u00107R$\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010B\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006F"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment;", "Loq/c;", "Lpr/a;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "rendering", "r2", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c;)V", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;", "input", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b;", "handler", "q2", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lkotlin/jvm/functions/Function1;)V", "Lcom/withpersona/sdk2/inquiry/ui/uiStep/b$a;", "j0", "Lcom/withpersona/sdk2/inquiry/ui/uiStep/b$a;", "p2", "()Lcom/withpersona/sdk2/inquiry/ui/uiStep/b$a;", "setViewModelFactory", "(Lcom/withpersona/sdk2/inquiry/ui/uiStep/b$a;)V", "viewModelFactory", "Lvq/a;", "k0", "Lvq/a;", "m2", "()Lvq/a;", "setSystemUiController", "(Lvq/a;)V", "systemUiController", "Lan/y;", "l0", "Ljt/h;", "n2", "()Lan/y;", "getViewEnvironment$annotations", "viewEnvironment", "Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment$UiStepFragmentArgs;", "m0", "Lkq/c;", "l2", "()Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment$UiStepFragmentArgs;", "args", "Lcom/withpersona/sdk2/inquiry/ui/uiStep/b;", "n0", "o2", "()Lcom/withpersona/sdk2/inquiry/ui/uiStep/b;", "viewModel", "o0", "Lkotlin/jvm/functions/Function1;", "currentOutputHandler", "Lcom/withpersona/sdk2/inquiry/ui/g;", "p0", "Lcom/withpersona/sdk2/inquiry/ui/g;", "runner", "q0", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c;", "pendingRendering", "r0", "b", "UiStepFragmentArgs", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class UiStepFragment extends AbstractC9844c<C10317a, UiWorkflow.AbstractC4142c> {

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public C4191b.a viewModelFactory;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public C12247a systemUiController;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h viewEnvironment;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    @NotNull
    public final C7812c args;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h viewModel;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    @Nullable
    public Function1<? super UiWorkflow.InterfaceC4141b, Unit> currentOutputHandler;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    @Nullable
    public C4154g runner;

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    @Nullable
    public UiWorkflow.AbstractC4142c pendingRendering;

    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment$UiStepFragmentArgs;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;", "props", "<init>", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;", "()Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class UiStepFragmentArgs implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<UiStepFragmentArgs> CREATOR = new C4180a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final UiWorkflow.Input props;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment$UiStepFragmentArgs$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C4180a implements Parcelable.Creator<UiStepFragmentArgs> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UiStepFragmentArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UiStepFragmentArgs(UiWorkflow.Input.CREATOR.createFromParcel(parcel));
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
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

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class C4181a extends C7744k implements InterfaceC14057n<LayoutInflater, ViewGroup, Boolean, C10317a> {

        /* JADX INFO: renamed from: a */
        public static final C4181a f17886a = new C4181a();

        public C4181a() {
            super(3, C10317a.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/ui/databinding/Pi2InquiryUiBinding;", 0);
        }

        /* JADX INFO: renamed from: d */
        public final C10317a m21663d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            return C10317a.m39624d(p8, viewGroup, z10);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p615zt.InterfaceC14057n
        public /* bridge */ /* synthetic */ C10317a invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return m21663d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment$b, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment$b;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;", "props", "Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment;", "a", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment;", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final UiStepFragment m21664a(@NotNull UiWorkflow.Input props) {
            Intrinsics.checkNotNullParameter(props, "props");
            return (UiStepFragment) C7811b.m32425a(new UiStepFragment(), new UiStepFragmentArgs(props));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment$onViewCreated$1", m39664f = "UiStepFragment.kt", m39665l = {72}, m39666m = "invokeSuspend")
    public static final class C4183c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f17887t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ C11091g1 f17888u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ UiStepFragment f17889v;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment$c$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ UiStepFragment f17890a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C11091g1 f17891b;

            public a(UiStepFragment uiStepFragment, C11091g1 c11091g1) {
                this.f17890a = uiStepFragment;
                this.f17891b = c11091g1;
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object; */
            @Override // nu.InterfaceC9577i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(UiWorkflow.InterfaceC4141b interfaceC4141b, InterfaceC9557b<? super Unit> interfaceC9557b) {
                if (interfaceC4141b == null) {
                    return Unit.f29331a;
                }
                if (this.f17890a.currentOutputHandler != null) {
                    this.f17891b.m45394a().setValue(null);
                    Function1 function1 = this.f17890a.currentOutputHandler;
                    if (function1 != null) {
                        function1.invoke(interfaceC4141b);
                    }
                }
                return Unit.f29331a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4183c(C11091g1 c11091g1, UiStepFragment uiStepFragment, InterfaceC9557b<? super C4183c> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f17888u = c11091g1;
            this.f17889v = uiStepFragment;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C4183c(this.f17888u, this.f17889v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f17887t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9566c0<UiWorkflow.InterfaceC4141b> interfaceC9566c0M45394a = this.f17888u.m45394a();
                a aVar = new a(this.f17889v, this.f17888u);
                this.f17887t = 1;
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
            return ((C4183c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment$d */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C4184d implements Function0<Bundle> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ComponentCallbacksC0929c f17892a;

        public C4184d(ComponentCallbacksC0929c componentCallbacksC0929c) {
            this.f17892a = componentCallbacksC0929c;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle bundleM4704t = this.f17892a.m4704t();
            if (bundleM4704t != null) {
                return bundleM4704t;
            }
            throw new IllegalStateException("Fragment " + this.f17892a + " has null arguments");
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment$e */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C4185e implements Function0<C0941a1.c> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ComponentCallbacksC0929c f17893a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f17894b;

        public C4185e(ComponentCallbacksC0929c componentCallbacksC0929c, Function1 function1) {
            this.f17893a = componentCallbacksC0929c;
            this.f17894b = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0941a1.c invoke() {
            return new C9845d(this.f17893a, this.f17894b);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment$f */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/fragment/app/c;", "b", "()Landroidx/fragment/app/c;"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class C4186f extends AbstractC7746m implements Function0<ComponentCallbacksC0929c> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ ComponentCallbacksC0929c f17895i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4186f(ComponentCallbacksC0929c componentCallbacksC0929c) {
            super(0);
            this.f17895i = componentCallbacksC0929c;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ComponentCallbacksC0929c invoke() {
            return this.f17895i;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment$g */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/c1;", "b", "()Landroidx/lifecycle/c1;"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class C4187g extends AbstractC7746m implements Function0<InterfaceC0947c1> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Function0 f17896i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4187g(Function0 function0) {
            super(0);
            this.f17896i = function0;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC0947c1 invoke() {
            return (InterfaceC0947c1) this.f17896i.invoke();
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment$h */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/b1;", "b", "()Landroidx/lifecycle/b1;"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class C4188h extends AbstractC7746m implements Function0<C0944b1> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC7341h f17897i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4188h(InterfaceC7341h interfaceC7341h) {
            super(0);
            this.f17897i = interfaceC7341h;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C0944b1 invoke() {
            return C4822l0.m23349c(this.f17897i).mo4712w();
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment$i */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Lk4/a;", "b", "()Lk4/a;"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class C4189i extends AbstractC7746m implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Function0 f17898i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ InterfaceC7341h f17899j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4189i(Function0 function0, InterfaceC7341h interfaceC7341h) {
            super(0);
            this.f17898i = function0;
            this.f17899j = interfaceC7341h;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f17898i;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            InterfaceC0947c1 interfaceC0947c1M23349c = C4822l0.m23349c(this.f17899j);
            InterfaceC0962j interfaceC0962j = interfaceC0947c1M23349c instanceof InterfaceC0962j ? (InterfaceC0962j) interfaceC0947c1M23349c : null;
            return interfaceC0962j != null ? interfaceC0962j.mo4653Z() : CreationExtras.b.f28722c;
        }
    }

    public UiStepFragment() {
        super(C4181a.f17886a);
        this.viewEnvironment = C7342i.m30456b(new Function0() { // from class: sr.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UiStepFragment.m21652s2(this.f40459a);
            }
        });
        this.args = new C7812c(C7731d0.m32002b(UiStepFragmentArgs.class), new C4184d(this));
        C4185e c4185e = new C4185e(this, new Function1() { // from class: sr.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiStepFragment.m21653t2(this.f40460a, (C0967l0) obj);
            }
        });
        InterfaceC7341h interfaceC7341hM30455a = C7342i.m30455a(EnumC7344k.NONE, new C4187g(new C4186f(this)));
        this.viewModel = C4822l0.m23348b(this, C7731d0.m32002b(C4191b.class), new C4188h(interfaceC7341hM30455a), new C4189i(null, interfaceC7341hM30455a), c4185e);
    }

    /* JADX INFO: renamed from: n2 */
    private final ViewEnvironment m21651n2() {
        return (ViewEnvironment) this.viewEnvironment.getValue();
    }

    /* JADX INFO: renamed from: s2 */
    public static final ViewEnvironment m21652s2(UiStepFragment uiStepFragment) {
        return new ViewEnvironment(C7688j0.m31791g(C7352s.m30477a(C12248b.f43285b, uiStepFragment.m21655m2())));
    }

    /* JADX INFO: renamed from: t2 */
    public static final C4191b m21653t2(UiStepFragment uiStepFragment, C0967l0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return uiStepFragment.m21657p2().mo21676a(it, uiStepFragment.m21654l2().getProps());
    }

    @Override // p341oq.AbstractC9844c, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: e1 */
    public void mo4667e1(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.mo4667e1(view, savedInstanceState);
        C11091g1 uiStepStateManager = m21656o2().getUiStepStateManager();
        m38732g2(uiStepStateManager.m45396c());
        InterfaceC0980s interfaceC0980sM4680k0 = m4680k0();
        Intrinsics.checkNotNullExpressionValue(interfaceC0980sM4680k0, "getViewLifecycleOwner(...)");
        C7882k.m32780d(C0982t.m4979a(interfaceC0980sM4680k0), null, null, new C4183c(uiStepStateManager, this, null), 3, null);
        UiWorkflow.AbstractC4142c abstractC4142c = this.pendingRendering;
        if (abstractC4142c != null) {
            mo16775h2(abstractC4142c);
        }
        this.pendingRendering = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Args */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l2 */
    public final UiStepFragmentArgs m21654l2() {
        return (UiStepFragmentArgs) this.args.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: m2 */
    public final C12247a m21655m2() {
        C12247a c12247a = this.systemUiController;
        if (c12247a != null) {
            return c12247a;
        }
        Intrinsics.m31998u("systemUiController");
        return null;
    }

    /* JADX INFO: renamed from: o2 */
    public final C4191b m21656o2() {
        return (C4191b) this.viewModel.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: p2 */
    public final C4191b.a m21657p2() {
        C4191b.a aVar = this.viewModelFactory;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.m31998u("viewModelFactory");
        return null;
    }

    /* JADX INFO: renamed from: q2 */
    public final void m21658q2(@NotNull UiWorkflow.Input input, @NotNull Function1<? super UiWorkflow.InterfaceC4141b, Unit> handler) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(handler, "handler");
        m21656o2().m21675f(input);
        this.currentOutputHandler = handler;
    }

    /* JADX DEBUG: Method merged with bridge method: h2(Ljava/lang/Object;)V */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p341oq.AbstractC9844c
    /* JADX INFO: renamed from: r2, reason: merged with bridge method [inline-methods] */
    public void mo16775h2(@NotNull UiWorkflow.AbstractC4142c rendering) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        if (!m32423d2()) {
            this.pendingRendering = rendering;
            return;
        }
        if (!(rendering instanceof UiWorkflow.AbstractC4142c.a)) {
            throw new C7345l();
        }
        C4154g c4154g = this.runner;
        if (c4154g == null) {
            c4154g = new C4154g((C10317a) m32421b2(), (UiWorkflow.AbstractC4142c.a) rendering);
            this.runner = c4154g;
        }
        c4154g.mo1442a((UiWorkflow.AbstractC4142c.a) rendering, m21651n2());
    }
}
