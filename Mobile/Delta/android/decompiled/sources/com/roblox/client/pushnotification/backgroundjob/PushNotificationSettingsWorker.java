package com.roblox.client.pushnotification.backgroundjob;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import com.roblox.client.datastructures.NameValuePair;
import gk.p;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import jj.r;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vg.m;
import vi.b;
import vi.h;
import x5.g0;
import x5.i;
import x5.p0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/roblox/client/pushnotification/backgroundjob/PushNotificationSettingsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "d", "()Landroidx/work/c$a;", "", "i", "()V", "a", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PushNotificationSettingsWorker extends Worker {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final Duration b = Duration.ofHours(12);

    /* JADX INFO: renamed from: com.roblox.client.pushnotification.backgroundjob.PushNotificationSettingsWorker$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bR\u001c\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/roblox/client/pushnotification/backgroundjob/PushNotificationSettingsWorker$a;", "", "<init>", "()V", "Lx5/p0;", "workManager", "", "b", "(Lx5/p0;)V", "a", "Ljava/time/Duration;", "kotlin.jvm.PlatformType", "INTERVAL", "Ljava/time/Duration;", "", "PUSH_BACKGROUND_JOB_TAG", "Ljava/lang/String;", "PUSH_BACKGROUND_JOB_NAME", "TAG", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull p0 workManager) {
            Intrinsics.checkNotNullParameter(workManager, "workManager");
            p.h("rbx.push", "Cancelling background notification job.");
            workManager.b("PushNotificationSettingsBackgroundReporter");
        }

        public final void b(@NotNull p0 workManager) {
            Intrinsics.checkNotNullParameter(workManager, "workManager");
            p.h("rbx.push", "Scheduling periodic background notification job every " + PushNotificationSettingsWorker.b + ".");
            Duration duration = PushNotificationSettingsWorker.b;
            Intrinsics.checkNotNullExpressionValue(duration, "access$getINTERVAL$cp(...)");
            workManager.e("PushNotificationSettingsBackgroundReporter", i.UPDATE, new g0.a(PushNotificationSettingsWorker.class, duration).p("PushNotificationSettingsBackgroundReporterTag").b());
        }

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
    public c.a d() {
        p.b("rbx.push", "Initializing dependencies.");
        b.f().l(getApplicationContext());
        p.b("rbx.push", "Logging current notification settings.");
        i();
        c.a aVarD = c.a.d();
        Intrinsics.checkNotNullExpressionValue(aVarD, "success(...)");
        return aVarD;
    }

    public final void i() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NameValuePair("recipient_user_id", String.valueOf(h.e().g())));
        arrayList.add(new NameValuePair("platformType", "AndroidNative"));
        arrayList.add(new NameValuePair("context", "backgroundTask"));
        List<NameValuePair> listL = r.l();
        Intrinsics.checkNotNullExpressionValue(listL, "getNotificationSettings(...)");
        arrayList.addAll(listL);
        m.c("androidNotificationsSettings", "backgroundTask", arrayList, false);
    }
}
