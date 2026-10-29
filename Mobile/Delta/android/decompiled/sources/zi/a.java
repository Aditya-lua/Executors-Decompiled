package zi;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;
import com.roblox.platform.http.returntypes.ossearch.SearchIndexItem;
import gk.p;
import java.util.List;
import jj.b0;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.i;
import ku.l0;
import ku.p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.f;
import pt.l;
import pt.m;
import th.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\n\u001a,\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;", "Landroid/graphics/Bitmap;", "thumbnail", "Landroid/content/Context;", "context", "Lm2/c;", "d", "(Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;Landroid/graphics/Bitmap;Landroid/content/Context;)Lm2/c;", "Landroidx/core/graphics/drawable/IconCompat;", "b", "(Landroid/content/Context;)Landroidx/core/graphics/drawable/IconCompat;", "Lcom/roblox/client/ossearch/c;", "cache", "Lku/l0;", "ioDispatcher", "Lzi/e;", "c", "(Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;Lcom/roblox/client/ossearch/c;Lku/l0;Landroid/content/Context;Lnt/b;)Ljava/lang/Object;", "", "a", "(Landroid/content/Context;)I", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: zi.a$a, reason: collision with other inner class name */
    @f(c = "com.roblox.client.ossearch.OSSearchUtilKt", f = "OSSearchUtil.kt", l = {64, 66, 67}, m = "getThumbnail", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C0681a extends pt.d {
        public int A;
        public /* synthetic */ Object B;
        public int C;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f37620t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f37621u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f37622v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f37623w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f37624x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f37625y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f37626z;

        public C0681a(nt.b<? super C0681a> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.B = obj;
            this.C |= Integer.MIN_VALUE;
            return a.c(null, null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Lku/p0;)Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.ossearch.OSSearchUtilKt$getThumbnail$cached$1", f = "OSSearchUtil.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends m implements Function2<p0, nt.b<? super Bitmap>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f37627t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.roblox.client.ossearch.c f37628u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ SearchIndexItem f37629v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.roblox.client.ossearch.c cVar, SearchIndexItem searchIndexItem, nt.b<? super b> bVar) {
            super(2, bVar);
            this.f37628u = cVar;
            this.f37629v = searchIndexItem;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new b(this.f37628u, this.f37629v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f37627t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            return this.f37628u.i(this.f37629v.getThumbnailCacheKey());
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Bitmap> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.ossearch.OSSearchUtilKt$getThumbnail$fetched$1$1", f = "OSSearchUtil.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f37630t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.roblox.client.ossearch.c f37631u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ SearchIndexItem f37632v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Bitmap f37633w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.roblox.client.ossearch.c cVar, SearchIndexItem searchIndexItem, Bitmap bitmap, nt.b<? super c> bVar) {
            super(2, bVar);
            this.f37631u = cVar;
            this.f37632v = searchIndexItem;
            this.f37633w = bitmap;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new c(this.f37631u, this.f37632v, this.f37633w, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f37630t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            this.f37631u.k(this.f37632v.getThumbnailCacheKey(), this.f37633w);
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
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
        if (h.a().H0()) {
            return IconCompat.d(context, sg.p0.f30911a);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:34:0x010c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object c(@NotNull SearchIndexItem searchIndexItem, @NotNull com.roblox.client.ossearch.c cVar, @NotNull l0 l0Var, @NotNull Context context, @NotNull nt.b<? super ThumbnailResult> bVar) {
        C0681a c0681a;
        SearchIndexItem searchIndexItem2;
        Bitmap bitmap;
        com.roblox.client.ossearch.c cVar2;
        Context context2;
        Bitmap bitmap2;
        c cVar3;
        if (bVar instanceof C0681a) {
            c0681a = (C0681a) bVar;
            int i10 = c0681a.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0681a.C = i10 - Integer.MIN_VALUE;
            } else {
                c0681a = new C0681a(bVar);
            }
        } else {
            c0681a = new C0681a(bVar);
        }
        Object objG = c0681a.B;
        Object objE = ot.c.e();
        int i11 = c0681a.C;
        Bitmap bitmap3 = null;
        if (i11 == 0) {
            o.b(objG);
            b bVar2 = new b(cVar, searchIndexItem, null);
            c0681a.f37620t = searchIndexItem;
            c0681a.f37621u = cVar;
            c0681a.f37622v = l0Var;
            c0681a.f37623w = context;
            c0681a.C = 1;
            objG = i.g(l0Var, bVar2, c0681a);
            if (objG != objE) {
            }
            return objE;
        }
        if (i11 == 1) {
            context = (Context) c0681a.f37623w;
            l0Var = (l0) c0681a.f37622v;
            cVar = (com.roblox.client.ossearch.c) c0681a.f37621u;
            searchIndexItem = (SearchIndexItem) c0681a.f37620t;
            o.b(objG);
        } else if (i11 == 2) {
            bitmap = (Bitmap) c0681a.f37624x;
            context2 = (Context) c0681a.f37623w;
            l0Var = (l0) c0681a.f37622v;
            cVar2 = (com.roblox.client.ossearch.c) c0681a.f37621u;
            searchIndexItem2 = (SearchIndexItem) c0681a.f37620t;
            o.b(objG);
            bitmap2 = (Bitmap) objG;
            if (bitmap2 != null) {
                cVar3 = new c(cVar2, searchIndexItem2, bitmap2, null);
                c0681a.f37620t = l.a(searchIndexItem2);
                c0681a.f37621u = l.a(cVar2);
                c0681a.f37622v = l.a(l0Var);
                c0681a.f37623w = l.a(context2);
                c0681a.f37624x = l.a(bitmap);
                c0681a.f37625y = bitmap2;
                c0681a.f37626z = l.a(bitmap2);
                c0681a.A = 0;
                c0681a.C = 3;
                if (i.g(l0Var, cVar3, c0681a) != objE) {
                    bitmap3 = bitmap2;
                }
                return objE;
            }
        } else {
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Bitmap bitmap4 = (Bitmap) c0681a.f37625y;
            o.b(objG);
            bitmap3 = bitmap4;
        }
        return new ThumbnailResult(bitmap3, false);
        Bitmap bitmap5 = (Bitmap) objG;
        if (bitmap5 != null) {
            return new ThumbnailResult(bitmap5, true);
        }
        b0 b0Var = b0.f21480a;
        String thumbnailUrl = searchIndexItem.getThumbnailUrl();
        c0681a.f37620t = searchIndexItem;
        c0681a.f37621u = cVar;
        c0681a.f37622v = l0Var;
        c0681a.f37623w = l.a(context);
        c0681a.f37624x = l.a(bitmap5);
        c0681a.C = 2;
        Object objA = b0Var.a(context, thumbnailUrl, c0681a);
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
                c0681a.f37620t = l.a(searchIndexItem2);
                c0681a.f37621u = l.a(cVar2);
                c0681a.f37622v = l.a(l0Var);
                c0681a.f37623w = l.a(context2);
                c0681a.f37624x = l.a(bitmap);
                c0681a.f37625y = bitmap2;
                c0681a.f37626z = l.a(bitmap2);
                c0681a.A = 0;
                c0681a.C = 3;
                if (i.g(l0Var, cVar3, c0681a) != objE) {
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
            p.h("OSSearch", "Failed to fetch thumbnail for experience " + searchIndexItem.getId() + ". Falling back to launcher icon.");
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
