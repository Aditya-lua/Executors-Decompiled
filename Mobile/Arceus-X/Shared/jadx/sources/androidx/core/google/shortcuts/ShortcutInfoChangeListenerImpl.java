package androidx.core.google.shortcuts;

import android.content.Context;
import android.os.PersistableBundle;
import androidx.annotation.NonNull;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p283m2.AbstractC8409b;
import p283m2.C8410c;
import p319o2.C9629a;
import p319o2.C9630b;
import p319o2.C9631c;
import p349p2.C10153a;
import p487v8.AbstractC12101b;
import p487v8.AbstractC12107h;
import p487v8.InterfaceC12100a;
import p487v8.InterfaceC12106g;
import pe.C10235p;

/* JADX INFO: loaded from: classes.dex */
public class ShortcutInfoChangeListenerImpl extends AbstractC8409b {

    /* JADX INFO: renamed from: a */
    public final Context f2275a;

    /* JADX INFO: renamed from: b */
    public final AbstractC12101b f2276b;

    /* JADX INFO: renamed from: c */
    public final AbstractC12107h f2277c;

    /* JADX INFO: renamed from: d */
    public final C10235p f2278d;

    /* JADX INFO: renamed from: androidx.core.google.shortcuts.ShortcutInfoChangeListenerImpl$a */
    public static class C0541a {
        @NonNull
        /* JADX INFO: renamed from: a */
        public static C9629a m2660a(@NonNull String str, PersistableBundle persistableBundle) {
            String[] stringArray;
            C9629a c9629aM46171g = new C9629a().m46171g(str);
            if (persistableBundle != null && (stringArray = persistableBundle.getStringArray(str)) != null) {
                ArrayList arrayList = new ArrayList();
                for (String str2 : stringArray) {
                    C9630b c9630bM46171g = new C9630b().m46171g(str2);
                    String[] stringArray2 = persistableBundle.getStringArray(str + "/" + str2);
                    if (stringArray2 != null && stringArray2.length != 0) {
                        c9630bM46171g.m37998l(stringArray2);
                        arrayList.add(c9630bM46171g);
                    }
                }
                if (arrayList.size() > 0) {
                    c9629aM46171g.m37997l((C9630b[]) arrayList.toArray(new C9630b[0]));
                }
            }
            return c9629aM46171g;
        }
    }

    public ShortcutInfoChangeListenerImpl(Context context, AbstractC12101b abstractC12101b, AbstractC12107h abstractC12107h, C10235p c10235p) {
        this.f2275a = context;
        this.f2276b = abstractC12101b;
        this.f2277c = abstractC12107h;
        this.f2278d = c10235p;
    }

    @NonNull
    public static ShortcutInfoChangeListenerImpl getInstance(@NonNull Context context) {
        return new ShortcutInfoChangeListenerImpl(context, AbstractC12101b.m44942a(context), AbstractC12107h.m44946b(context), C10153a.m39093c(context));
    }

    @Override // p283m2.AbstractC8409b
    /* JADX INFO: renamed from: a */
    public void mo2655a() {
        this.f2276b.mo44943b();
    }

    @Override // p283m2.AbstractC8409b
    /* JADX INFO: renamed from: b */
    public void mo2656b(@NonNull List<C8410c> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<C8410c> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m2659e(it.next()).m46165a());
        }
        this.f2276b.mo44944c((InterfaceC12106g[]) arrayList.toArray(new InterfaceC12106g[0]));
    }

    @Override // p283m2.AbstractC8409b
    /* JADX INFO: renamed from: c */
    public void mo2657c(@NonNull List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.f2277c.mo44947a(m2658d(C10153a.m39092b(this.f2275a, it.next())));
        }
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public final InterfaceC12100a m2658d(@NonNull String str) {
        return new InterfaceC12100a.a("ViewAction").m44941b("", str).m44940a();
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public final C9631c m2659e(@NonNull C8410c c8410c) {
        String strM39092b = C10153a.m39092b(this.f2275a, c8410c.m34077f());
        C9631c c9631cM38002o = new C9631c().m46169e(c8410c.m34077f()).m46172h(strM39092b).m38001n(c8410c.m34081m().toString()).m38002o(C10153a.m39091a(this.f2275a, c8410c.m34078g(), this.f2278d));
        if (c8410c.m34079j() != null) {
            c9631cM38002o.m38000m(c8410c.m34079j().toString());
        }
        if (c8410c.m34074c() != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : c8410c.m34074c()) {
                if (C10153a.m39094d(str)) {
                    arrayList.add(C0541a.m2660a(str, c8410c.m34075d()));
                }
            }
            if (!arrayList.isEmpty()) {
                c9631cM38002o.m37999l((C9629a[]) arrayList.toArray(new C9629a[0]));
            }
        }
        if (c8410c.m34076e() != null) {
            IconCompat iconCompatM34076e = c8410c.m34076e();
            if (iconCompatM34076e.m2692i() == 6 || iconCompatM34076e.m2692i() == 4) {
                c9631cM38002o.m46170f(iconCompatM34076e.m2693j().toString());
            }
        }
        return c9631cM38002o;
    }
}
