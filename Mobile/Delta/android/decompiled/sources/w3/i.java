package w3;

import android.content.Context;
import gt.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.q;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nt.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xt.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a5\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a1\u0010\u000e\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a9\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00102\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\" \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroid/content/Context;", "context", "", "sharedPreferencesName", "", "keysToMigrate", "Lv3/a;", "Lx3/f;", "a", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;)Lv3/a;", "Lkotlin/Function3;", "Lv3/c;", "Llt/b;", "", "d", "()Lxt/n;", "Lkotlin/Function2;", "", "e", "(Ljava/util/Set;)Lkotlin/jvm/functions/Function2;", "Ljava/util/Set;", "c", "()Ljava/util/Set;", "MIGRATE_ALL_KEYS", "datastore-preferences_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Set<String> f33885a = new LinkedHashSet();

    @nt.f(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv3/c;", "sharedPrefs", "Lx3/f;", "currentData", "<anonymous>", "(Lv3/c;Lx3/f;)Lx3/f;"}, k = 3, mv = {1, 8, 0})
    public static final class a extends m implements n<v3.c, x3.f, lt.b<? super x3.f>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f33886t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f33887u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f33888v;

        public a(lt.b<? super a> bVar) {
            super(3, bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            mt.c.e();
            if (this.f33886t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            v3.c cVar = (v3.c) this.f33887u;
            x3.f fVar = (x3.f) this.f33888v;
            Set<x3.f.a<?>> setKeySet = fVar.a().keySet();
            ArrayList arrayList = new ArrayList(q.u(setKeySet, 10));
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((x3.f.a) it.next()).getName());
            }
            Map<String, Object> mapA = cVar.a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : mapA.entrySet()) {
                if (!arrayList.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            x3.c cVarC = fVar.c();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (value instanceof Boolean) {
                    cVarC.i(x3.i.a(str), value);
                } else if (value instanceof Float) {
                    cVarC.i(x3.i.d(str), value);
                } else if (value instanceof Integer) {
                    cVarC.i(x3.i.e(str), value);
                } else if (value instanceof Long) {
                    cVarC.i(x3.i.f(str), value);
                } else if (value instanceof String) {
                    cVarC.i(x3.i.g(str), value);
                } else if (value instanceof Set) {
                    x3.f.a<Set<String>> aVarH = x3.i.h(str);
                    Intrinsics.d(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                    cVarC.i(aVarH, (Set) value);
                }
            }
            return cVarC.d();
        }

        @Override // xt.n
        @Nullable
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull v3.c cVar, @NotNull x3.f fVar, @Nullable lt.b<? super x3.f> bVar) {
            a aVar = new a(bVar);
            aVar.f33887u = cVar;
            aVar.f33888v = fVar;
            return aVar.invokeSuspend(Unit.f22938a);
        }
    }

    @nt.f(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx3/f;", "prefs", "", "<anonymous>", "(Lx3/f;)Z"}, k = 3, mv = {1, 8, 0})
    public static final class b extends m implements Function2<x3.f, lt.b<? super Boolean>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f33889t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f33890u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Set<String> f33891v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Set<String> set, lt.b<? super b> bVar) {
            super(2, bVar);
            this.f33891v = set;
        }

        @Override // nt.a
        @NotNull
        public final lt.b<Unit> create(@Nullable Object obj, @NotNull lt.b<?> bVar) {
            b bVar2 = new b(this.f33891v, bVar);
            bVar2.f33890u = obj;
            return bVar2;
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            mt.c.e();
            if (this.f33889t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            Set<x3.f.a<?>> setKeySet = ((x3.f) this.f33890u).a().keySet();
            ArrayList arrayList = new ArrayList(q.u(setKeySet, 10));
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((x3.f.a) it.next()).getName());
            }
            boolean z10 = true;
            if (this.f33891v != i.c()) {
                Set<String> set = this.f33891v;
                if ((set instanceof Collection) && set.isEmpty()) {
                    z10 = false;
                } else {
                    Iterator<T> it2 = set.iterator();
                    while (it2.hasNext()) {
                        if (!arrayList.contains((String) it2.next())) {
                        }
                    }
                    z10 = false;
                }
            }
            return nt.b.a(z10);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull x3.f fVar, @Nullable lt.b<? super Boolean> bVar) {
            return ((b) create(fVar, bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @NotNull
    public static final v3.a<x3.f> a(@NotNull Context context, @NotNull String sharedPreferencesName, @NotNull Set<String> keysToMigrate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        if (keysToMigrate != f33885a) {
            return new v3.a<>(context, sharedPreferencesName, keysToMigrate, e(keysToMigrate), d());
        }
        return new v3.a<>(context, sharedPreferencesName, null, e(keysToMigrate), d(), 4, null);
    }

    public static /* synthetic */ v3.a b(Context context, String str, Set set, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            set = f33885a;
        }
        return a(context, str, set);
    }

    @NotNull
    public static final Set<String> c() {
        return f33885a;
    }

    public static final n<v3.c, x3.f, lt.b<? super x3.f>, Object> d() {
        return new a(null);
    }

    public static final Function2<x3.f, lt.b<? super Boolean>, Object> e(Set<String> set) {
        return new b(set, null);
    }
}
