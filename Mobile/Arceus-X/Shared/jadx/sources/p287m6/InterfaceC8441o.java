package p287m6;

import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p560xu.InterfaceC12928g;

/* JADX INFO: renamed from: m6.o */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\tJ!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m31665d2 = {"Lm6/o;", "", "", "mimeType", "Lxu/g;", Payload.SOURCE, "", "e", "(Ljava/lang/String;Lxu/g;)Z", "a", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC8441o {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f31122a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final InterfaceC8441o f31119b = new InterfaceC8441o() { // from class: m6.l
        @Override // p287m6.InterfaceC8441o
        /* JADX INFO: renamed from: e */
        public final boolean mo34202e(String str, InterfaceC12928g interfaceC12928g) {
            return InterfaceC8441o.m34205c(str, interfaceC12928g);
        }
    };

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final InterfaceC8441o f31120c = new InterfaceC8441o() { // from class: m6.m
        @Override // p287m6.InterfaceC8441o
        /* JADX INFO: renamed from: e */
        public final boolean mo34202e(String str, InterfaceC12928g interfaceC12928g) {
            return InterfaceC8441o.m34206d(str, interfaceC12928g);
        }
    };

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final InterfaceC8441o f31121d = new InterfaceC8441o() { // from class: m6.n
        @Override // p287m6.InterfaceC8441o
        /* JADX INFO: renamed from: e */
        public final boolean mo34202e(String str, InterfaceC12928g interfaceC12928g) {
            return InterfaceC8441o.m34204b(str, interfaceC12928g);
        }
    };

    /* JADX INFO: renamed from: m6.o$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001R\u0017\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\u0001R\u0017\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\u0001¨\u0006\t"}, m31665d2 = {"Lm6/o$a;", "", "<init>", "()V", "Lm6/o;", "IGNORE", "Lm6/o;", "RESPECT_PERFORMANCE", "RESPECT_ALL", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f31122a = new Companion();
    }

    /* JADX INFO: renamed from: b */
    static boolean m34204b(String str, InterfaceC12928g interfaceC12928g) {
        return true;
    }

    /* JADX INFO: renamed from: c */
    static boolean m34205c(String str, InterfaceC12928g interfaceC12928g) {
        return false;
    }

    /* JADX INFO: renamed from: d */
    static boolean m34206d(String str, InterfaceC12928g interfaceC12928g) {
        if (str != null) {
            return Intrinsics.m31980c(str, "image/jpeg") || Intrinsics.m31980c(str, "image/webp") || Intrinsics.m31980c(str, "image/heic") || Intrinsics.m31980c(str, "image/heif");
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    boolean mo34202e(@Nullable String mimeType, @NotNull InterfaceC12928g source);
}
