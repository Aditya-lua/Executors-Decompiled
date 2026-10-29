package p079di;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: di.b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0004\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0007\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0006\u0010\u0004\"\u0017\u0010\t\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0002\u001a\u0004\b\b\u0010\u0004\"\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\n8\u0006¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0001\u0010\f¨\u0006\u000e"}, m31665d2 = {"Ldi/a;", "a", "Ldi/a;", "c", "()Ldi/a;", "THREE_DAY_ROLL", "b", "TEN_DAY_ROLL", "d", "TWENTY_DAY_ROLL", "", "Ljava/util/List;", "()Ljava/util/List;", "STREAK_ACHIEVEMENTS", "NativeShell_googleProdRelease"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4610b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Achievement f18880a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Achievement f18881b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Achievement f18882c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final List<Achievement> f18883d;

    static {
        Achievement achievement = new Achievement(C4620l.m22823b("Achievement3DayRoll"), C4618j.m22807b("CgkIyM-UotMBEAIQDg"), null);
        f18880a = achievement;
        Achievement achievement2 = new Achievement(C4620l.m22823b("Achievement10DayRoll"), C4618j.m22807b("CgkIyM-UotMBEAIQDw"), null);
        f18881b = achievement2;
        Achievement achievement3 = new Achievement(C4620l.m22823b("Achievement20DayRoll"), C4618j.m22807b("CgkIyM-UotMBEAIQEA"), null);
        f18882c = achievement3;
        f18883d = C7699p.m31895n(achievement, achievement2, achievement3);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final List<Achievement> m22763a() {
        return f18883d;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Achievement m22764b() {
        return f18881b;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final Achievement m22765c() {
        return f18880a;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final Achievement m22766d() {
        return f18882c;
    }
}
