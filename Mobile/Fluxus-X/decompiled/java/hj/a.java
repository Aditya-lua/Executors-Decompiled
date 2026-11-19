package hj;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;
import av.i;
import av.l0;
import av.p0;
import com.github.luben.zstd.BuildConfig;
import com.roblox.platform.http.returntypes.ossearch.SearchIndexItem;
import gu.f;
import gu.l;
import gu.m;
import java.util.List;
import ok.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import rj.b0;
import zt.o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\n\u001a,\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;", "Landroid/graphics/Bitmap;", "thumbnail", "Landroid/content/Context;", "context", "Lm2/c;", "d", "(Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;Landroid/graphics/Bitmap;Landroid/content/Context;)Lm2/c;", "Landroidx/core/graphics/drawable/IconCompat;", "b", "(Landroid/content/Context;)Landroidx/core/graphics/drawable/IconCompat;", "Lcom/roblox/client/ossearch/c;", "cache", "Lav/l0;", "ioDispatcher", "Lhj/e;", "c", "(Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;Lcom/roblox/client/ossearch/c;Lav/l0;Landroid/content/Context;Leu/b;)Ljava/lang/Object;", BuildConfig.FLAVOR, "a", "(Landroid/content/Context;)I", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: hj.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @f(c = "com.roblox.client.ossearch.OSSearchUtilKt", f = "OSSearchUtil.kt", l = {59, 61, 62}, m = "getThumbnail", v = 1)
    public static final class C0348a extends gu.d {
        public int A;
        public /* synthetic */ Object B;
        public int C;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f18259t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f18260u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f18261v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f18262w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f18263x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f18264y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f18265z;

        public C0348a(eu.b<? super C0348a> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.B = obj;
            this.C |= Integer.MIN_VALUE;
            return a.c(null, null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Lav/p0;)Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.ossearch.OSSearchUtilKt$getThumbnail$cached$1", f = "OSSearchUtil.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends m implements Function2<p0, eu.b<? super Bitmap>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f18266t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.roblox.client.ossearch.c f18267u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ SearchIndexItem f18268v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.roblox.client.ossearch.c cVar, SearchIndexItem searchIndexItem, eu.b<? super b> bVar) {
            super(2, bVar);
            this.f18267u = cVar;
            this.f18268v = searchIndexItem;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new b(this.f18267u, this.f18268v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Bitmap> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f18266t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            return this.f18267u.i(this.f18268v.getThumbnailCacheKey());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.ossearch.OSSearchUtilKt$getThumbnail$fetched$1$1", f = "OSSearchUtil.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f18269t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.roblox.client.ossearch.c f18270u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ SearchIndexItem f18271v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Bitmap f18272w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.roblox.client.ossearch.c cVar, SearchIndexItem searchIndexItem, Bitmap bitmap, eu.b<? super c> bVar) {
            super(2, bVar);
            this.f18270u = cVar;
            this.f18271v = searchIndexItem;
            this.f18272w = bitmap;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new c(this.f18270u, this.f18271v, this.f18272w, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f18269t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            this.f18270u.k(this.f18271v.getThumbnailCacheKey(), this.f18272w);
            return Unit.f21506a;
        }
    }

    public static final int a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int iB = m2.e.b(context);
        List<m2.c> listF = m2.e.f(context, 1);
        Intrinsics.checkNotNullExpressionValue(listF, "getShortcuts(...)");
        return iB - listF.size();
    }

    public static final IconCompat b(Context context) {
        IconCompat iconCompatD = IconCompat.d(context, bh.p0.f4218a);
        Intrinsics.checkNotNullExpressionValue(iconCompatD, "createWithResource(...)");
        return iconCompatD;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:34:0x010c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object c(@NotNull SearchIndexItem searchIndexItem, @NotNull com.roblox.client.ossearch.c cVar, @NotNull l0 l0Var, @NotNull Context context, @NotNull eu.b<? super ThumbnailResult> bVar) {
        C0348a c0348a;
        SearchIndexItem searchIndexItem2;
        Bitmap bitmap;
        com.roblox.client.ossearch.c cVar2;
        Context context2;
        Bitmap bitmap2;
        c cVar3;
        if (bVar instanceof C0348a) {
            c0348a = (C0348a) bVar;
            int i10 = c0348a.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0348a.C = i10 - Integer.MIN_VALUE;
            } else {
                c0348a = new C0348a(bVar);
            }
        } else {
            c0348a = new C0348a(bVar);
        }
        Object objG = c0348a.B;
        Object objE = fu.c.e();
        int i11 = c0348a.C;
        Bitmap bitmap3 = null;
        if (i11 == 0) {
            o.b(objG);
            b bVar2 = new b(cVar, searchIndexItem, null);
            c0348a.f18259t = searchIndexItem;
            c0348a.f18260u = cVar;
            c0348a.f18261v = l0Var;
            c0348a.f18262w = context;
            c0348a.C = 1;
            objG = i.g(l0Var, bVar2, c0348a);
            if (objG != objE) {
            }
            return objE;
        }
        if (i11 == 1) {
            context = (Context) c0348a.f18262w;
            l0Var = (l0) c0348a.f18261v;
            cVar = (com.roblox.client.ossearch.c) c0348a.f18260u;
            searchIndexItem = (SearchIndexItem) c0348a.f18259t;
            o.b(objG);
        } else if (i11 == 2) {
            bitmap = (Bitmap) c0348a.f18263x;
            context2 = (Context) c0348a.f18262w;
            l0Var = (l0) c0348a.f18261v;
            cVar2 = (com.roblox.client.ossearch.c) c0348a.f18260u;
            searchIndexItem2 = (SearchIndexItem) c0348a.f18259t;
            o.b(objG);
            bitmap2 = (Bitmap) objG;
            if (bitmap2 != null) {
                cVar3 = new c(cVar2, searchIndexItem2, bitmap2, null);
                c0348a.f18259t = l.a(searchIndexItem2);
                c0348a.f18260u = l.a(cVar2);
                c0348a.f18261v = l.a(l0Var);
                c0348a.f18262w = l.a(context2);
                c0348a.f18263x = l.a(bitmap);
                c0348a.f18264y = bitmap2;
                c0348a.f18265z = l.a(bitmap2);
                c0348a.A = 0;
                c0348a.C = 3;
                if (i.g(l0Var, cVar3, c0348a) != objE) {
                    bitmap3 = bitmap2;
                }
                return objE;
            }
        } else {
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Bitmap bitmap4 = (Bitmap) c0348a.f18264y;
            o.b(objG);
            bitmap3 = bitmap4;
        }
        return new ThumbnailResult(bitmap3, false);
        Bitmap bitmap5 = (Bitmap) objG;
        if (bitmap5 != null) {
            return new ThumbnailResult(bitmap5, true);
        }
        b0 b0Var = b0.f30739a;
        String thumbnailUrl = searchIndexItem.getThumbnailUrl();
        c0348a.f18259t = searchIndexItem;
        c0348a.f18260u = cVar;
        c0348a.f18261v = l0Var;
        c0348a.f18262w = l.a(context);
        c0348a.f18263x = l.a(bitmap5);
        c0348a.C = 2;
        Object objA = b0Var.a(context, thumbnailUrl, c0348a);
        if (objA != objE) {
            searchIndexItem2 = searchIndexItem;
            bitmap = bitmap5;
            objG = objA;
            Context context3 = context;
            cVar2 = cVar;
            context2 = context3;
            bitmap2 = (Bitmap) objG;
            if (bitmap2 != null) {
                cVar3 = new c(cVar2, searchIndexItem2, bitmap2, null);
                c0348a.f18259t = l.a(searchIndexItem2);
                c0348a.f18260u = l.a(cVar2);
                c0348a.f18261v = l.a(l0Var);
                c0348a.f18262w = l.a(context2);
                c0348a.f18263x = l.a(bitmap);
                c0348a.f18264y = bitmap2;
                c0348a.f18265z = l.a(bitmap2);
                c0348a.A = 0;
                c0348a.C = 3;
                if (i.g(l0Var, cVar3, c0348a) != objE) {
                    bitmap3 = bitmap2;
                }
            }
            return new ThumbnailResult(bitmap3, false);
        }
        return objE;
    }

    @NotNull
    public static final m2.c d(@NotNull SearchIndexItem searchIndexItem, @Nullable Bitmap bitmap, @NotNull Context context) {
        IconCompat iconCompatB;
        Intrinsics.checkNotNullParameter(searchIndexItem, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Uri uriBuild = Uri.parse(searchIndexItem.getDeeplinkUrl()).buildUpon().appendQueryParameter("joinAttemptOrigin", "AndroidSearch").build();
        m2.c.b bVarG = new m2.c.b(context, searchIndexItem.getId()).g(searchIndexItem.getRankingHint());
        if (bitmap == null || (iconCompatB = IconCompat.b(bitmap)) == null) {
            q.h("OSSearch", "Failed to fetch thumbnail for experience " + searchIndexItem.getId() + ". Falling back to launcher icon.");
            iconCompatB = b(context);
        }
        if (iconCompatB != null) {
            Intrinsics.checkNotNull(bVarG);
            bVarG.c(iconCompatB);
        }
        m2.c cVarA = bVarG.h(searchIndexItem.getTitle()).d(new Intent("android.intent.action.VIEW", uriBuild)).f(true).a();
        Intrinsics.checkNotNullExpressionValue(cVarA, "build(...)");
        return cVarA;
    }
}
