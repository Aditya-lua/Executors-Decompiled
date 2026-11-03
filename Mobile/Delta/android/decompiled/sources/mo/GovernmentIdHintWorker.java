package mo;

import android.content.Context;
import com.withpersona.sdk2.camera.ImageLightCondition;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.Hint;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.HoldStillHint;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.LowLightHint;
import dn.j0;
import dn.x;
import gt.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lu.i;
import lu.j;
import nt.f;
import nt.l;
import nt.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tr.h;
import wm.o;

/* JADX INFO: renamed from: mo.a, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u0000 )2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003:\u0003\u0010\u000e$B#\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\r2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lmo/a;", "Lwm/o;", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "Ltr/h;", "Landroid/content/Context;", "context", "Ldn/x;", "governmentIdFeed", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "side", "<init>", "(Landroid/content/Context;Ldn/x;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)V", "otherWorker", "", "c", "(Lwm/o;)Z", "a", "(Ltr/h;)Z", "Llu/h;", "run", "()Llu/h;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ldn/j0;", "it", "Lmo/a$c;", "f", "(Ldn/j0;)Lmo/a$c;", "b", "Landroid/content/Context;", "Ldn/x;", "d", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "e", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    /* JADX INFO: renamed from: mo.a$b */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lmo/a$b;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "side", "Lmo/a;", "a", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lmo/a;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {
        @NotNull
        GovernmentIdHintWorker a(@NotNull IdConfig.b side);
    }

    /* JADX INFO: renamed from: mo.a$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lmo/a$c;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "hint", "", "minDurationMs", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "()Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "b", "J", "()J", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    /* JADX INFO: renamed from: mo.a$d */
    @f(c = "com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker$run$1", f = "GovernmentIdHintWorker.kt", l = {98}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llu/i;", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "", "<anonymous>", "(Llu/i;)V"}, k = 3, mv = {2, 2, 0})
    public static final class d extends m implements Function2<i<? super Hint>, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f24943t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f24944u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ lu.h<HintEvent> f24945v;

        /* JADX INFO: renamed from: mo.a$d$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0442a<T> implements i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i<Hint> f24946a;

            /* JADX INFO: renamed from: mo.a$d$a$a, reason: collision with other inner class name */
            @f(c = "com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker$run$1$1", f = "GovernmentIdHintWorker.kt", l = {99, 100}, m = "emit")
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0443a extends nt.d {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public Object f24947t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public /* synthetic */ Object f24948u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ C0442a<T> f24949v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public int f24950w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0443a(C0442a<? super T> c0442a, lt.b<? super C0443a> bVar) {
                    super(bVar);
                    this.f24949v = c0442a;
                }

                @Override // nt.a
                public final Object invokeSuspend(Object obj) {
                    this.f24948u = obj;
                    this.f24950w |= Integer.MIN_VALUE;
                    return this.f24949v.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0442a(i<? super Hint> iVar) {
                this.f24946a = iVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
            
                if (iu.z0.b(r4, r0) == r1) goto L28;
             */
            @Override // lu.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(mo.GovernmentIdHintWorker.HintEvent r9, lt.b<? super kotlin.Unit> r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof mo.GovernmentIdHintWorker.d.C0442a.C0443a
                    if (r0 == 0) goto L13
                    r0 = r10
                    mo.a$d$a$a r0 = (mo.GovernmentIdHintWorker.d.C0442a.C0443a) r0
                    int r1 = r0.f24950w
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f24950w = r1
                    goto L18
                L13:
                    mo.a$d$a$a r0 = new mo.a$d$a$a
                    r0.<init>(r8, r10)
                L18:
                    java.lang.Object r10 = r0.f24948u
                    java.lang.Object r1 = mt.c.e()
                    int r2 = r0.f24950w
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L40
                    if (r2 == r4) goto L38
                    if (r2 != r3) goto L30
                    java.lang.Object r9 = r0.f24947t
                    mo.a$c r9 = (mo.GovernmentIdHintWorker.HintEvent) r9
                    gt.o.b(r10)
                    goto L76
                L30:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L38:
                    java.lang.Object r9 = r0.f24947t
                    mo.a$c r9 = (mo.GovernmentIdHintWorker.HintEvent) r9
                    gt.o.b(r10)
                    goto L58
                L40:
                    gt.o.b(r10)
                    lu.i<com.withpersona.sdk2.inquiry.governmentid.live_hint.Hint> r10 = r8.f24946a
                    if (r9 == 0) goto L4c
                    com.withpersona.sdk2.inquiry.governmentid.live_hint.Hint r2 = r9.getHint()
                    goto L4d
                L4c:
                    r2 = 0
                L4d:
                    r0.f24947t = r9
                    r0.f24950w = r4
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
                    java.lang.Object r9 = nt.l.a(r9)
                    r0.f24947t = r9
                    r0.f24950w = r3
                    java.lang.Object r9 = iu.z0.b(r4, r0)
                    if (r9 != r1) goto L76
                L75:
                    return r1
                L76:
                    kotlin.Unit r9 = kotlin.Unit.f22938a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: mo.GovernmentIdHintWorker.d.C0442a.emit(mo.a$c, lt.b):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(lu.h<HintEvent> hVar, lt.b<? super d> bVar) {
            super(2, bVar);
            this.f24945v = hVar;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            d dVar = new d(this.f24945v, bVar);
            dVar.f24944u = obj;
            return dVar;
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            i iVar = (i) this.f24944u;
            Object objE = mt.c.e();
            int i10 = this.f24943t;
            if (i10 == 0) {
                gt.o.b(obj);
                lu.h hVarK = j.k(this.f24945v);
                C0442a c0442a = new C0442a(iVar);
                this.f24944u = l.a(iVar);
                this.f24943t = 1;
                if (hVarK.collect(c0442a, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            return Unit.f22938a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super Hint> iVar, lt.b<? super Unit> bVar) {
            return ((d) create(iVar, bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    /* JADX INFO: renamed from: mo.a$e */
    @f(c = "com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker$run$hintFlow$1", f = "GovernmentIdHintWorker.kt", l = {82}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llu/i;", "Lmo/a$c;", "", "<anonymous>", "(Llu/i;)V"}, k = 3, mv = {2, 2, 0})
    public static final class e extends m implements Function2<i<? super HintEvent>, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f24951t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f24952u;

        /* JADX INFO: renamed from: mo.a$e$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0444a<T> implements i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i<HintEvent> f24954a;
            public final /* synthetic */ GovernmentIdHintWorker b;

            /* JADX WARN: Multi-variable type inference failed */
            public C0444a(i<? super HintEvent> iVar, GovernmentIdHintWorker governmentIdHintWorker) {
                this.f24954a = iVar;
                this.b = governmentIdHintWorker;
            }

            @Override // lu.i
            public final Object emit(Object obj, lt.b<? super Unit> bVar) {
                Object value = ((n) obj).getValue();
                i<HintEvent> iVar = this.f24954a;
                GovernmentIdHintWorker governmentIdHintWorker = this.b;
                if (n.e(value) == null) {
                    Object objEmit = iVar.emit(governmentIdHintWorker.f((j0) value), bVar);
                    if (objEmit == mt.c.e()) {
                        return objEmit;
                    }
                } else {
                    Object objEmit2 = iVar.emit(null, bVar);
                    if (objEmit2 == mt.c.e()) {
                        return objEmit2;
                    }
                }
                return Unit.f22938a;
            }
        }

        public e(lt.b<? super e> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            e eVar = GovernmentIdHintWorker.this.new e(bVar);
            eVar.f24952u = obj;
            return eVar;
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            i iVar = (i) this.f24952u;
            Object objE = mt.c.e();
            int i10 = this.f24951t;
            if (i10 == 0) {
                gt.o.b(obj);
                x xVar = GovernmentIdHintWorker.this.governmentIdFeed;
                C0444a c0444a = new C0444a(iVar, GovernmentIdHintWorker.this);
                this.f24952u = l.a(iVar);
                this.f24951t = 1;
                if (xVar.collect(c0444a, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            throw new gt.d();
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super HintEvent> iVar, lt.b<? super Unit> bVar) {
            return ((e) create(iVar, bVar)).invokeSuspend(Unit.f22938a);
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

    @Override // tr.h
    public boolean a(@NotNull h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof GovernmentIdHintWorker) && ((GovernmentIdHintWorker) otherWorker).side == this.side;
    }

    @Override // tr.h
    public boolean b(@NotNull h<?> hVar) {
        return super.b(hVar);
    }

    @Override // wm.o
    public boolean c(@NotNull o<?> otherWorker) {
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
            return new HintEvent(HoldStillHint.f11005a, 1000L);
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
        return new HintEvent(LowLightHint.f11006a, 1000L);
    }

    public int hashCode() {
        return (((this.context.hashCode() * 31) + this.governmentIdFeed.hashCode()) * 31) + this.side.hashCode();
    }

    @Override // wm.o, tr.h
    @NotNull
    public lu.h<Hint> run() {
        return j.m(j.w(new d(j.w(new e(null)), null)));
    }

    @NotNull
    public String toString() {
        return "GovernmentIdHintWorker(context=" + this.context + ", governmentIdFeed=" + this.governmentIdFeed + ", side=" + this.side + ")";
    }
}
