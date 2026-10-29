package p581ym;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p560xu.C12930h;
import p560xu.InterfaceC12926f;
import p560xu.InterfaceC12928g;

/* JADX INFO: renamed from: ym.j */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\f\u001a\u00020\b*\u00020\u0005¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m31665d2 = {"Lxu/f;", "", "str", "d", "(Lxu/f;Ljava/lang/String;)Lxu/f;", "Lxu/g;", "b", "(Lxu/g;)Ljava/lang/String;", "Lxu/h;", "bytes", "c", "(Lxu/f;Lxu/h;)Lxu/f;", "a", "(Lxu/g;)Lxu/h;", "wf1-workflow-core"}, m31666k = 2, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class C13217j {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final C12930h m48877a(@NotNull InterfaceC12928g interfaceC12928g) {
        Intrinsics.checkNotNullParameter(interfaceC12928g, "<this>");
        return interfaceC12928g.mo48002K1(interfaceC12928g.readInt());
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m48878b(@NotNull InterfaceC12928g interfaceC12928g) {
        Intrinsics.checkNotNullParameter(interfaceC12928g, "<this>");
        return m48877a(interfaceC12928g).m48095P();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final InterfaceC12926f m48879c(@NotNull InterfaceC12926f interfaceC12926f, @NotNull C12930h bytes) {
        Intrinsics.checkNotNullParameter(interfaceC12926f, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        interfaceC12926f.writeInt(bytes.m48089I()).mo48023d0(bytes);
        return interfaceC12926f;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final InterfaceC12926f m48880d(@NotNull InterfaceC12926f interfaceC12926f, @NotNull String str) {
        Intrinsics.checkNotNullParameter(interfaceC12926f, "<this>");
        Intrinsics.checkNotNullParameter(str, "str");
        return m48879c(interfaceC12926f, C12930h.INSTANCE.m48117d(str));
    }
}
