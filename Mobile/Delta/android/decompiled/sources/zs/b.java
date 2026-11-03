package zs;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f38236a;

    public b(float f10) {
        this.f38236a = f10;
    }

    @NonNull
    public static b a(@NonNull Context context) {
        return new b(context.getResources().getDisplayMetrics().density);
    }

    public int b(int i10) {
        return (int) ((i10 * this.f38236a) + 0.5f);
    }
}
