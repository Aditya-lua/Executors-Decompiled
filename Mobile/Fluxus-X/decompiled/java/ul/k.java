package ul;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.github.luben.zstd.BuildConfig;
import com.roblox.protocols.calling.CallingHandler;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lul/k;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", BuildConfig.FLAVOR, "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "a", "b", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\b¨\u0006\u000b"}, d2 = {"Lul/k$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "intentAction", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        DECLINE("com.roblox.protocols.calling.ACTION_DECLINE"),
        ANSWER("com.roblox.protocols.calling.ACTION_ANSWER");


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ hu.a f33553e = hu.b.a(a());

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String intentAction;

        a(String str) {
            this.intentAction = str;
        }

        @NotNull
        public static hu.a<a> b() {
            return f33553e;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getIntentAction() {
            return this.intentAction;
        }
    }

    /* JADX INFO: renamed from: ul.k$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lul/k$b;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", "Lul/k$a;", "action", "Lul/a;", "call", "Landroid/app/PendingIntent;", "a", "(Landroid/content/Context;Lul/k$a;Lul/a;)Landroid/app/PendingIntent;", BuildConfig.FLAVOR, "TAG", "Ljava/lang/String;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PendingIntent a(@NotNull Context context, @NotNull a action, @NotNull ActiveCall call) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(call, "call");
            PendingIntent broadcast = PendingIntent.getBroadcast(context, call.getNotificationId(), new Intent(context, (Class<?>) k.class).setAction(action.getIntentAction()).putExtra("com.roblox.protocols.calling.CALL_ID", call.getCallId()), 201326592);
            Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(...)");
            return broadcast;
        }

        public Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33555a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.DECLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.ANSWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f33555a = iArr;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        a next;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        String stringExtra = intent.getStringExtra("com.roblox.protocols.calling.CALL_ID");
        if (stringExtra == null) {
            return;
        }
        Iterator<a> it = a.b().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.c(next.getIntentAction(), intent.getAction()));
        a aVar = next;
        int i10 = aVar == null ? -1 : c.f33555a[aVar.ordinal()];
        if (i10 == -1) {
            ok.q.k("CallingActionReceiver", "unexpected action " + intent.getAction());
            return;
        }
        if (i10 == 1) {
            CallingHandler.INSTANCE.declineCall$NativeShell_googleProdRelease(stringExtra);
        } else {
            if (i10 != 2) {
                throw new zt.l();
            }
            CallingHandler.INSTANCE.answerCall$NativeShell_googleProdRelease(stringExtra);
        }
    }
}
