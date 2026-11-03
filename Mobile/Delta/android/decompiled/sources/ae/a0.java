package ae;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import be.j1;
import be.q1;
import com.google.android.gms.tasks.Task;
import com.roblox.client.personasdk.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q1 f403c = new q1("SplitInstallService");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Intent f404d = new Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage(BuildConfig.STORE_PACKAGE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f405a;
    public be.g b;

    public a0(Context context, String str) {
        this.f405a = str;
        if (be.q0.a(context)) {
            this.b = new be.g(be.n0.a(context), f403c, "SplitInstallService", f404d, r.f455a, null);
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
        f403c.b("onError(%d)", -14);
        return sb.m.e(new a(-14));
    }

    public final Task c(List list) {
        if (this.b == null) {
            return k();
        }
        f403c.d("deferredInstall(%s)", list);
        sb.k kVar = new sb.k();
        this.b.s(new u(this, kVar, list, kVar), kVar);
        return kVar.a();
    }

    public final Task d(List list) {
        if (this.b == null) {
            return k();
        }
        f403c.d("deferredUninstall(%s)", list);
        sb.k kVar = new sb.k();
        this.b.s(new t(this, kVar, list, kVar), kVar);
        return kVar.a();
    }

    public final Task e(Collection collection, Collection collection2, j1 j1Var) {
        if (this.b == null) {
            return k();
        }
        f403c.d("startInstall(%s,%s)", collection, collection2);
        sb.k kVar = new sb.k();
        this.b.s(new s(this, kVar, collection, collection2, j1Var, kVar), kVar);
        return kVar.a();
    }
}
