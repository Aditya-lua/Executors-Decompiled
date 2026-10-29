package p015ak;

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
import kotlin.text.C7797x;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p229jt.C7348o;
import p256ku.C7864g1;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p477ut.C11958c;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: ak.s0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m31665d2 = {"Lak/s0;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "c", "(Landroid/content/Context;)Z", "b", "", "d", "(Landroid/content/Context;)V", "", "a", "(Landroid/content/Context;)Ljava/lang/String;", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C0333s0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C0333s0 f839a = new C0333s0();

    /* JADX INFO: renamed from: ak.s0$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.startup.LibRobloxPrewarm$startPrewarmThread$1", m39664f = "LibRobloxPrewarm.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f840t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ File f841u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File file, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f841u = file;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new a(this.f841u, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f840t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(this.f841u, "r");
                try {
                    FileChannel channel = randomAccessFile.getChannel();
                    try {
                        channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size()).load();
                        C11958c.m44629a(channel, null);
                        C11958c.m44629a(randomAccessFile, null);
                        return Unit.f29331a;
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            C11958c.m44629a(channel, th2);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        C11958c.m44629a(randomAccessFile, th4);
                        throw th5;
                    }
                }
            } catch (Exception e10) {
                Log.e("RbxLibPrewarm", "prewarm failed", e10);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m1330b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getSharedPreferences("prefs", 0).getString("channel", "");
        return C7797x.m32309T(string != null ? string : "", "zgooglebinary", false, 2, null);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m1331c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return !StringsKt.m32152a0(f839a.m1333a(context), ":", false, 2, null);
    }

    /* JADX INFO: renamed from: d */
    public static final void m1332d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C7882k.m32780d(C7910q0.m32885a(C7864g1.m32644b()), null, null, new a(new File(context.getApplicationInfo().nativeLibraryDir, System.mapLibraryName("roblox")), null), 3, null);
    }

    /* JADX INFO: renamed from: a */
    public final String m1333a(Context context) {
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
