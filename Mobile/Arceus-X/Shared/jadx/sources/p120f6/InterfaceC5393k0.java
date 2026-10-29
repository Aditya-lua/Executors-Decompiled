package p120f6;

import android.annotation.SuppressLint;
import androidx.work.C1116b;
import java.util.List;
import kotlin.Metadata;
import nu.InterfaceC9575h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p536x5.C12717o0;

/* JADX INFO: renamed from: f6.k0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\u0007H'¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u0019\u0010\nJ\u001f\u0010\u001c\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH'¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001eH'¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\"\u0010\u0018J\u0017\u0010#\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b#\u0010\u0018J\u001f\u0010%\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0014H'¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u0004\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b'\u0010(J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000e2\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b)\u0010\u0011J\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010*\u001a\u00020\u0007H'¢\u0006\u0004\b+\u0010\u0011J\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\r\u001a\u00020\u0007H'¢\u0006\u0004\b,\u0010\u0011J\u0015\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-H'¢\u0006\u0004\b/\u00100J\u001f\u00102\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u001eH'¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0014H'¢\u0006\u0004\b4\u00105J\u001d\u00107\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u00106\u001a\u00020\u0014H'¢\u0006\u0004\b7\u00108J\u0015\u00109\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\b9\u0010:J\u001d\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010;\u001a\u00020\u0014H'¢\u0006\u0004\b<\u00108J\u0015\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\b=\u0010:J\u0015\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\b>\u0010:J\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010?\u001a\u00020\u001eH'¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\bB\u0010\u0006J\u000f\u0010C\u001a\u00020\u0014H'¢\u0006\u0004\bC\u00105J\u001f\u0010E\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010D\u001a\u00020\u0014H'¢\u0006\u0004\bE\u0010&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006FÀ\u0006\u0001"}, m31665d2 = {"Lf6/k0;", "", "Lf6/j0;", "workSpec", "", "h", "(Lf6/j0;)V", "", "id", "a", "(Ljava/lang/String;)V", "k", "(Ljava/lang/String;)Lf6/j0;", "name", "", "Lf6/j0$b;", "r", "(Ljava/lang/String;)Ljava/util/List;", "Lx5/o0$c;", "state", "", "c", "(Lx5/o0$c;Ljava/lang/String;)I", "l", "(Ljava/lang/String;)I", "b", "Landroidx/work/b;", "output", "u", "(Ljava/lang/String;Landroidx/work/b;)V", "", "enqueueTime", "v", "(Ljava/lang/String;J)V", "z", "y", "overrideGeneration", "B", "(Ljava/lang/String;I)V", "j", "(Ljava/lang/String;)Lx5/o0$c;", "n", "tag", "m", "i", "Lnu/h;", "", "s", "()Lnu/h;", "startTime", "q", "(Ljava/lang/String;J)I", "p", "()I", "schedulerLimit", "t", "(I)Ljava/util/List;", "x", "()Ljava/util/List;", "maxLimit", "o", "f", "w", "startingAt", "d", "(J)Ljava/util/List;", "g", "A", "stopReason", "e", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
@SuppressLint({"UnknownNullness"})
public interface InterfaceC5393k0 {
    /* JADX INFO: renamed from: A */
    int mo24775A();

    /* JADX INFO: renamed from: B */
    void mo24776B(@NotNull String id2, int overrideGeneration);

    /* JADX INFO: renamed from: a */
    void mo24777a(@NotNull String id2);

    /* JADX INFO: renamed from: b */
    void mo24778b(@NotNull String id2);

    /* JADX INFO: renamed from: c */
    int mo24779c(@NotNull C12717o0.c state, @NotNull String id2);

    @NotNull
    /* JADX INFO: renamed from: d */
    List<C5390j0> mo24780d(long startingAt);

    /* JADX INFO: renamed from: e */
    void mo24781e(@NotNull String id2, int stopReason);

    @NotNull
    /* JADX INFO: renamed from: f */
    List<C5390j0> mo24782f();

    /* JADX INFO: renamed from: g */
    void mo24783g(@NotNull C5390j0 workSpec);

    /* JADX INFO: renamed from: h */
    void mo24784h(@NotNull C5390j0 workSpec);

    @NotNull
    /* JADX INFO: renamed from: i */
    List<String> mo24785i(@NotNull String name);

    @Nullable
    /* JADX INFO: renamed from: j */
    C12717o0.c mo24786j(@NotNull String id2);

    @Nullable
    /* JADX INFO: renamed from: k */
    C5390j0 mo24787k(@NotNull String id2);

    /* JADX INFO: renamed from: l */
    int mo24788l(@NotNull String id2);

    @NotNull
    /* JADX INFO: renamed from: m */
    List<String> mo24789m(@NotNull String tag);

    @NotNull
    /* JADX INFO: renamed from: n */
    List<C1116b> mo24790n(@NotNull String id2);

    @NotNull
    /* JADX INFO: renamed from: o */
    List<C5390j0> mo24791o(int maxLimit);

    /* JADX INFO: renamed from: p */
    int mo24792p();

    /* JADX INFO: renamed from: q */
    int mo24793q(@NotNull String id2, long startTime);

    @NotNull
    /* JADX INFO: renamed from: r */
    List<C5390j0.IdAndState> mo24794r(@NotNull String name);

    @NotNull
    /* JADX INFO: renamed from: s */
    InterfaceC9575h<Boolean> mo24795s();

    @NotNull
    /* JADX INFO: renamed from: t */
    List<C5390j0> mo24796t(int schedulerLimit);

    /* JADX INFO: renamed from: u */
    void mo24797u(@NotNull String id2, @NotNull C1116b output);

    /* JADX INFO: renamed from: v */
    void mo24798v(@NotNull String id2, long enqueueTime);

    @NotNull
    /* JADX INFO: renamed from: w */
    List<C5390j0> mo24799w();

    @NotNull
    /* JADX INFO: renamed from: x */
    List<C5390j0> mo24800x();

    /* JADX INFO: renamed from: y */
    int mo24801y(@NotNull String id2);

    /* JADX INFO: renamed from: z */
    int mo24802z(@NotNull String id2);
}
