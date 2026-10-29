package mk;

import android.content.res.Configuration;
import android.view.KeyEvent;
import com.roblox.engine.jni.NativeGLInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001a"}, d2 = {"Lmk/h;", "", "<init>", "()V", "Landroid/content/res/Configuration;", "configuration", "", "c", "(Landroid/content/res/Configuration;)V", "newConfig", "d", "Landroid/view/KeyEvent;", "event", "", "e", "(Landroid/view/KeyEvent;)Z", "f", "", "keyCode", "a", "(I)Z", "value", "b", "Z", "()Z", "hardwareKeyboardDetected", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h f24374a = new h();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static boolean hardwareKeyboardDetected;

    public final boolean a(int keyCode) {
        return (!hardwareKeyboardDetected || keyCode == 4 || keyCode == 25 || keyCode == 24) ? false : true;
    }

    public final boolean b() {
        return hardwareKeyboardDetected;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0010  */
    public final void c(@NotNull Configuration configuration) {
        boolean z10;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        if (configuration.keyboard == 2) {
            z10 = configuration.hardKeyboardHidden == 1;
        }
        hardwareKeyboardDetected = z10;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0010  */
    public final void d(@NotNull Configuration newConfig) {
        boolean z10;
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        if (newConfig.keyboard == 2) {
            z10 = newConfig.hardKeyboardHidden == 1;
        }
        hardwareKeyboardDetected = z10;
    }

    public final boolean e(@NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!a(event.getKeyCode())) {
            return false;
        }
        NativeGLInterface.nativePassKeyEvent(true, event.getScanCode(), event.getKeyCode(), event.getRepeatCount() > 0);
        return true;
    }

    public final boolean f(@NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!a(event.getKeyCode())) {
            return false;
        }
        NativeGLInterface.nativePassKeyEvent(false, event.getScanCode(), event.getKeyCode(), event.getRepeatCount() > 0);
        return true;
    }
}
