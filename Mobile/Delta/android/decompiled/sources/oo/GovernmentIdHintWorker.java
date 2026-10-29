package oo;

import android.content.Context;
import com.withpersona.sdk2.camera.ImageLightCondition;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.Hint;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.HoldStillHint;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.LowLightHint;
import fn.j0;
import fn.x;
import jt.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nu.i;
import nu.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.f;
import pt.l;
import pt.m;
import vr.h;
import ym.o;

/* JADX INFO: renamed from: oo.a, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u0000 (2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003:\u0003)\u0010\u000eB#\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\r2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006*"}, d2 = {"Loo/a;", "Lym/o;", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "Lvr/h;", "Landroid/content/Context;", "context", "Lfn/x;", "governmentIdFeed", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "side", "<init>", "(Landroid/content/Context;Lfn/x;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)V", "otherWorker", "", "b", "(Lym/o;)Z", "c", "(Lvr/h;)Z", "Lnu/h;", "run", "()Lnu/h;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lfn/j0;", "it", "Loo/a$c;", "f", "(Lfn/j0;)Loo/a$c;", "Landroid/content/Context;", "Lfn/x;", "d", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "e", "a", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GovernmentIdHintWorker implements o<Hint>, h<Hint> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final x governmentIdFeed;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final IdConfig.b side;

    /* JADX INFO: renamed from: oo.a$b */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Loo/a$b;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "side", "Loo/a;", "a", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Loo/a;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {
        @NotNull
        GovernmentIdHintWorker a(@NotNull IdConfig.b side);
    }

    /* JADX INFO: renamed from: oo.a$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Loo/a$c;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "hint", "", "minDurationMs", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "()Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "b", "J", "()J", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class HintEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final Hint hint;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final long minDurationMs;

        public HintEvent(@NotNull Hint hint, long j10) {
            Intrinsics.checkNotNullParameter(hint, "hint");
            this.hint = hint;
            this.minDurationMs = j10;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Hint getHint() {
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

    /* JADX INFO: renamed from: oo.a$d */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnu/i;", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "", "<anonymous>", "(Lnu/i;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker$run$1", f = "GovernmentIdHintWorker.kt", l = {98}, m = "invokeSuspend")
    public static final class d extends m implements Function2<i<? super Hint>, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f27554t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f27555u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ nu.h<HintEvent> f27556v;

        /* JADX INFO: renamed from: oo.a$d$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0476a<T> implements i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i<Hint> f27557a;

            /* JADX INFO: renamed from: oo.a$d$a$a, reason: collision with other inner class name */
            @f(c = "com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker$run$1$1", f = "GovernmentIdHintWorker.kt", l = {99, 100}, m = "emit")
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0477a extends pt.d {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public Object f27558t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public /* synthetic */ Object f27559u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ C0476a<T> f27560v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public int f27561w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0477a(C0476a<? super T> c0476a, nt.b<? super C0477a> bVar) {
                    super(bVar);
                    this.f27560v = c0476a;
                }

                @Override // pt.a
                public final Object invokeSuspend(Object obj) {
                    this.f27559u = obj;
                    this.f27561w |= Integer.MIN_VALUE;
                    return this.f27560v.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0476a(i<? super Hint> iVar) {
                this.f27557a = iVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
            
                if (ku.z0.b(r4, r0) == r1) goto L28;
             */
            @Override // nu.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(oo.GovernmentIdHintWorker.HintEvent r9, nt.b<? super kotlin.Unit> r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof oo.GovernmentIdHintWorker.d.C0476a.C0477a
                    if (r0 == 0) goto L13
                    r0 = r10
                    oo.a$d$a$a r0 = (oo.GovernmentIdHintWorker.d.C0476a.C0477a) r0
                    int r1 = r0.f27561w
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f27561w = r1
                    goto L18
                L13:
                    oo.a$d$a$a r0 = new oo.a$d$a$a
                    r0.<init>(r8, r10)
                L18:
                    java.lang.Object r10 = r0.f27559u
                    java.lang.Object r1 = ot.c.e()
                    int r2 = r0.f27561w
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L40
                    if (r2 == r4) goto L38
                    if (r2 != r3) goto L30
                    java.lang.Object r9 = r0.f27558t
                    oo.a$c r9 = (oo.GovernmentIdHintWorker.HintEvent) r9
                    jt.o.b(r10)
                    goto L76
                L30:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L38:
                    java.lang.Object r9 = r0.f27558t
                    oo.a$c r9 = (oo.GovernmentIdHintWorker.HintEvent) r9
                    jt.o.b(r10)
                    goto L58
                L40:
                    jt.o.b(r10)
                    nu.i<com.withpersona.sdk2.inquiry.governmentid.live_hint.Hint> r10 = r8.f27557a
                    if (r9 == 0) goto L4c
                    com.withpersona.sdk2.inquiry.governmentid.live_hint.Hint r2 = r9.getHint()
                    goto L4d
                L4c:
                    r2 = 0
                L4d:
                    r0.f27558t = r9
                    r0.f27561w = r4
                    java.lang.Object r10 = r10.emit(r2, r0)
                    if (r10 != r1) goto L58
                    goto L75
                L58:
                    if (r9 == 0) goto L5f
                    long r4 = r9.getMinDurationMs()
                    goto L61
                L5f:
                    r4 = 0
                L61:
                    r6 = 33
                    long r4 = kotlin.ranges.d.d(r4, r6)
                    java.lang.Object r9 = pt.l.a(r9)
                    r0.f27558t = r9
                    r0.f27561w = r3
                    java.lang.Object r9 = ku.z0.b(r4, r0)
                    if (r9 != r1) goto L76
                L75:
                    return r1
                L76:
                    kotlin.Unit r9 = kotlin.Unit.f22483a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: oo.GovernmentIdHintWorker.d.C0476a.emit(oo.a$c, nt.b):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(nu.h<HintEvent> hVar, nt.b<? super d> bVar) {
            super(2, bVar);
            this.f27556v = hVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            d dVar = new d(this.f27556v, bVar);
            dVar.f27555u = obj;
            return dVar;
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            i iVar = (i) this.f27555u;
            Object objE = ot.c.e();
            int i10 = this.f27554t;
            if (i10 == 0) {
                jt.o.b(obj);
                nu.h hVarK = j.k(this.f27556v);
                C0476a c0476a = new C0476a(iVar);
                this.f27555u = l.a(iVar);
                this.f27554t = 1;
                if (hVarK.collect(c0476a, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super Hint> iVar, nt.b<? super Unit> bVar) {
            return ((d) create(iVar, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    /* JADX INFO: renamed from: oo.a$e */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnu/i;", "Loo/a$c;", "", "<anonymous>", "(Lnu/i;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker$run$hintFlow$1", f = "GovernmentIdHintWorker.kt", l = {82}, m = "invokeSuspend")
    public static final class e extends m implements Function2<i<? super HintEvent>, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f27562t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f27563u;

        /* JADX INFO: renamed from: oo.a$e$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0478a<T> implements i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i<HintEvent> f27565a;
            public final /* synthetic */ GovernmentIdHintWorker b;

            /* JADX WARN: Multi-variable type inference failed */
            public C0478a(i<? super HintEvent> iVar, GovernmentIdHintWorker governmentIdHintWorker) {
                this.f27565a = iVar;
                this.b = governmentIdHintWorker;
            }

            @Override // nu.i
            public final Object emit(Object obj, nt.b<? super Unit> bVar) {
                Object value = ((n) obj).getValue();
                i<HintEvent> iVar = this.f27565a;
                GovernmentIdHintWorker governmentIdHintWorker = this.b;
                if (n.e(value) == null) {
                    Object objEmit = iVar.emit(governmentIdHintWorker.f((j0) value), bVar);
                    if (objEmit == ot.c.e()) {
                        return objEmit;
                    }
                } else {
                    Object objEmit2 = iVar.emit(null, bVar);
                    if (objEmit2 == ot.c.e()) {
                        return objEmit2;
                    }
                }
                return Unit.f22483a;
            }
        }

        public e(nt.b<? super e> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            e eVar = GovernmentIdHintWorker.this.new e(bVar);
            eVar.f27563u = obj;
            return eVar;
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            i iVar = (i) this.f27563u;
            Object objE = ot.c.e();
            int i10 = this.f27562t;
            if (i10 == 0) {
                jt.o.b(obj);
                x xVar = GovernmentIdHintWorker.this.governmentIdFeed;
                C0478a c0478a = new C0478a(iVar, GovernmentIdHintWorker.this);
                this.f27563u = l.a(iVar);
                this.f27562t = 1;
                if (xVar.collect(c0478a, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
            }
            throw new jt.d();
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super HintEvent> iVar, nt.b<? super Unit> bVar) {
            return ((e) create(iVar, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public GovernmentIdHintWorker(@NotNull Context context, @NotNull x governmentIdFeed, @NotNull IdConfig.b side) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(governmentIdFeed, "governmentIdFeed");
        Intrinsics.checkNotNullParameter(side, "side");
        this.context = context;
        this.governmentIdFeed = governmentIdFeed;
        this.side = side;
    }

    @Override // vr.h
    public boolean a(@NotNull h<?> hVar) {
        return super.a(hVar);
    }

    @Override // ym.o
    public boolean b(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof GovernmentIdHintWorker) && ((GovernmentIdHintWorker) otherWorker).side == this.side;
    }

    @Override // vr.h
    public boolean c(@NotNull h<?> otherWorker) {
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

    public final HintEvent f(j0 it) {
        if (it instanceof j0.ParsedIdSide) {
            return new HintEvent(HoldStillHint.f10924a, 1000L);
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
        return new HintEvent(LowLightHint.f10925a, 1000L);
    }

    public int hashCode() {
        return (((this.context.hashCode() * 31) + this.governmentIdFeed.hashCode()) * 31) + this.side.hashCode();
    }

    @Override // ym.o, vr.h
    @NotNull
    public nu.h<Hint> run() {
        return j.m(j.w(new d(j.w(new e(null)), null)));
    }

    @NotNull
    public String toString() {
        return "GovernmentIdHintWorker(context=" + this.context + ", governmentIdFeed=" + this.governmentIdFeed + ", side=" + this.side + ")";
    }
}
