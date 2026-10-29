package p535x4;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.util.Log;
import androidx.room.C1075c;
import hu.InterfaceC6567c;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7688j0;
import kotlin.collections.C7690k0;
import kotlin.collections.C7699p;
import kotlin.collections.C7701q;
import kotlin.collections.C7702q0;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.InterfaceC7720d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006a5.AbstractC0072b;
import p006a5.InterfaceC0071a;
import p025b5.C1224b;
import p025b5.C1229g;
import p025b5.C1233k;
import p025b5.C1234l;
import p025b5.C1235m;
import p041c5.C1525a;
import p041c5.C1530f;
import p041c5.C1532h;
import p119f5.InterfaceC5359b;
import p119f5.InterfaceC5360c;
import p145g5.InterfaceC6008c;
import p145g5.InterfaceC6009d;
import p160h5.C6288i;
import p187i5.C6639a;
import p229jt.C7346m;
import p229jt.C7352s;
import p256ku.AbstractC7888l0;
import p256ku.C7910q0;
import p256ku.C7931v1;
import p256ku.C7948z2;
import p256ku.InterfaceC7850d2;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;
import p396r.C10757c;
import p566y4.C13027a;
import yt.C13450a;

/* JADX INFO: renamed from: x4.u */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0017\b&\u0018\u0000 '2\u00020\u0001:\u0006]T`V\u0010YB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J#\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u00042\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u000f\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u001a\u0010\u001c\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u001a\u0012\u0004\u0012\u00020\u001b0\u0019H\u0017¢\u0006\u0004\b\u001f\u0010 J1\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u001a\u0010\u001c\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\r\u0012\u0004\u0012\u00020\u001b0\u0019H\u0017¢\u0006\u0004\b!\u0010 J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u0012H\u0015¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0015¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H$¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0007¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0007¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020/H\u0000¢\u0006\u0004\b2\u00101J)\u00103\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a0\u001d0\u0019H\u0015¢\u0006\u0004\b3\u00104J)\u00105\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u001d0\u0019H\u0015¢\u0006\u0004\b5\u00104J\u001d\u00107\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u001a06H\u0017¢\u0006\u0004\b7\u00108J\u001d\u00109\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\r06H\u0017¢\u0006\u0004\b9\u00108J\u000f\u0010:\u001a\u00020\u0004H\u0017¢\u0006\u0004\b:\u0010\u0003J\u000f\u0010;\u001a\u00020\u0004H\u0017¢\u0006\u0004\b;\u0010\u0003JB\u0010C\u001a\u00028\u0000\"\u0004\b\u0000\u0010<2\u0006\u0010>\u001a\u00020=2\"\u0010B\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020@\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000A\u0012\u0006\u0012\u0004\u0018\u00010\u00010?H\u0087@¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020=H\u0007¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0004H\u0017¢\u0006\u0004\bG\u0010\u0003J\u000f\u0010H\u001a\u00020\u0004H\u0017¢\u0006\u0004\bH\u0010\u0003J\u000f\u0010I\u001a\u00020\u0004H\u0017¢\u0006\u0004\bI\u0010\u0003J\u0017\u0010<\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020JH\u0016¢\u0006\u0004\b<\u0010KJ#\u0010M\u001a\u00028\u0000\"\u0004\b\u0000\u0010I2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000LH\u0016¢\u0006\u0004\bM\u0010NJ\u0017\u0010Q\u001a\u00020\u00042\u0006\u0010P\u001a\u00020OH\u0005¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020=H\u0016¢\u0006\u0004\bS\u0010FR\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010X\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010[\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010_\u001a\u00020\\8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010a\u001a\u00020\\8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b`\u0010^R\u0016\u0010c\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010bR\u0016\u0010e\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u0010dR\u001a\u0010j\u001a\u00020f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u0010g\u001a\u0004\bh\u0010iR\u0016\u0010l\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010kR\u0018\u0010o\u001a\u0004\u0018\u00010m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010nR\u001d\u0010u\u001a\b\u0012\u0004\u0012\u00020/0p8G¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR$\u0010x\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00010v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010wR\"\u0010|\u001a\u00020=8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010k\u001a\u0004\by\u0010F\"\u0004\bz\u0010{R\u0014\u0010~\u001a\u00020=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b}\u0010FR\u0016\u0010\u0081\u0001\u001a\u00020\\8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0017\u0010\u0084\u0001\u001a\u00020#8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0016\u0010\u0086\u0001\u001a\u00020)8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010+R0\u0010\u0088\u0001\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u001d0\u00198@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u00104R\u0016\u0010\u008a\u0001\u001a\u00020=8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010FR\u0016\u0010\u008c\u0001\u001a\u00020=8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u0010F¨\u0006\u008d\u0001"}, m31665d2 = {"Lx4/u;", "", "<init>", "()V", "", "O", "I", "J", "T", "Lkotlin/Function0;", "body", "Q", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lhu/c;", "kclass", "converter", "f", "(Lhu/c;Ljava/lang/Object;)V", "Lx4/c;", "configuration", "H", "(Lx4/c;)V", "Lx4/p;", "l", "(Lx4/c;)Lx4/p;", "", "Ljava/lang/Class;", "La5/a;", "autoMigrationSpecs", "", "La5/b;", "q", "(Ljava/util/Map;)Ljava/util/List;", "j", "config", "Lg5/d;", "o", "(Lx4/c;)Lg5/d;", "Lx4/b0;", "n", "()Lx4/b0;", "Landroidx/room/c;", "m", "()Landroidx/room/c;", "Lku/p0;", "s", "()Lku/p0;", "Lkotlin/coroutines/CoroutineContext;", "v", "()Lkotlin/coroutines/CoroutineContext;", "C", "A", "()Ljava/util/Map;", "y", "", "x", "()Ljava/util/Set;", "w", "g", "h", "R", "", "isReadOnly", "Lkotlin/Function2;", "Lx4/g0;", "Lnt/b;", "block", "W", "(ZLkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "F", "()Z", "i", "p", "V", "Ljava/lang/Runnable;", "(Ljava/lang/Runnable;)V", "Ljava/util/concurrent/Callable;", "P", "(Ljava/util/concurrent/Callable;)Ljava/lang/Object;", "Lf5/b;", "connection", "K", "(Lf5/b;)V", "G", "a", "Lx4/c;", "b", "Lku/p0;", "coroutineScope", "c", "Lkotlin/coroutines/CoroutineContext;", "transactionContext", "Ljava/util/concurrent/Executor;", "d", "Ljava/util/concurrent/Executor;", "internalQueryExecutor", "e", "internalTransactionExecutor", "Lx4/p;", "connectionManager", "Landroidx/room/c;", "internalTracker", "Ly4/a;", "Ly4/a;", "r", "()Ly4/a;", "closeBarrier", "Z", "allowMainThreadQueries", "Lb5/b;", "Lb5/b;", "autoCloser", "Ljava/lang/ThreadLocal;", "k", "Ljava/lang/ThreadLocal;", "B", "()Ljava/lang/ThreadLocal;", "suspendingTransactionContext", "", "Ljava/util/Map;", "typeConverters", "E", "setUseTempTrackingTable$room_runtime", "(Z)V", "useTempTrackingTable", "N", "isThreadInSuspendingTransaction", "D", "()Ljava/util/concurrent/Executor;", "transactionExecutor", "u", "()Lg5/d;", "openHelper", "t", "invalidationTracker", "z", "requiredTypeConverterClassesMap", "M", "isOpenInternal", "L", "isMainThread", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public abstract class AbstractC12682u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public C12654c configuration;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public InterfaceC7906p0 coroutineScope;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public CoroutineContext transactionContext;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public Executor internalQueryExecutor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public Executor internalTransactionExecutor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public C12677p connectionManager;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public C1075c internalTracker;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean allowMainThreadQueries;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public C1224b autoCloser;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final C13027a closeBarrier = new C13027a(new g(this));

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final ThreadLocal<CoroutineContext> suspendingTransactionContext = new ThreadLocal<>();

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Map<InterfaceC6567c<?>, Object> typeConverters = new LinkedHashMap();

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean useTempTrackingTable = true;

    /* JADX INFO: renamed from: x4.u$a */
    @Metadata(m31664d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B)\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010\"\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00028\u0000H\u0016¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010'R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010(R\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001f0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010,R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010/R\u0018\u00102\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010/R\u0018\u00105\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00108\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010D\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001c\u0010Q\u001a\b\u0012\u0004\u0012\u00020N0M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020N0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010PR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020T0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010,R\u0016\u0010X\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u00107R\u0016\u0010Z\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u00107R\u0016\u0010\\\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u00107R\u0018\u0010^\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010(R\u0018\u0010b\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u001e\u0010g\u001a\n\u0012\u0004\u0012\u00020d\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010k\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0018\u0010o\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0016\u0010q\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u00107¨\u0006r"}, m31665d2 = {"Lx4/u$a;", "Lx4/u;", "T", "", "Landroid/content/Context;", "context", "Ljava/lang/Class;", "klass", "", "name", "<init>", "(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)V", "Lg5/d$c;", "factory", "f", "(Lg5/d$c;)Lx4/u$a;", "", "La5/b;", "migrations", "b", "([La5/b;)Lx4/u$a;", "c", "()Lx4/u$a;", "Ljava/util/concurrent/Executor;", "executor", "g", "(Ljava/util/concurrent/Executor;)Lx4/u$a;", "", "dropAllTables", "e", "(Z)Lx4/u$a;", "Lx4/u$b;", "callback", "a", "(Lx4/u$b;)Lx4/u$a;", "d", "()Lx4/u;", "Lhu/c;", "Lhu/c;", "Landroid/content/Context;", "Ljava/lang/String;", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "", "Ljava/util/List;", "callbacks", "typeConverters", "Ljava/util/concurrent/Executor;", "queryExecutor", "h", "transactionExecutor", "i", "Lg5/d$c;", "supportOpenHelperFactory", "j", "Z", "allowMainThreadQueries", "Lx4/u$d;", "k", "Lx4/u$d;", "journalMode", "Landroid/content/Intent;", "l", "Landroid/content/Intent;", "multiInstanceInvalidationIntent", "", "m", "J", "autoCloseTimeout", "Ljava/util/concurrent/TimeUnit;", "n", "Ljava/util/concurrent/TimeUnit;", "autoCloseTimeUnit", "Lx4/u$e;", "o", "Lx4/u$e;", "migrationContainer", "", "", "p", "Ljava/util/Set;", "migrationsNotRequiredFrom", "q", "migrationStartAndEndVersions", "La5/a;", "r", "autoMigrationSpecs", "s", "requireMigration", "t", "allowDestructiveMigrationOnDowngrade", "u", "allowDestructiveMigrationForAllTables", "v", "copyFromAssetPath", "Ljava/io/File;", "w", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "x", "Ljava/util/concurrent/Callable;", "copyFromInputStream", "Lf5/c;", "y", "Lf5/c;", "driver", "Lkotlin/coroutines/CoroutineContext;", "z", "Lkotlin/coroutines/CoroutineContext;", "queryCoroutineContext", "A", "inMemoryTrackingTableMode", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static class a<T extends AbstractC12682u> {

        /* JADX INFO: renamed from: A, reason: from kotlin metadata */
        public boolean inMemoryTrackingTableMode;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC6567c<T> klass;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final Context context;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public final String name;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public final Function0<T> factory;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final List<b> callbacks;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public final List<Object> typeConverters;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        public Executor queryExecutor;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        public Executor transactionExecutor;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        public InterfaceC6009d.c supportOpenHelperFactory;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        public boolean allowMainThreadQueries;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @NotNull
        public d journalMode;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        @Nullable
        public Intent multiInstanceInvalidationIntent;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        public long autoCloseTimeout;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        @Nullable
        public TimeUnit autoCloseTimeUnit;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        @NotNull
        public final e migrationContainer;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        @NotNull
        public Set<Integer> migrationsNotRequiredFrom;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        @NotNull
        public final Set<Integer> migrationStartAndEndVersions;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        @NotNull
        public final List<InterfaceC0071a> autoMigrationSpecs;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        public boolean requireMigration;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        public boolean allowDestructiveMigrationOnDowngrade;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        public boolean allowDestructiveMigrationForAllTables;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata */
        @Nullable
        public String copyFromAssetPath;

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        @Nullable
        public File copyFromFile;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        @Nullable
        public Callable<InputStream> copyFromInputStream;

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        @Nullable
        public InterfaceC5360c driver;

        /* JADX INFO: renamed from: z, reason: from kotlin metadata */
        @Nullable
        public CoroutineContext queryCoroutineContext;

        public a(@NotNull Context context, @NotNull Class<T> klass, @Nullable String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(klass, "klass");
            this.callbacks = new ArrayList();
            this.typeConverters = new ArrayList();
            this.journalMode = d.AUTOMATIC;
            this.autoCloseTimeout = -1L;
            this.migrationContainer = new e();
            this.migrationsNotRequiredFrom = new LinkedHashSet();
            this.migrationStartAndEndVersions = new LinkedHashSet();
            this.autoMigrationSpecs = new ArrayList();
            this.requireMigration = true;
            this.inMemoryTrackingTableMode = true;
            this.klass = C13450a.m49050c(klass);
            this.context = context;
            this.name = str;
            this.factory = null;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public a<T> m47284a(@NotNull b callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.callbacks.add(callback);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public a<T> m47285b(@NotNull AbstractC0072b... migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            for (AbstractC0072b abstractC0072b : migrations) {
                this.migrationStartAndEndVersions.add(Integer.valueOf(abstractC0072b.startVersion));
                this.migrationStartAndEndVersions.add(Integer.valueOf(abstractC0072b.endVersion));
            }
            this.migrationContainer.m47299b((AbstractC0072b[]) Arrays.copyOf(migrations, migrations.length));
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public a<T> m47286c() {
            this.allowMainThreadQueries = true;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public T m47287d() {
            InterfaceC6009d.c c1235m;
            InterfaceC6009d.c cVar;
            T tInvoke;
            Executor executor = this.queryExecutor;
            if (executor == null && this.transactionExecutor == null) {
                Executor executorM40963f = C10757c.m40963f();
                this.transactionExecutor = executorM40963f;
                this.queryExecutor = executorM40963f;
            } else if (executor != null && this.transactionExecutor == null) {
                this.transactionExecutor = executor;
            } else if (executor == null) {
                this.queryExecutor = this.transactionExecutor;
            }
            C12683v.m47310c(this.migrationStartAndEndVersions, this.migrationsNotRequiredFrom);
            InterfaceC5360c interfaceC5360c = this.driver;
            if (interfaceC5360c == null && this.supportOpenHelperFactory == null) {
                c1235m = new C6288i();
            } else if (interfaceC5360c == null) {
                c1235m = this.supportOpenHelperFactory;
            } else {
                if (this.supportOpenHelperFactory != null) {
                    throw new IllegalArgumentException("A RoomDatabase cannot be configured with both a SQLiteDriver and a SupportOpenHelper.Factory.");
                }
                c1235m = null;
            }
            boolean z10 = this.autoCloseTimeout > 0;
            boolean z11 = (this.copyFromAssetPath == null && this.copyFromFile == null && this.copyFromInputStream == null) ? false : true;
            if (c1235m != null) {
                if (z10) {
                    if (this.name == null) {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                    }
                    long j10 = this.autoCloseTimeout;
                    TimeUnit timeUnit = this.autoCloseTimeUnit;
                    if (timeUnit == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    c1235m = new C1233k(c1235m, new C1224b(j10, timeUnit, null, 4, null));
                }
                if (z11) {
                    if (this.name == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    }
                    String str = this.copyFromAssetPath;
                    int i10 = str == null ? 0 : 1;
                    File file = this.copyFromFile;
                    int i11 = file == null ? 0 : 1;
                    Callable<InputStream> callable = this.copyFromInputStream;
                    if (i10 + i11 + (callable != null ? 1 : 0) != 1) {
                        throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                    }
                    c1235m = new C1235m(str, file, callable, c1235m);
                }
                cVar = c1235m;
            } else {
                cVar = null;
            }
            if (cVar == null) {
                if (z10) {
                    throw new IllegalArgumentException("Auto Closing Database is not supported when an SQLiteDriver is configured.");
                }
                if (z11) {
                    throw new IllegalArgumentException("Pre-Package Database is not supported when an SQLiteDriver is configured.");
                }
            }
            Context context = this.context;
            String str2 = this.name;
            e eVar = this.migrationContainer;
            List<b> list = this.callbacks;
            boolean z12 = this.allowMainThreadQueries;
            d dVarM47297b = this.journalMode.m47297b(context);
            Executor executor2 = this.queryExecutor;
            if (executor2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor3 = this.transactionExecutor;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            C12654c c12654c = new C12654c(context, str2, cVar, eVar, list, z12, dVarM47297b, executor2, executor3, this.multiInstanceInvalidationIntent, this.requireMigration, this.allowDestructiveMigrationOnDowngrade, this.migrationsNotRequiredFrom, this.copyFromAssetPath, this.copyFromFile, this.copyFromInputStream, null, this.typeConverters, this.autoMigrationSpecs, this.allowDestructiveMigrationForAllTables, this.driver, this.queryCoroutineContext);
            c12654c.m47163g(this.inMemoryTrackingTableMode);
            Function0<T> function0 = this.factory;
            if (function0 == null || (tInvoke = function0.invoke()) == null) {
                tInvoke = (T) C1530f.m8090b(C13450a.m49048a(this.klass), null, 2, null);
            }
            tInvoke.m47256H(c12654c);
            return tInvoke;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final a<T> m47288e(boolean dropAllTables) {
            this.requireMigration = false;
            this.allowDestructiveMigrationOnDowngrade = true;
            this.allowDestructiveMigrationForAllTables = dropAllTables;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public a<T> m47289f(@Nullable InterfaceC6009d.c factory) {
            this.supportOpenHelperFactory = factory;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public a<T> m47290g(@NotNull Executor executor) {
            Intrinsics.checkNotNullParameter(executor, "executor");
            if (this.queryCoroutineContext != null) {
                throw new IllegalArgumentException("This builder has already been configured with a CoroutineContext. A RoomDatabasecan only be configured with either an Executor or a CoroutineContext.");
            }
            this.queryExecutor = executor;
            return this;
        }
    }

    /* JADX INFO: renamed from: x4.u$b */
    @Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\f¨\u0006\u0011"}, m31665d2 = {"Lx4/u$b;", "", "<init>", "()V", "Lg5/c;", "db", "", "b", "(Lg5/c;)V", "Lf5/b;", "connection", "a", "(Lf5/b;)V", "d", "c", "f", "e", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static abstract class b {
        /* JADX INFO: renamed from: a */
        public void m47291a(@NotNull InterfaceC5359b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            if (connection instanceof C6639a) {
                m47292b(((C6639a) connection).getDb());
            }
        }

        /* JADX INFO: renamed from: b */
        public void m47292b(@NotNull InterfaceC6008c db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }

        /* JADX INFO: renamed from: c */
        public void m47293c(@NotNull InterfaceC5359b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            if (connection instanceof C6639a) {
                m47294d(((C6639a) connection).getDb());
            }
        }

        /* JADX INFO: renamed from: d */
        public void m47294d(@NotNull InterfaceC6008c db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }

        /* JADX INFO: renamed from: e */
        public void m47295e(@NotNull InterfaceC5359b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            if (connection instanceof C6639a) {
                mo47239f(((C6639a) connection).getDb());
            }
        }

        /* JADX INFO: renamed from: f */
        public void mo47239f(@NotNull InterfaceC6008c db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }
    }

    /* JADX INFO: renamed from: x4.u$d */
    @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\u0006j\u0002\b\t¨\u0006\n"}, m31665d2 = {"Lx4/u$d;", "", "<init>", "(Ljava/lang/String;I)V", "Landroid/content/Context;", "context", "b", "(Landroid/content/Context;)Lx4/u$d;", "a", "c", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public enum d {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;


        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ InterfaceC10707a f45192e = C10708b.m40805a(m47296a());

        @NotNull
        /* JADX INFO: renamed from: b */
        public final d m47297b(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            return (activityManager == null || activityManager.isLowRamDevice()) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    /* JADX INFO: renamed from: x4.u$e */
    @Metadata(m31664d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r0\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00132\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010\u001e\u001a\"\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001d\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ7\u0010 \u001a\"\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001d\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u000eH\u0000¢\u0006\u0004\b \u0010\u001fR,\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#¨\u0006$"}, m31665d2 = {"Lx4/u$e;", "", "<init>", "()V", "", "La5/b;", "migrations", "", "b", "([La5/b;)V", "migration", "a", "(La5/b;)V", "", "", "e", "()Ljava/util/Map;", "start", "end", "", "d", "(II)Ljava/util/List;", "startVersion", "endVersion", "", "c", "(II)Z", "migrationStart", "Lkotlin/Pair;", "", "g", "(I)Lkotlin/Pair;", "f", "", "Ljava/util/TreeMap;", "Ljava/util/Map;", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static class e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Map<Integer, TreeMap<Integer, AbstractC0072b>> migrations = new LinkedHashMap();

        /* JADX INFO: renamed from: a */
        public final void m47298a(@NotNull AbstractC0072b migration) {
            Intrinsics.checkNotNullParameter(migration, "migration");
            int i10 = migration.startVersion;
            int i11 = migration.endVersion;
            Map<Integer, TreeMap<Integer, AbstractC0072b>> map = this.migrations;
            Integer numValueOf = Integer.valueOf(i10);
            TreeMap<Integer, AbstractC0072b> treeMap = map.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                map.put(numValueOf, treeMap);
            }
            TreeMap<Integer, AbstractC0072b> treeMap2 = treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i11))) {
                Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i11)) + " with " + migration);
            }
            treeMap2.put(Integer.valueOf(i11), migration);
        }

        /* JADX INFO: renamed from: b */
        public void m47299b(@NotNull AbstractC0072b... migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            for (AbstractC0072b abstractC0072b : migrations) {
                m47298a(abstractC0072b);
            }
        }

        /* JADX INFO: renamed from: c */
        public final boolean m47300c(int startVersion, int endVersion) {
            return C1532h.m8091a(this, startVersion, endVersion);
        }

        @Nullable
        /* JADX INFO: renamed from: d */
        public List<AbstractC0072b> m47301d(int start, int end) {
            return C1532h.m8092b(this, start, end);
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public Map<Integer, Map<Integer, AbstractC0072b>> m47302e() {
            return this.migrations;
        }

        @Nullable
        /* JADX INFO: renamed from: f */
        public final Pair<Map<Integer, AbstractC0072b>, Iterable<Integer>> m47303f(int migrationStart) {
            TreeMap<Integer, AbstractC0072b> treeMap = this.migrations.get(Integer.valueOf(migrationStart));
            if (treeMap == null) {
                return null;
            }
            return C7352s.m30477a(treeMap, treeMap.descendingKeySet());
        }

        @Nullable
        /* JADX INFO: renamed from: g */
        public final Pair<Map<Integer, AbstractC0072b>, Iterable<Integer>> m47304g(int migrationStart) {
            TreeMap<Integer, AbstractC0072b> treeMap = this.migrations.get(Integer.valueOf(migrationStart));
            if (treeMap == null) {
                return null;
            }
            return C7352s.m30477a(treeMap, treeMap.keySet());
        }
    }

    /* JADX INFO: renamed from: x4.u$f */
    @Metadata(m31664d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31665d2 = {"Lx4/u$f;", "", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static abstract class f {
    }

    /* JADX INFO: renamed from: x4.u$g */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final /* synthetic */ class g extends C7744k implements Function0<Unit> {
        public g(Object obj) {
            super(0, obj, AbstractC12682u.class, "onClosed", "onClosed()V", 0);
        }

        /* JADX INFO: renamed from: d */
        public final void m47305d() {
            ((AbstractC12682u) this.receiver).m47263O();
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m47305d();
            return Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: x4.u$h */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final /* synthetic */ class h extends C7744k implements Function2<Function1<? super InterfaceC9557b<? super Object>, ? extends Object>, InterfaceC9557b<? super Object>, Object> {
        public h(Object obj) {
            super(2, obj, C12685x.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Function1<? super InterfaceC9557b<Object>, ? extends Object> function1, InterfaceC9557b<Object> interfaceC9557b) {
            return C12683v.m47308a((AbstractC12682u) this.receiver, function1, interfaceC9557b);
        }
    }

    /* JADX INFO: renamed from: x4.u$i */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final /* synthetic */ class i extends C7744k implements Function2<Function1<? super InterfaceC9557b<? super Object>, ? extends Object>, InterfaceC9557b<? super Object>, Object> {
        public i(Object obj) {
            super(2, obj, C12685x.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Function1<? super InterfaceC9557b<Object>, ? extends Object> function1, InterfaceC9557b<Object> interfaceC9557b) {
            return C12683v.m47308a((AbstractC12682u) this.receiver, function1, interfaceC9557b);
        }
    }

    /* JADX INFO: renamed from: S */
    public static final Unit m47240S(Runnable runnable) {
        runnable.run();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: T */
    public static final Object m47241T(Callable callable) {
        return callable.call();
    }

    /* JADX INFO: renamed from: U */
    public static final Object m47242U(Function0 function0, InterfaceC5359b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return function0.invoke();
    }

    /* JADX INFO: renamed from: k */
    public static final InterfaceC6009d m47248k(AbstractC12682u abstractC12682u, C12654c config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return abstractC12682u.m47274o(config);
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public Map<Class<?>, List<Class<?>>> m47249A() {
        return C7690k0.m31795j();
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final ThreadLocal<CoroutineContext> m47250B() {
        return this.suspendingTransactionContext;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final CoroutineContext m47251C() {
        CoroutineContext coroutineContext = this.transactionContext;
        if (coroutineContext != null) {
            return coroutineContext;
        }
        Intrinsics.m31998u("transactionContext");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public Executor m47252D() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        Intrinsics.m31998u("internalTransactionExecutor");
        return null;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final boolean getUseTempTrackingTable() {
        return this.useTempTrackingTable;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m47254F() {
        C12677p c12677p = this.connectionManager;
        if (c12677p == null) {
            Intrinsics.m31998u("connectionManager");
            c12677p = null;
        }
        return c12677p.getSupportOpenHelper() != null;
    }

    /* JADX INFO: renamed from: G */
    public boolean m47255G() {
        return m47261M() && m47280u().mo6885t2().mo6894D();
    }

    /* JADX INFO: renamed from: H */
    public void m47256H(@NotNull C12654c configuration) {
        CoroutineContext coroutineContext;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.configuration = configuration;
        this.useTempTrackingTable = configuration.getUseTempTrackingTable();
        this.connectionManager = m47273l(configuration);
        this.internalTracker = mo6373m();
        C12683v.m47309b(this, configuration);
        C12683v.m47311d(this, configuration);
        CoroutineContext coroutineContext2 = configuration.queryCoroutineContext;
        InterfaceC7906p0 interfaceC7906p0 = null;
        if (coroutineContext2 != null) {
            CoroutineContext.Element element = coroutineContext2.get(InterfaceC7720d.INSTANCE);
            Intrinsics.m31981d(element, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
            AbstractC7888l0 abstractC7888l0 = (AbstractC7888l0) element;
            Executor executorM32924a = C7931v1.m32924a(abstractC7888l0);
            this.internalQueryExecutor = executorM32924a;
            if (executorM32924a == null) {
                Intrinsics.m31998u("internalQueryExecutor");
                executorM32924a = null;
            }
            this.internalTransactionExecutor = new ExecutorC12659e0(executorM32924a);
            this.coroutineScope = C7910q0.m32885a(configuration.queryCoroutineContext.plus(C7948z2.m32942a((InterfaceC7850d2) configuration.queryCoroutineContext.get(InterfaceC7850d2.INSTANCE))));
            if (m47254F()) {
                InterfaceC7906p0 interfaceC7906p1 = this.coroutineScope;
                if (interfaceC7906p1 == null) {
                    Intrinsics.m31998u("coroutineScope");
                    interfaceC7906p1 = null;
                }
                coroutineContext = interfaceC7906p1.getCoroutineContext().plus(abstractC7888l0.m32793I(1));
            } else {
                InterfaceC7906p0 interfaceC7906p2 = this.coroutineScope;
                if (interfaceC7906p2 == null) {
                    Intrinsics.m31998u("coroutineScope");
                    interfaceC7906p2 = null;
                }
                coroutineContext = interfaceC7906p2.getCoroutineContext();
            }
            this.transactionContext = coroutineContext;
        } else {
            this.internalQueryExecutor = configuration.queryExecutor;
            this.internalTransactionExecutor = new ExecutorC12659e0(configuration.transactionExecutor);
            Executor executor = this.internalQueryExecutor;
            if (executor == null) {
                Intrinsics.m31998u("internalQueryExecutor");
                executor = null;
            }
            InterfaceC7906p0 interfaceC7906p0M32885a = C7910q0.m32885a(C7931v1.m32925b(executor).plus(C7948z2.m32943b(null, 1, null)));
            this.coroutineScope = interfaceC7906p0M32885a;
            if (interfaceC7906p0M32885a == null) {
                Intrinsics.m31998u("coroutineScope");
                interfaceC7906p0M32885a = null;
            }
            CoroutineContext coroutineContext3 = interfaceC7906p0M32885a.getCoroutineContext();
            Executor executor2 = this.internalTransactionExecutor;
            if (executor2 == null) {
                Intrinsics.m31998u("internalTransactionExecutor");
                executor2 = null;
            }
            this.transactionContext = coroutineContext3.plus(C7931v1.m32925b(executor2));
        }
        this.allowMainThreadQueries = configuration.allowMainThreadQueries;
        C12677p c12677p = this.connectionManager;
        if (c12677p == null) {
            Intrinsics.m31998u("connectionManager");
            c12677p = null;
        }
        InterfaceC6009d interfaceC6009dM47234G = c12677p.getSupportOpenHelper();
        if (interfaceC6009dM47234G != null) {
            while (!(interfaceC6009dM47234G instanceof C1234l)) {
                if (!(interfaceC6009dM47234G instanceof InterfaceC12656d)) {
                    interfaceC6009dM47234G = null;
                    break;
                }
                interfaceC6009dM47234G = ((InterfaceC12656d) interfaceC6009dM47234G).getDelegate();
            }
        } else {
            interfaceC6009dM47234G = null;
            break;
        }
        C1234l c1234l = (C1234l) interfaceC6009dM47234G;
        if (c1234l != null) {
            c1234l.m6930d(configuration);
        }
        C12677p c12677p2 = this.connectionManager;
        if (c12677p2 == null) {
            Intrinsics.m31998u("connectionManager");
            c12677p2 = null;
        }
        InterfaceC6009d interfaceC6009dM47234G2 = c12677p2.getSupportOpenHelper();
        if (interfaceC6009dM47234G2 != null) {
            while (!(interfaceC6009dM47234G2 instanceof C1229g)) {
                if (!(interfaceC6009dM47234G2 instanceof InterfaceC12656d)) {
                    interfaceC6009dM47234G2 = null;
                    break;
                }
                interfaceC6009dM47234G2 = ((InterfaceC12656d) interfaceC6009dM47234G2).getDelegate();
            }
        } else {
            interfaceC6009dM47234G2 = null;
            break;
        }
        C1229g c1229g = (C1229g) interfaceC6009dM47234G2;
        if (c1229g != null) {
            this.autoCloser = c1229g.getAutoCloser();
            C1224b c1224bM6884b = c1229g.getAutoCloser();
            InterfaceC7906p0 interfaceC7906p3 = this.coroutineScope;
            if (interfaceC7906p3 == null) {
                Intrinsics.m31998u("coroutineScope");
            } else {
                interfaceC7906p0 = interfaceC7906p3;
            }
            c1224bM6884b.m6879k(interfaceC7906p0);
            m47279t().m6126y(c1229g.getAutoCloser());
        }
        if (configuration.multiInstanceInvalidationServiceIntent != null) {
            if (configuration.name == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            m47279t().m6117n(configuration.context, configuration.name, configuration.multiInstanceInvalidationServiceIntent);
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m47257I() {
        m47270g();
        InterfaceC6008c interfaceC6008cMo6885t2 = m47280u().mo6885t2();
        if (!interfaceC6008cMo6885t2.mo6894D()) {
            m47279t().m6110B();
        }
        if (interfaceC6008cMo6885t2.mo6902b3()) {
            interfaceC6008cMo6885t2.mo6908u0();
        } else {
            interfaceC6008cMo6885t2.mo6895G();
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m47258J() {
        m47280u().mo6885t2().mo6896G0();
        if (m47255G()) {
            return;
        }
        m47279t().m6123v();
    }

    /* JADX INFO: renamed from: K */
    public final void m47259K(@NotNull InterfaceC5359b connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        m47279t().m6118o(connection);
    }

    /* JADX INFO: renamed from: L */
    public final boolean m47260L() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* JADX INFO: renamed from: M */
    public final boolean m47261M() {
        C1224b c1224b = this.autoCloser;
        if (c1224b != null) {
            InterfaceC6008c interfaceC6008cM6877i = c1224b.getDelegateDatabase();
            if (interfaceC6008cM6877i != null) {
                return interfaceC6008cM6877i.isOpen();
            }
            return false;
        }
        C12677p c12677p = this.connectionManager;
        if (c12677p == null) {
            Intrinsics.m31998u("connectionManager");
            c12677p = null;
        }
        return c12677p.m47237J();
    }

    /* JADX INFO: renamed from: N */
    public final boolean m47262N() {
        CoroutineContext coroutineContext = this.suspendingTransactionContext.get();
        return (coroutineContext != null ? (C12655c0) coroutineContext.get(C12655c0.INSTANCE) : null) != null;
    }

    /* JADX DEBUG: Class process forced to load method for inline: ku.q0.f(ku.p0, java.util.concurrent.CancellationException, int, java.lang.Object):void */
    /* JADX INFO: renamed from: O */
    public final void m47263O() {
        InterfaceC7906p0 interfaceC7906p0 = this.coroutineScope;
        C12677p c12677p = null;
        if (interfaceC7906p0 == null) {
            Intrinsics.m31998u("coroutineScope");
            interfaceC7906p0 = null;
        }
        C7910q0.m32890f(interfaceC7906p0, null, 1, null);
        m47279t().m6127z();
        C12677p c12677p2 = this.connectionManager;
        if (c12677p2 == null) {
            Intrinsics.m31998u("connectionManager");
        } else {
            c12677p = c12677p2;
        }
        c12677p.m47233F();
    }

    /* JADX INFO: renamed from: P */
    public <V> V m47264P(@NotNull final Callable<V> body) {
        Intrinsics.checkNotNullParameter(body, "body");
        return (V) m47265Q(new Function0() { // from class: x4.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC12682u.m47241T(body);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public final <T> T m47265Q(final Function0<? extends T> body) {
        if (!m47254F()) {
            return (T) C1525a.m8065c(this, false, true, new Function1() { // from class: x4.t
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC12682u.m47242U(body, (InterfaceC5359b) obj);
                }
            });
        }
        m47272i();
        try {
            T tInvoke = body.invoke();
            m47267V();
            return tInvoke;
        } finally {
            m47275p();
        }
    }

    /* JADX INFO: renamed from: R */
    public void m47266R(@NotNull final Runnable body) {
        Intrinsics.checkNotNullParameter(body, "body");
        m47265Q(new Function0() { // from class: x4.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC12682u.m47240S(body);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public void m47267V() {
        m47280u().mo6885t2().mo6905q0();
    }

    @Nullable
    /* JADX INFO: renamed from: W */
    public final <R> Object m47268W(boolean z10, @NotNull Function2<? super InterfaceC12663g0, ? super InterfaceC9557b<? super R>, ? extends Object> function2, @NotNull InterfaceC9557b<? super R> interfaceC9557b) {
        C12677p c12677p = this.connectionManager;
        if (c12677p == null) {
            Intrinsics.m31998u("connectionManager");
            c12677p = null;
        }
        return c12677p.m47238K(z10, function2, interfaceC9557b);
    }

    /* JADX INFO: renamed from: f */
    public final void m47269f(@NotNull InterfaceC6567c<?> kclass, @NotNull Object converter) {
        Intrinsics.checkNotNullParameter(kclass, "kclass");
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.typeConverters.put(kclass, converter);
    }

    /* JADX INFO: renamed from: g */
    public void m47270g() {
        if (!this.allowMainThreadQueries && m47260L()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    /* JADX INFO: renamed from: h */
    public void m47271h() {
        if (m47254F() && !m47255G() && m47262N()) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    /* JADX INFO: renamed from: i */
    public void m47272i() {
        m47270g();
        m47257I();
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public List<AbstractC0072b> mo6372j(@NotNull Map<InterfaceC6567c<? extends InterfaceC0071a>, ? extends InterfaceC0071a> autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7688j0.m31790f(autoMigrationSpecs.size()));
        Iterator<T> it = autoMigrationSpecs.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(C13450a.m49048a((InterfaceC6567c) entry.getKey()), entry.getValue());
        }
        return m47276q(linkedHashMap);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final C12677p m47273l(@NotNull C12654c configuration) {
        AbstractC12651a0 abstractC12651a0;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        try {
            InterfaceC12653b0 interfaceC12653b0Mo6374n = mo6374n();
            Intrinsics.m31981d(interfaceC12653b0Mo6374n, "null cannot be cast to non-null type androidx.room.RoomOpenDelegate");
            abstractC12651a0 = (AbstractC12651a0) interfaceC12653b0Mo6374n;
        } catch (C7346m unused) {
            abstractC12651a0 = null;
        }
        return abstractC12651a0 == null ? new C12677p(configuration, (Function1<? super C12654c, ? extends InterfaceC6009d>) new Function1() { // from class: x4.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC12682u.m47248k(this.f45143a, (C12654c) obj);
            }
        }, new h(this)) : new C12677p(configuration, abstractC12651a0, new i(this));
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public abstract C1075c mo6373m();

    @NotNull
    /* JADX INFO: renamed from: n */
    public InterfaceC12653b0 mo6374n() {
        throw new C7346m(null, 1, null);
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public InterfaceC6009d m47274o(@NotNull C12654c config) {
        Intrinsics.checkNotNullParameter(config, "config");
        throw new C7346m(null, 1, null);
    }

    /* JADX INFO: renamed from: p */
    public void m47275p() {
        m47258J();
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public List<AbstractC0072b> m47276q(@NotNull Map<Class<? extends InterfaceC0071a>, InterfaceC0071a> autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        return C7699p.m31892k();
    }

    @NotNull
    /* JADX INFO: renamed from: r, reason: from getter */
    public final C13027a getCloseBarrier() {
        return this.closeBarrier;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final InterfaceC7906p0 m47278s() {
        InterfaceC7906p0 interfaceC7906p0 = this.coroutineScope;
        if (interfaceC7906p0 != null) {
            return interfaceC7906p0;
        }
        Intrinsics.m31998u("coroutineScope");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public C1075c m47279t() {
        C1075c c1075c = this.internalTracker;
        if (c1075c != null) {
            return c1075c;
        }
        Intrinsics.m31998u("internalTracker");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public InterfaceC6009d m47280u() {
        C12677p c12677p = this.connectionManager;
        if (c12677p == null) {
            Intrinsics.m31998u("connectionManager");
            c12677p = null;
        }
        InterfaceC6009d interfaceC6009dM47234G = c12677p.getSupportOpenHelper();
        if (interfaceC6009dM47234G != null) {
            return interfaceC6009dM47234G;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final CoroutineContext m47281v() {
        InterfaceC7906p0 interfaceC7906p0 = this.coroutineScope;
        if (interfaceC7906p0 == null) {
            Intrinsics.m31998u("coroutineScope");
            interfaceC7906p0 = null;
        }
        return interfaceC7906p0.getCoroutineContext();
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public Set<InterfaceC6567c<? extends InterfaceC0071a>> mo6376w() {
        Set<Class<? extends InterfaceC0071a>> setM47282x = m47282x();
        ArrayList arrayList = new ArrayList(C7701q.m31905u(setM47282x, 10));
        Iterator<T> it = setM47282x.iterator();
        while (it.hasNext()) {
            arrayList.add(C13450a.m49050c((Class) it.next()));
        }
        return CollectionsKt.m31691Q0(arrayList);
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public Set<Class<? extends InterfaceC0071a>> m47282x() {
        return C7702q0.m31908d();
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public Map<InterfaceC6567c<?>, List<InterfaceC6567c<?>>> mo6377y() {
        Set<Map.Entry<Class<?>, List<Class<?>>>> setEntrySet = m47249A().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7764d.m32078c(C7688j0.m31790f(C7701q.m31905u(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Class cls = (Class) entry.getKey();
            List list = (List) entry.getValue();
            InterfaceC6567c interfaceC6567cM49050c = C13450a.m49050c(cls);
            List list2 = list;
            ArrayList arrayList = new ArrayList(C7701q.m31905u(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(C13450a.m49050c((Class) it2.next()));
            }
            Pair pairM30477a = C7352s.m30477a(interfaceC6567cM49050c, arrayList);
            linkedHashMap.put(pairM30477a.m31673c(), pairM30477a.m31674d());
        }
        return linkedHashMap;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final Map<InterfaceC6567c<?>, List<InterfaceC6567c<?>>> m47283z() {
        return mo6377y();
    }
}
