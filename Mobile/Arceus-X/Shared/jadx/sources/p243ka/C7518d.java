package p243ka;

import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import com.google.android.gms.games.internal.p049v2.appshortcuts.PlayGamesAppShortcutsActivity;
import com.google.android.gms.games.internal.p049v2.appshortcuts.zzg;
import com.google.android.gms.games.internal.p049v2.appshortcuts.zzi;
import com.google.android.gms.games.internal.p049v2.appshortcuts.zzr;
import com.google.android.gms.tasks.Task;
import java.util.Iterator;
import java.util.List;
import p073da.C4506j;
import p125fb.AbstractC5546n1;
import p125fb.AbstractC5558r1;
import p125fb.C5534j1;
import p125fb.C5564t1;
import p125fb.C5569v0;
import p268l9.AbstractC8078u;
import p268l9.InterfaceC8066q;
import sb.C11264k;
import sb.C11268m;
import sb.InterfaceC11248c;
import sb.InterfaceC11256g;

/* JADX INFO: renamed from: ka.d */
/* JADX INFO: loaded from: classes.dex */
public final class C7518d extends C7519e {

    /* JADX INFO: renamed from: a */
    public final Context f28874a;

    public C7518d(Context context) {
        super(null);
        this.f28874a = context.getApplicationContext();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: ?: TERNARY null = ((wrap boolean:0x0000: INVOKE (r3v0 com.google.android.gms.tasks.Task) VIRTUAL call: com.google.android.gms.tasks.Task.isSuccessful():boolean A[MD:():boolean (m), WRAPPED]) != false) ? (wrap com.google.android.gms.games.internal.v2.appshortcuts.zzg:0x000a: CHECK_CAST (com.google.android.gms.games.internal.v2.appshortcuts.zzg) (wrap java.lang.Object:0x0006: INVOKE (r3v0 com.google.android.gms.tasks.Task) VIRTUAL call: com.google.android.gms.tasks.Task.getResult():java.lang.Object A[MD:():TResult (m), WRAPPED])) : (wrap com.google.android.gms.games.internal.v2.appshortcuts.zzg:0x000d: INVOKE (r1v0 fb.n1), (r2v0 fb.n1) STATIC call: ka.d.e(fb.n1, fb.n1):com.google.android.gms.games.internal.v2.appshortcuts.zzg A[MD:(fb.n1, fb.n1):com.google.android.gms.games.internal.v2.appshortcuts.zzg (m), WRAPPED]) */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ zzg m31167d(AbstractC5546n1 abstractC5546n1, AbstractC5546n1 abstractC5546n2, Task task) {
        return task.isSuccessful() ? (zzg) task.getResult() : m31168e(abstractC5546n1, abstractC5546n2);
    }

    /* JADX INFO: renamed from: e */
    public static zzg m31168e(AbstractC5546n1 abstractC5546n1, AbstractC5546n1 abstractC5546n2) {
        return new zzg(m31169f(abstractC5546n1), AbstractC5546n1.m25214f(), m31169f(abstractC5546n2), AbstractC5546n1.m25214f());
    }

    /* JADX INFO: renamed from: f */
    public static AbstractC5546n1 m31169f(AbstractC5546n1 abstractC5546n1) {
        AbstractC5558r1 abstractC5558r1 = AbstractC5546n1.f21331b;
        C5534j1 c5534j1 = new C5534j1();
        int size = abstractC5546n1.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strZza = ((zzi) abstractC5546n1.get(i10)).zza();
            if (strZza != null) {
                c5534j1.m25202d(strZza);
            }
        }
        return c5534j1.m25203e();
    }

    /* JADX INFO: renamed from: g */
    public static AbstractC5546n1 m31170g(List list) {
        AbstractC5558r1 abstractC5558r1 = AbstractC5546n1.f21331b;
        C5534j1 c5534j1 = new C5534j1();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ShortcutInfo shortcutInfo = (ShortcutInfo) it.next();
            if (!shortcutInfo.isImmutable() && shortcutInfo.getId().startsWith("PLAY_GAMES_SERVICES_")) {
                c5534j1.m25202d(new zzi(shortcutInfo.getId(), shortcutInfo.getExtras(), Boolean.valueOf(shortcutInfo.isPinned()), Boolean.valueOf(shortcutInfo.isEnabled())));
            }
        }
        return c5534j1.m25203e();
    }

    @Override // p243ka.C7519e
    /* JADX INFO: renamed from: a */
    public final void mo31171a() {
        C5569v0.m25232a();
        new Thread(new Runnable() { // from class: ka.c
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f28873a.m31172c();
            }
        }, "initialize-shortcuts").start();
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m31172c() {
        Task taskM42336f;
        Context context = this.f28874a;
        final ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        if (shortcutManager == null) {
            return;
        }
        final zzr zzrVarM31177a = C7530p.m31177a(context, PlayGamesAppShortcutsActivity.class);
        final AbstractC5546n1 abstractC5546n1M31170g = m31170g(shortcutManager.getDynamicShortcuts());
        final AbstractC5546n1 abstractC5546n1M31170g2 = m31170g(shortcutManager.getPinnedShortcuts());
        if (zzrVarM31177a == null || zzrVarM31177a.zza() <= 0) {
            taskM42336f = C11268m.m42336f(m31168e(abstractC5546n1M31170g, abstractC5546n1M31170g2));
        } else {
            final C7528n c7528n = new C7528n(context);
            taskM42336f = c7528n.m31151z(AbstractC8078u.m33280c().m33289e(6744).m33288d(C4506j.f18542g).m33287c(false).m33286b(new InterfaceC8066q() { // from class: ka.m
                /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: T */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // p268l9.InterfaceC8066q
                public final /* synthetic */ void accept(Object obj, Object obj2) {
                    ((C7532r) ((C7531q) obj).getService()).m31178t2(new BinderC7523i(c7528n, (C11264k) obj2), zzrVarM31177a, abstractC5546n1M31170g, abstractC5546n1M31170g2);
                }
            }).m33285a()).mo11894h(C5564t1.m25231a(), new InterfaceC11248c() { // from class: ka.b
                @Override // sb.InterfaceC11248c
                public final /* synthetic */ Object then(Task task) {
                    return C7518d.m31167d(abstractC5546n1M31170g, abstractC5546n1M31170g2, task);
                }
            });
        }
        taskM42336f.mo11892f(C5564t1.m25231a(), new InterfaceC11256g() { // from class: ka.a
            @Override // sb.InterfaceC11256g
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
                List<String> listM9451v3 = zzgVar.m9451v3();
                if (listM9451v3 != null && !listM9451v3.isEmpty()) {
                    shortcutManager2.disableShortcuts(listM9451v3);
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
