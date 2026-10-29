package p256ku;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7729c0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7328a;
import p315nt.InterfaceC9557b;
import p344ot.C10046b;
import p344ot.C10047c;
import p395qu.C10740p;
import p563y1.C12996b;
import pt.C10346h;

/* JADX INFO: renamed from: ku.j2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0005i\u0098\u0001¦\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000fH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\u00020\u0014*\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b$\u0010!J\u0019\u0010&\u001a\u00020%2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020+H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0004H\u0002¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b0\u00101J\u001b\u00102\u001a\u0004\u0018\u00010\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b2\u00103J\u0019\u00104\u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b4\u00105J\u001b\u00106\u001a\u0004\u0018\u00010\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b6\u00103J\u0019\u00107\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\t\u001a\u00020\u0017H\u0002¢\u0006\u0004\b7\u00108J\u001f\u00109\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b9\u0010:J%\u0010;\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b;\u0010<J#\u0010=\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u00172\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b=\u0010>J*\u0010A\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010@\u001a\u00020?2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0082\u0010¢\u0006\u0004\bA\u0010BJ)\u0010D\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010C\u001a\u00020?2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bD\u0010EJ\u0015\u0010G\u001a\u0004\u0018\u00010?*\u00020FH\u0002¢\u0006\u0004\bG\u0010HJ\u0019\u0010J\u001a\u00020I2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bJ\u0010KJ\u0012\u0010L\u001a\u0004\u0018\u00010\nH\u0082@¢\u0006\u0004\bL\u00101J\u0019\u0010N\u001a\u00020\u00142\b\u0010M\u001a\u0004\u0018\u00010\u0001H\u0004¢\u0006\u0004\bN\u0010OJ\r\u0010P\u001a\u00020\u0004¢\u0006\u0004\bP\u0010/J\u000f\u0010Q\u001a\u00020\u0014H\u0014¢\u0006\u0004\bQ\u0010RJ\u0011\u0010U\u001a\u00060Sj\u0002`T¢\u0006\u0004\bU\u0010VJ#\u0010X\u001a\u00060Sj\u0002`T*\u00020\u000f2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010IH\u0004¢\u0006\u0004\bX\u0010YJ'\u0010^\u001a\u00020]2\u0018\u0010\\\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00140Zj\u0002`[¢\u0006\u0004\b^\u0010_J7\u0010b\u001a\u00020]2\u0006\u0010`\u001a\u00020\u00042\u0006\u0010a\u001a\u00020\u00042\u0018\u0010\\\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00140Zj\u0002`[¢\u0006\u0004\bb\u0010cJ\u001f\u0010e\u001a\u00020]2\u0006\u0010a\u001a\u00020\u00042\u0006\u0010d\u001a\u00020+H\u0000¢\u0006\u0004\be\u0010fJ\u0010\u0010g\u001a\u00020\u0014H\u0086@¢\u0006\u0004\bg\u00101J\u0017\u0010h\u001a\u00020\u00142\u0006\u0010d\u001a\u00020+H\u0000¢\u0006\u0004\bh\u0010-J\u001f\u0010i\u001a\u00020\u00142\u000e\u0010\u001f\u001a\n\u0018\u00010Sj\u0004\u0018\u0001`TH\u0016¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020IH\u0014¢\u0006\u0004\bk\u0010lJ\u0017\u0010m\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\bm\u0010nJ\u0015\u0010p\u001a\u00020\u00142\u0006\u0010o\u001a\u00020\u0003¢\u0006\u0004\bp\u0010qJ\u0017\u0010r\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\br\u0010#J\u0017\u0010s\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\bs\u0010#J\u0019\u0010t\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\bt\u0010uJ\u0013\u0010v\u001a\u00060Sj\u0002`TH\u0016¢\u0006\u0004\bv\u0010VJ\u0019\u0010w\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\bw\u0010uJ\u001b\u0010x\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\bx\u00103J\u0015\u0010z\u001a\u00020y2\u0006\u0010@\u001a\u00020\u0002¢\u0006\u0004\bz\u0010{J\u0017\u0010}\u001a\u00020\u00142\u0006\u0010|\u001a\u00020\u000fH\u0010¢\u0006\u0004\b}\u0010nJ\u0019\u0010~\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b~\u0010nJ\u0017\u0010\u007f\u001a\u00020\u00042\u0006\u0010|\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u007f\u0010#J\u001c\u0010\u0080\u0001\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u001c\u0010\u0082\u0001\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0006\b\u0082\u0001\u0010\u0081\u0001J\u0011\u0010\u0083\u0001\u001a\u00020IH\u0016¢\u0006\u0005\b\u0083\u0001\u0010lJ\u0011\u0010\u0084\u0001\u001a\u00020IH\u0007¢\u0006\u0005\b\u0084\u0001\u0010lJ\u0011\u0010\u0085\u0001\u001a\u00020IH\u0010¢\u0006\u0005\b\u0085\u0001\u0010lJ\u0014\u0010\u0086\u0001\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0014\u0010\u0088\u0001\u001a\u0004\u0018\u00010\nH\u0084@¢\u0006\u0005\b\u0088\u0001\u00101R\u001e\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u000f*\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u00105R\u0019\u0010\u008e\u0001\u001a\u0007\u0012\u0002\b\u00030\u008b\u00018F¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R.\u0010\u0094\u0001\u001a\u0004\u0018\u00010y2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010y8@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0018\u0010M\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0087\u0001R\u0016\u0010\u0099\u0001\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010/R\u0013\u0010\u009b\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010/R\u0013\u0010\u009c\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010/R\u0016\u0010\u009e\u0001\u001a\u00020\u00048PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010/R\u0016\u0010 \u0001\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0007\u001a\u0005\b\u009f\u0001\u0010/R\u0016\u0010¢\u0001\u001a\u00020\u00048PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b¡\u0001\u0010/R\u0015\u0010¤\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\n0£\u00018\u0002X\u0082\u0004R\u0015\u0010¥\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010y0£\u00018\u0002X\u0082\u0004¨\u0006§\u0001"}, m31665d2 = {"Lku/j2;", "Lku/d2;", "Lku/w;", "Lku/s2;", "", "active", "<init>", "(Z)V", "Lku/j2$c;", "state", "", "proposedUpdate", "c0", "(Lku/j2$c;Ljava/lang/Object;)Ljava/lang/Object;", "", "", "exceptions", "f0", "(Lku/j2$c;Ljava/util/List;)Ljava/lang/Throwable;", "rootCause", "", "O", "(Ljava/lang/Throwable;Ljava/util/List;)V", "Lku/y1;", "update", "O0", "(Lku/y1;Ljava/lang/Object;)Z", "Z", "(Lku/y1;Ljava/lang/Object;)V", "Lku/o2;", "list", "cause", "A0", "(Lku/o2;Ljava/lang/Throwable;)V", "W", "(Ljava/lang/Throwable;)Z", "B0", "", "J0", "(Ljava/lang/Object;)I", "Lku/l1;", "F0", "(Lku/l1;)V", "Lku/i2;", "G0", "(Lku/i2;)V", "t0", "()Z", "u0", "(Lnt/b;)Ljava/lang/Object;", "V", "(Ljava/lang/Object;)Ljava/lang/Object;", "b0", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "v0", "i0", "(Lku/y1;)Lku/o2;", "P0", "(Lku/y1;Ljava/lang/Throwable;)Z", "Q0", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "R0", "(Lku/y1;Ljava/lang/Object;)Ljava/lang/Object;", "Lku/v;", "child", "S0", "(Lku/j2$c;Lku/v;Ljava/lang/Object;)Z", "lastChild", "a0", "(Lku/j2$c;Lku/v;Ljava/lang/Object;)V", "Lqu/p;", "z0", "(Lqu/p;)Lku/v;", "", "K0", "(Ljava/lang/Object;)Ljava/lang/String;", "R", "parent", "q0", "(Lku/d2;)V", "start", "E0", "()V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "m", "()Ljava/util/concurrent/CancellationException;", "message", "L0", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lku/i1;", "q", "(Lkotlin/jvm/functions/Function1;)Lku/i1;", "onCancelling", "invokeImmediately", "l", "(ZZLkotlin/jvm/functions/Function1;)Lku/i1;", "node", "r0", "(ZLku/i2;)Lku/i1;", "L", "H0", "c", "(Ljava/util/concurrent/CancellationException;)V", "X", "()Ljava/lang/String;", "U", "(Ljava/lang/Throwable;)V", "parentJob", "j", "(Lku/s2;)V", "Y", "S", "T", "(Ljava/lang/Object;)Z", "u", "w0", "x0", "Lku/u;", "y", "(Lku/w;)Lku/u;", "exception", "p0", "C0", "o0", "D0", "(Ljava/lang/Object;)V", "P", "toString", "N0", "y0", "d0", "()Ljava/lang/Object;", "Q", "e0", "exceptionOrNull", "Lkotlin/coroutines/CoroutineContext$b;", "getKey", "()Lkotlin/coroutines/CoroutineContext$b;", "key", "value", "k0", "()Lku/u;", "I0", "(Lku/u;)V", "parentHandle", "j0", "()Lku/d2;", "l0", "b", "isActive", "d", "isCompleted", "isCancelled", "h0", "onCancelComplete", "s0", "isScopedCoroutine", "g0", "handlesException", "Lkotlinx/atomicfu/AtomicRef;", "_state", "_parentHandle", "a", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public class C7880j2 implements InterfaceC7850d2, InterfaceC7933w, InterfaceC7920s2 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29739a = AtomicReferenceFieldUpdater.newUpdater(C7880j2.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29740b = AtomicReferenceFieldUpdater.newUpdater(C7880j2.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: ku.j2$a */
    @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m31665d2 = {"Lku/j2$a;", "T", "Lku/p;", "Lnt/b;", "delegate", "Lku/j2;", "job", "<init>", "(Lnt/b;Lku/j2;)V", "Lku/d2;", "parent", "", "y", "(Lku/d2;)Ljava/lang/Throwable;", "", "O", "()Ljava/lang/String;", "i", "Lku/j2;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a<T> extends C7905p<T> {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public final C7880j2 job;

        public a(@NotNull InterfaceC9557b<? super T> interfaceC9557b, @NotNull C7880j2 c7880j2) {
            super(interfaceC9557b, 1);
            this.job = c7880j2;
        }

        @Override // p256ku.C7905p
        @NotNull
        /* JADX INFO: renamed from: O */
        public String mo32761O() {
            return "AwaitContinuation";
        }

        @Override // p256ku.C7905p
        @NotNull
        /* JADX INFO: renamed from: y */
        public Throwable mo32762y(@NotNull InterfaceC7850d2 parent) {
            Throwable thM32769f;
            Object objM32750l0 = this.job.m32750l0();
            if (!(objM32750l0 instanceof c) || (thM32769f = ((c) objM32750l0).m32769f()) == null) {
                return objM32750l0 instanceof C7843c0 ? ((C7843c0) objM32750l0).cause : parent.mo32600m();
            }
            return thM32769f;
        }
    }

    /* JADX INFO: renamed from: ku.j2$b */
    @Metadata(m31664d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m31665d2 = {"Lku/j2$b;", "Lku/i2;", "Lku/j2;", "parent", "Lku/j2$c;", "state", "Lku/v;", "child", "", "proposedUpdate", "<init>", "(Lku/j2;Lku/j2$c;Lku/v;Ljava/lang/Object;)V", "", "cause", "", "x", "(Ljava/lang/Throwable;)V", "e", "Lku/j2;", "f", "Lku/j2$c;", "g", "Lku/v;", "h", "Ljava/lang/Object;", "", "w", "()Z", "onCancelling", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class b extends AbstractC7875i2 {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final C7880j2 parent;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public final c state;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        public final C7929v child;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        public final Object proposedUpdate;

        public b(@NotNull C7880j2 c7880j2, @NotNull c cVar, @NotNull C7929v c7929v, @Nullable Object obj) {
            this.parent = c7880j2;
            this.state = cVar;
            this.child = c7929v;
            this.proposedUpdate = obj;
        }

        @Override // p256ku.AbstractC7875i2
        /* JADX INFO: renamed from: w */
        public boolean mo32574w() {
            return false;
        }

        @Override // p256ku.AbstractC7875i2
        /* JADX INFO: renamed from: x */
        public void mo32575x(@Nullable Throwable cause) {
            this.parent.m32740a0(this.state, this.child, this.proposedUpdate);
        }
    }

    /* JADX INFO: renamed from: ku.j2$c */
    @Metadata(m31664d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r2\b\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0017j\b\u0012\u0004\u0012\u00020\b`\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010\u0013R\u0011\u0010'\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b&\u0010 R\u0011\u0010)\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b(\u0010 R\u0014\u0010+\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010 R(\u00100\u001a\u0004\u0018\u00010\u00012\b\u0010\u001e\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u000b\u00102\u001a\u0002018\u0002X\u0082\u0004R\u0013\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b038\u0002X\u0082\u0004R\u0013\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001038\u0002X\u0082\u0004¨\u00066"}, m31665d2 = {"Lku/j2$c;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lku/y1;", "Lku/o2;", "list", "", "isCompleting", "", "rootCause", "<init>", "(Lku/o2;ZLjava/lang/Throwable;)V", "proposedException", "", "m", "(Ljava/lang/Throwable;)Ljava/util/List;", "exception", "", "a", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "c", "()Ljava/util/ArrayList;", "Lku/o2;", "d", "()Lku/o2;", "value", "k", "()Z", "n", "(Z)V", "f", "()Ljava/lang/Throwable;", "p", "l", "isSealed", "j", "isCancelling", "b", "isActive", "e", "()Ljava/lang/Object;", "o", "(Ljava/lang/Object;)V", "exceptionsHolder", "Lkotlinx/atomicfu/AtomicBoolean;", "_isCompleting", "Lkotlinx/atomicfu/AtomicRef;", "_rootCause", "_exceptionsHolder", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class c implements InterfaceC7943y1 {

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f29746b = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting$volatile");

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f29747c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause$volatile");

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f29748d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final C7904o2 list;

        public c(@NotNull C7904o2 c7904o2, boolean z10, @Nullable Throwable th2) {
            this.list = c7904o2;
            this._isCompleting$volatile = z10 ? 1 : 0;
            this._rootCause$volatile = th2;
        }

        /* JADX INFO: renamed from: a */
        public final void m32766a(@NotNull Throwable exception) {
            Throwable thM32769f = m32769f();
            if (thM32769f == null) {
                m32776p(exception);
                return;
            }
            if (exception == thM32769f) {
                return;
            }
            Object objM32768e = m32768e();
            if (objM32768e == null) {
                m32775o(exception);
                return;
            }
            if (objM32768e instanceof Throwable) {
                if (exception == objM32768e) {
                    return;
                }
                ArrayList<Throwable> arrayListM32767c = m32767c();
                arrayListM32767c.add(objM32768e);
                arrayListM32767c.add(exception);
                m32775o(arrayListM32767c);
                return;
            }
            if (objM32768e instanceof ArrayList) {
                ((ArrayList) objM32768e).add(exception);
                return;
            }
            throw new IllegalStateException(("State is " + objM32768e).toString());
        }

        @Override // p256ku.InterfaceC7943y1
        /* JADX INFO: renamed from: b */
        public boolean getIsActive() {
            return m32769f() == null;
        }

        /* JADX INFO: renamed from: c */
        public final ArrayList<Throwable> m32767c() {
            return new ArrayList<>(4);
        }

        @Override // p256ku.InterfaceC7943y1
        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public C7904o2 getList() {
            return this.list;
        }

        /* JADX INFO: renamed from: e */
        public final Object m32768e() {
            return f29748d.get(this);
        }

        @Nullable
        /* JADX INFO: renamed from: f */
        public final Throwable m32769f() {
            return (Throwable) f29747c.get(this);
        }

        /* JADX INFO: renamed from: j */
        public final boolean m32770j() {
            return m32769f() != null;
        }

        /* JADX INFO: renamed from: k */
        public final boolean m32771k() {
            return f29746b.get(this) == 1;
        }

        /* JADX DEBUG: Class process forced to load method for inline: ku.k2.e():qu.e0 */
        /* JADX INFO: renamed from: l */
        public final boolean m32772l() {
            return m32768e() == C7885k2.f29756e;
        }

        @NotNull
        /* JADX INFO: renamed from: m */
        public final List<Throwable> m32773m(@Nullable Throwable proposedException) {
            ArrayList<Throwable> arrayListM32767c;
            Object objM32768e = m32768e();
            if (objM32768e == null) {
                arrayListM32767c = m32767c();
            } else if (objM32768e instanceof Throwable) {
                ArrayList<Throwable> arrayListM32767c2 = m32767c();
                arrayListM32767c2.add(objM32768e);
                arrayListM32767c = arrayListM32767c2;
            } else {
                if (!(objM32768e instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + objM32768e).toString());
                }
                arrayListM32767c = (ArrayList) objM32768e;
            }
            Throwable thM32769f = m32769f();
            if (thM32769f != null) {
                arrayListM32767c.add(0, thM32769f);
            }
            if (proposedException != null && !Intrinsics.m31980c(proposedException, thM32769f)) {
                arrayListM32767c.add(proposedException);
            }
            m32775o(C7885k2.f29756e);
            return arrayListM32767c;
        }

        /* JADX INFO: renamed from: n */
        public final void m32774n(boolean z10) {
            f29746b.set(this, z10 ? 1 : 0);
        }

        /* JADX INFO: renamed from: o */
        public final void m32775o(Object obj) {
            f29748d.set(this, obj);
        }

        /* JADX INFO: renamed from: p */
        public final void m32776p(@Nullable Throwable th2) {
            f29747c.set(this, th2);
        }

        @NotNull
        public String toString() {
            return "Finishing[cancelling=" + m32770j() + ", completing=" + m32771k() + ", rootCause=" + m32769f() + ", exceptions=" + m32768e() + ", list=" + getList() + ']';
        }
    }

    public C7880j2(boolean z10) {
        this._state$volatile = z10 ? C7885k2.f29758g : C7885k2.f29757f;
    }

    /* JADX INFO: renamed from: M0 */
    public static /* synthetic */ CancellationException m32709M0(C7880j2 c7880j2, Throwable th2, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        return c7880j2.m32723L0(th2, str);
    }

    /* JADX INFO: renamed from: A0 */
    public final void m32713A0(C7904o2 list, Throwable cause) throws Throwable {
        m32715C0(cause);
        list.m40900h(4);
        Object objM40904l = list.m40904l();
        Intrinsics.m31981d(objM40904l, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        C7848d0 c7848d0 = null;
        for (C10740p c10740pM40905m = (C10740p) objM40904l; !Intrinsics.m31980c(c10740pM40905m, list); c10740pM40905m = c10740pM40905m.m40905m()) {
            if ((c10740pM40905m instanceof AbstractC7875i2) && ((AbstractC7875i2) c10740pM40905m).mo32574w()) {
                try {
                    ((AbstractC7875i2) c10740pM40905m).mo32575x(cause);
                } catch (Throwable th2) {
                    if (c7848d0 != null) {
                        C7328a.m30429a(c7848d0, th2);
                    } else {
                        c7848d0 = new C7848d0("Exception in completion handler " + c10740pM40905m + " for " + this, th2);
                        Unit unit = Unit.f29331a;
                    }
                }
            }
        }
        if (c7848d0 != null) {
            mo32557p0(c7848d0);
        }
        m32737W(cause);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m32714B0(C7904o2 c7904o2, Throwable th2) throws Throwable {
        c7904o2.m40900h(1);
        Object objM40904l = c7904o2.m40904l();
        Intrinsics.m31981d(objM40904l, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        C7848d0 c7848d0 = null;
        for (C10740p c10740pM40905m = (C10740p) objM40904l; !Intrinsics.m31980c(c10740pM40905m, c7904o2); c10740pM40905m = c10740pM40905m.m40905m()) {
            if (c10740pM40905m instanceof AbstractC7875i2) {
                try {
                    ((AbstractC7875i2) c10740pM40905m).mo32575x(th2);
                } catch (Throwable th3) {
                    if (c7848d0 != null) {
                        C7328a.m30429a(c7848d0, th3);
                    } else {
                        c7848d0 = new C7848d0("Exception in completion handler " + c10740pM40905m + " for " + this, th3);
                        Unit unit = Unit.f29331a;
                    }
                }
            }
        }
        if (c7848d0 != null) {
            mo32557p0(c7848d0);
        }
    }

    /* JADX INFO: renamed from: C0 */
    public void m32715C0(@Nullable Throwable cause) {
    }

    /* JADX INFO: renamed from: D0 */
    public void mo32550D0(@Nullable Object state) {
    }

    /* JADX INFO: renamed from: E0 */
    public void mo32716E0() {
    }

    /* JADX INFO: renamed from: F0 */
    public final void m32717F0(C7889l1 state) {
        C7904o2 c7904o2 = new C7904o2();
        Object c7939x1 = c7904o2;
        if (!state.getIsActive()) {
            c7939x1 = new C7939x1(c7904o2);
        }
        C12996b.m48310a(f29739a, this, state, c7939x1);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m32718G0(AbstractC7875i2 state) {
        state.m40899g(new C7904o2());
        C12996b.m48310a(f29739a, this, state, state.m40905m());
    }

    /* JADX INFO: renamed from: H0 */
    public final void m32719H0(@NotNull AbstractC7875i2 node) {
        Object objM32750l0;
        do {
            objM32750l0 = m32750l0();
            if (!(objM32750l0 instanceof AbstractC7875i2)) {
                if (!(objM32750l0 instanceof InterfaceC7943y1) || ((InterfaceC7943y1) objM32750l0).getList() == null) {
                    return;
                }
                node.m40907s();
                return;
            }
            if (objM32750l0 != node) {
                return;
            }
        } while (!C12996b.m48310a(f29739a, this, objM32750l0, C7885k2.f29758g));
    }

    /* JADX INFO: renamed from: I0 */
    public final void m32720I0(@Nullable InterfaceC7925u interfaceC7925u) {
        f29740b.set(this, interfaceC7925u);
    }

    /* JADX INFO: renamed from: J0 */
    public final int m32721J0(Object state) {
        if (state instanceof C7889l1) {
            if (((C7889l1) state).getIsActive()) {
                return 0;
            }
            if (!C12996b.m48310a(f29739a, this, state, C7885k2.f29758g)) {
                return -1;
            }
            mo32716E0();
            return 1;
        }
        if (!(state instanceof C7939x1)) {
            return 0;
        }
        if (!C12996b.m48310a(f29739a, this, state, ((C7939x1) state).getList())) {
            return -1;
        }
        mo32716E0();
        return 1;
    }

    /* JADX INFO: renamed from: K0 */
    public final String m32722K0(Object state) {
        if (!(state instanceof c)) {
            if (state instanceof InterfaceC7943y1) {
                return ((InterfaceC7943y1) state).getIsActive() ? "Active" : "New";
            }
            return state instanceof C7843c0 ? "Cancelled" : "Completed";
        }
        c cVar = (c) state;
        if (cVar.m32770j()) {
            return "Cancelling";
        }
        return cVar.m32771k() ? "Completing" : "Active";
    }

    @Override // p256ku.InterfaceC7850d2
    @Nullable
    /* JADX INFO: renamed from: L */
    public final Object mo32596L(@NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        if (m32754t0()) {
            Object objM32756u0 = m32756u0(interfaceC9557b);
            return objM32756u0 == C10047c.m38805e() ? objM32756u0 : Unit.f29331a;
        }
        C7865g2.m32652f(interfaceC9557b.getContext());
        return Unit.f29331a;
    }

    @NotNull
    /* JADX INFO: renamed from: L0 */
    public final CancellationException m32723L0(@NotNull Throwable th2, @Nullable String str) {
        CancellationException c7855e2 = th2 instanceof CancellationException ? (CancellationException) th2 : null;
        if (c7855e2 == null) {
            if (str == null) {
                str = mo32555X();
            }
            c7855e2 = new C7855e2(str, th2, this);
        }
        return c7855e2;
    }

    @NotNull
    /* JADX INFO: renamed from: N0 */
    public final String m32724N0() {
        return mo32558y0() + '{' + m32722K0(m32750l0()) + '}';
    }

    /* JADX INFO: renamed from: O */
    public final void m32725O(Throwable rootCause, List<? extends Throwable> exceptions) {
        if (exceptions.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(exceptions.size()));
        for (Throwable th2 : exceptions) {
            if (th2 != rootCause && th2 != rootCause && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                C7328a.m30429a(rootCause, th2);
            }
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final boolean m32726O0(InterfaceC7943y1 state, Object update) throws Throwable {
        if (!C12996b.m48310a(f29739a, this, state, C7885k2.m32788g(update))) {
            return false;
        }
        m32715C0(null);
        mo32550D0(update);
        m32739Z(state, update);
        return true;
    }

    /* JADX INFO: renamed from: P */
    public void mo32584P(@Nullable Object state) {
    }

    /* JADX INFO: renamed from: P0 */
    public final boolean m32727P0(InterfaceC7943y1 state, Throwable rootCause) throws Throwable {
        C7904o2 c7904o2M32746i0 = m32746i0(state);
        if (c7904o2M32746i0 == null) {
            return false;
        }
        if (!C12996b.m48310a(f29739a, this, state, new c(c7904o2M32746i0, false, rootCause))) {
            return false;
        }
        m32713A0(c7904o2M32746i0, rootCause);
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: Q */
    public final Object m32728Q(@NotNull InterfaceC9557b<Object> interfaceC9557b) throws Throwable {
        Object objM32750l0;
        do {
            objM32750l0 = m32750l0();
            if (!(objM32750l0 instanceof InterfaceC7943y1)) {
                if (objM32750l0 instanceof C7843c0) {
                    throw ((C7843c0) objM32750l0).cause;
                }
                return C7885k2.m32789h(objM32750l0);
            }
        } while (m32721J0(objM32750l0) < 0);
        return m32730R(interfaceC9557b);
    }

    /* JADX INFO: renamed from: Q0 */
    public final Object m32729Q0(Object state, Object proposedUpdate) {
        if (!(state instanceof InterfaceC7943y1)) {
            return C7885k2.f29752a;
        }
        if ((!(state instanceof C7889l1) && !(state instanceof AbstractC7875i2)) || (state instanceof C7929v) || (proposedUpdate instanceof C7843c0)) {
            return m32731R0((InterfaceC7943y1) state, proposedUpdate);
        }
        return m32726O0((InterfaceC7943y1) state, proposedUpdate) ? proposedUpdate : C7885k2.f29754c;
    }

    /* JADX DEBUG: Class process forced to load method for inline: ku.g2.j(ku.d2, boolean, ku.i2, int, java.lang.Object):ku.i1 */
    /* JADX INFO: renamed from: R */
    public final Object m32730R(InterfaceC9557b<Object> interfaceC9557b) {
        a aVar = new a(C10046b.m38803c(interfaceC9557b), this);
        aVar.m32860H();
        C7913r.m32899a(aVar, C7870h2.m32674j(this, false, new C7924t2(aVar), 1, null));
        Object objM32857A = aVar.m32857A();
        if (objM32857A == C10047c.m38805e()) {
            C10346h.m39673c(interfaceC9557b);
        }
        return objM32857A;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: ku.j2 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX INFO: renamed from: R0 */
    public final Object m32731R0(InterfaceC7943y1 state, Object proposedUpdate) throws Throwable {
        C7904o2 c7904o2M32746i0 = m32746i0(state);
        if (c7904o2M32746i0 == null) {
            return C7885k2.f29754c;
        }
        c cVar = state instanceof c ? (c) state : null;
        if (cVar == null) {
            cVar = new c(c7904o2M32746i0, false, null);
        }
        C7729c0 c7729c0 = new C7729c0();
        synchronized (cVar) {
            if (cVar.m32771k()) {
                return C7885k2.f29752a;
            }
            cVar.m32774n(true);
            if (cVar != state && !C12996b.m48310a(f29739a, this, state, cVar)) {
                return C7885k2.f29754c;
            }
            boolean zM32770j = cVar.m32770j();
            C7843c0 c7843c0 = proposedUpdate instanceof C7843c0 ? (C7843c0) proposedUpdate : null;
            if (c7843c0 != null) {
                cVar.m32766a(c7843c0.cause);
            }
            ?? M32769f = zM32770j ? 0 : cVar.m32769f();
            c7729c0.f29425a = M32769f;
            Unit unit = Unit.f29331a;
            if (M32769f != 0) {
                m32713A0(c7904o2M32746i0, M32769f);
            }
            C7929v c7929vM32760z0 = m32760z0(c7904o2M32746i0);
            if (c7929vM32760z0 != null && m32733S0(cVar, c7929vM32760z0, proposedUpdate)) {
                return C7885k2.f29753b;
            }
            c7904o2M32746i0.m40900h(2);
            C7929v c7929vM32760z1 = m32760z0(c7904o2M32746i0);
            return (c7929vM32760z1 == null || !m32733S0(cVar, c7929vM32760z1, proposedUpdate)) ? m32742c0(cVar, proposedUpdate) : C7885k2.f29753b;
        }
    }

    /* JADX INFO: renamed from: S */
    public final boolean m32732S(@Nullable Throwable cause) {
        return m32734T(cause);
    }

    /* JADX INFO: renamed from: S0 */
    public final boolean m32733S0(c state, C7929v child, Object proposedUpdate) {
        while (C7865g2.m32655i(child.childJob, false, new b(this, state, child, proposedUpdate)) == C7912q2.f29793a) {
            child = m32760z0(child);
            if (child == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m32734T(@Nullable Object cause) throws Throwable {
        Object objM32757v0 = C7885k2.f29752a;
        if (mo32640h0() && (objM32757v0 = m32736V(cause)) == C7885k2.f29753b) {
            return true;
        }
        if (objM32757v0 == C7885k2.f29752a) {
            objM32757v0 = m32757v0(cause);
        }
        if (objM32757v0 == C7885k2.f29752a || objM32757v0 == C7885k2.f29753b) {
            return true;
        }
        if (objM32757v0 == C7885k2.f29755d) {
            return false;
        }
        mo32584P(objM32757v0);
        return true;
    }

    /* JADX INFO: renamed from: U */
    public void mo32735U(@NotNull Throwable cause) throws Throwable {
        m32734T(cause);
    }

    /* JADX INFO: renamed from: V */
    public final Object m32736V(Object cause) {
        Object objM32729Q0;
        do {
            Object objM32750l0 = m32750l0();
            if (!(objM32750l0 instanceof InterfaceC7943y1) || ((objM32750l0 instanceof c) && ((c) objM32750l0).m32771k())) {
                return C7885k2.f29752a;
            }
            objM32729Q0 = m32729Q0(objM32750l0, new C7843c0(m32741b0(cause), false, 2, null));
        } while (objM32729Q0 == C7885k2.f29754c);
        return objM32729Q0;
    }

    /* JADX INFO: renamed from: W */
    public final boolean m32737W(Throwable cause) {
        if (mo32642s0()) {
            return true;
        }
        boolean z10 = cause instanceof CancellationException;
        InterfaceC7925u interfaceC7925uM32749k0 = m32749k0();
        if (interfaceC7925uM32749k0 == null || interfaceC7925uM32749k0 == C7912q2.f29793a) {
            return z10;
        }
        return interfaceC7925uM32749k0.mo32898c(cause) || z10;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public String mo32555X() {
        return "Job was cancelled";
    }

    /* JADX INFO: renamed from: Y */
    public boolean mo32738Y(@NotNull Throwable cause) {
        if (cause instanceof CancellationException) {
            return true;
        }
        return m32734T(cause) && getHandlesException();
    }

    /* JADX INFO: renamed from: Z */
    public final void m32739Z(InterfaceC7943y1 state, Object update) throws Throwable {
        InterfaceC7925u interfaceC7925uM32749k0 = m32749k0();
        if (interfaceC7925uM32749k0 != null) {
            interfaceC7925uM32749k0.mo32664a();
            m32720I0(C7912q2.f29793a);
        }
        C7843c0 c7843c0 = update instanceof C7843c0 ? (C7843c0) update : null;
        Throwable th2 = c7843c0 != null ? c7843c0.cause : null;
        if (!(state instanceof AbstractC7875i2)) {
            C7904o2 list = state.getList();
            if (list != null) {
                m32714B0(list, th2);
                return;
            }
            return;
        }
        try {
            ((AbstractC7875i2) state).mo32575x(th2);
        } catch (Throwable th3) {
            mo32557p0(new C7848d0("Exception in completion handler " + state + " for " + this, th3));
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m32740a0(c state, C7929v lastChild, Object proposedUpdate) {
        C7929v c7929vM32760z0 = m32760z0(lastChild);
        if (c7929vM32760z0 == null || !m32733S0(state, c7929vM32760z0, proposedUpdate)) {
            state.getList().m40900h(2);
            C7929v c7929vM32760z1 = m32760z0(lastChild);
            if (c7929vM32760z1 == null || !m32733S0(state, c7929vM32760z1, proposedUpdate)) {
                mo32584P(m32742c0(state, proposedUpdate));
            }
        }
    }

    @Override // p256ku.InterfaceC7850d2
    /* JADX INFO: renamed from: b */
    public boolean mo32556b() {
        Object objM32750l0 = m32750l0();
        return (objM32750l0 instanceof InterfaceC7943y1) && ((InterfaceC7943y1) objM32750l0).getIsActive();
    }

    /* JADX INFO: renamed from: b0 */
    public final Throwable m32741b0(Object cause) {
        if (cause == null ? true : cause instanceof Throwable) {
            Throwable th2 = (Throwable) cause;
            return th2 == null ? new C7855e2(mo32555X(), null, this) : th2;
        }
        Intrinsics.m31981d(cause, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((InterfaceC7920s2) cause).mo32755u();
    }

    @Override // p256ku.InterfaceC7850d2
    /* JADX INFO: renamed from: c */
    public void mo32597c(@Nullable CancellationException cause) throws Throwable {
        if (cause == null) {
            cause = new C7855e2(mo32555X(), null, this);
        }
        mo32735U(cause);
    }

    /* JADX INFO: renamed from: c0 */
    public final Object m32742c0(c state, Object proposedUpdate) throws Throwable {
        boolean zM32770j;
        Throwable thM32745f0;
        C7843c0 c7843c0 = proposedUpdate instanceof C7843c0 ? (C7843c0) proposedUpdate : null;
        Throwable th2 = c7843c0 != null ? c7843c0.cause : null;
        synchronized (state) {
            zM32770j = state.m32770j();
            List<Throwable> listM32773m = state.m32773m(th2);
            thM32745f0 = m32745f0(state, listM32773m);
            if (thM32745f0 != null) {
                m32725O(thM32745f0, listM32773m);
            }
        }
        if (thM32745f0 != null && thM32745f0 != th2) {
            proposedUpdate = new C7843c0(thM32745f0, false, 2, null);
        }
        if (thM32745f0 != null && (m32737W(thM32745f0) || mo32751o0(thM32745f0))) {
            Intrinsics.m31981d(proposedUpdate, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((C7843c0) proposedUpdate).m32580c();
        }
        if (!zM32770j) {
            m32715C0(thM32745f0);
        }
        mo32550D0(proposedUpdate);
        C12996b.m48310a(f29739a, this, state, C7885k2.m32788g(proposedUpdate));
        m32739Z(state, proposedUpdate);
        return proposedUpdate;
    }

    @Override // p256ku.InterfaceC7850d2
    /* JADX INFO: renamed from: d */
    public final boolean mo32598d() {
        return !(m32750l0() instanceof InterfaceC7943y1);
    }

    @Nullable
    /* JADX INFO: renamed from: d0 */
    public final Object m32743d0() throws Throwable {
        Object objM32750l0 = m32750l0();
        if (objM32750l0 instanceof InterfaceC7943y1) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (objM32750l0 instanceof C7843c0) {
            throw ((C7843c0) objM32750l0).cause;
        }
        return C7885k2.m32789h(objM32750l0);
    }

    /* JADX INFO: renamed from: e0 */
    public final Throwable m32744e0(Object obj) {
        C7843c0 c7843c0 = obj instanceof C7843c0 ? (C7843c0) obj : null;
        if (c7843c0 != null) {
            return c7843c0.cause;
        }
        return null;
    }

    /* JADX INFO: renamed from: f0 */
    public final Throwable m32745f0(c state, List<? extends Throwable> exceptions) {
        Object next;
        Object obj = null;
        if (exceptions.isEmpty()) {
            if (state.m32770j()) {
                return new C7855e2(mo32555X(), null, this);
            }
            return null;
        }
        List<? extends Throwable> list = exceptions;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Throwable) next) instanceof CancellationException);
        Throwable th2 = (Throwable) next;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = exceptions.get(0);
        if (th3 instanceof C7856e3) {
            for (Object obj2 : list) {
                Throwable th4 = (Throwable) obj2;
                if (th4 != th3 && (th4 instanceof C7856e3)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r8, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) InterfaceC7850d2.a.m32604b(this, r8, function2);
    }

    /* JADX INFO: renamed from: g0 */
    public boolean getHandlesException() {
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.InterfaceC7716b<E> interfaceC7716b) {
        return (E) InterfaceC7850d2.a.m32605c(this, interfaceC7716b);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public final CoroutineContext.InterfaceC7716b<?> getKey() {
        return InterfaceC7850d2.INSTANCE;
    }

    /* JADX INFO: renamed from: h0 */
    public boolean mo32640h0() {
        return false;
    }

    /* JADX INFO: renamed from: i0 */
    public final C7904o2 m32746i0(InterfaceC7943y1 state) {
        C7904o2 list = state.getList();
        if (list != null) {
            return list;
        }
        if (state instanceof C7889l1) {
            return new C7904o2();
        }
        if (state instanceof AbstractC7875i2) {
            m32718G0((AbstractC7875i2) state);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + state).toString());
    }

    @Override // p256ku.InterfaceC7850d2
    public final boolean isCancelled() {
        Object objM32750l0 = m32750l0();
        if (objM32750l0 instanceof C7843c0) {
            return true;
        }
        return (objM32750l0 instanceof c) && ((c) objM32750l0).m32770j();
    }

    @Override // p256ku.InterfaceC7933w
    /* JADX INFO: renamed from: j */
    public final void mo32747j(@NotNull InterfaceC7920s2 parentJob) throws Throwable {
        m32734T(parentJob);
    }

    @Nullable
    /* JADX INFO: renamed from: j0 */
    public InterfaceC7850d2 m32748j0() {
        InterfaceC7925u interfaceC7925uM32749k0 = m32749k0();
        if (interfaceC7925uM32749k0 != null) {
            return interfaceC7925uM32749k0.getParent();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: k0 */
    public final InterfaceC7925u m32749k0() {
        return (InterfaceC7925u) f29740b.get(this);
    }

    @Override // p256ku.InterfaceC7850d2
    @NotNull
    /* JADX INFO: renamed from: l */
    public final InterfaceC7874i1 mo32599l(boolean onCancelling, boolean invokeImmediately, @NotNull Function1<? super Throwable, Unit> handler) {
        return m32753r0(invokeImmediately, onCancelling ? new C7840b2(handler) : new C7845c2(handler));
    }

    @Nullable
    /* JADX INFO: renamed from: l0 */
    public final Object m32750l0() {
        return f29739a.get(this);
    }

    @Override // p256ku.InterfaceC7850d2
    @NotNull
    /* JADX INFO: renamed from: m */
    public final CancellationException mo32600m() {
        Object objM32750l0 = m32750l0();
        if (!(objM32750l0 instanceof c)) {
            if (objM32750l0 instanceof InterfaceC7943y1) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (objM32750l0 instanceof C7843c0) {
                return m32709M0(this, ((C7843c0) objM32750l0).cause, null, 1, null);
            }
            return new C7855e2(C7922t0.m32908a(this) + " has completed normally", null, this);
        }
        Throwable thM32769f = ((c) objM32750l0).m32769f();
        if (thM32769f != null) {
            CancellationException cancellationExceptionM32723L0 = m32723L0(thM32769f, C7922t0.m32908a(this) + " is cancelling");
            if (cancellationExceptionM32723L0 != null) {
                return cancellationExceptionM32723L0;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.InterfaceC7716b<?> interfaceC7716b) {
        return InterfaceC7850d2.a.m32606d(this, interfaceC7716b);
    }

    /* JADX INFO: renamed from: o0 */
    public boolean mo32751o0(@NotNull Throwable exception) {
        return false;
    }

    /* JADX INFO: renamed from: p0 */
    public void mo32557p0(@NotNull Throwable exception) throws Throwable {
        throw exception;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return InterfaceC7850d2.a.m32607e(this, coroutineContext);
    }

    @Override // p256ku.InterfaceC7850d2
    @NotNull
    /* JADX INFO: renamed from: q */
    public final InterfaceC7874i1 mo32601q(@NotNull Function1<? super Throwable, Unit> handler) {
        return m32753r0(true, new C7845c2(handler));
    }

    /* JADX INFO: renamed from: q0 */
    public final void m32752q0(@Nullable InterfaceC7850d2 parent) {
        if (parent == null) {
            m32720I0(C7912q2.f29793a);
            return;
        }
        parent.start();
        InterfaceC7925u interfaceC7925uMo32602y = parent.mo32602y(this);
        m32720I0(interfaceC7925uMo32602y);
        if (mo32598d()) {
            interfaceC7925uMo32602y.mo32664a();
            m32720I0(C7912q2.f29793a);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: r0 */
    public final InterfaceC7874i1 m32753r0(boolean invokeImmediately, @NotNull AbstractC7875i2 node) {
        boolean z10;
        boolean zM40897e;
        node.m32688y(this);
        while (true) {
            Object objM32750l0 = m32750l0();
            z10 = true;
            if (!(objM32750l0 instanceof C7889l1)) {
                if (!(objM32750l0 instanceof InterfaceC7943y1)) {
                    z10 = false;
                    break;
                }
                InterfaceC7943y1 interfaceC7943y1 = (InterfaceC7943y1) objM32750l0;
                C7904o2 list = interfaceC7943y1.getList();
                if (list == null) {
                    Intrinsics.m31981d(objM32750l0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    m32718G0((AbstractC7875i2) objM32750l0);
                } else {
                    if (node.mo32574w()) {
                        c cVar = interfaceC7943y1 instanceof c ? (c) interfaceC7943y1 : null;
                        Throwable thM32769f = cVar != null ? cVar.m32769f() : null;
                        if (thM32769f != null) {
                            if (invokeImmediately) {
                                node.mo32575x(thM32769f);
                            }
                            return C7912q2.f29793a;
                        }
                        zM40897e = list.m40897e(node, 5);
                    } else {
                        zM40897e = list.m40897e(node, 1);
                    }
                    if (zM40897e) {
                        break;
                    }
                }
            } else {
                C7889l1 c7889l1 = (C7889l1) objM32750l0;
                if (!c7889l1.getIsActive()) {
                    m32717F0(c7889l1);
                } else if (C12996b.m48310a(f29739a, this, objM32750l0, node)) {
                    break;
                }
            }
        }
        if (z10) {
            return node;
        }
        if (invokeImmediately) {
            Object objM32750l1 = m32750l0();
            C7843c0 c7843c0 = objM32750l1 instanceof C7843c0 ? (C7843c0) objM32750l1 : null;
            node.mo32575x(c7843c0 != null ? c7843c0.cause : null);
        }
        return C7912q2.f29793a;
    }

    /* JADX INFO: renamed from: s0 */
    public boolean mo32642s0() {
        return false;
    }

    @Override // p256ku.InterfaceC7850d2
    public final boolean start() {
        int iM32721J0;
        do {
            iM32721J0 = m32721J0(m32750l0());
            if (iM32721J0 == 0) {
                return false;
            }
        } while (iM32721J0 != 1);
        return true;
    }

    /* JADX INFO: renamed from: t0 */
    public final boolean m32754t0() {
        Object objM32750l0;
        do {
            objM32750l0 = m32750l0();
            if (!(objM32750l0 instanceof InterfaceC7943y1)) {
                return false;
            }
        } while (m32721J0(objM32750l0) < 0);
        return true;
    }

    @NotNull
    public String toString() {
        return m32724N0() + '@' + C7922t0.m32909b(this);
    }

    @Override // p256ku.InterfaceC7920s2
    @NotNull
    /* JADX INFO: renamed from: u */
    public CancellationException mo32755u() {
        Throwable thM32769f;
        Object objM32750l0 = m32750l0();
        if (objM32750l0 instanceof c) {
            thM32769f = ((c) objM32750l0).m32769f();
        } else if (objM32750l0 instanceof C7843c0) {
            thM32769f = ((C7843c0) objM32750l0).cause;
        } else {
            if (objM32750l0 instanceof InterfaceC7943y1) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objM32750l0).toString());
            }
            thM32769f = null;
        }
        CancellationException cancellationException = thM32769f instanceof CancellationException ? (CancellationException) thM32769f : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new C7855e2("Parent job is " + m32722K0(objM32750l0), thM32769f, this);
    }

    /* JADX INFO: renamed from: u0 */
    public final Object m32756u0(InterfaceC9557b<? super Unit> interfaceC9557b) {
        C7905p c7905p = new C7905p(C10046b.m38803c(interfaceC9557b), 1);
        c7905p.m32860H();
        C7913r.m32899a(c7905p, C7870h2.m32674j(this, false, new C7928u2(c7905p), 1, null));
        Object objM32857A = c7905p.m32857A();
        if (objM32857A == C10047c.m38805e()) {
            C10346h.m39673c(interfaceC9557b);
        }
        return objM32857A == C10047c.m38805e() ? objM32857A : Unit.f29331a;
    }

    /* JADX INFO: renamed from: v0 */
    public final Object m32757v0(Object cause) throws Throwable {
        Throwable thM32741b0 = null;
        while (true) {
            Object objM32750l0 = m32750l0();
            if (objM32750l0 instanceof c) {
                synchronized (objM32750l0) {
                    if (((c) objM32750l0).m32772l()) {
                        return C7885k2.f29755d;
                    }
                    boolean zM32770j = ((c) objM32750l0).m32770j();
                    if (cause != null || !zM32770j) {
                        if (thM32741b0 == null) {
                            thM32741b0 = m32741b0(cause);
                        }
                        ((c) objM32750l0).m32766a(thM32741b0);
                    }
                    Throwable thM32769f = zM32770j ? null : ((c) objM32750l0).m32769f();
                    if (thM32769f != null) {
                        m32713A0(((c) objM32750l0).getList(), thM32769f);
                    }
                    return C7885k2.f29752a;
                }
            }
            if (!(objM32750l0 instanceof InterfaceC7943y1)) {
                return C7885k2.f29755d;
            }
            if (thM32741b0 == null) {
                thM32741b0 = m32741b0(cause);
            }
            InterfaceC7943y1 interfaceC7943y1 = (InterfaceC7943y1) objM32750l0;
            if (!interfaceC7943y1.getIsActive()) {
                Object objM32729Q0 = m32729Q0(objM32750l0, new C7843c0(thM32741b0, false, 2, null));
                if (objM32729Q0 == C7885k2.f29752a) {
                    throw new IllegalStateException(("Cannot happen in " + objM32750l0).toString());
                }
                if (objM32729Q0 != C7885k2.f29754c) {
                    return objM32729Q0;
                }
            } else if (m32727P0(interfaceC7943y1, thM32741b0)) {
                return C7885k2.f29752a;
            }
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final boolean m32758w0(@Nullable Object proposedUpdate) {
        Object objM32729Q0;
        do {
            objM32729Q0 = m32729Q0(m32750l0(), proposedUpdate);
            if (objM32729Q0 == C7885k2.f29752a) {
                return false;
            }
            if (objM32729Q0 == C7885k2.f29753b) {
                return true;
            }
        } while (objM32729Q0 == C7885k2.f29754c);
        mo32584P(objM32729Q0);
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: x0 */
    public final Object m32759x0(@Nullable Object proposedUpdate) {
        Object objM32729Q0;
        do {
            objM32729Q0 = m32729Q0(m32750l0(), proposedUpdate);
            if (objM32729Q0 == C7885k2.f29752a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + proposedUpdate, m32744e0(proposedUpdate));
            }
        } while (objM32729Q0 == C7885k2.f29754c);
        return objM32729Q0;
    }

    @Override // p256ku.InterfaceC7850d2
    @NotNull
    /* JADX INFO: renamed from: y */
    public final InterfaceC7925u mo32602y(@NotNull InterfaceC7933w child) {
        C7929v c7929v = new C7929v(child);
        c7929v.m32688y(this);
        while (true) {
            Object objM32750l0 = m32750l0();
            if (objM32750l0 instanceof C7889l1) {
                C7889l1 c7889l1 = (C7889l1) objM32750l0;
                if (!c7889l1.getIsActive()) {
                    m32717F0(c7889l1);
                } else if (C12996b.m48310a(f29739a, this, objM32750l0, c7929v)) {
                    return c7929v;
                }
            } else {
                Throwable thM32769f = null;
                if (!(objM32750l0 instanceof InterfaceC7943y1)) {
                    Object objM32750l1 = m32750l0();
                    C7843c0 c7843c0 = objM32750l1 instanceof C7843c0 ? (C7843c0) objM32750l1 : null;
                    c7929v.mo32575x(c7843c0 != null ? c7843c0.cause : null);
                    return C7912q2.f29793a;
                }
                C7904o2 list = ((InterfaceC7943y1) objM32750l0).getList();
                if (list != null) {
                    if (!list.m40897e(c7929v, 7)) {
                        boolean zM40897e = list.m40897e(c7929v, 3);
                        Object objM32750l2 = m32750l0();
                        if (objM32750l2 instanceof c) {
                            thM32769f = ((c) objM32750l2).m32769f();
                        } else {
                            C7843c0 c7843c1 = objM32750l2 instanceof C7843c0 ? (C7843c0) objM32750l2 : null;
                            if (c7843c1 != null) {
                                thM32769f = c7843c1.cause;
                            }
                        }
                        c7929v.mo32575x(thM32769f);
                        if (!zM40897e) {
                            return C7912q2.f29793a;
                        }
                    }
                    return c7929v;
                }
                Intrinsics.m31981d(objM32750l0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                m32718G0((AbstractC7875i2) objM32750l0);
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: y0 */
    public String mo32558y0() {
        return C7922t0.m32908a(this);
    }

    /* JADX INFO: renamed from: z0 */
    public final C7929v m32760z0(C10740p c10740p) {
        while (c10740p.mo40892r()) {
            c10740p = c10740p.m40906n();
        }
        while (true) {
            c10740p = c10740p.m40905m();
            if (!c10740p.mo40892r()) {
                if (c10740p instanceof C7929v) {
                    return (C7929v) c10740p;
                }
                if (c10740p instanceof C7904o2) {
                    return null;
                }
            }
        }
    }
}
