package p384qj;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.roblox.client.pushnotification.p051v2.richpushnotifications.PushNotificationImageConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7697o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.C7800a;
import kotlin.time.C7801b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p043c7.C1551a;
import p151gk.C6124q;
import p223jk.C7202a;
import p223jk.C7203b;
import p223jk.C7204c;
import p229jt.C7345l;
import p229jt.C7347n;
import p229jt.C7348o;
import p230ju.EnumC7361b;
import p239k6.C7458d0;
import p239k6.C7482v;
import p239k6.InterfaceC7479s;
import p256ku.C7864g1;
import p256ku.C7866g3;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.C7948z2;
import p256ku.InterfaceC7906p0;
import p256ku.InterfaceC7934w0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p537x6.C12748i;
import p537x6.ErrorResult;
import p537x6.ImageRequest;
import p537x6.InterfaceC12750k;
import p537x6.SuccessResult;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: qj.b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013*\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001a¨\u0006\u001c"}, m31665d2 = {"Lqj/b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;", "largeIconConfig", "bigPictureConfig", "", "timeoutMs", "Lkotlin/Function1;", "Lqj/a;", "", "onComplete", "c", "(Landroid/content/Context;Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;JLkotlin/jvm/functions/Function1;)V", "Lkotlin/time/a;", "timeout", "Ljt/n;", "Landroid/graphics/Bitmap;", "b", "(Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;Landroid/content/Context;JLnt/b;)Ljava/lang/Object;", "J", "DEFAULT_TIMEOUT", "Lku/p0;", "Lku/p0;", "scope", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C10591b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C10591b f38007a = new C10591b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final long DEFAULT_TIMEOUT;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7906p0 scope;

    /* JADX INFO: renamed from: qj.b$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38010a;

        static {
            int[] iArr = new int[EnumC10592c.values().length];
            try {
                iArr[EnumC10592c.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC10592c.SQUARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC10592c.RECTANGLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f38010a = iArr;
        }
    }

    /* JADX INFO: renamed from: qj.b$b */
    @InterfaceC10344f(m39663c = "com.roblox.client.pushnotification.v2.richpushnotifications.PushNotificationImageFetcher", m39664f = "PushNotificationImageFetcher.kt", m39665l = {101}, m39666m = "load-E0qYoyE", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public /* synthetic */ Object f38011A;

        /* JADX INFO: renamed from: C */
        public int f38013C;

        /* JADX INFO: renamed from: t */
        public Object f38014t;

        /* JADX INFO: renamed from: u */
        public Object f38015u;

        /* JADX INFO: renamed from: v */
        public Object f38016v;

        /* JADX INFO: renamed from: w */
        public Object f38017w;

        /* JADX INFO: renamed from: x */
        public long f38018x;

        /* JADX INFO: renamed from: y */
        public int f38019y;

        /* JADX INFO: renamed from: z */
        public int f38020z;

        public b(InterfaceC9557b<? super b> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f38011A = obj;
            this.f38013C |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object objM40616b = C10591b.this.m40616b(null, null, 0L, this);
            return objM40616b == C10047c.m38805e() ? objM40616b : C7347n.m30459a(objM40616b);
        }
    }

    /* JADX INFO: renamed from: qj.b$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "Lx6/k;", "<anonymous>", "(Lku/p0;)Lx6/k;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.pushnotification.v2.richpushnotifications.PushNotificationImageFetcher$load$3$1$1", m39664f = "PushNotificationImageFetcher.kt", m39665l = {101}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super InterfaceC12750k>, Object> {

        /* JADX INFO: renamed from: t */
        public int f38021t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ InterfaceC7479s f38022u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ ImageRequest.a f38023v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC7479s interfaceC7479s, ImageRequest.a aVar, InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f38022u = interfaceC7479s;
            this.f38023v = aVar;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new c(this.f38022u, this.f38023v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f38021t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return obj;
            }
            C7348o.m30470b(obj);
            InterfaceC7479s interfaceC7479s = this.f38022u;
            ImageRequest imageRequestM47524b = this.f38023v.m47524b();
            this.f38021t = 1;
            Object objMo31068d = interfaceC7479s.mo31068d(imageRequestM47524b, this);
            return objMo31068d == objM38805e ? objM38805e : objMo31068d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super InterfaceC12750k> interfaceC9557b) {
            return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: qj.b$d */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.pushnotification.v2.richpushnotifications.PushNotificationImageFetcher$loadImagesForBigPictureNotification$1", m39664f = "PushNotificationImageFetcher.kt", m39665l = {61, 62}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class d extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: A */
        public final /* synthetic */ PushNotificationImageConfig f38024A;

        /* JADX INFO: renamed from: B */
        public final /* synthetic */ Context f38025B;

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ long f38026C;

        /* JADX INFO: renamed from: D */
        public final /* synthetic */ PushNotificationImageConfig f38027D;

        /* JADX INFO: renamed from: t */
        public Object f38028t;

        /* JADX INFO: renamed from: u */
        public Object f38029u;

        /* JADX INFO: renamed from: v */
        public Object f38030v;

        /* JADX INFO: renamed from: w */
        public Object f38031w;

        /* JADX INFO: renamed from: x */
        public int f38032x;

        /* JADX INFO: renamed from: y */
        public /* synthetic */ Object f38033y;

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ Function1<C10590a, Unit> f38034z;

        /* JADX INFO: renamed from: qj.b$d$a */
        @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lku/p0;", "Ljt/n;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Lku/p0;)Ljt/n;"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.roblox.client.pushnotification.v2.richpushnotifications.PushNotificationImageFetcher$loadImagesForBigPictureNotification$1$bigPicture$1", m39664f = "PushNotificationImageFetcher.kt", m39665l = {58}, m39666m = "invokeSuspend", m39667v = 1)
        public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super C7347n<? extends Bitmap>>, Object> {

            /* JADX INFO: renamed from: t */
            public int f38035t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ PushNotificationImageConfig f38036u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ Context f38037v;

            /* JADX INFO: renamed from: w */
            public final /* synthetic */ long f38038w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PushNotificationImageConfig pushNotificationImageConfig, Context context, long j10, InterfaceC9557b<? super a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f38036u = pushNotificationImageConfig;
                this.f38037v = context;
                this.f38038w = j10;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f38036u, this.f38037v, this.f38038w, interfaceC9557b);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super C7347n<? extends Bitmap>> interfaceC9557b) {
                return invoke2(interfaceC7906p0, (InterfaceC9557b<? super C7347n<Bitmap>>) interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM40616b;
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f38035t;
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    C10591b c10591b = C10591b.f38007a;
                    PushNotificationImageConfig pushNotificationImageConfig = this.f38036u;
                    Context context = this.f38037v;
                    C7800a.Companion companion = C7800a.INSTANCE;
                    long jM32372q = C7801b.m32372q(this.f38038w, EnumC7361b.MILLISECONDS);
                    this.f38035t = 1;
                    objM40616b = c10591b.m40616b(pushNotificationImageConfig, context, jM32372q, this);
                    if (objM40616b == objM38805e) {
                        return objM38805e;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    objM40616b = ((C7347n) obj).getValue();
                }
                return C7347n.m30459a(objM40616b);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super C7347n<Bitmap>> interfaceC9557b) {
                return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX INFO: renamed from: qj.b$d$b */
        @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lku/p0;", "Ljt/n;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Lku/p0;)Ljt/n;"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.roblox.client.pushnotification.v2.richpushnotifications.PushNotificationImageFetcher$loadImagesForBigPictureNotification$1$largeIcon$1", m39664f = "PushNotificationImageFetcher.kt", m39665l = {57}, m39666m = "invokeSuspend", m39667v = 1)
        public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super C7347n<? extends Bitmap>>, Object> {

            /* JADX INFO: renamed from: t */
            public int f38039t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ PushNotificationImageConfig f38040u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ Context f38041v;

            /* JADX INFO: renamed from: w */
            public final /* synthetic */ long f38042w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(PushNotificationImageConfig pushNotificationImageConfig, Context context, long j10, InterfaceC9557b<? super b> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f38040u = pushNotificationImageConfig;
                this.f38041v = context;
                this.f38042w = j10;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new b(this.f38040u, this.f38041v, this.f38042w, interfaceC9557b);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super C7347n<? extends Bitmap>> interfaceC9557b) {
                return invoke2(interfaceC7906p0, (InterfaceC9557b<? super C7347n<Bitmap>>) interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM40616b;
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f38039t;
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    C10591b c10591b = C10591b.f38007a;
                    PushNotificationImageConfig pushNotificationImageConfig = this.f38040u;
                    Context context = this.f38041v;
                    C7800a.Companion companion = C7800a.INSTANCE;
                    long jM32372q = C7801b.m32372q(this.f38042w, EnumC7361b.MILLISECONDS);
                    this.f38039t = 1;
                    objM40616b = c10591b.m40616b(pushNotificationImageConfig, context, jM32372q, this);
                    if (objM40616b == objM38805e) {
                        return objM38805e;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    objM40616b = ((C7347n) obj).getValue();
                }
                return C7347n.m30459a(objM40616b);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super C7347n<Bitmap>> interfaceC9557b) {
                return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super qj.a, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function1<? super C10590a, Unit> function1, PushNotificationImageConfig pushNotificationImageConfig, Context context, long j10, PushNotificationImageConfig pushNotificationImageConfig2, InterfaceC9557b<? super d> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f38034z = function1;
            this.f38024A = pushNotificationImageConfig;
            this.f38025B = context;
            this.f38026C = j10;
            this.f38027D = pushNotificationImageConfig2;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            d dVar = new d(this.f38034z, this.f38024A, this.f38025B, this.f38026C, this.f38027D, interfaceC9557b);
            dVar.f38033y = obj;
            return dVar;
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            InterfaceC7934w0 interfaceC7934w0M32778b;
            InterfaceC7934w0 interfaceC7934w0M32778b2;
            Function1<C10590a, Unit> function1;
            Object objMo32927B;
            Object objMo32927B2;
            Object obj2;
            InterfaceC7906p0 interfaceC7906p0 = (InterfaceC7906p0) this.f38033y;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f38032x;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                interfaceC7934w0M32778b = C7882k.m32778b(interfaceC7906p0, null, null, new b(this.f38024A, this.f38025B, this.f38026C, null), 3, null);
                interfaceC7934w0M32778b2 = C7882k.m32778b(interfaceC7906p0, null, null, new a(this.f38027D, this.f38025B, this.f38026C, null), 3, null);
                function1 = this.f38034z;
                this.f38033y = C10350l.m39676a(interfaceC7906p0);
                this.f38028t = C10350l.m39676a(interfaceC7934w0M32778b);
                this.f38029u = interfaceC7934w0M32778b2;
                this.f38030v = function1;
                this.f38032x = 1;
                objMo32927B = interfaceC7934w0M32778b.mo32927B(this);
                if (objMo32927B != objM38805e) {
                }
                return objM38805e;
            }
            if (i10 == 1) {
                function1 = (Function1) this.f38030v;
                interfaceC7934w0M32778b2 = (InterfaceC7934w0) this.f38029u;
                InterfaceC7934w0 interfaceC7934w0 = (InterfaceC7934w0) this.f38028t;
                C7348o.m30470b(obj);
                interfaceC7934w0M32778b = interfaceC7934w0;
                objMo32927B = obj;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f38031w;
                Function1<C10590a, Unit> function2 = (Function1) this.f38030v;
                C7348o.m30470b(obj);
                function1 = function2;
                objMo32927B2 = obj;
            }
            function1.invoke(new C10590a(obj2, ((C7347n) objMo32927B2).getValue()));
            return Unit.f29331a;
            Object value = ((C7347n) objMo32927B).getValue();
            this.f38033y = C10350l.m39676a(interfaceC7906p0);
            this.f38028t = C10350l.m39676a(interfaceC7934w0M32778b);
            this.f38029u = C10350l.m39676a(interfaceC7934w0M32778b2);
            this.f38030v = function1;
            this.f38031w = value;
            this.f38032x = 2;
            objMo32927B2 = interfaceC7934w0M32778b2.mo32927B(this);
            if (objMo32927B2 != objM38805e) {
                obj2 = value;
                function1.invoke(new C10590a(obj2, ((C7347n) objMo32927B2).getValue()));
                return Unit.f29331a;
            }
            return objM38805e;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((d) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    static {
        C7800a.Companion companion = C7800a.INSTANCE;
        DEFAULT_TIMEOUT = C7801b.m32371p(5, EnumC7361b.SECONDS);
        scope = C7910q0.m32885a(C7864g1.m32644b().plus(C7948z2.m32943b(null, 1, null)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX INFO: renamed from: b */
    public final Object m40616b(PushNotificationImageConfig pushNotificationImageConfig, Context context, long j10, InterfaceC9557b<? super C7347n<Bitmap>> interfaceC9557b) {
        b bVar;
        Object objM30460b;
        Object objM30460b2;
        Object objM30460b3;
        Object objM39658a;
        PushNotificationImageConfig pushNotificationImageConfig2 = pushNotificationImageConfig;
        if (interfaceC9557b instanceof b) {
            bVar = (b) interfaceC9557b;
            int i10 = bVar.f38013C;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                bVar.f38013C = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                bVar = new b(interfaceC9557b);
            }
        } else {
            bVar = new b(interfaceC9557b);
        }
        Object objM32661d = bVar.f38011A;
        Object objM38805e = C10047c.m38805e();
        int i11 = bVar.f38013C;
        try {
            if (i11 == 0) {
                C7348o.m30470b(objM32661d);
                if (pushNotificationImageConfig2 == null) {
                    return C7347n.m30460b(null);
                }
                ImageRequest.a aVarM47525c = new ImageRequest.a(context).m47525c(pushNotificationImageConfig2.getUrl());
                List listM31877c = C7697o.m31877c();
                if (pushNotificationImageConfig2.getAddBackgroundColor()) {
                    listM31877c.add(new C7202a(context, 0, 2, null));
                }
                try {
                    C7347n.Companion companion = C7347n.INSTANCE;
                    int i12 = a.f38010a[pushNotificationImageConfig2.getShape().ordinal()];
                    if (i12 == 1) {
                        objM39658a = C10340b.m39658a(listM31877c.add(new C1551a()));
                    } else if (i12 != 2) {
                        objM39658a = i12 != 3 ? Unit.f29331a : C10340b.m39658a(listM31877c.add(new C7203b(0.0f, 1, null)));
                    } else {
                        objM39658a = C10340b.m39658a(listM31877c.add(new C7204c()));
                    }
                    objM30460b3 = C7347n.m30460b(objM39658a);
                } catch (Throwable th2) {
                    C7347n.Companion companion2 = C7347n.INSTANCE;
                    objM30460b3 = C7347n.m30460b(C7348o.m30469a(th2));
                }
                Throwable thM30463e = C7347n.m30463e(objM30460b3);
                if (thM30463e != null) {
                    C6124q.m27061f("PushNotificationImageFetcher", "Error occurred while getting image shape.", thM30463e);
                }
                ImageRequest.a aVarM47581i = C12748i.m47581i(aVarM47525c, C7697o.m31875a(listM31877c));
                InterfaceC7479s interfaceC7479sM30978a = C7458d0.m30978a(context);
                c cVar = new c(interfaceC7479sM30978a, aVarM47581i, null);
                bVar.f38014t = pushNotificationImageConfig2;
                bVar.f38015u = C10350l.m39676a(context);
                bVar.f38016v = C10350l.m39676a(aVarM47581i);
                bVar.f38017w = C10350l.m39676a(interfaceC7479sM30978a);
                bVar.f38018x = j10;
                bVar.f38019y = 0;
                bVar.f38020z = 0;
                bVar.f38013C = 1;
                objM32661d = C7866g3.m32661d(j10, cVar, bVar);
                if (objM32661d == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pushNotificationImageConfig2 = (PushNotificationImageConfig) bVar.f38014t;
                C7348o.m30470b(objM32661d);
            }
            objM30460b = C7347n.m30460b((InterfaceC12750k) objM32661d);
        } catch (Throwable th3) {
            C7347n.Companion companion3 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th3));
        }
        if (C7347n.m30466h(objM30460b)) {
            try {
                InterfaceC12750k interfaceC12750k = (InterfaceC12750k) objM30460b;
                if (!(interfaceC12750k instanceof SuccessResult)) {
                    if (interfaceC12750k instanceof ErrorResult) {
                        throw ((ErrorResult) interfaceC12750k).getThrowable();
                    }
                    throw new C7345l();
                }
                objM30460b2 = C7347n.m30460b(C7482v.m31092g(((SuccessResult) interfaceC12750k).getImage(), 0, 0, 3, null));
            } catch (Throwable th4) {
                C7347n.Companion companion4 = C7347n.INSTANCE;
                objM30460b = C7348o.m30469a(th4);
                objM30460b2 = C7347n.m30460b(objM30460b);
            }
        } else {
            objM30460b2 = C7347n.m30460b(objM30460b);
        }
        Throwable thM30463e2 = C7347n.m30463e(objM30460b2);
        if (thM30463e2 != null) {
            C6124q.m27061f("PushNotificationImageFetcher", "Error loading image. " + pushNotificationImageConfig2, thM30463e2);
        }
        return objM30460b2;
    }

    /* JADX INFO: renamed from: c */
    public final void m40617c(@NotNull Context context, @Nullable PushNotificationImageConfig largeIconConfig, @Nullable PushNotificationImageConfig bigPictureConfig, long timeoutMs, @NotNull Function1<? super C10590a, Unit> onComplete) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        C7882k.m32780d(scope, null, null, new d(onComplete, largeIconConfig, context, timeoutMs, bigPictureConfig, null), 3, null);
    }
}
