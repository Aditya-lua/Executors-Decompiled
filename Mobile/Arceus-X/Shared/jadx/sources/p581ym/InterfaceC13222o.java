package p581ym;

import hu.InterfaceC6577m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.Intrinsics;
import nu.InterfaceC9575h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ym.o */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000 \n*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\nJ\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, m31665d2 = {"Lym/o;", "OutputT", "", "Lnu/h;", "run", "()Lnu/h;", "otherWorker", "", "b", "(Lym/o;)Z", "a", "wf1-workflow-core"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public interface InterfaceC13222o<OutputT> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f46536a;

    /* JADX INFO: renamed from: ym.o$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u000f\u0010\u0003¨\u0006\u0011"}, m31665d2 = {"Lym/o$a;", "", "<init>", "()V", "", "delayMs", "", "key", "Lym/o;", "", "a", "(JLjava/lang/String;)Lym/o;", "Lhu/m;", "b", "Lhu/m;", "getTYPE_OF_NOTHING$annotations", "TYPE_OF_NOTHING", "wf1-workflow-core"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f46536a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public static final InterfaceC6577m TYPE_OF_NOTHING = C7731d0.m32011k(Void.class);

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ InterfaceC13222o m48891b(Companion companion, long j10, String str, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str = "";
            }
            return companion.m48892a(j10, str);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final InterfaceC13222o<Unit> m48892a(long delayMs, @NotNull String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new TimerWorker(delayMs, key);
        }
    }

    /* JADX INFO: renamed from: ym.o$b */
    @Metadata(m31666k = 3, m31667mv = {1, 6, 0}, m31669xi = 48)
    public static final class b {
        /* JADX INFO: renamed from: a */
        public static <OutputT> boolean m48893a(@NotNull InterfaceC13222o<? extends OutputT> interfaceC13222o, @NotNull InterfaceC13222o<?> otherWorker) {
            Intrinsics.checkNotNullParameter(interfaceC13222o, "this");
            Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
            return Intrinsics.m31980c(C7731d0.m32002b(otherWorker.getClass()), C7731d0.m32002b(interfaceC13222o.getClass()));
        }
    }

    /* JADX INFO: renamed from: b */
    boolean mo7573b(@NotNull InterfaceC13222o<?> otherWorker);

    @NotNull
    InterfaceC9575h<OutputT> run();
}
