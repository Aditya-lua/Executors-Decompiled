package zo;

import android.content.Context;
import com.withpersona.sdk2.inquiry.internal.network.UpdateInquirySessionRequest;
import com.withpersona.sdk2.inquiry.sna.SilentNetworkAuthConfig;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u001fB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\u00020\u0016*\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010#¨\u0006$"}, d2 = {"Lzo/k0;", "", "Landroid/content/Context;", "applicationContext", "Lzq/a$a;", "silentNetworkAuthWorkerFactory", "Lgp/w;", "service", "<init>", "(Landroid/content/Context;Lzq/a$a;Lgp/w;)V", "", "sessionToken", "checkUrl", "", "timeoutSeconds", "", "c", "(Ljava/lang/String;Ljava/lang/String;ILnt/b;)Ljava/lang/Object;", "Ljt/n;", "Lzq/c$b;", "d", "(Ljava/lang/String;ILnt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;", "g", "(Lzq/c$b;)Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;", "", "f", "(Ljava/lang/Throwable;)Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;", "request", "e", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;Lnt/b;)Ljava/lang/Object;", "a", "Landroid/content/Context;", "b", "Lzq/a$a;", "Lgp/w;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final zq.a.C0689a silentNetworkAuthWorkerFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gp.w service;

    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.SilentNetworkAuthenticationOrchestrator", f = "SilentNetworkAuthenticationOrchestrator.kt", l = {29, 34}, m = "perform")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b extends pt.d {
        public int A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f37917t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f37918u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f37919v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f37920w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f37921x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f37922y;

        public b(nt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f37922y = obj;
            this.A |= Integer.MIN_VALUE;
            return k0.this.c(null, null, 0, this);
        }
    }

    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.SilentNetworkAuthenticationOrchestrator", f = "SilentNetworkAuthenticationOrchestrator.kt", l = {43}, m = "runSna-0E7RQCE")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f37924t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f37925u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f37926v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f37927w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f37929y;

        public c(nt.b<? super c> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f37927w = obj;
            this.f37929y |= Integer.MIN_VALUE;
            Object objD = k0.this.d(null, 0, this);
            return objD == ot.c.e() ? objD : jt.n.a(objD);
        }
    }

    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.SilentNetworkAuthenticationOrchestrator", f = "SilentNetworkAuthenticationOrchestrator.kt", l = {70}, m = "sendUpdate")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class d extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f37930t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f37931u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f37932v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f37934x;

        public d(nt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f37932v = obj;
            this.f37934x |= Integer.MIN_VALUE;
            return k0.this.e(null, null, this);
        }
    }

    public k0(@NotNull Context applicationContext, @NotNull zq.a.C0689a silentNetworkAuthWorkerFactory, @NotNull gp.w service) {
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
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull java.lang.String r7, int r8, @org.jetbrains.annotations.NotNull nt.b<? super kotlin.Unit> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof zo.k0.b
            if (r0 == 0) goto L13
            r0 = r9
            zo.k0$b r0 = (zo.k0.b) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            zo.k0$b r0 = new zo.k0$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f37922y
            java.lang.Object r1 = ot.c.e()
            int r2 = r0.A
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L55
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r6 = r0.f37920w
            com.withpersona.sdk2.inquiry.internal.network.UpdateInquirySessionRequest r6 = (com.withpersona.sdk2.inquiry.internal.network.UpdateInquirySessionRequest) r6
            java.lang.Object r6 = r0.f37918u
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f37917t
            java.lang.String r6 = (java.lang.String) r6
            jt.o.b(r9)
            goto La0
        L38:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L40:
            int r8 = r0.f37921x
            java.lang.Object r6 = r0.f37918u
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r0.f37917t
            java.lang.String r6 = (java.lang.String) r6
            jt.o.b(r9)
            jt.n r9 = (jt.n) r9
            java.lang.Object r9 = r9.getValue()
            goto L6b
        L55:
            jt.o.b(r9)
            r0.f37917t = r6
            java.lang.Object r9 = pt.l.a(r7)
            r0.f37918u = r9
            r0.f37921x = r8
            r0.A = r4
            java.lang.Object r9 = r5.d(r7, r8, r0)
            if (r9 != r1) goto L6b
            goto L9f
        L6b:
            java.lang.Throwable r2 = jt.n.e(r9)
            if (r2 != 0) goto L79
            r2 = r9
            zq.c$b r2 = (zq.c.b) r2
            com.withpersona.sdk2.inquiry.internal.network.UpdateInquirySessionRequest r2 = r5.g(r2)
            goto L7d
        L79:
            com.withpersona.sdk2.inquiry.internal.network.UpdateInquirySessionRequest r2 = r5.f(r2)
        L7d:
            java.lang.Object r4 = pt.l.a(r6)
            r0.f37917t = r4
            java.lang.Object r7 = pt.l.a(r7)
            r0.f37918u = r7
            java.lang.Object r7 = pt.l.a(r9)
            r0.f37919v = r7
            java.lang.Object r7 = pt.l.a(r2)
            r0.f37920w = r7
            r0.f37921x = r8
            r0.A = r3
            java.lang.Object r6 = r5.e(r6, r2, r0)
            if (r6 != r1) goto La0
        L9f:
            return r1
        La0:
            kotlin.Unit r6 = kotlin.Unit.f22483a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zo.k0.c(java.lang.String, java.lang.String, int, nt.b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, int i10, nt.b<? super jt.n<? extends zq.c.b>> bVar) {
        c cVar;
        if (bVar instanceof c) {
            cVar = (c) bVar;
            int i11 = cVar.f37929y;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f37929y = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(bVar);
            }
        } else {
            cVar = new c(bVar);
        }
        Object objU = cVar.f37927w;
        Object objE = ot.c.e();
        int i12 = cVar.f37929y;
        try {
            if (i12 == 0) {
                jt.o.b(objU);
                zq.a aVarA = this.silentNetworkAuthWorkerFactory.a(this.applicationContext, new SilentNetworkAuthConfig(str, 0, 0L, 6, null), i10);
                jt.n.Companion companion = jt.n.INSTANCE;
                nu.h<zq.c.b> hVarRun = aVarA.run();
                cVar.f37924t = pt.l.a(str);
                cVar.f37925u = pt.l.a(aVarA);
                cVar.f37926v = i10;
                cVar.f37929y = 1;
                objU = nu.j.u(hVarRun, cVar);
                if (objU == objE) {
                    return objE;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(objU);
            }
            return jt.n.b(objU);
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th2) {
            jt.n.Companion companion2 = jt.n.INSTANCE;
            return jt.n.b(jt.o.a(th2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, UpdateInquirySessionRequest updateInquirySessionRequest, nt.b<? super Unit> bVar) {
        d dVar;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i10 = dVar.f37934x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f37934x = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(bVar);
            }
        } else {
            dVar = new d(bVar);
        }
        Object obj = dVar.f37932v;
        Object objE = ot.c.e();
        int i11 = dVar.f37934x;
        try {
            if (i11 == 0) {
                jt.o.b(obj);
                gp.w wVar = this.service;
                dVar.f37930t = pt.l.a(str);
                dVar.f37931u = pt.l.a(updateInquirySessionRequest);
                dVar.f37934x = 1;
                if (wVar.i(str, updateInquirySessionRequest, dVar) == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
            }
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable unused) {
        }
        return Unit.f22483a;
    }

    public final UpdateInquirySessionRequest f(Throwable th2) {
        return UpdateInquirySessionRequest.Companion.c(UpdateInquirySessionRequest.INSTANCE, null, "sdk_error", th2.getClass().getSimpleName(), 1, null);
    }

    public final UpdateInquirySessionRequest g(zq.c.b bVar) {
        if (bVar instanceof zq.c.b.C0691b) {
            return UpdateInquirySessionRequest.Companion.c(UpdateInquirySessionRequest.INSTANCE, ((zq.c.b.C0691b) bVar).a(), null, null, 6, null);
        }
        if (!(bVar instanceof zq.c.b.Error)) {
            throw new jt.l();
        }
        zq.c.b.Error error = (zq.c.b.Error) bVar;
        return UpdateInquirySessionRequest.Companion.c(UpdateInquirySessionRequest.INSTANCE, null, error.getErrorName(), error.getErrorMessage(), 1, null);
    }
}
