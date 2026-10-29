package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p230ju.C7363d;

/* JADX INFO: renamed from: kotlin.time.e */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bs\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m31665d2 = {"Lkotlin/time/e;", "", "Lkotlin/time/c;", "toInstant", "()Lkotlin/time/c;", "b", "a", "Lkotlin/time/e$a;", "Lkotlin/time/e$b;", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC7804e {

    /* JADX INFO: renamed from: kotlin.time.e$a */
    @Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m31665d2 = {"Lkotlin/time/e$a;", "Lkotlin/time/e;", "", "error", "", "input", "<init>", "(Ljava/lang/String;Ljava/lang/CharSequence;)V", "Lkotlin/time/c;", "toInstant", "()Lkotlin/time/c;", "a", "Ljava/lang/String;", "getError", "()Ljava/lang/String;", "b", "Ljava/lang/CharSequence;", "getInput", "()Ljava/lang/CharSequence;", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a implements InterfaceC7804e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String error;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final CharSequence input;

        public a(@NotNull String error, @NotNull CharSequence input) {
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(input, "input");
            this.error = error;
            this.input = input;
        }

        @Override // kotlin.time.InterfaceC7804e
        @NotNull
        public C7802c toInstant() {
            throw new C7363d(this.error + " when parsing an Instant from \"" + C7803d.m32406x(this.input, 64) + '\"');
        }
    }

    /* JADX INFO: renamed from: kotlin.time.e$b */
    @Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m31665d2 = {"Lkotlin/time/e$b;", "Lkotlin/time/e;", "", "epochSeconds", "", "nanosecondsOfSecond", "<init>", "(JI)V", "Lkotlin/time/c;", "toInstant", "()Lkotlin/time/c;", "a", "J", "getEpochSeconds", "()J", "b", "I", "getNanosecondsOfSecond", "()I", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b implements InterfaceC7804e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final long epochSeconds;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final int nanosecondsOfSecond;

        public b(long j10, int i10) {
            this.epochSeconds = j10;
            this.nanosecondsOfSecond = i10;
        }

        @Override // kotlin.time.InterfaceC7804e
        @NotNull
        public C7802c toInstant() {
            long j10 = this.epochSeconds;
            C7802c.Companion companion = C7802c.INSTANCE;
            if (j10 >= companion.m32381d().getEpochSeconds() && this.epochSeconds <= companion.m32380c().getEpochSeconds()) {
                return companion.m32378a(this.epochSeconds, this.nanosecondsOfSecond);
            }
            throw new C7363d("The parsed date is outside the range representable by Instant (Unix epoch second " + this.epochSeconds + ')');
        }
    }

    @NotNull
    C7802c toInstant();
}
