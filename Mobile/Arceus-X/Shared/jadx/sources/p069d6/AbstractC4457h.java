package p069d6;

import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p026b6.InterfaceC1236a;
import p161h6.InterfaceC6292b;
import p536x5.AbstractC12732w;

/* JADX INFO: renamed from: d6.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00028\u0000H&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH&¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001bR0\u0010 \u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\u001dj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t`\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001bR$\u0010&\u001a\u00028\u00002\u0006\u0010#\u001a\u00028\u00008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u0010\"\u0004\b$\u0010%¨\u0006'"}, m31665d2 = {"Ld6/h;", "T", "", "Landroid/content/Context;", "context", "Lh6/b;", "taskExecutor", "<init>", "(Landroid/content/Context;Lh6/b;)V", "Lb6/a;", "listener", "", "c", "(Lb6/a;)V", "g", "f", "()Ljava/lang/Object;", "i", "()V", "j", "a", "Lh6/b;", "b", "Landroid/content/Context;", "d", "()Landroid/content/Context;", "appContext", "Ljava/lang/Object;", "lock", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "Ljava/util/LinkedHashSet;", "listeners", "e", "currentState", "newState", "h", "(Ljava/lang/Object;)V", "state", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public abstract class AbstractC4457h<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC6292b taskExecutor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Context appContext;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Object lock;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final LinkedHashSet<InterfaceC1236a<T>> listeners;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public T currentState;

    public AbstractC4457h(@NotNull Context context, @NotNull InterfaceC6292b taskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        this.taskExecutor = taskExecutor;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.appContext = applicationContext;
        this.lock = new Object();
        this.listeners = new LinkedHashSet<>();
    }

    /* JADX INFO: renamed from: b */
    public static final void m22386b(List list, AbstractC4457h abstractC4457h) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC1236a) it.next()).mo6932a(abstractC4457h.currentState);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m22387c(@NotNull InterfaceC1236a<T> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.lock) {
            try {
                if (this.listeners.add(listener)) {
                    if (this.listeners.size() == 1) {
                        this.currentState = mo22374f();
                        AbstractC12732w.m47441e().mo47444a(C4458i.f18469a, getClass().getSimpleName() + ": initial state = " + this.currentState);
                        mo22382i();
                    }
                    listener.mo6932a(this.currentState);
                }
                Unit unit = Unit.f29331a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Context getAppContext() {
        return this.appContext;
    }

    /* JADX INFO: renamed from: e */
    public final T m22389e() {
        T t8 = this.currentState;
        return t8 == null ? mo22374f() : t8;
    }

    /* JADX INFO: renamed from: f */
    public abstract T mo22374f();

    /* JADX INFO: renamed from: g */
    public final void m22390g(@NotNull InterfaceC1236a<T> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.lock) {
            try {
                if (this.listeners.remove(listener) && this.listeners.isEmpty()) {
                    mo22383j();
                }
                Unit unit = Unit.f29331a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m22391h(T t8) {
        synchronized (this.lock) {
            T t10 = this.currentState;
            if (t10 == null || !Intrinsics.m31980c(t10, t8)) {
                this.currentState = t8;
                final List listM0 = CollectionsKt.m31687M0(this.listeners);
                this.taskExecutor.mo27570a().execute(new Runnable() { // from class: d6.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC4457h.m22386b(listM0, this);
                    }
                });
                Unit unit = Unit.f29331a;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo22382i();

    /* JADX INFO: renamed from: j */
    public abstract void mo22383j();
}
