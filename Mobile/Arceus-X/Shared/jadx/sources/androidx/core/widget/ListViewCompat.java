package androidx.core.widget;

import android.os.Build;
import android.view.View;
import android.widget.ListView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class ListViewCompat {
    public static void scrollListBy(@NonNull ListView listView, int y10) {
        View firstView;
        if (Build.VERSION.SDK_INT >= 19) {
            listView.scrollListBy(y10);
            return;
        }
        int firstPosition = listView.getFirstVisiblePosition();
        if (firstPosition == -1 || (firstView = listView.getChildAt(0)) == null) {
            return;
        }
        int newTop = firstView.getTop() - y10;
        listView.setSelectionFromTop(firstPosition, newTop);
    }

    public static boolean canScrollList(@NonNull ListView listView, int direction) {
        if (Build.VERSION.SDK_INT >= 19) {
            return listView.canScrollList(direction);
        }
        int childCount = listView.getChildCount();
        if (childCount == 0) {
            return false;
        }
        int firstPosition = listView.getFirstVisiblePosition();
        if (direction > 0) {
            int lastBottom = listView.getChildAt(childCount - 1).getBottom();
            int lastPosition = firstPosition + childCount;
            return lastPosition < listView.getCount() || lastBottom > listView.getHeight() - listView.getListPaddingBottom();
        }
        int firstTop = listView.getChildAt(0).getTop();
        return firstPosition > 0 || firstTop < listView.getListPaddingTop();
    }

    private ListViewCompat() {
    }
}
