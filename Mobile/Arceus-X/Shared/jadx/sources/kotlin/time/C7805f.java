package kotlin.time;

import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.time.f */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\r\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0001\u000fB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012¨\u0006\u0019"}, m31665d2 = {"Lkotlin/time/f;", "", "", "year", "month", "day", "hour", "minute", "second", "nanosecond", "<init>", "(IIIIIII)V", "", "toString", "()Ljava/lang/String;", "a", "I", "g", "()I", "b", "d", "c", "e", "f", "h", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7805f {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int year;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int month;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int day;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int hour;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final int minute;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final int second;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final int nanosecond;

    /* JADX INFO: renamed from: kotlin.time.f$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lkotlin/time/f$a;", "", "<init>", "()V", "Lkotlin/time/c;", Payload.INSTANT, "Lkotlin/time/f;", "a", "(Lkotlin/time/c;)Lkotlin/time/f;", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: kotlin.time.f.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C7805f m32414a(@NotNull C7802c instant) {
            long j10;
            Intrinsics.checkNotNullParameter(instant, "instant");
            long epochSeconds = instant.getEpochSeconds();
            long j11 = epochSeconds / 86400;
            if ((epochSeconds ^ 86400) < 0 && j11 * 86400 != epochSeconds) {
                j11--;
            }
            long j12 = epochSeconds % 86400;
            int i10 = (int) (j12 + (86400 & (((j12 ^ 86400) & ((-j12) | j12)) >> 63)));
            long j13 = (j11 + ((long) 719528)) - ((long) 60);
            if (j13 < 0) {
                long j14 = 146097;
                long j15 = ((j13 + 1) / j14) - 1;
                j10 = ((long) 400) * j15;
                j13 += (-j15) * j14;
            } else {
                j10 = 0;
            }
            long j16 = 400;
            long j17 = ((j16 * j13) + ((long) 591)) / ((long) 146097);
            long j18 = 365;
            long j19 = 4;
            long j20 = 100;
            long j21 = j13 - ((((j18 * j17) + (j17 / j19)) - (j17 / j20)) + (j17 / j16));
            if (j21 < 0) {
                j17--;
                j21 = j13 - ((((j18 * j17) + (j17 / j19)) - (j17 / j20)) + (j17 / j16));
            }
            int i11 = (int) j21;
            int i12 = ((i11 * 5) + 2) / 153;
            int i13 = i10 / 3600;
            int i14 = i10 - (i13 * 3600);
            int i15 = i14 / 60;
            return new C7805f((int) (j17 + j10 + ((long) (i12 / 10))), ((i12 + 2) % 12) + 1, (i11 - (((i12 * 306) + 5) / 10)) + 1, i13, i15, i14 - (i15 * 60), instant.getNanosecondsOfSecond());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    public C7805f(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.year = i10;
        this.month = i11;
        this.day = i12;
        this.hour = i13;
        this.minute = i14;
        this.second = i15;
        this.nanosecond = i16;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getDay() {
        return this.day;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getHour() {
        return this.hour;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getMinute() {
        return this.minute;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getMonth() {
        return this.month;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getNanosecond() {
        return this.nanosecond;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getSecond() {
        return this.second;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getYear() {
        return this.year;
    }

    @NotNull
    public String toString() {
        return "UnboundLocalDateTime(" + this.year + '-' + this.month + '-' + this.day + ' ' + this.hour + ':' + this.minute + ':' + this.second + '.' + this.nanosecond + ')';
    }
}
