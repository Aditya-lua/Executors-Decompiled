package rq;

import java.util.List;
import org.jetbrains.annotations.Nullable;
import wt.e;
import wt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements b.InterfaceC0610b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f30920a;

    public d(c cVar) {
        this.f30920a = cVar;
    }

    public static i<b.InterfaceC0610b> b(c cVar) {
        return e.a(new d(cVar));
    }

    @Override // rq.b.InterfaceC0610b
    public b a(String str, String str2, String str3, @Nullable List<PoseInfo> list, @Nullable Long l10) {
        return this.f30920a.b(str, str2, str3, list, l10);
    }
}
