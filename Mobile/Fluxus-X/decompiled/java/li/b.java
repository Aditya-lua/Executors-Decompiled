package li;

import com.github.luben.zstd.BuildConfig;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.collections.p;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0004\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0007\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0006\u0010\u0004\"\u0017\u0010\t\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0002\u001a\u0004\b\b\u0010\u0004\"\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\n8\u0006¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0001\u0010\f¨\u0006\u000e"}, d2 = {"Lli/a;", "a", "Lli/a;", "c", "()Lli/a;", "THREE_DAY_ROLL", "b", "TEN_DAY_ROLL", "d", "TWENTY_DAY_ROLL", BuildConfig.FLAVOR, "Ljava/util/List;", "()Ljava/util/List;", "STREAK_ACHIEVEMENTS", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Achievement f22162a;

    @NotNull
    public static final Achievement b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Achievement f22163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final List<Achievement> f22164d;

    static {
        Achievement achievement = new Achievement(l.b("Achievement3DayRoll"), j.b("CgkIyM-UotMBEAIQDg"), null);
        f22162a = achievement;
        Achievement achievement2 = new Achievement(l.b("Achievement10DayRoll"), j.b("CgkIyM-UotMBEAIQDw"), null);
        b = achievement2;
        Achievement achievement3 = new Achievement(l.b("Achievement20DayRoll"), j.b("CgkIyM-UotMBEAIQEA"), null);
        f22163c = achievement3;
        f22164d = p.n(achievement, achievement2, achievement3);
    }

    @NotNull
    public static final List<Achievement> a() {
        return f22164d;
    }

    @NotNull
    public static final Achievement b() {
        return b;
    }

    @NotNull
    public static final Achievement c() {
        return f22162a;
    }

    @NotNull
    public static final Achievement d() {
        return f22163c;
    }
}
