package ls;

import av.z0;
import com.github.luben.zstd.BuildConfig;
import gu.l;
import gu.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import zt.o;

/* JADX INFO: renamed from: ls.e, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lls/e;", "Lls/j;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "delayMs", "<init>", "(J)V", "Ldv/h;", "run", "()Ldv/h;", "otherWorker", BuildConfig.FLAVOR, "c", "(Lls/j;)Z", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "b", "J", "workflows_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TimerWorker implements j<Unit> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final long delayMs;

    /* JADX INFO: renamed from: ls.e$a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ldv/i;", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.workflows.TimerWorker$run$1", f = "TimerWorker.kt", l = {11, 12}, m = "invokeSuspend")
    public static final class a extends m implements Function2<dv.i<? super Unit>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f22473t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f22474u;

        public a(eu.b<? super a> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            a aVar = TimerWorker.this.new a(bVar);
            aVar.f22474u = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            if (r0.emit(r8, r7) == r1) goto L15;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            dv.i iVar = (dv.i) this.f22474u;
            Object objE = fu.c.e();
            int i10 = this.f22473t;
            if (i10 != 0) {
                if (i10 == 1) {
                    o.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                return Unit.f21506a;
            }
            o.b(obj);
            long j10 = TimerWorker.this.delayMs;
            this.f22474u = iVar;
            this.f22473t = 1;
            if (z0.b(j10, this) != objE) {
            }
            return objE;
            Unit unit = Unit.f21506a;
            this.f22474u = l.a(iVar);
            this.f22473t = 2;
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(dv.i<? super Unit> iVar, eu.b<? super Unit> bVar) {
            return ((a) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    public TimerWorker(long j10) {
        this.delayMs = j10;
    }

    @Override // ls.j
    public boolean b(@NotNull j<?> jVar) {
        return super.b(jVar);
    }

    @Override // ls.j
    public boolean c(@NotNull j<?> otherWorker) {
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

    @Override // ls.j
    @NotNull
    public dv.h<Unit> run() {
        return dv.j.w(new a(null));
    }

    @NotNull
    public String toString() {
        return "TimerWorker(delayMs=" + this.delayMs + ")";
    }
}
