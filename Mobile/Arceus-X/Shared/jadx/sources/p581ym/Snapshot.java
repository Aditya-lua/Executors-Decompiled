package p581ym;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7746m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7342i;
import p229jt.InterfaceC7341h;
import p560xu.C12924e;
import p560xu.C12930h;
import p560xu.InterfaceC12926f;

/* JADX INFO: renamed from: ym.i, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 \u00172\u00020\u0001:\u0001\u0011B\u0017\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0016\u001a\u00020\u00038GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0018"}, m31665d2 = {"Lym/i;", "", "Lkotlin/Function0;", "Lxu/h;", "toByteString", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lkotlin/jvm/functions/Function0;", "b", "Ljt/h;", "()Lxu/h;", "bytes", "c", "wf1-workflow-core"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class Snapshot {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Function0<C12930h> toByteString;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h bytes;

    /* JADX INFO: renamed from: ym.i$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m31665d2 = {"Lym/i$a;", "", "<init>", "()V", "Lxu/h;", "byteString", "Lym/i;", "b", "(Lxu/h;)Lym/i;", "Lkotlin/Function0;", "lazy", "a", "(Lkotlin/jvm/functions/Function0;)Lym/i;", "Lkotlin/Function1;", "Lxu/f;", "", "c", "(Lkotlin/jvm/functions/Function1;)Lym/i;", "wf1-workflow-core"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: ym.i$a$a, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m31665d2 = {"Lxu/h;", "b", "()Lxu/h;"}, m31666k = 3, m31667mv = {1, 6, 0})
        public static final class C14289a extends AbstractC7746m implements Function0<C12930h> {

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ C12930h f46518i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14289a(C12930h c12930h) {
                super(0);
                this.f46518i = c12930h;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C12930h invoke() {
                return this.f46518i;
            }
        }

        /* JADX INFO: renamed from: ym.i$a$b */
        @Metadata(m31664d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m31665d2 = {"Lxu/h;", "b", "()Lxu/h;"}, m31666k = 3, m31667mv = {1, 6, 0})
        public static final class b extends AbstractC7746m implements Function0<C12930h> {

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ Function1<InterfaceC12926f, Unit> f46519i;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super xu.f, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(Function1<? super InterfaceC12926f, Unit> function1) {
                super(0);
                this.f46519i = function1;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C12930h invoke() {
                C12924e c12924e = new C12924e();
                this.f46519i.invoke(c12924e);
                return c12924e.mo47997F2();
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: ym.i.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Snapshot m48871a(@NotNull Function0<? extends C12930h> lazy) {
            Intrinsics.checkNotNullParameter(lazy, "lazy");
            return new Snapshot(lazy, null);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Snapshot m48872b(@NotNull C12930h byteString) {
            Intrinsics.checkNotNullParameter(byteString, "byteString");
            return new Snapshot(new C14289a(byteString), null);
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final Snapshot m48873c(@NotNull Function1<? super InterfaceC12926f, Unit> lazy) {
            Intrinsics.checkNotNullParameter(lazy, "lazy");
            return m48871a(new b(lazy));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: ym.i$b */
    @Metadata(m31664d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m31665d2 = {"Lxu/h;", "b", "()Lxu/h;"}, m31666k = 3, m31667mv = {1, 6, 0})
    public static final class b extends AbstractC7746m implements Function0<C12930h> {
        public b() {
            super(0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C12930h invoke() {
            return (C12930h) Snapshot.this.toByteString.invoke();
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 kotlin.jvm.functions.Function0) A[MD:(kotlin.jvm.functions.Function0<? extends xu.h>):void (m)] (LINE:1) call: ym.i.<init>(kotlin.jvm.functions.Function0):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ Snapshot(Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final C12930h m48870b() {
        return (C12930h) this.bytes.getValue();
    }

    public boolean equals(@Nullable Object other) {
        Snapshot snapshot = other instanceof Snapshot ? (Snapshot) other : null;
        if (snapshot == null) {
            return false;
        }
        return Intrinsics.m31980c(m48870b(), snapshot.m48870b());
    }

    public int hashCode() {
        return m48870b().hashCode();
    }

    @NotNull
    public String toString() {
        return "Snapshot(" + m48870b() + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function0<? extends xu.h> */
    /* JADX WARN: Multi-variable type inference failed */
    public Snapshot(Function0<? extends C12930h> function0) {
        this.toByteString = function0;
        this.bytes = C7342i.m30456b(new b());
    }
}
