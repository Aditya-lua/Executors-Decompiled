package oj;

import android.content.Context;
import android.graphics.Bitmap;
import com.roblox.client.pushnotification.v2.richpushnotifications.PushNotificationImageConfig;
import ek.q;
import gt.n;
import gt.o;
import iu.g1;
import iu.g3;
import iu.p0;
import iu.q0;
import iu.w0;
import iu.z2;
import java.util.List;
import k6.d0;
import k6.s;
import k6.v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nt.f;
import nt.l;
import nt.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x6.ErrorResult;
import x6.ImageRequest;
import x6.SuccessResult;
import x6.i;
import x6.k;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013*\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001a¨\u0006\u001c"}, d2 = {"Loj/b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;", "largeIconConfig", "bigPictureConfig", "", "timeoutMs", "Lkotlin/Function1;", "Loj/a;", "", "onComplete", "c", "(Landroid/content/Context;Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;JLkotlin/jvm/functions/Function1;)V", "Lkotlin/time/a;", "timeout", "Lgt/n;", "Landroid/graphics/Bitmap;", "b", "(Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;Landroid/content/Context;JLlt/b;)Ljava/lang/Object;", "J", "DEFAULT_TIMEOUT", "Liu/p0;", "Liu/p0;", "scope", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f27927a = new b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final long DEFAULT_TIMEOUT;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final p0 scope;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27929a;

        static {
            int[] iArr = new int[oj.c.values().length];
            try {
                iArr[oj.c.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[oj.c.SQUARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[oj.c.RECTANGLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f27929a = iArr;
        }
    }

    /* JADX INFO: renamed from: oj.b$b, reason: collision with other inner class name */
    @f(c = "com.roblox.client.pushnotification.v2.richpushnotifications.PushNotificationImageFetcher", f = "PushNotificationImageFetcher.kt", l = {101}, m = "load-E0qYoyE", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C0486b extends nt.d {
        public /* synthetic */ Object A;
        public int C;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f27930t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f27931u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f27932v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f27933w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public long f27934x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f27935y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f27936z;

        public C0486b(lt.b<? super C0486b> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.A = obj;
            this.C |= Integer.MIN_VALUE;
            Object objB = b.this.b(null, null, 0L, this);
            return objB == mt.c.e() ? objB : n.a(objB);
        }
    }

    @f(c = "com.roblox.client.pushnotification.v2.richpushnotifications.PushNotificationImageFetcher$load$3$1$1", f = "PushNotificationImageFetcher.kt", l = {101}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "Lx6/k;", "<anonymous>", "(Liu/p0;)Lx6/k;"}, k = 3, mv = {2, 2, 0})
    public static final class c extends m implements Function2<p0, lt.b<? super k>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f27937t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ s f27938u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ ImageRequest.a f27939v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(s sVar, ImageRequest.a aVar, lt.b<? super c> bVar) {
            super(2, bVar);
            this.f27938u = sVar;
            this.f27939v = aVar;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new c(this.f27938u, this.f27939v, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super k> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f27937t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            s sVar = this.f27938u;
            ImageRequest imageRequestB = this.f27939v.b();
            this.f27937t = 1;
            Object objA = sVar.a(imageRequestB, this);
            return objA == objE ? objE : objA;
        }
    }

    @f(c = "com.roblox.client.pushnotification.v2.richpushnotifications.PushNotificationImageFetcher$loadImagesForBigPictureNotification$1", f = "PushNotificationImageFetcher.kt", l = {61, 62}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class d extends m implements Function2<p0, lt.b<? super Unit>, Object> {
        public final /* synthetic */ PushNotificationImageConfig A;
        public final /* synthetic */ Context B;
        public final /* synthetic */ long C;
        public final /* synthetic */ PushNotificationImageConfig D;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f27940t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f27941u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f27942v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f27943w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f27944x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f27945y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Function1<oj.a, Unit> f27946z;

        @f(c = "com.roblox.client.pushnotification.v2.richpushnotifications.PushNotificationImageFetcher$loadImagesForBigPictureNotification$1$bigPicture$1", f = "PushNotificationImageFetcher.kt", l = {58}, m = "invokeSuspend", v = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Liu/p0;", "Lgt/n;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Liu/p0;)Lgt/n;"}, k = 3, mv = {2, 2, 0})
        public static final class a extends m implements Function2<p0, lt.b<? super n<? extends Bitmap>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f27947t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ PushNotificationImageConfig f27948u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Context f27949v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ long f27950w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PushNotificationImageConfig pushNotificationImageConfig, Context context, long j10, lt.b<? super a> bVar) {
                super(2, bVar);
                this.f27948u = pushNotificationImageConfig;
                this.f27949v = context;
                this.f27950w = j10;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                return new a(this.f27948u, this.f27949v, this.f27950w, bVar);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(p0 p0Var, lt.b<? super n<Bitmap>> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                Object objB;
                Object objE = mt.c.e();
                int i10 = this.f27947t;
                if (i10 == 0) {
                    o.b(obj);
                    b bVar = b.f27927a;
                    PushNotificationImageConfig pushNotificationImageConfig = this.f27948u;
                    Context context = this.f27949v;
                    kotlin.time.a.Companion companion = kotlin.time.a.INSTANCE;
                    long jQ = kotlin.time.b.q(this.f27950w, hu.b.MILLISECONDS);
                    this.f27947t = 1;
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

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, lt.b<? super n<? extends Bitmap>> bVar) {
                return invoke2(p0Var, (lt.b<? super n<Bitmap>>) bVar);
            }
        }

        /* JADX INFO: renamed from: oj.b$d$b, reason: collision with other inner class name */
        @f(c = "com.roblox.client.pushnotification.v2.richpushnotifications.PushNotificationImageFetcher$loadImagesForBigPictureNotification$1$largeIcon$1", f = "PushNotificationImageFetcher.kt", l = {57}, m = "invokeSuspend", v = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Liu/p0;", "Lgt/n;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Liu/p0;)Lgt/n;"}, k = 3, mv = {2, 2, 0})
        public static final class C0487b extends m implements Function2<p0, lt.b<? super n<? extends Bitmap>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f27951t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ PushNotificationImageConfig f27952u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Context f27953v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ long f27954w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0487b(PushNotificationImageConfig pushNotificationImageConfig, Context context, long j10, lt.b<? super C0487b> bVar) {
                super(2, bVar);
                this.f27952u = pushNotificationImageConfig;
                this.f27953v = context;
                this.f27954w = j10;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                return new C0487b(this.f27952u, this.f27953v, this.f27954w, bVar);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(p0 p0Var, lt.b<? super n<Bitmap>> bVar) {
                return ((C0487b) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                Object objB;
                Object objE = mt.c.e();
                int i10 = this.f27951t;
                if (i10 == 0) {
                    o.b(obj);
                    b bVar = b.f27927a;
                    PushNotificationImageConfig pushNotificationImageConfig = this.f27952u;
                    Context context = this.f27953v;
                    kotlin.time.a.Companion companion = kotlin.time.a.INSTANCE;
                    long jQ = kotlin.time.b.q(this.f27954w, hu.b.MILLISECONDS);
                    this.f27951t = 1;
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

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, lt.b<? super n<? extends Bitmap>> bVar) {
                return invoke2(p0Var, (lt.b<? super n<Bitmap>>) bVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function1<? super oj.a, Unit> function1, PushNotificationImageConfig pushNotificationImageConfig, Context context, long j10, PushNotificationImageConfig pushNotificationImageConfig2, lt.b<? super d> bVar) {
            super(2, bVar);
            this.f27946z = function1;
            this.A = pushNotificationImageConfig;
            this.B = context;
            this.C = j10;
            this.D = pushNotificationImageConfig2;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            d dVar = new d(this.f27946z, this.A, this.B, this.C, this.D, bVar);
            dVar.f27945y = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            w0 w0VarB;
            w0 w0VarB2;
            Function1<oj.a, Unit> function1;
            Object objN;
            Object objN2;
            Object obj2;
            p0 p0Var = (p0) this.f27945y;
            Object objE = mt.c.e();
            int i10 = this.f27944x;
            if (i10 == 0) {
                o.b(obj);
                w0VarB = iu.k.b(p0Var, null, null, new C0487b(this.A, this.B, this.C, null), 3, null);
                w0VarB2 = iu.k.b(p0Var, null, null, new a(this.D, this.B, this.C, null), 3, null);
                function1 = this.f27946z;
                this.f27945y = l.a(p0Var);
                this.f27940t = l.a(w0VarB);
                this.f27941u = w0VarB2;
                this.f27942v = function1;
                this.f27944x = 1;
                objN = w0VarB.n(this);
                if (objN != objE) {
                }
                return objE;
            }
            if (i10 == 1) {
                function1 = (Function1) this.f27942v;
                w0VarB2 = (w0) this.f27941u;
                w0 w0Var = (w0) this.f27940t;
                o.b(obj);
                w0VarB = w0Var;
                objN = obj;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f27943w;
                Function1<oj.a, Unit> function2 = (Function1) this.f27942v;
                o.b(obj);
                function1 = function2;
                objN2 = obj;
            }
            function1.invoke(new oj.a(obj2, ((n) objN2).getValue()));
            return Unit.f22938a;
            Object value = ((n) objN).getValue();
            this.f27945y = l.a(p0Var);
            this.f27940t = l.a(w0VarB);
            this.f27941u = l.a(w0VarB2);
            this.f27942v = function1;
            this.f27943w = value;
            this.f27944x = 2;
            objN2 = w0VarB2.n(this);
            if (objN2 != objE) {
                obj2 = value;
                function1.invoke(new oj.a(obj2, ((n) objN2).getValue()));
                return Unit.f22938a;
            }
            return objE;
        }
    }

    static {
        kotlin.time.a.Companion companion = kotlin.time.a.INSTANCE;
        DEFAULT_TIMEOUT = kotlin.time.b.p(5, hu.b.SECONDS);
        scope = q0.a(g1.b().plus(z2.b(null, 1, null)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object b(PushNotificationImageConfig pushNotificationImageConfig, Context context, long j10, lt.b<? super n<Bitmap>> bVar) {
        C0486b c0486b;
        Object objB;
        Object objB2;
        Object objB3;
        Object objA;
        PushNotificationImageConfig pushNotificationImageConfig2 = pushNotificationImageConfig;
        if (bVar instanceof C0486b) {
            c0486b = (C0486b) bVar;
            int i10 = c0486b.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0486b.C = i10 - Integer.MIN_VALUE;
            } else {
                c0486b = new C0486b(bVar);
            }
        } else {
            c0486b = new C0486b(bVar);
        }
        Object objD = c0486b.A;
        Object objE = mt.c.e();
        int i11 = c0486b.C;
        try {
            if (i11 == 0) {
                o.b(objD);
                if (pushNotificationImageConfig2 == null) {
                    return n.b(null);
                }
                ImageRequest.a aVarC = new ImageRequest.a(context).c(pushNotificationImageConfig2.getUrl());
                List listC = kotlin.collections.o.c();
                if (pushNotificationImageConfig2.getAddBackgroundColor()) {
                    listC.add(new hk.a(context, 0, 2, null));
                }
                try {
                    n.Companion companion = n.INSTANCE;
                    int i12 = a.f27929a[pushNotificationImageConfig2.getShape().ordinal()];
                    if (i12 == 1) {
                        objA = nt.b.a(listC.add(new c7.a()));
                    } else if (i12 != 2) {
                        objA = i12 != 3 ? Unit.f22938a : nt.b.a(listC.add(new hk.b(0.0f, 1, null)));
                    } else {
                        objA = nt.b.a(listC.add(new hk.c()));
                    }
                    objB3 = n.b(objA);
                } catch (Throwable th2) {
                    n.Companion companion2 = n.INSTANCE;
                    objB3 = n.b(o.a(th2));
                }
                Throwable thE = n.e(objB3);
                if (thE != null) {
                    q.f("PushNotificationImageFetcher", "Error occurred while getting image shape.", thE);
                }
                ImageRequest.a aVarI = i.i(aVarC, kotlin.collections.o.a(listC));
                s sVarA = d0.a(context);
                c cVar = new c(sVarA, aVarI, null);
                c0486b.f27930t = pushNotificationImageConfig2;
                c0486b.f27931u = l.a(context);
                c0486b.f27932v = l.a(aVarI);
                c0486b.f27933w = l.a(sVarA);
                c0486b.f27934x = j10;
                c0486b.f27935y = 0;
                c0486b.f27936z = 0;
                c0486b.C = 1;
                objD = g3.d(j10, cVar, c0486b);
                if (objD == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pushNotificationImageConfig2 = (PushNotificationImageConfig) c0486b.f27930t;
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
                    throw new gt.l();
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
            q.f("PushNotificationImageFetcher", "Error loading image. " + pushNotificationImageConfig2, thE2);
        }
        return objB2;
    }

    public final void c(@NotNull Context context, @Nullable PushNotificationImageConfig largeIconConfig, @Nullable PushNotificationImageConfig bigPictureConfig, long timeoutMs, @NotNull Function1<? super oj.a, Unit> onComplete) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        iu.k.d(scope, null, null, new d(onComplete, largeIconConfig, context, timeoutMs, bigPictureConfig, null), 3, null);
    }
}
