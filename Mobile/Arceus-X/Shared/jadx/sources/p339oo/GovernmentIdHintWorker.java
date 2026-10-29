package p339oo;

import android.content.Context;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.withpersona.sdk2.camera.ImageLightCondition;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.Hint;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.HoldStillHint;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.LowLightHint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import nu.C9579j;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p132fn.C5717x;
import p132fn.InterfaceC5690j0;
import p229jt.C7334d;
import p229jt.C7347n;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p499vr.InterfaceC12257h;
import p581ym.InterfaceC13222o;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: oo.a, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u0000 (2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003:\u0003)\u0010\u000eB#\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\r2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006*"}, m31665d2 = {"Loo/a;", "Lym/o;", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "Lvr/h;", "Landroid/content/Context;", "context", "Lfn/x;", "governmentIdFeed", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "side", "<init>", "(Landroid/content/Context;Lfn/x;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)V", "otherWorker", "", "b", "(Lym/o;)Z", "c", "(Lvr/h;)Z", "Lnu/h;", "run", "()Lnu/h;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lfn/j0;", "it", "Loo/a$c;", "f", "(Lfn/j0;)Loo/a$c;", "Landroid/content/Context;", "Lfn/x;", "d", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "e", "a", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class GovernmentIdHintWorker implements InterfaceC13222o<Hint>, InterfaceC12257h<Hint> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    public final C5717x governmentIdFeed;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final IdConfig.EnumC3514b side;

    /* JADX INFO: renamed from: oo.a$b */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m31665d2 = {"Loo/a$b;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "side", "Loo/a;", "a", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Loo/a;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface b {
        @NotNull
        /* JADX INFO: renamed from: a */
        GovernmentIdHintWorker mo38708a(@NotNull IdConfig.EnumC3514b side);
    }

    /* JADX INFO: renamed from: oo.a$c, reason: from toString */
    @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m31665d2 = {"Loo/a$c;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "hint", "", "minDurationMs", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "()Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "b", "J", "()J", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class HintEvent {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
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
            return Intrinsics.m31980c(this.hint, hintEvent.hint) && this.minDurationMs == hintEvent.minDurationMs;
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
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lnu/i;", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker$run$1", m39664f = "GovernmentIdHintWorker.kt", m39665l = {98}, m39666m = "invokeSuspend")
    public static final class d extends AbstractC10351m implements Function2<InterfaceC9577i<? super Hint>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f35651t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f35652u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ InterfaceC9575h<HintEvent> f35653v;

        /* JADX INFO: renamed from: oo.a$d$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC9577i<Hint> f35654a;

            /* JADX INFO: renamed from: oo.a$d$a$a, reason: collision with other inner class name */
            @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker$run$1$1", m39664f = "GovernmentIdHintWorker.kt", m39665l = {99, 100}, m39666m = "emit")
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C14220a extends AbstractC10342d {

                /* JADX INFO: renamed from: t */
                public Object f35655t;

                /* JADX INFO: renamed from: u */
                public /* synthetic */ Object f35656u;

                /* JADX INFO: renamed from: v */
                public final /* synthetic */ a<T> f35657v;

                /* JADX INFO: renamed from: w */
                public int f35658w;

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: oo.a$d$a<? super T> */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C14220a(a<? super T> aVar, InterfaceC9557b<? super C14220a> interfaceC9557b) {
                    super(interfaceC9557b);
                    this.f35657v = aVar;
                }

                @Override // pt.AbstractC10339a
                public final Object invokeSuspend(Object obj) {
                    this.f35656u = obj;
                    this.f35658w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    return this.f35657v.emit(null, this);
                }
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: nu.i<? super com.withpersona.sdk2.inquiry.governmentid.live_hint.Hint> */
            /* JADX WARN: Multi-variable type inference failed */
            public a(InterfaceC9577i<? super Hint> interfaceC9577i) {
                this.f35654a = interfaceC9577i;
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object; */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
            
                if (p256ku.C7946z0.m32938b(r4, r0) == r1) goto L28;
             */
            @Override // nu.InterfaceC9577i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(HintEvent hintEvent, InterfaceC9557b<? super Unit> interfaceC9557b) {
                C14220a c14220a;
                if (interfaceC9557b instanceof C14220a) {
                    c14220a = (C14220a) interfaceC9557b;
                    int i10 = c14220a.f35658w;
                    if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                        c14220a.f35658w = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    } else {
                        c14220a = new C14220a(this, interfaceC9557b);
                    }
                } else {
                    c14220a = new C14220a(this, interfaceC9557b);
                }
                Object obj = c14220a.f35656u;
                Object objM38805e = C10047c.m38805e();
                int i11 = c14220a.f35658w;
                if (i11 == 0) {
                    C7348o.m30470b(obj);
                    InterfaceC9577i<Hint> interfaceC9577i = this.f35654a;
                    Hint hint = hintEvent != null ? hintEvent.getHint() : null;
                    c14220a.f35655t = hintEvent;
                    c14220a.f35658w = 1;
                    if (interfaceC9577i.emit(hint, c14220a) != objM38805e) {
                    }
                    return objM38805e;
                }
                if (i11 == 1) {
                    hintEvent = (HintEvent) c14220a.f35655t;
                    C7348o.m30470b(obj);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                return Unit.f29331a;
                long jM32079d = C7764d.m32079d(hintEvent != null ? hintEvent.getMinDurationMs() : 0L, 33L);
                c14220a.f35655t = C10350l.m39676a(hintEvent);
                c14220a.f35658w = 2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC9575h<HintEvent> interfaceC9575h, InterfaceC9557b<? super d> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f35653v = interfaceC9575h;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            d dVar = new d(this.f35653v, interfaceC9557b);
            dVar.f35652u = obj;
            return dVar;
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            InterfaceC9577i interfaceC9577i = (InterfaceC9577i) this.f35652u;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f35651t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9575h interfaceC9575hM37794k = C9579j.m37794k(this.f35653v);
                a aVar = new a(interfaceC9577i);
                this.f35652u = C10350l.m39676a(interfaceC9577i);
                this.f35651t = 1;
                if (interfaceC9575hM37794k.collect(aVar, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9577i<? super Hint> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((d) create(interfaceC9577i, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: oo.a$e */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lnu/i;", "Loo/a$c;", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker$run$hintFlow$1", m39664f = "GovernmentIdHintWorker.kt", m39665l = {82}, m39666m = "invokeSuspend")
    public static final class e extends AbstractC10351m implements Function2<InterfaceC9577i<? super HintEvent>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f35659t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f35660u;

        /* JADX INFO: renamed from: oo.a$e$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC9577i<HintEvent> f35662a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ GovernmentIdHintWorker f35663b;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: nu.i<? super oo.a$c> */
            /* JADX WARN: Multi-variable type inference failed */
            public a(InterfaceC9577i<? super HintEvent> interfaceC9577i, GovernmentIdHintWorker governmentIdHintWorker) {
                this.f35662a = interfaceC9577i;
                this.f35663b = governmentIdHintWorker;
            }

            @Override // nu.InterfaceC9577i
            public final Object emit(Object obj, InterfaceC9557b<? super Unit> interfaceC9557b) {
                Object value = ((C7347n) obj).getValue();
                InterfaceC9577i<HintEvent> interfaceC9577i = this.f35662a;
                GovernmentIdHintWorker governmentIdHintWorker = this.f35663b;
                if (C7347n.m30463e(value) == null) {
                    Object objEmit = interfaceC9577i.emit(governmentIdHintWorker.m38707f((InterfaceC5690j0) value), interfaceC9557b);
                    if (objEmit == C10047c.m38805e()) {
                        return objEmit;
                    }
                } else {
                    Object objEmit2 = interfaceC9577i.emit(null, interfaceC9557b);
                    if (objEmit2 == C10047c.m38805e()) {
                        return objEmit2;
                    }
                }
                return Unit.f29331a;
            }
        }

        public e(InterfaceC9557b<? super e> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            e eVar = GovernmentIdHintWorker.this.new e(interfaceC9557b);
            eVar.f35660u = obj;
            return eVar;
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            InterfaceC9577i interfaceC9577i = (InterfaceC9577i) this.f35660u;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f35659t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C5717x c5717x = GovernmentIdHintWorker.this.governmentIdFeed;
                a aVar = new a(interfaceC9577i, GovernmentIdHintWorker.this);
                this.f35660u = C10350l.m39676a(interfaceC9577i);
                this.f35659t = 1;
                if (c5717x.collect(aVar, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            throw new C7334d();
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9577i<? super HintEvent> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((e) create(interfaceC9577i, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public GovernmentIdHintWorker(@NotNull Context context, @NotNull C5717x governmentIdFeed, @NotNull IdConfig.EnumC3514b side) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(governmentIdFeed, "governmentIdFeed");
        Intrinsics.checkNotNullParameter(side, "side");
        this.context = context;
        this.governmentIdFeed = governmentIdFeed;
        this.side = side;
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
        return (otherWorker instanceof GovernmentIdHintWorker) && ((GovernmentIdHintWorker) otherWorker).side == this.side;
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: c */
    public boolean mo7574c(@NotNull InterfaceC12257h<?> otherWorker) {
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
        return Intrinsics.m31980c(this.context, governmentIdHintWorker.context) && Intrinsics.m31980c(this.governmentIdFeed, governmentIdHintWorker.governmentIdFeed) && this.side == governmentIdHintWorker.side;
    }

    /* JADX INFO: renamed from: f */
    public final HintEvent m38707f(InterfaceC5690j0 it) {
        if (it instanceof InterfaceC5690j0.ParsedIdSide) {
            return new HintEvent(HoldStillHint.f14108a, 1000L);
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
        return new HintEvent(LowLightHint.f14109a, 1000L);
    }

    public int hashCode() {
        return (((this.context.hashCode() * 31) + this.governmentIdFeed.hashCode()) * 31) + this.side.hashCode();
    }

    @Override // p581ym.InterfaceC13222o, p499vr.InterfaceC12257h
    @NotNull
    public InterfaceC9575h<Hint> run() {
        return C9579j.m37796m(C9579j.m37806w(new d(C9579j.m37806w(new e(null)), null)));
    }

    @NotNull
    public String toString() {
        return "GovernmentIdHintWorker(context=" + this.context + ", governmentIdFeed=" + this.governmentIdFeed + ", side=" + this.side + ")";
    }
}
