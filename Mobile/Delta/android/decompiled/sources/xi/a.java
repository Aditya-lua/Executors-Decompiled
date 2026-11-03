package xi;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;
import com.roblox.platform.http.returntypes.ossearch.SearchIndexItem;
import ek.q;
import gt.o;
import hj.b0;
import iu.i;
import iu.l0;
import iu.p0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nt.f;
import nt.l;
import nt.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rh.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\n\u001a,\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;", "Landroid/graphics/Bitmap;", "thumbnail", "Landroid/content/Context;", "context", "Lm2/c;", "d", "(Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;Landroid/graphics/Bitmap;Landroid/content/Context;)Lm2/c;", "Landroidx/core/graphics/drawable/IconCompat;", "b", "(Landroid/content/Context;)Landroidx/core/graphics/drawable/IconCompat;", "Lcom/roblox/client/ossearch/c;", "cache", "Liu/l0;", "ioDispatcher", "Lxi/e;", "c", "(Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;Lcom/roblox/client/ossearch/c;Liu/l0;Landroid/content/Context;Llt/b;)Ljava/lang/Object;", "", "a", "(Landroid/content/Context;)I", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: xi.a$a, reason: collision with other inner class name */
    @f(c = "com.roblox.client.ossearch.OSSearchUtilKt", f = "OSSearchUtil.kt", l = {64, 66, 67}, m = "getThumbnail", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C0650a extends nt.d {
        public int A;
        public /* synthetic */ Object B;
        public int C;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f35743t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f35744u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f35745v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f35746w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f35747x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f35748y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f35749z;

        public C0650a(lt.b<? super C0650a> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.B = obj;
            this.C |= Integer.MIN_VALUE;
            return a.c(null, null, null, null, this);
        }
    }

    @f(c = "com.roblox.client.ossearch.OSSearchUtilKt$getThumbnail$cached$1", f = "OSSearchUtil.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Liu/p0;)Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 2, 0})
    public static final class b extends m implements Function2<p0, lt.b<? super Bitmap>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f35750t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.roblox.client.ossearch.c f35751u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ SearchIndexItem f35752v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.roblox.client.ossearch.c cVar, SearchIndexItem searchIndexItem, lt.b<? super b> bVar) {
            super(2, bVar);
            this.f35751u = cVar;
            this.f35752v = searchIndexItem;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new b(this.f35751u, this.f35752v, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Bitmap> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f35750t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            return this.f35751u.i(this.f35752v.getThumbnailCacheKey());
        }
    }

    @f(c = "com.roblox.client.ossearch.OSSearchUtilKt$getThumbnail$fetched$1$1", f = "OSSearchUtil.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class c extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f35753t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.roblox.client.ossearch.c f35754u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ SearchIndexItem f35755v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Bitmap f35756w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.roblox.client.ossearch.c cVar, SearchIndexItem searchIndexItem, Bitmap bitmap, lt.b<? super c> bVar) {
            super(2, bVar);
            this.f35754u = cVar;
            this.f35755v = searchIndexItem;
            this.f35756w = bitmap;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new c(this.f35754u, this.f35755v, this.f35756w, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f35753t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            this.f35754u.k(this.f35755v.getThumbnailCacheKey(), this.f35756w);
            return Unit.f22938a;
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
        if (h.a().M0()) {
            return IconCompat.d(context, rg.p0.f30516a);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:34:0x010c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object c(@NotNull SearchIndexItem searchIndexItem, @NotNull com.roblox.client.ossearch.c cVar, @NotNull l0 l0Var, @NotNull Context context, @NotNull lt.b<? super ThumbnailResult> bVar) {
        C0650a c0650a;
        SearchIndexItem searchIndexItem2;
        Bitmap bitmap;
        com.roblox.client.ossearch.c cVar2;
        Context context2;
        Bitmap bitmap2;
        c cVar3;
        if (bVar instanceof C0650a) {
            c0650a = (C0650a) bVar;
            int i10 = c0650a.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0650a.C = i10 - Integer.MIN_VALUE;
            } else {
                c0650a = new C0650a(bVar);
            }
        } else {
            c0650a = new C0650a(bVar);
        }
        Object objG = c0650a.B;
        Object objE = mt.c.e();
        int i11 = c0650a.C;
        Bitmap bitmap3 = null;
        if (i11 == 0) {
            o.b(objG);
            b bVar2 = new b(cVar, searchIndexItem, null);
            c0650a.f35743t = searchIndexItem;
            c0650a.f35744u = cVar;
            c0650a.f35745v = l0Var;
            c0650a.f35746w = context;
            c0650a.C = 1;
            objG = i.g(l0Var, bVar2, c0650a);
            if (objG != objE) {
            }
            return objE;
        }
        if (i11 == 1) {
            context = (Context) c0650a.f35746w;
            l0Var = (l0) c0650a.f35745v;
            cVar = (com.roblox.client.ossearch.c) c0650a.f35744u;
            searchIndexItem = (SearchIndexItem) c0650a.f35743t;
            o.b(objG);
        } else if (i11 == 2) {
            bitmap = (Bitmap) c0650a.f35747x;
            context2 = (Context) c0650a.f35746w;
            l0Var = (l0) c0650a.f35745v;
            cVar2 = (com.roblox.client.ossearch.c) c0650a.f35744u;
            searchIndexItem2 = (SearchIndexItem) c0650a.f35743t;
            o.b(objG);
            bitmap2 = (Bitmap) objG;
            if (bitmap2 != null) {
                cVar3 = new c(cVar2, searchIndexItem2, bitmap2, null);
                c0650a.f35743t = l.a(searchIndexItem2);
                c0650a.f35744u = l.a(cVar2);
                c0650a.f35745v = l.a(l0Var);
                c0650a.f35746w = l.a(context2);
                c0650a.f35747x = l.a(bitmap);
                c0650a.f35748y = bitmap2;
                c0650a.f35749z = l.a(bitmap2);
                c0650a.A = 0;
                c0650a.C = 3;
                if (i.g(l0Var, cVar3, c0650a) != objE) {
                    bitmap3 = bitmap2;
                }
                return objE;
            }
        } else {
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Bitmap bitmap4 = (Bitmap) c0650a.f35748y;
            o.b(objG);
            bitmap3 = bitmap4;
        }
        return new ThumbnailResult(bitmap3, false);
        Bitmap bitmap5 = (Bitmap) objG;
        if (bitmap5 != null) {
            return new ThumbnailResult(bitmap5, true);
        }
        b0 b0Var = b0.f19488a;
        String thumbnailUrl = searchIndexItem.getThumbnailUrl();
        c0650a.f35743t = searchIndexItem;
        c0650a.f35744u = cVar;
        c0650a.f35745v = l0Var;
        c0650a.f35746w = l.a(context);
        c0650a.f35747x = l.a(bitmap5);
        c0650a.C = 2;
        Object objA = b0Var.a(context, thumbnailUrl, c0650a);
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
                c0650a.f35743t = l.a(searchIndexItem2);
                c0650a.f35744u = l.a(cVar2);
                c0650a.f35745v = l.a(l0Var);
                c0650a.f35746w = l.a(context2);
                c0650a.f35747x = l.a(bitmap);
                c0650a.f35748y = bitmap2;
                c0650a.f35749z = l.a(bitmap2);
                c0650a.A = 0;
                c0650a.C = 3;
                if (i.g(l0Var, cVar3, c0650a) != objE) {
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
