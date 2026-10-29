package mu;

import androidx.core.view.inputmethod.EditorInfoCompat;
import hu.InterfaceC6571g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7699p;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7739h0;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7776c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7328a;
import p229jt.C7347n;
import p229jt.C7348o;
import p256ku.C7905p;
import p256ku.C7913r;
import p256ku.InterfaceC7886k3;
import p256ku.InterfaceC7897n;
import p315nt.InterfaceC9557b;
import p344ot.C10046b;
import p344ot.C10047c;
import p395qu.AbstractC10713b0;
import p395qu.AbstractC10714c;
import p395qu.C10712b;
import p395qu.C10715c0;
import p395qu.C10717d0;
import p395qu.C10730k;
import p395qu.C10747s0;
import p395qu.C10752x;
import p452tu.C11757i;
import p452tu.C11759k;
import p452tu.EnumC11763o;
import p452tu.InterfaceC11756h;
import p452tu.InterfaceC11760l;
import p563y1.C12996b;
import p615zt.InterfaceC14057n;
import pt.AbstractC10342d;
import pt.C10340b;
import pt.C10346h;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: mu.e */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003:©\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\"\b\u0002\u0010\b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b\f\u0010\rJ6\u0010\u0013\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0016\u001a\u00020\u0006*\u00020\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJG\u0010 \u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!JG\u0010\"\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\"\u0010!J\u0017\u0010$\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u0011H\u0003¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u0011H\u0002¢\u0006\u0004\b'\u0010%J\u001b\u0010(\u001a\u00020\u001e*\u00020\u001c2\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b(\u0010)J.\u0010+\u001a\u00028\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b+\u0010,J)\u0010-\u001a\u00020\u0006*\u00020\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b-\u0010\u0017J\u001d\u0010.\u001a\u00020\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0002¢\u0006\u0004\b.\u0010/J4\u00101\u001a\b\u0012\u0004\u0012\u00028\u0000002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b1\u0010,J#\u00102\u001a\u00020\u00062\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000000\u0018H\u0002¢\u0006\u0004\b2\u0010/J9\u00103\u001a\u0004\u0018\u00010\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b3\u00104J9\u00105\u001a\u0004\u0018\u00010\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b5\u00104J)\u00106\u001a\u00020\u001e*\u00020\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0006H\u0002¢\u0006\u0004\b8\u00109J-\u0010;\u001a\u00020\u001e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0011H\u0002¢\u0006\u0004\b;\u0010<J-\u0010=\u001a\u00020\u001e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0011H\u0002¢\u0006\u0004\b=\u0010<J\u0019\u0010?\u001a\u00020\u00062\b\b\u0002\u0010>\u001a\u00020\u0011H\u0002¢\u0006\u0004\b?\u0010@J%\u0010D\u001a\u00020\u00062\n\u0010B\u001a\u0006\u0012\u0002\b\u00030A2\b\u0010C\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\bD\u0010EJ\u001b\u0010F\u001a\u00020\u00062\n\u0010B\u001a\u0006\u0012\u0002\b\u00030AH\u0002¢\u0006\u0004\bF\u0010GJ%\u0010I\u001a\u0004\u0018\u00010\u001c2\b\u0010C\u001a\u0004\u0018\u00010\u001c2\b\u0010H\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\bI\u0010JJ%\u0010K\u001a\u0004\u0018\u00010\u001c2\b\u0010C\u001a\u0004\u0018\u00010\u001c2\b\u0010H\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\bK\u0010JJ\u000f\u0010L\u001a\u00020\u0006H\u0002¢\u0006\u0004\bL\u00109J\u000f\u0010M\u001a\u00020\u0006H\u0002¢\u0006\u0004\bM\u00109J\u000f\u0010N\u001a\u00020\u0006H\u0002¢\u0006\u0004\bN\u00109J\u000f\u0010O\u001a\u00020\u0006H\u0002¢\u0006\u0004\bO\u00109J\u000f\u0010P\u001a\u00020\u0006H\u0002¢\u0006\u0004\bP\u00109J\u001d\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010Q\u001a\u00020\u0011H\u0002¢\u0006\u0004\bR\u0010SJ\u0017\u0010T\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020\u0011H\u0002¢\u0006\u0004\bT\u0010@J\u0015\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bU\u0010VJ\u001d\u0010X\u001a\u00020\u00112\f\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bX\u0010YJ\u001d\u0010Z\u001a\u00020\u00062\f\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bZ\u0010[J%\u0010]\u001a\u00020\u00062\f\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\\\u001a\u00020\u0011H\u0002¢\u0006\u0004\b]\u0010^J\u0013\u0010_\u001a\u00020\u0006*\u00020\u0015H\u0002¢\u0006\u0004\b_\u0010`J\u0013\u0010a\u001a\u00020\u0006*\u00020\u0015H\u0002¢\u0006\u0004\ba\u0010`J\u001b\u0010c\u001a\u00020\u0006*\u00020\u00152\u0006\u0010b\u001a\u00020\u001eH\u0002¢\u0006\u0004\bc\u0010dJ\u001f\u0010g\u001a\u00020\u001e2\u0006\u0010e\u001a\u00020\u00112\u0006\u0010f\u001a\u00020\u001eH\u0002¢\u0006\u0004\bg\u0010hJ-\u0010j\u001a\u00020\u001e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010i\u001a\u00020\u0011H\u0002¢\u0006\u0004\bj\u0010<J-\u0010m\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0006\u0010k\u001a\u00020\u00112\f\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bm\u0010nJ-\u0010o\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0006\u0010k\u001a\u00020\u00112\f\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bo\u0010nJ5\u0010q\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0006\u0010k\u001a\u00020\u00112\f\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010p\u001a\u00020\u0011H\u0002¢\u0006\u0004\bq\u0010rJ%\u0010s\u001a\u00020\u00062\u0006\u0010k\u001a\u00020\u00112\f\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bs\u0010tJ\u0017\u0010v\u001a\u00020\u00062\u0006\u0010u\u001a\u00020\u0011H\u0002¢\u0006\u0004\bv\u0010@J\u0017\u0010w\u001a\u00020\u00062\u0006\u0010u\u001a\u00020\u0011H\u0002¢\u0006\u0004\bw\u0010@JG\u0010{\u001a \u0012\u0004\u0012\u00020y\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000000\u0012\u0004\u0012\u00020z\u0012\u0004\u0012\u00020\u00060x*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u0007H\u0002¢\u0006\u0004\b{\u0010|J.\u0010\u007f\u001a\u00020\u00062\u0006\u0010}\u001a\u00020y2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u0000002\u0006\u0010~\u001a\u00020zH\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001JO\u0010\u0082\u0001\u001a\u001d\u0012\u0004\u0012\u00020y\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020z\u0012\u0004\u0012\u00020\u00060\u0081\u0001*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u00072\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001JC\u0010\u0084\u0001\u001a\u001a\u0012\u0004\u0012\u00020y\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020z\u0012\u0004\u0012\u00020\u00060x*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u0007H\u0002¢\u0006\u0005\b\u0084\u0001\u0010|J*\u0010\u0085\u0001\u001a\u00020\u00062\u0006\u0010}\u001a\u00020y2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010~\u001a\u00020zH\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0080\u0001J\u001a\u0010\u0086\u0001\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u0000H\u0096@¢\u0006\u0005\b\u0086\u0001\u0010\rJ \u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020\u0006002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J \u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00020\u0006002\u0006\u0010\u000b\u001a\u00028\u0000H\u0004¢\u0006\u0006\b\u0089\u0001\u0010\u0088\u0001J\u0011\u0010\u008a\u0001\u001a\u00020\u0006H\u0014¢\u0006\u0005\b\u008a\u0001\u00109J\u0011\u0010\u008b\u0001\u001a\u00020\u0006H\u0014¢\u0006\u0005\b\u008b\u0001\u00109J\u0013\u0010\u008c\u0001\u001a\u00028\u0000H\u0096@¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u0017\u0010\u0001\u001a\b\u0012\u0004\u0012\u00028\u000000H\u0096@¢\u0006\u0005\b\u0001\u0010\u008d\u0001J\u0018\u0010\u008e\u0001\u001a\b\u0012\u0004\u0012\u00028\u000000H\u0016¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u001a\u0010\u0091\u0001\u001a\u00020\u00062\u0007\u0010\u0090\u0001\u001a\u00020\u0011H\u0004¢\u0006\u0005\b\u0091\u0001\u0010@J\u0019\u0010\u0092\u0001\u001a\u00020\u00062\u0006\u0010i\u001a\u00020\u0011H\u0000¢\u0006\u0005\b\u0092\u0001\u0010@J\u001a\u0010\u0094\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0093\u0001H\u0096\u0002¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u0011\u0010\u0096\u0001\u001a\u00020\u0006H\u0014¢\u0006\u0005\b\u0096\u0001\u00109J\u001c\u0010\u0097\u0001\u001a\u00020\u001e2\b\u0010}\u001a\u0004\u0018\u00010yH\u0016¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\"\u0010\u009b\u0001\u001a\u00020\u00062\u0010\u0010}\u001a\f\u0018\u00010\u0099\u0001j\u0005\u0018\u0001`\u009a\u0001¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u001c\u0010\u009d\u0001\u001a\u00020\u001e2\b\u0010}\u001a\u0004\u0018\u00010yH\u0010¢\u0006\u0006\b\u009d\u0001\u0010\u0098\u0001J%\u0010\u009f\u0001\u001a\u00020\u001e2\b\u0010}\u001a\u0004\u0018\u00010y2\u0007\u0010\u009e\u0001\u001a\u00020\u001eH\u0014¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J)\u0010¢\u0001\u001a\u00020\u00062\u0015\u0010¡\u0001\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010y\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u0012\u0010¤\u0001\u001a\u00020\u001eH\u0000¢\u0006\u0006\b¤\u0001\u0010¥\u0001J\u0013\u0010§\u0001\u001a\u00030¦\u0001H\u0016¢\u0006\u0006\b§\u0001\u0010¨\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R/\u0010\b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00078\u0000X\u0081\u0004¢\u0006\u0007\n\u0005\b:\u0010«\u0001Rc\u0010¯\u0001\u001aG\u0012\b\u0012\u0006\u0012\u0002\b\u00030A\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020y\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020z\u0012\u0004\u0012\u00020\u00060\u0081\u0001\u0018\u00010\u0081\u0001j\u0005\u0018\u0001`¬\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\b\u009b\u0001\u0010\u00ad\u0001\u0012\u0005\b®\u0001\u00109R\u0017\u0010²\u0001\u001a\u00020\u00118BX\u0082\u0004¢\u0006\b\u001a\u0006\b°\u0001\u0010±\u0001R\u0017\u0010´\u0001\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\b\u001a\u0006\b³\u0001\u0010¥\u0001R\u0017\u0010·\u0001\u001a\u00020y8BX\u0082\u0004¢\u0006\b\u001a\u0006\bµ\u0001\u0010¶\u0001R\u001a\u0010¹\u0001\u001a\u00020\u001e*\u00020\u00118BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010%R\u001a\u0010»\u0001\u001a\u00020\u001e*\u00020\u00118BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bº\u0001\u0010%R\u0016\u0010\\\u001a\u00020\u00118@X\u0080\u0004¢\u0006\b\u001a\u0006\b¼\u0001\u0010±\u0001R\u0017\u0010¾\u0001\u001a\u00020\u00118@X\u0080\u0004¢\u0006\b\u001a\u0006\b½\u0001\u0010±\u0001R%\u0010Ã\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000¿\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\bÂ\u0001\u00109\u001a\u0006\bÀ\u0001\u0010Á\u0001R+\u0010Æ\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000000¿\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\bÅ\u0001\u00109\u001a\u0006\bÄ\u0001\u0010Á\u0001R\u0019\u0010È\u0001\u001a\u0004\u0018\u00010y8DX\u0084\u0004¢\u0006\b\u001a\u0006\bÇ\u0001\u0010¶\u0001R\u0017\u0010Ê\u0001\u001a\u00020y8DX\u0084\u0004¢\u0006\b\u001a\u0006\bÉ\u0001\u0010¶\u0001R\u0017\u0010Ì\u0001\u001a\u00020\u001e8TX\u0094\u0004¢\u0006\b\u001a\u0006\bË\u0001\u0010¥\u0001R\u001e\u0010Î\u0001\u001a\u00020\u001e8VX\u0097\u0004¢\u0006\u000f\u0012\u0005\bÍ\u0001\u00109\u001a\u0006\bª\u0001\u0010¥\u0001R\u001d\u0010f\u001a\u00020\u001e8VX\u0097\u0004¢\u0006\u000f\u0012\u0005\bÐ\u0001\u00109\u001a\u0006\bÏ\u0001\u0010¥\u0001R\r\u0010Ò\u0001\u001a\u00030Ñ\u00018\u0002X\u0082\u0004R\r\u0010Ó\u0001\u001a\u00030Ñ\u00018\u0002X\u0082\u0004R\r\u0010Ô\u0001\u001a\u00030Ñ\u00018\u0002X\u0082\u0004R\r\u0010Õ\u0001\u001a\u00030Ñ\u00018\u0002X\u0082\u0004R\u0019\u0010×\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0Ö\u00018\u0002X\u0082\u0004R\u0019\u0010Ø\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0Ö\u00018\u0002X\u0082\u0004R\u0019\u0010Ù\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0Ö\u00018\u0002X\u0082\u0004R\u0015\u0010Ú\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0Ö\u00018\u0002X\u0082\u0004R\u0015\u0010Û\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0Ö\u00018\u0002X\u0082\u0004¨\u0006Ü\u0001"}, m31665d2 = {"Lmu/e;", "E", "Lmu/g;", "", "capacity", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILkotlin/jvm/functions/Function1;)V", "element", "P0", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "Lmu/m;", "segment", "index", "", "s", "j1", "(Lmu/m;ILjava/lang/Object;JLnt/b;)Ljava/lang/Object;", "Lku/k3;", "W0", "(Lku/k3;Lmu/m;I)V", "Lku/n;", "cont", "Q0", "(Ljava/lang/Object;Lku/n;)V", "", "waiter", "", "closed", "s1", "(Lmu/m;ILjava/lang/Object;JLjava/lang/Object;Z)I", "t1", "curSendersAndCloseStatus", "k1", "(J)Z", "curSenders", "S", "l1", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "r", "c1", "(Lmu/m;IJLnt/b;)Ljava/lang/Object;", "V0", "N0", "(Lku/n;)V", "Lmu/k;", "b1", "M0", "q1", "(Lmu/m;IJLjava/lang/Object;)Ljava/lang/Object;", "r1", "m1", "(Ljava/lang/Object;Lmu/m;I)Z", "b0", "()V", "b", "o1", "(Lmu/m;IJ)Z", "p1", "nAttempts", "v0", "(J)V", "Ltu/l;", "select", "ignoredParam", "d1", "(Ltu/l;Ljava/lang/Object;)V", "O0", "(Ltu/l;)V", "selectResult", "X0", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Y0", "x0", "H0", "G0", "F0", "Z", "sendersCur", "Y", "(J)Lmu/m;", "X", "V", "()Lmu/m;", "lastSegment", "E0", "(Lmu/m;)J", "e1", "(Lmu/m;)V", "sendersCounter", "U", "(Lmu/m;J)V", "f1", "(Lku/k3;)V", "g1", "receiver", "h1", "(Lku/k3;Z)V", "sendersAndCloseStatusCur", "isClosedForReceive", "z0", "(JZ)Z", "globalIndex", "y0", "id", "startFrom", "e0", "(JLmu/m;)Lmu/m;", "d0", "currentBufferEndCounter", "c0", "(JLmu/m;J)Lmu/m;", "I0", "(JLmu/m;)V", "value", "v1", "u1", "Lkotlin/reflect/KFunction3;", "", "Lkotlin/coroutines/CoroutineContext;", "R", "(Lkotlin/jvm/functions/Function1;)Lhu/g;", "cause", "context", "J0", "(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", "Lkotlin/Function3;", "P", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lzt/n;", "O", "K0", "i", "w", "(Ljava/lang/Object;)Ljava/lang/Object;", "n1", "S0", "R0", "D", "(Lnt/b;)Ljava/lang/Object;", "C", "()Ljava/lang/Object;", "globalCellIndex", "a0", "w1", "Lmu/i;", "iterator", "()Lmu/i;", "L0", "F", "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "c", "(Ljava/util/concurrent/CancellationException;)V", "T", "cancel", "W", "(Ljava/lang/Throwable;Z)Z", "handler", "t", "(Lkotlin/jvm/functions/Function1;)V", "u0", "()Z", "", "toString", "()Ljava/lang/String;", "a", "I", "Lkotlin/jvm/functions/Function1;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "Lzt/n;", "getOnUndeliveredElementReceiveCancellationConstructor$annotations", "onUndeliveredElementReceiveCancellationConstructor", "g0", "()J", "bufferEndCounter", "D0", "isRendezvousOrUnlimited", "l0", "()Ljava/lang/Throwable;", "receiveException", "B0", "isClosedForSend0", "A0", "isClosedForReceive0", "s0", "o0", "receiversCounter", "Ltu/h;", "z", "()Ltu/h;", "getOnReceive$annotations", "onReceive", "A", "getOnReceiveCatching$annotations", "onReceiveCatching", "i0", "closeCause", "p0", "sendException", "C0", "isConflatedDropOldest", "isClosedForSend$annotations", "isClosedForSend", "h", "isClosedForReceive$annotations", "Lkotlinx/atomicfu/AtomicLong;", "sendersAndCloseStatus", "receivers", "bufferEnd", "completedExpandBuffersAndPauseFlag", "Lkotlinx/atomicfu/AtomicRef;", "sendSegment", "receiveSegment", "bufferEndSegment", "_closeCause", "closeHandler", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public class C8670e<E> implements InterfaceC8672g<E> {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicLongFieldUpdater f31659d = AtomicLongFieldUpdater.newUpdater(C8670e.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicLongFieldUpdater f31660e = AtomicLongFieldUpdater.newUpdater(C8670e.class, "receivers$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f31661f = AtomicLongFieldUpdater.newUpdater(C8670e.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicLongFieldUpdater f31662g = AtomicLongFieldUpdater.newUpdater(C8670e.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31663h = AtomicReferenceFieldUpdater.newUpdater(C8670e.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31664i = AtomicReferenceFieldUpdater.newUpdater(C8670e.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31665j = AtomicReferenceFieldUpdater.newUpdater(C8670e.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31666k = AtomicReferenceFieldUpdater.newUpdater(C8670e.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31667l = AtomicReferenceFieldUpdater.newUpdater(C8670e.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int capacity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final Function1<E, Unit> onUndeliveredElement;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC14057n<InterfaceC11760l<?>, Object, Object, InterfaceC14057n<Throwable, Object, CoroutineContext, Unit>> onUndeliveredElementReceiveCancellationConstructor;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* JADX INFO: renamed from: mu.e$a */
    @Metadata(m31664d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0096B¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\u001b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u0015R\u0018\u0010 \u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, m31665d2 = {"Lmu/e$a;", "Lmu/i;", "Lku/k3;", "<init>", "(Lmu/e;)V", "", "a", "(Lnt/b;)Ljava/lang/Object;", "Lqu/b0;", "segment", "", "index", "", "e", "(Lqu/b0;I)V", "next", "()Ljava/lang/Object;", "element", "i", "(Ljava/lang/Object;)Z", "j", "()V", "g", "()Z", "Lmu/m;", "", "r", "f", "(Lmu/m;IJLnt/b;)Ljava/lang/Object;", "h", "", "Ljava/lang/Object;", "receiveResult", "Lku/p;", "b", "Lku/p;", "continuation", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public final class a implements InterfaceC8674i<E>, InterfaceC7886k3 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public Object receiveResult = C8671f.f31703p;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public C7905p<? super Boolean> continuation;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a() {
        }

        @Override // mu.InterfaceC8674i
        @Nullable
        /* JADX INFO: renamed from: a */
        public Object mo34879a(@NotNull InterfaceC9557b<? super Boolean> interfaceC9557b) throws Throwable {
            C8678m<E> c8678mM34839d0;
            boolean zM34881g = true;
            if (this.receiveResult == C8671f.f31703p || this.receiveResult == C8671f.m34920z()) {
                C8670e<E> c8670e = C8670e.this;
                C8678m<E> c8678m = (C8678m) C8670e.m34777m0().get(c8670e);
                while (!c8670e.mo34846h()) {
                    long andIncrement = C8670e.m34779n0().getAndIncrement(c8670e);
                    int i10 = C8671f.f31689b;
                    long j10 = andIncrement / ((long) i10);
                    int i11 = (int) (andIncrement % ((long) i10));
                    if (c8678m.id != j10) {
                        c8678mM34839d0 = c8670e.m34839d0(j10, c8678m);
                        if (c8678mM34839d0 == null) {
                            continue;
                        }
                    } else {
                        c8678mM34839d0 = c8678m;
                    }
                    Object objM34860q1 = c8670e.m34860q1(c8678mM34839d0, i11, andIncrement, null);
                    if (objM34860q1 == C8671f.f31700m) {
                        throw new IllegalStateException("unreachable");
                    }
                    if (objM34860q1 == C8671f.f31702o) {
                        if (andIncrement < c8670e.m34862s0()) {
                            c8678mM34839d0.m40822c();
                        }
                        c8678m = c8678mM34839d0;
                    } else {
                        if (objM34860q1 == C8671f.f31701n) {
                            return m34880f(c8678mM34839d0, i11, andIncrement, interfaceC9557b);
                        }
                        c8678mM34839d0.m40822c();
                        this.receiveResult = objM34860q1;
                    }
                }
                zM34881g = m34881g();
            }
            return C10340b.m39658a(zM34881g);
        }

        @Override // p256ku.InterfaceC7886k3
        /* JADX INFO: renamed from: e */
        public void mo32790e(@NotNull AbstractC10713b0<?> segment, int index) {
            C7905p<? super Boolean> c7905p = this.continuation;
            if (c7905p != null) {
                c7905p.mo32790e(segment, index);
            }
        }

        /* JADX INFO: renamed from: f */
        public final Object m34880f(C8678m<E> c8678m, int i10, long j10, InterfaceC9557b<? super Boolean> interfaceC9557b) throws Throwable {
            Boolean boolM39658a;
            Function1<E, Unit> function1;
            C8678m c8678mM34839d0;
            C8670e<E> c8670e = C8670e.this;
            C7905p c7905pM32900b = C7913r.m32900b(C10046b.m38803c(interfaceC9557b));
            try {
                this.continuation = c7905pM32900b;
                try {
                    Object objM34860q1 = c8670e.m34860q1(c8678m, i10, j10, this);
                    if (objM34860q1 == C8671f.f31700m) {
                        c8670e.m34825V0(this, c8678m, i10);
                    } else {
                        InterfaceC14057n interfaceC14057nM34815P = null;
                        if (objM34860q1 == C8671f.f31702o) {
                            if (j10 < c8670e.m34862s0()) {
                                c8678m.m40822c();
                            }
                            C8678m c8678m2 = (C8678m) C8670e.m34777m0().get(c8670e);
                            while (true) {
                                if (c8670e.mo34846h()) {
                                    m34882h();
                                } else {
                                    long andIncrement = C8670e.m34779n0().getAndIncrement(c8670e);
                                    int i11 = C8671f.f31689b;
                                    long j11 = andIncrement / ((long) i11);
                                    int i12 = (int) (andIncrement % ((long) i11));
                                    if (c8678m2.id != j11) {
                                        c8678mM34839d0 = c8670e.m34839d0(j11, c8678m2);
                                        if (c8678mM34839d0 == null) {
                                        }
                                    } else {
                                        c8678mM34839d0 = c8678m2;
                                    }
                                    objM34860q1 = c8670e.m34860q1(c8678mM34839d0, i12, andIncrement, this);
                                    if (objM34860q1 == C8671f.f31700m) {
                                        c8670e.m34825V0(this, c8678mM34839d0, i12);
                                    } else if (objM34860q1 == C8671f.f31702o) {
                                        if (andIncrement < c8670e.m34862s0()) {
                                            c8678mM34839d0.m40822c();
                                        }
                                        c8678m2 = c8678mM34839d0;
                                    } else {
                                        if (objM34860q1 == C8671f.f31701n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        c8678mM34839d0.m40822c();
                                        this.receiveResult = objM34860q1;
                                        this.continuation = null;
                                        boolM39658a = C10340b.m39658a(true);
                                        function1 = c8670e.onUndeliveredElement;
                                        if (function1 != null) {
                                            interfaceC14057nM34815P = c8670e.m34815P(function1, objM34860q1);
                                        }
                                        c7905pM32900b.mo32814k(boolM39658a, interfaceC14057nM34815P);
                                    }
                                }
                            }
                        } else {
                            c8678m.m40822c();
                            this.receiveResult = objM34860q1;
                            this.continuation = null;
                            boolM39658a = C10340b.m39658a(true);
                            function1 = c8670e.onUndeliveredElement;
                            if (function1 != null) {
                                interfaceC14057nM34815P = c8670e.m34815P(function1, objM34860q1);
                            }
                            c7905pM32900b.mo32814k(boolM39658a, interfaceC14057nM34815P);
                        }
                    }
                    Object objM32857A = c7905pM32900b.m32857A();
                    if (objM32857A == C10047c.m38805e()) {
                        C10346h.m39673c(interfaceC9557b);
                    }
                    return objM32857A;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    c7905pM32900b.m32867Q();
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }

        /* JADX INFO: renamed from: g */
        public final boolean m34881g() throws Throwable {
            this.receiveResult = C8671f.m34920z();
            Throwable thM34849i0 = C8670e.this.m34849i0();
            if (thM34849i0 == null) {
                return false;
            }
            throw C10717d0.m40837a(thM34849i0);
        }

        /* JADX INFO: renamed from: h */
        public final void m34882h() {
            C7905p<? super Boolean> c7905p = this.continuation;
            Intrinsics.checkNotNull(c7905p);
            this.continuation = null;
            this.receiveResult = C8671f.m34920z();
            Throwable thM34849i0 = C8670e.this.m34849i0();
            if (thM34849i0 == null) {
                C7347n.Companion companion = C7347n.INSTANCE;
                c7905p.resumeWith(C7347n.m30460b(Boolean.FALSE));
            } else {
                C7347n.Companion companion2 = C7347n.INSTANCE;
                c7905p.resumeWith(C7347n.m30460b(C7348o.m30469a(thM34849i0)));
            }
        }

        /* JADX INFO: renamed from: i */
        public final boolean m34883i(E element) {
            C7905p<? super Boolean> c7905p = this.continuation;
            Intrinsics.checkNotNull(c7905p);
            this.continuation = null;
            this.receiveResult = element;
            Boolean bool = Boolean.TRUE;
            C8670e<E> c8670e = C8670e.this;
            Function1<E, Unit> function1 = c8670e.onUndeliveredElement;
            return C8671f.m34893B(c7905p, bool, function1 != null ? c8670e.m34815P(function1, element) : null);
        }

        /* JADX INFO: renamed from: j */
        public final void m34884j() {
            C7905p<? super Boolean> c7905p = this.continuation;
            Intrinsics.checkNotNull(c7905p);
            this.continuation = null;
            this.receiveResult = C8671f.m34920z();
            Throwable thM34849i0 = C8670e.this.m34849i0();
            if (thM34849i0 == null) {
                C7347n.Companion companion = C7347n.INSTANCE;
                c7905p.resumeWith(C7347n.m30460b(Boolean.FALSE));
            } else {
                C7347n.Companion companion2 = C7347n.INSTANCE;
                c7905p.resumeWith(C7347n.m30460b(C7348o.m30469a(thM34849i0)));
            }
        }

        @Override // mu.InterfaceC8674i
        public E next() throws Throwable {
            E e10 = (E) this.receiveResult;
            if (e10 == C8671f.f31703p) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            this.receiveResult = C8671f.f31703p;
            if (e10 != C8671f.m34920z()) {
                return e10;
            }
            throw C10717d0.m40837a(C8670e.this.m34852l0());
        }
    }

    /* JADX INFO: renamed from: mu.e$b */
    @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Lmu/e$b;", "Lku/k3;", "Lku/n;", "", "cont", "Lku/n;", "a", "()Lku/n;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class b implements InterfaceC7886k3 {
        @NotNull
        /* JADX INFO: renamed from: a */
        public final InterfaceC7897n<Boolean> m34885a() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: mu.e$c */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public /* synthetic */ class c extends C7744k implements InterfaceC14057n<Throwable, E, CoroutineContext, Unit> {
        public c(Object obj) {
            super(3, obj, C8670e.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        /* JADX INFO: renamed from: d */
        public final void m34886d(Throwable th2, E e10, CoroutineContext coroutineContext) {
            ((C8670e) this.receiver).m34809K0(th2, e10, coroutineContext);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p615zt.InterfaceC14057n
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2, Object obj, CoroutineContext coroutineContext) {
            m34886d(th2, obj, coroutineContext);
            return Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: mu.e$d */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public /* synthetic */ class d extends C7744k implements InterfaceC14057n<Throwable, C8676k<? extends E>, CoroutineContext, Unit> {
        public d(Object obj) {
            super(3, obj, C8670e.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        /* JADX INFO: renamed from: d */
        public final void m34887d(Throwable th2, Object obj, CoroutineContext coroutineContext) {
            ((C8670e) this.receiver).m34808J0(th2, obj, coroutineContext);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p615zt.InterfaceC14057n
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2, Object obj, CoroutineContext coroutineContext) {
            m34887d(th2, ((C8676k) obj).getHolder(), coroutineContext);
            return Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: mu.e$e */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public /* synthetic */ class e extends C7744k implements InterfaceC14057n<C8670e<?>, InterfaceC11760l<?>, Object, Unit> {

        /* JADX INFO: renamed from: a */
        public static final e f31674a = new e();

        public e() {
            super(3, C8670e.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        /* JADX INFO: renamed from: d */
        public final void m34888d(C8670e<?> c8670e, InterfaceC11760l<?> interfaceC11760l, Object obj) {
            c8670e.m34840d1(interfaceC11760l, obj);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p615zt.InterfaceC14057n
        public /* bridge */ /* synthetic */ Unit invoke(C8670e<?> c8670e, InterfaceC11760l<?> interfaceC11760l, Object obj) {
            m34888d(c8670e, interfaceC11760l, obj);
            return Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: mu.e$f */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public /* synthetic */ class f extends C7744k implements InterfaceC14057n<C8670e<?>, Object, Object, Object> {

        /* JADX INFO: renamed from: a */
        public static final f f31675a = new f();

        public f() {
            super(3, C8670e.class, "processResultSelectReceive", "processResultSelectReceive(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // p615zt.InterfaceC14057n
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C8670e<?> c8670e, Object obj, Object obj2) {
            return c8670e.m34829X0(obj, obj2);
        }
    }

    /* JADX INFO: renamed from: mu.e$g */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public /* synthetic */ class g extends C7744k implements InterfaceC14057n<C8670e<?>, InterfaceC11760l<?>, Object, Unit> {

        /* JADX INFO: renamed from: a */
        public static final g f31676a = new g();

        public g() {
            super(3, C8670e.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        /* JADX INFO: renamed from: d */
        public final void m34890d(C8670e<?> c8670e, InterfaceC11760l<?> interfaceC11760l, Object obj) {
            c8670e.m34840d1(interfaceC11760l, obj);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p615zt.InterfaceC14057n
        public /* bridge */ /* synthetic */ Unit invoke(C8670e<?> c8670e, InterfaceC11760l<?> interfaceC11760l, Object obj) {
            m34890d(c8670e, interfaceC11760l, obj);
            return Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: mu.e$h */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public /* synthetic */ class h extends C7744k implements InterfaceC14057n<C8670e<?>, Object, Object, Object> {

        /* JADX INFO: renamed from: a */
        public static final h f31677a = new h();

        public h() {
            super(3, C8670e.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // p615zt.InterfaceC14057n
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C8670e<?> c8670e, Object obj, Object obj2) {
            return c8670e.m34831Y0(obj, obj2);
        }
    }

    /* JADX INFO: renamed from: mu.e$i */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "kotlinx.coroutines.channels.BufferedChannel", m39664f = "BufferedChannel.kt", m39665l = {759}, m39666m = "receiveCatching-JP2dKIU$suspendImpl")
    public static final class i<E> extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public /* synthetic */ Object f31678t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ C8670e<E> f31679u;

        /* JADX INFO: renamed from: v */
        public int f31680v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C8670e<E> c8670e, InterfaceC9557b<? super i> interfaceC9557b) {
            super(interfaceC9557b);
            this.f31679u = c8670e;
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            this.f31678t = obj;
            this.f31680v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object objM34762a1 = C8670e.m34762a1(this.f31679u, this);
            return objM34762a1 == C10047c.m38805e() ? objM34762a1 : C8676k.m34929b(objM34762a1);
        }
    }

    /* JADX INFO: renamed from: mu.e$j */
    @InterfaceC10344f(m39663c = "kotlinx.coroutines.channels.BufferedChannel", m39664f = "BufferedChannel.kt", m39665l = {3117}, m39666m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk")
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class j extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f31681t;

        /* JADX INFO: renamed from: u */
        public Object f31682u;

        /* JADX INFO: renamed from: v */
        public int f31683v;

        /* JADX INFO: renamed from: w */
        public long f31684w;

        /* JADX INFO: renamed from: x */
        public /* synthetic */ Object f31685x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ C8670e<E> f31686y;

        /* JADX INFO: renamed from: z */
        public int f31687z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(C8670e<E> c8670e, InterfaceC9557b<? super j> interfaceC9557b) {
            super(interfaceC9557b);
            this.f31686y = c8670e;
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            this.f31685x = obj;
            this.f31687z |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object objM34835b1 = this.f31686y.m34835b1(null, 0, 0L, this);
            return objM34835b1 == C10047c.m38805e() ? objM34835b1 : C8676k.m34929b(objM34835b1);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: kotlin.jvm.functions.Function1<? super E, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C8670e(int i10, @Nullable Function1<? super E, Unit> function1) {
        this.capacity = i10;
        this.onUndeliveredElement = function1;
        if (i10 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i10 + ", should be >=0").toString());
        }
        this.bufferEnd$volatile = C8671f.m34892A(i10);
        this.completedExpandBuffersAndPauseFlag$volatile = m34844g0();
        C8678m c8678m = new C8678m(0L, null, this, 3);
        this.sendSegment$volatile = c8678m;
        this.receiveSegment$volatile = c8678m;
        if (m34799D0()) {
            c8678m = C8671f.f31688a;
            Intrinsics.m31981d(c8678m, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = c8678m;
        this.onUndeliveredElementReceiveCancellationConstructor = function1 != 0 ? new InterfaceC14057n() { // from class: mu.b
            @Override // p615zt.InterfaceC14057n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return C8670e.m34759T0(this.f31653a, (InterfaceC11760l) obj, obj2, obj3);
            }
        } : null;
        this._closeCause$volatile = C8671f.f31706s;
    }

    /* JADX INFO: renamed from: Q */
    public static final Unit m34758Q(Function1 function1, Object obj, Throwable th2, Object obj2, CoroutineContext coroutineContext) {
        C10752x.m40955a(function1, obj, coroutineContext);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: T0 */
    public static final InterfaceC14057n m34759T0(final C8670e c8670e, final InterfaceC11760l interfaceC11760l, Object obj, final Object obj2) {
        return new InterfaceC14057n() { // from class: mu.d
            @Override // p615zt.InterfaceC14057n
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return C8670e.m34760U0(obj2, c8670e, interfaceC11760l, (Throwable) obj3, obj4, (CoroutineContext) obj5);
            }
        };
    }

    /* JADX INFO: renamed from: U0 */
    public static final Unit m34760U0(Object obj, C8670e c8670e, InterfaceC11760l interfaceC11760l, Throwable th2, Object obj2, CoroutineContext coroutineContext) {
        if (obj != C8671f.m34920z()) {
            C10752x.m40955a(c8670e.onUndeliveredElement, obj, interfaceC11760l.getContext());
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Z0 */
    public static /* synthetic */ <E> Object m34761Z0(C8670e<E> c8670e, InterfaceC9557b<? super E> interfaceC9557b) throws Throwable {
        C8678m<E> c8678m;
        C8678m<E> c8678m2 = (C8678m) m34777m0().get(c8670e);
        while (!c8670e.mo34846h()) {
            long andIncrement = m34779n0().getAndIncrement(c8670e);
            int i10 = C8671f.f31689b;
            long j10 = andIncrement / ((long) i10);
            int i11 = (int) (andIncrement % ((long) i10));
            if (c8678m2.id != j10) {
                C8678m<E> c8678mM34839d0 = c8670e.m34839d0(j10, c8678m2);
                if (c8678mM34839d0 == null) {
                    continue;
                } else {
                    c8678m = c8678mM34839d0;
                }
            } else {
                c8678m = c8678m2;
            }
            C8670e<E> c8670e2 = c8670e;
            Object objM34860q1 = c8670e2.m34860q1(c8678m, i11, andIncrement, null);
            if (objM34860q1 == C8671f.f31700m) {
                throw new IllegalStateException("unexpected");
            }
            if (objM34860q1 != C8671f.f31702o) {
                if (objM34860q1 == C8671f.f31701n) {
                    return c8670e2.m34838c1(c8678m, i11, andIncrement, interfaceC9557b);
                }
                c8678m.m40822c();
                return objM34860q1;
            }
            if (andIncrement < c8670e2.m34862s0()) {
                c8678m.m40822c();
            }
            c8670e = c8670e2;
            c8678m2 = c8678m;
        }
        throw C10717d0.m40837a(c8670e.m34852l0());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r14v12, resolved type: mu.k$b */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ <E> Object m34762a1(C8670e<E> c8670e, InterfaceC9557b<? super C8676k<? extends E>> interfaceC9557b) throws Throwable {
        i iVar;
        C8678m<E> c8678m;
        if (interfaceC9557b instanceof i) {
            iVar = (i) interfaceC9557b;
            int i10 = iVar.f31680v;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                iVar.f31680v = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                iVar = new i(c8670e, interfaceC9557b);
            }
        } else {
            iVar = new i(c8670e, interfaceC9557b);
        }
        i iVar2 = iVar;
        Object obj = iVar2.f31678t;
        Object objM38805e = C10047c.m38805e();
        int i11 = iVar2.f31680v;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            return ((C8676k) obj).getHolder();
        }
        C7348o.m30470b(obj);
        C8678m<E> c8678m2 = (C8678m) m34777m0().get(c8670e);
        while (!c8670e.mo34846h()) {
            long andIncrement = m34779n0().getAndIncrement(c8670e);
            int i12 = C8671f.f31689b;
            long j10 = andIncrement / ((long) i12);
            int i13 = (int) (andIncrement % ((long) i12));
            if (c8678m2.id != j10) {
                C8678m<E> c8678mM34839d0 = c8670e.m34839d0(j10, c8678m2);
                if (c8678mM34839d0 == null) {
                    continue;
                } else {
                    c8678m = c8678mM34839d0;
                }
            } else {
                c8678m = c8678m2;
            }
            C8670e<E> c8670e2 = c8670e;
            Object objM34860q1 = c8670e2.m34860q1(c8678m, i13, andIncrement, null);
            if (objM34860q1 == C8671f.f31700m) {
                throw new IllegalStateException("unexpected");
            }
            if (objM34860q1 != C8671f.f31702o) {
                if (objM34860q1 != C8671f.f31701n) {
                    c8678m.m40822c();
                    return C8676k.INSTANCE.m34941c(objM34860q1);
                }
                iVar2.f31680v = 1;
                Object objM34835b1 = c8670e2.m34835b1(c8678m, i13, andIncrement, iVar2);
                return objM34835b1 == objM38805e ? objM38805e : objM34835b1;
            }
            if (andIncrement < c8670e2.m34862s0()) {
                c8678m.m40822c();
            }
            c8670e = c8670e2;
            c8678m2 = c8678m;
        }
        return C8676k.INSTANCE.m34939a(c8670e.m34849i0());
    }

    /* JADX INFO: renamed from: i1 */
    public static /* synthetic */ <E> Object m34770i1(C8670e<E> c8670e, E e10, InterfaceC9557b<? super Unit> interfaceC9557b) {
        C8678m<E> c8678m;
        C8678m<E> c8678m2 = (C8678m) m34783q0().get(c8670e);
        while (true) {
            long andIncrement = m34785r0().getAndIncrement(c8670e);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zM34795B0 = c8670e.m34795B0(andIncrement);
            int i10 = C8671f.f31689b;
            long j11 = j10 / ((long) i10);
            int i11 = (int) (j10 % ((long) i10));
            if (c8678m2.id != j11) {
                C8678m<E> c8678mM34841e0 = c8670e.m34841e0(j11, c8678m2);
                if (c8678mM34841e0 != null) {
                    c8678m = c8678mM34841e0;
                } else if (zM34795B0) {
                    Object objM34816P0 = c8670e.m34816P0(e10, interfaceC9557b);
                    if (objM34816P0 != C10047c.m38805e()) {
                        break;
                    }
                    return objM34816P0;
                }
            } else {
                c8678m = c8678m2;
            }
            C8670e<E> c8670e2 = c8670e;
            E e11 = e10;
            int iM34863s1 = c8670e2.m34863s1(c8678m, i11, e11, j10, null, zM34795B0);
            if (iM34863s1 == 0) {
                c8678m.m40822c();
                break;
            }
            if (iM34863s1 != 1) {
                if (iM34863s1 == 2) {
                    if (!zM34795B0) {
                        break;
                    }
                    c8678m.m40817t();
                    Object objM34816P1 = c8670e2.m34816P0(e11, interfaceC9557b);
                    if (objM34816P1 != C10047c.m38805e()) {
                        break;
                    }
                    return objM34816P1;
                }
                if (iM34863s1 == 3) {
                    Object objM34850j1 = c8670e2.m34850j1(c8678m, i11, e11, j10, interfaceC9557b);
                    if (objM34850j1 != C10047c.m38805e()) {
                        break;
                    }
                    return objM34850j1;
                }
                if (iM34863s1 == 4) {
                    if (j10 < c8670e2.m34856o0()) {
                        c8678m.m40822c();
                    }
                    Object objM34816P2 = c8670e2.m34816P0(e11, interfaceC9557b);
                    if (objM34816P2 != C10047c.m38805e()) {
                        break;
                    }
                    return objM34816P2;
                }
                if (iM34863s1 == 5) {
                    c8678m.m40822c();
                }
                c8670e = c8670e2;
                c8678m2 = c8678m;
                e10 = e11;
            } else {
                break;
            }
        }
        return Unit.f29331a;
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [mu.e.a.a(nt.b<? super java.lang.Boolean>):java.lang.Object, mu.e.a.f(mu.m<E>, int, long, nt.b<? super java.lang.Boolean>):java.lang.Object, mu.e.Z0(mu.e<E>, nt.b<? super E>):java.lang.Object, mu.e.a1(mu.e<E>, nt.b<? super mu.k<? extends E>>):java.lang.Object, mu.e.C():java.lang.Object, mu.e.b1(mu.m<E>, int, long, nt.b<? super mu.k<? extends E>>):java.lang.Object, mu.e.c1(mu.m<E>, int, long, nt.b<? super E>):java.lang.Object, mu.e.d1(tu.l<?>, java.lang.Object):void] */
    /* JADX INFO: renamed from: m0 */
    public static final /* synthetic */ AtomicReferenceFieldUpdater m34777m0() {
        return f31664i;
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [mu.e.a.a(nt.b<? super java.lang.Boolean>):java.lang.Object, mu.e.a.f(mu.m<E>, int, long, nt.b<? super java.lang.Boolean>):java.lang.Object, mu.e.Z0(mu.e<E>, nt.b<? super E>):java.lang.Object, mu.e.a1(mu.e<E>, nt.b<? super mu.k<? extends E>>):java.lang.Object, mu.e.C():java.lang.Object, mu.e.b1(mu.m<E>, int, long, nt.b<? super mu.k<? extends E>>):java.lang.Object, mu.e.c1(mu.m<E>, int, long, nt.b<? super E>):java.lang.Object, mu.e.d1(tu.l<?>, java.lang.Object):void] */
    /* JADX INFO: renamed from: n0 */
    public static final /* synthetic */ AtomicLongFieldUpdater m34779n0() {
        return f31660e;
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [mu.e.i1(mu.e<E>, E, nt.b<? super kotlin.Unit>):java.lang.Object, mu.e.j1(mu.m<E>, int, E, long, nt.b<? super kotlin.Unit>):java.lang.Object, mu.e.n1(E):java.lang.Object, mu.e.w(E):java.lang.Object] */
    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ AtomicReferenceFieldUpdater m34783q0() {
        return f31663h;
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [mu.e.i1(mu.e<E>, E, nt.b<? super kotlin.Unit>):java.lang.Object, mu.e.j1(mu.m<E>, int, E, long, nt.b<? super kotlin.Unit>):java.lang.Object, mu.e.n1(E):java.lang.Object, mu.e.w(E):java.lang.Object] */
    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ AtomicLongFieldUpdater m34785r0() {
        return f31659d;
    }

    /* JADX INFO: renamed from: w0 */
    public static /* synthetic */ void m34790w0(C8670e c8670e, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i10 & 1) != 0) {
            j10 = 1;
        }
        c8670e.m34868v0(j10);
    }

    @Override // mu.InterfaceC8689x
    @NotNull
    /* JADX INFO: renamed from: A */
    public InterfaceC11756h<C8676k<E>> mo34793A() {
        g gVar = g.f31676a;
        Intrinsics.m31981d(gVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        InterfaceC14057n interfaceC14057n = (InterfaceC14057n) C7739h0.m32040e(gVar, 3);
        h hVar = h.f31677a;
        Intrinsics.m31981d(hVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new C11757i(this, interfaceC14057n, (InterfaceC14057n) C7739h0.m32040e(hVar, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    /* JADX INFO: renamed from: A0 */
    public final boolean m34794A0(long j10) {
        return m34875z0(j10, true);
    }

    /* JADX INFO: renamed from: B0 */
    public final boolean m34795B0(long j10) {
        return m34875z0(j10, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: mu.k$b */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // mu.InterfaceC8689x
    @NotNull
    /* JADX INFO: renamed from: C */
    public Object mo34796C() {
        C8678m c8678mM34839d0;
        long j10 = f31660e.get(this);
        long j11 = f31659d.get(this);
        if (m34794A0(j11)) {
            return C8676k.INSTANCE.m34939a(m34849i0());
        }
        if (j10 >= (j11 & 1152921504606846975L)) {
            return C8676k.INSTANCE.m34940b();
        }
        Object obj = C8671f.f31698k;
        C8678m c8678m = (C8678m) m34777m0().get(this);
        while (!mo34846h()) {
            long andIncrement = m34779n0().getAndIncrement(this);
            int i10 = C8671f.f31689b;
            long j12 = andIncrement / ((long) i10);
            int i11 = (int) (andIncrement % ((long) i10));
            if (c8678m.id != j12) {
                c8678mM34839d0 = m34839d0(j12, c8678m);
                if (c8678mM34839d0 == null) {
                    continue;
                }
            } else {
                c8678mM34839d0 = c8678m;
            }
            Object objM34860q1 = m34860q1(c8678mM34839d0, i11, andIncrement, obj);
            if (objM34860q1 == C8671f.f31700m) {
                InterfaceC7886k3 interfaceC7886k3 = obj instanceof InterfaceC7886k3 ? (InterfaceC7886k3) obj : null;
                if (interfaceC7886k3 != null) {
                    m34825V0(interfaceC7886k3, c8678mM34839d0, i11);
                }
                m34871w1(andIncrement);
                c8678mM34839d0.m40817t();
                return C8676k.INSTANCE.m34940b();
            }
            if (objM34860q1 != C8671f.f31702o) {
                if (objM34860q1 == C8671f.f31701n) {
                    throw new IllegalStateException("unexpected");
                }
                c8678mM34839d0.m40822c();
                return C8676k.INSTANCE.m34941c(objM34860q1);
            }
            if (andIncrement < m34862s0()) {
                c8678mM34839d0.m40822c();
            }
            c8678m = c8678mM34839d0;
        }
        return C8676k.INSTANCE.m34939a(m34849i0());
    }

    /* JADX INFO: renamed from: C0 */
    public boolean mo34797C0() {
        return false;
    }

    @Override // mu.InterfaceC8689x
    @Nullable
    /* JADX INFO: renamed from: D */
    public Object mo34798D(@NotNull InterfaceC9557b<? super E> interfaceC9557b) {
        return m34761Z0(this, interfaceC9557b);
    }

    /* JADX INFO: renamed from: D0 */
    public final boolean m34799D0() {
        long jM34844g0 = m34844g0();
        return jM34844g0 == 0 || jM34844g0 == Long.MAX_VALUE;
    }

    @Override // mu.InterfaceC8689x
    @Nullable
    /* JADX INFO: renamed from: E */
    public Object mo34800E(@NotNull InterfaceC9557b<? super C8676k<? extends E>> interfaceC9557b) {
        return m34762a1(this, interfaceC9557b);
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0004 */
    /* JADX DEBUG: Multi-variable search result rejected for r8v2, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E0 */
    public final long m34801E0(C8678m<E> lastSegment) {
        do {
            int i10 = C8671f.f31689b;
            while (true) {
                i10--;
                if (-1 < i10) {
                    long j10 = (lastSegment.id * ((long) C8671f.f31689b)) + ((long) i10);
                    if (j10 >= m34856o0()) {
                        while (true) {
                            Object objM34944B = lastSegment.m34944B(i10);
                            if (objM34944B != null && objM34944B != C8671f.f31692e) {
                                if (objM34944B != C8671f.f31691d) {
                                    break;
                                }
                                return j10;
                            }
                            if (lastSegment.m34952v(i10, objM34944B, C8671f.m34920z())) {
                                lastSegment.m40817t();
                                break;
                            }
                        }
                    } else {
                        return -1L;
                    }
                }
            }
            lastSegment = (C8678m) lastSegment.m40827h();
        } while (lastSegment != null);
        return -1L;
    }

    @Override // mu.InterfaceC8690y
    /* JADX INFO: renamed from: F */
    public boolean mo34802F(@Nullable Throwable cause) {
        return m34826W(cause, false);
    }

    /* JADX INFO: renamed from: F0 */
    public final void m34803F0() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f31659d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if (((int) (j10 >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, C8671f.m34917w(1152921504606846975L & j10, 1)));
    }

    /* JADX INFO: renamed from: G0 */
    public final void m34804G0() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f31659d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, C8671f.m34917w(1152921504606846975L & j10, 3)));
    }

    /* JADX INFO: renamed from: H0 */
    public final void m34805H0() {
        long j10;
        long jM34917w;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f31659d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j10 >> 60);
            if (i10 == 0) {
                jM34917w = C8671f.m34917w(1152921504606846975L & j10, 2);
            } else if (i10 != 1) {
                return;
            } else {
                jM34917w = C8671f.m34917w(1152921504606846975L & j10, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, jM34917w));
    }

    @Override // mu.InterfaceC8690y
    /* JADX INFO: renamed from: I */
    public boolean mo34806I() {
        return m34795B0(f31659d.get(this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r5v4, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I0 */
    public final void m34807I0(long id2, C8678m<E> startFrom) {
        C8678m<E> c8678m;
        C8678m<E> c8678m2;
        while (startFrom.id < id2 && (c8678m2 = (C8678m) startFrom.m40825f()) != null) {
            startFrom = c8678m2;
        }
        while (true) {
            if (!startFrom.mo40815k() || (c8678m = (C8678m) startFrom.m40825f()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31665j;
                while (true) {
                    AbstractC10713b0 abstractC10713b0 = (AbstractC10713b0) atomicReferenceFieldUpdater.get(this);
                    if (abstractC10713b0.id >= startFrom.id) {
                        return;
                    }
                    if (!startFrom.m40818u()) {
                        break;
                    }
                    if (C12996b.m48310a(atomicReferenceFieldUpdater, this, abstractC10713b0, startFrom)) {
                        if (abstractC10713b0.m40816p()) {
                            abstractC10713b0.m40830n();
                            return;
                        }
                        return;
                    } else if (startFrom.m40816p()) {
                        startFrom.m40830n();
                    }
                }
            } else {
                startFrom = c8678m;
            }
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final void m34808J0(Throwable cause, Object element, CoroutineContext context) {
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        Intrinsics.checkNotNull(function1);
        Object objM34933f = C8676k.m34933f(element);
        Intrinsics.checkNotNull(objM34933f);
        C10752x.m40955a(function1, objM34933f, context);
    }

    /* JADX INFO: renamed from: K0 */
    public final void m34809K0(Throwable cause, E element, CoroutineContext context) {
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        Intrinsics.checkNotNull(function1);
        C10752x.m40955a(function1, element, context);
    }

    /* JADX INFO: renamed from: L0 */
    public void m34810L0() {
    }

    /* JADX INFO: renamed from: M0 */
    public final void m34811M0(InterfaceC7897n<? super C8676k<? extends E>> cont) {
        C7347n.Companion companion = C7347n.INSTANCE;
        cont.resumeWith(C7347n.m30460b(C8676k.m34929b(C8676k.INSTANCE.m34939a(m34849i0()))));
    }

    /* JADX INFO: renamed from: N0 */
    public final void m34812N0(InterfaceC7897n<? super E> cont) {
        C7347n.Companion companion = C7347n.INSTANCE;
        cont.resumeWith(C7347n.m30460b(C7348o.m30469a(m34852l0())));
    }

    /* JADX INFO: renamed from: O */
    public final InterfaceC6571g<Unit> m34813O(Function1<? super E, Unit> function1) {
        return new c(this);
    }

    /* JADX INFO: renamed from: O0 */
    public final void m34814O0(InterfaceC11760l<?> select) {
        select.mo44010b(C8671f.m34920z());
    }

    /* JADX INFO: renamed from: P */
    public final InterfaceC14057n<Throwable, Object, CoroutineContext, Unit> m34815P(final Function1<? super E, Unit> function1, final E e10) {
        return new InterfaceC14057n() { // from class: mu.c
            @Override // p615zt.InterfaceC14057n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return C8670e.m34758Q(function1, e10, (Throwable) obj, obj2, (CoroutineContext) obj3);
            }
        };
    }

    /* JADX INFO: renamed from: P0 */
    public final Object m34816P0(E e10, InterfaceC9557b<? super Unit> interfaceC9557b) {
        C10747s0 c10747s0M40957c;
        C7905p c7905p = new C7905p(C10046b.m38803c(interfaceC9557b), 1);
        c7905p.m32860H();
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        if (function1 == null || (c10747s0M40957c = C10752x.m40957c(function1, e10, null, 2, null)) == null) {
            Throwable thM34858p0 = m34858p0();
            C7347n.Companion companion = C7347n.INSTANCE;
            c7905p.resumeWith(C7347n.m30460b(C7348o.m30469a(thM34858p0)));
        } else {
            C7328a.m30429a(c10747s0M40957c, m34858p0());
            C7347n.Companion companion2 = C7347n.INSTANCE;
            c7905p.resumeWith(C7347n.m30460b(C7348o.m30469a(c10747s0M40957c)));
        }
        Object objM32857A = c7905p.m32857A();
        if (objM32857A == C10047c.m38805e()) {
            C10346h.m39673c(interfaceC9557b);
        }
        return objM32857A == C10047c.m38805e() ? objM32857A : Unit.f29331a;
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m34817Q0(E element, InterfaceC7897n<? super Unit> cont) {
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        if (function1 != null) {
            C10752x.m40955a(function1, element, cont.getContext());
        }
        Throwable thM34858p0 = m34858p0();
        C7347n.Companion companion = C7347n.INSTANCE;
        cont.resumeWith(C7347n.m30460b(C7348o.m30469a(thM34858p0)));
    }

    /* JADX INFO: renamed from: R */
    public final InterfaceC6571g<Unit> m34818R(Function1<? super E, Unit> function1) {
        return new d(this);
    }

    /* JADX INFO: renamed from: R0 */
    public void m34819R0() {
    }

    /* JADX INFO: renamed from: S */
    public final boolean m34820S(long curSenders) {
        return curSenders < m34844g0() || curSenders < m34856o0() + ((long) this.capacity);
    }

    /* JADX INFO: renamed from: S0 */
    public void m34821S0() {
    }

    /* JADX INFO: renamed from: T */
    public boolean m34822T(@Nullable Throwable cause) {
        if (cause == null) {
            cause = new CancellationException("Channel was cancelled");
        }
        return m34826W(cause, true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v8, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U */
    public final void m34823U(C8678m<E> lastSegment, long sendersCounter) {
        Object objM40872b = C10730k.m40872b(null, 1, null);
        loop0: while (lastSegment != null) {
            for (int i10 = C8671f.f31689b - 1; -1 < i10; i10--) {
                if ((lastSegment.id * ((long) C8671f.f31689b)) + ((long) i10) < sendersCounter) {
                    break loop0;
                }
                while (true) {
                    Object objM34944B = lastSegment.m34944B(i10);
                    if (objM34944B != null && objM34944B != C8671f.f31692e) {
                        if (!(objM34944B instanceof WaiterEB)) {
                            if (!(objM34944B instanceof InterfaceC7886k3)) {
                                break;
                            }
                            if (lastSegment.m34952v(i10, objM34944B, C8671f.m34920z())) {
                                objM40872b = C10730k.m40873c(objM40872b, objM34944B);
                                lastSegment.m34945C(i10, true);
                                break;
                            }
                        } else {
                            if (lastSegment.m34952v(i10, objM34944B, C8671f.m34920z())) {
                                objM40872b = C10730k.m40873c(objM40872b, ((WaiterEB) objM34944B).waiter);
                                lastSegment.m34945C(i10, true);
                                break;
                            }
                        }
                    } else {
                        if (lastSegment.m34952v(i10, objM34944B, C8671f.m34920z())) {
                            lastSegment.m40817t();
                            break;
                        }
                    }
                }
            }
            lastSegment = (C8678m) lastSegment.m40827h();
        }
        if (objM40872b != null) {
            if (!(objM40872b instanceof ArrayList)) {
                m34843f1((InterfaceC7886k3) objM40872b);
                return;
            }
            Intrinsics.m31981d(objM40872b, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ArrayList arrayList = (ArrayList) objM40872b;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                m34843f1((InterfaceC7886k3) arrayList.get(size));
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public final C8678m<E> m34824V() {
        Object obj = f31665j.get(this);
        C8678m c8678m = (C8678m) f31663h.get(this);
        if (c8678m.id > ((C8678m) obj).id) {
            obj = c8678m;
        }
        C8678m c8678m2 = (C8678m) f31664i.get(this);
        if (c8678m2.id > ((C8678m) obj).id) {
            obj = c8678m2;
        }
        return (C8678m) C10712b.m40812b((AbstractC10714c) obj);
    }

    /* JADX INFO: renamed from: V0 */
    public final void m34825V0(InterfaceC7886k3 interfaceC7886k3, C8678m<E> c8678m, int i10) {
        m34821S0();
        interfaceC7886k3.mo32790e(c8678m, i10);
    }

    /* JADX INFO: renamed from: W */
    public boolean m34826W(@Nullable Throwable cause, boolean cancel) {
        if (cancel) {
            m34803F0();
        }
        boolean zM48310a = C12996b.m48310a(f31666k, this, C8671f.f31706s, cause);
        if (cancel) {
            m34804G0();
        } else {
            m34805H0();
        }
        m34832Z();
        m34810L0();
        if (zM48310a) {
            m34872x0();
        }
        return zM48310a;
    }

    /* JADX INFO: renamed from: W0 */
    public final void m34827W0(InterfaceC7886k3 interfaceC7886k3, C8678m<E> c8678m, int i10) {
        interfaceC7886k3.mo32790e(c8678m, i10 + C8671f.f31689b);
    }

    /* JADX INFO: renamed from: X */
    public final void m34828X(long sendersCur) {
        m34842e1(m34830Y(sendersCur));
    }

    /* JADX INFO: renamed from: X0 */
    public final Object m34829X0(Object ignoredParam, Object selectResult) throws Throwable {
        if (selectResult != C8671f.m34920z()) {
            return selectResult;
        }
        throw m34852l0();
    }

    /* JADX INFO: renamed from: Y */
    public final C8678m<E> m34830Y(long sendersCur) {
        C8678m<E> c8678mM34824V = m34824V();
        if (mo34797C0()) {
            long jM34801E0 = m34801E0(c8678mM34824V);
            if (jM34801E0 != -1) {
                m34833a0(jM34801E0);
            }
        }
        m34823U(c8678mM34824V, sendersCur);
        return c8678mM34824V;
    }

    /* JADX INFO: renamed from: Y0 */
    public final Object m34831Y0(Object ignoredParam, Object selectResult) {
        return C8676k.m34929b(selectResult == C8671f.m34920z() ? C8676k.INSTANCE.m34939a(m34849i0()) : C8676k.INSTANCE.m34941c(selectResult));
    }

    /* JADX INFO: renamed from: Z */
    public final void m34832Z() {
        mo34806I();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m34833a0(long globalCellIndex) {
        C8678m<E> c8678mM34839d0;
        C10747s0 c10747s0M40957c;
        C8678m<E> c8678m = (C8678m) f31664i.get(this);
        while (true) {
            long j10 = f31660e.get(this);
            if (globalCellIndex < Math.max(((long) this.capacity) + j10, m34844g0())) {
                return;
            }
            if (f31660e.compareAndSet(this, j10, 1 + j10)) {
                int i10 = C8671f.f31689b;
                long j11 = j10 / ((long) i10);
                int i11 = (int) (j10 % ((long) i10));
                if (c8678m.id != j11) {
                    c8678mM34839d0 = m34839d0(j11, c8678m);
                    if (c8678mM34839d0 == null) {
                        continue;
                    }
                } else {
                    c8678mM34839d0 = c8678m;
                }
                Object objM34860q1 = m34860q1(c8678mM34839d0, i11, j10, null);
                if (objM34860q1 != C8671f.f31702o) {
                    c8678mM34839d0.m40822c();
                    Function1<E, Unit> function1 = this.onUndeliveredElement;
                    if (function1 != null && (c10747s0M40957c = C10752x.m40957c(function1, objM34860q1, null, 2, null)) != null) {
                        throw c10747s0M40957c;
                    }
                } else if (j10 < m34862s0()) {
                    c8678mM34839d0.m40822c();
                }
                c8678m = c8678mM34839d0;
            }
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m34834b0() {
        if (m34799D0()) {
            return;
        }
        C8678m<E> c8678m = (C8678m) f31665j.get(this);
        while (true) {
            long andIncrement = f31661f.getAndIncrement(this);
            int i10 = C8671f.f31689b;
            long j10 = andIncrement / ((long) i10);
            if (m34862s0() <= andIncrement) {
                if (c8678m.id < j10 && c8678m.m40825f() != 0) {
                    m34807I0(j10, c8678m);
                }
                m34790w0(this, 0L, 1, null);
                return;
            }
            if (c8678m.id != j10) {
                C8678m<E> c8678mM34837c0 = m34837c0(j10, c8678m, andIncrement);
                if (c8678mM34837c0 == null) {
                    continue;
                } else {
                    c8678m = c8678mM34837c0;
                }
            }
            if (m34857o1(c8678m, (int) (andIncrement % ((long) i10)), andIncrement)) {
                m34790w0(this, 0L, 1, null);
                return;
            }
            m34790w0(this, 0L, 1, null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v13, resolved type: mu.k$b */
    /* JADX DEBUG: Multi-variable search result rejected for r12v3, resolved type: mu.k$b */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b1 */
    public final Object m34835b1(C8678m<E> c8678m, int i10, long j10, InterfaceC9557b<? super C8676k<? extends E>> interfaceC9557b) throws Throwable {
        j jVar;
        C8676k c8676kM34929b;
        C8678m c8678m2;
        if (interfaceC9557b instanceof j) {
            jVar = (j) interfaceC9557b;
            int i11 = jVar.f31687z;
            if ((i11 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                jVar.f31687z = i11 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                jVar = new j(this, interfaceC9557b);
            }
        } else {
            jVar = new j(this, interfaceC9557b);
        }
        Object objM32857A = jVar.f31685x;
        Object objM38805e = C10047c.m38805e();
        int i12 = jVar.f31687z;
        if (i12 == 0) {
            C7348o.m30470b(objM32857A);
            jVar.f31681t = this;
            jVar.f31682u = c8678m;
            jVar.f31683v = i10;
            jVar.f31684w = j10;
            jVar.f31687z = 1;
            C7905p c7905pM32900b = C7913r.m32900b(C10046b.m38803c(jVar));
            try {
                Intrinsics.m31981d(c7905pM32900b, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<E of kotlinx.coroutines.channels.BufferedChannel>>");
                C8688w c8688w = new C8688w(c7905pM32900b);
                try {
                    Object objM34860q1 = m34860q1(c8678m, i10, j10, c8688w);
                    if (objM34860q1 == C8671f.f31700m) {
                        m34825V0(c8688w, c8678m, i10);
                    } else {
                        InterfaceC6571g interfaceC6571gM34818R = null;
                        if (objM34860q1 == C8671f.f31702o) {
                            if (j10 < m34862s0()) {
                                c8678m.m40822c();
                            }
                            C8678m c8678m3 = (C8678m) m34777m0().get(this);
                            while (true) {
                                if (mo34846h()) {
                                    m34811M0(c7905pM32900b);
                                } else {
                                    long andIncrement = m34779n0().getAndIncrement(this);
                                    int i13 = C8671f.f31689b;
                                    long j11 = andIncrement / ((long) i13);
                                    int i14 = (int) (andIncrement % ((long) i13));
                                    if (c8678m3.id != j11) {
                                        C8678m c8678mM34839d0 = m34839d0(j11, c8678m3);
                                        if (c8678mM34839d0 != null) {
                                            c8678m2 = c8678mM34839d0;
                                        }
                                    } else {
                                        c8678m2 = c8678m3;
                                    }
                                    Object objM34860q2 = m34860q1(c8678m2, i14, andIncrement, c8688w);
                                    C8678m c8678m4 = c8678m2;
                                    if (objM34860q2 == C8671f.f31700m) {
                                        m34825V0(c8688w, c8678m4, i14);
                                    } else if (objM34860q2 == C8671f.f31702o) {
                                        if (andIncrement < m34862s0()) {
                                            c8678m4.m40822c();
                                        }
                                        c8678m3 = c8678m4;
                                    } else {
                                        if (objM34860q2 == C8671f.f31701n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        c8678m4.m40822c();
                                        c8676kM34929b = C8676k.m34929b(C8676k.INSTANCE.m34941c(objM34860q2));
                                        Function1<E, Unit> function1 = this.onUndeliveredElement;
                                        if (function1 != null) {
                                            interfaceC6571gM34818R = m34818R(function1);
                                        }
                                    }
                                }
                            }
                        } else {
                            c8678m.m40822c();
                            c8676kM34929b = C8676k.m34929b(C8676k.INSTANCE.m34941c(objM34860q1));
                            Function1<E, Unit> function2 = this.onUndeliveredElement;
                            if (function2 != null) {
                                interfaceC6571gM34818R = m34818R(function2);
                            }
                        }
                        c7905pM32900b.mo32814k(c8676kM34929b, (InterfaceC14057n) interfaceC6571gM34818R);
                    }
                    objM32857A = c7905pM32900b.m32857A();
                    if (objM32857A == C10047c.m38805e()) {
                        C10346h.m39673c(jVar);
                    }
                    if (objM32857A == objM38805e) {
                        return objM38805e;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    c7905pM32900b.m32867Q();
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(objM32857A);
        }
        return ((C8676k) objM32857A).getHolder();
    }

    @Override // mu.InterfaceC8689x
    /* JADX INFO: renamed from: c */
    public final void mo34836c(@Nullable CancellationException cause) {
        m34822T(cause);
    }

    /* JADX INFO: renamed from: c0 */
    public final C8678m<E> m34837c0(long id2, C8678m<E> startFrom, long currentBufferEndCounter) {
        Object objM40813c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31665j;
        Function2 function2 = (Function2) C8671f.m34919y();
        loop0: while (true) {
            objM40813c = C10712b.m40813c(startFrom, id2, function2);
            if (!C10715c0.m40834c(objM40813c)) {
                AbstractC10713b0 abstractC10713b0M40833b = C10715c0.m40833b(objM40813c);
                while (true) {
                    AbstractC10713b0 abstractC10713b0 = (AbstractC10713b0) atomicReferenceFieldUpdater.get(this);
                    if (abstractC10713b0.id >= abstractC10713b0M40833b.id) {
                        break loop0;
                    }
                    if (!abstractC10713b0M40833b.m40818u()) {
                        break;
                    }
                    if (C12996b.m48310a(atomicReferenceFieldUpdater, this, abstractC10713b0, abstractC10713b0M40833b)) {
                        if (!abstractC10713b0.m40816p()) {
                            break loop0;
                        }
                        abstractC10713b0.m40830n();
                        break loop0;
                    }
                    if (abstractC10713b0M40833b.m40816p()) {
                        abstractC10713b0M40833b.m40830n();
                    }
                }
            } else {
                break;
            }
        }
        if (C10715c0.m40834c(objM40813c)) {
            m34832Z();
            m34807I0(id2, startFrom);
            m34790w0(this, 0L, 1, null);
            return null;
        }
        C8678m<E> c8678m = (C8678m) C10715c0.m40833b(objM40813c);
        if (c8678m.id <= id2) {
            return c8678m;
        }
        long j10 = c8678m.id;
        int i10 = C8671f.f31689b;
        if (f31661f.compareAndSet(this, currentBufferEndCounter + 1, j10 * ((long) i10))) {
            m34868v0((c8678m.id * ((long) i10)) - currentBufferEndCounter);
        } else {
            m34790w0(this, 0L, 1, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: c1 */
    public final Object m34838c1(C8678m<E> c8678m, int i10, long j10, InterfaceC9557b<? super E> interfaceC9557b) {
        C8678m c8678m2;
        C7905p c7905pM32900b = C7913r.m32900b(C10046b.m38803c(interfaceC9557b));
        try {
            Object objM34860q1 = m34860q1(c8678m, i10, j10, c7905pM32900b);
            if (objM34860q1 != C8671f.f31700m) {
                InterfaceC6571g interfaceC6571gM34813O = null;
                interfaceC6571gM34813O = null;
                if (objM34860q1 == C8671f.f31702o) {
                    if (j10 < m34862s0()) {
                        c8678m.m40822c();
                    }
                    C8678m c8678m3 = (C8678m) m34777m0().get(this);
                    while (true) {
                        if (mo34846h()) {
                            m34812N0(c7905pM32900b);
                            break;
                        }
                        long andIncrement = m34779n0().getAndIncrement(this);
                        int i11 = C8671f.f31689b;
                        long j11 = andIncrement / ((long) i11);
                        int i12 = (int) (andIncrement % ((long) i11));
                        if (c8678m3.id != j11) {
                            C8678m c8678mM34839d0 = m34839d0(j11, c8678m3);
                            if (c8678mM34839d0 != null) {
                                c8678m2 = c8678mM34839d0;
                            }
                        } else {
                            c8678m2 = c8678m3;
                        }
                        objM34860q1 = m34860q1(c8678m2, i12, andIncrement, c7905pM32900b);
                        C8678m c8678m4 = c8678m2;
                        if (objM34860q1 == C8671f.f31700m) {
                            C7905p c7905p = c7905pM32900b != null ? c7905pM32900b : null;
                            if (c7905p == null) {
                                break;
                            }
                            m34825V0(c7905p, c8678m4, i12);
                            break;
                        }
                        if (objM34860q1 == C8671f.f31702o) {
                            if (andIncrement < m34862s0()) {
                                c8678m4.m40822c();
                            }
                            c8678m3 = c8678m4;
                        } else {
                            if (objM34860q1 == C8671f.f31701n) {
                                throw new IllegalStateException("unexpected");
                            }
                            c8678m4.m40822c();
                            Function1<E, Unit> function1 = this.onUndeliveredElement;
                            if (function1 != null) {
                                interfaceC6571gM34813O = m34813O(function1);
                            }
                        }
                    }
                } else {
                    c8678m.m40822c();
                    Function1<E, Unit> function2 = this.onUndeliveredElement;
                    if (function2 != null) {
                        interfaceC6571gM34813O = m34813O(function2);
                    }
                }
                c7905pM32900b.mo32814k(objM34860q1, (InterfaceC14057n) interfaceC6571gM34813O);
                break;
            }
            m34825V0(c7905pM32900b, c8678m, i10);
            Object objM32857A = c7905pM32900b.m32857A();
            if (objM32857A == C10047c.m38805e()) {
                C10346h.m39673c(interfaceC9557b);
            }
            return objM32857A;
        } catch (Throwable th2) {
            c7905pM32900b.m32867Q();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final C8678m<E> m34839d0(long id2, C8678m<E> startFrom) {
        Object objM40813c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31664i;
        Function2 function2 = (Function2) C8671f.m34919y();
        loop0: while (true) {
            objM40813c = C10712b.m40813c(startFrom, id2, function2);
            if (!C10715c0.m40834c(objM40813c)) {
                AbstractC10713b0 abstractC10713b0M40833b = C10715c0.m40833b(objM40813c);
                while (true) {
                    AbstractC10713b0 abstractC10713b0 = (AbstractC10713b0) atomicReferenceFieldUpdater.get(this);
                    if (abstractC10713b0.id >= abstractC10713b0M40833b.id) {
                        break loop0;
                    }
                    if (!abstractC10713b0M40833b.m40818u()) {
                        break;
                    }
                    if (C12996b.m48310a(atomicReferenceFieldUpdater, this, abstractC10713b0, abstractC10713b0M40833b)) {
                        if (!abstractC10713b0.m40816p()) {
                            break loop0;
                        }
                        abstractC10713b0.m40830n();
                        break loop0;
                    }
                    if (abstractC10713b0M40833b.m40816p()) {
                        abstractC10713b0M40833b.m40830n();
                    }
                }
            } else {
                break;
            }
        }
        if (C10715c0.m40834c(objM40813c)) {
            m34832Z();
            if (startFrom.id * ((long) C8671f.f31689b) < m34862s0()) {
                startFrom.m40822c();
            }
            return null;
        }
        C8678m<E> c8678m = (C8678m) C10715c0.m40833b(objM40813c);
        if (!m34799D0() && id2 <= m34844g0() / ((long) C8671f.f31689b)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f31665j;
            while (true) {
                AbstractC10713b0 abstractC10713b1 = (AbstractC10713b0) atomicReferenceFieldUpdater2.get(this);
                if (abstractC10713b1.id >= c8678m.id || !c8678m.m40818u()) {
                    break;
                }
                if (C12996b.m48310a(atomicReferenceFieldUpdater2, this, abstractC10713b1, c8678m)) {
                    if (!abstractC10713b1.m40816p()) {
                        break;
                    }
                    abstractC10713b1.m40830n();
                    break;
                }
                if (c8678m.m40816p()) {
                    c8678m.m40830n();
                }
            }
        }
        long j10 = c8678m.id;
        if (j10 <= id2) {
            return c8678m;
        }
        int i10 = C8671f.f31689b;
        m34867u1(j10 * ((long) i10));
        if (c8678m.id * ((long) i10) < m34862s0()) {
            c8678m.m40822c();
        }
        return null;
    }

    /* JADX INFO: renamed from: d1 */
    public final void m34840d1(InterfaceC11760l<?> select, Object ignoredParam) {
        C8678m c8678m;
        C8678m c8678m2 = (C8678m) m34777m0().get(this);
        while (!mo34846h()) {
            long andIncrement = m34779n0().getAndIncrement(this);
            int i10 = C8671f.f31689b;
            long j10 = andIncrement / ((long) i10);
            int i11 = (int) (andIncrement % ((long) i10));
            if (c8678m2.id != j10) {
                C8678m c8678mM34839d0 = m34839d0(j10, c8678m2);
                if (c8678mM34839d0 == null) {
                    continue;
                } else {
                    c8678m = c8678mM34839d0;
                }
            } else {
                c8678m = c8678m2;
            }
            InterfaceC11760l<?> interfaceC11760l = select;
            Object objM34860q1 = m34860q1(c8678m, i11, andIncrement, interfaceC11760l);
            c8678m2 = c8678m;
            if (objM34860q1 == C8671f.f31700m) {
                InterfaceC7886k3 interfaceC7886k3 = interfaceC11760l instanceof InterfaceC7886k3 ? (InterfaceC7886k3) interfaceC11760l : null;
                if (interfaceC7886k3 != null) {
                    m34825V0(interfaceC7886k3, c8678m2, i11);
                    return;
                }
                return;
            }
            if (objM34860q1 != C8671f.f31702o) {
                if (objM34860q1 == C8671f.f31701n) {
                    throw new IllegalStateException("unexpected");
                }
                c8678m2.m40822c();
                interfaceC11760l.mo44010b(objM34860q1);
                return;
            }
            if (andIncrement < m34862s0()) {
                c8678m2.m40822c();
            }
            select = interfaceC11760l;
        }
        m34814O0(select);
    }

    /* JADX INFO: renamed from: e0 */
    public final C8678m<E> m34841e0(long id2, C8678m<E> startFrom) {
        Object objM40813c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31663h;
        Function2 function2 = (Function2) C8671f.m34919y();
        loop0: while (true) {
            objM40813c = C10712b.m40813c(startFrom, id2, function2);
            if (!C10715c0.m40834c(objM40813c)) {
                AbstractC10713b0 abstractC10713b0M40833b = C10715c0.m40833b(objM40813c);
                while (true) {
                    AbstractC10713b0 abstractC10713b0 = (AbstractC10713b0) atomicReferenceFieldUpdater.get(this);
                    if (abstractC10713b0.id >= abstractC10713b0M40833b.id) {
                        break loop0;
                    }
                    if (!abstractC10713b0M40833b.m40818u()) {
                        break;
                    }
                    if (C12996b.m48310a(atomicReferenceFieldUpdater, this, abstractC10713b0, abstractC10713b0M40833b)) {
                        if (!abstractC10713b0.m40816p()) {
                            break loop0;
                        }
                        abstractC10713b0.m40830n();
                        break loop0;
                    }
                    if (abstractC10713b0M40833b.m40816p()) {
                        abstractC10713b0M40833b.m40830n();
                    }
                }
            } else {
                break;
            }
        }
        if (C10715c0.m40834c(objM40813c)) {
            m34832Z();
            if (startFrom.id * ((long) C8671f.f31689b) < m34856o0()) {
                startFrom.m40822c();
            }
            return null;
        }
        C8678m<E> c8678m = (C8678m) C10715c0.m40833b(objM40813c);
        long j10 = c8678m.id;
        if (j10 <= id2) {
            return c8678m;
        }
        int i10 = C8671f.f31689b;
        m34869v1(j10 * ((long) i10));
        if (c8678m.id * ((long) i10) < m34856o0()) {
            c8678m.m40822c();
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v2, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e1 */
    public final void m34842e1(C8678m<E> lastSegment) {
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        C10747s0 c10747s0M40956b = null;
        Object objM40872b = C10730k.m40872b(null, 1, null);
        loop0: do {
            for (int i10 = C8671f.f31689b - 1; -1 < i10; i10--) {
                long j10 = (lastSegment.id * ((long) C8671f.f31689b)) + ((long) i10);
                while (true) {
                    Object objM34944B = lastSegment.m34944B(i10);
                    if (objM34944B == C8671f.f31696i) {
                        break loop0;
                    }
                    if (objM34944B != C8671f.f31691d) {
                        if (objM34944B != C8671f.f31692e && objM34944B != null) {
                            if (!(objM34944B instanceof InterfaceC7886k3) && !(objM34944B instanceof WaiterEB)) {
                                if (objM34944B != C8671f.f31694g && objM34944B != C8671f.f31693f) {
                                    if (objM34944B != C8671f.f31694g) {
                                        break;
                                    }
                                } else {
                                    break loop0;
                                }
                            } else {
                                if (j10 < m34856o0()) {
                                    break loop0;
                                }
                                InterfaceC7886k3 interfaceC7886k3 = objM34944B instanceof WaiterEB ? ((WaiterEB) objM34944B).waiter : (InterfaceC7886k3) objM34944B;
                                if (lastSegment.m34952v(i10, objM34944B, C8671f.m34920z())) {
                                    if (function1 != null) {
                                        c10747s0M40956b = C10752x.m40956b(function1, lastSegment.m34943A(i10), c10747s0M40956b);
                                    }
                                    objM40872b = C10730k.m40873c(objM40872b, interfaceC7886k3);
                                    lastSegment.m34953w(i10);
                                    lastSegment.m40817t();
                                    break;
                                }
                            }
                        } else {
                            if (lastSegment.m34952v(i10, objM34944B, C8671f.m34920z())) {
                                lastSegment.m40817t();
                                break;
                            }
                        }
                    } else {
                        if (j10 < m34856o0()) {
                            break loop0;
                        }
                        if (lastSegment.m34952v(i10, objM34944B, C8671f.m34920z())) {
                            if (function1 != null) {
                                c10747s0M40956b = C10752x.m40956b(function1, lastSegment.m34943A(i10), c10747s0M40956b);
                            }
                            lastSegment.m34953w(i10);
                            lastSegment.m40817t();
                            break;
                        }
                    }
                }
            }
            lastSegment = (C8678m) lastSegment.m40827h();
        } while (lastSegment != null);
        if (objM40872b != null) {
            if (objM40872b instanceof ArrayList) {
                Intrinsics.m31981d(objM40872b, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
                ArrayList arrayList = (ArrayList) objM40872b;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    m34845g1((InterfaceC7886k3) arrayList.get(size));
                }
            } else {
                m34845g1((InterfaceC7886k3) objM40872b);
            }
        }
        if (c10747s0M40956b != null) {
            throw c10747s0M40956b;
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final void m34843f1(InterfaceC7886k3 interfaceC7886k3) {
        m34847h1(interfaceC7886k3, true);
    }

    /* JADX INFO: renamed from: g0 */
    public final long m34844g0() {
        return f31661f.get(this);
    }

    /* JADX INFO: renamed from: g1 */
    public final void m34845g1(InterfaceC7886k3 interfaceC7886k3) {
        m34847h1(interfaceC7886k3, false);
    }

    @Override // mu.InterfaceC8689x
    /* JADX INFO: renamed from: h */
    public boolean mo34846h() {
        return m34794A0(f31659d.get(this));
    }

    /* JADX INFO: renamed from: h1 */
    public final void m34847h1(InterfaceC7886k3 interfaceC7886k3, boolean z10) {
        if (interfaceC7886k3 instanceof b) {
            InterfaceC7897n<Boolean> interfaceC7897nM34885a = ((b) interfaceC7886k3).m34885a();
            C7347n.Companion companion = C7347n.INSTANCE;
            interfaceC7897nM34885a.resumeWith(C7347n.m30460b(Boolean.FALSE));
            return;
        }
        if (interfaceC7886k3 instanceof InterfaceC7897n) {
            InterfaceC9557b interfaceC9557b = (InterfaceC9557b) interfaceC7886k3;
            C7347n.Companion companion2 = C7347n.INSTANCE;
            interfaceC9557b.resumeWith(C7347n.m30460b(C7348o.m30469a(z10 ? m34852l0() : m34858p0())));
        } else if (interfaceC7886k3 instanceof C8688w) {
            C7905p<C8676k<? extends E>> c7905p = ((C8688w) interfaceC7886k3).cont;
            C7347n.Companion companion3 = C7347n.INSTANCE;
            c7905p.resumeWith(C7347n.m30460b(C8676k.m34929b(C8676k.INSTANCE.m34939a(m34849i0()))));
        } else if (interfaceC7886k3 instanceof a) {
            ((a) interfaceC7886k3).m34884j();
        } else {
            if (interfaceC7886k3 instanceof InterfaceC11760l) {
                ((InterfaceC11760l) interfaceC7886k3).mo44011f(this, C8671f.m34920z());
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + interfaceC7886k3).toString());
        }
    }

    @Override // mu.InterfaceC8690y
    @Nullable
    /* JADX INFO: renamed from: i */
    public Object mo34848i(E e10, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        return m34770i1(this, e10, interfaceC9557b);
    }

    @Nullable
    /* JADX INFO: renamed from: i0 */
    public final Throwable m34849i0() {
        return (Throwable) f31666k.get(this);
    }

    @Override // mu.InterfaceC8689x
    @NotNull
    public InterfaceC8674i<E> iterator() {
        return new a();
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x00fe  */
    /* JADX INFO: renamed from: j1 */
    public final Object m34850j1(C8678m<E> c8678m, int i10, E e10, long j10, InterfaceC9557b<? super Unit> interfaceC9557b) {
        Unit unit;
        Object objM32857A;
        C8678m c8678mM34841e0;
        C7905p c7905pM32900b = C7913r.m32900b(C10046b.m38803c(interfaceC9557b));
        try {
            int iM34863s1 = m34863s1(c8678m, i10, e10, j10, c7905pM32900b, false);
            if (iM34863s1 == 0) {
                c8678m.m40822c();
                C7347n.Companion companion = C7347n.INSTANCE;
                unit = Unit.f29331a;
            } else {
                if (iM34863s1 != 1) {
                    if (iM34863s1 != 2) {
                        if (iM34863s1 != 4) {
                            String str = "unexpected";
                            if (iM34863s1 != 5) {
                                throw new IllegalStateException("unexpected");
                            }
                            c8678m.m40822c();
                            C8678m c8678m2 = (C8678m) m34783q0().get(this);
                            while (true) {
                                long andIncrement = m34785r0().getAndIncrement(this);
                                long j11 = 1152921504606846975L & andIncrement;
                                boolean zM34795B0 = m34795B0(andIncrement);
                                int i11 = C8671f.f31689b;
                                long j12 = j11 / ((long) i11);
                                int i12 = (int) (j11 % ((long) i11));
                                str = str;
                                if (c8678m2.id != j12) {
                                    c8678mM34841e0 = m34841e0(j12, c8678m2);
                                    if (c8678mM34841e0 == null) {
                                        if (zM34795B0) {
                                        }
                                    }
                                } else {
                                    c8678mM34841e0 = c8678m2;
                                }
                                int iM34863s2 = m34863s1(c8678mM34841e0, i12, e10, j11, c7905pM32900b, zM34795B0);
                                if (iM34863s2 == 0) {
                                    c8678mM34841e0.m40822c();
                                    C7347n.Companion companion2 = C7347n.INSTANCE;
                                    unit = Unit.f29331a;
                                } else if (iM34863s2 == 1) {
                                    C7347n.Companion companion3 = C7347n.INSTANCE;
                                    unit = Unit.f29331a;
                                } else if (iM34863s2 == 2) {
                                    if (!zM34795B0) {
                                        C7905p c7905p = c7905pM32900b != null ? c7905pM32900b : null;
                                        if (c7905p == null) {
                                            break;
                                        }
                                        m34827W0(c7905p, c8678mM34841e0, i12);
                                        break;
                                    }
                                    c8678mM34841e0.m40817t();
                                } else {
                                    if (iM34863s2 == 3) {
                                        throw new IllegalStateException(str);
                                    }
                                    if (iM34863s2 != 4) {
                                        if (iM34863s2 == 5) {
                                            c8678mM34841e0.m40822c();
                                        }
                                        c8678m2 = c8678mM34841e0;
                                    } else if (j11 < m34856o0()) {
                                        c8678mM34841e0.m40822c();
                                    }
                                }
                            }
                        } else if (j10 < m34856o0()) {
                            c8678m.m40822c();
                        }
                        m34817Q0(e10, c7905pM32900b);
                        break;
                    } else {
                        m34827W0(c7905pM32900b, c8678m, i10);
                    }
                    objM32857A = c7905pM32900b.m32857A();
                    if (objM32857A == C10047c.m38805e()) {
                        C10346h.m39673c(interfaceC9557b);
                    }
                    if (objM32857A == C10047c.m38805e()) {
                        return objM32857A;
                    }
                    return Unit.f29331a;
                }
                C7347n.Companion companion4 = C7347n.INSTANCE;
                unit = Unit.f29331a;
            }
            c7905pM32900b.resumeWith(C7347n.m30460b(unit));
            objM32857A = c7905pM32900b.m32857A();
            if (objM32857A == C10047c.m38805e()) {
                C10346h.m39673c(interfaceC9557b);
            }
            if (objM32857A == C10047c.m38805e()) {
                return objM32857A;
            }
            return Unit.f29331a;
        } catch (Throwable th2) {
            c7905pM32900b.m32867Q();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: k1 */
    public final boolean m34851k1(long curSendersAndCloseStatus) {
        if (m34795B0(curSendersAndCloseStatus)) {
            return false;
        }
        return !m34820S(curSendersAndCloseStatus & 1152921504606846975L);
    }

    /* JADX INFO: renamed from: l0 */
    public final Throwable m34852l0() {
        Throwable thM34849i0 = m34849i0();
        return thM34849i0 == null ? new C8682q("Channel was closed") : thM34849i0;
    }

    /* JADX INFO: renamed from: l1 */
    public final boolean m34853l1(Object obj, E e10) {
        if (obj instanceof InterfaceC11760l) {
            return ((InterfaceC11760l) obj).mo44011f(this, e10);
        }
        if (obj instanceof C8688w) {
            Intrinsics.m31981d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            C7905p<C8676k<? extends E>> c7905p = ((C8688w) obj).cont;
            C8676k c8676kM34929b = C8676k.m34929b(C8676k.INSTANCE.m34941c(e10));
            Function1<E, Unit> function1 = this.onUndeliveredElement;
            return C8671f.m34893B(c7905p, c8676kM34929b, (InterfaceC14057n) (function1 != null ? m34818R(function1) : null));
        }
        if (obj instanceof a) {
            Intrinsics.m31981d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).m34883i(e10);
        }
        if (obj instanceof InterfaceC7897n) {
            Intrinsics.m31981d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC7897n interfaceC7897n = (InterfaceC7897n) obj;
            Function1<E, Unit> function2 = this.onUndeliveredElement;
            return C8671f.m34893B(interfaceC7897n, e10, (InterfaceC14057n) (function2 != null ? m34813O(function2) : null));
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    /* JADX INFO: renamed from: m1 */
    public final boolean m34854m1(Object obj, C8678m<E> c8678m, int i10) {
        if (obj instanceof InterfaceC7897n) {
            Intrinsics.m31981d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return C8671f.m34894C((InterfaceC7897n) obj, Unit.f29331a, null, 2, null);
        }
        if (obj instanceof InterfaceC11760l) {
            Intrinsics.m31981d(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            EnumC11763o enumC11763oM44021x = ((C11759k) obj).m44021x(this, Unit.f29331a);
            if (enumC11763oM44021x == EnumC11763o.REREGISTER) {
                c8678m.m34953w(i10);
            }
            return enumC11763oM44021x == EnumC11763o.SUCCESSFUL;
        }
        if (obj instanceof b) {
            return C8671f.m34894C(((b) obj).m34885a(), Boolean.TRUE, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    @NotNull
    /* JADX INFO: renamed from: n1 */
    public final Object m34855n1(E element) {
        C8678m c8678mM34841e0;
        Object obj = C8671f.f31691d;
        C8678m c8678m = (C8678m) m34783q0().get(this);
        while (true) {
            long andIncrement = m34785r0().getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zM34795B0 = m34795B0(andIncrement);
            int i10 = C8671f.f31689b;
            long j11 = j10 / ((long) i10);
            int i11 = (int) (j10 % ((long) i10));
            if (c8678m.id != j11) {
                c8678mM34841e0 = m34841e0(j11, c8678m);
                if (c8678mM34841e0 == null) {
                    if (zM34795B0) {
                        return C8676k.INSTANCE.m34939a(m34858p0());
                    }
                }
            } else {
                c8678mM34841e0 = c8678m;
            }
            E e10 = element;
            int iM34863s1 = m34863s1(c8678mM34841e0, i11, e10, j10, obj, zM34795B0);
            c8678m = c8678mM34841e0;
            if (iM34863s1 == 0) {
                c8678m.m40822c();
                return C8676k.INSTANCE.m34941c(Unit.f29331a);
            }
            if (iM34863s1 == 1) {
                return C8676k.INSTANCE.m34941c(Unit.f29331a);
            }
            if (iM34863s1 == 2) {
                if (zM34795B0) {
                    c8678m.m40817t();
                    return C8676k.INSTANCE.m34939a(m34858p0());
                }
                InterfaceC7886k3 interfaceC7886k3 = obj instanceof InterfaceC7886k3 ? (InterfaceC7886k3) obj : null;
                if (interfaceC7886k3 != null) {
                    m34827W0(interfaceC7886k3, c8678m, i11);
                }
                m34833a0((c8678m.id * ((long) i10)) + ((long) i11));
                return C8676k.INSTANCE.m34941c(Unit.f29331a);
            }
            if (iM34863s1 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iM34863s1 == 4) {
                if (j10 < m34856o0()) {
                    c8678m.m40822c();
                }
                return C8676k.INSTANCE.m34939a(m34858p0());
            }
            if (iM34863s1 == 5) {
                c8678m.m40822c();
            }
            element = e10;
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final long m34856o0() {
        return f31660e.get(this);
    }

    /* JADX INFO: renamed from: o1 */
    public final boolean m34857o1(C8678m<E> segment, int index, long b10) {
        Object objM34944B = segment.m34944B(index);
        if (!(objM34944B instanceof InterfaceC7886k3) || b10 < f31660e.get(this) || !segment.m34952v(index, objM34944B, C8671f.f31694g)) {
            return m34859p1(segment, index, b10);
        }
        if (m34854m1(objM34944B, segment, index)) {
            segment.m34948F(index, C8671f.f31691d);
            return true;
        }
        segment.m34948F(index, C8671f.f31697j);
        segment.m34945C(index, false);
        return false;
    }

    @Override // mu.InterfaceC8690y
    public boolean offer(E e10) {
        return InterfaceC8672g.a.m34922a(this, e10);
    }

    @NotNull
    /* JADX INFO: renamed from: p0 */
    public final Throwable m34858p0() {
        Throwable thM34849i0 = m34849i0();
        return thM34849i0 == null ? new C8683r("Channel was closed") : thM34849i0;
    }

    /* JADX INFO: renamed from: p1 */
    public final boolean m34859p1(C8678m<E> segment, int index, long b10) {
        while (true) {
            Object objM34944B = segment.m34944B(index);
            if (objM34944B instanceof InterfaceC7886k3) {
                if (b10 < f31660e.get(this)) {
                    if (segment.m34952v(index, objM34944B, new WaiterEB((InterfaceC7886k3) objM34944B))) {
                        return true;
                    }
                } else if (segment.m34952v(index, objM34944B, C8671f.f31694g)) {
                    if (m34854m1(objM34944B, segment, index)) {
                        segment.m34948F(index, C8671f.f31691d);
                        return true;
                    }
                    segment.m34948F(index, C8671f.f31697j);
                    segment.m34945C(index, false);
                    return false;
                }
            } else {
                if (objM34944B == C8671f.f31697j) {
                    return false;
                }
                if (objM34944B == null) {
                    if (segment.m34952v(index, objM34944B, C8671f.f31692e)) {
                        return true;
                    }
                } else {
                    if (objM34944B == C8671f.f31691d || objM34944B == C8671f.f31695h || objM34944B == C8671f.f31696i || objM34944B == C8671f.f31698k || objM34944B == C8671f.m34920z()) {
                        return true;
                    }
                    if (objM34944B != C8671f.f31693f) {
                        throw new IllegalStateException(("Unexpected cell state: " + objM34944B).toString());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: q1 */
    public final Object m34860q1(C8678m<E> segment, int index, long r8, Object waiter) {
        Object objM34944B = segment.m34944B(index);
        if (objM34944B == null) {
            if (r8 >= (f31659d.get(this) & 1152921504606846975L)) {
                if (waiter == null) {
                    return C8671f.f31701n;
                }
                if (segment.m34952v(index, objM34944B, waiter)) {
                    m34834b0();
                    return C8671f.f31700m;
                }
            }
        } else if (objM34944B == C8671f.f31691d && segment.m34952v(index, objM34944B, C8671f.f31696i)) {
            m34834b0();
            return segment.m34946D(index);
        }
        return m34861r1(segment, index, r8, waiter);
    }

    /* JADX INFO: renamed from: r1 */
    public final Object m34861r1(C8678m<E> segment, int index, long r8, Object waiter) {
        while (true) {
            Object objM34944B = segment.m34944B(index);
            if (objM34944B == null || objM34944B == C8671f.f31692e) {
                if (r8 < (f31659d.get(this) & 1152921504606846975L)) {
                    if (segment.m34952v(index, objM34944B, C8671f.f31695h)) {
                        m34834b0();
                        return C8671f.f31702o;
                    }
                } else {
                    if (waiter == null) {
                        return C8671f.f31701n;
                    }
                    if (segment.m34952v(index, objM34944B, waiter)) {
                        m34834b0();
                        return C8671f.f31700m;
                    }
                }
            } else {
                if (objM34944B != C8671f.f31691d) {
                    if (objM34944B != C8671f.f31697j && objM34944B != C8671f.f31695h) {
                        if (objM34944B == C8671f.m34920z()) {
                            m34834b0();
                            return C8671f.f31702o;
                        }
                        if (objM34944B != C8671f.f31694g && segment.m34952v(index, objM34944B, C8671f.f31693f)) {
                            boolean z10 = objM34944B instanceof WaiterEB;
                            if (z10) {
                                objM34944B = ((WaiterEB) objM34944B).waiter;
                            }
                            if (m34854m1(objM34944B, segment, index)) {
                                segment.m34948F(index, C8671f.f31696i);
                                m34834b0();
                                return segment.m34946D(index);
                            }
                            segment.m34948F(index, C8671f.f31697j);
                            segment.m34945C(index, false);
                            if (z10) {
                                m34834b0();
                            }
                            return C8671f.f31702o;
                        }
                    }
                    return C8671f.f31702o;
                }
                if (segment.m34952v(index, objM34944B, C8671f.f31696i)) {
                    m34834b0();
                    return segment.m34946D(index);
                }
            }
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final long m34862s0() {
        return f31659d.get(this) & 1152921504606846975L;
    }

    /* JADX INFO: renamed from: s1 */
    public final int m34863s1(C8678m<E> segment, int index, E element, long s8, Object waiter, boolean closed) {
        segment.m34949G(index, element);
        if (closed) {
            return m34865t1(segment, index, element, s8, waiter, closed);
        }
        Object objM34944B = segment.m34944B(index);
        if (objM34944B == null) {
            if (m34820S(s8)) {
                if (segment.m34952v(index, null, C8671f.f31691d)) {
                    return 1;
                }
            } else {
                if (waiter == null) {
                    return 3;
                }
                if (segment.m34952v(index, null, waiter)) {
                    return 2;
                }
            }
        } else if (objM34944B instanceof InterfaceC7886k3) {
            segment.m34953w(index);
            if (m34853l1(objM34944B, element)) {
                segment.m34948F(index, C8671f.f31696i);
                m34819R0();
                return 0;
            }
            if (segment.m34954x(index, C8671f.f31698k) == C8671f.f31698k) {
                return 5;
            }
            segment.m34945C(index, true);
            return 5;
        }
        return m34865t1(segment, index, element, s8, waiter, closed);
    }

    @Override // mu.InterfaceC8690y
    /* JADX INFO: renamed from: t */
    public void mo34864t(@NotNull Function1<? super Throwable, Unit> handler) {
        if (C12996b.m48310a(f31667l, this, null, handler)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31667l;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != C8671f.f31704q) {
                if (obj == C8671f.f31705r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        } while (!C12996b.m48310a(f31667l, this, C8671f.f31704q, C8671f.f31705r));
        handler.invoke(m34849i0());
    }

    /* JADX INFO: renamed from: t1 */
    public final int m34865t1(C8678m<E> segment, int index, E element, long s8, Object waiter, boolean closed) {
        while (true) {
            Object objM34944B = segment.m34944B(index);
            if (objM34944B == null) {
                if (!m34820S(s8) || closed) {
                    if (closed) {
                        if (segment.m34952v(index, null, C8671f.f31697j)) {
                            segment.m34945C(index, false);
                            return 4;
                        }
                    } else {
                        if (waiter == null) {
                            return 3;
                        }
                        if (segment.m34952v(index, null, waiter)) {
                            return 2;
                        }
                    }
                } else if (segment.m34952v(index, null, C8671f.f31691d)) {
                    return 1;
                }
            } else {
                if (objM34944B != C8671f.f31692e) {
                    if (objM34944B == C8671f.f31698k) {
                        segment.m34953w(index);
                        return 5;
                    }
                    if (objM34944B == C8671f.f31695h) {
                        segment.m34953w(index);
                        return 5;
                    }
                    if (objM34944B == C8671f.m34920z()) {
                        segment.m34953w(index);
                        m34832Z();
                        return 4;
                    }
                    segment.m34953w(index);
                    if (objM34944B instanceof WaiterEB) {
                        objM34944B = ((WaiterEB) objM34944B).waiter;
                    }
                    if (m34853l1(objM34944B, element)) {
                        segment.m34948F(index, C8671f.f31696i);
                        m34819R0();
                        return 0;
                    }
                    if (segment.m34954x(index, C8671f.f31698k) != C8671f.f31698k) {
                        segment.m34945C(index, true);
                    }
                    return 5;
                }
                if (segment.m34952v(index, objM34944B, C8671f.f31691d)) {
                    return 1;
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v14, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: mu.m[] */
    /* JADX DEBUG: Multi-variable search result rejected for r3v7, resolved type: java.util.ArrayList */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public String toString() {
        String string;
        StringBuilder sb2 = new StringBuilder();
        int i10 = (int) (f31659d.get(this) >> 60);
        if (i10 == 2) {
            sb2.append("closed,");
        } else if (i10 == 3) {
            sb2.append("cancelled,");
        }
        sb2.append("capacity=" + this.capacity + ',');
        sb2.append("data=[");
        int i11 = 0;
        boolean z10 = true;
        List listM31895n = C7699p.m31895n(f31664i.get(this), f31663h.get(this), f31665j.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM31895n) {
            if (((C8678m) obj) != C8671f.f31688a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j10 = ((C8678m) next).id;
            do {
                Object next2 = it.next();
                long j11 = ((C8678m) next2).id;
                if (j10 > j11) {
                    next = next2;
                    j10 = j11;
                }
            } while (it.hasNext());
        }
        C8678m c8678m = (C8678m) next;
        long jM34856o0 = m34856o0();
        long jM34862s0 = m34862s0();
        loop2: while (true) {
            int i12 = C8671f.f31689b;
            int i13 = i11;
            while (i13 < i12) {
                long j12 = (c8678m.id * ((long) C8671f.f31689b)) + ((long) i13);
                if (j12 >= jM34862s0 && j12 >= jM34856o0) {
                    break loop2;
                }
                Object objM34944B = c8678m.m34944B(i13);
                Object objM34943A = c8678m.m34943A(i13);
                boolean z11 = z10;
                if (objM34944B instanceof InterfaceC7897n) {
                    string = (j12 >= jM34856o0 || j12 < jM34862s0) ? (j12 >= jM34862s0 || j12 < jM34856o0) ? "cont" : "send" : "receive";
                } else if (objM34944B instanceof InterfaceC11760l) {
                    string = (j12 >= jM34856o0 || j12 < jM34862s0) ? (j12 >= jM34862s0 || j12 < jM34856o0) ? "select" : "onSend" : "onReceive";
                } else if (objM34944B instanceof C8688w) {
                    string = "receiveCatching";
                } else if (objM34944B instanceof b) {
                    string = "sendBroadcast";
                } else if (objM34944B instanceof WaiterEB) {
                    string = "EB(" + objM34944B + ')';
                } else if (Intrinsics.m31980c(objM34944B, C8671f.f31693f) || Intrinsics.m31980c(objM34944B, C8671f.f31694g)) {
                    string = "resuming_sender";
                } else {
                    if (objM34944B != null && !Intrinsics.m31980c(objM34944B, C8671f.f31692e) && !Intrinsics.m31980c(objM34944B, C8671f.f31696i) && !Intrinsics.m31980c(objM34944B, C8671f.f31695h) && !Intrinsics.m31980c(objM34944B, C8671f.f31698k) && !Intrinsics.m31980c(objM34944B, C8671f.f31697j) && !Intrinsics.m31980c(objM34944B, C8671f.m34920z())) {
                        string = objM34944B.toString();
                    }
                    i13++;
                    z10 = z11;
                }
                if (objM34943A != null) {
                    sb2.append('(' + string + ',' + objM34943A + "),");
                } else {
                    sb2.append(string + ',');
                }
                i13++;
                z10 = z11;
            }
            boolean z12 = z10;
            c8678m = (C8678m) c8678m.m40825f();
            if (c8678m == null) {
                break;
            }
            z10 = z12;
            i11 = 0;
        }
        if (C7776c0.m32216y1(sb2) == ',') {
            Intrinsics.checkNotNullExpressionValue(sb2.deleteCharAt(sb2.length() - 1), "deleteCharAt(...)");
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: u0 */
    public final boolean m34866u0() {
        while (true) {
            C8678m<E> c8678mM34839d0 = (C8678m) f31664i.get(this);
            long jM34856o0 = m34856o0();
            if (m34862s0() <= jM34856o0) {
                return false;
            }
            int i10 = C8671f.f31689b;
            long j10 = jM34856o0 / ((long) i10);
            if (c8678mM34839d0.id == j10 || (c8678mM34839d0 = m34839d0(j10, c8678mM34839d0)) != null) {
                c8678mM34839d0.m40822c();
                if (m34873y0(c8678mM34839d0, (int) (jM34856o0 % ((long) i10)), jM34856o0)) {
                    return true;
                }
                f31660e.compareAndSet(this, jM34856o0, 1 + jM34856o0);
            } else if (((C8678m) f31664i.get(this)).id < j10) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: u1 */
    public final void m34867u1(long value) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f31660e;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if (j10 >= value) {
                return;
            }
            long j11 = value;
            if (f31660e.compareAndSet(this, j10, j11)) {
                return;
            } else {
                value = j11;
            }
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m34868v0(long nAttempts) {
        if ((f31662g.addAndGet(this, nAttempts) & 4611686018427387904L) != 0) {
            while ((f31662g.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX INFO: renamed from: v1 */
    public final void m34869v1(long value) {
        long j10;
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f31659d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            j11 = 1152921504606846975L & j10;
            if (j11 >= value) {
                return;
            }
        } while (!f31659d.compareAndSet(this, j10, C8671f.m34917w(j11, (int) (j10 >> 60))));
    }

    @Override // mu.InterfaceC8690y
    @NotNull
    /* JADX INFO: renamed from: w */
    public Object mo34870w(E element) {
        C8678m c8678m;
        if (m34851k1(f31659d.get(this))) {
            return C8676k.INSTANCE.m34940b();
        }
        Object obj = C8671f.f31697j;
        C8678m c8678m2 = (C8678m) m34783q0().get(this);
        while (true) {
            long andIncrement = m34785r0().getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zM34795B0 = m34795B0(andIncrement);
            int i10 = C8671f.f31689b;
            long j11 = j10 / ((long) i10);
            int i11 = (int) (j10 % ((long) i10));
            if (c8678m2.id != j11) {
                C8678m c8678mM34841e0 = m34841e0(j11, c8678m2);
                if (c8678mM34841e0 != null) {
                    c8678m = c8678mM34841e0;
                } else if (zM34795B0) {
                    return C8676k.INSTANCE.m34939a(m34858p0());
                }
            } else {
                c8678m = c8678m2;
            }
            int iM34863s1 = m34863s1(c8678m, i11, element, j10, obj, zM34795B0);
            c8678m2 = c8678m;
            if (iM34863s1 == 0) {
                c8678m2.m40822c();
                return C8676k.INSTANCE.m34941c(Unit.f29331a);
            }
            if (iM34863s1 == 1) {
                return C8676k.INSTANCE.m34941c(Unit.f29331a);
            }
            if (iM34863s1 == 2) {
                if (zM34795B0) {
                    c8678m2.m40817t();
                    return C8676k.INSTANCE.m34939a(m34858p0());
                }
                InterfaceC7886k3 interfaceC7886k3 = obj instanceof InterfaceC7886k3 ? (InterfaceC7886k3) obj : null;
                if (interfaceC7886k3 != null) {
                    m34827W0(interfaceC7886k3, c8678m2, i11);
                }
                c8678m2.m40817t();
                return C8676k.INSTANCE.m34940b();
            }
            if (iM34863s1 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iM34863s1 == 4) {
                if (j10 < m34856o0()) {
                    c8678m2.m40822c();
                }
                return C8676k.INSTANCE.m34939a(m34858p0());
            }
            if (iM34863s1 == 5) {
                c8678m2.m40822c();
            }
            element = element;
        }
    }

    /* JADX INFO: renamed from: w1 */
    public final void m34871w1(long globalIndex) {
        C8670e<E> c8670e = this;
        if (c8670e.m34799D0()) {
            return;
        }
        while (c8670e.m34844g0() <= globalIndex) {
            c8670e = this;
        }
        int i10 = C8671f.f31690c;
        for (int i11 = 0; i11 < i10; i11++) {
            long jM34844g0 = c8670e.m34844g0();
            if (jM34844g0 == (4611686018427387903L & f31662g.get(c8670e)) && jM34844g0 == c8670e.m34844g0()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f31662g;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(c8670e);
            if (atomicLongFieldUpdater.compareAndSet(c8670e, j10, C8671f.m34916v(j10 & 4611686018427387903L, true))) {
                break;
            } else {
                c8670e = this;
            }
        }
        while (true) {
            long jM34844g1 = c8670e.m34844g0();
            long j11 = f31662g.get(c8670e);
            long j12 = j11 & 4611686018427387903L;
            boolean z10 = (4611686018427387904L & j11) != 0;
            if (jM34844g1 == j12 && jM34844g1 == c8670e.m34844g0()) {
                break;
            }
            if (z10) {
                c8670e = this;
            } else {
                c8670e = this;
                f31662g.compareAndSet(c8670e, j11, C8671f.m34916v(j12, true));
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f31662g;
        while (true) {
            long j13 = atomicLongFieldUpdater2.get(c8670e);
            boolean zCompareAndSet = atomicLongFieldUpdater2.compareAndSet(c8670e, j13, C8671f.m34916v(j13 & 4611686018427387903L, false));
            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
            if (zCompareAndSet) {
                return;
            }
            atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
            c8670e = this;
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m34872x0() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31667l;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!C12996b.m48310a(atomicReferenceFieldUpdater, this, obj, obj == null ? C8671f.f31704q : C8671f.f31705r));
        if (obj == null) {
            return;
        }
        ((Function1) obj).invoke(m34849i0());
    }

    /* JADX INFO: renamed from: y0 */
    public final boolean m34873y0(C8678m<E> segment, int index, long globalIndex) {
        Object objM34944B;
        do {
            objM34944B = segment.m34944B(index);
            if (objM34944B != null && objM34944B != C8671f.f31692e) {
                if (objM34944B == C8671f.f31691d) {
                    return true;
                }
                if (objM34944B == C8671f.f31697j || objM34944B == C8671f.m34920z() || objM34944B == C8671f.f31696i || objM34944B == C8671f.f31695h) {
                    return false;
                }
                if (objM34944B == C8671f.f31694g) {
                    return true;
                }
                return objM34944B != C8671f.f31693f && globalIndex == m34856o0();
            }
        } while (!segment.m34952v(index, objM34944B, C8671f.f31695h));
        m34834b0();
        return false;
    }

    @Override // mu.InterfaceC8689x
    @NotNull
    /* JADX INFO: renamed from: z */
    public InterfaceC11756h<E> mo34874z() {
        e eVar = e.f31674a;
        Intrinsics.m31981d(eVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        InterfaceC14057n interfaceC14057n = (InterfaceC14057n) C7739h0.m32040e(eVar, 3);
        f fVar = f.f31675a;
        Intrinsics.m31981d(fVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new C11757i(this, interfaceC14057n, (InterfaceC14057n) C7739h0.m32040e(fVar, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    /* JADX INFO: renamed from: z0 */
    public final boolean m34875z0(long sendersAndCloseStatusCur, boolean isClosedForReceive) {
        int i10 = (int) (sendersAndCloseStatusCur >> 60);
        if (i10 == 0 || i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            m34830Y(sendersAndCloseStatusCur & 1152921504606846975L);
            return (isClosedForReceive && m34866u0()) ? false : true;
        }
        if (i10 == 3) {
            m34828X(sendersAndCloseStatusCur & 1152921504606846975L);
            return true;
        }
        throw new IllegalStateException(("unexpected close status: " + i10).toString());
    }
}
