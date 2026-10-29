package p321o4;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o4.o */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u0082\u0001\u0002\u001c\u001d¨\u0006\u001e"}, m31665d2 = {"Lo4/o;", "Lo4/h;", "Landroid/window/OnBackInvokedDispatcher;", "onBackInvokedDispatcher", "", "onBackInvokedCallbackPriority", "<init>", "(Landroid/window/OnBackInvokedDispatcher;I)V", "", "hasEnabledHandlers", "", "j", "(Z)V", "shouldBeRegistered", "p", "Landroid/window/OnBackInvokedCallback;", "n", "()Landroid/window/OnBackInvokedCallback;", "c", "Landroid/window/OnBackInvokedDispatcher;", "d", "I", "e", "Landroid/window/OnBackInvokedCallback;", "onBackInvokedCallback", "f", "Z", "backInvokedCallbackRegistered", "Lo4/m;", "Lo4/p;", "navigationevent"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public abstract class AbstractC9647o extends AbstractC9640h {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final OnBackInvokedDispatcher onBackInvokedDispatcher;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int onBackInvokedCallbackPriority;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final OnBackInvokedCallback onBackInvokedCallback;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean backInvokedCallbackRegistered;

    /* JADX INFO: renamed from: o4.o$a */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, m31665d2 = {"o4/o$a", "Landroid/window/OnBackAnimationCallback;", "Landroid/window/BackEvent;", "backEvent", "", "onBackStarted", "(Landroid/window/BackEvent;)V", "onBackProgressed", "onBackInvoked", "()V", "onBackCancelled", "navigationevent"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class a implements OnBackAnimationCallback {
        public a() {
        }

        public void onBackCancelled() {
            AbstractC9647o.this.m38055a();
        }

        public void onBackInvoked() {
            AbstractC9647o.this.m38056b();
        }

        public void onBackProgressed(BackEvent backEvent) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            AbstractC9647o.this.m38057c(C9643k.m38078a(backEvent));
        }

        public void onBackStarted(BackEvent backEvent) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            AbstractC9647o.this.m38058d(C9643k.m38078a(backEvent));
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 android.window.OnBackInvokedDispatcher), (r2v0 int) A[MD:(android.window.OnBackInvokedDispatcher, int):void (m)] (LINE:1) call: o4.o.<init>(android.window.OnBackInvokedDispatcher, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ AbstractC9647o(OnBackInvokedDispatcher onBackInvokedDispatcher, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(onBackInvokedDispatcher, i10);
    }

    /* JADX INFO: renamed from: o */
    public static final void m38080o(AbstractC9647o abstractC9647o) {
        abstractC9647o.m38056b();
    }

    @Override // p321o4.AbstractC9640h
    /* JADX INFO: renamed from: j */
    public void mo23083j(boolean hasEnabledHandlers) {
        m38082p(hasEnabledHandlers);
    }

    /* JADX INFO: renamed from: n */
    public final OnBackInvokedCallback m38081n() {
        return new a();
    }

    /* JADX INFO: renamed from: p */
    public final void m38082p(boolean shouldBeRegistered) {
        if (shouldBeRegistered && !this.backInvokedCallbackRegistered) {
            this.onBackInvokedDispatcher.registerOnBackInvokedCallback(this.onBackInvokedCallbackPriority, this.onBackInvokedCallback);
            this.backInvokedCallbackRegistered = true;
        } else {
            if (shouldBeRegistered || !this.backInvokedCallbackRegistered) {
                return;
            }
            this.onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.onBackInvokedCallback);
            this.backInvokedCallbackRegistered = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC9647o(OnBackInvokedDispatcher onBackInvokedDispatcher, int i10) {
        this.onBackInvokedDispatcher = onBackInvokedDispatcher;
        this.onBackInvokedCallbackPriority = i10;
        this.onBackInvokedCallback = Build.VERSION.SDK_INT == 33 ? new OnBackInvokedCallback() { // from class: o4.n
            public final void onBackInvoked() {
                AbstractC9647o.m38080o(this.f34978a);
            }
        } : m38081n();
    }
}
