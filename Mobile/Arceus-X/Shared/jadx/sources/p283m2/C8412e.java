package p283m2;

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
import p533x2.C12637g;

/* JADX INFO: renamed from: m2.e */
/* JADX INFO: loaded from: classes.dex */
public class C8412e {

    /* JADX INFO: renamed from: a */
    public static volatile AbstractC8411d<?> f31002a;

    /* JADX INFO: renamed from: b */
    public static volatile List<AbstractC8409b> f31003b;

    /* JADX INFO: renamed from: m2.e$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static String m34113a(List<ShortcutInfo> list) {
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

    /* JADX INFO: renamed from: a */
    public static boolean m34100a(Context context, C8410c c8410c) {
        Bitmap bitmapDecodeStream;
        IconCompat iconCompat = c8410c.f30979i;
        if (iconCompat == null) {
            return false;
        }
        int i10 = iconCompat.f2314a;
        if (i10 != 6 && i10 != 4) {
            return true;
        }
        InputStream inputStreamM2694k = iconCompat.m2694k(context);
        if (inputStreamM2694k == null || (bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamM2694k)) == null) {
            return false;
        }
        c8410c.f30979i = i10 == 6 ? IconCompat.m2684b(bitmapDecodeStream) : IconCompat.m2685c(bitmapDecodeStream);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static int m34101b(Context context) {
        C12637g.m47075g(context);
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
    }

    /* JADX INFO: renamed from: c */
    public static String m34102c(List<C8410c> list) {
        int iM34080l = -1;
        String strM34077f = null;
        for (C8410c c8410c : list) {
            if (c8410c.m34080l() > iM34080l) {
                strM34077f = c8410c.m34077f();
                iM34080l = c8410c.m34080l();
            }
        }
        return strM34077f;
    }

    /* JADX INFO: renamed from: d */
    public static List<AbstractC8409b> m34103d(Context context) {
        Bundle bundle;
        String string;
        if (f31003b == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 128).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        arrayList.add((AbstractC8409b) Class.forName(string, false, C8412e.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context));
                    } catch (Exception unused) {
                    }
                }
            }
            if (f31003b == null) {
                f31003b = arrayList;
            }
        }
        return f31003b;
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC8411d<?> m34104e(Context context) {
        if (f31002a == null) {
            try {
                f31002a = (AbstractC8411d) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, C8412e.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (f31002a == null) {
                f31002a = new AbstractC8411d.a();
            }
        }
        return f31002a;
    }

    /* JADX INFO: renamed from: f */
    public static List<C8410c> m34105f(Context context, int i10) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C8410c.m34069b(context, ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getShortcuts(i10));
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
        return C8410c.m34069b(context, arrayList);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m34106g(Context context) {
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).isRequestPinShortcutSupported();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m34107h(Context context, C8410c c8410c) {
        C12637g.m47075g(context);
        C12637g.m47075g(c8410c);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 32 && c8410c.m34082n(1)) {
            Iterator<AbstractC8409b> it = m34103d(context).iterator();
            while (it.hasNext()) {
                it.next().mo2656b(Collections.singletonList(c8410c));
            }
            return true;
        }
        int iM34101b = m34101b(context);
        if (iM34101b == 0) {
            return false;
        }
        if (i10 <= 29) {
            m34100a(context, c8410c);
        }
        if (i10 >= 30) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).pushDynamicShortcut(c8410c.m34083o());
        } else {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            if (shortcutManager.isRateLimitingActive()) {
                return false;
            }
            List<ShortcutInfo> dynamicShortcuts = shortcutManager.getDynamicShortcuts();
            if (dynamicShortcuts.size() >= iM34101b) {
                shortcutManager.removeDynamicShortcuts(Arrays.asList(a.m34113a(dynamicShortcuts)));
            }
            shortcutManager.addDynamicShortcuts(Arrays.asList(c8410c.m34083o()));
        }
        AbstractC8411d<?> abstractC8411dM34104e = m34104e(context);
        try {
            List<C8410c> listM34094b = abstractC8411dM34104e.m34094b();
            if (listM34094b.size() >= iM34101b) {
                abstractC8411dM34104e.mo34096d(Arrays.asList(m34102c(listM34094b)));
            }
            abstractC8411dM34104e.mo34093a(Arrays.asList(c8410c));
            return true;
        } catch (Exception unused) {
            return false;
        } finally {
            Iterator<AbstractC8409b> it2 = m34103d(context).iterator();
            while (it2.hasNext()) {
                it2.next().mo2656b(Collections.singletonList(c8410c));
            }
            m34110k(context, c8410c.m34077f());
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m34108i(Context context) {
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
        m34104e(context).mo34095c();
        Iterator<AbstractC8409b> it = m34103d(context).iterator();
        while (it.hasNext()) {
            it.next().mo2655a();
        }
    }

    /* JADX INFO: renamed from: j */
    public static List<C8410c> m34109j(List<C8410c> list, int i10) {
        Objects.requireNonNull(list);
        if (Build.VERSION.SDK_INT > 32) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        for (C8410c c8410c : list) {
            if (c8410c.m34082n(i10)) {
                arrayList.remove(c8410c);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public static void m34110k(Context context, String str) {
        C12637g.m47075g(context);
        C12637g.m47075g(str);
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).reportShortcutUsed(str);
        Iterator<AbstractC8409b> it = m34103d(context).iterator();
        while (it.hasNext()) {
            it.next().mo2657c(Collections.singletonList(str));
        }
    }

    /* JADX INFO: renamed from: l */
    public static boolean m34111l(Context context, C8410c c8410c, IntentSender intentSender) {
        if (Build.VERSION.SDK_INT > 32 || !c8410c.m34082n(1)) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).requestPinShortcut(c8410c.m34083o(), intentSender);
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m34112m(Context context, List<C8410c> list) {
        C12637g.m47075g(context);
        C12637g.m47075g(list);
        List<C8410c> listM34109j = m34109j(list, 1);
        ArrayList arrayList = new ArrayList(listM34109j.size());
        Iterator<C8410c> it = listM34109j.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m34083o());
        }
        if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).setDynamicShortcuts(arrayList)) {
            return false;
        }
        m34104e(context).mo34095c();
        m34104e(context).mo34093a(listM34109j);
        for (AbstractC8409b abstractC8409b : m34103d(context)) {
            abstractC8409b.mo2655a();
            abstractC8409b.mo2656b(list);
        }
        return true;
    }
}
