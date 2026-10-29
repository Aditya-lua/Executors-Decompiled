package kotlin.time;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlin.time.c */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0016B\u0019\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012¨\u0006\u001d"}, m31665d2 = {"Lkotlin/time/c;", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "epochSeconds", "", "nanosecondsOfSecond", "<init>", "(JI)V", "other", "c", "(Lkotlin/time/c;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "d", "()J", "b", "I", "e", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7802c implements Comparable<C7802c>, Serializable {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final C7802c f29590d = new C7802c(-31557014167219200L, 0);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final C7802c f29591e = new C7802c(31556889864403199L, 999999999);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final long epochSeconds;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int nanosecondsOfSecond;

    /* JADX INFO: renamed from: kotlin.time.c$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, m31665d2 = {"Lkotlin/time/c$a;", "", "<init>", "()V", "", "epochSeconds", "nanosecondAdjustment", "Lkotlin/time/c;", "b", "(JJ)Lkotlin/time/c;", "", "a", "(JI)Lkotlin/time/c;", "", "input", "e", "(Ljava/lang/CharSequence;)Lkotlin/time/c;", "MIN", "Lkotlin/time/c;", "d", "()Lkotlin/time/c;", "MAX", "c", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: kotlin.time.c.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C7802c m32378a(long epochSeconds, int nanosecondAdjustment) {
            return m32379b(epochSeconds, nanosecondAdjustment);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final C7802c m32379b(long epochSeconds, long nanosecondAdjustment) {
            long j10 = nanosecondAdjustment / 1000000000;
            if ((nanosecondAdjustment ^ 1000000000) < 0 && j10 * 1000000000 != nanosecondAdjustment) {
                j10--;
            }
            long j11 = epochSeconds + j10;
            if ((epochSeconds ^ j11) < 0 && (j10 ^ epochSeconds) >= 0) {
                return epochSeconds > 0 ? C7802c.INSTANCE.m32380c() : C7802c.INSTANCE.m32381d();
            }
            if (j11 < -31557014167219200L) {
                return m32381d();
            }
            if (j11 > 31556889864403199L) {
                return m32380c();
            }
            long j12 = nanosecondAdjustment % 1000000000;
            return new C7802c(j11, (int) (j12 + ((((j12 ^ 1000000000) & ((-j12) | j12)) >> 63) & 1000000000)));
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final C7802c m32380c() {
            return C7802c.f29591e;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final C7802c m32381d() {
            return C7802c.f29590d;
        }

        /* JADX DEBUG: Class process forced to load method for inline: kotlin.time.d.h(java.lang.CharSequence):kotlin.time.e */
        @NotNull
        /* JADX INFO: renamed from: e */
        public final C7802c m32382e(@NotNull CharSequence input) {
            Intrinsics.checkNotNullParameter(input, "input");
            return C7803d.m32396n(input).toInstant();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    public C7802c(long j10, int i10) {
        this.epochSeconds = j10;
        this.nanosecondsOfSecond = i10;
        if (-31557014167219200L > j10 || j10 >= 31556889864403200L) {
            throw new IllegalArgumentException("Instant exceeds minimum or maximum instant");
        }
    }

    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull C7802c other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM31984g = Intrinsics.m31984g(this.epochSeconds, other.epochSeconds);
        return iM31984g != 0 ? iM31984g : Intrinsics.m31983f(this.nanosecondsOfSecond, other.nanosecondsOfSecond);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getEpochSeconds() {
        return this.epochSeconds;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getNanosecondsOfSecond() {
        return this.nanosecondsOfSecond;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C7802c)) {
            return false;
        }
        C7802c c7802c = (C7802c) other;
        return this.epochSeconds == c7802c.epochSeconds && this.nanosecondsOfSecond == c7802c.nanosecondsOfSecond;
    }

    public int hashCode() {
        return Long.hashCode(this.epochSeconds) + (this.nanosecondsOfSecond * 51);
    }

    @NotNull
    public String toString() {
        return C7803d.m32392j(this);
    }
}
