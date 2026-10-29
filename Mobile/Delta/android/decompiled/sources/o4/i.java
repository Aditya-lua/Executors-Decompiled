package o4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nu.c0;
import nu.p0;
import nu.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\u0010\u0010\tJ%\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u0019J'\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\b\b\u0002\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002¢\u0006\u0004\b%\u0010&R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010)R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020(0+8\u0006¢\u0006\f\n\u0004\b\u0013\u0010,\u001a\u0004\b-\u0010.R\u001a\u00101\u001a\b\u0012\u0004\u0012\u0002000'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010)R\u001d\u00103\u001a\b\u0012\u0004\u0012\u0002000+8\u0006¢\u0006\f\n\u0004\b\u001d\u0010,\u001a\u0004\b2\u0010.R\u001e\u00106\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00105R\u001e\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00105R\u001c\u00109\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u00108R\u001c\u0010<\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0010\u0010:\u0012\u0004\b;\u0010\u0003R\u0018\u0010>\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010=R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00110?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010@R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00110?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010@R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00110?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010@R\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010J\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010GR\u0016\u0010L\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010G¨\u0006M"}, d2 = {"Lo4/i;", "", "<init>", "()V", "", "g", "Lo4/e;", "handler", "l", "(Lo4/e;)V", "Lo4/c;", "dispatcher", "", "priority", "a", "(Lo4/c;Lo4/e;I)V", "h", "Lo4/h;", "input", "b", "(Lo4/c;Lo4/h;I)V", "direction", "Lo4/b;", "event", "f", "(Lo4/h;ILo4/b;)V", "e", "Lo4/l;", "onBackCompletedFallback", "d", "(Lo4/h;ILo4/l;)V", "c", "(Lo4/h;I)V", "j", "(I)Lo4/e;", "", "Lo4/g;", "i", "()Ljava/util/List;", "Lnu/c0;", "Lo4/j;", "Lnu/c0;", "_transitionState", "Lnu/p0;", "Lnu/p0;", "getTransitionState", "()Lnu/p0;", "transitionState", "Lo4/f;", "_history", "getHistory", "history", "Lkotlin/collections/i;", "Lkotlin/collections/i;", "overlayHandlers", "defaultHandlers", "Lo4/e;", "inProgressHandler", "I", "getInProgressDirection$annotations", "inProgressDirection", "Lo4/h;", "inProgressInput", "", "Ljava/util/Set;", "unspecifiedInputs", "k", "defaultInputs", "overlayInputs", "", "m", "Z", "hasEnabledDefaultHandlers", "n", "hasEnabledOverlayHandlers", "o", "hasEnabledAnyHandlers", "navigationevent"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c0<j> _transitionState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final p0<j> transitionState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c0<NavigationEventHistory> _history;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0<NavigationEventHistory> history;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final kotlin.collections.i<e<?>> overlayHandlers;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final kotlin.collections.i<e<?>> defaultHandlers;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public e<?> inProgressHandler;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int inProgressDirection;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public h inProgressInput;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Set<h> unspecifiedInputs;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Set<h> defaultInputs;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Set<h> overlayInputs;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public boolean hasEnabledDefaultHandlers;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean hasEnabledOverlayHandlers;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public boolean hasEnabledAnyHandlers;

    public i() {
        c0<j> c0VarA = r0.a(j.b.b);
        this._transitionState = c0VarA;
        this.transitionState = nu.j.a(c0VarA);
        c0<NavigationEventHistory> c0VarA2 = r0.a(new NavigationEventHistory());
        this._history = c0VarA2;
        this.history = nu.j.a(c0VarA2);
        this.overlayHandlers = new kotlin.collections.i<>();
        this.defaultHandlers = new kotlin.collections.i<>();
        this.unspecifiedInputs = new LinkedHashSet();
        this.defaultInputs = new LinkedHashSet();
        this.overlayInputs = new LinkedHashSet();
    }

    public static /* synthetic */ e k(i iVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return iVar.j(i10);
    }

    public final void a(@NotNull c dispatcher, @NotNull e<?> handler, int priority) {
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
        handler.y(dispatcher);
        g();
    }

    public final void b(@NotNull c dispatcher, @NotNull h input, int priority) {
        Set<h> set;
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
        input.l(dispatcher);
        input.e(dispatcher);
        input.g(this.history.getValue());
        if (priority != 0) {
            z10 = priority != 1 ? this.hasEnabledAnyHandlers : this.hasEnabledDefaultHandlers;
        } else {
            z10 = this.hasEnabledOverlayHandlers;
        }
        input.f(z10);
    }

    public final void c(@NotNull h input, int direction) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (Intrinsics.c(input, this.inProgressInput) && direction == this.inProgressDirection) {
            e<?> eVarJ = this.inProgressHandler;
            if (eVarJ == null) {
                eVarJ = j(direction);
            }
            this.inProgressHandler = null;
            this.inProgressDirection = 0;
            this.inProgressInput = null;
            if (direction != -1) {
                if (direction == 1 && eVarJ != null) {
                    eVarJ.e();
                }
            } else if (eVarJ != null) {
                eVarJ.a();
            }
            this._transitionState.setValue(j.b.b);
        }
    }

    public final void d(@NotNull h input, int direction, @Nullable l onBackCompletedFallback) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (Intrinsics.c(input, this.inProgressInput) && direction == this.inProgressDirection) {
            e<?> eVarJ = this.inProgressHandler;
            if (eVarJ == null) {
                eVarJ = j(direction);
            }
            this.inProgressHandler = null;
            this.inProgressDirection = 0;
            this.inProgressInput = null;
            if (direction != -1) {
                if (direction == 1 && eVarJ != null) {
                    eVarJ.f();
                }
            } else if (eVarJ != null) {
                eVarJ.b();
            } else if (onBackCompletedFallback != null) {
                onBackCompletedFallback.a();
            }
            this._transitionState.setValue(j.b.b);
        }
    }

    public final void e(@NotNull h input, int direction, @NotNull NavigationEvent event) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.c(input, this.inProgressInput) && direction == this.inProgressDirection) {
            e<?> eVarJ = this.inProgressHandler;
            if (eVarJ == null) {
                eVarJ = j(direction);
            }
            if (direction != -1) {
                if (direction == 1 && eVarJ != null) {
                    eVarJ.g(event);
                }
            } else if (eVarJ != null) {
                eVarJ.c(event);
            }
            this._transitionState.setValue(new j.InProgress(event, direction));
        }
    }

    public final void f(@NotNull h input, int direction, @Nullable NavigationEvent event) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (this.inProgressDirection != 0) {
            return;
        }
        e<?> eVarJ = j(direction);
        this.inProgressHandler = eVarJ;
        this.inProgressDirection = direction;
        this.inProgressInput = input;
        if (event != null) {
            if (direction != -1) {
                if (direction == 1 && eVarJ != null) {
                    eVarJ.h(event);
                }
            } else if (eVarJ != null) {
                eVarJ.d(event);
            }
            this._transitionState.setValue(new j.InProgress(event, direction));
        }
    }

    public final void g() {
        boolean z10;
        boolean z11;
        kotlin.collections.i<e<?>> iVar = this.overlayHandlers;
        if (iVar == null || !iVar.isEmpty()) {
            Iterator<e<?>> it = iVar.iterator();
            while (true) {
                if (it.hasNext()) {
                    e<?> next = it.next();
                    if (next.m() || next.n()) {
                        z10 = true;
                    }
                } else {
                    z10 = false;
                }
            }
        } else {
            z10 = false;
        }
        kotlin.collections.i<e<?>> iVar2 = this.defaultHandlers;
        if (iVar2 == null || !iVar2.isEmpty()) {
            Iterator<e<?>> it2 = iVar2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    e<?> next2 = it2.next();
                    if (next2.m() || next2.n()) {
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
            Iterator<h> it3 = this.overlayInputs.iterator();
            while (it3.hasNext()) {
                it3.next().f(z10);
            }
        }
        if (z14) {
            Iterator<h> it4 = this.defaultInputs.iterator();
            while (it4.hasNext()) {
                it4.next().f(z11);
            }
        }
        if (z15) {
            Iterator<h> it5 = this.unspecifiedInputs.iterator();
            while (it5.hasNext()) {
                it5.next().f(z12);
            }
        }
        this.hasEnabledOverlayHandlers = z10;
        this.hasEnabledDefaultHandlers = z11;
        this.hasEnabledAnyHandlers = z12;
        e<?> eVarK = this.inProgressHandler;
        if (eVarK == null) {
            eVarK = k(this, 0, 1, null);
        }
        l(eVarK);
    }

    public final void h(@NotNull e<?> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (Intrinsics.c(handler, this.inProgressHandler)) {
            int i10 = this.inProgressDirection;
            if (i10 == -1) {
                handler.a();
            } else if (i10 == 1) {
                handler.e();
            }
            this.inProgressHandler = null;
            this.inProgressDirection = 0;
            this.inProgressInput = null;
        }
        this.overlayHandlers.remove(handler);
        this.defaultHandlers.remove(handler);
        handler.y(null);
        g();
    }

    public final List<g> i() {
        ArrayList arrayList = new ArrayList();
        for (e<?> eVar : this.overlayHandlers) {
            if (eVar.m() && !eVar.i().isEmpty()) {
                arrayList.addAll(eVar.i());
            }
        }
        for (e<?> eVar2 : this.defaultHandlers) {
            if (eVar2.m() && !eVar2.i().isEmpty()) {
                arrayList.addAll(eVar2.i());
            }
        }
        return arrayList;
    }

    public final e<?> j(int direction) {
        e<?> next;
        e<?> next2;
        e<?> eVar;
        e<?> next3;
        e<?> eVar2 = null;
        if (direction == -1) {
            Iterator<e<?>> it = this.overlayHandlers.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!next.m());
            e<?> eVar3 = next;
            if (eVar3 != null) {
                return eVar3;
            }
            for (e<?> eVar4 : this.defaultHandlers) {
                if (eVar4.m()) {
                    eVar2 = eVar4;
                    break;
                }
            }
            return eVar2;
        }
        if (direction == 0) {
            Iterator<e<?>> it2 = this.overlayHandlers.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                eVar = next2;
                if (eVar.m()) {
                    break;
                }
            } while (!eVar.n());
            e<?> eVar5 = next2;
            if (eVar5 != null) {
                return eVar5;
            }
            for (e<?> eVar6 : this.defaultHandlers) {
                e<?> eVar7 = eVar6;
                if (eVar7.m() || eVar7.n()) {
                    eVar2 = eVar6;
                    break;
                }
            }
            return eVar2;
        }
        if (direction != 1) {
            throw new IllegalStateException(("Unsupported direction: '" + direction + "'.").toString());
        }
        Iterator<e<?>> it3 = this.overlayHandlers.iterator();
        do {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
        } while (!next3.n());
        e<?> eVar8 = next3;
        if (eVar8 != null) {
            return eVar8;
        }
        for (e<?> eVar9 : this.defaultHandlers) {
            if (eVar9.n()) {
                eVar2 = eVar9;
                break;
            }
        }
        return eVar2;
    }

    public final void l(@Nullable e<?> handler) {
        NavigationEventHistory navigationEventHistory;
        e<?> eVarK = this.inProgressHandler;
        if (eVarK == null) {
            eVarK = k(this, 0, 1, null);
        }
        if (Intrinsics.c(eVarK, handler)) {
            if (eVarK == null) {
                navigationEventHistory = new NavigationEventHistory();
            } else {
                navigationEventHistory = new NavigationEventHistory(eVarK.j(), i(), eVarK.l());
            }
            if (Intrinsics.c(this._history.getValue(), navigationEventHistory)) {
                return;
            }
            this._history.setValue(navigationEventHistory);
            Iterator<h> it = this.overlayInputs.iterator();
            while (it.hasNext()) {
                it.next().g(navigationEventHistory);
            }
            Iterator<h> it2 = this.defaultInputs.iterator();
            while (it2.hasNext()) {
                it2.next().g(navigationEventHistory);
            }
            Iterator<h> it3 = this.unspecifiedInputs.iterator();
            while (it3.hasNext()) {
                it3.next().g(navigationEventHistory);
            }
        }
    }
}
