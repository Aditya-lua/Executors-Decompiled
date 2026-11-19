package lt;

import android.content.Context;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class f implements e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22511a;
    public final List<j> b = new ArrayList(3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView.BufferType f22512c = TextView.BufferType.SPANNABLE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f22513d = true;

    public f(@NonNull Context context) {
        this.f22511a = context;
    }

    @NonNull
    public static List<j> b(@NonNull List<j> list) {
        return new q(list).b();
    }

    @Override // lt.e.a
    @NonNull
    public e.a a(@NonNull j jVar) {
        this.b.add(jVar);
        return this;
    }

    @Override // lt.e.a
    @NonNull
    public e build() {
        if (this.b.isEmpty()) {
            throw new IllegalStateException("No plugins were added to this builder. Use #usePlugin method to add them");
        }
        List<j> listB = b(this.b);
        fo.f.a aVar = new fo.f.a();
        mt.c.a aVarI = mt.c.i(this.f22511a);
        g.a aVar2 = new g.a();
        o.a aVar3 = new o.a();
        l.a aVar4 = new l.a();
        for (j jVar : listB) {
            jVar.h(aVar);
            jVar.a(aVarI);
            jVar.j(aVar2);
            jVar.g(aVar3);
            jVar.b(aVar4);
        }
        g gVarH = aVar2.h(aVarI.z(), aVar4.build());
        return new i(this.f22512c, null, aVar.k(), n.b(aVar3, gVarH), gVarH, Collections.unmodifiableList(listB), this.f22513d);
    }
}
