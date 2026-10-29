package p114f0;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p140g0.C5886g0;
import p296n0.InterfaceC8795n1;

/* JADX INFO: renamed from: f0.j */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\"\"\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m31665d2 = {"Lg0/g0;", "Lf0/i;", "a", "(Lg0/g0;)Lf0/i;", "Ln0/n1$a;", "Ln0/n1$a;", "getOPTION_CAPTURE_REQUEST_CONFIGURATOR", "()Ln0/n1$a;", "OPTION_CAPTURE_REQUEST_CONFIGURATOR", "camera-camera2_release"}, m31666k = 2, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C5231j {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final InterfaceC8795n1.a<InterfaceC5230i> f20282a;

    static {
        InterfaceC8795n1.a<InterfaceC5230i> aVarM35291a = InterfaceC8795n1.a.m35291a("camerax.core.appConfig.captureRequestConfigurator", InterfaceC5230i.class);
        Intrinsics.checkNotNullExpressionValue(aVarM35291a, "create(...)");
        f20282a = aVarM35291a;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final InterfaceC5230i m24212a(@NotNull C5886g0 c5886g0) {
        Intrinsics.checkNotNullParameter(c5886g0, "<this>");
        return (InterfaceC5230i) c5886g0.mo6691n().mo35030h(f20282a, null);
    }
}
