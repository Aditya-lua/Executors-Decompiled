package p256ku;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p395qu.C10721f0;
import p395qu.C10749u;

/* JADX INFO: renamed from: ku.v0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\" \u0010\n\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0001\u0010\u0007\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0004\u0010\u0002¨\u0006\u000b"}, m31665d2 = {"Lku/y0;", "b", "()Lku/y0;", "", "a", "Z", "defaultMainDelayOptIn", "Lku/y0;", "getDefaultDelay$annotations", "()V", "DefaultDelay", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C7930v0 {

    /* JADX INFO: renamed from: a */
    public static final boolean f29810a = C10721f0.m40845f("kotlinx.coroutines.main.delay", false);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final InterfaceC7942y0 f29811b = m32923b();

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC7942y0 m32922a() {
        return f29811b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: ku.n2 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final InterfaceC7942y0 m32923b() {
        if (!f29810a) {
            return RunnableC7926u0.f29805i;
        }
        AbstractC7900n2 abstractC7900n2M32645c = C7864g1.m32645c();
        return (C10749u.m40952c(abstractC7900n2M32645c) || !(abstractC7900n2M32645c instanceof InterfaceC7942y0)) ? RunnableC7926u0.f29805i : (InterfaceC7942y0) abstractC7900n2M32645c;
    }
}
