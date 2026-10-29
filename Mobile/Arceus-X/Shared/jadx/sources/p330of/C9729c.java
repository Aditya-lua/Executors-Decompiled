package p330of;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import hu.InterfaceC6576l;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7690k0;
import kotlin.collections.C7697o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.C7756w;
import kotlin.jvm.internal.Intrinsics;
import nu.C9579j;
import nu.InterfaceC9575h;
import org.jetbrains.annotations.NotNull;
import p087du.InterfaceC4691a;
import p229jt.C7348o;
import p256ku.C7877j;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p440t3.C11480d;
import p440t3.InterfaceC11490i;
import p457u3.C11789b;
import p506w3.C12297a;
import p506w3.C12305i;
import p534x3.AbstractC12645f;
import p534x3.C12642c;
import p534x3.C12646g;
import p534x3.C12649j;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: of.c */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\u000f2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R%\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0(*\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, m31665d2 = {"Lof/c;", "", "Landroid/content/Context;", "context", "", "name", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "T", "Lx3/f$a;", "key", "defaultValue", "j", "(Lx3/f$a;Ljava/lang/Object;)Ljava/lang/Object;", "value", "Lx3/f;", "k", "(Lx3/f$a;Ljava/lang/Object;)Lx3/f;", "", "h", "()Ljava/util/Map;", "Lkotlin/Function1;", "Lx3/c;", "", "transform", "g", "(Lkotlin/jvm/functions/Function1;)Lx3/f;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Ljava/lang/ThreadLocal;", "", "c", "Ljava/lang/ThreadLocal;", "editLock", "Lt3/i;", "d", "Ldu/a;", "i", "(Landroid/content/Context;)Lt3/i;", "dataStore", "e", "Lt3/i;", "com.google.firebase-firebase-common"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C9729c {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ InterfaceC6576l<Object>[] f35381f = {C7731d0.m32008h(new C7756w(C9729c.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final ThreadLocal<Boolean> editLock;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC4691a dataStore;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC11490i<AbstractC12645f> dataStore;

    /* JADX INFO: renamed from: of.c$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "Lx3/f;", "<anonymous>", "(Lku/p0;)Lx3/f;"}, m31666k = 3, m31667mv = {2, 0, 0})
    @InterfaceC10344f(m39663c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1", m39664f = "JavaDataStorage.kt", m39665l = {220}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super AbstractC12645f>, Object> {

        /* JADX INFO: renamed from: t */
        public int f35387t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ Function1<C12642c, Unit> f35389v;

        /* JADX INFO: renamed from: of.c$a$a, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lx3/c;", "it", "", "<anonymous>", "(Lx3/c;)V"}, m31666k = 3, m31667mv = {2, 0, 0})
        @InterfaceC10344f(m39663c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1$1", m39664f = "JavaDataStorage.kt", m39665l = {}, m39666m = "invokeSuspend")
        public static final class C14219a extends AbstractC10351m implements Function2<C12642c, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f35390t;

            /* JADX INFO: renamed from: u */
            public /* synthetic */ Object f35391u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ Function1<C12642c, Unit> f35392v;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super x3.c, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C14219a(Function1<? super C12642c, Unit> function1, InterfaceC9557b<? super C14219a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f35392v = function1;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                C14219a c14219a = new C14219a(this.f35392v, interfaceC9557b);
                c14219a.f35391u = obj;
                return c14219a;
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                C10047c.m38805e();
                if (this.f35390t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                this.f35392v.invoke((C12642c) this.f35391u);
                return Unit.f29331a;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C12642c c12642c, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((C14219a) create(c12642c, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super x3.c, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super C12642c, Unit> function1, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f35389v = function1;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C9729c.this.new a(this.f35389v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f35387t;
            try {
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    if (Intrinsics.m31980c(C9729c.this.editLock.get(), C10340b.m39658a(true))) {
                        throw new IllegalStateException("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                    }
                    C9729c.this.editLock.set(C10340b.m39658a(true));
                    InterfaceC11490i interfaceC11490i = C9729c.this.dataStore;
                    C14219a c14219a = new C14219a(this.f35389v, null);
                    this.f35387t = 1;
                    obj = C12649j.m47120a(interfaceC11490i, c14219a, this);
                    if (obj == objM38805e) {
                        return objM38805e;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                AbstractC12645f abstractC12645f = (AbstractC12645f) obj;
                C9729c.this.editLock.set(C10340b.m39658a(false));
                return abstractC12645f;
            } catch (Throwable th2) {
                C9729c.this.editLock.set(C10340b.m39658a(false));
                throw th2;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super AbstractC12645f> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: of.c$b */
    @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m31665d2 = {"Lku/p0;", "", "Lx3/f$a;", "", "<anonymous>", "(Lku/p0;)Ljava/util/Map;"}, m31666k = 3, m31667mv = {2, 0, 0})
    @InterfaceC10344f(m39663c = "com.google.firebase.datastorage.JavaDataStorage$getAllSync$1", m39664f = "JavaDataStorage.kt", m39665l = {170}, m39666m = "invokeSuspend")
    public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Map<AbstractC12645f.a<?>, ? extends Object>>, Object> {

        /* JADX INFO: renamed from: t */
        public int f35393t;

        public b(InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C9729c.this.new b(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Map<AbstractC12645f.a<?>, Object> mapMo47088a;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f35393t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9575h data = C9729c.this.dataStore.getData();
                this.f35393t = 1;
                obj = C9579j.m37805v(data, this);
                if (obj == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            AbstractC12645f abstractC12645f = (AbstractC12645f) obj;
            return (abstractC12645f == null || (mapMo47088a = abstractC12645f.mo47088a()) == null) ? C7690k0.m31795j() : mapMo47088a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Map<AbstractC12645f.a<?>, ? extends Object>> interfaceC9557b) {
            return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: of.c$c */
    @Metadata(m31664d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, m31665d2 = {"T", "Lku/p0;", "<anonymous>"}, m31666k = 3, m31667mv = {2, 0, 0})
    @InterfaceC10344f(m39663c = "com.google.firebase.datastorage.JavaDataStorage$getSync$1", m39664f = "JavaDataStorage.kt", m39665l = {104}, m39666m = "invokeSuspend")
    public static final class c<T> extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super T>, Object> {

        /* JADX INFO: renamed from: t */
        public int f35395t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ AbstractC12645f.a<T> f35397v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ T f35398w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC12645f.a<T> aVar, T t8, InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f35397v = aVar;
            this.f35398w = t8;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C9729c.this.new c(this.f35397v, this.f35398w, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objMo47089b;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f35395t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9575h<T> data = C9729c.this.dataStore.getData();
                this.f35395t = 1;
                obj = C9579j.m37805v(data, this);
                if (obj == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            AbstractC12645f abstractC12645f = (AbstractC12645f) obj;
            return (abstractC12645f == null || (objMo47089b = abstractC12645f.mo47089b(this.f35397v)) == null) ? this.f35398w : objMo47089b;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super T> interfaceC9557b) {
            return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: of.c$d */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "Lx3/f;", "<anonymous>", "(Lku/p0;)Lx3/f;"}, m31666k = 3, m31667mv = {2, 0, 0})
    @InterfaceC10344f(m39663c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1", m39664f = "JavaDataStorage.kt", m39665l = {145}, m39666m = "invokeSuspend")
    public static final class d extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super AbstractC12645f>, Object> {

        /* JADX INFO: renamed from: t */
        public int f35399t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ AbstractC12645f.a<T> f35401v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ T f35402w;

        /* JADX INFO: renamed from: of.c$d$a */
        @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lx3/c;", "it", "", "<anonymous>", "(Lx3/c;)V"}, m31666k = 3, m31667mv = {2, 0, 0})
        @InterfaceC10344f(m39663c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1$1", m39664f = "JavaDataStorage.kt", m39665l = {}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function2<C12642c, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f35403t;

            /* JADX INFO: renamed from: u */
            public /* synthetic */ Object f35404u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ AbstractC12645f.a<T> f35405v;

            /* JADX INFO: renamed from: w */
            public final /* synthetic */ T f35406w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC12645f.a<T> aVar, T t8, InterfaceC9557b<? super a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f35405v = aVar;
                this.f35406w = t8;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                a aVar = new a(this.f35405v, this.f35406w, interfaceC9557b);
                aVar.f35404u = obj;
                return aVar;
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                C10047c.m38805e();
                if (this.f35403t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                ((C12642c) this.f35404u).m47094i(this.f35405v, this.f35406w);
                return Unit.f29331a;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C12642c c12642c, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((a) create(c12642c, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC12645f.a<T> aVar, T t8, InterfaceC9557b<? super d> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f35401v = aVar;
            this.f35402w = t8;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C9729c.this.new d(this.f35401v, this.f35402w, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f35399t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return obj;
            }
            C7348o.m30470b(obj);
            InterfaceC11490i interfaceC11490i = C9729c.this.dataStore;
            a aVar = new a(this.f35401v, this.f35402w, null);
            this.f35399t = 1;
            Object objM47120a = C12649j.m47120a(interfaceC11490i, aVar, this);
            return objM47120a == objM38805e ? objM38805e : objM47120a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super AbstractC12645f> interfaceC9557b) {
            return ((d) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C9729c(@NotNull Context context, @NotNull String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        this.context = context;
        this.name = name;
        this.editLock = new ThreadLocal<>();
        this.dataStore = C12297a.m45687b(name, new C11789b(new Function1() { // from class: of.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C9729c.m38492e(this.f35379a, (C11480d) obj);
            }
        }), new Function1() { // from class: of.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C9729c.m38493f(this.f35380a, (Context) obj);
            }
        }, null, 8, null);
        this.dataStore = m38496i(context);
    }

    /* JADX INFO: renamed from: e */
    public static final AbstractC12645f m38492e(C9729c c9729c, C11480d ex) {
        Intrinsics.checkNotNullParameter(ex, "ex");
        Log.w(C7731d0.m32002b(C9729c.class).mo28427g(), "CorruptionException in " + c9729c.name + " DataStore running in process " + Process.myPid(), ex);
        return C12646g.m47106a();
    }

    /* JADX INFO: renamed from: f */
    public static final List m38493f(C9729c c9729c, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C7697o.m31878d(C12305i.m45750b(it, c9729c.name, null, 4, null));
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final AbstractC12645f m38494g(@NotNull Function1<? super C12642c, Unit> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        return (AbstractC12645f) C7877j.m32694b(null, new a(transform, null), 1, null);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final Map<AbstractC12645f.a<?>, Object> m38495h() {
        return (Map) C7877j.m32694b(null, new b(null), 1, null);
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC11490i<AbstractC12645f> m38496i(Context context) {
        return (InterfaceC11490i) this.dataStore.getValue(context, f35381f[0]);
    }

    /* JADX INFO: renamed from: j */
    public final <T> T m38497j(@NotNull AbstractC12645f.a<T> key, T defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) C7877j.m32694b(null, new c(key, defaultValue, null), 1, null);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final <T> AbstractC12645f m38498k(@NotNull AbstractC12645f.a<T> key, T value) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (AbstractC12645f) C7877j.m32694b(null, new d(key, value, null), 1, null);
    }
}
