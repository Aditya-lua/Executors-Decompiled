package mk;

import android.content.Context;
import android.content.res.AssetManager;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.roblox.client.RobloxApplication;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7699p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ne.C9420f0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151gk.C6124q;
import p229jt.C7342i;
import p229jt.C7347n;
import p229jt.C7348o;
import p229jt.InterfaceC7341h;
import p256ku.AbstractC7888l0;
import p256ku.AbstractC7923t1;
import p256ku.C7864g1;
import p256ku.C7872i;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.C7931v1;
import p256ku.C7948z2;
import p256ku.EnumC7914r0;
import p256ku.InterfaceC7906p0;
import p256ku.InterfaceC7934w0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p364pu.C10354c;
import p477ut.C11958c;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.C10350l;
import pt.InterfaceC10344f;
import th.C11659h;

/* JADX INFO: renamed from: mk.c */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 C2\u00020\u0001:\u00015B/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u001c\u0010\u0019J\u0018\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001dH\u0082@¢\u0006\u0004\b\u001f\u0010 J'\u0010%\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u001dH\u0002¢\u0006\u0004\b%\u0010&J'\u0010'\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u001dH\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010,\u001a\u00020\u00152\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)H\u0002¢\u0006\u0004\b,\u0010-J+\u00103\u001a\u000200*\u00020)2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u000200H\u0002¢\u0006\u0004\b3\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u000b0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006D"}, m31665d2 = {"Lmk/c;", "", "Landroid/content/Context;", "context", "Lku/l0;", "mainDispatcher", "ioDispatcher", "unpackDispatcher", "<init>", "(Landroid/content/Context;Lku/l0;Lku/l0;Lku/l0;)V", "Ljava/util/concurrent/CompletableFuture;", "", "q", "()Ljava/util/concurrent/CompletableFuture;", "Ljava/util/function/Consumer;", "onPathReady", "", "s", "(Ljava/util/function/Consumer;)V", "r", "()Ljava/lang/String;", "", "j", "()Z", "w", "(Lnt/b;)Ljava/lang/Object;", "x", "()V", "v", "Ljava/nio/file/Path;", "baseDir", "o", "(Ljava/nio/file/Path;Lnt/b;)Ljava/lang/Object;", "Landroid/content/res/AssetManager;", "assetManager", "assetName", "destination", "m", "(Landroid/content/res/AssetManager;Ljava/lang/String;Ljava/nio/file/Path;)Z", "l", "(Landroid/content/res/AssetManager;Ljava/lang/String;Ljava/nio/file/Path;)V", "Ljava/io/InputStream;", "first", "second", "k", "(Ljava/io/InputStream;Ljava/io/InputStream;)Z", "", "buffer", "", "offset", "length", "u", "(Ljava/io/InputStream;[BII)I", "a", "Landroid/content/Context;", "b", "Lku/l0;", "c", "d", "Lku/p0;", "e", "Lku/p0;", "scope", "Lku/w0;", "f", "Lku/w0;", "pathDeferred", "g", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8569c {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final InterfaceC7341h<AbstractC7923t1> f31393h = C7342i.m30456b(new Function0() { // from class: mk.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C8569c.m34511n();
        }
    });

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final InterfaceC7341h<C8569c> f31394i = C7342i.m30456b(new Function0() { // from class: mk.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C8569c.m34513t();
        }
    });

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AbstractC7888l0 mainDispatcher;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final AbstractC7888l0 ioDispatcher;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final AbstractC7888l0 unpackDispatcher;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7906p0 scope;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7934w0<String> pathDeferred;

    /* JADX INFO: renamed from: mk.c$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000f\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m31665d2 = {"Lmk/c$a;", "", "<init>", "()V", "Lmk/c;", "c", "()Lmk/c;", "Lku/l0;", "dedicatedUnpackDispatcher$delegate", "Ljt/h;", "b", "()Lku/l0;", "dedicatedUnpackDispatcher", "instance$delegate", "d", "instance", "", "CACERT_RELATIVE_PATH", "Ljava/lang/String;", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: mk.c.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final AbstractC7888l0 m34527b() {
            return (AbstractC7888l0) C8569c.f31393h.getValue();
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final C8569c m34528c() {
            return m34529d();
        }

        /* JADX INFO: renamed from: d */
        public final C8569c m34529d() {
            return (C8569c) C8569c.f31394i.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: mk.c$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.engine.AndroidAssetsHelper$ensureNeededDirsExist$2", m39664f = "AndroidAssetsHelper.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f31401t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f31402u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ Path f31403v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Path path, InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f31403v = path;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            b bVar = new b(this.f31403v, interfaceC9557b);
            bVar.f31402u = obj;
            return bVar;
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM30460b;
            C10047c.m38805e();
            if (this.f31401t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            List<String> listM31895n = C7699p.m31895n("content", "ExtraContent", "android");
            Path path = this.f31403v;
            for (String str : listM31895n) {
                try {
                    C7347n.Companion companion = C7347n.INSTANCE;
                    Path pathResolve = path.resolve(str);
                    if (!Files.exists(pathResolve, new LinkOption[0])) {
                        Files.createDirectories(pathResolve, new FileAttribute[0]);
                        C6124q.m27057b("rbx.xapkmanager", "Created missing directory: " + pathResolve);
                    }
                    objM30460b = C7347n.m30460b(Unit.f29331a);
                } catch (Throwable th2) {
                    C7347n.Companion companion2 = C7347n.INSTANCE;
                    objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
                }
                Throwable thM30463e = C7347n.m30463e(objM30460b);
                if (thM30463e != null) {
                    try {
                        C7347n.m30460b(C10340b.m39661d(C6124q.m27061f("rbx.xapkmanager", "Failed to create directory: " + str, thM30463e)));
                    } catch (Throwable th3) {
                        C7347n.Companion companion3 = C7347n.INSTANCE;
                        C7347n.m30460b(C7348o.m30469a(th3));
                    }
                }
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: mk.c$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)Ljava/lang/String;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.engine.AndroidAssetsHelper$getPathBlocking$1", m39664f = "AndroidAssetsHelper.kt", m39665l = {74}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super String>, Object> {

        /* JADX INFO: renamed from: t */
        public int f31404t;

        public c(InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C8569c.this.new c(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f31404t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return obj;
            }
            C7348o.m30470b(obj);
            InterfaceC7934w0 interfaceC7934w0 = C8569c.this.pathDeferred;
            this.f31404t = 1;
            Object objMo32927B = interfaceC7934w0.mo32927B(this);
            return objMo32927B == objM38805e ? objM38805e : objMo32927B;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super String> interfaceC9557b) {
            return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: mk.c$d */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.engine.AndroidAssetsHelper$getPathWithCallback$1", m39664f = "AndroidAssetsHelper.kt", m39665l = {65, 66}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class d extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f31406t;

        /* JADX INFO: renamed from: u */
        public int f31407u;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ Consumer<String> f31409w;

        /* JADX INFO: renamed from: mk.c$d$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.roblox.engine.AndroidAssetsHelper$getPathWithCallback$1$1", m39664f = "AndroidAssetsHelper.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
        public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f31410t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ Consumer<String> f31411u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ String f31412v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Consumer<String> consumer, String str, InterfaceC9557b<? super a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f31411u = consumer;
                this.f31412v = str;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f31411u, this.f31412v, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                C10047c.m38805e();
                if (this.f31410t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                this.f31411u.accept(this.f31412v);
                return Unit.f29331a;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Consumer<String> consumer, InterfaceC9557b<? super d> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f31409w = consumer;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C8569c.this.new d(this.f31409w, interfaceC9557b);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
        
            if (p256ku.C7872i.m32684g(r1, r3, r6) == r0) goto L15;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f31407u;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC7934w0 interfaceC7934w0 = C8569c.this.pathDeferred;
                this.f31407u = 1;
                obj = interfaceC7934w0.mo32927B(this);
                if (obj != objM38805e) {
                }
                return objM38805e;
            }
            if (i10 == 1) {
                C7348o.m30470b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
            String str = (String) obj;
            AbstractC7888l0 abstractC7888l0 = C8569c.this.mainDispatcher;
            a aVar = new a(this.f31409w, str, null);
            this.f31406t = C10350l.m39676a(str);
            this.f31407u = 2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((d) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: mk.c$e */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)Ljava/lang/String;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.engine.AndroidAssetsHelper$pathDeferred$1", m39664f = "AndroidAssetsHelper.kt", m39665l = {47}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class e extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super String>, Object> {

        /* JADX INFO: renamed from: t */
        public int f31413t;

        public e(InterfaceC9557b<? super e> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C8569c.this.new e(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f31413t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return obj;
            }
            C7348o.m30470b(obj);
            C8569c c8569c = C8569c.this;
            this.f31413t = 1;
            Object objM34523v = c8569c.m34523v(this);
            return objM34523v == objM38805e ? objM38805e : objM34523v;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super String> interfaceC9557b) {
            return ((e) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: mk.c$f */
    @InterfaceC10344f(m39663c = "com.roblox.engine.AndroidAssetsHelper", m39664f = "AndroidAssetsHelper.kt", m39665l = {84, 86}, m39666m = "unpackAssetsInternal", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class f extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f31415t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f31416u;

        /* JADX INFO: renamed from: w */
        public int f31418w;

        public f(InterfaceC9557b<? super f> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31416u = obj;
            this.f31418w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C8569c.this.m34523v(this);
        }
    }

    /* JADX INFO: renamed from: mk.c$g */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lku/p0;", "Ljava/nio/file/Path;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lku/p0;)Ljava/nio/file/Path;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.engine.AndroidAssetsHelper$unpackAssetsInternal$cachedAssetsPath$1", m39664f = "AndroidAssetsHelper.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class g extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Path>, Object> {

        /* JADX INFO: renamed from: t */
        public int f31419t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ Path f31420u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Path path, InterfaceC9557b<? super g> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f31420u = path;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new g(this.f31420u, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f31419t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            return this.f31420u.resolve("content").toRealPath(new LinkOption[0]);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Path> interfaceC9557b) {
            return ((g) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: mk.c$h */
    @InterfaceC10344f(m39663c = "com.roblox.engine.AndroidAssetsHelper", m39664f = "AndroidAssetsHelper.kt", m39665l = {118}, m39666m = "updateCaCert", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class h extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f31421t;

        /* JADX INFO: renamed from: u */
        public int f31422u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f31423v;

        /* JADX INFO: renamed from: x */
        public int f31425x;

        public h(InterfaceC9557b<? super h> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31423v = obj;
            this.f31425x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C8569c.this.m34524w(this);
        }
    }

    /* JADX INFO: renamed from: mk.c$i */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)I"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.engine.AndroidAssetsHelper$updateCaCert$2$1", m39664f = "AndroidAssetsHelper.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class i extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Integer>, Object> {

        /* JADX INFO: renamed from: t */
        public int f31426t;

        public i(InterfaceC9557b<? super i> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C8569c.this.new i(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f31426t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            C8569c c8569c = C8569c.this;
            AssetManager assets = c8569c.context.getAssets();
            Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
            Path pathResolve = C8569c.this.context.getFilesDir().toPath().resolve("exe/ssl/cacert.pem");
            Intrinsics.checkNotNullExpressionValue(pathResolve, "resolve(...)");
            return C10340b.m39661d(c8569c.m34517m(assets, "ssl/cacert.pem", pathResolve) ? C6124q.m27057b("rbx.xapkmanager", "cacert.pem was updated from assets.") : C6124q.m27057b("rbx.xapkmanager", "cacert.pem is already up to date; no copy needed."));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Integer> interfaceC9557b) {
            return ((i) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: mk.c$j */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.engine.AndroidAssetsHelper$updateCaCertBlocking$1", m39664f = "AndroidAssetsHelper.kt", m39665l = {137}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class j extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f31428t;

        public j(InterfaceC9557b<? super j> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C8569c.this.new j(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f31428t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C8569c c8569c = C8569c.this;
                this.f31428t = 1;
                if (c8569c.m34524w(this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((j) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: ku.z2.b(ku.d2, int, java.lang.Object):ku.a0 */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8569c(@NotNull Context context, @NotNull AbstractC7888l0 mainDispatcher, @NotNull AbstractC7888l0 ioDispatcher, @NotNull AbstractC7888l0 unpackDispatcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(unpackDispatcher, "unpackDispatcher");
        this.context = context;
        this.mainDispatcher = mainDispatcher;
        this.ioDispatcher = ioDispatcher;
        this.unpackDispatcher = unpackDispatcher;
        InterfaceC7906p0 interfaceC7906p0M32885a = C7910q0.m32885a(C7948z2.m32943b(null, 1, null).plus(unpackDispatcher));
        this.scope = interfaceC7906p0M32885a;
        this.pathDeferred = C7882k.m32778b(interfaceC7906p0M32885a, null, EnumC7914r0.LAZY, new e(null), 1, null);
    }

    /* JADX INFO: renamed from: n */
    public static final AbstractC7923t1 m34511n() {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(1, new C9420f0().m37210f("rbx-asset-unpack-%d").m37209e(true).m37208b());
        Intrinsics.checkNotNullExpressionValue(executorServiceNewFixedThreadPool, "newFixedThreadPool(...)");
        return C7931v1.m32926c(executorServiceNewFixedThreadPool);
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public static final C8569c m34512p() {
        return INSTANCE.m34528c();
    }

    /* JADX INFO: renamed from: t */
    public static final C8569c m34513t() {
        Context contextM14834f = RobloxApplication.m14834f();
        if (contextM14834f != null) {
            return new C8569c(contextM14834f, null, null, C11659h.m43403a().mo43739v2() ? INSTANCE.m34527b() : C7864g1.m32644b(), 6, null);
        }
        throw new IllegalArgumentException("Application context is not available");
    }

    /* JADX INFO: renamed from: j */
    public final boolean m34514j() {
        return this.pathDeferred.mo32598d() && !this.pathDeferred.isCancelled();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m34515k(InputStream first, InputStream second) {
        byte[] bArr = new byte[8192];
        byte[] bArr2 = new byte[8192];
        while (true) {
            try {
                try {
                    try {
                        int iM34522u = m34522u(first, bArr, 0, 8192);
                        if (iM34522u != m34522u(second, bArr2, 0, 8192)) {
                            C11958c.m44629a(second, null);
                            C11958c.m44629a(first, null);
                            return false;
                        }
                        if (iM34522u == 0) {
                            C11958c.m44629a(second, null);
                            C11958c.m44629a(first, null);
                            return true;
                        }
                        for (int i10 = 0; i10 < iM34522u; i10++) {
                            if (bArr[i10] != bArr2[i10]) {
                                C11958c.m44629a(second, null);
                                C11958c.m44629a(first, null);
                                return false;
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            C11958c.m44629a(second, th2);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
                throw th4;
            } catch (Throwable th5) {
                C11958c.m44629a(first, th4);
                throw th5;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m34516l(AssetManager assetManager, String assetName, Path destination) throws IOException {
        Path parent = destination.getParent();
        if (parent != null && !Files.exists(parent, new LinkOption[0])) {
            Files.createDirectories(parent, new FileAttribute[0]);
        }
        InputStream inputStreamOpen = assetManager.open(assetName);
        try {
            Files.copy(inputStreamOpen, destination, StandardCopyOption.REPLACE_EXISTING);
            C11958c.m44629a(inputStreamOpen, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C11958c.m44629a(inputStreamOpen, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m34517m(AssetManager assetManager, String assetName, Path destination) throws IOException {
        if (!Files.exists(destination, new LinkOption[0])) {
            m34516l(assetManager, assetName, destination);
            return true;
        }
        InputStream inputStreamOpen = assetManager.open(assetName);
        try {
            if (inputStreamOpen.available() == Files.size(destination)) {
                Intrinsics.checkNotNull(inputStreamOpen);
                InputStream inputStreamNewInputStream = Files.newInputStream(destination, new OpenOption[0]);
                Intrinsics.checkNotNullExpressionValue(inputStreamNewInputStream, "newInputStream(...)");
                if (m34515k(inputStreamOpen, inputStreamNewInputStream)) {
                    C11958c.m44629a(inputStreamOpen, null);
                    return false;
                }
            }
            Unit unit = Unit.f29331a;
            C11958c.m44629a(inputStreamOpen, null);
            m34516l(assetManager, assetName, destination);
            return true;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C11958c.m44629a(inputStreamOpen, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final Object m34518o(Path path, InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objM32684g = C7872i.m32684g(this.unpackDispatcher, new b(path, null), interfaceC9557b);
        return objM32684g == C10047c.m38805e() ? objM32684g : Unit.f29331a;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final CompletableFuture<String> m34519q() {
        this.pathDeferred.start();
        return C10354c.m39679c(this.pathDeferred);
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final String m34520r() {
        return (String) C7872i.m32682e(this.ioDispatcher, new c(null));
    }

    /* JADX INFO: renamed from: s */
    public final void m34521s(@NotNull Consumer<String> onPathReady) {
        Intrinsics.checkNotNullParameter(onPathReady, "onPathReady");
        C7882k.m32780d(this.scope, null, null, new d(onPathReady, null), 3, null);
    }

    /* JADX INFO: renamed from: u */
    public final int m34522u(InputStream inputStream, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        while (i12 < i11) {
            int i13 = inputStream.read(bArr, i10 + i12, bArr.length - i12);
            if (i13 == -1) {
                break;
            }
            i12 += i13;
        }
        return i12;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m34523v(InterfaceC9557b<? super String> interfaceC9557b) {
        f fVar;
        Path path;
        if (interfaceC9557b instanceof f) {
            fVar = (f) interfaceC9557b;
            int i10 = fVar.f31418w;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                fVar.f31418w = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                fVar = new f(interfaceC9557b);
            }
        } else {
            fVar = new f(interfaceC9557b);
        }
        Object objM32684g = fVar.f31416u;
        Object objM38805e = C10047c.m38805e();
        int i11 = fVar.f31418w;
        if (i11 == 0) {
            C7348o.m30470b(objM32684g);
            path = this.context.getDir("assets", 0).toPath();
            Intrinsics.checkNotNull(path);
            fVar.f31415t = path;
            fVar.f31418w = 1;
            if (m34518o(path, fVar) != objM38805e) {
            }
            return objM38805e;
        }
        if (i11 == 1) {
            path = (Path) fVar.f31415t;
            C7348o.m30470b(objM32684g);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(objM32684g);
        }
        Path path2 = (Path) objM32684g;
        C6124q.m27057b("rbx.xapkmanager", "unpackAssets: cached-asset-path = " + path2);
        String path3 = path2.toFile().getPath();
        Intrinsics.checkNotNullExpressionValue(path3, "getPath(...)");
        return path3;
        AbstractC7888l0 abstractC7888l0 = this.unpackDispatcher;
        g gVar = new g(path, null);
        fVar.f31415t = C10350l.m39676a(path);
        fVar.f31418w = 2;
        objM32684g = C7872i.m32684g(abstractC7888l0, gVar, fVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: w */
    public final Object m34524w(@NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        h hVar;
        Object objM30460b;
        if (interfaceC9557b instanceof h) {
            hVar = (h) interfaceC9557b;
            int i10 = hVar.f31425x;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                hVar.f31425x = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                hVar = new h(interfaceC9557b);
            }
        } else {
            hVar = new h(interfaceC9557b);
        }
        Object objM32684g = hVar.f31423v;
        Object objM38805e = C10047c.m38805e();
        int i11 = hVar.f31425x;
        try {
            if (i11 == 0) {
                C7348o.m30470b(objM32684g);
                C7347n.Companion companion = C7347n.INSTANCE;
                AbstractC7888l0 abstractC7888l0 = this.ioDispatcher;
                i iVar = new i(null);
                hVar.f31421t = C10350l.m39676a(this);
                hVar.f31422u = 0;
                hVar.f31425x = 1;
                objM32684g = C7872i.m32684g(abstractC7888l0, iVar, hVar);
                if (objM32684g == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(objM32684g);
            }
            objM30460b = C7347n.m30460b(C10340b.m39661d(((Number) objM32684g).intValue()));
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        Throwable thM30463e = C7347n.m30463e(objM30460b);
        if (thM30463e != null) {
            C7347n.m30460b(C10340b.m39661d(C6124q.m27061f("rbx.xapkmanager", "Failed to update cacert.pem", thM30463e)));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: x */
    public final void m34525x() {
        C7872i.m32682e(this.ioDispatcher, new j(null));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
      (r1v0 android.content.Context)
      (wrap ku.l0:?: TERNARY null = ((wrap int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap ku.l0:0x0004: INVOKE  STATIC call: ku.g1.c():ku.n2 A[MD:():ku.n2 (m), WRAPPED] (LINE:8)) : (r2v0 ku.l0))
      (wrap ku.l0:?: TERNARY null = ((wrap int:0x0008: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap ku.l0:0x000c: INVOKE  STATIC call: ku.g1.b():ku.l0 A[MD:():ku.l0 (m), WRAPPED] (LINE:9)) : (r3v0 ku.l0))
      (wrap ku.l0:?: TERNARY null = ((wrap int:0x0010: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap ku.l0:0x0014: INVOKE  STATIC call: ku.g1.b():ku.l0 A[MD:():ku.l0 (m), WRAPPED] (LINE:10)) : (r4v0 ku.l0))
     A[MD:(android.content.Context, ku.l0, ku.l0, ku.l0):void (m)] (LINE:11) call: mk.c.<init>(android.content.Context, ku.l0, ku.l0, ku.l0):void type: THIS */
    public /* synthetic */ C8569c(Context context, AbstractC7888l0 abstractC7888l0, AbstractC7888l0 abstractC7888l1, AbstractC7888l0 abstractC7888l2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? C7864g1.m32645c() : abstractC7888l0, (i10 & 4) != 0 ? C7864g1.m32644b() : abstractC7888l1, (i10 & 8) != 0 ? C7864g1.m32644b() : abstractC7888l2);
    }
}
