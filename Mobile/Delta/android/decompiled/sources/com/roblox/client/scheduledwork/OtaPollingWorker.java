package com.roblox.client.scheduledwork;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Log;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.client.scheduledwork.OtaPollingWorker;
import gk.v;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import jt.n;
import jt.o;
import jt.s;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.y;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import ku.g1;
import ku.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import pt.f;
import pt.l;
import pt.m;
import sg.a1;
import th.h;
import x5.a;
import x5.g0;
import x5.i;
import x5.j;
import x5.p0;
import x5.x;
import x5.z;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 12\u00020\u0001:\u0002/1B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nJ*\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0004\b!\u0010\"J'\u0010'\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u000b2\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002¢\u0006\u0004\b'\u0010(J\u0019\u0010*\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Lcom/roblox/client/scheduledwork/OtaPollingWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "(Lnt/b;)Ljava/lang/Object;", "", "behaviorName", "configUrl", "Landroid/content/SharedPreferences;", "prefs", "Lcom/roblox/client/scheduledwork/OtaPollingWorker$b;", "q", "(Ljava/lang/String;Ljava/lang/String;Landroid/content/SharedPreferences;Lnt/b;)Ljava/lang/Object;", "", "behaviorNames", "", "r", "(Landroid/content/SharedPreferences;Ljava/util/Set;)V", "url", "Ljava/io/File;", "dest", "j", "(Ljava/lang/String;Ljava/io/File;Lnt/b;)Ljava/lang/Object;", "Lorg/json/JSONArray;", "l", "(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "Ljava/net/HttpURLConnection;", "p", "(Ljava/lang/String;)Ljava/net/HttpURLConnection;", "eventName", "", "Lcom/roblox/client/datastructures/NameValuePair;", "extraParams", "n", "(Ljava/lang/String;Ljava/util/List;)V", "message", "k", "(Ljava/lang/String;)Ljava/lang/String;", "", "m", "()Z", "a", "Landroid/content/Context;", "b", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OtaPollingWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f9348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f9349d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: com.roblox.client.scheduledwork.OtaPollingWorker$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\u0014\u0010\u001a\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/roblox/client/scheduledwork/OtaPollingWorker$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "b", "(Landroid/content/Context;)V", "a", "", "WORK_TAG", "Ljava/lang/String;", "TAG", "OTA_WORKER_BLOBS_DIR", "WORKER_BLOB_PREFIX", "Lkotlin/time/a;", "CONNECT_TIMEOUT", "J", "READ_TIMEOUT", "", "MAX_RETRY_ATTEMPTS", "I", "DEFAULT_INACTIVITY_DAYS", "KEY_MAX_RETRY_ATTEMPTS", "KEY_INACTIVITY_DAYS", "PREF_LAST_STARTUP_TIME", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            p0.INSTANCE.a(context).a("background_ota_polling");
        }

        public final void b(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            boolean zG5 = h.a().G5();
            boolean zX1 = h.a().x1();
            if (zG5) {
                Log.i("OtaPollingWorker", "DEV scheduleOtaPolling: enabled=" + zX1);
            }
            if (!zX1) {
                if (Intrinsics.c(v.a(context), "foreground")) {
                    a(context);
                    p0.INSTANCE.a(context).b("background_ota_polling_debug_once");
                    return;
                }
                return;
            }
            if (zG5) {
                p0.INSTANCE.a(context).g("background_ota_polling_debug_once", j.KEEP, new z.a(OtaPollingWorker.class).a("background_ota_polling_debug_once").n(30L, TimeUnit.SECONDS).k(new x5.d.a().b(x.CONNECTED).a()).b());
                Log.i("OtaPollingWorker", "DEV scheduleOtaPolling: enqueued one-time debug work (30s delay, KEEP — kill app within 30s to test dead-process wakeup)");
            } else {
                p0.INSTANCE.a(context).b("background_ota_polling_debug_once");
            }
            boolean zJ4 = h.a().j4();
            long jR4 = h.a().R4();
            long jY = h.a().Y();
            int iH1 = h.a().h1();
            int iA5 = h.a().A5();
            x5.d dVarA = new x5.d.a().b(zJ4 ? x.UNMETERED : x.CONNECTED).c(true).f(true).a();
            TimeUnit timeUnit = TimeUnit.MINUTES;
            g0.a aVarI = new g0.a(OtaPollingWorker.class, jR4, timeUnit, jY, timeUnit).a("background_ota_polling").k(dVarA).i(a.EXPONENTIAL, 10L, TimeUnit.SECONDS);
            Pair[] pairArr = {s.a("max_retry_attempts", Integer.valueOf(iH1)), s.a("inactivity_days", Integer.valueOf(iA5))};
            b.a aVar = new b.a();
            for (int i10 = 0; i10 < 2; i10++) {
                Pair pair = pairArr[i10];
                aVar.b((String) pair.c(), pair.d());
            }
            g0 g0VarB = aVarI.o(aVar.a()).b();
            SharedPreferences sharedPreferencesU = a1.U(context);
            Intrinsics.checkNotNullExpressionValue(sharedPreferencesU, "getKeyValues(...)");
            SharedPreferences.Editor editorEdit = sharedPreferencesU.edit();
            editorEdit.putLong("last_startup_time", System.currentTimeMillis());
            editorEdit.apply();
            p0.INSTANCE.a(context).e("background_ota_polling", i.UPDATE, g0VarB);
            if (zG5) {
                Log.i("OtaPollingWorker", "DEV scheduleOtaPolling: enqueued periodic work tag=background_ota_polling intervalMin=" + jR4 + " flexMin=" + jY);
            }
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.scheduledwork.OtaPollingWorker$b, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/roblox/client/scheduledwork/OtaPollingWorker$b;", "", "", "assetId", "assetVersion", "<init>", "(JJ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PollResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        public final long assetId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final long assetVersion;

        public PollResult(long j10, long j11) {
            this.assetId = j10;
            this.assetVersion = j11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getAssetId() {
            return this.assetId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getAssetVersion() {
            return this.assetVersion;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PollResult)) {
                return false;
            }
            PollResult pollResult = (PollResult) other;
            return this.assetId == pollResult.assetId && this.assetVersion == pollResult.assetVersion;
        }

        public int hashCode() {
            return (Long.hashCode(this.assetId) * 31) + Long.hashCode(this.assetVersion);
        }

        @NotNull
        public String toString() {
            return "PollResult(assetId=" + this.assetId + ", assetVersion=" + this.assetVersion + ")";
        }
    }

    @f(c = "com.roblox.client.scheduledwork.OtaPollingWorker", f = "OtaPollingWorker.kt", l = {249}, m = "doWork", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c extends pt.d {
        public long A;
        public /* synthetic */ Object B;
        public int D;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f9352t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f9353u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f9354v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f9355w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f9356x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f9357y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f9358z;

        public c(nt.b<? super c> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.B = obj;
            this.D |= Integer.MIN_VALUE;
            return OtaPollingWorker.this.doWork(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.scheduledwork.OtaPollingWorker$doWork$2", f = "OtaPollingWorker.kt", l = {260}, m = "invokeSuspend", v = 1)
    public static final class d extends m implements Function2<ku.p0, nt.b<? super Unit>, Object> {
        public final /* synthetic */ y A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9359t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9360u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f9361v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f9362w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ SharedPreferences f9364y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Set<String> f9365z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(SharedPreferences sharedPreferences, Set<String> set, y yVar, nt.b<? super d> bVar) {
            super(2, bVar);
            this.f9364y = sharedPreferences;
            this.f9365z = set;
            this.A = yVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return OtaPollingWorker.this.new d(this.f9364y, this.f9365z, this.A, bVar);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0043  */
        /* JADX WARN: Code duplicated, block: B:17:0x0054 A[LOOP:0: B:13:0x003d->B:17:0x0054, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:20:0x0084 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:30:0x006e A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0082 -> B:21:0x0085). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // pt.a
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 302
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.scheduledwork.OtaPollingWorker.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku.p0 p0Var, nt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @f(c = "com.roblox.client.scheduledwork.OtaPollingWorker", f = "OtaPollingWorker.kt", l = {340, 393}, m = "pollBehavior", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class e extends pt.d {
        public Object A;
        public Object B;
        public Object C;
        public Object D;
        public Object E;
        public Object F;
        public long G;
        public long H;
        public boolean I;
        public /* synthetic */ Object J;
        public int L;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9366t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9367u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f9368v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f9369w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f9370x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f9371y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f9372z;

        public e(nt.b<? super e> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.J = obj;
            this.L |= Integer.MIN_VALUE;
            return OtaPollingWorker.this.q(null, null, null, this);
        }
    }

    static {
        kotlin.time.a.Companion companion = kotlin.time.a.INSTANCE;
        ju.b bVar = ju.b.SECONDS;
        f9348c = kotlin.time.b.p(10, bVar);
        f9349d = kotlin.time.b.p(30, bVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtaPollingWorker(@NotNull Context context, @NotNull WorkerParameters params) {
        super(context, params);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        this.context = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void o(OtaPollingWorker otaPollingWorker, String str, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = p.k();
        }
        otaPollingWorker.n(str, list);
    }

    public static final String s(SharedPreferences sharedPreferences, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return sharedPreferences.getString(OtaConfigHandler.KEY_WORKER_PENDING_PREFIX + it, null);
    }

    public static final List t(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return CollectionsKt.H0(StringsKt.split$default(it, new String[]{":"}, false, 3, 2, null), 2);
    }

    public static final boolean u(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.size() == 2;
    }

    public static final String v(List list) {
        Intrinsics.checkNotNullParameter(list, "<destruct>");
        return "WorkerBlob_" + ((String) list.get(0)) + "_" + ((String) list.get(1));
    }

    public static final void w(@NotNull Context context) {
        INSTANCE.b(context);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x024d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0255  */
    /* JADX WARN: Code duplicated, block: B:68:0x026e A[Catch: all -> 0x02ce, TRY_LEAVE, TryCatch #5 {all -> 0x02ce, blocks: (B:66:0x026a, B:68:0x026e, B:73:0x02d0), top: B:76:0x026a }] */
    /* JADX WARN: Code duplicated, block: B:73:0x02d0 A[Catch: all -> 0x02ce, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x02ce, blocks: (B:66:0x026a, B:68:0x026e, B:73:0x02d0), top: B:76:0x026a }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Override // androidx.work.CoroutineWorker
    @Nullable
    public Object doWork(@NotNull nt.b<? super androidx.work.c.a> bVar) throws Throwable {
        c cVar;
        y yVar;
        String str;
        String str2;
        long j10;
        String str3;
        String str4;
        long j11;
        if (bVar instanceof c) {
            cVar = (c) bVar;
            int i10 = cVar.D;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.D = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(bVar);
            }
        } else {
            cVar = new c(bVar);
        }
        c cVar2 = cVar;
        Object obj = cVar2.B;
        Object objE = ot.c.e();
        int i11 = cVar2.D;
        if (i11 == 0) {
            o.b(obj);
            if (!h.a().x1()) {
                o(this, "ota_polling_worker_flag_disabled_cancelled", null, 2, null);
                INSTANCE.a(this.context);
                androidx.work.c.a aVarD = androidx.work.c.a.d();
                Intrinsics.checkNotNullExpressionValue(aVarD, "success(...)");
                return aVarD;
            }
            boolean zContains = getTags().contains("background_ota_polling_debug_once");
            String strA = v.a(this.context);
            Log.i("OtaPollingWorker", "OtaPollingWorker started: clientState=" + strA + " isDebugOnce=" + zContains);
            if (!zContains && Intrinsics.c(strA, "foreground")) {
                Log.i("OtaPollingWorker", "OtaPollingWorker: app in foreground, skipping (in-process timer active)");
                o(this, "ota_polling_worker_skipped_foreground", null, 2, null);
                androidx.work.c.a aVarD2 = androidx.work.c.a.d();
                Intrinsics.checkNotNullExpressionValue(aVarD2, "success(...)");
                return aVarD2;
            }
            if (!m()) {
                Log.i("OtaPollingWorker", "OtaPollingWorker: app inactive beyond threshold, cancelling work");
                o(this, "ota_polling_worker_inactivity_cancelled", null, 2, null);
                INSTANCE.a(this.context);
                p0.INSTANCE.a(this.context).b("background_ota_polling_debug_once");
                androidx.work.c.a aVarD3 = androidx.work.c.a.d();
                Intrinsics.checkNotNullExpressionValue(aVarD3, "success(...)");
                return aVarD3;
            }
            int iD = getInputData().d("max_retry_attempts", 3);
            if (getRunAttemptCount() > iD) {
                Log.w("OtaPollingWorker", "OtaPollingWorker: exceeded " + iD + " consecutive retries (attempt " + getRunAttemptCount() + "), giving up for this period");
                o(this, "ota_polling_worker_retry_exhausted", null, 2, null);
                androidx.work.c.a aVarA = androidx.work.c.a.a();
                Intrinsics.checkNotNullExpressionValue(aVarA, "failure(...)");
                return aVarA;
            }
            boolean zG = com.roblox.client.flags.b.f9037a.g();
            n("ota_polling_worker_start", p.n(new NameValuePair("native_lib_loaded", String.valueOf(zG)), new NameValuePair("run_attempt_count", String.valueOf(getRunAttemptCount()))));
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            yVar = new y();
            try {
                SharedPreferences otaPrefs = OtaConfigHandler.getOtaPrefs(this.context);
                Set<String> activeBehaviorNames = OtaConfigHandler.getActiveBehaviorNames(otaPrefs);
                if (activeBehaviorNames.isEmpty()) {
                    Log.i("OtaPollingWorker", "OtaPollingWorker: no behaviors registered yet, nothing to poll");
                    androidx.work.c.a aVarD4 = androidx.work.c.a.d();
                    Intrinsics.checkNotNullExpressionValue(aVarD4, "success(...)");
                    n("ota_polling_worker_end", p.n(new NameValuePair("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime)), new NameValuePair("run_attempt_count", String.valueOf(getRunAttemptCount()))));
                    return aVarD4;
                }
                l0 l0VarB = g1.b();
                str3 = "ota_polling_worker_end";
                str4 = "run_attempt_count";
                j10 = jElapsedRealtime;
                try {
                    d dVar = new d(otaPrefs, activeBehaviorNames, yVar, null);
                    cVar2.f9354v = l.a(strA);
                    cVar2.f9355w = yVar;
                    cVar2.f9356x = l.a(otaPrefs);
                    cVar2.f9357y = l.a(activeBehaviorNames);
                    cVar2.f9352t = zContains;
                    cVar2.f9358z = iD;
                    cVar2.f9353u = zG;
                    cVar2.A = j10;
                    cVar2.D = 1;
                    if (ku.i.g(l0VarB, dVar, cVar2) == objE) {
                        return objE;
                    }
                    j11 = j10;
                    n(str3, p.n(new NameValuePair("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - j11)), new NameValuePair(str4, String.valueOf(getRunAttemptCount()))));
                    if (yVar.f22568a) {
                        androidx.work.c.a aVarC = androidx.work.c.a.c();
                        Intrinsics.checkNotNullExpressionValue(aVarC, "retry(...)");
                        return aVarC;
                    }
                    androidx.work.c.a aVarD5 = androidx.work.c.a.d();
                    Intrinsics.checkNotNullExpressionValue(aVarD5, "success(...)");
                    return aVarD5;
                } catch (Exception e10) {
                    e = e10;
                    str = str3;
                    str2 = str4;
                    if (!(e instanceof CancellationException)) {
                        throw e;
                    }
                    Log.e("OtaPollingWorker", "OtaPollingWorker: fatal error", e);
                    n("ota_polling_worker_error", p.n(new NameValuePair("error_type", e.getClass().getSimpleName()), new NameValuePair("failed_host", k(e.getMessage()))));
                    androidx.work.c.a aVarC2 = androidx.work.c.a.c();
                    Intrinsics.checkNotNullExpressionValue(aVarC2, "retry(...)");
                    n(str, p.n(new NameValuePair("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - j10)), new NameValuePair(str2, String.valueOf(getRunAttemptCount()))));
                    return aVarC2;
                } catch (Throwable th2) {
                    th = th2;
                    str = str3;
                    str2 = str4;
                }
            } catch (Exception e11) {
                e = e11;
                str = "ota_polling_worker_end";
                str2 = "run_attempt_count";
                j10 = jElapsedRealtime;
            } catch (Throwable th3) {
                th = th3;
                str = "ota_polling_worker_end";
                str2 = "run_attempt_count";
                j10 = jElapsedRealtime;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j11 = cVar2.A;
            yVar = (y) cVar2.f9355w;
            try {
                o.b(obj);
                str3 = "ota_polling_worker_end";
                str4 = "run_attempt_count";
                n(str3, p.n(new NameValuePair("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - j11)), new NameValuePair(str4, String.valueOf(getRunAttemptCount()))));
                if (yVar.f22568a) {
                    androidx.work.c.a aVarC3 = androidx.work.c.a.c();
                    Intrinsics.checkNotNullExpressionValue(aVarC3, "retry(...)");
                    return aVarC3;
                }
                androidx.work.c.a aVarD6 = androidx.work.c.a.d();
                Intrinsics.checkNotNullExpressionValue(aVarD6, "success(...)");
                return aVarD6;
            } catch (Exception e12) {
                e = e12;
                str2 = "run_attempt_count";
                str = "ota_polling_worker_end";
                j10 = j11;
                try {
                    if (!(e instanceof CancellationException)) {
                        throw e;
                    }
                    Log.e("OtaPollingWorker", "OtaPollingWorker: fatal error", e);
                    n("ota_polling_worker_error", p.n(new NameValuePair("error_type", e.getClass().getSimpleName()), new NameValuePair("failed_host", k(e.getMessage()))));
                    androidx.work.c.a aVarC4 = androidx.work.c.a.c();
                    Intrinsics.checkNotNullExpressionValue(aVarC4, "retry(...)");
                    n(str, p.n(new NameValuePair("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - j10)), new NameValuePair(str2, String.valueOf(getRunAttemptCount()))));
                    return aVarC4;
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
                str2 = "run_attempt_count";
                str = "ota_polling_worker_end";
                j10 = j11;
            }
        }
        n(str, p.n(new NameValuePair("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - j10)), new NameValuePair(str2, String.valueOf(getRunAttemptCount()))));
        throw th;
    }

    public final Object j(String str, File file, nt.b<? super Unit> bVar) throws Exception {
        File file2 = new File(file.getParent(), file.getName() + ".tmp." + getId());
        try {
            HttpURLConnection httpURLConnectionP = p(str);
            int responseCode = httpURLConnectionP.getResponseCode();
            if (responseCode != 200) {
                throw new IOException("HTTP " + responseCode + " downloading blob " + str);
            }
            Log.i("OtaPollingWorker", "OtaPollingWorker: blob HTTP " + responseCode + " contentLength=" + httpURLConnectionP.getContentLengthLong() + " dest=" + file.getName());
            InputStream inputStream = httpURLConnectionP.getInputStream();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    Intrinsics.checkNotNull(inputStream);
                    ut.b.b(inputStream, fileOutputStream, 0, 2, null);
                    ut.c.a(fileOutputStream, null);
                    ut.c.a(inputStream, null);
                    Log.i("OtaPollingWorker", "OtaPollingWorker: blob copy complete size=" + file2.length() + " dest=" + file.getName());
                    if (file2.renameTo(file)) {
                        return Unit.f22483a;
                    }
                    throw new IOException("Failed to rename " + file2 + " to " + file);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ut.c.a(fileOutputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    ut.c.a(inputStream, th4);
                    throw th5;
                }
            }
        } catch (Exception e10) {
            file2.delete();
            throw e10;
        }
    }

    public final String k(String message) {
        Object objB;
        if (message == null) {
            return "unknown";
        }
        try {
            n.Companion companion = n.INSTANCE;
            objB = n.b(new URL(StringsKt.f1(message, " ", null, 2, null)).getHost());
        } catch (Throwable th2) {
            n.Companion companion2 = n.INSTANCE;
            objB = n.b(o.a(th2));
        }
        return (String) (n.g(objB) ? "unknown" : objB);
    }

    public final Object l(String str, nt.b<? super JSONArray> bVar) throws IOException {
        HttpURLConnection httpURLConnectionP = p(str);
        int responseCode = httpURLConnectionP.getResponseCode();
        if (responseCode != 200) {
            throw new IOException("HTTP " + responseCode + " fetching " + str);
        }
        InputStream inputStream = httpURLConnectionP.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), 8192);
        try {
            String strH = ut.n.h(bufferedReader);
            ut.c.a(bufferedReader, null);
            return new JSONArray(strH);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ut.c.a(bufferedReader, th2);
                throw th3;
            }
        }
    }

    public final boolean m() {
        SharedPreferences sharedPreferencesU = a1.U(this.context);
        kotlin.time.a.Companion companion = kotlin.time.a.INSTANCE;
        long j10 = sharedPreferencesU.getLong("last_startup_time", 0L);
        ju.b bVar = ju.b.MILLISECONDS;
        return kotlin.time.a.j(kotlin.time.a.L(kotlin.time.b.q(System.currentTimeMillis(), bVar), kotlin.time.b.q(j10, bVar)), kotlin.time.b.q((long) getInputData().d("inactivity_days", 3), ju.b.DAYS)) <= 0;
    }

    public final void n(String eventName, List<? extends NameValuePair> extraParams) {
        OtaConfigHandler.INSTANCE.logEvent$NativeShell_googleProdRelease(eventName, "background_ota_worker", extraParams);
    }

    public final HttpURLConnection p(String url) throws IOException {
        URLConnection uRLConnectionOpenConnection = new URL(url).openConnection();
        Intrinsics.d(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setConnectTimeout((int) kotlin.time.a.w(f9348c));
        httpURLConnection.setReadTimeout((int) kotlin.time.a.w(f9349d));
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return httpURLConnection;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:94:0x03ee  */
    /* JADX WARN: Instruction removed from duplicated block: B:94:0x03ee, please report this as an issue */
    public final Object q(String str, String str2, SharedPreferences sharedPreferences, nt.b<? super PollResult> bVar) throws IOException {
        e eVar;
        Object obj;
        String patchStorageKey;
        String perUserPatchKey;
        String str3;
        Object obj2;
        String str4;
        String str5;
        JSONObject jSONObjectOptJSONObject;
        long jOptLong;
        String str6;
        long jOptLong2;
        SharedPreferences sharedPreferences2;
        File file;
        Object objB;
        boolean zBooleanValue;
        String host;
        String str7;
        String str8;
        long j10;
        long j11;
        String str9;
        File file2;
        SharedPreferences sharedPreferences3;
        SharedPreferences sharedPreferences4 = sharedPreferences;
        if (bVar instanceof e) {
            eVar = (e) bVar;
            int i10 = eVar.L;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.L = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(bVar);
            }
        } else {
            eVar = new e(bVar);
        }
        Object obj3 = eVar.J;
        Object objE = ot.c.e();
        int i11 = eVar.L;
        if (i11 == 0) {
            obj = null;
            o.b(obj3);
            Log.d("OtaPollingWorker", "OtaPollingWorker: polling " + str + " from " + str2);
            OtaConfigHandler otaConfigHandler = OtaConfigHandler.INSTANCE;
            patchStorageKey = otaConfigHandler.getPatchStorageKey(sharedPreferences4, str);
            if (patchStorageKey == null) {
                Log.w("OtaPollingWorker", "OtaPollingWorker: no patchStorageKey for " + str + " yet, skipping");
                return null;
            }
            String baseUrl = otaConfigHandler.getBaseUrl(sharedPreferences4);
            if (baseUrl == null) {
                Log.w("OtaPollingWorker", "OtaPollingWorker: no base URL for blob download yet, skipping");
                return null;
            }
            perUserPatchKey = otaConfigHandler.getPerUserPatchKey(sharedPreferences4, str);
            if (perUserPatchKey == null) {
                Log.w("OtaPollingWorker", "OtaPollingWorker: no perUserPatchKey for " + str + " yet, skipping");
                return null;
            }
            eVar.f9366t = str;
            eVar.f9367u = l.a(str2);
            eVar.f9368v = sharedPreferences4;
            eVar.f9369w = patchStorageKey;
            eVar.f9370x = baseUrl;
            eVar.f9371y = perUserPatchKey;
            eVar.L = 1;
            Object objL = l(str2, eVar);
            if (objL == objE) {
                return objE;
            }
            str3 = str;
            obj2 = objL;
            str4 = str2;
            str5 = baseUrl;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z10 = eVar.I;
                j11 = eVar.H;
                j10 = eVar.G;
                file2 = (File) eVar.C;
                jSONObjectOptJSONObject = (JSONObject) eVar.A;
                sharedPreferences3 = (SharedPreferences) eVar.f9368v;
                str9 = (String) eVar.f9366t;
                try {
                    o.b(obj3);
                    zBooleanValue = z10;
                    jOptLong2 = j11;
                    sharedPreferences2 = sharedPreferences3;
                    str3 = str9;
                    jOptLong = j10;
                    file = file2;
                    SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
                    editorEdit.putString(OtaConfigHandler.KEY_WORKER_PENDING_PREFIX + str3, jOptLong + ":" + jOptLong2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(OtaConfigHandler.KEY_CONFIG_JSON_PREFIX);
                    sb2.append(str3);
                    editorEdit.putString(sb2.toString(), OtaConfigHandler.INSTANCE.buildStorageConfig(jSONObjectOptJSONObject).toString());
                    editorEdit.apply();
                    if (zBooleanValue) {
                        Log.w("OtaPollingWorker", "DEV: pending marker written for " + str3 + "=" + jOptLong + ":" + jOptLong2);
                    }
                    Log.i("OtaPollingWorker", "OtaPollingWorker: blob downloaded for " + str3 + " at " + file.getAbsolutePath());
                    return new PollResult(jOptLong, jOptLong2);
                } catch (IOException e10) {
                    e = e10;
                    str6 = ")";
                    str7 = " assetVersion=";
                    Log.e("OtaPollingWorker", "OtaPollingWorker: download failed for " + str9 + " assetId=" + j10 + str7 + j11 + " (" + e.getClass().getSimpleName() + ": " + e.getMessage() + str6);
                    throw e;
                }
            }
            String str10 = (String) eVar.f9371y;
            str5 = (String) eVar.f9370x;
            String str11 = (String) eVar.f9369w;
            SharedPreferences sharedPreferences5 = (SharedPreferences) eVar.f9368v;
            str4 = (String) eVar.f9367u;
            obj = null;
            str3 = (String) eVar.f9366t;
            o.b(obj3);
            perUserPatchKey = str10;
            obj2 = obj3;
            patchStorageKey = str11;
            sharedPreferences4 = sharedPreferences5;
        }
        JSONArray jSONArray = (JSONArray) obj2;
        if (jSONArray.length() == 0) {
            Log.w("OtaPollingWorker", "OtaPollingWorker: empty config array for " + str3);
            return obj;
        }
        String str12 = str5;
        String str13 = str4;
        jSONObjectOptJSONObject = jSONArray.optJSONObject(0);
        if (jSONObjectOptJSONObject == null) {
            return obj;
        }
        SharedPreferences sharedPreferences6 = sharedPreferences4;
        e eVar2 = eVar;
        jOptLong = jSONObjectOptJSONObject.optLong("assetId", 0L);
        str6 = ")";
        jOptLong2 = jSONObjectOptJSONObject.optLong("assetVersion", 0L);
        if (jOptLong == 0 || jOptLong2 == 0) {
            Log.w("OtaPollingWorker", "OtaPollingWorker: invalid patch config for " + str3 + " (assetId=" + jOptLong + ", assetVersion=" + jOptLong2 + str6);
            return obj;
        }
        OtaConfigHandler otaConfigHandler2 = OtaConfigHandler.INSTANCE;
        sharedPreferences2 = sharedPreferences6;
        Long pendingWorkerBlobVersion = otaConfigHandler2.getPendingWorkerBlobVersion(sharedPreferences2, str3);
        if (pendingWorkerBlobVersion == null) {
            pendingWorkerBlobVersion = otaConfigHandler2.getCachedAssetVersionFromAppStorage(this.context, patchStorageKey, perUserPatchKey);
        }
        if (pendingWorkerBlobVersion != null && pendingWorkerBlobVersion.longValue() == jOptLong2) {
            Log.i("OtaPollingWorker", "OtaPollingWorker: " + str3 + " already at version " + jOptLong2 + ", skipping download");
            n("ota_polling_worker_no_update", p.n(new NameValuePair("behavior_name", str3), new NameValuePair("asset_version", String.valueOf(jOptLong2))));
            return obj;
        }
        Long l10 = pendingWorkerBlobVersion;
        String str14 = patchStorageKey;
        File file3 = new File(this.context.getFilesDir(), "appData/OTAWorkerBlobs");
        file3.mkdirs();
        file = new File(file3, "WorkerBlob_" + jOptLong + "_" + jOptLong2);
        try {
            n.Companion companion = n.INSTANCE;
            objB = n.b(pt.b.a(h.a().G5()));
        } catch (Throwable th2) {
            n.Companion companion2 = n.INSTANCE;
            objB = n.b(o.a(th2));
        }
        Boolean boolA = pt.b.a(false);
        if (n.g(objB)) {
            objB = boolA;
        }
        zBooleanValue = ((Boolean) objB).booleanValue();
        if (zBooleanValue) {
            Log.w("OtaPollingWorker", "DEV: blobFile path=" + file.getAbsolutePath() + " perUserPatchKey=" + perUserPatchKey);
        }
        if (file.exists()) {
            pt.b.d(Log.i("OtaPollingWorker", "OtaPollingWorker: blob for " + str3 + " already on disk, updating pending marker"));
        } else {
            Log.i("OtaPollingWorker", "OtaPollingWorker: downloading patch for " + str3 + " assetId=" + jOptLong + " assetVersion=" + jOptLong2);
            Uri uri = Uri.parse(str12);
            String host2 = uri.getHost();
            if (host2 == null || (host = kotlin.text.x.P(host2, "www.", "assetdelivery.", false, 4, null)) == null) {
                host = uri.getHost();
            }
            String str15 = perUserPatchKey;
            Uri.Builder builderScheme = new Uri.Builder().scheme(uri.getScheme());
            str7 = " assetVersion=";
            if (uri.getPort() != -1) {
                str8 = host + ":" + uri.getPort();
            } else {
                str8 = host;
            }
            String string = builderScheme.encodedAuthority(str8).path("/v1/asset/").appendQueryParameter("id", String.valueOf(jOptLong)).appendQueryParameter("version", String.valueOf(jOptLong2)).build().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            try {
                eVar2.f9366t = str3;
                eVar2.f9367u = l.a(str13);
                eVar2.f9368v = sharedPreferences2;
                eVar2.f9369w = l.a(str14);
                eVar2.f9370x = l.a(str12);
                eVar2.f9371y = l.a(str15);
                eVar2.f9372z = l.a(jSONArray);
                eVar2.A = jSONObjectOptJSONObject;
                eVar2.B = l.a(l10);
                eVar2.C = file;
                eVar2.D = l.a(uri);
                eVar2.E = l.a(host);
                eVar2.F = l.a(string);
                eVar2.G = jOptLong;
                eVar2.H = jOptLong2;
                eVar2.I = zBooleanValue;
                eVar2.L = 2;
                try {
                    if (j(string, file, eVar2) == objE) {
                        return objE;
                    }
                    file2 = file;
                    j10 = jOptLong;
                    str9 = str3;
                    sharedPreferences3 = sharedPreferences2;
                    j11 = jOptLong2;
                    jOptLong2 = j11;
                    sharedPreferences2 = sharedPreferences3;
                    str3 = str9;
                    jOptLong = j10;
                    file = file2;
                } catch (IOException e11) {
                    e = e11;
                    j10 = jOptLong;
                    j11 = jOptLong2;
                    str9 = str3;
                    Log.e("OtaPollingWorker", "OtaPollingWorker: download failed for " + str9 + " assetId=" + j10 + str7 + j11 + " (" + e.getClass().getSimpleName() + ": " + e.getMessage() + str6);
                    throw e;
                }
            } catch (IOException e12) {
                e = e12;
            }
        }
        SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
        editorEdit2.putString(OtaConfigHandler.KEY_WORKER_PENDING_PREFIX + str3, jOptLong + ":" + jOptLong2);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(OtaConfigHandler.KEY_CONFIG_JSON_PREFIX);
        sb3.append(str3);
        editorEdit2.putString(sb3.toString(), OtaConfigHandler.INSTANCE.buildStorageConfig(jSONObjectOptJSONObject).toString());
        editorEdit2.apply();
        if (zBooleanValue) {
            Log.w("OtaPollingWorker", "DEV: pending marker written for " + str3 + "=" + jOptLong + ":" + jOptLong2);
        }
        Log.i("OtaPollingWorker", "OtaPollingWorker: blob downloaded for " + str3 + " at " + file.getAbsolutePath());
        return new PollResult(jOptLong, jOptLong2);
    }

    public final void r(final SharedPreferences prefs, Set<String> behaviorNames) {
        int i10;
        Iterator<String> it = behaviorNames.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            String string = prefs.getString(OtaConfigHandler.KEY_WORKER_PENDING_PREFIX + next, null);
            if (string != null) {
                List listSplit$default = StringsKt.split$default(string, new String[]{":"}, false, 0, 6, null);
                List list = listSplit$default.size() >= 2 ? listSplit$default : null;
                if (list != null) {
                    if (!new File(this.context.getFilesDir(), "appData/OTAWorkerBlobs/WorkerBlob_" + ((String) list.get(0)) + "_" + ((String) list.get(1))).exists()) {
                        Log.i("OtaPollingWorker", "OtaPollingWorker: clearing marker for missing blob " + next + "=" + string);
                        n("ota_polling_worker_orphan_marker_cleared", kotlin.collections.o.d(new NameValuePair("behavior_name", next)));
                        OtaConfigHandler.INSTANCE.clearPendingWorkerBlob(prefs, next);
                    }
                }
            }
        }
        File file = new File(this.context.getFilesDir(), "appData/OTAWorkerBlobs");
        if (file.exists()) {
            Set setA = iu.p.A(iu.p.x(iu.p.p(iu.p.x(iu.p.y(CollectionsKt.U(behaviorNames), new Function1() { // from class: uj.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OtaPollingWorker.s(prefs, (String) obj);
                }
            }), new Function1() { // from class: uj.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OtaPollingWorker.t((String) obj);
                }
            }), new Function1() { // from class: uj.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(OtaPollingWorker.u((List) obj));
                }
            }), new Function1() { // from class: uj.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OtaPollingWorker.v((List) obj);
                }
            }));
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    if (!setA.contains(file2.getName())) {
                        Log.i("OtaPollingWorker", "OtaPollingWorker: pruning orphaned blob " + file2.getName());
                        n("ota_polling_worker_orphan_blob_pruned", kotlin.collections.o.d(new NameValuePair("blob_name", file2.getName())));
                        file2.delete();
                    }
                }
            }
        }
    }
}
