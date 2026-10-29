package vg;

import android.content.Context;
import com.roblox.client.RobloxApplication;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.client.db.RobloxDatabase;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.g1;
import ku.l0;
import ku.p0;
import ku.q0;
import ku.t1;
import ku.v1;
import org.jetbrains.annotations.NotNull;
import sg.a1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010!\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010%\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lvg/m;", "", "<init>", "()V", "", "evt", "ctx", "", "Lcom/roblox/client/datastructures/NameValuePair;", "params", "", "waitForFullBatch", "", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "i", "(Z)V", "Lku/l0;", "b", "Lku/l0;", "eventUploadDispatcher", "Lku/p0;", "Lku/p0;", "eventUploadScope", "Lvg/p$c;", "d", "Lvg/p$c;", "eventUploader", "Llh/a;", "e", "Ljt/h;", "f", "()Llh/a;", "analyticEventDao", "Lvg/p;", "g", "()Lvg/p;", "eventUploadWorker", "Lvg/p$b;", "h", "()Lvg/p$b;", "eventUploaderConfig", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final m f33115a = new m();

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
    public static final jt.h analyticEventDao;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final jt.h eventUploadWorker;

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"vg/m$a", "Lvg/p$c;", "", "url", "body", "contentType", "Lei/j;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "counterName", "", "a", "(Ljava/lang/String;)V", "", "value", "b", "(Ljava/lang/String;J)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements p.c {

        /* JADX INFO: renamed from: vg.m$a$a, reason: collision with other inner class name */
        @pt.f(c = "com.roblox.client.analytics.EventUploadJob$eventUploader$1", f = "EventUploadJob.kt", l = {55}, m = "upload", v = 1)
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0599a extends pt.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f33120t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public Object f33121u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public Object f33122v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public /* synthetic */ Object f33123w;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public int f33125y;

            public C0599a(nt.b<? super C0599a> bVar) {
                super(bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                this.f33123w = obj;
                this.f33125y |= Integer.MIN_VALUE;
                return a.this.c(null, null, null, this);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lku/p0;", "Lei/j;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lku/p0;)Lei/j;"}, k = 3, mv = {2, 2, 0})
        @pt.f(c = "com.roblox.client.analytics.EventUploadJob$eventUploader$1$upload$2", f = "EventUploadJob.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class b extends pt.m implements Function2<p0, nt.b<? super ei.j>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f33126t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ String f33127u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ String f33128v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ String f33129w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, String str2, String str3, nt.b<? super b> bVar) {
                super(2, bVar);
                this.f33127u = str;
                this.f33128v = str2;
                this.f33129w = str3;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                return new b(this.f33127u, this.f33128v, this.f33129w, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                ot.c.e();
                if (this.f33126t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                return ei.c.l(this.f33127u, this.f33128v, null, this.f33129w, -1, -1);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, nt.b<? super ei.j> bVar) {
                return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        @Override // vg.p.c
        public void a(String counterName) {
            Intrinsics.checkNotNullParameter(counterName, "counterName");
            vi.g.b().q(counterName);
        }

        @Override // vg.p.c
        public void b(String counterName, long value) {
            Intrinsics.checkNotNullParameter(counterName, "counterName");
            vi.g.b().r(counterName, value);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // vg.p.c
        public Object c(String str, String str2, String str3, nt.b<? super ei.j> bVar) {
            C0599a c0599a;
            if (bVar instanceof C0599a) {
                c0599a = (C0599a) bVar;
                int i10 = c0599a.f33125y;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c0599a.f33125y = i10 - Integer.MIN_VALUE;
                } else {
                    c0599a = new C0599a(bVar);
                }
            } else {
                c0599a = new C0599a(bVar);
            }
            Object objG = c0599a.f33123w;
            Object objE = ot.c.e();
            int i11 = c0599a.f33125y;
            if (i11 == 0) {
                jt.o.b(objG);
                l0 l0VarB = g1.b();
                b bVar2 = new b(str, str2, str3, null);
                c0599a.f33120t = pt.l.a(str);
                c0599a.f33121u = pt.l.a(str2);
                c0599a.f33122v = pt.l.a(str3);
                c0599a.f33125y = 1;
                objG = ku.i.g(l0VarB, bVar2, c0599a);
                if (objG == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(objG);
            }
            Intrinsics.checkNotNullExpressionValue(objG, "withContext(...)");
            return objG;
        }
    }

    static {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        t1 t1VarC = v1.c(executorServiceNewSingleThreadExecutor);
        eventUploadDispatcher = t1VarC;
        eventUploadScope = q0.a(t1VarC);
        eventUploader = new a();
        analyticEventDao = jt.i.b(new Function0() { // from class: vg.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m.d();
            }
        });
        eventUploadWorker = jt.i.b(new Function0() { // from class: vg.l
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
        f33115a.g().h(evt, ctx, params, waitForFullBatch);
    }

    public static final lh.a d() {
        kh.c cVar = kh.c.f22315a;
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
        m mVar = f33115a;
        return new p(p0Var, mVar.f(), eventUploader, mVar.h());
    }

    public static final void i(boolean waitForFullBatch) {
        f33115a.g().q(waitForFullBatch);
    }

    public final lh.a f() {
        return (lh.a) analyticEventDao.getValue();
    }

    public final p g() {
        return (p) eventUploadWorker.getValue();
    }

    public final p.Config h() {
        int iU = th.h.a().u();
        String strC0 = a1.C0();
        Intrinsics.checkNotNullExpressionValue(strC0, "rbxAnalyticsBatchUrl(...)");
        String strS = a1.S();
        Intrinsics.checkNotNullExpressionValue(strS, "getJsonContentType(...)");
        String mDeviceId = a1.f30732t;
        Intrinsics.checkNotNullExpressionValue(mDeviceId, "mDeviceId");
        return new p.Config(strC0, iU, strS, mDeviceId, gk.c.d(), false, th.h.a().e5(), th.h.a().T(), th.h.a().z4(), th.h.a().u2());
    }
}
