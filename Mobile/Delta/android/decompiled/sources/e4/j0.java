package e4;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public abstract class j0 {

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f15113a;
        public final /* synthetic */ ArrayList b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ArrayList f15114c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ArrayList f15115d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ArrayList f15116e;

        public a(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f15113a = i10;
            this.b = arrayList;
            this.f15114c = arrayList2;
            this.f15115d = arrayList3;
            this.f15116e = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i10 = 0; i10 < this.f15113a; i10++) {
                androidx.core.view.o0.F0((View) this.b.get(i10), (String) this.f15114c.get(i10));
                androidx.core.view.o0.F0((View) this.f15115d.get(i10), (String) this.f15116e.get(i10));
            }
        }
    }

    public static void f(List<View> list, View view) {
        int size = list.size();
        if (i(list, view, size)) {
            return;
        }
        if (androidx.core.view.o0.H(view) != null) {
            list.add(view);
        }
        for (int i10 = size; i10 < list.size(); i10++) {
            View view2 = list.get(i10);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    if (!i(list, childAt, size) && androidx.core.view.o0.H(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    public static boolean i(List<View> list, View view, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (list.get(i11) == view) {
                return true;
            }
        }
        return false;
    }

    public static boolean l(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object B(Object obj);

    public abstract void a(@NonNull Object obj, @NonNull View view);

    public abstract void b(@NonNull Object obj, @NonNull ArrayList<View> arrayList);

    public void c(@NonNull Object obj) {
    }

    public void d(@NonNull Object obj, @NonNull Runnable runnable) {
    }

    public abstract void e(@NonNull ViewGroup viewGroup, Object obj);

    public abstract boolean g(@NonNull Object obj);

    public abstract Object h(Object obj);

    public Object j(@NonNull ViewGroup viewGroup, @NonNull Object obj) {
        return null;
    }

    public void k(View view, Rect rect) {
        if (view.isAttachedToWindow()) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset(iArr[0], iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public boolean m() {
        if (!FragmentManager.N0(4)) {
            return false;
        }
        Log.i("FragmentManager", "Older versions of AndroidX Transition do not support seeking. Add dependency on AndroidX Transition 1.5.0 or higher to enable seeking.");
        return false;
    }

    public boolean n(@NonNull Object obj) {
        return false;
    }

    public abstract Object o(Object obj, Object obj2, Object obj3);

    public abstract Object p(Object obj, Object obj2, Object obj3);

    public ArrayList<String> q(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = arrayList.get(i10);
            arrayList2.add(androidx.core.view.o0.H(view));
            androidx.core.view.o0.F0(view, null);
        }
        return arrayList2;
    }

    public abstract void r(@NonNull Object obj, @NonNull View view, @NonNull ArrayList<View> arrayList);

    public abstract void s(@NonNull Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public void t(@NonNull Object obj, float f10) {
    }

    public abstract void u(@NonNull Object obj, @NonNull Rect rect);

    public abstract void v(@NonNull Object obj, View view);

    public void w(@NonNull androidx.fragment.app.c cVar, @NonNull Object obj, @NonNull u2.e eVar, @NonNull Runnable runnable) {
        x(cVar, obj, eVar, null, runnable);
    }

    public void x(@NonNull androidx.fragment.app.c cVar, @NonNull Object obj, @NonNull u2.e eVar, Runnable runnable, @NonNull Runnable runnable2) {
        runnable2.run();
    }

    public void y(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = arrayList.get(i10);
            String strH = androidx.core.view.o0.H(view2);
            arrayList4.add(strH);
            if (strH != null) {
                androidx.core.view.o0.F0(view2, null);
                String str = map.get(strH);
                for (int i11 = 0; i11 < size; i11++) {
                    if (str.equals(arrayList3.get(i11))) {
                        androidx.core.view.o0.F0(arrayList2.get(i11), strH);
                        break;
                    }
                }
            }
        }
        androidx.core.view.b0.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void z(@NonNull Object obj, @NonNull View view, @NonNull ArrayList<View> arrayList);
}
