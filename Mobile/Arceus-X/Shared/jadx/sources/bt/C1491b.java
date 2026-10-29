package bt;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: bt.b */
/* JADX INFO: loaded from: classes3.dex */
public class C1491b {

    /* JADX INFO: renamed from: a */
    public final float f5772a;

    public C1491b(float f10) {
        this.f5772a = f10;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C1491b m7616a(@NonNull Context context) {
        return new C1491b(context.getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: renamed from: b */
    public int m7617b(int i10) {
        return (int) ((i10 * this.f5772a) + 0.5f);
    }
}
