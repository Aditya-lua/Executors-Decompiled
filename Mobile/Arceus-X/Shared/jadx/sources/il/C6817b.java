package il;

import androidx.p616lifecycle.InterfaceC0954f;
import com.roblox.protocols.designfoundations.DesignFoundationsJniAdapter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: il.b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, m31665d2 = {"Lil/b;", "", "<init>", "()V", "Landroidx/lifecycle/f;", "a", "()Landroidx/lifecycle/f;", "Lil/d;", "b", "Lil/d;", "handler", "Lil/c;", "c", "Lil/c;", "tokens", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6817b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C6817b f26773a = new C6817b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final C6819d handler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC6818c tokens;

    static {
        C6819d c6819d = new C6819d();
        handler = c6819d;
        tokens = c6819d;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC0954f m29189a() {
        return new DesignFoundationsJniAdapter(handler);
    }
}
