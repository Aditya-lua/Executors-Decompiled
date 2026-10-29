package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import p238k5.InterfaceC7448b;
import p536x5.AbstractC12719p0;
import p536x5.AbstractC12732w;

/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements InterfaceC7448b<AbstractC12719p0> {

    /* JADX INFO: renamed from: a */
    public static final String f4522a = AbstractC12732w.m47443i("WrkMgrInitializer");

    /* JADX DEBUG: Method merged with bridge method: create(Landroid/content/Context;)Ljava/lang/Object; */
    @Override // p238k5.InterfaceC7448b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC12719p0 create(Context context) {
        AbstractC12732w.m47441e().mo47444a(f4522a, "Initializing WorkManager with default configuration.");
        AbstractC12719p0.m47393i(context, new C1115a.a().m6287a());
        return AbstractC12719p0.m47392h(context);
    }

    @Override // p238k5.InterfaceC7448b
    public List<Class<? extends InterfaceC7448b<?>>> dependencies() {
        return Collections.EMPTY_LIST;
    }
}
