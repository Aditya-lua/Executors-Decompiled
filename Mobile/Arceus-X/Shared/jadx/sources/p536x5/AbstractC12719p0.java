package p536x5;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.C1115a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7697o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;
import p567y5.C13048f1;

/* JADX INFO: renamed from: x5.p0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001eB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH&¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00110\tH&¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\rH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, m31665d2 = {"Lx5/p0;", "", "<init>", "()V", "Lx5/q0;", "request", "Lx5/a0;", "d", "(Lx5/q0;)Lx5/a0;", "", "requests", "c", "(Ljava/util/List;)Lx5/a0;", "", "uniqueWorkName", "Lx5/j;", "existingWorkPolicy", "Lx5/z;", "g", "(Ljava/lang/String;Lx5/j;Lx5/z;)Lx5/a0;", "f", "(Ljava/lang/String;Lx5/j;Ljava/util/List;)Lx5/a0;", "Lx5/i;", "existingPeriodicWorkPolicy", "Lx5/g0;", "e", "(Ljava/lang/String;Lx5/i;Lx5/g0;)Lx5/a0;", "tag", "a", "(Ljava/lang/String;)Lx5/a0;", "b", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
@SuppressLint({"AddedAbstractMethod"})
public abstract class AbstractC12719p0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: x5.p0$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m31665d2 = {"Lx5/p0$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lx5/p0;", "a", "(Landroid/content/Context;)Lx5/p0;", "Landroidx/work/a;", "configuration", "", "b", "(Landroid/content/Context;Landroidx/work/a;)V", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: x5.p0.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public AbstractC12719p0 m47401a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            C13048f1 c13048f1M48580p = C13048f1.m48580p(context);
            Intrinsics.checkNotNullExpressionValue(c13048f1M48580p, "getInstance(...)");
            return c13048f1M48580p;
        }

        /* JADX INFO: renamed from: b */
        public void m47402b(@NotNull Context context, @NotNull C1115a configuration) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            C13048f1.m48577i(context, configuration);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: x5.p0$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m31665d2 = {"Lx5/p0$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public enum b {
        NOT_APPLIED,
        APPLIED_IMMEDIATELY,
        APPLIED_FOR_NEXT_RUN;


        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ InterfaceC10707a f45308e = C10708b.m40805a(m47403a());
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static AbstractC12719p0 m47392h(@NotNull Context context) {
        return INSTANCE.m47401a(context);
    }

    /* JADX INFO: renamed from: i */
    public static void m47393i(@NotNull Context context, @NotNull C1115a c1115a) {
        INSTANCE.m47402b(context, c1115a);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public abstract InterfaceC12689a0 mo47394a(@NotNull String tag);

    @NotNull
    /* JADX INFO: renamed from: b */
    public abstract InterfaceC12689a0 mo47395b(@NotNull String uniqueWorkName);

    @NotNull
    /* JADX INFO: renamed from: c */
    public abstract InterfaceC12689a0 mo47396c(@NotNull List<? extends AbstractC12721q0> requests);

    @NotNull
    /* JADX INFO: renamed from: d */
    public final InterfaceC12689a0 m47397d(@NotNull AbstractC12721q0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return mo47396c(C7697o.m31878d(request));
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public abstract InterfaceC12689a0 mo47398e(@NotNull String uniqueWorkName, @NotNull EnumC12704i existingPeriodicWorkPolicy, @NotNull C12701g0 request);

    @NotNull
    /* JADX INFO: renamed from: f */
    public abstract InterfaceC12689a0 mo47399f(@NotNull String uniqueWorkName, @NotNull EnumC12706j existingWorkPolicy, @NotNull List<C12738z> requests);

    @NotNull
    /* JADX INFO: renamed from: g */
    public InterfaceC12689a0 m47400g(@NotNull String uniqueWorkName, @NotNull EnumC12706j existingWorkPolicy, @NotNull C12738z request) {
        Intrinsics.checkNotNullParameter(uniqueWorkName, "uniqueWorkName");
        Intrinsics.checkNotNullParameter(existingWorkPolicy, "existingWorkPolicy");
        Intrinsics.checkNotNullParameter(request, "request");
        return mo47399f(uniqueWorkName, existingWorkPolicy, C7697o.m31878d(request));
    }
}
