package com.roblox.client.pushnotification.notificationreceivers;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import android.widget.Toast;
import av.g1;
import av.i;
import av.k;
import av.l0;
import av.p0;
import av.z2;
import bh.n0;
import bh.q0;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.common.MlKitException;
import com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver;
import com.roblox.platform.http.interfaces.FriendsInterface;
import gu.l;
import gu.m;
import mv.i0;
import ok.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import sw.p;
import sw.x;
import zt.n;
import zt.o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\u00020\f*\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0016\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0016\u0010\u0015J!\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ:\u0010 \u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0082@¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;", "Lvj/a;", "Lav/l0;", "ioDispatcher", "mainDispatcher", "Lkotlin/Function0;", "Lcom/roblox/platform/http/interfaces/FriendsInterface;", "friendsInterfaceProvider", "<init>", "(Lav/l0;Lav/l0;Lkotlin/jvm/functions/Function0;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", BuildConfig.FLAVOR, "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "bundle", "k", "(Landroid/content/Intent;Landroid/content/Context;Landroid/content/Intent;)Landroid/content/Intent;", "u", "(Landroid/content/Intent;Landroid/content/Context;Leu/b;)Ljava/lang/Object;", "v", "Lkotlin/time/a;", "delayDuration", "z", "(Landroid/content/Context;J)V", BuildConfig.FLAVOR, "userErrorLabelResId", BuildConfig.FLAVOR, "reportingContext", "actionTaken", "w", "(Landroid/content/Context;Landroid/content/Intent;ILjava/lang/String;Ljava/lang/String;Leu/b;)Ljava/lang/Object;", "b", "Lav/l0;", "c", "Lkotlin/jvm/functions/Function0;", "Lav/p0;", "d", "Lav/p0;", "broadcastScope", "t", "()Lcom/roblox/platform/http/interfaces/FriendsInterface;", "friendsInterface", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FriendRequestReceivedNotificationReceiver extends vj.a {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final l0 mainDispatcher;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<FriendsInterface> friendsInterfaceProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 broadcastScope;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver", f = "FriendRequestReceivedNotificationReceiver.kt", l = {87, MlKitException.MODEL_INCOMPATIBLE_WITH_TFLITE, 110, 120}, m = "markFriendRequestAsAccepted", v = 1)
    public static final class a extends gu.d {
        public int A;
        public /* synthetic */ Object B;
        public int D;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9150t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9151u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f9152v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f9153w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f9154x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public long f9155y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f9156z;

        public a(eu.b<? super a> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.B = obj;
            this.D |= Integer.MIN_VALUE;
            return FriendRequestReceivedNotificationReceiver.this.u(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver$markFriendRequestAsAccepted$5$1", f = "FriendRequestReceivedNotificationReceiver.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9157t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Context f9159v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Intent f9160w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, Intent intent, eu.b<? super b> bVar) {
            super(2, bVar);
            this.f9159v = context;
            this.f9160w = intent;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return FriendRequestReceivedNotificationReceiver.this.new b(this.f9159v, this.f9160w, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f9157t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            FriendRequestReceivedNotificationReceiver.this.g(this.f9159v, this.f9160w);
            return Unit.f21506a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver", f = "FriendRequestReceivedNotificationReceiver.kt", l = {131, 147, 160}, m = "markFriendRequestAsIgnored", v = 1)
    public static final class c extends gu.d {
        public int A;
        public /* synthetic */ Object B;
        public int D;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9161t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9162u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f9163v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f9164w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f9165x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public long f9166y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f9167z;

        public c(eu.b<? super c> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.B = obj;
            this.D |= Integer.MIN_VALUE;
            return FriendRequestReceivedNotificationReceiver.this.v(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver", f = "FriendRequestReceivedNotificationReceiver.kt", l = {210}, m = "notifyAndReportError", v = 1)
    public static final class d extends gu.d {
        public int A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9168t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9169u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f9170v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f9171w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f9172x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f9173y;

        public d(eu.b<? super d> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9173y = obj;
            this.A |= Integer.MIN_VALUE;
            return FriendRequestReceivedNotificationReceiver.this.w(null, null, 0, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver$notifyAndReportError$2", f = "FriendRequestReceivedNotificationReceiver.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class e extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9175t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Context f9176u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f9177v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context, int i10, eu.b<? super e> bVar) {
            super(2, bVar);
            this.f9176u = context;
            this.f9177v = i10;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new e(this.f9176u, this.f9177v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f9175t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            Toast.makeText(this.f9176u, this.f9177v, 0).show();
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver$onReceive$1", f = "FriendRequestReceivedNotificationReceiver.kt", l = {57, 58}, m = "invokeSuspend", v = 1)
    public static final class f extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9178t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Intent f9180v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Context f9181w;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver$onReceive$1$1", f = "FriendRequestReceivedNotificationReceiver.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends m implements Function2<p0, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f9182t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ FriendRequestReceivedNotificationReceiver f9183u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Context f9184v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ Intent f9185w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(FriendRequestReceivedNotificationReceiver friendRequestReceivedNotificationReceiver, Context context, Intent intent, eu.b<? super a> bVar) {
                super(2, bVar);
                this.f9183u = friendRequestReceivedNotificationReceiver;
                this.f9184v = context;
                this.f9185w = intent;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new a(this.f9183u, this.f9184v, this.f9185w, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                fu.c.e();
                if (this.f9182t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                this.f9183u.g(this.f9184v, this.f9185w);
                return Unit.f21506a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Intent intent, Context context, eu.b<? super f> bVar) {
            super(2, bVar);
            this.f9180v = intent;
            this.f9181w = context;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return FriendRequestReceivedNotificationReceiver.this.new f(this.f9180v, this.f9181w, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
        
            if (av.i.g(r8, r1, r7) == r0) goto L15;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f9178t;
            if (i10 != 0) {
                if (i10 == 1) {
                    o.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                return Unit.f21506a;
            }
            o.b(obj);
            FriendRequestReceivedNotificationReceiver friendRequestReceivedNotificationReceiver = FriendRequestReceivedNotificationReceiver.this;
            Intent intent = this.f9180v;
            Context context = this.f9181w;
            this.f9178t = 1;
            if (friendRequestReceivedNotificationReceiver.u(intent, context, this) != objE) {
            }
            return objE;
            l0 l0Var = FriendRequestReceivedNotificationReceiver.this.mainDispatcher;
            a aVar = new a(FriendRequestReceivedNotificationReceiver.this, this.f9181w, this.f9180v, null);
            this.f9178t = 2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver$onReceive$3", f = "FriendRequestReceivedNotificationReceiver.kt", l = {74}, m = "invokeSuspend", v = 1)
    public static final class g extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9186t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Intent f9188v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Context f9189w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Intent intent, Context context, eu.b<? super g> bVar) {
            super(2, bVar);
            this.f9188v = intent;
            this.f9189w = context;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return FriendRequestReceivedNotificationReceiver.this.new g(this.f9188v, this.f9189w, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f9186t;
            if (i10 == 0) {
                o.b(obj);
                FriendRequestReceivedNotificationReceiver friendRequestReceivedNotificationReceiver = FriendRequestReceivedNotificationReceiver.this;
                Intent intent = this.f9188v;
                Context context = this.f9189w;
                this.f9186t = 1;
                if (friendRequestReceivedNotificationReceiver.v(intent, context, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f21506a;
        }
    }

    public FriendRequestReceivedNotificationReceiver() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ void A(FriendRequestReceivedNotificationReceiver friendRequestReceivedNotificationReceiver, Context context, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = vj.g.f34403a;
        }
        friendRequestReceivedNotificationReceiver.z(context, j10);
    }

    public static final FriendsInterface o() {
        return cl.g.d().b();
    }

    public static final Unit x(BroadcastReceiver.PendingResult pendingResult, Throwable th2) {
        pendingResult.finish();
        return Unit.f21506a;
    }

    public static final Unit y(BroadcastReceiver.PendingResult pendingResult, Throwable th2) {
        pendingResult.finish();
        return Unit.f21506a;
    }

    @Override // vj.a
    @NotNull
    public Intent k(@NotNull Intent intent, @NotNull Context context, @NotNull Intent bundle) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", "FriendRequestReceived");
        intent.putExtra("EXTRA_NOTIFICATION_USER_ID", bundle.getLongExtra("EXTRA_NOTIFICATION_USER_ID", -1L));
        return intent;
    }

    @Override // vj.a, bh.w0, android.content.BroadcastReceiver
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
                    k.d(this.broadcastScope, null, null, new g(intent, context, null), 3, null).o(new Function1() { // from class: vj.e
                        @Override // p001kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return FriendRequestReceivedNotificationReceiver.y(pendingResultGoAsync, (Throwable) obj);
                        }
                    });
                    return;
                }
                return;
            }
            if (iHashCode == 946611252 && action.equals("friend_request_received_accepted")) {
                q.i("rbx.push", "FRRNR.onReceive() INTENT_ACTION_RECEIVED_FRIEND_REQUEST_ACCEPTED");
                h("FriendRequestReceived", context, intent, "Accept");
                a(context, 0);
                final BroadcastReceiver.PendingResult pendingResultGoAsync2 = goAsync();
                k.d(this.broadcastScope, null, null, new f(intent, context, null), 3, null).o(new Function1() { // from class: vj.d
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FriendRequestReceivedNotificationReceiver.x(pendingResultGoAsync2, (Throwable) obj);
                    }
                });
            }
        }
    }

    public final FriendsInterface t() {
        return this.friendsInterfaceProvider.invoke();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01b7, code lost:
    
        if (av.i.g(r4, r5, r7) == r8) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(Intent intent, Context context, eu.b<? super Unit> bVar) {
        a aVar;
        long longExtra;
        Context context2;
        Object objB;
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
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.D;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.D = i10 - Integer.MIN_VALUE;
            } else {
                aVar = friendRequestReceivedNotificationReceiver.new a(bVar);
            }
        } else {
            aVar = friendRequestReceivedNotificationReceiver.new a(bVar);
        }
        a aVar2 = aVar;
        Object objC = aVar2.B;
        Object objE = fu.c.e();
        int i11 = aVar2.D;
        if (i11 == 0) {
            o.b(objC);
            longExtra = intent5.getLongExtra("EXTRA_NOTIFICATION_USER_ID", -1L);
            if (longExtra != -1) {
                return Unit.f21506a;
            }
            sw.d<i0> dVarAcceptFriendRequest = friendRequestReceivedNotificationReceiver.t().acceptFriendRequest(longExtra);
            try {
                n.Companion companion = n.INSTANCE;
                Intrinsics.checkNotNull(dVarAcceptFriendRequest);
                aVar2.f9150t = intent5;
                context2 = context;
                try {
                    aVar2.f9151u = context2;
                    aVar2.f9152v = l.a(dVarAcceptFriendRequest);
                    aVar2.f9155y = longExtra;
                    aVar2.f9156z = 0;
                    aVar2.D = 1;
                    objC = p.c(dVarAcceptFriendRequest, aVar2);
                    if (objC != objE) {
                        objB = n.b((x) objC);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    n.Companion companion2 = n.INSTANCE;
                    objB = n.b(o.a(th));
                }
            } catch (Throwable th3) {
                th = th3;
                context2 = context;
                n.Companion companion3 = n.INSTANCE;
                objB = n.b(o.a(th));
            }
            return objE;
        }
        if (i11 == 1) {
            long j12 = aVar2.f9155y;
            Context context6 = (Context) aVar2.f9151u;
            Intent intent6 = (Intent) aVar2.f9150t;
            try {
                o.b(objC);
                longExtra = j12;
                context2 = context6;
                intent5 = intent6;
                objB = n.b((x) objC);
            } catch (Throwable th4) {
                th = th4;
                longExtra = j12;
                context2 = context6;
                intent5 = intent6;
                n.Companion companion4 = n.INSTANCE;
                objB = n.b(o.a(th));
            }
        } else if (i11 == 2) {
            j11 = aVar2.f9155y;
            context5 = (Context) aVar2.f9151u;
            intent4 = (Intent) aVar2.f9150t;
            o.b(objC);
            longExtra = j11;
            context3 = context5;
            intent2 = intent4;
            friendRequestReceivedNotificationReceiver = this;
            Unit unit = Unit.f21506a;
            l0 l0Var = friendRequestReceivedNotificationReceiver.mainDispatcher;
            b bVar2 = friendRequestReceivedNotificationReceiver.new b(context3, intent2, null);
            aVar2.f9150t = l.a(intent2);
            aVar2.f9151u = l.a(context3);
            aVar2.f9152v = unit;
            aVar2.f9153w = l.a(unit);
            aVar2.f9154x = null;
            aVar2.f9155y = longExtra;
            aVar2.f9156z = 0;
            aVar2.D = 4;
        } else if (i11 == 3) {
            j10 = aVar2.f9155y;
            context4 = (Context) aVar2.f9151u;
            intent3 = (Intent) aVar2.f9150t;
            o.b(objC);
            longExtra = j10;
            context3 = context4;
            intent2 = intent3;
            Unit unit2 = Unit.f21506a;
            l0 l0Var2 = friendRequestReceivedNotificationReceiver.mainDispatcher;
            b bVar3 = friendRequestReceivedNotificationReceiver.new b(context3, intent2, null);
            aVar2.f9150t = l.a(intent2);
            aVar2.f9151u = l.a(context3);
            aVar2.f9152v = unit2;
            aVar2.f9153w = l.a(unit2);
            aVar2.f9154x = null;
            aVar2.f9155y = longExtra;
            aVar2.f9156z = 0;
            aVar2.D = 4;
        } else {
            if (i11 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(objC);
        }
        return Unit.f21506a;
        Context context7 = context2;
        intent2 = intent5;
        context3 = context7;
        Throwable thE = n.e(objB);
        if (thE == null) {
            x xVar = (x) objB;
            ol.b bVar4 = new ol.b(xVar);
            if (bVar4.b()) {
                friendRequestReceivedNotificationReceiver = this;
                Unit unit3 = Unit.f21506a;
                l0 l0Var3 = friendRequestReceivedNotificationReceiver.mainDispatcher;
                b bVar5 = friendRequestReceivedNotificationReceiver.new b(context3, intent2, null);
                aVar2.f9150t = l.a(intent2);
                aVar2.f9151u = l.a(context3);
                aVar2.f9152v = unit3;
                aVar2.f9153w = l.a(unit3);
                aVar2.f9154x = null;
                aVar2.f9155y = longExtra;
                aVar2.f9156z = 0;
                aVar2.D = 4;
            } else {
                int i12 = bVar4.f28274a;
                int i13 = i12 == 401 ? q0.f4240h : q0.f4233e1;
                if (i12 == 401) {
                    str = "unauthenticated";
                } else {
                    str = "code_" + i12 + "error_" + bVar4.a();
                }
                aVar2.f9150t = intent2;
                aVar2.f9151u = context3;
                aVar2.f9152v = l.a(xVar);
                aVar2.f9153w = l.a(bVar4);
                aVar2.f9154x = l.a(str);
                aVar2.f9155y = longExtra;
                aVar2.f9156z = 0;
                aVar2.A = i13;
                aVar2.D = 2;
                if (friendRequestReceivedNotificationReceiver.w(context3, intent2, i13, str, "Accept", aVar2) != objE) {
                    context5 = context3;
                    intent4 = intent2;
                    j11 = longExtra;
                    longExtra = j11;
                    context3 = context5;
                    intent2 = intent4;
                    friendRequestReceivedNotificationReceiver = this;
                    Unit unit4 = Unit.f21506a;
                    l0 l0Var4 = friendRequestReceivedNotificationReceiver.mainDispatcher;
                    b bVar6 = friendRequestReceivedNotificationReceiver.new b(context3, intent2, null);
                    aVar2.f9150t = l.a(intent2);
                    aVar2.f9151u = l.a(context3);
                    aVar2.f9152v = unit4;
                    aVar2.f9153w = l.a(unit4);
                    aVar2.f9154x = null;
                    aVar2.f9155y = longExtra;
                    aVar2.f9156z = 0;
                    aVar2.D = 4;
                }
            }
        } else {
            int i14 = q0.f4233e1;
            aVar2.f9150t = intent2;
            aVar2.f9151u = context3;
            aVar2.f9152v = l.a(thE);
            aVar2.f9155y = longExtra;
            aVar2.f9156z = 0;
            aVar2.D = 3;
            friendRequestReceivedNotificationReceiver = this;
            if (friendRequestReceivedNotificationReceiver.w(context3, intent2, i14, "client_failure", "Accept", aVar2) != objE) {
                context4 = context3;
                intent3 = intent2;
                j10 = longExtra;
                longExtra = j10;
                context3 = context4;
                intent2 = intent3;
                Unit unit5 = Unit.f21506a;
                l0 l0Var5 = friendRequestReceivedNotificationReceiver.mainDispatcher;
                b bVar7 = friendRequestReceivedNotificationReceiver.new b(context3, intent2, null);
                aVar2.f9150t = l.a(intent2);
                aVar2.f9151u = l.a(context3);
                aVar2.f9152v = unit5;
                aVar2.f9153w = l.a(unit5);
                aVar2.f9154x = null;
                aVar2.f9155y = longExtra;
                aVar2.f9156z = 0;
                aVar2.D = 4;
            }
        }
        return objE;
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
    */
    public final Object v(Intent intent, Context context, eu.b<? super Unit> bVar) {
        c cVar;
        long longExtra;
        Throwable th2;
        Object objB;
        Context context2;
        String str;
        FriendRequestReceivedNotificationReceiver friendRequestReceivedNotificationReceiver = this;
        Intent intent2 = intent;
        Context context3 = context;
        if (bVar instanceof c) {
            cVar = (c) bVar;
            int i10 = cVar.D;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.D = i10 - Integer.MIN_VALUE;
            } else {
                cVar = friendRequestReceivedNotificationReceiver.new c(bVar);
            }
        } else {
            cVar = friendRequestReceivedNotificationReceiver.new c(bVar);
        }
        c cVar2 = cVar;
        Object objC = cVar2.B;
        Object objE = fu.c.e();
        int i11 = cVar2.D;
        if (i11 == 0) {
            o.b(objC);
            longExtra = intent2.getLongExtra("EXTRA_NOTIFICATION_USER_ID", -1L);
            if (longExtra != -1) {
                sw.d<i0> dVarDeclineFriendRequest = friendRequestReceivedNotificationReceiver.t().declineFriendRequest(longExtra);
                try {
                    n.Companion companion = n.INSTANCE;
                    Intrinsics.checkNotNull(dVarDeclineFriendRequest);
                    cVar2.f9161t = intent2;
                    cVar2.f9162u = context3;
                    cVar2.f9163v = l.a(dVarDeclineFriendRequest);
                    cVar2.f9166y = longExtra;
                    cVar2.f9167z = 0;
                    cVar2.D = 1;
                    objC = p.c(dVarDeclineFriendRequest, cVar2);
                    if (objC == objE) {
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    n.Companion companion2 = n.INSTANCE;
                    objB = n.b(o.a(th2));
                }
                return objE;
            }
            friendRequestReceivedNotificationReceiver.a(context3, 0);
            return Unit.f21506a;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                context2 = (Context) cVar2.f9162u;
                o.b(objC);
                friendRequestReceivedNotificationReceiver.a(context2, 0);
                return Unit.f21506a;
            }
            context2 = (Context) cVar2.f9162u;
            o.b(objC);
            friendRequestReceivedNotificationReceiver.a(context2, 0);
            return Unit.f21506a;
        }
        long j10 = cVar2.f9166y;
        Context context4 = (Context) cVar2.f9162u;
        Intent intent3 = (Intent) cVar2.f9161t;
        try {
            o.b(objC);
            longExtra = j10;
            context3 = context4;
            intent2 = intent3;
        } catch (Throwable th4) {
            th2 = th4;
            longExtra = j10;
            context3 = context4;
            intent2 = intent3;
            n.Companion companion3 = n.INSTANCE;
            objB = n.b(o.a(th2));
        }
        objB = n.b((x) objC);
        Context context5 = context3;
        Intent intent4 = intent2;
        context2 = context5;
        Throwable thE = n.e(objB);
        if (thE == null) {
            x xVar = (x) objB;
            ol.b bVar2 = new ol.b(xVar);
            if (bVar2.b()) {
                A(friendRequestReceivedNotificationReceiver, context2, 0L, 2, null);
            } else {
                int i12 = bVar2.f28274a;
                int i13 = i12 == 401 ? q0.f4240h : q0.f4233e1;
                if (i12 == 401) {
                    str = "unauthenticated";
                } else {
                    str = "code_" + i12 + "error_" + bVar2.a();
                }
                String str2 = str;
                cVar2.f9161t = l.a(intent4);
                cVar2.f9162u = context2;
                cVar2.f9163v = l.a(xVar);
                cVar2.f9164w = l.a(bVar2);
                cVar2.f9165x = l.a(str2);
                cVar2.f9166y = longExtra;
                cVar2.f9167z = 0;
                cVar2.A = i13;
                cVar2.D = 2;
                friendRequestReceivedNotificationReceiver = this;
            }
            return Unit.f21506a;
        }
        int i14 = q0.f4233e1;
        cVar2.f9161t = l.a(intent4);
        cVar2.f9162u = context2;
        cVar2.f9163v = l.a(thE);
        cVar2.f9166y = longExtra;
        cVar2.f9167z = 0;
        cVar2.D = 3;
        return objE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object w(Context context, Intent intent, int i10, String str, String str2, eu.b<? super Unit> bVar) {
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
        Object obj = dVar.f9173y;
        Object objE = fu.c.e();
        int i12 = dVar.A;
        if (i12 == 0) {
            o.b(obj);
            l0 l0Var = this.mainDispatcher;
            e eVar = new e(context, i10, null);
            dVar.f9168t = context;
            dVar.f9169u = intent;
            dVar.f9170v = str;
            dVar.f9171w = str2;
            dVar.f9172x = i10;
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
            String str5 = (String) dVar.f9171w;
            String str6 = (String) dVar.f9170v;
            Intent intent3 = (Intent) dVar.f9169u;
            Context context3 = (Context) dVar.f9168t;
            o.b(obj);
            str4 = str5;
            str3 = str6;
            context2 = context3;
            intent2 = intent3;
        }
        d(str3, context2, intent2, true, "FriendRequestReceived", "base2", str4);
        return Unit.f21506a;
    }

    public final void z(Context context, long delayDuration) {
        k2.k.f fVarG = new k2.k.f(context, "channel_general").C(bh.l0.f4103c).k(new RemoteViews(context.getPackageName(), n0.f4196o)).G(p001kotlin.time.a.w(delayDuration)).g(true);
        Intrinsics.checkNotNullExpressionValue(fVarG, "setAutoCancel(...)");
        NotificationManager notificationManager = (NotificationManager) l2.b.k(context, NotificationManager.class);
        if (notificationManager != null) {
            notificationManager.notify(0, fVarG.d());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FriendRequestReceivedNotificationReceiver(@NotNull l0 ioDispatcher, @NotNull l0 mainDispatcher, @NotNull Function0<? extends FriendsInterface> friendsInterfaceProvider) {
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(friendsInterfaceProvider, "friendsInterfaceProvider");
        this.mainDispatcher = mainDispatcher;
        this.friendsInterfaceProvider = friendsInterfaceProvider;
        this.broadcastScope = av.q0.a(z2.b(null, 1, null).plus(ioDispatcher));
    }

    public /* synthetic */ FriendRequestReceivedNotificationReceiver(l0 l0Var, l0 l0Var2, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? g1.b() : l0Var, (i10 & 2) != 0 ? g1.c() : l0Var2, (i10 & 4) != 0 ? new Function0() { // from class: vj.f
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FriendRequestReceivedNotificationReceiver.o();
            }
        } : function0);
    }
}
