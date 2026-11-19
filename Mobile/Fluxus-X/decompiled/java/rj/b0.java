package rj;

import android.content.Context;
import android.graphics.Bitmap;
import av.g1;
import av.p0;
import av.q0;
import av.z2;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.roblox.platform.http.interfaces.ThumbnailsInterface;
import java.util.List;
import java.util.function.Consumer;
import l6.d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.coroutines.CoroutineContext;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import y6.ImageRequest;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ\"\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000f¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000f¢\u0006\u0004\b\u0014\u0010\u0015R(\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0012\u0010\u0017\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lrj/b0;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "url", "Landroid/graphics/Bitmap;", "a", "(Landroid/content/Context;Ljava/lang/String;Leu/b;)Ljava/lang/Object;", BuildConfig.FLAVOR, "userId", "d", "(Landroid/content/Context;JLeu/b;)Ljava/lang/Object;", "Ljava/util/function/Consumer;", "callback", BuildConfig.FLAVOR, "b", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/function/Consumer;)V", "c", "(Landroid/content/Context;JLjava/util/function/Consumer;)V", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "setCoroutineContext", "(Lkotlin/coroutines/CoroutineContext;)V", "getCoroutineContext$annotations", "coroutineContext", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b0 f30739a = new b0();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static CoroutineContext coroutineContext = g1.b().plus(z2.b(null, 1, null));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Lav/p0;)Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.pushnotification.ThumbnailFetcher$fetchThumbnail$3$1", f = "ThumbnailFetcher.kt", l = {43}, m = "invokeSuspend", v = 1)
    public static final class a extends gu.m implements Function2<p0, eu.b<? super Bitmap>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f30740t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ l6.s f30741u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ ImageRequest f30742v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l6.s sVar, ImageRequest imageRequest, eu.b<? super a> bVar) {
            super(2, bVar);
            this.f30741u = sVar;
            this.f30742v = imageRequest;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new a(this.f30741u, this.f30742v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Bitmap> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f30740t;
            if (i10 == 0) {
                zt.o.b(obj);
                l6.s sVar = this.f30741u;
                ImageRequest imageRequest = this.f30742v;
                this.f30740t = 1;
                obj = sVar.a(imageRequest, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            l6.n image = ((y6.k) obj).getImage();
            if (image != null) {
                return l6.v.g(image, 0, 0, 3, null);
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.pushnotification.ThumbnailFetcher$fetchThumbnailWithCallback$1", f = "ThumbnailFetcher.kt", l = {97}, m = "invokeSuspend", v = 1)
    public static final class b extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f30743t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f30744u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Consumer<Bitmap> f30745v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Context f30746w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f30747x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Consumer<Bitmap> consumer, Context context, String str, eu.b<? super b> bVar) {
            super(2, bVar);
            this.f30745v = consumer;
            this.f30746w = context;
            this.f30747x = str;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new b(this.f30745v, this.f30746w, this.f30747x, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Consumer consumer;
            Object objE = fu.c.e();
            int i10 = this.f30744u;
            if (i10 == 0) {
                zt.o.b(obj);
                Consumer<Bitmap> consumer2 = this.f30745v;
                b0 b0Var = b0.f30739a;
                Context context = this.f30746w;
                String str = this.f30747x;
                this.f30743t = consumer2;
                this.f30744u = 1;
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
                consumer = (Consumer) this.f30743t;
                zt.o.b(obj);
            }
            consumer.accept(obj);
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.pushnotification.ThumbnailFetcher$fetchUserThumbnailWithCallback$1", f = "ThumbnailFetcher.kt", l = {116}, m = "invokeSuspend", v = 1)
    public static final class c extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f30748t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f30749u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Consumer<Bitmap> f30750v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Context f30751w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ long f30752x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Consumer<Bitmap> consumer, Context context, long j10, eu.b<? super c> bVar) {
            super(2, bVar);
            this.f30750v = consumer;
            this.f30751w = context;
            this.f30752x = j10;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new c(this.f30750v, this.f30751w, this.f30752x, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Consumer consumer;
            Object objE = fu.c.e();
            int i10 = this.f30749u;
            if (i10 == 0) {
                zt.o.b(obj);
                Consumer<Bitmap> consumer2 = this.f30750v;
                b0 b0Var = b0.f30739a;
                Context context = this.f30751w;
                long j10 = this.f30752x;
                this.f30748t = consumer2;
                this.f30749u = 1;
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
                consumer = (Consumer) this.f30748t;
                zt.o.b(obj);
            }
            consumer.accept(obj);
            return Unit.f21506a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.client.pushnotification.ThumbnailFetcher", f = "ThumbnailFetcher.kt", l = {Barcode.FORMAT_EAN_8, 80}, m = "loadUserThumbnail", v = 1)
    public static final class d extends gu.d {
        public int A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f30753t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f30754u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f30755v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public long f30756w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f30757x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f30758y;

        public d(eu.b<? super d> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30758y = obj;
            this.A |= Integer.MIN_VALUE;
            return b0.this.d(null, 0L, this);
        }
    }

    @Nullable
    public final Object a(@NotNull Context context, @Nullable String str, @NotNull eu.b<? super Bitmap> bVar) {
        if (str == null || str.length() == 0) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        Object objG = av.i.g(coroutineContext, new a(d0.a(context), y6.i.j(new ImageRequest.a(context).c(str), new d7.a()).b(), null), bVar);
        return objG == fu.c.e() ? objG : (Bitmap) objG;
    }

    public final void b(@NotNull Context context, @Nullable String url, @NotNull Consumer<Bitmap> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        av.k.d(q0.a(coroutineContext), null, null, new b(callback, context, url, null), 3, null);
    }

    public final void c(@NotNull Context context, long userId, @NotNull Consumer<Bitmap> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        av.k.d(q0.a(coroutineContext), null, null, new c(callback, context, userId, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0119 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    @Nullable
    public final Object d(@NotNull Context context, long j10, @NotNull eu.b<? super Bitmap> bVar) {
        d dVar;
        String str;
        Context context2;
        String str2;
        Object objB;
        Object objA;
        ql.a aVar;
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
        Object avatarHeadshot = dVar2.f30758y;
        Object objE = fu.c.e();
        int i11 = dVar2.A;
        String str3 = null;
        if (i11 == 0) {
            zt.o.b(avatarHeadshot);
            String strF = u.c().f(j11);
            str = !(strF == null || strF.length() == 0) ? strF : null;
            if (str == null) {
                try {
                    zt.n.Companion companion = zt.n.INSTANCE;
                    ThumbnailsInterface thumbnailsInterfaceF = cl.g.d().f();
                    String strValueOf = String.valueOf(j11);
                    dVar2.f30753t = context;
                    dVar2.f30754u = gu.l.a(str);
                    dVar2.f30755v = gu.l.a(this);
                    dVar2.f30756w = j11;
                    dVar2.f30757x = 0;
                    dVar2.A = 1;
                    avatarHeadshot = thumbnailsInterfaceF.getAvatarHeadshot(strValueOf, ThumbnailsInterface.HEADSHOT_SIZE_150X150, ThumbnailsInterface.FORMAT_PNG, false, dVar2);
                    if (avatarHeadshot != objE) {
                        context2 = context;
                        str2 = str;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    context2 = context;
                    str2 = str;
                    zt.n.Companion companion2 = zt.n.INSTANCE;
                    objB = zt.n.b(zt.o.a(th));
                }
            } else {
                context2 = context;
                str3 = str;
                dVar2.f30753t = gu.l.a(context2);
                dVar2.f30754u = gu.l.a(str);
                dVar2.f30755v = gu.l.a(str3);
                dVar2.f30756w = j11;
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
            zt.o.b(avatarHeadshot);
            return avatarHeadshot;
        }
        j11 = dVar2.f30756w;
        str2 = (String) dVar2.f30754u;
        context2 = (Context) dVar2.f30753t;
        try {
            zt.o.b(avatarHeadshot);
        } catch (Throwable th3) {
            th = th3;
            zt.n.Companion companion3 = zt.n.INSTANCE;
            objB = zt.n.b(zt.o.a(th));
        }
        List<ql.a> list = ((ql.b) avatarHeadshot).data;
        String str4 = (list == null || (aVar = (ql.a) CollectionsKt.firstOrNull(list)) == null) ? null : aVar.imageUrl;
        if (str4 == null || str4.length() == 0) {
            str4 = null;
        }
        objB = zt.n.b(str4);
        str = str2;
        if (zt.n.g(objB)) {
            objB = null;
        }
        String str5 = (String) objB;
        if (str5 != null) {
            u.c().h(j11, str5);
            str3 = str5;
        }
        dVar2.f30753t = gu.l.a(context2);
        dVar2.f30754u = gu.l.a(str);
        dVar2.f30755v = gu.l.a(str3);
        dVar2.f30756w = j11;
        dVar2.A = 2;
        objA = a(context2, str3, dVar2);
        if (objA != objE) {
            return objE;
        }
        return objA;
    }
}
