package jj;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.List;
import java.util.function.Consumer;
import k6.d0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.g1;
import ku.p0;
import ku.q0;
import ku.z2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x6.ImageRequest;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ\"\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000f¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000f¢\u0006\u0004\b\u0014\u0010\u0015R(\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0012\u0010\u0017\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Ljj/b0;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "url", "Landroid/graphics/Bitmap;", "a", "(Landroid/content/Context;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "", "userId", "d", "(Landroid/content/Context;JLnt/b;)Ljava/lang/Object;", "Ljava/util/function/Consumer;", "callback", "", "b", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/function/Consumer;)V", "c", "(Landroid/content/Context;JLjava/util/function/Consumer;)V", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "setCoroutineContext", "(Lkotlin/coroutines/CoroutineContext;)V", "getCoroutineContext$annotations", "coroutineContext", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b0 f21480a = new b0();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static CoroutineContext coroutineContext = g1.b().plus(z2.b(null, 1, null));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Lku/p0;)Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.pushnotification.ThumbnailFetcher$fetchThumbnail$3$1", f = "ThumbnailFetcher.kt", l = {43}, m = "invokeSuspend", v = 1)
    public static final class a extends pt.m implements Function2<p0, nt.b<? super Bitmap>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f21481t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ k6.s f21482u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ ImageRequest f21483v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k6.s sVar, ImageRequest imageRequest, nt.b<? super a> bVar) {
            super(2, bVar);
            this.f21482u = sVar;
            this.f21483v = imageRequest;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new a(this.f21482u, this.f21483v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f21481t;
            if (i10 == 0) {
                jt.o.b(obj);
                k6.s sVar = this.f21482u;
                ImageRequest imageRequest = this.f21483v;
                this.f21481t = 1;
                obj = sVar.d(imageRequest, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
            }
            k6.n image = ((x6.k) obj).getImage();
            if (image != null) {
                return k6.v.g(image, 0, 0, 3, null);
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Bitmap> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.pushnotification.ThumbnailFetcher$fetchThumbnailWithCallback$1", f = "ThumbnailFetcher.kt", l = {97}, m = "invokeSuspend", v = 1)
    public static final class b extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f21484t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f21485u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Consumer<Bitmap> f21486v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Context f21487w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f21488x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Consumer<Bitmap> consumer, Context context, String str, nt.b<? super b> bVar) {
            super(2, bVar);
            this.f21486v = consumer;
            this.f21487w = context;
            this.f21488x = str;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new b(this.f21486v, this.f21487w, this.f21488x, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Consumer consumer;
            Object objE = ot.c.e();
            int i10 = this.f21485u;
            if (i10 == 0) {
                jt.o.b(obj);
                Consumer<Bitmap> consumer2 = this.f21486v;
                b0 b0Var = b0.f21480a;
                Context context = this.f21487w;
                String str = this.f21488x;
                this.f21484t = consumer2;
                this.f21485u = 1;
                Object objA = b0Var.a(context, str, this);
                if (objA == objE) {
                    return objE;
                }
                consumer = consumer2;
                obj = objA;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                consumer = (Consumer) this.f21484t;
                jt.o.b(obj);
            }
            consumer.accept(obj);
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.pushnotification.ThumbnailFetcher$fetchUserThumbnailWithCallback$1", f = "ThumbnailFetcher.kt", l = {116}, m = "invokeSuspend", v = 1)
    public static final class c extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f21489t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f21490u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Consumer<Bitmap> f21491v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Context f21492w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ long f21493x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Consumer<Bitmap> consumer, Context context, long j10, nt.b<? super c> bVar) {
            super(2, bVar);
            this.f21491v = consumer;
            this.f21492w = context;
            this.f21493x = j10;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new c(this.f21491v, this.f21492w, this.f21493x, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Consumer consumer;
            Object objE = ot.c.e();
            int i10 = this.f21490u;
            if (i10 == 0) {
                jt.o.b(obj);
                Consumer<Bitmap> consumer2 = this.f21491v;
                b0 b0Var = b0.f21480a;
                Context context = this.f21492w;
                long j10 = this.f21493x;
                this.f21489t = consumer2;
                this.f21490u = 1;
                Object objD = b0Var.d(context, j10, this);
                if (objD == objE) {
                    return objE;
                }
                consumer = consumer2;
                obj = objD;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                consumer = (Consumer) this.f21489t;
                jt.o.b(obj);
            }
            consumer.accept(obj);
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @pt.f(c = "com.roblox.client.pushnotification.ThumbnailFetcher", f = "ThumbnailFetcher.kt", l = {64, 80}, m = "loadUserThumbnail", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class d extends pt.d {
        public int A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f21494t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f21495u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f21496v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public long f21497w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f21498x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f21499y;

        public d(nt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f21499y = obj;
            this.A |= Integer.MIN_VALUE;
            return b0.this.d(null, 0L, this);
        }
    }

    @Nullable
    public final Object a(@NotNull Context context, @Nullable String str, @NotNull nt.b<? super Bitmap> bVar) {
        if (str == null || str.length() == 0) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        Object objG = ku.i.g(coroutineContext, new a(d0.a(context), x6.i.j(new ImageRequest.a(context).c(str), new c7.a()).b(), null), bVar);
        return objG == ot.c.e() ? objG : (Bitmap) objG;
    }

    public final void b(@NotNull Context context, @Nullable String url, @NotNull Consumer<Bitmap> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ku.k.d(q0.a(coroutineContext), null, null, new b(callback, context, url, null), 3, null);
    }

    public final void c(@NotNull Context context, long userId, @NotNull Consumer<Bitmap> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ku.k.d(q0.a(coroutineContext), null, null, new c(callback, context, userId, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0119 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    @Nullable
    public final Object d(@NotNull Context context, long j10, @NotNull nt.b<? super Bitmap> bVar) {
        d dVar;
        String str;
        Context context2;
        String str2;
        Object objB;
        Object objA;
        dl.a aVar;
        long j11 = j10;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i10 = dVar.A;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.A = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(bVar);
            }
        } else {
            dVar = new d(bVar);
        }
        d dVar2 = dVar;
        Object objA2 = dVar2.f21499y;
        Object objE = ot.c.e();
        int i11 = dVar2.A;
        String str3 = null;
        if (i11 == 0) {
            jt.o.b(objA2);
            String strF = u.c().f(j11);
            str = !(strF == null || strF.length() == 0) ? strF : null;
            if (str == null) {
                try {
                    jt.n.Companion companion = jt.n.INSTANCE;
                    zk.m mVarE = vk.g.d().e();
                    String strValueOf = String.valueOf(j11);
                    dVar2.f21494t = context;
                    dVar2.f21495u = pt.l.a(str);
                    dVar2.f21496v = pt.l.a(this);
                    dVar2.f21497w = j11;
                    dVar2.f21498x = 0;
                    dVar2.A = 1;
                    objA2 = mVarE.a(strValueOf, "150x150", "Png", false, dVar2);
                    if (objA2 != objE) {
                        context2 = context;
                        str2 = str;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    context2 = context;
                    str2 = str;
                    jt.n.Companion companion2 = jt.n.INSTANCE;
                    objB = jt.n.b(jt.o.a(th));
                }
            } else {
                context2 = context;
                str3 = str;
                dVar2.f21494t = pt.l.a(context2);
                dVar2.f21495u = pt.l.a(str);
                dVar2.f21496v = pt.l.a(str3);
                dVar2.f21497w = j11;
                dVar2.A = 2;
                objA = a(context2, str3, dVar2);
                if (objA != objE) {
                    return objA;
                }
            }
            return objE;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(objA2);
            return objA2;
        }
        j11 = dVar2.f21497w;
        str2 = (String) dVar2.f21495u;
        context2 = (Context) dVar2.f21494t;
        try {
            jt.o.b(objA2);
        } catch (Throwable th3) {
            th = th3;
            jt.n.Companion companion3 = jt.n.INSTANCE;
            objB = jt.n.b(jt.o.a(th));
        }
        List<dl.a> list = ((dl.b) objA2).data;
        String str4 = (list == null || (aVar = (dl.a) CollectionsKt.firstOrNull(list)) == null) ? null : aVar.imageUrl;
        if (str4 == null || str4.length() == 0) {
            str4 = null;
        }
        objB = jt.n.b(str4);
        str = str2;
        if (jt.n.g(objB)) {
            objB = null;
        }
        String str5 = (String) objB;
        if (str5 != null) {
            u.c().h(j11, str5);
            str3 = str5;
        }
        dVar2.f21494t = pt.l.a(context2);
        dVar2.f21495u = pt.l.a(str);
        dVar2.f21496v = pt.l.a(str3);
        dVar2.f21497w = j11;
        dVar2.A = 2;
        objA = a(context2, str3, dVar2);
        if (objA != objE) {
            return objE;
        }
        return objA;
    }
}
