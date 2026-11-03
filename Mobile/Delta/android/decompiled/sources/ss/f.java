package ss;

import android.content.Context;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class f implements e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f31777a;
    public final List<j> b = new ArrayList(3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView.BufferType f31778c = TextView.BufferType.SPANNABLE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f31779d = true;

    public f(@NonNull Context context) {
        this.f31777a = context;
    }

    @NonNull
    public static List<j> b(@NonNull List<j> list) {
        return new q(list).b();
    }

    @Override // ss.e.a
    @NonNull
    public e.a a(@NonNull j jVar) {
        this.b.add(jVar);
        return this;
    }

    @Override // ss.e.a
    @NonNull
    public e build() {
        if (this.b.isEmpty()) {
            throw new IllegalStateException("No plugins were added to this builder. Use #usePlugin method to add them");
        }
        List<j> listB = b(this.b);
        pn.f.a aVar = new pn.f.a();
        ts.c.a aVarI = ts.c.i(this.f31777a);
        g.a aVar2 = new g.a();
        o.a aVar3 = new o.a();
        l.a aVar4 = new l.a();
        for (j jVar : listB) {
            jVar.b(aVar);
            jVar.e(aVarI);
            jVar.i(aVar2);
            jVar.a(aVar3);
            jVar.f(aVar4);
        }
        g gVarH = aVar2.h(aVarI.z(), aVar4.build());
        return new i(this.f31778c, null, aVar.k(), n.b(aVar3, gVarH), gVarH, Collections.unmodifiableList(listB), this.f31779d);
    }
}
