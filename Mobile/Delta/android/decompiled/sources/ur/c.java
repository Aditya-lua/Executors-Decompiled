package ur;

import jt.h;
import jt.i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0015\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005\"\u001b\u0010\u000b\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Ljava/lang/Class;", "c", "()Ljava/lang/Class;", "Lur/a;", "b", "()Lur/a;", "", "a", "Ljt/h;", "d", "()Z", "webRtcWrapperExists", "webrtc_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h f32586a = i.b(new Function0() { // from class: ur.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(c.e());
        }
    });

    @Nullable
    public static final a b() {
        Class<?> clsC = c();
        Object objNewInstance = clsC != null ? clsC.newInstance() : null;
        if (objNewInstance instanceof a) {
            return (a) objNewInstance;
        }
        return null;
    }

    public static final Class<?> c() {
        try {
            return Class.forName("com.withpersona.sdk2.inquiry.webrtc.impl.WebRtcManager");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final boolean d() {
        return ((Boolean) f32586a.getValue()).booleanValue();
    }

    public static final boolean e() {
        return c() != null;
    }
}
