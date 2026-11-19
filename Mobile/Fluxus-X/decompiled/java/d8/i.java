package d8;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11971a;
    public final m8.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m8.a f11972c;

    public i(Context context, m8.a aVar, m8.a aVar2) {
        this.f11971a = context;
        this.b = aVar;
        this.f11972c = aVar2;
    }

    public h a(String str) {
        return h.a(this.f11971a, this.b, this.f11972c, str);
    }
}
