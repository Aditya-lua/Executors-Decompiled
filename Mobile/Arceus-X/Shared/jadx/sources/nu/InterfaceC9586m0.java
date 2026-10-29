package nu;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: nu.m0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lnu/m0;", "", "Lnu/p0;", "", "subscriptionCount", "Lnu/h;", "Lnu/k0;", "a", "(Lnu/p0;)Lnu/h;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public interface InterfaceC9586m0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f34623a;

    /* JADX INFO: renamed from: nu.m0$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\b¨\u0006\f"}, m31665d2 = {"Lnu/m0$a;", "", "<init>", "()V", "Lnu/m0;", "b", "Lnu/m0;", "a", "()Lnu/m0;", "Eagerly", "c", "Lazily", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f34623a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public static final InterfaceC9586m0 Eagerly = new C9588n0();

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public static final InterfaceC9586m0 Lazily = new C9590o0();

        @NotNull
        /* JADX INFO: renamed from: a */
        public final InterfaceC9586m0 m37829a() {
            return Eagerly;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final InterfaceC9586m0 m37830b() {
            return Lazily;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC9575h<EnumC9582k0> mo37828a(@NotNull InterfaceC9592p0<Integer> subscriptionCount);
}
