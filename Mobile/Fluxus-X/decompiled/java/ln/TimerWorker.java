package ln;

import av.z0;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ln.l, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lln/l;", "Lln/o;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "delayMs", BuildConfig.FLAVOR, "key", "<init>", "(JLjava/lang/String;)V", "Ldv/h;", "run", "()Ldv/h;", "otherWorker", BuildConfig.FLAVOR, "a", "(Lln/o;)Z", "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "b", "J", "c", "Ljava/lang/String;", "wf1-workflow-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class TimerWorker implements o<Unit> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final long delayMs;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String key;

    /* JADX INFO: renamed from: ln.l$a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ldv/i;", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {1, 6, 0})
    @gu.f(c = "com.squareup.workflow1.TimerWorker$run$1", f = "Worker.kt", l = {339, 340}, m = "invokeSuspend")
    public static final class a extends gu.m implements Function2<dv.i<? super Unit>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f22335t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f22336u;

        public a(eu.b<? super a> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        @NotNull
        public final eu.b<Unit> create(@Nullable Object obj, @NotNull eu.b<?> bVar) {
            a aVar = TimerWorker.this.new a(bVar);
            aVar.f22336u = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
        
            if (r1.emit(r7, r6) == r0) goto L15;
         */
        @Override // gu.a
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            dv.i iVar;
            Object objE = fu.c.e();
            int i10 = this.f22335t;
            if (i10 != 0) {
                if (i10 == 1) {
                    iVar = (dv.i) this.f22336u;
                    zt.o.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                }
                return Unit.f21506a;
            }
            zt.o.b(obj);
            iVar = (dv.i) this.f22336u;
            long j10 = TimerWorker.this.delayMs;
            this.f22336u = iVar;
            this.f22335t = 1;
            if (z0.b(j10, this) != objE) {
            }
            return objE;
            Unit unit = Unit.f21506a;
            this.f22336u = null;
            this.f22335t = 2;
        }

        @Override // p001kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull dv.i<? super Unit> iVar, @Nullable eu.b<? super Unit> bVar) {
            return ((a) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    public TimerWorker(long j10, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.delayMs = j10;
        this.key = key;
    }

    @Override // ln.o
    public boolean a(@NotNull o<?> otherWorker) {
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

    @Override // ln.o, ls.j
    @NotNull
    public dv.h<Unit> run() {
        return dv.j.w(new a(null));
    }

    @NotNull
    public String toString() {
        return "TimerWorker(delayMs=" + this.delayMs + ", key=" + this.key + ')';
    }
}
