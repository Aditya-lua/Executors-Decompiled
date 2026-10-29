package eh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.Toolbar;
import sg.e2;

/* JADX INFO: loaded from: classes2.dex */
public class h {
    public static void a(Toolbar toolbar, Context context, int i10, int i11) {
        View viewFindViewById = toolbar.findViewById(i10);
        if (viewFindViewById != null) {
            ActionMenuView.c cVar = (ActionMenuView.c) viewFindViewById.getLayoutParams();
            ((LinearLayout.LayoutParams) cVar).width = (int) e2.e(context, i11);
            viewFindViewById.setLayoutParams(cVar);
        }
    }

    public static void b(Toolbar toolbar, View.OnClickListener onClickListener) {
        toolbar.setNavigationOnClickListener(onClickListener);
    }

    public static void c(Toolbar toolbar, int i10) {
        for (int i11 = 0; i11 < toolbar.getChildCount(); i11++) {
            View childAt = toolbar.getChildAt(i11);
            if (childAt != null && childAt.getClass() == AppCompatImageButton.class) {
                ((AppCompatImageButton) childAt).setImageResource(i10);
            }
        }
    }
}
