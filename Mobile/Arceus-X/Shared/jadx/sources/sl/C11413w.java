package sl;

import android.util.Log;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7701q;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nu.C9579j;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7347n;
import p229jt.C7348o;
import p256ku.C7857f;
import p256ku.C7864g1;
import p256ku.C7872i;
import p256ku.C7882k;
import p256ku.InterfaceC7906p0;
import p256ku.InterfaceC7934w0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.C10350l;
import pt.InterfaceC10344f;
import th.C11659h;

/* JADX INFO: renamed from: sl.w */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\f\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31665d2 = {"Lsl/w;", "", "Lsl/b;", "local", "Lsl/v;", "remote", "<init>", "(Lsl/b;Lsl/v;)V", "Ljava/io/Serializable;", "d", "(Lnt/b;)Ljava/lang/Object;", "", "c", "a", "Lsl/b;", "b", "Lsl/v;", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11413w {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC11392b local;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC11412v remote;

    /* JADX INFO: renamed from: sl.w$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)I"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.universalapp.achievement.Replicator$syncLocalToRemote$2", m39664f = "Replicator.kt", m39665l = {41, 82}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Integer>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f40332t;

        /* JADX INFO: renamed from: u */
        public Object f40333u;

        /* JADX INFO: renamed from: v */
        public int f40334v;

        /* JADX INFO: renamed from: w */
        public int f40335w;

        /* JADX INFO: renamed from: x */
        public /* synthetic */ Object f40336x;

        /* JADX INFO: renamed from: sl.w$b$a */
        @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lku/p0;", "Ljt/n;", "", "<anonymous>", "(Lku/p0;)Ljt/n;"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.roblox.universalapp.achievement.Replicator$syncLocalToRemote$2$2$1$1", m39664f = "Replicator.kt", m39665l = {54}, m39666m = "invokeSuspend", m39667v = 1)
        public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super C7347n<? extends String>>, Object> {

            /* JADX INFO: renamed from: t */
            public int f40338t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ C11413w f40339u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ Achievement f40340v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C11413w c11413w, Achievement achievement, InterfaceC9557b<? super a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f40339u = c11413w;
                this.f40340v = achievement;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f40339u, this.f40340v, interfaceC9557b);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super C7347n<? extends String>> interfaceC9557b) {
                return invoke2(interfaceC7906p0, (InterfaceC9557b<? super C7347n<String>>) interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objMo22817b;
                Object objM30460b;
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f40338t;
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    InterfaceC11412v interfaceC11412v = this.f40339u.remote;
                    Achievement achievement = this.f40340v;
                    this.f40338t = 1;
                    objMo22817b = interfaceC11412v.mo22817b(achievement, this);
                    if (objMo22817b == objM38805e) {
                        return objM38805e;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    objMo22817b = ((C7347n) obj).getValue();
                }
                Achievement achievement2 = this.f40340v;
                if (C7347n.m30466h(objMo22817b)) {
                    boolean zBooleanValue = ((Boolean) objMo22817b).booleanValue();
                    if (!zBooleanValue) {
                        Log.w("rbx.achievement.replicator", "remote grant of " + achievement2.getCodeName() + " failed");
                    }
                    if (C11659h.m43403a().mo43425D()) {
                        C11410t.f40318a.m42741n("remote", achievement2.getCodeName(), zBooleanValue);
                    }
                    String codeName = achievement2.getCodeName();
                    if (!zBooleanValue) {
                        codeName = null;
                    }
                    objM30460b = C7347n.m30460b(codeName);
                } else {
                    objM30460b = C7347n.m30460b(objMo22817b);
                }
                Achievement achievement3 = this.f40340v;
                Throwable thM30463e = C7347n.m30463e(objM30460b);
                if (thM30463e != null) {
                    Log.w("rbx.achievement.replicator", "granting " + achievement3.getCodeName() + " failed exceptionally", thM30463e);
                    objM30460b = C7347n.m30460b(null);
                }
                return C7347n.m30459a(objM30460b);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super C7347n<String>> interfaceC9557b) {
                return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX INFO: renamed from: sl.w$b$b, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C14242b implements InterfaceC9575h<List<? extends Achievement>> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC9575h f40341a;

            /* JADX INFO: renamed from: sl.w$b$b$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class a<T> implements InterfaceC9577i {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC9577i f40342a;

                /* JADX INFO: renamed from: sl.w$b$b$a$a, reason: collision with other inner class name */
                @InterfaceC10344f(m39663c = "com.roblox.universalapp.achievement.Replicator$syncLocalToRemote$2$invokeSuspend$$inlined$filter$1$2", m39664f = "Replicator.kt", m39665l = {50}, m39666m = "emit", m39667v = 1)
                @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
                public static final class C14243a extends AbstractC10342d {

                    /* JADX INFO: renamed from: A */
                    public int f40343A;

                    /* JADX INFO: renamed from: t */
                    public /* synthetic */ Object f40344t;

                    /* JADX INFO: renamed from: u */
                    public int f40345u;

                    /* JADX INFO: renamed from: v */
                    public Object f40346v;

                    /* JADX INFO: renamed from: w */
                    public Object f40347w;

                    /* JADX INFO: renamed from: y */
                    public Object f40349y;

                    /* JADX INFO: renamed from: z */
                    public Object f40350z;

                    public C14243a(InterfaceC9557b interfaceC9557b) {
                        super(interfaceC9557b);
                    }

                    @Override // pt.AbstractC10339a
                    public final Object invokeSuspend(Object obj) {
                        this.f40344t = obj;
                        this.f40345u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC9577i interfaceC9577i) {
                    this.f40342a = interfaceC9577i;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // nu.InterfaceC9577i
                public final Object emit(Object obj, InterfaceC9557b interfaceC9557b) {
                    C14243a c14243a;
                    if (interfaceC9557b instanceof C14243a) {
                        c14243a = (C14243a) interfaceC9557b;
                        int i10 = c14243a.f40345u;
                        if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                            c14243a.f40345u = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                        } else {
                            c14243a = new C14243a(interfaceC9557b);
                        }
                    } else {
                        c14243a = new C14243a(interfaceC9557b);
                    }
                    Object obj2 = c14243a.f40344t;
                    Object objM38805e = C10047c.m38805e();
                    int i11 = c14243a.f40345u;
                    if (i11 == 0) {
                        C7348o.m30470b(obj2);
                        InterfaceC9577i interfaceC9577i = this.f40342a;
                        if (!((List) obj).isEmpty()) {
                            c14243a.f40346v = C10350l.m39676a(obj);
                            c14243a.f40347w = C10350l.m39676a(c14243a);
                            c14243a.f40349y = C10350l.m39676a(obj);
                            c14243a.f40350z = C10350l.m39676a(interfaceC9577i);
                            c14243a.f40343A = 0;
                            c14243a.f40345u = 1;
                            if (interfaceC9577i.emit(obj, c14243a) == objM38805e) {
                                return objM38805e;
                            }
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7348o.m30470b(obj2);
                    }
                    return Unit.f29331a;
                }
            }

            public C14242b(InterfaceC9575h interfaceC9575h) {
                this.f40341a = interfaceC9575h;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [nu.i, nt.b] */
            @Override // nu.InterfaceC9575h
            public Object collect(InterfaceC9577i<? super List<? extends Achievement>> interfaceC9577i, InterfaceC9557b interfaceC9557b) {
                Object objCollect = this.f40341a.collect(new a(interfaceC9577i), interfaceC9557b);
                return objCollect == C10047c.m38805e() ? objCollect : Unit.f29331a;
            }
        }

        /* JADX INFO: renamed from: sl.w$b$c */
        @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class c implements InterfaceC9575h<List<? extends InterfaceC7934w0<? extends C7347n<? extends String>>>> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC9575h f40351a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ InterfaceC7906p0 f40352b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C11413w f40353c;

            /* JADX INFO: renamed from: sl.w$b$c$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class a<T> implements InterfaceC9577i {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC9577i f40354a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC7906p0 f40355b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ C11413w f40356c;

                /* JADX INFO: renamed from: sl.w$b$c$a$a, reason: collision with other inner class name */
                @InterfaceC10344f(m39663c = "com.roblox.universalapp.achievement.Replicator$syncLocalToRemote$2$invokeSuspend$$inlined$map$1$2", m39664f = "Replicator.kt", m39665l = {50}, m39666m = "emit", m39667v = 1)
                @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
                public static final class C14244a extends AbstractC10342d {

                    /* JADX INFO: renamed from: A */
                    public int f40357A;

                    /* JADX INFO: renamed from: t */
                    public /* synthetic */ Object f40358t;

                    /* JADX INFO: renamed from: u */
                    public int f40359u;

                    /* JADX INFO: renamed from: v */
                    public Object f40360v;

                    /* JADX INFO: renamed from: x */
                    public Object f40362x;

                    /* JADX INFO: renamed from: y */
                    public Object f40363y;

                    /* JADX INFO: renamed from: z */
                    public Object f40364z;

                    public C14244a(InterfaceC9557b interfaceC9557b) {
                        super(interfaceC9557b);
                    }

                    @Override // pt.AbstractC10339a
                    public final Object invokeSuspend(Object obj) {
                        this.f40358t = obj;
                        this.f40359u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC9577i interfaceC9577i, InterfaceC7906p0 interfaceC7906p0, C11413w c11413w) {
                    this.f40354a = interfaceC9577i;
                    this.f40355b = interfaceC7906p0;
                    this.f40356c = c11413w;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // nu.InterfaceC9577i
                public final Object emit(Object obj, InterfaceC9557b interfaceC9557b) {
                    C14244a c14244a;
                    if (interfaceC9557b instanceof C14244a) {
                        c14244a = (C14244a) interfaceC9557b;
                        int i10 = c14244a.f40359u;
                        if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                            c14244a.f40359u = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                        } else {
                            c14244a = new C14244a(interfaceC9557b);
                        }
                    } else {
                        c14244a = new C14244a(interfaceC9557b);
                    }
                    Object obj2 = c14244a.f40358t;
                    Object objM38805e = C10047c.m38805e();
                    int i11 = c14244a.f40359u;
                    if (i11 == 0) {
                        C7348o.m30470b(obj2);
                        InterfaceC9577i interfaceC9577i = this.f40354a;
                        List list = (List) obj;
                        Log.i("rbx.achievement.replicator", "Syncing " + list + " achievements to remote");
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(C7701q.m31905u(list2, 10));
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(C7882k.m32778b(this.f40355b, null, null, new a(this.f40356c, (Achievement) it.next(), null), 3, null));
                        }
                        c14244a.f40360v = C10350l.m39676a(obj);
                        c14244a.f40362x = C10350l.m39676a(c14244a);
                        c14244a.f40363y = C10350l.m39676a(obj);
                        c14244a.f40364z = C10350l.m39676a(interfaceC9577i);
                        c14244a.f40357A = 0;
                        c14244a.f40359u = 1;
                        if (interfaceC9577i.emit(arrayList, c14244a) == objM38805e) {
                            return objM38805e;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7348o.m30470b(obj2);
                    }
                    return Unit.f29331a;
                }
            }

            public c(InterfaceC9575h interfaceC9575h, InterfaceC7906p0 interfaceC7906p0, C11413w c11413w) {
                this.f40351a = interfaceC9575h;
                this.f40352b = interfaceC7906p0;
                this.f40353c = c11413w;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [nu.i, nt.b] */
            @Override // nu.InterfaceC9575h
            public Object collect(InterfaceC9577i<? super List<? extends InterfaceC7934w0<? extends C7347n<? extends String>>>> interfaceC9577i, InterfaceC9557b interfaceC9557b) {
                Object objCollect = this.f40351a.collect(new a(interfaceC9577i, this.f40352b, this.f40353c), interfaceC9557b);
                return objCollect == C10047c.m38805e() ? objCollect : Unit.f29331a;
            }
        }

        /* JADX INFO: renamed from: sl.w$b$d */
        @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class d implements InterfaceC9575h<C7347n<? extends Unit>> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC9575h f40365a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ InterfaceC7906p0 f40366b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C11413w f40367c;

            /* JADX INFO: renamed from: sl.w$b$d$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class a<T> implements InterfaceC9577i {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC9577i f40368a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC7906p0 f40369b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ C11413w f40370c;

                /* JADX INFO: renamed from: sl.w$b$d$a$a, reason: collision with other inner class name */
                @InterfaceC10344f(m39663c = "com.roblox.universalapp.achievement.Replicator$syncLocalToRemote$2$invokeSuspend$$inlined$map$2$2", m39664f = "Replicator.kt", m39665l = {52, 67, 50}, m39666m = "emit", m39667v = 1)
                @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
                public static final class C14245a extends AbstractC10342d {

                    /* JADX INFO: renamed from: A */
                    public Object f40371A;

                    /* JADX INFO: renamed from: B */
                    public Object f40372B;

                    /* JADX INFO: renamed from: C */
                    public Object f40373C;

                    /* JADX INFO: renamed from: D */
                    public Object f40374D;

                    /* JADX INFO: renamed from: E */
                    public Object f40375E;

                    /* JADX INFO: renamed from: F */
                    public int f40376F;

                    /* JADX INFO: renamed from: G */
                    public int f40377G;

                    /* JADX INFO: renamed from: H */
                    public int f40378H;

                    /* JADX INFO: renamed from: t */
                    public /* synthetic */ Object f40379t;

                    /* JADX INFO: renamed from: u */
                    public int f40380u;

                    /* JADX INFO: renamed from: v */
                    public Object f40381v;

                    /* JADX INFO: renamed from: x */
                    public Object f40383x;

                    /* JADX INFO: renamed from: y */
                    public Object f40384y;

                    /* JADX INFO: renamed from: z */
                    public Object f40385z;

                    public C14245a(InterfaceC9557b interfaceC9557b) {
                        super(interfaceC9557b);
                    }

                    @Override // pt.AbstractC10339a
                    public final Object invokeSuspend(Object obj) {
                        this.f40379t = obj;
                        this.f40380u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC9577i interfaceC9577i, InterfaceC7906p0 interfaceC7906p0, C11413w c11413w) {
                    this.f40368a = interfaceC9577i;
                    this.f40369b = interfaceC7906p0;
                    this.f40370c = c11413w;
                }

                /* JADX WARN: Code duplicated, block: B:51:0x01c3 A[Catch: all -> 0x006f, TryCatch #3 {all -> 0x006f, blocks: (B:18:0x006a, B:49:0x01b4, B:51:0x01c3, B:52:0x01cb), top: B:71:0x006a }] */
                /* JADX WARN: Code duplicated, block: B:59:0x01eb  */
                /* JADX WARN: Code duplicated, block: B:8:0x0018  */
                /* JADX WARN: Code restructure failed: missing block: B:61:0x0220, code lost:
                
                    if (r4.emit(r0, r6) == r2) goto L62;
                 */
                @Override // nu.InterfaceC9577i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, InterfaceC9557b interfaceC9557b) {
                    C14245a c14245a;
                    InterfaceC9577i interfaceC9577i;
                    InterfaceC7906p0 interfaceC7906p0;
                    int i10;
                    Object obj2;
                    Object obj3;
                    InterfaceC9577i interfaceC9577i2;
                    InterfaceC9557b interfaceC9557b2;
                    int i11;
                    int i12;
                    InterfaceC9577i interfaceC9577i3;
                    InterfaceC9577i interfaceC9577i4;
                    InterfaceC9557b interfaceC9557b3;
                    List list;
                    Object obj4;
                    InterfaceC9557b interfaceC9557b4;
                    Object obj5;
                    Object objM30460b;
                    Throwable thM30463e;
                    if (interfaceC9557b instanceof C14245a) {
                        c14245a = (C14245a) interfaceC9557b;
                        int i13 = c14245a.f40380u;
                        if ((i13 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                            c14245a.f40380u = i13 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                        } else {
                            c14245a = new C14245a(interfaceC9557b);
                        }
                    } else {
                        c14245a = new C14245a(interfaceC9557b);
                    }
                    C14245a c14245a2 = c14245a;
                    Object objM32632a = c14245a2.f40379t;
                    Object objM38805e = C10047c.m38805e();
                    int i14 = c14245a2.f40380u;
                    try {
                        if (i14 == 0) {
                            C7348o.m30470b(objM32632a);
                            interfaceC9577i = this.f40368a;
                            List list2 = (List) obj;
                            interfaceC7906p0 = this.f40369b;
                            i10 = 0;
                            try {
                                C7347n.Companion companion = C7347n.INSTANCE;
                                c14245a2.f40381v = C10350l.m39676a(obj);
                                c14245a2.f40383x = C10350l.m39676a(c14245a2);
                                c14245a2.f40384y = C10350l.m39676a(obj);
                                c14245a2.f40385z = C10350l.m39676a(interfaceC9577i);
                                c14245a2.f40371A = interfaceC9577i;
                                c14245a2.f40372B = C10350l.m39676a(c14245a2);
                                c14245a2.f40373C = C10350l.m39676a(list2);
                                c14245a2.f40374D = C10350l.m39676a(interfaceC7906p0);
                                c14245a2.f40376F = 0;
                                c14245a2.f40377G = 0;
                                c14245a2.f40378H = 0;
                                c14245a2.f40380u = 1;
                                objM32632a = C7857f.m32632a(list2, c14245a2);
                                if (objM32632a != objM38805e) {
                                    obj2 = obj;
                                    obj3 = obj2;
                                    i11 = 0;
                                    i12 = 0;
                                    interfaceC9577i3 = interfaceC9577i;
                                    interfaceC9577i4 = interfaceC9577i3;
                                    interfaceC9557b3 = c14245a2;
                                    list = list2;
                                    interfaceC9557b2 = interfaceC9557b3;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                obj2 = obj;
                                obj3 = obj2;
                                interfaceC9577i2 = interfaceC9577i;
                                interfaceC9557b2 = c14245a2;
                                C7347n.Companion companion2 = C7347n.INSTANCE;
                                objM30460b = C7347n.m30460b(C7348o.m30469a(th));
                                obj4 = obj3;
                                interfaceC9557b4 = interfaceC9557b2;
                                obj5 = obj2;
                            }
                            return objM38805e;
                        }
                        if (i14 == 1) {
                            i10 = c14245a2.f40378H;
                            i11 = c14245a2.f40377G;
                            int i15 = c14245a2.f40376F;
                            interfaceC7906p0 = (InterfaceC7906p0) c14245a2.f40374D;
                            List list3 = (List) c14245a2.f40373C;
                            InterfaceC9557b interfaceC9557b5 = (InterfaceC9557b) c14245a2.f40372B;
                            interfaceC9577i4 = (InterfaceC9577i) c14245a2.f40371A;
                            InterfaceC9577i interfaceC9577i5 = (InterfaceC9577i) c14245a2.f40385z;
                            obj3 = c14245a2.f40384y;
                            C14245a c14245a3 = (C14245a) c14245a2.f40383x;
                            obj2 = c14245a2.f40381v;
                            try {
                                C7348o.m30470b(objM32632a);
                                interfaceC9557b2 = c14245a3;
                                list = list3;
                                i12 = i15;
                                interfaceC9557b3 = interfaceC9557b5;
                                interfaceC9577i3 = interfaceC9577i5;
                            } catch (Throwable th3) {
                                th = th3;
                                interfaceC9557b2 = c14245a3;
                                i10 = i15;
                                interfaceC9577i2 = interfaceC9577i5;
                                interfaceC9577i = interfaceC9577i4;
                                C7347n.Companion companion3 = C7347n.INSTANCE;
                                objM30460b = C7347n.m30460b(C7348o.m30469a(th));
                                obj4 = obj3;
                                interfaceC9557b4 = interfaceC9557b2;
                                obj5 = obj2;
                                thM30463e = C7347n.m30463e(objM30460b);
                                if (thM30463e != null) {
                                    Log.w("rbx.achievement.replicator", "Unable to mark achievements synced", thM30463e);
                                }
                                C7347n c7347nM30459a = C7347n.m30459a(objM30460b);
                                c14245a2.f40381v = C10350l.m39676a(obj5);
                                c14245a2.f40383x = C10350l.m39676a(interfaceC9557b4);
                                c14245a2.f40384y = C10350l.m39676a(obj4);
                                c14245a2.f40385z = C10350l.m39676a(interfaceC9577i2);
                                c14245a2.f40371A = null;
                                c14245a2.f40372B = null;
                                c14245a2.f40373C = null;
                                c14245a2.f40374D = null;
                                c14245a2.f40375E = null;
                                c14245a2.f40376F = i10;
                                c14245a2.f40380u = 3;
                            }
                        } else if (i14 == 2) {
                            i10 = c14245a2.f40376F;
                            interfaceC9577i = (InterfaceC9577i) c14245a2.f40371A;
                            interfaceC9577i2 = (InterfaceC9577i) c14245a2.f40385z;
                            obj4 = c14245a2.f40384y;
                            interfaceC9557b4 = (C14245a) c14245a2.f40383x;
                            obj5 = c14245a2.f40381v;
                            try {
                                C7348o.m30470b(objM32632a);
                                Log.i("rbx.achievement.replicator", "All achievements marked.");
                                if (C11659h.m43403a().mo43425D()) {
                                    C11410t.f40318a.m42742o("remote", true);
                                }
                                objM30460b = C7347n.m30460b(Unit.f29331a);
                            } catch (Throwable th4) {
                                th = th4;
                                obj3 = obj4;
                                obj2 = obj5;
                                interfaceC9557b2 = interfaceC9557b4;
                                C7347n.Companion companion4 = C7347n.INSTANCE;
                                objM30460b = C7347n.m30460b(C7348o.m30469a(th));
                                obj4 = obj3;
                                interfaceC9557b4 = interfaceC9557b2;
                                obj5 = obj2;
                            }
                            thM30463e = C7347n.m30463e(objM30460b);
                            if (thM30463e != null) {
                                Log.w("rbx.achievement.replicator", "Unable to mark achievements synced", thM30463e);
                            }
                            C7347n c7347nM30459a2 = C7347n.m30459a(objM30460b);
                            c14245a2.f40381v = C10350l.m39676a(obj5);
                            c14245a2.f40383x = C10350l.m39676a(interfaceC9557b4);
                            c14245a2.f40384y = C10350l.m39676a(obj4);
                            c14245a2.f40385z = C10350l.m39676a(interfaceC9577i2);
                            c14245a2.f40371A = null;
                            c14245a2.f40372B = null;
                            c14245a2.f40373C = null;
                            c14245a2.f40374D = null;
                            c14245a2.f40375E = null;
                            c14245a2.f40376F = i10;
                            c14245a2.f40380u = 3;
                        } else {
                            if (i14 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C7348o.m30470b(objM32632a);
                        }
                        return Unit.f29331a;
                        List list4 = list;
                        ArrayList arrayList = new ArrayList();
                        Iterator<T> it = ((Iterable) objM32632a).iterator();
                        while (it.hasNext()) {
                            Object value = ((C7347n) it.next()).getValue();
                            if (C7347n.m30465g(value)) {
                                value = null;
                            }
                            Iterator<T> it2 = it;
                            String str = (String) value;
                            if (str != null) {
                                arrayList.add(str);
                            }
                            it = it2;
                        }
                        Log.i("rbx.achievement.replicator", "Marking " + arrayList.size() + " achievements synced");
                        InterfaceC11392b interfaceC11392b = this.f40370c.local;
                        c14245a2.f40381v = C10350l.m39676a(obj2);
                        c14245a2.f40383x = C10350l.m39676a(interfaceC9557b2);
                        c14245a2.f40384y = C10350l.m39676a(obj3);
                        c14245a2.f40385z = C10350l.m39676a(interfaceC9577i3);
                        c14245a2.f40371A = interfaceC9577i4;
                        c14245a2.f40372B = C10350l.m39676a(interfaceC9557b3);
                        c14245a2.f40373C = C10350l.m39676a(list4);
                        c14245a2.f40374D = C10350l.m39676a(interfaceC7906p0);
                        c14245a2.f40375E = C10350l.m39676a(arrayList);
                        c14245a2.f40376F = i12;
                        c14245a2.f40377G = i11;
                        c14245a2.f40378H = i10;
                        c14245a2.f40380u = 2;
                        if (InterfaceC11392b.m42714b(interfaceC11392b, arrayList, null, c14245a2, 2, null) != objM38805e) {
                            i10 = i12;
                            obj4 = obj3;
                            interfaceC9557b4 = interfaceC9557b2;
                            interfaceC9577i2 = interfaceC9577i3;
                            interfaceC9577i = interfaceC9577i4;
                            obj5 = obj2;
                            Log.i("rbx.achievement.replicator", "All achievements marked.");
                            if (C11659h.m43403a().mo43425D()) {
                                C11410t.f40318a.m42742o("remote", true);
                            }
                            objM30460b = C7347n.m30460b(Unit.f29331a);
                            thM30463e = C7347n.m30463e(objM30460b);
                            if (thM30463e != null) {
                                Log.w("rbx.achievement.replicator", "Unable to mark achievements synced", thM30463e);
                            }
                            C7347n c7347nM30459a3 = C7347n.m30459a(objM30460b);
                            c14245a2.f40381v = C10350l.m39676a(obj5);
                            c14245a2.f40383x = C10350l.m39676a(interfaceC9557b4);
                            c14245a2.f40384y = C10350l.m39676a(obj4);
                            c14245a2.f40385z = C10350l.m39676a(interfaceC9577i2);
                            c14245a2.f40371A = null;
                            c14245a2.f40372B = null;
                            c14245a2.f40373C = null;
                            c14245a2.f40374D = null;
                            c14245a2.f40375E = null;
                            c14245a2.f40376F = i10;
                            c14245a2.f40380u = 3;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        i10 = i12;
                        interfaceC9577i2 = interfaceC9577i3;
                        interfaceC9577i = interfaceC9577i4;
                        C7347n.Companion companion5 = C7347n.INSTANCE;
                        objM30460b = C7347n.m30460b(C7348o.m30469a(th));
                        obj4 = obj3;
                        interfaceC9557b4 = interfaceC9557b2;
                        obj5 = obj2;
                    }
                    return objM38805e;
                }
            }

            public d(InterfaceC9575h interfaceC9575h, InterfaceC7906p0 interfaceC7906p0, C11413w c11413w) {
                this.f40365a = interfaceC9575h;
                this.f40366b = interfaceC7906p0;
                this.f40367c = c11413w;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [nu.i, nt.b] */
            @Override // nu.InterfaceC9575h
            public Object collect(InterfaceC9577i<? super C7347n<? extends Unit>> interfaceC9577i, InterfaceC9557b interfaceC9557b) {
                Object objCollect = this.f40365a.collect(new a(interfaceC9577i, this.f40366b, this.f40367c), interfaceC9557b);
                return objCollect == C10047c.m38805e() ? objCollect : Unit.f29331a;
            }
        }

        public b(InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            b bVar = C11413w.this.new b(interfaceC9557b);
            bVar.f40336x = obj;
            return bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x00f5, code lost:
        
            if (nu.C9579j.m37792i(r5, r11) == r1) goto L35;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Integer num;
            InterfaceC7906p0 interfaceC7906p0 = (InterfaceC7906p0) this.f40336x;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f40335w;
            if (i10 != 0) {
                if (i10 == 1) {
                    C7348o.m30470b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                return C10340b.m39661d(Log.i("rbx.achievement.replicator", "Finished local to remote achievement sync"));
            }
            C7348o.m30470b(obj);
            Log.i("rbx.achievement.replicator", "Starting local to remote achievement sync");
            InterfaceC11392b interfaceC11392b = C11413w.this.local;
            this.f40336x = interfaceC7906p0;
            this.f40335w = 1;
            obj = interfaceC11392b.mo15952g(this);
            if (obj != objM38805e) {
            }
            return objM38805e;
            List list = (List) obj;
            List list2 = list;
            Iterator it = list2.iterator();
            if (it.hasNext()) {
                Integer numM39661d = C10340b.m39661d(((Achievement) it.next()).getId());
                while (it.hasNext()) {
                    Integer numM39661d2 = C10340b.m39661d(((Achievement) it.next()).getId());
                    if (numM39661d.compareTo(numM39661d2) < 0) {
                        numM39661d = numM39661d2;
                    }
                }
                num = numM39661d;
            } else {
                num = null;
            }
            int iIntValue = num != null ? num.intValue() : 0;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                if (((Achievement) obj2).getSyncedTs() == null) {
                    arrayList.add(obj2);
                }
            }
            d dVar = new d(new c(new C14242b(C9579j.m37766C(C9579j.m37807x(arrayList), C9579j.m37794k(C11413w.this.local.mo15948c(iIntValue)))), interfaceC7906p0, C11413w.this), interfaceC7906p0, C11413w.this);
            this.f40336x = C10350l.m39676a(interfaceC7906p0);
            this.f40332t = C10350l.m39676a(list);
            this.f40333u = C10350l.m39676a(arrayList);
            this.f40334v = iIntValue;
            this.f40335w = 2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Integer> interfaceC9557b) {
            return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: sl.w$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "Ljava/io/Serializable;", "<anonymous>", "(Lku/p0;)Ljava/io/Serializable;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.universalapp.achievement.Replicator$syncRemoteToLocal$2", m39664f = "Replicator.kt", m39665l = {25, 31}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Serializable>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f40386t;

        /* JADX INFO: renamed from: u */
        public Object f40387u;

        /* JADX INFO: renamed from: v */
        public int f40388v;

        /* JADX INFO: renamed from: w */
        public int f40389w;

        /* JADX INFO: renamed from: x */
        public int f40390x;

        /* JADX INFO: renamed from: y */
        public /* synthetic */ Object f40391y;

        public c(InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            c cVar = C11413w.this.new c(interfaceC9557b);
            cVar.f40391y = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
        
            if (r2.mo15954i(r7, r6) == r1) goto L22;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM30460b;
            Object objMo22816a;
            InterfaceC7906p0 interfaceC7906p0 = (InterfaceC7906p0) this.f40391y;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f40390x;
            try {
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    InterfaceC11412v interfaceC11412v = C11413w.this.remote;
                    this.f40391y = interfaceC7906p0;
                    this.f40390x = 1;
                    objMo22816a = interfaceC11412v.mo22816a(this);
                    if (objMo22816a != objM38805e) {
                    }
                    return objM38805e;
                }
                if (i10 == 1) {
                    C7348o.m30470b(obj);
                    objMo22816a = ((C7347n) obj).getValue();
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                objM30460b = C7347n.m30460b(Unit.f29331a);
                Throwable thM30463e = C7347n.m30463e(objM30460b);
                if (thM30463e != null) {
                    Log.w("rbx.achievement.replicator", "Unable to replicate remote achievements locally", thM30463e);
                }
                return C7347n.m30459a(objM30460b);
                C11413w c11413w = C11413w.this;
                Throwable thM30463e2 = C7347n.m30463e(objMo22816a);
                if (thM30463e2 != null) {
                    return C10340b.m39661d(Log.w("rbx.achievement.replicator", "Unable to gather remote achievements", thM30463e2));
                }
                List<RemoteAchievement> list = (List) objMo22816a;
                InterfaceC11392b interfaceC11392b = c11413w.local;
                this.f40391y = C10350l.m39676a(interfaceC7906p0);
                this.f40386t = C10350l.m39676a(list);
                this.f40387u = C10350l.m39676a(interfaceC7906p0);
                this.f40388v = 0;
                this.f40389w = 0;
                this.f40390x = 2;
            } catch (Throwable th2) {
                C7347n.Companion companion = C7347n.INSTANCE;
                objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Serializable> interfaceC9557b) {
            return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C11413w(@NotNull InterfaceC11392b local, @NotNull InterfaceC11412v remote) {
        Intrinsics.checkNotNullParameter(local, "local");
        Intrinsics.checkNotNullParameter(remote, "remote");
        this.local = local;
        this.remote = remote;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m42752c(@NotNull InterfaceC9557b<? super Integer> interfaceC9557b) {
        return C7872i.m32684g(C7864g1.m32644b(), new b(null), interfaceC9557b);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Object m42753d(@NotNull InterfaceC9557b<? super Serializable> interfaceC9557b) {
        return C7872i.m32684g(C7864g1.m32644b(), new c(null), interfaceC9557b);
    }
}
