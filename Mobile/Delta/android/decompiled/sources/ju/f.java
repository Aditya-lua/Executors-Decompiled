package ju;

import android.os.Handler;
import android.os.Looper;
import iu.g1;
import iu.g2;
import iu.i1;
import iu.n;
import iu.q2;
import iu.y0;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B#\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u001d\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010!H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J#\u0010(\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0002¢\u0006\u0004\b(\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00103\u001a\u00020\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lju/f;", "Lju/g;", "Liu/y0;", "Landroid/os/Handler;", "handler", "", "name", "", "invokeImmediately", "<init>", "(Landroid/os/Handler;Ljava/lang/String;Z)V", "(Landroid/os/Handler;Ljava/lang/String;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "I", "(Lkotlin/coroutines/CoroutineContext;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "w", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "", "timeMillis", "Liu/n;", "continuation", "g", "(JLiu/n;)V", "Liu/i1;", "j", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Liu/i1;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "c0", "c", "Landroid/os/Handler;", "d", "Ljava/lang/String;", "e", "Z", "f", "Lju/f;", "d0", "()Lju/f;", "immediate", "kotlinx-coroutines-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f extends g implements y0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Handler handler;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String name;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final boolean invokeImmediately;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final f immediate;

    public f(Handler handler, String str, boolean z10) {
        super(null);
        this.handler = handler;
        this.name = str;
        this.invokeImmediately = z10;
        this.immediate = z10 ? this : new f(handler, str, true);
    }

    public static final void f0(f fVar, Runnable runnable) {
        fVar.handler.removeCallbacks(runnable);
    }

    public static final void i0(n nVar, f fVar) {
        nVar.E(fVar, Unit.f22938a);
    }

    public static final Unit n0(f fVar, Runnable runnable, Throwable th2) {
        fVar.handler.removeCallbacks(runnable);
        return Unit.f22938a;
    }

    @Override // iu.l0
    public boolean I(@NotNull CoroutineContext context) {
        return (this.invokeImmediately && Intrinsics.c(Looper.myLooper(), this.handler.getLooper())) ? false : true;
    }

    public final void c0(CoroutineContext context, Runnable block) {
        g2.c(context, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        g1.b().w(context, block);
    }

    @Override // iu.n2
    @NotNull
    /* JADX INFO: renamed from: d0, reason: from getter and merged with bridge method [inline-methods] */
    public f W() {
        return this.immediate;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof f)) {
            return false;
        }
        f fVar = (f) other;
        return fVar.handler == this.handler && fVar.invokeImmediately == this.invokeImmediately;
    }

    @Override // iu.y0
    public void g(long timeMillis, @NotNull final n<? super Unit> continuation) {
        final Runnable runnable = new Runnable() { // from class: ju.c
            @Override // java.lang.Runnable
            public final void run() {
                f.i0(continuation, this);
            }
        };
        if (this.handler.postDelayed(runnable, kotlin.ranges.d.g(timeMillis, 4611686018427387903L))) {
            continuation.o(new Function1() { // from class: ju.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return f.n0(this.f22201a, runnable, (Throwable) obj);
                }
            });
        } else {
            c0(continuation.getContext(), runnable);
        }
    }

    public int hashCode() {
        return System.identityHashCode(this.handler) ^ (this.invokeImmediately ? 1231 : 1237);
    }

    @Override // ju.g, iu.y0
    @NotNull
    public i1 j(long timeMillis, @NotNull final Runnable block, @NotNull CoroutineContext context) {
        if (this.handler.postDelayed(block, kotlin.ranges.d.g(timeMillis, 4611686018427387903L))) {
            return new i1() { // from class: ju.e
                @Override // iu.i1
                public final void a() {
                    f.f0(this.f22202a, block);
                }
            };
        }
        c0(context, block);
        return q2.f21417a;
    }

    @Override // iu.n2, iu.l0
    @NotNull
    /* JADX INFO: renamed from: toString */
    public String getName() {
        String strX = X();
        if (strX != null) {
            return strX;
        }
        String string = this.name;
        if (string == null) {
            string = this.handler.toString();
        }
        if (!this.invokeImmediately) {
            return string;
        }
        return string + ".immediate";
    }

    @Override // iu.l0
    public void w(@NotNull CoroutineContext context, @NotNull Runnable block) {
        if (this.handler.post(block)) {
            return;
        }
        c0(context, block);
    }

    public /* synthetic */ f(Handler handler, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    public f(@NotNull Handler handler, @Nullable String str) {
        this(handler, str, false);
    }
}
