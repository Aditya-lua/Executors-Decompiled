package p456u2;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: u2.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m31665d2 = {"Lu2/b;", "", "<init>", "()V", "Landroid/os/Bundle;", "bundle", "", "key", "Landroid/util/Size;", "value", "", "a", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/util/Size;)V", "Landroid/util/SizeF;", "b", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/util/SizeF;)V", "core-ktx_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C11773b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C11773b f41495a = new C11773b();

    private C11773b() {
    }

    /* JADX INFO: renamed from: a */
    public static final void m44053a(@NotNull Bundle bundle, @NotNull String key, @Nullable Size value) {
        bundle.putSize(key, value);
    }

    /* JADX INFO: renamed from: b */
    public static final void m44054b(@NotNull Bundle bundle, @NotNull String key, @Nullable SizeF value) {
        bundle.putSizeF(key, value);
    }
}
