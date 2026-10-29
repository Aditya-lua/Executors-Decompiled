package p170hf;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.measurement.C2349v3;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p128ff.C5587b;
import p128ff.C5590e;
import p218jf.C7151b;
import p305n9.C8953m;
import p490vf.C12164a;
import p490vf.InterfaceC12165b;
import p490vf.InterfaceC12167d;

/* JADX INFO: renamed from: hf.b */
/* JADX INFO: loaded from: classes2.dex */
public class C6393b implements InterfaceC6392a {

    /* JADX INFO: renamed from: c */
    public static volatile InterfaceC6392a f24323c;

    /* JADX INFO: renamed from: a */
    public final AppMeasurementSdk f24324a;

    /* JADX INFO: renamed from: b */
    public final Map f24325b;

    public C6393b(AppMeasurementSdk appMeasurementSdk) {
        C8953m.m36047l(appMeasurementSdk);
        this.f24324a = appMeasurementSdk;
        this.f24325b = new ConcurrentHashMap();
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static InterfaceC6392a m27973c(@NonNull C5590e c5590e, @NonNull Context context, @NonNull InterfaceC12167d interfaceC12167d) {
        C8953m.m36047l(c5590e);
        C8953m.m36047l(context);
        C8953m.m36047l(interfaceC12167d);
        C8953m.m36047l(context.getApplicationContext());
        if (f24323c == null) {
            synchronized (C6393b.class) {
                try {
                    if (f24323c == null) {
                        Bundle bundle = new Bundle(1);
                        if (c5590e.m25274u()) {
                            interfaceC12167d.mo34369a(C5587b.class, new Executor() { // from class: hf.d
                                @Override // java.util.concurrent.Executor
                                public final /* synthetic */ void execute(Runnable runnable) {
                                    runnable.run();
                                }
                            }, new InterfaceC12165b() { // from class: hf.c
                                @Override // p490vf.InterfaceC12165b
                                /* JADX INFO: renamed from: a */
                                public final /* synthetic */ void mo14677a(C12164a c12164a) {
                                    C6393b.m27974d(c12164a);
                                }
                            });
                            bundle.putBoolean("dataCollectionDefaultEnabled", c5590e.m25273t());
                        }
                        f24323c = new C6393b(C2349v3.m10791r(context, bundle).m10819s());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f24323c;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m27974d(C12164a c12164a) {
        boolean z10 = ((C5587b) c12164a.m45015a()).f21393a;
        synchronized (C6393b.class) {
            ((C6393b) C8953m.m36047l(f24323c)).f24324a.zza(z10);
        }
    }

    @Override // p170hf.InterfaceC6392a
    /* JADX INFO: renamed from: a */
    public void mo27971a(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (C7151b.m29948a(str) && C7151b.m29949b(str2, bundle) && C7151b.m29951d(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f24324a.logEvent(str, str2, bundle);
        }
    }

    @Override // p170hf.InterfaceC6392a
    /* JADX INFO: renamed from: b */
    public void mo27972b(@NonNull String str, @NonNull String str2, @NonNull Object obj) {
        if (C7151b.m29948a(str) && C7151b.m29950c(str, str2)) {
            this.f24324a.setUserProperty(str, str2, obj);
        }
    }
}
