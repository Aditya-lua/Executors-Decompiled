package p239k6;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p348p1.C10146t;

/* JADX INFO: renamed from: k6.d0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0002¢\u0006\u0004\b\n\u0010\tR\u0013\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b8\u0002X\u0082\u0004¨\u0006\r"}, m31665d2 = {"Lk6/d0;", "", "<init>", "()V", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "context", "Lk6/s;", "a", "(Landroid/content/Context;)Lk6/s;", "c", "Lkotlinx/atomicfu/AtomicRef;", "reference", "coil_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7458d0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C7458d0 f28735a = new C7458d0();

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReference f28736b = new AtomicReference(null);

    /* JADX INFO: renamed from: k6.d0$a */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m31665d2 = {"Lk6/d0$a;", "", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "context", "Lk6/s;", "a", "(Landroid/content/Context;)Lk6/s;", "coil_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface a {
        @NotNull
        /* JADX INFO: renamed from: a */
        InterfaceC7479s mo14836a(@NotNull Context context);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC7479s m30978a(@NotNull Context context) {
        C7458d0 c7458d0 = f28735a;
        Object obj = c7458d0.m30979b().get();
        InterfaceC7479s interfaceC7479s = obj instanceof InterfaceC7479s ? (InterfaceC7479s) obj : null;
        return interfaceC7479s == null ? c7458d0.m30980c(context) : interfaceC7479s;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AtomicReference m30979b() {
        return f28736b;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC7479s m30980c(Context context) {
        InterfaceC7479s interfaceC7479s;
        AtomicReference atomicReferenceM30979b = m30979b();
        InterfaceC7479s interfaceC7479sMo14836a = null;
        while (true) {
            Object obj = atomicReferenceM30979b.get();
            if (obj instanceof InterfaceC7479s) {
                interfaceC7479s = interfaceC7479sMo14836a;
                interfaceC7479sMo14836a = (InterfaceC7479s) obj;
            } else {
                if (interfaceC7479sMo14836a == null) {
                    a aVar = obj instanceof a ? (a) obj : null;
                    if (aVar == null || (interfaceC7479sMo14836a = aVar.mo14836a(context)) == null) {
                        a aVarM30984a = C7464g0.m30984a(context);
                        interfaceC7479sMo14836a = aVarM30984a != null ? aVarM30984a.mo14836a(context) : C7462f0.f28740a.mo14836a(context);
                    }
                }
                interfaceC7479s = interfaceC7479sMo14836a;
            }
            if (C10146t.m39085a(atomicReferenceM30979b, obj, interfaceC7479sMo14836a)) {
                Intrinsics.m31981d(interfaceC7479sMo14836a, "null cannot be cast to non-null type coil3.ImageLoader");
                return interfaceC7479sMo14836a;
            }
            interfaceC7479sMo14836a = interfaceC7479s;
        }
    }
}
