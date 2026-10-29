package p612zq;

import android.content.Context;
import com.withpersona.sdk2.inquiry.sna.SilentNetworkAuthConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nu.C9579j;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p256ku.C7864g1;
import p256ku.C7866g3;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p499vr.InterfaceC12257h;
import p581ym.InterfaceC13222o;
import pt.AbstractC10351m;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: zq.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0014B\u001b\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m31665d2 = {"Lzq/a;", "Lym/o;", "Lzq/c$b;", "Lvr/h;", "Lzq/c;", "snaClient", "", "timeoutSeconds", "<init>", "(Lzq/c;I)V", "otherWorker", "", "b", "(Lym/o;)Z", "Lnu/h;", "run", "()Lnu/h;", "Lzq/c;", "c", "I", "a", "sna_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C14035a implements InterfaceC13222o<InterfaceC14037c.b>, InterfaceC12257h<InterfaceC14037c.b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC14037c snaClient;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int timeoutSeconds;

    /* JADX INFO: renamed from: zq.a$a */
    @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m31665d2 = {"Lzq/a$a;", "", "<init>", "()V", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/sna/SilentNetworkAuthConfig;", "config", "", "timeoutSeconds", "Lzq/a;", "a", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/sna/SilentNetworkAuthConfig;I)Lzq/a;", "sna_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a {
        @NotNull
        /* JADX INFO: renamed from: a */
        public final C14035a m50711a(@NotNull Context applicationContext, @NotNull SilentNetworkAuthConfig config, int timeoutSeconds) {
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            Intrinsics.checkNotNullParameter(config, "config");
            return new C14035a(C14039e.f49070a.m50724a(applicationContext, config), timeoutSeconds);
        }
    }

    /* JADX INFO: renamed from: zq.a$b */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lnu/i;", "Lzq/c$b;", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.sna.SilentNetworkAuthWorker$run$1", m39664f = "SilentNetworkAuthWorker.kt", m39665l = {24, 33, 39}, m39666m = "invokeSuspend")
    public static final class b extends AbstractC10351m implements Function2<InterfaceC9577i<? super InterfaceC14037c.b>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f49051t;

        /* JADX INFO: renamed from: u */
        public Object f49052u;

        /* JADX INFO: renamed from: v */
        public int f49053v;

        /* JADX INFO: renamed from: w */
        public /* synthetic */ Object f49054w;

        /* JADX INFO: renamed from: zq.a$b$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "Lzq/c$b;", "<anonymous>", "(Lku/p0;)Lzq/c$b;"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.sna.SilentNetworkAuthWorker$run$1$response$1", m39664f = "SilentNetworkAuthWorker.kt", m39665l = {}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super InterfaceC14037c.b>, Object> {

            /* JADX INFO: renamed from: t */
            public int f49056t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ InterfaceC14037c f49057u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC14037c interfaceC14037c, InterfaceC9557b<? super a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f49057u = interfaceC14037c;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f49057u, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                C10047c.m38805e();
                if (this.f49056t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return this.f49057u.m50716a();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super InterfaceC14037c.b> interfaceC9557b) {
                return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        public b(InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            b bVar = C14035a.this.new b(interfaceC9557b);
            bVar.f49054w = obj;
            return bVar;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0091  */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
        
            if (r0.emit(r10, r9) == r1) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00d0, code lost:
        
            if (r0.emit(r10, r9) == r1) goto L27;
         */
        /* JADX WARN: Instruction removed from duplicated block: B:24:0x0091, please report this as an issue */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC14037c interfaceC14037c;
            Object error;
            InterfaceC9577i interfaceC9577i = (InterfaceC9577i) this.f49054w;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f49053v;
            if (i10 != 0) {
                if (i10 == 1) {
                    C7348o.m30470b(obj);
                    return Unit.f29331a;
                }
                if (i10 == 2) {
                    interfaceC14037c = (InterfaceC14037c) this.f49051t;
                    C7348o.m30470b(obj);
                    error = (InterfaceC14037c.b) obj;
                    if (error == null) {
                        error = new InterfaceC14037c.b.Error(EnumC14038d.TimeoutError.getKey(), "SNA timed out after " + C14035a.this.timeoutSeconds + "s");
                    }
                    this.f49054w = C10350l.m39676a(interfaceC9577i);
                    this.f49051t = C10350l.m39676a(interfaceC14037c);
                    this.f49052u = C10350l.m39676a(error);
                    this.f49053v = 3;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                return Unit.f29331a;
            }
            C7348o.m30470b(obj);
            interfaceC14037c = C14035a.this.snaClient;
            if (interfaceC14037c == null) {
                EnumC14038d enumC14038d = EnumC14038d.IntegrationError;
                InterfaceC14037c.b.Error error2 = new InterfaceC14037c.b.Error(enumC14038d.getKey(), enumC14038d.getMessage());
                this.f49054w = C10350l.m39676a(interfaceC9577i);
                this.f49051t = C10350l.m39676a(interfaceC14037c);
                this.f49053v = 1;
            } else {
                long j10 = ((long) C14035a.this.timeoutSeconds) * 1000;
                a aVar = new a(interfaceC14037c, null);
                this.f49054w = interfaceC9577i;
                this.f49051t = C10350l.m39676a(interfaceC14037c);
                this.f49053v = 2;
                obj = C7866g3.m32662e(j10, aVar, this);
                if (obj != objM38805e) {
                    error = (InterfaceC14037c.b) obj;
                    if (error == null) {
                        error = new InterfaceC14037c.b.Error(EnumC14038d.TimeoutError.getKey(), "SNA timed out after " + C14035a.this.timeoutSeconds + "s");
                    }
                    this.f49054w = C10350l.m39676a(interfaceC9577i);
                    this.f49051t = C10350l.m39676a(interfaceC14037c);
                    this.f49052u = C10350l.m39676a(error);
                    this.f49053v = 3;
                }
            }
            return objM38805e;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9577i<? super InterfaceC14037c.b> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((b) create(interfaceC9577i, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C14035a(@Nullable InterfaceC14037c interfaceC14037c, int i10) {
        this.snaClient = interfaceC14037c;
        this.timeoutSeconds = i10;
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: a */
    public boolean mo7572a(@NotNull InterfaceC12257h<?> interfaceC12257h) {
        return super.mo7572a(interfaceC12257h);
    }

    @Override // p581ym.InterfaceC13222o
    /* JADX INFO: renamed from: b */
    public boolean mo7573b(@NotNull InterfaceC13222o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return otherWorker instanceof C14035a;
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: c */
    public boolean mo7574c(@NotNull InterfaceC12257h<?> interfaceC12257h) {
        return super.mo7574c(interfaceC12257h);
    }

    @Override // p581ym.InterfaceC13222o, p499vr.InterfaceC12257h
    @NotNull
    public InterfaceC9575h<InterfaceC14037c.b> run() {
        return C9579j.m37808y(C9579j.m37806w(new b(null)), C7864g1.m32643a());
    }
}
