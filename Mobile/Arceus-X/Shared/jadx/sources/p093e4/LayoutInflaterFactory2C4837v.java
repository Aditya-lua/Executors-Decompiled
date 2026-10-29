package p093e4;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.AbstractC0935i;
import androidx.fragment.app.C0931e;
import androidx.fragment.app.C0933g;
import androidx.fragment.app.ComponentCallbacksC0929c;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import p067d4.C4436c;
import p118f4.C5348c;

/* JADX INFO: renamed from: e4.v */
/* JADX INFO: loaded from: classes.dex */
public class LayoutInflaterFactory2C4837v implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a */
    public final FragmentManager f19514a;

    /* JADX INFO: renamed from: e4.v$a */
    public class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0933g f19515a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(C0933g c0933g) {
            this.f19515a = c0933g;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            ComponentCallbacksC0929c componentCallbacksC0929cM4764k = this.f19515a.m4764k();
            this.f19515a.m4766m();
            AbstractC0935i.m4791u((ViewGroup) componentCallbacksC0929cM4764k.f3418K.getParent(), LayoutInflaterFactory2C4837v.this.f19514a).m4808q();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public LayoutInflaterFactory2C4837v(FragmentManager fragmentManager) {
        this.f19514a = fragmentManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        C0933g c0933gM4364A;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f19514a);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4436c.f18440a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(C4436c.f18441b);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C4436c.f18442c, -1);
        String string = typedArrayObtainStyledAttributes.getString(C4436c.f18443d);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !C0931e.m4735b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id2 = view != null ? view.getId() : 0;
        if (id2 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        ComponentCallbacksC0929c componentCallbacksC0929cM4441m0 = resourceId != -1 ? this.f19514a.m4441m0(resourceId) : null;
        if (componentCallbacksC0929cM4441m0 == null && string != null) {
            componentCallbacksC0929cM4441m0 = this.f19514a.m4444n0(string);
        }
        if (componentCallbacksC0929cM4441m0 == null && id2 != -1) {
            componentCallbacksC0929cM4441m0 = this.f19514a.m4441m0(id2);
        }
        if (componentCallbacksC0929cM4441m0 == null) {
            componentCallbacksC0929cM4441m0 = this.f19514a.m4474y0().mo4483a(context.getClassLoader(), attributeValue);
            componentCallbacksC0929cM4441m0.f3453p = true;
            componentCallbacksC0929cM4441m0.f3463z = resourceId != 0 ? resourceId : id2;
            componentCallbacksC0929cM4441m0.f3408A = id2;
            componentCallbacksC0929cM4441m0.f3409B = string;
            componentCallbacksC0929cM4441m0.f3454q = true;
            FragmentManager fragmentManager = this.f19514a;
            componentCallbacksC0929cM4441m0.f3459v = fragmentManager;
            componentCallbacksC0929cM4441m0.f3460w = fragmentManager.m4365A0();
            componentCallbacksC0929cM4441m0.m4632R0(this.f19514a.m4365A0().getContext(), attributeSet, componentCallbacksC0929cM4441m0.f3436b);
            c0933gM4364A = this.f19514a.m4437l(componentCallbacksC0929cM4441m0);
            if (FragmentManager.m4349N0(2)) {
                Log.v("FragmentManager", "Fragment " + componentCallbacksC0929cM4441m0 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            if (componentCallbacksC0929cM4441m0.f3454q) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
            }
            componentCallbacksC0929cM4441m0.f3454q = true;
            FragmentManager fragmentManager2 = this.f19514a;
            componentCallbacksC0929cM4441m0.f3459v = fragmentManager2;
            componentCallbacksC0929cM4441m0.f3460w = fragmentManager2.m4365A0();
            componentCallbacksC0929cM4441m0.m4632R0(this.f19514a.m4365A0().getContext(), attributeSet, componentCallbacksC0929cM4441m0.f3436b);
            c0933gM4364A = this.f19514a.m4364A(componentCallbacksC0929cM4441m0);
            if (FragmentManager.m4349N0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + componentCallbacksC0929cM4441m0 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        C5348c.m24677g(componentCallbacksC0929cM4441m0, viewGroup);
        componentCallbacksC0929cM4441m0.f3417J = viewGroup;
        c0933gM4364A.m4766m();
        c0933gM4364A.m4763j();
        View view2 = componentCallbacksC0929cM4441m0.f3418K;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (componentCallbacksC0929cM4441m0.f3418K.getTag() == null) {
            componentCallbacksC0929cM4441m0.f3418K.setTag(string);
        }
        componentCallbacksC0929cM4441m0.f3418K.addOnAttachStateChangeListener(new a(c0933gM4364A));
        return componentCallbacksC0929cM4441m0.f3418K;
    }
}
