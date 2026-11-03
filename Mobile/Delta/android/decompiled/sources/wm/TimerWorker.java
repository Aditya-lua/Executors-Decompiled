package wm;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: wm.l, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001b¨\u0006\u001c"}, d2 = {"Lwm/l;", "Lwm/o;", "", "", "delayMs", "", "key", "<init>", "(JLjava/lang/String;)V", "Llu/h;", "run", "()Llu/h;", "otherWorker", "", "c", "(Lwm/o;)Z", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "J", "Ljava/lang/String;", "wf1-workflow-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class TimerWorker implements o<Unit> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final long delayMs;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String key;

    /* JADX INFO: renamed from: wm.l$a */
    @nt.f(c = "com.squareup.workflow1.TimerWorker$run$1", f = "Worker.kt", l = {339, 340}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llu/i;", "", "<anonymous>", "(Llu/i;)V"}, k = 3, mv = {1, 6, 0})
    public static final class a extends nt.m implements Function2<lu.i<? super Unit>, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f34575t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f34576u;

        public a(lt.b<? super a> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        @NotNull
        public final lt.b<Unit> create(@Nullable Object obj, @NotNull lt.b<?> bVar) {
            a aVar = TimerWorker.this.new a(bVar);
            aVar.f34576u = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
        
            if (r1.emit(r7, r6) == r0) goto L15;
         */
        @Override // nt.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = mt.c.e()
                int r1 = r6.f34575t
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                gt.o.b(r7)
                goto L49
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.f34576u
                lu.i r1 = (lu.i) r1
                gt.o.b(r7)
                goto L3b
            L22:
                gt.o.b(r7)
                java.lang.Object r7 = r6.f34576u
                r1 = r7
                lu.i r1 = (lu.i) r1
                wm.l r7 = wm.TimerWorker.this
                long r4 = wm.TimerWorker.a(r7)
                r6.f34576u = r1
                r6.f34575t = r3
                java.lang.Object r7 = iu.z0.b(r4, r6)
                if (r7 != r0) goto L3b
                goto L48
            L3b:
                kotlin.Unit r7 = kotlin.Unit.f22938a
                r3 = 0
                r6.f34576u = r3
                r6.f34575t = r2
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L49
            L48:
                return r0
            L49:
                kotlin.Unit r7 = kotlin.Unit.f22938a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: wm.TimerWorker.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull lu.i<? super Unit> iVar, @Nullable lt.b<? super Unit> bVar) {
            return ((a) create(iVar, bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    public TimerWorker(long j10, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.delayMs = j10;
        this.key = key;
    }

    @Override // wm.o
    public boolean c(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof TimerWorker) && Intrinsics.c(((TimerWorker) otherWorker).key, this.key);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerWorker)) {
            return false;
        }
        TimerWorker timerWorker = (TimerWorker) other;
        return this.delayMs == timerWorker.delayMs && Intrinsics.c(this.key, timerWorker.key);
    }

    public int hashCode() {
        return (Long.hashCode(this.delayMs) * 31) + this.key.hashCode();
    }

    @Override // wm.o, tr.h
    @NotNull
    public lu.h<Unit> run() {
        return lu.j.w(new a(null));
    }

    @NotNull
    public String toString() {
        return "TimerWorker(delayMs=" + this.delayMs + ", key=" + this.key + ')';
    }
}
