package cp;

import android.content.Context;
import gt.o;
import iu.k;
import iu.l0;
import iu.n;
import iu.p;
import iu.p0;
import iu.q0;
import iu.z2;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lu.c0;
import lu.h;
import lu.i;
import lu.j;
import lu.r0;
import nt.l;
import nt.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0016B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010%R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010)¨\u0006+"}, d2 = {"Lcp/a;", "", "Landroid/content/Context;", "applicationContext", "Llp/e$a;", "loggerFactory", "Lcp/f;", "standardIntegrityManagerFactory", "Liu/l0;", "dispatcher", "<init>", "(Landroid/content/Context;Llp/e$a;Lcp/f;Liu/l0;)V", "", "cloudProjectNumber", "", "h", "(Ljava/lang/String;)V", "g", "(Llt/b;)Ljava/lang/Object;", "i", "a", "Landroid/content/Context;", "b", "Llp/e$a;", "c", "Lcp/f;", "d", "Liu/l0;", "Llp/e;", "e", "Llp/e;", "logger", "Lsu/a;", "f", "Lsu/a;", "mutex", "Liu/p0;", "Liu/p0;", "coroutineScope", "Llu/c0;", "Lcp/a$b;", "Llu/c0;", "playIntegrityState", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f14119j;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final lp.e.a loggerFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final f standardIntegrityManagerFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 dispatcher;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final lp.e logger;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final su.a mutex;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 coroutineScope;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c0<b> playIntegrityState;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcp/a$b;", "", "b", "c", "a", "d", "Lcp/a$b$a;", "Lcp/a$b$b;", "Lcp/a$b$c;", "Lcp/a$b$d;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {

        /* JADX INFO: renamed from: cp.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcp/a$b$a;", "Lcp/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0263a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0263a f14127a = new C0263a();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C0263a);
            }

            public int hashCode() {
                return 1174409699;
            }

            @NotNull
            public String toString() {
                return "Error";
            }
        }

        /* JADX INFO: renamed from: cp.a$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcp/a$b$b;", "Lcp/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0264b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0264b f14128a = new C0264b();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C0264b);
            }

            public int hashCode() {
                return -384804045;
            }

            @NotNull
            public String toString() {
                return "NotStarted";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcp/a$b$c;", "Lcp/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f14129a = new c();

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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcp/a$b$d;", "Lcp/a$b;", "Ltd/c$c;", "integrityTokenProvider", "<init>", "(Ltd/c$c;)V", "a", "Ltd/c$c;", "()Ltd/c$c;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class d implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final td.c.InterfaceC0578c integrityTokenProvider;

            public d(@NotNull td.c.InterfaceC0578c integrityTokenProvider) {
                Intrinsics.checkNotNullParameter(integrityTokenProvider, "integrityTokenProvider");
                this.integrityTokenProvider = integrityTokenProvider;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final td.c.InterfaceC0578c getIntegrityTokenProvider() {
                return this.integrityTokenProvider;
            }
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$generateToken$2", f = "PlayIntegrityHelper.kt", l = {119, 158}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)Ljava/lang/String;"}, k = 3, mv = {2, 2, 0})
    public static final class c extends m implements Function2<p0, lt.b<? super String>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f14131t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f14132u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f14133v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f14134w;

        /* JADX INFO: renamed from: cp.a$c$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0265a implements Function1<td.c.b, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ n<String> f14136a;

            /* JADX WARN: Multi-variable type inference failed */
            public C0265a(n<? super String> nVar) {
                this.f14136a = nVar;
            }

            public final void a(td.c.b bVar) {
                n<String> nVar = this.f14136a;
                gt.n.Companion companion = gt.n.INSTANCE;
                nVar.resumeWith(gt.n.b(bVar.a()));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(td.c.b bVar) {
                a(bVar);
                return Unit.f22938a;
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class b implements sb.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a f14137a;
            public final /* synthetic */ n<String> b;

            /* JADX WARN: Multi-variable type inference failed */
            public b(a aVar, n<? super String> nVar) {
                this.f14137a = aVar;
                this.b = nVar;
            }

            @Override // sb.f
            public final void onFailure(Exception it) {
                Intrinsics.checkNotNullParameter(it, "it");
                lp.e.b(this.f14137a.logger, "integrity:request:" + it.getMessage(), null, 2, null);
                this.b.resumeWith(gt.n.b(null));
            }
        }

        /* JADX INFO: renamed from: cp.a$c$c, reason: collision with other inner class name */
        @nt.f(c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$generateToken$2$integrityTokenProvider$2", f = "PlayIntegrityHelper.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Llu/i;", "Lcp/a$b;", "", "it", "", "<anonymous>", "(Llu/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 2, 0})
        public static final class C0266c extends m implements xt.n<i<? super b>, Throwable, lt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f14138t;

            public C0266c(lt.b<? super C0266c> bVar) {
                super(3, bVar);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                mt.c.e();
                if (this.f14138t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                b.C0263a c0263a = b.C0263a.f14127a;
                return Unit.f22938a;
            }

            @Override // xt.n
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(i<? super b> iVar, Throwable th2, lt.b<? super Unit> bVar) {
                return new C0266c(bVar).invokeSuspend(Unit.f22938a);
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Llu/h;", "Llu/i;", "collector", "", "collect", "(Llu/i;Llt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class d implements h<b> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ h f14139a;

            /* JADX INFO: renamed from: cp.a$c$d$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0267a<T> implements i {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ i f14140a;

                /* JADX INFO: renamed from: cp.a$c$d$a$a, reason: collision with other inner class name */
                @nt.f(c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$generateToken$2$invokeSuspend$$inlined$filter$1$2", f = "PlayIntegrityHelper.kt", l = {50}, m = "emit")
                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                public static final class C0268a extends nt.d {
                    public int A;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public /* synthetic */ Object f14141t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    public int f14142u;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    public Object f14143v;

                    /* JADX INFO: renamed from: w, reason: collision with root package name */
                    public Object f14144w;

                    /* JADX INFO: renamed from: y, reason: collision with root package name */
                    public Object f14146y;

                    /* JADX INFO: renamed from: z, reason: collision with root package name */
                    public Object f14147z;

                    public C0268a(lt.b bVar) {
                        super(bVar);
                    }

                    @Override // nt.a
                    public final Object invokeSuspend(Object obj) {
                        this.f14141t = obj;
                        this.f14142u |= Integer.MIN_VALUE;
                        return C0267a.this.emit(null, this);
                    }
                }

                public C0267a(i iVar) {
                    this.f14140a = iVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // lu.i
                public final Object emit(Object obj, lt.b bVar) {
                    C0268a c0268a;
                    if (bVar instanceof C0268a) {
                        c0268a = (C0268a) bVar;
                        int i10 = c0268a.f14142u;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c0268a.f14142u = i10 - Integer.MIN_VALUE;
                        } else {
                            c0268a = new C0268a(bVar);
                        }
                    } else {
                        c0268a = new C0268a(bVar);
                    }
                    Object obj2 = c0268a.f14141t;
                    Object objE = mt.c.e();
                    int i11 = c0268a.f14142u;
                    if (i11 == 0) {
                        o.b(obj2);
                        i iVar = this.f14140a;
                        b bVar2 = (b) obj;
                        if ((bVar2 instanceof b.C0263a) || (bVar2 instanceof b.d)) {
                            c0268a.f14143v = l.a(obj);
                            c0268a.f14144w = l.a(c0268a);
                            c0268a.f14146y = l.a(obj);
                            c0268a.f14147z = l.a(iVar);
                            c0268a.A = 0;
                            c0268a.f14142u = 1;
                            if (iVar.emit(obj, c0268a) == objE) {
                                return objE;
                            }
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                    }
                    return Unit.f22938a;
                }
            }

            public d(h hVar) {
                this.f14139a = hVar;
            }

            @Override // lu.h
            public Object collect(i<? super b> iVar, lt.b bVar) {
                Object objCollect = this.f14139a.collect(new C0267a(iVar), bVar);
                return objCollect == mt.c.e() ? objCollect : Unit.f22938a;
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Llu/h;", "Llu/i;", "collector", "", "collect", "(Llu/i;Llt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class e implements h<td.c.InterfaceC0578c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ h f14148a;

            /* JADX INFO: renamed from: cp.a$c$e$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0269a<T> implements i {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ i f14149a;

                /* JADX INFO: renamed from: cp.a$c$e$a$a, reason: collision with other inner class name */
                @nt.f(c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$generateToken$2$invokeSuspend$$inlined$map$1$2", f = "PlayIntegrityHelper.kt", l = {50}, m = "emit")
                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                public static final class C0270a extends nt.d {
                    public int A;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public /* synthetic */ Object f14150t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    public int f14151u;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    public Object f14152v;

                    /* JADX INFO: renamed from: x, reason: collision with root package name */
                    public Object f14154x;

                    /* JADX INFO: renamed from: y, reason: collision with root package name */
                    public Object f14155y;

                    /* JADX INFO: renamed from: z, reason: collision with root package name */
                    public Object f14156z;

                    public C0270a(lt.b bVar) {
                        super(bVar);
                    }

                    @Override // nt.a
                    public final Object invokeSuspend(Object obj) {
                        this.f14150t = obj;
                        this.f14151u |= Integer.MIN_VALUE;
                        return C0269a.this.emit(null, this);
                    }
                }

                public C0269a(i iVar) {
                    this.f14149a = iVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // lu.i
                public final Object emit(Object obj, lt.b bVar) {
                    C0270a c0270a;
                    if (bVar instanceof C0270a) {
                        c0270a = (C0270a) bVar;
                        int i10 = c0270a.f14151u;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c0270a.f14151u = i10 - Integer.MIN_VALUE;
                        } else {
                            c0270a = new C0270a(bVar);
                        }
                    } else {
                        c0270a = new C0270a(bVar);
                    }
                    Object obj2 = c0270a.f14150t;
                    Object objE = mt.c.e();
                    int i11 = c0270a.f14151u;
                    if (i11 == 0) {
                        o.b(obj2);
                        i iVar = this.f14149a;
                        b bVar2 = (b) obj;
                        b.d dVar = bVar2 instanceof b.d ? (b.d) bVar2 : null;
                        td.c.InterfaceC0578c integrityTokenProvider = dVar != null ? dVar.getIntegrityTokenProvider() : null;
                        c0270a.f14152v = l.a(obj);
                        c0270a.f14154x = l.a(c0270a);
                        c0270a.f14155y = l.a(obj);
                        c0270a.f14156z = l.a(iVar);
                        c0270a.A = 0;
                        c0270a.f14151u = 1;
                        if (iVar.emit(integrityTokenProvider, c0270a) == objE) {
                            return objE;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                    }
                    return Unit.f22938a;
                }
            }

            public e(h hVar) {
                this.f14148a = hVar;
            }

            @Override // lu.h
            public Object collect(i<? super td.c.InterfaceC0578c> iVar, lt.b bVar) {
                Object objCollect = this.f14148a.collect(new C0269a(iVar), bVar);
                return objCollect == mt.c.e() ? objCollect : Unit.f22938a;
            }
        }

        public c(lt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return a.this.new c(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super String> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f14134w;
            if (i10 == 0) {
                o.b(obj);
                if (a.this.playIntegrityState.getValue() instanceof b.C0264b) {
                    return null;
                }
                e eVar = new e(j.f(j.O(new d(a.this.playIntegrityState), a.f14119j), new C0266c(null)));
                this.f14134w = 1;
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
            td.c.InterfaceC0578c interfaceC0578c = (td.c.InterfaceC0578c) obj;
            if (interfaceC0578c == null) {
                return null;
            }
            a aVar = a.this;
            this.f14131t = interfaceC0578c;
            this.f14132u = aVar;
            this.f14133v = 0;
            this.f14134w = 2;
            p pVar = new p(mt.b.c(this), 1);
            pVar.H();
            interfaceC0578c.a(td.c.d.a().b(UUID.randomUUID().toString()).a()).g(new cp.b(new C0265a(pVar))).e(new b(aVar, pVar));
            Object objA = pVar.A();
            if (objA == mt.c.e()) {
                nt.h.c(this);
            }
            return objA == objE ? objE : objA;
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$prepare$1", f = "PlayIntegrityHelper.kt", l = {153, 72, 156, 91, 95}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class d extends m implements Function2<p0, lt.b<? super Unit>, Object> {
        public int A;
        public int B;
        public final /* synthetic */ String D;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f14157t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f14158u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f14159v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f14160w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f14161x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f14162y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f14163z;

        /* JADX INFO: renamed from: cp.a$d$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0271a implements Function1<td.c.InterfaceC0578c, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ n<gt.n<? extends td.c.InterfaceC0578c>> f14164a;

            /* JADX WARN: Multi-variable type inference failed */
            public C0271a(n<? super gt.n<? extends td.c.InterfaceC0578c>> nVar) {
                this.f14164a = nVar;
            }

            public final void a(td.c.InterfaceC0578c interfaceC0578c) {
                this.f14164a.resumeWith(gt.n.b(gt.n.a(gt.n.b(interfaceC0578c))));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(td.c.InterfaceC0578c interfaceC0578c) {
                a(interfaceC0578c);
                return Unit.f22938a;
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class b implements sb.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ n<gt.n<? extends td.c.InterfaceC0578c>> f14165a;

            /* JADX WARN: Multi-variable type inference failed */
            public b(n<? super gt.n<? extends td.c.InterfaceC0578c>> nVar) {
                this.f14165a = nVar;
            }

            @Override // sb.f
            public final void onFailure(Exception it) {
                Intrinsics.checkNotNullParameter(it, "it");
                n<gt.n<? extends td.c.InterfaceC0578c>> nVar = this.f14165a;
                gt.n.Companion companion = gt.n.INSTANCE;
                nVar.resumeWith(gt.n.b(gt.n.a(gt.n.b(o.a(it)))));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, lt.b<? super d> bVar) {
            super(2, bVar);
            this.D = str;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return a.this.new d(this.D, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
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
        /* JADX WARN: Type inference failed for: r2v1, types: [su.a] */
        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v14 */
        @Override // nt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 493
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: cp.a.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$release$2", f = "PlayIntegrityHelper.kt", l = {153, 144}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class e extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f14166t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f14167u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f14168v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f14169w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f14170x;

        public e(lt.b<? super e> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return a.this.new e(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            su.a aVar;
            a aVar2;
            int i10;
            su.a aVar3;
            Throwable th2;
            Object objE = mt.c.e();
            int i11 = this.f14170x;
            try {
                if (i11 == 0) {
                    o.b(obj);
                    aVar = a.this.mutex;
                    a aVar4 = a.this;
                    this.f14166t = aVar;
                    this.f14167u = aVar4;
                    this.f14168v = 0;
                    this.f14170x = 1;
                    if (aVar.b(null, this) != objE) {
                        aVar2 = aVar4;
                        i10 = 0;
                    }
                    return objE;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar3 = (su.a) this.f14166t;
                    try {
                        o.b(obj);
                        Unit unit = Unit.f22938a;
                        aVar3.f(null);
                        return Unit.f22938a;
                    } catch (Throwable th3) {
                        th2 = th3;
                        aVar3.f(null);
                        throw th2;
                    }
                }
                i10 = this.f14168v;
                aVar2 = (a) this.f14167u;
                su.a aVar5 = (su.a) this.f14166t;
                o.b(obj);
                aVar = aVar5;
                c0 c0Var = aVar2.playIntegrityState;
                b.C0264b c0264b = b.C0264b.f14128a;
                this.f14166t = aVar;
                this.f14167u = null;
                this.f14168v = i10;
                this.f14169w = 0;
                this.f14170x = 2;
                if (c0Var.emit(c0264b, this) != objE) {
                    aVar3 = aVar;
                    Unit unit2 = Unit.f22938a;
                    aVar3.f(null);
                    return Unit.f22938a;
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
        kotlin.time.a.Companion companion = kotlin.time.a.INSTANCE;
        f14119j = kotlin.time.b.p(10, hu.b.SECONDS);
    }

    public a(@NotNull Context applicationContext, @NotNull lp.e.a loggerFactory, @NotNull f standardIntegrityManagerFactory, @NotNull l0 dispatcher) {
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
        this.playIntegrityState = r0.a(b.C0264b.f14128a);
    }

    @Nullable
    public final Object g(@NotNull lt.b<? super String> bVar) {
        return iu.i.g(this.dispatcher, new c(null), bVar);
    }

    public final void h(@NotNull String cloudProjectNumber) {
        Intrinsics.checkNotNullParameter(cloudProjectNumber, "cloudProjectNumber");
        k.d(this.coroutineScope, null, null, new d(cloudProjectNumber, null), 3, null);
    }

    @Nullable
    public final Object i(@NotNull lt.b<? super Unit> bVar) {
        Object objG = iu.i.g(this.dispatcher, new e(null), bVar);
        return objG == mt.c.e() ? objG : Unit.f22938a;
    }
}
