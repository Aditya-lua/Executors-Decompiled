package p088e;

import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p321o4.AbstractC9637e;
import p321o4.AbstractC9639g;
import p321o4.NavigationEvent;

/* JADX INFO: renamed from: e.m0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0006H'¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u000f\u0010\bJ\u001b\u0010\u0015\u001a\u00020\u00062\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00180\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR*\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00028\u0007@GX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b \u0010\"\"\u0004\b#\u0010\u0005R\u001e\u0010%\u001a\f\u0012\b\u0012\u00060\u0010j\u0002`\u00110$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, m31665d2 = {"Le/m0;", "", "", "enabled", "<init>", "(Z)V", "", "remove", "()V", "Le/b;", "backEvent", "handleOnBackStarted", "(Le/b;)V", "handleOnBackProgressed", "handleOnBackPressed", "handleOnBackCancelled", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeable", "addCloseable$activity", "(Ljava/lang/AutoCloseable;)V", "addCloseable", "Lo4/g;", "info", "Lo4/e;", "createNavigationEventHandler$activity", "(Lo4/g;)Lo4/e;", "createNavigationEventHandler", "", "eventHandlers", "Ljava/util/List;", "value", "isEnabled", "Z", "()Z", "setEnabled", "Ljava/util/concurrent/CopyOnWriteArrayList;", "closeables", "Ljava/util/concurrent/CopyOnWriteArrayList;", "a", "activity"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public abstract class AbstractC4717m0 {
    private boolean isEnabled;

    @NotNull
    private final List<AbstractC9637e<?>> eventHandlers = new ArrayList();

    @NotNull
    private final CopyOnWriteArrayList<AutoCloseable> closeables = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: e.m0$a */
    @Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m31665d2 = {"Le/m0$a;", "Lo4/e;", "Lo4/g;", "Le/m0;", "onBackPressedCallback", "info", "<init>", "(Le/m0;Lo4/g;)V", "Lo4/b;", NotificationCompat.CATEGORY_EVENT, "", "r", "(Lo4/b;)V", "q", "p", "()V", "o", "h", "Le/m0;", "activity"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class a extends AbstractC9637e<AbstractC9639g> {

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @NotNull
        public final AbstractC4717m0 onBackPressedCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull AbstractC4717m0 onBackPressedCallback, @NotNull AbstractC9639g info) {
            super(info, onBackPressedCallback.getIsEnabled());
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            Intrinsics.checkNotNullParameter(info, "info");
            this.onBackPressedCallback = onBackPressedCallback;
        }

        @Override // p321o4.AbstractC9637e
        /* JADX INFO: renamed from: o */
        public void mo23007o() {
            this.onBackPressedCallback.handleOnBackCancelled();
        }

        @Override // p321o4.AbstractC9637e
        /* JADX INFO: renamed from: p */
        public void mo23008p() {
            this.onBackPressedCallback.handleOnBackPressed();
        }

        @Override // p321o4.AbstractC9637e
        /* JADX INFO: renamed from: q */
        public void mo23009q(@NotNull NavigationEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.onBackPressedCallback.handleOnBackProgressed(new BackEventCompat(event));
        }

        @Override // p321o4.AbstractC9637e
        /* JADX INFO: renamed from: r */
        public void mo23010r(@NotNull NavigationEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.onBackPressedCallback.handleOnBackStarted(new BackEventCompat(event));
        }
    }

    public AbstractC4717m0(boolean z10) {
        this.isEnabled = z10;
    }

    public final void addCloseable$activity(@NotNull AutoCloseable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        this.closeables.add(closeable);
    }

    @NotNull
    public final AbstractC9637e<?> createNavigationEventHandler$activity(@NotNull AbstractC9639g info) {
        Intrinsics.checkNotNullParameter(info, "info");
        a aVar = new a(this, info);
        this.eventHandlers.add(aVar);
        return aVar;
    }

    public void handleOnBackCancelled() {
    }

    public abstract void handleOnBackPressed();

    public void handleOnBackProgressed(@NotNull BackEventCompat backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
    }

    public void handleOnBackStarted(@NotNull BackEventCompat backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
    }

    /* JADX INFO: renamed from: isEnabled, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public final void remove() {
        Iterator<AutoCloseable> it = this.closeables.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            C4711j0.m23003a(it.next());
        }
        this.closeables.clear();
        Iterator<AbstractC9637e<?>> it2 = this.eventHandlers.iterator();
        while (it2.hasNext()) {
            it2.next().m38052w();
        }
        this.eventHandlers.clear();
    }

    public final void setEnabled(boolean z10) {
        this.isEnabled = z10;
        Iterator<AbstractC9637e<?>> it = this.eventHandlers.iterator();
        while (it.hasNext()) {
            it.next().m38053x(z10);
        }
    }
}
