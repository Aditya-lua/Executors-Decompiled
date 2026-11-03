package bi;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.roblox.client.pushnotification.v2.model.PayloadNotificationChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import ql.t;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\bJ\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019¨\u0006\u001b"}, d2 = {"Lbi/d;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "e", "(Landroid/content/Context;)Z", "", "g", "(Landroid/content/Context;)V", "", "btid", "f", "(Landroid/content/Context;J)V", "", "a", "(Landroid/content/Context;)Ljava/lang/String;", "", "c", "()I", "d", "b", "(Landroid/content/Context;)I", "I", "cachedPercent", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f4222a = new d();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static volatile int cachedPercent = -1;

    public static final boolean e(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        d dVar = f4222a;
        return dVar.d(context) && dVar.b(context) < dVar.c();
    }

    public static final void f(@NotNull Context context, long btid) {
        Intrinsics.checkNotNullParameter(context, "context");
        d dVar = f4222a;
        if (dVar.d(context)) {
            t.f29925a.q(btid, dVar.b(context), dVar.a(context));
        }
    }

    public static final void g(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        d dVar = f4222a;
        if (dVar.d(context)) {
            t.f29925a.r(dVar.b(context), dVar.a(context));
        }
    }

    public final String a(Context context) {
        int iB = b(context);
        int iC = c();
        if (iB < iC) {
            return "treatment";
        }
        return iB < iC * 2 ? "control" : PayloadNotificationChannel.SOUND_NONE;
    }

    public final int b(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("pgs_experiment", 0);
        int i10 = sharedPreferences.getInt("bucket", -1);
        if (i10 != -1) {
            return i10;
        }
        int iO = kotlin.ranges.d.o(kotlin.ranges.d.q(0, 100), cu.d.INSTANCE);
        Intrinsics.checkNotNull(sharedPreferences);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putInt("bucket", iO);
        editorEdit.apply();
        return iO;
    }

    public final int c() {
        if (cachedPercent >= 0) {
            return cachedPercent;
        }
        int iJ3 = rh.h.a().j3();
        if (iJ3 > 50) {
            Log.w("rbx.achievements.ixp", "PgsExperimentPercent (" + iJ3 + ") exceeds 50, capping to 50");
            iJ3 = 50;
        }
        cachedPercent = iJ3;
        return iJ3;
    }

    public final boolean d(Context context) {
        String strB0 = rh.h.a().B0();
        Intrinsics.checkNotNullExpressionValue(strB0, "PgsExperimentCountries(...)");
        List listSplit$default = StringsKt.split$default(strB0, new String[]{","}, false, 0, 6, null);
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
}
