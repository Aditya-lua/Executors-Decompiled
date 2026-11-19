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
import gb.k1;
import gb.o1;
import gb.s1;
import gb.x0;
import java.util.List;
import la.h;
import la.p;
import la.q;
import la.s;
import m9.u;

/* JADX INFO: loaded from: classes.dex */
public final class PlayGamesAppShortcutsActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Intent f6298a;

    public final /* synthetic */ void a() {
        startActivityForResult(this.f6298a, 1005000001);
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
            new x0(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: la.x
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f22045a.a();
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
        final q qVarA = s.a(this, PlayGamesAppShortcutsActivity.class);
        if (qVarA == null) {
            finish();
            return;
        }
        String strZzb = qVarA.zzb();
        if (strZzb == null || strZzb.isEmpty()) {
            List<ResolveInfo> listQueryIntentActivities = getPackageManager().queryIntentActivities(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER").setPackage(getPackageName()), 795136);
            s1 s1Var = o1.b;
            k1 k1Var = new k1();
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo != null) {
                    int componentEnabledSetting = getPackageManager().getComponentEnabledSetting(new ComponentName(activityInfo.packageName, activityInfo.name));
                    if (componentEnabledSetting == 0) {
                        if (activityInfo.enabled) {
                            if (resolveInfo.activityInfo.exported) {
                                k1Var.d(resolveInfo);
                            }
                        }
                    } else if (componentEnabledSetting == 1) {
                        if (resolveInfo.activityInfo.exported) {
                            k1Var.d(resolveInfo);
                        }
                    }
                }
            }
            o1 o1VarE = k1Var.e();
            int size = o1VarE.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    strZzb = null;
                    break;
                }
                ActivityInfo activityInfo2 = ((ResolveInfo) o1VarE.get(i10)).activityInfo;
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
        this.f6298a = intentAddFlags;
        final p pVar = new p((Activity) this);
        Intent intent = getIntent();
        final h hVar = new h(intent.getStringExtra("com.google.android.gms.games.EXTRA_APP_SHORTCUT_ID"), (PersistableBundle) intent.getParcelableExtra("com.google.android.gms.games.EXTRA_APP_SHORTCUT_EXTRAS"), null, Boolean.TRUE);
        pVar.z(u.c().e(6745).d(ea.s.f13284g).c(false).b(new m9.q() { // from class: la.n
            /* JADX WARN: Multi-variable type inference failed */
            @Override // m9.q
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                ((u) ((t) obj).getService()).u2(new l(pVar, (tb.k) obj2), qVarA, hVar);
            }
        }).a()).b(this, new OnCompleteListener() { // from class: la.y
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(Task task) {
                PlayGamesAppShortcutsActivity playGamesAppShortcutsActivity = this.f22046a;
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
