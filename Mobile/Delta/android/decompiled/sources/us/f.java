package us;

import android.content.Context;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class f implements e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f32587a;
    public final List<j> b = new ArrayList(3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView.BufferType f32588c = TextView.BufferType.SPANNABLE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f32589d = true;

    public f(@NonNull Context context) {
        this.f32587a = context;
    }

    @NonNull
    public static List<j> b(@NonNull List<j> list) {
        return new q(list).b();
    }

    @Override // us.e.a
    @NonNull
    public e.a a(@NonNull j jVar) {
        this.b.add(jVar);
        return this;
    }

    @Override // us.e.a
    @NonNull
    public e build() {
        if (this.b.isEmpty()) {
            throw new IllegalStateException("No plugins were added to this builder. Use #usePlugin method to add them");
        }
        List<j> listB = b(this.b);
        rn.f.a aVar = new rn.f.a();
        vs.c.a aVarI = vs.c.i(this.f32587a);
        g.a aVar2 = new g.a();
        o.a aVar3 = new o.a();
        l.a aVar4 = new l.a();
        for (j jVar : listB) {
            jVar.i(aVar);
            jVar.k(aVarI);
            jVar.h(aVar2);
            jVar.f(aVar3);
            jVar.g(aVar4);
        }
        g gVarH = aVar2.h(aVarI.z(), aVar4.build());
        return new i(this.f32588c, null, aVar.k(), n.b(aVar3, gVarH), gVarH, Collections.unmodifiableList(listB), this.f32589d);
    }
}
