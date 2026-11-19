package yp;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.p000lifecycle.a1;
import androidx.p000lifecycle.b1;
import androidx.p000lifecycle.c1;
import androidx.p000lifecycle.l0;
import androidx.p000lifecycle.t;
import av.p0;
import com.github.luben.zstd.BuildConfig;
import dv.c0;
import f4.k0;
import f4.q;
import f4.y0;
import l4.CreationExtras;
import np.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.jvm.internal.d0;
import vp.e0;
import vp.n0;
import vp.s0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 ]2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002^_B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00160\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001c8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010K\u001a\u00020D8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001b\u0010Q\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001b\u0010V\u001a\u00020R8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bS\u0010N\u001a\u0004\bT\u0010UR\u001b\u0010\\\u001a\u00020W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[¨\u0006`"}, d2 = {"Lyp/d;", "Lyq/a;", "Lpp/c;", "Lut/d;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", BuildConfig.FLAVOR, "F0", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "J0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lut/a;", BuildConfig.FLAVOR, "c", "()Lut/a;", "Lcom/withpersona/sdk2/inquiry/internal/i;", "p2", "()Lcom/withpersona/sdk2/inquiry/internal/i;", "Lnp/s;", "h0", "Lnp/s;", "j2", "()Lnp/s;", "setInquiryComponent$inquiry_internal_release", "(Lnp/s;)V", "inquiryComponent", "Lyp/f$a;", "i0", "Lyp/f$a;", "m2", "()Lyp/f$a;", "setViewModelFactory", "(Lyp/f$a;)V", "viewModelFactory", "Lyp/i$a;", "j0", "Lyp/i$a;", "o2", "()Lyp/i$a;", "setWorkflowStateViewModelFactory", "(Lyp/i$a;)V", "workflowStateViewModelFactory", "Ljr/a;", "k0", "Ljr/a;", "getSystemUiController", "()Ljr/a;", "setSystemUiController", "(Ljr/a;)V", "systemUiController", "Lto/e;", "l0", "Lto/e;", "getFeatureFlagManager", "()Lto/e;", "setFeatureFlagManager", "(Lto/e;)V", "featureFlagManager", "Lvp/n0;", "m0", "Lvp/n0;", "k2", "()Lvp/n0;", "setInquiryStateRenderer", "(Lvp/n0;)V", "inquiryStateRenderer", "Lyp/f;", "n0", "Lzt/h;", "l2", "()Lyp/f;", "viewModel", "Lyp/i;", "o0", "n2", "()Lyp/i;", "workflowStateViewModel", "Lyp/d$b;", "p0", "Lyq/c;", "i2", "()Lyp/d$b;", "args", "q0", "b", "a", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d extends yq.a<pp.c> implements ut.d {

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h0, reason: collision with root package name and from kotlin metadata */
    public s inquiryComponent;

    /* JADX INFO: renamed from: i0, reason: collision with root package name and from kotlin metadata */
    public yp.f.a viewModelFactory;

    /* JADX INFO: renamed from: j0, reason: collision with root package name and from kotlin metadata */
    public yp.i.a workflowStateViewModelFactory;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    public jr.a systemUiController;

    /* JADX INFO: renamed from: l0, reason: collision with root package name and from kotlin metadata */
    public to.e featureFlagManager;

    /* JADX INFO: renamed from: m0, reason: collision with root package name and from kotlin metadata */
    public n0 inquiryStateRenderer;

    /* JADX INFO: renamed from: n0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final zt.h viewModel;

    /* JADX INFO: renamed from: o0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final zt.h workflowStateViewModel;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final yq.c args;

    /* JADX INFO: renamed from: yp.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lyp/d$a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "inquiryId", "sessionToken", "Lcom/withpersona/sdk2/inquiry/internal/m;", "inquiryWorkflowProps", "Lyp/d;", "a", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/m;)Lyp/d;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final d a(@Nullable String inquiryId, @Nullable String sessionToken, @NotNull com.withpersona.sdk2.inquiry.internal.m inquiryWorkflowProps) {
            Intrinsics.checkNotNullParameter(inquiryWorkflowProps, "inquiryWorkflowProps");
            return (d) yq.b.a(new d(), new b(inquiryId, sessionToken, inquiryWorkflowProps));
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0012\u0010\u001a¨\u0006\u001b"}, d2 = {"Lyp/d$b;", "Landroid/os/Parcelable;", BuildConfig.FLAVOR, "inquiryId", "sessionToken", "Lcom/withpersona/sdk2/inquiry/internal/m;", "inquiryWorkflowProps", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/m;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getInquiryId", "()Ljava/lang/String;", "b", "getSessionToken", "c", "Lcom/withpersona/sdk2/inquiry/internal/m;", "()Lcom/withpersona/sdk2/inquiry/internal/m;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String inquiryId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final String sessionToken;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final com.withpersona.sdk2.inquiry.internal.m inquiryWorkflowProps;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new b(parcel.readString(), parcel.readString(), (com.withpersona.sdk2.inquiry.internal.m) parcel.readParcelable(b.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(@Nullable String str, @Nullable String str2, @NotNull com.withpersona.sdk2.inquiry.internal.m inquiryWorkflowProps) {
            Intrinsics.checkNotNullParameter(inquiryWorkflowProps, "inquiryWorkflowProps");
            this.inquiryId = str;
            this.sessionToken = str2;
            this.inquiryWorkflowProps = inquiryWorkflowProps;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final com.withpersona.sdk2.inquiry.internal.m getInquiryWorkflowProps() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment$onViewCreated$1", f = "InquiryWorkflowFragment.kt", l = {117}, m = "invokeSuspend")
    public static final class c extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f38087t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ e0 f38088u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ d f38089v;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements dv.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f38090a;

            public a(d dVar) {
                this.f38090a = dVar;
            }

            @Override // dv.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(s0 s0Var, eu.b<? super Unit> bVar) {
                n0 n0VarK2 = this.f38090a.k2();
                pp.c cVarB2 = this.f38090a.b2();
                k0 k0VarU = this.f38090a.u();
                Intrinsics.checkNotNullExpressionValue(k0VarU, "getChildFragmentManager(...)");
                n0VarK2.h(s0Var, cVarB2, k0VarU);
                return Unit.f21506a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e0 e0Var, d dVar, eu.b<? super c> bVar) {
            super(2, bVar);
            this.f38088u = e0Var;
            this.f38089v = dVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new c(this.f38088u, this.f38089v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f38087t;
            if (i10 == 0) {
                zt.o.b(obj);
                c0<s0> c0VarC = this.f38088u.c();
                a aVar = new a(this.f38089v);
                this.f38087t = 1;
                if (c0VarC.collect(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            throw new zt.d();
        }
    }

    /* JADX INFO: renamed from: yp.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment$onViewCreated$2", f = "InquiryWorkflowFragment.kt", l = {126}, m = "invokeSuspend")
    public static final class C0775d extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f38091t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ e0 f38092u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ d f38093v;

        /* JADX INFO: renamed from: yp.d$d$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements dv.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ e0 f38094a;
            public final /* synthetic */ d b;

            public a(e0 e0Var, d dVar) {
                this.f38094a = e0Var;
                this.b = dVar;
            }

            @Override // dv.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.withpersona.sdk2.inquiry.internal.l lVar, eu.b<? super Unit> bVar) {
                if (lVar == null) {
                    return Unit.f21506a;
                }
                this.f38094a.a().setValue(null);
                this.b.p2().o2(lVar);
                return Unit.f21506a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0775d(e0 e0Var, d dVar, eu.b<? super C0775d> bVar) {
            super(2, bVar);
            this.f38092u = e0Var;
            this.f38093v = dVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new C0775d(this.f38092u, this.f38093v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((C0775d) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f38091t;
            if (i10 == 0) {
                zt.o.b(obj);
                c0<com.withpersona.sdk2.inquiry.internal.l> c0VarA = this.f38092u.a();
                a aVar = new a(this.f38092u, this.f38093v);
                this.f38091t = 1;
                if (c0VarA.collect(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            throw new zt.d();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class e implements Function0<Bundle> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f38095a;

        public e(q qVar) {
            this.f38095a = qVar;
        }

        @Override // p001kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle bundleT = this.f38095a.t();
            if (bundleT != null) {
                return bundleT;
            }
            throw new IllegalStateException("Fragment " + this.f38095a + " has null arguments");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Ll4/a;", "b", "()Ll4/a;"}, k = 3, mv = {2, 2, 0})
    public static final class f extends p001kotlin.jvm.internal.m implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f38096i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ zt.h f38097j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, zt.h hVar) {
            super(0);
            this.f38096i = function0;
            this.f38097j = hVar;
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f38096i;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            c1 c1VarC = y0.c(this.f38097j);
            androidx.p000lifecycle.j jVar = c1VarC instanceof androidx.p000lifecycle.j ? (androidx.p000lifecycle.j) c1VarC : null;
            return jVar != null ? jVar.Y() : CreationExtras.b.f21886c;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class g implements Function0<a1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f38098a;
        public final /* synthetic */ Function1 b;

        public g(q qVar, Function1 function1) {
            this.f38098a = qVar;
            this.b = function1;
        }

        @Override // p001kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a1.c invoke() {
            return new cr.d(this.f38098a, this.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Lf4/q;", "b", "()Lf4/q;"}, k = 3, mv = {2, 2, 0})
    public static final class h extends p001kotlin.jvm.internal.m implements Function0<q> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ q f38099i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(q qVar) {
            super(0);
            this.f38099i = qVar;
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final q invoke() {
            return this.f38099i;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/c1;", "b", "()Landroidx/lifecycle/c1;"}, k = 3, mv = {2, 2, 0})
    public static final class i extends p001kotlin.jvm.internal.m implements Function0<c1> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f38100i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Function0 function0) {
            super(0);
            this.f38100i = function0;
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c1 invoke() {
            return (c1) this.f38100i.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/b1;", "b", "()Landroidx/lifecycle/b1;"}, k = 3, mv = {2, 2, 0})
    public static final class j extends p001kotlin.jvm.internal.m implements Function0<b1> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ zt.h f38101i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(zt.h hVar) {
            super(0);
            this.f38101i = hVar;
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b1 invoke() {
            return y0.c(this.f38101i).w();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Ll4/a;", "b", "()Ll4/a;"}, k = 3, mv = {2, 2, 0})
    public static final class k extends p001kotlin.jvm.internal.m implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f38102i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ zt.h f38103j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Function0 function0, zt.h hVar) {
            super(0);
            this.f38102i = function0;
            this.f38103j = hVar;
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f38102i;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            c1 c1VarC = y0.c(this.f38103j);
            androidx.p000lifecycle.j jVar = c1VarC instanceof androidx.p000lifecycle.j ? (androidx.p000lifecycle.j) c1VarC : null;
            return jVar != null ? jVar.Y() : CreationExtras.b.f21886c;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class l implements Function0<a1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f38104a;
        public final /* synthetic */ Function1 b;

        public l(q qVar, Function1 function1) {
            this.f38104a = qVar;
            this.b = function1;
        }

        @Override // p001kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a1.c invoke() {
            return new cr.d(this.f38104a, this.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Lf4/q;", "b", "()Lf4/q;"}, k = 3, mv = {2, 2, 0})
    public static final class m extends p001kotlin.jvm.internal.m implements Function0<q> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ q f38105i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(q qVar) {
            super(0);
            this.f38105i = qVar;
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final q invoke() {
            return this.f38105i;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/c1;", "b", "()Landroidx/lifecycle/c1;"}, k = 3, mv = {2, 2, 0})
    public static final class n extends p001kotlin.jvm.internal.m implements Function0<c1> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f38106i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Function0 function0) {
            super(0);
            this.f38106i = function0;
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c1 invoke() {
            return (c1) this.f38106i.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/b1;", "b", "()Landroidx/lifecycle/b1;"}, k = 3, mv = {2, 2, 0})
    public static final class o extends p001kotlin.jvm.internal.m implements Function0<b1> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ zt.h f38107i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(zt.h hVar) {
            super(0);
            this.f38107i = hVar;
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b1 invoke() {
            return y0.c(this.f38107i).w();
        }
    }

    public d() {
        g gVar = new g(this, new Function1() { // from class: yp.b
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d.q2(this.f38073a, (l0) obj);
            }
        });
        h hVar = new h(this);
        zt.k kVar = zt.k.NONE;
        zt.h hVarB = zt.i.b(kVar, new i(hVar));
        this.viewModel = y0.b(this, d0.b(yp.f.class), new j(hVarB), new k(null, hVarB), gVar);
        l lVar = new l(this, new Function1() { // from class: yp.c
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d.r2(this.f38074a, (l0) obj);
            }
        });
        zt.h hVarB2 = zt.i.b(kVar, new n(new m(this)));
        this.workflowStateViewModel = y0.b(this, d0.b(yp.i.class), new o(hVarB2), new f(null, hVarB2), lVar);
        this.args = new yq.c(d0.b(b.class), new e(this));
    }

    public static final yp.f q2(d dVar, l0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return dVar.m2().a(it);
    }

    public static final yp.i r2(d dVar, l0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return dVar.o2().a(it);
    }

    @Override // f4.q
    public void F0(@Nullable Bundle savedInstanceState) {
        p2().m2().a().a(this);
        super.F0(savedInstanceState);
    }

    @Override // f4.q
    @NotNull
    public View J0(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.J0(inflater, container, savedInstanceState);
        pp.c cVarC = pp.c.c(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(cVarC, "inflate(...)");
        e2(cVarC);
        FrameLayout root = b2().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // ut.d
    @NotNull
    public ut.a<? super Object> c() {
        return j2().a();
    }

    @Override // f4.q
    public void e1(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.e1(view, savedInstanceState);
        b2().f29261c.setVisibility(0);
        hq.m mVarI = j2().i();
        k0 k0VarU = u();
        Intrinsics.checkNotNullExpressionValue(k0VarU, "getChildFragmentManager(...)");
        int id2 = b2().f29261c.getId();
        androidx.p000lifecycle.s sVarK0 = k0();
        Intrinsics.checkNotNullExpressionValue(sVarK0, "getViewLifecycleOwner(...)");
        mVarI.d(k0VarU, id2, sVarK0);
        e0 e0VarE = l2().e(i2().getInquiryWorkflowProps());
        androidx.p000lifecycle.s sVarK1 = k0();
        Intrinsics.checkNotNullExpressionValue(sVarK1, "getViewLifecycleOwner(...)");
        av.k.d(t.a(sVarK1), null, null, new c(e0VarE, this, null), 3, null);
        androidx.p000lifecycle.s sVarK2 = k0();
        Intrinsics.checkNotNullExpressionValue(sVarK2, "getViewLifecycleOwner(...)");
        av.k.d(t.a(sVarK2), null, null, new C0775d(e0VarE, this, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b i2() {
        return (b) this.args.getValue();
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

    public final yp.f l2() {
        return (yp.f) this.viewModel.getValue();
    }

    @NotNull
    public final yp.f.a m2() {
        yp.f.a aVar = this.viewModelFactory;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("viewModelFactory");
        return null;
    }

    @NotNull
    public final yp.i n2() {
        return (yp.i) this.workflowStateViewModel.getValue();
    }

    @NotNull
    public final yp.i.a o2() {
        yp.i.a aVar = this.workflowStateViewModelFactory;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("workflowStateViewModelFactory");
        return null;
    }

    public final com.withpersona.sdk2.inquiry.internal.i p2() {
        q qVarJ = J();
        Intrinsics.d(qVarJ, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.InquiryFragment");
        return (com.withpersona.sdk2.inquiry.internal.i) qVarJ;
    }
}
