package com.withpersona.sdk2.inquiry.selfie.selfieStep;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraAccessException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ComponentCallbacksC0929c;
import androidx.p616lifecycle.C0941a1;
import androidx.p616lifecycle.C0944b1;
import androidx.p616lifecycle.C0967l0;
import androidx.p616lifecycle.C0982t;
import androidx.p616lifecycle.InterfaceC0947c1;
import androidx.p616lifecycle.InterfaceC0962j;
import androidx.p616lifecycle.InterfaceC0980s;
import aq.C1137a;
import aq.C1140d;
import aq.C1141e;
import aq.C1142f;
import aq.C1144h;
import ar.C1152g;
import ar.C1164s;
import ar.ComponentView;
import ar.InterfaceC1151f;
import com.withpersona.sdk2.camera.C3402b;
import com.withpersona.sdk2.camera.C3405e;
import com.withpersona.sdk2.camera.C3407g;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.selfie.C3941c;
import com.withpersona.sdk2.inquiry.selfie.C3956h;
import com.withpersona.sdk2.inquiry.selfie.C3959k;
import com.withpersona.sdk2.inquiry.selfie.C3960l;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment;
import com.withpersona.sdk2.inquiry.steps.p056ui.UiComponentScreen;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import gq.C6208c;
import gq.C6211f;
import gq.InterfaceC6212g;
import hn.C6434c;
import hn.C6441f0;
import hn.CameraChoices;
import hn.EnumC6455m0;
import java.util.Map;
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
import mn.EnumC8598a;
import nu.InterfaceC9566c0;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.ViewEnvironment;
import p061ct.InterfaceC4364a;
import p093e4.C4822l0;
import p112eq.C5180a;
import p112eq.C5190k;
import p132fn.AbstractC5685h;
import p132fn.C5688i0;
import p132fn.C5698n0;
import p132fn.InterfaceC5683g;
import p132fn.InterfaceC5707s;
import p134fq.C5772k2;
import p152go.C6153a0;
import p152go.C6159e;
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
import p313nq.C9546b;
import p315nt.InterfaceC9557b;
import p341oq.AbstractC9844c;
import p341oq.C9845d;
import p344ot.C10047c;
import p498vq.C12247a;
import p498vq.C12248b;
import p523wn.C12495a;
import p523wn.EnumC12498d;
import p526wq.C12524g;
import p584yp.EnumC13272a;
import p611zp.C14011k0;
import p611zp.C14022q;
import p611zp.InterfaceC14025r0;
import p615zt.InterfaceC14057n;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 ~2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u007f\u0080\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b%\u0010&J)\u0010,\u001a\u00020$2\u0006\u0010(\u001a\u00020'2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020$0)¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020$2\u0006\u0010.\u001a\u00020\u0003H\u0014¢\u0006\u0004\b/\u00100R\u001b\u00106\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001b\u0010D\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR$\u0010G\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020$\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010J\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\"\u0010V\u001a\u00020O8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR(\u0010_\u001a\b\u0012\u0004\u0012\u00020X0W8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010o\u001a\u00020h8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010w\u001a\u00020p8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR!\u0010}\u001a\u00020x8BX\u0082\u0084\u0002¢\u0006\u0012\n\u0004\by\u0010A\u0012\u0004\b|\u0010\u0005\u001a\u0004\bz\u0010{¨\u0006\u0081\u0001"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;", "Loq/c;", "Laq/h;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/selfie/h;", "s2", "()Lcom/withpersona/sdk2/inquiry/selfie/h;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;", "initialRendering", "Lzp/k0;", "p2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;)Lzp/k0;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;", "Lcom/withpersona/sdk2/inquiry/selfie/c;", "r2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;)Lcom/withpersona/sdk2/inquiry/selfie/c;", "Lcom/withpersona/sdk2/inquiry/selfie/l;", "x2", "()Lcom/withpersona/sdk2/inquiry/selfie/l;", "Lcom/withpersona/sdk2/inquiry/selfie/k;", "w2", "()Lcom/withpersona/sdk2/inquiry/selfie/k;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;", "Lgq/f;", "y2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;)Lgq/f;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$d;", "Leq/a;", "t2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$d;)Leq/a;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "props", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;", "handler", "J2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lkotlin/jvm/functions/Function1;)V", "rendering", "K2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;)V", "Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment$SelfieStepFragmentArgs;", "j0", "Lkq/c;", "A2", "()Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment$SelfieStepFragmentArgs;", "args", "Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/b$a;", "k0", "Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/b$a;", "I2", "()Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/b$a;", "setViewModelFactory", "(Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/b$a;)V", "viewModelFactory", "Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/b;", "l0", "Ljt/h;", "H2", "()Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/b;", "viewModel", "m0", "Lkotlin/jvm/functions/Function1;", "currentOutputHandler", "n0", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "pendingRendering", "", "o0", "Ljava/lang/Object;", "currentRenderer", "Lcom/withpersona/sdk2/camera/b;", "p0", "Lcom/withpersona/sdk2/camera/b;", "B2", "()Lcom/withpersona/sdk2/camera/b;", "setCameraPreview", "(Lcom/withpersona/sdk2/camera/b;)V", "cameraPreview", "Lct/a;", "Lfn/n0;", "q0", "Lct/a;", "D2", "()Lct/a;", "setSelfieDirectionFeed", "(Lct/a;)V", "selfieDirectionFeed", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "r0", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "F2", "()Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "setTrackingEventsLogger", "(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "trackingEventsLogger", "Lvq/a;", "s0", "Lvq/a;", "E2", "()Lvq/a;", "setSystemUiController", "(Lvq/a;)V", "systemUiController", "Lgo/e;", "t0", "Lgo/e;", "C2", "()Lgo/e;", "setFeatureFlagManager", "(Lgo/e;)V", "featureFlagManager", "Lan/y;", "u0", "G2", "()Lan/y;", "getViewEnvironment$annotations", "viewEnvironment", "v0", "b", "SelfieStepFragmentArgs", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class SelfieStepFragment extends AbstractC9844c<C1144h, SelfieWorkflow.AbstractC3928c> {

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    @NotNull
    public final C7812c args;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public C3982b.a viewModelFactory;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h viewModel;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    @Nullable
    public Function1<? super SelfieWorkflow.AbstractC3927b, Unit> currentOutputHandler;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    @Nullable
    public SelfieWorkflow.AbstractC3928c pendingRendering;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    @Nullable
    public Object currentRenderer;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public C3402b cameraPreview;

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    public InterfaceC4364a<C5698n0> selfieDirectionFeed;

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    public TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: s0, reason: from kotlin metadata */
    public C12247a systemUiController;

    /* JADX INFO: renamed from: t0, reason: from kotlin metadata */
    public C6159e featureFlagManager;

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h viewEnvironment;

    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment$SelfieStepFragmentArgs;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "props", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class SelfieStepFragmentArgs implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SelfieStepFragmentArgs> CREATOR = new C3968a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final SelfieWorkflow.Input props;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment$SelfieStepFragmentArgs$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3968a implements Parcelable.Creator<SelfieStepFragmentArgs> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SelfieStepFragmentArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelfieStepFragmentArgs(SelfieWorkflow.Input.CREATOR.createFromParcel(parcel));
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SelfieStepFragmentArgs[] newArray(int i10) {
                return new SelfieStepFragmentArgs[i10];
            }
        }

        public SelfieStepFragmentArgs(@NotNull SelfieWorkflow.Input props) {
            Intrinsics.checkNotNullParameter(props, "props");
            this.props = props;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final SelfieWorkflow.Input getProps() {
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

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class C3969a extends C7744k implements InterfaceC14057n<LayoutInflater, ViewGroup, Boolean, C1144h> {

        /* JADX INFO: renamed from: a */
        public static final C3969a f16725a = new C3969a();

        public C3969a() {
            super(3, C1144h.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieStepBinding;", 0);
        }

        /* JADX INFO: renamed from: d */
        public final C1144h m20238d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            return C1144h.m6483c(p8, viewGroup, z10);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p615zt.InterfaceC14057n
        public /* bridge */ /* synthetic */ C1144h invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return m20238d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment$b, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment$b;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "props", "Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;", "a", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final SelfieStepFragment m20239a(@NotNull SelfieWorkflow.Input props) {
            Intrinsics.checkNotNullParameter(props, "props");
            return (SelfieStepFragment) C7811b.m32425a(new SelfieStepFragment(), new SelfieStepFragmentArgs(props));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment$c */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class C3971c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16726a;

        static {
            int[] iArr = new int[EnumC13272a.values().length];
            try {
                iArr[EnumC13272a.V0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC13272a.V1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC13272a.K0000.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16726a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment$d */
    @Metadata(m31664d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31665d2 = {"com/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment$d", "Lfn/s;", "", "a", "()V", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3972d implements InterfaceC5707s {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1137a f16728b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ SelfieWorkflow.AbstractC3928c.c f16729c;

        public C3972d(C1137a c1137a, SelfieWorkflow.AbstractC3928c.c cVar) {
            this.f16728b = c1137a;
            this.f16729c = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public static final Unit m20241c(SelfieWorkflow.AbstractC3928c.c cVar, AbstractC5685h it) {
            Intrinsics.checkNotNullParameter(it, "it");
            cVar.m19845i().invoke(it);
            return Unit.f29331a;
        }

        @Override // p132fn.InterfaceC5707s
        /* JADX INFO: renamed from: a */
        public void mo17506a() {
            C3402b c3402bM20219B2 = SelfieStepFragment.this.m20219B2();
            PreviewView previewviewSelfieCamera = this.f16728b.f4679k;
            Intrinsics.checkNotNullExpressionValue(previewviewSelfieCamera, "previewviewSelfieCamera");
            C3402b.a aVar = C3402b.a.FRONT;
            C5698n0 c5698n0 = SelfieStepFragment.this.m20221D2().get();
            final SelfieWorkflow.AbstractC3928c.c cVar = this.f16729c;
            C3402b.m16195g(c3402bM20219B2, previewviewSelfieCamera, aVar, c5698n0, true, false, new Function1() { // from class: eq.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieStepFragment.C3972d.m20241c(cVar, (AbstractC5685h) obj);
                }
            }, 16, null);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment$e */
    @Metadata(m31664d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"com/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment$e", "Lar/f;", "rendering", "Lvq/a;", "systemUiController", "", "b", "(Ljava/lang/Object;Lvq/a;)V", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3973e implements InterfaceC1151f<SelfieWorkflow.AbstractC3928c.d> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ UiComponentScreen f16730b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C9546b f16731c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC14057n f16732d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C1152g f16733e;

        public C3973e(UiComponentScreen uiComponentScreen, C9546b c9546b, InterfaceC14057n interfaceC14057n, C1152g c1152g) {
            this.f16730b = uiComponentScreen;
            this.f16731c = c9546b;
            this.f16732d = interfaceC14057n;
            this.f16733e = c1152g;
        }

        @Override // ar.InterfaceC1151f
        /* JADX INFO: renamed from: b */
        public void mo6493b(SelfieWorkflow.AbstractC3928c.d rendering, C12247a systemUiController) {
            Intrinsics.checkNotNullParameter(rendering, "rendering");
            Integer numM20526i = this.f16730b.m20526i();
            if (numM20526i != null) {
                C9546b c9546b = this.f16731c;
                int iIntValue = numM20526i.intValue();
                c9546b.getRoot().setBackgroundColor(iIntValue);
                if (systemUiController != null) {
                    Context context = c9546b.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    systemUiController.m45389a(context, iIntValue);
                }
            }
            UiComponentScreen uiComponentScreen = this.f16730b;
            Context context2 = this.f16731c.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Drawable drawableM20524a = uiComponentScreen.m20524a(context2);
            if (drawableM20524a != null) {
                C9546b c9546b2 = this.f16731c;
                c9546b2.getRoot().setBackground(drawableM20524a);
                c9546b2.f34504d.setBackgroundColor(0);
            }
            this.f16732d.invoke(this.f16731c, rendering, this.f16733e.getViewBindings().m6497a());
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment$f */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment$onViewCreated$1", m39664f = "SelfieStepFragment.kt", m39665l = {117}, m39666m = "invokeSuspend")
    public static final class C3974f extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f16734t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ C5772k2 f16735u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ SelfieStepFragment f16736v;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment$f$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ SelfieStepFragment f16737a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C5772k2 f16738b;

            public a(SelfieStepFragment selfieStepFragment, C5772k2 c5772k2) {
                this.f16737a = selfieStepFragment;
                this.f16738b = c5772k2;
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object; */
            @Override // nu.InterfaceC9577i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(SelfieWorkflow.AbstractC3927b abstractC3927b, InterfaceC9557b<? super Unit> interfaceC9557b) {
                if (abstractC3927b == null) {
                    return Unit.f29331a;
                }
                if (this.f16737a.currentOutputHandler != null) {
                    this.f16738b.m45394a().setValue(null);
                    Function1 function1 = this.f16737a.currentOutputHandler;
                    if (function1 != null) {
                        function1.invoke(abstractC3927b);
                    }
                }
                return Unit.f29331a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3974f(C5772k2 c5772k2, SelfieStepFragment selfieStepFragment, InterfaceC9557b<? super C3974f> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f16735u = c5772k2;
            this.f16736v = selfieStepFragment;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3974f(this.f16735u, this.f16736v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f16734t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9566c0<SelfieWorkflow.AbstractC3927b> interfaceC9566c0M45394a = this.f16735u.m45394a();
                a aVar = new a(this.f16736v, this.f16735u);
                this.f16734t = 1;
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
            return ((C3974f) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment$g */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3975g implements Function0<Bundle> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ComponentCallbacksC0929c f16739a;

        public C3975g(ComponentCallbacksC0929c componentCallbacksC0929c) {
            this.f16739a = componentCallbacksC0929c;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle bundleM4704t = this.f16739a.m4704t();
            if (bundleM4704t != null) {
                return bundleM4704t;
            }
            throw new IllegalStateException("Fragment " + this.f16739a + " has null arguments");
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment$h */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3976h implements Function0<C0941a1.c> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ComponentCallbacksC0929c f16740a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f16741b;

        public C3976h(ComponentCallbacksC0929c componentCallbacksC0929c, Function1 function1) {
            this.f16740a = componentCallbacksC0929c;
            this.f16741b = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0941a1.c invoke() {
            return new C9845d(this.f16740a, this.f16741b);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment$i */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/fragment/app/c;", "b", "()Landroidx/fragment/app/c;"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class C3977i extends AbstractC7746m implements Function0<ComponentCallbacksC0929c> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ ComponentCallbacksC0929c f16742i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3977i(ComponentCallbacksC0929c componentCallbacksC0929c) {
            super(0);
            this.f16742i = componentCallbacksC0929c;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ComponentCallbacksC0929c invoke() {
            return this.f16742i;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment$j */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/c1;", "b", "()Landroidx/lifecycle/c1;"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class C3978j extends AbstractC7746m implements Function0<InterfaceC0947c1> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Function0 f16743i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3978j(Function0 function0) {
            super(0);
            this.f16743i = function0;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC0947c1 invoke() {
            return (InterfaceC0947c1) this.f16743i.invoke();
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment$k */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/b1;", "b", "()Landroidx/lifecycle/b1;"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class C3979k extends AbstractC7746m implements Function0<C0944b1> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC7341h f16744i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3979k(InterfaceC7341h interfaceC7341h) {
            super(0);
            this.f16744i = interfaceC7341h;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C0944b1 invoke() {
            return C4822l0.m23349c(this.f16744i).mo4712w();
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment$l */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Lk4/a;", "b", "()Lk4/a;"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class C3980l extends AbstractC7746m implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Function0 f16745i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ InterfaceC7341h f16746j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3980l(Function0 function0, InterfaceC7341h interfaceC7341h) {
            super(0);
            this.f16745i = function0;
            this.f16746j = interfaceC7341h;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f16745i;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            InterfaceC0947c1 interfaceC0947c1M23349c = C4822l0.m23349c(this.f16746j);
            InterfaceC0962j interfaceC0962j = interfaceC0947c1M23349c instanceof InterfaceC0962j ? (InterfaceC0962j) interfaceC0947c1M23349c : null;
            return interfaceC0962j != null ? interfaceC0962j.mo4653Z() : CreationExtras.b.f28722c;
        }
    }

    public SelfieStepFragment() {
        super(C3969a.f16725a);
        this.args = new C7812c(C7731d0.m32002b(SelfieStepFragmentArgs.class), new C3975g(this));
        C3976h c3976h = new C3976h(this, new Function1() { // from class: eq.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieStepFragment.m20206M2(this.f20200a, (C0967l0) obj);
            }
        });
        InterfaceC7341h interfaceC7341hM30455a = C7342i.m30455a(EnumC7344k.NONE, new C3978j(new C3977i(this)));
        this.viewModel = C4822l0.m23348b(this, C7731d0.m32002b(C3982b.class), new C3979k(interfaceC7341hM30455a), new C3980l(null, interfaceC7341hM30455a), c3976h);
        this.viewEnvironment = C7342i.m30456b(new Function0() { // from class: eq.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieStepFragment.m20205L2(this.f20201a);
            }
        });
    }

    /* JADX INFO: renamed from: G2 */
    private final ViewEnvironment m20204G2() {
        return (ViewEnvironment) this.viewEnvironment.getValue();
    }

    /* JADX INFO: renamed from: L2 */
    public static final ViewEnvironment m20205L2(SelfieStepFragment selfieStepFragment) {
        return new ViewEnvironment(C7688j0.m31791g(C7352s.m30477a(C12248b.f43285b, selfieStepFragment.m20222E2())));
    }

    /* JADX INFO: renamed from: M2 */
    public static final C3982b m20206M2(SelfieStepFragment selfieStepFragment, C0967l0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return selfieStepFragment.m20225I2().mo20257a(it, selfieStepFragment.m20218A2().getProps());
    }

    /* JADX INFO: renamed from: q2 */
    public static final InterfaceC14025r0 m20214q2(Context context, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new C14022q(context, viewGroup);
    }

    /* JADX INFO: renamed from: u2 */
    public static final Unit m20215u2(C9546b pendingBinding, Map map) {
        Intrinsics.checkNotNullParameter(pendingBinding, "pendingBinding");
        Intrinsics.checkNotNullParameter(map, "<unused var>");
        ConstraintLayout root = pendingBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        C12524g.m46873d(root, false, false, false, false, 15, null);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: v2 */
    public static final Unit m20216v2(C9546b pendingBinding, SelfieWorkflow.AbstractC3928c.d pendingRendering, Map map) {
        Intrinsics.checkNotNullParameter(pendingBinding, "pendingBinding");
        Intrinsics.checkNotNullParameter(pendingRendering, "pendingRendering");
        Intrinsics.checkNotNullParameter(map, "<unused var>");
        C5190k.m24083d(pendingBinding, pendingRendering);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: z2 */
    public static final InterfaceC6212g m20217z2(Context context, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new C6208c(context, viewGroup);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Args */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A2 */
    public final SelfieStepFragmentArgs m20218A2() {
        return (SelfieStepFragmentArgs) this.args.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: B2 */
    public final C3402b m20219B2() {
        C3402b c3402b = this.cameraPreview;
        if (c3402b != null) {
            return c3402b;
        }
        Intrinsics.m31998u("cameraPreview");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: C2 */
    public final C6159e m20220C2() {
        C6159e c6159e = this.featureFlagManager;
        if (c6159e != null) {
            return c6159e;
        }
        Intrinsics.m31998u("featureFlagManager");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: D2 */
    public final InterfaceC4364a<C5698n0> m20221D2() {
        InterfaceC4364a<C5698n0> interfaceC4364a = this.selfieDirectionFeed;
        if (interfaceC4364a != null) {
            return interfaceC4364a;
        }
        Intrinsics.m31998u("selfieDirectionFeed");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: E2 */
    public final C12247a m20222E2() {
        C12247a c12247a = this.systemUiController;
        if (c12247a != null) {
            return c12247a;
        }
        Intrinsics.m31998u("systemUiController");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: F2 */
    public final TrackingEventsLogger m20223F2() {
        TrackingEventsLogger trackingEventsLogger = this.trackingEventsLogger;
        if (trackingEventsLogger != null) {
            return trackingEventsLogger;
        }
        Intrinsics.m31998u("trackingEventsLogger");
        return null;
    }

    /* JADX INFO: renamed from: H2 */
    public final C3982b m20224H2() {
        return (C3982b) this.viewModel.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: I2 */
    public final C3982b.a m20225I2() {
        C3982b.a aVar = this.viewModelFactory;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.m31998u("viewModelFactory");
        return null;
    }

    /* JADX INFO: renamed from: J2 */
    public final void m20226J2(@NotNull SelfieWorkflow.Input props, @NotNull Function1<? super SelfieWorkflow.AbstractC3927b, Unit> handler) {
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(handler, "handler");
        m20224H2().m20256f(props);
        this.currentOutputHandler = handler;
    }

    /* JADX DEBUG: Method merged with bridge method: h2(Ljava/lang/Object;)V */
    @Override // p341oq.AbstractC9844c
    /* JADX INFO: renamed from: K2, reason: merged with bridge method [inline-methods] */
    public void mo16775h2(@NotNull SelfieWorkflow.AbstractC3928c rendering) throws CameraAccessException {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        if (!m32423d2()) {
            this.pendingRendering = rendering;
            return;
        }
        if (rendering instanceof SelfieWorkflow.AbstractC3928c.b) {
            Object obj = this.currentRenderer;
            C3956h c3956hM20230s2 = obj instanceof C3956h ? (C3956h) obj : null;
            if (c3956hM20230s2 == null) {
                c3956hM20230s2 = m20230s2();
            }
            c3956hM20230s2.m20074h((SelfieWorkflow.AbstractC3928c.b) rendering, m20222E2());
            this.currentRenderer = c3956hM20230s2;
            return;
        }
        if (rendering instanceof SelfieWorkflow.AbstractC3928c.a) {
            Object obj2 = this.currentRenderer;
            C14011k0 c14011k0M20228p2 = obj2 instanceof C14011k0 ? (C14011k0) obj2 : null;
            if (c14011k0M20228p2 == null) {
                c14011k0M20228p2 = m20228p2((SelfieWorkflow.AbstractC3928c.a) rendering);
            }
            c14011k0M20228p2.m50620I((SelfieWorkflow.AbstractC3928c.a) rendering, m20222E2());
            this.currentRenderer = c14011k0M20228p2;
            return;
        }
        if (rendering instanceof SelfieWorkflow.AbstractC3928c.c) {
            Object obj3 = this.currentRenderer;
            C3941c c3941cM20229r2 = obj3 instanceof C3941c ? (C3941c) obj3 : null;
            if (c3941cM20229r2 == null) {
                c3941cM20229r2 = m20229r2((SelfieWorkflow.AbstractC3928c.c) rendering);
            }
            c3941cM20229r2.mo1442a((SelfieWorkflow.AbstractC3928c.c) rendering, m20204G2());
            this.currentRenderer = c3941cM20229r2;
            return;
        }
        if (rendering instanceof SelfieWorkflow.AbstractC3928c.e) {
            Object obj4 = this.currentRenderer;
            C3959k c3959kM20232w2 = obj4 instanceof C3959k ? (C3959k) obj4 : null;
            if (c3959kM20232w2 == null) {
                c3959kM20232w2 = m20232w2();
            }
            c3959kM20232w2.mo1442a((SelfieWorkflow.AbstractC3928c.e) rendering, m20204G2());
            this.currentRenderer = c3959kM20232w2;
            return;
        }
        if (rendering instanceof SelfieWorkflow.AbstractC3928c.f) {
            Object obj5 = this.currentRenderer;
            C3960l c3960lM20233x2 = obj5 instanceof C3960l ? (C3960l) obj5 : null;
            if (c3960lM20233x2 == null) {
                c3960lM20233x2 = m20233x2();
            }
            c3960lM20233x2.mo1442a((SelfieWorkflow.AbstractC3928c.f) rendering, m20204G2());
            this.currentRenderer = c3960lM20233x2;
            return;
        }
        if (rendering instanceof SelfieWorkflow.AbstractC3928c.g) {
            Object obj6 = this.currentRenderer;
            C6211f c6211fM20234y2 = obj6 instanceof C6211f ? (C6211f) obj6 : null;
            if (c6211fM20234y2 == null) {
                c6211fM20234y2 = m20234y2((SelfieWorkflow.AbstractC3928c.g) rendering);
            }
            c6211fM20234y2.mo1442a((SelfieWorkflow.AbstractC3928c.g) rendering, m20204G2());
            this.currentRenderer = c6211fM20234y2;
            return;
        }
        if (!(rendering instanceof SelfieWorkflow.AbstractC3928c.d)) {
            throw new C7345l();
        }
        Object obj7 = this.currentRenderer;
        C5180a c5180aM20231t2 = obj7 instanceof C5180a ? (C5180a) obj7 : null;
        if (c5180aM20231t2 == null) {
            c5180aM20231t2 = m20231t2((SelfieWorkflow.AbstractC3928c.d) rendering);
        }
        c5180aM20231t2.mo6493b((SelfieWorkflow.AbstractC3928c.d) rendering, m20222E2());
        this.currentRenderer = c5180aM20231t2;
    }

    @Override // p341oq.AbstractC9844c, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: e1 */
    public void mo4667e1(@NotNull View view, @Nullable Bundle savedInstanceState) throws CameraAccessException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.mo4667e1(view, savedInstanceState);
        C5772k2 selfieStepStateManager = m20224H2().getSelfieStepStateManager();
        m38732g2(selfieStepStateManager.m45396c());
        InterfaceC0980s interfaceC0980sM4680k0 = m4680k0();
        Intrinsics.checkNotNullExpressionValue(interfaceC0980sM4680k0, "getViewLifecycleOwner(...)");
        C7882k.m32780d(C0982t.m4979a(interfaceC0980sM4680k0), null, null, new C3974f(selfieStepStateManager, this, null), 3, null);
        SelfieWorkflow.AbstractC3928c abstractC3928c = this.pendingRendering;
        if (abstractC3928c != null) {
            mo16775h2(abstractC3928c);
        }
        this.pendingRendering = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r9v12, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r9v9, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p2 */
    public final C14011k0 m20228p2(SelfieWorkflow.AbstractC3928c.a initialRendering) {
        EnumC12498d enumC12498d;
        Context context = ((C1144h) m32421b2()).f4752b.getContext();
        C12495a.a aVarM46814c = C12495a.f44667a.m46814c(InterfaceC14025r0.a.class, new InterfaceC14025r0.a() { // from class: eq.b
            @Override // p611zp.InterfaceC14025r0.a
            /* JADX INFO: renamed from: a */
            public final InterfaceC14025r0 mo24078a(Context context2, ViewGroup viewGroup) {
                return SelfieStepFragment.m20214q2(context2, viewGroup);
            }
        });
        int i10 = C3971c.f16726a[initialRendering.getDesignVersion().ordinal()];
        if (i10 == 1) {
            throw new IllegalStateException("Invalid design version.");
        }
        if (i10 == 2) {
            enumC12498d = EnumC12498d.DefaultSelfie;
        } else {
            if (i10 != 3) {
                throw new C7345l();
            }
            enumC12498d = EnumC12498d.K0000SelfieCapture;
        }
        InterfaceC14025r0.a aVar = (InterfaceC14025r0.a) aVarM46814c.m46815a(enumC12498d);
        Intrinsics.checkNotNull(context);
        InterfaceC14025r0 interfaceC14025r0Mo24078a = aVar.mo24078a(context, ((C1144h) m32421b2()).f4752b);
        ((C1144h) m32421b2()).f4752b.removeAllViews();
        ((C1144h) m32421b2()).f4752b.addView(interfaceC14025r0Mo24078a.getRoot());
        C3402b c3402bM20219B2 = m20219B2();
        C5698n0 c5698n0 = m20221D2().get();
        Intrinsics.checkNotNullExpressionValue(c5698n0, "get(...)");
        return new C14011k0(context, interfaceC14025r0Mo24078a, c3402bM20219B2, c5698n0, m20223F2(), m20220C2().m27145a(C6153a0.f23514a));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r2 */
    public final C3941c m20229r2(SelfieWorkflow.AbstractC3928c.c initialRendering) throws CameraAccessException {
        InterfaceC5683g interfaceC5683gMo16229a;
        Context context = ((C1144h) m32421b2()).getRoot().getContext();
        C1137a c1137aM6462c = C1137a.m6462c(LayoutInflater.from(context));
        if (initialRendering.getVideoCaptureMethod() != EnumC8598a.None) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            CameraChoices cameraChoicesM28079b = C6441f0.m28079b(applicationContext, EnumC6455m0.FRONT);
            if (cameraChoicesM28079b == null) {
                initialRendering.m19845i().invoke(new C5688i0());
                Camera2PreviewView camera2Preview = c1137aM6462c.f4671c;
                Intrinsics.checkNotNullExpressionValue(camera2Preview, "camera2Preview");
                interfaceC5683gMo16229a = new C3407g(camera2Preview);
            } else {
                C6434c.a camera2ControllerFactory = initialRendering.getCamera2ControllerFactory();
                Camera2PreviewView camera2Preview2 = c1137aM6462c.f4671c;
                Intrinsics.checkNotNullExpressionValue(camera2Preview2, "camera2Preview");
                C5698n0 c5698n0 = m20221D2().get();
                Intrinsics.checkNotNullExpressionValue(c5698n0, "get(...)");
                interfaceC5683gMo16229a = camera2ControllerFactory.mo28063a(cameraChoicesM28079b, camera2Preview2, c5698n0, EnumC8598a.valueOf(initialRendering.getVideoCaptureMethod().toString()), initialRendering.getWebRtcManager(), initialRendering.getIsAudioRequired());
            }
        } else {
            C3405e.a cameraXControllerFactory = initialRendering.getCameraXControllerFactory();
            C3402b c3402bM20219B2 = m20219B2();
            PreviewView previewviewSelfieCamera = c1137aM6462c.f4679k;
            Intrinsics.checkNotNullExpressionValue(previewviewSelfieCamera, "previewviewSelfieCamera");
            interfaceC5683gMo16229a = cameraXControllerFactory.mo16229a(c3402bM20219B2, previewviewSelfieCamera, new C3972d(c1137aM6462c, initialRendering), initialRendering.getIsAudioRequired());
        }
        ((C1144h) m32421b2()).f4752b.removeAllViews();
        ((C1144h) m32421b2()).f4752b.addView(c1137aM6462c.getRoot());
        Intrinsics.checkNotNull(c1137aM6462c);
        C5698n0 c5698n1 = m20221D2().get();
        Intrinsics.checkNotNullExpressionValue(c5698n1, "get(...)");
        return new C3941c(c1137aM6462c, interfaceC5683gMo16229a, c5698n1, m20223F2());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s2 */
    public final C3956h m20230s2() {
        ((C1144h) m32421b2()).f4752b.removeAllViews();
        C1141e c1141eM6474c = C1141e.m6474c(LayoutInflater.from(mo4715x()), ((C1144h) m32421b2()).f4752b, true);
        Intrinsics.checkNotNullExpressionValue(c1141eM6474c, "inflate(...)");
        return new C3956h(c1141eM6474c);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t2 */
    public final C5180a m20231t2(SelfieWorkflow.AbstractC3928c.d initialRendering) {
        C1164s c1164s = C1164s.f4917a;
        FrameLayout content = ((C1144h) m32421b2()).f4752b;
        Intrinsics.checkNotNullExpressionValue(content, "content");
        UiComponentScreen uiScreen = initialRendering.getUiScreen();
        Function2<? super C9546b, ? super Map<String, ComponentView>, Unit> function2 = new Function2() { // from class: eq.f
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SelfieStepFragment.m20215u2((C9546b) obj, (Map) obj2);
            }
        };
        InterfaceC14057n interfaceC14057n = new InterfaceC14057n() { // from class: eq.g
            @Override // p615zt.InterfaceC14057n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SelfieStepFragment.m20216v2((C9546b) obj, (SelfieWorkflow.AbstractC3928c.d) obj2, (Map) obj3);
            }
        };
        C9546b c9546bM37676c = C9546b.m37676c(LayoutInflater.from(content.getContext()), content, false);
        Intrinsics.checkNotNullExpressionValue(c9546bM37676c, "inflate(...)");
        content.removeAllViews();
        content.addView(c9546bM37676c.getRoot());
        return new C5180a(new C3973e(uiScreen, c9546bM37676c, interfaceC14057n, c1164s.m6530l(c9546bM37676c, uiScreen, function2, true)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w2 */
    public final C3959k m20232w2() {
        C1140d c1140dM6471c = C1140d.m6471c(LayoutInflater.from(((C1144h) m32421b2()).f4752b.getContext()), ((C1144h) m32421b2()).f4752b, false);
        Intrinsics.checkNotNullExpressionValue(c1140dM6471c, "inflate(...)");
        ((C1144h) m32421b2()).f4752b.removeAllViews();
        ((C1144h) m32421b2()).f4752b.addView(c1140dM6471c.getRoot());
        return new C3959k(c1140dM6471c);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x2 */
    public final C3960l m20233x2() {
        C1142f c1142fM6477c = C1142f.m6477c(LayoutInflater.from(((C1144h) m32421b2()).f4752b.getContext()), ((C1144h) m32421b2()).f4752b, false);
        Intrinsics.checkNotNullExpressionValue(c1142fM6477c, "inflate(...)");
        ((C1144h) m32421b2()).f4752b.removeAllViews();
        ((C1144h) m32421b2()).f4752b.addView(c1142fM6477c.getRoot());
        return new C3960l(c1142fM6477c);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y2 */
    public final C6211f m20234y2(SelfieWorkflow.AbstractC3928c.g initialRendering) {
        EnumC12498d enumC12498d;
        Context context = ((C1144h) m32421b2()).f4752b.getContext();
        C12495a.a aVarM46814c = C12495a.f44667a.m46814c(InterfaceC6212g.a.class, new InterfaceC6212g.a() { // from class: eq.c
            @Override // gq.InterfaceC6212g.a
            /* JADX INFO: renamed from: a */
            public final InterfaceC6212g mo24079a(Context context2, ViewGroup viewGroup) {
                return SelfieStepFragment.m20217z2(context2, viewGroup);
            }
        });
        int i10 = C3971c.f16726a[initialRendering.getDesignVersion().ordinal()];
        if (i10 == 1 || i10 == 2) {
            enumC12498d = EnumC12498d.DefaultSelfie;
        } else {
            if (i10 != 3) {
                throw new C7345l();
            }
            enumC12498d = EnumC12498d.K0000SelfieSubmitting;
        }
        InterfaceC6212g.a aVar = (InterfaceC6212g.a) aVarM46814c.m46815a(enumC12498d);
        Intrinsics.checkNotNull(context);
        InterfaceC6212g interfaceC6212gMo24079a = aVar.mo24079a(context, ((C1144h) m32421b2()).f4752b);
        ((C1144h) m32421b2()).f4752b.removeAllViews();
        ((C1144h) m32421b2()).f4752b.addView(interfaceC6212gMo24079a.getRoot());
        return new C6211f(interfaceC6212gMo24079a);
    }
}
