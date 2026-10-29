package com.google.android.gms.games.internal.p049v2.appshortcuts;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Looper;
import android.os.PersistableBundle;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.games.internal.p049v2.appshortcuts.PlayGamesAppShortcutsActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.List;
import p073da.C4506j;
import p125fb.AbstractC5546n1;
import p125fb.AbstractC5558r1;
import p125fb.C5534j1;
import p125fb.HandlerC5572w0;
import p243ka.C7528n;
import p243ka.C7530p;
import p268l9.AbstractC8078u;
import p268l9.InterfaceC8066q;
import sb.C11264k;

/* JADX INFO: loaded from: classes.dex */
public final class PlayGamesAppShortcutsActivity extends Activity {

    /* JADX INFO: renamed from: a */
    public Intent f7902a;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m9450a() {
        startActivityForResult(this.f7902a, 1005000001);
        finish();
        System.exit(0);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, @NonNull Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 != 1005000000) {
            return;
        }
        if (i11 != -1) {
            finish();
        } else {
            new HandlerC5572w0(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: ka.u
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f28886a.m9450a();
                }
            }, 50L);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0048 A[SYNTHETIC] */
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Intent intentAddFlags;
        super.onCreate(bundle);
        final zzr zzrVarM31177a = C7530p.m31177a(this, PlayGamesAppShortcutsActivity.class);
        if (zzrVarM31177a == null) {
            finish();
            return;
        }
        String strZzb = zzrVarM31177a.zzb();
        if (strZzb == null || strZzb.isEmpty()) {
            List<ResolveInfo> listQueryIntentActivities = getPackageManager().queryIntentActivities(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER").setPackage(getPackageName()), 795136);
            AbstractC5558r1 abstractC5558r1 = AbstractC5546n1.f21331b;
            C5534j1 c5534j1 = new C5534j1();
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo != null) {
                    int componentEnabledSetting = getPackageManager().getComponentEnabledSetting(new ComponentName(activityInfo.packageName, activityInfo.name));
                    if (componentEnabledSetting == 0) {
                        if (activityInfo.enabled) {
                            if (resolveInfo.activityInfo.exported) {
                                c5534j1.m25202d(resolveInfo);
                            }
                        }
                    } else if (componentEnabledSetting == 1) {
                        if (resolveInfo.activityInfo.exported) {
                            c5534j1.m25202d(resolveInfo);
                        }
                    }
                }
            }
            AbstractC5546n1 abstractC5546n1M25203e = c5534j1.m25203e();
            int size = abstractC5546n1M25203e.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    strZzb = null;
                    break;
                }
                ActivityInfo activityInfo2 = ((ResolveInfo) abstractC5546n1M25203e.get(i10)).activityInfo;
                i10++;
                if (activityInfo2 != null) {
                    strZzb = activityInfo2.name;
                    break;
                }
            }
        }
        if (strZzb == null || strZzb.isEmpty()) {
            intentAddFlags = null;
        } else {
            String packageName = getPackageName();
            intentAddFlags = new Intent().setComponent(new ComponentName(packageName, strZzb)).setPackage(packageName).addFlags(335577088);
        }
        if (intentAddFlags == null) {
            finish();
            return;
        }
        this.f7902a = intentAddFlags;
        final C7528n c7528n = new C7528n((Activity) this);
        Intent intent = getIntent();
        final zzi zziVar = new zzi(intent.getStringExtra("com.google.android.gms.games.EXTRA_APP_SHORTCUT_ID"), (PersistableBundle) intent.getParcelableExtra("com.google.android.gms.games.EXTRA_APP_SHORTCUT_EXTRAS"), null, Boolean.TRUE);
        c7528n.m31151z(AbstractC8078u.m33280c().m33289e(6745).m33288d(C4506j.f18542g).m33287c(false).m33286b(new InterfaceC8066q() { // from class: ka.l
            /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: T */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p268l9.InterfaceC8066q
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                ((C7532r) ((C7531q) obj).getService()).m31179u2(new BinderC7524j(c7528n, (C11264k) obj2), zzrVarM31177a, zziVar);
            }
        }).m33285a()).mo11888b(this, new OnCompleteListener() { // from class: ka.v
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(Task task) {
                PlayGamesAppShortcutsActivity playGamesAppShortcutsActivity = this.f28887a;
                if (task.isSuccessful()) {
                    playGamesAppShortcutsActivity.startActivityForResult((Intent) task.getResult(), 1005000000);
                } else {
                    Log.e("PGShortcutsActivity", "Failed to access intent.", task.getException());
                    playGamesAppShortcutsActivity.finish();
                }
            }
        });
    }
}
