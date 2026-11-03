package c8;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4826a;
    public final l8.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l8.a f4827c;

    public i(Context context, l8.a aVar, l8.a aVar2) {
        this.f4826a = context;
        this.b = aVar;
        this.f4827c = aVar2;
    }

    public h a(String str) {
        return h.a(this.f4826a, this.b, this.f4827c, str);
    }
}
