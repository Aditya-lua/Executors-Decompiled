package com.withpersona.sdk2.inquiry.permissions.permissionRequest;

import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.PermissionState;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.p0;
import nu.i;
import nu.j;
import org.jetbrains.annotations.NotNull;
import pt.m;
import vr.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0010B\u001b\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e;", "Lvr/h;", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$b;", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/g;", "permissionsHelper", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;", "props", "<init>", "(Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/g;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)V", "Lnu/h;", "run", "()Lnu/h;", "otherWorker", "", "c", "(Lvr/h;)Z", "b", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/g;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;", "a", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements h<b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final g permissionsHelper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PermissionRequestWorkflow.Props props;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;", "", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;", "props", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e;", "a", "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        e a(@NotNull PermissionRequestWorkflow.Props props);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$b;", "", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;", "permissionState", "<init>", "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V", "a", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;", "()Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnu/i;", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$b;", "", "<anonymous>", "(Lnu/i;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestWorker$run$1", f = "PermissionRequestWorker.kt", l = {24, 29, 32}, m = "invokeSuspend")
    public static final class c extends m implements Function2<i<? super b>, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f12352t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f12353u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f12354v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f12355w;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
        @pt.f(c = "com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestWorker$run$1$1", f = "PermissionRequestWorker.kt", l = {}, m = "invokeSuspend")
        public static final class a extends m implements Function2<p0, nt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f12357t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ e f12358u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ String f12359v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, String str, nt.b<? super a> bVar) {
                super(2, bVar);
                this.f12358u = eVar;
                this.f12359v = str;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                return new a(this.f12358u, this.f12359v, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                ot.c.e();
                if (this.f12357t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                this.f12358u.permissionsHelper.c(this.f12359v, this.f12358u.props);
                return Unit.f22483a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$PermissionRequestFragmentResult;"}, k = 3, mv = {2, 2, 0}, xi = 48)
        @pt.f(c = "com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestWorker$run$1$result$1", f = "PermissionRequestWorker.kt", l = {}, m = "invokeSuspend")
        public static final class b extends m implements Function2<PermissionRequestFragment.PermissionRequestFragmentResult, nt.b<? super Boolean>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f12360t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f12361u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ String f12362v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, nt.b<? super b> bVar) {
                super(2, bVar);
                this.f12362v = str;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                b bVar2 = new b(this.f12362v, bVar);
                bVar2.f12361u = obj;
                return bVar2;
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                PermissionRequestFragment.PermissionRequestFragmentResult permissionRequestFragmentResult = (PermissionRequestFragment.PermissionRequestFragmentResult) this.f12361u;
                ot.c.e();
                if (this.f12360t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return pt.b.a(Intrinsics.c(permissionRequestFragmentResult.getRequestId(), this.f12362v));
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(PermissionRequestFragment.PermissionRequestFragmentResult permissionRequestFragmentResult, nt.b<? super Boolean> bVar) {
                return ((b) create(permissionRequestFragmentResult, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        public c(nt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            c cVar = e.this.new c(bVar);
            cVar.f12355w = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x00a2, code lost:
        
            if (r0.emit(r3, r9) == r1) goto L21;
         */
        @Override // pt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = r9.f12355w
                nu.i r0 = (nu.i) r0
                java.lang.Object r1 = ot.c.e()
                int r2 = r9.f12354v
                r3 = 0
                r4 = 3
                r5 = 2
                r6 = 1
                if (r2 == 0) goto L3b
                if (r2 == r6) goto L33
                if (r2 == r5) goto L2b
                if (r2 != r4) goto L23
                java.lang.Object r0 = r9.f12353u
                com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment$PermissionRequestFragmentResult r0 = (com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment.PermissionRequestFragmentResult) r0
                java.lang.Object r0 = r9.f12352t
                java.lang.String r0 = (java.lang.String) r0
                jt.o.b(r10)
                goto La5
            L23:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L2b:
                java.lang.Object r2 = r9.f12352t
                java.lang.String r2 = (java.lang.String) r2
                jt.o.b(r10)
                goto L7f
            L33:
                java.lang.Object r2 = r9.f12352t
                java.lang.String r2 = (java.lang.String) r2
                jt.o.b(r10)
                goto L64
            L3b:
                jt.o.b(r10)
                java.util.UUID r10 = java.util.UUID.randomUUID()
                java.lang.String r10 = r10.toString()
                java.lang.String r2 = "toString(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r2)
                ku.n2 r2 = ku.g1.c()
                com.withpersona.sdk2.inquiry.permissions.permissionRequest.e$c$a r7 = new com.withpersona.sdk2.inquiry.permissions.permissionRequest.e$c$a
                com.withpersona.sdk2.inquiry.permissions.permissionRequest.e r8 = com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.this
                r7.<init>(r8, r10, r3)
                r9.f12355w = r0
                r9.f12352t = r10
                r9.f12354v = r6
                java.lang.Object r2 = ku.i.g(r2, r7, r9)
                if (r2 != r1) goto L63
                goto La4
            L63:
                r2 = r10
            L64:
                com.withpersona.sdk2.inquiry.permissions.permissionRequest.b r10 = new com.withpersona.sdk2.inquiry.permissions.permissionRequest.b
                r10.<init>()
                com.withpersona.sdk2.inquiry.permissions.permissionRequest.e$c$b r6 = new com.withpersona.sdk2.inquiry.permissions.permissionRequest.e$c$b
                r6.<init>(r2, r3)
                r9.f12355w = r0
                java.lang.Object r3 = pt.l.a(r2)
                r9.f12352t = r3
                r9.f12354v = r5
                java.lang.Object r10 = nu.j.t(r10, r6, r9)
                if (r10 != r1) goto L7f
                goto La4
            L7f:
                com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment$PermissionRequestFragmentResult r10 = (com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment.PermissionRequestFragmentResult) r10
                com.withpersona.sdk2.inquiry.permissions.permissionRequest.e$b r3 = new com.withpersona.sdk2.inquiry.permissions.permissionRequest.e$b
                com.withpersona.sdk2.inquiry.permissions.PermissionState r5 = r10.getPermissionState()
                r3.<init>(r5)
                java.lang.Object r5 = pt.l.a(r0)
                r9.f12355w = r5
                java.lang.Object r2 = pt.l.a(r2)
                r9.f12352t = r2
                java.lang.Object r10 = pt.l.a(r10)
                r9.f12353u = r10
                r9.f12354v = r4
                java.lang.Object r10 = r0.emit(r3, r9)
                if (r10 != r1) goto La5
            La4:
                return r1
            La5:
                kotlin.Unit r10 = kotlin.Unit.f22483a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super b> iVar, nt.b<? super Unit> bVar) {
            return ((c) create(iVar, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public e(@NotNull g permissionsHelper, @NotNull PermissionRequestWorkflow.Props props) {
        Intrinsics.checkNotNullParameter(permissionsHelper, "permissionsHelper");
        Intrinsics.checkNotNullParameter(props, "props");
        this.permissionsHelper = permissionsHelper;
        this.props = props;
    }

    @Override // vr.h
    public boolean a(@NotNull h<?> hVar) {
        return super.a(hVar);
    }

    @Override // vr.h
    public boolean c(@NotNull h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return super.c(otherWorker) && this.props.getPermission() == ((e) otherWorker).props.getPermission();
    }

    @Override // vr.h
    @NotNull
    public nu.h<b> run() {
        return j.w(new c(null));
    }
}
