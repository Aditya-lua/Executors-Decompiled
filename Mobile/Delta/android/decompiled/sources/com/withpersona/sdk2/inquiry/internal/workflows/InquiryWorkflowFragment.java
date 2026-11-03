package com.withpersona.sdk2.inquiry.internal.workflows;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.p000lifecycle.a1;
import androidx.p000lifecycle.b1;
import androidx.p000lifecycle.c1;
import androidx.p000lifecycle.t;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Output;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props;
import com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment;
import e4.l0;
import fp.e0;
import fp.n0;
import fp.s0;
import gt.o;
import iu.p0;
import k4.CreationExtras;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import lu.c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xo.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 ]2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002^_B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00160\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001c8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010K\u001a\u00020D8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001b\u0010Q\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001b\u0010V\u001a\u00020R8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bS\u0010N\u001a\u0004\bT\u0010UR\u001b\u0010\\\u001a\u00020W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[¨\u0006`"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;", "Liq/a;", "Lzo/c;", "Lbt/d;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "F0", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "J0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lbt/a;", "", "c", "()Lbt/a;", "Lcom/withpersona/sdk2/inquiry/internal/i;", "p2", "()Lcom/withpersona/sdk2/inquiry/internal/i;", "Lxo/s;", "h0", "Lxo/s;", "j2", "()Lxo/s;", "setInquiryComponent$inquiry_internal_release", "(Lxo/s;)V", "inquiryComponent", "Lcom/withpersona/sdk2/inquiry/internal/workflows/c$a;", "i0", "Lcom/withpersona/sdk2/inquiry/internal/workflows/c$a;", "m2", "()Lcom/withpersona/sdk2/inquiry/internal/workflows/c$a;", "setViewModelFactory", "(Lcom/withpersona/sdk2/inquiry/internal/workflows/c$a;)V", "viewModelFactory", "Lcom/withpersona/sdk2/inquiry/internal/workflows/e$a;", "j0", "Lcom/withpersona/sdk2/inquiry/internal/workflows/e$a;", "o2", "()Lcom/withpersona/sdk2/inquiry/internal/workflows/e$a;", "setWorkflowStateViewModelFactory", "(Lcom/withpersona/sdk2/inquiry/internal/workflows/e$a;)V", "workflowStateViewModelFactory", "Ltq/a;", "k0", "Ltq/a;", "getSystemUiController", "()Ltq/a;", "setSystemUiController", "(Ltq/a;)V", "systemUiController", "Leo/e;", "l0", "Leo/e;", "getFeatureFlagManager", "()Leo/e;", "setFeatureFlagManager", "(Leo/e;)V", "featureFlagManager", "Lfp/n0;", "m0", "Lfp/n0;", "k2", "()Lfp/n0;", "setInquiryStateRenderer", "(Lfp/n0;)V", "inquiryStateRenderer", "Lcom/withpersona/sdk2/inquiry/internal/workflows/c;", "n0", "Lgt/h;", "l2", "()Lcom/withpersona/sdk2/inquiry/internal/workflows/c;", "viewModel", "Lcom/withpersona/sdk2/inquiry/internal/workflows/e;", "o0", "n2", "()Lcom/withpersona/sdk2/inquiry/internal/workflows/e;", "workflowStateViewModel", "Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$WorkflowFragmentArgs;", "p0", "Liq/c;", "i2", "()Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$WorkflowFragmentArgs;", "args", "q0", "WorkflowFragmentArgs", "a", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InquiryWorkflowFragment extends iq.a<zo.c> implements bt.d {

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h0, reason: collision with root package name and from kotlin metadata */
    public s inquiryComponent;

    /* JADX INFO: renamed from: i0, reason: collision with root package name and from kotlin metadata */
    public com.withpersona.sdk2.inquiry.internal.workflows.c.a viewModelFactory;

    /* JADX INFO: renamed from: j0, reason: collision with root package name and from kotlin metadata */
    public com.withpersona.sdk2.inquiry.internal.workflows.e.a workflowStateViewModelFactory;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    public tq.a systemUiController;

    /* JADX INFO: renamed from: l0, reason: collision with root package name and from kotlin metadata */
    public eo.e featureFlagManager;

    /* JADX INFO: renamed from: m0, reason: collision with root package name and from kotlin metadata */
    public n0 inquiryStateRenderer;

    /* JADX INFO: renamed from: n0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gt.h viewModel;

    /* JADX INFO: renamed from: o0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gt.h workflowStateViewModel;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final iq.c args;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0012\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$WorkflowFragmentArgs;", "Landroid/os/Parcelable;", "", "inquiryId", "sessionToken", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;", "inquiryWorkflowProps", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getInquiryId", "()Ljava/lang/String;", "b", "getSessionToken", "c", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;", "()Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class WorkflowFragmentArgs implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<WorkflowFragmentArgs> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String inquiryId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final String sessionToken;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final InquiryWorkflow$Props inquiryWorkflowProps;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<WorkflowFragmentArgs> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final WorkflowFragmentArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WorkflowFragmentArgs(parcel.readString(), parcel.readString(), (InquiryWorkflow$Props) parcel.readParcelable(WorkflowFragmentArgs.class.getClassLoader()));
            }

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
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$a;", "", "<init>", "()V", "", "inquiryId", "sessionToken", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;", "inquiryWorkflowProps", "Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;", "a", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;)Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InquiryWorkflowFragment a(@Nullable String inquiryId, @Nullable String sessionToken, @NotNull InquiryWorkflow$Props inquiryWorkflowProps) {
            Intrinsics.checkNotNullParameter(inquiryWorkflowProps, "inquiryWorkflowProps");
            return (InquiryWorkflowFragment) iq.b.a(new InquiryWorkflowFragment(), new WorkflowFragmentArgs(inquiryId, sessionToken, inquiryWorkflowProps));
        }

        public Companion() {
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment$onViewCreated$1", f = "InquiryWorkflowFragment.kt", l = {117}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class b extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f12193t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ e0 f12194u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ InquiryWorkflowFragment f12195v;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements lu.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InquiryWorkflowFragment f12196a;

            public a(InquiryWorkflowFragment inquiryWorkflowFragment) {
                this.f12196a = inquiryWorkflowFragment;
            }

            @Override // lu.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(s0 s0Var, lt.b<? super Unit> bVar) {
                n0 n0VarK2 = this.f12196a.k2();
                zo.c cVarB2 = this.f12196a.b2();
                FragmentManager fragmentManagerU = this.f12196a.u();
                Intrinsics.checkNotNullExpressionValue(fragmentManagerU, "getChildFragmentManager(...)");
                n0VarK2.h(s0Var, cVarB2, fragmentManagerU);
                return Unit.f22938a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e0 e0Var, InquiryWorkflowFragment inquiryWorkflowFragment, lt.b<? super b> bVar) {
            super(2, bVar);
            this.f12194u = e0Var;
            this.f12195v = inquiryWorkflowFragment;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new b(this.f12194u, this.f12195v, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f12193t;
            if (i10 == 0) {
                o.b(obj);
                c0<s0> c0VarC = this.f12194u.c();
                a aVar = new a(this.f12195v);
                this.f12193t = 1;
                if (c0VarC.collect(aVar, this) == objE) {
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

    @nt.f(c = "com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment$onViewCreated$2", f = "InquiryWorkflowFragment.kt", l = {126}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class c extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f12197t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ e0 f12198u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ InquiryWorkflowFragment f12199v;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements lu.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ e0 f12200a;
            public final /* synthetic */ InquiryWorkflowFragment b;

            public a(e0 e0Var, InquiryWorkflowFragment inquiryWorkflowFragment) {
                this.f12200a = e0Var;
                this.b = inquiryWorkflowFragment;
            }

            @Override // lu.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(InquiryWorkflow$Output inquiryWorkflow$Output, lt.b<? super Unit> bVar) {
                if (inquiryWorkflow$Output == null) {
                    return Unit.f22938a;
                }
                this.f12200a.a().setValue(null);
                this.b.p2().o2(inquiryWorkflow$Output);
                return Unit.f22938a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e0 e0Var, InquiryWorkflowFragment inquiryWorkflowFragment, lt.b<? super c> bVar) {
            super(2, bVar);
            this.f12198u = e0Var;
            this.f12199v = inquiryWorkflowFragment;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new c(this.f12198u, this.f12199v, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f12197t;
            if (i10 == 0) {
                o.b(obj);
                c0<InquiryWorkflow$Output> c0VarA = this.f12198u.a();
                a aVar = new a(this.f12198u, this.f12199v);
                this.f12197t = 1;
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
        public final /* synthetic */ androidx.fragment.app.c f12201a;

        public d(androidx.fragment.app.c cVar) {
            this.f12201a = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle bundleT = this.f12201a.t();
            if (bundleT != null) {
                return bundleT;
            }
            throw new IllegalStateException("Fragment " + this.f12201a + " has null arguments");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Lk4/a;", "b", "()Lk4/a;"}, k = 3, mv = {2, 2, 0})
    public static final class e extends kotlin.jvm.internal.m implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f12202i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ gt.h f12203j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, gt.h hVar) {
            super(0);
            this.f12202i = function0;
            this.f12203j = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f12202i;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            c1 c1VarC = l0.c(this.f12203j);
            androidx.p000lifecycle.j jVar = c1VarC instanceof androidx.p000lifecycle.j ? (androidx.p000lifecycle.j) c1VarC : null;
            return jVar != null ? jVar.Y() : CreationExtras.b.f22393c;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class f implements Function0<a1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.c f12204a;
        public final /* synthetic */ Function1 b;

        public f(androidx.fragment.app.c cVar, Function1 function1) {
            this.f12204a = cVar;
            this.b = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a1.c invoke() {
            return new mq.d(this.f12204a, this.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/fragment/app/c;", "b", "()Landroidx/fragment/app/c;"}, k = 3, mv = {2, 2, 0})
    public static final class g extends kotlin.jvm.internal.m implements Function0<androidx.fragment.app.c> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.c f12205i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(androidx.fragment.app.c cVar) {
            super(0);
            this.f12205i = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final androidx.fragment.app.c invoke() {
            return this.f12205i;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/c1;", "b", "()Landroidx/lifecycle/c1;"}, k = 3, mv = {2, 2, 0})
    public static final class h extends kotlin.jvm.internal.m implements Function0<c1> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f12206i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Function0 function0) {
            super(0);
            this.f12206i = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c1 invoke() {
            return (c1) this.f12206i.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/b1;", "b", "()Landroidx/lifecycle/b1;"}, k = 3, mv = {2, 2, 0})
    public static final class i extends kotlin.jvm.internal.m implements Function0<b1> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ gt.h f12207i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(gt.h hVar) {
            super(0);
            this.f12207i = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b1 invoke() {
            return l0.c(this.f12207i).v();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Lk4/a;", "b", "()Lk4/a;"}, k = 3, mv = {2, 2, 0})
    public static final class j extends kotlin.jvm.internal.m implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f12208i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ gt.h f12209j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Function0 function0, gt.h hVar) {
            super(0);
            this.f12208i = function0;
            this.f12209j = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f12208i;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            c1 c1VarC = l0.c(this.f12209j);
            androidx.p000lifecycle.j jVar = c1VarC instanceof androidx.p000lifecycle.j ? (androidx.p000lifecycle.j) c1VarC : null;
            return jVar != null ? jVar.Y() : CreationExtras.b.f22393c;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class k implements Function0<a1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.c f12210a;
        public final /* synthetic */ Function1 b;

        public k(androidx.fragment.app.c cVar, Function1 function1) {
            this.f12210a = cVar;
            this.b = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a1.c invoke() {
            return new mq.d(this.f12210a, this.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/fragment/app/c;", "b", "()Landroidx/fragment/app/c;"}, k = 3, mv = {2, 2, 0})
    public static final class l extends kotlin.jvm.internal.m implements Function0<androidx.fragment.app.c> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.c f12211i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(androidx.fragment.app.c cVar) {
            super(0);
            this.f12211i = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final androidx.fragment.app.c invoke() {
            return this.f12211i;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/c1;", "b", "()Landroidx/lifecycle/c1;"}, k = 3, mv = {2, 2, 0})
    public static final class m extends kotlin.jvm.internal.m implements Function0<c1> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f12212i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Function0 function0) {
            super(0);
            this.f12212i = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c1 invoke() {
            return (c1) this.f12212i.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/b1;", "b", "()Landroidx/lifecycle/b1;"}, k = 3, mv = {2, 2, 0})
    public static final class n extends kotlin.jvm.internal.m implements Function0<b1> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ gt.h f12213i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(gt.h hVar) {
            super(0);
            this.f12213i = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b1 invoke() {
            return l0.c(this.f12213i).v();
        }
    }

    public InquiryWorkflowFragment() {
        f fVar = new f(this, new Function1() { // from class: ip.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InquiryWorkflowFragment.q2(this.f21303a, (androidx.p000lifecycle.l0) obj);
            }
        });
        g gVar = new g(this);
        gt.k kVar = gt.k.NONE;
        gt.h hVarA = gt.i.a(kVar, new h(gVar));
        this.viewModel = l0.b(this, d0.b(com.withpersona.sdk2.inquiry.internal.workflows.c.class), new i(hVarA), new j(null, hVarA), fVar);
        k kVar2 = new k(this, new Function1() { // from class: ip.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InquiryWorkflowFragment.r2(this.f21304a, (androidx.p000lifecycle.l0) obj);
            }
        });
        gt.h hVarA2 = gt.i.a(kVar, new m(new l(this)));
        this.workflowStateViewModel = l0.b(this, d0.b(com.withpersona.sdk2.inquiry.internal.workflows.e.class), new n(hVarA2), new e(null, hVarA2), kVar2);
        this.args = new iq.c(d0.b(WorkflowFragmentArgs.class), new d(this));
    }

    public static final com.withpersona.sdk2.inquiry.internal.workflows.c q2(InquiryWorkflowFragment inquiryWorkflowFragment, androidx.p000lifecycle.l0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return inquiryWorkflowFragment.m2().a(it);
    }

    public static final com.withpersona.sdk2.inquiry.internal.workflows.e r2(InquiryWorkflowFragment inquiryWorkflowFragment, androidx.p000lifecycle.l0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return inquiryWorkflowFragment.o2().a(it);
    }

    @Override // androidx.fragment.app.c
    public void F0(@Nullable Bundle savedInstanceState) {
        p2().m2().a().a(this);
        super.F0(savedInstanceState);
    }

    @Override // androidx.fragment.app.c
    @NotNull
    public View J0(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.J0(inflater, container, savedInstanceState);
        zo.c cVarC = zo.c.c(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(cVarC, "inflate(...)");
        e2(cVarC);
        FrameLayout root = b2().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // bt.d
    @NotNull
    public bt.a<? super Object> c() {
        return j2().a();
    }

    @Override // androidx.fragment.app.c
    public void e1(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.e1(view, savedInstanceState);
        b2().f38226c.setVisibility(0);
        com.withpersona.sdk2.inquiry.permissions.permissionRequest.g gVarI = j2().i();
        FragmentManager fragmentManagerU = u();
        Intrinsics.checkNotNullExpressionValue(fragmentManagerU, "getChildFragmentManager(...)");
        int id2 = b2().f38226c.getId();
        androidx.p000lifecycle.s sVarK0 = k0();
        Intrinsics.checkNotNullExpressionValue(sVarK0, "getViewLifecycleOwner(...)");
        gVarI.d(fragmentManagerU, id2, sVarK0);
        e0 e0VarE = l2().e(i2().getInquiryWorkflowProps());
        androidx.p000lifecycle.s sVarK1 = k0();
        Intrinsics.checkNotNullExpressionValue(sVarK1, "getViewLifecycleOwner(...)");
        iu.k.d(t.a(sVarK1), null, null, new b(e0VarE, this, null), 3, null);
        androidx.p000lifecycle.s sVarK2 = k0();
        Intrinsics.checkNotNullExpressionValue(sVarK2, "getViewLifecycleOwner(...)");
        iu.k.d(t.a(sVarK2), null, null, new c(e0VarE, this, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WorkflowFragmentArgs i2() {
        return (WorkflowFragmentArgs) this.args.getValue();
    }

    @NotNull
    public final s j2() {
        s sVar = this.inquiryComponent;
        if (sVar != null) {
            return sVar;
        }
        Intrinsics.u("inquiryComponent");
        return null;
    }

    @NotNull
    public final n0 k2() {
        n0 n0Var = this.inquiryStateRenderer;
        if (n0Var != null) {
            return n0Var;
        }
        Intrinsics.u("inquiryStateRenderer");
        return null;
    }

    public final com.withpersona.sdk2.inquiry.internal.workflows.c l2() {
        return (com.withpersona.sdk2.inquiry.internal.workflows.c) this.viewModel.getValue();
    }

    @NotNull
    public final com.withpersona.sdk2.inquiry.internal.workflows.c.a m2() {
        com.withpersona.sdk2.inquiry.internal.workflows.c.a aVar = this.viewModelFactory;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("viewModelFactory");
        return null;
    }

    @NotNull
    public final com.withpersona.sdk2.inquiry.internal.workflows.e n2() {
        return (com.withpersona.sdk2.inquiry.internal.workflows.e) this.workflowStateViewModel.getValue();
    }

    @NotNull
    public final com.withpersona.sdk2.inquiry.internal.workflows.e.a o2() {
        com.withpersona.sdk2.inquiry.internal.workflows.e.a aVar = this.workflowStateViewModelFactory;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("workflowStateViewModelFactory");
        return null;
    }

    public final com.withpersona.sdk2.inquiry.internal.i p2() {
        androidx.fragment.app.c cVarJ = J();
        Intrinsics.d(cVarJ, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.InquiryFragment");
        return (com.withpersona.sdk2.inquiry.internal.i) cVarJ;
    }
}
