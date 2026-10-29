package ae;

import android.os.Handler;
import android.os.Looper;
import be.C1334j1;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import sb.C11268m;

/* JADX INFO: renamed from: ae.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C0165h implements InterfaceC0152b {

    /* JADX INFO: renamed from: a */
    public final C0150a0 f542a;

    /* JADX INFO: renamed from: b */
    public final C0151a1 f543b;

    /* JADX INFO: renamed from: c */
    public final C0194v0 f544c;

    /* JADX INFO: renamed from: d */
    public final C0156c0 f545d;

    /* JADX INFO: renamed from: e */
    public final Handler f546e = new Handler(Looper.getMainLooper());

    public C0165h(C0150a0 c0150a0, C0151a1 c0151a1, C0194v0 c0194v0, C0156c0 c0156c0) {
        this.f542a = c0150a0;
        this.f543b = c0151a1;
        this.f544c = c0194v0;
        this.f545d = c0156c0;
    }

    /* JADX INFO: renamed from: i */
    public static List m523i(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Locale) it.next()).toLanguageTag());
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0046  */
    @Override // ae.InterfaceC0152b
    /* JADX INFO: renamed from: a */
    public final Task<Integer> mo483a(C0157d c0157d) {
        Set setM544d;
        C1334j1 c1334j1 = new C1334j1();
        c1334j1.m7177b(1);
        c0157d.m496a().isEmpty();
        List<Locale> listM496a = c0157d.m496a();
        if (!listM496a.isEmpty() && (setM544d = this.f544c.m544d()) != null) {
            HashSet hashSet = new HashSet();
            Iterator<Locale> it = listM496a.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().getLanguage());
            }
            if (setM544d.containsAll(hashSet)) {
                if (this.f544c.m543c().containsAll(c0157d.m497b()) && Collections.disjoint(c0157d.m497b(), this.f545d.m490a())) {
                    this.f546e.post(new RunnableC0154b1(this, c0157d));
                    return C11268m.m42336f(0);
                }
            }
        } else if (this.f544c.m543c().containsAll(c0157d.m497b())) {
            this.f546e.post(new RunnableC0154b1(this, c0157d));
            return C11268m.m42336f(0);
        }
        this.f545d.m493d(c0157d.m497b());
        return this.f542a.m477e(c0157d.m497b(), m523i(c0157d.m496a()), c1334j1);
    }

    @Override // ae.InterfaceC0152b
    /* JADX INFO: renamed from: b */
    public final synchronized void mo484b(InterfaceC0161f interfaceC0161f) {
        this.f543b.m7197d(interfaceC0161f);
    }

    @Override // ae.InterfaceC0152b
    /* JADX INFO: renamed from: c */
    public final synchronized void mo485c(InterfaceC0161f interfaceC0161f) {
        this.f543b.m7195b(interfaceC0161f);
    }

    @Override // ae.InterfaceC0152b
    /* JADX INFO: renamed from: d */
    public final Task<Void> mo486d(List<String> list) {
        this.f545d.m492c(list);
        return this.f542a.m476d(list);
    }

    @Override // ae.InterfaceC0152b
    /* JADX INFO: renamed from: e */
    public final Set<String> mo487e() {
        return this.f544c.m543c();
    }

    @Override // ae.InterfaceC0152b
    /* JADX INFO: renamed from: f */
    public final Task<Void> mo488f(List<String> list) {
        return this.f542a.m475c(list);
    }
}
