package p452tu;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7697o;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p256ku.C7905p;
import p256ku.C7913r;
import p256ku.InterfaceC7874i1;
import p256ku.InterfaceC7886k3;
import p256ku.InterfaceC7892m;
import p256ku.InterfaceC7897n;
import p315nt.InterfaceC9557b;
import p344ot.C10046b;
import p344ot.C10047c;
import p395qu.AbstractC10713b0;
import p563y1.C12996b;
import p615zt.InterfaceC14057n;
import pt.AbstractC10342d;
import pt.C10346h;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: tu.k */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004:\u0001>B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u000e\u0018\u00010\u0015R\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b\u0018\u0010\nJ!\u0010\u001a\u001a\u00020\f2\u0010\u0010\u0019\u001a\f0\u0015R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00028\u0000H\u0091@¢\u0006\u0004\b\u001c\u0010\nJ2\u0010!\u001a\u00020\f*\u00020\u001d2\u001c\u0010 \u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001eH\u0096\u0002¢\u0006\u0004\b!\u0010\"JD\u0010&\u001a\u00020\f\"\u0004\b\u0001\u0010#*\b\u0012\u0004\u0012\u00028\u00010$2\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u00040%H\u0096\u0002¢\u0006\u0004\b&\u0010'J'\u0010*\u001a\u00020\f*\f0\u0015R\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010)\u001a\u00020(H\u0001¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J#\u00103\u001a\u00020\f2\n\u00101\u001a\u0006\u0012\u0002\b\u0003002\u0006\u00102\u001a\u00020\u0012H\u0016¢\u0006\u0004\b3\u00104J\u0019\u00105\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b5\u0010\u000eJ!\u00107\u001a\u00020(2\u0006\u0010\u000b\u001a\u00020\u00042\b\u00106\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b7\u00108J\u001f\u0010:\u001a\u0002092\u0006\u0010\u000b\u001a\u00020\u00042\b\u00106\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b:\u0010;J\u0019\u0010>\u001a\u00020\f2\b\u0010=\u001a\u0004\u0018\u00010<H\u0016¢\u0006\u0004\b>\u0010?R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010@\u001a\u0004\bA\u0010BR(\u0010E\u001a\u0014\u0012\u000e\u0012\f0\u0015R\b\u0012\u0004\u0012\u00028\u00000\u0000\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010DR\u0018\u0010G\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010FR\u0016\u0010I\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010HR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010FR\u0014\u0010L\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0011\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00040M8\u0002X\u0082\u0004¨\u0006O"}, m31665d2 = {"Ltu/k;", "R", "Lku/m;", "Ltu/d;", "", "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "q", "(Lnt/b;)Ljava/lang/Object;", "clauseObject", "", "k", "(Ljava/lang/Object;)V", "z", "w", "internalResult", "", "y", "(Ljava/lang/Object;Ljava/lang/Object;)I", "Ltu/k$a;", "r", "(Ljava/lang/Object;)Ltu/k$a;", "m", "selectedClause", "l", "(Ltu/k$a;)V", "o", "Ltu/f;", "Lkotlin/Function1;", "Lnt/b;", "block", "d", "(Ltu/f;Lkotlin/jvm/functions/Function1;)V", "Q", "Ltu/h;", "Lkotlin/Function2;", "c", "(Ltu/h;Lkotlin/jvm/functions/Function2;)V", "", "reregister", "u", "(Ltu/k$a;Z)V", "Lku/i1;", "disposableHandle", "n", "(Lku/i1;)V", "Lqu/b0;", "segment", "index", "e", "(Lqu/b0;I)V", "b", "result", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Ltu/o;", "x", "(Ljava/lang/Object;Ljava/lang/Object;)Ltu/o;", "", "cause", "a", "(Ljava/lang/Throwable;)V", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "", "Ljava/util/List;", "clauses", "Ljava/lang/Object;", "disposableHandleOrSegment", "I", "indexInSegment", "t", "()Z", "isSelected", "Lkotlinx/atomicfu/AtomicRef;", "state", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public class C11759k<R> implements InterfaceC7892m, InterfaceC11752d<R>, InterfaceC11760l, InterfaceC7886k3 {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f41436f = AtomicReferenceFieldUpdater.newUpdater(C11759k.class, Object.class, "state$volatile");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final CoroutineContext context;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public Object disposableHandleOrSegment;
    private volatile /* synthetic */ Object state$volatile = C11761m.f41456b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public List<C11759k<R>.a> clauses = new ArrayList(2);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int indexInSegment = -1;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public Object internalResult = C11761m.f41459e;

    /* JADX INFO: renamed from: tu.k$a */
    @Metadata(m31664d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B¿\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012(\u0010\u0007\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006\u0012(\u0010\t\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000b\u001a\u00020\u0001\u0012H\u0010\u000f\u001aD\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0003\u0018\u00010\u0003j\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00028\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\u001eJ?\u0010 \u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b \u0010!R\u0014\u0010\u0002\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\"R6\u0010\u0007\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010#R6\u0010\t\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010#R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u0014\u0010\u000b\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\"RV\u0010\u000f\u001aD\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0003\u0018\u00010\u0003j\u0004\u0018\u0001`\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b%\u0010\"R\u0016\u0010*\u001a\u00020'8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, m31665d2 = {"Ltu/k$a;", "", "clauseObject", "Lkotlin/Function3;", "Ltu/l;", "", "Lkotlinx/coroutines/selects/RegistrationFunction;", "regFunc", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "processResFunc", "param", "block", "", "Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "onCancellationConstructor", "<init>", "(Ltu/k;Ljava/lang/Object;Lzt/n;Lzt/n;Ljava/lang/Object;Ljava/lang/Object;Lzt/n;)V", "Ltu/k;", "select", "", "e", "(Ltu/k;)Z", "result", "d", "(Ljava/lang/Object;)Ljava/lang/Object;", "argument", "c", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "b", "()V", "internalResult", "a", "(Ltu/l;Ljava/lang/Object;)Lzt/n;", "Ljava/lang/Object;", "Lzt/n;", "f", "g", "disposableHandleOrSegment", "", "h", "I", "indexInSegment", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Object clauseObject;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC14057n<Object, InterfaceC11760l<?>, Object, Unit> regFunc;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC14057n<Object, Object, Object, Object> processResFunc;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public final Object param;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final Object block;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        public final InterfaceC14057n<InterfaceC11760l<?>, Object, Object, InterfaceC14057n<Throwable, Object, CoroutineContext, Unit>> onCancellationConstructor;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        public Object disposableHandleOrSegment;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public int indexInSegment = -1;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: zt.n<java.lang.Object, ? super tu.l<?>, java.lang.Object, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: zt.n<? super tu.l<?>, java.lang.Object, java.lang.Object, ? extends zt.n<? super java.lang.Throwable, java.lang.Object, ? super kotlin.coroutines.CoroutineContext, kotlin.Unit>> */
        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Object obj, @NotNull InterfaceC14057n<Object, ? super InterfaceC11760l<?>, Object, Unit> interfaceC14057n, @Nullable InterfaceC14057n<Object, Object, Object, ? extends Object> interfaceC14057n2, @NotNull Object obj2, @Nullable Object obj3, InterfaceC14057n<? super InterfaceC11760l<?>, Object, Object, ? extends InterfaceC14057n<? super Throwable, Object, ? super CoroutineContext, Unit>> interfaceC14057n3) {
            this.clauseObject = obj;
            this.regFunc = interfaceC14057n;
            this.processResFunc = interfaceC14057n2;
            this.param = obj2;
            this.block = obj3;
            this.onCancellationConstructor = interfaceC14057n3;
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final InterfaceC14057n<Throwable, Object, CoroutineContext, Unit> m44024a(@NotNull InterfaceC11760l<?> select, @Nullable Object internalResult) {
            InterfaceC14057n<InterfaceC11760l<?>, Object, Object, InterfaceC14057n<Throwable, Object, CoroutineContext, Unit>> interfaceC14057n = this.onCancellationConstructor;
            if (interfaceC14057n != null) {
                return interfaceC14057n.invoke(select, this.param, internalResult);
            }
            return null;
        }

        /* JADX INFO: renamed from: b */
        public final void m44025b() {
            Object obj = this.disposableHandleOrSegment;
            C11759k<R> c11759k = C11759k.this;
            if (obj instanceof AbstractC10713b0) {
                ((AbstractC10713b0) obj).mo34951s(this.indexInSegment, null, c11759k.getContext());
                return;
            }
            InterfaceC7874i1 interfaceC7874i1 = obj instanceof InterfaceC7874i1 ? (InterfaceC7874i1) obj : null;
            if (interfaceC7874i1 != null) {
                interfaceC7874i1.mo32664a();
            }
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public final Object m44026c(@Nullable Object obj, @NotNull InterfaceC9557b<? super R> interfaceC9557b) {
            Object obj2 = this.block;
            if (this.param == C11761m.m44037i()) {
                Intrinsics.m31981d(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
                return ((Function1) obj2).invoke(interfaceC9557b);
            }
            Intrinsics.m31981d(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((Function2) obj2).invoke(obj, interfaceC9557b);
        }

        @Nullable
        /* JADX INFO: renamed from: d */
        public final Object m44027d(@Nullable Object result) {
            return this.processResFunc.invoke(this.clauseObject, this.param, result);
        }

        /* JADX INFO: renamed from: e */
        public final boolean m44028e(@NotNull C11759k<R> select) {
            this.regFunc.invoke(this.clauseObject, select, this.param);
            return select.internalResult == C11761m.f41459e;
        }
    }

    /* JADX INFO: renamed from: tu.k$b */
    @InterfaceC10344f(m39663c = "kotlinx.coroutines.selects.SelectImplementation", m39664f = "Select.kt", m39665l = {453, 456}, m39666m = "doSelectSuspend")
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class b extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f41451t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f41452u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C11759k<R> f41453v;

        /* JADX INFO: renamed from: w */
        public int f41454w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C11759k<R> c11759k, InterfaceC9557b<? super b> interfaceC9557b) {
            super(interfaceC9557b);
            this.f41453v = c11759k;
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f41452u = obj;
            this.f41454w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return this.f41453v.m44017q(this);
        }
    }

    public C11759k(@NotNull CoroutineContext coroutineContext) {
        this.context = coroutineContext;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ <R> Object m44006p(C11759k<R> c11759k, InterfaceC9557b<? super R> interfaceC9557b) {
        return c11759k.m44008t() ? c11759k.m44014m(interfaceC9557b) : c11759k.m44017q(interfaceC9557b);
    }

    /* JADX INFO: renamed from: t */
    private final boolean m44008t() {
        return f41436f.get(this) instanceof a;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m44009v(C11759k c11759k, a aVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        c11759k.m44019u(aVar, z10);
    }

    @Override // p256ku.InterfaceC7892m
    /* JADX INFO: renamed from: a */
    public void mo32621a(@Nullable Throwable cause) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f41436f;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == C11761m.f41457c) {
                return;
            }
        } while (!C12996b.m48310a(atomicReferenceFieldUpdater, this, obj, C11761m.f41458d));
        List<C11759k<R>.a> list = this.clauses;
        if (list == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((a) it.next()).m44025b();
        }
        this.internalResult = C11761m.f41459e;
        this.clauses = null;
    }

    @Override // p452tu.InterfaceC11760l
    /* JADX INFO: renamed from: b */
    public void mo44010b(@Nullable Object internalResult) {
        this.internalResult = internalResult;
    }

    @Override // p452tu.InterfaceC11752d
    /* JADX INFO: renamed from: c */
    public <Q> void mo43993c(@NotNull InterfaceC11756h<? extends Q> interfaceC11756h, @NotNull Function2<? super Q, ? super InterfaceC9557b<? super R>, ? extends Object> function2) {
        m44009v(this, new a(interfaceC11756h.getClauseObject(), interfaceC11756h.mo43998a(), interfaceC11756h.mo44000c(), null, function2, interfaceC11756h.mo43999b()), false, 1, null);
    }

    @Override // p452tu.InterfaceC11752d
    /* JADX INFO: renamed from: d */
    public void mo43994d(@NotNull InterfaceC11754f interfaceC11754f, @NotNull Function1<? super InterfaceC9557b<? super R>, ? extends Object> function1) {
        m44009v(this, new a(interfaceC11754f.getClauseObject(), interfaceC11754f.mo43998a(), interfaceC11754f.mo44000c(), C11761m.m44037i(), function1, interfaceC11754f.mo43999b()), false, 1, null);
    }

    @Override // p256ku.InterfaceC7886k3
    /* JADX INFO: renamed from: e */
    public void mo32790e(@NotNull AbstractC10713b0<?> segment, int index) {
        this.disposableHandleOrSegment = segment;
        this.indexInSegment = index;
    }

    @Override // p452tu.InterfaceC11760l
    /* JADX INFO: renamed from: f */
    public boolean mo44011f(@NotNull Object clauseObject, @Nullable Object result) {
        return m44022y(clauseObject, result) == 0;
    }

    @Override // p452tu.InterfaceC11760l
    @NotNull
    public CoroutineContext getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: k */
    public final void m44012k(Object clauseObject) {
        List<C11759k<R>.a> list = this.clauses;
        Intrinsics.checkNotNull(list);
        List<C11759k<R>.a> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (((a) it.next()).clauseObject == clauseObject) {
                throw new IllegalStateException(("Cannot use select clauses on the same object: " + clauseObject).toString());
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m44013l(C11759k<R>.a selectedClause) {
        List<C11759k<R>.a> list = this.clauses;
        if (list == null) {
            return;
        }
        for (C11759k<R>.a aVar : list) {
            if (aVar != selectedClause) {
                aVar.m44025b();
            }
        }
        f41436f.set(this, C11761m.f41457c);
        this.internalResult = C11761m.f41459e;
        this.clauses = null;
    }

    /* JADX INFO: renamed from: m */
    public final Object m44014m(InterfaceC9557b<? super R> interfaceC9557b) {
        Object obj = f41436f.get(this);
        Intrinsics.m31981d(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        C11759k<R>.a aVar = (a) obj;
        Object obj2 = this.internalResult;
        m44013l(aVar);
        return aVar.m44026c(aVar.m44027d(obj2), interfaceC9557b);
    }

    /* JADX INFO: renamed from: n */
    public void m44015n(@NotNull InterfaceC7874i1 disposableHandle) {
        this.disposableHandleOrSegment = disposableHandle;
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public Object m44016o(@NotNull InterfaceC9557b<? super R> interfaceC9557b) {
        return m44006p(this, interfaceC9557b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: q */
    public final Object m44017q(InterfaceC9557b<? super R> interfaceC9557b) {
        b bVar;
        C11759k c11759k;
        if (interfaceC9557b instanceof b) {
            bVar = (b) interfaceC9557b;
            int i10 = bVar.f41454w;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                bVar.f41454w = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                bVar = new b(this, interfaceC9557b);
            }
        } else {
            bVar = new b(this, interfaceC9557b);
        }
        Object obj = bVar.f41452u;
        Object objM38805e = C10047c.m38805e();
        int i11 = bVar.f41454w;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            bVar.f41451t = this;
            bVar.f41454w = 1;
            if (m44023z(bVar) != objM38805e) {
                c11759k = this;
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            return obj;
        }
        C11759k c11759k2 = (C11759k) bVar.f41451t;
        C7348o.m30470b(obj);
        c11759k = c11759k2;
        bVar.f41451t = null;
        bVar.f41454w = 2;
        Object objM44014m = c11759k.m44014m(bVar);
        return objM44014m == objM38805e ? objM38805e : objM44014m;
    }

    /* JADX INFO: renamed from: r */
    public final C11759k<R>.a m44018r(Object clauseObject) {
        List<C11759k<R>.a> list = this.clauses;
        Object obj = null;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (((a) obj2).clauseObject == clauseObject) {
                obj = obj2;
                break;
            }
        }
        C11759k<R>.a aVar = (a) obj;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Clause with object " + clauseObject + " is not found").toString());
    }

    /* JADX INFO: renamed from: u */
    public final void m44019u(@NotNull C11759k<R>.a aVar, boolean z10) {
        if (f41436f.get(this) instanceof a) {
            return;
        }
        if (!z10) {
            m44012k(aVar.clauseObject);
        }
        if (!aVar.m44028e(this)) {
            f41436f.set(this, aVar);
            return;
        }
        if (!z10) {
            List<C11759k<R>.a> list = this.clauses;
            Intrinsics.checkNotNull(list);
            list.add(aVar);
        }
        aVar.disposableHandleOrSegment = this.disposableHandleOrSegment;
        aVar.indexInSegment = this.indexInSegment;
        this.disposableHandleOrSegment = null;
        this.indexInSegment = -1;
    }

    /* JADX INFO: renamed from: w */
    public final void m44020w(Object clauseObject) {
        C11759k<R>.a aVarM44018r = m44018r(clauseObject);
        Intrinsics.checkNotNull(aVarM44018r);
        aVarM44018r.disposableHandleOrSegment = null;
        aVarM44018r.indexInSegment = -1;
        m44019u(aVarM44018r, true);
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final EnumC11763o m44021x(@NotNull Object clauseObject, @Nullable Object result) {
        return C11761m.m44029a(m44022y(clauseObject, result));
    }

    /* JADX INFO: renamed from: y */
    public final int m44022y(Object clauseObject, Object internalResult) {
        while (true) {
            Object obj = f41436f.get(this);
            if (obj instanceof InterfaceC7897n) {
                C11759k<R>.a aVarM44018r = m44018r(clauseObject);
                if (aVarM44018r == null) {
                    continue;
                } else {
                    InterfaceC14057n<Throwable, Object, CoroutineContext, Unit> interfaceC14057nM44024a = aVarM44018r.m44024a(this, internalResult);
                    if (C12996b.m48310a(f41436f, this, obj, aVarM44018r)) {
                        this.internalResult = internalResult;
                        if (C11761m.m44038j((InterfaceC7897n) obj, interfaceC14057nM44024a)) {
                            return 0;
                        }
                        this.internalResult = C11761m.f41459e;
                        return 2;
                    }
                }
            } else {
                if (Intrinsics.m31980c(obj, C11761m.f41457c) || (obj instanceof a)) {
                    return 3;
                }
                if (Intrinsics.m31980c(obj, C11761m.f41458d)) {
                    return 2;
                }
                if (Intrinsics.m31980c(obj, C11761m.f41456b)) {
                    if (C12996b.m48310a(f41436f, this, obj, C7697o.m31878d(clauseObject))) {
                        return 1;
                    }
                } else {
                    if (!(obj instanceof List)) {
                        throw new IllegalStateException(("Unexpected state: " + obj).toString());
                    }
                    if (C12996b.m48310a(f41436f, this, obj, CollectionsKt.m31726x0((Collection) obj, clauseObject))) {
                        return 1;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final Object m44023z(InterfaceC9557b<? super Unit> interfaceC9557b) {
        C7905p c7905p = new C7905p(C10046b.m38803c(interfaceC9557b), 1);
        c7905p.m32860H();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f41436f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == C11761m.f41456b) {
                if (C12996b.m48310a(f41436f, this, obj, c7905p)) {
                    C7913r.m32901c(c7905p, this);
                    break;
                }
            } else {
                if (!(obj instanceof List)) {
                    if (obj instanceof a) {
                        c7905p.mo32814k(Unit.f29331a, ((a) obj).m44024a(this, this.internalResult));
                        break;
                    }
                    throw new IllegalStateException(("unexpected state: " + obj).toString());
                }
                if (C12996b.m48310a(f41436f, this, obj, C11761m.f41456b)) {
                    Iterator it = ((Iterable) obj).iterator();
                    while (it.hasNext()) {
                        m44020w(it.next());
                    }
                }
            }
        }
        Object objM32857A = c7905p.m32857A();
        if (objM32857A == C10047c.m38805e()) {
            C10346h.m39673c(interfaceC9557b);
        }
        return objM32857A == C10047c.m38805e() ? objM32857A : Unit.f29331a;
    }
}
