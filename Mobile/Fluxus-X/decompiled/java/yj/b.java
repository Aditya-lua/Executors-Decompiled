package yj;

import android.content.Context;
import android.graphics.Bitmap;
import av.g1;
import av.g3;
import av.p0;
import av.q0;
import av.w0;
import av.z2;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.common.MlKitException;
import com.roblox.client.pushnotification.v2.richpushnotifications.PushNotificationImageConfig;
import gu.f;
import gu.l;
import gu.m;
import java.util.List;
import l6.d0;
import l6.s;
import l6.v;
import ok.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import y6.ErrorResult;
import y6.ImageRequest;
import y6.SuccessResult;
import y6.i;
import y6.k;
import zt.n;
import zt.o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013*\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001a¨\u0006\u001c"}, d2 = {"Lyj/b;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;", "largeIconConfig", "bigPictureConfig", BuildConfig.FLAVOR, "timeoutMs", "Lkotlin/Function1;", "Lyj/a;", BuildConfig.FLAVOR, "onComplete", "c", "(Landroid/content/Context;Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;JLkotlin/jvm/functions/Function1;)V", "Lkotlin/time/a;", "timeout", "Lzt/n;", "Landroid/graphics/Bitmap;", "b", "(Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;Landroid/content/Context;JLeu/b;)Ljava/lang/Object;", "J", "DEFAULT_TIMEOUT", "Lav/p0;", "Lav/p0;", "scope", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f37901a = new b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final long DEFAULT_TIMEOUT;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final p0 scope;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37903a;

        static {
            int[] iArr = new int[yj.c.values().length];
            try {
                iArr[yj.c.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[yj.c.SQUARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[yj.c.RECTANGLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f37903a = iArr;
        }
    }

    /* JADX INFO: renamed from: yj.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @f(c = "com.roblox.client.pushnotification.v2.richpushnotifications.PushNotificationImageFetcher", f = "PushNotificationImageFetcher.kt", l = {MlKitException.NOT_ENOUGH_SPACE}, m = "load-E0qYoyE", v = 1)
    public static final class C0769b extends gu.d {
        public /* synthetic */ Object A;
        public int C;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f37904t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f37905u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f37906v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f37907w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public long f37908x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f37909y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f37910z;

        public C0769b(eu.b<? super C0769b> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.A = obj;
            this.C |= Integer.MIN_VALUE;
            Object objB = b.this.b(null, null, 0L, this);
            return objB == fu.c.e() ? objB : n.a(objB);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", "Ly6/k;", "<anonymous>", "(Lav/p0;)Ly6/k;"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.pushnotification.v2.richpushnotifications.PushNotificationImageFetcher$load$3$1$1", f = "PushNotificationImageFetcher.kt", l = {MlKitException.NOT_ENOUGH_SPACE}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<p0, eu.b<? super k>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f37911t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ s f37912u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ ImageRequest.a f37913v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(s sVar, ImageRequest.a aVar, eu.b<? super c> bVar) {
            super(2, bVar);
            this.f37912u = sVar;
            this.f37913v = aVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new c(this.f37912u, this.f37913v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super k> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f37911t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            s sVar = this.f37912u;
            ImageRequest imageRequestB = this.f37913v.b();
            this.f37911t = 1;
            Object objA = sVar.a(imageRequestB, this);
            return objA == objE ? objE : objA;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.pushnotification.v2.richpushnotifications.PushNotificationImageFetcher$loadImagesForBigPictureNotification$1", f = "PushNotificationImageFetcher.kt", l = {61, 62}, m = "invokeSuspend", v = 1)
    public static final class d extends m implements Function2<p0, eu.b<? super Unit>, Object> {
        public final /* synthetic */ PushNotificationImageConfig A;
        public final /* synthetic */ Context B;
        public final /* synthetic */ long C;
        public final /* synthetic */ PushNotificationImageConfig D;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f37914t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f37915u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f37916v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f37917w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f37918x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f37919y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Function1<yj.a, Unit> f37920z;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lav/p0;", "Lzt/n;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Lav/p0;)Lzt/n;"}, k = 3, mv = {2, 2, 0})
        @f(c = "com.roblox.client.pushnotification.v2.richpushnotifications.PushNotificationImageFetcher$loadImagesForBigPictureNotification$1$bigPicture$1", f = "PushNotificationImageFetcher.kt", l = {58}, m = "invokeSuspend", v = 1)
        public static final class a extends m implements Function2<p0, eu.b<? super n<? extends Bitmap>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f37921t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ PushNotificationImageConfig f37922u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Context f37923v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ long f37924w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PushNotificationImageConfig pushNotificationImageConfig, Context context, long j10, eu.b<? super a> bVar) {
                super(2, bVar);
                this.f37922u = pushNotificationImageConfig;
                this.f37923v = context;
                this.f37924w = j10;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new a(this.f37922u, this.f37923v, this.f37924w, bVar);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(p0 p0Var, eu.b<? super n<Bitmap>> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objB;
                Object objE = fu.c.e();
                int i10 = this.f37921t;
                if (i10 == 0) {
                    o.b(obj);
                    b bVar = b.f37901a;
                    PushNotificationImageConfig pushNotificationImageConfig = this.f37922u;
                    Context context = this.f37923v;
                    p001kotlin.time.a.Companion companion = p001kotlin.time.a.INSTANCE;
                    long jQ = p001kotlin.time.b.q(this.f37924w, zu.b.MILLISECONDS);
                    this.f37921t = 1;
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

            @Override // p001kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, eu.b<? super n<? extends Bitmap>> bVar) {
                return invoke2(p0Var, (eu.b<? super n<Bitmap>>) bVar);
            }
        }

        /* JADX INFO: renamed from: yj.b$d$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lav/p0;", "Lzt/n;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Lav/p0;)Lzt/n;"}, k = 3, mv = {2, 2, 0})
        @f(c = "com.roblox.client.pushnotification.v2.richpushnotifications.PushNotificationImageFetcher$loadImagesForBigPictureNotification$1$largeIcon$1", f = "PushNotificationImageFetcher.kt", l = {57}, m = "invokeSuspend", v = 1)
        public static final class C0770b extends m implements Function2<p0, eu.b<? super n<? extends Bitmap>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f37925t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ PushNotificationImageConfig f37926u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Context f37927v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ long f37928w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0770b(PushNotificationImageConfig pushNotificationImageConfig, Context context, long j10, eu.b<? super C0770b> bVar) {
                super(2, bVar);
                this.f37926u = pushNotificationImageConfig;
                this.f37927v = context;
                this.f37928w = j10;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new C0770b(this.f37926u, this.f37927v, this.f37928w, bVar);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(p0 p0Var, eu.b<? super n<Bitmap>> bVar) {
                return ((C0770b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objB;
                Object objE = fu.c.e();
                int i10 = this.f37925t;
                if (i10 == 0) {
                    o.b(obj);
                    b bVar = b.f37901a;
                    PushNotificationImageConfig pushNotificationImageConfig = this.f37926u;
                    Context context = this.f37927v;
                    p001kotlin.time.a.Companion companion = p001kotlin.time.a.INSTANCE;
                    long jQ = p001kotlin.time.b.q(this.f37928w, zu.b.MILLISECONDS);
                    this.f37925t = 1;
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

            @Override // p001kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, eu.b<? super n<? extends Bitmap>> bVar) {
                return invoke2(p0Var, (eu.b<? super n<Bitmap>>) bVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function1<? super yj.a, Unit> function1, PushNotificationImageConfig pushNotificationImageConfig, Context context, long j10, PushNotificationImageConfig pushNotificationImageConfig2, eu.b<? super d> bVar) {
            super(2, bVar);
            this.f37920z = function1;
            this.A = pushNotificationImageConfig;
            this.B = context;
            this.C = j10;
            this.D = pushNotificationImageConfig2;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            d dVar = new d(this.f37920z, this.A, this.B, this.C, this.D, bVar);
            dVar.f37919y = obj;
            return dVar;
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            w0 w0VarB;
            w0 w0VarB2;
            Function1<yj.a, Unit> function1;
            Object objY;
            Object objY2;
            Object obj2;
            p0 p0Var = (p0) this.f37919y;
            Object objE = fu.c.e();
            int i10 = this.f37918x;
            if (i10 == 0) {
                o.b(obj);
                w0VarB = av.k.b(p0Var, null, null, new C0770b(this.A, this.B, this.C, null), 3, null);
                w0VarB2 = av.k.b(p0Var, null, null, new a(this.D, this.B, this.C, null), 3, null);
                function1 = this.f37920z;
                this.f37919y = l.a(p0Var);
                this.f37914t = l.a(w0VarB);
                this.f37915u = w0VarB2;
                this.f37916v = function1;
                this.f37918x = 1;
                objY = w0VarB.y(this);
                if (objY != objE) {
                }
                return objE;
            }
            if (i10 == 1) {
                function1 = (Function1) this.f37916v;
                w0VarB2 = (w0) this.f37915u;
                w0 w0Var = (w0) this.f37914t;
                o.b(obj);
                w0VarB = w0Var;
                objY = obj;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f37917w;
                Function1<yj.a, Unit> function2 = (Function1) this.f37916v;
                o.b(obj);
                function1 = function2;
                objY2 = obj;
            }
            function1.invoke(new yj.a(obj2, ((n) objY2).getValue()));
            return Unit.f21506a;
            Object value = ((n) objY).getValue();
            this.f37919y = l.a(p0Var);
            this.f37914t = l.a(w0VarB);
            this.f37915u = l.a(w0VarB2);
            this.f37916v = function1;
            this.f37917w = value;
            this.f37918x = 2;
            objY2 = w0VarB2.y(this);
            if (objY2 != objE) {
                obj2 = value;
                function1.invoke(new yj.a(obj2, ((n) objY2).getValue()));
                return Unit.f21506a;
            }
            return objE;
        }
    }

    static {
        p001kotlin.time.a.Companion companion = p001kotlin.time.a.INSTANCE;
        DEFAULT_TIMEOUT = p001kotlin.time.b.p(5, zu.b.SECONDS);
        scope = q0.a(g1.b().plus(z2.b(null, 1, null)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object b(PushNotificationImageConfig pushNotificationImageConfig, Context context, long j10, eu.b<? super n<Bitmap>> bVar) {
        C0769b c0769b;
        Object objB;
        Object objB2;
        Object objB3;
        Object objA;
        PushNotificationImageConfig pushNotificationImageConfig2 = pushNotificationImageConfig;
        if (bVar instanceof C0769b) {
            c0769b = (C0769b) bVar;
            int i10 = c0769b.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0769b.C = i10 - Integer.MIN_VALUE;
            } else {
                c0769b = new C0769b(bVar);
            }
        } else {
            c0769b = new C0769b(bVar);
        }
        Object objD = c0769b.A;
        Object objE = fu.c.e();
        int i11 = c0769b.C;
        try {
            if (i11 == 0) {
                o.b(objD);
                if (pushNotificationImageConfig2 == null) {
                    return n.b(null);
                }
                ImageRequest.a aVarC = new ImageRequest.a(context).c(pushNotificationImageConfig2.getUrl());
                List listC = p001kotlin.collections.o.c();
                if (pushNotificationImageConfig2.getAddBackgroundColor()) {
                    listC.add(new rk.a(context, 0, 2, null));
                }
                try {
                    n.Companion companion = n.INSTANCE;
                    int i12 = a.f37903a[pushNotificationImageConfig2.getShape().ordinal()];
                    if (i12 == 1) {
                        objA = gu.b.a(listC.add(new d7.a()));
                    } else if (i12 != 2) {
                        objA = i12 != 3 ? Unit.f21506a : gu.b.a(listC.add(new rk.b(0.0f, 1, null)));
                    } else {
                        objA = gu.b.a(listC.add(new rk.c()));
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
                ImageRequest.a aVarI = i.i(aVarC, p001kotlin.collections.o.a(listC));
                s sVarA = d0.a(context);
                c cVar = new c(sVarA, aVarI, null);
                c0769b.f37904t = pushNotificationImageConfig2;
                c0769b.f37905u = l.a(context);
                c0769b.f37906v = l.a(aVarI);
                c0769b.f37907w = l.a(sVarA);
                c0769b.f37908x = j10;
                c0769b.f37909y = 0;
                c0769b.f37910z = 0;
                c0769b.C = 1;
                objD = g3.d(j10, cVar, c0769b);
                if (objD == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pushNotificationImageConfig2 = (PushNotificationImageConfig) c0769b.f37904t;
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
                    throw new zt.l();
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

    public final void c(@NotNull Context context, @Nullable PushNotificationImageConfig largeIconConfig, @Nullable PushNotificationImageConfig bigPictureConfig, long timeoutMs, @NotNull Function1<? super yj.a, Unit> onComplete) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        av.k.d(scope, null, null, new d(onComplete, largeIconConfig, context, timeoutMs, bigPictureConfig, null), 3, null);
    }
}
