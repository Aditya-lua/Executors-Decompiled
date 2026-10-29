package di;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0004\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0007\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0006\u0010\u0004\"\u0017\u0010\t\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0002\u001a\u0004\b\b\u0010\u0004\"\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\n8\u0006¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0001\u0010\f¨\u0006\u000e"}, d2 = {"Ldi/a;", "a", "Ldi/a;", "c", "()Ldi/a;", "THREE_DAY_ROLL", "b", "TEN_DAY_ROLL", "d", "TWENTY_DAY_ROLL", "", "Ljava/util/List;", "()Ljava/util/List;", "STREAK_ACHIEVEMENTS", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Achievement f14626a;

    @NotNull
    public static final Achievement b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Achievement f14627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final List<Achievement> f14628d;

    static {
        Achievement achievement = new Achievement(k.b("Achievement3DayRoll"), i.b("CgkIyM-UotMBEAIQDg"), null);
        f14626a = achievement;
        Achievement achievement2 = new Achievement(k.b("Achievement10DayRoll"), i.b("CgkIyM-UotMBEAIQDw"), null);
        b = achievement2;
        Achievement achievement3 = new Achievement(k.b("Achievement20DayRoll"), i.b("CgkIyM-UotMBEAIQEA"), null);
        f14627c = achievement3;
        f14628d = p.n(achievement, achievement2, achievement3);
    }

    @NotNull
    public static final List<Achievement> a() {
        return f14628d;
    }

    @NotNull
    public static final Achievement b() {
        return b;
    }

    @NotNull
    public static final Achievement c() {
        return f14626a;
    }

    @NotNull
    public static final Achievement d() {
        return f14627c;
    }
}
