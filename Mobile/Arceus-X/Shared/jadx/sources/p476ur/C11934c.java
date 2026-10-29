package p476ur;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7342i;
import p229jt.InterfaceC7341h;

/* JADX INFO: renamed from: ur.c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0015\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005\"\u001b\u0010\u000b\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m31665d2 = {"Ljava/lang/Class;", "c", "()Ljava/lang/Class;", "Lur/a;", "b", "()Lur/a;", "", "a", "Ljt/h;", "d", "()Z", "webRtcWrapperExists", "webrtc_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11934c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final InterfaceC7341h f42343a = C7342i.m30456b(new Function0() { // from class: ur.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(C11934c.m44548e());
        }
    });

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final InterfaceC11932a m44545b() {
        Class<?> clsM44546c = m44546c();
        Object objNewInstance = clsM44546c != null ? clsM44546c.newInstance() : null;
        if (objNewInstance instanceof InterfaceC11932a) {
            return (InterfaceC11932a) objNewInstance;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final Class<?> m44546c() {
        try {
            return Class.forName("com.withpersona.sdk2.inquiry.webrtc.impl.WebRtcManager");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m44547d() {
        return ((Boolean) f42343a.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m44548e() {
        return m44546c() != null;
    }
}
