package p256ku;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p395qu.C10719e0;
import p395qu.C10739o0;

/* JADX INFO: renamed from: ku.c3 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\u0003J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bR(\u0010\u0010\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\fj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\t\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u0011"}, m31665d2 = {"Lku/c3;", "", "<init>", "()V", "Lku/m1;", "a", "()Lku/m1;", "", "c", "eventLoop", "d", "(Lku/m1;)V", "Ljava/lang/ThreadLocal;", "Lkotlinx/coroutines/internal/CommonThreadLocal;", "b", "Ljava/lang/ThreadLocal;", "ref", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C7846c3 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C7846c3 f29696a = new C7846c3();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final ThreadLocal<AbstractC7894m1> ref = C10739o0.m40893a(new C10719e0("ThreadLocalEventLoop"));

    @Nullable
    /* JADX INFO: renamed from: a */
    public final AbstractC7894m1 m32586a() {
        return ref.get();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final AbstractC7894m1 m32587b() {
        ThreadLocal<AbstractC7894m1> threadLocal = ref;
        AbstractC7894m1 abstractC7894m1 = threadLocal.get();
        if (abstractC7894m1 != null) {
            return abstractC7894m1;
        }
        AbstractC7894m1 abstractC7894m1M32884a = C7907p1.m32884a();
        threadLocal.set(abstractC7894m1M32884a);
        return abstractC7894m1M32884a;
    }

    /* JADX INFO: renamed from: c */
    public final void m32588c() {
        ref.set(null);
    }

    /* JADX INFO: renamed from: d */
    public final void m32589d(@NotNull AbstractC7894m1 eventLoop) {
        ref.set(eventLoop);
    }
}
