package p459u5;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: u5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C11801a {

    /* JADX INFO: renamed from: b */
    public static final ViewGroup.MarginLayoutParams f41551b;

    /* JADX INFO: renamed from: a */
    public LinearLayoutManager f41552a;

    /* JADX INFO: renamed from: u5.a$a */
    public class a implements Comparator<int[]> {
        public a() {
        }

        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f41551b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    public C11801a(@NonNull LinearLayoutManager linearLayoutManager) {
        this.f41552a = linearLayoutManager;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m44151c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (m44151c(viewGroup.getChildAt(i10))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m44152a() {
        int top;
        int i10;
        int bottom;
        int i11;
        int iM5574O = this.f41552a.m5574O();
        if (iM5574O == 0) {
            return true;
        }
        boolean z10 = this.f41552a.m5194q2() == 0;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iM5574O, 2);
        for (int i12 = 0; i12 < iM5574O; i12++) {
            View viewM5573N = this.f41552a.m5573N(i12);
            if (viewM5573N == null) {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
            ViewGroup.LayoutParams layoutParams = viewM5573N.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : f41551b;
            int[] iArr2 = iArr[i12];
            if (z10) {
                top = viewM5573N.getLeft();
                i10 = marginLayoutParams.leftMargin;
            } else {
                top = viewM5573N.getTop();
                i10 = marginLayoutParams.topMargin;
            }
            iArr2[0] = top - i10;
            int[] iArr3 = iArr[i12];
            if (z10) {
                bottom = viewM5573N.getRight();
                i11 = marginLayoutParams.rightMargin;
            } else {
                bottom = viewM5573N.getBottom();
                i11 = marginLayoutParams.bottomMargin;
            }
            iArr3[1] = bottom + i11;
        }
        Arrays.sort(iArr, new a());
        for (int i13 = 1; i13 < iM5574O; i13++) {
            if (iArr[i13 - 1][1] != iArr[i13][0]) {
                return false;
            }
        }
        int[] iArr4 = iArr[0];
        int i14 = iArr4[1];
        int i15 = iArr4[0];
        return i15 <= 0 && iArr[iM5574O - 1][1] >= i14 - i15;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m44153b() {
        int iM5574O = this.f41552a.m5574O();
        for (int i10 = 0; i10 < iM5574O; i10++) {
            if (m44151c(this.f41552a.m5573N(i10))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public boolean m44154d() {
        return (!m44152a() || this.f41552a.m5574O() <= 1) && m44153b();
    }
}
