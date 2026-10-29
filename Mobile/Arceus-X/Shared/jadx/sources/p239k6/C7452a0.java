package p239k6;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p027b7.InterfaceC1252d;
import p256ku.InterfaceC7934w0;
import p287m6.C8429c;
import p287m6.C8450x;
import p287m6.InterfaceC8441o;
import p323o6.C9693a;
import p323o6.C9694b;
import p323o6.C9698f;
import p323o6.C9700h;
import p323o6.C9706n;
import p372q6.C10436a;
import p403r6.C10786a;
import p403r6.C10790e;
import p478uu.C11981l;
import p478uu.InterfaceC11977h;
import p537x6.C12749j;
import p537x6.C12754o;
import p537x6.C12763x;
import p537x6.ImageRequest;
import p537x6.InterfaceC12743d;
import p537x6.InterfaceC12750k;
import p568y6.InterfaceC13112k;

/* JADX INFO: renamed from: k6.a0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000e\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0010\u001a\u00020\u0002*\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m31665d2 = {"Lx6/g;", "request", "", "d", "(Lx6/g;)Z", "Lku/w0;", "Lx6/k;", "job", "Lx6/d;", "c", "(Lx6/g;Lku/w0;)Lx6/d;", "Lk6/h$a;", "Lk6/w$a;", "options", "a", "(Lk6/h$a;Lk6/w$a;)Lk6/h$a;", "b", "(Lk6/w$a;)Z", "coil-core_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7452a0 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final C7465h.a m30972a(@NotNull C7465h.a aVar, @NotNull C7483w.Options options) {
        aVar.m31010k(new C10786a(), C7731d0.m32002b(Uri.class));
        aVar.m31010k(new C10790e(), C7731d0.m32002b(Integer.class));
        aVar.m31009j(new C10436a(), C7731d0.m32002b(C7466h0.class));
        aVar.m31007h(new C9693a.a(), C7731d0.m32002b(C7466h0.class));
        aVar.m31007h(new C9698f.a(), C7731d0.m32002b(C7466h0.class));
        aVar.m31007h(new C9706n.a(), C7731d0.m32002b(C7466h0.class));
        aVar.m31007h(new C9700h.a(), C7731d0.m32002b(Drawable.class));
        aVar.m31007h(new C9694b.a(), C7731d0.m32002b(Bitmap.class));
        InterfaceC11977h interfaceC11977hM44724b = C11981l.m44724b(C7481u.m31083b(options), 0, 2, null);
        if (m30973b(options)) {
            aVar.m31006g(new C8450x.a(interfaceC11977hM44724b));
        }
        aVar.m31006g(new C8429c.c(interfaceC11977hM44724b, C7481u.m31082a(options)));
        return aVar;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m30973b(C7483w.Options options) {
        return Build.VERSION.SDK_INT >= 29 && C7481u.m31084c(options) && Intrinsics.m31980c(C7481u.m31082a(options), InterfaceC8441o.f31120c);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final InterfaceC12743d m30974c(@NotNull ImageRequest imageRequest, @NotNull InterfaceC7934w0<? extends InterfaceC12750k> interfaceC7934w0) {
        return imageRequest.getTarget() instanceof InterfaceC1252d ? C12763x.m47631a(((InterfaceC1252d) imageRequest.getTarget()).getView()).m47628b(interfaceC7934w0) : new C12754o(interfaceC7934w0);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m30975d(@NotNull ImageRequest imageRequest) {
        return (imageRequest.getTarget() instanceof InterfaceC1252d) || (imageRequest.getSizeResolver() instanceof InterfaceC13112k) || C12749j.m47596m(imageRequest) != null;
    }
}
