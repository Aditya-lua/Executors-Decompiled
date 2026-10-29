package o4;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u0082\u0001\u0002\u001c\u001d¨\u0006\u001e"}, d2 = {"Lo4/o;", "Lo4/h;", "Landroid/window/OnBackInvokedDispatcher;", "onBackInvokedDispatcher", "", "onBackInvokedCallbackPriority", "<init>", "(Landroid/window/OnBackInvokedDispatcher;I)V", "", "hasEnabledHandlers", "", "j", "(Z)V", "shouldBeRegistered", "p", "Landroid/window/OnBackInvokedCallback;", "n", "()Landroid/window/OnBackInvokedCallback;", "c", "Landroid/window/OnBackInvokedDispatcher;", "d", "I", "e", "Landroid/window/OnBackInvokedCallback;", "onBackInvokedCallback", "f", "Z", "backInvokedCallbackRegistered", "Lo4/m;", "Lo4/p;", "navigationevent"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class o extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final OnBackInvokedDispatcher onBackInvokedDispatcher;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int onBackInvokedCallbackPriority;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final OnBackInvokedCallback onBackInvokedCallback;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean backInvokedCallbackRegistered;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"o4/o$a", "Landroid/window/OnBackAnimationCallback;", "Landroid/window/BackEvent;", "backEvent", "", "onBackStarted", "(Landroid/window/BackEvent;)V", "onBackProgressed", "onBackInvoked", "()V", "onBackCancelled", "navigationevent"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements OnBackAnimationCallback {
        public a() {
        }

        public void onBackCancelled() {
            o.this.a();
        }

        public void onBackInvoked() {
            o.this.b();
        }

        public void onBackProgressed(BackEvent backEvent) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            o.this.c(k.a(backEvent));
        }

        public void onBackStarted(BackEvent backEvent) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            o.this.d(k.a(backEvent));
        }
    }

    public /* synthetic */ o(OnBackInvokedDispatcher onBackInvokedDispatcher, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(onBackInvokedDispatcher, i10);
    }

    public static final void o(o oVar) {
        oVar.b();
    }

    @Override // o4.h
    public void j(boolean hasEnabledHandlers) {
        p(hasEnabledHandlers);
    }

    public final OnBackInvokedCallback n() {
        return new a();
    }

    public final void p(boolean shouldBeRegistered) {
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

    public o(OnBackInvokedDispatcher onBackInvokedDispatcher, int i10) {
        this.onBackInvokedDispatcher = onBackInvokedDispatcher;
        this.onBackInvokedCallbackPriority = i10;
        this.onBackInvokedCallback = Build.VERSION.SDK_INT == 33 ? new OnBackInvokedCallback() { // from class: o4.n
            public final void onBackInvoked() {
                o.o(this.f27049a);
            }
        } : n();
    }
}
