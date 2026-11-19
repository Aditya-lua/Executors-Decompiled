package av;

import com.github.luben.zstd.BuildConfig;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.coroutines.CoroutineContext;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0005i\u0098\u0001ª\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000fH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\u00020\u0014*\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b$\u0010!J\u0019\u0010&\u001a\u00020%2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020+H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0004H\u0002¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b0\u00101J\u001b\u00102\u001a\u0004\u0018\u00010\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b2\u00103J\u0019\u00104\u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b4\u00105J\u001b\u00106\u001a\u0004\u0018\u00010\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b6\u00103J\u0019\u00107\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\t\u001a\u00020\u0017H\u0002¢\u0006\u0004\b7\u00108J\u001f\u00109\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b9\u0010:J%\u0010;\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b;\u0010<J#\u0010=\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u00172\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b=\u0010>J*\u0010A\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010@\u001a\u00020?2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0082\u0010¢\u0006\u0004\bA\u0010BJ)\u0010D\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010C\u001a\u00020?2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bD\u0010EJ\u0015\u0010G\u001a\u0004\u0018\u00010?*\u00020FH\u0002¢\u0006\u0004\bG\u0010HJ\u0019\u0010J\u001a\u00020I2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bJ\u0010KJ\u0012\u0010L\u001a\u0004\u0018\u00010\nH\u0082@¢\u0006\u0004\bL\u00101J\u0019\u0010N\u001a\u00020\u00142\b\u0010M\u001a\u0004\u0018\u00010\u0001H\u0004¢\u0006\u0004\bN\u0010OJ\r\u0010P\u001a\u00020\u0004¢\u0006\u0004\bP\u0010/J\u000f\u0010Q\u001a\u00020\u0014H\u0014¢\u0006\u0004\bQ\u0010RJ\u0011\u0010U\u001a\u00060Sj\u0002`T¢\u0006\u0004\bU\u0010VJ#\u0010X\u001a\u00060Sj\u0002`T*\u00020\u000f2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010IH\u0004¢\u0006\u0004\bX\u0010YJ'\u0010^\u001a\u00020]2\u0018\u0010\\\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00140Zj\u0002`[¢\u0006\u0004\b^\u0010_J7\u0010b\u001a\u00020]2\u0006\u0010`\u001a\u00020\u00042\u0006\u0010a\u001a\u00020\u00042\u0018\u0010\\\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00140Zj\u0002`[¢\u0006\u0004\bb\u0010cJ\u001f\u0010e\u001a\u00020]2\u0006\u0010a\u001a\u00020\u00042\u0006\u0010d\u001a\u00020+H\u0000¢\u0006\u0004\be\u0010fJ\u0010\u0010g\u001a\u00020\u0014H\u0086@¢\u0006\u0004\bg\u00101J\u0017\u0010h\u001a\u00020\u00142\u0006\u0010d\u001a\u00020+H\u0000¢\u0006\u0004\bh\u0010-J\u001f\u0010i\u001a\u00020\u00142\u000e\u0010\u001f\u001a\n\u0018\u00010Sj\u0004\u0018\u0001`TH\u0016¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020IH\u0014¢\u0006\u0004\bk\u0010lJ\u0017\u0010m\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\bm\u0010nJ\u0015\u0010p\u001a\u00020\u00142\u0006\u0010o\u001a\u00020\u0003¢\u0006\u0004\bp\u0010qJ\u0017\u0010r\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\br\u0010#J\u0017\u0010s\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\bs\u0010#J\u0019\u0010t\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\bt\u0010uJ\u0013\u0010v\u001a\u00060Sj\u0002`TH\u0016¢\u0006\u0004\bv\u0010VJ\u0019\u0010w\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\bw\u0010uJ\u001b\u0010x\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\bx\u00103J\u0015\u0010z\u001a\u00020y2\u0006\u0010@\u001a\u00020\u0002¢\u0006\u0004\bz\u0010{J\u0017\u0010}\u001a\u00020\u00142\u0006\u0010|\u001a\u00020\u000fH\u0010¢\u0006\u0004\b}\u0010nJ\u0019\u0010~\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b~\u0010nJ\u0017\u0010\u007f\u001a\u00020\u00042\u0006\u0010|\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u007f\u0010#J\u001c\u0010\u0080\u0001\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u001c\u0010\u0082\u0001\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0006\b\u0082\u0001\u0010\u0081\u0001J\u0011\u0010\u0083\u0001\u001a\u00020IH\u0016¢\u0006\u0005\b\u0083\u0001\u0010lJ\u0011\u0010\u0084\u0001\u001a\u00020IH\u0007¢\u0006\u0005\b\u0084\u0001\u0010lJ\u0011\u0010\u0085\u0001\u001a\u00020IH\u0010¢\u0006\u0005\b\u0085\u0001\u0010lJ\u0014\u0010\u0086\u0001\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0014\u0010\u0088\u0001\u001a\u0004\u0018\u00010\nH\u0084@¢\u0006\u0005\b\u0088\u0001\u00101R\u001e\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u000f*\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u00105R\u0019\u0010\u008e\u0001\u001a\u0007\u0012\u0002\b\u00030\u008b\u00018F¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R.\u0010\u0094\u0001\u001a\u0004\u0018\u00010y2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010y8@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0018\u0010M\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0087\u0001R\u0016\u0010\u0099\u0001\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010/R\u0013\u0010\u009b\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010/R\u0013\u0010\u009c\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010/R\u0016\u0010\u009e\u0001\u001a\u00020\u00048PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010/R\u001b\u0010¢\u0001\u001a\t\u0012\u0004\u0012\u00020\u00010\u009f\u00018F¢\u0006\b\u001a\u0006\b \u0001\u0010¡\u0001R\u0016\u0010¤\u0001\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0007\u001a\u0005\b£\u0001\u0010/R\u0016\u0010¦\u0001\u001a\u00020\u00048PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b¥\u0001\u0010/R\u0015\u0010¨\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\n0§\u00018\u0002X\u0082\u0004R\u0015\u0010©\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010y0§\u00018\u0002X\u0082\u0004¨\u0006«\u0001"}, d2 = {"Lav/j2;", "Lav/d2;", "Lav/w;", "Lav/s2;", BuildConfig.FLAVOR, "active", "<init>", "(Z)V", "Lav/j2$c;", "state", BuildConfig.FLAVOR, "proposedUpdate", "c0", "(Lav/j2$c;Ljava/lang/Object;)Ljava/lang/Object;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "exceptions", "f0", "(Lav/j2$c;Ljava/util/List;)Ljava/lang/Throwable;", "rootCause", BuildConfig.FLAVOR, "O", "(Ljava/lang/Throwable;Ljava/util/List;)V", "Lav/y1;", "update", "O0", "(Lav/y1;Ljava/lang/Object;)Z", "Z", "(Lav/y1;Ljava/lang/Object;)V", "Lav/o2;", "list", "cause", "A0", "(Lav/o2;Ljava/lang/Throwable;)V", "W", "(Ljava/lang/Throwable;)Z", "B0", BuildConfig.FLAVOR, "J0", "(Ljava/lang/Object;)I", "Lav/l1;", "F0", "(Lav/l1;)V", "Lav/i2;", "G0", "(Lav/i2;)V", "t0", "()Z", "u0", "(Leu/b;)Ljava/lang/Object;", "V", "(Ljava/lang/Object;)Ljava/lang/Object;", "b0", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "v0", "i0", "(Lav/y1;)Lav/o2;", "P0", "(Lav/y1;Ljava/lang/Throwable;)Z", "Q0", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "R0", "(Lav/y1;Ljava/lang/Object;)Ljava/lang/Object;", "Lav/v;", "child", "S0", "(Lav/j2$c;Lav/v;Ljava/lang/Object;)Z", "lastChild", "a0", "(Lav/j2$c;Lav/v;Ljava/lang/Object;)V", "Lgv/p;", "z0", "(Lgv/p;)Lav/v;", BuildConfig.FLAVOR, "K0", "(Ljava/lang/Object;)Ljava/lang/String;", "R", "parent", "q0", "(Lav/d2;)V", "start", "E0", "()V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "k", "()Ljava/util/concurrent/CancellationException;", "message", "L0", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lav/i1;", "o", "(Lkotlin/jvm/functions/Function1;)Lav/i1;", "onCancelling", "invokeImmediately", "h", "(ZZLkotlin/jvm/functions/Function1;)Lav/i1;", "node", "r0", "(ZLav/i2;)Lav/i1;", "z", "H0", "c", "(Ljava/util/concurrent/CancellationException;)V", "X", "()Ljava/lang/String;", "U", "(Ljava/lang/Throwable;)V", "parentJob", "u", "(Lav/s2;)V", "Y", "S", "T", "(Ljava/lang/Object;)Z", "w", "w0", "x0", "Lav/u;", "E", "(Lav/w;)Lav/u;", "exception", "p0", "C0", "o0", "D0", "(Ljava/lang/Object;)V", "P", "toString", "N0", "y0", "d0", "()Ljava/lang/Object;", "Q", "e0", "exceptionOrNull", "Lkotlin/coroutines/CoroutineContext$b;", "getKey", "()Lkotlin/coroutines/CoroutineContext$b;", "key", "value", "k0", "()Lav/u;", "I0", "(Lav/u;)V", "parentHandle", "j0", "()Lav/d2;", "l0", "b", "isActive", "d", "isCompleted", "isCancelled", "h0", "onCancelComplete", "Lkotlin/sequences/Sequence;", "getChildren", "()Lkotlin/sequences/Sequence;", "children", "s0", "isScopedCoroutine", "g0", "handlesException", "Lkotlinx/atomicfu/AtomicRef;", "_state", "_parentHandle", "a", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class j2 implements d2, w, s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3424a = AtomicReferenceFieldUpdater.newUpdater(j2.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(j2.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lav/j2$a;", "T", "Lav/p;", "Leu/b;", "delegate", "Lav/j2;", "job", "<init>", "(Leu/b;Lav/j2;)V", "Lav/d2;", "parent", BuildConfig.FLAVOR, "w", "(Lav/d2;)Ljava/lang/Throwable;", BuildConfig.FLAVOR, "O", "()Ljava/lang/String;", "i", "Lav/j2;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> extends p<T> {

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final j2 job;

        public a(@NotNull eu.b<? super T> bVar, @NotNull j2 j2Var) {
            super(bVar, 1);
            this.job = j2Var;
        }

        @Override // av.p
        @NotNull
        public String O() {
            return "AwaitContinuation";
        }

        @Override // av.p
        @NotNull
        public Throwable w(@NotNull d2 parent) {
            Throwable thF;
            Object objL0 = this.job.l0();
            if (!(objL0 instanceof c) || (thF = ((c) objL0).f()) == null) {
                return objL0 instanceof c0 ? ((c0) objL0).cause : parent.k();
            }
            return thF;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lav/j2$b;", "Lav/i2;", "Lav/j2;", "parent", "Lav/j2$c;", "state", "Lav/v;", "child", BuildConfig.FLAVOR, "proposedUpdate", "<init>", "(Lav/j2;Lav/j2$c;Lav/v;Ljava/lang/Object;)V", BuildConfig.FLAVOR, "cause", BuildConfig.FLAVOR, "x", "(Ljava/lang/Throwable;)V", "e", "Lav/j2;", "f", "Lav/j2$c;", "g", "Lav/v;", "h", "Ljava/lang/Object;", BuildConfig.FLAVOR, "w", "()Z", "onCancelling", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends i2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final j2 parent;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final c state;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final v child;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Object proposedUpdate;

        public b(@NotNull j2 j2Var, @NotNull c cVar, @NotNull v vVar, @Nullable Object obj) {
            this.parent = j2Var;
            this.state = cVar;
            this.child = vVar;
            this.proposedUpdate = obj;
        }

        @Override // av.i2
        public boolean w() {
            return false;
        }

        @Override // av.i2
        public void x(@Nullable Throwable cause) {
            this.parent.a0(this.state, this.child, this.proposedUpdate);
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r2\b\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0017j\b\u0012\u0004\u0012\u00020\b`\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010\u0013R\u0011\u0010'\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b&\u0010 R\u0011\u0010)\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b(\u0010 R\u0014\u0010+\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010 R(\u00100\u001a\u0004\u0018\u00010\u00012\b\u0010\u001e\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u000b\u00102\u001a\u0002018\u0002X\u0082\u0004R\u0013\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b038\u0002X\u0082\u0004R\u0013\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001038\u0002X\u0082\u0004¨\u00066"}, d2 = {"Lav/j2$c;", BuildConfig.FLAVOR, "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lav/y1;", "Lav/o2;", "list", BuildConfig.FLAVOR, "isCompleting", BuildConfig.FLAVOR, "rootCause", "<init>", "(Lav/o2;ZLjava/lang/Throwable;)V", "proposedException", BuildConfig.FLAVOR, "m", "(Ljava/lang/Throwable;)Ljava/util/List;", "exception", BuildConfig.FLAVOR, "a", "(Ljava/lang/Throwable;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "c", "()Ljava/util/ArrayList;", "Lav/o2;", "d", "()Lav/o2;", "value", "k", "()Z", "n", "(Z)V", "f", "()Ljava/lang/Throwable;", "p", "l", "isSealed", "j", "isCancelling", "b", "isActive", "e", "()Ljava/lang/Object;", "o", "(Ljava/lang/Object;)V", "exceptionsHolder", "Lkotlinx/atomicfu/AtomicBoolean;", "_isCompleting", "Lkotlinx/atomicfu/AtomicRef;", "_rootCause", "_exceptionsHolder", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements y1 {
        public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting$volatile");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f3430c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause$volatile");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f3431d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final o2 list;

        public c(@NotNull o2 o2Var, boolean z10, @Nullable Throwable th2) {
            this.list = o2Var;
            this._isCompleting$volatile = z10 ? 1 : 0;
            this._rootCause$volatile = th2;
        }

        public final void a(@NotNull Throwable exception) {
            Throwable thF = f();
            if (thF == null) {
                p(exception);
                return;
            }
            if (exception == thF) {
                return;
            }
            Object objE = e();
            if (objE == null) {
                o(exception);
                return;
            }
            if (objE instanceof Throwable) {
                if (exception == objE) {
                    return;
                }
                ArrayList<Throwable> arrayListC = c();
                arrayListC.add(objE);
                arrayListC.add(exception);
                o(arrayListC);
                return;
            }
            if (objE instanceof ArrayList) {
                ((ArrayList) objE).add(exception);
                return;
            }
            throw new IllegalStateException(("State is " + objE).toString());
        }

        @Override // av.y1
        /* JADX INFO: renamed from: b */
        public boolean getIsActive() {
            return f() == null;
        }

        public final ArrayList<Throwable> c() {
            return new ArrayList<>(4);
        }

        @Override // av.y1
        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public o2 getList() {
            return this.list;
        }

        public final Object e() {
            return f3431d.get(this);
        }

        @Nullable
        public final Throwable f() {
            return (Throwable) f3430c.get(this);
        }

        public final boolean j() {
            return f() != null;
        }

        public final boolean k() {
            return b.get(this) == 1;
        }

        public final boolean l() {
            return e() == k2.f3443e;
        }

        @NotNull
        public final List<Throwable> m(@Nullable Throwable proposedException) {
            ArrayList<Throwable> arrayListC;
            Object objE = e();
            if (objE == null) {
                arrayListC = c();
            } else if (objE instanceof Throwable) {
                ArrayList<Throwable> arrayListC2 = c();
                arrayListC2.add(objE);
                arrayListC = arrayListC2;
            } else {
                if (!(objE instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + objE).toString());
                }
                arrayListC = (ArrayList) objE;
            }
            Throwable thF = f();
            if (thF != null) {
                arrayListC.add(0, thF);
            }
            if (proposedException != null && !Intrinsics.c(proposedException, thF)) {
                arrayListC.add(proposedException);
            }
            o(k2.f3443e);
            return arrayListC;
        }

        public final void n(boolean z10) {
            b.set(this, z10 ? 1 : 0);
        }

        public final void o(Object obj) {
            f3431d.set(this, obj);
        }

        public final void p(@Nullable Throwable th2) {
            f3430c.set(this, th2);
        }

        @NotNull
        public String toString() {
            return "Finishing[cancelling=" + j() + ", completing=" + k() + ", rootCause=" + f() + ", exceptions=" + e() + ", list=" + getList() + ']';
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lyu/h;", "Lav/d2;", BuildConfig.FLAVOR, "<anonymous>", "(Lyu/h;)V"}, k = 3, mv = {2, 1, 0})
    @gu.f(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", l = {1003, 1005}, m = "invokeSuspend")
    public static final class d extends gu.k implements Function2<yu.h<? super d2>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f3433u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f3434v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f3435w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f3436x;

        public d(eu.b<? super d> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            d dVar = j2.this.new d(bVar);
            dVar.f3436x = obj;
            return dVar;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0069  */
        /* JADX WARN: Code duplicated, block: B:24:0x006d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006b -> B:27:0x0081). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007e -> B:27:0x0081). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // gu.a
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = fu.c.e()
                int r1 = r5.f3435w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r1 = r5.f3434v
                gv.p r1 = (gv.p) r1
                java.lang.Object r3 = r5.f3433u
                gv.o r3 = (gv.o) r3
                java.lang.Object r4 = r5.f3436x
                yu.h r4 = (yu.h) r4
                zt.o.b(r6)
                goto L81
            L1e:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L26:
                zt.o.b(r6)
                goto L86
            L2a:
                zt.o.b(r6)
                java.lang.Object r6 = r5.f3436x
                yu.h r6 = (yu.h) r6
                av.j2 r1 = av.j2.this
                java.lang.Object r1 = r1.l0()
                boolean r4 = r1 instanceof av.v
                if (r4 == 0) goto L48
                av.v r1 = (av.v) r1
                av.w r1 = r1.childJob
                r5.f3435w = r3
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L86
                goto L80
            L48:
                boolean r3 = r1 instanceof av.y1
                if (r3 == 0) goto L86
                av.y1 r1 = (av.y1) r1
                av.o2 r1 = r1.getList()
                if (r1 == 0) goto L86
                java.lang.Object r3 = r1.l()
                java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
                p001kotlin.jvm.internal.Intrinsics.d(r3, r4)
                gv.p r3 = (gv.p) r3
                r4 = r3
                r3 = r1
                r1 = r4
                r4 = r6
            L63:
                boolean r6 = p001kotlin.jvm.internal.Intrinsics.c(r1, r3)
                if (r6 != 0) goto L86
                boolean r6 = r1 instanceof av.v
                if (r6 == 0) goto L81
                r6 = r1
                av.v r6 = (av.v) r6
                av.w r6 = r6.childJob
                r5.f3436x = r4
                r5.f3433u = r3
                r5.f3434v = r1
                r5.f3435w = r2
                java.lang.Object r6 = r4.a(r6, r5)
                if (r6 != r0) goto L81
            L80:
                return r0
            L81:
                gv.p r1 = r1.m()
                goto L63
            L86:
                kotlin.Unit r6 = p001kotlin.Unit.f21506a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: av.j2.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yu.h<? super d2> hVar, eu.b<? super Unit> bVar) {
            return ((d) create(hVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    public j2(boolean z10) {
        this._state$volatile = z10 ? k2.f3445g : k2.f3444f;
    }

    public static /* synthetic */ CancellationException M0(j2 j2Var, Throwable th2, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        return j2Var.L0(th2, str);
    }

    public final void A0(o2 list, Throwable cause) throws Throwable {
        C0(cause);
        list.h(4);
        Object objL = list.l();
        Intrinsics.d(objL, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        d0 d0Var = null;
        for (gv.p pVarM = (gv.p) objL; !Intrinsics.c(pVarM, list); pVarM = pVarM.m()) {
            if ((pVarM instanceof i2) && ((i2) pVarM).w()) {
                try {
                    ((i2) pVarM).x(cause);
                } catch (Throwable th2) {
                    if (d0Var != null) {
                        zt.a.a(d0Var, th2);
                    } else {
                        d0Var = new d0("Exception in completion handler " + pVarM + " for " + this, th2);
                        Unit unit = Unit.f21506a;
                    }
                }
            }
        }
        if (d0Var != null) {
            p0(d0Var);
        }
        W(cause);
    }

    public final void B0(o2 o2Var, Throwable th2) throws Throwable {
        o2Var.h(1);
        Object objL = o2Var.l();
        Intrinsics.d(objL, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        d0 d0Var = null;
        for (gv.p pVarM = (gv.p) objL; !Intrinsics.c(pVarM, o2Var); pVarM = pVarM.m()) {
            if (pVarM instanceof i2) {
                try {
                    ((i2) pVarM).x(th2);
                } catch (Throwable th3) {
                    if (d0Var != null) {
                        zt.a.a(d0Var, th3);
                    } else {
                        d0Var = new d0("Exception in completion handler " + pVarM + " for " + this, th3);
                        Unit unit = Unit.f21506a;
                    }
                }
            }
        }
        if (d0Var != null) {
            p0(d0Var);
        }
    }

    public void C0(@Nullable Throwable cause) {
    }

    public void D0(@Nullable Object state) {
    }

    @Override // av.d2
    @NotNull
    public final u E(@NotNull w child) {
        v vVar = new v(child);
        vVar.y(this);
        while (true) {
            Object objL0 = l0();
            if (objL0 instanceof l1) {
                l1 l1Var = (l1) objL0;
                if (!l1Var.getIsActive()) {
                    F0(l1Var);
                } else if (y1.b.a(f3424a, this, objL0, vVar)) {
                    return vVar;
                }
            } else {
                Throwable thF = null;
                if (!(objL0 instanceof y1)) {
                    Object objL1 = l0();
                    c0 c0Var = objL1 instanceof c0 ? (c0) objL1 : null;
                    vVar.x(c0Var != null ? c0Var.cause : null);
                    return q2.f3474a;
                }
                o2 list = ((y1) objL0).getList();
                if (list != null) {
                    if (!list.e(vVar, 7)) {
                        boolean zE = list.e(vVar, 3);
                        Object objL2 = l0();
                        if (objL2 instanceof c) {
                            thF = ((c) objL2).f();
                        } else {
                            c0 c0Var2 = objL2 instanceof c0 ? (c0) objL2 : null;
                            if (c0Var2 != null) {
                                thF = c0Var2.cause;
                            }
                        }
                        vVar.x(thF);
                        if (!zE) {
                            return q2.f3474a;
                        }
                    }
                    return vVar;
                }
                Intrinsics.d(objL0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                G0((i2) objL0);
            }
        }
    }

    public void E0() {
    }

    public final void F0(l1 state) {
        o2 o2Var = new o2();
        Object x1Var = o2Var;
        if (!state.getIsActive()) {
            x1Var = new x1(o2Var);
        }
        y1.b.a(f3424a, this, state, x1Var);
    }

    public final void G0(i2 state) {
        state.g(new o2());
        y1.b.a(f3424a, this, state, state.m());
    }

    public final void H0(@NotNull i2 node) {
        Object objL0;
        do {
            objL0 = l0();
            if (!(objL0 instanceof i2)) {
                if (!(objL0 instanceof y1) || ((y1) objL0).getList() == null) {
                    return;
                }
                node.s();
                return;
            }
            if (objL0 != node) {
                return;
            }
        } while (!y1.b.a(f3424a, this, objL0, k2.f3445g));
    }

    public final void I0(@Nullable u uVar) {
        b.set(this, uVar);
    }

    public final int J0(Object state) {
        if (state instanceof l1) {
            if (((l1) state).getIsActive()) {
                return 0;
            }
            if (!y1.b.a(f3424a, this, state, k2.f3445g)) {
                return -1;
            }
            E0();
            return 1;
        }
        if (!(state instanceof x1)) {
            return 0;
        }
        if (!y1.b.a(f3424a, this, state, ((x1) state).getList())) {
            return -1;
        }
        E0();
        return 1;
    }

    public final String K0(Object state) {
        if (!(state instanceof c)) {
            if (state instanceof y1) {
                return ((y1) state).getIsActive() ? "Active" : "New";
            }
            return state instanceof c0 ? "Cancelled" : "Completed";
        }
        c cVar = (c) state;
        if (cVar.j()) {
            return "Cancelling";
        }
        return cVar.k() ? "Completing" : "Active";
    }

    @NotNull
    public final CancellationException L0(@NotNull Throwable th2, @Nullable String str) {
        CancellationException e2Var = th2 instanceof CancellationException ? (CancellationException) th2 : null;
        if (e2Var == null) {
            if (str == null) {
                str = X();
            }
            e2Var = new e2(str, th2, this);
        }
        return e2Var;
    }

    @NotNull
    public final String N0() {
        return y0() + '{' + K0(l0()) + '}';
    }

    public final void O(Throwable rootCause, List<? extends Throwable> exceptions) throws IllegalAccessException, InvocationTargetException {
        if (exceptions.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(exceptions.size()));
        for (Throwable th2 : exceptions) {
            if (th2 != rootCause && th2 != rootCause && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                zt.a.a(rootCause, th2);
            }
        }
    }

    public final boolean O0(y1 state, Object update) throws Throwable {
        if (!y1.b.a(f3424a, this, state, k2.g(update))) {
            return false;
        }
        C0(null);
        D0(update);
        Z(state, update);
        return true;
    }

    public void P(@Nullable Object state) {
    }

    public final boolean P0(y1 state, Throwable rootCause) throws Throwable {
        o2 o2VarI0 = i0(state);
        if (o2VarI0 == null) {
            return false;
        }
        if (!y1.b.a(f3424a, this, state, new c(o2VarI0, false, rootCause))) {
            return false;
        }
        A0(o2VarI0, rootCause);
        return true;
    }

    @Nullable
    public final Object Q(@NotNull eu.b<Object> bVar) throws Throwable {
        Object objL0;
        do {
            objL0 = l0();
            if (!(objL0 instanceof y1)) {
                if (objL0 instanceof c0) {
                    throw ((c0) objL0).cause;
                }
                return k2.h(objL0);
            }
        } while (J0(objL0) < 0);
        return R(bVar);
    }

    public final Object Q0(Object state, Object proposedUpdate) {
        if (!(state instanceof y1)) {
            return k2.f3440a;
        }
        if ((!(state instanceof l1) && !(state instanceof i2)) || (state instanceof v) || (proposedUpdate instanceof c0)) {
            return R0((y1) state, proposedUpdate);
        }
        return O0((y1) state, proposedUpdate) ? proposedUpdate : k2.f3441c;
    }

    public final Object R(eu.b<Object> bVar) {
        a aVar = new a(fu.b.c(bVar), this);
        aVar.G();
        r.a(aVar, h2.l(this, false, new t2(aVar), 1, null));
        Object objY = aVar.y();
        if (objY == fu.c.e()) {
            gu.h.c(bVar);
        }
        return objY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public final Object R0(y1 state, Object proposedUpdate) throws Throwable {
        o2 o2VarI0 = i0(state);
        if (o2VarI0 == null) {
            return k2.f3441c;
        }
        c cVar = state instanceof c ? (c) state : null;
        if (cVar == null) {
            cVar = new c(o2VarI0, false, null);
        }
        p001kotlin.jvm.internal.c0 c0Var = new p001kotlin.jvm.internal.c0();
        synchronized (cVar) {
            if (cVar.k()) {
                return k2.f3440a;
            }
            cVar.n(true);
            if (cVar != state && !y1.b.a(f3424a, this, state, cVar)) {
                return k2.f3441c;
            }
            boolean zJ = cVar.j();
            c0 c0Var2 = proposedUpdate instanceof c0 ? (c0) proposedUpdate : null;
            if (c0Var2 != null) {
                cVar.a(c0Var2.cause);
            }
            ?? F = zJ ? 0 : cVar.f();
            c0Var.f21575a = F;
            Unit unit = Unit.f21506a;
            if (F != 0) {
                A0(o2VarI0, F);
            }
            v vVarZ0 = z0(o2VarI0);
            if (vVarZ0 != null && S0(cVar, vVarZ0, proposedUpdate)) {
                return k2.b;
            }
            o2VarI0.h(2);
            v vVarZ1 = z0(o2VarI0);
            return (vVarZ1 == null || !S0(cVar, vVarZ1, proposedUpdate)) ? c0(cVar, proposedUpdate) : k2.b;
        }
    }

    public final boolean S(@Nullable Throwable cause) {
        return T(cause);
    }

    public final boolean S0(c state, v child, Object proposedUpdate) {
        while (g2.k(child.childJob, false, new b(this, state, child, proposedUpdate)) == q2.f3474a) {
            child = z0(child);
            if (child == null) {
                return false;
            }
        }
        return true;
    }

    public final boolean T(@Nullable Object cause) throws Throwable {
        Object objV0 = k2.f3440a;
        if (h0() && (objV0 = V(cause)) == k2.b) {
            return true;
        }
        if (objV0 == k2.f3440a) {
            objV0 = v0(cause);
        }
        if (objV0 == k2.f3440a || objV0 == k2.b) {
            return true;
        }
        if (objV0 == k2.f3442d) {
            return false;
        }
        P(objV0);
        return true;
    }

    public void U(@NotNull Throwable cause) throws Throwable {
        T(cause);
    }

    public final Object V(Object cause) {
        Object objQ0;
        do {
            Object objL0 = l0();
            if (!(objL0 instanceof y1) || ((objL0 instanceof c) && ((c) objL0).k())) {
                return k2.f3440a;
            }
            objQ0 = Q0(objL0, new c0(b0(cause), false, 2, null));
        } while (objQ0 == k2.f3441c);
        return objQ0;
    }

    public final boolean W(Throwable cause) {
        if (s0()) {
            return true;
        }
        boolean z10 = cause instanceof CancellationException;
        u uVarK0 = k0();
        if (uVarK0 == null || uVarK0 == q2.f3474a) {
            return z10;
        }
        return uVarK0.c(cause) || z10;
    }

    @NotNull
    public String X() {
        return "Job was cancelled";
    }

    public boolean Y(@NotNull Throwable cause) {
        if (cause instanceof CancellationException) {
            return true;
        }
        return T(cause) && getHandlesException();
    }

    public final void Z(y1 state, Object update) throws Throwable {
        u uVarK0 = k0();
        if (uVarK0 != null) {
            uVarK0.a();
            I0(q2.f3474a);
        }
        c0 c0Var = update instanceof c0 ? (c0) update : null;
        Throwable th2 = c0Var != null ? c0Var.cause : null;
        if (!(state instanceof i2)) {
            o2 list = state.getList();
            if (list != null) {
                B0(list, th2);
                return;
            }
            return;
        }
        try {
            ((i2) state).x(th2);
        } catch (Throwable th3) {
            p0(new d0("Exception in completion handler " + state + " for " + this, th3));
        }
    }

    public final void a0(c state, v lastChild, Object proposedUpdate) {
        v vVarZ0 = z0(lastChild);
        if (vVarZ0 == null || !S0(state, vVarZ0, proposedUpdate)) {
            state.getList().h(2);
            v vVarZ1 = z0(lastChild);
            if (vVarZ1 == null || !S0(state, vVarZ1, proposedUpdate)) {
                P(c0(state, proposedUpdate));
            }
        }
    }

    @Override // av.d2
    public boolean b() {
        Object objL0 = l0();
        return (objL0 instanceof y1) && ((y1) objL0).getIsActive();
    }

    public final Throwable b0(Object cause) {
        if (cause == null ? true : cause instanceof Throwable) {
            Throwable th2 = (Throwable) cause;
            return th2 == null ? new e2(X(), null, this) : th2;
        }
        Intrinsics.d(cause, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((s2) cause).w();
    }

    @Override // av.d2
    public void c(@Nullable CancellationException cause) throws Throwable {
        if (cause == null) {
            cause = new e2(X(), null, this);
        }
        U(cause);
    }

    public final Object c0(c state, Object proposedUpdate) throws Throwable {
        boolean zJ;
        Throwable thF0;
        c0 c0Var = proposedUpdate instanceof c0 ? (c0) proposedUpdate : null;
        Throwable th2 = c0Var != null ? c0Var.cause : null;
        synchronized (state) {
            zJ = state.j();
            List<Throwable> listM = state.m(th2);
            thF0 = f0(state, listM);
            if (thF0 != null) {
                O(thF0, listM);
            }
        }
        if (thF0 != null && thF0 != th2) {
            proposedUpdate = new c0(thF0, false, 2, null);
        }
        if (thF0 != null && (W(thF0) || o0(thF0))) {
            Intrinsics.d(proposedUpdate, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((c0) proposedUpdate).c();
        }
        if (!zJ) {
            C0(thF0);
        }
        D0(proposedUpdate);
        y1.b.a(f3424a, this, state, k2.g(proposedUpdate));
        Z(state, proposedUpdate);
        return proposedUpdate;
    }

    @Override // av.d2
    public final boolean d() {
        return !(l0() instanceof y1);
    }

    @Nullable
    public final Object d0() throws Throwable {
        Object objL0 = l0();
        if (objL0 instanceof y1) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (objL0 instanceof c0) {
            throw ((c0) objL0).cause;
        }
        return k2.h(objL0);
    }

    public final Throwable e0(Object obj) {
        c0 c0Var = obj instanceof c0 ? (c0) obj : null;
        if (c0Var != null) {
            return c0Var.cause;
        }
        return null;
    }

    public final Throwable f0(c state, List<? extends Throwable> exceptions) {
        Object next;
        Object obj = null;
        if (exceptions.isEmpty()) {
            if (state.j()) {
                return new e2(X(), null, this);
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
        if (th3 instanceof e3) {
            for (Object obj2 : list) {
                Throwable th4 = (Throwable) obj2;
                if (th4 != th3 && (th4 instanceof e3)) {
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

    @Override // p001kotlin.coroutines.CoroutineContext
    public <R> R fold(R r10, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) d2.a.b(this, r10, function2);
    }

    /* JADX INFO: renamed from: g0 */
    public boolean getHandlesException() {
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, p001kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.b<E> bVar) {
        return (E) d2.a.c(this, bVar);
    }

    @Override // av.d2
    @NotNull
    public final Sequence<d2> getChildren() {
        return yu.i.b(new d(null));
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public final CoroutineContext.b<?> getKey() {
        return d2.INSTANCE;
    }

    @Override // av.d2
    @NotNull
    public final i1 h(boolean onCancelling, boolean invokeImmediately, @NotNull Function1<? super Throwable, Unit> handler) {
        return r0(invokeImmediately, onCancelling ? new b2(handler) : new c2(handler));
    }

    public boolean h0() {
        return false;
    }

    public final o2 i0(y1 state) {
        o2 list = state.getList();
        if (list != null) {
            return list;
        }
        if (state instanceof l1) {
            return new o2();
        }
        if (state instanceof i2) {
            G0((i2) state);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + state).toString());
    }

    @Override // av.d2
    public final boolean isCancelled() {
        Object objL0 = l0();
        if (objL0 instanceof c0) {
            return true;
        }
        return (objL0 instanceof c) && ((c) objL0).j();
    }

    @Nullable
    public d2 j0() {
        u uVarK0 = k0();
        if (uVarK0 != null) {
            return uVarK0.getParent();
        }
        return null;
    }

    @Override // av.d2
    @NotNull
    public final CancellationException k() {
        Object objL0 = l0();
        if (!(objL0 instanceof c)) {
            if (objL0 instanceof y1) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (objL0 instanceof c0) {
                return M0(this, ((c0) objL0).cause, null, 1, null);
            }
            return new e2(t0.a(this) + " has completed normally", null, this);
        }
        Throwable thF = ((c) objL0).f();
        if (thF != null) {
            CancellationException cancellationExceptionL0 = L0(thF, t0.a(this) + " is cancelling");
            if (cancellationExceptionL0 != null) {
                return cancellationExceptionL0;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    @Nullable
    public final u k0() {
        return (u) b.get(this);
    }

    @Nullable
    public final Object l0() {
        return f3424a.get(this);
    }

    @Override // p001kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.b<?> bVar) {
        return d2.a.d(this, bVar);
    }

    @Override // av.d2
    @NotNull
    public final i1 o(@NotNull Function1<? super Throwable, Unit> handler) {
        return r0(true, new c2(handler));
    }

    public boolean o0(@NotNull Throwable exception) {
        return false;
    }

    public void p0(@NotNull Throwable exception) throws Throwable {
        throw exception;
    }

    @Override // p001kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return d2.a.e(this, coroutineContext);
    }

    public final void q0(@Nullable d2 parent) {
        if (parent == null) {
            I0(q2.f3474a);
            return;
        }
        parent.start();
        u uVarE = parent.E(this);
        I0(uVarE);
        if (d()) {
            uVarE.a();
            I0(q2.f3474a);
        }
    }

    @NotNull
    public final i1 r0(boolean invokeImmediately, @NotNull i2 node) {
        boolean z10;
        boolean zE;
        node.y(this);
        while (true) {
            Object objL0 = l0();
            z10 = true;
            if (!(objL0 instanceof l1)) {
                if (!(objL0 instanceof y1)) {
                    z10 = false;
                    break;
                }
                y1 y1Var = (y1) objL0;
                o2 list = y1Var.getList();
                if (list == null) {
                    Intrinsics.d(objL0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    G0((i2) objL0);
                } else {
                    if (node.w()) {
                        c cVar = y1Var instanceof c ? (c) y1Var : null;
                        Throwable thF = cVar != null ? cVar.f() : null;
                        if (thF != null) {
                            if (invokeImmediately) {
                                node.x(thF);
                            }
                            return q2.f3474a;
                        }
                        zE = list.e(node, 5);
                    } else {
                        zE = list.e(node, 1);
                    }
                    if (zE) {
                        break;
                    }
                }
            } else {
                l1 l1Var = (l1) objL0;
                if (!l1Var.getIsActive()) {
                    F0(l1Var);
                } else if (y1.b.a(f3424a, this, objL0, node)) {
                    break;
                }
            }
        }
        if (z10) {
            return node;
        }
        if (invokeImmediately) {
            Object objL1 = l0();
            c0 c0Var = objL1 instanceof c0 ? (c0) objL1 : null;
            node.x(c0Var != null ? c0Var.cause : null);
        }
        return q2.f3474a;
    }

    public boolean s0() {
        return false;
    }

    @Override // av.d2
    public final boolean start() {
        int iJ0;
        do {
            iJ0 = J0(l0());
            if (iJ0 == 0) {
                return false;
            }
        } while (iJ0 != 1);
        return true;
    }

    public final boolean t0() {
        Object objL0;
        do {
            objL0 = l0();
            if (!(objL0 instanceof y1)) {
                return false;
            }
        } while (J0(objL0) < 0);
        return true;
    }

    @NotNull
    public String toString() {
        return N0() + '@' + t0.b(this);
    }

    @Override // av.w
    public final void u(@NotNull s2 parentJob) throws Throwable {
        T(parentJob);
    }

    public final Object u0(eu.b<? super Unit> bVar) {
        p pVar = new p(fu.b.c(bVar), 1);
        pVar.G();
        r.a(pVar, h2.l(this, false, new u2(pVar), 1, null));
        Object objY = pVar.y();
        if (objY == fu.c.e()) {
            gu.h.c(bVar);
        }
        return objY == fu.c.e() ? objY : Unit.f21506a;
    }

    public final Object v0(Object cause) throws Throwable {
        Throwable thB0 = null;
        while (true) {
            Object objL0 = l0();
            if (objL0 instanceof c) {
                synchronized (objL0) {
                    if (((c) objL0).l()) {
                        return k2.f3442d;
                    }
                    boolean zJ = ((c) objL0).j();
                    if (cause != null || !zJ) {
                        if (thB0 == null) {
                            thB0 = b0(cause);
                        }
                        ((c) objL0).a(thB0);
                    }
                    Throwable thF = zJ ? null : ((c) objL0).f();
                    if (thF != null) {
                        A0(((c) objL0).getList(), thF);
                    }
                    return k2.f3440a;
                }
            }
            if (!(objL0 instanceof y1)) {
                return k2.f3442d;
            }
            if (thB0 == null) {
                thB0 = b0(cause);
            }
            y1 y1Var = (y1) objL0;
            if (!y1Var.getIsActive()) {
                Object objQ0 = Q0(objL0, new c0(thB0, false, 2, null));
                if (objQ0 == k2.f3440a) {
                    throw new IllegalStateException(("Cannot happen in " + objL0).toString());
                }
                if (objQ0 != k2.f3441c) {
                    return objQ0;
                }
            } else if (P0(y1Var, thB0)) {
                return k2.f3440a;
            }
        }
    }

    @Override // av.s2
    @NotNull
    public CancellationException w() {
        Throwable thF;
        Object objL0 = l0();
        if (objL0 instanceof c) {
            thF = ((c) objL0).f();
        } else if (objL0 instanceof c0) {
            thF = ((c0) objL0).cause;
        } else {
            if (objL0 instanceof y1) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objL0).toString());
            }
            thF = null;
        }
        CancellationException cancellationException = thF instanceof CancellationException ? (CancellationException) thF : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new e2("Parent job is " + K0(objL0), thF, this);
    }

    public final boolean w0(@Nullable Object proposedUpdate) {
        Object objQ0;
        do {
            objQ0 = Q0(l0(), proposedUpdate);
            if (objQ0 == k2.f3440a) {
                return false;
            }
            if (objQ0 == k2.b) {
                return true;
            }
        } while (objQ0 == k2.f3441c);
        P(objQ0);
        return true;
    }

    @Nullable
    public final Object x0(@Nullable Object proposedUpdate) {
        Object objQ0;
        do {
            objQ0 = Q0(l0(), proposedUpdate);
            if (objQ0 == k2.f3440a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + proposedUpdate, e0(proposedUpdate));
            }
        } while (objQ0 == k2.f3441c);
        return objQ0;
    }

    @NotNull
    public String y0() {
        return t0.a(this);
    }

    @Override // av.d2
    @Nullable
    public final Object z(@NotNull eu.b<? super Unit> bVar) {
        if (t0()) {
            Object objU0 = u0(bVar);
            return objU0 == fu.c.e() ? objU0 : Unit.f21506a;
        }
        g2.i(bVar.getContext());
        return Unit.f21506a;
    }

    public final v z0(gv.p pVar) {
        while (pVar.r()) {
            pVar = pVar.n();
        }
        while (true) {
            pVar = pVar.m();
            if (!pVar.r()) {
                if (pVar instanceof v) {
                    return (v) pVar;
                }
                if (pVar instanceof o2) {
                    return null;
                }
            }
        }
    }
}
