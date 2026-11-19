package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import y5.p0;
import y5.w;

/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements l5.b<p0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f2958a = w.i("WrkMgrInitializer");

    @Override // l5.b
    public List<Class<? extends l5.b<?>>> a() {
        return Collections.EMPTY_LIST;
    }

    @Override // l5.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p0 create(Context context) {
        w.e().a(f2958a, "Initializing WorkManager with default configuration.");
        p0.i(context, new a.C0067a().a());
        return p0.h(context);
    }
}
