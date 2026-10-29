package com.roblox.client.pushnotification.actions;

import android.content.Context;
import android.content.Intent;
import gk.v;
import jj.w;
import jj.x;
import k2.n;
import kj.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sg.t0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/roblox/client/pushnotification/actions/a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "openedClient", "", "a", "(Landroid/content/Context;Landroid/content/Intent;Z)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f9242a = new a();

    public static final void a(@NotNull Context context, @NotNull Intent intent, boolean openedClient) {
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        String stringExtra = intent.getStringExtra("extra-notification-tag");
        if (stringExtra == null) {
            return;
        }
        int intExtra = intent.getIntExtra("extra-notification-request-code", -1);
        n nVarE = n.e(context);
        Intrinsics.checkNotNullExpressionValue(nVarE, "from(...)");
        nVarE.b(stringExtra, intExtra);
        String stringExtra2 = intent.getStringExtra("extra-notification-group-id");
        if (stringExtra2 != null && stringExtra2.length() != 0) {
            b.b(context, stringExtra2, stringExtra, intExtra, nVarE);
        }
        String stringExtra3 = intent.getStringExtra("EXTRA_NOTIFICATION_ID");
        String str = stringExtra3 == null ? "" : stringExtra3;
        String stringExtra4 = intent.getStringExtra("extra-action-id");
        String stringExtra5 = intent.getStringExtra("extra-action-url");
        String str2 = (stringExtra5 == null || stringExtra5.length() <= 0) ? null : stringExtra5;
        if (stringExtra4 == null || str2 == null) {
            context2 = context;
        } else {
            String stringExtra6 = intent.getStringExtra("extra-action-body");
            context2 = context;
            NotificationActionEndpointWorker.INSTANCE.a(context2, stringExtra4, str, str2, stringExtra6 == null ? "" : stringExtra6);
        }
        t0.q("actionTaken", new x().a(context2, "GcmPlatform"), intent.getStringExtra("EXTRA_NOTIFICATION_TYPE"), str, stringExtra4, v.a(context2), openedClient, intent.getStringExtra("EXTRA_NOTIFICATION_VERSION"), "sendr1", w.a(intent));
    }
}
