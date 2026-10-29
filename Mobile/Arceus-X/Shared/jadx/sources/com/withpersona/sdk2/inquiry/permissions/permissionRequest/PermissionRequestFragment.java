package com.withpersona.sdk2.inquiry.permissions.permissionRequest;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0934h;
import androidx.fragment.app.ComponentCallbacksC0929c;
import androidx.fragment.app.FragmentManager;
import androidx.p616lifecycle.C0941a1;
import androidx.p616lifecycle.C0944b1;
import androidx.p616lifecycle.C0967l0;
import androidx.p616lifecycle.C0982t;
import androidx.p616lifecycle.InterfaceC0947c1;
import androidx.p616lifecycle.InterfaceC0962j;
import androidx.p616lifecycle.InterfaceC0980s;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.PermissionState;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment;
import com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager;
import kotlin.Metadata;
import kotlin.Unit;
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
import p088e.AbstractC4717m0;
import p088e.C4723p0;
import p093e4.C4822l0;
import p093e4.C4836u;
import p203j.ActivityC6992b;
import p226jq.C7259g;
import p229jt.C7334d;
import p229jt.C7342i;
import p229jt.C7345l;
import p229jt.C7348o;
import p229jt.EnumC7344k;
import p229jt.InterfaceC7341h;
import p235k2.C7410b;
import p237k4.CreationExtras;
import p253kq.C7811b;
import p253kq.C7812c;
import p256ku.C7882k;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p341oq.AbstractC9844c;
import p341oq.C9845d;
import p344ot.C10047c;
import p419rp.C11040n1;
import p419rp.CheckRequestPermissionRationaleStateView;
import p419rp.EnumC11024i0;
import p419rp.EnumC11028j1;
import p434sp.C11443b;
import p434sp.C11444c;
import p615zt.InterfaceC14057n;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003%&'B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006("}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;", "Loq/c;", "Lsp/b;", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$d;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "rendering", "o2", "(Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$d;)V", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$PermissionRequestFragmentArgs;", "j0", "Lkq/c;", "l2", "()Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$PermissionRequestFragmentArgs;", "args", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/c$a;", "k0", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/c$a;", "n2", "()Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/c$a;", "setViewModelFactory", "(Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/c$a;)V", "viewModelFactory", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/c;", "l0", "Ljt/h;", "m2", "()Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/c;", "viewModel", "m0", "b", "PermissionRequestFragmentArgs", "PermissionRequestFragmentResult", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class PermissionRequestFragment extends AbstractC9844c<C11443b, PermissionRequestStateManager.InterfaceC3892d> {

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    @NotNull
    public final C7812c args;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public C3873c.a viewModelFactory;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h viewModel;

    @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017¨\u0006\u0018"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$PermissionRequestFragmentArgs;", "Landroid/os/Parcelable;", "", "requestId", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;", "props", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "b", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;", "()Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class PermissionRequestFragmentArgs implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<PermissionRequestFragmentArgs> CREATOR = new C3859a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String requestId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final PermissionRequestWorkflow.Props props;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment$PermissionRequestFragmentArgs$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3859a implements Parcelable.Creator<PermissionRequestFragmentArgs> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PermissionRequestFragmentArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PermissionRequestFragmentArgs(parcel.readString(), PermissionRequestWorkflow.Props.CREATOR.createFromParcel(parcel));
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final PermissionRequestFragmentArgs[] newArray(int i10) {
                return new PermissionRequestFragmentArgs[i10];
            }
        }

        public PermissionRequestFragmentArgs(@NotNull String requestId, @NotNull PermissionRequestWorkflow.Props props) {
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            Intrinsics.checkNotNullParameter(props, "props");
            this.requestId = requestId;
            this.props = props;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final PermissionRequestWorkflow.Props getProps() {
            return this.props;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getRequestId() {
            return this.requestId;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.requestId);
            this.props.writeToParcel(dest, flags);
        }
    }

    @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017¨\u0006\u0018"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$PermissionRequestFragmentResult;", "Landroid/os/Parcelable;", "", "requestId", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;", "permissionState", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "b", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;", "()Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class PermissionRequestFragmentResult implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<PermissionRequestFragmentResult> CREATOR = new C3860a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String requestId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final PermissionState permissionState;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment$PermissionRequestFragmentResult$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3860a implements Parcelable.Creator<PermissionRequestFragmentResult> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PermissionRequestFragmentResult createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PermissionRequestFragmentResult(parcel.readString(), PermissionState.CREATOR.createFromParcel(parcel));
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final PermissionRequestFragmentResult[] newArray(int i10) {
                return new PermissionRequestFragmentResult[i10];
            }
        }

        public PermissionRequestFragmentResult(@NotNull String requestId, @NotNull PermissionState permissionState) {
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            Intrinsics.checkNotNullParameter(permissionState, "permissionState");
            this.requestId = requestId;
            this.permissionState = permissionState;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final PermissionState getPermissionState() {
            return this.permissionState;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getRequestId() {
            return this.requestId;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.requestId);
            this.permissionState.writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class C3861a extends C7744k implements InterfaceC14057n<LayoutInflater, ViewGroup, Boolean, C11443b> {

        /* JADX INFO: renamed from: a */
        public static final C3861a f15863a = new C3861a();

        public C3861a() {
            super(3, C11443b.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/permissions/databinding/Pi2FragmentPermissionRequestBinding;", 0);
        }

        /* JADX INFO: renamed from: d */
        public final C11443b m19185d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            return C11443b.m42858c(p8, viewGroup, z10);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p615zt.InterfaceC14057n
        public /* bridge */ /* synthetic */ C11443b invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return m19185d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment$b, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$b;", "", "<init>", "()V", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", "viewId", "", "requestId", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;", "props", "", "a", "(Landroidx/fragment/app/FragmentManager;ILjava/lang/String;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)V", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m19186a(@NotNull FragmentManager fragmentManager, int viewId, @NotNull String requestId, @NotNull PermissionRequestWorkflow.Props props) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            Intrinsics.checkNotNullParameter(props, "props");
            AbstractC0934h abstractC0934hM4452r = fragmentManager.m4452r();
            abstractC0934hM4452r.m4775b(viewId, C7811b.m32425a(new PermissionRequestFragment(), new PermissionRequestFragmentArgs(requestId, props)), "Pi2PermissionRequestFragment");
            abstractC0934hM4452r.mo4510i();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment$c */
    @Metadata(m31664d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31665d2 = {"com/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$c", "Le/m0;", "", "handleOnBackPressed", "()V", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3863c extends AbstractC4717m0 {

        /* JADX INFO: renamed from: X */
        public final /* synthetic */ PermissionRequestStateManager f15864X;

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ PermissionRequestFragment f15865Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3863c(PermissionRequestStateManager permissionRequestStateManager, PermissionRequestFragment permissionRequestFragment) {
            super(true);
            this.f15864X = permissionRequestStateManager;
            this.f15865Y = permissionRequestFragment;
        }

        @Override // p088e.AbstractC4717m0
        public void handleOnBackPressed() {
            this.f15864X.m45394a().setValue(new PermissionRequestWorkflow.Output(new PermissionState(this.f15865Y.m19173l2().getProps().getPermission(), EnumC11028j1.PermissionRejected)));
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment$d */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment$onViewCreated$2", m39664f = "PermissionRequestFragment.kt", m39665l = {96}, m39666m = "invokeSuspend")
    public static final class C3864d extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f15866t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ PermissionRequestStateManager f15867u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ PermissionRequestFragment f15868v;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment$d$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ PermissionRequestStateManager f15869a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ PermissionRequestFragment f15870b;

            public a(PermissionRequestStateManager permissionRequestStateManager, PermissionRequestFragment permissionRequestFragment) {
                this.f15869a = permissionRequestStateManager;
                this.f15870b = permissionRequestFragment;
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object; */
            @Override // nu.InterfaceC9577i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(PermissionRequestWorkflow.Output output, InterfaceC9557b<? super Unit> interfaceC9557b) {
                if (output == null) {
                    return Unit.f29331a;
                }
                this.f15869a.m45394a().setValue(null);
                PermissionRequestFragment permissionRequestFragment = this.f15870b;
                Bundle bundle = new Bundle();
                bundle.putParcelable("pi2_result", new PermissionRequestFragmentResult(this.f15870b.m19173l2().getRequestId(), output.getPermissionState()));
                Unit unit = Unit.f29331a;
                C4836u.m23391a(permissionRequestFragment, "pi2_permission_request_request", bundle);
                FragmentManager fragmentManagerM4617M = this.f15870b.m4617M();
                Intrinsics.checkNotNullExpressionValue(fragmentManagerM4617M, "getParentFragmentManager(...)");
                PermissionRequestFragment permissionRequestFragment2 = this.f15870b;
                AbstractC0934h abstractC0934hM4452r = fragmentManagerM4617M.m4452r();
                abstractC0934hM4452r.mo4513m(permissionRequestFragment2);
                abstractC0934hM4452r.mo4508g();
                return Unit.f29331a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3864d(PermissionRequestStateManager permissionRequestStateManager, PermissionRequestFragment permissionRequestFragment, InterfaceC9557b<? super C3864d> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f15867u = permissionRequestStateManager;
            this.f15868v = permissionRequestFragment;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3864d(this.f15867u, this.f15868v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f15866t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9566c0<PermissionRequestWorkflow.Output> interfaceC9566c0M45394a = this.f15867u.m45394a();
                a aVar = new a(this.f15867u, this.f15868v);
                this.f15866t = 1;
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
            return ((C3864d) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment$e */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3865e implements Function0<Bundle> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ComponentCallbacksC0929c f15871a;

        public C3865e(ComponentCallbacksC0929c componentCallbacksC0929c) {
            this.f15871a = componentCallbacksC0929c;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle bundleM4704t = this.f15871a.m4704t();
            if (bundleM4704t != null) {
                return bundleM4704t;
            }
            throw new IllegalStateException("Fragment " + this.f15871a + " has null arguments");
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment$f */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3866f implements Function0<C0941a1.c> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ComponentCallbacksC0929c f15872a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f15873b;

        public C3866f(ComponentCallbacksC0929c componentCallbacksC0929c, Function1 function1) {
            this.f15872a = componentCallbacksC0929c;
            this.f15873b = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0941a1.c invoke() {
            return new C9845d(this.f15872a, this.f15873b);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment$g */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/fragment/app/c;", "b", "()Landroidx/fragment/app/c;"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class C3867g extends AbstractC7746m implements Function0<ComponentCallbacksC0929c> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ ComponentCallbacksC0929c f15874i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3867g(ComponentCallbacksC0929c componentCallbacksC0929c) {
            super(0);
            this.f15874i = componentCallbacksC0929c;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ComponentCallbacksC0929c invoke() {
            return this.f15874i;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment$h */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/c1;", "b", "()Landroidx/lifecycle/c1;"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class C3868h extends AbstractC7746m implements Function0<InterfaceC0947c1> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Function0 f15875i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3868h(Function0 function0) {
            super(0);
            this.f15875i = function0;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC0947c1 invoke() {
            return (InterfaceC0947c1) this.f15875i.invoke();
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment$i */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/b1;", "b", "()Landroidx/lifecycle/b1;"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class C3869i extends AbstractC7746m implements Function0<C0944b1> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC7341h f15876i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3869i(InterfaceC7341h interfaceC7341h) {
            super(0);
            this.f15876i = interfaceC7341h;
        }

        /* JADX DEBUG: Class process forced to load method for inline: e4.l0.a(jt.h):androidx.lifecycle.c1 */
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C0944b1 invoke() {
            return C4822l0.m23349c(this.f15876i).mo4712w();
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment$j */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Lk4/a;", "b", "()Lk4/a;"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class C3870j extends AbstractC7746m implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Function0 f15877i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ InterfaceC7341h f15878j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3870j(Function0 function0, InterfaceC7341h interfaceC7341h) {
            super(0);
            this.f15877i = function0;
            this.f15878j = interfaceC7341h;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f15877i;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            InterfaceC0947c1 interfaceC0947c1M23349c = C4822l0.m23349c(this.f15878j);
            InterfaceC0962j interfaceC0962j = interfaceC0947c1M23349c instanceof InterfaceC0962j ? (InterfaceC0962j) interfaceC0947c1M23349c : null;
            return interfaceC0962j != null ? interfaceC0962j.mo4653Z() : CreationExtras.b.f28722c;
        }
    }

    public PermissionRequestFragment() {
        super(C3861a.f15863a);
        this.args = new C7812c(C7731d0.m32002b(PermissionRequestFragmentArgs.class), new C3865e(this));
        C3866f c3866f = new C3866f(this, new Function1() { // from class: tp.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PermissionRequestFragment.m19172q2(this.f41390a, (C0967l0) obj);
            }
        });
        InterfaceC7341h interfaceC7341hM30455a = C7342i.m30455a(EnumC7344k.NONE, new C3868h(new C3867g(this)));
        this.viewModel = C4822l0.m23348b(this, C7731d0.m32002b(C3873c.class), new C3869i(interfaceC7341hM30455a), new C3870j(null, interfaceC7341hM30455a), c3866f);
    }

    /* JADX INFO: renamed from: p2 */
    public static final void m19171p2(FrameLayout frameLayout, CheckRequestPermissionRationaleStateView checkRequestPermissionRationaleStateView, ActivityC6992b activityC6992b) {
        if (frameLayout.isAttachedToWindow()) {
            if (checkRequestPermissionRationaleStateView.getPermission() != EnumC11024i0.RecordAudio || checkRequestPermissionRationaleStateView.getIsPermanentPermissionRejectionCheck()) {
                checkRequestPermissionRationaleStateView.m41722a().invoke(Boolean.valueOf(C7410b.m30698v(activityC6992b, C11040n1.m41737c(checkRequestPermissionRationaleStateView.getPermission()))));
            } else {
                checkRequestPermissionRationaleStateView.m41722a().invoke(Boolean.TRUE);
            }
        }
    }

    /* JADX INFO: renamed from: q2 */
    public static final C3873c m19172q2(PermissionRequestFragment permissionRequestFragment, C0967l0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return permissionRequestFragment.m19175n2().mo19197a(it);
    }

    @Override // p341oq.AbstractC9844c, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: e1 */
    public void mo4667e1(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.mo4667e1(view, savedInstanceState);
        PermissionRequestStateManager permissionRequestStateManagerM19196e = m19174m2().m19196e(m19173l2().getProps());
        C4723p0 c4723p0Mo23043Q = m4606H1().mo23043Q();
        InterfaceC0980s interfaceC0980sM4680k0 = m4680k0();
        Intrinsics.checkNotNullExpressionValue(interfaceC0980sM4680k0, "getViewLifecycleOwner(...)");
        c4723p0Mo23043Q.m23077d(interfaceC0980sM4680k0, new C3863c(permissionRequestStateManagerM19196e, this));
        m38732g2(permissionRequestStateManagerM19196e.m45396c());
        InterfaceC0980s interfaceC0980sM4680k1 = m4680k0();
        Intrinsics.checkNotNullExpressionValue(interfaceC0980sM4680k1, "getViewLifecycleOwner(...)");
        C7882k.m32780d(C0982t.m4979a(interfaceC0980sM4680k1), null, null, new C3864d(permissionRequestStateManagerM19196e, this, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Args */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l2 */
    public final PermissionRequestFragmentArgs m19173l2() {
        return (PermissionRequestFragmentArgs) this.args.getValue();
    }

    /* JADX INFO: renamed from: m2 */
    public final C3873c m19174m2() {
        return (C3873c) this.viewModel.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: n2 */
    public final C3873c.a m19175n2() {
        C3873c.a aVar = this.viewModelFactory;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.m31998u("viewModelFactory");
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: h2(Ljava/lang/Object;)V */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p341oq.AbstractC9844c
    /* JADX INFO: renamed from: o2, reason: merged with bridge method [inline-methods] */
    public void mo16775h2(@NotNull PermissionRequestStateManager.InterfaceC3892d rendering) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        final FrameLayout content = ((C11443b) m32421b2()).f40448b;
        Intrinsics.checkNotNullExpressionValue(content, "content");
        content.removeAllViews();
        if (rendering instanceof PermissionRequestStateManager.InterfaceC3892d.a) {
            PermissionRequestStateManager.InterfaceC3892d.a aVar = (PermissionRequestStateManager.InterfaceC3892d.a) rendering;
            aVar.getView();
            C11444c c11444cM42861c = C11444c.m42861c(LayoutInflater.from(mo4715x()), content, true);
            Intrinsics.checkNotNullExpressionValue(c11444cM42861c, "inflate(...)");
            aVar.getView().m41715i(c11444cM42861c);
            aVar.getView().m41716n(c11444cM42861c, aVar.getView());
            return;
        }
        if (!(rendering instanceof PermissionRequestStateManager.InterfaceC3892d.b)) {
            throw new C7345l();
        }
        final CheckRequestPermissionRationaleStateView checkRequestPermissionRationaleStateViewM19266a = ((PermissionRequestStateManager.InterfaceC3892d.b) rendering).getView();
        Context context = content.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final ActivityC6992b activityC6992bM30274h = C7259g.m30274h(context);
        if (checkRequestPermissionRationaleStateViewM19266a.m41722a() != null) {
            content.post(new Runnable() { // from class: tp.b
                @Override // java.lang.Runnable
                public final void run() {
                    PermissionRequestFragment.m19171p2(content, checkRequestPermissionRationaleStateViewM19266a, activityC6992bM30274h);
                }
            });
        }
    }
}
