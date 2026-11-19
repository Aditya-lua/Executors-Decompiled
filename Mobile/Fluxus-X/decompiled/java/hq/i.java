package hq;

import av.g1;
import av.n2;
import av.p0;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import fq.PermissionState;
import fq.n1;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import zt.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0010B\u001b\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012¨\u0006\u0014"}, d2 = {"Lhq/i;", "Lls/j;", "Lhq/i$b;", "Lhq/m;", "permissionsHelper", "Lfq/n1$c;", "props", "<init>", "(Lhq/m;Lfq/n1$c;)V", "Ldv/h;", "run", "()Ldv/h;", "otherWorker", BuildConfig.FLAVOR, "c", "(Lls/j;)Z", "b", "Lhq/m;", "Lfq/n1$c;", "a", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements ls.j<b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final m permissionsHelper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final n1.Props props;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lhq/i$a;", BuildConfig.FLAVOR, "Lfq/n1$c;", "props", "Lhq/i;", "a", "(Lfq/n1$c;)Lhq/i;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        i a(@NotNull n1.Props props);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lhq/i$b;", BuildConfig.FLAVOR, "Lfq/t1;", "permissionState", "<init>", "(Lfq/t1;)V", "a", "Lfq/t1;", "()Lfq/t1;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldv/i;", "Lhq/i$b;", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestWorker$run$1", f = "PermissionRequestWorker.kt", l = {24, 29, Barcode.FORMAT_EAN_13}, m = "invokeSuspend")
    public static final class c extends gu.m implements Function2<dv.i<? super b>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f18510t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f18511u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f18512v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f18513w;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestWorker$run$1$1", f = "PermissionRequestWorker.kt", l = {}, m = "invokeSuspend")
        public static final class a extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f18515t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ i f18516u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ String f18517v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i iVar, String str, eu.b<? super a> bVar) {
                super(2, bVar);
                this.f18516u = iVar;
                this.f18517v = str;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new a(this.f18516u, this.f18517v, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                fu.c.e();
                if (this.f18515t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                this.f18516u.permissionsHelper.c(this.f18517v, this.f18516u.props);
                return Unit.f21506a;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lhq/c$d;", "it", BuildConfig.FLAVOR, "<anonymous>", "(Lhq/c$d;)Z"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestWorker$run$1$result$1", f = "PermissionRequestWorker.kt", l = {}, m = "invokeSuspend")
        public static final class b extends gu.m implements Function2<hq.c.d, eu.b<? super Boolean>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f18518t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f18519u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ String f18520v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, eu.b<? super b> bVar) {
                super(2, bVar);
                this.f18520v = str;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                b bVar2 = new b(this.f18520v, bVar);
                bVar2.f18519u = obj;
                return bVar2;
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                hq.c.d dVar = (hq.c.d) this.f18519u;
                fu.c.e();
                if (this.f18518t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return gu.b.a(Intrinsics.c(dVar.getRequestId(), this.f18520v));
            }

            @Override // p001kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(hq.c.d dVar, eu.b<? super Boolean> bVar) {
                return ((b) create(dVar, bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        public c(eu.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            c cVar = i.this.new c(bVar);
            cVar.f18513w = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x00a2, code lost:
        
            if (r0.emit(r3, r9) == r1) goto L21;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String str;
            dv.i iVar = (dv.i) this.f18513w;
            Object objE = fu.c.e();
            int i10 = this.f18512v;
            if (i10 == 0) {
                o.b(obj);
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                n2 n2VarC = g1.c();
                a aVar = new a(i.this, string, null);
                this.f18513w = iVar;
                this.f18510t = string;
                this.f18512v = 1;
                if (av.i.g(n2VarC, aVar, this) != objE) {
                    str = string;
                }
                return objE;
            }
            if (i10 == 1) {
                str = (String) this.f18510t;
                o.b(obj);
            } else if (i10 == 2) {
                str = (String) this.f18510t;
                o.b(obj);
                hq.c.d dVar = (hq.c.d) obj;
                b bVar = new b(dVar.getPermissionState());
                this.f18513w = gu.l.a(iVar);
                this.f18510t = gu.l.a(str);
                this.f18511u = gu.l.a(dVar);
                this.f18512v = 3;
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f21506a;
            e eVar = new e();
            b bVar2 = new b(str, null);
            this.f18513w = iVar;
            this.f18510t = gu.l.a(str);
            this.f18512v = 2;
            obj = dv.j.u(eVar, bVar2, this);
            if (obj != objE) {
                hq.c.d dVar2 = (hq.c.d) obj;
                b bVar3 = new b(dVar2.getPermissionState());
                this.f18513w = gu.l.a(iVar);
                this.f18510t = gu.l.a(str);
                this.f18511u = gu.l.a(dVar2);
                this.f18512v = 3;
            }
            return objE;
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(dv.i<? super b> iVar, eu.b<? super Unit> bVar) {
            return ((c) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    public i(@NotNull m permissionsHelper, @NotNull n1.Props props) {
        Intrinsics.checkNotNullParameter(permissionsHelper, "permissionsHelper");
        Intrinsics.checkNotNullParameter(props, "props");
        this.permissionsHelper = permissionsHelper;
        this.props = props;
    }

    @Override // ls.j
    public boolean b(@NotNull ls.j<?> jVar) {
        return super.b(jVar);
    }

    @Override // ls.j
    public boolean c(@NotNull ls.j<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return super.c(otherWorker) && this.props.getPermission() == ((i) otherWorker).props.getPermission();
    }

    @Override // ls.j
    @NotNull
    public dv.h<b> run() {
        return dv.j.w(new c(null));
    }
}
