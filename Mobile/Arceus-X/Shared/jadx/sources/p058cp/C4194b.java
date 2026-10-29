package p058cp;

import android.content.Context;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p110eo.C5173a;
import p477ut.C11966k;

/* JADX INFO: renamed from: cp.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\bJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\bR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R(\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m31665d2 = {"Lcp/b;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "d", "()V", "", "e", "c", "(Ljava/lang/Throwable;)V", "g", "b", "", "a", "Z", "isExceptionHandlerRegistered", "isErrorHandlerEnabled", "Leo/a;", "Leo/a;", "exceptionLogger", "", "Ljava/io/File;", "Ljava/util/List;", "getDirectoriesToDeleteOnError", "()Ljava/util/List;", "f", "(Ljava/util/List;)V", "directoriesToDeleteOnError", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4194b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean isExceptionHandlerRegistered;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean isErrorHandlerEnabled;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C5173a exceptionLogger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public List<? extends File> directoriesToDeleteOnError;

    public C4194b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.isErrorHandlerEnabled = true;
        this.exceptionLogger = new C5173a(context);
        this.directoriesToDeleteOnError = C7699p.m31892k();
    }

    /* JADX INFO: renamed from: e */
    public static final void m21684e(C4194b c4194b, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th2) {
        Intrinsics.checkNotNull(th2);
        c4194b.m21686c(th2);
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        } else {
            System.exit(1);
            throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m21685b() {
        this.exceptionLogger.m24048a();
    }

    /* JADX INFO: renamed from: c */
    public final void m21686c(@NotNull Throwable e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        if (this.isErrorHandlerEnabled) {
            try {
                this.exceptionLogger.m24054g(e10);
            } catch (Exception unused) {
            }
            try {
                Iterator<T> it = this.directoriesToDeleteOnError.iterator();
                while (it.hasNext()) {
                    C11966k.m44657o((File) it.next());
                }
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m21687d() {
        if (this.isExceptionHandlerRegistered) {
            return;
        }
        this.isExceptionHandlerRegistered = true;
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: cp.a
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th2) {
                C4194b.m21684e(this.f17915a, defaultUncaughtExceptionHandler, thread, th2);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final void m21688f(@NotNull List<? extends File> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.directoriesToDeleteOnError = list;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m21689g() {
        if (this.isExceptionHandlerRegistered) {
            this.isErrorHandlerEnabled = false;
        }
    }
}
