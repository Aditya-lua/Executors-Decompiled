package ku;

import iu.k3;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ou.b0;
import ou.c0;
import ou.d0;
import ou.s0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003:ª\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\"\b\u0002\u0010\b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b\f\u0010\rJ6\u0010\u0013\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0016\u001a\u00020\u0006*\u00020\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJG\u0010 \u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!JG\u0010\"\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\"\u0010!J\u0017\u0010$\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u0011H\u0003¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u0011H\u0002¢\u0006\u0004\b'\u0010%J\u001b\u0010(\u001a\u00020\u001e*\u00020\u001c2\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b(\u0010)J.\u0010+\u001a\u00028\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b+\u0010,J)\u0010-\u001a\u00020\u0006*\u00020\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b-\u0010\u0017J\u001d\u0010.\u001a\u00020\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0002¢\u0006\u0004\b.\u0010/J4\u00101\u001a\b\u0012\u0004\u0012\u00028\u0000002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b1\u0010,J#\u00102\u001a\u00020\u00062\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000000\u0018H\u0002¢\u0006\u0004\b2\u0010/J9\u00103\u001a\u0004\u0018\u00010\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b3\u00104J9\u00105\u001a\u0004\u0018\u00010\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b5\u00104J)\u00106\u001a\u00020\u001e*\u00020\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0006H\u0002¢\u0006\u0004\b8\u00109J-\u0010;\u001a\u00020\u001e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0011H\u0002¢\u0006\u0004\b;\u0010<J-\u0010=\u001a\u00020\u001e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0011H\u0002¢\u0006\u0004\b=\u0010<J\u0019\u0010?\u001a\u00020\u00062\b\b\u0002\u0010>\u001a\u00020\u0011H\u0002¢\u0006\u0004\b?\u0010@J%\u0010D\u001a\u00020\u00062\n\u0010B\u001a\u0006\u0012\u0002\b\u00030A2\b\u0010C\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\bD\u0010EJ\u001b\u0010F\u001a\u00020\u00062\n\u0010B\u001a\u0006\u0012\u0002\b\u00030AH\u0002¢\u0006\u0004\bF\u0010GJ%\u0010I\u001a\u0004\u0018\u00010\u001c2\b\u0010C\u001a\u0004\u0018\u00010\u001c2\b\u0010H\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\bI\u0010JJ%\u0010K\u001a\u0004\u0018\u00010\u001c2\b\u0010C\u001a\u0004\u0018\u00010\u001c2\b\u0010H\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\bK\u0010JJ\u000f\u0010L\u001a\u00020\u0006H\u0002¢\u0006\u0004\bL\u00109J\u000f\u0010M\u001a\u00020\u0006H\u0002¢\u0006\u0004\bM\u00109J\u000f\u0010N\u001a\u00020\u0006H\u0002¢\u0006\u0004\bN\u00109J\u000f\u0010O\u001a\u00020\u0006H\u0002¢\u0006\u0004\bO\u00109J\u000f\u0010P\u001a\u00020\u0006H\u0002¢\u0006\u0004\bP\u00109J\u001d\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010Q\u001a\u00020\u0011H\u0002¢\u0006\u0004\bR\u0010SJ\u0017\u0010T\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020\u0011H\u0002¢\u0006\u0004\bT\u0010@J\u0015\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bU\u0010VJ\u001d\u0010X\u001a\u00020\u00112\f\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bX\u0010YJ\u001d\u0010Z\u001a\u00020\u00062\f\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bZ\u0010[J%\u0010]\u001a\u00020\u00062\f\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\\\u001a\u00020\u0011H\u0002¢\u0006\u0004\b]\u0010^J\u0013\u0010_\u001a\u00020\u0006*\u00020\u0015H\u0002¢\u0006\u0004\b_\u0010`J\u0013\u0010a\u001a\u00020\u0006*\u00020\u0015H\u0002¢\u0006\u0004\ba\u0010`J\u001b\u0010c\u001a\u00020\u0006*\u00020\u00152\u0006\u0010b\u001a\u00020\u001eH\u0002¢\u0006\u0004\bc\u0010dJ\u001f\u0010g\u001a\u00020\u001e2\u0006\u0010e\u001a\u00020\u00112\u0006\u0010f\u001a\u00020\u001eH\u0002¢\u0006\u0004\bg\u0010hJ-\u0010j\u001a\u00020\u001e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010i\u001a\u00020\u0011H\u0002¢\u0006\u0004\bj\u0010<J-\u0010m\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0006\u0010k\u001a\u00020\u00112\f\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bm\u0010nJ-\u0010o\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0006\u0010k\u001a\u00020\u00112\f\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bo\u0010nJ5\u0010q\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0006\u0010k\u001a\u00020\u00112\f\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010p\u001a\u00020\u0011H\u0002¢\u0006\u0004\bq\u0010rJ%\u0010s\u001a\u00020\u00062\u0006\u0010k\u001a\u00020\u00112\f\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bs\u0010tJ\u0017\u0010v\u001a\u00020\u00062\u0006\u0010u\u001a\u00020\u0011H\u0002¢\u0006\u0004\bv\u0010@J\u0017\u0010w\u001a\u00020\u00062\u0006\u0010u\u001a\u00020\u0011H\u0002¢\u0006\u0004\bw\u0010@JG\u0010{\u001a \u0012\u0004\u0012\u00020y\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000000\u0012\u0004\u0012\u00020z\u0012\u0004\u0012\u00020\u00060x*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u0007H\u0002¢\u0006\u0004\b{\u0010|J.\u0010\u007f\u001a\u00020\u00062\u0006\u0010}\u001a\u00020y2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u0000002\u0006\u0010~\u001a\u00020zH\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001JO\u0010\u0082\u0001\u001a\u001d\u0012\u0004\u0012\u00020y\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020z\u0012\u0004\u0012\u00020\u00060\u0081\u0001*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u00072\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001JC\u0010\u0084\u0001\u001a\u001a\u0012\u0004\u0012\u00020y\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020z\u0012\u0004\u0012\u00020\u00060x*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u0007H\u0002¢\u0006\u0005\b\u0084\u0001\u0010|J*\u0010\u0085\u0001\u001a\u00020\u00062\u0006\u0010}\u001a\u00020y2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010~\u001a\u00020zH\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0080\u0001J\u001a\u0010\u0086\u0001\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u0000H\u0096@¢\u0006\u0005\b\u0086\u0001\u0010\rJ \u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020\u0006002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J \u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00020\u0006002\u0006\u0010\u000b\u001a\u00028\u0000H\u0004¢\u0006\u0006\b\u0089\u0001\u0010\u0088\u0001J\u0011\u0010\u008a\u0001\u001a\u00020\u0006H\u0014¢\u0006\u0005\b\u008a\u0001\u00109J\u0011\u0010\u008b\u0001\u001a\u00020\u0006H\u0014¢\u0006\u0005\b\u008b\u0001\u00109J\u0013\u0010\u008c\u0001\u001a\u00028\u0000H\u0096@¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u0019\u0010\u008e\u0001\u001a\b\u0012\u0004\u0012\u00028\u000000H\u0096@¢\u0006\u0006\b\u008e\u0001\u0010\u008d\u0001J\u0018\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00028\u000000H\u0016¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001a\u0010\u0092\u0001\u001a\u00020\u00062\u0007\u0010\u0091\u0001\u001a\u00020\u0011H\u0004¢\u0006\u0005\b\u0092\u0001\u0010@J\u0019\u0010\u0093\u0001\u001a\u00020\u00062\u0006\u0010i\u001a\u00020\u0011H\u0000¢\u0006\u0005\b\u0093\u0001\u0010@J\u001a\u0010\u0095\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0094\u0001H\u0096\u0002¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u0011\u0010\u0097\u0001\u001a\u00020\u0006H\u0014¢\u0006\u0005\b\u0097\u0001\u00109J\u001c\u0010\u0098\u0001\u001a\u00020\u001e2\b\u0010}\u001a\u0004\u0018\u00010yH\u0016¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\"\u0010\u009c\u0001\u001a\u00020\u00062\u0010\u0010}\u001a\f\u0018\u00010\u009a\u0001j\u0005\u0018\u0001`\u009b\u0001¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u001c\u0010\u009e\u0001\u001a\u00020\u001e2\b\u0010}\u001a\u0004\u0018\u00010yH\u0010¢\u0006\u0006\b\u009e\u0001\u0010\u0099\u0001J%\u0010 \u0001\u001a\u00020\u001e2\b\u0010}\u001a\u0004\u0018\u00010y2\u0007\u0010\u009f\u0001\u001a\u00020\u001eH\u0014¢\u0006\u0006\b \u0001\u0010¡\u0001J)\u0010£\u0001\u001a\u00020\u00062\u0015\u0010¢\u0001\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010y\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u0012\u0010¥\u0001\u001a\u00020\u001eH\u0000¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\u0013\u0010¨\u0001\u001a\u00030§\u0001H\u0016¢\u0006\u0006\b¨\u0001\u0010©\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R/\u0010\b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00078\u0000X\u0081\u0004¢\u0006\u0007\n\u0005\b:\u0010¬\u0001Rc\u0010°\u0001\u001aG\u0012\b\u0012\u0006\u0012\u0002\b\u00030A\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020y\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020z\u0012\u0004\u0012\u00020\u00060\u0081\u0001\u0018\u00010\u0081\u0001j\u0005\u0018\u0001`\u00ad\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\b\u009c\u0001\u0010®\u0001\u0012\u0005\b¯\u0001\u00109R\u0017\u0010³\u0001\u001a\u00020\u00118BX\u0082\u0004¢\u0006\b\u001a\u0006\b±\u0001\u0010²\u0001R\u0017\u0010µ\u0001\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\b\u001a\u0006\b´\u0001\u0010¦\u0001R\u0017\u0010¸\u0001\u001a\u00020y8BX\u0082\u0004¢\u0006\b\u001a\u0006\b¶\u0001\u0010·\u0001R\u001a\u0010º\u0001\u001a\u00020\u001e*\u00020\u00118BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¹\u0001\u0010%R\u001a\u0010¼\u0001\u001a\u00020\u001e*\u00020\u00118BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b»\u0001\u0010%R\u0016\u0010\\\u001a\u00020\u00118@X\u0080\u0004¢\u0006\b\u001a\u0006\b½\u0001\u0010²\u0001R\u0017\u0010¿\u0001\u001a\u00020\u00118@X\u0080\u0004¢\u0006\b\u001a\u0006\b¾\u0001\u0010²\u0001R%\u0010Ä\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000À\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\bÃ\u0001\u00109\u001a\u0006\bÁ\u0001\u0010Â\u0001R+\u0010Ç\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000000À\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\bÆ\u0001\u00109\u001a\u0006\bÅ\u0001\u0010Â\u0001R\u0019\u0010É\u0001\u001a\u0004\u0018\u00010y8DX\u0084\u0004¢\u0006\b\u001a\u0006\bÈ\u0001\u0010·\u0001R\u0017\u0010Ë\u0001\u001a\u00020y8DX\u0084\u0004¢\u0006\b\u001a\u0006\bÊ\u0001\u0010·\u0001R\u0017\u0010Í\u0001\u001a\u00020\u001e8TX\u0094\u0004¢\u0006\b\u001a\u0006\bÌ\u0001\u0010¦\u0001R\u001e\u0010Ð\u0001\u001a\u00020\u001e8VX\u0097\u0004¢\u0006\u000f\u0012\u0005\bÏ\u0001\u00109\u001a\u0006\bÎ\u0001\u0010¦\u0001R\u001d\u0010f\u001a\u00020\u001e8VX\u0097\u0004¢\u0006\u000f\u0012\u0005\bÒ\u0001\u00109\u001a\u0006\bÑ\u0001\u0010¦\u0001R\r\u0010Ô\u0001\u001a\u00030Ó\u00018\u0002X\u0082\u0004R\r\u0010Õ\u0001\u001a\u00030Ó\u00018\u0002X\u0082\u0004R\r\u0010Ö\u0001\u001a\u00030Ó\u00018\u0002X\u0082\u0004R\r\u0010×\u0001\u001a\u00030Ó\u00018\u0002X\u0082\u0004R\u0019\u0010Ù\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0Ø\u00018\u0002X\u0082\u0004R\u0019\u0010Ú\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0Ø\u00018\u0002X\u0082\u0004R\u0019\u0010Û\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0Ø\u00018\u0002X\u0082\u0004R\u0015\u0010Ü\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0Ø\u00018\u0002X\u0082\u0004R\u0015\u0010Ý\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0Ø\u00018\u0002X\u0082\u0004¨\u0006Þ\u0001"}, d2 = {"Lku/e;", "E", "Lku/g;", "", "capacity", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILkotlin/jvm/functions/Function1;)V", "element", "P0", "(Ljava/lang/Object;Llt/b;)Ljava/lang/Object;", "Lku/m;", "segment", "index", "", "s", "j1", "(Lku/m;ILjava/lang/Object;JLlt/b;)Ljava/lang/Object;", "Liu/k3;", "W0", "(Liu/k3;Lku/m;I)V", "Liu/n;", "cont", "Q0", "(Ljava/lang/Object;Liu/n;)V", "", "waiter", "", "closed", "s1", "(Lku/m;ILjava/lang/Object;JLjava/lang/Object;Z)I", "t1", "curSendersAndCloseStatus", "k1", "(J)Z", "curSenders", "S", "l1", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "r", "c1", "(Lku/m;IJLlt/b;)Ljava/lang/Object;", "V0", "N0", "(Liu/n;)V", "Lku/k;", "b1", "M0", "q1", "(Lku/m;IJLjava/lang/Object;)Ljava/lang/Object;", "r1", "m1", "(Ljava/lang/Object;Lku/m;I)Z", "b0", "()V", "b", "o1", "(Lku/m;IJ)Z", "p1", "nAttempts", "v0", "(J)V", "Lru/l;", "select", "ignoredParam", "d1", "(Lru/l;Ljava/lang/Object;)V", "O0", "(Lru/l;)V", "selectResult", "X0", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Y0", "x0", "H0", "G0", "F0", "Z", "sendersCur", "Y", "(J)Lku/m;", "X", "V", "()Lku/m;", "lastSegment", "E0", "(Lku/m;)J", "e1", "(Lku/m;)V", "sendersCounter", "U", "(Lku/m;J)V", "f1", "(Liu/k3;)V", "g1", "receiver", "h1", "(Liu/k3;Z)V", "sendersAndCloseStatusCur", "isClosedForReceive", "z0", "(JZ)Z", "globalIndex", "y0", "id", "startFrom", "e0", "(JLku/m;)Lku/m;", "d0", "currentBufferEndCounter", "c0", "(JLku/m;J)Lku/m;", "I0", "(JLku/m;)V", "value", "v1", "u1", "Lkotlin/reflect/KFunction3;", "", "Lkotlin/coroutines/CoroutineContext;", "R", "(Lkotlin/jvm/functions/Function1;)Lfu/g;", "cause", "context", "J0", "(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", "Lkotlin/Function3;", "P", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lxt/n;", "O", "K0", "z", "y", "(Ljava/lang/Object;)Ljava/lang/Object;", "n1", "S0", "R0", "g", "(Llt/b;)Ljava/lang/Object;", "k", "D", "()Ljava/lang/Object;", "globalCellIndex", "a0", "w1", "Lku/i;", "iterator", "()Lku/i;", "L0", "G", "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "c", "(Ljava/util/concurrent/CancellationException;)V", "T", "cancel", "W", "(Ljava/lang/Throwable;Z)Z", "handler", "x", "(Lkotlin/jvm/functions/Function1;)V", "u0", "()Z", "", "toString", "()Ljava/lang/String;", "a", "I", "Lkotlin/jvm/functions/Function1;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "Lxt/n;", "getOnUndeliveredElementReceiveCancellationConstructor$annotations", "onUndeliveredElementReceiveCancellationConstructor", "g0", "()J", "bufferEndCounter", "D0", "isRendezvousOrUnlimited", "l0", "()Ljava/lang/Throwable;", "receiveException", "B0", "isClosedForSend0", "A0", "isClosedForReceive0", "s0", "o0", "receiversCounter", "Lru/h;", "B", "()Lru/h;", "getOnReceive$annotations", "onReceive", "C", "getOnReceiveCatching$annotations", "onReceiveCatching", "i0", "closeCause", "p0", "sendException", "C0", "isConflatedDropOldest", "J", "isClosedForSend$annotations", "isClosedForSend", "i", "isClosedForReceive$annotations", "Lkotlinx/atomicfu/AtomicLong;", "sendersAndCloseStatus", "receivers", "bufferEnd", "completedExpandBuffersAndPauseFlag", "Lkotlinx/atomicfu/AtomicRef;", "sendSegment", "receiveSegment", "bufferEndSegment", "_closeCause", "closeHandler", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class e<E> implements ku.g<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f23209d = AtomicLongFieldUpdater.newUpdater(e.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f23210e = AtomicLongFieldUpdater.newUpdater(e.class, "receivers$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f23211f = AtomicLongFieldUpdater.newUpdater(e.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f23212g = AtomicLongFieldUpdater.newUpdater(e.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23213h = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23214i = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23215j = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23216k = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23217l = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int capacity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final Function1<E, Unit> onUndeliveredElement;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final xt.n<ru.l<?>, Object, Object, xt.n<Throwable, Object, CoroutineContext, Unit>> onUndeliveredElementReceiveCancellationConstructor;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0096B¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\u001b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u0015R\u0018\u0010 \u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lku/e$a;", "Lku/i;", "Liu/k3;", "<init>", "(Lku/e;)V", "", "a", "(Llt/b;)Ljava/lang/Object;", "Lou/b0;", "segment", "", "index", "", "e", "(Lou/b0;I)V", "next", "()Ljava/lang/Object;", "element", "i", "(Ljava/lang/Object;)Z", "j", "()V", "g", "()Z", "Lku/m;", "", "r", "f", "(Lku/m;IJLlt/b;)Ljava/lang/Object;", "h", "", "Ljava/lang/Object;", "receiveResult", "Liu/p;", "b", "Liu/p;", "continuation", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a implements ku.i<E>, k3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Object receiveResult = ku.f.f23250p;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public iu.p<? super Boolean> continuation;

        public a() {
        }

        @Override // ku.i
        @Nullable
        public Object a(@NotNull lt.b<? super Boolean> bVar) throws Throwable {
            m<E> mVarD0;
            boolean zG = true;
            if (this.receiveResult == ku.f.f23250p || this.receiveResult == ku.f.z()) {
                e<E> eVar = e.this;
                m<E> mVar = (m) e.m0().get(eVar);
                while (!eVar.i()) {
                    long andIncrement = e.n0().getAndIncrement(eVar);
                    int i10 = ku.f.b;
                    long j10 = andIncrement / ((long) i10);
                    int i11 = (int) (andIncrement % ((long) i10));
                    if (mVar.id != j10) {
                        mVarD0 = eVar.d0(j10, mVar);
                        if (mVarD0 == null) {
                            continue;
                        }
                    } else {
                        mVarD0 = mVar;
                    }
                    Object objQ1 = eVar.q1(mVarD0, i11, andIncrement, null);
                    if (objQ1 == ku.f.f23247m) {
                        throw new IllegalStateException("unreachable");
                    }
                    if (objQ1 == ku.f.f23249o) {
                        if (andIncrement < eVar.s0()) {
                            mVarD0.b();
                        }
                        mVar = mVarD0;
                    } else {
                        if (objQ1 == ku.f.f23248n) {
                            return f(mVarD0, i11, andIncrement, bVar);
                        }
                        mVarD0.b();
                        this.receiveResult = objQ1;
                    }
                }
                zG = g();
            }
            return nt.b.a(zG);
        }

        @Override // iu.k3
        public void e(@NotNull b0<?> segment, int index) {
            iu.p<? super Boolean> pVar = this.continuation;
            if (pVar != null) {
                pVar.e(segment, index);
            }
        }

        public final Object f(m<E> mVar, int i10, long j10, lt.b<? super Boolean> bVar) throws Throwable {
            Boolean boolA;
            Function1<E, Unit> function1;
            m mVarD0;
            e<E> eVar = e.this;
            iu.p pVarB = iu.r.b(mt.b.c(bVar));
            try {
                this.continuation = pVarB;
                try {
                    Object objQ1 = eVar.q1(mVar, i10, j10, this);
                    if (objQ1 == ku.f.f23247m) {
                        eVar.V0(this, mVar, i10);
                    } else {
                        xt.n nVarP = null;
                        if (objQ1 == ku.f.f23249o) {
                            if (j10 < eVar.s0()) {
                                mVar.b();
                            }
                            m mVar2 = (m) e.m0().get(eVar);
                            while (true) {
                                if (eVar.i()) {
                                    h();
                                } else {
                                    long andIncrement = e.n0().getAndIncrement(eVar);
                                    int i11 = ku.f.b;
                                    long j11 = andIncrement / ((long) i11);
                                    int i12 = (int) (andIncrement % ((long) i11));
                                    if (mVar2.id != j11) {
                                        mVarD0 = eVar.d0(j11, mVar2);
                                        if (mVarD0 == null) {
                                        }
                                    } else {
                                        mVarD0 = mVar2;
                                    }
                                    objQ1 = eVar.q1(mVarD0, i12, andIncrement, this);
                                    if (objQ1 == ku.f.f23247m) {
                                        eVar.V0(this, mVarD0, i12);
                                    } else if (objQ1 == ku.f.f23249o) {
                                        if (andIncrement < eVar.s0()) {
                                            mVarD0.b();
                                        }
                                        mVar2 = mVarD0;
                                    } else {
                                        if (objQ1 == ku.f.f23248n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        mVarD0.b();
                                        this.receiveResult = objQ1;
                                        this.continuation = null;
                                        boolA = nt.b.a(true);
                                        function1 = eVar.onUndeliveredElement;
                                        if (function1 != null) {
                                            nVarP = eVar.P(function1, objQ1);
                                        }
                                        pVarB.j(boolA, nVarP);
                                    }
                                }
                            }
                        } else {
                            mVar.b();
                            this.receiveResult = objQ1;
                            this.continuation = null;
                            boolA = nt.b.a(true);
                            function1 = eVar.onUndeliveredElement;
                            if (function1 != null) {
                                nVarP = eVar.P(function1, objQ1);
                            }
                            pVarB.j(boolA, nVarP);
                        }
                    }
                    Object objA = pVarB.A();
                    if (objA == mt.c.e()) {
                        nt.h.c(bVar);
                    }
                    return objA;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    pVarB.Q();
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }

        public final boolean g() throws Throwable {
            this.receiveResult = ku.f.z();
            Throwable thI0 = e.this.i0();
            if (thI0 == null) {
                return false;
            }
            throw d0.a(thI0);
        }

        public final void h() {
            iu.p<? super Boolean> pVar = this.continuation;
            Intrinsics.checkNotNull(pVar);
            this.continuation = null;
            this.receiveResult = ku.f.z();
            Throwable thI0 = e.this.i0();
            if (thI0 == null) {
                gt.n.Companion companion = gt.n.INSTANCE;
                pVar.resumeWith(gt.n.b(Boolean.FALSE));
            } else {
                gt.n.Companion companion2 = gt.n.INSTANCE;
                pVar.resumeWith(gt.n.b(gt.o.a(thI0)));
            }
        }

        public final boolean i(E element) {
            iu.p<? super Boolean> pVar = this.continuation;
            Intrinsics.checkNotNull(pVar);
            this.continuation = null;
            this.receiveResult = element;
            Boolean bool = Boolean.TRUE;
            e<E> eVar = e.this;
            Function1<E, Unit> function1 = eVar.onUndeliveredElement;
            return ku.f.B(pVar, bool, function1 != null ? eVar.P(function1, element) : null);
        }

        public final void j() {
            iu.p<? super Boolean> pVar = this.continuation;
            Intrinsics.checkNotNull(pVar);
            this.continuation = null;
            this.receiveResult = ku.f.z();
            Throwable thI0 = e.this.i0();
            if (thI0 == null) {
                gt.n.Companion companion = gt.n.INSTANCE;
                pVar.resumeWith(gt.n.b(Boolean.FALSE));
            } else {
                gt.n.Companion companion2 = gt.n.INSTANCE;
                pVar.resumeWith(gt.n.b(gt.o.a(thI0)));
            }
        }

        @Override // ku.i
        public E next() throws Throwable {
            E e10 = (E) this.receiveResult;
            if (e10 == ku.f.f23250p) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            this.receiveResult = ku.f.f23250p;
            if (e10 != ku.f.z()) {
                return e10;
            }
            throw d0.a(e.this.l0());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lku/e$b;", "Liu/k3;", "Liu/n;", "", "cont", "Liu/n;", "a", "()Liu/n;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements k3 {
        @NotNull
        public final iu.n<Boolean> a() {
            throw null;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class c extends kotlin.jvm.internal.k implements xt.n<Throwable, E, CoroutineContext, Unit> {
        public c(Object obj) {
            super(3, obj, e.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        public final void d(Throwable th2, E e10, CoroutineContext coroutineContext) throws IllegalAccessException, InvocationTargetException {
            ((e) this.receiver).K0(th2, e10, coroutineContext);
        }

        @Override // xt.n
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2, Object obj, CoroutineContext coroutineContext) throws IllegalAccessException, InvocationTargetException {
            d(th2, obj, coroutineContext);
            return Unit.f22938a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class d extends kotlin.jvm.internal.k implements xt.n<Throwable, k<? extends E>, CoroutineContext, Unit> {
        public d(Object obj) {
            super(3, obj, e.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        public final void d(Throwable th2, Object obj, CoroutineContext coroutineContext) throws IllegalAccessException, InvocationTargetException {
            ((e) this.receiver).J0(th2, obj, coroutineContext);
        }

        @Override // xt.n
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2, Object obj, CoroutineContext coroutineContext) throws IllegalAccessException, InvocationTargetException {
            d(th2, ((k) obj).getHolder(), coroutineContext);
            return Unit.f22938a;
        }
    }

    /* JADX INFO: renamed from: ku.e$e, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class C0406e extends kotlin.jvm.internal.k implements xt.n<e<?>, ru.l<?>, Object, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0406e f23222a = new C0406e();

        public C0406e() {
            super(3, e.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void d(e<?> eVar, ru.l<?> lVar, Object obj) {
            eVar.d1(lVar, obj);
        }

        @Override // xt.n
        public /* bridge */ /* synthetic */ Unit invoke(e<?> eVar, ru.l<?> lVar, Object obj) {
            d(eVar, lVar, obj);
            return Unit.f22938a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class f extends kotlin.jvm.internal.k implements xt.n<e<?>, Object, Object, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f23223a = new f();

        public f() {
            super(3, e.class, "processResultSelectReceive", "processResultSelectReceive(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // xt.n
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(e<?> eVar, Object obj, Object obj2) {
            return eVar.X0(obj, obj2);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class g extends kotlin.jvm.internal.k implements xt.n<e<?>, ru.l<?>, Object, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f23224a = new g();

        public g() {
            super(3, e.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void d(e<?> eVar, ru.l<?> lVar, Object obj) {
            eVar.d1(lVar, obj);
        }

        @Override // xt.n
        public /* bridge */ /* synthetic */ Unit invoke(e<?> eVar, ru.l<?> lVar, Object obj) {
            d(eVar, lVar, obj);
            return Unit.f22938a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class h extends kotlin.jvm.internal.k implements xt.n<e<?>, Object, Object, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f23225a = new h();

        public h() {
            super(3, e.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // xt.n
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(e<?> eVar, Object obj, Object obj2) {
            return eVar.Y0(obj, obj2);
        }
    }

    @nt.f(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {759}, m = "receiveCatching-JP2dKIU$suspendImpl")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class i<E> extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f23226t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ e<E> f23227u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f23228v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(e<E> eVar, lt.b<? super i> bVar) {
            super(bVar);
            this.f23227u = eVar;
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            this.f23226t = obj;
            this.f23228v |= Integer.MIN_VALUE;
            Object objA1 = e.a1(this.f23227u, this);
            return objA1 == mt.c.e() ? objA1 : k.b(objA1);
        }
    }

    @nt.f(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {3117}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class j extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f23229t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f23230u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f23231v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public long f23232w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f23233x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ e<E> f23234y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f23235z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(e<E> eVar, lt.b<? super j> bVar) {
            super(bVar);
            this.f23234y = eVar;
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            this.f23233x = obj;
            this.f23235z |= Integer.MIN_VALUE;
            Object objB1 = this.f23234y.b1(null, 0, 0L, this);
            return objB1 == mt.c.e() ? objB1 : k.b(objB1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(int i10, @Nullable Function1<? super E, Unit> function1) {
        this.capacity = i10;
        this.onUndeliveredElement = function1;
        if (i10 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i10 + ", should be >=0").toString());
        }
        this.bufferEnd$volatile = ku.f.A(i10);
        this.completedExpandBuffersAndPauseFlag$volatile = g0();
        m mVar = new m(0L, null, this, 3);
        this.sendSegment$volatile = mVar;
        this.receiveSegment$volatile = mVar;
        if (D0()) {
            mVar = ku.f.f23236a;
            Intrinsics.d(mVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = mVar;
        this.onUndeliveredElementReceiveCancellationConstructor = function1 != 0 ? new xt.n() { // from class: ku.b
            @Override // xt.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return e.T0(this.f23205a, (ru.l) obj, obj2, obj3);
            }
        } : null;
        this._closeCause$volatile = ku.f.f23253s;
    }

    public static final Unit Q(Function1 function1, Object obj, Throwable th2, Object obj2, CoroutineContext coroutineContext) throws IllegalAccessException, InvocationTargetException {
        ou.x.a(function1, obj, coroutineContext);
        return Unit.f22938a;
    }

    public static final xt.n T0(final e eVar, final ru.l lVar, Object obj, final Object obj2) {
        return new xt.n() { // from class: ku.d
            @Override // xt.n
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return e.U0(obj2, eVar, lVar, (Throwable) obj3, obj4, (CoroutineContext) obj5);
            }
        };
    }

    public static final Unit U0(Object obj, e eVar, ru.l lVar, Throwable th2, Object obj2, CoroutineContext coroutineContext) throws IllegalAccessException, InvocationTargetException {
        if (obj != ku.f.z()) {
            ou.x.a(eVar.onUndeliveredElement, obj, lVar.getContext());
        }
        return Unit.f22938a;
    }

    public static /* synthetic */ <E> Object Z0(e<E> eVar, lt.b<? super E> bVar) throws Throwable {
        m<E> mVar;
        m<E> mVar2 = (m) m0().get(eVar);
        while (!eVar.i()) {
            long andIncrement = n0().getAndIncrement(eVar);
            int i10 = ku.f.b;
            long j10 = andIncrement / ((long) i10);
            int i11 = (int) (andIncrement % ((long) i10));
            if (mVar2.id != j10) {
                m<E> mVarD0 = eVar.d0(j10, mVar2);
                if (mVarD0 == null) {
                    continue;
                } else {
                    mVar = mVarD0;
                }
            } else {
                mVar = mVar2;
            }
            e<E> eVar2 = eVar;
            Object objQ1 = eVar2.q1(mVar, i11, andIncrement, null);
            if (objQ1 == ku.f.f23247m) {
                throw new IllegalStateException("unexpected");
            }
            if (objQ1 != ku.f.f23249o) {
                if (objQ1 == ku.f.f23248n) {
                    return eVar2.c1(mVar, i11, andIncrement, bVar);
                }
                mVar.b();
                return objQ1;
            }
            if (andIncrement < eVar2.s0()) {
                mVar.b();
            }
            eVar = eVar2;
            mVar2 = mVar;
        }
        throw d0.a(eVar.l0());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ <E> Object a1(e<E> eVar, lt.b<? super k<? extends E>> bVar) throws Throwable {
        i iVar;
        m<E> mVar;
        if (bVar instanceof i) {
            iVar = (i) bVar;
            int i10 = iVar.f23228v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.f23228v = i10 - Integer.MIN_VALUE;
            } else {
                iVar = new i(eVar, bVar);
            }
        } else {
            iVar = new i(eVar, bVar);
        }
        i iVar2 = iVar;
        Object obj = iVar2.f23226t;
        Object objE = mt.c.e();
        int i11 = iVar2.f23228v;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            return ((k) obj).getHolder();
        }
        gt.o.b(obj);
        m<E> mVar2 = (m) m0().get(eVar);
        while (!eVar.i()) {
            long andIncrement = n0().getAndIncrement(eVar);
            int i12 = ku.f.b;
            long j10 = andIncrement / ((long) i12);
            int i13 = (int) (andIncrement % ((long) i12));
            if (mVar2.id != j10) {
                m<E> mVarD0 = eVar.d0(j10, mVar2);
                if (mVarD0 == null) {
                    continue;
                } else {
                    mVar = mVarD0;
                }
            } else {
                mVar = mVar2;
            }
            e<E> eVar2 = eVar;
            Object objQ1 = eVar2.q1(mVar, i13, andIncrement, null);
            if (objQ1 == ku.f.f23247m) {
                throw new IllegalStateException("unexpected");
            }
            if (objQ1 != ku.f.f23249o) {
                if (objQ1 != ku.f.f23248n) {
                    mVar.b();
                    return k.INSTANCE.c(objQ1);
                }
                iVar2.f23228v = 1;
                Object objB1 = eVar2.b1(mVar, i13, andIncrement, iVar2);
                return objB1 == objE ? objE : objB1;
            }
            if (andIncrement < eVar2.s0()) {
                mVar.b();
            }
            eVar = eVar2;
            mVar2 = mVar;
        }
        return k.INSTANCE.a(eVar.i0());
    }

    public static /* synthetic */ <E> Object i1(e<E> eVar, E e10, lt.b<? super Unit> bVar) throws IllegalAccessException, InvocationTargetException {
        m<E> mVar;
        m<E> mVar2 = (m) q0().get(eVar);
        while (true) {
            long andIncrement = r0().getAndIncrement(eVar);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zB0 = eVar.B0(andIncrement);
            int i10 = ku.f.b;
            long j11 = j10 / ((long) i10);
            int i11 = (int) (j10 % ((long) i10));
            if (mVar2.id != j11) {
                m<E> mVarE0 = eVar.e0(j11, mVar2);
                if (mVarE0 != null) {
                    mVar = mVarE0;
                } else if (zB0) {
                    Object objP0 = eVar.P0(e10, bVar);
                    if (objP0 != mt.c.e()) {
                        break;
                    }
                    return objP0;
                }
            } else {
                mVar = mVar2;
            }
            e<E> eVar2 = eVar;
            E e11 = e10;
            int iS1 = eVar2.s1(mVar, i11, e11, j10, null, zB0);
            if (iS1 == 0) {
                mVar.b();
                break;
            }
            if (iS1 != 1) {
                if (iS1 == 2) {
                    if (!zB0) {
                        break;
                    }
                    mVar.t();
                    Object objP1 = eVar2.P0(e11, bVar);
                    if (objP1 != mt.c.e()) {
                        break;
                    }
                    return objP1;
                }
                if (iS1 == 3) {
                    Object objJ1 = eVar2.j1(mVar, i11, e11, j10, bVar);
                    if (objJ1 != mt.c.e()) {
                        break;
                    }
                    return objJ1;
                }
                if (iS1 == 4) {
                    if (j10 < eVar2.o0()) {
                        mVar.b();
                    }
                    Object objP2 = eVar2.P0(e11, bVar);
                    if (objP2 != mt.c.e()) {
                        break;
                    }
                    return objP2;
                }
                if (iS1 == 5) {
                    mVar.b();
                }
                eVar = eVar2;
                mVar2 = mVar;
                e10 = e11;
            } else {
                break;
            }
        }
        return Unit.f22938a;
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater m0() {
        return f23214i;
    }

    public static final /* synthetic */ AtomicLongFieldUpdater n0() {
        return f23210e;
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater q0() {
        return f23213h;
    }

    public static final /* synthetic */ AtomicLongFieldUpdater r0() {
        return f23209d;
    }

    public static /* synthetic */ void w0(e eVar, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i10 & 1) != 0) {
            j10 = 1;
        }
        eVar.v0(j10);
    }

    public final boolean A0(long j10) {
        return z0(j10, true);
    }

    @Override // ku.x
    @NotNull
    public ru.h<E> B() {
        C0406e c0406e = C0406e.f23222a;
        Intrinsics.d(c0406e, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        xt.n nVar = (xt.n) h0.e(c0406e, 3);
        f fVar = f.f23223a;
        Intrinsics.d(fVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new ru.i(this, nVar, (xt.n) h0.e(fVar, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    public final boolean B0(long j10) {
        return z0(j10, false);
    }

    @Override // ku.x
    @NotNull
    public ru.h<k<E>> C() {
        g gVar = g.f23224a;
        Intrinsics.d(gVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        xt.n nVar = (xt.n) h0.e(gVar, 3);
        h hVar = h.f23225a;
        Intrinsics.d(hVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new ru.i(this, nVar, (xt.n) h0.e(hVar, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    public boolean C0() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ku.x
    @NotNull
    public Object D() {
        m mVarD0;
        long j10 = f23210e.get(this);
        long j11 = f23209d.get(this);
        if (A0(j11)) {
            return k.INSTANCE.a(i0());
        }
        if (j10 >= (j11 & 1152921504606846975L)) {
            return k.INSTANCE.b();
        }
        Object obj = ku.f.f23245k;
        m mVar = (m) m0().get(this);
        while (!i()) {
            long andIncrement = n0().getAndIncrement(this);
            int i10 = ku.f.b;
            long j12 = andIncrement / ((long) i10);
            int i11 = (int) (andIncrement % ((long) i10));
            if (mVar.id != j12) {
                mVarD0 = d0(j12, mVar);
                if (mVarD0 == null) {
                    continue;
                }
            } else {
                mVarD0 = mVar;
            }
            Object objQ1 = q1(mVarD0, i11, andIncrement, obj);
            if (objQ1 == ku.f.f23247m) {
                k3 k3Var = obj instanceof k3 ? (k3) obj : null;
                if (k3Var != null) {
                    V0(k3Var, mVarD0, i11);
                }
                w1(andIncrement);
                mVarD0.t();
                return k.INSTANCE.b();
            }
            if (objQ1 != ku.f.f23249o) {
                if (objQ1 == ku.f.f23248n) {
                    throw new IllegalStateException("unexpected");
                }
                mVarD0.b();
                return k.INSTANCE.c(objQ1);
            }
            if (andIncrement < s0()) {
                mVarD0.b();
            }
            mVar = mVarD0;
        }
        return k.INSTANCE.a(i0());
    }

    public final boolean D0() {
        long jG0 = g0();
        return jG0 == 0 || jG0 == Long.MAX_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long E0(m<E> lastSegment) {
        do {
            int i10 = ku.f.b;
            while (true) {
                i10--;
                if (-1 < i10) {
                    long j10 = (lastSegment.id * ((long) ku.f.b)) + ((long) i10);
                    if (j10 >= o0()) {
                        while (true) {
                            Object objB = lastSegment.B(i10);
                            if (objB != null && objB != ku.f.f23239e) {
                                if (objB != ku.f.f23238d) {
                                    break;
                                }
                                return j10;
                            }
                            if (lastSegment.v(i10, objB, ku.f.z())) {
                                lastSegment.t();
                                break;
                            }
                        }
                    } else {
                        return -1L;
                    }
                }
            }
            lastSegment = (m) lastSegment.h();
        } while (lastSegment != null);
        return -1L;
    }

    public final void F0() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f23209d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if (((int) (j10 >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, ku.f.w(1152921504606846975L & j10, 1)));
    }

    @Override // ku.y
    public boolean G(@Nullable Throwable cause) {
        return W(cause, false);
    }

    public final void G0() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f23209d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, ku.f.w(1152921504606846975L & j10, 3)));
    }

    public final void H0() {
        long j10;
        long jW;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f23209d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j10 >> 60);
            if (i10 == 0) {
                jW = ku.f.w(1152921504606846975L & j10, 2);
            } else if (i10 != 1) {
                return;
            } else {
                jW = ku.f.w(1152921504606846975L & j10, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, jW));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I0(long id2, m<E> startFrom) {
        m<E> mVar;
        m<E> mVar2;
        while (startFrom.id < id2 && (mVar2 = (m) startFrom.f()) != null) {
            startFrom = mVar2;
        }
        while (true) {
            if (!startFrom.k() || (mVar = (m) startFrom.f()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23215j;
                while (true) {
                    b0 b0Var = (b0) atomicReferenceFieldUpdater.get(this);
                    if (b0Var.id >= startFrom.id) {
                        return;
                    }
                    if (!startFrom.u()) {
                        break;
                    }
                    if (y1.b.a(atomicReferenceFieldUpdater, this, b0Var, startFrom)) {
                        if (b0Var.p()) {
                            b0Var.n();
                            return;
                        }
                        return;
                    } else if (startFrom.p()) {
                        startFrom.n();
                    }
                }
            } else {
                startFrom = mVar;
            }
        }
    }

    @Override // ku.y
    public boolean J() {
        return B0(f23209d.get(this));
    }

    public final void J0(Throwable cause, Object element, CoroutineContext context) throws IllegalAccessException, InvocationTargetException {
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        Intrinsics.checkNotNull(function1);
        Object objF = k.f(element);
        Intrinsics.checkNotNull(objF);
        ou.x.a(function1, objF, context);
    }

    public final void K0(Throwable cause, E element, CoroutineContext context) throws IllegalAccessException, InvocationTargetException {
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        Intrinsics.checkNotNull(function1);
        ou.x.a(function1, element, context);
    }

    public void L0() {
    }

    public final void M0(iu.n<? super k<? extends E>> cont) {
        gt.n.Companion companion = gt.n.INSTANCE;
        cont.resumeWith(gt.n.b(k.b(k.INSTANCE.a(i0()))));
    }

    public final void N0(iu.n<? super E> cont) {
        gt.n.Companion companion = gt.n.INSTANCE;
        cont.resumeWith(gt.n.b(gt.o.a(l0())));
    }

    public final fu.g<Unit> O(Function1<? super E, Unit> function1) {
        return new c(this);
    }

    public final void O0(ru.l<?> select) {
        select.d(ku.f.z());
    }

    public final xt.n<Throwable, Object, CoroutineContext, Unit> P(final Function1<? super E, Unit> function1, final E e10) {
        return new xt.n() { // from class: ku.c
            @Override // xt.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return e.Q(function1, e10, (Throwable) obj, obj2, (CoroutineContext) obj3);
            }
        };
    }

    public final Object P0(E e10, lt.b<? super Unit> bVar) throws IllegalAccessException, InvocationTargetException {
        s0 s0VarC;
        iu.p pVar = new iu.p(mt.b.c(bVar), 1);
        pVar.H();
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        if (function1 == null || (s0VarC = ou.x.c(function1, e10, null, 2, null)) == null) {
            Throwable thP0 = p0();
            gt.n.Companion companion = gt.n.INSTANCE;
            pVar.resumeWith(gt.n.b(gt.o.a(thP0)));
        } else {
            gt.a.a(s0VarC, p0());
            gt.n.Companion companion2 = gt.n.INSTANCE;
            pVar.resumeWith(gt.n.b(gt.o.a(s0VarC)));
        }
        Object objA = pVar.A();
        if (objA == mt.c.e()) {
            nt.h.c(bVar);
        }
        return objA == mt.c.e() ? objA : Unit.f22938a;
    }

    public final void Q0(E element, iu.n<? super Unit> cont) throws IllegalAccessException, InvocationTargetException {
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        if (function1 != null) {
            ou.x.a(function1, element, cont.getContext());
        }
        Throwable thP0 = p0();
        gt.n.Companion companion = gt.n.INSTANCE;
        cont.resumeWith(gt.n.b(gt.o.a(thP0)));
    }

    public final fu.g<Unit> R(Function1<? super E, Unit> function1) {
        return new d(this);
    }

    public void R0() {
    }

    public final boolean S(long curSenders) {
        return curSenders < g0() || curSenders < o0() + ((long) this.capacity);
    }

    public void S0() {
    }

    public boolean T(@Nullable Throwable cause) {
        if (cause == null) {
            cause = new CancellationException("Channel was cancelled");
        }
        return W(cause, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void U(m<E> lastSegment, long sendersCounter) {
        Object objB = ou.k.b(null, 1, null);
        loop0: while (lastSegment != null) {
            for (int i10 = ku.f.b - 1; -1 < i10; i10--) {
                if ((lastSegment.id * ((long) ku.f.b)) + ((long) i10) < sendersCounter) {
                    break loop0;
                }
                while (true) {
                    Object objB2 = lastSegment.B(i10);
                    if (objB2 != null && objB2 != ku.f.f23239e) {
                        if (!(objB2 instanceof WaiterEB)) {
                            if (!(objB2 instanceof k3)) {
                                break;
                            }
                            if (lastSegment.v(i10, objB2, ku.f.z())) {
                                objB = ou.k.c(objB, objB2);
                                lastSegment.C(i10, true);
                                break;
                            }
                        } else {
                            if (lastSegment.v(i10, objB2, ku.f.z())) {
                                objB = ou.k.c(objB, ((WaiterEB) objB2).waiter);
                                lastSegment.C(i10, true);
                                break;
                            }
                        }
                    } else {
                        if (lastSegment.v(i10, objB2, ku.f.z())) {
                            lastSegment.t();
                            break;
                        }
                    }
                }
            }
            lastSegment = (m) lastSegment.h();
        }
        if (objB != null) {
            if (!(objB instanceof ArrayList)) {
                f1((k3) objB);
                return;
            }
            Intrinsics.d(objB, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ArrayList arrayList = (ArrayList) objB;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                f1((k3) arrayList.get(size));
            }
        }
    }

    public final m<E> V() {
        Object obj = f23215j.get(this);
        m mVar = (m) f23213h.get(this);
        if (mVar.id > ((m) obj).id) {
            obj = mVar;
        }
        m mVar2 = (m) f23214i.get(this);
        if (mVar2.id > ((m) obj).id) {
            obj = mVar2;
        }
        return (m) ou.b.b((ou.c) obj);
    }

    public final void V0(k3 k3Var, m<E> mVar, int i10) {
        S0();
        k3Var.e(mVar, i10);
    }

    public boolean W(@Nullable Throwable cause, boolean cancel) {
        if (cancel) {
            F0();
        }
        boolean zA = y1.b.a(f23216k, this, ku.f.f23253s, cause);
        if (cancel) {
            G0();
        } else {
            H0();
        }
        Z();
        L0();
        if (zA) {
            x0();
        }
        return zA;
    }

    public final void W0(k3 k3Var, m<E> mVar, int i10) {
        k3Var.e(mVar, i10 + ku.f.b);
    }

    public final void X(long sendersCur) throws IllegalAccessException, InvocationTargetException {
        e1(Y(sendersCur));
    }

    public final Object X0(Object ignoredParam, Object selectResult) throws Throwable {
        if (selectResult != ku.f.z()) {
            return selectResult;
        }
        throw l0();
    }

    public final m<E> Y(long sendersCur) {
        m<E> mVarV = V();
        if (C0()) {
            long jE0 = E0(mVarV);
            if (jE0 != -1) {
                a0(jE0);
            }
        }
        U(mVarV, sendersCur);
        return mVarV;
    }

    public final Object Y0(Object ignoredParam, Object selectResult) {
        return k.b(selectResult == ku.f.z() ? k.INSTANCE.a(i0()) : k.INSTANCE.c(selectResult));
    }

    public final void Z() {
        J();
    }

    public final void a0(long globalCellIndex) {
        m<E> mVarD0;
        s0 s0VarC;
        m<E> mVar = (m) f23214i.get(this);
        while (true) {
            long j10 = f23210e.get(this);
            if (globalCellIndex < Math.max(((long) this.capacity) + j10, g0())) {
                return;
            }
            if (f23210e.compareAndSet(this, j10, 1 + j10)) {
                int i10 = ku.f.b;
                long j11 = j10 / ((long) i10);
                int i11 = (int) (j10 % ((long) i10));
                if (mVar.id != j11) {
                    mVarD0 = d0(j11, mVar);
                    if (mVarD0 == null) {
                        continue;
                    }
                } else {
                    mVarD0 = mVar;
                }
                Object objQ1 = q1(mVarD0, i11, j10, null);
                if (objQ1 != ku.f.f23249o) {
                    mVarD0.b();
                    Function1<E, Unit> function1 = this.onUndeliveredElement;
                    if (function1 != null && (s0VarC = ou.x.c(function1, objQ1, null, 2, null)) != null) {
                        throw s0VarC;
                    }
                } else if (j10 < s0()) {
                    mVarD0.b();
                }
                mVar = mVarD0;
            }
        }
    }

    public final void b0() {
        if (D0()) {
            return;
        }
        m<E> mVar = (m) f23215j.get(this);
        while (true) {
            long andIncrement = f23211f.getAndIncrement(this);
            int i10 = ku.f.b;
            long j10 = andIncrement / ((long) i10);
            if (s0() <= andIncrement) {
                if (mVar.id < j10 && mVar.f() != 0) {
                    I0(j10, mVar);
                }
                w0(this, 0L, 1, null);
                return;
            }
            if (mVar.id != j10) {
                m<E> mVarC0 = c0(j10, mVar, andIncrement);
                if (mVarC0 == null) {
                    continue;
                } else {
                    mVar = mVarC0;
                }
            }
            if (o1(mVar, (int) (andIncrement % ((long) i10)), andIncrement)) {
                w0(this, 0L, 1, null);
                return;
            }
            w0(this, 0L, 1, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b1(m<E> mVar, int i10, long j10, lt.b<? super k<? extends E>> bVar) throws Throwable {
        j jVar;
        k kVarB;
        m mVar2;
        if (bVar instanceof j) {
            jVar = (j) bVar;
            int i11 = jVar.f23235z;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                jVar.f23235z = i11 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, bVar);
            }
        } else {
            jVar = new j(this, bVar);
        }
        Object objA = jVar.f23233x;
        Object objE = mt.c.e();
        int i12 = jVar.f23235z;
        if (i12 == 0) {
            gt.o.b(objA);
            jVar.f23229t = this;
            jVar.f23230u = mVar;
            jVar.f23231v = i10;
            jVar.f23232w = j10;
            jVar.f23235z = 1;
            iu.p pVarB = iu.r.b(mt.b.c(jVar));
            try {
                Intrinsics.d(pVarB, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<E of kotlinx.coroutines.channels.BufferedChannel>>");
                w wVar = new w(pVarB);
                try {
                    Object objQ1 = q1(mVar, i10, j10, wVar);
                    if (objQ1 == ku.f.f23247m) {
                        V0(wVar, mVar, i10);
                    } else {
                        fu.g gVarR = null;
                        if (objQ1 == ku.f.f23249o) {
                            if (j10 < s0()) {
                                mVar.b();
                            }
                            m mVar3 = (m) m0().get(this);
                            while (true) {
                                if (i()) {
                                    M0(pVarB);
                                } else {
                                    long andIncrement = n0().getAndIncrement(this);
                                    int i13 = ku.f.b;
                                    long j11 = andIncrement / ((long) i13);
                                    int i14 = (int) (andIncrement % ((long) i13));
                                    if (mVar3.id != j11) {
                                        m mVarD0 = d0(j11, mVar3);
                                        if (mVarD0 != null) {
                                            mVar2 = mVarD0;
                                        }
                                    } else {
                                        mVar2 = mVar3;
                                    }
                                    Object objQ2 = q1(mVar2, i14, andIncrement, wVar);
                                    m mVar4 = mVar2;
                                    if (objQ2 == ku.f.f23247m) {
                                        V0(wVar, mVar4, i14);
                                    } else if (objQ2 == ku.f.f23249o) {
                                        if (andIncrement < s0()) {
                                            mVar4.b();
                                        }
                                        mVar3 = mVar4;
                                    } else {
                                        if (objQ2 == ku.f.f23248n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        mVar4.b();
                                        kVarB = k.b(k.INSTANCE.c(objQ2));
                                        Function1<E, Unit> function1 = this.onUndeliveredElement;
                                        if (function1 != null) {
                                            gVarR = R(function1);
                                        }
                                    }
                                }
                            }
                        } else {
                            mVar.b();
                            kVarB = k.b(k.INSTANCE.c(objQ1));
                            Function1<E, Unit> function2 = this.onUndeliveredElement;
                            if (function2 != null) {
                                gVarR = R(function2);
                            }
                        }
                        pVarB.j(kVarB, (xt.n) gVarR);
                    }
                    objA = pVarB.A();
                    if (objA == mt.c.e()) {
                        nt.h.c(jVar);
                    }
                    if (objA == objE) {
                        return objE;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    pVarB.Q();
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(objA);
        }
        return ((k) objA).getHolder();
    }

    @Override // ku.x
    public final void c(@Nullable CancellationException cause) {
        T(cause);
    }

    public final m<E> c0(long id2, m<E> startFrom, long currentBufferEndCounter) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23215j;
        Function2 function2 = (Function2) ku.f.y();
        loop0: while (true) {
            objC = ou.b.c(startFrom, id2, function2);
            if (!c0.c(objC)) {
                b0 b0VarB = c0.b(objC);
                while (true) {
                    b0 b0Var = (b0) atomicReferenceFieldUpdater.get(this);
                    if (b0Var.id >= b0VarB.id) {
                        break loop0;
                    }
                    if (!b0VarB.u()) {
                        break;
                    }
                    if (y1.b.a(atomicReferenceFieldUpdater, this, b0Var, b0VarB)) {
                        if (!b0Var.p()) {
                            break loop0;
                        }
                        b0Var.n();
                        break loop0;
                    }
                    if (b0VarB.p()) {
                        b0VarB.n();
                    }
                }
            } else {
                break;
            }
        }
        if (c0.c(objC)) {
            Z();
            I0(id2, startFrom);
            w0(this, 0L, 1, null);
            return null;
        }
        m<E> mVar = (m) c0.b(objC);
        if (mVar.id <= id2) {
            return mVar;
        }
        long j10 = mVar.id;
        int i10 = ku.f.b;
        if (f23211f.compareAndSet(this, currentBufferEndCounter + 1, j10 * ((long) i10))) {
            v0((mVar.id * ((long) i10)) - currentBufferEndCounter);
        } else {
            w0(this, 0L, 1, null);
        }
        return null;
    }

    public final Object c1(m<E> mVar, int i10, long j10, lt.b<? super E> bVar) {
        m mVar2;
        iu.p pVarB = iu.r.b(mt.b.c(bVar));
        try {
            Object objQ1 = q1(mVar, i10, j10, pVarB);
            if (objQ1 != ku.f.f23247m) {
                fu.g gVarO = null;
                gVarO = null;
                if (objQ1 == ku.f.f23249o) {
                    if (j10 < s0()) {
                        mVar.b();
                    }
                    m mVar3 = (m) m0().get(this);
                    while (true) {
                        if (i()) {
                            N0(pVarB);
                            break;
                        }
                        long andIncrement = n0().getAndIncrement(this);
                        int i11 = ku.f.b;
                        long j11 = andIncrement / ((long) i11);
                        int i12 = (int) (andIncrement % ((long) i11));
                        if (mVar3.id != j11) {
                            m mVarD0 = d0(j11, mVar3);
                            if (mVarD0 != null) {
                                mVar2 = mVarD0;
                            }
                        } else {
                            mVar2 = mVar3;
                        }
                        objQ1 = q1(mVar2, i12, andIncrement, pVarB);
                        m mVar4 = mVar2;
                        if (objQ1 == ku.f.f23247m) {
                            iu.p pVar = pVarB != null ? pVarB : null;
                            if (pVar == null) {
                                break;
                            }
                            V0(pVar, mVar4, i12);
                            break;
                        }
                        if (objQ1 == ku.f.f23249o) {
                            if (andIncrement < s0()) {
                                mVar4.b();
                            }
                            mVar3 = mVar4;
                        } else {
                            if (objQ1 == ku.f.f23248n) {
                                throw new IllegalStateException("unexpected");
                            }
                            mVar4.b();
                            Function1<E, Unit> function1 = this.onUndeliveredElement;
                            if (function1 != null) {
                                gVarO = O(function1);
                            }
                        }
                    }
                } else {
                    mVar.b();
                    Function1<E, Unit> function2 = this.onUndeliveredElement;
                    if (function2 != null) {
                        gVarO = O(function2);
                    }
                }
                pVarB.j(objQ1, (xt.n) gVarO);
                break;
            }
            V0(pVarB, mVar, i10);
            Object objA = pVarB.A();
            if (objA == mt.c.e()) {
                nt.h.c(bVar);
            }
            return objA;
        } catch (Throwable th2) {
            pVarB.Q();
            throw th2;
        }
    }

    public final m<E> d0(long id2, m<E> startFrom) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23214i;
        Function2 function2 = (Function2) ku.f.y();
        loop0: while (true) {
            objC = ou.b.c(startFrom, id2, function2);
            if (!c0.c(objC)) {
                b0 b0VarB = c0.b(objC);
                while (true) {
                    b0 b0Var = (b0) atomicReferenceFieldUpdater.get(this);
                    if (b0Var.id >= b0VarB.id) {
                        break loop0;
                    }
                    if (!b0VarB.u()) {
                        break;
                    }
                    if (y1.b.a(atomicReferenceFieldUpdater, this, b0Var, b0VarB)) {
                        if (!b0Var.p()) {
                            break loop0;
                        }
                        b0Var.n();
                        break loop0;
                    }
                    if (b0VarB.p()) {
                        b0VarB.n();
                    }
                }
            } else {
                break;
            }
        }
        if (c0.c(objC)) {
            Z();
            if (startFrom.id * ((long) ku.f.b) < s0()) {
                startFrom.b();
            }
            return null;
        }
        m<E> mVar = (m) c0.b(objC);
        if (!D0() && id2 <= g0() / ((long) ku.f.b)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f23215j;
            while (true) {
                b0 b0Var2 = (b0) atomicReferenceFieldUpdater2.get(this);
                if (b0Var2.id >= mVar.id || !mVar.u()) {
                    break;
                }
                if (y1.b.a(atomicReferenceFieldUpdater2, this, b0Var2, mVar)) {
                    if (!b0Var2.p()) {
                        break;
                    }
                    b0Var2.n();
                    break;
                }
                if (mVar.p()) {
                    mVar.n();
                }
            }
        }
        long j10 = mVar.id;
        if (j10 <= id2) {
            return mVar;
        }
        int i10 = ku.f.b;
        u1(j10 * ((long) i10));
        if (mVar.id * ((long) i10) < s0()) {
            mVar.b();
        }
        return null;
    }

    public final void d1(ru.l<?> select, Object ignoredParam) {
        m mVar;
        m mVar2 = (m) m0().get(this);
        while (!i()) {
            long andIncrement = n0().getAndIncrement(this);
            int i10 = ku.f.b;
            long j10 = andIncrement / ((long) i10);
            int i11 = (int) (andIncrement % ((long) i10));
            if (mVar2.id != j10) {
                m mVarD0 = d0(j10, mVar2);
                if (mVarD0 == null) {
                    continue;
                } else {
                    mVar = mVarD0;
                }
            } else {
                mVar = mVar2;
            }
            ru.l<?> lVar = select;
            Object objQ1 = q1(mVar, i11, andIncrement, lVar);
            mVar2 = mVar;
            if (objQ1 == ku.f.f23247m) {
                k3 k3Var = lVar instanceof k3 ? (k3) lVar : null;
                if (k3Var != null) {
                    V0(k3Var, mVar2, i11);
                    return;
                }
                return;
            }
            if (objQ1 != ku.f.f23249o) {
                if (objQ1 == ku.f.f23248n) {
                    throw new IllegalStateException("unexpected");
                }
                mVar2.b();
                lVar.d(objQ1);
                return;
            }
            if (andIncrement < s0()) {
                mVar2.b();
            }
            select = lVar;
        }
        O0(select);
    }

    public final m<E> e0(long id2, m<E> startFrom) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23213h;
        Function2 function2 = (Function2) ku.f.y();
        loop0: while (true) {
            objC = ou.b.c(startFrom, id2, function2);
            if (!c0.c(objC)) {
                b0 b0VarB = c0.b(objC);
                while (true) {
                    b0 b0Var = (b0) atomicReferenceFieldUpdater.get(this);
                    if (b0Var.id >= b0VarB.id) {
                        break loop0;
                    }
                    if (!b0VarB.u()) {
                        break;
                    }
                    if (y1.b.a(atomicReferenceFieldUpdater, this, b0Var, b0VarB)) {
                        if (!b0Var.p()) {
                            break loop0;
                        }
                        b0Var.n();
                        break loop0;
                    }
                    if (b0VarB.p()) {
                        b0VarB.n();
                    }
                }
            } else {
                break;
            }
        }
        if (c0.c(objC)) {
            Z();
            if (startFrom.id * ((long) ku.f.b) < o0()) {
                startFrom.b();
            }
            return null;
        }
        m<E> mVar = (m) c0.b(objC);
        long j10 = mVar.id;
        if (j10 <= id2) {
            return mVar;
        }
        int i10 = ku.f.b;
        v1(j10 * ((long) i10));
        if (mVar.id * ((long) i10) < o0()) {
            mVar.b();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e1(m<E> lastSegment) throws IllegalAccessException, InvocationTargetException {
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        s0 s0VarB = null;
        Object objB = ou.k.b(null, 1, null);
        loop0: do {
            for (int i10 = ku.f.b - 1; -1 < i10; i10--) {
                long j10 = (lastSegment.id * ((long) ku.f.b)) + ((long) i10);
                while (true) {
                    Object objB2 = lastSegment.B(i10);
                    if (objB2 == ku.f.f23243i) {
                        break loop0;
                    }
                    if (objB2 != ku.f.f23238d) {
                        if (objB2 != ku.f.f23239e && objB2 != null) {
                            if (!(objB2 instanceof k3) && !(objB2 instanceof WaiterEB)) {
                                if (objB2 != ku.f.f23241g && objB2 != ku.f.f23240f) {
                                    if (objB2 != ku.f.f23241g) {
                                        break;
                                    }
                                } else {
                                    break loop0;
                                }
                            } else {
                                if (j10 < o0()) {
                                    break loop0;
                                }
                                k3 k3Var = objB2 instanceof WaiterEB ? ((WaiterEB) objB2).waiter : (k3) objB2;
                                if (lastSegment.v(i10, objB2, ku.f.z())) {
                                    if (function1 != null) {
                                        s0VarB = ou.x.b(function1, lastSegment.A(i10), s0VarB);
                                    }
                                    objB = ou.k.c(objB, k3Var);
                                    lastSegment.w(i10);
                                    lastSegment.t();
                                    break;
                                }
                            }
                        } else {
                            if (lastSegment.v(i10, objB2, ku.f.z())) {
                                lastSegment.t();
                                break;
                            }
                        }
                    } else {
                        if (j10 < o0()) {
                            break loop0;
                        }
                        if (lastSegment.v(i10, objB2, ku.f.z())) {
                            if (function1 != null) {
                                s0VarB = ou.x.b(function1, lastSegment.A(i10), s0VarB);
                            }
                            lastSegment.w(i10);
                            lastSegment.t();
                            break;
                        }
                    }
                }
            }
            lastSegment = (m) lastSegment.h();
        } while (lastSegment != null);
        if (objB != null) {
            if (objB instanceof ArrayList) {
                Intrinsics.d(objB, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
                ArrayList arrayList = (ArrayList) objB;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    g1((k3) arrayList.get(size));
                }
            } else {
                g1((k3) objB);
            }
        }
        if (s0VarB != null) {
            throw s0VarB;
        }
    }

    public final void f1(k3 k3Var) {
        h1(k3Var, true);
    }

    @Override // ku.x
    @Nullable
    public Object g(@NotNull lt.b<? super E> bVar) {
        return Z0(this, bVar);
    }

    public final long g0() {
        return f23211f.get(this);
    }

    public final void g1(k3 k3Var) {
        h1(k3Var, false);
    }

    public final void h1(k3 k3Var, boolean z10) {
        if (k3Var instanceof b) {
            iu.n<Boolean> nVarA = ((b) k3Var).a();
            gt.n.Companion companion = gt.n.INSTANCE;
            nVarA.resumeWith(gt.n.b(Boolean.FALSE));
            return;
        }
        if (k3Var instanceof iu.n) {
            lt.b bVar = (lt.b) k3Var;
            gt.n.Companion companion2 = gt.n.INSTANCE;
            bVar.resumeWith(gt.n.b(gt.o.a(z10 ? l0() : p0())));
        } else if (k3Var instanceof w) {
            iu.p<k<? extends E>> pVar = ((w) k3Var).cont;
            gt.n.Companion companion3 = gt.n.INSTANCE;
            pVar.resumeWith(gt.n.b(k.b(k.INSTANCE.a(i0()))));
        } else if (k3Var instanceof a) {
            ((a) k3Var).j();
        } else {
            if (k3Var instanceof ru.l) {
                ((ru.l) k3Var).f(this, ku.f.z());
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + k3Var).toString());
        }
    }

    @Override // ku.x
    public boolean i() {
        return A0(f23209d.get(this));
    }

    @Nullable
    public final Throwable i0() {
        return (Throwable) f23216k.get(this);
    }

    @Override // ku.x
    @NotNull
    public ku.i<E> iterator() {
        return new a();
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x00fe  */
    public final Object j1(m<E> mVar, int i10, E e10, long j10, lt.b<? super Unit> bVar) {
        Unit unit;
        Object objA;
        m mVarE0;
        iu.p pVarB = iu.r.b(mt.b.c(bVar));
        try {
            int iS1 = s1(mVar, i10, e10, j10, pVarB, false);
            if (iS1 == 0) {
                mVar.b();
                gt.n.Companion companion = gt.n.INSTANCE;
                unit = Unit.f22938a;
            } else {
                if (iS1 != 1) {
                    if (iS1 != 2) {
                        if (iS1 != 4) {
                            String str = "unexpected";
                            if (iS1 != 5) {
                                throw new IllegalStateException("unexpected");
                            }
                            mVar.b();
                            m mVar2 = (m) q0().get(this);
                            while (true) {
                                long andIncrement = r0().getAndIncrement(this);
                                long j11 = 1152921504606846975L & andIncrement;
                                boolean zB0 = B0(andIncrement);
                                int i11 = ku.f.b;
                                long j12 = j11 / ((long) i11);
                                int i12 = (int) (j11 % ((long) i11));
                                str = str;
                                if (mVar2.id != j12) {
                                    mVarE0 = e0(j12, mVar2);
                                    if (mVarE0 == null) {
                                        if (zB0) {
                                        }
                                    }
                                } else {
                                    mVarE0 = mVar2;
                                }
                                int iS2 = s1(mVarE0, i12, e10, j11, pVarB, zB0);
                                if (iS2 == 0) {
                                    mVarE0.b();
                                    gt.n.Companion companion2 = gt.n.INSTANCE;
                                    unit = Unit.f22938a;
                                } else if (iS2 == 1) {
                                    gt.n.Companion companion3 = gt.n.INSTANCE;
                                    unit = Unit.f22938a;
                                } else if (iS2 == 2) {
                                    if (!zB0) {
                                        iu.p pVar = pVarB != null ? pVarB : null;
                                        if (pVar == null) {
                                            break;
                                        }
                                        W0(pVar, mVarE0, i12);
                                        break;
                                    }
                                    mVarE0.t();
                                } else {
                                    if (iS2 == 3) {
                                        throw new IllegalStateException(str);
                                    }
                                    if (iS2 != 4) {
                                        if (iS2 == 5) {
                                            mVarE0.b();
                                        }
                                        mVar2 = mVarE0;
                                    } else if (j11 < o0()) {
                                        mVarE0.b();
                                    }
                                }
                            }
                        } else if (j10 < o0()) {
                            mVar.b();
                        }
                        Q0(e10, pVarB);
                        break;
                    } else {
                        W0(pVarB, mVar, i10);
                    }
                    objA = pVarB.A();
                    if (objA == mt.c.e()) {
                        nt.h.c(bVar);
                    }
                    if (objA == mt.c.e()) {
                        return objA;
                    }
                    return Unit.f22938a;
                }
                gt.n.Companion companion4 = gt.n.INSTANCE;
                unit = Unit.f22938a;
            }
            pVarB.resumeWith(gt.n.b(unit));
            objA = pVarB.A();
            if (objA == mt.c.e()) {
                nt.h.c(bVar);
            }
            if (objA == mt.c.e()) {
                return objA;
            }
            return Unit.f22938a;
        } catch (Throwable th2) {
            pVarB.Q();
            throw th2;
        }
    }

    @Override // ku.x
    @Nullable
    public Object k(@NotNull lt.b<? super k<? extends E>> bVar) {
        return a1(this, bVar);
    }

    public final boolean k1(long curSendersAndCloseStatus) {
        if (B0(curSendersAndCloseStatus)) {
            return false;
        }
        return !S(curSendersAndCloseStatus & 1152921504606846975L);
    }

    public final Throwable l0() {
        Throwable thI0 = i0();
        return thI0 == null ? new q("Channel was closed") : thI0;
    }

    public final boolean l1(Object obj, E e10) {
        if (obj instanceof ru.l) {
            return ((ru.l) obj).f(this, e10);
        }
        if (obj instanceof w) {
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            iu.p<k<? extends E>> pVar = ((w) obj).cont;
            k kVarB = k.b(k.INSTANCE.c(e10));
            Function1<E, Unit> function1 = this.onUndeliveredElement;
            return ku.f.B(pVar, kVarB, (xt.n) (function1 != null ? R(function1) : null));
        }
        if (obj instanceof a) {
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(e10);
        }
        if (obj instanceof iu.n) {
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            iu.n nVar = (iu.n) obj;
            Function1<E, Unit> function2 = this.onUndeliveredElement;
            return ku.f.B(nVar, e10, (xt.n) (function2 != null ? O(function2) : null));
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    public final boolean m1(Object obj, m<E> mVar, int i10) {
        if (obj instanceof iu.n) {
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return ku.f.C((iu.n) obj, Unit.f22938a, null, 2, null);
        }
        if (obj instanceof ru.l) {
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            ru.o oVarX = ((ru.k) obj).x(this, Unit.f22938a);
            if (oVarX == ru.o.REREGISTER) {
                mVar.w(i10);
            }
            return oVarX == ru.o.SUCCESSFUL;
        }
        if (obj instanceof b) {
            return ku.f.C(((b) obj).a(), Boolean.TRUE, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    @NotNull
    public final Object n1(E element) {
        m mVarE0;
        Object obj = ku.f.f23238d;
        m mVar = (m) q0().get(this);
        while (true) {
            long andIncrement = r0().getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zB0 = B0(andIncrement);
            int i10 = ku.f.b;
            long j11 = j10 / ((long) i10);
            int i11 = (int) (j10 % ((long) i10));
            if (mVar.id != j11) {
                mVarE0 = e0(j11, mVar);
                if (mVarE0 == null) {
                    if (zB0) {
                        return k.INSTANCE.a(p0());
                    }
                }
            } else {
                mVarE0 = mVar;
            }
            E e10 = element;
            int iS1 = s1(mVarE0, i11, e10, j10, obj, zB0);
            mVar = mVarE0;
            if (iS1 == 0) {
                mVar.b();
                return k.INSTANCE.c(Unit.f22938a);
            }
            if (iS1 == 1) {
                return k.INSTANCE.c(Unit.f22938a);
            }
            if (iS1 == 2) {
                if (zB0) {
                    mVar.t();
                    return k.INSTANCE.a(p0());
                }
                k3 k3Var = obj instanceof k3 ? (k3) obj : null;
                if (k3Var != null) {
                    W0(k3Var, mVar, i11);
                }
                a0((mVar.id * ((long) i10)) + ((long) i11));
                return k.INSTANCE.c(Unit.f22938a);
            }
            if (iS1 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iS1 == 4) {
                if (j10 < o0()) {
                    mVar.b();
                }
                return k.INSTANCE.a(p0());
            }
            if (iS1 == 5) {
                mVar.b();
            }
            element = e10;
        }
    }

    public final long o0() {
        return f23210e.get(this);
    }

    public final boolean o1(m<E> segment, int index, long b10) {
        Object objB = segment.B(index);
        if (!(objB instanceof k3) || b10 < f23210e.get(this) || !segment.v(index, objB, ku.f.f23241g)) {
            return p1(segment, index, b10);
        }
        if (m1(objB, segment, index)) {
            segment.F(index, ku.f.f23238d);
            return true;
        }
        segment.F(index, ku.f.f23244j);
        segment.C(index, false);
        return false;
    }

    @Override // ku.y
    public boolean offer(E e10) {
        return ku.g.a.a(this, e10);
    }

    @NotNull
    public final Throwable p0() {
        Throwable thI0 = i0();
        return thI0 == null ? new r("Channel was closed") : thI0;
    }

    public final boolean p1(m<E> segment, int index, long b10) {
        while (true) {
            Object objB = segment.B(index);
            if (objB instanceof k3) {
                if (b10 < f23210e.get(this)) {
                    if (segment.v(index, objB, new WaiterEB((k3) objB))) {
                        return true;
                    }
                } else if (segment.v(index, objB, ku.f.f23241g)) {
                    if (m1(objB, segment, index)) {
                        segment.F(index, ku.f.f23238d);
                        return true;
                    }
                    segment.F(index, ku.f.f23244j);
                    segment.C(index, false);
                    return false;
                }
            } else {
                if (objB == ku.f.f23244j) {
                    return false;
                }
                if (objB == null) {
                    if (segment.v(index, objB, ku.f.f23239e)) {
                        return true;
                    }
                } else {
                    if (objB == ku.f.f23238d || objB == ku.f.f23242h || objB == ku.f.f23243i || objB == ku.f.f23245k || objB == ku.f.z()) {
                        return true;
                    }
                    if (objB != ku.f.f23240f) {
                        throw new IllegalStateException(("Unexpected cell state: " + objB).toString());
                    }
                }
            }
        }
    }

    public final Object q1(m<E> segment, int index, long r8, Object waiter) {
        Object objB = segment.B(index);
        if (objB == null) {
            if (r8 >= (f23209d.get(this) & 1152921504606846975L)) {
                if (waiter == null) {
                    return ku.f.f23248n;
                }
                if (segment.v(index, objB, waiter)) {
                    b0();
                    return ku.f.f23247m;
                }
            }
        } else if (objB == ku.f.f23238d && segment.v(index, objB, ku.f.f23243i)) {
            b0();
            return segment.D(index);
        }
        return r1(segment, index, r8, waiter);
    }

    public final Object r1(m<E> segment, int index, long r8, Object waiter) {
        while (true) {
            Object objB = segment.B(index);
            if (objB == null || objB == ku.f.f23239e) {
                if (r8 < (f23209d.get(this) & 1152921504606846975L)) {
                    if (segment.v(index, objB, ku.f.f23242h)) {
                        b0();
                        return ku.f.f23249o;
                    }
                } else {
                    if (waiter == null) {
                        return ku.f.f23248n;
                    }
                    if (segment.v(index, objB, waiter)) {
                        b0();
                        return ku.f.f23247m;
                    }
                }
            } else {
                if (objB != ku.f.f23238d) {
                    if (objB != ku.f.f23244j && objB != ku.f.f23242h) {
                        if (objB == ku.f.z()) {
                            b0();
                            return ku.f.f23249o;
                        }
                        if (objB != ku.f.f23241g && segment.v(index, objB, ku.f.f23240f)) {
                            boolean z10 = objB instanceof WaiterEB;
                            if (z10) {
                                objB = ((WaiterEB) objB).waiter;
                            }
                            if (m1(objB, segment, index)) {
                                segment.F(index, ku.f.f23243i);
                                b0();
                                return segment.D(index);
                            }
                            segment.F(index, ku.f.f23244j);
                            segment.C(index, false);
                            if (z10) {
                                b0();
                            }
                            return ku.f.f23249o;
                        }
                    }
                    return ku.f.f23249o;
                }
                if (segment.v(index, objB, ku.f.f23243i)) {
                    b0();
                    return segment.D(index);
                }
            }
        }
    }

    public final long s0() {
        return f23209d.get(this) & 1152921504606846975L;
    }

    public final int s1(m<E> segment, int index, E element, long s8, Object waiter, boolean closed) {
        segment.G(index, element);
        if (closed) {
            return t1(segment, index, element, s8, waiter, closed);
        }
        Object objB = segment.B(index);
        if (objB == null) {
            if (S(s8)) {
                if (segment.v(index, null, ku.f.f23238d)) {
                    return 1;
                }
            } else {
                if (waiter == null) {
                    return 3;
                }
                if (segment.v(index, null, waiter)) {
                    return 2;
                }
            }
        } else if (objB instanceof k3) {
            segment.w(index);
            if (l1(objB, element)) {
                segment.F(index, ku.f.f23243i);
                R0();
                return 0;
            }
            if (segment.x(index, ku.f.f23245k) == ku.f.f23245k) {
                return 5;
            }
            segment.C(index, true);
            return 5;
        }
        return t1(segment, index, element, s8, waiter, closed);
    }

    public final int t1(m<E> segment, int index, E element, long s8, Object waiter, boolean closed) {
        while (true) {
            Object objB = segment.B(index);
            if (objB == null) {
                if (!S(s8) || closed) {
                    if (closed) {
                        if (segment.v(index, null, ku.f.f23244j)) {
                            segment.C(index, false);
                            return 4;
                        }
                    } else {
                        if (waiter == null) {
                            return 3;
                        }
                        if (segment.v(index, null, waiter)) {
                            return 2;
                        }
                    }
                } else if (segment.v(index, null, ku.f.f23238d)) {
                    return 1;
                }
            } else {
                if (objB != ku.f.f23239e) {
                    if (objB == ku.f.f23245k) {
                        segment.w(index);
                        return 5;
                    }
                    if (objB == ku.f.f23242h) {
                        segment.w(index);
                        return 5;
                    }
                    if (objB == ku.f.z()) {
                        segment.w(index);
                        Z();
                        return 4;
                    }
                    segment.w(index);
                    if (objB instanceof WaiterEB) {
                        objB = ((WaiterEB) objB).waiter;
                    }
                    if (l1(objB, element)) {
                        segment.F(index, ku.f.f23243i);
                        R0();
                        return 0;
                    }
                    if (segment.x(index, ku.f.f23245k) != ku.f.f23245k) {
                        segment.C(index, true);
                    }
                    return 5;
                }
                if (segment.v(index, objB, ku.f.f23238d)) {
                    return 1;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public String toString() {
        String string;
        StringBuilder sb2 = new StringBuilder();
        int i10 = (int) (f23209d.get(this) >> 60);
        if (i10 == 2) {
            sb2.append("closed,");
        } else if (i10 == 3) {
            sb2.append("cancelled,");
        }
        sb2.append("capacity=" + this.capacity + ',');
        sb2.append("data=[");
        int i11 = 0;
        boolean z10 = true;
        List listN = kotlin.collections.p.n(f23214i.get(this), f23213h.get(this), f23215j.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listN) {
            if (((m) obj) != ku.f.f23236a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j10 = ((m) next).id;
            do {
                Object next2 = it.next();
                long j11 = ((m) next2).id;
                if (j10 > j11) {
                    next = next2;
                    j10 = j11;
                }
            } while (it.hasNext());
        }
        m mVar = (m) next;
        long jO0 = o0();
        long jS0 = s0();
        loop2: while (true) {
            int i12 = ku.f.b;
            int i13 = i11;
            while (i13 < i12) {
                long j12 = (mVar.id * ((long) ku.f.b)) + ((long) i13);
                if (j12 >= jS0 && j12 >= jO0) {
                    break loop2;
                }
                Object objB = mVar.B(i13);
                Object objA = mVar.A(i13);
                boolean z11 = z10;
                if (objB instanceof iu.n) {
                    string = (j12 >= jO0 || j12 < jS0) ? (j12 >= jS0 || j12 < jO0) ? "cont" : "send" : "receive";
                } else if (objB instanceof ru.l) {
                    string = (j12 >= jO0 || j12 < jS0) ? (j12 >= jS0 || j12 < jO0) ? "select" : "onSend" : "onReceive";
                } else if (objB instanceof w) {
                    string = "receiveCatching";
                } else if (objB instanceof b) {
                    string = "sendBroadcast";
                } else if (objB instanceof WaiterEB) {
                    string = "EB(" + objB + ')';
                } else if (Intrinsics.c(objB, ku.f.f23240f) || Intrinsics.c(objB, ku.f.f23241g)) {
                    string = "resuming_sender";
                } else {
                    if (objB != null && !Intrinsics.c(objB, ku.f.f23239e) && !Intrinsics.c(objB, ku.f.f23243i) && !Intrinsics.c(objB, ku.f.f23242h) && !Intrinsics.c(objB, ku.f.f23245k) && !Intrinsics.c(objB, ku.f.f23244j) && !Intrinsics.c(objB, ku.f.z())) {
                        string = objB.toString();
                    }
                    i13++;
                    z10 = z11;
                }
                if (objA != null) {
                    sb2.append('(' + string + ',' + objA + "),");
                } else {
                    sb2.append(string + ',');
                }
                i13++;
                z10 = z11;
            }
            boolean z12 = z10;
            mVar = (m) mVar.f();
            if (mVar == null) {
                break;
            }
            z10 = z12;
            i11 = 0;
        }
        if (kotlin.text.c0.y1(sb2) == ',') {
            Intrinsics.checkNotNullExpressionValue(sb2.deleteCharAt(sb2.length() - 1), "deleteCharAt(...)");
        }
        sb2.append("]");
        return sb2.toString();
    }

    public final boolean u0() {
        while (true) {
            m<E> mVarD0 = (m) f23214i.get(this);
            long jO0 = o0();
            if (s0() <= jO0) {
                return false;
            }
            int i10 = ku.f.b;
            long j10 = jO0 / ((long) i10);
            if (mVarD0.id == j10 || (mVarD0 = d0(j10, mVarD0)) != null) {
                mVarD0.b();
                if (y0(mVarD0, (int) (jO0 % ((long) i10)), jO0)) {
                    return true;
                }
                f23210e.compareAndSet(this, jO0, 1 + jO0);
            } else if (((m) f23214i.get(this)).id < j10) {
                return false;
            }
        }
    }

    public final void u1(long value) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f23210e;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if (j10 >= value) {
                return;
            }
            long j11 = value;
            if (f23210e.compareAndSet(this, j10, j11)) {
                return;
            } else {
                value = j11;
            }
        }
    }

    public final void v0(long nAttempts) {
        if ((f23212g.addAndGet(this, nAttempts) & 4611686018427387904L) != 0) {
            while ((f23212g.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final void v1(long value) {
        long j10;
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f23209d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            j11 = 1152921504606846975L & j10;
            if (j11 >= value) {
                return;
            }
        } while (!f23209d.compareAndSet(this, j10, ku.f.w(j11, (int) (j10 >> 60))));
    }

    public final void w1(long globalIndex) {
        e<E> eVar = this;
        if (eVar.D0()) {
            return;
        }
        while (eVar.g0() <= globalIndex) {
            eVar = this;
        }
        int i10 = ku.f.f23237c;
        for (int i11 = 0; i11 < i10; i11++) {
            long jG0 = eVar.g0();
            if (jG0 == (4611686018427387903L & f23212g.get(eVar)) && jG0 == eVar.g0()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f23212g;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(eVar);
            if (atomicLongFieldUpdater.compareAndSet(eVar, j10, ku.f.v(j10 & 4611686018427387903L, true))) {
                break;
            } else {
                eVar = this;
            }
        }
        while (true) {
            long jG1 = eVar.g0();
            long j11 = f23212g.get(eVar);
            long j12 = j11 & 4611686018427387903L;
            boolean z10 = (4611686018427387904L & j11) != 0;
            if (jG1 == j12 && jG1 == eVar.g0()) {
                break;
            }
            if (z10) {
                eVar = this;
            } else {
                eVar = this;
                f23212g.compareAndSet(eVar, j11, ku.f.v(j12, true));
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f23212g;
        while (true) {
            long j13 = atomicLongFieldUpdater2.get(eVar);
            boolean zCompareAndSet = atomicLongFieldUpdater2.compareAndSet(eVar, j13, ku.f.v(j13 & 4611686018427387903L, false));
            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
            if (zCompareAndSet) {
                return;
            }
            atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
            eVar = this;
        }
    }

    @Override // ku.y
    public void x(@NotNull Function1<? super Throwable, Unit> handler) {
        if (y1.b.a(f23217l, this, null, handler)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23217l;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != ku.f.f23251q) {
                if (obj == ku.f.f23252r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        } while (!y1.b.a(f23217l, this, ku.f.f23251q, ku.f.f23252r));
        handler.invoke(i0());
    }

    public final void x0() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23217l;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!y1.b.a(atomicReferenceFieldUpdater, this, obj, obj == null ? ku.f.f23251q : ku.f.f23252r));
        if (obj == null) {
            return;
        }
        ((Function1) obj).invoke(i0());
    }

    @Override // ku.y
    @NotNull
    public Object y(E element) {
        m mVar;
        if (k1(f23209d.get(this))) {
            return k.INSTANCE.b();
        }
        Object obj = ku.f.f23244j;
        m mVar2 = (m) q0().get(this);
        while (true) {
            long andIncrement = r0().getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zB0 = B0(andIncrement);
            int i10 = ku.f.b;
            long j11 = j10 / ((long) i10);
            int i11 = (int) (j10 % ((long) i10));
            if (mVar2.id != j11) {
                m mVarE0 = e0(j11, mVar2);
                if (mVarE0 != null) {
                    mVar = mVarE0;
                } else if (zB0) {
                    return k.INSTANCE.a(p0());
                }
            } else {
                mVar = mVar2;
            }
            int iS1 = s1(mVar, i11, element, j10, obj, zB0);
            mVar2 = mVar;
            if (iS1 == 0) {
                mVar2.b();
                return k.INSTANCE.c(Unit.f22938a);
            }
            if (iS1 == 1) {
                return k.INSTANCE.c(Unit.f22938a);
            }
            if (iS1 == 2) {
                if (zB0) {
                    mVar2.t();
                    return k.INSTANCE.a(p0());
                }
                k3 k3Var = obj instanceof k3 ? (k3) obj : null;
                if (k3Var != null) {
                    W0(k3Var, mVar2, i11);
                }
                mVar2.t();
                return k.INSTANCE.b();
            }
            if (iS1 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iS1 == 4) {
                if (j10 < o0()) {
                    mVar2.b();
                }
                return k.INSTANCE.a(p0());
            }
            if (iS1 == 5) {
                mVar2.b();
            }
            element = element;
        }
    }

    public final boolean y0(m<E> segment, int index, long globalIndex) {
        Object objB;
        do {
            objB = segment.B(index);
            if (objB != null && objB != ku.f.f23239e) {
                if (objB == ku.f.f23238d) {
                    return true;
                }
                if (objB == ku.f.f23244j || objB == ku.f.z() || objB == ku.f.f23243i || objB == ku.f.f23242h) {
                    return false;
                }
                if (objB == ku.f.f23241g) {
                    return true;
                }
                return objB != ku.f.f23240f && globalIndex == o0();
            }
        } while (!segment.v(index, objB, ku.f.f23242h));
        b0();
        return false;
    }

    @Override // ku.y
    @Nullable
    public Object z(E e10, @NotNull lt.b<? super Unit> bVar) {
        return i1(this, e10, bVar);
    }

    public final boolean z0(long sendersAndCloseStatusCur, boolean isClosedForReceive) throws IllegalAccessException, InvocationTargetException {
        int i10 = (int) (sendersAndCloseStatusCur >> 60);
        if (i10 == 0 || i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            Y(sendersAndCloseStatusCur & 1152921504606846975L);
            return (isClosedForReceive && u0()) ? false : true;
        }
        if (i10 == 3) {
            X(sendersAndCloseStatusCur & 1152921504606846975L);
            return true;
        }
        throw new IllegalStateException(("unexpected close status: " + i10).toString());
    }
}
