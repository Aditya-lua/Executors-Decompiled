package p499vr;

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
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: vr.d, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m31665d2 = {"Lvr/d;", "Lvr/h;", "", "", "delayMs", "<init>", "(J)V", "Lnu/h;", "run", "()Lnu/h;", "otherWorker", "", "c", "(Lvr/h;)Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "J", "workflows_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class TimerWorker implements InterfaceC12257h<Unit> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final long delayMs;

    /* JADX INFO: renamed from: vr.d$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lnu/i;", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.workflows.TimerWorker$run$1", m39664f = "TimerWorker.kt", m39665l = {11, 12}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC9577i<? super Unit>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f43295t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f43296u;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            a aVar = TimerWorker.this.new a(interfaceC9557b);
            aVar.f43296u = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            if (r0.emit(r8, r7) == r1) goto L15;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC9577i interfaceC9577i = (InterfaceC9577i) this.f43296u;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f43295t;
            if (i10 != 0) {
                if (i10 == 1) {
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
            long j10 = TimerWorker.this.delayMs;
            this.f43296u = interfaceC9577i;
            this.f43295t = 1;
            if (C7946z0.m32938b(j10, this) != objM38805e) {
            }
            return objM38805e;
            Unit unit = Unit.f29331a;
            this.f43296u = C10350l.m39676a(interfaceC9577i);
            this.f43295t = 2;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9577i<? super Unit> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC9577i, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public TimerWorker(long j10) {
        this.delayMs = j10;
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: a */
    public boolean mo7572a(@NotNull InterfaceC12257h<?> interfaceC12257h) {
        return super.mo7572a(interfaceC12257h);
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: c */
    public boolean mo7574c(@NotNull InterfaceC12257h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof TimerWorker) && ((TimerWorker) otherWorker).delayMs == this.delayMs;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TimerWorker) && this.delayMs == ((TimerWorker) other).delayMs;
    }

    public int hashCode() {
        return Long.hashCode(this.delayMs);
    }

    @Override // p499vr.InterfaceC12257h
    @NotNull
    public InterfaceC9575h<Unit> run() {
        return C9579j.m37806w(new a(null));
    }

    @NotNull
    public String toString() {
        return "TimerWorker(delayMs=" + this.delayMs + ")";
    }
}
