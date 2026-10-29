package com.google.android.gms.games.internal.v2.appshortcuts;

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
import com.google.android.gms.games.internal.v2.appshortcuts.PlayGamesAppShortcutsActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import da.j;
import fb.j1;
import fb.n1;
import fb.r1;
import fb.w0;
import java.util.List;
import ka.n;
import ka.p;
import l9.q;
import l9.u;

/* JADX INFO: loaded from: classes.dex */
public final class PlayGamesAppShortcutsActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Intent f6186a;

    public final /* synthetic */ void a() {
        startActivityForResult(this.f6186a, 1005000001);
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
            new w0(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: ka.u
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f22300a.a();
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
        final zzr zzrVarA = p.a(this, PlayGamesAppShortcutsActivity.class);
        if (zzrVarA == null) {
            finish();
            return;
        }
        String strZzb = zzrVarA.zzb();
        if (strZzb == null || strZzb.isEmpty()) {
            List<ResolveInfo> listQueryIntentActivities = getPackageManager().queryIntentActivities(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER").setPackage(getPackageName()), 795136);
            r1 r1Var = n1.b;
            j1 j1Var = new j1();
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo != null) {
                    int componentEnabledSetting = getPackageManager().getComponentEnabledSetting(new ComponentName(activityInfo.packageName, activityInfo.name));
                    if (componentEnabledSetting == 0) {
                        if (activityInfo.enabled) {
                            if (resolveInfo.activityInfo.exported) {
                                j1Var.d(resolveInfo);
                            }
                        }
                    } else if (componentEnabledSetting == 1) {
                        if (resolveInfo.activityInfo.exported) {
                            j1Var.d(resolveInfo);
                        }
                    }
                }
            }
            n1 n1VarE = j1Var.e();
            int size = n1VarE.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    strZzb = null;
                    break;
                }
                ActivityInfo activityInfo2 = ((ResolveInfo) n1VarE.get(i10)).activityInfo;
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
        this.f6186a = intentAddFlags;
        final n nVar = new n((Activity) this);
        Intent intent = getIntent();
        final zzi zziVar = new zzi(intent.getStringExtra("com.google.android.gms.games.EXTRA_APP_SHORTCUT_ID"), (PersistableBundle) intent.getParcelableExtra("com.google.android.gms.games.EXTRA_APP_SHORTCUT_EXTRAS"), null, Boolean.TRUE);
        nVar.z(u.c().e(6745).d(j.f14513g).c(false).b(new q() { // from class: ka.l
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l9.q
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                ((r) ((q) obj).getService()).u2(new j(nVar, (sb.k) obj2), zzrVarA, zziVar);
            }
        }).a()).b(this, new OnCompleteListener() { // from class: ka.v
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(Task task) {
                PlayGamesAppShortcutsActivity playGamesAppShortcutsActivity = this.f22301a;
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
