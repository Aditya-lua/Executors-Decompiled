package com.roblox.client.pushnotification.notificationreceivers;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import android.widget.Toast;
import androidx.core.view.inputmethod.EditorInfoCompat;
import cl.C1677b;
import com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.C7800a;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151gk.C6124q;
import p229jt.C7347n;
import p229jt.C7348o;
import p231jv.C7388p;
import p231jv.C7396x;
import p231jv.InterfaceC7376d;
import p235k2.C7419k;
import p256ku.AbstractC7888l0;
import p256ku.C7864g1;
import p256ku.C7872i;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.C7948z2;
import p256ku.InterfaceC7906p0;
import p261l2.C7975b;
import p309nj.AbstractC9482a;
import p309nj.C9488g;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p493vk.C12225g;
import p607zk.InterfaceC13826f;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10350l;
import pt.InterfaceC10344f;
import sg.C11332l0;
import sg.C11338n0;
import sg.C11347q0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\u00020\f*\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0016\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0016\u0010\u0015J!\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ:\u0010 \u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0082@¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, m31665d2 = {"Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;", "Lnj/a;", "Lku/l0;", "ioDispatcher", "mainDispatcher", "Lkotlin/Function0;", "Lzk/f;", "friendsInterfaceProvider", "<init>", "(Lku/l0;Lku/l0;Lkotlin/jvm/functions/Function0;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "bundle", "k", "(Landroid/content/Intent;Landroid/content/Context;Landroid/content/Intent;)Landroid/content/Intent;", "u", "(Landroid/content/Intent;Landroid/content/Context;Lnt/b;)Ljava/lang/Object;", "v", "Lkotlin/time/a;", "delayDuration", "z", "(Landroid/content/Context;J)V", "", "userErrorLabelResId", "", "reportingContext", "actionTaken", "w", "(Landroid/content/Context;Landroid/content/Intent;ILjava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "b", "Lku/l0;", "c", "Lkotlin/jvm/functions/Function0;", "Lku/p0;", "d", "Lku/p0;", "broadcastScope", "t", "()Lzk/f;", "friendsInterface", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class FriendRequestReceivedNotificationReceiver extends AbstractC9482a {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AbstractC7888l0 mainDispatcher;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Function0<InterfaceC13826f> friendsInterfaceProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7906p0 broadcastScope;

    /* JADX INFO: renamed from: com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver$a */
    @InterfaceC10344f(m39663c = "com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver", m39664f = "FriendRequestReceivedNotificationReceiver.kt", m39665l = {87, 100, 110, 120}, m39666m = "markFriendRequestAsAccepted", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3228a extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public int f12060A;

        /* JADX INFO: renamed from: B */
        public /* synthetic */ Object f12061B;

        /* JADX INFO: renamed from: D */
        public int f12063D;

        /* JADX INFO: renamed from: t */
        public Object f12064t;

        /* JADX INFO: renamed from: u */
        public Object f12065u;

        /* JADX INFO: renamed from: v */
        public Object f12066v;

        /* JADX INFO: renamed from: w */
        public Object f12067w;

        /* JADX INFO: renamed from: x */
        public Object f12068x;

        /* JADX INFO: renamed from: y */
        public long f12069y;

        /* JADX INFO: renamed from: z */
        public int f12070z;

        public C3228a(InterfaceC9557b<? super C3228a> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12061B = obj;
            this.f12063D |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return FriendRequestReceivedNotificationReceiver.this.m15434u(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver$markFriendRequestAsAccepted$5$1", m39664f = "FriendRequestReceivedNotificationReceiver.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3229b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f12071t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ Context f12073v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ Intent f12074w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3229b(Context context, Intent intent, InterfaceC9557b<? super C3229b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f12073v = context;
            this.f12074w = intent;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return FriendRequestReceivedNotificationReceiver.this.new C3229b(this.f12073v, this.f12074w, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f12071t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            FriendRequestReceivedNotificationReceiver.this.m37366g(this.f12073v, this.f12074w);
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3229b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver$c */
    @InterfaceC10344f(m39663c = "com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver", m39664f = "FriendRequestReceivedNotificationReceiver.kt", m39665l = {131, 147, 160}, m39666m = "markFriendRequestAsIgnored", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3230c extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public int f12075A;

        /* JADX INFO: renamed from: B */
        public /* synthetic */ Object f12076B;

        /* JADX INFO: renamed from: D */
        public int f12078D;

        /* JADX INFO: renamed from: t */
        public Object f12079t;

        /* JADX INFO: renamed from: u */
        public Object f12080u;

        /* JADX INFO: renamed from: v */
        public Object f12081v;

        /* JADX INFO: renamed from: w */
        public Object f12082w;

        /* JADX INFO: renamed from: x */
        public Object f12083x;

        /* JADX INFO: renamed from: y */
        public long f12084y;

        /* JADX INFO: renamed from: z */
        public int f12085z;

        public C3230c(InterfaceC9557b<? super C3230c> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12076B = obj;
            this.f12078D |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return FriendRequestReceivedNotificationReceiver.this.m15435v(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver$d */
    @InterfaceC10344f(m39663c = "com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver", m39664f = "FriendRequestReceivedNotificationReceiver.kt", m39665l = {210}, m39666m = "notifyAndReportError", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3231d extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public int f12086A;

        /* JADX INFO: renamed from: t */
        public Object f12087t;

        /* JADX INFO: renamed from: u */
        public Object f12088u;

        /* JADX INFO: renamed from: v */
        public Object f12089v;

        /* JADX INFO: renamed from: w */
        public Object f12090w;

        /* JADX INFO: renamed from: x */
        public int f12091x;

        /* JADX INFO: renamed from: y */
        public /* synthetic */ Object f12092y;

        public C3231d(InterfaceC9557b<? super C3231d> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12092y = obj;
            this.f12086A |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return FriendRequestReceivedNotificationReceiver.this.m15436w(null, null, 0, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver$e */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver$notifyAndReportError$2", m39664f = "FriendRequestReceivedNotificationReceiver.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3232e extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f12094t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ Context f12095u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ int f12096v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3232e(Context context, int i10, InterfaceC9557b<? super C3232e> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f12095u = context;
            this.f12096v = i10;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3232e(this.f12095u, this.f12096v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f12094t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            Toast.makeText(this.f12095u, this.f12096v, 0).show();
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3232e) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver$f */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver$onReceive$1", m39664f = "FriendRequestReceivedNotificationReceiver.kt", m39665l = {57, 58}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3233f extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f12097t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ Intent f12099v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ Context f12100w;

        /* JADX INFO: renamed from: com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver$f$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver$onReceive$1$1", m39664f = "FriendRequestReceivedNotificationReceiver.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
        public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f12101t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ FriendRequestReceivedNotificationReceiver f12102u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ Context f12103v;

            /* JADX INFO: renamed from: w */
            public final /* synthetic */ Intent f12104w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(FriendRequestReceivedNotificationReceiver friendRequestReceivedNotificationReceiver, Context context, Intent intent, InterfaceC9557b<? super a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f12102u = friendRequestReceivedNotificationReceiver;
                this.f12103v = context;
                this.f12104w = intent;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f12102u, this.f12103v, this.f12104w, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                C10047c.m38805e();
                if (this.f12101t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                this.f12102u.m37366g(this.f12103v, this.f12104w);
                return Unit.f29331a;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3233f(Intent intent, Context context, InterfaceC9557b<? super C3233f> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f12099v = intent;
            this.f12100w = context;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return FriendRequestReceivedNotificationReceiver.this.new C3233f(this.f12099v, this.f12100w, interfaceC9557b);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
        
            if (p256ku.C7872i.m32684g(r8, r1, r7) == r0) goto L15;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f12097t;
            if (i10 != 0) {
                if (i10 == 1) {
                    C7348o.m30470b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                return Unit.f29331a;
            }
            C7348o.m30470b(obj);
            FriendRequestReceivedNotificationReceiver friendRequestReceivedNotificationReceiver = FriendRequestReceivedNotificationReceiver.this;
            Intent intent = this.f12099v;
            Context context = this.f12100w;
            this.f12097t = 1;
            if (friendRequestReceivedNotificationReceiver.m15434u(intent, context, this) != objM38805e) {
            }
            return objM38805e;
            AbstractC7888l0 abstractC7888l0 = FriendRequestReceivedNotificationReceiver.this.mainDispatcher;
            a aVar = new a(FriendRequestReceivedNotificationReceiver.this, this.f12100w, this.f12099v, null);
            this.f12097t = 2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3233f) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver$g */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver$onReceive$3", m39664f = "FriendRequestReceivedNotificationReceiver.kt", m39665l = {74}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3234g extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f12105t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ Intent f12107v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ Context f12108w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3234g(Intent intent, Context context, InterfaceC9557b<? super C3234g> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f12107v = intent;
            this.f12108w = context;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return FriendRequestReceivedNotificationReceiver.this.new C3234g(this.f12107v, this.f12108w, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f12105t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                FriendRequestReceivedNotificationReceiver friendRequestReceivedNotificationReceiver = FriendRequestReceivedNotificationReceiver.this;
                Intent intent = this.f12107v;
                Context context = this.f12108w;
                this.f12105t = 1;
                if (friendRequestReceivedNotificationReceiver.m15435v(intent, context, this) == objM38805e) {
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
            return ((C3234g) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FriendRequestReceivedNotificationReceiver() {
        this(null, null, null, 7, null);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m15422A(FriendRequestReceivedNotificationReceiver friendRequestReceivedNotificationReceiver, Context context, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = C9488g.f34095a;
        }
        friendRequestReceivedNotificationReceiver.m15437z(context, j10);
    }

    /* JADX INFO: renamed from: o */
    public static final InterfaceC13826f m15426o() {
        return C12225g.m45326d().mo45316b();
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m15431x(BroadcastReceiver.PendingResult pendingResult, Throwable th2) {
        pendingResult.finish();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m15432y(BroadcastReceiver.PendingResult pendingResult, Throwable th2) {
        pendingResult.finish();
        return Unit.f29331a;
    }

    @Override // p309nj.AbstractC9482a
    @NotNull
    /* JADX INFO: renamed from: k */
    public Intent mo15416k(@NotNull Intent intent, @NotNull Context context, @NotNull Intent bundle) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", "FriendRequestReceived");
        intent.putExtra("EXTRA_NOTIFICATION_USER_ID", bundle.getLongExtra("EXTRA_NOTIFICATION_USER_ID", -1L));
        return intent;
    }

    @Override // p309nj.AbstractC9482a, sg.C11365w0, android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @Nullable Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onReceive(context, intent);
        String action = intent != null ? intent.getAction() : null;
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode == -918752603) {
                if (action.equals("friend_request_received_ignored")) {
                    m37367h("FriendRequestReceived", context, intent, "Decline");
                    final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
                    C7882k.m32780d(this.broadcastScope, null, null, new C3234g(intent, context, null), 3, null).mo32601q(new Function1() { // from class: nj.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return FriendRequestReceivedNotificationReceiver.m15432y(pendingResultGoAsync, (Throwable) obj);
                        }
                    });
                    return;
                }
                return;
            }
            if (iHashCode == 946611252 && action.equals("friend_request_received_accepted")) {
                C6124q.m27064i("rbx.push", "FRRNR.onReceive() INTENT_ACTION_RECEIVED_FRIEND_REQUEST_ACCEPTED");
                m37367h("FriendRequestReceived", context, intent, "Accept");
                m37361a(context, 0);
                final BroadcastReceiver.PendingResult pendingResultGoAsync2 = goAsync();
                C7882k.m32780d(this.broadcastScope, null, null, new C3233f(intent, context, null), 3, null).mo32601q(new Function1() { // from class: nj.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FriendRequestReceivedNotificationReceiver.m15431x(pendingResultGoAsync2, (Throwable) obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final InterfaceC13826f m15433t() {
        return this.friendsInterfaceProvider.invoke();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01b7, code lost:
    
        if (p256ku.C7872i.m32684g(r4, r5, r7) == r8) goto L66;
     */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m15434u(Intent intent, Context context, InterfaceC9557b<? super Unit> interfaceC9557b) {
        C3228a c3228a;
        long longExtra;
        Context context2;
        Object objM30460b;
        Intent intent2;
        Context context3;
        Context context4;
        Intent intent3;
        long j10;
        String str;
        Context context5;
        Intent intent4;
        long j11;
        FriendRequestReceivedNotificationReceiver friendRequestReceivedNotificationReceiver = this;
        Intent intent5 = intent;
        if (interfaceC9557b instanceof C3228a) {
            c3228a = (C3228a) interfaceC9557b;
            int i10 = c3228a.f12063D;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                c3228a.f12063D = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                c3228a = friendRequestReceivedNotificationReceiver.new C3228a(interfaceC9557b);
            }
        } else {
            c3228a = friendRequestReceivedNotificationReceiver.new C3228a(interfaceC9557b);
        }
        C3228a c3228a2 = c3228a;
        Object objM30598c = c3228a2.f12061B;
        Object objM38805e = C10047c.m38805e();
        int i11 = c3228a2.f12063D;
        if (i11 == 0) {
            C7348o.m30470b(objM30598c);
            longExtra = intent5.getLongExtra("EXTRA_NOTIFICATION_USER_ID", -1L);
            if (longExtra != -1) {
                return Unit.f29331a;
            }
            InterfaceC7376d<ResponseBody> interfaceC7376dM50306b = friendRequestReceivedNotificationReceiver.m15433t().m50306b(longExtra);
            try {
                C7347n.Companion companion = C7347n.INSTANCE;
                Intrinsics.checkNotNull(interfaceC7376dM50306b);
                c3228a2.f12064t = intent5;
                context2 = context;
                try {
                    c3228a2.f12065u = context2;
                    c3228a2.f12066v = C10350l.m39676a(interfaceC7376dM50306b);
                    c3228a2.f12069y = longExtra;
                    c3228a2.f12070z = 0;
                    c3228a2.f12063D = 1;
                    objM30598c = C7388p.m30598c(interfaceC7376dM50306b, c3228a2);
                    if (objM30598c != objM38805e) {
                        objM30460b = C7347n.m30460b((C7396x) objM30598c);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    C7347n.Companion companion2 = C7347n.INSTANCE;
                    objM30460b = C7347n.m30460b(C7348o.m30469a(th));
                }
            } catch (Throwable th3) {
                th = th3;
                context2 = context;
                C7347n.Companion companion3 = C7347n.INSTANCE;
                objM30460b = C7347n.m30460b(C7348o.m30469a(th));
            }
            return objM38805e;
        }
        if (i11 == 1) {
            long j12 = c3228a2.f12069y;
            Context context6 = (Context) c3228a2.f12065u;
            Intent intent6 = (Intent) c3228a2.f12064t;
            try {
                C7348o.m30470b(objM30598c);
                longExtra = j12;
                context2 = context6;
                intent5 = intent6;
                objM30460b = C7347n.m30460b((C7396x) objM30598c);
            } catch (Throwable th4) {
                th = th4;
                longExtra = j12;
                context2 = context6;
                intent5 = intent6;
                C7347n.Companion companion4 = C7347n.INSTANCE;
                objM30460b = C7347n.m30460b(C7348o.m30469a(th));
            }
        } else if (i11 == 2) {
            j11 = c3228a2.f12069y;
            context5 = (Context) c3228a2.f12065u;
            intent4 = (Intent) c3228a2.f12064t;
            C7348o.m30470b(objM30598c);
            longExtra = j11;
            context3 = context5;
            intent2 = intent4;
            friendRequestReceivedNotificationReceiver = this;
            Unit unit = Unit.f29331a;
            AbstractC7888l0 abstractC7888l0 = friendRequestReceivedNotificationReceiver.mainDispatcher;
            C3229b c3229b = friendRequestReceivedNotificationReceiver.new C3229b(context3, intent2, null);
            c3228a2.f12064t = C10350l.m39676a(intent2);
            c3228a2.f12065u = C10350l.m39676a(context3);
            c3228a2.f12066v = unit;
            c3228a2.f12067w = C10350l.m39676a(unit);
            c3228a2.f12068x = null;
            c3228a2.f12069y = longExtra;
            c3228a2.f12070z = 0;
            c3228a2.f12063D = 4;
        } else if (i11 == 3) {
            j10 = c3228a2.f12069y;
            context4 = (Context) c3228a2.f12065u;
            intent3 = (Intent) c3228a2.f12064t;
            C7348o.m30470b(objM30598c);
            longExtra = j10;
            context3 = context4;
            intent2 = intent3;
            Unit unit2 = Unit.f29331a;
            AbstractC7888l0 abstractC7888l1 = friendRequestReceivedNotificationReceiver.mainDispatcher;
            C3229b c3229b2 = friendRequestReceivedNotificationReceiver.new C3229b(context3, intent2, null);
            c3228a2.f12064t = C10350l.m39676a(intent2);
            c3228a2.f12065u = C10350l.m39676a(context3);
            c3228a2.f12066v = unit2;
            c3228a2.f12067w = C10350l.m39676a(unit2);
            c3228a2.f12068x = null;
            c3228a2.f12069y = longExtra;
            c3228a2.f12070z = 0;
            c3228a2.f12063D = 4;
        } else {
            if (i11 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(objM30598c);
        }
        return Unit.f29331a;
        Context context7 = context2;
        intent2 = intent5;
        context3 = context7;
        Throwable thM30463e = C7347n.m30463e(objM30460b);
        if (thM30463e == null) {
            C7396x c7396x = (C7396x) objM30460b;
            C1677b c1677b = new C1677b(c7396x);
            if (c1677b.m8387b()) {
                friendRequestReceivedNotificationReceiver = this;
                Unit unit3 = Unit.f29331a;
                AbstractC7888l0 abstractC7888l2 = friendRequestReceivedNotificationReceiver.mainDispatcher;
                C3229b c3229b3 = friendRequestReceivedNotificationReceiver.new C3229b(context3, intent2, null);
                c3228a2.f12064t = C10350l.m39676a(intent2);
                c3228a2.f12065u = C10350l.m39676a(context3);
                c3228a2.f12066v = unit3;
                c3228a2.f12067w = C10350l.m39676a(unit3);
                c3228a2.f12068x = null;
                c3228a2.f12069y = longExtra;
                c3228a2.f12070z = 0;
                c3228a2.f12063D = 4;
            } else {
                int i12 = c1677b.f6455a;
                int i13 = i12 == 401 ? C11347q0.f39974h : C11347q0.f39942U0;
                if (i12 == 401) {
                    str = "unauthenticated";
                } else {
                    str = "code_" + i12 + "error_" + c1677b.m8386a();
                }
                c3228a2.f12064t = intent2;
                c3228a2.f12065u = context3;
                c3228a2.f12066v = C10350l.m39676a(c7396x);
                c3228a2.f12067w = C10350l.m39676a(c1677b);
                c3228a2.f12068x = C10350l.m39676a(str);
                c3228a2.f12069y = longExtra;
                c3228a2.f12070z = 0;
                c3228a2.f12060A = i13;
                c3228a2.f12063D = 2;
                if (friendRequestReceivedNotificationReceiver.m15436w(context3, intent2, i13, str, "Accept", c3228a2) != objM38805e) {
                    context5 = context3;
                    intent4 = intent2;
                    j11 = longExtra;
                    longExtra = j11;
                    context3 = context5;
                    intent2 = intent4;
                    friendRequestReceivedNotificationReceiver = this;
                    Unit unit4 = Unit.f29331a;
                    AbstractC7888l0 abstractC7888l3 = friendRequestReceivedNotificationReceiver.mainDispatcher;
                    C3229b c3229b4 = friendRequestReceivedNotificationReceiver.new C3229b(context3, intent2, null);
                    c3228a2.f12064t = C10350l.m39676a(intent2);
                    c3228a2.f12065u = C10350l.m39676a(context3);
                    c3228a2.f12066v = unit4;
                    c3228a2.f12067w = C10350l.m39676a(unit4);
                    c3228a2.f12068x = null;
                    c3228a2.f12069y = longExtra;
                    c3228a2.f12070z = 0;
                    c3228a2.f12063D = 4;
                }
            }
        } else {
            int i14 = C11347q0.f39942U0;
            c3228a2.f12064t = intent2;
            c3228a2.f12065u = context3;
            c3228a2.f12066v = C10350l.m39676a(thM30463e);
            c3228a2.f12069y = longExtra;
            c3228a2.f12070z = 0;
            c3228a2.f12063D = 3;
            friendRequestReceivedNotificationReceiver = this;
            if (friendRequestReceivedNotificationReceiver.m15436w(context3, intent2, i14, "client_failure", "Accept", c3228a2) != objM38805e) {
                context4 = context3;
                intent3 = intent2;
                j10 = longExtra;
                longExtra = j10;
                context3 = context4;
                intent2 = intent3;
                Unit unit5 = Unit.f29331a;
                AbstractC7888l0 abstractC7888l4 = friendRequestReceivedNotificationReceiver.mainDispatcher;
                C3229b c3229b5 = friendRequestReceivedNotificationReceiver.new C3229b(context3, intent2, null);
                c3228a2.f12064t = C10350l.m39676a(intent2);
                c3228a2.f12065u = C10350l.m39676a(context3);
                c3228a2.f12066v = unit5;
                c3228a2.f12067w = C10350l.m39676a(unit5);
                c3228a2.f12068x = null;
                c3228a2.f12069y = longExtra;
                c3228a2.f12070z = 0;
                c3228a2.f12063D = 4;
            }
        }
        return objM38805e;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0149, code lost:
    
        if (r1.m15436w(r2, r3, r9, r5, "Decline", r7) == r8) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x016f, code lost:
    
        if (r1.m15436w(r2, r3, r4, "client_failure", "Decline", r7) == r8) goto L53;
     */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m15435v(Intent intent, Context context, InterfaceC9557b<? super Unit> interfaceC9557b) {
        C3230c c3230c;
        long longExtra;
        Throwable th2;
        Object objM30460b;
        Context context2;
        String str;
        FriendRequestReceivedNotificationReceiver friendRequestReceivedNotificationReceiver = this;
        Intent intent2 = intent;
        Context context3 = context;
        if (interfaceC9557b instanceof C3230c) {
            c3230c = (C3230c) interfaceC9557b;
            int i10 = c3230c.f12078D;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                c3230c.f12078D = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                c3230c = friendRequestReceivedNotificationReceiver.new C3230c(interfaceC9557b);
            }
        } else {
            c3230c = friendRequestReceivedNotificationReceiver.new C3230c(interfaceC9557b);
        }
        C3230c c3230c2 = c3230c;
        Object objM30598c = c3230c2.f12076B;
        Object objM38805e = C10047c.m38805e();
        int i11 = c3230c2.f12078D;
        if (i11 == 0) {
            C7348o.m30470b(objM30598c);
            longExtra = intent2.getLongExtra("EXTRA_NOTIFICATION_USER_ID", -1L);
            if (longExtra != -1) {
                InterfaceC7376d<ResponseBody> interfaceC7376dM50305a = friendRequestReceivedNotificationReceiver.m15433t().m50305a(longExtra);
                try {
                    C7347n.Companion companion = C7347n.INSTANCE;
                    Intrinsics.checkNotNull(interfaceC7376dM50305a);
                    c3230c2.f12079t = intent2;
                    c3230c2.f12080u = context3;
                    c3230c2.f12081v = C10350l.m39676a(interfaceC7376dM50305a);
                    c3230c2.f12084y = longExtra;
                    c3230c2.f12085z = 0;
                    c3230c2.f12078D = 1;
                    objM30598c = C7388p.m30598c(interfaceC7376dM50305a, c3230c2);
                    if (objM30598c == objM38805e) {
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    C7347n.Companion companion2 = C7347n.INSTANCE;
                    objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
                }
                return objM38805e;
            }
            friendRequestReceivedNotificationReceiver.m37361a(context3, 0);
            return Unit.f29331a;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                context2 = (Context) c3230c2.f12080u;
                C7348o.m30470b(objM30598c);
                friendRequestReceivedNotificationReceiver.m37361a(context2, 0);
                return Unit.f29331a;
            }
            context2 = (Context) c3230c2.f12080u;
            C7348o.m30470b(objM30598c);
            friendRequestReceivedNotificationReceiver.m37361a(context2, 0);
            return Unit.f29331a;
        }
        long j10 = c3230c2.f12084y;
        Context context4 = (Context) c3230c2.f12080u;
        Intent intent3 = (Intent) c3230c2.f12079t;
        try {
            C7348o.m30470b(objM30598c);
            longExtra = j10;
            context3 = context4;
            intent2 = intent3;
        } catch (Throwable th4) {
            th2 = th4;
            longExtra = j10;
            context3 = context4;
            intent2 = intent3;
            C7347n.Companion companion3 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        objM30460b = C7347n.m30460b((C7396x) objM30598c);
        Context context5 = context3;
        Intent intent4 = intent2;
        context2 = context5;
        Throwable thM30463e = C7347n.m30463e(objM30460b);
        if (thM30463e == null) {
            C7396x c7396x = (C7396x) objM30460b;
            C1677b c1677b = new C1677b(c7396x);
            if (c1677b.m8387b()) {
                m15422A(friendRequestReceivedNotificationReceiver, context2, 0L, 2, null);
            } else {
                int i12 = c1677b.f6455a;
                int i13 = i12 == 401 ? C11347q0.f39974h : C11347q0.f39942U0;
                if (i12 == 401) {
                    str = "unauthenticated";
                } else {
                    str = "code_" + i12 + "error_" + c1677b.m8386a();
                }
                String str2 = str;
                c3230c2.f12079t = C10350l.m39676a(intent4);
                c3230c2.f12080u = context2;
                c3230c2.f12081v = C10350l.m39676a(c7396x);
                c3230c2.f12082w = C10350l.m39676a(c1677b);
                c3230c2.f12083x = C10350l.m39676a(str2);
                c3230c2.f12084y = longExtra;
                c3230c2.f12085z = 0;
                c3230c2.f12075A = i13;
                c3230c2.f12078D = 2;
                friendRequestReceivedNotificationReceiver = this;
            }
            return Unit.f29331a;
        }
        int i14 = C11347q0.f39942U0;
        c3230c2.f12079t = C10350l.m39676a(intent4);
        c3230c2.f12080u = context2;
        c3230c2.f12081v = C10350l.m39676a(thM30463e);
        c3230c2.f12084y = longExtra;
        c3230c2.f12085z = 0;
        c3230c2.f12078D = 3;
        return objM38805e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: w */
    public final Object m15436w(Context context, Intent intent, int i10, String str, String str2, InterfaceC9557b<? super Unit> interfaceC9557b) {
        C3231d c3231d;
        Context context2;
        Intent intent2;
        String str3;
        String str4;
        if (interfaceC9557b instanceof C3231d) {
            c3231d = (C3231d) interfaceC9557b;
            int i11 = c3231d.f12086A;
            if ((i11 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                c3231d.f12086A = i11 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                c3231d = new C3231d(interfaceC9557b);
            }
        } else {
            c3231d = new C3231d(interfaceC9557b);
        }
        Object obj = c3231d.f12092y;
        Object objM38805e = C10047c.m38805e();
        int i12 = c3231d.f12086A;
        if (i12 == 0) {
            C7348o.m30470b(obj);
            AbstractC7888l0 abstractC7888l0 = this.mainDispatcher;
            C3232e c3232e = new C3232e(context, i10, null);
            c3231d.f12087t = context;
            c3231d.f12088u = intent;
            c3231d.f12089v = str;
            c3231d.f12090w = str2;
            c3231d.f12091x = i10;
            c3231d.f12086A = 1;
            if (C7872i.m32684g(abstractC7888l0, c3232e, c3231d) == objM38805e) {
                return objM38805e;
            }
            context2 = context;
            intent2 = intent;
            str3 = str;
            str4 = str2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str5 = (String) c3231d.f12090w;
            String str6 = (String) c3231d.f12089v;
            Intent intent3 = (Intent) c3231d.f12088u;
            Context context3 = (Context) c3231d.f12087t;
            C7348o.m30470b(obj);
            str4 = str5;
            str3 = str6;
            context2 = context3;
            intent2 = intent3;
        }
        m37364d(str3, context2, intent2, true, "FriendRequestReceived", "base2", str4);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: z */
    public final void m15437z(Context context, long delayDuration) {
        C7419k.f fVarM30782f = new C7419k.f(context, "channel_general").m30802z(C11332l0.f39743c).m30785i(new RemoteViews(context.getPackageName(), C11338n0.f39868o)).m30774D(C7800a.m32348w(delayDuration)).m30782f(true);
        Intrinsics.checkNotNullExpressionValue(fVarM30782f, "setAutoCancel(...)");
        NotificationManager notificationManager = (NotificationManager) C7975b.m33013k(context, NotificationManager.class);
        if (notificationManager != null) {
            notificationManager.notify(0, fVarM30782f.m30780c());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function0<? extends zk.f> */
    /* JADX WARN: Multi-variable type inference failed */
    public FriendRequestReceivedNotificationReceiver(@NotNull AbstractC7888l0 ioDispatcher, @NotNull AbstractC7888l0 mainDispatcher, @NotNull Function0<? extends InterfaceC13826f> friendsInterfaceProvider) {
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(friendsInterfaceProvider, "friendsInterfaceProvider");
        this.mainDispatcher = mainDispatcher;
        this.friendsInterfaceProvider = friendsInterfaceProvider;
        this.broadcastScope = C7910q0.m32885a(C7948z2.m32943b(null, 1, null).plus(ioDispatcher));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
      (wrap ku.l0:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap ku.l0:0x0004: INVOKE  STATIC call: ku.g1.b():ku.l0 A[MD:():ku.l0 (m), WRAPPED] (LINE:6)) : (r1v0 ku.l0))
      (wrap ku.l0:?: TERNARY null = ((wrap int:0x0008: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap ku.l0:0x000c: INVOKE  STATIC call: ku.g1.c():ku.n2 A[MD:():ku.n2 (m), WRAPPED] (LINE:7)) : (r2v0 ku.l0))
      (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x0010: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap kotlin.jvm.functions.Function0:0x0016: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:8) call: nj.f.<init>():void type: CONSTRUCTOR) : (r3v0 kotlin.jvm.functions.Function0))
     A[MD:(ku.l0, ku.l0, kotlin.jvm.functions.Function0<? extends zk.f>):void (m)] (LINE:9) call: com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver.<init>(ku.l0, ku.l0, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ FriendRequestReceivedNotificationReceiver(AbstractC7888l0 abstractC7888l0, AbstractC7888l0 abstractC7888l1, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C7864g1.m32644b() : abstractC7888l0, (i10 & 2) != 0 ? C7864g1.m32645c() : abstractC7888l1, (i10 & 4) != 0 ? new Function0() { // from class: nj.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FriendRequestReceivedNotificationReceiver.m15426o();
            }
        } : function0);
    }
}
