package mu;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p395qu.C10721f0;

/* JADX INFO: renamed from: mu.g */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u0004*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0005¨\u0006\u0006"}, m31665d2 = {"Lmu/g;", "E", "Lmu/y;", "Lmu/x;", "No", "b", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public interface InterfaceC8672g<E> extends InterfaceC8690y<E>, InterfaceC8689x<E> {

    /* JADX INFO: renamed from: No, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f31709a;

    /* JADX INFO: renamed from: mu.g$a */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static <E> boolean m34922a(@NotNull InterfaceC8672g<E> interfaceC8672g, E e10) {
            return InterfaceC8690y.a.m34973b(interfaceC8672g, e10);
        }
    }

    /* JADX INFO: renamed from: mu.g$b, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m31665d2 = {"Lmu/g$b;", "", "<init>", "()V", "", "b", "I", "a", "()I", "CHANNEL_DEFAULT_CAPACITY", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f31709a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final int CHANNEL_DEFAULT_CAPACITY = C10721f0.m40841b("kotlinx.coroutines.channels.defaultBuffer", 64, 1, 2147483646);

        /* JADX INFO: renamed from: a */
        public final int m34923a() {
            return CHANNEL_DEFAULT_CAPACITY;
        }
    }
}
