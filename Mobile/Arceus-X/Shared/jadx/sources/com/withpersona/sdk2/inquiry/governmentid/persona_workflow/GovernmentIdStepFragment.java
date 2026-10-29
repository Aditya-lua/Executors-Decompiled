package com.withpersona.sdk2.inquiry.governmentid.persona_workflow;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ComponentCallbacksC0929c;
import androidx.p616lifecycle.C0941a1;
import androidx.p616lifecycle.C0944b1;
import androidx.p616lifecycle.C0967l0;
import androidx.p616lifecycle.C0982t;
import androidx.p616lifecycle.InterfaceC0947c1;
import androidx.p616lifecycle.InterfaceC0962j;
import androidx.p616lifecycle.InterfaceC0980s;
import ar.C1152g;
import ar.C1164s;
import ar.ComponentView;
import ar.InterfaceC1151f;
import com.withpersona.sdk2.camera.C3402b;
import com.withpersona.sdk2.inquiry.governmentid.C3548i;
import com.withpersona.sdk2.inquiry.governmentid.C3554m;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment;
import com.withpersona.sdk2.inquiry.steps.p056ui.UiComponentScreen;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import io.C6895n2;
import io.EnumC6852d;
import java.io.File;
import java.util.Map;
import jo.C7217b0;
import jo.C7241y;
import jo.InterfaceC7219c0;
import kotlin.Metadata;
import kotlin.Pair;
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
import no.C9525a;
import no.C9528d;
import no.C9529e;
import no.C9531g;
import no.C9532h;
import no.C9534j;
import no.C9537m;
import nu.InterfaceC9566c0;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.ViewEnvironment;
import p061ct.InterfaceC4364a;
import p093e4.C4822l0;
import p132fn.C5689j;
import p132fn.C5717x;
import p132fn.InterfaceC5683g;
import p152go.C6159e;
import p226jq.C7264i0;
import p229jt.C7334d;
import p229jt.C7342i;
import p229jt.C7345l;
import p229jt.C7347n;
import p229jt.C7348o;
import p229jt.C7352s;
import p229jt.EnumC7344k;
import p229jt.InterfaceC7341h;
import p237k4.CreationExtras;
import p251ko.C7654m;
import p251ko.C7662u;
import p251ko.InterfaceC7664w;
import p253kq.C7811b;
import p253kq.C7812c;
import p256ku.C7882k;
import p256ku.InterfaceC7906p0;
import p313nq.C9546b;
import p315nt.InterfaceC9557b;
import p341oq.AbstractC9844c;
import p341oq.C9845d;
import p344ot.C10047c;
import p389qo.C10631a;
import p389qo.C10663o;
import p498vq.C12247a;
import p498vq.C12248b;
import p523wn.C12495a;
import p523wn.EnumC12498d;
import p526wq.C12524g;
import p526wq.EnumC12529l;
import p615zt.InterfaceC14057n;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;
import so.C11430e;
import so.C11435j;
import so.C11436k;
import so.C11441p;
import to.C11724j;
import to.C11731q;
import to.InterfaceC11725k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u0093\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0094\u0001\u0095\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J%\u0010\u000b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001f\u0010 J#\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\r0#2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b%\u0010&J#\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\r0#2\u0006\u0010\b\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J!\u0010.\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\r2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0014¢\u0006\u0004\b0\u00101J)\u00107\u001a\u00020\u00062\u0006\u00103\u001a\u0002022\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u000604¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0006H\u0016¢\u0006\u0004\b9\u0010\u0005R\u001b\u0010?\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR(\u0010X\u001a\b\u0012\u0004\u0012\u00020Q0P8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010`\u001a\u00020Y8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010h\u001a\u00020a8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010p\u001a\u00020i8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR!\u0010w\u001a\u00020q8BX\u0082\u0084\u0002¢\u0006\u0012\n\u0004\br\u0010s\u0012\u0004\bv\u0010\u0005\u001a\u0004\bt\u0010uR\u001b\u0010|\u001a\u00020x8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\by\u0010s\u001a\u0004\bz\u0010{R$\u0010\u007f\u001a\u0010\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u0006\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u001c\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001b\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001b\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0085\u0001R\u001b\u0010\u008b\u0001\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001b\u0010\u008e\u0001\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001c\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001¨\u0006\u0096\u0001"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment;", "Loq/c;", "Lno/e;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "<init>", "()V", "", "F2", "rendering", "Lkotlin/Function0;", "bind", "G2", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/View;", "newView", "Lwq/l;", "transition", "Q2", "(Landroid/view/View;Lwq/l;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$g;", "Landroid/content/Context;", "context", "C2", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$g;Landroid/content/Context;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;", "y2", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;Landroid/content/Context;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;", "E2", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;Landroid/content/Context;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$f;", "z2", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$f;Landroid/content/Context;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;", "initialRendering", "Lkotlin/Pair;", "Lko/u;", "w2", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;)Lkotlin/Pair;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;", "Lto/q;", "D2", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;)Lkotlin/Pair;", "view", "Landroid/os/Bundle;", "savedInstanceState", "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "S2", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "input", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "handler", "R2", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lkotlin/jvm/functions/Function1;)V", "M0", "Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$GovernmentIdStepFragmentArgs;", "j0", "Lkq/c;", "H2", "()Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$GovernmentIdStepFragmentArgs;", "args", "Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/d$a;", "k0", "Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/d$a;", "P2", "()Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/d$a;", "setViewModelFactory", "(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/d$a;)V", "viewModelFactory", "Lcom/withpersona/sdk2/camera/b;", "l0", "Lcom/withpersona/sdk2/camera/b;", "I2", "()Lcom/withpersona/sdk2/camera/b;", "setCameraPreview", "(Lcom/withpersona/sdk2/camera/b;)V", "cameraPreview", "Lct/a;", "Lfn/x;", "m0", "Lct/a;", "K2", "()Lct/a;", "setGovernmentIdFeed", "(Lct/a;)V", "governmentIdFeed", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "n0", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "M2", "()Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "setTrackingEventsLogger", "(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "trackingEventsLogger", "Lgo/e;", "o0", "Lgo/e;", "J2", "()Lgo/e;", "setFeatureFlagManager", "(Lgo/e;)V", "featureFlagManager", "Lvq/a;", "p0", "Lvq/a;", "L2", "()Lvq/a;", "setSystemUiController", "(Lvq/a;)V", "systemUiController", "Lan/y;", "q0", "Ljt/h;", "N2", "()Lan/y;", "getViewEnvironment$annotations", "viewEnvironment", "Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/d;", "r0", "O2", "()Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/d;", "viewModel", "s0", "Lkotlin/jvm/functions/Function1;", "currentOutputHandler", "", "t0", "Ljava/lang/Object;", "currentRunner", "u0", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "currentScreen", "v0", "pendingRendering", "w0", "Lko/u;", "retainedCameraRunner", "x0", "Landroid/view/View;", "retainedCameraView", "Lfn/g;", "y0", "Lfn/g;", "cameraController", "z0", "b", "GovernmentIdStepFragmentArgs", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class GovernmentIdStepFragment extends AbstractC9844c<C9529e, Screen> {

    /* JADX INFO: renamed from: z0, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    @NotNull
    public final C7812c args;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public C3593d.a viewModelFactory;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public C3402b cameraPreview;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public InterfaceC4364a<C5717x> governmentIdFeed;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    public C6159e featureFlagManager;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public C12247a systemUiController;

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h viewEnvironment;

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h viewModel;

    /* JADX INFO: renamed from: s0, reason: from kotlin metadata */
    @Nullable
    public Function1<? super GovernmentIdWorkflow.AbstractC3503a, Unit> currentOutputHandler;

    /* JADX INFO: renamed from: t0, reason: from kotlin metadata */
    @Nullable
    public Object currentRunner;

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    @Nullable
    public Screen currentScreen;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    @Nullable
    public Screen pendingRendering;

    /* JADX INFO: renamed from: w0, reason: from kotlin metadata */
    @Nullable
    public C7662u retainedCameraRunner;

    /* JADX INFO: renamed from: x0, reason: from kotlin metadata */
    @Nullable
    public View retainedCameraView;

    /* JADX INFO: renamed from: y0, reason: from kotlin metadata */
    @Nullable
    public InterfaceC5683g cameraController;

    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$GovernmentIdStepFragmentArgs;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "props", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class GovernmentIdStepFragmentArgs implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdStepFragmentArgs> CREATOR = new C3573a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final GovernmentIdWorkflow.Input props;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment$GovernmentIdStepFragmentArgs$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3573a implements Parcelable.Creator<GovernmentIdStepFragmentArgs> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GovernmentIdStepFragmentArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GovernmentIdStepFragmentArgs(GovernmentIdWorkflow.Input.CREATOR.createFromParcel(parcel));
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final GovernmentIdStepFragmentArgs[] newArray(int i10) {
                return new GovernmentIdStepFragmentArgs[i10];
            }
        }

        public GovernmentIdStepFragmentArgs(@NotNull GovernmentIdWorkflow.Input props) {
            Intrinsics.checkNotNullParameter(props, "props");
            this.props = props;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final GovernmentIdWorkflow.Input getProps() {
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

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class C3574a extends C7744k implements InterfaceC14057n<LayoutInflater, ViewGroup, Boolean, C9529e> {

        /* JADX INFO: renamed from: a */
        public static final C3574a f14201a = new C3574a();

        public C3574a() {
            super(3, C9529e.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidFragmentBinding;", 0);
        }

        /* JADX INFO: renamed from: d */
        public final C9529e m17790d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            return C9529e.m37624c(p8, viewGroup, z10);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p615zt.InterfaceC14057n
        public /* bridge */ /* synthetic */ C9529e invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return m17790d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment$b, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$b;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "props", "Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment;", "a", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final GovernmentIdStepFragment m17791a(@NotNull GovernmentIdWorkflow.Input props) {
            Intrinsics.checkNotNullParameter(props, "props");
            return (GovernmentIdStepFragment) C7811b.m32425a(new GovernmentIdStepFragment(), new GovernmentIdStepFragmentArgs(props));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment$c */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class C3576c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f14202a;

        static {
            int[] iArr = new int[EnumC6852d.values().length];
            try {
                iArr[EnumC6852d.V0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6852d.K0000.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f14202a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment$d */
    @Metadata(m31664d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"com/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$d", "Lar/f;", "rendering", "Lvq/a;", "systemUiController", "", "b", "(Ljava/lang/Object;Lvq/a;)V", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3577d implements InterfaceC1151f<Screen.C3531f> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ UiComponentScreen f14203b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C9546b f14204c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC14057n f14205d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C1152g f14206e;

        public C3577d(UiComponentScreen uiComponentScreen, C9546b c9546b, InterfaceC14057n interfaceC14057n, C1152g c1152g) {
            this.f14203b = uiComponentScreen;
            this.f14204c = c9546b;
            this.f14205d = interfaceC14057n;
            this.f14206e = c1152g;
        }

        @Override // ar.InterfaceC1151f
        /* JADX INFO: renamed from: b */
        public void mo6493b(Screen.C3531f rendering, C12247a systemUiController) {
            Intrinsics.checkNotNullParameter(rendering, "rendering");
            Integer numM20526i = this.f14203b.m20526i();
            if (numM20526i != null) {
                C9546b c9546b = this.f14204c;
                int iIntValue = numM20526i.intValue();
                c9546b.getRoot().setBackgroundColor(iIntValue);
                if (systemUiController != null) {
                    Context context = c9546b.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    systemUiController.m45389a(context, iIntValue);
                }
            }
            UiComponentScreen uiComponentScreen = this.f14203b;
            Context context2 = this.f14204c.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Drawable drawableM20524a = uiComponentScreen.m20524a(context2);
            if (drawableM20524a != null) {
                C9546b c9546b2 = this.f14204c;
                c9546b2.getRoot().setBackground(drawableM20524a);
                c9546b2.f34504d.setBackgroundColor(0);
            }
            this.f14205d.invoke(this.f14204c, rendering, this.f14206e.getViewBindings().m6497a());
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment$e */
    @Metadata(m31664d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"com/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$e", "Lto/k$a;", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "container", "Lto/k;", "a", "(Landroid/content/Context;Landroid/view/ViewGroup;)Lto/k;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3578e implements InterfaceC11725k.a {
        @Override // to.InterfaceC11725k.a
        /* JADX INFO: renamed from: a */
        public InterfaceC11725k mo17792a(Context context, ViewGroup container) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new C11724j(context, container);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment$f */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment$finalizeVideoCaptureThenBind$1", m39664f = "GovernmentIdStepFragment.kt", m39665l = {343}, m39666m = "invokeSuspend")
    public static final class C3579f extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f14207t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ InterfaceC5683g f14208u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ Function0<Unit> f14209v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ GovernmentIdStepFragment f14210w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ Screen f14211x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3579f(InterfaceC5683g interfaceC5683g, Function0<Unit> function0, GovernmentIdStepFragment governmentIdStepFragment, Screen screen, InterfaceC9557b<? super C3579f> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f14208u = interfaceC5683g;
            this.f14209v = function0;
            this.f14210w = governmentIdStepFragment;
            this.f14211x = screen;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3579f(this.f14208u, this.f14209v, this.f14210w, this.f14211x, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objMo16225i;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f14207t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC5683g interfaceC5683g = this.f14208u;
                if (interfaceC5683g != null) {
                    this.f14207t = 1;
                    objMo16225i = interfaceC5683g.mo16225i(this);
                    if (objMo16225i == objM38805e) {
                        return objM38805e;
                    }
                }
                this.f14209v.invoke();
                this.f14210w.m17770F2();
                this.f14210w.currentScreen = this.f14211x;
                return Unit.f29331a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            objMo16225i = ((C7347n) obj).getValue();
            GovernmentIdStepFragment governmentIdStepFragment = this.f14210w;
            InterfaceC5683g interfaceC5683g2 = this.f14208u;
            if (C7347n.m30466h(objMo16225i)) {
                governmentIdStepFragment.m17779O2().getGovernmentIdStepStateManager().m17899f0((File) objMo16225i, interfaceC5683g2.mo16217a());
            }
            C7347n.m30459a(objMo16225i);
            this.f14209v.invoke();
            this.f14210w.m17770F2();
            this.f14210w.currentScreen = this.f14211x;
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3579f) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment$g */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment$onViewCreated$1", m39664f = "GovernmentIdStepFragment.kt", m39665l = {144}, m39666m = "invokeSuspend")
    public static final class C3580g extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f14212t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ C3591b f14213u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ GovernmentIdStepFragment f14214v;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment$g$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ GovernmentIdStepFragment f14215a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C3591b f14216b;

            public a(GovernmentIdStepFragment governmentIdStepFragment, C3591b c3591b) {
                this.f14215a = governmentIdStepFragment;
                this.f14216b = c3591b;
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object; */
            @Override // nu.InterfaceC9577i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(GovernmentIdWorkflow.AbstractC3503a abstractC3503a, InterfaceC9557b<? super Unit> interfaceC9557b) {
                if (abstractC3503a == null) {
                    return Unit.f29331a;
                }
                if (this.f14215a.currentOutputHandler != null) {
                    this.f14216b.m45394a().setValue(null);
                    Function1 function1 = this.f14215a.currentOutputHandler;
                    if (function1 != null) {
                        function1.invoke(abstractC3503a);
                    }
                }
                return Unit.f29331a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3580g(C3591b c3591b, GovernmentIdStepFragment governmentIdStepFragment, InterfaceC9557b<? super C3580g> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f14213u = c3591b;
            this.f14214v = governmentIdStepFragment;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3580g(this.f14213u, this.f14214v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f14212t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9566c0<GovernmentIdWorkflow.AbstractC3503a> interfaceC9566c0M45394a = this.f14213u.m45394a();
                a aVar = new a(this.f14214v, this.f14213u);
                this.f14212t = 1;
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
            return ((C3580g) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment$h */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment$render$16", m39664f = "GovernmentIdStepFragment.kt", m39665l = {313, 314}, m39666m = "invokeSuspend")
    public static final class C3581h extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f14217t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ Screen f14219v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ Context f14220w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3581h(Screen screen, Context context, InterfaceC9557b<? super C3581h> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f14219v = screen;
            this.f14220w = context;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return GovernmentIdStepFragment.this.new C3581h(this.f14219v, this.f14220w, interfaceC9557b);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        
            if (r5 == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
        
            if (r5.m25813b(r1, r4) == r0) goto L18;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objMo16225i;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f14217t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC5683g interfaceC5683g = GovernmentIdStepFragment.this.cameraController;
                if (interfaceC5683g != null) {
                    this.f14217t = 1;
                    objMo16225i = interfaceC5683g.mo16225i(this);
                } else {
                    C5689j c5689j = C5689j.f21847a;
                    Context contextM4609I1 = GovernmentIdStepFragment.this.m4609I1();
                    Intrinsics.checkNotNullExpressionValue(contextM4609I1, "requireContext(...)");
                    this.f14217t = 2;
                }
                return objM38805e;
            }
            if (i10 == 1) {
                C7348o.m30470b(obj);
                objMo16225i = ((C7347n) obj).getValue();
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            GovernmentIdStepFragment.this.m17767C2((Screen.C3532g) this.f14219v, this.f14220w);
            GovernmentIdStepFragment.this.m17770F2();
            GovernmentIdStepFragment.this.currentScreen = this.f14219v;
            return Unit.f29331a;
            C7347n.m30459a(objMo16225i);
            C5689j c5689j2 = C5689j.f21847a;
            Context contextM4609I2 = GovernmentIdStepFragment.this.m4609I1();
            Intrinsics.checkNotNullExpressionValue(contextM4609I2, "requireContext(...)");
            this.f14217t = 2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3581h) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment$i */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment$render$9", m39664f = "GovernmentIdStepFragment.kt", m39665l = {252, 253}, m39666m = "invokeSuspend")
    public static final class C3582i extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f14221t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ Screen f14223v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ Context f14224w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3582i(Screen screen, Context context, InterfaceC9557b<? super C3582i> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f14223v = screen;
            this.f14224w = context;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return GovernmentIdStepFragment.this.new C3582i(this.f14223v, this.f14224w, interfaceC9557b);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        
            if (r5 == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
        
            if (r5.m25813b(r1, r4) == r0) goto L18;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objMo16225i;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f14221t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC5683g interfaceC5683g = GovernmentIdStepFragment.this.cameraController;
                if (interfaceC5683g != null) {
                    this.f14221t = 1;
                    objMo16225i = interfaceC5683g.mo16225i(this);
                } else {
                    C5689j c5689j = C5689j.f21847a;
                    Context contextM4609I1 = GovernmentIdStepFragment.this.m4609I1();
                    Intrinsics.checkNotNullExpressionValue(contextM4609I1, "requireContext(...)");
                    this.f14221t = 2;
                }
                return objM38805e;
            }
            if (i10 == 1) {
                C7348o.m30470b(obj);
                objMo16225i = ((C7347n) obj).getValue();
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            GovernmentIdStepFragment.this.m17785y2((Screen.C3529d) this.f14223v, this.f14224w);
            GovernmentIdStepFragment.this.m17770F2();
            GovernmentIdStepFragment.this.currentScreen = this.f14223v;
            return Unit.f29331a;
            C7347n.m30459a(objMo16225i);
            C5689j c5689j2 = C5689j.f21847a;
            Context contextM4609I2 = GovernmentIdStepFragment.this.m4609I1();
            Intrinsics.checkNotNullExpressionValue(contextM4609I2, "requireContext(...)");
            this.f14221t = 2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3582i) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment$j */
    @Metadata(m31664d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"com/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$j", "Ljo/c0$a;", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "container", "Ljo/c0;", "a", "(Landroid/content/Context;Landroid/view/ViewGroup;)Ljo/c0;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3583j implements InterfaceC7219c0.a {
        @Override // jo.InterfaceC7219c0.a
        /* JADX INFO: renamed from: a */
        public InterfaceC7219c0 mo17794a(Context context, ViewGroup container) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new C7241y(context, container);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment$k */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3584k implements Function0<Bundle> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ComponentCallbacksC0929c f14225a;

        public C3584k(ComponentCallbacksC0929c componentCallbacksC0929c) {
            this.f14225a = componentCallbacksC0929c;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle bundleM4704t = this.f14225a.m4704t();
            if (bundleM4704t != null) {
                return bundleM4704t;
            }
            throw new IllegalStateException("Fragment " + this.f14225a + " has null arguments");
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment$l */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3585l implements Function0<C0941a1.c> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ComponentCallbacksC0929c f14226a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f14227b;

        public C3585l(ComponentCallbacksC0929c componentCallbacksC0929c, Function1 function1) {
            this.f14226a = componentCallbacksC0929c;
            this.f14227b = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0941a1.c invoke() {
            return new C9845d(this.f14226a, this.f14227b);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment$m */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/fragment/app/c;", "b", "()Landroidx/fragment/app/c;"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class C3586m extends AbstractC7746m implements Function0<ComponentCallbacksC0929c> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ ComponentCallbacksC0929c f14228i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3586m(ComponentCallbacksC0929c componentCallbacksC0929c) {
            super(0);
            this.f14228i = componentCallbacksC0929c;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ComponentCallbacksC0929c invoke() {
            return this.f14228i;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment$n */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/c1;", "b", "()Landroidx/lifecycle/c1;"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class C3587n extends AbstractC7746m implements Function0<InterfaceC0947c1> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Function0 f14229i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3587n(Function0 function0) {
            super(0);
            this.f14229i = function0;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC0947c1 invoke() {
            return (InterfaceC0947c1) this.f14229i.invoke();
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment$o */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/b1;", "b", "()Landroidx/lifecycle/b1;"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class C3588o extends AbstractC7746m implements Function0<C0944b1> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC7341h f14230i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3588o(InterfaceC7341h interfaceC7341h) {
            super(0);
            this.f14230i = interfaceC7341h;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C0944b1 invoke() {
            return C4822l0.m23349c(this.f14230i).mo4712w();
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment$p */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Lk4/a;", "b", "()Lk4/a;"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class C3589p extends AbstractC7746m implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Function0 f14231i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ InterfaceC7341h f14232j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3589p(Function0 function0, InterfaceC7341h interfaceC7341h) {
            super(0);
            this.f14231i = function0;
            this.f14232j = interfaceC7341h;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f14231i;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            InterfaceC0947c1 interfaceC0947c1M23349c = C4822l0.m23349c(this.f14232j);
            InterfaceC0962j interfaceC0962j = interfaceC0947c1M23349c instanceof InterfaceC0962j ? (InterfaceC0962j) interfaceC0947c1M23349c : null;
            return interfaceC0962j != null ? interfaceC0962j.mo4653Z() : CreationExtras.b.f28722c;
        }
    }

    public GovernmentIdStepFragment() {
        super(C3574a.f14201a);
        this.args = new C7812c(C7731d0.m32002b(GovernmentIdStepFragmentArgs.class), new C3584k(this));
        this.viewEnvironment = C7342i.m30456b(new Function0() { // from class: qo.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GovernmentIdStepFragment.m17750V2(this.f38153a);
            }
        });
        C3585l c3585l = new C3585l(this, new Function1() { // from class: qo.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GovernmentIdStepFragment.m17751W2(this.f38155a, (C0967l0) obj);
            }
        });
        InterfaceC7341h interfaceC7341hM30455a = C7342i.m30455a(EnumC7344k.NONE, new C3587n(new C3586m(this)));
        this.viewModel = C4822l0.m23348b(this, C7731d0.m32002b(C3593d.class), new C3588o(interfaceC7341hM30455a), new C3589p(null, interfaceC7341hM30455a), c3585l);
    }

    /* JADX INFO: renamed from: A2 */
    public static final Unit m17746A2(C9546b binding, Map map) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(map, "<unused var>");
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        C12524g.m46873d(root, false, false, false, false, 15, null);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: B2 */
    public static final Unit m17747B2(C9546b binding, Screen.C3531f pendingRendering, Map map) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(pendingRendering, "pendingRendering");
        Intrinsics.checkNotNullParameter(map, "<unused var>");
        C10663o.m40756d(binding, pendingRendering);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: T2 */
    public static final Unit m17748T2(GovernmentIdStepFragment governmentIdStepFragment, Screen screen, Context context) {
        governmentIdStepFragment.m17769E2((Screen.C3535j) screen, context);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: U2 */
    public static final Unit m17749U2(GovernmentIdStepFragment governmentIdStepFragment, Screen screen, Context context) {
        governmentIdStepFragment.m17786z2((Screen.C3531f) screen, context);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: V2 */
    public static final ViewEnvironment m17750V2(GovernmentIdStepFragment governmentIdStepFragment) {
        return new ViewEnvironment(C7688j0.m31791g(C7352s.m30477a(C12248b.f43285b, governmentIdStepFragment.m17776L2())));
    }

    /* JADX INFO: renamed from: W2 */
    public static final C3593d m17751W2(GovernmentIdStepFragment governmentIdStepFragment, C0967l0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return governmentIdStepFragment.m17780P2().mo17916a(it, governmentIdStepFragment.m17772H2().getProps());
    }

    /* JADX INFO: renamed from: x2 */
    public static final InterfaceC7664w m17766x2(C5717x governmentIdFeed, C3402b cameraPreview, C6159e featureFlagManager, Screen.C3527b initialRendering, Context context, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(governmentIdFeed, "governmentIdFeed");
        Intrinsics.checkNotNullParameter(cameraPreview, "cameraPreview");
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(context, "context");
        return new C7654m(governmentIdFeed, cameraPreview, featureFlagManager, initialRendering, context, viewGroup);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C2 */
    public final void m17767C2(Screen.C3532g rendering, Context context) {
        Object obj = this.currentRunner;
        View view = null;
        if (!(obj instanceof C11436k)) {
            obj = null;
        }
        Object obj2 = (C11436k) obj;
        if (obj2 == null) {
            C9532h c9532hM37633c = C9532h.m37633c(LayoutInflater.from(context), ((C9529e) m32421b2()).f34377b, false);
            Intrinsics.checkNotNullExpressionValue(c9532hM37633c, "inflate(...)");
            Pair pair = new Pair(new C11436k(c9532hM37633c), c9532hM37633c.getRoot());
            Object objM31671a = pair.m31671a();
            view = (View) pair.m31672b();
            obj2 = objM31671a;
        }
        EnumC12529l transition = rendering.mo17319b(this.currentScreen) ? EnumC12529l.NONE : rendering.getTransition();
        if (view != null) {
            m17781Q2(view, transition);
        }
        ((C11436k) obj2).mo1442a(rendering, m17778N2());
        this.currentRunner = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D2 */
    public final Pair<C11731q, View> m17768D2(Screen.C3533h rendering) {
        EnumC12498d enumC12498d;
        Context context = ((C9529e) m32421b2()).f34377b.getContext();
        C12495a.a aVarM46814c = C12495a.f44667a.m46814c(InterfaceC11725k.a.class, new C3578e());
        int i10 = C3576c.f14202a[rendering.getDesignVersion().ordinal()];
        if (i10 == 1) {
            enumC12498d = EnumC12498d.DefaultGovIdReview;
        } else {
            if (i10 != 2) {
                throw new C7345l();
            }
            enumC12498d = EnumC12498d.K0000GovIdReview;
        }
        InterfaceC11725k.a aVar = (InterfaceC11725k.a) aVarM46814c.m46815a(enumC12498d);
        Intrinsics.checkNotNull(context);
        InterfaceC11725k interfaceC11725kMo17792a = aVar.mo17792a(context, ((C9529e) m32421b2()).f34377b);
        return new Pair<>(new C11731q(interfaceC11725kMo17792a), interfaceC11725kMo17792a.getRoot());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E2 */
    public final void m17769E2(Screen.C3535j rendering, Context context) {
        Object obj = this.currentRunner;
        View view = null;
        if (!(obj instanceof C3554m)) {
            obj = null;
        }
        Object obj2 = (C3554m) obj;
        if (obj2 == null) {
            C9537m c9537mM37648c = C9537m.m37648c(LayoutInflater.from(context), ((C9529e) m32421b2()).f34377b, false);
            Intrinsics.checkNotNullExpressionValue(c9537mM37648c, "inflate(...)");
            Pair pair = new Pair(new C3554m(c9537mM37648c), c9537mM37648c.getRoot());
            Object objM31671a = pair.m31671a();
            view = (View) pair.m31672b();
            obj2 = objM31671a;
        }
        EnumC12529l transition = rendering.mo17319b(this.currentScreen) ? EnumC12529l.NONE : rendering.getTransition();
        if (view != null) {
            m17781Q2(view, transition);
        }
        ((C3554m) obj2).mo1442a(rendering, m17778N2());
        this.currentRunner = obj2;
    }

    /* JADX INFO: renamed from: F2 */
    public final void m17770F2() {
        View view = this.retainedCameraView;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        this.retainedCameraRunner = null;
        this.retainedCameraView = null;
        this.cameraController = null;
    }

    /* JADX INFO: renamed from: G2 */
    public final void m17771G2(Screen rendering, Function0<Unit> bind) {
        InterfaceC5683g interfaceC5683g = this.cameraController;
        InterfaceC0980s interfaceC0980sM4680k0 = m4680k0();
        Intrinsics.checkNotNullExpressionValue(interfaceC0980sM4680k0, "getViewLifecycleOwner(...)");
        C7882k.m32780d(C0982t.m4979a(interfaceC0980sM4680k0), null, null, new C3579f(interfaceC5683g, bind, this, rendering, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Args */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H2 */
    public final GovernmentIdStepFragmentArgs m17772H2() {
        return (GovernmentIdStepFragmentArgs) this.args.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: I2 */
    public final C3402b m17773I2() {
        C3402b c3402b = this.cameraPreview;
        if (c3402b != null) {
            return c3402b;
        }
        Intrinsics.m31998u("cameraPreview");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: J2 */
    public final C6159e m17774J2() {
        C6159e c6159e = this.featureFlagManager;
        if (c6159e != null) {
            return c6159e;
        }
        Intrinsics.m31998u("featureFlagManager");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: K2 */
    public final InterfaceC4364a<C5717x> m17775K2() {
        InterfaceC4364a<C5717x> interfaceC4364a = this.governmentIdFeed;
        if (interfaceC4364a != null) {
            return interfaceC4364a;
        }
        Intrinsics.m31998u("governmentIdFeed");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L2 */
    public final C12247a m17776L2() {
        C12247a c12247a = this.systemUiController;
        if (c12247a != null) {
            return c12247a;
        }
        Intrinsics.m31998u("systemUiController");
        return null;
    }

    @Override // p253kq.C7810a, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: M0 */
    public void mo4618M0() {
        m17770F2();
        super.mo4618M0();
    }

    @NotNull
    /* JADX INFO: renamed from: M2 */
    public final TrackingEventsLogger m17777M2() {
        TrackingEventsLogger trackingEventsLogger = this.trackingEventsLogger;
        if (trackingEventsLogger != null) {
            return trackingEventsLogger;
        }
        Intrinsics.m31998u("trackingEventsLogger");
        return null;
    }

    /* JADX INFO: renamed from: N2 */
    public final ViewEnvironment m17778N2() {
        return (ViewEnvironment) this.viewEnvironment.getValue();
    }

    /* JADX INFO: renamed from: O2 */
    public final C3593d m17779O2() {
        return (C3593d) this.viewModel.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: P2 */
    public final C3593d.a m17780P2() {
        C3593d.a aVar = this.viewModelFactory;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.m31998u("viewModelFactory");
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q2 */
    public final void m17781Q2(View newView, EnumC12529l transition) {
        FrameLayout frameLayout = ((C9529e) m32421b2()).f34377b;
        int i10 = C6895n2.f27078l0;
        Object tag = frameLayout.getTag(i10);
        View view = tag instanceof View ? (View) tag : null;
        if (this.currentScreen == null) {
            transition = EnumC12529l.NONE;
        }
        if (view != null) {
            FrameLayout content = ((C9529e) m32421b2()).f34377b;
            Intrinsics.checkNotNullExpressionValue(content, "content");
            C7264i0.m30284a(content, view, newView, transition);
        } else {
            ((C9529e) m32421b2()).f34377b.addView(newView);
        }
        ((C9529e) m32421b2()).f34377b.setTag(i10, newView);
    }

    /* JADX INFO: renamed from: R2 */
    public final void m17782R2(@NotNull GovernmentIdWorkflow.Input input, @NotNull Function1<? super GovernmentIdWorkflow.AbstractC3503a, Unit> handler) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(handler, "handler");
        m17779O2().m17915f(input);
        this.currentOutputHandler = handler;
    }

    /* JADX DEBUG: Method merged with bridge method: h2(Ljava/lang/Object;)V */
    /* JADX DEBUG: Multi-variable search result rejected for r0v40, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v47, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v25, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v43, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v59, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v80, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v99, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v14, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v11, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v8, resolved type: T */
    /* JADX WARN: Code duplicated, block: B:116:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:118:0x02af  */
    /* JADX WARN: Code duplicated, block: B:121:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:124:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:125:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:127:0x02d5  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p341oq.AbstractC9844c
    /* JADX INFO: renamed from: S2, reason: merged with bridge method [inline-methods] */
    public void mo16775h2(@NotNull final Screen rendering) {
        Object obj;
        C11731q c11731q;
        EnumC12529l transition;
        EnumC12498d enumC12498d;
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        if (!m32423d2()) {
            this.pendingRendering = rendering;
            return;
        }
        final Context contextM4609I1 = m4609I1();
        Intrinsics.checkNotNullExpressionValue(contextM4609I1, "requireContext(...)");
        View viewM31672b = null;
        if (rendering instanceof Screen.C3530e) {
            Object obj2 = this.currentRunner;
            if (!(obj2 instanceof C3548i)) {
                obj2 = null;
            }
            Object obj3 = (C3548i) obj2;
            if (obj3 == null) {
                C9531g c9531gM37630c = C9531g.m37630c(LayoutInflater.from(contextM4609I1), ((C9529e) m32421b2()).f34377b, false);
                Intrinsics.checkNotNullExpressionValue(c9531gM37630c, "inflate(...)");
                Pair pair = new Pair(new C3548i(c9531gM37630c), c9531gM37630c.getRoot());
                Object objM31671a = pair.m31671a();
                viewM31672b = (View) pair.m31672b();
                obj3 = objM31671a;
            }
            EnumC12529l transition2 = rendering.mo17319b(this.currentScreen) ? EnumC12529l.NONE : rendering.getTransition();
            if (viewM31672b != null) {
                m17781Q2(viewM31672b, transition2);
            }
            ((C3548i) obj3).mo1442a((Screen.C3530e) rendering, m17778N2());
            this.currentRunner = obj3;
        } else if (rendering instanceof Screen.C3526a) {
            C12495a.a aVarM46814c = C12495a.f44667a.m46814c(InterfaceC7219c0.a.class, new C3583j());
            Screen.C3526a c3526a = (Screen.C3526a) rendering;
            int i10 = C3576c.f14202a[c3526a.getDesignVersion().ordinal()];
            if (i10 == 1) {
                enumC12498d = EnumC12498d.DefaultSelectCountryAndIdClass;
            } else {
                if (i10 != 2) {
                    throw new C7345l();
                }
                enumC12498d = EnumC12498d.K0000SelectCountryAndIdClass;
            }
            InterfaceC7219c0 interfaceC7219c0Mo17794a = ((InterfaceC7219c0.a) aVarM46814c.m46815a(enumC12498d)).mo17794a(contextM4609I1, ((C9529e) m32421b2()).f34377b);
            Object obj4 = this.currentRunner;
            if (!(obj4 instanceof C7217b0)) {
                obj4 = null;
            }
            Object obj5 = (C7217b0) obj4;
            if (obj5 == null) {
                Pair pair2 = new Pair(new C7217b0(interfaceC7219c0Mo17794a), interfaceC7219c0Mo17794a.getRoot());
                Object objM31671a2 = pair2.m31671a();
                viewM31672b = (View) pair2.m31672b();
                obj5 = objM31671a2;
            }
            EnumC12529l transition3 = rendering.mo17319b(this.currentScreen) ? EnumC12529l.NONE : rendering.getTransition();
            if (viewM31672b != null) {
                m17781Q2(viewM31672b, transition3);
            }
            ((C7217b0) obj5).mo1442a(c3526a, m17778N2());
            this.currentRunner = obj5;
        } else if (rendering instanceof Screen.C3527b) {
            if ((this.currentScreen instanceof Screen.C3533h) && (this.currentRunner instanceof C11731q)) {
                Object tag = ((C9529e) m32421b2()).f34377b.getTag(C6895n2.f27078l0);
                View view = tag instanceof View ? (View) tag : null;
                if (view != null) {
                    ((C9529e) m32421b2()).f34377b.removeView(view);
                }
            }
            View view2 = this.retainedCameraView;
            if (view2 != null) {
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                ((C9529e) m32421b2()).f34377b.setTag(C6895n2.f27078l0, this.retainedCameraView);
                C7662u c7662u = this.retainedCameraRunner;
                if (c7662u != null) {
                    c7662u.mo1442a((Screen.C3527b) rendering, m17778N2());
                }
                this.currentRunner = this.retainedCameraRunner;
            } else {
                Object obj6 = this.currentRunner;
                if (!(obj6 instanceof C7662u)) {
                    obj6 = null;
                }
                C7662u c7662u2 = (C7662u) obj6;
                if (c7662u2 == null) {
                    Pair<C7662u, View> pairM17784w2 = m17784w2((Screen.C3527b) rendering);
                    C7662u c7662uM31671a = pairM17784w2.m31671a();
                    viewM31672b = pairM17784w2.m31672b();
                    c7662u2 = c7662uM31671a;
                }
                EnumC12529l transition4 = rendering.mo17319b(this.currentScreen) ? EnumC12529l.NONE : rendering.getTransition();
                if (viewM31672b != null) {
                    m17781Q2(viewM31672b, transition4);
                }
                c7662u2.mo1442a((Screen.C3527b) rendering, m17778N2());
                this.currentRunner = c7662u2;
            }
        } else if (rendering instanceof Screen.C3528c) {
            Object obj7 = this.currentRunner;
            if (!(obj7 instanceof C11430e)) {
                obj7 = null;
            }
            Object obj8 = (C11430e) obj7;
            if (obj8 == null) {
                C9528d c9528dM37621c = C9528d.m37621c(LayoutInflater.from(contextM4609I1), ((C9529e) m32421b2()).f34377b, false);
                Intrinsics.checkNotNullExpressionValue(c9528dM37621c, "inflate(...)");
                Pair pair3 = new Pair(new C11430e(c9528dM37621c), c9528dM37621c.getRoot());
                Object objM31671a3 = pair3.m31671a();
                viewM31672b = (View) pair3.m31672b();
                obj8 = objM31671a3;
            }
            EnumC12529l transition5 = rendering.mo17319b(this.currentScreen) ? EnumC12529l.NONE : rendering.getTransition();
            if (viewM31672b != null) {
                m17781Q2(viewM31672b, transition5);
            }
            ((C11430e) obj8).mo1442a((Screen.C3528c) rendering, m17778N2());
            this.currentRunner = obj8;
        } else if (rendering instanceof Screen.C3529d) {
            Screen.C3529d c3529d = (Screen.C3529d) rendering;
            if (c3529d.getVideoCaptureEnabled() && this.cameraController != null) {
                InterfaceC0980s interfaceC0980sM4680k0 = m4680k0();
                Intrinsics.checkNotNullExpressionValue(interfaceC0980sM4680k0, "getViewLifecycleOwner(...)");
                C7882k.m32780d(C0982t.m4979a(interfaceC0980sM4680k0), null, null, new C3582i(rendering, contextM4609I1, null), 3, null);
                return;
            }
            m17785y2(c3529d, contextM4609I1);
        } else if (rendering instanceof Screen.C3533h) {
            Screen.C3533h c3533h = (Screen.C3533h) rendering;
            if (c3533h.getKeepCameraAlive()) {
                Object obj9 = this.currentRunner;
                if ((obj9 instanceof C7662u) && (this.currentScreen instanceof Screen.C3527b)) {
                    Intrinsics.m31981d(obj9, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner");
                    this.retainedCameraRunner = (C7662u) obj9;
                    FrameLayout frameLayout = ((C9529e) m32421b2()).f34377b;
                    int i11 = C6895n2.f27078l0;
                    Object tag2 = frameLayout.getTag(i11);
                    viewM31672b = tag2 instanceof View ? (View) tag2 : null;
                    this.retainedCameraView = viewM31672b;
                    if (viewM31672b != null) {
                        viewM31672b.setVisibility(4);
                    }
                    Pair<C11731q, View> pairM17768D2 = m17768D2(c3533h);
                    C11731q c11731qM31671a = pairM17768D2.m31671a();
                    View viewM31672b2 = pairM17768D2.m31672b();
                    ((C9529e) m32421b2()).f34377b.addView(viewM31672b2);
                    ((C9529e) m32421b2()).f34377b.setTag(i11, viewM31672b2);
                    c11731qM31671a.mo1442a(c3533h, m17778N2());
                    this.currentRunner = c11731qM31671a;
                } else {
                    obj = this.currentRunner;
                    if (!(obj instanceof C11731q)) {
                        obj = null;
                    }
                    c11731q = (C11731q) obj;
                    if (c11731q == null) {
                        Pair<C11731q, View> pairM17768D3 = m17768D2(c3533h);
                        C11731q c11731qM31671a2 = pairM17768D3.m31671a();
                        viewM31672b = pairM17768D3.m31672b();
                        c11731q = c11731qM31671a2;
                    }
                    if (rendering.mo17319b(this.currentScreen)) {
                        transition = EnumC12529l.NONE;
                    } else {
                        transition = rendering.getTransition();
                    }
                    if (viewM31672b != null) {
                        m17781Q2(viewM31672b, transition);
                    }
                    c11731q.mo1442a(c3533h, m17778N2());
                    this.currentRunner = c11731q;
                }
            } else {
                obj = this.currentRunner;
                if (!(obj instanceof C11731q)) {
                    obj = null;
                }
                c11731q = (C11731q) obj;
                if (c11731q == null) {
                    Pair<C11731q, View> pairM17768D4 = m17768D2(c3533h);
                    C11731q c11731qM31671a3 = pairM17768D4.m31671a();
                    viewM31672b = pairM17768D4.m31672b();
                    c11731q = c11731qM31671a3;
                }
                if (rendering.mo17319b(this.currentScreen)) {
                    transition = EnumC12529l.NONE;
                } else {
                    transition = rendering.getTransition();
                }
                if (viewM31672b != null) {
                    m17781Q2(viewM31672b, transition);
                }
                c11731q.mo1442a(c3533h, m17778N2());
                this.currentRunner = c11731q;
            }
        } else if (rendering instanceof Screen.C3534i) {
            Object obj10 = this.currentRunner;
            if (!(obj10 instanceof C11441p)) {
                obj10 = null;
            }
            Object obj11 = (C11441p) obj10;
            if (obj11 == null) {
                C9534j c9534jM37639c = C9534j.m37639c(LayoutInflater.from(contextM4609I1), ((C9529e) m32421b2()).f34377b, false);
                Intrinsics.checkNotNullExpressionValue(c9534jM37639c, "inflate(...)");
                Pair pair4 = new Pair(new C11441p(c9534jM37639c), c9534jM37639c.getRoot());
                Object objM31671a4 = pair4.m31671a();
                viewM31672b = (View) pair4.m31672b();
                obj11 = objM31671a4;
            }
            EnumC12529l transition6 = rendering.mo17319b(this.currentScreen) ? EnumC12529l.NONE : rendering.getTransition();
            if (viewM31672b != null) {
                m17781Q2(viewM31672b, transition6);
            }
            ((C11441p) obj11).mo1442a((Screen.C3534i) rendering, m17778N2());
            this.currentRunner = obj11;
        } else if (rendering instanceof Screen.C3535j) {
            Screen.C3535j c3535j = (Screen.C3535j) rendering;
            if (c3535j.getIsFinalizingVideoCapture()) {
                m17771G2(rendering, new Function0() { // from class: qo.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GovernmentIdStepFragment.m17748T2(this.f38144a, rendering, contextM4609I1);
                    }
                });
                return;
            }
            m17769E2(c3535j, contextM4609I1);
        } else if (rendering instanceof Screen.C3531f) {
            Screen.C3531f c3531f = (Screen.C3531f) rendering;
            if (c3531f.getIsFinalizingVideoCapture()) {
                m17771G2(rendering, new Function0() { // from class: qo.g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GovernmentIdStepFragment.m17749U2(this.f38149a, rendering, contextM4609I1);
                    }
                });
                return;
            }
            m17786z2(c3531f, contextM4609I1);
        } else {
            if (!(rendering instanceof Screen.C3532g)) {
                throw new C7345l();
            }
            if (this.cameraController != null) {
                InterfaceC0980s interfaceC0980sM4680k1 = m4680k0();
                Intrinsics.checkNotNullExpressionValue(interfaceC0980sM4680k1, "getViewLifecycleOwner(...)");
                C7882k.m32780d(C0982t.m4979a(interfaceC0980sM4680k1), null, null, new C3581h(rendering, contextM4609I1, null), 3, null);
                return;
            }
            m17767C2((Screen.C3532g) rendering, contextM4609I1);
        }
        this.currentScreen = rendering;
    }

    @Override // p341oq.AbstractC9844c, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: e1 */
    public void mo4667e1(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.mo4667e1(view, savedInstanceState);
        C3591b governmentIdStepStateManager = m17779O2().getGovernmentIdStepStateManager();
        m38732g2(governmentIdStepStateManager.m45396c());
        InterfaceC0980s interfaceC0980sM4680k0 = m4680k0();
        Intrinsics.checkNotNullExpressionValue(interfaceC0980sM4680k0, "getViewLifecycleOwner(...)");
        C7882k.m32780d(C0982t.m4979a(interfaceC0980sM4680k0), null, null, new C3580g(governmentIdStepStateManager, this, null), 3, null);
        Screen screen = this.pendingRendering;
        if (screen != null) {
            mo16775h2(screen);
        }
        this.pendingRendering = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w2 */
    public final Pair<C7662u, View> m17784w2(Screen.C3527b initialRendering) {
        EnumC12498d enumC12498d;
        Context context = ((C9529e) m32421b2()).f34377b.getContext();
        C12495a.a aVarM46814c = C12495a.f44667a.m46814c(InterfaceC7664w.a.class, new InterfaceC7664w.a() { // from class: qo.j
            @Override // p251ko.InterfaceC7664w.a
            /* JADX INFO: renamed from: b */
            public final InterfaceC7664w mo31656b(C5717x c5717x, C3402b c3402b, C6159e c6159e, Screen.C3527b c3527b, Context context2, ViewGroup viewGroup) {
                return GovernmentIdStepFragment.m17766x2(c5717x, c3402b, c6159e, c3527b, context2, viewGroup);
            }
        });
        int i10 = C3576c.f14202a[initialRendering.getDesignVersion().ordinal()];
        if (i10 == 1) {
            enumC12498d = EnumC12498d.DefaultGovIdCapture;
        } else {
            if (i10 != 2) {
                throw new C7345l();
            }
            enumC12498d = EnumC12498d.K0000GovIdCapture;
        }
        InterfaceC7664w.a aVar = (InterfaceC7664w.a) aVarM46814c.m46815a(enumC12498d);
        C5717x c5717x = m17775K2().get();
        Intrinsics.checkNotNullExpressionValue(c5717x, "get(...)");
        C3402b c3402bM17773I2 = m17773I2();
        C6159e c6159eM17774J2 = m17774J2();
        Intrinsics.checkNotNull(context);
        InterfaceC7664w interfaceC7664wMo31656b = aVar.mo31656b(c5717x, c3402bM17773I2, c6159eM17774J2, initialRendering, context, ((C9529e) m32421b2()).f34377b);
        this.cameraController = interfaceC7664wMo31656b.getCameraController();
        InterfaceC5683g cameraController = interfaceC7664wMo31656b.getCameraController();
        C5717x c5717x2 = m17775K2().get();
        Intrinsics.checkNotNullExpressionValue(c5717x2, "get(...)");
        return new Pair<>(new C7662u(context, interfaceC7664wMo31656b, cameraController, c5717x2, m17777M2()), interfaceC7664wMo31656b.getRoot());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y2 */
    public final void m17785y2(Screen.C3529d rendering, Context context) {
        Object obj = this.currentRunner;
        View view = null;
        if (!(obj instanceof C11435j)) {
            obj = null;
        }
        Object obj2 = (C11435j) obj;
        if (obj2 == null) {
            C9525a c9525aM37611c = C9525a.m37611c(LayoutInflater.from(context), ((C9529e) m32421b2()).f34377b, false);
            Intrinsics.checkNotNullExpressionValue(c9525aM37611c, "inflate(...)");
            Pair pair = new Pair(new C11435j(c9525aM37611c), c9525aM37611c.getRoot());
            Object objM31671a = pair.m31671a();
            view = (View) pair.m31672b();
            obj2 = objM31671a;
        }
        EnumC12529l transition = rendering.mo17319b(this.currentScreen) ? EnumC12529l.NONE : rendering.getTransition();
        if (view != null) {
            m17781Q2(view, transition);
        }
        ((C11435j) obj2).mo1442a(rendering, m17778N2());
        this.currentRunner = obj2;
    }

    /* JADX INFO: renamed from: z2 */
    public final void m17786z2(Screen.C3531f rendering, Context context) {
        Object obj = this.currentRunner;
        View view = null;
        if (!(obj instanceof C10631a)) {
            obj = null;
        }
        Object objM31671a = (C10631a) obj;
        if (objM31671a == null) {
            FrameLayout frameLayout = new FrameLayout(context);
            C1164s c1164s = C1164s.f4917a;
            UiComponentScreen uiScreen = rendering.getUiScreen();
            Function2<? super C9546b, ? super Map<String, ComponentView>, Unit> function2 = new Function2() { // from class: qo.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return GovernmentIdStepFragment.m17746A2((C9546b) obj2, (Map) obj3);
                }
            };
            InterfaceC14057n interfaceC14057n = new InterfaceC14057n() { // from class: qo.l
                @Override // p615zt.InterfaceC14057n
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return GovernmentIdStepFragment.m17747B2((C9546b) obj2, (Screen.C3531f) obj3, (Map) obj4);
                }
            };
            C9546b c9546bM37676c = C9546b.m37676c(LayoutInflater.from(frameLayout.getContext()), frameLayout, false);
            Intrinsics.checkNotNullExpressionValue(c9546bM37676c, "inflate(...)");
            frameLayout.removeAllViews();
            frameLayout.addView(c9546bM37676c.getRoot());
            Pair pair = new Pair(new C10631a(new C3577d(uiScreen, c9546bM37676c, interfaceC14057n, c1164s.m6530l(c9546bM37676c, uiScreen, function2, true))), frameLayout);
            objM31671a = pair.m31671a();
            view = (View) pair.m31672b();
        }
        EnumC12529l transition = rendering.mo17319b(this.currentScreen) ? EnumC12529l.NONE : rendering.getTransition();
        if (view != null) {
            m17781Q2(view, transition);
        }
        ((C10631a) objM31671a).mo6493b(rendering, m17776L2());
        this.currentRunner = objM31671a;
    }
}
