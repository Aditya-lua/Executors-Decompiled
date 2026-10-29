package p103eh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.Toolbar;
import sg.C11312e2;

/* JADX INFO: renamed from: eh.h */
/* JADX INFO: loaded from: classes2.dex */
public class C5120h {
    /* JADX INFO: renamed from: a */
    public static void m23897a(Toolbar toolbar, Context context, int i10, int i11) {
        View viewFindViewById = toolbar.findViewById(i10);
        if (viewFindViewById != null) {
            ActionMenuView.C0433c c0433c = (ActionMenuView.C0433c) viewFindViewById.getLayoutParams();
            ((LinearLayout.LayoutParams) c0433c).width = (int) C11312e2.m42501e(context, i11);
            viewFindViewById.setLayoutParams(c0433c);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m23898b(Toolbar toolbar, View.OnClickListener onClickListener) {
        toolbar.setNavigationOnClickListener(onClickListener);
    }

    /* JADX INFO: renamed from: c */
    public static void m23899c(Toolbar toolbar, int i10) {
        for (int i11 = 0; i11 < toolbar.getChildCount(); i11++) {
            View childAt = toolbar.getChildAt(i11);
            if (childAt != null && childAt.getClass() == AppCompatImageButton.class) {
                ((AppCompatImageButton) childAt).setImageResource(i10);
            }
        }
    }
}
