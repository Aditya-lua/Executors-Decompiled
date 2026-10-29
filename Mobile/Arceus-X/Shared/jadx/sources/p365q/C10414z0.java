package p365q;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: q.z0 */
/* JADX INFO: loaded from: classes.dex */
public class C10414z0 extends C10400s0 {

    /* JADX INFO: renamed from: b */
    public final WeakReference<Context> f37526b;

    public C10414z0(@NonNull Context context, @NonNull Resources resources) {
        super(resources);
        this.f37526b = new WeakReference<>(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i10) {
        Drawable drawableM40024a = m40024a(i10);
        Context context = this.f37526b.get();
        if (drawableM40024a != null && context != null) {
            C10398r0.m39997g().m40017w(context, i10, drawableM40024a);
        }
        return drawableM40024a;
    }
}
