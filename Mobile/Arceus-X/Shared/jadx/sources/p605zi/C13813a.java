package p605zi;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.roblox.client.ossearch.C3211c;
import com.roblox.platform.http.returntypes.ossearch.SearchIndexItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151gk.C6124q;
import p222jj.C7177b0;
import p229jt.C7348o;
import p256ku.AbstractC7888l0;
import p256ku.C7872i;
import p256ku.InterfaceC7906p0;
import p283m2.C8410c;
import p283m2.C8412e;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10350l;
import pt.InterfaceC10344f;
import sg.C11344p0;
import th.C11659h;

/* JADX INFO: renamed from: zi.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\n\u001a,\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m31665d2 = {"Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;", "Landroid/graphics/Bitmap;", "thumbnail", "Landroid/content/Context;", "context", "Lm2/c;", "d", "(Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;Landroid/graphics/Bitmap;Landroid/content/Context;)Lm2/c;", "Landroidx/core/graphics/drawable/IconCompat;", "b", "(Landroid/content/Context;)Landroidx/core/graphics/drawable/IconCompat;", "Lcom/roblox/client/ossearch/c;", "cache", "Lku/l0;", "ioDispatcher", "Lzi/e;", "c", "(Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;Lcom/roblox/client/ossearch/c;Lku/l0;Landroid/content/Context;Lnt/b;)Ljava/lang/Object;", "", "a", "(Landroid/content/Context;)I", "NativeShell_googleProdRelease"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C13813a {

    /* JADX INFO: renamed from: zi.a$a */
    @InterfaceC10344f(m39663c = "com.roblox.client.ossearch.OSSearchUtilKt", m39664f = "OSSearchUtil.kt", m39665l = {64, 66, 67}, m39666m = "getThumbnail", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public int f48432A;

        /* JADX INFO: renamed from: B */
        public /* synthetic */ Object f48433B;

        /* JADX INFO: renamed from: C */
        public int f48434C;

        /* JADX INFO: renamed from: t */
        public Object f48435t;

        /* JADX INFO: renamed from: u */
        public Object f48436u;

        /* JADX INFO: renamed from: v */
        public Object f48437v;

        /* JADX INFO: renamed from: w */
        public Object f48438w;

        /* JADX INFO: renamed from: x */
        public Object f48439x;

        /* JADX INFO: renamed from: y */
        public Object f48440y;

        /* JADX INFO: renamed from: z */
        public Object f48441z;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f48433B = obj;
            this.f48434C |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C13813a.m50295c(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: zi.a$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Lku/p0;)Landroid/graphics/Bitmap;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.ossearch.OSSearchUtilKt$getThumbnail$cached$1", m39664f = "OSSearchUtil.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Bitmap>, Object> {

        /* JADX INFO: renamed from: t */
        public int f48442t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ C3211c f48443u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ SearchIndexItem f48444v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C3211c c3211c, SearchIndexItem searchIndexItem, InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f48443u = c3211c;
            this.f48444v = searchIndexItem;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new b(this.f48443u, this.f48444v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f48442t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            return this.f48443u.m15333i(this.f48444v.getThumbnailCacheKey());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Bitmap> interfaceC9557b) {
            return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: zi.a$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.ossearch.OSSearchUtilKt$getThumbnail$fetched$1$1", m39664f = "OSSearchUtil.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f48445t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ C3211c f48446u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ SearchIndexItem f48447v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ Bitmap f48448w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C3211c c3211c, SearchIndexItem searchIndexItem, Bitmap bitmap, InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f48446u = c3211c;
            this.f48447v = searchIndexItem;
            this.f48448w = bitmap;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new c(this.f48446u, this.f48447v, this.f48448w, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f48445t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            this.f48446u.m15334k(this.f48447v.getThumbnailCacheKey(), this.f48448w);
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final int m50293a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int iM34101b = C8412e.m34101b(context);
        List<C8410c> listM34105f = C8412e.m34105f(context, 1);
        Intrinsics.checkNotNullExpressionValue(listM34105f, "getShortcuts(...)");
        return iM34101b - listM34105f.size();
    }

    /* JADX INFO: renamed from: b */
    public static final IconCompat m50294b(Context context) {
        if (C11659h.m43403a().mo43475K0()) {
            return IconCompat.m2686d(context, C11344p0.f39893a);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:34:0x010c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final Object m50295c(@NotNull SearchIndexItem searchIndexItem, @NotNull C3211c c3211c, @NotNull AbstractC7888l0 abstractC7888l0, @NotNull Context context, @NotNull InterfaceC9557b<? super ThumbnailResult> interfaceC9557b) {
        a aVar;
        SearchIndexItem searchIndexItem2;
        Bitmap bitmap;
        C3211c c3211c2;
        Context context2;
        Bitmap bitmap2;
        c cVar;
        if (interfaceC9557b instanceof a) {
            aVar = (a) interfaceC9557b;
            int i10 = aVar.f48434C;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                aVar.f48434C = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                aVar = new a(interfaceC9557b);
            }
        } else {
            aVar = new a(interfaceC9557b);
        }
        Object objM32684g = aVar.f48433B;
        Object objM38805e = C10047c.m38805e();
        int i11 = aVar.f48434C;
        Bitmap bitmap3 = null;
        if (i11 == 0) {
            C7348o.m30470b(objM32684g);
            b bVar = new b(c3211c, searchIndexItem, null);
            aVar.f48435t = searchIndexItem;
            aVar.f48436u = c3211c;
            aVar.f48437v = abstractC7888l0;
            aVar.f48438w = context;
            aVar.f48434C = 1;
            objM32684g = C7872i.m32684g(abstractC7888l0, bVar, aVar);
            if (objM32684g != objM38805e) {
            }
            return objM38805e;
        }
        if (i11 == 1) {
            context = (Context) aVar.f48438w;
            abstractC7888l0 = (AbstractC7888l0) aVar.f48437v;
            c3211c = (C3211c) aVar.f48436u;
            searchIndexItem = (SearchIndexItem) aVar.f48435t;
            C7348o.m30470b(objM32684g);
        } else if (i11 == 2) {
            bitmap = (Bitmap) aVar.f48439x;
            context2 = (Context) aVar.f48438w;
            abstractC7888l0 = (AbstractC7888l0) aVar.f48437v;
            c3211c2 = (C3211c) aVar.f48436u;
            searchIndexItem2 = (SearchIndexItem) aVar.f48435t;
            C7348o.m30470b(objM32684g);
            bitmap2 = (Bitmap) objM32684g;
            if (bitmap2 != null) {
                cVar = new c(c3211c2, searchIndexItem2, bitmap2, null);
                aVar.f48435t = C10350l.m39676a(searchIndexItem2);
                aVar.f48436u = C10350l.m39676a(c3211c2);
                aVar.f48437v = C10350l.m39676a(abstractC7888l0);
                aVar.f48438w = C10350l.m39676a(context2);
                aVar.f48439x = C10350l.m39676a(bitmap);
                aVar.f48440y = bitmap2;
                aVar.f48441z = C10350l.m39676a(bitmap2);
                aVar.f48432A = 0;
                aVar.f48434C = 3;
                if (C7872i.m32684g(abstractC7888l0, cVar, aVar) != objM38805e) {
                    bitmap3 = bitmap2;
                }
                return objM38805e;
            }
        } else {
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Bitmap bitmap4 = (Bitmap) aVar.f48440y;
            C7348o.m30470b(objM32684g);
            bitmap3 = bitmap4;
        }
        return new ThumbnailResult(bitmap3, false);
        Bitmap bitmap5 = (Bitmap) objM32684g;
        if (bitmap5 != null) {
            return new ThumbnailResult(bitmap5, true);
        }
        C7177b0 c7177b0 = C7177b0.f27845a;
        String thumbnailUrl = searchIndexItem.getThumbnailUrl();
        aVar.f48435t = searchIndexItem;
        aVar.f48436u = c3211c;
        aVar.f48437v = abstractC7888l0;
        aVar.f48438w = C10350l.m39676a(context);
        aVar.f48439x = C10350l.m39676a(bitmap5);
        aVar.f48434C = 2;
        Object objM30000a = c7177b0.m30000a(context, thumbnailUrl, aVar);
        if (objM30000a != objM38805e) {
            searchIndexItem2 = searchIndexItem;
            bitmap = bitmap5;
            objM32684g = objM30000a;
            Context context3 = context;
            c3211c2 = c3211c;
            context2 = context3;
            bitmap2 = (Bitmap) objM32684g;
            if (bitmap2 != null) {
                cVar = new c(c3211c2, searchIndexItem2, bitmap2, null);
                aVar.f48435t = C10350l.m39676a(searchIndexItem2);
                aVar.f48436u = C10350l.m39676a(c3211c2);
                aVar.f48437v = C10350l.m39676a(abstractC7888l0);
                aVar.f48438w = C10350l.m39676a(context2);
                aVar.f48439x = C10350l.m39676a(bitmap);
                aVar.f48440y = bitmap2;
                aVar.f48441z = C10350l.m39676a(bitmap2);
                aVar.f48432A = 0;
                aVar.f48434C = 3;
                if (C7872i.m32684g(abstractC7888l0, cVar, aVar) != objM38805e) {
                    bitmap3 = bitmap2;
                }
            }
            return new ThumbnailResult(bitmap3, false);
        }
        return objM38805e;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final C8410c m50296d(@NotNull SearchIndexItem searchIndexItem, @Nullable Bitmap bitmap, @NotNull Context context) {
        IconCompat iconCompatM50294b;
        Intrinsics.checkNotNullParameter(searchIndexItem, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Uri uriBuild = Uri.parse(searchIndexItem.getDeeplinkUrl()).buildUpon().appendQueryParameter("joinAttemptOrigin", "AndroidSearch").build();
        C8410c.b bVarM34091g = new C8410c.b(context, searchIndexItem.getId()).m34091g(searchIndexItem.getRankingHint());
        if (bitmap == null || (iconCompatM50294b = IconCompat.m2684b(bitmap)) == null) {
            C6124q.m27063h("OSSearch", "Failed to fetch thumbnail for experience " + searchIndexItem.getId() + ". Falling back to launcher icon.");
            iconCompatM50294b = m50294b(context);
        }
        if (iconCompatM50294b != null) {
            Intrinsics.checkNotNull(bVarM34091g);
            bVarM34091g.m34087c(iconCompatM50294b);
        }
        C8410c c8410cM34085a = bVarM34091g.m34092h(searchIndexItem.getTitle()).m34088d(new Intent("android.intent.action.VIEW", uriBuild)).m34090f(true).m34085a();
        Intrinsics.checkNotNullExpressionValue(c8410cM34085a, "build(...)");
        return c8410cM34085a;
    }
}
