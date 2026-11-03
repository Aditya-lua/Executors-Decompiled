package kh;

import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteFullException;
import ek.q;
import gt.o;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.p;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001aH\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0086@¢\u0006\u0004\b\b\u0010\t\u001a6\u0010\r\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0086@¢\u0006\u0004\b\r\u0010\t\u001a6\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00012\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0086@¢\u0006\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"T", "", "tag", "Lkotlin/Function1;", "Llt/b;", "", "", "getFunc", "a", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Llt/b;)Ljava/lang/Object;", "", "insertFunc", "", "b", "func", "c", "database_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {

    @nt.f(c = "com.roblox.client.db.dao.DaoExtensionsKt", f = "DaoExtensions.kt", l = {9}, m = "safeGetList", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a<T> extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f22687t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f22688u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f22689v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f22690w;

        public a(lt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f22689v = obj;
            this.f22690w |= Integer.MIN_VALUE;
            return h.a(null, null, this);
        }
    }

    @nt.f(c = "com.roblox.client.db.dao.DaoExtensionsKt", f = "DaoExtensions.kt", l = {23}, m = "safeInsert", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f22691t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f22692u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f22693v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f22694w;

        public b(lt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f22693v = obj;
            this.f22694w |= Integer.MIN_VALUE;
            return h.b(null, null, this);
        }
    }

    @nt.f(c = "com.roblox.client.db.dao.DaoExtensionsKt", f = "DaoExtensions.kt", l = {40}, m = "safeSqlInvoke", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f22695t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f22696u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f22697v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f22698w;

        public c(lt.b<? super c> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f22697v = obj;
            this.f22698w |= Integer.MIN_VALUE;
            return h.c(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final <T> Object a(@NotNull String str, @NotNull Function1<? super lt.b<? super List<? extends T>>, ? extends Object> function1, @NotNull lt.b<? super List<? extends T>> bVar) {
        a aVar;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f22690w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f22690w = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj = aVar.f22689v;
        Object objE = mt.c.e();
        int i11 = aVar.f22690w;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            aVar.f22687t = str;
            aVar.f22688u = nt.l.a(function1);
            aVar.f22690w = 1;
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
    public static final Object b(@NotNull String str, @NotNull Function1<? super lt.b<? super Unit>, ? extends Object> function1, @NotNull lt.b<? super Boolean> bVar) {
        b bVar2;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.f22694w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f22694w = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object obj = bVar2.f22693v;
        Object objE = mt.c.e();
        int i11 = bVar2.f22694w;
        try {
            if (i11 == 0) {
                o.b(obj);
                bVar2.f22691t = str;
                bVar2.f22692u = nt.l.a(function1);
                bVar2.f22694w = 1;
                if (function1.invoke(bVar2) == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            str = nt.b.a(true);
            return str;
        } catch (SQLiteDiskIOException e10) {
            q.f(str, "Ran into IOException. Failed to insert", e10);
            return nt.b.a(false);
        } catch (SQLiteFullException e11) {
            q.f(str, "Database is full. Failed to insert.", e11);
            return nt.b.a(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final Object c(@NotNull String str, @NotNull Function1<? super lt.b<? super Unit>, ? extends Object> function1, @NotNull lt.b<? super Unit> bVar) {
        c cVar;
        if (bVar instanceof c) {
            cVar = (c) bVar;
            int i10 = cVar.f22698w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f22698w = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(bVar);
            }
        } else {
            cVar = new c(bVar);
        }
        Object obj = cVar.f22697v;
        Object objE = mt.c.e();
        int i11 = cVar.f22698w;
        try {
            if (i11 == 0) {
                o.b(obj);
                cVar.f22695t = str;
                cVar.f22696u = nt.l.a(function1);
                cVar.f22698w = 1;
                Object objInvoke = function1.invoke(cVar);
                str = objInvoke;
                if (objInvoke == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str2 = (String) cVar.f22695t;
                o.b(obj);
                str = str2;
            }
        } catch (SQLiteFullException e10) {
            q.f(str, "Failed to invoke SQL in database.", e10);
        }
        return Unit.f22938a;
    }
}
