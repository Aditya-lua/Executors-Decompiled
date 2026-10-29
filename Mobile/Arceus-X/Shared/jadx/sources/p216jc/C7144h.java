package p216jc;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import p504w1.C12286j;

/* JADX INFO: renamed from: jc.h */
/* JADX INFO: loaded from: classes2.dex */
public class C7144h {

    /* JADX INFO: renamed from: a */
    public final C12286j<String, C7145i> f27797a = new C12286j<>();

    /* JADX INFO: renamed from: b */
    public final C12286j<String, PropertyValuesHolder[]> f27798b = new C12286j<>();

    /* JADX INFO: renamed from: a */
    public static void m29931a(@NonNull C7144h c7144h, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c7144h.m29938h(objectAnimator.getPropertyName(), objectAnimator.getValues());
            c7144h.m29939i(objectAnimator.getPropertyName(), C7145i.m29940b(objectAnimator));
        } else {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C7144h m29932b(@NonNull Context context, @NonNull TypedArray typedArray, int i10) {
        int resourceId;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return m29933c(context, resourceId);
    }

    /* JADX INFO: renamed from: c */
    public static C7144h m29933c(@NonNull Context context, int i10) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i10);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return m29934d(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return m29934d(arrayList);
        } catch (Exception e10) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i10), e10);
            return null;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static C7144h m29934d(@NonNull List<Animator> list) {
        C7144h c7144h = new C7144h();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            m29931a(c7144h, list.get(i10));
        }
        return c7144h;
    }

    /* JADX INFO: renamed from: e */
    public C7145i m29935e(String str) {
        if (m29937g(str)) {
            return this.f27797a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7144h) {
            return this.f27797a.equals(((C7144h) obj).f27797a);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public long m29936f() {
        int size = this.f27797a.getSize();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            C7145i c7145iM45629k = this.f27797a.m45629k(i10);
            jMax = Math.max(jMax, c7145iM45629k.m29943c() + c7145iM45629k.m29944d());
        }
        return jMax;
    }

    /* JADX INFO: renamed from: g */
    public boolean m29937g(String str) {
        return this.f27797a.get(str) != null;
    }

    /* JADX INFO: renamed from: h */
    public void m29938h(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f27798b.put(str, propertyValuesHolderArr);
    }

    public int hashCode() {
        return this.f27797a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public void m29939i(String str, C7145i c7145i) {
        this.f27797a.put(str, c7145i);
    }

    @NonNull
    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f27797a + "}\n";
    }
}
