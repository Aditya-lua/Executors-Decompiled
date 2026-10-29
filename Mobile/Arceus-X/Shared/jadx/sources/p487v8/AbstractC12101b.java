package p487v8;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.lang.ref.WeakReference;
import p305n9.C8953m;
import va.C12138n0;

/* JADX INFO: renamed from: v8.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12101b {

    /* JADX INFO: renamed from: a */
    public static WeakReference f42720a;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static synchronized AbstractC12101b m44942a(@NonNull Context context) {
        C8953m.m36047l(context);
        WeakReference weakReference = f42720a;
        AbstractC12101b abstractC12101b = weakReference == null ? null : (AbstractC12101b) weakReference.get();
        if (abstractC12101b != null) {
            return abstractC12101b;
        }
        C12138n0 c12138n0 = new C12138n0(context.getApplicationContext());
        f42720a = new WeakReference(c12138n0);
        return c12138n0;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public abstract Task<Void> mo44943b();

    @NonNull
    /* JADX INFO: renamed from: c */
    public abstract Task<Void> mo44944c(@NonNull InterfaceC12106g... interfaceC12106gArr);
}
