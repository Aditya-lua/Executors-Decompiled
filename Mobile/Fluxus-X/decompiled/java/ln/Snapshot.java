package ln;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ln.i, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 \u00172\u00020\u0001:\u0001\u0011B\u0017\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0016\u001a\u00020\u00038GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0018"}, d2 = {"Lln/i;", BuildConfig.FLAVOR, "Lkotlin/Function0;", "Lew/h;", "toByteString", "<init>", "(Lkotlin/jvm/functions/Function0;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", BuildConfig.FLAVOR, "hashCode", "()I", "a", "Lkotlin/jvm/functions/Function0;", "b", "Lzt/h;", "()Lew/h;", "bytes", "c", "wf1-workflow-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class Snapshot {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<ew.h> toByteString;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final zt.h bytes;

    /* JADX INFO: renamed from: ln.i$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lln/i$a;", BuildConfig.FLAVOR, "<init>", "()V", "Lew/h;", "byteString", "Lln/i;", "a", "(Lew/h;)Lln/i;", "Lkotlin/Function0;", "lazy", "b", "(Lkotlin/jvm/functions/Function0;)Lln/i;", "Lkotlin/Function1;", "Lew/f;", BuildConfig.FLAVOR, "c", "(Lkotlin/jvm/functions/Function1;)Lln/i;", "wf1-workflow-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: ln.i$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lew/h;", "b", "()Lew/h;"}, k = 3, mv = {1, 6, 0})
        public static final class C0436a extends p001kotlin.jvm.internal.m implements Function0<ew.h> {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ ew.h f22330i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0436a(ew.h hVar) {
                super(0);
                this.f22330i = hVar;
            }

            @Override // p001kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ew.h invoke() {
                return this.f22330i;
            }
        }

        /* JADX INFO: renamed from: ln.i$a$b */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lew/h;", "b", "()Lew/h;"}, k = 3, mv = {1, 6, 0})
        public static final class b extends p001kotlin.jvm.internal.m implements Function0<ew.h> {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ Function1<ew.f, Unit> f22331i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(Function1<? super ew.f, Unit> function1) {
                super(0);
                this.f22331i = function1;
            }

            @Override // p001kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ew.h invoke() {
                ew.e eVar = new ew.e();
                this.f22331i.invoke(eVar);
                return eVar.J2();
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Snapshot a(@NotNull ew.h byteString) {
            Intrinsics.checkNotNullParameter(byteString, "byteString");
            return new Snapshot(new C0436a(byteString), null);
        }

        @NotNull
        public final Snapshot b(@NotNull Function0<? extends ew.h> lazy) {
            Intrinsics.checkNotNullParameter(lazy, "lazy");
            return new Snapshot(lazy, null);
        }

        @NotNull
        public final Snapshot c(@NotNull Function1<? super ew.f, Unit> lazy) {
            Intrinsics.checkNotNullParameter(lazy, "lazy");
            return b(new b(lazy));
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: ln.i$b */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lew/h;", "b", "()Lew/h;"}, k = 3, mv = {1, 6, 0})
    public static final class b extends p001kotlin.jvm.internal.m implements Function0<ew.h> {
        public b() {
            super(0);
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ew.h invoke() {
            return (ew.h) Snapshot.this.toByteString.invoke();
        }
    }

    public /* synthetic */ Snapshot(Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0);
    }

    @NotNull
    public final ew.h b() {
        return (ew.h) this.bytes.getValue();
    }

    public boolean equals(@Nullable Object other) {
        Snapshot snapshot = other instanceof Snapshot ? (Snapshot) other : null;
        if (snapshot == null) {
            return false;
        }
        return Intrinsics.c(b(), snapshot.b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    @NotNull
    public String toString() {
        return "Snapshot(" + b() + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Snapshot(Function0<? extends ew.h> function0) {
        this.toByteString = function0;
        this.bytes = zt.i.a(new b());
    }
}
