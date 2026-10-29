package bk;

import com.roblox.engine.jni.NativeGLInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003R(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lbk/b;", "", "<init>", "()V", "", "a", "Lkotlin/Function0;", "b", "Lkotlin/jvm/functions/Function0;", "getScreenTimeStartByGuacDelegate", "()Lkotlin/jvm/functions/Function0;", "setScreenTimeStartByGuacDelegate", "(Lkotlin/jvm/functions/Function0;)V", "screenTimeStartByGuacDelegate", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f4205a = new b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static Function0<Unit> screenTimeStartByGuacDelegate = a.f4206a;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a extends k implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f4206a = new a();

        public a() {
            super(0, NativeGLInterface.class, "screenTimeStartByGuac", "screenTimeStartByGuac()V", 0);
        }

        public final void d() {
            NativeGLInterface.screenTimeStartByGuac();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            d();
            return Unit.f22483a;
        }
    }

    public static final void a() {
        screenTimeStartByGuacDelegate.invoke();
    }
}
