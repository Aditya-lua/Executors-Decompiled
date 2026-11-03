package e4;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: loaded from: classes.dex */
public class v implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FragmentManager f15776a;

    public class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.g f15777a;

        public a(androidx.fragment.app.g gVar) {
            this.f15777a = gVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            androidx.fragment.app.c cVarK = this.f15777a.k();
            this.f15777a.m();
            androidx.fragment.app.i.u((ViewGroup) cVarK.K.getParent(), v.this.f15776a).q();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public v(FragmentManager fragmentManager) {
        this.f15776a = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        androidx.fragment.app.g gVarA;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f15776a);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d4.c.f14410a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(d4.c.b);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(d4.c.f14411c, -1);
        String string = typedArrayObtainStyledAttributes.getString(d4.c.f14412d);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !androidx.fragment.app.e.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id2 = view != null ? view.getId() : 0;
        if (id2 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        androidx.fragment.app.c cVarM0 = resourceId != -1 ? this.f15776a.m0(resourceId) : null;
        if (cVarM0 == null && string != null) {
            cVarM0 = this.f15776a.n0(string);
        }
        if (cVarM0 == null && id2 != -1) {
            cVarM0 = this.f15776a.m0(id2);
        }
        if (cVarM0 == null) {
            cVarM0 = this.f15776a.y0().a(context.getClassLoader(), attributeValue);
            cVarM0.f2459p = true;
            cVarM0.f2469z = resourceId != 0 ? resourceId : id2;
            cVarM0.A = id2;
            cVarM0.B = string;
            cVarM0.f2460q = true;
            FragmentManager fragmentManager = this.f15776a;
            cVarM0.f2465v = fragmentManager;
            cVarM0.f2466w = fragmentManager.A0();
            cVarM0.R0(this.f15776a.A0().getContext(), attributeSet, cVarM0.b);
            gVarA = this.f15776a.l(cVarM0);
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "Fragment " + cVarM0 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            if (cVarM0.f2460q) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
            }
            cVarM0.f2460q = true;
            FragmentManager fragmentManager2 = this.f15776a;
            cVarM0.f2465v = fragmentManager2;
            cVarM0.f2466w = fragmentManager2.A0();
            cVarM0.R0(this.f15776a.A0().getContext(), attributeSet, cVarM0.b);
            gVarA = this.f15776a.A(cVarM0);
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + cVarM0 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        f4.c.g(cVarM0, viewGroup);
        cVarM0.J = viewGroup;
        gVarA.m();
        gVarA.j();
        View view2 = cVarM0.K;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (cVarM0.K.getTag() == null) {
            cVarM0.K.setTag(string);
        }
        cVarM0.K.addOnAttachStateChangeListener(new a(gVarA));
        return cVarM0.K;
    }
}
