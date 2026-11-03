package com.roblox.client.pushnotification.notificationreceivers;

import android.content.Context;
import android.content.Intent;
import com.roblox.client.pushnotification.notificationreceivers.ChatMessageNotificationReceiver;
import ek.q;
import gt.n;
import gt.o;
import hj.i;
import hj.u;
import iu.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mi.d;
import mi.e;
import mt.c;
import nt.f;
import nt.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\r\n\u0002\b\u0012\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0010\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0011\u0010\u000fJ#\u0010\u0013\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0013\u0010\u0014JE\u0010\u001d\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010 \u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b \u0010!JG\u0010#\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u00152\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010*\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver;", "Llj/a;", "Lkotlin/Function0;", "Lhj/u;", "pushNotificationStoreProvider", "Lhj/i;", "newNotificationHandlerProvider", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "j", "i", "bundle", "k", "(Landroid/content/Intent;Landroid/content/Context;Landroid/content/Intent;)Landroid/content/Intent;", "", "conversationGuid", "", "conversationId", "", "replyMessage", "categoryName", "conversationTitle", "s", "(Ljava/lang/String;JLjava/lang/CharSequence;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "messageId", "r", "(JLjava/lang/String;Ljava/lang/String;)V", "message", "t", "(Ljava/lang/String;JLjava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "b", "Lkotlin/jvm/functions/Function0;", "c", "q", "()Lhj/u;", "pushNotificationStore", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatMessageNotificationReceiver extends lj.a {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function0<u> pushNotificationStoreProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<i> newNotificationHandlerProvider;

    @f(c = "com.roblox.client.pushnotification.notificationreceivers.ChatMessageNotificationReceiver$markChatNotificationAsRead$1", f = "ChatMessageNotificationReceiver.kt", l = {93}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class a extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9321t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f9322u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f9323v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j10, String str, lt.b<? super a> bVar) {
            super(2, bVar);
            this.f9322u = j10;
            this.f9323v = str;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new a(this.f9322u, this.f9323v, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = c.e();
            int i10 = this.f9321t;
            if (i10 == 0) {
                o.b(obj);
                long j10 = this.f9322u;
                String str = this.f9323v;
                this.f9321t = 1;
                if (d.a(j10, str, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22938a;
        }
    }

    @f(c = "com.roblox.client.pushnotification.notificationreceivers.ChatMessageNotificationReceiver$sendMessageCoroutine$1", f = "ChatMessageNotificationReceiver.kt", l = {107}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b extends m implements Function1<lt.b<? super Unit>, Object> {
        public final /* synthetic */ String A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9324t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f9325u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f9326v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f9327w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ ChatMessageNotificationReceiver f9328x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Context f9329y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f9330z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, String str, String str2, ChatMessageNotificationReceiver chatMessageNotificationReceiver, Context context, String str3, String str4, lt.b<? super b> bVar) {
            super(1, bVar);
            this.f9325u = j10;
            this.f9326v = str;
            this.f9327w = str2;
            this.f9328x = chatMessageNotificationReceiver;
            this.f9329y = context;
            this.f9330z = str3;
            this.A = str4;
        }

        @Override // nt.a
        public final lt.b<Unit> create(lt.b<?> bVar) {
            return new b(this.f9325u, this.f9326v, this.f9327w, this.f9328x, this.f9329y, this.f9330z, this.A, bVar);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objE = c.e();
            int i10 = this.f9324t;
            if (i10 == 0) {
                o.b(obj);
                long j10 = this.f9325u;
                String str = this.f9326v;
                String str2 = this.f9327w;
                this.f9324t = 1;
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
            ChatMessageNotificationReceiver chatMessageNotificationReceiver = this.f9328x;
            Context context = this.f9329y;
            String str3 = this.f9330z;
            String strValueOf = this.f9326v;
            long j11 = this.f9325u;
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
            return Unit.f22938a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lt.b<? super Unit> bVar) {
            return ((b) create(bVar)).invokeSuspend(Unit.f22938a);
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

    @Override // lj.a
    public void i(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        q().i(intent.getStringExtra("EXTRA_CATEGORY"));
        g(context, intent);
        lj.a.e(this, "clicked", context, intent, true, "ChatNewMessage", null, null, 96, null);
    }

    @Override // lj.a
    public void j(@Nullable Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        q().i(intent.getStringExtra("EXTRA_CATEGORY"));
        lj.a.e(this, "dismissed", context, intent, false, "ChatNewMessage", null, null, 96, null);
    }

    @Override // lj.a
    @NotNull
    public Intent k(@NotNull Intent intent, @NotNull Context context, @NotNull Intent bundle) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", "ChatNewMessage");
        intent.putExtra("EXTRA_CONVERSATION_ID", bundle.getLongExtra("EXTRA_CONVERSATION_ID", -1L));
        return intent;
    }

    @Override // lj.a, rg.w0, android.content.BroadcastReceiver
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
        q.i("rbx.push", "CMNR.onReceive() INTENT_ACTION_CHAT_MESSAGE_REPLIED");
        long longExtra = intent.getLongExtra("EXTRA_CONVERSATION_ID", -1L);
        String stringExtra = intent.getStringExtra("EXTRA_CONVERSATION_ID");
        String stringExtra2 = intent.getStringExtra("EXTRA_MESSAGE_ID");
        b(context, intent.getStringExtra("tag"), stringExtra2 != null ? Integer.parseInt(stringExtra2) : 3);
        CharSequence charSequenceB = hj.c.B(intent);
        if (charSequenceB == null) {
            return;
        }
        String stringExtra3 = intent.getStringExtra("EXTRA_CATEGORY");
        String stringExtra4 = intent.getStringExtra("EXTRA_CONVERSATION_TITLE");
        String stringExtra5 = intent.getStringExtra("EXTRA_MESSAGE_ID");
        s(stringExtra, longExtra, charSequenceB, context, stringExtra3, stringExtra4);
        q().i(stringExtra3);
        r(longExtra, stringExtra, stringExtra5);
        lj.a.e(this, "chat message replied", context, intent, true, "ChatNewMessage", null, null, 96, null);
    }

    public final u q() {
        return this.pushNotificationStoreProvider.invoke();
    }

    public final void r(long conversationId, String conversationGuid, String messageId) {
        q.i("rbx.push", "In markChatNotificationAsRead(), conversationId: " + conversationId + " ,messageId: " + messageId);
        mi.c.f24802a.f(new a(conversationId, conversationGuid, null));
    }

    public final void s(String conversationGuid, long conversationId, CharSequence replyMessage, Context context, String categoryName, String conversationTitle) {
        t(conversationGuid, conversationId, replyMessage.toString(), context, categoryName, conversationTitle);
    }

    public final void t(String conversationGuid, long conversationId, String message, Context context, String categoryName, String conversationTitle) {
        mi.c.f24802a.c(conversationGuid == null ? String.valueOf(conversationId) : conversationGuid, new b(conversationId, conversationGuid, message, this, context, categoryName, conversationTitle, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChatMessageNotificationReceiver(@NotNull Function0<? extends u> pushNotificationStoreProvider, @NotNull Function0<? extends i> newNotificationHandlerProvider) {
        Intrinsics.checkNotNullParameter(pushNotificationStoreProvider, "pushNotificationStoreProvider");
        Intrinsics.checkNotNullParameter(newNotificationHandlerProvider, "newNotificationHandlerProvider");
        this.pushNotificationStoreProvider = pushNotificationStoreProvider;
        this.newNotificationHandlerProvider = newNotificationHandlerProvider;
    }

    public /* synthetic */ ChatMessageNotificationReceiver(Function0 function0, Function0 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new Function0() { // from class: lj.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChatMessageNotificationReceiver.n();
            }
        } : function0, (i10 & 2) != 0 ? new Function0() { // from class: lj.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChatMessageNotificationReceiver.o();
            }
        } : function1);
    }
}
