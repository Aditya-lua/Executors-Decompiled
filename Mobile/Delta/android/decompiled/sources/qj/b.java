package qj;

import android.content.Context;
import android.graphics.Bitmap;
import com.roblox.client.pushnotification.v2.richpushnotifications.PushNotificationImageConfig;
import gk.p;
import java.util.List;
import jt.n;
import jt.o;
import k6.d0;
import k6.s;
import k6.v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.g1;
import ku.g3;
import ku.p0;
import ku.q0;
import ku.w0;
import ku.z2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.f;
import pt.l;
import pt.m;
import x6.ErrorResult;
import x6.ImageRequest;
import x6.SuccessResult;
import x6.i;
import x6.k;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013*\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001a¨\u0006\u001c"}, d2 = {"Lqj/b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;", "largeIconConfig", "bigPictureConfig", "", "timeoutMs", "Lkotlin/Function1;", "Lqj/a;", "", "onComplete", "c", "(Landroid/content/Context;Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;JLkotlin/jvm/functions/Function1;)V", "Lkotlin/time/a;", "timeout", "Ljt/n;", "Landroid/graphics/Bitmap;", "b", "(Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;Landroid/content/Context;JLnt/b;)Ljava/lang/Object;", "J", "DEFAULT_TIMEOUT", "Lku/p0;", "Lku/p0;", "scope", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f29423a = new b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final long DEFAULT_TIMEOUT;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final p0 scope;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29425a;

        static {
            int[] iArr = new int[qj.c.values().length];
            try {
                iArr[qj.c.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[qj.c.SQUARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[qj.c.RECTANGLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f29425a = iArr;
        }
    }

    /* JADX INFO: renamed from: qj.b$b, reason: collision with other inner class name */
    @f(c = "com.roblox.client.pushnotification.v2.richpushnotifications.PushNotificationImageFetcher", f = "PushNotificationImageFetcher.kt", l = {101}, m = "load-E0qYoyE", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C0518b extends pt.d {
        public /* synthetic */ Object A;
        public int C;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f29426t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f29427u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f29428v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f29429w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public long f29430x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f29431y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f29432z;

        public C0518b(nt.b<? super C0518b> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.A = obj;
            this.C |= Integer.MIN_VALUE;
            Object objB = b.this.b(null, null, 0L, this);
            return objB == ot.c.e() ? objB : n.a(objB);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "Lx6/k;", "<anonymous>", "(Lku/p0;)Lx6/k;"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.pushnotification.v2.richpushnotifications.PushNotificationImageFetcher$load$3$1$1", f = "PushNotificationImageFetcher.kt", l = {101}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<p0, nt.b<? super k>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f29433t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ s f29434u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ ImageRequest.a f29435v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(s sVar, ImageRequest.a aVar, nt.b<? super c> bVar) {
            super(2, bVar);
            this.f29434u = sVar;
            this.f29435v = aVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new c(this.f29434u, this.f29435v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f29433t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            s sVar = this.f29434u;
            ImageRequest imageRequestB = this.f29435v.b();
            this.f29433t = 1;
            Object objD = sVar.d(imageRequestB, this);
            return objD == objE ? objE : objD;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super k> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.pushnotification.v2.richpushnotifications.PushNotificationImageFetcher$loadImagesForBigPictureNotification$1", f = "PushNotificationImageFetcher.kt", l = {61, 62}, m = "invokeSuspend", v = 1)
    public static final class d extends m implements Function2<p0, nt.b<? super Unit>, Object> {
        public final /* synthetic */ PushNotificationImageConfig A;
        public final /* synthetic */ Context B;
        public final /* synthetic */ long C;
        public final /* synthetic */ PushNotificationImageConfig D;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f29436t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f29437u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f29438v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f29439w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f29440x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f29441y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Function1<qj.a, Unit> f29442z;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lku/p0;", "Ljt/n;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Lku/p0;)Ljt/n;"}, k = 3, mv = {2, 2, 0})
        @f(c = "com.roblox.client.pushnotification.v2.richpushnotifications.PushNotificationImageFetcher$loadImagesForBigPictureNotification$1$bigPicture$1", f = "PushNotificationImageFetcher.kt", l = {58}, m = "invokeSuspend", v = 1)
        public static final class a extends m implements Function2<p0, nt.b<? super n<? extends Bitmap>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f29443t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ PushNotificationImageConfig f29444u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Context f29445v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ long f29446w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PushNotificationImageConfig pushNotificationImageConfig, Context context, long j10, nt.b<? super a> bVar) {
                super(2, bVar);
                this.f29444u = pushNotificationImageConfig;
                this.f29445v = context;
                this.f29446w = j10;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                return new a(this.f29444u, this.f29445v, this.f29446w, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, nt.b<? super n<? extends Bitmap>> bVar) {
                return invoke2(p0Var, (nt.b<? super n<Bitmap>>) bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                Object objB;
                Object objE = ot.c.e();
                int i10 = this.f29443t;
                if (i10 == 0) {
                    o.b(obj);
                    b bVar = b.f29423a;
                    PushNotificationImageConfig pushNotificationImageConfig = this.f29444u;
                    Context context = this.f29445v;
                    kotlin.time.a.Companion companion = kotlin.time.a.INSTANCE;
                    long jQ = kotlin.time.b.q(this.f29446w, ju.b.MILLISECONDS);
                    this.f29443t = 1;
                    objB = bVar.b(pushNotificationImageConfig, context, jQ, this);
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
                return n.a(objB);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(p0 p0Var, nt.b<? super n<Bitmap>> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX INFO: renamed from: qj.b$d$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lku/p0;", "Ljt/n;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Lku/p0;)Ljt/n;"}, k = 3, mv = {2, 2, 0})
        @f(c = "com.roblox.client.pushnotification.v2.richpushnotifications.PushNotificationImageFetcher$loadImagesForBigPictureNotification$1$largeIcon$1", f = "PushNotificationImageFetcher.kt", l = {57}, m = "invokeSuspend", v = 1)
        public static final class C0519b extends m implements Function2<p0, nt.b<? super n<? extends Bitmap>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f29447t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ PushNotificationImageConfig f29448u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Context f29449v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ long f29450w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0519b(PushNotificationImageConfig pushNotificationImageConfig, Context context, long j10, nt.b<? super C0519b> bVar) {
                super(2, bVar);
                this.f29448u = pushNotificationImageConfig;
                this.f29449v = context;
                this.f29450w = j10;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                return new C0519b(this.f29448u, this.f29449v, this.f29450w, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, nt.b<? super n<? extends Bitmap>> bVar) {
                return invoke2(p0Var, (nt.b<? super n<Bitmap>>) bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                Object objB;
                Object objE = ot.c.e();
                int i10 = this.f29447t;
                if (i10 == 0) {
                    o.b(obj);
                    b bVar = b.f29423a;
                    PushNotificationImageConfig pushNotificationImageConfig = this.f29448u;
                    Context context = this.f29449v;
                    kotlin.time.a.Companion companion = kotlin.time.a.INSTANCE;
                    long jQ = kotlin.time.b.q(this.f29450w, ju.b.MILLISECONDS);
                    this.f29447t = 1;
                    objB = bVar.b(pushNotificationImageConfig, context, jQ, this);
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
                return n.a(objB);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(p0 p0Var, nt.b<? super n<Bitmap>> bVar) {
                return ((C0519b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function1<? super qj.a, Unit> function1, PushNotificationImageConfig pushNotificationImageConfig, Context context, long j10, PushNotificationImageConfig pushNotificationImageConfig2, nt.b<? super d> bVar) {
            super(2, bVar);
            this.f29442z = function1;
            this.A = pushNotificationImageConfig;
            this.B = context;
            this.C = j10;
            this.D = pushNotificationImageConfig2;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            d dVar = new d(this.f29442z, this.A, this.B, this.C, this.D, bVar);
            dVar.f29441y = obj;
            return dVar;
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            w0 w0VarB;
            w0 w0VarB2;
            Function1<qj.a, Unit> function1;
            Object objB;
            Object objB2;
            Object obj2;
            p0 p0Var = (p0) this.f29441y;
            Object objE = ot.c.e();
            int i10 = this.f29440x;
            if (i10 == 0) {
                o.b(obj);
                w0VarB = ku.k.b(p0Var, null, null, new C0519b(this.A, this.B, this.C, null), 3, null);
                w0VarB2 = ku.k.b(p0Var, null, null, new a(this.D, this.B, this.C, null), 3, null);
                function1 = this.f29442z;
                this.f29441y = l.a(p0Var);
                this.f29436t = l.a(w0VarB);
                this.f29437u = w0VarB2;
                this.f29438v = function1;
                this.f29440x = 1;
                objB = w0VarB.B(this);
                if (objB != objE) {
                }
                return objE;
            }
            if (i10 == 1) {
                function1 = (Function1) this.f29438v;
                w0VarB2 = (w0) this.f29437u;
                w0 w0Var = (w0) this.f29436t;
                o.b(obj);
                w0VarB = w0Var;
                objB = obj;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f29439w;
                Function1<qj.a, Unit> function2 = (Function1) this.f29438v;
                o.b(obj);
                function1 = function2;
                objB2 = obj;
            }
            function1.invoke(new qj.a(obj2, ((n) objB2).getValue()));
            return Unit.f22483a;
            Object value = ((n) objB).getValue();
            this.f29441y = l.a(p0Var);
            this.f29436t = l.a(w0VarB);
            this.f29437u = l.a(w0VarB2);
            this.f29438v = function1;
            this.f29439w = value;
            this.f29440x = 2;
            objB2 = w0VarB2.B(this);
            if (objB2 != objE) {
                obj2 = value;
                function1.invoke(new qj.a(obj2, ((n) objB2).getValue()));
                return Unit.f22483a;
            }
            return objE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    static {
        kotlin.time.a.Companion companion = kotlin.time.a.INSTANCE;
        DEFAULT_TIMEOUT = kotlin.time.b.p(5, ju.b.SECONDS);
        scope = q0.a(g1.b().plus(z2.b(null, 1, null)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object b(PushNotificationImageConfig pushNotificationImageConfig, Context context, long j10, nt.b<? super n<Bitmap>> bVar) {
        C0518b c0518b;
        Object objB;
        Object objB2;
        Object objB3;
        Object objA;
        PushNotificationImageConfig pushNotificationImageConfig2 = pushNotificationImageConfig;
        if (bVar instanceof C0518b) {
            c0518b = (C0518b) bVar;
            int i10 = c0518b.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0518b.C = i10 - Integer.MIN_VALUE;
            } else {
                c0518b = new C0518b(bVar);
            }
        } else {
            c0518b = new C0518b(bVar);
        }
        Object objD = c0518b.A;
        Object objE = ot.c.e();
        int i11 = c0518b.C;
        try {
            if (i11 == 0) {
                o.b(objD);
                if (pushNotificationImageConfig2 == null) {
                    return n.b(null);
                }
                ImageRequest.a aVarC = new ImageRequest.a(context).c(pushNotificationImageConfig2.getUrl());
                List listC = kotlin.collections.o.c();
                if (pushNotificationImageConfig2.getAddBackgroundColor()) {
                    listC.add(new jk.a(context, 0, 2, null));
                }
                try {
                    n.Companion companion = n.INSTANCE;
                    int i12 = a.f29425a[pushNotificationImageConfig2.getShape().ordinal()];
                    if (i12 == 1) {
                        objA = pt.b.a(listC.add(new c7.a()));
                    } else if (i12 != 2) {
                        objA = i12 != 3 ? Unit.f22483a : pt.b.a(listC.add(new jk.b(0.0f, 1, null)));
                    } else {
                        objA = pt.b.a(listC.add(new jk.c()));
                    }
                    objB3 = n.b(objA);
                } catch (Throwable th2) {
                    n.Companion companion2 = n.INSTANCE;
                    objB3 = n.b(o.a(th2));
                }
                Throwable thE = n.e(objB3);
                if (thE != null) {
                    p.f("PushNotificationImageFetcher", "Error occurred while getting image shape.", thE);
                }
                ImageRequest.a aVarI = i.i(aVarC, kotlin.collections.o.a(listC));
                s sVarA = d0.a(context);
                c cVar = new c(sVarA, aVarI, null);
                c0518b.f29426t = pushNotificationImageConfig2;
                c0518b.f29427u = l.a(context);
                c0518b.f29428v = l.a(aVarI);
                c0518b.f29429w = l.a(sVarA);
                c0518b.f29430x = j10;
                c0518b.f29431y = 0;
                c0518b.f29432z = 0;
                c0518b.C = 1;
                objD = g3.d(j10, cVar, c0518b);
                if (objD == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pushNotificationImageConfig2 = (PushNotificationImageConfig) c0518b.f29426t;
                o.b(objD);
            }
            objB = n.b((k) objD);
        } catch (Throwable th3) {
            n.Companion companion3 = n.INSTANCE;
            objB = n.b(o.a(th3));
        }
        if (n.h(objB)) {
            try {
                k kVar = (k) objB;
                if (!(kVar instanceof SuccessResult)) {
                    if (kVar instanceof ErrorResult) {
                        throw ((ErrorResult) kVar).getThrowable();
                    }
                    throw new jt.l();
                }
                objB2 = n.b(v.g(((SuccessResult) kVar).getImage(), 0, 0, 3, null));
            } catch (Throwable th4) {
                n.Companion companion4 = n.INSTANCE;
                objB = o.a(th4);
                objB2 = n.b(objB);
            }
        } else {
            objB2 = n.b(objB);
        }
        Throwable thE2 = n.e(objB2);
        if (thE2 != null) {
            p.f("PushNotificationImageFetcher", "Error loading image. " + pushNotificationImageConfig2, thE2);
        }
        return objB2;
    }

    public final void c(@NotNull Context context, @Nullable PushNotificationImageConfig largeIconConfig, @Nullable PushNotificationImageConfig bigPictureConfig, long timeoutMs, @NotNull Function1<? super qj.a, Unit> onComplete) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        ku.k.d(scope, null, null, new d(onComplete, largeIconConfig, context, timeoutMs, bigPictureConfig, null), 3, null);
    }
}
