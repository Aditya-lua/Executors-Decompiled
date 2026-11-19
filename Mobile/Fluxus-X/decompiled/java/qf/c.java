package qf;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import av.p0;
import com.github.luben.zstd.BuildConfig;
import dv.h;
import gu.m;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.k0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.jvm.internal.d0;
import p001kotlin.jvm.internal.w;
import u3.i;
import xu.l;
import y3.f;
import y3.g;
import y3.j;
import zt.o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\u000f2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R%\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0(*\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lqf/c;", BuildConfig.FLAVOR, "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "name", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "T", "Ly3/f$a;", "key", "defaultValue", "j", "(Ly3/f$a;Ljava/lang/Object;)Ljava/lang/Object;", "value", "Ly3/f;", "k", "(Ly3/f$a;Ljava/lang/Object;)Ly3/f;", BuildConfig.FLAVOR, "h", "()Ljava/util/Map;", "Lkotlin/Function1;", "Ly3/c;", BuildConfig.FLAVOR, "transform", "g", "(Lkotlin/jvm/functions/Function1;)Ly3/f;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Ljava/lang/ThreadLocal;", BuildConfig.FLAVOR, "c", "Ljava/lang/ThreadLocal;", "editLock", "Lu3/i;", "d", "Ltu/a;", "i", "(Landroid/content/Context;)Lu3/i;", "dataStore", "e", "Lu3/i;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ l<Object>[] f29994f = {d0.h(new w(c.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

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
    public final tu.a dataStore;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final i<f> dataStore;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", "Ly3/f;", "<anonymous>", "(Lav/p0;)Ly3/f;"}, k = 3, mv = {2, 0, 0})
    @gu.f(c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1", f = "JavaDataStorage.kt", l = {220}, m = "invokeSuspend")
    public static final class a extends m implements Function2<p0, eu.b<? super f>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f29999t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Function1<y3.c, Unit> f30001v;

        /* JADX INFO: renamed from: qf.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly3/c;", "it", BuildConfig.FLAVOR, "<anonymous>", "(Ly3/c;)V"}, k = 3, mv = {2, 0, 0})
        @gu.f(c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1$1", f = "JavaDataStorage.kt", l = {}, m = "invokeSuspend")
        public static final class C0585a extends m implements Function2<y3.c, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f30002t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f30003u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Function1<y3.c, Unit> f30004v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0585a(Function1<? super y3.c, Unit> function1, eu.b<? super C0585a> bVar) {
                super(2, bVar);
                this.f30004v = function1;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                C0585a c0585a = new C0585a(this.f30004v, bVar);
                c0585a.f30003u = obj;
                return c0585a;
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                fu.c.e();
                if (this.f30002t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                this.f30004v.invoke((y3.c) this.f30003u);
                return Unit.f21506a;
            }

            @Override // p001kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(y3.c cVar, eu.b<? super Unit> bVar) {
                return ((C0585a) create(cVar, bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super y3.c, Unit> function1, eu.b<? super a> bVar) {
            super(2, bVar);
            this.f30001v = function1;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return c.this.new a(this.f30001v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super f> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f29999t;
            try {
                if (i10 == 0) {
                    o.b(obj);
                    if (Intrinsics.c(c.this.editLock.get(), gu.b.a(true))) {
                        throw new IllegalStateException("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                    }
                    c.this.editLock.set(gu.b.a(true));
                    i iVar = c.this.dataStore;
                    C0585a c0585a = new C0585a(this.f30001v, null);
                    this.f29999t = 1;
                    obj = j.a(iVar, c0585a, this);
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
                c.this.editLock.set(gu.b.a(false));
                return fVar;
            } catch (Throwable th2) {
                c.this.editLock.set(gu.b.a(false));
                throw th2;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "Ly3/f$a;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)Ljava/util/Map;"}, k = 3, mv = {2, 0, 0})
    @gu.f(c = "com.google.firebase.datastorage.JavaDataStorage$getAllSync$1", f = "JavaDataStorage.kt", l = {170}, m = "invokeSuspend")
    public static final class b extends m implements Function2<p0, eu.b<? super Map<f.a<?>, ? extends Object>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f30005t;

        public b(eu.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return c.this.new b(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Map<f.a<?>, ? extends Object>> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Map<f.a<?>, Object> mapA;
            Object objE = fu.c.e();
            int i10 = this.f30005t;
            if (i10 == 0) {
                o.b(obj);
                h data = c.this.dataStore.getData();
                this.f30005t = 1;
                obj = dv.j.v(data, this);
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
    /* JADX INFO: renamed from: qf.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lav/p0;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @gu.f(c = "com.google.firebase.datastorage.JavaDataStorage$getSync$1", f = "JavaDataStorage.kt", l = {104}, m = "invokeSuspend")
    public static final class C0586c<T> extends m implements Function2<p0, eu.b<? super T>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f30007t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ f.a<T> f30009v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ T f30010w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0586c(f.a<T> aVar, T t8, eu.b<? super C0586c> bVar) {
            super(2, bVar);
            this.f30009v = aVar;
            this.f30010w = t8;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return c.this.new C0586c(this.f30009v, this.f30010w, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super T> bVar) {
            return ((C0586c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objE = fu.c.e();
            int i10 = this.f30007t;
            if (i10 == 0) {
                o.b(obj);
                h<T> data = c.this.dataStore.getData();
                this.f30007t = 1;
                obj = dv.j.v(data, this);
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
            return (fVar == null || (objB = fVar.b(this.f30009v)) == null) ? this.f30010w : objB;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", "Ly3/f;", "<anonymous>", "(Lav/p0;)Ly3/f;"}, k = 3, mv = {2, 0, 0})
    @gu.f(c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1", f = "JavaDataStorage.kt", l = {145}, m = "invokeSuspend")
    public static final class d extends m implements Function2<p0, eu.b<? super f>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f30011t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ f.a<T> f30013v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ T f30014w;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly3/c;", "it", BuildConfig.FLAVOR, "<anonymous>", "(Ly3/c;)V"}, k = 3, mv = {2, 0, 0})
        @gu.f(c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1$1", f = "JavaDataStorage.kt", l = {}, m = "invokeSuspend")
        public static final class a extends m implements Function2<y3.c, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f30015t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f30016u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ f.a<T> f30017v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ T f30018w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f.a<T> aVar, T t8, eu.b<? super a> bVar) {
                super(2, bVar);
                this.f30017v = aVar;
                this.f30018w = t8;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                a aVar = new a(this.f30017v, this.f30018w, bVar);
                aVar.f30016u = obj;
                return aVar;
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                fu.c.e();
                if (this.f30015t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                ((y3.c) this.f30016u).i(this.f30017v, this.f30018w);
                return Unit.f21506a;
            }

            @Override // p001kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(y3.c cVar, eu.b<? super Unit> bVar) {
                return ((a) create(cVar, bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f.a<T> aVar, T t8, eu.b<? super d> bVar) {
            super(2, bVar);
            this.f30013v = aVar;
            this.f30014w = t8;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return c.this.new d(this.f30013v, this.f30014w, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super f> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f30011t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            i iVar = c.this.dataStore;
            a aVar = new a(this.f30013v, this.f30014w, null);
            this.f30011t = 1;
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
        this.dataStore = x3.a.b(name, new v3.b(new Function1() { // from class: qf.a
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c.e(this.f29992a, (u3.d) obj);
            }
        }), new Function1() { // from class: qf.b
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c.f(this.f29993a, (Context) obj);
            }
        }, null, 8, null);
        this.dataStore = i(context);
    }

    public static final f e(c cVar, u3.d ex) {
        Intrinsics.checkNotNullParameter(ex, "ex");
        Log.w(d0.b(c.class).h(), "CorruptionException in " + cVar.name + " DataStore running in process " + Process.myPid(), ex);
        return g.a();
    }

    public static final List f(c cVar, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return p001kotlin.collections.o.d(x3.i.b(it, cVar.name, null, 4, null));
    }

    @NotNull
    public final f g(@NotNull Function1<? super y3.c, Unit> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        return (f) av.j.b(null, new a(transform, null), 1, null);
    }

    @NotNull
    public final Map<f.a<?>, Object> h() {
        return (Map) av.j.b(null, new b(null), 1, null);
    }

    public final i<f> i(Context context) {
        return (i) this.dataStore.getValue(context, f29994f[0]);
    }

    public final <T> T j(@NotNull f.a<T> key, T defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) av.j.b(null, new C0586c(key, defaultValue, null), 1, null);
    }

    @NotNull
    public final <T> f k(@NotNull f.a<T> key, T value) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (f) av.j.b(null, new d(key, value, null), 1, null);
    }
}
