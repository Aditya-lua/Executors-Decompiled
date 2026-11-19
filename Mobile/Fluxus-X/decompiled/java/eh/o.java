package eh;

import android.content.Context;
import av.g1;
import av.t1;
import av.v1;
import bh.a1;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.RobloxApplication;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.client.db.RobloxDatabase;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010 \u001a\u0004\u0018\u00010\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010+R\u0014\u0010.\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010-¨\u0006/"}, d2 = {"Leh/o;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "evt", "ctx", BuildConfig.FLAVOR, "Lcom/roblox/client/datastructures/NameValuePair;", "params", BuildConfig.FLAVOR, "waitForFullBatch", BuildConfig.FLAVOR, "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "j", "(Z)V", "Lav/l0;", "b", "Lav/l0;", "eventUploadDispatcher", "Lav/p0;", "Lav/p0;", "eventUploadScope", "Leh/r$c;", "d", "Leh/r$c;", "eventUploader", "Luh/a;", "e", "Lzt/h;", "()Luh/a;", "analyticEventDao", "Leh/r;", "f", "h", "()Leh/r;", "productionEventUploadWorker", "Leh/l;", "g", "Leh/l;", "testEventUploadWorker", "Leh/r$b;", "()Leh/r$b;", "eventUploaderConfig", "()Leh/l;", "eventUploadWorker", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final o f13562a = new o();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final av.l0 eventUploadDispatcher;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final av.p0 eventUploadScope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final r.c eventUploader;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final zt.h analyticEventDao;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final zt.h productionEventUploadWorker;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static volatile l testEventUploadWorker;

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"eh/o$a", "Leh/r$c;", BuildConfig.FLAVOR, "url", "body", "contentType", "Lmi/j;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Leu/b;)Ljava/lang/Object;", "counterName", BuildConfig.FLAVOR, "a", "(Ljava/lang/String;)V", BuildConfig.FLAVOR, "value", "b", "(Ljava/lang/String;J)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements r.c {

        /* JADX INFO: renamed from: eh.o$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        @gu.f(c = "com.roblox.client.analytics.EventUploadJob$eventUploader$1", f = "EventUploadJob.kt", l = {56}, m = "upload", v = 1)
        public static final class C0261a extends gu.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f13568t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public Object f13569u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public Object f13570v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public /* synthetic */ Object f13571w;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public int f13573y;

            public C0261a(eu.b<? super C0261a> bVar) {
                super(bVar);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                this.f13571w = obj;
                this.f13573y |= Integer.MIN_VALUE;
                return a.this.c(null, null, null, this);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lav/p0;", "Lmi/j;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lav/p0;)Lmi/j;"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.roblox.client.analytics.EventUploadJob$eventUploader$1$upload$2", f = "EventUploadJob.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class b extends gu.m implements Function2<av.p0, eu.b<? super mi.j>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f13574t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ String f13575u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ String f13576v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ String f13577w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, String str2, String str3, eu.b<? super b> bVar) {
                super(2, bVar);
                this.f13575u = str;
                this.f13576v = str2;
                this.f13577w = str3;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new b(this.f13575u, this.f13576v, this.f13577w, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(av.p0 p0Var, eu.b<? super mi.j> bVar) {
                return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                fu.c.e();
                if (this.f13574t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                return mi.c.l(this.f13575u, this.f13576v, null, this.f13577w, -1, -1);
            }
        }

        @Override // eh.r.c
        public void a(String counterName) {
            Intrinsics.checkNotNullParameter(counterName, "counterName");
            dj.g.b().q(counterName);
        }

        @Override // eh.r.c
        public void b(String counterName, long value) {
            Intrinsics.checkNotNullParameter(counterName, "counterName");
            dj.g.b().r(counterName, value);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // eh.r.c
        public Object c(String str, String str2, String str3, eu.b<? super mi.j> bVar) {
            C0261a c0261a;
            if (bVar instanceof C0261a) {
                c0261a = (C0261a) bVar;
                int i10 = c0261a.f13573y;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c0261a.f13573y = i10 - Integer.MIN_VALUE;
                } else {
                    c0261a = new C0261a(bVar);
                }
            } else {
                c0261a = new C0261a(bVar);
            }
            Object objG = c0261a.f13571w;
            Object objE = fu.c.e();
            int i11 = c0261a.f13573y;
            if (i11 == 0) {
                zt.o.b(objG);
                av.l0 l0VarB = g1.b();
                b bVar2 = new b(str, str2, str3, null);
                c0261a.f13568t = gu.l.a(str);
                c0261a.f13569u = gu.l.a(str2);
                c0261a.f13570v = gu.l.a(str3);
                c0261a.f13573y = 1;
                objG = av.i.g(l0VarB, bVar2, c0261a);
                if (objG == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(objG);
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
        eventUploadScope = av.q0.a(t1VarC);
        eventUploader = new a();
        analyticEventDao = zt.i.a(new Function0() { // from class: eh.m
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o.d();
            }
        });
        productionEventUploadWorker = zt.i.a(new Function0() { // from class: eh.n
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o.i();
            }
        });
    }

    public static final void c(@NotNull String evt, @NotNull String ctx, @NotNull List<? extends NameValuePair> params, boolean waitForFullBatch) {
        Intrinsics.checkNotNullParameter(evt, "evt");
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(params, "params");
        f13562a.f().a(evt, ctx, params, waitForFullBatch);
    }

    public static final uh.a d() {
        th.c cVar = th.c.f32426a;
        Context contextF = RobloxApplication.f();
        Intrinsics.checkNotNullExpressionValue(contextF, "getAppContext(...)");
        RobloxDatabase robloxDatabaseB = cVar.b(contextF);
        if (robloxDatabaseB != null) {
            return robloxDatabaseB.X();
        }
        return null;
    }

    public static final r i() {
        av.p0 p0Var = eventUploadScope;
        o oVar = f13562a;
        return new r(p0Var, oVar.e(), eventUploader, oVar.g());
    }

    public static final void j(boolean waitForFullBatch) {
        f13562a.f().b(waitForFullBatch);
    }

    public final uh.a e() {
        return (uh.a) analyticEventDao.getValue();
    }

    public final l f() {
        l lVar = testEventUploadWorker;
        return lVar == null ? h() : lVar;
    }

    public final r.Config g() {
        int iV = bi.h.a().v();
        String strD0 = a1.D0();
        Intrinsics.checkNotNullExpressionValue(strD0, "rbxAnalyticsBatchUrl(...)");
        String strS = a1.S();
        Intrinsics.checkNotNullExpressionValue(strS, "getJsonContentType(...)");
        String mDeviceId = a1.f4036t;
        Intrinsics.checkNotNullExpressionValue(mDeviceId, "mDeviceId");
        return new r.Config(strD0, iV, strS, mDeviceId, ok.c.d(), false, bi.h.a().q5(), bi.h.a().Y(), bi.h.a().M4(), bi.h.a().I2());
    }

    public final r h() {
        return (r) productionEventUploadWorker.getValue();
    }
}
