package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7700p0;
import kotlin.collections.C7702q0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import mu.EnumC8666a;
import nu.C9578i0;
import nu.InterfaceC9564b0;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p256ku.C7882k;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: androidx.room.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000{\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u00017\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00140\u00132\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010#\u001a\n  *\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R \u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0014048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00105R\u0014\u00109\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00108R\u0014\u0010<\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010;R\u0014\u0010?\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010>¨\u0006@"}, m31665d2 = {"Landroidx/room/d;", "", "Landroid/content/Context;", "context", "", "name", "Landroidx/room/c;", "invalidationTracker", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroidx/room/c;)V", "Landroid/content/Intent;", "serviceIntent", "", "k", "(Landroid/content/Intent;)V", "l", "()V", "", "resolvedTableNames", "Lnu/h;", "", "h", "([Ljava/lang/String;)Lnu/h;", "j", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "Landroidx/room/c;", "i", "()Landroidx/room/c;", "kotlin.jvm.PlatformType", "c", "Landroid/content/Context;", "appContext", "Lku/p0;", "d", "Lku/p0;", "coroutineScope", "Ljava/util/concurrent/atomic/AtomicBoolean;", "e", "Ljava/util/concurrent/atomic/AtomicBoolean;", "stopped", "", "f", "I", "clientId", "Landroidx/room/b;", "g", "Landroidx/room/b;", "invalidationService", "Lnu/b0;", "Lnu/b0;", "invalidatedTables", "androidx/room/d$c", "Landroidx/room/d$c;", "observer", "Landroidx/room/a;", "Landroidx/room/a;", "invalidationCallback", "Landroid/content/ServiceConnection;", "Landroid/content/ServiceConnection;", "serviceConnection", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C1076d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C1075c invalidationTracker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final Context appContext;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7906p0 coroutineScope;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean stopped;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int clientId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public InterfaceC1074b invalidationService;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9564b0<Set<String>> invalidatedTables;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final c observer;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC1073a invalidationCallback;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final ServiceConnection serviceConnection;

    /* JADX INFO: renamed from: androidx.room.d$a */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a implements InterfaceC9575h<Set<? extends String>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC9575h f4383a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String[] f4384b;

        /* JADX INFO: renamed from: androidx.room.d$a$a, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m31665d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "<anonymous>"}, m31666k = 3, m31667mv = {2, 1, 0})
        public static final class C14087a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC9577i f4385a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String[] f4386b;

            /* JADX INFO: renamed from: androidx.room.d$a$a$a, reason: collision with other inner class name */
            @InterfaceC10344f(m39663c = "androidx.room.MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2", m39664f = "MultiInstanceInvalidationClient.android.kt", m39665l = {235}, m39666m = "emit")
            @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
            public static final class C14088a extends AbstractC10342d {

                /* JADX INFO: renamed from: t */
                public /* synthetic */ Object f4387t;

                /* JADX INFO: renamed from: u */
                public int f4388u;

                public C14088a(InterfaceC9557b interfaceC9557b) {
                    super(interfaceC9557b);
                }

                @Override // pt.AbstractC10339a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f4387t = obj;
                    this.f4388u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    return C14087a.this.emit(null, this);
                }
            }

            public C14087a(InterfaceC9577i interfaceC9577i, String[] strArr) {
                this.f4385a = interfaceC9577i;
                this.f4386b = strArr;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // nu.InterfaceC9577i
            @Nullable
            public final Object emit(Object obj, @NotNull InterfaceC9557b interfaceC9557b) {
                C14088a c14088a;
                if (interfaceC9557b instanceof C14088a) {
                    c14088a = (C14088a) interfaceC9557b;
                    int i10 = c14088a.f4388u;
                    if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                        c14088a.f4388u = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    } else {
                        c14088a = new C14088a(interfaceC9557b);
                    }
                } else {
                    c14088a = new C14088a(interfaceC9557b);
                }
                Object obj2 = c14088a.f4387t;
                Object objM38805e = C10047c.m38805e();
                int i11 = c14088a.f4388u;
                if (i11 == 0) {
                    C7348o.m30470b(obj2);
                    InterfaceC9577i interfaceC9577i = this.f4385a;
                    Set set = (Set) obj;
                    Set setM31903b = C7700p0.m31903b();
                    for (String str : this.f4386b) {
                        Iterator<T> it = set.iterator();
                        while (it.hasNext()) {
                            if (C7797x.m32294E(str, (String) it.next(), true)) {
                                setM31903b.add(str);
                            }
                        }
                    }
                    Set setM31902a = C7700p0.m31902a(setM31903b);
                    if (setM31902a.isEmpty()) {
                        setM31902a = null;
                    }
                    if (setM31902a != null) {
                        c14088a.f4388u = 1;
                        if (interfaceC9577i.emit(setM31902a, c14088a) == objM38805e) {
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

        public a(InterfaceC9575h interfaceC9575h, String[] strArr) {
            this.f4383a = interfaceC9575h;
            this.f4384b = strArr;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [nu.i, nt.b] */
        @Override // nu.InterfaceC9575h
        @Nullable
        public Object collect(@NotNull InterfaceC9577i<? super Set<? extends String>> interfaceC9577i, @NotNull InterfaceC9557b interfaceC9557b) {
            Object objCollect = this.f4383a.collect(new C14087a(interfaceC9577i, this.f4384b), interfaceC9557b);
            return objCollect == C10047c.m38805e() ? objCollect : Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: androidx.room.d$b */
    @Metadata(m31664d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"androidx/room/d$b", "Landroidx/room/a$a;", "", "", "tables", "", "A", "([Ljava/lang/String;)V", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class b extends InterfaceC1073a.a {

        /* JADX INFO: renamed from: androidx.room.d$b$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 1, 0})
        @InterfaceC10344f(m39663c = "androidx.room.MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1", m39664f = "MultiInstanceInvalidationClient.android.kt", m39665l = {87}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public Object f4391t;

            /* JADX INFO: renamed from: u */
            public int f4392u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ String[] f4393v;

            /* JADX INFO: renamed from: w */
            public final /* synthetic */ C1076d f4394w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String[] strArr, C1076d c1076d, InterfaceC9557b<? super a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f4393v = strArr;
                this.f4394w = c1076d;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f4393v, this.f4394w, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Set<String> set;
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f4392u;
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    String[] strArr = this.f4393v;
                    Set<String> setM31911g = C7702q0.m31911g(Arrays.copyOf(strArr, strArr.length));
                    InterfaceC9564b0 interfaceC9564b0 = this.f4394w.invalidatedTables;
                    this.f4391t = setM31911g;
                    this.f4392u = 1;
                    if (interfaceC9564b0.emit(setM31911g, this) == objM38805e) {
                        return objM38805e;
                    }
                    set = setM31911g;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    set = (Set) this.f4391t;
                    C7348o.m30470b(obj);
                }
                this.f4394w.getInvalidationTracker().m6120q(set);
                return Unit.f29331a;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        public b() {
        }

        @Override // androidx.room.InterfaceC1073a
        /* JADX INFO: renamed from: A */
        public void mo6097A(String[] tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            C7882k.m32780d(C1076d.this.coroutineScope, null, null, new a(tables, C1076d.this, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: androidx.room.d$c */
    @Metadata(m31664d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m31665d2 = {"androidx/room/d$c", "Landroidx/room/c$b;", "", "", "tables", "", "c", "(Ljava/util/Set;)V", "", "b", "()Z", "isRemote", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class c extends C1075c.b {
        public c(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.C1075c.b
        /* JADX INFO: renamed from: b */
        public boolean mo6129b() {
            return true;
        }

        @Override // androidx.room.C1075c.b
        /* JADX INFO: renamed from: c */
        public void mo6130c(Set<String> tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            if (C1076d.this.stopped.get()) {
                return;
            }
            try {
                InterfaceC1074b interfaceC1074b = C1076d.this.invalidationService;
                if (interfaceC1074b != null) {
                    interfaceC1074b.mo6093B0(C1076d.this.clientId, (String[]) tables.toArray(new String[0]));
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot broadcast invalidation", e10);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.room.d$d */
    @Metadata(m31664d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"androidx/room/d$d", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "name", "Landroid/os/IBinder;", NotificationCompat.CATEGORY_SERVICE, "", "onServiceConnected", "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", "onServiceDisconnected", "(Landroid/content/ComponentName;)V", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class d implements ServiceConnection {
        public d() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(service, "service");
            C1076d.this.invalidationService = InterfaceC1074b.a.m6099r2(service);
            C1076d.this.m6142j();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
            C1076d.this.invalidationService = null;
        }
    }

    public C1076d(@NotNull Context context, @NotNull String name, @NotNull C1075c invalidationTracker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(invalidationTracker, "invalidationTracker");
        this.name = name;
        this.invalidationTracker = invalidationTracker;
        this.appContext = context.getApplicationContext();
        this.coroutineScope = invalidationTracker.getDatabase().m47278s();
        this.stopped = new AtomicBoolean(true);
        this.invalidatedTables = C9578i0.m37757a(0, 0, EnumC8666a.SUSPEND);
        this.observer = new c(invalidationTracker.getTableNames());
        this.invalidationCallback = new b();
        this.serviceConnection = new d();
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final InterfaceC9575h<Set<String>> m6140h(@NotNull String[] resolvedTableNames) {
        Intrinsics.checkNotNullParameter(resolvedTableNames, "resolvedTableNames");
        return new a(this.invalidatedTables, resolvedTableNames);
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final C1075c getInvalidationTracker() {
        return this.invalidationTracker;
    }

    /* JADX INFO: renamed from: j */
    public final void m6142j() {
        try {
            InterfaceC1074b interfaceC1074b = this.invalidationService;
            if (interfaceC1074b != null) {
                this.clientId = interfaceC1074b.mo6094Y0(this.invalidationCallback, this.name);
            }
        } catch (RemoteException e10) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e10);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m6143k(@NotNull Intent serviceIntent) {
        Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
        if (this.stopped.compareAndSet(true, false)) {
            this.appContext.bindService(serviceIntent, this.serviceConnection, 1);
            this.invalidationTracker.m6112i(this.observer);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m6144l() {
        if (this.stopped.compareAndSet(false, true)) {
            this.invalidationTracker.m6124w(this.observer);
            try {
                InterfaceC1074b interfaceC1074b = this.invalidationService;
                if (interfaceC1074b != null) {
                    interfaceC1074b.mo6095n2(this.invalidationCallback, this.clientId);
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e10);
            }
            this.appContext.unbindService(this.serviceConnection);
        }
    }
}
