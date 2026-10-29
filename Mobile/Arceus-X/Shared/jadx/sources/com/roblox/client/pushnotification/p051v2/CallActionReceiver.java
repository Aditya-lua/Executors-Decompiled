package com.roblox.client.pushnotification.p051v2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p235k2.C7422n;
import p551xl.C12864g;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, m31665d2 = {"Lcom/roblox/client/pushnotification/v2/CallActionReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "a", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class CallActionReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.roblox.client.pushnotification.v2.CallActionReceiver$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\rJ7\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013¨\u0006\u0018"}, m31665d2 = {"Lcom/roblox/client/pushnotification/v2/CallActionReceiver$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "callId", "notificationTag", "", "notificationRequestCode", "Landroid/content/Intent;", "b", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)Landroid/content/Intent;", "c", "action", "a", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Landroid/content/Intent;", "ACTION_REJECT_CALL", "Ljava/lang/String;", "ACTION_SUPPRESS_CALL", "EXTRA_CALL_ID", "EXTRA_NOTIFICATION_TAG", "EXTRA_NOTIFICATION_REQUEST_CODE", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.roblox.client.pushnotification.v2.CallActionReceiver.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Intent m15448a(Context context, String action, String callId, String notificationTag, int notificationRequestCode) {
            Intent intentPutExtra = new Intent(context, (Class<?>) CallActionReceiver.class).setAction(action).putExtra("EXTRA_CALL_ID", callId).putExtra("EXTRA_NOTIFICATION_TAG", notificationTag).putExtra("EXTRA_NOTIFICATION_REQUEST_CODE", notificationRequestCode);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Intent m15449b(@NotNull Context context, @NotNull String callId, @NotNull String notificationTag, int notificationRequestCode) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(callId, "callId");
            Intrinsics.checkNotNullParameter(notificationTag, "notificationTag");
            return m15448a(context, "com.roblox.client.pushnotification.v2.ACTION_REJECT_CALL", callId, notificationTag, notificationRequestCode);
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final Intent m15450c(@NotNull Context context, @NotNull String callId, @NotNull String notificationTag, int notificationRequestCode) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(callId, "callId");
            Intrinsics.checkNotNullParameter(notificationTag, "notificationTag");
            return m15448a(context, "com.roblox.client.pushnotification.v2.ACTION_SUPPRESS_CALL", callId, notificationTag, notificationRequestCode);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Intent m15446a(@NotNull Context context, @NotNull String str, @NotNull String str2, int i10) {
        return INSTANCE.m15449b(context, str, str2, i10);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Intent m15447b(@NotNull Context context, @NotNull String str, @NotNull String str2, int i10) {
        return INSTANCE.m15450c(context, str, str2, i10);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("EXTRA_CALL_ID");
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != 739857104) {
                if (iHashCode != 757560570 || !action.equals("com.roblox.client.pushnotification.v2.ACTION_SUPPRESS_CALL")) {
                    return;
                } else {
                    C12864g.m47841x().m47859y(stringExtra);
                }
            } else if (!action.equals("com.roblox.client.pushnotification.v2.ACTION_REJECT_CALL")) {
                return;
            } else {
                C12864g.m47841x().m47857v(stringExtra);
            }
            String stringExtra2 = intent.getStringExtra("EXTRA_NOTIFICATION_TAG");
            if (stringExtra2 == null || stringExtra2.length() == 0) {
                return;
            }
            C7422n.m30883e(context).m30887b(stringExtra2, intent.getIntExtra("EXTRA_NOTIFICATION_REQUEST_CODE", 0));
        }
    }
}
