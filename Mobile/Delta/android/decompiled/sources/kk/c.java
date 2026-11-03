package kk;

import android.content.Context;
import android.content.res.AssetManager;
import com.roblox.client.RobloxApplication;
import ek.q;
import gt.n;
import gt.o;
import iu.g1;
import iu.k;
import iu.l0;
import iu.p0;
import iu.q0;
import iu.r0;
import iu.t1;
import iu.v1;
import iu.w0;
import iu.z2;
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
import kotlin.collections.p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ne.f0;
import nt.l;
import nt.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 C2\u00020\u0001:\u00015B/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u001c\u0010\u0019J\u0018\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001dH\u0082@¢\u0006\u0004\b\u001f\u0010 J'\u0010%\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u001dH\u0002¢\u0006\u0004\b%\u0010&J'\u0010'\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u001dH\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010,\u001a\u00020\u00152\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)H\u0002¢\u0006\u0004\b,\u0010-J+\u00103\u001a\u000200*\u00020)2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u000200H\u0002¢\u0006\u0004\b3\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u000b0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006D"}, d2 = {"Lkk/c;", "", "Landroid/content/Context;", "context", "Liu/l0;", "mainDispatcher", "ioDispatcher", "unpackDispatcher", "<init>", "(Landroid/content/Context;Liu/l0;Liu/l0;Liu/l0;)V", "Ljava/util/concurrent/CompletableFuture;", "", "q", "()Ljava/util/concurrent/CompletableFuture;", "Ljava/util/function/Consumer;", "onPathReady", "", "s", "(Ljava/util/function/Consumer;)V", "r", "()Ljava/lang/String;", "", "j", "()Z", "w", "(Llt/b;)Ljava/lang/Object;", "x", "()V", "v", "Ljava/nio/file/Path;", "baseDir", "o", "(Ljava/nio/file/Path;Llt/b;)Ljava/lang/Object;", "Landroid/content/res/AssetManager;", "assetManager", "assetName", "destination", "m", "(Landroid/content/res/AssetManager;Ljava/lang/String;Ljava/nio/file/Path;)Z", "l", "(Landroid/content/res/AssetManager;Ljava/lang/String;Ljava/nio/file/Path;)V", "Ljava/io/InputStream;", "first", "second", "k", "(Ljava/io/InputStream;Ljava/io/InputStream;)Z", "", "buffer", "", "offset", "length", "u", "(Ljava/io/InputStream;[BII)I", "a", "Landroid/content/Context;", "b", "Liu/l0;", "c", "d", "Liu/p0;", "e", "Liu/p0;", "scope", "Liu/w0;", "f", "Liu/w0;", "pathDeferred", "g", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final gt.h<t1> f22771h = gt.i.b(new Function0() { // from class: kk.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return c.n();
        }
    });

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final gt.h<c> f22772i = gt.i.b(new Function0() { // from class: kk.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return c.t();
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final l0 mainDispatcher;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 ioDispatcher;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 unpackDispatcher;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 scope;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final w0<String> pathDeferred;

    /* JADX INFO: renamed from: kk.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000f\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lkk/c$a;", "", "<init>", "()V", "Lkk/c;", "c", "()Lkk/c;", "Liu/l0;", "dedicatedUnpackDispatcher$delegate", "Lgt/h;", "b", "()Liu/l0;", "dedicatedUnpackDispatcher", "instance$delegate", "d", "instance", "", "CACERT_RELATIVE_PATH", "Ljava/lang/String;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l0 b() {
            return (l0) c.f22771h.getValue();
        }

        @NotNull
        public final c c() {
            return d();
        }

        public final c d() {
            return (c) c.f22772i.getValue();
        }

        public Companion() {
        }
    }

    @nt.f(c = "com.roblox.engine.AndroidAssetsHelper$ensureNeededDirsExist$2", f = "AndroidAssetsHelper.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class b extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f22778t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f22779u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Path f22780v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Path path, lt.b<? super b> bVar) {
            super(2, bVar);
            this.f22780v = path;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            b bVar2 = new b(this.f22780v, bVar);
            bVar2.f22779u = obj;
            return bVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            mt.c.e();
            if (this.f22778t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            List<String> listN = p.n("content", "ExtraContent", "android");
            Path path = this.f22780v;
            for (String str : listN) {
                try {
                    n.Companion companion = n.INSTANCE;
                    Path pathResolve = path.resolve(str);
                    if (!Files.exists(pathResolve, new LinkOption[0])) {
                        Files.createDirectories(pathResolve, new FileAttribute[0]);
                        q.b("rbx.xapkmanager", "Created missing directory: " + pathResolve);
                    }
                    objB = n.b(Unit.f22938a);
                } catch (Throwable th2) {
                    n.Companion companion2 = n.INSTANCE;
                    objB = n.b(o.a(th2));
                }
                Throwable thE = n.e(objB);
                if (thE != null) {
                    try {
                        n.b(nt.b.d(q.f("rbx.xapkmanager", "Failed to create directory: " + str, thE)));
                    } catch (Throwable th3) {
                        n.Companion companion3 = n.INSTANCE;
                        n.b(o.a(th3));
                    }
                }
            }
            return Unit.f22938a;
        }
    }

    /* JADX INFO: renamed from: kk.c$c, reason: collision with other inner class name */
    @nt.f(c = "com.roblox.engine.AndroidAssetsHelper$getPathBlocking$1", f = "AndroidAssetsHelper.kt", l = {74}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)Ljava/lang/String;"}, k = 3, mv = {2, 2, 0})
    public static final class C0398c extends m implements Function2<p0, lt.b<? super String>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f22781t;

        public C0398c(lt.b<? super C0398c> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return c.this.new C0398c(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super String> bVar) {
            return ((C0398c) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f22781t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            w0 w0Var = c.this.pathDeferred;
            this.f22781t = 1;
            Object objN = w0Var.n(this);
            return objN == objE ? objE : objN;
        }
    }

    @nt.f(c = "com.roblox.engine.AndroidAssetsHelper$getPathWithCallback$1", f = "AndroidAssetsHelper.kt", l = {65, 66}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class d extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f22783t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f22784u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Consumer<String> f22786w;

        @nt.f(c = "com.roblox.engine.AndroidAssetsHelper$getPathWithCallback$1$1", f = "AndroidAssetsHelper.kt", l = {}, m = "invokeSuspend", v = 1)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
        public static final class a extends m implements Function2<p0, lt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f22787t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ Consumer<String> f22788u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ String f22789v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Consumer<String> consumer, String str, lt.b<? super a> bVar) {
                super(2, bVar);
                this.f22788u = consumer;
                this.f22789v = str;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                return new a(this.f22788u, this.f22789v, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                mt.c.e();
                if (this.f22787t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                this.f22788u.accept(this.f22789v);
                return Unit.f22938a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Consumer<String> consumer, lt.b<? super d> bVar) {
            super(2, bVar);
            this.f22786w = consumer;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return c.this.new d(this.f22786w, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
        
            if (iu.i.g(r1, r3, r6) == r0) goto L15;
         */
        @Override // nt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = mt.c.e()
                int r1 = r6.f22784u
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r6.f22783t
                java.lang.String r0 = (java.lang.String) r0
                gt.o.b(r7)
                goto L53
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                gt.o.b(r7)
                goto L34
            L22:
                gt.o.b(r7)
                kk.c r7 = kk.c.this
                iu.w0 r7 = kk.c.h(r7)
                r6.f22784u = r3
                java.lang.Object r7 = r7.n(r6)
                if (r7 != r0) goto L34
                goto L52
            L34:
                java.lang.String r7 = (java.lang.String) r7
                kk.c r1 = kk.c.this
                iu.l0 r1 = kk.c.g(r1)
                kk.c$d$a r3 = new kk.c$d$a
                java.util.function.Consumer<java.lang.String> r4 = r6.f22786w
                r5 = 0
                r3.<init>(r4, r7, r5)
                java.lang.Object r7 = nt.l.a(r7)
                r6.f22783t = r7
                r6.f22784u = r2
                java.lang.Object r7 = iu.i.g(r1, r3, r6)
                if (r7 != r0) goto L53
            L52:
                return r0
            L53:
                kotlin.Unit r7 = kotlin.Unit.f22938a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kk.c.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @nt.f(c = "com.roblox.engine.AndroidAssetsHelper$pathDeferred$1", f = "AndroidAssetsHelper.kt", l = {47}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)Ljava/lang/String;"}, k = 3, mv = {2, 2, 0})
    public static final class e extends m implements Function2<p0, lt.b<? super String>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f22790t;

        public e(lt.b<? super e> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return c.this.new e(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super String> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f22790t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            c cVar = c.this;
            this.f22790t = 1;
            Object objV = cVar.v(this);
            return objV == objE ? objE : objV;
        }
    }

    @nt.f(c = "com.roblox.engine.AndroidAssetsHelper", f = "AndroidAssetsHelper.kt", l = {84, 86}, m = "unpackAssetsInternal", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class f extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f22792t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f22793u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f22795w;

        public f(lt.b<? super f> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f22793u = obj;
            this.f22795w |= Integer.MIN_VALUE;
            return c.this.v(this);
        }
    }

    @nt.f(c = "com.roblox.engine.AndroidAssetsHelper$unpackAssetsInternal$cachedAssetsPath$1", f = "AndroidAssetsHelper.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Liu/p0;", "Ljava/nio/file/Path;", "kotlin.jvm.PlatformType", "<anonymous>", "(Liu/p0;)Ljava/nio/file/Path;"}, k = 3, mv = {2, 2, 0})
    public static final class g extends m implements Function2<p0, lt.b<? super Path>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f22796t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Path f22797u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Path path, lt.b<? super g> bVar) {
            super(2, bVar);
            this.f22797u = path;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new g(this.f22797u, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Path> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f22796t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            return this.f22797u.resolve("content").toRealPath(new LinkOption[0]);
        }
    }

    @nt.f(c = "com.roblox.engine.AndroidAssetsHelper", f = "AndroidAssetsHelper.kt", l = {118}, m = "updateCaCert", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class h extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f22798t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f22799u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f22800v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f22802x;

        public h(lt.b<? super h> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f22800v = obj;
            this.f22802x |= Integer.MIN_VALUE;
            return c.this.w(this);
        }
    }

    @nt.f(c = "com.roblox.engine.AndroidAssetsHelper$updateCaCert$2$1", f = "AndroidAssetsHelper.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)I"}, k = 3, mv = {2, 2, 0})
    public static final class i extends m implements Function2<p0, lt.b<? super Integer>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f22803t;

        public i(lt.b<? super i> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return c.this.new i(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Integer> bVar) {
            return ((i) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f22803t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            c cVar = c.this;
            AssetManager assets = cVar.context.getAssets();
            Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
            Path pathResolve = c.this.context.getFilesDir().toPath().resolve("exe/ssl/cacert.pem");
            Intrinsics.checkNotNullExpressionValue(pathResolve, "resolve(...)");
            return nt.b.d(cVar.m(assets, "ssl/cacert.pem", pathResolve) ? q.b("rbx.xapkmanager", "cacert.pem was updated from assets.") : q.b("rbx.xapkmanager", "cacert.pem is already up to date; no copy needed."));
        }
    }

    @nt.f(c = "com.roblox.engine.AndroidAssetsHelper$updateCaCertBlocking$1", f = "AndroidAssetsHelper.kt", l = {137}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class j extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f22805t;

        public j(lt.b<? super j> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return c.this.new j(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((j) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f22805t;
            if (i10 == 0) {
                o.b(obj);
                c cVar = c.this;
                this.f22805t = 1;
                if (cVar.w(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22938a;
        }
    }

    public c(@NotNull Context context, @NotNull l0 mainDispatcher, @NotNull l0 ioDispatcher, @NotNull l0 unpackDispatcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(unpackDispatcher, "unpackDispatcher");
        this.context = context;
        this.mainDispatcher = mainDispatcher;
        this.ioDispatcher = ioDispatcher;
        this.unpackDispatcher = unpackDispatcher;
        p0 p0VarA = q0.a(z2.b(null, 1, null).plus(unpackDispatcher));
        this.scope = p0VarA;
        this.pathDeferred = k.b(p0VarA, null, r0.LAZY, new e(null), 1, null);
    }

    public static final t1 n() {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(1, new f0().f("rbx-asset-unpack-%d").e(true).b());
        Intrinsics.checkNotNullExpressionValue(executorServiceNewFixedThreadPool, "newFixedThreadPool(...)");
        return v1.c(executorServiceNewFixedThreadPool);
    }

    @NotNull
    public static final c p() {
        return INSTANCE.c();
    }

    public static final c t() {
        Context contextF = RobloxApplication.f();
        if (contextF != null) {
            return new c(contextF, null, null, rh.h.a().B2() ? INSTANCE.b() : g1.b(), 6, null);
        }
        throw new IllegalArgumentException("Application context is not available");
    }

    public final boolean j() {
        return this.pathDeferred.d() && !this.pathDeferred.isCancelled();
    }

    public final boolean k(InputStream first, InputStream second) {
        byte[] bArr = new byte[8192];
        byte[] bArr2 = new byte[8192];
        while (true) {
            try {
                try {
                    try {
                        int iU = u(first, bArr, 0, 8192);
                        if (iU != u(second, bArr2, 0, 8192)) {
                            st.c.a(second, null);
                            st.c.a(first, null);
                            return false;
                        }
                        if (iU == 0) {
                            st.c.a(second, null);
                            st.c.a(first, null);
                            return true;
                        }
                        for (int i10 = 0; i10 < iU; i10++) {
                            if (bArr[i10] != bArr2[i10]) {
                                st.c.a(second, null);
                                st.c.a(first, null);
                                return false;
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            st.c.a(second, th2);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
                throw th4;
            } catch (Throwable th5) {
                st.c.a(first, th4);
                throw th5;
            }
        }
    }

    public final void l(AssetManager assetManager, String assetName, Path destination) throws IOException {
        Path parent = destination.getParent();
        if (parent != null && !Files.exists(parent, new LinkOption[0])) {
            Files.createDirectories(parent, new FileAttribute[0]);
        }
        InputStream inputStreamOpen = assetManager.open(assetName);
        try {
            Files.copy(inputStreamOpen, destination, StandardCopyOption.REPLACE_EXISTING);
            st.c.a(inputStreamOpen, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                st.c.a(inputStreamOpen, th2);
                throw th3;
            }
        }
    }

    public final boolean m(AssetManager assetManager, String assetName, Path destination) throws IOException {
        if (!Files.exists(destination, new LinkOption[0])) {
            l(assetManager, assetName, destination);
            return true;
        }
        InputStream inputStreamOpen = assetManager.open(assetName);
        try {
            if (inputStreamOpen.available() == Files.size(destination)) {
                Intrinsics.checkNotNull(inputStreamOpen);
                InputStream inputStreamNewInputStream = Files.newInputStream(destination, new OpenOption[0]);
                Intrinsics.checkNotNullExpressionValue(inputStreamNewInputStream, "newInputStream(...)");
                if (k(inputStreamOpen, inputStreamNewInputStream)) {
                    st.c.a(inputStreamOpen, null);
                    return false;
                }
            }
            Unit unit = Unit.f22938a;
            st.c.a(inputStreamOpen, null);
            l(assetManager, assetName, destination);
            return true;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                st.c.a(inputStreamOpen, th2);
                throw th3;
            }
        }
    }

    public final Object o(Path path, lt.b<? super Unit> bVar) {
        Object objG = iu.i.g(this.unpackDispatcher, new b(path, null), bVar);
        return objG == mt.c.e() ? objG : Unit.f22938a;
    }

    @NotNull
    public final CompletableFuture<String> q() {
        this.pathDeferred.start();
        return nu.c.c(this.pathDeferred);
    }

    @NotNull
    public final String r() {
        return (String) iu.i.e(this.ioDispatcher, new C0398c(null));
    }

    public final void s(@NotNull Consumer<String> onPathReady) {
        Intrinsics.checkNotNullParameter(onPathReady, "onPathReady");
        k.d(this.scope, null, null, new d(onPathReady, null), 3, null);
    }

    public final int u(InputStream inputStream, byte[] bArr, int i10, int i11) throws IOException {
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(lt.b<? super java.lang.String> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kk.c.f
            if (r0 == 0) goto L13
            r0 = r7
            kk.c$f r0 = (kk.c.f) r0
            int r1 = r0.f22795w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22795w = r1
            goto L18
        L13:
            kk.c$f r0 = new kk.c$f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f22793u
            java.lang.Object r1 = mt.c.e()
            int r2 = r0.f22795w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.f22792t
            java.nio.file.Path r0 = (java.nio.file.Path) r0
            gt.o.b(r7)
            goto L75
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            java.lang.Object r2 = r0.f22792t
            java.nio.file.Path r2 = (java.nio.file.Path) r2
            gt.o.b(r7)
            goto L5e
        L40:
            gt.o.b(r7)
            android.content.Context r7 = r6.context
            java.lang.String r2 = "assets"
            r5 = 0
            java.io.File r7 = r7.getDir(r2, r5)
            java.nio.file.Path r2 = r7.toPath()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r0.f22792t = r2
            r0.f22795w = r4
            java.lang.Object r7 = r6.o(r2, r0)
            if (r7 != r1) goto L5e
            goto L74
        L5e:
            iu.l0 r7 = r6.unpackDispatcher
            kk.c$g r4 = new kk.c$g
            r5 = 0
            r4.<init>(r2, r5)
            java.lang.Object r2 = nt.l.a(r2)
            r0.f22792t = r2
            r0.f22795w = r3
            java.lang.Object r7 = iu.i.g(r7, r4, r0)
            if (r7 != r1) goto L75
        L74:
            return r1
        L75:
            java.nio.file.Path r7 = (java.nio.file.Path) r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "unpackAssets: cached-asset-path = "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "rbx.xapkmanager"
            ek.q.b(r1, r0)
            java.io.File r7 = r7.toFile()
            java.lang.String r7 = r7.getPath()
            java.lang.String r0 = "getPath(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kk.c.v(lt.b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object w(@NotNull lt.b<? super Unit> bVar) {
        h hVar;
        Object objB;
        if (bVar instanceof h) {
            hVar = (h) bVar;
            int i10 = hVar.f22802x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f22802x = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(bVar);
            }
        } else {
            hVar = new h(bVar);
        }
        Object objG = hVar.f22800v;
        Object objE = mt.c.e();
        int i11 = hVar.f22802x;
        try {
            if (i11 == 0) {
                o.b(objG);
                n.Companion companion = n.INSTANCE;
                l0 l0Var = this.ioDispatcher;
                i iVar = new i(null);
                hVar.f22798t = l.a(this);
                hVar.f22799u = 0;
                hVar.f22802x = 1;
                objG = iu.i.g(l0Var, iVar, hVar);
                if (objG == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(objG);
            }
            objB = n.b(nt.b.d(((Number) objG).intValue()));
        } catch (Throwable th2) {
            n.Companion companion2 = n.INSTANCE;
            objB = n.b(o.a(th2));
        }
        Throwable thE = n.e(objB);
        if (thE != null) {
            n.b(nt.b.d(q.f("rbx.xapkmanager", "Failed to update cacert.pem", thE)));
        }
        return Unit.f22938a;
    }

    public final void x() {
        iu.i.e(this.ioDispatcher, new j(null));
    }

    public /* synthetic */ c(Context context, l0 l0Var, l0 l0Var2, l0 l0Var3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? g1.c() : l0Var, (i10 & 4) != 0 ? g1.b() : l0Var2, (i10 & 8) != 0 ? g1.b() : l0Var3);
    }
}
