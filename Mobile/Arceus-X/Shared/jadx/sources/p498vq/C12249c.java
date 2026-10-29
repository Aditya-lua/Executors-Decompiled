package p498vq;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.ViewEnvironment;

/* JADX INFO: renamed from: vq.c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\"\u001d\u0010\r\u001a\u0004\u0018\u00010\b*\u00020\u00008F¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, m31665d2 = {"Lan/y;", "Landroid/content/Context;", "context", "", "backgroundColor", "", "b", "(Lan/y;Landroid/content/Context;I)V", "Lvq/a;", "a", "(Lan/y;)Lvq/a;", "getSystemUiController$annotations", "(Lan/y;)V", "systemUiController", "shared_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12249c {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final C12247a m45392a(@NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(viewEnvironment, "<this>");
        Object obj = viewEnvironment.m1463b().get(C12248b.f43285b);
        if (obj instanceof C12247a) {
            return (C12247a) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final void m45393b(@NotNull ViewEnvironment viewEnvironment, @NotNull Context context, int i10) {
        Intrinsics.checkNotNullParameter(viewEnvironment, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Object obj = viewEnvironment.m1463b().get(C12248b.f43285b);
        C12247a c12247a = obj instanceof C12247a ? (C12247a) obj : null;
        if (c12247a != null) {
            c12247a.m45389a(context, i10);
        }
    }
}
