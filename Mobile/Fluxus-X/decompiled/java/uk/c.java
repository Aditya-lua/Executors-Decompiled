package uk;

import android.content.Context;
import android.content.res.AssetManager;
import av.g1;
import av.k;
import av.l0;
import av.p0;
import av.q0;
import av.r0;
import av.t1;
import av.v1;
import av.w0;
import av.z2;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.RobloxApplication;
import gu.l;
import gu.m;
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
import ok.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.p;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import pe.f0;
import zt.n;
import zt.o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 C2\u00020\u0001:\u00015B/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u001c\u0010\u0019J\u0018\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001dH\u0082@¢\u0006\u0004\b\u001f\u0010 J'\u0010%\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u001dH\u0002¢\u0006\u0004\b%\u0010&J'\u0010'\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u001dH\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010,\u001a\u00020\u00152\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)H\u0002¢\u0006\u0004\b,\u0010-J+\u00103\u001a\u000200*\u00020)2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u000200H\u0002¢\u0006\u0004\b3\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u000b0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006D"}, d2 = {"Luk/c;", BuildConfig.FLAVOR, "Landroid/content/Context;", "context", "Lav/l0;", "mainDispatcher", "ioDispatcher", "unpackDispatcher", "<init>", "(Landroid/content/Context;Lav/l0;Lav/l0;Lav/l0;)V", "Ljava/util/concurrent/CompletableFuture;", BuildConfig.FLAVOR, "q", "()Ljava/util/concurrent/CompletableFuture;", "Ljava/util/function/Consumer;", "onPathReady", BuildConfig.FLAVOR, "s", "(Ljava/util/function/Consumer;)V", "r", "()Ljava/lang/String;", BuildConfig.FLAVOR, "j", "()Z", "w", "(Leu/b;)Ljava/lang/Object;", "x", "()V", "v", "Ljava/nio/file/Path;", "baseDir", "o", "(Ljava/nio/file/Path;Leu/b;)Ljava/lang/Object;", "Landroid/content/res/AssetManager;", "assetManager", "assetName", "destination", "m", "(Landroid/content/res/AssetManager;Ljava/lang/String;Ljava/nio/file/Path;)Z", "l", "(Landroid/content/res/AssetManager;Ljava/lang/String;Ljava/nio/file/Path;)V", "Ljava/io/InputStream;", "first", "second", "k", "(Ljava/io/InputStream;Ljava/io/InputStream;)Z", BuildConfig.FLAVOR, "buffer", BuildConfig.FLAVOR, "offset", "length", "u", "(Ljava/io/InputStream;[BII)I", "a", "Landroid/content/Context;", "b", "Lav/l0;", "c", "d", "Lav/p0;", "e", "Lav/p0;", "scope", "Lav/w0;", "f", "Lav/w0;", "pathDeferred", "g", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final zt.h<t1> f33389h = zt.i.a(new Function0() { // from class: uk.a
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return c.n();
        }
    });

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final zt.h<c> f33390i = zt.i.a(new Function0() { // from class: uk.b
        @Override // p001kotlin.jvm.functions.Function0
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

    /* JADX INFO: renamed from: uk.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000f\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Luk/c$a;", BuildConfig.FLAVOR, "<init>", "()V", "Luk/c;", "c", "()Luk/c;", "Lav/l0;", "dedicatedUnpackDispatcher$delegate", "Lzt/h;", "b", "()Lav/l0;", "dedicatedUnpackDispatcher", "instance$delegate", "d", "instance", BuildConfig.FLAVOR, "CACERT_RELATIVE_PATH", "Ljava/lang/String;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l0 b() {
            return (l0) c.f33389h.getValue();
        }

        @NotNull
        public final c c() {
            return d();
        }

        public final c d() {
            return (c) c.f33390i.getValue();
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.engine.AndroidAssetsHelper$ensureNeededDirsExist$2", f = "AndroidAssetsHelper.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f33396t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f33397u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Path f33398v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Path path, eu.b<? super b> bVar) {
            super(2, bVar);
            this.f33398v = path;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            b bVar2 = new b(this.f33398v, bVar);
            bVar2.f33397u = obj;
            return bVar2;
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            fu.c.e();
            if (this.f33396t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            List<String> listN = p.n("content", "ExtraContent", "android");
            Path path = this.f33398v;
            for (String str : listN) {
                try {
                    n.Companion companion = n.INSTANCE;
                    Path pathResolve = path.resolve(str);
                    if (!Files.exists(pathResolve, new LinkOption[0])) {
                        Files.createDirectories(pathResolve, new FileAttribute[0]);
                        q.b("rbx.xapkmanager", "Created missing directory: " + pathResolve);
                    }
                    objB = n.b(Unit.f21506a);
                } catch (Throwable th2) {
                    n.Companion companion2 = n.INSTANCE;
                    objB = n.b(o.a(th2));
                }
                Throwable thE = n.e(objB);
                if (thE != null) {
                    try {
                        n.b(gu.b.c(q.f("rbx.xapkmanager", "Failed to create directory: " + str, thE)));
                    } catch (Throwable th3) {
                        n.Companion companion3 = n.INSTANCE;
                        n.b(o.a(th3));
                    }
                }
            }
            return Unit.f21506a;
        }
    }

    /* JADX INFO: renamed from: uk.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)Ljava/lang/String;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.engine.AndroidAssetsHelper$getPathBlocking$1", f = "AndroidAssetsHelper.kt", l = {74}, m = "invokeSuspend", v = 1)
    public static final class C0677c extends m implements Function2<p0, eu.b<? super String>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f33399t;

        public C0677c(eu.b<? super C0677c> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return c.this.new C0677c(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super String> bVar) {
            return ((C0677c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f33399t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            w0 w0Var = c.this.pathDeferred;
            this.f33399t = 1;
            Object objY = w0Var.y(this);
            return objY == objE ? objE : objY;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.engine.AndroidAssetsHelper$getPathWithCallback$1", f = "AndroidAssetsHelper.kt", l = {65, 66}, m = "invokeSuspend", v = 1)
    public static final class d extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f33401t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f33402u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Consumer<String> f33404w;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.roblox.engine.AndroidAssetsHelper$getPathWithCallback$1$1", f = "AndroidAssetsHelper.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends m implements Function2<p0, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f33405t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ Consumer<String> f33406u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ String f33407v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Consumer<String> consumer, String str, eu.b<? super a> bVar) {
                super(2, bVar);
                this.f33406u = consumer;
                this.f33407v = str;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new a(this.f33406u, this.f33407v, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                fu.c.e();
                if (this.f33405t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                this.f33406u.accept(this.f33407v);
                return Unit.f21506a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Consumer<String> consumer, eu.b<? super d> bVar) {
            super(2, bVar);
            this.f33404w = consumer;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return c.this.new d(this.f33404w, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
        
            if (av.i.g(r1, r3, r6) == r0) goto L15;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f33402u;
            if (i10 == 0) {
                o.b(obj);
                w0 w0Var = c.this.pathDeferred;
                this.f33402u = 1;
                obj = w0Var.y(this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i10 == 1) {
                o.b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f21506a;
            String str = (String) obj;
            l0 l0Var = c.this.mainDispatcher;
            a aVar = new a(this.f33404w, str, null);
            this.f33401t = l.a(str);
            this.f33402u = 2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)Ljava/lang/String;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.engine.AndroidAssetsHelper$pathDeferred$1", f = "AndroidAssetsHelper.kt", l = {47}, m = "invokeSuspend", v = 1)
    public static final class e extends m implements Function2<p0, eu.b<? super String>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f33408t;

        public e(eu.b<? super e> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return c.this.new e(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super String> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f33408t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            c cVar = c.this;
            this.f33408t = 1;
            Object objV = cVar.v(this);
            return objV == objE ? objE : objV;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.engine.AndroidAssetsHelper", f = "AndroidAssetsHelper.kt", l = {84, 86}, m = "unpackAssetsInternal", v = 1)
    public static final class f extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f33410t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f33411u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f33413w;

        public f(eu.b<? super f> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33411u = obj;
            this.f33413w |= Integer.MIN_VALUE;
            return c.this.v(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lav/p0;", "Ljava/nio/file/Path;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lav/p0;)Ljava/nio/file/Path;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.engine.AndroidAssetsHelper$unpackAssetsInternal$cachedAssetsPath$1", f = "AndroidAssetsHelper.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class g extends m implements Function2<p0, eu.b<? super Path>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f33414t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Path f33415u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Path path, eu.b<? super g> bVar) {
            super(2, bVar);
            this.f33415u = path;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new g(this.f33415u, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Path> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f33414t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            return this.f33415u.resolve("content").toRealPath(new LinkOption[0]);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.engine.AndroidAssetsHelper", f = "AndroidAssetsHelper.kt", l = {118}, m = "updateCaCert", v = 1)
    public static final class h extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f33416t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f33417u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f33418v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f33420x;

        public h(eu.b<? super h> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33418v = obj;
            this.f33420x |= Integer.MIN_VALUE;
            return c.this.w(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)I"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.engine.AndroidAssetsHelper$updateCaCert$2$1", f = "AndroidAssetsHelper.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class i extends m implements Function2<p0, eu.b<? super Integer>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f33421t;

        public i(eu.b<? super i> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return c.this.new i(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Integer> bVar) {
            return ((i) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f33421t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            c cVar = c.this;
            AssetManager assets = cVar.context.getAssets();
            Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
            Path pathResolve = c.this.context.getFilesDir().toPath().resolve("exe/ssl/cacert.pem");
            Intrinsics.checkNotNullExpressionValue(pathResolve, "resolve(...)");
            return gu.b.c(cVar.m(assets, "ssl/cacert.pem", pathResolve) ? q.b("rbx.xapkmanager", "cacert.pem was updated from assets.") : q.b("rbx.xapkmanager", "cacert.pem is already up to date; no copy needed."));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.engine.AndroidAssetsHelper$updateCaCertBlocking$1", f = "AndroidAssetsHelper.kt", l = {137}, m = "invokeSuspend", v = 1)
    public static final class j extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f33423t;

        public j(eu.b<? super j> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return c.this.new j(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((j) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f33423t;
            if (i10 == 0) {
                o.b(obj);
                c cVar = c.this;
                this.f33423t = 1;
                if (cVar.w(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f21506a;
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
            return new c(contextF, null, null, bi.h.a().D2() ? INSTANCE.b() : g1.b(), 6, null);
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
                            lu.c.a(second, null);
                            lu.c.a(first, null);
                            return false;
                        }
                        if (iU == 0) {
                            lu.c.a(second, null);
                            lu.c.a(first, null);
                            return true;
                        }
                        for (int i10 = 0; i10 < iU; i10++) {
                            if (bArr[i10] != bArr2[i10]) {
                                lu.c.a(second, null);
                                lu.c.a(first, null);
                                return false;
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            lu.c.a(second, th2);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
                throw th4;
            } catch (Throwable th5) {
                lu.c.a(first, th4);
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
            lu.c.a(inputStreamOpen, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                lu.c.a(inputStreamOpen, th2);
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
                    lu.c.a(inputStreamOpen, null);
                    return false;
                }
            }
            Unit unit = Unit.f21506a;
            lu.c.a(inputStreamOpen, null);
            l(assetManager, assetName, destination);
            return true;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                lu.c.a(inputStreamOpen, th2);
                throw th3;
            }
        }
    }

    public final Object o(Path path, eu.b<? super Unit> bVar) {
        Object objG = av.i.g(this.unpackDispatcher, new b(path, null), bVar);
        return objG == fu.c.e() ? objG : Unit.f21506a;
    }

    @NotNull
    public final CompletableFuture<String> q() {
        this.pathDeferred.start();
        return fv.c.c(this.pathDeferred);
    }

    @NotNull
    public final String r() {
        return (String) av.i.e(this.ioDispatcher, new C0677c(null));
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
    */
    public final Object v(eu.b<? super String> bVar) {
        f fVar;
        Path path;
        if (bVar instanceof f) {
            fVar = (f) bVar;
            int i10 = fVar.f33413w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f33413w = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(bVar);
            }
        } else {
            fVar = new f(bVar);
        }
        Object objG = fVar.f33411u;
        Object objE = fu.c.e();
        int i11 = fVar.f33413w;
        if (i11 == 0) {
            o.b(objG);
            path = this.context.getDir("assets", 0).toPath();
            Intrinsics.checkNotNull(path);
            fVar.f33410t = path;
            fVar.f33413w = 1;
            if (o(path, fVar) != objE) {
            }
            return objE;
        }
        if (i11 == 1) {
            path = (Path) fVar.f33410t;
            o.b(objG);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(objG);
        }
        Path path2 = (Path) objG;
        q.b("rbx.xapkmanager", "unpackAssets: cached-asset-path = " + path2);
        String path3 = path2.toFile().getPath();
        Intrinsics.checkNotNullExpressionValue(path3, "getPath(...)");
        return path3;
        l0 l0Var = this.unpackDispatcher;
        g gVar = new g(path, null);
        fVar.f33410t = l.a(path);
        fVar.f33413w = 2;
        objG = av.i.g(l0Var, gVar, fVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object w(@NotNull eu.b<? super Unit> bVar) {
        h hVar;
        Object objB;
        if (bVar instanceof h) {
            hVar = (h) bVar;
            int i10 = hVar.f33420x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f33420x = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(bVar);
            }
        } else {
            hVar = new h(bVar);
        }
        Object objG = hVar.f33418v;
        Object objE = fu.c.e();
        int i11 = hVar.f33420x;
        try {
            if (i11 == 0) {
                o.b(objG);
                n.Companion companion = n.INSTANCE;
                l0 l0Var = this.ioDispatcher;
                i iVar = new i(null);
                hVar.f33416t = l.a(this);
                hVar.f33417u = 0;
                hVar.f33420x = 1;
                objG = av.i.g(l0Var, iVar, hVar);
                if (objG == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(objG);
            }
            objB = n.b(gu.b.c(((Number) objG).intValue()));
        } catch (Throwable th2) {
            n.Companion companion2 = n.INSTANCE;
            objB = n.b(o.a(th2));
        }
        Throwable thE = n.e(objB);
        if (thE != null) {
            n.b(gu.b.c(q.f("rbx.xapkmanager", "Failed to update cacert.pem", thE)));
        }
        return Unit.f21506a;
    }

    public final void x() {
        av.i.e(this.ioDispatcher, new j(null));
    }

    public /* synthetic */ c(Context context, l0 l0Var, l0 l0Var2, l0 l0Var3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? g1.c() : l0Var, (i10 & 4) != 0 ? g1.b() : l0Var2, (i10 & 8) != 0 ? g1.b() : l0Var3);
    }
}
