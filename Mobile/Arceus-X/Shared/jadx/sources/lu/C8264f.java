package lu;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p256ku.C7864g1;
import p256ku.C7865g2;
import p256ku.C7912q2;
import p256ku.InterfaceC7874i1;
import p256ku.InterfaceC7897n;
import p256ku.InterfaceC7942y0;

/* JADX INFO: renamed from: lu.f */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B#\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u001d\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010!H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J#\u0010(\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0002¢\u0006\u0004\b(\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00102\u001a\u00020\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010/\u001a\u0004\b0\u00101¨\u00063"}, m31665d2 = {"Llu/f;", "Llu/g;", "Lku/y0;", "Landroid/os/Handler;", "handler", "", "name", "", "invokeImmediately", "<init>", "(Landroid/os/Handler;Ljava/lang/String;Z)V", "(Landroid/os/Handler;Ljava/lang/String;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "H", "(Lkotlin/coroutines/CoroutineContext;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "w", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "", "timeMillis", "Lku/n;", "continuation", "o", "(JLku/n;)V", "Lku/i1;", "f", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lku/i1;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "e0", "c", "Landroid/os/Handler;", "d", "Ljava/lang/String;", "e", "Z", "Llu/f;", "f0", "()Llu/f;", "immediate", "kotlinx-coroutines-android"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C8264f extends AbstractC8265g implements InterfaceC7942y0 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Handler handler;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final String name;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean invokeImmediately;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final C8264f immediate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8264f(Handler handler, String str, boolean z10) {
        super(null);
        this.handler = handler;
        this.name = str;
        this.invokeImmediately = z10;
        this.immediate = z10 ? this : new C8264f(handler, str, true);
    }

    /* JADX INFO: renamed from: i0 */
    public static final void m33649i0(C8264f c8264f, Runnable runnable) {
        c8264f.handler.removeCallbacks(runnable);
    }

    /* JADX INFO: renamed from: l0 */
    public static final void m33650l0(InterfaceC7897n interfaceC7897n, C8264f c8264f) {
        interfaceC7897n.mo32818x(c8264f, Unit.f29331a);
    }

    /* JADX INFO: renamed from: r0 */
    public static final Unit m33651r0(C8264f c8264f, Runnable runnable, Throwable th2) {
        c8264f.handler.removeCallbacks(runnable);
        return Unit.f29331a;
    }

    @Override // p256ku.AbstractC7888l0
    /* JADX INFO: renamed from: H */
    public boolean mo6245H(@NotNull CoroutineContext context) {
        return (this.invokeImmediately && Intrinsics.m31980c(Looper.myLooper(), this.handler.getLooper())) ? false : true;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m33652e0(CoroutineContext context, Runnable block) {
        C7865g2.m32649c(context, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C7864g1.m32644b().mo6246w(context, block);
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof C8264f)) {
            return false;
        }
        C8264f c8264f = (C8264f) other;
        return c8264f.handler == this.handler && c8264f.invokeImmediately == this.invokeImmediately;
    }

    @Override // lu.AbstractC8265g, p256ku.InterfaceC7942y0
    @NotNull
    /* JADX INFO: renamed from: f */
    public InterfaceC7874i1 mo32840f(long timeMillis, @NotNull final Runnable block, @NotNull CoroutineContext context) {
        if (this.handler.postDelayed(block, C7764d.m32082g(timeMillis, 4611686018427387903L))) {
            return new InterfaceC7874i1() { // from class: lu.e
                @Override // p256ku.InterfaceC7874i1
                /* JADX INFO: renamed from: a */
                public final void mo32664a() {
                    C8264f.m33649i0(this.f30560a, block);
                }
            };
        }
        m33652e0(context, block);
        return C7912q2.f29793a;
    }

    /* JADX DEBUG: Method merged with bridge method: X()Lku/n2; */
    @Override // p256ku.AbstractC7900n2
    @NotNull
    /* JADX INFO: renamed from: f0, reason: from getter and merged with bridge method [inline-methods] */
    public C8264f mo32847X() {
        return this.immediate;
    }

    public int hashCode() {
        return System.identityHashCode(this.handler) ^ (this.invokeImmediately ? 1231 : 1237);
    }

    @Override // p256ku.InterfaceC7942y0
    /* JADX INFO: renamed from: o */
    public void mo32841o(long timeMillis, @NotNull final InterfaceC7897n<? super Unit> continuation) {
        final Runnable runnable = new Runnable() { // from class: lu.c
            @Override // java.lang.Runnable
            public final void run() {
                C8264f.m33650l0(continuation, this);
            }
        };
        if (this.handler.postDelayed(runnable, C7764d.m32082g(timeMillis, 4611686018427387903L))) {
            continuation.mo32815n(new Function1() { // from class: lu.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C8264f.m33651r0(this.f30558a, runnable, (Throwable) obj);
                }
            });
        } else {
            m33652e0(continuation.getContext(), runnable);
        }
    }

    @Override // p256ku.AbstractC7900n2, p256ku.AbstractC7888l0
    @NotNull
    /* JADX INFO: renamed from: toString */
    public String getName() {
        String strM32848Y = m32848Y();
        if (strM32848Y != null) {
            return strM32848Y;
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

    @Override // p256ku.AbstractC7888l0
    /* JADX INFO: renamed from: w */
    public void mo6246w(@NotNull CoroutineContext context, @NotNull Runnable block) {
        if (this.handler.post(block)) {
            return;
        }
        m33652e0(context, block);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
      (r1v0 android.os.Handler)
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
     A[MD:(android.os.Handler, java.lang.String):void (m)] (LINE:7) call: lu.f.<init>(android.os.Handler, java.lang.String):void type: THIS */
    public /* synthetic */ C8264f(Handler handler, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    public C8264f(@NotNull Handler handler, @Nullable String str) {
        this(handler, str, false);
    }
}
