package com.withpersona.sdk2.inquiry.internal.workflows;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.ComponentCallbacksC0929c;
import androidx.fragment.app.FragmentManager;
import androidx.p616lifecycle.C0941a1;
import androidx.p616lifecycle.C0944b1;
import androidx.p616lifecycle.C0967l0;
import androidx.p616lifecycle.C0982t;
import androidx.p616lifecycle.InterfaceC0947c1;
import androidx.p616lifecycle.InterfaceC0962j;
import androidx.p616lifecycle.InterfaceC0980s;
import com.withpersona.sdk2.inquiry.internal.C3690i;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Output;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props;
import com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.C3877g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7746m;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nu.InterfaceC9566c0;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p032bp.C1481c;
import p086dt.InterfaceC4687a;
import p086dt.InterfaceC4690d;
import p093e4.C4822l0;
import p152go.C6159e;
import p177hp.C6491e0;
import p177hp.C6510n0;
import p177hp.InterfaceC6520s0;
import p229jt.C7334d;
import p229jt.C7342i;
import p229jt.C7348o;
import p229jt.EnumC7344k;
import p229jt.InterfaceC7341h;
import p237k4.CreationExtras;
import p253kq.C7810a;
import p253kq.C7811b;
import p253kq.C7812c;
import p256ku.C7882k;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p341oq.C9845d;
import p344ot.C10047c;
import p498vq.C12247a;
import p610zo.InterfaceC13982s;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 ]2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002^_B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00160\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001c8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010K\u001a\u00020D8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001b\u0010Q\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001b\u0010V\u001a\u00020R8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bS\u0010N\u001a\u0004\bT\u0010UR\u001b\u0010\\\u001a\u00020W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[¨\u0006`"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;", "Lkq/a;", "Lbp/c;", "Ldt/d;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "F0", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "J0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "Ldt/a;", "", "c", "()Ldt/a;", "Lcom/withpersona/sdk2/inquiry/internal/i;", "p2", "()Lcom/withpersona/sdk2/inquiry/internal/i;", "Lzo/s;", "h0", "Lzo/s;", "j2", "()Lzo/s;", "setInquiryComponent$inquiry_internal_release", "(Lzo/s;)V", "inquiryComponent", "Lcom/withpersona/sdk2/inquiry/internal/workflows/c$a;", "i0", "Lcom/withpersona/sdk2/inquiry/internal/workflows/c$a;", "m2", "()Lcom/withpersona/sdk2/inquiry/internal/workflows/c$a;", "setViewModelFactory", "(Lcom/withpersona/sdk2/inquiry/internal/workflows/c$a;)V", "viewModelFactory", "Lcom/withpersona/sdk2/inquiry/internal/workflows/e$a;", "j0", "Lcom/withpersona/sdk2/inquiry/internal/workflows/e$a;", "o2", "()Lcom/withpersona/sdk2/inquiry/internal/workflows/e$a;", "setWorkflowStateViewModelFactory", "(Lcom/withpersona/sdk2/inquiry/internal/workflows/e$a;)V", "workflowStateViewModelFactory", "Lvq/a;", "k0", "Lvq/a;", "getSystemUiController", "()Lvq/a;", "setSystemUiController", "(Lvq/a;)V", "systemUiController", "Lgo/e;", "l0", "Lgo/e;", "getFeatureFlagManager", "()Lgo/e;", "setFeatureFlagManager", "(Lgo/e;)V", "featureFlagManager", "Lhp/n0;", "m0", "Lhp/n0;", "k2", "()Lhp/n0;", "setInquiryStateRenderer", "(Lhp/n0;)V", "inquiryStateRenderer", "Lcom/withpersona/sdk2/inquiry/internal/workflows/c;", "n0", "Ljt/h;", "l2", "()Lcom/withpersona/sdk2/inquiry/internal/workflows/c;", "viewModel", "Lcom/withpersona/sdk2/inquiry/internal/workflows/e;", "o0", "n2", "()Lcom/withpersona/sdk2/inquiry/internal/workflows/e;", "workflowStateViewModel", "Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$WorkflowFragmentArgs;", "p0", "Lkq/c;", "i2", "()Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$WorkflowFragmentArgs;", "args", "q0", "WorkflowFragmentArgs", "a", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class InquiryWorkflowFragment extends C7810a<C1481c> implements InterfaceC4690d {

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public InterfaceC13982s inquiryComponent;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public C3740c.a viewModelFactory;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public C3742e.a workflowStateViewModelFactory;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public C12247a systemUiController;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public C6159e featureFlagManager;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public C6510n0 inquiryStateRenderer;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h viewModel;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h workflowStateViewModel;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    @NotNull
    public final C7812c args;

    @Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0012\u0010\u001a¨\u0006\u001b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$WorkflowFragmentArgs;", "Landroid/os/Parcelable;", "", "inquiryId", "sessionToken", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;", "inquiryWorkflowProps", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getInquiryId", "()Ljava/lang/String;", "b", "getSessionToken", "c", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;", "()Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class WorkflowFragmentArgs implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<WorkflowFragmentArgs> CREATOR = new C3723a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public final String inquiryId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final String sessionToken;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final InquiryWorkflow$Props inquiryWorkflowProps;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment$WorkflowFragmentArgs$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3723a implements Parcelable.Creator<WorkflowFragmentArgs> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final WorkflowFragmentArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WorkflowFragmentArgs(parcel.readString(), parcel.readString(), (InquiryWorkflow$Props) parcel.readParcelable(WorkflowFragmentArgs.class.getClassLoader()));
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final WorkflowFragmentArgs[] newArray(int i10) {
                return new WorkflowFragmentArgs[i10];
            }
        }

        public WorkflowFragmentArgs(@Nullable String str, @Nullable String str2, @NotNull InquiryWorkflow$Props inquiryWorkflowProps) {
            Intrinsics.checkNotNullParameter(inquiryWorkflowProps, "inquiryWorkflowProps");
            this.inquiryId = str;
            this.sessionToken = str2;
            this.inquiryWorkflowProps = inquiryWorkflowProps;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final InquiryWorkflow$Props getInquiryWorkflowProps() {
            return this.inquiryWorkflowProps;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.inquiryId);
            dest.writeString(this.sessionToken);
            dest.writeParcelable(this.inquiryWorkflowProps, flags);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$a;", "", "<init>", "()V", "", "inquiryId", "sessionToken", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;", "inquiryWorkflowProps", "Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;", "a", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;)Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final InquiryWorkflowFragment m18846a(@Nullable String inquiryId, @Nullable String sessionToken, @NotNull InquiryWorkflow$Props inquiryWorkflowProps) {
            Intrinsics.checkNotNullParameter(inquiryWorkflowProps, "inquiryWorkflowProps");
            return (InquiryWorkflowFragment) C7811b.m32425a(new InquiryWorkflowFragment(), new WorkflowFragmentArgs(inquiryId, sessionToken, inquiryWorkflowProps));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment$onViewCreated$1", m39664f = "InquiryWorkflowFragment.kt", m39665l = {117}, m39666m = "invokeSuspend")
    public static final class C3725b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f15586t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ C6491e0 f15587u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ InquiryWorkflowFragment f15588v;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment$b$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InquiryWorkflowFragment f15589a;

            public a(InquiryWorkflowFragment inquiryWorkflowFragment) {
                this.f15589a = inquiryWorkflowFragment;
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object; */
            @Override // nu.InterfaceC9577i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(InterfaceC6520s0 interfaceC6520s0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                C6510n0 c6510n0M18837k2 = this.f15589a.m18837k2();
                C1481c c1481cM32421b2 = this.f15589a.m32421b2();
                FragmentManager fragmentManagerM4709v = this.f15589a.m4709v();
                Intrinsics.checkNotNullExpressionValue(fragmentManagerM4709v, "getChildFragmentManager(...)");
                c6510n0M18837k2.m28347h(interfaceC6520s0, c1481cM32421b2, fragmentManagerM4709v);
                return Unit.f29331a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3725b(C6491e0 c6491e0, InquiryWorkflowFragment inquiryWorkflowFragment, InterfaceC9557b<? super C3725b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f15587u = c6491e0;
            this.f15588v = inquiryWorkflowFragment;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3725b(this.f15587u, this.f15588v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f15586t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9566c0<InterfaceC6520s0> interfaceC9566c0M45396c = this.f15587u.m45396c();
                a aVar = new a(this.f15588v);
                this.f15586t = 1;
                if (interfaceC9566c0M45396c.collect(aVar, this) == objM38805e) {
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
            return ((C3725b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment$onViewCreated$2", m39664f = "InquiryWorkflowFragment.kt", m39665l = {126}, m39666m = "invokeSuspend")
    public static final class C3726c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f15590t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ C6491e0 f15591u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ InquiryWorkflowFragment f15592v;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment$c$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C6491e0 f15593a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ InquiryWorkflowFragment f15594b;

            public a(C6491e0 c6491e0, InquiryWorkflowFragment inquiryWorkflowFragment) {
                this.f15593a = c6491e0;
                this.f15594b = inquiryWorkflowFragment;
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object; */
            @Override // nu.InterfaceC9577i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(InquiryWorkflow$Output inquiryWorkflow$Output, InterfaceC9557b<? super Unit> interfaceC9557b) {
                if (inquiryWorkflow$Output == null) {
                    return Unit.f29331a;
                }
                this.f15593a.m45394a().setValue(null);
                this.f15594b.m18842p2().m18565o2(inquiryWorkflow$Output);
                return Unit.f29331a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3726c(C6491e0 c6491e0, InquiryWorkflowFragment inquiryWorkflowFragment, InterfaceC9557b<? super C3726c> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f15591u = c6491e0;
            this.f15592v = inquiryWorkflowFragment;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3726c(this.f15591u, this.f15592v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f15590t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9566c0<InquiryWorkflow$Output> interfaceC9566c0M45394a = this.f15591u.m45394a();
                a aVar = new a(this.f15591u, this.f15592v);
                this.f15590t = 1;
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
            return ((C3726c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment$d */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3727d implements Function0<Bundle> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ComponentCallbacksC0929c f15595a;

        public C3727d(ComponentCallbacksC0929c componentCallbacksC0929c) {
            this.f15595a = componentCallbacksC0929c;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle bundleM4704t = this.f15595a.m4704t();
            if (bundleM4704t != null) {
                return bundleM4704t;
            }
            throw new IllegalStateException("Fragment " + this.f15595a + " has null arguments");
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment$e */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Lk4/a;", "b", "()Lk4/a;"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class C3728e extends AbstractC7746m implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Function0 f15596i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ InterfaceC7341h f15597j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3728e(Function0 function0, InterfaceC7341h interfaceC7341h) {
            super(0);
            this.f15596i = function0;
            this.f15597j = interfaceC7341h;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f15596i;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            InterfaceC0947c1 interfaceC0947c1M23349c = C4822l0.m23349c(this.f15597j);
            InterfaceC0962j interfaceC0962j = interfaceC0947c1M23349c instanceof InterfaceC0962j ? (InterfaceC0962j) interfaceC0947c1M23349c : null;
            return interfaceC0962j != null ? interfaceC0962j.mo4653Z() : CreationExtras.b.f28722c;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment$f */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3729f implements Function0<C0941a1.c> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ComponentCallbacksC0929c f15598a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f15599b;

        public C3729f(ComponentCallbacksC0929c componentCallbacksC0929c, Function1 function1) {
            this.f15598a = componentCallbacksC0929c;
            this.f15599b = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0941a1.c invoke() {
            return new C9845d(this.f15598a, this.f15599b);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment$g */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/fragment/app/c;", "b", "()Landroidx/fragment/app/c;"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class C3730g extends AbstractC7746m implements Function0<ComponentCallbacksC0929c> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ ComponentCallbacksC0929c f15600i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3730g(ComponentCallbacksC0929c componentCallbacksC0929c) {
            super(0);
            this.f15600i = componentCallbacksC0929c;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ComponentCallbacksC0929c invoke() {
            return this.f15600i;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment$h */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/c1;", "b", "()Landroidx/lifecycle/c1;"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class C3731h extends AbstractC7746m implements Function0<InterfaceC0947c1> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Function0 f15601i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3731h(Function0 function0) {
            super(0);
            this.f15601i = function0;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC0947c1 invoke() {
            return (InterfaceC0947c1) this.f15601i.invoke();
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment$i */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/b1;", "b", "()Landroidx/lifecycle/b1;"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class C3732i extends AbstractC7746m implements Function0<C0944b1> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC7341h f15602i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3732i(InterfaceC7341h interfaceC7341h) {
            super(0);
            this.f15602i = interfaceC7341h;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C0944b1 invoke() {
            return C4822l0.m23349c(this.f15602i).mo4712w();
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment$j */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Lk4/a;", "b", "()Lk4/a;"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class C3733j extends AbstractC7746m implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Function0 f15603i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ InterfaceC7341h f15604j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3733j(Function0 function0, InterfaceC7341h interfaceC7341h) {
            super(0);
            this.f15603i = function0;
            this.f15604j = interfaceC7341h;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f15603i;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            InterfaceC0947c1 interfaceC0947c1M23349c = C4822l0.m23349c(this.f15604j);
            InterfaceC0962j interfaceC0962j = interfaceC0947c1M23349c instanceof InterfaceC0962j ? (InterfaceC0962j) interfaceC0947c1M23349c : null;
            return interfaceC0962j != null ? interfaceC0962j.mo4653Z() : CreationExtras.b.f28722c;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment$k */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3734k implements Function0<C0941a1.c> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ComponentCallbacksC0929c f15605a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f15606b;

        public C3734k(ComponentCallbacksC0929c componentCallbacksC0929c, Function1 function1) {
            this.f15605a = componentCallbacksC0929c;
            this.f15606b = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0941a1.c invoke() {
            return new C9845d(this.f15605a, this.f15606b);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment$l */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/fragment/app/c;", "b", "()Landroidx/fragment/app/c;"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class C3735l extends AbstractC7746m implements Function0<ComponentCallbacksC0929c> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ ComponentCallbacksC0929c f15607i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3735l(ComponentCallbacksC0929c componentCallbacksC0929c) {
            super(0);
            this.f15607i = componentCallbacksC0929c;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ComponentCallbacksC0929c invoke() {
            return this.f15607i;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment$m */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/c1;", "b", "()Landroidx/lifecycle/c1;"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class C3736m extends AbstractC7746m implements Function0<InterfaceC0947c1> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Function0 f15608i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3736m(Function0 function0) {
            super(0);
            this.f15608i = function0;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC0947c1 invoke() {
            return (InterfaceC0947c1) this.f15608i.invoke();
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment$n */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/b1;", "b", "()Landroidx/lifecycle/b1;"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class C3737n extends AbstractC7746m implements Function0<C0944b1> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC7341h f15609i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3737n(InterfaceC7341h interfaceC7341h) {
            super(0);
            this.f15609i = interfaceC7341h;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C0944b1 invoke() {
            return C4822l0.m23349c(this.f15609i).mo4712w();
        }
    }

    public InquiryWorkflowFragment() {
        C3729f c3729f = new C3729f(this, new Function1() { // from class: kp.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InquiryWorkflowFragment.m18832q2(this.f29610a, (C0967l0) obj);
            }
        });
        C3730g c3730g = new C3730g(this);
        EnumC7344k enumC7344k = EnumC7344k.NONE;
        InterfaceC7341h interfaceC7341hM30455a = C7342i.m30455a(enumC7344k, new C3731h(c3730g));
        this.viewModel = C4822l0.m23348b(this, C7731d0.m32002b(C3740c.class), new C3732i(interfaceC7341hM30455a), new C3733j(null, interfaceC7341hM30455a), c3729f);
        C3734k c3734k = new C3734k(this, new Function1() { // from class: kp.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InquiryWorkflowFragment.m18833r2(this.f29611a, (C0967l0) obj);
            }
        });
        InterfaceC7341h interfaceC7341hM30455a2 = C7342i.m30455a(enumC7344k, new C3736m(new C3735l(this)));
        this.workflowStateViewModel = C4822l0.m23348b(this, C7731d0.m32002b(C3742e.class), new C3737n(interfaceC7341hM30455a2), new C3728e(null, interfaceC7341hM30455a2), c3734k);
        this.args = new C7812c(C7731d0.m32002b(WorkflowFragmentArgs.class), new C3727d(this));
    }

    /* JADX INFO: renamed from: q2 */
    public static final C3740c m18832q2(InquiryWorkflowFragment inquiryWorkflowFragment, C0967l0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return inquiryWorkflowFragment.m18839m2().mo18867a(it);
    }

    /* JADX INFO: renamed from: r2 */
    public static final C3742e m18833r2(InquiryWorkflowFragment inquiryWorkflowFragment, C0967l0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return inquiryWorkflowFragment.m18841o2().mo18872a(it);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: F0 */
    public void mo4599F0(@Nullable Bundle savedInstanceState) {
        m18842p2().m18563m2().mo18413a().mo18414a(this);
        super.mo4599F0(savedInstanceState);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    @NotNull
    /* JADX INFO: renamed from: J0 */
    public View mo1225J0(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.mo1225J0(inflater, container, savedInstanceState);
        C1481c c1481cM7595c = C1481c.m7595c(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(c1481cM7595c, "inflate(...)");
        m32424e2(c1481cM7595c);
        FrameLayout root = m32421b2().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // p086dt.InterfaceC4690d
    @NotNull
    /* JADX INFO: renamed from: c */
    public InterfaceC4687a<? super Object> mo18834c() {
        return m18836j2().mo18380a();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: e1 */
    public void mo4667e1(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.mo4667e1(view, savedInstanceState);
        m32421b2().f5757c.setVisibility(0);
        C3877g c3877gMo18388i = m18836j2().mo18388i();
        FragmentManager fragmentManagerM4709v = m4709v();
        Intrinsics.checkNotNullExpressionValue(fragmentManagerM4709v, "getChildFragmentManager(...)");
        int id2 = m32421b2().f5757c.getId();
        InterfaceC0980s interfaceC0980sM4680k0 = m4680k0();
        Intrinsics.checkNotNullExpressionValue(interfaceC0980sM4680k0, "getViewLifecycleOwner(...)");
        c3877gMo18388i.m19210d(fragmentManagerM4709v, id2, interfaceC0980sM4680k0);
        C6491e0 c6491e0M18866e = m18838l2().m18866e(m18835i2().getInquiryWorkflowProps());
        InterfaceC0980s interfaceC0980sM4680k1 = m4680k0();
        Intrinsics.checkNotNullExpressionValue(interfaceC0980sM4680k1, "getViewLifecycleOwner(...)");
        C7882k.m32780d(C0982t.m4979a(interfaceC0980sM4680k1), null, null, new C3725b(c6491e0M18866e, this, null), 3, null);
        InterfaceC0980s interfaceC0980sM4680k2 = m4680k0();
        Intrinsics.checkNotNullExpressionValue(interfaceC0980sM4680k2, "getViewLifecycleOwner(...)");
        C7882k.m32780d(C0982t.m4979a(interfaceC0980sM4680k2), null, null, new C3726c(c6491e0M18866e, this, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Args */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i2 */
    public final WorkflowFragmentArgs m18835i2() {
        return (WorkflowFragmentArgs) this.args.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: j2 */
    public final InterfaceC13982s m18836j2() {
        InterfaceC13982s interfaceC13982s = this.inquiryComponent;
        if (interfaceC13982s != null) {
            return interfaceC13982s;
        }
        Intrinsics.m31998u("inquiryComponent");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k2 */
    public final C6510n0 m18837k2() {
        C6510n0 c6510n0 = this.inquiryStateRenderer;
        if (c6510n0 != null) {
            return c6510n0;
        }
        Intrinsics.m31998u("inquiryStateRenderer");
        return null;
    }

    /* JADX INFO: renamed from: l2 */
    public final C3740c m18838l2() {
        return (C3740c) this.viewModel.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: m2 */
    public final C3740c.a m18839m2() {
        C3740c.a aVar = this.viewModelFactory;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.m31998u("viewModelFactory");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n2 */
    public final C3742e m18840n2() {
        return (C3742e) this.workflowStateViewModel.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: o2 */
    public final C3742e.a m18841o2() {
        C3742e.a aVar = this.workflowStateViewModelFactory;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.m31998u("workflowStateViewModelFactory");
        return null;
    }

    /* JADX INFO: renamed from: p2 */
    public final C3690i m18842p2() {
        ComponentCallbacksC0929c componentCallbacksC0929cM4612K = m4612K();
        Intrinsics.m31981d(componentCallbacksC0929cM4612K, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.InquiryFragment");
        return (C3690i) componentCallbacksC0929cM4612K;
    }
}
