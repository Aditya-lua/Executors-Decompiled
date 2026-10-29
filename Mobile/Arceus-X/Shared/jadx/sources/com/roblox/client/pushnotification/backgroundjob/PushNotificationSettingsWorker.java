package com.roblox.client.pushnotification.backgroundjob;

import android.content.Context;
import androidx.work.AbstractC1117c;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.roblox.client.datastructures.NameValuePair;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p151gk.C6124q;
import p222jj.C7193r;
import p536x5.AbstractC12719p0;
import p536x5.C12701g0;
import p536x5.EnumC12704i;
import vg.C12183m;
import vi.C12211b;
import vi.C12217h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, m31665d2 = {"Lcom/roblox/client/pushnotification/backgroundjob/PushNotificationSettingsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "d", "()Landroidx/work/c$a;", "", "i", "()V", "a", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class PushNotificationSettingsWorker extends Worker {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b */
    public static final Duration f12043b = Duration.ofHours(12);

    /* JADX INFO: renamed from: com.roblox.client.pushnotification.backgroundjob.PushNotificationSettingsWorker$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bR\u001c\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, m31665d2 = {"Lcom/roblox/client/pushnotification/backgroundjob/PushNotificationSettingsWorker$a;", "", "<init>", "()V", "Lx5/p0;", "workManager", "", "b", "(Lx5/p0;)V", "a", "Ljava/time/Duration;", "kotlin.jvm.PlatformType", "INTERVAL", "Ljava/time/Duration;", "", "PUSH_BACKGROUND_JOB_TAG", "Ljava/lang/String;", "PUSH_BACKGROUND_JOB_NAME", "TAG", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.roblox.client.pushnotification.backgroundjob.PushNotificationSettingsWorker.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m15407a(@NotNull AbstractC12719p0 workManager) {
            Intrinsics.checkNotNullParameter(workManager, "workManager");
            C6124q.m27063h("rbx.push", "Cancelling background notification job.");
            workManager.mo47395b("PushNotificationSettingsBackgroundReporter");
        }

        /* JADX INFO: renamed from: b */
        public final void m15408b(@NotNull AbstractC12719p0 workManager) {
            Intrinsics.checkNotNullParameter(workManager, "workManager");
            C6124q.m27063h("rbx.push", "Scheduling periodic background notification job every " + PushNotificationSettingsWorker.f12043b + ".");
            Duration duration = PushNotificationSettingsWorker.f12043b;
            Intrinsics.checkNotNullExpressionValue(duration, "access$getINTERVAL$cp(...)");
            workManager.mo47398e("PushNotificationSettingsBackgroundReporter", EnumC12704i.UPDATE, new C12701g0.a(PushNotificationSettingsWorker.class, duration).m47421p("PushNotificationSettingsBackgroundReporterTag").m47409b());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushNotificationSettingsWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
    }

    @Override // androidx.work.Worker
    @NotNull
    /* JADX INFO: renamed from: d */
    public AbstractC1117c.a mo6253d() {
        C6124q.m27057b("rbx.push", "Initializing dependencies.");
        C12211b.m45200f().m45210l(getApplicationContext());
        C6124q.m27057b("rbx.push", "Logging current notification settings.");
        m15406i();
        AbstractC1117c.a aVarM6342d = AbstractC1117c.a.m6342d();
        Intrinsics.checkNotNullExpressionValue(aVarM6342d, "success(...)");
        return aVarM6342d;
    }

    /* JADX INFO: renamed from: i */
    public final void m15406i() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NameValuePair("recipient_user_id", String.valueOf(C12217h.m45288e().m45296g())));
        arrayList.add(new NameValuePair("platformType", "AndroidNative"));
        arrayList.add(new NameValuePair("context", "backgroundTask"));
        List<NameValuePair> listM30070l = C7193r.m30070l();
        Intrinsics.checkNotNullExpressionValue(listM30070l, "getNotificationSettings(...)");
        arrayList.addAll(listM30070l);
        C12183m.m45108c("androidNotificationsSettings", "backgroundTask", arrayList, false);
    }
}
