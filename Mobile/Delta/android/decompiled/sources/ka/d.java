package ka;

import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import com.google.android.gms.games.internal.v2.appshortcuts.PlayGamesAppShortcutsActivity;
import com.google.android.gms.games.internal.v2.appshortcuts.zzg;
import com.google.android.gms.games.internal.v2.appshortcuts.zzi;
import com.google.android.gms.games.internal.v2.appshortcuts.zzr;
import com.google.android.gms.tasks.Task;
import fb.j1;
import fb.n1;
import fb.r1;
import fb.t1;
import fb.v0;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22290a;

    public d(Context context) {
        super(null);
        this.f22290a = context.getApplicationContext();
    }

    public static /* synthetic */ zzg d(n1 n1Var, n1 n1Var2, Task task) {
        return task.isSuccessful() ? (zzg) task.getResult() : e(n1Var, n1Var2);
    }

    public static zzg e(n1 n1Var, n1 n1Var2) {
        return new zzg(f(n1Var), n1.f(), f(n1Var2), n1.f());
    }

    public static n1 f(n1 n1Var) {
        r1 r1Var = n1.b;
        j1 j1Var = new j1();
        int size = n1Var.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strZza = ((zzi) n1Var.get(i10)).zza();
            if (strZza != null) {
                j1Var.d(strZza);
            }
        }
        return j1Var.e();
    }

    public static n1 g(List list) {
        r1 r1Var = n1.b;
        j1 j1Var = new j1();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ShortcutInfo shortcutInfo = (ShortcutInfo) it.next();
            if (!shortcutInfo.isImmutable() && shortcutInfo.getId().startsWith("PLAY_GAMES_SERVICES_")) {
                j1Var.d(new zzi(shortcutInfo.getId(), shortcutInfo.getExtras(), Boolean.valueOf(shortcutInfo.isPinned()), Boolean.valueOf(shortcutInfo.isEnabled())));
            }
        }
        return j1Var.e();
    }

    @Override // ka.e
    public final void a() {
        v0.a();
        new Thread(new Runnable() { // from class: ka.c
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f22289a.c();
            }
        }, "initialize-shortcuts").start();
    }

    public final /* synthetic */ void c() {
        Task taskF;
        Context context = this.f22290a;
        final ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        if (shortcutManager == null) {
            return;
        }
        final zzr zzrVarA = p.a(context, PlayGamesAppShortcutsActivity.class);
        final n1 n1VarG = g(shortcutManager.getDynamicShortcuts());
        final n1 n1VarG2 = g(shortcutManager.getPinnedShortcuts());
        if (zzrVarA == null || zzrVarA.zza() <= 0) {
            taskF = sb.m.f(e(n1VarG, n1VarG2));
        } else {
            final n nVar = new n(context);
            taskF = nVar.z(l9.u.c().e(6744).d(da.j.f14513g).c(false).b(new l9.q() { // from class: ka.m
                /* JADX WARN: Multi-variable type inference failed */
                @Override // l9.q
                public final /* synthetic */ void accept(Object obj, Object obj2) {
                    ((r) ((q) obj).getService()).t2(new i(nVar, (sb.k) obj2), zzrVarA, n1VarG, n1VarG2);
                }
            }).a()).h(t1.a(), new sb.c() { // from class: ka.b
                @Override // sb.c
                public final /* synthetic */ Object then(Task task) {
                    return d.d(n1VarG, n1VarG2, task);
                }
            });
        }
        taskF.f(t1.a(), new sb.g() { // from class: ka.a
            @Override // sb.g
            public final /* synthetic */ void onSuccess(Object obj) {
                zzg zzgVar = (zzg) obj;
                List<String> listZza = zzgVar.zza();
                ShortcutManager shortcutManager2 = shortcutManager;
                if (listZza != null && !listZza.isEmpty()) {
                    shortcutManager2.removeDynamicShortcuts(listZza);
                }
                List<ShortcutInfo> listZzb = zzgVar.zzb();
                if (listZzb != null && !listZzb.isEmpty()) {
                    shortcutManager2.addDynamicShortcuts(listZzb);
                }
                List<String> listV3 = zzgVar.v3();
                if (listV3 != null && !listV3.isEmpty()) {
                    shortcutManager2.disableShortcuts(listV3);
                }
                List<String> listZzd = zzgVar.zzd();
                if (listZzd == null || listZzd.isEmpty()) {
                    return;
                }
                shortcutManager2.enableShortcuts(listZzd);
            }
        });
    }
}
