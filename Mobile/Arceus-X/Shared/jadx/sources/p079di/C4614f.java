package p079di;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7701q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p229jt.C7342i;
import p229jt.InterfaceC7341h;
import sh.C11382g;
import th.C11659h;

/* JADX INFO: renamed from: di.f */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bR\u001b\u0010\r\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m31665d2 = {"Ldi/f;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "b", "(Landroid/content/Context;)Z", "c", "Ljt/h;", "d", "()Z", "isPgsModuleInstalled", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4614f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C4614f f18888a = new C4614f();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h isPgsModuleInstalled = C7342i.m30456b(new Function0() { // from class: di.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(C4614f.m22779e());
        }
    });

    /* JADX INFO: renamed from: e */
    public static final boolean m22779e() {
        boolean zM42684j = C11382g.m42684j("pgs");
        Log.i("rbx.achievements.pgsrollout", "isPgsModuleInstalled: " + zM42684j);
        return zM42684j;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m22780b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C11659h.m43403a().mo43631g() ? m22782d() : m22781c(context);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m22781c(Context context) {
        String strMo43701q = C11659h.m43403a().mo43701q();
        Intrinsics.checkNotNullExpressionValue(strMo43701q, "PgsRolloutCountries(...)");
        List listSplit$default = StringsKt.split$default(strMo43701q, new String[]{","}, false, 0, 6, null);
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

    /* JADX INFO: renamed from: d */
    public final boolean m22782d() {
        return ((Boolean) isPgsModuleInstalled.getValue()).booleanValue();
    }
}
