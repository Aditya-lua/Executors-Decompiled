package nf;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import hu.l;
import java.util.List;
import java.util.Map;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.k0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.w;
import ku.p0;
import nu.h;
import org.jetbrains.annotations.NotNull;
import pt.m;
import t3.i;
import x3.f;
import x3.g;
import x3.j;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\u000f2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R%\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0(*\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lnf/c;", "", "Landroid/content/Context;", "context", "", "name", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "T", "Lx3/f$a;", "key", "defaultValue", "j", "(Lx3/f$a;Ljava/lang/Object;)Ljava/lang/Object;", "value", "Lx3/f;", "k", "(Lx3/f$a;Ljava/lang/Object;)Lx3/f;", "", "h", "()Ljava/util/Map;", "Lkotlin/Function1;", "Lx3/c;", "", "transform", "g", "(Lkotlin/jvm/functions/Function1;)Lx3/f;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Ljava/lang/ThreadLocal;", "", "c", "Ljava/lang/ThreadLocal;", "editLock", "Lt3/i;", "d", "Ldu/a;", "i", "(Landroid/content/Context;)Lt3/i;", "dataStore", "e", "Lt3/i;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ l<Object>[] f26236f = {d0.h(new w(c.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ThreadLocal<Boolean> editLock;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final du.a dataStore;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final i<f> dataStore;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "Lx3/f;", "<anonymous>", "(Lku/p0;)Lx3/f;"}, k = 3, mv = {2, 0, 0})
    @pt.f(c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1", f = "JavaDataStorage.kt", l = {220}, m = "invokeSuspend")
    public static final class a extends m implements Function2<p0, nt.b<? super f>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f26241t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Function1<x3.c, Unit> f26243v;

        /* JADX INFO: renamed from: nf.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx3/c;", "it", "", "<anonymous>", "(Lx3/c;)V"}, k = 3, mv = {2, 0, 0})
        @pt.f(c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1$1", f = "JavaDataStorage.kt", l = {}, m = "invokeSuspend")
        public static final class C0441a extends m implements Function2<x3.c, nt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f26244t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f26245u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Function1<x3.c, Unit> f26246v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0441a(Function1<? super x3.c, Unit> function1, nt.b<? super C0441a> bVar) {
                super(2, bVar);
                this.f26246v = function1;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                C0441a c0441a = new C0441a(this.f26246v, bVar);
                c0441a.f26245u = obj;
                return c0441a;
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                ot.c.e();
                if (this.f26244t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                this.f26246v.invoke((x3.c) this.f26245u);
                return Unit.f22483a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(x3.c cVar, nt.b<? super Unit> bVar) {
                return ((C0441a) create(cVar, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super x3.c, Unit> function1, nt.b<? super a> bVar) {
            super(2, bVar);
            this.f26243v = function1;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return c.this.new a(this.f26243v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f26241t;
            try {
                if (i10 == 0) {
                    o.b(obj);
                    if (Intrinsics.c(c.this.editLock.get(), pt.b.a(true))) {
                        throw new IllegalStateException("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                    }
                    c.this.editLock.set(pt.b.a(true));
                    i iVar = c.this.dataStore;
                    C0441a c0441a = new C0441a(this.f26243v, null);
                    this.f26241t = 1;
                    obj = j.a(iVar, c0441a, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                f fVar = (f) obj;
                c.this.editLock.set(pt.b.a(false));
                return fVar;
            } catch (Throwable th2) {
                c.this.editLock.set(pt.b.a(false));
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super f> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lku/p0;", "", "Lx3/f$a;", "", "<anonymous>", "(Lku/p0;)Ljava/util/Map;"}, k = 3, mv = {2, 0, 0})
    @pt.f(c = "com.google.firebase.datastorage.JavaDataStorage$getAllSync$1", f = "JavaDataStorage.kt", l = {170}, m = "invokeSuspend")
    public static final class b extends m implements Function2<p0, nt.b<? super Map<f.a<?>, ? extends Object>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f26247t;

        public b(nt.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return c.this.new b(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Map<f.a<?>, Object> mapA;
            Object objE = ot.c.e();
            int i10 = this.f26247t;
            if (i10 == 0) {
                o.b(obj);
                h data = c.this.dataStore.getData();
                this.f26247t = 1;
                obj = nu.j.v(data, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            f fVar = (f) obj;
            return (fVar == null || (mapA = fVar.a()) == null) ? k0.j() : mapA;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Map<f.a<?>, ? extends Object>> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: nf.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lku/p0;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @pt.f(c = "com.google.firebase.datastorage.JavaDataStorage$getSync$1", f = "JavaDataStorage.kt", l = {104}, m = "invokeSuspend")
    public static final class C0442c<T> extends m implements Function2<p0, nt.b<? super T>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f26249t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ f.a<T> f26251v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ T f26252w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0442c(f.a<T> aVar, T t8, nt.b<? super C0442c> bVar) {
            super(2, bVar);
            this.f26251v = aVar;
            this.f26252w = t8;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return c.this.new C0442c(this.f26251v, this.f26252w, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objE = ot.c.e();
            int i10 = this.f26249t;
            if (i10 == 0) {
                o.b(obj);
                h<T> data = c.this.dataStore.getData();
                this.f26249t = 1;
                obj = nu.j.v(data, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            f fVar = (f) obj;
            return (fVar == null || (objB = fVar.b(this.f26251v)) == null) ? this.f26252w : objB;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super T> bVar) {
            return ((C0442c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "Lx3/f;", "<anonymous>", "(Lku/p0;)Lx3/f;"}, k = 3, mv = {2, 0, 0})
    @pt.f(c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1", f = "JavaDataStorage.kt", l = {145}, m = "invokeSuspend")
    public static final class d extends m implements Function2<p0, nt.b<? super f>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f26253t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ f.a<T> f26255v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ T f26256w;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx3/c;", "it", "", "<anonymous>", "(Lx3/c;)V"}, k = 3, mv = {2, 0, 0})
        @pt.f(c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1$1", f = "JavaDataStorage.kt", l = {}, m = "invokeSuspend")
        public static final class a extends m implements Function2<x3.c, nt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f26257t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f26258u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ f.a<T> f26259v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ T f26260w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f.a<T> aVar, T t8, nt.b<? super a> bVar) {
                super(2, bVar);
                this.f26259v = aVar;
                this.f26260w = t8;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                a aVar = new a(this.f26259v, this.f26260w, bVar);
                aVar.f26258u = obj;
                return aVar;
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                ot.c.e();
                if (this.f26257t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                ((x3.c) this.f26258u).i(this.f26259v, this.f26260w);
                return Unit.f22483a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(x3.c cVar, nt.b<? super Unit> bVar) {
                return ((a) create(cVar, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f.a<T> aVar, T t8, nt.b<? super d> bVar) {
            super(2, bVar);
            this.f26255v = aVar;
            this.f26256w = t8;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return c.this.new d(this.f26255v, this.f26256w, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f26253t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            i iVar = c.this.dataStore;
            a aVar = new a(this.f26255v, this.f26256w, null);
            this.f26253t = 1;
            Object objA = j.a(iVar, aVar, this);
            return objA == objE ? objE : objA;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super f> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public c(@NotNull Context context, @NotNull String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        this.context = context;
        this.name = name;
        this.editLock = new ThreadLocal<>();
        this.dataStore = w3.a.b(name, new u3.b(new Function1() { // from class: nf.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c.e(this.f26234a, (t3.d) obj);
            }
        }), new Function1() { // from class: nf.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c.f(this.f26235a, (Context) obj);
            }
        }, null, 8, null);
        this.dataStore = i(context);
    }

    public static final f e(c cVar, t3.d ex) {
        Intrinsics.checkNotNullParameter(ex, "ex");
        Log.w(d0.b(c.class).g(), "CorruptionException in " + cVar.name + " DataStore running in process " + Process.myPid(), ex);
        return g.a();
    }

    public static final List f(c cVar, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return kotlin.collections.o.d(w3.i.b(it, cVar.name, null, 4, null));
    }

    @NotNull
    public final f g(@NotNull Function1<? super x3.c, Unit> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        return (f) ku.j.b(null, new a(transform, null), 1, null);
    }

    @NotNull
    public final Map<f.a<?>, Object> h() {
        return (Map) ku.j.b(null, new b(null), 1, null);
    }

    public final i<f> i(Context context) {
        return (i) this.dataStore.getValue(context, f26236f[0]);
    }

    public final <T> T j(@NotNull f.a<T> key, T defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) ku.j.b(null, new C0442c(key, defaultValue, null), 1, null);
    }

    @NotNull
    public final <T> f k(@NotNull f.a<T> key, T value) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (f) ku.j.b(null, new d(key, value, null), 1, null);
    }
}
