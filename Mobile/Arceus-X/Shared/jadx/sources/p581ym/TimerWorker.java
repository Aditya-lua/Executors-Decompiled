package p581ym;

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
import p256ku.C7946z0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: ym.l, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m31665d2 = {"Lym/l;", "Lym/o;", "", "", "delayMs", "", "key", "<init>", "(JLjava/lang/String;)V", "Lnu/h;", "run", "()Lnu/h;", "otherWorker", "", "b", "(Lym/o;)Z", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "c", "Ljava/lang/String;", "wf1-workflow-core"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public final /* data */ class TimerWorker implements InterfaceC13222o<Unit> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final long delayMs;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    public final String key;

    /* JADX INFO: renamed from: ym.l$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lnu/i;", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {1, 6, 0})
    @InterfaceC10344f(m39663c = "com.squareup.workflow1.TimerWorker$run$1", m39664f = "Worker.kt", m39665l = {339, 340}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC9577i<? super Unit>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f46525t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f46526u;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @NotNull
        public final InterfaceC9557b<Unit> create(@Nullable Object obj, @NotNull InterfaceC9557b<?> interfaceC9557b) {
            a aVar = TimerWorker.this.new a(interfaceC9557b);
            aVar.f46526u = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
        
            if (r1.emit(r7, r6) == r0) goto L15;
         */
        @Override // pt.AbstractC10339a
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            InterfaceC9577i interfaceC9577i;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f46525t;
            if (i10 != 0) {
                if (i10 == 1) {
                    interfaceC9577i = (InterfaceC9577i) this.f46526u;
                    C7348o.m30470b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                return Unit.f29331a;
            }
            C7348o.m30470b(obj);
            interfaceC9577i = (InterfaceC9577i) this.f46526u;
            long j10 = TimerWorker.this.delayMs;
            this.f46526u = interfaceC9577i;
            this.f46525t = 1;
            if (C7946z0.m32938b(j10, this) != objM38805e) {
            }
            return objM38805e;
            Unit unit = Unit.f29331a;
            this.f46526u = null;
            this.f46525t = 2;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull InterfaceC9577i<? super Unit> interfaceC9577i, @Nullable InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC9577i, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public TimerWorker(long j10, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.delayMs = j10;
        this.key = key;
    }

    @Override // p581ym.InterfaceC13222o
    /* JADX INFO: renamed from: b */
    public boolean mo7573b(@NotNull InterfaceC13222o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof TimerWorker) && Intrinsics.m31980c(((TimerWorker) otherWorker).key, this.key);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerWorker)) {
            return false;
        }
        TimerWorker timerWorker = (TimerWorker) other;
        return this.delayMs == timerWorker.delayMs && Intrinsics.m31980c(this.key, timerWorker.key);
    }

    public int hashCode() {
        return (Long.hashCode(this.delayMs) * 31) + this.key.hashCode();
    }

    @Override // p581ym.InterfaceC13222o, p499vr.InterfaceC12257h
    @NotNull
    public InterfaceC9575h<Unit> run() {
        return C9579j.m37806w(new a(null));
    }

    @NotNull
    public String toString() {
        return "TimerWorker(delayMs=" + this.delayMs + ", key=" + this.key + ')';
    }
}
