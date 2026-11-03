package ug;

import android.content.Context;
import com.roblox.client.RobloxApplication;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.client.db.RobloxDatabase;
import iu.g1;
import iu.l0;
import iu.p0;
import iu.q0;
import iu.t1;
import iu.v1;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rg.a1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010!\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010%\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lug/m;", "", "<init>", "()V", "", "evt", "ctx", "", "Lcom/roblox/client/datastructures/NameValuePair;", "params", "", "waitForFullBatch", "", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "i", "(Z)V", "Liu/l0;", "b", "Liu/l0;", "eventUploadDispatcher", "Liu/p0;", "Liu/p0;", "eventUploadScope", "Lug/p$c;", "d", "Lug/p$c;", "eventUploader", "Lkh/a;", "e", "Lgt/h;", "f", "()Lkh/a;", "analyticEventDao", "Lug/p;", "g", "()Lug/p;", "eventUploadWorker", "Lug/p$b;", "h", "()Lug/p$b;", "eventUploaderConfig", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final m f32859a = new m();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final l0 eventUploadDispatcher;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final p0 eventUploadScope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final p.c eventUploader;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final gt.h analyticEventDao;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final gt.h eventUploadWorker;

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"ug/m$a", "Lug/p$c;", "", "url", "body", "contentType", "Lci/j;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llt/b;)Ljava/lang/Object;", "counterName", "", "a", "(Ljava/lang/String;)V", "", "value", "c", "(Ljava/lang/String;J)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements p.c {

        /* JADX INFO: renamed from: ug.m$a$a, reason: collision with other inner class name */
        @nt.f(c = "com.roblox.client.analytics.EventUploadJob$eventUploader$1", f = "EventUploadJob.kt", l = {55}, m = "upload", v = 1)
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0594a extends nt.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f32864t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public Object f32865u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public Object f32866v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public /* synthetic */ Object f32867w;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public int f32869y;

            public C0594a(lt.b<? super C0594a> bVar) {
                super(bVar);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                this.f32867w = obj;
                this.f32869y |= Integer.MIN_VALUE;
                return a.this.b(null, null, null, this);
            }
        }

        @nt.f(c = "com.roblox.client.analytics.EventUploadJob$eventUploader$1$upload$2", f = "EventUploadJob.kt", l = {}, m = "invokeSuspend", v = 1)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Liu/p0;", "Lci/j;", "kotlin.jvm.PlatformType", "<anonymous>", "(Liu/p0;)Lci/j;"}, k = 3, mv = {2, 2, 0})
        public static final class b extends nt.m implements Function2<p0, lt.b<? super ci.j>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f32870t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ String f32871u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ String f32872v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ String f32873w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, String str2, String str3, lt.b<? super b> bVar) {
                super(2, bVar);
                this.f32871u = str;
                this.f32872v = str2;
                this.f32873w = str3;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                return new b(this.f32871u, this.f32872v, this.f32873w, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, lt.b<? super ci.j> bVar) {
                return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                mt.c.e();
                if (this.f32870t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return ci.c.l(this.f32871u, this.f32872v, null, this.f32873w, -1, -1);
            }
        }

        @Override // ug.p.c
        public void a(String counterName) {
            Intrinsics.checkNotNullParameter(counterName, "counterName");
            ti.g.b().q(counterName);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // ug.p.c
        public Object b(String str, String str2, String str3, lt.b<? super ci.j> bVar) {
            C0594a c0594a;
            if (bVar instanceof C0594a) {
                c0594a = (C0594a) bVar;
                int i10 = c0594a.f32869y;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c0594a.f32869y = i10 - Integer.MIN_VALUE;
                } else {
                    c0594a = new C0594a(bVar);
                }
            } else {
                c0594a = new C0594a(bVar);
            }
            Object objG = c0594a.f32867w;
            Object objE = mt.c.e();
            int i11 = c0594a.f32869y;
            if (i11 == 0) {
                gt.o.b(objG);
                l0 l0VarB = g1.b();
                b bVar2 = new b(str, str2, str3, null);
                c0594a.f32864t = nt.l.a(str);
                c0594a.f32865u = nt.l.a(str2);
                c0594a.f32866v = nt.l.a(str3);
                c0594a.f32869y = 1;
                objG = iu.i.g(l0VarB, bVar2, c0594a);
                if (objG == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(objG);
            }
            Intrinsics.checkNotNullExpressionValue(objG, "withContext(...)");
            return objG;
        }

        @Override // ug.p.c
        public void c(String counterName, long value) {
            Intrinsics.checkNotNullParameter(counterName, "counterName");
            ti.g.b().r(counterName, value);
        }
    }

    static {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        t1 t1VarC = v1.c(executorServiceNewSingleThreadExecutor);
        eventUploadDispatcher = t1VarC;
        eventUploadScope = q0.a(t1VarC);
        eventUploader = new a();
        analyticEventDao = gt.i.b(new Function0() { // from class: ug.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m.d();
            }
        });
        eventUploadWorker = gt.i.b(new Function0() { // from class: ug.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m.e();
            }
        });
    }

    public static final void c(@NotNull String evt, @NotNull String ctx, @NotNull List<? extends NameValuePair> params, boolean waitForFullBatch) {
        Intrinsics.checkNotNullParameter(evt, "evt");
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(params, "params");
        f32859a.g().h(evt, ctx, params, waitForFullBatch);
    }

    public static final kh.a d() {
        jh.c cVar = jh.c.f21914a;
        Context contextF = RobloxApplication.f();
        Intrinsics.checkNotNullExpressionValue(contextF, "getAppContext(...)");
        RobloxDatabase robloxDatabaseB = cVar.b(contextF);
        if (robloxDatabaseB != null) {
            return robloxDatabaseB.X();
        }
        return null;
    }

    public static final p e() {
        p0 p0Var = eventUploadScope;
        m mVar = f32859a;
        return new p(p0Var, mVar.f(), eventUploader, mVar.h());
    }

    public static final void i(boolean waitForFullBatch) {
        f32859a.g().q(waitForFullBatch);
    }

    public final kh.a f() {
        return (kh.a) analyticEventDao.getValue();
    }

    public final p g() {
        return (p) eventUploadWorker.getValue();
    }

    public final p.Config h() {
        int iV = rh.h.a().v();
        String strD0 = a1.D0();
        Intrinsics.checkNotNullExpressionValue(strD0, "rbxAnalyticsBatchUrl(...)");
        String strS = a1.S();
        Intrinsics.checkNotNullExpressionValue(strS, "getJsonContentType(...)");
        String mDeviceId = a1.f30333t;
        Intrinsics.checkNotNullExpressionValue(mDeviceId, "mDeviceId");
        return new p.Config(strD0, iV, strS, mDeviceId, ek.c.d(), false, rh.h.a().r5(), rh.h.a().W(), rh.h.a().L4(), rh.h.a().G2());
    }
}
