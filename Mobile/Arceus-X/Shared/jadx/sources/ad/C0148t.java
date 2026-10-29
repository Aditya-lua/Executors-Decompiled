package ad;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: ad.t */
/* JADX INFO: loaded from: classes2.dex */
public class C0148t {

    /* JADX INFO: renamed from: ad.t$a */
    public static class a {
        @NonNull
        /* JADX INFO: renamed from: a */
        public static Rect m464a(@NonNull WindowManager windowManager) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Rect rect = new Rect();
            rect.right = point.x;
            rect.bottom = point.y;
            return rect;
        }
    }

    /* JADX INFO: renamed from: ad.t$b */
    public static class b {
        @NonNull
        /* JADX INFO: renamed from: a */
        public static Rect m465a(@NonNull WindowManager windowManager) {
            return windowManager.getCurrentWindowMetrics().getBounds();
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static Rect m463a(@NonNull Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        return Build.VERSION.SDK_INT >= 30 ? b.m465a(windowManager) : a.m464a(windowManager);
    }
}
