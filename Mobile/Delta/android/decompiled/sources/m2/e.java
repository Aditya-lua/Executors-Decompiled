package m2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import x2.g;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile d<?> f23899a;
    public static volatile List<b> b;

    public static class a {
        public static String a(List<ShortcutInfo> list) {
            int rank = -1;
            String id2 = null;
            for (ShortcutInfo shortcutInfo : list) {
                if (shortcutInfo.getRank() > rank) {
                    id2 = shortcutInfo.getId();
                    rank = shortcutInfo.getRank();
                }
            }
            return id2;
        }
    }

    public static boolean a(Context context, c cVar) {
        Bitmap bitmapDecodeStream;
        IconCompat iconCompat = cVar.f23877i;
        if (iconCompat == null) {
            return false;
        }
        int i10 = iconCompat.f1785a;
        if (i10 != 6 && i10 != 4) {
            return true;
        }
        InputStream inputStreamK = iconCompat.k(context);
        if (inputStreamK == null || (bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamK)) == null) {
            return false;
        }
        cVar.f23877i = i10 == 6 ? IconCompat.b(bitmapDecodeStream) : IconCompat.c(bitmapDecodeStream);
        return true;
    }

    public static int b(Context context) {
        g.g(context);
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
    }

    public static String c(List<c> list) {
        int iL = -1;
        String strF = null;
        for (c cVar : list) {
            if (cVar.l() > iL) {
                strF = cVar.f();
                iL = cVar.l();
            }
        }
        return strF;
    }

    public static List<b> d(Context context) {
        Bundle bundle;
        String string;
        if (b == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 128).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        arrayList.add((b) Class.forName(string, false, e.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context));
                    } catch (Exception unused) {
                    }
                }
            }
            if (b == null) {
                b = arrayList;
            }
        }
        return b;
    }

    public static d<?> e(Context context) {
        if (f23899a == null) {
            try {
                f23899a = (d) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, e.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (f23899a == null) {
                f23899a = new d.a();
            }
        }
        return f23899a;
    }

    public static List<c> f(Context context, int i10) {
        if (Build.VERSION.SDK_INT >= 30) {
            return c.b(context, ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getShortcuts(i10));
        }
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        ArrayList arrayList = new ArrayList();
        if ((i10 & 1) != 0) {
            arrayList.addAll(shortcutManager.getManifestShortcuts());
        }
        if ((i10 & 2) != 0) {
            arrayList.addAll(shortcutManager.getDynamicShortcuts());
        }
        if ((i10 & 4) != 0) {
            arrayList.addAll(shortcutManager.getPinnedShortcuts());
        }
        return c.b(context, arrayList);
    }

    public static boolean g(Context context) {
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).isRequestPinShortcutSupported();
    }

    public static boolean h(Context context, c cVar) {
        g.g(context);
        g.g(cVar);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 32 && cVar.n(1)) {
            Iterator<b> it = d(context).iterator();
            while (it.hasNext()) {
                it.next().b(Collections.singletonList(cVar));
            }
            return true;
        }
        int iB = b(context);
        if (iB == 0) {
            return false;
        }
        if (i10 <= 29) {
            a(context, cVar);
        }
        if (i10 >= 30) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).pushDynamicShortcut(cVar.o());
        } else {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            if (shortcutManager.isRateLimitingActive()) {
                return false;
            }
            List<ShortcutInfo> dynamicShortcuts = shortcutManager.getDynamicShortcuts();
            if (dynamicShortcuts.size() >= iB) {
                shortcutManager.removeDynamicShortcuts(Arrays.asList(a.a(dynamicShortcuts)));
            }
            shortcutManager.addDynamicShortcuts(Arrays.asList(cVar.o()));
        }
        d<?> dVarE = e(context);
        try {
            List<c> listB = dVarE.b();
            if (listB.size() >= iB) {
                dVarE.d(Arrays.asList(c(listB)));
            }
            dVarE.a(Arrays.asList(cVar));
            return true;
        } catch (Exception unused) {
            return false;
        } finally {
            Iterator<b> it2 = d(context).iterator();
            while (it2.hasNext()) {
                it2.next().b(Collections.singletonList(cVar));
            }
            k(context, cVar.f());
        }
    }

    public static void i(Context context) {
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
        e(context).c();
        Iterator<b> it = d(context).iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public static List<c> j(List<c> list, int i10) {
        Objects.requireNonNull(list);
        if (Build.VERSION.SDK_INT > 32) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        for (c cVar : list) {
            if (cVar.n(i10)) {
                arrayList.remove(cVar);
            }
        }
        return arrayList;
    }

    public static void k(Context context, String str) {
        g.g(context);
        g.g(str);
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).reportShortcutUsed(str);
        Iterator<b> it = d(context).iterator();
        while (it.hasNext()) {
            it.next().c(Collections.singletonList(str));
        }
    }

    public static boolean l(Context context, c cVar, IntentSender intentSender) {
        if (Build.VERSION.SDK_INT > 32 || !cVar.n(1)) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).requestPinShortcut(cVar.o(), intentSender);
        }
        return false;
    }

    public static boolean m(Context context, List<c> list) {
        g.g(context);
        g.g(list);
        List<c> listJ = j(list, 1);
        ArrayList arrayList = new ArrayList(listJ.size());
        Iterator<c> it = listJ.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().o());
        }
        if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).setDynamicShortcuts(arrayList)) {
            return false;
        }
        e(context).c();
        e(context).a(listJ);
        for (b bVar : d(context)) {
            bVar.a();
            bVar.b(list);
        }
        return true;
    }
}
