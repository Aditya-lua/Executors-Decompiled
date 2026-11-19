package np;

import android.content.Context;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.internal.network.UpdateInquirySessionRequest;
import java.util.concurrent.CancellationException;
import nr.SilentNetworkAuthConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u001fB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\u00020\u0016*\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010#¨\u0006$"}, d2 = {"Lnp/m0;", BuildConfig.FLAVOR, "Landroid/content/Context;", "applicationContext", "Lnr/b$a;", "silentNetworkAuthWorkerFactory", "Lup/w;", "service", "<init>", "(Landroid/content/Context;Lnr/b$a;Lup/w;)V", BuildConfig.FLAVOR, "sessionToken", "checkUrl", BuildConfig.FLAVOR, "timeoutSeconds", BuildConfig.FLAVOR, "c", "(Ljava/lang/String;Ljava/lang/String;ILeu/b;)Ljava/lang/Object;", "Lzt/n;", "Lnr/d$b;", "d", "(Ljava/lang/String;ILeu/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;", "g", "(Lnr/d$b;)Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;", BuildConfig.FLAVOR, "f", "(Ljava/lang/Throwable;)Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;", "request", "e", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;Leu/b;)Ljava/lang/Object;", "a", "Landroid/content/Context;", "b", "Lnr/b$a;", "Lup/w;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final nr.b.a silentNetworkAuthWorkerFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final up.w service;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.SilentNetworkAuthenticationOrchestrator", f = "SilentNetworkAuthenticationOrchestrator.kt", l = {29, 34}, m = "perform")
    public static final class b extends gu.d {
        public int A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f26362t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f26363u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f26364v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f26365w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f26366x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f26367y;

        public b(eu.b<? super b> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f26367y = obj;
            this.A |= Integer.MIN_VALUE;
            return m0.this.c(null, null, 0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.SilentNetworkAuthenticationOrchestrator", f = "SilentNetworkAuthenticationOrchestrator.kt", l = {43}, m = "runSna-0E7RQCE")
    public static final class c extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f26369t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f26370u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f26371v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f26372w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f26374y;

        public c(eu.b<? super c> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f26372w = obj;
            this.f26374y |= Integer.MIN_VALUE;
            Object objD = m0.this.d(null, 0, this);
            return objD == fu.c.e() ? objD : zt.n.a(objD);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.SilentNetworkAuthenticationOrchestrator", f = "SilentNetworkAuthenticationOrchestrator.kt", l = {70}, m = "sendUpdate")
    public static final class d extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f26375t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f26376u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f26377v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f26379x;

        public d(eu.b<? super d> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f26377v = obj;
            this.f26379x |= Integer.MIN_VALUE;
            return m0.this.e(null, null, this);
        }
    }

    public m0(@NotNull Context applicationContext, @NotNull nr.b.a silentNetworkAuthWorkerFactory, @NotNull up.w service) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(silentNetworkAuthWorkerFactory, "silentNetworkAuthWorkerFactory");
        Intrinsics.checkNotNullParameter(service, "service");
        this.applicationContext = applicationContext;
        this.silentNetworkAuthWorkerFactory = silentNetworkAuthWorkerFactory;
        this.service = service;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009d, code lost:
    
        if (e(r6, r2, r0) == r1) goto L25;
     */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(@NotNull String str, @NotNull String str2, int i10, @NotNull eu.b<? super Unit> bVar) {
        b bVar2;
        Object objD;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i11 = bVar2.A;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar2.A = i11 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object obj = bVar2.f26367y;
        Object objE = fu.c.e();
        int i12 = bVar2.A;
        if (i12 == 0) {
            zt.o.b(obj);
            bVar2.f26362t = str;
            bVar2.f26363u = gu.l.a(str2);
            bVar2.f26366x = i10;
            bVar2.A = 1;
            objD = d(str2, i10, bVar2);
            if (objD != objE) {
            }
            return objE;
        }
        if (i12 == 1) {
            i10 = bVar2.f26366x;
            str2 = (String) bVar2.f26363u;
            str = (String) bVar2.f26362t;
            zt.o.b(obj);
            objD = ((zt.n) obj).getValue();
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
        }
        return Unit.f21506a;
        Throwable thE = zt.n.e(objD);
        UpdateInquirySessionRequest updateInquirySessionRequestG = thE == null ? g((nr.d.b) objD) : f(thE);
        bVar2.f26362t = gu.l.a(str);
        bVar2.f26363u = gu.l.a(str2);
        bVar2.f26364v = gu.l.a(objD);
        bVar2.f26365w = gu.l.a(updateInquirySessionRequestG);
        bVar2.f26366x = i10;
        bVar2.A = 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, int i10, eu.b<? super zt.n<? extends nr.d.b>> bVar) {
        c cVar;
        if (bVar instanceof c) {
            cVar = (c) bVar;
            int i11 = cVar.f26374y;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f26374y = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(bVar);
            }
        } else {
            cVar = new c(bVar);
        }
        Object objT = cVar.f26372w;
        Object objE = fu.c.e();
        int i12 = cVar.f26374y;
        try {
            if (i12 == 0) {
                zt.o.b(objT);
                nr.b bVarA = this.silentNetworkAuthWorkerFactory.a(this.applicationContext, new SilentNetworkAuthConfig(str, 0, 0L, 6, null), i10);
                zt.n.Companion companion = zt.n.INSTANCE;
                dv.h<nr.d.b> hVarRun = bVarA.run();
                cVar.f26369t = gu.l.a(str);
                cVar.f26370u = gu.l.a(bVarA);
                cVar.f26371v = i10;
                cVar.f26374y = 1;
                objT = dv.j.t(hVarRun, cVar);
                if (objT == objE) {
                    return objE;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(objT);
            }
            return zt.n.b(objT);
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th2) {
            zt.n.Companion companion2 = zt.n.INSTANCE;
            return zt.n.b(zt.o.a(th2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, UpdateInquirySessionRequest updateInquirySessionRequest, eu.b<? super Unit> bVar) {
        d dVar;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i10 = dVar.f26379x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f26379x = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(bVar);
            }
        } else {
            dVar = new d(bVar);
        }
        Object obj = dVar.f26377v;
        Object objE = fu.c.e();
        int i11 = dVar.f26379x;
        try {
            if (i11 == 0) {
                zt.o.b(obj);
                up.w wVar = this.service;
                dVar.f26375t = gu.l.a(str);
                dVar.f26376u = gu.l.a(updateInquirySessionRequest);
                dVar.f26379x = 1;
                if (wVar.e(str, updateInquirySessionRequest, dVar) == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable unused) {
        }
        return Unit.f21506a;
    }

    public final UpdateInquirySessionRequest f(Throwable th2) {
        return UpdateInquirySessionRequest.Companion.c(UpdateInquirySessionRequest.INSTANCE, null, "sdk_error", th2.getClass().getSimpleName(), 1, null);
    }

    public final UpdateInquirySessionRequest g(nr.d.b bVar) {
        if (bVar instanceof nr.d.b.C0532b) {
            return UpdateInquirySessionRequest.Companion.c(UpdateInquirySessionRequest.INSTANCE, ((nr.d.b.C0532b) bVar).a(), null, null, 6, null);
        }
        if (!(bVar instanceof nr.d.b.Error)) {
            throw new zt.l();
        }
        nr.d.b.Error error = (nr.d.b.Error) bVar;
        return UpdateInquirySessionRequest.Companion.c(UpdateInquirySessionRequest.INSTANCE, null, error.getErrorName(), error.getErrorMessage(), 1, null);
    }
}
