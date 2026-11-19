package uh;

import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteFullException;
import com.appsflyer.share.attribution.RequestError;
import com.github.luben.zstd.BuildConfig;
import java.util.List;
import ok.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.p;
import p001kotlin.jvm.functions.Function1;
import zt.o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001aH\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0086@¢\u0006\u0004\b\b\u0010\t\u001a6\u0010\r\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0086@¢\u0006\u0004\b\r\u0010\t\u001a6\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00012\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0086@¢\u0006\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"T", BuildConfig.FLAVOR, "tag", "Lkotlin/Function1;", "Leu/b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "getFunc", "a", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Leu/b;)Ljava/lang/Object;", BuildConfig.FLAVOR, "insertFunc", BuildConfig.FLAVOR, "b", "func", "c", "database_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.client.db.dao.DaoExtensionsKt", f = "DaoExtensions.kt", l = {9}, m = "safeGetList", v = 1)
    public static final class a<T> extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f33303t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f33304u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f33305v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f33306w;

        public a(eu.b<? super a> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33305v = obj;
            this.f33306w |= Integer.MIN_VALUE;
            return h.a(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.client.db.dao.DaoExtensionsKt", f = "DaoExtensions.kt", l = {23}, m = "safeInsert", v = 1)
    public static final class b extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f33307t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f33308u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f33309v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f33310w;

        public b(eu.b<? super b> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33309v = obj;
            this.f33310w |= Integer.MIN_VALUE;
            return h.b(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.client.db.dao.DaoExtensionsKt", f = "DaoExtensions.kt", l = {RequestError.NETWORK_FAILURE}, m = "safeSqlInvoke", v = 1)
    public static final class c extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f33311t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f33312u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f33313v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f33314w;

        public c(eu.b<? super c> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33313v = obj;
            this.f33314w |= Integer.MIN_VALUE;
            return h.c(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final <T> Object a(@NotNull String str, @NotNull Function1<? super eu.b<? super List<? extends T>>, ? extends Object> function1, @NotNull eu.b<? super List<? extends T>> bVar) {
        a aVar;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f33306w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f33306w = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj = aVar.f33305v;
        Object objE = fu.c.e();
        int i11 = aVar.f33306w;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            aVar.f33303t = str;
            aVar.f33304u = gu.l.a(function1);
            aVar.f33306w = 1;
            Object objInvoke = function1.invoke(aVar);
            return objInvoke == objE ? objE : objInvoke;
        } catch (SQLiteDiskIOException e10) {
            q.f(str, "Ran into IOException. Failed to get.", e10);
            return p.k();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Boolean, java.lang.Object] */
    @Nullable
    public static final Object b(@NotNull String str, @NotNull Function1<? super eu.b<? super Unit>, ? extends Object> function1, @NotNull eu.b<? super Boolean> bVar) {
        b bVar2;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.f33310w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f33310w = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object obj = bVar2.f33309v;
        Object objE = fu.c.e();
        int i11 = bVar2.f33310w;
        try {
            if (i11 == 0) {
                o.b(obj);
                bVar2.f33307t = str;
                bVar2.f33308u = gu.l.a(function1);
                bVar2.f33310w = 1;
                if (function1.invoke(bVar2) == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            str = gu.b.a(true);
            return str;
        } catch (SQLiteDiskIOException e10) {
            q.f(str, "Ran into IOException. Failed to insert", e10);
            return gu.b.a(false);
        } catch (SQLiteFullException e11) {
            q.f(str, "Database is full. Failed to insert.", e11);
            return gu.b.a(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final Object c(@NotNull String str, @NotNull Function1<? super eu.b<? super Unit>, ? extends Object> function1, @NotNull eu.b<? super Unit> bVar) {
        c cVar;
        if (bVar instanceof c) {
            cVar = (c) bVar;
            int i10 = cVar.f33314w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f33314w = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(bVar);
            }
        } else {
            cVar = new c(bVar);
        }
        Object obj = cVar.f33313v;
        Object objE = fu.c.e();
        int i11 = cVar.f33314w;
        try {
            if (i11 == 0) {
                o.b(obj);
                cVar.f33311t = str;
                cVar.f33312u = gu.l.a(function1);
                cVar.f33314w = 1;
                Object objInvoke = function1.invoke(cVar);
                str = objInvoke;
                if (objInvoke == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str2 = (String) cVar.f33311t;
                o.b(obj);
                str = str2;
            }
        } catch (SQLiteFullException e10) {
            q.f(str, "Failed to invoke SQL in database.", e10);
        }
        return Unit.f21506a;
    }
}
