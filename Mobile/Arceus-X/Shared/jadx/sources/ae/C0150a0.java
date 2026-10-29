package ae;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import be.C1323g;
import be.C1334j1;
import be.C1345n0;
import be.C1354q0;
import be.C1355q1;
import com.google.android.gms.tasks.Task;
import com.roblox.client.personasdk.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import sb.C11264k;
import sb.C11268m;

/* JADX INFO: renamed from: ae.a0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0150a0 {

    /* JADX INFO: renamed from: c */
    public static final C1355q1 f515c = new C1355q1("SplitInstallService");

    /* JADX INFO: renamed from: d */
    public static final Intent f516d = new Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage(BuildConfig.STORE_PACKAGE);

    /* JADX INFO: renamed from: a */
    public final String f517a;

    /* JADX INFO: renamed from: b */
    public C1323g f518b;

    public C0150a0(Context context, String str) {
        this.f517a = str;
        if (C1354q0.m7205a(context)) {
            this.f518b = new C1323g(C1345n0.m7192a(context), f515c, "SplitInstallService", f516d, C0185r.f578a, null);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ Bundle m468b(C1334j1 c1334j1) {
        Bundle bundleM473j = m473j();
        bundleM473j.putParcelableArrayList("event_timestamps", new ArrayList<>(c1334j1.m7176a()));
        return bundleM473j;
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ ArrayList m471h(Collection collection) {
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

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ ArrayList m472i(Collection collection) {
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

    /* JADX INFO: renamed from: j */
    public static Bundle m473j() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 11004);
        return bundle;
    }

    /* JADX INFO: renamed from: k */
    public static Task m474k() {
        f515c.m7208b("onError(%d)", -14);
        return C11268m.m42335e(new C0149a(-14));
    }

    /* JADX INFO: renamed from: c */
    public final Task m475c(List list) {
        if (this.f518b == null) {
            return m474k();
        }
        f515c.m7210d("deferredInstall(%s)", list);
        C11264k c11264k = new C11264k();
        this.f518b.m7152s(new C0191u(this, c11264k, list, c11264k), c11264k);
        return c11264k.m42326a();
    }

    /* JADX INFO: renamed from: d */
    public final Task m476d(List list) {
        if (this.f518b == null) {
            return m474k();
        }
        f515c.m7210d("deferredUninstall(%s)", list);
        C11264k c11264k = new C11264k();
        this.f518b.m7152s(new C0189t(this, c11264k, list, c11264k), c11264k);
        return c11264k.m42326a();
    }

    /* JADX INFO: renamed from: e */
    public final Task m477e(Collection collection, Collection collection2, C1334j1 c1334j1) {
        if (this.f518b == null) {
            return m474k();
        }
        f515c.m7210d("startInstall(%s,%s)", collection, collection2);
        C11264k c11264k = new C11264k();
        this.f518b.m7152s(new C0187s(this, c11264k, collection, collection2, c1334j1, c11264k), c11264k);
        return c11264k.m42326a();
    }
}
