package x4;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.util.Log;
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
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.d2;
import ku.p0;
import ku.q0;
import ku.v1;
import ku.z2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0017\b&\u0018\u0000 '2\u00020\u0001:\u0006]T`V\u0010YB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J#\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u00042\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u000f\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u001a\u0010\u001c\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u001a\u0012\u0004\u0012\u00020\u001b0\u0019H\u0017¢\u0006\u0004\b\u001f\u0010 J1\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u001a\u0010\u001c\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\r\u0012\u0004\u0012\u00020\u001b0\u0019H\u0017¢\u0006\u0004\b!\u0010 J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u0012H\u0015¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0015¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H$¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0007¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0007¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020/H\u0000¢\u0006\u0004\b2\u00101J)\u00103\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a0\u001d0\u0019H\u0015¢\u0006\u0004\b3\u00104J)\u00105\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u001d0\u0019H\u0015¢\u0006\u0004\b5\u00104J\u001d\u00107\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u001a06H\u0017¢\u0006\u0004\b7\u00108J\u001d\u00109\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\r06H\u0017¢\u0006\u0004\b9\u00108J\u000f\u0010:\u001a\u00020\u0004H\u0017¢\u0006\u0004\b:\u0010\u0003J\u000f\u0010;\u001a\u00020\u0004H\u0017¢\u0006\u0004\b;\u0010\u0003JB\u0010C\u001a\u00028\u0000\"\u0004\b\u0000\u0010<2\u0006\u0010>\u001a\u00020=2\"\u0010B\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020@\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000A\u0012\u0006\u0012\u0004\u0018\u00010\u00010?H\u0087@¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020=H\u0007¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0004H\u0017¢\u0006\u0004\bG\u0010\u0003J\u000f\u0010H\u001a\u00020\u0004H\u0017¢\u0006\u0004\bH\u0010\u0003J\u000f\u0010I\u001a\u00020\u0004H\u0017¢\u0006\u0004\bI\u0010\u0003J\u0017\u0010<\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020JH\u0016¢\u0006\u0004\b<\u0010KJ#\u0010M\u001a\u00028\u0000\"\u0004\b\u0000\u0010I2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000LH\u0016¢\u0006\u0004\bM\u0010NJ\u0017\u0010Q\u001a\u00020\u00042\u0006\u0010P\u001a\u00020OH\u0005¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020=H\u0016¢\u0006\u0004\bS\u0010FR\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010X\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010[\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010_\u001a\u00020\\8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010a\u001a\u00020\\8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b`\u0010^R\u0016\u0010c\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010bR\u0016\u0010e\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u0010dR\u001a\u0010j\u001a\u00020f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u0010g\u001a\u0004\bh\u0010iR\u0016\u0010l\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010kR\u0018\u0010o\u001a\u0004\u0018\u00010m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010nR\u001d\u0010u\u001a\b\u0012\u0004\u0012\u00020/0p8G¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR$\u0010x\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00010v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010wR\"\u0010|\u001a\u00020=8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010k\u001a\u0004\by\u0010F\"\u0004\bz\u0010{R\u0014\u0010~\u001a\u00020=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b}\u0010FR\u0016\u0010\u0081\u0001\u001a\u00020\\8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0017\u0010\u0084\u0001\u001a\u00020#8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0016\u0010\u0086\u0001\u001a\u00020)8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010+R0\u0010\u0088\u0001\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u001d0\u00198@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u00104R\u0016\u0010\u008a\u0001\u001a\u00020=8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010FR\u0016\u0010\u008c\u0001\u001a\u00020=8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u0010F¨\u0006\u008d\u0001"}, d2 = {"Lx4/u;", "", "<init>", "()V", "", "O", "I", "J", "T", "Lkotlin/Function0;", "body", "Q", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lhu/c;", "kclass", "converter", "f", "(Lhu/c;Ljava/lang/Object;)V", "Lx4/c;", "configuration", "H", "(Lx4/c;)V", "Lx4/p;", "l", "(Lx4/c;)Lx4/p;", "", "Ljava/lang/Class;", "La5/a;", "autoMigrationSpecs", "", "La5/b;", "q", "(Ljava/util/Map;)Ljava/util/List;", "j", "config", "Lg5/d;", "o", "(Lx4/c;)Lg5/d;", "Lx4/b0;", "n", "()Lx4/b0;", "Landroidx/room/c;", "m", "()Landroidx/room/c;", "Lku/p0;", "s", "()Lku/p0;", "Lkotlin/coroutines/CoroutineContext;", "v", "()Lkotlin/coroutines/CoroutineContext;", "C", "A", "()Ljava/util/Map;", "y", "", "x", "()Ljava/util/Set;", "w", "g", "h", "R", "", "isReadOnly", "Lkotlin/Function2;", "Lx4/g0;", "Lnt/b;", "block", "W", "(ZLkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "F", "()Z", "i", "p", "V", "Ljava/lang/Runnable;", "(Ljava/lang/Runnable;)V", "Ljava/util/concurrent/Callable;", "P", "(Ljava/util/concurrent/Callable;)Ljava/lang/Object;", "Lf5/b;", "connection", "K", "(Lf5/b;)V", "G", "a", "Lx4/c;", "b", "Lku/p0;", "coroutineScope", "c", "Lkotlin/coroutines/CoroutineContext;", "transactionContext", "Ljava/util/concurrent/Executor;", "d", "Ljava/util/concurrent/Executor;", "internalQueryExecutor", "e", "internalTransactionExecutor", "Lx4/p;", "connectionManager", "Landroidx/room/c;", "internalTracker", "Ly4/a;", "Ly4/a;", "r", "()Ly4/a;", "closeBarrier", "Z", "allowMainThreadQueries", "Lb5/b;", "Lb5/b;", "autoCloser", "Ljava/lang/ThreadLocal;", "k", "Ljava/lang/ThreadLocal;", "B", "()Ljava/lang/ThreadLocal;", "suspendingTransactionContext", "", "Ljava/util/Map;", "typeConverters", "E", "setUseTempTrackingTable$room_runtime", "(Z)V", "useTempTrackingTable", "N", "isThreadInSuspendingTransaction", "D", "()Ljava/util/concurrent/Executor;", "transactionExecutor", "u", "()Lg5/d;", "openHelper", "t", "invalidationTracker", "z", "requiredTypeConverterClassesMap", "M", "isOpenInternal", "L", "isMainThread", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public c configuration;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public p0 coroutineScope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public CoroutineContext transactionContext;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public Executor internalQueryExecutor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public Executor internalTransactionExecutor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public p connectionManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public androidx.room.c internalTracker;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public boolean allowMainThreadQueries;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public b5.b autoCloser;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final y4.a closeBarrier = new y4.a(new g(this));

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ThreadLocal<CoroutineContext> suspendingTransactionContext = new ThreadLocal<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<hu.c<?>, Object> typeConverters = new LinkedHashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public boolean useTempTrackingTable = true;

    @Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B)\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010\"\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00028\u0000H\u0016¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010'R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010(R\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001f0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010,R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010/R\u0018\u00102\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010/R\u0018\u00105\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00108\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010D\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001c\u0010Q\u001a\b\u0012\u0004\u0012\u00020N0M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020N0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010PR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020T0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010,R\u0016\u0010X\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u00107R\u0016\u0010Z\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u00107R\u0016\u0010\\\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u00107R\u0018\u0010^\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010(R\u0018\u0010b\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u001e\u0010g\u001a\n\u0012\u0004\u0012\u00020d\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010k\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0018\u0010o\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0016\u0010q\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u00107¨\u0006r"}, d2 = {"Lx4/u$a;", "Lx4/u;", "T", "", "Landroid/content/Context;", "context", "Ljava/lang/Class;", "klass", "", "name", "<init>", "(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)V", "Lg5/d$c;", "factory", "f", "(Lg5/d$c;)Lx4/u$a;", "", "La5/b;", "migrations", "b", "([La5/b;)Lx4/u$a;", "c", "()Lx4/u$a;", "Ljava/util/concurrent/Executor;", "executor", "g", "(Ljava/util/concurrent/Executor;)Lx4/u$a;", "", "dropAllTables", "e", "(Z)Lx4/u$a;", "Lx4/u$b;", "callback", "a", "(Lx4/u$b;)Lx4/u$a;", "d", "()Lx4/u;", "Lhu/c;", "Lhu/c;", "Landroid/content/Context;", "Ljava/lang/String;", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "", "Ljava/util/List;", "callbacks", "typeConverters", "Ljava/util/concurrent/Executor;", "queryExecutor", "h", "transactionExecutor", "i", "Lg5/d$c;", "supportOpenHelperFactory", "j", "Z", "allowMainThreadQueries", "Lx4/u$d;", "k", "Lx4/u$d;", "journalMode", "Landroid/content/Intent;", "l", "Landroid/content/Intent;", "multiInstanceInvalidationIntent", "", "m", "J", "autoCloseTimeout", "Ljava/util/concurrent/TimeUnit;", "n", "Ljava/util/concurrent/TimeUnit;", "autoCloseTimeUnit", "Lx4/u$e;", "o", "Lx4/u$e;", "migrationContainer", "", "", "p", "Ljava/util/Set;", "migrationsNotRequiredFrom", "q", "migrationStartAndEndVersions", "La5/a;", "r", "autoMigrationSpecs", "s", "requireMigration", "t", "allowDestructiveMigrationOnDowngrade", "u", "allowDestructiveMigrationForAllTables", "v", "copyFromAssetPath", "Ljava/io/File;", "w", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "x", "Ljava/util/concurrent/Callable;", "copyFromInputStream", "Lf5/c;", "y", "Lf5/c;", "driver", "Lkotlin/coroutines/CoroutineContext;", "z", "Lkotlin/coroutines/CoroutineContext;", "queryCoroutineContext", "A", "inMemoryTrackingTableMode", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class a<T extends u> {

        /* JADX INFO: renamed from: A, reason: from kotlin metadata */
        public boolean inMemoryTrackingTableMode;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final hu.c<T> klass;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final Context context;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String name;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Function0<T> factory;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<b> callbacks;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<Object> typeConverters;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Executor queryExecutor;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Executor transactionExecutor;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public g5.d.c supportOpenHelperFactory;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        public boolean allowMainThreadQueries;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public d journalMode;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Intent multiInstanceInvalidationIntent;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        public long autoCloseTimeout;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public TimeUnit autoCloseTimeUnit;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final e migrationContainer;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public Set<Integer> migrationsNotRequiredFrom;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Set<Integer> migrationStartAndEndVersions;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<a5.a> autoMigrationSpecs;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        public boolean requireMigration;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        public boolean allowDestructiveMigrationOnDowngrade;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
        public boolean allowDestructiveMigrationForAllTables;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String copyFromAssetPath;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public File copyFromFile;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Callable<InputStream> copyFromInputStream;

        /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public f5.c driver;

        /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
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
            this.klass = yt.a.c(klass);
            this.context = context;
            this.name = str;
            this.factory = null;
        }

        @NotNull
        public a<T> a(@NotNull b callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.callbacks.add(callback);
            return this;
        }

        @NotNull
        public a<T> b(@NotNull a5.b... migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            for (a5.b bVar : migrations) {
                this.migrationStartAndEndVersions.add(Integer.valueOf(bVar.startVersion));
                this.migrationStartAndEndVersions.add(Integer.valueOf(bVar.endVersion));
            }
            this.migrationContainer.b((a5.b[]) Arrays.copyOf(migrations, migrations.length));
            return this;
        }

        @NotNull
        public a<T> c() {
            this.allowMainThreadQueries = true;
            return this;
        }

        @NotNull
        public T d() {
            g5.d.c mVar;
            g5.d.c cVar;
            T tInvoke;
            Executor executor = this.queryExecutor;
            if (executor == null && this.transactionExecutor == null) {
                Executor executorF = r.c.f();
                this.transactionExecutor = executorF;
                this.queryExecutor = executorF;
            } else if (executor != null && this.transactionExecutor == null) {
                this.transactionExecutor = executor;
            } else if (executor == null) {
                this.queryExecutor = this.transactionExecutor;
            }
            v.c(this.migrationStartAndEndVersions, this.migrationsNotRequiredFrom);
            f5.c cVar2 = this.driver;
            if (cVar2 == null && this.supportOpenHelperFactory == null) {
                mVar = new h5.i();
            } else if (cVar2 == null) {
                mVar = this.supportOpenHelperFactory;
            } else {
                if (this.supportOpenHelperFactory != null) {
                    throw new IllegalArgumentException("A RoomDatabase cannot be configured with both a SQLiteDriver and a SupportOpenHelper.Factory.");
                }
                mVar = null;
            }
            boolean z10 = this.autoCloseTimeout > 0;
            boolean z11 = (this.copyFromAssetPath == null && this.copyFromFile == null && this.copyFromInputStream == null) ? false : true;
            if (mVar != null) {
                if (z10) {
                    if (this.name == null) {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                    }
                    long j10 = this.autoCloseTimeout;
                    TimeUnit timeUnit = this.autoCloseTimeUnit;
                    if (timeUnit == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    mVar = new b5.k(mVar, new b5.b(j10, timeUnit, null, 4, null));
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
                    mVar = new b5.m(str, file, callable, mVar);
                }
                cVar = mVar;
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
            d dVarB = this.journalMode.b(context);
            Executor executor2 = this.queryExecutor;
            if (executor2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor3 = this.transactionExecutor;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            c cVar3 = new c(context, str2, cVar, eVar, list, z12, dVarB, executor2, executor3, this.multiInstanceInvalidationIntent, this.requireMigration, this.allowDestructiveMigrationOnDowngrade, this.migrationsNotRequiredFrom, this.copyFromAssetPath, this.copyFromFile, this.copyFromInputStream, null, this.typeConverters, this.autoMigrationSpecs, this.allowDestructiveMigrationForAllTables, this.driver, this.queryCoroutineContext);
            cVar3.g(this.inMemoryTrackingTableMode);
            Function0<T> function0 = this.factory;
            if (function0 == null || (tInvoke = function0.invoke()) == null) {
                tInvoke = (T) c5.f.b(yt.a.a(this.klass), null, 2, null);
            }
            tInvoke.H(cVar3);
            return tInvoke;
        }

        @NotNull
        public final a<T> e(boolean dropAllTables) {
            this.requireMigration = false;
            this.allowDestructiveMigrationOnDowngrade = true;
            this.allowDestructiveMigrationForAllTables = dropAllTables;
            return this;
        }

        @NotNull
        public a<T> f(@Nullable g5.d.c factory) {
            this.supportOpenHelperFactory = factory;
            return this;
        }

        @NotNull
        public a<T> g(@NotNull Executor executor) {
            Intrinsics.checkNotNullParameter(executor, "executor");
            if (this.queryCoroutineContext != null) {
                throw new IllegalArgumentException("This builder has already been configured with a CoroutineContext. A RoomDatabasecan only be configured with either an Executor or a CoroutineContext.");
            }
            this.queryExecutor = executor;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lx4/u$b;", "", "<init>", "()V", "Lg5/c;", "db", "", "b", "(Lg5/c;)V", "Lf5/b;", "connection", "a", "(Lf5/b;)V", "d", "c", "f", "e", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b {
        public void a(@NotNull f5.b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            if (connection instanceof i5.a) {
                b(((i5.a) connection).getDb());
            }
        }

        public void b(@NotNull g5.c db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }

        public void c(@NotNull f5.b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            if (connection instanceof i5.a) {
                d(((i5.a) connection).getDb());
            }
        }

        public void d(@NotNull g5.c db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }

        public void e(@NotNull f5.b connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            if (connection instanceof i5.a) {
                f(((i5.a) connection).getDb());
            }
        }

        public void f(@NotNull g5.c db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\u0006j\u0002\b\t¨\u0006\n"}, d2 = {"Lx4/u$d;", "", "<init>", "(Ljava/lang/String;I)V", "Landroid/content/Context;", "context", "b", "(Landroid/content/Context;)Lx4/u$d;", "a", "c", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum d {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ qt.a f34889e = qt.b.a(a());

        @NotNull
        public final d b(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            return (activityManager == null || activityManager.isLowRamDevice()) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r0\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00132\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010\u001e\u001a\"\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001d\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ7\u0010 \u001a\"\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001d\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u000eH\u0000¢\u0006\u0004\b \u0010\u001fR,\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#¨\u0006$"}, d2 = {"Lx4/u$e;", "", "<init>", "()V", "", "La5/b;", "migrations", "", "b", "([La5/b;)V", "migration", "a", "(La5/b;)V", "", "", "e", "()Ljava/util/Map;", "start", "end", "", "d", "(II)Ljava/util/List;", "startVersion", "endVersion", "", "c", "(II)Z", "migrationStart", "Lkotlin/Pair;", "", "g", "(I)Lkotlin/Pair;", "f", "", "Ljava/util/TreeMap;", "Ljava/util/Map;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Map<Integer, TreeMap<Integer, a5.b>> migrations = new LinkedHashMap();

        public final void a(@NotNull a5.b migration) {
            Intrinsics.checkNotNullParameter(migration, "migration");
            int i10 = migration.startVersion;
            int i11 = migration.endVersion;
            Map<Integer, TreeMap<Integer, a5.b>> map = this.migrations;
            Integer numValueOf = Integer.valueOf(i10);
            TreeMap<Integer, a5.b> treeMap = map.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                map.put(numValueOf, treeMap);
            }
            TreeMap<Integer, a5.b> treeMap2 = treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i11))) {
                Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i11)) + " with " + migration);
            }
            treeMap2.put(Integer.valueOf(i11), migration);
        }

        public void b(@NotNull a5.b... migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            for (a5.b bVar : migrations) {
                a(bVar);
            }
        }

        public final boolean c(int startVersion, int endVersion) {
            return c5.h.a(this, startVersion, endVersion);
        }

        @Nullable
        public List<a5.b> d(int start, int end) {
            return c5.h.b(this, start, end);
        }

        @NotNull
        public Map<Integer, Map<Integer, a5.b>> e() {
            return this.migrations;
        }

        @Nullable
        public final Pair<Map<Integer, a5.b>, Iterable<Integer>> f(int migrationStart) {
            TreeMap<Integer, a5.b> treeMap = this.migrations.get(Integer.valueOf(migrationStart));
            if (treeMap == null) {
                return null;
            }
            return jt.s.a(treeMap, treeMap.descendingKeySet());
        }

        @Nullable
        public final Pair<Map<Integer, a5.b>, Iterable<Integer>> g(int migrationStart) {
            TreeMap<Integer, a5.b> treeMap = this.migrations.get(Integer.valueOf(migrationStart));
            if (treeMap == null) {
                return null;
            }
            return jt.s.a(treeMap, treeMap.keySet());
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lx4/u$f;", "", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class f {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class g extends kotlin.jvm.internal.k implements Function0<Unit> {
        public g(Object obj) {
            super(0, obj, u.class, "onClosed", "onClosed()V", 0);
        }

        public final void d() {
            ((u) this.receiver).O();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            d();
            return Unit.f22483a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class h extends kotlin.jvm.internal.k implements Function2<Function1<? super nt.b<? super Object>, ? extends Object>, nt.b<? super Object>, Object> {
        public h(Object obj) {
            super(2, obj, x.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Function1<? super nt.b<Object>, ? extends Object> function1, nt.b<Object> bVar) {
            return v.a((u) this.receiver, function1, bVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class i extends kotlin.jvm.internal.k implements Function2<Function1<? super nt.b<? super Object>, ? extends Object>, nt.b<? super Object>, Object> {
        public i(Object obj) {
            super(2, obj, x.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Function1<? super nt.b<Object>, ? extends Object> function1, nt.b<Object> bVar) {
            return v.a((u) this.receiver, function1, bVar);
        }
    }

    public static final Unit S(Runnable runnable) {
        runnable.run();
        return Unit.f22483a;
    }

    public static final Object T(Callable callable) {
        return callable.call();
    }

    public static final Object U(Function0 function0, f5.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return function0.invoke();
    }

    public static final g5.d k(u uVar, c config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return uVar.o(config);
    }

    @NotNull
    public Map<Class<?>, List<Class<?>>> A() {
        return kotlin.collections.k0.j();
    }

    @NotNull
    public final ThreadLocal<CoroutineContext> B() {
        return this.suspendingTransactionContext;
    }

    @NotNull
    public final CoroutineContext C() {
        CoroutineContext coroutineContext = this.transactionContext;
        if (coroutineContext != null) {
            return coroutineContext;
        }
        Intrinsics.u("transactionContext");
        return null;
    }

    @NotNull
    public Executor D() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        Intrinsics.u("internalTransactionExecutor");
        return null;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final boolean getUseTempTrackingTable() {
        return this.useTempTrackingTable;
    }

    public final boolean F() {
        p pVar = this.connectionManager;
        if (pVar == null) {
            Intrinsics.u("connectionManager");
            pVar = null;
        }
        return pVar.getSupportOpenHelper() != null;
    }

    public boolean G() {
        return M() && u().t2().D();
    }

    public void H(@NotNull c configuration) {
        CoroutineContext coroutineContext;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.configuration = configuration;
        this.useTempTrackingTable = configuration.getUseTempTrackingTable();
        this.connectionManager = l(configuration);
        this.internalTracker = m();
        v.b(this, configuration);
        v.d(this, configuration);
        CoroutineContext coroutineContext2 = configuration.queryCoroutineContext;
        p0 p0Var = null;
        if (coroutineContext2 != null) {
            CoroutineContext.Element element = coroutineContext2.get(kotlin.coroutines.d.INSTANCE);
            Intrinsics.d(element, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
            ku.l0 l0Var = (ku.l0) element;
            Executor executorA = v1.a(l0Var);
            this.internalQueryExecutor = executorA;
            if (executorA == null) {
                Intrinsics.u("internalQueryExecutor");
                executorA = null;
            }
            this.internalTransactionExecutor = new e0(executorA);
            this.coroutineScope = q0.a(configuration.queryCoroutineContext.plus(z2.a((d2) configuration.queryCoroutineContext.get(d2.INSTANCE))));
            if (F()) {
                p0 p0Var2 = this.coroutineScope;
                if (p0Var2 == null) {
                    Intrinsics.u("coroutineScope");
                    p0Var2 = null;
                }
                coroutineContext = p0Var2.getCoroutineContext().plus(l0Var.I(1));
            } else {
                p0 p0Var3 = this.coroutineScope;
                if (p0Var3 == null) {
                    Intrinsics.u("coroutineScope");
                    p0Var3 = null;
                }
                coroutineContext = p0Var3.getCoroutineContext();
            }
            this.transactionContext = coroutineContext;
        } else {
            this.internalQueryExecutor = configuration.queryExecutor;
            this.internalTransactionExecutor = new e0(configuration.transactionExecutor);
            Executor executor = this.internalQueryExecutor;
            if (executor == null) {
                Intrinsics.u("internalQueryExecutor");
                executor = null;
            }
            p0 p0VarA = q0.a(v1.b(executor).plus(z2.b(null, 1, null)));
            this.coroutineScope = p0VarA;
            if (p0VarA == null) {
                Intrinsics.u("coroutineScope");
                p0VarA = null;
            }
            CoroutineContext coroutineContext3 = p0VarA.getCoroutineContext();
            Executor executor2 = this.internalTransactionExecutor;
            if (executor2 == null) {
                Intrinsics.u("internalTransactionExecutor");
                executor2 = null;
            }
            this.transactionContext = coroutineContext3.plus(v1.b(executor2));
        }
        this.allowMainThreadQueries = configuration.allowMainThreadQueries;
        p pVar = this.connectionManager;
        if (pVar == null) {
            Intrinsics.u("connectionManager");
            pVar = null;
        }
        g5.d dVarG = pVar.getSupportOpenHelper();
        if (dVarG != null) {
            while (!(dVarG instanceof b5.l)) {
                if (!(dVarG instanceof x4.d)) {
                    dVarG = null;
                    break;
                }
                dVarG = ((x4.d) dVarG).getDelegate();
            }
        } else {
            dVarG = null;
            break;
        }
        b5.l lVar = (b5.l) dVarG;
        if (lVar != null) {
            lVar.d(configuration);
        }
        p pVar2 = this.connectionManager;
        if (pVar2 == null) {
            Intrinsics.u("connectionManager");
            pVar2 = null;
        }
        g5.d dVarG2 = pVar2.getSupportOpenHelper();
        if (dVarG2 != null) {
            while (!(dVarG2 instanceof b5.g)) {
                if (!(dVarG2 instanceof x4.d)) {
                    dVarG2 = null;
                    break;
                }
                dVarG2 = ((x4.d) dVarG2).getDelegate();
            }
        } else {
            dVarG2 = null;
            break;
        }
        b5.g gVar = (b5.g) dVarG2;
        if (gVar != null) {
            this.autoCloser = gVar.getAutoCloser();
            b5.b bVarB = gVar.getAutoCloser();
            p0 p0Var4 = this.coroutineScope;
            if (p0Var4 == null) {
                Intrinsics.u("coroutineScope");
            } else {
                p0Var = p0Var4;
            }
            bVarB.k(p0Var);
            t().y(gVar.getAutoCloser());
        }
        if (configuration.multiInstanceInvalidationServiceIntent != null) {
            if (configuration.name == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            t().n(configuration.context, configuration.name, configuration.multiInstanceInvalidationServiceIntent);
        }
    }

    public final void I() {
        g();
        g5.c cVarT2 = u().t2();
        if (!cVarT2.D()) {
            t().B();
        }
        if (cVarT2.b3()) {
            cVarT2.u0();
        } else {
            cVarT2.G();
        }
    }

    public final void J() {
        u().t2().G0();
        if (G()) {
            return;
        }
        t().v();
    }

    public final void K(@NotNull f5.b connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        t().o(connection);
    }

    public final boolean L() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public final boolean M() {
        b5.b bVar = this.autoCloser;
        if (bVar != null) {
            g5.c cVarI = bVar.getDelegateDatabase();
            if (cVarI != null) {
                return cVarI.isOpen();
            }
            return false;
        }
        p pVar = this.connectionManager;
        if (pVar == null) {
            Intrinsics.u("connectionManager");
            pVar = null;
        }
        return pVar.J();
    }

    public final boolean N() {
        CoroutineContext coroutineContext = this.suspendingTransactionContext.get();
        return (coroutineContext != null ? (c0) coroutineContext.get(c0.INSTANCE) : null) != null;
    }

    public final void O() {
        p0 p0Var = this.coroutineScope;
        p pVar = null;
        if (p0Var == null) {
            Intrinsics.u("coroutineScope");
            p0Var = null;
        }
        q0.f(p0Var, null, 1, null);
        t().z();
        p pVar2 = this.connectionManager;
        if (pVar2 == null) {
            Intrinsics.u("connectionManager");
        } else {
            pVar = pVar2;
        }
        pVar.F();
    }

    public <V> V P(@NotNull final Callable<V> body) {
        Intrinsics.checkNotNullParameter(body, "body");
        return (V) Q(new Function0() { // from class: x4.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u.T(body);
            }
        });
    }

    public final <T> T Q(final Function0<? extends T> body) {
        if (!F()) {
            return (T) c5.a.c(this, false, true, new Function1() { // from class: x4.t
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u.U(body, (f5.b) obj);
                }
            });
        }
        i();
        try {
            T tInvoke = body.invoke();
            V();
            return tInvoke;
        } finally {
            p();
        }
    }

    public void R(@NotNull final Runnable body) {
        Intrinsics.checkNotNullParameter(body, "body");
        Q(new Function0() { // from class: x4.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u.S(body);
            }
        });
    }

    public void V() {
        u().t2().q0();
    }

    @Nullable
    public final <R> Object W(boolean z10, @NotNull Function2<? super g0, ? super nt.b<? super R>, ? extends Object> function2, @NotNull nt.b<? super R> bVar) {
        p pVar = this.connectionManager;
        if (pVar == null) {
            Intrinsics.u("connectionManager");
            pVar = null;
        }
        return pVar.K(z10, function2, bVar);
    }

    public final void f(@NotNull hu.c<?> kclass, @NotNull Object converter) {
        Intrinsics.checkNotNullParameter(kclass, "kclass");
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.typeConverters.put(kclass, converter);
    }

    public void g() {
        if (!this.allowMainThreadQueries && L()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void h() {
        if (F() && !G() && N()) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public void i() {
        g();
        I();
    }

    @NotNull
    public List<a5.b> j(@NotNull Map<hu.c<? extends a5.a>, ? extends a5.a> autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.j0.f(autoMigrationSpecs.size()));
        Iterator<T> it = autoMigrationSpecs.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(yt.a.a((hu.c) entry.getKey()), entry.getValue());
        }
        return q(linkedHashMap);
    }

    @NotNull
    public final p l(@NotNull c configuration) {
        a0 a0Var;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        try {
            b0 b0VarN = n();
            Intrinsics.d(b0VarN, "null cannot be cast to non-null type androidx.room.RoomOpenDelegate");
            a0Var = (a0) b0VarN;
        } catch (jt.m unused) {
            a0Var = null;
        }
        return a0Var == null ? new p(configuration, (Function1<? super c, ? extends g5.d>) new Function1() { // from class: x4.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u.k(this.f34844a, (c) obj);
            }
        }, new h(this)) : new p(configuration, a0Var, new i(this));
    }

    @NotNull
    public abstract androidx.room.c m();

    @NotNull
    public b0 n() {
        throw new jt.m(null, 1, null);
    }

    @NotNull
    public g5.d o(@NotNull c config) {
        Intrinsics.checkNotNullParameter(config, "config");
        throw new jt.m(null, 1, null);
    }

    public void p() {
        J();
    }

    @NotNull
    public List<a5.b> q(@NotNull Map<Class<? extends a5.a>, a5.a> autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        return kotlin.collections.p.k();
    }

    @NotNull
    /* JADX INFO: renamed from: r, reason: from getter */
    public final y4.a getCloseBarrier() {
        return this.closeBarrier;
    }

    @NotNull
    public final p0 s() {
        p0 p0Var = this.coroutineScope;
        if (p0Var != null) {
            return p0Var;
        }
        Intrinsics.u("coroutineScope");
        return null;
    }

    @NotNull
    public androidx.room.c t() {
        androidx.room.c cVar = this.internalTracker;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.u("internalTracker");
        return null;
    }

    @NotNull
    public g5.d u() {
        p pVar = this.connectionManager;
        if (pVar == null) {
            Intrinsics.u("connectionManager");
            pVar = null;
        }
        g5.d dVarG = pVar.getSupportOpenHelper();
        if (dVarG != null) {
            return dVarG;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    @NotNull
    public final CoroutineContext v() {
        p0 p0Var = this.coroutineScope;
        if (p0Var == null) {
            Intrinsics.u("coroutineScope");
            p0Var = null;
        }
        return p0Var.getCoroutineContext();
    }

    @NotNull
    public Set<hu.c<? extends a5.a>> w() {
        Set<Class<? extends a5.a>> setX = x();
        ArrayList arrayList = new ArrayList(kotlin.collections.q.u(setX, 10));
        Iterator<T> it = setX.iterator();
        while (it.hasNext()) {
            arrayList.add(yt.a.c((Class) it.next()));
        }
        return CollectionsKt.Q0(arrayList);
    }

    @NotNull
    public Set<Class<? extends a5.a>> x() {
        return kotlin.collections.q0.d();
    }

    @NotNull
    public Map<hu.c<?>, List<hu.c<?>>> y() {
        Set<Map.Entry<Class<?>, List<Class<?>>>> setEntrySet = A().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.d.c(kotlin.collections.j0.f(kotlin.collections.q.u(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Class cls = (Class) entry.getKey();
            List list = (List) entry.getValue();
            hu.c cVarC = yt.a.c(cls);
            List list2 = list;
            ArrayList arrayList = new ArrayList(kotlin.collections.q.u(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(yt.a.c((Class) it2.next()));
            }
            Pair pairA = jt.s.a(cVarC, arrayList);
            linkedHashMap.put(pairA.c(), pairA.d());
        }
        return linkedHashMap;
    }

    @NotNull
    public final Map<hu.c<?>, List<hu.c<?>>> z() {
        return y();
    }
}
