package r6;

import android.content.Context;
import android.content.res.Resources;
import k6.h0;
import k6.i0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x6.Options;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0006\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lr6/e;", "Lr6/c;", "", "Lk6/h0;", "<init>", "()V", "data", "Lx6/p;", "options", "c", "(ILx6/p;)Lk6/h0;", "Landroid/content/Context;", "context", "", "b", "(ILandroid/content/Context;)Z", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements c<Integer, h0> {
    @Override // r6.c
    public /* bridge */ /* synthetic */ h0 a(Integer num, Options options) {
        return c(num.intValue(), options);
    }

    public final boolean b(int data, Context context) {
        try {
            return context.getResources().getResourceEntryName(data) != null;
        } catch (Resources.NotFoundException unused) {
        }
    }

    @Nullable
    public h0 c(int data, @NotNull Options options) {
        if (!b(data, options.getContext())) {
            return null;
        }
        return i0.j("android.resource://" + options.getContext().getPackageName() + '/' + data, null, 1, null);
    }
}
