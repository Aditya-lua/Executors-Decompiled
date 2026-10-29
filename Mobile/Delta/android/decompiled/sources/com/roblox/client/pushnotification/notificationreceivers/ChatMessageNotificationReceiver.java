package com.roblox.client.pushnotification.notificationreceivers;

import android.content.Context;
import android.content.Intent;
import com.roblox.client.pushnotification.notificationreceivers.ChatMessageNotificationReceiver;
import gk.p;
import jj.i;
import jj.u;
import jt.n;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ku.p0;
import oi.d;
import oi.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.c;
import pt.f;
import pt.m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\r\n\u0002\b\u0012\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0010\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0011\u0010\u000fJ#\u0010\u0013\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0013\u0010\u0014JE\u0010\u001d\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010 \u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b \u0010!JG\u0010#\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u00152\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010*\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver;", "Lnj/a;", "Lkotlin/Function0;", "Ljj/u;", "pushNotificationStoreProvider", "Ljj/i;", "newNotificationHandlerProvider", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "j", "i", "bundle", "k", "(Landroid/content/Intent;Landroid/content/Context;Landroid/content/Intent;)Landroid/content/Intent;", "", "conversationGuid", "", "conversationId", "", "replyMessage", "categoryName", "conversationTitle", "s", "(Ljava/lang/String;JLjava/lang/CharSequence;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "messageId", "r", "(JLjava/lang/String;Ljava/lang/String;)V", "message", "t", "(Ljava/lang/String;JLjava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "b", "Lkotlin/jvm/functions/Function0;", "c", "q", "()Ljj/u;", "pushNotificationStore", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatMessageNotificationReceiver extends nj.a {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function0<u> pushNotificationStoreProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<i> newNotificationHandlerProvider;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.pushnotification.notificationreceivers.ChatMessageNotificationReceiver$markChatNotificationAsRead$1", f = "ChatMessageNotificationReceiver.kt", l = {93}, m = "invokeSuspend", v = 1)
    public static final class a extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9245t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f9246u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f9247v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j10, String str, nt.b<? super a> bVar) {
            super(2, bVar);
            this.f9246u = j10;
            this.f9247v = str;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new a(this.f9246u, this.f9247v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = c.e();
            int i10 = this.f9245t;
            if (i10 == 0) {
                o.b(obj);
                long j10 = this.f9246u;
                String str = this.f9247v;
                this.f9245t = 1;
                if (d.a(j10, str, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @f(c = "com.roblox.client.pushnotification.notificationreceivers.ChatMessageNotificationReceiver$sendMessageCoroutine$1", f = "ChatMessageNotificationReceiver.kt", l = {107}, m = "invokeSuspend", v = 1)
    public static final class b extends m implements Function1<nt.b<? super Unit>, Object> {
        public final /* synthetic */ String A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9248t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f9249u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f9250v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f9251w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ ChatMessageNotificationReceiver f9252x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Context f9253y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f9254z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, String str, String str2, ChatMessageNotificationReceiver chatMessageNotificationReceiver, Context context, String str3, String str4, nt.b<? super b> bVar) {
            super(1, bVar);
            this.f9249u = j10;
            this.f9250v = str;
            this.f9251w = str2;
            this.f9252x = chatMessageNotificationReceiver;
            this.f9253y = context;
            this.f9254z = str3;
            this.A = str4;
        }

        @Override // pt.a
        public final nt.b<Unit> create(nt.b<?> bVar) {
            return new b(this.f9249u, this.f9250v, this.f9251w, this.f9252x, this.f9253y, this.f9254z, this.A, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objE = c.e();
            int i10 = this.f9248t;
            if (i10 == 0) {
                o.b(obj);
                long j10 = this.f9249u;
                String str = this.f9250v;
                String str2 = this.f9251w;
                this.f9248t = 1;
                objB = d.b(j10, str, str2, this);
                if (objB == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                objB = ((n) obj).getValue();
            }
            ChatMessageNotificationReceiver chatMessageNotificationReceiver = this.f9252x;
            Context context = this.f9253y;
            String str3 = this.f9254z;
            String strValueOf = this.f9250v;
            long j11 = this.f9249u;
            String str4 = this.A;
            Throwable thE = n.e(objB);
            if (thE != null && (thE instanceof e)) {
                boolean zC = Intrinsics.c("moderated", ((e) thE).getResultType());
                i iVar = (i) chatMessageNotificationReceiver.newNotificationHandlerProvider.invoke();
                if (strValueOf == null) {
                    strValueOf = String.valueOf(j11);
                }
                iVar.f(context, str3, strValueOf, str4, zC);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nt.b<? super Unit> bVar) {
            return ((b) create(bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChatMessageNotificationReceiver() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static final u n() {
        return u.c();
    }

    public static final i o() {
        return new i();
    }

    @Override // nj.a
    public void i(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        q().i(intent.getStringExtra("EXTRA_CATEGORY"));
        g(context, intent);
        nj.a.e(this, "clicked", context, intent, true, "ChatNewMessage", null, null, 96, null);
    }

    @Override // nj.a
    public void j(@Nullable Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        q().i(intent.getStringExtra("EXTRA_CATEGORY"));
        nj.a.e(this, "dismissed", context, intent, false, "ChatNewMessage", null, null, 96, null);
    }

    @Override // nj.a
    @NotNull
    public Intent k(@NotNull Intent intent, @NotNull Context context, @NotNull Intent bundle) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", "ChatNewMessage");
        intent.putExtra("EXTRA_CONVERSATION_ID", bundle.getLongExtra("EXTRA_CONVERSATION_ID", -1L));
        return intent;
    }

    @Override // nj.a, sg.w0, android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @Nullable Intent intent) {
        String action;
        Intrinsics.checkNotNullParameter(context, "context");
        super.onReceive(context, intent);
        if (intent == null || (action = intent.getAction()) == null) {
            return;
        }
        if (!Intrinsics.c(action, "chat_message_replied")) {
            action = null;
        }
        if (action == null) {
            return;
        }
        p.i("rbx.push", "CMNR.onReceive() INTENT_ACTION_CHAT_MESSAGE_REPLIED");
        long longExtra = intent.getLongExtra("EXTRA_CONVERSATION_ID", -1L);
        String stringExtra = intent.getStringExtra("EXTRA_CONVERSATION_ID");
        String stringExtra2 = intent.getStringExtra("EXTRA_MESSAGE_ID");
        b(context, intent.getStringExtra("tag"), stringExtra2 != null ? Integer.parseInt(stringExtra2) : 3);
        CharSequence charSequenceB = jj.c.B(intent);
        if (charSequenceB == null) {
            return;
        }
        String stringExtra3 = intent.getStringExtra("EXTRA_CATEGORY");
        String stringExtra4 = intent.getStringExtra("EXTRA_CONVERSATION_TITLE");
        String stringExtra5 = intent.getStringExtra("EXTRA_MESSAGE_ID");
        s(stringExtra, longExtra, charSequenceB, context, stringExtra3, stringExtra4);
        q().i(stringExtra3);
        r(longExtra, stringExtra, stringExtra5);
        nj.a.e(this, "chat message replied", context, intent, true, "ChatNewMessage", null, null, 96, null);
    }

    public final u q() {
        return this.pushNotificationStoreProvider.invoke();
    }

    public final void r(long conversationId, String conversationGuid, String messageId) {
        p.i("rbx.push", "In markChatNotificationAsRead(), conversationId: " + conversationId + " ,messageId: " + messageId);
        oi.c.f27373a.f(new a(conversationId, conversationGuid, null));
    }

    public final void s(String conversationGuid, long conversationId, CharSequence replyMessage, Context context, String categoryName, String conversationTitle) {
        t(conversationGuid, conversationId, replyMessage.toString(), context, categoryName, conversationTitle);
    }

    public final void t(String conversationGuid, long conversationId, String message, Context context, String categoryName, String conversationTitle) {
        oi.c.f27373a.c(conversationGuid == null ? String.valueOf(conversationId) : conversationGuid, new b(conversationId, conversationGuid, message, this, context, categoryName, conversationTitle, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChatMessageNotificationReceiver(@NotNull Function0<? extends u> pushNotificationStoreProvider, @NotNull Function0<? extends i> newNotificationHandlerProvider) {
        Intrinsics.checkNotNullParameter(pushNotificationStoreProvider, "pushNotificationStoreProvider");
        Intrinsics.checkNotNullParameter(newNotificationHandlerProvider, "newNotificationHandlerProvider");
        this.pushNotificationStoreProvider = pushNotificationStoreProvider;
        this.newNotificationHandlerProvider = newNotificationHandlerProvider;
    }

    public /* synthetic */ ChatMessageNotificationReceiver(Function0 function0, Function0 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new Function0() { // from class: nj.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChatMessageNotificationReceiver.n();
            }
        } : function0, (i10 & 2) != 0 ? new Function0() { // from class: nj.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChatMessageNotificationReceiver.o();
            }
        } : function1);
    }
}
