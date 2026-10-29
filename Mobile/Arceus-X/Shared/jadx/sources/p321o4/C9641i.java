package p321o4;

import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7685i;
import kotlin.jvm.internal.Intrinsics;
import nu.C9579j;
import nu.C9596r0;
import nu.InterfaceC9566c0;
import nu.InterfaceC9592p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: o4.i */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\u0010\u0010\tJ%\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u0019J'\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\b\b\u0002\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002¢\u0006\u0004\b%\u0010&R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010)R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020(0+8\u0006¢\u0006\f\n\u0004\b\u0013\u0010,\u001a\u0004\b-\u0010.R\u001a\u00101\u001a\b\u0012\u0004\u0012\u0002000'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010)R\u001d\u00103\u001a\b\u0012\u0004\u0012\u0002000+8\u0006¢\u0006\f\n\u0004\b\u001d\u0010,\u001a\u0004\b2\u0010.R\u001e\u00106\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00105R\u001e\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00105R\u001c\u00109\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u00108R\u001c\u0010<\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0010\u0010:\u0012\u0004\b;\u0010\u0003R\u0018\u0010>\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010=R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00110?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010@R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00110?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010@R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00110?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010@R\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010J\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010GR\u0016\u0010L\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010G¨\u0006M"}, m31665d2 = {"Lo4/i;", "", "<init>", "()V", "", "g", "Lo4/e;", "handler", "l", "(Lo4/e;)V", "Lo4/c;", "dispatcher", "", "priority", "a", "(Lo4/c;Lo4/e;I)V", "h", "Lo4/h;", "input", "b", "(Lo4/c;Lo4/h;I)V", "direction", "Lo4/b;", NotificationCompat.CATEGORY_EVENT, "f", "(Lo4/h;ILo4/b;)V", "e", "Lo4/l;", "onBackCompletedFallback", "d", "(Lo4/h;ILo4/l;)V", "c", "(Lo4/h;I)V", "j", "(I)Lo4/e;", "", "Lo4/g;", "i", "()Ljava/util/List;", "Lnu/c0;", "Lo4/j;", "Lnu/c0;", "_transitionState", "Lnu/p0;", "Lnu/p0;", "getTransitionState", "()Lnu/p0;", "transitionState", "Lo4/f;", "_history", "getHistory", "history", "Lkotlin/collections/i;", "Lkotlin/collections/i;", "overlayHandlers", "defaultHandlers", "Lo4/e;", "inProgressHandler", "I", "getInProgressDirection$annotations", "inProgressDirection", "Lo4/h;", "inProgressInput", "", "Ljava/util/Set;", "unspecifiedInputs", "k", "defaultInputs", "overlayInputs", "", "m", "Z", "hasEnabledDefaultHandlers", "n", "hasEnabledOverlayHandlers", "o", "hasEnabledAnyHandlers", "navigationevent"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C9641i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9566c0<AbstractC9642j> _transitionState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9592p0<AbstractC9642j> transitionState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9566c0<NavigationEventHistory> _history;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9592p0<NavigationEventHistory> history;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C7685i<AbstractC9637e<?>> overlayHandlers;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final C7685i<AbstractC9637e<?>> defaultHandlers;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public AbstractC9637e<?> inProgressHandler;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public int inProgressDirection;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public AbstractC9640h inProgressInput;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Set<AbstractC9640h> unspecifiedInputs;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Set<AbstractC9640h> defaultInputs;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Set<AbstractC9640h> overlayInputs;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean hasEnabledDefaultHandlers;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public boolean hasEnabledOverlayHandlers;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public boolean hasEnabledAnyHandlers;

    public C9641i() {
        InterfaceC9566c0<AbstractC9642j> interfaceC9566c0M37859a = C9596r0.m37859a(AbstractC9642j.b.f34975b);
        this._transitionState = interfaceC9566c0M37859a;
        this.transitionState = C9579j.m37784a(interfaceC9566c0M37859a);
        InterfaceC9566c0<NavigationEventHistory> interfaceC9566c0M37859a2 = C9596r0.m37859a(new NavigationEventHistory());
        this._history = interfaceC9566c0M37859a2;
        this.history = C9579j.m37784a(interfaceC9566c0M37859a2);
        this.overlayHandlers = new C7685i<>();
        this.defaultHandlers = new C7685i<>();
        this.unspecifiedInputs = new LinkedHashSet();
        this.defaultInputs = new LinkedHashSet();
        this.overlayInputs = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ AbstractC9637e m38066k(C9641i c9641i, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return c9641i.m38076j(i10);
    }

    /* JADX INFO: renamed from: a */
    public final void m38067a(@NotNull C9635c dispatcher, @NotNull AbstractC9637e<?> handler, int priority) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (handler.getDispatcher() != null) {
            throw new IllegalArgumentException(("Handler '" + handler + "' is already registered with a dispatcher").toString());
        }
        if (priority == 0) {
            this.overlayHandlers.addFirst(handler);
        } else {
            if (priority != 1) {
                throw new IllegalArgumentException("Unsupported priority value: " + priority);
            }
            this.defaultHandlers.addFirst(handler);
        }
        handler.m38054y(dispatcher);
        m38073g();
    }

    /* JADX INFO: renamed from: b */
    public final void m38068b(@NotNull C9635c dispatcher, @NotNull AbstractC9640h input, int priority) {
        Set<AbstractC9640h> set;
        boolean z10;
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.getDispatcher() != null) {
            throw new IllegalArgumentException(("Input '" + input + "' is already added to dispatcher " + input.getDispatcher() + '.').toString());
        }
        if (priority != 0) {
            set = priority != 1 ? this.unspecifiedInputs : this.defaultInputs;
        } else {
            set = this.overlayInputs;
        }
        set.add(input);
        input.m38065l(dispatcher);
        input.m38059e(dispatcher);
        input.m38061g(this.history.getValue());
        if (priority != 0) {
            z10 = priority != 1 ? this.hasEnabledAnyHandlers : this.hasEnabledDefaultHandlers;
        } else {
            z10 = this.hasEnabledOverlayHandlers;
        }
        input.m38060f(z10);
    }

    /* JADX INFO: renamed from: c */
    public final void m38069c(@NotNull AbstractC9640h input, int direction) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (Intrinsics.m31980c(input, this.inProgressInput) && direction == this.inProgressDirection) {
            AbstractC9637e<?> abstractC9637eM38076j = this.inProgressHandler;
            if (abstractC9637eM38076j == null) {
                abstractC9637eM38076j = m38076j(direction);
            }
            this.inProgressHandler = null;
            this.inProgressDirection = 0;
            this.inProgressInput = null;
            if (direction != -1) {
                if (direction == 1 && abstractC9637eM38076j != null) {
                    abstractC9637eM38076j.m38038e();
                }
            } else if (abstractC9637eM38076j != null) {
                abstractC9637eM38076j.m38034a();
            }
            this._transitionState.setValue(AbstractC9642j.b.f34975b);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m38070d(@NotNull AbstractC9640h input, int direction, @Nullable InterfaceC9644l onBackCompletedFallback) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (Intrinsics.m31980c(input, this.inProgressInput) && direction == this.inProgressDirection) {
            AbstractC9637e<?> abstractC9637eM38076j = this.inProgressHandler;
            if (abstractC9637eM38076j == null) {
                abstractC9637eM38076j = m38076j(direction);
            }
            this.inProgressHandler = null;
            this.inProgressDirection = 0;
            this.inProgressInput = null;
            if (direction != -1) {
                if (direction == 1 && abstractC9637eM38076j != null) {
                    abstractC9637eM38076j.m38039f();
                }
            } else if (abstractC9637eM38076j != null) {
                abstractC9637eM38076j.m38035b();
            } else if (onBackCompletedFallback != null) {
                onBackCompletedFallback.mo23011a();
            }
            this._transitionState.setValue(AbstractC9642j.b.f34975b);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m38071e(@NotNull AbstractC9640h input, int direction, @NotNull NavigationEvent event) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.m31980c(input, this.inProgressInput) && direction == this.inProgressDirection) {
            AbstractC9637e<?> abstractC9637eM38076j = this.inProgressHandler;
            if (abstractC9637eM38076j == null) {
                abstractC9637eM38076j = m38076j(direction);
            }
            if (direction != -1) {
                if (direction == 1 && abstractC9637eM38076j != null) {
                    abstractC9637eM38076j.m38040g(event);
                }
            } else if (abstractC9637eM38076j != null) {
                abstractC9637eM38076j.m38036c(event);
            }
            this._transitionState.setValue(new AbstractC9642j.InProgress(event, direction));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m38072f(@NotNull AbstractC9640h input, int direction, @Nullable NavigationEvent event) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (this.inProgressDirection != 0) {
            return;
        }
        AbstractC9637e<?> abstractC9637eM38076j = m38076j(direction);
        this.inProgressHandler = abstractC9637eM38076j;
        this.inProgressDirection = direction;
        this.inProgressInput = input;
        if (event != null) {
            if (direction != -1) {
                if (direction == 1 && abstractC9637eM38076j != null) {
                    abstractC9637eM38076j.m38041h(event);
                }
            } else if (abstractC9637eM38076j != null) {
                abstractC9637eM38076j.m38037d(event);
            }
            this._transitionState.setValue(new AbstractC9642j.InProgress(event, direction));
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m38073g() {
        boolean z10;
        boolean z11;
        C7685i<AbstractC9637e<?>> c7685i = this.overlayHandlers;
        if (c7685i == null || !c7685i.isEmpty()) {
            Iterator<AbstractC9637e<?>> it = c7685i.iterator();
            while (true) {
                if (it.hasNext()) {
                    AbstractC9637e<?> next = it.next();
                    if (next.m38046m() || next.m38047n()) {
                        z10 = true;
                    }
                } else {
                    z10 = false;
                }
            }
        } else {
            z10 = false;
        }
        C7685i<AbstractC9637e<?>> c7685i2 = this.defaultHandlers;
        if (c7685i2 == null || !c7685i2.isEmpty()) {
            Iterator<AbstractC9637e<?>> it2 = c7685i2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    AbstractC9637e<?> next2 = it2.next();
                    if (next2.m38046m() || next2.m38047n()) {
                        z11 = true;
                    }
                } else {
                    z11 = false;
                }
            }
        } else {
            z11 = false;
        }
        boolean z12 = z10 || z11;
        boolean z13 = this.hasEnabledOverlayHandlers != z10;
        boolean z14 = this.hasEnabledDefaultHandlers != z11;
        boolean z15 = this.hasEnabledAnyHandlers != z12;
        if (z13) {
            Iterator<AbstractC9640h> it3 = this.overlayInputs.iterator();
            while (it3.hasNext()) {
                it3.next().m38060f(z10);
            }
        }
        if (z14) {
            Iterator<AbstractC9640h> it4 = this.defaultInputs.iterator();
            while (it4.hasNext()) {
                it4.next().m38060f(z11);
            }
        }
        if (z15) {
            Iterator<AbstractC9640h> it5 = this.unspecifiedInputs.iterator();
            while (it5.hasNext()) {
                it5.next().m38060f(z12);
            }
        }
        this.hasEnabledOverlayHandlers = z10;
        this.hasEnabledDefaultHandlers = z11;
        this.hasEnabledAnyHandlers = z12;
        AbstractC9637e<?> abstractC9637eM38066k = this.inProgressHandler;
        if (abstractC9637eM38066k == null) {
            abstractC9637eM38066k = m38066k(this, 0, 1, null);
        }
        m38077l(abstractC9637eM38066k);
    }

    /* JADX INFO: renamed from: h */
    public final void m38074h(@NotNull AbstractC9637e<?> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (Intrinsics.m31980c(handler, this.inProgressHandler)) {
            int i10 = this.inProgressDirection;
            if (i10 == -1) {
                handler.m38034a();
            } else if (i10 == 1) {
                handler.m38038e();
            }
            this.inProgressHandler = null;
            this.inProgressDirection = 0;
            this.inProgressInput = null;
        }
        this.overlayHandlers.remove(handler);
        this.defaultHandlers.remove(handler);
        handler.m38054y(null);
        m38073g();
    }

    /* JADX INFO: renamed from: i */
    public final List<AbstractC9639g> m38075i() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC9637e<?> abstractC9637e : this.overlayHandlers) {
            if (abstractC9637e.m38046m() && !abstractC9637e.m38042i().isEmpty()) {
                arrayList.addAll(abstractC9637e.m38042i());
            }
        }
        for (AbstractC9637e<?> abstractC9637e2 : this.defaultHandlers) {
            if (abstractC9637e2.m38046m() && !abstractC9637e2.m38042i().isEmpty()) {
                arrayList.addAll(abstractC9637e2.m38042i());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public final AbstractC9637e<?> m38076j(int direction) {
        AbstractC9637e<?> next;
        AbstractC9637e<?> next2;
        AbstractC9637e<?> abstractC9637e;
        AbstractC9637e<?> next3;
        AbstractC9637e<?> abstractC9637e2 = null;
        if (direction == -1) {
            Iterator<AbstractC9637e<?>> it = this.overlayHandlers.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!next.m38046m());
            AbstractC9637e<?> abstractC9637e3 = next;
            if (abstractC9637e3 != null) {
                return abstractC9637e3;
            }
            for (AbstractC9637e<?> abstractC9637e4 : this.defaultHandlers) {
                if (abstractC9637e4.m38046m()) {
                    abstractC9637e2 = abstractC9637e4;
                    break;
                }
            }
            return abstractC9637e2;
        }
        if (direction == 0) {
            Iterator<AbstractC9637e<?>> it2 = this.overlayHandlers.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                abstractC9637e = next2;
                if (abstractC9637e.m38046m()) {
                    break;
                }
            } while (!abstractC9637e.m38047n());
            AbstractC9637e<?> abstractC9637e5 = next2;
            if (abstractC9637e5 != null) {
                return abstractC9637e5;
            }
            for (AbstractC9637e<?> abstractC9637e6 : this.defaultHandlers) {
                AbstractC9637e<?> abstractC9637e7 = abstractC9637e6;
                if (abstractC9637e7.m38046m() || abstractC9637e7.m38047n()) {
                    abstractC9637e2 = abstractC9637e6;
                    break;
                }
            }
            return abstractC9637e2;
        }
        if (direction != 1) {
            throw new IllegalStateException(("Unsupported direction: '" + direction + "'.").toString());
        }
        Iterator<AbstractC9637e<?>> it3 = this.overlayHandlers.iterator();
        do {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
        } while (!next3.m38047n());
        AbstractC9637e<?> abstractC9637e8 = next3;
        if (abstractC9637e8 != null) {
            return abstractC9637e8;
        }
        for (AbstractC9637e<?> abstractC9637e9 : this.defaultHandlers) {
            if (abstractC9637e9.m38047n()) {
                abstractC9637e2 = abstractC9637e9;
                break;
            }
        }
        return abstractC9637e2;
    }

    /* JADX INFO: renamed from: l */
    public final void m38077l(@Nullable AbstractC9637e<?> handler) {
        NavigationEventHistory navigationEventHistory;
        AbstractC9637e<?> abstractC9637eM38066k = this.inProgressHandler;
        if (abstractC9637eM38066k == null) {
            abstractC9637eM38066k = m38066k(this, 0, 1, null);
        }
        if (Intrinsics.m31980c(abstractC9637eM38066k, handler)) {
            if (abstractC9637eM38066k == null) {
                navigationEventHistory = new NavigationEventHistory();
            } else {
                navigationEventHistory = new NavigationEventHistory(abstractC9637eM38066k.m38043j(), m38075i(), abstractC9637eM38066k.m38045l());
            }
            if (Intrinsics.m31980c(this._history.getValue(), navigationEventHistory)) {
                return;
            }
            this._history.setValue(navigationEventHistory);
            Iterator<AbstractC9640h> it = this.overlayInputs.iterator();
            while (it.hasNext()) {
                it.next().m38061g(navigationEventHistory);
            }
            Iterator<AbstractC9640h> it2 = this.defaultInputs.iterator();
            while (it2.hasNext()) {
                it2.next().m38061g(navigationEventHistory);
            }
            Iterator<AbstractC9640h> it3 = this.unspecifiedInputs.iterator();
            while (it3.hasNext()) {
                it3.next().m38061g(navigationEventHistory);
            }
        }
    }
}
