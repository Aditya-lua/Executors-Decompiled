package com.roblox.client.pushnotification.notificationreceivers;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p309nj.AbstractC9482a;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"Lcom/roblox/client/pushnotification/notificationreceivers/PrivateMessageReceivedNotificationReceiver;", "Lnj/a;", "<init>", "()V", "Landroid/content/Intent;", "Landroid/content/Context;", "context", "bundle", "k", "(Landroid/content/Intent;Landroid/content/Context;Landroid/content/Intent;)Landroid/content/Intent;", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class PrivateMessageReceivedNotificationReceiver extends AbstractC9482a {
    @Override // p309nj.AbstractC9482a
    @NotNull
    /* JADX INFO: renamed from: k */
    public Intent mo15416k(@NotNull Intent intent, @NotNull Context context, @NotNull Intent bundle) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", "PrivateMessageReceived");
        if (!bundle.getBooleanExtra("EXTRA_STACKED_NOTIFICATION", false)) {
            intent.putExtra("EXTRA_CONVERSATION_ID", bundle.getLongExtra("EXTRA_CONVERSATION_ID", -1L));
        }
        return intent;
    }
}
