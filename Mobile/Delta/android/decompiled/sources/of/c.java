package of;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import fu.l;
import gt.o;
import iu.p0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.k0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.w;
import lu.h;
import nt.m;
import org.jetbrains.annotations.NotNull;
import t3.i;
import x3.f;
import x3.g;
import x3.j;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\u000f2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R%\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0(*\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lof/c;", "", "Landroid/content/Context;", "context", "", "name", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "T", "Lx3/f$a;", "key", "defaultValue", "j", "(Lx3/f$a;Ljava/lang/Object;)Ljava/lang/Object;", "value", "Lx3/f;", "k", "(Lx3/f$a;Ljava/lang/Object;)Lx3/f;", "", "h", "()Ljava/util/Map;", "Lkotlin/Function1;", "Lx3/c;", "", "transform", "g", "(Lkotlin/jvm/functions/Function1;)Lx3/f;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Ljava/lang/ThreadLocal;", "", "c", "Ljava/lang/ThreadLocal;", "editLock", "Lt3/i;", "d", "Lbu/a;", "i", "(Landroid/content/Context;)Lt3/i;", "dataStore", "e", "Lt3/i;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ l<Object>[] f27863f = {d0.h(new w(c.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

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
    public final bu.a dataStore;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final i<f> dataStore;

    @nt.f(c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1", f = "JavaDataStorage.kt", l = {220}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "Lx3/f;", "<anonymous>", "(Liu/p0;)Lx3/f;"}, k = 3, mv = {2, 0, 0})
    public static final class a extends m implements Function2<p0, lt.b<? super f>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f27868t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Function1<x3.c, Unit> f27870v;

        /* JADX INFO: renamed from: of.c$a$a, reason: collision with other inner class name */
        @nt.f(c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1$1", f = "JavaDataStorage.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx3/c;", "it", "", "<anonymous>", "(Lx3/c;)V"}, k = 3, mv = {2, 0, 0})
        public static final class C0483a extends m implements Function2<x3.c, lt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f27871t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f27872u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Function1<x3.c, Unit> f27873v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0483a(Function1<? super x3.c, Unit> function1, lt.b<? super C0483a> bVar) {
                super(2, bVar);
                this.f27873v = function1;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                C0483a c0483a = new C0483a(this.f27873v, bVar);
                c0483a.f27872u = obj;
                return c0483a;
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                mt.c.e();
                if (this.f27871t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                this.f27873v.invoke((x3.c) this.f27872u);
                return Unit.f22938a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(x3.c cVar, lt.b<? super Unit> bVar) {
                return ((C0483a) create(cVar, bVar)).invokeSuspend(Unit.f22938a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super x3.c, Unit> function1, lt.b<? super a> bVar) {
            super(2, bVar);
            this.f27870v = function1;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return c.this.new a(this.f27870v, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super f> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f27868t;
            try {
                if (i10 == 0) {
                    o.b(obj);
                    if (Intrinsics.c(c.this.editLock.get(), nt.b.a(true))) {
                        throw new IllegalStateException("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                    }
                    c.this.editLock.set(nt.b.a(true));
                    i iVar = c.this.dataStore;
                    C0483a c0483a = new C0483a(this.f27870v, null);
                    this.f27868t = 1;
                    obj = j.a(iVar, c0483a, this);
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
                c.this.editLock.set(nt.b.a(false));
                return fVar;
            } catch (Throwable th2) {
                c.this.editLock.set(nt.b.a(false));
                throw th2;
            }
        }
    }

    @nt.f(c = "com.google.firebase.datastorage.JavaDataStorage$getAllSync$1", f = "JavaDataStorage.kt", l = {170}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Liu/p0;", "", "Lx3/f$a;", "", "<anonymous>", "(Liu/p0;)Ljava/util/Map;"}, k = 3, mv = {2, 0, 0})
    public static final class b extends m implements Function2<p0, lt.b<? super Map<f.a<?>, ? extends Object>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f27874t;

        public b(lt.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return c.this.new b(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Map<f.a<?>, ? extends Object>> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Map<f.a<?>, Object> mapA;
            Object objE = mt.c.e();
            int i10 = this.f27874t;
            if (i10 == 0) {
                o.b(obj);
                h data = c.this.dataStore.getData();
                this.f27874t = 1;
                obj = lu.j.v(data, this);
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
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: of.c$c, reason: collision with other inner class name */
    @nt.f(c = "com.google.firebase.datastorage.JavaDataStorage$getSync$1", f = "JavaDataStorage.kt", l = {104}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Liu/p0;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class C0484c<T> extends m implements Function2<p0, lt.b<? super T>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f27876t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ f.a<T> f27878v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ T f27879w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0484c(f.a<T> aVar, T t8, lt.b<? super C0484c> bVar) {
            super(2, bVar);
            this.f27878v = aVar;
            this.f27879w = t8;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return c.this.new C0484c(this.f27878v, this.f27879w, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super T> bVar) {
            return ((C0484c) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objE = mt.c.e();
            int i10 = this.f27876t;
            if (i10 == 0) {
                o.b(obj);
                h<T> data = c.this.dataStore.getData();
                this.f27876t = 1;
                obj = lu.j.v(data, this);
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
            return (fVar == null || (objB = fVar.b(this.f27878v)) == null) ? this.f27879w : objB;
        }
    }

    @nt.f(c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1", f = "JavaDataStorage.kt", l = {145}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "Lx3/f;", "<anonymous>", "(Liu/p0;)Lx3/f;"}, k = 3, mv = {2, 0, 0})
    public static final class d extends m implements Function2<p0, lt.b<? super f>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f27880t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ f.a<T> f27882v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ T f27883w;

        @nt.f(c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1$1", f = "JavaDataStorage.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx3/c;", "it", "", "<anonymous>", "(Lx3/c;)V"}, k = 3, mv = {2, 0, 0})
        public static final class a extends m implements Function2<x3.c, lt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f27884t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f27885u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ f.a<T> f27886v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ T f27887w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f.a<T> aVar, T t8, lt.b<? super a> bVar) {
                super(2, bVar);
                this.f27886v = aVar;
                this.f27887w = t8;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                a aVar = new a(this.f27886v, this.f27887w, bVar);
                aVar.f27885u = obj;
                return aVar;
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                mt.c.e();
                if (this.f27884t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                ((x3.c) this.f27885u).i(this.f27886v, this.f27887w);
                return Unit.f22938a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(x3.c cVar, lt.b<? super Unit> bVar) {
                return ((a) create(cVar, bVar)).invokeSuspend(Unit.f22938a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f.a<T> aVar, T t8, lt.b<? super d> bVar) {
            super(2, bVar);
            this.f27882v = aVar;
            this.f27883w = t8;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return c.this.new d(this.f27882v, this.f27883w, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super f> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f27880t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            i iVar = c.this.dataStore;
            a aVar = new a(this.f27882v, this.f27883w, null);
            this.f27880t = 1;
            Object objA = j.a(iVar, aVar, this);
            return objA == objE ? objE : objA;
        }
    }

    public c(@NotNull Context context, @NotNull String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        this.context = context;
        this.name = name;
        this.editLock = new ThreadLocal<>();
        this.dataStore = w3.a.b(name, new u3.b(new Function1() { // from class: of.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c.e(this.f27861a, (t3.d) obj);
            }
        }), new Function1() { // from class: of.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c.f(this.f27862a, (Context) obj);
            }
        }, null, 8, null);
        this.dataStore = i(context);
    }

    public static final f e(c cVar, t3.d ex) {
        Intrinsics.checkNotNullParameter(ex, "ex");
        Log.w(d0.b(c.class).h(), "CorruptionException in " + cVar.name + " DataStore running in process " + Process.myPid(), ex);
        return g.a();
    }

    public static final List f(c cVar, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return kotlin.collections.o.d(w3.i.b(it, cVar.name, null, 4, null));
    }

    @NotNull
    public final f g(@NotNull Function1<? super x3.c, Unit> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        return (f) iu.j.b(null, new a(transform, null), 1, null);
    }

    @NotNull
    public final Map<f.a<?>, Object> h() {
        return (Map) iu.j.b(null, new b(null), 1, null);
    }

    public final i<f> i(Context context) {
        return (i) this.dataStore.getValue(context, f27863f[0]);
    }

    public final <T> T j(@NotNull f.a<T> key, T defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) iu.j.b(null, new C0484c(key, defaultValue, null), 1, null);
    }

    @NotNull
    public final <T> f k(@NotNull f.a<T> key, T value) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (f) iu.j.b(null, new d(key, value, null), 1, null);
    }
}
