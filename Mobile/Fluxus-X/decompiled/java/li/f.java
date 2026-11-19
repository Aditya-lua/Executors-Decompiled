package li;

import android.util.Log;
import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.collections.q;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006R\u001b\u0010\n\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\u0006¨\u0006\u000b"}, d2 = {"Lli/f;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "b", "()Z", "c", "Lzt/h;", "d", "isPgsModuleInstalled", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f22167a = new f();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final zt.h isPgsModuleInstalled = zt.i.a(new Function0() { // from class: li.e
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(f.e());
        }
    });

    public static final boolean e() {
        boolean zK = ai.h.k("pgs");
        Log.i("rbx.achievements.pgsrollout", "isPgsModuleInstalled: " + zK);
        return zK;
    }

    public final boolean b() {
        return bi.h.a().g() ? d() : c();
    }

    public final boolean c() {
        String strP = bi.h.a().p();
        Intrinsics.checkNotNullExpressionValue(strP, "PgsRolloutCountries(...)");
        List listSplit$default = StringsKt.split$default(strP, new String[]{","}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(q.u(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.n1((String) it.next()).toString());
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
        return g.b(CollectionsKt.Q0(arrayList2));
    }

    public final boolean d() {
        return ((Boolean) isPgsModuleInstalled.getValue()).booleanValue();
    }
}
