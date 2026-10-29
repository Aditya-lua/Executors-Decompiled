package p393qs;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.C7802c;
import org.jetbrains.annotations.NotNull;
import p229jt.C7345l;

/* JADX INFO: renamed from: qs.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m31665d2 = {"Lqs/b;", "", "<init>", "()V", "", "isoDate", "Lqs/a;", "precision", "Lkotlin/time/c;", "a", "(Ljava/lang/String;Lqs/a;)Lkotlin/time/c;", "b", "(Lqs/a;)Ljava/lang/String;", "", "c", "(Lqs/a;)I", "operations-stdlib_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C10705b {

    /* JADX INFO: renamed from: qs.b$b */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38260a;

        static {
            int[] iArr = new int[EnumC10704a.values().length];
            try {
                iArr[EnumC10704a.MILLISECOND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC10704a.SECOND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC10704a.MINUTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC10704a.HOUR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC10704a.DAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC10704a.MONTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC10704a.YEAR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f38260a = iArr;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final C7802c m40800a(@NotNull String isoDate, @NotNull EnumC10704a precision) {
        Intrinsics.checkNotNullParameter(isoDate, "isoDate");
        Intrinsics.checkNotNullParameter(precision, "precision");
        C7802c.Companion companion = C7802c.INSTANCE;
        String strSubstring = isoDate.substring(0, m40802c(precision));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return companion.m32382e(strSubstring + m40801b(precision));
    }

    /* JADX INFO: renamed from: b */
    public final String m40801b(EnumC10704a precision) {
        switch (b.f38260a[precision.ordinal()]) {
            case 1:
                return "";
            case 2:
                return ".001Z";
            case 3:
                return ":00.001Z";
            case 4:
                return ":00:00.001Z";
            case 5:
                return "T00:00:00.001Z";
            case 6:
                return "-01T00:00:00.001Z";
            case 7:
                return "-01-01T00:00:00.001Z";
            default:
                throw new C7345l();
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m40802c(EnumC10704a precision) {
        switch (b.f38260a[precision.ordinal()]) {
            case 1:
                return 24;
            case 2:
                return 19;
            case 3:
                return 16;
            case 4:
                return 13;
            case 5:
                return 10;
            case 6:
                return 7;
            case 7:
                return 4;
            default:
                throw new C7345l();
        }
    }
}
