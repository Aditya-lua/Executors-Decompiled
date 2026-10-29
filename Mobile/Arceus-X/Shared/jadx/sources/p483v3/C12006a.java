package p483v3;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7746m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7342i;
import p229jt.C7348o;
import p229jt.InterfaceC7341h;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p440t3.InterfaceC11486g;
import p615zt.InterfaceC14057n;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: v3.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010#\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u001bB\u0089\u0001\b\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012$\b\u0002\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t\u0012(\u0010\u0010\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0014\u0010\u0015By\b\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012$\b\u0002\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t\u0012(\u0010\u0010\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000e¢\u0006\u0004\b\u0014\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010 R0\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010!R6\u0010\u0010\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\"R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010#R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010$R\u001b\u0010(\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u001c\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, m31665d2 = {"Lv3/a;", "T", "Lt3/g;", "Lkotlin/Function0;", "Landroid/content/SharedPreferences;", "produceSharedPreferences", "", "", "keysToMigrate", "Lkotlin/Function2;", "Lnt/b;", "", "", "shouldRunMigration", "Lkotlin/Function3;", "Lv3/c;", "migrate", "Landroid/content/Context;", "context", "name", "<init>", "(Lkotlin/jvm/functions/Function0;Ljava/util/Set;Lkotlin/jvm/functions/Function2;Lzt/n;Landroid/content/Context;Ljava/lang/String;)V", "sharedPreferencesName", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;Lkotlin/jvm/functions/Function2;Lzt/n;)V", "currentData", "b", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "c", "", "a", "(Lnt/b;)Ljava/lang/Object;", "d", "(Landroid/content/Context;Ljava/lang/String;)V", "Lkotlin/jvm/functions/Function2;", "Lzt/n;", "Landroid/content/Context;", "Ljava/lang/String;", "e", "Ljt/h;", "()Landroid/content/SharedPreferences;", "sharedPrefs", "", "f", "Ljava/util/Set;", "keySet", "datastore_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
public final class C12006a<T> implements InterfaceC11486g<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Function2<T, InterfaceC9557b<? super Boolean>, Object> shouldRunMigration;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC14057n<C12008c, T, InterfaceC9557b<? super T>, Object> migrate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final Context context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final String name;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h sharedPrefs;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public final Set<String> keySet;

    /* JADX INFO: renamed from: v3.a$a */
    @Metadata(m31664d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, m31665d2 = {"<anonymous>", "", "T", "it"}, m31666k = 3, m31667mv = {1, 8, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "androidx.datastore.migrations.SharedPreferencesMigration$3", m39664f = "SharedPreferencesMigration.android.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<T, InterfaceC9557b<? super Boolean>, Object> {

        /* JADX INFO: renamed from: t */
        public int f42542t;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @NotNull
        public final InterfaceC9557b<Unit> create(@Nullable Object obj, @NotNull InterfaceC9557b<?> interfaceC9557b) {
            return new a(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            C10047c.m38805e();
            if (this.f42542t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            return C10340b.m39658a(true);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T t8, @Nullable InterfaceC9557b<? super Boolean> interfaceC9557b) {
            return ((a) create(t8, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: v3.a$b */
    @Metadata(m31664d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"T", "Landroid/content/SharedPreferences;", "b", "()Landroid/content/SharedPreferences;"}, m31666k = 3, m31667mv = {1, 8, 0})
    public static final class b extends AbstractC7746m implements Function0<SharedPreferences> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Context f42543i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ String f42544j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, String str) {
            super(0);
            this.f42543i = context;
            this.f42544j = str;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            SharedPreferences sharedPreferences = this.f42543i.getSharedPreferences(this.f42544j, 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
            return sharedPreferences;
        }
    }

    /* JADX INFO: renamed from: v3.a$c */
    @Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"Lv3/a$c;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "name", "", "a", "(Landroid/content/Context;Ljava/lang/String;)Z", "datastore_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final c f42545a = new c();

        /* JADX INFO: renamed from: a */
        public static final boolean m44833a(@NotNull Context context, @NotNull String name) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(name, "name");
            return context.deleteSharedPreferences(name);
        }
    }

    /* JADX INFO: renamed from: v3.a$d */
    @InterfaceC10344f(m39663c = "androidx.datastore.migrations.SharedPreferencesMigration", m39664f = "SharedPreferencesMigration.android.kt", m39665l = {151}, m39666m = "shouldMigrate")
    @Metadata(m31666k = 3, m31667mv = {1, 8, 0}, m31669xi = 48)
    public static final class d extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f42546t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f42547u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C12006a<T> f42548v;

        /* JADX INFO: renamed from: w */
        public int f42549w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C12006a<T> c12006a, InterfaceC9557b<? super d> interfaceC9557b) {
            super(interfaceC9557b);
            this.f42548v = c12006a;
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42547u = obj;
            this.f42549w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return this.f42548v.mo42981b(null, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super T, ? super nt.b<? super java.lang.Boolean>, ? extends java.lang.Object> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: zt.n<? super v3.c, ? super T, ? super nt.b<? super T>, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    public C12006a(Function0<? extends SharedPreferences> function0, Set<String> set, Function2<? super T, ? super InterfaceC9557b<? super Boolean>, ? extends Object> function2, InterfaceC14057n<? super C12008c, ? super T, ? super InterfaceC9557b<? super T>, ? extends Object> interfaceC14057n, Context context, String str) {
        this.shouldRunMigration = function2;
        this.migrate = interfaceC14057n;
        this.context = context;
        this.name = str;
        this.sharedPrefs = C7342i.m30456b(function0);
        this.keySet = set == C12007b.m44834a() ? null : CollectionsKt.m31690P0(set);
    }

    @Override // p440t3.InterfaceC11486g
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo42980a(@NotNull InterfaceC9557b<? super Unit> interfaceC9557b) throws IOException {
        Context context;
        String str;
        SharedPreferences.Editor editorEdit = m44830e().edit();
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
        if (m44830e().getAll().isEmpty() && (context = this.context) != null && (str = this.name) != null) {
            m44829d(context, str);
        }
        Set<String> set2 = this.keySet;
        if (set2 != null) {
            set2.clear();
        }
        return Unit.f29331a;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p440t3.InterfaceC11486g
    @Nullable
    /* JADX INFO: renamed from: b */
    public Object mo42981b(T t8, @NotNull InterfaceC9557b<? super Boolean> interfaceC9557b) {
        d dVar;
        C12006a<T> c12006a;
        if (interfaceC9557b instanceof d) {
            dVar = (d) interfaceC9557b;
            int i10 = dVar.f42549w;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                dVar.f42549w = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                dVar = new d(this, interfaceC9557b);
            }
        } else {
            dVar = new d(this, interfaceC9557b);
        }
        Object objInvoke = dVar.f42547u;
        Object objM38805e = C10047c.m38805e();
        int i11 = dVar.f42549w;
        boolean z10 = true;
        if (i11 == 0) {
            C7348o.m30470b(objInvoke);
            Function2<T, InterfaceC9557b<? super Boolean>, Object> function2 = this.shouldRunMigration;
            dVar.f42546t = this;
            dVar.f42549w = 1;
            objInvoke = function2.invoke(t8, dVar);
            if (objInvoke == objM38805e) {
                return objM38805e;
            }
            c12006a = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c12006a = (C12006a) dVar.f42546t;
            C7348o.m30470b(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return C10340b.m39658a(false);
        }
        Set<String> set = c12006a.keySet;
        if (set == null) {
            Map<String, ?> all = c12006a.m44830e().getAll();
            Intrinsics.checkNotNullExpressionValue(all, "sharedPrefs.all");
            if (all.isEmpty()) {
                z10 = false;
            }
        } else {
            Set<String> set2 = set;
            SharedPreferences sharedPreferencesM44830e = c12006a.m44830e();
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                z10 = false;
            } else {
                Iterator<T> it = set2.iterator();
                while (it.hasNext()) {
                    if (sharedPreferencesM44830e.contains((String) it.next())) {
                    }
                }
                z10 = false;
            }
        }
        return C10340b.m39658a(z10);
    }

    @Override // p440t3.InterfaceC11486g
    @Nullable
    /* JADX INFO: renamed from: c */
    public Object mo42982c(T t8, @NotNull InterfaceC9557b<? super T> interfaceC9557b) {
        return this.migrate.invoke(new C12008c(m44830e(), this.keySet), t8, interfaceC9557b);
    }

    /* JADX INFO: renamed from: d */
    public final void m44829d(Context context, String name) {
        c.m44833a(context, name);
    }

    /* JADX INFO: renamed from: e */
    public final SharedPreferences m44830e() {
        return (SharedPreferences) this.sharedPrefs.getValue();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
      (r7v0 android.content.Context)
      (r8v0 java.lang.String)
      (wrap java.util.Set:0x0008: TERNARY null = ((wrap int:0x0000: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap java.util.Set:0x0004: INVOKE  STATIC call: v3.b.a():java.util.Set A[MD:():java.util.Set<java.lang.String> (m), WRAPPED] (LINE:10)) : (r9v0 java.util.Set))
      (wrap kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap int:0x0009: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap kotlin.jvm.functions.Function2:0x0010: CONSTRUCTOR (null nt.b) A[MD:(nt.b<? super v3.a$a>):void (m), WRAPPED] (LINE:11) call: v3.a.a.<init>(nt.b):void type: CONSTRUCTOR) : (r10v0 kotlin.jvm.functions.Function2))
      (r11v0 zt.n)
     A[MD:(android.content.Context, java.lang.String, java.util.Set<java.lang.String>, kotlin.jvm.functions.Function2<? super T, ? super nt.b<? super java.lang.Boolean>, ? extends java.lang.Object>, zt.n<? super v3.c, ? super T, ? super nt.b<? super T>, ? extends java.lang.Object>):void (m)] (LINE:12) call: v3.a.<init>(android.content.Context, java.lang.String, java.util.Set, kotlin.jvm.functions.Function2, zt.n):void type: THIS */
    public /* synthetic */ C12006a(Context context, String str, Set set, Function2 function2, InterfaceC14057n interfaceC14057n, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i10 & 4) != 0 ? C12007b.m44834a() : set, (i10 & 8) != 0 ? new a(null) : function2, interfaceC14057n);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12006a(@NotNull Context context, @NotNull String sharedPreferencesName, @NotNull Set<String> keysToMigrate, @NotNull Function2<? super T, ? super InterfaceC9557b<? super Boolean>, ? extends Object> shouldRunMigration, @NotNull InterfaceC14057n<? super C12008c, ? super T, ? super InterfaceC9557b<? super T>, ? extends Object> migrate) {
        this(new b(context, sharedPreferencesName), keysToMigrate, shouldRunMigration, migrate, context, sharedPreferencesName);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        Intrinsics.checkNotNullParameter(shouldRunMigration, "shouldRunMigration");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
    }
}
