package com.roblox.client.scheduledwork;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.work.AbstractC1117c;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.roblox.client.startup.FlagCacheUtils;
import com.roblox.universalapp.logging.LoggingProtocol;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p015ak.FetchFlagResult;
import p151gk.C6130w;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p536x5.AbstractC12719p0;
import pt.AbstractC10342d;
import pt.C10340b;
import pt.InterfaceC10344f;
import sg.C11295a1;
import th.C11659h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m31665d2 = {"Lcom/roblox/client/scheduledwork/FlagFetchWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "(Lnt/b;)Ljava/lang/Object;", "", "c", "()Z", "", "b", "()V", "a", "Landroid/content/Context;", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class FlagFetchWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: com.roblox.client.scheduledwork.FlagFetchWorker$b */
    @InterfaceC10344f(m39663c = "com.roblox.client.scheduledwork.FlagFetchWorker", m39664f = "FlagFetchWorker.kt", m39665l = {63}, m39666m = "doWork", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3249b extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public boolean f12160t;

        /* JADX INFO: renamed from: u */
        public int f12161u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f12162v;

        /* JADX INFO: renamed from: x */
        public int f12164x;

        public C3249b(InterfaceC9557b<? super C3249b> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12162v = obj;
            this.f12164x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
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

    /* JADX INFO: renamed from: b */
    public final void m15489b() {
        AbstractC12719p0.INSTANCE.m47401a(this.context).mo47394a("fetch_flags");
    }

    /* JADX INFO: renamed from: c */
    public final boolean m15490c() {
        return System.currentTimeMillis() - C11295a1.m42422U(this.context).getLong("last_startup_time", 0L) <= TimeUnit.DAYS.toMillis(8L);
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
    public Object doWork(@NotNull InterfaceC9557b<? super AbstractC1117c.a> interfaceC9557b) throws Throwable {
        C3249b c3249b;
        ?? r8;
        boolean z10;
        Exception e10;
        CancellationException e11;
        boolean z11;
        int i10;
        AbstractC1117c.a aVarM6341c;
        boolean z12;
        FetchFlagResult fetchFlagResult;
        String lowerCase;
        if (interfaceC9557b instanceof C3249b) {
            C3249b c3249b2 = (C3249b) interfaceC9557b;
            int i11 = c3249b2.f12164x;
            if ((i11 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                c3249b2.f12164x = i11 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                c3249b = c3249b2;
            } else {
                c3249b = new C3249b(interfaceC9557b);
            }
        } else {
            c3249b = new C3249b(interfaceC9557b);
        }
        Object obj = c3249b.f12162v;
        Object objM38805e = C10047c.m38805e();
        int i12 = c3249b.f12164x;
        int i13 = 1;
        try {
            if (i12 == 0) {
                C7348o.m30470b(obj);
                Log.i("FlagCacheFetchWorker", "Scheduled FlagFetchWorker started");
                if (C11659h.m43403a().mo43467J() && C6130w.m27099a(this.context).equals("foreground")) {
                    Log.i("FlagCacheFetchWorker", "FlagFetchWorker skipped for foreground app");
                    LoggingProtocol.m16000m("skip_flag_fetch_worker_app_foreground", null, 2, null);
                    AbstractC1117c.a aVarM6342d = AbstractC1117c.a.m6342d();
                    Intrinsics.checkNotNullExpressionValue(aVarM6342d, "success(...)");
                    return aVarM6342d;
                }
                boolean zMo43541T5 = C11659h.m43403a().mo43541T5();
                if (zMo43541T5) {
                    LoggingProtocol.m16000m("flag_fetch_worker_start", null, 2, null);
                } else {
                    LoggingProtocol.m15999l("flag_fetch_worker_start_origin", C10340b.m39662e(SystemClock.elapsedRealtime()));
                }
                LoggingProtocol.m15999l("flag_fetch_worker_start", C10340b.m39662e(SystemClock.elapsedRealtime()));
                try {
                    if (!m15490c()) {
                        Log.i("FlagCacheFetchWorker", "FlagFetchWorker: Inactivity detected, cancelling work");
                        m15489b();
                        AbstractC1117c.a aVarM6339a = AbstractC1117c.a.m6339a();
                        Intrinsics.checkNotNullExpressionValue(aVarM6339a, "failure(...)");
                        if (zMo43541T5) {
                            LoggingProtocol.m16000m("flag_fetch_worker_error", null, 2, null);
                            return aVarM6339a;
                        }
                        LoggingProtocol.m15999l("flag_fetch_worker_end_origin", C10340b.m39662e(SystemClock.elapsedRealtime()));
                        return aVarM6339a;
                    }
                    try {
                        FlagCacheUtils flagCacheUtils = FlagCacheUtils.INSTANCE;
                        Context context = this.context;
                        c3249b.f12160t = zMo43541T5;
                        c3249b.f12161u = 0;
                        c3249b.f12164x = 1;
                        Object objScheduledFetchFlag = flagCacheUtils.scheduledFetchFlag(context, c3249b);
                        if (objScheduledFetchFlag == objM38805e) {
                            return objM38805e;
                        }
                        z11 = zMo43541T5;
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
                                if (!Intrinsics.m31980c(lowerCase, "true")) {
                                    m15489b();
                                }
                            }
                            aVarM6341c = AbstractC1117c.a.m6342d();
                        } else {
                            Log.e("FlagCacheFetchWorker", "FlagFetchWorker failed to fetch flags: " + fetchFlagResult.getErrorMessage());
                            if (fetchFlagResult.getRetryable()) {
                                aVarM6341c = AbstractC1117c.a.m6341c();
                            } else {
                                aVarM6341c = AbstractC1117c.a.m6339a();
                            }
                            i13 = i10;
                        }
                        Intrinsics.checkNotNull(aVarM6341c);
                        z12 = z11;
                    } catch (CancellationException e12) {
                        e11 = e12;
                        Log.i("FlagCacheFetchWorker", "FlagFetchWorker was cancelled.");
                        throw e11;
                    } catch (Exception e13) {
                        z10 = zMo43541T5;
                        e10 = e13;
                        i13 = 0;
                        Log.e("FlagCacheFetchWorker", "FlagFetchWorker encountered an unexpected error, retrying.", e10);
                        aVarM6341c = AbstractC1117c.a.m6341c();
                        Intrinsics.checkNotNull(aVarM6341c);
                        z12 = z10;
                        if (z12) {
                            LoggingProtocol.m16000m(i13 == 0 ? "flag_fetch_worker_error" : "flag_fetch_worker_end", null, 2, null);
                        } else {
                            LoggingProtocol.m15999l("flag_fetch_worker_end_origin", C10340b.m39662e(SystemClock.elapsedRealtime()));
                        }
                        return aVarM6341c;
                    }
                } catch (Throwable th2) {
                    r8 = zMo43541T5;
                    th = th2;
                    i13 = 0;
                    if (r8 != 0) {
                        LoggingProtocol.m16000m(i13 == 0 ? "flag_fetch_worker_error" : "flag_fetch_worker_end", null, 2, null);
                    } else {
                        LoggingProtocol.m15999l("flag_fetch_worker_end_origin", C10340b.m39662e(SystemClock.elapsedRealtime()));
                    }
                    throw th;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = c3249b.f12161u;
                boolean z13 = c3249b.f12160t;
                try {
                    C7348o.m30470b(obj);
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
                                if (!Intrinsics.m31980c(lowerCase, "true")) {
                                    m15489b();
                                }
                            }
                            aVarM6341c = AbstractC1117c.a.m6342d();
                        } catch (CancellationException e14) {
                            e11 = e14;
                            Log.i("FlagCacheFetchWorker", "FlagFetchWorker was cancelled.");
                            throw e11;
                        } catch (Exception e15) {
                            e10 = e15;
                            z10 = z11;
                            Log.e("FlagCacheFetchWorker", "FlagFetchWorker encountered an unexpected error, retrying.", e10);
                            aVarM6341c = AbstractC1117c.a.m6341c();
                            Intrinsics.checkNotNull(aVarM6341c);
                            z12 = z10;
                        }
                    } else {
                        Log.e("FlagCacheFetchWorker", "FlagFetchWorker failed to fetch flags: " + fetchFlagResult.getErrorMessage());
                        if (fetchFlagResult.getRetryable()) {
                            aVarM6341c = AbstractC1117c.a.m6341c();
                        } else {
                            aVarM6341c = AbstractC1117c.a.m6339a();
                        }
                        i13 = i10;
                    }
                    Intrinsics.checkNotNull(aVarM6341c);
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
                    aVarM6341c = AbstractC1117c.a.m6341c();
                    Intrinsics.checkNotNull(aVarM6341c);
                    z12 = z10;
                    if (z12) {
                        LoggingProtocol.m16000m(i13 == 0 ? "flag_fetch_worker_error" : "flag_fetch_worker_end", null, 2, null);
                    } else {
                        LoggingProtocol.m15999l("flag_fetch_worker_end_origin", C10340b.m39662e(SystemClock.elapsedRealtime()));
                    }
                    return aVarM6341c;
                } catch (Throwable th3) {
                    th = th3;
                    i13 = i10;
                    r8 = z13;
                    if (r8 != 0) {
                        LoggingProtocol.m16000m(i13 == 0 ? "flag_fetch_worker_error" : "flag_fetch_worker_end", null, 2, null);
                    } else {
                        LoggingProtocol.m15999l("flag_fetch_worker_end_origin", C10340b.m39662e(SystemClock.elapsedRealtime()));
                    }
                    throw th;
                }
            }
            if (z12) {
                LoggingProtocol.m16000m(i13 == 0 ? "flag_fetch_worker_error" : "flag_fetch_worker_end", null, 2, null);
            } else {
                LoggingProtocol.m15999l("flag_fetch_worker_end_origin", C10340b.m39662e(SystemClock.elapsedRealtime()));
            }
            return aVarM6341c;
        } catch (Throwable th4) {
            th = th4;
            r8 = c3249b;
        }
    }
}
