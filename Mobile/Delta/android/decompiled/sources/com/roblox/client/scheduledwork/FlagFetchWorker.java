package com.roblox.client.scheduledwork;

import ak.FetchFlagResult;
import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import com.roblox.client.startup.FlagCacheUtils;
import com.roblox.universalapp.logging.LoggingProtocol;
import gk.v;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import jt.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.d;
import pt.f;
import sg.a1;
import th.h;
import x5.p0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/roblox/client/scheduledwork/FlagFetchWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "(Lnt/b;)Ljava/lang/Object;", "", "c", "()Z", "", "b", "()V", "a", "Landroid/content/Context;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FlagFetchWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    @f(c = "com.roblox.client.scheduledwork.FlagFetchWorker", f = "FlagFetchWorker.kt", l = {63}, m = "doWork", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b extends d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f9336t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f9337u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f9338v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f9340x;

        public b(nt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9338v = obj;
            this.f9340x |= Integer.MIN_VALUE;
            return FlagFetchWorker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlagFetchWorker(@NotNull Context context, @NotNull WorkerParameters params) {
        super(context, params);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        this.context = context;
    }

    public final void b() {
        p0.INSTANCE.a(this.context).a("fetch_flags");
    }

    public final boolean c() {
        return System.currentTimeMillis() - a1.U(this.context).getLong("last_startup_time", 0L) <= TimeUnit.DAYS.toMillis(8L);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00f6 A[Catch: all -> 0x0038, Exception -> 0x003c, CancellationException -> 0x0040, TRY_LEAVE, TryCatch #7 {CancellationException -> 0x0040, Exception -> 0x003c, all -> 0x0038, blocks: (B:12:0x0033, B:47:0x00ee, B:49:0x00f6, B:63:0x0136, B:65:0x0154, B:67:0x015a), top: B:96:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0101 A[Catch: all -> 0x0129, Exception -> 0x012c, CancellationException -> 0x012e, TryCatch #6 {all -> 0x0129, blocks: (B:50:0x00fb, B:52:0x0101, B:54:0x0125, B:61:0x0131, B:69:0x015f, B:75:0x016f, B:83:0x0191, B:84:0x0196), top: B:93:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0125 A[Catch: all -> 0x0129, Exception -> 0x012c, CancellationException -> 0x012e, TryCatch #6 {all -> 0x0129, blocks: (B:50:0x00fb, B:52:0x0101, B:54:0x0125, B:61:0x0131, B:69:0x015f, B:75:0x016f, B:83:0x0191, B:84:0x0196), top: B:93:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0136 A[Catch: all -> 0x0038, Exception -> 0x003c, CancellationException -> 0x0040, TRY_ENTER, TryCatch #7 {CancellationException -> 0x0040, Exception -> 0x003c, all -> 0x0038, blocks: (B:12:0x0033, B:47:0x00ee, B:49:0x00f6, B:63:0x0136, B:65:0x0154, B:67:0x015a), top: B:96:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0154 A[Catch: all -> 0x0038, Exception -> 0x003c, CancellationException -> 0x0040, TryCatch #7 {CancellationException -> 0x0040, Exception -> 0x003c, all -> 0x0038, blocks: (B:12:0x0033, B:47:0x00ee, B:49:0x00f6, B:63:0x0136, B:65:0x0154, B:67:0x015a), top: B:96:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x015a A[Catch: all -> 0x0038, Exception -> 0x003c, CancellationException -> 0x0040, TRY_LEAVE, TryCatch #7 {CancellationException -> 0x0040, Exception -> 0x003c, all -> 0x0038, blocks: (B:12:0x0033, B:47:0x00ee, B:49:0x00f6, B:63:0x0136, B:65:0x0154, B:67:0x015a), top: B:96:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x017d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x0180  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:0x0185  */
    /* JADX WARN: Code duplicated, block: B:86:0x0199 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x019c  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a1  */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x0136, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.work.CoroutineWorker
    @Nullable
    public Object doWork(@NotNull nt.b<? super c.a> bVar) throws Throwable {
        b bVar2;
        ?? r8;
        boolean z10;
        Exception e10;
        CancellationException e11;
        boolean z11;
        int i10;
        c.a aVarC;
        boolean z12;
        FetchFlagResult fetchFlagResult;
        String lowerCase;
        if (bVar instanceof b) {
            b bVar3 = (b) bVar;
            int i11 = bVar3.f9340x;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar3.f9340x = i11 - Integer.MIN_VALUE;
                bVar2 = bVar3;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object obj = bVar2.f9338v;
        Object objE = ot.c.e();
        int i12 = bVar2.f9340x;
        int i13 = 1;
        try {
            if (i12 == 0) {
                o.b(obj);
                Log.i("FlagCacheFetchWorker", "Scheduled FlagFetchWorker started");
                if (h.a().G() && v.a(this.context).equals("foreground")) {
                    Log.i("FlagCacheFetchWorker", "FlagFetchWorker skipped for foreground app");
                    LoggingProtocol.m("skip_flag_fetch_worker_app_foreground", null, 2, null);
                    c.a aVarD = c.a.d();
                    Intrinsics.checkNotNullExpressionValue(aVarD, "success(...)");
                    return aVarD;
                }
                boolean zN5 = h.a().N5();
                if (zN5) {
                    LoggingProtocol.m("flag_fetch_worker_start", null, 2, null);
                } else {
                    LoggingProtocol.l("flag_fetch_worker_start_origin", pt.b.e(SystemClock.elapsedRealtime()));
                }
                LoggingProtocol.l("flag_fetch_worker_start", pt.b.e(SystemClock.elapsedRealtime()));
                try {
                    if (!c()) {
                        Log.i("FlagCacheFetchWorker", "FlagFetchWorker: Inactivity detected, cancelling work");
                        b();
                        c.a aVarA = c.a.a();
                        Intrinsics.checkNotNullExpressionValue(aVarA, "failure(...)");
                        if (zN5) {
                            LoggingProtocol.m("flag_fetch_worker_error", null, 2, null);
                            return aVarA;
                        }
                        LoggingProtocol.l("flag_fetch_worker_end_origin", pt.b.e(SystemClock.elapsedRealtime()));
                        return aVarA;
                    }
                    try {
                        FlagCacheUtils flagCacheUtils = FlagCacheUtils.INSTANCE;
                        Context context = this.context;
                        bVar2.f9336t = zN5;
                        bVar2.f9337u = 0;
                        bVar2.f9340x = 1;
                        Object objScheduledFetchFlag = flagCacheUtils.scheduledFetchFlag(context, bVar2);
                        if (objScheduledFetchFlag == objE) {
                            return objE;
                        }
                        z11 = zN5;
                        obj = objScheduledFetchFlag;
                        i10 = 0;
                        fetchFlagResult = (FetchFlagResult) obj;
                        if (fetchFlagResult.getSuccess()) {
                            Log.i("FlagCacheFetchWorker", "FlagFetchWorker successfully fetched and cached flags");
                            if (fetchFlagResult.getResponseJson() != null) {
                                String strOptString = fetchFlagResult.getResponseJson().optString("BeginScheduledFlagFetch5", "");
                                Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
                                lowerCase = strOptString.toLowerCase(Locale.ROOT);
                                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                                if (!Intrinsics.c(lowerCase, "true")) {
                                    b();
                                }
                            }
                            aVarC = c.a.d();
                        } else {
                            Log.e("FlagCacheFetchWorker", "FlagFetchWorker failed to fetch flags: " + fetchFlagResult.getErrorMessage());
                            if (fetchFlagResult.getRetryable()) {
                                aVarC = c.a.c();
                            } else {
                                aVarC = c.a.a();
                            }
                            i13 = i10;
                        }
                        Intrinsics.checkNotNull(aVarC);
                        z12 = z11;
                    } catch (CancellationException e12) {
                        e11 = e12;
                        Log.i("FlagCacheFetchWorker", "FlagFetchWorker was cancelled.");
                        throw e11;
                    } catch (Exception e13) {
                        z10 = zN5;
                        e10 = e13;
                        i13 = 0;
                        Log.e("FlagCacheFetchWorker", "FlagFetchWorker encountered an unexpected error, retrying.", e10);
                        aVarC = c.a.c();
                        Intrinsics.checkNotNull(aVarC);
                        z12 = z10;
                        if (z12) {
                            LoggingProtocol.m(i13 == 0 ? "flag_fetch_worker_error" : "flag_fetch_worker_end", null, 2, null);
                        } else {
                            LoggingProtocol.l("flag_fetch_worker_end_origin", pt.b.e(SystemClock.elapsedRealtime()));
                        }
                        return aVarC;
                    }
                } catch (Throwable th2) {
                    r8 = zN5;
                    th = th2;
                    i13 = 0;
                    if (r8 != 0) {
                        LoggingProtocol.m(i13 == 0 ? "flag_fetch_worker_error" : "flag_fetch_worker_end", null, 2, null);
                    } else {
                        LoggingProtocol.l("flag_fetch_worker_end_origin", pt.b.e(SystemClock.elapsedRealtime()));
                    }
                    throw th;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = bVar2.f9337u;
                boolean z13 = bVar2.f9336t;
                try {
                    o.b(obj);
                    z11 = z13;
                    fetchFlagResult = (FetchFlagResult) obj;
                    if (fetchFlagResult.getSuccess()) {
                        Log.i("FlagCacheFetchWorker", "FlagFetchWorker successfully fetched and cached flags");
                        try {
                            if (fetchFlagResult.getResponseJson() != null) {
                                String strOptString2 = fetchFlagResult.getResponseJson().optString("BeginScheduledFlagFetch5", "");
                                Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
                                lowerCase = strOptString2.toLowerCase(Locale.ROOT);
                                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                                if (!Intrinsics.c(lowerCase, "true")) {
                                    b();
                                }
                            }
                            aVarC = c.a.d();
                        } catch (CancellationException e14) {
                            e11 = e14;
                            Log.i("FlagCacheFetchWorker", "FlagFetchWorker was cancelled.");
                            throw e11;
                        } catch (Exception e15) {
                            e10 = e15;
                            z10 = z11;
                            Log.e("FlagCacheFetchWorker", "FlagFetchWorker encountered an unexpected error, retrying.", e10);
                            aVarC = c.a.c();
                            Intrinsics.checkNotNull(aVarC);
                            z12 = z10;
                        }
                    } else {
                        Log.e("FlagCacheFetchWorker", "FlagFetchWorker failed to fetch flags: " + fetchFlagResult.getErrorMessage());
                        if (fetchFlagResult.getRetryable()) {
                            aVarC = c.a.c();
                        } else {
                            aVarC = c.a.a();
                        }
                        i13 = i10;
                    }
                    Intrinsics.checkNotNull(aVarC);
                    z12 = z11;
                } catch (CancellationException e16) {
                    e11 = e16;
                    Log.i("FlagCacheFetchWorker", "FlagFetchWorker was cancelled.");
                    throw e11;
                } catch (Exception e17) {
                    e10 = e17;
                    i13 = i10;
                    z10 = z13;
                    Log.e("FlagCacheFetchWorker", "FlagFetchWorker encountered an unexpected error, retrying.", e10);
                    aVarC = c.a.c();
                    Intrinsics.checkNotNull(aVarC);
                    z12 = z10;
                    if (z12) {
                        LoggingProtocol.m(i13 == 0 ? "flag_fetch_worker_error" : "flag_fetch_worker_end", null, 2, null);
                    } else {
                        LoggingProtocol.l("flag_fetch_worker_end_origin", pt.b.e(SystemClock.elapsedRealtime()));
                    }
                    return aVarC;
                } catch (Throwable th3) {
                    th = th3;
                    i13 = i10;
                    r8 = z13;
                    if (r8 != 0) {
                        LoggingProtocol.m(i13 == 0 ? "flag_fetch_worker_error" : "flag_fetch_worker_end", null, 2, null);
                    } else {
                        LoggingProtocol.l("flag_fetch_worker_end_origin", pt.b.e(SystemClock.elapsedRealtime()));
                    }
                    throw th;
                }
            }
            if (z12) {
                LoggingProtocol.m(i13 == 0 ? "flag_fetch_worker_error" : "flag_fetch_worker_end", null, 2, null);
            } else {
                LoggingProtocol.l("flag_fetch_worker_end_origin", pt.b.e(SystemClock.elapsedRealtime()));
            }
            return aVarC;
        } catch (Throwable th4) {
            th = th4;
            r8 = bVar2;
        }
    }
}
