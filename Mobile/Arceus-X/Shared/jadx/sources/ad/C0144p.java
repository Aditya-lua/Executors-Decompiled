package ad;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: ad.p */
/* JADX INFO: loaded from: classes2.dex */
public class C0144p {

    /* JADX INFO: renamed from: a */
    public static final Comparator<View> f505a = new a();

    /* JADX INFO: renamed from: ad.p$a */
    public class a implements Comparator<View> {
        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            return view.getTop() - view2.getTop();
        }
    }

    /* JADX INFO: renamed from: a */
    public static ActionMenuView m438a(@NonNull Toolbar toolbar) {
        for (int i10 = 0; i10 < toolbar.getChildCount(); i10++) {
            View childAt = toolbar.getChildAt(i10);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static ImageView m439b(@NonNull Toolbar toolbar, Drawable drawable) {
        ImageView imageView;
        Drawable drawable2;
        if (drawable == null) {
            return null;
        }
        for (int i10 = 0; i10 < toolbar.getChildCount(); i10++) {
            View childAt = toolbar.getChildAt(i10);
            if ((childAt instanceof ImageView) && (drawable2 = (imageView = (ImageView) childAt).getDrawable()) != null && drawable2.getConstantState() != null && drawable2.getConstantState().equals(drawable.getConstantState())) {
                return imageView;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static ImageView m440c(@NonNull Toolbar toolbar) {
        return m439b(toolbar, toolbar.getLogo());
    }

    /* JADX INFO: renamed from: d */
    public static ImageButton m441d(@NonNull Toolbar toolbar) {
        Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon == null) {
            return null;
        }
        for (int i10 = 0; i10 < toolbar.getChildCount(); i10++) {
            View childAt = toolbar.getChildAt(i10);
            if (childAt instanceof ImageButton) {
                ImageButton imageButton = (ImageButton) childAt;
                if (imageButton.getDrawable() == navigationIcon) {
                    return imageButton;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static TextView m442e(@NonNull Toolbar toolbar) {
        List<TextView> listM443f = m443f(toolbar, toolbar.getSubtitle());
        if (listM443f.isEmpty()) {
            return null;
        }
        return (TextView) Collections.max(listM443f, f505a);
    }

    /* JADX INFO: renamed from: f */
    public static List<TextView> m443f(@NonNull Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < toolbar.getChildCount(); i10++) {
            View childAt = toolbar.getChildAt(i10);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static TextView m444g(@NonNull Toolbar toolbar) {
        List<TextView> listM443f = m443f(toolbar, toolbar.getTitle());
        if (listM443f.isEmpty()) {
            return null;
        }
        return (TextView) Collections.min(listM443f, f505a);
    }
}
