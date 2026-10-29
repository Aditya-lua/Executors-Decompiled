package p010a9;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import p242k9.AbstractC7495e;
import p242k9.C7491a;

/* JADX INFO: renamed from: a9.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0100b extends AbstractC7495e<C7491a.d.c> {

    /* JADX INFO: renamed from: k */
    public static final C7491a.g f323k;

    /* JADX INFO: renamed from: l */
    public static final C7491a.a f324l;

    /* JADX INFO: renamed from: m */
    public static final C7491a f325m;

    static {
        C7491a.g gVar = new C7491a.g();
        f323k = gVar;
        C0101c c0101c = new C0101c();
        f324l = c0101c;
        f325m = new C7491a("SmsRetriever.API", c0101c, gVar);
    }

    public AbstractC0100b(@NonNull Context context) {
        super(context, (C7491a<C7491a.d.c>) f325m, C7491a.d.f28847Jo, AbstractC7495e.a.f28860c);
    }

    @NonNull
    /* JADX INFO: renamed from: P */
    public abstract Task<Void> mo298P();
}
