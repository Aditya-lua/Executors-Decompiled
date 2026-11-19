package yv;

import android.util.Log;
import com.github.luben.zstd.BuildConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import mv.d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.collections.k0;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;
import p001kotlin.text.c0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u0003J\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001a¨\u0006\u001c"}, d2 = {"Lyv/c;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "loggerName", BuildConfig.FLAVOR, "logLevel", "message", BuildConfig.FLAVOR, "t", BuildConfig.FLAVOR, "a", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V", "b", "d", "(Ljava/lang/String;)Ljava/lang/String;", "logger", "tag", "c", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Ljava/util/logging/Logger;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "configuredLoggers", BuildConfig.FLAVOR, "Ljava/util/Map;", "knownLoggers", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f38205a = new c();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final CopyOnWriteArraySet<Logger> configuredLoggers = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Map<String, String> knownLoggers;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r10 = d0.class.getPackage();
        String name = r10 != null ? r10.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(d0.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(uv.f.class.getName(), "okhttp.Http2");
        linkedHashMap.put(qv.d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        knownLoggers = k0.w(linkedHashMap);
    }

    public final void a(@NotNull String loggerName, int logLevel, @NotNull String message, @Nullable Throwable t8) {
        int iMin;
        Intrinsics.checkNotNullParameter(loggerName, "loggerName");
        Intrinsics.checkNotNullParameter(message, "message");
        String strD = d(loggerName);
        if (Log.isLoggable(strD, logLevel)) {
            if (t8 != null) {
                message = message + '\n' + Log.getStackTraceString(t8);
            }
            String str = message;
            int length = str.length();
            int i10 = 0;
            while (i10 < length) {
                int iM0 = StringsKt.m0(str, '\n', i10, false, 4, null);
                if (iM0 == -1) {
                    iM0 = length;
                }
                while (true) {
                    iMin = Math.min(iM0, i10 + 4000);
                    String strSubstring = str.substring(i10, iMin);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    Log.println(logLevel, strD, strSubstring);
                    if (iMin >= iM0) {
                        break;
                    } else {
                        i10 = iMin;
                    }
                }
                i10 = iMin + 1;
            }
        }
    }

    public final void b() {
        try {
            for (Map.Entry<String, String> entry : knownLoggers.entrySet()) {
                c(entry.getKey(), entry.getValue());
            }
        } catch (RuntimeException e10) {
            System.err.println("Possibly running android unit test without robolectric");
            e10.printStackTrace();
        } catch (UnsatisfiedLinkError e11) {
            System.err.println("Possibly running android unit test without robolectric");
            e11.printStackTrace();
        }
    }

    public final void c(String logger, String tag) {
        Level level;
        Logger logger2 = Logger.getLogger(logger);
        if (configuredLoggers.add(logger2)) {
            logger2.setUseParentHandlers(false);
            if (Log.isLoggable(tag, 3)) {
                level = Level.FINE;
            } else {
                level = Log.isLoggable(tag, 4) ? Level.INFO : Level.WARNING;
            }
            logger2.setLevel(level);
            logger2.addHandler(d.f38207a);
        }
    }

    public final String d(String loggerName) {
        String str = knownLoggers.get(loggerName);
        return str == null ? c0.z1(loggerName, 23) : str;
    }
}
