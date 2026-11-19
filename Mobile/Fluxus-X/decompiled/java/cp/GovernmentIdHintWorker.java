package cp;

import android.content.Context;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.common.MlKitException;
import dv.h;
import dv.i;
import gu.l;
import gu.m;
import ln.o;
import ls.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import sn.ImageLightCondition;
import sn.h0;
import sn.w0;
import vo.IdConfig;
import zt.n;

/* JADX INFO: renamed from: cp.a, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u0000 )2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003:\u0003\u000e\u0010$B#\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\r2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcp/a;", "Lln/o;", "Lcp/d;", "Lls/j;", "Landroid/content/Context;", "context", "Lsn/h0;", "governmentIdFeed", "Lvo/d3$e;", "side", "<init>", "(Landroid/content/Context;Lsn/h0;Lvo/d3$e;)V", "otherWorker", BuildConfig.FLAVOR, "a", "(Lln/o;)Z", "c", "(Lls/j;)Z", "Ldv/h;", "run", "()Ldv/h;", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "Lsn/w0;", "it", "Lcp/a$c;", "f", "(Lsn/w0;)Lcp/a$c;", "b", "Landroid/content/Context;", "Lsn/h0;", "d", "Lvo/d3$e;", "e", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GovernmentIdHintWorker implements o<cp.d>, j<cp.d> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final h0 governmentIdFeed;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final IdConfig.e side;

    /* JADX INFO: renamed from: cp.a$b */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcp/a$b;", BuildConfig.FLAVOR, "Lvo/d3$e;", "side", "Lcp/a;", "a", "(Lvo/d3$e;)Lcp/a;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {
        @NotNull
        GovernmentIdHintWorker a(@NotNull IdConfig.e side);
    }

    /* JADX INFO: renamed from: cp.a$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcp/a$c;", BuildConfig.FLAVOR, "Lcp/d;", "hint", BuildConfig.FLAVOR, "minDurationMs", "<init>", "(Lcp/d;J)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Lcp/d;", "()Lcp/d;", "b", "J", "()J", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class HintEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final cp.d hint;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final long minDurationMs;

        public HintEvent(@NotNull cp.d hint, long j10) {
            Intrinsics.checkNotNullParameter(hint, "hint");
            this.hint = hint;
            this.minDurationMs = j10;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final cp.d getHint() {
            return this.hint;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getMinDurationMs() {
            return this.minDurationMs;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HintEvent)) {
                return false;
            }
            HintEvent hintEvent = (HintEvent) other;
            return Intrinsics.c(this.hint, hintEvent.hint) && this.minDurationMs == hintEvent.minDurationMs;
        }

        public int hashCode() {
            return (this.hint.hashCode() * 31) + Long.hashCode(this.minDurationMs);
        }

        @NotNull
        public String toString() {
            return "HintEvent(hint=" + this.hint + ", minDurationMs=" + this.minDurationMs + ")";
        }
    }

    /* JADX INFO: renamed from: cp.a$d */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldv/i;", "Lcp/d;", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker$run$1", f = "GovernmentIdHintWorker.kt", l = {98}, m = "invokeSuspend")
    public static final class d extends m implements Function2<i<? super cp.d>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f11493t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f11494u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ h<HintEvent> f11495v;

        /* JADX INFO: renamed from: cp.a$d$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0199a<T> implements i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i<cp.d> f11496a;

            /* JADX INFO: renamed from: cp.a$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            @gu.f(c = "com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker$run$1$1", f = "GovernmentIdHintWorker.kt", l = {99, MlKitException.MODEL_INCOMPATIBLE_WITH_TFLITE}, m = "emit")
            public static final class C0200a extends gu.d {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public Object f11497t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public /* synthetic */ Object f11498u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ C0199a<T> f11499v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public int f11500w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0200a(C0199a<? super T> c0199a, eu.b<? super C0200a> bVar) {
                    super(bVar);
                    this.f11499v = c0199a;
                }

                @Override // gu.a
                public final Object invokeSuspend(Object obj) {
                    this.f11498u = obj;
                    this.f11500w |= Integer.MIN_VALUE;
                    return this.f11499v.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0199a(i<? super cp.d> iVar) {
                this.f11496a = iVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
            
                if (av.z0.b(r4, r0) == r1) goto L28;
             */
            @Override // dv.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(HintEvent hintEvent, eu.b<? super Unit> bVar) {
                C0200a c0200a;
                if (bVar instanceof C0200a) {
                    c0200a = (C0200a) bVar;
                    int i10 = c0200a.f11500w;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0200a.f11500w = i10 - Integer.MIN_VALUE;
                    } else {
                        c0200a = new C0200a(this, bVar);
                    }
                } else {
                    c0200a = new C0200a(this, bVar);
                }
                Object obj = c0200a.f11498u;
                Object objE = fu.c.e();
                int i11 = c0200a.f11500w;
                if (i11 == 0) {
                    zt.o.b(obj);
                    i<cp.d> iVar = this.f11496a;
                    cp.d hint = hintEvent != null ? hintEvent.getHint() : null;
                    c0200a.f11497t = hintEvent;
                    c0200a.f11500w = 1;
                    if (iVar.emit(hint, c0200a) != objE) {
                    }
                    return objE;
                }
                if (i11 == 1) {
                    hintEvent = (HintEvent) c0200a.f11497t;
                    zt.o.b(obj);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                }
                return Unit.f21506a;
                long jD = p001kotlin.ranges.d.d(hintEvent != null ? hintEvent.getMinDurationMs() : 0L, 33L);
                c0200a.f11497t = l.a(hintEvent);
                c0200a.f11500w = 2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(h<HintEvent> hVar, eu.b<? super d> bVar) {
            super(2, bVar);
            this.f11495v = hVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            d dVar = new d(this.f11495v, bVar);
            dVar.f11494u = obj;
            return dVar;
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            i iVar = (i) this.f11494u;
            Object objE = fu.c.e();
            int i10 = this.f11493t;
            if (i10 == 0) {
                zt.o.b(obj);
                h hVarK = dv.j.k(this.f11495v);
                C0199a c0199a = new C0199a(iVar);
                this.f11494u = l.a(iVar);
                this.f11493t = 1;
                if (hVarK.collect(c0199a, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super cp.d> iVar, eu.b<? super Unit> bVar) {
            return ((d) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    /* JADX INFO: renamed from: cp.a$e */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldv/i;", "Lcp/a$c;", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker$run$hintFlow$1", f = "GovernmentIdHintWorker.kt", l = {82}, m = "invokeSuspend")
    public static final class e extends m implements Function2<i<? super HintEvent>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f11501t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f11502u;

        /* JADX INFO: renamed from: cp.a$e$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0201a<T> implements i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i<HintEvent> f11504a;
            public final /* synthetic */ GovernmentIdHintWorker b;

            /* JADX WARN: Multi-variable type inference failed */
            public C0201a(i<? super HintEvent> iVar, GovernmentIdHintWorker governmentIdHintWorker) {
                this.f11504a = iVar;
                this.b = governmentIdHintWorker;
            }

            @Override // dv.i
            public final Object emit(Object obj, eu.b<? super Unit> bVar) {
                Object value = ((n) obj).getValue();
                i<HintEvent> iVar = this.f11504a;
                GovernmentIdHintWorker governmentIdHintWorker = this.b;
                if (n.e(value) == null) {
                    Object objEmit = iVar.emit(governmentIdHintWorker.f((w0) value), bVar);
                    if (objEmit == fu.c.e()) {
                        return objEmit;
                    }
                } else {
                    Object objEmit2 = iVar.emit(null, bVar);
                    if (objEmit2 == fu.c.e()) {
                        return objEmit2;
                    }
                }
                return Unit.f21506a;
            }
        }

        public e(eu.b<? super e> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            e eVar = GovernmentIdHintWorker.this.new e(bVar);
            eVar.f11502u = obj;
            return eVar;
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            i iVar = (i) this.f11502u;
            Object objE = fu.c.e();
            int i10 = this.f11501t;
            if (i10 == 0) {
                zt.o.b(obj);
                h0 h0Var = GovernmentIdHintWorker.this.governmentIdFeed;
                C0201a c0201a = new C0201a(iVar, GovernmentIdHintWorker.this);
                this.f11502u = l.a(iVar);
                this.f11501t = 1;
                if (h0Var.collect(c0201a, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            throw new zt.d();
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super HintEvent> iVar, eu.b<? super Unit> bVar) {
            return ((e) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    public GovernmentIdHintWorker(@NotNull Context context, @NotNull h0 governmentIdFeed, @NotNull IdConfig.e side) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(governmentIdFeed, "governmentIdFeed");
        Intrinsics.checkNotNullParameter(side, "side");
        this.context = context;
        this.governmentIdFeed = governmentIdFeed;
        this.side = side;
    }

    @Override // ln.o
    public boolean a(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof GovernmentIdHintWorker) && ((GovernmentIdHintWorker) otherWorker).side == this.side;
    }

    @Override // ls.j
    public boolean b(@NotNull j<?> jVar) {
        return super.b(jVar);
    }

    @Override // ls.j
    public boolean c(@NotNull j<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof GovernmentIdHintWorker) && ((GovernmentIdHintWorker) otherWorker).side == this.side;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GovernmentIdHintWorker)) {
            return false;
        }
        GovernmentIdHintWorker governmentIdHintWorker = (GovernmentIdHintWorker) other;
        return Intrinsics.c(this.context, governmentIdHintWorker.context) && Intrinsics.c(this.governmentIdFeed, governmentIdHintWorker.governmentIdFeed) && this.side == governmentIdHintWorker.side;
    }

    public final HintEvent f(w0 it) {
        if (it instanceof w0.ParsedIdSide) {
            return new HintEvent(cp.e.f11507a, 1000L);
        }
        ImageLightCondition imageLightCondition = it.getImageLightCondition();
        if (imageLightCondition == null) {
            return null;
        }
        boolean z10 = imageLightCondition.getRmsContrast() < 0.2d || imageLightCondition.getLowHighContrast() < 0.2d;
        boolean z11 = imageLightCondition.getRmsContrast() > 0.3d && imageLightCondition.getLowHighContrast() > 0.5d;
        if ((imageLightCondition.getLuminosity() >= 0.34d || z11) && (imageLightCondition.getLuminosity() >= 0.45d || !z10)) {
            return null;
        }
        return new HintEvent(f.f11508a, 1000L);
    }

    public int hashCode() {
        return (((this.context.hashCode() * 31) + this.governmentIdFeed.hashCode()) * 31) + this.side.hashCode();
    }

    @Override // ln.o, ls.j
    @NotNull
    public h<cp.d> run() {
        return dv.j.m(dv.j.w(new d(dv.j.w(new e(null)), null)));
    }

    @NotNull
    public String toString() {
        return "GovernmentIdHintWorker(context=" + this.context + ", governmentIdFeed=" + this.governmentIdFeed + ", side=" + this.side + ")";
    }
}
