package p079di;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import eu.AbstractC5218d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7701q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import sl.C11410t;
import th.C11659h;

/* JADX INFO: renamed from: di.d */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\bJ\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019¨\u0006\u001b"}, m31665d2 = {"Ldi/d;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "e", "(Landroid/content/Context;)Z", "", "g", "(Landroid/content/Context;)V", "", "btid", "f", "(Landroid/content/Context;J)V", "", "a", "(Landroid/content/Context;)Ljava/lang/String;", "", "c", "()I", "d", "b", "(Landroid/content/Context;)I", "I", "cachedPercent", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4612d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C4612d f18886a = new C4612d();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static volatile int cachedPercent = -1;

    /* JADX INFO: renamed from: e */
    public static final boolean m22771e(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C4612d c4612d = f18886a;
        return c4612d.m22777d(context) && c4612d.m22775b(context) < c4612d.m22776c();
    }

    /* JADX INFO: renamed from: f */
    public static final void m22772f(@NotNull Context context, long btid) {
        Intrinsics.checkNotNullParameter(context, "context");
        C4612d c4612d = f18886a;
        if (c4612d.m22777d(context)) {
            C11410t.f40318a.m42744q(btid, c4612d.m22775b(context), c4612d.m22774a(context));
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m22773g(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C4612d c4612d = f18886a;
        if (c4612d.m22777d(context)) {
            C11410t.f40318a.m42745r(c4612d.m22775b(context), c4612d.m22774a(context));
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m22774a(Context context) {
        int iM22775b = m22775b(context);
        int iM22776c = m22776c();
        if (iM22775b < iM22776c) {
            return "treatment";
        }
        return iM22775b < iM22776c * 2 ? "control" : "none";
    }

    /* JADX INFO: renamed from: b */
    public final int m22775b(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("pgs_experiment", 0);
        int i10 = sharedPreferences.getInt("bucket", -1);
        if (i10 != -1) {
            return i10;
        }
        int iM32090o = C7764d.m32090o(C7764d.m32092q(0, 100), AbstractC5218d.INSTANCE);
        Intrinsics.checkNotNull(sharedPreferences);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putInt("bucket", iM32090o);
        editorEdit.apply();
        return iM32090o;
    }

    /* JADX INFO: renamed from: c */
    public final int m22776c() {
        if (cachedPercent >= 0) {
            return cachedPercent;
        }
        int iMo43628f3 = C11659h.m43403a().mo43628f3();
        if (iMo43628f3 > 50) {
            Log.w("rbx.achievements.ixp", "PgsExperimentPercent (" + iMo43628f3 + ") exceeds 50, capping to 50");
            iMo43628f3 = 50;
        }
        cachedPercent = iMo43628f3;
        return iMo43628f3;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m22777d(Context context) {
        String strMo43405A0 = C11659h.m43403a().mo43405A0();
        Intrinsics.checkNotNullExpressionValue(strMo43405A0, "PgsExperimentCountries(...)");
        List listSplit$default = StringsKt.split$default(strMo43405A0, new String[]{","}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(C7701q.m31905u(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.m32183p1((String) it.next()).toString());
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
        return C4615g.m22784b(context, CollectionsKt.m31691Q0(arrayList2));
    }
}
