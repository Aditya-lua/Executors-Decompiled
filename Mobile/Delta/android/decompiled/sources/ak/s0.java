package ak;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lak/s0;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "c", "(Landroid/content/Context;)Z", "b", "", "d", "(Landroid/content/Context;)V", "", "a", "(Landroid/content/Context;)Ljava/lang/String;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final s0 f638a = new s0();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.startup.LibRobloxPrewarm$startPrewarmThread$1", f = "LibRobloxPrewarm.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends pt.m implements Function2<ku.p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f639t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ File f640u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File file, nt.b<? super a> bVar) {
            super(2, bVar);
            this.f640u = file;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new a(this.f640u, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f639t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(this.f640u, "r");
                try {
                    FileChannel channel = randomAccessFile.getChannel();
                    try {
                        channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size()).load();
                        ut.c.a(channel, null);
                        ut.c.a(randomAccessFile, null);
                        return Unit.f22483a;
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            ut.c.a(channel, th2);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        ut.c.a(randomAccessFile, th4);
                        throw th5;
                    }
                }
            } catch (Exception e10) {
                Log.e("RbxLibPrewarm", "prewarm failed", e10);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku.p0 p0Var, nt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public static final boolean b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getSharedPreferences("prefs", 0).getString("channel", "");
        return kotlin.text.x.T(string != null ? string : "", "zgooglebinary", false, 2, null);
    }

    public static final boolean c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return !StringsKt.a0(f638a.a(context), ":", false, 2, null);
    }

    public static final void d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ku.k.d(ku.q0.a(ku.g1.b()), null, null, new a(new File(context.getApplicationInfo().nativeLibraryDir, System.mapLibraryName("roblox")), null), 3, null);
    }

    public final String a(Context context) {
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
        return str == null ? "" : str;
    }
}
