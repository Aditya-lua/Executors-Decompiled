package p582yn;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Scanner;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: yn.d0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0018\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u000f\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0013\u0010\u0007\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\u0003\u001a!\u0010\u000b\u001a\u00020\u0001*\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000e\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0005\u001a\u000f\u0010\u0011\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0011\u0010\u0005\u001a\u000f\u0010\u0012\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0012\u0010\u0005\u001a\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0014\u001a\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019\"\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019\"\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019\"\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019\"\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019\"\u0018\u0010 \u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001f¨\u0006!"}, m31665d2 = {"Landroid/content/Context;", "", "j", "(Landroid/content/Context;)Z", "h", "()Z", "b", "a", "", "", "packages", "i", "(Landroid/content/Context;Ljava/util/List;)Z", "binName", "c", "(Ljava/lang/String;)Z", "f", "g", "d", "k", "()Ljava/util/List;", "l", "command", "e", "(Ljava/lang/String;)Ljava/util/List;", "Ljava/util/List;", "knownRootAppsPackages", "knownDangerousAppsPackages", "knownRootCloakingPackages", "binDirectories", "pathsThatShouldNotBeWritable", "Ljava/lang/Boolean;", "isDeviceRootedCachedValue", "device_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C13241d0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final List<String> f46582a = C7699p.m31895n("com.noshufou.android.su", "com.noshufou.android.su.elite", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.thirdparty.superuser", "com.yellowes.su", "com.topjohnwu.magisk", "com.kingroot.kinguser", "com.kingo.root", "com.smedialink.oneclickroot", "com.zhiqupk.root.global", "com.alephzain.framaroot");

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final List<String> f46583b = C7699p.m31895n("com.koushikdutta.rommanager", "com.koushikdutta.rommanager.license", "com.dimonvideo.luckypatcher", "com.chelpus.lackypatch", "com.ramdroid.appquarantine", "com.ramdroid.appquarantinepro", "com.android.vending.billing.InAppBillingService.COIN", "com.android.vending.billing.InAppBillingService.LUCK", "com.chelpus.luckypatcher", "com.blackmartalpha", "org.blackmart.market", "com.allinone.free", "com.repodroid.app", "org.creeplays.hack", "com.baseappfull.fwd", "com.zmapp", "com.dv.marketmod.installer", "org.mobilism.android", "com.android.wp.net.log", "com.android.camera.update", "cc.madkite.freedom", "com.solohsu.android.edxp.manager", "org.meowcat.edxposed.manager", "com.xmodgame", "com.cih.game_cih", "com.charles.lpoqasert", "catch_.me_.if_.you_.can_");

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final List<String> f46584c = C7699p.m31895n("com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "de.robv.android.xposed.installer", "com.saurik.substrate", "com.zachspong.temprootremovejb", "com.amphoras.hidemyroot", "com.amphoras.hidemyrootadfree", "com.formyhm.hiderootPremium", "com.formyhm.hideroot");

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final List<String> f46585d = C7699p.m31895n("/data/local/", "/data/local/bin/", "/data/local/xbin/", "/sbin/", "/su/bin/", "/system/bin/", "/system/bin/.ext/", "/system/bin/failsafe/", "/system/sd/xbin/", "/system/usr/we-need-root/", "/system/xbin/", "/cache/", "/data/", "/dev/");

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final List<String> f46586e = C7699p.m31895n("/system", "/system/bin", "/system/sbin", "/system/xbin", "/vendor/bin", "/sbin", "/etc");

    /* JADX INFO: renamed from: f */
    @Nullable
    public static Boolean f46587f;

    /* JADX INFO: renamed from: a */
    public static final boolean m48968a(Context context) {
        return m48976i(context, f46583b);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m48969b(Context context) {
        return m48976i(context, f46582a);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m48970c(String str) {
        Iterator<String> it = f46585d.iterator();
        while (it.hasNext()) {
            if (new File(it.next(), str).exists()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m48971d() {
        Process processExec = null;
        try {
            processExec = Runtime.getRuntime().exec((String[]) StringsKt.split$default("which su", new String[]{" "}, false, 0, 6, null).toArray(new String[0]));
            boolean z10 = new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() != null;
            processExec.destroy();
            return z10;
        } catch (Exception unused) {
            if (processExec != null) {
                processExec.destroy();
            }
            return false;
        } catch (Throwable th2) {
            if (processExec != null) {
                processExec.destroy();
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final List<String> m48972e(String str) {
        InputStream inputStream;
        String next;
        try {
            inputStream = Runtime.getRuntime().exec(str).getInputStream();
        } catch (IOException unused) {
            inputStream = null;
        }
        try {
            next = new Scanner(inputStream).useDelimiter("\\A").next();
        } catch (NoSuchElementException unused2) {
            next = "";
        }
        String str2 = next;
        Intrinsics.checkNotNull(str2);
        List listSplit$default = StringsKt.split$default(str2, new String[]{"\n"}, false, 0, 6, null);
        if (!listSplit$default.isEmpty()) {
            ListIterator listIterator = listSplit$default.listIterator(listSplit$default.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    return CollectionsKt.m31682H0(listSplit$default, listIterator.nextIndex() + 1);
                }
            }
        }
        return C7699p.m31892k();
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m48973f() {
        boolean z10 = false;
        boolean z11 = true;
        for (String str : m48979l()) {
            if (StringsKt.m32152a0(str, "[ro.debuggable]", false, 2, null) && StringsKt.m32152a0(str, "[1]", false, 2, null)) {
                z10 = true;
            } else if (StringsKt.m32152a0(str, "[ro.secure]", false, 2, null) && StringsKt.m32152a0(str, "[0]", false, 2, null)) {
                z11 = false;
            }
        }
        return z10 && !z11;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m48974g() {
        String str;
        String str2;
        Iterator<String> it = m48978k().iterator();
        while (it.hasNext()) {
            List listSplit$default = StringsKt.split$default(it.next(), new String[]{" "}, false, 0, 6, null);
            if (listSplit$default.size() == 6) {
                str = (String) listSplit$default.get(2);
                str2 = (String) listSplit$default.get(5);
            } else if (listSplit$default.size() == 4) {
                str = (String) listSplit$default.get(1);
                str2 = (String) listSplit$default.get(3);
            } else {
                continue;
            }
            Iterator<String> it2 = f46586e.iterator();
            while (it2.hasNext()) {
                if (C7797x.m32294E(str, it2.next(), true)) {
                    int length = str2.length() - 1;
                    int i10 = 0;
                    boolean z10 = false;
                    while (i10 <= length) {
                        char cCharAt = str2.charAt(!z10 ? i10 : length);
                        boolean z11 = CharsKt.m32098c(cCharAt) || cCharAt == '(' || cCharAt == ')';
                        if (z10) {
                            if (!z11) {
                                break;
                            }
                            length--;
                        } else if (z11) {
                            i10++;
                        } else {
                            z10 = true;
                        }
                    }
                    Iterator it3 = StringsKt.split$default(str2.subSequence(i10, length + 1).toString(), new String[]{","}, false, 0, 6, null).iterator();
                    while (it3.hasNext()) {
                        if (C7797x.m32294E((String) it3.next(), "rw", true)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m48975h() {
        String str = Build.TAGS;
        String str2 = Build.FINGERPRINT;
        String str3 = Build.PRODUCT;
        String str4 = Build.HARDWARE;
        String str5 = Build.DISPLAY;
        if (str != null) {
            if (StringsKt.m32152a0(str, "test-keys", false, 2, null)) {
                return true;
            }
            Intrinsics.checkNotNull(str2);
            if (StringsKt.m32152a0(str2, "genric.*test-keys", false, 2, null)) {
                return true;
            }
            Intrinsics.checkNotNull(str3);
            if (StringsKt.m32152a0(str3, "generic", false, 2, null) || StringsKt.m32152a0(str3, "sdk", false, 2, null)) {
                return true;
            }
            Intrinsics.checkNotNull(str4);
            if (StringsKt.m32152a0(str4, "goldfish", false, 2, null)) {
                return true;
            }
            Intrinsics.checkNotNull(str5);
            if (StringsKt.m32152a0(str5, ".*test-keys", false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m48976i(Context context, List<String> list) {
        PackageManager packageManager = context.getPackageManager();
        for (String str : list) {
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L));
                    return true;
                }
                packageManager.getPackageInfo(str, 0);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m48977j(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Boolean bool = f46587f;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = false;
        try {
            if (m48969b(context) || m48968a(context) || m48970c("su") || m48970c("magisk") || m48973f() || m48974g() || ((m48975h() && !C13249l.m49002a()) || m48971d())) {
                z10 = true;
            }
        } catch (Exception unused) {
        }
        f46587f = Boolean.valueOf(z10);
        return z10;
    }

    /* JADX INFO: renamed from: k */
    public static final List<String> m48978k() {
        return m48972e("mount");
    }

    /* JADX INFO: renamed from: l */
    public static final List<String> m48979l() {
        return m48972e("getprop");
    }
}
