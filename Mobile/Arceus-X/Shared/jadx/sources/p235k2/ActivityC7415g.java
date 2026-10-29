package p235k2;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.app.NotificationCompat;
import androidx.core.view.C0617l;
import androidx.p616lifecycle.AbstractC0966l;
import androidx.p616lifecycle.C0984u;
import androidx.p616lifecycle.FragmentC0965k0;
import androidx.p616lifecycle.InterfaceC0980s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p504w1.C12286j;

/* JADX INFO: renamed from: k2.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0015¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u000f2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u000f2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0018R.\u0010 \u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u001b\u0012\u0004\u0012\u00020\u001c0\u001a8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b\u001f\u0010\u0005R\u001a\u0010%\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\"\u0010#\u0012\u0004\b$\u0010\u0005R\u0014\u0010(\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010'¨\u0006)"}, m31665d2 = {"Lk2/g;", "Landroid/app/Activity;", "Landroidx/lifecycle/s;", "Landroidx/core/view/l$a;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "Landroid/view/KeyEvent;", NotificationCompat.CATEGORY_EVENT, "", "D", "(Landroid/view/KeyEvent;)Z", "dispatchKeyShortcutEvent", "dispatchKeyEvent", "", "", "args", "r0", "([Ljava/lang/String;)Z", "s0", "Lw1/j;", "Ljava/lang/Class;", "", "a", "Lw1/j;", "getExtraDataMap$annotations", "extraDataMap", "Landroidx/lifecycle/u;", "b", "Landroidx/lifecycle/u;", "getLifecycleRegistry$annotations", "lifecycleRegistry", "Landroidx/lifecycle/l;", "()Landroidx/lifecycle/l;", "lifecycle", "core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public class ActivityC7415g extends Activity implements InterfaceC0980s, C0617l.a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C12286j<Class<Object>, Object> extraDataMap = new C12286j<>(0, 1, null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C0984u lifecycleRegistry = new C0984u(this);

    @Override // androidx.core.view.C0617l.a
    /* JADX INFO: renamed from: D */
    public boolean mo2939D(@NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return super.dispatchKeyEvent(event);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public AbstractC0966l mo4656a() {
        return this.lifecycleRegistry;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(@NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        if (C0617l.m2936d(decorView, event)) {
            return true;
        }
        return C0617l.m2937e(this, decorView, this, event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(@NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        if (C0617l.m2936d(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentC0965k0.INSTANCE.m4933c(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.lifecycleRegistry.m4991o(AbstractC0966l.b.CREATED);
        super.onSaveInstanceState(outState);
    }

    /* JADX INFO: renamed from: r0 */
    public final boolean m30728r0(@Nullable String[] args) {
        return !m30729s0(args);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        if (r4.equals("--list-dumpables") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003c, code lost:
    
        if (r4.equals("--dump-dumpable") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0043, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0045, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:
    
        return false;
     */
    /* JADX INFO: renamed from: s0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m30729s0(String[] args) {
        if (args != null && args.length != 0) {
            String str = args[0];
            switch (str.hashCode()) {
                case -645125871:
                    if (str.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                        return true;
                    }
                    break;
                case 100470631:
                    break;
                case 472614934:
                    break;
                case 1159329357:
                    return str.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29;
                case 1455016274:
                    if (str.equals("--autofill")) {
                        return true;
                    }
                    break;
            }
        }
        return false;
    }
}
