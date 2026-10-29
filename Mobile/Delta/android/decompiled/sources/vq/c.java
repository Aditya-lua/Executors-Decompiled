package vq;

import an.ViewEnvironment;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\"\u001d\u0010\r\u001a\u0004\u0018\u00010\b*\u00020\u00008F¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lan/y;", "Landroid/content/Context;", "context", "", "backgroundColor", "", "b", "(Lan/y;Landroid/content/Context;I)V", "Lvq/a;", "a", "(Lan/y;)Lvq/a;", "getSystemUiController$annotations", "(Lan/y;)V", "systemUiController", "shared_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {
    @Nullable
    public static final a a(@NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(viewEnvironment, "<this>");
        Object obj = viewEnvironment.b().get(b.b);
        if (obj instanceof a) {
            return (a) obj;
        }
        return null;
    }

    public static final void b(@NotNull ViewEnvironment viewEnvironment, @NotNull Context context, int i10) {
        Intrinsics.checkNotNullParameter(viewEnvironment, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Object obj = viewEnvironment.b().get(b.b);
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            aVar.a(context, i10);
        }
    }
}
