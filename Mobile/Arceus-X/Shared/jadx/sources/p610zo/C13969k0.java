package p610zo;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.withpersona.sdk2.inquiry.internal.network.UpdateInquirySessionRequest;
import com.withpersona.sdk2.inquiry.sna.SilentNetworkAuthConfig;
import gp.InterfaceC6203w;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nu.C9579j;
import nu.InterfaceC9575h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7345l;
import p229jt.C7347n;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p612zq.C14035a;
import p612zq.InterfaceC14037c;
import pt.AbstractC10342d;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: zo.k0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u001fB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\u00020\u0016*\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010#¨\u0006$"}, m31665d2 = {"Lzo/k0;", "", "Landroid/content/Context;", "applicationContext", "Lzq/a$a;", "silentNetworkAuthWorkerFactory", "Lgp/w;", NotificationCompat.CATEGORY_SERVICE, "<init>", "(Landroid/content/Context;Lzq/a$a;Lgp/w;)V", "", "sessionToken", "checkUrl", "", "timeoutSeconds", "", "c", "(Ljava/lang/String;Ljava/lang/String;ILnt/b;)Ljava/lang/Object;", "Ljt/n;", "Lzq/c$b;", "d", "(Ljava/lang/String;ILnt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;", "g", "(Lzq/c$b;)Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;", "", "f", "(Ljava/lang/Throwable;)Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;", "request", "e", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;Lnt/b;)Ljava/lang/Object;", "a", "Landroid/content/Context;", "b", "Lzq/a$a;", "Lgp/w;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C13969k0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C14035a.a silentNetworkAuthWorkerFactory;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC6203w service;

    /* JADX INFO: renamed from: zo.k0$b */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.SilentNetworkAuthenticationOrchestrator", m39664f = "SilentNetworkAuthenticationOrchestrator.kt", m39665l = {29, 34}, m39666m = "perform")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public int f48814A;

        /* JADX INFO: renamed from: t */
        public Object f48815t;

        /* JADX INFO: renamed from: u */
        public Object f48816u;

        /* JADX INFO: renamed from: v */
        public Object f48817v;

        /* JADX INFO: renamed from: w */
        public Object f48818w;

        /* JADX INFO: renamed from: x */
        public int f48819x;

        /* JADX INFO: renamed from: y */
        public /* synthetic */ Object f48820y;

        public b(InterfaceC9557b<? super b> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f48820y = obj;
            this.f48814A |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C13969k0.this.m50490c(null, null, 0, this);
        }
    }

    /* JADX INFO: renamed from: zo.k0$c */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.SilentNetworkAuthenticationOrchestrator", m39664f = "SilentNetworkAuthenticationOrchestrator.kt", m39665l = {43}, m39666m = "runSna-0E7RQCE")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class c extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f48822t;

        /* JADX INFO: renamed from: u */
        public Object f48823u;

        /* JADX INFO: renamed from: v */
        public int f48824v;

        /* JADX INFO: renamed from: w */
        public /* synthetic */ Object f48825w;

        /* JADX INFO: renamed from: y */
        public int f48827y;

        public c(InterfaceC9557b<? super c> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f48825w = obj;
            this.f48827y |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object objM50491d = C13969k0.this.m50491d(null, 0, this);
            return objM50491d == C10047c.m38805e() ? objM50491d : C7347n.m30459a(objM50491d);
        }
    }

    /* JADX INFO: renamed from: zo.k0$d */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.SilentNetworkAuthenticationOrchestrator", m39664f = "SilentNetworkAuthenticationOrchestrator.kt", m39665l = {70}, m39666m = "sendUpdate")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class d extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f48828t;

        /* JADX INFO: renamed from: u */
        public Object f48829u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f48830v;

        /* JADX INFO: renamed from: x */
        public int f48832x;

        public d(InterfaceC9557b<? super d> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f48830v = obj;
            this.f48832x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C13969k0.this.m50492e(null, null, this);
        }
    }

    public C13969k0(@NotNull Context applicationContext, @NotNull C14035a.a silentNetworkAuthWorkerFactory, @NotNull InterfaceC6203w service) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(silentNetworkAuthWorkerFactory, "silentNetworkAuthWorkerFactory");
        Intrinsics.checkNotNullParameter(service, "service");
        this.applicationContext = applicationContext;
        this.silentNetworkAuthWorkerFactory = silentNetworkAuthWorkerFactory;
        this.service = service;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009d, code lost:
    
        if (m50492e(r6, r2, r0) == r1) goto L25;
     */
    @Nullable
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m50490c(@NotNull String str, @NotNull String str2, int i10, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        b bVar;
        Object objM50491d;
        if (interfaceC9557b instanceof b) {
            bVar = (b) interfaceC9557b;
            int i11 = bVar.f48814A;
            if ((i11 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                bVar.f48814A = i11 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                bVar = new b(interfaceC9557b);
            }
        } else {
            bVar = new b(interfaceC9557b);
        }
        Object obj = bVar.f48820y;
        Object objM38805e = C10047c.m38805e();
        int i12 = bVar.f48814A;
        if (i12 == 0) {
            C7348o.m30470b(obj);
            bVar.f48815t = str;
            bVar.f48816u = C10350l.m39676a(str2);
            bVar.f48819x = i10;
            bVar.f48814A = 1;
            objM50491d = m50491d(str2, i10, bVar);
            if (objM50491d != objM38805e) {
            }
            return objM38805e;
        }
        if (i12 == 1) {
            i10 = bVar.f48819x;
            str2 = (String) bVar.f48816u;
            str = (String) bVar.f48815t;
            C7348o.m30470b(obj);
            objM50491d = ((C7347n) obj).getValue();
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
        }
        return Unit.f29331a;
        Throwable thM30463e = C7347n.m30463e(objM50491d);
        UpdateInquirySessionRequest updateInquirySessionRequestM50494g = thM30463e == null ? m50494g((InterfaceC14037c.b) objM50491d) : m50493f(thM30463e);
        bVar.f48815t = C10350l.m39676a(str);
        bVar.f48816u = C10350l.m39676a(str2);
        bVar.f48817v = C10350l.m39676a(objM50491d);
        bVar.f48818w = C10350l.m39676a(updateInquirySessionRequestM50494g);
        bVar.f48819x = i10;
        bVar.f48814A = 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m50491d(String str, int i10, InterfaceC9557b<? super C7347n<? extends InterfaceC14037c.b>> interfaceC9557b) {
        c cVar;
        if (interfaceC9557b instanceof c) {
            cVar = (c) interfaceC9557b;
            int i11 = cVar.f48827y;
            if ((i11 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                cVar.f48827y = i11 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                cVar = new c(interfaceC9557b);
            }
        } else {
            cVar = new c(interfaceC9557b);
        }
        Object objM37804u = cVar.f48825w;
        Object objM38805e = C10047c.m38805e();
        int i12 = cVar.f48827y;
        try {
            if (i12 == 0) {
                C7348o.m30470b(objM37804u);
                C14035a c14035aM50711a = this.silentNetworkAuthWorkerFactory.m50711a(this.applicationContext, new SilentNetworkAuthConfig(str, 0, 0L, 6, null), i10);
                C7347n.Companion companion = C7347n.INSTANCE;
                InterfaceC9575h<InterfaceC14037c.b> interfaceC9575hRun = c14035aM50711a.run();
                cVar.f48822t = C10350l.m39676a(str);
                cVar.f48823u = C10350l.m39676a(c14035aM50711a);
                cVar.f48824v = i10;
                cVar.f48827y = 1;
                objM37804u = C9579j.m37804u(interfaceC9575hRun, cVar);
                if (objM37804u == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(objM37804u);
            }
            return C7347n.m30460b(objM37804u);
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            return C7347n.m30460b(C7348o.m30469a(th2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m50492e(String str, UpdateInquirySessionRequest updateInquirySessionRequest, InterfaceC9557b<? super Unit> interfaceC9557b) {
        d dVar;
        if (interfaceC9557b instanceof d) {
            dVar = (d) interfaceC9557b;
            int i10 = dVar.f48832x;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                dVar.f48832x = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                dVar = new d(interfaceC9557b);
            }
        } else {
            dVar = new d(interfaceC9557b);
        }
        Object obj = dVar.f48830v;
        Object objM38805e = C10047c.m38805e();
        int i11 = dVar.f48832x;
        try {
            if (i11 == 0) {
                C7348o.m30470b(obj);
                InterfaceC6203w interfaceC6203w = this.service;
                dVar.f48828t = C10350l.m39676a(str);
                dVar.f48829u = C10350l.m39676a(updateInquirySessionRequest);
                dVar.f48832x = 1;
                if (interfaceC6203w.m27320i(str, updateInquirySessionRequest, dVar) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable unused) {
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: f */
    public final UpdateInquirySessionRequest m50493f(Throwable th2) {
        return UpdateInquirySessionRequest.Companion.m18693c(UpdateInquirySessionRequest.INSTANCE, null, "sdk_error", th2.getClass().getSimpleName(), 1, null);
    }

    /* JADX INFO: renamed from: g */
    public final UpdateInquirySessionRequest m50494g(InterfaceC14037c.b bVar) {
        if (bVar instanceof InterfaceC14037c.b.C14301b) {
            return UpdateInquirySessionRequest.Companion.m18693c(UpdateInquirySessionRequest.INSTANCE, ((InterfaceC14037c.b.C14301b) bVar).m50720a(), null, null, 6, null);
        }
        if (!(bVar instanceof InterfaceC14037c.b.Error)) {
            throw new C7345l();
        }
        InterfaceC14037c.b.Error error = (InterfaceC14037c.b.Error) bVar;
        return UpdateInquirySessionRequest.Companion.m18693c(UpdateInquirySessionRequest.INSTANCE, null, error.getErrorName(), error.getErrorMessage(), 1, null);
    }
}
