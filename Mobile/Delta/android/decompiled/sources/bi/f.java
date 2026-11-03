package bi;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bR\u001b\u0010\r\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lbi/f;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "b", "(Landroid/content/Context;)Z", "c", "Lgt/h;", "d", "()Z", "isPgsModuleInstalled", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f4223a = new f();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final gt.h isPgsModuleInstalled = gt.i.b(new Function0() { // from class: bi.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(f.e());
        }
    });

    public static final boolean e() {
        boolean zJ = qh.g.j("pgs");
        Log.i("rbx.achievements.pgsrollout", "isPgsModuleInstalled: " + zJ);
        return zJ;
    }

    public final boolean b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return rh.h.a().g() ? d() : c(context);
    }

    public final boolean c(Context context) {
        String strP = rh.h.a().p();
        Intrinsics.checkNotNullExpressionValue(strP, "PgsRolloutCountries(...)");
        List listSplit$default = StringsKt.split$default(strP, new String[]{","}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(q.u(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.p1((String) it.next()).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        return g.b(context, CollectionsKt.Q0(arrayList2));
    }

    public final boolean d() {
        return ((Boolean) isPgsModuleInstalled.getValue()).booleanValue();
    }
}
