package p111ep;

import android.content.Context;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.C7800a;
import kotlin.time.C7801b;
import np.C9542e;
import nu.C9579j;
import nu.C9596r0;
import nu.InterfaceC9566c0;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7347n;
import p229jt.C7348o;
import p230ju.EnumC7361b;
import p256ku.AbstractC7888l0;
import p256ku.C7872i;
import p256ku.C7882k;
import p256ku.C7905p;
import p256ku.C7910q0;
import p256ku.C7948z2;
import p256ku.InterfaceC7897n;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10046b;
import p344ot.C10047c;
import p478uu.C11976g;
import p478uu.InterfaceC11970a;
import p615zt.InterfaceC14057n;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10346h;
import pt.C10350l;
import pt.InterfaceC10344f;
import sb.InterfaceC11254f;
import td.InterfaceC11571c;

/* JADX INFO: renamed from: ep.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0016B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010%R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010)¨\u0006+"}, m31665d2 = {"Lep/a;", "", "Landroid/content/Context;", "applicationContext", "Lnp/e$a;", "loggerFactory", "Lep/f;", "standardIntegrityManagerFactory", "Lku/l0;", "dispatcher", "<init>", "(Landroid/content/Context;Lnp/e$a;Lep/f;Lku/l0;)V", "", "cloudProjectNumber", "", "h", "(Ljava/lang/String;)V", "g", "(Lnt/b;)Ljava/lang/Object;", "i", "a", "Landroid/content/Context;", "b", "Lnp/e$a;", "c", "Lep/f;", "d", "Lku/l0;", "Lnp/e;", "e", "Lnp/e;", "logger", "Luu/a;", "f", "Luu/a;", "mutex", "Lku/p0;", "Lku/p0;", "coroutineScope", "Lnu/c0;", "Lep/a$b;", "Lnu/c0;", "playIntegrityState", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C5174a {

    /* JADX INFO: renamed from: j */
    public static final long f20132j;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C9542e.a loggerFactory;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC5179f standardIntegrityManagerFactory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final AbstractC7888l0 dispatcher;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C9542e logger;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC11970a mutex;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7906p0 coroutineScope;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9566c0<b> playIntegrityState;

    /* JADX INFO: renamed from: ep.a$b */
    @Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, m31665d2 = {"Lep/a$b;", "", "b", "c", "a", "d", "Lep/a$b$a;", "Lep/a$b$b;", "Lep/a$b$c;", "Lep/a$b$d;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface b {

        /* JADX INFO: renamed from: ep.a$b$a */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lep/a$b$a;", "Lep/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class a implements b {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final a f20141a = new a();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof a);
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
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lep/a$b$b;", "Lep/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class C14163b implements b {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final C14163b f20142a = new C14163b();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C14163b);
            }

            public int hashCode() {
                return -384804045;
            }

            @NotNull
            public String toString() {
                return "NotStarted";
            }
        }

        /* JADX INFO: renamed from: ep.a$b$c */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lep/a$b$c;", "Lep/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class c implements b {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final c f20143a = new c();

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

        /* JADX INFO: renamed from: ep.a$b$d */
        @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m31665d2 = {"Lep/a$b$d;", "Lep/a$b;", "Ltd/c$c;", "integrityTokenProvider", "<init>", "(Ltd/c$c;)V", "a", "Ltd/c$c;", "()Ltd/c$c;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class d implements b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final InterfaceC11571c.c integrityTokenProvider;

            public d(@NotNull InterfaceC11571c.c integrityTokenProvider) {
                Intrinsics.checkNotNullParameter(integrityTokenProvider, "integrityTokenProvider");
                this.integrityTokenProvider = integrityTokenProvider;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final InterfaceC11571c.c getIntegrityTokenProvider() {
                return this.integrityTokenProvider;
            }
        }
    }

    /* JADX INFO: renamed from: ep.a$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)Ljava/lang/String;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$generateToken$2", m39664f = "PlayIntegrityHelper.kt", m39665l = {119, 158}, m39666m = "invokeSuspend")
    public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super String>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f20145t;

        /* JADX INFO: renamed from: u */
        public Object f20146u;

        /* JADX INFO: renamed from: v */
        public int f20147v;

        /* JADX INFO: renamed from: w */
        public int f20148w;

        /* JADX INFO: renamed from: ep.a$c$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a implements Function1<InterfaceC11571c.b, Unit> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC7897n<String> f20150a;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: ku.n<? super java.lang.String> */
            /* JADX WARN: Multi-variable type inference failed */
            public a(InterfaceC7897n<? super String> interfaceC7897n) {
                this.f20150a = interfaceC7897n;
            }

            /* JADX INFO: renamed from: a */
            public final void m24068a(InterfaceC11571c.b bVar) {
                InterfaceC7897n<String> interfaceC7897n = this.f20150a;
                C7347n.Companion companion = C7347n.INSTANCE;
                interfaceC7897n.resumeWith(C7347n.m30460b(bVar.mo43248a()));
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC11571c.b bVar) {
                m24068a(bVar);
                return Unit.f29331a;
            }
        }

        /* JADX INFO: renamed from: ep.a$c$b */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class b implements InterfaceC11254f {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C5174a f20151a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ InterfaceC7897n<String> f20152b;

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: ku.n<? super java.lang.String> */
            /* JADX WARN: Multi-variable type inference failed */
            public b(C5174a c5174a, InterfaceC7897n<? super String> interfaceC7897n) {
                this.f20151a = c5174a;
                this.f20152b = interfaceC7897n;
            }

            @Override // sb.InterfaceC11254f
            public final void onFailure(Exception it) {
                Intrinsics.checkNotNullParameter(it, "it");
                C9542e.m37666b(this.f20151a.logger, "integrity:request:" + it.getMessage(), null, 2, null);
                this.f20152b.resumeWith(C7347n.m30460b(null));
            }
        }

        /* JADX INFO: renamed from: ep.a$c$c, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m31665d2 = {"Lnu/i;", "Lep/a$b;", "", "it", "", "<anonymous>", "(Lnu/i;Ljava/lang/Throwable;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$generateToken$2$integrityTokenProvider$2", m39664f = "PlayIntegrityHelper.kt", m39665l = {}, m39666m = "invokeSuspend")
        public static final class C14164c extends AbstractC10351m implements InterfaceC14057n<InterfaceC9577i<? super b>, Throwable, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f20153t;

            public C14164c(InterfaceC9557b<? super C14164c> interfaceC9557b) {
                super(3, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                C10047c.m38805e();
                if (this.f20153t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                b.a aVar = b.a.f20141a;
                return Unit.f29331a;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // p615zt.InterfaceC14057n
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC9577i<? super b> interfaceC9577i, Throwable th2, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return new C14164c(interfaceC9557b).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX INFO: renamed from: ep.a$c$d */
        @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class d implements InterfaceC9575h<b> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC9575h f20154a;

            /* JADX INFO: renamed from: ep.a$c$d$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class a<T> implements InterfaceC9577i {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC9577i f20155a;

                /* JADX INFO: renamed from: ep.a$c$d$a$a, reason: collision with other inner class name */
                @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$generateToken$2$invokeSuspend$$inlined$filter$1$2", m39664f = "PlayIntegrityHelper.kt", m39665l = {50}, m39666m = "emit")
                @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
                public static final class C14165a extends AbstractC10342d {

                    /* JADX INFO: renamed from: A */
                    public int f20156A;

                    /* JADX INFO: renamed from: t */
                    public /* synthetic */ Object f20157t;

                    /* JADX INFO: renamed from: u */
                    public int f20158u;

                    /* JADX INFO: renamed from: v */
                    public Object f20159v;

                    /* JADX INFO: renamed from: w */
                    public Object f20160w;

                    /* JADX INFO: renamed from: y */
                    public Object f20162y;

                    /* JADX INFO: renamed from: z */
                    public Object f20163z;

                    public C14165a(InterfaceC9557b interfaceC9557b) {
                        super(interfaceC9557b);
                    }

                    @Override // pt.AbstractC10339a
                    public final Object invokeSuspend(Object obj) {
                        this.f20157t = obj;
                        this.f20158u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC9577i interfaceC9577i) {
                    this.f20155a = interfaceC9577i;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // nu.InterfaceC9577i
                public final Object emit(Object obj, InterfaceC9557b interfaceC9557b) {
                    C14165a c14165a;
                    if (interfaceC9557b instanceof C14165a) {
                        c14165a = (C14165a) interfaceC9557b;
                        int i10 = c14165a.f20158u;
                        if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                            c14165a.f20158u = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                        } else {
                            c14165a = new C14165a(interfaceC9557b);
                        }
                    } else {
                        c14165a = new C14165a(interfaceC9557b);
                    }
                    Object obj2 = c14165a.f20157t;
                    Object objM38805e = C10047c.m38805e();
                    int i11 = c14165a.f20158u;
                    if (i11 == 0) {
                        C7348o.m30470b(obj2);
                        InterfaceC9577i interfaceC9577i = this.f20155a;
                        b bVar = (b) obj;
                        if ((bVar instanceof b.a) || (bVar instanceof b.d)) {
                            c14165a.f20159v = C10350l.m39676a(obj);
                            c14165a.f20160w = C10350l.m39676a(c14165a);
                            c14165a.f20162y = C10350l.m39676a(obj);
                            c14165a.f20163z = C10350l.m39676a(interfaceC9577i);
                            c14165a.f20156A = 0;
                            c14165a.f20158u = 1;
                            if (interfaceC9577i.emit(obj, c14165a) == objM38805e) {
                                return objM38805e;
                            }
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7348o.m30470b(obj2);
                    }
                    return Unit.f29331a;
                }
            }

            public d(InterfaceC9575h interfaceC9575h) {
                this.f20154a = interfaceC9575h;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [nu.i, nt.b] */
            @Override // nu.InterfaceC9575h
            public Object collect(InterfaceC9577i<? super b> interfaceC9577i, InterfaceC9557b interfaceC9557b) {
                Object objCollect = this.f20154a.collect(new a(interfaceC9577i), interfaceC9557b);
                return objCollect == C10047c.m38805e() ? objCollect : Unit.f29331a;
            }
        }

        /* JADX INFO: renamed from: ep.a$c$e */
        @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class e implements InterfaceC9575h<InterfaceC11571c.c> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC9575h f20164a;

            /* JADX INFO: renamed from: ep.a$c$e$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class a<T> implements InterfaceC9577i {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC9577i f20165a;

                /* JADX INFO: renamed from: ep.a$c$e$a$a, reason: collision with other inner class name */
                @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$generateToken$2$invokeSuspend$$inlined$map$1$2", m39664f = "PlayIntegrityHelper.kt", m39665l = {50}, m39666m = "emit")
                @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
                public static final class C14166a extends AbstractC10342d {

                    /* JADX INFO: renamed from: A */
                    public int f20166A;

                    /* JADX INFO: renamed from: t */
                    public /* synthetic */ Object f20167t;

                    /* JADX INFO: renamed from: u */
                    public int f20168u;

                    /* JADX INFO: renamed from: v */
                    public Object f20169v;

                    /* JADX INFO: renamed from: x */
                    public Object f20171x;

                    /* JADX INFO: renamed from: y */
                    public Object f20172y;

                    /* JADX INFO: renamed from: z */
                    public Object f20173z;

                    public C14166a(InterfaceC9557b interfaceC9557b) {
                        super(interfaceC9557b);
                    }

                    @Override // pt.AbstractC10339a
                    public final Object invokeSuspend(Object obj) {
                        this.f20167t = obj;
                        this.f20168u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC9577i interfaceC9577i) {
                    this.f20165a = interfaceC9577i;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // nu.InterfaceC9577i
                public final Object emit(Object obj, InterfaceC9557b interfaceC9557b) {
                    C14166a c14166a;
                    if (interfaceC9557b instanceof C14166a) {
                        c14166a = (C14166a) interfaceC9557b;
                        int i10 = c14166a.f20168u;
                        if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                            c14166a.f20168u = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                        } else {
                            c14166a = new C14166a(interfaceC9557b);
                        }
                    } else {
                        c14166a = new C14166a(interfaceC9557b);
                    }
                    Object obj2 = c14166a.f20167t;
                    Object objM38805e = C10047c.m38805e();
                    int i11 = c14166a.f20168u;
                    if (i11 == 0) {
                        C7348o.m30470b(obj2);
                        InterfaceC9577i interfaceC9577i = this.f20165a;
                        b bVar = (b) obj;
                        b.d dVar = bVar instanceof b.d ? (b.d) bVar : null;
                        InterfaceC11571c.c integrityTokenProvider = dVar != null ? dVar.getIntegrityTokenProvider() : null;
                        c14166a.f20169v = C10350l.m39676a(obj);
                        c14166a.f20171x = C10350l.m39676a(c14166a);
                        c14166a.f20172y = C10350l.m39676a(obj);
                        c14166a.f20173z = C10350l.m39676a(interfaceC9577i);
                        c14166a.f20166A = 0;
                        c14166a.f20168u = 1;
                        if (interfaceC9577i.emit(integrityTokenProvider, c14166a) == objM38805e) {
                            return objM38805e;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7348o.m30470b(obj2);
                    }
                    return Unit.f29331a;
                }
            }

            public e(InterfaceC9575h interfaceC9575h) {
                this.f20164a = interfaceC9575h;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [nu.i, nt.b] */
            @Override // nu.InterfaceC9575h
            public Object collect(InterfaceC9577i<? super InterfaceC11571c.c> interfaceC9577i, InterfaceC9557b interfaceC9557b) {
                Object objCollect = this.f20164a.collect(new a(interfaceC9577i), interfaceC9557b);
                return objCollect == C10047c.m38805e() ? objCollect : Unit.f29331a;
            }
        }

        public c(InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C5174a.this.new c(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f20148w;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                if (C5174a.this.playIntegrityState.getValue() instanceof b.C14163b) {
                    return null;
                }
                e eVar = new e(C9579j.m37789f(C9579j.m37778O(new d(C5174a.this.playIntegrityState), C5174a.f20132j), new C14164c(null)));
                this.f20148w = 1;
                obj = C9579j.m37805v(eVar, this);
                if (obj != objM38805e) {
                }
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return obj;
            }
            C7348o.m30470b(obj);
            InterfaceC11571c.c cVar = (InterfaceC11571c.c) obj;
            if (cVar == null) {
                return null;
            }
            C5174a c5174a = C5174a.this;
            this.f20145t = cVar;
            this.f20146u = c5174a;
            this.f20147v = 0;
            this.f20148w = 2;
            C7905p c7905p = new C7905p(C10046b.m38803c(this), 1);
            c7905p.m32860H();
            cVar.mo43249a(InterfaceC11571c.d.m43250a().mo43252b(UUID.randomUUID().toString()).mo43251a()).mo11893g(new C5175b(new a(c7905p))).mo11891e(new b(c5174a, c7905p));
            Object objM32857A = c7905p.m32857A();
            if (objM32857A == C10047c.m38805e()) {
                C10346h.m39673c(this);
            }
            return objM32857A == objM38805e ? objM38805e : objM32857A;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super String> interfaceC9557b) {
            return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: ep.a$d */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$prepare$1", m39664f = "PlayIntegrityHelper.kt", m39665l = {153, 72, 156, 91, 95}, m39666m = "invokeSuspend")
    public static final class d extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: A */
        public int f20174A;

        /* JADX INFO: renamed from: B */
        public int f20175B;

        /* JADX INFO: renamed from: D */
        public final /* synthetic */ String f20177D;

        /* JADX INFO: renamed from: t */
        public Object f20178t;

        /* JADX INFO: renamed from: u */
        public Object f20179u;

        /* JADX INFO: renamed from: v */
        public Object f20180v;

        /* JADX INFO: renamed from: w */
        public Object f20181w;

        /* JADX INFO: renamed from: x */
        public Object f20182x;

        /* JADX INFO: renamed from: y */
        public int f20183y;

        /* JADX INFO: renamed from: z */
        public int f20184z;

        /* JADX INFO: renamed from: ep.a$d$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a implements Function1<InterfaceC11571c.c, Unit> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC7897n<C7347n<? extends InterfaceC11571c.c>> f20185a;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: ku.n<? super jt.n<? extends td.c$c>> */
            /* JADX WARN: Multi-variable type inference failed */
            public a(InterfaceC7897n<? super C7347n<? extends InterfaceC11571c.c>> interfaceC7897n) {
                this.f20185a = interfaceC7897n;
            }

            /* JADX INFO: renamed from: a */
            public final void m24070a(InterfaceC11571c.c cVar) {
                this.f20185a.resumeWith(C7347n.m30460b(C7347n.m30459a(C7347n.m30460b(cVar))));
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC11571c.c cVar) {
                m24070a(cVar);
                return Unit.f29331a;
            }
        }

        /* JADX INFO: renamed from: ep.a$d$b */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class b implements InterfaceC11254f {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC7897n<C7347n<? extends InterfaceC11571c.c>> f20186a;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: ku.n<? super jt.n<? extends td.c$c>> */
            /* JADX WARN: Multi-variable type inference failed */
            public b(InterfaceC7897n<? super C7347n<? extends InterfaceC11571c.c>> interfaceC7897n) {
                this.f20186a = interfaceC7897n;
            }

            @Override // sb.InterfaceC11254f
            public final void onFailure(Exception it) {
                Intrinsics.checkNotNullParameter(it, "it");
                InterfaceC7897n<C7347n<? extends InterfaceC11571c.c>> interfaceC7897n = this.f20186a;
                C7347n.Companion companion = C7347n.INSTANCE;
                interfaceC7897n.resumeWith(C7347n.m30460b(C7347n.m30459a(C7347n.m30460b(C7348o.m30469a(it)))));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, InterfaceC9557b<? super d> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f20177D = str;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C5174a.this.new d(this.f20177D, interfaceC9557b);
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:13:0x0031 */
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
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC11970a interfaceC11970a;
            C5174a c5174a;
            String str;
            int i10;
            String str2;
            C5174a c5174a2;
            int i11;
            int i12;
            InterfaceC11571c interfaceC11571cCreate;
            InterfaceC11571c.a aVarMo43246a;
            Object objM32857A;
            InterfaceC11571c.a aVar;
            int i13;
            C5174a c5174a3;
            Object value;
            Throwable thM30463e;
            InterfaceC9566c0 interfaceC9566c0;
            b.d dVar;
            Object objM38805e = C10047c.m38805e();
            ?? r8 = this.f20175B;
            try {
                if (r8 == 0) {
                    C7348o.m30470b(obj);
                    interfaceC11970a = C5174a.this.mutex;
                    c5174a = C5174a.this;
                    String str3 = this.f20177D;
                    this.f20178t = interfaceC11970a;
                    this.f20179u = c5174a;
                    this.f20180v = str3;
                    this.f20183y = 0;
                    this.f20175B = 1;
                    if (interfaceC11970a.mo44674f(null, this) != objM38805e) {
                        str = str3;
                        i10 = 0;
                    }
                    return objM38805e;
                }
                if (r8 != 1) {
                    if (r8 == 2) {
                        int i14 = this.f20184z;
                        int i15 = this.f20183y;
                        String str4 = (String) this.f20180v;
                        c5174a2 = (C5174a) this.f20179u;
                        InterfaceC11970a interfaceC11970a2 = (InterfaceC11970a) this.f20178t;
                        try {
                            C7348o.m30470b(obj);
                            i12 = i14;
                            interfaceC11970a = interfaceC11970a2;
                            str2 = str4;
                            i11 = i15;
                            interfaceC11571cCreate = c5174a2.standardIntegrityManagerFactory.create(c5174a2.applicationContext);
                            aVarMo43246a = InterfaceC11571c.a.m43243c().mo43247b(Long.parseLong(str2)).mo43246a();
                            this.f20178t = interfaceC11970a;
                            this.f20179u = c5174a2;
                            this.f20180v = interfaceC11571cCreate;
                            this.f20181w = aVarMo43246a;
                            this.f20182x = this;
                            this.f20183y = i11;
                            this.f20184z = i12;
                            this.f20174A = 0;
                            this.f20175B = 3;
                            C7905p c7905p = new C7905p(C10046b.m38803c(this), 1);
                            c7905p.m32860H();
                            interfaceC11571cCreate.mo43242a(aVarMo43246a).mo11893g(new C5175b(new a(c7905p))).mo11891e(new b(c7905p));
                            objM32857A = c7905p.m32857A();
                            if (objM32857A == C10047c.m38805e()) {
                                C10346h.m39673c(this);
                            }
                            if (objM32857A == objM38805e) {
                                aVar = aVarMo43246a;
                                i13 = i11;
                                c5174a3 = c5174a2;
                                value = ((C7347n) objM32857A).getValue();
                                thM30463e = C7347n.m30463e(value);
                                if (thM30463e == null) {
                                    InterfaceC11571c.c cVar = (InterfaceC11571c.c) value;
                                    interfaceC9566c0 = c5174a3.playIntegrityState;
                                    dVar = new b.d(cVar);
                                    this.f20178t = interfaceC11970a;
                                    this.f20179u = C10350l.m39676a(interfaceC11571cCreate);
                                    this.f20180v = C10350l.m39676a(aVar);
                                    this.f20181w = C10350l.m39676a(cVar);
                                    this.f20182x = null;
                                    this.f20183y = i13;
                                    this.f20184z = i12;
                                    this.f20174A = 0;
                                    this.f20175B = 4;
                                    if (interfaceC9566c0.emit(dVar, this) == objM38805e) {
                                    }
                                } else {
                                    C9542e.m37666b(c5174a3.logger, "integrity:prepare:" + thM30463e.getMessage(), null, 2, null);
                                    InterfaceC9566c0 interfaceC9566c1 = c5174a3.playIntegrityState;
                                    b.a aVar2 = b.a.f20141a;
                                    this.f20178t = interfaceC11970a;
                                    this.f20179u = C10350l.m39676a(interfaceC11571cCreate);
                                    this.f20180v = C10350l.m39676a(aVar);
                                    this.f20181w = C10350l.m39676a(thM30463e);
                                    this.f20182x = null;
                                    this.f20183y = i13;
                                    this.f20184z = i12;
                                    this.f20174A = 0;
                                    this.f20175B = 5;
                                }
                            }
                            return objM38805e;
                        } catch (Throwable th2) {
                            th = th2;
                            r8 = interfaceC11970a2;
                        }
                    } else if (r8 != 3) {
                        if (r8 == 4) {
                        } else {
                            if (r8 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        interfaceC11970a = (InterfaceC11970a) this.f20178t;
                        C7348o.m30470b(obj);
                    } else {
                        int i16 = this.f20184z;
                        i13 = this.f20183y;
                        aVar = (InterfaceC11571c.a) this.f20181w;
                        InterfaceC11571c interfaceC11571c = (InterfaceC11571c) this.f20180v;
                        c5174a3 = (C5174a) this.f20179u;
                        InterfaceC11970a interfaceC11970a3 = (InterfaceC11970a) this.f20178t;
                        try {
                            C7348o.m30470b(obj);
                            objM32857A = obj;
                            interfaceC11571cCreate = interfaceC11571c;
                            i12 = i16;
                            interfaceC11970a = interfaceC11970a3;
                            value = ((C7347n) objM32857A).getValue();
                            thM30463e = C7347n.m30463e(value);
                            if (thM30463e == null) {
                                InterfaceC11571c.c cVar2 = (InterfaceC11571c.c) value;
                                interfaceC9566c0 = c5174a3.playIntegrityState;
                                dVar = new b.d(cVar2);
                                this.f20178t = interfaceC11970a;
                                this.f20179u = C10350l.m39676a(interfaceC11571cCreate);
                                this.f20180v = C10350l.m39676a(aVar);
                                this.f20181w = C10350l.m39676a(cVar2);
                                this.f20182x = null;
                                this.f20183y = i13;
                                this.f20184z = i12;
                                this.f20174A = 0;
                                this.f20175B = 4;
                                if (interfaceC9566c0.emit(dVar, this) == objM38805e) {
                                    return objM38805e;
                                }
                            } else {
                                C9542e.m37666b(c5174a3.logger, "integrity:prepare:" + thM30463e.getMessage(), null, 2, null);
                                InterfaceC9566c0 interfaceC9566c2 = c5174a3.playIntegrityState;
                                b.a aVar3 = b.a.f20141a;
                                this.f20178t = interfaceC11970a;
                                this.f20179u = C10350l.m39676a(interfaceC11571cCreate);
                                this.f20180v = C10350l.m39676a(aVar);
                                this.f20181w = C10350l.m39676a(thM30463e);
                                this.f20182x = null;
                                this.f20183y = i13;
                                this.f20184z = i12;
                                this.f20174A = 0;
                                this.f20175B = 5;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            r8 = interfaceC11970a3;
                        }
                    }
                    r8.mo44673e(null);
                    throw th;
                }
                int i17 = this.f20183y;
                String str5 = (String) this.f20180v;
                c5174a = (C5174a) this.f20179u;
                InterfaceC11970a interfaceC11970a4 = (InterfaceC11970a) this.f20178t;
                C7348o.m30470b(obj);
                i10 = i17;
                interfaceC11970a = interfaceC11970a4;
                str = str5;
                Unit unit = Unit.f29331a;
                interfaceC11970a.mo44673e(null);
                return Unit.f29331a;
                if (!Intrinsics.m31980c(c5174a.playIntegrityState.getValue(), b.C14163b.f20142a)) {
                    Unit unit2 = Unit.f29331a;
                    interfaceC11970a.mo44673e(null);
                    return unit2;
                }
                InterfaceC9566c0 interfaceC9566c3 = c5174a.playIntegrityState;
                b.c cVar3 = b.c.f20143a;
                this.f20178t = interfaceC11970a;
                this.f20179u = c5174a;
                this.f20180v = str;
                this.f20183y = i10;
                this.f20184z = 0;
                this.f20175B = 2;
                if (interfaceC9566c3.emit(cVar3, this) != objM38805e) {
                    str2 = str;
                    c5174a2 = c5174a;
                    i11 = i10;
                    i12 = 0;
                    interfaceC11571cCreate = c5174a2.standardIntegrityManagerFactory.create(c5174a2.applicationContext);
                    aVarMo43246a = InterfaceC11571c.a.m43243c().mo43247b(Long.parseLong(str2)).mo43246a();
                    this.f20178t = interfaceC11970a;
                    this.f20179u = c5174a2;
                    this.f20180v = interfaceC11571cCreate;
                    this.f20181w = aVarMo43246a;
                    this.f20182x = this;
                    this.f20183y = i11;
                    this.f20184z = i12;
                    this.f20174A = 0;
                    this.f20175B = 3;
                    C7905p c7905p2 = new C7905p(C10046b.m38803c(this), 1);
                    c7905p2.m32860H();
                    interfaceC11571cCreate.mo43242a(aVarMo43246a).mo11893g(new C5175b(new a(c7905p2))).mo11891e(new b(c7905p2));
                    objM32857A = c7905p2.m32857A();
                    if (objM32857A == C10047c.m38805e()) {
                        C10346h.m39673c(this);
                    }
                    if (objM32857A == objM38805e) {
                        aVar = aVarMo43246a;
                        i13 = i11;
                        c5174a3 = c5174a2;
                        value = ((C7347n) objM32857A).getValue();
                        thM30463e = C7347n.m30463e(value);
                        if (thM30463e == null) {
                            InterfaceC11571c.c cVar4 = (InterfaceC11571c.c) value;
                            interfaceC9566c0 = c5174a3.playIntegrityState;
                            dVar = new b.d(cVar4);
                            this.f20178t = interfaceC11970a;
                            this.f20179u = C10350l.m39676a(interfaceC11571cCreate);
                            this.f20180v = C10350l.m39676a(aVar);
                            this.f20181w = C10350l.m39676a(cVar4);
                            this.f20182x = null;
                            this.f20183y = i13;
                            this.f20184z = i12;
                            this.f20174A = 0;
                            this.f20175B = 4;
                            if (interfaceC9566c0.emit(dVar, this) == objM38805e) {
                            }
                            Unit unit3 = Unit.f29331a;
                            interfaceC11970a.mo44673e(null);
                            return Unit.f29331a;
                        }
                        C9542e.m37666b(c5174a3.logger, "integrity:prepare:" + thM30463e.getMessage(), null, 2, null);
                        InterfaceC9566c0 interfaceC9566c4 = c5174a3.playIntegrityState;
                        b.a aVar4 = b.a.f20141a;
                        this.f20178t = interfaceC11970a;
                        this.f20179u = C10350l.m39676a(interfaceC11571cCreate);
                        this.f20180v = C10350l.m39676a(aVar);
                        this.f20181w = C10350l.m39676a(thM30463e);
                        this.f20182x = null;
                        this.f20183y = i13;
                        this.f20184z = i12;
                        this.f20174A = 0;
                        this.f20175B = 5;
                    }
                }
                return objM38805e;
            } catch (Throwable th4) {
                th = th4;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((d) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: ep.a$e */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$release$2", m39664f = "PlayIntegrityHelper.kt", m39665l = {153, 144}, m39666m = "invokeSuspend")
    public static final class e extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f20187t;

        /* JADX INFO: renamed from: u */
        public Object f20188u;

        /* JADX INFO: renamed from: v */
        public int f20189v;

        /* JADX INFO: renamed from: w */
        public int f20190w;

        /* JADX INFO: renamed from: x */
        public int f20191x;

        public e(InterfaceC9557b<? super e> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C5174a.this.new e(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC11970a interfaceC11970a;
            C5174a c5174a;
            int i10;
            InterfaceC11970a interfaceC11970a2;
            Throwable th2;
            Object objM38805e = C10047c.m38805e();
            int i11 = this.f20191x;
            try {
                if (i11 == 0) {
                    C7348o.m30470b(obj);
                    interfaceC11970a = C5174a.this.mutex;
                    C5174a c5174a2 = C5174a.this;
                    this.f20187t = interfaceC11970a;
                    this.f20188u = c5174a2;
                    this.f20189v = 0;
                    this.f20191x = 1;
                    if (interfaceC11970a.mo44674f(null, this) != objM38805e) {
                        c5174a = c5174a2;
                        i10 = 0;
                    }
                    return objM38805e;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC11970a2 = (InterfaceC11970a) this.f20187t;
                    try {
                        C7348o.m30470b(obj);
                        Unit unit = Unit.f29331a;
                        interfaceC11970a2.mo44673e(null);
                        return Unit.f29331a;
                    } catch (Throwable th3) {
                        th2 = th3;
                        interfaceC11970a2.mo44673e(null);
                        throw th2;
                    }
                }
                i10 = this.f20189v;
                c5174a = (C5174a) this.f20188u;
                InterfaceC11970a interfaceC11970a3 = (InterfaceC11970a) this.f20187t;
                C7348o.m30470b(obj);
                interfaceC11970a = interfaceC11970a3;
                InterfaceC9566c0 interfaceC9566c0 = c5174a.playIntegrityState;
                b.C14163b c14163b = b.C14163b.f20142a;
                this.f20187t = interfaceC11970a;
                this.f20188u = null;
                this.f20189v = i10;
                this.f20190w = 0;
                this.f20191x = 2;
                if (interfaceC9566c0.emit(c14163b, this) != objM38805e) {
                    interfaceC11970a2 = interfaceC11970a;
                    Unit unit2 = Unit.f29331a;
                    interfaceC11970a2.mo44673e(null);
                    return Unit.f29331a;
                }
                return objM38805e;
            } catch (Throwable th4) {
                interfaceC11970a2 = interfaceC11970a;
                th2 = th4;
                interfaceC11970a2.mo44673e(null);
                throw th2;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((e) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    static {
        C7800a.Companion companion = C7800a.INSTANCE;
        f20132j = C7801b.m32371p(10, EnumC7361b.SECONDS);
    }

    public C5174a(@NotNull Context applicationContext, @NotNull C9542e.a loggerFactory, @NotNull InterfaceC5179f standardIntegrityManagerFactory, @NotNull AbstractC7888l0 dispatcher) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        Intrinsics.checkNotNullParameter(standardIntegrityManagerFactory, "standardIntegrityManagerFactory");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.applicationContext = applicationContext;
        this.loggerFactory = loggerFactory;
        this.standardIntegrityManagerFactory = standardIntegrityManagerFactory;
        this.dispatcher = dispatcher;
        this.logger = loggerFactory.create("com.withpersona.sdk2.inquiry.integrity");
        this.mutex = C11976g.m44697b(false, 1, null);
        this.coroutineScope = C7910q0.m32885a(dispatcher.plus(C7948z2.m32943b(null, 1, null)));
        this.playIntegrityState = C9596r0.m37859a(b.C14163b.f20142a);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final Object m24064g(@NotNull InterfaceC9557b<? super String> interfaceC9557b) {
        return C7872i.m32684g(this.dispatcher, new c(null), interfaceC9557b);
    }

    /* JADX INFO: renamed from: h */
    public final void m24065h(@NotNull String cloudProjectNumber) {
        Intrinsics.checkNotNullParameter(cloudProjectNumber, "cloudProjectNumber");
        C7882k.m32780d(this.coroutineScope, null, null, new d(cloudProjectNumber, null), 3, null);
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final Object m24066i(@NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objM32684g = C7872i.m32684g(this.dispatcher, new e(null), interfaceC9557b);
        return objM32684g == C10047c.m38805e() ? objM32684g : Unit.f29331a;
    }
}
