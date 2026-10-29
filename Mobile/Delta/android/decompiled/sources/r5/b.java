package r5;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public static <T extends View> T a(View view, int i10) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            T t8 = (T) viewGroup.getChildAt(i11).findViewById(i10);
            if (t8 != null) {
                return t8;
            }
        }
        return null;
    }
}
