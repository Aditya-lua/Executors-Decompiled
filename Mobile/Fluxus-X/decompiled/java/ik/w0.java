package ik;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.roblox.universalapp.logging.LoggingProtocol;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.ranges.IntRange;
import p001kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001?B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u000bJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010$\u001a\u00020\u00042\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0002¢\u0006\u0004\b$\u0010%J/\u0010,\u001a\u00020\t2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0011H\u0002¢\u0006\u0004\b,\u0010-J%\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b.\u0010\u0016J\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b/\u00100J\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b1\u00100J'\u00103\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00112\u0006\u00102\u001a\u00020\u0011H\u0002¢\u0006\u0004\b3\u00104J'\u00106\u001a\u00020(2\u0006\u0010'\u001a\u00020&2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u000205H\u0002¢\u0006\u0004\b6\u00107R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010>\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006@"}, d2 = {"Lik/w0;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "l", "k", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "i", "(Landroid/content/Context;)Z", "h", "A", "(Landroid/content/Context;)V", "Ljava/io/File;", "lib", BuildConfig.FLAVOR, "hotTextBytes", BuildConfig.FLAVOR, "Lik/w0$a;", "p", "(Ljava/io/File;J)Ljava/util/List;", BuildConfig.FLAVOR, "f", "(Landroid/content/Context;)Ljava/lang/String;", "j", "libFile", "x", "(Ljava/io/File;)V", "y", "(Landroid/content/Context;Ljava/io/File;)V", "ranges", "Ljava/util/concurrent/atomic/AtomicLong;", "read", "skipped", "u", "(Ljava/util/List;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;)V", "Ljava/nio/channels/FileChannel;", "ch", "Ljava/nio/ByteBuffer;", "probe", "offset", "length", "g", "(Ljava/nio/channels/FileChannel;Ljava/nio/ByteBuffer;JJ)Z", "m", "o", "(Landroid/content/Context;)Ljava/util/List;", "r", "fileSize", "e", "(JJJ)Z", BuildConfig.FLAVOR, "t", "(Ljava/nio/channels/FileChannel;JI)Ljava/nio/ByteBuffer;", "Ljava/util/concurrent/CountDownLatch;", "b", "Ljava/util/concurrent/CountDownLatch;", "startupCookieRead", "c", "J", "orderedPrefetchStartMs", "a", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final w0 f19604a = new w0();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final CountDownLatch startupCookieRead = new CountDownLatch(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static volatile long orderedPrefetchStartMs;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\f\u0010\u000f¨\u0006\u0010"}, d2 = {"Lik/w0$a;", BuildConfig.FLAVOR, "Ljava/io/File;", "file", BuildConfig.FLAVOR, "offset", "length", "<init>", "(Ljava/io/File;JJ)V", "a", "Ljava/io/File;", "()Ljava/io/File;", "b", "J", "c", "()J", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final File file;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final long offset;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final long length;

        public a(@NotNull File file, long j10, long j11) {
            Intrinsics.checkNotNullParameter(file, "file");
            this.file = file;
            this.offset = j10;
            this.length = j11;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final File getFile() {
            return this.file;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getLength() {
            return this.length;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getOffset() {
            return this.offset;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"ik/w0$b", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "name", BuildConfig.FLAVOR, "offset", "size", "<init>", "(Ljava/lang/String;JJ)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "J", "()J", "c", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final String name;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final long offset;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final long size;

        public b(String name, long j10, long j11) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.offset = j10;
            this.size = j11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getOffset() {
            return this.offset;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getSize() {
            return this.size;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.startup.LibRobloxPrewarm$startMmapPrewarm$1", f = "LibRobloxPrewarm.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f19610t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ File f19611u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(File file, eu.b<? super c> bVar) {
            super(2, bVar);
            this.f19611u = file;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new c(this.f19611u, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f19610t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(this.f19611u, "r");
                try {
                    FileChannel channel = randomAccessFile.getChannel();
                    try {
                        channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size()).load();
                        lu.c.a(channel, null);
                        lu.c.a(randomAccessFile, null);
                        return Unit.f21506a;
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            lu.c.a(channel, th2);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        lu.c.a(randomAccessFile, th4);
                        throw th5;
                    }
                }
            } catch (Exception e10) {
                Log.e("RbxLibPrewarm", "prewarm failed", e10);
            }
        }
    }

    public static final void A(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File file = new File(context.getApplicationInfo().nativeLibraryDir, System.mapLibraryName("roblox"));
        try {
            w0 w0Var = f19604a;
            if (w0Var.j(context)) {
                w0Var.y(context, file);
                return;
            }
        } catch (Throwable th2) {
            Log.e("RbxLibPrewarm", "ordered prefetch didn't start", th2);
        }
        f19604a.x(file);
    }

    public static final boolean h(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("prefs", 0);
        String str = BuildConfig.FLAVOR;
        String string = sharedPreferences.getString("channel", BuildConfig.FLAVOR);
        if (string != null) {
            str = string;
        }
        return p001kotlin.text.x.T(str, "zgooglebinary", false, 2, null);
    }

    public static final boolean i(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return !StringsKt.a0(f19604a.f(context), ":", false, 2, null);
    }

    public static final void k() {
        long j10 = orderedPrefetchStartMs;
        if (j10 != 0) {
            LoggingProtocol.l("ordered_libroblox_prefetch_begin", Long.valueOf(j10));
        }
    }

    public static final void l() {
        startupCookieRead.countDown();
    }

    public static final String n(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11) {
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = byteBuffer.getInt(i11 * i10); i12 >= 0 && i12 < byteBuffer2.limit() && byteBuffer2.get(i12) != 0; i12++) {
            sb2.append((char) byteBuffer2.get(i12));
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ List q(w0 w0Var, File file, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 9000000;
        }
        return w0Var.p(file, j10);
    }

    public static final boolean s(File file) {
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (p001kotlin.text.x.T(name, "vulkan.", false, 2, null)) {
            String name2 = file.getName();
            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
            if (p001kotlin.text.x.D(name2, ".so", false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    public static final void v(ArrayList arrayList, AtomicInteger atomicInteger, AtomicLong atomicLong, AtomicLong atomicLong2) {
        ByteBuffer byteBuffer;
        HashMap map = new HashMap();
        HashSet hashSet = new HashSet();
        try {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(1048576);
            ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(Barcode.FORMAT_AZTEC);
            while (true) {
                a aVar = (a) CollectionsKt.f0(arrayList, atomicInteger.getAndIncrement());
                if (aVar == null) {
                    break;
                }
                if (!hashSet.contains(aVar.getFile())) {
                    try {
                        File file = aVar.getFile();
                        Object channel = map.get(file);
                        if (channel == null) {
                            channel = new RandomAccessFile(aVar.getFile(), "r").getChannel();
                            Intrinsics.checkNotNullExpressionValue(channel, "getChannel(...)");
                            map.put(file, channel);
                        }
                        FileChannel fileChannel = (FileChannel) channel;
                        w0 w0Var = f19604a;
                        Intrinsics.checkNotNull(byteBufferAllocateDirect2);
                        if (w0Var.g(fileChannel, byteBufferAllocateDirect2, aVar.getOffset(), aVar.getLength())) {
                            try {
                                atomicLong.addAndGet(aVar.getLength());
                            } catch (Exception e10) {
                                e = e10;
                                byteBuffer = byteBufferAllocateDirect2;
                                hashSet.add(aVar.getFile());
                                Log.w("RbxLibPrewarm", "ordered prefetch skipping " + aVar.getFile().getName(), e);
                                byteBufferAllocateDirect2 = byteBuffer;
                            }
                        } else {
                            byteBufferAllocateDirect.clear();
                            byteBufferAllocateDirect.limit((int) aVar.getLength());
                            while (true) {
                                if (!byteBufferAllocateDirect.hasRemaining()) {
                                    byteBuffer = byteBufferAllocateDirect2;
                                    break;
                                }
                                try {
                                    byteBuffer = byteBufferAllocateDirect2;
                                    try {
                                        if (fileChannel.read(byteBufferAllocateDirect, aVar.getOffset() + ((long) byteBufferAllocateDirect.position())) < 0) {
                                            break;
                                        } else {
                                            byteBufferAllocateDirect2 = byteBuffer;
                                        }
                                    } catch (Exception e11) {
                                        e = e11;
                                        hashSet.add(aVar.getFile());
                                        Log.w("RbxLibPrewarm", "ordered prefetch skipping " + aVar.getFile().getName(), e);
                                        byteBufferAllocateDirect2 = byteBuffer;
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                    byteBuffer = byteBufferAllocateDirect2;
                                }
                            }
                            try {
                                atomicLong2.addAndGet(byteBufferAllocateDirect.position());
                            } catch (Exception e13) {
                                e = e13;
                                hashSet.add(aVar.getFile());
                                Log.w("RbxLibPrewarm", "ordered prefetch skipping " + aVar.getFile().getName(), e);
                            }
                            byteBufferAllocateDirect2 = byteBuffer;
                        }
                    } catch (Exception e14) {
                        e = e14;
                    }
                }
            }
            Collection<FileChannel> collectionValues = map.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
            for (FileChannel fileChannel2 : collectionValues) {
                try {
                    zt.n.Companion companion = zt.n.INSTANCE;
                    fileChannel2.close();
                    zt.n.b(Unit.f21506a);
                } catch (Throwable th2) {
                    zt.n.Companion companion2 = zt.n.INSTANCE;
                    zt.n.b(zt.o.a(th2));
                }
            }
        } catch (Throwable th3) {
            try {
                Log.e("RbxLibPrewarm", "ordered prefetch reader failed", th3);
            } finally {
                Collection<FileChannel> collectionValues2 = map.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues2, "<get-values>(...)");
                for (FileChannel fileChannel3 : collectionValues2) {
                    try {
                        zt.n.Companion companion3 = zt.n.INSTANCE;
                        fileChannel3.close();
                        zt.n.b(Unit.f21506a);
                    } catch (Throwable th4) {
                        zt.n.Companion companion4 = zt.n.INSTANCE;
                        zt.n.b(zt.o.a(th4));
                    }
                }
            }
        }
    }

    public static final Unit w(Runnable runnable) {
        runnable.run();
        return Unit.f21506a;
    }

    public static final Unit z(File file, Context context, long j10) {
        try {
            AtomicLong atomicLong = new AtomicLong(0L);
            AtomicLong atomicLong2 = new AtomicLong(0L);
            w0 w0Var = f19604a;
            w0Var.u(q(w0Var, file, 0L, 2, null), atomicLong, atomicLong2);
            w0Var.u(w0Var.o(context), atomicLong, atomicLong2);
            File file2 = new File(context.getFilesDir(), "UniversalApp_cache");
            if (file2.isFile() && startupCookieRead.await(3000L, TimeUnit.MILLISECONDS)) {
                w0Var.u(p001kotlin.collections.o.d(new a(file2, 0L, file2.length())), atomicLong, atomicLong2);
            }
            LoggingProtocol.m("ordered_libroblox_prefetch_end", null, 2, null);
            Log.i("RbxLibPrewarm", "ordered prefetch read " + (atomicLong.get() >> 20) + " MB, skipped " + (atomicLong2.get() >> 20) + " MB already cached, in " + (SystemClock.elapsedRealtime() - j10) + " ms");
        } catch (Throwable th2) {
            Log.e("RbxLibPrewarm", "ordered prefetch failed", th2);
        }
        return Unit.f21506a;
    }

    public final boolean e(long offset, long length, long fileSize) {
        return offset >= 0 && length >= 0 && offset <= fileSize && length <= fileSize - offset;
    }

    public final String f(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        Object next;
        if (Build.VERSION.SDK_INT >= 28) {
            String processName = Application.getProcessName();
            Intrinsics.checkNotNullExpressionValue(processName, "getProcessName(...)");
            return processName;
        }
        int iMyPid = Process.myPid();
        Object systemService = context.getSystemService("activity");
        String str = null;
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            Iterator<T> it = runningAppProcesses.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((ActivityManager.RunningAppProcessInfo) next).pid != iMyPid);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
            if (runningAppProcessInfo != null) {
                str = runningAppProcessInfo.processName;
            }
        }
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public final boolean g(FileChannel ch2, ByteBuffer probe, long offset, long length) throws IOException {
        for (int i10 = 0; i10 < 4; i10++) {
            probe.clear();
            long jNanoTime = System.nanoTime();
            ch2.read(probe, ((((long) i10) * length) / ((long) 4)) + offset);
            if (System.nanoTime() - jNanoTime > 60000) {
                return false;
            }
        }
        return true;
    }

    public final boolean j(Context context) {
        return context.getSharedPreferences("prefs", 0).getBoolean("FFlagEnableOrderedLibRobloxPrefetch", false);
    }

    public final List<a> m(File lib, long hotTextBytes) {
        long j10;
        int i10;
        RandomAccessFile randomAccessFile = new RandomAccessFile(lib, "r");
        try {
            FileChannel channel = randomAccessFile.getChannel();
            long size = channel.size();
            w0 w0Var = f19604a;
            Intrinsics.checkNotNull(channel);
            ByteBuffer byteBufferT = w0Var.t(channel, 0L, 64);
            if (byteBufferT.getInt(0) != 1179403647 || byteBufferT.get(4) != 2 || byteBufferT.get(5) != 1) {
                throw new IllegalArgumentException("not a little-endian ELF64");
            }
            long j11 = byteBufferT.getLong(32);
            short s8 = byteBufferT.getShort(54);
            short s10 = byteBufferT.getShort(56);
            long j12 = byteBufferT.getLong(40);
            short s11 = byteBufferT.getShort(58);
            short s12 = byteBufferT.getShort(60);
            short s13 = byteBufferT.getShort(62);
            if (56 > s8 || s8 >= 257 || 64 > s11 || s11 >= 257 || 1 > s10 || s10 >= 65 || 1 > s12 || s12 >= 4097 || s13 < 0 || s13 >= s12) {
                throw new IllegalArgumentException("unexpected ELF header");
            }
            if (w0Var.e(j11, ((long) s10) * ((long) s8), size)) {
                if (w0Var.e(j12, ((long) s12) * ((long) s11), size)) {
                    ByteBuffer byteBufferT2 = w0Var.t(channel, j11, s8 * s10);
                    ByteBuffer byteBufferT3 = w0Var.t(channel, j12, s11 * s12);
                    int i11 = s13 * s11;
                    long j13 = byteBufferT3.getLong(i11 + 24);
                    long j14 = byteBufferT3.getLong(i11 + 32);
                    if (1 > j14 || j14 >= 1048577 || !w0Var.e(j13, j14, size)) {
                        throw new IllegalArgumentException("bad .shstrtab");
                    }
                    ByteBuffer byteBufferT4 = w0Var.t(channel, j13, (int) j14);
                    IntRange intRangeQ = p001kotlin.ranges.d.q(0, s12);
                    ArrayList arrayList = new ArrayList();
                    for (Integer num : intRangeQ) {
                        int iIntValue = num.intValue() * s11;
                        if ((byteBufferT3.getLong(iIntValue + 8) & 2) != 0 && byteBufferT3.getInt(iIntValue + 4) != 8) {
                            arrayList.add(num);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(p001kotlin.collections.q.u(arrayList, 10));
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj = arrayList.get(i12);
                        i12++;
                        int iIntValue2 = ((Number) obj).intValue();
                        String strN = n(byteBufferT3, s11, byteBufferT4, iIntValue2);
                        int i13 = iIntValue2 * s11;
                        arrayList2.add(new b(strN, byteBufferT3.getLong(i13 + 24), byteBufferT3.getLong(i13 + 32)));
                    }
                    ArrayList arrayList3 = new ArrayList();
                    int size3 = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size3) {
                        Object obj2 = arrayList2.get(i14);
                        int i15 = i14 + 1;
                        b bVar = (b) obj2;
                        if (bVar.getSize() > 0 && f19604a.e(bVar.getOffset(), bVar.getSize(), size)) {
                            arrayList3.add(obj2);
                        }
                        i14 = i15;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Set setG = p001kotlin.collections.q0.g(".dynsym", ".gnu.version", ".gnu.version_d", ".gnu.version_r", ".gnu.hash", ".hash", ".dynstr", ".rela.dyn", ".rela.plt", ".relr.dyn");
                    arrayList4.add(new a(lib, 0L, Math.min(4096L, size)));
                    ArrayList arrayList5 = new ArrayList();
                    int size4 = arrayList3.size();
                    int i16 = 0;
                    while (i16 < size4) {
                        Object obj3 = arrayList3.get(i16);
                        i16++;
                        if (setG.contains(((b) obj3).getName())) {
                            arrayList5.add(obj3);
                        }
                    }
                    int size5 = arrayList5.size();
                    int i17 = 0;
                    while (i17 < size5) {
                        b bVar2 = (b) arrayList5.get(i17);
                        arrayList4.add(new a(lib, bVar2.getOffset(), bVar2.getSize()));
                        i17++;
                        arrayList5 = arrayList5;
                    }
                    int i18 = 0;
                    while (i18 < s10) {
                        int i19 = i18 * s8;
                        long j15 = byteBufferT2.getLong(i19 + 8);
                        long j16 = byteBufferT2.getLong(i19 + 32);
                        if (byteBufferT2.getInt(i19) != 1 || (byteBufferT2.getInt(i19 + 4) & 2) == 0) {
                            j10 = size;
                            i10 = i18;
                        } else {
                            long j17 = size;
                            i10 = i18;
                            j10 = j17;
                            if (f19604a.e(j15, j16, j17)) {
                                arrayList4.add(new a(lib, j15, j16));
                            }
                        }
                        i18 = i10 + 1;
                        size = j10;
                    }
                    ArrayList arrayList6 = new ArrayList();
                    int size6 = arrayList3.size();
                    int i20 = 0;
                    while (i20 < size6) {
                        Object obj4 = arrayList3.get(i20);
                        i20++;
                        if (Intrinsics.c(((b) obj4).getName(), ".text.startup")) {
                            arrayList6.add(obj4);
                        }
                    }
                    int size7 = arrayList6.size();
                    for (int i21 = 0; i21 < size7; i21++) {
                        b bVar3 = (b) arrayList6.get(i21);
                        arrayList4.add(new a(lib, bVar3.getOffset(), bVar3.getSize()));
                    }
                    int size8 = arrayList3.size();
                    int i22 = 0;
                    while (i22 < size8) {
                        Object obj5 = arrayList3.get(i22);
                        i22++;
                        if (Intrinsics.c(((b) obj5).getName(), ".text")) {
                            b bVar4 = (b) obj5;
                            long jMin = Math.min(bVar4.getSize(), hotTextBytes);
                            arrayList4.add(new a(lib, bVar4.getOffset(), jMin));
                            ArrayList arrayList7 = new ArrayList();
                            int size9 = arrayList3.size();
                            int i23 = 0;
                            while (i23 < size9) {
                                Object obj6 = arrayList3.get(i23);
                                i23++;
                                if (Intrinsics.c(((b) obj6).getName(), ".rodata")) {
                                    arrayList7.add(obj6);
                                }
                            }
                            int size10 = arrayList7.size();
                            for (int i24 = 0; i24 < size10; i24++) {
                                b bVar5 = (b) arrayList7.get(i24);
                                arrayList4.add(new a(lib, bVar5.getOffset(), bVar5.getSize()));
                            }
                            arrayList4.add(new a(lib, bVar4.getOffset() + jMin, bVar4.getSize() - jMin));
                            lu.c.a(randomAccessFile, null);
                            return arrayList4;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            throw new IllegalArgumentException("truncated ELF");
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                lu.c.a(randomAccessFile, th2);
                throw th3;
            }
        }
    }

    public final List<a> o(Context context) {
        try {
            return r(context);
        } catch (Exception e10) {
            Log.w("RbxLibPrewarm", "can't plan the graphics prefetch", e10);
            return p001kotlin.collections.p.k();
        }
    }

    @NotNull
    public final List<a> p(@NotNull File lib, long hotTextBytes) {
        Intrinsics.checkNotNullParameter(lib, "lib");
        try {
            List<a> listM = m(lib, hotTextBytes);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM) {
                if (((a) obj).getLength() > 0) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        } catch (Exception e10) {
            Log.w("RbxLibPrewarm", "can't parse " + lib.getName() + ", prefetching it in file order", e10);
            return p001kotlin.collections.o.d(new a(lib, 0L, lib.length()));
        }
    }

    public final List<a> r(Context context) throws IOException {
        if (!context.getPackageManager().hasSystemFeature("android.hardware.vulkan.version", 4198400)) {
            return p001kotlin.collections.p.k();
        }
        ArrayList arrayList = new ArrayList();
        try {
            AssetFileDescriptor assetFileDescriptorOpenFd = context.getAssets().openFd("shaders/shaders_vulkan_mobile.pack");
            try {
                arrayList.add(new a(new File(context.getApplicationInfo().sourceDir), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength()));
                Unit unit = Unit.f21506a;
                lu.c.a(assetFileDescriptorOpenFd, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    lu.c.a(assetFileDescriptorOpenFd, th2);
                    throw th3;
                }
            }
        } catch (Exception e10) {
            Log.w("RbxLibPrewarm", "no stored shaders/shaders_vulkan_mobile.pack to prefetch", e10);
        }
        File[] fileArrListFiles = new File(Process.is64Bit() ? "/vendor/lib64/hw" : "/vendor/lib/hw").listFiles(new FileFilter() { // from class: ik.v0
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                return w0.s(file);
            }
        });
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        if (fileArrListFiles.length == 1) {
            File canonicalFile = fileArrListFiles[0].getCanonicalFile();
            if (canonicalFile.isFile()) {
                Intrinsics.checkNotNull(canonicalFile);
                arrayList.add(new a(canonicalFile, 0L, canonicalFile.length()));
            }
        }
        return arrayList;
    }

    public final ByteBuffer t(FileChannel ch2, long offset, int length) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(length).order(ByteOrder.LITTLE_ENDIAN);
        while (byteBufferOrder.hasRemaining() && ch2.read(byteBufferOrder, ((long) byteBufferOrder.position()) + offset) >= 0) {
        }
        byteBufferOrder.flip();
        Intrinsics.checkNotNull(byteBufferOrder);
        return byteBufferOrder;
    }

    public final void u(List<a> ranges, final AtomicLong read, final AtomicLong skipped) throws InterruptedException {
        final ArrayList arrayList = new ArrayList();
        for (a aVar : ranges) {
            long j10 = 0;
            while (j10 < aVar.getLength()) {
                long jMin = Math.min(1048576L, aVar.getLength() - j10);
                arrayList.add(new a(aVar.getFile(), aVar.getOffset() + j10, jMin));
                j10 += jMin;
            }
        }
        int i10 = 0;
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        final Runnable runnable = new Runnable() { // from class: ik.t0
            @Override // java.lang.Runnable
            public final void run() {
                w0.v(arrayList, atomicInteger, skipped, read);
            }
        };
        IntRange intRangeQ = p001kotlin.ranges.d.q(1, 2);
        ArrayList arrayList2 = new ArrayList(p001kotlin.collections.q.u(intRangeQ, 10));
        Iterator<Integer> it = intRangeQ.iterator();
        while (it.hasNext()) {
            arrayList2.add(du.a.b(false, true, null, "RbxLibPrefetch" + ((p001kotlin.collections.e0) it).nextInt(), 0, new Function0() { // from class: ik.u0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return w0.w(runnable);
                }
            }, 21, null));
        }
        runnable.run();
        int size = arrayList2.size();
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ((Thread) obj).join();
        }
    }

    public final void x(File libFile) {
        av.k.d(av.q0.a(av.g1.b()), null, null, new c(libFile, null), 3, null);
    }

    public final void y(final Context context, final File libFile) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        du.a.b(false, true, null, "RbxLibPrefetch", 0, new Function0() { // from class: ik.s0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w0.z(libFile, context, jElapsedRealtime);
            }
        }, 21, null);
        orderedPrefetchStartMs = jElapsedRealtime;
    }
}
