package us;

import android.content.Context;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p418rn.C10931f;
import p500vs.C12260c;

/* JADX INFO: renamed from: us.f */
/* JADX INFO: loaded from: classes3.dex */
public class C11940f implements AbstractC11939e.a {

    /* JADX INFO: renamed from: a */
    public final Context f42344a;

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC11944j> f42345b = new ArrayList(3);

    /* JADX INFO: renamed from: c */
    public TextView.BufferType f42346c = TextView.BufferType.SPANNABLE;

    /* JADX INFO: renamed from: d */
    public boolean f42347d = true;

    public C11940f(@NonNull Context context) {
        this.f42344a = context;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static List<InterfaceC11944j> m44566b(@NonNull List<InterfaceC11944j> list) {
        return new C11951q(list).m44610b();
    }

    @Override // us.AbstractC11939e.a
    @NonNull
    /* JADX INFO: renamed from: a */
    public AbstractC11939e.a mo44565a(@NonNull InterfaceC11944j interfaceC11944j) {
        this.f42345b.add(interfaceC11944j);
        return this;
    }

    @Override // us.AbstractC11939e.a
    @NonNull
    public AbstractC11939e build() {
        if (this.f42345b.isEmpty()) {
            throw new IllegalStateException("No plugins were added to this builder. Use #usePlugin method to add them");
        }
        List<InterfaceC11944j> listM44566b = m44566b(this.f42345b);
        C10931f.a aVar = new C10931f.a();
        C12260c.a aVarM45465i = C12260c.m45465i(this.f42344a);
        C11941g.a aVar2 = new C11941g.a();
        C11949o.a aVar3 = new C11949o.a();
        C11946l.a aVar4 = new C11946l.a();
        for (InterfaceC11944j interfaceC11944j : listM44566b) {
            interfaceC11944j.mo44554i(aVar);
            interfaceC11944j.mo44555k(aVarM45465i);
            interfaceC11944j.mo44553h(aVar2);
            interfaceC11944j.mo44583f(aVar3);
            interfaceC11944j.mo44584g(aVar4);
        }
        C11941g c11941gM44579h = aVar2.m44579h(aVarM45465i.m45509z(), aVar4.build());
        return new C11943i(this.f42346c, null, aVar.m41524k(), AbstractC11948n.m44601b(aVar3, c11941gM44579h), c11941gM44579h, Collections.unmodifiableList(listM44566b), this.f42347d);
    }
}
