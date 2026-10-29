package p506w3;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7701q;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p483v3.C12006a;
import p483v3.C12008c;
import p534x3.AbstractC12645f;
import p534x3.C12642c;
import p534x3.C12648i;
import p615zt.InterfaceC14057n;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: w3.i */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a5\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a1\u0010\u000e\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a9\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00102\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\" \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m31665d2 = {"Landroid/content/Context;", "context", "", "sharedPreferencesName", "", "keysToMigrate", "Lv3/a;", "Lx3/f;", "a", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;)Lv3/a;", "Lkotlin/Function3;", "Lv3/c;", "Lnt/b;", "", "d", "()Lzt/n;", "Lkotlin/Function2;", "", "e", "(Ljava/util/Set;)Lkotlin/jvm/functions/Function2;", "Ljava/util/Set;", "c", "()Ljava/util/Set;", "MIGRATE_ALL_KEYS", "datastore-preferences_release"}, m31666k = 2, m31667mv = {1, 8, 0}, m31669xi = 48)
public final class C12305i {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Set<String> f43596a = new LinkedHashSet();

    /* JADX INFO: renamed from: w3.i$a */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m31665d2 = {"Lv3/c;", "sharedPrefs", "Lx3/f;", "currentData", "<anonymous>", "(Lv3/c;Lx3/f;)Lx3/f;"}, m31666k = 3, m31667mv = {1, 8, 0})
    @InterfaceC10344f(m39663c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", m39664f = "SharedPreferencesMigration.android.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements InterfaceC14057n<C12008c, AbstractC12645f, InterfaceC9557b<? super AbstractC12645f>, Object> {

        /* JADX INFO: renamed from: t */
        public int f43597t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f43598u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f43599v;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(3, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            C10047c.m38805e();
            if (this.f43597t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            C12008c c12008c = (C12008c) this.f43598u;
            AbstractC12645f abstractC12645f = (AbstractC12645f) this.f43599v;
            Set<AbstractC12645f.a<?>> setKeySet = abstractC12645f.mo47088a().keySet();
            ArrayList arrayList = new ArrayList(C7701q.m31905u(setKeySet, 10));
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC12645f.a) it.next()).getName());
            }
            Map<String, Object> mapM44835a = c12008c.m44835a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : mapM44835a.entrySet()) {
                if (!arrayList.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            C12642c c12642cM47101c = abstractC12645f.m47101c();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (value instanceof Boolean) {
                    c12642cM47101c.m47094i(C12648i.m47112a(str), value);
                } else if (value instanceof Float) {
                    c12642cM47101c.m47094i(C12648i.m47115d(str), value);
                } else if (value instanceof Integer) {
                    c12642cM47101c.m47094i(C12648i.m47116e(str), value);
                } else if (value instanceof Long) {
                    c12642cM47101c.m47094i(C12648i.m47117f(str), value);
                } else if (value instanceof String) {
                    c12642cM47101c.m47094i(C12648i.m47118g(str), value);
                } else if (value instanceof Set) {
                    AbstractC12645f.a<Set<String>> aVarM47119h = C12648i.m47119h(str);
                    Intrinsics.m31981d(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                    c12642cM47101c.m47094i(aVarM47119h, (Set) value);
                }
            }
            return c12642cM47101c.m47102d();
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // p615zt.InterfaceC14057n
        @Nullable
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull C12008c c12008c, @NotNull AbstractC12645f abstractC12645f, @Nullable InterfaceC9557b<? super AbstractC12645f> interfaceC9557b) {
            a aVar = new a(interfaceC9557b);
            aVar.f43598u = c12008c;
            aVar.f43599v = abstractC12645f;
            return aVar.invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: w3.i$b */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lx3/f;", "prefs", "", "<anonymous>", "(Lx3/f;)Z"}, m31666k = 3, m31667mv = {1, 8, 0})
    @InterfaceC10344f(m39663c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1", m39664f = "SharedPreferencesMigration.android.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class b extends AbstractC10351m implements Function2<AbstractC12645f, InterfaceC9557b<? super Boolean>, Object> {

        /* JADX INFO: renamed from: t */
        public int f43600t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f43601u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ Set<String> f43602v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Set<String> set, InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f43602v = set;
        }

        @Override // pt.AbstractC10339a
        @NotNull
        public final InterfaceC9557b<Unit> create(@Nullable Object obj, @NotNull InterfaceC9557b<?> interfaceC9557b) {
            b bVar = new b(this.f43602v, interfaceC9557b);
            bVar.f43601u = obj;
            return bVar;
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            C10047c.m38805e();
            if (this.f43600t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            Set<AbstractC12645f.a<?>> setKeySet = ((AbstractC12645f) this.f43601u).mo47088a().keySet();
            ArrayList arrayList = new ArrayList(C7701q.m31905u(setKeySet, 10));
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC12645f.a) it.next()).getName());
            }
            boolean z10 = true;
            if (this.f43602v != C12305i.m45751c()) {
                Set<String> set = this.f43602v;
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
            return C10340b.m39658a(z10);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull AbstractC12645f abstractC12645f, @Nullable InterfaceC9557b<? super Boolean> interfaceC9557b) {
            return ((b) create(abstractC12645f, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final C12006a<AbstractC12645f> m45749a(@NotNull Context context, @NotNull String sharedPreferencesName, @NotNull Set<String> keysToMigrate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        if (keysToMigrate != f43596a) {
            return new C12006a<>(context, sharedPreferencesName, keysToMigrate, m45753e(keysToMigrate), m45752d());
        }
        return new C12006a<>(context, sharedPreferencesName, null, m45753e(keysToMigrate), m45752d(), 4, null);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C12006a m45750b(Context context, String str, Set set, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            set = f43596a;
        }
        return m45749a(context, str, set);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final Set<String> m45751c() {
        return f43596a;
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC14057n<C12008c, AbstractC12645f, InterfaceC9557b<? super AbstractC12645f>, Object> m45752d() {
        return new a(null);
    }

    /* JADX INFO: renamed from: e */
    public static final Function2<AbstractC12645f, InterfaceC9557b<? super Boolean>, Object> m45753e(Set<String> set) {
        return new b(set, null);
    }
}
