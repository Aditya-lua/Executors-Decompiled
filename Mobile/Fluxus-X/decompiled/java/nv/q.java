package nv;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import ew.l0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import mv.d0;
import mv.h0;
import mv.s;
import mv.y;
import mv.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.collections.e0;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.jvm.internal.g0;
import p001kotlin.ranges.IntRange;
import p001kotlin.text.Charsets;
import p001kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\t\u001a\u00020\u0000*\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0014\u001a\u00020\u0012*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0019\u0010 \u001a\u00020\u001f*\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0000¢\u0006\u0004\b \u0010!\u001a\u0019\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d*\u00020\u001fH\u0000¢\u0006\u0004\b\"\u0010#\u001a\u001b\u0010%\u001a\u00020\u0002*\u00020\u00072\u0006\u0010$\u001a\u00020\u0007H\u0000¢\u0006\u0004\b%\u0010&\u001a\u0013\u0010)\u001a\u00020(*\u00020'H\u0000¢\u0006\u0004\b)\u0010*\u001a#\u0010-\u001a\u00020\u0002*\u00020+2\u0006\u0010\u0017\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u0018H\u0000¢\u0006\u0004\b-\u0010.\u001a#\u00100\u001a\u00020\u0002*\u00020+2\u0006\u0010/\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u0018H\u0000¢\u0006\u0004\b0\u0010.\u001a\u001b\u00103\u001a\u00020\u0002*\u0002012\u0006\u00102\u001a\u00020\u0011H\u0000¢\u0006\u0004\b3\u00104\u001a\u0013\u00106\u001a\u00020\u0016*\u000205H\u0000¢\u0006\u0004\b6\u00107\u001a%\u00109\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d\"\u0004\b\u0000\u00108*\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0000¢\u0006\u0004\b9\u0010:\u001a/\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d\"\u0004\b\u0000\u001082\u0012\u0010;\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\f\"\u00028\u0000H\u0001¢\u0006\u0004\b<\u0010=\u001a)\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d\"\u0004\b\u0000\u00108*\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\fH\u0000¢\u0006\u0004\b>\u0010=\u001a\u0013\u0010@\u001a\u00020?*\u000201H\u0000¢\u0006\u0004\b@\u0010A\u001a\u0013\u0010C\u001a\u00020?*\u00020BH\u0000¢\u0006\u0004\bC\u0010D\"\u0014\u0010H\u001a\u00020E8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bF\u0010G\"\u0014\u0010K\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bI\u0010J\"\u0014\u0010M\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b)\u0010L¨\u0006N"}, d2 = {BuildConfig.FLAVOR, "name", BuildConfig.FLAVOR, "daemon", "Ljava/util/concurrent/ThreadFactory;", "p", "(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;", "Lmv/z;", "includeDefaultPort", "t", "(Lmv/z;Z)Ljava/lang/String;", "format", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "args", "j", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Lew/g;", "Ljava/nio/charset/Charset;", "default", "n", "(Lew/g;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;", BuildConfig.FLAVOR, "duration", "Ljava/util/concurrent/TimeUnit;", "unit", BuildConfig.FLAVOR, "g", "(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I", BuildConfig.FLAVOR, "Luv/d;", "Lmv/y;", "s", "(Ljava/util/List;)Lmv/y;", "r", "(Lmv/y;)Ljava/util/List;", "other", "f", "(Lmv/z;Lmv/z;)Z", "Lmv/s;", "Lmv/s$d;", "c", "(Lmv/s;)Lmv/s$d;", "Lew/l0;", "timeUnit", "o", "(Lew/l0;ILjava/util/concurrent/TimeUnit;)Z", "timeout", "i", "Ljava/net/Socket;", Payload.SOURCE, "m", "(Ljava/net/Socket;Lew/g;)Z", "Lmv/h0;", "k", "(Lmv/h0;)J", "T", "v", "(Ljava/util/List;)Ljava/util/List;", "elements", "l", "([Ljava/lang/Object;)Ljava/util/List;", "w", BuildConfig.FLAVOR, "h", "(Ljava/net/Socket;)V", "Lmv/q;", "e", "(Lmv/q;)V", "Ljava/util/TimeZone;", "a", "Ljava/util/TimeZone;", "UTC", "b", "Z", "assertionsEnabled", "Ljava/lang/String;", "okHttpName", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final TimeZone f26639a;
    public static final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f26640c;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Intrinsics.checkNotNull(timeZone);
        f26639a = timeZone;
        b = false;
        String name = d0.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        f26640c = StringsKt.H0(StringsKt.G0(name, "okhttp3."), "Client");
    }

    @NotNull
    public static final s.d c(@NotNull final s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        return new s.d() { // from class: nv.o
            @Override // mv.s.d
            public final s a(mv.e eVar) {
                return q.d(sVar, eVar);
            }
        };
    }

    public static final s d(s sVar, mv.e it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return sVar;
    }

    public static final void e(@NotNull mv.q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        if (b && Thread.holdsLock(qVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + qVar);
        }
    }

    public static final boolean f(@NotNull z zVar, @NotNull z other) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.c(zVar.getHost(), other.getHost()) && zVar.getPort() == other.getPort() && Intrinsics.c(zVar.getScheme(), other.getScheme());
    }

    public static final int g(@NotNull String name, long j10, @NotNull TimeUnit unit) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j10 < 0) {
            throw new IllegalStateException((name + " < 0").toString());
        }
        long millis = unit.toMillis(j10);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException((name + " too large").toString());
        }
        if (millis != 0 || j10 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException((name + " too small").toString());
    }

    public static final void h(@NotNull Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!Intrinsics.c(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final boolean i(@NotNull l0 l0Var, int i10, @NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(l0Var, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        try {
            return o(l0Var, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    @NotNull
    public static final String j(@NotNull String format, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        g0 g0Var = g0.f21582a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static final long k(@NotNull h0 h0Var) {
        Intrinsics.checkNotNullParameter(h0Var, "<this>");
        String strA = h0Var.getHeaders().a("Content-Length");
        if (strA != null) {
            return n.C(strA, -1L);
        }
        return -1L;
    }

    @SafeVarargs
    @NotNull
    public static final <T> List<T> l(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return w(elements);
    }

    public static final boolean m(@NotNull Socket socket, @NotNull ew.g source) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !source.c2();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    @NotNull
    public static final Charset n(@NotNull ew.g gVar, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(charset, "default");
        int iJ1 = gVar.J1(n.m());
        if (iJ1 == -1) {
            return charset;
        }
        if (iJ1 == 0) {
            return Charsets.UTF_8;
        }
        if (iJ1 == 1) {
            return Charsets.UTF_16BE;
        }
        if (iJ1 == 2) {
            return Charsets.f21607a.b();
        }
        if (iJ1 == 3) {
            return Charsets.UTF_16LE;
        }
        if (iJ1 == 4) {
            return Charsets.f21607a.a();
        }
        throw new AssertionError();
    }

    public static final boolean o(@NotNull l0 l0Var, int i10, @NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(l0Var, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = l0Var.t().getHasDeadline() ? l0Var.t().c() - jNanoTime : Long.MAX_VALUE;
        l0Var.t().d(Math.min(jC, timeUnit.toNanos(i10)) + jNanoTime);
        try {
            ew.e eVar = new ew.e();
            while (l0Var.f3(eVar, 8192L) != -1) {
                eVar.a();
            }
            if (jC == Long.MAX_VALUE) {
                l0Var.t().a();
                return true;
            }
            l0Var.t().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                l0Var.t().a();
                return false;
            }
            l0Var.t().d(jNanoTime + jC);
            return false;
        } catch (Throwable th2) {
            if (jC == Long.MAX_VALUE) {
                l0Var.t().a();
            } else {
                l0Var.t().d(jNanoTime + jC);
            }
            throw th2;
        }
    }

    @NotNull
    public static final ThreadFactory p(@NotNull final String name, final boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ThreadFactory() { // from class: nv.p
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return q.q(name, z10, runnable);
            }
        };
    }

    public static final Thread q(String str, boolean z10, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z10);
        return thread;
    }

    @NotNull
    public static final List<uv.d> r(@NotNull y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        IntRange intRangeQ = p001kotlin.ranges.d.q(0, yVar.size());
        ArrayList arrayList = new ArrayList(p001kotlin.collections.q.u(intRangeQ, 10));
        Iterator<Integer> it = intRangeQ.iterator();
        while (it.hasNext()) {
            int iNextInt = ((e0) it).nextInt();
            arrayList.add(new uv.d(yVar.c(iNextInt), yVar.g(iNextInt)));
        }
        return arrayList;
    }

    @NotNull
    public static final y s(@NotNull List<uv.d> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        y.a aVar = new y.a();
        for (uv.d dVar : list) {
            aVar.d(dVar.getName().P(), dVar.getValue().P());
        }
        return aVar.f();
    }

    @NotNull
    public static final String t(@NotNull z zVar, boolean z10) {
        String host;
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        if (StringsKt.a0(zVar.getHost(), ":", false, 2, null)) {
            host = '[' + zVar.getHost() + ']';
        } else {
            host = zVar.getHost();
        }
        if (!z10 && zVar.getPort() == z.INSTANCE.b(zVar.getScheme())) {
            return host;
        }
        return host + ':' + zVar.getPort();
    }

    public static /* synthetic */ String u(z zVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return t(zVar, z10);
    }

    @NotNull
    public static final <T> List<T> v(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return p001kotlin.collections.p.k();
        }
        if (list.size() == 1) {
            List<T> listSingletonList = Collections.singletonList(list.get(0));
            Intrinsics.checkNotNullExpressionValue(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        Object[] array = list.toArray();
        Intrinsics.checkNotNullExpressionValue(array, "toArray(...)");
        List<T> listUnmodifiableList = Collections.unmodifiableList(p001kotlin.collections.l.e(array));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(...)");
        Intrinsics.d(listUnmodifiableList, "null cannot be cast to non-null type kotlin.collections.List<T of okhttp3.internal._UtilJvmKt.toImmutableList>");
        return listUnmodifiableList;
    }

    @NotNull
    public static final <T> List<T> w(@Nullable T[] tArr) {
        if (tArr == null || tArr.length == 0) {
            return p001kotlin.collections.p.k();
        }
        if (tArr.length == 1) {
            List<T> listSingletonList = Collections.singletonList(tArr[0]);
            Intrinsics.checkNotNullExpressionValue(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        List<T> listUnmodifiableList = Collections.unmodifiableList(p001kotlin.collections.l.e((Object[]) tArr.clone()));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }
}
