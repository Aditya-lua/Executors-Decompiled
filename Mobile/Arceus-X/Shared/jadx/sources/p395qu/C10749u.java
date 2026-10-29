package p395qu;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p229jt.C7334d;
import p256ku.AbstractC7900n2;

/* JADX INFO: renamed from: qu.u */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m31665d2 = {"Lqu/s;", "", "factories", "Lku/n2;", "e", "(Lqu/s;Ljava/util/List;)Lku/n2;", "", "c", "(Lku/n2;)Z", "", "cause", "", "errorHint", "Lqu/v;", "a", "(Ljava/lang/Throwable;Ljava/lang/String;)Lqu/v;", "", "d", "()Ljava/lang/Void;", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C10749u {
    /* JADX INFO: renamed from: a */
    public static final C10750v m40950a(Throwable th2, String str) throws Throwable {
        if (th2 != null) {
            throw th2;
        }
        m40953d();
        throw new C7334d();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C10750v m40951b(Throwable th2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return m40950a(th2, str);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m40952c(@NotNull AbstractC7900n2 abstractC7900n2) {
        return abstractC7900n2.mo32847X() instanceof C10750v;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final Void m40953d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final AbstractC7900n2 m40954e(@NotNull InterfaceC10746s interfaceC10746s, @NotNull List<? extends InterfaceC10746s> list) {
        try {
            return interfaceC10746s.mo33643b(list);
        } catch (Throwable th2) {
            return m40950a(th2, interfaceC10746s.mo33642a());
        }
    }
}
