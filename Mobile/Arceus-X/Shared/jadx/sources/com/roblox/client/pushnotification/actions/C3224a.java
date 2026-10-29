package com.roblox.client.pushnotification.actions;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p151gk.C6130w;
import p222jj.C7198w;
import p222jj.C7199x;
import p235k2.C7422n;
import p248kj.C7622b;
import sg.C11356t0;

/* JADX INFO: renamed from: com.roblox.client.pushnotification.actions.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m31665d2 = {"Lcom/roblox/client/pushnotification/actions/a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "openedClient", "", "a", "(Landroid/content/Context;Landroid/content/Intent;Z)V", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3224a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C3224a f12041a = new C3224a();

    /* JADX INFO: renamed from: a */
    public static final void m15404a(@NotNull Context context, @NotNull Intent intent, boolean openedClient) {
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        String stringExtra = intent.getStringExtra("extra-notification-tag");
        if (stringExtra == null) {
            return;
        }
        int intExtra = intent.getIntExtra("extra-notification-request-code", -1);
        C7422n c7422nM30883e = C7422n.m30883e(context);
        Intrinsics.checkNotNullExpressionValue(c7422nM30883e, "from(...)");
        c7422nM30883e.m30887b(stringExtra, intExtra);
        String stringExtra2 = intent.getStringExtra("extra-notification-group-id");
        if (stringExtra2 != null && stringExtra2.length() != 0) {
            C7622b.m31501b(context, stringExtra2, stringExtra, intExtra, c7422nM30883e);
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
            NotificationActionEndpointWorker.INSTANCE.m15403a(context2, stringExtra4, str, str2, stringExtra6 == null ? "" : stringExtra6);
        }
        C11356t0.m42547q("actionTaken", new C7199x().m30120a(context2, "GcmPlatform"), intent.getStringExtra("EXTRA_NOTIFICATION_TYPE"), str, stringExtra4, C6130w.m27099a(context2), openedClient, intent.getStringExtra("EXTRA_NOTIFICATION_VERSION"), "sendr1", C7198w.m30118a(intent));
    }
}
