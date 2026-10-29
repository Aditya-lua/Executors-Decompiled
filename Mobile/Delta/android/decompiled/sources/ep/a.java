package ep;

import android.content.Context;
import java.util.UUID;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.k;
import ku.l0;
import ku.n;
import ku.p;
import ku.p0;
import ku.q0;
import ku.z2;
import nu.c0;
import nu.h;
import nu.i;
import nu.j;
import nu.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.l;
import pt.m;
import uu.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0016B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010%R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010)¨\u0006+"}, d2 = {"Lep/a;", "", "Landroid/content/Context;", "applicationContext", "Lnp/e$a;", "loggerFactory", "Lep/f;", "standardIntegrityManagerFactory", "Lku/l0;", "dispatcher", "<init>", "(Landroid/content/Context;Lnp/e$a;Lep/f;Lku/l0;)V", "", "cloudProjectNumber", "", "h", "(Ljava/lang/String;)V", "g", "(Lnt/b;)Ljava/lang/Object;", "i", "a", "Landroid/content/Context;", "b", "Lnp/e$a;", "c", "Lep/f;", "d", "Lku/l0;", "Lnp/e;", "e", "Lnp/e;", "logger", "Luu/a;", "f", "Luu/a;", "mutex", "Lku/p0;", "Lku/p0;", "coroutineScope", "Lnu/c0;", "Lep/a$b;", "Lnu/c0;", "playIntegrityState", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f15678j;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final np.e.a loggerFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final f standardIntegrityManagerFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 dispatcher;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final np.e logger;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final uu.a mutex;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 coroutineScope;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c0<b> playIntegrityState;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lep/a$b;", "", "b", "c", "a", "d", "Lep/a$b$a;", "Lep/a$b$b;", "Lep/a$b$c;", "Lep/a$b$d;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {

        /* JADX INFO: renamed from: ep.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lep/a$b$a;", "Lep/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0293a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0293a f15686a = new C0293a();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C0293a);
            }

            public int hashCode() {
                return 1174409699;
            }

            @NotNull
            public String toString() {
                return "Error";
            }
        }

        /* JADX INFO: renamed from: ep.a$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lep/a$b$b;", "Lep/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0294b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0294b f15687a = new C0294b();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C0294b);
            }

            public int hashCode() {
                return -384804045;
            }

            @NotNull
            public String toString() {
                return "NotStarted";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lep/a$b$c;", "Lep/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f15688a = new c();

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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lep/a$b$d;", "Lep/a$b;", "Lsd/c$c;", "integrityTokenProvider", "<init>", "(Lsd/c$c;)V", "a", "Lsd/c$c;", "()Lsd/c$c;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class d implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final sd.c.InterfaceC0543c integrityTokenProvider;

            public d(@NotNull sd.c.InterfaceC0543c integrityTokenProvider) {
                Intrinsics.checkNotNullParameter(integrityTokenProvider, "integrityTokenProvider");
                this.integrityTokenProvider = integrityTokenProvider;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final sd.c.InterfaceC0543c getIntegrityTokenProvider() {
                return this.integrityTokenProvider;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)Ljava/lang/String;"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$generateToken$2", f = "PlayIntegrityHelper.kt", l = {119, 158}, m = "invokeSuspend")
    public static final class c extends m implements Function2<p0, nt.b<? super String>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f15690t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f15691u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f15692v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f15693w;

        /* JADX INFO: renamed from: ep.a$c$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0295a implements Function1<sd.c.b, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ n<String> f15695a;

            /* JADX WARN: Multi-variable type inference failed */
            public C0295a(n<? super String> nVar) {
                this.f15695a = nVar;
            }

            public final void a(sd.c.b bVar) {
                n<String> nVar = this.f15695a;
                jt.n.Companion companion = jt.n.INSTANCE;
                nVar.resumeWith(jt.n.b(bVar.a()));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(sd.c.b bVar) {
                a(bVar);
                return Unit.f22483a;
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class b implements sb.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a f15696a;
            public final /* synthetic */ n<String> b;

            /* JADX WARN: Multi-variable type inference failed */
            public b(a aVar, n<? super String> nVar) {
                this.f15696a = aVar;
                this.b = nVar;
            }

            @Override // sb.f
            public final void onFailure(Exception it) {
                Intrinsics.checkNotNullParameter(it, "it");
                np.e.b(this.f15696a.logger, "integrity:request:" + it.getMessage(), null, 2, null);
                this.b.resumeWith(jt.n.b(null));
            }
        }

        /* JADX INFO: renamed from: ep.a$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnu/i;", "Lep/a$b;", "", "it", "", "<anonymous>", "(Lnu/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 2, 0})
        @pt.f(c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$generateToken$2$integrityTokenProvider$2", f = "PlayIntegrityHelper.kt", l = {}, m = "invokeSuspend")
        public static final class C0296c extends m implements zt.n<i<? super b>, Throwable, nt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f15697t;

            public C0296c(nt.b<? super C0296c> bVar) {
                super(3, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                ot.c.e();
                if (this.f15697t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                b.C0293a c0293a = b.C0293a.f15686a;
                return Unit.f22483a;
            }

            @Override // zt.n
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(i<? super b> iVar, Throwable th2, nt.b<? super Unit> bVar) {
                return new C0296c(bVar).invokeSuspend(Unit.f22483a);
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class d implements h<b> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ h f15698a;

            /* JADX INFO: renamed from: ep.a$c$d$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0297a<T> implements i {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ i f15699a;

                /* JADX INFO: renamed from: ep.a$c$d$a$a, reason: collision with other inner class name */
                @pt.f(c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$generateToken$2$invokeSuspend$$inlined$filter$1$2", f = "PlayIntegrityHelper.kt", l = {50}, m = "emit")
                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                public static final class C0298a extends pt.d {
                    public int A;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public /* synthetic */ Object f15700t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    public int f15701u;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    public Object f15702v;

                    /* JADX INFO: renamed from: w, reason: collision with root package name */
                    public Object f15703w;

                    /* JADX INFO: renamed from: y, reason: collision with root package name */
                    public Object f15705y;

                    /* JADX INFO: renamed from: z, reason: collision with root package name */
                    public Object f15706z;

                    public C0298a(nt.b bVar) {
                        super(bVar);
                    }

                    @Override // pt.a
                    public final Object invokeSuspend(Object obj) {
                        this.f15700t = obj;
                        this.f15701u |= Integer.MIN_VALUE;
                        return C0297a.this.emit(null, this);
                    }
                }

                public C0297a(i iVar) {
                    this.f15699a = iVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // nu.i
                public final Object emit(Object obj, nt.b bVar) {
                    C0298a c0298a;
                    if (bVar instanceof C0298a) {
                        c0298a = (C0298a) bVar;
                        int i10 = c0298a.f15701u;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c0298a.f15701u = i10 - Integer.MIN_VALUE;
                        } else {
                            c0298a = new C0298a(bVar);
                        }
                    } else {
                        c0298a = new C0298a(bVar);
                    }
                    Object obj2 = c0298a.f15700t;
                    Object objE = ot.c.e();
                    int i11 = c0298a.f15701u;
                    if (i11 == 0) {
                        o.b(obj2);
                        i iVar = this.f15699a;
                        b bVar2 = (b) obj;
                        if ((bVar2 instanceof b.C0293a) || (bVar2 instanceof b.d)) {
                            c0298a.f15702v = l.a(obj);
                            c0298a.f15703w = l.a(c0298a);
                            c0298a.f15705y = l.a(obj);
                            c0298a.f15706z = l.a(iVar);
                            c0298a.A = 0;
                            c0298a.f15701u = 1;
                            if (iVar.emit(obj, c0298a) == objE) {
                                return objE;
                            }
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                    }
                    return Unit.f22483a;
                }
            }

            public d(h hVar) {
                this.f15698a = hVar;
            }

            @Override // nu.h
            public Object collect(i<? super b> iVar, nt.b bVar) {
                Object objCollect = this.f15698a.collect(new C0297a(iVar), bVar);
                return objCollect == ot.c.e() ? objCollect : Unit.f22483a;
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class e implements h<sd.c.InterfaceC0543c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ h f15707a;

            /* JADX INFO: renamed from: ep.a$c$e$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0299a<T> implements i {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ i f15708a;

                /* JADX INFO: renamed from: ep.a$c$e$a$a, reason: collision with other inner class name */
                @pt.f(c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$generateToken$2$invokeSuspend$$inlined$map$1$2", f = "PlayIntegrityHelper.kt", l = {50}, m = "emit")
                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                public static final class C0300a extends pt.d {
                    public int A;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public /* synthetic */ Object f15709t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    public int f15710u;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    public Object f15711v;

                    /* JADX INFO: renamed from: x, reason: collision with root package name */
                    public Object f15713x;

                    /* JADX INFO: renamed from: y, reason: collision with root package name */
                    public Object f15714y;

                    /* JADX INFO: renamed from: z, reason: collision with root package name */
                    public Object f15715z;

                    public C0300a(nt.b bVar) {
                        super(bVar);
                    }

                    @Override // pt.a
                    public final Object invokeSuspend(Object obj) {
                        this.f15709t = obj;
                        this.f15710u |= Integer.MIN_VALUE;
                        return C0299a.this.emit(null, this);
                    }
                }

                public C0299a(i iVar) {
                    this.f15708a = iVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // nu.i
                public final Object emit(Object obj, nt.b bVar) {
                    C0300a c0300a;
                    if (bVar instanceof C0300a) {
                        c0300a = (C0300a) bVar;
                        int i10 = c0300a.f15710u;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c0300a.f15710u = i10 - Integer.MIN_VALUE;
                        } else {
                            c0300a = new C0300a(bVar);
                        }
                    } else {
                        c0300a = new C0300a(bVar);
                    }
                    Object obj2 = c0300a.f15709t;
                    Object objE = ot.c.e();
                    int i11 = c0300a.f15710u;
                    if (i11 == 0) {
                        o.b(obj2);
                        i iVar = this.f15708a;
                        b bVar2 = (b) obj;
                        b.d dVar = bVar2 instanceof b.d ? (b.d) bVar2 : null;
                        sd.c.InterfaceC0543c integrityTokenProvider = dVar != null ? dVar.getIntegrityTokenProvider() : null;
                        c0300a.f15711v = l.a(obj);
                        c0300a.f15713x = l.a(c0300a);
                        c0300a.f15714y = l.a(obj);
                        c0300a.f15715z = l.a(iVar);
                        c0300a.A = 0;
                        c0300a.f15710u = 1;
                        if (iVar.emit(integrityTokenProvider, c0300a) == objE) {
                            return objE;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                    }
                    return Unit.f22483a;
                }
            }

            public e(h hVar) {
                this.f15707a = hVar;
            }

            @Override // nu.h
            public Object collect(i<? super sd.c.InterfaceC0543c> iVar, nt.b bVar) {
                Object objCollect = this.f15707a.collect(new C0299a(iVar), bVar);
                return objCollect == ot.c.e() ? objCollect : Unit.f22483a;
            }
        }

        public c(nt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return a.this.new c(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f15693w;
            if (i10 == 0) {
                o.b(obj);
                if (a.this.playIntegrityState.getValue() instanceof b.C0294b) {
                    return null;
                }
                e eVar = new e(j.f(j.O(new d(a.this.playIntegrityState), a.f15678j), new C0296c(null)));
                this.f15693w = 1;
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
            sd.c.InterfaceC0543c interfaceC0543c = (sd.c.InterfaceC0543c) obj;
            if (interfaceC0543c == null) {
                return null;
            }
            a aVar = a.this;
            this.f15690t = interfaceC0543c;
            this.f15691u = aVar;
            this.f15692v = 0;
            this.f15693w = 2;
            p pVar = new p(ot.b.c(this), 1);
            pVar.H();
            interfaceC0543c.a(sd.c.d.a().b(UUID.randomUUID().toString()).a()).g(new ep.b(new C0295a(pVar))).e(new b(aVar, pVar));
            Object objA = pVar.A();
            if (objA == ot.c.e()) {
                pt.h.c(this);
            }
            return objA == objE ? objE : objA;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super String> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$prepare$1", f = "PlayIntegrityHelper.kt", l = {153, 72, 156, 91, 95}, m = "invokeSuspend")
    public static final class d extends m implements Function2<p0, nt.b<? super Unit>, Object> {
        public int A;
        public int B;
        public final /* synthetic */ String D;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f15716t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f15717u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f15718v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f15719w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f15720x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f15721y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f15722z;

        /* JADX INFO: renamed from: ep.a$d$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0301a implements Function1<sd.c.InterfaceC0543c, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ n<jt.n<? extends sd.c.InterfaceC0543c>> f15723a;

            /* JADX WARN: Multi-variable type inference failed */
            public C0301a(n<? super jt.n<? extends sd.c.InterfaceC0543c>> nVar) {
                this.f15723a = nVar;
            }

            public final void a(sd.c.InterfaceC0543c interfaceC0543c) {
                this.f15723a.resumeWith(jt.n.b(jt.n.a(jt.n.b(interfaceC0543c))));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(sd.c.InterfaceC0543c interfaceC0543c) {
                a(interfaceC0543c);
                return Unit.f22483a;
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class b implements sb.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ n<jt.n<? extends sd.c.InterfaceC0543c>> f15724a;

            /* JADX WARN: Multi-variable type inference failed */
            public b(n<? super jt.n<? extends sd.c.InterfaceC0543c>> nVar) {
                this.f15724a = nVar;
            }

            @Override // sb.f
            public final void onFailure(Exception it) {
                Intrinsics.checkNotNullParameter(it, "it");
                n<jt.n<? extends sd.c.InterfaceC0543c>> nVar = this.f15724a;
                jt.n.Companion companion = jt.n.INSTANCE;
                nVar.resumeWith(jt.n.b(jt.n.a(jt.n.b(o.a(it)))));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, nt.b<? super d> bVar) {
            super(2, bVar);
            this.D = str;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return a.this.new d(this.D, bVar);
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
        /* JADX WARN: Type inference failed for: r2v1, types: [uu.a] */
        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v14 */
        @Override // pt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 493
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ep.a.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$release$2", f = "PlayIntegrityHelper.kt", l = {153, 144}, m = "invokeSuspend")
    public static final class e extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f15725t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f15726u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f15727v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f15728w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f15729x;

        public e(nt.b<? super e> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return a.this.new e(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            uu.a aVar;
            a aVar2;
            int i10;
            uu.a aVar3;
            Throwable th2;
            Object objE = ot.c.e();
            int i11 = this.f15729x;
            try {
                if (i11 == 0) {
                    o.b(obj);
                    aVar = a.this.mutex;
                    a aVar4 = a.this;
                    this.f15725t = aVar;
                    this.f15726u = aVar4;
                    this.f15727v = 0;
                    this.f15729x = 1;
                    if (aVar.f(null, this) != objE) {
                        aVar2 = aVar4;
                        i10 = 0;
                    }
                    return objE;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar3 = (uu.a) this.f15725t;
                    try {
                        o.b(obj);
                        Unit unit = Unit.f22483a;
                        aVar3.e(null);
                        return Unit.f22483a;
                    } catch (Throwable th3) {
                        th2 = th3;
                        aVar3.e(null);
                        throw th2;
                    }
                }
                i10 = this.f15727v;
                aVar2 = (a) this.f15726u;
                uu.a aVar5 = (uu.a) this.f15725t;
                o.b(obj);
                aVar = aVar5;
                c0 c0Var = aVar2.playIntegrityState;
                b.C0294b c0294b = b.C0294b.f15687a;
                this.f15725t = aVar;
                this.f15726u = null;
                this.f15727v = i10;
                this.f15728w = 0;
                this.f15729x = 2;
                if (c0Var.emit(c0294b, this) != objE) {
                    aVar3 = aVar;
                    Unit unit2 = Unit.f22483a;
                    aVar3.e(null);
                    return Unit.f22483a;
                }
                return objE;
            } catch (Throwable th4) {
                aVar3 = aVar;
                th2 = th4;
                aVar3.e(null);
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    static {
        kotlin.time.a.Companion companion = kotlin.time.a.INSTANCE;
        f15678j = kotlin.time.b.p(10, ju.b.SECONDS);
    }

    public a(@NotNull Context applicationContext, @NotNull np.e.a loggerFactory, @NotNull f standardIntegrityManagerFactory, @NotNull l0 dispatcher) {
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
        this.playIntegrityState = r0.a(b.C0294b.f15687a);
    }

    @Nullable
    public final Object g(@NotNull nt.b<? super String> bVar) {
        return ku.i.g(this.dispatcher, new c(null), bVar);
    }

    public final void h(@NotNull String cloudProjectNumber) {
        Intrinsics.checkNotNullParameter(cloudProjectNumber, "cloudProjectNumber");
        k.d(this.coroutineScope, null, null, new d(cloudProjectNumber, null), 3, null);
    }

    @Nullable
    public final Object i(@NotNull nt.b<? super Unit> bVar) {
        Object objG = ku.i.g(this.dispatcher, new e(null), bVar);
        return objG == ot.c.e() ? objG : Unit.f22483a;
    }
}
