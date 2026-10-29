package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import x5.p0;
import x5.w;

/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements k5.b<p0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f3446a = w.i("WrkMgrInitializer");

    @Override // k5.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public p0 create(Context context) {
        w.e().a(f3446a, "Initializing WorkManager with default configuration.");
        p0.i(context, new a.C0063a().a());
        return p0.h(context);
    }

    @Override // k5.b
    public List<Class<? extends k5.b<?>>> dependencies() {
        return Collections.EMPTY_LIST;
    }
}
