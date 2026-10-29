package p272lh;

import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteFullException;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7699p;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151gk.C6124q;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10342d;
import pt.C10340b;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: lh.h */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001aH\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0086@¢\u0006\u0004\b\b\u0010\t\u001a6\u0010\r\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0086@¢\u0006\u0004\b\r\u0010\t\u001a6\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00012\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0086@¢\u0006\u0004\b\u000f\u0010\t¨\u0006\u0010"}, m31665d2 = {"T", "", "tag", "Lkotlin/Function1;", "Lnt/b;", "", "", "getFunc", "a", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;", "", "insertFunc", "", "b", "func", "c", "database_googleProdRelease"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8144h {

    /* JADX INFO: renamed from: lh.h$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.roblox.client.db.dao.DaoExtensionsKt", m39664f = "DaoExtensions.kt", m39665l = {9}, m39666m = "safeGetList", m39667v = 1)
    public static final class a<T> extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f30192t;

        /* JADX INFO: renamed from: u */
        public Object f30193u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f30194v;

        /* JADX INFO: renamed from: w */
        public int f30195w;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30194v = obj;
            this.f30195w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C8144h.m33384a(null, null, this);
        }
    }

    /* JADX INFO: renamed from: lh.h$b */
    @InterfaceC10344f(m39663c = "com.roblox.client.db.dao.DaoExtensionsKt", m39664f = "DaoExtensions.kt", m39665l = {23}, m39666m = "safeInsert", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f30196t;

        /* JADX INFO: renamed from: u */
        public Object f30197u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f30198v;

        /* JADX INFO: renamed from: w */
        public int f30199w;

        public b(InterfaceC9557b<? super b> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30198v = obj;
            this.f30199w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C8144h.m33385b(null, null, this);
        }
    }

    /* JADX INFO: renamed from: lh.h$c */
    @InterfaceC10344f(m39663c = "com.roblox.client.db.dao.DaoExtensionsKt", m39664f = "DaoExtensions.kt", m39665l = {40}, m39666m = "safeSqlInvoke", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class c extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f30200t;

        /* JADX INFO: renamed from: u */
        public Object f30201u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f30202v;

        /* JADX INFO: renamed from: w */
        public int f30203w;

        public c(InterfaceC9557b<? super c> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30202v = obj;
            this.f30203w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C8144h.m33386c(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <T> Object m33384a(@NotNull String str, @NotNull Function1<? super InterfaceC9557b<? super List<? extends T>>, ? extends Object> function1, @NotNull InterfaceC9557b<? super List<? extends T>> interfaceC9557b) {
        a aVar;
        if (interfaceC9557b instanceof a) {
            aVar = (a) interfaceC9557b;
            int i10 = aVar.f30195w;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                aVar.f30195w = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                aVar = new a(interfaceC9557b);
            }
        } else {
            aVar = new a(interfaceC9557b);
        }
        Object obj = aVar.f30194v;
        Object objM38805e = C10047c.m38805e();
        int i11 = aVar.f30195w;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return obj;
            }
            C7348o.m30470b(obj);
            aVar.f30192t = str;
            aVar.f30193u = C10350l.m39676a(function1);
            aVar.f30195w = 1;
            Object objInvoke = function1.invoke(aVar);
            return objInvoke == objM38805e ? objM38805e : objInvoke;
        } catch (SQLiteDiskIOException e10) {
            C6124q.m27061f(str, "Ran into IOException. Failed to get.", e10);
            return C7699p.m31892k();
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:30:0x0022 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: java.lang.String */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Boolean, java.lang.Object] */
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final Object m33385b(@NotNull String str, @NotNull Function1<? super InterfaceC9557b<? super Unit>, ? extends Object> function1, @NotNull InterfaceC9557b<? super Boolean> interfaceC9557b) {
        b bVar;
        if (interfaceC9557b instanceof b) {
            bVar = (b) interfaceC9557b;
            int i10 = bVar.f30199w;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                bVar.f30199w = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                bVar = new b(interfaceC9557b);
            }
        } else {
            bVar = new b(interfaceC9557b);
        }
        Object obj = bVar.f30198v;
        Object objM38805e = C10047c.m38805e();
        int i11 = bVar.f30199w;
        try {
            if (i11 == 0) {
                C7348o.m30470b(obj);
                bVar.f30196t = str;
                bVar.f30197u = C10350l.m39676a(function1);
                bVar.f30199w = 1;
                if (function1.invoke(bVar) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            str = C10340b.m39658a(true);
            return str;
        } catch (SQLiteDiskIOException e10) {
            C6124q.m27061f(str, "Ran into IOException. Failed to insert", e10);
            return C10340b.m39658a(false);
        } catch (SQLiteFullException e11) {
            C6124q.m27061f(str, "Database is full. Failed to insert.", e11);
            return C10340b.m39658a(false);
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:26:0x0021 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r4v10, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r4v11, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: java.lang.String */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final Object m33386c(@NotNull String str, @NotNull Function1<? super InterfaceC9557b<? super Unit>, ? extends Object> function1, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        c cVar;
        if (interfaceC9557b instanceof c) {
            cVar = (c) interfaceC9557b;
            int i10 = cVar.f30203w;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                cVar.f30203w = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                cVar = new c(interfaceC9557b);
            }
        } else {
            cVar = new c(interfaceC9557b);
        }
        Object obj = cVar.f30202v;
        Object objM38805e = C10047c.m38805e();
        int i11 = cVar.f30203w;
        try {
            if (i11 == 0) {
                C7348o.m30470b(obj);
                cVar.f30200t = str;
                cVar.f30201u = C10350l.m39676a(function1);
                cVar.f30203w = 1;
                Object objInvoke = function1.invoke(cVar);
                str = objInvoke;
                if (objInvoke == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str2 = (String) cVar.f30200t;
                C7348o.m30470b(obj);
                str = str2;
            }
        } catch (SQLiteFullException e10) {
            C6124q.m27061f(str, "Failed to invoke SQL in database.", e10);
        }
        return Unit.f29331a;
    }
}
