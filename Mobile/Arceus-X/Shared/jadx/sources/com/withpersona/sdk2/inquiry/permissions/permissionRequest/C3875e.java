package com.withpersona.sdk2.inquiry.permissions.permissionRequest;

import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.PermissionState;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nu.C9579j;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import p229jt.C7348o;
import p256ku.AbstractC7900n2;
import p256ku.C7864g1;
import p256ku.C7872i;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p499vr.InterfaceC12257h;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.permissionRequest.e */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0010B\u001b\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012¨\u0006\u0014"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e;", "Lvr/h;", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$b;", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/g;", "permissionsHelper", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;", "props", "<init>", "(Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/g;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)V", "Lnu/h;", "run", "()Lnu/h;", "otherWorker", "", "c", "(Lvr/h;)Z", "b", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/g;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;", "a", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3875e implements InterfaceC12257h<b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C3877g permissionsHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final PermissionRequestWorkflow.Props props;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.permissionRequest.e$a */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;", "", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;", "props", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e;", "a", "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e;", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface a {
        @NotNull
        /* JADX INFO: renamed from: a */
        C3875e mo19201a(@NotNull PermissionRequestWorkflow.Props props);
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.permissionRequest.e$b */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$b;", "", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;", "permissionState", "<init>", "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V", "a", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;", "()Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final PermissionState permissionState;

        public b(@NotNull PermissionState permissionState) {
            Intrinsics.checkNotNullParameter(permissionState, "permissionState");
            this.permissionState = permissionState;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final PermissionState getPermissionState() {
            return this.permissionState;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.permissionRequest.e$c */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lnu/i;", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$b;", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestWorker$run$1", m39664f = "PermissionRequestWorker.kt", m39665l = {24, 29, 32}, m39666m = "invokeSuspend")
    public static final class c extends AbstractC10351m implements Function2<InterfaceC9577i<? super b>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f15889t;

        /* JADX INFO: renamed from: u */
        public Object f15890u;

        /* JADX INFO: renamed from: v */
        public int f15891v;

        /* JADX INFO: renamed from: w */
        public /* synthetic */ Object f15892w;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.permissionRequest.e$c$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestWorker$run$1$1", m39664f = "PermissionRequestWorker.kt", m39665l = {}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f15894t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ C3875e f15895u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ String f15896v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C3875e c3875e, String str, InterfaceC9557b<? super a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f15895u = c3875e;
                this.f15896v = str;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f15895u, this.f15896v, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                C10047c.m38805e();
                if (this.f15894t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                this.f15895u.permissionsHelper.m19209c(this.f15896v, this.f15895u.props);
                return Unit.f29331a;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.permissionRequest.e$c$b */
        @Metadata(m31664d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m31665d2 = {"<anonymous>", "", "it", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$PermissionRequestFragmentResult;"}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestWorker$run$1$result$1", m39664f = "PermissionRequestWorker.kt", m39665l = {}, m39666m = "invokeSuspend")
        public static final class b extends AbstractC10351m implements Function2<PermissionRequestFragment.PermissionRequestFragmentResult, InterfaceC9557b<? super Boolean>, Object> {

            /* JADX INFO: renamed from: t */
            public int f15897t;

            /* JADX INFO: renamed from: u */
            public /* synthetic */ Object f15898u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ String f15899v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, InterfaceC9557b<? super b> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f15899v = str;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                b bVar = new b(this.f15899v, interfaceC9557b);
                bVar.f15898u = obj;
                return bVar;
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                PermissionRequestFragment.PermissionRequestFragmentResult permissionRequestFragmentResult = (PermissionRequestFragment.PermissionRequestFragmentResult) this.f15898u;
                C10047c.m38805e();
                if (this.f15897t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return C10340b.m39658a(Intrinsics.m31980c(permissionRequestFragmentResult.getRequestId(), this.f15899v));
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(PermissionRequestFragment.PermissionRequestFragmentResult permissionRequestFragmentResult, InterfaceC9557b<? super Boolean> interfaceC9557b) {
                return ((b) create(permissionRequestFragmentResult, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        public c(InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            c cVar = C3875e.this.new c(interfaceC9557b);
            cVar.f15892w = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x00a2, code lost:
        
            if (r0.emit(r3, r9) == r1) goto L21;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String str;
            InterfaceC9577i interfaceC9577i = (InterfaceC9577i) this.f15892w;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f15891v;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                AbstractC7900n2 abstractC7900n2M32645c = C7864g1.m32645c();
                a aVar = new a(C3875e.this, string, null);
                this.f15892w = interfaceC9577i;
                this.f15889t = string;
                this.f15891v = 1;
                if (C7872i.m32684g(abstractC7900n2M32645c, aVar, this) != objM38805e) {
                    str = string;
                }
                return objM38805e;
            }
            if (i10 == 1) {
                str = (String) this.f15889t;
                C7348o.m30470b(obj);
            } else if (i10 == 2) {
                str = (String) this.f15889t;
                C7348o.m30470b(obj);
                PermissionRequestFragment.PermissionRequestFragmentResult permissionRequestFragmentResult = (PermissionRequestFragment.PermissionRequestFragmentResult) obj;
                b bVar = new b(permissionRequestFragmentResult.getPermissionState());
                this.f15892w = C10350l.m39676a(interfaceC9577i);
                this.f15889t = C10350l.m39676a(str);
                this.f15890u = C10350l.m39676a(permissionRequestFragmentResult);
                this.f15891v = 3;
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
            C3872b c3872b = new C3872b();
            b bVar2 = new b(str, null);
            this.f15892w = interfaceC9577i;
            this.f15889t = C10350l.m39676a(str);
            this.f15891v = 2;
            obj = C9579j.m37803t(c3872b, bVar2, this);
            if (obj != objM38805e) {
                PermissionRequestFragment.PermissionRequestFragmentResult permissionRequestFragmentResult2 = (PermissionRequestFragment.PermissionRequestFragmentResult) obj;
                b bVar3 = new b(permissionRequestFragmentResult2.getPermissionState());
                this.f15892w = C10350l.m39676a(interfaceC9577i);
                this.f15889t = C10350l.m39676a(str);
                this.f15890u = C10350l.m39676a(permissionRequestFragmentResult2);
                this.f15891v = 3;
            }
            return objM38805e;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9577i<? super b> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((c) create(interfaceC9577i, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C3875e(@NotNull C3877g permissionsHelper, @NotNull PermissionRequestWorkflow.Props props) {
        Intrinsics.checkNotNullParameter(permissionsHelper, "permissionsHelper");
        Intrinsics.checkNotNullParameter(props, "props");
        this.permissionsHelper = permissionsHelper;
        this.props = props;
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: a */
    public boolean mo7572a(@NotNull InterfaceC12257h<?> interfaceC12257h) {
        return super.mo7572a(interfaceC12257h);
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: c */
    public boolean mo7574c(@NotNull InterfaceC12257h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return super.mo7574c(otherWorker) && this.props.getPermission() == ((C3875e) otherWorker).props.getPermission();
    }

    @Override // p499vr.InterfaceC12257h
    @NotNull
    public InterfaceC9575h<b> run() {
        return C9579j.m37806w(new c(null));
    }
}
