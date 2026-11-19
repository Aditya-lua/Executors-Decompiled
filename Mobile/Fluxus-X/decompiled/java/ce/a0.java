package ce;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import de.j1;
import de.q1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q1 f4950c = new q1("SplitInstallService");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Intent f4951d = new Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage("com.android.vending");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4952a;
    public de.g b;

    public a0(Context context, String str) {
        this.f4952a = str;
        if (de.q0.a(context)) {
            this.b = new de.g(de.n0.a(context), f4950c, "SplitInstallService", f4951d, r.f5002a, null);
        }
    }

    public static /* bridge */ /* synthetic */ Bundle b(j1 j1Var) {
        Bundle bundleJ = j();
        bundleJ.putParcelableArrayList("event_timestamps", new ArrayList<>(j1Var.a()));
        return bundleJ;
    }

    public static /* bridge */ /* synthetic */ ArrayList h(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("language", str);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static /* bridge */ /* synthetic */ ArrayList i(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static Bundle j() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 11004);
        return bundle;
    }

    public static Task k() {
        f4950c.b("onError(%d)", -14);
        return tb.m.e(new a(-14));
    }

    public final Task c(List list) {
        if (this.b == null) {
            return k();
        }
        f4950c.d("deferredInstall(%s)", list);
        tb.k kVar = new tb.k();
        this.b.s(new u(this, kVar, list, kVar), kVar);
        return kVar.a();
    }

    public final Task d(List list) {
        if (this.b == null) {
            return k();
        }
        f4950c.d("deferredUninstall(%s)", list);
        tb.k kVar = new tb.k();
        this.b.s(new t(this, kVar, list, kVar), kVar);
        return kVar.a();
    }

    public final Task e(Collection collection, Collection collection2, j1 j1Var) {
        if (this.b == null) {
            return k();
        }
        f4950c.d("startInstall(%s,%s)", collection, collection2);
        tb.k kVar = new tb.k();
        this.b.s(new s(this, kVar, collection, collection2, j1Var, kVar), kVar);
        return kVar.a();
    }
}
