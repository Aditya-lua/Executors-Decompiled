package com.roblox.client.pushnotification.notificationreceivers;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import android.widget.Toast;
import com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver;
import gk.p;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ku.g1;
import ku.i;
import ku.k;
import ku.l0;
import ku.p0;
import ku.q0;
import ku.z2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.m;
import sg.n0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\u00020\f*\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0016\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0016\u0010\u0015J!\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ:\u0010 \u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0082@¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;", "Lnj/a;", "Lku/l0;", "ioDispatcher", "mainDispatcher", "Lkotlin/Function0;", "Lzk/f;", "friendsInterfaceProvider", "<init>", "(Lku/l0;Lku/l0;Lkotlin/jvm/functions/Function0;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "bundle", "k", "(Landroid/content/Intent;Landroid/content/Context;Landroid/content/Intent;)Landroid/content/Intent;", "u", "(Landroid/content/Intent;Landroid/content/Context;Lnt/b;)Ljava/lang/Object;", "v", "Lkotlin/time/a;", "delayDuration", "z", "(Landroid/content/Context;J)V", "", "userErrorLabelResId", "", "reportingContext", "actionTaken", "w", "(Landroid/content/Context;Landroid/content/Intent;ILjava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "b", "Lku/l0;", "c", "Lkotlin/jvm/functions/Function0;", "Lku/p0;", "d", "Lku/p0;", "broadcastScope", "t", "()Lzk/f;", "friendsInterface", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FriendRequestReceivedNotificationReceiver extends nj.a {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final l0 mainDispatcher;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<zk.f> friendsInterfaceProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 broadcastScope;

    @pt.f(c = "com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver", f = "FriendRequestReceivedNotificationReceiver.kt", l = {87, 100, 110, 120}, m = "markFriendRequestAsAccepted", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a extends pt.d {
        public int A;
        public /* synthetic */ Object B;
        public int D;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9257t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9258u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f9259v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f9260w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f9261x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public long f9262y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f9263z;

        public a(nt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.B = obj;
            this.D |= Integer.MIN_VALUE;
            return FriendRequestReceivedNotificationReceiver.this.u(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver$markFriendRequestAsAccepted$5$1", f = "FriendRequestReceivedNotificationReceiver.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9264t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Context f9266v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Intent f9267w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, Intent intent, nt.b<? super b> bVar) {
            super(2, bVar);
            this.f9266v = context;
            this.f9267w = intent;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return FriendRequestReceivedNotificationReceiver.this.new b(this.f9266v, this.f9267w, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f9264t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            FriendRequestReceivedNotificationReceiver.this.g(this.f9266v, this.f9267w);
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @pt.f(c = "com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver", f = "FriendRequestReceivedNotificationReceiver.kt", l = {131, 147, 160}, m = "markFriendRequestAsIgnored", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c extends pt.d {
        public int A;
        public /* synthetic */ Object B;
        public int D;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9268t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9269u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f9270v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f9271w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f9272x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public long f9273y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f9274z;

        public c(nt.b<? super c> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.B = obj;
            this.D |= Integer.MIN_VALUE;
            return FriendRequestReceivedNotificationReceiver.this.v(null, null, this);
        }
    }

    @pt.f(c = "com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver", f = "FriendRequestReceivedNotificationReceiver.kt", l = {210}, m = "notifyAndReportError", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class d extends pt.d {
        public int A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9275t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9276u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f9277v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f9278w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f9279x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f9280y;

        public d(nt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9280y = obj;
            this.A |= Integer.MIN_VALUE;
            return FriendRequestReceivedNotificationReceiver.this.w(null, null, 0, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver$notifyAndReportError$2", f = "FriendRequestReceivedNotificationReceiver.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class e extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9282t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Context f9283u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f9284v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context, int i10, nt.b<? super e> bVar) {
            super(2, bVar);
            this.f9283u = context;
            this.f9284v = i10;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new e(this.f9283u, this.f9284v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f9282t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            Toast.makeText(this.f9283u, this.f9284v, 0).show();
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver$onReceive$1", f = "FriendRequestReceivedNotificationReceiver.kt", l = {57, 58}, m = "invokeSuspend", v = 1)
    public static final class f extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9285t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Intent f9287v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Context f9288w;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
        @pt.f(c = "com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver$onReceive$1$1", f = "FriendRequestReceivedNotificationReceiver.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends m implements Function2<p0, nt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f9289t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ FriendRequestReceivedNotificationReceiver f9290u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Context f9291v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ Intent f9292w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(FriendRequestReceivedNotificationReceiver friendRequestReceivedNotificationReceiver, Context context, Intent intent, nt.b<? super a> bVar) {
                super(2, bVar);
                this.f9290u = friendRequestReceivedNotificationReceiver;
                this.f9291v = context;
                this.f9292w = intent;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                return new a(this.f9290u, this.f9291v, this.f9292w, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                ot.c.e();
                if (this.f9289t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                this.f9290u.g(this.f9291v, this.f9292w);
                return Unit.f22483a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Intent intent, Context context, nt.b<? super f> bVar) {
            super(2, bVar);
            this.f9287v = intent;
            this.f9288w = context;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return FriendRequestReceivedNotificationReceiver.this.new f(this.f9287v, this.f9288w, bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
        
            if (ku.i.g(r8, r1, r7) == r0) goto L15;
         */
        @Override // pt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = ot.c.e()
                int r1 = r7.f9285t
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jt.o.b(r8)
                goto L4b
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                jt.o.b(r8)
                goto L30
            L1e:
                jt.o.b(r8)
                com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver r8 = com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver.this
                android.content.Intent r1 = r7.f9287v
                android.content.Context r4 = r7.f9288w
                r7.f9285t = r3
                java.lang.Object r8 = com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver.q(r8, r1, r4, r7)
                if (r8 != r0) goto L30
                goto L4a
            L30:
                com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver r8 = com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver.this
                ku.l0 r8 = com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver.p(r8)
                com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver$f$a r1 = new com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver$f$a
                com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver r3 = com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver.this
                android.content.Context r4 = r7.f9288w
                android.content.Intent r5 = r7.f9287v
                r6 = 0
                r1.<init>(r3, r4, r5, r6)
                r7.f9285t = r2
                java.lang.Object r8 = ku.i.g(r8, r1, r7)
                if (r8 != r0) goto L4b
            L4a:
                return r0
            L4b:
                kotlin.Unit r8 = kotlin.Unit.f22483a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver$onReceive$3", f = "FriendRequestReceivedNotificationReceiver.kt", l = {74}, m = "invokeSuspend", v = 1)
    public static final class g extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9293t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Intent f9295v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Context f9296w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Intent intent, Context context, nt.b<? super g> bVar) {
            super(2, bVar);
            this.f9295v = intent;
            this.f9296w = context;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return FriendRequestReceivedNotificationReceiver.this.new g(this.f9295v, this.f9296w, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f9293t;
            if (i10 == 0) {
                o.b(obj);
                FriendRequestReceivedNotificationReceiver friendRequestReceivedNotificationReceiver = FriendRequestReceivedNotificationReceiver.this;
                Intent intent = this.f9295v;
                Context context = this.f9296w;
                this.f9293t = 1;
                if (friendRequestReceivedNotificationReceiver.v(intent, context, this) == objE) {
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
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public FriendRequestReceivedNotificationReceiver() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ void A(FriendRequestReceivedNotificationReceiver friendRequestReceivedNotificationReceiver, Context context, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = nj.g.f26287a;
        }
        friendRequestReceivedNotificationReceiver.z(context, j10);
    }

    public static final zk.f o() {
        return vk.g.d().b();
    }

    public static final Unit x(BroadcastReceiver.PendingResult pendingResult, Throwable th2) {
        pendingResult.finish();
        return Unit.f22483a;
    }

    public static final Unit y(BroadcastReceiver.PendingResult pendingResult, Throwable th2) {
        pendingResult.finish();
        return Unit.f22483a;
    }

    @Override // nj.a
    @NotNull
    public Intent k(@NotNull Intent intent, @NotNull Context context, @NotNull Intent bundle) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", "FriendRequestReceived");
        intent.putExtra("EXTRA_NOTIFICATION_USER_ID", bundle.getLongExtra("EXTRA_NOTIFICATION_USER_ID", -1L));
        return intent;
    }

    @Override // nj.a, sg.w0, android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @Nullable Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onReceive(context, intent);
        String action = intent != null ? intent.getAction() : null;
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode == -918752603) {
                if (action.equals("friend_request_received_ignored")) {
                    h("FriendRequestReceived", context, intent, "Decline");
                    final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
                    k.d(this.broadcastScope, null, null, new g(intent, context, null), 3, null).q(new Function1() { // from class: nj.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return FriendRequestReceivedNotificationReceiver.y(pendingResultGoAsync, (Throwable) obj);
                        }
                    });
                    return;
                }
                return;
            }
            if (iHashCode == 946611252 && action.equals("friend_request_received_accepted")) {
                p.i("rbx.push", "FRRNR.onReceive() INTENT_ACTION_RECEIVED_FRIEND_REQUEST_ACCEPTED");
                h("FriendRequestReceived", context, intent, "Accept");
                a(context, 0);
                final BroadcastReceiver.PendingResult pendingResultGoAsync2 = goAsync();
                k.d(this.broadcastScope, null, null, new f(intent, context, null), 3, null).q(new Function1() { // from class: nj.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FriendRequestReceivedNotificationReceiver.x(pendingResultGoAsync2, (Throwable) obj);
                    }
                });
            }
        }
    }

    public final zk.f t() {
        return this.friendsInterfaceProvider.invoke();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01b7, code lost:
    
        if (ku.i.g(r4, r5, r7) == r8) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(android.content.Intent r18, android.content.Context r19, nt.b<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver.u(android.content.Intent, android.content.Context, nt.b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0149, code lost:
    
        if (r1.w(r2, r3, r9, r5, "Decline", r7) == r8) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x016f, code lost:
    
        if (r1.w(r2, r3, r4, "client_failure", "Decline", r7) == r8) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(android.content.Intent r17, android.content.Context r18, nt.b<? super kotlin.Unit> r19) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver.v(android.content.Intent, android.content.Context, nt.b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object w(Context context, Intent intent, int i10, String str, String str2, nt.b<? super Unit> bVar) {
        d dVar;
        Context context2;
        Intent intent2;
        String str3;
        String str4;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i11 = dVar.A;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.A = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(bVar);
            }
        } else {
            dVar = new d(bVar);
        }
        Object obj = dVar.f9280y;
        Object objE = ot.c.e();
        int i12 = dVar.A;
        if (i12 == 0) {
            o.b(obj);
            l0 l0Var = this.mainDispatcher;
            e eVar = new e(context, i10, null);
            dVar.f9275t = context;
            dVar.f9276u = intent;
            dVar.f9277v = str;
            dVar.f9278w = str2;
            dVar.f9279x = i10;
            dVar.A = 1;
            if (i.g(l0Var, eVar, dVar) == objE) {
                return objE;
            }
            context2 = context;
            intent2 = intent;
            str3 = str;
            str4 = str2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str5 = (String) dVar.f9278w;
            String str6 = (String) dVar.f9277v;
            Intent intent3 = (Intent) dVar.f9276u;
            Context context3 = (Context) dVar.f9275t;
            o.b(obj);
            str4 = str5;
            str3 = str6;
            context2 = context3;
            intent2 = intent3;
        }
        d(str3, context2, intent2, true, "FriendRequestReceived", "base2", str4);
        return Unit.f22483a;
    }

    public final void z(Context context, long delayDuration) {
        k2.k.f fVarF = new k2.k.f(context, "channel_general").z(sg.l0.f30799c).i(new RemoteViews(context.getPackageName(), n0.f30889o)).D(kotlin.time.a.w(delayDuration)).f(true);
        Intrinsics.checkNotNullExpressionValue(fVarF, "setAutoCancel(...)");
        NotificationManager notificationManager = (NotificationManager) l2.b.k(context, NotificationManager.class);
        if (notificationManager != null) {
            notificationManager.notify(0, fVarF.c());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FriendRequestReceivedNotificationReceiver(@NotNull l0 ioDispatcher, @NotNull l0 mainDispatcher, @NotNull Function0<? extends zk.f> friendsInterfaceProvider) {
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(friendsInterfaceProvider, "friendsInterfaceProvider");
        this.mainDispatcher = mainDispatcher;
        this.friendsInterfaceProvider = friendsInterfaceProvider;
        this.broadcastScope = q0.a(z2.b(null, 1, null).plus(ioDispatcher));
    }

    public /* synthetic */ FriendRequestReceivedNotificationReceiver(l0 l0Var, l0 l0Var2, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? g1.b() : l0Var, (i10 & 2) != 0 ? g1.c() : l0Var2, (i10 & 4) != 0 ? new Function0() { // from class: nj.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FriendRequestReceivedNotificationReceiver.o();
            }
        } : function0);
    }
}
