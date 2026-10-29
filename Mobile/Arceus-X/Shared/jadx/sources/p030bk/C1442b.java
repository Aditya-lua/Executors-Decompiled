package p030bk;

import com.roblox.engine.jni.NativeGLInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7744k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: bk.b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003R(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m31665d2 = {"Lbk/b;", "", "<init>", "()V", "", "a", "Lkotlin/Function0;", "b", "Lkotlin/jvm/functions/Function0;", "getScreenTimeStartByGuacDelegate", "()Lkotlin/jvm/functions/Function0;", "setScreenTimeStartByGuacDelegate", "(Lkotlin/jvm/functions/Function0;)V", "screenTimeStartByGuacDelegate", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C1442b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C1442b f5644a = new C1442b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static Function0<Unit> screenTimeStartByGuacDelegate = a.f5646a;

    /* JADX INFO: renamed from: bk.b$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a extends C7744k implements Function0<Unit> {

        /* JADX INFO: renamed from: a */
        public static final a f5646a = new a();

        public a() {
            super(0, NativeGLInterface.class, "screenTimeStartByGuac", "screenTimeStartByGuac()V", 0);
        }

        /* JADX INFO: renamed from: d */
        public final void m7449d() {
            NativeGLInterface.screenTimeStartByGuac();
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m7449d();
            return Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m7448a() {
        screenTimeStartByGuacDelegate.invoke();
    }
}
