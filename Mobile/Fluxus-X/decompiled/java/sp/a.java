package sp;

import android.content.Context;
import av.k;
import av.l0;
import av.n;
import av.p;
import av.p0;
import av.q0;
import av.z2;
import com.appsflyer.share.attribution.RequestError;
import com.github.luben.zstd.BuildConfig;
import dv.c0;
import dv.h;
import dv.i;
import dv.j;
import dv.r0;
import gu.l;
import gu.m;
import java.util.UUID;
import kv.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import zt.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0016B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010%R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010)¨\u0006+"}, d2 = {"Lsp/a;", BuildConfig.FLAVOR, "Landroid/content/Context;", "applicationContext", "Lbq/e$a;", "loggerFactory", "Lsp/f;", "standardIntegrityManagerFactory", "Lav/l0;", "dispatcher", "<init>", "(Landroid/content/Context;Lbq/e$a;Lsp/f;Lav/l0;)V", BuildConfig.FLAVOR, "cloudProjectNumber", BuildConfig.FLAVOR, "h", "(Ljava/lang/String;)V", "g", "(Leu/b;)Ljava/lang/Object;", "i", "a", "Landroid/content/Context;", "b", "Lbq/e$a;", "c", "Lsp/f;", "d", "Lav/l0;", "Lbq/e;", "e", "Lbq/e;", "logger", "Lkv/a;", "f", "Lkv/a;", "mutex", "Lav/p0;", "Lav/p0;", "coroutineScope", "Ldv/c0;", "Lsp/a$b;", "Ldv/c0;", "playIntegrityState", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f31772j;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final bq.e.a loggerFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final f standardIntegrityManagerFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 dispatcher;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final bq.e logger;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final kv.a mutex;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 coroutineScope;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c0<b> playIntegrityState;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lsp/a$b;", BuildConfig.FLAVOR, "b", "c", "a", "d", "Lsp/a$b$a;", "Lsp/a$b$b;", "Lsp/a$b$c;", "Lsp/a$b$d;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {

        /* JADX INFO: renamed from: sp.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsp/a$b$a;", "Lsp/a$b;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0627a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0627a f31780a = new C0627a();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C0627a);
            }

            public int hashCode() {
                return 1174409699;
            }

            @NotNull
            public String toString() {
                return "Error";
            }
        }

        /* JADX INFO: renamed from: sp.a$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsp/a$b$b;", "Lsp/a$b;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0628b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0628b f31781a = new C0628b();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C0628b);
            }

            public int hashCode() {
                return -384804045;
            }

            @NotNull
            public String toString() {
                return "NotStarted";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsp/a$b$c;", "Lsp/a$b;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f31782a = new c();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -230105505;
            }

            @NotNull
            public String toString() {
                return "Preparing";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lsp/a$b$d;", "Lsp/a$b;", "Lvd/c$c;", "integrityTokenProvider", "<init>", "(Lvd/c$c;)V", "a", "Lvd/c$c;", "()Lvd/c$c;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class d implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final vd.c.InterfaceC0700c integrityTokenProvider;

            public d(@NotNull vd.c.InterfaceC0700c integrityTokenProvider) {
                Intrinsics.checkNotNullParameter(integrityTokenProvider, "integrityTokenProvider");
                this.integrityTokenProvider = integrityTokenProvider;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final vd.c.InterfaceC0700c getIntegrityTokenProvider() {
                return this.integrityTokenProvider;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)Ljava/lang/String;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$generateToken$2", f = "PlayIntegrityHelper.kt", l = {119, 158}, m = "invokeSuspend")
    public static final class c extends m implements Function2<p0, eu.b<? super String>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31784t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f31785u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f31786v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f31787w;

        /* JADX INFO: renamed from: sp.a$c$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0629a implements Function1<vd.c.b, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ n<String> f31789a;

            /* JADX WARN: Multi-variable type inference failed */
            public C0629a(n<? super String> nVar) {
                this.f31789a = nVar;
            }

            public final void a(vd.c.b bVar) {
                n<String> nVar = this.f31789a;
                zt.n.Companion companion = zt.n.INSTANCE;
                nVar.resumeWith(zt.n.b(bVar.a()));
            }

            @Override // p001kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(vd.c.b bVar) {
                a(bVar);
                return Unit.f21506a;
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class b implements tb.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a f31790a;
            public final /* synthetic */ n<String> b;

            /* JADX WARN: Multi-variable type inference failed */
            public b(a aVar, n<? super String> nVar) {
                this.f31790a = aVar;
                this.b = nVar;
            }

            @Override // tb.f
            public final void onFailure(Exception it) {
                Intrinsics.checkNotNullParameter(it, "it");
                bq.e.b(this.f31790a.logger, "integrity:request:" + it.getMessage(), null, 2, null);
                this.b.resumeWith(zt.n.b(null));
            }
        }

        /* JADX INFO: renamed from: sp.a$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ldv/i;", "Lsp/a$b;", BuildConfig.FLAVOR, "it", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$generateToken$2$integrityTokenProvider$2", f = "PlayIntegrityHelper.kt", l = {}, m = "invokeSuspend")
        public static final class C0630c extends m implements pu.n<i<? super b>, Throwable, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f31791t;

            public C0630c(eu.b<? super C0630c> bVar) {
                super(3, bVar);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                fu.c.e();
                if (this.f31791t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                b.C0627a c0627a = b.C0627a.f31780a;
                return Unit.f21506a;
            }

            @Override // pu.n
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(i<? super b> iVar, Throwable th2, eu.b<? super Unit> bVar) {
                return new C0630c(bVar).invokeSuspend(Unit.f21506a);
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ldv/h;", "Ldv/i;", "collector", BuildConfig.FLAVOR, "collect", "(Ldv/i;Leu/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class d implements h<b> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ h f31792a;

            /* JADX INFO: renamed from: sp.a$c$d$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0631a<T> implements i {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ i f31793a;

                /* JADX INFO: renamed from: sp.a$c$d$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                @gu.f(c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$generateToken$2$invokeSuspend$$inlined$filter$1$2", f = "PlayIntegrityHelper.kt", l = {RequestError.RESPONSE_CODE_FAILURE}, m = "emit")
                public static final class C0632a extends gu.d {
                    public int A;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public /* synthetic */ Object f31794t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    public int f31795u;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    public Object f31796v;

                    /* JADX INFO: renamed from: w, reason: collision with root package name */
                    public Object f31797w;

                    /* JADX INFO: renamed from: y, reason: collision with root package name */
                    public Object f31799y;

                    /* JADX INFO: renamed from: z, reason: collision with root package name */
                    public Object f31800z;

                    public C0632a(eu.b bVar) {
                        super(bVar);
                    }

                    @Override // gu.a
                    public final Object invokeSuspend(Object obj) {
                        this.f31794t = obj;
                        this.f31795u |= Integer.MIN_VALUE;
                        return C0631a.this.emit(null, this);
                    }
                }

                public C0631a(i iVar) {
                    this.f31793a = iVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // dv.i
                public final Object emit(Object obj, eu.b bVar) {
                    C0632a c0632a;
                    if (bVar instanceof C0632a) {
                        c0632a = (C0632a) bVar;
                        int i10 = c0632a.f31795u;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c0632a.f31795u = i10 - Integer.MIN_VALUE;
                        } else {
                            c0632a = new C0632a(bVar);
                        }
                    } else {
                        c0632a = new C0632a(bVar);
                    }
                    Object obj2 = c0632a.f31794t;
                    Object objE = fu.c.e();
                    int i11 = c0632a.f31795u;
                    if (i11 == 0) {
                        o.b(obj2);
                        i iVar = this.f31793a;
                        b bVar2 = (b) obj;
                        if ((bVar2 instanceof b.C0627a) || (bVar2 instanceof b.d)) {
                            c0632a.f31796v = l.a(obj);
                            c0632a.f31797w = l.a(c0632a);
                            c0632a.f31799y = l.a(obj);
                            c0632a.f31800z = l.a(iVar);
                            c0632a.A = 0;
                            c0632a.f31795u = 1;
                            if (iVar.emit(obj, c0632a) == objE) {
                                return objE;
                            }
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                    }
                    return Unit.f21506a;
                }
            }

            public d(h hVar) {
                this.f31792a = hVar;
            }

            @Override // dv.h
            public Object collect(i<? super b> iVar, eu.b bVar) {
                Object objCollect = this.f31792a.collect(new C0631a(iVar), bVar);
                return objCollect == fu.c.e() ? objCollect : Unit.f21506a;
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ldv/h;", "Ldv/i;", "collector", BuildConfig.FLAVOR, "collect", "(Ldv/i;Leu/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class e implements h<vd.c.InterfaceC0700c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ h f31801a;

            /* JADX INFO: renamed from: sp.a$c$e$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0633a<T> implements i {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ i f31802a;

                /* JADX INFO: renamed from: sp.a$c$e$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                @gu.f(c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$generateToken$2$invokeSuspend$$inlined$map$1$2", f = "PlayIntegrityHelper.kt", l = {RequestError.RESPONSE_CODE_FAILURE}, m = "emit")
                public static final class C0634a extends gu.d {
                    public int A;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public /* synthetic */ Object f31803t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    public int f31804u;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    public Object f31805v;

                    /* JADX INFO: renamed from: x, reason: collision with root package name */
                    public Object f31807x;

                    /* JADX INFO: renamed from: y, reason: collision with root package name */
                    public Object f31808y;

                    /* JADX INFO: renamed from: z, reason: collision with root package name */
                    public Object f31809z;

                    public C0634a(eu.b bVar) {
                        super(bVar);
                    }

                    @Override // gu.a
                    public final Object invokeSuspend(Object obj) {
                        this.f31803t = obj;
                        this.f31804u |= Integer.MIN_VALUE;
                        return C0633a.this.emit(null, this);
                    }
                }

                public C0633a(i iVar) {
                    this.f31802a = iVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // dv.i
                public final Object emit(Object obj, eu.b bVar) {
                    C0634a c0634a;
                    if (bVar instanceof C0634a) {
                        c0634a = (C0634a) bVar;
                        int i10 = c0634a.f31804u;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c0634a.f31804u = i10 - Integer.MIN_VALUE;
                        } else {
                            c0634a = new C0634a(bVar);
                        }
                    } else {
                        c0634a = new C0634a(bVar);
                    }
                    Object obj2 = c0634a.f31803t;
                    Object objE = fu.c.e();
                    int i11 = c0634a.f31804u;
                    if (i11 == 0) {
                        o.b(obj2);
                        i iVar = this.f31802a;
                        b bVar2 = (b) obj;
                        b.d dVar = bVar2 instanceof b.d ? (b.d) bVar2 : null;
                        vd.c.InterfaceC0700c integrityTokenProvider = dVar != null ? dVar.getIntegrityTokenProvider() : null;
                        c0634a.f31805v = l.a(obj);
                        c0634a.f31807x = l.a(c0634a);
                        c0634a.f31808y = l.a(obj);
                        c0634a.f31809z = l.a(iVar);
                        c0634a.A = 0;
                        c0634a.f31804u = 1;
                        if (iVar.emit(integrityTokenProvider, c0634a) == objE) {
                            return objE;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                    }
                    return Unit.f21506a;
                }
            }

            public e(h hVar) {
                this.f31801a = hVar;
            }

            @Override // dv.h
            public Object collect(i<? super vd.c.InterfaceC0700c> iVar, eu.b bVar) {
                Object objCollect = this.f31801a.collect(new C0633a(iVar), bVar);
                return objCollect == fu.c.e() ? objCollect : Unit.f21506a;
            }
        }

        public c(eu.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return a.this.new c(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super String> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f31787w;
            if (i10 == 0) {
                o.b(obj);
                if (a.this.playIntegrityState.getValue() instanceof b.C0628b) {
                    return null;
                }
                e eVar = new e(j.f(j.P(new d(a.this.playIntegrityState), a.f31772j), new C0630c(null)));
                this.f31787w = 1;
                obj = j.v(eVar, this);
                if (obj != objE) {
                }
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            vd.c.InterfaceC0700c interfaceC0700c = (vd.c.InterfaceC0700c) obj;
            if (interfaceC0700c == null) {
                return null;
            }
            a aVar = a.this;
            this.f31784t = interfaceC0700c;
            this.f31785u = aVar;
            this.f31786v = 0;
            this.f31787w = 2;
            p pVar = new p(fu.b.c(this), 1);
            pVar.G();
            interfaceC0700c.a(vd.c.d.a().b(UUID.randomUUID().toString()).a()).g(new sp.b(new C0629a(pVar))).e(new b(aVar, pVar));
            Object objY = pVar.y();
            if (objY == fu.c.e()) {
                gu.h.c(this);
            }
            return objY == objE ? objE : objY;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$prepare$1", f = "PlayIntegrityHelper.kt", l = {153, 72, 156, 91, 95}, m = "invokeSuspend")
    public static final class d extends m implements Function2<p0, eu.b<? super Unit>, Object> {
        public int A;
        public int B;
        public final /* synthetic */ String D;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31810t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f31811u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f31812v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f31813w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f31814x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f31815y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f31816z;

        /* JADX INFO: renamed from: sp.a$d$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0635a implements Function1<vd.c.InterfaceC0700c, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ n<zt.n<? extends vd.c.InterfaceC0700c>> f31817a;

            /* JADX WARN: Multi-variable type inference failed */
            public C0635a(n<? super zt.n<? extends vd.c.InterfaceC0700c>> nVar) {
                this.f31817a = nVar;
            }

            public final void a(vd.c.InterfaceC0700c interfaceC0700c) {
                this.f31817a.resumeWith(zt.n.b(zt.n.a(zt.n.b(interfaceC0700c))));
            }

            @Override // p001kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(vd.c.InterfaceC0700c interfaceC0700c) {
                a(interfaceC0700c);
                return Unit.f21506a;
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class b implements tb.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ n<zt.n<? extends vd.c.InterfaceC0700c>> f31818a;

            /* JADX WARN: Multi-variable type inference failed */
            public b(n<? super zt.n<? extends vd.c.InterfaceC0700c>> nVar) {
                this.f31818a = nVar;
            }

            @Override // tb.f
            public final void onFailure(Exception it) {
                Intrinsics.checkNotNullParameter(it, "it");
                n<zt.n<? extends vd.c.InterfaceC0700c>> nVar = this.f31818a;
                zt.n.Companion companion = zt.n.INSTANCE;
                nVar.resumeWith(zt.n.b(zt.n.a(zt.n.b(o.a(it)))));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, eu.b<? super d> bVar) {
            super(2, bVar);
            this.D = str;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return a.this.new d(this.D, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        /* JADX WARN: Code duplicated, block: B:44:0x0152 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:11:0x002c, B:56:0x01e1, B:48:0x015c, B:50:0x0168, B:53:0x0199, B:42:0x00f4, B:44:0x0152, B:33:0x00c0, B:35:0x00d0, B:38:0x00d6), top: B:61:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:46:0x0157  */
        /* JADX WARN: Code duplicated, block: B:47:0x0159  */
        /* JADX WARN: Code duplicated, block: B:50:0x0168 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:11:0x002c, B:56:0x01e1, B:48:0x015c, B:50:0x0168, B:53:0x0199, B:42:0x00f4, B:44:0x0152, B:33:0x00c0, B:35:0x00d0, B:38:0x00d6), top: B:61:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:52:0x0198  */
        /* JADX WARN: Code duplicated, block: B:53:0x0199 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:11:0x002c, B:56:0x01e1, B:48:0x015c, B:50:0x0168, B:53:0x0199, B:42:0x00f4, B:44:0x0152, B:33:0x00c0, B:35:0x00d0, B:38:0x00d6), top: B:61:0x000f }] */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x01de, code lost:
        
            if (r3.emit(r6, r17) == r0) goto L55;
         */
        /* JADX WARN: Instruction removed from duplicated block: B:53:0x0199, please report this as an issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1, types: [kv.a] */
        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v14 */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            kv.a aVar;
            a aVar2;
            String str;
            int i10;
            String str2;
            a aVar3;
            int i11;
            int i12;
            vd.c cVarCreate;
            vd.c.a aVarA;
            Object objY;
            vd.c.a aVar4;
            int i13;
            a aVar5;
            Object value;
            Throwable thE;
            c0 c0Var;
            b.d dVar;
            Object objE = fu.c.e();
            ?? r10 = this.B;
            try {
                if (r10 == 0) {
                    o.b(obj);
                    aVar = a.this.mutex;
                    aVar2 = a.this;
                    String str3 = this.D;
                    this.f31810t = aVar;
                    this.f31811u = aVar2;
                    this.f31812v = str3;
                    this.f31815y = 0;
                    this.B = 1;
                    if (aVar.d(null, this) != objE) {
                        str = str3;
                        i10 = 0;
                    }
                    return objE;
                }
                if (r10 != 1) {
                    if (r10 == 2) {
                        int i14 = this.f31816z;
                        int i15 = this.f31815y;
                        String str4 = (String) this.f31812v;
                        aVar3 = (a) this.f31811u;
                        kv.a aVar6 = (kv.a) this.f31810t;
                        try {
                            o.b(obj);
                            i12 = i14;
                            aVar = aVar6;
                            str2 = str4;
                            i11 = i15;
                            cVarCreate = aVar3.standardIntegrityManagerFactory.create(aVar3.applicationContext);
                            aVarA = vd.c.a.c().b(Long.parseLong(str2)).a();
                            this.f31810t = aVar;
                            this.f31811u = aVar3;
                            this.f31812v = cVarCreate;
                            this.f31813w = aVarA;
                            this.f31814x = this;
                            this.f31815y = i11;
                            this.f31816z = i12;
                            this.A = 0;
                            this.B = 3;
                            p pVar = new p(fu.b.c(this), 1);
                            pVar.G();
                            cVarCreate.a(aVarA).g(new sp.b(new C0635a(pVar))).e(new b(pVar));
                            objY = pVar.y();
                            if (objY == fu.c.e()) {
                                gu.h.c(this);
                            }
                            if (objY == objE) {
                                aVar4 = aVarA;
                                i13 = i11;
                                aVar5 = aVar3;
                                value = ((zt.n) objY).getValue();
                                thE = zt.n.e(value);
                                if (thE == null) {
                                    vd.c.InterfaceC0700c interfaceC0700c = (vd.c.InterfaceC0700c) value;
                                    c0Var = aVar5.playIntegrityState;
                                    dVar = new b.d(interfaceC0700c);
                                    this.f31810t = aVar;
                                    this.f31811u = l.a(cVarCreate);
                                    this.f31812v = l.a(aVar4);
                                    this.f31813w = l.a(interfaceC0700c);
                                    this.f31814x = null;
                                    this.f31815y = i13;
                                    this.f31816z = i12;
                                    this.A = 0;
                                    this.B = 4;
                                    if (c0Var.emit(dVar, this) == objE) {
                                    }
                                } else {
                                    bq.e.b(aVar5.logger, "integrity:prepare:" + thE.getMessage(), null, 2, null);
                                    c0 c0Var2 = aVar5.playIntegrityState;
                                    b.C0627a c0627a = b.C0627a.f31780a;
                                    this.f31810t = aVar;
                                    this.f31811u = l.a(cVarCreate);
                                    this.f31812v = l.a(aVar4);
                                    this.f31813w = l.a(thE);
                                    this.f31814x = null;
                                    this.f31815y = i13;
                                    this.f31816z = i12;
                                    this.A = 0;
                                    this.B = 5;
                                }
                            }
                            return objE;
                        } catch (Throwable th2) {
                            th = th2;
                            r10 = aVar6;
                        }
                    } else if (r10 != 3) {
                        if (r10 == 4) {
                        } else {
                            if (r10 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        aVar = (kv.a) this.f31810t;
                        o.b(obj);
                    } else {
                        int i16 = this.f31816z;
                        i13 = this.f31815y;
                        aVar4 = (vd.c.a) this.f31813w;
                        vd.c cVar = (vd.c) this.f31812v;
                        aVar5 = (a) this.f31811u;
                        kv.a aVar7 = (kv.a) this.f31810t;
                        try {
                            o.b(obj);
                            objY = obj;
                            cVarCreate = cVar;
                            i12 = i16;
                            aVar = aVar7;
                            value = ((zt.n) objY).getValue();
                            thE = zt.n.e(value);
                            if (thE == null) {
                                vd.c.InterfaceC0700c interfaceC0700c2 = (vd.c.InterfaceC0700c) value;
                                c0Var = aVar5.playIntegrityState;
                                dVar = new b.d(interfaceC0700c2);
                                this.f31810t = aVar;
                                this.f31811u = l.a(cVarCreate);
                                this.f31812v = l.a(aVar4);
                                this.f31813w = l.a(interfaceC0700c2);
                                this.f31814x = null;
                                this.f31815y = i13;
                                this.f31816z = i12;
                                this.A = 0;
                                this.B = 4;
                                if (c0Var.emit(dVar, this) == objE) {
                                    return objE;
                                }
                            } else {
                                bq.e.b(aVar5.logger, "integrity:prepare:" + thE.getMessage(), null, 2, null);
                                c0 c0Var3 = aVar5.playIntegrityState;
                                b.C0627a c0627a2 = b.C0627a.f31780a;
                                this.f31810t = aVar;
                                this.f31811u = l.a(cVarCreate);
                                this.f31812v = l.a(aVar4);
                                this.f31813w = l.a(thE);
                                this.f31814x = null;
                                this.f31815y = i13;
                                this.f31816z = i12;
                                this.A = 0;
                                this.B = 5;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            r10 = aVar7;
                        }
                    }
                    r10.f(null);
                    throw th;
                }
                int i17 = this.f31815y;
                String str5 = (String) this.f31812v;
                aVar2 = (a) this.f31811u;
                kv.a aVar8 = (kv.a) this.f31810t;
                o.b(obj);
                i10 = i17;
                aVar = aVar8;
                str = str5;
                Unit unit = Unit.f21506a;
                aVar.f(null);
                return Unit.f21506a;
                if (!Intrinsics.c(aVar2.playIntegrityState.getValue(), b.C0628b.f31781a)) {
                    Unit unit2 = Unit.f21506a;
                    aVar.f(null);
                    return unit2;
                }
                c0 c0Var4 = aVar2.playIntegrityState;
                b.c cVar2 = b.c.f31782a;
                this.f31810t = aVar;
                this.f31811u = aVar2;
                this.f31812v = str;
                this.f31815y = i10;
                this.f31816z = 0;
                this.B = 2;
                if (c0Var4.emit(cVar2, this) != objE) {
                    str2 = str;
                    aVar3 = aVar2;
                    i11 = i10;
                    i12 = 0;
                    cVarCreate = aVar3.standardIntegrityManagerFactory.create(aVar3.applicationContext);
                    aVarA = vd.c.a.c().b(Long.parseLong(str2)).a();
                    this.f31810t = aVar;
                    this.f31811u = aVar3;
                    this.f31812v = cVarCreate;
                    this.f31813w = aVarA;
                    this.f31814x = this;
                    this.f31815y = i11;
                    this.f31816z = i12;
                    this.A = 0;
                    this.B = 3;
                    p pVar2 = new p(fu.b.c(this), 1);
                    pVar2.G();
                    cVarCreate.a(aVarA).g(new sp.b(new C0635a(pVar2))).e(new b(pVar2));
                    objY = pVar2.y();
                    if (objY == fu.c.e()) {
                        gu.h.c(this);
                    }
                    if (objY == objE) {
                        aVar4 = aVarA;
                        i13 = i11;
                        aVar5 = aVar3;
                        value = ((zt.n) objY).getValue();
                        thE = zt.n.e(value);
                        if (thE == null) {
                            vd.c.InterfaceC0700c interfaceC0700c3 = (vd.c.InterfaceC0700c) value;
                            c0Var = aVar5.playIntegrityState;
                            dVar = new b.d(interfaceC0700c3);
                            this.f31810t = aVar;
                            this.f31811u = l.a(cVarCreate);
                            this.f31812v = l.a(aVar4);
                            this.f31813w = l.a(interfaceC0700c3);
                            this.f31814x = null;
                            this.f31815y = i13;
                            this.f31816z = i12;
                            this.A = 0;
                            this.B = 4;
                            if (c0Var.emit(dVar, this) == objE) {
                            }
                            Unit unit3 = Unit.f21506a;
                            aVar.f(null);
                            return Unit.f21506a;
                        }
                        bq.e.b(aVar5.logger, "integrity:prepare:" + thE.getMessage(), null, 2, null);
                        c0 c0Var5 = aVar5.playIntegrityState;
                        b.C0627a c0627a3 = b.C0627a.f31780a;
                        this.f31810t = aVar;
                        this.f31811u = l.a(cVarCreate);
                        this.f31812v = l.a(aVar4);
                        this.f31813w = l.a(thE);
                        this.f31814x = null;
                        this.f31815y = i13;
                        this.f31816z = i12;
                        this.A = 0;
                        this.B = 5;
                    }
                }
                return objE;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$release$2", f = "PlayIntegrityHelper.kt", l = {153, 144}, m = "invokeSuspend")
    public static final class e extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31819t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f31820u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f31821v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f31822w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f31823x;

        public e(eu.b<? super e> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return a.this.new e(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            kv.a aVar;
            a aVar2;
            int i10;
            kv.a aVar3;
            Throwable th2;
            Object objE = fu.c.e();
            int i11 = this.f31823x;
            try {
                if (i11 == 0) {
                    o.b(obj);
                    aVar = a.this.mutex;
                    a aVar4 = a.this;
                    this.f31819t = aVar;
                    this.f31820u = aVar4;
                    this.f31821v = 0;
                    this.f31823x = 1;
                    if (aVar.d(null, this) != objE) {
                        aVar2 = aVar4;
                        i10 = 0;
                    }
                    return objE;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar3 = (kv.a) this.f31819t;
                    try {
                        o.b(obj);
                        Unit unit = Unit.f21506a;
                        aVar3.f(null);
                        return Unit.f21506a;
                    } catch (Throwable th3) {
                        th2 = th3;
                        aVar3.f(null);
                        throw th2;
                    }
                }
                i10 = this.f31821v;
                aVar2 = (a) this.f31820u;
                kv.a aVar5 = (kv.a) this.f31819t;
                o.b(obj);
                aVar = aVar5;
                c0 c0Var = aVar2.playIntegrityState;
                b.C0628b c0628b = b.C0628b.f31781a;
                this.f31819t = aVar;
                this.f31820u = null;
                this.f31821v = i10;
                this.f31822w = 0;
                this.f31823x = 2;
                if (c0Var.emit(c0628b, this) != objE) {
                    aVar3 = aVar;
                    Unit unit2 = Unit.f21506a;
                    aVar3.f(null);
                    return Unit.f21506a;
                }
                return objE;
            } catch (Throwable th4) {
                aVar3 = aVar;
                th2 = th4;
                aVar3.f(null);
                throw th2;
            }
        }
    }

    static {
        p001kotlin.time.a.Companion companion = p001kotlin.time.a.INSTANCE;
        f31772j = p001kotlin.time.b.p(10, zu.b.SECONDS);
    }

    public a(@NotNull Context applicationContext, @NotNull bq.e.a loggerFactory, @NotNull f standardIntegrityManagerFactory, @NotNull l0 dispatcher) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        Intrinsics.checkNotNullParameter(standardIntegrityManagerFactory, "standardIntegrityManagerFactory");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.applicationContext = applicationContext;
        this.loggerFactory = loggerFactory;
        this.standardIntegrityManagerFactory = standardIntegrityManagerFactory;
        this.dispatcher = dispatcher;
        this.logger = loggerFactory.create("com.withpersona.sdk2.inquiry.integrity");
        this.mutex = g.b(false, 1, null);
        this.coroutineScope = q0.a(dispatcher.plus(z2.b(null, 1, null)));
        this.playIntegrityState = r0.a(b.C0628b.f31781a);
    }

    @Nullable
    public final Object g(@NotNull eu.b<? super String> bVar) {
        return av.i.g(this.dispatcher, new c(null), bVar);
    }

    public final void h(@NotNull String cloudProjectNumber) {
        Intrinsics.checkNotNullParameter(cloudProjectNumber, "cloudProjectNumber");
        k.d(this.coroutineScope, null, null, new d(cloudProjectNumber, null), 3, null);
    }

    @Nullable
    public final Object i(@NotNull eu.b<? super Unit> bVar) {
        Object objG = av.i.g(this.dispatcher, new e(null), bVar);
        return objG == fu.c.e() ? objG : Unit.f21506a;
    }
}
