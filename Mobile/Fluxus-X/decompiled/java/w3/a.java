package w3;

import android.content.Context;
import android.content.SharedPreferences;
import com.github.luben.zstd.BuildConfig;
import gu.f;
import gu.m;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import pu.n;
import u3.g;
import zt.h;
import zt.i;
import zt.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010#\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u001bB\u0089\u0001\b\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012$\b\u0002\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t\u0012(\u0010\u0010\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0014\u0010\u0015By\b\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012$\b\u0002\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t\u0012(\u0010\u0010\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000e¢\u0006\u0004\b\u0014\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010 R0\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010!R6\u0010\u0010\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\"R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010#R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010$R\u001b\u0010(\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u001c\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lw3/a;", "T", "Lu3/g;", "Lkotlin/Function0;", "Landroid/content/SharedPreferences;", "produceSharedPreferences", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "keysToMigrate", "Lkotlin/Function2;", "Leu/b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "shouldRunMigration", "Lkotlin/Function3;", "Lw3/c;", "migrate", "Landroid/content/Context;", "context", "name", "<init>", "(Lkotlin/jvm/functions/Function0;Ljava/util/Set;Lkotlin/jvm/functions/Function2;Lpu/n;Landroid/content/Context;Ljava/lang/String;)V", "sharedPreferencesName", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;Lkotlin/jvm/functions/Function2;Lpu/n;)V", "currentData", "a", "(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;", "c", BuildConfig.FLAVOR, "b", "(Leu/b;)Ljava/lang/Object;", "d", "(Landroid/content/Context;Ljava/lang/String;)V", "Lkotlin/jvm/functions/Function2;", "Lpu/n;", "Landroid/content/Context;", "Ljava/lang/String;", "e", "Lzt/h;", "()Landroid/content/SharedPreferences;", "sharedPrefs", BuildConfig.FLAVOR, "f", "Ljava/util/Set;", "keySet", "datastore_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a<T> implements g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function2<T, eu.b<? super Boolean>, Object> shouldRunMigration;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final n<w3.c, T, eu.b<? super T>, Object> migrate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Context context;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String name;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h sharedPrefs;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Set<String> keySet;

    /* JADX INFO: renamed from: w3.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "T", "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.datastore.migrations.SharedPreferencesMigration$3", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
    public static final class C0734a extends m implements Function2<T, eu.b<? super Boolean>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f35558t;

        public C0734a(eu.b<? super C0734a> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        @NotNull
        public final eu.b<Unit> create(@Nullable Object obj, @NotNull eu.b<?> bVar) {
            return new C0734a(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            fu.c.e();
            if (this.f35558t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            return gu.b.a(true);
        }

        @Override // p001kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T t8, @Nullable eu.b<? super Boolean> bVar) {
            return ((C0734a) create(t8, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Landroid/content/SharedPreferences;", "b", "()Landroid/content/SharedPreferences;"}, k = 3, mv = {1, 8, 0})
    public static final class b extends p001kotlin.jvm.internal.m implements Function0<SharedPreferences> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Context f35559i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f35560j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, String str) {
            super(0);
            this.f35559i = context;
            this.f35560j = str;
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            SharedPreferences sharedPreferences = this.f35559i.getSharedPreferences(this.f35560j, 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
            return sharedPreferences;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lw3/a$c;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "name", BuildConfig.FLAVOR, "a", "(Landroid/content/Context;Ljava/lang/String;)Z", "datastore_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f35561a = new c();

        public static final boolean a(@NotNull Context context, @NotNull String name) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(name, "name");
            return context.deleteSharedPreferences(name);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.datastore.migrations.SharedPreferencesMigration", f = "SharedPreferencesMigration.android.kt", l = {151}, m = "shouldMigrate")
    public static final class d extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f35562t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f35563u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ a<T> f35564v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f35565w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a<T> aVar, eu.b<? super d> bVar) {
            super(bVar);
            this.f35564v = aVar;
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35563u = obj;
            this.f35565w |= Integer.MIN_VALUE;
            return this.f35564v.a(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Function0<? extends SharedPreferences> function0, Set<String> set, Function2<? super T, ? super eu.b<? super Boolean>, ? extends Object> function2, n<? super w3.c, ? super T, ? super eu.b<? super T>, ? extends Object> nVar, Context context, String str) {
        this.shouldRunMigration = function2;
        this.migrate = nVar;
        this.context = context;
        this.name = str;
        this.sharedPrefs = i.a(function0);
        this.keySet = set == w3.b.a() ? null : CollectionsKt.P0(set);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // u3.g
    @Nullable
    public Object a(T t8, @NotNull eu.b<? super Boolean> bVar) {
        d dVar;
        a<T> aVar;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i10 = dVar.f35565w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f35565w = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, bVar);
            }
        } else {
            dVar = new d(this, bVar);
        }
        Object objInvoke = dVar.f35563u;
        Object objE = fu.c.e();
        int i11 = dVar.f35565w;
        boolean z10 = true;
        if (i11 == 0) {
            o.b(objInvoke);
            Function2<T, eu.b<? super Boolean>, Object> function2 = this.shouldRunMigration;
            dVar.f35562t = this;
            dVar.f35565w = 1;
            objInvoke = function2.invoke(t8, dVar);
            if (objInvoke == objE) {
                return objE;
            }
            aVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (a) dVar.f35562t;
            o.b(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return gu.b.a(false);
        }
        Set<String> set = aVar.keySet;
        if (set == null) {
            Map<String, ?> all = aVar.e().getAll();
            Intrinsics.checkNotNullExpressionValue(all, "sharedPrefs.all");
            if (all.isEmpty()) {
                z10 = false;
            }
        } else {
            Set<String> set2 = set;
            SharedPreferences sharedPreferencesE = aVar.e();
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                z10 = false;
            } else {
                Iterator<T> it = set2.iterator();
                while (it.hasNext()) {
                    if (sharedPreferencesE.contains((String) it.next())) {
                    }
                }
                z10 = false;
            }
        }
        return gu.b.a(z10);
    }

    @Override // u3.g
    @Nullable
    public Object b(@NotNull eu.b<? super Unit> bVar) throws IOException {
        Context context;
        String str;
        SharedPreferences.Editor editorEdit = e().edit();
        Set<String> set = this.keySet;
        if (set == null) {
            editorEdit.clear();
        } else {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (e().getAll().isEmpty() && (context = this.context) != null && (str = this.name) != null) {
            d(context, str);
        }
        Set<String> set2 = this.keySet;
        if (set2 != null) {
            set2.clear();
        }
        return Unit.f21506a;
    }

    @Override // u3.g
    @Nullable
    public Object c(T t8, @NotNull eu.b<? super T> bVar) {
        return this.migrate.invoke(new w3.c(e(), this.keySet), t8, bVar);
    }

    public final void d(Context context, String name) {
        c.a(context, name);
    }

    public final SharedPreferences e() {
        return (SharedPreferences) this.sharedPrefs.getValue();
    }

    public /* synthetic */ a(Context context, String str, Set set, Function2 function2, n nVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i10 & 4) != 0 ? w3.b.a() : set, (i10 & 8) != 0 ? new C0734a(null) : function2, nVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, @NotNull String sharedPreferencesName, @NotNull Set<String> keysToMigrate, @NotNull Function2<? super T, ? super eu.b<? super Boolean>, ? extends Object> shouldRunMigration, @NotNull n<? super w3.c, ? super T, ? super eu.b<? super T>, ? extends Object> migrate) {
        this(new b(context, sharedPreferencesName), keysToMigrate, shouldRunMigration, migrate, context, sharedPreferencesName);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        Intrinsics.checkNotNullParameter(shouldRunMigration, "shouldRunMigration");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
    }
}
