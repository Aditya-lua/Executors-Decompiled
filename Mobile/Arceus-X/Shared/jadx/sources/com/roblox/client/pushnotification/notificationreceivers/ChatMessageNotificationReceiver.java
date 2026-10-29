package com.roblox.client.pushnotification.notificationreceivers;

import android.content.Context;
import android.content.Intent;
import com.roblox.client.pushnotification.notificationreceivers.ChatMessageNotificationReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151gk.C6124q;
import p222jj.C7178c;
import p222jj.C7184i;
import p222jj.C7196u;
import p229jt.C7347n;
import p229jt.C7348o;
import p256ku.InterfaceC7906p0;
import p309nj.AbstractC9482a;
import p315nt.InterfaceC9557b;
import p333oi.C9737c;
import p333oi.C9738d;
import p333oi.C9739e;
import p344ot.C10047c;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\r\n\u0002\b\u0012\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0010\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0011\u0010\u000fJ#\u0010\u0013\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0013\u0010\u0014JE\u0010\u001d\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010 \u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b \u0010!JG\u0010#\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u00152\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010*\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, m31665d2 = {"Lcom/roblox/client/pushnotification/notificationreceivers/ChatMessageNotificationReceiver;", "Lnj/a;", "Lkotlin/Function0;", "Ljj/u;", "pushNotificationStoreProvider", "Ljj/i;", "newNotificationHandlerProvider", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "j", "i", "bundle", "k", "(Landroid/content/Intent;Landroid/content/Context;Landroid/content/Intent;)Landroid/content/Intent;", "", "conversationGuid", "", "conversationId", "", "replyMessage", "categoryName", "conversationTitle", "s", "(Ljava/lang/String;JLjava/lang/CharSequence;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "messageId", "r", "(JLjava/lang/String;Ljava/lang/String;)V", "message", "t", "(Ljava/lang/String;JLjava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "b", "Lkotlin/jvm/functions/Function0;", "c", "q", "()Ljj/u;", "pushNotificationStore", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class ChatMessageNotificationReceiver extends AbstractC9482a {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function0<C7196u> pushNotificationStoreProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Function0<C7184i> newNotificationHandlerProvider;

    /* JADX INFO: renamed from: com.roblox.client.pushnotification.notificationreceivers.ChatMessageNotificationReceiver$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.pushnotification.notificationreceivers.ChatMessageNotificationReceiver$markChatNotificationAsRead$1", m39664f = "ChatMessageNotificationReceiver.kt", m39665l = {93}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3226a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f12046t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ long f12047u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ String f12048v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3226a(long j10, String str, InterfaceC9557b<? super C3226a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f12047u = j10;
            this.f12048v = str;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3226a(this.f12047u, this.f12048v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f12046t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                long j10 = this.f12047u;
                String str = this.f12048v;
                this.f12046t = 1;
                if (C9738d.m38532a(j10, str, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3226a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.pushnotification.notificationreceivers.ChatMessageNotificationReceiver$b */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.roblox.client.pushnotification.notificationreceivers.ChatMessageNotificationReceiver$sendMessageCoroutine$1", m39664f = "ChatMessageNotificationReceiver.kt", m39665l = {107}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3227b extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: A */
        public final /* synthetic */ String f12049A;

        /* JADX INFO: renamed from: t */
        public int f12050t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ long f12051u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ String f12052v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ String f12053w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ ChatMessageNotificationReceiver f12054x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ Context f12055y;

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ String f12056z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3227b(long j10, String str, String str2, ChatMessageNotificationReceiver chatMessageNotificationReceiver, Context context, String str3, String str4, InterfaceC9557b<? super C3227b> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f12051u = j10;
            this.f12052v = str;
            this.f12053w = str2;
            this.f12054x = chatMessageNotificationReceiver;
            this.f12055y = context;
            this.f12056z = str3;
            this.f12049A = str4;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return new C3227b(this.f12051u, this.f12052v, this.f12053w, this.f12054x, this.f12055y, this.f12056z, this.f12049A, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38533b;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f12050t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                long j10 = this.f12051u;
                String str = this.f12052v;
                String str2 = this.f12053w;
                this.f12050t = 1;
                objM38533b = C9738d.m38533b(j10, str, str2, this);
                if (objM38533b == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                objM38533b = ((C7347n) obj).getValue();
            }
            ChatMessageNotificationReceiver chatMessageNotificationReceiver = this.f12054x;
            Context context = this.f12055y;
            String str3 = this.f12056z;
            String strValueOf = this.f12052v;
            long j11 = this.f12051u;
            String str4 = this.f12049A;
            Throwable thM30463e = C7347n.m30463e(objM38533b);
            if (thM30463e != null && (thM30463e instanceof C9739e)) {
                boolean zM31980c = Intrinsics.m31980c("moderated", ((C9739e) thM30463e).getResultType());
                C7184i c7184i = (C7184i) chatMessageNotificationReceiver.newNotificationHandlerProvider.invoke();
                if (strValueOf == null) {
                    strValueOf = String.valueOf(j11);
                }
                c7184i.m30044f(context, str3, strValueOf, str4, zM31980c);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3227b) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatMessageNotificationReceiver() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: n */
    public static final C7196u m15411n() {
        return C7196u.m30108c();
    }

    /* JADX INFO: renamed from: o */
    public static final C7184i m15412o() {
        return new C7184i();
    }

    @Override // p309nj.AbstractC9482a
    /* JADX INFO: renamed from: i */
    public void mo15414i(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        m15417q().m30116i(intent.getStringExtra("EXTRA_CATEGORY"));
        m37366g(context, intent);
        AbstractC9482a.m37360e(this, "clicked", context, intent, true, "ChatNewMessage", null, null, 96, null);
    }

    @Override // p309nj.AbstractC9482a
    /* JADX INFO: renamed from: j */
    public void mo15415j(@Nullable Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        m15417q().m30116i(intent.getStringExtra("EXTRA_CATEGORY"));
        AbstractC9482a.m37360e(this, "dismissed", context, intent, false, "ChatNewMessage", null, null, 96, null);
    }

    @Override // p309nj.AbstractC9482a
    @NotNull
    /* JADX INFO: renamed from: k */
    public Intent mo15416k(@NotNull Intent intent, @NotNull Context context, @NotNull Intent bundle) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", "ChatNewMessage");
        intent.putExtra("EXTRA_CONVERSATION_ID", bundle.getLongExtra("EXTRA_CONVERSATION_ID", -1L));
        return intent;
    }

    @Override // p309nj.AbstractC9482a, sg.C11365w0, android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @Nullable Intent intent) {
        String action;
        Intrinsics.checkNotNullParameter(context, "context");
        super.onReceive(context, intent);
        if (intent == null || (action = intent.getAction()) == null) {
            return;
        }
        if (!Intrinsics.m31980c(action, "chat_message_replied")) {
            action = null;
        }
        if (action == null) {
            return;
        }
        C6124q.m27064i("rbx.push", "CMNR.onReceive() INTENT_ACTION_CHAT_MESSAGE_REPLIED");
        long longExtra = intent.getLongExtra("EXTRA_CONVERSATION_ID", -1L);
        String stringExtra = intent.getStringExtra("EXTRA_CONVERSATION_ID");
        String stringExtra2 = intent.getStringExtra("EXTRA_MESSAGE_ID");
        m37362b(context, intent.getStringExtra("tag"), stringExtra2 != null ? Integer.parseInt(stringExtra2) : 3);
        CharSequence charSequenceM30004B = C7178c.m30004B(intent);
        if (charSequenceM30004B == null) {
            return;
        }
        String stringExtra3 = intent.getStringExtra("EXTRA_CATEGORY");
        String stringExtra4 = intent.getStringExtra("EXTRA_CONVERSATION_TITLE");
        String stringExtra5 = intent.getStringExtra("EXTRA_MESSAGE_ID");
        m15419s(stringExtra, longExtra, charSequenceM30004B, context, stringExtra3, stringExtra4);
        m15417q().m30116i(stringExtra3);
        m15418r(longExtra, stringExtra, stringExtra5);
        AbstractC9482a.m37360e(this, "chat message replied", context, intent, true, "ChatNewMessage", null, null, 96, null);
    }

    /* JADX INFO: renamed from: q */
    public final C7196u m15417q() {
        return this.pushNotificationStoreProvider.invoke();
    }

    /* JADX INFO: renamed from: r */
    public final void m15418r(long conversationId, String conversationGuid, String messageId) {
        C6124q.m27064i("rbx.push", "In markChatNotificationAsRead(), conversationId: " + conversationId + " ,messageId: " + messageId);
        C9737c.f35430a.m38531f(new C3226a(conversationId, conversationGuid, null));
    }

    /* JADX INFO: renamed from: s */
    public final void m15419s(String conversationGuid, long conversationId, CharSequence replyMessage, Context context, String categoryName, String conversationTitle) {
        m15420t(conversationGuid, conversationId, replyMessage.toString(), context, categoryName, conversationTitle);
    }

    /* JADX INFO: renamed from: t */
    public final void m15420t(String conversationGuid, long conversationId, String message, Context context, String categoryName, String conversationTitle) {
        C9737c.f35430a.m38530c(conversationGuid == null ? String.valueOf(conversationId) : conversationGuid, new C3227b(conversationId, conversationGuid, message, this, context, categoryName, conversationTitle, null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function0<? extends jj.u> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function0<? extends jj.i> */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatMessageNotificationReceiver(@NotNull Function0<? extends C7196u> pushNotificationStoreProvider, @NotNull Function0<? extends C7184i> newNotificationHandlerProvider) {
        Intrinsics.checkNotNullParameter(pushNotificationStoreProvider, "pushNotificationStoreProvider");
        Intrinsics.checkNotNullParameter(newNotificationHandlerProvider, "newNotificationHandlerProvider");
        this.pushNotificationStoreProvider = pushNotificationStoreProvider;
        this.newNotificationHandlerProvider = newNotificationHandlerProvider;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
      (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap kotlin.jvm.functions.Function0:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:5) call: nj.b.<init>():void type: CONSTRUCTOR) : (r1v0 kotlin.jvm.functions.Function0))
      (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x0009: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap kotlin.jvm.functions.Function0:0x000f: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:6) call: nj.c.<init>():void type: CONSTRUCTOR) : (r2v0 kotlin.jvm.functions.Function0))
     A[MD:(kotlin.jvm.functions.Function0<? extends jj.u>, kotlin.jvm.functions.Function0<? extends jj.i>):void (m)] (LINE:7) call: com.roblox.client.pushnotification.notificationreceivers.ChatMessageNotificationReceiver.<init>(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ ChatMessageNotificationReceiver(Function0 function0, Function0 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new Function0() { // from class: nj.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChatMessageNotificationReceiver.m15411n();
            }
        } : function0, (i10 & 2) != 0 ? new Function0() { // from class: nj.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChatMessageNotificationReceiver.m15412o();
            }
        } : function1);
    }
}
