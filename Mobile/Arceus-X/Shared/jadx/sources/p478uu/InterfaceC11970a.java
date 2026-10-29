package p478uu;

import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;

/* JADX INFO: renamed from: uu.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"Luu/a;", "", "owner", "", "d", "(Ljava/lang/Object;)Z", "", "f", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "e", "(Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public interface InterfaceC11970a {

    /* JADX INFO: renamed from: uu.a$a */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ Object m44675a(InterfaceC11970a interfaceC11970a, Object obj, InterfaceC9557b interfaceC9557b, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            return interfaceC11970a.mo44674f(obj, interfaceC9557b);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ boolean m44676b(InterfaceC11970a interfaceC11970a, Object obj, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            return interfaceC11970a.mo44672d(obj);
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m44677c(InterfaceC11970a interfaceC11970a, Object obj, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            interfaceC11970a.mo44673e(obj);
        }
    }

    /* JADX INFO: renamed from: d */
    boolean mo44672d(@Nullable Object owner);

    /* JADX INFO: renamed from: e */
    void mo44673e(@Nullable Object owner);

    @Nullable
    /* JADX INFO: renamed from: f */
    Object mo44674f(@Nullable Object obj, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b);
}
