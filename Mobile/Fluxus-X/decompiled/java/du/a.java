package du;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aQ\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {BuildConfig.FLAVOR, "start", "isDaemon", "Ljava/lang/ClassLoader;", "contextClassLoader", BuildConfig.FLAVOR, "name", BuildConfig.FLAVOR, "priority", "Lkotlin/Function0;", BuildConfig.FLAVOR, "block", "Ljava/lang/Thread;", "a", "(ZZLjava/lang/ClassLoader;Ljava/lang/String;ILkotlin/jvm/functions/Function0;)Ljava/lang/Thread;", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: du.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"du/a$a", "Ljava/lang/Thread;", BuildConfig.FLAVOR, "run", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0234a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f12692a;

        public C0234a(Function0<Unit> function0) {
            this.f12692a = function0;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f12692a.invoke();
        }
    }

    @NotNull
    public static final Thread a(boolean z10, boolean z11, @Nullable ClassLoader classLoader, @Nullable String str, int i10, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        C0234a c0234a = new C0234a(block);
        if (z11) {
            c0234a.setDaemon(true);
        }
        if (i10 > 0) {
            c0234a.setPriority(i10);
        }
        if (str != null) {
            c0234a.setName(str);
        }
        if (classLoader != null) {
            c0234a.setContextClassLoader(classLoader);
        }
        if (z10) {
            c0234a.start();
        }
        return c0234a;
    }

    public static /* synthetic */ Thread b(boolean z10, boolean z11, ClassLoader classLoader, String str, int i10, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            classLoader = null;
        }
        if ((i11 & 8) != 0) {
            str = null;
        }
        if ((i11 & 16) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        String str2 = str;
        return a(z10, z11, classLoader, str2, i12, function0);
    }
}
