package p287m6;

import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p560xu.AbstractC12938l;
import p560xu.C12931h0;
import p560xu.InterfaceC12928g;

/* JADX INFO: renamed from: m6.t */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aG\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m31665d2 = {"Lxu/h0;", "file", "Lxu/l;", "fileSystem", "", "diskCacheKey", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeable", "Lm6/s$a;", "metadata", "Lm6/s;", "b", "(Lxu/h0;Lxu/l;Ljava/lang/String;Ljava/lang/AutoCloseable;Lm6/s$a;)Lm6/s;", "Lxu/g;", Payload.SOURCE, "a", "(Lxu/g;Lxu/l;Lm6/s$a;)Lm6/s;", "coil-core_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8446t {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC8445s m34217a(@NotNull InterfaceC12928g interfaceC12928g, @NotNull AbstractC12938l abstractC12938l, @Nullable InterfaceC8445s.a aVar) {
        return new C8448v(interfaceC12928g, abstractC12938l, aVar);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final InterfaceC8445s m34218b(@NotNull C12931h0 c12931h0, @NotNull AbstractC12938l abstractC12938l, @Nullable String str, @Nullable AutoCloseable autoCloseable, @Nullable InterfaceC8445s.a aVar) {
        return new C8444r(c12931h0, abstractC12938l, str, autoCloseable, aVar);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceC8445s m34219c(InterfaceC12928g interfaceC12928g, AbstractC12938l abstractC12938l, InterfaceC8445s.a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            aVar = null;
        }
        return m34217a(interfaceC12928g, abstractC12938l, aVar);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ InterfaceC8445s m34220d(C12931h0 c12931h0, AbstractC12938l abstractC12938l, String str, AutoCloseable autoCloseable, InterfaceC8445s.a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            autoCloseable = null;
        }
        if ((i10 & 16) != 0) {
            aVar = null;
        }
        return m34218b(c12931h0, abstractC12938l, str, autoCloseable, aVar);
    }
}
