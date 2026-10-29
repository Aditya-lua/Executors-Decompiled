package a9;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import k9.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends e<k9.a.d.c> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final k9.a.g f259k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final k9.a.AbstractC0392a f260l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final k9.a f261m;

    static {
        k9.a.g gVar = new k9.a.g();
        f259k = gVar;
        c cVar = new c();
        f260l = cVar;
        f261m = new k9.a("SmsRetriever.API", cVar, gVar);
    }

    public b(@NonNull Context context) {
        super(context, (k9.a<k9.a.d.c>) f261m, k9.a.d.Jo, e.a.f22280c);
    }

    @NonNull
    public abstract Task<Void> P();
}
