package p222jj;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.List;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p043c7.C1551a;
import p080dl.C4640a;
import p080dl.C4641b;
import p229jt.C7347n;
import p229jt.C7348o;
import p239k6.C7458d0;
import p239k6.C7482v;
import p239k6.InterfaceC7474n;
import p239k6.InterfaceC7479s;
import p256ku.C7864g1;
import p256ku.C7872i;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.C7948z2;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p493vk.C12225g;
import p537x6.C12748i;
import p537x6.ImageRequest;
import p537x6.InterfaceC12750k;
import p607zk.InterfaceC13833m;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: jj.b0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ\"\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000f¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000f¢\u0006\u0004\b\u0014\u0010\u0015R(\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0012\u0010\u0017\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m31665d2 = {"Ljj/b0;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "url", "Landroid/graphics/Bitmap;", "a", "(Landroid/content/Context;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "", "userId", "d", "(Landroid/content/Context;JLnt/b;)Ljava/lang/Object;", "Ljava/util/function/Consumer;", "callback", "", "b", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/function/Consumer;)V", "c", "(Landroid/content/Context;JLjava/util/function/Consumer;)V", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "setCoroutineContext", "(Lkotlin/coroutines/CoroutineContext;)V", "getCoroutineContext$annotations", "coroutineContext", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7177b0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C7177b0 f27845a = new C7177b0();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static CoroutineContext coroutineContext = C7864g1.m32644b().plus(C7948z2.m32943b(null, 1, null));

    /* JADX INFO: renamed from: jj.b0$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Lku/p0;)Landroid/graphics/Bitmap;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.pushnotification.ThumbnailFetcher$fetchThumbnail$3$1", m39664f = "ThumbnailFetcher.kt", m39665l = {43}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Bitmap>, Object> {

        /* JADX INFO: renamed from: t */
        public int f27847t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ InterfaceC7479s f27848u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ ImageRequest f27849v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC7479s interfaceC7479s, ImageRequest imageRequest, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f27848u = interfaceC7479s;
            this.f27849v = imageRequest;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new a(this.f27848u, this.f27849v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f27847t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC7479s interfaceC7479s = this.f27848u;
                ImageRequest imageRequest = this.f27849v;
                this.f27847t = 1;
                obj = interfaceC7479s.mo31068d(imageRequest, this);
                if (obj == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            InterfaceC7474n image = ((InterfaceC12750k) obj).getImage();
            if (image != null) {
                return C7482v.m31092g(image, 0, 0, 3, null);
            }
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Bitmap> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: jj.b0$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.pushnotification.ThumbnailFetcher$fetchThumbnailWithCallback$1", m39664f = "ThumbnailFetcher.kt", m39665l = {97}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f27850t;

        /* JADX INFO: renamed from: u */
        public int f27851u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ Consumer<Bitmap> f27852v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ Context f27853w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ String f27854x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Consumer<Bitmap> consumer, Context context, String str, InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f27852v = consumer;
            this.f27853w = context;
            this.f27854x = str;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new b(this.f27852v, this.f27853w, this.f27854x, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Consumer consumer;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f27851u;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                Consumer<Bitmap> consumer2 = this.f27852v;
                C7177b0 c7177b0 = C7177b0.f27845a;
                Context context = this.f27853w;
                String str = this.f27854x;
                this.f27850t = consumer2;
                this.f27851u = 1;
                Object objM30000a = c7177b0.m30000a(context, str, this);
                if (objM30000a == objM38805e) {
                    return objM38805e;
                }
                consumer = consumer2;
                obj = objM30000a;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                consumer = (Consumer) this.f27850t;
                C7348o.m30470b(obj);
            }
            consumer.accept(obj);
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: jj.b0$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.pushnotification.ThumbnailFetcher$fetchUserThumbnailWithCallback$1", m39664f = "ThumbnailFetcher.kt", m39665l = {116}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f27855t;

        /* JADX INFO: renamed from: u */
        public int f27856u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ Consumer<Bitmap> f27857v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ Context f27858w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ long f27859x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Consumer<Bitmap> consumer, Context context, long j10, InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f27857v = consumer;
            this.f27858w = context;
            this.f27859x = j10;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new c(this.f27857v, this.f27858w, this.f27859x, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Consumer consumer;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f27856u;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                Consumer<Bitmap> consumer2 = this.f27857v;
                C7177b0 c7177b0 = C7177b0.f27845a;
                Context context = this.f27858w;
                long j10 = this.f27859x;
                this.f27855t = consumer2;
                this.f27856u = 1;
                Object objM30003d = c7177b0.m30003d(context, j10, this);
                if (objM30003d == objM38805e) {
                    return objM38805e;
                }
                consumer = consumer2;
                obj = objM30003d;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                consumer = (Consumer) this.f27855t;
                C7348o.m30470b(obj);
            }
            consumer.accept(obj);
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: jj.b0$d */
    @InterfaceC10344f(m39663c = "com.roblox.client.pushnotification.ThumbnailFetcher", m39664f = "ThumbnailFetcher.kt", m39665l = {64, 80}, m39666m = "loadUserThumbnail", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class d extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public int f27860A;

        /* JADX INFO: renamed from: t */
        public Object f27861t;

        /* JADX INFO: renamed from: u */
        public Object f27862u;

        /* JADX INFO: renamed from: v */
        public Object f27863v;

        /* JADX INFO: renamed from: w */
        public long f27864w;

        /* JADX INFO: renamed from: x */
        public int f27865x;

        /* JADX INFO: renamed from: y */
        public /* synthetic */ Object f27866y;

        public d(InterfaceC9557b<? super d> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f27866y = obj;
            this.f27860A |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C7177b0.this.m30003d(null, 0L, this);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Object m30000a(@NotNull Context context, @Nullable String str, @NotNull InterfaceC9557b<? super Bitmap> interfaceC9557b) {
        if (str == null || str.length() == 0) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        Object objM32684g = C7872i.m32684g(coroutineContext, new a(C7458d0.m30978a(context), C12748i.m47582j(new ImageRequest.a(context).m47525c(str), new C1551a()).m47524b(), null), interfaceC9557b);
        return objM32684g == C10047c.m38805e() ? objM32684g : (Bitmap) objM32684g;
    }

    /* JADX INFO: renamed from: b */
    public final void m30001b(@NotNull Context context, @Nullable String url, @NotNull Consumer<Bitmap> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C7882k.m32780d(C7910q0.m32885a(coroutineContext), null, null, new b(callback, context, url, null), 3, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m30002c(@NotNull Context context, long userId, @NotNull Consumer<Bitmap> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C7882k.m32780d(C7910q0.m32885a(coroutineContext), null, null, new c(callback, context, userId, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0119 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    @Nullable
    /* JADX INFO: renamed from: d */
    public final Object m30003d(@NotNull Context context, long j10, @NotNull InterfaceC9557b<? super Bitmap> interfaceC9557b) {
        d dVar;
        String str;
        Context context2;
        String str2;
        Object objM30460b;
        Object objM30000a;
        C4640a c4640a;
        long j11 = j10;
        if (interfaceC9557b instanceof d) {
            dVar = (d) interfaceC9557b;
            int i10 = dVar.f27860A;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                dVar.f27860A = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                dVar = new d(interfaceC9557b);
            }
        } else {
            dVar = new d(interfaceC9557b);
        }
        d dVar2 = dVar;
        Object objM50329a = dVar2.f27866y;
        Object objM38805e = C10047c.m38805e();
        int i11 = dVar2.f27860A;
        String str3 = null;
        if (i11 == 0) {
            C7348o.m30470b(objM50329a);
            String strM30113f = C7196u.m30108c().m30113f(j11);
            str = !(strM30113f == null || strM30113f.length() == 0) ? strM30113f : null;
            if (str == null) {
                try {
                    C7347n.Companion companion = C7347n.INSTANCE;
                    InterfaceC13833m interfaceC13833mMo45319e = C12225g.m45326d().mo45319e();
                    String strValueOf = String.valueOf(j11);
                    dVar2.f27861t = context;
                    dVar2.f27862u = C10350l.m39676a(str);
                    dVar2.f27863v = C10350l.m39676a(this);
                    dVar2.f27864w = j11;
                    dVar2.f27865x = 0;
                    dVar2.f27860A = 1;
                    objM50329a = interfaceC13833mMo45319e.m50329a(strValueOf, "150x150", "Png", false, dVar2);
                    if (objM50329a != objM38805e) {
                        context2 = context;
                        str2 = str;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    context2 = context;
                    str2 = str;
                    C7347n.Companion companion2 = C7347n.INSTANCE;
                    objM30460b = C7347n.m30460b(C7348o.m30469a(th));
                }
            } else {
                context2 = context;
                str3 = str;
                dVar2.f27861t = C10350l.m39676a(context2);
                dVar2.f27862u = C10350l.m39676a(str);
                dVar2.f27863v = C10350l.m39676a(str3);
                dVar2.f27864w = j11;
                dVar2.f27860A = 2;
                objM30000a = m30000a(context2, str3, dVar2);
                if (objM30000a != objM38805e) {
                    return objM30000a;
                }
            }
            return objM38805e;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(objM50329a);
            return objM50329a;
        }
        j11 = dVar2.f27864w;
        str2 = (String) dVar2.f27862u;
        context2 = (Context) dVar2.f27861t;
        try {
            C7348o.m30470b(objM50329a);
        } catch (Throwable th3) {
            th = th3;
            C7347n.Companion companion3 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th));
        }
        List<C4640a> list = ((C4641b) objM50329a).data;
        String str4 = (list == null || (c4640a = (C4640a) CollectionsKt.firstOrNull(list)) == null) ? null : c4640a.imageUrl;
        if (str4 == null || str4.length() == 0) {
            str4 = null;
        }
        objM30460b = C7347n.m30460b(str4);
        str = str2;
        if (C7347n.m30465g(objM30460b)) {
            objM30460b = null;
        }
        String str5 = (String) objM30460b;
        if (str5 != null) {
            C7196u.m30108c().m30115h(j11, str5);
            str3 = str5;
        }
        dVar2.f27861t = C10350l.m39676a(context2);
        dVar2.f27862u = C10350l.m39676a(str);
        dVar2.f27863v = C10350l.m39676a(str3);
        dVar2.f27864w = j11;
        dVar2.f27860A = 2;
        objM30000a = m30000a(context2, str3, dVar2);
        if (objM30000a != objM38805e) {
            return objM38805e;
        }
        return objM30000a;
    }
}
