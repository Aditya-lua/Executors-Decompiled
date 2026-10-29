package p093e4;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.view.C0625o0;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC0586b0;
import androidx.fragment.app.ComponentCallbacksC0929c;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p456u2.C11776e;

/* JADX INFO: renamed from: e4.j0 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public abstract class AbstractC4818j0 {

    /* JADX INFO: renamed from: e4.j0$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f19456a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ArrayList f19457b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ArrayList f19458c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ArrayList f19459d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ ArrayList f19460e;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f19456a = i10;
            this.f19457b = arrayList;
            this.f19458c = arrayList2;
            this.f19459d = arrayList3;
            this.f19460e = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i10 = 0; i10 < this.f19456a; i10++) {
                C0625o0.m2989F0((View) this.f19457b.get(i10), (String) this.f19458c.get(i10));
                C0625o0.m2989F0((View) this.f19459d.get(i10), (String) this.f19460e.get(i10));
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m23312f(List<View> list, View view) {
        int size = list.size();
        if (m23313i(list, view, size)) {
            return;
        }
        if (C0625o0.m2992H(view) != null) {
            list.add(view);
        }
        for (int i10 = size; i10 < list.size(); i10++) {
            View view2 = list.get(i10);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    if (!m23313i(list, childAt, size) && C0625o0.m2992H(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m23313i(List<View> list, View view, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (list.get(i11) == view) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m23314l(List list) {
        return list == null || list.isEmpty();
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo23294A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* JADX INFO: renamed from: B */
    public abstract Object mo23295B(Object obj);

    /* JADX INFO: renamed from: a */
    public abstract void mo23297a(@NonNull Object obj, @NonNull View view);

    /* JADX INFO: renamed from: b */
    public abstract void mo23298b(@NonNull Object obj, @NonNull ArrayList<View> arrayList);

    /* JADX INFO: renamed from: c */
    public void mo23315c(@NonNull Object obj) {
    }

    /* JADX INFO: renamed from: d */
    public void mo23316d(@NonNull Object obj, @NonNull Runnable runnable) {
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo23299e(@NonNull ViewGroup viewGroup, Object obj);

    /* JADX INFO: renamed from: g */
    public abstract boolean mo23300g(@NonNull Object obj);

    /* JADX INFO: renamed from: h */
    public abstract Object mo23301h(Object obj);

    /* JADX INFO: renamed from: j */
    public Object mo23317j(@NonNull ViewGroup viewGroup, @NonNull Object obj) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public void m23318k(View view, Rect rect) {
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

    /* JADX INFO: renamed from: m */
    public boolean mo23302m() {
        if (!FragmentManager.m4349N0(4)) {
            return false;
        }
        Log.i("FragmentManager", "Older versions of AndroidX Transition do not support seeking. Add dependency on AndroidX Transition 1.5.0 or higher to enable seeking.");
        return false;
    }

    /* JADX INFO: renamed from: n */
    public boolean mo23303n(@NonNull Object obj) {
        return false;
    }

    /* JADX INFO: renamed from: o */
    public abstract Object mo23304o(Object obj, Object obj2, Object obj3);

    /* JADX INFO: renamed from: p */
    public abstract Object mo23305p(Object obj, Object obj2, Object obj3);

    /* JADX INFO: renamed from: q */
    public ArrayList<String> m23319q(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = arrayList.get(i10);
            arrayList2.add(C0625o0.m2992H(view));
            C0625o0.m2989F0(view, null);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: r */
    public abstract void mo23306r(@NonNull Object obj, @NonNull View view, @NonNull ArrayList<View> arrayList);

    /* JADX INFO: renamed from: s */
    public abstract void mo23307s(@NonNull Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* JADX INFO: renamed from: t */
    public void mo23320t(@NonNull Object obj, float f10) {
    }

    /* JADX INFO: renamed from: u */
    public abstract void mo23308u(@NonNull Object obj, @NonNull Rect rect);

    /* JADX INFO: renamed from: v */
    public abstract void mo23309v(@NonNull Object obj, View view);

    /* JADX INFO: renamed from: w */
    public void mo23310w(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c, @NonNull Object obj, @NonNull C11776e c11776e, @NonNull Runnable runnable) {
        mo23321x(componentCallbacksC0929c, obj, c11776e, null, runnable);
    }

    /* JADX INFO: renamed from: x */
    public void mo23321x(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c, @NonNull Object obj, @NonNull C11776e c11776e, Runnable runnable, @NonNull Runnable runnable2) {
        runnable2.run();
    }

    /* JADX INFO: renamed from: y */
    public void m23322y(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = arrayList.get(i10);
            String strM2992H = C0625o0.m2992H(view2);
            arrayList4.add(strM2992H);
            if (strM2992H != null) {
                C0625o0.m2989F0(view2, null);
                String str = map.get(strM2992H);
                for (int i11 = 0; i11 < size; i11++) {
                    if (str.equals(arrayList3.get(i11))) {
                        C0625o0.m2989F0(arrayList2.get(i11), strM2992H);
                        break;
                    }
                }
            }
        }
        ViewTreeObserverOnPreDrawListenerC0586b0.m2815a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* JADX INFO: renamed from: z */
    public abstract void mo23311z(@NonNull Object obj, @NonNull View view, @NonNull ArrayList<View> arrayList);
}
