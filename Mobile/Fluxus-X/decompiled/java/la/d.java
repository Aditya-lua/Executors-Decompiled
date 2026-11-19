package la;

import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import com.google.android.gms.games.internal.v2.appshortcuts.PlayGamesAppShortcutsActivity;
import com.google.android.gms.tasks.Task;
import gb.k1;
import gb.o1;
import gb.s1;
import gb.u1;
import gb.w0;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22022a;

    public d(Context context) {
        super(null);
        this.f22022a = context.getApplicationContext();
    }

    public static /* synthetic */ f d(o1 o1Var, o1 o1Var2, Task task) {
        return task.isSuccessful() ? (f) task.getResult() : e(o1Var, o1Var2);
    }

    public static f e(o1 o1Var, o1 o1Var2) {
        return new f(f(o1Var), o1.f(), f(o1Var2), o1.f());
    }

    public static o1 f(o1 o1Var) {
        s1 s1Var = o1.b;
        k1 k1Var = new k1();
        int size = o1Var.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strZza = ((h) o1Var.get(i10)).zza();
            if (strZza != null) {
                k1Var.d(strZza);
            }
        }
        return k1Var.e();
    }

    public static o1 g(List list) {
        s1 s1Var = o1.b;
        k1 k1Var = new k1();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ShortcutInfo shortcutInfo = (ShortcutInfo) it.next();
            if (!shortcutInfo.isImmutable() && shortcutInfo.getId().startsWith("PLAY_GAMES_SERVICES_")) {
                k1Var.d(new h(shortcutInfo.getId(), shortcutInfo.getExtras(), Boolean.valueOf(shortcutInfo.isPinned()), Boolean.valueOf(shortcutInfo.isEnabled())));
            }
        }
        return k1Var.e();
    }

    @Override // la.e
    public final void a() {
        w0.a();
        new Thread(new Runnable() { // from class: la.c
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f22021a.c();
            }
        }, "initialize-shortcuts").start();
    }

    public final /* synthetic */ void c() {
        Task taskF;
        Context context = this.f22022a;
        final ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        if (shortcutManager == null) {
            return;
        }
        final q qVarA = s.a(context, PlayGamesAppShortcutsActivity.class);
        final o1 o1VarG = g(shortcutManager.getDynamicShortcuts());
        final o1 o1VarG2 = g(shortcutManager.getPinnedShortcuts());
        if (qVarA == null || qVarA.zza() <= 0) {
            taskF = tb.m.f(e(o1VarG, o1VarG2));
        } else {
            final p pVar = new p(context);
            taskF = pVar.z(m9.u.c().e(6744).d(ea.s.f13284g).c(false).b(new m9.q() { // from class: la.o
                /* JADX WARN: Multi-variable type inference failed */
                @Override // m9.q
                public final /* synthetic */ void accept(Object obj, Object obj2) {
                    ((u) ((t) obj).getService()).t2(new k(pVar, (tb.k) obj2), qVarA, o1VarG, o1VarG2);
                }
            }).a()).h(u1.a(), new tb.c() { // from class: la.b
                @Override // tb.c
                public final /* synthetic */ Object then(Task task) {
                    return d.d(o1VarG, o1VarG2, task);
                }
            });
        }
        taskF.f(u1.a(), new tb.g() { // from class: la.a
            @Override // tb.g
            public final /* synthetic */ void onSuccess(Object obj) {
                f fVar = (f) obj;
                List<String> listZza = fVar.zza();
                ShortcutManager shortcutManager2 = shortcutManager;
                if (listZza != null && !listZza.isEmpty()) {
                    shortcutManager2.removeDynamicShortcuts(listZza);
                }
                List<ShortcutInfo> listZzb = fVar.zzb();
                if (listZzb != null && !listZzb.isEmpty()) {
                    shortcutManager2.addDynamicShortcuts(listZzb);
                }
                List<String> listA3 = fVar.A3();
                if (listA3 != null && !listA3.isEmpty()) {
                    shortcutManager2.disableShortcuts(listA3);
                }
                List<String> listZzd = fVar.zzd();
                if (listZzd == null || listZzd.isEmpty()) {
                    return;
                }
                shortcutManager2.enableShortcuts(listZzd);
            }
        });
    }
}
