package b9;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import l9.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends g<l9.a.d.c> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final l9.a.g f3796k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final l9.a.AbstractC0421a f3797l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final l9.a f3798m;

    static {
        l9.a.g gVar = new l9.a.g();
        f3796k = gVar;
        c cVar = new c();
        f3797l = cVar;
        f3798m = new l9.a("SmsRetriever.API", cVar, gVar);
    }

    public b(@NonNull Context context) {
        super(context, (l9.a<l9.a.d.c>) f3798m, l9.a.d.Oo, g.a.f22012c);
    }

    @NonNull
    public abstract Task<Void> P();
}
